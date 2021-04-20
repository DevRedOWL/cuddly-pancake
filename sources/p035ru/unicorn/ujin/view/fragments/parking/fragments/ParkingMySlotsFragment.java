package p035ru.unicorn.ujin.view.fragments.parking.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.parking.adapters.GuestListAdapter;
import p035ru.unicorn.ujin.view.fragments.parking.adapters.MyParkingSlotsAdapter;
import p035ru.unicorn.ujin.view.fragments.parking.events.MyParkingSlotsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.events.ParkingGuestsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.response.Guest;
import p035ru.unicorn.ujin.view.fragments.parking.response.ParkingSlot;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingMySlotsFragment;", "Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingBaseFragment;", "()V", "parkingType", "", "handleGuestClick", "", "guest", "Lru/unicorn/ujin/view/fragments/parking/response/Guest;", "handleGuests", "event", "Lru/unicorn/ujin/view/fragments/parking/events/ParkingGuestsEvent;", "handleNewRentClick", "handleParkingSlots", "Lru/unicorn/ujin/view/fragments/parking/events/MyParkingSlotsEvent;", "handleSlotClick", "parkingSlot", "Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlot;", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingMySlotsFragment */
/* compiled from: ParkingMySlotsFragment.kt */
public final class ParkingMySlotsFragment extends ParkingBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public int parkingType;

    @JvmStatic
    public static final ParkingMySlotsFragment newInstance(int i, String str) {
        return Companion.newInstance(i, str);
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
        return "Экран аренды парковок";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void showToolbar() {
        super.showToolbar();
        getBaseActivity().setTextTitle(getTitle());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_my_slots, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getParkingViewModel().showLoader.observe(getViewLifecycleOwner(), new ParkingMySlotsFragment$onViewCreated$1(this));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnNewRent)).setOnClickListener(new ParkingMySlotsFragment$onViewCreated$2(this));
        int i = this.parkingType;
        if (i == 0) {
            DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnNewRent);
            dynamicBackgroundButton.setText(dynamicBackgroundButton.getResources().getString(R.string.parkingNewRent));
            dynamicBackgroundButton.setOnClickListener(new ParkingMySlotsFragment$onViewCreated$$inlined$apply$lambda$1(this));
            getParkingViewModel().getMySlotsMutableLiveData().observe(getViewLifecycleOwner(), new ParkingMySlotsFragment$onViewCreated$4(this));
            getParkingViewModel().getMySlots();
        } else if (i == 1) {
            DynamicBackgroundButton dynamicBackgroundButton2 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnNewRent);
            dynamicBackgroundButton2.setText(dynamicBackgroundButton2.getResources().getString(R.string.parkingNewPass));
            dynamicBackgroundButton2.setOnClickListener(new ParkingMySlotsFragment$onViewCreated$$inlined$apply$lambda$2(this));
            getParkingViewModel().getParkingGuestsMutableLiveData().observe(getViewLifecycleOwner(), new ParkingMySlotsFragment$onViewCreated$6(this));
            getParkingViewModel().getParkingGuests();
        }
    }

    /* access modifiers changed from: private */
    public final void handleNewRentClick() {
        nextFragment(ParkingNewRentDateFragment.Companion.newInstance(this.parkingType), false, BaseActivity.FRAGMENT_PARKING_NEW_RENT);
    }

    /* access modifiers changed from: private */
    public final void handleParkingSlots(MyParkingSlotsEvent myParkingSlotsEvent) {
        if (!myParkingSlotsEvent.getSuccess()) {
            showMessage(myParkingSlotsEvent.getMessage());
        } else if (myParkingSlotsEvent.getSlotList().size() > 0) {
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llMessage);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "llMessage");
            linearLayout.setVisibility(8);
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.setAdapter(new MyParkingSlotsAdapter(myParkingSlotsEvent.getSlotList(), true, new C6054x96ec52eb(this, myParkingSlotsEvent)));
        } else {
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv);
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "rv");
            recyclerView2.setVisibility(8);
            LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llMessage);
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "llMessage");
            linearLayout2.setVisibility(0);
            TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvMessageTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "tvMessageTitle");
            textView.setText(getString(R.string.parkingNoRents));
            TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvMessageDescription);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvMessageDescription");
            textView2.setText(getString(R.string.parkingNoRentsDescription));
        }
    }

    /* access modifiers changed from: private */
    public final void handleGuests(ParkingGuestsEvent parkingGuestsEvent) {
        if (parkingGuestsEvent.getSuccess()) {
            ArrayList<Guest> guestList = parkingGuestsEvent.getGuestList();
            if (guestList == null) {
                return;
            }
            if (guestList.size() > 0) {
                LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llMessage);
                Intrinsics.checkNotNullExpressionValue(linearLayout, "llMessage");
                linearLayout.setVisibility(8);
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv);
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
                recyclerView.setAdapter(new GuestListAdapter(parkingGuestsEvent.getGuestList(), new ParkingMySlotsFragment$handleGuests$$inlined$let$lambda$1(this, parkingGuestsEvent)));
                return;
            }
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv);
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "rv");
            recyclerView2.setVisibility(8);
            LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llMessage);
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "llMessage");
            linearLayout2.setVisibility(0);
            TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvMessageTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "tvMessageTitle");
            textView.setText(getString(R.string.parkingNoPasses));
            TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvMessageDescription);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvMessageDescription");
            textView2.setText(getString(R.string.parkingNoPassesDescription));
            return;
        }
        showMessage(parkingGuestsEvent.getMessage());
    }

    /* access modifiers changed from: private */
    public final void handleGuestClick(Guest guest) {
        nextFragment(ParkingGuestInfoFragment.Companion.newInstance(guest), false, BaseActivity.FRAGMENT_PARKING_GUEST_INFO);
    }

    /* access modifiers changed from: private */
    public final void handleSlotClick(ParkingSlot parkingSlot) {
        nextFragment(ParkingSlotInfoFragment.Companion.newInstance(parkingSlot), false, BaseActivity.FRAGMENT_PARKING_SLOT_INFO);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingMySlotsFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingMySlotsFragment;", "parkingType", "", "title", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingMySlotsFragment$Companion */
    /* compiled from: ParkingMySlotsFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ParkingMySlotsFragment newInstance(int i, String str) {
            Intrinsics.checkNotNullParameter(str, "title");
            ParkingMySlotsFragment parkingMySlotsFragment = new ParkingMySlotsFragment();
            parkingMySlotsFragment.parkingType = i;
            parkingMySlotsFragment.setTitle(str);
            return parkingMySlotsFragment;
        }
    }
}
