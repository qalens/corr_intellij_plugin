package com.qalens.corr.lang.core.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.qalens.corr.lang.core.psi.JrnTokenType;import kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import static com.qalens.corr.lang.core.psi.JrnElementTypes.*;
import static com.intellij.psi.TokenType.*;
import java.net.URL;import java.util.*;

%%
%{
  Stack<String> jsonStack = new Stack<String>();
  Stack<Integer> state = new Stack<Integer>();
  public boolean textStarted = false;

  public JourneyLexer() {
    this((java.io.Reader)null);
  }


  public void pushState(Integer newState){
      state.push(yystate());
      yybegin(newState);
  }
  public void popState(){
        yybegin(state.pop());
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
TEXT_LITERAL = ( [^\\<`] | \\[\\<`] )+
IDENTIFIER = [_\p{xidstart}][\p{xidcontinue}]*
NAME = [`] [^`]* [`]

///////////////////////////////////////////////////////////////////////////////////////////////////
// Literals
///////////////////////////////////////////////////////////////////////////////////////////////////

ESCAPE_SEQUENCE=\\[^\r\n]
STRING_LITERAL = \"([^\\\"\r\n]|{ESCAPE_SEQUENCE}|{WHITE_SPACE_CHAR})*(\"|\\)?
POSITIVE_INTEGER_LITERAL = ([1-9] [0-9]*) | 0
INTEGER_LITERAL = ([-]?[1-9] [0-9]*)
DOUBLE_LITERAL = ([0-9]* [\.] [0-9]*)
%s IN_TEXT_TEMPLATE,IN_SCRIPLET,IN_STRING,IN_TEXT
%%
<YYINITIAL> {
    "print"                         { return PRINT; }
    "matching"                      { return MATCHING; }
    "and"                      { return AND; }
    "url"                      { return URL; }
    "body"                      { return BODY; }
    "headers"                      { return HEADERS; }
    "request"                      { return REQUEST; }
    "get"                      { return GET; }
    "put"                      { return PUT; }
    "post"                      { return POST; }
    "patch"                      { return PATCH; }
    "delete"                      { return DELETE; }
    "text"                          { pushState(IN_TEXT);return TEXT;}
    "object"                        { return OBJECT_TEMPLATE;}
    "let"                           { return LET;}
    "="                             { return ASSIGN;}
    {NAME}                          { return NAME; }

}
<IN_TEXT>{
    "`"                             { pushState(IN_TEXT_TEMPLATE); return BACKTICK;}
    {WHITE_SPACE}                   { return WHITE_SPACE; }
}
<IN_TEXT_TEMPLATE>{
    "`"                             { popState();
                                        popState();
                                        return BACKTICK; }
    "<%"                            { pushState(IN_SCRIPLET);return SCRIPLET_START; }
    {TEXT_LITERAL}                  { return TEXT_LITERAL; }
}

<YYINITIAL,IN_SCRIPLET> {
    "."                             {return DOT;}
    "{"                             { return LBRACE; }
    "}"                             { return RBRACE; }
    "["                             { return LBRACK; }
    "]"                             { return RBRACK; }
    "("                             { return LPAREN; }
    ")"                             { return RPAREN; }
    ":"                             { return COLON; }
    ";"                             { return SEMICOLON; }
    "for"                           { return FOR;}
    "=>"                            { return FATARROW;}
    "null"                          { return NULLVALUE;}
    "true"                          { return BOOLEANVALUE;}
    "false"                         { return BOOLEANVALUE;}
    "True"                          { return BOOLEANVALUE;}
    "False"                         { return BOOLEANVALUE;}
    "TRUE"                          { return BOOLEANVALUE;}
    "FALSE"                         { return BOOLEANVALUE;}
    "String"                        { return STRING;}
    "PositiveInteger"               { return POSITIVE_INTEGER;}
    "Integer"                       { return INTEGER;}
    "Boolean"                       { return BOOL;}
    ","                             { return COMMA; }
    "concat" / [(]                        { return CONCAT;}
    "from_json"  / [(]                   { return FROMJSON;}
    "mul"  / [(]                         { return MUL;}
    "add"  / [(]                         { return ADD;}
    "sub"  / [(]                         { return SUB;}
    "div"  / [(]                         { return DIV;}
    "uuid" / [(]                         { return UUID;}
    "fake" / [(]                         { return FAKE; }
    "encode"  / [(]                      { return ENCODE; }
    "random"  / [(]                      { return RANDOM;}
    "round"  / [(]                       { return ROUND;}
    {STRING_LITERAL}                             { return STRING_LITERAL; }
    {POSITIVE_INTEGER_LITERAL} / [^\.]          { return POSITIVEINTEGERVALUE;}
    {INTEGER_LITERAL} / [^\.]                   { return INETEGERVALUE;}
    {DOUBLE_LITERAL}                            { return DOUBLEVALUE ;}
    {IDENTIFIER}                    { return IDENTIFIER; }
    {WHITE_SPACE}                   { return WHITE_SPACE; }

}
<IN_SCRIPLET>{
    "%>"                            { popState(); return SCRIPLET_END; }
}



[^] { return BAD_CHARACTER; }
