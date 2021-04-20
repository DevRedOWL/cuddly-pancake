package p035ru.unicorn.ujin.data.repository;

import java.util.List;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.hardware.GetHardwareResponse;
import p035ru.unicorn.ujin.data.api.response.hardware.GetHardwareResponseData;
import p035ru.unicorn.ujin.viewModel.events.GetHardwareCountEvent;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/hardware/GetHardwareResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.RealmRepository$requestHardware$1 */
/* compiled from: RealmRepository.kt */
final class RealmRepository$requestHardware$1<T> implements Consumer<GetHardwareResponse> {
    final /* synthetic */ RealmRepository this$0;

    RealmRepository$requestHardware$1(RealmRepository realmRepository) {
        this.this$0 = realmRepository;
    }

    public final void accept(GetHardwareResponse getHardwareResponse) {
        PublishSubject<GetHardwareCountEvent> getHardwareSubject = this.this$0.getGetHardwareSubject();
        boolean z = getHardwareResponse.getError() == 0;
        String message = getHardwareResponse.getMessage();
        List<GetHardwareResponseData> data = getHardwareResponse.getData();
        getHardwareSubject.onNext(new GetHardwareCountEvent(z, message, data != null ? Integer.valueOf(data.size()) : null));
    }
}
