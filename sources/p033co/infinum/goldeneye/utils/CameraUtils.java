package p033co.infinum.goldeneye.utils;

import android.app.Activity;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.view.Display;
import android.view.TextureView;
import android.view.WindowManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p033co.infinum.goldeneye.BaseGoldenEye;
import p033co.infinum.goldeneye.config.CameraConfig;
import p033co.infinum.goldeneye.config.CameraInfo;
import p033co.infinum.goldeneye.config.camera2.Camera2ConfigImpl;
import p033co.infinum.goldeneye.extensions.ViewKt;
import p033co.infinum.goldeneye.models.CameraApi;
import p033co.infinum.goldeneye.models.Facing;
import p033co.infinum.goldeneye.models.PreviewScale;
import p033co.infinum.goldeneye.models.Size;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ2\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\f\u001a\u00020\u0013H\u0007J\u0016\u0010\u0015\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0016J2\u0010\u0017\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J2\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u00192\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001c\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0006J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J8\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006'"}, mo51343d2 = {"Lco/infinum/goldeneye/utils/CameraUtils;", "", "()V", "FOCUS_AREA_SIZE", "", "calculateCamera1FocusArea", "", "Landroid/hardware/Camera$Area;", "activity", "Landroid/app/Activity;", "textureView", "Landroid/view/TextureView;", "config", "Lco/infinum/goldeneye/config/CameraConfig;", "x", "", "y", "calculateCamera2FocusArea", "Landroid/graphics/Rect;", "Lco/infinum/goldeneye/config/camera2/Camera2ConfigImpl;", "calculateCamera2ZoomRect", "calculateDisplayOrientation", "Lco/infinum/goldeneye/config/CameraInfo;", "calculateFocusRect", "calculateScale", "Lkotlin/Triple;", "calculateTextureMatrix", "Landroid/graphics/Matrix;", "findBestMatchingSize", "Lco/infinum/goldeneye/models/Size;", "referenceSize", "availableSizes", "getDeviceOrientation", "touchNotInPreview", "", "rotatedTextureViewX", "rotatedTextureViewY", "scaledPreviewX", "scaledPreviewY", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.utils.CameraUtils */
/* compiled from: CameraUtils.kt */
public final class CameraUtils {
    private static final int FOCUS_AREA_SIZE = 200;
    public static final CameraUtils INSTANCE = new CameraUtils();

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 1, 13})
    /* renamed from: co.infinum.goldeneye.utils.CameraUtils$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[PreviewScale.values().length];

        static {
            $EnumSwitchMapping$0[PreviewScale.MANUAL_FILL.ordinal()] = 1;
            $EnumSwitchMapping$0[PreviewScale.AUTO_FILL.ordinal()] = 2;
            $EnumSwitchMapping$0[PreviewScale.MANUAL_FIT.ordinal()] = 3;
            $EnumSwitchMapping$0[PreviewScale.AUTO_FIT.ordinal()] = 4;
            $EnumSwitchMapping$0[PreviewScale.MANUAL.ordinal()] = 5;
        }
    }

    private CameraUtils() {
    }

    public final int calculateDisplayOrientation(Activity activity, CameraInfo cameraInfo) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(cameraInfo, "config");
        int deviceOrientation = getDeviceOrientation(activity);
        int orientation = cameraInfo.getOrientation();
        if (cameraInfo.getFacing() == Facing.FRONT) {
            return (360 - ((orientation + deviceOrientation) % 360)) % 360;
        }
        return ((orientation - deviceOrientation) + 360) % 360;
    }

    public final Matrix calculateTextureMatrix(Activity activity, TextureView textureView, CameraConfig cameraConfig) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(textureView, "textureView");
        Intrinsics.checkParameterIsNotNull(cameraConfig, "config");
        Matrix matrix = new Matrix();
        Size previewSize = cameraConfig.getPreviewSize();
        if (ViewKt.isNotMeasured(textureView) || Intrinsics.areEqual((Object) previewSize, (Object) Size.Companion.getUNKNOWN())) {
            matrix.postScale(0.0f, 0.0f);
            return matrix;
        }
        Triple<Float, Float, Float> calculateScale = calculateScale(activity, textureView, cameraConfig);
        float floatValue = calculateScale.component1().floatValue();
        float floatValue2 = calculateScale.component2().floatValue();
        float floatValue3 = calculateScale.component3().floatValue();
        if (BaseGoldenEye.Companion.getVersion() != CameraApi.CAMERA2 || getDeviceOrientation(activity) % 180 == 0) {
            float f = (float) 1;
            matrix.postScale((f / floatValue) * floatValue3, (f / floatValue2) * floatValue3, ((float) textureView.getWidth()) / 2.0f, ((float) textureView.getHeight()) / 2.0f);
        } else {
            matrix.postScale(((((float) textureView.getHeight()) / ((float) textureView.getWidth())) / floatValue2) * floatValue3, ((((float) textureView.getWidth()) / ((float) textureView.getHeight())) / floatValue) * floatValue3, ((float) textureView.getWidth()) / 2.0f, ((float) textureView.getHeight()) / 2.0f);
            float calculateDisplayOrientation = ((float) calculateDisplayOrientation(activity, cameraConfig)) - ((float) cameraConfig.getOrientation());
            if (cameraConfig.getFacing() == Facing.FRONT) {
                calculateDisplayOrientation = -calculateDisplayOrientation;
            }
            matrix.postRotate(calculateDisplayOrientation, ((float) textureView.getWidth()) / 2.0f, ((float) textureView.getHeight()) / 2.0f);
        }
        return matrix;
    }

    public final Rect calculateCamera2FocusArea(Activity activity, TextureView textureView, Camera2ConfigImpl camera2ConfigImpl, float f, float f2) {
        CameraCharacteristics cameraCharacteristics;
        Rect rect;
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(textureView, "textureView");
        Intrinsics.checkParameterIsNotNull(camera2ConfigImpl, "config");
        Rect calculateFocusRect = calculateFocusRect(activity, textureView, camera2ConfigImpl, f, f2);
        if (calculateFocusRect == null || (cameraCharacteristics = (CameraCharacteristics) camera2ConfigImpl.getCharacteristics()) == null || (rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE)) == null) {
            return null;
        }
        float width = ((float) rect.width()) / ((float) camera2ConfigImpl.getPreviewSize().getWidth());
        float height = ((float) rect.height()) / ((float) camera2ConfigImpl.getPreviewSize().getHeight());
        return new Rect((int) (((float) calculateFocusRect.left) * width), (int) (((float) calculateFocusRect.top) * height), (int) (width * ((float) calculateFocusRect.right)), (int) (height * ((float) calculateFocusRect.bottom)));
    }

    public final List<Camera.Area> calculateCamera1FocusArea(Activity activity, TextureView textureView, CameraConfig cameraConfig, float f, float f2) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(textureView, "textureView");
        Intrinsics.checkParameterIsNotNull(cameraConfig, "config");
        Rect calculateFocusRect = calculateFocusRect(activity, textureView, cameraConfig, f, f2);
        if (calculateFocusRect == null) {
            return null;
        }
        Size previewSize = cameraConfig.getPreviewSize();
        float height = 2000.0f / ((float) previewSize.getHeight());
        float f3 = (float) 1000;
        int coerceIn = (int) RangesKt.coerceIn(((2000.0f / ((float) previewSize.getWidth())) * ((float) calculateFocusRect.left)) - f3, -1000.0f, 800.0f);
        int coerceIn2 = (int) RangesKt.coerceIn((height * ((float) calculateFocusRect.height())) - f3, -1000.0f, 800.0f);
        return CollectionsKt.listOf(new Camera.Area(new Rect(coerceIn, coerceIn2, Math.min(coerceIn + 200, 1000), Math.min(coerceIn2 + 200, 1000)), 1000));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: co.infinum.goldeneye.models.Size} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p033co.infinum.goldeneye.models.Size findBestMatchingSize(p033co.infinum.goldeneye.models.Size r6, java.util.List<p033co.infinum.goldeneye.models.Size> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "referenceSize"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            java.lang.String r0 = "availableSizes"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
            r0 = r7
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            r3 = r1
            co.infinum.goldeneye.models.Size r3 = (p033co.infinum.goldeneye.models.Size) r3
            float r3 = r3.getAspectRatio()
            float r4 = r6.getAspectRatio()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x002e
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            if (r3 == 0) goto L_0x0012
            goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            co.infinum.goldeneye.models.Size r1 = (p033co.infinum.goldeneye.models.Size) r1
            if (r1 == 0) goto L_0x0038
            goto L_0x003f
        L_0x0038:
            java.lang.Object r6 = kotlin.collections.CollectionsKt.getOrNull(r7, r2)
            r1 = r6
            co.infinum.goldeneye.models.Size r1 = (p033co.infinum.goldeneye.models.Size) r1
        L_0x003f:
            if (r1 == 0) goto L_0x0042
            goto L_0x0048
        L_0x0042:
            co.infinum.goldeneye.models.Size$Companion r6 = p033co.infinum.goldeneye.models.Size.Companion
            co.infinum.goldeneye.models.Size r1 = r6.getUNKNOWN()
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p033co.infinum.goldeneye.utils.CameraUtils.findBestMatchingSize(co.infinum.goldeneye.models.Size, java.util.List):co.infinum.goldeneye.models.Size");
    }

    private final boolean touchNotInPreview(int i, int i2, float f, float f2, float f3, float f4) {
        float f5 = (float) 2;
        float max = Math.max(0.0f, (((float) i) - f) / f5);
        float max2 = Math.max(0.0f, (((float) i2) - f2) / f5);
        return f3 < max || f3 > max + f || f4 < max2 || f4 > max2 + f2;
    }

    private final Triple<Float, Float, Float> calculateScale(Activity activity, TextureView textureView, CameraConfig cameraConfig) {
        int i;
        float f;
        int i2;
        float f2;
        float f3;
        Size previewSize = cameraConfig.getPreviewSize();
        int calculateDisplayOrientation = calculateDisplayOrientation(activity, cameraConfig) % 180;
        if (calculateDisplayOrientation == 0) {
            f = (float) textureView.getWidth();
            i = previewSize.getWidth();
        } else {
            f = (float) textureView.getWidth();
            i = previewSize.getHeight();
        }
        float f4 = f / ((float) i);
        if (calculateDisplayOrientation == 0) {
            f2 = (float) textureView.getHeight();
            i2 = previewSize.getHeight();
        } else {
            f2 = (float) textureView.getHeight();
            i2 = previewSize.getWidth();
        }
        float f5 = f2 / ((float) i2);
        int i3 = WhenMappings.$EnumSwitchMapping$0[cameraConfig.getPreviewScale().ordinal()];
        if (i3 == 1 || i3 == 2) {
            f3 = Math.max(f4, f5);
        } else if (i3 == 3 || i3 == 4) {
            f3 = Math.min(f4, f5);
        } else if (i3 == 5) {
            f3 = 1.0f;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return new Triple<>(Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f3));
    }

    private final int getDeviceOrientation(Activity activity) {
        WindowManager windowManager = activity.getWindowManager();
        Intrinsics.checkExpressionValueIsNotNull(windowManager, "activity.windowManager");
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Intrinsics.checkExpressionValueIsNotNull(defaultDisplay, "activity.windowManager.defaultDisplay");
        int rotation = defaultDisplay.getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    private final Rect calculateFocusRect(Activity activity, TextureView textureView, CameraConfig cameraConfig, float f, float f2) {
        float f3;
        float f4;
        float f5;
        float floatValue = calculateScale(activity, textureView, cameraConfig).component3().floatValue();
        int calculateDisplayOrientation = calculateDisplayOrientation(activity, cameraConfig);
        Size previewSize = cameraConfig.getPreviewSize();
        Size size = new Size(textureView.getWidth(), textureView.getHeight());
        float width = ((float) previewSize.getWidth()) * floatValue;
        float height = ((float) previewSize.getHeight()) * floatValue;
        int i = calculateDisplayOrientation % 180;
        int width2 = i == 0 ? size.getWidth() : size.getHeight();
        int height2 = i == 0 ? size.getHeight() : size.getWidth();
        if (calculateDisplayOrientation != 90) {
            if (calculateDisplayOrientation == 180) {
                f5 = ((float) size.getWidth()) - f;
            } else if (calculateDisplayOrientation != 270) {
                f3 = f;
            } else {
                f5 = ((float) size.getHeight()) - f2;
            }
            f3 = f5;
        } else {
            f3 = f2;
        }
        if (calculateDisplayOrientation == 90) {
            f4 = ((float) size.getWidth()) - f;
        } else if (calculateDisplayOrientation != 180) {
            f4 = calculateDisplayOrientation != 270 ? f2 : f;
        } else {
            f4 = ((float) size.getHeight()) - f2;
        }
        if (touchNotInPreview(width2, height2, width, height, f3, f4)) {
            return null;
        }
        float f6 = (float) 2;
        float max = f3 - Math.max(0.0f, (((float) width2) - width) / f6);
        float max2 = f4 - Math.max(0.0f, (((float) height2) - height) / f6);
        float width3 = ((float) previewSize.getWidth()) * 0.1f;
        float height3 = ((float) previewSize.getHeight()) * 0.1f;
        int coerceIn = (int) RangesKt.coerceIn((max / floatValue) - (width3 / f6), 0.0f, ((float) previewSize.getWidth()) - width3);
        int coerceIn2 = (int) RangesKt.coerceIn((max2 / floatValue) - (height3 / f6), 0.0f, ((float) previewSize.getHeight()) - height3);
        return new Rect(coerceIn, coerceIn2, Math.min(((int) width3) + coerceIn, previewSize.getWidth() - 1), Math.min(((int) height3) + coerceIn2, previewSize.getHeight() - 1));
    }

    public final Rect calculateCamera2ZoomRect(Camera2ConfigImpl camera2ConfigImpl) {
        Rect rect;
        Intrinsics.checkParameterIsNotNull(camera2ConfigImpl, "config");
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) camera2ConfigImpl.getCharacteristics();
        if (cameraCharacteristics == null || (rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE)) == null) {
            return null;
        }
        float zoom = ((float) camera2ConfigImpl.getZoom()) / 100.0f;
        int width = (int) (((float) rect.width()) / zoom);
        int height = (int) (((float) rect.height()) / zoom);
        int width2 = (rect.width() - width) / 2;
        int height2 = (rect.height() - height) / 2;
        return new Rect(Math.max(0, width2), Math.max(0, height2), Math.min(width2 + width, rect.width() - 1), Math.min(height2 + height, rect.height() - 1));
    }
}
