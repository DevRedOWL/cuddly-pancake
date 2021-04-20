package p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4799xd0032ab;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.ApartmentScenarioOptionAdd */
public class ApartmentScenarioOptionAdd extends RealmObject implements C4799xd0032ab {
    @SerializedName("temperature")
    @Expose
    private String temperature;

    public String realmGet$temperature() {
        return this.temperature;
    }

    public void realmSet$temperature(String str) {
        this.temperature = str;
    }

    public String getTemperature() {
        return realmGet$temperature();
    }

    public void setTemperature(String str) {
        realmSet$temperature(str);
    }

    public ApartmentScenarioOptionAdd() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public ApartmentScenarioOptionAdd(String str) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$temperature(str);
    }
}
