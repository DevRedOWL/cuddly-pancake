package p035ru.unicorn.ujin.view.fragments.chats;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.data.realm.Chat;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryDialog;
import p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.ChatsViewModel;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "", "invoke", "ru/unicorn/ujin/view/fragments/chats/ChatBaseFragment$renameChat$2$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatBaseFragment$renameChat$$inlined$apply$lambda$1 */
/* compiled from: ChatBaseFragment.kt */
final class ChatBaseFragment$renameChat$$inlined$apply$lambda$1 extends Lambda implements Function1<Long, Unit> {
    final /* synthetic */ Chat $dialog$inlined;
    final /* synthetic */ DataEntryDialog $this_apply;
    final /* synthetic */ ChatBaseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChatBaseFragment$renameChat$$inlined$apply$lambda$1(DataEntryDialog dataEntryDialog, ChatBaseFragment chatBaseFragment, Chat chat) {
        super(1);
        this.$this_apply = dataEntryDialog;
        this.this$0 = chatBaseFragment;
        this.$dialog$inlined = chat;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j) {
        final DataEntryDialog dataEntryDialog = this.$this_apply;
        this.this$0.getChatViewModel().getChatRenameMutableLiveData().observe(this.this$0, new Observer<UpdateEvent>() {
            public final void onChanged(UpdateEvent updateEvent) {
                ChatBaseFragment chatBaseFragment = this.this$0;
                Intrinsics.checkNotNullExpressionValue(updateEvent, "event");
                chatBaseFragment.handleChatRename(updateEvent, dataEntryDialog);
            }
        });
        ChatsViewModel chatViewModel = this.this$0.getChatViewModel();
        String id = this.$dialog$inlined.getId();
        Intrinsics.checkNotNullExpressionValue(id, "dialog.id");
        chatViewModel.requestRenameChat(id, dataEntryDialog.getValuesList()[0]);
    }
}
