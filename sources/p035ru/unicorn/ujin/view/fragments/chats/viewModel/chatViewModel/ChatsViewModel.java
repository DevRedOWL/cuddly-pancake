package p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.entities.chats.Message;
import p035ru.unicorn.ujin.data.realm.Chat;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.viewModel.SingleLiveEvent;
import p035ru.unicorn.ujin.viewModel.events.PollEvent;
import p035ru.unicorn.ujin.viewModel.events.PollListEvent;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p035ru.unicorn.ujin.viewModel.events.chats.ChatEvent;
import p035ru.unicorn.ujin.viewModel.events.chats.ChatListEvent;
import p035ru.unicorn.ujin.viewModel.events.chats.ChatParticipantEvent;
import p035ru.unicorn.ujin.viewModel.events.chats.ContactsFoundEvent;
import p035ru.unicorn.ujin.viewModel.events.chats.EvaluateTicketEvent;
import p035ru.unicorn.ujin.viewModel.events.chats.FileUploadEvent;
import p035ru.unicorn.ujin.viewModel.events.chats.MessageDeleteEvent;
import p035ru.unicorn.ujin.viewModel.events.chats.MessageListUpdateEvent;
import p042cz.msebera.android.httpclient.cookie.ClientCookie;
import p046io.reactivex.disposables.CompositeDisposable;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010G\u001a\u00020\fJ\u0006\u0010H\u001a\u00020IJ\b\u0010J\u001a\u00020KH\u0014J\u0016\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020C2\u0006\u0010G\u001a\u00020\fJ\u000e\u0010N\u001a\u00020K2\u0006\u0010G\u001a\u00020\fJ%\u0010O\u001a\u00020K2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020Q2\b\u0010S\u001a\u0004\u0018\u00010Q¢\u0006\u0002\u0010TJ\u000e\u0010U\u001a\u00020K2\u0006\u0010G\u001a\u00020\fJ\u000e\u0010V\u001a\u00020K2\u0006\u0010W\u001a\u00020\fJ\u0016\u0010X\u001a\u00020K2\u0006\u0010Y\u001a\u00020\f2\u0006\u0010Z\u001a\u00020\fJ\u000e\u0010[\u001a\u00020K2\u0006\u0010G\u001a\u00020\fJ\u000e\u0010\\\u001a\u00020K2\u0006\u0010]\u001a\u00020^J\u000e\u0010_\u001a\u00020K2\u0006\u0010G\u001a\u00020\fJ\u000e\u0010`\u001a\u00020K2\u0006\u0010G\u001a\u00020\fJ&\u0010a\u001a\u00020K2\u0006\u0010G\u001a\u00020\f2\u0006\u0010R\u001a\u00020Q2\u0006\u0010P\u001a\u00020Q2\u0006\u0010b\u001a\u00020CJ\u000e\u0010c\u001a\u00020K2\u0006\u0010d\u001a\u00020QJ\u0006\u0010e\u001a\u00020KJ\u0016\u0010f\u001a\u00020K2\u0006\u0010d\u001a\u00020Q2\u0006\u0010g\u001a\u00020QJ\u0016\u0010h\u001a\u00020K2\u0006\u0010i\u001a\u00020\f2\u0006\u0010Y\u001a\u00020\fJ6\u0010j\u001a\u00020K2\u0006\u0010G\u001a\u00020\f2\u0006\u0010k\u001a\u00020\f2\u0006\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020m2\u0006\u0010o\u001a\u00020\f2\u0006\u0010p\u001a\u00020\fJ\u001e\u0010q\u001a\u00020K2\u0006\u0010r\u001a\u00020\f2\u0006\u0010s\u001a\u00020\f2\u0006\u0010t\u001a\u00020\fJ\u0016\u0010u\u001a\u00020K2\u0006\u0010G\u001a\u00020\f2\u0006\u0010v\u001a\u00020CR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0016¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u001b\u0010)\u001a\u00020*8BX\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b+\u0010,R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0007R\u0017\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0016¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0019R\u0017\u00105\u001a\b\u0012\u0004\u0012\u0002060\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0007R\u0017\u00108\u001a\b\u0012\u0004\u0012\u0002090\u0016¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0019R\u001b\u0010;\u001a\u00020<8BX\u0002¢\u0006\f\n\u0004\b?\u0010.\u001a\u0004\b=\u0010>R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0007R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0007¨\u0006w"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/viewModel/chatViewModel/ChatsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "chatCreateLiveData", "Lru/unicorn/ujin/viewModel/SingleLiveEvent;", "Lru/unicorn/ujin/viewModel/events/chats/ChatEvent;", "getChatCreateLiveData", "()Lru/unicorn/ujin/viewModel/SingleLiveEvent;", "chatDeleteLiveData", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "getChatDeleteLiveData", "chatErrorMessageLiveData", "", "getChatErrorMessageLiveData", "chatExitMutableLiveData", "getChatExitMutableLiveData", "chatListMutableLiveData", "Lru/unicorn/ujin/viewModel/events/chats/ChatListEvent;", "getChatListMutableLiveData", "chatMutableLiveData", "getChatMutableLiveData", "chatParticipantsMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lru/unicorn/ujin/viewModel/events/chats/ChatParticipantEvent;", "getChatParticipantsMutableLiveData", "()Landroidx/lifecycle/MutableLiveData;", "chatRenameMutableLiveData", "getChatRenameMutableLiveData", "chatSettingsMutableLiveData", "getChatSettingsMutableLiveData", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "contactsFoundLiveData", "Lru/unicorn/ujin/viewModel/events/chats/ContactsFoundEvent;", "getContactsFoundLiveData", "evaluateTicketLiveData", "Lru/unicorn/ujin/viewModel/events/chats/EvaluateTicketEvent;", "getEvaluateTicketLiveData", "fileUploadMutableLiveData", "Lru/unicorn/ujin/viewModel/events/chats/FileUploadEvent;", "getFileUploadMutableLiveData", "localRepository", "Lru/unicorn/ujin/view/fragments/chats/viewModel/chatViewModel/ChatsLocalRepository;", "getLocalRepository", "()Lru/unicorn/ujin/view/fragments/chats/viewModel/chatViewModel/ChatsLocalRepository;", "localRepository$delegate", "Lkotlin/Lazy;", "messageDeleteMutableLiveData", "Lru/unicorn/ujin/viewModel/events/chats/MessageDeleteEvent;", "getMessageDeleteMutableLiveData", "messageListEvent", "Lru/unicorn/ujin/viewModel/events/chats/MessageListUpdateEvent;", "getMessageListEvent", "pollListMutableLiveData", "Lru/unicorn/ujin/viewModel/events/PollListEvent;", "getPollListMutableLiveData", "pollMutableLiveData", "Lru/unicorn/ujin/viewModel/events/PollEvent;", "getPollMutableLiveData", "remoteRepository", "Lru/unicorn/ujin/view/fragments/chats/viewModel/chatViewModel/ChatsRemoteRepository;", "getRemoteRepository", "()Lru/unicorn/ujin/view/fragments/chats/viewModel/chatViewModel/ChatsRemoteRepository;", "remoteRepository$delegate", "sendMessageEvent", "getSendMessageEvent", "showProgressLiveData", "", "getShowProgressLiveData", "getChatById", "Lru/unicorn/ujin/data/realm/Chat;", "chatId", "getUser", "Lru/unicorn/ujin/data/realm/profile/User;", "onCleared", "", "requestChangeChatSettings", "checked", "requestChatById", "requestChatList", "offset", "", "limit", "serviceType", "(IILjava/lang/Integer;)V", "requestChatParticipants", "requestContactsList", "search", "requestCreateChat", "title", "users", "requestDeleteChat", "requestDeleteMessage", "message", "Lru/unicorn/ujin/data/entities/chats/Message;", "requestExitChat", "requestMarkChatAsRead", "requestMessageList", "newMessages", "requestPoll", "pollId", "requestPollList", "requestPollVote", "pollOptionId", "requestRenameChat", "id", "requestSendMessage", "text", "latitude", "", "longitude", "fcmToken", "files", "requestUploadFile", "base64", "fileName", "path", "setChatSound", "sound", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.ChatsViewModel */
/* compiled from: ChatsViewModel.kt */
public final class ChatsViewModel extends ViewModel {
    private final SingleLiveEvent<ChatEvent> chatCreateLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<UpdateEvent> chatDeleteLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<String> chatErrorMessageLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<UpdateEvent> chatExitMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<ChatListEvent> chatListMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<ChatEvent> chatMutableLiveData = new SingleLiveEvent<>();
    private final MutableLiveData<ChatParticipantEvent> chatParticipantsMutableLiveData = new MutableLiveData<>();
    private final SingleLiveEvent<UpdateEvent> chatRenameMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<UpdateEvent> chatSettingsMutableLiveData = new SingleLiveEvent<>();
    private final CompositeDisposable compositeDisposable = new CompositeDisposable();
    private final MutableLiveData<ContactsFoundEvent> contactsFoundLiveData = new MutableLiveData<>();
    private final SingleLiveEvent<EvaluateTicketEvent> evaluateTicketLiveData = new SingleLiveEvent<>();
    private final MutableLiveData<FileUploadEvent> fileUploadMutableLiveData = new MutableLiveData<>();
    private final Lazy localRepository$delegate = LazyKt.lazy(ChatsViewModel$localRepository$2.INSTANCE);
    private final SingleLiveEvent<MessageDeleteEvent> messageDeleteMutableLiveData = new SingleLiveEvent<>();
    private final MutableLiveData<MessageListUpdateEvent> messageListEvent = new MutableLiveData<>();
    private final SingleLiveEvent<PollListEvent> pollListMutableLiveData = new SingleLiveEvent<>();
    private final MutableLiveData<PollEvent> pollMutableLiveData = new MutableLiveData<>();
    private final Lazy remoteRepository$delegate = LazyKt.lazy(ChatsViewModel$remoteRepository$2.INSTANCE);
    private final SingleLiveEvent<UpdateEvent> sendMessageEvent = new SingleLiveEvent<>();
    private final SingleLiveEvent<Boolean> showProgressLiveData = new SingleLiveEvent<>();

    /* access modifiers changed from: private */
    public final ChatsLocalRepository getLocalRepository() {
        return (ChatsLocalRepository) this.localRepository$delegate.getValue();
    }

    private final ChatsRemoteRepository getRemoteRepository() {
        return (ChatsRemoteRepository) this.remoteRepository$delegate.getValue();
    }

    public ChatsViewModel() {
        this.compositeDisposable.addAll(getRemoteRepository().getChatCreateSubject().subscribe(new Consumer<ChatEvent>(this) {
            final /* synthetic */ ChatsViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(ChatEvent chatEvent) {
                ChatsViewModel chatsViewModel = this.this$0;
                chatsViewModel.getShowProgressLiveData().setValue(false);
                chatsViewModel.getChatCreateLiveData().setValue(chatEvent);
            }
        }), getRemoteRepository().getChatDeleteSubject().subscribe(new Consumer<UpdateEvent>(this) {
            final /* synthetic */ ChatsViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(UpdateEvent updateEvent) {
                ChatsViewModel chatsViewModel = this.this$0;
                chatsViewModel.getShowProgressLiveData().setValue(false);
                chatsViewModel.getChatDeleteLiveData().setValue(updateEvent);
            }
        }), getRemoteRepository().getChatListSubject().subscribe(new Consumer<ChatListEvent>(this) {
            final /* synthetic */ ChatsViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(ChatListEvent chatListEvent) {
                ChatsViewModel chatsViewModel = this.this$0;
                chatsViewModel.getShowProgressLiveData().setValue(false);
                chatsViewModel.getLocalRepository().saveChatList(chatListEvent.getChatList());
                chatsViewModel.getChatListMutableLiveData().setValue(chatListEvent);
            }
        }), getRemoteRepository().getContactsFoundSubject().subscribe(new Consumer<ContactsFoundEvent>(this) {
            final /* synthetic */ ChatsViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(ContactsFoundEvent contactsFoundEvent) {
                ChatsViewModel chatsViewModel = this.this$0;
                chatsViewModel.getShowProgressLiveData().setValue(false);
                chatsViewModel.getContactsFoundLiveData().setValue(contactsFoundEvent);
            }
        }), getRemoteRepository().getSendMessageSubject().subscribe(new Consumer<UpdateEvent>(this) {
            final /* synthetic */ ChatsViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(UpdateEvent updateEvent) {
                this.this$0.getSendMessageEvent().setValue(updateEvent);
            }
        }), getRemoteRepository().getMessageListSubject().subscribe(new Consumer<MessageListUpdateEvent>(this) {
            final /* synthetic */ ChatsViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(MessageListUpdateEvent messageListUpdateEvent) {
                ChatsViewModel chatsViewModel = this.this$0;
                chatsViewModel.getShowProgressLiveData().setValue(false);
                chatsViewModel.getMessageListEvent().setValue(messageListUpdateEvent);
            }
        }), getRemoteRepository().getFileUploadSubject().subscribe(new Consumer<FileUploadEvent>(this) {
            final /* synthetic */ ChatsViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(FileUploadEvent fileUploadEvent) {
                this.this$0.getFileUploadMutableLiveData().setValue(fileUploadEvent);
            }
        }), getRemoteRepository().getMessageDeleteSubject().subscribe(new Consumer<MessageDeleteEvent>(this) {
            final /* synthetic */ ChatsViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(MessageDeleteEvent messageDeleteEvent) {
                ChatsViewModel chatsViewModel = this.this$0;
                chatsViewModel.getShowProgressLiveData().setValue(false);
                chatsViewModel.getMessageDeleteMutableLiveData().setValue(messageDeleteEvent);
            }
        }), getRemoteRepository().getChatParticipantsSubject().subscribe(new Consumer<ChatParticipantEvent>(this) {
            final /* synthetic */ ChatsViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(ChatParticipantEvent chatParticipantEvent) {
                this.this$0.getChatParticipantsMutableLiveData().setValue(chatParticipantEvent);
            }
        }), getRemoteRepository().getChatRenameSubject().subscribe(new Consumer<UpdateEvent>(this) {
            final /* synthetic */ ChatsViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(UpdateEvent updateEvent) {
                ChatsViewModel chatsViewModel = this.this$0;
                chatsViewModel.getShowProgressLiveData().setValue(false);
                chatsViewModel.getChatRenameMutableLiveData().setValue(updateEvent);
            }
        }), getRemoteRepository().getChatExitSubject().subscribe(new Consumer<UpdateEvent>(this) {
            final /* synthetic */ ChatsViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(UpdateEvent updateEvent) {
                ChatsViewModel chatsViewModel = this.this$0;
                chatsViewModel.getShowProgressLiveData().setValue(false);
                chatsViewModel.getChatExitMutableLiveData().setValue(updateEvent);
            }
        }), getRemoteRepository().getChatSettingsSubject().subscribe(new Consumer<UpdateEvent>(this) {
            final /* synthetic */ ChatsViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(UpdateEvent updateEvent) {
                ChatsViewModel chatsViewModel = this.this$0;
                chatsViewModel.getShowProgressLiveData().setValue(false);
                chatsViewModel.getChatSettingsMutableLiveData().setValue(updateEvent);
            }
        }), getRemoteRepository().getChatSubject().subscribe(new Consumer<ChatEvent>(this) {
            final /* synthetic */ ChatsViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(ChatEvent chatEvent) {
                ChatsViewModel chatsViewModel = this.this$0;
                chatsViewModel.getShowProgressLiveData().setValue(false);
                Chat chat = chatEvent.getChat();
                if (chat != null) {
                    chatsViewModel.getLocalRepository().saveChatList(CollectionsKt.listOf(chat));
                }
                chatsViewModel.getChatMutableLiveData().setValue(chatEvent);
            }
        }), getRemoteRepository().getPollSubject().subscribe(new Consumer<PollEvent>(this) {
            final /* synthetic */ ChatsViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(PollEvent pollEvent) {
                ChatsViewModel chatsViewModel = this.this$0;
                chatsViewModel.getShowProgressLiveData().setValue(false);
                chatsViewModel.getPollMutableLiveData().setValue(pollEvent);
            }
        }), getRemoteRepository().getPollListSubject().subscribe(new Consumer<PollListEvent>(this) {
            final /* synthetic */ ChatsViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(PollListEvent pollListEvent) {
                ChatsViewModel chatsViewModel = this.this$0;
                chatsViewModel.getShowProgressLiveData().setValue(false);
                chatsViewModel.getPollListMutableLiveData().setValue(pollListEvent);
            }
        }), getRemoteRepository().getEvaluateTicketSubject().subscribe(new Consumer<EvaluateTicketEvent>(this) {
            final /* synthetic */ ChatsViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(EvaluateTicketEvent evaluateTicketEvent) {
                ChatsViewModel chatsViewModel = this.this$0;
                chatsViewModel.getShowProgressLiveData().setValue(false);
                chatsViewModel.getEvaluateTicketLiveData().setValue(evaluateTicketEvent);
            }
        }), getRemoteRepository().getErrorMessageSubject().subscribe(new Consumer<String>(this) {
            final /* synthetic */ ChatsViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(String str) {
                ChatsViewModel chatsViewModel = this.this$0;
                chatsViewModel.getShowProgressLiveData().setValue(false);
                chatsViewModel.getChatErrorMessageLiveData().setValue(str);
            }
        }));
    }

    public final SingleLiveEvent<ChatEvent> getChatCreateLiveData() {
        return this.chatCreateLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getChatDeleteLiveData() {
        return this.chatDeleteLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getSendMessageEvent() {
        return this.sendMessageEvent;
    }

    public final MutableLiveData<ContactsFoundEvent> getContactsFoundLiveData() {
        return this.contactsFoundLiveData;
    }

    public final MutableLiveData<MessageListUpdateEvent> getMessageListEvent() {
        return this.messageListEvent;
    }

    public final SingleLiveEvent<ChatListEvent> getChatListMutableLiveData() {
        return this.chatListMutableLiveData;
    }

    public final MutableLiveData<FileUploadEvent> getFileUploadMutableLiveData() {
        return this.fileUploadMutableLiveData;
    }

    public final SingleLiveEvent<MessageDeleteEvent> getMessageDeleteMutableLiveData() {
        return this.messageDeleteMutableLiveData;
    }

    public final MutableLiveData<ChatParticipantEvent> getChatParticipantsMutableLiveData() {
        return this.chatParticipantsMutableLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getChatRenameMutableLiveData() {
        return this.chatRenameMutableLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getChatExitMutableLiveData() {
        return this.chatExitMutableLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getChatSettingsMutableLiveData() {
        return this.chatSettingsMutableLiveData;
    }

    public final SingleLiveEvent<ChatEvent> getChatMutableLiveData() {
        return this.chatMutableLiveData;
    }

    public final SingleLiveEvent<String> getChatErrorMessageLiveData() {
        return this.chatErrorMessageLiveData;
    }

    public final MutableLiveData<PollEvent> getPollMutableLiveData() {
        return this.pollMutableLiveData;
    }

    public final SingleLiveEvent<PollListEvent> getPollListMutableLiveData() {
        return this.pollListMutableLiveData;
    }

    public final SingleLiveEvent<EvaluateTicketEvent> getEvaluateTicketLiveData() {
        return this.evaluateTicketLiveData;
    }

    public final SingleLiveEvent<Boolean> getShowProgressLiveData() {
        return this.showProgressLiveData;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        this.compositeDisposable.dispose();
        super.onCleared();
    }

    public final void requestChatList(int i, int i2, Integer num) {
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().requestChatList(i, i2, num);
    }

    public final void requestCreateChat(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "users");
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().requestCreateChat(str, str2);
    }

    public final void requestContactsList(String str) {
        Intrinsics.checkNotNullParameter(str, "search");
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().requestContactList(str);
    }

    public final void requestMessageList(String str, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        getRemoteRepository().requestChatMessageList(str, i, i2, z);
    }

    public final void requestSendMessage(String str, String str2, double d, double d2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        Intrinsics.checkNotNullParameter(str2, "text");
        String str5 = str3;
        Intrinsics.checkNotNullParameter(str5, "fcmToken");
        String str6 = str4;
        Intrinsics.checkNotNullParameter(str6, "files");
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().requestSendMessage(str, str2, d, d2, str5, str6);
    }

    public final void requestDeleteChat(String str) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().requestDeleteChat(str);
    }

    public final void requestUploadFile(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "base64");
        Intrinsics.checkNotNullParameter(str2, "fileName");
        Intrinsics.checkNotNullParameter(str3, ClientCookie.PATH_ATTR);
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().requestUploadFile(str, str2, str3);
    }

    public final void requestDeleteMessage(Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().requestDeleteMessage(message);
    }

    public final void requestChatParticipants(String str) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        getRemoteRepository().requestChatParticipants(str);
    }

    public final User getUser() {
        return getRemoteRepository().getUser();
    }

    public final void requestRenameChat(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "title");
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().requestRenameChat(str, str2);
    }

    public final void requestExitChat(String str) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().requestExitChat(str);
    }

    public final void requestChangeChatSettings(boolean z, String str) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().requestChangeChatSettings(z, str);
    }

    public final void requestChatById(String str) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        getRemoteRepository().requestChatById(str);
    }

    public final Chat getChatById(String str) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        return getLocalRepository().getChatById(str);
    }

    public final void setChatSound(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        getLocalRepository().setChatSound(str, z);
    }

    public final void requestMarkChatAsRead(String str) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        getRemoteRepository().requestMarkChatAsRead(str);
    }

    public final void requestPoll(int i) {
        getRemoteRepository().requestPoll(i);
    }

    public final void requestPollVote(int i, int i2) {
        getRemoteRepository().requestPollVote(i, i2);
    }

    public final void requestPollList() {
        getRemoteRepository().requestPollList();
    }
}
