package p033co.infinum.goldeneye;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.config.CameraConfig;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, mo51343d2 = {"Lco/infinum/goldeneye/InitCallback;", "", "()V", "onActive", "", "onError", "t", "", "onReady", "config", "Lco/infinum/goldeneye/config/CameraConfig;", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.InitCallback */
/* compiled from: Callbacks.kt */
public abstract class InitCallback {
    public void onActive() {
    }

    public abstract void onError(Throwable th);

    public void onReady(CameraConfig cameraConfig) {
        Intrinsics.checkParameterIsNotNull(cameraConfig, "config");
    }
}
