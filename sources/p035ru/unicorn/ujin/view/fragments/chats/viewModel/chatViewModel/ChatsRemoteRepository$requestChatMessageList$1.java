package p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.chats.ChatMessageListData;
import p035ru.unicorn.ujin.data.api.response.chats.ChatMessageListResponse;
import p035ru.unicorn.ujin.viewModel.events.RegisterGhostEvent;
import p035ru.unicorn.ujin.viewModel.events.chats.MessageListUpdateEvent;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/chats/ChatMessageListResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.ChatsRemoteRepository$requestChatMessageList$1 */
/* compiled from: ChatsRemoteRepository.kt */
final class ChatsRemoteRepository$requestChatMessageList$1<T> implements Consumer<ChatMessageListResponse> {
    final /* synthetic */ boolean $newMessages;
    final /* synthetic */ ChatsRemoteRepository this$0;

    ChatsRemoteRepository$requestChatMessageList$1(ChatsRemoteRepository chatsRemoteRepository, boolean z) {
        this.this$0 = chatsRemoteRepository;
        this.$newMessages = z;
    }

    public final void accept(ChatMessageListResponse chatMessageListResponse) {
        ChatsRemoteRepository chatsRemoteRepository = this.this$0;
        String ghostToken = chatMessageListResponse.getGhostToken();
        if (ghostToken != null) {
            chatsRemoteRepository.getGhostRegisterSubject().onNext(new RegisterGhostEvent(ghostToken));
        }
        PublishSubject<MessageListUpdateEvent> messageListSubject = chatsRemoteRepository.getMessageListSubject();
        boolean z = chatMessageListResponse.getError() == 0;
        String message = chatMessageListResponse.getMessage();
        ChatMessageListData data = chatMessageListResponse.getData();
        messageListSubject.onNext(new MessageListUpdateEvent(z, message, data != null ? data.getMessages() : null, this.$newMessages));
    }
}
