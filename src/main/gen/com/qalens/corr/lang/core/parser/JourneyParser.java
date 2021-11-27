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
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
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

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ASSIGNMENT_STEP, IF_ELSE_STEP, LISTENER_STEP, PRINT_STEP,
      REST_STEP, STEP, SYNC_STEP, VARIABLE_ACTION_STEP),
  };

  /* ********************************************************** */
  // '(' ( (VariableReference ',' VariableReference) | VariableReference?) ')' '=>' (Block | Step)
  public static boolean ArgedFor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgedFor")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ARGED_FOR, null);
    r = consumeToken(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, ArgedFor_1(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, RPAREN, FATARROW)) && r;
    r = p && ArgedFor_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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

  // Block | Step
  private static boolean ArgedFor_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgedFor_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Block(b, l + 1);
    if (!r) r = Step(b, l + 1);
    exit_section_(b, m, null, r);
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
  // 'let' VariableReference '=' (Assignable | ('load' Expression ('from' 'sandbox' Expression)?))
  public static boolean AssignmentStep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentStep")) return false;
    if (!nextTokenIs(b, LET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_STEP, null);
    r = consumeToken(b, LET);
    p = r; // pin = 1
    r = r && report_error_(b, VariableReference(b, l + 1));
    r = p && report_error_(b, consumeToken(b, ASSIGN)) && r;
    r = p && AssignmentStep_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Assignable | ('load' Expression ('from' 'sandbox' Expression)?)
  private static boolean AssignmentStep_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentStep_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Assignable(b, l + 1);
    if (!r) r = AssignmentStep_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'load' Expression ('from' 'sandbox' Expression)?
  private static boolean AssignmentStep_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentStep_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOAD);
    r = r && Expression(b, l + 1);
    r = r && AssignmentStep_3_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('from' 'sandbox' Expression)?
  private static boolean AssignmentStep_3_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentStep_3_1_2")) return false;
    AssignmentStep_3_1_2_0(b, l + 1);
    return true;
  }

  // 'from' 'sandbox' Expression
  private static boolean AssignmentStep_3_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentStep_3_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FROM, SANDBOX);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (VariableReference '.' ('round' |'unique_random_elements'| 'random' | 'sub' | 'div' | 'mod' | 'left' | 'right' | 'array') '(' Expression ')') | (('round' | 'random'|'unique_random_elements' | 'sub' | 'div' | 'mod' | 'left' | 'right' | 'array') '(' (Expression ',' Expression)  ')')
  public static boolean BinaryFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryFunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_FUNCTION, "<binary function>");
    r = BinaryFunction_0(b, l + 1);
    if (!r) r = BinaryFunction_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // VariableReference '.' ('round' |'unique_random_elements'| 'random' | 'sub' | 'div' | 'mod' | 'left' | 'right' | 'array') '(' Expression ')'
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

  // 'round' |'unique_random_elements'| 'random' | 'sub' | 'div' | 'mod' | 'left' | 'right' | 'array'
  private static boolean BinaryFunction_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryFunction_0_2")) return false;
    boolean r;
    r = consumeToken(b, ROUND);
    if (!r) r = consumeToken(b, UNIQUERANDOMELEMENTS);
    if (!r) r = consumeToken(b, RANDOM);
    if (!r) r = consumeToken(b, SUB);
    if (!r) r = consumeToken(b, DIV);
    if (!r) r = consumeToken(b, MOD);
    if (!r) r = consumeToken(b, LEFT);
    if (!r) r = consumeToken(b, RIGHT);
    if (!r) r = consumeToken(b, ARRAY);
    return r;
  }

  // ('round' | 'random'|'unique_random_elements' | 'sub' | 'div' | 'mod' | 'left' | 'right' | 'array') '(' (Expression ',' Expression)  ')'
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

  // 'round' | 'random'|'unique_random_elements' | 'sub' | 'div' | 'mod' | 'left' | 'right' | 'array'
  private static boolean BinaryFunction_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryFunction_1_0")) return false;
    boolean r;
    r = consumeToken(b, ROUND);
    if (!r) r = consumeToken(b, RANDOM);
    if (!r) r = consumeToken(b, UNIQUERANDOMELEMENTS);
    if (!r) r = consumeToken(b, SUB);
    if (!r) r = consumeToken(b, DIV);
    if (!r) r = consumeToken(b, MOD);
    if (!r) r = consumeToken(b, LEFT);
    if (!r) r = consumeToken(b, RIGHT);
    if (!r) r = consumeToken(b, ARRAY);
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
  // '+' | '-' | '/' | '*' | '%' | '==' | '!=' | '>=' | '<=' | '>' | '<'
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
    if (!r) r = consumeToken(b, OP_NOTEQUAL);
    if (!r) r = consumeToken(b, OP_GE);
    if (!r) r = consumeToken(b, OP_LE);
    if (!r) r = consumeToken(b, OP_GT);
    if (!r) r = consumeToken(b, OP_LT);
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
  // '{' Step* '}'
  public static boolean Block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Block")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BLOCK, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, Block_1(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Step*
  private static boolean Block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Step(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'body' ExtractableTemplate
  public static boolean BodyDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BodyDeclaration")) return false;
    if (!nextTokenIs(b, BODY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BODY_DECLARATION, null);
    r = consumeToken(b, BODY);
    p = r; // pin = 1
    r = r && ExtractableTemplate(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // BodyDeclaration ('and' HeadersDeclaration)?
  public static boolean BodyStartingRestData(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BodyStartingRestData")) return false;
    if (!nextTokenIs(b, BODY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BODY_STARTING_REST_DATA, null);
    r = BodyDeclaration(b, l + 1);
    p = r; // pin = 1
    r = r && BodyStartingRestData_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('and' HeadersDeclaration)?
  private static boolean BodyStartingRestData_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BodyStartingRestData_1")) return false;
    BodyStartingRestData_1_0(b, l + 1);
    return true;
  }

  // 'and' HeadersDeclaration
  private static boolean BodyStartingRestData_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BodyStartingRestData_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && HeadersDeclaration(b, l + 1);
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
  // Step*
  public static boolean CalculationSteps(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CalculationSteps")) return false;
    Marker m = enter_section_(b, l, _NONE_, CALCULATION_STEPS, "<calculation steps>");
    while (true) {
      int c = current_position_(b);
      if (!Step(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CalculationSteps", c)) break;
    }
    exit_section_(b, l, m, true, false, JourneyParser::recoverCalculationSteps);
    return true;
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
  // STRING_LITERAL ':' VariableReference
  public static boolean ExtractableField(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableField")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXTRACTABLE_FIELD, "<extractable field>");
    r = consumeTokens(b, 1, STRING_LITERAL, COLON);
    p = r; // pin = 1
    r = r && VariableReference(b, l + 1);
    exit_section_(b, l, m, r, p, JourneyParser::recoverExtractableField);
    return r || p;
  }

  /* ********************************************************** */
  // VariableReference '.' 'for' '(' VariableReference ')' '=>' ExtractableObjectTemplate
  public static boolean ExtractableForLoop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableForLoop")) return false;
    if (!nextTokenIs(b, "<extractable for loop>", IDENTIFIER, NAME)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXTRACTABLE_FOR_LOOP, "<extractable for loop>");
    r = VariableReference(b, l + 1);
    r = r && consumeTokens(b, 2, DOT, FOR, LPAREN);
    p = r; // pin = 3
    r = r && report_error_(b, VariableReference(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, RPAREN, FATARROW)) && r;
    r = p && ExtractableObjectTemplate(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'form' ExtractableFormTemplate
  public static boolean ExtractableForm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableForm")) return false;
    if (!nextTokenIs(b, FORM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXTRACTABLE_FORM, null);
    r = consumeToken(b, FORM);
    p = r; // pin = 1
    r = r && ExtractableFormTemplate(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '{'  ExtractableField (',' ExtractableField )* '}'
  public static boolean ExtractableFormTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableFormTemplate")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXTRACTABLE_FORM_TEMPLATE, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, ExtractableField(b, l + 1));
    r = p && report_error_(b, ExtractableFormTemplate_2(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (',' ExtractableField )*
  private static boolean ExtractableFormTemplate_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableFormTemplate_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ExtractableFormTemplate_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ExtractableFormTemplate_2", c)) break;
    }
    return true;
  }

  // ',' ExtractableField
  private static boolean ExtractableFormTemplate_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableFormTemplate_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ExtractableField(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' STRING_LITERAL ':' VariableReference (',' STRING_LITERAL ':' VariableReference)* '}'
  public static boolean ExtractableHeaders(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableHeaders")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXTRACTABLE_HEADERS, null);
    r = consumeTokens(b, 1, LBRACE, STRING_LITERAL, COLON);
    p = r; // pin = 1
    r = r && report_error_(b, VariableReference(b, l + 1));
    r = p && report_error_(b, ExtractableHeaders_4(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // 'object' ExtractableObjectTemplate
  public static boolean ExtractableObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableObject")) return false;
    if (!nextTokenIs(b, OBJECT_TEMPLATE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXTRACTABLE_OBJECT, null);
    r = consumeToken(b, OBJECT_TEMPLATE);
    p = r; // pin = 1
    r = r && ExtractableObjectTemplate(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '{' ExtractablePair ( ',' ExtractablePair)* '}'
  public static boolean ExtractableObjectMap(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableObjectMap")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXTRACTABLE_OBJECT_MAP, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, ExtractablePair(b, l + 1));
    r = p && report_error_(b, ExtractableObjectMap_2(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // ExtractableObjectMap | ExtractableStaticArray | ExtractableForLoop | VariableReference
  public static boolean ExtractableObjectTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableObjectTemplate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXTRACTABLE_OBJECT_TEMPLATE, "<extractable object template>");
    r = ExtractableObjectMap(b, l + 1);
    if (!r) r = ExtractableStaticArray(b, l + 1);
    if (!r) r = ExtractableForLoop(b, l + 1);
    if (!r) r = VariableReference(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STRING_LITERAL ':' ExtractableObjectTemplate
  public static boolean ExtractablePair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractablePair")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXTRACTABLE_PAIR, "<extractable pair>");
    r = consumeTokens(b, 1, STRING_LITERAL, COLON);
    p = r; // pin = 1
    r = r && ExtractableObjectTemplate(b, l + 1);
    exit_section_(b, l, m, r, p, JourneyParser::recoverExtractablePair);
    return r || p;
  }

  /* ********************************************************** */
  // '[' ExtractableObjectTemplate (',' ExtractableObjectTemplate)* ']'
  public static boolean ExtractableStaticArray(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableStaticArray")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXTRACTABLE_STATIC_ARRAY, null);
    r = consumeToken(b, LBRACK);
    p = r; // pin = 1
    r = r && report_error_(b, ExtractableObjectTemplate(b, l + 1));
    r = p && report_error_(b, ExtractableStaticArray_2(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACK) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // ExtractableObject | ExtractableForm
  public static boolean ExtractableTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableTemplate")) return false;
    if (!nextTokenIs(b, "<extractable template>", FORM, OBJECT_TEMPLATE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXTRACTABLE_TEMPLATE, "<extractable template>");
    r = ExtractableObject(b, l + 1);
    if (!r) r = ExtractableForm(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
    if (!nextTokenIs(b, "<fillable for loop>", IDENTIFIER, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FILLABLE_FOR_LOOP, "<fillable for loop>");
    r = VariableReference(b, l + 1);
    r = r && consumeTokens(b, 0, DOT, FOR);
    r = r && FillableForLoop_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FILLABLE_HEADERS, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, HeaderPair(b, l + 1));
    r = p && report_error_(b, FillableHeaders_2(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FILLABLE_OBJECT_TEMPLATE, null);
    r = consumeToken(b, OBJECT_TEMPLATE);
    p = r; // pin = 1
    r = r && ObjectValueTemplate(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'request' '{'
  //         RequestTemplatePart
  //    '}'
  public static boolean FillableRequestTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FillableRequestTemplate")) return false;
    if (!nextTokenIs(b, REQUEST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FILLABLE_REQUEST_TEMPLATE, null);
    r = consumeTokens(b, 2, REQUEST, LBRACE);
    p = r; // pin = 2
    r = r && report_error_(b, RequestTemplatePart(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    if (!nextTokenIs(b, "<for loop in text>", IDENTIFIER, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_LOOP_IN_TEXT, "<for loop in text>");
    r = VariableReference(b, l + 1);
    r = r && consumeTokens(b, 0, DOT, FOR);
    r = r && ForLoopInText_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // 'for' ( ArgedFor | UnArgedFor )
  public static boolean ForStepPart(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStepPart")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FOR_STEP_PART, null);
    r = consumeToken(b, FOR);
    p = r; // pin = 1
    r = r && ForStepPart_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ArgedFor | UnArgedFor
  private static boolean ForStepPart_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStepPart_1")) return false;
    boolean r;
    r = ArgedFor(b, l + 1);
    if (!r) r = UnArgedFor(b, l + 1);
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
  // 'headers' ExtractableHeaders
  public static boolean HeadersDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeadersDeclaration")) return false;
    if (!nextTokenIs(b, HEADERS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, HEADERS_DECLARATION, null);
    r = consumeToken(b, HEADERS);
    p = r; // pin = 1
    r = r && ExtractableHeaders(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // HeadersDeclaration ('and' BodyDeclaration)?
  public static boolean HeadersStartingRestData(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeadersStartingRestData")) return false;
    if (!nextTokenIs(b, HEADERS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, HEADERS_STARTING_REST_DATA, null);
    r = HeadersDeclaration(b, l + 1);
    p = r; // pin = 1
    r = r && HeadersStartingRestData_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('and' BodyDeclaration)?
  private static boolean HeadersStartingRestData_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeadersStartingRestData_1")) return false;
    HeadersStartingRestData_1_0(b, l + 1);
    return true;
  }

  // 'and' BodyDeclaration
  private static boolean HeadersStartingRestData_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeadersStartingRestData_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && BodyDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'if' Expression Block ('else' 'if' Expression Block)* ('else' Block)?
  public static boolean IfElseStep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfElseStep")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_ELSE_STEP, null);
    r = consumeToken(b, IF);
    p = r; // pin = 1
    r = r && report_error_(b, Expression(b, l + 1));
    r = p && report_error_(b, Block(b, l + 1)) && r;
    r = p && report_error_(b, IfElseStep_3(b, l + 1)) && r;
    r = p && IfElseStep_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('else' 'if' Expression Block)*
  private static boolean IfElseStep_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfElseStep_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!IfElseStep_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IfElseStep_3", c)) break;
    }
    return true;
  }

  // 'else' 'if' Expression Block
  private static boolean IfElseStep_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfElseStep_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ELSE, IF);
    r = r && Expression(b, l + 1);
    r = r && Block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('else' Block)?
  private static boolean IfElseStep_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfElseStep_4")) return false;
    IfElseStep_4_0(b, l + 1);
    return true;
  }

  // 'else' Block
  private static boolean IfElseStep_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfElseStep_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && Block(b, l + 1);
    exit_section_(b, m, null, r);
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
  // 'listen' 'on' Expression StubDefinitionBlock
  public static boolean ListenerStep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListenerStep")) return false;
    if (!nextTokenIs(b, LISTEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LISTENER_STEP, null);
    r = consumeTokens(b, 1, LISTEN, ON);
    p = r; // pin = 1
    r = r && report_error_(b, Expression(b, l + 1));
    r = p && StubDefinitionBlock(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (VariableReference '.')? ('concat' | 'mul' | 'add' | 'lpad' | 'rpad' | 'mid') '(' (Expression (',' Expression)*)? ')'
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

  // 'concat' | 'mul' | 'add' | 'lpad' | 'rpad' | 'mid'
  private static boolean MultiValuedFunction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiValuedFunction_1")) return false;
    boolean r;
    r = consumeToken(b, CONCAT);
    if (!r) r = consumeToken(b, MUL);
    if (!r) r = consumeToken(b, ADD);
    if (!r) r = consumeToken(b, LPAD);
    if (!r) r = consumeToken(b, RPAD);
    if (!r) r = consumeToken(b, MID);
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
  // BracketedExpression | FillableObjectTemplate | ConstantExpression | FunctionExpression | VariableExpression
  public static boolean NonOperatorExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonOperatorExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NON_OPERATOR_EXPRESSION, "<non operator expression>");
    r = BracketedExpression(b, l + 1);
    if (!r) r = FillableObjectTemplate(b, l + 1);
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
  public static boolean PrintStep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrintStep")) return false;
    if (!nextTokenIs(b, PRINT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PRINT_STEP, null);
    r = consumeToken(b, PRINT);
    p = r; // pin = 1
    r = r && FillableTextTemplate(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'push' ( Expression )
  public static boolean PushStepPart(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PushStepPart")) return false;
    if (!nextTokenIs(b, PUSH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PUSH_STEP_PART, null);
    r = consumeToken(b, PUSH);
    p = r; // pin = 1
    r = r && PushStepPart_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ( Expression )
  private static boolean PushStepPart_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PushStepPart_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'matching' 'request' (HeadersStartingRestData | BodyStartingRestData)
  public static boolean RequestExtractor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RequestExtractor")) return false;
    if (!nextTokenIs(b, MATCHING)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, REQUEST_EXTRACTOR, null);
    r = consumeTokens(b, 1, MATCHING, REQUEST);
    p = r; // pin = 1
    r = r && RequestExtractor_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // HeadersStartingRestData | BodyStartingRestData
  private static boolean RequestExtractor_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RequestExtractor_2")) return false;
    boolean r;
    r = HeadersStartingRestData(b, l + 1);
    if (!r) r = BodyStartingRestData(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'with' 'url' ExtractableText
  public static boolean RequestMatcher(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RequestMatcher")) return false;
    if (!nextTokenIs(b, WITH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, REQUEST_MATCHER, null);
    r = consumeTokens(b, 1, WITH, URL);
    p = r; // pin = 1
    r = r && ExtractableText(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'url' ':' (Expression | FillableTextTemplate)
  //                         ( ',' 'body' ':' FillableObjectTemplate)?
  //                         ( ',' 'headers' ':' FillableHeaders)?
  public static boolean RequestTemplatePart(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RequestTemplatePart")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, REQUEST_TEMPLATE_PART, "<request template part>");
    r = consumeTokens(b, 1, URL, COLON);
    p = r; // pin = 1
    r = r && report_error_(b, RequestTemplatePart_2(b, l + 1));
    r = p && report_error_(b, RequestTemplatePart_3(b, l + 1)) && r;
    r = p && RequestTemplatePart_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, JourneyParser::recoverRequestTemplatePart);
    return r || p;
  }

  // Expression | FillableTextTemplate
  private static boolean RequestTemplatePart_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RequestTemplatePart_2")) return false;
    boolean r;
    r = Expression(b, l + 1);
    if (!r) r = FillableTextTemplate(b, l + 1);
    return r;
  }

  // ( ',' 'body' ':' FillableObjectTemplate)?
  private static boolean RequestTemplatePart_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RequestTemplatePart_3")) return false;
    RequestTemplatePart_3_0(b, l + 1);
    return true;
  }

  // ',' 'body' ':' FillableObjectTemplate
  private static boolean RequestTemplatePart_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RequestTemplatePart_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, BODY, COLON);
    r = r && FillableObjectTemplate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' 'headers' ':' FillableHeaders)?
  private static boolean RequestTemplatePart_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RequestTemplatePart_4")) return false;
    RequestTemplatePart_4_0(b, l + 1);
    return true;
  }

  // ',' 'headers' ':' FillableHeaders
  private static boolean RequestTemplatePart_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RequestTemplatePart_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, HEADERS, COLON);
    r = r && FillableHeaders(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' CalculationSteps ResponseLine '}'
  public static boolean ResponseGenerator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ResponseGenerator")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RESPONSE_GENERATOR, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, CalculationSteps(b, l + 1));
    r = p && report_error_(b, ResponseLine(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'respond' 'with' ('status' Expression 'and')? 'body' Expression
  public static boolean ResponseLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ResponseLine")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RESPONSE_LINE, "<response line>");
    r = consumeTokens(b, 1, RESPOND, WITH);
    p = r; // pin = 1
    r = r && report_error_(b, ResponseLine_2(b, l + 1));
    r = p && report_error_(b, consumeToken(b, BODY)) && r;
    r = p && Expression(b, l + 1) && r;
    exit_section_(b, l, m, r, p, JourneyParser::recoverStep);
    return r || p;
  }

  // ('status' Expression 'and')?
  private static boolean ResponseLine_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ResponseLine_2")) return false;
    ResponseLine_2_0(b, l + 1);
    return true;
  }

  // 'status' Expression 'and'
  private static boolean ResponseLine_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ResponseLine_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STATUS);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, AND);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('async')? RestVerb FillableRequestTemplate ( 'matching' (HeadersStartingRestData | BodyStartingRestData))?
  public static boolean RestStep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestStep")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, REST_STEP, "<rest step>");
    r = RestStep_0(b, l + 1);
    r = r && RestVerb(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, FillableRequestTemplate(b, l + 1));
    r = p && RestStep_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // JourneyName '(' ')' Block
  public static boolean RootFn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RootFn")) return false;
    if (!nextTokenIs(b, "<root fn>", IDENTIFIER, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ROOT_FN, "<root fn>");
    r = JourneyName(b, l + 1);
    r = r && consumeTokens(b, 0, LPAREN, RPAREN);
    r = r && Block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // PrintStep | AssignmentStep | SyncStep | ListenerStep | IfElseStep  | RestStep | VariableActionStep
  public static boolean Step(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Step")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, STEP, "<step>");
    r = PrintStep(b, l + 1);
    if (!r) r = AssignmentStep(b, l + 1);
    if (!r) r = SyncStep(b, l + 1);
    if (!r) r = ListenerStep(b, l + 1);
    if (!r) r = IfElseStep(b, l + 1);
    if (!r) r = RestStep(b, l + 1);
    if (!r) r = VariableActionStep(b, l + 1);
    exit_section_(b, l, m, r, false, JourneyParser::recoverStep);
    return r;
  }

  /* ********************************************************** */
  // 'let' | 'sync' | 'listen' | 'if' | 'async' | 'print' | '}' | 'respond' | RestVerb | identifier
  static boolean StepStart(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StepStart")) return false;
    boolean r;
    r = consumeToken(b, LET);
    if (!r) r = consumeToken(b, SYNC);
    if (!r) r = consumeToken(b, LISTEN);
    if (!r) r = consumeToken(b, IF);
    if (!r) r = consumeToken(b, ASYNC);
    if (!r) r = consumeToken(b, PRINT);
    if (!r) r = consumeToken(b, RBRACE);
    if (!r) r = consumeToken(b, RESPOND);
    if (!r) r = RestVerb(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  /* ********************************************************** */
  // 'on' RestVerb RequestMatcher RequestExtractor? ResponseGenerator
  public static boolean StubDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StubDefinition")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STUB_DEFINITION, "<stub definition>");
    r = consumeToken(b, ON);
    p = r; // pin = 1
    r = r && report_error_(b, RestVerb(b, l + 1));
    r = p && report_error_(b, RequestMatcher(b, l + 1)) && r;
    r = p && report_error_(b, StubDefinition_3(b, l + 1)) && r;
    r = p && ResponseGenerator(b, l + 1) && r;
    exit_section_(b, l, m, r, p, JourneyParser::recoverStubDefinition);
    return r || p;
  }

  // RequestExtractor?
  private static boolean StubDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StubDefinition_3")) return false;
    RequestExtractor(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'with' '{' StubDefinition* '}'
  public static boolean StubDefinitionBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StubDefinitionBlock")) return false;
    if (!nextTokenIs(b, WITH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STUB_DEFINITION_BLOCK, null);
    r = consumeTokens(b, 1, WITH, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, StubDefinitionBlock_2(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // StubDefinition*
  private static boolean StubDefinitionBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StubDefinitionBlock_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!StubDefinition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StubDefinitionBlock_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'sync' VariableReference ('to' 'sandbox' Expression)?
  public static boolean SyncStep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SyncStep")) return false;
    if (!nextTokenIs(b, SYNC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SYNC_STEP, null);
    r = consumeToken(b, SYNC);
    p = r; // pin = 1
    r = r && report_error_(b, VariableReference(b, l + 1));
    r = p && SyncStep_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // Step | Block
  public static boolean UnArgedFor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnArgedFor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UN_ARGED_FOR, "<un arged for>");
    r = Step(b, l + 1);
    if (!r) r = Block(b, l + 1);
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
  // VariableReference '.' (PushStepPart|ForStepPart)
  public static boolean VariableActionStep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableActionStep")) return false;
    if (!nextTokenIs(b, "<variable action step>", IDENTIFIER, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_ACTION_STEP, "<variable action step>");
    r = VariableReference(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && VariableActionStep_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PushStepPart|ForStepPart
  private static boolean VariableActionStep_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableActionStep_2")) return false;
    boolean r;
    r = PushStepPart(b, l + 1);
    if (!r) r = ForStepPart(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // VariableReference (':' Type)?
  public static boolean VariableExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableExpression")) return false;
    if (!nextTokenIs(b, "<variable expression>", IDENTIFIER, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_EXPRESSION, "<variable expression>");
    r = VariableReference(b, l + 1);
    r = r && VariableExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // ( NAME  |  identifier) ('.' ( NAME | identifier) )*
  public static boolean VariableReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReference")) return false;
    if (!nextTokenIs(b, "<variable reference>", IDENTIFIER, NAME)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_REFERENCE, "<variable reference>");
    r = VariableReference_0(b, l + 1);
    p = r; // pin = 1
    r = r && VariableReference_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // NAME  |  identifier
  private static boolean VariableReference_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReference_0")) return false;
    boolean r;
    r = consumeToken(b, NAME);
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  // ('.' ( NAME | identifier) )*
  private static boolean VariableReference_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReference_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!VariableReference_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VariableReference_1", c)) break;
    }
    return true;
  }

  // '.' ( NAME | identifier)
  private static boolean VariableReference_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReference_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && VariableReference_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NAME | identifier
  private static boolean VariableReference_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReference_1_0_1")) return false;
    boolean r;
    r = consumeToken(b, NAME);
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  /* ********************************************************** */
  // RootFn
  static boolean journeyFile(PsiBuilder b, int l) {
    return RootFn(b, l + 1);
  }

  /* ********************************************************** */
  // !('respond' | '}' )
  static boolean recoverCalculationSteps(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recoverCalculationSteps")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !recoverCalculationSteps_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'respond' | '}'
  private static boolean recoverCalculationSteps_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recoverCalculationSteps_0")) return false;
    boolean r;
    r = consumeToken(b, RESPOND);
    if (!r) r = consumeToken(b, RBRACE);
    return r;
  }

  /* ********************************************************** */
  // !(STRING_LITERAL | ',' | '}')
  static boolean recoverExtractableField(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recoverExtractableField")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !recoverExtractableField_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // STRING_LITERAL | ',' | '}'
  private static boolean recoverExtractableField_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recoverExtractableField_0")) return false;
    boolean r;
    r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, RBRACE);
    return r;
  }

  /* ********************************************************** */
  // !(STRING_LITERAL|'}'|',')
  static boolean recoverExtractablePair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recoverExtractablePair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !recoverExtractablePair_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // STRING_LITERAL|'}'|','
  private static boolean recoverExtractablePair_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recoverExtractablePair_0")) return false;
    boolean r;
    r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, RBRACE);
    if (!r) r = consumeToken(b, COMMA);
    return r;
  }

  /* ********************************************************** */
  // !('}')
  static boolean recoverRequestTemplatePart(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recoverRequestTemplatePart")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ! (StepStart)
  static boolean recoverStep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recoverStep")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !recoverStep_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (StepStart)
  private static boolean recoverStep_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recoverStep_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StepStart(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !('on'|'}' )
  static boolean recoverStubDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recoverStubDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !recoverStubDefinition_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'on'|'}'
  private static boolean recoverStubDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recoverStubDefinition_0")) return false;
    boolean r;
    r = consumeToken(b, ON);
    if (!r) r = consumeToken(b, RBRACE);
    return r;
  }

}
