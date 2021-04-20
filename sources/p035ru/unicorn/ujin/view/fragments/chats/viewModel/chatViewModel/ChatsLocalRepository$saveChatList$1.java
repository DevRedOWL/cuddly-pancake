package p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import p035ru.unicorn.ujin.data.realm.Chat;
import p046io.realm.Realm;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "execute"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.ChatsLocalRepository$saveChatList$1 */
/* compiled from: ChatsLocalRepository.kt */
final class ChatsLocalRepository$saveChatList$1 implements Realm.Transaction {
    final /* synthetic */ List $chatList;

    ChatsLocalRepository$saveChatList$1(List list) {
        this.$chatList = list;
    }

    public final void execute(Realm realm) {
        Iterable<Chat> iterable = this.$chatList;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Chat insertOrUpdate : iterable) {
            realm.insertOrUpdate((RealmModel) insertOrUpdate);
            arrayList.add(Unit.INSTANCE);
        }
        List list = (List) arrayList;
    }
}
