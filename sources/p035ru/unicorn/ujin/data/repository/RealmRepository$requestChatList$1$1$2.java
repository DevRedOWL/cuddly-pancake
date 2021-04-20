package p035ru.unicorn.ujin.data.repository;

import java.util.Iterator;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Chat;
import p035ru.unicorn.ujin.data.realm.ChatListResponseData;
import p046io.realm.Realm;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "execute"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.RealmRepository$requestChatList$1$1$2 */
/* compiled from: RealmRepository.kt */
final class RealmRepository$requestChatList$1$1$2 implements Realm.Transaction {
    final /* synthetic */ ChatListResponseData $responseData;

    RealmRepository$requestChatList$1$1$2(ChatListResponseData chatListResponseData) {
        this.$responseData = chatListResponseData;
    }

    public final void execute(Realm realm) {
        realm.delete(Chat.class);
        Iterator<Chat> it = this.$responseData.getChatList().iterator();
        while (it.hasNext()) {
            realm.insertOrUpdate((RealmModel) it.next());
        }
    }
}
