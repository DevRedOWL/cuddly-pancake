package p046io.anyline.plugin.ocr;

import android.graphics.PointF;
import java.util.List;
import p007at.nineyards.anyline.models.AnylineImage;
import p046io.anyline.plugin.ScanResult;

/* renamed from: io.anyline.plugin.ocr.OcrScanResult */
public class OcrScanResult extends ScanResult<String> {

    /* renamed from: a */
    private final AnylineImage f5751a;

    public OcrScanResult(String str, List<PointF> list, Integer num, AnylineImage anylineImage, AnylineImage anylineImage2, String str2, AnylineImage anylineImage3) {
        super(str, list, num, anylineImage, anylineImage2, str2);
        this.f5751a = anylineImage3;
    }

    public AnylineImage getThresholdedImage() {
        return this.f5751a;
    }
}
