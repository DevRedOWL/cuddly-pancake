package p033co.infinum.goldeneye.gesture;

import android.view.ScaleGestureDetector;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, mo51343d2 = {"co/infinum/goldeneye/gesture/GestureManager$pinchDetector$1", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "onScale", "", "detector", "Landroid/view/ScaleGestureDetector;", "onScaleEnd", "", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.gesture.GestureManager$pinchDetector$1 */
/* compiled from: GestureManager.kt */
public final class GestureManager$pinchDetector$1 extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    final /* synthetic */ GestureManager this$0;

    GestureManager$pinchDetector$1(GestureManager gestureManager) {
        this.this$0 = gestureManager;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.this$0.zoomHandler.onPinchEnded();
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.this$0.zoomHandler.onPinchStarted(scaleGestureDetector != null ? scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan() : 0.0f);
        return true;
    }
}
