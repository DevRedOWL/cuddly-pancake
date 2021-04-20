package p035ru.unicorn.ujin.view.fragments.chats;

import com.stfalcon.chatkit.messages.MessagesListAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Chat;
import p035ru.unicorn.ujin.view.fragments.chats.adapters.CustomMessagesListAdapter;
import p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.ChatsViewModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "onLoadMore", "ru/unicorn/ujin/view/fragments/chats/ChatFragment$initChat$4$3"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatFragment$initChat$$inlined$apply$lambda$3 */
/* compiled from: ChatFragment.kt */
final class ChatFragment$initChat$$inlined$apply$lambda$3 implements MessagesListAdapter.OnLoadMoreListener {
    final /* synthetic */ Chat $chat$inlined;
    final /* synthetic */ CustomMessagesListAdapter $this_apply;
    final /* synthetic */ ChatFragment this$0;

    ChatFragment$initChat$$inlined$apply$lambda$3(CustomMessagesListAdapter customMessagesListAdapter, ChatFragment chatFragment, Chat chat) {
        this.$this_apply = customMessagesListAdapter;
        this.this$0 = chatFragment;
        this.$chat$inlined = chat;
    }

    public final void onLoadMore(int i, int i2) {
        CustomMessagesListAdapter customMessagesListAdapter = this.$this_apply;
        this.this$0.toggleProgressVisibility(true);
        ChatsViewModel chatViewModel = this.this$0.getChatViewModel();
        String id = this.$chat$inlined.getId();
        Intrinsics.checkNotNullExpressionValue(id, "chat.id");
        chatViewModel.requestMessageList(id, 18, this.this$0.messageList.size(), false);
    }
}
