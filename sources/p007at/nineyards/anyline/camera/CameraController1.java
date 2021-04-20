package p007at.nineyards.anyline.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.DebugKt;
import p007at.nineyards.anyline.camera.CameraFeatures;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.models.AnylineYuvImage;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint;

/* renamed from: at.nineyards.anyline.camera.CameraController1 */
public class CameraController1 extends CameraController {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f255b = CameraController1.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Object f256c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f257d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public SurfaceHolder f258e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Camera f259f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f260g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f261h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f262i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public AnylineYuvImage[] f263j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f264k;

    /* renamed from: l */
    private int f265l;

    /* renamed from: m */
    private int f266m;

    /* renamed from: n */
    private Rect f267n;

    /* renamed from: o */
    private int f268o = 0;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f269p = false;

    /* renamed from: q */
    private Camera.PreviewCallback f270q = new Camera.PreviewCallback() {

        /* renamed from: b */
        private ImageReceiver f273b;

        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            synchronized (CameraController1.f256c) {
                if (CameraController1.this.imageListener != null) {
                    if (this.f273b == null) {
                        this.f273b = new ImageReceiver();
                    }
                    this.f273b.mo12223a(CameraController1.this.f263j[CameraController1.this.f262i]);
                    CameraController1.this.imageListener.onImageAvailable(this.f273b);
                }
                int unused = CameraController1.this.f262i = 1 - CameraController1.this.f262i;
                camera.addCallbackBuffer(CameraController1.this.f263j[CameraController1.this.f262i].getData());
                boolean unused2 = CameraController1.this.f264k = true;
            }
        }
    };

    /* renamed from: r */
    private Camera.AutoFocusCallback f271r = new Camera.AutoFocusCallback() {
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onAutoFocus(boolean r2, android.hardware.Camera r3) {
            /*
                r1 = this;
                java.lang.Object r2 = p007at.nineyards.anyline.camera.CameraController1.f256c
                monitor-enter(r2)
                at.nineyards.anyline.camera.CameraController1 r3 = p007at.nineyards.anyline.camera.CameraController1.this     // Catch:{ all -> 0x0067 }
                boolean unused = r3.f269p = false     // Catch:{ all -> 0x0067 }
                at.nineyards.anyline.camera.CameraController1 r3 = p007at.nineyards.anyline.camera.CameraController1.this     // Catch:{ all -> 0x0067 }
                android.hardware.Camera r3 = r3.f259f     // Catch:{ all -> 0x0067 }
                if (r3 != 0) goto L_0x0014
                monitor-exit(r2)     // Catch:{ all -> 0x0067 }
                return
            L_0x0014:
                java.lang.String r3 = android.os.Build.MODEL     // Catch:{ all -> 0x0067 }
                java.lang.String r0 = "GT-I9060"
                boolean r3 = r3.contains(r0)     // Catch:{ all -> 0x0067 }
                if (r3 == 0) goto L_0x0029
                at.nineyards.anyline.camera.CameraController1 r3 = p007at.nineyards.anyline.camera.CameraController1.this     // Catch:{ all -> 0x0067 }
                android.hardware.Camera r3 = r3.f259f     // Catch:{ all -> 0x0067 }
                r3.cancelAutoFocus()     // Catch:{ all -> 0x0067 }
                monitor-exit(r2)     // Catch:{ all -> 0x0067 }
                return
            L_0x0029:
                at.nineyards.anyline.camera.CameraController1 r3 = p007at.nineyards.anyline.camera.CameraController1.this     // Catch:{ all -> 0x0067 }
                android.hardware.Camera r3 = r3.f259f     // Catch:{ all -> 0x0067 }
                if (r3 == 0) goto L_0x0065
                at.nineyards.anyline.camera.CameraController1 r3 = p007at.nineyards.anyline.camera.CameraController1.this     // Catch:{ all -> 0x0067 }
                android.hardware.Camera r3 = r3.f259f     // Catch:{ all -> 0x0067 }
                android.hardware.Camera$Parameters r3 = r3.getParameters()     // Catch:{ all -> 0x0067 }
                boolean r3 = r3.isAutoExposureLockSupported()     // Catch:{ all -> 0x0067 }
                if (r3 == 0) goto L_0x0065
                at.nineyards.anyline.camera.CameraController1 r3 = p007at.nineyards.anyline.camera.CameraController1.this     // Catch:{ all -> 0x0067 }
                android.hardware.Camera r3 = r3.f259f     // Catch:{ all -> 0x0067 }
                android.hardware.Camera$Parameters r3 = r3.getParameters()     // Catch:{ all -> 0x0067 }
                r0 = 1
                r3.setAutoExposureLock(r0)     // Catch:{ all -> 0x0067 }
                at.nineyards.anyline.camera.CameraController1 r0 = p007at.nineyards.anyline.camera.CameraController1.this     // Catch:{ all -> 0x0067 }
                android.hardware.Camera r0 = r0.f259f     // Catch:{ all -> 0x0067 }
                r0.setParameters(r3)     // Catch:{ all -> 0x0067 }
                r0 = 0
                r3.setAutoExposureLock(r0)     // Catch:{ all -> 0x0067 }
                at.nineyards.anyline.camera.CameraController1 r0 = p007at.nineyards.anyline.camera.CameraController1.this     // Catch:{ all -> 0x0067 }
                android.hardware.Camera r0 = r0.f259f     // Catch:{ all -> 0x0067 }
                r0.setParameters(r3)     // Catch:{ all -> 0x0067 }
            L_0x0065:
                monitor-exit(r2)     // Catch:{ all -> 0x0067 }
                return
            L_0x0067:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0067 }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.camera.CameraController1.C07352.onAutoFocus(boolean, android.hardware.Camera):void");
        }
    };

    CameraController1(final Context context) {
        this.f257d = context;
        SurfaceView surfaceView = new SurfaceView(context);
        this.previewView = surfaceView;
        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                String unused = CameraController1.f255b;
                if (context.getPackageManager().checkPermission("android.permission.CAMERA", context.getPackageName()) != -1) {
                    synchronized (CameraController1.f256c) {
                        SurfaceHolder unused2 = CameraController1.this.f258e = surfaceHolder;
                    }
                    CameraController1.this.openCameraInBackground();
                    return;
                }
                throw new RuntimeException("Camera usage not permitted. Make sure \"<uses-permission android:name=\"android.permission.CAMERA\" />\" is set in the manifest.");
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                String unused = CameraController1.f255b;
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                String unused = CameraController1.f255b;
                synchronized (CameraController1.f256c) {
                    SurfaceHolder unused2 = CameraController1.this.f258e = null;
                    if (CameraController1.this.f259f != null) {
                        CameraController1.this.releaseCameraInBackground();
                    }
                }
            }
        });
    }

    public boolean hasNewImage() {
        boolean z;
        synchronized (f256c) {
            z = this.f264k;
        }
        return z;
    }

    public AnylineYuvImage getNewImage() {
        synchronized (f256c) {
            if (!this.f264k) {
                return null;
            }
            this.f264k = false;
            AnylineYuvImage anylineYuvImage = this.f263j[1 - this.f262i];
            return anylineYuvImage;
        }
    }

    public AnylineYuvImage getNewImage(int i, int i2, int i3, int i4, boolean z) {
        synchronized (f256c) {
            AnylineYuvImage newImage = getNewImage();
            if (newImage == null) {
                return null;
            }
            AnylineYuvImage crop = newImage.crop(i, i2, i3, i4, z);
            return crop;
        }
    }

    public AnylineImage getLastImageWithFullSize() {
        synchronized (f256c) {
            int i = 1 - this.f262i;
            if (this.f263j == null) {
                return null;
            }
            AnylineImage anylineImage = new AnylineImage(this.f263j[i].clone());
            return anylineImage;
        }
    }

    public ImageReceiver getLastImageWithFullSizeReceiver() {
        synchronized (f256c) {
            int i = 1 - this.f262i;
            if (this.f263j == null) {
                return null;
            }
            ImageReceiver imageReceiver = new ImageReceiver();
            imageReceiver.mo12223a(this.f263j[i]);
            return imageReceiver;
        }
    }

    public void takeHighResolutionImage() {
        synchronized (f256c) {
            if (this.highResolutionImageListener == null) {
                Log.w(f255b, "No listener for takeHighResolutionImage registered. Skipping");
            } else if (!this.f261h) {
                Log.w(f255b, "Can't take picture now. (Either camera not open or a picture is currently been taken)");
            } else {
                this.f261h = false;
                this.f259f.takePicture((Camera.ShutterCallback) null, (Camera.PictureCallback) null, new Camera.PictureCallback() {
                    public final void onPictureTaken(byte[] bArr, Camera camera) {
                        Log.d(CameraController1.f255b, "take Picture is called");
                        int cameraRotation = CameraUtil.getCameraRotation(CameraController1.this.f257d, CameraController1.this.f260g);
                        try {
                            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                            Matrix matrix = new Matrix();
                            matrix.postRotate((float) cameraRotation);
                            CameraController1.this.highResolutionImageListener.onImageTaken(new AnylineImage(Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true)));
                        } catch (OutOfMemoryError e) {
                            CameraController1.m58a(CameraController1.this, (Throwable) e);
                        }
                        synchronized (CameraController1.f256c) {
                            try {
                                camera.startPreview();
                                boolean unused = CameraController1.this.f261h = true;
                            } catch (RuntimeException e2) {
                                String b = CameraController1.f255b;
                                Log.d(b, "Error restarting the preview: " + e2.getMessage());
                                CameraController1.this.reportCameraError(e2);
                                boolean unused2 = CameraController1.this.f261h = false;
                            }
                        }
                    }
                });
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFlashOn(boolean r3) {
        /*
            r2 = this;
            java.lang.Object r0 = f256c
            monitor-enter(r0)
            android.hardware.Camera r1 = r2.f259f     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0034
            at.nineyards.anyline.camera.CameraFeatures r1 = r2.cameraFeatures     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0034
            at.nineyards.anyline.camera.CameraFeatures r1 = r2.cameraFeatures     // Catch:{ all -> 0x0036 }
            boolean r1 = r1.isFlashSupported()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0014
            goto L_0x0034
        L_0x0014:
            android.hardware.Camera r1 = r2.f259f     // Catch:{ all -> 0x0036 }
            android.hardware.Camera$Parameters r1 = r1.getParameters()     // Catch:{ all -> 0x0036 }
            if (r3 != 0) goto L_0x0027
            java.lang.String r3 = "off"
            r1.setFlashMode(r3)     // Catch:{ all -> 0x0036 }
            android.hardware.Camera r3 = r2.f259f     // Catch:{ all -> 0x0036 }
            r3.setParameters(r1)     // Catch:{ all -> 0x0036 }
            goto L_0x0032
        L_0x0027:
            java.lang.String r3 = "torch"
            r1.setFlashMode(r3)     // Catch:{ all -> 0x0036 }
            android.hardware.Camera r3 = r2.f259f     // Catch:{ all -> 0x0036 }
            r3.setParameters(r1)     // Catch:{ all -> 0x0036 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            return
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            return
        L_0x0036:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.camera.CameraController1.setFlashOn(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callAutoFocus() {
        /*
            r5 = this;
            java.lang.Object r0 = f256c
            monitor-enter(r0)
            android.hardware.Camera r1 = r5.f259f     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x0010
            java.lang.String r1 = f255b     // Catch:{ all -> 0x005e }
            java.lang.String r2 = "Camera is null - autofocus not called"
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x005e }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0010:
            at.nineyards.anyline.camera.CameraConfig r1 = r5.cameraConfig     // Catch:{ all -> 0x005e }
            boolean r1 = r1.isFocusModeAuto()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x005c
            boolean r1 = r5.f269p     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x001d
            goto L_0x005c
        L_0x001d:
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ RuntimeException -> 0x0042 }
            java.lang.String r2 = "SM-G357FZ"
            boolean r1 = r1.contains(r2)     // Catch:{ RuntimeException -> 0x0042 }
            if (r1 != 0) goto L_0x002c
            android.hardware.Camera r1 = r5.f259f     // Catch:{ RuntimeException -> 0x0042 }
            r1.cancelAutoFocus()     // Catch:{ RuntimeException -> 0x0042 }
        L_0x002c:
            at.nineyards.anyline.camera.CameraConfig r1 = r5.cameraConfig     // Catch:{ RuntimeException -> 0x0042 }
            boolean r1 = r1.isUpdateRegionsOnAutoFocusEnabled()     // Catch:{ RuntimeException -> 0x0042 }
            if (r1 == 0) goto L_0x0037
            r5.m63c()     // Catch:{ RuntimeException -> 0x0042 }
        L_0x0037:
            r1 = 1
            r5.f269p = r1     // Catch:{ RuntimeException -> 0x0042 }
            android.hardware.Camera r1 = r5.f259f     // Catch:{ RuntimeException -> 0x0042 }
            android.hardware.Camera$AutoFocusCallback r2 = r5.f271r     // Catch:{ RuntimeException -> 0x0042 }
            r1.autoFocus(r2)     // Catch:{ RuntimeException -> 0x0042 }
            goto L_0x005a
        L_0x0042:
            r1 = move-exception
            java.lang.String r2 = f255b     // Catch:{ all -> 0x005e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x005e }
            java.lang.String r4 = "Exception when calling autofocus: "
            r3.<init>(r4)     // Catch:{ all -> 0x005e }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x005e }
            r3.append(r1)     // Catch:{ all -> 0x005e }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x005e }
            android.util.Log.d(r2, r1)     // Catch:{ all -> 0x005e }
        L_0x005a:
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x005e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.camera.CameraController1.callAutoFocus():void");
    }

    public void openCameraReportError() {
        synchronized (f256c) {
            if (this.f258e == null) {
                Log.d(f255b, "Skip camera opening: No surface holder exists.");
            } else if (this.f259f != null) {
                Log.d(f255b, "Skip camera opening: A camera is already open.");
            } else {
                try {
                    Log.d(f255b, "open camera");
                    int numberOfCameras = Camera.getNumberOfCameras();
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    int i = 0;
                    while (true) {
                        if (i >= numberOfCameras) {
                            break;
                        }
                        Camera.getCameraInfo(i, cameraInfo);
                        if (CameraFeatures.LensFacing.fromCamera1(cameraInfo.facing) == this.preferredCameraConfig.lensFacing) {
                            this.f259f = Camera.open(i);
                            this.f260g = i;
                            break;
                        }
                        i++;
                    }
                    if (this.f259f == null && this.preferredCameraConfig.fallbackLensFacings != null && !this.preferredCameraConfig.fallbackLensFacings.isEmpty()) {
                        Iterator it = this.preferredCameraConfig.fallbackLensFacings.iterator();
                        while (it.hasNext()) {
                            CameraFeatures.LensFacing lensFacing = (CameraFeatures.LensFacing) it.next();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= numberOfCameras) {
                                    break;
                                }
                                Camera.getCameraInfo(i2, cameraInfo);
                                if (CameraFeatures.LensFacing.fromCamera1(cameraInfo.facing) == lensFacing) {
                                    this.f259f = Camera.open(i2);
                                    this.f260g = i2;
                                    break;
                                }
                                i2++;
                            }
                            if (this.f259f != null) {
                                break;
                            }
                        }
                    }
                    if (this.f259f != null) {
                        this.cameraFeatures = new CameraFeatures1(this.f260g, this.f259f);
                        this.cameraConfig = new CameraConfig(this.f257d, this.preferredCameraConfig, this.cameraFeatures, this.previewView.getWidth(), this.previewView.getHeight());
                        int width = this.previewView.getWidth();
                        int height = this.previewView.getHeight();
                        String str = f255b;
                        Log.d(str, "Initializing camera. View size: " + width + MapPoint.JsonFields.f6911x + height);
                        Camera.Parameters parameters = this.f259f.getParameters();
                        int cameraDisplayRotation = CameraUtil.getCameraDisplayRotation(this.f257d, this.f260g);
                        int cameraRotation = CameraUtil.getCameraRotation(this.f257d, this.f260g);
                        if (!Build.MODEL.contains("bt2pro")) {
                            this.f259f.setDisplayOrientation(cameraDisplayRotation);
                            this.f265l = this.cameraConfig.getPreviewSize().getLonger();
                            this.f266m = this.cameraConfig.getPreviewSize().getShorter();
                            parameters.setPreviewFormat(17);
                            parameters.setPreviewSize(this.f265l, this.f266m);
                            parameters.setPictureSize(this.cameraConfig.getPictureSize().getWidth(), this.cameraConfig.getPictureSize().getHeight());
                            parameters.setFocusMode(this.cameraConfig.getFocusMode().toCamera1());
                            String camera1 = this.cameraConfig.getSceneMode().toCamera1();
                            if (!"auto".equals(camera1)) {
                                parameters.setSceneMode(camera1);
                            }
                            if (this.cameraConfig.isVideoStabilizationEnabled()) {
                                parameters.setVideoStabilization(true);
                            }
                            CameraFeatures.FpsRange fpsRange = null;
                            if (this.preferredMinPreviewFps != 0 && this.preferredMaxPreviewFps != 0) {
                                fpsRange = CameraUtil.getBiggestFittingPreviewFps(this.cameraFeatures.getFpsRanges(), this.preferredMinPreviewFps, this.preferredMaxPreviewFps);
                                if (fpsRange == null) {
                                    String str2 = f255b;
                                    Log.d(str2, "Preview FPS of (" + this.preferredMinPreviewFps + ", " + this.preferredMaxPreviewFps + ") is not available. Using default.");
                                }
                            } else if (this.isUseMaxFpsRange) {
                                fpsRange = this.cameraFeatures.getMaxFpsRange();
                            }
                            if (fpsRange != null) {
                                parameters.setPreviewFpsRange(fpsRange.getLower(), fpsRange.getUpper());
                                String str3 = f255b;
                                Log.d(str3, "Preview FPS set to " + fpsRange);
                            }
                        } else {
                            parameters.set("exposure", "sports");
                            parameters.set("whitebalance", "fluorescent");
                            parameters.set("effect", "vivid");
                        }
                        this.f259f.setParameters(parameters);
                        int bitsPerPixel = ((this.f265l * this.f266m) * ImageFormat.getBitsPerPixel(parameters.getPreviewFormat())) / 8;
                        if (CameraFeatures.LensFacing.FRONT.equals(this.cameraConfig.getLensFacing()) && cameraDisplayRotation == 90) {
                            cameraDisplayRotation = cameraRotation;
                        }
                        this.f263j = new AnylineYuvImage[]{new AnylineYuvImage(17, getFrameWidth(), getFrameHeight(), new byte[bitsPerPixel], cameraDisplayRotation, false), new AnylineYuvImage(17, getFrameWidth(), getFrameHeight(), new byte[bitsPerPixel], cameraDisplayRotation, false)};
                        this.f262i = 0;
                        this.f259f.addCallbackBuffer(this.f263j[this.f262i].getData());
                        this.f259f.setPreviewCallbackWithBuffer(this.f270q);
                        this.previewView.post(new Runnable() {
                            public final void run() {
                                CameraController1.this.previewView.getParent().requestLayout();
                            }
                        });
                        this.f259f.setPreviewDisplay(this.f258e);
                        Log.d(f255b, "Camera start preview");
                        this.f259f.startPreview();
                        this.f261h = true;
                        this.f259f.cancelAutoFocus();
                        Camera.Parameters parameters2 = this.f259f.getParameters();
                        parameters2.setFocusMode(this.cameraConfig.getFocusMode().toCamera1());
                        List<String> supportedFlashModes = parameters2.getSupportedFlashModes();
                        if (supportedFlashModes != null && supportedFlashModes.contains(DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
                            parameters2.setFlashMode(DebugKt.DEBUG_PROPERTY_VALUE_OFF);
                        }
                        this.f259f.setParameters(parameters2);
                        initAutoFocusTimer();
                        callAutoFocus();
                        if (this.f249a != null) {
                            this.f249a.mo11936a();
                        }
                        if (this.cameraListener == null) {
                            String str4 = f255b;
                            Log.d(str4, "Camera opened successfully. Frame resolution " + this.cameraConfig.getFrameWidth() + " x " + this.cameraConfig.getFrameHeight());
                        } else {
                            this.previewView.post(new Runnable() {
                                public final void run() {
                                    CameraOpenListener cameraOpenListener = CameraController1.this.cameraListener;
                                    CameraController1 cameraController1 = CameraController1.this;
                                    cameraOpenListener.onCameraOpened(cameraController1, cameraController1.cameraConfig.getFrameWidth(), CameraController1.this.cameraConfig.getFrameHeight());
                                }
                            });
                        }
                        Log.d(f255b, "Camera Initialized");
                    } else {
                        throw new Exception("No camera found found meeting the requirements of defaultCamera or fallbackCameras");
                    }
                } catch (Exception e) {
                    String str5 = f255b;
                    Log.d(str5, "Error initializing camera: " + e.getMessage());
                    reportCameraError(e);
                }
            }
        }
    }

    public void openCameraInBackground() {
        synchronized (f256c) {
            if (this.f258e == null) {
                Log.d(f255b, "Skip camera opening: No surface holder exists.");
            } else if (this.f259f != null) {
                Log.d(f255b, "Skip camera opening: A camera is already open.");
            } else {
                new Thread(new Runnable() {
                    public final void run() {
                        CameraController1.this.openCameraReportError();
                    }
                }).start();
            }
        }
    }

    public void releaseCameraInBackground() {
        synchronized (f256c) {
            if (this.f259f != null) {
                new Thread(new Runnable() {
                    public final void run() {
                        CameraController1.this.releaseCamera();
                    }
                }).start();
            }
        }
    }

    public void releaseCamera() {
        synchronized (f256c) {
            stopAutoFocusTimer();
            if (this.f259f != null) {
                this.f259f.stopPreview();
                this.f259f.release();
                this.f259f = null;
                this.f261h = false;
                Log.d(f255b, "Camera released");
            }
        }
    }

    public Camera getCamera() {
        return this.f259f;
    }

    public void resetPreviewCallback() {
        synchronized (f256c) {
            this.f262i = 1 - this.f262i;
            this.f259f.addCallbackBuffer(this.f263j[this.f262i].getData());
            this.f259f.setPreviewCallbackWithBuffer(this.f270q);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12053a(Context context, RectF rectF, float f, float f2) {
        synchronized (f256c) {
            if (this.f259f != null) {
                if (this.cameraConfig.isFocusRegionEnabled() || this.cameraConfig.isAutoExposureRegionEnabled()) {
                    this.f267n = CameraUtil.m110a(CameraUtil.getCameraDisplayRotation(context, this.f260g), rectF, f, f2);
                    m63c();
                    return;
                }
            }
            this.f267n = null;
        }
    }

    /* renamed from: c */
    private void m63c() {
        synchronized (f256c) {
            if (this.f267n != null) {
                Camera.Parameters parameters = this.f259f.getParameters();
                int i = this.f267n.left;
                int i2 = this.f267n.top;
                int i3 = this.f267n.right;
                int i4 = this.f267n.bottom;
                int i5 = this.f268o;
                this.f268o = i5 + 1;
                Camera.Area area = new Camera.Area(new Rect(i, i2, i3, i4 + (i5 % 2)), 1000);
                ArrayList arrayList = new ArrayList();
                arrayList.add(area);
                if (this.cameraConfig.isFocusRegionEnabled()) {
                    parameters.setFocusAreas(arrayList);
                } else if (parameters.getMaxNumFocusAreas() > 0) {
                    parameters.setFocusAreas((List) null);
                }
                if (this.cameraConfig.isAutoExposureRegionEnabled()) {
                    parameters.setMeteringAreas(arrayList);
                } else if (parameters.getMaxNumMeteringAreas() > 0) {
                    parameters.setMeteringAreas((List) null);
                }
                this.f259f.setParameters(parameters);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setEpsonConfig(String str, String str2, String str3, String str4, float f) {
        if (this.f259f != null && Build.MODEL.contains("bt2pro")) {
            Camera.Parameters parameters = this.f259f.getParameters();
            parameters.setPreviewFormat(17);
            this.f265l = 1920;
            this.f266m = PhotoshopDirectory.TAG_COUNT_INFORMATION;
            if (str2 != null) {
                String[] split = str2.split(MapPoint.JsonFields.f6911x);
                if (split.length == 2) {
                    this.f265l = Integer.parseInt(split[0]);
                    this.f266m = Integer.parseInt(split[1]);
                }
            }
            this.cameraConfig.frameSize = new CameraSize(this.f265l, this.f266m);
            this.cameraConfig.frameToViewScale = f;
            String str5 = "1280x720";
            parameters.set("preview-size", str2 == null ? str5 : str2);
            if (str3 != null) {
                str5 = str3;
            }
            parameters.set("picture-size", str5);
            parameters.set("preview-fps-range", str4 == null ? "15000,15000" : str4);
            try {
                Method method = parameters.getClass().getMethod("setEpsonCameraMode", new Class[]{String.class});
                Object[] objArr = new Object[1];
                objArr[0] = str == null ? "single-through-1080p" : str;
                method.invoke(parameters, objArr);
                String str6 = f255b;
                Log.d(str6, "setEpsonConfig: " + str + " PreviewSize: " + str2 + " pictureSize: " + str3 + " fps:" + str4);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
            }
            this.f259f.setParameters(parameters);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12088a(String str) {
        if (this.f259f != null && Build.MODEL.contains("bt2pro")) {
            Camera.Parameters parameters = this.f259f.getParameters();
            try {
                parameters.set("exposure-compensation", str);
                this.f259f.setParameters(parameters);
            } catch (Exception unused) {
                Log.e(f255b, "failed to set exposure - compensation");
            }
            String str2 = f255b;
            Log.i(str2, "EpsonCamera - change exposure compensation: " + parameters.get("exposure-compensation"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12090b(String str) {
        if (this.f259f != null && Build.MODEL.contains("bt2pro")) {
            Camera.Parameters parameters = this.f259f.getParameters();
            parameters.set("whitebalance", str);
            this.f259f.setParameters(parameters);
            String str2 = f255b;
            Log.i(str2, "EpsonCamera- change whitebalance " + parameters.get("whitebalance"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12087a(int i) {
        if (this.f259f != null && Build.MODEL.contains("bt2pro")) {
            Camera.Parameters parameters = this.f259f.getParameters();
            try {
                parameters.getClass().getDeclaredMethod("setSharpness", new Class[]{Integer.TYPE}).invoke(parameters, new Object[]{Integer.valueOf(i)});
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
            }
            this.f259f.setParameters(parameters);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12089b(int i) {
        if (this.f259f != null && Build.MODEL.contains("bt2pro")) {
            Camera.Parameters parameters = this.f259f.getParameters();
            try {
                parameters.getClass().getDeclaredMethod("setContrast", new Class[]{Integer.TYPE}).invoke(parameters, new Object[]{Integer.valueOf(i)});
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
            }
            this.f259f.setParameters(parameters);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m58a(CameraController1 cameraController1, final Throwable th) {
        if (cameraController1.highResolutionImageListener != null) {
            cameraController1.previewView.post(new Runnable() {
                public final void run() {
                    CameraController1.this.highResolutionImageListener.onError(th);
                }
            });
            return;
        }
        throw new RuntimeException(th);
    }
}
