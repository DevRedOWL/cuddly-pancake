package p035ru.unicorn.ujin.view.fragments.chats.adapters.viewHolders;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.stfalcon.chatkit.messages.MessageHolders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.entities.chats.Message;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/adapters/viewHolders/CustomOutcomingMessageViewHolder;", "Lcom/stfalcon/chatkit/messages/MessageHolders$OutcomingTextMessageViewHolder;", "Lru/unicorn/ujin/data/entities/chats/Message;", "itemView", "Landroid/view/View;", "payload", "", "(Landroid/view/View;Ljava/lang/Object;)V", "onBind", "", "message", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.adapters.viewHolders.CustomOutcomingMessageViewHolder */
/* compiled from: CustomOutcomingMessageViewHolder.kt */
public final class CustomOutcomingMessageViewHolder extends MessageHolders.OutcomingTextMessageViewHolder<Message> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomOutcomingMessageViewHolder(View view, Object obj) {
        super(view, obj);
        Intrinsics.checkNotNullParameter(view, "itemView");
    }

    public void onBind(Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        super.onBind(message);
        if (message.getDeleted()) {
            TextView textView = this.text;
            TextView textView2 = this.time;
            Intrinsics.checkNotNullExpressionValue(textView2, "time");
            textView.setTypeface(textView2.getTypeface(), 2);
            TextView textView3 = this.text;
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
            textView3.setTextColor(context.getResources().getColor(R.color.textSecondary));
        }
    }
}
