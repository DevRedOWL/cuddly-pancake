package p033co.infinum.goldeneye.extensions;

import android.hardware.Camera;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.utils.LogDelegate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u001b\u0010\u0003\u001a\u0017\u0012\b\u0012\u00060\u0005R\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006H\u0000¨\u0006\u0007"}, mo51343d2 = {"updateParams", "", "Landroid/hardware/Camera;", "update", "Lkotlin/Function1;", "Landroid/hardware/Camera$Parameters;", "Lkotlin/ExtensionFunctionType;", "goldeneye_release"}, mo51344k = 2, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.extensions.CameraKt */
/* compiled from: Camera.kt */
public final class CameraKt {
    public static final void updateParams(Camera camera, Function1<? super Camera.Parameters, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(camera, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "update");
        try {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters != null) {
                function1.invoke(parameters);
            } else {
                parameters = null;
            }
            camera.setParameters(parameters);
        } catch (Throwable th) {
            LogDelegate.INSTANCE.log("Failed to update Camera properties.", th);
        }
    }
}
