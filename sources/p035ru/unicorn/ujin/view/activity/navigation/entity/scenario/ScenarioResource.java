package p035ru.unicorn.ujin.view.activity.navigation.entity.scenario;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p035ru.unicorn.ujin.data.realm.Resource;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.scenario.ScenarioResource */
public class ScenarioResource extends Resource<ScenarioResource> {
    @SerializedName("availableScenarios")
    List<Scenario> scenarioList;

    public ScenarioResource(ScenarioResource scenarioResource, Resource.Status status) {
        super(scenarioResource, status);
    }

    public ScenarioResource(Integer num, String str, Resource.Status status) {
        super(num, str, status);
    }

    public ScenarioResource(Resource.Status status) {
        super(status);
    }
}
