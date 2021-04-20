package p035ru.unicorn.ujin.view.activity.navigation.entity.scenario;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4657x400ae98f;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.scenario.State */
public class State extends RealmObject implements C4657x400ae98f {
    @SerializedName("state")
    @Expose
    private Integer state;
    @SerializedName("when")
    @Expose
    private String when;

    public Integer realmGet$state() {
        return this.state;
    }

    public String realmGet$when() {
        return this.when;
    }

    public void realmSet$state(Integer num) {
        this.state = num;
    }

    public void realmSet$when(String str) {
        this.when = str;
    }

    public State() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public Integer getState() {
        return realmGet$state();
    }

    public void setState(Integer num) {
        realmSet$state(num);
    }

    public String getWhen() {
        return realmGet$when();
    }

    public void setWhen(String str) {
        realmSet$when(str);
    }
}
