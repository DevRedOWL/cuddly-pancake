package org.linphone.mediastream.video.capture;

import android.hardware.Camera;
import android.view.SurfaceView;
import java.util.Iterator;
import java.util.List;
import org.linphone.mediastream.Log;
import org.linphone.mediastream.Version;
import org.linphone.mediastream.video.AndroidVideoWindowImpl;
import org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint;

public class AndroidVideoApi5JniWrapper {
    public static boolean isRecording = false;

    public static native void putImage(long j, byte[] bArr);

    public static int detectCameras(int[] iArr, int[] iArr2, int[] iArr3) {
        Log.m6901d("detectCameras\n");
        AndroidCameraConfiguration.AndroidCamera[] retrieveCameras = AndroidCameraConfiguration.retrieveCameras();
        int length = retrieveCameras.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            AndroidCameraConfiguration.AndroidCamera androidCamera = retrieveCameras[i];
            if (i2 == 2) {
                Log.m6907w("Returning only the 2 first cameras (increase buffer size to retrieve all)");
                break;
            }
            iArr[i2] = androidCamera.f6360id;
            iArr2[i2] = androidCamera.frontFacing;
            iArr3[i2] = androidCamera.orientation;
            i2++;
            i++;
        }
        return i2;
    }

    public static int[] selectNearestResolutionAvailable(int i, int i2, int i3) {
        Log.m6901d("mediastreamer", "selectNearestResolutionAvailable: " + i + ", " + i2 + MapPoint.JsonFields.f6911x + i3);
        return selectNearestResolutionAvailableForCamera(i, i2, i3);
    }

    public static void activateAutoFocus(Object obj) {
        Log.m6901d("mediastreamer", "Turning on autofocus on camera " + obj);
        Camera camera = (Camera) obj;
        if (camera == null) {
            return;
        }
        if (camera.getParameters().getFocusMode() == "auto" || camera.getParameters().getFocusMode() == "macro") {
            camera.autoFocus((Camera.AutoFocusCallback) null);
        }
    }

    public static Object startRecording(int i, int i2, int i3, int i4, int i5, final long j) {
        Log.m6901d("mediastreamer", "startRecording(" + i + ", " + i2 + ", " + i3 + ", " + i4 + ", " + i5 + ", " + j + ")");
        Camera open = Camera.open();
        applyCameraParameters(open, i2, i3, i4);
        open.setPreviewCallback(new Camera.PreviewCallback() {
            public void onPreviewFrame(byte[] bArr, Camera camera) {
                if (AndroidVideoApi5JniWrapper.isRecording) {
                    AndroidVideoApi5JniWrapper.putImage(j, bArr);
                }
            }
        });
        open.startPreview();
        isRecording = true;
        StringBuilder sb = new StringBuilder();
        sb.append("Returning camera object: ");
        sb.append(open);
        Log.m6907w("mediastreamer", sb.toString());
        return open;
    }

    public static void stopRecording(Object obj) {
        isRecording = false;
        Log.m6907w("mediastreamer", "stopRecording(" + obj + ")");
        Camera camera = (Camera) obj;
        if (camera != null) {
            camera.setPreviewCallback((Camera.PreviewCallback) null);
            camera.stopPreview();
            camera.release();
            return;
        }
        Log.m6907w("mediastreamer", "Cannot stop recording ('camera' is null)");
    }

    public static void setPreviewDisplaySurface(Object obj, Object obj2) {
        Log.m6901d("mediastreamer", "setPreviewDisplaySurface(" + obj + ", " + obj2 + ")");
        Camera camera = (Camera) obj;
        try {
            if (obj2 instanceof SurfaceView) {
                camera.setPreviewDisplay(((SurfaceView) obj2).getHolder());
            } else {
                camera.setPreviewDisplay(((AndroidVideoWindowImpl) obj2).getPreviewSurfaceView().getHolder());
            }
        } catch (Exception e) {
            Log.m6903e(e);
            e.printStackTrace();
        }
    }

    protected static int[] selectNearestResolutionAvailableForCamera(int i, int i2, int i3) {
        AndroidCameraConfiguration.AndroidCamera.Size size;
        int i4 = i2;
        int i5 = i3;
        if (i5 > i4) {
            int i6 = i5;
            i5 = i4;
            i4 = i6;
        }
        List<AndroidCameraConfiguration.AndroidCamera.Size> list = null;
        for (AndroidCameraConfiguration.AndroidCamera androidCamera : AndroidCameraConfiguration.retrieveCameras()) {
            if (androidCamera.f6360id == i) {
                list = androidCamera.resolutions;
            }
        }
        if (list == null) {
            Log.m6903e("mediastreamer", "Failed to retrieve supported resolutions.");
            return null;
        }
        Log.m6907w("mediastreamer", list.size() + " supported resolutions :");
        for (AndroidCameraConfiguration.AndroidCamera.Size next : list) {
            Log.m6907w("mediastreamer", "\t" + next.width + MapPoint.JsonFields.f6911x + next.height);
        }
        int max = Math.max(i4, i5);
        int min = Math.min(i4, i5);
        try {
            AndroidCameraConfiguration.AndroidCamera.Size size2 = list.get(0);
            int i7 = max * min;
            int i8 = Integer.MAX_VALUE;
            Iterator<AndroidCameraConfiguration.AndroidCamera.Size> it = list.iterator();
            int i9 = 0;
            while (true) {
                if (!it.hasNext()) {
                    size = size2;
                    break;
                }
                size = it.next();
                int i10 = (i7 - (size.width * size.height)) * -1;
                if (((size.width < max || size.height < min) && (size.width < min || size.height < max)) || i10 >= i8) {
                    i10 = i8;
                } else {
                    size2 = size;
                    i9 = 0;
                }
                i8 = (i7 - ((size.width * size.height) / 4)) * -1;
                if (((size.width / 2 < max || size.height / 2 < min) && (size.width / 2 < min || size.height / 2 < max)) || i8 >= i10) {
                    i8 = i10;
                } else if (Version.hasFastCpuWithAsmOptim()) {
                    size2 = size;
                    i9 = 1;
                } else {
                    i8 = i10;
                    size2 = size;
                    i9 = 0;
                }
                if (size.width == max && size.height == min) {
                    i9 = 0;
                    break;
                }
            }
            int[] iArr = {size.width, size.height, i9};
            Log.m6905i("mediastreamer", "resolution selection done (" + iArr[0] + ", " + iArr[1] + ", " + iArr[2] + ")");
            return iArr;
        } catch (Exception e) {
            Log.m6903e(e, "mediastreamer", " resolution selection failed");
            return null;
        }
    }

    protected static void applyCameraParameters(Camera camera, int i, int i2, int i3) {
        Camera.Parameters parameters = camera.getParameters();
        parameters.setPreviewSize(i, i2);
        List<Integer> supportedPreviewFrameRates = parameters.getSupportedPreviewFrameRates();
        if (supportedPreviewFrameRates != null) {
            int i4 = Integer.MAX_VALUE;
            for (Integer next : supportedPreviewFrameRates) {
                int abs = Math.abs(next.intValue() - i3);
                if (abs < i4) {
                    parameters.setPreviewFrameRate(next.intValue());
                    i4 = abs;
                }
            }
            Log.m6901d("mediastreamer", "Preview framerate set:" + parameters.getPreviewFrameRate());
        }
        camera.setParameters(parameters);
    }
}
