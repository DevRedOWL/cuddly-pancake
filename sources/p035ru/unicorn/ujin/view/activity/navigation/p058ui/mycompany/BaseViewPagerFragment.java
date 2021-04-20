package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.jakewharton.rxbinding2.view.RxView;
import java.lang.reflect.ParameterizedType;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

@Deprecated
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.BaseViewPagerFragment */
public abstract class BaseViewPagerFragment<T extends BaseViewModel> extends BaseFragment {
    private Class<T> persistentClass;
    protected TabLayout tabLayout;
    private T viewModell;
    protected ViewPager viewPager;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_tabs_with_viewpager;
    }

    /* access modifiers changed from: protected */
    public abstract String getMyToolbarTitle();

    /* access modifiers changed from: protected */
    public abstract void initViewPager(ViewPager viewPager2);

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public void onCreateView(View view) {
    }

    /* access modifiers changed from: protected */
    public void onRootViewChanged(View view) {
    }

    public abstract void onViewCreated(T t);

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.viewPager = (ViewPager) inflate.findViewById(R.id.pager);
        this.f6913pb = (ProgressBar) inflate.findViewById(R.id.pb);
        this.tabLayout = (TabLayout) inflate.findViewById(R.id.tab_layout);
        this.tabLayout.setupWithViewPager(this.viewPager);
        RxView.globalLayouts(inflate).subscribe(new Consumer(inflate) {
            private final /* synthetic */ View f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                BaseViewPagerFragment.this.lambda$onCreateView$0$BaseViewPagerFragment(this.f$1, obj);
            }
        });
        onCreateView(inflate);
        initViewPager(this.viewPager);
        this.persistentClass = (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return inflate;
    }

    public /* synthetic */ void lambda$onCreateView$0$BaseViewPagerFragment(View view, Object obj) throws Exception {
        onRootViewChanged(view);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.viewModell = getViewModell();
        onViewCreated(this.viewModell);
        this.viewModell.getShowError().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                BaseViewPagerFragment.this.showMessage((String) obj);
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
