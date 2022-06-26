package com.qalens.corr.lang.core.wl.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;import com.intellij.psi.tree.IElementType;
import com.qalens.corr.lang.core.wl.psi.WlTokenType;
import static com.qalens.corr.lang.core.wl.psi.WlElementTypes.*;
import static com.intellij.psi.TokenType.*;
import java.net.URL;import java.util.*;

%%
%{
  Stack<String> jsonStack = new Stack<String>();
  Stack<Integer> state = new Stack<Integer>();
  public boolean textStarted = false;

  public WorkloadLexer() {
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

%class WorkloadLexer
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
NAME = [`] [^`]* [`]
///////////////////////////////////////////////////////////////////////////////////////////////////
// Literals
///////////////////////////////////////////////////////////////////////////////////////////////////
ESCAPE_SEQUENCE=\\[^\r\n]
STRING_LITERAL = \"([^\\\"\r\n]|{ESCAPE_SEQUENCE}|{WHITE_SPACE_CHAR})*(\"|\\)?
POSITIVE_INTEGER_LITERAL = ([1-9] [0-9]*) | 0
BLOCK_COMMENT   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
InputCharacter = [^\r\n]
LINE_COMMENT     = "//" {InputCharacter}* {EOL_WS}?

%%
<YYINITIAL> {
    "journey"                                       { return JOURNEY; }
    "executor"                                      { return EXECUTOR; }
    "scenarios"                                     { return SCENARIOS; }
    "startup"                                       { return STARTUP; }
    "stages"                                        { return STAGES; }
    ":"                                             { return COLON; }
    ","                                             { return COMMA; }
    "{"                                             { return LBRACE; }
    "}"                                             { return RBRACE; }
    "["                                             { return LBRACK; }
    "]"                                             { return RBRACK; }
    "("                                             { return LPAREN; }
    ")"                                             { return RPAREN; }
    {POSITIVE_INTEGER_LITERAL} / [^\.]              { return POSITIVEINTEGERVALUE;}
    {NAME}                                          { return NAME; }
    {STRING_LITERAL}                                { return STRING_LITERAL; }
    {LINE_COMMENT}                                  { return LINE_COMMENT; }
    {BLOCK_COMMENT}                                 { return BLOCK_COMMENT; }
    {WHITE_SPACE}                                   { return WHITE_SPACE; }

}
[^]                                                { return BAD_CHARACTER; }
