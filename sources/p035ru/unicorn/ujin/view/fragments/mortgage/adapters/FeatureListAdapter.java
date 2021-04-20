package p035ru.unicorn.ujin.view.fragments.mortgage.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.Feature;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\t2\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J\u0016\u0010\u001a\u001a\u00020\t2\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0006¨\u0006\u001d"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/mortgage/adapters/FeatureListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/fragments/mortgage/adapters/FeatureListAdapter$ViewHolder;", "data", "", "Lru/unicorn/ujin/data/realm/Feature;", "(Ljava/util/List;)V", "clickListener", "Lkotlin/Function0;", "", "getClickListener", "()Lkotlin/jvm/functions/Function0;", "setClickListener", "(Lkotlin/jvm/functions/Function0;)V", "getData", "()Ljava/util/List;", "setData", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "items", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.mortgage.adapters.FeatureListAdapter */
/* compiled from: FeatureListAdapter.kt */
public final class FeatureListAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Function0<Unit> clickListener = FeatureListAdapter$clickListener$1.INSTANCE;
    private List<? extends Feature> data;

    public FeatureListAdapter(List<? extends Feature> list) {
        Intrinsics.checkNotNullParameter(list, "data");
        this.data = list;
    }

    public final List<Feature> getData() {
        return this.data;
    }

    public final void setData(List<? extends Feature> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final Function0<Unit> getClickListener() {
        return this.clickListener;
    }

    public final void setClickListener(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.clickListener = function0;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_mortgage_feature, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…e_feature, parent, false)");
        return new ViewHolder(this, inflate);
    }

    public int getItemCount() {
        return this.data.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.bind((Feature) this.data.get(i));
    }

    public final void setItems(List<? extends Feature> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.data = list;
        notifyDataSetChanged();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/mortgage/adapters/FeatureListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/view/fragments/mortgage/adapters/FeatureListAdapter;Landroid/view/View;)V", "bind", "", "feature", "Lru/unicorn/ujin/data/realm/Feature;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.mortgage.adapters.FeatureListAdapter$ViewHolder */
    /* compiled from: FeatureListAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ FeatureListAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(FeatureListAdapter featureListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = featureListAdapter;
        }

        public final void bind(Feature feature) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvTitle");
            String str = null;
            textView.setText(feature != null ? feature.getTitle() : null);
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(C5619R.C5622id.tvValue);
            Intrinsics.checkNotNullExpressionValue(textView2, "itemView.tvValue");
            if (feature != null) {
                str = feature.getValue();
            }
            textView2.setText(str);
            this.itemView.setOnClickListener(new FeatureListAdapter$ViewHolder$bind$1(this));
        }
    }
}
