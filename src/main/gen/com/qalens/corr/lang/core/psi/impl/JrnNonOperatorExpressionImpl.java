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

public class JrnNonOperatorExpressionImpl extends ASTWrapperPsiElement implements JrnNonOperatorExpression {

  public JrnNonOperatorExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JrnVisitor visitor) {
    visitor.visitNonOperatorExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JrnVisitor) accept((JrnVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JrnBracketedExpression getBracketedExpression() {
    return findChildByClass(JrnBracketedExpression.class);
  }

  @Override
  @Nullable
  public JrnConstantExpression getConstantExpression() {
    return findChildByClass(JrnConstantExpression.class);
  }

  @Override
  @Nullable
  public JrnFillableObjectTemplate getFillableObjectTemplate() {
    return findChildByClass(JrnFillableObjectTemplate.class);
  }

  @Override
  @Nullable
  public JrnFunctionExpression getFunctionExpression() {
    return findChildByClass(JrnFunctionExpression.class);
  }

  @Override
  @Nullable
  public JrnVariableExpression getVariableExpression() {
    return findChildByClass(JrnVariableExpression.class);
  }

}
