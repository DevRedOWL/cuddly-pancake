package p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.response.ChatListResponse;
import p035ru.unicorn.ujin.data.realm.Chat;
import p035ru.unicorn.ujin.viewModel.events.RegisterGhostEvent;
import p035ru.unicorn.ujin.viewModel.events.chats.ChatListEvent;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/ChatListResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.ChatsRemoteRepository$requestChatList$1 */
/* compiled from: ChatsRemoteRepository.kt */
final class ChatsRemoteRepository$requestChatList$1<T> implements Consumer<ChatListResponse> {
    final /* synthetic */ ChatsRemoteRepository this$0;

    ChatsRemoteRepository$requestChatList$1(ChatsRemoteRepository chatsRemoteRepository) {
        this.this$0 = chatsRemoteRepository;
    }

    public final void accept(ChatListResponse chatListResponse) {
        ChatsRemoteRepository chatsRemoteRepository = this.this$0;
        String ghostToken = chatListResponse.getGhostToken();
        if (ghostToken != null) {
            chatsRemoteRepository.getGhostRegisterSubject().onNext(new RegisterGhostEvent(ghostToken));
        }
        if (chatListResponse.getError() == 0) {
            PublishSubject<ChatListEvent> chatListSubject = chatsRemoteRepository.getChatListSubject();
            boolean z = chatListResponse.getError() == 0;
            String message = chatListResponse.getMessage();
            String userId = chatListResponse.getData().getUserId();
            if (userId == null) {
                userId = "80";
            }
            RealmList<Chat> chatList = chatListResponse.getData().getChatList();
            Intrinsics.checkNotNullExpressionValue(chatList, "response.data.chatList");
            chatListSubject.onNext(new ChatListEvent(z, message, userId, chatList));
        }
    }
}
