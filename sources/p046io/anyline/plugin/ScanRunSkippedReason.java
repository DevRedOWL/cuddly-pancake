package p046io.anyline.plugin;

/* renamed from: io.anyline.plugin.ScanRunSkippedReason */
public class ScanRunSkippedReason {
    protected final int code;
    protected final String pluginId;
    protected final String text;

    public ScanRunSkippedReason(String str, int i, String str2) {
        this.pluginId = str;
        this.code = i;
        this.text = str2;
    }

    public String getPluginId() {
        return this.pluginId;
    }

    public int getCode() {
        return this.code;
    }

    public String getText() {
        return this.text;
    }
}
