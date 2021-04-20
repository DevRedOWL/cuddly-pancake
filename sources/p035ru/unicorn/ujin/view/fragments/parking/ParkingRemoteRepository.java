package p035ru.unicorn.ujin.view.fragments.parking;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.Pro100Api;
import p035ru.unicorn.ujin.data.api.response.SimpleResponse;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;
import p035ru.unicorn.ujin.view.fragments.parking.events.AttachVehicleEvent;
import p035ru.unicorn.ujin.view.fragments.parking.events.EmployeeSlotsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.events.GuestZoneSlotsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.events.MyParkingSlotsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.events.MyVehiclesEvent;
import p035ru.unicorn.ujin.view.fragments.parking.events.ParkingAutocompleteGuestsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.events.ParkingGuestsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.events.ZoneSlotsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.request.AddGuestRequestBody;
import p035ru.unicorn.ujin.view.fragments.parking.request.AttachVehicleRequestBody;
import p035ru.unicorn.ujin.view.fragments.parking.response.MyVehicle;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.Flowable;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.schedulers.Schedulers;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u0000 K2\u00020\u0001:\u0001KB\u0005¢\u0006\u0002\u0010\u0002JZ\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u00020*2\u0006\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020*J\u001e\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u0010'\u001a\u00020(2\u0006\u00106\u001a\u000207J\u001e\u00108\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u0010'\u001a\u00020(2\u0006\u00106\u001a\u000207J*\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010'\u001a\u00020(J2\u0010:\u001a\u0002032\u0006\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020*2\u0006\u0010=\u001a\u00020*2\b\u0010>\u001a\u0004\u0018\u00010*2\b\u0010?\u001a\u0004\u0018\u00010*J\u001e\u0010@\u001a\u0002032\u0006\u0010;\u001a\u00020*2\u0006\u0010A\u001a\u00020*2\u0006\u0010B\u001a\u00020*J\u0016\u0010C\u001a\u0002032\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*J\u0006\u0010D\u001a\u000203J\u0006\u0010E\u001a\u000203J\u0006\u0010F\u001a\u000203J\u0006\u0010G\u001a\u000203J\u0016\u0010H\u001a\u0002032\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*J\u000e\u0010I\u001a\u0002032\u0006\u0010J\u001a\u00020*R5\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR5\u0010\t\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR5\u0010\u000b\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\f0\f \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\f0\f\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR5\u0010\u000e\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000f0\u000f \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR5\u0010\u0011\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00120\u0012 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00120\u0012\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR5\u0010\u0014\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00150\u0015 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00150\u0015\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR5\u0010\u0017\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00180\u0018 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00180\u0018\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\bR5\u0010\u001a\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u001b0\u001b \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u001b0\u001b\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR5\u0010\u001d\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u001e0\u001e \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u001e0\u001e\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\bR5\u0010 \u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010!0! \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010!0!\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\b¨\u0006L"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/ParkingRemoteRepository;", "Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "()V", "attachVehicleSubject", "Lio/reactivex/subjects/PublishSubject;", "Lru/unicorn/ujin/view/fragments/parking/events/AttachVehicleEvent;", "kotlin.jvm.PlatformType", "getAttachVehicleSubject", "()Lio/reactivex/subjects/PublishSubject;", "detachVehicleSubject", "getDetachVehicleSubject", "employeeSlotsSubject", "Lru/unicorn/ujin/view/fragments/parking/events/EmployeeSlotsEvent;", "getEmployeeSlotsSubject", "guestZoneSlotsSubject", "Lru/unicorn/ujin/view/fragments/parking/events/GuestZoneSlotsEvent;", "getGuestZoneSlotsSubject", "mySlotsListSubject", "Lru/unicorn/ujin/view/fragments/parking/events/MyParkingSlotsEvent;", "getMySlotsListSubject", "myVehicleListSubject", "Lru/unicorn/ujin/view/fragments/parking/events/MyVehiclesEvent;", "getMyVehicleListSubject", "parkingAutocompleteGuestsSubject", "Lru/unicorn/ujin/view/fragments/parking/events/ParkingAutocompleteGuestsEvent;", "getParkingAutocompleteGuestsSubject", "parkingGuestsSubject", "Lru/unicorn/ujin/view/fragments/parking/events/ParkingGuestsEvent;", "getParkingGuestsSubject", "removeVehicleSubject", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "getRemoveVehicleSubject", "zoneSlotsSubject", "Lru/unicorn/ujin/view/fragments/parking/events/ZoneSlotsEvent;", "getZoneSlotsSubject", "addGuest", "Lio/reactivex/Flowable;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/SimpleResponse;", "slotId", "", "dateStart", "", "dateEnd", "surname", "name", "patronymic", "phone", "number", "brand", "attachVehicle", "", "vehicle", "Lru/unicorn/ujin/view/fragments/parking/response/MyVehicle;", "startFlag", "", "detachVehicle", "freeRent", "getFreeSlots", "enterpriseId", "activeFrom", "activeTo", "timeFrom", "timeTo", "getFreeSlotsForEnterprise", "from", "until", "getGuestableParkingSlots", "getMySlotsList", "getMyVehicleList", "getParkingAutocompleteGuests", "getParkingGuests", "getRentableSlots", "removeVehicle", "vehicleId", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.ParkingRemoteRepository */
/* compiled from: ParkingRemoteRepository.kt */
public final class ParkingRemoteRepository extends BaseRemoteRepository {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String UNABLE_TO_LOAD = "Не удалось загрузить данные. Попробуйте позже";
    private final PublishSubject<AttachVehicleEvent> attachVehicleSubject = PublishSubject.create();
    private final PublishSubject<AttachVehicleEvent> detachVehicleSubject = PublishSubject.create();
    private final PublishSubject<EmployeeSlotsEvent> employeeSlotsSubject = PublishSubject.create();
    private final PublishSubject<GuestZoneSlotsEvent> guestZoneSlotsSubject = PublishSubject.create();
    private final PublishSubject<MyParkingSlotsEvent> mySlotsListSubject = PublishSubject.create();
    private final PublishSubject<MyVehiclesEvent> myVehicleListSubject = PublishSubject.create();
    private final PublishSubject<ParkingAutocompleteGuestsEvent> parkingAutocompleteGuestsSubject = PublishSubject.create();
    private final PublishSubject<ParkingGuestsEvent> parkingGuestsSubject = PublishSubject.create();
    private final PublishSubject<UpdateEvent> removeVehicleSubject = PublishSubject.create();
    private final PublishSubject<ZoneSlotsEvent> zoneSlotsSubject = PublishSubject.create();

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/ParkingRemoteRepository$Companion;", "", "()V", "UNABLE_TO_LOAD", "", "getUNABLE_TO_LOAD", "()Ljava/lang/String;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.parking.ParkingRemoteRepository$Companion */
    /* compiled from: ParkingRemoteRepository.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getUNABLE_TO_LOAD() {
            return ParkingRemoteRepository.UNABLE_TO_LOAD;
        }
    }

    public final PublishSubject<MyParkingSlotsEvent> getMySlotsListSubject() {
        return this.mySlotsListSubject;
    }

    public final PublishSubject<MyVehiclesEvent> getMyVehicleListSubject() {
        return this.myVehicleListSubject;
    }

    public final PublishSubject<AttachVehicleEvent> getAttachVehicleSubject() {
        return this.attachVehicleSubject;
    }

    public final PublishSubject<AttachVehicleEvent> getDetachVehicleSubject() {
        return this.detachVehicleSubject;
    }

    public final PublishSubject<ZoneSlotsEvent> getZoneSlotsSubject() {
        return this.zoneSlotsSubject;
    }

    public final PublishSubject<GuestZoneSlotsEvent> getGuestZoneSlotsSubject() {
        return this.guestZoneSlotsSubject;
    }

    public final PublishSubject<ParkingGuestsEvent> getParkingGuestsSubject() {
        return this.parkingGuestsSubject;
    }

    public final PublishSubject<ParkingAutocompleteGuestsEvent> getParkingAutocompleteGuestsSubject() {
        return this.parkingAutocompleteGuestsSubject;
    }

    public final PublishSubject<EmployeeSlotsEvent> getEmployeeSlotsSubject() {
        return this.employeeSlotsSubject;
    }

    public final PublishSubject<UpdateEvent> getRemoveVehicleSubject() {
        return this.removeVehicleSubject;
    }

    public final void getMySlotsList() {
        getApi().getMyParkingSlots(getToken()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ParkingRemoteRepository$getMySlotsList$1(this), new ParkingRemoteRepository$getMySlotsList$2(this));
    }

    public final void getMyVehicleList() {
        getApi().getMyVehicles(getToken()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ParkingRemoteRepository$getMyVehicleList$1(this), new ParkingRemoteRepository$getMyVehicleList$2(this));
    }

    public final void removeVehicle(String str) {
        Intrinsics.checkNotNullParameter(str, "vehicleId");
        getApi().removeVehicle(getToken(), str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ParkingRemoteRepository$removeVehicle$1(this), new ParkingRemoteRepository$removeVehicle$2(this));
    }

    public final void attachVehicle(MyVehicle myVehicle, int i, boolean z) {
        Intrinsics.checkNotNullParameter(myVehicle, RemoteRepository.CAR);
        Pro100Api api = getApi();
        String token = getToken();
        Integer id = myVehicle.getId();
        api.attachVehicle(token, new AttachVehicleRequestBody(id != null ? id.intValue() : -1, i)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ParkingRemoteRepository$attachVehicle$1(this, z, myVehicle), new ParkingRemoteRepository$attachVehicle$2(this, z));
    }

    public final void detachVehicle(MyVehicle myVehicle, int i, boolean z) {
        Intrinsics.checkNotNullParameter(myVehicle, RemoteRepository.CAR);
        Pro100Api api = getApi();
        String token = getToken();
        Integer id = myVehicle.getId();
        api.detachVehicle(token, new AttachVehicleRequestBody(id != null ? id.intValue() : -1, i)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ParkingRemoteRepository$detachVehicle$1(this, z, myVehicle), new ParkingRemoteRepository$detachVehicle$2(this, z));
    }

    public final void getRentableSlots(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, CardFragment.ARG_DATE_START);
        Intrinsics.checkNotNullParameter(str2, CardFragment.ARG_DATE_END);
        getApi().getRentableParkingSlots(getToken(), str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ParkingRemoteRepository$getRentableSlots$1(this), new ParkingRemoteRepository$getRentableSlots$2(this));
    }

    public final void getGuestableParkingSlots(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, CardFragment.ARG_DATE_START);
        Intrinsics.checkNotNullParameter(str2, CardFragment.ARG_DATE_END);
        getApi().getGuestableParkingSlots(getToken(), str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ParkingRemoteRepository$getGuestableParkingSlots$1(this), new ParkingRemoteRepository$getGuestableParkingSlots$2(this));
    }

    public final void getFreeSlotsForEnterprise(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "enterpriseId");
        Intrinsics.checkNotNullParameter(str2, Constants.MessagePayloadKeys.FROM);
        Intrinsics.checkNotNullParameter(str3, "until");
        getApi().getFreeSlotsForEnterprise(getToken(), str, str2, str3).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ParkingRemoteRepository$getFreeSlotsForEnterprise$1(this), new ParkingRemoteRepository$getFreeSlotsForEnterprise$2(this));
    }

    public final void getFreeSlots(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "enterpriseId");
        Intrinsics.checkNotNullParameter(str2, "activeFrom");
        Intrinsics.checkNotNullParameter(str3, "activeTo");
        getApi().getFreeSlots(getToken(), str, str2, str3, str4, str5).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ParkingRemoteRepository$getFreeSlots$1(this), new ParkingRemoteRepository$getFreeSlots$2(this));
    }

    public final void getParkingGuests() {
        getApi().getParkingGuests(getToken()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ParkingRemoteRepository$getParkingGuests$1(this), new ParkingRemoteRepository$getParkingGuests$2(this));
    }

    public final void getParkingAutocompleteGuests() {
        getApi().getParkingAutocompleteGuests(getToken()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ParkingRemoteRepository$getParkingAutocompleteGuests$1(this), new ParkingRemoteRepository$getParkingAutocompleteGuests$2(this));
    }

    public final Flowable<Resource<SimpleResponse>> freeRent(String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, CardFragment.ARG_DATE_START);
        Intrinsics.checkNotNullParameter(str2, CardFragment.ARG_DATE_END);
        Flowable<R> subscribeOn = getApi().freeRent(getToken(), str, str2, i).map(ParkingRemoteRepository$freeRent$1.INSTANCE).onErrorReturn(ParkingRemoteRepository$freeRent$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.freeRent(getToken(),…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<SimpleResponse>> addGuest(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, CardFragment.ARG_DATE_START);
        Intrinsics.checkNotNullParameter(str2, CardFragment.ARG_DATE_END);
        Intrinsics.checkNotNullParameter(str3, "surname");
        String str9 = str4;
        Intrinsics.checkNotNullParameter(str9, "name");
        String str10 = str5;
        Intrinsics.checkNotNullParameter(str10, "patronymic");
        String str11 = str6;
        Intrinsics.checkNotNullParameter(str11, "phone");
        String str12 = str7;
        Intrinsics.checkNotNullParameter(str12, CardFragment.ARG_NUMBER);
        String str13 = str8;
        Intrinsics.checkNotNullParameter(str13, CardFragment.ARG_BRAND);
        Flowable<R> subscribeOn = getApi().addGuest(getToken(), new AddGuestRequestBody(i, str, str2, str3, str9, str10, str11, str12, str13)).map(ParkingRemoteRepository$addGuest$1.INSTANCE).onErrorReturn(ParkingRemoteRepository$addGuest$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.addGuest(getToken(),…scribeOn(Schedulers.io())");
        return subscribeOn;
    }
}
