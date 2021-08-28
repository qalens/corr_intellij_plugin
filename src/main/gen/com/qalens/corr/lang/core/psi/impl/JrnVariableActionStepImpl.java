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

public class JrnVariableActionStepImpl extends JrnStepImpl implements JrnVariableActionStep {

  public JrnVariableActionStepImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull JrnVisitor visitor) {
    visitor.visitVariableActionStep(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JrnVisitor) accept((JrnVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JrnForStepPart getForStepPart() {
    return findChildByClass(JrnForStepPart.class);
  }

  @Override
  @Nullable
  public JrnPushStepPart getPushStepPart() {
    return findChildByClass(JrnPushStepPart.class);
  }

  @Override
  @NotNull
  public JrnVariableReference getVariableReference() {
    return findNotNullChildByClass(JrnVariableReference.class);
  }

}
