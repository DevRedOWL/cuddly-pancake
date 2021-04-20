package p035ru.unicorn.ujin.view.fragments.chats;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.entities.chats.Message;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "p1", "Lru/unicorn/ujin/data/entities/chats/Message;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatFragment$copySelectedMessages$1 */
/* compiled from: ChatFragment.kt */
final /* synthetic */ class ChatFragment$copySelectedMessages$1 extends FunctionReferenceImpl implements Function1<Message, String> {
    ChatFragment$copySelectedMessages$1(ChatFragment chatFragment) {
        super(1, chatFragment, ChatFragment.class, "getMessageAsString", "getMessageAsString(Lru/unicorn/ujin/data/entities/chats/Message;)Ljava/lang/String;", 0);
    }

    public final String invoke(Message message) {
        Intrinsics.checkNotNullParameter(message, "p1");
        return ((ChatFragment) this.receiver).getMessageAsString(message);
    }
}
