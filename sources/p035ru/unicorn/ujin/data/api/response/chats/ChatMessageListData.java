package p035ru.unicorn.ujin.data.api.response.chats;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.entities.chats.Message;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/chats/ChatMessageListData;", "", "messages", "", "Lru/unicorn/ujin/data/entities/chats/Message;", "(Ljava/util/List;)V", "getMessages", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.chats.ChatMessageListData */
/* compiled from: GetChatMessageListResponse.kt */
public final class ChatMessageListData {
    private final List<Message> messages;

    public static /* synthetic */ ChatMessageListData copy$default(ChatMessageListData chatMessageListData, List<Message> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chatMessageListData.messages;
        }
        return chatMessageListData.copy(list);
    }

    public final List<Message> component1() {
        return this.messages;
    }

    public final ChatMessageListData copy(List<Message> list) {
        Intrinsics.checkNotNullParameter(list, "messages");
        return new ChatMessageListData(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ChatMessageListData) && Intrinsics.areEqual((Object) this.messages, (Object) ((ChatMessageListData) obj).messages);
        }
        return true;
    }

    public int hashCode() {
        List<Message> list = this.messages;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "ChatMessageListData(messages=" + this.messages + ")";
    }

    public ChatMessageListData(List<Message> list) {
        Intrinsics.checkNotNullParameter(list, "messages");
        this.messages = list;
    }

    public final List<Message> getMessages() {
        return this.messages;
    }
}
