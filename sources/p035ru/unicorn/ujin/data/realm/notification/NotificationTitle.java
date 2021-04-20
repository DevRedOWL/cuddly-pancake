package p035ru.unicorn.ujin.data.realm.notification;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/notification/NotificationTitle;", "Lru/unicorn/ujin/data/realm/notification/NotificationType;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "component1", "copy", "equals", "", "other", "", "getType", "", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.notification.NotificationTitle */
/* compiled from: NotificationTitle.kt */
public final class NotificationTitle implements NotificationType {
    private String title;

    public NotificationTitle() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ NotificationTitle copy$default(NotificationTitle notificationTitle, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationTitle.title;
        }
        return notificationTitle.copy(str);
    }

    public final String component1() {
        return this.title;
    }

    public final NotificationTitle copy(String str) {
        Intrinsics.checkNotNullParameter(str, "title");
        return new NotificationTitle(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof NotificationTitle) && Intrinsics.areEqual((Object) this.title, (Object) ((NotificationTitle) obj).title);
        }
        return true;
    }

    public int getType() {
        return 0;
    }

    public int hashCode() {
        String str = this.title;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "NotificationTitle(title=" + this.title + ")";
    }

    public NotificationTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "title");
        this.title = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotificationTitle(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }
}
