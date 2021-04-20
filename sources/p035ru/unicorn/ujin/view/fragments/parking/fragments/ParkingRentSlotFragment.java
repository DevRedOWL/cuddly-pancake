package p035ru.unicorn.ujin.view.fragments.parking.fragments;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.api.response.SimpleResponse;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.customViews.dynamic.DatePickerViewHolder;
import p035ru.unicorn.ujin.view.fragments.parking.adapters.SlotInfoAdapter;
import p035ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo;
import p035ru.unicorn.ujin.view.fragments.parking.response.Zone;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0014J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0018\u0010\u001a\u001a\u00020\r2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0002J\b\u0010\u001e\u001a\u00020\rH\u0002J\b\u0010\u001f\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingRentSlotFragment;", "Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingBaseFragment;", "()V", "calendarEnd", "Ljava/util/Calendar;", "calendarStart", "dateFormat", "Ljava/text/SimpleDateFormat;", "parkingSlot", "Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "sdf", "zone", "initSlotInfo", "", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showData", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/SimpleResponse;", "showSuccessMessage", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingRentSlotFragment */
/* compiled from: ParkingRentSlotFragment.kt */
public final class ParkingRentSlotFragment extends ParkingBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public Calendar calendarEnd;
    /* access modifiers changed from: private */
    public Calendar calendarStart;
    private final SimpleDateFormat dateFormat = new SimpleDateFormat(DatePickerViewHolder.DATE_FORMAT, Locale.getDefault());
    /* access modifiers changed from: private */
    public Zone parkingSlot;
    /* access modifiers changed from: private */
    public final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
    /* access modifiers changed from: private */
    public Zone zone;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingRentSlotFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 3;
        }
    }

    @JvmStatic
    public static final ParkingRentSlotFragment newInstance(Calendar calendar, Calendar calendar2, Zone zone2, Zone zone3) {
        return Companion.newInstance(calendar, calendar2, zone2, zone3);
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

    public static final /* synthetic */ Calendar access$getCalendarEnd$p(ParkingRentSlotFragment parkingRentSlotFragment) {
        Calendar calendar = parkingRentSlotFragment.calendarEnd;
        if (calendar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarEnd");
        }
        return calendar;
    }

    public static final /* synthetic */ Calendar access$getCalendarStart$p(ParkingRentSlotFragment parkingRentSlotFragment) {
        Calendar calendar = parkingRentSlotFragment.calendarStart;
        if (calendar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarStart");
        }
        return calendar;
    }

    public static final /* synthetic */ Zone access$getParkingSlot$p(ParkingRentSlotFragment parkingRentSlotFragment) {
        Zone zone2 = parkingRentSlotFragment.parkingSlot;
        if (zone2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parkingSlot");
        }
        return zone2;
    }

    public void showToolbar() {
        getBaseActivity().setTextTitle(getString(R.string.parkingSlotInfoTitle));
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_parking_slot_rent, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        initSlotInfo();
        getParkingViewModel().getFreeRentMutableLiveData().observe(getViewLifecycleOwner(), new ParkingRentSlotFragment$onViewCreated$1(this));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnSendApp)).setOnClickListener(new ParkingRentSlotFragment$onViewCreated$2(this));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnShowOnMap)).setOnClickListener(new ParkingRentSlotFragment$onViewCreated$3(this));
    }

    /* access modifiers changed from: private */
    public final void showData(Resource<SimpleResponse> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                progressBar.setVisibility(8);
                showSuccessMessage();
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                progressBar2.setVisibility(8);
                showMessage(resource.getMessage());
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                progressBar3.setVisibility(0);
            }
        }
    }

    private final void showSuccessMessage() {
        new AlertDialog.Builder(getBaseActivity()).setMessage((CharSequence) getResources().getString(R.string.parkingRentSuccessMessage)).setPositiveButton((CharSequence) getResources().getString(R.string.ok), (DialogInterface.OnClickListener) new ParkingRentSlotFragment$showSuccessMessage$1(this)).setOnCancelListener(new ParkingRentSlotFragment$showSuccessMessage$2(this)).create().show();
    }

    private final void initSlotInfo() {
        String title;
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvPlaceName);
        Intrinsics.checkNotNullExpressionValue(textView, "tvPlaceName");
        Zone zone2 = this.parkingSlot;
        if (zone2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parkingSlot");
        }
        textView.setText(zone2.getTitle());
        Zone zone3 = this.zone;
        if (zone3 == null || (title = zone3.getTitle()) == null || !(!StringsKt.isBlank(title))) {
            TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvZoneName);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvZoneName");
            textView2.setVisibility(4);
        } else {
            TextView textView3 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvZoneName);
            Intrinsics.checkNotNullExpressionValue(textView3, "tvZoneName");
            textView3.setVisibility(0);
            TextView textView4 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvZoneName);
            Intrinsics.checkNotNullExpressionValue(textView4, "tvZoneName");
            Zone zone4 = this.zone;
            textView4.setText(zone4 != null ? zone4.getTitle() : null);
        }
        ArrayList arrayList = new ArrayList();
        SimpleDateFormat simpleDateFormat = this.dateFormat;
        Calendar calendar = this.calendarStart;
        if (calendar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarStart");
        }
        arrayList.add(new DetailedInfo("Дата начала", simpleDateFormat.format(calendar.getTime())));
        SimpleDateFormat simpleDateFormat2 = this.dateFormat;
        Calendar calendar2 = this.calendarEnd;
        if (calendar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarEnd");
        }
        arrayList.add(new DetailedInfo("Дата завершения", simpleDateFormat2.format(calendar2.getTime())));
        User user = getBaseActivity().profileViewModel.getUser();
        arrayList.add(new DetailedInfo("ФИО", user.getSurname() + " " + user.getName() + " " + user.getPatronymic()));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvRentInfo);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rvRentInfo");
        recyclerView.setVisibility(0);
        TextView textView5 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvRentInfo);
        Intrinsics.checkNotNullExpressionValue(textView5, "tvRentInfo");
        textView5.setVisibility(0);
        View _$_findCachedViewById = _$_findCachedViewById(C5619R.C5622id.divider1);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "divider1");
        _$_findCachedViewById.setVisibility(0);
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvRentInfo);
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 1, false));
        recyclerView2.setAdapter(new SlotInfoAdapter(arrayList));
        if (recyclerView2 == null) {
            ParkingRentSlotFragment parkingRentSlotFragment = this;
            RecyclerView recyclerView3 = (RecyclerView) parkingRentSlotFragment._$_findCachedViewById(C5619R.C5622id.rvRentInfo);
            Intrinsics.checkNotNullExpressionValue(recyclerView3, "rvRentInfo");
            recyclerView3.setVisibility(8);
            TextView textView6 = (TextView) parkingRentSlotFragment._$_findCachedViewById(C5619R.C5622id.tvRentInfo);
            Intrinsics.checkNotNullExpressionValue(textView6, "tvRentInfo");
            textView6.setVisibility(8);
            View _$_findCachedViewById2 = parkingRentSlotFragment._$_findCachedViewById(C5619R.C5622id.divider1);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "divider1");
            _$_findCachedViewById2.setVisibility(8);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingRentSlotFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingRentSlotFragment;", "calendarStart", "Ljava/util/Calendar;", "calendarEnd", "parkingSlot", "Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "zone", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingRentSlotFragment$Companion */
    /* compiled from: ParkingRentSlotFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ParkingRentSlotFragment newInstance(Calendar calendar, Calendar calendar2, Zone zone, Zone zone2) {
            Intrinsics.checkNotNullParameter(calendar, "calendarStart");
            Intrinsics.checkNotNullParameter(calendar2, "calendarEnd");
            Intrinsics.checkNotNullParameter(zone, "parkingSlot");
            ParkingRentSlotFragment parkingRentSlotFragment = new ParkingRentSlotFragment();
            parkingRentSlotFragment.calendarStart = calendar;
            parkingRentSlotFragment.calendarEnd = calendar2;
            parkingRentSlotFragment.parkingSlot = zone;
            parkingRentSlotFragment.zone = zone2;
            return parkingRentSlotFragment;
        }
    }
}
