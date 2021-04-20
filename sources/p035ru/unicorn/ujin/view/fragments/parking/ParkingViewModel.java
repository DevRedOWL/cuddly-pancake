package p035ru.unicorn.ujin.view.fragments.parking;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.response.SimpleResponse;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.fragments.parking.events.AttachVehicleEvent;
import p035ru.unicorn.ujin.view.fragments.parking.events.EmployeeSlotsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.events.GuestZoneSlotsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.events.MyParkingSlotsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.events.MyVehiclesEvent;
import p035ru.unicorn.ujin.view.fragments.parking.events.ParkingAutocompleteGuestsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.events.ParkingGuestsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.events.ZoneSlotsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.response.MyVehicle;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.schedulers.Schedulers;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JP\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u0002032\u0006\u00106\u001a\u0002032\u0006\u00107\u001a\u0002032\u0006\u00108\u001a\u0002032\u0006\u00109\u001a\u0002032\u0006\u0010:\u001a\u000203H\u0007J\u001e\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020=2\u0006\u00100\u001a\u0002012\u0006\u0010>\u001a\u00020?J\u001e\u0010@\u001a\u00020/2\u0006\u0010<\u001a\u00020=2\u0006\u00100\u001a\u0002012\u0006\u0010>\u001a\u00020?J \u0010A\u001a\u00020/2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\u0006\u00100\u001a\u000201H\u0007J2\u0010B\u001a\u00020/2\u0006\u0010C\u001a\u0002032\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020E2\b\u0010G\u001a\u0004\u0018\u0001032\b\u0010H\u001a\u0004\u0018\u000103J\u001e\u0010I\u001a\u00020/2\u0006\u0010C\u001a\u0002032\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020EJ\u0016\u0010J\u001a\u00020/2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020EJ\u0006\u0010K\u001a\u00020/J\u0006\u0010L\u001a\u00020/J\u0006\u0010M\u001a\u00020/J\u0006\u0010N\u001a\u00020/J\u0016\u0010O\u001a\u00020/2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020EJ\b\u0010P\u001a\u00020/H\u0014J\u000e\u0010Q\u001a\u00020/2\u0006\u0010R\u001a\u000203R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\bR\u001b\u0010\"\u001a\u00020#8FX\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\bR\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\b¨\u0006S"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/ParkingViewModel;", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/BaseViewModel;", "()V", "addGuestMutableLiveData", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/SimpleResponse;", "getAddGuestMutableLiveData", "()Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "attachVehicleMutableLiveData", "Lru/unicorn/ujin/view/fragments/parking/events/AttachVehicleEvent;", "getAttachVehicleMutableLiveData", "detachVehicleMutableLiveData", "getDetachVehicleMutableLiveData", "employeeSlotsMutableLiveData", "Lru/unicorn/ujin/view/fragments/parking/events/EmployeeSlotsEvent;", "getEmployeeSlotsMutableLiveData", "freeRentMutableLiveData", "getFreeRentMutableLiveData", "guestZoneSlotsMutableLiveData", "Lru/unicorn/ujin/view/fragments/parking/events/GuestZoneSlotsEvent;", "getGuestZoneSlotsMutableLiveData", "mySlotsMutableLiveData", "Lru/unicorn/ujin/view/fragments/parking/events/MyParkingSlotsEvent;", "getMySlotsMutableLiveData", "myVehiclesMutableLiveData", "Lru/unicorn/ujin/view/fragments/parking/events/MyVehiclesEvent;", "getMyVehiclesMutableLiveData", "parkingAutocompleteGuestsMutableLiveData", "Lru/unicorn/ujin/view/fragments/parking/events/ParkingAutocompleteGuestsEvent;", "getParkingAutocompleteGuestsMutableLiveData", "parkingGuestsMutableLiveData", "Lru/unicorn/ujin/view/fragments/parking/events/ParkingGuestsEvent;", "getParkingGuestsMutableLiveData", "remoteRepository", "Lru/unicorn/ujin/view/fragments/parking/ParkingRemoteRepository;", "getRemoteRepository", "()Lru/unicorn/ujin/view/fragments/parking/ParkingRemoteRepository;", "remoteRepository$delegate", "Lkotlin/Lazy;", "removeVehicleMutableLiveData", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "getRemoveVehicleMutableLiveData", "zoneSlotsMutableLiveData", "Lru/unicorn/ujin/view/fragments/parking/events/ZoneSlotsEvent;", "getZoneSlotsMutableLiveData", "addGuest", "", "slotId", "", "dateStart", "", "dateEnd", "surname", "name", "patronymic", "phone", "number", "brand", "attachVehicle", "vehicle", "Lru/unicorn/ujin/view/fragments/parking/response/MyVehicle;", "b", "", "detachVehicle", "freeRent", "getFreeSlots", "enterpriseId", "calendarStart", "Ljava/util/Calendar;", "calendarEnd", "timeFrom", "timeTo", "getFreeSlotsForEnterprise", "getGuestableParkingSlots", "getMySlots", "getMyVehicles", "getParkingAutocompleteGuests", "getParkingGuests", "getRentableSlots", "onCleared", "removeVehicle", "vehicleId", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.ParkingViewModel */
/* compiled from: ParkingViewModel.kt */
public final class ParkingViewModel extends BaseViewModel {
    private final SingleLiveEvent<Resource<SimpleResponse>> addGuestMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<AttachVehicleEvent> attachVehicleMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<AttachVehicleEvent> detachVehicleMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<EmployeeSlotsEvent> employeeSlotsMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<Resource<SimpleResponse>> freeRentMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<GuestZoneSlotsEvent> guestZoneSlotsMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<MyParkingSlotsEvent> mySlotsMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<MyVehiclesEvent> myVehiclesMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<ParkingAutocompleteGuestsEvent> parkingAutocompleteGuestsMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<ParkingGuestsEvent> parkingGuestsMutableLiveData = new SingleLiveEvent<>();
    private final Lazy remoteRepository$delegate = LazyKt.lazy(ParkingViewModel$remoteRepository$2.INSTANCE);
    private final SingleLiveEvent<UpdateEvent> removeVehicleMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<ZoneSlotsEvent> zoneSlotsMutableLiveData = new SingleLiveEvent<>();

    public final ParkingRemoteRepository getRemoteRepository() {
        return (ParkingRemoteRepository) this.remoteRepository$delegate.getValue();
    }

    public ParkingViewModel() {
        this.compositeDisposable.addAll(getRemoteRepository().getMySlotsListSubject().subscribe(new Consumer<MyParkingSlotsEvent>(this) {
            final /* synthetic */ ParkingViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(MyParkingSlotsEvent myParkingSlotsEvent) {
                ParkingViewModel parkingViewModel = this.this$0;
                parkingViewModel.showLoader.postValue(false);
                parkingViewModel.getMySlotsMutableLiveData().postValue(myParkingSlotsEvent);
            }
        }), getRemoteRepository().getMyVehicleListSubject().subscribe(new Consumer<MyVehiclesEvent>(this) {
            final /* synthetic */ ParkingViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(MyVehiclesEvent myVehiclesEvent) {
                ParkingViewModel parkingViewModel = this.this$0;
                parkingViewModel.showLoader.postValue(false);
                parkingViewModel.getMyVehiclesMutableLiveData().postValue(myVehiclesEvent);
            }
        }), getRemoteRepository().getAttachVehicleSubject().subscribe(new Consumer<AttachVehicleEvent>(this) {
            final /* synthetic */ ParkingViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(AttachVehicleEvent attachVehicleEvent) {
                ParkingViewModel parkingViewModel = this.this$0;
                parkingViewModel.showLoader.postValue(false);
                parkingViewModel.getAttachVehicleMutableLiveData().postValue(attachVehicleEvent);
            }
        }), getRemoteRepository().getDetachVehicleSubject().subscribe(new Consumer<AttachVehicleEvent>(this) {
            final /* synthetic */ ParkingViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(AttachVehicleEvent attachVehicleEvent) {
                ParkingViewModel parkingViewModel = this.this$0;
                parkingViewModel.showLoader.postValue(false);
                parkingViewModel.getDetachVehicleMutableLiveData().postValue(attachVehicleEvent);
            }
        }), getRemoteRepository().getZoneSlotsSubject().subscribe(new Consumer<ZoneSlotsEvent>(this) {
            final /* synthetic */ ParkingViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(ZoneSlotsEvent zoneSlotsEvent) {
                ParkingViewModel parkingViewModel = this.this$0;
                parkingViewModel.showLoader.postValue(false);
                parkingViewModel.getZoneSlotsMutableLiveData().postValue(zoneSlotsEvent);
            }
        }), getRemoteRepository().getGuestZoneSlotsSubject().subscribe(new Consumer<GuestZoneSlotsEvent>(this) {
            final /* synthetic */ ParkingViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(GuestZoneSlotsEvent guestZoneSlotsEvent) {
                ParkingViewModel parkingViewModel = this.this$0;
                parkingViewModel.showLoader.postValue(false);
                parkingViewModel.getGuestZoneSlotsMutableLiveData().postValue(guestZoneSlotsEvent);
            }
        }), getRemoteRepository().getParkingGuestsSubject().subscribe(new Consumer<ParkingGuestsEvent>(this) {
            final /* synthetic */ ParkingViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(ParkingGuestsEvent parkingGuestsEvent) {
                ParkingViewModel parkingViewModel = this.this$0;
                parkingViewModel.showLoader.postValue(false);
                parkingViewModel.getParkingGuestsMutableLiveData().postValue(parkingGuestsEvent);
            }
        }), getRemoteRepository().getParkingAutocompleteGuestsSubject().subscribe(new Consumer<ParkingAutocompleteGuestsEvent>(this) {
            final /* synthetic */ ParkingViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(ParkingAutocompleteGuestsEvent parkingAutocompleteGuestsEvent) {
                ParkingViewModel parkingViewModel = this.this$0;
                parkingViewModel.showLoader.postValue(false);
                parkingViewModel.getParkingAutocompleteGuestsMutableLiveData().postValue(parkingAutocompleteGuestsEvent);
            }
        }), getRemoteRepository().getEmployeeSlotsSubject().subscribe(new Consumer<EmployeeSlotsEvent>(this) {
            final /* synthetic */ ParkingViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(EmployeeSlotsEvent employeeSlotsEvent) {
                ParkingViewModel parkingViewModel = this.this$0;
                parkingViewModel.showLoader.postValue(false);
                parkingViewModel.getEmployeeSlotsMutableLiveData().postValue(employeeSlotsEvent);
            }
        }), getRemoteRepository().getRemoveVehicleSubject().subscribe(new Consumer<UpdateEvent>(this) {
            final /* synthetic */ ParkingViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(UpdateEvent updateEvent) {
                ParkingViewModel parkingViewModel = this.this$0;
                parkingViewModel.showLoader.postValue(false);
                parkingViewModel.getRemoveVehicleMutableLiveData().postValue(updateEvent);
            }
        }));
    }

    public final SingleLiveEvent<MyParkingSlotsEvent> getMySlotsMutableLiveData() {
        return this.mySlotsMutableLiveData;
    }

    public final SingleLiveEvent<MyVehiclesEvent> getMyVehiclesMutableLiveData() {
        return this.myVehiclesMutableLiveData;
    }

    public final SingleLiveEvent<AttachVehicleEvent> getAttachVehicleMutableLiveData() {
        return this.attachVehicleMutableLiveData;
    }

    public final SingleLiveEvent<AttachVehicleEvent> getDetachVehicleMutableLiveData() {
        return this.detachVehicleMutableLiveData;
    }

    public final SingleLiveEvent<ZoneSlotsEvent> getZoneSlotsMutableLiveData() {
        return this.zoneSlotsMutableLiveData;
    }

    public final SingleLiveEvent<GuestZoneSlotsEvent> getGuestZoneSlotsMutableLiveData() {
        return this.guestZoneSlotsMutableLiveData;
    }

    public final SingleLiveEvent<ParkingGuestsEvent> getParkingGuestsMutableLiveData() {
        return this.parkingGuestsMutableLiveData;
    }

    public final SingleLiveEvent<ParkingAutocompleteGuestsEvent> getParkingAutocompleteGuestsMutableLiveData() {
        return this.parkingAutocompleteGuestsMutableLiveData;
    }

    public final SingleLiveEvent<Resource<SimpleResponse>> getFreeRentMutableLiveData() {
        return this.freeRentMutableLiveData;
    }

    public final SingleLiveEvent<Resource<SimpleResponse>> getAddGuestMutableLiveData() {
        return this.addGuestMutableLiveData;
    }

    public final SingleLiveEvent<EmployeeSlotsEvent> getEmployeeSlotsMutableLiveData() {
        return this.employeeSlotsMutableLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getRemoveVehicleMutableLiveData() {
        return this.removeVehicleMutableLiveData;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        this.compositeDisposable.clear();
    }

    public final void getMySlots() {
        this.showLoader.postValue(true);
        getRemoteRepository().getMySlotsList();
    }

    public final void getMyVehicles() {
        this.showLoader.postValue(true);
        getRemoteRepository().getMyVehicleList();
    }

    public final void removeVehicle(String str) {
        Intrinsics.checkNotNullParameter(str, "vehicleId");
        this.showLoader.postValue(true);
        getRemoteRepository().removeVehicle(str);
    }

    public final void attachVehicle(MyVehicle myVehicle, int i, boolean z) {
        Intrinsics.checkNotNullParameter(myVehicle, RemoteRepository.CAR);
        this.showLoader.postValue(true);
        getRemoteRepository().attachVehicle(myVehicle, i, z);
    }

    public final void detachVehicle(MyVehicle myVehicle, int i, boolean z) {
        Intrinsics.checkNotNullParameter(myVehicle, RemoteRepository.CAR);
        this.showLoader.postValue(true);
        getRemoteRepository().detachVehicle(myVehicle, i, z);
    }

    public final void getRentableSlots(Calendar calendar, Calendar calendar2) {
        Intrinsics.checkNotNullParameter(calendar, "calendarStart");
        Intrinsics.checkNotNullParameter(calendar2, "calendarEnd");
        this.showLoader.postValue(true);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        ParkingRemoteRepository remoteRepository = getRemoteRepository();
        String format = simpleDateFormat.format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(format, "sdf.format(calendarStart.time)");
        String format2 = simpleDateFormat.format(calendar2.getTime());
        Intrinsics.checkNotNullExpressionValue(format2, "sdf.format(calendarEnd.time)");
        remoteRepository.getRentableSlots(format, format2);
    }

    public final void getGuestableParkingSlots(Calendar calendar, Calendar calendar2) {
        Intrinsics.checkNotNullParameter(calendar, "calendarStart");
        Intrinsics.checkNotNullParameter(calendar2, "calendarEnd");
        this.showLoader.postValue(true);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        ParkingRemoteRepository remoteRepository = getRemoteRepository();
        String format = simpleDateFormat.format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(format, "sdf.format(calendarStart.time)");
        String format2 = simpleDateFormat.format(calendar2.getTime());
        Intrinsics.checkNotNullExpressionValue(format2, "sdf.format(calendarEnd.time)");
        remoteRepository.getGuestableParkingSlots(format, format2);
    }

    public final void getFreeSlotsForEnterprise(String str, Calendar calendar, Calendar calendar2) {
        Intrinsics.checkNotNullParameter(str, "enterpriseId");
        Intrinsics.checkNotNullParameter(calendar, "calendarStart");
        Intrinsics.checkNotNullParameter(calendar2, "calendarEnd");
        this.showLoader.postValue(true);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        ParkingRemoteRepository remoteRepository = getRemoteRepository();
        String format = simpleDateFormat.format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(format, "sdf.format(calendarStart.time)");
        String format2 = simpleDateFormat.format(calendar2.getTime());
        Intrinsics.checkNotNullExpressionValue(format2, "sdf.format(calendarEnd.time)");
        remoteRepository.getFreeSlotsForEnterprise(str, format, format2);
    }

    public final void getFreeSlots(String str, Calendar calendar, Calendar calendar2, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "enterpriseId");
        Intrinsics.checkNotNullParameter(calendar, "calendarStart");
        Intrinsics.checkNotNullParameter(calendar2, "calendarEnd");
        this.showLoader.postValue(true);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        ParkingRemoteRepository remoteRepository = getRemoteRepository();
        String format = simpleDateFormat.format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(format, "dateFormat.format(calendarStart.time)");
        String format2 = simpleDateFormat.format(calendar2.getTime());
        Intrinsics.checkNotNullExpressionValue(format2, "dateFormat.format(calendarEnd.time)");
        remoteRepository.getFreeSlots(str, format, format2, str2, str3);
    }

    public final void getParkingGuests() {
        this.showLoader.postValue(false);
        getRemoteRepository().getParkingGuests();
    }

    public final void getParkingAutocompleteGuests() {
        this.showLoader.postValue(false);
        getRemoteRepository().getParkingAutocompleteGuests();
    }

    public final void freeRent(String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, CardFragment.ARG_DATE_START);
        Intrinsics.checkNotNullParameter(str2, CardFragment.ARG_DATE_END);
        getRemoteRepository().freeRent(str, str2, i).doOnError(new ParkingViewModel$freeRent$1(this)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ParkingViewModel$freeRent$2(this));
    }

    public final void addGuest(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, CardFragment.ARG_DATE_START);
        Intrinsics.checkNotNullParameter(str2, CardFragment.ARG_DATE_END);
        String str9 = str3;
        Intrinsics.checkNotNullParameter(str9, "surname");
        String str10 = str4;
        Intrinsics.checkNotNullParameter(str10, "name");
        String str11 = str5;
        Intrinsics.checkNotNullParameter(str11, "patronymic");
        String str12 = str6;
        Intrinsics.checkNotNullParameter(str12, "phone");
        String str13 = str7;
        Intrinsics.checkNotNullParameter(str13, CardFragment.ARG_NUMBER);
        String str14 = str8;
        Intrinsics.checkNotNullParameter(str14, CardFragment.ARG_BRAND);
        getRemoteRepository().addGuest(i, str, str2, str9, str10, str11, str12, str13, str14).doOnError(new ParkingViewModel$addGuest$1(this)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ParkingViewModel$addGuest$2(this));
    }
}
