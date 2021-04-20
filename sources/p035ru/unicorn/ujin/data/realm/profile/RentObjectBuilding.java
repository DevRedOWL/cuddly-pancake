package p035ru.unicorn.ujin.data.realm.profile;

import kotlin.Metadata;
import p046io.realm.C4633x54f3d855;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/profile/RentObjectBuilding;", "Lio/realm/RealmObject;", "id", "", "complex", "Lru/unicorn/ujin/data/realm/profile/RentComplex;", "building", "Lru/unicorn/ujin/data/realm/profile/RentBuilding;", "(JLru/unicorn/ujin/data/realm/profile/RentComplex;Lru/unicorn/ujin/data/realm/profile/RentBuilding;)V", "getBuilding", "()Lru/unicorn/ujin/data/realm/profile/RentBuilding;", "setBuilding", "(Lru/unicorn/ujin/data/realm/profile/RentBuilding;)V", "getComplex", "()Lru/unicorn/ujin/data/realm/profile/RentComplex;", "setComplex", "(Lru/unicorn/ujin/data/realm/profile/RentComplex;)V", "getId", "()J", "setId", "(J)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.profile.RentObjectBuilding */
/* compiled from: RentObject.kt */
public class RentObjectBuilding extends RealmObject implements C4633x54f3d855 {
    private RentBuilding building;
    private RentComplex complex;
    @PrimaryKey

    /* renamed from: id */
    private long f6706id;

    public RentObjectBuilding() {
        this(0, (RentComplex) null, (RentBuilding) null, 7, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public RentBuilding realmGet$building() {
        return this.building;
    }

    public RentComplex realmGet$complex() {
        return this.complex;
    }

    public long realmGet$id() {
        return this.f6706id;
    }

    public void realmSet$building(RentBuilding rentBuilding) {
        this.building = rentBuilding;
    }

    public void realmSet$complex(RentComplex rentComplex) {
        this.complex = rentComplex;
    }

    public void realmSet$id(long j) {
        this.f6706id = j;
    }

    public final long getId() {
        return realmGet$id();
    }

    public final void setId(long j) {
        realmSet$id(j);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RentObjectBuilding(long j, RentComplex rentComplex, RentBuilding rentBuilding, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : j, (i & 2) != 0 ? null : rentComplex, (i & 4) != 0 ? null : rentBuilding);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final RentComplex getComplex() {
        return realmGet$complex();
    }

    public final void setComplex(RentComplex rentComplex) {
        realmSet$complex(rentComplex);
    }

    public final RentBuilding getBuilding() {
        return realmGet$building();
    }

    public final void setBuilding(RentBuilding rentBuilding) {
        realmSet$building(rentBuilding);
    }

    public RentObjectBuilding(long j, RentComplex rentComplex, RentBuilding rentBuilding) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(j);
        realmSet$complex(rentComplex);
        realmSet$building(rentBuilding);
    }
}
