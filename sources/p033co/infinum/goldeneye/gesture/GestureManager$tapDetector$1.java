package p033co.infinum.goldeneye.gesture;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, mo51343d2 = {"co/infinum/goldeneye/gesture/GestureManager$tapDetector$1", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "onDown", "", "e", "Landroid/view/MotionEvent;", "onSingleTapUp", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.gesture.GestureManager$tapDetector$1 */
/* compiled from: GestureManager.kt */
public final class GestureManager$tapDetector$1 extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ GestureManager this$0;

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    GestureManager$tapDetector$1(GestureManager gestureManager) {
        this.this$0 = gestureManager;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.this$0.focusHandler.requestFocus(new PointF(motionEvent.getX(), motionEvent.getY()));
        return true;
    }
}
