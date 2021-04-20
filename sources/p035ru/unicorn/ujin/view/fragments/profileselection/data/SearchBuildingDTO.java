package p035ru.unicorn.ujin.view.fragments.profileselection.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4837xdc5751e4;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/data/SearchBuildingDTO;", "Lio/realm/RealmObject;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "complex", "Lru/unicorn/ujin/view/fragments/profileselection/data/SearchComplex;", "building", "Lru/unicorn/ujin/view/fragments/profileselection/data/BusinessBuildings;", "(Lru/unicorn/ujin/view/fragments/profileselection/data/SearchComplex;Lru/unicorn/ujin/view/fragments/profileselection/data/BusinessBuildings;)V", "getBuilding", "()Lru/unicorn/ujin/view/fragments/profileselection/data/BusinessBuildings;", "setBuilding", "(Lru/unicorn/ujin/view/fragments/profileselection/data/BusinessBuildings;)V", "getComplex", "()Lru/unicorn/ujin/view/fragments/profileselection/data/SearchComplex;", "setComplex", "(Lru/unicorn/ujin/view/fragments/profileselection/data/SearchComplex;)V", "areContentsTheSame", "", "other", "areItemsTheSame", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO */
/* compiled from: SearchBuildingDTO.kt */
public class SearchBuildingDTO extends RealmObject implements Diffable<SearchBuildingDTO>, C4837xdc5751e4 {
    private BusinessBuildings building;
    private SearchComplex complex;

    public SearchBuildingDTO() {
        this((SearchComplex) null, (BusinessBuildings) null, 3, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public BusinessBuildings realmGet$building() {
        return this.building;
    }

    public SearchComplex realmGet$complex() {
        return this.complex;
    }

    public void realmSet$building(BusinessBuildings businessBuildings) {
        this.building = businessBuildings;
    }

    public void realmSet$complex(SearchComplex searchComplex) {
        this.complex = searchComplex;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchBuildingDTO(SearchComplex searchComplex, BusinessBuildings businessBuildings, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : searchComplex, (i & 2) != 0 ? null : businessBuildings);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final SearchComplex getComplex() {
        return realmGet$complex();
    }

    public final void setComplex(SearchComplex searchComplex) {
        realmSet$complex(searchComplex);
    }

    public final BusinessBuildings getBuilding() {
        return realmGet$building();
    }

    public final void setBuilding(BusinessBuildings businessBuildings) {
        realmSet$building(businessBuildings);
    }

    public SearchBuildingDTO(SearchComplex searchComplex, BusinessBuildings businessBuildings) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$complex(searchComplex);
        realmSet$building(businessBuildings);
    }

    public boolean areItemsTheSame(SearchBuildingDTO searchBuildingDTO) {
        BusinessBuildings realmGet$building;
        BusinessBuildings realmGet$building2 = realmGet$building();
        Integer num = null;
        Integer valueOf = realmGet$building2 != null ? Integer.valueOf(realmGet$building2.getId()) : null;
        if (!(searchBuildingDTO == null || (realmGet$building = searchBuildingDTO.realmGet$building()) == null)) {
            num = Integer.valueOf(realmGet$building.getId());
        }
        return Intrinsics.areEqual((Object) valueOf, (Object) num);
    }

    public boolean areContentsTheSame(SearchBuildingDTO searchBuildingDTO) {
        BusinessBuildings realmGet$building;
        BusinessBuildings realmGet$building2 = realmGet$building();
        String str = null;
        String title = realmGet$building2 != null ? realmGet$building2.getTitle() : null;
        if (!(searchBuildingDTO == null || (realmGet$building = searchBuildingDTO.realmGet$building()) == null)) {
            str = realmGet$building.getTitle();
        }
        return Intrinsics.areEqual((Object) title, (Object) str);
    }
}
