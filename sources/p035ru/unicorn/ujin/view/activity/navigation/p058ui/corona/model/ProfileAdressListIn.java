package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/ProfileAdressListIn;", "", "apartments", "", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/ProfileAdress;", "(Ljava/util/List;)V", "getApartments", "()Ljava/util/List;", "setApartments", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdressListIn */
/* compiled from: ProfileAdress.kt */
public final class ProfileAdressListIn {
    private List<? extends ProfileAdress> apartments;

    public static /* synthetic */ ProfileAdressListIn copy$default(ProfileAdressListIn profileAdressListIn, List<? extends ProfileAdress> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = profileAdressListIn.apartments;
        }
        return profileAdressListIn.copy(list);
    }

    public final List<ProfileAdress> component1() {
        return this.apartments;
    }

    public final ProfileAdressListIn copy(List<? extends ProfileAdress> list) {
        Intrinsics.checkNotNullParameter(list, "apartments");
        return new ProfileAdressListIn(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ProfileAdressListIn) && Intrinsics.areEqual((Object) this.apartments, (Object) ((ProfileAdressListIn) obj).apartments);
        }
        return true;
    }

    public int hashCode() {
        List<? extends ProfileAdress> list = this.apartments;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "ProfileAdressListIn(apartments=" + this.apartments + ")";
    }

    public ProfileAdressListIn(List<? extends ProfileAdress> list) {
        Intrinsics.checkNotNullParameter(list, "apartments");
        this.apartments = list;
    }

    public final List<ProfileAdress> getApartments() {
        return this.apartments;
    }

    public final void setApartments(List<? extends ProfileAdress> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.apartments = list;
    }
}
