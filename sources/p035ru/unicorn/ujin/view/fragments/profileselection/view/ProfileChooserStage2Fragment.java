package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseSectionFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.TextSection;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.sections.AvailableAddressesSection;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.sections.BusinessCenterSection;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.sections.ChooseCitySection;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.sections.CitiesSection;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010#\u001a\u00020$H\u0014J\b\u0010%\u001a\u00020&H\u0014J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020(H\u0014J\u0010\u0010,\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020/H\u0002J\u0012\u00100\u001a\u00020(2\b\u00101\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u00102\u001a\u00020(2\u0006\u00103\u001a\u00020/H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0017\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b \u0010!¨\u00064"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/view/ProfileChooserStage2Fragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseSectionFragment;", "Lru/unicorn/ujin/view/fragments/profileselection/view/ProfileSelectionVM;", "()V", "availableAddressesSection", "Lru/unicorn/ujin/view/fragments/profileselection/view/sections/AvailableAddressesSection;", "getAvailableAddressesSection", "()Lru/unicorn/ujin/view/fragments/profileselection/view/sections/AvailableAddressesSection;", "availableAddressesSection$delegate", "Lkotlin/Lazy;", "bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "businessCenterSection", "Lru/unicorn/ujin/view/fragments/profileselection/view/sections/BusinessCenterSection;", "getBusinessCenterSection", "()Lru/unicorn/ujin/view/fragments/profileselection/view/sections/BusinessCenterSection;", "businessCenterSection$delegate", "chooseBusinessSection", "Lru/unicorn/ujin/view/fragments/profileselection/view/sections/ChooseCitySection;", "getChooseBusinessSection", "()Lru/unicorn/ujin/view/fragments/profileselection/view/sections/ChooseCitySection;", "chooseBusinessSection$delegate", "chooseCitySection", "getChooseCitySection", "chooseCitySection$delegate", "citiesSection", "Lru/unicorn/ujin/view/fragments/profileselection/view/sections/CitiesSection;", "getCitiesSection", "()Lru/unicorn/ujin/view/fragments/profileselection/view/sections/CitiesSection;", "citiesSection$delegate", "textSection", "Lru/unicorn/ujin/view/activity/navigation/ui/tickets/TextSection;", "getTextSection", "()Lru/unicorn/ujin/view/activity/navigation/ui/tickets/TextSection;", "textSection$delegate", "getLayoutRes", "", "getMyToolbarTitle", "", "initBottomSheet", "", "root", "Landroid/view/View;", "initSections", "onCreateView", "onDataClick", "isCity", "", "onViewCreated", "vm", "showBottomSheet", "show", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserStage2Fragment */
/* compiled from: ProfileChooserStage2Fragment.kt */
public final class ProfileChooserStage2Fragment extends BaseSectionFragment<ProfileSelectionVM> {
    private HashMap _$_findViewCache;
    private final Lazy availableAddressesSection$delegate = LazyKt.lazy(ProfileChooserStage2Fragment$availableAddressesSection$2.INSTANCE);
    private BottomSheetBehavior<?> bottomSheetBehavior;
    private final Lazy businessCenterSection$delegate = LazyKt.lazy(ProfileChooserStage2Fragment$businessCenterSection$2.INSTANCE);
    private final Lazy chooseBusinessSection$delegate = LazyKt.lazy(ProfileChooserStage2Fragment$chooseBusinessSection$2.INSTANCE);
    private final Lazy chooseCitySection$delegate = LazyKt.lazy(ProfileChooserStage2Fragment$chooseCitySection$2.INSTANCE);
    private final Lazy citiesSection$delegate = LazyKt.lazy(ProfileChooserStage2Fragment$citiesSection$2.INSTANCE);
    private final Lazy textSection$delegate = LazyKt.lazy(ProfileChooserStage2Fragment$textSection$2.INSTANCE);

    /* access modifiers changed from: private */
    public final AvailableAddressesSection getAvailableAddressesSection() {
        return (AvailableAddressesSection) this.availableAddressesSection$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final BusinessCenterSection getBusinessCenterSection() {
        return (BusinessCenterSection) this.businessCenterSection$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final ChooseCitySection getChooseBusinessSection() {
        return (ChooseCitySection) this.chooseBusinessSection$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final ChooseCitySection getChooseCitySection() {
        return (ChooseCitySection) this.chooseCitySection$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final CitiesSection getCitiesSection() {
        return (CitiesSection) this.citiesSection$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final TextSection getTextSection() {
        return (TextSection) this.textSection$delegate.getValue();
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
    public int getLayoutRes() {
        return R.layout.fragment_profile_selection_stage_2;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ ProfileSelectionVM access$getViewModell$p(ProfileChooserStage2Fragment profileChooserStage2Fragment) {
        return (ProfileSelectionVM) profileChooserStage2Fragment.viewModell;
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_profile_creation);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_profile_creation)");
        return string;
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(ProfileSelectionVM profileSelectionVM) {
        LiveData<List<BusinessCenterDTO>> businessCenter;
        LiveData<List<CityDTO>> cities;
        LiveData<BusinessCenterDTO> selectedBusCenter;
        LiveData<CityDTO> selectedCity;
        LiveData<Boolean> onBCChange;
        LiveData<Boolean> onCityChange;
        getChooseCitySection().setData(new CityDTO(0, (String) null, 3, (DefaultConstructorMarker) null));
        if (!(profileSelectionVM == null || (onCityChange = profileSelectionVM.getOnCityChange()) == null)) {
            onCityChange.observe(getViewLifecycleOwner(), new ProfileChooserStage2Fragment$onViewCreated$1(this));
        }
        if (!(profileSelectionVM == null || (onBCChange = profileSelectionVM.getOnBCChange()) == null)) {
            onBCChange.observe(getViewLifecycleOwner(), new ProfileChooserStage2Fragment$onViewCreated$2(this));
        }
        if (!(profileSelectionVM == null || (selectedCity = profileSelectionVM.getSelectedCity()) == null)) {
            selectedCity.observe(getViewLifecycleOwner(), new ProfileChooserStage2Fragment$onViewCreated$3(this));
        }
        if (!(profileSelectionVM == null || (selectedBusCenter = profileSelectionVM.getSelectedBusCenter()) == null)) {
            selectedBusCenter.observe(getViewLifecycleOwner(), new ProfileChooserStage2Fragment$onViewCreated$4(this));
        }
        if (!(profileSelectionVM == null || (cities = profileSelectionVM.getCities()) == null)) {
            cities.observe(getViewLifecycleOwner(), new ProfileChooserStage2Fragment$onViewCreated$5(this));
        }
        if (!(profileSelectionVM == null || (businessCenter = profileSelectionVM.getBusinessCenter()) == null)) {
            businessCenter.observe(getViewLifecycleOwner(), new ProfileChooserStage2Fragment$onViewCreated$6(this));
        }
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonNext)).setOnClickListener(new ProfileChooserStage2Fragment$onViewCreated$7(this));
    }

    public void onCreateView(View view) {
        Intrinsics.checkNotNullParameter(view, "root");
        initBottomSheet(view);
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        this.sectionedAdapter.addSectionSafety(getChooseCitySection());
        this.sectionedAdapter.addSectionSafety(getChooseBusinessSection());
        this.sectionedAdapter.addSectionSafety(getTextSection());
        this.sectionedAdapter.addSectionSafety(getAvailableAddressesSection());
        this.disposable.add(getChooseCitySection().getItemClick().subscribe(new ProfileChooserStage2Fragment$initSections$1(this)));
        this.disposable.add(getChooseBusinessSection().getItemClick().subscribe(new ProfileChooserStage2Fragment$initSections$2(this)));
        this.disposable.add(getAvailableAddressesSection().getItemClick().subscribe(new ProfileChooserStage2Fragment$initSections$3(this)));
    }

    private final void initBottomSheet(View view) {
        View findViewById = view.findViewById(R.id.bottom_sheet_cities);
        Intrinsics.checkNotNullExpressionValue(findViewById, "root.findViewById(R.id.bottom_sheet_cities)");
        this.bottomSheetBehavior = BottomSheetBehavior.from(findViewById);
        ((ImageView) findViewById.findViewById(C5619R.C5622id.close)).setOnClickListener(new ProfileChooserStage2Fragment$initBottomSheet$1(this));
        SectionedAdapter sectionedAdapter = new SectionedAdapter();
        RecyclerView recyclerView = (RecyclerView) findViewById.findViewById(C5619R.C5622id.f6518rv);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "bottomSheet.rv");
        recyclerView.setAdapter(sectionedAdapter);
        RecyclerView recyclerView2 = (RecyclerView) findViewById.findViewById(C5619R.C5622id.f6518rv);
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "bottomSheet.rv");
        recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()));
        sectionedAdapter.addSectionSafety(getCitiesSection());
        sectionedAdapter.addSectionSafety(getBusinessCenterSection());
        this.disposable.add(getCitiesSection().getItemClick().subscribe(new ProfileChooserStage2Fragment$initBottomSheet$2(this)));
        this.disposable.add(getBusinessCenterSection().getItemClick().subscribe(new ProfileChooserStage2Fragment$initBottomSheet$3(this)));
    }

    /* access modifiers changed from: private */
    public final void onDataClick(boolean z) {
        ((ProfileSelectionVM) this.viewModell).loadCities();
        getCitiesSection().show(z);
        getBusinessCenterSection().show(!z);
        showBottomSheet(true);
    }

    /* access modifiers changed from: private */
    public final void showBottomSheet(boolean z) {
        if (z) {
            BottomSheetBehavior<?> bottomSheetBehavior2 = this.bottomSheetBehavior;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.setState(3);
                return;
            }
            return;
        }
        BottomSheetBehavior<?> bottomSheetBehavior3 = this.bottomSheetBehavior;
        if (bottomSheetBehavior3 != null) {
            bottomSheetBehavior3.setState(4);
        }
    }
}
