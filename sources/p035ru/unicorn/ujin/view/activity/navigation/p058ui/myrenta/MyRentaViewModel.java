package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import android.util.Log;
import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscription;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.repository.TestRemoteRepository;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueData;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueDataImpl;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CompanyList;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CompanyRentaRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentChildren;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkinkRentaObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.RentAttributes;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.TicketPropertyObject;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.Flowable;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.functions.Action;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.functions.Function;
import p046io.reactivex.functions.Predicate;
import p046io.reactivex.schedulers.Schedulers;
import p046io.realm.RealmList;
import p046io.realm.RealmModel;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.MyRentaViewModel */
public class MyRentaViewModel extends BaseViewModel {
    private static Integer accomplishmentId = 839;
    private MutableLiveData<Set<RentChildren>> choosenRentChildren = new MutableLiveData<>();
    private CompanyRentaRepository companyRentaRepository;
    private MutableLiveData<RentInfo> current = new MutableLiveData<>();
    private MutableLiveData<TalkingData> currentCowork = new MutableLiveData<>();
    private MutableLiveData<Integer> currentDay = new MutableLiveData<>();
    public MutableLiveData<String> currentDayAsString = new MutableLiveData<>();
    private MutableLiveData<Resource<CompanyList>> enterpriseWithEmployersLiveData = new MutableLiveData<>();
    private MutableLiveData<List<String>> imagesMutableLiveData = new MutableLiveData<>();
    private LocalRepository localRepository = LocalRepository.getInstance();
    private MutableLiveData<List<RentInfo>> rentAccomplishmentInfoUniqueMutableLiveData = new MutableLiveData<>();
    private SingleLiveEvent<Rent> rentInfoMutableLiveData = new SingleLiveEvent<>();
    private MutableLiveData<List<RentInfo>> rentInfoUniqueMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<List<RentInfo>> rentPeriodsMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<List<RentType>> rentTypeMutableLiveData = new MutableLiveData<>();
    private SingleLiveEvent<Pair<Rent, CompanyList>> rentaInfoMutableLiveData = new SingleLiveEvent<>();
    private RentaRepository rentaRepository = new RentaRepository();
    private MutableLiveData<List<RentInfo>> resourceMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<Map<Integer, List<RentInfo>>> resourceMutableLiveDataAsMap = new MutableLiveData<>();
    private SingleLiveEvent<List<IKeyValueData>> talkingInfoMutableLiveData = new SingleLiveEvent<>();
    private MutableLiveData<Resource<List<TalkingData>>> talkingMutableLiveData = new MutableLiveData<>();
    private SingleLiveEvent<Resource<TalkinkRentaObject>> talkingRentaMake = new SingleLiveEvent<>();
    private MutableLiveData<ArrayList<IKeyValueData>> ticketPropertyObjectMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<Resource<TimeTableObj>> timeSlotsMutableLiveData = new MutableLiveData<>();
    public MutableLiveData<Resource<TimeTableObj>> timeTableSlots = new MutableLiveData<>();

    static /* synthetic */ Iterable lambda$delete$85(List list) throws Exception {
        return list;
    }

    static /* synthetic */ Iterable lambda$getAccomplishmentChooseRentaUniqe$69(List list) throws Exception {
        return list;
    }

    static /* synthetic */ RentInfo lambda$getAccomplishmentChooseRentaUniqe$70(RentInfo rentInfo) throws Exception {
        return rentInfo;
    }

    static /* synthetic */ RentInfo lambda$getAccomplishmentChooseRentaUniqe$76(RentInfo rentInfo) throws Exception {
        return rentInfo;
    }

    static /* synthetic */ boolean lambda$getAllUsers$108(List list) throws Exception {
        return list != null;
    }

    static /* synthetic */ Iterable lambda$getAllUsers$109(List list) throws Exception {
        return list;
    }

    static /* synthetic */ boolean lambda$getAllUsers$110(List list) throws Exception {
        return list != null;
    }

    static /* synthetic */ Iterable lambda$getAvailableProperties$116(List list) throws Exception {
        return list;
    }

    static /* synthetic */ Iterable lambda$getChooseRentaUniqe$55(List list) throws Exception {
        return list;
    }

    static /* synthetic */ RentInfo lambda$getChooseRentaUniqe$56(RentInfo rentInfo) throws Exception {
        return rentInfo;
    }

    static /* synthetic */ RentInfo lambda$getChooseRentaUniqe$62(RentInfo rentInfo) throws Exception {
        return rentInfo;
    }

    static /* synthetic */ Iterable lambda$getCurrentPeriod$7(List list) throws Exception {
        return list;
    }

    static /* synthetic */ Iterable lambda$getMyRenta$1(List list) throws Exception {
        return list;
    }

    static /* synthetic */ Iterable lambda$getMyRentaUniqe$23(List list) throws Exception {
        return list;
    }

    static /* synthetic */ RentInfo lambda$getMyRentaUniqe$24(RentInfo rentInfo) throws Exception {
        return rentInfo;
    }

    static /* synthetic */ RentInfo lambda$getMyRentaUniqe$28(RentInfo rentInfo) throws Exception {
        return rentInfo;
    }

    static /* synthetic */ Iterable lambda$getMyRentaUniqeAsMap$51(List list) throws Exception {
        return list;
    }

    static /* synthetic */ Iterable lambda$getMyRentaUniqeNoFilter$33(List list) throws Exception {
        return list;
    }

    static /* synthetic */ RentInfo lambda$getMyRentaUniqeNoFilter$34(RentInfo rentInfo) throws Exception {
        return rentInfo;
    }

    static /* synthetic */ RentInfo lambda$getMyRentaUniqeNoFilter$38(RentInfo rentInfo) throws Exception {
        return rentInfo;
    }

    static /* synthetic */ boolean lambda$getRentById$42(RealmModel realmModel) throws Exception {
        return realmModel != null;
    }

    static /* synthetic */ RealmModel lambda$getRentById$43(RealmModel realmModel) throws Exception {
        return realmModel;
    }

    static /* synthetic */ boolean lambda$getRentaInfoAttributes$87(List list) throws Exception {
        return list != null;
    }

    static /* synthetic */ Iterable lambda$getRentaInfoAttributes$88(List list) throws Exception {
        return list;
    }

    static /* synthetic */ boolean lambda$getRentaInfoAttributes$94(Resource resource) throws Exception {
        return resource != null;
    }

    static /* synthetic */ Iterable lambda$showAvailableRenta$12(List list) throws Exception {
        return list;
    }

    static /* synthetic */ RentType lambda$showAvailableRenta$13(RentType rentType) throws Exception {
        return rentType;
    }

    public MyRentaViewModel() {
        this.testRemoteRepository = new TestRemoteRepository();
        this.companyRentaRepository = new CompanyRentaRepository();
    }

    public MutableLiveData<List<RentInfo>> getMyRentLiveData() {
        return this.resourceMutableLiveData;
    }

    public SingleLiveEvent<Rent> getRentInfoLiveData() {
        return this.rentInfoMutableLiveData;
    }

    public MutableLiveData<Resource<List<TalkingData>>> getTalkingMutableLiveData() {
        return this.talkingMutableLiveData;
    }

    public MutableLiveData<List<String>> getImagesMutableLiveData() {
        return this.imagesMutableLiveData;
    }

    public void getMyRenta() {
        this.rentaRepository.getRentaList().filter($$Lambda$MyRentaViewModel$HmiOCuwSI2Z4s4t0rCGOahQzezA.INSTANCE).map($$Lambda$TYmyI4K1yNGNwZH9WLDfWQ1OnE0.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$getMyRenta$4$MyRentaViewModel((List) obj);
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).startWith(this.localRepository.getData(RentInfo.class).filter($$Lambda$MyRentaViewModel$nlcclJPWZJk7JOA71mMmZl2C3o.INSTANCE).flatMapIterable($$Lambda$MyRentaViewModel$dHhSn2l3e_CrqI1xNjLCUBuFxFM.INSTANCE).cast(RentInfo.class).toList().filter($$Lambda$MyRentaViewModel$7cSCbwfJOX5AwEYkh_KpAECX2fk.INSTANCE).toFlowable()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$getMyRenta$5$MyRentaViewModel((List) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$getMyRenta$0(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    static /* synthetic */ boolean lambda$getMyRenta$2(List list) throws Exception {
        return !list.isEmpty();
    }

    static /* synthetic */ boolean lambda$getMyRenta$3(Resource resource) throws Exception {
        return resource.getData() != null;
    }

    public /* synthetic */ void lambda$getMyRenta$4$MyRentaViewModel(List list) throws Exception {
        this.localRepository.saveDataAsList(list, RentInfo.class, true);
    }

    public /* synthetic */ void lambda$getMyRenta$5$MyRentaViewModel(List list) throws Exception {
        getMyRentLiveData().setValue(list);
    }

    public MutableLiveData<RentInfo> getCurrent() {
        return this.current;
    }

    public void getCurrentPeriod() {
        this.localRepository.getData(RentInfo.class).filter($$Lambda$MyRentaViewModel$yp3pibQuLBsWyxMTC45QuVCB16A.INSTANCE).flatMapIterable($$Lambda$MyRentaViewModel$NjKEHr7qzICTPK5RDS3LN7C6A4.INSTANCE).cast(RentInfo.class).filter(new Predicate() {
            public final boolean test(Object obj) {
                return MyRentaViewModel.lambda$getCurrentPeriod$8(RentInfo.this, (RentInfo) obj);
            }
        }).toList().filter($$Lambda$MyRentaViewModel$gWO5sfocQ0nu_1KUTPQ6KUM1FQE.INSTANCE).toFlowable().subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$getCurrentPeriod$10$MyRentaViewModel((List) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$getCurrentPeriod$6(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    static /* synthetic */ boolean lambda$getCurrentPeriod$8(RentInfo rentInfo, RentInfo rentInfo2) throws Exception {
        return rentInfo2.getPropRenta().getId().intValue() == rentInfo.getPropRenta().getId().intValue();
    }

    static /* synthetic */ boolean lambda$getCurrentPeriod$9(List list) throws Exception {
        return !list.isEmpty();
    }

    public /* synthetic */ void lambda$getCurrentPeriod$10$MyRentaViewModel(List list) throws Exception {
        getRentPeriodsMutableLiveData().setValue(list);
    }

    public MutableLiveData<List<RentInfo>> getRentPeriodsMutableLiveData() {
        return this.rentPeriodsMutableLiveData;
    }

    public void showAvailableRenta() {
        this.rentaRepository.getRentTypeList().filter($$Lambda$MyRentaViewModel$LlFhteveL8m_5tOUuIbCThpkAg8.INSTANCE).map($$Lambda$TYmyI4K1yNGNwZH9WLDfWQ1OnE0.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$showAvailableRenta$15$MyRentaViewModel((List) obj);
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).startWith(this.localRepository.getData(RentType.class).filter($$Lambda$MyRentaViewModel$rITA43CtVvInCAitqz3Sf2NFK18.INSTANCE).flatMapIterable($$Lambda$MyRentaViewModel$X0qSWcqnyZU3xKUesJ6WoHtJrU.INSTANCE).cast(RentType.class).map($$Lambda$MyRentaViewModel$BHrvxaJxD7iXSaQeYyqI7H4sqkI.INSTANCE).distinct($$Lambda$NS0IsSDYdFpP_9hRcBOS_cX6bew.INSTANCE).toList().toFlowable().onErrorReturnItem(new ArrayList())).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$showAvailableRenta$16$MyRentaViewModel((List) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$showAvailableRenta$11(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    static /* synthetic */ boolean lambda$showAvailableRenta$14(Resource resource) throws Exception {
        return resource.getData() != null;
    }

    public /* synthetic */ void lambda$showAvailableRenta$15$MyRentaViewModel(List list) throws Exception {
        this.localRepository.saveDataAsList(list, RentType.class, true);
    }

    public /* synthetic */ void lambda$showAvailableRenta$16$MyRentaViewModel(List list) throws Exception {
        getRentTypeMutableLiveData().setValue(list);
    }

    public MutableLiveData<List<RentType>> getRentTypeMutableLiveData() {
        return this.rentTypeMutableLiveData;
    }

    public void getTalkingRoom(String str, String str2, String str3) {
        this.rentaRepository.getTalkingRoomList(str, str2, str3).filter($$Lambda$MyRentaViewModel$XDGo3WbuYZZvWPyXAsj92e8uyp0.INSTANCE).flatMapIterable($$Lambda$O6XizmHFvqYdGEH4KzC0T7oI2LY.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$getTalkingRoom$18$MyRentaViewModel((TalkingInfo) obj);
            }
        }).map($$Lambda$Wk39SWBLLcqVI949GzA2RiN1sFU.INSTANCE).toList().toFlowable().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$getTalkingRoom$19$MyRentaViewModel((List) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$getTalkingRoom$17(Resource resource) throws Exception {
        return resource.getData() != null;
    }

    public /* synthetic */ void lambda$getTalkingRoom$18$MyRentaViewModel(TalkingInfo talkingInfo) throws Exception {
        this.localRepository.saveDataOrUpdate(talkingInfo);
    }

    public /* synthetic */ void lambda$getTalkingRoom$19$MyRentaViewModel(List list) throws Exception {
        getTalkingMutableLiveData().setValue(Resource.success(0, "", list));
    }

    private void getTimeSlots(String str, String str2) {
        this.rentaRepository.getTimeSlotsList(str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$getTimeSlots$20$MyRentaViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$getTimeSlots$20$MyRentaViewModel(Resource resource) throws Exception {
        this.timeTableSlots.setValue(resource);
    }

    public MutableLiveData<Resource<TimeTableObj>> getTimeSlotsMutableLiveData() {
        return this.timeSlotsMutableLiveData;
    }

    public void createRent(int i, Long l, Long l2) {
        createRent(i, DateUtils.formatDateYYYYMMDD_HH_mm(l.longValue()), DateUtils.formatDateYYYYMMDD_HH_mm(l2.longValue()));
    }

    public void createRent(int i, String str, String str2) {
        this.rentaRepository.creteRent2(i, str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$createRent$21$MyRentaViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$createRent$21$MyRentaViewModel(Resource resource) throws Exception {
        this.talkingRentaMake.setValue(resource);
    }

    public MutableLiveData<Resource<TalkinkRentaObject>> getTalkingRentaMake() {
        return this.talkingRentaMake;
    }

    public void getMyRentaUniqe() {
        this.rentaRepository.getRentaList().filter($$Lambda$MyRentaViewModel$8yze0mkjNqA7FJtjLANEd_uw5y0.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$getMyRentaUniqe$27$MyRentaViewModel((Resource) obj);
            }
        }).flatMapIterable($$Lambda$O6XizmHFvqYdGEH4KzC0T7oI2LY.INSTANCE).map($$Lambda$MyRentaViewModel$t7f4UATfOdKJy46rCZsPCplm9LE.INSTANCE).filter($$Lambda$MyRentaViewModel$PRJYMKrXEG0fnYkL6uxZL4GfmTw.INSTANCE).toList().toFlowable().filter($$Lambda$MyRentaViewModel$UuSXBDb5yB_iAQWjRCTw6nhgrfY.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).startWith(this.localRepository.getData(RentInfo.class).filter($$Lambda$MyRentaViewModel$uYMY0x1EowIEnhwFUs3Xz10qhog.INSTANCE).flatMapIterable($$Lambda$MyRentaViewModel$qyyvDVa_1vQweEPIAXjd9qQ_3vM.INSTANCE).cast(RentInfo.class).map($$Lambda$MyRentaViewModel$ZtR22_FlPgcHznZu3pY6LM_LAI.INSTANCE).filter($$Lambda$MyRentaViewModel$ZqGVBgwjNuvZYRTXKgebmS2mao.INSTANCE).toList().toFlowable().onErrorReturnItem(new ArrayList<RentInfo>() {
        })).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$getMyRentaUniqe$31$MyRentaViewModel((List) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$getMyRentaUniqe$22(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    static /* synthetic */ boolean lambda$getMyRentaUniqe$25(RentInfo rentInfo) throws Exception {
        return rentInfo.getPropRenta() != null && !accomplishmentId.equals(rentInfo.getPropRenta().getId());
    }

    public /* synthetic */ void lambda$getMyRentaUniqe$27$MyRentaViewModel(Resource resource) throws Exception {
        this.localRepository.saveDataAsList((List) resource.getData(), RentInfo.class, true);
    }

    static /* synthetic */ boolean lambda$getMyRentaUniqe$29(RentInfo rentInfo) throws Exception {
        return rentInfo.getPropRenta() != null && !accomplishmentId.equals(rentInfo.getPropRenta().getId());
    }

    static /* synthetic */ boolean lambda$getMyRentaUniqe$30(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    public /* synthetic */ void lambda$getMyRentaUniqe$31$MyRentaViewModel(List list) throws Exception {
        getMyRentLiveData().postValue(list);
    }

    public void getMyRentaUniqeNoFilter() {
        this.rentaRepository.getRentaList().filter($$Lambda$MyRentaViewModel$tDqTiiTJl3znNQgxf7Wi8QjvMJE.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$getMyRentaUniqeNoFilter$37$MyRentaViewModel((Resource) obj);
            }
        }).flatMapIterable($$Lambda$O6XizmHFvqYdGEH4KzC0T7oI2LY.INSTANCE).map($$Lambda$MyRentaViewModel$o3tQ8SLRURbxXnVjzmNcse1_MY0.INSTANCE).filter($$Lambda$MyRentaViewModel$T0WSJU7FfOGAjUm1r3aWAhYS1as.INSTANCE).toList().toFlowable().filter($$Lambda$MyRentaViewModel$PsS5dYh0Ie7J6f2Vl0WHoLqUdsE.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).startWith(this.localRepository.getData(RentInfo.class).filter($$Lambda$MyRentaViewModel$BSg9hsv6i7Ru5Z0zk4rdJ1M47iM.INSTANCE).flatMapIterable($$Lambda$MyRentaViewModel$BOR8OV7xXIgg0kr13dYbq2x3x8U.INSTANCE).cast(RentInfo.class).map($$Lambda$MyRentaViewModel$nJVBF1EZDvU50ybIkzJ143LJAM0.INSTANCE).filter($$Lambda$MyRentaViewModel$kwVr_8JUnFQ_xHnRzmb3jTuXdms.INSTANCE).toList().toFlowable().onErrorReturnItem(new ArrayList<RentInfo>() {
        })).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$getMyRentaUniqeNoFilter$41$MyRentaViewModel((List) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$getMyRentaUniqeNoFilter$32(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    static /* synthetic */ boolean lambda$getMyRentaUniqeNoFilter$35(RentInfo rentInfo) throws Exception {
        return rentInfo.getPropRenta() != null && !accomplishmentId.equals(rentInfo.getPropRenta().getId());
    }

    public /* synthetic */ void lambda$getMyRentaUniqeNoFilter$37$MyRentaViewModel(Resource resource) throws Exception {
        this.localRepository.saveDataAsList((List) resource.getData(), RentInfo.class, true);
    }

    static /* synthetic */ boolean lambda$getMyRentaUniqeNoFilter$39(RentInfo rentInfo) throws Exception {
        return rentInfo.getPropRenta() != null && !accomplishmentId.equals(rentInfo.getPropRenta().getId());
    }

    static /* synthetic */ boolean lambda$getMyRentaUniqeNoFilter$40(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    public /* synthetic */ void lambda$getMyRentaUniqeNoFilter$41$MyRentaViewModel(List list) throws Exception {
        getMyRentLiveData().postValue(list);
    }

    public void getRentById(Integer num) {
        Flowable<U> cast = this.localRepository.getElementById((Class<? extends RealmModel>) Rent.class, num.toString(), "id").filter($$Lambda$MyRentaViewModel$yobShweZ10k9JKmPSmIQTWRSKo.INSTANCE).map($$Lambda$MyRentaViewModel$QrG8YcElIhwh41Zyo5fg5A_m2gU.INSTANCE).cast(Rent.class);
        this.rentaRepository.getRentInfoById(num.intValue()).filter($$Lambda$MyRentaViewModel$rWelURuEmyl15HGTnNne_HPR6Y.INSTANCE).map($$Lambda$MyRentaViewModel$4OXW6lnTnGRqoRDhQrYOqUgrs10.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$getRentById$46$MyRentaViewModel((Rent) obj);
            }
        }).onErrorResumeNext(cast).startWith(cast).doOnSubscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$getRentById$47$MyRentaViewModel((Subscription) obj);
            }
        }).doOnTerminate(new Action() {
            public final void run() {
                MyRentaViewModel.this.lambda$getRentById$48$MyRentaViewModel();
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$getRentById$49$MyRentaViewModel((Rent) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$getRentById$44(Resource resource) throws Exception {
        return resource != null && resource.getStatus().equals(Resource.Status.SUCCESS);
    }

    static /* synthetic */ Rent lambda$getRentById$45(Resource resource) throws Exception {
        return (Rent) resource.getData();
    }

    public /* synthetic */ void lambda$getRentById$46$MyRentaViewModel(Rent rent) throws Exception {
        this.localRepository.saveDataOrUpdate(rent);
    }

    public /* synthetic */ void lambda$getRentById$47$MyRentaViewModel(Subscription subscription) throws Exception {
        getShowLoader().postValue(true);
    }

    public /* synthetic */ void lambda$getRentById$48$MyRentaViewModel() throws Exception {
        getShowLoader().postValue(false);
    }

    public /* synthetic */ void lambda$getRentById$49$MyRentaViewModel(Rent rent) throws Exception {
        getRentInfoLiveData().postValue(rent);
    }

    private Map<Integer, List<RentInfo>> mapTo(List<RentInfo> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (RentInfo next : list) {
            List arrayList = new ArrayList();
            Log.d("TAG", "XXX mapa " + next.getPropRenta().getId());
            if (hashMap.containsKey(next.getPropRenta().getId())) {
                arrayList = (List) hashMap.get(next.getPropRenta().getId());
                arrayList.add(next);
                hashMap.remove(next.getPropRenta().getId());
            } else {
                arrayList.add(next);
            }
            hashMap.put(next.getPropRenta().getId(), arrayList);
        }
        return hashMap;
    }

    public void getMyRentaUniqeAsMap() {
        this.localRepository.getData(RentInfo.class).filter($$Lambda$MyRentaViewModel$03Wl1Cro6FFTo5_VwKH02grusMo.INSTANCE).flatMapIterable($$Lambda$MyRentaViewModel$MDYq1aAlnGt2tCyNFUAsCiZsqQ.INSTANCE).cast(RentInfo.class).toList().toFlowable().map($$Lambda$MyRentaViewModel$hsUqtwS5qxUF42LAqQVxJ1MLch4.INSTANCE).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$getMyRentaUniqeAsMap$53$MyRentaViewModel((Map) obj);
            }
        }, $$Lambda$Jxp4LOjD5wh7hYvpBAWXzgH0LNY.INSTANCE);
    }

    static /* synthetic */ boolean lambda$getMyRentaUniqeAsMap$50(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    static /* synthetic */ Map lambda$getMyRentaUniqeAsMap$52(List list) throws Exception {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RentInfo rentInfo = (RentInfo) it.next();
            List arrayList = new ArrayList();
            if (hashMap.containsKey(rentInfo.getPropRenta().getId())) {
                arrayList = (List) hashMap.get(rentInfo.getPropRenta().getId());
                arrayList.add(rentInfo);
                hashMap.remove(rentInfo.getPropRenta().getId());
            } else {
                arrayList.add(rentInfo);
            }
            hashMap.put(rentInfo.getPropRenta().getId(), arrayList);
        }
        return hashMap;
    }

    public /* synthetic */ void lambda$getMyRentaUniqeAsMap$53$MyRentaViewModel(Map map) throws Exception {
        getMyRentLiveDataAsMap().postValue(map);
    }

    public MutableLiveData<Map<Integer, List<RentInfo>>> getMyRentLiveDataAsMap() {
        return this.resourceMutableLiveDataAsMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: makeAcceptedList */
    public List<RentInfo> lambda$getChooseRentaUniqe$65$MyRentaViewModel(List<RentInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (RentInfo next : list) {
            if (RentaTicketType.getByNumber(next.getStateRenta().getId().toString()) == RentaTicketType.ACCEPTED) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public void getChooseRentaUniqe() {
        this.rentaRepository.getRentaList().filter($$Lambda$MyRentaViewModel$yNuTF1OtagC4CsmNJYaoZp9luYw.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$getChooseRentaUniqe$61$MyRentaViewModel((Resource) obj);
            }
        }).flatMapIterable($$Lambda$O6XizmHFvqYdGEH4KzC0T7oI2LY.INSTANCE).map($$Lambda$MyRentaViewModel$9qijDlWKG9ILiVn52Coy0Ix3ZY.INSTANCE).filter($$Lambda$MyRentaViewModel$RPnQn7VKwBbqpvJIkKI6BfrrGLk.INSTANCE).distinct($$Lambda$MyRentaViewModel$VknWDECcLx72psjMM5TzSRL1HjM.INSTANCE).toList().toFlowable().map(new Function() {
            public final Object apply(Object obj) {
                return MyRentaViewModel.this.lambda$getChooseRentaUniqe$65$MyRentaViewModel((List) obj);
            }
        }).filter($$Lambda$MyRentaViewModel$QYWRMBkY5JhCg36s_xQSq2sdgt0.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).startWith(this.localRepository.getData(RentInfo.class).filter($$Lambda$MyRentaViewModel$y7q98TMOkUBxBk6tPULYPal0FWw.INSTANCE).flatMapIterable($$Lambda$MyRentaViewModel$NIQXpWKrsf2oN0hhvpQZmxFDSE.INSTANCE).cast(RentInfo.class).map($$Lambda$MyRentaViewModel$lgxGPYgeTmhnUftMrBEgfXWQinQ.INSTANCE).filter($$Lambda$MyRentaViewModel$hsvFOlkyp8riVrn17xBIKH8a3TI.INSTANCE).distinct($$Lambda$MyRentaViewModel$oOCgrIozdYbtMPrWtcZboYj3G1s.INSTANCE).toList().toFlowable().map(new Function() {
            public final Object apply(Object obj) {
                return MyRentaViewModel.this.lambda$getChooseRentaUniqe$59$MyRentaViewModel((List) obj);
            }
        }).onErrorReturnItem(new ArrayList<RentInfo>() {
        })).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$getChooseRentaUniqe$67$MyRentaViewModel((List) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$getChooseRentaUniqe$54(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    static /* synthetic */ boolean lambda$getChooseRentaUniqe$57(RentInfo rentInfo) throws Exception {
        return rentInfo.getPropRenta() != null && !accomplishmentId.equals(rentInfo.getPropRenta().getId());
    }

    public /* synthetic */ void lambda$getChooseRentaUniqe$61$MyRentaViewModel(Resource resource) throws Exception {
        this.localRepository.saveDataAsList((List) resource.getData(), RentInfo.class, true);
    }

    static /* synthetic */ boolean lambda$getChooseRentaUniqe$63(RentInfo rentInfo) throws Exception {
        return rentInfo.getPropRenta() != null && !accomplishmentId.equals(rentInfo.getPropRenta().getId());
    }

    static /* synthetic */ boolean lambda$getChooseRentaUniqe$66(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    public /* synthetic */ void lambda$getChooseRentaUniqe$67$MyRentaViewModel(List list) throws Exception {
        getRentInfoUniqueMutableLiveData().postValue(list);
    }

    public void getAccomplishmentChooseRentaUniqe() {
        this.rentaRepository.getRentaList().filter($$Lambda$MyRentaViewModel$LjI5woUwp9hPFgquPp0yvg1z3hg.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$getAccomplishmentChooseRentaUniqe$75$MyRentaViewModel((Resource) obj);
            }
        }).flatMapIterable($$Lambda$O6XizmHFvqYdGEH4KzC0T7oI2LY.INSTANCE).map($$Lambda$MyRentaViewModel$BwJnRd83p88CHza3NSLekB2to.INSTANCE).filter($$Lambda$MyRentaViewModel$9BPHg9MToh7YYKr6OPiD9e_Dc.INSTANCE).distinct($$Lambda$MyRentaViewModel$875EJO4NiqggAZ42wZdX8xDdYzY.INSTANCE).toList().toFlowable().map(new Function() {
            public final Object apply(Object obj) {
                return MyRentaViewModel.this.lambda$getAccomplishmentChooseRentaUniqe$79$MyRentaViewModel((List) obj);
            }
        }).filter($$Lambda$MyRentaViewModel$N4O0cQJmKaLgMF7QArfobRCGoVE.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).startWith(this.localRepository.getData(RentInfo.class).filter($$Lambda$MyRentaViewModel$nK9bM_X6IEnK2gg8K8aN3IHibnc.INSTANCE).flatMapIterable($$Lambda$MyRentaViewModel$MUtEE7RHrleq_tKdAmaOKFdsRFc.INSTANCE).cast(RentInfo.class).map($$Lambda$MyRentaViewModel$CmJfleBnnJkXidB1AzSaZwjqs.INSTANCE).filter($$Lambda$MyRentaViewModel$ZFuhOd3GSTHQwqqFIisfuvy5oc.INSTANCE).distinct($$Lambda$MyRentaViewModel$1EZg1CvV3oWYT7piy1Lc54AxGug.INSTANCE).toList().toFlowable().map(new Function() {
            public final Object apply(Object obj) {
                return MyRentaViewModel.this.lambda$getAccomplishmentChooseRentaUniqe$73$MyRentaViewModel((List) obj);
            }
        }).onErrorReturnItem(new ArrayList<RentInfo>() {
        })).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$getAccomplishmentChooseRentaUniqe$81$MyRentaViewModel((List) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$getAccomplishmentChooseRentaUniqe$68(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    static /* synthetic */ boolean lambda$getAccomplishmentChooseRentaUniqe$71(RentInfo rentInfo) throws Exception {
        return rentInfo.getPropRenta() != null;
    }

    public /* synthetic */ void lambda$getAccomplishmentChooseRentaUniqe$75$MyRentaViewModel(Resource resource) throws Exception {
        this.localRepository.saveDataAsList((List) resource.getData(), RentInfo.class, true);
    }

    static /* synthetic */ boolean lambda$getAccomplishmentChooseRentaUniqe$77(RentInfo rentInfo) throws Exception {
        return rentInfo.getPropRenta() != null;
    }

    static /* synthetic */ boolean lambda$getAccomplishmentChooseRentaUniqe$80(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    public /* synthetic */ void lambda$getAccomplishmentChooseRentaUniqe$81$MyRentaViewModel(List list) throws Exception {
        getAccomplishmentInfoUniqueMutableLiveData().postValue(list);
    }

    public MutableLiveData<List<RentInfo>> getRentInfoUniqueMutableLiveData() {
        return this.rentInfoUniqueMutableLiveData;
    }

    public MutableLiveData<List<RentInfo>> getAccomplishmentInfoUniqueMutableLiveData() {
        return this.rentAccomplishmentInfoUniqueMutableLiveData;
    }

    public void delete(Integer num) {
        RentInfo value = getCurrent().getValue();
        this.rentaRepository.deleteRents(num).onErrorComplete().andThen(this.rentaRepository.getRentaList()).filter($$Lambda$MyRentaViewModel$RyIaut7HmZELxG4jcVtYCCXa5kA.INSTANCE).map($$Lambda$TYmyI4K1yNGNwZH9WLDfWQ1OnE0.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$delete$83$MyRentaViewModel((List) obj);
            }
        }).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$delete$84$MyRentaViewModel((List) obj);
            }
        }).flatMapIterable($$Lambda$MyRentaViewModel$tJky1hAy47SRFKinP2Q4K3CICTw.INSTANCE).cast(RentInfo.class).toList().toFlowable().subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$delete$86$MyRentaViewModel((List) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$delete$82(Resource resource) throws Exception {
        return resource.getData() != null;
    }

    public /* synthetic */ void lambda$delete$83$MyRentaViewModel(List list) throws Exception {
        this.localRepository.saveDataAsList(list, RentInfo.class, true);
    }

    public /* synthetic */ void lambda$delete$84$MyRentaViewModel(List list) throws Exception {
        getMyRentaUniqe();
    }

    public /* synthetic */ void lambda$delete$86$MyRentaViewModel(List list) throws Exception {
        getRentPeriodsMutableLiveData().postValue(list);
    }

    public void getRentaInfoAttributes(Integer num) {
        Flowable.merge(this.localRepository.getData(TalkingInfo.class).filter($$Lambda$MyRentaViewModel$yRtOdKwU3WTHCgoIUNlZSBJuENU.INSTANCE).flatMapIterable($$Lambda$MyRentaViewModel$CE7ELDOr2TFvFGKNZ5PEumSynIA.INSTANCE).cast(TalkingInfo.class).filter(new Predicate(num) {
            private final /* synthetic */ Integer f$0;

            {
                this.f$0 = r1;
            }

            public final boolean test(Object obj) {
                return MyRentaViewModel.lambda$getRentaInfoAttributes$89(this.f$0, (TalkingInfo) obj);
            }
        }).firstElement().toFlowable().filter($$Lambda$MyRentaViewModel$yoJZpvxmDPIc21hcn6AGtOpXAfU.INSTANCE).flatMapIterable($$Lambda$MyRentaViewModel$t6nP0joT3WPLvg65nP0VbpJ8Iec.INSTANCE).map($$Lambda$MyRentaViewModel$BimvB6ynkTVTGEe5LtY_0g76b_o.INSTANCE).toList().map($$Lambda$MyRentaViewModel$kJMkDBaBuULRBJuFUoxjU1gbYNY.INSTANCE).toFlowable(), this.rentaRepository.getRentInfoById(num.intValue()).filter($$Lambda$MyRentaViewModel$VZzIRQflBVjBkQxHCSRZwrz_JbA.INSTANCE).filter($$Lambda$MyRentaViewModel$8E5yXj7ZSkZ6ysHSwBbVhebUGCo.INSTANCE).map($$Lambda$MyRentaViewModel$mLdmGo48HVj2p4Z8mgfVlUdSDJk.INSTANCE).filter(new Predicate(num) {
            private final /* synthetic */ Integer f$0;

            {
                this.f$0 = r1;
            }

            public final boolean test(Object obj) {
                return MyRentaViewModel.lambda$getRentaInfoAttributes$97(this.f$0, (Rent) obj);
            }
        }).flatMapIterable($$Lambda$MyRentaViewModel$V2Dt1pdiyTC6JTr6C2haux6scbM.INSTANCE).map($$Lambda$MyRentaViewModel$yq9gnQwiNPMmk5YveLEf_ZcRqM.INSTANCE).toList().map($$Lambda$MyRentaViewModel$44RXS4qoOuDWa_ss_agLIbjmRY.INSTANCE).toFlowable()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$getRentaInfoAttributes$101$MyRentaViewModel((ArrayList) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$getRentaInfoAttributes$89(Integer num, TalkingInfo talkingInfo) throws Exception {
        return talkingInfo.getId() == num.intValue();
    }

    static /* synthetic */ boolean lambda$getRentaInfoAttributes$90(TalkingInfo talkingInfo) throws Exception {
        return talkingInfo.getRentAttributes() != null && !talkingInfo.getRentAttributes().isEmpty();
    }

    static /* synthetic */ IKeyValueDataImpl lambda$getRentaInfoAttributes$92(RentAttributes rentAttributes) throws Exception {
        String title = rentAttributes.getTitle();
        boolean equals = rentAttributes.getValue().equals("boolean");
        String value = rentAttributes.getValue();
        if (equals) {
            value = value.equals("false") ? "нет" : "да";
        }
        return new IKeyValueDataImpl(title, value);
    }

    static /* synthetic */ ArrayList lambda$getRentaInfoAttributes$93(List list) throws Exception {
        return new ArrayList(list);
    }

    static /* synthetic */ Rent lambda$getRentaInfoAttributes$96(Resource resource) throws Exception {
        return (Rent) resource.getData();
    }

    static /* synthetic */ boolean lambda$getRentaInfoAttributes$97(Integer num, Rent rent) throws Exception {
        return rent.getId() == num.toString();
    }

    static /* synthetic */ IKeyValueDataImpl lambda$getRentaInfoAttributes$99(RentAttributes rentAttributes) throws Exception {
        String title = rentAttributes.getTitle();
        boolean equals = rentAttributes.getValue().equals("boolean");
        String value = rentAttributes.getValue();
        if (equals) {
            value = value.equals("false") ? "нет" : "да";
        }
        return new IKeyValueDataImpl(title, value);
    }

    static /* synthetic */ ArrayList lambda$getRentaInfoAttributes$100(List list) throws Exception {
        return new ArrayList(list);
    }

    public /* synthetic */ void lambda$getRentaInfoAttributes$101$MyRentaViewModel(ArrayList arrayList) throws Exception {
        getTalkingInfoMutableLiveData().postValue(arrayList);
    }

    public MutableLiveData<List<IKeyValueData>> getTalkingInfoMutableLiveData() {
        return this.talkingInfoMutableLiveData;
    }

    public void getPermisionsForRentById(int i, boolean z) {
        this.rentaRepository.getRentInfoById(i).filter($$Lambda$MyRentaViewModel$UXSDmvDOJcOrZTNWJ2NB7hCDNyQ.INSTANCE).filter($$Lambda$MyRentaViewModel$PiJupJYdIXSjUEqht3xLX0McUc.INSTANCE).doOnNext($$Lambda$MyRentaViewModel$iOATMpsXl7omm3r5gYrMBVGtsL4.INSTANCE).map($$Lambda$MyRentaViewModel$rnsNIHChEM8TgNBB0aVESKaayVU.INSTANCE).zipWith(getEnterpriseWithEmployers(), $$Lambda$MyRentaViewModel$RQNgL8blrwwvrjwlLc066gf8pLU.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$getPermisionsForRentById$107$MyRentaViewModel((Pair) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$getPermisionsForRentById$103(Resource resource) throws Exception {
        return resource.getData() != null;
    }

    static /* synthetic */ Rent lambda$getPermisionsForRentById$105(Resource resource) throws Exception {
        return (Rent) resource.getData();
    }

    static /* synthetic */ Pair lambda$getPermisionsForRentById$106(Rent rent, CompanyList companyList) throws Exception {
        return new Pair(rent, companyList);
    }

    public /* synthetic */ void lambda$getPermisionsForRentById$107$MyRentaViewModel(Pair pair) throws Exception {
        getRentaInfoMutableLiveData().postValue(pair);
    }

    private List<UserProfile> createData(RealmList<Renters> realmList, List<UserProfile> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < realmList.size(); i++) {
            Log.d("TAG", "XXX 1 1 1 +  " + realmList.get(i).getUserdataId());
            for (int i2 = 0; i2 < list.size(); i2++) {
                Log.d("TAG", "XXX 1 1 1 1 +  " + list.get(i2).getUserdata().getId());
                if (list.get(i2).getUserdata().getId().equals(realmList.get(i).getUserdataId())) {
                    Log.d("TAG", "XXX 1 1 1 1 name +  " + list.get(i2).getUserdata().getFullname());
                    arrayList.add(list.get(i2));
                }
            }
        }
        Log.d("TAG", "XXX 1 1 1 1 1 +  " + arrayList.toString());
        return arrayList;
    }

    public MutableLiveData<Pair<Rent, CompanyList>> getRentaInfoMutableLiveData() {
        return this.rentaInfoMutableLiveData;
    }

    public Flowable<List<UserProfile>> getAllUsers() {
        return this.localRepository.getData(UserProfile.class).filter($$Lambda$MyRentaViewModel$UhG2sXvzg4TgNJaUwnXO3oGLvY.INSTANCE).flatMapIterable($$Lambda$MyRentaViewModel$661CgJCt_nYeJXEY8T2a27DJ5l8.INSTANCE).cast(UserProfile.class).toList().filter($$Lambda$MyRentaViewModel$5SvIJZk3pa9U5oCZsNfROBkxPJk.INSTANCE).map($$Lambda$MyRentaViewModel$_hHbRATKAujF65hCk9H8hHZvskY.INSTANCE).toFlowable();
    }

    public MutableLiveData<TalkingData> getCurrentCowork() {
        return this.currentCowork;
    }

    public MutableLiveData<Set<RentChildren>> getChoosenRentChildren() {
        return this.choosenRentChildren;
    }

    public MutableLiveData<Integer> getCurrentDay() {
        return this.currentDay;
    }

    public void managePErmission(List<Renters> list) {
        this.rentaRepository.managePermission(list).subscribeOn(Schedulers.m6765io()).subscribe();
    }

    public Flowable<CompanyList> getEnterpriseWithEmployers() {
        return this.rentaRepository.getData().filter($$Lambda$MyRentaViewModel$V7S25vaBaaltNDH9MJDv_4tsxlg.INSTANCE).map($$Lambda$MyRentaViewModel$ZtqVHm_yVp5AdTK9CgGJ5D_Pc7I.INSTANCE).map($$Lambda$MyRentaViewModel$hUf8kQLPa2ZkypmTa3wKOsEij88.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    static /* synthetic */ boolean lambda$getEnterpriseWithEmployers$112(Resource resource) throws Exception {
        return resource.getData() != null && resource.getStatus().equals(Resource.Status.SUCCESS);
    }

    static /* synthetic */ Resource lambda$getEnterpriseWithEmployers$113(Resource resource) throws Exception {
        if (resource.getStatus().equals(Resource.Status.SUCCESS) && resource.getData() != null) {
            List<RentCompany> rentCompany = ((CompanyList) resource.getData()).getRentCompany();
            for (int i = 0; i < rentCompany.size(); i++) {
                rentCompany.get(i).getUserProfiles().add(0, new UserProfile());
            }
        }
        return resource;
    }

    static /* synthetic */ CompanyList lambda$getEnterpriseWithEmployers$114(Resource resource) throws Exception {
        return (CompanyList) resource.getData();
    }

    public MutableLiveData<Resource<CompanyList>> getEnterpriseWithEmployersLiveData() {
        return this.enterpriseWithEmployersLiveData;
    }

    public void onDateChange(int i, int i2) {
        Calendar instance = Calendar.getInstance();
        instance.add(6, i2);
        getTimeSlots(String.valueOf(i), DateUtils.formatDateYYYYMMDD(instance.getTime()));
    }

    public void onDateChange(int i, Calendar calendar) {
        Calendar instance = Calendar.getInstance();
        long days = TimeUnit.MILLISECONDS.toDays(Math.abs(calendar.getTimeInMillis() - instance.getTimeInMillis()));
        Log.d("TAG", "XXX differesePerDay 1 " + days);
        getCurrentDay().setValue(Integer.valueOf((int) days));
    }

    public void getAvailableProperties() {
        this.rentaRepository.getAvailableProperties().doOnNext(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$getAvailableProperties$118$MyRentaViewModel((Resource) obj);
            }
        }).flatMapIterable($$Lambda$O6XizmHFvqYdGEH4KzC0T7oI2LY.INSTANCE).toList().toFlowable().map(new Function() {
            public final Object apply(Object obj) {
                return MyRentaViewModel.this.lambda$getAvailableProperties$119$MyRentaViewModel((List) obj);
            }
        }).filter($$Lambda$MyRentaViewModel$ddzMBOO9RkJaoy6u6Cs7vkLuwkI.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).startWith(this.localRepository.getData(TicketPropertyObject.class).filter($$Lambda$MyRentaViewModel$WU5jnlaGZsGPxN64kH5Qa2ybjmM.INSTANCE).flatMapIterable($$Lambda$MyRentaViewModel$vKrKPAdF45CrnXBmedaIhyn_UY.INSTANCE).cast(TicketPropertyObject.class).toList().map(new Function() {
            public final Object apply(Object obj) {
                return MyRentaViewModel.this.lambda$getAvailableProperties$117$MyRentaViewModel((List) obj);
            }
        }).toFlowable()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaViewModel.this.lambda$getAvailableProperties$121$MyRentaViewModel((ArrayList) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$getAvailableProperties$115(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    public /* synthetic */ void lambda$getAvailableProperties$118$MyRentaViewModel(Resource resource) throws Exception {
        if (resource.getData() != null) {
            this.localRepository.saveDataAsList((List) resource.getData(), TicketPropertyObject.class, true);
        }
    }

    static /* synthetic */ boolean lambda$getAvailableProperties$120(ArrayList arrayList) throws Exception {
        return !arrayList.isEmpty();
    }

    public /* synthetic */ void lambda$getAvailableProperties$121$MyRentaViewModel(ArrayList arrayList) throws Exception {
        getTicketPropertyObjectMutableLiveData().setValue(arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: makeKeyValueList */
    public ArrayList<IKeyValueData> lambda$getAvailableProperties$119$MyRentaViewModel(List<TicketPropertyObject> list) {
        ArrayList<IKeyValueData> arrayList = new ArrayList<>();
        for (TicketPropertyObject next : list) {
            if (next.getId() != null) {
                arrayList.add(new IKeyValueDataImpl(next.getId().toString(), next.getTitle()));
            }
        }
        return arrayList;
    }

    public MutableLiveData<ArrayList<IKeyValueData>> getTicketPropertyObjectMutableLiveData() {
        return this.ticketPropertyObjectMutableLiveData;
    }
}
