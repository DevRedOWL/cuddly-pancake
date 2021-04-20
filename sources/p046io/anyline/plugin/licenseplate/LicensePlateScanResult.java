package p046io.anyline.plugin.licenseplate;

import android.graphics.PointF;
import java.util.List;
import p007at.nineyards.anyline.models.AnylineImage;
import p046io.anyline.plugin.ScanResult;

/* renamed from: io.anyline.plugin.licenseplate.LicensePlateScanResult */
public class LicensePlateScanResult extends ScanResult<String> {

    /* renamed from: a */
    private final String f5740a;

    public LicensePlateScanResult(String str, List<PointF> list, Integer num, AnylineImage anylineImage, AnylineImage anylineImage2, String str2, String str3) {
        super(str, list, num, anylineImage, anylineImage2, str2);
        this.f5740a = str3;
    }

    public String getCountry() {
        return this.f5740a;
    }
}
