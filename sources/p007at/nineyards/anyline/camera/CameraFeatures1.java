package p007at.nineyards.anyline.camera;

import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p007at.nineyards.anyline.camera.CameraFeatures;

/* renamed from: at.nineyards.anyline.camera.CameraFeatures1 */
public class CameraFeatures1 extends CameraFeatures {

    /* renamed from: a */
    private static final String f341a = CameraFeatures1.class.getSimpleName();
    protected int cameraId;
    protected List<String> flashModes;
    protected float focalLength = Float.NaN;
    protected int maxDetectedFaces = 0;
    protected int maxZoom = 0;
    protected List<Integer> zoomRatios;

    public CameraFeatures1(int i, Camera camera) {
        boolean z = false;
        this.cameraId = i;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        this.lensFacing = CameraFeatures.LensFacing.fromCamera1(cameraInfo.facing);
        this.canDisableShutterSound = Build.VERSION.SDK_INT >= 17 && cameraInfo.canDisableShutterSound;
        this.sensorOrientation = cameraInfo.orientation;
        Camera.Parameters parameters = camera.getParameters();
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        this.focusModes = new ArrayList(supportedFocusModes.size());
        for (String fromCamera1 : supportedFocusModes) {
            this.focusModes.add(CameraFeatures.FocusMode.fromCamera1(fromCamera1));
        }
        List<String> supportedSceneModes = parameters.getSupportedSceneModes();
        if (supportedSceneModes != null) {
            this.sceneModes = new ArrayList(supportedSceneModes.size());
            for (String fromCamera12 : supportedSceneModes) {
                CameraFeatures.SceneMode fromCamera13 = CameraFeatures.SceneMode.fromCamera1(fromCamera12);
                if (fromCamera13 != CameraFeatures.SceneMode.NON_STANDARD) {
                    this.sceneModes.add(fromCamera13);
                }
            }
        }
        this.flashModes = parameters.getSupportedFlashModes();
        List<String> list = this.flashModes;
        this.flashSupported = list != null && list.contains("torch");
        this.maxFocusRegions = parameters.getMaxNumFocusAreas();
        this.maxAutoExposureRegions = parameters.getMaxNumMeteringAreas();
        this.zoomSupported = parameters.isZoomSupported();
        if (this.zoomSupported) {
            this.zoomRatios = parameters.getZoomRatios();
            this.maxZoom = parameters.getMaxZoom();
        }
        this.maxDetectedFaces = parameters.getMaxNumDetectedFaces();
        this.faceDetectionSupported = this.maxDetectedFaces > 0 ? true : z;
        List<Integer> supportedPreviewFormats = parameters.getSupportedPreviewFormats();
        List<Integer> supportedPictureFormats = parameters.getSupportedPictureFormats();
        this.outputFormats = new ArrayList(supportedPreviewFormats.size() + supportedPictureFormats.size());
        for (Integer intValue : supportedPreviewFormats) {
            this.outputFormats.add(CameraFeatures.OutputFormat.fromImageFormat(intValue.intValue()));
        }
        for (Integer intValue2 : supportedPictureFormats) {
            this.outputFormats.add(CameraFeatures.OutputFormat.fromImageFormat(intValue2.intValue()));
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        this.previewSizes = new ArrayList(supportedPreviewSizes.size());
        for (Camera.Size cameraSize : supportedPreviewSizes) {
            this.previewSizes.add(new CameraSize(cameraSize));
        }
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        this.pictureSizes = new ArrayList(supportedPictureSizes.size());
        for (Camera.Size cameraSize2 : supportedPictureSizes) {
            this.pictureSizes.add(new CameraSize(cameraSize2));
        }
        List<Camera.Size> supportedVideoSizes = parameters.getSupportedVideoSizes();
        if (supportedVideoSizes != null) {
            this.videoSizes = new ArrayList(supportedVideoSizes.size());
            for (Camera.Size cameraSize3 : supportedVideoSizes) {
                this.videoSizes.add(new CameraSize(cameraSize3));
            }
        }
        this.videoStabilizationSupported = parameters.isVideoStabilizationSupported();
        this.fpsRanges = CameraFeatures.FpsRange.getRangesFromCamera1(parameters.getSupportedPreviewFpsRange());
        this.minExposure = parameters.getMinExposureCompensation();
        this.maxExposure = parameters.getMaxExposureCompensation();
        try {
            this.exposureStep = parameters.getExposureCompensationStep();
        } catch (Exception e) {
            Log.e(f341a, "Exception while reading exposure compensation step.", e);
            this.exposureStep = 0.33333334f;
        }
        this.autoExposureLockSupported = parameters.isAutoExposureLockSupported();
        try {
            this.focalLength = parameters.getFocalLength();
        } catch (Exception unused) {
        }
    }

    public boolean isAutoExposureLockSupported() {
        return this.autoExposureLockSupported;
    }
}
