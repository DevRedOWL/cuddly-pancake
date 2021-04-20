package p046io.anyline.plugin.licenseplate;

import android.content.Context;
import android.graphics.PointF;
import java.util.List;
import p007at.nineyards.anyline.ImageProvider;
import p007at.nineyards.anyline.models.AnylineRawResult;
import p046io.anyline.plugin.AbstractScanPlugin;

/* renamed from: io.anyline.plugin.licenseplate.LicensePlateScanPlugin */
public class LicensePlateScanPlugin extends AbstractScanPlugin<LicensePlateScanResult> {
    public static final String ANYLINE_LICENSE_PLATE_BUNDLE_PATH = "anyline/module_license_plate";

    /* renamed from: a */
    private static final String f5739a = LicensePlateScanPlugin.class.getSimpleName();

    public LicensePlateScanPlugin(Context context, String str, String str2, ImageProvider imageProvider) {
        super(context, str, str2, "anyline/module_license_plate/anyline_assets.json", "license_plates_combined", ANYLINE_LICENSE_PLATE_BUNDLE_PATH, imageProvider);
        this.anylineController.setStartVariable("$isOcrModule", 0);
    }

    /* access modifiers changed from: protected */
    public void onFinishedWithOutput(Object obj) {
        AnylineRawResult anylineRawResult = (AnylineRawResult) obj;
        invokeOnResult(new LicensePlateScanResult(this.f5713id, (List<PointF>) null, this.currentConfidence, this.currentImage.clone(), getLastImageWithFullSize(), anylineRawResult.getResult("license_plate_number"), anylineRawResult.getResult("country")));
    }
}
