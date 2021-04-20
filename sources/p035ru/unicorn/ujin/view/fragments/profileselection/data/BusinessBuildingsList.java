package p035ru.unicorn.ujin.view.fragments.profileselection.data;

import kotlin.Metadata;
import p046io.realm.C4829xd6b70b4a;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/data/BusinessBuildingsList;", "Lio/realm/RealmObject;", "buildings", "Lio/realm/RealmList;", "Lru/unicorn/ujin/view/fragments/profileselection/data/BusinessBuildings;", "(Lio/realm/RealmList;)V", "getBuildings", "()Lio/realm/RealmList;", "setBuildings", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildingsList */
/* compiled from: BusinessCenterDTO.kt */
public class BusinessBuildingsList extends RealmObject implements C4829xd6b70b4a {
    private RealmList<BusinessBuildings> buildings;

    public BusinessBuildingsList() {
        this((RealmList) null, 1, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public RealmList realmGet$buildings() {
        return this.buildings;
    }

    public void realmSet$buildings(RealmList realmList) {
        this.buildings = realmList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BusinessBuildingsList(RealmList realmList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : realmList);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final RealmList<BusinessBuildings> getBuildings() {
        return realmGet$buildings();
    }

    public final void setBuildings(RealmList<BusinessBuildings> realmList) {
        realmSet$buildings(realmList);
    }

    public BusinessBuildingsList(RealmList<BusinessBuildings> realmList) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$buildings(realmList);
    }
}
