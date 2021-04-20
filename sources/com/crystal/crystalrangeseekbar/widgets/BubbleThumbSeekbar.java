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
import com.crystal.crystalrangeseekbar.widgets.CrystalSeekbar;
import com.example.crystalrangeseekbar.C1204R;
import com.facebook.react.uimanager.ViewProps;

public class BubbleThumbSeekbar extends CrystalSeekbar {
    /* access modifiers changed from: private */
    public boolean animate;
    /* access modifiers changed from: private */
    public boolean isPressedLeftThumb;
    /* access modifiers changed from: private */
    public BubbleRect thumbPressedRect;

    public BubbleThumbSeekbar(Context context) {
        super(context);
    }

    public BubbleThumbSeekbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BubbleThumbSeekbar(Context context, AttributeSet attributeSet, int i) {
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
        if (CrystalSeekbar.Thumb.MIN.equals(getPressedThumb())) {
            this.isPressedLeftThumb = true;
            startAnimationUp();
        }
    }

    /* access modifiers changed from: protected */
    public void touchUp(float f, float f2) {
        super.touchUp(f, f2);
        this.animate = true;
        if (CrystalSeekbar.Thumb.MIN.equals(getPressedThumb())) {
            startAnimationDown();
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
    public float getBubbleWith() {
        return getResources().getDimension(C1204R.dimen.bubble_thumb_width);
    }

    /* access modifiers changed from: protected */
    public float getBubbleHeight() {
        return getResources().getDimension(C1204R.dimen.bubble_thumb_height);
    }

    /* access modifiers changed from: protected */
    public void startAnimationUp() {
        BubbleRect bubbleRect = new BubbleRect();
        RectF leftThumbRect = getLeftThumbRect();
        bubbleRect.left = leftThumbRect.left - ((getBubbleWith() / 2.0f) - (getThumbWidth() / 2.0f));
        bubbleRect.right = bubbleRect.left + getBubbleWith();
        bubbleRect.top = leftThumbRect.top - ((getBubbleHeight() / 2.0f) - (getThumbHeight() / 2.0f));
        bubbleRect.bottom = leftThumbRect.bottom + ((getBubbleHeight() / 2.0f) - (getThumbHeight() / 2.0f));
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(ViewProps.LEFT, new float[]{leftThumbRect.left, bubbleRect.left}), PropertyValuesHolder.ofFloat(ViewProps.RIGHT, new float[]{leftThumbRect.right, bubbleRect.right}), PropertyValuesHolder.ofFloat(ViewProps.TOP, new float[]{leftThumbRect.top, bubbleRect.top}), PropertyValuesHolder.ofFloat(ViewProps.BOTTOM, new float[]{leftThumbRect.bottom, bubbleRect.bottom}), PropertyValuesHolder.ofFloat("width", new float[]{getThumbWidth(), getBubbleWith()}), PropertyValuesHolder.ofFloat("height", new float[]{getThumbHeight(), getBubbleHeight()})});
        ofPropertyValuesHolder.setDuration(200);
        ofPropertyValuesHolder.setInterpolator(new OvershootInterpolator(5.0f));
        ofPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BubbleThumbSeekbar.this.thumbPressedRect.left = ((Float) valueAnimator.getAnimatedValue(ViewProps.LEFT)).floatValue();
                BubbleThumbSeekbar.this.thumbPressedRect.right = ((Float) valueAnimator.getAnimatedValue(ViewProps.RIGHT)).floatValue();
                BubbleThumbSeekbar.this.thumbPressedRect.top = ((Float) valueAnimator.getAnimatedValue(ViewProps.TOP)).floatValue();
                BubbleThumbSeekbar.this.thumbPressedRect.bottom = ((Float) valueAnimator.getAnimatedValue(ViewProps.BOTTOM)).floatValue();
                BubbleThumbSeekbar.this.thumbPressedRect.imageWith = ((Float) valueAnimator.getAnimatedValue("width")).floatValue();
                BubbleThumbSeekbar.this.thumbPressedRect.imageHeight = ((Float) valueAnimator.getAnimatedValue("height")).floatValue();
                BubbleThumbSeekbar.this.invalidate();
            }
        });
        ofPropertyValuesHolder.start();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                boolean unused = BubbleThumbSeekbar.this.animate = false;
            }
        }, 200);
    }

    /* access modifiers changed from: protected */
    public void startAnimationDown() {
        RectF rectF = new RectF();
        RectF leftThumbRect = getLeftThumbRect();
        rectF.left = leftThumbRect.left + ((getBubbleWith() / 2.0f) - (getThumbWidth() / 2.0f));
        rectF.right = rectF.left + getThumbWidth();
        rectF.top = 0.0f;
        rectF.bottom = getThumbHeight();
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(ViewProps.LEFT, new float[]{leftThumbRect.left, rectF.left}), PropertyValuesHolder.ofFloat(ViewProps.RIGHT, new float[]{leftThumbRect.right, rectF.right}), PropertyValuesHolder.ofFloat(ViewProps.TOP, new float[]{leftThumbRect.top, rectF.top}), PropertyValuesHolder.ofFloat(ViewProps.BOTTOM, new float[]{leftThumbRect.bottom, rectF.bottom}), PropertyValuesHolder.ofFloat("width", new float[]{getBubbleWith(), getThumbWidth()}), PropertyValuesHolder.ofFloat("height", new float[]{getBubbleHeight(), getThumbHeight()})});
        ofPropertyValuesHolder.setDuration(300);
        ofPropertyValuesHolder.setInterpolator(new OvershootInterpolator(3.0f));
        ofPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BubbleThumbSeekbar.this.thumbPressedRect.left = ((Float) valueAnimator.getAnimatedValue(ViewProps.LEFT)).floatValue();
                BubbleThumbSeekbar.this.thumbPressedRect.right = ((Float) valueAnimator.getAnimatedValue(ViewProps.RIGHT)).floatValue();
                BubbleThumbSeekbar.this.thumbPressedRect.top = ((Float) valueAnimator.getAnimatedValue(ViewProps.TOP)).floatValue();
                BubbleThumbSeekbar.this.thumbPressedRect.bottom = ((Float) valueAnimator.getAnimatedValue(ViewProps.BOTTOM)).floatValue();
                BubbleThumbSeekbar.this.thumbPressedRect.imageWith = ((Float) valueAnimator.getAnimatedValue("width")).floatValue();
                BubbleThumbSeekbar.this.thumbPressedRect.imageHeight = ((Float) valueAnimator.getAnimatedValue("height")).floatValue();
                BubbleThumbSeekbar.this.invalidate();
            }
        });
        ofPropertyValuesHolder.start();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                boolean unused = BubbleThumbSeekbar.this.animate = false;
                boolean unused2 = BubbleThumbSeekbar.this.isPressedLeftThumb = false;
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
