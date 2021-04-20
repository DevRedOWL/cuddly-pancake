package p035ru.unicorn.ujin.viewModel;

import android.app.Application;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Provider;

/* renamed from: ru.unicorn.ujin.viewModel.ViewModelFactory */
public class ViewModelFactory implements ViewModelProvider.Factory {
    private static volatile ViewModelFactory INSTANCE;
    private Map<Class<? extends ViewModel>, Provider<ViewModel>> creators;
    private final Application mApplication;

    private ViewModelFactory(Application application) {
        this.mApplication = application;
    }

    public static ViewModelFactory getInstance(Application application) {
        if (INSTANCE == null) {
            synchronized (ViewModelFactory.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ViewModelFactory(application);
                }
            }
        }
        return INSTANCE;
    }

    public <T extends ViewModel> T create(Class<T> cls) {
        Provider provider = this.creators.get(cls);
        Iterator<Map.Entry<Class<? extends ViewModel>, Provider<ViewModel>>> it = this.creators.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            if (cls.isAssignableFrom((Class) next.getKey())) {
                provider = (Provider) next.getValue();
                break;
            }
        }
        if (provider != null) {
            try {
                return (ViewModel) provider.get();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalArgumentException("fjskfjksdjfksdf " + cls);
        }
    }
}
