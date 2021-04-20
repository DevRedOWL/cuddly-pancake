package p046io.anyline.plugin.mrz;

import android.content.Context;
import android.graphics.PointF;
import java.util.List;
import p007at.nineyards.anyline.ImageProvider;
import p007at.nineyards.anyline.models.AnylineRawResult;
import p007at.nineyards.anyline.modules.mrz.Identification;
import p046io.anyline.plugin.AbstractScanPlugin;
import p046io.anyline.plugin.ScanResult;

/* renamed from: io.anyline.plugin.mrz.MrzScanPlugin */
public class MrzScanPlugin extends AbstractScanPlugin<ScanResult<Identification>> {

    /* renamed from: a */
    private static final String f5747a = MrzScanPlugin.class.getSimpleName();

    public void setReportingEnabled(boolean z) {
    }

    public MrzScanPlugin(Context context, String str, String str2, ImageProvider imageProvider) {
        super(context, str, str2, "anyline/module_mrz/anyline_assets.json", "mrz_scanning", "anyline/module_mrz", imageProvider);
        super.setReportingEnabled(false);
    }

    /* access modifiers changed from: protected */
    public void onFinishedWithOutput(Object obj) {
        invokeOnResult(new ScanResult(this.f5713id, (List<PointF>) null, this.currentConfidence, this.currentImage.clone(), getLastImageWithFullSize(), new Identification((AnylineRawResult) obj)));
    }
}
