package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart;

import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;
import p035ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.IMainSmartFragment */
interface IMainSmartFragment {
    void setFilter();

    void showErrorNotification();

    void showHardware(List<Hardware> list);

    void showIntellect(Intellect intellect);

    void showScenario(List<Scenario> list);
}
