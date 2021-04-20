package p007at.nineyards.anyline.camera;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.EnumSet;
import java.util.List;
import kotlinx.coroutines.DebugKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.fragments.providerService.ProviderServiceFragment;

/* renamed from: at.nineyards.anyline.camera.CameraFeatures */
public abstract class CameraFeatures {

    /* renamed from: a */
    private static String f327a = CameraFeatures.class.getSimpleName();
    protected boolean autoExposureLockSupported = false;
    protected boolean canDisableShutterSound = false;
    protected float exposureStep = 0.0f;
    protected boolean faceDetectionSupported = false;
    protected boolean flashSupported = false;
    protected List<FocusMode> focusModes;
    protected FpsRange[] fpsRanges;
    protected LensFacing lensFacing = LensFacing.UNDEFINED;
    protected int maxAutoExposureRegions = 0;
    protected int maxExposure = 0;
    protected int maxFocusRegions = 0;
    protected int minExposure = 0;
    protected List<OutputFormat> outputFormats;
    protected List<CameraSize> pictureSizes;
    protected List<CameraSize> previewSizes;
    protected List<SceneMode> sceneModes = null;
    protected int sensorOrientation = 0;
    protected List<CameraSize> videoSizes = null;
    protected boolean videoStabilizationSupported = false;
    protected boolean zoomSupported = false;

    public static boolean hasCameraApi2Support(Context context, LensFacing lensFacing2) {
        if (!m105a()) {
            return false;
        }
        CameraManager cameraManager = (CameraManager) context.getApplicationContext().getSystemService("camera");
        try {
            for (String cameraCharacteristics : cameraManager.getCameraIdList()) {
                CameraCharacteristics cameraCharacteristics2 = cameraManager.getCameraCharacteristics(cameraCharacteristics);
                Integer num = (Integer) cameraCharacteristics2.get(CameraCharacteristics.LENS_FACING);
                if (num != null && LensFacing.fromCamera2(num) == lensFacing2 && m106a(cameraCharacteristics2)) {
                    return true;
                }
            }
        } catch (CameraAccessException e) {
            Log.d(f327a, "Error while evaluating camera 2 support: " + e.getMessage());
        }
        return false;
    }

    public static boolean allCamerasHaveApi2Support(Context context) {
        if (!m105a()) {
            return false;
        }
        CameraManager cameraManager = (CameraManager) context.getApplicationContext().getSystemService("camera");
        try {
            for (String cameraCharacteristics : cameraManager.getCameraIdList()) {
                if (!m106a(cameraManager.getCameraCharacteristics(cameraCharacteristics))) {
                    return false;
                }
            }
            return true;
        } catch (CameraAccessException e) {
            Log.d(f327a, "Error while evaluating camera 2 support: " + e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m106a(CameraCharacteristics cameraCharacteristics) {
        if (!m105a()) {
            return false;
        }
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        if (intValue == 2) {
            if (intValue == 0) {
                return true;
            }
            return false;
        } else if (intValue >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m105a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public LensFacing getLensFacing() {
        return this.lensFacing;
    }

    public int getSensorOrientation() {
        return this.sensorOrientation;
    }

    public List<FocusMode> getFocusModes() {
        return this.focusModes;
    }

    public List<SceneMode> getSceneModes() {
        return this.sceneModes;
    }

    public List<CameraSize> getPreviewSizes() {
        return this.previewSizes;
    }

    public List<CameraSize> getPictureSizes() {
        return this.pictureSizes;
    }

    public List<CameraSize> getVideoSizes() {
        return this.videoSizes;
    }

    public boolean isFlashSupported() {
        return this.flashSupported;
    }

    public int getMaxFocusRegions() {
        return this.maxFocusRegions;
    }

    public int getMaxAutoExposureRegions() {
        return this.maxAutoExposureRegions;
    }

    public boolean isVideoStabilizationSupported() {
        return this.videoStabilizationSupported;
    }

    public FpsRange[] getFpsRanges() {
        return this.fpsRanges;
    }

    public FpsRange getMaxFpsRange() {
        FpsRange fpsRange = null;
        for (FpsRange fpsRange2 : this.fpsRanges) {
            if (fpsRange == null || fpsRange2.getUpper() > fpsRange.getUpper() || (fpsRange2.getUpper() == fpsRange.getUpper() && fpsRange2.getLower() > fpsRange.getLower())) {
                fpsRange = fpsRange2;
            }
        }
        return fpsRange;
    }

    public int getMinExposure() {
        return this.minExposure;
    }

    public int getMaxExposure() {
        return this.maxExposure;
    }

    public float getExposureStep() {
        return this.exposureStep;
    }

    public String toString() {
        Field[] declaredFields = getClass().getDeclaredFields();
        Field[] declaredFields2 = getClass().getSuperclass().getDeclaredFields();
        JSONObject jSONObject = new JSONObject();
        m104a(jSONObject, declaredFields);
        m104a(jSONObject, declaredFields2);
        return jSONObject.toString();
    }

    /* renamed from: a */
    private void m104a(JSONObject jSONObject, Field[] fieldArr) {
        try {
            for (Field field : fieldArr) {
                if (field.getModifiers() == 4) {
                    field.setAccessible(true);
                    String name = field.getName();
                    Class<?> type = field.getType();
                    Object obj = field.get(this);
                    if (obj != null) {
                        if (List.class.isAssignableFrom(type)) {
                            JSONArray jSONArray = new JSONArray();
                            for (int i = 0; i < ((List) obj).size(); i++) {
                                jSONArray.put(((List) obj).get(i));
                            }
                            jSONObject.put(name, jSONArray);
                        } else if (obj.getClass().isArray()) {
                            JSONArray jSONArray2 = new JSONArray();
                            int length = Array.getLength(obj);
                            for (int i2 = 0; i2 < length; i2++) {
                                jSONArray2.put(Array.get(obj, i2));
                            }
                            jSONObject.put(name, jSONArray2);
                        } else {
                            jSONObject.put(name, obj);
                        }
                    }
                }
            }
        } catch (IllegalAccessException e) {
            new StringBuilder("could not access field: ").append(e.getMessage());
        } catch (JSONException e2) {
            new StringBuilder("JsonException ").append(e2.getMessage());
        }
    }

    /* renamed from: at.nineyards.anyline.camera.CameraFeatures$FocusMode */
    public enum FocusMode {
        AUTO("auto"),
        MACRO("macro"),
        CONTINUOUS_PICTURE("continuous-picture"),
        CONTINUOUS_VIDEO("continuous-video"),
        EDOF("edof"),
        FIXED("fixed"),
        INFINITY("infinity"),
        OFF(DebugKt.DEBUG_PROPERTY_VALUE_OFF);
        

        /* renamed from: a */
        private final String f332a;

        private FocusMode(String str) {
            this.f332a = str;
        }

        public static FocusMode fromCamera1(String str) {
            for (FocusMode focusMode : values()) {
                if (focusMode.f332a.equals(str)) {
                    return focusMode;
                }
            }
            return AUTO;
        }

        public static FocusMode fromCamera2(int i) {
            if (i == 0) {
                return OFF;
            }
            if (i == 1) {
                return AUTO;
            }
            if (i == 2) {
                return MACRO;
            }
            if (i == 3) {
                return CONTINUOUS_VIDEO;
            }
            if (i == 4) {
                return CONTINUOUS_PICTURE;
            }
            if (i != 5) {
                return AUTO;
            }
            return EDOF;
        }

        public final String toString() {
            return this.f332a;
        }

        public final String toCamera1() {
            if (this == OFF) {
                return "fixed";
            }
            return this.f332a;
        }

        public final int toCamera2() {
            switch (this) {
                case AUTO:
                    return 1;
                case MACRO:
                    return 2;
                case CONTINUOUS_PICTURE:
                    return 4;
                case CONTINUOUS_VIDEO:
                    return 3;
                case EDOF:
                    return 5;
                case OFF:
                case FIXED:
                case INFINITY:
                    return 0;
                default:
                    return 1;
            }
        }
    }

    /* renamed from: at.nineyards.anyline.camera.CameraFeatures$SceneMode */
    public enum SceneMode {
        DISABLED(ProviderServiceFragment.PRODUCT_STATE_DISABLED),
        AUTO("auto"),
        ACTION("action"),
        SPORTS("sports"),
        STEADYPHOTO("steadyphoto"),
        BARCODE("barcode"),
        NIGHT("night"),
        PARTY("party"),
        BEACH("beach"),
        CANDLELIGHT("candlelight"),
        FACE_PRIORITY("face-priority"),
        FIREWORKS("fireworks"),
        HDR("hdr"),
        LANDSCAPE("landscape"),
        NIGHT_PORTRAI("night-portrait"),
        PORTRAIT("portrait"),
        SNOW("snow"),
        SUNSET("sunset"),
        THEATRE("theatre"),
        NON_STANDARD("none-standard");
        

        /* renamed from: a */
        private final String f340a;

        private SceneMode(String str) {
            this.f340a = str;
        }

        public static SceneMode fromCamera1(String str) {
            for (SceneMode sceneMode : values()) {
                if (sceneMode.f340a.equals(str)) {
                    return sceneMode;
                }
            }
            return NON_STANDARD;
        }

        public static SceneMode fromCamera2(int i) {
            switch (i) {
                case 0:
                    return DISABLED;
                case 1:
                    return FACE_PRIORITY;
                case 2:
                    return ACTION;
                case 3:
                    return PORTRAIT;
                case 4:
                    return LANDSCAPE;
                case 5:
                    return NIGHT;
                case 6:
                    return NIGHT_PORTRAI;
                case 7:
                    return THEATRE;
                case 8:
                    return BEACH;
                case 9:
                    return SNOW;
                case 10:
                    return SUNSET;
                case 11:
                    return STEADYPHOTO;
                case 12:
                    return FIREWORKS;
                case 13:
                    return SPORTS;
                case 14:
                    return PARTY;
                case 15:
                    return CANDLELIGHT;
                case 16:
                    return BARCODE;
                case 18:
                    return HDR;
                default:
                    return NON_STANDARD;
            }
        }

        public final String toString() {
            return this.f340a;
        }

        public final String toCamera1() {
            return (this == DISABLED || this == FACE_PRIORITY || this == NON_STANDARD) ? "auto" : this.f340a;
        }

        public final int toCamera2() {
            switch (this) {
                case ACTION:
                    return 2;
                case BARCODE:
                    return 16;
                case BEACH:
                    return 8;
                case CANDLELIGHT:
                    return 15;
                case DISABLED:
                    return 0;
                case FACE_PRIORITY:
                    return 1;
                case FIREWORKS:
                    return 12;
                case HDR:
                    return 18;
                case LANDSCAPE:
                    return 4;
                case NIGHT:
                    return 5;
                case NIGHT_PORTRAI:
                    return 6;
                case PARTY:
                    return 14;
                case PORTRAIT:
                    return 3;
                case SNOW:
                    return 9;
                case SPORTS:
                    return 13;
                case STEADYPHOTO:
                    return 11;
                case SUNSET:
                    return 10;
                case THEATRE:
                    return 7;
                default:
                    return 0;
            }
        }
    }

    /* renamed from: at.nineyards.anyline.camera.CameraFeatures$OutputFormat */
    public enum OutputFormat {
        DEPTH16("DEPTH16"),
        DEPTH_POINT_CLOUD("DEPTH_POINT_CLOUD"),
        FLEX_RGB_888("FLEX_RGB_888"),
        FLEX_RGBA_8888("FLEX_RGBA_8888"),
        JPEG("JPEG"),
        NV16("NV16"),
        NV21("NV21"),
        PRIVATE("PRIVATE"),
        RAW10("RAW10"),
        RAW12("RAW12"),
        RAW_SENSOR("RAW_SENSOR"),
        RGB_565("RGB_565"),
        UNKNOWN("UNKNOWN"),
        YUV_420_888("YUV_420_888"),
        YUV_422_888("YUV_422_888"),
        YUV_444_888("YUV_444_888"),
        YUY2("YUY2"),
        YV12("YV12");
        

        /* renamed from: a */
        private final String f338a;

        private OutputFormat(String str) {
            this.f338a = str;
        }

        public static OutputFormat fromImageFormat(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 4) {
                return RGB_565;
            }
            if (i == 20) {
                return YUY2;
            }
            if (i == 32) {
                return RAW_SENSOR;
            }
            if (i == 842094169) {
                return YV12;
            }
            if (i == 1144402265) {
                return DEPTH16;
            }
            if (i == 16) {
                return NV16;
            }
            if (i == 17) {
                return NV21;
            }
            if (i == 34) {
                return PRIVATE;
            }
            if (i == 35) {
                return YUV_420_888;
            }
            if (i == 256) {
                return JPEG;
            }
            if (i == 257) {
                return DEPTH_POINT_CLOUD;
            }
            switch (i) {
                case 37:
                    return RAW10;
                case 38:
                    return RAW12;
                case 39:
                    return YUV_422_888;
                case 40:
                    return YUV_444_888;
                case 41:
                    return FLEX_RGB_888;
                case 42:
                    return FLEX_RGBA_8888;
                default:
                    return UNKNOWN;
            }
        }

        public final String toString() {
            return this.f338a;
        }

        public final int toImageFormat() {
            switch (this) {
                case DEPTH16:
                    return 1144402265;
                case DEPTH_POINT_CLOUD:
                    return 257;
                case FLEX_RGB_888:
                    return 41;
                case FLEX_RGBA_8888:
                    return 42;
                case JPEG:
                    return 256;
                case NV16:
                    return 16;
                case NV21:
                    return 17;
                case PRIVATE:
                    return 34;
                case RAW10:
                    return 37;
                case RAW12:
                    return 38;
                case RAW_SENSOR:
                    return 32;
                case RGB_565:
                    return 4;
                case YUV_420_888:
                    return 35;
                case YUV_422_888:
                    return 39;
                case YUV_444_888:
                    return 40;
                case YUY2:
                    return 20;
                case YV12:
                    return 842094169;
                default:
                    return 0;
            }
        }
    }

    /* renamed from: at.nineyards.anyline.camera.CameraFeatures$LensFacing */
    public enum LensFacing {
        UNDEFINED(0),
        BACK(1),
        FRONT(2),
        EXTERNAL(4);
        

        /* renamed from: a */
        private int f336a;

        private LensFacing(int i) {
            this.f336a = i;
        }

        public static LensFacing fromBitFlag(int i) {
            if (i == 1) {
                return BACK;
            }
            if (i == 2) {
                return FRONT;
            }
            if (i != 4) {
                return UNDEFINED;
            }
            return EXTERNAL;
        }

        public static LensFacing fromCamera1(int i) {
            if (i == 0) {
                return BACK;
            }
            if (i != 1) {
                return UNDEFINED;
            }
            return FRONT;
        }

        public static LensFacing fromCamera2(Integer num) {
            int intValue = num.intValue();
            if (intValue == 0) {
                return FRONT;
            }
            if (intValue == 1) {
                return BACK;
            }
            if (intValue != 2) {
                return UNDEFINED;
            }
            return EXTERNAL;
        }

        public static EnumSet<LensFacing> fromBitFlags(int i) {
            EnumSet<LensFacing> noneOf = EnumSet.noneOf(LensFacing.class);
            LensFacing lensFacing = BACK;
            int i2 = lensFacing.f336a;
            if ((i & i2) == i2) {
                noneOf.add(lensFacing);
            }
            LensFacing lensFacing2 = FRONT;
            int i3 = lensFacing2.f336a;
            if ((i & i3) == i3) {
                noneOf.add(lensFacing2);
            }
            LensFacing lensFacing3 = EXTERNAL;
            int i4 = lensFacing3.f336a;
            if ((i & i4) == i4) {
                noneOf.add(lensFacing3);
            }
            return noneOf;
        }
    }

    /* renamed from: at.nineyards.anyline.camera.CameraFeatures$FpsRange */
    public static class FpsRange {

        /* renamed from: a */
        private final int f333a;

        /* renamed from: b */
        private final int f334b;

        public FpsRange(int i, int i2) {
            this.f333a = i;
            this.f334b = i2;
        }

        public static FpsRange[] getRangesFromCamera1(List<int[]> list) {
            FpsRange[] fpsRangeArr = new FpsRange[list.size()];
            for (int i = 0; i < fpsRangeArr.length; i++) {
                int[] iArr = list.get(i);
                fpsRangeArr[i] = new FpsRange(iArr[0], iArr[1]);
            }
            return fpsRangeArr;
        }

        public static FpsRange[] getRangesFromCamera2(Range<Integer>[] rangeArr) {
            FpsRange[] fpsRangeArr = new FpsRange[rangeArr.length];
            for (int i = 0; i < fpsRangeArr.length; i++) {
                fpsRangeArr[i] = new FpsRange(rangeArr[i].getLower().intValue() * 1000, rangeArr[i].getUpper().intValue() * 1000);
            }
            return fpsRangeArr;
        }

        public int getLower() {
            return this.f333a;
        }

        public int getUpper() {
            return this.f334b;
        }

        public String toString() {
            return String.format("%s-%s", new Object[]{Integer.valueOf(this.f333a), Integer.valueOf(this.f334b)});
        }

        public Range<Integer> toCamera2() {
            return new Range<>(Integer.valueOf(this.f333a / 1000), Integer.valueOf(this.f334b / 1000));
        }
    }
}
