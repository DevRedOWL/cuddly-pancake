package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseSectionFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.SearchSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.TextSection;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.sections.BuildingSection;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.sections.BusinessCenterSection;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.sections.ChooseCitySection;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.sections.CitiesSection;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.sections.SearchBuildingSection;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001BB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010-\u001a\u00020.H\u0014J\b\u0010/\u001a\u000200H\u0014J\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u000202H\u0002J\b\u00104\u001a\u000202H\u0014J\u0010\u00105\u001a\u0002022\u0006\u00106\u001a\u000200H\u0002J\u0010\u00107\u001a\u0002022\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u0002022\u0006\u0010;\u001a\u00020<H\u0002J\u0012\u0010=\u001a\u0002022\b\u0010>\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010?\u001a\u0002022\u0006\u0010@\u001a\u00020AH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\t\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b$\u0010\t\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b)\u0010\t\u001a\u0004\b'\u0010(R\u001b\u0010*\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b,\u0010\t\u001a\u0004\b+\u0010\r¨\u0006C"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/view/ProfileChooserUkAttachmentRequestFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseSectionFragment;", "Lru/unicorn/ujin/view/fragments/profileselection/view/ProfileSelectionVM;", "()V", "apartmentNumberSection", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/SearchSection;", "getApartmentNumberSection", "()Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/SearchSection;", "apartmentNumberSection$delegate", "Lkotlin/Lazy;", "apartmentNumberTitleSection", "Lru/unicorn/ujin/view/activity/navigation/ui/tickets/TextSection;", "getApartmentNumberTitleSection", "()Lru/unicorn/ujin/view/activity/navigation/ui/tickets/TextSection;", "apartmentNumberTitleSection$delegate", "bottomSheetDialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "buildingSection", "Lru/unicorn/ujin/view/fragments/profileselection/view/sections/BuildingSection;", "getBuildingSection", "()Lru/unicorn/ujin/view/fragments/profileselection/view/sections/BuildingSection;", "buildingSection$delegate", "chooseCitySection", "Lru/unicorn/ujin/view/fragments/profileselection/view/sections/ChooseCitySection;", "getChooseCitySection", "()Lru/unicorn/ujin/view/fragments/profileselection/view/sections/ChooseCitySection;", "chooseCitySection$delegate", "citiesSection", "Lru/unicorn/ujin/view/fragments/profileselection/view/sections/CitiesSection;", "getCitiesSection", "()Lru/unicorn/ujin/view/fragments/profileselection/view/sections/CitiesSection;", "citiesSection$delegate", "complexSection", "Lru/unicorn/ujin/view/fragments/profileselection/view/sections/BusinessCenterSection;", "getComplexSection", "()Lru/unicorn/ujin/view/fragments/profileselection/view/sections/BusinessCenterSection;", "complexSection$delegate", "searchBuildingSection", "Lru/unicorn/ujin/view/fragments/profileselection/view/sections/SearchBuildingSection;", "getSearchBuildingSection", "()Lru/unicorn/ujin/view/fragments/profileselection/view/sections/SearchBuildingSection;", "searchBuildingSection$delegate", "textSection", "getTextSection", "textSection$delegate", "getLayoutRes", "", "getMyToolbarTitle", "", "handleButtonVisibility", "", "initBottomSheet", "initSections", "onApartmentNumberChanged", "apartmentNumber", "onCreateView", "root", "Landroid/view/View;", "onDataClick", "whatClicked", "Lru/unicorn/ujin/view/fragments/profileselection/view/ProfileChooserUkAttachmentRequestFragment$WhatClicked;", "onViewCreated", "vm", "showBottomSheet", "show", "", "WhatClicked", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserUkAttachmentRequestFragment */
/* compiled from: ProfileChooserUkAttachmentRequestFragment.kt */
public final class ProfileChooserUkAttachmentRequestFragment extends BaseSectionFragment<ProfileSelectionVM> {
    private HashMap _$_findViewCache;
    private final Lazy apartmentNumberSection$delegate = LazyKt.lazy(C6072x1b61e068.INSTANCE);
    private final Lazy apartmentNumberTitleSection$delegate = LazyKt.lazy(C6073xb8a15a6.INSTANCE);
    private BottomSheetDialog bottomSheetDialog;
    private final Lazy buildingSection$delegate = LazyKt.lazy(new ProfileChooserUkAttachmentRequestFragment$buildingSection$2(this));
    private final Lazy chooseCitySection$delegate = LazyKt.lazy(ProfileChooserUkAttachmentRequestFragment$chooseCitySection$2.INSTANCE);
    private final Lazy citiesSection$delegate = LazyKt.lazy(new ProfileChooserUkAttachmentRequestFragment$citiesSection$2(this));
    private final Lazy complexSection$delegate = LazyKt.lazy(new ProfileChooserUkAttachmentRequestFragment$complexSection$2(this));
    private final Lazy searchBuildingSection$delegate = LazyKt.lazy(C6074xbb486e07.INSTANCE);
    private final Lazy textSection$delegate = LazyKt.lazy(ProfileChooserUkAttachmentRequestFragment$textSection$2.INSTANCE);

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/view/ProfileChooserUkAttachmentRequestFragment$WhatClicked;", "", "(Ljava/lang/String;I)V", "CITY", "COMPLEX", "BUILDING", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserUkAttachmentRequestFragment$WhatClicked */
    /* compiled from: ProfileChooserUkAttachmentRequestFragment.kt */
    public enum WhatClicked {
        CITY,
        COMPLEX,
        BUILDING
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserUkAttachmentRequestFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[WhatClicked.values().length];

        static {
            $EnumSwitchMapping$0[WhatClicked.CITY.ordinal()] = 1;
        }
    }

    /* access modifiers changed from: private */
    public final SearchSection getApartmentNumberSection() {
        return (SearchSection) this.apartmentNumberSection$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final TextSection getApartmentNumberTitleSection() {
        return (TextSection) this.apartmentNumberTitleSection$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final BuildingSection getBuildingSection() {
        return (BuildingSection) this.buildingSection$delegate.getValue();
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
    public final BusinessCenterSection getComplexSection() {
        return (BusinessCenterSection) this.complexSection$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final SearchBuildingSection getSearchBuildingSection() {
        return (SearchBuildingSection) this.searchBuildingSection$delegate.getValue();
    }

    private final TextSection getTextSection() {
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
        return R.layout.fragment_profile_selection_uk_attachment;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ ProfileSelectionVM access$getViewModell$p(ProfileChooserUkAttachmentRequestFragment profileChooserUkAttachmentRequestFragment) {
        return (ProfileSelectionVM) profileChooserUkAttachmentRequestFragment.viewModell;
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_profile_creation);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_profile_creation)");
        return string;
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(ProfileSelectionVM profileSelectionVM) {
        LiveData<List<SearchBuildingDTO>> buildings;
        LiveData<List<CityDTO>> cities;
        MutableLiveData<SearchBuildingDTO> selectedBuildingMutable;
        LiveData<CityDTO> selectedCity;
        LiveData<Boolean> onCityChange;
        getChooseCitySection().setData(new CityDTO(0, (String) null, 3, (DefaultConstructorMarker) null));
        if (!(profileSelectionVM == null || (onCityChange = profileSelectionVM.getOnCityChange()) == null)) {
            onCityChange.observe(getViewLifecycleOwner(), new ProfileChooserUkAttachmentRequestFragment$onViewCreated$1(this, profileSelectionVM));
        }
        if (!(profileSelectionVM == null || (selectedCity = profileSelectionVM.getSelectedCity()) == null)) {
            selectedCity.observe(getViewLifecycleOwner(), new ProfileChooserUkAttachmentRequestFragment$onViewCreated$2(this));
        }
        if (!(profileSelectionVM == null || (selectedBuildingMutable = profileSelectionVM.getSelectedBuildingMutable()) == null)) {
            selectedBuildingMutable.observe(getViewLifecycleOwner(), new ProfileChooserUkAttachmentRequestFragment$onViewCreated$3(this));
        }
        if (!(profileSelectionVM == null || (cities = profileSelectionVM.getCities()) == null)) {
            cities.observe(getViewLifecycleOwner(), new ProfileChooserUkAttachmentRequestFragment$onViewCreated$4(this));
        }
        if (!(profileSelectionVM == null || (buildings = profileSelectionVM.getBuildings()) == null)) {
            buildings.observe(getViewLifecycleOwner(), new ProfileChooserUkAttachmentRequestFragment$onViewCreated$5(this));
        }
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonNext)).setOnClickListener(new ProfileChooserUkAttachmentRequestFragment$onViewCreated$6(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r0.getSelectedApartmentNumber();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleButtonVisibility() {
        /*
            r4 = this;
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r4.viewModell
            ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM r0 = (p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM) r0
            r1 = 0
            if (r0 == 0) goto L_0x0014
            androidx.lifecycle.MutableLiveData r0 = r0.getSelectedApartmentNumber()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2 = 0
            if (r0 == 0) goto L_0x0023
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r0 = 0
            goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            if (r0 != 0) goto L_0x0056
            ru.unicorn.ujin.view.fragments.profileselection.view.sections.ChooseCitySection r0 = r4.getChooseCitySection()
            java.lang.Object r0 = r0.getData()
            ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO r0 = (p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO) r0
            int r0 = r0.getId()
            r3 = -1
            if (r0 == r3) goto L_0x0056
            ru.unicorn.ujin.view.fragments.profileselection.view.sections.SearchBuildingSection r0 = r4.getSearchBuildingSection()
            ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO r0 = r0.getSelectedValue()
            if (r0 == 0) goto L_0x0045
            ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings r1 = r0.getBuilding()
        L_0x0045:
            if (r1 != 0) goto L_0x0048
            goto L_0x0056
        L_0x0048:
            int r0 = p035ru.unicorn.C5619R.C5622id.buttonNext
            android.view.View r0 = r4._$_findCachedViewById(r0)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r0 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r0
            if (r0 == 0) goto L_0x0064
            r0.setVisibility(r2)
            goto L_0x0064
        L_0x0056:
            int r0 = p035ru.unicorn.C5619R.C5622id.buttonNext
            android.view.View r0 = r4._$_findCachedViewById(r0)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r0 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r0
            if (r0 == 0) goto L_0x0064
            r1 = 4
            r0.setVisibility(r1)
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserUkAttachmentRequestFragment.handleButtonVisibility():void");
    }

    public void onCreateView(View view) {
        Intrinsics.checkNotNullParameter(view, "root");
        initBottomSheet();
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        this.sectionedAdapter.addSectionSafety(getChooseCitySection());
        this.sectionedAdapter.addSectionSafety(getTextSection());
        this.sectionedAdapter.addSectionSafety(getSearchBuildingSection());
        this.sectionedAdapter.addSectionSafety(getApartmentNumberTitleSection());
        this.sectionedAdapter.addSectionSafety(getApartmentNumberSection());
        getApartmentNumberTitleSection().show(false);
        getSearchBuildingSection().show(false);
        this.disposable.add(getChooseCitySection().getItemClick().subscribe(new ProfileChooserUkAttachmentRequestFragment$initSections$1(this)));
        this.disposable.add(getSearchBuildingSection().getOnTextChanged().subscribe(new ProfileChooserUkAttachmentRequestFragment$initSections$2(this)));
        this.disposable.add(getSearchBuildingSection().getOnValueChanged().subscribe(new ProfileChooserUkAttachmentRequestFragment$initSections$3(this)));
        getApartmentNumberSection().getSubject().subscribe(new ProfileChooserUkAttachmentRequestFragment$initSections$4(this));
    }

    /* access modifiers changed from: private */
    public final void onApartmentNumberChanged(String str) {
        MutableLiveData<String> selectedApartmentNumber;
        MutableLiveData<String> selectedApartmentNumber2;
        if (!(str.length() == 0) && ((CityDTO) getChooseCitySection().getData()).getId() != -1) {
            SearchBuildingDTO selectedValue = getSearchBuildingSection().getSelectedValue();
            if ((selectedValue != null ? selectedValue.getBuilding() : null) != null) {
                ProfileSelectionVM profileSelectionVM = (ProfileSelectionVM) this.viewModell;
                if (!(profileSelectionVM == null || (selectedApartmentNumber2 = profileSelectionVM.getSelectedApartmentNumber()) == null)) {
                    selectedApartmentNumber2.setValue(str);
                }
                DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonNext);
                if (dynamicBackgroundButton != null) {
                    dynamicBackgroundButton.setVisibility(0);
                    return;
                }
                return;
            }
        }
        ProfileSelectionVM profileSelectionVM2 = (ProfileSelectionVM) this.viewModell;
        if (!(profileSelectionVM2 == null || (selectedApartmentNumber = profileSelectionVM2.getSelectedApartmentNumber()) == null)) {
            selectedApartmentNumber.setValue(null);
        }
        DynamicBackgroundButton dynamicBackgroundButton2 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonNext);
        if (dynamicBackgroundButton2 != null) {
            dynamicBackgroundButton2.setVisibility(4);
        }
    }

    private final void initBottomSheet() {
        this.bottomSheetDialog = new BottomSheetDialog(getBaseActivity());
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        View inflate = baseActivity.getLayoutInflater().inflate(R.layout.bottom_sheet_cities, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "bottomSheet");
        ((ImageView) inflate.findViewById(C5619R.C5622id.close)).setOnClickListener(new ProfileChooserUkAttachmentRequestFragment$initBottomSheet$1(this));
        SectionedAdapter sectionedAdapter = new SectionedAdapter();
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C5619R.C5622id.f6518rv);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "bottomSheet.rv");
        recyclerView.setAdapter(sectionedAdapter);
        RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(C5619R.C5622id.f6518rv);
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "bottomSheet.rv");
        recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()));
        sectionedAdapter.addSectionSafety(getCitiesSection());
        sectionedAdapter.addSectionSafety(getComplexSection());
        sectionedAdapter.addSectionSafety(getBuildingSection());
        BottomSheetDialog bottomSheetDialog2 = this.bottomSheetDialog;
        if (bottomSheetDialog2 != null) {
            bottomSheetDialog2.setContentView(inflate);
        }
        BottomSheetDialog bottomSheetDialog3 = this.bottomSheetDialog;
        if (bottomSheetDialog3 != null) {
            bottomSheetDialog3.show();
        }
        this.disposable.add(getCitiesSection().getItemClick().subscribe(new ProfileChooserUkAttachmentRequestFragment$initBottomSheet$2(this)));
        this.disposable.add(getComplexSection().getItemClick().subscribe(new ProfileChooserUkAttachmentRequestFragment$initBottomSheet$3(this)));
        this.disposable.add(getBuildingSection().getItemClick().subscribe(new ProfileChooserUkAttachmentRequestFragment$initBottomSheet$4(this)));
    }

    /* access modifiers changed from: private */
    public final void onDataClick(WhatClicked whatClicked) {
        if (WhenMappings.$EnumSwitchMapping$0[whatClicked.ordinal()] == 1) {
            ((ProfileSelectionVM) this.viewModell).getCitiesListMutable().setValue(CollectionsKt.emptyList());
            ((ProfileSelectionVM) this.viewModell).loadCitiesWithUK();
            getCitiesSection().show(true);
            getComplexSection().show(false);
            getBuildingSection().show(false);
        }
        showBottomSheet(true);
    }

    /* access modifiers changed from: private */
    public final void showBottomSheet(boolean z) {
        if (z) {
            BottomSheetDialog bottomSheetDialog2 = this.bottomSheetDialog;
            if (bottomSheetDialog2 != null) {
                bottomSheetDialog2.show();
                return;
            }
            return;
        }
        BottomSheetDialog bottomSheetDialog3 = this.bottomSheetDialog;
        if (bottomSheetDialog3 != null) {
            bottomSheetDialog3.dismiss();
        }
    }
}
