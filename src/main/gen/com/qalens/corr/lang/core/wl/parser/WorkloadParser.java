// This is a generated file. Not intended for manual editing.
package com.qalens.corr.lang.core.wl.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.qalens.corr.lang.core.wl.psi.WlElementTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class WorkloadParser implements PsiParser, LightPsiParser {

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
    return workloadFile(b, l + 1);
  }

  /* ********************************************************** */
  // '{' StartupLine? ScenariosDefinition '}'
  public static boolean Block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Block")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && Block_1(b, l + 1);
    r = r && ScenariosDefinition(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, BLOCK, r);
    return r;
  }

  // StartupLine?
  private static boolean Block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Block_1")) return false;
    StartupLine(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'executor' ':' STRING_LITERAL ','
  public static boolean ExecutorLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExecutorLine")) return false;
    if (!nextTokenIs(b, EXECUTOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, EXECUTOR, COLON, STRING_LITERAL, COMMA);
    exit_section_(b, m, EXECUTOR_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // 'journey' ':' STRING_LITERAL ','
  public static boolean JourneyLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JourneyLine")) return false;
    if (!nextTokenIs(b, JOURNEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, JOURNEY, COLON, STRING_LITERAL, COMMA);
    exit_section_(b, m, JOURNEY_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // NAME '(' ((VariableReference  (',' VariableReference)*) | VariableReference?)')' Block
  public static boolean RootFn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RootFn")) return false;
    if (!nextTokenIs(b, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NAME, LPAREN);
    r = r && RootFn_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && Block(b, l + 1);
    exit_section_(b, m, ROOT_FN, r);
    return r;
  }

  // (VariableReference  (',' VariableReference)*) | VariableReference?
  private static boolean RootFn_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RootFn_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RootFn_2_0(b, l + 1);
    if (!r) r = RootFn_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VariableReference  (',' VariableReference)*
  private static boolean RootFn_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RootFn_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VARIABLEREFERENCE);
    r = r && RootFn_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' VariableReference)*
  private static boolean RootFn_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RootFn_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!RootFn_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RootFn_2_0_1", c)) break;
    }
    return true;
  }

  // ',' VariableReference
  private static boolean RootFn_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RootFn_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, VARIABLEREFERENCE);
    exit_section_(b, m, null, r);
    return r;
  }

  // VariableReference?
  private static boolean RootFn_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RootFn_2_1")) return false;
    consumeToken(b, VARIABLEREFERENCE);
    return true;
  }

  /* ********************************************************** */
  // '{' ExecutorLine JourneyLine StagesLine'}'
  public static boolean ScenarioDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScenarioDefinition")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && ExecutorLine(b, l + 1);
    r = r && JourneyLine(b, l + 1);
    r = r && StagesLine(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, SCENARIO_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // 'scenarios' ':' '[' ScenarioDefinition* ']'
  public static boolean ScenariosDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScenariosDefinition")) return false;
    if (!nextTokenIs(b, SCENARIOS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SCENARIOS, COLON, LBRACK);
    r = r && ScenariosDefinition_3(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, SCENARIOS_DEFINITION, r);
    return r;
  }

  // ScenarioDefinition*
  private static boolean ScenariosDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScenariosDefinition_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ScenarioDefinition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ScenariosDefinition_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '{' PositiveIntegerValue ',' PositiveIntegerValue '}'
  public static boolean Stage(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Stage")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACE, POSITIVEINTEGERVALUE, COMMA, POSITIVEINTEGERVALUE, RBRACE);
    exit_section_(b, m, STAGE, r);
    return r;
  }

  /* ********************************************************** */
  // 'stages' ':' '[' Stage (',' Stage)*']'
  public static boolean StagesLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StagesLine")) return false;
    if (!nextTokenIs(b, STAGES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STAGES, COLON, LBRACK);
    r = r && Stage(b, l + 1);
    r = r && StagesLine_4(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, STAGES_LINE, r);
    return r;
  }

  // (',' Stage)*
  private static boolean StagesLine_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StagesLine_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!StagesLine_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StagesLine_4", c)) break;
    }
    return true;
  }

  // ',' Stage
  private static boolean StagesLine_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StagesLine_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Stage(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'startup' ':' STRING_LITERAL ','
  public static boolean StartupLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartupLine")) return false;
    if (!nextTokenIs(b, STARTUP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STARTUP, COLON, STRING_LITERAL, COMMA);
    exit_section_(b, m, STARTUP_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // RootFn
  static boolean workloadFile(PsiBuilder b, int l) {
    return RootFn(b, l + 1);
  }

}
