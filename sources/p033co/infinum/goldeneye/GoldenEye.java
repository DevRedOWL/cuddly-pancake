package p033co.infinum.goldeneye;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import android.view.TextureView;
import com.facebook.react.uimanager.ViewProps;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.PictureTransformation;
import p033co.infinum.goldeneye.config.CameraConfig;
import p033co.infinum.goldeneye.config.CameraInfo;
import p033co.infinum.goldeneye.models.CameraApi;
import p033co.infinum.goldeneye.utils.IncompatibleDevicesUtils;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 %2\u00020\u0001:\u0002$%JV\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u0011H'J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H'J\b\u0010\u0018\u001a\u00020\fH&J8\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u0011H&J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\fH&JB\u0010\u001f\u001a\u00020\f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f0\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u00112\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013H&J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020#H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006&"}, mo51343d2 = {"Lco/infinum/goldeneye/GoldenEye;", "", "availableCameras", "", "Lco/infinum/goldeneye/config/CameraInfo;", "getAvailableCameras", "()Ljava/util/List;", "config", "Lco/infinum/goldeneye/config/CameraConfig;", "getConfig", "()Lco/infinum/goldeneye/config/CameraConfig;", "open", "", "textureView", "Landroid/view/TextureView;", "cameraInfo", "onReady", "Lkotlin/Function1;", "onActive", "Lkotlin/Function0;", "onError", "", "callback", "Lco/infinum/goldeneye/InitCallback;", "release", "startRecording", "file", "Ljava/io/File;", "onVideoRecorded", "Lco/infinum/goldeneye/VideoCallback;", "stopRecording", "takePicture", "onPictureTaken", "Landroid/graphics/Bitmap;", "onShutter", "Lco/infinum/goldeneye/PictureCallback;", "Builder", "Companion", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.GoldenEye */
/* compiled from: GoldenEye.kt */
public interface GoldenEye {
    public static final Companion Companion = Companion.$$INSTANCE;

    List<CameraInfo> getAvailableCameras();

    CameraConfig getConfig();

    void open(TextureView textureView, CameraInfo cameraInfo, InitCallback initCallback);

    void open(TextureView textureView, CameraInfo cameraInfo, Function1<? super CameraConfig, Unit> function1, Function0<Unit> function0, Function1<? super Throwable, Unit> function12);

    void release();

    void startRecording(File file, VideoCallback videoCallback);

    void startRecording(File file, Function1<? super File, Unit> function1, Function1<? super Throwable, Unit> function12);

    void stopRecording();

    void takePicture(PictureCallback pictureCallback);

    void takePicture(Function1<? super Bitmap, Unit> function1, Function1<? super Throwable, Unit> function12, Function0<Unit> function0);

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\n"}, mo51343d2 = {"Lco/infinum/goldeneye/GoldenEye$Companion;", "", "()V", "isLegacyCamera", "", "context", "Landroid/content/Context;", "preferredCameraApi", "Lco/infinum/goldeneye/models/CameraApi;", "shouldUseCamera2Api", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
    /* renamed from: co.infinum.goldeneye.GoldenEye$Companion */
    /* compiled from: GoldenEye.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CameraApi preferredCameraApi(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return shouldUseCamera2Api(context) ? CameraApi.CAMERA2 : CameraApi.CAMERA1;
        }

        private final boolean shouldUseCamera2Api(Context context) {
            if (Build.VERSION.SDK_INT >= 21 && !isLegacyCamera(context)) {
                IncompatibleDevicesUtils incompatibleDevicesUtils = IncompatibleDevicesUtils.INSTANCE;
                String str = Build.MODEL;
                Intrinsics.checkExpressionValueIsNotNull(str, "Build.MODEL");
                if (!incompatibleDevicesUtils.isIncompatibleDevice(str)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.util.Collection} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.util.List} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0076 A[Catch:{ all -> 0x008a }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0082 A[Catch:{ all -> 0x008a }] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0083 A[Catch:{ all -> 0x008a }] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0061 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final boolean isLegacyCamera(android.content.Context r8) {
            /*
                r7 = this;
                r0 = 0
                java.lang.String r1 = "camera"
                java.lang.Object r8 = r8.getSystemService(r1)     // Catch:{ all -> 0x008a }
                boolean r1 = r8 instanceof android.hardware.camera2.CameraManager     // Catch:{ all -> 0x008a }
                r2 = 0
                if (r1 != 0) goto L_0x000d
                r8 = r2
            L_0x000d:
                android.hardware.camera2.CameraManager r8 = (android.hardware.camera2.CameraManager) r8     // Catch:{ all -> 0x008a }
                if (r8 == 0) goto L_0x0033
                java.lang.String[] r1 = r8.getCameraIdList()     // Catch:{ all -> 0x008a }
                if (r1 == 0) goto L_0x0033
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x008a }
                int r4 = r1.length     // Catch:{ all -> 0x008a }
                r3.<init>(r4)     // Catch:{ all -> 0x008a }
                java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ all -> 0x008a }
                int r4 = r1.length     // Catch:{ all -> 0x008a }
                r5 = 0
            L_0x0021:
                if (r5 >= r4) goto L_0x002f
                r6 = r1[r5]     // Catch:{ all -> 0x008a }
                android.hardware.camera2.CameraCharacteristics r6 = r8.getCameraCharacteristics(r6)     // Catch:{ all -> 0x008a }
                r3.add(r6)     // Catch:{ all -> 0x008a }
                int r5 = r5 + 1
                goto L_0x0021
            L_0x002f:
                r8 = r3
                java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x008a }
                goto L_0x0034
            L_0x0033:
                r8 = r2
            L_0x0034:
                r1 = 1
                if (r8 == 0) goto L_0x006a
                r3 = r8
                java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ all -> 0x008a }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x008a }
            L_0x003e:
                boolean r4 = r3.hasNext()     // Catch:{ all -> 0x008a }
                if (r4 == 0) goto L_0x0062
                java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x008a }
                r5 = r4
                android.hardware.camera2.CameraCharacteristics r5 = (android.hardware.camera2.CameraCharacteristics) r5     // Catch:{ all -> 0x008a }
                android.hardware.camera2.CameraCharacteristics$Key r6 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch:{ all -> 0x008a }
                java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x008a }
                java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x008a }
                if (r5 != 0) goto L_0x0056
                goto L_0x005e
            L_0x0056:
                int r5 = r5.intValue()     // Catch:{ all -> 0x008a }
                if (r5 != r1) goto L_0x005e
                r5 = 1
                goto L_0x005f
            L_0x005e:
                r5 = 0
            L_0x005f:
                if (r5 == 0) goto L_0x003e
                goto L_0x0063
            L_0x0062:
                r4 = r2
            L_0x0063:
                r3 = r4
                android.hardware.camera2.CameraCharacteristics r3 = (android.hardware.camera2.CameraCharacteristics) r3     // Catch:{ all -> 0x008a }
                if (r3 == 0) goto L_0x006a
                r8 = r3
                goto L_0x0074
            L_0x006a:
                if (r8 == 0) goto L_0x0073
                java.lang.Object r8 = r8.get(r0)     // Catch:{ all -> 0x008a }
                android.hardware.camera2.CameraCharacteristics r8 = (android.hardware.camera2.CameraCharacteristics) r8     // Catch:{ all -> 0x008a }
                goto L_0x0074
            L_0x0073:
                r8 = r2
            L_0x0074:
                if (r8 == 0) goto L_0x007f
                android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL     // Catch:{ all -> 0x008a }
                java.lang.Object r8 = r8.get(r2)     // Catch:{ all -> 0x008a }
                r2 = r8
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x008a }
            L_0x007f:
                r8 = 2
                if (r2 != 0) goto L_0x0083
                goto L_0x008a
            L_0x0083:
                int r2 = r2.intValue()     // Catch:{ all -> 0x008a }
                if (r2 != r8) goto L_0x008a
                r0 = 1
            L_0x008a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p033co.infinum.goldeneye.GoldenEye.Companion.isLegacyCamera(android.content.Context):boolean");
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 1, 13})
    /* renamed from: co.infinum.goldeneye.GoldenEye$DefaultImpls */
    /* compiled from: GoldenEye.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ void open$default(GoldenEye goldenEye, TextureView textureView, CameraInfo cameraInfo, Function1 function1, Function0 function0, Function1 function12, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    function1 = null;
                }
                Function1 function13 = function1;
                if ((i & 8) != 0) {
                    function0 = null;
                }
                goldenEye.open(textureView, cameraInfo, function13, function0, function12);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: open");
        }

        public static /* synthetic */ void takePicture$default(GoldenEye goldenEye, Function1 function1, Function1 function12, Function0 function0, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    function0 = null;
                }
                goldenEye.takePicture(function1, function12, function0);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takePicture");
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ.\u0010\u0014\u001a\u00020\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00180\u0016J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u001a\u0010\u001b\u001a\u00020\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00180\u0016J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\fJ\u001a\u0010\u001f\u001a\u00020\u00002\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00180\u0016J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000eJ&\u0010\"\u001a\u00020\u00002\u001e\u0010#\u001a\u001a\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020%0$J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0010J\u0006\u0010)\u001a\u00020\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, mo51343d2 = {"Lco/infinum/goldeneye/GoldenEye$Builder;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "advancedFeaturesEnabled", "", "cameraApi", "Lco/infinum/goldeneye/models/CameraApi;", "logger", "Lco/infinum/goldeneye/Logger;", "onFocusChangedCallback", "Lco/infinum/goldeneye/OnFocusChangedCallback;", "onZoomChangedCallback", "Lco/infinum/goldeneye/OnZoomChangedCallback;", "pictureTransformation", "Lco/infinum/goldeneye/PictureTransformation;", "build", "Lco/infinum/goldeneye/GoldenEye;", "setCameraApi", "setLogger", "onMessage", "Lkotlin/Function1;", "", "", "onThrowable", "", "setOnFocusChangedCallback", "onFocusChanged", "Landroid/graphics/Point;", "callback", "setOnZoomChangedCallback", "onZoomChanged", "", "setPictureTransformation", "transform", "Lkotlin/Function3;", "Landroid/graphics/Bitmap;", "Lco/infinum/goldeneye/config/CameraConfig;", "", "transformation", "withAdvancedFeatures", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
    /* renamed from: co.infinum.goldeneye.GoldenEye$Builder */
    /* compiled from: GoldenEye.kt */
    public static final class Builder {
        private final Activity activity;
        private boolean advancedFeaturesEnabled;
        private CameraApi cameraApi;
        private Logger logger;
        private OnFocusChangedCallback onFocusChangedCallback;
        private OnZoomChangedCallback onZoomChangedCallback;
        private PictureTransformation pictureTransformation = PictureTransformation.Default.INSTANCE;

        @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 1, 13})
        /* renamed from: co.infinum.goldeneye.GoldenEye$Builder$WhenMappings */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[CameraApi.values().length];

            static {
                $EnumSwitchMapping$0[CameraApi.CAMERA1.ordinal()] = 1;
                $EnumSwitchMapping$0[CameraApi.CAMERA2.ordinal()] = 2;
            }
        }

        public Builder(Activity activity2) {
            Intrinsics.checkParameterIsNotNull(activity2, "activity");
            this.activity = activity2;
        }

        public final Builder setLogger(Function1<? super String, Unit> function1, Function1<? super Throwable, Unit> function12) {
            Intrinsics.checkParameterIsNotNull(function1, "onMessage");
            Intrinsics.checkParameterIsNotNull(function12, "onThrowable");
            Builder builder = this;
            builder.logger = new GoldenEye$Builder$setLogger$$inlined$apply$lambda$1(function1, function12);
            return builder;
        }

        public final Builder setOnZoomChangedCallback(Function1<? super Integer, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "onZoomChanged");
            Builder builder = this;
            builder.onZoomChangedCallback = new C0994xe06c0f6d(function1);
            return builder;
        }

        public final Builder setOnFocusChangedCallback(Function1<? super Point, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "onFocusChanged");
            Builder builder = this;
            builder.onFocusChangedCallback = new C0993x685016c0(function1);
            return builder;
        }

        public final Builder setPictureTransformation(Function3<? super Bitmap, ? super CameraConfig, ? super Float, Bitmap> function3) {
            Intrinsics.checkParameterIsNotNull(function3, ViewProps.TRANSFORM);
            Builder builder = this;
            builder.pictureTransformation = new C0995xe3fb98ad(function3);
            return builder;
        }

        public final Builder setLogger(Logger logger2) {
            Intrinsics.checkParameterIsNotNull(logger2, "logger");
            Builder builder = this;
            builder.logger = logger2;
            return builder;
        }

        public final Builder setOnZoomChangedCallback(OnZoomChangedCallback onZoomChangedCallback2) {
            Intrinsics.checkParameterIsNotNull(onZoomChangedCallback2, "callback");
            Builder builder = this;
            builder.onZoomChangedCallback = onZoomChangedCallback2;
            return builder;
        }

        public final Builder setOnFocusChangedCallback(OnFocusChangedCallback onFocusChangedCallback2) {
            Intrinsics.checkParameterIsNotNull(onFocusChangedCallback2, "callback");
            Builder builder = this;
            builder.onFocusChangedCallback = onFocusChangedCallback2;
            return builder;
        }

        public final Builder setPictureTransformation(PictureTransformation pictureTransformation2) {
            Intrinsics.checkParameterIsNotNull(pictureTransformation2, "transformation");
            Builder builder = this;
            builder.pictureTransformation = pictureTransformation2;
            return builder;
        }

        public final Builder withAdvancedFeatures() {
            Builder builder = this;
            builder.advancedFeaturesEnabled = true;
            return builder;
        }

        public final Builder setCameraApi(CameraApi cameraApi2) throws IllegalArgumentException {
            Intrinsics.checkParameterIsNotNull(cameraApi2, "cameraApi");
            if (cameraApi2 != CameraApi.CAMERA2 || Build.VERSION.SDK_INT >= 21) {
                Builder builder = this;
                builder.cameraApi = cameraApi2;
                return builder;
            }
            throw new IllegalArgumentException("Camera2 API is available from SDK 21.");
        }

        public final GoldenEye build() {
            CameraApi cameraApi2 = this.cameraApi;
            if (cameraApi2 == null) {
                cameraApi2 = GoldenEye.Companion.preferredCameraApi(this.activity);
            }
            int i = WhenMappings.$EnumSwitchMapping$0[cameraApi2.ordinal()];
            if (i == 1) {
                return new GoldenEye1Impl(this.activity, this.advancedFeaturesEnabled, this.onZoomChangedCallback, this.onFocusChangedCallback, this.pictureTransformation, this.logger);
            }
            if (i == 2) {
                return new GoldenEye2Impl(this.activity, this.advancedFeaturesEnabled, this.onZoomChangedCallback, this.onFocusChangedCallback, this.pictureTransformation, this.logger);
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
