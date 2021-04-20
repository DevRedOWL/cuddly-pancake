package p035ru.unicorn.ujin.data.realm.notification;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/notification/NotificationType;", "", "getType", "", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.notification.NotificationType */
/* compiled from: NotificationType.kt */
public interface NotificationType {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int GROUP_TITLE_TYPE = 0;
    public static final int ITEM_TYPE = 1;

    int getType();

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/notification/NotificationType$Companion;", "", "()V", "GROUP_TITLE_TYPE", "", "ITEM_TYPE", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.notification.NotificationType$Companion */
    /* compiled from: NotificationType.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int GROUP_TITLE_TYPE = 0;
        public static final int ITEM_TYPE = 1;

        private Companion() {
        }
    }
}
