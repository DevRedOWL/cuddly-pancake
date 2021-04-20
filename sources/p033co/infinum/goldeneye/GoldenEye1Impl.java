package p033co.infinum.goldeneye;

import android.app.Activity;
import android.hardware.Camera;
import android.os.Build;
import android.view.TextureView;
import com.facebook.common.util.UriUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.config.CameraConfig;
import p033co.infinum.goldeneye.config.CameraInfo;
import p033co.infinum.goldeneye.config.camera1.AdvancedFeatureConfigImpl;
import p033co.infinum.goldeneye.config.camera1.BasicFeatureConfigImpl;
import p033co.infinum.goldeneye.config.camera1.Camera1ConfigImpl;
import p033co.infinum.goldeneye.config.camera1.ConfigUpdateHandler;
import p033co.infinum.goldeneye.config.camera1.SizeConfigImpl;
import p033co.infinum.goldeneye.config.camera1.VideoConfigImpl;
import p033co.infinum.goldeneye.config.camera1.ZoomConfigImpl;
import p033co.infinum.goldeneye.extensions.AnyKt;
import p033co.infinum.goldeneye.extensions.TextureViewKt;
import p033co.infinum.goldeneye.gesture.GestureManager;
import p033co.infinum.goldeneye.gesture.ZoomHandlerImpl;
import p033co.infinum.goldeneye.gesture.camera1.FocusHandlerImpl;
import p033co.infinum.goldeneye.models.AntibandingMode;
import p033co.infinum.goldeneye.models.CameraApi;
import p033co.infinum.goldeneye.models.CameraProperty;
import p033co.infinum.goldeneye.models.CameraState;
import p033co.infinum.goldeneye.models.ColorEffectMode;
import p033co.infinum.goldeneye.models.Facing;
import p033co.infinum.goldeneye.models.FlashMode;
import p033co.infinum.goldeneye.models.FocusMode;
import p033co.infinum.goldeneye.models.Size;
import p033co.infinum.goldeneye.models.WhiteBalanceMode;
import p033co.infinum.goldeneye.recorders.PictureRecorder;
import p033co.infinum.goldeneye.recorders.VideoRecorder;
import p033co.infinum.goldeneye.utils.AsyncUtils;
import p033co.infinum.goldeneye.utils.LogDelegate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\b\u0010,\u001a\u00020%H\u0002J\b\u0010-\u001a\u00020%H\u0002J\u001c\u0010.\u001a\u00020%2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u001c\u0010/\u001a\u00020%2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u0012\u00100\u001a\u00020%2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J \u00101\u001a\u00020%2\u0006\u0010(\u001a\u00020)2\u0006\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u00106\u001a\u00020%H\u0016J\b\u00107\u001a\u00020%H\u0002J\u0014\u00108\u001a\u00020%2\n\b\u0002\u00109\u001a\u0004\u0018\u000104H\u0002J\u0018\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020<2\u0006\u00103\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020%H\u0016J\u0010\u0010?\u001a\u00020%2\u0006\u00103\u001a\u00020@H\u0016R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, mo51343d2 = {"Lco/infinum/goldeneye/GoldenEye1Impl;", "Lco/infinum/goldeneye/BaseGoldenEye;", "activity", "Landroid/app/Activity;", "advancedFeaturesEnabled", "", "onZoomChangedCallback", "Lco/infinum/goldeneye/OnZoomChangedCallback;", "onFocusChangedCallback", "Lco/infinum/goldeneye/OnFocusChangedCallback;", "pictureTransformation", "Lco/infinum/goldeneye/PictureTransformation;", "logger", "Lco/infinum/goldeneye/Logger;", "(Landroid/app/Activity;ZLco/infinum/goldeneye/OnZoomChangedCallback;Lco/infinum/goldeneye/OnFocusChangedCallback;Lco/infinum/goldeneye/PictureTransformation;Lco/infinum/goldeneye/Logger;)V", "_availableCameras", "", "Lco/infinum/goldeneye/config/camera1/Camera1ConfigImpl;", "_config", "availableCameras", "", "Lco/infinum/goldeneye/config/CameraInfo;", "getAvailableCameras", "()Ljava/util/List;", "camera", "Landroid/hardware/Camera;", "config", "Lco/infinum/goldeneye/config/CameraConfig;", "getConfig", "()Lco/infinum/goldeneye/config/CameraConfig;", "configUpdateHandler", "Lco/infinum/goldeneye/config/camera1/ConfigUpdateHandler;", "gestureHandler", "Lco/infinum/goldeneye/gesture/GestureManager;", "onConfigUpdateListener", "Lkotlin/Function1;", "Lco/infinum/goldeneye/models/CameraProperty;", "", "pictureRecorder", "Lco/infinum/goldeneye/recorders/PictureRecorder;", "textureView", "Landroid/view/TextureView;", "videoRecorder", "Lco/infinum/goldeneye/recorders/VideoRecorder;", "applyConfig", "initAvailableCameras", "initConfigUpdateHandler", "initGestureManager", "initRecorders", "open", "cameraInfo", "callback", "Lco/infinum/goldeneye/InitCallback;", "openCamera", "release", "releaseInternal", "startPreview", "initCallback", "startRecording", "file", "Ljava/io/File;", "Lco/infinum/goldeneye/VideoCallback;", "stopRecording", "takePicture", "Lco/infinum/goldeneye/PictureCallback;", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.GoldenEye1Impl */
/* compiled from: GoldenEye1Impl.kt */
public final class GoldenEye1Impl extends BaseGoldenEye {
    private final List<Camera1ConfigImpl> _availableCameras;
    /* access modifiers changed from: private */
    public Camera1ConfigImpl _config;
    /* access modifiers changed from: private */
    public final Activity activity;
    private final boolean advancedFeaturesEnabled;
    private final List<CameraInfo> availableCameras;
    /* access modifiers changed from: private */
    public Camera camera;
    /* access modifiers changed from: private */
    public ConfigUpdateHandler configUpdateHandler;
    private GestureManager gestureHandler;
    private final Function1<CameraProperty, Unit> onConfigUpdateListener;
    /* access modifiers changed from: private */
    public final OnFocusChangedCallback onFocusChangedCallback;
    private final OnZoomChangedCallback onZoomChangedCallback;
    private PictureRecorder pictureRecorder;
    private final PictureTransformation pictureTransformation;
    /* access modifiers changed from: private */
    public TextureView textureView;
    private VideoRecorder videoRecorder;

    public GoldenEye1Impl(Activity activity2, boolean z, OnZoomChangedCallback onZoomChangedCallback2, OnFocusChangedCallback onFocusChangedCallback2, PictureTransformation pictureTransformation2) {
        this(activity2, z, onZoomChangedCallback2, onFocusChangedCallback2, pictureTransformation2, (Logger) null, 32, (DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ Camera1ConfigImpl access$get_config$p(GoldenEye1Impl goldenEye1Impl) {
        Camera1ConfigImpl camera1ConfigImpl = goldenEye1Impl._config;
        if (camera1ConfigImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_config");
        }
        return camera1ConfigImpl;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GoldenEye1Impl(Activity activity2, boolean z, OnZoomChangedCallback onZoomChangedCallback2, OnFocusChangedCallback onFocusChangedCallback2, PictureTransformation pictureTransformation2, Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity2, z, onZoomChangedCallback2, onFocusChangedCallback2, pictureTransformation2, (i & 32) != 0 ? null : logger);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GoldenEye1Impl(Activity activity2, boolean z, OnZoomChangedCallback onZoomChangedCallback2, OnFocusChangedCallback onFocusChangedCallback2, PictureTransformation pictureTransformation2, Logger logger) {
        super(CameraApi.CAMERA1);
        Intrinsics.checkParameterIsNotNull(activity2, "activity");
        this.activity = activity2;
        this.advancedFeaturesEnabled = z;
        this.onZoomChangedCallback = onZoomChangedCallback2;
        this.onFocusChangedCallback = onFocusChangedCallback2;
        this.pictureTransformation = pictureTransformation2;
        this.onConfigUpdateListener = new GoldenEye1Impl$onConfigUpdateListener$1(this);
        this._availableCameras = new ArrayList();
        this.availableCameras = this._availableCameras;
        LogDelegate.INSTANCE.setLogger(logger);
        initAvailableCameras();
    }

    public List<CameraInfo> getAvailableCameras() {
        return this.availableCameras;
    }

    public CameraConfig getConfig() {
        if (!isConfigAvailable()) {
            return null;
        }
        Camera1ConfigImpl camera1ConfigImpl = this._config;
        if (camera1ConfigImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_config");
        }
        return camera1ConfigImpl;
    }

    public void open(TextureView textureView2, CameraInfo cameraInfo, InitCallback initCallback) {
        Intrinsics.checkParameterIsNotNull(textureView2, "textureView");
        Intrinsics.checkParameterIsNotNull(cameraInfo, "cameraInfo");
        Intrinsics.checkParameterIsNotNull(initCallback, "callback");
        p033co.infinum.goldeneye.utils.Intrinsics.INSTANCE.checkCameraPermission(this.activity);
        BaseGoldenEye.Companion.setState(CameraState.INITIALIZING);
        AsyncUtils.INSTANCE.startBackgroundThread();
        try {
            releaseInternal();
            for (Object next : this._availableCameras) {
                if (Intrinsics.areEqual((Object) ((Camera1ConfigImpl) next).getId(), (Object) cameraInfo.getId())) {
                    this._config = (Camera1ConfigImpl) next;
                    Camera1ConfigImpl camera1ConfigImpl = this._config;
                    if (camera1ConfigImpl == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("_config");
                    }
                    openCamera(camera1ConfigImpl);
                    BaseGoldenEye.Companion.setState(CameraState.READY);
                    initGestureManager(this.camera, textureView2);
                    initRecorders(this.camera);
                    initConfigUpdateHandler(this.camera, textureView2);
                    Camera1ConfigImpl camera1ConfigImpl2 = this._config;
                    if (camera1ConfigImpl2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("_config");
                    }
                    initCallback.onReady(camera1ConfigImpl2);
                    this.textureView = textureView2;
                    TextureViewKt.onSurfaceUpdate(textureView2, new GoldenEye1Impl$open$2(this, initCallback), new GoldenEye1Impl$open$3(this));
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (Throwable th) {
            releaseInternal();
            initCallback.onError(th);
        }
    }

    public void release() {
        releaseInternal();
        AsyncUtils.INSTANCE.stopBackgroundThread();
    }

    private final void releaseInternal() {
        BaseGoldenEye.Companion.setState(CameraState.CLOSED);
        VideoRecorder videoRecorder2 = this.videoRecorder;
        if (videoRecorder2 != null) {
            videoRecorder2.release();
        }
        PictureRecorder pictureRecorder2 = this.pictureRecorder;
        if (pictureRecorder2 != null) {
            pictureRecorder2.release();
        }
        GestureManager gestureManager = this.gestureHandler;
        if (gestureManager != null) {
            gestureManager.release();
        }
        this.gestureHandler = null;
        this.videoRecorder = null;
        this.pictureRecorder = null;
        try {
            Camera camera2 = this.camera;
            if (camera2 != null) {
                camera2.stopPreview();
            }
            Camera camera3 = this.camera;
            if (camera3 != null) {
                camera3.release();
            }
        } catch (Throwable th) {
            this.camera = null;
            throw th;
        }
        this.camera = null;
    }

    public void takePicture(PictureCallback pictureCallback) {
        Intrinsics.checkParameterIsNotNull(pictureCallback, "callback");
        if (BaseGoldenEye.Companion.getState() != CameraState.ACTIVE) {
            pictureCallback.onError(new CameraNotActiveException());
            return;
        }
        BaseGoldenEye.Companion.setState(CameraState.TAKING_PICTURE);
        PictureRecorder pictureRecorder2 = this.pictureRecorder;
        if (pictureRecorder2 != null) {
            pictureRecorder2.takePicture(new GoldenEye1Impl$takePicture$1(this, pictureCallback));
        }
    }

    public void startRecording(File file, VideoCallback videoCallback) {
        Intrinsics.checkParameterIsNotNull(file, UriUtil.LOCAL_FILE_SCHEME);
        Intrinsics.checkParameterIsNotNull(videoCallback, "callback");
        if (BaseGoldenEye.Companion.getState() != CameraState.ACTIVE) {
            videoCallback.onError(new CameraNotActiveException());
            return;
        }
        BaseGoldenEye.Companion.setState(CameraState.RECORDING_VIDEO);
        startPreview$default(this, (InitCallback) null, 1, (Object) null);
        Camera camera2 = this.camera;
        if (camera2 != null) {
            camera2.unlock();
        }
        VideoRecorder videoRecorder2 = this.videoRecorder;
        if (videoRecorder2 != null) {
            videoRecorder2.startRecording(file, new GoldenEye1Impl$startRecording$1(this, videoCallback));
        }
    }

    public void stopRecording() {
        VideoRecorder videoRecorder2 = this.videoRecorder;
        if (videoRecorder2 != null) {
            videoRecorder2.stopRecording();
        }
    }

    private final void initConfigUpdateHandler(Camera camera2, TextureView textureView2) throws CameraFailedToOpenException {
        if (camera2 == null || textureView2 == null) {
            throw CameraFailedToOpenException.INSTANCE;
        }
        Camera1ConfigImpl camera1ConfigImpl = this._config;
        if (camera1ConfigImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_config");
        }
        this.configUpdateHandler = new ConfigUpdateHandler(camera2, camera1ConfigImpl, new GoldenEye1Impl$initConfigUpdateHandler$1(this, textureView2));
    }

    private final void initGestureManager(Camera camera2, TextureView textureView2) throws CameraFailedToOpenException {
        if (camera2 == null || textureView2 == null) {
            throw CameraFailedToOpenException.INSTANCE;
        }
        Activity activity2 = this.activity;
        Camera1ConfigImpl camera1ConfigImpl = this._config;
        if (camera1ConfigImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_config");
        }
        ZoomHandlerImpl zoomHandlerImpl = new ZoomHandlerImpl(activity2, camera1ConfigImpl);
        Activity activity3 = this.activity;
        Camera1ConfigImpl camera1ConfigImpl2 = this._config;
        if (camera1ConfigImpl2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_config");
        }
        this.gestureHandler = new GestureManager(this.activity, textureView2, zoomHandlerImpl, new FocusHandlerImpl(activity3, camera2, textureView2, camera1ConfigImpl2, new GoldenEye1Impl$initGestureManager$focusHandler$1(this)));
    }

    private final void initRecorders(Camera camera2) throws CameraFailedToOpenException {
        if (camera2 != null) {
            Activity activity2 = this.activity;
            Camera1ConfigImpl camera1ConfigImpl = this._config;
            if (camera1ConfigImpl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_config");
            }
            this.videoRecorder = new VideoRecorder(activity2, camera2, camera1ConfigImpl);
            Activity activity3 = this.activity;
            Camera1ConfigImpl camera1ConfigImpl2 = this._config;
            if (camera1ConfigImpl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_config");
            }
            this.pictureRecorder = new PictureRecorder(activity3, camera2, camera1ConfigImpl2, this.pictureTransformation);
            return;
        }
        throw CameraFailedToOpenException.INSTANCE;
    }

    private final void openCamera(Camera1ConfigImpl camera1ConfigImpl) throws Throwable {
        Camera open = Camera.open(Integer.parseInt(camera1ConfigImpl.getId()));
        if (open != null) {
            this.camera = open;
            this._config = camera1ConfigImpl;
            Camera1ConfigImpl camera1ConfigImpl2 = this._config;
            if (camera1ConfigImpl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_config");
            }
            camera1ConfigImpl2.setCharacteristics(open.getParameters());
        }
    }

    static /* synthetic */ void startPreview$default(GoldenEye1Impl goldenEye1Impl, InitCallback initCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            initCallback = null;
        }
        goldenEye1Impl.startPreview(initCallback);
    }

    /* access modifiers changed from: private */
    public final void startPreview(InitCallback initCallback) {
        try {
            AnyKt.ifNotNull(this.camera, this.textureView, new GoldenEye1Impl$startPreview$1(this, initCallback));
        } catch (Throwable th) {
            releaseInternal();
            if (initCallback != null) {
                initCallback.onError(th);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void applyConfig() {
        Camera camera2 = this.camera;
        if (camera2 != null) {
            Camera.Parameters parameters = camera2.getParameters();
            Camera1ConfigImpl camera1ConfigImpl = this._config;
            if (camera1ConfigImpl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_config");
            }
            Size pictureSize = camera1ConfigImpl.getPictureSize();
            parameters.setPictureSize(pictureSize.getWidth(), pictureSize.getHeight());
            Camera1ConfigImpl camera1ConfigImpl2 = this._config;
            if (camera1ConfigImpl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_config");
            }
            Size previewSize = camera1ConfigImpl2.getPreviewSize();
            parameters.setPreviewSize(previewSize.getWidth(), previewSize.getHeight());
            Camera1ConfigImpl camera1ConfigImpl3 = this._config;
            if (camera1ConfigImpl3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_config");
            }
            parameters.setJpegQuality(camera1ConfigImpl3.getPictureQuality());
            if (Build.VERSION.SDK_INT >= 15) {
                Camera1ConfigImpl camera1ConfigImpl4 = this._config;
                if (camera1ConfigImpl4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("_config");
                }
                if (camera1ConfigImpl4.isVideoStabilizationSupported()) {
                    Camera1ConfigImpl camera1ConfigImpl5 = this._config;
                    if (camera1ConfigImpl5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("_config");
                    }
                    parameters.setVideoStabilization(camera1ConfigImpl5.getVideoStabilizationEnabled());
                }
            }
            Camera1ConfigImpl camera1ConfigImpl6 = this._config;
            if (camera1ConfigImpl6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_config");
            }
            List<FocusMode> supportedFocusModes = camera1ConfigImpl6.getSupportedFocusModes();
            Camera1ConfigImpl camera1ConfigImpl7 = this._config;
            if (camera1ConfigImpl7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_config");
            }
            if (supportedFocusModes.contains(camera1ConfigImpl7.getFocusMode())) {
                Camera1ConfigImpl camera1ConfigImpl8 = this._config;
                if (camera1ConfigImpl8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("_config");
                }
                parameters.setFocusMode(camera1ConfigImpl8.getFocusMode().toCamera1());
            }
            Camera1ConfigImpl camera1ConfigImpl9 = this._config;
            if (camera1ConfigImpl9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_config");
            }
            List<FlashMode> supportedFlashModes = camera1ConfigImpl9.getSupportedFlashModes();
            Camera1ConfigImpl camera1ConfigImpl10 = this._config;
            if (camera1ConfigImpl10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_config");
            }
            if (supportedFlashModes.contains(camera1ConfigImpl10.getFlashMode())) {
                Camera1ConfigImpl camera1ConfigImpl11 = this._config;
                if (camera1ConfigImpl11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("_config");
                }
                parameters.setFlashMode(camera1ConfigImpl11.getFlashMode().toCamera1());
            }
            Camera1ConfigImpl camera1ConfigImpl12 = this._config;
            if (camera1ConfigImpl12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_config");
            }
            List<AntibandingMode> supportedAntibandingModes = camera1ConfigImpl12.getSupportedAntibandingModes();
            Camera1ConfigImpl camera1ConfigImpl13 = this._config;
            if (camera1ConfigImpl13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_config");
            }
            if (supportedAntibandingModes.contains(camera1ConfigImpl13.getAntibandingMode())) {
                Camera1ConfigImpl camera1ConfigImpl14 = this._config;
                if (camera1ConfigImpl14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("_config");
                }
                parameters.setAntibanding(camera1ConfigImpl14.getAntibandingMode().toCamera1());
            }
            Camera1ConfigImpl camera1ConfigImpl15 = this._config;
            if (camera1ConfigImpl15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_config");
            }
            List<ColorEffectMode> supportedColorEffectModes = camera1ConfigImpl15.getSupportedColorEffectModes();
            Camera1ConfigImpl camera1ConfigImpl16 = this._config;
            if (camera1ConfigImpl16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_config");
            }
            if (supportedColorEffectModes.contains(camera1ConfigImpl16.getColorEffectMode())) {
                Camera1ConfigImpl camera1ConfigImpl17 = this._config;
                if (camera1ConfigImpl17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("_config");
                }
                parameters.setColorEffect(camera1ConfigImpl17.getColorEffectMode().toCamera1());
            }
            Camera1ConfigImpl camera1ConfigImpl18 = this._config;
            if (camera1ConfigImpl18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_config");
            }
            List<WhiteBalanceMode> supportedWhiteBalanceModes = camera1ConfigImpl18.getSupportedWhiteBalanceModes();
            Camera1ConfigImpl camera1ConfigImpl19 = this._config;
            if (camera1ConfigImpl19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_config");
            }
            if (supportedWhiteBalanceModes.contains(camera1ConfigImpl19.getWhiteBalanceMode())) {
                Camera1ConfigImpl camera1ConfigImpl20 = this._config;
                if (camera1ConfigImpl20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("_config");
                }
                parameters.setWhiteBalance(camera1ConfigImpl20.getWhiteBalanceMode().toCamera1());
            }
            Camera.Parameters parameters2 = camera2.getParameters();
            Intrinsics.checkExpressionValueIsNotNull(parameters2, "parameters");
            if (parameters2.isZoomSupported()) {
                List<Integer> zoomRatios = parameters.getZoomRatios();
                Camera1ConfigImpl camera1ConfigImpl21 = this._config;
                if (camera1ConfigImpl21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("_config");
                }
                parameters.setZoom(zoomRatios.indexOf(Integer.valueOf(camera1ConfigImpl21.getZoom())));
            }
            camera2.setParameters(parameters);
        }
    }

    private final void initAvailableCameras() {
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            GoldenEye1Impl$initAvailableCameras$cameraInfo$1 goldenEye1Impl$initAvailableCameras$cameraInfo$1 = new GoldenEye1Impl$initAvailableCameras$cameraInfo$1(i, cameraInfo, cameraInfo.facing == 0 ? Facing.BACK : Facing.FRONT);
            VideoConfigImpl videoConfigImpl = new VideoConfigImpl(String.valueOf(i), this.onConfigUpdateListener);
            CameraInfo cameraInfo2 = goldenEye1Impl$initAvailableCameras$cameraInfo$1;
            this._availableCameras.add(new Camera1ConfigImpl(cameraInfo2, videoConfigImpl, new BasicFeatureConfigImpl(this.onConfigUpdateListener), new SizeConfigImpl(cameraInfo2, videoConfigImpl, this.onConfigUpdateListener), new ZoomConfigImpl(this.onConfigUpdateListener, this.onZoomChangedCallback), new AdvancedFeatureConfigImpl(this.advancedFeaturesEnabled, this.onConfigUpdateListener)));
        }
    }
}
