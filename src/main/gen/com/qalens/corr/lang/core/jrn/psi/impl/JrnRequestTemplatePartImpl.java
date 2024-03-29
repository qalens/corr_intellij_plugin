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

public class JrnRequestTemplatePartImpl extends ASTWrapperPsiElement implements JrnRequestTemplatePart {

  public JrnRequestTemplatePartImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JrnVisitor visitor) {
    visitor.visitRequestTemplatePart(this);
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
  public JrnFillableHeaders getFillableHeaders() {
    return findChildByClass(JrnFillableHeaders.class);
  }

  @Override
  @Nullable
  public JrnFillableObjectTemplate getFillableObjectTemplate() {
    return findChildByClass(JrnFillableObjectTemplate.class);
  }

  @Override
  @Nullable
  public JrnFillableTextTemplate getFillableTextTemplate() {
    return findChildByClass(JrnFillableTextTemplate.class);
  }

}
