// This is a generated file. Not intended for manual editing.
package com.qalens.corr.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JrnExpression extends PsiElement {

  @Nullable
  JrnConstantExpression getConstantExpression();

  @Nullable
  JrnFunctionExpression getFunctionExpression();

  @Nullable
  JrnVariableExpression getVariableExpression();

}
