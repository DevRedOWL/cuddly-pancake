package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.ProfielTabViewmodelFactory */
public class ProfielTabViewmodelFactory implements ViewModelProvider.Factory {
    private static ProfielTabViewmodelFactory instance;
    private final Map<Class<? extends ViewModel>, ViewModel> viewModels = new HashMap();

    private ProfielTabViewmodelFactory() {
    }

    public static ProfielTabViewmodelFactory getInstance() {
        if (instance == null) {
            instance = new ProfielTabViewmodelFactory();
        }
        return instance;
    }

    public <T extends ViewModel> T create(Class<T> cls) {
        if (this.viewModels.containsKey(cls)) {
            return (ViewModel) this.viewModels.get(cls);
        }
        T profileTabViewModel = new ProfileTabViewModel();
        this.viewModels.put(cls, profileTabViewModel);
        return profileTabViewModel;
    }
}
