package p033co.infinum.goldeneye.extensions;

import android.app.Activity;
import android.content.Context;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import com.facebook.common.util.UriUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.config.CameraConfig;
import p033co.infinum.goldeneye.models.Facing;
import p033co.infinum.goldeneye.utils.CameraUtils;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a$\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001\u001a$\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\f"}, mo51343d2 = {"buildCamera1Instance", "Landroid/media/MediaRecorder;", "activity", "Landroid/app/Activity;", "camera", "Landroid/hardware/Camera;", "config", "Lco/infinum/goldeneye/config/CameraConfig;", "file", "Ljava/io/File;", "buildCamera2Instance", "buildInstance", "goldeneye_release"}, mo51344k = 2, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.extensions.MediaRecorderKt */
/* compiled from: MediaRecorder.kt */
public final class MediaRecorderKt {
    public static final MediaRecorder buildCamera1Instance(MediaRecorder mediaRecorder, Activity activity, Camera camera, CameraConfig cameraConfig, File file) {
        Intrinsics.checkParameterIsNotNull(mediaRecorder, "receiver$0");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(camera, "camera");
        Intrinsics.checkParameterIsNotNull(cameraConfig, "config");
        Intrinsics.checkParameterIsNotNull(file, UriUtil.LOCAL_FILE_SCHEME);
        mediaRecorder.setCamera(camera);
        mediaRecorder.setVideoSource(1);
        return buildInstance(mediaRecorder, activity, cameraConfig, file);
    }

    public static final MediaRecorder buildCamera2Instance(MediaRecorder mediaRecorder, Activity activity, CameraConfig cameraConfig, File file) {
        Intrinsics.checkParameterIsNotNull(mediaRecorder, "receiver$0");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(cameraConfig, "config");
        Intrinsics.checkParameterIsNotNull(file, UriUtil.LOCAL_FILE_SCHEME);
        mediaRecorder.setVideoSource(2);
        return buildInstance(mediaRecorder, activity, cameraConfig, file);
    }

    private static final MediaRecorder buildInstance(MediaRecorder mediaRecorder, Activity activity, CameraConfig cameraConfig, File file) {
        CamcorderProfile camcorderProfile = CamcorderProfile.get(Integer.parseInt(cameraConfig.getId()), cameraConfig.getVideoQuality().getKey());
        Context context = activity;
        if (ContextKt.hasAudioPermission(context)) {
            mediaRecorder.setAudioSource(0);
        }
        mediaRecorder.setOutputFormat(camcorderProfile.fileFormat);
        mediaRecorder.setVideoFrameRate(camcorderProfile.videoFrameRate);
        mediaRecorder.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        mediaRecorder.setVideoEncodingBitRate(camcorderProfile.videoBitRate);
        mediaRecorder.setVideoEncoder(camcorderProfile.videoCodec);
        if (ContextKt.hasAudioPermission(context)) {
            mediaRecorder.setAudioEncodingBitRate(camcorderProfile.audioBitRate);
            mediaRecorder.setAudioChannels(camcorderProfile.audioChannels);
            mediaRecorder.setAudioSamplingRate(camcorderProfile.audioSampleRate);
            mediaRecorder.setAudioEncoder(camcorderProfile.audioCodec);
        }
        mediaRecorder.setOutputFile(file.getAbsolutePath());
        int calculateDisplayOrientation = CameraUtils.INSTANCE.calculateDisplayOrientation(activity, cameraConfig);
        if (cameraConfig.getFacing() == Facing.FRONT) {
            calculateDisplayOrientation = (360 - calculateDisplayOrientation) % 360;
        }
        mediaRecorder.setOrientationHint(calculateDisplayOrientation);
        mediaRecorder.prepare();
        return mediaRecorder;
    }
}
