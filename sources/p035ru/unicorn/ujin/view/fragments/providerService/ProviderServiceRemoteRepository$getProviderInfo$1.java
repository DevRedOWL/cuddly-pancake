package p035ru.unicorn.ujin.view.fragments.providerService;

import kotlin.Metadata;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/view/fragments/providerService/ProviderInfoResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.ProviderServiceRemoteRepository$getProviderInfo$1 */
/* compiled from: ProviderServiceRemoteRepository.kt */
final class ProviderServiceRemoteRepository$getProviderInfo$1<T> implements Consumer<ProviderInfoResponse> {
    final /* synthetic */ ProviderServiceRemoteRepository this$0;

    ProviderServiceRemoteRepository$getProviderInfo$1(ProviderServiceRemoteRepository providerServiceRemoteRepository) {
        this.this$0 = providerServiceRemoteRepository;
    }

    public final void accept(ProviderInfoResponse providerInfoResponse) {
        PublishSubject<ProviderInfoEvent> providerInfoSubject = this.this$0.getProviderInfoSubject();
        boolean z = providerInfoResponse.getError() == 0;
        String message = providerInfoResponse.getMessage();
        ProviderInfoResponseData data = providerInfoResponse.getData();
        Available available = null;
        Unavailable unavailable = data != null ? data.getUnavailable() : null;
        ProviderInfoResponseData data2 = providerInfoResponse.getData();
        if (data2 != null) {
            available = data2.getAvailable();
        }
        providerInfoSubject.onNext(new ProviderInfoEvent(z, message, unavailable, available));
    }
}
