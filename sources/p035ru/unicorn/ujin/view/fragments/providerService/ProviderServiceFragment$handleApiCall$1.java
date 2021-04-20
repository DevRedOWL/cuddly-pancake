package p035ru.unicorn.ujin.view.fragments.providerService;

import android.app.AlertDialog;
import android.widget.ProgressBar;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.ResourceV2;
import p035ru.unicorn.ujin.view.fragments.providerService.ProviderServiceFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "resource", "Lru/unicorn/ujin/data/realm/ResourceV2;", "", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.ProviderServiceFragment$handleApiCall$1 */
/* compiled from: ProviderServiceFragment.kt */
final class ProviderServiceFragment$handleApiCall$1<T> implements Observer<ResourceV2<Object>> {
    final /* synthetic */ ProviderServiceFragment this$0;

    ProviderServiceFragment$handleApiCall$1(ProviderServiceFragment providerServiceFragment) {
        this.this$0 = providerServiceFragment;
    }

    public final void onChanged(ResourceV2<Object> resourceV2) {
        String str;
        ResourceV2.ResponseV2Error error;
        String str2;
        ResourceV2.ResponseV2Error error2;
        ProviderServiceFragment providerServiceFragment = this.this$0;
        int i = ProviderServiceFragment.WhenMappings.$EnumSwitchMapping$0[resourceV2.getStatus().ordinal()];
        if (i == 1) {
            ProgressBar progressBar = (ProgressBar) providerServiceFragment._$_findCachedViewById(C5619R.C5622id.pbLoading);
            Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
            progressBar.setVisibility(0);
        } else if (i == 2) {
            ProgressBar progressBar2 = (ProgressBar) providerServiceFragment._$_findCachedViewById(C5619R.C5622id.pbLoading);
            Intrinsics.checkNotNullExpressionValue(progressBar2, "pbLoading");
            progressBar2.setVisibility(8);
            ResourceV2.ResourceV2Service service = resourceV2.getService();
            if ((service != null ? service.getError() : null) == null) {
                new AlertDialog.Builder(providerServiceFragment.getBaseActivity()).setTitle("Договор успешно добавлен!").setMessage("Через некоторое время он появится в списке договоров во вкладке \"Услуги\"").setPositiveButton(R.string.ok, new ProviderServiceFragment$handleApiCall$1$1$1(providerServiceFragment)).show();
                return;
            }
            ResourceV2.ResourceV2Service service2 = resourceV2.getService();
            if (service2 == null || (error = service2.getError()) == null || (str = error.getMessage()) == null) {
                str = "";
            }
            providerServiceFragment.showMessage(str);
        } else if (i == 3) {
            ProgressBar progressBar3 = (ProgressBar) providerServiceFragment._$_findCachedViewById(C5619R.C5622id.pbLoading);
            Intrinsics.checkNotNullExpressionValue(progressBar3, "pbLoading");
            progressBar3.setVisibility(8);
            ResourceV2.ResourceV2Service service3 = resourceV2.getService();
            if (service3 == null || (error2 = service3.getError()) == null || (str2 = error2.getMessage()) == null) {
                str2 = "";
            }
            providerServiceFragment.showMessage(str2);
        }
    }
}
