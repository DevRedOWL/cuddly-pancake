package p035ru.unicorn.ujin.view.fragments.chats.adapters.viewHolders;

import android.view.View;
import android.widget.TextView;
import com.stfalcon.chatkit.messages.MessageHolders;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.entities.chats.Message;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/adapters/viewHolders/SystemMessageViewHolder;", "Lcom/stfalcon/chatkit/messages/MessageHolders$IncomingTextMessageViewHolder;", "Lru/unicorn/ujin/data/entities/chats/Message;", "itemView", "Landroid/view/View;", "payload", "", "(Landroid/view/View;Lkotlin/Unit;)V", "onBind", "message", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.adapters.viewHolders.SystemMessageViewHolder */
/* compiled from: SystemMessageViewHolder.kt */
public final class SystemMessageViewHolder extends MessageHolders.IncomingTextMessageViewHolder<Message> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SystemMessageViewHolder(View view, Unit unit) {
        super(view, unit);
        Intrinsics.checkNotNullParameter(view, "itemView");
    }

    public void onBind(Message message) {
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvSystemMessage);
        Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvSystemMessage");
        textView.setText(message != null ? message.getText() : null);
        this.itemView.setOnClickListener((View.OnClickListener) null);
        this.itemView.setOnLongClickListener((View.OnLongClickListener) null);
    }
}
