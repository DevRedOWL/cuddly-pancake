package p007at.nineyards.anyline.modules.energy;

import android.graphics.PointF;
import java.util.List;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.models.AnylineScanResult;
import p007at.nineyards.anyline.modules.energy.EnergyScanView;

/* renamed from: at.nineyards.anyline.modules.energy.EnergyResult */
public class EnergyResult extends AnylineScanResult<String> {

    /* renamed from: a */
    private final EnergyScanView.ScanMode f649a;

    public EnergyResult(List<PointF> list, Integer num, AnylineImage anylineImage, AnylineImage anylineImage2, EnergyScanView.ScanMode scanMode, String str) {
        super(list, num, anylineImage, anylineImage2, str);
        this.f649a = scanMode;
    }

    public EnergyScanView.ScanMode getScanMode() {
        return this.f649a;
    }
}
