package p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel;

import android.content.Context;
import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.MainApplication;
import p035ru.unicorn.ujin.data.entities.chats.Message;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.viewModel.events.PollEvent;
import p035ru.unicorn.ujin.viewModel.events.PollListEvent;
import p035ru.unicorn.ujin.viewModel.events.RegisterGhostEvent;
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
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.schedulers.Schedulers;
import p046io.reactivex.subjects.BehaviorSubject;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\t\u0018\u0000 h2\u00020\u0001:\u0001hB\u0005¢\u0006\u0002\u0010\u0002J\u001e\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u001eJ\u0016\u0010?\u001a\u00020:2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u001eJ\u000e\u0010C\u001a\u00020:2\u0006\u0010B\u001a\u00020\u001eJ%\u0010D\u001a\u00020:2\u0006\u0010E\u001a\u00020=2\u0006\u0010F\u001a\u00020=2\b\u0010G\u001a\u0004\u0018\u00010=¢\u0006\u0002\u0010HJ&\u0010I\u001a\u00020:2\u0006\u0010B\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020=2\u0006\u0010E\u001a\u00020=2\u0006\u0010J\u001a\u00020AJ\u000e\u0010K\u001a\u00020:2\u0006\u0010B\u001a\u00020\u001eJ\u000e\u0010L\u001a\u00020:2\u0006\u0010M\u001a\u00020\u001eJ\u0016\u0010N\u001a\u00020:2\u0006\u0010O\u001a\u00020\u001e2\u0006\u0010P\u001a\u00020\u001eJ\u000e\u0010Q\u001a\u00020:2\u0006\u0010B\u001a\u00020\u001eJ\u000e\u0010R\u001a\u00020:2\u0006\u0010S\u001a\u00020TJ\u000e\u0010U\u001a\u00020:2\u0006\u0010B\u001a\u00020\u001eJ\u000e\u0010V\u001a\u00020:2\u0006\u0010B\u001a\u00020\u001eJ\u000e\u0010W\u001a\u00020:2\u0006\u0010X\u001a\u00020=J\u0006\u0010Y\u001a\u00020:J\u0016\u0010Z\u001a\u00020:2\u0006\u0010X\u001a\u00020=2\u0006\u0010[\u001a\u00020=J\u0016\u0010\\\u001a\u00020:2\u0006\u0010;\u001a\u00020\u001e2\u0006\u0010O\u001a\u00020\u001eJ6\u0010]\u001a\u00020:2\u0006\u0010B\u001a\u00020\u001e2\u0006\u0010^\u001a\u00020\u001e2\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020\u001e2\u0006\u0010c\u001a\u00020\u001eJ\u001e\u0010d\u001a\u00020:2\u0006\u0010e\u001a\u00020\u001e2\u0006\u0010f\u001a\u00020\u001e2\u0006\u0010g\u001a\u00020\u001eR5\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR5\u0010\t\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR5\u0010\f\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR5\u0010\u000e\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000f0\u000f \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR5\u0010\u0011\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00120\u0012 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00120\u0012\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR5\u0010\u0014\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\bR5\u0010\u0016\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\bR5\u0010\u0018\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\bR5\u0010\u001a\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u001b0\u001b \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u001b0\u001b\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR5\u0010\u001d\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u001e0\u001e \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u001e0\u001e\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\bR5\u0010 \u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010!0! \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010!0!\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\bR5\u0010#\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010%0% \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010%0%\u0018\u00010$0$¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R5\u0010(\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010)0) \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010)0)\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\bR5\u0010+\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010,0, \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010,0,\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\bR5\u0010.\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010/0/ \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010/0/\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\bR5\u00101\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010202 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010202\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\bR5\u00104\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010505 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010505\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\bR5\u00107\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\b¨\u0006i"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/viewModel/chatViewModel/ChatsRemoteRepository;", "Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "()V", "chatCreateSubject", "Lio/reactivex/subjects/PublishSubject;", "Lru/unicorn/ujin/viewModel/events/chats/ChatEvent;", "kotlin.jvm.PlatformType", "getChatCreateSubject", "()Lio/reactivex/subjects/PublishSubject;", "chatDeleteSubject", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "getChatDeleteSubject", "chatExitSubject", "getChatExitSubject", "chatListSubject", "Lru/unicorn/ujin/viewModel/events/chats/ChatListEvent;", "getChatListSubject", "chatParticipantsSubject", "Lru/unicorn/ujin/viewModel/events/chats/ChatParticipantEvent;", "getChatParticipantsSubject", "chatRenameSubject", "getChatRenameSubject", "chatSettingsSubject", "getChatSettingsSubject", "chatSubject", "getChatSubject", "contactsFoundSubject", "Lru/unicorn/ujin/viewModel/events/chats/ContactsFoundEvent;", "getContactsFoundSubject", "errorMessageSubject", "", "getErrorMessageSubject", "evaluateTicketSubject", "Lru/unicorn/ujin/viewModel/events/chats/EvaluateTicketEvent;", "getEvaluateTicketSubject", "fileUploadSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lru/unicorn/ujin/viewModel/events/chats/FileUploadEvent;", "getFileUploadSubject", "()Lio/reactivex/subjects/BehaviorSubject;", "ghostRegisterSubject", "Lru/unicorn/ujin/viewModel/events/RegisterGhostEvent;", "getGhostRegisterSubject", "messageDeleteSubject", "Lru/unicorn/ujin/viewModel/events/chats/MessageDeleteEvent;", "getMessageDeleteSubject", "messageListSubject", "Lru/unicorn/ujin/viewModel/events/chats/MessageListUpdateEvent;", "getMessageListSubject", "pollListSubject", "Lru/unicorn/ujin/viewModel/events/PollListEvent;", "getPollListSubject", "pollSubject", "Lru/unicorn/ujin/viewModel/events/PollEvent;", "getPollSubject", "sendMessageSubject", "getSendMessageSubject", "evaluateTicket", "", "id", "rating", "", "comment", "requestChangeChatSettings", "checked", "", "chatId", "requestChatById", "requestChatList", "offset", "limit", "serviceType", "(IILjava/lang/Integer;)V", "requestChatMessageList", "newMessages", "requestChatParticipants", "requestContactList", "search", "requestCreateChat", "title", "users", "requestDeleteChat", "requestDeleteMessage", "message", "Lru/unicorn/ujin/data/entities/chats/Message;", "requestExitChat", "requestMarkChatAsRead", "requestPoll", "pollId", "requestPollList", "requestPollVote", "pollOptionId", "requestRenameChat", "requestSendMessage", "text", "latitude", "", "longitude", "fcmToken", "files", "requestUploadFile", "base64", "fileName", "path", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.ChatsRemoteRepository */
/* compiled from: ChatsRemoteRepository.kt */
public final class ChatsRemoteRepository extends BaseRemoteRepository {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String UNABLE_TO_DELETE_MESSAGE;
    /* access modifiers changed from: private */
    public static final String UNABLE_TO_LOAD_CHAT_LIST;
    /* access modifiers changed from: private */
    public static final String UNABLE_TO_LOAD_MESSAGE_LIST;
    /* access modifiers changed from: private */
    public static final String UNABLE_TO_RENAME_MESSAGE;
    private final PublishSubject<ChatEvent> chatCreateSubject = PublishSubject.create();
    private final PublishSubject<UpdateEvent> chatDeleteSubject = PublishSubject.create();
    private final PublishSubject<UpdateEvent> chatExitSubject = PublishSubject.create();
    private final PublishSubject<ChatListEvent> chatListSubject = PublishSubject.create();
    private final PublishSubject<ChatParticipantEvent> chatParticipantsSubject = PublishSubject.create();
    private final PublishSubject<UpdateEvent> chatRenameSubject = PublishSubject.create();
    private final PublishSubject<UpdateEvent> chatSettingsSubject = PublishSubject.create();
    private final PublishSubject<ChatEvent> chatSubject = PublishSubject.create();
    private final PublishSubject<ContactsFoundEvent> contactsFoundSubject = PublishSubject.create();
    private final PublishSubject<String> errorMessageSubject = PublishSubject.create();
    private final PublishSubject<EvaluateTicketEvent> evaluateTicketSubject = PublishSubject.create();
    private final BehaviorSubject<FileUploadEvent> fileUploadSubject = BehaviorSubject.create();
    private final PublishSubject<RegisterGhostEvent> ghostRegisterSubject = PublishSubject.create();
    private final PublishSubject<MessageDeleteEvent> messageDeleteSubject = PublishSubject.create();
    private final PublishSubject<MessageListUpdateEvent> messageListSubject = PublishSubject.create();
    private final PublishSubject<PollListEvent> pollListSubject = PublishSubject.create();
    private final PublishSubject<PollEvent> pollSubject = PublishSubject.create();
    private final PublishSubject<UpdateEvent> sendMessageSubject = PublishSubject.create();

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/viewModel/chatViewModel/ChatsRemoteRepository$Companion;", "", "()V", "UNABLE_TO_DELETE_MESSAGE", "", "getUNABLE_TO_DELETE_MESSAGE", "()Ljava/lang/String;", "UNABLE_TO_LOAD_CHAT_LIST", "getUNABLE_TO_LOAD_CHAT_LIST", "UNABLE_TO_LOAD_MESSAGE_LIST", "getUNABLE_TO_LOAD_MESSAGE_LIST", "UNABLE_TO_RENAME_MESSAGE", "getUNABLE_TO_RENAME_MESSAGE", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.ChatsRemoteRepository$Companion */
    /* compiled from: ChatsRemoteRepository.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getUNABLE_TO_LOAD_CHAT_LIST() {
            return ChatsRemoteRepository.UNABLE_TO_LOAD_CHAT_LIST;
        }

        public final String getUNABLE_TO_DELETE_MESSAGE() {
            return ChatsRemoteRepository.UNABLE_TO_DELETE_MESSAGE;
        }

        public final String getUNABLE_TO_RENAME_MESSAGE() {
            return ChatsRemoteRepository.UNABLE_TO_RENAME_MESSAGE;
        }

        public final String getUNABLE_TO_LOAD_MESSAGE_LIST() {
            return ChatsRemoteRepository.UNABLE_TO_LOAD_MESSAGE_LIST;
        }
    }

    static {
        String str;
        String str2;
        String str3;
        String str4;
        Resources resources;
        Resources resources2;
        Resources resources3;
        Resources resources4;
        Context context = MainApplication.mContext;
        if (context == null || (resources4 = context.getResources()) == null || (str = resources4.getString(R.string.unable_to_load_chat_list)) == null) {
            str = "";
        }
        Intrinsics.checkNotNullExpressionValue(str, "MainApplication.mContext…st)\n                ?: \"\"");
        UNABLE_TO_LOAD_CHAT_LIST = str;
        Context context2 = MainApplication.mContext;
        if (context2 == null || (resources3 = context2.getResources()) == null || (str2 = resources3.getString(R.string.unable_to_delete_message)) == null) {
            str2 = "";
        }
        Intrinsics.checkNotNullExpressionValue(str2, "MainApplication.mContext…ge)\n                ?: \"\"");
        UNABLE_TO_DELETE_MESSAGE = str2;
        Context context3 = MainApplication.mContext;
        if (context3 == null || (resources2 = context3.getResources()) == null || (str3 = resources2.getString(R.string.unable_to_rename_message)) == null) {
            str3 = "";
        }
        Intrinsics.checkNotNullExpressionValue(str3, "MainApplication.mContext…ge)\n                ?: \"\"");
        UNABLE_TO_RENAME_MESSAGE = str3;
        Context context4 = MainApplication.mContext;
        if (context4 == null || (resources = context4.getResources()) == null || (str4 = resources.getString(R.string.unable_to_load_message_list)) == null) {
            str4 = "";
        }
        Intrinsics.checkNotNullExpressionValue(str4, "MainApplication.mContext…st)\n                ?: \"\"");
        UNABLE_TO_LOAD_MESSAGE_LIST = str4;
    }

    public final PublishSubject<RegisterGhostEvent> getGhostRegisterSubject() {
        return this.ghostRegisterSubject;
    }

    public final PublishSubject<MessageListUpdateEvent> getMessageListSubject() {
        return this.messageListSubject;
    }

    public final PublishSubject<UpdateEvent> getSendMessageSubject() {
        return this.sendMessageSubject;
    }

    public final PublishSubject<ContactsFoundEvent> getContactsFoundSubject() {
        return this.contactsFoundSubject;
    }

    public final PublishSubject<UpdateEvent> getChatDeleteSubject() {
        return this.chatDeleteSubject;
    }

    public final PublishSubject<ChatEvent> getChatCreateSubject() {
        return this.chatCreateSubject;
    }

    public final PublishSubject<ChatListEvent> getChatListSubject() {
        return this.chatListSubject;
    }

    public final BehaviorSubject<FileUploadEvent> getFileUploadSubject() {
        return this.fileUploadSubject;
    }

    public final PublishSubject<MessageDeleteEvent> getMessageDeleteSubject() {
        return this.messageDeleteSubject;
    }

    public final PublishSubject<ChatParticipantEvent> getChatParticipantsSubject() {
        return this.chatParticipantsSubject;
    }

    public final PublishSubject<UpdateEvent> getChatRenameSubject() {
        return this.chatRenameSubject;
    }

    public final PublishSubject<UpdateEvent> getChatExitSubject() {
        return this.chatExitSubject;
    }

    public final PublishSubject<UpdateEvent> getChatSettingsSubject() {
        return this.chatSettingsSubject;
    }

    public final PublishSubject<ChatEvent> getChatSubject() {
        return this.chatSubject;
    }

    public final PublishSubject<String> getErrorMessageSubject() {
        return this.errorMessageSubject;
    }

    public final PublishSubject<PollEvent> getPollSubject() {
        return this.pollSubject;
    }

    public final PublishSubject<PollListEvent> getPollListSubject() {
        return this.pollListSubject;
    }

    public final PublishSubject<EvaluateTicketEvent> getEvaluateTicketSubject() {
        return this.evaluateTicketSubject;
    }

    public final void requestChatMessageList(String str, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        getApi().getChatMessages(getAppName(), getToken(), str, i, i2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ChatsRemoteRepository$requestChatMessageList$1(this, z), new ChatsRemoteRepository$requestChatMessageList$2(this, z));
    }

    public final void requestSendMessage(String str, String str2, double d, double d2, String str3, String str4) {
        String str5 = str;
        Intrinsics.checkNotNullParameter(str, "chatId");
        Intrinsics.checkNotNullParameter(str2, "text");
        String str6 = str3;
        Intrinsics.checkNotNullParameter(str6, "fcmToken");
        String str7 = str4;
        Intrinsics.checkNotNullParameter(str7, "files");
        getApi().sendMessage(getAppName(), getToken(), str, str2, d, d2, str6, str7).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ChatsRemoteRepository$requestSendMessage$1(this, str), new ChatsRemoteRepository$requestSendMessage$2(this));
    }

    public final void requestUploadFile(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "base64");
        Intrinsics.checkNotNullParameter(str2, "fileName");
        Intrinsics.checkNotNullParameter(str3, ClientCookie.PATH_ATTR);
        getApi().uploadFile(getAppName(), getToken(), str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ChatsRemoteRepository$requestUploadFile$1(this, str3), new ChatsRemoteRepository$requestUploadFile$2(this));
    }

    public final void requestContactList(String str) {
        Intrinsics.checkNotNullParameter(str, "search");
        getApi().searchContacts(getAppName(), getToken(), str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ChatsRemoteRepository$requestContactList$1(this), new ChatsRemoteRepository$requestContactList$2(this));
    }

    public final void requestDeleteChat(String str) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        getApi().deleteChat(getAppName(), getToken(), str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ChatsRemoteRepository$requestDeleteChat$1(this), new ChatsRemoteRepository$requestDeleteChat$2(this));
    }

    public final void requestCreateChat(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "users");
        getApi().createChat(getAppName(), getToken(), str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ChatsRemoteRepository$requestCreateChat$1(this), new ChatsRemoteRepository$requestCreateChat$2(this));
    }

    public final void requestChatList(int i, int i2, Integer num) {
        getApi().getChatList(getAppName(), getToken(), num).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ChatsRemoteRepository$requestChatList$1(this), new ChatsRemoteRepository$requestChatList$2(this));
    }

    public final void requestDeleteMessage(Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        getApi().deleteMessage(getAppName(), getToken(), Integer.valueOf(message.getId())).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ChatsRemoteRepository$requestDeleteMessage$1(this, message), new ChatsRemoteRepository$requestDeleteMessage$2(this));
    }

    public final void requestChatParticipants(String str) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        getApi().getChatMembers(getAppName(), getToken(), str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ChatsRemoteRepository$requestChatParticipants$1(this), new ChatsRemoteRepository$requestChatParticipants$2(this));
    }

    public final void requestRenameChat(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "title");
        getApi().renameChat(getAppName(), getToken(), str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ChatsRemoteRepository$requestRenameChat$1(this), new ChatsRemoteRepository$requestRenameChat$2(this));
    }

    public final void requestExitChat(String str) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        getApi().exitChat(getAppName(), getToken(), str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ChatsRemoteRepository$requestExitChat$1(this), new ChatsRemoteRepository$requestExitChat$2(this));
    }

    public final void requestChangeChatSettings(boolean z, String str) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        getApi().setChatNotificationSettings(getAppName(), getToken(), str, z, true).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ChatsRemoteRepository$requestChangeChatSettings$1(this), new ChatsRemoteRepository$requestChangeChatSettings$2(this));
    }

    public final void requestChatById(String str) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        getApi().getChatById(getAppName(), getToken(), str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ChatsRemoteRepository$requestChatById$1(this), new ChatsRemoteRepository$requestChatById$2(this));
    }

    public final void requestMarkChatAsRead(String str) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        getApi().setChatAsRead(getAppName(), getToken(), str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ChatsRemoteRepository$requestMarkChatAsRead$1(this), ChatsRemoteRepository$requestMarkChatAsRead$2.INSTANCE);
    }

    public final void requestPoll(int i) {
        getApi().getPoll(getAppName(), getToken(), i).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ChatsRemoteRepository$requestPoll$1(this), ChatsRemoteRepository$requestPoll$2.INSTANCE);
    }

    public final void requestPollVote(int i, int i2) {
        getApi().votePoll(getAppName(), getToken(), i2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ChatsRemoteRepository$requestPollVote$1(this, i), ChatsRemoteRepository$requestPollVote$2.INSTANCE);
    }

    public final void requestPollList() {
        getApi().getMyPolls(getAppName(), getToken()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ChatsRemoteRepository$requestPollList$1(this), ChatsRemoteRepository$requestPollList$2.INSTANCE);
    }

    public final void evaluateTicket(String str, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "comment");
        getApi().evaluateTicket(getToken(), str, i, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ChatsRemoteRepository$evaluateTicket$1(this), new ChatsRemoteRepository$evaluateTicket$2(this));
    }
}
