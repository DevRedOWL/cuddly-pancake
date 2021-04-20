package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.views.text.ReactFontManager;
import com.swmansion.rnscreens.ScreenStackHeaderSubview;
import java.util.ArrayList;

public class ScreenStackHeaderConfig extends ViewGroup {
    private boolean mBackButtonInCustomView;
    private View.OnClickListener mBackClickListener = new View.OnClickListener() {
        public void onClick(View view) {
            ScreenStackFragment access$000 = ScreenStackHeaderConfig.this.getScreenFragment();
            if (access$000 != null) {
                ScreenStack access$100 = ScreenStackHeaderConfig.this.getScreenStack();
                if (access$100 == null || access$100.getRootScreen() != access$000.getScreen()) {
                    access$000.dismiss();
                    return;
                }
                Fragment parentFragment = access$000.getParentFragment();
                if (parentFragment instanceof ScreenStackFragment) {
                    ((ScreenStackFragment) parentFragment).dismiss();
                }
            }
        }
    };
    private int mBackgroundColor;
    private final ArrayList<ScreenStackHeaderSubview> mConfigSubviews = new ArrayList<>(3);
    private int mDefaultStartInset;
    private int mDefaultStartInsetWithNavigation;
    private boolean mDestroyed;
    private boolean mIsAttachedToWindow = false;
    private boolean mIsBackButtonHidden;
    private boolean mIsHidden;
    private boolean mIsShadowHidden;
    private int mTintColor;
    private String mTitle;
    private int mTitleColor;
    private String mTitleFontFamily;
    private float mTitleFontSize;
    private final Toolbar mToolbar;

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public ScreenStackHeaderConfig(Context context) {
        super(context);
        setVisibility(8);
        this.mToolbar = new Toolbar(context);
        this.mDefaultStartInset = this.mToolbar.getContentInsetStart();
        this.mDefaultStartInsetWithNavigation = this.mToolbar.getContentInsetStartWithNavigation();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16843827, typedValue, true)) {
            this.mToolbar.setBackgroundColor(typedValue.data);
        }
    }

    public void destroy() {
        this.mDestroyed = true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mIsAttachedToWindow = true;
        onUpdate();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mIsAttachedToWindow = false;
    }

    private Screen getScreen() {
        ViewParent parent = getParent();
        if (parent instanceof Screen) {
            return (Screen) parent;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public ScreenStack getScreenStack() {
        Screen screen = getScreen();
        if (screen == null) {
            return null;
        }
        ScreenContainer container = screen.getContainer();
        if (container instanceof ScreenStack) {
            return (ScreenStack) container;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public ScreenStackFragment getScreenFragment() {
        ViewParent parent = getParent();
        if (!(parent instanceof Screen)) {
            return null;
        }
        ScreenFragment fragment = ((Screen) parent).getFragment();
        if (fragment instanceof ScreenStackFragment) {
            return (ScreenStackFragment) fragment;
        }
        return null;
    }

    public void onUpdate() {
        boolean z;
        AppCompatActivity appCompatActivity;
        Drawable navigationIcon;
        Screen screen = (Screen) getParent();
        ScreenStack screenStack = getScreenStack();
        if (screenStack == null || screenStack.getTopScreen() == screen) {
            z = true;
        } else {
            z = false;
        }
        if (this.mIsAttachedToWindow && z && !this.mDestroyed && (appCompatActivity = (AppCompatActivity) getScreenFragment().getActivity()) != null) {
            if (!this.mIsHidden) {
                if (this.mToolbar.getParent() == null) {
                    getScreenFragment().setToolbar(this.mToolbar);
                }
                appCompatActivity.setSupportActionBar(this.mToolbar);
                ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
                this.mToolbar.setContentInsetStartWithNavigation(this.mDefaultStartInsetWithNavigation);
                Toolbar toolbar = this.mToolbar;
                int i = this.mDefaultStartInset;
                toolbar.setContentInsetsRelative(i, i);
                supportActionBar.setDisplayHomeAsUpEnabled(getScreenFragment().canNavigateBack() && !this.mIsBackButtonHidden);
                this.mToolbar.setNavigationOnClickListener(this.mBackClickListener);
                getScreenFragment().setToolbarShadowHidden(this.mIsShadowHidden);
                supportActionBar.setTitle((CharSequence) this.mTitle);
                if (TextUtils.isEmpty(this.mTitle)) {
                    this.mToolbar.setContentInsetStartWithNavigation(0);
                }
                TextView titleTextView = getTitleTextView();
                int i2 = this.mTitleColor;
                if (i2 != 0) {
                    this.mToolbar.setTitleTextColor(i2);
                }
                if (titleTextView != null) {
                    if (this.mTitleFontFamily != null) {
                        titleTextView.setTypeface(ReactFontManager.getInstance().getTypeface(this.mTitleFontFamily, 0, getContext().getAssets()));
                    }
                    float f = this.mTitleFontSize;
                    if (f > 0.0f) {
                        titleTextView.setTextSize(f);
                    }
                }
                int i3 = this.mBackgroundColor;
                if (i3 != 0) {
                    this.mToolbar.setBackgroundColor(i3);
                }
                if (!(this.mTintColor == 0 || (navigationIcon = this.mToolbar.getNavigationIcon()) == null)) {
                    navigationIcon.setColorFilter(this.mTintColor, PorterDuff.Mode.SRC_ATOP);
                }
                for (int childCount = this.mToolbar.getChildCount() - 1; childCount >= 0; childCount--) {
                    if (this.mToolbar.getChildAt(childCount) instanceof ScreenStackHeaderSubview) {
                        this.mToolbar.removeViewAt(childCount);
                    }
                }
                int size = this.mConfigSubviews.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ScreenStackHeaderSubview screenStackHeaderSubview = this.mConfigSubviews.get(i4);
                    ScreenStackHeaderSubview.Type type = screenStackHeaderSubview.getType();
                    if (type == ScreenStackHeaderSubview.Type.BACK) {
                        View childAt = screenStackHeaderSubview.getChildAt(0);
                        if (childAt instanceof ImageView) {
                            supportActionBar.setHomeAsUpIndicator(((ImageView) childAt).getDrawable());
                        } else {
                            throw new JSApplicationIllegalArgumentException("Back button header config view should have Image as first child");
                        }
                    } else {
                        Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams(-2, -1);
                        int i5 = C29992.$SwitchMap$com$swmansion$rnscreens$ScreenStackHeaderSubview$Type[type.ordinal()];
                        if (i5 == 1) {
                            if (!this.mBackButtonInCustomView) {
                                this.mToolbar.setNavigationIcon((Drawable) null);
                            }
                            this.mToolbar.setTitle((CharSequence) null);
                            layoutParams.gravity = 3;
                        } else if (i5 == 2) {
                            layoutParams.gravity = 5;
                        } else if (i5 == 3) {
                            layoutParams.width = -1;
                            layoutParams.gravity = 1;
                            this.mToolbar.setTitle((CharSequence) null);
                        }
                        screenStackHeaderSubview.setLayoutParams(layoutParams);
                        this.mToolbar.addView(screenStackHeaderSubview);
                    }
                }
            } else if (this.mToolbar.getParent() != null) {
                getScreenFragment().removeToolbar();
            }
        }
    }

    /* renamed from: com.swmansion.rnscreens.ScreenStackHeaderConfig$2 */
    static /* synthetic */ class C29992 {
        static final /* synthetic */ int[] $SwitchMap$com$swmansion$rnscreens$ScreenStackHeaderSubview$Type = new int[ScreenStackHeaderSubview.Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.swmansion.rnscreens.ScreenStackHeaderSubview$Type[] r0 = com.swmansion.rnscreens.ScreenStackHeaderSubview.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$swmansion$rnscreens$ScreenStackHeaderSubview$Type = r0
                int[] r0 = $SwitchMap$com$swmansion$rnscreens$ScreenStackHeaderSubview$Type     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.swmansion.rnscreens.ScreenStackHeaderSubview$Type r1 = com.swmansion.rnscreens.ScreenStackHeaderSubview.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$swmansion$rnscreens$ScreenStackHeaderSubview$Type     // Catch:{ NoSuchFieldError -> 0x001f }
                com.swmansion.rnscreens.ScreenStackHeaderSubview$Type r1 = com.swmansion.rnscreens.ScreenStackHeaderSubview.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$swmansion$rnscreens$ScreenStackHeaderSubview$Type     // Catch:{ NoSuchFieldError -> 0x002a }
                com.swmansion.rnscreens.ScreenStackHeaderSubview$Type r1 = com.swmansion.rnscreens.ScreenStackHeaderSubview.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenStackHeaderConfig.C29992.<clinit>():void");
        }
    }

    private void maybeUpdate() {
        if (getParent() != null && !this.mDestroyed) {
            onUpdate();
        }
    }

    public ScreenStackHeaderSubview getConfigSubview(int i) {
        return this.mConfigSubviews.get(i);
    }

    public int getConfigSubviewsCount() {
        return this.mConfigSubviews.size();
    }

    public void removeConfigSubview(int i) {
        this.mConfigSubviews.remove(i);
        maybeUpdate();
    }

    public void removeAllConfigSubviews() {
        this.mConfigSubviews.clear();
        maybeUpdate();
    }

    public void addConfigSubview(ScreenStackHeaderSubview screenStackHeaderSubview, int i) {
        this.mConfigSubviews.add(i, screenStackHeaderSubview);
        maybeUpdate();
    }

    private TextView getTitleTextView() {
        int childCount = this.mToolbar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.mToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (textView.getText().equals(this.mToolbar.getTitle())) {
                    return textView;
                }
            }
        }
        return null;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public void setTitleFontFamily(String str) {
        this.mTitleFontFamily = str;
    }

    public void setTitleFontSize(float f) {
        this.mTitleFontSize = f;
    }

    public void setTitleColor(int i) {
        this.mTitleColor = i;
    }

    public void setTintColor(int i) {
        this.mTintColor = i;
    }

    public void setBackgroundColor(int i) {
        this.mBackgroundColor = i;
    }

    public void setHideShadow(boolean z) {
        this.mIsShadowHidden = z;
    }

    public void setHideBackButton(boolean z) {
        this.mIsBackButtonHidden = z;
    }

    public void setHidden(boolean z) {
        this.mIsHidden = z;
    }

    public void setBackButtonInCustomView(boolean z) {
        this.mBackButtonInCustomView = z;
    }
}
