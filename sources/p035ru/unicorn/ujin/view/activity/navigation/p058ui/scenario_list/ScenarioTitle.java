package p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_list;

import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.scenario_list.ScenarioTitle */
public class ScenarioTitle implements Diffable<ScenarioTitle> {
    private String title;

    public boolean areContentsTheSame(ScenarioTitle scenarioTitle) {
        return false;
    }

    public boolean areItemsTheSame(ScenarioTitle scenarioTitle) {
        return false;
    }

    public ScenarioTitle(String str) {
        this.title = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
