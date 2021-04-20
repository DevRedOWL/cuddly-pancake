package p035ru.unicorn.ujin.view.fragments.chats;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.viewpager.widget.PagerAdapter;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.stfalcon.chatkit.commons.ImageLoader;
import com.stfalcon.chatkit.dialogs.DialogsList;
import com.stfalcon.chatkit.dialogs.DialogsListAdapter;
import com.stfalcon.chatkit.messages.MessageHolders;
import com.stfalcon.chatkit.messages.MessagesList;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.data.entities.chats.Attachment;
import p035ru.unicorn.ujin.data.entities.chats.Message;
import p035ru.unicorn.ujin.data.entities.chats.Poll;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Chat;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.util.Flavors;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.customViews.BadgeView;
import p035ru.unicorn.ujin.view.customViews.SwitchSwipeableViewPager;
import p035ru.unicorn.ujin.view.dialogs.OptionsDialog;
import p035ru.unicorn.ujin.view.dialogs.dialogOptions.OptionsItem;
import p035ru.unicorn.ujin.view.fragments.chats.ChatFragment;
import p035ru.unicorn.ujin.view.fragments.chats.adapters.ChatListAdapter;
import p035ru.unicorn.ujin.view.fragments.chats.adapters.CustomMessagesListAdapter;
import p035ru.unicorn.ujin.view.fragments.chats.adapters.viewHolders.CustomIncomingMessageViewHolder;
import p035ru.unicorn.ujin.view.fragments.chats.adapters.viewHolders.CustomOutcomingMessageViewHolder;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.viewModel.events.PollListEvent;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p035ru.unicorn.ujin.viewModel.events.chats.ChatListEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 i2\u00020\u0001:\u0002hiB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010=\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020AH\u0002J\u0018\u0010B\u001a\b\u0012\u0004\u0012\u00020D0C2\b\u0010E\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010F\u001a\u00020>2\u0006\u0010G\u001a\u00020HH\u0002J\u0010\u0010I\u001a\u00020>2\u0006\u0010G\u001a\u00020JH\u0002J\u0010\u0010K\u001a\u00020>2\u0006\u0010G\u001a\u00020LH\u0002J\b\u0010M\u001a\u00020>H\u0002J\b\u0010N\u001a\u00020>H\u0002J\b\u0010O\u001a\u000208H\u0014J\u0010\u0010P\u001a\u00020>2\u0006\u0010Q\u001a\u00020RH\u0016J&\u0010S\u001a\u0004\u0018\u00010T2\u0006\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010X2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J\b\u0010[\u001a\u00020>H\u0016J\u001a\u0010\\\u001a\u00020>2\u0006\u0010]\u001a\u00020T2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J\u0010\u0010^\u001a\u00020>2\u0006\u0010_\u001a\u00020\u000bH\u0002J\b\u0010`\u001a\u00020>H\u0014J\u0010\u0010a\u001a\u00020>2\u0006\u0010E\u001a\u00020\u000bH\u0016J\b\u0010b\u001a\u00020>H\u0014J\u0010\u0010c\u001a\u00020>2\u0006\u0010d\u001a\u00020AH\u0002J\u0010\u0010e\u001a\u00020>2\b\u0010f\u001a\u0004\u0018\u00010gR\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0017X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001a\u0010\u001f\u001a\u00020 X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u000e\u0010/\u001a\u000200X.¢\u0006\u0002\n\u0000R\u001a\u00101\u001a\u000202X.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u000208X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006j"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/ChatListFragment;", "Lru/unicorn/ujin/view/fragments/chats/ChatBaseFragment;", "()V", "badgePolls", "Lru/unicorn/ujin/view/customViews/BadgeView;", "getBadgePolls", "()Lru/unicorn/ujin/view/customViews/BadgeView;", "setBadgePolls", "(Lru/unicorn/ujin/view/customViews/BadgeView;)V", "chatListAdapter", "Lcom/stfalcon/chatkit/dialogs/DialogsListAdapter;", "Lru/unicorn/ujin/data/realm/Chat;", "getChatListAdapter", "()Lcom/stfalcon/chatkit/dialogs/DialogsListAdapter;", "setChatListAdapter", "(Lcom/stfalcon/chatkit/dialogs/DialogsListAdapter;)V", "dialogsList", "Lcom/stfalcon/chatkit/dialogs/DialogsList;", "getDialogsList", "()Lcom/stfalcon/chatkit/dialogs/DialogsList;", "setDialogsList", "(Lcom/stfalcon/chatkit/dialogs/DialogsList;)V", "fabNewChat", "Lcom/github/clans/fab/FloatingActionButton;", "getFabNewChat", "()Lcom/github/clans/fab/FloatingActionButton;", "setFabNewChat", "(Lcom/github/clans/fab/FloatingActionButton;)V", "fabNewGroupChat", "getFabNewGroupChat", "setFabNewGroupChat", "famNewChat", "Lcom/github/clans/fab/FloatingActionMenu;", "getFamNewChat", "()Lcom/github/clans/fab/FloatingActionMenu;", "setFamNewChat", "(Lcom/github/clans/fab/FloatingActionMenu;)V", "imageLoader", "Lcom/stfalcon/chatkit/commons/ImageLoader;", "getImageLoader", "()Lcom/stfalcon/chatkit/commons/ImageLoader;", "setImageLoader", "(Lcom/stfalcon/chatkit/commons/ImageLoader;)V", "mMessageReceiver", "Landroid/content/BroadcastReceiver;", "getMMessageReceiver", "()Landroid/content/BroadcastReceiver;", "messagesList", "Lcom/stfalcon/chatkit/messages/MessagesList;", "pollListMessageAdapter", "Lru/unicorn/ujin/view/fragments/chats/adapters/CustomMessagesListAdapter;", "getPollListMessageAdapter", "()Lru/unicorn/ujin/view/fragments/chats/adapters/CustomMessagesListAdapter;", "setPollListMessageAdapter", "(Lru/unicorn/ujin/view/fragments/chats/adapters/CustomMessagesListAdapter;)V", "userId", "", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "afterChatSettingsChanged", "", "createNewChat", "groupChat", "", "getOptionsList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/dialogs/dialogOptions/OptionsItem;", "chat", "handleChatExit", "event", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "handleChatListUpdated", "Lru/unicorn/ujin/viewModel/events/chats/ChatListEvent;", "handlePollListEvent", "Lru/unicorn/ujin/viewModel/events/PollListEvent;", "instantiateChatListLoading", "instantiatePollListLoading", "metricsScreenName", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "onViewCreated", "view", "openDialog", "dialog", "showImageToolbar", "showOptionsDialog", "showToolbar", "toggleProgressVisibility", "visible", "updatePoll", "poll", "Lru/unicorn/ujin/data/entities/chats/Poll;", "ChatPollViewPagerAdapter", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatListFragment */
/* compiled from: ChatListFragment.kt */
public final class ChatListFragment extends ChatBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    public BadgeView badgePolls;
    public DialogsListAdapter<Chat> chatListAdapter;
    public DialogsList dialogsList;
    public FloatingActionButton fabNewChat;
    public FloatingActionButton fabNewGroupChat;
    public FloatingActionMenu famNewChat;
    public ImageLoader imageLoader;
    private final BroadcastReceiver mMessageReceiver = new ChatListFragment$mMessageReceiver$1(this);
    /* access modifiers changed from: private */
    public MessagesList messagesList;
    public CustomMessagesListAdapter pollListMessageAdapter;
    private String userId = "";

    @JvmStatic
    public static final ChatListFragment newInstance() {
        return Companion.newInstance();
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

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ MessagesList access$getMessagesList$p(ChatListFragment chatListFragment) {
        MessagesList messagesList2 = chatListFragment.messagesList;
        if (messagesList2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messagesList");
        }
        return messagesList2;
    }

    public final DialogsList getDialogsList() {
        DialogsList dialogsList2 = this.dialogsList;
        if (dialogsList2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogsList");
        }
        return dialogsList2;
    }

    public final void setDialogsList(DialogsList dialogsList2) {
        Intrinsics.checkNotNullParameter(dialogsList2, "<set-?>");
        this.dialogsList = dialogsList2;
    }

    public final FloatingActionMenu getFamNewChat() {
        FloatingActionMenu floatingActionMenu = this.famNewChat;
        if (floatingActionMenu == null) {
            Intrinsics.throwUninitializedPropertyAccessException("famNewChat");
        }
        return floatingActionMenu;
    }

    public final void setFamNewChat(FloatingActionMenu floatingActionMenu) {
        Intrinsics.checkNotNullParameter(floatingActionMenu, "<set-?>");
        this.famNewChat = floatingActionMenu;
    }

    public final FloatingActionButton getFabNewChat() {
        FloatingActionButton floatingActionButton = this.fabNewChat;
        if (floatingActionButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fabNewChat");
        }
        return floatingActionButton;
    }

    public final void setFabNewChat(FloatingActionButton floatingActionButton) {
        Intrinsics.checkNotNullParameter(floatingActionButton, "<set-?>");
        this.fabNewChat = floatingActionButton;
    }

    public final FloatingActionButton getFabNewGroupChat() {
        FloatingActionButton floatingActionButton = this.fabNewGroupChat;
        if (floatingActionButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fabNewGroupChat");
        }
        return floatingActionButton;
    }

    public final void setFabNewGroupChat(FloatingActionButton floatingActionButton) {
        Intrinsics.checkNotNullParameter(floatingActionButton, "<set-?>");
        this.fabNewGroupChat = floatingActionButton;
    }

    public final CustomMessagesListAdapter getPollListMessageAdapter() {
        CustomMessagesListAdapter customMessagesListAdapter = this.pollListMessageAdapter;
        if (customMessagesListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pollListMessageAdapter");
        }
        return customMessagesListAdapter;
    }

    public final void setPollListMessageAdapter(CustomMessagesListAdapter customMessagesListAdapter) {
        Intrinsics.checkNotNullParameter(customMessagesListAdapter, "<set-?>");
        this.pollListMessageAdapter = customMessagesListAdapter;
    }

    public final BadgeView getBadgePolls() {
        BadgeView badgeView = this.badgePolls;
        if (badgeView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("badgePolls");
        }
        return badgeView;
    }

    public final void setBadgePolls(BadgeView badgeView) {
        Intrinsics.checkNotNullParameter(badgeView, "<set-?>");
        this.badgePolls = badgeView;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        String string = getString(R.string.metricsChatListFragment);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.metricsChatListFragment)");
        return string;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        if (!Intrinsics.areEqual((Object) "kortros", (Object) Flavors.MORIONDIGITAL)) {
            if (Intrinsics.areEqual((Object) getBaseActivity().flavor.getAppName(), (Object) Flavors.PAN) || Intrinsics.areEqual((Object) "kortros", (Object) Flavors.MORIONDIGITAL)) {
                getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
            } else {
                getBaseActivity().setToolbarLeft(ToolbarButtons.PROFILE);
            }
        }
        showImageToolbar();
    }

    /* access modifiers changed from: protected */
    public void showImageToolbar() {
        if (Flavor.Companion.isCurrent(Flavor.SMARTDOMRU)) {
            getBaseActivity().setTextTitle(getResources().getString(R.string.title_chats));
        } else {
            getBaseActivity().showImageLogo();
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/ChatListFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/chats/ChatListFragment;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatListFragment$Companion */
    /* compiled from: ChatListFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ChatListFragment newInstance() {
            return new ChatListFragment();
        }
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader2 = this.imageLoader;
        if (imageLoader2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        }
        return imageLoader2;
    }

    public final void setImageLoader(ImageLoader imageLoader2) {
        Intrinsics.checkNotNullParameter(imageLoader2, "<set-?>");
        this.imageLoader = imageLoader2;
    }

    public final DialogsListAdapter<Chat> getChatListAdapter() {
        DialogsListAdapter<Chat> dialogsListAdapter = this.chatListAdapter;
        if (dialogsListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatListAdapter");
        }
        return dialogsListAdapter;
    }

    public final void setChatListAdapter(DialogsListAdapter<Chat> dialogsListAdapter) {
        Intrinsics.checkNotNullParameter(dialogsListAdapter, "<set-?>");
        this.chatListAdapter = dialogsListAdapter;
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
        getChatViewModel().getChatListMutableLiveData().observe(getViewLifecycleOwner(), new ChatListFragment$onCreateView$1(this));
        getChatViewModel().getShowProgressLiveData().observe(getViewLifecycleOwner(), new ChatListFragment$onCreateView$2(this));
        getChatViewModel().getChatExitMutableLiveData().observe(getViewLifecycleOwner(), new ChatListFragment$onCreateView$3(this));
        getChatViewModel().getChatDeleteLiveData().observe(getViewLifecycleOwner(), new ChatListFragment$onCreateView$4(this));
        getChatViewModel().getPollListMutableLiveData().observe(getViewLifecycleOwner(), new ChatListFragment$onCreateView$5(this));
        getChatViewModel().getPollMutableLiveData().observe(getViewLifecycleOwner(), new ChatListFragment$onCreateView$6(this));
        return layoutInflater.inflate(R.layout.fragment_chat_list, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etSearch)).addTextChangedListener(new ChatListFragment$onViewCreated$1(this));
        SwitchSwipeableViewPager switchSwipeableViewPager = (SwitchSwipeableViewPager) _$_findCachedViewById(C5619R.C5622id.vpChatPollList);
        Intrinsics.checkNotNullExpressionValue(switchSwipeableViewPager, "vpChatPollList");
        switchSwipeableViewPager.setAdapter(new ChatPollViewPagerAdapter());
        ((SwitchSwipeableViewPager) _$_findCachedViewById(C5619R.C5622id.vpChatPollList)).setSwipeEnabled(false);
        ((TabLayout) _$_findCachedViewById(C5619R.C5622id.tlChatPolls)).setupWithViewPager((SwitchSwipeableViewPager) _$_findCachedViewById(C5619R.C5622id.vpChatPollList));
        instantiatePollListLoading();
        getBaseActivity().profileViewModel.loadSplashscreen();
    }

    /* access modifiers changed from: private */
    public final void instantiateChatListLoading() {
        this.imageLoader = new ChatListFragment$instantiateChatListLoading$1(this);
        ImageLoader imageLoader2 = this.imageLoader;
        if (imageLoader2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        }
        this.chatListAdapter = new ChatListAdapter(R.layout.item_chat, imageLoader2);
        DialogsList dialogsList2 = this.dialogsList;
        if (dialogsList2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogsList");
        }
        DialogsListAdapter<Chat> dialogsListAdapter = this.chatListAdapter;
        if (dialogsListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatListAdapter");
        }
        dialogsList2.setAdapter(dialogsListAdapter);
        DialogsListAdapter<Chat> dialogsListAdapter2 = this.chatListAdapter;
        if (dialogsListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatListAdapter");
        }
        dialogsListAdapter2.setOnDialogClickListener(new ChatListFragment$instantiateChatListLoading$2(this));
        DialogsListAdapter<Chat> dialogsListAdapter3 = this.chatListAdapter;
        if (dialogsListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatListAdapter");
        }
        dialogsListAdapter3.setOnDialogLongClickListener(new ChatListFragment$instantiateChatListLoading$3(this));
        getChatViewModel().requestChatList(0, 200, (Integer) null);
    }

    /* access modifiers changed from: private */
    public final void handleChatExit(UpdateEvent updateEvent) {
        if (updateEvent.getSuccess()) {
            getChatViewModel().requestChatList(0, 200, (Integer) null);
        } else {
            Toast.makeText(getContext(), updateEvent.getMessage(), 1).show();
        }
    }

    public void afterChatSettingsChanged() {
        getChatViewModel().requestChatList(0, 200, (Integer) null);
    }

    public void showOptionsDialog(Chat chat) {
        Intrinsics.checkNotNullParameter(chat, ReactConst.CHAT);
        OptionsDialog newInstance = OptionsDialog.Companion.newInstance((String) null, getOptionsList(chat));
        FragmentManager fragmentManager = getFragmentManager();
        Intrinsics.checkNotNull(fragmentManager);
        newInstance.show(fragmentManager, ChatBaseFragment.OPTIONS_DIALOG_TAG);
    }

    public ArrayList<OptionsItem> getOptionsList(Chat chat) {
        return getBaseOptionList(chat, this.userId);
    }

    /* access modifiers changed from: private */
    public final void createNewChat(boolean z) {
        getBaseActivity().showNewChat(z, this.userId);
    }

    /* access modifiers changed from: private */
    public final void toggleProgressVisibility(boolean z) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
        progressBar.setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: private */
    public final void handleChatListUpdated(ChatListEvent chatListEvent) {
        Bundle extras;
        String string;
        if (chatListEvent.getSuccess()) {
            DialogsListAdapter<Chat> dialogsListAdapter = this.chatListAdapter;
            if (dialogsListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatListAdapter");
            }
            dialogsListAdapter.clear();
            DialogsListAdapter<Chat> dialogsListAdapter2 = this.chatListAdapter;
            if (dialogsListAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatListAdapter");
            }
            dialogsListAdapter2.addItems(chatListEvent.getChatList());
            DialogsListAdapter<Chat> dialogsListAdapter3 = this.chatListAdapter;
            if (dialogsListAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatListAdapter");
            }
            dialogsListAdapter3.notifyDataSetChanged();
            this.userId = chatListEvent.getUserId();
            FragmentActivity activity = getActivity();
            if (activity != null) {
                Intrinsics.checkNotNullExpressionValue(activity, "act");
                Intent intent = activity.getIntent();
                if (intent != null && (extras = intent.getExtras()) != null && (string = extras.getString("chatid")) != null) {
                    Collection arrayList = new ArrayList();
                    for (Object next : chatListEvent.getChatList()) {
                        if (Intrinsics.areEqual((Object) ((Chat) next).getId(), (Object) string)) {
                            arrayList.add(next);
                        }
                    }
                    Iterable<Chat> iterable = (List) arrayList;
                    Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (Chat showChatFragment : iterable) {
                        getBaseActivity().showChatFragment(showChatFragment, this.userId);
                        activity.getIntent().removeExtra("chatid");
                        arrayList2.add(Unit.INSTANCE);
                    }
                    List list = (List) arrayList2;
                    return;
                }
                return;
            }
            return;
        }
        Toast.makeText(getContext(), chatListEvent.getMessage(), 1).show();
    }

    /* access modifiers changed from: private */
    public final void openDialog(Chat chat) {
        ChatFragment.Companion companion = ChatFragment.Companion;
        String id = chat.getId();
        Intrinsics.checkNotNullExpressionValue(id, "dialog.id");
        nextFragment(companion.newInstance(id, this.userId, true), false, BaseActivity.FRAGMENT_CHAT);
    }

    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        LocalBroadcastManager.getInstance(requireContext()).registerReceiver(this.mMessageReceiver, new IntentFilter("chatUpdate"));
    }

    public void onDetach() {
        LocalBroadcastManager.getInstance(requireContext()).unregisterReceiver(this.mMessageReceiver);
        super.onDetach();
    }

    public final BroadcastReceiver getMMessageReceiver() {
        return this.mMessageReceiver;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016¨\u0006\u0011"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/ChatListFragment$ChatPollViewPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "(Lru/unicorn/ujin/view/fragments/chats/ChatListFragment;)V", "getCount", "", "getPageTitle", "", "position", "instantiateItem", "", "container", "Landroid/view/ViewGroup;", "isViewFromObject", "", "view", "Landroid/view/View;", "object", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatListFragment$ChatPollViewPagerAdapter */
    /* compiled from: ChatListFragment.kt */
    public final class ChatPollViewPagerAdapter extends PagerAdapter {
        public int getCount() {
            return 2;
        }

        public String getPageTitle(int i) {
            return i != 0 ? i != 1 ? "" : "Опросы" : "Чаты";
        }

        public ChatPollViewPagerAdapter() {
        }

        public boolean isViewFromObject(View view, Object obj) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(obj, "object");
            return Intrinsics.areEqual((Object) view, obj);
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View view;
            Intrinsics.checkNotNullParameter(viewGroup, "container");
            if (i == 0) {
                view = LayoutInflater.from(ChatListFragment.this.getContext()).inflate(R.layout.item_dialog_list, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(view, "LayoutInflater.from(cont…g_list, container, false)");
                ChatListFragment chatListFragment = ChatListFragment.this;
                View findViewById = view.findViewById(R.id.dialogsList);
                Intrinsics.checkNotNullExpressionValue(findViewById, "layout.findViewById(R.id.dialogsList)");
                chatListFragment.setDialogsList((DialogsList) findViewById);
                ChatListFragment chatListFragment2 = ChatListFragment.this;
                View findViewById2 = view.findViewById(R.id.famNewChat);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "layout.findViewById(R.id.famNewChat)");
                chatListFragment2.setFamNewChat((FloatingActionMenu) findViewById2);
                ChatListFragment chatListFragment3 = ChatListFragment.this;
                View findViewById3 = view.findViewById(R.id.fabNewChat);
                Intrinsics.checkNotNullExpressionValue(findViewById3, "layout.findViewById(R.id.fabNewChat)");
                chatListFragment3.setFabNewChat((FloatingActionButton) findViewById3);
                int color = ChatListFragment.this.getResources().getColor(R.color.brandBackgroundPrimary);
                int color2 = ChatListFragment.this.getResources().getColor(R.color.brandTextPrimary);
                ChatListFragment.this.getFabNewChat().setLabelColors(color, color, color);
                ChatListFragment.this.getFabNewChat().setLabelTextColor(color2);
                ChatListFragment chatListFragment4 = ChatListFragment.this;
                View findViewById4 = view.findViewById(R.id.fabNewGroupChat);
                Intrinsics.checkNotNullExpressionValue(findViewById4, "layout.findViewById(R.id.fabNewGroupChat)");
                chatListFragment4.setFabNewGroupChat((FloatingActionButton) findViewById4);
                ChatListFragment.this.getFabNewGroupChat().setLabelColors(color, color, color);
                ChatListFragment.this.getFabNewGroupChat().setLabelTextColor(color2);
                ChatListFragment.this.getFabNewChat().setOnClickListener(new ChatListFragment$ChatPollViewPagerAdapter$instantiateItem$1(this));
                ChatListFragment.this.getFabNewGroupChat().setOnClickListener(new ChatListFragment$ChatPollViewPagerAdapter$instantiateItem$2(this));
                if (ProfileLocalRepository.Companion.getInstance().isDemo() || ChatListFragment.this.getBaseActivity().flavor == Flavor.MORIONDIGITAL || ProfileLocalRepository.Companion.getInstance().getUser().isCurrentCommerce() || ChatListFragment.this.getBaseActivity().flavor == Flavor.DADEVELOPMENT) {
                    ChatListFragment.this.getFamNewChat().setVisibility(8);
                }
                ChatListFragment.this.instantiateChatListLoading();
            } else {
                view = LayoutInflater.from(ChatListFragment.this.getContext()).inflate(R.layout.item_message_list, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(view, "LayoutInflater.from(cont…e_list, container, false)");
                ChatListFragment chatListFragment5 = ChatListFragment.this;
                View findViewById5 = view.findViewById(R.id.messagesList);
                Intrinsics.checkNotNullExpressionValue(findViewById5, "layout.findViewById(R.id.messagesList)");
                chatListFragment5.messagesList = (MessagesList) findViewById5;
                ChatListFragment chatListFragment6 = ChatListFragment.this;
                MessageHolders messageHolders = new MessageHolders();
                messageHolders.setIncomingTextConfig(CustomIncomingMessageViewHolder.class, R.layout.item_message_incoming);
                messageHolders.setOutcomingTextConfig(CustomOutcomingMessageViewHolder.class, R.layout.item_message_outcoming);
                Unit unit = Unit.INSTANCE;
                chatListFragment6.setPollListMessageAdapter(new CustomMessagesListAdapter("1", messageHolders, ChatListFragment.this.getImageLoader(), new ChatListFragment$ChatPollViewPagerAdapter$instantiateItem$4(this)));
                ChatListFragment.access$getMessagesList$p(ChatListFragment.this).setAdapter(ChatListFragment.this.getPollListMessageAdapter());
            }
            viewGroup.addView(view);
            return view;
        }
    }

    private final void instantiatePollListLoading() {
        getChatViewModel().requestPollList();
    }

    /* access modifiers changed from: private */
    public final void handlePollListEvent(PollListEvent pollListEvent) {
        Calendar calendar;
        ArrayList<Poll> pollList = pollListEvent.getPollList();
        if (pollList != null && pollList.size() > 0) {
            ((SwitchSwipeableViewPager) _$_findCachedViewById(C5619R.C5622id.vpChatPollList)).setSwipeEnabled(true);
            TabLayout tabLayout = (TabLayout) _$_findCachedViewById(C5619R.C5622id.tlChatPolls);
            Intrinsics.checkNotNullExpressionValue(tabLayout, "tlChatPolls");
            tabLayout.setVisibility(0);
            Iterable<Poll> iterable = pollList;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            int i = 0;
            for (Poll poll : iterable) {
                CharSequence createdAt = poll.getCreatedAt();
                if (createdAt == null || StringsKt.isBlank(createdAt)) {
                    calendar = Calendar.getInstance();
                } else {
                    calendar = DateUtils.parseDate(poll.getCreatedAt(), "yyyy-MM-dd HH:mm:ss");
                }
                String name = poll.getAuthor().getName();
                Intrinsics.checkNotNullExpressionValue(calendar, "createdDate");
                Message message = r5;
                Message message2 = new Message(i, name, Long.valueOf(calendar.getTimeInMillis() / ((long) 1000)), "", "", "poll", 0, false, false, "", (List<Attachment>) null, poll);
                arrayList.add(message);
                i++;
            }
            List list = (List) arrayList;
            CustomMessagesListAdapter customMessagesListAdapter = this.pollListMessageAdapter;
            if (customMessagesListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pollListMessageAdapter");
            }
            customMessagesListAdapter.clear();
            CustomMessagesListAdapter customMessagesListAdapter2 = this.pollListMessageAdapter;
            if (customMessagesListAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pollListMessageAdapter");
            }
            customMessagesListAdapter2.addToEnd(list, true);
            MessagesList messagesList2 = this.messagesList;
            if (messagesList2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("messagesList");
            }
            CustomMessagesListAdapter customMessagesListAdapter3 = this.pollListMessageAdapter;
            if (customMessagesListAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pollListMessageAdapter");
            }
            messagesList2.scrollToPosition(customMessagesListAdapter3.getItemCount() - 1);
        }
    }

    public final void updatePoll(Poll poll) {
        if (poll != null) {
            CustomMessagesListAdapter customMessagesListAdapter = this.pollListMessageAdapter;
            if (customMessagesListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pollListMessageAdapter");
            }
            customMessagesListAdapter.updatePoll(poll);
        }
    }
}
