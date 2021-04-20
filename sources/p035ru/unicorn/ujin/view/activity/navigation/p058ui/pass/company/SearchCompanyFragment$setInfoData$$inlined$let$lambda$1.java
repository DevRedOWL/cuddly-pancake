package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo51343d2 = {"<anonymous>", "", "run", "ru/unicorn/ujin/view/activity/navigation/ui/pass/company/SearchCompanyFragment$setInfoData$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.SearchCompanyFragment$setInfoData$$inlined$let$lambda$1 */
/* compiled from: SearchCompanyFragment.kt */
final class SearchCompanyFragment$setInfoData$$inlined$let$lambda$1 implements Runnable {
    final /* synthetic */ boolean $isEmpty$inlined;
    final /* synthetic */ SearchCompanyFragment this$0;

    SearchCompanyFragment$setInfoData$$inlined$let$lambda$1(SearchCompanyFragment searchCompanyFragment, boolean z) {
        this.this$0 = searchCompanyFragment;
        this.$isEmpty$inlined = z;
    }

    public final void run() {
        TextView textView = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.info);
        Intrinsics.checkNotNullExpressionValue(textView, "info");
        textView.setVisibility(0);
        if (this.$isEmpty$inlined) {
            TextView textView2 = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.info);
            Intrinsics.checkNotNullExpressionValue(textView2, "info");
            textView2.setText(this.this$0.getString(R.string.label_no_result));
            return;
        }
        TextView textView3 = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.info);
        Intrinsics.checkNotNullExpressionValue(textView3, "info");
        textView3.setText(this.this$0.getString(R.string.label_find_company_info));
    }
}
