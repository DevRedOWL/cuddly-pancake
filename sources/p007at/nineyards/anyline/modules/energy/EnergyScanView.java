package p007at.nineyards.anyline.modules.energy;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import java.util.List;
import org.opencv.core.Rect;
import p007at.nineyards.anyline.AnylineDebugListener;
import p007at.nineyards.anyline.camera.AnylineViewConfig;
import p007at.nineyards.anyline.camera.CameraFeatures;
import p007at.nineyards.anyline.camera.VisualFeedbackConfig;
import p007at.nineyards.anyline.core.RunFailure;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.modules.AnylineBaseModuleView;
import p007at.nineyards.anyline.util.NumUtil;
import p042cz.msebera.android.httpclient.HttpStatus;
import p046io.anyline.plugin.ScanInfo;
import p046io.anyline.plugin.ScanInfoListener;
import p046io.anyline.plugin.ScanResult;
import p046io.anyline.plugin.ScanResultListener;
import p046io.anyline.plugin.ScanRunSkippedListener;
import p046io.anyline.plugin.ScanRunSkippedReason;
import p046io.anyline.plugin.meter.MeterScanMode;
import p046io.anyline.plugin.meter.MeterScanPlugin;
import p046io.anyline.plugin.meter.MeterScanResult;

/* renamed from: at.nineyards.anyline.modules.energy.EnergyScanView */
public class EnergyScanView extends AnylineBaseModuleView<EnergyResultListener> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f650a = EnergyScanView.class.getSimpleName();

    /* renamed from: b */
    private ScanMode f651b;

    /* renamed from: c */
    private boolean f652c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public EnergyResultListener f653d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Rect f654e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f655f;

    /* renamed from: g */
    private VisualFeedbackConfig f656g;

    /* renamed from: at.nineyards.anyline.modules.energy.EnergyScanView$ScanMode */
    public enum ScanMode {
        AUTO_ANALOG_DIGITAL_METER,
        ANALOG_METER,
        DIGITAL_METER,
        HEAT_METER_4,
        HEAT_METER_5,
        HEAT_METER_6,
        BARCODE,
        SERIAL_NUMBER,
        DIAL_METER,
        DOT_MATRIX_METER
    }

    static {
        System.loadLibrary("gnustl_shared");
        System.loadLibrary("opencv_java3");
        System.loadLibrary("anylineCore");
    }

    public EnergyScanView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EnergyScanView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f651b = ScanMode.ANALOG_METER;
        this.f655f = 0;
        getPreferredCameraConfig().setFocusMode(CameraFeatures.FocusMode.AUTO);
    }

    public ScanMode getScanMode() {
        return this.f651b;
    }

    public void setConfig(AnylineViewConfig anylineViewConfig) {
        anylineViewConfig.setPreferredPreviewHeight(1280);
        anylineViewConfig.setPreferredPreviewWidth(720);
        if (anylineViewConfig.getVisualFeedbackConfig() == null) {
            if (this.f656g == null) {
                this.f656g = new VisualFeedbackConfig();
            }
            anylineViewConfig.setVisualFeedbackConfig(this.f656g);
        }
        super.setConfig(anylineViewConfig);
    }

    public void setScanMode(ScanMode scanMode) {
        synchronized (this.lock) {
            this.f651b = scanMode;
            getConfig().setCutoutMaxWidthPercent(90);
            getConfig().setCutoutMaxHeightPercent(90);
            if (!Build.MODEL.contains("bt2pro")) {
                setLevelsForAutoFlash(12, 80, 14, 25);
                setCountsForAutoFlash(15, 15, 10, 20);
            }
            if (this.scanPlugin != null) {
                ((MeterScanPlugin) this.scanPlugin).setScanMode(MeterScanMode.fromEnergyScanMode(scanMode));
            }
            switch (scanMode) {
                case ANALOG_METER:
                    if (!Build.MODEL.contains("bt2pro")) {
                        getConfig().setCutoutWidth(540);
                    } else {
                        int round = Math.round(300.0f);
                        getConfig().setCutoutWidth(round);
                        getConfig().setCutoutOffsetX((640 - round) / 2);
                        getConfig().setCutoutOffsetY(170);
                    }
                    getConfig().setCutoutRatio(4.3f);
                    break;
                case SERIAL_NUMBER:
                    if (!Build.MODEL.contains("bt2pro")) {
                        setLevelsForAutoFlash(12, 80, 14, 25);
                        setCountsForAutoFlash(15, 15, 10, 20);
                        getConfig().setCutoutWidth(HttpStatus.SC_METHOD_FAILURE);
                    } else {
                        getConfig().setCutoutWidth(300);
                        getConfig().setCutoutAlignment(AnylineViewConfig.CutoutAlignment.TOP);
                        getConfig().setCutoutOffsetY(170);
                        getConfig().setCutoutOffsetX(170);
                    }
                    getConfig().setCutoutRatio(5.0f);
                    break;
                case BARCODE:
                    if (!Build.MODEL.contains("bt2pro")) {
                        setLevelsForAutoFlash(40, 90, 10, 25);
                        setCountsForAutoFlash(4, 4, 10, 20);
                    } else {
                        getConfig().setCutoutWidth(300);
                        getConfig().setCutoutAlignment(AnylineViewConfig.CutoutAlignment.TOP);
                        getConfig().setCutoutOffsetY(170);
                        getConfig().setCutoutOffsetX(170);
                    }
                    getConfig().setCutoutWidth(0);
                    getConfig().setCutoutMaxWidthPercent(80);
                    getConfig().setCutoutMaxHeightPercent(80);
                    getConfig().setCutoutRatio(1.25f);
                    break;
                case AUTO_ANALOG_DIGITAL_METER:
                case DIGITAL_METER:
                    if (!Build.MODEL.contains("bt2pro")) {
                        setLevelsForAutoFlash(12, 80, 14, 25);
                        setCountsForAutoFlash(15, 15, 10, 20);
                        getConfig().setCutoutWidth(540);
                    } else {
                        getConfig().setCutoutWidth(300);
                        getConfig().setCutoutAlignment(AnylineViewConfig.CutoutAlignment.TOP);
                        getConfig().setCutoutOffsetY(170);
                        getConfig().setCutoutOffsetX(170);
                    }
                    getConfig().setCutoutMaxWidthPercent(90);
                    getConfig().setCutoutMaxHeightPercent(90);
                    getConfig().setCutoutRatio(2.25f);
                    break;
                case DOT_MATRIX_METER:
                    setLevelsForAutoFlash(12, 80, 14, 25);
                    setCountsForAutoFlash(15, 15, 10, 20);
                    getConfig().setCutoutWidth(540);
                    getConfig().setCutoutMaxWidthPercent(90);
                    getConfig().setCutoutMaxHeightPercent(90);
                    getConfig().setCutoutRatio(3.5f);
                    break;
                case HEAT_METER_4:
                case HEAT_METER_5:
                case HEAT_METER_6:
                    if (!Build.MODEL.contains("bt2pro")) {
                        setLevelsForAutoFlash(12, 80, 14, 25);
                        setCountsForAutoFlash(15, 15, 10, 20);
                        getConfig().setCutoutWidth(540);
                    } else {
                        getConfig().setCutoutWidth(300);
                        getConfig().setCutoutAlignment(AnylineViewConfig.CutoutAlignment.TOP);
                        getConfig().setCutoutOffsetY(170);
                        getConfig().setCutoutOffsetX(170);
                    }
                    resetLightLevelCounter();
                    getConfig().setCutoutMaxWidthPercent(90);
                    getConfig().setCutoutMaxHeightPercent(90);
                    getConfig().setCutoutRatio(2.25f);
                    break;
                case DIAL_METER:
                    Build.MODEL.contains("bt2pro");
                    getConfig().setCutoutMaxWidthPercent(90);
                    getConfig().setCutoutMaxHeightPercent(90);
                    getConfig().setCutoutWidth(0);
                    getConfig().setCutoutRatio(1.47f);
                    break;
            }
        }
        setScale(1.0f);
        setCropRect((Rect) null);
        if (this.f651b == ScanMode.ANALOG_METER || this.f651b == ScanMode.DIGITAL_METER || this.f651b == ScanMode.DOT_MATRIX_METER || this.f651b == ScanMode.AUTO_ANALOG_DIGITAL_METER || this.f651b == ScanMode.SERIAL_NUMBER) {
            this.f656g.setFeedbackStyle(VisualFeedbackConfig.FeedbackStyle.CONTOUR_RECT);
        } else {
            this.f656g.setFeedbackStyle(VisualFeedbackConfig.FeedbackStyle.RECT);
        }
        resetLightLevelCounter();
        if (getWidth() > 0) {
            clearDrawing();
            clearFeedback();
            updateCutoutView();
        }
    }

    public void initAnyline(String str, EnergyResultListener energyResultListener) {
        this.f653d = energyResultListener;
        MeterScanPlugin meterScanPlugin = new MeterScanPlugin(getContext(), "EnergyModule", str, this);
        setScanPlugin(meterScanPlugin);
        meterScanPlugin.addScanInfoListener(new ScanInfoListener() {
            public final void onInfo(ScanInfo scanInfo) {
                Object value = scanInfo.getValue();
                String key = scanInfo.getKey();
                if (AnylineDebugListener.BRIGHTNESS_VARIABLE_NAME.equals(key)) {
                    double doubleValue = NumUtil.asDouble(value).doubleValue();
                    String unused = EnergyScanView.f650a;
                    EnergyScanView.this.calculateBrightnessCount(doubleValue);
                }
                if ("$image".equals(key) && (value instanceof AnylineImage)) {
                    int unused2 = EnergyScanView.this.f655f = ((AnylineImage) value).getWidth();
                }
                if ("$resizeWidth".equals(key) && EnergyScanView.this.f655f > 0) {
                    EnergyScanView energyScanView = EnergyScanView.this;
                    energyScanView.setScale(((float) energyScanView.f655f) / NumUtil.asFloat(value).floatValue());
                }
                if (("$cropRect".equals(key) || "$contourRect".equals(key)) && (value instanceof Rect)) {
                    EnergyScanView.this.setCropRect((Rect) value);
                }
                if (AnylineDebugListener.CONTOURS_VARIABLE_NAME.equals(key) || key.contains("Contours") || "$filteredSegConts".equals(key) || AnylineDebugListener.OUTLINE_VARIABLE_NAME.equals(key)) {
                    EnergyScanView.this.drawFeedback(value);
                }
                if (AnylineDebugListener.OUTLINE_VARIABLE_NAME.equals(key) && (value instanceof Rect)) {
                    Rect unused3 = EnergyScanView.this.f654e = (Rect) value;
                    value = EnergyScanView.this.getViewRelativePointListFromCutoutRelativeObject(value);
                }
                if (EnergyScanView.this.isVariableAllowedForDebugReporting(key)) {
                    EnergyScanView.this.reportDebugVariable(key, value);
                }
            }
        });
        meterScanPlugin.addScanRunSkippedListener(new ScanRunSkippedListener() {
            public final void onRunSkipped(ScanRunSkippedReason scanRunSkippedReason) {
                EnergyScanView.this.clearFeedback();
                EnergyScanView.this.reportDebugRunSkipped(new RunFailure(scanRunSkippedReason.getCode(), scanRunSkippedReason.getText()));
            }
        });
        meterScanPlugin.addScanResultListener(new ScanResultListener<MeterScanResult>() {
            public final /* synthetic */ void onResult(ScanResult scanResult) {
                List list;
                MeterScanResult meterScanResult = (MeterScanResult) scanResult;
                EnergyScanView.this.commonOnFinishedAction();
                EnergyScanView.this.cancelFeedback();
                if (EnergyScanView.this.f654e != null) {
                    EnergyScanView energyScanView = EnergyScanView.this;
                    list = energyScanView.getViewRelativePointListFromCutoutRelativeObject(energyScanView.f654e);
                } else {
                    list = null;
                }
                EnergyScanView.this.f653d.onResult(new EnergyResult(list, meterScanResult.getConfidence(), meterScanResult.getCutoutImage(), meterScanResult.getFullImage(), meterScanResult.getScanMode().toEnergyScanMode(), (String) meterScanResult.getResult()));
            }
        });
        setScanMode(this.f651b);
        this.scanPlugin.setReportingEnabled(this.f652c);
    }

    public void setReportingEnabled(boolean z) {
        this.f652c = z;
        if (this.scanPlugin != null) {
            this.scanPlugin.setReportingEnabled(z);
        }
    }
}
