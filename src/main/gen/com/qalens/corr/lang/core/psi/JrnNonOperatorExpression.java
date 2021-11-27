// This is a generated file. Not intended for manual editing.
package com.qalens.corr.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JrnNonOperatorExpression extends PsiElement {

  @Nullable
  JrnBracketedExpression getBracketedExpression();

  @Nullable
  JrnConstantExpression getConstantExpression();

  @Nullable
  JrnFillableObjectTemplate getFillableObjectTemplate();

  @Nullable
  JrnFunctionExpression getFunctionExpression();

  @Nullable
  JrnVariableExpression getVariableExpression();

}
