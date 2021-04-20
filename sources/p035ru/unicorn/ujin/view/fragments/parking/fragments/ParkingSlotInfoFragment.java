package p035ru.unicorn.ujin.view.fragments.parking.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.parking.events.MyParkingSlotsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.response.ParkingSlot;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u000bH\u0014J&\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u001a\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingSlotInfoFragment;", "Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingBaseFragment;", "()V", "parkingSlot", "Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlot;", "handleParkingSlots", "", "event", "Lru/unicorn/ujin/view/fragments/parking/events/MyParkingSlotsEvent;", "initSlotInfo", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingSlotInfoFragment */
/* compiled from: ParkingSlotInfoFragment.kt */
public final class ParkingSlotInfoFragment extends ParkingBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public ParkingSlot parkingSlot;

    @JvmStatic
    public static final ParkingSlotInfoFragment newInstance(ParkingSlot parkingSlot2) {
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

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "Экран информации о парковочном месте";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ ParkingSlot access$getParkingSlot$p(ParkingSlotInfoFragment parkingSlotInfoFragment) {
        ParkingSlot parkingSlot2 = parkingSlotInfoFragment.parkingSlot;
        if (parkingSlot2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parkingSlot");
        }
        return parkingSlot2;
    }

    public void showToolbar() {
        getBaseActivity().setTextTitle(getString(R.string.parkingSlotInfoTitle));
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_parking_slot_info, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getParkingViewModel().getMySlotsMutableLiveData().observe(getViewLifecycleOwner(), new ParkingSlotInfoFragment$onViewCreated$1(this));
        initSlotInfo();
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnAddVehicle)).setOnClickListener(new ParkingSlotInfoFragment$onViewCreated$2(this));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnShowOnMap)).setOnClickListener(new ParkingSlotInfoFragment$onViewCreated$3(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void initSlotInfo() {
        /*
            r10 = this;
            int r0 = p035ru.unicorn.C5619R.C5622id.tvPlaceName
            android.view.View r0 = r10._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "tvPlaceName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            ru.unicorn.ujin.view.fragments.parking.response.ParkingSlot r1 = r10.parkingSlot
            java.lang.String r2 = "parkingSlot"
            if (r1 != 0) goto L_0x0016
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0016:
            java.lang.String r1 = r1.getNumber()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            ru.unicorn.ujin.view.fragments.parking.response.ParkingSlot r0 = r10.parkingSlot
            if (r0 != 0) goto L_0x0026
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0026:
            ru.unicorn.ujin.view.fragments.parking.response.Zone r0 = r0.getZone()
            java.lang.String r1 = "tvZoneName"
            r3 = 0
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = r0.getTitle()
            if (r0 == 0) goto L_0x0054
            int r4 = p035ru.unicorn.C5619R.C5622id.tvZoneName
            android.view.View r4 = r10._$_findCachedViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            r4.setVisibility(r3)
            int r4 = p035ru.unicorn.C5619R.C5622id.tvZoneName
            android.view.View r4 = r10._$_findCachedViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.setText(r0)
            goto L_0x0066
        L_0x0054:
            r0 = r10
            ru.unicorn.ujin.view.fragments.parking.fragments.ParkingSlotInfoFragment r0 = (p035ru.unicorn.ujin.view.fragments.parking.fragments.ParkingSlotInfoFragment) r0
            int r4 = p035ru.unicorn.C5619R.C5622id.tvZoneName
            android.view.View r0 = r0._$_findCachedViewById(r4)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 4
            r0.setVisibility(r1)
        L_0x0066:
            ru.unicorn.ujin.view.fragments.parking.response.ParkingSlot r0 = r10.parkingSlot
            if (r0 != 0) goto L_0x006d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x006d:
            java.util.ArrayList r0 = r0.getVehicleList()
            if (r0 == 0) goto L_0x0078
            int r0 = r0.size()
            goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            java.lang.String r1 = "divider2"
            java.lang.String r4 = "tvVehiclesInfo"
            r5 = 8
            if (r0 != 0) goto L_0x00b1
            ru.unicorn.ujin.view.fragments.parking.response.ParkingSlot r0 = r10.parkingSlot
            if (r0 != 0) goto L_0x0088
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0088:
            ru.unicorn.ujin.view.fragments.parking.response.ParkingSlotState r0 = r0.getState()
            if (r0 == 0) goto L_0x0093
            ru.unicorn.ujin.view.fragments.parking.response.ParkingVehicle r0 = r0.getVehicle()
            goto L_0x0094
        L_0x0093:
            r0 = 0
        L_0x0094:
            if (r0 != 0) goto L_0x00b1
            int r0 = p035ru.unicorn.C5619R.C5622id.tvVehiclesInfo
            android.view.View r0 = r10._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r0.setVisibility(r5)
            int r0 = p035ru.unicorn.C5619R.C5622id.divider2
            android.view.View r0 = r10._$_findCachedViewById(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0.setVisibility(r5)
            goto L_0x00cb
        L_0x00b1:
            int r0 = p035ru.unicorn.C5619R.C5622id.tvVehiclesInfo
            android.view.View r0 = r10._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r0.setVisibility(r3)
            int r0 = p035ru.unicorn.C5619R.C5622id.divider2
            android.view.View r0 = r10._$_findCachedViewById(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0.setVisibility(r3)
        L_0x00cb:
            int r0 = p035ru.unicorn.C5619R.C5622id.rvVehiclesInfo
            android.view.View r0 = r10._$_findCachedViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r4 = r0.getContext()
            r6 = 1
            r1.<init>(r4, r6, r3)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = (androidx.recyclerview.widget.RecyclerView.LayoutManager) r1
            r0.setLayoutManager(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ru.unicorn.ujin.view.fragments.parking.response.ParkingSlot r4 = r10.parkingSlot
            if (r4 != 0) goto L_0x00ee
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x00ee:
            r1.add(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            ru.unicorn.ujin.view.fragments.parking.fragments.ParkingSlotInfoFragment$initSlotInfo$3$2 r4 = p035ru.unicorn.ujin.view.fragments.parking.fragments.ParkingSlotInfoFragment$initSlotInfo$3$2.INSTANCE
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            ru.unicorn.ujin.view.fragments.parking.adapters.MyParkingSlotsAdapter r7 = new ru.unicorn.ujin.view.fragments.parking.adapters.MyParkingSlotsAdapter
            r7.<init>(r1, r3, r4)
            androidx.recyclerview.widget.RecyclerView$Adapter r7 = (androidx.recyclerview.widget.RecyclerView.Adapter) r7
            r0.setAdapter(r7)
            ru.unicorn.ujin.view.fragments.parking.response.ParkingSlot r0 = r10.parkingSlot
            if (r0 != 0) goto L_0x0108
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0108:
            java.util.ArrayList r0 = r0.getDetailedInfoList()
            java.lang.String r1 = "divider1"
            java.lang.String r2 = "tvRentInfo"
            java.lang.String r4 = "rvRentInfo"
            if (r0 == 0) goto L_0x015f
            int r7 = p035ru.unicorn.C5619R.C5622id.rvRentInfo
            android.view.View r7 = r10._$_findCachedViewById(r7)
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r4)
            r7.setVisibility(r3)
            int r7 = p035ru.unicorn.C5619R.C5622id.tvRentInfo
            android.view.View r7 = r10._$_findCachedViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            r7.setVisibility(r3)
            int r7 = p035ru.unicorn.C5619R.C5622id.divider1
            android.view.View r7 = r10._$_findCachedViewById(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)
            r7.setVisibility(r3)
            int r7 = p035ru.unicorn.C5619R.C5622id.rvRentInfo
            android.view.View r7 = r10._$_findCachedViewById(r7)
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            androidx.recyclerview.widget.LinearLayoutManager r8 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r9 = r7.getContext()
            r8.<init>(r9, r6, r3)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r8 = (androidx.recyclerview.widget.RecyclerView.LayoutManager) r8
            r7.setLayoutManager(r8)
            ru.unicorn.ujin.view.fragments.parking.adapters.SlotInfoAdapter r3 = new ru.unicorn.ujin.view.fragments.parking.adapters.SlotInfoAdapter
            r3.<init>(r0)
            androidx.recyclerview.widget.RecyclerView$Adapter r3 = (androidx.recyclerview.widget.RecyclerView.Adapter) r3
            r7.setAdapter(r3)
            if (r7 == 0) goto L_0x015f
            goto L_0x018c
        L_0x015f:
            r0 = r10
            ru.unicorn.ujin.view.fragments.parking.fragments.ParkingSlotInfoFragment r0 = (p035ru.unicorn.ujin.view.fragments.parking.fragments.ParkingSlotInfoFragment) r0
            int r3 = p035ru.unicorn.C5619R.C5622id.rvRentInfo
            android.view.View r3 = r0._$_findCachedViewById(r3)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r3.setVisibility(r5)
            int r3 = p035ru.unicorn.C5619R.C5622id.tvRentInfo
            android.view.View r3 = r0._$_findCachedViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            r3.setVisibility(r5)
            int r2 = p035ru.unicorn.C5619R.C5622id.divider1
            android.view.View r0 = r0._$_findCachedViewById(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0.setVisibility(r5)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x018c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.parking.fragments.ParkingSlotInfoFragment.initSlotInfo():void");
    }

    /* access modifiers changed from: private */
    public final void handleParkingSlots(MyParkingSlotsEvent myParkingSlotsEvent) {
        if (myParkingSlotsEvent.getSuccess()) {
            Collection arrayList = new ArrayList();
            for (Object next : myParkingSlotsEvent.getSlotList()) {
                Integer id = ((ParkingSlot) next).getId();
                ParkingSlot parkingSlot2 = this.parkingSlot;
                if (parkingSlot2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("parkingSlot");
                }
                if (Intrinsics.areEqual((Object) id, (Object) parkingSlot2.getId())) {
                    arrayList.add(next);
                }
            }
            this.parkingSlot = (ParkingSlot) ((List) arrayList).get(0);
            initSlotInfo();
            return;
        }
        showMessage(myParkingSlotsEvent.getMessage());
    }

    public void onResume() {
        super.onResume();
        getParkingViewModel().getMySlots();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingSlotInfoFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingSlotInfoFragment;", "parkingSlot", "Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlot;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingSlotInfoFragment$Companion */
    /* compiled from: ParkingSlotInfoFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ParkingSlotInfoFragment newInstance(ParkingSlot parkingSlot) {
            Intrinsics.checkNotNullParameter(parkingSlot, "parkingSlot");
            ParkingSlotInfoFragment parkingSlotInfoFragment = new ParkingSlotInfoFragment();
            parkingSlotInfoFragment.parkingSlot = parkingSlot;
            return parkingSlotInfoFragment;
        }
    }
}
