// This is a generated file. Not intended for manual editing.
package com.qalens.corr.lang.core.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.qalens.corr.lang.core.psi.impl.*;

public interface JrnElementTypes {

  IElementType ARGED_FOR = new JrnElementType("ARGED_FOR");
  IElementType ARGED_FOR_IN_TEXT = new JrnElementType("ARGED_FOR_IN_TEXT");
  IElementType ASSIGNABLE = new JrnElementType("ASSIGNABLE");
  IElementType BINARY_FUNCTION = new JrnElementType("BINARY_FUNCTION");
  IElementType BODY_STARTING_RESPONSE = new JrnElementType("BODY_STARTING_RESPONSE");
  IElementType CONSTANT_EXPRESSION = new JrnElementType("CONSTANT_EXPRESSION");
  IElementType EXPRESSION = new JrnElementType("EXPRESSION");
  IElementType EXTRACTABLE_FOR_LOOP = new JrnElementType("EXTRACTABLE_FOR_LOOP");
  IElementType EXTRACTABLE_HEADERS = new JrnElementType("EXTRACTABLE_HEADERS");
  IElementType EXTRACTABLE_OBJECT_MAP = new JrnElementType("EXTRACTABLE_OBJECT_MAP");
  IElementType EXTRACTABLE_OBJECT_TEMPLATE = new JrnElementType("EXTRACTABLE_OBJECT_TEMPLATE");
  IElementType EXTRACTABLE_PAIR = new JrnElementType("EXTRACTABLE_PAIR");
  IElementType EXTRACTABLE_STATIC_ARRAY = new JrnElementType("EXTRACTABLE_STATIC_ARRAY");
  IElementType EXTRACTABLE_TEMPLATE = new JrnElementType("EXTRACTABLE_TEMPLATE");
  IElementType FILLABLE_ARRAY_TEMPLATE = new JrnElementType("FILLABLE_ARRAY_TEMPLATE");
  IElementType FILLABLE_FOR_LOOP = new JrnElementType("FILLABLE_FOR_LOOP");
  IElementType FILLABLE_FOR_LOOP_WITHOUT_ARGUMENTS = new JrnElementType("FILLABLE_FOR_LOOP_WITHOUT_ARGUMENTS");
  IElementType FILLABLE_FOR_LOOP_WITH_ARGUMENTS = new JrnElementType("FILLABLE_FOR_LOOP_WITH_ARGUMENTS");
  IElementType FILLABLE_HEADERS = new JrnElementType("FILLABLE_HEADERS");
  IElementType FILLABLE_MAP_TEMPLATE = new JrnElementType("FILLABLE_MAP_TEMPLATE");
  IElementType FILLABLE_OBJECT_TEMPLATE = new JrnElementType("FILLABLE_OBJECT_TEMPLATE");
  IElementType FILLABLE_REQUEST_TEMPLATE = new JrnElementType("FILLABLE_REQUEST_TEMPLATE");
  IElementType FILLABLE_TEXT_TEMPLATE = new JrnElementType("FILLABLE_TEXT_TEMPLATE");
  IElementType FILLBALE_OBJECT_PAIR = new JrnElementType("FILLBALE_OBJECT_PAIR");
  IElementType FOR_BLOCK_FOR_TEXT = new JrnElementType("FOR_BLOCK_FOR_TEXT");
  IElementType FOR_LOOP_IN_TEXT = new JrnElementType("FOR_LOOP_IN_TEXT");
  IElementType FOR_STATEMENT = new JrnElementType("FOR_STATEMENT");
  IElementType FUNCTION_EXPRESSION = new JrnElementType("FUNCTION_EXPRESSION");
  IElementType HEADERS_STARTING_RESPONSE = new JrnElementType("HEADERS_STARTING_RESPONSE");
  IElementType HEADER_PAIR = new JrnElementType("HEADER_PAIR");
  IElementType JOURNEY_NAME = new JrnElementType("JOURNEY_NAME");
  IElementType LET_MATCHING_STATEMENT = new JrnElementType("LET_MATCHING_STATEMENT");
  IElementType LET_STATEMENT = new JrnElementType("LET_STATEMENT");
  IElementType MULTIPLE_STATEMENT = new JrnElementType("MULTIPLE_STATEMENT");
  IElementType MULTI_VALUED_FUNCTION = new JrnElementType("MULTI_VALUED_FUNCTION");
  IElementType NO_ARG_FUNCTION = new JrnElementType("NO_ARG_FUNCTION");
  IElementType OBJECT_VALUE_TEMPLATE = new JrnElementType("OBJECT_VALUE_TEMPLATE");
  IElementType PRINT_STATEMENT = new JrnElementType("PRINT_STATEMENT");
  IElementType REST_STEP = new JrnElementType("REST_STEP");
  IElementType ROOT_FN = new JrnElementType("ROOT_FN");
  IElementType SCRIPLET = new JrnElementType("SCRIPLET");
  IElementType STATEMENT = new JrnElementType("STATEMENT");
  IElementType TEXT_BLOCK = new JrnElementType("TEXT_BLOCK");
  IElementType TEXT_SCRIPT = new JrnElementType("TEXT_SCRIPT");
  IElementType TEXT_TEMPLATE = new JrnElementType("TEXT_TEMPLATE");
  IElementType TYPE = new JrnElementType("TYPE");
  IElementType UNARY_FUNCTION = new JrnElementType("UNARY_FUNCTION");
  IElementType UN_ARGED_FOR = new JrnElementType("UN_ARGED_FOR");
  IElementType UN_ARGED_FOR_IN_TEXT = new JrnElementType("UN_ARGED_FOR_IN_TEXT");
  IElementType VARIABLE_EXPRESSION = new JrnElementType("VARIABLE_EXPRESSION");
  IElementType VARIABLE_REFERENCE = new JrnElementType("VARIABLE_REFERENCE");

  IElementType ADD = new JrnTokenType("add");
  IElementType AND = new JrnTokenType("and");
  IElementType ASSIGN = new JrnTokenType("=");
  IElementType BACKTICK = new JrnTokenType("`");
  IElementType BODY = new JrnTokenType("body");
  IElementType BOOL = new JrnTokenType("Boolean");
  IElementType BOOLEANVALUE = new JrnTokenType("BooleanValue");
  IElementType COLON = new JrnTokenType(":");
  IElementType COMMA = new JrnTokenType(",");
  IElementType CONCAT = new JrnTokenType("concat");
  IElementType DELETE = new JrnTokenType("delete");
  IElementType DIV = new JrnTokenType("div");
  IElementType DOT = new JrnTokenType(".");
  IElementType DOUBLE = new JrnTokenType("Double");
  IElementType DOUBLEVALUE = new JrnTokenType("DoubleValue");
  IElementType ENCODE = new JrnTokenType("encode");
  IElementType EXTRACTABLESTATEMENT = new JrnTokenType("ExtractableStatement");
  IElementType FAKE = new JrnTokenType("fake");
  IElementType FATARROW = new JrnTokenType("=>");
  IElementType FOR = new JrnTokenType("for");
  IElementType FROMJSON = new JrnTokenType("from_json");
  IElementType GET = new JrnTokenType("get");
  IElementType HEADERS = new JrnTokenType("headers");
  IElementType IDENTIFIER = new JrnTokenType("identifier");
  IElementType INETEGERVALUE = new JrnTokenType("InetegerValue");
  IElementType INTEGER = new JrnTokenType("Integer");
  IElementType LBRACE = new JrnTokenType("{");
  IElementType LBRACK = new JrnTokenType("[");
  IElementType LET = new JrnTokenType("let");
  IElementType LIST = new JrnTokenType("List");
  IElementType LPAREN = new JrnTokenType("(");
  IElementType MATCHING = new JrnTokenType("matching");
  IElementType MUL = new JrnTokenType("mul");
  IElementType NAME = new JrnTokenType("NAME");
  IElementType NULLVALUE = new JrnTokenType("NullValue");
  IElementType OBJECT = new JrnTokenType("Object");
  IElementType OBJECT_TEMPLATE = new JrnTokenType("object");
  IElementType PATCH = new JrnTokenType("patch");
  IElementType POSITIVEINTEGERVALUE = new JrnTokenType("PositiveIntegerValue");
  IElementType POSITIVE_INTEGER = new JrnTokenType("PositiveInteger");
  IElementType POST = new JrnTokenType("post");
  IElementType PRINT = new JrnTokenType("print");
  IElementType PUT = new JrnTokenType("put");
  IElementType QUOTE = new JrnTokenType("\"");
  IElementType RANDOM = new JrnTokenType("random");
  IElementType RBRACE = new JrnTokenType("}");
  IElementType RBRACK = new JrnTokenType("]");
  IElementType REQUEST = new JrnTokenType("request");
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
  IElementType URL = new JrnTokenType("url");
  IElementType UUID = new JrnTokenType("uuid");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARGED_FOR) {
        return new JrnArgedForImpl(node);
      }
      else if (type == ARGED_FOR_IN_TEXT) {
        return new JrnArgedForInTextImpl(node);
      }
      else if (type == ASSIGNABLE) {
        return new JrnAssignableImpl(node);
      }
      else if (type == BINARY_FUNCTION) {
        return new JrnBinaryFunctionImpl(node);
      }
      else if (type == BODY_STARTING_RESPONSE) {
        return new JrnBodyStartingResponseImpl(node);
      }
      else if (type == CONSTANT_EXPRESSION) {
        return new JrnConstantExpressionImpl(node);
      }
      else if (type == EXPRESSION) {
        return new JrnExpressionImpl(node);
      }
      else if (type == EXTRACTABLE_FOR_LOOP) {
        return new JrnExtractableForLoopImpl(node);
      }
      else if (type == EXTRACTABLE_HEADERS) {
        return new JrnExtractableHeadersImpl(node);
      }
      else if (type == EXTRACTABLE_OBJECT_MAP) {
        return new JrnExtractableObjectMapImpl(node);
      }
      else if (type == EXTRACTABLE_OBJECT_TEMPLATE) {
        return new JrnExtractableObjectTemplateImpl(node);
      }
      else if (type == EXTRACTABLE_PAIR) {
        return new JrnExtractablePairImpl(node);
      }
      else if (type == EXTRACTABLE_STATIC_ARRAY) {
        return new JrnExtractableStaticArrayImpl(node);
      }
      else if (type == EXTRACTABLE_TEMPLATE) {
        return new JrnExtractableTemplateImpl(node);
      }
      else if (type == FILLABLE_ARRAY_TEMPLATE) {
        return new JrnFillableArrayTemplateImpl(node);
      }
      else if (type == FILLABLE_FOR_LOOP) {
        return new JrnFillableForLoopImpl(node);
      }
      else if (type == FILLABLE_FOR_LOOP_WITHOUT_ARGUMENTS) {
        return new JrnFillableForLoopWithoutArgumentsImpl(node);
      }
      else if (type == FILLABLE_FOR_LOOP_WITH_ARGUMENTS) {
        return new JrnFillableForLoopWithArgumentsImpl(node);
      }
      else if (type == FILLABLE_HEADERS) {
        return new JrnFillableHeadersImpl(node);
      }
      else if (type == FILLABLE_MAP_TEMPLATE) {
        return new JrnFillableMapTemplateImpl(node);
      }
      else if (type == FILLABLE_OBJECT_TEMPLATE) {
        return new JrnFillableObjectTemplateImpl(node);
      }
      else if (type == FILLABLE_REQUEST_TEMPLATE) {
        return new JrnFillableRequestTemplateImpl(node);
      }
      else if (type == FILLABLE_TEXT_TEMPLATE) {
        return new JrnFillableTextTemplateImpl(node);
      }
      else if (type == FILLBALE_OBJECT_PAIR) {
        return new JrnFillbaleObjectPairImpl(node);
      }
      else if (type == FOR_BLOCK_FOR_TEXT) {
        return new JrnForBlockForTextImpl(node);
      }
      else if (type == FOR_LOOP_IN_TEXT) {
        return new JrnForLoopInTextImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new JrnForStatementImpl(node);
      }
      else if (type == FUNCTION_EXPRESSION) {
        return new JrnFunctionExpressionImpl(node);
      }
      else if (type == HEADERS_STARTING_RESPONSE) {
        return new JrnHeadersStartingResponseImpl(node);
      }
      else if (type == HEADER_PAIR) {
        return new JrnHeaderPairImpl(node);
      }
      else if (type == JOURNEY_NAME) {
        return new JrnJourneyNameImpl(node);
      }
      else if (type == LET_MATCHING_STATEMENT) {
        return new JrnLetMatchingStatementImpl(node);
      }
      else if (type == LET_STATEMENT) {
        return new JrnLetStatementImpl(node);
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
      else if (type == OBJECT_VALUE_TEMPLATE) {
        return new JrnObjectValueTemplateImpl(node);
      }
      else if (type == PRINT_STATEMENT) {
        return new JrnPrintStatementImpl(node);
      }
      else if (type == REST_STEP) {
        return new JrnRestStepImpl(node);
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
      else if (type == UNARY_FUNCTION) {
        return new JrnUnaryFunctionImpl(node);
      }
      else if (type == UN_ARGED_FOR) {
        return new JrnUnArgedForImpl(node);
      }
      else if (type == UN_ARGED_FOR_IN_TEXT) {
        return new JrnUnArgedForInTextImpl(node);
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
