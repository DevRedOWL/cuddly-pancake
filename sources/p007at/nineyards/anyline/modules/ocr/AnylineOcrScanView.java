package p007at.nineyards.anyline.modules.ocr;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.List;
import org.opencv.core.Rect;
import p007at.nineyards.anyline.AnylineDebugListener;
import p007at.nineyards.anyline.camera.AnylineViewConfig;
import p007at.nineyards.anyline.core.RunFailure;
import p007at.nineyards.anyline.core.Square;
import p007at.nineyards.anyline.core.Vector_Contour;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.models.AnylineRawResult;
import p007at.nineyards.anyline.modules.AnylineBaseModuleView;
import p007at.nineyards.anyline.util.NumUtil;
import p046io.anyline.plugin.ScanInfo;
import p046io.anyline.plugin.ScanInfoListener;
import p046io.anyline.plugin.ScanResult;
import p046io.anyline.plugin.ScanResultListener;
import p046io.anyline.plugin.ScanRunSkippedListener;
import p046io.anyline.plugin.ScanRunSkippedReason;
import p046io.anyline.plugin.ocr.OcrScanPlugin;
import p046io.anyline.plugin.ocr.OcrScanResult;

/* renamed from: at.nineyards.anyline.modules.ocr.AnylineOcrScanView */
public class AnylineOcrScanView extends AnylineBaseModuleView<AnylineOcrResultListener> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f703a = AnylineOcrScanView.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AnylineOcrResultListener f704b;

    /* renamed from: c */
    private boolean f705c;

    /* renamed from: d */
    private AnylineOcrConfig f706d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Rect f707e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f708f;

    /* renamed from: g */
    private final SensorManager f709g;

    /* renamed from: h */
    private final Sensor f710h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public float f711i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float f712j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public float f713k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Float f714l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ArrayDeque<Float> f715m;

    /* renamed from: n */
    private SensorEventListener f716n;

    public AnylineOcrScanView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AnylineOcrScanView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f705c = true;
        this.f708f = 0;
        this.f714l = Float.valueOf(0.0f);
        this.f715m = new ArrayDeque<>(4);
        this.f716n = new SensorEventListener() {
            public final void onAccuracyChanged(Sensor sensor, int i) {
            }

            public final void onSensorChanged(SensorEvent sensorEvent) {
                if (AnylineOcrScanView.this.scanPlugin != null && AnylineOcrScanView.this.f704b != null && sensorEvent.sensor.getType() == 1) {
                    float f = sensorEvent.values[0];
                    float f2 = sensorEvent.values[1];
                    float f3 = sensorEvent.values[2];
                    AnylineOcrScanView anylineOcrScanView = AnylineOcrScanView.this;
                    float unused = anylineOcrScanView.f712j = anylineOcrScanView.f711i;
                    float unused2 = AnylineOcrScanView.this.f711i = (float) Math.sqrt((double) ((f * f) + (f2 * f2) + (f3 * f3)));
                    float abs = Math.abs(AnylineOcrScanView.this.f711i - AnylineOcrScanView.this.f712j);
                    AnylineOcrScanView anylineOcrScanView2 = AnylineOcrScanView.this;
                    float unused3 = anylineOcrScanView2.f713k = (anylineOcrScanView2.f713k * 0.9f) + abs;
                    if (AnylineOcrScanView.this.f715m.size() >= 4) {
                        AnylineOcrScanView anylineOcrScanView3 = AnylineOcrScanView.this;
                        Float unused4 = anylineOcrScanView3.f714l = Float.valueOf(anylineOcrScanView3.f714l.floatValue() - ((Float) AnylineOcrScanView.this.f715m.removeFirst()).floatValue());
                    }
                    AnylineOcrScanView.this.f715m.add(Float.valueOf(AnylineOcrScanView.this.f713k));
                    AnylineOcrScanView anylineOcrScanView4 = AnylineOcrScanView.this;
                    Float unused5 = anylineOcrScanView4.f714l = Float.valueOf(anylineOcrScanView4.f714l.floatValue() + AnylineOcrScanView.this.f713k);
                    if (AnylineOcrScanView.this.f714l.floatValue() / ((float) AnylineOcrScanView.this.f715m.size()) > 2.7f && AnylineOcrScanView.this.isRunning()) {
                        String unused6 = AnylineOcrScanView.f703a;
                        AnylineOcrScanView.this.reportDebugVariable(AnylineDebugListener.DEVICE_SHAKE_WARNING_VARIABLE_NAME, true);
                    }
                }
            }
        };
        this.f709g = (SensorManager) context.getSystemService("sensor");
        this.f710h = this.f709g.getDefaultSensor(1);
    }

    public void setConfig(AnylineViewConfig anylineViewConfig) {
        if (anylineViewConfig.getFlashMode() == AnylineViewConfig.FlashMode.AUTO && !Build.MODEL.contains("bt2pro")) {
            setLevelsForAutoFlash(120, 200, 4, 25);
            setCountsForAutoFlash(5, 10, 10, 20);
        }
        super.setConfig(anylineViewConfig);
    }

    public void initAnyline(String str, AnylineOcrResultListener anylineOcrResultListener) {
        this.f704b = anylineOcrResultListener;
        OcrScanPlugin ocrScanPlugin = new OcrScanPlugin(getContext(), "OCRModule", str, this, this.f706d);
        setScanPlugin(ocrScanPlugin);
        ocrScanPlugin.addScanInfoListener(new ScanInfoListener() {
            public final void onInfo(ScanInfo scanInfo) {
                Object value = scanInfo.getValue();
                String key = scanInfo.getKey();
                if (AnylineDebugListener.BRIGHTNESS_VARIABLE_NAME.equals(key) && value != null) {
                    AnylineOcrScanView.this.calculateBrightnessCount(NumUtil.asDouble(value).doubleValue());
                }
                if ("$result".equals(key) && (value instanceof AnylineRawResult)) {
                    String unused = AnylineOcrScanView.f703a;
                    new StringBuilder("Intermediate Result: ").append(((AnylineRawResult) value).toString());
                }
                if ("$image".equals(key) && (value instanceof AnylineImage)) {
                    int unused2 = AnylineOcrScanView.this.f708f = ((AnylineImage) value).getWidth();
                }
                if ("$resizeWidth".equals(key) && AnylineOcrScanView.this.f708f > 0) {
                    AnylineOcrScanView anylineOcrScanView = AnylineOcrScanView.this;
                    anylineOcrScanView.setScale(((float) anylineOcrScanView.f708f) / NumUtil.asFloat(value).floatValue());
                }
                if ("$cropRect".equals(key) && (value instanceof Rect)) {
                    AnylineOcrScanView.this.setCropRect((Rect) value);
                }
                if (AnylineDebugListener.SQUARE_VARIABLE_NAME.equals(key) && (value instanceof Square)) {
                    AnylineOcrScanView.this.drawFeedback(value);
                }
                if (AnylineDebugListener.OUTLINE_VARIABLE_NAME.equals(key) && (value instanceof Rect)) {
                    Rect unused3 = AnylineOcrScanView.this.f707e = (Rect) value;
                    AnylineOcrScanView anylineOcrScanView2 = AnylineOcrScanView.this;
                    anylineOcrScanView2.drawFeedback(anylineOcrScanView2.f707e);
                    value = AnylineOcrScanView.this.getViewRelativePointListFromCutoutRelativeObject(value);
                }
                if (AnylineDebugListener.CONTOURS_VARIABLE_NAME.equals(key) && (value instanceof Vector_Contour)) {
                    AnylineOcrScanView.this.drawFeedback((Vector_Contour) value);
                }
                if (AnylineOcrScanView.this.isVariableAllowedForDebugReporting(key)) {
                    AnylineOcrScanView.this.reportDebugVariable(key, value);
                }
            }
        });
        ocrScanPlugin.addScanRunSkippedListener(new ScanRunSkippedListener() {
            public final void onRunSkipped(ScanRunSkippedReason scanRunSkippedReason) {
                AnylineOcrScanView.this.reportDebugRunSkipped(new RunFailure(scanRunSkippedReason.getCode(), scanRunSkippedReason.getText()));
                if (AnylineOcrScanView.this.isDebug) {
                    String b = AnylineOcrScanView.f703a;
                    Log.d(b, "RunFailure: (" + scanRunSkippedReason.getCode() + ") " + scanRunSkippedReason.getText());
                }
                if (scanRunSkippedReason.getCode() == 5001 || scanRunSkippedReason.getCode() == 5016 || scanRunSkippedReason.getCode() == 5017 || scanRunSkippedReason.getCode() == 5018) {
                    AnylineOcrScanView.this.clearFeedback();
                }
            }
        });
        ocrScanPlugin.addScanResultListener(new ScanResultListener<OcrScanResult>() {
            public final /* synthetic */ void onResult(ScanResult scanResult) {
                List list;
                OcrScanResult ocrScanResult = (OcrScanResult) scanResult;
                AnylineOcrScanView.this.commonOnFinishedAction();
                AnylineOcrScanView.this.cancelFeedback();
                if (AnylineOcrScanView.this.f707e != null) {
                    AnylineOcrScanView anylineOcrScanView = AnylineOcrScanView.this;
                    list = anylineOcrScanView.getViewRelativePointListFromCutoutRelativeObject(anylineOcrScanView.f707e);
                } else {
                    list = null;
                }
                AnylineOcrScanView.this.f704b.onResult(new AnylineOcrResult(list, ocrScanResult.getConfidence(), ocrScanResult.getCutoutImage(), ocrScanResult.getFullImage(), ocrScanResult.getThresholdedImage(), (String) ocrScanResult.getResult()));
            }
        });
        this.scanPlugin.setReportingEnabled(this.f705c);
    }

    public void setReportingEnabled(boolean z) {
        this.f705c = z;
        if (this.scanPlugin != null) {
            this.scanPlugin.setReportingEnabled(z);
        }
    }

    public void setAnylineOcrConfig(AnylineOcrConfig anylineOcrConfig) {
        this.f706d = anylineOcrConfig;
        if (this.scanPlugin != null) {
            ((OcrScanPlugin) this.scanPlugin).setAnylineOcrConfig(anylineOcrConfig);
        }
    }

    public void startScanning() {
        this.f711i = 9.80665f;
        this.f712j = 9.80665f;
        this.f713k = 0.0f;
        this.f709g.registerListener(this.f716n, this.f710h, 2);
        super.startScanning();
    }

    public void cancelScanning() {
        super.cancelScanning();
        this.f709g.unregisterListener(this.f716n);
    }

    public void copyTrainedData(String str, String str2) {
        OcrScanPlugin.copyTrainedData(getContext(), str, str2);
    }
}
