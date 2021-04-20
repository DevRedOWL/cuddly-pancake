package p035ru.unicorn.ujin.view.activity.navigation.entity;

import p046io.realm.C4641x6c66594a;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.Token */
public class Token extends RealmObject implements C4641x6c66594a {
    private String token;

    public String realmGet$token() {
        return this.token;
    }

    public void realmSet$token(String str) {
        this.token = str;
    }

    public Token() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getToken() {
        return realmGet$token();
    }

    public void setToken(String str) {
        realmSet$token(str);
    }
}
