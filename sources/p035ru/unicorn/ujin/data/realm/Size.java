package p035ru.unicorn.ujin.data.realm;

import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_SizeRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.Size */
public class Size extends RealmObject implements ru_unicorn_ujin_data_realm_SizeRealmProxyInterface {

    /* renamed from: x */
    private Integer f6664x;

    /* renamed from: y */
    private Integer f6665y;

    public Integer realmGet$x() {
        return this.f6664x;
    }

    public Integer realmGet$y() {
        return this.f6665y;
    }

    public void realmSet$x(Integer num) {
        this.f6664x = num;
    }

    public void realmSet$y(Integer num) {
        this.f6665y = num;
    }

    public Size() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public Integer getX() {
        return realmGet$x();
    }

    public void setX(Integer num) {
        realmSet$x(num);
    }

    public Integer getY() {
        return realmGet$y();
    }

    public void setY(Integer num) {
        realmSet$y(num);
    }
}
