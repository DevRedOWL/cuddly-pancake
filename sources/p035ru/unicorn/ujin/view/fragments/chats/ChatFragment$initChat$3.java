package p035ru.unicorn.ujin.view.fragments.chats;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "pollId", "", "pollOptionId", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatFragment$initChat$3 */
/* compiled from: ChatFragment.kt */
final class ChatFragment$initChat$3 extends Lambda implements Function2<Integer, Integer, Unit> {
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChatFragment$initChat$3(ChatFragment chatFragment) {
        super(2);
        this.this$0 = chatFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i, int i2) {
        this.this$0.votePoll(i, i2);
    }
}
