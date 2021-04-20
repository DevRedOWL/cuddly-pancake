package p035ru.unicorn.ujin.view.fragments.chats;

import com.stfalcon.chatkit.messages.MessagesListAdapter;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Chat;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo51343d2 = {"<anonymous>", "", "count", "", "onSelectionChanged", "ru/unicorn/ujin/view/fragments/chats/ChatFragment$initChat$4$2"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatFragment$initChat$$inlined$apply$lambda$2 */
/* compiled from: ChatFragment.kt */
final class ChatFragment$initChat$$inlined$apply$lambda$2 implements MessagesListAdapter.SelectionListener {
    final /* synthetic */ Chat $chat$inlined;
    final /* synthetic */ ChatFragment this$0;

    ChatFragment$initChat$$inlined$apply$lambda$2(ChatFragment chatFragment, Chat chat) {
        this.this$0 = chatFragment;
        this.$chat$inlined = chat;
    }

    public final void onSelectionChanged(int i) {
        this.this$0.selectionListener(i);
    }
}
