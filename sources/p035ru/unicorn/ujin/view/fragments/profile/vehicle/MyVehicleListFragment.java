package p035ru.unicorn.ujin.view.fragments.profile.vehicle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.BaseTitleFragment;
import p035ru.unicorn.ujin.view.fragments.parking.ParkingViewModel;
import p035ru.unicorn.ujin.view.fragments.parking.events.MyVehiclesEvent;
import p035ru.unicorn.ujin.view.fragments.parking.response.MyVehicle;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0017\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\fH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0014J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006!"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/vehicle/MyVehicleListFragment;", "Lru/unicorn/ujin/view/fragments/BaseTitleFragment;", "()V", "parkingViewModel", "Lru/unicorn/ujin/view/fragments/parking/ParkingViewModel;", "getParkingViewModel", "()Lru/unicorn/ujin/view/fragments/parking/ParkingViewModel;", "parkingViewModel$delegate", "Lkotlin/Lazy;", "getLayoutRes", "", "handleLoading", "", "loading", "", "(Ljava/lang/Boolean;)V", "handleVehicleList", "event", "Lru/unicorn/ujin/view/fragments/parking/events/MyVehiclesEvent;", "initData", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.vehicle.MyVehicleListFragment */
/* compiled from: MyVehicleListFragment.kt */
public final class MyVehicleListFragment extends BaseTitleFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private final Lazy parkingViewModel$delegate = LazyKt.lazy(new MyVehicleListFragment$parkingViewModel$2(this));

    private final ParkingViewModel getParkingViewModel() {
        return (ParkingViewModel) this.parkingViewModel$delegate.getValue();
    }

    @JvmStatic
    public static final MyVehicleListFragment newInstance() {
        return Companion.newInstance();
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
        return R.layout.fragment_my_vehicle_list;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "Мои автомобили";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/vehicle/MyVehicleListFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/profile/vehicle/MyVehicleListFragment;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profile.vehicle.MyVehicleListFragment$Companion */
    /* compiled from: MyVehicleListFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final MyVehicleListFragment newInstance() {
            MyVehicleListFragment myVehicleListFragment = new MyVehicleListFragment();
            myVehicleListFragment.setTitle("Мои автомобили");
            return myVehicleListFragment;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        getProfileViewModel().getShowProgressLiveData().observe(getViewLifecycleOwner(), new MyVehicleListFragment$onCreateView$1(this));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* access modifiers changed from: private */
    public final void handleLoading(Boolean bool) {
        if (bool != null) {
            showLoader(bool, (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading));
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        initData();
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
        progressBar.setVisibility(0);
        getParkingViewModel().getMyVehicles();
        getParkingViewModel().getMyVehiclesMutableLiveData().observe(getViewLifecycleOwner(), new MyVehicleListFragment$onViewCreated$1(this));
    }

    private final void initData() {
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnAddAuto)).setOnClickListener(new MyVehicleListFragment$initData$1(this));
    }

    /* access modifiers changed from: private */
    public final void handleVehicleList(MyVehiclesEvent myVehiclesEvent) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
        progressBar.setVisibility(8);
        if (myVehiclesEvent.getSuccess()) {
            Collection vehicleList = myVehiclesEvent.getVehicleList();
            if (!(vehicleList == null || vehicleList.isEmpty())) {
                Iterable<MyVehicle> vehicleList2 = myVehiclesEvent.getVehicleList();
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(vehicleList2, 10));
                for (MyVehicle myVehicle : vehicleList2) {
                    LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llVehicles);
                    LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llVehicles);
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "llVehicles");
                    View inflate = LayoutInflater.from(linearLayout2.getContext()).inflate(R.layout.item_my_vehicle, (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llVehicles), false);
                    Intrinsics.checkNotNullExpressionValue(inflate, "this");
                    inflate.setTag(myVehicle.getId());
                    CharSequence brand = myVehicle.getBrand();
                    if (brand == null || StringsKt.isBlank(brand)) {
                        TextView textView = (TextView) inflate.findViewById(C5619R.C5622id.tvCarName);
                        Intrinsics.checkNotNullExpressionValue(textView, "this.tvCarName");
                        textView.setVisibility(8);
                    } else {
                        TextView textView2 = (TextView) inflate.findViewById(C5619R.C5622id.tvCarName);
                        textView2.setVisibility(0);
                        textView2.setText(myVehicle.getBrand());
                    }
                    TextView textView3 = (TextView) inflate.findViewById(C5619R.C5622id.tvCarLicencePlate);
                    Intrinsics.checkNotNullExpressionValue(textView3, "this.tvCarLicencePlate");
                    textView3.setText(myVehicle.getLicencePlate());
                    inflate.setOnClickListener(new MyVehicleListFragment$handleVehicleList$$inlined$map$lambda$1(myVehicle, this));
                    Unit unit = Unit.INSTANCE;
                    linearLayout.addView(inflate);
                    arrayList.add(Unit.INSTANCE);
                }
                List list = (List) arrayList;
                return;
            }
            return;
        }
        showMessage(myVehiclesEvent.getMessage());
    }
}
