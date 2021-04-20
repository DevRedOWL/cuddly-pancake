package p007at.nineyards.anyline.modules.mrz;

import android.graphics.PointF;
import java.util.List;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.models.AnylineScanResult;

/* renamed from: at.nineyards.anyline.modules.mrz.MrzResult */
public class MrzResult extends AnylineScanResult<Identification> {
    public MrzResult(List<PointF> list, Integer num, AnylineImage anylineImage, AnylineImage anylineImage2, Identification identification) {
        super(list, num, anylineImage, anylineImage2, identification);
    }
}
