package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;
import org.jetbrains.anko.DimensionsKt;

public class BallSpinFadeLoaderIndicator extends Indicator {
    public static final int ALPHA = 255;
    public static final float SCALE = 1.0f;
    int[] alphas = {255, 255, 255, 255, 255, 255, 255, 255};
    float[] scaleFloats = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    public void draw(Canvas canvas, Paint paint) {
        float width = (float) (getWidth() / 10);
        for (int i = 0; i < 8; i++) {
            canvas.save();
            Point circleAt = circleAt(getWidth(), getHeight(), ((float) (getWidth() / 2)) - width, 0.7853981633974483d * ((double) i));
            canvas.translate(circleAt.f2337x, circleAt.f2338y);
            float[] fArr = this.scaleFloats;
            canvas.scale(fArr[i], fArr[i]);
            paint.setAlpha(this.alphas[i]);
            canvas.drawCircle(0.0f, 0.0f, width, paint);
            canvas.restore();
        }
    }

    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        int[] iArr = {0, 120, DimensionsKt.HDPI, 360, DimensionsKt.XXHDPI, 600, 720, 780, 840};
        for (final int i = 0; i < 8; i++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.4f, 1.0f});
            ofFloat.setDuration(1000);
            ofFloat.setRepeatCount(-1);
            ofFloat.setStartDelay((long) iArr[i]);
            addUpdateListener(ofFloat, new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallSpinFadeLoaderIndicator.this.scaleFloats[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BallSpinFadeLoaderIndicator.this.postInvalidate();
                }
            });
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{255, 77, 255});
            ofInt.setDuration(1000);
            ofInt.setRepeatCount(-1);
            ofInt.setStartDelay((long) iArr[i]);
            addUpdateListener(ofInt, new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallSpinFadeLoaderIndicator.this.alphas[i] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    BallSpinFadeLoaderIndicator.this.postInvalidate();
                }
            });
            arrayList.add(ofFloat);
            arrayList.add(ofInt);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public Point circleAt(int i, int i2, float f, double d) {
        double d2 = (double) f;
        return new Point((float) (((double) (i / 2)) + (Math.cos(d) * d2)), (float) (((double) (i2 / 2)) + (d2 * Math.sin(d))));
    }

    final class Point {

        /* renamed from: x */
        public float f2337x;

        /* renamed from: y */
        public float f2338y;

        public Point(float f, float f2) {
            this.f2337x = f;
            this.f2338y = f2;
        }
    }
}
