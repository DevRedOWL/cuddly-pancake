package p035ru.unicorn.ujin.view.fragments.notification;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.notification.Notification;
import p035ru.unicorn.ujin.data.realm.notification.NotificationType;
import p035ru.unicorn.ujin.view.customViews.SwipeToDeleteCallback;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/notification/NotificationListFragment$onViewCreated$swipeHandler$1", "Lru/unicorn/ujin/view/customViews/SwipeToDeleteCallback;", "onSwiped", "", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "direction", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.notification.NotificationListFragment$onViewCreated$swipeHandler$1 */
/* compiled from: NotificationListFragment.kt */
public final class NotificationListFragment$onViewCreated$swipeHandler$1 extends SwipeToDeleteCallback {
    final /* synthetic */ NotificationListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NotificationListFragment$onViewCreated$swipeHandler$1(NotificationListFragment notificationListFragment, Context context) {
        super(context);
        this.this$0 = notificationListFragment;
    }

    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        RecyclerView recyclerView = (RecyclerView) this.this$0._$_findCachedViewById(C5619R.C5622id.notificationListView);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "notificationListView");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            NotificationListAdapter notificationListAdapter = (NotificationListAdapter) adapter;
            NotificationType item = notificationListAdapter.getItem(viewHolder.getAdapterPosition());
            if (item != null) {
                String id = ((Notification) item).getId();
                if (id != null) {
                    this.this$0.removeItem(id);
                }
                notificationListAdapter.removeItem(viewHolder.getAdapterPosition());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.data.realm.notification.Notification");
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.fragments.notification.NotificationListAdapter");
    }
}
