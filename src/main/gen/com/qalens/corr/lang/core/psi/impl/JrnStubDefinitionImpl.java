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

public class JrnStubDefinitionImpl extends ASTWrapperPsiElement implements JrnStubDefinition {

  public JrnStubDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JrnVisitor visitor) {
    visitor.visitStubDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JrnVisitor) accept((JrnVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JrnRequestExtractor getRequestExtractor() {
    return findChildByClass(JrnRequestExtractor.class);
  }

  @Override
  @Nullable
  public JrnRequestMatcher getRequestMatcher() {
    return findChildByClass(JrnRequestMatcher.class);
  }

  @Override
  @Nullable
  public JrnResponseGenerator getResponseGenerator() {
    return findChildByClass(JrnResponseGenerator.class);
  }

  @Override
  @Nullable
  public JrnRestVerb getRestVerb() {
    return findChildByClass(JrnRestVerb.class);
  }

}
