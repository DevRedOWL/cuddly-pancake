package p035ru.unicorn.ujin.data.service.location;

import p046io.realm.C4634x41f3e20d;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.data.service.location.FavoriteBeacon */
public class FavoriteBeacon extends RealmObject implements C4634x41f3e20d {
    @PrimaryKey

    /* renamed from: id */
    private int f6710id;

    public int realmGet$id() {
        return this.f6710id;
    }

    public void realmSet$id(int i) {
        this.f6710id = i;
    }

    public FavoriteBeacon() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public int getId() {
        return realmGet$id();
    }

    public void setId(int i) {
        realmSet$id(i);
    }
}
