package org.linphone.p054ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: org.linphone.ui.LinphoneSliders */
public class LinphoneSliders extends View implements GestureDetector.OnGestureListener {
    private static final double mCoeff = 0.5d;
    private Drawable leftSliderImg;
    private int leftSliderX = 0;
    private GestureDetector mGestures = new GestureDetector(getContext(), this);
    private LinphoneSliderTriggered mTriggerListener;
    private Drawable rightSliderImg;
    private int rightSliderX = 0;
    private int slidersHeight = this.leftSliderImg.getIntrinsicHeight();
    private int slidersWidth = this.leftSliderImg.getIntrinsicWidth();
    private boolean slidingLeftHandle = false;
    private boolean slidingRightHandle = false;

    /* renamed from: org.linphone.ui.LinphoneSliders$LinphoneSliderTriggered */
    public interface LinphoneSliderTriggered {
        void onLeftHandleTriggered();

        void onRightHandleTriggered();
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public LinphoneSliders(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.rightSliderImg.setBounds((getWidth() - this.slidersWidth) - this.rightSliderX, getHeight() - this.slidersHeight, getWidth(), getHeight());
        this.rightSliderImg.draw(canvas);
        this.leftSliderImg.setBounds(0, getHeight() - this.slidersHeight, this.slidersWidth + this.leftSliderX, getHeight());
        this.leftSliderImg.draw(canvas);
        if (this.slidingLeftHandle && ((double) Math.abs(this.leftSliderX)) >= ((double) getWidth()) * 0.5d) {
            this.mTriggerListener.onLeftHandleTriggered();
        } else if (this.slidingRightHandle && ((double) this.rightSliderX) >= ((double) getWidth()) * 0.5d) {
            this.mTriggerListener.onRightHandleTriggered();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.leftSliderX = 0;
            this.rightSliderX = 0;
            this.slidingRightHandle = false;
            this.slidingLeftHandle = false;
            invalidate();
        }
        return this.mGestures.onTouchEvent(motionEvent);
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent.getY() < ((float) (getHeight() - this.slidersHeight))) {
            return false;
        }
        if (motionEvent.getX() < ((float) (getWidth() / 2))) {
            this.leftSliderX = (int) (((float) this.leftSliderX) - f);
            this.slidingLeftHandle = true;
        } else {
            this.rightSliderX = (int) (((float) this.rightSliderX) + f);
            this.slidingRightHandle = true;
        }
        invalidate();
        return true;
    }

    public void setOnTriggerListener(LinphoneSliderTriggered linphoneSliderTriggered) {
        this.mTriggerListener = linphoneSliderTriggered;
    }
}
