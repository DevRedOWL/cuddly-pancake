package p035ru.unicorn.ujin.data.api.response.authorization;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000e"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/authorization/SendingCodeDataResponse;", "", "isNewUser", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.authorization.SendingCodeDataResponse */
/* compiled from: SendingCodeResponse.kt */
public final class SendingCodeDataResponse {
    @SerializedName("is_new_user")
    private final boolean isNewUser;

    public static /* synthetic */ SendingCodeDataResponse copy$default(SendingCodeDataResponse sendingCodeDataResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sendingCodeDataResponse.isNewUser;
        }
        return sendingCodeDataResponse.copy(z);
    }

    public final boolean component1() {
        return this.isNewUser;
    }

    public final SendingCodeDataResponse copy(boolean z) {
        return new SendingCodeDataResponse(z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SendingCodeDataResponse) && this.isNewUser == ((SendingCodeDataResponse) obj).isNewUser;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.isNewUser;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "SendingCodeDataResponse(isNewUser=" + this.isNewUser + ")";
    }

    public SendingCodeDataResponse(boolean z) {
        this.isNewUser = z;
    }

    public final boolean isNewUser() {
        return this.isNewUser;
    }
}
