package p035ru.unicorn.ujin.view.fragments.chats.newChat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.stfalcon.chatkit.commons.ImageLoader;
import com.stfalcon.chatkit.dialogs.DialogsList;
import com.stfalcon.chatkit.dialogs.DialogsListAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.data.api.response.chats.SearchContactsResponseDataContact;
import p035ru.unicorn.ujin.data.realm.Chat;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.dialogs.dialogOptions.OptionsItem;
import p035ru.unicorn.ujin.view.fragments.chats.ChatBaseFragment;
import p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.ChatsViewModel;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.viewModel.events.chats.ChatEvent;
import p035ru.unicorn.ujin.viewModel.events.chats.ContactsFoundEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 H2\u00020\u0001:\u0001HB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010&\u001a\u00020'H\u0016J\"\u0010(\u001a\u0012\u0012\u0004\u0012\u00020)0\u000bj\b\u0012\u0004\u0012\u00020)`\f2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u0010,\u001a\u00020'2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020'2\u0006\u0010-\u001a\u000200H\u0002J\b\u00101\u001a\u00020\u001eH\u0014J\u0018\u00102\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u0012H\u0002J&\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u001a\u0010<\u001a\u00020'2\u0006\u0010=\u001a\u0002052\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010>\u001a\u00020'H\u0002J\u0010\u0010>\u001a\u00020'2\u0006\u0010?\u001a\u00020\u0005H\u0002J\u0010\u0010@\u001a\u00020'2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010A\u001a\u00020'H\u0014J \u0010B\u001a\u00020'2\u0006\u0010C\u001a\u00020\u00122\u0006\u0010D\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u0012H\u0002J\u0010\u0010F\u001a\u00020'2\u0006\u0010G\u001a\u00020\u0012H\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000bj\b\u0012\u0004\u0012\u00020\u0005`\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"¨\u0006I"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/newChat/NewChatFragment;", "Lru/unicorn/ujin/view/fragments/chats/ChatBaseFragment;", "()V", "chatListAdapter", "Lcom/stfalcon/chatkit/dialogs/DialogsListAdapter;", "Lru/unicorn/ujin/view/fragments/chats/newChat/NewChat;", "getChatListAdapter", "()Lcom/stfalcon/chatkit/dialogs/DialogsListAdapter;", "setChatListAdapter", "(Lcom/stfalcon/chatkit/dialogs/DialogsListAdapter;)V", "checkedParticipantList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getCheckedParticipantList", "()Ljava/util/ArrayList;", "setCheckedParticipantList", "(Ljava/util/ArrayList;)V", "groupChatMode", "", "getGroupChatMode", "()Z", "setGroupChatMode", "(Z)V", "imageLoader", "Lcom/stfalcon/chatkit/commons/ImageLoader;", "getImageLoader", "()Lcom/stfalcon/chatkit/commons/ImageLoader;", "setImageLoader", "(Lcom/stfalcon/chatkit/commons/ImageLoader;)V", "newDialogTitle", "", "getNewDialogTitle", "()Ljava/lang/String;", "setNewDialogTitle", "(Ljava/lang/String;)V", "userId", "getUserId", "setUserId", "afterChatSettingsChanged", "", "getOptionsList", "Lru/unicorn/ujin/view/dialogs/dialogOptions/OptionsItem;", "chat", "Lru/unicorn/ujin/data/realm/Chat;", "handleContactsFound", "event", "Lru/unicorn/ujin/viewModel/events/chats/ContactsFoundEvent;", "handleCreateChat", "Lru/unicorn/ujin/viewModel/events/chats/ChatEvent;", "metricsScreenName", "onCheckBoxClicked", "checked", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "openDialog", "dialog", "showOptionsDialog", "showToolbar", "togglePictures", "queryEmpty", "checkedEmpty", "searchStrEmpty", "toggleProgressVisibility", "visible", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.newChat.NewChatFragment */
/* compiled from: NewChatFragment.kt */
public final class NewChatFragment extends ChatBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    public DialogsListAdapter<NewChat> chatListAdapter;
    private ArrayList<NewChat> checkedParticipantList = new ArrayList<>();
    private boolean groupChatMode;
    public ImageLoader imageLoader;
    private String newDialogTitle = "";
    private String userId = "";

    @JvmStatic
    public static final NewChatFragment newInstance(boolean z, String str) {
        return Companion.newInstance(z, str);
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

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void showOptionsDialog(Chat chat) {
        Intrinsics.checkNotNullParameter(chat, ReactConst.CHAT);
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        String str;
        if (this.groupChatMode) {
            str = getString(R.string.metricsGroupChatCreate);
        } else {
            str = getString(R.string.metricsChatCreate);
        }
        Intrinsics.checkNotNullExpressionValue(str, "if (groupChatMode)\n     …string.metricsChatCreate)");
        return str;
    }

    public ArrayList<OptionsItem> getOptionsList(Chat chat) {
        List emptyList = CollectionsKt.emptyList();
        if (emptyList != null) {
            return (ArrayList) emptyList;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<ru.unicorn.ujin.view.dialogs.dialogOptions.OptionsItem> /* = java.util.ArrayList<ru.unicorn.ujin.view.dialogs.dialogOptions.OptionsItem> */");
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.newChat));
        getBaseActivity().hideBottomNavigation();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/newChat/NewChatFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/chats/newChat/NewChatFragment;", "groupChatMode", "", "userId", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.chats.newChat.NewChatFragment$Companion */
    /* compiled from: NewChatFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final NewChatFragment newInstance(boolean z, String str) {
            Intrinsics.checkNotNullParameter(str, "userId");
            NewChatFragment newChatFragment = new NewChatFragment();
            newChatFragment.setGroupChatMode(z);
            newChatFragment.setUserId(str);
            return newChatFragment;
        }
    }

    public final boolean getGroupChatMode() {
        return this.groupChatMode;
    }

    public final void setGroupChatMode(boolean z) {
        this.groupChatMode = z;
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

    public final DialogsListAdapter<NewChat> getChatListAdapter() {
        DialogsListAdapter<NewChat> dialogsListAdapter = this.chatListAdapter;
        if (dialogsListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatListAdapter");
        }
        return dialogsListAdapter;
    }

    public final void setChatListAdapter(DialogsListAdapter<NewChat> dialogsListAdapter) {
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

    public final String getNewDialogTitle() {
        return this.newDialogTitle;
    }

    public final void setNewDialogTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.newDialogTitle = str;
    }

    public final ArrayList<NewChat> getCheckedParticipantList() {
        return this.checkedParticipantList;
    }

    public final void setCheckedParticipantList(ArrayList<NewChat> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.checkedParticipantList = arrayList;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        this.imageLoader = new NewChatFragment$onCreateView$1(this);
        Class<NewChatViewHolder> cls = NewChatViewHolder.class;
        ImageLoader imageLoader2 = this.imageLoader;
        if (imageLoader2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        }
        this.chatListAdapter = new DialogsListAdapter<>(R.layout.item_chat, cls, imageLoader2);
        return layoutInflater.inflate(R.layout.fragment_new_chat, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonCreateGroupChat);
        dynamicBackgroundButton.setVisibility(8);
        dynamicBackgroundButton.setOnClickListener(new NewChatFragment$onViewCreated$$inlined$apply$lambda$1(this));
        if (this.groupChatMode) {
            TextInputLayout textInputLayout = (TextInputLayout) _$_findCachedViewById(C5619R.C5622id.tilTitle);
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "tilTitle");
            textInputLayout.setVisibility(0);
        } else {
            TextInputLayout textInputLayout2 = (TextInputLayout) _$_findCachedViewById(C5619R.C5622id.tilTitle);
            Intrinsics.checkNotNullExpressionValue(textInputLayout2, "tilTitle");
            textInputLayout2.setVisibility(8);
            DialogsListAdapter<NewChat> dialogsListAdapter = this.chatListAdapter;
            if (dialogsListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatListAdapter");
            }
            dialogsListAdapter.setOnDialogClickListener(new NewChatFragment$onViewCreated$2(this));
        }
        LifecycleOwner lifecycleOwner = this;
        getChatViewModel().getContactsFoundLiveData().observe(lifecycleOwner, new NewChatFragment$onViewCreated$3(this));
        getChatViewModel().getChatCreateLiveData().observe(lifecycleOwner, new NewChatFragment$onViewCreated$4(this));
        getChatViewModel().getShowProgressLiveData().observe(lifecycleOwner, new NewChatFragment$onViewCreated$5(this));
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etSearch)).addTextChangedListener(new NewChatFragment$onViewCreated$6(this));
        DialogsList dialogsList = (DialogsList) _$_findCachedViewById(C5619R.C5622id.dialogsList);
        DialogsListAdapter<NewChat> dialogsListAdapter2 = this.chatListAdapter;
        if (dialogsListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatListAdapter");
        }
        dialogsList.setAdapter(dialogsListAdapter2);
        DialogsList dialogsList2 = (DialogsList) _$_findCachedViewById(C5619R.C5622id.dialogsList);
        Intrinsics.checkNotNullExpressionValue(dialogsList2, "dialogsList");
        dialogsList2.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llPlaceholder);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "llPlaceholder");
        linearLayout.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public final void toggleProgressVisibility(boolean z) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
        progressBar.setVisibility(z ? 0 : 8);
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonCreateGroupChat);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "buttonCreateGroupChat");
        dynamicBackgroundButton.setEnabled(!z);
        if (this.groupChatMode) {
            return;
        }
        if (z) {
            DialogsListAdapter<NewChat> dialogsListAdapter = this.chatListAdapter;
            if (dialogsListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatListAdapter");
            }
            dialogsListAdapter.setOnDialogClickListener(NewChatFragment$toggleProgressVisibility$1.INSTANCE);
            return;
        }
        DialogsListAdapter<NewChat> dialogsListAdapter2 = this.chatListAdapter;
        if (dialogsListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatListAdapter");
        }
        dialogsListAdapter2.setOnDialogClickListener(new NewChatFragment$toggleProgressVisibility$2(this));
    }

    /* access modifiers changed from: private */
    public final void handleCreateChat(ChatEvent chatEvent) {
        if (chatEvent.getSuccess()) {
            getBaseActivity().showChatFragment(chatEvent.getChat(), this.userId, true);
        } else {
            Toast.makeText(getContext(), chatEvent.getMessage(), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public final void handleContactsFound(ContactsFoundEvent contactsFoundEvent) {
        List list;
        boolean z;
        boolean z2 = true;
        if (contactsFoundEvent.getSuccess()) {
            TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etSearch);
            Intrinsics.checkNotNullExpressionValue(textInputEditText, "etSearch");
            if (StringUtils.isEmpty(String.valueOf(textInputEditText.getText()))) {
                DialogsListAdapter<NewChat> dialogsListAdapter = this.chatListAdapter;
                if (dialogsListAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("chatListAdapter");
                }
                dialogsListAdapter.clear();
                return;
            }
            DialogsListAdapter<NewChat> dialogsListAdapter2 = this.chatListAdapter;
            if (dialogsListAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatListAdapter");
            }
            dialogsListAdapter2.clear();
            DialogsListAdapter<NewChat> dialogsListAdapter3 = this.chatListAdapter;
            if (dialogsListAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatListAdapter");
            }
            dialogsListAdapter3.addItems(this.checkedParticipantList);
            DialogsListAdapter<NewChat> dialogsListAdapter4 = this.chatListAdapter;
            if (dialogsListAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatListAdapter");
            }
            ArrayList<SearchContactsResponseDataContact> contactList = contactsFoundEvent.getContactList();
            if (contactList != null) {
                Collection arrayList = new ArrayList();
                for (Object next : contactList) {
                    SearchContactsResponseDataContact searchContactsResponseDataContact = (SearchContactsResponseDataContact) next;
                    Iterable iterable = this.checkedParticipantList;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (Intrinsics.areEqual((Object) ((NewChat) it.next()).getChatId(), (Object) searchContactsResponseDataContact.getId())) {
                                    z = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    z = true;
                    if (z) {
                        arrayList.add(next);
                    }
                }
                Iterable<SearchContactsResponseDataContact> iterable2 = (List) arrayList;
                Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                for (SearchContactsResponseDataContact searchContactsResponseDataContact2 : iterable2) {
                    arrayList2.add(new NewChat(searchContactsResponseDataContact2.getId(), searchContactsResponseDataContact2.getName(), this.groupChatMode, new NewChatFragment$handleContactsFound$$inlined$map$lambda$1(this), false));
                }
                list = (List) arrayList2;
            } else {
                list = null;
            }
            dialogsListAdapter4.addItems(list);
            DialogsListAdapter<NewChat> dialogsListAdapter5 = this.chatListAdapter;
            if (dialogsListAdapter5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatListAdapter");
            }
            dialogsListAdapter5.notifyDataSetChanged();
            ArrayList<SearchContactsResponseDataContact> contactList2 = contactsFoundEvent.getContactList();
            boolean isEmpty = contactList2 != null ? contactList2.isEmpty() : true;
            boolean isEmpty2 = this.checkedParticipantList.isEmpty();
            TextInputEditText textInputEditText2 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etSearch);
            Intrinsics.checkNotNullExpressionValue(textInputEditText2, "etSearch");
            if (String.valueOf(textInputEditText2.getText()).length() != 0) {
                z2 = false;
            }
            togglePictures(isEmpty, isEmpty2, z2);
            return;
        }
        Toast.makeText(getContext(), contactsFoundEvent.getMessage(), 1).show();
    }

    /* access modifiers changed from: private */
    public final void togglePictures(boolean z, boolean z2, boolean z3) {
        List listOf = CollectionsKt.listOf(Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
        if (Intrinsics.areEqual((Object) listOf, (Object) CollectionsKt.listOf(true, true, true))) {
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llPlaceholder);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "llPlaceholder");
            linearLayout.setVisibility(0);
            DialogsList dialogsList = (DialogsList) _$_findCachedViewById(C5619R.C5622id.dialogsList);
            Intrinsics.checkNotNullExpressionValue(dialogsList, "dialogsList");
            dialogsList.setVisibility(8);
            LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llNoOneFound);
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "llNoOneFound");
            linearLayout2.setVisibility(8);
            return;
        }
        if (Intrinsics.areEqual((Object) listOf, (Object) CollectionsKt.listOf(true, true, false))) {
            LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llPlaceholder);
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "llPlaceholder");
            linearLayout3.setVisibility(8);
            DialogsList dialogsList2 = (DialogsList) _$_findCachedViewById(C5619R.C5622id.dialogsList);
            Intrinsics.checkNotNullExpressionValue(dialogsList2, "dialogsList");
            dialogsList2.setVisibility(8);
            LinearLayout linearLayout4 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llNoOneFound);
            Intrinsics.checkNotNullExpressionValue(linearLayout4, "llNoOneFound");
            linearLayout4.setVisibility(0);
            return;
        }
        if (Intrinsics.areEqual((Object) listOf, (Object) CollectionsKt.listOf(true, false, true))) {
            LinearLayout linearLayout5 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llPlaceholder);
            Intrinsics.checkNotNullExpressionValue(linearLayout5, "llPlaceholder");
            linearLayout5.setVisibility(8);
            DialogsList dialogsList3 = (DialogsList) _$_findCachedViewById(C5619R.C5622id.dialogsList);
            Intrinsics.checkNotNullExpressionValue(dialogsList3, "dialogsList");
            dialogsList3.setVisibility(0);
            LinearLayout linearLayout6 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llNoOneFound);
            Intrinsics.checkNotNullExpressionValue(linearLayout6, "llNoOneFound");
            linearLayout6.setVisibility(0);
            return;
        }
        if (Intrinsics.areEqual((Object) listOf, (Object) CollectionsKt.listOf(true, false, false))) {
            LinearLayout linearLayout7 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llPlaceholder);
            Intrinsics.checkNotNullExpressionValue(linearLayout7, "llPlaceholder");
            linearLayout7.setVisibility(8);
            DialogsList dialogsList4 = (DialogsList) _$_findCachedViewById(C5619R.C5622id.dialogsList);
            Intrinsics.checkNotNullExpressionValue(dialogsList4, "dialogsList");
            dialogsList4.setVisibility(0);
            LinearLayout linearLayout8 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llNoOneFound);
            Intrinsics.checkNotNullExpressionValue(linearLayout8, "llNoOneFound");
            linearLayout8.setVisibility(0);
            return;
        }
        LinearLayout linearLayout9 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llPlaceholder);
        Intrinsics.checkNotNullExpressionValue(linearLayout9, "llPlaceholder");
        linearLayout9.setVisibility(8);
        DialogsList dialogsList5 = (DialogsList) _$_findCachedViewById(C5619R.C5622id.dialogsList);
        Intrinsics.checkNotNullExpressionValue(dialogsList5, "dialogsList");
        dialogsList5.setVisibility(0);
        LinearLayout linearLayout10 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llNoOneFound);
        Intrinsics.checkNotNullExpressionValue(linearLayout10, "llNoOneFound");
        linearLayout10.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public final void onCheckBoxClicked(NewChat newChat, boolean z) {
        if (!z) {
            Collection arrayList = new ArrayList();
            for (Object next : this.checkedParticipantList) {
                if (!Intrinsics.areEqual((Object) ((NewChat) next).getChatId(), (Object) newChat.getChatId())) {
                    arrayList.add(next);
                }
            }
            this.checkedParticipantList = (ArrayList) ((List) arrayList);
        } else if (!this.checkedParticipantList.contains(newChat)) {
            newChat.setChecked(z);
            this.checkedParticipantList.add(newChat);
        }
        if (!(!this.checkedParticipantList.isEmpty()) || !this.groupChatMode) {
            DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonCreateGroupChat);
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "buttonCreateGroupChat");
            dynamicBackgroundButton.setVisibility(8);
            return;
        }
        DynamicBackgroundButton dynamicBackgroundButton2 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonCreateGroupChat);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton2, "buttonCreateGroupChat");
        dynamicBackgroundButton2.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public final void openDialog(NewChat newChat) {
        if (!this.groupChatMode) {
            this.newDialogTitle = newChat.getTitle();
            ChatsViewModel chatViewModel = getChatViewModel();
            String str = this.newDialogTitle;
            chatViewModel.requestCreateChat(str, this.userId + ',' + newChat.getChatId());
        }
    }

    /* access modifiers changed from: private */
    public final void openDialog() {
        if (this.groupChatMode) {
            TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etTitle);
            Intrinsics.checkNotNullExpressionValue(textInputEditText, "etTitle");
            this.newDialogTitle = String.valueOf(textInputEditText.getText());
            if (this.newDialogTitle.length() > 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.userId + ',');
                Iterable<NewChat> iterable = this.checkedParticipantList;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (NewChat id : iterable) {
                    sb.append(id.getId() + ',');
                    arrayList.add(sb);
                }
                List list = (List) arrayList;
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "stringBuilder.toString()");
                getChatViewModel().requestCreateChat(this.newDialogTitle, StringsKt.removeSuffix(sb2, (CharSequence) ","));
                return;
            }
            Toast.makeText(getContext(), getString(R.string.new_chat_title_error), 1).show();
        }
    }
}
