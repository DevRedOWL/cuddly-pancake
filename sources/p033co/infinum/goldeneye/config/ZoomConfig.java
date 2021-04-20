package p033co.infinum.goldeneye.config;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0004\"\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u00020\u000eX¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u0006X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, mo51343d2 = {"Lco/infinum/goldeneye/config/ZoomConfig;", "", "isZoomSupported", "", "()Z", "maxZoom", "", "getMaxZoom", "()I", "pinchToZoomEnabled", "getPinchToZoomEnabled", "setPinchToZoomEnabled", "(Z)V", "pinchToZoomFriction", "", "getPinchToZoomFriction", "()F", "setPinchToZoomFriction", "(F)V", "zoom", "getZoom", "setZoom", "(I)V", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.ZoomConfig */
/* compiled from: ZoomConfig.kt */
public interface ZoomConfig {
    int getMaxZoom();

    boolean getPinchToZoomEnabled();

    float getPinchToZoomFriction();

    int getZoom();

    boolean isZoomSupported();

    void setPinchToZoomEnabled(boolean z);

    void setPinchToZoomFriction(float f);

    void setZoom(int i);
}
