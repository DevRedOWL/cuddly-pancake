package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.CompanyObject;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0014J&\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0015\u001a\u00020\b2\u0010\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017H\u0002J\b\u0010\u0019\u001a\u00020\bH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyObjectListFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "objectListAdapter", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyObjectListAdapter;", "viewModell", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/MyRentaCompanyViewModel;", "initDefaultToolbar", "", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showCompanyObjects", "companyObjects", "", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/response/CompanyObject;", "showToolbar", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.CompanyObjectListFragment */
/* compiled from: CompanyObjectListFragment.kt */
public final class CompanyObjectListFragment extends BaseFragment {
    private HashMap _$_findViewCache;
    private CompanyObjectListAdapter objectListAdapter;
    /* access modifiers changed from: private */
    public MyRentaCompanyViewModel viewModell;

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
    public String metricsScreenName() {
        return "Экран списка помещений компании";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ MyRentaCompanyViewModel access$getViewModell$p(CompanyObjectListFragment companyObjectListFragment) {
        MyRentaCompanyViewModel myRentaCompanyViewModel = companyObjectListFragment.viewModell;
        if (myRentaCompanyViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModell");
        }
        return myRentaCompanyViewModel;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        initDefaultToolbar();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_company_object_list, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ViewModel viewModel = ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaCompanyViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…anyViewModel::class.java)");
        this.viewModell = (MyRentaCompanyViewModel) viewModel;
        MyRentaCompanyViewModel myRentaCompanyViewModel = this.viewModell;
        if (myRentaCompanyViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModell");
        }
        SingleLiveEvent<List<CompanyObject>> companyObjectsMutableLiveData = myRentaCompanyViewModel.getCompanyObjectsMutableLiveData();
        Intrinsics.checkNotNullExpressionValue(companyObjectsMutableLiveData, "viewModell.companyObjectsMutableLiveData");
        List value = companyObjectsMutableLiveData.getValue();
        if (value != null) {
            showCompanyObjects(value);
            return;
        }
        CompanyObjectListFragment companyObjectListFragment = this;
        RecyclerView recyclerView = (RecyclerView) companyObjectListFragment._$_findCachedViewById(C5619R.C5622id.rvObjectList);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rvObjectList");
        recyclerView.setVisibility(8);
        TextView textView = (TextView) companyObjectListFragment._$_findCachedViewById(C5619R.C5622id.tvNoObjects);
        Intrinsics.checkNotNullExpressionValue(textView, "tvNoObjects");
        textView.setVisibility(0);
    }

    private final void showCompanyObjects(List<CompanyObject> list) {
        List list2;
        if (list == null || (list2 = CollectionsKt.filterNotNull(list)) == null) {
            list2 = CollectionsKt.emptyList();
        }
        if (list2.isEmpty()) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvObjectList);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "rvObjectList");
            recyclerView.setVisibility(8);
            TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoObjects);
            Intrinsics.checkNotNullExpressionValue(textView, "tvNoObjects");
            textView.setVisibility(0);
            return;
        }
        TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoObjects);
        Intrinsics.checkNotNullExpressionValue(textView2, "tvNoObjects");
        textView2.setVisibility(8);
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvObjectList);
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "rvObjectList");
        recyclerView2.setVisibility(0);
        this.objectListAdapter = new CompanyObjectListAdapter(list2, new CompanyObjectListFragment$showCompanyObjects$1(this));
        RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvObjectList);
        recyclerView3.setLayoutManager(new LinearLayoutManager(recyclerView3.getContext()));
        recyclerView3.addItemDecoration(new DividerItemDecoration(recyclerView3.getContext(), 1));
        recyclerView3.setAdapter(this.objectListAdapter);
    }

    private final void initDefaultToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.company_objects));
    }
}
