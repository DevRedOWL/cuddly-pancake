package p007at.nineyards.anyline.modules.licenseplate;

import android.graphics.PointF;
import java.util.List;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.models.AnylineScanResult;

/* renamed from: at.nineyards.anyline.modules.licenseplate.LicensePlateResult */
public class LicensePlateResult extends AnylineScanResult<String> {

    /* renamed from: a */
    private final String f662a;

    protected LicensePlateResult(List<PointF> list, Integer num, AnylineImage anylineImage, AnylineImage anylineImage2, String str, String str2) {
        super(list, num, anylineImage, anylineImage2, str);
        this.f662a = str2;
    }

    public String getCountry() {
        return this.f662a;
    }
}
