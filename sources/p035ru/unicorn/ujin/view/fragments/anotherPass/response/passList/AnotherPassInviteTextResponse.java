package p035ru.unicorn.ujin.view.fragments.anotherPass.response.passList;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/AnotherPassInviteTextResponse;", "", "command", "", "data", "Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/InviteData;", "error", "", "message", "(Ljava/lang/String;Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/InviteData;ILjava/lang/String;)V", "getCommand", "()Ljava/lang/String;", "getData", "()Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/InviteData;", "getError", "()I", "getMessage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.response.passList.AnotherPassInviteTextResponse */
/* compiled from: AnotherPassInviteTextResponse.kt */
public final class AnotherPassInviteTextResponse {
    private final String command;
    private final InviteData data;
    private final int error;
    private final String message;

    public static /* synthetic */ AnotherPassInviteTextResponse copy$default(AnotherPassInviteTextResponse anotherPassInviteTextResponse, String str, InviteData inviteData, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = anotherPassInviteTextResponse.command;
        }
        if ((i2 & 2) != 0) {
            inviteData = anotherPassInviteTextResponse.data;
        }
        if ((i2 & 4) != 0) {
            i = anotherPassInviteTextResponse.error;
        }
        if ((i2 & 8) != 0) {
            str2 = anotherPassInviteTextResponse.message;
        }
        return anotherPassInviteTextResponse.copy(str, inviteData, i, str2);
    }

    public final String component1() {
        return this.command;
    }

    public final InviteData component2() {
        return this.data;
    }

    public final int component3() {
        return this.error;
    }

    public final String component4() {
        return this.message;
    }

    public final AnotherPassInviteTextResponse copy(String str, InviteData inviteData, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, "command");
        Intrinsics.checkNotNullParameter(inviteData, "data");
        Intrinsics.checkNotNullParameter(str2, "message");
        return new AnotherPassInviteTextResponse(str, inviteData, i, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnotherPassInviteTextResponse)) {
            return false;
        }
        AnotherPassInviteTextResponse anotherPassInviteTextResponse = (AnotherPassInviteTextResponse) obj;
        return Intrinsics.areEqual((Object) this.command, (Object) anotherPassInviteTextResponse.command) && Intrinsics.areEqual((Object) this.data, (Object) anotherPassInviteTextResponse.data) && this.error == anotherPassInviteTextResponse.error && Intrinsics.areEqual((Object) this.message, (Object) anotherPassInviteTextResponse.message);
    }

    public int hashCode() {
        String str = this.command;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        InviteData inviteData = this.data;
        int hashCode2 = (((hashCode + (inviteData != null ? inviteData.hashCode() : 0)) * 31) + Integer.valueOf(this.error).hashCode()) * 31;
        String str2 = this.message;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "AnotherPassInviteTextResponse(command=" + this.command + ", data=" + this.data + ", error=" + this.error + ", message=" + this.message + ")";
    }

    public AnotherPassInviteTextResponse(String str, InviteData inviteData, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, "command");
        Intrinsics.checkNotNullParameter(inviteData, "data");
        Intrinsics.checkNotNullParameter(str2, "message");
        this.command = str;
        this.data = inviteData;
        this.error = i;
        this.message = str2;
    }

    public final String getCommand() {
        return this.command;
    }

    public final InviteData getData() {
        return this.data;
    }

    public final int getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }
}
