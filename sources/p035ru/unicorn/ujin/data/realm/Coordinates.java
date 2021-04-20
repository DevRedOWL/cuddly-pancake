package p035ru.unicorn.ujin.data.realm;

import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_CoordinatesRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.Coordinates */
public class Coordinates extends RealmObject implements ru_unicorn_ujin_data_realm_CoordinatesRealmProxyInterface {

    /* renamed from: x */
    private Double f6648x;

    /* renamed from: y */
    private Double f6649y;

    public Double realmGet$x() {
        return this.f6648x;
    }

    public Double realmGet$y() {
        return this.f6649y;
    }

    public void realmSet$x(Double d) {
        this.f6648x = d;
    }

    public void realmSet$y(Double d) {
        this.f6649y = d;
    }

    public Coordinates() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public Double getX() {
        return realmGet$x();
    }

    public void setX(Double d) {
        realmSet$x(d);
    }

    public Double getY() {
        return realmGet$y();
    }

    public void setY(Double d) {
        realmSet$y(d);
    }
}
