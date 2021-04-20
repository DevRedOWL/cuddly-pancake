package p046io.anyline.plugin.barcode;

import android.content.Context;
import android.graphics.PointF;
import java.util.List;
import p007at.nineyards.anyline.ImageProvider;
import p007at.nineyards.anyline.models.AnylineRawResult;
import p046io.anyline.plugin.AbstractScanPlugin;

/* renamed from: io.anyline.plugin.barcode.BarcodeScanPlugin */
public class BarcodeScanPlugin extends AbstractScanPlugin<BarcodeScanResult> {
    public void setReportingEnabled(boolean z) {
    }

    public BarcodeScanPlugin(Context context, String str, String str2, ImageProvider imageProvider) {
        super(context, str, str2, "anyline/module_barcode/anyline_assets.json", "ean", "anyline/module_barcode", imageProvider);
        super.setReportingEnabled(false);
    }

    /* access modifiers changed from: protected */
    public void onFinishedWithOutput(Object obj) {
        AnylineRawResult anylineRawResult = (AnylineRawResult) obj;
        String result = anylineRawResult.getResult("ean");
        String result2 = anylineRawResult.getResult("barcode_format");
        invokeOnResult(new BarcodeScanResult(this.f5713id, (List<PointF>) null, (Integer) null, this.currentImage.clone(), getLastImageWithFullSize(), result, (result2 == null || result2.length() == 0) ? BarcodeFormat.UNKNOWN : BarcodeFormat.valueOf(result2)));
    }

    public void setBarcodeFormats(BarcodeFormat... barcodeFormatArr) {
        if (barcodeFormatArr != null) {
            if (barcodeFormatArr.length != 1 || !barcodeFormatArr[0].equals(BarcodeFormat.UNKNOWN)) {
                StringBuilder sb = new StringBuilder();
                for (BarcodeFormat barcodeFormat : barcodeFormatArr) {
                    if (!barcodeFormat.equals(BarcodeFormat.UNKNOWN)) {
                        sb.append(barcodeFormat.toString());
                        sb.append("|");
                    }
                }
                sb.setLength(sb.length() - 1);
                this.anylineController.setStartVariable("$barcodeFormats", sb.toString());
                return;
            }
        }
        this.anylineController.setStartVariable("$barcodeFormats", (Object) null);
    }
}
