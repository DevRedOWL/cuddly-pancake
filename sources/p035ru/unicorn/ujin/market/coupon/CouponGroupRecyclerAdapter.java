package p035ru.unicorn.ujin.market.coupon;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB1\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\b\u0010\u0015\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0016J\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\fH\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\fH\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, mo51343d2 = {"Lru/unicorn/ujin/market/coupon/CouponGroupRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/market/coupon/CouponGroupRecyclerAdapter$ViewHolder;", "groupList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "clickListener", "Lkotlin/Function1;", "", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V", "choosenIndex", "", "getChoosenIndex", "()I", "setChoosenIndex", "(I)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "getGroupList", "()Ljava/util/ArrayList;", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.coupon.CouponGroupRecyclerAdapter */
/* compiled from: CouponGroupRecyclerAdapter.kt */
public final class CouponGroupRecyclerAdapter extends RecyclerView.Adapter<ViewHolder> {
    private int choosenIndex;
    private final Function1<String, Unit> clickListener;
    private final ArrayList<String> groupList;

    public CouponGroupRecyclerAdapter(ArrayList<String> arrayList, Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(arrayList, "groupList");
        Intrinsics.checkNotNullParameter(function1, "clickListener");
        this.groupList = arrayList;
        this.clickListener = function1;
    }

    public final Function1<String, Unit> getClickListener() {
        return this.clickListener;
    }

    public final ArrayList<String> getGroupList() {
        return this.groupList;
    }

    public final int getChoosenIndex() {
        return this.choosenIndex;
    }

    public final void setChoosenIndex(int i) {
        this.choosenIndex = i;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i == 1 ? R.layout.item_coupon_group_choosen : R.layout.item_coupon_group, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…pon_group, parent, false)");
        return new ViewHolder(inflate);
    }

    public int getItemViewType(int i) {
        return i == this.choosenIndex ? 1 : 0;
    }

    public int getItemCount() {
        return this.groupList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        String str = this.groupList.get(i);
        Intrinsics.checkNotNullExpressionValue(str, "groupList[position]");
        viewHolder.bind(str);
        viewHolder.itemView.setOnClickListener(new CouponGroupRecyclerAdapter$onBindViewHolder$1(this, i));
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/market/coupon/CouponGroupRecyclerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "title", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.coupon.CouponGroupRecyclerAdapter$ViewHolder */
    /* compiled from: CouponGroupRecyclerAdapter.kt */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
        }

        public final void bind(String str) {
            Intrinsics.checkNotNullParameter(str, "title");
            View view = this.itemView;
            if (view != null) {
                ((TextView) view).setText(str);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }
}
