package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseSectionFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.AddressSection;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0014J\u0018\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0002J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/corona/AllAdressesFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseSectionFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/CoronaViewModel;", "()V", "adressesSection", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/AddressSection;", "getAdressesSection", "()Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/AddressSection;", "getMyToolbarTitle", "", "initSections", "", "onGetAllAddress", "data", "", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/ProfileAdress;", "onViewCreated", "viewModell", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.AllAdressesFragment */
/* compiled from: AllAdressesFragment.kt */
public final class AllAdressesFragment extends BaseSectionFragment<CoronaViewModel> {
    private HashMap _$_findViewCache;
    private final AddressSection adressesSection = new AddressSection(true);

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

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ CoronaViewModel access$getViewModell$p(AllAdressesFragment allAdressesFragment) {
        return (CoronaViewModel) allAdressesFragment.viewModell;
    }

    public final AddressSection getAdressesSection() {
        return this.adressesSection;
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        this.sectionedAdapter.addSection(this.adressesSection);
        this.adressesSection.getOnClick().subscribe(new AllAdressesFragment$initSections$1(this));
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(CoronaViewModel coronaViewModel) {
        MutableLiveData<List<ProfileAdress>> addressListMutable;
        if (coronaViewModel != null && (addressListMutable = coronaViewModel.getAddressListMutable()) != null) {
            addressListMutable.observe(this, new AllAdressesFragment$onViewCreated$1(this));
        }
    }

    /* access modifiers changed from: private */
    public final void onGetAllAddress(List<? extends ProfileAdress> list) {
        this.adressesSection.setData(list);
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_all_address);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_all_address)");
        return string;
    }
}
