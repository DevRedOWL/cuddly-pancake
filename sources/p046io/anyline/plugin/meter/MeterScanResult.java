package p046io.anyline.plugin.meter;

import android.graphics.PointF;
import java.util.List;
import p007at.nineyards.anyline.models.AnylineImage;
import p046io.anyline.plugin.ScanResult;

/* renamed from: io.anyline.plugin.meter.MeterScanResult */
public class MeterScanResult extends ScanResult<String> {

    /* renamed from: a */
    private final MeterScanMode f5746a;

    public MeterScanResult(String str, List<PointF> list, Integer num, AnylineImage anylineImage, AnylineImage anylineImage2, String str2, MeterScanMode meterScanMode) {
        super(str, list, num, anylineImage, anylineImage2, str2);
        this.f5746a = meterScanMode;
    }

    public MeterScanMode getScanMode() {
        return this.f5746a;
    }
}
