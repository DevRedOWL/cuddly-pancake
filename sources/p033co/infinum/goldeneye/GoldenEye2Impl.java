package p033co.infinum.goldeneye;

import android.app.Activity;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.view.TextureView;
import com.facebook.common.util.UriUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.config.CameraConfig;
import p033co.infinum.goldeneye.config.CameraInfo;
import p033co.infinum.goldeneye.config.camera2.AdvancedFeatureConfigImpl;
import p033co.infinum.goldeneye.config.camera2.BasicFeatureConfig;
import p033co.infinum.goldeneye.config.camera2.Camera2ConfigImpl;
import p033co.infinum.goldeneye.config.camera2.ConfigUpdateHandler;
import p033co.infinum.goldeneye.config.camera2.SizeConfigImpl;
import p033co.infinum.goldeneye.config.camera2.VideoConfigImpl;
import p033co.infinum.goldeneye.config.camera2.ZoomConfigImpl;
import p033co.infinum.goldeneye.extensions.AnyKt;
import p033co.infinum.goldeneye.extensions.TextureViewKt;
import p033co.infinum.goldeneye.gesture.GestureManager;
import p033co.infinum.goldeneye.gesture.ZoomHandlerImpl;
import p033co.infinum.goldeneye.gesture.camera2.FocusHandlerImpl;
import p033co.infinum.goldeneye.models.CameraApi;
import p033co.infinum.goldeneye.models.CameraProperty;
import p033co.infinum.goldeneye.models.CameraRequest;
import p033co.infinum.goldeneye.models.CameraState;
import p033co.infinum.goldeneye.models.Facing;
import p033co.infinum.goldeneye.sessions.PictureSession;
import p033co.infinum.goldeneye.sessions.SessionsManager;
import p033co.infinum.goldeneye.sessions.VideoSession;
import p033co.infinum.goldeneye.utils.AsyncUtils;
import p033co.infinum.goldeneye.utils.LogDelegate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\b\u0010,\u001a\u00020)H\u0002J\u001c\u0010-\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010+2\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\u001a\u00101\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u0001002\b\u0010*\u001a\u0004\u0018\u00010+J*\u00102\u001a\u00020)2\b\u00103\u001a\u0004\u0018\u00010\u00192\u0006\u0010/\u001a\u0002002\u0006\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u000206H\u0002J \u00107\u001a\u00020)2\b\u00103\u001a\u0004\u0018\u00010\u00192\u0006\u0010/\u001a\u0002002\u0006\u00104\u001a\u00020\u0015J \u00108\u001a\u00020)2\u0006\u0010/\u001a\u0002002\u0006\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u000206H\u0017J \u00109\u001a\u00020)2\u0006\u0010/\u001a\u0002002\u0006\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u000206H\u0003J\b\u0010:\u001a\u00020)H\u0016J\b\u0010;\u001a\u00020)H\u0002J\u0018\u0010<\u001a\u00020)2\u0006\u0010/\u001a\u0002002\u0006\u00105\u001a\u000206H\u0002J\u0018\u0010=\u001a\u00020)2\u0006\u0010>\u001a\u00020?2\u0006\u00105\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020)H\u0016J\u0010\u0010B\u001a\u00020)2\u0006\u00105\u001a\u00020CH\u0016R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001d8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, mo51343d2 = {"Lco/infinum/goldeneye/GoldenEye2Impl;", "Lco/infinum/goldeneye/BaseGoldenEye;", "activity", "Landroid/app/Activity;", "advancedFeaturesEnabled", "", "onZoomChangedCallback", "Lco/infinum/goldeneye/OnZoomChangedCallback;", "onFocusChangedCallback", "Lco/infinum/goldeneye/OnFocusChangedCallback;", "pictureTransformation", "Lco/infinum/goldeneye/PictureTransformation;", "logger", "Lco/infinum/goldeneye/Logger;", "(Landroid/app/Activity;ZLco/infinum/goldeneye/OnZoomChangedCallback;Lco/infinum/goldeneye/OnFocusChangedCallback;Lco/infinum/goldeneye/PictureTransformation;Lco/infinum/goldeneye/Logger;)V", "_availableCameras", "", "Lco/infinum/goldeneye/config/camera2/Camera2ConfigImpl;", "_config", "availableCameras", "", "Lco/infinum/goldeneye/config/CameraInfo;", "getAvailableCameras", "()Ljava/util/List;", "cameraDevice", "Landroid/hardware/camera2/CameraDevice;", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "config", "Lco/infinum/goldeneye/config/CameraConfig;", "getConfig", "()Lco/infinum/goldeneye/config/CameraConfig;", "configUpdateHandler", "Lco/infinum/goldeneye/config/camera2/ConfigUpdateHandler;", "gestureManager", "Lco/infinum/goldeneye/gesture/GestureManager;", "lastCameraRequest", "Lco/infinum/goldeneye/models/CameraRequest;", "onConfigUpdateListener", "Lkotlin/Function1;", "Lco/infinum/goldeneye/models/CameraProperty;", "", "sessionsManager", "Lco/infinum/goldeneye/sessions/SessionsManager;", "initAvailableCameras", "initConfigUpdateHandler", "sessionsSyncManager", "textureView", "Landroid/view/TextureView;", "initGestureManager", "initInternal", "camera", "cameraInfo", "callback", "Lco/infinum/goldeneye/InitCallback;", "initSessions", "open", "openCamera", "release", "releaseInternal", "startPreview", "startRecording", "file", "Ljava/io/File;", "Lco/infinum/goldeneye/VideoCallback;", "stopRecording", "takePicture", "Lco/infinum/goldeneye/PictureCallback;", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.GoldenEye2Impl */
/* compiled from: GoldenEye2Impl.kt */
public final class GoldenEye2Impl extends BaseGoldenEye {
    private final List<Camera2ConfigImpl> _availableCameras;
    /* access modifiers changed from: private */
    public Camera2ConfigImpl _config;
    private final Activity activity;
    private final boolean advancedFeaturesEnabled;
    private final List<CameraInfo> availableCameras;
    private CameraDevice cameraDevice;
    private final CameraManager cameraManager;
    /* access modifiers changed from: private */
    public ConfigUpdateHandler configUpdateHandler;
    private GestureManager gestureManager;
    /* access modifiers changed from: private */
    public CameraRequest lastCameraRequest;
    private final Function1<CameraProperty, Unit> onConfigUpdateListener;
    /* access modifiers changed from: private */
    public final OnFocusChangedCallback onFocusChangedCallback;
    private final OnZoomChangedCallback onZoomChangedCallback;
    private final PictureTransformation pictureTransformation;
    /* access modifiers changed from: private */
    public SessionsManager sessionsManager;

    public static final /* synthetic */ Camera2ConfigImpl access$get_config$p(GoldenEye2Impl goldenEye2Impl) {
        Camera2ConfigImpl camera2ConfigImpl = goldenEye2Impl._config;
        if (camera2ConfigImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_config");
        }
        return camera2ConfigImpl;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GoldenEye2Impl(Activity activity2, boolean z, OnZoomChangedCallback onZoomChangedCallback2, OnFocusChangedCallback onFocusChangedCallback2, PictureTransformation pictureTransformation2, Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity2, z, onZoomChangedCallback2, onFocusChangedCallback2, pictureTransformation2, (i & 32) != 0 ? null : logger);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GoldenEye2Impl(Activity activity2, boolean z, OnZoomChangedCallback onZoomChangedCallback2, OnFocusChangedCallback onFocusChangedCallback2, PictureTransformation pictureTransformation2, Logger logger) {
        super(CameraApi.CAMERA2);
        Intrinsics.checkParameterIsNotNull(activity2, "activity");
        this.activity = activity2;
        this.advancedFeaturesEnabled = z;
        this.onZoomChangedCallback = onZoomChangedCallback2;
        this.onFocusChangedCallback = onFocusChangedCallback2;
        this.pictureTransformation = pictureTransformation2;
        Object systemService = this.activity.getSystemService("camera");
        if (systemService != null) {
            this.cameraManager = (CameraManager) systemService;
            this.onConfigUpdateListener = new GoldenEye2Impl$onConfigUpdateListener$1(this);
            this._availableCameras = new ArrayList();
            this.availableCameras = this._availableCameras;
            LogDelegate.INSTANCE.setLogger(logger);
            initAvailableCameras();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.hardware.camera2.CameraManager");
    }

    public List<CameraInfo> getAvailableCameras() {
        return this.availableCameras;
    }

    public CameraConfig getConfig() {
        if (!isConfigAvailable()) {
            return null;
        }
        Camera2ConfigImpl camera2ConfigImpl = this._config;
        if (camera2ConfigImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_config");
        }
        return camera2ConfigImpl;
    }

    public void open(TextureView textureView, CameraInfo cameraInfo, InitCallback initCallback) {
        Intrinsics.checkParameterIsNotNull(textureView, "textureView");
        Intrinsics.checkParameterIsNotNull(cameraInfo, "cameraInfo");
        Intrinsics.checkParameterIsNotNull(initCallback, "callback");
        p033co.infinum.goldeneye.utils.Intrinsics.INSTANCE.checkCameraPermission(this.activity);
        if (BaseGoldenEye.Companion.getState() == CameraState.INITIALIZING) {
            this.lastCameraRequest = new CameraRequest(cameraInfo, initCallback);
            return;
        }
        BaseGoldenEye.Companion.setState(CameraState.INITIALIZING);
        AsyncUtils.INSTANCE.startBackgroundThread();
        try {
            releaseInternal();
            openCamera(textureView, cameraInfo, initCallback);
        } catch (Throwable th) {
            releaseInternal();
            initCallback.onError(th);
        }
    }

    private final void openCamera(TextureView textureView, CameraInfo cameraInfo, InitCallback initCallback) {
        this.cameraManager.openCamera(cameraInfo.getId(), new GoldenEye2Impl$openCamera$1(this, textureView, cameraInfo, initCallback), AsyncUtils.INSTANCE.getBackgroundHandler());
    }

    /* access modifiers changed from: private */
    public final void initInternal(CameraDevice cameraDevice2, TextureView textureView, CameraInfo cameraInfo, InitCallback initCallback) {
        try {
            BaseGoldenEye.Companion.setState(CameraState.READY);
            initSessions(cameraDevice2, textureView, cameraInfo);
            initGestureManager(textureView, this.sessionsManager);
            initConfigUpdateHandler(this.sessionsManager, textureView);
            AnyKt.getMAIN_HANDLER().post(new GoldenEye2Impl$initInternal$1(this, initCallback, textureView));
        } catch (Throwable th) {
            releaseInternal();
            AnyKt.getMAIN_HANDLER().post(new GoldenEye2Impl$initInternal$2(initCallback, th));
        }
    }

    /* access modifiers changed from: private */
    public final void startPreview(TextureView textureView, InitCallback initCallback) {
        TextureViewKt.onSurfaceUpdate(textureView, new GoldenEye2Impl$startPreview$1(this, initCallback), new GoldenEye2Impl$startPreview$2(this));
    }

    private final void initConfigUpdateHandler(SessionsManager sessionsManager2, TextureView textureView) throws CameraFailedToOpenException {
        if (sessionsManager2 == null || textureView == null) {
            throw CameraFailedToOpenException.INSTANCE;
        }
        Camera2ConfigImpl camera2ConfigImpl = this._config;
        if (camera2ConfigImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_config");
        }
        this.configUpdateHandler = new ConfigUpdateHandler(sessionsManager2, camera2ConfigImpl);
    }

    public final void initSessions(CameraDevice cameraDevice2, TextureView textureView, CameraInfo cameraInfo) throws CameraFailedToOpenException {
        Intrinsics.checkParameterIsNotNull(textureView, "textureView");
        Intrinsics.checkParameterIsNotNull(cameraInfo, "cameraInfo");
        if (cameraDevice2 != null) {
            this.cameraDevice = cameraDevice2;
            for (Camera2ConfigImpl camera2ConfigImpl : this._availableCameras) {
                if (Intrinsics.areEqual((Object) camera2ConfigImpl.getId(), (Object) cameraInfo.getId())) {
                    this._config = camera2ConfigImpl;
                    Camera2ConfigImpl camera2ConfigImpl2 = this._config;
                    if (camera2ConfigImpl2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("_config");
                    }
                    camera2ConfigImpl2.setCharacteristics(this.cameraManager.getCameraCharacteristics(cameraDevice2.getId()));
                    Activity activity2 = this.activity;
                    Camera2ConfigImpl camera2ConfigImpl3 = this._config;
                    if (camera2ConfigImpl3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("_config");
                    }
                    PictureSession pictureSession = new PictureSession(activity2, cameraDevice2, camera2ConfigImpl3, this.pictureTransformation);
                    Activity activity3 = this.activity;
                    Camera2ConfigImpl camera2ConfigImpl4 = this._config;
                    if (camera2ConfigImpl4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("_config");
                    }
                    this.sessionsManager = new SessionsManager(textureView, pictureSession, new VideoSession(activity3, cameraDevice2, camera2ConfigImpl4));
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        throw CameraFailedToOpenException.INSTANCE;
    }

    public final void initGestureManager(TextureView textureView, SessionsManager sessionsManager2) throws CameraFailedToOpenException {
        if (textureView == null || sessionsManager2 == null) {
            throw CameraFailedToOpenException.INSTANCE;
        }
        Activity activity2 = this.activity;
        Camera2ConfigImpl camera2ConfigImpl = this._config;
        if (camera2ConfigImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_config");
        }
        ZoomHandlerImpl zoomHandlerImpl = new ZoomHandlerImpl(activity2, camera2ConfigImpl);
        Activity activity3 = this.activity;
        Camera2ConfigImpl camera2ConfigImpl2 = this._config;
        if (camera2ConfigImpl2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_config");
        }
        this.gestureManager = new GestureManager(this.activity, textureView, zoomHandlerImpl, new FocusHandlerImpl(activity3, textureView, camera2ConfigImpl2, sessionsManager2, new GoldenEye2Impl$initGestureManager$focusHandler$1(this)));
    }

    public void release() {
        releaseInternal();
        AsyncUtils.INSTANCE.stopBackgroundThread();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r1 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        r4.gestureManager = null;
        r4.configUpdateHandler = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r1 != null) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void releaseInternal() {
        /*
            r4 = this;
            co.infinum.goldeneye.BaseGoldenEye$Companion r0 = p033co.infinum.goldeneye.BaseGoldenEye.Companion
            co.infinum.goldeneye.models.CameraState r1 = p033co.infinum.goldeneye.models.CameraState.CLOSED
            r0.setState(r1)
            r0 = 0
            co.infinum.goldeneye.sessions.SessionsManager r1 = r4.sessionsManager     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x000f
            r1.release()     // Catch:{ all -> 0x002a }
        L_0x000f:
            android.hardware.camera2.CameraDevice r1 = r4.cameraDevice     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0016
            r1.close()     // Catch:{ all -> 0x002a }
        L_0x0016:
            r1 = r0
            co.infinum.goldeneye.models.CameraRequest r1 = (p033co.infinum.goldeneye.models.CameraRequest) r1
            r4.lastCameraRequest = r1
            r1 = r0
            android.hardware.camera2.CameraDevice r1 = (android.hardware.camera2.CameraDevice) r1
            r4.cameraDevice = r1
            r1 = r0
            co.infinum.goldeneye.sessions.SessionsManager r1 = (p033co.infinum.goldeneye.sessions.SessionsManager) r1
            r4.sessionsManager = r1
            co.infinum.goldeneye.gesture.GestureManager r1 = r4.gestureManager
            if (r1 == 0) goto L_0x0048
            goto L_0x0045
        L_0x002a:
            r1 = move-exception
            co.infinum.goldeneye.utils.LogDelegate r2 = p033co.infinum.goldeneye.utils.LogDelegate.INSTANCE     // Catch:{ all -> 0x0052 }
            java.lang.String r3 = "Failed to release camera."
            r2.log(r3, r1)     // Catch:{ all -> 0x0052 }
            r1 = r0
            co.infinum.goldeneye.models.CameraRequest r1 = (p033co.infinum.goldeneye.models.CameraRequest) r1
            r4.lastCameraRequest = r1
            r1 = r0
            android.hardware.camera2.CameraDevice r1 = (android.hardware.camera2.CameraDevice) r1
            r4.cameraDevice = r1
            r1 = r0
            co.infinum.goldeneye.sessions.SessionsManager r1 = (p033co.infinum.goldeneye.sessions.SessionsManager) r1
            r4.sessionsManager = r1
            co.infinum.goldeneye.gesture.GestureManager r1 = r4.gestureManager
            if (r1 == 0) goto L_0x0048
        L_0x0045:
            r1.release()
        L_0x0048:
            r1 = r0
            co.infinum.goldeneye.gesture.GestureManager r1 = (p033co.infinum.goldeneye.gesture.GestureManager) r1
            r4.gestureManager = r1
            co.infinum.goldeneye.config.camera2.ConfigUpdateHandler r0 = (p033co.infinum.goldeneye.config.camera2.ConfigUpdateHandler) r0
            r4.configUpdateHandler = r0
            return
        L_0x0052:
            r1 = move-exception
            r2 = r0
            co.infinum.goldeneye.models.CameraRequest r2 = (p033co.infinum.goldeneye.models.CameraRequest) r2
            r4.lastCameraRequest = r2
            r2 = r0
            android.hardware.camera2.CameraDevice r2 = (android.hardware.camera2.CameraDevice) r2
            r4.cameraDevice = r2
            r2 = r0
            co.infinum.goldeneye.sessions.SessionsManager r2 = (p033co.infinum.goldeneye.sessions.SessionsManager) r2
            r4.sessionsManager = r2
            co.infinum.goldeneye.gesture.GestureManager r2 = r4.gestureManager
            if (r2 == 0) goto L_0x0069
            r2.release()
        L_0x0069:
            r2 = r0
            co.infinum.goldeneye.gesture.GestureManager r2 = (p033co.infinum.goldeneye.gesture.GestureManager) r2
            r4.gestureManager = r2
            co.infinum.goldeneye.config.camera2.ConfigUpdateHandler r0 = (p033co.infinum.goldeneye.config.camera2.ConfigUpdateHandler) r0
            r4.configUpdateHandler = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p033co.infinum.goldeneye.GoldenEye2Impl.releaseInternal():void");
    }

    public void takePicture(PictureCallback pictureCallback) {
        Intrinsics.checkParameterIsNotNull(pictureCallback, "callback");
        if (BaseGoldenEye.Companion.getState() != CameraState.ACTIVE) {
            pictureCallback.onError(new CameraNotActiveException());
            return;
        }
        BaseGoldenEye.Companion.setState(CameraState.TAKING_PICTURE);
        SessionsManager sessionsManager2 = this.sessionsManager;
        if (sessionsManager2 != null) {
            sessionsManager2.takePicture(new GoldenEye2Impl$takePicture$1(pictureCallback));
        }
    }

    public void startRecording(File file, VideoCallback videoCallback) {
        Intrinsics.checkParameterIsNotNull(file, UriUtil.LOCAL_FILE_SCHEME);
        Intrinsics.checkParameterIsNotNull(videoCallback, "callback");
        Camera2ConfigImpl camera2ConfigImpl = this._config;
        if (camera2ConfigImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_config");
        }
        if (camera2ConfigImpl.getFacing() == Facing.EXTERNAL) {
            videoCallback.onError(ExternalVideoRecordingNotSupportedException.INSTANCE);
        } else if (BaseGoldenEye.Companion.getState() != CameraState.ACTIVE) {
            videoCallback.onError(new CameraNotActiveException());
        } else {
            BaseGoldenEye.Companion.setState(CameraState.RECORDING_VIDEO);
            SessionsManager sessionsManager2 = this.sessionsManager;
            if (sessionsManager2 != null) {
                sessionsManager2.startRecording(file, new GoldenEye2Impl$startRecording$1(videoCallback));
            }
        }
    }

    public void stopRecording() {
        SessionsManager sessionsManager2 = this.sessionsManager;
        if (sessionsManager2 != null) {
            sessionsManager2.stopRecording();
        }
    }

    private final void initAvailableCameras() {
        Facing facing;
        String[] cameraIdList = this.cameraManager.getCameraIdList();
        Intrinsics.checkExpressionValueIsNotNull(cameraIdList, "cameraManager.cameraIdList");
        for (String str : cameraIdList) {
            CameraCharacteristics cameraCharacteristics = this.cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num2 != null && num2.intValue() == 0) {
                facing = Facing.FRONT;
            } else if (num2 != null && num2.intValue() == 2) {
                facing = Facing.EXTERNAL;
            } else {
                facing = Facing.BACK;
            }
            GoldenEye2Impl$initAvailableCameras$1$cameraInfo$1 goldenEye2Impl$initAvailableCameras$1$cameraInfo$1 = new GoldenEye2Impl$initAvailableCameras$1$cameraInfo$1(str, num, facing);
            Intrinsics.checkExpressionValueIsNotNull(str, "id");
            VideoConfigImpl videoConfigImpl = new VideoConfigImpl(str, this.onConfigUpdateListener);
            CameraInfo cameraInfo = goldenEye2Impl$initAvailableCameras$1$cameraInfo$1;
            Camera2ConfigImpl camera2ConfigImpl = new Camera2ConfigImpl(cameraInfo, videoConfigImpl, new BasicFeatureConfig(this.onConfigUpdateListener), new AdvancedFeatureConfigImpl(this.advancedFeaturesEnabled, this.onConfigUpdateListener), new SizeConfigImpl(cameraInfo, videoConfigImpl, this.onConfigUpdateListener), new ZoomConfigImpl(this.onConfigUpdateListener, this.onZoomChangedCallback));
            camera2ConfigImpl.setCharacteristics(cameraCharacteristics);
            this._availableCameras.add(camera2ConfigImpl);
        }
    }
}
