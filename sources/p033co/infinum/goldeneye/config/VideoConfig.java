package p033co.infinum.goldeneye.config;

import java.util.List;
import kotlin.Metadata;
import p033co.infinum.goldeneye.models.VideoQuality;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0004\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, mo51343d2 = {"Lco/infinum/goldeneye/config/VideoConfig;", "", "isVideoStabilizationSupported", "", "()Z", "supportedVideoQualities", "", "Lco/infinum/goldeneye/models/VideoQuality;", "getSupportedVideoQualities", "()Ljava/util/List;", "videoQuality", "getVideoQuality", "()Lco/infinum/goldeneye/models/VideoQuality;", "setVideoQuality", "(Lco/infinum/goldeneye/models/VideoQuality;)V", "videoStabilizationEnabled", "getVideoStabilizationEnabled", "setVideoStabilizationEnabled", "(Z)V", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.VideoConfig */
/* compiled from: VideoConfig.kt */
public interface VideoConfig {
    List<VideoQuality> getSupportedVideoQualities();

    VideoQuality getVideoQuality();

    boolean getVideoStabilizationEnabled();

    boolean isVideoStabilizationSupported();

    void setVideoQuality(VideoQuality videoQuality);

    void setVideoStabilizationEnabled(boolean z);
}
