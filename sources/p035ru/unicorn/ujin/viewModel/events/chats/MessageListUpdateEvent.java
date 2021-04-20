package p035ru.unicorn.ujin.viewModel.events.chats;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.entities.chats.Message;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/viewModel/events/chats/MessageListUpdateEvent;", "", "success", "", "message", "", "messageList", "", "Lru/unicorn/ujin/data/entities/chats/Message;", "newMessages", "(ZLjava/lang/String;Ljava/util/List;Z)V", "getMessage", "()Ljava/lang/String;", "getMessageList", "()Ljava/util/List;", "getNewMessages", "()Z", "getSuccess", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.viewModel.events.chats.MessageListUpdateEvent */
/* compiled from: MessageListUpdateEvent.kt */
public final class MessageListUpdateEvent {
    private final String message;
    private final List<Message> messageList;
    private final boolean newMessages;
    private final boolean success;

    public MessageListUpdateEvent(boolean z, String str, List<Message> list, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "message");
        this.success = z;
        this.message = str;
        this.messageList = list;
        this.newMessages = z2;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<Message> getMessageList() {
        return this.messageList;
    }

    public final boolean getNewMessages() {
        return this.newMessages;
    }
}
