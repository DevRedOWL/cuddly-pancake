package p035ru.unicorn.ujin.view.activity.navigation.entity.schema;

import p046io.realm.C4665x86a78bbf;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaCallback */
public class SchemaCallback extends RealmObject implements C4665x86a78bbf {
    private String url;

    public String realmGet$url() {
        return this.url;
    }

    public void realmSet$url(String str) {
        this.url = str;
    }

    public SchemaCallback() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getUrl() {
        return realmGet$url();
    }
}
