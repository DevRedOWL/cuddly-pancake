package p033co.infinum.goldeneye.config;

import java.util.List;
import kotlin.Metadata;
import p033co.infinum.goldeneye.models.PreviewScale;
import p033co.infinum.goldeneye.models.Size;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0012\u0010\u0017\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0005¨\u0006\u0019"}, mo51343d2 = {"Lco/infinum/goldeneye/config/SizeConfig;", "", "pictureSize", "Lco/infinum/goldeneye/models/Size;", "getPictureSize", "()Lco/infinum/goldeneye/models/Size;", "setPictureSize", "(Lco/infinum/goldeneye/models/Size;)V", "previewScale", "Lco/infinum/goldeneye/models/PreviewScale;", "getPreviewScale", "()Lco/infinum/goldeneye/models/PreviewScale;", "setPreviewScale", "(Lco/infinum/goldeneye/models/PreviewScale;)V", "previewSize", "getPreviewSize", "setPreviewSize", "supportedPictureSizes", "", "getSupportedPictureSizes", "()Ljava/util/List;", "supportedPreviewSizes", "getSupportedPreviewSizes", "videoSize", "getVideoSize", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.SizeConfig */
/* compiled from: SizeConfig.kt */
public interface SizeConfig {
    Size getPictureSize();

    PreviewScale getPreviewScale();

    Size getPreviewSize();

    List<Size> getSupportedPictureSizes();

    List<Size> getSupportedPreviewSizes();

    Size getVideoSize();

    void setPictureSize(Size size);

    void setPreviewScale(PreviewScale previewScale);

    void setPreviewSize(Size size);
}
