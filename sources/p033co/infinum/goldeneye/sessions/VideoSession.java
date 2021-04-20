package p033co.infinum.goldeneye.sessions;

import android.app.Activity;
import android.hardware.camera2.CameraDevice;
import android.media.MediaRecorder;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.common.util.UriUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.VideoCallback;
import p033co.infinum.goldeneye.config.camera2.Camera2ConfigImpl;
import p033co.infinum.goldeneye.extensions.AnyKt;
import p033co.infinum.goldeneye.extensions.ContextKt;
import p033co.infinum.goldeneye.extensions.MediaRecorderKt;
import p033co.infinum.goldeneye.utils.AsyncUtils;
import p033co.infinum.goldeneye.utils.LogDelegate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0012\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\u001e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u001b\u001a\u00020\u0015R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006\u001c"}, mo51343d2 = {"Lco/infinum/goldeneye/sessions/VideoSession;", "Lco/infinum/goldeneye/sessions/BaseSession;", "activity", "Landroid/app/Activity;", "cameraDevice", "Landroid/hardware/camera2/CameraDevice;", "config", "Lco/infinum/goldeneye/config/camera2/Camera2ConfigImpl;", "(Landroid/app/Activity;Landroid/hardware/camera2/CameraDevice;Lco/infinum/goldeneye/config/camera2/Camera2ConfigImpl;)V", "callback", "Lco/infinum/goldeneye/VideoCallback;", "file", "Ljava/io/File;", "mediaRecorder", "Landroid/media/MediaRecorder;", "mediaSurface", "Landroid/view/Surface;", "stateCallback", "co/infinum/goldeneye/sessions/VideoSession$stateCallback$1", "Lco/infinum/goldeneye/sessions/VideoSession$stateCallback$1;", "createSession", "", "textureView", "Landroid/view/TextureView;", "initMediaRecorder", "release", "startRecording", "stopRecording", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.sessions.VideoSession */
/* compiled from: VideoSession.kt */
public final class VideoSession extends BaseSession {
    /* access modifiers changed from: private */
    public VideoCallback callback;
    private File file;
    /* access modifiers changed from: private */
    public MediaRecorder mediaRecorder;
    /* access modifiers changed from: private */
    public Surface mediaSurface;
    private final VideoSession$stateCallback$1 stateCallback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoSession(Activity activity, CameraDevice cameraDevice, Camera2ConfigImpl camera2ConfigImpl) {
        super(activity, cameraDevice, camera2ConfigImpl);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(cameraDevice, "cameraDevice");
        Intrinsics.checkParameterIsNotNull(camera2ConfigImpl, "config");
        this.stateCallback = new VideoSession$stateCallback$1(this, cameraDevice, camera2ConfigImpl);
    }

    public final void startRecording(TextureView textureView, File file2, VideoCallback videoCallback) {
        Intrinsics.checkParameterIsNotNull(textureView, "textureView");
        Intrinsics.checkParameterIsNotNull(file2, UriUtil.LOCAL_FILE_SCHEME);
        Intrinsics.checkParameterIsNotNull(videoCallback, "callback");
        this.file = file2;
        this.callback = videoCallback;
        try {
            createSession(textureView);
        } catch (Throwable th) {
            videoCallback.onError(th);
        }
    }

    public final void stopRecording() {
        try {
            MediaRecorder mediaRecorder2 = this.mediaRecorder;
            if (mediaRecorder2 != null) {
                mediaRecorder2.stop();
            }
            AnyKt.ifNotNull(this.callback, this.file, VideoSession$stopRecording$1.INSTANCE);
            MediaRecorder mediaRecorder3 = this.mediaRecorder;
            if (mediaRecorder3 != null) {
                mediaRecorder3.reset();
            }
        } catch (Throwable th) {
            VideoCallback videoCallback = this.callback;
            if (videoCallback != null) {
                videoCallback.onError(th);
            }
        }
    }

    private final void initMediaRecorder(File file2) {
        if (!ContextKt.hasAudioPermission(getActivity())) {
            LogDelegate.INSTANCE.log("Recording video without audio. Missing RECORD_AUDIO permission.");
        }
        MediaRecorder buildCamera2Instance = MediaRecorderKt.buildCamera2Instance(new MediaRecorder(), getActivity(), getConfig(), file2);
        buildCamera2Instance.setOnErrorListener(new VideoSession$initMediaRecorder$$inlined$apply$lambda$1(this));
        this.mediaRecorder = buildCamera2Instance;
    }

    public void createSession(TextureView textureView) {
        Intrinsics.checkParameterIsNotNull(textureView, "textureView");
        initTextureViewSurface(textureView);
        File file2 = this.file;
        if (file2 == null) {
            Intrinsics.throwNpe();
        }
        initMediaRecorder(file2);
        MediaRecorder mediaRecorder2 = this.mediaRecorder;
        this.mediaSurface = mediaRecorder2 != null ? mediaRecorder2.getSurface() : null;
        getCameraDevice().createCaptureSession(CollectionsKt.listOf(getSurface(), this.mediaSurface), this.stateCallback, AsyncUtils.INSTANCE.getBackgroundHandler());
    }

    public void release() {
        super.release();
        this.callback = null;
        this.file = null;
        try {
            Surface surface = this.mediaSurface;
            if (surface != null) {
                surface.release();
            }
            MediaRecorder mediaRecorder2 = this.mediaRecorder;
            if (mediaRecorder2 != null) {
                mediaRecorder2.reset();
            }
            MediaRecorder mediaRecorder3 = this.mediaRecorder;
            if (mediaRecorder3 != null) {
                mediaRecorder3.release();
            }
        } catch (Throwable th) {
            this.mediaRecorder = null;
            this.mediaSurface = null;
            throw th;
        }
        this.mediaRecorder = null;
        this.mediaSurface = null;
    }
}
