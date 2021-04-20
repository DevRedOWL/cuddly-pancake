package org.linphone.mediastream.video.capture.hwconf;

import android.hardware.Camera;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.linphone.mediastream.Version;

public class AndroidCameraConfiguration {
    private static String TAG = "AndroidCameraConfiguration";
    private static AndroidCamera[] camerasCache;

    public static AndroidCamera[] retrieveCameras() {
        initCamerasCache();
        return camerasCache;
    }

    public static boolean hasSeveralCameras() {
        initCamerasCache();
        return camerasCache.length > 1;
    }

    public static boolean hasFrontCamera() {
        initCamerasCache();
        for (AndroidCamera androidCamera : camerasCache) {
            if (androidCamera.frontFacing) {
                return true;
            }
        }
        return false;
    }

    private static void initCamerasCache() {
        AndroidCamera[] androidCameraArr = camerasCache;
        if (androidCameraArr == null || androidCameraArr.length == 0) {
            try {
                String str = TAG;
                Log.w(str, "sdk version" + Version.sdk());
                if (Version.sdk() < 9) {
                    camerasCache = probeCamerasSDK5();
                } else if (Version.sdk() < 21 || Version.sdk() == 22) {
                    camerasCache = probeCamerasSDK9();
                } else {
                    camerasCache = probeCamerasSDK21();
                }
            } catch (Exception e) {
                String str2 = TAG;
                Log.e(str2, "Error: cannot retrieve cameras information (busy ?)" + e);
                e.printStackTrace();
                camerasCache = new AndroidCamera[0];
            }
        }
    }

    static AndroidCamera[] probeCamerasSDK5() {
        return AndroidCameraConfigurationReader5.probeCameras();
    }

    static AndroidCamera[] probeCamerasSDK9() {
        return AndroidCameraConfigurationReader9.probeCameras();
    }

    static AndroidCamera[] probeCamerasSDK21() {
        return AndroidCameraConfigurationReader21.probeCameras();
    }

    public static class AndroidCamera {
        public boolean frontFacing;

        /* renamed from: id */
        public int f6360id;
        public int orientation;
        public List<Size> resolutions;

        public static class Size {
            public final int height;
            public final int width;

            public Size(int i, int i2) {
                this.width = i;
                this.height = i2;
            }
        }

        public AndroidCamera(int i, boolean z, List<Size> list, int i2) {
            this.f6360id = i;
            this.frontFacing = z;
            this.orientation = i2;
            this.resolutions = list;
        }

        public AndroidCamera(int i, boolean z, int i2, List<Camera.Size> list) {
            this.resolutions = new ArrayList(list.size());
            for (Camera.Size next : list) {
                this.resolutions.add(new Size(next.width, next.height));
            }
            this.f6360id = i;
            this.frontFacing = z;
            this.orientation = i2;
        }
    }
}
