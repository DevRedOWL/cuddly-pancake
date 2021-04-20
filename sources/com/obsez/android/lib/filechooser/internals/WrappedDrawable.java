package com.obsez.android.lib.filechooser.internals;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

public class WrappedDrawable extends Drawable {
    private final Drawable _drawable;

    /* access modifiers changed from: protected */
    public Drawable getDrawable() {
        return this._drawable;
    }

    public WrappedDrawable(Drawable drawable) {
        this._drawable = drawable;
    }

    public WrappedDrawable(Drawable drawable, float f, float f2) {
        this._drawable = drawable;
        setBounds(0, 0, (int) UiUtil.dip2px(f), (int) UiUtil.dip2px(f2));
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setBounds(i, i2, i3, i4);
        }
    }

    public void setBoundsInDp(float f, float f2, float f3, float f4) {
        super.setBounds((int) UiUtil.dip2px(f), (int) UiUtil.dip2px(f2), (int) UiUtil.dip2px(f3), (int) UiUtil.dip2px(f4));
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setBounds((int) UiUtil.dip2px(f), (int) UiUtil.dip2px(f2), (int) UiUtil.dip2px(f3), (int) UiUtil.dip2px(f4));
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public int getOpacity() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return 0;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public int getIntrinsicWidth() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            return drawable.getBounds().width();
        }
        return 0;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            return drawable.getBounds().height();
        }
        return 0;
    }
}
