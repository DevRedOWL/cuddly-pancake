package p035ru.unicorn.ujin.view.activity.navigation.entity.scenario;

import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.scenario.OnScenarioClick */
public interface OnScenarioClick {
    void onChangeScenario(int i, List<Scenario> list, boolean z);

    void onSccenarioLongClick(int i, String str);
}
