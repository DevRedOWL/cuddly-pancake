package p035ru.unicorn.ujin.data.realm;

import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_CityTitleRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.CityTitle */
public class CityTitle extends RealmObject implements ru_unicorn_ujin_data_realm_CityTitleRealmProxyInterface {
    private String title;

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public CityTitle() {
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
}
