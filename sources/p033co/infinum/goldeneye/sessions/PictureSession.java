package p033co.infinum.goldeneye.sessions;

import android.app.Activity;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.media.ImageReader;
import android.view.Surface;
import android.view.TextureView;
import androidx.room.RoomDatabase;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.InitCallback;
import p033co.infinum.goldeneye.PictureCallback;
import p033co.infinum.goldeneye.PictureTransformation;
import p033co.infinum.goldeneye.config.camera2.Camera2ConfigImpl;
import p033co.infinum.goldeneye.models.FocusMode;
import p033co.infinum.goldeneye.utils.AsyncUtils;
import p033co.infinum.goldeneye.utils.LogDelegate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0002\f\u0019\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001&B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\u001cH\u0002J\b\u0010\"\u001a\u00020\u001cH\u0002J\b\u0010#\u001a\u00020\u0015H\u0002J\b\u0010$\u001a\u00020\u001cH\u0016J\u000e\u0010%\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0017R\u0010\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0004\n\u0002\u0010\u001a¨\u0006'"}, mo51343d2 = {"Lco/infinum/goldeneye/sessions/PictureSession;", "Lco/infinum/goldeneye/sessions/BaseSession;", "activity", "Landroid/app/Activity;", "cameraDevice", "Landroid/hardware/camera2/CameraDevice;", "config", "Lco/infinum/goldeneye/config/camera2/Camera2ConfigImpl;", "pictureTransformation", "Lco/infinum/goldeneye/PictureTransformation;", "(Landroid/app/Activity;Landroid/hardware/camera2/CameraDevice;Lco/infinum/goldeneye/config/camera2/Camera2ConfigImpl;Lco/infinum/goldeneye/PictureTransformation;)V", "captureCallback", "co/infinum/goldeneye/sessions/PictureSession$captureCallback$1", "Lco/infinum/goldeneye/sessions/PictureSession$captureCallback$1;", "captureTimes", "", "imageReader", "Landroid/media/ImageReader;", "initCallback", "Lco/infinum/goldeneye/InitCallback;", "locked", "", "pictureCallback", "Lco/infinum/goldeneye/PictureCallback;", "stateCallback", "co/infinum/goldeneye/sessions/PictureSession$stateCallback$1", "Lco/infinum/goldeneye/sessions/PictureSession$stateCallback$1;", "createInitialPreviewSession", "", "textureView", "Landroid/view/TextureView;", "callback", "createSession", "focusCenterIfUnfocused", "initImageReader", "isFocused", "release", "takePicture", "Companion", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.sessions.PictureSession */
/* compiled from: PictureSession.kt */
public final class PictureSession extends BaseSession {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int MAX_CAPTURE_TIMES = 15;
    private final PictureSession$captureCallback$1 captureCallback;
    /* access modifiers changed from: private */
    public int captureTimes;
    /* access modifiers changed from: private */
    public ImageReader imageReader;
    /* access modifiers changed from: private */
    public InitCallback initCallback;
    /* access modifiers changed from: private */
    public boolean locked;
    /* access modifiers changed from: private */
    public PictureCallback pictureCallback;
    /* access modifiers changed from: private */
    public final PictureTransformation pictureTransformation;
    private final PictureSession$stateCallback$1 stateCallback;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo51343d2 = {"Lco/infinum/goldeneye/sessions/PictureSession$Companion;", "", "()V", "MAX_CAPTURE_TIMES", "", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
    /* renamed from: co.infinum.goldeneye.sessions.PictureSession$Companion */
    /* compiled from: PictureSession.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PictureSession(Activity activity, CameraDevice cameraDevice, Camera2ConfigImpl camera2ConfigImpl, PictureTransformation pictureTransformation2) {
        super(activity, cameraDevice, camera2ConfigImpl);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(cameraDevice, "cameraDevice");
        Intrinsics.checkParameterIsNotNull(camera2ConfigImpl, "config");
        this.pictureTransformation = pictureTransformation2;
        this.captureCallback = new PictureSession$captureCallback$1(this, cameraDevice, camera2ConfigImpl);
        this.stateCallback = new PictureSession$stateCallback$1(this, cameraDevice, camera2ConfigImpl);
    }

    public final void createInitialPreviewSession(TextureView textureView, InitCallback initCallback2) {
        Intrinsics.checkParameterIsNotNull(textureView, "textureView");
        Intrinsics.checkParameterIsNotNull(initCallback2, "callback");
        this.initCallback = initCallback2;
        createSession(textureView);
    }

    public void createSession(TextureView textureView) {
        Intrinsics.checkParameterIsNotNull(textureView, "textureView");
        try {
            initTextureViewSurface(textureView);
            initImageReader();
            CameraDevice cameraDevice = getCameraDevice();
            Surface[] surfaceArr = new Surface[2];
            surfaceArr[0] = getSurface();
            ImageReader imageReader2 = this.imageReader;
            surfaceArr[1] = imageReader2 != null ? imageReader2.getSurface() : null;
            cameraDevice.createCaptureSession(CollectionsKt.listOf(surfaceArr), this.stateCallback, AsyncUtils.INSTANCE.getBackgroundHandler());
        } catch (Throwable th) {
            LogDelegate.INSTANCE.log("Failed to create session.", th);
            InitCallback initCallback2 = this.initCallback;
            if (initCallback2 != null) {
                initCallback2.onError(th);
            }
            this.initCallback = null;
        }
    }

    private final void initImageReader() {
        this.imageReader = ImageReader.newInstance(getConfig().getPictureSize().getWidth(), getConfig().getPictureSize().getHeight(), 256, 2);
        ImageReader imageReader2 = this.imageReader;
        if (imageReader2 != null) {
            imageReader2.setOnImageAvailableListener(new PictureSession$initImageReader$1(this), AsyncUtils.INSTANCE.getBackgroundHandler());
        }
    }

    public final void takePicture(PictureCallback pictureCallback2) {
        Intrinsics.checkParameterIsNotNull(pictureCallback2, "callback");
        this.captureTimes = 0;
        this.pictureCallback = pictureCallback2;
        CaptureRequest.Builder sessionBuilder = getSessionBuilder();
        if (sessionBuilder != null) {
            if (ArraysKt.contains((T[]) new FocusMode[]{FocusMode.AUTO, FocusMode.CONTINUOUS_PICTURE, FocusMode.CONTINUOUS_VIDEO}, getConfig().getFocusMode())) {
                sessionBuilder.set(CaptureRequest.CONTROL_AF_MODE, 1);
                focusCenterIfUnfocused();
            }
            sessionBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            if (getConfig().isHardwareAtLeastLimited()) {
                sessionBuilder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            }
            CameraCaptureSession session = getSession();
            if (session != null) {
                session.capture(sessionBuilder.build(), this.captureCallback, AsyncUtils.INSTANCE.getBackgroundHandler());
            }
            sessionBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            if (getConfig().isHardwareAtLeastLimited()) {
                sessionBuilder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
            }
        }
    }

    private final void focusCenterIfUnfocused() {
        CameraCharacteristics cameraCharacteristics;
        Rect rect;
        if (!isFocused() && (cameraCharacteristics = (CameraCharacteristics) getConfig().getCharacteristics()) != null && (rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE)) != null) {
            int width = rect.width() / 2;
            int height = rect.height() / 2;
            int width2 = (int) (((float) rect.width()) * 0.1f);
            int height2 = (int) (((float) rect.height()) * 0.1f);
            Rect rect2 = new Rect(Math.max(width - width2, 0), Math.max(height - height2, 0), Math.min(width + width2, rect.width()), Math.min(height + height2, rect.height()));
            CaptureRequest.Builder sessionBuilder = getSessionBuilder();
            if (sessionBuilder != null) {
                sessionBuilder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect2, RoomDatabase.MAX_BIND_PARAMETER_CNT)});
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.hardware.camera2.params.MeteringRectangle} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isFocused() {
        /*
            r3 = this;
            android.hardware.camera2.CaptureRequest$Builder r0 = r3.getSessionBuilder()
            r1 = 0
            if (r0 == 0) goto L_0x0010
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS
            java.lang.Object r0 = r0.get(r2)
            android.hardware.camera2.params.MeteringRectangle[] r0 = (android.hardware.camera2.params.MeteringRectangle[]) r0
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            r2 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = kotlin.collections.ArraysKt.getOrNull((T[]) r0, (int) r2)
            r1 = r0
            android.hardware.camera2.params.MeteringRectangle r1 = (android.hardware.camera2.params.MeteringRectangle) r1
        L_0x001b:
            if (r1 == 0) goto L_0x0026
            int r0 = r1.getMeteringWeight()
            r1 = 999(0x3e7, float:1.4E-42)
            if (r0 != r1) goto L_0x0026
            r2 = 1
        L_0x0026:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p033co.infinum.goldeneye.sessions.PictureSession.isFocused():boolean");
    }

    public void release() {
        super.release();
        setSurface((Surface) null);
        this.pictureCallback = null;
        this.initCallback = null;
        try {
            ImageReader imageReader2 = this.imageReader;
            if (imageReader2 != null) {
                imageReader2.close();
            }
        } catch (Throwable th) {
            this.imageReader = null;
            throw th;
        }
        this.imageReader = null;
    }
}
