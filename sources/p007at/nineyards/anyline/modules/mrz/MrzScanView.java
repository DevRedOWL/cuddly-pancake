package p007at.nineyards.anyline.modules.mrz;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import java.util.List;
import org.opencv.core.Rect;
import p007at.nineyards.anyline.AnylineDebugListener;
import p007at.nineyards.anyline.camera.AnylineViewConfig;
import p007at.nineyards.anyline.core.RunFailure;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.modules.AnylineBaseModuleView;
import p007at.nineyards.anyline.util.NumUtil;
import p046io.anyline.plugin.ScanInfo;
import p046io.anyline.plugin.ScanInfoListener;
import p046io.anyline.plugin.ScanResult;
import p046io.anyline.plugin.ScanResultListener;
import p046io.anyline.plugin.ScanRunSkippedListener;
import p046io.anyline.plugin.ScanRunSkippedReason;
import p046io.anyline.plugin.mrz.MrzScanPlugin;

/* renamed from: at.nineyards.anyline.modules.mrz.MrzScanView */
public class MrzScanView extends AnylineBaseModuleView<MrzResultListener> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f690a = MrzScanView.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public MrzResultListener f691b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f692c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Rect f693d;

    public MrzScanView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MrzScanView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f692c = 0;
    }

    public void setConfig(AnylineViewConfig anylineViewConfig) {
        anylineViewConfig.setCutoutRatio(1.47f);
        if (anylineViewConfig.getFlashMode() == AnylineViewConfig.FlashMode.AUTO && !Build.MODEL.contains("bt2pro")) {
            setLevelsForAutoFlash(120, 200, 4, 25);
            setCountsForAutoFlash(5, 10, 10, 20);
        }
        super.setConfig(anylineViewConfig);
    }

    public void initAnyline(String str, MrzResultListener mrzResultListener) {
        this.f691b = mrzResultListener;
        MrzScanPlugin mrzScanPlugin = new MrzScanPlugin(getContext(), "MRZModule", str, this);
        setScanPlugin(mrzScanPlugin);
        mrzScanPlugin.addScanInfoListener(new ScanInfoListener() {
            public final void onInfo(ScanInfo scanInfo) {
                Object value = scanInfo.getValue();
                String key = scanInfo.getKey();
                if (AnylineDebugListener.BRIGHTNESS_VARIABLE_NAME.equals(key)) {
                    float floatValue = NumUtil.asFloat(value).floatValue();
                    String unused = MrzScanView.f690a;
                    MrzScanView.this.calculateBrightnessCount((double) floatValue);
                }
                if ("$image".equals(key) && (value instanceof AnylineImage)) {
                    int unused2 = MrzScanView.this.f692c = ((AnylineImage) value).getWidth();
                }
                if ("$resizeWidth".equals(key) && MrzScanView.this.f692c > 0) {
                    MrzScanView mrzScanView = MrzScanView.this;
                    mrzScanView.setScale(((float) mrzScanView.f692c) / NumUtil.asFloat(value).floatValue());
                }
                if ("$cropRect".equals(key) && (value instanceof Rect)) {
                    MrzScanView.this.setCropRect((Rect) value);
                }
                if (AnylineDebugListener.CONTOURS_VARIABLE_NAME.equals(key) || AnylineDebugListener.OUTLINE_VARIABLE_NAME.equals(key)) {
                    MrzScanView.this.drawFeedback(value);
                }
                if (AnylineDebugListener.OUTLINE_VARIABLE_NAME.equals(key) && (value instanceof Rect)) {
                    Rect unused3 = MrzScanView.this.f693d = (Rect) value;
                    value = MrzScanView.this.getViewRelativePointListFromCutoutRelativeObject(value);
                }
                if (MrzScanView.this.isVariableAllowedForDebugReporting(key)) {
                    MrzScanView.this.reportDebugVariable(key, value);
                }
            }
        });
        mrzScanPlugin.addScanRunSkippedListener(new ScanRunSkippedListener() {
            public final void onRunSkipped(ScanRunSkippedReason scanRunSkippedReason) {
                MrzScanView.this.clearFeedback();
                MrzScanView.this.reportDebugRunSkipped(new RunFailure(scanRunSkippedReason.getCode(), scanRunSkippedReason.getText()));
            }
        });
        mrzScanPlugin.addScanResultListener(new ScanResultListener<ScanResult<Identification>>() {
            public final void onResult(ScanResult<Identification> scanResult) {
                List list;
                MrzScanView.this.commonOnFinishedAction();
                MrzScanView.this.cancelFeedback();
                if (MrzScanView.this.f693d != null) {
                    MrzScanView mrzScanView = MrzScanView.this;
                    list = mrzScanView.getViewRelativePointListFromCutoutRelativeObject(mrzScanView.f693d);
                } else {
                    list = null;
                }
                MrzScanView.this.f691b.onResult(new MrzResult(list, scanResult.getConfidence(), scanResult.getCutoutImage(), scanResult.getFullImage(), scanResult.getResult()));
            }
        });
    }
}
