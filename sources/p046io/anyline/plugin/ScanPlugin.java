package p046io.anyline.plugin;

import p007at.nineyards.anyline.ImageProvider;
import p046io.anyline.plugin.ScanResult;

/* renamed from: io.anyline.plugin.ScanPlugin */
public interface ScanPlugin<ResultType extends ScanResult> {
    void addScanInfoListener(ScanInfoListener scanInfoListener);

    void addScanResultListener(ScanResultListener<ResultType> scanResultListener);

    void addScanRunSkippedListener(ScanRunSkippedListener scanRunSkippedListener);

    String getId();

    void removeScanInfoListener(ScanInfoListener scanInfoListener);

    void removeScanResultListener(ScanResultListener<ResultType> scanResultListener);

    void removeScanRunSkippedListener(ScanRunSkippedListener scanRunSkippedListener);

    void setImageProvider(ImageProvider imageProvider);

    void start();

    void stop();
}
