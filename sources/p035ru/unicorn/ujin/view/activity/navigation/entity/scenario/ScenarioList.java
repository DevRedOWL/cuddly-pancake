package p035ru.unicorn.ujin.view.activity.navigation.entity.scenario;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.scenario.ScenarioList */
public class ScenarioList {
    @SerializedName("availableScenarios")
    List<Scenario> scenarioList;

    public List<Scenario> getScenarioList() {
        return this.scenarioList;
    }

    public void setScenarioList(List<Scenario> list) {
        this.scenarioList = list;
    }
}
