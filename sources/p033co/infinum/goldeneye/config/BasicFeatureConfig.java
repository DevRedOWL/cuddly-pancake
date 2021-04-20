package p033co.infinum.goldeneye.config;

import java.util.List;
import kotlin.Metadata;
import p033co.infinum.goldeneye.models.FlashMode;
import p033co.infinum.goldeneye.models.FocusMode;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0018\u0010\u0011\u001a\u00020\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0018\u0010\u001d\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u00020\"X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006'"}, mo51343d2 = {"Lco/infinum/goldeneye/config/BasicFeatureConfig;", "", "flashMode", "Lco/infinum/goldeneye/models/FlashMode;", "getFlashMode", "()Lco/infinum/goldeneye/models/FlashMode;", "setFlashMode", "(Lco/infinum/goldeneye/models/FlashMode;)V", "focusMode", "Lco/infinum/goldeneye/models/FocusMode;", "getFocusMode", "()Lco/infinum/goldeneye/models/FocusMode;", "setFocusMode", "(Lco/infinum/goldeneye/models/FocusMode;)V", "isTapToFocusSupported", "", "()Z", "pictureQuality", "", "getPictureQuality", "()I", "setPictureQuality", "(I)V", "supportedFlashModes", "", "getSupportedFlashModes", "()Ljava/util/List;", "supportedFocusModes", "getSupportedFocusModes", "tapToFocusEnabled", "getTapToFocusEnabled", "setTapToFocusEnabled", "(Z)V", "tapToFocusResetDelay", "", "getTapToFocusResetDelay", "()J", "setTapToFocusResetDelay", "(J)V", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.BasicFeatureConfig */
/* compiled from: BasicFeatureConfig.kt */
public interface BasicFeatureConfig {
    FlashMode getFlashMode();

    FocusMode getFocusMode();

    int getPictureQuality();

    List<FlashMode> getSupportedFlashModes();

    List<FocusMode> getSupportedFocusModes();

    boolean getTapToFocusEnabled();

    long getTapToFocusResetDelay();

    boolean isTapToFocusSupported();

    void setFlashMode(FlashMode flashMode);

    void setFocusMode(FocusMode focusMode);

    void setPictureQuality(int i);

    void setTapToFocusEnabled(boolean z);

    void setTapToFocusResetDelay(long j);
}
