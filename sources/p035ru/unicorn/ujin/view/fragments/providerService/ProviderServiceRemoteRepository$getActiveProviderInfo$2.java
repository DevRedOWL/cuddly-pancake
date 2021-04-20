package p035ru.unicorn.ujin.view.fragments.providerService;

import java.util.ArrayList;
import kotlin.Metadata;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/view/fragments/providerService/ActiveProviderInfoResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.ProviderServiceRemoteRepository$getActiveProviderInfo$2 */
/* compiled from: ProviderServiceRemoteRepository.kt */
final class ProviderServiceRemoteRepository$getActiveProviderInfo$2<T> implements Consumer<ActiveProviderInfoResponse> {
    final /* synthetic */ ProviderServiceRemoteRepository this$0;

    ProviderServiceRemoteRepository$getActiveProviderInfo$2(ProviderServiceRemoteRepository providerServiceRemoteRepository) {
        this.this$0 = providerServiceRemoteRepository;
    }

    public final void accept(ActiveProviderInfoResponse activeProviderInfoResponse) {
        ArrayList<ActiveProviderService> services;
        PublishSubject<ActiveProviderInfoEvent> activeProviderInfoSubject = this.this$0.getActiveProviderInfoSubject();
        boolean z = activeProviderInfoResponse.getError() == 0;
        String message = activeProviderInfoResponse.getMessage();
        if (message == null) {
            message = "";
        }
        ActiveProviderInfoResponseData data = activeProviderInfoResponse.getData();
        activeProviderInfoSubject.onNext(new ActiveProviderInfoEvent(z, message, (data == null || (services = data.getServices()) == null) ? null : services.get(0)));
    }
}
