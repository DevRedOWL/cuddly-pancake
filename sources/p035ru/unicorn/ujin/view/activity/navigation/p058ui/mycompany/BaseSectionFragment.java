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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding2.view.RxView;
import java.lang.reflect.ParameterizedType;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.BaseSectionFragment */
public abstract class BaseSectionFragment<T extends BaseViewModel> extends BaseFragment {
    protected LinearLayoutManager llm;
    private Class<T> persistentClass;

    /* renamed from: rv */
    protected RecyclerView f6800rv;
    protected SectionedAdapter sectionedAdapter;
    /* access modifiers changed from: protected */
    public T viewModell;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_section_base;
    }

    /* access modifiers changed from: protected */
    public abstract String getMyToolbarTitle();

    /* access modifiers changed from: protected */
    public abstract void initSections();

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

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6800rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6913pb = (ProgressBar) inflate.findViewById(R.id.pb);
        RxView.globalLayouts(inflate).subscribe(new Consumer(inflate) {
            private final /* synthetic */ View f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                BaseSectionFragment.this.lambda$onCreateView$0$BaseSectionFragment(this.f$1, obj);
            }
        });
        onCreateView(inflate);
        initAdapter();
        try {
            this.persistentClass = (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        } catch (ClassCastException unused) {
        }
        return inflate;
    }

    public /* synthetic */ void lambda$onCreateView$0$BaseSectionFragment(View view, Object obj) throws Exception {
        onRootViewChanged(view);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.viewModell = getViewModell();
        onViewCreated(this.viewModell);
        this.viewModell.getShowError().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                BaseSectionFragment.this.showMessage((String) obj);
            }
        });
        this.viewModell.getShowLoader().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                BaseSectionFragment.this.showLoading((Boolean) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public void showLoading(Boolean bool) {
        if (this.f6913pb != null) {
            this.f6913pb.setVisibility(bool.booleanValue() ? 0 : 4);
        }
    }

    /* access modifiers changed from: protected */
    public void initAdapter() {
        this.llm = new LinearLayoutManager(getActivity());
        this.sectionedAdapter = new SectionedAdapter();
        this.f6800rv.setLayoutManager(this.llm);
        this.f6800rv.setAdapter(this.sectionedAdapter);
        initSections();
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
