package p035ru.unicorn.ujin.view.fragments.chats;

import android.view.View;
import android.widget.ImageButton;
import java.util.ArrayList;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Chat;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/fragments/chats/ChatFragment$getButtonsList$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatFragment$getButtonsList$$inlined$let$lambda$1 */
/* compiled from: ChatFragment.kt */
final class ChatFragment$getButtonsList$$inlined$let$lambda$1 implements View.OnClickListener {
    final /* synthetic */ ArrayList $buttonsList$inlined;
    final /* synthetic */ Chat $chat;
    final /* synthetic */ ImageButton $chatAvatarButton$inlined;
    final /* synthetic */ ChatFragment this$0;

    ChatFragment$getButtonsList$$inlined$let$lambda$1(Chat chat, ChatFragment chatFragment, ImageButton imageButton, ArrayList arrayList) {
        this.$chat = chat;
        this.this$0 = chatFragment;
        this.$chatAvatarButton$inlined = imageButton;
        this.$buttonsList$inlined = arrayList;
    }

    public final void onClick(View view) {
        this.this$0.showOptionsDialog(this.$chat);
    }
}
