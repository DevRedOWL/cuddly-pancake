package p007at.nineyards.anyline.modules.barcode;

import android.graphics.PointF;
import java.util.List;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.models.AnylineScanResult;
import p007at.nineyards.anyline.modules.barcode.BarcodeScanView;

/* renamed from: at.nineyards.anyline.modules.barcode.BarcodeResult */
public class BarcodeResult extends AnylineScanResult<String> {

    /* renamed from: a */
    private final BarcodeScanView.BarcodeFormat f608a;

    public BarcodeResult(List<PointF> list, Integer num, AnylineImage anylineImage, AnylineImage anylineImage2, String str, BarcodeScanView.BarcodeFormat barcodeFormat) {
        super(list, num, anylineImage, anylineImage2, str);
        this.f608a = barcodeFormat;
    }

    public BarcodeScanView.BarcodeFormat getBarcodeFormat() {
        return this.f608a;
    }
}
