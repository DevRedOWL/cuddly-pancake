package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.MainViewmodelFactory */
public class MainViewmodelFactory implements ViewModelProvider.Factory {
    private static MainViewmodelFactory instance;
    private final Map<Class<? extends ViewModel>, ViewModel> viewModels = new HashMap();

    private MainViewmodelFactory() {
    }

    public static MainViewmodelFactory getInstance() {
        if (instance == null) {
            instance = new MainViewmodelFactory();
        }
        return instance;
    }

    public <T extends ViewModel> T create(Class<T> cls) {
        if (this.viewModels.containsKey(cls)) {
            return (ViewModel) this.viewModels.get(cls);
        }
        T mainSmartViewModel = new MainSmartViewModel();
        this.viewModels.put(cls, mainSmartViewModel);
        return mainSmartViewModel;
    }
}
