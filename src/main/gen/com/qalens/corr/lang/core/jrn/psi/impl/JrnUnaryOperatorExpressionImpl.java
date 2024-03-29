// This is a generated file. Not intended for manual editing.
package com.qalens.corr.lang.core.jrn.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.qalens.corr.lang.core.jrn.psi.JrnElementTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.qalens.corr.lang.core.jrn.psi.*;

public class JrnUnaryOperatorExpressionImpl extends ASTWrapperPsiElement implements JrnUnaryOperatorExpression {

  public JrnUnaryOperatorExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JrnVisitor visitor) {
    visitor.visitUnaryOperatorExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JrnVisitor) accept((JrnVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JrnNonOperatorExpression getNonOperatorExpression() {
    return findNotNullChildByClass(JrnNonOperatorExpression.class);
  }

  @Override
  @Nullable
  public JrnUnaryPostOperator getUnaryPostOperator() {
    return findChildByClass(JrnUnaryPostOperator.class);
  }

  @Override
  @Nullable
  public JrnUnaryPreOperator getUnaryPreOperator() {
    return findChildByClass(JrnUnaryPreOperator.class);
  }

}
