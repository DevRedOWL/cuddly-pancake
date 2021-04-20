package p035ru.unicorn.ujin.view.fragments.chats.newChat;

import com.stfalcon.chatkit.commons.models.IDialog;
import com.stfalcon.chatkit.commons.models.IUser;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.entities.chats.Message;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u001b\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003JM\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\b\u0010%\u001a\u00020\u0004H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J\n\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020+H\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-H\u0016J\t\u0010/\u001a\u00020+HÖ\u0001J\u0012\u00100\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u00010\u0002H\u0016J\t\u00102\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R,\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u001b¨\u00063"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/newChat/NewChat;", "Lcom/stfalcon/chatkit/commons/models/IDialog;", "Lru/unicorn/ujin/data/entities/chats/Message;", "chatId", "", "title", "groupParticipant", "", "groupCheckBoxClick", "Lkotlin/Function2;", "", "checked", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Z)V", "getChatId", "()Ljava/lang/String;", "getChecked", "()Z", "setChecked", "(Z)V", "getGroupCheckBoxClick", "()Lkotlin/jvm/functions/Function2;", "setGroupCheckBoxClick", "(Lkotlin/jvm/functions/Function2;)V", "getGroupParticipant", "setGroupParticipant", "getTitle", "setTitle", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "getDialogName", "getDialogPhoto", "getId", "getLastMessage", "", "getUnreadCount", "", "getUsers", "", "Lcom/stfalcon/chatkit/commons/models/IUser;", "hashCode", "setLastMessage", "message", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.newChat.NewChat */
/* compiled from: NewChat.kt */
public final class NewChat implements IDialog<Message> {
    private final String chatId;
    private boolean checked;
    private Function2<? super NewChat, ? super Boolean, Unit> groupCheckBoxClick;
    private boolean groupParticipant;
    private String title;

    public static /* synthetic */ NewChat copy$default(NewChat newChat, String str, String str2, boolean z, Function2<? super NewChat, ? super Boolean, Unit> function2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newChat.chatId;
        }
        if ((i & 2) != 0) {
            str2 = newChat.title;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = newChat.groupParticipant;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            function2 = newChat.groupCheckBoxClick;
        }
        Function2<? super NewChat, ? super Boolean, Unit> function22 = function2;
        if ((i & 16) != 0) {
            z2 = newChat.checked;
        }
        return newChat.copy(str, str3, z3, function22, z2);
    }

    public final String component1() {
        return this.chatId;
    }

    public final String component2() {
        return this.title;
    }

    public final boolean component3() {
        return this.groupParticipant;
    }

    public final Function2<NewChat, Boolean, Unit> component4() {
        return this.groupCheckBoxClick;
    }

    public final boolean component5() {
        return this.checked;
    }

    public final NewChat copy(String str, String str2, boolean z, Function2<? super NewChat, ? super Boolean, Unit> function2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        Intrinsics.checkNotNullParameter(str2, "title");
        Intrinsics.checkNotNullParameter(function2, "groupCheckBoxClick");
        return new NewChat(str, str2, z, function2, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewChat)) {
            return false;
        }
        NewChat newChat = (NewChat) obj;
        return Intrinsics.areEqual((Object) this.chatId, (Object) newChat.chatId) && Intrinsics.areEqual((Object) this.title, (Object) newChat.title) && this.groupParticipant == newChat.groupParticipant && Intrinsics.areEqual((Object) this.groupCheckBoxClick, (Object) newChat.groupCheckBoxClick) && this.checked == newChat.checked;
    }

    public Void getLastMessage() {
        return null;
    }

    public int getUnreadCount() {
        return 0;
    }

    public int hashCode() {
        String str = this.chatId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.groupParticipant;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        Function2<? super NewChat, ? super Boolean, Unit> function2 = this.groupCheckBoxClick;
        if (function2 != null) {
            i = function2.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z2 = this.checked;
        if (z2) {
            z2 = true;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public void setLastMessage(Message message) {
    }

    public String toString() {
        return "NewChat(chatId=" + this.chatId + ", title=" + this.title + ", groupParticipant=" + this.groupParticipant + ", groupCheckBoxClick=" + this.groupCheckBoxClick + ", checked=" + this.checked + ")";
    }

    public NewChat(String str, String str2, boolean z, Function2<? super NewChat, ? super Boolean, Unit> function2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        Intrinsics.checkNotNullParameter(str2, "title");
        Intrinsics.checkNotNullParameter(function2, "groupCheckBoxClick");
        this.chatId = str;
        this.title = str2;
        this.groupParticipant = z;
        this.groupCheckBoxClick = function2;
        this.checked = z2;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final boolean getGroupParticipant() {
        return this.groupParticipant;
    }

    public final void setGroupParticipant(boolean z) {
        this.groupParticipant = z;
    }

    public final Function2<NewChat, Boolean, Unit> getGroupCheckBoxClick() {
        return this.groupCheckBoxClick;
    }

    public final void setGroupCheckBoxClick(Function2<? super NewChat, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.groupCheckBoxClick = function2;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final void setChecked(boolean z) {
        this.checked = z;
    }

    public String getDialogPhoto() {
        return this.title;
    }

    public String getId() {
        return this.chatId;
    }

    public List<IUser> getUsers() {
        return CollectionsKt.emptyList();
    }

    public String getDialogName() {
        return this.title;
    }
}
