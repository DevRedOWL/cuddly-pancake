package p035ru.unicorn.ujin.data.service.location;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.service.push.PushChannel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/data/service/location/PushManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "manager", "Landroid/app/NotificationManager;", "getManager", "()Landroid/app/NotificationManager;", "manager$delegate", "Lkotlin/Lazy;", "notificationChannel", "Landroid/app/NotificationChannel;", "getNotificationChannel", "()Landroid/app/NotificationChannel;", "setNotificationChannel", "(Landroid/app/NotificationChannel;)V", "createNotificationChannel", "", "pushChannel", "Lru/unicorn/ujin/data/service/push/PushChannel;", "getNotificationBuilder", "Landroid/app/Notification$Builder;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.service.location.PushManager */
/* compiled from: PushManager.kt */
public final class PushManager {
    private final Context context;
    private final Lazy manager$delegate = LazyKt.lazy(new PushManager$manager$2(this));
    private NotificationChannel notificationChannel;

    public final NotificationManager getManager() {
        return (NotificationManager) this.manager$delegate.getValue();
    }

    public PushManager(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
    }

    public final Context getContext() {
        return this.context;
    }

    public final NotificationChannel getNotificationChannel() {
        return this.notificationChannel;
    }

    public final void setNotificationChannel(NotificationChannel notificationChannel2) {
        this.notificationChannel = notificationChannel2;
    }

    public final void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel build = new PushChannel().build();
            getManager().createNotificationChannel(build);
            this.notificationChannel = build;
        }
    }

    public final void createNotificationChannel(PushChannel pushChannel) {
        Intrinsics.checkNotNullParameter(pushChannel, "pushChannel");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel build = pushChannel.build();
            getManager().createNotificationChannel(build);
            this.notificationChannel = build;
        }
    }

    public final Notification.Builder getNotificationBuilder() {
        if (this.notificationChannel == null) {
            createNotificationChannel();
        }
        if (Build.VERSION.SDK_INT < 26) {
            return new Notification.Builder(this.context);
        }
        Context context2 = this.context;
        NotificationChannel notificationChannel2 = this.notificationChannel;
        return new Notification.Builder(context2, notificationChannel2 != null ? notificationChannel2.getId() : null);
    }
}
