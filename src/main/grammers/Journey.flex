package com.qalens.corr.lang.core.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import static com.qalens.corr.lang.core.psi.JrnElementTypes.*;
import static com.intellij.psi.TokenType.*;
import java.util.*;

%%
%{
  Stack<String> jsonStack = new Stack<String>();
  Stack<Integer> state = new Stack<Integer>();
  public boolean textStarted = false;

  public JourneyLexer() {
    this((java.io.Reader)null);
  }
  public void pushJson(String type){
      jsonStack.push(type);
  }
  public boolean popJson(){
        jsonStack.pop();
        return jsonStack.isEmpty();
  }
  public void pushState(){
      state.push(yystate());
  }
  public Integer popState(){
        return state.pop();
  }
%}

%class JourneyLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}
%unicode


///////////////////////////////////////////////////////////////////////////////////////////////////
// Whitespaces
///////////////////////////////////////////////////////////////////////////////////////////////////

EOL_WS           = \n | \r | \r\n
LINE_WS          = [\ \t]
WHITE_SPACE_CHAR = {EOL_WS} | {LINE_WS}
WHITE_SPACE      = {WHITE_SPACE_CHAR}+

///////////////////////////////////////////////////////////////////////////////////////////////////
// Identifier
///////////////////////////////////////////////////////////////////////////////////////////////////
TEXT_LITERAL = ( [^\\\{\<$\")] | \\[^] )+
IDENTIFIER = [_\p{xidstart}][\p{xidcontinue}]* ([\.]  [_\p{xidstart}][\p{xidcontinue}]*)*
NAME = [`] ([^`] | [\`])* [`]

///////////////////////////////////////////////////////////////////////////////////////////////////
// Literals
///////////////////////////////////////////////////////////////////////////////////////////////////

ESCAPE_SEQUENCE=\\[^\r\n]
STRING_LITERAL = \"([^\\\"\r\n]|{ESCAPE_SEQUENCE})*(\"|\\)?
LONG_LITERAL = ([1-9] [0-9]*)
%s IN_TEXT_TEMPLATE,IN_TEXT_SCRIPLET,IN_TEXT_FOR_SCRIPLET,IN_JSON_TEMPLATE,IN_JSON_SCRIPLET,IN_JSON_FOR_SCRIPLET
%%
<YYINITIAL> {

    "{"                             { return LBRACE; }
    "}"                             { return RBRACE; }
    "("                             { return LPAREN; }
    ")"                             { return RPAREN; }
    "["                             { return LBRACK; }
    "]"                             { return RBRACK; }
    ":"                             { return COLON; }
    ";"                             { return SEMICOLON; }
    "post"                          { return RESTMETHOD; }
    "get"                          { return RESTMETHOD; }
    "put"                          { return RESTMETHOD; }
    "patch"                        { return RESTMETHOD; }
    "delete"                       { return RESTMETHOD; }
    "print"                       { return SYSTEMMETHOD; }
    "true"                         { return BOOLEANVALUE;}
    "false"                        { return BOOLEANVALUE;}
    "True"                         { return BOOLEANVALUE;}
    "False"                        { return BOOLEANVALUE;}
    "TRUE"                         { return BOOLEANVALUE;}
    "FALSE"                        { return BOOLEANVALUE;}
    "String"                        { return STRING;}
    "Long"                          { return LONG;}
    "List"                          { return LIST;}
    "Object"                          { return OBJECT;}
    "@text"                       { yybegin(IN_TEXT_TEMPLATE);return TEXTSTART;}
    "@json"                         { yybegin(IN_JSON_TEMPLATE);return JSONSTART; }
    "@map"                         { return MAPSTART; }
    "@nil"                         { return NILVALUE; }
    "@ejson"                        { yybegin(IN_JSON_TEMPLATE);return EJSONSTART; }
    "times"                         { return TIMES;}
    "for"                             { return FOR; }
    "in"                             { return IN; }
    "{{"                            { return SCRIPLET_START; }
    ","                             { return COMMA; }
    "<%"                         { return FOR_SCRIPLET_START; }
    "("                             { return LPAREN; }
    ")"                             { return RPAREN; }
    "}}"                            {return SCRIPLET_END; }
    "("                             { return LPAREN; }
    ")"                             { return RPAREN; }
    ","                             { return COMMA; }
    "%>"                            { return FOR_SCRIPLET_END; }
    {LONG_LITERAL}                  { return LONGVALUE;}
    {STRING_LITERAL}                { return STRING_LITERAL; }
    {IDENTIFIER}                    { return IDENTIFIER; }
    {NAME}                          { return NAME; }
    {WHITE_SPACE}                   { return WHITE_SPACE; }
}
<IN_TEXT_TEMPLATE>{
    "\""                             { if(textStarted){
                                            textStarted = false;
                                        yybegin(YYINITIAL);
                                        } else {
                                            textStarted = true;
                                        }
                                        return QUOTE; }
    "{{"                            { yybegin(IN_TEXT_SCRIPLET);return SCRIPLET_START; }
    "<%"                            { yybegin(IN_TEXT_FOR_SCRIPLET);return FOR_SCRIPLET_START; }
    {TEXT_LITERAL}                  { return TEXT_LITERAL; }
}
<IN_TEXT_SCRIPLET>{
    "("                             { return LPAREN; }
    ")"                             { return RPAREN; }
    ":"                             { return COLON; }
    ","                             { return COMMA; }
    "true"                        { return BOOLEANVALUE;}
    "false"                       { return BOOLEANVALUE;}
    "True"                        { return BOOLEANVALUE;}
    "False"                        { return BOOLEANVALUE;}
    "TRUE"                        { return BOOLEANVALUE;}
    "FALSE"                        { return BOOLEANVALUE;}
    "String"                        { return STRING;}
    "Long"                          { return LONG;}
    "List"                          { return LIST;}
    "Object"                          { return OBJECT;}
    ","                             { return COMMA; }
    "}}"                            {yybegin(IN_TEXT_TEMPLATE);return SCRIPLET_END; }
    {LONG_LITERAL}                  { return LONGVALUE;}
    {STRING_LITERAL}                { return STRING_LITERAL; }
    {IDENTIFIER}                    { return IDENTIFIER; }
    {WHITE_SPACE}                   { return WHITE_SPACE; }
}
<IN_TEXT_FOR_SCRIPLET>{
    "("                             { return LPAREN; }
    ")"                             { return RPAREN; }
    "{"                             { return LBRACE; }
    "}"                             { return RBRACE; }
    ":"                             { return COLON; }
    ","                             { return COMMA; }
    "true"                        { return BOOLEANVALUE;}
    "false"                       { return BOOLEANVALUE;}
    "True"                        { return BOOLEANVALUE;}
    "False"                        { return BOOLEANVALUE;}
    "TRUE"                        { return BOOLEANVALUE;}
    "FALSE"                        { return BOOLEANVALUE;}
    "String"                        { return STRING;}
    "Long"                          { return LONG;}
    "List"                          { return LIST;}
    "Object"                          { return OBJECT;}
    "for"                             { return FOR; }
    "in"                             { return IN; }
    "%>"                            { yybegin(IN_TEXT_TEMPLATE);return FOR_SCRIPLET_END; }
    {LONG_LITERAL}                  { return LONGVALUE;}
    {STRING_LITERAL}                { return STRING_LITERAL; }
    {IDENTIFIER}                    { return IDENTIFIER; }
    {WHITE_SPACE}                   { return WHITE_SPACE; }
}
<IN_JSON_TEMPLATE>{
    "{"                             { pushJson("{"); return LBRACE; }
    "}"                             { if(popJson()) yybegin(YYINITIAL); return RBRACE; }
    "["                             { pushJson("[");return LBRACK; }
    "]"                             { if(popJson()) yybegin(YYINITIAL); return RBRACK; }
    ":"                             { return COLON; }
    "true"                        { return BOOLEANVALUE;}
    "false"                       { return BOOLEANVALUE;}
    "True"                        { return BOOLEANVALUE;}
    "False"                        { return BOOLEANVALUE;}
    "TRUE"                        { return BOOLEANVALUE;}
    "FALSE"                        { return BOOLEANVALUE;}
    "{{"                            { pushJson("{{"); yybegin(IN_JSON_SCRIPLET);return SCRIPLET_START; }
    ","                             { return COMMA; }
    "<%"                         { pushJson("<%"); yybegin(IN_JSON_FOR_SCRIPLET);return FOR_SCRIPLET_START; }
    ","                             { return COMMA; }
    {LONG_LITERAL}                  { return LONGVALUE;}
    {STRING_LITERAL}                { return STRING_LITERAL; }
    {WHITE_SPACE}                   { return WHITE_SPACE; }
}
<IN_JSON_SCRIPLET>{
    "("                             { return LPAREN; }
    ")"                             { return RPAREN; }
    ":"                             { return COLON; }
    ","                             { return COMMA; }
    "true"                        { return BOOLEANVALUE;}
    "false"                       { return BOOLEANVALUE;}
    "True"                        { return BOOLEANVALUE;}
    "False"                        { return BOOLEANVALUE;}
    "TRUE"                        { return BOOLEANVALUE;}
    "FALSE"                        { return BOOLEANVALUE;}
    "String"                        { return STRING;}
    "Long"                          { return LONG;}
    "List"                          { return LIST;}
    "Object"                          { return OBJECT;}
    ","                             { return COMMA; }
    "}}"                            {if(popJson()) yybegin(YYINITIAL); else yybegin(IN_JSON_TEMPLATE);return SCRIPLET_END; }
    {LONG_LITERAL}                  { return LONGVALUE;}
    {STRING_LITERAL}                { return STRING_LITERAL; }
    {IDENTIFIER}                    { return IDENTIFIER; }
    {WHITE_SPACE}                   { return WHITE_SPACE; }
}
<IN_JSON_FOR_SCRIPLET>{
    "("                             { return LPAREN; }
    ")"                             { return RPAREN; }
    "{"                             { return LBRACE; }
    "}"                             { return RBRACE; }
    ":"                             { return COLON; }
    ","                             { return COMMA; }
    "true"                        { return BOOLEANVALUE;}
    "false"                       { return BOOLEANVALUE;}
    "True"                        { return BOOLEANVALUE;}
    "False"                        { return BOOLEANVALUE;}
    "TRUE"                        { return BOOLEANVALUE;}
    "FALSE"                        { return BOOLEANVALUE;}
    "String"                        { return STRING;}
    "Long"                          { return LONG;}
    "List"                          { return LIST;}
    "Object"                          { return OBJECT;}
    "for"                             { return FOR; }
    "in"                             { return IN; }
    "%>"                            { if(popJson()) yybegin(YYINITIAL); else yybegin(IN_JSON_TEMPLATE);return FOR_SCRIPLET_END; }
    {LONG_LITERAL}                  { return LONGVALUE;}
    {STRING_LITERAL}                { return STRING_LITERAL; }
    {IDENTIFIER}                    { return IDENTIFIER; }
    {WHITE_SPACE}                   { return WHITE_SPACE; }
}
[^] { return BAD_CHARACTER; }
