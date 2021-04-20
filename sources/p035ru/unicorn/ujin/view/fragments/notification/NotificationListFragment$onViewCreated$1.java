package p035ru.unicorn.ujin.view.fragments.notification;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.data.realm.notification.Notification;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "item", "Lru/unicorn/ujin/data/realm/notification/Notification;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.notification.NotificationListFragment$onViewCreated$1 */
/* compiled from: NotificationListFragment.kt */
final class NotificationListFragment$onViewCreated$1 extends Lambda implements Function1<Notification, Unit> {
    final /* synthetic */ NotificationListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NotificationListFragment$onViewCreated$1(NotificationListFragment notificationListFragment) {
        super(1);
        this.this$0 = notificationListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Notification) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Notification notification) {
        Intrinsics.checkNotNullParameter(notification, "item");
        this.this$0.onItemClicked(notification);
    }
}
