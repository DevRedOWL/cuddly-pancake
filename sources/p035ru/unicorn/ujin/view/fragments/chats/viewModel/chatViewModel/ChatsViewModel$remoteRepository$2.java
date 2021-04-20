package p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/view/fragments/chats/viewModel/chatViewModel/ChatsRemoteRepository;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.ChatsViewModel$remoteRepository$2 */
/* compiled from: ChatsViewModel.kt */
final class ChatsViewModel$remoteRepository$2 extends Lambda implements Function0<ChatsRemoteRepository> {
    public static final ChatsViewModel$remoteRepository$2 INSTANCE = new ChatsViewModel$remoteRepository$2();

    ChatsViewModel$remoteRepository$2() {
        super(0);
    }

    public final ChatsRemoteRepository invoke() {
        return new ChatsRemoteRepository();
    }
}
