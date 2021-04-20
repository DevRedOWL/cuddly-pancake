package p007at.nineyards.anyline.modules.licenseplate;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import java.util.List;
import org.opencv.core.Rect;
import p007at.nineyards.anyline.AnylineDebugListener;
import p007at.nineyards.anyline.core.RunFailure;
import p007at.nineyards.anyline.core.Square;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.modules.AnylineBaseModuleView;
import p007at.nineyards.anyline.util.NumUtil;
import p046io.anyline.plugin.ScanInfo;
import p046io.anyline.plugin.ScanInfoListener;
import p046io.anyline.plugin.ScanResult;
import p046io.anyline.plugin.ScanResultListener;
import p046io.anyline.plugin.ScanRunSkippedListener;
import p046io.anyline.plugin.ScanRunSkippedReason;
import p046io.anyline.plugin.licenseplate.LicensePlateScanPlugin;
import p046io.anyline.plugin.licenseplate.LicensePlateScanResult;

/* renamed from: at.nineyards.anyline.modules.licenseplate.LicensePlateScanView */
public class LicensePlateScanView extends AnylineBaseModuleView<LicensePlateResultListener> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f663a = LicensePlateScanView.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public LicensePlateResultListener f664b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Square f665c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f666d;

    /* renamed from: e */
    private boolean f667e;

    public LicensePlateScanView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LicensePlateScanView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f666d = 0;
        this.f667e = true;
    }

    public void initAnyline(String str, LicensePlateResultListener licensePlateResultListener) {
        this.f664b = licensePlateResultListener;
        LicensePlateScanPlugin licensePlateScanPlugin = new LicensePlateScanPlugin(getContext(), "LicensePlateModule", str, this);
        setScanPlugin(licensePlateScanPlugin);
        licensePlateScanPlugin.addScanInfoListener(new ScanInfoListener() {
            public final void onInfo(ScanInfo scanInfo) {
                Object value = scanInfo.getValue();
                String key = scanInfo.getKey();
                if (AnylineDebugListener.BRIGHTNESS_VARIABLE_NAME.equals(key)) {
                    float floatValue = NumUtil.asFloat(value).floatValue();
                    String unused = LicensePlateScanView.f663a;
                    LicensePlateScanView.this.calculateBrightnessCount((double) floatValue);
                }
                if ("$image".equals(key) && (value instanceof AnylineImage)) {
                    int unused2 = LicensePlateScanView.this.f666d = ((AnylineImage) value).getWidth();
                }
                if ("$resizeWidth".equals(key) && LicensePlateScanView.this.f666d > 0) {
                    LicensePlateScanView licensePlateScanView = LicensePlateScanView.this;
                    licensePlateScanView.setScale(((float) licensePlateScanView.f666d) / NumUtil.asFloat(value).floatValue());
                }
                if ("$cropRect".equals(key) && (value instanceof Rect)) {
                    LicensePlateScanView.this.setCropRect((Rect) value);
                }
                if (AnylineDebugListener.SQUARE_VARIABLE_NAME.equals(key) && (value instanceof Square)) {
                    Square unused3 = LicensePlateScanView.this.f665c = (Square) value;
                    LicensePlateScanView.this.drawFeedback(value);
                }
                if (LicensePlateScanView.this.isVariableAllowedForDebugReporting(key)) {
                    LicensePlateScanView.this.reportDebugVariable(key, value);
                }
            }
        });
        licensePlateScanPlugin.addScanRunSkippedListener(new ScanRunSkippedListener() {
            public final void onRunSkipped(ScanRunSkippedReason scanRunSkippedReason) {
                LicensePlateScanView.this.reportDebugRunSkipped(new RunFailure(scanRunSkippedReason.getCode(), scanRunSkippedReason.getText()));
                if (LicensePlateScanView.this.isDebug) {
                    String b = LicensePlateScanView.f663a;
                    Log.d(b, "RunFailure: (" + scanRunSkippedReason.getCode() + ") " + scanRunSkippedReason.getText());
                }
                if (scanRunSkippedReason.getCode() == 5001 || scanRunSkippedReason.getCode() == 5016 || scanRunSkippedReason.getCode() == 5017 || scanRunSkippedReason.getCode() == 5018) {
                    LicensePlateScanView.this.clearFeedback();
                }
            }
        });
        licensePlateScanPlugin.addScanResultListener(new ScanResultListener<LicensePlateScanResult>() {
            public final /* synthetic */ void onResult(ScanResult scanResult) {
                List list;
                LicensePlateScanResult licensePlateScanResult = (LicensePlateScanResult) scanResult;
                LicensePlateScanView.this.commonOnFinishedAction();
                LicensePlateScanView.this.cancelFeedback();
                if (LicensePlateScanView.this.f665c != null) {
                    LicensePlateScanView licensePlateScanView = LicensePlateScanView.this;
                    list = licensePlateScanView.getViewRelativePointListFromCutoutRelativeObject(licensePlateScanView.f665c);
                } else {
                    list = null;
                }
                LicensePlateScanView.this.f664b.onResult(new LicensePlateResult(list, licensePlateScanResult.getConfidence(), licensePlateScanResult.getCutoutImage(), licensePlateScanResult.getFullImage(), (String) licensePlateScanResult.getResult(), licensePlateScanResult.getCountry()));
            }
        });
        this.scanPlugin.setReportingEnabled(this.f667e);
    }

    public void setReportingEnabled(boolean z) {
        this.f667e = z;
        if (this.scanPlugin != null) {
            this.scanPlugin.setReportingEnabled(z);
        }
    }
}
