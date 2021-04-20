package p035ru.unicorn.ujin.view.activity.navigation.helper;

import p035ru.unicorn.ujin.data.realm.SipParametrs;
import p046io.realm.Realm;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.helper.RealmHelper */
public class RealmHelper {
    public static SipParametrs getSip() {
        return (SipParametrs) Realm.getDefaultInstance().where(SipParametrs.class).findFirst();
    }
}
