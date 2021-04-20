package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.CompanyBuilding;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.CompanyObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.AttrRenta;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.fragments.BaseTitleFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0014J\u001a\u0010\u000e\u001a\u00020\u000f2\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011H\u0002J\u001a\u0010\u0013\u001a\u00020\u000f2\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0011H\u0002J\u001a\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/ChooseObjectListFragment;", "Lru/unicorn/ujin/view/fragments/BaseTitleFragment;", "()V", "chooseObjectListAdapter", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/ChooseObjectListAdapter;", "lastObject", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/response/CompanyObject;", "selectedObject", "viewModell", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/MyRentaCompanyViewModel;", "getLayoutRes", "", "metricsScreenName", "", "onDeletePlaceResult", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/EmployerListSingle;", "onSetPlaceResult", "Lru/unicorn/ujin/data/api/response/SimpleResponse;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showToolbar", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.ChooseObjectListFragment */
/* compiled from: ChooseObjectListFragment.kt */
public final class ChooseObjectListFragment extends BaseTitleFragment {
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public ChooseObjectListAdapter chooseObjectListAdapter;
    /* access modifiers changed from: private */
    public CompanyObject lastObject;
    /* access modifiers changed from: private */
    public CompanyObject selectedObject;
    /* access modifiers changed from: private */
    public MyRentaCompanyViewModel viewModell;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.ChooseObjectListFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 3;
            $EnumSwitchMapping$1[Resource.Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$1[Resource.Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$1[Resource.Status.LOADING.ordinal()] = 3;
        }
    }

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

    public int getLayoutRes() {
        return R.layout.fragment_choose_object;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "Выбор помещения сотрудника";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ ChooseObjectListAdapter access$getChooseObjectListAdapter$p(ChooseObjectListFragment chooseObjectListFragment) {
        ChooseObjectListAdapter chooseObjectListAdapter2 = chooseObjectListFragment.chooseObjectListAdapter;
        if (chooseObjectListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chooseObjectListAdapter");
        }
        return chooseObjectListAdapter2;
    }

    public static final /* synthetic */ MyRentaCompanyViewModel access$getViewModell$p(ChooseObjectListFragment chooseObjectListFragment) {
        MyRentaCompanyViewModel myRentaCompanyViewModel = chooseObjectListFragment.viewModell;
        if (myRentaCompanyViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModell");
        }
        return myRentaCompanyViewModel;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        super.showToolbar();
        BaseActivity baseActivity = getBaseActivity();
        View[] viewArr = new View[1];
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.item_toolbar_blue_button, getBaseActivity().llButtonsRight, false);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            textView.setText(getString(R.string.profileSave));
            textView.setOnClickListener(new ChooseObjectListFragment$showToolbar$$inlined$apply$lambda$1(textView, this));
            Unit unit = Unit.INSTANCE;
            viewArr[0] = textView;
            baseActivity.setToolbarRight(CollectionsKt.arrayListOf(viewArr));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    public final void onDeletePlaceResult(Resource<EmployerListSingle> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                progressBar.setVisibility(4);
                MyRentaCompanyViewModel myRentaCompanyViewModel = this.viewModell;
                if (myRentaCompanyViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModell");
                }
                MutableLiveData<UserProfile> currentProfile = myRentaCompanyViewModel.getCurrentProfile();
                Intrinsics.checkNotNullExpressionValue(currentProfile, "viewModell.currentProfile");
                UserProfile value = currentProfile.getValue();
                if (value != null) {
                    value.setPropertyId((Integer) null);
                }
                getBaseActivity().onBackPressed();
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                progressBar2.setVisibility(4);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                progressBar3.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
        r0 = r0.getId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSetPlaceResult(p035ru.unicorn.ujin.data.realm.Resource<p035ru.unicorn.ujin.data.api.response.SimpleResponse> r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0091
            ru.unicorn.ujin.data.realm.Resource$Status r0 = r5.getStatus()
            if (r0 != 0) goto L_0x000a
            goto L_0x0091
        L_0x000a:
            int[] r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.ChooseObjectListFragment.WhenMappings.$EnumSwitchMapping$1
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 4
            java.lang.String r3 = "progressBar"
            if (r0 == r1) goto L_0x004b
            r1 = 2
            if (r0 == r1) goto L_0x002f
            r5 = 3
            if (r0 == r5) goto L_0x001f
            goto L_0x0091
        L_0x001f:
            int r5 = p035ru.unicorn.C5619R.C5622id.progressBar
            android.view.View r5 = r4._$_findCachedViewById(r5)
            android.widget.ProgressBar r5 = (android.widget.ProgressBar) r5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            r0 = 0
            r5.setVisibility(r0)
            goto L_0x0091
        L_0x002f:
            int r0 = p035ru.unicorn.C5619R.C5622id.progressBar
            android.view.View r0 = r4._$_findCachedViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            r0.setVisibility(r2)
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r5 = r5.getMessage()
            p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper.showDialog((android.content.Context) r0, (java.lang.String) r5)
            goto L_0x0091
        L_0x004b:
            int r5 = p035ru.unicorn.C5619R.C5622id.progressBar
            android.view.View r5 = r4._$_findCachedViewById(r5)
            android.widget.ProgressBar r5 = (android.widget.ProgressBar) r5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            r5.setVisibility(r2)
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.MyRentaCompanyViewModel r5 = r4.viewModell
            if (r5 != 0) goto L_0x0062
            java.lang.String r0 = "viewModell"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x0062:
            androidx.lifecycle.MutableLiveData r5 = r5.getCurrentProfile()
            java.lang.String r0 = "viewModell.currentProfile"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            java.lang.Object r5 = r5.getValue()
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserProfile r5 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile) r5
            if (r5 == 0) goto L_0x008a
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.response.CompanyObject r0 = r4.selectedObject
            if (r0 == 0) goto L_0x0086
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x0086
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0087
        L_0x0086:
            r0 = 0
        L_0x0087:
            r5.setPropertyId(r0)
        L_0x008a:
            ru.unicorn.ujin.view.activity.BaseActivity r5 = r4.getBaseActivity()
            r5.onBackPressed()
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.ChooseObjectListFragment.onSetPlaceResult(ru.unicorn.ujin.data.realm.Resource):void");
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setTitle("");
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
            List arrayList = new ArrayList();
            arrayList.add(new CompanyObject("0", Rooms.NO_ROOM, (AttrRenta) null, (CompanyBuilding) null, (List) null, (String) null, 32, (DefaultConstructorMarker) null));
            Intrinsics.checkNotNullExpressionValue(value, "it");
            arrayList.addAll(value);
            this.chooseObjectListAdapter = new ChooseObjectListAdapter(arrayList, new ChooseObjectListFragment$onViewCreated$$inlined$let$lambda$1(this));
            int i = 0;
            for (Object next : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                CompanyObject companyObject = (CompanyObject) next;
                MyRentaCompanyViewModel myRentaCompanyViewModel2 = this.viewModell;
                if (myRentaCompanyViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModell");
                }
                MutableLiveData<UserProfile> currentProfile = myRentaCompanyViewModel2.getCurrentProfile();
                Intrinsics.checkNotNullExpressionValue(currentProfile, "viewModell.currentProfile");
                UserProfile value2 = currentProfile.getValue();
                if (Intrinsics.areEqual((Object) String.valueOf(value2 != null ? value2.getPropertyId() : null), (Object) companyObject.getId())) {
                    this.lastObject = companyObject;
                    ChooseObjectListAdapter chooseObjectListAdapter2 = this.chooseObjectListAdapter;
                    if (chooseObjectListAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("chooseObjectListAdapter");
                    }
                    chooseObjectListAdapter2.setSelectedItem(i);
                    ChooseObjectListAdapter chooseObjectListAdapter3 = this.chooseObjectListAdapter;
                    if (chooseObjectListAdapter3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("chooseObjectListAdapter");
                    }
                    chooseObjectListAdapter3.notifyItemChanged(i);
                }
                i = i2;
            }
            ChooseObjectListAdapter chooseObjectListAdapter4 = this.chooseObjectListAdapter;
            if (chooseObjectListAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chooseObjectListAdapter");
            }
            if (chooseObjectListAdapter4.getSelectedItem() == -1) {
                ChooseObjectListAdapter chooseObjectListAdapter5 = this.chooseObjectListAdapter;
                if (chooseObjectListAdapter5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("chooseObjectListAdapter");
                }
                chooseObjectListAdapter5.setSelectedItem(0);
            }
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rentObjectListView);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), 1));
            ChooseObjectListAdapter chooseObjectListAdapter6 = this.chooseObjectListAdapter;
            if (chooseObjectListAdapter6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chooseObjectListAdapter");
            }
            recyclerView.setAdapter(chooseObjectListAdapter6);
            if (recyclerView != null) {
                View view2 = recyclerView;
                return;
            }
        }
        ChooseObjectListFragment chooseObjectListFragment = this;
        RecyclerView recyclerView2 = (RecyclerView) chooseObjectListFragment._$_findCachedViewById(C5619R.C5622id.rentObjectListView);
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "rentObjectListView");
        recyclerView2.setVisibility(8);
        TextView textView = (TextView) chooseObjectListFragment._$_findCachedViewById(C5619R.C5622id.tvNoRentObjects);
        textView.setVisibility(0);
        textView.setText(textView.getResources().getString(R.string.no_my_rent_objects));
        View view3 = textView;
    }
}
