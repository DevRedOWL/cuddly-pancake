package com.loopeer.shadow;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import com.google.android.material.badge.BadgeDrawable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 2}, mo51342d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b.\u0018\u00002\u00020\u0001:\u0002\u0001B'\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010G\u001a\u00020)2\u0006\u0010H\u001a\u00020IH\u0014J\u0012\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\u0010\u0010N\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010MJ\u0018\u0010O\u001a\u00020K2\u0006\u0010P\u001a\u00020\u00152\u0006\u0010Q\u001a\u00020\u0015H\u0016J\b\u0010R\u001a\u00020KH\u0014J\u0010\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u0005H\u0016J\u0010\u0010S\u001a\u00020I2\u0006\u0010V\u001a\u00020IH\u0014J\b\u0010W\u001a\u00020XH\u0016J\n\u0010Y\u001a\u0004\u0018\u00010'H\u0016J\b\u0010Z\u001a\u00020\u0007H\u0016J\b\u0010[\u001a\u00020\u0007H\u0002J\u0006\u0010\\\u001a\u00020\u0007J\u0006\u0010]\u001a\u00020\u0007J\b\u0010^\u001a\u00020\u0007H\u0002J\b\u0010_\u001a\u00020\u0015H\u0002J\b\u0010`\u001a\u00020KH\u0016J0\u0010a\u001a\u00020K2\u0006\u0010b\u001a\u00020\u00072\u0006\u0010c\u001a\u00020\u00072\u0006\u0010d\u001a\u00020\u00072\u0006\u0010e\u001a\u00020\u00072\u0006\u0010f\u001a\u00020)H\u0002J\u0012\u0010g\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010MH\u0014J0\u0010h\u001a\u00020K2\u0006\u0010i\u001a\u00020)2\u0006\u0010b\u001a\u00020\u00072\u0006\u0010c\u001a\u00020\u00072\u0006\u0010d\u001a\u00020\u00072\u0006\u0010e\u001a\u00020\u0007H\u0014J\u0018\u0010j\u001a\u00020K2\u0006\u0010k\u001a\u00020\u00072\u0006\u0010l\u001a\u00020\u0007H\u0014J(\u0010m\u001a\u00020K2\u0006\u0010n\u001a\u00020\u00072\u0006\u0010o\u001a\u00020\u00072\u0006\u0010p\u001a\u00020\u00072\u0006\u0010q\u001a\u00020\u0007H\u0014J&\u0010r\u001a\u00020K2\u0006\u0010s\u001a\u00020\u00152\u0006\u0010t\u001a\u00020\u00152\u0006\u0010u\u001a\u00020\u00152\u0006\u0010v\u001a\u00020\u0015J\u0012\u0010w\u001a\u00020K2\b\u0010x\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010y\u001a\u00020K2\u0006\u0010z\u001a\u00020\u0007H\u0016J&\u0010{\u001a\u00020K2\u0006\u0010b\u001a\u00020\u00072\u0006\u0010c\u001a\u00020\u00072\u0006\u0010d\u001a\u00020\u00072\u0006\u0010e\u001a\u00020\u0007J\b\u0010|\u001a\u00020)H\u0016J\b\u0010}\u001a\u00020KH\u0002J\b\u0010~\u001a\u00020KH\u0002J+\u0010~\u001a\u00020K2\u0006\u0010\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\u0007H\u0002J\u0012\u0010\u0001\u001a\u00020)2\u0007\u0010\u0001\u001a\u00020'H\u0014R\u000e\u0010\t\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R$\u0010#\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020)X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020-X\u0004¢\u0006\u0002\n\u0000R$\u0010/\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000f\"\u0004\b1\u0010\u0011R$\u00102\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u0015@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0017\"\u0004\b4\u0010\u0019R$\u00105\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u0015@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0017\"\u0004\b7\u0010\u0019R$\u00108\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u000f\"\u0004\b:\u0010\u0011R$\u0010;\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u000f\"\u0004\b=\u0010\u0011R$\u0010>\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u000f\"\u0004\b@\u0010\u0011R$\u0010A\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u000f\"\u0004\bC\u0010\u0011R&\u0010D\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00158F@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0017\"\u0004\bF\u0010\u0019¨\u0006\u0001"}, mo51343d2 = {"Lcom/loopeer/shadow/ShadowView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyleInt", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "DEFAULT_CHILD_GRAVITY", "SIZE_DEFAULT", "SIZE_UNSET", "value", "backgroundClr", "getBackgroundClr", "()I", "setBackgroundClr", "(I)V", "bgPaint", "Landroid/graphics/Paint;", "cornerRadiusBL", "", "getCornerRadiusBL", "()F", "setCornerRadiusBL", "(F)V", "cornerRadiusBR", "getCornerRadiusBR", "setCornerRadiusBR", "cornerRadiusTL", "getCornerRadiusTL", "setCornerRadiusTL", "cornerRadiusTR", "getCornerRadiusTR", "setCornerRadiusTR", "foregroundColor", "getForegroundColor", "setForegroundColor", "foregroundDraw", "Landroid/graphics/drawable/Drawable;", "foregroundDrawBoundsChanged", "", "foregroundDrawGravity", "foregroundDrawInPadding", "overlayBounds", "Landroid/graphics/Rect;", "selfBounds", "shadowColor", "getShadowColor", "setShadowColor", "shadowDx", "getShadowDx", "setShadowDx", "shadowDy", "getShadowDy", "setShadowDy", "shadowMarginBottom", "getShadowMarginBottom", "setShadowMarginBottom", "shadowMarginLeft", "getShadowMarginLeft", "setShadowMarginLeft", "shadowMarginRight", "getShadowMarginRight", "setShadowMarginRight", "shadowMarginTop", "getShadowMarginTop", "setShadowMarginTop", "shadowRadius", "getShadowRadius", "setShadowRadius", "checkLayoutParams", "p", "Landroid/view/ViewGroup$LayoutParams;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "drawForeground", "drawableHotspotChanged", "x", "y", "drawableStateChanged", "generateLayoutParams", "Lcom/loopeer/shadow/ShadowView$LayoutParams;", "attrs", "lp", "getAccessibilityClassName", "", "getForeground", "getForegroundGravity", "getPaddingBottomWithForeground", "getPaddingLeftWithForeground", "getPaddingRightWithForeground", "getPaddingTopWithForeground", "getShadowMarginMax", "jumpDrawablesToCurrentState", "layoutChildren", "left", "top", "right", "bottom", "forceLeftGravity", "onDraw", "onLayout", "changed", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "w", "h", "oldw", "oldh", "setCornerRadius", "tl", "tr", "br", "bl", "setForeground", "drawable", "setForegroundGravity", "foregroundGravity", "setShadowMargin", "shouldDelayChildPressedState", "updateForegroundColor", "updatePaintShadow", "radius", "dx", "dy", "color", "verifyDrawable", "who", "LayoutParams", "shadow_release"}, mo51344k = 1, mo51345mv = {1, 1, 7})
/* compiled from: ShadowView.kt */
public final class ShadowView extends ViewGroup {
    private final int DEFAULT_CHILD_GRAVITY;
    private int SIZE_DEFAULT;
    private int SIZE_UNSET;
    private HashMap _$_findViewCache;
    private int backgroundClr;
    private final Paint bgPaint;
    private float cornerRadiusBL;
    private float cornerRadiusBR;
    private float cornerRadiusTL;
    private float cornerRadiusTR;
    private int foregroundColor;
    private Drawable foregroundDraw;
    private boolean foregroundDrawBoundsChanged;
    private int foregroundDrawGravity;
    private boolean foregroundDrawInPadding;
    private final Rect overlayBounds;
    private final Rect selfBounds;
    private int shadowColor;
    private float shadowDx;
    private float shadowDy;
    private int shadowMarginBottom;
    private int shadowMarginLeft;
    private int shadowMarginRight;
    private int shadowMarginTop;
    private float shadowRadius;

    public ShadowView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    public ShadowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShadowView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ShadowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.DEFAULT_CHILD_GRAVITY = BadgeDrawable.TOP_START;
        this.SIZE_UNSET = -1;
        this.selfBounds = new Rect();
        this.overlayBounds = new Rect();
        this.foregroundDrawGravity = 119;
        this.foregroundDrawInPadding = true;
        this.bgPaint = new Paint();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2774R.styleable.ShadowView, i, 0);
        setShadowColor(obtainStyledAttributes.getColor(C2774R.styleable.ShadowView_shadowColor, ContextCompat.getColor(context, C2774R.C2775color.shadow_view_default_shadow_color)));
        setForegroundColor(obtainStyledAttributes.getColor(C2774R.styleable.ShadowView_foregroundColor, ContextCompat.getColor(context, C2774R.C2775color.shadow_view_foreground_color_dark)));
        setBackgroundClr(obtainStyledAttributes.getColor(C2774R.styleable.ShadowView_backgroundColor, -1));
        setShadowDx(obtainStyledAttributes.getFloat(C2774R.styleable.ShadowView_shadowDx, 0.0f));
        setShadowDy(obtainStyledAttributes.getFloat(C2774R.styleable.ShadowView_shadowDy, 0.0f));
        setShadowRadius((float) obtainStyledAttributes.getDimensionPixelSize(C2774R.styleable.ShadowView_shadowRadius, this.SIZE_DEFAULT));
        Drawable drawable = obtainStyledAttributes.getDrawable(C2774R.styleable.ShadowView_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C2774R.styleable.ShadowView_shadowMargin, this.SIZE_UNSET);
        if (dimensionPixelSize >= 0) {
            setShadowMarginTop(dimensionPixelSize);
            setShadowMarginLeft(dimensionPixelSize);
            setShadowMarginRight(dimensionPixelSize);
            setShadowMarginBottom(dimensionPixelSize);
        } else {
            setShadowMarginTop(obtainStyledAttributes.getDimensionPixelSize(C2774R.styleable.ShadowView_shadowMarginTop, this.SIZE_DEFAULT));
            setShadowMarginLeft(obtainStyledAttributes.getDimensionPixelSize(C2774R.styleable.ShadowView_shadowMarginLeft, this.SIZE_DEFAULT));
            setShadowMarginRight(obtainStyledAttributes.getDimensionPixelSize(C2774R.styleable.ShadowView_shadowMarginRight, this.SIZE_DEFAULT));
            setShadowMarginBottom(obtainStyledAttributes.getDimensionPixelSize(C2774R.styleable.ShadowView_shadowMarginBottom, this.SIZE_DEFAULT));
        }
        float dimensionPixelSize2 = (float) obtainStyledAttributes.getDimensionPixelSize(C2774R.styleable.ShadowView_cornerRadius, this.SIZE_UNSET);
        if (dimensionPixelSize2 >= ((float) 0)) {
            this.cornerRadiusTL = dimensionPixelSize2;
            this.cornerRadiusTR = dimensionPixelSize2;
            this.cornerRadiusBL = dimensionPixelSize2;
            this.cornerRadiusBR = dimensionPixelSize2;
        } else {
            this.cornerRadiusTL = (float) obtainStyledAttributes.getDimensionPixelSize(C2774R.styleable.ShadowView_cornerRadiusTL, this.SIZE_DEFAULT);
            this.cornerRadiusTR = (float) obtainStyledAttributes.getDimensionPixelSize(C2774R.styleable.ShadowView_cornerRadiusTR, this.SIZE_DEFAULT);
            this.cornerRadiusBL = (float) obtainStyledAttributes.getDimensionPixelSize(C2774R.styleable.ShadowView_cornerRadiusBL, this.SIZE_DEFAULT);
            this.cornerRadiusBR = (float) obtainStyledAttributes.getDimensionPixelSize(C2774R.styleable.ShadowView_cornerRadiusBR, this.SIZE_DEFAULT);
        }
        obtainStyledAttributes.recycle();
        this.bgPaint.setColor(this.backgroundClr);
        this.bgPaint.setAntiAlias(true);
        this.bgPaint.setStyle(Paint.Style.FILL);
        this.bgPaint.setShadowLayer(getShadowRadius(), 0.0f, 1.0f, this.shadowColor);
        setLayerType(1, (Paint) null);
        setWillNotDraw(false);
        setBackground((Drawable) null);
    }

    public final int getShadowColor() {
        return this.shadowColor;
    }

    public final void setShadowColor(int i) {
        this.shadowColor = i;
        updatePaintShadow(getShadowRadius(), this.shadowDx, this.shadowDy, i);
    }

    public final int getForegroundColor() {
        return this.foregroundColor;
    }

    public final void setForegroundColor(int i) {
        this.foregroundColor = i;
        updateForegroundColor();
    }

    public final int getBackgroundClr() {
        return this.backgroundClr;
    }

    public final void setBackgroundClr(int i) {
        this.backgroundClr = i;
        this.bgPaint.setColor(i);
        invalidate();
    }

    public final void setShadowRadius(float f) {
        float shadowMarginMax = (f <= getShadowMarginMax() || getShadowMarginMax() == 0.0f) ? f : getShadowMarginMax();
        this.shadowRadius = f;
        updatePaintShadow(shadowMarginMax, this.shadowDx, this.shadowDy, this.shadowColor);
    }

    public final float getShadowRadius() {
        if (this.shadowRadius <= getShadowMarginMax() || getShadowMarginMax() == 0.0f) {
            return this.shadowRadius;
        }
        return getShadowMarginMax();
    }

    public final float getShadowDx() {
        return this.shadowDx;
    }

    public final void setShadowDx(float f) {
        this.shadowDx = f;
        updatePaintShadow(getShadowRadius(), f, this.shadowDy, this.shadowColor);
    }

    public final float getShadowDy() {
        return this.shadowDy;
    }

    public final void setShadowDy(float f) {
        this.shadowDy = f;
        updatePaintShadow(getShadowRadius(), this.shadowDx, f, this.shadowColor);
    }

    public final float getCornerRadiusTL() {
        return this.cornerRadiusTL;
    }

    public final void setCornerRadiusTL(float f) {
        this.cornerRadiusTL = f;
    }

    public final float getCornerRadiusTR() {
        return this.cornerRadiusTR;
    }

    public final void setCornerRadiusTR(float f) {
        this.cornerRadiusTR = f;
    }

    public final float getCornerRadiusBL() {
        return this.cornerRadiusBL;
    }

    public final void setCornerRadiusBL(float f) {
        this.cornerRadiusBL = f;
    }

    public final float getCornerRadiusBR() {
        return this.cornerRadiusBR;
    }

    public final void setCornerRadiusBR(float f) {
        this.cornerRadiusBR = f;
    }

    public final int getShadowMarginTop() {
        return this.shadowMarginTop;
    }

    public final void setShadowMarginTop(int i) {
        this.shadowMarginTop = i;
        updatePaintShadow();
    }

    public final int getShadowMarginLeft() {
        return this.shadowMarginLeft;
    }

    public final void setShadowMarginLeft(int i) {
        this.shadowMarginLeft = i;
        updatePaintShadow();
    }

    public final int getShadowMarginRight() {
        return this.shadowMarginRight;
    }

    public final void setShadowMarginRight(int i) {
        this.shadowMarginRight = i;
        updatePaintShadow();
    }

    public final int getShadowMarginBottom() {
        return this.shadowMarginBottom;
    }

    public final void setShadowMarginBottom(int i) {
        this.shadowMarginBottom = i;
        updatePaintShadow();
    }

    private final void updatePaintShadow() {
        updatePaintShadow(getShadowRadius(), this.shadowDx, this.shadowDy, this.shadowColor);
    }

    private final void updatePaintShadow(float f, float f2, float f3, int i) {
        this.bgPaint.setShadowLayer(f, f2, f3, i);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
        boolean z = true;
        boolean z2 = getLayoutParams().width == -1;
        if (getLayoutParams().height != -1) {
            z = false;
        }
        int makeMeasureSpec = z2 ? View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - this.shadowMarginRight) - this.shadowMarginLeft, BasicMeasure.EXACTLY) : i;
        int makeMeasureSpec2 = z ? View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.shadowMarginTop) - this.shadowMarginBottom, BasicMeasure.EXACTLY) : i2;
        View childAt = getChildAt(0);
        if (childAt.getVisibility() != 8) {
            measureChildWithMargins(childAt, makeMeasureSpec, 0, makeMeasureSpec2, 0);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                if (z2) {
                    i5 = Math.max(0, childAt.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
                } else {
                    i5 = Math.max(0, childAt.getMeasuredWidth() + this.shadowMarginLeft + this.shadowMarginRight + layoutParams2.leftMargin + layoutParams2.rightMargin);
                }
                if (z) {
                    i4 = Math.max(0, childAt.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
                } else {
                    i4 = Math.max(0, childAt.getMeasuredHeight() + this.shadowMarginTop + this.shadowMarginBottom + layoutParams2.topMargin + layoutParams2.bottomMargin);
                }
                int i7 = i5;
                i3 = View.combineMeasuredStates(0, childAt.getMeasuredState());
                i6 = i7;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.loopeer.shadow.ShadowView.LayoutParams");
            }
        } else {
            i4 = 0;
            i3 = 0;
        }
        int paddingLeft = i6 + getPaddingLeft() + getPaddingRight();
        int max = Math.max(i4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight());
        int max2 = Math.max(paddingLeft, getSuggestedMinimumWidth());
        Drawable foreground = getForeground();
        if (foreground != null) {
            max = Math.max(max, foreground.getMinimumHeight());
            max2 = Math.max(max2, foreground.getMinimumWidth());
        }
        if (!z2) {
            i = makeMeasureSpec;
        }
        int resolveSizeAndState = View.resolveSizeAndState(max2, i, i3);
        if (!z) {
            i2 = makeMeasureSpec2;
        }
        setMeasuredDimension(resolveSizeAndState, View.resolveSizeAndState(max, i2, i3 << 16));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        layoutChildren(i, i2, i3, i4, false);
        if (z) {
            this.foregroundDrawBoundsChanged = z;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void layoutChildren(int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r16.getChildCount()
            int r2 = r16.getPaddingLeftWithForeground()
            int r3 = r19 - r17
            int r4 = r16.getPaddingRightWithForeground()
            int r3 = r3 - r4
            int r4 = r16.getPaddingTopWithForeground()
            int r5 = r20 - r18
            int r6 = r16.getPaddingBottomWithForeground()
            int r5 = r5 - r6
            r6 = 1
            int r1 = r1 - r6
            if (r1 < 0) goto L_0x00cf
            r7 = 0
            r8 = 0
        L_0x0022:
            android.view.View r9 = r0.getChildAt(r8)
            int r10 = r9.getVisibility()
            r11 = 8
            if (r10 == r11) goto L_0x00c9
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            if (r10 == 0) goto L_0x00c1
            com.loopeer.shadow.ShadowView$LayoutParams r10 = (com.loopeer.shadow.ShadowView.LayoutParams) r10
            int r11 = r9.getMeasuredWidth()
            int r12 = r9.getMeasuredHeight()
            int r13 = r10.getGravity()
            r14 = -1
            if (r13 != r14) goto L_0x0047
            int r13 = r0.DEFAULT_CHILD_GRAVITY
        L_0x0047:
            int r14 = r16.getLayoutDirection()
            int r14 = android.view.Gravity.getAbsoluteGravity(r13, r14)
            r13 = r13 & 112(0x70, float:1.57E-43)
            r14 = r14 & 7
            if (r14 == r6) goto L_0x0075
            r15 = 3
            if (r14 == r15) goto L_0x006f
            r15 = 5
            if (r14 == r15) goto L_0x0062
            int r14 = r10.leftMargin
            int r14 = r14 + r2
            int r15 = r0.shadowMarginLeft
        L_0x0060:
            int r14 = r14 + r15
            goto L_0x0087
        L_0x0062:
            if (r21 != 0) goto L_0x006d
            int r14 = r3 - r11
            int r15 = r10.rightMargin
            int r14 = r14 - r15
            int r15 = r0.shadowMarginRight
        L_0x006b:
            int r14 = r14 - r15
            goto L_0x0087
        L_0x006d:
            r14 = 0
            goto L_0x0087
        L_0x006f:
            int r14 = r10.leftMargin
            int r14 = r14 + r2
            int r15 = r0.shadowMarginLeft
            goto L_0x0060
        L_0x0075:
            int r14 = r3 - r2
            int r14 = r14 - r11
            int r14 = r14 / 2
            int r14 = r14 + r2
            int r15 = r10.leftMargin
            int r14 = r14 + r15
            int r15 = r10.rightMargin
            int r14 = r14 - r15
            int r15 = r0.shadowMarginLeft
            int r14 = r14 + r15
            int r15 = r0.shadowMarginRight
            goto L_0x006b
        L_0x0087:
            r15 = 16
            if (r13 == r15) goto L_0x00a8
            r15 = 48
            if (r13 == r15) goto L_0x00a2
            r15 = 80
            if (r13 == r15) goto L_0x009a
            int r10 = r10.topMargin
            int r10 = r10 + r4
            int r13 = r0.shadowMarginTop
        L_0x0098:
            int r10 = r10 + r13
            goto L_0x00bb
        L_0x009a:
            int r13 = r5 - r12
            int r10 = r10.bottomMargin
            int r13 = r13 - r10
            int r10 = r0.shadowMarginBottom
            goto L_0x00b9
        L_0x00a2:
            int r10 = r10.topMargin
            int r10 = r10 + r4
            int r13 = r0.shadowMarginTop
            goto L_0x0098
        L_0x00a8:
            int r13 = r5 - r4
            int r13 = r13 - r12
            int r13 = r13 / 2
            int r13 = r13 + r4
            int r15 = r10.topMargin
            int r13 = r13 + r15
            int r10 = r10.bottomMargin
            int r13 = r13 - r10
            int r10 = r0.shadowMarginTop
            int r13 = r13 + r10
            int r10 = r0.shadowMarginBottom
        L_0x00b9:
            int r10 = r13 - r10
        L_0x00bb:
            int r11 = r11 + r14
            int r12 = r12 + r10
            r9.layout(r14, r10, r11, r12)
            goto L_0x00c9
        L_0x00c1:
            kotlin.TypeCastException r1 = new kotlin.TypeCastException
            java.lang.String r2 = "null cannot be cast to non-null type com.loopeer.shadow.ShadowView.LayoutParams"
            r1.<init>(r2)
            throw r1
        L_0x00c9:
            if (r8 == r1) goto L_0x00cf
            int r8 = r8 + 1
            goto L_0x0022
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loopeer.shadow.ShadowView.layoutChildren(int, int, int, int, boolean):void");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.drawPath(ShapeUtils.INSTANCE.roundedRect((float) this.shadowMarginLeft, (float) this.shadowMarginTop, (float) (getMeasuredWidth() - this.shadowMarginRight), (float) (getMeasuredHeight() - this.shadowMarginBottom), this.cornerRadiusTL, this.cornerRadiusTR, this.cornerRadiusBR, this.cornerRadiusBL), this.bgPaint);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (canvas != null) {
            canvas.save();
            canvas.clipPath(ShapeUtils.INSTANCE.roundedRect((float) this.shadowMarginLeft, (float) this.shadowMarginTop, (float) (getMeasuredWidth() - this.shadowMarginRight), (float) (getMeasuredHeight() - this.shadowMarginBottom), this.cornerRadiusTL, this.cornerRadiusTR, this.cornerRadiusBR, this.cornerRadiusBL));
            drawForeground(canvas);
            canvas.restore();
        }
    }

    private final float getShadowMarginMax() {
        Integer max = ArraysKt.max(new int[]{this.shadowMarginLeft, this.shadowMarginTop, this.shadowMarginRight, this.shadowMarginBottom});
        if (max != null) {
            return (float) max.intValue();
        }
        return 0.0f;
    }

    public final void drawForeground(Canvas canvas) {
        Drawable drawable = this.foregroundDraw;
        if (drawable != null) {
            if (this.foregroundDrawBoundsChanged) {
                this.foregroundDrawBoundsChanged = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.foregroundDrawInPadding) {
                    this.selfBounds.set(0, 0, right, bottom);
                } else {
                    this.selfBounds.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.foregroundDrawGravity, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), this.selfBounds, this.overlayBounds);
                drawable.setBounds(this.overlayBounds);
            }
            drawable.draw(canvas);
        }
    }

    public Drawable getForeground() {
        return this.foregroundDraw;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.foregroundDrawBoundsChanged = true;
    }

    public int getForegroundGravity() {
        return this.foregroundDrawGravity;
    }

    public void setForegroundGravity(int i) {
        if (this.foregroundDrawGravity != i) {
            if ((8388615 & i) == 0) {
                i |= GravityCompat.START;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.foregroundDrawGravity = i;
            if (this.foregroundDrawGravity == 119 && this.foregroundDraw != null) {
                Rect rect = new Rect();
                Drawable drawable = this.foregroundDraw;
                if (drawable != null) {
                    drawable.getPadding(rect);
                }
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(drawable, "who");
        return super.verifyDrawable(drawable) || drawable == this.foregroundDraw;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.foregroundDraw;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.foregroundDraw;
        if (drawable != null) {
            if (!drawable.isStateful()) {
                drawable = null;
            }
            if (drawable != null) {
                drawable.setState(getDrawableState());
            }
        }
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.foregroundDraw;
        if (drawable2 != null) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            unscheduleDrawable(this.foregroundDraw);
        }
        this.foregroundDraw = drawable;
        updateForegroundColor();
        if (drawable != null) {
            setWillNotDraw(false);
            drawable.setCallback(this);
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
            if (this.foregroundDrawGravity == 119) {
                drawable.getPadding(new Rect());
            }
        }
        requestLayout();
        invalidate();
    }

    private final void updateForegroundColor() {
        if (Build.VERSION.SDK_INT >= 21) {
            RippleDrawable rippleDrawable = (RippleDrawable) this.foregroundDraw;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(ColorStateList.valueOf(this.foregroundColor));
                return;
            }
            return;
        }
        Drawable drawable = this.foregroundDraw;
        if (drawable != null) {
            drawable.setColorFilter(this.foregroundColor, PorterDuff.Mode.SRC_ATOP);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        Drawable drawable;
        super.drawableHotspotChanged(f, f2);
        if (Build.VERSION.SDK_INT >= 21 && (drawable = this.foregroundDraw) != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public final void setShadowMargin(int i, int i2, int i3, int i4) {
        setShadowMarginLeft(i);
        setShadowMarginTop(i2);
        setShadowMarginRight(i3);
        setShadowMarginBottom(i4);
        requestLayout();
        invalidate();
    }

    public final void setCornerRadius(float f, float f2, float f3, float f4) {
        this.cornerRadiusTL = f;
        this.cornerRadiusTR = f2;
        this.cornerRadiusBR = f3;
        this.cornerRadiusBL = f4;
        invalidate();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        return new LayoutParams(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkParameterIsNotNull(layoutParams, "p");
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkParameterIsNotNull(layoutParams, "lp");
        return new LayoutParams(layoutParams);
    }

    public CharSequence getAccessibilityClassName() {
        String name = FrameLayout.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "FrameLayout::class.java.name");
        return name;
    }

    public final int getPaddingLeftWithForeground() {
        return getPaddingLeft();
    }

    public final int getPaddingRightWithForeground() {
        return getPaddingRight();
    }

    private final int getPaddingTopWithForeground() {
        return getPaddingTop();
    }

    private final int getPaddingBottomWithForeground() {
        return getPaddingBottom();
    }

    @Metadata(mo51341bv = {1, 0, 2}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, mo51343d2 = {"Lcom/loopeer/shadow/ShadowView$LayoutParams;", "Landroid/view/ViewGroup$MarginLayoutParams;", "c", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "source", "Landroid/view/ViewGroup$LayoutParams;", "(Landroid/view/ViewGroup$LayoutParams;)V", "gravity", "", "getGravity", "()I", "setGravity", "(I)V", "Companion", "shadow_release"}, mo51344k = 1, mo51345mv = {1, 1, 7})
    /* compiled from: ShadowView.kt */
    public static final class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final int UNSPECIFIED_GRAVITY = -1;
        private int gravity = Companion.getUNSPECIFIED_GRAVITY();

        public final int getGravity() {
            return this.gravity;
        }

        public final void setGravity(int i) {
            this.gravity = i;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Intrinsics.checkParameterIsNotNull(context, "c");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2774R.styleable.ShadowView_Layout);
            this.gravity = obtainStyledAttributes.getInt(C2774R.styleable.ShadowView_Layout_layout_gravity, Companion.getUNSPECIFIED_GRAVITY());
            obtainStyledAttributes.recycle();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            Intrinsics.checkParameterIsNotNull(layoutParams, "source");
        }

        @Metadata(mo51341bv = {1, 0, 2}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo51343d2 = {"Lcom/loopeer/shadow/ShadowView$LayoutParams$Companion;", "", "()V", "UNSPECIFIED_GRAVITY", "", "getUNSPECIFIED_GRAVITY", "()I", "shadow_release"}, mo51344k = 1, mo51345mv = {1, 1, 7})
        /* compiled from: ShadowView.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int getUNSPECIFIED_GRAVITY() {
                return LayoutParams.UNSPECIFIED_GRAVITY;
            }
        }
    }
}
