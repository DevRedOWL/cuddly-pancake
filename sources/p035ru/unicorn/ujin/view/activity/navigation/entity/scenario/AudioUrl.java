package p035ru.unicorn.ujin.view.activity.navigation.entity.scenario;

import p046io.realm.C4653xcfc9179b;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.scenario.AudioUrl */
public class AudioUrl extends RealmObject implements C4653xcfc9179b {
    private String url;

    public String realmGet$url() {
        return this.url;
    }

    public void realmSet$url(String str) {
        this.url = str;
    }

    public AudioUrl() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getUrl() {
        return realmGet$url();
    }

    public void setUrl(String str) {
        realmSet$url(str);
    }
}
