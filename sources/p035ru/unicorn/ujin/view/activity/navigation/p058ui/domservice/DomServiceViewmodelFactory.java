package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceViewmodelFactory */
public class DomServiceViewmodelFactory implements ViewModelProvider.Factory {
    private static DomServiceViewmodelFactory instance;
    private final Map<Class<? extends ViewModel>, ViewModel> viewModels = new HashMap();

    private DomServiceViewmodelFactory() {
    }

    public static DomServiceViewmodelFactory getInstance() {
        if (instance == null) {
            instance = new DomServiceViewmodelFactory();
        }
        return instance;
    }

    public <T extends ViewModel> T create(Class<T> cls) {
        if (this.viewModels.containsKey(cls)) {
            return (ViewModel) this.viewModels.get(cls);
        }
        T domServiceViewModel = new DomServiceViewModel();
        this.viewModels.put(cls, domServiceViewModel);
        return domServiceViewModel;
    }
}
