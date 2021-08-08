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

public class JrnExtractableForLoopImpl extends ASTWrapperPsiElement implements JrnExtractableForLoop {

  public JrnExtractableForLoopImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JrnVisitor visitor) {
    visitor.visitExtractableForLoop(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JrnVisitor) accept((JrnVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JrnExtractableObjectTemplate getExtractableObjectTemplate() {
    return findNotNullChildByClass(JrnExtractableObjectTemplate.class);
  }

  @Override
  @NotNull
  public List<JrnVariableReference> getVariableReferenceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JrnVariableReference.class);
  }

}
