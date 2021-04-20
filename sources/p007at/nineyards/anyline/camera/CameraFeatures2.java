package p007at.nineyards.anyline.camera;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.util.SizeF;
import java.util.ArrayList;
import java.util.List;
import p007at.nineyards.anyline.camera.CameraFeatures;
import p007at.nineyards.anyline.util.ArrayUtil;

/* renamed from: at.nineyards.anyline.camera.CameraFeatures2 */
public class CameraFeatures2 extends CameraFeatures {

    /* renamed from: a */
    private static final String f342a = CameraFeatures2.class.getSimpleName();
    protected float[] apertureSizes;
    protected String api2SupportLevel;
    protected List<AutoExposureMode> autoExposureModes;
    protected String cameraId;
    protected int[] faceDetectionModes;
    protected float[] focalLengths;
    protected final Float hyperFocalDistance;
    protected float maxDigitalZoom;
    protected Long maxExposureTime;
    protected Integer maxIso;
    protected Long minExposureTime;
    protected Float minFocusDistance;
    protected Integer minIso;
    protected boolean opticalStabilizationSupported;
    protected final SizeF sensorPhysicalSize;

    public CameraFeatures2(String str, CameraCharacteristics cameraCharacteristics) {
        float f;
        this.api2SupportLevel = "limited";
        this.maxDigitalZoom = 0.0f;
        this.opticalStabilizationSupported = false;
        this.cameraId = str;
        this.lensFacing = CameraFeatures.LensFacing.fromCamera2((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING));
        this.sensorOrientation = m107a(cameraCharacteristics, CameraCharacteristics.SENSOR_ORIENTATION, 0);
        int a = m107a(cameraCharacteristics, CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL, 2);
        if (a == 1) {
            this.api2SupportLevel = "full";
        } else if (a == 2) {
            this.api2SupportLevel = "legacy";
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr != null) {
            this.focusModes = new ArrayList(iArr.length);
            for (int fromCamera2 : iArr) {
                this.focusModes.add(CameraFeatures.FocusMode.fromCamera2(fromCamera2));
            }
        }
        int[] iArr2 = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_SCENE_MODES);
        if (iArr2 != null) {
            this.sceneModes = new ArrayList(iArr2.length);
            for (int fromCamera22 : iArr2) {
                this.sceneModes.add(CameraFeatures.SceneMode.fromCamera2(fromCamera22));
            }
        }
        this.flashSupported = Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE));
        this.maxFocusRegions = m107a(cameraCharacteristics, CameraCharacteristics.CONTROL_MAX_REGIONS_AF, 0);
        this.maxAutoExposureRegions = m107a(cameraCharacteristics, CameraCharacteristics.CONTROL_MAX_REGIONS_AE, 0);
        Float f2 = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f2 != null) {
            f = f2.floatValue();
        } else {
            f = 0.0f;
        }
        this.maxDigitalZoom = f;
        this.zoomSupported = this.maxDigitalZoom > 0.0f;
        this.faceDetectionModes = (int[]) cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES);
        this.faceDetectionSupported = this.faceDetectionModes.length > 1;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        int[] outputFormats = streamConfigurationMap.getOutputFormats();
        this.outputFormats = new ArrayList(outputFormats.length);
        for (int fromImageFormat : outputFormats) {
            this.outputFormats.add(CameraFeatures.OutputFormat.fromImageFormat(fromImageFormat));
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        if (outputSizes != null) {
            this.previewSizes = new ArrayList(outputSizes.length);
            for (Size cameraSize : outputSizes) {
                this.previewSizes.add(new CameraSize(cameraSize));
            }
        }
        Size[] outputSizes2 = streamConfigurationMap.getOutputSizes(35);
        if (outputSizes2 != null) {
            this.pictureSizes = new ArrayList(outputSizes2.length);
            for (Size cameraSize2 : outputSizes2) {
                this.pictureSizes.add(new CameraSize(cameraSize2));
            }
        }
        Size[] outputSizes3 = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
        if (outputSizes3 != null) {
            this.videoSizes = new ArrayList(outputSizes3.length);
            for (Size cameraSize3 : outputSizes3) {
                this.videoSizes.add(new CameraSize(cameraSize3));
            }
        }
        int[] iArr3 = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        this.videoStabilizationSupported = iArr3 != null && ArrayUtil.contains(iArr3, 1);
        int[] iArr4 = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        this.opticalStabilizationSupported = iArr4 != null && ArrayUtil.contains(iArr4, 1);
        this.fpsRanges = CameraFeatures.FpsRange.getRangesFromCamera2((Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
        Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        this.minExposure = ((Integer) range.getLower()).intValue();
        this.maxExposure = ((Integer) range.getUpper()).intValue();
        this.exposureStep = ((Rational) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP)).floatValue();
        if (Build.VERSION.SDK_INT >= 23) {
            this.autoExposureLockSupported = ((Boolean) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_LOCK_AVAILABLE)).booleanValue();
        } else {
            this.autoExposureLockSupported = true;
        }
        Range range2 = (Range) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE);
        if (range2 != null) {
            this.minIso = (Integer) range2.getLower();
            this.maxIso = (Integer) range2.getUpper();
        }
        Range range3 = (Range) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE);
        if (range3 != null) {
            this.minExposureTime = (Long) range3.getLower();
            this.maxExposureTime = (Long) range3.getUpper();
        }
        this.minFocusDistance = (Float) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        this.focalLengths = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        this.apertureSizes = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
        this.hyperFocalDistance = (Float) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_HYPERFOCAL_DISTANCE);
        this.sensorPhysicalSize = (SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        int[] iArr5 = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        this.autoExposureModes = new ArrayList(outputFormats.length);
        for (int fromCamera23 : iArr5) {
            this.autoExposureModes.add(AutoExposureMode.fromCamera2(fromCamera23));
        }
    }

    protected CameraFeatures2() {
        this.api2SupportLevel = "limited";
        this.maxDigitalZoom = 0.0f;
        this.opticalStabilizationSupported = false;
        this.hyperFocalDistance = Float.valueOf(0.0f);
        this.sensorPhysicalSize = new SizeF(0.0f, 0.0f);
    }

    public boolean isOpticalStabilizationSupported() {
        return this.opticalStabilizationSupported;
    }

    public static CameraFeatures2[] getForAllCameras(Context context) throws CameraAccessException {
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        String[] cameraIdList = cameraManager.getCameraIdList();
        CameraFeatures2[] cameraFeatures2Arr = new CameraFeatures2[cameraIdList.length];
        for (int i = 0; i < cameraIdList.length; i++) {
            cameraFeatures2Arr[i] = new CameraFeatures2(cameraIdList[i], cameraManager.getCameraCharacteristics(cameraIdList[i]));
        }
        return cameraFeatures2Arr;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.hardware.camera2.CameraCharacteristics$Key, android.hardware.camera2.CameraCharacteristics$Key<java.lang.Integer>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m107a(android.hardware.camera2.CameraCharacteristics r0, android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> r1, int r2) {
        /*
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x000d
            int r0 = r0.intValue()
            return r0
        L_0x000d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.camera.CameraFeatures2.m107a(android.hardware.camera2.CameraCharacteristics, android.hardware.camera2.CameraCharacteristics$Key, int):int");
    }

    /* renamed from: at.nineyards.anyline.camera.CameraFeatures2$AutoExposureMode */
    public enum AutoExposureMode {
        OFF("OFF"),
        ON("ON"),
        ON_AUTO_FLASH("ON_AUTO_FLASH"),
        ON_ALWAYS_FLASH("ON_ALWAYS_FLASH"),
        ON_AUTO_FLASH_REDEYE("ON_AUTO_FLASH_REDEYE");
        

        /* renamed from: a */
        private final String f346a;

        private AutoExposureMode(String str) {
            this.f346a = str;
        }

        public final String toString() {
            return this.f346a;
        }

        public static AutoExposureMode fromCamera2(int i) {
            if (i == 0) {
                return OFF;
            }
            if (i == 1) {
                return ON;
            }
            if (i == 2) {
                return ON_AUTO_FLASH;
            }
            if (i == 3) {
                return ON_ALWAYS_FLASH;
            }
            if (i != 4) {
                return ON;
            }
            return ON_AUTO_FLASH_REDEYE;
        }

        public final int toCamera2() {
            int i = C07551.f343a[ordinal()];
            if (i == 1) {
                return 1;
            }
            if (i == 2) {
                return 0;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4) {
                return i != 5 ? 1 : 4;
            }
            return 3;
        }
    }

    /* renamed from: at.nineyards.anyline.camera.CameraFeatures2$1 */
    static /* synthetic */ class C07551 {

        /* renamed from: a */
        static final /* synthetic */ int[] f343a = new int[AutoExposureMode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                at.nineyards.anyline.camera.CameraFeatures2$AutoExposureMode[] r0 = p007at.nineyards.anyline.camera.CameraFeatures2.AutoExposureMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f343a = r0
                int[] r0 = f343a     // Catch:{ NoSuchFieldError -> 0x0014 }
                at.nineyards.anyline.camera.CameraFeatures2$AutoExposureMode r1 = p007at.nineyards.anyline.camera.CameraFeatures2.AutoExposureMode.ON     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f343a     // Catch:{ NoSuchFieldError -> 0x001f }
                at.nineyards.anyline.camera.CameraFeatures2$AutoExposureMode r1 = p007at.nineyards.anyline.camera.CameraFeatures2.AutoExposureMode.OFF     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f343a     // Catch:{ NoSuchFieldError -> 0x002a }
                at.nineyards.anyline.camera.CameraFeatures2$AutoExposureMode r1 = p007at.nineyards.anyline.camera.CameraFeatures2.AutoExposureMode.ON_AUTO_FLASH     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f343a     // Catch:{ NoSuchFieldError -> 0x0035 }
                at.nineyards.anyline.camera.CameraFeatures2$AutoExposureMode r1 = p007at.nineyards.anyline.camera.CameraFeatures2.AutoExposureMode.ON_ALWAYS_FLASH     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f343a     // Catch:{ NoSuchFieldError -> 0x0040 }
                at.nineyards.anyline.camera.CameraFeatures2$AutoExposureMode r1 = p007at.nineyards.anyline.camera.CameraFeatures2.AutoExposureMode.ON_AUTO_FLASH_REDEYE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.camera.CameraFeatures2.C07551.<clinit>():void");
        }
    }
}
