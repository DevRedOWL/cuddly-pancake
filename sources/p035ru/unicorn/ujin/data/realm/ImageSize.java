package p035ru.unicorn.ujin.data.realm;

import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_ImageSizeRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.ImageSize */
public class ImageSize extends RealmObject implements ru_unicorn_ujin_data_realm_ImageSizeRealmProxyInterface {
    private Size big;
    private Size small;

    public Size realmGet$big() {
        return this.big;
    }

    public Size realmGet$small() {
        return this.small;
    }

    public void realmSet$big(Size size) {
        this.big = size;
    }

    public void realmSet$small(Size size) {
        this.small = size;
    }

    public ImageSize() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public Size getSmall() {
        return realmGet$small();
    }

    public void setSmall(Size size) {
        realmSet$small(size);
    }

    public Size getBig() {
        return realmGet$big();
    }

    public void setBig(Size size) {
        realmSet$big(size);
    }
}
