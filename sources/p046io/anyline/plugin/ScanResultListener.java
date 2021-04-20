package p046io.anyline.plugin;

import p046io.anyline.plugin.ScanResult;

/* renamed from: io.anyline.plugin.ScanResultListener */
public interface ScanResultListener<T extends ScanResult> {
    void onResult(T t);
}
