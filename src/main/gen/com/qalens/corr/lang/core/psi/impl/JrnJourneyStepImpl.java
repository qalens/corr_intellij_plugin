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

public class JrnJourneyStepImpl extends JrnStepImpl implements JrnJourneyStep {

  public JrnJourneyStepImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull JrnVisitor visitor) {
    visitor.visitJourneyStep(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JrnVisitor) accept((JrnVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JrnExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JrnExpression.class);
  }

}