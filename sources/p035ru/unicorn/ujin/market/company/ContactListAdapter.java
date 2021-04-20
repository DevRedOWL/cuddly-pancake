package p035ru.unicorn.ujin.market.company;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.data.realm.marketplace.CompanyContact;
import p035ru.unicorn.ujin.market.enums.CompanyContactType;
import p035ru.unicorn.ujin.util.AnimationUtils;
import p035ru.unicorn.ujin.util.TextUtils;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002!\"B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\u00142\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016J\u0014\u0010\u001f\u001a\u00020\u00142\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006#"}, mo51343d2 = {"Lru/unicorn/ujin/market/company/ContactListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/market/company/ContactListAdapter$ViewHolder;", "data", "", "Lru/unicorn/ujin/data/realm/marketplace/CompanyContact;", "onContactClickedListener", "Lru/unicorn/ujin/market/company/ContactListAdapter$OnContactClickedListener;", "(Ljava/util/List;Lru/unicorn/ujin/market/company/ContactListAdapter$OnContactClickedListener;)V", "context", "Landroid/content/Context;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getOnContactClickedListener$app_kortrosRelease", "()Lru/unicorn/ujin/market/company/ContactListAdapter$OnContactClickedListener;", "setOnContactClickedListener$app_kortrosRelease", "(Lru/unicorn/ujin/market/company/ContactListAdapter$OnContactClickedListener;)V", "addItem", "", "item", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "items", "OnContactClickedListener", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.company.ContactListAdapter */
/* compiled from: ContactListAdapter.kt */
public final class ContactListAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private List<CompanyContact> data;
    private OnContactClickedListener onContactClickedListener;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/market/company/ContactListAdapter$OnContactClickedListener;", "", "onEmailClicked", "", "value", "", "onPhoneClicked", "onWebSiteClicked", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.company.ContactListAdapter$OnContactClickedListener */
    /* compiled from: ContactListAdapter.kt */
    public interface OnContactClickedListener {
        void onEmailClicked(String str);

        void onPhoneClicked(String str);

        void onWebSiteClicked(String str);
    }

    public final List<CompanyContact> getData() {
        return this.data;
    }

    public final void setData(List<CompanyContact> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public ContactListAdapter(List<CompanyContact> list, OnContactClickedListener onContactClickedListener2) {
        Intrinsics.checkNotNullParameter(list, "data");
        Intrinsics.checkNotNullParameter(onContactClickedListener2, "onContactClickedListener");
        this.data = list;
        this.onContactClickedListener = onContactClickedListener2;
    }

    public final OnContactClickedListener getOnContactClickedListener$app_kortrosRelease() {
        return this.onContactClickedListener;
    }

    public final void setOnContactClickedListener$app_kortrosRelease(OnContactClickedListener onContactClickedListener2) {
        Intrinsics.checkNotNullParameter(onContactClickedListener2, "<set-?>");
        this.onContactClickedListener = onContactClickedListener2;
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
        View inflate = LayoutInflater.from(context3).inflate(R.layout.item_company_contact, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(cont…y_contact, parent, false)");
        return new ViewHolder(this, inflate);
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.bind(i);
    }

    public int getItemCount() {
        return this.data.size();
    }

    public final void setItems(List<CompanyContact> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.data = list;
        notifyDataSetChanged();
    }

    public final void addItem(CompanyContact companyContact) {
        Intrinsics.checkNotNullParameter(companyContact, "item");
        this.data.add(companyContact);
        notifyItemInserted(getItemCount() - 1);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J\b\u0010\u0012\u001a\u00020\rH\u0002R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo51343d2 = {"Lru/unicorn/ujin/market/company/ContactListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/market/company/ContactListAdapter;Landroid/view/View;)V", "ivArrowExpand", "Landroidx/appcompat/widget/AppCompatImageView;", "kotlin.jvm.PlatformType", "modeExpanded", "", "tvDetails", "Landroid/widget/TextView;", "bind", "", "position", "", "collapse", "expand", "handleExpandCollapse", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.company.ContactListAdapter$ViewHolder */
    /* compiled from: ContactListAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private AppCompatImageView ivArrowExpand;
        private boolean modeExpanded;
        final /* synthetic */ ContactListAdapter this$0;
        private TextView tvDetails;

        @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
        /* renamed from: ru.unicorn.ujin.market.company.ContactListAdapter$ViewHolder$WhenMappings */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[CompanyContactType.values().length];

            static {
                $EnumSwitchMapping$0[CompanyContactType.PHONE.ordinal()] = 1;
                $EnumSwitchMapping$0[CompanyContactType.EMAIL.ordinal()] = 2;
                $EnumSwitchMapping$0[CompanyContactType.WEBSITE.ordinal()] = 3;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(ContactListAdapter contactListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = contactListAdapter;
            this.ivArrowExpand = (AppCompatImageView) view.findViewById(C5619R.C5622id.ivArrowExpand);
            this.tvDetails = (TextView) view.findViewById(C5619R.C5622id.tvDetails);
        }

        public final void bind(int i) {
            String value;
            CompanyContact companyContact = this.this$0.getData().get(i);
            if (i == 0) {
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                View findViewById = view.findViewById(C5619R.C5622id.divider1);
                Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.divider1");
                findViewById.setVisibility(0);
            } else {
                View view2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                View findViewById2 = view2.findViewById(C5619R.C5622id.divider1);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.divider1");
                findViewById2.setVisibility(8);
            }
            String type = companyContact.getType();
            boolean z = true;
            if (!(type == null || (value = companyContact.getValue()) == null)) {
                View view3 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                View view4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                ((ImageView) view3.findViewById(C5619R.C5622id.ivContactIcon)).setImageDrawable(view4.getResources().getDrawable(CompanyContactType.Companion.getIcon(type)));
                View view5 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                View view6 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view6, "itemView");
                ((ImageView) view5.findViewById(C5619R.C5622id.ivContactIcon)).setColorFilter(view6.getResources().getColor(R.color.controlTextColor), PorterDuff.Mode.SRC_IN);
                View view7 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view7, "itemView");
                TextView textView = (TextView) view7.findViewById(C5619R.C5622id.tvValue);
                if (textView != null) {
                    int i2 = WhenMappings.$EnumSwitchMapping$0[CompanyContactType.Companion.getType(type).ordinal()];
                    if (i2 == 1) {
                        textView.setText(TextUtils.formatPhoneNumber(value));
                        textView.setTextColor(ContextCompat.getColorStateList(textView.getContext(), R.color.controlTextColor));
                        textView.setOnClickListener(new ContactListAdapter$ViewHolder$bind$$inlined$let$lambda$1(value, type, this, companyContact));
                    } else if (i2 == 2) {
                        textView.setText(value);
                        textView.setTextColor(ContextCompat.getColorStateList(textView.getContext(), R.color.controlTextColor));
                        textView.setOnClickListener(new ContactListAdapter$ViewHolder$bind$$inlined$let$lambda$2(value, type, this, companyContact));
                    } else if (i2 != 3) {
                        textView.setText(value);
                    } else {
                        textView.setText(value);
                        textView.setTextColor(ContextCompat.getColorStateList(textView.getContext(), R.color.controlTextColor));
                        textView.setOnClickListener(new ContactListAdapter$ViewHolder$bind$$inlined$let$lambda$3(value, type, this, companyContact));
                    }
                }
            }
            View view8 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view8, "itemView");
            TextView textView2 = (TextView) view8.findViewById(C5619R.C5622id.tvDetails);
            Intrinsics.checkNotNullExpressionValue(textView2, "itemView.tvDetails");
            textView2.setVisibility(8);
            CharSequence details = companyContact.getDetails();
            if (details != null && !StringsKt.isBlank(details)) {
                z = false;
            }
            if (z) {
                View view9 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view9, "itemView");
                AppCompatImageView appCompatImageView = (AppCompatImageView) view9.findViewById(C5619R.C5622id.ivArrowExpand);
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "itemView.ivArrowExpand");
                appCompatImageView.setVisibility(4);
                return;
            }
            View view10 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view10, "itemView");
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view10.findViewById(C5619R.C5622id.ivArrowExpand);
            appCompatImageView2.setVisibility(0);
            appCompatImageView2.setOnClickListener(new ContactListAdapter$ViewHolder$bind$$inlined$apply$lambda$1(this));
            View view11 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view11, "itemView");
            TextView textView3 = (TextView) view11.findViewById(C5619R.C5622id.tvDetails);
            textView3.setText(companyContact.getDetails());
            textView3.setOnClickListener(new ContactListAdapter$ViewHolder$bind$$inlined$apply$lambda$2(this, companyContact));
        }

        /* access modifiers changed from: private */
        public final void handleExpandCollapse() {
            if (this.modeExpanded) {
                collapse();
            } else {
                expand();
            }
            this.modeExpanded = !this.modeExpanded;
        }

        private final void collapse() {
            AnimationUtils animationUtils = AnimationUtils.INSTANCE;
            TextView textView = this.tvDetails;
            Intrinsics.checkNotNullExpressionValue(textView, "tvDetails");
            animationUtils.animateViewGone(textView);
            AnimationUtils animationUtils2 = AnimationUtils.INSTANCE;
            AppCompatImageView appCompatImageView = this.ivArrowExpand;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "ivArrowExpand");
            animationUtils2.rotateView(180.0f, 0.0f, appCompatImageView);
        }

        private final void expand() {
            AnimationUtils animationUtils = AnimationUtils.INSTANCE;
            TextView textView = this.tvDetails;
            Intrinsics.checkNotNullExpressionValue(textView, "tvDetails");
            animationUtils.animateViewVisible(textView);
            AnimationUtils animationUtils2 = AnimationUtils.INSTANCE;
            AppCompatImageView appCompatImageView = this.ivArrowExpand;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "ivArrowExpand");
            animationUtils2.rotateView(0.0f, 180.0f, appCompatImageView);
        }
    }
}
