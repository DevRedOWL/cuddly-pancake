package devs.mulham.horizontalcalendar;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

public class HorizontalLayoutManager extends LinearLayoutManager {
    public static final float SPEED_NORMAL = 90.0f;
    public static final float SPEED_SLOW = 125.0f;
    float smoothScrollSpeed = 90.0f;

    HorizontalLayoutManager(Context context, boolean z) {
        super(context, 0, z);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        C44881 r2 = new LinearSmoothScroller(recyclerView.getContext()) {
            /* access modifiers changed from: protected */
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return HorizontalLayoutManager.this.smoothScrollSpeed / ((float) displayMetrics.densityDpi);
            }
        };
        r2.setTargetPosition(i);
        startSmoothScroll(r2);
    }

    /* access modifiers changed from: package-private */
    public float getSmoothScrollSpeed() {
        return this.smoothScrollSpeed;
    }

    /* access modifiers changed from: package-private */
    public void setSmoothScrollSpeed(float f) {
        this.smoothScrollSpeed = f;
    }
}
