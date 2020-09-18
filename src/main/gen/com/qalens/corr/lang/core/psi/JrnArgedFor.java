// This is a generated file. Not intended for manual editing.
package com.qalens.corr.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JrnArgedFor extends PsiElement {

  @Nullable
  JrnMultipleStatement getMultipleStatement();

  @Nullable
  JrnStatement getStatement();

  @NotNull
  List<JrnVariableReference> getVariableReferenceList();

}
