package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.jakewharton.rxbinding2.view.RxView;
import java.lang.reflect.ParameterizedType;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.fragments.makearecord.AttachBaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.BaseBindingFragment */
public abstract class BaseBindingFragment<T extends BaseViewModel, DB extends ViewDataBinding> extends AttachBaseFragment {
    private DB mViewDataBinding;
    private Class<T> persistentClass;
    private T viewModell;

    /* access modifiers changed from: protected */
    public abstract int getLayoutRes();

    /* access modifiers changed from: protected */
    public abstract String getMyToolbarTitle();

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public void onCreateView(View view) {
    }

    /* access modifiers changed from: protected */
    public void onRootViewChanged(View view) {
    }

    /* access modifiers changed from: protected */
    public abstract void onViewCreated(T t);

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(true);
        this.mViewDataBinding = DataBindingUtil.inflate(layoutInflater, getLayoutRes(), viewGroup, false);
        this.mViewDataBinding.setLifecycleOwner(this);
        this.mViewDataBinding.executePendingBindings();
        View root = this.mViewDataBinding.getRoot();
        this.f6913pb = (ProgressBar) root.findViewById(R.id.pb);
        RxView.globalLayouts(root).subscribe(new Consumer(root) {
            private final /* synthetic */ View f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                BaseBindingFragment.this.lambda$onCreateView$0$BaseBindingFragment(this.f$1, obj);
            }
        });
        try {
            this.persistentClass = (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        } catch (ClassCastException unused) {
        }
        onCreateView(root);
        return root;
    }

    public /* synthetic */ void lambda$onCreateView$0$BaseBindingFragment(View view, Object obj) throws Exception {
        onRootViewChanged(view);
    }

    public DB getViewDataBinding() {
        return this.mViewDataBinding;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.viewModell = getViewModell();
        onViewCreated(this.viewModell);
        this.viewModell.getShowError().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                BaseBindingFragment.this.showMessage((String) obj);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getMyToolbarTitle());
    }

    public T getViewModell() {
        return (BaseViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(this.persistentClass);
    }
}
