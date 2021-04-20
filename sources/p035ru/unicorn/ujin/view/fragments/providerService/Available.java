package p035ru.unicorn.ujin.view.fragments.providerService;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003JQ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006 "}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/providerService/Available;", "", "callback", "Lru/unicorn/ujin/view/fragments/providerService/Callback;", "description", "", "formButtonText", "formButtonUrl", "submitButtonText", "formText", "(Lru/unicorn/ujin/view/fragments/providerService/Callback;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCallback", "()Lru/unicorn/ujin/view/fragments/providerService/Callback;", "getDescription", "()Ljava/lang/String;", "getFormButtonText", "getFormButtonUrl", "getFormText", "getSubmitButtonText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.Available */
/* compiled from: ProviderInfoResponse.kt */
public final class Available {
    private final Callback callback;
    private final String description;
    @SerializedName("form_button_text")
    private final String formButtonText;
    @SerializedName("form_button_url")
    private final String formButtonUrl;
    @SerializedName("form_text")
    private final String formText;
    @SerializedName("submit_button_text")
    private final String submitButtonText;

    public static /* synthetic */ Available copy$default(Available available, Callback callback2, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            callback2 = available.callback;
        }
        if ((i & 2) != 0) {
            str = available.description;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = available.formButtonText;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = available.formButtonUrl;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = available.submitButtonText;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = available.formText;
        }
        return available.copy(callback2, str6, str7, str8, str9, str5);
    }

    public final Callback component1() {
        return this.callback;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.formButtonText;
    }

    public final String component4() {
        return this.formButtonUrl;
    }

    public final String component5() {
        return this.submitButtonText;
    }

    public final String component6() {
        return this.formText;
    }

    public final Available copy(Callback callback2, String str, String str2, String str3, String str4, String str5) {
        return new Available(callback2, str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Available)) {
            return false;
        }
        Available available = (Available) obj;
        return Intrinsics.areEqual((Object) this.callback, (Object) available.callback) && Intrinsics.areEqual((Object) this.description, (Object) available.description) && Intrinsics.areEqual((Object) this.formButtonText, (Object) available.formButtonText) && Intrinsics.areEqual((Object) this.formButtonUrl, (Object) available.formButtonUrl) && Intrinsics.areEqual((Object) this.submitButtonText, (Object) available.submitButtonText) && Intrinsics.areEqual((Object) this.formText, (Object) available.formText);
    }

    public int hashCode() {
        Callback callback2 = this.callback;
        int i = 0;
        int hashCode = (callback2 != null ? callback2.hashCode() : 0) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.formButtonText;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.formButtonUrl;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.submitButtonText;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.formText;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "Available(callback=" + this.callback + ", description=" + this.description + ", formButtonText=" + this.formButtonText + ", formButtonUrl=" + this.formButtonUrl + ", submitButtonText=" + this.submitButtonText + ", formText=" + this.formText + ")";
    }

    public Available(Callback callback2, String str, String str2, String str3, String str4, String str5) {
        this.callback = callback2;
        this.description = str;
        this.formButtonText = str2;
        this.formButtonUrl = str3;
        this.submitButtonText = str4;
        this.formText = str5;
    }

    public final Callback getCallback() {
        return this.callback;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFormButtonText() {
        return this.formButtonText;
    }

    public final String getFormButtonUrl() {
        return this.formButtonUrl;
    }

    public final String getSubmitButtonText() {
        return this.submitButtonText;
    }

    public final String getFormText() {
        return this.formText;
    }
}
