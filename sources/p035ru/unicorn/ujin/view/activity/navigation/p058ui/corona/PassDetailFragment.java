package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.FragmentPassDetailBinding;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.Pass;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0004J\b\u0010\u0013\u001a\u00020\nH\u0014J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J\u0018\u0010!\u001a\u00020\u001d2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#H\u0002J\b\u0010%\u001a\u00020\u001dH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000¨\u0006&"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/corona/PassDetailFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "binding", "Lru/unicorn/databinding/FragmentPassDetailBinding;", "getBinding", "()Lru/unicorn/databinding/FragmentPassDetailBinding;", "setBinding", "(Lru/unicorn/databinding/FragmentPassDetailBinding;)V", "qr", "", "getQr", "()Ljava/lang/String;", "setQr", "(Ljava/lang/String;)V", "vm", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/CoronaViewModel;", "getLayoutRes", "", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "sendBarcodeToMail", "showBarcode", "showDetail", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Pass;", "showToolbar", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.PassDetailFragment */
/* compiled from: PassDetailFragment.kt */
public final class PassDetailFragment extends BaseFragment {
    private HashMap _$_findViewCache;
    public FragmentPassDetailBinding binding;

    /* renamed from: qr */
    private String f6748qr = "";

    /* renamed from: vm */
    private CoronaViewModel f6749vm;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public final int getLayoutRes() {
        return R.layout.fragment_pass_detail;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final FragmentPassDetailBinding getBinding() {
        FragmentPassDetailBinding fragmentPassDetailBinding = this.binding;
        if (fragmentPassDetailBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        return fragmentPassDetailBinding;
    }

    public final void setBinding(FragmentPassDetailBinding fragmentPassDetailBinding) {
        Intrinsics.checkNotNullParameter(fragmentPassDetailBinding, "<set-?>");
        this.binding = fragmentPassDetailBinding;
    }

    public final String getQr() {
        return this.f6748qr;
    }

    public final void setQr(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f6748qr = str;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_pass_detail, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "DataBindingUtil.inflate(…detail, container, false)");
        this.binding = (FragmentPassDetailBinding) inflate;
        FragmentPassDetailBinding fragmentPassDetailBinding = this.binding;
        if (fragmentPassDetailBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        fragmentPassDetailBinding.dynamicBackgroundButton.setOnClickListener(new PassDetailFragment$onCreateView$1(this));
        FragmentPassDetailBinding fragmentPassDetailBinding2 = this.binding;
        if (fragmentPassDetailBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        fragmentPassDetailBinding2.dynamicBackgroundButton2.setOnClickListener(new PassDetailFragment$onCreateView$2(this));
        FragmentPassDetailBinding fragmentPassDetailBinding3 = this.binding;
        if (fragmentPassDetailBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        return fragmentPassDetailBinding3.getRoot();
    }

    /* access modifiers changed from: private */
    public final void sendBarcodeToMail() {
        CoronaViewModel coronaViewModel = this.f6749vm;
        if (coronaViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        coronaViewModel.onSendToMailClick();
        CoronaViewModel coronaViewModel2 = this.f6749vm;
        if (coronaViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        coronaViewModel2.showError.observe(getViewLifecycleOwner(), new PassDetailFragment$sendBarcodeToMail$1(this));
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ViewModel viewModel = ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(CoronaViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…onaViewModel::class.java)");
        this.f6749vm = (CoronaViewModel) viewModel;
        CoronaViewModel coronaViewModel = this.f6749vm;
        if (coronaViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        coronaViewModel.getCurrentPassDetail();
        CoronaViewModel coronaViewModel2 = this.f6749vm;
        if (coronaViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        coronaViewModel2.getPassDetailMutable().observe(getViewLifecycleOwner(), new PassDetailFragment$onViewCreated$1(this));
    }

    /* access modifiers changed from: private */
    public final void showDetail(Resource<Pass> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null && status.equals(Resource.Status.SUCCESS)) {
            FragmentPassDetailBinding fragmentPassDetailBinding = this.binding;
            if (fragmentPassDetailBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            fragmentPassDetailBinding.setPass(resource.getData());
            this.f6748qr = resource.getData().getQr();
        }
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.label_my_pass));
    }

    /* access modifiers changed from: private */
    public final void showBarcode() {
        nextFragment(PassBarcodeFragment.Companion.start(this.f6748qr), false);
    }
}
