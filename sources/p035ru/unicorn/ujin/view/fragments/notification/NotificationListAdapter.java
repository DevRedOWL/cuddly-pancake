package p035ru.unicorn.ujin.view.fragments.notification;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.data.realm.notification.Notification;
import p035ru.unicorn.ujin.data.realm.notification.NotificationTitle;
import p035ru.unicorn.ujin.data.realm.notification.NotificationType;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.customViews.dynamic.DatePickerViewHolder;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002*+B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0005J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001eH\u0016J\u000e\u0010'\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0014\u0010(\u001a\u00020\t2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R0\u0010\u0011\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\t0\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006,"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/notification/NotificationListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "data", "", "Lru/unicorn/ujin/data/realm/notification/NotificationType;", "onItemClickListener", "Lkotlin/Function1;", "Lru/unicorn/ujin/data/realm/notification/Notification;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "context", "Landroid/content/Context;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "onItemClick", "Lkotlin/Function2;", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function2;", "setOnItemClick", "(Lkotlin/jvm/functions/Function2;)V", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function1;", "addItem", "item", "getItem", "position", "", "getItemCount", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItem", "setItems", "items", "ItemViewHolder", "TitleViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.notification.NotificationListAdapter */
/* compiled from: NotificationListAdapter.kt */
public final class NotificationListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<NotificationType> data;
    private Function2<? super String, ? super String, Unit> onItemClick = NotificationListAdapter$onItemClick$1.INSTANCE;
    private final Function1<Notification, Unit> onItemClickListener;

    public final List<NotificationType> getData() {
        return this.data;
    }

    public final void setData(List<NotificationType> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public NotificationListAdapter(List<NotificationType> list, Function1<? super Notification, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "data");
        Intrinsics.checkNotNullParameter(function1, "onItemClickListener");
        this.data = list;
        this.onItemClickListener = function1;
    }

    public final Function1<Notification, Unit> getOnItemClickListener() {
        return this.onItemClickListener;
    }

    public final Function2<String, String, Unit> getOnItemClick() {
        return this.onItemClick;
    }

    public final void setOnItemClick(Function2<? super String, ? super String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.onItemClick = function2;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
        this.context = context2;
        if (i != 0) {
            Context context3 = this.context;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            View inflate = LayoutInflater.from(context3).inflate(R.layout.item_notification, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(cont…ification, parent, false)");
            return new ItemViewHolder(inflate);
        }
        Context context4 = this.context;
        if (context4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        View inflate2 = LayoutInflater.from(context4).inflate(R.layout.item_notification_title, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "LayoutInflater.from(cont…ion_title, parent, false)");
        return new TitleViewHolder(inflate2);
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        if (viewHolder.getItemViewType() != 0) {
            ItemViewHolder itemViewHolder = (ItemViewHolder) viewHolder;
            NotificationType notificationType = this.data.get(i);
            if (notificationType != null) {
                itemViewHolder.bind((Notification) notificationType);
                viewHolder.itemView.setOnClickListener(new NotificationListAdapter$onBindViewHolder$1(this, i));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.data.realm.notification.Notification");
        }
        TitleViewHolder titleViewHolder = (TitleViewHolder) viewHolder;
        NotificationType notificationType2 = this.data.get(i);
        if (notificationType2 != null) {
            titleViewHolder.bind((NotificationTitle) notificationType2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.data.realm.notification.NotificationTitle");
    }

    public int getItemViewType(int i) {
        return this.data.get(i).getType();
    }

    public int getItemCount() {
        return this.data.size();
    }

    public final void setItems(List<NotificationType> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.data = list;
        notifyDataSetChanged();
    }

    public final void addItem(NotificationType notificationType) {
        Intrinsics.checkNotNullParameter(notificationType, "item");
        this.data.add(notificationType);
        notifyItemInserted(getItemCount() - 1);
    }

    public final void removeItem(int i) {
        this.data.remove(i);
        notifyItemRemoved(i);
        notifyItemRangeChanged(i, this.data.size());
    }

    public final NotificationType getItem(int i) {
        return this.data.get(i);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/notification/NotificationListAdapter$TitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "Lru/unicorn/ujin/data/realm/notification/NotificationTitle;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.notification.NotificationListAdapter$TitleViewHolder */
    /* compiled from: NotificationListAdapter.kt */
    public static final class TitleViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TitleViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
        }

        public final void bind(NotificationTitle notificationTitle) {
            Intrinsics.checkNotNullParameter(notificationTitle, "item");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvGroupTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvGroupTitle");
            textView.setText(notificationTitle.getTitle());
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/notification/NotificationListAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "notification", "Lru/unicorn/ujin/data/realm/notification/Notification;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.notification.NotificationListAdapter$ItemViewHolder */
    /* compiled from: NotificationListAdapter.kt */
    public static final class ItemViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
        }

        public final void bind(Notification notification) {
            Intrinsics.checkNotNullParameter(notification, "notification");
            Calendar parseDate = DateUtils.parseDate(notification.getSentAt(), "yyyy-MM-dd HH:mm:ss");
            if (parseDate != null) {
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvDate);
                Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvDate");
                textView.setText(DateUtils.formatDateFromCalendar(parseDate, DatePickerViewHolder.DATE_FORMAT) + " \nв " + DateUtils.formatTimeFromCalendar(parseDate));
            }
            CharSequence title = notification.getTitle();
            if (title == null || StringsKt.isBlank(title)) {
                View view2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                TextView textView2 = (TextView) view2.findViewById(C5619R.C5622id.tvTitle);
                Intrinsics.checkNotNullExpressionValue(textView2, "itemView.tvTitle");
                textView2.setVisibility(8);
            } else {
                View view3 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                TextView textView3 = (TextView) view3.findViewById(C5619R.C5622id.tvTitle);
                Intrinsics.checkNotNullExpressionValue(textView3, "itemView.tvTitle");
                textView3.setVisibility(0);
                View view4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                TextView textView4 = (TextView) view4.findViewById(C5619R.C5622id.tvTitle);
                Intrinsics.checkNotNullExpressionValue(textView4, "itemView.tvTitle");
                textView4.setText(notification.getTitle());
            }
            View view5 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view5, "itemView");
            TextView textView5 = (TextView) view5.findViewById(C5619R.C5622id.tvMessage);
            Intrinsics.checkNotNullExpressionValue(textView5, "itemView.tvMessage");
            textView5.setText(notification.getBody());
        }
    }
}
