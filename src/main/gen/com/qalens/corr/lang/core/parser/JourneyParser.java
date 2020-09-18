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
  // (ROUND | RANDOM | SUB | DIV) LPAREN (Expression COMMA Expression)  RPAREN
  public static boolean BinaryFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryFunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_FUNCTION, "<binary function>");
    r = BinaryFunction_0(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && BinaryFunction_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ROUND | RANDOM | SUB | DIV
  private static boolean BinaryFunction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryFunction_0")) return false;
    boolean r;
    r = consumeToken(b, ROUND);
    if (!r) r = consumeToken(b, RANDOM);
    if (!r) r = consumeToken(b, SUB);
    if (!r) r = consumeToken(b, DIV);
    return r;
  }

  // Expression COMMA Expression
  private static boolean BinaryFunction_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryFunction_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_LITERAL | DoubleValue | PositiveIntegerValue | InetegerValue | NullValue | BooleanValue
  public static boolean ConstantExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstantExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT_EXPRESSION, "<constant expression>");
    r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, DOUBLEVALUE);
    if (!r) r = consumeToken(b, POSITIVEINTEGERVALUE);
    if (!r) r = consumeToken(b, INETEGERVALUE);
    if (!r) r = consumeToken(b, NULLVALUE);
    if (!r) r = consumeToken(b, BOOLEANVALUE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FILLABLE TEXT TextTemplate
  public static boolean DynamicFillableTextTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DynamicFillableTextTemplate")) return false;
    if (!nextTokenIs(b, FILLABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FILLABLE, TEXT);
    r = r && TextTemplate(b, l + 1);
    exit_section_(b, m, DYNAMIC_FILLABLE_TEXT_TEMPLATE, r);
    return r;
  }

  /* ********************************************************** */
  // ConstantExpression | FunctionExpression | VariableExpression
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = ConstantExpression(b, l + 1);
    if (!r) r = FunctionExpression(b, l + 1);
    if (!r) r = VariableExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // MultiValuedFunction | BinaryFunction | NoArgFunction
  public static boolean FunctionExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_EXPRESSION, "<function expression>");
    r = MultiValuedFunction(b, l + 1);
    if (!r) r = BinaryFunction(b, l + 1);
    if (!r) r = NoArgFunction(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier | NAME
  public static boolean JourneyName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JourneyName")) return false;
    if (!nextTokenIs(b, "<journey name>", IDENTIFIER, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JOURNEY_NAME, "<journey name>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, NAME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (CONCAT | MUL | ADD) LPAREN (Expression (',' Expression)*)? RPAREN
  public static boolean MultiValuedFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiValuedFunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTI_VALUED_FUNCTION, "<multi valued function>");
    r = MultiValuedFunction_0(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && MultiValuedFunction_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CONCAT | MUL | ADD
  private static boolean MultiValuedFunction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiValuedFunction_0")) return false;
    boolean r;
    r = consumeToken(b, CONCAT);
    if (!r) r = consumeToken(b, MUL);
    if (!r) r = consumeToken(b, ADD);
    return r;
  }

  // (Expression (',' Expression)*)?
  private static boolean MultiValuedFunction_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiValuedFunction_2")) return false;
    MultiValuedFunction_2_0(b, l + 1);
    return true;
  }

  // Expression (',' Expression)*
  private static boolean MultiValuedFunction_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiValuedFunction_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && MultiValuedFunction_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' Expression)*
  private static boolean MultiValuedFunction_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiValuedFunction_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MultiValuedFunction_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MultiValuedFunction_2_0_1", c)) break;
    }
    return true;
  }

  // ',' Expression
  private static boolean MultiValuedFunction_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiValuedFunction_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UUID LPAREN  RPAREN
  public static boolean NoArgFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NoArgFunction")) return false;
    if (!nextTokenIs(b, UUID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, UUID, LPAREN, RPAREN);
    exit_section_(b, m, NO_ARG_FUNCTION, r);
    return r;
  }

  /* ********************************************************** */
  // PRINT DynamicFillableTextTemplate SEMICOLON
  public static boolean PrintStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrintStatement")) return false;
    if (!nextTokenIs(b, PRINT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PRINT);
    r = r && DynamicFillableTextTemplate(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, PRINT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // JourneyName LPAREN RPAREN LBRACE Statement* RBRACE
  public static boolean RootFn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RootFn")) return false;
    if (!nextTokenIs(b, "<root fn>", IDENTIFIER, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ROOT_FN, "<root fn>");
    r = JourneyName(b, l + 1);
    r = r && consumeTokens(b, 0, LPAREN, RPAREN, LBRACE);
    r = r && RootFn_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Statement*
  private static boolean RootFn_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RootFn_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RootFn_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SCRIPLET_START (TextScript) SCRIPLET_END
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

  // (TextScript)
  private static boolean Scriplet_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scriplet_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TextScript(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PrintStatement
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    if (!nextTokenIs(b, PRINT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PrintStatement(b, l + 1);
    exit_section_(b, m, STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // Scriplet | TEXT_LITERAL
  public static boolean TextBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TextBlock")) return false;
    if (!nextTokenIs(b, "<text block>", SCRIPLET_START, TEXT_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEXT_BLOCK, "<text block>");
    r = Scriplet(b, l + 1);
    if (!r) r = consumeToken(b, TEXT_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Expression
  public static boolean TextScript(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TextScript")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEXT_SCRIPT, "<text script>");
    r = Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BACKTICK TextBlock* BACKTICK
  public static boolean TextTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TextTemplate")) return false;
    if (!nextTokenIs(b, BACKTICK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BACKTICK);
    r = r && TextTemplate_1(b, l + 1);
    r = r && consumeToken(b, BACKTICK);
    exit_section_(b, m, TEXT_TEMPLATE, r);
    return r;
  }

  // TextBlock*
  private static boolean TextTemplate_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TextTemplate_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TextBlock(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TextTemplate_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // STRING | BOOL | POSITIVE_INTEGER | INTEGER | DOUBLE
  public static boolean Type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, BOOL);
    if (!r) r = consumeToken(b, POSITIVE_INTEGER);
    if (!r) r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // VariableReference (':' Type)?
  public static boolean VariableExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableExpression")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableReference(b, l + 1);
    r = r && VariableExpression_1(b, l + 1);
    exit_section_(b, m, VARIABLE_EXPRESSION, r);
    return r;
  }

  // (':' Type)?
  private static boolean VariableExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableExpression_1")) return false;
    VariableExpression_1_0(b, l + 1);
    return true;
  }

  // ':' Type
  private static boolean VariableExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier (DOT identifier)*
  public static boolean VariableReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReference")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && VariableReference_1(b, l + 1);
    exit_section_(b, m, VARIABLE_REFERENCE, r);
    return r;
  }

  // (DOT identifier)*
  private static boolean VariableReference_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReference_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!VariableReference_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VariableReference_1", c)) break;
    }
    return true;
  }

  // DOT identifier
  private static boolean VariableReference_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReference_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RootFn
  static boolean journeyFile(PsiBuilder b, int l) {
    return RootFn(b, l + 1);
  }

}
