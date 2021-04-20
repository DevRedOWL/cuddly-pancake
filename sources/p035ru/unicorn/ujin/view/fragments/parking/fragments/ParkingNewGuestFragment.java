package p035ru.unicorn.ujin.view.fragments.parking.fragments;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.api.response.SimpleResponse;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText;
import p035ru.unicorn.ujin.view.fragments.parking.adapters.ParkingGuestAdapter;
import p035ru.unicorn.ujin.view.fragments.parking.events.ParkingAutocompleteGuestsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.response.Guest;
import p035ru.unicorn.ujin.view.fragments.parking.response.Zone;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0014J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0018\u0010'\u001a\u00020\u00152\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)H\u0002J\b\u0010+\u001a\u00020\u0015H\u0002J\b\u0010,\u001a\u00020\u0015H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006."}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingNewGuestFragment;", "Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingBaseFragment;", "()V", "calendarEnd", "Ljava/util/Calendar;", "getCalendarEnd", "()Ljava/util/Calendar;", "setCalendarEnd", "(Ljava/util/Calendar;)V", "calendarStart", "getCalendarStart", "setCalendarStart", "sdf", "Ljava/text/SimpleDateFormat;", "slot", "Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "getSlot", "()Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "setSlot", "(Lru/unicorn/ujin/view/fragments/parking/response/Zone;)V", "handleGuestClick", "", "guest", "Lru/unicorn/ujin/view/fragments/parking/response/Guest;", "handleGuests", "event", "Lru/unicorn/ujin/view/fragments/parking/events/ParkingAutocompleteGuestsEvent;", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showData", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/SimpleResponse;", "showSuccessMessage", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingNewGuestFragment */
/* compiled from: ParkingNewGuestFragment.kt */
public final class ParkingNewGuestFragment extends ParkingBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    public Calendar calendarEnd;
    public Calendar calendarStart;
    /* access modifiers changed from: private */
    public final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
    public Zone slot;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingNewGuestFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 3;
        }
    }

    @JvmStatic
    public static final ParkingNewGuestFragment newInstance(Calendar calendar, Calendar calendar2, Zone zone) {
        return Companion.newInstance(calendar, calendar2, zone);
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
        return "Экран информации о госте парковки";
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

    public final Zone getSlot() {
        Zone zone = this.slot;
        if (zone == null) {
            Intrinsics.throwUninitializedPropertyAccessException("slot");
        }
        return zone;
    }

    public final void setSlot(Zone zone) {
        Intrinsics.checkNotNullParameter(zone, "<set-?>");
        this.slot = zone;
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
            textView.setOnClickListener(new ParkingNewGuestFragment$showToolbar$$inlined$apply$lambda$1(this));
            Unit unit = Unit.INSTANCE;
            viewArr[0] = textView;
            baseActivity.setToolbarRight(CollectionsKt.arrayListOf(viewArr));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_parking_new_rent_guest, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getParkingViewModel().getAddGuestMutableLiveData().observe(this, new ParkingNewGuestFragment$onViewCreated$1(this));
        getParkingViewModel().getParkingAutocompleteGuestsMutableLiveData().observe(getViewLifecycleOwner(), new ParkingNewGuestFragment$onViewCreated$2(this));
        getParkingViewModel().getParkingAutocompleteGuests();
    }

    /* access modifiers changed from: private */
    public final void showData(Resource<SimpleResponse> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading);
                Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
                progressBar.setVisibility(8);
                showSuccessMessage();
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "pbLoading");
                progressBar2.setVisibility(8);
                showMessage(resource.getMessage());
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "pbLoading");
                progressBar3.setVisibility(0);
            }
        }
    }

    private final void showSuccessMessage() {
        new AlertDialog.Builder(getBaseActivity()).setMessage((CharSequence) getResources().getString(R.string.parkingPassSuccessMessage)).setPositiveButton((CharSequence) getResources().getString(R.string.ok), (DialogInterface.OnClickListener) new ParkingNewGuestFragment$showSuccessMessage$1(this)).setOnCancelListener(new ParkingNewGuestFragment$showSuccessMessage$2(this)).create().show();
    }

    /* access modifiers changed from: private */
    public final void handleGuests(ParkingAutocompleteGuestsEvent parkingAutocompleteGuestsEvent) {
        ArrayList<Guest> guestList;
        if (parkingAutocompleteGuestsEvent.getSuccess() && (guestList = parkingAutocompleteGuestsEvent.getGuestList()) != null) {
            if (guestList.size() > 0) {
                TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvYourGuests);
                Intrinsics.checkNotNullExpressionValue(textView, "tvYourGuests");
                textView.setVisibility(0);
                View _$_findCachedViewById = _$_findCachedViewById(C5619R.C5622id.divider1);
                Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "divider1");
                _$_findCachedViewById.setVisibility(0);
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvPossibleGuests);
                Intrinsics.checkNotNullExpressionValue(recyclerView, "rvPossibleGuests");
                recyclerView.setVisibility(0);
                ((RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvPossibleGuests)).setAdapter(new ParkingGuestAdapter(guestList, new ParkingNewGuestFragment$handleGuests$$inlined$let$lambda$1(guestList, this)));
                return;
            }
            TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvYourGuests);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvYourGuests");
            textView2.setVisibility(8);
            View _$_findCachedViewById2 = _$_findCachedViewById(C5619R.C5622id.divider1);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "divider1");
            _$_findCachedViewById2.setVisibility(8);
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvPossibleGuests);
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "rvPossibleGuests");
            recyclerView2.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public final void handleGuestClick(Guest guest) {
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etSurname)).setText(guest.getSurname());
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etName)).setText(guest.getName());
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPatronymic)).setText(guest.getPatronymic());
        ((PhoneMaskedEditText) _$_findCachedViewById(C5619R.C5622id.etPhone)).setText(guest.getPhone());
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etBrand)).setText(guest.getBrand());
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etLicencePlate)).setText(guest.getLicencePlate());
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingNewGuestFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingNewGuestFragment;", "calendarStart", "Ljava/util/Calendar;", "calendarEnd", "slot", "Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingNewGuestFragment$Companion */
    /* compiled from: ParkingNewGuestFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ParkingNewGuestFragment newInstance(Calendar calendar, Calendar calendar2, Zone zone) {
            Intrinsics.checkNotNullParameter(calendar, "calendarStart");
            Intrinsics.checkNotNullParameter(calendar2, "calendarEnd");
            Intrinsics.checkNotNullParameter(zone, "slot");
            ParkingNewGuestFragment parkingNewGuestFragment = new ParkingNewGuestFragment();
            parkingNewGuestFragment.setCalendarStart(calendar);
            parkingNewGuestFragment.setCalendarEnd(calendar2);
            parkingNewGuestFragment.setSlot(zone);
            return parkingNewGuestFragment;
        }
    }
}
