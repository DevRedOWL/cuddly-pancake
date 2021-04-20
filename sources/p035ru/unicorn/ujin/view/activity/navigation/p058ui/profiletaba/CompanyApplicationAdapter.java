package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.company.CompanyApplication;
import p035ru.unicorn.ujin.data.realm.company.EnterpriseApplication;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002*+B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u001fH\u0016J\u001c\u0010!\u001a\u00020\u00122\n\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001c\u0010#\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001fH\u0016J\u000e\u0010'\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001fJ\u0014\u0010(\u001a\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR0\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006,"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/profiletaba/CompanyApplicationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/activity/navigation/ui/profiletaba/CompanyApplicationAdapter$ViewHolder;", "data", "", "Lru/unicorn/ujin/data/realm/company/CompanyApplication;", "onItemClickedListener", "Lru/unicorn/ujin/view/activity/navigation/ui/profiletaba/CompanyApplicationAdapter$OnItemClickedListener;", "(Ljava/util/List;Lru/unicorn/ujin/view/activity/navigation/ui/profiletaba/CompanyApplicationAdapter$OnItemClickedListener;)V", "context", "Landroid/content/Context;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "onItemClick", "Lkotlin/Function2;", "", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function2;", "setOnItemClick", "(Lkotlin/jvm/functions/Function2;)V", "getOnItemClickedListener$app_kortrosRelease", "()Lru/unicorn/ujin/view/activity/navigation/ui/profiletaba/CompanyApplicationAdapter$OnItemClickedListener;", "setOnItemClickedListener$app_kortrosRelease", "(Lru/unicorn/ujin/view/activity/navigation/ui/profiletaba/CompanyApplicationAdapter$OnItemClickedListener;)V", "addItem", "item", "getItem", "position", "", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItem", "setItems", "items", "OnItemClickedListener", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.CompanyApplicationAdapter */
/* compiled from: CompanyApplicationAdapter.kt */
public final class CompanyApplicationAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private List<CompanyApplication> data;
    private Function2<? super String, ? super String, Unit> onItemClick = CompanyApplicationAdapter$onItemClick$1.INSTANCE;
    private OnItemClickedListener onItemClickedListener;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/profiletaba/CompanyApplicationAdapter$OnItemClickedListener;", "", "onApprovedClicked", "", "position", "", "onCanceledClicked", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.CompanyApplicationAdapter$OnItemClickedListener */
    /* compiled from: CompanyApplicationAdapter.kt */
    public interface OnItemClickedListener {
        void onApprovedClicked(int i);

        void onCanceledClicked(int i);
    }

    public final List<CompanyApplication> getData() {
        return this.data;
    }

    public final void setData(List<CompanyApplication> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public CompanyApplicationAdapter(List<CompanyApplication> list, OnItemClickedListener onItemClickedListener2) {
        Intrinsics.checkNotNullParameter(list, "data");
        Intrinsics.checkNotNullParameter(onItemClickedListener2, "onItemClickedListener");
        this.data = list;
        this.onItemClickedListener = onItemClickedListener2;
    }

    public final OnItemClickedListener getOnItemClickedListener$app_kortrosRelease() {
        return this.onItemClickedListener;
    }

    public final void setOnItemClickedListener$app_kortrosRelease(OnItemClickedListener onItemClickedListener2) {
        Intrinsics.checkNotNullParameter(onItemClickedListener2, "<set-?>");
        this.onItemClickedListener = onItemClickedListener2;
    }

    public final Function2<String, String, Unit> getOnItemClick() {
        return this.onItemClick;
    }

    public final void setOnItemClick(Function2<? super String, ? super String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.onItemClick = function2;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
        this.context = context2;
        Context context3 = this.context;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        View inflate = LayoutInflater.from(context3).inflate(R.layout.item_connect_company_status, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(cont…ny_status, parent, false)");
        return new ViewHolder(this, inflate);
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.bind(i);
    }

    public int getItemCount() {
        return this.data.size();
    }

    public final void setItems(List<CompanyApplication> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.data = list;
        notifyDataSetChanged();
    }

    public final void addItem(CompanyApplication companyApplication) {
        Intrinsics.checkNotNullParameter(companyApplication, "item");
        this.data.add(companyApplication);
        notifyItemInserted(getItemCount() - 1);
    }

    public final void removeItem(int i) {
        this.data.remove(i);
        notifyItemRemoved(i);
        notifyItemRangeChanged(i, this.data.size());
    }

    public final CompanyApplication getItem(int i) {
        return this.data.get(i);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/profiletaba/CompanyApplicationAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/view/activity/navigation/ui/profiletaba/CompanyApplicationAdapter;Landroid/view/View;)V", "bind", "", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.CompanyApplicationAdapter$ViewHolder */
    /* compiled from: CompanyApplicationAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ CompanyApplicationAdapter this$0;

        @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
        /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.CompanyApplicationAdapter$ViewHolder$WhenMappings */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[CompanyApplicationStatusType.values().length];

            static {
                $EnumSwitchMapping$0[CompanyApplicationStatusType.APPROVED.ordinal()] = 1;
                $EnumSwitchMapping$0[CompanyApplicationStatusType.CANCELED.ordinal()] = 2;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(CompanyApplicationAdapter companyApplicationAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = companyApplicationAdapter;
        }

        public final void bind(int i) {
            String title;
            CompanyApplication companyApplication = this.this$0.getData().get(i);
            EnterpriseApplication enterprise = companyApplication.getEnterprise();
            if (!(enterprise == null || (title = enterprise.getTitle()) == null)) {
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvCompanyTitle);
                Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvCompanyTitle");
                View view2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                textView.setText(view2.getResources().getString(R.string.application_status_title, new Object[]{title}));
            }
            CompanyApplicationStatusType byNumber = CompanyApplicationStatusType.Companion.getByNumber(companyApplication.getStatus());
            if (byNumber != null) {
                View view3 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                View view4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                ImageView imageView = (ImageView) view4.findViewById(C5619R.C5622id.ivStatus);
                Intrinsics.checkNotNullExpressionValue(imageView, "itemView.ivStatus");
                ((ImageView) view3.findViewById(C5619R.C5622id.ivStatus)).setColorFilter(ContextCompat.getColor(imageView.getContext(), byNumber.getColor()));
                View view5 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                View view6 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view6, "itemView");
                TextView textView2 = (TextView) view6.findViewById(C5619R.C5622id.tvStatus);
                Intrinsics.checkNotNullExpressionValue(textView2, "itemView.tvStatus");
                ((TextView) view5.findViewById(C5619R.C5622id.tvStatus)).setTextColor(ContextCompat.getColor(textView2.getContext(), byNumber.getColor()));
                View view7 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view7, "itemView");
                TextView textView3 = (TextView) view7.findViewById(C5619R.C5622id.tvStatus);
                View view8 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view8, "itemView");
                TextView textView4 = (TextView) view8.findViewById(C5619R.C5622id.tvStatus);
                Intrinsics.checkNotNullExpressionValue(textView4, "itemView.tvStatus");
                textView3.setTextColor(ContextCompat.getColor(textView4.getContext(), byNumber.getColor()));
                View view9 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view9, "itemView");
                textView3.setText(view9.getResources().getString(byNumber.getTitle()));
            }
            if (byNumber != null) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[byNumber.ordinal()];
                if (i2 == 1) {
                    this.itemView.setOnClickListener(new CompanyApplicationAdapter$ViewHolder$bind$3(this, i));
                } else if (i2 == 2) {
                    this.itemView.setOnClickListener(new CompanyApplicationAdapter$ViewHolder$bind$4(this, i));
                }
            }
            if (i == this.this$0.getData().size() - 1) {
                View view10 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view10, "itemView");
                View findViewById = view10.findViewById(C5619R.C5622id.divider);
                Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.divider");
                findViewById.setVisibility(8);
                return;
            }
            View view11 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view11, "itemView");
            View findViewById2 = view11.findViewById(C5619R.C5622id.divider);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.divider");
            findViewById2.setVisibility(0);
        }
    }
}
