// This is a generated file. Not intended for manual editing.
package com.qalens.corr.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JrnStatement extends PsiElement {

  @Nullable
  JrnForStatement getForStatement();

  @Nullable
  JrnIfElseStatement getIfElseStatement();

  @Nullable
  JrnLetStatement getLetStatement();

  @Nullable
  JrnListenerStep getListenerStep();

  @Nullable
  JrnLoadStep getLoadStep();

  @Nullable
  JrnPrintStatement getPrintStatement();

  @Nullable
  JrnPushStatement getPushStatement();

  @Nullable
  JrnRestStep getRestStep();

  @Nullable
  JrnSyncStep getSyncStep();

}
