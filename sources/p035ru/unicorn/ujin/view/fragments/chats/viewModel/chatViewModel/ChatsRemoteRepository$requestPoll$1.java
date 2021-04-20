package p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.PollResponse;
import p035ru.unicorn.ujin.data.entities.chats.Poll;
import p035ru.unicorn.ujin.viewModel.events.PollEvent;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/PollResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.ChatsRemoteRepository$requestPoll$1 */
/* compiled from: ChatsRemoteRepository.kt */
final class ChatsRemoteRepository$requestPoll$1<T> implements Consumer<PollResponse> {
    final /* synthetic */ ChatsRemoteRepository this$0;

    ChatsRemoteRepository$requestPoll$1(ChatsRemoteRepository chatsRemoteRepository) {
        this.this$0 = chatsRemoteRepository;
    }

    public final void accept(PollResponse pollResponse) {
        PublishSubject<PollEvent> pollSubject = this.this$0.getPollSubject();
        boolean z = pollResponse.getError() == 0;
        String message = pollResponse.getMessage();
        Poll data = pollResponse.getData();
        pollSubject.onNext(new PollEvent(z, message, data != null ? Integer.valueOf(data.getId()) : null, pollResponse.getData()));
    }
}
