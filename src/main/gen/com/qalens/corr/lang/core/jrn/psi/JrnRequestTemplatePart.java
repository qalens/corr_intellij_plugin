// This is a generated file. Not intended for manual editing.
package com.qalens.corr.lang.core.jrn.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JrnRequestTemplatePart extends PsiElement {

  @Nullable
  JrnExpression getExpression();

  @Nullable
  JrnFillableHeaders getFillableHeaders();

  @Nullable
  JrnFillableObjectTemplate getFillableObjectTemplate();

  @Nullable
  JrnFillableTextTemplate getFillableTextTemplate();

}
