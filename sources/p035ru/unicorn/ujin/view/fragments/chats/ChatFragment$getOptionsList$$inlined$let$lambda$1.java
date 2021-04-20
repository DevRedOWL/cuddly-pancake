package p035ru.unicorn.ujin.view.fragments.chats;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.data.realm.Chat;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "", "invoke", "ru/unicorn/ujin/view/fragments/chats/ChatFragment$getOptionsList$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatFragment$getOptionsList$$inlined$let$lambda$1 */
/* compiled from: ChatFragment.kt */
final class ChatFragment$getOptionsList$$inlined$let$lambda$1 extends Lambda implements Function1<Object, Unit> {
    final /* synthetic */ Chat $chat$inlined;
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChatFragment$getOptionsList$$inlined$let$lambda$1(ChatFragment chatFragment, Chat chat) {
        super(1);
        this.this$0 = chatFragment;
        this.$chat$inlined = chat;
    }

    public final void invoke(Object obj) {
        this.this$0.showParticipants();
    }
}
