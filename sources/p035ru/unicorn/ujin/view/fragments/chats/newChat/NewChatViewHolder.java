package p035ru.unicorn.ujin.view.fragments.chats.newChat;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.stfalcon.chatkit.dialogs.DialogsListAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/newChat/NewChatViewHolder;", "Lcom/stfalcon/chatkit/dialogs/DialogsListAdapter$DialogViewHolder;", "Lru/unicorn/ujin/view/fragments/chats/newChat/NewChat;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "onBind", "", "dialog", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.newChat.NewChatViewHolder */
/* compiled from: NewChatViewHolder.kt */
public final class NewChatViewHolder extends DialogsListAdapter.DialogViewHolder<NewChat> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewChatViewHolder(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
    }

    public void onBind(NewChat newChat) {
        Intrinsics.checkNotNullParameter(newChat, "dialog");
        super.onBind(newChat);
        if (newChat.getGroupParticipant()) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            CheckBox checkBox = (CheckBox) view.findViewById(C5619R.C5622id.cbInGroup);
            Intrinsics.checkNotNullExpressionValue(checkBox, "itemView.cbInGroup");
            checkBox.setVisibility(0);
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            ((CheckBox) view2.findViewById(C5619R.C5622id.cbInGroup)).setOnCheckedChangeListener(new NewChatViewHolder$onBind$1(newChat));
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            CheckBox checkBox2 = (CheckBox) view3.findViewById(C5619R.C5622id.cbInGroup);
            Intrinsics.checkNotNullExpressionValue(checkBox2, "itemView.cbInGroup");
            checkBox2.setChecked(newChat.getChecked());
        }
        View view4 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view4, "itemView");
        AppCompatImageView appCompatImageView = (AppCompatImageView) view4.findViewById(C5619R.C5622id.ivChatMuted);
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "itemView.ivChatMuted");
        appCompatImageView.setVisibility(8);
        View view5 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view5, "itemView");
        ImageView imageView = (ImageView) view5.findViewById(C5619R.C5622id.dialogLastMessageUserAvatar);
        Intrinsics.checkNotNullExpressionValue(imageView, "itemView.dialogLastMessageUserAvatar");
        imageView.setVisibility(8);
    }
}
