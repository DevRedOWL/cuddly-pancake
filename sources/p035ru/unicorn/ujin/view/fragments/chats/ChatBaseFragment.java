package p035ru.unicorn.ujin.view.fragments.chats;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Chat;
import p035ru.unicorn.ujin.enums.OptionsType;
import p035ru.unicorn.ujin.view.dialogs.OptionsDialog;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryDialog;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.EditField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;
import p035ru.unicorn.ujin.view.dialogs.dialogOptions.OptionsItem;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.ChatsViewModel;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0004J\"\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u00132\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0006\u0010\u0016\u001a\u00020\nJ\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J \u0010\u001c\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\rH\u0004J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH&J\u0018\u0010!\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\rH\u0004J\u0018\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0004R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006'"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/ChatBaseFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "chatViewModel", "Lru/unicorn/ujin/view/fragments/chats/viewModel/chatViewModel/ChatsViewModel;", "getChatViewModel", "()Lru/unicorn/ujin/view/fragments/chats/viewModel/chatViewModel/ChatsViewModel;", "chatViewModel$delegate", "Lkotlin/Lazy;", "afterChatSettingsChanged", "", "deleteChat", "chat", "Lru/unicorn/ujin/data/realm/Chat;", "userId", "", "getBaseOptionList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/dialogs/dialogOptions/OptionsItem;", "Lkotlin/collections/ArrayList;", "dialog", "getOptionsList", "goToMarket", "handleChatRename", "event", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "dataEntryDialog", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryDialog;", "handleSettingsChange", "checked", "", "renameChat", "showOptionsDialog", "toggleChatNotifications", "votePoll", "pollId", "", "pollOptionId", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatBaseFragment */
/* compiled from: ChatBaseFragment.kt */
public abstract class ChatBaseFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPTIONS_DIALOG_TAG = "optionsDialog";
    private HashMap _$_findViewCache;
    private final Lazy chatViewModel$delegate = LazyKt.lazy(new ChatBaseFragment$chatViewModel$2(this));

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

    public abstract void afterChatSettingsChanged();

    public final ChatsViewModel getChatViewModel() {
        return (ChatsViewModel) this.chatViewModel$delegate.getValue();
    }

    public abstract ArrayList<OptionsItem> getOptionsList(Chat chat);

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public abstract void showOptionsDialog(Chat chat);

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/ChatBaseFragment$Companion;", "", "()V", "OPTIONS_DIALOG_TAG", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatBaseFragment$Companion */
    /* compiled from: ChatBaseFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public final void deleteChat(Chat chat, String str) {
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        new AlertDialog.Builder(context).setMessage((CharSequence) "Удалить чат со всей историей сообщений?").setPositiveButton((int) R.string.button_yes, (DialogInterface.OnClickListener) new ChatBaseFragment$deleteChat$1(this, chat, str)).setNegativeButton((int) R.string.button_no, (DialogInterface.OnClickListener) ChatBaseFragment$deleteChat$2.INSTANCE).show();
    }

    /* access modifiers changed from: protected */
    public final void renameChat(Chat chat) {
        Intrinsics.checkNotNullParameter(chat, "dialog");
        DataEntryDialog.Companion companion = DataEntryDialog.Companion;
        String string = getString(R.string.chatEnterTitle);
        String title = chat.getTitle();
        String title2 = chat.getTitle();
        Intrinsics.checkNotNullExpressionValue(title2, "dialog.title");
        EditField editField = new EditField("text", string, title, title2, (Function2) null, (Function1) null, 48, (DefaultConstructorMarker) null);
        editField.setName("title");
        Unit unit = Unit.INSTANCE;
        DataEntryDialog newInstance = companion.newInstance((int) R.string.chatRename, (List<? extends Field>) CollectionsKt.listOf(editField), (int) R.string.chatRenameSave);
        newInstance.setLambdaSave(new ChatBaseFragment$renameChat$$inlined$apply$lambda$1(newInstance, this, chat));
        FragmentManager fragmentManager = getFragmentManager();
        Intrinsics.checkNotNull(fragmentManager);
        newInstance.show(fragmentManager, "");
    }

    /* access modifiers changed from: private */
    public final void handleChatRename(UpdateEvent updateEvent, DataEntryDialog dataEntryDialog) {
        if (updateEvent.getSuccess()) {
            dataEntryDialog.dismiss();
            afterChatSettingsChanged();
            return;
        }
        Toast.makeText(getContext(), updateEvent.getMessage(), 1).show();
    }

    /* access modifiers changed from: protected */
    public final void toggleChatNotifications(boolean z, Chat chat) {
        Intrinsics.checkNotNullParameter(chat, "dialog");
        getChatViewModel().getChatSettingsMutableLiveData().observe(this, new ChatBaseFragment$toggleChatNotifications$1(this, z, chat));
        ChatsViewModel chatViewModel = getChatViewModel();
        String id = chat.getId();
        Intrinsics.checkNotNullExpressionValue(id, "dialog.id");
        chatViewModel.requestChangeChatSettings(z, id);
    }

    /* access modifiers changed from: private */
    public final void handleSettingsChange(UpdateEvent updateEvent, boolean z, Chat chat) {
        getChatViewModel().getChatSettingsMutableLiveData().removeObservers(this);
        if (updateEvent.getSuccess()) {
            ChatsViewModel chatViewModel = getChatViewModel();
            String id = chat.getId();
            Intrinsics.checkNotNullExpressionValue(id, "chat.id");
            chatViewModel.setChatSound(id, z);
        } else {
            Toast.makeText(getContext(), updateEvent.getMessage(), 1).show();
            ChatsViewModel chatViewModel2 = getChatViewModel();
            String id2 = chat.getId();
            Intrinsics.checkNotNullExpressionValue(id2, "chat.id");
            chatViewModel2.setChatSound(id2, !z);
        }
        ChatsViewModel chatViewModel3 = getChatViewModel();
        String id3 = chat.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "chat.id");
        Chat chatById = chatViewModel3.getChatById(id3);
        afterChatSettingsChanged();
        FragmentManager fragmentManager = getFragmentManager();
        OptionsDialog optionsDialog = (OptionsDialog) (fragmentManager != null ? fragmentManager.findFragmentByTag(OPTIONS_DIALOG_TAG) : null);
        if (optionsDialog != null) {
            optionsDialog.applyOptionsList(getOptionsList(chatById));
        }
    }

    /* access modifiers changed from: protected */
    public final ArrayList<OptionsItem> getBaseOptionList(Chat chat, String str) {
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(str, "userId");
        if (chat == null) {
            return new ArrayList<>();
        }
        ArrayList<OptionsItem> arrayList = new ArrayList<>();
        String optionsType = OptionsType.SWITCH.toString();
        if (optionsType != null) {
            String lowerCase = optionsType.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            String string = getString(R.string.chatNotifications);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chatNotifications)");
            Boolean sound = chat.getSound();
            if (sound == null || (str2 = String.valueOf(sound.booleanValue())) == null) {
                str2 = "true";
            }
            arrayList.addAll(CollectionsKt.listOf(new OptionsItem(lowerCase, string, str2, new ChatBaseFragment$getBaseOptionList$$inlined$let$lambda$1(this, chat, str))));
            if (Intrinsics.areEqual((Object) chat.getOwnerId(), (Object) str) && chat.getParticipantsCount() > 2 && Intrinsics.areEqual((Object) chat.getServiceType(), (Object) "0")) {
                String optionsType2 = OptionsType.TEXT.toString();
                if (optionsType2 != null) {
                    String lowerCase2 = optionsType2.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
                    String string2 = getString(R.string.chatRename);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.chatRename)");
                    arrayList.add(0, new OptionsItem(lowerCase2, string2, "", new ChatBaseFragment$getBaseOptionList$$inlined$let$lambda$2(this, chat, str)));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            if (Intrinsics.areEqual((Object) chat.getServiceType(), (Object) "0")) {
                String optionsType3 = OptionsType.TEXT.toString();
                if (optionsType3 != null) {
                    String lowerCase3 = optionsType3.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "(this as java.lang.String).toLowerCase()");
                    if (Intrinsics.areEqual((Object) chat.getOwnerId(), (Object) str)) {
                        str3 = getString(R.string.chatDelete);
                    } else {
                        str3 = getString(R.string.chatExit);
                    }
                    Intrinsics.checkNotNullExpressionValue(str3, "if (dialog.ownerId == us…String(R.string.chatExit)");
                    arrayList.add(new OptionsItem(lowerCase3, str3, "", new ChatBaseFragment$getBaseOptionList$$inlined$let$lambda$3(this, chat, str)));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            return arrayList;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* access modifiers changed from: protected */
    public final void votePoll(int i, int i2) {
        getChatViewModel().requestPollVote(i, i2);
    }

    public final void goToMarket() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=ru.mysmartflat.kortros"));
        intent.addFlags(1208483840);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=ru.mysmartflat.kortros")));
        }
    }
}
