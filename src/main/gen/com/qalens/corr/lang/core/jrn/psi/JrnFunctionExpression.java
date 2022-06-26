// This is a generated file. Not intended for manual editing.
package com.qalens.corr.lang.core.jrn.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JrnFunctionExpression extends PsiElement {

  @Nullable
  JrnBinaryFunction getBinaryFunction();

  @Nullable
  JrnMultiValuedFunction getMultiValuedFunction();

  @Nullable
  JrnNoArgFunction getNoArgFunction();

  @Nullable
  JrnUnaryFunction getUnaryFunction();

}
