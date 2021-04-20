package p035ru.unicorn.ujin.view.fragments.oss.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.oss.response.OssData;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/events/OssDataEvent;", "", "success", "", "message", "", "ossData", "Lru/unicorn/ujin/view/fragments/oss/response/OssData;", "(ZLjava/lang/String;Lru/unicorn/ujin/view/fragments/oss/response/OssData;)V", "getMessage", "()Ljava/lang/String;", "getOssData", "()Lru/unicorn/ujin/view/fragments/oss/response/OssData;", "getSuccess", "()Z", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.events.OssDataEvent */
/* compiled from: OssDataEvent.kt */
public final class OssDataEvent {
    private final String message;
    private final OssData ossData;
    private final boolean success;

    public OssDataEvent(boolean z, String str, OssData ossData2) {
        Intrinsics.checkNotNullParameter(str, "message");
        this.success = z;
        this.message = str;
        this.ossData = ossData2;
    }

    public final String getMessage() {
        return this.message;
    }

    public final OssData getOssData() {
        return this.ossData;
    }

    public final boolean getSuccess() {
        return this.success;
    }
}
