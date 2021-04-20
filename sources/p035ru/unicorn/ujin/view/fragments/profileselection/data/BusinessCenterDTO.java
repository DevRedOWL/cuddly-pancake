package p035ru.unicorn.ujin.view.fragments.profileselection.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4833x9f81c4dd;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010\u001a\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0000H\u0016R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/data/BusinessCenterDTO;", "Lio/realm/RealmObject;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "id", "", "title", "", "buildings", "Lio/realm/RealmList;", "Lru/unicorn/ujin/view/fragments/profileselection/data/BusinessBuildings;", "(ILjava/lang/String;Lio/realm/RealmList;)V", "getBuildings", "()Lio/realm/RealmList;", "setBuildings", "(Lio/realm/RealmList;)V", "getId", "()I", "setId", "(I)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "areContentsTheSame", "", "other", "areItemsTheSame", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO */
/* compiled from: BusinessCenterDTO.kt */
public class BusinessCenterDTO extends RealmObject implements Diffable<BusinessCenterDTO>, C4833x9f81c4dd {
    private RealmList<BusinessBuildings> buildings;
    @PrimaryKey

    /* renamed from: id */
    private int f6942id;
    private String title;

    public BusinessCenterDTO() {
        this(0, (String) null, (RealmList) null, 7, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public RealmList realmGet$buildings() {
        return this.buildings;
    }

    public int realmGet$id() {
        return this.f6942id;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$buildings(RealmList realmList) {
        this.buildings = realmList;
    }

    public void realmSet$id(int i) {
        this.f6942id = i;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public final int getId() {
        return realmGet$id();
    }

    public final void setId(int i) {
        realmSet$id(i);
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$title(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BusinessCenterDTO(int i, String str, RealmList realmList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : realmList);
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

    public BusinessCenterDTO(int i, String str, RealmList<BusinessBuildings> realmList) {
        Intrinsics.checkNotNullParameter(str, "title");
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(i);
        realmSet$title(str);
        realmSet$buildings(realmList);
    }

    public boolean areItemsTheSame(BusinessCenterDTO businessCenterDTO) {
        return businessCenterDTO != null && realmGet$id() == businessCenterDTO.realmGet$id();
    }

    public boolean areContentsTheSame(BusinessCenterDTO businessCenterDTO) {
        return Intrinsics.areEqual((Object) realmGet$title(), (Object) businessCenterDTO != null ? businessCenterDTO.realmGet$title() : null);
    }
}
