package p035ru.unicorn.ujin.view.fragments.profile.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001e\u001fB\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u001c\u0010\u0016\u001a\u00020\u00102\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014H\u0016J\u0016\u0010\u001c\u001a\u00020\u00102\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/adapters/MyRentObjectListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/fragments/profile/adapters/MyRentObjectListAdapter$ViewHolder;", "data", "", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentInfo;", "onObjectSelectedListener", "Lru/unicorn/ujin/view/fragments/profile/adapters/MyRentObjectListAdapter$OnObjectSelectedListener;", "(Ljava/util/List;Lru/unicorn/ujin/view/fragments/profile/adapters/MyRentObjectListAdapter$OnObjectSelectedListener;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getOnObjectSelectedListener$app_kortrosRelease", "()Lru/unicorn/ujin/view/fragments/profile/adapters/MyRentObjectListAdapter$OnObjectSelectedListener;", "addItem", "", "item", "getItem", "position", "", "getItemCount", "onBindViewHolder", "viewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "i", "setItems", "items", "OnObjectSelectedListener", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.adapters.MyRentObjectListAdapter */
/* compiled from: MyRentObjectListAdapter.kt */
public final class MyRentObjectListAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<RentInfo> data;
    private final OnObjectSelectedListener onObjectSelectedListener;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/adapters/MyRentObjectListAdapter$OnObjectSelectedListener;", "", "onObjectSelected", "", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profile.adapters.MyRentObjectListAdapter$OnObjectSelectedListener */
    /* compiled from: MyRentObjectListAdapter.kt */
    public interface OnObjectSelectedListener {
        void onObjectSelected(int i);
    }

    public final List<RentInfo> getData() {
        return this.data;
    }

    public final void setData(List<RentInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public MyRentObjectListAdapter(List<RentInfo> list, OnObjectSelectedListener onObjectSelectedListener2) {
        Intrinsics.checkNotNullParameter(list, "data");
        Intrinsics.checkNotNullParameter(onObjectSelectedListener2, "onObjectSelectedListener");
        this.data = list;
        this.onObjectSelectedListener = onObjectSelectedListener2;
    }

    public final OnObjectSelectedListener getOnObjectSelectedListener$app_kortrosRelease() {
        return this.onObjectSelectedListener;
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        viewHolder.bind(i);
    }

    public int getItemCount() {
        return this.data.size();
    }

    public final RentInfo getItem(int i) {
        return this.data.get(i);
    }

    public final void setItems(List<RentInfo> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.data = list;
        notifyDataSetChanged();
    }

    public final void addItem(RentInfo rentInfo) {
        this.data.add(rentInfo);
        notifyItemInserted(getItemCount() - 1);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_my_rent_object, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…nt_object, parent, false)");
        return new ViewHolder(this, inflate);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/adapters/MyRentObjectListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/view/fragments/profile/adapters/MyRentObjectListAdapter;Landroid/view/View;)V", "bind", "", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profile.adapters.MyRentObjectListAdapter$ViewHolder */
    /* compiled from: MyRentObjectListAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ MyRentObjectListAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(MyRentObjectListAdapter myRentObjectListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = myRentObjectListAdapter;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
            r3 = r0.getPropRenta();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void bind(int r14) {
            /*
                r13 = this;
                ru.unicorn.ujin.view.fragments.profile.adapters.MyRentObjectListAdapter r0 = r13.this$0
                java.util.List r0 = r0.getData()
                java.lang.Object r0 = r0.get(r14)
                ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo r0 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo) r0
                android.view.View r1 = r13.itemView
                java.lang.String r2 = "itemView"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                int r3 = p035ru.unicorn.C5619R.C5622id.tvTitle
                android.view.View r1 = r1.findViewById(r3)
                android.widget.TextView r1 = (android.widget.TextView) r1
                java.lang.String r3 = "itemView.tvTitle"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
                if (r0 == 0) goto L_0x002f
                ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta r3 = r0.getPropRenta()
                if (r3 == 0) goto L_0x002f
                java.lang.String r3 = r3.getTitle()
                if (r3 == 0) goto L_0x002f
                goto L_0x0031
            L_0x002f:
                java.lang.String r3 = ""
            L_0x0031:
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r1.setText(r3)
                r1 = 0
                if (r0 == 0) goto L_0x0044
                ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta r3 = r0.getPropRenta()
                if (r3 == 0) goto L_0x0044
                java.lang.String r3 = r3.getRentCost()
                goto L_0x0045
            L_0x0044:
                r3 = r1
            L_0x0045:
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L_0x0054
                boolean r3 = kotlin.text.StringsKt.isBlank(r3)
                if (r3 == 0) goto L_0x0052
                goto L_0x0054
            L_0x0052:
                r3 = 0
                goto L_0x0055
            L_0x0054:
                r3 = 1
            L_0x0055:
                r6 = 8
                if (r3 == 0) goto L_0x006f
                android.view.View r3 = r13.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
                int r7 = p035ru.unicorn.C5619R.C5622id.tvPrice
                android.view.View r3 = r3.findViewById(r7)
                android.widget.TextView r3 = (android.widget.TextView) r3
                java.lang.String r7 = "itemView.tvPrice"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
                r3.setVisibility(r6)
                goto L_0x00b4
            L_0x006f:
                android.view.View r3 = r13.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
                int r7 = p035ru.unicorn.C5619R.C5622id.tvPrice
                android.view.View r3 = r3.findViewById(r7)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r3.setVisibility(r5)
                android.content.res.Resources r7 = r3.getResources()
                r8 = 2131887987(0x7f120773, float:1.9410597E38)
                java.lang.Object[] r9 = new java.lang.Object[r4]
                java.math.BigDecimal r10 = new java.math.BigDecimal
                if (r0 == 0) goto L_0x0097
                ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta r11 = r0.getPropRenta()
                if (r11 == 0) goto L_0x0097
                java.lang.String r11 = r11.getRentCost()
                goto L_0x0098
            L_0x0097:
                r11 = r1
            L_0x0098:
                r10.<init>(r11)
                r11 = 2
                r12 = 4
                java.math.BigDecimal r10 = r10.setScale(r11, r12)
                android.content.Context r11 = r3.getContext()
                android.text.SpannableString r10 = p035ru.unicorn.ujin.util.TextUtils.formatAmount((java.math.BigDecimal) r10, (android.content.Context) r11)
                r9[r5] = r10
                java.lang.String r7 = r7.getString(r8, r9)
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                r3.setText(r7)
            L_0x00b4:
                if (r0 == 0) goto L_0x00c6
                ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta r3 = r0.getPropRenta()
                if (r3 == 0) goto L_0x00c6
                ru.unicorn.ujin.view.activity.navigation.ui.myrenta.AttrRenta r3 = r3.getAttributes()
                if (r3 == 0) goto L_0x00c6
                java.lang.String r1 = r3.getFloor()
            L_0x00c6:
                if (r1 != 0) goto L_0x00de
                android.view.View r0 = r13.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
                int r1 = p035ru.unicorn.C5619R.C5622id.tvFloor
                android.view.View r0 = r0.findViewById(r1)
                android.widget.TextView r0 = (android.widget.TextView) r0
                java.lang.String r1 = "itemView.tvFloor"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                r0.setVisibility(r6)
                goto L_0x0118
            L_0x00de:
                android.view.View r1 = r13.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                int r2 = p035ru.unicorn.C5619R.C5622id.tvFloor
                android.view.View r1 = r1.findViewById(r2)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r1.setVisibility(r5)
                android.content.res.Resources r2 = r1.getResources()
                r3 = 2131887480(0x7f120578, float:1.9409568E38)
                java.lang.Object[] r4 = new java.lang.Object[r4]
                ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta r0 = r0.getPropRenta()
                java.lang.String r6 = "rentObject.propRenta"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
                ru.unicorn.ujin.view.activity.navigation.ui.myrenta.AttrRenta r0 = r0.getAttributes()
                java.lang.String r6 = "rentObject.propRenta.attributes"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
                java.lang.String r0 = r0.getFloor()
                r4[r5] = r0
                java.lang.String r0 = r2.getString(r3, r4)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r1.setText(r0)
            L_0x0118:
                ru.unicorn.ujin.view.fragments.profile.adapters.MyRentObjectListAdapter$ViewHolder$bind$clickListener$1 r0 = new ru.unicorn.ujin.view.fragments.profile.adapters.MyRentObjectListAdapter$ViewHolder$bind$clickListener$1
                r0.<init>(r13, r14)
                android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
                android.view.View r14 = r13.itemView
                r14.setOnClickListener(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.profile.adapters.MyRentObjectListAdapter.ViewHolder.bind(int):void");
        }
    }
}
