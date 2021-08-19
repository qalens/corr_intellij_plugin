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
  // '(' ( (VariableReference ',' VariableReference) | VariableReference?) ')' '=>' (Statement | MultipleStatement)
  public static boolean ArgedFor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgedFor")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && ArgedFor_1(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, FATARROW);
    r = r && ArgedFor_4(b, l + 1);
    exit_section_(b, m, ARGED_FOR, r);
    return r;
  }

  // (VariableReference ',' VariableReference) | VariableReference?
  private static boolean ArgedFor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgedFor_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArgedFor_1_0(b, l + 1);
    if (!r) r = ArgedFor_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VariableReference ',' VariableReference
  private static boolean ArgedFor_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgedFor_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableReference(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && VariableReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VariableReference?
  private static boolean ArgedFor_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgedFor_1_1")) return false;
    VariableReference(b, l + 1);
    return true;
  }

  // Statement | MultipleStatement
  private static boolean ArgedFor_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgedFor_4")) return false;
    boolean r;
    r = Statement(b, l + 1);
    if (!r) r = MultipleStatement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '(' ( (VariableReference ',' VariableReference) | VariableReference?) ')' '=>' ForBlockForText
  public static boolean ArgedForInText(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgedForInText")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && ArgedForInText_1(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, FATARROW);
    r = r && ForBlockForText(b, l + 1);
    exit_section_(b, m, ARGED_FOR_IN_TEXT, r);
    return r;
  }

  // (VariableReference ',' VariableReference) | VariableReference?
  private static boolean ArgedForInText_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgedForInText_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArgedForInText_1_0(b, l + 1);
    if (!r) r = ArgedForInText_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VariableReference ',' VariableReference
  private static boolean ArgedForInText_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgedForInText_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableReference(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && VariableReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VariableReference?
  private static boolean ArgedForInText_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgedForInText_1_1")) return false;
    VariableReference(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Expression | FillableObjectTemplate | FillableTextTemplate
  public static boolean Assignable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assignable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNABLE, "<assignable>");
    r = Expression(b, l + 1);
    if (!r) r = FillableObjectTemplate(b, l + 1);
    if (!r) r = FillableTextTemplate(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (VariableReference '.' ('round' | 'random' | 'sub' | 'div' | 'mod') '(' Expression ')') | (('round' | 'random' | 'sub' | 'div' | 'mod') '(' (Expression ',' Expression)  ')')
  public static boolean BinaryFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryFunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_FUNCTION, "<binary function>");
    r = BinaryFunction_0(b, l + 1);
    if (!r) r = BinaryFunction_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // VariableReference '.' ('round' | 'random' | 'sub' | 'div' | 'mod') '(' Expression ')'
  private static boolean BinaryFunction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryFunction_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableReference(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && BinaryFunction_0_2(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'round' | 'random' | 'sub' | 'div' | 'mod'
  private static boolean BinaryFunction_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryFunction_0_2")) return false;
    boolean r;
    r = consumeToken(b, ROUND);
    if (!r) r = consumeToken(b, RANDOM);
    if (!r) r = consumeToken(b, SUB);
    if (!r) r = consumeToken(b, DIV);
    if (!r) r = consumeToken(b, MOD);
    return r;
  }

  // ('round' | 'random' | 'sub' | 'div' | 'mod') '(' (Expression ',' Expression)  ')'
  private static boolean BinaryFunction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryFunction_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BinaryFunction_1_0(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && BinaryFunction_1_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'round' | 'random' | 'sub' | 'div' | 'mod'
  private static boolean BinaryFunction_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryFunction_1_0")) return false;
    boolean r;
    r = consumeToken(b, ROUND);
    if (!r) r = consumeToken(b, RANDOM);
    if (!r) r = consumeToken(b, SUB);
    if (!r) r = consumeToken(b, DIV);
    if (!r) r = consumeToken(b, MOD);
    return r;
  }

  // Expression ',' Expression
  private static boolean BinaryFunction_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryFunction_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '+' | '-' | '/' | '*' | '%' | '=='
  public static boolean BinaryOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_OPERATOR, "<binary operator>");
    r = consumeToken(b, OP_PLUS);
    if (!r) r = consumeToken(b, OP_MINUS);
    if (!r) r = consumeToken(b, OP_DIVIDE);
    if (!r) r = consumeToken(b, OP_MULTIPLY);
    if (!r) r = consumeToken(b, OP_MOD);
    if (!r) r = consumeToken(b, OP_EQUAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ((UnaryOperatorExpression | NonOperatorExpression) BinaryOperator)+ (UnaryOperatorExpression | NonOperatorExpression)
  public static boolean BinaryOperatorExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryOperatorExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_OPERATOR_EXPRESSION, "<binary operator expression>");
    r = BinaryOperatorExpression_0(b, l + 1);
    r = r && BinaryOperatorExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((UnaryOperatorExpression | NonOperatorExpression) BinaryOperator)+
  private static boolean BinaryOperatorExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryOperatorExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BinaryOperatorExpression_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!BinaryOperatorExpression_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BinaryOperatorExpression_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (UnaryOperatorExpression | NonOperatorExpression) BinaryOperator
  private static boolean BinaryOperatorExpression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryOperatorExpression_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BinaryOperatorExpression_0_0_0(b, l + 1);
    r = r && BinaryOperator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // UnaryOperatorExpression | NonOperatorExpression
  private static boolean BinaryOperatorExpression_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryOperatorExpression_0_0_0")) return false;
    boolean r;
    r = UnaryOperatorExpression(b, l + 1);
    if (!r) r = NonOperatorExpression(b, l + 1);
    return r;
  }

  // UnaryOperatorExpression | NonOperatorExpression
  private static boolean BinaryOperatorExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryOperatorExpression_1")) return false;
    boolean r;
    r = UnaryOperatorExpression(b, l + 1);
    if (!r) r = NonOperatorExpression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'body' ExtractableTemplate ('and' 'headers' ExtractableHeaders)?
  public static boolean BodyStartingRestData(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BodyStartingRestData")) return false;
    if (!nextTokenIs(b, BODY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BODY);
    r = r && ExtractableTemplate(b, l + 1);
    r = r && BodyStartingRestData_2(b, l + 1);
    exit_section_(b, m, BODY_STARTING_REST_DATA, r);
    return r;
  }

  // ('and' 'headers' ExtractableHeaders)?
  private static boolean BodyStartingRestData_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BodyStartingRestData_2")) return false;
    BodyStartingRestData_2_0(b, l + 1);
    return true;
  }

  // 'and' 'headers' ExtractableHeaders
  private static boolean BodyStartingRestData_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BodyStartingRestData_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AND, HEADERS);
    r = r && ExtractableHeaders(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' Expression ')'
  public static boolean BracketedExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BracketedExpression")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, BRACKETED_EXPRESSION, r);
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
  // OperatorExpression | NonOperatorExpression
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = OperatorExpression(b, l + 1);
    if (!r) r = NonOperatorExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // VariableReference '.' 'for' '(' VariableReference ')' '=>' ExtractableObjectTemplate
  public static boolean ExtractableForLoop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableForLoop")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableReference(b, l + 1);
    r = r && consumeTokens(b, 0, DOT, FOR, LPAREN);
    r = r && VariableReference(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, FATARROW);
    r = r && ExtractableObjectTemplate(b, l + 1);
    exit_section_(b, m, EXTRACTABLE_FOR_LOOP, r);
    return r;
  }

  /* ********************************************************** */
  // '{' STRING_LITERAL ':' VariableReference (',' STRING_LITERAL ':' VariableReference)* '}'
  public static boolean ExtractableFormTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableFormTemplate")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACE, STRING_LITERAL, COLON);
    r = r && VariableReference(b, l + 1);
    r = r && ExtractableFormTemplate_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, EXTRACTABLE_FORM_TEMPLATE, r);
    return r;
  }

  // (',' STRING_LITERAL ':' VariableReference)*
  private static boolean ExtractableFormTemplate_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableFormTemplate_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ExtractableFormTemplate_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ExtractableFormTemplate_4", c)) break;
    }
    return true;
  }

  // ',' STRING_LITERAL ':' VariableReference
  private static boolean ExtractableFormTemplate_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableFormTemplate_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, STRING_LITERAL, COLON);
    r = r && VariableReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' STRING_LITERAL ':' VariableReference (',' STRING_LITERAL ':' VariableReference)* '}'
  public static boolean ExtractableHeaders(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableHeaders")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACE, STRING_LITERAL, COLON);
    r = r && VariableReference(b, l + 1);
    r = r && ExtractableHeaders_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, EXTRACTABLE_HEADERS, r);
    return r;
  }

  // (',' STRING_LITERAL ':' VariableReference)*
  private static boolean ExtractableHeaders_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableHeaders_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ExtractableHeaders_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ExtractableHeaders_4", c)) break;
    }
    return true;
  }

  // ',' STRING_LITERAL ':' VariableReference
  private static boolean ExtractableHeaders_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableHeaders_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, STRING_LITERAL, COLON);
    r = r && VariableReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' ExtractablePair ( ',' ExtractablePair)* '}'
  public static boolean ExtractableObjectMap(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableObjectMap")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && ExtractablePair(b, l + 1);
    r = r && ExtractableObjectMap_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, EXTRACTABLE_OBJECT_MAP, r);
    return r;
  }

  // ( ',' ExtractablePair)*
  private static boolean ExtractableObjectMap_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableObjectMap_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ExtractableObjectMap_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ExtractableObjectMap_2", c)) break;
    }
    return true;
  }

  // ',' ExtractablePair
  private static boolean ExtractableObjectMap_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableObjectMap_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ExtractablePair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ExtractableForLoop | VariableReference | ExtractableObjectMap | ExtractableStaticArray
  public static boolean ExtractableObjectTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableObjectTemplate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXTRACTABLE_OBJECT_TEMPLATE, "<extractable object template>");
    r = ExtractableForLoop(b, l + 1);
    if (!r) r = VariableReference(b, l + 1);
    if (!r) r = ExtractableObjectMap(b, l + 1);
    if (!r) r = ExtractableStaticArray(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STRING_LITERAL ':' ExtractableObjectTemplate
  public static boolean ExtractablePair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractablePair")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STRING_LITERAL, COLON);
    r = r && ExtractableObjectTemplate(b, l + 1);
    exit_section_(b, m, EXTRACTABLE_PAIR, r);
    return r;
  }

  /* ********************************************************** */
  // '[' ExtractableObjectTemplate (',' ExtractableObjectTemplate)* ']'
  public static boolean ExtractableStaticArray(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableStaticArray")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && ExtractableObjectTemplate(b, l + 1);
    r = r && ExtractableStaticArray_2(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, EXTRACTABLE_STATIC_ARRAY, r);
    return r;
  }

  // (',' ExtractableObjectTemplate)*
  private static boolean ExtractableStaticArray_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableStaticArray_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ExtractableStaticArray_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ExtractableStaticArray_2", c)) break;
    }
    return true;
  }

  // ',' ExtractableObjectTemplate
  private static boolean ExtractableStaticArray_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableStaticArray_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ExtractableObjectTemplate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('form' ExtractableFormTemplate) | ('object' ExtractableObjectTemplate)
  public static boolean ExtractableTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableTemplate")) return false;
    if (!nextTokenIs(b, "<extractable template>", FORM, OBJECT_TEMPLATE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXTRACTABLE_TEMPLATE, "<extractable template>");
    r = ExtractableTemplate_0(b, l + 1);
    if (!r) r = ExtractableTemplate_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'form' ExtractableFormTemplate
  private static boolean ExtractableTemplate_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableTemplate_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FORM);
    r = r && ExtractableFormTemplate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'object' ExtractableObjectTemplate
  private static boolean ExtractableTemplate_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableTemplate_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OBJECT_TEMPLATE);
    r = r && ExtractableObjectTemplate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'text' '`' (SingleVariableText | MultiVariableText) '`'
  public static boolean ExtractableText(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableText")) return false;
    if (!nextTokenIs(b, TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TEXT, BACKTICK);
    r = r && ExtractableText_2(b, l + 1);
    r = r && consumeToken(b, BACKTICK);
    exit_section_(b, m, EXTRACTABLE_TEXT, r);
    return r;
  }

  // SingleVariableText | MultiVariableText
  private static boolean ExtractableText_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableText_2")) return false;
    boolean r;
    r = SingleVariableText(b, l + 1);
    if (!r) r = MultiVariableText(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '[' (ObjectValueTemplate (',' ObjectValueTemplate)*)? ']'
  public static boolean FillableArrayTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableArrayTemplate")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && FillableArrayTemplate_1(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, FILLABLE_ARRAY_TEMPLATE, r);
    return r;
  }

  // (ObjectValueTemplate (',' ObjectValueTemplate)*)?
  private static boolean FillableArrayTemplate_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableArrayTemplate_1")) return false;
    FillableArrayTemplate_1_0(b, l + 1);
    return true;
  }

  // ObjectValueTemplate (',' ObjectValueTemplate)*
  private static boolean FillableArrayTemplate_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableArrayTemplate_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ObjectValueTemplate(b, l + 1);
    r = r && FillableArrayTemplate_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' ObjectValueTemplate)*
  private static boolean FillableArrayTemplate_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableArrayTemplate_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FillableArrayTemplate_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FillableArrayTemplate_1_0_1", c)) break;
    }
    return true;
  }

  // ',' ObjectValueTemplate
  private static boolean FillableArrayTemplate_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableArrayTemplate_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ObjectValueTemplate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VariableReference '.' 'for' (FillableForLoopWithArguments | FillableForLoopWithoutArguments)
  public static boolean FillableForLoop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableForLoop")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableReference(b, l + 1);
    r = r && consumeTokens(b, 0, DOT, FOR);
    r = r && FillableForLoop_3(b, l + 1);
    exit_section_(b, m, FILLABLE_FOR_LOOP, r);
    return r;
  }

  // FillableForLoopWithArguments | FillableForLoopWithoutArguments
  private static boolean FillableForLoop_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableForLoop_3")) return false;
    boolean r;
    r = FillableForLoopWithArguments(b, l + 1);
    if (!r) r = FillableForLoopWithoutArguments(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '(' VariableReference (',' VariableReference )? ')' '=>' ObjectValueTemplate
  public static boolean FillableForLoopWithArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableForLoopWithArguments")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && VariableReference(b, l + 1);
    r = r && FillableForLoopWithArguments_2(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, FATARROW);
    r = r && ObjectValueTemplate(b, l + 1);
    exit_section_(b, m, FILLABLE_FOR_LOOP_WITH_ARGUMENTS, r);
    return r;
  }

  // (',' VariableReference )?
  private static boolean FillableForLoopWithArguments_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableForLoopWithArguments_2")) return false;
    FillableForLoopWithArguments_2_0(b, l + 1);
    return true;
  }

  // ',' VariableReference
  private static boolean FillableForLoopWithArguments_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableForLoopWithArguments_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && VariableReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ObjectValueTemplate
  public static boolean FillableForLoopWithoutArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableForLoopWithoutArguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FILLABLE_FOR_LOOP_WITHOUT_ARGUMENTS, "<fillable for loop without arguments>");
    r = ObjectValueTemplate(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' HeaderPair (',' HeaderPair)* '}'
  public static boolean FillableHeaders(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableHeaders")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && HeaderPair(b, l + 1);
    r = r && FillableHeaders_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, FILLABLE_HEADERS, r);
    return r;
  }

  // (',' HeaderPair)*
  private static boolean FillableHeaders_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableHeaders_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FillableHeaders_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FillableHeaders_2", c)) break;
    }
    return true;
  }

  // ',' HeaderPair
  private static boolean FillableHeaders_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableHeaders_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && HeaderPair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{'  (FillbaleObjectPair (',' FillbaleObjectPair)*)? '}'
  public static boolean FillableMapTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableMapTemplate")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && FillableMapTemplate_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, FILLABLE_MAP_TEMPLATE, r);
    return r;
  }

  // (FillbaleObjectPair (',' FillbaleObjectPair)*)?
  private static boolean FillableMapTemplate_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableMapTemplate_1")) return false;
    FillableMapTemplate_1_0(b, l + 1);
    return true;
  }

  // FillbaleObjectPair (',' FillbaleObjectPair)*
  private static boolean FillableMapTemplate_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableMapTemplate_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FillbaleObjectPair(b, l + 1);
    r = r && FillableMapTemplate_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' FillbaleObjectPair)*
  private static boolean FillableMapTemplate_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableMapTemplate_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FillableMapTemplate_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FillableMapTemplate_1_0_1", c)) break;
    }
    return true;
  }

  // ',' FillbaleObjectPair
  private static boolean FillableMapTemplate_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableMapTemplate_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && FillbaleObjectPair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'object' ObjectValueTemplate
  public static boolean FillableObjectTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableObjectTemplate")) return false;
    if (!nextTokenIs(b, OBJECT_TEMPLATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OBJECT_TEMPLATE);
    r = r && ObjectValueTemplate(b, l + 1);
    exit_section_(b, m, FILLABLE_OBJECT_TEMPLATE, r);
    return r;
  }

  /* ********************************************************** */
  // 'request' '{'
  //   'url' ':' (Expression | FillableTextTemplate)
  //   ( ',' 'body' ':' FillableObjectTemplate)?
  //   ( ',' 'headers' ':' FillableHeaders)? '}'
  public static boolean FillableRequestTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableRequestTemplate")) return false;
    if (!nextTokenIs(b, REQUEST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, REQUEST, LBRACE, URL, COLON);
    r = r && FillableRequestTemplate_4(b, l + 1);
    r = r && FillableRequestTemplate_5(b, l + 1);
    r = r && FillableRequestTemplate_6(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, FILLABLE_REQUEST_TEMPLATE, r);
    return r;
  }

  // Expression | FillableTextTemplate
  private static boolean FillableRequestTemplate_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableRequestTemplate_4")) return false;
    boolean r;
    r = Expression(b, l + 1);
    if (!r) r = FillableTextTemplate(b, l + 1);
    return r;
  }

  // ( ',' 'body' ':' FillableObjectTemplate)?
  private static boolean FillableRequestTemplate_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableRequestTemplate_5")) return false;
    FillableRequestTemplate_5_0(b, l + 1);
    return true;
  }

  // ',' 'body' ':' FillableObjectTemplate
  private static boolean FillableRequestTemplate_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableRequestTemplate_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, BODY, COLON);
    r = r && FillableObjectTemplate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' 'headers' ':' FillableHeaders)?
  private static boolean FillableRequestTemplate_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableRequestTemplate_6")) return false;
    FillableRequestTemplate_6_0(b, l + 1);
    return true;
  }

  // ',' 'headers' ':' FillableHeaders
  private static boolean FillableRequestTemplate_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableRequestTemplate_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, HEADERS, COLON);
    r = r && FillableHeaders(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'text' TextTemplate
  public static boolean FillableTextTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableTextTemplate")) return false;
    if (!nextTokenIs(b, TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEXT);
    r = r && TextTemplate(b, l + 1);
    exit_section_(b, m, FILLABLE_TEXT_TEMPLATE, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_LITERAL ':' ObjectValueTemplate
  public static boolean FillbaleObjectPair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillbaleObjectPair")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STRING_LITERAL, COLON);
    r = r && ObjectValueTemplate(b, l + 1);
    exit_section_(b, m, FILLBALE_OBJECT_PAIR, r);
    return r;
  }

  /* ********************************************************** */
  // TextScript | ( '%>' (TextBlock)* '<%' )
  public static boolean ForBlockForText(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForBlockForText")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_BLOCK_FOR_TEXT, "<for block for text>");
    r = TextScript(b, l + 1);
    if (!r) r = ForBlockForText_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '%>' (TextBlock)* '<%'
  private static boolean ForBlockForText_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForBlockForText_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SCRIPLET_END);
    r = r && ForBlockForText_1_1(b, l + 1);
    r = r && consumeToken(b, SCRIPLET_START);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TextBlock)*
  private static boolean ForBlockForText_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForBlockForText_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ForBlockForText_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ForBlockForText_1_1", c)) break;
    }
    return true;
  }

  // (TextBlock)
  private static boolean ForBlockForText_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForBlockForText_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TextBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VariableReference '.' 'for' (UnArgedForInText | ArgedForInText )
  public static boolean ForLoopInText(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoopInText")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableReference(b, l + 1);
    r = r && consumeTokens(b, 0, DOT, FOR);
    r = r && ForLoopInText_3(b, l + 1);
    exit_section_(b, m, FOR_LOOP_IN_TEXT, r);
    return r;
  }

  // UnArgedForInText | ArgedForInText
  private static boolean ForLoopInText_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoopInText_3")) return false;
    boolean r;
    r = UnArgedForInText(b, l + 1);
    if (!r) r = ArgedForInText(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // VariableReference '.' 'for' ( UnArgedFor | ArgedFor)
  public static boolean ForStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableReference(b, l + 1);
    r = r && consumeTokens(b, 0, DOT, FOR);
    r = r && ForStatement_3(b, l + 1);
    exit_section_(b, m, FOR_STATEMENT, r);
    return r;
  }

  // UnArgedFor | ArgedFor
  private static boolean ForStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement_3")) return false;
    boolean r;
    r = UnArgedFor(b, l + 1);
    if (!r) r = ArgedFor(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // MultiValuedFunction | BinaryFunction | UnaryFunction | NoArgFunction
  public static boolean FunctionExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_EXPRESSION, "<function expression>");
    r = MultiValuedFunction(b, l + 1);
    if (!r) r = BinaryFunction(b, l + 1);
    if (!r) r = UnaryFunction(b, l + 1);
    if (!r) r = NoArgFunction(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STRING_LITERAL ':' (Expression | FillableTextTemplate)
  public static boolean HeaderPair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeaderPair")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STRING_LITERAL, COLON);
    r = r && HeaderPair_2(b, l + 1);
    exit_section_(b, m, HEADER_PAIR, r);
    return r;
  }

  // Expression | FillableTextTemplate
  private static boolean HeaderPair_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeaderPair_2")) return false;
    boolean r;
    r = Expression(b, l + 1);
    if (!r) r = FillableTextTemplate(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'headers' ExtractableHeaders ('and' 'body' ExtractableTemplate)?
  public static boolean HeadersStartingRestData(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeadersStartingRestData")) return false;
    if (!nextTokenIs(b, HEADERS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HEADERS);
    r = r && ExtractableHeaders(b, l + 1);
    r = r && HeadersStartingRestData_2(b, l + 1);
    exit_section_(b, m, HEADERS_STARTING_REST_DATA, r);
    return r;
  }

  // ('and' 'body' ExtractableTemplate)?
  private static boolean HeadersStartingRestData_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeadersStartingRestData_2")) return false;
    HeadersStartingRestData_2_0(b, l + 1);
    return true;
  }

  // 'and' 'body' ExtractableTemplate
  private static boolean HeadersStartingRestData_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeadersStartingRestData_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AND, BODY);
    r = r && ExtractableTemplate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'if' Expression '{' Statement* '}' ('else' 'if' '{' Statement* '}')* ('else' '{' Statement* '}')?
  public static boolean IfElseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfElseStatement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && IfElseStatement_3(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    r = r && IfElseStatement_5(b, l + 1);
    r = r && IfElseStatement_6(b, l + 1);
    exit_section_(b, m, IF_ELSE_STATEMENT, r);
    return r;
  }

  // Statement*
  private static boolean IfElseStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfElseStatement_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IfElseStatement_3", c)) break;
    }
    return true;
  }

  // ('else' 'if' '{' Statement* '}')*
  private static boolean IfElseStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfElseStatement_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!IfElseStatement_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IfElseStatement_5", c)) break;
    }
    return true;
  }

  // 'else' 'if' '{' Statement* '}'
  private static boolean IfElseStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfElseStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ELSE, IF, LBRACE);
    r = r && IfElseStatement_5_0_3(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // Statement*
  private static boolean IfElseStatement_5_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfElseStatement_5_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IfElseStatement_5_0_3", c)) break;
    }
    return true;
  }

  // ('else' '{' Statement* '}')?
  private static boolean IfElseStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfElseStatement_6")) return false;
    IfElseStatement_6_0(b, l + 1);
    return true;
  }

  // 'else' '{' Statement* '}'
  private static boolean IfElseStatement_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfElseStatement_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ELSE, LBRACE);
    r = r && IfElseStatement_6_0_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // Statement*
  private static boolean IfElseStatement_6_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfElseStatement_6_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IfElseStatement_6_0_2", c)) break;
    }
    return true;
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
  // 'let' VariableReference '=' Assignable
  public static boolean LetStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetStatement")) return false;
    if (!nextTokenIs(b, LET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LET);
    r = r && VariableReference(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && Assignable(b, l + 1);
    exit_section_(b, m, LET_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // 'listen' 'on' Expression 'with' '{' StubPart* '}'
  public static boolean ListenerStep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListenerStep")) return false;
    if (!nextTokenIs(b, LISTEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LISTEN, ON);
    r = r && Expression(b, l + 1);
    r = r && consumeTokens(b, 0, WITH, LBRACE);
    r = r && ListenerStep_5(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, LISTENER_STEP, r);
    return r;
  }

  // StubPart*
  private static boolean ListenerStep_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListenerStep_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!StubPart(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ListenerStep_5", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'let' VariableReference '=' 'load' Expression ('from' 'sandbox' Expression)?
  public static boolean LoadStep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoadStep")) return false;
    if (!nextTokenIs(b, LET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LET);
    r = r && VariableReference(b, l + 1);
    r = r && consumeTokens(b, 0, ASSIGN, LOAD);
    r = r && Expression(b, l + 1);
    r = r && LoadStep_5(b, l + 1);
    exit_section_(b, m, LOAD_STEP, r);
    return r;
  }

  // ('from' 'sandbox' Expression)?
  private static boolean LoadStep_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoadStep_5")) return false;
    LoadStep_5_0(b, l + 1);
    return true;
  }

  // 'from' 'sandbox' Expression
  private static boolean LoadStep_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoadStep_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FROM, SANDBOX);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (VariableReference '.')? ('concat' | 'mul' | 'add') '(' (Expression (',' Expression)*)? ')'
  public static boolean MultiValuedFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiValuedFunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTI_VALUED_FUNCTION, "<multi valued function>");
    r = MultiValuedFunction_0(b, l + 1);
    r = r && MultiValuedFunction_1(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && MultiValuedFunction_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (VariableReference '.')?
  private static boolean MultiValuedFunction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiValuedFunction_0")) return false;
    MultiValuedFunction_0_0(b, l + 1);
    return true;
  }

  // VariableReference '.'
  private static boolean MultiValuedFunction_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiValuedFunction_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableReference(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'concat' | 'mul' | 'add'
  private static boolean MultiValuedFunction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiValuedFunction_1")) return false;
    boolean r;
    r = consumeToken(b, CONCAT);
    if (!r) r = consumeToken(b, MUL);
    if (!r) r = consumeToken(b, ADD);
    return r;
  }

  // (Expression (',' Expression)*)?
  private static boolean MultiValuedFunction_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiValuedFunction_3")) return false;
    MultiValuedFunction_3_0(b, l + 1);
    return true;
  }

  // Expression (',' Expression)*
  private static boolean MultiValuedFunction_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiValuedFunction_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && MultiValuedFunction_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' Expression)*
  private static boolean MultiValuedFunction_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiValuedFunction_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MultiValuedFunction_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MultiValuedFunction_3_0_1", c)) break;
    }
    return true;
  }

  // ',' Expression
  private static boolean MultiValuedFunction_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiValuedFunction_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (TEXT_LITERAL)? ('<%' VariableExpression '%>' TEXT_LITERAL)* ('<%' VariableExpression '%>')?
  public static boolean MultiVariableText(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiVariableText")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTI_VARIABLE_TEXT, "<multi variable text>");
    r = MultiVariableText_0(b, l + 1);
    r = r && MultiVariableText_1(b, l + 1);
    r = r && MultiVariableText_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (TEXT_LITERAL)?
  private static boolean MultiVariableText_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiVariableText_0")) return false;
    consumeToken(b, TEXT_LITERAL);
    return true;
  }

  // ('<%' VariableExpression '%>' TEXT_LITERAL)*
  private static boolean MultiVariableText_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiVariableText_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MultiVariableText_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MultiVariableText_1", c)) break;
    }
    return true;
  }

  // '<%' VariableExpression '%>' TEXT_LITERAL
  private static boolean MultiVariableText_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiVariableText_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SCRIPLET_START);
    r = r && VariableExpression(b, l + 1);
    r = r && consumeTokens(b, 0, SCRIPLET_END, TEXT_LITERAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('<%' VariableExpression '%>')?
  private static boolean MultiVariableText_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiVariableText_2")) return false;
    MultiVariableText_2_0(b, l + 1);
    return true;
  }

  // '<%' VariableExpression '%>'
  private static boolean MultiVariableText_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiVariableText_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SCRIPLET_START);
    r = r && VariableExpression(b, l + 1);
    r = r && consumeToken(b, SCRIPLET_END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' (Statement)* '}'
  public static boolean MultipleStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultipleStatement")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && MultipleStatement_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, MULTIPLE_STATEMENT, r);
    return r;
  }

  // (Statement)*
  private static boolean MultipleStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultipleStatement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MultipleStatement_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MultipleStatement_1", c)) break;
    }
    return true;
  }

  // (Statement)
  private static boolean MultipleStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultipleStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('uuid' |  'timestamp' | 'now' ) '('  ')'
  public static boolean NoArgFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NoArgFunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NO_ARG_FUNCTION, "<no arg function>");
    r = NoArgFunction_0(b, l + 1);
    r = r && consumeTokens(b, 0, LPAREN, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'uuid' |  'timestamp' | 'now'
  private static boolean NoArgFunction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NoArgFunction_0")) return false;
    boolean r;
    r = consumeToken(b, UUID);
    if (!r) r = consumeToken(b, TIMESTAMP);
    if (!r) r = consumeToken(b, NOW);
    return r;
  }

  /* ********************************************************** */
  // BracketedExpression | ConstantExpression | FunctionExpression | VariableExpression
  public static boolean NonOperatorExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonOperatorExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NON_OPERATOR_EXPRESSION, "<non operator expression>");
    r = BracketedExpression(b, l + 1);
    if (!r) r = ConstantExpression(b, l + 1);
    if (!r) r = FunctionExpression(b, l + 1);
    if (!r) r = VariableExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FillableForLoop | Expression | FillableMapTemplate | FillableArrayTemplate
  public static boolean ObjectValueTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectValueTemplate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_VALUE_TEMPLATE, "<object value template>");
    r = FillableForLoop(b, l + 1);
    if (!r) r = Expression(b, l + 1);
    if (!r) r = FillableMapTemplate(b, l + 1);
    if (!r) r = FillableArrayTemplate(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BinaryOperatorExpression | UnaryOperatorExpression
  public static boolean OperatorExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperatorExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR_EXPRESSION, "<operator expression>");
    r = BinaryOperatorExpression(b, l + 1);
    if (!r) r = UnaryOperatorExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'print' FillableTextTemplate
  public static boolean PrintStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrintStatement")) return false;
    if (!nextTokenIs(b, PRINT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PRINT);
    r = r && FillableTextTemplate(b, l + 1);
    exit_section_(b, m, PRINT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // VariableReference '.' 'push' ( Expression )
  public static boolean PushStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PushStatement")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableReference(b, l + 1);
    r = r && consumeTokens(b, 0, DOT, PUSH);
    r = r && PushStatement_3(b, l + 1);
    exit_section_(b, m, PUSH_STATEMENT, r);
    return r;
  }

  // ( Expression )
  private static boolean PushStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PushStatement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('async')? RestVerb FillableRequestTemplate ( 'matching' (HeadersStartingRestData | BodyStartingRestData))?
  public static boolean RestStep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestStep")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REST_STEP, "<rest step>");
    r = RestStep_0(b, l + 1);
    r = r && RestVerb(b, l + 1);
    r = r && FillableRequestTemplate(b, l + 1);
    r = r && RestStep_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('async')?
  private static boolean RestStep_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestStep_0")) return false;
    consumeToken(b, ASYNC);
    return true;
  }

  // ( 'matching' (HeadersStartingRestData | BodyStartingRestData))?
  private static boolean RestStep_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestStep_3")) return false;
    RestStep_3_0(b, l + 1);
    return true;
  }

  // 'matching' (HeadersStartingRestData | BodyStartingRestData)
  private static boolean RestStep_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestStep_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MATCHING);
    r = r && RestStep_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // HeadersStartingRestData | BodyStartingRestData
  private static boolean RestStep_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestStep_3_0_1")) return false;
    boolean r;
    r = HeadersStartingRestData(b, l + 1);
    if (!r) r = BodyStartingRestData(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'get' | 'put' | 'post' | 'patch' | 'delete'
  public static boolean RestVerb(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestVerb")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REST_VERB, "<rest verb>");
    r = consumeToken(b, GET);
    if (!r) r = consumeToken(b, PUT);
    if (!r) r = consumeToken(b, POST);
    if (!r) r = consumeToken(b, PATCH);
    if (!r) r = consumeToken(b, DELETE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // JourneyName '(' ')' '{' Statement* '}'
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
  // '<%' (TextScript) '%>'
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
  // '<%' VariableExpression '%>'
  public static boolean SingleVariableText(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleVariableText")) return false;
    if (!nextTokenIs(b, SCRIPLET_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SCRIPLET_START);
    r = r && VariableExpression(b, l + 1);
    r = r && consumeToken(b, SCRIPLET_END);
    exit_section_(b, m, SINGLE_VARIABLE_TEXT, r);
    return r;
  }

  /* ********************************************************** */
  // PrintStatement | PushStatement| ForStatement | LoadStep | SyncStep | ListenerStep | IfElseStatement | LetStatement | RestStep
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = PrintStatement(b, l + 1);
    if (!r) r = PushStatement(b, l + 1);
    if (!r) r = ForStatement(b, l + 1);
    if (!r) r = LoadStep(b, l + 1);
    if (!r) r = SyncStep(b, l + 1);
    if (!r) r = ListenerStep(b, l + 1);
    if (!r) r = IfElseStatement(b, l + 1);
    if (!r) r = LetStatement(b, l + 1);
    if (!r) r = RestStep(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'on' RestVerb 'with' 'url' ExtractableText ( 'matching' 'request' (HeadersStartingRestData | BodyStartingRestData))? '{' Statement* 'respond' 'with' 'body' Expression '}'
  public static boolean StubPart(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StubPart")) return false;
    if (!nextTokenIs(b, ON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ON);
    r = r && RestVerb(b, l + 1);
    r = r && consumeTokens(b, 0, WITH, URL);
    r = r && ExtractableText(b, l + 1);
    r = r && StubPart_5(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && StubPart_7(b, l + 1);
    r = r && consumeTokens(b, 0, RESPOND, WITH, BODY);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, STUB_PART, r);
    return r;
  }

  // ( 'matching' 'request' (HeadersStartingRestData | BodyStartingRestData))?
  private static boolean StubPart_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StubPart_5")) return false;
    StubPart_5_0(b, l + 1);
    return true;
  }

  // 'matching' 'request' (HeadersStartingRestData | BodyStartingRestData)
  private static boolean StubPart_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StubPart_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MATCHING, REQUEST);
    r = r && StubPart_5_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // HeadersStartingRestData | BodyStartingRestData
  private static boolean StubPart_5_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StubPart_5_0_2")) return false;
    boolean r;
    r = HeadersStartingRestData(b, l + 1);
    if (!r) r = BodyStartingRestData(b, l + 1);
    return r;
  }

  // Statement*
  private static boolean StubPart_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StubPart_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StubPart_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'sync' VariableReference ('to' 'sandbox' Expression)?
  public static boolean SyncStep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SyncStep")) return false;
    if (!nextTokenIs(b, SYNC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYNC);
    r = r && VariableReference(b, l + 1);
    r = r && SyncStep_2(b, l + 1);
    exit_section_(b, m, SYNC_STEP, r);
    return r;
  }

  // ('to' 'sandbox' Expression)?
  private static boolean SyncStep_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SyncStep_2")) return false;
    SyncStep_2_0(b, l + 1);
    return true;
  }

  // 'to' 'sandbox' Expression
  private static boolean SyncStep_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SyncStep_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TO, SANDBOX);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
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
  // ForLoopInText | Expression
  public static boolean TextScript(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TextScript")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEXT_SCRIPT, "<text script>");
    r = ForLoopInText(b, l + 1);
    if (!r) r = Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '`' TextBlock* '`'
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
  // 'String' | 'Boolean' | 'PositiveInteger' | 'Integer' | 'Double'
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
  // Statement | MultipleStatement
  public static boolean UnArgedFor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnArgedFor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UN_ARGED_FOR, "<un arged for>");
    r = Statement(b, l + 1);
    if (!r) r = MultipleStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ForBlockForText
  public static boolean UnArgedForInText(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnArgedForInText")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UN_ARGED_FOR_IN_TEXT, "<un arged for in text>");
    r = ForBlockForText(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (VariableReference '.' ('fake' | 'from_json' | 'random_element' | 'encode' | 'now'  ) '('')')|(('fake' | 'from_json' | 'random_element' | 'encode' | 'now'  ) '(' Expression  ')')
  public static boolean UnaryFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryFunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_FUNCTION, "<unary function>");
    r = UnaryFunction_0(b, l + 1);
    if (!r) r = UnaryFunction_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // VariableReference '.' ('fake' | 'from_json' | 'random_element' | 'encode' | 'now'  ) '('')'
  private static boolean UnaryFunction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryFunction_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableReference(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && UnaryFunction_0_2(b, l + 1);
    r = r && consumeTokens(b, 0, LPAREN, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'fake' | 'from_json' | 'random_element' | 'encode' | 'now'
  private static boolean UnaryFunction_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryFunction_0_2")) return false;
    boolean r;
    r = consumeToken(b, FAKE);
    if (!r) r = consumeToken(b, FROMJSON);
    if (!r) r = consumeToken(b, RANDOMELEMENT);
    if (!r) r = consumeToken(b, ENCODE);
    if (!r) r = consumeToken(b, NOW);
    return r;
  }

  // ('fake' | 'from_json' | 'random_element' | 'encode' | 'now'  ) '(' Expression  ')'
  private static boolean UnaryFunction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryFunction_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnaryFunction_1_0(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'fake' | 'from_json' | 'random_element' | 'encode' | 'now'
  private static boolean UnaryFunction_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryFunction_1_0")) return false;
    boolean r;
    r = consumeToken(b, FAKE);
    if (!r) r = consumeToken(b, FROMJSON);
    if (!r) r = consumeToken(b, RANDOMELEMENT);
    if (!r) r = consumeToken(b, ENCODE);
    if (!r) r = consumeToken(b, NOW);
    return r;
  }

  /* ********************************************************** */
  // '++' | '--'
  public static boolean UnaryOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryOperator")) return false;
    if (!nextTokenIs(b, "<unary operator>", OP_DECREMENT, OP_INCREMENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_OPERATOR, "<unary operator>");
    r = consumeToken(b, OP_INCREMENT);
    if (!r) r = consumeToken(b, OP_DECREMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NonOperatorExpression UnaryOperator
  public static boolean UnaryOperatorExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryOperatorExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_OPERATOR_EXPRESSION, "<unary operator expression>");
    r = NonOperatorExpression(b, l + 1);
    r = r && UnaryOperator(b, l + 1);
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
  // identifier ('.' identifier)*
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

  // ('.' identifier)*
  private static boolean VariableReference_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReference_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!VariableReference_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VariableReference_1", c)) break;
    }
    return true;
  }

  // '.' identifier
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
