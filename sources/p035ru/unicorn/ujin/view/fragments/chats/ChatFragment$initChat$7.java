package p035ru.unicorn.ujin.view.fragments.chats;

import com.stfalcon.chatkit.messages.MessageInput;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "onAddAttachments"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatFragment$initChat$7 */
/* compiled from: ChatFragment.kt */
final class ChatFragment$initChat$7 implements MessageInput.AttachmentsListener {
    final /* synthetic */ ChatFragment this$0;

    ChatFragment$initChat$7(ChatFragment chatFragment) {
        this.this$0 = chatFragment;
    }

    public final void onAddAttachments() {
        this.this$0.selectAttachment();
    }
}
