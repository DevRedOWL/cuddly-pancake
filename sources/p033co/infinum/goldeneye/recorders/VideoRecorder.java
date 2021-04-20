package p033co.infinum.goldeneye.recorders;

import android.app.Activity;
import android.hardware.Camera;
import android.media.MediaRecorder;
import com.facebook.common.util.UriUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.VideoCallback;
import p033co.infinum.goldeneye.config.CameraConfig;
import p033co.infinum.goldeneye.extensions.AnyKt;
import p033co.infinum.goldeneye.extensions.ContextKt;
import p033co.infinum.goldeneye.extensions.MediaRecorderKt;
import p033co.infinum.goldeneye.utils.LogDelegate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u0012\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo51343d2 = {"Lco/infinum/goldeneye/recorders/VideoRecorder;", "", "activity", "Landroid/app/Activity;", "camera", "Landroid/hardware/Camera;", "config", "Lco/infinum/goldeneye/config/CameraConfig;", "(Landroid/app/Activity;Landroid/hardware/Camera;Lco/infinum/goldeneye/config/CameraConfig;)V", "callback", "Lco/infinum/goldeneye/VideoCallback;", "file", "Ljava/io/File;", "mediaRecorder", "Landroid/media/MediaRecorder;", "release", "", "startRecording", "stopRecording", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.recorders.VideoRecorder */
/* compiled from: VideoRecorder.kt */
public final class VideoRecorder {
    private final Activity activity;
    /* access modifiers changed from: private */
    public VideoCallback callback;
    private final Camera camera;
    private final CameraConfig config;
    private File file;
    private MediaRecorder mediaRecorder;

    public VideoRecorder(Activity activity2, Camera camera2, CameraConfig cameraConfig) {
        Intrinsics.checkParameterIsNotNull(activity2, "activity");
        Intrinsics.checkParameterIsNotNull(camera2, "camera");
        Intrinsics.checkParameterIsNotNull(cameraConfig, "config");
        this.activity = activity2;
        this.camera = camera2;
        this.config = cameraConfig;
    }

    public final void startRecording(File file2, VideoCallback videoCallback) {
        Intrinsics.checkParameterIsNotNull(file2, UriUtil.LOCAL_FILE_SCHEME);
        Intrinsics.checkParameterIsNotNull(videoCallback, "callback");
        this.file = file2;
        this.callback = videoCallback;
        if (!ContextKt.hasAudioPermission(this.activity)) {
            LogDelegate.INSTANCE.log("Recording video without audio. Missing RECORD_AUDIO permission.");
        }
        try {
            MediaRecorder buildCamera1Instance = MediaRecorderKt.buildCamera1Instance(new MediaRecorder(), this.activity, this.camera, this.config, file2);
            buildCamera1Instance.setOnErrorListener(new VideoRecorder$startRecording$$inlined$also$lambda$1(this));
            this.mediaRecorder = buildCamera1Instance;
            MediaRecorder mediaRecorder2 = this.mediaRecorder;
            if (mediaRecorder2 != null) {
                mediaRecorder2.start();
            }
        } catch (Throwable th) {
            videoCallback.onError(th);
            release();
        }
    }

    public final void stopRecording() {
        try {
            MediaRecorder mediaRecorder2 = this.mediaRecorder;
            if (mediaRecorder2 != null) {
                mediaRecorder2.stop();
            }
            AnyKt.ifNotNull(this.callback, this.file, VideoRecorder$stopRecording$1.INSTANCE);
        } catch (Throwable th) {
            release();
            throw th;
        }
        release();
    }

    public final void release() {
        try {
            MediaRecorder mediaRecorder2 = this.mediaRecorder;
            if (mediaRecorder2 != null) {
                mediaRecorder2.release();
            }
        } catch (Throwable th) {
            this.mediaRecorder = null;
            this.callback = null;
            this.file = null;
            throw th;
        }
        this.mediaRecorder = null;
        this.callback = null;
        this.file = null;
    }
}
