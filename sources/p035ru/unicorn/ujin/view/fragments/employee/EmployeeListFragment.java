package p035ru.unicorn.ujin.view.fragments.employee;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.AddEmployerDialogFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.MyRentaCompanyViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.CompanyObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.CreateUserCompany;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u0003:\u00016B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0015j\b\u0012\u0004\u0012\u00020\u0011`\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\nH\u0014J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\u0012\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010\u00112\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u001fH\u0016J\u001a\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010.\u001a\u00020\u00132\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\b\u00101\u001a\u00020\u0013H\u0014J\u001a\u00102\u001a\u00020\u00132\u0010\u00103\u001a\f\u0012\u0006\u0012\u0004\u0018\u000105\u0018\u000104H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000¨\u00067"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/employee/EmployeeListFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/AddEmployerDialogFragment$OnAddPersonClick;", "()V", "addEmployerDialogFragment", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/AddEmployerDialogFragment;", "employeeListAdapter", "Lru/unicorn/ujin/view/fragments/employee/EmployeeListAdapter;", "mode", "", "queryText", "searchView", "Landroidx/appcompat/widget/SearchView;", "viewModell", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/MyRentaCompanyViewModel;", "initCenterLayout", "Landroid/view/View;", "initDefaultToolbar", "", "initRightButtonList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "initSearchView", "metricsScreenName", "onAddEmployee", "onAddPersonCLick", "data", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/CreateUserCompany;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onQueryTextChange", "", "newText", "onQueryTextSubmit", "query", "onSaveInstanceState", "outState", "onViewCreated", "view", "showCompany", "rentCompany", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/RentCompany;", "showToolbar", "showUsers", "userProfiles", "", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.employee.EmployeeListFragment */
/* compiled from: EmployeeListFragment.kt */
public final class EmployeeListFragment extends BaseFragment implements SearchView.OnQueryTextListener, AddEmployerDialogFragment.OnAddPersonClick {
    public static final String COMPANY_EMPLOYEES = "companyEmployees";
    public static final String COMPANY_OBJECT_EMPLOYEES = "companyObjectEmployees";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String SEARCH_QUERY = "searchQuery";
    private HashMap _$_findViewCache;
    private AddEmployerDialogFragment addEmployerDialogFragment;
    private EmployeeListAdapter employeeListAdapter;
    /* access modifiers changed from: private */
    public String mode = COMPANY_EMPLOYEES;
    private String queryText = "";
    private SearchView searchView;
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
        return "Экран списка сотрудников";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public boolean onQueryTextSubmit(String str) {
        return false;
    }

    public static final /* synthetic */ MyRentaCompanyViewModel access$getViewModell$p(EmployeeListFragment employeeListFragment) {
        MyRentaCompanyViewModel myRentaCompanyViewModel = employeeListFragment.viewModell;
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
        return layoutInflater.inflate(R.layout.fragment_employee_list, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ViewModel viewModel = ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaCompanyViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…anyViewModel::class.java)");
        this.viewModell = (MyRentaCompanyViewModel) viewModel;
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
        progressBar.setVisibility(0);
        String str = this.mode;
        int hashCode = str.hashCode();
        if (hashCode != 642027400) {
            if (hashCode == 806024393 && str.equals(COMPANY_OBJECT_EMPLOYEES)) {
                MyRentaCompanyViewModel myRentaCompanyViewModel = this.viewModell;
                if (myRentaCompanyViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModell");
                }
                showUsers(myRentaCompanyViewModel.getCompanyObjectEmployees());
            }
        } else if (str.equals(COMPANY_EMPLOYEES)) {
            MyRentaCompanyViewModel myRentaCompanyViewModel2 = this.viewModell;
            if (myRentaCompanyViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModell");
            }
            SingleLiveEvent<RentCompany> currentCompanyMutableLiveData = myRentaCompanyViewModel2.getCurrentCompanyMutableLiveData();
            Intrinsics.checkNotNullExpressionValue(currentCompanyMutableLiveData, "viewModell.currentCompanyMutableLiveData");
            if (currentCompanyMutableLiveData.getValue() == null) {
                MyRentaCompanyViewModel myRentaCompanyViewModel3 = this.viewModell;
                if (myRentaCompanyViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModell");
                }
                myRentaCompanyViewModel3.getCompanyById();
                MyRentaCompanyViewModel myRentaCompanyViewModel4 = this.viewModell;
                if (myRentaCompanyViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModell");
                }
                myRentaCompanyViewModel4.getCurrentCompanyMutableLiveData().observe(getViewLifecycleOwner(), new EmployeeListFragment$onViewCreated$1(this));
                return;
            }
            MyRentaCompanyViewModel myRentaCompanyViewModel5 = this.viewModell;
            if (myRentaCompanyViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModell");
            }
            SingleLiveEvent<RentCompany> currentCompanyMutableLiveData2 = myRentaCompanyViewModel5.getCurrentCompanyMutableLiveData();
            Intrinsics.checkNotNullExpressionValue(currentCompanyMutableLiveData2, "viewModell.currentCompanyMutableLiveData");
            showCompany(currentCompanyMutableLiveData2.getValue());
        }
    }

    public boolean onQueryTextChange(String str) {
        Filter filter;
        Filter filter2;
        this.queryText = str;
        CharSequence charSequence = this.queryText;
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            EmployeeListAdapter employeeListAdapter2 = this.employeeListAdapter;
            if (!(employeeListAdapter2 == null || (filter2 = employeeListAdapter2.getFilter()) == null)) {
                filter2.filter("");
            }
        } else {
            EmployeeListAdapter employeeListAdapter3 = this.employeeListAdapter;
            if (!(employeeListAdapter3 == null || (filter = employeeListAdapter3.getFilter()) == null)) {
                filter.filter(this.queryText);
            }
        }
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.queryText = bundle != null ? bundle.getString("searchQuery") : null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "outState");
        super.onSaveInstanceState(bundle);
        SearchView searchView2 = this.searchView;
        bundle.putString("searchQuery", String.valueOf(searchView2 != null ? searchView2.getQuery() : null));
    }

    /* access modifiers changed from: private */
    public final void initSearchView() {
        SearchView searchView2 = this.searchView;
        if (searchView2 != null) {
            searchView2.setIconified(false);
        }
        SearchView searchView3 = this.searchView;
        if (searchView3 != null) {
            searchView3.setQueryHint(getResources().getString(R.string.title_search));
        }
        SearchView searchView4 = this.searchView;
        if (searchView4 != null) {
            searchView4.requestFocus();
        }
        SearchView searchView5 = this.searchView;
        if (searchView5 != null) {
            searchView5.setOnQueryTextListener(this);
        }
        SearchView searchView6 = this.searchView;
        if (searchView6 != null) {
            searchView6.setQuery(this.queryText, true);
        }
    }

    /* access modifiers changed from: private */
    public final View initCenterLayout() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_search_view, getBaseActivity().centerLayout, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "searchLayout");
        this.searchView = (SearchView) inflate.findViewById(C5619R.C5622id.searchView);
        ((AppCompatImageView) inflate.findViewById(C5619R.C5622id.ivSearchBack)).setOnClickListener(new EmployeeListFragment$initCenterLayout$1(this, inflate));
        return inflate;
    }

    public final ArrayList<View> initRightButtonList() {
        ArrayList<View> arrayList = new ArrayList<>();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.toolbar_button_24dp, getBaseActivity().llButtonsRight, false);
        if (inflate != null) {
            ImageButton imageButton = (ImageButton) inflate;
            imageButton.setImageResource(R.drawable.icon_search_magnifier);
            imageButton.setOnClickListener(new EmployeeListFragment$initRightButtonList$1(this));
            arrayList.add(imageButton);
            return arrayList;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
    }

    /* access modifiers changed from: private */
    public final void initDefaultToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        String str = this.mode;
        int hashCode = str.hashCode();
        if (hashCode != 642027400) {
            if (hashCode == 806024393 && str.equals(COMPANY_OBJECT_EMPLOYEES)) {
                MyRentaCompanyViewModel myRentaCompanyViewModel = this.viewModell;
                if (myRentaCompanyViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModell");
                }
                SingleLiveEvent<CompanyObject> currentCompanyObjectMutableLiveData = myRentaCompanyViewModel.getCurrentCompanyObjectMutableLiveData();
                Intrinsics.checkNotNullExpressionValue(currentCompanyObjectMutableLiveData, "viewModell.currentCompanyObjectMutableLiveData");
                CompanyObject value = currentCompanyObjectMutableLiveData.getValue();
                String str2 = null;
                CharSequence title = value != null ? value.getTitle() : null;
                if (title == null || StringsKt.isBlank(title)) {
                    getBaseActivity().setTextTitle(getString(R.string.label_employee_list));
                    return;
                }
                BaseActivity baseActivity = getBaseActivity();
                MyRentaCompanyViewModel myRentaCompanyViewModel2 = this.viewModell;
                if (myRentaCompanyViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModell");
                }
                SingleLiveEvent<CompanyObject> currentCompanyObjectMutableLiveData2 = myRentaCompanyViewModel2.getCurrentCompanyObjectMutableLiveData();
                Intrinsics.checkNotNullExpressionValue(currentCompanyObjectMutableLiveData2, "viewModell.currentCompanyObjectMutableLiveData");
                CompanyObject value2 = currentCompanyObjectMutableLiveData2.getValue();
                if (value2 != null) {
                    str2 = value2.getTitle();
                }
                baseActivity.setTextTitle(str2);
            }
        } else if (str.equals(COMPANY_EMPLOYEES)) {
            getBaseActivity().setToolbarRight(initRightButtonList());
            getBaseActivity().setTextTitle(getString(R.string.label_employee_list));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b1, code lost:
        if (r4 != false) goto L_0x00b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void showCompany(p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x00c3
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.MyRentaCompanyViewModel r0 = r8.viewModell
            if (r0 != 0) goto L_0x000b
            java.lang.String r1 = "viewModell"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x000b:
            ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent r0 = r0.getUsersCompanyMutableLiveData()
            java.lang.String r1 = "viewModell.usersCompanyMutableLiveData"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.List r1 = r9.getUserProfiles()
            r0.setValue(r1)
            java.util.List r0 = r9.getUserProfiles()
            r8.showUsers(r0)
            java.util.List r0 = r9.getUserProfiles()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0055
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0030:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0050
            java.lang.Object r3 = r0.next()
            r4 = r3
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserProfile r4 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile) r4
            if (r4 == 0) goto L_0x0044
            java.lang.Boolean r4 = r4.getMe()
            goto L_0x0045
        L_0x0044:
            r4 = r2
        L_0x0045:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x0030
            goto L_0x0051
        L_0x0050:
            r3 = r2
        L_0x0051:
            r0 = r3
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserProfile r0 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile) r0
            goto L_0x0056
        L_0x0055:
            r0 = r2
        L_0x0056:
            r3 = 0
            if (r0 == 0) goto L_0x008e
            io.realm.RealmList r4 = r0.getPermissions()
            if (r4 == 0) goto L_0x008e
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0065:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0084
            java.lang.Object r5 = r4.next()
            r6 = r5
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentPermissions r6 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentPermissions) r6
            java.lang.String r7 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            java.lang.String r6 = r6.getPermissionKey()
            java.lang.String r7 = "manage-employees"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x0065
            goto L_0x0085
        L_0x0084:
            r5 = r2
        L_0x0085:
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentPermissions r5 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentPermissions) r5
            if (r5 == 0) goto L_0x008e
            boolean r4 = r5.isValue()
            goto L_0x008f
        L_0x008e:
            r4 = 0
        L_0x008f:
            int r5 = p035ru.unicorn.C5619R.C5622id.btnAddEmployee
            android.view.View r5 = r8._$_findCachedViewById(r5)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r5 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r5
            java.lang.String r6 = r8.mode
            java.lang.String r7 = "companyEmployees"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x00b4
            if (r0 == 0) goto L_0x00a7
            java.lang.Boolean r2 = r0.isVerified()
        L_0x00a7:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x00b4
            if (r4 == 0) goto L_0x00b4
            goto L_0x00b6
        L_0x00b4:
            r3 = 8
        L_0x00b6:
            r5.setVisibility(r3)
            ru.unicorn.ujin.view.fragments.employee.EmployeeListFragment$showCompany$$inlined$let$lambda$1 r1 = new ru.unicorn.ujin.view.fragments.employee.EmployeeListFragment$showCompany$$inlined$let$lambda$1
            r1.<init>(r0, r4, r8, r9)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r5.setOnClickListener(r1)
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.employee.EmployeeListFragment.showCompany(ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany):void");
    }

    /* access modifiers changed from: private */
    public final void onAddEmployee() {
        this.addEmployerDialogFragment = new AddEmployerDialogFragment(this);
        AddEmployerDialogFragment addEmployerDialogFragment2 = this.addEmployerDialogFragment;
        if (addEmployerDialogFragment2 != null) {
            addEmployerDialogFragment2.show(getChildFragmentManager(), "");
        }
    }

    public void onAddPersonCLick(CreateUserCompany createUserCompany) {
        AddEmployerDialogFragment addEmployerDialogFragment2 = this.addEmployerDialogFragment;
        if (addEmployerDialogFragment2 != null) {
            addEmployerDialogFragment2.dismiss();
        }
        if (createUserCompany != null) {
            MyRentaCompanyViewModel myRentaCompanyViewModel = this.viewModell;
            if (myRentaCompanyViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModell");
            }
            myRentaCompanyViewModel.addPerson(createUserCompany.getTel(), createUserCompany.getPos(), createUserCompany.getName(), createUserCompany.getSurname(), createUserCompany.getPatronymic());
        }
    }

    private final void showUsers(List<? extends UserProfile> list) {
        List list2;
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
        progressBar.setVisibility(8);
        if (list == null || (list2 = CollectionsKt.filterNotNull(list)) == null) {
            list2 = CollectionsKt.emptyList();
        }
        if (list2.isEmpty()) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvEmployeeList);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "rvEmployeeList");
            recyclerView.setVisibility(8);
            TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoEmployees);
            Intrinsics.checkNotNullExpressionValue(textView, "tvNoEmployees");
            textView.setVisibility(0);
            return;
        }
        TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoEmployees);
        Intrinsics.checkNotNullExpressionValue(textView2, "tvNoEmployees");
        textView2.setVisibility(8);
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvEmployeeList);
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "rvEmployeeList");
        recyclerView2.setVisibility(0);
        this.employeeListAdapter = new EmployeeListAdapter(list2, this.mode, new EmployeeListFragment$showUsers$1(this));
        RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvEmployeeList);
        recyclerView3.setLayoutManager(new LinearLayoutManager(recyclerView3.getContext()));
        recyclerView3.addItemDecoration(new DividerItemDecoration(recyclerView3.getContext(), 1));
        recyclerView3.setAdapter(this.employeeListAdapter);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/employee/EmployeeListFragment$Companion;", "", "()V", "COMPANY_EMPLOYEES", "", "COMPANY_OBJECT_EMPLOYEES", "SEARCH_QUERY", "newInstance", "Lru/unicorn/ujin/view/fragments/employee/EmployeeListFragment;", "mode", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.employee.EmployeeListFragment$Companion */
    /* compiled from: EmployeeListFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EmployeeListFragment newInstance(String str) {
            Intrinsics.checkNotNullParameter(str, "mode");
            EmployeeListFragment employeeListFragment = new EmployeeListFragment();
            employeeListFragment.mode = str;
            return employeeListFragment;
        }
    }
}
