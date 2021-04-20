package p033co.infinum.goldeneye.config;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.models.CameraProperty;
import p033co.infinum.goldeneye.models.VideoQuality;
import p033co.infinum.goldeneye.utils.LogDelegate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b \u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bR\u001c\u0010\t\u001a\u00028\u0000X.¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00168V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, mo51343d2 = {"Lco/infinum/goldeneye/config/BaseVideoConfig;", "T", "", "Lco/infinum/goldeneye/config/VideoConfig;", "onUpdateCallback", "Lkotlin/Function1;", "Lco/infinum/goldeneye/models/CameraProperty;", "", "(Lkotlin/jvm/functions/Function1;)V", "characteristics", "getCharacteristics", "()Ljava/lang/Object;", "setCharacteristics", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "value", "Lco/infinum/goldeneye/models/VideoQuality;", "videoQuality", "getVideoQuality", "()Lco/infinum/goldeneye/models/VideoQuality;", "setVideoQuality", "(Lco/infinum/goldeneye/models/VideoQuality;)V", "", "videoStabilizationEnabled", "getVideoStabilizationEnabled", "()Z", "setVideoStabilizationEnabled", "(Z)V", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.BaseVideoConfig */
/* compiled from: VideoConfig.kt */
public abstract class BaseVideoConfig<T> implements VideoConfig {
    public T characteristics;
    private final Function1<CameraProperty, Unit> onUpdateCallback;
    private VideoQuality videoQuality = VideoQuality.UNKNOWN;
    private boolean videoStabilizationEnabled;

    public BaseVideoConfig(Function1<? super CameraProperty, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "onUpdateCallback");
        this.onUpdateCallback = function1;
    }

    public final T getCharacteristics() {
        T t = this.characteristics;
        if (t == null) {
            Intrinsics.throwUninitializedPropertyAccessException("characteristics");
        }
        return t;
    }

    public final void setCharacteristics(T t) {
        Intrinsics.checkParameterIsNotNull(t, "<set-?>");
        this.characteristics = t;
    }

    public VideoQuality getVideoQuality() {
        if (this.videoQuality != VideoQuality.UNKNOWN) {
            return this.videoQuality;
        }
        if (getSupportedVideoQualities().contains(VideoQuality.RESOLUTION_2160P)) {
            return VideoQuality.RESOLUTION_2160P;
        }
        if (getSupportedVideoQualities().contains(VideoQuality.RESOLUTION_1080P)) {
            return VideoQuality.RESOLUTION_1080P;
        }
        if (getSupportedVideoQualities().contains(VideoQuality.RESOLUTION_720P)) {
            return VideoQuality.RESOLUTION_720P;
        }
        if (getSupportedVideoQualities().contains(VideoQuality.HIGH)) {
            return VideoQuality.HIGH;
        }
        if (getSupportedVideoQualities().contains(VideoQuality.LOW)) {
            return VideoQuality.LOW;
        }
        return VideoQuality.UNKNOWN;
    }

    public void setVideoQuality(VideoQuality videoQuality2) {
        Intrinsics.checkParameterIsNotNull(videoQuality2, "value");
        if (getSupportedVideoQualities().contains(videoQuality2)) {
            this.videoQuality = videoQuality2;
            return;
        }
        LogDelegate logDelegate = LogDelegate.INSTANCE;
        logDelegate.log("Unsupported VideoQuality [" + videoQuality2 + ']');
    }

    public boolean getVideoStabilizationEnabled() {
        return isVideoStabilizationSupported() && this.videoStabilizationEnabled;
    }

    public void setVideoStabilizationEnabled(boolean z) {
        if (isVideoStabilizationSupported()) {
            this.videoStabilizationEnabled = z;
            this.onUpdateCallback.invoke(CameraProperty.VIDEO_STABILIZATION);
            return;
        }
        LogDelegate.INSTANCE.log("VideoStabilization not supported.");
    }
}
