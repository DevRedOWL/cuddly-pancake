package p035ru.unicorn.ujin.view.fragments.chats;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Chat;
import p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.ChatsViewModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/chats/ChatFragment$mMessageReceiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatFragment$mMessageReceiver$1 */
/* compiled from: ChatFragment.kt */
public final class ChatFragment$mMessageReceiver$1 extends BroadcastReceiver {
    final /* synthetic */ ChatFragment this$0;

    ChatFragment$mMessageReceiver$1(ChatFragment chatFragment) {
        this.this$0 = chatFragment;
    }

    public void onReceive(Context context, Intent intent) {
        Chat chat;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual((Object) intent.getStringExtra("chatId"), (Object) this.this$0.getChatId()) && (chat = this.this$0.getChat()) != null) {
            ChatsViewModel chatViewModel = this.this$0.getChatViewModel();
            String id = chat.getId();
            Intrinsics.checkNotNullExpressionValue(id, "it.id");
            chatViewModel.requestMessageList(id, 18, 0, true);
        }
    }
}
