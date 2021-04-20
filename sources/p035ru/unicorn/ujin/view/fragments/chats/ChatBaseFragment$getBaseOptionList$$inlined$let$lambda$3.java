package p035ru.unicorn.ujin.view.fragments.chats;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.data.realm.Chat;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "", "invoke", "ru/unicorn/ujin/view/fragments/chats/ChatBaseFragment$getBaseOptionList$1$3"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatBaseFragment$getBaseOptionList$$inlined$let$lambda$3 */
/* compiled from: ChatBaseFragment.kt */
final class ChatBaseFragment$getBaseOptionList$$inlined$let$lambda$3 extends Lambda implements Function1<Object, Unit> {
    final /* synthetic */ Chat $dialog$inlined;
    final /* synthetic */ String $userId$inlined;
    final /* synthetic */ ChatBaseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChatBaseFragment$getBaseOptionList$$inlined$let$lambda$3(ChatBaseFragment chatBaseFragment, Chat chat, String str) {
        super(1);
        this.this$0 = chatBaseFragment;
        this.$dialog$inlined = chat;
        this.$userId$inlined = str;
    }

    public final void invoke(Object obj) {
        this.this$0.deleteChat(this.$dialog$inlined, this.$userId$inlined);
    }
}
