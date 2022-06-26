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

public class JrnAssignmentStepImpl extends JrnStepImpl implements JrnAssignmentStep {

  public JrnAssignmentStepImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull JrnVisitor visitor) {
    visitor.visitAssignmentStep(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JrnVisitor) accept((JrnVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JrnAssignable getAssignable() {
    return findChildByClass(JrnAssignable.class);
  }

  @Override
  @NotNull
  public List<JrnExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JrnExpression.class);
  }

  @Override
  @Nullable
  public JrnVariableReference getVariableReference() {
    return findChildByClass(JrnVariableReference.class);
  }

}