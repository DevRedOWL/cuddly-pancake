package p035ru.unicorn.ujin.view.fragments.providerService;

import android.content.DialogInterface;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.ProviderServiceFragment$handleApiCall$1$1$1 */
/* compiled from: ProviderServiceFragment.kt */
final class ProviderServiceFragment$handleApiCall$1$1$1 implements DialogInterface.OnClickListener {
    final /* synthetic */ ProviderServiceFragment $this_run;

    ProviderServiceFragment$handleApiCall$1$1$1(ProviderServiceFragment providerServiceFragment) {
        this.$this_run = providerServiceFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ProviderServiceFragment providerServiceFragment = this.$this_run;
        dialogInterface.dismiss();
        providerServiceFragment.getBaseActivity().onBackPressed();
    }
}