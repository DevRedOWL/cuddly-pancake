package org.linphone.compatibility;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

public class CompatibilityScaleGestureDetector extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    private ScaleGestureDetector detector;
    private CompatibilityScaleGestureListener listener;

    public CompatibilityScaleGestureDetector(Context context) {
        this.detector = new ScaleGestureDetector(context, this);
    }

    public void setOnScaleListener(CompatibilityScaleGestureListener compatibilityScaleGestureListener) {
        this.listener = compatibilityScaleGestureListener;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.detector.onTouchEvent(motionEvent);
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        CompatibilityScaleGestureListener compatibilityScaleGestureListener = this.listener;
        if (compatibilityScaleGestureListener == null) {
            return false;
        }
        return compatibilityScaleGestureListener.onScale(this);
    }

    public float getScaleFactor() {
        return this.detector.getScaleFactor();
    }

    public void destroy() {
        this.listener = null;
        this.detector = null;
    }
}
