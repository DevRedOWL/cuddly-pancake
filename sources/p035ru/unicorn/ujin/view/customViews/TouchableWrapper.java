package p035ru.unicorn.ujin.view.customViews;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMap;

/* renamed from: ru.unicorn.ujin.view.customViews.TouchableWrapper */
public class TouchableWrapper extends FrameLayout {
    private GoogleMap mGoogleMap;
    private LockableScrollView mLockableScroll;

    public TouchableWrapper(Context context) {
        super(context);
    }

    public void setGoogleMapAndScroll(GoogleMap googleMap, LockableScrollView lockableScrollView) {
        this.mGoogleMap = googleMap;
        this.mLockableScroll = lockableScrollView;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mGoogleMap.getUiSettings().setScrollGesturesEnabled(false);
            this.mGoogleMap.getUiSettings().setZoomGesturesEnabled(false);
            this.mLockableScroll.setScrollingEnabled(true);
        } else if (action == 1) {
            this.mGoogleMap.getUiSettings().setZoomGesturesEnabled(false);
            this.mGoogleMap.getUiSettings().setScrollGesturesEnabled(false);
            this.mLockableScroll.setScrollingEnabled(true);
        } else if (action == 5) {
            this.mLockableScroll.setScrollingEnabled(false);
            this.mGoogleMap.getUiSettings().setScrollGesturesEnabled(true);
            this.mGoogleMap.getUiSettings().setZoomGesturesEnabled(true);
        } else if (action == 6) {
            this.mGoogleMap.getUiSettings().setZoomGesturesEnabled(false);
            this.mGoogleMap.getUiSettings().setScrollGesturesEnabled(false);
            this.mLockableScroll.setScrollingEnabled(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
