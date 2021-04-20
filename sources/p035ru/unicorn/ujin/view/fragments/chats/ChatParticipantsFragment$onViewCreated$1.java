package p035ru.unicorn.ujin.view.fragments.chats;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.viewModel.events.chats.ChatParticipantEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "event", "Lru/unicorn/ujin/viewModel/events/chats/ChatParticipantEvent;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatParticipantsFragment$onViewCreated$1 */
/* compiled from: ChatParticipantsFragment.kt */
final class ChatParticipantsFragment$onViewCreated$1<T> implements Observer<ChatParticipantEvent> {
    final /* synthetic */ ChatParticipantsFragment this$0;

    ChatParticipantsFragment$onViewCreated$1(ChatParticipantsFragment chatParticipantsFragment) {
        this.this$0 = chatParticipantsFragment;
    }

    public final void onChanged(ChatParticipantEvent chatParticipantEvent) {
        ChatParticipantsFragment chatParticipantsFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(chatParticipantEvent, "event");
        chatParticipantsFragment.handleParticipants(chatParticipantEvent);
    }
}
