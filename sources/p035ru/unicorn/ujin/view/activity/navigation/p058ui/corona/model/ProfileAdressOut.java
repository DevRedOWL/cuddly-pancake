package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Contact;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/ProfileAdressOut;", "", "address", "", "(Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdressOut */
/* compiled from: ProfileAdressOut.kt */
public final class ProfileAdressOut {
    private String address;

    public ProfileAdressOut() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ProfileAdressOut copy$default(ProfileAdressOut profileAdressOut, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileAdressOut.address;
        }
        return profileAdressOut.copy(str);
    }

    public final String component1() {
        return this.address;
    }

    public final ProfileAdressOut copy(String str) {
        Intrinsics.checkNotNullParameter(str, Contact.Type.address);
        return new ProfileAdressOut(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ProfileAdressOut) && Intrinsics.areEqual((Object) this.address, (Object) ((ProfileAdressOut) obj).address);
        }
        return true;
    }

    public int hashCode() {
        String str = this.address;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "ProfileAdressOut(address=" + this.address + ")";
    }

    public ProfileAdressOut(String str) {
        Intrinsics.checkNotNullParameter(str, Contact.Type.address);
        this.address = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileAdressOut(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public final String getAddress() {
        return this.address;
    }

    public final void setAddress(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }
}
