package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart;

import android.util.Log;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.reactivestreams.Publisher;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;
import p035ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.ScenarioList;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.DeviceRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.Devices;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section.Icon;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section.MoreIconsInfo;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.Flowable;
import p046io.reactivex.Notification;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.disposables.CompositeDisposable;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.schedulers.Schedulers;
import p046io.realm.RealmModel;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.MainSmartViewModel */
public class MainSmartViewModel extends BaseViewModel {
    private SingleLiveEvent<Resource<ScenarioList>> activateSingleEvent = new SingleLiveEvent<>();
    private MutableLiveData<Integer> activeScenarioChild = new MutableLiveData<>();
    private MutableLiveData<Integer> activeScenarioParent = new MutableLiveData<>();
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private MutableLiveData<Integer> currentId = new MutableLiveData<>();
    private MutableLiveData<String> deviceFilterName = new MutableLiveData<>();
    private DeviceRepository deviceRepository = new DeviceRepository();
    private MediatorLiveData<List<MoreIconsInfo>> errorList = new MediatorLiveData<>();
    private MutableLiveData<List<MoreIconsInfo>> errorNotification = new MutableLiveData<>();
    private MediatorLiveData<String> filter = new MediatorLiveData<>();
    private LiveData<List<Hardware>> filterData;
    private SingleLiveEvent<Resource<List<Hardware>>> getHardwareResourceSingleEvent = new SingleLiveEvent<>();
    private SingleLiveEvent<List<Hardware>> getHardwareSingleEvent = new SingleLiveEvent<>();
    private MutableLiveData<List<Hardware>> hardwareMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<Intellect> intellectMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<Boolean> isActiveWifi = new MutableLiveData<>();
    private LocalRepository localRepository = LocalRepository.getInstance();
    private MutableLiveData<List<Device>> mutableScan = new MutableLiveData<>();
    private RemoteRepository remoteRepository = new RemoteRepository();
    private MutableLiveData<String> roomFilter = new MutableLiveData<>();
    private MutableLiveData<List<Rooms>> roomsMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<List<Scenario>> scenarioMutableData = new MutableLiveData<>();

    static /* synthetic */ void lambda$getIcons$29(List list) throws Exception {
    }

    static /* synthetic */ List lambda$getRooms$18(List list) throws Exception {
        return list;
    }

    static /* synthetic */ Iterable lambda$null$22(List list) throws Exception {
        return list;
    }

    static /* synthetic */ Iterable lambda$null$24(List list) throws Exception {
        return list;
    }

    static /* synthetic */ Iterable lambda$null$36(Set set) throws Exception {
        return set;
    }

    public MainSmartViewModel() {
        getIntellect();
        getRooms();
        getHardware();
        if (this.deviceFilterName.getValue() == null) {
            this.deviceFilterName.setValue(Hardware.ALL);
        }
        if (this.roomFilter.getValue() == null) {
            this.roomFilter.setValue(Rooms.ALL_ROOM);
        }
        this.filter.addSource(this.deviceFilterName, new Observer() {
            public final void onChanged(Object obj) {
                MainSmartViewModel.this.lambda$new$0$MainSmartViewModel((String) obj);
            }
        });
        this.filter.addSource(this.roomFilter, new Observer() {
            public final void onChanged(Object obj) {
                MainSmartViewModel.this.lambda$new$1$MainSmartViewModel((String) obj);
            }
        });
        this.filterData = Transformations.switchMap(this.filter, new Function() {
            public final Object apply(Object obj) {
                return MainSmartViewModel.this.lambda$new$2$MainSmartViewModel((String) obj);
            }
        });
        this.errorList.addSource(getErrorNotification(), new Observer() {
            public final void onChanged(Object obj) {
                MainSmartViewModel.this.lambda$new$3$MainSmartViewModel((List) obj);
            }
        });
        this.errorList.addSource(getIcons(), new Observer() {
            public final void onChanged(Object obj) {
                MainSmartViewModel.this.lambda$new$4$MainSmartViewModel((List) obj);
            }
        });
        this.currentId.setValue(-1);
    }

    public /* synthetic */ void lambda$new$0$MainSmartViewModel(String str) {
        this.filter.setValue(str);
    }

    public /* synthetic */ void lambda$new$1$MainSmartViewModel(String str) {
        this.filter.setValue(str);
    }

    public /* synthetic */ LiveData lambda$new$2$MainSmartViewModel(String str) {
        return LiveDataReactiveStreams.fromPublisher(this.localRepository.getHardwareByRoomId(this.roomFilter.getValue(), this.deviceFilterName.getValue()));
    }

    public /* synthetic */ void lambda$new$3$MainSmartViewModel(List list) {
        this.errorList.setValue(list);
    }

    public /* synthetic */ void lambda$new$4$MainSmartViewModel(List list) {
        this.errorList.setValue(list);
    }

    public void getScenario() {
        this.compositeDisposable.add(this.remoteRepository.getScanarioFlowable().filter($$Lambda$MainSmartViewModel$Lq0ZwLpLUuSdXeSlUKNxzMQB4.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                MainSmartViewModel.this.lambda$getScenario$6$MainSmartViewModel((Resource) obj);
            }
        }).map($$Lambda$MainSmartViewModel$l6YYIhc0t5edWcyUBgcQog6hSaE.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).onErrorResumeNext(this.localRepository.getScenario()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MainSmartViewModel.this.lambda$getScenario$8$MainSmartViewModel((List) obj);
            }
        }));
    }

    static /* synthetic */ boolean lambda$getScenario$5(Resource resource) throws Exception {
        return resource != null && resource.getStatus().equals(Resource.Status.SUCCESS);
    }

    public /* synthetic */ void lambda$getScenario$6$MainSmartViewModel(Resource resource) throws Exception {
        this.localRepository.saveDataAsList(((ScenarioList) resource.getData()).getScenarioList(), Scenario.class, true);
    }

    public /* synthetic */ void lambda$getScenario$8$MainSmartViewModel(List list) throws Exception {
        getScenarioMutableData().postValue(list);
    }

    private Flowable<List<? extends RealmModel>> getScenarioLocal() {
        return this.localRepository.getData(Scenario.class);
    }

    public void getIntellect() {
        this.remoteRepository.getIntellect().filter($$Lambda$MainSmartViewModel$qPiivOG4UHnXYeiX3AtnO88sEE.INSTANCE).map($$Lambda$JuMtECbWAXQg7orqU6kfn7Gn3us.INSTANCE).onErrorReturnItem(new Intellect(1, 1)).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MainSmartViewModel.this.lambda$getIntellect$10$MainSmartViewModel((Intellect) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$getIntellect$9(Resource resource) throws Exception {
        return resource != null && resource.getStatus().equals(Resource.Status.SUCCESS);
    }

    public /* synthetic */ void lambda$getIntellect$10$MainSmartViewModel(Intellect intellect) throws Exception {
        getIntellectMutableLiveData().postValue(intellect);
    }

    public MutableLiveData<Intellect> getIntellectMutableLiveData() {
        return this.intellectMutableLiveData;
    }

    public void getHardware() {
        this.compositeDisposable.add(this.deviceRepository.getHardware().filter($$Lambda$MainSmartViewModel$TrTypFlyxksqkWnHOlW4T2hsT98.INSTANCE).map($$Lambda$TYmyI4K1yNGNwZH9WLDfWQ1OnE0.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                MainSmartViewModel.this.lambda$getHardware$13$MainSmartViewModel((List) obj);
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).startWith(this.localRepository.getHardwareFlowable().filter($$Lambda$MainSmartViewModel$3o16X2x9ez3TW040sfix3E0M0cw.INSTANCE).subscribeOn(Schedulers.m6765io())).onErrorReturnItem(new ArrayList()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MainSmartViewModel.this.lambda$getHardware$14$MainSmartViewModel((List) obj);
            }
        }));
    }

    static /* synthetic */ boolean lambda$getHardware$11(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    static /* synthetic */ boolean lambda$getHardware$12(Resource resource) throws Exception {
        return resource.getStatus().equals(Resource.Status.SUCCESS) && resource.getData() != null;
    }

    public /* synthetic */ void lambda$getHardware$13$MainSmartViewModel(List list) throws Exception {
        this.localRepository.saveDataAsList(list, Hardware.class, false);
    }

    public /* synthetic */ void lambda$getHardware$14$MainSmartViewModel(List list) throws Exception {
        getHardwareMutableLiveData().postValue(list);
    }

    public void getRooms() {
        this.remoteRepository.getRooms().filter($$Lambda$MainSmartViewModel$C413L9IsPu3jotpox_mnmxc4kyc.INSTANCE).map($$Lambda$MainSmartViewModel$jnV8i4Gf1P9AtlMjCZv0KGz6uQ.INSTANCE).startWith(this.localRepository.getData(Rooms.class).filter($$Lambda$MainSmartViewModel$uA_E4x6m1YjUmkJku9g6uEv_0.INSTANCE).map($$Lambda$MainSmartViewModel$YK229zQbSU0fArH8pAu3SxW5fJc.INSTANCE)).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                MainSmartViewModel.this.lambda$getRooms$19$MainSmartViewModel((List) obj);
            }
        }).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MainSmartViewModel.this.lambda$getRooms$20$MainSmartViewModel((List) obj);
            }
        });
    }

    static /* synthetic */ List lambda$getRooms$16(Resource resource) throws Exception {
        if (resource.getData() != null) {
            return ((Room) resource.getData()).getList();
        }
        return new ArrayList();
    }

    static /* synthetic */ boolean lambda$getRooms$17(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    public /* synthetic */ void lambda$getRooms$19$MainSmartViewModel(List list) throws Exception {
        this.localRepository.saveDataAsList(list, Rooms.class, true);
    }

    public /* synthetic */ void lambda$getRooms$20$MainSmartViewModel(List list) throws Exception {
        getRoomsMutableLiveData().postValue(list);
    }

    public MutableLiveData<List<Rooms>> getRoomsMutableLiveData() {
        return this.roomsMutableLiveData;
    }

    public LiveData<List<MoreIconsInfo>> getIcons() {
        Flowable<T2> dematerialize = this.remoteRepository.getIcons().map($$Lambda$MainSmartViewModel$RIatDmXaxJTzK6aKGJAhk8L9ZI.INSTANCE).flatMap($$Lambda$MainSmartViewModel$ryupbMBLndMBStc9awxoNdlGV8.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                MainSmartViewModel.this.lambda$getIcons$26$MainSmartViewModel((List) obj);
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).materialize().filter($$Lambda$MainSmartViewModel$sV49UM2x469LGumCEE9EUJdYsWo.INSTANCE).dematerialize();
        return LiveDataReactiveStreams.fromPublisher(Flowable.concatArrayEager(this.localRepository.getIcons().filter($$Lambda$MainSmartViewModel$2oBF_TRTXE50n27iMxuOAZWDk.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).doOnNext($$Lambda$MainSmartViewModel$V_oAXMarSbiK5YdszvhRb1TROQ.INSTANCE), dematerialize).cache().distinctUntilChanged());
    }

    static /* synthetic */ boolean lambda$null$23(Icon icon) throws Exception {
        return icon.getMore() != null && !icon.getMore().isEmpty();
    }

    public /* synthetic */ void lambda$getIcons$26$MainSmartViewModel(List list) throws Exception {
        this.localRepository.saveDataAsList(list, MoreIconsInfo.class, true);
    }

    static /* synthetic */ boolean lambda$getIcons$27(Notification notification) throws Exception {
        return !notification.isOnError();
    }

    static /* synthetic */ boolean lambda$getIcons$28(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    public void activateScenario(int i, int i2) {
        this.compositeDisposable.add(this.remoteRepository.sendActiveScenario(i, i2).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                MainSmartViewModel.this.lambda$activateScenario$30$MainSmartViewModel((Resource) obj);
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MainSmartViewModel.this.lambda$activateScenario$31$MainSmartViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$activateScenario$30$MainSmartViewModel(Resource resource) throws Exception {
        if (resource.getStatus().equals(Resource.Status.SUCCESS) && ((ScenarioList) resource.getData()).getScenarioList() != null) {
            this.localRepository.saveDataAsList(((ScenarioList) resource.getData()).getScenarioList(), Scenario.class, true);
        }
    }

    public /* synthetic */ void lambda$activateScenario$31$MainSmartViewModel(Resource resource) throws Exception {
        this.activateSingleEvent.setValue(resource);
    }

    public LiveData<Resource<ScenarioList>> getActivateSingleEvent() {
        return this.activateSingleEvent;
    }

    public void sendCommand(Device device, boolean z) {
        List<Devices> deviceTokenById = this.localRepository.getDeviceTokenById(device.getId());
        if (deviceTokenById != null) {
            device.setToken(deviceTokenById.get(0).getDeviceToken());
            this.compositeDisposable.add(this.deviceRepository.sendCommand(device, z).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe());
        }
    }

    public SingleLiveEvent<List<Hardware>> getGetHardwareSingleEvent() {
        return this.getHardwareSingleEvent;
    }

    public SingleLiveEvent<Resource<List<Hardware>>> getGetHardwareResourceSingleEvent() {
        return this.getHardwareResourceSingleEvent;
    }

    public MutableLiveData<Integer> getCurrentId() {
        return this.currentId;
    }

    public MutableLiveData<String> getRoomFilterName() {
        return this.roomFilter;
    }

    public MutableLiveData<String> getHasActiveFilter() {
        return this.deviceFilterName;
    }

    public void getHardwareFlowableLocally() {
        this.compositeDisposable.add(this.localRepository.getHardwareFlowable().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MainSmartViewModel.this.lambda$getHardwareFlowableLocally$32$MainSmartViewModel((List) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$getHardwareFlowableLocally$32$MainSmartViewModel(List list) throws Exception {
        getGetHardwareSingleEvent().postValue(list);
    }

    public LiveData<List<Hardware>> getHardwareLocally() {
        return LiveDataReactiveStreams.fromPublisher(this.localRepository.getHardware().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()));
    }

    public LiveData<List<Hardware>> getFilterData() {
        return this.filterData;
    }

    public void scan(InetAddress inetAddress, boolean z) {
        this.compositeDisposable.add(this.deviceRepository.scan(inetAddress, z, this.localRepository).onErrorResumeNext(Flowable.empty()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MainSmartViewModel.this.lambda$scan$33$MainSmartViewModel((List) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$scan$33$MainSmartViewModel(List list) throws Exception {
        getMutableScan().postValue(list);
    }

    public MutableLiveData<List<Device>> getMutableScan() {
        return this.mutableScan;
    }

    public MutableLiveData<Boolean> getIsActiveWifi() {
        return this.isActiveWifi;
    }

    public MutableLiveData<Integer> getActiveScenarioParent() {
        return this.activeScenarioParent;
    }

    public MutableLiveData<Integer> getActiveScenarioChild() {
        return this.activeScenarioChild;
    }

    public MediatorLiveData<List<MoreIconsInfo>> getErrorList() {
        return this.errorList;
    }

    public MutableLiveData<List<MoreIconsInfo>> getErrorNotification() {
        return this.errorNotification;
    }

    public void filterDeviceByAvailabilityScenario(List<Device> list, int i) {
        this.localRepository.getHardwareWithLocalScenarioControl().map(new p046io.reactivex.functions.Function(list) {
            private final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final Object apply(Object obj) {
                return MainSmartViewModel.lambda$filterDeviceByAvailabilityScenario$34(this.f$0, (List) obj);
            }
        }).filter($$Lambda$MainSmartViewModel$YFsprIKYyXMAhUsrHrM9kqkEvPc.INSTANCE).flatMap(new p046io.reactivex.functions.Function(i) {
            private final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return MainSmartViewModel.this.lambda$filterDeviceByAvailabilityScenario$38$MainSmartViewModel(this.f$1, (Set) obj);
            }
        }).subscribeOn(Schedulers.m6765io()).subscribe();
    }

    static /* synthetic */ Set lambda$filterDeviceByAvailabilityScenario$34(List list, List list2) throws Exception {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            Log.d("TAG", "XXX dev i = " + ((Device) list.get(i)).getId());
            for (int i2 = 0; i2 < list2.size(); i2++) {
                Log.d("TAG", "XXX dev j = " + ((Hardware) list2.get(i2)).getGuid());
                if (((Device) list.get(i)).getId().toString().equals(((Hardware) list2.get(i2)).getGuid())) {
                    Log.d("TAG", "XXX dev res  j = " + ((Hardware) list2.get(i2)).getGuid() + " " + list.get(i));
                    ((Device) list.get(i)).setToken(((Hardware) list2.get(i2)).getToken());
                    hashSet.add(list.get(i));
                }
            }
        }
        Log.d("TAG", "XXX  filterDeviceByAvailabilityScenario " + hashSet.size());
        return hashSet;
    }

    static /* synthetic */ boolean lambda$filterDeviceByAvailabilityScenario$35(Set set) throws Exception {
        return !set.isEmpty();
    }

    public /* synthetic */ Publisher lambda$filterDeviceByAvailabilityScenario$38$MainSmartViewModel(int i, Set set) throws Exception {
        return Flowable.fromArray(set).flatMapIterable($$Lambda$MainSmartViewModel$m7r_dU4iT1vaP8wx3LIaL1bGCCo.INSTANCE).flatMap(new p046io.reactivex.functions.Function(i) {
            private final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return MainSmartViewModel.this.lambda$null$37$MainSmartViewModel(this.f$1, (Device) obj);
            }
        });
    }

    public /* synthetic */ Publisher lambda$null$37$MainSmartViewModel(int i, Device device) throws Exception {
        Log.d("TAG", "XXX XXX  filterDeviceByAvailabilityScenario X " + device.getId());
        device.setName("scen");
        device.setIpAdress(device.getIpAdress());
        device.setValue(i);
        return this.deviceRepository.sendLocally(device);
    }

    public MutableLiveData<List<Scenario>> getScenarioMutableData() {
        return this.scenarioMutableData;
    }

    public MutableLiveData<List<Hardware>> getHardwareMutableLiveData() {
        return this.hardwareMutableLiveData;
    }

    public InetAddress getIp(Device device) {
        try {
            return InetAddress.getByName(device.getIpAdress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }
}
