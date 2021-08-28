// This is a generated file. Not intended for manual editing.
package com.qalens.corr.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.qalens.corr.lang.core.psi.JrnElementTypes.*;
import com.qalens.corr.lang.core.psi.*;

public class JrnSyncStepImpl extends JrnStepImpl implements JrnSyncStep {

  public JrnSyncStepImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull JrnVisitor visitor) {
    visitor.visitSyncStep(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JrnVisitor) accept((JrnVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JrnExpression getExpression() {
    return findChildByClass(JrnExpression.class);
  }

  @Override
  @Nullable
  public JrnVariableReference getVariableReference() {
    return findChildByClass(JrnVariableReference.class);
  }

}
