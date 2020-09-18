// This is a generated file. Not intended for manual editing.
package com.qalens.corr.lang.core.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.qalens.corr.lang.core.psi.impl.*;

public interface JrnElementTypes {

  IElementType ARGED_FOR = new JrnElementType("ARGED_FOR");
  IElementType BINARY_FUNCTION = new JrnElementType("BINARY_FUNCTION");
  IElementType CONSTANT_EXPRESSION = new JrnElementType("CONSTANT_EXPRESSION");
  IElementType DYNAMIC_FILLABLE_TEXT_TEMPLATE = new JrnElementType("DYNAMIC_FILLABLE_TEXT_TEMPLATE");
  IElementType EXPRESSION = new JrnElementType("EXPRESSION");
  IElementType FOR_STATEMENT = new JrnElementType("FOR_STATEMENT");
  IElementType FUNCTION_EXPRESSION = new JrnElementType("FUNCTION_EXPRESSION");
  IElementType JOURNEY_NAME = new JrnElementType("JOURNEY_NAME");
  IElementType MULTIPLE_STATEMENT = new JrnElementType("MULTIPLE_STATEMENT");
  IElementType MULTI_VALUED_FUNCTION = new JrnElementType("MULTI_VALUED_FUNCTION");
  IElementType NO_ARG_FUNCTION = new JrnElementType("NO_ARG_FUNCTION");
  IElementType PRINT_STATEMENT = new JrnElementType("PRINT_STATEMENT");
  IElementType ROOT_FN = new JrnElementType("ROOT_FN");
  IElementType SCRIPLET = new JrnElementType("SCRIPLET");
  IElementType STATEMENT = new JrnElementType("STATEMENT");
  IElementType TEXT_BLOCK = new JrnElementType("TEXT_BLOCK");
  IElementType TEXT_SCRIPT = new JrnElementType("TEXT_SCRIPT");
  IElementType TEXT_TEMPLATE = new JrnElementType("TEXT_TEMPLATE");
  IElementType TYPE = new JrnElementType("TYPE");
  IElementType UN_ARGED_FOR = new JrnElementType("UN_ARGED_FOR");
  IElementType VARIABLE_EXPRESSION = new JrnElementType("VARIABLE_EXPRESSION");
  IElementType VARIABLE_REFERENCE = new JrnElementType("VARIABLE_REFERENCE");

  IElementType ADD = new JrnTokenType("add");
  IElementType BACKTICK = new JrnTokenType("`");
  IElementType BOOL = new JrnTokenType("Boolean");
  IElementType BOOLEANVALUE = new JrnTokenType("BooleanValue");
  IElementType COLON = new JrnTokenType(":");
  IElementType COMMA = new JrnTokenType(",");
  IElementType CONCAT = new JrnTokenType("concat");
  IElementType DIV = new JrnTokenType("div");
  IElementType DOT = new JrnTokenType(".");
  IElementType DOUBLE = new JrnTokenType("Double");
  IElementType DOUBLEVALUE = new JrnTokenType("DoubleValue");
  IElementType FATARROW = new JrnTokenType("=>");
  IElementType FILLABLE = new JrnTokenType("fillable");
  IElementType FOR = new JrnTokenType("for");
  IElementType IDENTIFIER = new JrnTokenType("identifier");
  IElementType INETEGERVALUE = new JrnTokenType("InetegerValue");
  IElementType INTEGER = new JrnTokenType("Integer");
  IElementType LBRACE = new JrnTokenType("{");
  IElementType LBRACK = new JrnTokenType("[");
  IElementType LIST = new JrnTokenType("List");
  IElementType LPAREN = new JrnTokenType("(");
  IElementType MUL = new JrnTokenType("mul");
  IElementType NAME = new JrnTokenType("NAME");
  IElementType NULLVALUE = new JrnTokenType("NullValue");
  IElementType OBJECT = new JrnTokenType("Object");
  IElementType OP_ASIGNMENT = new JrnTokenType("=");
  IElementType POSITIVEINTEGERVALUE = new JrnTokenType("PositiveIntegerValue");
  IElementType POSITIVE_INTEGER = new JrnTokenType("PositiveInteger");
  IElementType PRINT = new JrnTokenType("print");
  IElementType QUOTE = new JrnTokenType("\"");
  IElementType RANDOM = new JrnTokenType("random");
  IElementType RBRACE = new JrnTokenType("}");
  IElementType RBRACK = new JrnTokenType("]");
  IElementType ROUND = new JrnTokenType("round");
  IElementType RPAREN = new JrnTokenType(")");
  IElementType SCRIPLET_END = new JrnTokenType("%>");
  IElementType SCRIPLET_START = new JrnTokenType("<%");
  IElementType SEMICOLON = new JrnTokenType(";");
  IElementType STRING = new JrnTokenType("String");
  IElementType STRING_LITERAL = new JrnTokenType("STRING_LITERAL");
  IElementType SUB = new JrnTokenType("sub");
  IElementType TEXT = new JrnTokenType("text");
  IElementType TEXT_LITERAL = new JrnTokenType("TEXT_LITERAL");
  IElementType UNDERSCORE = new JrnTokenType("_");
  IElementType UUID = new JrnTokenType("uuid");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARGED_FOR) {
        return new JrnArgedForImpl(node);
      }
      else if (type == BINARY_FUNCTION) {
        return new JrnBinaryFunctionImpl(node);
      }
      else if (type == CONSTANT_EXPRESSION) {
        return new JrnConstantExpressionImpl(node);
      }
      else if (type == DYNAMIC_FILLABLE_TEXT_TEMPLATE) {
        return new JrnDynamicFillableTextTemplateImpl(node);
      }
      else if (type == EXPRESSION) {
        return new JrnExpressionImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new JrnForStatementImpl(node);
      }
      else if (type == FUNCTION_EXPRESSION) {
        return new JrnFunctionExpressionImpl(node);
      }
      else if (type == JOURNEY_NAME) {
        return new JrnJourneyNameImpl(node);
      }
      else if (type == MULTIPLE_STATEMENT) {
        return new JrnMultipleStatementImpl(node);
      }
      else if (type == MULTI_VALUED_FUNCTION) {
        return new JrnMultiValuedFunctionImpl(node);
      }
      else if (type == NO_ARG_FUNCTION) {
        return new JrnNoArgFunctionImpl(node);
      }
      else if (type == PRINT_STATEMENT) {
        return new JrnPrintStatementImpl(node);
      }
      else if (type == ROOT_FN) {
        return new JrnRootFnImpl(node);
      }
      else if (type == SCRIPLET) {
        return new JrnScripletImpl(node);
      }
      else if (type == STATEMENT) {
        return new JrnStatementImpl(node);
      }
      else if (type == TEXT_BLOCK) {
        return new JrnTextBlockImpl(node);
      }
      else if (type == TEXT_SCRIPT) {
        return new JrnTextScriptImpl(node);
      }
      else if (type == TEXT_TEMPLATE) {
        return new JrnTextTemplateImpl(node);
      }
      else if (type == TYPE) {
        return new JrnTypeImpl(node);
      }
      else if (type == UN_ARGED_FOR) {
        return new JrnUnArgedForImpl(node);
      }
      else if (type == VARIABLE_EXPRESSION) {
        return new JrnVariableExpressionImpl(node);
      }
      else if (type == VARIABLE_REFERENCE) {
        return new JrnVariableReferenceImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
