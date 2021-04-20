package p007at.nineyards.anyline.modules.barcode;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import java.util.List;
import org.opencv.core.Rect;
import p007at.nineyards.anyline.AnylineDebugListener;
import p007at.nineyards.anyline.camera.AnylineViewConfig;
import p007at.nineyards.anyline.core.RunFailure;
import p007at.nineyards.anyline.modules.AnylineBaseModuleView;
import p007at.nineyards.anyline.util.NumUtil;
import p046io.anyline.plugin.ScanInfo;
import p046io.anyline.plugin.ScanInfoListener;
import p046io.anyline.plugin.ScanResult;
import p046io.anyline.plugin.ScanResultListener;
import p046io.anyline.plugin.ScanRunSkippedListener;
import p046io.anyline.plugin.ScanRunSkippedReason;
import p046io.anyline.plugin.barcode.BarcodeScanPlugin;
import p046io.anyline.plugin.barcode.BarcodeScanResult;

/* renamed from: at.nineyards.anyline.modules.barcode.BarcodeScanView */
public class BarcodeScanView extends AnylineBaseModuleView<BarcodeResultListener> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f609a = BarcodeScanView.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public BarcodeResultListener f610b;

    /* renamed from: c */
    private BarcodeFormat[] f611c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Rect f612d;

    /* renamed from: at.nineyards.anyline.modules.barcode.BarcodeScanView$BarcodeFormat */
    public enum BarcodeFormat {
        AZTEC("AZTEC"),
        CODABAR("CODABAR"),
        CODE_39("CODE_39"),
        CODE_93("CODE_93"),
        CODE_128("CODE_128"),
        DATA_MATRIX("DATA_MATRIX"),
        EAN_8("EAN_8"),
        EAN_13("EAN_13"),
        ITF("ITF"),
        PDF_417("PDF_417"),
        QR_CODE("QR_CODE"),
        RSS_14("RSS_14"),
        RSS_EXPANDED("RSS_EXPANDED"),
        UPC_A("UPC_A"),
        UPC_E("UPC_E"),
        UPC_EAN_EXTENSION("UPC_EAN_EXTENSION"),
        UNKNOWN("UNKNOWN");
        

        /* renamed from: a */
        private final String f617a;

        private BarcodeFormat(String str) {
            this.f617a = str;
        }

        public final String toString() {
            return this.f617a;
        }
    }

    public BarcodeScanView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BarcodeScanView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f611c = null;
    }

    public void setConfig(AnylineViewConfig anylineViewConfig) {
        if (anylineViewConfig.getFlashMode() == AnylineViewConfig.FlashMode.AUTO && !Build.MODEL.contains("bt2pro")) {
            setLevelsForAutoFlash(40, 90, 10, 25);
        }
        super.setConfig(anylineViewConfig);
    }

    public void setBarcodeFormats(BarcodeFormat... barcodeFormatArr) {
        this.f611c = barcodeFormatArr;
        if (this.scanPlugin != null) {
            ((BarcodeScanPlugin) this.scanPlugin).setBarcodeFormats(m223a(this.f611c));
        }
    }

    public void initAnyline(String str, BarcodeResultListener barcodeResultListener) {
        this.f610b = barcodeResultListener;
        BarcodeScanPlugin barcodeScanPlugin = new BarcodeScanPlugin(getContext(), "BarcodeModule", str, this);
        setScanPlugin(barcodeScanPlugin);
        barcodeScanPlugin.addScanInfoListener(new ScanInfoListener() {
            public final void onInfo(ScanInfo scanInfo) {
                Object value = scanInfo.getValue();
                String key = scanInfo.getKey();
                if (AnylineDebugListener.BRIGHTNESS_VARIABLE_NAME.equals(key)) {
                    float floatValue = NumUtil.asFloat(value).floatValue();
                    String unused = BarcodeScanView.f609a;
                    BarcodeScanView.this.calculateBrightnessCount((double) floatValue);
                }
                if (AnylineDebugListener.CONTOURS_VARIABLE_NAME.equals(key) || AnylineDebugListener.OUTLINE_VARIABLE_NAME.equals(key)) {
                    BarcodeScanView.this.drawFeedback(value);
                }
                if (AnylineDebugListener.OUTLINE_VARIABLE_NAME.equals(key) && (value instanceof Rect)) {
                    Rect unused2 = BarcodeScanView.this.f612d = (Rect) value;
                    value = BarcodeScanView.this.getViewRelativePointListFromCutoutRelativeObject(value);
                }
                if (BarcodeScanView.this.isVariableAllowedForDebugReporting(key)) {
                    BarcodeScanView.this.reportDebugVariable(key, value);
                }
            }
        });
        barcodeScanPlugin.addScanRunSkippedListener(new ScanRunSkippedListener() {
            public final void onRunSkipped(ScanRunSkippedReason scanRunSkippedReason) {
                BarcodeScanView.this.clearFeedback();
                BarcodeScanView.this.reportDebugRunSkipped(new RunFailure(scanRunSkippedReason.getCode(), scanRunSkippedReason.getText()));
            }
        });
        barcodeScanPlugin.addScanResultListener(new ScanResultListener<BarcodeScanResult>() {
            public final /* synthetic */ void onResult(ScanResult scanResult) {
                List list;
                BarcodeScanResult barcodeScanResult = (BarcodeScanResult) scanResult;
                BarcodeScanView.this.commonOnFinishedAction();
                BarcodeScanView.this.cancelFeedback();
                if (BarcodeScanView.this.f612d != null) {
                    BarcodeScanView barcodeScanView = BarcodeScanView.this;
                    list = barcodeScanView.getViewRelativePointListFromCutoutRelativeObject(barcodeScanView.f612d);
                } else {
                    list = null;
                }
                BarcodeScanView.this.f610b.onResult(new BarcodeResult(list, barcodeScanResult.getConfidence(), barcodeScanResult.getCutoutImage(), barcodeScanResult.getFullImage(), (String) barcodeScanResult.getResult(), barcodeScanResult.getBarcodeFormat().toBarcodeScanViewBarcodeFormat()));
            }
        });
        ((BarcodeScanPlugin) this.scanPlugin).setBarcodeFormats(m223a(this.f611c));
    }

    /* renamed from: a */
    private static p046io.anyline.plugin.barcode.BarcodeFormat[] m223a(BarcodeFormat... barcodeFormatArr) {
        if (barcodeFormatArr == null) {
            return null;
        }
        p046io.anyline.plugin.barcode.BarcodeFormat[] barcodeFormatArr2 = new p046io.anyline.plugin.barcode.BarcodeFormat[barcodeFormatArr.length];
        for (int i = 0; i < barcodeFormatArr.length; i++) {
            barcodeFormatArr2[i] = p046io.anyline.plugin.barcode.BarcodeFormat.fromBarcodeScanViewBarcodeFormat(barcodeFormatArr[i]);
        }
        return barcodeFormatArr2;
    }
}
