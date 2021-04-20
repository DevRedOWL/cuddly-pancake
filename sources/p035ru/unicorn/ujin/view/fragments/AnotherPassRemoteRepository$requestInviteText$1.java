package p035ru.unicorn.ujin.view.fragments;

import kotlin.Metadata;
import p035ru.unicorn.ujin.view.fragments.anotherPass.response.passList.AnotherPassInviteTextResponse;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/AnotherPassInviteTextResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.AnotherPassRemoteRepository$requestInviteText$1 */
/* compiled from: AnotherPassRemoteRepository.kt */
final class AnotherPassRemoteRepository$requestInviteText$1<T> implements Consumer<AnotherPassInviteTextResponse> {
    final /* synthetic */ AnotherPassRemoteRepository this$0;

    AnotherPassRemoteRepository$requestInviteText$1(AnotherPassRemoteRepository anotherPassRemoteRepository) {
        this.this$0 = anotherPassRemoteRepository;
    }

    public final void accept(AnotherPassInviteTextResponse anotherPassInviteTextResponse) {
        this.this$0.getInviteTextSubject().onNext(new UpdateEvent(anotherPassInviteTextResponse.getError() == 0, anotherPassInviteTextResponse.getError() == 0 ? anotherPassInviteTextResponse.getData().getText() : anotherPassInviteTextResponse.getMessage()));
    }
}
