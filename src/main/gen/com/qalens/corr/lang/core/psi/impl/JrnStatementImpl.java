// This is a generated file. Not intended for manual editing.
package com.qalens.corr.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.qalens.corr.lang.core.psi.JrnElementTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.qalens.corr.lang.core.psi.*;

public class JrnStatementImpl extends ASTWrapperPsiElement implements JrnStatement {

  public JrnStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JrnVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JrnVisitor) accept((JrnVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JrnForStatement getForStatement() {
    return findChildByClass(JrnForStatement.class);
  }

  @Override
  @Nullable
  public JrnIfElseStatement getIfElseStatement() {
    return findChildByClass(JrnIfElseStatement.class);
  }

  @Override
  @Nullable
  public JrnLetStatement getLetStatement() {
    return findChildByClass(JrnLetStatement.class);
  }

  @Override
  @Nullable
  public JrnListenerStep getListenerStep() {
    return findChildByClass(JrnListenerStep.class);
  }

  @Override
  @Nullable
  public JrnLoadStep getLoadStep() {
    return findChildByClass(JrnLoadStep.class);
  }

  @Override
  @Nullable
  public JrnPrintStatement getPrintStatement() {
    return findChildByClass(JrnPrintStatement.class);
  }

  @Override
  @Nullable
  public JrnPushStatement getPushStatement() {
    return findChildByClass(JrnPushStatement.class);
  }

  @Override
  @Nullable
  public JrnRestStep getRestStep() {
    return findChildByClass(JrnRestStep.class);
  }

  @Override
  @Nullable
  public JrnSyncStep getSyncStep() {
    return findChildByClass(JrnSyncStep.class);
  }

}
