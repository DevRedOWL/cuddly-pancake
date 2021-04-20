package p033co.infinum.goldeneye.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.InitCallback;
import p033co.infinum.goldeneye.config.CameraInfo;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, mo51343d2 = {"Lco/infinum/goldeneye/models/CameraRequest;", "", "cameraInfo", "Lco/infinum/goldeneye/config/CameraInfo;", "callback", "Lco/infinum/goldeneye/InitCallback;", "(Lco/infinum/goldeneye/config/CameraInfo;Lco/infinum/goldeneye/InitCallback;)V", "getCallback", "()Lco/infinum/goldeneye/InitCallback;", "getCameraInfo", "()Lco/infinum/goldeneye/config/CameraInfo;", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.models.CameraRequest */
/* compiled from: CameraRequest.kt */
public final class CameraRequest {
    private final InitCallback callback;
    private final CameraInfo cameraInfo;

    public CameraRequest(CameraInfo cameraInfo2, InitCallback initCallback) {
        Intrinsics.checkParameterIsNotNull(cameraInfo2, "cameraInfo");
        Intrinsics.checkParameterIsNotNull(initCallback, "callback");
        this.cameraInfo = cameraInfo2;
        this.callback = initCallback;
    }

    public final CameraInfo getCameraInfo() {
        return this.cameraInfo;
    }

    public final InitCallback getCallback() {
        return this.callback;
    }
}
