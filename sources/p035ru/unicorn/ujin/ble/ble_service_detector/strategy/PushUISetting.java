package p035ru.unicorn.ujin.ble.ble_service_detector.strategy;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006 "}, mo51343d2 = {"Lru/unicorn/ujin/ble/ble_service_detector/strategy/PushUISetting;", "", "isError", "", "message", "", "showButton", "", "buttonMessage", "(ZLjava/lang/String;ILjava/lang/String;)V", "getButtonMessage", "()Ljava/lang/String;", "setButtonMessage", "(Ljava/lang/String;)V", "()Z", "setError", "(Z)V", "getMessage", "setMessage", "getShowButton", "()I", "setShowButton", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.ble.ble_service_detector.strategy.PushUISetting */
/* compiled from: PushUISetting.kt */
public final class PushUISetting {
    private String buttonMessage;
    private boolean isError;
    private String message;
    private int showButton;

    public PushUISetting() {
        this(false, (String) null, 0, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PushUISetting copy$default(PushUISetting pushUISetting, boolean z, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = pushUISetting.isError;
        }
        if ((i2 & 2) != 0) {
            str = pushUISetting.message;
        }
        if ((i2 & 4) != 0) {
            i = pushUISetting.showButton;
        }
        if ((i2 & 8) != 0) {
            str2 = pushUISetting.buttonMessage;
        }
        return pushUISetting.copy(z, str, i, str2);
    }

    public final boolean component1() {
        return this.isError;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.showButton;
    }

    public final String component4() {
        return this.buttonMessage;
    }

    public final PushUISetting copy(boolean z, String str, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(str2, "buttonMessage");
        return new PushUISetting(z, str, i, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushUISetting)) {
            return false;
        }
        PushUISetting pushUISetting = (PushUISetting) obj;
        return this.isError == pushUISetting.isError && Intrinsics.areEqual((Object) this.message, (Object) pushUISetting.message) && this.showButton == pushUISetting.showButton && Intrinsics.areEqual((Object) this.buttonMessage, (Object) pushUISetting.buttonMessage);
    }

    public int hashCode() {
        boolean z = this.isError;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.message;
        int i2 = 0;
        int hashCode = (((i + (str != null ? str.hashCode() : 0)) * 31) + Integer.valueOf(this.showButton).hashCode()) * 31;
        String str2 = this.buttonMessage;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "PushUISetting(isError=" + this.isError + ", message=" + this.message + ", showButton=" + this.showButton + ", buttonMessage=" + this.buttonMessage + ")";
    }

    public PushUISetting(boolean z, String str, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(str2, "buttonMessage");
        this.isError = z;
        this.message = str;
        this.showButton = i;
        this.buttonMessage = str2;
    }

    public final boolean isError() {
        return this.isError;
    }

    public final void setError(boolean z) {
        this.isError = z;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    public final int getShowButton() {
        return this.showButton;
    }

    public final void setShowButton(int i) {
        this.showButton = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PushUISetting(boolean z, String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str2);
    }

    public final String getButtonMessage() {
        return this.buttonMessage;
    }

    public final void setButtonMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.buttonMessage = str;
    }
}
