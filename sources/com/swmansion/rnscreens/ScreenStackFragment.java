package com.swmansion.rnscreens;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.PixelUtil;
import com.google.android.material.appbar.AppBarLayout;

public class ScreenStackFragment extends ScreenFragment {
    private static final float TOOLBAR_ELEVATION = PixelUtil.toPixelFromDIP(4.0f);
    private AppBarLayout mAppBarLayout;
    private boolean mShadowHidden;
    private Toolbar mToolbar;

    private static class NotifyingCoordinatorLayout extends CoordinatorLayout {
        private final ScreenFragment mFragment;

        public NotifyingCoordinatorLayout(Context context, ScreenFragment screenFragment) {
            super(context);
            this.mFragment = screenFragment;
        }

        /* access modifiers changed from: protected */
        public void onAnimationEnd() {
            super.onAnimationEnd();
            this.mFragment.onViewAnimationEnd();
        }
    }

    public ScreenStackFragment(Screen screen) {
        super(screen);
    }

    public void removeToolbar() {
        Toolbar toolbar;
        AppBarLayout appBarLayout;
        if (!(this.mAppBarLayout == null || (toolbar = this.mToolbar) == null || toolbar.getParent() != (appBarLayout = this.mAppBarLayout))) {
            appBarLayout.removeView(this.mToolbar);
        }
        this.mToolbar = null;
    }

    public void setToolbar(Toolbar toolbar) {
        AppBarLayout appBarLayout = this.mAppBarLayout;
        if (appBarLayout != null) {
            appBarLayout.addView(toolbar);
        }
        this.mToolbar = toolbar;
        AppBarLayout.LayoutParams layoutParams = new AppBarLayout.LayoutParams(-1, -2);
        layoutParams.setScrollFlags(0);
        this.mToolbar.setLayoutParams(layoutParams);
    }

    public void setToolbarShadowHidden(boolean z) {
        if (this.mShadowHidden != z) {
            this.mAppBarLayout.setTargetElevation(z ? 0.0f : TOOLBAR_ELEVATION);
            this.mShadowHidden = z;
        }
    }

    public void onStackUpdate() {
        View childAt = this.mScreenView.getChildAt(0);
        if (childAt instanceof ScreenStackHeaderConfig) {
            ((ScreenStackHeaderConfig) childAt).onUpdate();
        }
    }

    public void onViewAnimationEnd() {
        super.onViewAnimationEnd();
        notifyViewAppearTransitionEnd();
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (!z || i != 0) {
            return null;
        }
        notifyViewAppearTransitionEnd();
        return null;
    }

    private void notifyViewAppearTransitionEnd() {
        ViewParent parent = getView().getParent();
        if (parent instanceof ScreenStack) {
            ((ScreenStack) parent).onViewAppearTransitionEnd();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        NotifyingCoordinatorLayout notifyingCoordinatorLayout = new NotifyingCoordinatorLayout(getContext(), this);
        CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-1, -1);
        layoutParams.setBehavior(new AppBarLayout.ScrollingViewBehavior());
        this.mScreenView.setLayoutParams(layoutParams);
        notifyingCoordinatorLayout.addView(recycleView(this.mScreenView));
        this.mAppBarLayout = new AppBarLayout(getContext());
        this.mAppBarLayout.setBackgroundColor(0);
        this.mAppBarLayout.setLayoutParams(new AppBarLayout.LayoutParams(-1, -2));
        notifyingCoordinatorLayout.addView(this.mAppBarLayout);
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            this.mAppBarLayout.addView(recycleView(toolbar));
        }
        return notifyingCoordinatorLayout;
    }

    public boolean isDismissable() {
        return this.mScreenView.isGestureEnabled();
    }

    public boolean canNavigateBack() {
        ScreenContainer container = this.mScreenView.getContainer();
        if (!(container instanceof ScreenStack)) {
            throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
        } else if (((ScreenStack) container).getRootScreen() != getScreen()) {
            return true;
        } else {
            Fragment parentFragment = getParentFragment();
            if (parentFragment instanceof ScreenStackFragment) {
                return ((ScreenStackFragment) parentFragment).canNavigateBack();
            }
            return false;
        }
    }

    public void dismiss() {
        ScreenContainer container = this.mScreenView.getContainer();
        if (container instanceof ScreenStack) {
            ((ScreenStack) container).dismiss(this);
            return;
        }
        throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
    }
}
