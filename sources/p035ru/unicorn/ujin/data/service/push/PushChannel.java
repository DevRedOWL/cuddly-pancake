package p035ru.unicorn.ujin.data.service.push;

import android.app.NotificationChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/data/service/push/PushChannel;", "", "()V", "channelId", "", "channelName", "importance", "", "build", "Landroid/app/NotificationChannel;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.service.push.PushChannel */
/* compiled from: PushChannel.kt */
public final class PushChannel {
    private String channelId = "kortros";
    private String channelName = "kortros";
    private int importance = 3;

    public final PushChannel channelId(String str) {
        Intrinsics.checkNotNullParameter(str, "channelId");
        PushChannel pushChannel = this;
        pushChannel.channelId = str;
        return pushChannel;
    }

    public final PushChannel channelName(String str) {
        Intrinsics.checkNotNullParameter(str, "channelName");
        PushChannel pushChannel = this;
        pushChannel.channelName = str;
        return pushChannel;
    }

    public final PushChannel importance(int i) {
        PushChannel pushChannel = this;
        pushChannel.importance = i;
        return pushChannel;
    }

    public final NotificationChannel build() {
        PushChannel pushChannel = this;
        return new NotificationChannel(pushChannel.channelId, pushChannel.channelName, pushChannel.importance);
    }
}
