package p033co.infinum.goldeneye;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.config.CameraConfig;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, mo51343d2 = {"co/infinum/goldeneye/BaseGoldenEye$open$1", "Lco/infinum/goldeneye/InitCallback;", "onActive", "", "onError", "t", "", "onReady", "config", "Lco/infinum/goldeneye/config/CameraConfig;", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.BaseGoldenEye$open$1 */
/* compiled from: BaseGoldenEye.kt */
public final class BaseGoldenEye$open$1 extends InitCallback {
    final /* synthetic */ Function0 $onActive;
    final /* synthetic */ Function1 $onError;
    final /* synthetic */ Function1 $onReady;

    BaseGoldenEye$open$1(Function1 function1, Function0 function0, Function1 function12) {
        this.$onReady = function1;
        this.$onActive = function0;
        this.$onError = function12;
    }

    public void onReady(CameraConfig cameraConfig) {
        Intrinsics.checkParameterIsNotNull(cameraConfig, "config");
        Function1 function1 = this.$onReady;
        if (function1 != null) {
            Unit unit = (Unit) function1.invoke(cameraConfig);
        }
    }

    public void onActive() {
        Function0 function0 = this.$onActive;
        if (function0 != null) {
            Unit unit = (Unit) function0.invoke();
        }
    }

    public void onError(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "t");
        this.$onError.invoke(th);
    }
}
