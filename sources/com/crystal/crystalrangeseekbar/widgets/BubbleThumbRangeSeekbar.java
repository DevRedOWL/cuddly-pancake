package com.crystal.crystalrangeseekbar.widgets;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.animation.OvershootInterpolator;
import com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar;
import com.example.crystalrangeseekbar.C1204R;
import com.facebook.react.uimanager.ViewProps;

public class BubbleThumbRangeSeekbar extends CrystalRangeSeekbar {
    /* access modifiers changed from: private */
    public boolean animate;
    /* access modifiers changed from: private */
    public boolean isPressedLeftThumb;
    /* access modifiers changed from: private */
    public boolean isPressedRightThumb;
    /* access modifiers changed from: private */
    public BubbleRect thumbPressedRect;

    public BubbleThumbRangeSeekbar(Context context) {
        super(context);
    }

    public BubbleThumbRangeSeekbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BubbleThumbRangeSeekbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void init() {
        this.thumbPressedRect = new BubbleRect();
        super.init();
    }

    /* access modifiers changed from: protected */
    public void touchDown(float f, float f2) {
        super.touchDown(f, f2);
        this.animate = true;
        if (CrystalRangeSeekbar.Thumb.MIN.equals(getPressedThumb())) {
            this.isPressedLeftThumb = true;
            startAnimationUp(CrystalRangeSeekbar.Thumb.MIN);
        } else if (CrystalRangeSeekbar.Thumb.MAX.equals(getPressedThumb())) {
            this.isPressedRightThumb = true;
            startAnimationUp(CrystalRangeSeekbar.Thumb.MAX);
        }
    }

    /* access modifiers changed from: protected */
    public void touchUp(float f, float f2) {
        super.touchUp(f, f2);
        this.animate = true;
        if (CrystalRangeSeekbar.Thumb.MIN.equals(getPressedThumb())) {
            startAnimationDown(CrystalRangeSeekbar.Thumb.MIN);
        } else {
            startAnimationDown(CrystalRangeSeekbar.Thumb.MAX);
        }
    }

    /* access modifiers changed from: protected */
    public void drawLeftThumbWithColor(Canvas canvas, Paint paint, RectF rectF) {
        if (this.isPressedLeftThumb) {
            if (!this.animate) {
                rectF.left -= (getBubbleWith() / 2.0f) - (getThumbWidth() / 2.0f);
                rectF.right = rectF.left + getBubbleWith();
                rectF.top = getLeftThumbRect().top - ((getBubbleHeight() / 2.0f) - (getThumbHeight() / 2.0f));
                rectF.bottom = getLeftThumbRect().bottom + ((getBubbleHeight() / 2.0f) - (getThumbHeight() / 2.0f));
            } else {
                rectF.left = this.thumbPressedRect.left;
                rectF.right = this.thumbPressedRect.right;
                rectF.top = this.thumbPressedRect.top;
                rectF.bottom = this.thumbPressedRect.bottom;
            }
            canvas.drawOval(rectF, paint);
            return;
        }
        canvas.drawOval(rectF, paint);
    }

    /* access modifiers changed from: protected */
    public void drawRightThumbWithColor(Canvas canvas, Paint paint, RectF rectF) {
        if (this.isPressedRightThumb) {
            if (!this.animate) {
                rectF.left -= (getBubbleWith() / 2.0f) - (getThumbWidth() / 2.0f);
                rectF.right = rectF.left + getBubbleWith();
                rectF.top = getRightThumbRect().top - ((getBubbleHeight() / 2.0f) - (getThumbHeight() / 2.0f));
                rectF.bottom = getRightThumbRect().bottom + ((getBubbleHeight() / 2.0f) - (getThumbHeight() / 2.0f));
            } else {
                rectF.left = this.thumbPressedRect.left;
                rectF.right = this.thumbPressedRect.right;
                rectF.top = this.thumbPressedRect.top;
                rectF.bottom = this.thumbPressedRect.bottom;
            }
            canvas.drawOval(rectF, paint);
            return;
        }
        canvas.drawOval(rectF, paint);
    }

    /* access modifiers changed from: protected */
    public void drawLeftThumbWithImage(Canvas canvas, Paint paint, RectF rectF, Bitmap bitmap) {
        Bitmap bitmap2;
        if (this.isPressedLeftThumb) {
            if (!this.animate) {
                bitmap2 = resizeImage((int) getBubbleWith(), (int) getBubbleHeight(), bitmap);
                rectF.top = getLeftThumbRect().top - ((getBubbleHeight() / 2.0f) - (getThumbHeight() / 2.0f));
                rectF.left -= (getBubbleWith() / 2.0f) - (getThumbWidth() / 2.0f);
            } else {
                bitmap2 = resizeImage((int) this.thumbPressedRect.imageWith, (int) this.thumbPressedRect.imageHeight, bitmap);
                rectF.top = this.thumbPressedRect.top;
                rectF.left = this.thumbPressedRect.left;
            }
            canvas.drawBitmap(bitmap2, rectF.left, rectF.top, paint);
            return;
        }
        canvas.drawBitmap(bitmap, rectF.left, rectF.top, paint);
    }

    /* access modifiers changed from: protected */
    public void drawRightThumbWithImage(Canvas canvas, Paint paint, RectF rectF, Bitmap bitmap) {
        Bitmap bitmap2;
        if (this.isPressedRightThumb) {
            if (!this.animate) {
                bitmap2 = resizeImage((int) getBubbleWith(), (int) getBubbleHeight(), bitmap);
                rectF.top = getRightThumbRect().top - ((getBubbleHeight() / 2.0f) - (getThumbHeight() / 2.0f));
                rectF.left -= (getBubbleWith() / 2.0f) - (getThumbWidth() / 2.0f);
            } else {
                bitmap2 = resizeImage((int) this.thumbPressedRect.imageWith, (int) this.thumbPressedRect.imageHeight, bitmap);
                rectF.top = this.thumbPressedRect.top;
                rectF.left = this.thumbPressedRect.left;
            }
            canvas.drawBitmap(bitmap2, rectF.left, rectF.top, paint);
            return;
        }
        canvas.drawBitmap(bitmap, rectF.left, rectF.top, paint);
    }

    /* access modifiers changed from: protected */
    public float getBubbleWith() {
        return getResources().getDimension(C1204R.dimen.bubble_thumb_width);
    }

    /* access modifiers changed from: protected */
    public float getBubbleHeight() {
        return getResources().getDimension(C1204R.dimen.bubble_thumb_height);
    }

    /* access modifiers changed from: protected */
    public void startAnimationUp(CrystalRangeSeekbar.Thumb thumb) {
        RectF rectF;
        BubbleRect bubbleRect = new BubbleRect();
        if (CrystalRangeSeekbar.Thumb.MIN.equals(thumb)) {
            rectF = getLeftThumbRect();
        } else {
            rectF = getRightThumbRect();
        }
        bubbleRect.left = rectF.left - ((getBubbleWith() / 2.0f) - (getThumbWidth() / 2.0f));
        bubbleRect.right = bubbleRect.left + getBubbleWith();
        bubbleRect.top = rectF.top - ((getBubbleHeight() / 2.0f) - (getThumbHeight() / 2.0f));
        bubbleRect.bottom = rectF.bottom + ((getBubbleHeight() / 2.0f) - (getThumbHeight() / 2.0f));
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(ViewProps.LEFT, new float[]{rectF.left, bubbleRect.left}), PropertyValuesHolder.ofFloat(ViewProps.RIGHT, new float[]{rectF.right, bubbleRect.right}), PropertyValuesHolder.ofFloat(ViewProps.TOP, new float[]{rectF.top, bubbleRect.top}), PropertyValuesHolder.ofFloat(ViewProps.BOTTOM, new float[]{rectF.bottom, bubbleRect.bottom}), PropertyValuesHolder.ofFloat("width", new float[]{getThumbWidth(), getBubbleWith()}), PropertyValuesHolder.ofFloat("height", new float[]{getThumbHeight(), getBubbleHeight()})});
        ofPropertyValuesHolder.setDuration(200);
        ofPropertyValuesHolder.setInterpolator(new OvershootInterpolator(5.0f));
        ofPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BubbleThumbRangeSeekbar.this.thumbPressedRect.left = ((Float) valueAnimator.getAnimatedValue(ViewProps.LEFT)).floatValue();
                BubbleThumbRangeSeekbar.this.thumbPressedRect.right = ((Float) valueAnimator.getAnimatedValue(ViewProps.RIGHT)).floatValue();
                BubbleThumbRangeSeekbar.this.thumbPressedRect.top = ((Float) valueAnimator.getAnimatedValue(ViewProps.TOP)).floatValue();
                BubbleThumbRangeSeekbar.this.thumbPressedRect.bottom = ((Float) valueAnimator.getAnimatedValue(ViewProps.BOTTOM)).floatValue();
                BubbleThumbRangeSeekbar.this.thumbPressedRect.imageWith = ((Float) valueAnimator.getAnimatedValue("width")).floatValue();
                BubbleThumbRangeSeekbar.this.thumbPressedRect.imageHeight = ((Float) valueAnimator.getAnimatedValue("height")).floatValue();
                BubbleThumbRangeSeekbar.this.invalidate();
            }
        });
        ofPropertyValuesHolder.start();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                boolean unused = BubbleThumbRangeSeekbar.this.animate = false;
            }
        }, 200);
    }

    /* access modifiers changed from: protected */
    public void startAnimationDown(CrystalRangeSeekbar.Thumb thumb) {
        RectF rectF;
        RectF rectF2 = new RectF();
        if (CrystalRangeSeekbar.Thumb.MIN.equals(thumb)) {
            rectF = getLeftThumbRect();
        } else {
            rectF = getRightThumbRect();
        }
        rectF2.left = rectF.left + ((getBubbleWith() / 2.0f) - (getThumbWidth() / 2.0f));
        rectF2.right = rectF2.left + getThumbWidth();
        rectF2.top = 0.0f;
        rectF2.bottom = getThumbHeight();
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(ViewProps.LEFT, new float[]{rectF.left, rectF2.left}), PropertyValuesHolder.ofFloat(ViewProps.RIGHT, new float[]{rectF.right, rectF2.right}), PropertyValuesHolder.ofFloat(ViewProps.TOP, new float[]{rectF.top, rectF2.top}), PropertyValuesHolder.ofFloat(ViewProps.BOTTOM, new float[]{rectF.bottom, rectF2.bottom}), PropertyValuesHolder.ofFloat("width", new float[]{getBubbleWith(), getThumbWidth()}), PropertyValuesHolder.ofFloat("height", new float[]{getBubbleHeight(), getThumbHeight()})});
        ofPropertyValuesHolder.setDuration(300);
        ofPropertyValuesHolder.setInterpolator(new OvershootInterpolator(3.0f));
        ofPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BubbleThumbRangeSeekbar.this.thumbPressedRect.left = ((Float) valueAnimator.getAnimatedValue(ViewProps.LEFT)).floatValue();
                BubbleThumbRangeSeekbar.this.thumbPressedRect.right = ((Float) valueAnimator.getAnimatedValue(ViewProps.RIGHT)).floatValue();
                BubbleThumbRangeSeekbar.this.thumbPressedRect.top = ((Float) valueAnimator.getAnimatedValue(ViewProps.TOP)).floatValue();
                BubbleThumbRangeSeekbar.this.thumbPressedRect.bottom = ((Float) valueAnimator.getAnimatedValue(ViewProps.BOTTOM)).floatValue();
                BubbleThumbRangeSeekbar.this.thumbPressedRect.imageWith = ((Float) valueAnimator.getAnimatedValue("width")).floatValue();
                BubbleThumbRangeSeekbar.this.thumbPressedRect.imageHeight = ((Float) valueAnimator.getAnimatedValue("height")).floatValue();
                BubbleThumbRangeSeekbar.this.invalidate();
            }
        });
        ofPropertyValuesHolder.start();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                boolean unused = BubbleThumbRangeSeekbar.this.animate = false;
                boolean unused2 = BubbleThumbRangeSeekbar.this.isPressedLeftThumb = false;
                boolean unused3 = BubbleThumbRangeSeekbar.this.isPressedRightThumb = false;
            }
        }, 300);
    }

    private Bitmap resizeImage(int i, int i2, Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) i) / ((float) width), ((float) i2) / ((float) height));
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    private class BubbleRect {
        public float bottom;
        public float imageHeight;
        public float imageWith;
        public float left;
        public float right;
        public float top;

        private BubbleRect() {
        }
    }
}
