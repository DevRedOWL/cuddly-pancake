package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.KeyValueSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.CompanyObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.TeamMapper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.TeamProfileSection;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.fragments.employee.EmployeeListFragment;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.processors.PublishProcessor;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0014J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\rH\u0014J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0014J\u001a\u0010\u0015\u001a\u00020\u00102\u0010\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyObjectFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseSectionFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/MyRentaCompanyViewModel;", "()V", "companyObject", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/response/CompanyObject;", "objectInfoSection", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/KeyValueSection;", "teamProfileSection", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my_team/TeamProfileSection;", "titleSection", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/TitleLineSection;", "getMyToolbarTitle", "", "getViewModell", "initSections", "", "metricsScreenName", "onEditClick", "onViewCreated", "viewModell", "showCompanyObjects", "companyObjects", "", "showDetail", "data", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my_team/TeamMapper;", "showObjectInfo", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.CompanyObjectFragment */
/* compiled from: CompanyObjectFragment.kt */
public final class CompanyObjectFragment extends BaseSectionFragment<MyRentaCompanyViewModel> {
    private HashMap _$_findViewCache;
    private CompanyObject companyObject;
    private KeyValueSection objectInfoSection;
    private TeamProfileSection teamProfileSection;
    private TitleLineSection titleSection = new TitleLineSection(false, 14);

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
        return "Экран помещения компании";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: private */
    public final void showDetail(TeamMapper teamMapper) {
        nextFragment(MyTeamPersonDetailFragment.start(teamMapper.getId()), false);
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        PublishProcessor<TeamMapper> specialClicks;
        if (this.objectInfoSection == null) {
            this.objectInfoSection = new KeyValueSection();
        }
        if (this.teamProfileSection == null) {
            this.teamProfileSection = new TeamProfileSection();
            TeamProfileSection teamProfileSection2 = this.teamProfileSection;
            if (!(teamProfileSection2 == null || (specialClicks = teamProfileSection2.specialClicks()) == null)) {
                specialClicks.subscribe((Consumer<? super TeamMapper>) new CompanyObjectFragment$initSections$1(this));
            }
        }
        this.disposable.add(this.titleSection.getItemClick().subscribe(new CompanyObjectFragment$initSections$2(this)));
        this.sectionedAdapter.addSection(this.objectInfoSection);
        this.sectionedAdapter.addSection(this.titleSection);
        this.sectionedAdapter.addSection(this.teamProfileSection);
    }

    /* access modifiers changed from: private */
    public final void onEditClick() {
        nextFragment(EmployeeListFragment.Companion.newInstance(EmployeeListFragment.COMPANY_OBJECT_EMPLOYEES), false);
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(MyRentaCompanyViewModel myRentaCompanyViewModel) {
        if (myRentaCompanyViewModel == null || !myRentaCompanyViewModel.afterChangingEmployeeProperty) {
            showObjectInfo();
            return;
        }
        myRentaCompanyViewModel.getCompanyObjectsMutableLiveData().observe(getViewLifecycleOwner(), new CompanyObjectFragment$onViewCreated$1(this));
        myRentaCompanyViewModel.getEnterpriseCompanyObjects();
    }

    /* access modifiers changed from: private */
    public final void showCompanyObjects(List<CompanyObject> list) {
        SingleLiveEvent<CompanyObject> currentCompanyObjectMutableLiveData;
        SingleLiveEvent<CompanyObject> currentCompanyObjectMutableLiveData2;
        CompanyObject value;
        ProgressBar progressBar = this.f6913pb;
        Intrinsics.checkNotNullExpressionValue(progressBar, "pb");
        progressBar.setVisibility(8);
        Collection collection = list;
        if (!(collection == null || collection.isEmpty())) {
            Iterator<CompanyObject> it = list.iterator();
            while (it.hasNext()) {
                CompanyObject next = it.next();
                String str = null;
                String id = next != null ? next.getId() : null;
                MyRentaCompanyViewModel myRentaCompanyViewModel = (MyRentaCompanyViewModel) this.viewModell;
                if (!(myRentaCompanyViewModel == null || (currentCompanyObjectMutableLiveData2 = myRentaCompanyViewModel.getCurrentCompanyObjectMutableLiveData()) == null || (value = currentCompanyObjectMutableLiveData2.getValue()) == null)) {
                    str = value.getId();
                }
                if (Intrinsics.areEqual((Object) id, (Object) str)) {
                    MyRentaCompanyViewModel myRentaCompanyViewModel2 = (MyRentaCompanyViewModel) this.viewModell;
                    if (!(myRentaCompanyViewModel2 == null || (currentCompanyObjectMutableLiveData = myRentaCompanyViewModel2.getCurrentCompanyObjectMutableLiveData()) == null)) {
                        currentCompanyObjectMutableLiveData.setValue(next);
                    }
                    showObjectInfo();
                }
            }
        }
    }

    private final void showObjectInfo() {
        SingleLiveEvent<CompanyObject> currentCompanyObjectMutableLiveData;
        CompanyObject value;
        MyRentaCompanyViewModel myRentaCompanyViewModel = (MyRentaCompanyViewModel) this.viewModell;
        if (myRentaCompanyViewModel != null && (currentCompanyObjectMutableLiveData = myRentaCompanyViewModel.getCurrentCompanyObjectMutableLiveData()) != null && (value = currentCompanyObjectMutableLiveData.getValue()) != null) {
            this.companyObject = value;
            getBaseActivity().setTextTitle(value.getTitle());
            BaseViewModel baseViewModel = this.viewModell;
            Intrinsics.checkNotNullExpressionValue(baseViewModel, "viewModell");
            ArrayList<UserProfile> companyObjectEmployees = ((MyRentaCompanyViewModel) baseViewModel).getCompanyObjectEmployees();
            Collection collection = companyObjectEmployees;
            if (!(collection == null || collection.isEmpty())) {
                TeamProfileSection teamProfileSection2 = this.teamProfileSection;
                if (teamProfileSection2 != null) {
                    teamProfileSection2.setData(TeamMapper.mapTo((List<UserProfile>) companyObjectEmployees));
                }
                TitleLineSection titleLineSection = this.titleSection;
                String string = getResources().getString(R.string.label_edit);
                Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.label_edit)");
                titleLineSection.setBtnTitle(string);
                this.titleSection.setData(new SomeString(getResources().getString(R.string.label_employers, new Object[]{Integer.valueOf(companyObjectEmployees.size())})));
                this.titleSection.show(true);
            } else {
                this.titleSection.show(false);
            }
            KeyValueSection keyValueSection = this.objectInfoSection;
            if (keyValueSection != null) {
                keyValueSection.setData(CompanyObject.Companion.toKeyList(this.companyObject));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.getTitle();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getMyToolbarTitle() {
        /*
            r1 = this;
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.response.CompanyObject r0 = r1.companyObject
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r0.getTitle()
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            java.lang.String r0 = "Помещение"
        L_0x000d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CompanyObjectFragment.getMyToolbarTitle():java.lang.String");
    }

    public MyRentaCompanyViewModel getViewModell() {
        return (MyRentaCompanyViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaCompanyViewModel.class);
    }
}
