package p033co.infinum.goldeneye.config;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.IllegalCharacteristicsException;
import p033co.infinum.goldeneye.models.AntibandingMode;
import p033co.infinum.goldeneye.models.ColorEffectMode;
import p033co.infinum.goldeneye.models.Facing;
import p033co.infinum.goldeneye.models.FlashMode;
import p033co.infinum.goldeneye.models.FocusMode;
import p033co.infinum.goldeneye.models.PreviewScale;
import p033co.infinum.goldeneye.models.Size;
import p033co.infinum.goldeneye.models.VideoQuality;
import p033co.infinum.goldeneye.models.WhiteBalanceMode;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u001f\b \u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\tBS\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0002\u0010\u0015R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u00020\u001bX\u000f¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010)\u001a\u0004\u0018\u00018\u00002\b\u0010(\u001a\u0004\u0018\u00018\u0000@FX\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0018\u0010/\u001a\u000200X\u000f¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0012\u00105\u001a\u000206X\u0005¢\u0006\u0006\u001a\u0004\b7\u00108R\u0018\u00109\u001a\u00020:X\u000f¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0018\u0010?\u001a\u00020@X\u000f¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0012\u0010E\u001a\u00020FX\u0005¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0012\u0010I\u001a\u00020JX\u0005¢\u0006\u0006\u001a\u0004\bI\u0010KR\u0012\u0010L\u001a\u00020JX\u0005¢\u0006\u0006\u001a\u0004\bL\u0010KR\u0012\u0010M\u001a\u00020JX\u0005¢\u0006\u0006\u001a\u0004\bM\u0010KR\u0012\u0010N\u001a\u00020OX\u0005¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0012\u0010R\u001a\u00020OX\u0005¢\u0006\u0006\u001a\u0004\bS\u0010QR\u0018\u0010T\u001a\u00020OX\u000f¢\u0006\f\u001a\u0004\bU\u0010Q\"\u0004\bV\u0010WR\u0018\u0010X\u001a\u00020YX\u000f¢\u0006\f\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0018\u0010^\u001a\u00020JX\u000f¢\u0006\f\u001a\u0004\b_\u0010K\"\u0004\b`\u0010aR\u0018\u0010b\u001a\u00020cX\u000f¢\u0006\f\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0018\u0010h\u001a\u00020iX\u000f¢\u0006\f\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0018\u0010n\u001a\u00020YX\u000f¢\u0006\f\u001a\u0004\bo\u0010[\"\u0004\bp\u0010]R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u0018\u0010u\u001a\b\u0012\u0004\u0012\u00020\u001b0vX\u0005¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0018\u0010y\u001a\b\u0012\u0004\u0012\u0002000vX\u0005¢\u0006\u0006\u001a\u0004\bz\u0010xR\u0018\u0010{\u001a\b\u0012\u0004\u0012\u00020:0vX\u0005¢\u0006\u0006\u001a\u0004\b|\u0010xR\u0018\u0010}\u001a\b\u0012\u0004\u0012\u00020@0vX\u0005¢\u0006\u0006\u001a\u0004\b~\u0010xR\u0019\u0010\u001a\b\u0012\u0004\u0012\u00020Y0vX\u0005¢\u0006\u0007\u001a\u0005\b\u0001\u0010xR\u001a\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020Y0vX\u0005¢\u0006\u0007\u001a\u0005\b\u0001\u0010xR\u001b\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010vX\u0005¢\u0006\u0007\u001a\u0005\b\u0001\u0010xR\u001b\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010vX\u0005¢\u0006\u0007\u001a\u0005\b\u0001\u0010xR\u001b\u0010\u0001\u001a\u00020JX\u000f¢\u0006\u000e\u001a\u0005\b\u0001\u0010K\"\u0005\b\u0001\u0010aR\u001e\u0010\u0001\u001a\u00030\u0001X\u000f¢\u0006\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fX\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001e\u0010\u0001\u001a\u00030\u0001X\u000f¢\u0006\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0014\u0010\u0001\u001a\u00020YX\u0005¢\u0006\u0007\u001a\u0005\b\u0001\u0010[R\u001b\u0010\u0001\u001a\u00020JX\u000f¢\u0006\u000e\u001a\u0005\b\u0001\u0010K\"\u0005\b\u0001\u0010aR\u001e\u0010 \u0001\u001a\u00030\u0001X\u000f¢\u0006\u0010\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R\u001b\u0010¥\u0001\u001a\u00020OX\u000f¢\u0006\u000e\u001a\u0005\b¦\u0001\u0010Q\"\u0005\b§\u0001\u0010WR$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001¨\u0006¬\u0001"}, mo51343d2 = {"Lco/infinum/goldeneye/config/CameraConfigImpl;", "T", "", "Lco/infinum/goldeneye/config/CameraConfig;", "Lco/infinum/goldeneye/config/CameraInfo;", "Lco/infinum/goldeneye/config/VideoConfig;", "Lco/infinum/goldeneye/config/BasicFeatureConfig;", "Lco/infinum/goldeneye/config/AdvancedFeatureConfig;", "Lco/infinum/goldeneye/config/SizeConfig;", "Lco/infinum/goldeneye/config/ZoomConfig;", "cameraInfo", "videoConfig", "Lco/infinum/goldeneye/config/BaseVideoConfig;", "basicFeatureConfig", "Lco/infinum/goldeneye/config/BaseBasicFeatureConfig;", "advancedFeatureConfig", "Lco/infinum/goldeneye/config/BaseAdvancedFeatureConfig;", "sizeConfig", "Lco/infinum/goldeneye/config/BaseSizeConfig;", "zoomConfig", "Lco/infinum/goldeneye/config/BaseZoomConfig;", "(Lco/infinum/goldeneye/config/CameraInfo;Lco/infinum/goldeneye/config/BaseVideoConfig;Lco/infinum/goldeneye/config/BaseBasicFeatureConfig;Lco/infinum/goldeneye/config/BaseAdvancedFeatureConfig;Lco/infinum/goldeneye/config/BaseSizeConfig;Lco/infinum/goldeneye/config/BaseZoomConfig;)V", "getAdvancedFeatureConfig", "()Lco/infinum/goldeneye/config/BaseAdvancedFeatureConfig;", "setAdvancedFeatureConfig", "(Lco/infinum/goldeneye/config/BaseAdvancedFeatureConfig;)V", "antibandingMode", "Lco/infinum/goldeneye/models/AntibandingMode;", "getAntibandingMode", "()Lco/infinum/goldeneye/models/AntibandingMode;", "setAntibandingMode", "(Lco/infinum/goldeneye/models/AntibandingMode;)V", "getBasicFeatureConfig", "()Lco/infinum/goldeneye/config/BaseBasicFeatureConfig;", "setBasicFeatureConfig", "(Lco/infinum/goldeneye/config/BaseBasicFeatureConfig;)V", "getCameraInfo", "()Lco/infinum/goldeneye/config/CameraInfo;", "setCameraInfo", "(Lco/infinum/goldeneye/config/CameraInfo;)V", "value", "characteristics", "getCharacteristics", "()Ljava/lang/Object;", "setCharacteristics", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "colorEffectMode", "Lco/infinum/goldeneye/models/ColorEffectMode;", "getColorEffectMode", "()Lco/infinum/goldeneye/models/ColorEffectMode;", "setColorEffectMode", "(Lco/infinum/goldeneye/models/ColorEffectMode;)V", "facing", "Lco/infinum/goldeneye/models/Facing;", "getFacing", "()Lco/infinum/goldeneye/models/Facing;", "flashMode", "Lco/infinum/goldeneye/models/FlashMode;", "getFlashMode", "()Lco/infinum/goldeneye/models/FlashMode;", "setFlashMode", "(Lco/infinum/goldeneye/models/FlashMode;)V", "focusMode", "Lco/infinum/goldeneye/models/FocusMode;", "getFocusMode", "()Lco/infinum/goldeneye/models/FocusMode;", "setFocusMode", "(Lco/infinum/goldeneye/models/FocusMode;)V", "id", "", "getId", "()Ljava/lang/String;", "isTapToFocusSupported", "", "()Z", "isVideoStabilizationSupported", "isZoomSupported", "maxZoom", "", "getMaxZoom", "()I", "orientation", "getOrientation", "pictureQuality", "getPictureQuality", "setPictureQuality", "(I)V", "pictureSize", "Lco/infinum/goldeneye/models/Size;", "getPictureSize", "()Lco/infinum/goldeneye/models/Size;", "setPictureSize", "(Lco/infinum/goldeneye/models/Size;)V", "pinchToZoomEnabled", "getPinchToZoomEnabled", "setPinchToZoomEnabled", "(Z)V", "pinchToZoomFriction", "", "getPinchToZoomFriction", "()F", "setPinchToZoomFriction", "(F)V", "previewScale", "Lco/infinum/goldeneye/models/PreviewScale;", "getPreviewScale", "()Lco/infinum/goldeneye/models/PreviewScale;", "setPreviewScale", "(Lco/infinum/goldeneye/models/PreviewScale;)V", "previewSize", "getPreviewSize", "setPreviewSize", "getSizeConfig", "()Lco/infinum/goldeneye/config/BaseSizeConfig;", "setSizeConfig", "(Lco/infinum/goldeneye/config/BaseSizeConfig;)V", "supportedAntibandingModes", "", "getSupportedAntibandingModes", "()Ljava/util/List;", "supportedColorEffectModes", "getSupportedColorEffectModes", "supportedFlashModes", "getSupportedFlashModes", "supportedFocusModes", "getSupportedFocusModes", "supportedPictureSizes", "getSupportedPictureSizes", "supportedPreviewSizes", "getSupportedPreviewSizes", "supportedVideoQualities", "Lco/infinum/goldeneye/models/VideoQuality;", "getSupportedVideoQualities", "supportedWhiteBalanceModes", "Lco/infinum/goldeneye/models/WhiteBalanceMode;", "getSupportedWhiteBalanceModes", "tapToFocusEnabled", "getTapToFocusEnabled", "setTapToFocusEnabled", "tapToFocusResetDelay", "", "getTapToFocusResetDelay", "()J", "setTapToFocusResetDelay", "(J)V", "getVideoConfig", "()Lco/infinum/goldeneye/config/BaseVideoConfig;", "setVideoConfig", "(Lco/infinum/goldeneye/config/BaseVideoConfig;)V", "videoQuality", "getVideoQuality", "()Lco/infinum/goldeneye/models/VideoQuality;", "setVideoQuality", "(Lco/infinum/goldeneye/models/VideoQuality;)V", "videoSize", "getVideoSize", "videoStabilizationEnabled", "getVideoStabilizationEnabled", "setVideoStabilizationEnabled", "whiteBalanceMode", "getWhiteBalanceMode", "()Lco/infinum/goldeneye/models/WhiteBalanceMode;", "setWhiteBalanceMode", "(Lco/infinum/goldeneye/models/WhiteBalanceMode;)V", "zoom", "getZoom", "setZoom", "getZoomConfig", "()Lco/infinum/goldeneye/config/BaseZoomConfig;", "setZoomConfig", "(Lco/infinum/goldeneye/config/BaseZoomConfig;)V", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.CameraConfigImpl */
/* compiled from: CameraConfig.kt */
public abstract class CameraConfigImpl<T> implements CameraConfig, CameraInfo, VideoConfig, BasicFeatureConfig, AdvancedFeatureConfig, SizeConfig, ZoomConfig {
    private final /* synthetic */ CameraInfo $$delegate_0;
    private final /* synthetic */ BaseVideoConfig $$delegate_1;
    private final /* synthetic */ BaseBasicFeatureConfig $$delegate_2;
    private final /* synthetic */ BaseAdvancedFeatureConfig $$delegate_3;
    private final /* synthetic */ BaseSizeConfig $$delegate_4;
    private final /* synthetic */ BaseZoomConfig $$delegate_5;
    private BaseAdvancedFeatureConfig<T> advancedFeatureConfig;
    private BaseBasicFeatureConfig<T> basicFeatureConfig;
    private CameraInfo cameraInfo;
    private T characteristics;
    private BaseSizeConfig<T> sizeConfig;
    private BaseVideoConfig<T> videoConfig;
    private BaseZoomConfig<T> zoomConfig;

    public AntibandingMode getAntibandingMode() {
        return this.$$delegate_3.getAntibandingMode();
    }

    public ColorEffectMode getColorEffectMode() {
        return this.$$delegate_3.getColorEffectMode();
    }

    public Facing getFacing() {
        return this.$$delegate_0.getFacing();
    }

    public FlashMode getFlashMode() {
        return this.$$delegate_2.getFlashMode();
    }

    public FocusMode getFocusMode() {
        return this.$$delegate_2.getFocusMode();
    }

    public String getId() {
        return this.$$delegate_0.getId();
    }

    public int getMaxZoom() {
        return this.$$delegate_5.getMaxZoom();
    }

    public int getOrientation() {
        return this.$$delegate_0.getOrientation();
    }

    public int getPictureQuality() {
        return this.$$delegate_2.getPictureQuality();
    }

    public Size getPictureSize() {
        return this.$$delegate_4.getPictureSize();
    }

    public boolean getPinchToZoomEnabled() {
        return this.$$delegate_5.getPinchToZoomEnabled();
    }

    public float getPinchToZoomFriction() {
        return this.$$delegate_5.getPinchToZoomFriction();
    }

    public PreviewScale getPreviewScale() {
        return this.$$delegate_4.getPreviewScale();
    }

    public Size getPreviewSize() {
        return this.$$delegate_4.getPreviewSize();
    }

    public List<AntibandingMode> getSupportedAntibandingModes() {
        return this.$$delegate_3.getSupportedAntibandingModes();
    }

    public List<ColorEffectMode> getSupportedColorEffectModes() {
        return this.$$delegate_3.getSupportedColorEffectModes();
    }

    public List<FlashMode> getSupportedFlashModes() {
        return this.$$delegate_2.getSupportedFlashModes();
    }

    public List<FocusMode> getSupportedFocusModes() {
        return this.$$delegate_2.getSupportedFocusModes();
    }

    public List<Size> getSupportedPictureSizes() {
        return this.$$delegate_4.getSupportedPictureSizes();
    }

    public List<Size> getSupportedPreviewSizes() {
        return this.$$delegate_4.getSupportedPreviewSizes();
    }

    public List<VideoQuality> getSupportedVideoQualities() {
        return this.$$delegate_1.getSupportedVideoQualities();
    }

    public List<WhiteBalanceMode> getSupportedWhiteBalanceModes() {
        return this.$$delegate_3.getSupportedWhiteBalanceModes();
    }

    public boolean getTapToFocusEnabled() {
        return this.$$delegate_2.getTapToFocusEnabled();
    }

    public long getTapToFocusResetDelay() {
        return this.$$delegate_2.getTapToFocusResetDelay();
    }

    public VideoQuality getVideoQuality() {
        return this.$$delegate_1.getVideoQuality();
    }

    public Size getVideoSize() {
        return this.$$delegate_4.getVideoSize();
    }

    public boolean getVideoStabilizationEnabled() {
        return this.$$delegate_1.getVideoStabilizationEnabled();
    }

    public WhiteBalanceMode getWhiteBalanceMode() {
        return this.$$delegate_3.getWhiteBalanceMode();
    }

    public int getZoom() {
        return this.$$delegate_5.getZoom();
    }

    public boolean isTapToFocusSupported() {
        return this.$$delegate_2.isTapToFocusSupported();
    }

    public boolean isVideoStabilizationSupported() {
        return this.$$delegate_1.isVideoStabilizationSupported();
    }

    public boolean isZoomSupported() {
        return this.$$delegate_5.isZoomSupported();
    }

    public void setAntibandingMode(AntibandingMode antibandingMode) {
        Intrinsics.checkParameterIsNotNull(antibandingMode, "<set-?>");
        this.$$delegate_3.setAntibandingMode(antibandingMode);
    }

    public void setColorEffectMode(ColorEffectMode colorEffectMode) {
        Intrinsics.checkParameterIsNotNull(colorEffectMode, "<set-?>");
        this.$$delegate_3.setColorEffectMode(colorEffectMode);
    }

    public void setFlashMode(FlashMode flashMode) {
        Intrinsics.checkParameterIsNotNull(flashMode, "<set-?>");
        this.$$delegate_2.setFlashMode(flashMode);
    }

    public void setFocusMode(FocusMode focusMode) {
        Intrinsics.checkParameterIsNotNull(focusMode, "<set-?>");
        this.$$delegate_2.setFocusMode(focusMode);
    }

    public void setPictureQuality(int i) {
        this.$$delegate_2.setPictureQuality(i);
    }

    public void setPictureSize(Size size) {
        Intrinsics.checkParameterIsNotNull(size, "<set-?>");
        this.$$delegate_4.setPictureSize(size);
    }

    public void setPinchToZoomEnabled(boolean z) {
        this.$$delegate_5.setPinchToZoomEnabled(z);
    }

    public void setPinchToZoomFriction(float f) {
        this.$$delegate_5.setPinchToZoomFriction(f);
    }

    public void setPreviewScale(PreviewScale previewScale) {
        Intrinsics.checkParameterIsNotNull(previewScale, "<set-?>");
        this.$$delegate_4.setPreviewScale(previewScale);
    }

    public void setPreviewSize(Size size) {
        Intrinsics.checkParameterIsNotNull(size, "<set-?>");
        this.$$delegate_4.setPreviewSize(size);
    }

    public void setTapToFocusEnabled(boolean z) {
        this.$$delegate_2.setTapToFocusEnabled(z);
    }

    public void setTapToFocusResetDelay(long j) {
        this.$$delegate_2.setTapToFocusResetDelay(j);
    }

    public void setVideoQuality(VideoQuality videoQuality) {
        Intrinsics.checkParameterIsNotNull(videoQuality, "<set-?>");
        this.$$delegate_1.setVideoQuality(videoQuality);
    }

    public void setVideoStabilizationEnabled(boolean z) {
        this.$$delegate_1.setVideoStabilizationEnabled(z);
    }

    public void setWhiteBalanceMode(WhiteBalanceMode whiteBalanceMode) {
        Intrinsics.checkParameterIsNotNull(whiteBalanceMode, "<set-?>");
        this.$$delegate_3.setWhiteBalanceMode(whiteBalanceMode);
    }

    public void setZoom(int i) {
        this.$$delegate_5.setZoom(i);
    }

    public CameraConfigImpl(CameraInfo cameraInfo2, BaseVideoConfig<T> baseVideoConfig, BaseBasicFeatureConfig<T> baseBasicFeatureConfig, BaseAdvancedFeatureConfig<T> baseAdvancedFeatureConfig, BaseSizeConfig<T> baseSizeConfig, BaseZoomConfig<T> baseZoomConfig) {
        Intrinsics.checkParameterIsNotNull(cameraInfo2, "cameraInfo");
        Intrinsics.checkParameterIsNotNull(baseVideoConfig, "videoConfig");
        Intrinsics.checkParameterIsNotNull(baseBasicFeatureConfig, "basicFeatureConfig");
        Intrinsics.checkParameterIsNotNull(baseAdvancedFeatureConfig, "advancedFeatureConfig");
        Intrinsics.checkParameterIsNotNull(baseSizeConfig, "sizeConfig");
        Intrinsics.checkParameterIsNotNull(baseZoomConfig, "zoomConfig");
        this.$$delegate_0 = cameraInfo2;
        this.$$delegate_1 = baseVideoConfig;
        this.$$delegate_2 = baseBasicFeatureConfig;
        this.$$delegate_3 = baseAdvancedFeatureConfig;
        this.$$delegate_4 = baseSizeConfig;
        this.$$delegate_5 = baseZoomConfig;
        this.cameraInfo = cameraInfo2;
        this.videoConfig = baseVideoConfig;
        this.basicFeatureConfig = baseBasicFeatureConfig;
        this.advancedFeatureConfig = baseAdvancedFeatureConfig;
        this.sizeConfig = baseSizeConfig;
        this.zoomConfig = baseZoomConfig;
    }

    public final CameraInfo getCameraInfo() {
        return this.cameraInfo;
    }

    public final void setCameraInfo(CameraInfo cameraInfo2) {
        Intrinsics.checkParameterIsNotNull(cameraInfo2, "<set-?>");
        this.cameraInfo = cameraInfo2;
    }

    public final BaseVideoConfig<T> getVideoConfig() {
        return this.videoConfig;
    }

    public final void setVideoConfig(BaseVideoConfig<T> baseVideoConfig) {
        Intrinsics.checkParameterIsNotNull(baseVideoConfig, "<set-?>");
        this.videoConfig = baseVideoConfig;
    }

    public final BaseBasicFeatureConfig<T> getBasicFeatureConfig() {
        return this.basicFeatureConfig;
    }

    public final void setBasicFeatureConfig(BaseBasicFeatureConfig<T> baseBasicFeatureConfig) {
        Intrinsics.checkParameterIsNotNull(baseBasicFeatureConfig, "<set-?>");
        this.basicFeatureConfig = baseBasicFeatureConfig;
    }

    public final BaseAdvancedFeatureConfig<T> getAdvancedFeatureConfig() {
        return this.advancedFeatureConfig;
    }

    public final void setAdvancedFeatureConfig(BaseAdvancedFeatureConfig<T> baseAdvancedFeatureConfig) {
        Intrinsics.checkParameterIsNotNull(baseAdvancedFeatureConfig, "<set-?>");
        this.advancedFeatureConfig = baseAdvancedFeatureConfig;
    }

    public final BaseSizeConfig<T> getSizeConfig() {
        return this.sizeConfig;
    }

    public final void setSizeConfig(BaseSizeConfig<T> baseSizeConfig) {
        Intrinsics.checkParameterIsNotNull(baseSizeConfig, "<set-?>");
        this.sizeConfig = baseSizeConfig;
    }

    public final BaseZoomConfig<T> getZoomConfig() {
        return this.zoomConfig;
    }

    public final void setZoomConfig(BaseZoomConfig<T> baseZoomConfig) {
        Intrinsics.checkParameterIsNotNull(baseZoomConfig, "<set-?>");
        this.zoomConfig = baseZoomConfig;
    }

    public final T getCharacteristics() {
        return this.characteristics;
    }

    public final void setCharacteristics(T t) {
        this.characteristics = t;
        if (t != null) {
            this.sizeConfig.setCharacteristics(t);
            this.videoConfig.setCharacteristics(t);
            this.basicFeatureConfig.setCharacteristics(t);
            this.advancedFeatureConfig.setCharacteristics(t);
            this.zoomConfig.setCharacteristics(t);
            return;
        }
        throw IllegalCharacteristicsException.INSTANCE;
    }
}
