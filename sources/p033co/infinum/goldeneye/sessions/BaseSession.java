package p033co.infinum.goldeneye.sessions;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.view.Surface;
import android.view.TextureView;
import androidx.room.RoomDatabase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.config.camera2.Camera2ConfigImpl;
import p033co.infinum.goldeneye.models.FocusMode;
import p033co.infinum.goldeneye.models.Size;
import p033co.infinum.goldeneye.utils.AsyncUtils;
import p033co.infinum.goldeneye.utils.CameraUtils;
import p033co.infinum.goldeneye.utils.LogDelegate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H&J\u0010\u0010&\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0005J\u000e\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020\"H\u0017J\u0006\u0010+\u001a\u00020\"J\u0010\u0010,\u001a\u00020)2\u0006\u0010(\u001a\u00020)H\u0002J\u0006\u0010-\u001a\u00020\"J\u000e\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u000200J\u001f\u00101\u001a\u00020\"2\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\"03¢\u0006\u0002\b4R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00065"}, mo51343d2 = {"Lco/infinum/goldeneye/sessions/BaseSession;", "", "activity", "Landroid/app/Activity;", "cameraDevice", "Landroid/hardware/camera2/CameraDevice;", "config", "Lco/infinum/goldeneye/config/camera2/Camera2ConfigImpl;", "(Landroid/app/Activity;Landroid/hardware/camera2/CameraDevice;Lco/infinum/goldeneye/config/camera2/Camera2ConfigImpl;)V", "getActivity", "()Landroid/app/Activity;", "getCameraDevice", "()Landroid/hardware/camera2/CameraDevice;", "getConfig", "()Lco/infinum/goldeneye/config/camera2/Camera2ConfigImpl;", "session", "Landroid/hardware/camera2/CameraCaptureSession;", "getSession", "()Landroid/hardware/camera2/CameraCaptureSession;", "setSession", "(Landroid/hardware/camera2/CameraCaptureSession;)V", "sessionBuilder", "Landroid/hardware/camera2/CaptureRequest$Builder;", "getSessionBuilder", "()Landroid/hardware/camera2/CaptureRequest$Builder;", "setSessionBuilder", "(Landroid/hardware/camera2/CaptureRequest$Builder;)V", "surface", "Landroid/view/Surface;", "getSurface", "()Landroid/view/Surface;", "setSurface", "(Landroid/view/Surface;)V", "cancelFocus", "", "createSession", "textureView", "Landroid/view/TextureView;", "initTextureViewSurface", "lockFocus", "region", "Landroid/graphics/Rect;", "release", "resetFlash", "scaleZoomRegion", "startSession", "unlockFocus", "focus", "Lco/infinum/goldeneye/models/FocusMode;", "updateRequest", "update", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.sessions.BaseSession */
/* compiled from: BaseSession.kt */
public abstract class BaseSession {
    private final Activity activity;
    private final CameraDevice cameraDevice;
    private final Camera2ConfigImpl config;
    private CameraCaptureSession session;
    private CaptureRequest.Builder sessionBuilder;
    private Surface surface;

    public abstract void createSession(TextureView textureView);

    public BaseSession(Activity activity2, CameraDevice cameraDevice2, Camera2ConfigImpl camera2ConfigImpl) {
        Intrinsics.checkParameterIsNotNull(activity2, "activity");
        Intrinsics.checkParameterIsNotNull(cameraDevice2, "cameraDevice");
        Intrinsics.checkParameterIsNotNull(camera2ConfigImpl, "config");
        this.activity = activity2;
        this.cameraDevice = cameraDevice2;
        this.config = camera2ConfigImpl;
    }

    /* access modifiers changed from: protected */
    public final Activity getActivity() {
        return this.activity;
    }

    /* access modifiers changed from: protected */
    public final CameraDevice getCameraDevice() {
        return this.cameraDevice;
    }

    /* access modifiers changed from: protected */
    public final Camera2ConfigImpl getConfig() {
        return this.config;
    }

    /* access modifiers changed from: protected */
    public final CaptureRequest.Builder getSessionBuilder() {
        return this.sessionBuilder;
    }

    /* access modifiers changed from: protected */
    public final void setSessionBuilder(CaptureRequest.Builder builder) {
        this.sessionBuilder = builder;
    }

    /* access modifiers changed from: protected */
    public final CameraCaptureSession getSession() {
        return this.session;
    }

    /* access modifiers changed from: protected */
    public final void setSession(CameraCaptureSession cameraCaptureSession) {
        this.session = cameraCaptureSession;
    }

    /* access modifiers changed from: protected */
    public final Surface getSurface() {
        return this.surface;
    }

    /* access modifiers changed from: protected */
    public final void setSurface(Surface surface2) {
        this.surface = surface2;
    }

    public final void updateRequest(Function1<? super CaptureRequest.Builder, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "update");
        try {
            CaptureRequest.Builder builder = this.sessionBuilder;
            if (builder != null) {
                function1.invoke(builder);
            }
        } catch (Throwable th) {
            LogDelegate.INSTANCE.log("Failed to update camera parameters.", th);
        }
    }

    /* access modifiers changed from: protected */
    public final void initTextureViewSurface(TextureView textureView) {
        Intrinsics.checkParameterIsNotNull(textureView, "textureView");
        textureView.setTransform(CameraUtils.INSTANCE.calculateTextureMatrix(this.activity, textureView, this.config));
        SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        if (surfaceTexture != null) {
            Size previewSize = this.config.getPreviewSize();
            surfaceTexture.setDefaultBufferSize(previewSize.getWidth(), previewSize.getHeight());
        } else {
            surfaceTexture = null;
        }
        this.surface = new Surface(surfaceTexture);
    }

    public final void startSession() {
        CameraCaptureSession cameraCaptureSession = this.session;
        if (cameraCaptureSession != null) {
            CaptureRequest.Builder builder = this.sessionBuilder;
            CaptureRequest build = builder != null ? builder.build() : null;
            if (build == null) {
                Intrinsics.throwNpe();
            }
            cameraCaptureSession.setRepeatingRequest(build, (CameraCaptureSession.CaptureCallback) null, AsyncUtils.INSTANCE.getBackgroundHandler());
        }
    }

    public final void lockFocus(Rect rect) {
        Intrinsics.checkParameterIsNotNull(rect, "region");
        try {
            cancelFocus();
            Rect scaleZoomRegion = scaleZoomRegion(rect);
            CaptureRequest.Builder builder = this.sessionBuilder;
            if (builder != null) {
                builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
                builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(scaleZoomRegion, RoomDatabase.MAX_BIND_PARAMETER_CNT)});
            }
            CameraCaptureSession cameraCaptureSession = this.session;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.stopRepeating();
            }
            CameraCaptureSession cameraCaptureSession2 = this.session;
            if (cameraCaptureSession2 != null) {
                CaptureRequest.Builder builder2 = this.sessionBuilder;
                CaptureRequest build = builder2 != null ? builder2.build() : null;
                if (build == null) {
                    Intrinsics.throwNpe();
                }
                cameraCaptureSession2.capture(build, new BaseSession$lockFocus$2(this), AsyncUtils.INSTANCE.getBackgroundHandler());
            }
        } catch (Throwable th) {
            LogDelegate.INSTANCE.log("Failed to lock focus.", th);
        }
    }

    public final void unlockFocus(FocusMode focusMode) {
        Intrinsics.checkParameterIsNotNull(focusMode, "focus");
        try {
            cancelFocus();
            CaptureRequest.Builder builder = this.sessionBuilder;
            if (builder != null) {
                if (this.config.getSupportedFocusModes().contains(focusMode)) {
                    builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(focusMode.toCamera2()));
                }
                builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            }
            startSession();
        } catch (Throwable th) {
            LogDelegate.INSTANCE.log("Failed to unlock focus.", th);
        }
    }

    public final void resetFlash() {
        CaptureRequest.Builder builder = this.sessionBuilder;
        if (builder != null) {
            builder.set(CaptureRequest.FLASH_MODE, 0);
            CameraCaptureSession cameraCaptureSession = this.session;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.capture(builder.build(), (CameraCaptureSession.CaptureCallback) null, AsyncUtils.INSTANCE.getBackgroundHandler());
            }
        }
    }

    private final Rect scaleZoomRegion(Rect rect) {
        Rect rect2;
        CameraCharacteristics cameraCharacteristics;
        Rect rect3;
        CaptureRequest.Builder builder = this.sessionBuilder;
        if (builder == null || (rect2 = (Rect) builder.get(CaptureRequest.SCALER_CROP_REGION)) == null || (cameraCharacteristics = (CameraCharacteristics) this.config.getCharacteristics()) == null || (rect3 = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE)) == null) {
            return rect;
        }
        float width = ((float) rect2.width()) / ((float) rect3.width());
        float height = ((float) rect2.height()) / ((float) rect3.height());
        return new Rect((int) (((float) rect2.left) + (((float) rect.left) * width)), (int) (((float) rect2.top) + (((float) rect.top) * height)), (int) (((float) rect2.left) + (width * ((float) rect.right))), (int) (((float) rect2.top) + (height * ((float) rect.bottom))));
    }

    private final void cancelFocus() {
        CaptureRequest.Builder builder = this.sessionBuilder;
        if (builder != null) {
            builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            builder.set(CaptureRequest.CONTROL_AF_MODE, 0);
            builder.set(CaptureRequest.CONTROL_AF_REGIONS, (Object) null);
            CameraCaptureSession cameraCaptureSession = this.session;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.capture(builder.build(), (CameraCaptureSession.CaptureCallback) null, AsyncUtils.INSTANCE.getBackgroundHandler());
            }
        }
    }

    public void release() {
        try {
            Surface surface2 = this.surface;
            if (surface2 != null) {
                surface2.release();
            }
            CameraCaptureSession cameraCaptureSession = this.session;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.stopRepeating();
                cameraCaptureSession.abortCaptures();
                cameraCaptureSession.close();
            }
        } catch (Throwable th) {
            this.sessionBuilder = null;
            this.session = null;
            this.surface = null;
            throw th;
        }
        this.sessionBuilder = null;
        this.session = null;
        this.surface = null;
    }
}
