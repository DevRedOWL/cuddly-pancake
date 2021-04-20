package p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.chats.SendMessageResponse;
import p035ru.unicorn.ujin.viewModel.events.RegisterGhostEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/chats/SendMessageResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.ChatsRemoteRepository$requestSendMessage$1 */
/* compiled from: ChatsRemoteRepository.kt */
final class ChatsRemoteRepository$requestSendMessage$1<T> implements Consumer<SendMessageResponse> {
    final /* synthetic */ String $chatId;
    final /* synthetic */ ChatsRemoteRepository this$0;

    ChatsRemoteRepository$requestSendMessage$1(ChatsRemoteRepository chatsRemoteRepository, String str) {
        this.this$0 = chatsRemoteRepository;
        this.$chatId = str;
    }

    public final void accept(SendMessageResponse sendMessageResponse) {
        ChatsRemoteRepository chatsRemoteRepository = this.this$0;
        String ghostToken = sendMessageResponse.getGhostToken();
        if (ghostToken != null) {
            chatsRemoteRepository.getGhostRegisterSubject().onNext(new RegisterGhostEvent(ghostToken));
        }
        if (sendMessageResponse.getError() == 0) {
            chatsRemoteRepository.requestChatMessageList(this.$chatId, 5, 0, true);
        } else {
            chatsRemoteRepository.getErrorMessageSubject().onNext(sendMessageResponse.getMessage());
        }
    }
}
