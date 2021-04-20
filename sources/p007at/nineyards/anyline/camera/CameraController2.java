package p007at.nineyards.anyline.camera;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p007at.nineyards.anyline.camera.CameraFeatures;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.models.AnylineYuvImage;

/* renamed from: at.nineyards.anyline.camera.CameraController2 */
public class CameraController2 extends CameraController {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f284b = CameraController2.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Object f285c = new Object();

    /* renamed from: A */
    private int f286A = 0;

    /* renamed from: B */
    private CameraCaptureSession.CaptureCallback f287B = new CameraCaptureSession.CaptureCallback() {
        /* renamed from: a */
        private void m103a(CaptureResult captureResult) {
            int i = C07473.f318a[CameraController2.this.f291f.ordinal()];
            if (i == 1) {
                return;
            }
            if (i == 2) {
                Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    CameraController2.m81b(CameraController2.this);
                } else if (4 == num.intValue() || 5 == num.intValue()) {
                    Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num2 == null || num2.intValue() == 2) {
                        State unused = CameraController2.this.f291f = State.PICTURE_TAKEN;
                        CameraController2.m81b(CameraController2.this);
                        return;
                    }
                    CameraController2.m83c(CameraController2.this);
                }
            } else if (i == 3) {
                Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num3 == null || num3.intValue() == 5 || num3.intValue() == 4) {
                    State unused2 = CameraController2.this.f291f = State.WAITING_NON_PRECAPTURE;
                }
            } else if (i == 4) {
                Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num4 == null || num4.intValue() != 5) {
                    State unused3 = CameraController2.this.f291f = State.PICTURE_TAKEN;
                    CameraController2.m81b(CameraController2.this);
                }
            }
        }

        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            m103a(captureResult);
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            m103a(totalCaptureResult);
        }
    };

    /* renamed from: C */
    private final CameraDevice.StateCallback f288C = new CameraDevice.StateCallback() {
        public final void onOpened(CameraDevice cameraDevice) {
            CameraController2.this.f294i.release();
            CameraDevice unused = CameraController2.this.f293h = cameraDevice;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                CameraController2.m87e(CameraController2.this);
            } catch (CameraAccessException e2) {
                CameraController2.this.reportCameraError(e2);
            }
        }

        public final void onDisconnected(CameraDevice cameraDevice) {
            CameraController2.this.f294i.release();
            cameraDevice.close();
            CameraDevice unused = CameraController2.this.f293h = null;
        }

        public final void onError(CameraDevice cameraDevice, int i) {
            CameraController2.this.f294i.release();
            cameraDevice.close();
            CameraDevice unused = CameraController2.this.f293h = null;
            CameraController2 cameraController2 = CameraController2.this;
            cameraController2.reportCameraError(new Exception("Camera opening failed with error code: " + i));
        }
    };

    /* renamed from: d */
    private final Context f289d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C0764b f290e = new C0764b();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public State f291f = State.PREVIEW;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public SurfaceTexture f292g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public CameraDevice f293h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Semaphore f294i = new Semaphore(1);

    /* renamed from: j */
    private CaptureRequest.Builder f295j;

    /* renamed from: k */
    private String f296k;

    /* renamed from: l */
    private CameraCharacteristics f297l;

    /* renamed from: m */
    private HandlerThread f298m;

    /* renamed from: n */
    private Handler f299n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f300o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public CameraCaptureSession f301p;

    /* renamed from: q */
    private CaptureRequest f302q;

    /* renamed from: r */
    private ImageReader f303r;

    /* renamed from: s */
    private ImageReader f304s;

    /* renamed from: t */
    private boolean f305t = false;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f306u = false;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f307v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f308w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f309x = false;

    /* renamed from: y */
    private int f310y = 0;

    /* renamed from: z */
    private MeteringRectangle f311z;

    /* renamed from: at.nineyards.anyline.camera.CameraController2$State */
    public enum State {
        PREVIEW,
        WAITING_LOCK,
        WAITING_PRECAPTURE,
        WAITING_NON_PRECAPTURE,
        PICTURE_TAKEN
    }

    /* renamed from: at.nineyards.anyline.camera.CameraController2$3 */
    static /* synthetic */ class C07473 {

        /* renamed from: a */
        static final /* synthetic */ int[] f318a = new int[State.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                at.nineyards.anyline.camera.CameraController2$State[] r0 = p007at.nineyards.anyline.camera.CameraController2.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f318a = r0
                int[] r0 = f318a     // Catch:{ NoSuchFieldError -> 0x0014 }
                at.nineyards.anyline.camera.CameraController2$State r1 = p007at.nineyards.anyline.camera.CameraController2.State.PREVIEW     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f318a     // Catch:{ NoSuchFieldError -> 0x001f }
                at.nineyards.anyline.camera.CameraController2$State r1 = p007at.nineyards.anyline.camera.CameraController2.State.WAITING_LOCK     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f318a     // Catch:{ NoSuchFieldError -> 0x002a }
                at.nineyards.anyline.camera.CameraController2$State r1 = p007at.nineyards.anyline.camera.CameraController2.State.WAITING_PRECAPTURE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f318a     // Catch:{ NoSuchFieldError -> 0x0035 }
                at.nineyards.anyline.camera.CameraController2$State r1 = p007at.nineyards.anyline.camera.CameraController2.State.WAITING_NON_PRECAPTURE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.camera.CameraController2.C07473.<clinit>():void");
        }
    }

    CameraController2(Context context) {
        this.f289d = context;
        TextureView textureView = new TextureView(context);
        this.previewView = textureView;
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                String unused = CameraController2.f284b;
                synchronized (CameraController2.f285c) {
                    SurfaceTexture unused2 = CameraController2.this.f292g = surfaceTexture;
                }
                CameraController2.this.openCameraInBackground();
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                String unused = CameraController2.f284b;
                StringBuilder sb = new StringBuilder("onSurfaceTextureSizeChanged ");
                sb.append(i);
                sb.append(" x ");
                sb.append(i2);
                CameraController2.this.m86e();
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                String unused = CameraController2.f284b;
                synchronized (CameraController2.f285c) {
                    if (CameraController2.this.f293h == null) {
                        return true;
                    }
                    SurfaceTexture unused2 = CameraController2.this.f292g = null;
                    CameraController2.this.releaseCameraInBackground();
                    return true;
                }
            }
        });
    }

    public boolean hasNewImage() {
        boolean z;
        synchronized (f285c) {
            z = this.f306u;
        }
        return z;
    }

    public AnylineYuvImage getNewImage() {
        return getNewImage(0, 0, this.f307v, this.f308w, false);
    }

    public AnylineYuvImage getNewImage(int i, int i2, int i3, int i4, boolean z) {
        synchronized (this.f290e) {
            if (this.f306u) {
                if (this.f290e.mo12252c()) {
                    AnylineYuvImage anylineYuvImage = new AnylineYuvImage(this.f290e.mo12249a(), this.f300o, i, i2, i3, i4, z);
                    this.f306u = false;
                    return anylineYuvImage;
                }
            }
            return null;
        }
    }

    public AnylineImage getLastImageWithFullSize() {
        synchronized (this.f290e) {
            if (!this.f290e.mo12252c()) {
                return null;
            }
            AnylineImage anylineImage = new AnylineImage(new AnylineYuvImage(this.f290e.mo12249a(), this.f300o, 0, 0, this.f307v, this.f308w, false));
            return anylineImage;
        }
    }

    public ImageReceiver getLastImageWithFullSizeReceiver() {
        synchronized (this.f290e) {
            if (!this.f290e.mo12252c()) {
                return null;
            }
            ImageReceiver imageReceiver = new ImageReceiver();
            imageReceiver.mo12222a(this.f290e, this.f300o);
            return imageReceiver;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f301p.capture(r4.f295j.build(), r4.f287B, r4.f299n);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        android.util.Log.e(f284b, "Error on auto focus.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        r4.f295j.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, 1);
        r4.f295j.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callAutoFocus() {
        /*
            r4 = this;
            java.lang.Object r0 = f285c
            monitor-enter(r0)
            boolean r1 = r4.f309x     // Catch:{ all -> 0x0051 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return
        L_0x0009:
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            android.hardware.camera2.CaptureRequest$Builder r0 = r4.f295j
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.set(r1, r3)
            android.hardware.camera2.CaptureRequest$Builder r0 = r4.f295j
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.set(r1, r2)
            android.hardware.camera2.CameraCaptureSession r0 = r4.f301p     // Catch:{ CameraAccessException -> 0x0031 }
            android.hardware.camera2.CaptureRequest$Builder r1 = r4.f295j     // Catch:{ CameraAccessException -> 0x0031 }
            android.hardware.camera2.CaptureRequest r1 = r1.build()     // Catch:{ CameraAccessException -> 0x0031 }
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r2 = r4.f287B     // Catch:{ CameraAccessException -> 0x0031 }
            android.os.Handler r3 = r4.f299n     // Catch:{ CameraAccessException -> 0x0031 }
            r0.capture(r1, r2, r3)     // Catch:{ CameraAccessException -> 0x0031 }
            goto L_0x0039
        L_0x0031:
            r0 = move-exception
            java.lang.String r1 = f284b
            java.lang.String r2 = "Error on auto focus."
            android.util.Log.e(r1, r2, r0)
        L_0x0039:
            android.hardware.camera2.CaptureRequest$Builder r0 = r4.f295j
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.set(r1, r3)
            android.hardware.camera2.CaptureRequest$Builder r0 = r4.f295j
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.set(r1, r2)
            return
        L_0x0051:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.camera.CameraController2.callAutoFocus():void");
    }

    public void openCameraReportError() {
        synchronized (f285c) {
            if (this.f292g == null) {
                Log.d(f284b, "Skip camera opening: No surface texture exists.");
            } else if (this.f293h != null) {
                Log.d(f284b, "Skip camera opening: A camera is already open.");
            } else if (!this.f294i.hasQueuedThreads()) {
                try {
                    Log.d(f284b, "open camera");
                    if (this.f298m == null) {
                        this.f298m = new HandlerThread("CameraBackground");
                        this.f298m.start();
                        this.f299n = new Handler(this.f298m.getLooper());
                    }
                    ViewGroup viewGroup = (ViewGroup) this.previewView.getParent();
                    CameraManager cameraManager = (CameraManager) this.f289d.getApplicationContext().getSystemService("camera");
                    this.f297l = null;
                    String[] cameraIdList = cameraManager.getCameraIdList();
                    int length = cameraIdList.length;
                    StreamConfigurationMap streamConfigurationMap = null;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        String str = cameraIdList[i];
                        this.f297l = cameraManager.getCameraCharacteristics(str);
                        Integer num = (Integer) this.f297l.get(CameraCharacteristics.LENS_FACING);
                        if (num != null && CameraFeatures.LensFacing.fromCamera2(num) == this.preferredCameraConfig.lensFacing && (streamConfigurationMap = (StreamConfigurationMap) this.f297l.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null) {
                            this.f296k = str;
                            break;
                        }
                        i++;
                    }
                    if ((this.f296k == null || this.f297l == null || streamConfigurationMap == null) && this.preferredCameraConfig.fallbackLensFacings != null && !this.preferredCameraConfig.fallbackLensFacings.isEmpty()) {
                        Iterator it = this.preferredCameraConfig.fallbackLensFacings.iterator();
                        while (it.hasNext()) {
                            CameraFeatures.LensFacing lensFacing = (CameraFeatures.LensFacing) it.next();
                            String[] cameraIdList2 = cameraManager.getCameraIdList();
                            int length2 = cameraIdList2.length;
                            StreamConfigurationMap streamConfigurationMap2 = streamConfigurationMap;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length2) {
                                    break;
                                }
                                String str2 = cameraIdList2[i2];
                                this.f297l = cameraManager.getCameraCharacteristics(str2);
                                Integer num2 = (Integer) this.f297l.get(CameraCharacteristics.LENS_FACING);
                                if (num2 != null && CameraFeatures.LensFacing.fromCamera2(num2) == lensFacing && (streamConfigurationMap2 = (StreamConfigurationMap) this.f297l.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null) {
                                    this.f296k = str2;
                                    break;
                                }
                                i2++;
                            }
                            streamConfigurationMap = streamConfigurationMap2;
                            if (!(this.f296k == null || this.f297l == null)) {
                                if (streamConfigurationMap != null) {
                                    break;
                                }
                            }
                        }
                    }
                    if (this.f296k == null || this.f297l == null || streamConfigurationMap == null) {
                        throw new Exception("No camera found meeting the requirements of defaultCamera or fallbackCameras");
                    }
                    this.cameraFeatures = new CameraFeatures2(this.f296k, this.f297l);
                    this.f300o = CameraUtil.getCameraDisplayRotation(this.f289d, this.f297l);
                    this.cameraConfig = new CameraConfig(this.f289d, this.preferredCameraConfig, this.cameraFeatures, viewGroup.getWidth(), viewGroup.getHeight());
                    this.f307v = this.cameraConfig.getFrameSize().getWidth();
                    this.f308w = this.cameraConfig.getFrameSize().getHeight();
                    this.previewView.post(new Runnable() {
                        public final void run() {
                            CameraController2.this.previewView.getParent().requestLayout();
                        }
                    });
                    m86e();
                    if (this.f294i.tryAcquire(2500, TimeUnit.MILLISECONDS)) {
                        cameraManager.openCamera(this.f296k, this.f288C, this.f299n);
                    } else {
                        throw new RuntimeException("Time out waiting to lock camera opening.");
                    }
                } catch (Exception e) {
                    Log.d(f284b, "Error initializing camera: " + e.getMessage());
                    reportCameraError(e);
                }
            }
        }
    }

    public void openCameraInBackground() {
        openCameraReportError();
    }

    public void releaseCameraInBackground() {
        synchronized (f285c) {
            if (this.f293h != null) {
                new Thread(new Runnable() {
                    public final void run() {
                        CameraController2.this.releaseCamera();
                    }
                }).start();
            }
        }
    }

    public void releaseCamera() {
        synchronized (this.f290e) {
            this.f309x = false;
            this.f306u = false;
            this.f290e.mo12251b();
        }
        try {
            this.f294i.acquire();
            if (this.f301p != null) {
                this.f301p.stopRepeating();
                this.f301p.abortCaptures();
            }
            stopAutoFocusTimer();
            if (this.f301p != null) {
                this.f301p.close();
                this.f301p = null;
            }
            if (this.f293h != null) {
                this.f293h.close();
                this.f293h = null;
            }
            if (this.f303r != null) {
                this.f303r.close();
                this.f303r = null;
            }
            if (this.f304s != null) {
                this.f304s.close();
                this.f304s = null;
            }
        } catch (Exception e) {
            Log.e(f284b, "Error while closing camera resources", e);
        } catch (Throwable th) {
            this.f294i.release();
            m85d();
            throw th;
        }
        this.f294i.release();
        m85d();
    }

    public void setFlashOn(boolean z) {
        if (this.cameraFeatures != null && this.cameraFeatures.isFlashSupported()) {
            this.f305t = z;
            if (z) {
                this.f295j.set(CaptureRequest.FLASH_MODE, 2);
            } else {
                this.f295j.set(CaptureRequest.FLASH_MODE, 0);
            }
            try {
                m82c();
            } catch (CameraAccessException e) {
                Log.e(f284b, "Error setting flash.", e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m82c() throws CameraAccessException {
        if (this.f301p != null) {
            this.f302q = this.f295j.build();
            this.f301p.setRepeatingRequest(this.f302q, this.f287B, this.f299n);
        }
    }

    /* renamed from: d */
    private void m85d() {
        synchronized (f285c) {
            if (this.f298m != null) {
                this.f298m.quitSafely();
                try {
                    this.f298m.join();
                    this.f298m = null;
                    this.f299n = null;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12105a(int i) {
        this.f310y = i;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0148  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m86e() {
        /*
            r18 = this;
            r0 = r18
            android.graphics.SurfaceTexture r1 = r0.f292g
            if (r1 == 0) goto L_0x0154
            at.nineyards.anyline.camera.CameraConfig r1 = r0.cameraConfig
            if (r1 != 0) goto L_0x000c
            goto L_0x0154
        L_0x000c:
            android.view.View r1 = r0.previewView
            int r1 = r1.getWidth()
            float r1 = (float) r1
            android.view.View r2 = r0.previewView
            int r2 = r2.getHeight()
            float r2 = (float) r2
            r3 = 0
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0154
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x0025
            goto L_0x0154
        L_0x0025:
            int r4 = r0.f308w
            float r4 = (float) r4
            int r5 = r0.f307v
            float r5 = (float) r5
            float r4 = r4 / r5
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r3, r3, r1, r2)
            float r6 = r5.centerX()
            float r7 = r5.centerY()
            float r8 = r1 * r4
            int r8 = (int) r8
            float r8 = (float) r8
            int r9 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r9 >= 0) goto L_0x0043
            r4 = r1
            goto L_0x0048
        L_0x0043:
            float r4 = r2 / r4
            int r4 = (int) r4
            float r4 = (float) r4
            r8 = r2
        L_0x0048:
            android.content.Context r9 = r0.f289d
            java.lang.String r10 = "window"
            java.lang.Object r9 = r9.getSystemService(r10)
            android.view.WindowManager r9 = (android.view.WindowManager) r9
            android.view.Display r9 = r9.getDefaultDisplay()
            int r9 = r9.getRotation()
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            java.lang.String r11 = ", newView:"
            java.lang.String r12 = ", view:"
            java.lang.String r13 = "Preview transform: frame: "
            r14 = 1073741824(0x40000000, float:2.0)
            r3 = 1
            java.lang.String r15 = "x"
            if (r9 == r3) goto L_0x00dc
            r3 = 3
            if (r9 != r3) goto L_0x0072
            goto L_0x00dc
        L_0x0072:
            float r3 = r1 - r4
            float r3 = r3 / r14
            float r5 = r2 - r8
            float r14 = r5 / r14
            r16 = r5
            int r5 = r0.f310y
            r17 = r14
            r14 = 1
            if (r5 == r14) goto L_0x008b
            r14 = 2
            if (r5 == r14) goto L_0x0088
            r5 = r17
            goto L_0x008c
        L_0x0088:
            r5 = r16
            goto L_0x008c
        L_0x008b:
            r5 = 0
        L_0x008c:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r13)
            int r13 = r0.f307v
            r14.append(r13)
            r14.append(r15)
            int r13 = r0.f308w
            r14.append(r13)
            r14.append(r12)
            r14.append(r1)
            r14.append(r15)
            r14.append(r2)
            r14.append(r11)
            r14.append(r4)
            r14.append(r15)
            r14.append(r8)
            java.lang.String r11 = ", offset:"
            r14.append(r11)
            r14.append(r3)
            r14.append(r15)
            r14.append(r5)
            float r4 = r4 / r1
            float r8 = r8 / r2
            r10.setScale(r4, r8)
            r10.postTranslate(r3, r5)
            r1 = 2
            if (r9 != r1) goto L_0x00d4
            r1 = 1127481344(0x43340000, float:180.0)
            r10.postRotate(r1, r6, r7)
        L_0x00d4:
            android.view.View r1 = r0.previewView
            android.view.TextureView r1 = (android.view.TextureView) r1
            r1.setTransform(r10)
            return
        L_0x00dc:
            int r3 = r0.f310y
            r14 = 1
            if (r3 == r14) goto L_0x00eb
            r14 = 2
            if (r3 == r14) goto L_0x00e6
            r3 = 0
            goto L_0x00f0
        L_0x00e6:
            float r3 = r2 - r8
            r14 = -1073741824(0xffffffffc0000000, float:-2.0)
            goto L_0x00ef
        L_0x00eb:
            float r3 = r2 - r8
            r14 = 1073741824(0x40000000, float:2.0)
        L_0x00ef:
            float r3 = r3 / r14
        L_0x00f0:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r13)
            int r13 = r0.f307v
            r14.append(r13)
            r14.append(r15)
            int r13 = r0.f308w
            r14.append(r13)
            r14.append(r12)
            r14.append(r1)
            r14.append(r15)
            r14.append(r2)
            r14.append(r11)
            r14.append(r4)
            r14.append(r15)
            r14.append(r8)
            java.lang.String r1 = ", offset:0.0x"
            r14.append(r1)
            r14.append(r3)
            android.graphics.RectF r1 = new android.graphics.RectF
            r2 = 0
            r1.<init>(r2, r2, r8, r4)
            float r4 = r1.centerX()
            float r4 = r6 - r4
            float r8 = r1.centerY()
            float r8 = r7 - r8
            r1.offset(r4, r8)
            android.graphics.Matrix$ScaleToFit r4 = android.graphics.Matrix.ScaleToFit.FILL
            r10.setRectToRect(r5, r1, r4)
            r10.postTranslate(r3, r2)
            r1 = 1
            if (r9 != r1) goto L_0x0148
            r1 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r10.postRotate(r1, r6, r7)
            goto L_0x014d
        L_0x0148:
            r1 = 1119092736(0x42b40000, float:90.0)
            r10.postRotate(r1, r6, r7)
        L_0x014d:
            android.view.View r1 = r0.previewView
            android.view.TextureView r1 = (android.view.TextureView) r1
            r1.setTransform(r10)
        L_0x0154:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.camera.CameraController2.m86e():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12053a(Context context, RectF rectF, float f, float f2) {
        CameraCharacteristics cameraCharacteristics = this.f297l;
        if (cameraCharacteristics == null) {
            this.f311z = null;
            return;
        }
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        int cameraDisplayRotation = CameraUtil.getCameraDisplayRotation(context, this.f297l);
        StringBuilder sb = new StringBuilder("SENSOR_INFO_ACTIVE_ARRAY_SIZE: (x:");
        sb.append(rect.left);
        sb.append(", y:");
        sb.append(rect.top);
        sb.append(", w:");
        sb.append(rect.width());
        sb.append(", h:");
        sb.append(rect.height());
        sb.append(")");
        this.f311z = CameraUtil.m111a(rect, cameraDisplayRotation, rectF, f, f2);
        new StringBuilder("Calculated MeteringRectangle: ").append(this.f311z);
        MeteringRectangle meteringRectangle = this.f311z;
        if (meteringRectangle != null) {
            MeteringRectangle[] meteringRectangleArr = {meteringRectangle};
            if (this.cameraConfig.isUpdateRegionsOnAutoFocusEnabled()) {
                int x = this.f311z.getX();
                int y = this.f311z.getY();
                int width = this.f311z.getWidth();
                int height = this.f311z.getHeight();
                int i = this.f286A;
                this.f286A = i + 1;
                meteringRectangleArr[0] = new MeteringRectangle(x, y, width, height + (i % 2), this.f311z.getMeteringWeight());
            }
            if (this.cameraConfig.isFocusRegionEnabled()) {
                this.f295j.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
            } else {
                this.f295j.set(CaptureRequest.CONTROL_AF_REGIONS, (Object) null);
            }
            if (this.cameraConfig.isAutoExposureRegionEnabled()) {
                this.f295j.set(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr);
            } else {
                this.f295j.set(CaptureRequest.CONTROL_AE_REGIONS, (Object) null);
            }
            if (this.f301p != null) {
                try {
                    m82c();
                } catch (CameraAccessException e) {
                    reportCameraError(e);
                }
            }
        }
    }

    public void takeHighResolutionImage() {
        try {
            this.f295j.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            this.f291f = State.WAITING_LOCK;
            this.f301p.capture(this.f295j.build(), this.f287B, this.f299n);
        } catch (CameraAccessException e) {
            reportCameraError(e);
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m81b(CameraController2 cameraController2) {
        CameraDevice cameraDevice = cameraController2.f293h;
        if (cameraDevice != null) {
            try {
                CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(2);
                createCaptureRequest.addTarget(cameraController2.f304s.getSurface());
                createCaptureRequest.set(CaptureRequest.CONTROL_MODE, 1);
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                if (cameraController2.cameraConfig.getFocusMode() != null) {
                    createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(cameraController2.cameraConfig.getFocusMode().toCamera2()));
                }
                if (cameraController2.cameraConfig.isOpticalStabilizationEnabled()) {
                    createCaptureRequest.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                } else if (cameraController2.cameraConfig.isVideoStabilizationEnabled()) {
                    createCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                }
                if (cameraController2.cameraFeatures.isFlashSupported() && cameraController2.f305t) {
                    createCaptureRequest.set(CaptureRequest.FLASH_MODE, 2);
                }
                C07462 r1 = new CameraCaptureSession.CaptureCallback() {
                    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                        CameraController2.m100r(CameraController2.this);
                    }
                };
                cameraController2.f301p.stopRepeating();
                cameraController2.f301p.capture(createCaptureRequest.build(), r1, cameraController2.f299n);
            } catch (CameraAccessException e) {
                cameraController2.reportCameraError(e);
            }
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m83c(CameraController2 cameraController2) {
        try {
            cameraController2.f295j.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            cameraController2.f291f = State.WAITING_PRECAPTURE;
            cameraController2.f301p.capture(cameraController2.f295j.build(), cameraController2.f287B, cameraController2.f299n);
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m87e(CameraController2 cameraController2) throws CameraAccessException {
        cameraController2.f292g.setDefaultBufferSize(cameraController2.cameraConfig.getPreviewSize().getWidth(), cameraController2.cameraConfig.getPreviewSize().getHeight());
        Surface surface = new Surface(cameraController2.f292g);
        cameraController2.f303r = ImageReader.newInstance(cameraController2.cameraConfig.getPreviewSize().getWidth(), cameraController2.cameraConfig.getPreviewSize().getHeight(), 35, 2);
        cameraController2.f303r.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {

            /* renamed from: b */
            private ImageReceiver f325b;

            /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
                r4 = r4.acquireNextImage();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
                if (r4 != null) goto L_0x0020;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x001f, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x0020, code lost:
                p007at.nineyards.anyline.camera.CameraController2.m92j(r3.f324a).mo12251b();
                p007at.nineyards.anyline.camera.CameraController2.m92j(r3.f324a).mo12250a(r4);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
                if (r3.f324a.imageListener == null) goto L_0x005d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
                if (r3.f325b != null) goto L_0x0043;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
                r3.f325b = new p007at.nineyards.anyline.camera.ImageReceiver();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x0043, code lost:
                r3.f325b.mo12222a(p007at.nineyards.anyline.camera.CameraController2.m92j(r3.f324a), p007at.nineyards.anyline.camera.CameraController2.m94l(r3.f324a));
                r3.f324a.imageListener.onImageAvailable(r3.f325b);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
                p007at.nineyards.anyline.camera.CameraController2.m95m(r3.f324a);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onImageAvailable(android.media.ImageReader r4) {
                /*
                    r3 = this;
                    at.nineyards.anyline.camera.CameraController2 r0 = p007at.nineyards.anyline.camera.CameraController2.this
                    at.nineyards.anyline.camera.b r0 = r0.f290e
                    monitor-enter(r0)
                    java.lang.Object r1 = p007at.nineyards.anyline.camera.CameraController2.f285c     // Catch:{ all -> 0x0067 }
                    monitor-enter(r1)     // Catch:{ all -> 0x0067 }
                    at.nineyards.anyline.camera.CameraController2 r2 = p007at.nineyards.anyline.camera.CameraController2.this     // Catch:{ all -> 0x0064 }
                    boolean r2 = r2.f309x     // Catch:{ all -> 0x0064 }
                    if (r2 != 0) goto L_0x0017
                    monitor-exit(r1)     // Catch:{ all -> 0x0064 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0067 }
                    return
                L_0x0017:
                    monitor-exit(r1)     // Catch:{ all -> 0x0064 }
                    android.media.Image r4 = r4.acquireNextImage()     // Catch:{ all -> 0x0067 }
                    if (r4 != 0) goto L_0x0020
                    monitor-exit(r0)     // Catch:{ all -> 0x0067 }
                    return
                L_0x0020:
                    at.nineyards.anyline.camera.CameraController2 r1 = p007at.nineyards.anyline.camera.CameraController2.this     // Catch:{ all -> 0x0067 }
                    at.nineyards.anyline.camera.b r1 = r1.f290e     // Catch:{ all -> 0x0067 }
                    r1.mo12251b()     // Catch:{ all -> 0x0067 }
                    at.nineyards.anyline.camera.CameraController2 r1 = p007at.nineyards.anyline.camera.CameraController2.this     // Catch:{ all -> 0x0067 }
                    at.nineyards.anyline.camera.b r1 = r1.f290e     // Catch:{ all -> 0x0067 }
                    r1.mo12250a(r4)     // Catch:{ all -> 0x0067 }
                    at.nineyards.anyline.camera.CameraController2 r4 = p007at.nineyards.anyline.camera.CameraController2.this     // Catch:{ all -> 0x0067 }
                    at.nineyards.anyline.camera.ImageListener r4 = r4.imageListener     // Catch:{ all -> 0x0067 }
                    if (r4 == 0) goto L_0x005d
                    at.nineyards.anyline.camera.ImageReceiver r4 = r3.f325b     // Catch:{ all -> 0x0067 }
                    if (r4 != 0) goto L_0x0043
                    at.nineyards.anyline.camera.ImageReceiver r4 = new at.nineyards.anyline.camera.ImageReceiver     // Catch:{ all -> 0x0067 }
                    r4.<init>()     // Catch:{ all -> 0x0067 }
                    r3.f325b = r4     // Catch:{ all -> 0x0067 }
                L_0x0043:
                    at.nineyards.anyline.camera.ImageReceiver r4 = r3.f325b     // Catch:{ all -> 0x0067 }
                    at.nineyards.anyline.camera.CameraController2 r1 = p007at.nineyards.anyline.camera.CameraController2.this     // Catch:{ all -> 0x0067 }
                    at.nineyards.anyline.camera.b r1 = r1.f290e     // Catch:{ all -> 0x0067 }
                    at.nineyards.anyline.camera.CameraController2 r2 = p007at.nineyards.anyline.camera.CameraController2.this     // Catch:{ all -> 0x0067 }
                    int r2 = r2.f300o     // Catch:{ all -> 0x0067 }
                    r4.mo12222a(r1, r2)     // Catch:{ all -> 0x0067 }
                    at.nineyards.anyline.camera.CameraController2 r4 = p007at.nineyards.anyline.camera.CameraController2.this     // Catch:{ all -> 0x0067 }
                    at.nineyards.anyline.camera.ImageListener r4 = r4.imageListener     // Catch:{ all -> 0x0067 }
                    at.nineyards.anyline.camera.ImageReceiver r1 = r3.f325b     // Catch:{ all -> 0x0067 }
                    r4.onImageAvailable(r1)     // Catch:{ all -> 0x0067 }
                L_0x005d:
                    at.nineyards.anyline.camera.CameraController2 r4 = p007at.nineyards.anyline.camera.CameraController2.this     // Catch:{ all -> 0x0067 }
                    boolean unused = r4.f306u = true     // Catch:{ all -> 0x0067 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0067 }
                    return
                L_0x0064:
                    r4 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x0064 }
                    throw r4     // Catch:{ all -> 0x0067 }
                L_0x0067:
                    r4 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0067 }
                    throw r4
                */
                throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.camera.CameraController2.C07539.onImageAvailable(android.media.ImageReader):void");
            }
        }, cameraController2.f299n);
        final int width = cameraController2.cameraConfig.getPictureSize().getWidth();
        final int height = cameraController2.cameraConfig.getPictureSize().getHeight();
        cameraController2.f304s = ImageReader.newInstance(width, height, 35, 1);
        cameraController2.f304s.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {
            public final void onImageAvailable(ImageReader imageReader) {
                String unused = CameraController2.f284b;
                synchronized (CameraController2.this.f290e) {
                    Image acquireNextImage = imageReader.acquireNextImage();
                    AnylineYuvImage anylineYuvImage = new AnylineYuvImage(acquireNextImage, CameraController2.this.f300o, 0, 0, CameraController2.this.f307v > CameraController2.this.f308w ? width : height, CameraController2.this.f307v > CameraController2.this.f308w ? height : width, false);
                    acquireNextImage.close();
                    CameraController2.this.highResolutionImageListener.onImageTaken(new AnylineImage(anylineYuvImage));
                }
            }
        }, cameraController2.f299n);
        cameraController2.f295j = cameraController2.f293h.createCaptureRequest(1);
        cameraController2.f295j.addTarget(surface);
        cameraController2.f295j.addTarget(cameraController2.f303r.getSurface());
        cameraController2.f293h.createCaptureSession(Arrays.asList(new Surface[]{surface, cameraController2.f303r.getSurface(), cameraController2.f304s.getSurface()}), new CameraCaptureSession.StateCallback() {
            public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                if (CameraController2.this.f293h != null) {
                    CameraCaptureSession unused = CameraController2.this.f301p = cameraCaptureSession;
                    try {
                        CameraController2.m96n(CameraController2.this);
                        CameraController2.this.m82c();
                        CameraController2.m98p(CameraController2.this);
                        synchronized (CameraController2.f285c) {
                            boolean unused2 = CameraController2.this.f309x = true;
                        }
                        Log.d(CameraController2.f284b, "Camera preview configured");
                    } catch (CameraAccessException e) {
                        CameraController2.this.reportCameraError(e);
                    }
                }
            }

            public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                CameraController2.this.reportCameraError(new Exception("Configuring the camera failed."));
            }
        }, cameraController2.f299n);
    }

    /* renamed from: n */
    static /* synthetic */ void m96n(CameraController2 cameraController2) {
        cameraController2.f295j.set(CaptureRequest.CONTROL_MODE, 1);
        cameraController2.f295j.set(CaptureRequest.CONTROL_AE_MODE, 1);
        cameraController2.f295j.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(cameraController2.cameraConfig.getFocusMode().toCamera2()));
        cameraController2.initAutoFocusTimer();
        if (cameraController2.cameraConfig.isOpticalStabilizationEnabled()) {
            cameraController2.f295j.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
        } else if (cameraController2.cameraConfig.isVideoStabilizationEnabled()) {
            cameraController2.f295j.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
        int camera2 = cameraController2.cameraConfig.getSceneMode().toCamera2();
        if (camera2 != 0) {
            cameraController2.f295j.set(CaptureRequest.CONTROL_SCENE_MODE, Integer.valueOf(camera2));
            cameraController2.f295j.set(CaptureRequest.CONTROL_MODE, 2);
        }
        CameraFeatures.FpsRange fpsRange = null;
        if (cameraController2.preferredMinPreviewFps != 0 && cameraController2.preferredMaxPreviewFps != 0) {
            fpsRange = CameraUtil.getBiggestFittingPreviewFps(cameraController2.cameraFeatures.getFpsRanges(), cameraController2.preferredMinPreviewFps, cameraController2.preferredMaxPreviewFps);
            if (fpsRange == null) {
                String str = f284b;
                Log.d(str, "Preview FPS of (" + cameraController2.preferredMinPreviewFps + ", " + cameraController2.preferredMaxPreviewFps + ") is not available. Using default.");
            }
        } else if (cameraController2.isUseMaxFpsRange) {
            fpsRange = cameraController2.cameraFeatures.getMaxFpsRange();
        }
        if (fpsRange != null) {
            cameraController2.f295j.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, fpsRange.toCamera2());
            String str2 = f284b;
            Log.d(str2, "Preview FPS set to " + fpsRange);
        }
        if (cameraController2.cameraFeatures.isFlashSupported() && cameraController2.f305t) {
            cameraController2.f295j.set(CaptureRequest.FLASH_MODE, 2);
        }
    }

    /* renamed from: p */
    static /* synthetic */ void m98p(CameraController2 cameraController2) {
        if (cameraController2.f249a != null) {
            cameraController2.f249a.mo11936a();
        }
        if (cameraController2.cameraListener == null) {
            String str = f284b;
            Log.d(str, "Camera opened successfully. Frame resolution " + cameraController2.f307v + " x " + cameraController2.f308w);
            return;
        }
        cameraController2.previewView.post(new Runnable() {
            public final void run() {
                CameraOpenListener cameraOpenListener = CameraController2.this.cameraListener;
                CameraController2 cameraController2 = CameraController2.this;
                cameraOpenListener.onCameraOpened(cameraController2, cameraController2.f307v, CameraController2.this.f308w);
            }
        });
    }

    /* renamed from: r */
    static /* synthetic */ void m100r(CameraController2 cameraController2) {
        try {
            cameraController2.f295j.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            cameraController2.f301p.capture(cameraController2.f295j.build(), cameraController2.f287B, cameraController2.f299n);
            cameraController2.f291f = State.PREVIEW;
            cameraController2.f301p.setRepeatingRequest(cameraController2.f302q, cameraController2.f287B, cameraController2.f299n);
        } catch (CameraAccessException e) {
            cameraController2.reportCameraError(e);
        }
    }
}
