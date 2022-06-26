// This is a generated file. Not intended for manual editing.
package com.qalens.corr.lang.core.jrn.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.qalens.corr.lang.core.jrn.psi.JrnElementTypes.*;
import com.qalens.corr.lang.core.jrn.psi.*;

public class JrnTransactionStepImpl extends JrnStepImpl implements JrnTransactionStep {

  public JrnTransactionStepImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull JrnVisitor visitor) {
    visitor.visitTransactionStep(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JrnVisitor) accept((JrnVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JrnBlock getBlock() {
    return findChildByClass(JrnBlock.class);
  }

  @Override
  @Nullable
  public JrnExpression getExpression() {
    return findChildByClass(JrnExpression.class);
  }

}
