package p035ru.unicorn.ujin.view.fragments.providerService;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003Ji\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006&"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/providerService/Unavailable;", "", "callback", "Lru/unicorn/ujin/view/fragments/providerService/Callback;", "description", "", "formButtonText", "formButtonUrl", "helpButtonText", "helpPhone", "helpText", "title", "(Lru/unicorn/ujin/view/fragments/providerService/Callback;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCallback", "()Lru/unicorn/ujin/view/fragments/providerService/Callback;", "getDescription", "()Ljava/lang/String;", "getFormButtonText", "getFormButtonUrl", "getHelpButtonText", "getHelpPhone", "getHelpText", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.Unavailable */
/* compiled from: ProviderInfoResponse.kt */
public final class Unavailable {
    private final Callback callback;
    private final String description;
    @SerializedName("form_button_text")
    private final String formButtonText;
    @SerializedName("form_button_url")
    private final String formButtonUrl;
    @SerializedName("help_button_text")
    private final String helpButtonText;
    @SerializedName("help_phone")
    private final String helpPhone;
    @SerializedName("help_text")
    private final String helpText;
    private final String title;

    public static /* synthetic */ Unavailable copy$default(Unavailable unavailable, Callback callback2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        Unavailable unavailable2 = unavailable;
        int i2 = i;
        return unavailable.copy((i2 & 1) != 0 ? unavailable2.callback : callback2, (i2 & 2) != 0 ? unavailable2.description : str, (i2 & 4) != 0 ? unavailable2.formButtonText : str2, (i2 & 8) != 0 ? unavailable2.formButtonUrl : str3, (i2 & 16) != 0 ? unavailable2.helpButtonText : str4, (i2 & 32) != 0 ? unavailable2.helpPhone : str5, (i2 & 64) != 0 ? unavailable2.helpText : str6, (i2 & 128) != 0 ? unavailable2.title : str7);
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
        return this.helpButtonText;
    }

    public final String component6() {
        return this.helpPhone;
    }

    public final String component7() {
        return this.helpText;
    }

    public final String component8() {
        return this.title;
    }

    public final Unavailable copy(Callback callback2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new Unavailable(callback2, str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Unavailable)) {
            return false;
        }
        Unavailable unavailable = (Unavailable) obj;
        return Intrinsics.areEqual((Object) this.callback, (Object) unavailable.callback) && Intrinsics.areEqual((Object) this.description, (Object) unavailable.description) && Intrinsics.areEqual((Object) this.formButtonText, (Object) unavailable.formButtonText) && Intrinsics.areEqual((Object) this.formButtonUrl, (Object) unavailable.formButtonUrl) && Intrinsics.areEqual((Object) this.helpButtonText, (Object) unavailable.helpButtonText) && Intrinsics.areEqual((Object) this.helpPhone, (Object) unavailable.helpPhone) && Intrinsics.areEqual((Object) this.helpText, (Object) unavailable.helpText) && Intrinsics.areEqual((Object) this.title, (Object) unavailable.title);
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
        String str4 = this.helpButtonText;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.helpPhone;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.helpText;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.title;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        return "Unavailable(callback=" + this.callback + ", description=" + this.description + ", formButtonText=" + this.formButtonText + ", formButtonUrl=" + this.formButtonUrl + ", helpButtonText=" + this.helpButtonText + ", helpPhone=" + this.helpPhone + ", helpText=" + this.helpText + ", title=" + this.title + ")";
    }

    public Unavailable(Callback callback2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.callback = callback2;
        this.description = str;
        this.formButtonText = str2;
        this.formButtonUrl = str3;
        this.helpButtonText = str4;
        this.helpPhone = str5;
        this.helpText = str6;
        this.title = str7;
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

    public final String getHelpButtonText() {
        return this.helpButtonText;
    }

    public final String getHelpPhone() {
        return this.helpPhone;
    }

    public final String getHelpText() {
        return this.helpText;
    }

    public final String getTitle() {
        return this.title;
    }
}
