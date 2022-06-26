// This is a generated file. Not intended for manual editing.
package com.qalens.corr.lang.core.jrn.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JrnRootFn extends PsiElement {

  @NotNull
  JrnBlock getBlock();

  @NotNull
  JrnJourneyName getJourneyName();

  @NotNull
  List<JrnVariableReference> getVariableReferenceList();

}
