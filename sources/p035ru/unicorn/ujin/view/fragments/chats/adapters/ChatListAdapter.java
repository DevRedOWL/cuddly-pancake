package p035ru.unicorn.ujin.view.fragments.chats.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.stfalcon.chatkit.commons.ImageLoader;
import com.stfalcon.chatkit.commons.models.IDialog;
import com.stfalcon.chatkit.dialogs.DialogsListAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.Chat;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J$\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\f0\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/adapters/ChatListAdapter;", "Lcom/stfalcon/chatkit/dialogs/DialogsListAdapter;", "Lru/unicorn/ujin/data/realm/Chat;", "resourceId", "", "imageLoader", "Lcom/stfalcon/chatkit/commons/ImageLoader;", "(ILcom/stfalcon/chatkit/commons/ImageLoader;)V", "onBindViewHolder", "", "holder", "Lcom/stfalcon/chatkit/dialogs/DialogsListAdapter$BaseDialogViewHolder;", "Lcom/stfalcon/chatkit/commons/models/IDialog;", "position", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.adapters.ChatListAdapter */
/* compiled from: ChatListAdapter.kt */
public final class ChatListAdapter extends DialogsListAdapter<Chat> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatListAdapter(int i, ImageLoader imageLoader) {
        super(i, imageLoader);
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
    }

    public void onBindViewHolder(DialogsListAdapter.BaseDialogViewHolder<? extends IDialog<?>> baseDialogViewHolder, int i) {
        Intrinsics.checkNotNullParameter(baseDialogViewHolder, "holder");
        super.onBindViewHolder((DialogsListAdapter.BaseDialogViewHolder) baseDialogViewHolder, i);
        View view = baseDialogViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C5619R.C5622id.ivChatMuted);
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "holder.itemView.ivChatMuted");
        Object obj = this.items.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "items[position]");
        Boolean sound = ((Chat) obj).getSound();
        Intrinsics.checkNotNullExpressionValue(sound, "items[position].sound");
        appCompatImageView.setVisibility(sound.booleanValue() ? 8 : 0);
        View view2 = baseDialogViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "holder.itemView");
        ImageView imageView = (ImageView) view2.findViewById(C5619R.C5622id.dialogLastMessageUserAvatar);
        Intrinsics.checkNotNullExpressionValue(imageView, "holder.itemView.dialogLastMessageUserAvatar");
        imageView.setVisibility(8);
        View view3 = baseDialogViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "holder.itemView");
        ((TextView) view3.findViewById(C5619R.C5622id.dialogUnreadBubble)).setBackgroundResource(R.drawable.unread_bubble_background);
    }
}
