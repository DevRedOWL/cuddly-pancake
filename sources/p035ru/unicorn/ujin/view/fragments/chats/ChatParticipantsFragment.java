package p035ru.unicorn.ujin.view.fragments.chats;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.data.entities.chats.Author;
import p035ru.unicorn.ujin.data.realm.Chat;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.util.AppUtils;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.dialogs.dialogOptions.OptionsItem;
import p035ru.unicorn.ujin.view.fragments.chats.newChat.ChatParticipantsAdapter;
import p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.ChatsViewModel;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.viewModel.events.chats.ChatParticipantEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\"\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\nH\u0014J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010%\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010&\u001a\u00020\u0010H\u0014J\u0010\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020)H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006+"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/ChatParticipantsFragment;", "Lru/unicorn/ujin/view/fragments/chats/ChatBaseFragment;", "()V", "chat", "Lru/unicorn/ujin/data/realm/Chat;", "getChat", "()Lru/unicorn/ujin/data/realm/Chat;", "setChat", "(Lru/unicorn/ujin/data/realm/Chat;)V", "userId", "", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "afterChatSettingsChanged", "", "getOptionsList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/dialogs/dialogOptions/OptionsItem;", "Lkotlin/collections/ArrayList;", "getUserAsAuthor", "Lru/unicorn/ujin/data/entities/chats/Author;", "handleParticipants", "event", "Lru/unicorn/ujin/viewModel/events/chats/ChatParticipantEvent;", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showOptionsDialog", "showToolbar", "toggleLoading", "loading", "", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatParticipantsFragment */
/* compiled from: ChatParticipantsFragment.kt */
public final class ChatParticipantsFragment extends ChatBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int MAX_TITLE_LENGTH = 22;
    private HashMap _$_findViewCache;
    public Chat chat;
    private String userId = "";

    @JvmStatic
    public static final ChatParticipantsFragment newInstance(Chat chat2, String str) {
        return Companion.newInstance(chat2, str);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void afterChatSettingsChanged() {
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void showOptionsDialog(Chat chat2) {
        Intrinsics.checkNotNullParameter(chat2, ReactConst.CHAT);
    }

    public ArrayList<OptionsItem> getOptionsList(Chat chat2) {
        List emptyList = CollectionsKt.emptyList();
        if (emptyList != null) {
            return (ArrayList) emptyList;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<ru.unicorn.ujin.view.dialogs.dialogOptions.OptionsItem> /* = java.util.ArrayList<ru.unicorn.ujin.view.dialogs.dialogOptions.OptionsItem> */");
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        BaseActivity baseActivity = getBaseActivity();
        Chat chat2 = this.chat;
        if (chat2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ReactConst.CHAT);
        }
        baseActivity.setTextTitle(chat2.getTitle());
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/ChatParticipantsFragment$Companion;", "", "()V", "MAX_TITLE_LENGTH", "", "newInstance", "Lru/unicorn/ujin/view/fragments/chats/ChatParticipantsFragment;", "chat", "Lru/unicorn/ujin/data/realm/Chat;", "userId", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatParticipantsFragment$Companion */
    /* compiled from: ChatParticipantsFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ChatParticipantsFragment newInstance(Chat chat, String str) {
            Intrinsics.checkNotNullParameter(chat, ReactConst.CHAT);
            Intrinsics.checkNotNullParameter(str, "userId");
            ChatParticipantsFragment chatParticipantsFragment = new ChatParticipantsFragment();
            chatParticipantsFragment.setChat(chat);
            chatParticipantsFragment.setUserId(str);
            return chatParticipantsFragment;
        }
    }

    public final Chat getChat() {
        Chat chat2 = this.chat;
        if (chat2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ReactConst.CHAT);
        }
        return chat2;
    }

    public final void setChat(Chat chat2) {
        Intrinsics.checkNotNullParameter(chat2, "<set-?>");
        this.chat = chat2;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setUserId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_chat_participants, viewGroup, false);
        Intrinsics.checkNotNull(inflate);
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        BaseActivity baseActivity = getBaseActivity();
        Chat chat2 = this.chat;
        if (chat2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ReactConst.CHAT);
        }
        baseActivity.setTextTitle(AppUtils.getChatTitle(chat2.getTitle(), false, 22));
        LifecycleOwner lifecycleOwner = this;
        getChatViewModel().getChatParticipantsMutableLiveData().observe(lifecycleOwner, new ChatParticipantsFragment$onViewCreated$1(this));
        getChatViewModel().getShowProgressLiveData().observe(lifecycleOwner, new ChatParticipantsFragment$onViewCreated$2(this));
        ChatsViewModel chatViewModel = getChatViewModel();
        Chat chat3 = this.chat;
        if (chat3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ReactConst.CHAT);
        }
        String id = chat3.getId();
        Intrinsics.checkNotNullExpressionValue(id, "chat.id");
        chatViewModel.requestChatParticipants(id);
    }

    /* access modifiers changed from: private */
    public final void toggleLoading(boolean z) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
        progressBar.setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: private */
    public final void handleParticipants(ChatParticipantEvent chatParticipantEvent) {
        if (chatParticipantEvent.getSuccess()) {
            ArrayList<Author> participantList = chatParticipantEvent.getParticipantList();
            if (participantList != null) {
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvChatParticipants);
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
                participantList.add(0, getUserAsAuthor());
                List list = participantList;
                Chat chat2 = this.chat;
                if (chat2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(ReactConst.CHAT);
                }
                String ownerId = chat2.getOwnerId();
                Intrinsics.checkNotNullExpressionValue(ownerId, "chat.ownerId");
                recyclerView.setAdapter(new ChatParticipantsAdapter(list, ownerId));
                return;
            }
            return;
        }
        Toast.makeText(getContext(), chatParticipantEvent.getMessage(), 1).show();
    }

    private final Author getUserAsAuthor() {
        User user = getChatViewModel().getUser();
        return new Author(this.userId, user.getFullName(), user.getAvatar());
    }
}
