package p035ru.unicorn.ujin.view.fragments.notification;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p035ru.unicorn.ujin.data.realm.notification.Notification;
import p035ru.unicorn.ujin.data.realm.notification.NotificationType;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.notification.NotificationListAdapter$onBindViewHolder$1 */
/* compiled from: NotificationListAdapter.kt */
final class NotificationListAdapter$onBindViewHolder$1 implements View.OnClickListener {
    final /* synthetic */ int $position;
    final /* synthetic */ NotificationListAdapter this$0;

    NotificationListAdapter$onBindViewHolder$1(NotificationListAdapter notificationListAdapter, int i) {
        this.this$0 = notificationListAdapter;
        this.$position = i;
    }

    public final void onClick(View view) {
        Function1<Notification, Unit> onItemClickListener = this.this$0.getOnItemClickListener();
        NotificationType notificationType = this.this$0.getData().get(this.$position);
        if (notificationType != null) {
            onItemClickListener.invoke((Notification) notificationType);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.data.realm.notification.Notification");
    }
}