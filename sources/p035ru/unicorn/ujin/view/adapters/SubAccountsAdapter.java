package p035ru.unicorn.ujin.view.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.api.response.SubAccount;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\t2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\bH\u0002R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/view/adapters/SubAccountsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/adapters/SubAccountsAdapter$ViewHolder;", "subAccountList", "", "Lru/unicorn/ujin/data/api/response/SubAccount;", "deleteListener", "Lkotlin/Function1;", "", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getDeleteListener", "()Lkotlin/jvm/functions/Function1;", "getSubAccountList", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "requestDelete", "phone", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.adapters.SubAccountsAdapter */
/* compiled from: SubAccountsAdapter.kt */
public final class SubAccountsAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final Function1<String, Unit> deleteListener;
    private final List<SubAccount> subAccountList;

    public final List<SubAccount> getSubAccountList() {
        return this.subAccountList;
    }

    public final Function1<String, Unit> getDeleteListener() {
        return this.deleteListener;
    }

    public SubAccountsAdapter(List<? extends SubAccount> list, Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "subAccountList");
        Intrinsics.checkNotNullParameter(function1, "deleteListener");
        this.subAccountList = list;
        this.deleteListener = function1;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_sub_accounts, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…          false\n        )");
        return new ViewHolder(this, inflate);
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.bind(this.subAccountList.get(i));
    }

    public int getItemCount() {
        return this.subAccountList.size();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/adapters/SubAccountsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/view/adapters/SubAccountsAdapter;Landroid/view/View;)V", "bind", "", "subAccount", "Lru/unicorn/ujin/data/api/response/SubAccount;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.adapters.SubAccountsAdapter$ViewHolder */
    /* compiled from: SubAccountsAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ SubAccountsAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(SubAccountsAdapter subAccountsAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = subAccountsAdapter;
        }

        public final void bind(SubAccount subAccount) {
            CharSequence charSequence;
            Intrinsics.checkNotNullParameter(subAccount, "subAccount");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.textName);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.textName");
            textView.setText(subAccount.getName());
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(C5619R.C5622id.textPhone);
            Intrinsics.checkNotNullExpressionValue(textView2, "itemView.textPhone");
            textView2.setText(subAccount.getPhone());
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            TextView textView3 = (TextView) view3.findViewById(C5619R.C5622id.textRules);
            Intrinsics.checkNotNullExpressionValue(textView3, "itemView.textRules");
            if (subAccount.getRules() == 1) {
                View view4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                charSequence = view4.getContext().getString(R.string.fullAccess);
            } else {
                View view5 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                charSequence = view5.getContext().getString(R.string.readAccess);
            }
            textView3.setText(charSequence);
            View view6 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view6, "itemView");
            ((AppCompatImageView) view6.findViewById(C5619R.C5622id.imageDelete)).setOnClickListener(new SubAccountsAdapter$ViewHolder$bind$1(this, subAccount));
        }
    }

    /* access modifiers changed from: private */
    public final void requestDelete(String str) {
        this.deleteListener.invoke(str);
    }
}
