package com.beefe.picker.view;

import android.view.GestureDetector;
import android.view.MotionEvent;

final class LoopViewGestureListener extends GestureDetector.SimpleOnGestureListener {
    final LoopView loopView;

    LoopViewGestureListener(LoopView loopView2) {
        this.loopView = loopView2;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.loopView.scrollBy(f2);
        return true;
    }
}
