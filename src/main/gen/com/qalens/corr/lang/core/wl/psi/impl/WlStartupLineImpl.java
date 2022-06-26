// This is a generated file. Not intended for manual editing.
package com.qalens.corr.lang.core.wl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.qalens.corr.lang.core.wl.psi.WlElementTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.qalens.corr.lang.core.wl.psi.*;

public class WlStartupLineImpl extends ASTWrapperPsiElement implements WlStartupLine {

  public WlStartupLineImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WlVisitor visitor) {
    visitor.visitStartupLine(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WlVisitor) accept((WlVisitor)visitor);
    else super.accept(visitor);
  }

}
