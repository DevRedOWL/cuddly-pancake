package p035ru.unicorn.ujin.view.fragments.chats;

import com.stfalcon.chatkit.commons.models.IDialog;
import com.stfalcon.chatkit.commons.models.IMessage;
import com.stfalcon.chatkit.dialogs.DialogsListAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Chat;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "dialog", "Lru/unicorn/ujin/data/realm/Chat;", "kotlin.jvm.PlatformType", "onDialogClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatListFragment$instantiateChatListLoading$2 */
/* compiled from: ChatListFragment.kt */
final class ChatListFragment$instantiateChatListLoading$2<DIALOG extends IDialog<IMessage>> implements DialogsListAdapter.OnDialogClickListener<Chat> {
    final /* synthetic */ ChatListFragment this$0;

    ChatListFragment$instantiateChatListLoading$2(ChatListFragment chatListFragment) {
        this.this$0 = chatListFragment;
    }

    public final void onDialogClick(Chat chat) {
        ChatListFragment chatListFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(chat, "dialog");
        chatListFragment.openDialog(chat);
    }
}
