package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0015j\b\u0012\u0004\u0012\u00020\u0011`\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0007H\u0014J\u0012\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010$\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u001bH\u0016J\u001a\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010*\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\"\u0010-\u001a\u00020\u00132\u0018\u0010.\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0006\u0012\u0004\u0018\u000100\u0018\u00010/H\u0002J\b\u00101\u001a\u00020\u0013H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000¨\u00063"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentEmployeeListFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "()V", "employeeListAdapter", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentEmployeeListAdapter;", "propertyTitle", "", "queryText", "rentId", "", "Ljava/lang/Integer;", "searchView", "Landroidx/appcompat/widget/SearchView;", "viewModell", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/MyRentaViewModel;", "initCenterLayout", "Landroid/view/View;", "initDefaultToolbar", "", "initRightButtonList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "initSearchView", "metricsScreenName", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onQueryTextChange", "", "newText", "onQueryTextSubmit", "query", "onSaveInstanceState", "outState", "onViewCreated", "view", "showDate", "rentInfo", "Lru/unicorn/ujin/view/activity/navigation/ui/myrentatype/talkingroom/Rent;", "showRenters", "data", "Landroid/util/Pair;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyList;", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentEmployeeListFragment */
/* compiled from: RentEmployeeListFragment.kt */
public final class RentEmployeeListFragment extends BaseFragment implements SearchView.OnQueryTextListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String SEARCH_QUERY = "searchQuery";
    private HashMap _$_findViewCache;
    private RentEmployeeListAdapter employeeListAdapter;
    /* access modifiers changed from: private */
    public String propertyTitle;
    private String queryText = "";
    /* access modifiers changed from: private */
    public Integer rentId;
    private SearchView searchView;
    /* access modifiers changed from: private */
    public MyRentaViewModel viewModell;

    @JvmStatic
    public static final RentEmployeeListFragment newInstance(int i, String str) {
        return Companion.newInstance(i, str);
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

    public static final /* synthetic */ MyRentaViewModel access$getViewModell$p(RentEmployeeListFragment rentEmployeeListFragment) {
        MyRentaViewModel myRentaViewModel = rentEmployeeListFragment.viewModell;
        if (myRentaViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModell");
        }
        return myRentaViewModel;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        initDefaultToolbar();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.rv_permission_rent, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ViewModel viewModel = ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…ntaViewModel::class.java)");
        this.viewModell = (MyRentaViewModel) viewModel;
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
        progressBar.setVisibility(0);
        Integer num = this.rentId;
        if (num != null) {
            int intValue = num.intValue();
            MyRentaViewModel myRentaViewModel = this.viewModell;
            if (myRentaViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModell");
            }
            myRentaViewModel.getPermisionsForRentById(intValue, true);
            MyRentaViewModel myRentaViewModel2 = this.viewModell;
            if (myRentaViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModell");
            }
            myRentaViewModel2.getRentaInfoMutableLiveData().observe(this, new RentEmployeeListFragment$onViewCreated$$inlined$let$lambda$1(this));
        }
    }

    public boolean onQueryTextChange(String str) {
        this.queryText = str;
        CharSequence charSequence = this.queryText;
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            RentEmployeeListAdapter rentEmployeeListAdapter = this.employeeListAdapter;
            if (rentEmployeeListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("employeeListAdapter");
            }
            rentEmployeeListAdapter.getFilter().filter("");
        } else {
            RentEmployeeListAdapter rentEmployeeListAdapter2 = this.employeeListAdapter;
            if (rentEmployeeListAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("employeeListAdapter");
            }
            rentEmployeeListAdapter2.getFilter().filter(this.queryText);
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
        ((AppCompatImageView) inflate.findViewById(C5619R.C5622id.ivSearchBack)).setOnClickListener(new RentEmployeeListFragment$initCenterLayout$1(this, inflate));
        return inflate;
    }

    public final ArrayList<View> initRightButtonList() {
        ArrayList<View> arrayList = new ArrayList<>();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.toolbar_button_24dp, getBaseActivity().llButtonsRight, false);
        if (inflate != null) {
            ImageButton imageButton = (ImageButton) inflate;
            imageButton.setImageResource(R.drawable.icon_search_magnifier);
            imageButton.setOnClickListener(new RentEmployeeListFragment$initRightButtonList$1(this));
            arrayList.add(imageButton);
            return arrayList;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
    }

    /* access modifiers changed from: private */
    public final void initDefaultToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        CharSequence charSequence = this.propertyTitle;
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            getBaseActivity().setTextTitle(getString(R.string.label_employee_list));
        } else {
            getBaseActivity().setTextTitle(this.propertyTitle);
        }
        getBaseActivity().setToolbarRight(initRightButtonList());
        getBaseActivity().removeToolbarElevation();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r2 = r0.getCanManage();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void showRenters(android.util.Pair<p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent, p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CompanyList> r10) {
        /*
            r9 = this;
            int r0 = p035ru.unicorn.C5619R.C5622id.pbLoading
            android.view.View r0 = r9._$_findCachedViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            java.lang.String r1 = "pbLoading"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
            if (r10 == 0) goto L_0x00ef
            java.lang.Object r0 = r10.first
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Rent r0 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent) r0
            r1 = 0
            if (r0 == 0) goto L_0x0026
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.ManagePermissions r2 = r0.getCanManage()
            if (r2 == 0) goto L_0x0026
            boolean r2 = r2.isCanManage()
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            r9.showDate(r0)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentEmployeeListAdapter r3 = new ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentEmployeeListAdapter
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
            r5 = 0
            if (r0 == 0) goto L_0x003b
            io.realm.RealmList r6 = r0.getRenters()
            goto L_0x003c
        L_0x003b:
            r6 = r5
        L_0x003c:
            java.util.List r6 = (java.util.List) r6
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentEmployeeListFragment$showRenters$$inlined$let$lambda$1 r7 = new ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentEmployeeListFragment$showRenters$$inlined$let$lambda$1
            r7.<init>(r0, r9)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentEmployeeListAdapter$RentEmployeeListAdapterListener r7 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentEmployeeListAdapter.RentEmployeeListAdapterListener) r7
            r3.<init>(r4, r6, r2, r7)
            r9.employeeListAdapter = r3
            int r0 = p035ru.unicorn.C5619R.C5622id.rvEmployeeList
            android.view.View r0 = r9._$_findCachedViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r3 = r0.getContext()
            r2.<init>(r3)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = (androidx.recyclerview.widget.RecyclerView.LayoutManager) r2
            r0.setLayoutManager(r2)
            androidx.recyclerview.widget.DividerItemDecoration r2 = new androidx.recyclerview.widget.DividerItemDecoration
            android.content.Context r3 = r0.getContext()
            r4 = 1
            r2.<init>(r3, r4)
            androidx.recyclerview.widget.RecyclerView$ItemDecoration r2 = (androidx.recyclerview.widget.RecyclerView.ItemDecoration) r2
            r0.addItemDecoration(r2)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentEmployeeListAdapter r2 = r9.employeeListAdapter
            java.lang.String r3 = "employeeListAdapter"
            if (r2 != 0) goto L_0x0078
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0078:
            androidx.recyclerview.widget.RecyclerView$Adapter r2 = (androidx.recyclerview.widget.RecyclerView.Adapter) r2
            r0.setAdapter(r2)
            java.lang.Object r10 = r10.second
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.CompanyList r10 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CompanyList) r10
            if (r10 == 0) goto L_0x0087
            java.util.List r5 = r10.getRentCompany()
        L_0x0087:
            if (r5 == 0) goto L_0x00ef
            r10 = r5
            java.util.Collection r10 = (java.util.Collection) r10
            int r10 = r10.size()
            r0 = 0
        L_0x0091:
            if (r0 >= r10) goto L_0x00ef
            java.lang.Object r2 = r5.get(r0)
            java.lang.String r6 = "rentCompany[i]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r6)
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany r2 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany) r2
            java.util.List r2 = r2.getUserProfiles()
            java.lang.Object r6 = r5.get(r0)
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany r6 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany) r6
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentEmployeeListAdapter r7 = r9.employeeListAdapter
            if (r7 != 0) goto L_0x00af
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x00af:
            java.lang.String r8 = "company"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.EmployeeDataType r6 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.EmployeeDataType) r6
            r7.addItem(r6)
            r6 = r2
            java.util.Collection r6 = (java.util.Collection) r6
            if (r6 == 0) goto L_0x00c7
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x00c5
            goto L_0x00c7
        L_0x00c5:
            r6 = 0
            goto L_0x00c8
        L_0x00c7:
            r6 = 1
        L_0x00c8:
            if (r6 != 0) goto L_0x00ec
            java.util.Iterator r2 = r2.iterator()
        L_0x00ce:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00ec
            java.lang.Object r6 = r2.next()
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserProfile r6 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile) r6
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentEmployeeListAdapter r7 = r9.employeeListAdapter
            if (r7 != 0) goto L_0x00e1
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x00e1:
            java.lang.String r8 = "item"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.EmployeeDataType r6 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.EmployeeDataType) r6
            r7.addItem(r6)
            goto L_0x00ce
        L_0x00ec:
            int r0 = r0 + 1
            goto L_0x0091
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentEmployeeListFragment.showRenters(android.util.Pair):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void showDate(p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0007
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo r0 = r5.getTalkingInfo()
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            if (r0 == 0) goto L_0x00c4
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo r0 = r5.getTalkingInfo()
            java.lang.String r1 = "rentInfo.talkingInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta r0 = r0.getStateRenta()
            if (r0 == 0) goto L_0x00c4
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo r0 = r5.getTalkingInfo()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta r0 = r0.getStateRenta()
            java.lang.String r2 = "rentInfo.talkingInfo.stateRenta"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.lang.String r0 = r0.getName()
            if (r0 == 0) goto L_0x00c4
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo r0 = r5.getTalkingInfo()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta r0 = r0.getStateRenta()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "rentInfo.talkingInfo.stateRenta.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = r5.realmGet$startDateHuman()
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
            java.util.Calendar r1 = p035ru.unicorn.ujin.util.DateUtils.parseDate(r1, r2)
            java.lang.String r5 = r5.realmGet$finishDateHuman()
            java.util.Calendar r5 = p035ru.unicorn.ujin.util.DateUtils.parseDate(r5, r2)
            if (r1 == 0) goto L_0x00c4
            if (r5 == 0) goto L_0x00c4
            java.lang.String r2 = "meeting_room"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            java.lang.String r3 = " - "
            if (r2 != 0) goto L_0x009d
            java.lang.String r2 = "event_area"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x006f
            goto L_0x009d
        L_0x006f:
            java.lang.String r0 = p035ru.unicorn.ujin.util.DateUtils.formatDateFromCalendar(r1)
            java.lang.String r2 = p035ru.unicorn.ujin.util.DateUtils.formatDateFromCalendar(r5)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x0082
            java.lang.String r5 = p035ru.unicorn.ujin.util.DateUtils.formatDateFromCalendar(r1)
            goto L_0x00c6
        L_0x0082:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = p035ru.unicorn.ujin.util.DateUtils.formatDateFromCalendar(r1)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r5 = p035ru.unicorn.ujin.util.DateUtils.formatDateFromCalendar(r5)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            goto L_0x00c6
        L_0x009d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = p035ru.unicorn.ujin.util.DateUtils.formatDateFromCalendar(r1)
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            java.lang.String r1 = p035ru.unicorn.ujin.util.DateUtils.formatTimeFromCalendar(r1)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r5 = p035ru.unicorn.ujin.util.DateUtils.formatTimeFromCalendar(r5)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            goto L_0x00c6
        L_0x00c4:
            java.lang.String r5 = ""
        L_0x00c6:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r0 = 0
            if (r5 == 0) goto L_0x00d4
            boolean r1 = kotlin.text.StringsKt.isBlank(r5)
            if (r1 == 0) goto L_0x00d2
            goto L_0x00d4
        L_0x00d2:
            r1 = 0
            goto L_0x00d5
        L_0x00d4:
            r1 = 1
        L_0x00d5:
            if (r1 == 0) goto L_0x00ea
            int r5 = p035ru.unicorn.C5619R.C5622id.tvDateTitle
            android.view.View r5 = r4._$_findCachedViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String r0 = "tvDateTitle"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r0 = 8
            r5.setVisibility(r0)
            goto L_0x00f8
        L_0x00ea:
            int r1 = p035ru.unicorn.C5619R.C5622id.tvDateTitle
            android.view.View r1 = r4._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setVisibility(r0)
            r1.setText(r5)
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentEmployeeListFragment.showDate(ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Rent):void");
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentEmployeeListFragment$Companion;", "", "()V", "SEARCH_QUERY", "", "newInstance", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentEmployeeListFragment;", "rentId", "", "propertyTitle", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentEmployeeListFragment$Companion */
    /* compiled from: RentEmployeeListFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final RentEmployeeListFragment newInstance(int i, String str) {
            Intrinsics.checkNotNullParameter(str, "propertyTitle");
            RentEmployeeListFragment rentEmployeeListFragment = new RentEmployeeListFragment();
            rentEmployeeListFragment.rentId = Integer.valueOf(i);
            rentEmployeeListFragment.propertyTitle = str;
            return rentEmployeeListFragment;
        }
    }
}
