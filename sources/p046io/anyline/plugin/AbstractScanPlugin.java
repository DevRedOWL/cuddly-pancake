package p046io.anyline.plugin;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p007at.nineyards.anyline.AnylineController;
import p007at.nineyards.anyline.AnylineListener;
import p007at.nineyards.anyline.ImageProvider;
import p007at.nineyards.anyline.camera.AnylineBaseView;
import p007at.nineyards.anyline.camera.CameraView;
import p007at.nineyards.anyline.camera.ImageReceiver;
import p007at.nineyards.anyline.core.RunFailure;
import p007at.nineyards.anyline.models.AnylineImage;
import p046io.anyline.plugin.ScanResult;

/* renamed from: io.anyline.plugin.AbstractScanPlugin */
public abstract class AbstractScanPlugin<ResultType extends ScanResult> implements ScanPlugin<ResultType> {

    /* renamed from: a */
    private static final String f5712a = AbstractScanPlugin.class.getSimpleName();
    protected final AnylineController anylineController;
    protected Context context;
    protected Integer currentConfidence;
    protected AnylineImage currentImage;

    /* renamed from: id */
    protected final String f5713id;
    protected ImageProvider imageProvider;
    protected final List<ScanInfoListener> infoListeners = new ArrayList();
    protected final Object lock = new Object();
    protected final List<ScanResultListener<ResultType>> resultListeners = new ArrayList();
    protected final List<ScanRunSkippedListener> runSkippedListeners = new ArrayList();

    /* access modifiers changed from: protected */
    public abstract void onFinishedWithOutput(Object obj);

    static {
        System.loadLibrary("gnustl_shared");
        System.loadLibrary("opencv_java3");
        System.loadLibrary("anylineCore");
    }

    public AbstractScanPlugin(Context context2, String str, String str2, String str3, String str4, String str5, ImageProvider imageProvider2) {
        this.f5713id = str;
        this.imageProvider = imageProvider2;
        this.context = context2;
        AnylineBaseView anylineBaseView = imageProvider2 instanceof AnylineBaseView ? (AnylineBaseView) imageProvider2 : null;
        this.anylineController = new AnylineController(context2, str2, anylineBaseView, new AnylineListener() {
            public final void onReportsVariable(String str, Object obj) {
                AbstractScanPlugin.this.onReportsVariable(str, obj);
            }

            public final void onFinishedWithOutput(Object obj) {
                AbstractScanPlugin.this.onFinishedWithOutput(obj);
            }

            public final void onAbortRun(RunFailure runFailure) {
                AbstractScanPlugin.this.onAbortRun(runFailure);
            }
        });
        if (anylineBaseView == null) {
            this.anylineController.setImageProvider(imageProvider2);
        }
        if (str3 != null) {
            this.anylineController.setAssetJsonPaths(str3);
        }
        if (str4 != null) {
            this.anylineController.loadCmdFile(str4, str5);
        }
    }

    public String getId() {
        return this.f5713id;
    }

    public void setImageProvider(ImageProvider imageProvider2) {
        this.imageProvider = imageProvider2;
        this.anylineController.setImageProvider(imageProvider2);
    }

    /* access modifiers changed from: protected */
    public ImageReceiver getLastImageWithFullSizeReceiver() {
        ImageProvider imageProvider2 = this.imageProvider;
        if (imageProvider2 instanceof CameraView) {
            return ((CameraView) imageProvider2).getLastImageWithFullSizeReceiver();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public AnylineImage getLastImageWithFullSize() {
        ImageReceiver lastImageWithFullSizeReceiver = getLastImageWithFullSizeReceiver();
        if (lastImageWithFullSizeReceiver == null) {
            return null;
        }
        return new AnylineImage(lastImageWithFullSizeReceiver.getYuvImage(false));
    }

    public void addScanResultListener(ScanResultListener<ResultType> scanResultListener) {
        if (!this.resultListeners.contains(scanResultListener)) {
            this.resultListeners.add(scanResultListener);
        }
    }

    public void removeScanResultListener(ScanResultListener<ResultType> scanResultListener) {
        this.resultListeners.remove(scanResultListener);
    }

    public void addScanInfoListener(ScanInfoListener scanInfoListener) {
        if (!this.infoListeners.contains(scanInfoListener)) {
            this.infoListeners.add(scanInfoListener);
        }
    }

    public void removeScanInfoListener(ScanInfoListener scanInfoListener) {
        this.infoListeners.remove(scanInfoListener);
    }

    public void addScanRunSkippedListener(ScanRunSkippedListener scanRunSkippedListener) {
        if (!this.runSkippedListeners.contains(scanRunSkippedListener)) {
            this.runSkippedListeners.add(scanRunSkippedListener);
        }
    }

    public void removeScanRunSkippedListener(ScanRunSkippedListener scanRunSkippedListener) {
        this.runSkippedListeners.remove(scanRunSkippedListener);
    }

    public void start() {
        this.anylineController.start();
    }

    public void stop() {
        if (isRunning()) {
            this.anylineController.reportTriggerScanningCanceled();
        }
        this.anylineController.cancel();
    }

    public boolean isRunning() {
        return this.anylineController.isRunning();
    }

    public void setReportingEnabled(boolean z) {
        this.anylineController.setReportingEnabled(z);
    }

    public void setCancelOnResult(boolean z) {
        this.anylineController.setCancelOnResult(z);
    }

    public void setDebug(boolean z) {
        this.anylineController.setDebug(z);
    }

    public AnylineController getAnylineController() {
        return this.anylineController;
    }

    /* access modifiers changed from: protected */
    public void invokeOnResult(ResultType resulttype) {
        for (ScanResultListener<ResultType> onResult : this.resultListeners) {
            onResult.onResult(resulttype);
        }
    }

    /* access modifiers changed from: protected */
    public void invokeOnInfo(String str, Object obj) {
        ScanInfo scanInfo = new ScanInfo(this.f5713id, str, obj);
        for (ScanInfoListener onInfo : this.infoListeners) {
            onInfo.onInfo(scanInfo);
        }
    }

    /* access modifiers changed from: protected */
    public void invokeOnRunSkipped(RunFailure runFailure) {
        ScanRunSkippedReason scanRunSkippedReason = new ScanRunSkippedReason(this.f5713id, runFailure.errorCode(), runFailure.reason());
        for (ScanRunSkippedListener onRunSkipped : this.runSkippedListeners) {
            onRunSkipped.onRunSkipped(scanRunSkippedReason);
        }
    }

    /* access modifiers changed from: protected */
    public void onReportsVariable(String str, Object obj) {
        if ("$image".equals(str) && (obj instanceof AnylineImage)) {
            AnylineImage anylineImage = this.currentImage;
            if (anylineImage != null) {
                anylineImage.release();
            }
            this.currentImage = (AnylineImage) obj;
        }
        if ("$confidence".equals(str) && (obj instanceof Integer)) {
            this.currentConfidence = (Integer) obj;
        }
        invokeOnInfo(str, obj);
    }

    /* access modifiers changed from: protected */
    public void onAbortRun(RunFailure runFailure) {
        if (this.anylineController.isDebug()) {
            String str = f5712a;
            Log.d(str, "RunFailure: (" + runFailure.errorCode() + ") " + runFailure.getMessage());
        }
        invokeOnRunSkipped(runFailure);
    }
}
