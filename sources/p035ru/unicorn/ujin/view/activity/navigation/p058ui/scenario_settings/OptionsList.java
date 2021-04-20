package p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4801xc5c10e3;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.OptionsList */
public class OptionsList extends RealmObject implements C4801xc5c10e3 {
    @SerializedName("options")
    @Expose
    private RealmList<Options> list;
    @PrimaryKey
    private Integer scenarioId;

    public RealmList realmGet$list() {
        return this.list;
    }

    public Integer realmGet$scenarioId() {
        return this.scenarioId;
    }

    public void realmSet$list(RealmList realmList) {
        this.list = realmList;
    }

    public void realmSet$scenarioId(Integer num) {
        this.scenarioId = num;
    }

    public OptionsList() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public OptionsList(Integer num, RealmList<Options> realmList) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$scenarioId(num);
        realmSet$list(realmList);
    }

    public RealmList<Options> getList() {
        return realmGet$list();
    }

    public void setList(RealmList<Options> realmList) {
        realmSet$list(realmList);
    }

    public Integer getScenarioId() {
        return realmGet$scenarioId();
    }

    public void setScenarioId(Integer num) {
        realmSet$scenarioId(num);
    }
}
