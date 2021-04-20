package org.linphone;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class CallAudioFragment extends Fragment {
    private CallActivity incallActvityInstance;

    interface SwipeListener {
        void onLeftToRightSwipe();

        void onRightToLeftSwipe();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C5321R.layout.audio, viewGroup, false);
    }

    public void onStart() {
        super.onStart();
        this.incallActvityInstance = (CallActivity) getActivity();
        CallActivity callActivity = this.incallActvityInstance;
        if (callActivity != null) {
            callActivity.bindAudioFragment(this);
        }
        CallActivity callActivity2 = this.incallActvityInstance;
        if (callActivity2 != null) {
            callActivity2.removeCallbacks();
        }
    }

    class SwipeGestureDetector implements View.OnTouchListener {
        static final int MIN_DISTANCE = 100;
        private float downX;
        private SwipeListener listener;
        private boolean lock;
        private float upX;

        public SwipeGestureDetector(SwipeListener swipeListener) {
            this.listener = swipeListener;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 2 || this.lock) {
                    return false;
                }
                this.upX = motionEvent.getX();
                float f = this.downX - this.upX;
                if (Math.abs(f) > 100.0f) {
                    this.lock = true;
                    if (f < 0.0f) {
                        this.listener.onLeftToRightSwipe();
                        return true;
                    } else if (f > 0.0f) {
                        this.listener.onRightToLeftSwipe();
                        return true;
                    }
                }
                return false;
            }
            this.lock = false;
            this.downX = motionEvent.getX();
            return true;
        }
    }
}
