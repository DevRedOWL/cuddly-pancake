package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.MyPassIn;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.PassState;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.PassType;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u00012\u00020\u0004:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0005J8\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0018\u00010\u0003R\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0014J\u0014\u0010\u0013\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\u0012\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/corona/PassSection2;", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/MultiSection;", "Lru/unicorn/ujin/data/MyPassIn;", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/PassSection2$ViewHolder;", "Landroid/view/View$OnClickListener;", "()V", "itemClick", "Lio/reactivex/subjects/PublishSubject;", "getItemClick", "()Lio/reactivex/subjects/PublishSubject;", "bindViewHolder", "", "vh", "data", "position", "", "payloads", "", "", "createViewHolder", "view", "Landroid/view/View;", "getLayoutId", "onClick", "v", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.PassSection2 */
/* compiled from: PassSection2.kt */
public final class PassSection2 extends MultiSection<MyPassIn, ViewHolder> implements View.OnClickListener {
    private final PublishSubject<MyPassIn> itemClick;

    public int getLayoutId() {
        return R.layout.item_pass_list;
    }

    public PassSection2() {
        PublishSubject<MyPassIn> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "PublishSubject.create()");
        this.itemClick = create;
    }

    public final PublishSubject<MyPassIn> getItemClick() {
        return this.itemClick;
    }

    public void onClick(View view) {
        Object tag = view != null ? view.getTag() : null;
        if (tag != null) {
            this.itemClick.onNext(getData(getAdapterPositionForViewHolder((ViewHolder) tag)));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.activity.navigation.ui.corona.PassSection2.ViewHolder");
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return new ViewHolder(this, view, this);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, MyPassIn myPassIn, int i, List<Object> list) {
        if (viewHolder != null) {
            viewHolder.bind(myPassIn, i);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/corona/PassSection2$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onClickListener", "Landroid/view/View$OnClickListener;", "(Lru/unicorn/ujin/view/activity/navigation/ui/corona/PassSection2;Landroid/view/View;Landroid/view/View$OnClickListener;)V", "bind", "", "data", "Lru/unicorn/ujin/data/MyPassIn;", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.PassSection2$ViewHolder */
    /* compiled from: PassSection2.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ PassSection2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(PassSection2 passSection2, View view, View.OnClickListener onClickListener) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
            this.this$0 = passSection2;
            view.setOnClickListener(onClickListener);
            view.setTag(this);
        }

        public final void bind(MyPassIn myPassIn, int i) {
            String str;
            PassState state;
            String slug;
            PassType type;
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
            View findViewById = this.itemView.findViewById(R.id.title);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById<TextView>(R.id.title)");
            TextView textView = (TextView) findViewById;
            Object[] objArr = new Object[1];
            Boolean bool = null;
            objArr[0] = myPassIn != null ? myPassIn.getPassNumber() : null;
            textView.setText(context.getString(R.string.label_pass_number, objArr));
            View findViewById2 = this.itemView.findViewById(R.id.subtitle);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById<TextView>(R.id.subtitle)");
            ((TextView) findViewById2).setText((myPassIn == null || (type = myPassIn.getType()) == null) ? null : type.getTitle());
            if (!(myPassIn == null || (state = myPassIn.getState()) == null || (slug = state.getSlug()) == null)) {
                bool = Boolean.valueOf(slug.equals("revoked"));
            }
            Intrinsics.checkNotNull(bool);
            if (!bool.booleanValue()) {
                str = context.getString(R.string.label_pass_active_to, new Object[]{myPassIn.getActiveTo()});
                Intrinsics.checkNotNullExpressionValue(str, "context.getString(R.stri…active_to, data.activeTo)");
            } else {
                str = myPassIn.getState().getTitle();
            }
            View findViewById3 = this.itemView.findViewById(R.id.status);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById<TextView>(R.id.status)");
            ((TextView) findViewById3).setText(str);
        }
    }
}
