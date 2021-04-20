package p035ru.unicorn.ujin.data.repository;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.response.ChatListResponse;
import p035ru.unicorn.ujin.data.realm.Chat;
import p035ru.unicorn.ujin.data.realm.ChatListResponseData;
import p035ru.unicorn.ujin.viewModel.events.RegisterGhostEvent;
import p035ru.unicorn.ujin.viewModel.events.chats.ChatListEvent;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/ChatListResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.RealmRepository$requestChatList$1 */
/* compiled from: RealmRepository.kt */
final class RealmRepository$requestChatList$1<T> implements Consumer<ChatListResponse> {
    final /* synthetic */ RealmRepository this$0;

    RealmRepository$requestChatList$1(RealmRepository realmRepository) {
        this.this$0 = realmRepository;
    }

    public final void accept(ChatListResponse chatListResponse) {
        RealmRepository realmRepository = this.this$0;
        String ghostToken = chatListResponse.getGhostToken();
        if (ghostToken != null) {
            realmRepository.getGhostRegisterSubject().onNext(new RegisterGhostEvent(ghostToken));
        }
        if (chatListResponse.getError() == 0) {
            realmRepository.getRealm().executeTransaction(new RealmRepository$requestChatList$1$1$2(chatListResponse.getData()));
        }
        PublishSubject<ChatListEvent> chatListSubject = realmRepository.getChatListSubject();
        boolean z = chatListResponse.getError() == 0;
        String message = chatListResponse.getMessage();
        ChatListResponseData data = chatListResponse.getData();
        String userId = data != null ? data.getUserId() : null;
        Intrinsics.checkNotNullExpressionValue(userId, "response.data?.userId");
        RealmList<Chat> chatList = chatListResponse.getData().getChatList();
        Intrinsics.checkNotNullExpressionValue(chatList, "response.data.chatList");
        chatListSubject.onNext(new ChatListEvent(z, message, userId, chatList));
    }
}
