package p007at.nineyards.anyline.modules;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import p007at.nineyards.anyline.AnylineController;
import p007at.nineyards.anyline.AnylineDebugListener;
import p007at.nineyards.anyline.C0718R;
import p007at.nineyards.anyline.camera.AnylineView;
import p007at.nineyards.anyline.camera.AnylineViewConfig;
import p007at.nineyards.anyline.camera.CameraFeatures;
import p007at.nineyards.anyline.camera.VisualFeedbackConfig;
import p007at.nineyards.anyline.core.CheckLicense;
import p007at.nineyards.anyline.core.LicenseException;
import p007at.nineyards.anyline.core.RunFailure;
import p007at.nineyards.anyline.core.Square;
import p007at.nineyards.anyline.core.Vector_Contour;
import p007at.nineyards.anyline.core.Vector_SevenSegmentContour;
import p007at.nineyards.anyline.core.exception_error_codes;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.modules.AnylineModuleResultListener;
import p007at.nineyards.anyline.modules.C0778a;
import p007at.nineyards.anyline.modules.document.DocumentScanView;
import p007at.nineyards.anyline.util.SoundUtil;
import p046io.anyline.plugin.AbstractScanPlugin;

/* renamed from: at.nineyards.anyline.modules.AnylineBaseModuleView */
public abstract class AnylineBaseModuleView<T extends AnylineModuleResultListener> extends AnylineView implements AnylineModule<T> {
    protected static final int RESET_CUTOUT_COLOR_THRESHOLD = 600;
    protected static final String SOUND_BEEP = "anyline/sounds/beep.wav";

    /* renamed from: a */
    private static final Map<String, Class> f504a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f505b = AnylineBaseModuleView.class.getSimpleName();
    /* access modifiers changed from: protected */
    @Deprecated
    public AnylineController anylineController;

    /* renamed from: c */
    private AnylineDebugListener f506c;

    /* renamed from: d */
    private SoundUtil f507d;

    /* renamed from: e */
    private AnylineSurfaceView f508e;

    /* renamed from: f */
    private SurfaceHolder f509f;

    /* renamed from: g */
    private volatile long f510g;

    /* renamed from: h */
    private float f511h;

    /* renamed from: i */
    private Rect f512i;
    protected boolean isBeepOnResult;
    protected boolean isBlinkOnResult;
    protected boolean isCancelOnResult;
    /* access modifiers changed from: protected */
    public boolean isDebug;
    protected boolean isVibrateOnResult;

    /* renamed from: j */
    private C0778a f513j;

    /* renamed from: k */
    private boolean f514k;
    protected final Object lock;
    /* access modifiers changed from: protected */
    public AbstractScanPlugin scanPlugin;

    /* renamed from: at.nineyards.anyline.modules.AnylineBaseModuleView$BrightnessFeedback */
    public enum BrightnessFeedback {
        TOO_BRIGHT,
        TOO_DARK,
        OK
    }

    public abstract void initAnyline(String str, T t);

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(AnylineDebugListener.BRIGHTNESS_VARIABLE_NAME, AnylineDebugListener.BRIGHTNESS_VARIABLE_CLASS);
        hashMap.put(AnylineDebugListener.OUTLINE_VARIABLE_NAME, AnylineDebugListener.OUTLINE_VARIABLE_CLASS);
        hashMap.put(AnylineDebugListener.THRESHOLD_IMAGE_VARIABLE_NAME, AnylineDebugListener.THRESHOLD_IMAGE_VARIABLE_CLASS);
        hashMap.put(AnylineDebugListener.CONTOURS_VARIABLE_NAME, AnylineDebugListener.CONTOURS_VARIABLE_CLASS);
        hashMap.put(AnylineDebugListener.SQUARE_VARIABLE_NAME, AnylineDebugListener.SQUARE_VARIABLE_CLASS);
        hashMap.put(AnylineDebugListener.POLYGON_VARIABLE_NAME, AnylineDebugListener.POLYGON_VARIABLE_CLASS);
        hashMap.put(AnylineDebugListener.SHARPNESS_VARIABLE_NAME, AnylineDebugListener.SHARPNESS_VARIABLE_CLASS);
        hashMap.put(AnylineDebugListener.DEVICE_ACCELERATION_VARIABLE_NAME, AnylineDebugListener.DEVICE_ACCELERATION_VARIABLE_CLASS);
        hashMap.put(AnylineDebugListener.DEVICE_SHAKE_WARNING_VARIABLE_NAME, AnylineDebugListener.DEVICE_SHAKE_WARNING_VARIABLE_CLASS);
        f504a = Collections.unmodifiableMap(hashMap);
    }

    public AnylineBaseModuleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AnylineBaseModuleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lock = new Object();
        this.isBlinkOnResult = true;
        this.isBeepOnResult = false;
        this.isVibrateOnResult = false;
        this.isCancelOnResult = true;
        this.isDebug = false;
        this.f510g = 0;
        this.f511h = 1.0f;
        this.f512i = null;
        this.f514k = true;
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C0718R.styleable.AnylineBaseModuleView, i, 0);
            AnylineViewConfig config = getConfig();
            config.setBeepOnResult(obtainStyledAttributes.getBoolean(C0718R.styleable.AnylineBaseModuleView_beep_on_result, this.isBeepOnResult));
            config.setBlinkOnResult(obtainStyledAttributes.getBoolean(C0718R.styleable.AnylineBaseModuleView_blink_animation_on_result, this.isBlinkOnResult));
            config.setVibrateOnResult(obtainStyledAttributes.getBoolean(C0718R.styleable.AnylineBaseModuleView_vibrate_on_result, this.isVibrateOnResult));
            config.setCancelOnResult(obtainStyledAttributes.getBoolean(C0718R.styleable.AnylineBaseModuleView_cancel_on_result, this.isCancelOnResult));
            config.setCutoutFeedbackStrokeColor(obtainStyledAttributes.getColor(C0718R.styleable.AnylineBaseModuleView_cutout_feedback_stroke_color, getConfig().getCutoutFeedbackStrokeColor()));
            int i2 = obtainStyledAttributes.getInt(C0718R.styleable.AnylineBaseModuleView_visual_feedback_style, -1);
            if (i2 >= 0) {
                VisualFeedbackConfig visualFeedbackConfig = new VisualFeedbackConfig();
                visualFeedbackConfig.setFeedbackStyle(VisualFeedbackConfig.FeedbackStyle.fromInt(i2));
                visualFeedbackConfig.setStrokeColor(obtainStyledAttributes.getColor(C0718R.styleable.AnylineBaseModuleView_visual_feedback_stroke_color, visualFeedbackConfig.getStrokeColor()));
                visualFeedbackConfig.setFillColor(obtainStyledAttributes.getColor(C0718R.styleable.AnylineBaseModuleView_visual_feedback_fill_color, visualFeedbackConfig.getFillColor()));
                visualFeedbackConfig.setStrokeWidthInDp(obtainStyledAttributes.getInt(C0718R.styleable.AnylineBaseModuleView_visual_feedback_stroke_width_in_dp, visualFeedbackConfig.getStrokeWidthInDp()));
                visualFeedbackConfig.setCornerRadiusInDp(obtainStyledAttributes.getInt(C0718R.styleable.AnylineBaseModuleView_visual_feedback_corner_radius_in_dp, visualFeedbackConfig.getCornerRadiusInDp()));
                int i3 = obtainStyledAttributes.getInt(C0718R.styleable.AnylineBaseModuleView_visual_feedback_animation_style, -1);
                if (i3 != -1) {
                    visualFeedbackConfig.setAnimationStyle(VisualFeedbackConfig.AnimationStyle.fromInt(i3));
                }
                visualFeedbackConfig.setAnimationDuration(obtainStyledAttributes.getInt(C0718R.styleable.AnylineBaseModuleView_visual_feedback_animation_duration, visualFeedbackConfig.getAnimationDuration()));
                visualFeedbackConfig.setRedrawTimeout(obtainStyledAttributes.getInt(C0718R.styleable.AnylineBaseModuleView_visual_feedback_redraw_timeout, visualFeedbackConfig.getRedrawTimeout()));
                config.setVisualFeedbackConfig(visualFeedbackConfig);
                setConfig(config);
            }
            obtainStyledAttributes.recycle();
            this.f513j = new C0778a(new C0778a.C0780a() {
                /* renamed from: a */
                public final void mo12573a(BrightnessFeedback brightnessFeedback) {
                    if (AnylineBaseModuleView.this.flashControl != null) {
                        int i = C07725.f519a[brightnessFeedback.ordinal()];
                        if (i == 1) {
                            AnylineBaseModuleView.this.flashControl.setFlashOnIfAuto(false);
                            if (AnylineBaseModuleView.this.isDebug) {
                                Log.d(AnylineBaseModuleView.f505b, "Auto flash turned off");
                            }
                        } else if (i == 2) {
                            AnylineBaseModuleView.this.flashControl.setFlashOnIfAuto(true);
                            if (AnylineBaseModuleView.this.isDebug) {
                                Log.d(AnylineBaseModuleView.f505b, "Auto flash turned on.");
                            }
                        }
                    }
                }
            });
        }
    }

    /* renamed from: at.nineyards.anyline.modules.AnylineBaseModuleView$5 */
    static /* synthetic */ class C07725 {

        /* renamed from: a */
        static final /* synthetic */ int[] f519a = new int[BrightnessFeedback.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                at.nineyards.anyline.modules.AnylineBaseModuleView$BrightnessFeedback[] r0 = p007at.nineyards.anyline.modules.AnylineBaseModuleView.BrightnessFeedback.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f519a = r0
                int[] r0 = f519a     // Catch:{ NoSuchFieldError -> 0x0014 }
                at.nineyards.anyline.modules.AnylineBaseModuleView$BrightnessFeedback r1 = p007at.nineyards.anyline.modules.AnylineBaseModuleView.BrightnessFeedback.TOO_BRIGHT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f519a     // Catch:{ NoSuchFieldError -> 0x001f }
                at.nineyards.anyline.modules.AnylineBaseModuleView$BrightnessFeedback r1 = p007at.nineyards.anyline.modules.AnylineBaseModuleView.BrightnessFeedback.TOO_DARK     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f519a     // Catch:{ NoSuchFieldError -> 0x002a }
                at.nineyards.anyline.modules.AnylineBaseModuleView$BrightnessFeedback r1 = p007at.nineyards.anyline.modules.AnylineBaseModuleView.BrightnessFeedback.OK     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.modules.AnylineBaseModuleView.C07725.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            Context context = getContext();
            if (this.f508e == null) {
                this.f508e = new AnylineSurfaceView(context, getConfig().getVisualFeedbackConfig());
                this.f508e.setZOrderOnTop(true);
                this.f508e.setBackgroundColor(0);
                addView(this.f508e);
                this.f509f = this.f508e.getHolder();
                this.f509f.setFormat(-3);
            }
            this.f508e.layout(0, 0, i5, i6);
        }
    }

    public void startScanning() {
        if (CheckLicense.getInstance().wasChecked()) {
            if (!CheckLicense.getInstance().showPopUp() || !this.f514k) {
                m135b();
                return;
            }
            this.f514k = false;
            Context context = getContext();
            C07692 r2 = new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AnylineBaseModuleView.this.m135b();
                }
            };
            new AlertDialog.Builder(context).setMessage(C0718R.string.license_expiry_info).setPositiveButton(17039370, r2).setNeutralButton(C0718R.string.contact_info, new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AnylineBaseModuleView.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.anyline.com/contact-sales/")));
                }
            }).setCancelable(false).create().show();
        } else if (this.anylineController == null) {
            throw new RuntimeException("Module was not initialized");
        } else {
            throw new RuntimeException(new LicenseException(exception_error_codes.LicenseNotInitialized.swigValue(), exception_error_codes.LicenseNotInitialized.toString()).reason());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m135b() {
        if (getConfig().getFlashMode() == AnylineViewConfig.FlashMode.AUTO || Build.MODEL.contains("bt2pro")) {
            this.f513j.mo12614a(getContext());
        }
        openCameraInBackground();
        synchronized (this.lock) {
            if (this.anylineController != null) {
                this.anylineController.start();
            } else if (this.scanPlugin != null) {
                this.scanPlugin.start();
            }
        }
        if (this.isBeepOnResult && this.f507d == null) {
            m137c();
        }
    }

    public void setConfig(AnylineViewConfig anylineViewConfig) {
        super.setConfig(anylineViewConfig);
        setVibrateOnResult(anylineViewConfig.isVibrateOnResult());
        setBeepOnResult(anylineViewConfig.isBeepOnResult());
        setBlinkOnResult(anylineViewConfig.isBlinkOnResult());
        setCancelOnResult(anylineViewConfig.isCancelOnResult());
        if (this.f508e != null && anylineViewConfig.getVisualFeedbackConfig() != null) {
            this.f508e.setVisualFeedbackConfig(anylineViewConfig.getVisualFeedbackConfig());
        }
    }

    public void cancelScanning() {
        synchronized (this.lock) {
            if (this.anylineController != null) {
                this.anylineController.cancel();
            } else if (this.scanPlugin != null) {
                this.scanPlugin.stop();
            }
            this.f513j.mo12616b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelScanning();
    }

    public void releaseCamera() {
        super.releaseCamera();
        synchronized (this.lock) {
            if (this.f507d != null) {
                this.f507d.releaseSoundPool();
                this.f507d = null;
            }
        }
    }

    public void setCancelOnResult(boolean z) {
        this.isCancelOnResult = z;
        AnylineController anylineController2 = this.anylineController;
        if (anylineController2 != null) {
            anylineController2.setCancelOnResult(z);
            return;
        }
        AbstractScanPlugin abstractScanPlugin = this.scanPlugin;
        if (abstractScanPlugin != null) {
            abstractScanPlugin.setCancelOnResult(z);
        }
    }

    public void setBeepOnResult(boolean z) {
        if (z && this.f507d == null) {
            m137c();
        }
        this.isBeepOnResult = z;
    }

    /* renamed from: c */
    private void m137c() {
        this.f507d = new SoundUtil(getContext());
        try {
            this.f507d.loadSoundFromAssets(SOUND_BEEP);
        } catch (IOException unused) {
            throw new IllegalArgumentException("Sound file (anyline/sounds/beep.wav)could not be opened or does not exist.");
        }
    }

    public void setBlinkOnResult(boolean z) {
        this.isBlinkOnResult = z;
    }

    public void setVibrateOnResult(boolean z) {
        this.isVibrateOnResult = z;
    }

    public void setDebug(boolean z) {
        this.isDebug = z;
        AnylineController anylineController2 = this.anylineController;
        if (anylineController2 != null) {
            anylineController2.setDebug(z);
        } else {
            AbstractScanPlugin abstractScanPlugin = this.scanPlugin;
            if (abstractScanPlugin != null) {
                abstractScanPlugin.setDebug(z);
            }
        }
        this.f513j.mo12615a(z);
    }

    /* access modifiers changed from: protected */
    public void calcCutOutAndImageCropBounds() {
        super.calcCutOutAndImageCropBounds();
        AnylineSurfaceView anylineSurfaceView = this.f508e;
        if (anylineSurfaceView != null) {
            anylineSurfaceView.setCutoutInfo(getCutoutRect(), getScale(), getCutoutCropOffsetOnViewX(), getCutoutCropOffsetOnViewY());
        }
    }

    /* access modifiers changed from: protected */
    public void setScanPlugin(AbstractScanPlugin abstractScanPlugin) {
        this.scanPlugin = abstractScanPlugin;
        abstractScanPlugin.setCancelOnResult(this.isCancelOnResult);
        abstractScanPlugin.setDebug(this.isDebug);
    }

    public boolean isRunning() {
        AnylineController anylineController2 = this.anylineController;
        if (anylineController2 != null && anylineController2.isRunning()) {
            return true;
        }
        AbstractScanPlugin abstractScanPlugin = this.scanPlugin;
        return abstractScanPlugin != null && abstractScanPlugin.isRunning();
    }

    public AnylineController getAnylineController() {
        AbstractScanPlugin abstractScanPlugin = this.scanPlugin;
        if (abstractScanPlugin != null) {
            return abstractScanPlugin.getAnylineController();
        }
        return this.anylineController;
    }

    /* access modifiers changed from: protected */
    public void commonOnFinishedAction() {
        SoundUtil soundUtil;
        if (this.isBlinkOnResult) {
            startBlinkAnimation();
        }
        if (this.isBeepOnResult && (soundUtil = this.f507d) != null) {
            soundUtil.playSound(SOUND_BEEP);
        }
        if (!Build.MODEL.contains("bt2pro") && this.isVibrateOnResult) {
            if (this instanceof DocumentScanView) {
                new Handler().postDelayed(new Runnable() {
                    public final void run() {
                        AnylineBaseModuleView.this.m138d();
                    }
                }, 500);
            } else {
                m138d();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m138d() {
        if (getContext().getPackageManager().checkPermission("android.permission.VIBRATE", getContext().getPackageName()) != -1) {
            Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(200);
            } else {
                Log.d(f505b, "Vibrate on result enabled, but device has no vibrator.");
            }
        } else {
            throw new RuntimeException("Vibrate on result enabled, but vibrate permission missing. Add permission <uses-permission android:name=\"android.permission.VIBRATE\"/>");
        }
    }

    /* access modifiers changed from: protected */
    public List<PointF> getViewRelativePointListFromCutoutRelativeObject(Object obj) {
        if (this.f508e == null) {
            return null;
        }
        return this.f508e.mo12579a(openCvPointListToPointFList(m133a(obj)));
    }

    /* renamed from: a */
    private static List<Point> m133a(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof Rect) {
            Rect rect = (Rect) obj;
            arrayList.add(new Point((double) rect.f6486x, (double) rect.f6487y));
            arrayList.add(new Point((double) (rect.f6486x + rect.width), (double) rect.f6487y));
            arrayList.add(new Point((double) (rect.f6486x + rect.width), (double) (rect.f6487y + rect.height)));
            arrayList.add(new Point((double) rect.f6486x, (double) (rect.f6487y + rect.height)));
        } else if (obj instanceof Square) {
            Square square = (Square) obj;
            arrayList.add(square.upLeft());
            arrayList.add(square.upRight());
            arrayList.add(square.downRight());
            arrayList.add(square.downLeft());
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public void drawFeedback(Object obj) {
        if (this.cameraController.getCameraFeatures() != null && this.cameraController.getCameraFeatures().getLensFacing() == CameraFeatures.LensFacing.FRONT) {
            this.f508e.setIsFlipped(true);
        }
        if (obj instanceof Vector_Contour) {
            Vector_Contour vector_Contour = (Vector_Contour) obj;
            Rect rect = this.f512i;
            float f = this.f511h;
            AnylineSurfaceView anylineSurfaceView = this.f508e;
            if (anylineSurfaceView != null) {
                anylineSurfaceView.mo12581a(vector_Contour, rect, f);
            }
        } else if (obj instanceof Vector_SevenSegmentContour) {
            Vector_SevenSegmentContour vector_SevenSegmentContour = (Vector_SevenSegmentContour) obj;
            Rect rect2 = this.f512i;
            float f2 = this.f511h;
            AnylineSurfaceView anylineSurfaceView2 = this.f508e;
            if (anylineSurfaceView2 != null) {
                anylineSurfaceView2.mo12582a(vector_SevenSegmentContour, rect2, f2);
            }
        } else if ((obj instanceof Rect) || (obj instanceof Square)) {
            List<PointF> openCvPointListToPointFList = openCvPointListToPointFList(m133a(obj));
            Rect rect3 = this.f512i;
            float f3 = this.f511h;
            if (openCvPointListToPointFList.get(1).x - openCvPointListToPointFList.get(0).x != 0.0f || openCvPointListToPointFList.get(2).x - openCvPointListToPointFList.get(3).x != 0.0f) {
                if (openCvPointListToPointFList.get(3).y - openCvPointListToPointFList.get(0).y != 0.0f || openCvPointListToPointFList.get(2).y - openCvPointListToPointFList.get(1).y != 0.0f) {
                    this.f510g = System.currentTimeMillis();
                    colorCutoutStrokeForFeedback();
                    AnylineSurfaceView anylineSurfaceView3 = this.f508e;
                    if (anylineSurfaceView3 != null) {
                        anylineSurfaceView3.mo12584a(openCvPointListToPointFList, rect3, f3);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public List<PointF> openCvPointListToPointFList(List<Point> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Point next : list) {
            arrayList.add(new PointF((float) next.f6481x, (float) next.f6482y));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public void drawShape(List<PointF> list, int i, int i2, int i3, int i4) {
        AnylineSurfaceView anylineSurfaceView = this.f508e;
        if (anylineSurfaceView != null) {
            anylineSurfaceView.mo12583a((List<? extends PointF>) list, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void clearDrawing() {
        AnylineSurfaceView anylineSurfaceView = this.f508e;
        if (anylineSurfaceView != null) {
            anylineSurfaceView.mo12586c();
        }
    }

    /* access modifiers changed from: protected */
    public void clearFeedback() {
        if (System.currentTimeMillis() - this.f510g > 600) {
            AnylineSurfaceView anylineSurfaceView = this.f508e;
            if (anylineSurfaceView != null) {
                anylineSurfaceView.mo12580a();
            }
            resetColorCutoutStrokeForFeedback();
        }
    }

    /* access modifiers changed from: protected */
    public void cancelFeedback() {
        AnylineSurfaceView anylineSurfaceView = this.f508e;
        if (anylineSurfaceView != null) {
            anylineSurfaceView.mo12585b();
        }
        resetColorCutoutStrokeForFeedback();
    }

    public void setScale(float f) {
        this.f511h = f;
    }

    public void setCropRect(Rect rect) {
        this.f512i = rect;
    }

    public BrightnessFeedback getBrightnessFeedback() {
        return this.f513j.mo12618c();
    }

    /* access modifiers changed from: protected */
    public void setLevelsForAutoFlash(int i, int i2, int i3, int i4) {
        this.f513j.mo12613a(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void setCountsForAutoFlash(int i, int i2, int i3, int i4) {
        this.f513j.mo12617b(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void resetLightLevelCounter() {
        this.f513j.mo12611a();
    }

    /* access modifiers changed from: protected */
    public void calculateBrightnessCount(double d) {
        this.f513j.mo12612a(d);
    }

    public void setDebugListener(AnylineDebugListener anylineDebugListener) {
        this.f506c = anylineDebugListener;
    }

    /* access modifiers changed from: protected */
    public boolean isVariableAllowedForDebugReporting(String str) {
        return f504a.containsKey(str);
    }

    /* access modifiers changed from: protected */
    public void reportDebugVariable(String str, Object obj) {
        if (!(obj instanceof AnylineImage) && this.f506c != null && obj != null) {
            if (!isVariableAllowedForDebugReporting(str) || (!f504a.get(str).equals(obj.getClass()) && !f504a.get(str).isAssignableFrom(obj.getClass()))) {
                StringBuilder sb = new StringBuilder("Reporting of ");
                sb.append(str);
                sb.append(" not allowed, or is of wrong type");
                return;
            }
            this.f506c.onDebug(str, obj);
        }
    }

    /* access modifiers changed from: protected */
    public void reportDebugRunSkipped(RunFailure runFailure) {
        AnylineDebugListener anylineDebugListener = this.f506c;
        if (anylineDebugListener != null) {
            anylineDebugListener.onRunSkipped(runFailure);
        }
    }
}
