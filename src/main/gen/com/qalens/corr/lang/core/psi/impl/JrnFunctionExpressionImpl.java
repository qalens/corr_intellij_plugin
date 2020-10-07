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

public class JrnFunctionExpressionImpl extends ASTWrapperPsiElement implements JrnFunctionExpression {

  public JrnFunctionExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JrnVisitor visitor) {
    visitor.visitFunctionExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JrnVisitor) accept((JrnVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JrnBinaryFunction getBinaryFunction() {
    return findChildByClass(JrnBinaryFunction.class);
  }

  @Override
  @Nullable
  public JrnMultiValuedFunction getMultiValuedFunction() {
    return findChildByClass(JrnMultiValuedFunction.class);
  }

  @Override
  @Nullable
  public JrnNoArgFunction getNoArgFunction() {
    return findChildByClass(JrnNoArgFunction.class);
  }

  @Override
  @Nullable
  public JrnUnaryFunction getUnaryFunction() {
    return findChildByClass(JrnUnaryFunction.class);
  }

}
