package p033co.infinum.goldeneye;

import android.hardware.camera2.CameraDevice;
import android.view.TextureView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.config.CameraInfo;
import p033co.infinum.goldeneye.extensions.AnyKt;
import p033co.infinum.goldeneye.models.Camera2Error;
import p033co.infinum.goldeneye.models.CameraRequest;
import p033co.infinum.goldeneye.models.CameraState;
import p033co.infinum.goldeneye.utils.LogDelegate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u000e\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, mo51343d2 = {"co/infinum/goldeneye/GoldenEye2Impl$openCamera$1", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "onDisconnected", "", "camera", "Landroid/hardware/camera2/CameraDevice;", "onError", "error", "", "onOpened", "openLastRequestedCamera", "request", "Lco/infinum/goldeneye/models/CameraRequest;", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.GoldenEye2Impl$openCamera$1 */
/* compiled from: GoldenEye2Impl.kt */
public final class GoldenEye2Impl$openCamera$1 extends CameraDevice.StateCallback {
    final /* synthetic */ InitCallback $callback;
    final /* synthetic */ CameraInfo $cameraInfo;
    final /* synthetic */ TextureView $textureView;
    final /* synthetic */ GoldenEye2Impl this$0;

    GoldenEye2Impl$openCamera$1(GoldenEye2Impl goldenEye2Impl, TextureView textureView, CameraInfo cameraInfo, InitCallback initCallback) {
        this.this$0 = goldenEye2Impl;
        this.$textureView = textureView;
        this.$cameraInfo = cameraInfo;
        this.$callback = initCallback;
    }

    public void onOpened(CameraDevice cameraDevice) {
        if (this.this$0.lastCameraRequest != null) {
            CameraRequest access$getLastCameraRequest$p = this.this$0.lastCameraRequest;
            if (access$getLastCameraRequest$p == null) {
                Intrinsics.throwNpe();
            }
            openLastRequestedCamera(access$getLastCameraRequest$p);
            return;
        }
        this.this$0.initInternal(cameraDevice, this.$textureView, this.$cameraInfo, this.$callback);
    }

    public final void openLastRequestedCamera(CameraRequest cameraRequest) {
        Intrinsics.checkParameterIsNotNull(cameraRequest, "request");
        this.this$0.releaseInternal();
        this.this$0.lastCameraRequest = null;
        this.this$0.open(this.$textureView, cameraRequest.getCameraInfo(), cameraRequest.getCallback());
    }

    public void onDisconnected(CameraDevice cameraDevice) {
        this.this$0.releaseInternal();
    }

    public void onError(CameraDevice cameraDevice, int i) {
        CameraState state = BaseGoldenEye.Companion.getState();
        if (this.this$0.lastCameraRequest == null) {
            this.this$0.releaseInternal();
            LogDelegate.INSTANCE.log(Camera2Error.Companion.fromInt(i).getMessage());
            if (state == CameraState.INITIALIZING) {
                AnyKt.getMAIN_HANDLER().post(new GoldenEye2Impl$openCamera$1$onError$1(this));
                return;
            }
            return;
        }
        CameraRequest access$getLastCameraRequest$p = this.this$0.lastCameraRequest;
        if (access$getLastCameraRequest$p == null) {
            Intrinsics.throwNpe();
        }
        openLastRequestedCamera(access$getLastCameraRequest$p);
    }
}
