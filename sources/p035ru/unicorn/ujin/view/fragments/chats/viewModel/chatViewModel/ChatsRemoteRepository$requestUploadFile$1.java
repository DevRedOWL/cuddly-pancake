package p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.chats.FileUploadResponse;
import p035ru.unicorn.ujin.viewModel.events.RegisterGhostEvent;
import p035ru.unicorn.ujin.viewModel.events.chats.FileUploadEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/chats/FileUploadResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.ChatsRemoteRepository$requestUploadFile$1 */
/* compiled from: ChatsRemoteRepository.kt */
final class ChatsRemoteRepository$requestUploadFile$1<T> implements Consumer<FileUploadResponse> {
    final /* synthetic */ String $path;
    final /* synthetic */ ChatsRemoteRepository this$0;

    ChatsRemoteRepository$requestUploadFile$1(ChatsRemoteRepository chatsRemoteRepository, String str) {
        this.this$0 = chatsRemoteRepository;
        this.$path = str;
    }

    public final void accept(FileUploadResponse fileUploadResponse) {
        ChatsRemoteRepository chatsRemoteRepository = this.this$0;
        String ghostToken = fileUploadResponse.getGhostToken();
        if (ghostToken != null) {
            chatsRemoteRepository.getGhostRegisterSubject().onNext(new RegisterGhostEvent(ghostToken));
        }
        chatsRemoteRepository.getFileUploadSubject().onNext(new FileUploadEvent(fileUploadResponse.getError() == 0, fileUploadResponse.getMessage(), this.$path, fileUploadResponse.getData().getId()));
    }
}
