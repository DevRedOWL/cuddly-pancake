package p007at.nineyards.anyline.modules.ocr;

import android.graphics.PointF;
import java.util.List;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.models.AnylineScanResult;

/* renamed from: at.nineyards.anyline.modules.ocr.AnylineOcrResult */
public class AnylineOcrResult extends AnylineScanResult<String> {

    /* renamed from: a */
    private final AnylineImage f702a;

    public AnylineOcrResult(List<PointF> list, Integer num, AnylineImage anylineImage, AnylineImage anylineImage2, AnylineImage anylineImage3, String str) {
        super(list, num, anylineImage, anylineImage2, str);
        this.f702a = anylineImage3;
    }

    public AnylineImage getThresholdedImage() {
        return this.f702a;
    }
}
