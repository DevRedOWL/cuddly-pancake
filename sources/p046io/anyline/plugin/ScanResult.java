package p046io.anyline.plugin;

import android.graphics.PointF;
import java.util.List;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.models.AnylineScanResult;

/* renamed from: io.anyline.plugin.ScanResult */
public class ScanResult<T> extends AnylineScanResult<T> {
    protected final String pluginId;

    public ScanResult(String str, List<PointF> list, Integer num, AnylineImage anylineImage, AnylineImage anylineImage2, T t) {
        super(list, num, anylineImage, anylineImage2, t);
        this.pluginId = str;
    }

    public String getPluginId() {
        return this.pluginId;
    }
}
