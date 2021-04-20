package p035ru.unicorn.ujin.market.loan;

import android.app.AlertDialog;
import android.widget.ProgressBar;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.market.loan.DynamicLoanFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.loan.DynamicLoanFragment$handleApiCallV1$1 */
/* compiled from: DynamicLoanFragment.kt */
final class DynamicLoanFragment$handleApiCallV1$1<T> implements Observer<Resource<Object>> {
    final /* synthetic */ String $handleAction;
    final /* synthetic */ DynamicLoanFragment this$0;

    DynamicLoanFragment$handleApiCallV1$1(DynamicLoanFragment dynamicLoanFragment, String str) {
        this.this$0 = dynamicLoanFragment;
        this.$handleAction = str;
    }

    public final void onChanged(Resource<Object> resource) {
        DynamicLoanFragment dynamicLoanFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(resource, "resource");
        Resource.Status status = resource.getStatus();
        if (status != null) {
            int i = DynamicLoanFragment.WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) dynamicLoanFragment._$_findCachedViewById(C5619R.C5622id.pbLoading);
                Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
                progressBar.setVisibility(0);
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) dynamicLoanFragment._$_findCachedViewById(C5619R.C5622id.pbLoading);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "pbLoading");
                progressBar2.setVisibility(8);
                if (StringsKt.toIntOrNull(this.$handleAction) == null) {
                    new AlertDialog.Builder(dynamicLoanFragment.getBaseActivity()).setMessage(this.$handleAction).setPositiveButton(R.string.ok, new DynamicLoanFragment$handleApiCallV1$1$1$1(dynamicLoanFragment)).show();
                }
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) dynamicLoanFragment._$_findCachedViewById(C5619R.C5622id.pbLoading);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "pbLoading");
                progressBar3.setVisibility(8);
                String message = resource.getMessage();
                if (message == null) {
                    message = "";
                }
                dynamicLoanFragment.showMessage(message);
            }
        }
    }
}
