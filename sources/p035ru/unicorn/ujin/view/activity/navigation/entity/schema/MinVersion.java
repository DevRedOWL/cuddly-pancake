package p035ru.unicorn.ujin.view.activity.navigation.entity.schema;

import p046io.realm.C4663x8d0eb01f;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.schema.MinVersion */
public class MinVersion extends RealmObject implements C4663x8d0eb01f {

    /* renamed from: android  reason: collision with root package name */
    private Long f7033android;

    public Long realmGet$android() {
        return this.f7033android;
    }

    public void realmSet$android(Long l) {
        this.f7033android = l;
    }

    public MinVersion() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public Long getAndroid() {
        return realmGet$android();
    }

    public void setAndroid(Long l) {
        realmSet$android(l);
    }
}
