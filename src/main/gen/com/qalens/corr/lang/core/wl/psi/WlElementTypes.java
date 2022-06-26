// This is a generated file. Not intended for manual editing.
package com.qalens.corr.lang.core.wl.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.qalens.corr.lang.core.wl.psi.impl.*;

public interface WlElementTypes {

  IElementType BLOCK = new WlElementType("BLOCK");
  IElementType EXECUTOR_LINE = new WlElementType("EXECUTOR_LINE");
  IElementType JOURNEY_LINE = new WlElementType("JOURNEY_LINE");
  IElementType ROOT_FN = new WlElementType("ROOT_FN");
  IElementType SCENARIOS_DEFINITION = new WlElementType("SCENARIOS_DEFINITION");
  IElementType SCENARIO_DEFINITION = new WlElementType("SCENARIO_DEFINITION");
  IElementType STAGE = new WlElementType("STAGE");
  IElementType STAGES_LINE = new WlElementType("STAGES_LINE");
  IElementType STARTUP_LINE = new WlElementType("STARTUP_LINE");

  IElementType BACKTICK = new WlTokenType("`");
  IElementType BLOCK_COMMENT = new WlTokenType("BLOCK_COMMENT");
  IElementType COLON = new WlTokenType(":");
  IElementType COMMA = new WlTokenType(",");
  IElementType EXECUTOR = new WlTokenType("executor");
  IElementType JOURNEY = new WlTokenType("journey");
  IElementType LBRACE = new WlTokenType("{");
  IElementType LBRACK = new WlTokenType("[");
  IElementType LINE_COMMENT = new WlTokenType("LINE_COMMENT");
  IElementType LPAREN = new WlTokenType("(");
  IElementType NAME = new WlTokenType("NAME");
  IElementType POSITIVEINTEGERVALUE = new WlTokenType("PositiveIntegerValue");
  IElementType QUOTE = new WlTokenType("\"");
  IElementType RBRACE = new WlTokenType("}");
  IElementType RBRACK = new WlTokenType("]");
  IElementType RPAREN = new WlTokenType(")");
  IElementType SCENARIOS = new WlTokenType("scenarios");
  IElementType STAGES = new WlTokenType("stages");
  IElementType STARTUP = new WlTokenType("startup");
  IElementType STRING_LITERAL = new WlTokenType("STRING_LITERAL");
  IElementType VARIABLEREFERENCE = new WlTokenType("VariableReference");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BLOCK) {
        return new WlBlockImpl(node);
      }
      else if (type == EXECUTOR_LINE) {
        return new WlExecutorLineImpl(node);
      }
      else if (type == JOURNEY_LINE) {
        return new WlJourneyLineImpl(node);
      }
      else if (type == ROOT_FN) {
        return new WlRootFnImpl(node);
      }
      else if (type == SCENARIOS_DEFINITION) {
        return new WlScenariosDefinitionImpl(node);
      }
      else if (type == SCENARIO_DEFINITION) {
        return new WlScenarioDefinitionImpl(node);
      }
      else if (type == STAGE) {
        return new WlStageImpl(node);
      }
      else if (type == STAGES_LINE) {
        return new WlStagesLineImpl(node);
      }
      else if (type == STARTUP_LINE) {
        return new WlStartupLineImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
