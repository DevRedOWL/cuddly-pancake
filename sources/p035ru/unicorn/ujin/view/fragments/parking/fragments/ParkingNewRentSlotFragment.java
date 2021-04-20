package p035ru.unicorn.ujin.view.fragments.parking.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.fragments.parking.ParkingViewModel;
import p035ru.unicorn.ujin.view.fragments.parking.adapters.ZoneSlotsAdapter;
import p035ru.unicorn.ujin.view.fragments.parking.events.GuestZoneSlotsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.events.ZoneSlotsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.response.Zone;
import p035ru.unicorn.ujin.view.fragments.parking.response.ZoneInfo;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001a\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0014J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010$\u001a\u00020\u0012H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingNewRentSlotFragment;", "Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingBaseFragment;", "()V", "calendarEnd", "Ljava/util/Calendar;", "getCalendarEnd", "()Ljava/util/Calendar;", "setCalendarEnd", "(Ljava/util/Calendar;)V", "calendarStart", "getCalendarStart", "setCalendarStart", "parkingType", "", "slot", "Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "zone", "handleGuestZoneSlots", "", "event", "Lru/unicorn/ujin/view/fragments/parking/events/GuestZoneSlotsEvent;", "handleSlotClick", "handleZoneSlots", "Lru/unicorn/ujin/view/fragments/parking/events/ZoneSlotsEvent;", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingNewRentSlotFragment */
/* compiled from: ParkingNewRentSlotFragment.kt */
public final class ParkingNewRentSlotFragment extends ParkingBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    public Calendar calendarEnd;
    public Calendar calendarStart;
    /* access modifiers changed from: private */
    public int parkingType;
    /* access modifiers changed from: private */
    public Zone slot;
    /* access modifiers changed from: private */
    public Zone zone;

    @JvmStatic
    public static final ParkingNewRentSlotFragment newInstance(Calendar calendar, Calendar calendar2, int i) {
        return Companion.newInstance(calendar, calendar2, i);
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
        return "Экран выбора места аренды";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final Calendar getCalendarStart() {
        Calendar calendar = this.calendarStart;
        if (calendar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarStart");
        }
        return calendar;
    }

    public final void setCalendarStart(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<set-?>");
        this.calendarStart = calendar;
    }

    public final Calendar getCalendarEnd() {
        Calendar calendar = this.calendarEnd;
        if (calendar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarEnd");
        }
        return calendar;
    }

    public final void setCalendarEnd(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<set-?>");
        this.calendarEnd = calendar;
    }

    public void showToolbar() {
        getBaseActivity().setTextTitle(getString(R.string.parkingNewRent));
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        BaseActivity baseActivity = getBaseActivity();
        View[] viewArr = new View[1];
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.item_toolbar_blue_button, getBaseActivity().llButtonsRight, false);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            textView.setText(getString(R.string.parkingNextStep));
            textView.setOnClickListener(new ParkingNewRentSlotFragment$showToolbar$$inlined$apply$lambda$1(textView, this));
            Unit unit = Unit.INSTANCE;
            viewArr[0] = textView;
            baseActivity.setToolbarRight(CollectionsKt.arrayListOf(viewArr));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_parking_new_rent_slot, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getParkingViewModel().showLoader.observe(getViewLifecycleOwner(), new ParkingNewRentSlotFragment$onViewCreated$1(this));
        int i = this.parkingType;
        if (i == 0) {
            getParkingViewModel().getZoneSlotsMutableLiveData().observe(getViewLifecycleOwner(), new ParkingNewRentSlotFragment$onViewCreated$2(this));
            ParkingViewModel parkingViewModel = getParkingViewModel();
            Calendar calendar = this.calendarStart;
            if (calendar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calendarStart");
            }
            Calendar calendar2 = this.calendarEnd;
            if (calendar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calendarEnd");
            }
            parkingViewModel.getRentableSlots(calendar, calendar2);
        } else if (i == 1) {
            getParkingViewModel().getGuestZoneSlotsMutableLiveData().observe(getViewLifecycleOwner(), new ParkingNewRentSlotFragment$onViewCreated$3(this));
            ParkingViewModel parkingViewModel2 = getParkingViewModel();
            Calendar calendar3 = this.calendarStart;
            if (calendar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calendarStart");
            }
            Calendar calendar4 = this.calendarEnd;
            if (calendar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calendarEnd");
            }
            parkingViewModel2.getGuestableParkingSlots(calendar3, calendar4);
        }
    }

    /* access modifiers changed from: private */
    public final void handleZoneSlots(ZoneSlotsEvent zoneSlotsEvent) {
        if (zoneSlotsEvent.getSuccess()) {
            ((LinearLayout) _$_findCachedViewById(C5619R.C5622id.llZoneSlots)).removeAllViews();
            ArrayList<ZoneInfo> zoneList = zoneSlotsEvent.getZoneList();
            boolean z = false;
            if (zoneList != null) {
                Iterable<ZoneInfo> iterable = zoneList;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (ZoneInfo zoneInfo : iterable) {
                    LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llZoneSlots);
                    LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llZoneSlots);
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "llZoneSlots");
                    View inflate = LayoutInflater.from(linearLayout2.getContext()).inflate(R.layout.item_zone_slots, (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llZoneSlots), false);
                    Intrinsics.checkNotNullExpressionValue(inflate, "this");
                    TextView textView = (TextView) inflate.findViewById(C5619R.C5622id.tvZoneName);
                    Intrinsics.checkNotNullExpressionValue(textView, "this.tvZoneName");
                    Zone zone2 = zoneInfo.getZone();
                    textView.setText(zone2 != null ? zone2.getTitle() : null);
                    ArrayList<Zone> slotList = zoneInfo.getSlotList();
                    if (slotList != null) {
                        ((RecyclerView) inflate.findViewById(C5619R.C5622id.rvZoneSlots)).setAdapter(new ZoneSlotsAdapter(slotList, new ParkingNewRentSlotFragment$handleZoneSlots$$inlined$let$lambda$1(slotList, inflate, zoneInfo, this)));
                    }
                    Unit unit = Unit.INSTANCE;
                    linearLayout.addView(inflate);
                    arrayList.add(Unit.INSTANCE);
                }
                List list = (List) arrayList;
            }
            Collection zoneList2 = zoneSlotsEvent.getZoneList();
            if (zoneList2 == null || zoneList2.isEmpty()) {
                z = true;
            }
            if (z) {
                showMessage("В выбранный диапазон времени нет доступных мест");
                return;
            }
            return;
        }
        showMessage(zoneSlotsEvent.getMessage());
    }

    /* access modifiers changed from: private */
    public final void handleGuestZoneSlots(GuestZoneSlotsEvent guestZoneSlotsEvent) {
        if (guestZoneSlotsEvent.getSuccess()) {
            ((LinearLayout) _$_findCachedViewById(C5619R.C5622id.llZoneSlots)).removeAllViews();
            ArrayList<Zone> ownZoneList = guestZoneSlotsEvent.getOwnZoneList();
            if (ownZoneList != null && ownZoneList.size() > 0) {
                LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llZoneSlots);
                Intrinsics.checkNotNullExpressionValue(linearLayout, "llZoneSlots");
                View inflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.item_zone_slots, (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llZoneSlots), false);
                Intrinsics.checkNotNullExpressionValue(inflate, "this");
                TextView textView = (TextView) inflate.findViewById(C5619R.C5622id.tvZoneName);
                Intrinsics.checkNotNullExpressionValue(textView, "this.tvZoneName");
                textView.setText("Мои места");
                ((RecyclerView) inflate.findViewById(C5619R.C5622id.rvZoneSlots)).setAdapter(new ZoneSlotsAdapter(ownZoneList, new C6055xb36fd584(ownZoneList, inflate, ownZoneList, this)));
                Unit unit = Unit.INSTANCE;
                ((LinearLayout) _$_findCachedViewById(C5619R.C5622id.llZoneSlots)).addView(inflate);
            }
            ArrayList<Zone> rentedZoneList = guestZoneSlotsEvent.getRentedZoneList();
            if (rentedZoneList != null && rentedZoneList.size() > 0) {
                LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llZoneSlots);
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "llZoneSlots");
                View inflate2 = LayoutInflater.from(linearLayout2.getContext()).inflate(R.layout.item_zone_slots, (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llZoneSlots), false);
                Intrinsics.checkNotNullExpressionValue(inflate2, "this");
                TextView textView2 = (TextView) inflate2.findViewById(C5619R.C5622id.tvZoneName);
                Intrinsics.checkNotNullExpressionValue(textView2, "this.tvZoneName");
                textView2.setText("Арендованные места");
                ((RecyclerView) inflate2.findViewById(C5619R.C5622id.rvZoneSlots)).setAdapter(new ZoneSlotsAdapter(rentedZoneList, new C6056xb36fd585(rentedZoneList, inflate2, rentedZoneList, this)));
                Unit unit2 = Unit.INSTANCE;
                ((LinearLayout) _$_findCachedViewById(C5619R.C5622id.llZoneSlots)).addView(inflate2);
            }
            ArrayList<ZoneInfo> zoneList = guestZoneSlotsEvent.getZoneList();
            if (zoneList != null) {
                Iterable<ZoneInfo> iterable = zoneList;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (ZoneInfo zoneInfo : iterable) {
                    LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llZoneSlots);
                    LinearLayout linearLayout4 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llZoneSlots);
                    Intrinsics.checkNotNullExpressionValue(linearLayout4, "llZoneSlots");
                    View inflate3 = LayoutInflater.from(linearLayout4.getContext()).inflate(R.layout.item_zone_slots, (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llZoneSlots), false);
                    Intrinsics.checkNotNullExpressionValue(inflate3, "this");
                    TextView textView3 = (TextView) inflate3.findViewById(C5619R.C5622id.tvZoneName);
                    Intrinsics.checkNotNullExpressionValue(textView3, "this.tvZoneName");
                    Zone zone2 = zoneInfo.getZone();
                    textView3.setText(zone2 != null ? zone2.getTitle() : null);
                    ArrayList<Zone> slotList = zoneInfo.getSlotList();
                    if (slotList != null) {
                        ((RecyclerView) inflate3.findViewById(C5619R.C5622id.rvZoneSlots)).setAdapter(new ZoneSlotsAdapter(slotList, new C6057xb36fd586(slotList, inflate3, zoneInfo, this)));
                    }
                    Unit unit3 = Unit.INSTANCE;
                    linearLayout3.addView(inflate3);
                    arrayList.add(Unit.INSTANCE);
                }
                List list = (List) arrayList;
            }
            Collection ownZoneList2 = guestZoneSlotsEvent.getOwnZoneList();
            boolean z = true;
            if (ownZoneList2 == null || ownZoneList2.isEmpty()) {
                Collection zoneList2 = guestZoneSlotsEvent.getZoneList();
                if (zoneList2 == null || zoneList2.isEmpty()) {
                    Collection rentedZoneList2 = guestZoneSlotsEvent.getRentedZoneList();
                    if (rentedZoneList2 != null && !rentedZoneList2.isEmpty()) {
                        z = false;
                    }
                    if (z) {
                        showMessage("В выбранный диапазон времени нет доступных мест");
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        showMessage(guestZoneSlotsEvent.getMessage());
    }

    /* access modifiers changed from: private */
    public final void handleSlotClick(Zone zone2, Zone zone3) {
        this.slot = zone2;
        this.zone = zone3;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingNewRentSlotFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingNewRentSlotFragment;", "calendarStart", "Ljava/util/Calendar;", "calendarEnd", "parkingType", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingNewRentSlotFragment$Companion */
    /* compiled from: ParkingNewRentSlotFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ParkingNewRentSlotFragment newInstance(Calendar calendar, Calendar calendar2, int i) {
            Intrinsics.checkNotNullParameter(calendar, "calendarStart");
            Intrinsics.checkNotNullParameter(calendar2, "calendarEnd");
            ParkingNewRentSlotFragment parkingNewRentSlotFragment = new ParkingNewRentSlotFragment();
            parkingNewRentSlotFragment.setCalendarStart(calendar);
            parkingNewRentSlotFragment.setCalendarEnd(calendar2);
            parkingNewRentSlotFragment.parkingType = i;
            return parkingNewRentSlotFragment;
        }
    }
}
