package p035ru.unicorn.ujin.data.realm;

import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.UnreadBadge */
public class UnreadBadge extends RealmObject implements ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxyInterface {
    boolean hasUnread;

    public boolean realmGet$hasUnread() {
        return this.hasUnread;
    }

    public void realmSet$hasUnread(boolean z) {
        this.hasUnread = z;
    }

    public UnreadBadge() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public boolean isHasUnread() {
        return realmGet$hasUnread();
    }

    public void setHasUnread(boolean z) {
        realmSet$hasUnread(z);
    }
}
