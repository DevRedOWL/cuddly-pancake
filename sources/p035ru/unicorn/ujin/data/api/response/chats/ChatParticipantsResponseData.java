package p035ru.unicorn.ujin.data.api.response.chats;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.entities.chats.Author;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/chats/ChatParticipantsResponseData;", "", "members", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/data/entities/chats/Author;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getMembers", "()Ljava/util/ArrayList;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.chats.ChatParticipantsResponseData */
/* compiled from: ChatParticipantsResponse.kt */
public final class ChatParticipantsResponseData {
    private final ArrayList<Author> members;

    public ChatParticipantsResponseData(ArrayList<Author> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "members");
        this.members = arrayList;
    }

    public final ArrayList<Author> getMembers() {
        return this.members;
    }
}
