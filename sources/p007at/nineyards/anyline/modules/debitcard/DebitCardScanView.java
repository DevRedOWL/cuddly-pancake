package p007at.nineyards.anyline.modules.debitcard;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import p007at.nineyards.anyline.AnylineController;
import p007at.nineyards.anyline.AnylineDebugListener;
import p007at.nineyards.anyline.AnylineListener;
import p007at.nineyards.anyline.camera.AnylineViewConfig;
import p007at.nineyards.anyline.core.RunFailure;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.models.AnylineRawResult;
import p007at.nineyards.anyline.modules.AnylineBaseModuleView;
import p007at.nineyards.anyline.util.NumUtil;

/* renamed from: at.nineyards.anyline.modules.debitcard.DebitCardScanView */
public class DebitCardScanView extends AnylineBaseModuleView<DebitCardResultListener> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f621a = DebitCardScanView.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public DebitCardResultListener f622b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AnylineImage f623c;

    public DebitCardScanView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DebitCardScanView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setConfig(AnylineViewConfig anylineViewConfig) {
        anylineViewConfig.setCutoutRatio(1.5858f);
        if (anylineViewConfig.getFlashMode() == AnylineViewConfig.FlashMode.AUTO) {
            setLevelsForAutoFlash(50, 200, 4, 25);
            setCountsForAutoFlash(5, 10, 10, 20);
        }
        super.setConfig(anylineViewConfig);
    }

    public void initAnyline(String str, DebitCardResultListener debitCardResultListener) {
        this.f622b = debitCardResultListener;
        this.anylineController = new AnylineController(getContext(), str, this, new AnylineListener() {

            /* renamed from: a */
            public boolean f624a = false;

            /* renamed from: b */
            public int f625b;

            public final void onReportsVariable(String str, Object obj) {
                if ("$image".equals(str) && (obj instanceof AnylineImage)) {
                    if (DebitCardScanView.this.f623c != null) {
                        DebitCardScanView.this.f623c.release();
                    }
                    AnylineImage unused = DebitCardScanView.this.f623c = (AnylineImage) obj;
                }
                if (AnylineDebugListener.BRIGHTNESS_VARIABLE_NAME.equals(str)) {
                    float floatValue = NumUtil.asFloat(obj).floatValue();
                    String unused2 = DebitCardScanView.f621a;
                    DebitCardScanView.this.calculateBrightnessCount((double) floatValue);
                }
                if ("$resultCount".equals(str)) {
                    int intValue = NumUtil.asInteger(obj).intValue();
                    if (this.f625b > 20 && intValue < 2 && !this.f624a) {
                        this.f624a = true;
                        DebitCardScanView.this.anylineController.setStartVariable("$useContrastThreshold", 1);
                    }
                }
                if ("$result".equals(str) && (obj instanceof AnylineRawResult)) {
                    this.f625b++;
                }
            }

            public final void onFinishedWithOutput(Object obj) {
                DebitCardScanView.this.commonOnFinishedAction();
                DebitCardScanView.this.f622b.onResult(new DebitCardResult((AnylineRawResult) obj), DebitCardScanView.this.f623c.clone());
            }

            public final void onAbortRun(RunFailure runFailure) {
                if (DebitCardScanView.this.isDebug) {
                    String b = DebitCardScanView.f621a;
                    Log.d(b, "RunFailure: (" + runFailure.errorCode() + ") " + runFailure.getMessage());
                }
            }
        });
        this.anylineController.setAssetJsonPaths("anyline/module_debit_card/anyline_assets.json");
        this.anylineController.setCancelOnResult(this.isCancelOnResult);
        this.anylineController.setDebug(this.isDebug);
        this.anylineController.loadCmdFile("debitcard", "anyline/module_debit_card");
    }
}
