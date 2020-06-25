// This is a generated file. Not intended for manual editing.
package com.qalens.corr.lang.core.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.qalens.corr.lang.core.psi.JrnElementTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class JourneyParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return journeyFile(b, l + 1);
  }

  /* ********************************************************** */
  // identifier ':' Value
  public static boolean Argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Argument")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && Value(b, l + 1);
    exit_section_(b, m, ARGUMENT, r);
    return r;
  }

  /* ********************************************************** */
  // DefinedMethod '(' (Argument ',')* Argument? ')'';'
  public static boolean DefinedFnCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefinedFnCall")) return false;
    if (!nextTokenIs(b, "<defined fn call>", RESTMETHOD, SYSTEMMETHOD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFINED_FN_CALL, "<defined fn call>");
    r = DefinedMethod(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && DefinedFnCall_2(b, l + 1);
    r = r && DefinedFnCall_3(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (Argument ',')*
  private static boolean DefinedFnCall_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefinedFnCall_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DefinedFnCall_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DefinedFnCall_2", c)) break;
    }
    return true;
  }

  // Argument ','
  private static boolean DefinedFnCall_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefinedFnCall_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Argument(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // Argument?
  private static boolean DefinedFnCall_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefinedFnCall_3")) return false;
    Argument(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // RestMethod | SystemMethod
  public static boolean DefinedMethod(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefinedMethod")) return false;
    if (!nextTokenIs(b, "<defined method>", RESTMETHOD, SYSTEMMETHOD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFINED_METHOD, "<defined method>");
    r = consumeToken(b, RESTMETHOD);
    if (!r) r = consumeToken(b, SYSTEMMETHOD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FOR '('(identifier (':' Type) IN identifier (':' Type)?) ')' LBRACE (EFOR_LOOP | EFOR_VALUE_SCRIPTLET) RBRACE
  public static boolean EFOR_LOOP(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EFOR_LOOP")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR, LPAREN);
    r = r && EFOR_LOOP_2(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, LBRACE);
    r = r && EFOR_LOOP_5(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, EFOR_LOOP, r);
    return r;
  }

  // identifier (':' Type) IN identifier (':' Type)?
  private static boolean EFOR_LOOP_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EFOR_LOOP_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && EFOR_LOOP_2_1(b, l + 1);
    r = r && consumeTokens(b, 0, IN, IDENTIFIER);
    r = r && EFOR_LOOP_2_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':' Type
  private static boolean EFOR_LOOP_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EFOR_LOOP_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (':' Type)?
  private static boolean EFOR_LOOP_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EFOR_LOOP_2_4")) return false;
    EFOR_LOOP_2_4_0(b, l + 1);
    return true;
  }

  // ':' Type
  private static boolean EFOR_LOOP_2_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EFOR_LOOP_2_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EFOR_LOOP | EFOR_VALUE_SCRIPTLET
  private static boolean EFOR_LOOP_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EFOR_LOOP_5")) return false;
    boolean r;
    r = EFOR_LOOP(b, l + 1);
    if (!r) r = EFOR_VALUE_SCRIPTLET(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // FOR_SCRIPLET_END EJsonTemplate FOR_SCRIPLET_START
  public static boolean EFOR_VALUE_SCRIPTLET(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EFOR_VALUE_SCRIPTLET")) return false;
    if (!nextTokenIs(b, FOR_SCRIPLET_END)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR_SCRIPLET_END);
    r = r && EJsonTemplate(b, l + 1);
    r = r && consumeToken(b, FOR_SCRIPLET_START);
    exit_section_(b, m, EFOR_VALUE_SCRIPTLET, r);
    return r;
  }

  /* ********************************************************** */
  // '[' ((FOR_SCRIPLET_START EFOR_LOOP FOR_SCRIPLET_END) | ((EJsonTemplate ',')* EJsonTemplate))?']'
  public static boolean EJsonArray(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EJsonArray")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && EJsonArray_1(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, E_JSON_ARRAY, r);
    return r;
  }

  // ((FOR_SCRIPLET_START EFOR_LOOP FOR_SCRIPLET_END) | ((EJsonTemplate ',')* EJsonTemplate))?
  private static boolean EJsonArray_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EJsonArray_1")) return false;
    EJsonArray_1_0(b, l + 1);
    return true;
  }

  // (FOR_SCRIPLET_START EFOR_LOOP FOR_SCRIPLET_END) | ((EJsonTemplate ',')* EJsonTemplate)
  private static boolean EJsonArray_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EJsonArray_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EJsonArray_1_0_0(b, l + 1);
    if (!r) r = EJsonArray_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // FOR_SCRIPLET_START EFOR_LOOP FOR_SCRIPLET_END
  private static boolean EJsonArray_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EJsonArray_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR_SCRIPLET_START);
    r = r && EFOR_LOOP(b, l + 1);
    r = r && consumeToken(b, FOR_SCRIPLET_END);
    exit_section_(b, m, null, r);
    return r;
  }

  // (EJsonTemplate ',')* EJsonTemplate
  private static boolean EJsonArray_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EJsonArray_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EJsonArray_1_0_1_0(b, l + 1);
    r = r && EJsonTemplate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (EJsonTemplate ',')*
  private static boolean EJsonArray_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EJsonArray_1_0_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!EJsonArray_1_0_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EJsonArray_1_0_1_0", c)) break;
    }
    return true;
  }

  // EJsonTemplate ','
  private static boolean EJsonArray_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EJsonArray_1_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EJsonTemplate(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' (EJsonPair ',')* EJsonPair? '}'
  public static boolean EJsonObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EJsonObject")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && EJsonObject_1(b, l + 1);
    r = r && EJsonObject_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, E_JSON_OBJECT, r);
    return r;
  }

  // (EJsonPair ',')*
  private static boolean EJsonObject_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EJsonObject_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!EJsonObject_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EJsonObject_1", c)) break;
    }
    return true;
  }

  // EJsonPair ','
  private static boolean EJsonObject_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EJsonObject_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EJsonPair(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // EJsonPair?
  private static boolean EJsonObject_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EJsonObject_2")) return false;
    EJsonPair(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // STRING_LITERAL ':' (EScriplet | EJsonArray | EJsonObject)
  public static boolean EJsonPair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EJsonPair")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STRING_LITERAL, COLON);
    r = r && EJsonPair_2(b, l + 1);
    exit_section_(b, m, E_JSON_PAIR, r);
    return r;
  }

  // EScriplet | EJsonArray | EJsonObject
  private static boolean EJsonPair_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EJsonPair_2")) return false;
    boolean r;
    r = EScriplet(b, l + 1);
    if (!r) r = EJsonArray(b, l + 1);
    if (!r) r = EJsonObject(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // EScriplet | EJsonArray | EJsonObject
  public static boolean EJsonTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EJsonTemplate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, E_JSON_TEMPLATE, "<e json template>");
    r = EScriplet(b, l + 1);
    if (!r) r = EJsonArray(b, l + 1);
    if (!r) r = EJsonObject(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EjsonStart EJsonTemplate
  public static boolean EJsonTemplateValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EJsonTemplateValue")) return false;
    if (!nextTokenIs(b, EJSONSTART)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EJSONSTART);
    r = r && EJsonTemplate(b, l + 1);
    exit_section_(b, m, E_JSON_TEMPLATE_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // SCRIPLET_START identifier (':' Type)? SCRIPLET_END
  public static boolean EScriplet(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EScriplet")) return false;
    if (!nextTokenIs(b, SCRIPLET_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SCRIPLET_START, IDENTIFIER);
    r = r && EScriplet_2(b, l + 1);
    r = r && consumeToken(b, SCRIPLET_END);
    exit_section_(b, m, E_SCRIPLET, r);
    return r;
  }

  // (':' Type)?
  private static boolean EScriplet_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EScriplet_2")) return false;
    EScriplet_2_0(b, l + 1);
    return true;
  }

  // ':' Type
  private static boolean EScriplet_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EScriplet_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier ((':' Type) | ('(' ( STRING_LITERAL | LongValue | BooleanValue| Expression) ( ',' (STRING_LITERAL | LongValue | BooleanValue | Expression))* ')'))?
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && Expression_1(b, l + 1);
    exit_section_(b, m, EXPRESSION, r);
    return r;
  }

  // ((':' Type) | ('(' ( STRING_LITERAL | LongValue | BooleanValue| Expression) ( ',' (STRING_LITERAL | LongValue | BooleanValue | Expression))* ')'))?
  private static boolean Expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1")) return false;
    Expression_1_0(b, l + 1);
    return true;
  }

  // (':' Type) | ('(' ( STRING_LITERAL | LongValue | BooleanValue| Expression) ( ',' (STRING_LITERAL | LongValue | BooleanValue | Expression))* ')')
  private static boolean Expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression_1_0_0(b, l + 1);
    if (!r) r = Expression_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':' Type
  private static boolean Expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' ( STRING_LITERAL | LongValue | BooleanValue| Expression) ( ',' (STRING_LITERAL | LongValue | BooleanValue | Expression))* ')'
  private static boolean Expression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && Expression_1_0_1_1(b, l + 1);
    r = r && Expression_1_0_1_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING_LITERAL | LongValue | BooleanValue| Expression
  private static boolean Expression_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1_0_1_1")) return false;
    boolean r;
    r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, LONGVALUE);
    if (!r) r = consumeToken(b, BOOLEANVALUE);
    if (!r) r = Expression(b, l + 1);
    return r;
  }

  // ( ',' (STRING_LITERAL | LongValue | BooleanValue | Expression))*
  private static boolean Expression_1_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1_0_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Expression_1_0_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Expression_1_0_1_2", c)) break;
    }
    return true;
  }

  // ',' (STRING_LITERAL | LongValue | BooleanValue | Expression)
  private static boolean Expression_1_0_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1_0_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression_1_0_1_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING_LITERAL | LongValue | BooleanValue | Expression
  private static boolean Expression_1_0_1_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1_0_1_2_0_1")) return false;
    boolean r;
    r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, LONGVALUE);
    if (!r) r = consumeToken(b, BOOLEANVALUE);
    if (!r) r = Expression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // FOR '('(identifier (':' Type) IN identifier (':' Type)?) ')' LBRACE (FOR_LOOP | FOR_VALUE_SCRIPTLET) RBRACE
  public static boolean FOR_LOOP(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_LOOP")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR, LPAREN);
    r = r && FOR_LOOP_2(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, LBRACE);
    r = r && FOR_LOOP_5(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, FOR_LOOP, r);
    return r;
  }

  // identifier (':' Type) IN identifier (':' Type)?
  private static boolean FOR_LOOP_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_LOOP_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && FOR_LOOP_2_1(b, l + 1);
    r = r && consumeTokens(b, 0, IN, IDENTIFIER);
    r = r && FOR_LOOP_2_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':' Type
  private static boolean FOR_LOOP_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_LOOP_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (':' Type)?
  private static boolean FOR_LOOP_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_LOOP_2_4")) return false;
    FOR_LOOP_2_4_0(b, l + 1);
    return true;
  }

  // ':' Type
  private static boolean FOR_LOOP_2_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_LOOP_2_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // FOR_LOOP | FOR_VALUE_SCRIPTLET
  private static boolean FOR_LOOP_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_LOOP_5")) return false;
    boolean r;
    r = FOR_LOOP(b, l + 1);
    if (!r) r = FOR_VALUE_SCRIPTLET(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // FOR_SCRIPLET_END JsonTemplate FOR_SCRIPLET_START
  public static boolean FOR_VALUE_SCRIPTLET(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_VALUE_SCRIPTLET")) return false;
    if (!nextTokenIs(b, FOR_SCRIPLET_END)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR_SCRIPLET_END);
    r = r && JsonTemplate(b, l + 1);
    r = r && consumeToken(b, FOR_SCRIPLET_START);
    exit_section_(b, m, FOR_VALUE_SCRIPTLET, r);
    return r;
  }

  /* ********************************************************** */
  // FOR_SCRIPLET_START TFOR_LOOP FOR_SCRIPLET_END
  public static boolean ForBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForBlock")) return false;
    if (!nextTokenIs(b, FOR_SCRIPLET_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR_SCRIPLET_START);
    r = r && TFOR_LOOP(b, l + 1);
    r = r && consumeToken(b, FOR_SCRIPLET_END);
    exit_section_(b, m, FOR_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // FOR '(' (identifier (':' Type) IN identifier (':' Type)?) ')' '{' Statement * '}' ';'
  public static boolean ForCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForCall")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR, LPAREN);
    r = r && ForCall_2(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, LBRACE);
    r = r && ForCall_5(b, l + 1);
    r = r && consumeTokens(b, 0, RBRACE, SEMICOLON);
    exit_section_(b, m, FOR_CALL, r);
    return r;
  }

  // identifier (':' Type) IN identifier (':' Type)?
  private static boolean ForCall_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForCall_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && ForCall_2_1(b, l + 1);
    r = r && consumeTokens(b, 0, IN, IDENTIFIER);
    r = r && ForCall_2_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':' Type
  private static boolean ForCall_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForCall_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (':' Type)?
  private static boolean ForCall_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForCall_2_4")) return false;
    ForCall_2_4_0(b, l + 1);
    return true;
  }

  // ':' Type
  private static boolean ForCall_2_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForCall_2_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Statement *
  private static boolean ForCall_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForCall_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ForCall_5", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '[' ((FOR_SCRIPLET_START FOR_LOOP FOR_SCRIPLET_END) | ((JsonTemplate ',')* JsonTemplate))?']'
  public static boolean JsonArray(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonArray")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && JsonArray_1(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, JSON_ARRAY, r);
    return r;
  }

  // ((FOR_SCRIPLET_START FOR_LOOP FOR_SCRIPLET_END) | ((JsonTemplate ',')* JsonTemplate))?
  private static boolean JsonArray_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonArray_1")) return false;
    JsonArray_1_0(b, l + 1);
    return true;
  }

  // (FOR_SCRIPLET_START FOR_LOOP FOR_SCRIPLET_END) | ((JsonTemplate ',')* JsonTemplate)
  private static boolean JsonArray_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonArray_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = JsonArray_1_0_0(b, l + 1);
    if (!r) r = JsonArray_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // FOR_SCRIPLET_START FOR_LOOP FOR_SCRIPLET_END
  private static boolean JsonArray_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonArray_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR_SCRIPLET_START);
    r = r && FOR_LOOP(b, l + 1);
    r = r && consumeToken(b, FOR_SCRIPLET_END);
    exit_section_(b, m, null, r);
    return r;
  }

  // (JsonTemplate ',')* JsonTemplate
  private static boolean JsonArray_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonArray_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = JsonArray_1_0_1_0(b, l + 1);
    r = r && JsonTemplate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (JsonTemplate ',')*
  private static boolean JsonArray_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonArray_1_0_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!JsonArray_1_0_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "JsonArray_1_0_1_0", c)) break;
    }
    return true;
  }

  // JsonTemplate ','
  private static boolean JsonArray_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonArray_1_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = JsonTemplate(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' (JsonPair ',')* JsonPair? '}'
  public static boolean JsonObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonObject")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && JsonObject_1(b, l + 1);
    r = r && JsonObject_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, JSON_OBJECT, r);
    return r;
  }

  // (JsonPair ',')*
  private static boolean JsonObject_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonObject_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!JsonObject_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "JsonObject_1", c)) break;
    }
    return true;
  }

  // JsonPair ','
  private static boolean JsonObject_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonObject_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = JsonPair(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // JsonPair?
  private static boolean JsonObject_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonObject_2")) return false;
    JsonPair(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // STRING_LITERAL ':' (Scriplet | JsonArray | JsonObject | STRING_LITERAL | LongValue | BooleanValue)
  public static boolean JsonPair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonPair")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STRING_LITERAL, COLON);
    r = r && JsonPair_2(b, l + 1);
    exit_section_(b, m, JSON_PAIR, r);
    return r;
  }

  // Scriplet | JsonArray | JsonObject | STRING_LITERAL | LongValue | BooleanValue
  private static boolean JsonPair_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonPair_2")) return false;
    boolean r;
    r = Scriplet(b, l + 1);
    if (!r) r = JsonArray(b, l + 1);
    if (!r) r = JsonObject(b, l + 1);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, LONGVALUE);
    if (!r) r = consumeToken(b, BOOLEANVALUE);
    return r;
  }

  /* ********************************************************** */
  // Scriplet | JsonArray | JsonObject | STRING_LITERAL
  public static boolean JsonTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonTemplate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JSON_TEMPLATE, "<json template>");
    r = Scriplet(b, l + 1);
    if (!r) r = JsonArray(b, l + 1);
    if (!r) r = JsonObject(b, l + 1);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // JsonStart JsonTemplate
  public static boolean JsonTemplateValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonTemplateValue")) return false;
    if (!nextTokenIs(b, JSONSTART)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, JSONSTART);
    r = r && JsonTemplate(b, l + 1);
    exit_section_(b, m, JSON_TEMPLATE_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // identifier | NAME
  public static boolean Label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Label")) return false;
    if (!nextTokenIs(b, "<label>", IDENTIFIER, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LABEL, "<label>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, NAME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' (MapPair ',')* MapPair? '}'
  public static boolean MapObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapObject")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && MapObject_1(b, l + 1);
    r = r && MapObject_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, MAP_OBJECT, r);
    return r;
  }

  // (MapPair ',')*
  private static boolean MapObject_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapObject_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MapObject_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MapObject_1", c)) break;
    }
    return true;
  }

  // MapPair ','
  private static boolean MapObject_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapObject_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MapPair(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // MapPair?
  private static boolean MapObject_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapObject_2")) return false;
    MapPair(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // STRING_LITERAL ':' (TextTemplateValue | STRING_LITERAL )
  public static boolean MapPair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapPair")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STRING_LITERAL, COLON);
    r = r && MapPair_2(b, l + 1);
    exit_section_(b, m, MAP_PAIR, r);
    return r;
  }

  // TextTemplateValue | STRING_LITERAL
  private static boolean MapPair_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapPair_2")) return false;
    boolean r;
    r = TextTemplateValue(b, l + 1);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    return r;
  }

  /* ********************************************************** */
  // MapStart MapObject
  public static boolean MapValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapValue")) return false;
    if (!nextTokenIs(b, MAPSTART)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MAPSTART);
    r = r && MapObject(b, l + 1);
    exit_section_(b, m, MAP_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // NILVALUE
  public static boolean Nil(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Nil")) return false;
    if (!nextTokenIs(b, NILVALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NILVALUE);
    exit_section_(b, m, NIL, r);
    return r;
  }

  /* ********************************************************** */
  // Label '{' Statement* '}'
  public static boolean RootFn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RootFn")) return false;
    if (!nextTokenIs(b, "<root fn>", IDENTIFIER, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ROOT_FN, "<root fn>");
    r = Label(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && RootFn_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Statement*
  private static boolean RootFn_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RootFn_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RootFn_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SCRIPLET_START (Expression) SCRIPLET_END
  public static boolean Scriplet(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scriplet")) return false;
    if (!nextTokenIs(b, SCRIPLET_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SCRIPLET_START);
    r = r && Scriplet_1(b, l + 1);
    r = r && consumeToken(b, SCRIPLET_END);
    exit_section_(b, m, SCRIPLET, r);
    return r;
  }

  // (Expression)
  private static boolean Scriplet_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scriplet_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DefinedFnCall | TimesCall | ForCall
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = DefinedFnCall(b, l + 1);
    if (!r) r = TimesCall(b, l + 1);
    if (!r) r = ForCall(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FOR '('(identifier (':' Type) IN identifier (':' Type)?) ')' LBRACE (TFOR_LOOP | TFOR_VALUE_SCRIPTLET) RBRACE
  public static boolean TFOR_LOOP(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TFOR_LOOP")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR, LPAREN);
    r = r && TFOR_LOOP_2(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, LBRACE);
    r = r && TFOR_LOOP_5(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, TFOR_LOOP, r);
    return r;
  }

  // identifier (':' Type) IN identifier (':' Type)?
  private static boolean TFOR_LOOP_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TFOR_LOOP_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && TFOR_LOOP_2_1(b, l + 1);
    r = r && consumeTokens(b, 0, IN, IDENTIFIER);
    r = r && TFOR_LOOP_2_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':' Type
  private static boolean TFOR_LOOP_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TFOR_LOOP_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (':' Type)?
  private static boolean TFOR_LOOP_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TFOR_LOOP_2_4")) return false;
    TFOR_LOOP_2_4_0(b, l + 1);
    return true;
  }

  // ':' Type
  private static boolean TFOR_LOOP_2_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TFOR_LOOP_2_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TFOR_LOOP | TFOR_VALUE_SCRIPTLET
  private static boolean TFOR_LOOP_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TFOR_LOOP_5")) return false;
    boolean r;
    r = TFOR_LOOP(b, l + 1);
    if (!r) r = TFOR_VALUE_SCRIPTLET(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // FOR_SCRIPLET_END TextTemplate FOR_SCRIPLET_START
  public static boolean TFOR_VALUE_SCRIPTLET(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TFOR_VALUE_SCRIPTLET")) return false;
    if (!nextTokenIs(b, FOR_SCRIPLET_END)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR_SCRIPLET_END);
    r = r && TextTemplate(b, l + 1);
    r = r && consumeToken(b, FOR_SCRIPLET_START);
    exit_section_(b, m, TFOR_VALUE_SCRIPTLET, r);
    return r;
  }

  /* ********************************************************** */
  // ForBlock| Scriplet | TEXT_LITERAL
  public static boolean TextBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TextBlock")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEXT_BLOCK, "<text block>");
    r = ForBlock(b, l + 1);
    if (!r) r = Scriplet(b, l + 1);
    if (!r) r = consumeToken(b, TEXT_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TextBlock*
  public static boolean TextTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TextTemplate")) return false;
    Marker m = enter_section_(b, l, _NONE_, TEXT_TEMPLATE, "<text template>");
    while (true) {
      int c = current_position_(b);
      if (!TextBlock(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TextTemplate", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // TextStart QUOTE TextTemplate QUOTE
  public static boolean TextTemplateValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TextTemplateValue")) return false;
    if (!nextTokenIs(b, TEXTSTART)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TEXTSTART, QUOTE);
    r = r && TextTemplate(b, l + 1);
    r = r && consumeToken(b, QUOTE);
    exit_section_(b, m, TEXT_TEMPLATE_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // TIMES '(' LongValue ',' identifier ',' (identifier (':' Type) IN identifier (':' Type)?) ')' '{' Statement * '}' ';'
  public static boolean TimesCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimesCall")) return false;
    if (!nextTokenIs(b, TIMES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TIMES, LPAREN, LONGVALUE, COMMA, IDENTIFIER, COMMA);
    r = r && TimesCall_6(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, LBRACE);
    r = r && TimesCall_9(b, l + 1);
    r = r && consumeTokens(b, 0, RBRACE, SEMICOLON);
    exit_section_(b, m, TIMES_CALL, r);
    return r;
  }

  // identifier (':' Type) IN identifier (':' Type)?
  private static boolean TimesCall_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimesCall_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && TimesCall_6_1(b, l + 1);
    r = r && consumeTokens(b, 0, IN, IDENTIFIER);
    r = r && TimesCall_6_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':' Type
  private static boolean TimesCall_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimesCall_6_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (':' Type)?
  private static boolean TimesCall_6_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimesCall_6_4")) return false;
    TimesCall_6_4_0(b, l + 1);
    return true;
  }

  // ':' Type
  private static boolean TimesCall_6_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimesCall_6_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Statement *
  private static boolean TimesCall_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimesCall_9")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TimesCall_9", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // STRING | LONG | LIST | OBJECT
  public static boolean Type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, LONG);
    if (!r) r = consumeToken(b, LIST);
    if (!r) r = consumeToken(b, OBJECT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TextTemplateValue | JsonTemplateValue | EJsonTemplateValue | Nil | MapValue
  public static boolean Value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = TextTemplateValue(b, l + 1);
    if (!r) r = JsonTemplateValue(b, l + 1);
    if (!r) r = EJsonTemplateValue(b, l + 1);
    if (!r) r = Nil(b, l + 1);
    if (!r) r = MapValue(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // RootFn
  static boolean journeyFile(PsiBuilder b, int l) {
    return RootFn(b, l + 1);
  }

}
