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

public class JrnHeadersStartingRestDataImpl extends ASTWrapperPsiElement implements JrnHeadersStartingRestData {

  public JrnHeadersStartingRestDataImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JrnVisitor visitor) {
    visitor.visitHeadersStartingRestData(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JrnVisitor) accept((JrnVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JrnExtractableHeaders getExtractableHeaders() {
    return findNotNullChildByClass(JrnExtractableHeaders.class);
  }

  @Override
  @Nullable
  public JrnExtractableTemplate getExtractableTemplate() {
    return findChildByClass(JrnExtractableTemplate.class);
  }

}
