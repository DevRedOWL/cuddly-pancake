package p033co.infinum.goldeneye.gesture;

import android.app.Activity;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.extensions.AnyKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo51343d2 = {"Lco/infinum/goldeneye/gesture/GestureManager;", "", "activity", "Landroid/app/Activity;", "textureView", "Landroid/view/TextureView;", "zoomHandler", "Lco/infinum/goldeneye/gesture/ZoomHandler;", "focusHandler", "Lco/infinum/goldeneye/gesture/FocusHandler;", "(Landroid/app/Activity;Landroid/view/TextureView;Lco/infinum/goldeneye/gesture/ZoomHandler;Lco/infinum/goldeneye/gesture/FocusHandler;)V", "pinchDetector", "Landroid/view/ScaleGestureDetector;", "tapDetector", "Landroid/view/GestureDetector;", "release", "", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.gesture.GestureManager */
/* compiled from: GestureManager.kt */
public final class GestureManager {
    /* access modifiers changed from: private */
    public final FocusHandler focusHandler;
    /* access modifiers changed from: private */
    public final ScaleGestureDetector pinchDetector;
    /* access modifiers changed from: private */
    public final GestureDetector tapDetector;
    /* access modifiers changed from: private */
    public final ZoomHandler zoomHandler;

    public GestureManager(Activity activity, TextureView textureView, ZoomHandler zoomHandler2, FocusHandler focusHandler2) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(textureView, "textureView");
        Intrinsics.checkParameterIsNotNull(zoomHandler2, "zoomHandler");
        Intrinsics.checkParameterIsNotNull(focusHandler2, "focusHandler");
        this.zoomHandler = zoomHandler2;
        this.focusHandler = focusHandler2;
        Context context = activity;
        this.pinchDetector = new ScaleGestureDetector(context, new GestureManager$pinchDetector$1(this));
        this.tapDetector = new GestureDetector(context, new GestureManager$tapDetector$1(this));
        textureView.setOnTouchListener(new View.OnTouchListener(this) {
            final /* synthetic */ GestureManager this$0;

            {
                this.this$0 = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.this$0.tapDetector.onTouchEvent(motionEvent);
                this.this$0.pinchDetector.onTouchEvent(motionEvent);
                return true;
            }
        });
    }

    public final void release() {
        AnyKt.getMAIN_HANDLER().removeCallbacksAndMessages((Object) null);
    }
}
