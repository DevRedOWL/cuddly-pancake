package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;

public class ViewModelProviders {
    private static Application checkApplication(Activity activity) {
        Application application = activity.getApplication();
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }

    private static Activity checkActivity(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }

    /* renamed from: of */
    public static ViewModelProvider m10of(Fragment fragment) {
        return m11of(fragment, (ViewModelProvider.Factory) null);
    }

    /* renamed from: of */
    public static ViewModelProvider m12of(FragmentActivity fragmentActivity) {
        return m13of(fragmentActivity, (ViewModelProvider.Factory) null);
    }

    /* renamed from: of */
    public static ViewModelProvider m11of(Fragment fragment, ViewModelProvider.Factory factory) {
        Application checkApplication = checkApplication(checkActivity(fragment));
        if (factory == null) {
            factory = ViewModelProvider.AndroidViewModelFactory.getInstance(checkApplication);
        }
        return new ViewModelProvider(fragment.getViewModelStore(), factory);
    }

    /* renamed from: of */
    public static ViewModelProvider m13of(FragmentActivity fragmentActivity, ViewModelProvider.Factory factory) {
        Application checkApplication = checkApplication(fragmentActivity);
        if (factory == null) {
            factory = ViewModelProvider.AndroidViewModelFactory.getInstance(checkApplication);
        }
        return new ViewModelProvider(fragmentActivity.getViewModelStore(), factory);
    }

    @Deprecated
    public static class DefaultFactory extends ViewModelProvider.AndroidViewModelFactory {
        @Deprecated
        public DefaultFactory(Application application) {
            super(application);
        }
    }
}
