package com.qalens.corr.lang.core.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;import com.intellij.psi.tree.IElementType;
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
InputCharacter = [^\r\n]
BLOCK_COMMENT   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
LINE_COMMENT     = "//" {InputCharacter}* {EOL_WS}?

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
    "respond"                      { return RESPOND; }
    "status"                      { return STATUS; }
    "on"                      { return ON; }
    "push"                      { return PUSH; }
    "listen"                      { return LISTEN; }
    "with"                      { return WITH; }
    "sync"                      { return SYNC; }
    "async"                      { return ASYNC; }
    "get"                      { return GET; }
    "put"                      { return PUT; }
    "post"                      { return POST; }
    "form"                      { return FORM; }
    "patch"                      { return PATCH; }
    "delete"                      { return DELETE; }
    "text"                          { pushState(IN_TEXT);return TEXT;}
    "object"                        { return OBJECT_TEMPLATE;}
    "let"                           { return LET;}
    "sandbox"                           { return SANDBOX;}
    "load"                           { return LOAD;}
    "from"                           { return FROM;}
    "to"                           { return TO;}
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
    "--"                            { return OP_DECREMENT;}
    "++"                            { return OP_INCREMENT;}
    "=="                            { return OP_EQUAL;}
    "!="                            { return OP_NOTEQUAL;}
    "+"                             { return OP_PLUS; }
    "-"                             { return OP_MINUS;}
    "/"                             { return OP_DIVIDE;}
    "*"                             { return OP_MULTIPLY;}
    "%"                             { return OP_MOD;}
    ":"                             { return COLON; }
    ";"                             { return SEMICOLON; }
    "for"                           { return FOR;}
    "if"                            { return IF;}
    "else"                          { return ELSE;}
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
    "Double"                        { return DOUBLE;}
    "Integer"                       { return INTEGER;}
    "Boolean"                       { return BOOL;}
    ","                             { return COMMA; }
    "concat" / [(]                        { return CONCAT;}
    "lpad" / [(]                        { return LPAD;}
    "rpad" / [(]                        { return RPAD;}
    "left" / [(]                        { return LEFT;}
    "right" / [(]                        { return RIGHT;}
    "mid" / [(]                        { return MID;}
    "contains" / [(]                        { return CONTAINS;}
    "from_json"  / [(]                   { return FROMJSON;}
    "mul"  / [(]                         { return MUL;}
    "add"  / [(]                         { return ADD;}
    "now"  / [(]                         { return NOW;}
    "timestamp"  / [(]                   { return TIMESTAMP;}
    "sub"  / [(]                         { return SUB;}
    "div"  / [(]                         { return DIV;}
    "uuid" / [(]                         { return UUID;}
    "fake" / [(]                         { return FAKE; }
    "encode"  / [(]                      { return ENCODE; }
    "mod"  / [(]                         { return MOD; }
    "random"  / [(]                      { return RANDOM;}
    "random_element"  / [(]                      { return RANDOMELEMENT;}
    "round"  / [(]                       { return ROUND;}
    {STRING_LITERAL}                             { return STRING_LITERAL; }
    {POSITIVE_INTEGER_LITERAL} / [^\.]          { return POSITIVEINTEGERVALUE;}
    {INTEGER_LITERAL} / [^\.]                   { return INETEGERVALUE;}
    {DOUBLE_LITERAL}                            { return DOUBLEVALUE ;}
    {IDENTIFIER}                    { return IDENTIFIER; }
    {LINE_COMMENT}                       { return LINE_COMMENT; }
    {BLOCK_COMMENT}                       { return BLOCK_COMMENT; }
    {WHITE_SPACE}                   { return WHITE_SPACE; }


}
<IN_SCRIPLET>{
    "%>"                            { popState(); return SCRIPLET_END; }
}



[^] { return BAD_CHARACTER; }
