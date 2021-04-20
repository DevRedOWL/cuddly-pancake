package p035ru.unicorn.ujin.view.fragments.profileselection.view.sections;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u00012\u00020\u0004:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0005J8\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0018\u00010\u0003R\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0014J\u0014\u0010\u0019\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\u0012\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/view/sections/AvailableAddressesSection;", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/MultiSection;", "Lru/unicorn/ujin/view/fragments/profileselection/data/BusinessBuildings;", "Lru/unicorn/ujin/view/fragments/profileselection/view/sections/AvailableAddressesSection$ViewHolder;", "Landroid/view/View$OnClickListener;", "()V", "bcTitle", "", "getBcTitle", "()Ljava/lang/String;", "setBcTitle", "(Ljava/lang/String;)V", "itemClick", "Lio/reactivex/subjects/PublishSubject;", "getItemClick", "()Lio/reactivex/subjects/PublishSubject;", "bindViewHolder", "", "vh", "data", "position", "", "payloads", "", "", "createViewHolder", "view", "Landroid/view/View;", "getLayoutId", "onClick", "v", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.sections.AvailableAddressesSection */
/* compiled from: AvailableAddressesSection.kt */
public final class AvailableAddressesSection extends MultiSection<BusinessBuildings, ViewHolder> implements View.OnClickListener {
    private String bcTitle = "";
    private final PublishSubject<BusinessBuildings> itemClick;

    public int getLayoutId() {
        return R.layout.item_choose_address;
    }

    public AvailableAddressesSection() {
        PublishSubject<BusinessBuildings> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "PublishSubject.create()");
        this.itemClick = create;
    }

    public final PublishSubject<BusinessBuildings> getItemClick() {
        return this.itemClick;
    }

    public final String getBcTitle() {
        return this.bcTitle;
    }

    public final void setBcTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bcTitle = str;
    }

    public void onClick(View view) {
        Object tag = view != null ? view.getTag() : null;
        if (tag != null) {
            this.itemClick.onNext(getData().get(getAdapterPositionForViewHolder((ViewHolder) tag)));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.fragments.profileselection.view.sections.AvailableAddressesSection.ViewHolder");
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return new ViewHolder(this, view, this);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, BusinessBuildings businessBuildings, int i, List<Object> list) {
        if (viewHolder != null) {
            viewHolder.bind(businessBuildings);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/view/sections/AvailableAddressesSection$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onClickListener", "Landroid/view/View$OnClickListener;", "(Lru/unicorn/ujin/view/fragments/profileselection/view/sections/AvailableAddressesSection;Landroid/view/View;Landroid/view/View$OnClickListener;)V", "bind", "", "data", "Lru/unicorn/ujin/view/fragments/profileselection/data/BusinessBuildings;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.sections.AvailableAddressesSection$ViewHolder */
    /* compiled from: AvailableAddressesSection.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ AvailableAddressesSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(AvailableAddressesSection availableAddressesSection, final View view, View.OnClickListener onClickListener) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
            this.this$0 = availableAddressesSection;
            view.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    CheckBox checkBox = (CheckBox) view.findViewById(C5619R.C5622id.f6508cb);
                    Intrinsics.checkNotNullExpressionValue(checkBox, "itemView.cb");
                    checkBox.setChecked(true);
                }
            });
            view.setTag(this);
            CheckBox checkBox = (CheckBox) view.findViewById(C5619R.C5622id.f6508cb);
            Intrinsics.checkNotNullExpressionValue(checkBox, "itemView.cb");
            checkBox.setTag(this);
            ((CheckBox) view.findViewById(C5619R.C5622id.f6508cb)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) {
                final /* synthetic */ ViewHolder this$0;

                {
                    this.this$0 = r1;
                }

                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.this$0.this$0.onClick(compoundButton);
                }
            });
        }

        public final void bind(BusinessBuildings businessBuildings) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.title);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.title");
            textView.setText(businessBuildings != null ? businessBuildings.getTitle() : null);
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(C5619R.C5622id.subtitle);
            Intrinsics.checkNotNullExpressionValue(textView2, "itemView.subtitle");
            textView2.setText(this.this$0.getBcTitle());
        }
    }
}
