// This is a generated file. Not intended for manual editing.
package com.qalens.corr.lang.core.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.qalens.corr.lang.core.psi.impl.*;

public interface JrnElementTypes {

  IElementType ARGUMENT = new JrnElementType("ARGUMENT");
  IElementType BINARY_FUNCTION = new JrnElementType("BINARY_FUNCTION");
  IElementType CONSTANT_EXPRESSION = new JrnElementType("CONSTANT_EXPRESSION");
  IElementType DEFINED_FN_CALL = new JrnElementType("DEFINED_FN_CALL");
  IElementType DEFINED_METHOD = new JrnElementType("DEFINED_METHOD");
  IElementType EFOR_LOOP = new JrnElementType("EFOR_LOOP");
  IElementType EFOR_VALUE_SCRIPTLET = new JrnElementType("EFOR_VALUE_SCRIPTLET");
  IElementType EXPRESSION = new JrnElementType("EXPRESSION");
  IElementType E_JSON_ARRAY = new JrnElementType("E_JSON_ARRAY");
  IElementType E_JSON_OBJECT = new JrnElementType("E_JSON_OBJECT");
  IElementType E_JSON_PAIR = new JrnElementType("E_JSON_PAIR");
  IElementType E_JSON_TEMPLATE = new JrnElementType("E_JSON_TEMPLATE");
  IElementType E_JSON_TEMPLATE_VALUE = new JrnElementType("E_JSON_TEMPLATE_VALUE");
  IElementType E_SCRIPLET = new JrnElementType("E_SCRIPLET");
  IElementType FOR_BLOCK = new JrnElementType("FOR_BLOCK");
  IElementType FOR_CALL = new JrnElementType("FOR_CALL");
  IElementType FOR_LOOP = new JrnElementType("FOR_LOOP");
  IElementType FOR_VALUE_SCRIPTLET = new JrnElementType("FOR_VALUE_SCRIPTLET");
  IElementType FUNCTION_EXPRESSION = new JrnElementType("FUNCTION_EXPRESSION");
  IElementType JSON_ARRAY = new JrnElementType("JSON_ARRAY");
  IElementType JSON_OBJECT = new JrnElementType("JSON_OBJECT");
  IElementType JSON_PAIR = new JrnElementType("JSON_PAIR");
  IElementType JSON_TEMPLATE = new JrnElementType("JSON_TEMPLATE");
  IElementType JSON_TEMPLATE_VALUE = new JrnElementType("JSON_TEMPLATE_VALUE");
  IElementType LABEL = new JrnElementType("LABEL");
  IElementType MAP_OBJECT = new JrnElementType("MAP_OBJECT");
  IElementType MAP_PAIR = new JrnElementType("MAP_PAIR");
  IElementType MAP_VALUE = new JrnElementType("MAP_VALUE");
  IElementType MULTI_VALUED_FUNCTION = new JrnElementType("MULTI_VALUED_FUNCTION");
  IElementType NIL = new JrnElementType("NIL");
  IElementType NO_ARG_FUNCTION = new JrnElementType("NO_ARG_FUNCTION");
  IElementType ROOT_FN = new JrnElementType("ROOT_FN");
  IElementType SCRIPLET = new JrnElementType("SCRIPLET");
  IElementType STATEMENT = new JrnElementType("STATEMENT");
  IElementType TEXT_BLOCK = new JrnElementType("TEXT_BLOCK");
  IElementType TEXT_TEMPLATE = new JrnElementType("TEXT_TEMPLATE");
  IElementType TEXT_TEMPLATE_VALUE = new JrnElementType("TEXT_TEMPLATE_VALUE");
  IElementType TFOR_LOOP = new JrnElementType("TFOR_LOOP");
  IElementType TFOR_VALUE_SCRIPTLET = new JrnElementType("TFOR_VALUE_SCRIPTLET");
  IElementType TIMES_CALL = new JrnElementType("TIMES_CALL");
  IElementType TYPE = new JrnElementType("TYPE");
  IElementType VALUE = new JrnElementType("VALUE");
  IElementType VARIABLE_EXPRESSION = new JrnElementType("VARIABLE_EXPRESSION");

  IElementType ADD = new JrnTokenType("add");
  IElementType BACKTICK = new JrnTokenType("`");
  IElementType BOOLEANVALUE = new JrnTokenType("BooleanValue");
  IElementType COLON = new JrnTokenType(":");
  IElementType COMMA = new JrnTokenType(",");
  IElementType CONCAT = new JrnTokenType("concat");
  IElementType DOUBLEVALUE = new JrnTokenType("DoubleValue");
  IElementType EJSONSTART = new JrnTokenType("EjsonStart");
  IElementType FOR = new JrnTokenType("for");
  IElementType FOR_SCRIPLET_END = new JrnTokenType("%>");
  IElementType FOR_SCRIPLET_START = new JrnTokenType("<%");
  IElementType IDENTIFIER = new JrnTokenType("identifier");
  IElementType IN = new JrnTokenType("in");
  IElementType JSONSTART = new JrnTokenType("JsonStart");
  IElementType LBRACE = new JrnTokenType("{");
  IElementType LBRACK = new JrnTokenType("[");
  IElementType LIST = new JrnTokenType("List");
  IElementType LONG = new JrnTokenType("Long");
  IElementType LONGVALUE = new JrnTokenType("LongValue");
  IElementType LPAREN = new JrnTokenType("(");
  IElementType MAPSTART = new JrnTokenType("MapStart");
  IElementType MUL = new JrnTokenType("mul");
  IElementType NAME = new JrnTokenType("NAME");
  IElementType NILVALUE = new JrnTokenType("@nil");
  IElementType OBJECT = new JrnTokenType("Object");
  IElementType QUOTE = new JrnTokenType("\"");
  IElementType RANDOM = new JrnTokenType("random");
  IElementType RBRACE = new JrnTokenType("}");
  IElementType RBRACK = new JrnTokenType("]");
  IElementType RESTMETHOD = new JrnTokenType("RestMethod");
  IElementType ROUND = new JrnTokenType("round");
  IElementType RPAREN = new JrnTokenType(")");
  IElementType SCRIPLET_END = new JrnTokenType("}}");
  IElementType SCRIPLET_START = new JrnTokenType("{{");
  IElementType SEMICOLON = new JrnTokenType(";");
  IElementType STRING = new JrnTokenType("String");
  IElementType STRING_LITERAL = new JrnTokenType("STRING_LITERAL");
  IElementType SYSTEMMETHOD = new JrnTokenType("SystemMethod");
  IElementType TEXTSTART = new JrnTokenType("TextStart");
  IElementType TEXT_LITERAL = new JrnTokenType("TEXT_LITERAL");
  IElementType TIMES = new JrnTokenType("times");
  IElementType UNDERSCORE = new JrnTokenType("_");
  IElementType UUID = new JrnTokenType("uuid");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARGUMENT) {
        return new JrnArgumentImpl(node);
      }
      else if (type == BINARY_FUNCTION) {
        return new JrnBinaryFunctionImpl(node);
      }
      else if (type == CONSTANT_EXPRESSION) {
        return new JrnConstantExpressionImpl(node);
      }
      else if (type == DEFINED_FN_CALL) {
        return new JrnDefinedFnCallImpl(node);
      }
      else if (type == DEFINED_METHOD) {
        return new JrnDefinedMethodImpl(node);
      }
      else if (type == EFOR_LOOP) {
        return new JrnEforLoopImpl(node);
      }
      else if (type == EFOR_VALUE_SCRIPTLET) {
        return new JrnEforValueScriptletImpl(node);
      }
      else if (type == EXPRESSION) {
        return new JrnExpressionImpl(node);
      }
      else if (type == E_JSON_ARRAY) {
        return new JrnEJsonArrayImpl(node);
      }
      else if (type == E_JSON_OBJECT) {
        return new JrnEJsonObjectImpl(node);
      }
      else if (type == E_JSON_PAIR) {
        return new JrnEJsonPairImpl(node);
      }
      else if (type == E_JSON_TEMPLATE) {
        return new JrnEJsonTemplateImpl(node);
      }
      else if (type == E_JSON_TEMPLATE_VALUE) {
        return new JrnEJsonTemplateValueImpl(node);
      }
      else if (type == E_SCRIPLET) {
        return new JrnEScripletImpl(node);
      }
      else if (type == FOR_BLOCK) {
        return new JrnForBlockImpl(node);
      }
      else if (type == FOR_CALL) {
        return new JrnForCallImpl(node);
      }
      else if (type == FOR_LOOP) {
        return new JrnForLoopImpl(node);
      }
      else if (type == FOR_VALUE_SCRIPTLET) {
        return new JrnForValueScriptletImpl(node);
      }
      else if (type == FUNCTION_EXPRESSION) {
        return new JrnFunctionExpressionImpl(node);
      }
      else if (type == JSON_ARRAY) {
        return new JrnJsonArrayImpl(node);
      }
      else if (type == JSON_OBJECT) {
        return new JrnJsonObjectImpl(node);
      }
      else if (type == JSON_PAIR) {
        return new JrnJsonPairImpl(node);
      }
      else if (type == JSON_TEMPLATE) {
        return new JrnJsonTemplateImpl(node);
      }
      else if (type == JSON_TEMPLATE_VALUE) {
        return new JrnJsonTemplateValueImpl(node);
      }
      else if (type == LABEL) {
        return new JrnLabelImpl(node);
      }
      else if (type == MAP_OBJECT) {
        return new JrnMapObjectImpl(node);
      }
      else if (type == MAP_PAIR) {
        return new JrnMapPairImpl(node);
      }
      else if (type == MAP_VALUE) {
        return new JrnMapValueImpl(node);
      }
      else if (type == MULTI_VALUED_FUNCTION) {
        return new JrnMultiValuedFunctionImpl(node);
      }
      else if (type == NIL) {
        return new JrnNilImpl(node);
      }
      else if (type == NO_ARG_FUNCTION) {
        return new JrnNoArgFunctionImpl(node);
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
      else if (type == TEXT_TEMPLATE) {
        return new JrnTextTemplateImpl(node);
      }
      else if (type == TEXT_TEMPLATE_VALUE) {
        return new JrnTextTemplateValueImpl(node);
      }
      else if (type == TFOR_LOOP) {
        return new JrnTforLoopImpl(node);
      }
      else if (type == TFOR_VALUE_SCRIPTLET) {
        return new JrnTforValueScriptletImpl(node);
      }
      else if (type == TIMES_CALL) {
        return new JrnTimesCallImpl(node);
      }
      else if (type == TYPE) {
        return new JrnTypeImpl(node);
      }
      else if (type == VALUE) {
        return new JrnValueImpl(node);
      }
      else if (type == VARIABLE_EXPRESSION) {
        return new JrnVariableExpressionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
