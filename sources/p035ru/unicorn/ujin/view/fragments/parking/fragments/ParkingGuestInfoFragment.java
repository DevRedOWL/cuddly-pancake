package p035ru.unicorn.ujin.view.fragments.parking.fragments;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.api.response.SimpleResponse;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.customViews.dynamic.DatePickerViewHolder;
import p035ru.unicorn.ujin.view.fragments.parking.adapters.SlotInfoAdapter;
import p035ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo;
import p035ru.unicorn.ujin.view.fragments.parking.response.Guest;
import p035ru.unicorn.ujin.view.fragments.parking.response.Zone;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0014J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0018\u0010\u001c\u001a\u00020\u000f2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u0002J\b\u0010 \u001a\u00020\u000fH\u0002J\b\u0010!\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingGuestInfoFragment;", "Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingBaseFragment;", "()V", "calendarEnd", "Ljava/util/Calendar;", "calendarStart", "dateFormat", "Ljava/text/SimpleDateFormat;", "guest", "Lru/unicorn/ujin/view/fragments/parking/response/Guest;", "parkingSlot", "Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "sdf", "zone", "initSlotInfo", "", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showData", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/SimpleResponse;", "showSuccessMessage", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingGuestInfoFragment */
/* compiled from: ParkingGuestInfoFragment.kt */
public final class ParkingGuestInfoFragment extends ParkingBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public Calendar calendarEnd;
    /* access modifiers changed from: private */
    public Calendar calendarStart;
    private final SimpleDateFormat dateFormat = new SimpleDateFormat(DatePickerViewHolder.DATE_FORMAT, Locale.getDefault());
    /* access modifiers changed from: private */
    public Guest guest;
    /* access modifiers changed from: private */
    public Zone parkingSlot;
    /* access modifiers changed from: private */
    public final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.getDefault());
    private Zone zone;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingGuestInfoFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 3;
        }
    }

    @JvmStatic
    public static final ParkingGuestInfoFragment newInstance(Guest guest2) {
        return Companion.newInstance(guest2);
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

    public static final /* synthetic */ Calendar access$getCalendarEnd$p(ParkingGuestInfoFragment parkingGuestInfoFragment) {
        Calendar calendar = parkingGuestInfoFragment.calendarEnd;
        if (calendar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarEnd");
        }
        return calendar;
    }

    public static final /* synthetic */ Calendar access$getCalendarStart$p(ParkingGuestInfoFragment parkingGuestInfoFragment) {
        Calendar calendar = parkingGuestInfoFragment.calendarStart;
        if (calendar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarStart");
        }
        return calendar;
    }

    public static final /* synthetic */ Guest access$getGuest$p(ParkingGuestInfoFragment parkingGuestInfoFragment) {
        Guest guest2 = parkingGuestInfoFragment.guest;
        if (guest2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RemoteRepository.GUEST);
        }
        return guest2;
    }

    public static final /* synthetic */ Zone access$getParkingSlot$p(ParkingGuestInfoFragment parkingGuestInfoFragment) {
        Zone zone2 = parkingGuestInfoFragment.parkingSlot;
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
        return layoutInflater.inflate(R.layout.fragment_parking_guest_info, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        initSlotInfo();
        getParkingViewModel().getFreeRentMutableLiveData().observe(this, new ParkingGuestInfoFragment$onViewCreated$1(this));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnSendApp)).setOnClickListener(new ParkingGuestInfoFragment$onViewCreated$2(this));
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
                Integer error = resource.getError();
                Intrinsics.checkNotNullExpressionValue(error, "resource.error");
                showMessage(error.intValue());
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                progressBar3.setVisibility(0);
            }
        }
    }

    private final void showSuccessMessage() {
        new AlertDialog.Builder(getBaseActivity()).setMessage((CharSequence) getResources().getString(R.string.parkingRentSuccessMessage)).setPositiveButton((CharSequence) getResources().getString(R.string.ok), (DialogInterface.OnClickListener) new ParkingGuestInfoFragment$showSuccessMessage$1(this)).setOnCancelListener(new ParkingGuestInfoFragment$showSuccessMessage$2(this)).create().show();
    }

    private final void initSlotInfo() {
        String str;
        ArrayList arrayList = new ArrayList();
        Guest guest2 = this.guest;
        if (guest2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RemoteRepository.GUEST);
        }
        Calendar parseDate = DateUtils.parseDate(guest2.getDateStart(), "yyyy-MM-dd hh:mm:ss");
        if (parseDate != null) {
            arrayList.add(new DetailedInfo("Дата начала", DateUtils.formatDateFromCalendar(parseDate, DatePickerViewHolder.DATE_FORMAT)));
        }
        Guest guest3 = this.guest;
        if (guest3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RemoteRepository.GUEST);
        }
        Calendar parseDate2 = DateUtils.parseDate(guest3.getDateFinish(), "yyyy-MM-dd hh:mm:ss");
        if (parseDate2 != null) {
            arrayList.add(new DetailedInfo("Дата завершения", DateUtils.formatDateFromCalendar(parseDate2, DatePickerViewHolder.DATE_FORMAT)));
        }
        Guest guest4 = this.guest;
        if (guest4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RemoteRepository.GUEST);
        }
        Zone slot = guest4.getSlot();
        if (slot == null || (str = slot.getTitle()) == null) {
            str = "-";
        }
        arrayList.add(new DetailedInfo("Место", str));
        Guest guest5 = this.guest;
        if (guest5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RemoteRepository.GUEST);
        }
        String fullname = guest5.getFullname();
        if (fullname == null) {
            fullname = "-";
        }
        arrayList.add(new DetailedInfo("ФИО", fullname));
        Guest guest6 = this.guest;
        if (guest6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RemoteRepository.GUEST);
        }
        String brand = guest6.getBrand();
        if (brand == null) {
            brand = "-";
        }
        arrayList.add(new DetailedInfo("Марка авто", brand));
        Guest guest7 = this.guest;
        if (guest7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RemoteRepository.GUEST);
        }
        String licencePlate = guest7.getLicencePlate();
        if (licencePlate == null) {
            licencePlate = "-";
        }
        arrayList.add(new DetailedInfo("Гос.номер", licencePlate));
        Guest guest8 = this.guest;
        if (guest8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RemoteRepository.GUEST);
        }
        String phone = guest8.getPhone();
        if (phone == null) {
            phone = "-";
        }
        arrayList.add(new DetailedInfo("Телефон", phone));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvGuestInfo);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rvGuestInfo");
        recyclerView.setVisibility(0);
        View _$_findCachedViewById = _$_findCachedViewById(C5619R.C5622id.divider1);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "divider1");
        _$_findCachedViewById.setVisibility(0);
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvGuestInfo);
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 1, false));
        recyclerView2.setAdapter(new SlotInfoAdapter(arrayList));
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingGuestInfoFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingGuestInfoFragment;", "guest", "Lru/unicorn/ujin/view/fragments/parking/response/Guest;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingGuestInfoFragment$Companion */
    /* compiled from: ParkingGuestInfoFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ParkingGuestInfoFragment newInstance(Guest guest) {
            Intrinsics.checkNotNullParameter(guest, RemoteRepository.GUEST);
            ParkingGuestInfoFragment parkingGuestInfoFragment = new ParkingGuestInfoFragment();
            parkingGuestInfoFragment.guest = guest;
            return parkingGuestInfoFragment;
        }
    }
}
