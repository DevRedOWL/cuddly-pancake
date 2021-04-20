package p033co.infinum.goldeneye.sessions;

import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.view.TextureView;
import com.facebook.common.util.UriUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.InitCallback;
import p033co.infinum.goldeneye.PictureCallback;
import p033co.infinum.goldeneye.VideoCallback;
import p033co.infinum.goldeneye.models.FocusMode;
import p033co.infinum.goldeneye.utils.LogDelegate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u000eJ\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u000eJ\u000e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 J\u001f\u0010!\u001a\u00020\u000e2\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000e0#¢\u0006\u0002\b%R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, mo51343d2 = {"Lco/infinum/goldeneye/sessions/SessionsManager;", "", "textureView", "Landroid/view/TextureView;", "pictureSession", "Lco/infinum/goldeneye/sessions/PictureSession;", "videoSession", "Lco/infinum/goldeneye/sessions/VideoSession;", "(Landroid/view/TextureView;Lco/infinum/goldeneye/sessions/PictureSession;Lco/infinum/goldeneye/sessions/VideoSession;)V", "activeSession", "Lco/infinum/goldeneye/sessions/BaseSession;", "getTextureView", "()Landroid/view/TextureView;", "lockFocus", "", "region", "Landroid/graphics/Rect;", "release", "resetFlashMode", "restartSession", "startPreview", "callback", "Lco/infinum/goldeneye/InitCallback;", "startRecording", "file", "Ljava/io/File;", "Lco/infinum/goldeneye/VideoCallback;", "stopRecording", "takePicture", "Lco/infinum/goldeneye/PictureCallback;", "unlockFocus", "focus", "Lco/infinum/goldeneye/models/FocusMode;", "updateSession", "update", "Lkotlin/Function1;", "Landroid/hardware/camera2/CaptureRequest$Builder;", "Lkotlin/ExtensionFunctionType;", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.sessions.SessionsManager */
/* compiled from: SessionsManager.kt */
public final class SessionsManager {
    private BaseSession activeSession = this.pictureSession;
    private final PictureSession pictureSession;
    private final TextureView textureView;
    private final VideoSession videoSession;

    public SessionsManager(TextureView textureView2, PictureSession pictureSession2, VideoSession videoSession2) {
        Intrinsics.checkParameterIsNotNull(textureView2, "textureView");
        Intrinsics.checkParameterIsNotNull(pictureSession2, "pictureSession");
        Intrinsics.checkParameterIsNotNull(videoSession2, "videoSession");
        this.textureView = textureView2;
        this.pictureSession = pictureSession2;
        this.videoSession = videoSession2;
    }

    public final TextureView getTextureView() {
        return this.textureView;
    }

    public final void updateSession(Function1<? super CaptureRequest.Builder, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "update");
        this.pictureSession.updateRequest(function1);
        this.videoSession.updateRequest(function1);
        try {
            this.activeSession.startSession();
        } catch (Throwable th) {
            LogDelegate.INSTANCE.log("Failed to apply new parameters to camera.", th);
        }
    }

    public final void restartSession() {
        try {
            if (this.activeSession instanceof PictureSession) {
                this.activeSession.createSession(this.textureView);
            }
        } catch (Throwable th) {
            LogDelegate.INSTANCE.log("Failed to restart session.", th);
        }
    }

    public final void resetFlashMode() {
        this.activeSession.resetFlash();
    }

    public final void lockFocus(Rect rect) {
        Intrinsics.checkParameterIsNotNull(rect, "region");
        this.activeSession.lockFocus(rect);
    }

    public final void unlockFocus(FocusMode focusMode) {
        Intrinsics.checkParameterIsNotNull(focusMode, "focus");
        this.activeSession.unlockFocus(focusMode);
    }

    public final void startPreview(InitCallback initCallback) {
        Intrinsics.checkParameterIsNotNull(initCallback, "callback");
        PictureSession pictureSession2 = this.pictureSession;
        this.activeSession = pictureSession2;
        pictureSession2.createInitialPreviewSession(this.textureView, initCallback);
    }

    public final void takePicture(PictureCallback pictureCallback) {
        Intrinsics.checkParameterIsNotNull(pictureCallback, "callback");
        this.pictureSession.takePicture(pictureCallback);
    }

    public final void startRecording(File file, VideoCallback videoCallback) {
        Intrinsics.checkParameterIsNotNull(file, UriUtil.LOCAL_FILE_SCHEME);
        Intrinsics.checkParameterIsNotNull(videoCallback, "callback");
        this.pictureSession.release();
        VideoSession videoSession2 = this.videoSession;
        this.activeSession = videoSession2;
        videoSession2.startRecording(this.textureView, file, videoCallback);
    }

    public final void stopRecording() {
        this.videoSession.stopRecording();
        this.videoSession.release();
        PictureSession pictureSession2 = this.pictureSession;
        this.activeSession = pictureSession2;
        pictureSession2.createSession(this.textureView);
    }

    public final void release() {
        this.pictureSession.release();
        this.videoSession.release();
    }
}
