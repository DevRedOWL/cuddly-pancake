package p007at.nineyards.anyline.modules.document;

import android.graphics.PointF;
import java.util.List;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.models.AnylineScanResult;

/* renamed from: at.nineyards.anyline.modules.document.DocumentResult */
public class DocumentResult extends AnylineScanResult<AnylineImage> {
    public DocumentResult(List<PointF> list, Integer num, AnylineImage anylineImage, AnylineImage anylineImage2, AnylineImage anylineImage3) {
        super(list, num, anylineImage, anylineImage2, anylineImage3);
    }
}
