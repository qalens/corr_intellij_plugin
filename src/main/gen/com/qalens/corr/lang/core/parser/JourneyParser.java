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
  // ('round' | 'random' | 'sub' | 'div') '(' (Expression ',' Expression)  ')'
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

  // 'round' | 'random' | 'sub' | 'div'
  private static boolean BinaryFunction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryFunction_0")) return false;
    boolean r;
    r = consumeToken(b, ROUND);
    if (!r) r = consumeToken(b, RANDOM);
    if (!r) r = consumeToken(b, SUB);
    if (!r) r = consumeToken(b, DIV);
    return r;
  }

  // Expression ',' Expression
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
  // 'body' ExtractableTemplate ('and' 'headers' ExtractableHeaders)?
  public static boolean BodyStartingResponse(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BodyStartingResponse")) return false;
    if (!nextTokenIs(b, BODY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BODY);
    r = r && ExtractableTemplate(b, l + 1);
    r = r && BodyStartingResponse_2(b, l + 1);
    exit_section_(b, m, BODY_STARTING_RESPONSE, r);
    return r;
  }

  // ('and' 'headers' ExtractableHeaders)?
  private static boolean BodyStartingResponse_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BodyStartingResponse_2")) return false;
    BodyStartingResponse_2_0(b, l + 1);
    return true;
  }

  // 'and' 'headers' ExtractableHeaders
  private static boolean BodyStartingResponse_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BodyStartingResponse_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AND, HEADERS);
    r = r && ExtractableHeaders(b, l + 1);
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
  // VariableReference | ExtractableObjectMap | ExtractableStaticArray
  public static boolean ExtractableObjectTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableObjectTemplate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXTRACTABLE_OBJECT_TEMPLATE, "<extractable object template>");
    r = VariableReference(b, l + 1);
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
  // 'object' ExtractableObjectTemplate
  public static boolean ExtractableTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtractableTemplate")) return false;
    if (!nextTokenIs(b, OBJECT_TEMPLATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OBJECT_TEMPLATE);
    r = r && ExtractableObjectTemplate(b, l + 1);
    exit_section_(b, m, EXTRACTABLE_TEMPLATE, r);
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
  public static boolean HeadersStartingResponse(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeadersStartingResponse")) return false;
    if (!nextTokenIs(b, HEADERS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HEADERS);
    r = r && ExtractableHeaders(b, l + 1);
    r = r && HeadersStartingResponse_2(b, l + 1);
    exit_section_(b, m, HEADERS_STARTING_RESPONSE, r);
    return r;
  }

  // ('and' 'body' ExtractableTemplate)?
  private static boolean HeadersStartingResponse_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeadersStartingResponse_2")) return false;
    HeadersStartingResponse_2_0(b, l + 1);
    return true;
  }

  // 'and' 'body' ExtractableTemplate
  private static boolean HeadersStartingResponse_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeadersStartingResponse_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AND, BODY);
    r = r && ExtractableTemplate(b, l + 1);
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
  // 'let' 'matching' ExtractableStatement
  public static boolean LetMatchingStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetMatchingStatement")) return false;
    if (!nextTokenIs(b, LET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LET, MATCHING, EXTRACTABLESTATEMENT);
    exit_section_(b, m, LET_MATCHING_STATEMENT, r);
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
  // ('concat' | 'mul' | 'add') '(' (Expression (',' Expression)*)? ')'
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

  // 'concat' | 'mul' | 'add'
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
  // UUID '('  ')'
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
  // ( 'get' | 'put' | 'post' | 'patch' | 'delete') FillableRequestTemplate ( 'matching' (HeadersStartingResponse | BodyStartingResponse))?
  public static boolean RestStep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestStep")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REST_STEP, "<rest step>");
    r = RestStep_0(b, l + 1);
    r = r && FillableRequestTemplate(b, l + 1);
    r = r && RestStep_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'get' | 'put' | 'post' | 'patch' | 'delete'
  private static boolean RestStep_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestStep_0")) return false;
    boolean r;
    r = consumeToken(b, GET);
    if (!r) r = consumeToken(b, PUT);
    if (!r) r = consumeToken(b, POST);
    if (!r) r = consumeToken(b, PATCH);
    if (!r) r = consumeToken(b, DELETE);
    return r;
  }

  // ( 'matching' (HeadersStartingResponse | BodyStartingResponse))?
  private static boolean RestStep_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestStep_2")) return false;
    RestStep_2_0(b, l + 1);
    return true;
  }

  // 'matching' (HeadersStartingResponse | BodyStartingResponse)
  private static boolean RestStep_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestStep_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MATCHING);
    r = r && RestStep_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // HeadersStartingResponse | BodyStartingResponse
  private static boolean RestStep_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestStep_2_0_1")) return false;
    boolean r;
    r = HeadersStartingResponse(b, l + 1);
    if (!r) r = BodyStartingResponse(b, l + 1);
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
  // PrintStatement | ForStatement | LetStatement | RestStep
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = PrintStatement(b, l + 1);
    if (!r) r = ForStatement(b, l + 1);
    if (!r) r = LetStatement(b, l + 1);
    if (!r) r = RestStep(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // ('fake' | 'from_json' ) '(' Expression  ')'
  public static boolean UnaryFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryFunction")) return false;
    if (!nextTokenIs(b, "<unary function>", FAKE, FROMJSON)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_FUNCTION, "<unary function>");
    r = UnaryFunction_0(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'fake' | 'from_json'
  private static boolean UnaryFunction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryFunction_0")) return false;
    boolean r;
    r = consumeToken(b, FAKE);
    if (!r) r = consumeToken(b, FROMJSON);
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
