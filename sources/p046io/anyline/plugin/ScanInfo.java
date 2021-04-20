package p046io.anyline.plugin;

/* renamed from: io.anyline.plugin.ScanInfo */
public class ScanInfo {
    protected final String key;
    protected final String pluginId;
    protected final Object value;

    public ScanInfo(String str, String str2, Object obj) {
        this.pluginId = str;
        this.key = str2;
        this.value = obj;
    }

    public String getPluginId() {
        return this.pluginId;
    }

    public String getKey() {
        return this.key;
    }

    public Object getValue() {
        return this.value;
    }
}
