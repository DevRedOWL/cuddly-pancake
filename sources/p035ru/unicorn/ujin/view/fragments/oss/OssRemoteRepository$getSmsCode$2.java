package p035ru.unicorn.ujin.view.fragments.oss;

import kotlin.Metadata;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.OssRemoteRepository$getSmsCode$2 */
/* compiled from: OssRemoteRepository.kt */
final class OssRemoteRepository$getSmsCode$2<T> implements Consumer<Throwable> {
    final /* synthetic */ OssRemoteRepository this$0;

    OssRemoteRepository$getSmsCode$2(OssRemoteRepository ossRemoteRepository) {
        this.this$0 = ossRemoteRepository;
    }

    public final void accept(Throwable th) {
        this.this$0.getOssGetSmsSubject().onNext(new UpdateEvent(false, OssRemoteRepository.Companion.getUNABLE_TO_GET_SMS()));
    }
}
