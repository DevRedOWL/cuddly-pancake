package p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Chat;
import p035ru.unicorn.ujin.data.repository.BaseLocalRepository;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nJ\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/viewModel/chatViewModel/ChatsLocalRepository;", "Lru/unicorn/ujin/data/repository/BaseLocalRepository;", "()V", "getChatById", "Lru/unicorn/ujin/data/realm/Chat;", "chatId", "", "saveChatList", "", "chatList", "", "setChatSound", "sound", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.ChatsLocalRepository */
/* compiled from: ChatsLocalRepository.kt */
public final class ChatsLocalRepository extends BaseLocalRepository {
    public final void saveChatList(List<? extends Chat> list) {
        Intrinsics.checkNotNullParameter(list, "chatList");
        getRealm().executeTransaction(new ChatsLocalRepository$saveChatList$1(list));
    }

    public final Chat getChatById(String str) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        return (Chat) getRealm().where(Chat.class).equalTo("id", str).findFirst();
    }

    public final void setChatSound(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        getRealm().executeTransaction(new ChatsLocalRepository$setChatSound$1(this, str, z));
    }
}
