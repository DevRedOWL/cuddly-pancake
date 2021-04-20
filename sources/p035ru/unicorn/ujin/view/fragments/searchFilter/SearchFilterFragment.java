package p035ru.unicorn.ujin.view.fragments.searchFilter;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.City;
import p035ru.unicorn.ujin.data.realm.Complex;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.customViews.rangeSeekBar.CrystalRangeSeekbar;
import p035ru.unicorn.ujin.view.customViews.textRadioButtonGroup.TextRadioButton;
import p035ru.unicorn.ujin.view.customViews.textRadioButtonGroup.TextRadioButtonGroup;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.fragments.FlatListFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bK\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 Ï\u00012\u00020\u0001:\u0002Ï\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u0012H\u0002J\u0014\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u0012H\u0002J\n\u0010 \u0001\u001a\u00030\u0001H\u0002J\u0013\u0010¡\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u0012H\u0002J\u0013\u0010¢\u0001\u001a\u00030\u00012\u0007\u0010£\u0001\u001a\u00020\u0004H\u0002J\u0014\u0010¤\u0001\u001a\u00030\u00012\b\u0010£\u0001\u001a\u00030¥\u0001H\u0002J\u0014\u0010¦\u0001\u001a\u00030\u00012\b\u0010£\u0001\u001a\u00030§\u0001H\u0002J\u0014\u0010¨\u0001\u001a\u00030\u00012\b\u0010£\u0001\u001a\u00030©\u0001H\u0002J\u0014\u0010ª\u0001\u001a\u00030\u00012\b\u0010£\u0001\u001a\u00030«\u0001H\u0002J\n\u0010¬\u0001\u001a\u00030\u0001H\u0002J\n\u0010­\u0001\u001a\u00030\u0001H\u0002J\n\u0010®\u0001\u001a\u00030\u0001H\u0002J\n\u0010¯\u0001\u001a\u00030\u0001H\u0002J\n\u0010°\u0001\u001a\u00030\u0001H\u0002J\n\u0010±\u0001\u001a\u00030\u0001H\u0002J\n\u0010²\u0001\u001a\u00030\u0001H\u0002J\n\u0010³\u0001\u001a\u00030\u0001H\u0002J\n\u0010´\u0001\u001a\u00030\u0001H\u0002J\t\u0010µ\u0001\u001a\u00020\u0018H\u0014J.\u0010¶\u0001\u001a\u0005\u0018\u00010·\u00012\b\u0010¸\u0001\u001a\u00030¹\u00012\n\u0010º\u0001\u001a\u0005\u0018\u00010»\u00012\n\u0010¼\u0001\u001a\u0005\u0018\u00010½\u0001H\u0016J\n\u0010¾\u0001\u001a\u00030\u0001H\u0016J\n\u0010¿\u0001\u001a\u00030\u0001H\u0016J\n\u0010À\u0001\u001a\u00030\u0001H\u0016J \u0010Á\u0001\u001a\u00030\u00012\b\u0010Â\u0001\u001a\u00030·\u00012\n\u0010¼\u0001\u001a\u0005\u0018\u00010½\u0001H\u0016J\n\u0010Ã\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010Ä\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u0012H\u0002J\n\u0010Å\u0001\u001a\u00030\u0001H\u0002J\n\u0010Æ\u0001\u001a\u00030\u0001H\u0014J\u0011\u0010Ç\u0001\u001a\u00030\u00012\u0007\u0010È\u0001\u001a\u00020\u0018J\u0014\u0010É\u0001\u001a\u00030\u00012\b\u0010Ê\u0001\u001a\u00030·\u0001H\u0002J\u0013\u0010Ë\u0001\u001a\u00030\u00012\u0007\u0010Ì\u0001\u001a\u000206H\u0002J\u0014\u0010Í\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0014\u0010Î\u0001\u001a\u00030\u00012\b\u0010Ê\u0001\u001a\u00030\u0001H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR.\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R.\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R.\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001a\u0010\u001f\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R.\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020#\u0018\u00010\nj\n\u0012\u0004\u0012\u00020#\u0018\u0001`\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R\u001a\u0010&\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R.\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010\u0010R\u0011\u0010,\u001a\u00020-¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u000206X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u000206X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00107\"\u0004\b;\u00109R\u0011\u0010<\u001a\u00020=¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u001a\u0010@\u001a\u000206X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u00107\"\u0004\bB\u00109R\u001c\u0010C\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00102\"\u0004\bE\u00104R\u001c\u0010F\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u00102\"\u0004\bH\u00104R\u001c\u0010I\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u00102\"\u0004\bK\u00104R\u001c\u0010L\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u00102\"\u0004\bN\u00104R\u001c\u0010O\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u00102\"\u0004\bQ\u00104R\u001c\u0010R\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u00102\"\u0004\bT\u00104R\u001c\u0010U\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u00102\"\u0004\bW\u00104R\u001c\u0010X\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u00102\"\u0004\bZ\u00104R\u001c\u0010[\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u00102\"\u0004\b]\u00104R\u001c\u0010^\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u00102\"\u0004\b`\u00104R\u001c\u0010a\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u00102\"\u0004\bc\u00104R\u001c\u0010d\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u00102\"\u0004\bf\u00104R\u001c\u0010g\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u00102\"\u0004\bi\u00104R\u001c\u0010j\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u00102\"\u0004\bl\u00104R\u001c\u0010m\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u00102\"\u0004\bo\u00104R\u001c\u0010p\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u00102\"\u0004\br\u00104R\u001c\u0010s\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u00102\"\u0004\bu\u00104R\u001c\u0010v\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u00102\"\u0004\bx\u00104R\u001c\u0010y\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u00102\"\u0004\b{\u00104R\u001c\u0010|\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u00102\"\u0004\b~\u00104R\u001e\u0010\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u00102\"\u0005\b\u0001\u00104R\u001d\u0010\u0001\u001a\u000206X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u00107\"\u0005\b\u0001\u00109R\u001d\u0010\u0001\u001a\u000206X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u00107\"\u0005\b\u0001\u00109R!\u0010\u0001\u001a\u00030\u00018FX\u0002¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R3\u0010\u0001\u001a\u0018\u0012\u0005\u0012\u00030\u0001\u0018\u00010\nj\u000b\u0012\u0005\u0012\u00030\u0001\u0018\u0001`\fX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\u000e\"\u0005\b\u0001\u0010\u0010R\u001d\u0010\u0001\u001a\u00020\u0012X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\u0014\"\u0005\b\u0001\u0010\u0016R1\u0010\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\fX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\u000e\"\u0005\b\u0001\u0010\u0010¨\u0006Ð\u0001"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/searchFilter/SearchFilterFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "apartmentListEvent", "Lru/unicorn/ujin/view/fragments/searchFilter/ApartmentListEvent;", "getApartmentListEvent", "()Lru/unicorn/ujin/view/fragments/searchFilter/ApartmentListEvent;", "setApartmentListEvent", "(Lru/unicorn/ujin/view/fragments/searchFilter/ApartmentListEvent;)V", "buildingList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/searchFilter/Building;", "Lkotlin/collections/ArrayList;", "getBuildingList", "()Ljava/util/ArrayList;", "setBuildingList", "(Ljava/util/ArrayList;)V", "buildingPos", "", "getBuildingPos", "()I", "setBuildingPos", "(I)V", "buildingStringList", "", "getBuildingStringList", "setBuildingStringList", "cityList", "Lru/unicorn/ujin/data/realm/City;", "getCityList", "setCityList", "cityPos", "getCityPos", "setCityPos", "complexList", "Lru/unicorn/ujin/data/realm/Complex;", "getComplexList", "setComplexList", "complexPos", "getComplexPos", "setComplexPos", "complexStringList", "getComplexStringList", "setComplexStringList", "countDownTimer", "Landroid/os/CountDownTimer;", "getCountDownTimer", "()Landroid/os/CountDownTimer;", "defaultComplexId", "getDefaultComplexId", "()Ljava/lang/String;", "setDefaultComplexId", "(Ljava/lang/String;)V", "isTimerFinished", "", "()Z", "setTimerFinished", "(Z)V", "isValuesChangingManually", "setValuesChangingManually", "noCopyPasteCallback", "Landroid/view/ActionMode$Callback;", "getNoCopyPasteCallback", "()Landroid/view/ActionMode$Callback;", "refreshNumbers", "getRefreshNumbers", "setRefreshNumbers", "savedBuildingId", "getSavedBuildingId", "setSavedBuildingId", "savedButton1room", "getSavedButton1room", "setSavedButton1room", "savedButton2room", "getSavedButton2room", "setSavedButton2room", "savedButton3room", "getSavedButton3room", "setSavedButton3room", "savedButton4orMore", "getSavedButton4orMore", "setSavedButton4orMore", "savedButtonStudia", "getSavedButtonStudia", "setSavedButtonStudia", "savedCityId", "getSavedCityId", "setSavedCityId", "savedComplexId", "getSavedComplexId", "setSavedComplexId", "savedMyFloorMaxValue", "getSavedMyFloorMaxValue", "setSavedMyFloorMaxValue", "savedMyFloorMinValue", "getSavedMyFloorMinValue", "setSavedMyFloorMinValue", "savedMyPriceMaxValue", "getSavedMyPriceMaxValue", "setSavedMyPriceMaxValue", "savedMyPriceMinValue", "getSavedMyPriceMinValue", "setSavedMyPriceMinValue", "savedMySquareMaxValue", "getSavedMySquareMaxValue", "setSavedMySquareMaxValue", "savedMySquareMinValue", "getSavedMySquareMinValue", "setSavedMySquareMinValue", "savedSectionId", "getSavedSectionId", "setSavedSectionId", "savedStartFloorMaxValue", "getSavedStartFloorMaxValue", "setSavedStartFloorMaxValue", "savedStartFloorMinValue", "getSavedStartFloorMinValue", "setSavedStartFloorMinValue", "savedStartPriceMaxValue", "getSavedStartPriceMaxValue", "setSavedStartPriceMaxValue", "savedStartPriceMinValue", "getSavedStartPriceMinValue", "setSavedStartPriceMinValue", "savedStartSquareMaxValue", "getSavedStartSquareMaxValue", "setSavedStartSquareMaxValue", "savedStartSquareMinValue", "getSavedStartSquareMinValue", "setSavedStartSquareMinValue", "savedSwitchFinished", "getSavedSwitchFinished", "setSavedSwitchFinished", "savedSwitchSale", "getSavedSwitchSale", "setSavedSwitchSale", "searchFilterViewModel", "Lru/unicorn/ujin/view/fragments/searchFilter/SearchFilterViewModel;", "getSearchFilterViewModel", "()Lru/unicorn/ujin/view/fragments/searchFilter/SearchFilterViewModel;", "searchFilterViewModel$delegate", "Lkotlin/Lazy;", "sectionList", "Lru/unicorn/ujin/view/fragments/searchFilter/Section;", "getSectionList", "setSectionList", "sectionPos", "getSectionPos", "setSectionPos", "sectionStringList", "getSectionStringList", "setSectionStringList", "buildingSelected", "", "pos", "checkButton", "it", "Landroid/widget/Button;", "checkTimer", "citySelected", "clearSavedValues", "complexSelected", "handleApartmentListEvent", "event", "handleBuildingListEvent", "Lru/unicorn/ujin/view/fragments/searchFilter/BuildingListEvent;", "handleCityListEvent", "Lru/unicorn/ujin/view/fragments/searchFilter/CityListEvent;", "handleComplexListEvent", "Lru/unicorn/ujin/view/fragments/searchFilter/ComplexListEvent;", "handleSectionListEvent", "Lru/unicorn/ujin/view/fragments/searchFilter/SectionListEvent;", "initBuildingRadioGroup", "initBuildingRadioGroupAdapter", "initCityRadioGroup", "initCityRadioGroupAdapter", "initComplexRadioGroup", "initComplexRadioGroupAdapter", "initRoomButtonsOther", "initSectionRadioGroup", "initSectionRadioGroupAdapter", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onPause", "onResume", "onViewCreated", "view", "requestFlatFilter", "sectionSelected", "showFlatList", "showToolbar", "toast", "message", "toggleButton", "button", "toggleLoading", "loading", "uncheckButton", "uncheckEnabledButton", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.searchFilter.SearchFilterFragment */
/* compiled from: SearchFilterFragment.kt */
public final class SearchFilterFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String SEARCH_COMPLEX_ID = "complexId";
    private HashMap _$_findViewCache;
    private ApartmentListEvent apartmentListEvent;
    private ArrayList<Building> buildingList;
    private int buildingPos;
    private ArrayList<String> buildingStringList;
    private ArrayList<City> cityList;
    private int cityPos;
    private ArrayList<Complex> complexList;
    private int complexPos;
    private ArrayList<String> complexStringList;
    private final CountDownTimer countDownTimer = new SearchFilterFragment$countDownTimer$1(this, 1200, 400);
    private String defaultComplexId;
    private boolean isTimerFinished;
    private boolean isValuesChangingManually;
    private final ActionMode.Callback noCopyPasteCallback = new SearchFilterFragment$noCopyPasteCallback$1();
    private boolean refreshNumbers;
    private String savedBuildingId;
    private String savedButton1room;
    private String savedButton2room;
    private String savedButton3room;
    private String savedButton4orMore;
    private String savedButtonStudia;
    private String savedCityId;
    private String savedComplexId;
    private String savedMyFloorMaxValue;
    private String savedMyFloorMinValue;
    private String savedMyPriceMaxValue;
    private String savedMyPriceMinValue;
    private String savedMySquareMaxValue;
    private String savedMySquareMinValue;
    private String savedSectionId;
    private String savedStartFloorMaxValue;
    private String savedStartFloorMinValue;
    private String savedStartPriceMaxValue;
    private String savedStartPriceMinValue;
    private String savedStartSquareMaxValue;
    private String savedStartSquareMinValue;
    private boolean savedSwitchFinished;
    private boolean savedSwitchSale;
    private final Lazy searchFilterViewModel$delegate = LazyKt.lazy(new SearchFilterFragment$searchFilterViewModel$2(this));
    private ArrayList<Section> sectionList;
    private int sectionPos;
    private ArrayList<String> sectionStringList;

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

    public final SearchFilterViewModel getSearchFilterViewModel() {
        return (SearchFilterViewModel) this.searchFilterViewModel$delegate.getValue();
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public final ArrayList<City> getCityList() {
        return this.cityList;
    }

    public final void setCityList(ArrayList<City> arrayList) {
        this.cityList = arrayList;
    }

    public final int getCityPos() {
        return this.cityPos;
    }

    public final void setCityPos(int i) {
        this.cityPos = i;
    }

    public final ArrayList<Complex> getComplexList() {
        return this.complexList;
    }

    public final void setComplexList(ArrayList<Complex> arrayList) {
        this.complexList = arrayList;
    }

    public final ArrayList<String> getComplexStringList() {
        return this.complexStringList;
    }

    public final void setComplexStringList(ArrayList<String> arrayList) {
        this.complexStringList = arrayList;
    }

    public final int getComplexPos() {
        return this.complexPos;
    }

    public final void setComplexPos(int i) {
        this.complexPos = i;
    }

    public final String getDefaultComplexId() {
        return this.defaultComplexId;
    }

    public final void setDefaultComplexId(String str) {
        this.defaultComplexId = str;
    }

    public final ArrayList<Building> getBuildingList() {
        return this.buildingList;
    }

    public final void setBuildingList(ArrayList<Building> arrayList) {
        this.buildingList = arrayList;
    }

    public final ArrayList<String> getBuildingStringList() {
        return this.buildingStringList;
    }

    public final void setBuildingStringList(ArrayList<String> arrayList) {
        this.buildingStringList = arrayList;
    }

    public final int getBuildingPos() {
        return this.buildingPos;
    }

    public final void setBuildingPos(int i) {
        this.buildingPos = i;
    }

    public final ArrayList<Section> getSectionList() {
        return this.sectionList;
    }

    public final void setSectionList(ArrayList<Section> arrayList) {
        this.sectionList = arrayList;
    }

    public final ArrayList<String> getSectionStringList() {
        return this.sectionStringList;
    }

    public final void setSectionStringList(ArrayList<String> arrayList) {
        this.sectionStringList = arrayList;
    }

    public final int getSectionPos() {
        return this.sectionPos;
    }

    public final void setSectionPos(int i) {
        this.sectionPos = i;
    }

    public final boolean getRefreshNumbers() {
        return this.refreshNumbers;
    }

    public final void setRefreshNumbers(boolean z) {
        this.refreshNumbers = z;
    }

    public final ApartmentListEvent getApartmentListEvent() {
        return this.apartmentListEvent;
    }

    public final void setApartmentListEvent(ApartmentListEvent apartmentListEvent2) {
        this.apartmentListEvent = apartmentListEvent2;
    }

    public final boolean isTimerFinished() {
        return this.isTimerFinished;
    }

    public final void setTimerFinished(boolean z) {
        this.isTimerFinished = z;
    }

    public final CountDownTimer getCountDownTimer() {
        return this.countDownTimer;
    }

    public final String getSavedCityId() {
        return this.savedCityId;
    }

    public final void setSavedCityId(String str) {
        this.savedCityId = str;
    }

    public final String getSavedComplexId() {
        return this.savedComplexId;
    }

    public final void setSavedComplexId(String str) {
        this.savedComplexId = str;
    }

    public final String getSavedBuildingId() {
        return this.savedBuildingId;
    }

    public final void setSavedBuildingId(String str) {
        this.savedBuildingId = str;
    }

    public final String getSavedSectionId() {
        return this.savedSectionId;
    }

    public final void setSavedSectionId(String str) {
        this.savedSectionId = str;
    }

    public final String getSavedButtonStudia() {
        return this.savedButtonStudia;
    }

    public final void setSavedButtonStudia(String str) {
        this.savedButtonStudia = str;
    }

    public final String getSavedButton1room() {
        return this.savedButton1room;
    }

    public final void setSavedButton1room(String str) {
        this.savedButton1room = str;
    }

    public final String getSavedButton2room() {
        return this.savedButton2room;
    }

    public final void setSavedButton2room(String str) {
        this.savedButton2room = str;
    }

    public final String getSavedButton3room() {
        return this.savedButton3room;
    }

    public final void setSavedButton3room(String str) {
        this.savedButton3room = str;
    }

    public final String getSavedButton4orMore() {
        return this.savedButton4orMore;
    }

    public final void setSavedButton4orMore(String str) {
        this.savedButton4orMore = str;
    }

    public final String getSavedMySquareMinValue() {
        return this.savedMySquareMinValue;
    }

    public final void setSavedMySquareMinValue(String str) {
        this.savedMySquareMinValue = str;
    }

    public final String getSavedMySquareMaxValue() {
        return this.savedMySquareMaxValue;
    }

    public final void setSavedMySquareMaxValue(String str) {
        this.savedMySquareMaxValue = str;
    }

    public final String getSavedMyFloorMinValue() {
        return this.savedMyFloorMinValue;
    }

    public final void setSavedMyFloorMinValue(String str) {
        this.savedMyFloorMinValue = str;
    }

    public final String getSavedMyFloorMaxValue() {
        return this.savedMyFloorMaxValue;
    }

    public final void setSavedMyFloorMaxValue(String str) {
        this.savedMyFloorMaxValue = str;
    }

    public final String getSavedMyPriceMinValue() {
        return this.savedMyPriceMinValue;
    }

    public final void setSavedMyPriceMinValue(String str) {
        this.savedMyPriceMinValue = str;
    }

    public final String getSavedMyPriceMaxValue() {
        return this.savedMyPriceMaxValue;
    }

    public final void setSavedMyPriceMaxValue(String str) {
        this.savedMyPriceMaxValue = str;
    }

    public final String getSavedStartSquareMinValue() {
        return this.savedStartSquareMinValue;
    }

    public final void setSavedStartSquareMinValue(String str) {
        this.savedStartSquareMinValue = str;
    }

    public final String getSavedStartSquareMaxValue() {
        return this.savedStartSquareMaxValue;
    }

    public final void setSavedStartSquareMaxValue(String str) {
        this.savedStartSquareMaxValue = str;
    }

    public final String getSavedStartFloorMinValue() {
        return this.savedStartFloorMinValue;
    }

    public final void setSavedStartFloorMinValue(String str) {
        this.savedStartFloorMinValue = str;
    }

    public final String getSavedStartFloorMaxValue() {
        return this.savedStartFloorMaxValue;
    }

    public final void setSavedStartFloorMaxValue(String str) {
        this.savedStartFloorMaxValue = str;
    }

    public final String getSavedStartPriceMinValue() {
        return this.savedStartPriceMinValue;
    }

    public final void setSavedStartPriceMinValue(String str) {
        this.savedStartPriceMinValue = str;
    }

    public final String getSavedStartPriceMaxValue() {
        return this.savedStartPriceMaxValue;
    }

    public final void setSavedStartPriceMaxValue(String str) {
        this.savedStartPriceMaxValue = str;
    }

    public final boolean getSavedSwitchFinished() {
        return this.savedSwitchFinished;
    }

    public final void setSavedSwitchFinished(boolean z) {
        this.savedSwitchFinished = z;
    }

    public final boolean getSavedSwitchSale() {
        return this.savedSwitchSale;
    }

    public final void setSavedSwitchSale(boolean z) {
        this.savedSwitchSale = z;
    }

    public final boolean isValuesChangingManually() {
        return this.isValuesChangingManually;
    }

    public final void setValuesChangingManually(boolean z) {
        this.isValuesChangingManually = z;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.title_search));
        ArrayList arrayList = new ArrayList();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.toolbar_button_text, getBaseActivity().llButtonsRight, false);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            textView.setText(getResources().getString(R.string.search_filter_clear));
            textView.setOnClickListener(new SearchFilterFragment$showToolbar$1(this));
            arrayList.add(textView);
            getBaseActivity().setToolbarRight(arrayList);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_seach_filter, viewGroup, false);
    }

    public void onResume() {
        super.onResume();
        LifecycleOwner lifecycleOwner = this;
        getSearchFilterViewModel().getShowProgressLiveData().observe(lifecycleOwner, new SearchFilterFragment$onResume$1(this));
        getSearchFilterViewModel().getCityListLiveData().observe(lifecycleOwner, new SearchFilterFragment$onResume$2(this));
        getSearchFilterViewModel().getComplexListLiveData().observe(lifecycleOwner, new SearchFilterFragment$onResume$3(this));
        getSearchFilterViewModel().getBuildingListLiveData().observe(lifecycleOwner, new SearchFilterFragment$onResume$4(this));
        getSearchFilterViewModel().getSectionListLiveData().observe(lifecycleOwner, new SearchFilterFragment$onResume$5(this));
        getSearchFilterViewModel().getApartmentListLiveData().observe(lifecycleOwner, new SearchFilterFragment$onResume$6(this));
    }

    public void onPause() {
        int i;
        int i2;
        int i3;
        int i4;
        LifecycleOwner lifecycleOwner = this;
        getSearchFilterViewModel().getShowProgressLiveData().removeObservers(lifecycleOwner);
        getSearchFilterViewModel().getCityListLiveData().removeObservers(lifecycleOwner);
        getSearchFilterViewModel().getComplexListLiveData().removeObservers(lifecycleOwner);
        getSearchFilterViewModel().getBuildingListLiveData().removeObservers(lifecycleOwner);
        getSearchFilterViewModel().getSectionListLiveData().removeObservers(lifecycleOwner);
        getSearchFilterViewModel().getApartmentListLiveData().removeObservers(lifecycleOwner);
        ArrayList<City> arrayList = this.cityList;
        if (arrayList != null && arrayList.size() > (i4 = this.cityPos)) {
            City city = arrayList.get(i4);
            Intrinsics.checkNotNullExpressionValue(city, "it[cityPos]");
            this.savedCityId = city.getId();
        }
        ArrayList<Complex> arrayList2 = this.complexList;
        if (arrayList2 != null && arrayList2.size() > (i3 = this.complexPos)) {
            Complex complex = arrayList2.get(i3);
            Intrinsics.checkNotNullExpressionValue(complex, "it[complexPos]");
            this.savedComplexId = complex.getId();
        }
        ArrayList<Building> arrayList3 = this.buildingList;
        if (arrayList3 != null && arrayList3.size() > (i2 = this.buildingPos)) {
            this.savedBuildingId = arrayList3.get(i2).getId();
        }
        ArrayList<Section> arrayList4 = this.sectionList;
        if (arrayList4 != null && arrayList4.size() > (i = this.sectionPos)) {
            this.savedSectionId = arrayList4.get(i).getId();
        }
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonStudia2);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "buttonStudia2");
        String str = "1";
        this.savedButtonStudia = Intrinsics.areEqual((Object) dynamicBackgroundButton.getTag().toString(), (Object) str) ? str : null;
        DynamicBackgroundButton dynamicBackgroundButton2 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.button1room2);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton2, "button1room2");
        this.savedButton1room = Intrinsics.areEqual((Object) dynamicBackgroundButton2.getTag().toString(), (Object) str) ? str : null;
        DynamicBackgroundButton dynamicBackgroundButton3 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.button2rooms2);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton3, "button2rooms2");
        this.savedButton2room = Intrinsics.areEqual((Object) dynamicBackgroundButton3.getTag().toString(), (Object) str) ? str : null;
        DynamicBackgroundButton dynamicBackgroundButton4 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.button3rooms2);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton4, "button3rooms2");
        this.savedButton3room = Intrinsics.areEqual((Object) dynamicBackgroundButton4.getTag().toString(), (Object) str) ? str : null;
        DynamicBackgroundButton dynamicBackgroundButton5 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.button4orMore2);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton5, "button4orMore2");
        if (!Intrinsics.areEqual((Object) dynamicBackgroundButton5.getTag().toString(), (Object) str)) {
            str = null;
        }
        this.savedButton4orMore = str;
        CrystalRangeSeekbar crystalRangeSeekbar = (CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsSquare);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar, "crsSquare");
        this.savedMySquareMinValue = crystalRangeSeekbar.getMinValueMy().toString();
        CrystalRangeSeekbar crystalRangeSeekbar2 = (CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsSquare);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar2, "crsSquare");
        this.savedMySquareMaxValue = crystalRangeSeekbar2.getMaxValueMy().toString();
        CrystalRangeSeekbar crystalRangeSeekbar3 = (CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsFloor);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar3, "crsFloor");
        this.savedMyFloorMinValue = crystalRangeSeekbar3.getMinValueMy().toString();
        CrystalRangeSeekbar crystalRangeSeekbar4 = (CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsFloor);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar4, "crsFloor");
        this.savedMyFloorMaxValue = crystalRangeSeekbar4.getMaxValueMy().toString();
        CrystalRangeSeekbar crystalRangeSeekbar5 = (CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsPrice);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar5, "crsPrice");
        this.savedMyPriceMinValue = crystalRangeSeekbar5.getMinValueMy().toString();
        CrystalRangeSeekbar crystalRangeSeekbar6 = (CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsPrice);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar6, "crsPrice");
        this.savedMyPriceMaxValue = crystalRangeSeekbar6.getMaxValueMy().toString();
        CrystalRangeSeekbar crystalRangeSeekbar7 = (CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsSquare);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar7, "crsSquare");
        this.savedStartSquareMinValue = crystalRangeSeekbar7.getMinValue().toString();
        CrystalRangeSeekbar crystalRangeSeekbar8 = (CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsSquare);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar8, "crsSquare");
        this.savedStartSquareMaxValue = crystalRangeSeekbar8.getMaxValue().toString();
        CrystalRangeSeekbar crystalRangeSeekbar9 = (CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsFloor);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar9, "crsFloor");
        this.savedStartFloorMinValue = crystalRangeSeekbar9.getMinValue().toString();
        CrystalRangeSeekbar crystalRangeSeekbar10 = (CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsFloor);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar10, "crsFloor");
        this.savedStartFloorMaxValue = crystalRangeSeekbar10.getMaxValue().toString();
        CrystalRangeSeekbar crystalRangeSeekbar11 = (CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsPrice);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar11, "crsPrice");
        this.savedStartPriceMinValue = crystalRangeSeekbar11.getMinValue().toString();
        CrystalRangeSeekbar crystalRangeSeekbar12 = (CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsPrice);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar12, "crsPrice");
        this.savedStartPriceMaxValue = crystalRangeSeekbar12.getMaxValue().toString();
        Switch switchR = (Switch) _$_findCachedViewById(C5619R.C5622id.switchFinished);
        Intrinsics.checkNotNullExpressionValue(switchR, "switchFinished");
        this.savedSwitchFinished = switchR.isChecked();
        Switch switchR2 = (Switch) _$_findCachedViewById(C5619R.C5622id.switchSale);
        Intrinsics.checkNotNullExpressionValue(switchR2, "switchSale");
        this.savedSwitchSale = switchR2.isChecked();
        super.onPause();
    }

    /* access modifiers changed from: private */
    public final void clearSavedValues() {
        String str = null;
        this.savedCityId = str;
        this.savedComplexId = str;
        this.savedBuildingId = str;
        this.savedSectionId = str;
        this.savedButtonStudia = str;
        this.savedButton1room = str;
        this.savedButton2room = str;
        this.savedButton3room = str;
        this.savedButton4orMore = str;
        this.savedMySquareMinValue = str;
        this.savedMySquareMaxValue = str;
        this.savedMyFloorMinValue = str;
        this.savedMyFloorMaxValue = str;
        this.savedMyPriceMinValue = str;
        this.savedMyPriceMaxValue = str;
        this.savedStartSquareMinValue = str;
        this.savedStartSquareMaxValue = str;
        this.savedStartFloorMinValue = str;
        this.savedStartFloorMaxValue = str;
        this.savedStartPriceMinValue = str;
        this.savedStartPriceMaxValue = str;
        this.savedSwitchFinished = false;
        this.savedSwitchSale = false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.refreshNumbers = true;
        this.isValuesChangingManually = false;
        Bundle arguments = getArguments();
        this.defaultComplexId = arguments != null ? arguments.getString("complexId") : null;
        if (Intrinsics.areEqual((Object) getBaseActivity().flavor.getAppName(), (Object) Flavor.PAN.getAppName())) {
            DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonStudia2);
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "buttonStudia2");
            dynamicBackgroundButton.setVisibility(8);
        }
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llParentKortros);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "llParentKortros");
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llParentOther);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "llParentOther");
        linearLayout2.setVisibility(0);
        initCityRadioGroup();
        initComplexRadioGroup();
        initBuildingRadioGroup();
        initSectionRadioGroup();
        this.isValuesChangingManually = false;
        ((CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsSquare)).setOnRangeSeekbarChangeListener(new SearchFilterFragment$onViewCreated$1(this));
        ((CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsFloor)).setOnRangeSeekbarChangeListener(new SearchFilterFragment$onViewCreated$2(this));
        ((CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsPrice)).setOnRangeSeekbarChangeListener(new SearchFilterFragment$onViewCreated$3(this));
        ((Switch) _$_findCachedViewById(C5619R.C5622id.switchSale)).setOnCheckedChangeListener(new SearchFilterFragment$onViewCreated$4(this));
        ((Switch) _$_findCachedViewById(C5619R.C5622id.switchFinished)).setOnCheckedChangeListener(new SearchFilterFragment$onViewCreated$5(this));
        initRoomButtonsOther();
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonShowApartments)).setOnClickListener(new SearchFilterFragment$onViewCreated$6(this));
        getSearchFilterViewModel().requestCityList();
    }

    public void onDestroyView() {
        this.countDownTimer.cancel();
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: private */
    public final void checkTimer() {
        this.isTimerFinished = false;
        this.countDownTimer.cancel();
        this.countDownTimer.start();
    }

    private final void initCityRadioGroup() {
        this.cityList = this.viewModel.getCityList();
        ((TextRadioButtonGroup) _$_findCachedViewById(C5619R.C5622id.trbCity)).setOnCheckedChangeListener(new SearchFilterFragment$initCityRadioGroup$1(this));
        initCityRadioGroupAdapter();
    }

    private final void initCityRadioGroupAdapter() {
        ((TextRadioButtonGroup) _$_findCachedViewById(C5619R.C5622id.trbCity)).removeAllViews();
        ArrayList<City> arrayList = this.cityList;
        if (arrayList != null) {
            this.isValuesChangingManually = false;
            int size = arrayList.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                City city = arrayList.get(i2);
                Intrinsics.checkNotNullExpressionValue(city, "it[i]");
                City city2 = city;
                Context context = getContext();
                Intrinsics.checkNotNull(context);
                Intrinsics.checkNotNullExpressionValue(context, "context!!");
                TextRadioButton textRadioButton = new TextRadioButton(context, (AttributeSet) null);
                textRadioButton.setText(city2.getTitle());
                textRadioButton.setId(i2);
                Unit unit = Unit.INSTANCE;
                ((TextRadioButtonGroup) _$_findCachedViewById(C5619R.C5622id.trbCity)).addView(textRadioButton);
                String str = this.savedCityId;
                if (str != null && Intrinsics.areEqual((Object) city2.getId(), (Object) str)) {
                    i = i2;
                }
            }
            if (arrayList.size() > 0) {
                ((TextRadioButtonGroup) _$_findCachedViewById(C5619R.C5622id.trbCity)).check(i);
                View childAt = ((TextRadioButtonGroup) _$_findCachedViewById(C5619R.C5622id.trbCity)).getChildAt(i);
                Intrinsics.checkNotNullExpressionValue(childAt, "trbCity.getChildAt(defaultCityId)");
                childAt.setSelected(true);
                citySelected(i);
            }
            this.isValuesChangingManually = true;
        }
    }

    private final void initComplexRadioGroup() {
        ((TextRadioButtonGroup) _$_findCachedViewById(C5619R.C5622id.trbComplex)).setOnCheckedChangeListener(new SearchFilterFragment$initComplexRadioGroup$1(this));
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        Intrinsics.checkNotNullExpressionValue(context, "context!!");
        TextRadioButton textRadioButton = new TextRadioButton(context, (AttributeSet) null);
        textRadioButton.setText(" ");
        Unit unit = Unit.INSTANCE;
        ((TextRadioButtonGroup) _$_findCachedViewById(C5619R.C5622id.trbComplex)).addView(textRadioButton);
        initComplexRadioGroupAdapter();
    }

    private final void initComplexRadioGroupAdapter() {
        ((TextRadioButtonGroup) _$_findCachedViewById(C5619R.C5622id.trbComplex)).removeAllViews();
        ArrayList<Complex> arrayList = this.complexList;
        if (arrayList != null) {
            this.isValuesChangingManually = false;
            int size = arrayList.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Complex complex = arrayList.get(i2);
                Intrinsics.checkNotNullExpressionValue(complex, "it[i]");
                Complex complex2 = complex;
                Context context = getContext();
                Intrinsics.checkNotNull(context);
                Intrinsics.checkNotNullExpressionValue(context, "context!!");
                TextRadioButton textRadioButton = new TextRadioButton(context, (AttributeSet) null);
                textRadioButton.setText(complex2.getTitle());
                textRadioButton.setId(i2);
                Unit unit = Unit.INSTANCE;
                ((TextRadioButtonGroup) _$_findCachedViewById(C5619R.C5622id.trbComplex)).addView(textRadioButton);
                String str = this.defaultComplexId;
                if (str != null && Intrinsics.areEqual((Object) str, (Object) complex2.getId())) {
                    i = i2;
                }
                String str2 = this.savedComplexId;
                if (str2 != null && Intrinsics.areEqual((Object) str2, (Object) complex2.getId())) {
                    i = i2;
                }
            }
            if (arrayList.size() > 0) {
                complexSelected(i);
                View childAt = ((TextRadioButtonGroup) _$_findCachedViewById(C5619R.C5622id.trbComplex)).getChildAt(i);
                Intrinsics.checkNotNullExpressionValue(childAt, "trbComplex.getChildAt(defaultComplexPos)");
                childAt.setSelected(true);
            }
            this.isValuesChangingManually = true;
        }
    }

    private final void initBuildingRadioGroup() {
        ((TextRadioButtonGroup) _$_findCachedViewById(C5619R.C5622id.trbBuilding)).setOnCheckedChangeListener(new SearchFilterFragment$initBuildingRadioGroup$1(this));
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        Intrinsics.checkNotNullExpressionValue(context, "context!!");
        TextRadioButton textRadioButton = new TextRadioButton(context, (AttributeSet) null);
        textRadioButton.setText(" ");
        Unit unit = Unit.INSTANCE;
        ((TextRadioButtonGroup) _$_findCachedViewById(C5619R.C5622id.trbBuilding)).addView(textRadioButton);
        initBuildingRadioGroupAdapter();
    }

    private final void initBuildingRadioGroupAdapter() {
        ((TextRadioButtonGroup) _$_findCachedViewById(C5619R.C5622id.trbBuilding)).removeAllViews();
        ArrayList<Building> arrayList = this.buildingList;
        if (arrayList != null) {
            this.isValuesChangingManually = false;
            int size = arrayList.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Building building = arrayList.get(i2);
                Intrinsics.checkNotNullExpressionValue(building, "it[i]");
                Building building2 = building;
                Context context = getContext();
                Intrinsics.checkNotNull(context);
                Intrinsics.checkNotNullExpressionValue(context, "context!!");
                TextRadioButton textRadioButton = new TextRadioButton(context, (AttributeSet) null);
                textRadioButton.setText(building2.getTitle());
                textRadioButton.setId(i2);
                Unit unit = Unit.INSTANCE;
                ((TextRadioButtonGroup) _$_findCachedViewById(C5619R.C5622id.trbBuilding)).addView(textRadioButton);
                String str = this.savedBuildingId;
                if (str != null && Intrinsics.areEqual((Object) building2.getId(), (Object) str)) {
                    i = i2;
                }
            }
            if (arrayList.size() > 0) {
                buildingSelected(i);
                View childAt = ((TextRadioButtonGroup) _$_findCachedViewById(C5619R.C5622id.trbBuilding)).getChildAt(i);
                Intrinsics.checkNotNullExpressionValue(childAt, "trbBuilding.getChildAt(defaultBuildingId)");
                childAt.setSelected(true);
            }
            this.isValuesChangingManually = true;
        }
    }

    private final void initSectionRadioGroup() {
        ((TextRadioButtonGroup) _$_findCachedViewById(C5619R.C5622id.trbSection)).setOnCheckedChangeListener(new SearchFilterFragment$initSectionRadioGroup$1(this));
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        Intrinsics.checkNotNullExpressionValue(context, "context!!");
        TextRadioButton textRadioButton = new TextRadioButton(context, (AttributeSet) null);
        textRadioButton.setText(" ");
        Unit unit = Unit.INSTANCE;
        ((TextRadioButtonGroup) _$_findCachedViewById(C5619R.C5622id.trbSection)).addView(textRadioButton);
        initSectionRadioGroupAdapter();
    }

    private final void initSectionRadioGroupAdapter() {
        ((TextRadioButtonGroup) _$_findCachedViewById(C5619R.C5622id.trbSection)).removeAllViews();
        ArrayList<Section> arrayList = this.sectionList;
        if (arrayList != null) {
            this.isValuesChangingManually = false;
            int size = arrayList.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Section section = arrayList.get(i2);
                Intrinsics.checkNotNullExpressionValue(section, "it[i]");
                Section section2 = section;
                Context context = getContext();
                Intrinsics.checkNotNull(context);
                Intrinsics.checkNotNullExpressionValue(context, "context!!");
                TextRadioButton textRadioButton = new TextRadioButton(context, (AttributeSet) null);
                textRadioButton.setText(section2.getTitle());
                textRadioButton.setId(i2);
                Unit unit = Unit.INSTANCE;
                ((TextRadioButtonGroup) _$_findCachedViewById(C5619R.C5622id.trbSection)).addView(textRadioButton);
                String str = this.savedSectionId;
                if (str != null && Intrinsics.areEqual((Object) str, (Object) section2.getId())) {
                    i = i2;
                }
            }
            if (arrayList.size() > 0) {
                sectionSelected(i);
                View childAt = ((TextRadioButtonGroup) _$_findCachedViewById(C5619R.C5622id.trbSection)).getChildAt(i);
                Intrinsics.checkNotNullExpressionValue(childAt, "trbSection.getChildAt(defaultSectionId)");
                childAt.setSelected(true);
            }
            this.isValuesChangingManually = true;
        }
    }

    /* access modifiers changed from: private */
    public final void citySelected(int i) {
        if (this.isValuesChangingManually) {
            clearSavedValues();
        }
        this.cityPos = i;
        this.refreshNumbers = true;
        ArrayList<City> arrayList = this.cityList;
        if (arrayList != null) {
            Intrinsics.checkNotNull(arrayList);
            if (arrayList.size() > this.cityPos) {
                SearchFilterViewModel searchFilterViewModel = getSearchFilterViewModel();
                ArrayList<City> arrayList2 = this.cityList;
                City city = arrayList2 != null ? arrayList2.get(this.cityPos) : null;
                Intrinsics.checkNotNull(city);
                Intrinsics.checkNotNullExpressionValue(city, "cityList?.get(cityPos)!!");
                String id = city.getId();
                Intrinsics.checkNotNullExpressionValue(id, "cityList?.get(cityPos)!!.id");
                searchFilterViewModel.requestComplexList(id);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void complexSelected(int i) {
        if (this.isValuesChangingManually) {
            clearSavedValues();
        }
        this.complexPos = i;
        this.refreshNumbers = true;
        ArrayList<Complex> arrayList = this.complexList;
        if (arrayList != null) {
            Intrinsics.checkNotNull(arrayList);
            if (arrayList.size() > this.complexPos) {
                SearchFilterViewModel searchFilterViewModel = getSearchFilterViewModel();
                ArrayList<Complex> arrayList2 = this.complexList;
                Intrinsics.checkNotNull(arrayList2);
                Complex complex = arrayList2.get(this.complexPos);
                Intrinsics.checkNotNullExpressionValue(complex, "complexList!![complexPos]");
                String id = complex.getId();
                Intrinsics.checkNotNullExpressionValue(id, "complexList!![complexPos].id");
                searchFilterViewModel.requestBuildingList(id);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void buildingSelected(int i) {
        if (this.isValuesChangingManually) {
            clearSavedValues();
        }
        this.buildingPos = i;
        this.refreshNumbers = true;
        ArrayList<Building> arrayList = this.buildingList;
        if (arrayList != null) {
            Intrinsics.checkNotNull(arrayList);
            if (arrayList.size() > this.buildingPos) {
                SearchFilterViewModel searchFilterViewModel = getSearchFilterViewModel();
                ArrayList<Building> arrayList2 = this.buildingList;
                Intrinsics.checkNotNull(arrayList2);
                searchFilterViewModel.requestSectionList(arrayList2.get(this.buildingPos).getId());
            }
        }
    }

    /* access modifiers changed from: private */
    public final void sectionSelected(int i) {
        if (this.isValuesChangingManually) {
            clearSavedValues();
        }
        this.sectionPos = i;
        this.refreshNumbers = true;
        requestFlatFilter();
    }

    /* access modifiers changed from: private */
    public final void showFlatList() {
        int i;
        ArrayList<Complex> arrayList = this.complexList;
        if (arrayList != null && arrayList.size() > (i = this.complexPos)) {
            Complex complex = arrayList.get(i);
            Intrinsics.checkNotNullExpressionValue(complex, "it[complexPos]");
            this.savedComplexId = complex.getId();
        }
        nextFragment(FlatListFragment.newInstance(this.apartmentListEvent, this.savedComplexId), false, BaseActivity.FRAGMENT_FLAT_LIST);
    }

    public final ActionMode.Callback getNoCopyPasteCallback() {
        return this.noCopyPasteCallback;
    }

    public final void toast(String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        Toast.makeText(getContext(), str, 1).show();
    }

    /* access modifiers changed from: private */
    public final void toggleLoading(boolean z) {
        if (z) {
            DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonShowApartments);
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "buttonShowApartments");
            dynamicBackgroundButton.setEnabled(false);
            DynamicBackgroundButton dynamicBackgroundButton2 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonShowApartments);
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton2, "buttonShowApartments");
            dynamicBackgroundButton2.setText(getString(R.string.searchingForApartments));
            return;
        }
        DynamicBackgroundButton dynamicBackgroundButton3 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonShowApartments);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton3, "buttonShowApartments");
        dynamicBackgroundButton3.setEnabled(true);
    }

    private final void initRoomButtonsOther() {
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonStudia2)).setOnClickListener(new SearchFilterFragment$initRoomButtonsOther$1(this));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.button1room2)).setOnClickListener(new SearchFilterFragment$initRoomButtonsOther$2(this));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.button2rooms2)).setOnClickListener(new SearchFilterFragment$initRoomButtonsOther$3(this));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.button3rooms2)).setOnClickListener(new SearchFilterFragment$initRoomButtonsOther$4(this));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.button4orMore2)).setOnClickListener(new SearchFilterFragment$initRoomButtonsOther$5(this));
    }

    /* access modifiers changed from: private */
    public final void toggleButton(View view) {
        Object tag = view.getTag();
        if (Intrinsics.areEqual(tag, (Object) "0")) {
            if (view != null) {
                checkButton((Button) view);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
            }
        } else if (Intrinsics.areEqual(tag, (Object) "1")) {
            if (view != null) {
                uncheckButton((Button) view);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
            }
        }
        requestFlatFilter();
        clearSavedValues();
    }

    private final void checkButton(Button button) {
        button.setBackgroundResource(R.drawable.button_filter_chosen_background_selector);
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        Intrinsics.checkNotNullExpressionValue(context, "context!!");
        button.setTextColor(context.getResources().getColor(R.color.buttonPrimaryText));
        button.setTag("1");
    }

    private final void uncheckButton(Button button) {
        button.setBackgroundResource(R.drawable.button_filter_unchosen_background_selector);
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        Intrinsics.checkNotNullExpressionValue(context, "context!!");
        button.setTextColor(context.getResources().getColor(R.color.textPrimary));
        button.setTag("0");
    }

    /* access modifiers changed from: private */
    public final void uncheckEnabledButton(Button button) {
        if (button.isEnabled()) {
            uncheckButton(button);
        }
    }

    /* access modifiers changed from: private */
    public final void handleCityListEvent(CityListEvent cityListEvent) {
        if (!cityListEvent.getSuccess() || cityListEvent.getCityList() == null || cityListEvent.getCityList().size() <= 0) {
            toast(cityListEvent.getMessage());
            return;
        }
        RealmList<City> cityList2 = cityListEvent.getCityList();
        ArrayList<City> arrayList = new ArrayList<>();
        Iterable<City> iterable = cityList2;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (City add : iterable) {
            arrayList2.add(Boolean.valueOf(arrayList.add(add)));
        }
        List list = (List) arrayList2;
        Unit unit = Unit.INSTANCE;
        this.cityList = arrayList;
        initCityRadioGroupAdapter();
    }

    /* access modifiers changed from: private */
    public final void handleComplexListEvent(ComplexListEvent complexListEvent) {
        if (!complexListEvent.getSuccess() || complexListEvent.getComplexList() == null || complexListEvent.getComplexList().size() <= 0) {
            toast(complexListEvent.getMessage());
            return;
        }
        Iterable<Complex> complexList2 = complexListEvent.getComplexList();
        Collection arrayList = new ArrayList();
        for (Object next : complexList2) {
            Complex complex = (Complex) next;
            Intrinsics.checkNotNullExpressionValue(complex, "complex");
            if (Intrinsics.areEqual((Object) complex.getFinished(), (Object) false)) {
                arrayList.add(next);
            }
        }
        this.complexList = (ArrayList) ((List) arrayList);
        ArrayList<String> arrayList2 = new ArrayList<>();
        Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(complexList2, 10));
        for (Complex complex2 : complexList2) {
            Intrinsics.checkNotNullExpressionValue(complex2, "it");
            arrayList3.add(Boolean.valueOf(arrayList2.add(complex2.getTitle())));
        }
        List list = (List) arrayList3;
        Unit unit = Unit.INSTANCE;
        this.complexStringList = arrayList2;
        initComplexRadioGroupAdapter();
    }

    /* access modifiers changed from: private */
    public final void handleBuildingListEvent(BuildingListEvent buildingListEvent) {
        if (!buildingListEvent.getSuccess() || buildingListEvent.getBuildingList() == null || buildingListEvent.getBuildingList().size() <= 0) {
            toast(buildingListEvent.getMessage());
            return;
        }
        ArrayList<Building> buildingList2 = buildingListEvent.getBuildingList();
        this.buildingList = buildingList2;
        ArrayList<String> arrayList = new ArrayList<>();
        Iterable<Building> iterable = buildingList2;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Building title : iterable) {
            arrayList2.add(Boolean.valueOf(arrayList.add(title.getTitle())));
        }
        List list = (List) arrayList2;
        Unit unit = Unit.INSTANCE;
        this.buildingStringList = arrayList;
        initBuildingRadioGroupAdapter();
    }

    /* access modifiers changed from: private */
    public final void handleSectionListEvent(SectionListEvent sectionListEvent) {
        if (!sectionListEvent.getSuccess() || sectionListEvent.getSectionList() == null || sectionListEvent.getSectionList().size() <= 0) {
            ArrayList<Section> arrayList = new ArrayList<>();
            arrayList.add(new Section("0", Hardware.LABEL_FILTER_ALL));
            Unit unit = Unit.INSTANCE;
            this.sectionList = arrayList;
        } else {
            this.sectionList = sectionListEvent.getSectionList();
        }
        ArrayList<Section> arrayList2 = this.sectionList;
        ArrayList<String> arrayList3 = new ArrayList<>();
        Intrinsics.checkNotNull(arrayList2);
        Iterable<Section> iterable = arrayList2;
        Collection arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Section title : iterable) {
            arrayList4.add(Boolean.valueOf(arrayList3.add(title.getTitle())));
        }
        List list = (List) arrayList4;
        Unit unit2 = Unit.INSTANCE;
        this.sectionStringList = arrayList3;
        initSectionRadioGroupAdapter();
    }

    /* access modifiers changed from: private */
    public final void handleApartmentListEvent(ApartmentListEvent apartmentListEvent2) {
        boolean z = apartmentListEvent2.getApartmentList() != null && apartmentListEvent2.getApartmentList().size() > 0;
        if ((!apartmentListEvent2.getSuccess() || !z) && !this.refreshNumbers) {
            DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonShowApartments);
            dynamicBackgroundButton.setText(dynamicBackgroundButton.getContext().getString(R.string.noFlatsFound));
            dynamicBackgroundButton.setEnabled(false);
            Unit unit = Unit.INSTANCE;
            return;
        }
        this.apartmentListEvent = apartmentListEvent2;
        if (this.isTimerFinished) {
            DynamicBackgroundButton dynamicBackgroundButton2 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonShowApartments);
            dynamicBackgroundButton2.setText(dynamicBackgroundButton2.getContext().getString(R.string.show) + ' ' + apartmentListEvent2.getEnding());
            dynamicBackgroundButton2.setEnabled(true);
            Unit unit2 = Unit.INSTANCE;
        }
        if (!(!this.refreshNumbers || apartmentListEvent2.getSquareMin() == null || apartmentListEvent2.getSquareMax() == null || apartmentListEvent2.getFloorMin() == null || apartmentListEvent2.getFloorMax() == null || apartmentListEvent2.getPriceMin() == null || apartmentListEvent2.getPriceMax() == null)) {
            String str = this.savedStartSquareMinValue;
            float f = 1.0f;
            float parseFloat = str != null ? Float.parseFloat(str) : z ? (float) apartmentListEvent2.getSquareMin().intValue() : 1.0f;
            String str2 = this.savedStartSquareMaxValue;
            float parseFloat2 = str2 != null ? Float.parseFloat(str2) : z ? (float) apartmentListEvent2.getSquareMax().intValue() : 300.0f;
            String str3 = this.savedStartFloorMinValue;
            float parseFloat3 = str3 != null ? Float.parseFloat(str3) : z ? (float) apartmentListEvent2.getFloorMin().intValue() : 1.0f;
            String str4 = this.savedStartFloorMaxValue;
            float parseFloat4 = str4 != null ? Float.parseFloat(str4) : z ? (float) apartmentListEvent2.getFloorMax().intValue() : 100.0f;
            String str5 = this.savedStartPriceMinValue;
            float parseFloat5 = str5 != null ? Float.parseFloat(str5) : z ? (float) apartmentListEvent2.getPriceMin().intValue() : 0.0f;
            String str6 = this.savedStartPriceMaxValue;
            float parseFloat6 = str6 != null ? Float.parseFloat(str6) : z ? (float) apartmentListEvent2.getPriceMax().intValue() : 1.0E8f;
            String str7 = this.savedMySquareMinValue;
            float parseFloat7 = (str7 == null || Float.parseFloat(str7) < parseFloat) ? parseFloat : Float.parseFloat(str7);
            String str8 = this.savedMySquareMaxValue;
            float parseFloat8 = (str8 == null || Float.parseFloat(str8) > parseFloat2) ? parseFloat2 : Float.parseFloat(str8);
            String str9 = this.savedMyFloorMinValue;
            float parseFloat9 = (str9 == null || Float.parseFloat(str9) < parseFloat3) ? parseFloat3 : Float.parseFloat(str9);
            String str10 = this.savedMyFloorMaxValue;
            float parseFloat10 = (str10 == null || Float.parseFloat(str10) > parseFloat4) ? parseFloat4 : Float.parseFloat(str10);
            String str11 = this.savedMyPriceMinValue;
            float parseFloat11 = (str11 == null || Float.parseFloat(str11) < parseFloat5) ? parseFloat5 : Float.parseFloat(str11);
            String str12 = this.savedMyPriceMaxValue;
            float parseFloat12 = (str12 == null || Float.parseFloat(str12) > parseFloat6) ? parseFloat6 : Float.parseFloat(str12);
            this.isValuesChangingManually = false;
            ((CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsSquare)).setMinValue(parseFloat).setMaxValue(parseFloat2).setMinStartValue(parseFloat7).setMaxStartValue(parseFloat8).setGap(1.0f).setSteps(parseFloat2 - parseFloat < 1.0f ? -1.0f : 1.0f).apply();
            CrystalRangeSeekbar gap = ((CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsFloor)).setMinValue(parseFloat3).setMaxValue(parseFloat4).setMinStartValue(parseFloat9).setMaxStartValue(parseFloat10).setGap(1.0f);
            if (parseFloat4 - parseFloat3 < 1.0f) {
                f = -1.0f;
            }
            gap.setSteps(f).apply();
            float f2 = (float) 100000;
            float f3 = parseFloat5 - (parseFloat5 % f2);
            CharSequence charSequence = this.savedStartPriceMaxValue;
            float f4 = charSequence == null || StringsKt.isBlank(charSequence) ? (parseFloat6 + f2) - (parseFloat6 % f2) : parseFloat6 - (parseFloat6 % f2);
            float f5 = parseFloat11 - (parseFloat11 % f2);
            CharSequence charSequence2 = this.savedMyPriceMaxValue;
            float f6 = charSequence2 == null || StringsKt.isBlank(charSequence2) ? (parseFloat12 + f2) - (parseFloat12 % f2) : parseFloat12 - (parseFloat12 % f2);
            float f7 = 100000.0f;
            CrystalRangeSeekbar gap2 = ((CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsPrice)).setMinValue(f3).setMaxValue(f4).setMinStartValue(f5).setMaxStartValue(f6).setGap(100000.0f);
            if (parseFloat6 - parseFloat5 < 0.1f) {
                f7 = -1.0f;
            }
            gap2.setSteps(f7).apply();
            this.isValuesChangingManually = true;
        }
        ArrayList<String> roomCountArrayList = apartmentListEvent2.getRoomCountArrayList();
        if (roomCountArrayList != null) {
            DynamicBackgroundButton dynamicBackgroundButton3 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonStudia2);
            if (this.refreshNumbers) {
                Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton3, "it");
                uncheckButton(dynamicBackgroundButton3);
            }
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton3, "it");
            String str13 = roomCountArrayList.get(0);
            Intrinsics.checkNotNullExpressionValue(str13, "array[0]");
            dynamicBackgroundButton3.setEnabled(Integer.parseInt(str13) > 0);
            if (this.savedButtonStudia != null && dynamicBackgroundButton3.isEnabled()) {
                checkButton(dynamicBackgroundButton3);
            }
            Unit unit3 = Unit.INSTANCE;
            DynamicBackgroundButton dynamicBackgroundButton4 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.button1room2);
            if (this.refreshNumbers) {
                Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton4, "it");
                uncheckButton(dynamicBackgroundButton4);
            }
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton4, "it");
            boolean z2 = true;
            String str14 = roomCountArrayList.get(1);
            Intrinsics.checkNotNullExpressionValue(str14, "array[1]");
            dynamicBackgroundButton4.setEnabled(Integer.parseInt(str14) > 0);
            if (this.savedButton1room != null && dynamicBackgroundButton4.isEnabled()) {
                checkButton(dynamicBackgroundButton4);
            }
            Unit unit4 = Unit.INSTANCE;
            DynamicBackgroundButton dynamicBackgroundButton5 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.button2rooms2);
            if (this.refreshNumbers) {
                Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton5, "it");
                uncheckButton(dynamicBackgroundButton5);
            }
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton5, "it");
            String str15 = roomCountArrayList.get(2);
            Intrinsics.checkNotNullExpressionValue(str15, "array[2]");
            dynamicBackgroundButton5.setEnabled(Integer.parseInt(str15) > 0);
            if (this.savedButton2room != null && dynamicBackgroundButton5.isEnabled()) {
                checkButton(dynamicBackgroundButton5);
            }
            Unit unit5 = Unit.INSTANCE;
            DynamicBackgroundButton dynamicBackgroundButton6 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.button3rooms2);
            if (this.refreshNumbers) {
                Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton6, "it");
                uncheckButton(dynamicBackgroundButton6);
            }
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton6, "it");
            String str16 = roomCountArrayList.get(3);
            Intrinsics.checkNotNullExpressionValue(str16, "array[3]");
            dynamicBackgroundButton6.setEnabled(Integer.parseInt(str16) > 0);
            if (this.savedButton3room != null && dynamicBackgroundButton6.isEnabled()) {
                checkButton(dynamicBackgroundButton6);
            }
            Unit unit6 = Unit.INSTANCE;
            DynamicBackgroundButton dynamicBackgroundButton7 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.button4orMore2);
            if (this.refreshNumbers) {
                Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton7, "it");
                uncheckButton(dynamicBackgroundButton7);
            }
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton7, "it");
            String str17 = roomCountArrayList.get(4);
            Intrinsics.checkNotNullExpressionValue(str17, "array[4]");
            if (Integer.parseInt(str17) <= 0) {
                z2 = false;
            }
            dynamicBackgroundButton7.setEnabled(z2);
            if (this.savedButton4orMore != null && dynamicBackgroundButton7.isEnabled()) {
                checkButton(dynamicBackgroundButton7);
            }
            Unit unit7 = Unit.INSTANCE;
        }
        this.refreshNumbers = false;
    }

    /* access modifiers changed from: private */
    public final void requestFlatFilter() {
        String str;
        String str2;
        String str3;
        String str4;
        Section section;
        Building building;
        Complex complex;
        if (isVisible()) {
            SearchFilterViewModel searchFilterViewModel = getSearchFilterViewModel();
            ArrayList<Complex> arrayList = this.complexList;
            if (arrayList == null || (complex = arrayList.get(this.complexPos)) == null || (str = complex.getId()) == null) {
                str = "0";
            }
            DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonStudia2);
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "buttonStudia2");
            String obj = dynamicBackgroundButton.getTag().toString();
            DynamicBackgroundButton dynamicBackgroundButton2 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.button1room2);
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton2, "button1room2");
            String obj2 = dynamicBackgroundButton2.getTag().toString();
            DynamicBackgroundButton dynamicBackgroundButton3 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.button2rooms2);
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton3, "button2rooms2");
            String obj3 = dynamicBackgroundButton3.getTag().toString();
            DynamicBackgroundButton dynamicBackgroundButton4 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.button3rooms2);
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton4, "button3rooms2");
            String obj4 = dynamicBackgroundButton4.getTag().toString();
            DynamicBackgroundButton dynamicBackgroundButton5 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.button4orMore2);
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton5, "button4orMore2");
            String obj5 = dynamicBackgroundButton5.getTag().toString();
            ArrayList<Building> arrayList2 = this.buildingList;
            if (arrayList2 == null || (building = arrayList2.get(this.buildingPos)) == null || (str2 = building.getId()) == null) {
                str2 = "0";
            }
            ArrayList<Section> arrayList3 = this.sectionList;
            if (arrayList3 == null || (section = arrayList3.get(this.sectionPos)) == null || (str3 = section.getId()) == null) {
                str3 = "0";
            }
            CrystalRangeSeekbar crystalRangeSeekbar = (CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsSquare);
            Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar, "crsSquare");
            String number = crystalRangeSeekbar.getMinValueMy().toString();
            CrystalRangeSeekbar crystalRangeSeekbar2 = (CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsSquare);
            Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar2, "crsSquare");
            String number2 = crystalRangeSeekbar2.getMaxValueMy().toString();
            CrystalRangeSeekbar crystalRangeSeekbar3 = (CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsFloor);
            Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar3, "crsFloor");
            String number3 = crystalRangeSeekbar3.getMinValueMy().toString();
            CrystalRangeSeekbar crystalRangeSeekbar4 = (CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsFloor);
            Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar4, "crsFloor");
            String number4 = crystalRangeSeekbar4.getMaxValueMy().toString();
            CrystalRangeSeekbar crystalRangeSeekbar5 = (CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsPrice);
            String str5 = "0";
            Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar5, "crsPrice");
            String number5 = crystalRangeSeekbar5.getMinValueMy().toString();
            CrystalRangeSeekbar crystalRangeSeekbar6 = (CrystalRangeSeekbar) _$_findCachedViewById(C5619R.C5622id.crsPrice);
            Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar6, "crsPrice");
            String number6 = crystalRangeSeekbar6.getMaxValueMy().toString();
            Switch switchR = (Switch) _$_findCachedViewById(C5619R.C5622id.switchSale);
            Intrinsics.checkNotNullExpressionValue(switchR, "switchSale");
            String str6 = switchR.isChecked() ? "1" : str5;
            Switch switchR2 = (Switch) _$_findCachedViewById(C5619R.C5622id.switchFinished);
            Intrinsics.checkNotNullExpressionValue(switchR2, "switchFinished");
            if (switchR2.isChecked()) {
                str4 = "1";
            } else {
                str4 = str5;
            }
            searchFilterViewModel.requestApartmentList(str, obj, obj2, obj3, obj4, obj5, str2, str3, number, number2, number3, number4, number5, number6, str6, str4);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/searchFilter/SearchFilterFragment$Companion;", "", "()V", "SEARCH_COMPLEX_ID", "", "newInstance", "Lru/unicorn/ujin/view/fragments/searchFilter/SearchFilterFragment;", "complex", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.searchFilter.SearchFilterFragment$Companion */
    /* compiled from: SearchFilterFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SearchFilterFragment newInstance(String str) {
            Intrinsics.checkNotNullParameter(str, "complex");
            SearchFilterFragment searchFilterFragment = new SearchFilterFragment();
            Bundle bundle = new Bundle();
            bundle.putString("complexId", str);
            Unit unit = Unit.INSTANCE;
            searchFilterFragment.setArguments(bundle);
            return searchFilterFragment;
        }
    }
}
