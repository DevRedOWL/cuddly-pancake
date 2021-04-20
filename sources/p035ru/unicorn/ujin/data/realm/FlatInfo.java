package p035ru.unicorn.ujin.data.realm;

import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_FlatInfoRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.FlatInfo */
public class FlatInfo extends RealmObject implements ru_unicorn_ujin_data_realm_FlatInfoRealmProxyInterface {
    private String measure;
    private String square;
    private String title;

    public String realmGet$measure() {
        return this.measure;
    }

    public String realmGet$square() {
        return this.square;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$measure(String str) {
        this.measure = str;
    }

    public void realmSet$square(String str) {
        this.square = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public FlatInfo() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public String getSquare() {
        return realmGet$square();
    }

    public void setSquare(String str) {
        realmSet$square(str);
    }

    public String getMeasure() {
        return realmGet$measure();
    }

    public void setMeasure(String str) {
        realmSet$measure(str);
    }
}
