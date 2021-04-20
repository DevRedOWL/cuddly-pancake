package p033co.infinum.goldeneye.gesture.camera2;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.TextureView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.config.camera2.Camera2ConfigImpl;
import p033co.infinum.goldeneye.extensions.AnyKt;
import p033co.infinum.goldeneye.gesture.FocusHandler;
import p033co.infinum.goldeneye.models.FocusMode;
import p033co.infinum.goldeneye.sessions.SessionsManager;
import p033co.infinum.goldeneye.utils.CameraUtils;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo51343d2 = {"Lco/infinum/goldeneye/gesture/camera2/FocusHandlerImpl;", "Lco/infinum/goldeneye/gesture/FocusHandler;", "activity", "Landroid/app/Activity;", "textureView", "Landroid/view/TextureView;", "config", "Lco/infinum/goldeneye/config/camera2/Camera2ConfigImpl;", "sessionsManager", "Lco/infinum/goldeneye/sessions/SessionsManager;", "onFocusChanged", "Lkotlin/Function1;", "Landroid/graphics/Point;", "", "(Landroid/app/Activity;Landroid/view/TextureView;Lco/infinum/goldeneye/config/camera2/Camera2ConfigImpl;Lco/infinum/goldeneye/sessions/SessionsManager;Lkotlin/jvm/functions/Function1;)V", "requestFocus", "point", "Landroid/graphics/PointF;", "resetFocusWithDelay", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.gesture.camera2.FocusHandlerImpl */
/* compiled from: FocusHandlerImpl.kt */
public final class FocusHandlerImpl implements FocusHandler {
    private final Activity activity;
    /* access modifiers changed from: private */
    public final Camera2ConfigImpl config;
    private final Function1<Point, Unit> onFocusChanged;
    /* access modifiers changed from: private */
    public final SessionsManager sessionsManager;
    private final TextureView textureView;

    public FocusHandlerImpl(Activity activity2, TextureView textureView2, Camera2ConfigImpl camera2ConfigImpl, SessionsManager sessionsManager2, Function1<? super Point, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity2, "activity");
        Intrinsics.checkParameterIsNotNull(textureView2, "textureView");
        Intrinsics.checkParameterIsNotNull(camera2ConfigImpl, "config");
        Intrinsics.checkParameterIsNotNull(sessionsManager2, "sessionsManager");
        Intrinsics.checkParameterIsNotNull(function1, "onFocusChanged");
        this.activity = activity2;
        this.textureView = textureView2;
        this.config = camera2ConfigImpl;
        this.sessionsManager = sessionsManager2;
        this.onFocusChanged = function1;
    }

    public void requestFocus(PointF pointF) {
        Rect calculateCamera2FocusArea;
        Intrinsics.checkParameterIsNotNull(pointF, "point");
        if (this.config.getTapToFocusEnabled() && this.config.getSupportedFocusModes().contains(FocusMode.AUTO) && (calculateCamera2FocusArea = CameraUtils.INSTANCE.calculateCamera2FocusArea(this.activity, this.textureView, this.config, pointF.x, pointF.y)) != null) {
            this.sessionsManager.lockFocus(calculateCamera2FocusArea);
            this.onFocusChanged.invoke(new Point((int) pointF.x, (int) pointF.y));
            resetFocusWithDelay();
        }
    }

    private final void resetFocusWithDelay() {
        AnyKt.getMAIN_HANDLER().removeCallbacksAndMessages((Object) null);
        AnyKt.getMAIN_HANDLER().postDelayed(new FocusHandlerImpl$resetFocusWithDelay$1(this), this.config.getTapToFocusResetDelay());
    }
}
