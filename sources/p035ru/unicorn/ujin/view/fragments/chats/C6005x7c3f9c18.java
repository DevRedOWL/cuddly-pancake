package p035ru.unicorn.ujin.view.fragments.chats;

import com.stfalcon.chatkit.messages.MessagesListAdapter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatFragment$sam$com_stfalcon_chatkit_messages_MessagesListAdapter_Formatter$0 */
/* compiled from: ChatFragment.kt */
final class C6005x7c3f9c18 implements MessagesListAdapter.Formatter {
    private final /* synthetic */ Function1 function;

    C6005x7c3f9c18(Function1 function1) {
        this.function = function1;
    }

    public final /* synthetic */ String format(Object obj) {
        return (String) this.function.invoke(obj);
    }
}
