package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.custom.osnova;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0003R\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0014J\u0014\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/alertpoints/custom/osnova/LoaderSection;", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SingleSection;", "Lru/unicorn/ujin/view/activity/navigation/ui/alertpoints/custom/osnova/LoaderSettings;", "Lru/unicorn/ujin/view/activity/navigation/ui/alertpoints/custom/osnova/LoaderSection$VH;", "()V", "bindViewHolder", "", "viewHolder", "data", "payloads", "", "", "createViewHolder", "view", "Landroid/view/View;", "getLayoutId", "", "VH", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.LoaderSection */
/* compiled from: LoaderSection.kt */
public final class LoaderSection extends SingleSection<LoaderSettings, C5802VH> {
    /* access modifiers changed from: protected */
    public void bindViewHolder(C5802VH vh, LoaderSettings loaderSettings, List<Object> list) {
        Intrinsics.checkNotNullParameter(vh, "viewHolder");
    }

    public int getLayoutId() {
        return R.layout.item_loader_section;
    }

    /* access modifiers changed from: protected */
    public C5802VH createViewHolder(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return new C5802VH(this, view);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/alertpoints/custom/osnova/LoaderSection$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/view/activity/navigation/ui/alertpoints/custom/osnova/LoaderSection;Landroid/view/View;)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.LoaderSection$VH */
    /* compiled from: LoaderSection.kt */
    public final class C5802VH extends RecyclerView.ViewHolder {
        final /* synthetic */ LoaderSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5802VH(LoaderSection loaderSection, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = loaderSection;
        }
    }
}
