package p046io.anyline.plugin.barcode;

import android.graphics.PointF;
import java.util.List;
import p007at.nineyards.anyline.models.AnylineImage;
import p046io.anyline.plugin.ScanResult;

/* renamed from: io.anyline.plugin.barcode.BarcodeScanResult */
public class BarcodeScanResult extends ScanResult<String> {

    /* renamed from: a */
    private BarcodeFormat f5719a;

    public BarcodeScanResult(String str, List<PointF> list, Integer num, AnylineImage anylineImage, AnylineImage anylineImage2, String str2, BarcodeFormat barcodeFormat) {
        super(str, list, num, anylineImage, anylineImage2, str2);
        this.f5719a = barcodeFormat;
    }

    public BarcodeFormat getBarcodeFormat() {
        return this.f5719a;
    }
}
