package p035ru.unicorn.ujin.view.fragments.chats;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.entities.chats.Message;
import p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.ChatsViewModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, mo51343d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick", "ru/unicorn/ujin/view/fragments/chats/ChatFragment$deleteSelectedMessages$1$2"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatFragment$deleteSelectedMessages$$inlined$let$lambda$1 */
/* compiled from: ChatFragment.kt */
final class ChatFragment$deleteSelectedMessages$$inlined$let$lambda$1 implements DialogInterface.OnClickListener {
    final /* synthetic */ ChatFragment this$0;

    ChatFragment$deleteSelectedMessages$$inlined$let$lambda$1(ChatFragment chatFragment) {
        this.this$0 = chatFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ArrayList selectedMessages = this.this$0.getMessageAdapter().getSelectedMessages();
        Intrinsics.checkNotNullExpressionValue(selectedMessages, "messageAdapter.selectedMessages");
        Iterable<Message> iterable = selectedMessages;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Message message : iterable) {
            ChatsViewModel chatViewModel = this.this$0.getChatViewModel();
            Intrinsics.checkNotNullExpressionValue(message, "message");
            chatViewModel.requestDeleteMessage(message);
            arrayList.add(Unit.INSTANCE);
        }
        List list = (List) arrayList;
        dialogInterface.dismiss();
        this.this$0.removeSelection();
    }
}
