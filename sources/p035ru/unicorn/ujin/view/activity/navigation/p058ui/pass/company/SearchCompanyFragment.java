package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseSectionFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.CompanyDataIn;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\tH\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0012\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\u00162\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u0002J\b\u0010!\u001a\u00020\u0016H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\""}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/SearchCompanyFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseSectionFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/PassCompanyVM;", "()V", "companySection", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/CompanySection;", "getCompanySection", "()Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/CompanySection;", "currentQuery", "", "getCurrentQuery", "()Ljava/lang/String;", "setCurrentQuery", "(Ljava/lang/String;)V", "searchSection", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/SearchSection;", "getSearchSection", "()Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/SearchSection;", "getLayoutRes", "", "getMyToolbarTitle", "initSections", "", "onPause", "onViewCreated", "viewModell", "setInfoData", "isEmpty", "", "showCompanyList", "data", "", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/model/CompanyDataIn;", "showProgressBar", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.SearchCompanyFragment */
/* compiled from: SearchCompanyFragment.kt */
public final class SearchCompanyFragment extends BaseSectionFragment<PassCompanyVM> {
    private HashMap _$_findViewCache;
    private final CompanySection companySection = new CompanySection();
    private String currentQuery = "";
    private final SearchSection searchSection = new SearchSection();

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
    public int getLayoutRes() {
        return R.layout.fragmet_connect_company;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ PassCompanyVM access$getViewModell$p(SearchCompanyFragment searchCompanyFragment) {
        return (PassCompanyVM) searchCompanyFragment.viewModell;
    }

    public final SearchSection getSearchSection() {
        return this.searchSection;
    }

    public final CompanySection getCompanySection() {
        return this.companySection;
    }

    public final String getCurrentQuery() {
        return this.currentQuery;
    }

    public final void setCurrentQuery(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentQuery = str;
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        this.sectionedAdapter.addSection(this.searchSection);
        this.sectionedAdapter.addSection(this.companySection);
        this.searchSection.getSubject().skip(1).debounce(300, TimeUnit.MILLISECONDS).subscribe(new SearchCompanyFragment$initSections$1(this));
    }

    /* access modifiers changed from: private */
    public final void showProgressBar() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new SearchCompanyFragment$showProgressBar$$inlined$let$lambda$1(this));
        }
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(PassCompanyVM passCompanyVM) {
        MutableLiveData<List<CompanyDataIn>> companyList;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            UIHelper.showKeyboard(activity);
        }
        this.searchSection.setData(new SomeString(""));
        this.companySection.getItemClick().first().subscribe(new SearchCompanyFragment$onViewCreated$2(this, passCompanyVM));
        if (passCompanyVM != null && (companyList = passCompanyVM.getCompanyList()) != null) {
            companyList.observe(getViewLifecycleOwner(), new SearchCompanyFragment$onViewCreated$3(this));
        }
    }

    /* access modifiers changed from: private */
    public final void showCompanyList(List<CompanyDataIn> list) {
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.info);
        Intrinsics.checkNotNullExpressionValue(textView, "info");
        textView.setVisibility(4);
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbar");
        progressBar.setVisibility(4);
        if (StringsKt.isBlank(this.currentQuery) || (list != null && list.isEmpty())) {
            this.companySection.show(false);
            setInfoData(!StringsKt.isBlank(this.currentQuery));
            return;
        }
        this.companySection.show(true);
        this.companySection.setData(list);
    }

    private final void setInfoData(boolean z) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new SearchCompanyFragment$setInfoData$$inlined$let$lambda$1(this, z));
        }
    }

    public void onPause() {
        super.onPause();
        this.companySection.show(false);
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_find_company);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_find_company)");
        return string;
    }
}
