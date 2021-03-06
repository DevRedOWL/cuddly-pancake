package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

public class BallRotateIndicator extends Indicator {
    float degress;
    private Matrix mMatrix = new Matrix();
    float scaleFloat = 0.5f;

    public void draw(Canvas canvas, Paint paint) {
        float width = (float) (getWidth() / 10);
        float width2 = (float) (getWidth() / 2);
        float height = (float) (getHeight() / 2);
        canvas.rotate(this.degress, (float) centerX(), (float) centerY());
        canvas.save();
        float f = 2.0f * width;
        canvas.translate((width2 - f) - width, height);
        float f2 = this.scaleFloat;
        canvas.scale(f2, f2);
        canvas.drawCircle(0.0f, 0.0f, width, paint);
        canvas.restore();
        canvas.save();
        canvas.translate(width2, height);
        float f3 = this.scaleFloat;
        canvas.scale(f3, f3);
        canvas.drawCircle(0.0f, 0.0f, width, paint);
        canvas.restore();
        canvas.save();
        canvas.translate(width2 + f + width, height);
        float f4 = this.scaleFloat;
        canvas.scale(f4, f4);
        canvas.drawCircle(0.0f, 0.0f, width, paint);
        canvas.restore();
    }

    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.5f, 1.0f, 0.5f});
        ofFloat.setDuration(1000);
        ofFloat.setRepeatCount(-1);
        addUpdateListener(ofFloat, new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BallRotateIndicator.this.scaleFloat = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BallRotateIndicator.this.postInvalidate();
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 180.0f, 360.0f});
        addUpdateListener(ofFloat2, new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BallRotateIndicator.this.degress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BallRotateIndicator.this.postInvalidate();
            }
        });
        ofFloat2.setDuration(1000);
        ofFloat2.setRepeatCount(-1);
        arrayList.add(ofFloat);
        arrayList.add(ofFloat2);
        return arrayList;
    }
}
