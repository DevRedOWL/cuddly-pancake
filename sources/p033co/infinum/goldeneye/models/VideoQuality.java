package p033co.infinum.goldeneye.models;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import p035ru.unicorn.ujin.view.activity.BaseActivity;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, mo51343d2 = {"Lco/infinum/goldeneye/models/VideoQuality;", "", "key", "", "(Ljava/lang/String;II)V", "getKey", "()I", "isCamera2Required", "", "isCamera2Required$goldeneye_release", "LOW", "HIGH", "RESOLUTION_720P", "RESOLUTION_1080P", "RESOLUTION_2160P", "HIGH_SPEED_LOW", "HIGH_SPEED_HIGH", "HIGH_SPEED_480P", "HIGH_SPEED_720P", "HIGH_SPEED_1080P", "HIGH_SPEED_2160P", "UNKNOWN", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.models.VideoQuality */
/* compiled from: VideoQuality.kt */
public enum VideoQuality {
    LOW(0),
    HIGH(1),
    RESOLUTION_720P(5),
    RESOLUTION_1080P(6),
    RESOLUTION_2160P(8),
    HIGH_SPEED_LOW(MessageHandler.WHAT_SMOOTH_SCROLL),
    HIGH_SPEED_HIGH(2001),
    HIGH_SPEED_480P(BaseActivity.LOGIN_RES),
    HIGH_SPEED_720P(2003),
    HIGH_SPEED_1080P(2004),
    HIGH_SPEED_2160P(2005),
    UNKNOWN(-1);
    
    private final int key;

    protected VideoQuality(int i) {
        this.key = i;
    }

    public final int getKey() {
        return this.key;
    }

    public final boolean isCamera2Required$goldeneye_release() {
        return CollectionsKt.listOf(RESOLUTION_2160P, HIGH_SPEED_LOW, HIGH_SPEED_HIGH, HIGH_SPEED_480P, HIGH_SPEED_720P, HIGH_SPEED_1080P, HIGH_SPEED_2160P).contains(this);
    }
}
