package p033co.infinum.goldeneye.config;

import android.media.CamcorderProfile;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p033co.infinum.goldeneye.BaseGoldenEye;
import p033co.infinum.goldeneye.models.CameraProperty;
import p033co.infinum.goldeneye.models.CameraState;
import p033co.infinum.goldeneye.models.PreviewScale;
import p033co.infinum.goldeneye.models.Size;
import p033co.infinum.goldeneye.utils.CameraUtils;
import p033co.infinum.goldeneye.utils.LogDelegate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u00028\u0000X.¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0004¢\u0006\u0002\n\u0000R&\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u001a@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR&\u0010 \u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0017¨\u0006%"}, mo51343d2 = {"Lco/infinum/goldeneye/config/BaseSizeConfig;", "T", "", "Lco/infinum/goldeneye/config/SizeConfig;", "cameraInfo", "Lco/infinum/goldeneye/config/CameraInfo;", "videoConfig", "Lco/infinum/goldeneye/config/VideoConfig;", "onUpdateCallback", "Lkotlin/Function1;", "Lco/infinum/goldeneye/models/CameraProperty;", "", "(Lco/infinum/goldeneye/config/CameraInfo;Lco/infinum/goldeneye/config/VideoConfig;Lkotlin/jvm/functions/Function1;)V", "characteristics", "getCharacteristics", "()Ljava/lang/Object;", "setCharacteristics", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "value", "Lco/infinum/goldeneye/models/Size;", "pictureSize", "getPictureSize", "()Lco/infinum/goldeneye/models/Size;", "setPictureSize", "(Lco/infinum/goldeneye/models/Size;)V", "Lco/infinum/goldeneye/models/PreviewScale;", "previewScale", "getPreviewScale", "()Lco/infinum/goldeneye/models/PreviewScale;", "setPreviewScale", "(Lco/infinum/goldeneye/models/PreviewScale;)V", "previewSize", "getPreviewSize", "setPreviewSize", "videoSize", "getVideoSize", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.BaseSizeConfig */
/* compiled from: SizeConfig.kt */
public abstract class BaseSizeConfig<T> implements SizeConfig {
    private final CameraInfo cameraInfo;
    public T characteristics;
    private final Function1<CameraProperty, Unit> onUpdateCallback;
    private Size pictureSize = Size.Companion.getUNKNOWN();
    private PreviewScale previewScale = PreviewScale.AUTO_FIT;
    private Size previewSize = Size.Companion.getUNKNOWN();
    private final VideoConfig videoConfig;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 1, 13})
    /* renamed from: co.infinum.goldeneye.config.BaseSizeConfig$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[PreviewScale.values().length];

        static {
            $EnumSwitchMapping$0[PreviewScale.MANUAL.ordinal()] = 1;
            $EnumSwitchMapping$0[PreviewScale.MANUAL_FIT.ordinal()] = 2;
            $EnumSwitchMapping$0[PreviewScale.MANUAL_FILL.ordinal()] = 3;
            $EnumSwitchMapping$0[PreviewScale.AUTO_FIT.ordinal()] = 4;
            $EnumSwitchMapping$0[PreviewScale.AUTO_FILL.ordinal()] = 5;
        }
    }

    public BaseSizeConfig(CameraInfo cameraInfo2, VideoConfig videoConfig2, Function1<? super CameraProperty, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(cameraInfo2, "cameraInfo");
        Intrinsics.checkParameterIsNotNull(videoConfig2, "videoConfig");
        Intrinsics.checkParameterIsNotNull(function1, "onUpdateCallback");
        this.cameraInfo = cameraInfo2;
        this.videoConfig = videoConfig2;
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

    public Size getPreviewSize() {
        int i = WhenMappings.$EnumSwitchMapping$0[getPreviewScale().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.previewSize;
        }
        if (i != 4 && i != 5) {
            throw new NoWhenBranchMatchedException();
        } else if (BaseGoldenEye.Companion.getState() == CameraState.RECORDING_VIDEO) {
            return CameraUtils.INSTANCE.findBestMatchingSize(getVideoSize(), getSupportedPreviewSizes());
        } else {
            return CameraUtils.INSTANCE.findBestMatchingSize(getPictureSize(), getSupportedPreviewSizes());
        }
    }

    public void setPreviewSize(Size size) {
        Intrinsics.checkParameterIsNotNull(size, "value");
        if (getSupportedPreviewSizes().contains(size)) {
            this.previewSize = size;
            this.onUpdateCallback.invoke(CameraProperty.PREVIEW_SIZE);
            return;
        }
        LogDelegate logDelegate = LogDelegate.INSTANCE;
        logDelegate.log("Unsupported PreviewSize [" + size + ']');
    }

    public Size getPictureSize() {
        if (!Intrinsics.areEqual((Object) this.pictureSize, (Object) Size.Companion.getUNKNOWN())) {
            return this.pictureSize;
        }
        if (!getSupportedPictureSizes().isEmpty()) {
            return getSupportedPictureSizes().get(0);
        }
        return Size.Companion.getUNKNOWN();
    }

    public void setPictureSize(Size size) {
        Intrinsics.checkParameterIsNotNull(size, "value");
        if (getSupportedPictureSizes().contains(size)) {
            this.pictureSize = size;
            this.onUpdateCallback.invoke(CameraProperty.PICTURE_SIZE);
            return;
        }
        LogDelegate logDelegate = LogDelegate.INSTANCE;
        logDelegate.log("Unsupported PictureSize [" + size + ']');
    }

    public Size getVideoSize() {
        if (StringsKt.toIntOrNull(this.cameraInfo.getId()) == null) {
            return Size.Companion.getUNKNOWN();
        }
        CamcorderProfile camcorderProfile = CamcorderProfile.get(Integer.parseInt(this.cameraInfo.getId()), this.videoConfig.getVideoQuality().getKey());
        return new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
    }

    public PreviewScale getPreviewScale() {
        return this.previewScale;
    }

    public void setPreviewScale(PreviewScale previewScale2) {
        Intrinsics.checkParameterIsNotNull(previewScale2, "value");
        this.previewScale = previewScale2;
        this.onUpdateCallback.invoke(CameraProperty.PREVIEW_SCALE);
    }
}
