package p035ru.unicorn.ujin.view.activity.bottomNavigationActivity;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.viewModel.events.chats.ChatListEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Lru/unicorn/ujin/viewModel/events/chats/ChatListEvent;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity$showChatsFragment$1 */
/* compiled from: StageActivity.kt */
final class StageActivity$showChatsFragment$1<T> implements Observer<ChatListEvent> {
    final /* synthetic */ StageActivity this$0;

    StageActivity$showChatsFragment$1(StageActivity stageActivity) {
        this.this$0 = stageActivity;
    }

    public final void onChanged(ChatListEvent chatListEvent) {
        StageActivity stageActivity = this.this$0;
        Intrinsics.checkNotNullExpressionValue(chatListEvent, "it");
        stageActivity.handleChatEvent(chatListEvent);
    }
}
