package p035ru.unicorn.ujin.data.api.response.notification;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.notification.Notification;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/notification/NotificationListResponse;", "", "notifications", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/notification/Notification;", "(Lio/realm/RealmList;)V", "getNotifications", "()Lio/realm/RealmList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.notification.NotificationListResponse */
/* compiled from: NotificationListResponse.kt */
public final class NotificationListResponse {
    private final RealmList<Notification> notifications;

    public static /* synthetic */ NotificationListResponse copy$default(NotificationListResponse notificationListResponse, RealmList<Notification> realmList, int i, Object obj) {
        if ((i & 1) != 0) {
            realmList = notificationListResponse.notifications;
        }
        return notificationListResponse.copy(realmList);
    }

    public final RealmList<Notification> component1() {
        return this.notifications;
    }

    public final NotificationListResponse copy(RealmList<Notification> realmList) {
        return new NotificationListResponse(realmList);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof NotificationListResponse) && Intrinsics.areEqual((Object) this.notifications, (Object) ((NotificationListResponse) obj).notifications);
        }
        return true;
    }

    public int hashCode() {
        RealmList<Notification> realmList = this.notifications;
        if (realmList != null) {
            return realmList.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "NotificationListResponse(notifications=" + this.notifications + ")";
    }

    public NotificationListResponse(RealmList<Notification> realmList) {
        this.notifications = realmList;
    }

    public final RealmList<Notification> getNotifications() {
        return this.notifications;
    }
}
