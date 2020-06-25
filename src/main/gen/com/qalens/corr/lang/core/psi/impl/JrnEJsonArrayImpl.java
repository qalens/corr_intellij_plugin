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

public class JrnEJsonArrayImpl extends ASTWrapperPsiElement implements JrnEJsonArray {

  public JrnEJsonArrayImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JrnVisitor visitor) {
    visitor.visitEJsonArray(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JrnVisitor) accept((JrnVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JrnEforLoop getEforLoop() {
    return findChildByClass(JrnEforLoop.class);
  }

  @Override
  @NotNull
  public List<JrnEJsonTemplate> getEJsonTemplateList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JrnEJsonTemplate.class);
  }

}
