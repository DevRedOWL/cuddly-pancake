package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress;
import p059rx.subjects.BehaviorSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J8\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0018\u00010\u0003R\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0014J\u0014\u0010\u0017\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0013H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001c"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/AddressSection;", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/MultiSection;", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/ProfileAdress;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/AddressSection$ViewHolder;", "isClickable", "", "(Z)V", "()Z", "onClick", "Lrx/subjects/BehaviorSubject;", "getOnClick", "()Lrx/subjects/BehaviorSubject;", "setOnClick", "(Lrx/subjects/BehaviorSubject;)V", "bindViewHolder", "", "vh", "data", "position", "", "payloads", "", "", "createViewHolder", "view", "Landroid/view/View;", "getLayoutId", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.AddressSection */
/* compiled from: AddressSection.kt */
public final class AddressSection extends MultiSection<ProfileAdress, ViewHolder> {
    private final boolean isClickable;
    private BehaviorSubject<ProfileAdress> onClick;

    public int getLayoutId() {
        return R.layout.item_street;
    }

    public AddressSection(boolean z) {
        this.isClickable = z;
        BehaviorSubject<ProfileAdress> create = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "BehaviorSubject.create()");
        this.onClick = create;
    }

    public final boolean isClickable() {
        return this.isClickable;
    }

    public final BehaviorSubject<ProfileAdress> getOnClick() {
        return this.onClick;
    }

    public final void setOnClick(BehaviorSubject<ProfileAdress> behaviorSubject) {
        Intrinsics.checkNotNullParameter(behaviorSubject, "<set-?>");
        this.onClick = behaviorSubject;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return new ViewHolder(this, view);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, ProfileAdress profileAdress, int i, List<Object> list) {
        if (viewHolder != null) {
            viewHolder.bind(i, profileAdress);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/AddressSection$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/AddressSection;Landroid/view/View;)V", "bind", "", "position", "", "data", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/ProfileAdress;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.AddressSection$ViewHolder */
    /* compiled from: AddressSection.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ AddressSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(AddressSection addressSection, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = addressSection;
            if (addressSection.isClickable()) {
                view.setOnClickListener(new View.OnClickListener(this) {
                    final /* synthetic */ ViewHolder this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onClick(View view) {
                        this.this$0.this$0.getOnClick().onNext(this.this$0.this$0.getData().get(this.this$0.getAdapterPosition()));
                    }
                });
            }
        }

        public final void bind(int i, ProfileAdress profileAdress) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.value);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.value");
            textView.setText(profileAdress != null ? profileAdress.getAddress() : null);
        }
    }
}
