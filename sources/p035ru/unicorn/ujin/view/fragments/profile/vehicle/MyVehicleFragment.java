package p035ru.unicorn.ujin.view.fragments.profile.vehicle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.material.textfield.TextInputEditText;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.BaseTitleFragment;
import p035ru.unicorn.ujin.view.fragments.parking.ParkingViewModel;
import p035ru.unicorn.ujin.view.fragments.parking.response.MyVehicle;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0017\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0014J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/vehicle/MyVehicleFragment;", "Lru/unicorn/ujin/view/fragments/BaseTitleFragment;", "()V", "parkingViewModel", "Lru/unicorn/ujin/view/fragments/parking/ParkingViewModel;", "getParkingViewModel", "()Lru/unicorn/ujin/view/fragments/parking/ParkingViewModel;", "parkingViewModel$delegate", "Lkotlin/Lazy;", "vehicle", "Lru/unicorn/ujin/view/fragments/parking/response/MyVehicle;", "getLayoutRes", "", "handleLoading", "", "loading", "", "(Ljava/lang/Boolean;)V", "handleRemoveVehicle", "event", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "initData", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.vehicle.MyVehicleFragment */
/* compiled from: MyVehicleFragment.kt */
public final class MyVehicleFragment extends BaseTitleFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private final Lazy parkingViewModel$delegate = LazyKt.lazy(new MyVehicleFragment$parkingViewModel$2(this));
    /* access modifiers changed from: private */
    public MyVehicle vehicle;

    /* access modifiers changed from: private */
    public final ParkingViewModel getParkingViewModel() {
        return (ParkingViewModel) this.parkingViewModel$delegate.getValue();
    }

    @JvmStatic
    public static final MyVehicleFragment newInstance(MyVehicle myVehicle) {
        return Companion.newInstance(myVehicle);
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
        return R.layout.fragment_my_vehicle;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "Мой автомобиль";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/vehicle/MyVehicleFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/profile/vehicle/MyVehicleFragment;", "vehicle", "Lru/unicorn/ujin/view/fragments/parking/response/MyVehicle;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profile.vehicle.MyVehicleFragment$Companion */
    /* compiled from: MyVehicleFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final MyVehicleFragment newInstance(MyVehicle myVehicle) {
            Intrinsics.checkNotNullParameter(myVehicle, RemoteRepository.CAR);
            MyVehicleFragment myVehicleFragment = new MyVehicleFragment();
            myVehicleFragment.vehicle = myVehicle;
            myVehicleFragment.setTitle("Мой автомобиль");
            return myVehicleFragment;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        getProfileViewModel().getShowProgressLiveData().observe(getViewLifecycleOwner(), new MyVehicleFragment$onCreateView$1(this));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* access modifiers changed from: private */
    public final void handleLoading(Boolean bool) {
        showLoader(bool, (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading));
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        initData();
    }

    private final void initData() {
        String str;
        String str2;
        TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etBrand);
        MyVehicle myVehicle = this.vehicle;
        if (myVehicle == null || (str = myVehicle.getBrand()) == null) {
            str = "";
        }
        textInputEditText.setText(str);
        TextInputEditText textInputEditText2 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etNumber);
        MyVehicle myVehicle2 = this.vehicle;
        if (myVehicle2 == null || (str2 = myVehicle2.getLicencePlate()) == null) {
            str2 = "";
        }
        textInputEditText2.setText(str2);
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnParkingPlace)).setOnClickListener(new MyVehicleFragment$initData$1(this));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnRemoveAuto)).setOnClickListener(new MyVehicleFragment$initData$2(this));
    }

    /* access modifiers changed from: private */
    public final void handleRemoveVehicle(UpdateEvent updateEvent) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
        progressBar.setVisibility(8);
        if (updateEvent.getSuccess()) {
            showMessage("Автомобиль успешно удален");
            getBaseActivity().onBackPressed();
            return;
        }
        showMessage(updateEvent.getMessage());
    }
}
