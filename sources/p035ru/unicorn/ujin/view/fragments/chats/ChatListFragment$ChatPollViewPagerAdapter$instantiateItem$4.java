package p035ru.unicorn.ujin.view.fragments.chats;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.fragments.chats.ChatListFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "pollId", "", "pollOptionId", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatListFragment$ChatPollViewPagerAdapter$instantiateItem$4 */
/* compiled from: ChatListFragment.kt */
final class ChatListFragment$ChatPollViewPagerAdapter$instantiateItem$4 extends Lambda implements Function2<Integer, Integer, Unit> {
    final /* synthetic */ ChatListFragment.ChatPollViewPagerAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChatListFragment$ChatPollViewPagerAdapter$instantiateItem$4(ChatListFragment.ChatPollViewPagerAdapter chatPollViewPagerAdapter) {
        super(2);
        this.this$0 = chatPollViewPagerAdapter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i, int i2) {
        ChatListFragment.this.votePoll(i, i2);
    }
}
