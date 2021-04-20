package p035ru.unicorn.ujin.view.fragments.chats;

import com.stfalcon.chatkit.commons.models.IMessage;
import com.stfalcon.chatkit.messages.MessagesListAdapter;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.entities.chats.Message;
import p035ru.unicorn.ujin.data.realm.Chat;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "message", "Lru/unicorn/ujin/data/entities/chats/Message;", "kotlin.jvm.PlatformType", "onMessageClick", "ru/unicorn/ujin/view/fragments/chats/ChatFragment$initChat$4$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatFragment$initChat$$inlined$apply$lambda$1 */
/* compiled from: ChatFragment.kt */
final class ChatFragment$initChat$$inlined$apply$lambda$1<MESSAGE extends IMessage> implements MessagesListAdapter.OnMessageClickListener<Message> {
    final /* synthetic */ Chat $chat$inlined;
    final /* synthetic */ ChatFragment this$0;

    ChatFragment$initChat$$inlined$apply$lambda$1(ChatFragment chatFragment, Chat chat) {
        this.this$0 = chatFragment;
        this.$chat$inlined = chat;
    }

    public final void onMessageClick(Message message) {
        this.this$0.onMessageClickListener(message);
    }
}
