package p035ru.unicorn.ujin.view.fragments.oss;

import kotlin.Metadata;
import p035ru.unicorn.ujin.view.fragments.oss.events.OssListEvent;
import p035ru.unicorn.ujin.view.fragments.oss.response.OssListResponse;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/view/fragments/oss/response/OssListResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.OssRemoteRepository$getOssList$1 */
/* compiled from: OssRemoteRepository.kt */
final class OssRemoteRepository$getOssList$1<T> implements Consumer<OssListResponse> {
    final /* synthetic */ OssRemoteRepository this$0;

    OssRemoteRepository$getOssList$1(OssRemoteRepository ossRemoteRepository) {
        this.this$0 = ossRemoteRepository;
    }

    public final void accept(OssListResponse ossListResponse) {
        this.this$0.getOssListSubject().onNext(new OssListEvent(ossListResponse.getError() == 0, ossListResponse.getMessage(), ossListResponse != null ? ossListResponse.getData() : null));
    }
}
