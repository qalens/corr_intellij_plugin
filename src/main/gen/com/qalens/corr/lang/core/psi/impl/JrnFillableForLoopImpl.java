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

public class JrnFillableForLoopImpl extends ASTWrapperPsiElement implements JrnFillableForLoop {

  public JrnFillableForLoopImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JrnVisitor visitor) {
    visitor.visitFillableForLoop(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JrnVisitor) accept((JrnVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JrnFillableForLoopWithArguments getFillableForLoopWithArguments() {
    return findChildByClass(JrnFillableForLoopWithArguments.class);
  }

  @Override
  @Nullable
  public JrnFillableForLoopWithoutArguments getFillableForLoopWithoutArguments() {
    return findChildByClass(JrnFillableForLoopWithoutArguments.class);
  }

  @Override
  @NotNull
  public JrnVariableReference getVariableReference() {
    return findNotNullChildByClass(JrnVariableReference.class);
  }

}
