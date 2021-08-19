// This is a generated file. Not intended for manual editing.
package com.qalens.corr.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JrnRestStep extends PsiElement {

  @Nullable
  JrnBodyStartingRestData getBodyStartingRestData();

  @NotNull
  JrnFillableRequestTemplate getFillableRequestTemplate();

  @Nullable
  JrnHeadersStartingRestData getHeadersStartingRestData();

  @NotNull
  JrnRestVerb getRestVerb();

}
