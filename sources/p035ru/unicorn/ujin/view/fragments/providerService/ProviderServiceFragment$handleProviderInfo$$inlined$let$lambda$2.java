package p035ru.unicorn.ujin.view.fragments.providerService;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "it", "", "invoke", "ru/unicorn/ujin/view/fragments/providerService/ProviderServiceFragment$handleProviderInfo$2$1$4$4", "ru/unicorn/ujin/view/fragments/providerService/ProviderServiceFragment$$special$$inlined$let$lambda$2", "ru/unicorn/ujin/view/fragments/providerService/ProviderServiceFragment$$special$$inlined$apply$lambda$2"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.ProviderServiceFragment$handleProviderInfo$$inlined$let$lambda$2 */
/* compiled from: ProviderServiceFragment.kt */
final class ProviderServiceFragment$handleProviderInfo$$inlined$let$lambda$2 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ Available $available$inlined;
    final /* synthetic */ ArrayList $dynamicFields$inlined;
    final /* synthetic */ ProviderServiceFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProviderServiceFragment$handleProviderInfo$$inlined$let$lambda$2(ArrayList arrayList, Available available, ProviderServiceFragment providerServiceFragment) {
        super(1);
        this.$dynamicFields$inlined = arrayList;
        this.$available$inlined = available;
        this.this$0 = providerServiceFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        ProviderServiceFragment providerServiceFragment = this.this$0;
        Callback callback = this.$available$inlined.getCallback();
        providerServiceFragment.handleButtonClick(callback != null ? callback.getUrl() : null);
    }
}
