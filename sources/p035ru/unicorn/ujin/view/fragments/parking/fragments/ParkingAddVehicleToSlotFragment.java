package p035ru.unicorn.ujin.view.fragments.parking.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.parking.events.AttachVehicleEvent;
import p035ru.unicorn.ujin.view.fragments.parking.events.MyVehiclesEvent;
import p035ru.unicorn.ujin.view.fragments.parking.response.MyVehicle;
import p035ru.unicorn.ujin.view.fragments.parking.response.ParkingSlot;
import p035ru.unicorn.ujin.view.fragments.parking.response.ParkingVehicle;
import p035ru.unicorn.ujin.view.fragments.parking.response.Zone;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0018H\u0002J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010#\u001a\u00020\u0010H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006%"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingAddVehicleToSlotFragment;", "Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingBaseFragment;", "()V", "checkedVehicle", "Lru/unicorn/ujin/view/fragments/parking/response/MyVehicle;", "getCheckedVehicle", "()Lru/unicorn/ujin/view/fragments/parking/response/MyVehicle;", "setCheckedVehicle", "(Lru/unicorn/ujin/view/fragments/parking/response/MyVehicle;)V", "parkingSlot", "Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlot;", "findIfVehicleIsAttached", "", "id", "", "handleSwitch", "", "vehicle", "slotId", "checked", "handleVehicleList", "event", "Lru/unicorn/ujin/view/fragments/parking/events/MyVehiclesEvent;", "handleVehicleSwitch", "Lru/unicorn/ujin/view/fragments/parking/events/AttachVehicleEvent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingAddVehicleToSlotFragment */
/* compiled from: ParkingAddVehicleToSlotFragment.kt */
public final class ParkingAddVehicleToSlotFragment extends ParkingBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    public MyVehicle checkedVehicle;
    /* access modifiers changed from: private */
    public ParkingSlot parkingSlot;

    @JvmStatic
    public static final ParkingAddVehicleToSlotFragment newInstance(ParkingSlot parkingSlot2) {
        return Companion.newInstance(parkingSlot2);
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

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ ParkingSlot access$getParkingSlot$p(ParkingAddVehicleToSlotFragment parkingAddVehicleToSlotFragment) {
        ParkingSlot parkingSlot2 = parkingAddVehicleToSlotFragment.parkingSlot;
        if (parkingSlot2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parkingSlot");
        }
        return parkingSlot2;
    }

    public final MyVehicle getCheckedVehicle() {
        MyVehicle myVehicle = this.checkedVehicle;
        if (myVehicle == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkedVehicle");
        }
        return myVehicle;
    }

    public final void setCheckedVehicle(MyVehicle myVehicle) {
        Intrinsics.checkNotNullParameter(myVehicle, "<set-?>");
        this.checkedVehicle = myVehicle;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_parking_add_vehicle_to_slot, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.parkingParking));
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingAddVehicleToSlotFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingAddVehicleToSlotFragment;", "parkingSlot", "Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlot;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingAddVehicleToSlotFragment$Companion */
    /* compiled from: ParkingAddVehicleToSlotFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ParkingAddVehicleToSlotFragment newInstance(ParkingSlot parkingSlot) {
            Intrinsics.checkNotNullParameter(parkingSlot, "parkingSlot");
            ParkingAddVehicleToSlotFragment parkingAddVehicleToSlotFragment = new ParkingAddVehicleToSlotFragment();
            parkingAddVehicleToSlotFragment.parkingSlot = parkingSlot;
            return parkingAddVehicleToSlotFragment;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        String title;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getParkingViewModel().showLoader.observe(getViewLifecycleOwner(), new ParkingAddVehicleToSlotFragment$onViewCreated$1(this));
        getParkingViewModel().getMyVehiclesMutableLiveData().observe(getViewLifecycleOwner(), new ParkingAddVehicleToSlotFragment$onViewCreated$2(this));
        getParkingViewModel().getAttachVehicleMutableLiveData().observe(getViewLifecycleOwner(), new ParkingAddVehicleToSlotFragment$onViewCreated$3(this));
        getParkingViewModel().getDetachVehicleMutableLiveData().observe(getViewLifecycleOwner(), new ParkingAddVehicleToSlotFragment$onViewCreated$4(this));
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvPlaceName);
        Intrinsics.checkNotNullExpressionValue(textView, "tvPlaceName");
        ParkingSlot parkingSlot2 = this.parkingSlot;
        if (parkingSlot2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parkingSlot");
        }
        textView.setText(parkingSlot2.getNumber());
        ParkingSlot parkingSlot3 = this.parkingSlot;
        if (parkingSlot3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parkingSlot");
        }
        Zone zone = parkingSlot3.getZone();
        if (zone == null || (title = zone.getTitle()) == null) {
            TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvZoneName);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvZoneName");
            textView2.setVisibility(4);
        } else {
            TextView textView3 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvZoneName);
            Intrinsics.checkNotNullExpressionValue(textView3, "tvZoneName");
            textView3.setText(title);
        }
        getParkingViewModel().getMyVehicles();
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnAddVehicle)).setOnClickListener(new ParkingAddVehicleToSlotFragment$onViewCreated$7(this));
    }

    /* access modifiers changed from: private */
    public final void handleVehicleSwitch(AttachVehicleEvent attachVehicleEvent) {
        if (!attachVehicleEvent.getSuccess()) {
            MyVehicle vehicle = attachVehicleEvent.getVehicle();
            if (vehicle != null) {
                LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llVehicles);
                Intrinsics.checkNotNullExpressionValue(linearLayout, "llVehicles");
                int childCount = linearLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = ((LinearLayout) _$_findCachedViewById(C5619R.C5622id.llVehicles)).getChildAt(i);
                    Intrinsics.checkNotNullExpressionValue(childAt, "llVehicles.getChildAt(i)");
                    if (Intrinsics.areEqual(childAt.getTag(), (Object) vehicle.getId())) {
                        Switch switchR = (Switch) ((LinearLayout) _$_findCachedViewById(C5619R.C5622id.llVehicles)).findViewById(R.id.switchVehicle);
                        switchR.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                        switchR.setChecked(attachVehicleEvent.getStartingFlag());
                        switchR.setOnCheckedChangeListener(new C6053xf5752a96(vehicle, this, attachVehicleEvent));
                    }
                }
            }
            showMessage(attachVehicleEvent.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public final void handleVehicleList(MyVehiclesEvent myVehiclesEvent) {
        if (myVehiclesEvent.getSuccess()) {
            Iterable<MyVehicle> vehicleList = myVehiclesEvent.getVehicleList();
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(vehicleList, 10));
            for (MyVehicle myVehicle : vehicleList) {
                LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llVehicles);
                LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llVehicles);
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "llVehicles");
                View inflate = LayoutInflater.from(linearLayout2.getContext()).inflate(R.layout.item_my_vehicle_to_add, (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llVehicles), false);
                Intrinsics.checkNotNullExpressionValue(inflate, "this");
                inflate.setTag(myVehicle.getId());
                TextView textView = (TextView) inflate.findViewById(C5619R.C5622id.tvCarName);
                Intrinsics.checkNotNullExpressionValue(textView, "this.tvCarName");
                textView.setText(myVehicle.getBrand());
                TextView textView2 = (TextView) inflate.findViewById(C5619R.C5622id.tvCarLicencePlate);
                Intrinsics.checkNotNullExpressionValue(textView2, "this.tvCarLicencePlate");
                textView2.setText(myVehicle.getLicencePlate());
                Switch switchR = (Switch) inflate.findViewById(C5619R.C5622id.switchVehicle);
                Intrinsics.checkNotNullExpressionValue(switchR, "this.switchVehicle");
                Integer id = myVehicle.getId();
                switchR.setChecked(findIfVehicleIsAttached(id != null ? id.intValue() : -1));
                ((Switch) inflate.findViewById(C5619R.C5622id.switchVehicle)).setOnCheckedChangeListener(new C6052x2778715f(myVehicle, this));
                Unit unit = Unit.INSTANCE;
                linearLayout.addView(inflate);
                arrayList.add(Unit.INSTANCE);
            }
            List list = (List) arrayList;
            return;
        }
        showMessage(myVehiclesEvent.getMessage());
    }

    private final boolean findIfVehicleIsAttached(int i) {
        ParkingSlot parkingSlot2 = this.parkingSlot;
        if (parkingSlot2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parkingSlot");
        }
        ArrayList<ParkingVehicle> vehicleList = parkingSlot2.getVehicleList();
        if (vehicleList == null) {
            vehicleList = new ArrayList<>();
        }
        Iterator<ParkingVehicle> it = vehicleList.iterator();
        while (it.hasNext()) {
            Integer id = it.next().getId();
            if (id != null && id.intValue() == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void handleSwitch(MyVehicle myVehicle, int i, boolean z) {
        if (z) {
            getParkingViewModel().attachVehicle(myVehicle, i, !z);
        } else {
            getParkingViewModel().detachVehicle(myVehicle, i, !z);
        }
    }
}
