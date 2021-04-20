package p035ru.unicorn.ujin.view.fragments.chats.newChat;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.ReactConst;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "chat", "Lru/unicorn/ujin/view/fragments/chats/newChat/NewChat;", "checked", "", "invoke", "ru/unicorn/ujin/view/fragments/chats/newChat/NewChatFragment$handleContactsFound$2$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.newChat.NewChatFragment$handleContactsFound$$inlined$map$lambda$1 */
/* compiled from: NewChatFragment.kt */
final class NewChatFragment$handleContactsFound$$inlined$map$lambda$1 extends Lambda implements Function2<NewChat, Boolean, Unit> {
    final /* synthetic */ NewChatFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NewChatFragment$handleContactsFound$$inlined$map$lambda$1(NewChatFragment newChatFragment) {
        super(2);
        this.this$0 = newChatFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((NewChat) obj, ((Boolean) obj2).booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(NewChat newChat, boolean z) {
        Intrinsics.checkNotNullParameter(newChat, ReactConst.CHAT);
        this.this$0.onCheckBoxClicked(newChat, z);
    }
}
