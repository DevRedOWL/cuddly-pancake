package p035ru.unicorn.ujin.view.fragments.providerService;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.data.realm.ResourceV2;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b¨\u0006\u000b"}, mo51343d2 = {"<anonymous>", "", "liveData", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "Lru/unicorn/ujin/data/realm/ResourceV2;", "", "<anonymous parameter 1>", "", "invoke", "ru/unicorn/ujin/view/fragments/providerService/ProviderServiceFragment$handleProviderInfo$2$1$4$5", "ru/unicorn/ujin/view/fragments/providerService/ProviderServiceFragment$$special$$inlined$let$lambda$3", "ru/unicorn/ujin/view/fragments/providerService/ProviderServiceFragment$$special$$inlined$apply$lambda$3"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.ProviderServiceFragment$handleProviderInfo$$inlined$let$lambda$3 */
/* compiled from: ProviderServiceFragment.kt */
final class ProviderServiceFragment$handleProviderInfo$$inlined$let$lambda$3 extends Lambda implements Function2<SingleLiveEvent<ResourceV2<Object>>, String, Unit> {
    final /* synthetic */ Available $available$inlined;
    final /* synthetic */ ArrayList $dynamicFields$inlined;
    final /* synthetic */ ProviderServiceFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProviderServiceFragment$handleProviderInfo$$inlined$let$lambda$3(ArrayList arrayList, Available available, ProviderServiceFragment providerServiceFragment) {
        super(2);
        this.$dynamicFields$inlined = arrayList;
        this.$available$inlined = available;
        this.this$0 = providerServiceFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((SingleLiveEvent<ResourceV2<Object>>) (SingleLiveEvent) obj, (String) obj2);
        return Unit.INSTANCE;
    }

    public final void invoke(SingleLiveEvent<ResourceV2<Object>> singleLiveEvent, String str) {
        Intrinsics.checkNotNullParameter(singleLiveEvent, "liveData");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 1>");
        this.this$0.handleApiCall(singleLiveEvent);
    }
}
