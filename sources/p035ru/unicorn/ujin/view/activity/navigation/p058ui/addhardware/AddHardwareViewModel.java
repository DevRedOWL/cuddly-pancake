package p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.List;
import org.reactivestreams.Publisher;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.api.DeviceModel;
import p035ru.unicorn.ujin.view.activity.navigation.api.SerialNumber;
import p035ru.unicorn.ujin.view.activity.navigation.api.SignalSettings;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create.CreateDeviceLocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create.CreateDeviceRemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms;
import p035ru.unicorn.ujin.view.activity.navigation.repository.SignalCode;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.Flowable;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.disposables.CompositeDisposable;
import p046io.reactivex.functions.BiFunction;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.functions.Function;
import p046io.reactivex.schedulers.Schedulers;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.AddHardwareViewModel */
public class AddHardwareViewModel extends ViewModel {
    private SingleLiveEvent<Resource<List<DeviceModel>>> activateSingleEvent = new SingleLiveEvent<>();
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private MutableLiveData<String> currentDeviceName = new MutableLiveData<>();
    MutableLiveData<Rooms> currentRoom = new MutableLiveData<>();
    private CreateDeviceLocalRepository localRepository = CreateDeviceLocalRepository.getInstance();
    private CreateDeviceRemoteRepository remoteRepository = new CreateDeviceRemoteRepository();
    private SingleLiveEvent<List<Rooms>> roomSingleEvent = new SingleLiveEvent<>();
    private MutableLiveData<String> serialNumber = new MutableLiveData<>();
    private SingleLiveEvent<Resource<SignalSettings>> singleLiveEventAddHardware = new SingleLiveEvent<>();
    private SingleLiveEvent<List<Rooms>> singleLiveEventAddRoom = new SingleLiveEvent<>();
    private SingleLiveEvent<Resource<Void>> singleLiveEventDeleteHardware = new SingleLiveEvent<>();
    private SingleLiveEvent<Resource<SignalCode>> singleLiveEventSigmnalCOde = new SingleLiveEvent<>();
    private MediatorLiveData<Integer> stage = new MediatorLiveData<>();

    static /* synthetic */ Publisher lambda$addHardware$11(Flowable flowable) throws Exception {
        return flowable;
    }

    public AddHardwareViewModel() {
        this.stage.setValue(-1);
        this.currentRoom.setValue(new Rooms(0, Rooms.NO_ROOM));
    }

    public LiveData<Resource<List<ClassDevice>>> getListHardware() {
        return LiveDataReactiveStreams.fromPublisher(this.remoteRepository.getClassDevice());
    }

    public void getDeviceModel(String str) {
        this.remoteRepository.getDeviceModel(str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                AddHardwareViewModel.this.lambda$getDeviceModel$0$AddHardwareViewModel((Resource) obj);
            }
        }).subscribe(new Consumer() {
            public final void accept(Object obj) {
                AddHardwareViewModel.this.lambda$getDeviceModel$1$AddHardwareViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$getDeviceModel$0$AddHardwareViewModel(Resource resource) throws Exception {
        if (resource.getStatus().equals(Resource.Status.SUCCESS)) {
            this.localRepository.saveDataAsList((List) resource.getData(), DeviceModel.class, true);
        }
    }

    public /* synthetic */ void lambda$getDeviceModel$1$AddHardwareViewModel(Resource resource) throws Exception {
        this.activateSingleEvent.setValue(resource);
    }

    public SingleLiveEvent<Resource<List<DeviceModel>>> getActivateSingleEvent() {
        return this.activateSingleEvent;
    }

    public void getRoomForDeviceModel() {
        this.localRepository.getRooms().subscribeOn(AndroidSchedulers.mainThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                AddHardwareViewModel.this.lambda$getRoomForDeviceModel$2$AddHardwareViewModel((List) obj);
            }
        });
    }

    public /* synthetic */ void lambda$getRoomForDeviceModel$2$AddHardwareViewModel(List list) throws Exception {
        this.roomSingleEvent.setValue(list);
    }

    public SingleLiveEvent<List<Rooms>> getRoomSingleEvent() {
        return this.roomSingleEvent;
    }

    public void addRoom(String str) {
        this.remoteRepository.addRoom(str).flatMap(new Function() {
            public final Object apply(Object obj) {
                return AddHardwareViewModel.this.lambda$addRoom$3$AddHardwareViewModel((Resource) obj);
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                AddHardwareViewModel.this.lambda$addRoom$4$AddHardwareViewModel((Resource) obj);
            }
        }).subscribe(new Consumer() {
            public final void accept(Object obj) {
                AddHardwareViewModel.this.lambda$addRoom$5$AddHardwareViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ Publisher lambda$addRoom$3$AddHardwareViewModel(Resource resource) throws Exception {
        return this.remoteRepository.getRooms();
    }

    public /* synthetic */ void lambda$addRoom$4$AddHardwareViewModel(Resource resource) throws Exception {
        if (resource.getStatus().equals(Resource.Status.SUCCESS)) {
            this.localRepository.saveDataAsList((List) resource.getData(), Rooms.class, true);
        }
    }

    public /* synthetic */ void lambda$addRoom$5$AddHardwareViewModel(Resource resource) throws Exception {
        this.singleLiveEventAddRoom.setValue(resource.getData());
    }

    public SingleLiveEvent<List<Rooms>> getSingleLiveEventAddRoom() {
        return this.singleLiveEventAddRoom;
    }

    public void addHardware(String str, String str2, Integer num) {
        this.remoteRepository.addHardware(str, str2, num).filter($$Lambda$AddHardwareViewModel$9H2RaLTemb9h8cuOtYKlF4llo.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                AddHardwareViewModel.this.lambda$addHardware$7$AddHardwareViewModel((Resource) obj);
            }
        }).flatMap(new Function(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return AddHardwareViewModel.this.lambda$addHardware$9$AddHardwareViewModel(this.f$1, (Resource) obj);
            }
        }, new BiFunction() {
            public final Object apply(Object obj, Object obj2) {
                return AddHardwareViewModel.this.lambda$addHardware$10$AddHardwareViewModel((Resource) obj, (Resource) obj2);
            }
        }).flatMap($$Lambda$AddHardwareViewModel$LD6PU3gugze5PABuIwUcvcP69GU.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                AddHardwareViewModel.this.lambda$addHardware$12$AddHardwareViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$addHardware$7$AddHardwareViewModel(Resource resource) throws Exception {
        this.serialNumber.postValue(String.valueOf(((SerialNumber) resource.getData()).getSerialNumber()));
    }

    public /* synthetic */ Publisher lambda$addHardware$9$AddHardwareViewModel(String str, Resource resource) throws Exception {
        return this.remoteRepository.updateDevice(String.valueOf(((SerialNumber) resource.getData()).getSerialNumber()), str).filter($$Lambda$AddHardwareViewModel$oVy8I3gTFvjGNKjg32eYgsz_Pp8.INSTANCE);
    }

    public /* synthetic */ Flowable lambda$addHardware$10$AddHardwareViewModel(Resource resource, Resource resource2) throws Exception {
        return this.remoteRepository.getWindowsSettings(((SerialNumber) resource.getData()).getSerialNumber());
    }

    public /* synthetic */ void lambda$addHardware$12$AddHardwareViewModel(Resource resource) throws Exception {
        this.singleLiveEventAddHardware.setValue(resource);
    }

    public SingleLiveEvent<Resource<SignalSettings>> getSingleLiveEventAddHardware() {
        return this.singleLiveEventAddHardware;
    }

    public void deleteHardware(String str) {
        this.compositeDisposable.add(this.remoteRepository.deleteHardware(str).flatMap(new Function() {
            public final Object apply(Object obj) {
                return AddHardwareViewModel.this.lambda$deleteHardware$13$AddHardwareViewModel((Resource) obj);
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                AddHardwareViewModel.this.lambda$deleteHardware$14$AddHardwareViewModel((Resource) obj);
            }
        }).map($$Lambda$AddHardwareViewModel$TrXv_o40iD9_CKC4ILlZCIAH4vU.INSTANCE).subscribe(new Consumer() {
            public final void accept(Object obj) {
                AddHardwareViewModel.this.lambda$deleteHardware$16$AddHardwareViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ Publisher lambda$deleteHardware$13$AddHardwareViewModel(Resource resource) throws Exception {
        return this.remoteRepository.getHardwareResource();
    }

    public /* synthetic */ void lambda$deleteHardware$14$AddHardwareViewModel(Resource resource) throws Exception {
        if (resource.getStatus().equals(Resource.Status.SUCCESS)) {
            this.localRepository.saveDataAsList((List) resource.getData(), Hardware.class, true);
        }
    }

    static /* synthetic */ Resource lambda$deleteHardware$15(Resource resource) throws Exception {
        return new Resource(Resource.Status.SUCCESS);
    }

    public /* synthetic */ void lambda$deleteHardware$16$AddHardwareViewModel(Resource resource) throws Exception {
        this.singleLiveEventDeleteHardware.setValue(resource);
    }

    public SingleLiveEvent<Resource<Void>> getSingleLiveEventDeleteHardware() {
        return this.singleLiveEventDeleteHardware;
    }

    public void saveCode(String str, String str2) {
        this.remoteRepository.saveCode(str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                AddHardwareViewModel.this.lambda$saveCode$17$AddHardwareViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$saveCode$17$AddHardwareViewModel(Resource resource) throws Exception {
        this.singleLiveEventSigmnalCOde.setValue(resource);
    }

    public SingleLiveEvent<Resource<SignalCode>> getSingleLiveEventSignalCode() {
        return this.singleLiveEventSigmnalCOde;
    }

    public LiveData<Resource<SignalSettings>> getWindowsSettings(String str) {
        return LiveDataReactiveStreams.fromPublisher(this.remoteRepository.getWindowsSettings(Long.valueOf(Long.parseLong(str))));
    }

    public void updateDeviceName(String str, String str2) {
        this.compositeDisposable.add(this.remoteRepository.updateDevice(str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer(str2) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                AddHardwareViewModel.this.lambda$updateDeviceName$18$AddHardwareViewModel(this.f$1, (Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$updateDeviceName$18$AddHardwareViewModel(String str, Resource resource) throws Exception {
        this.currentDeviceName.setValue(str);
    }

    public void updateDeviceRoom(String str, Integer num) {
        this.compositeDisposable.add(this.remoteRepository.updateDeviceRoom(str, num).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe());
    }

    public MediatorLiveData<Integer> getStage() {
        return this.stage;
    }

    public MutableLiveData<Rooms> getCurrentRoom() {
        return this.currentRoom;
    }

    public MutableLiveData<String> getSerialNumber() {
        return this.serialNumber;
    }

    public MutableLiveData<String> getCurrentDeviceName() {
        return this.currentDeviceName;
    }

    public void updateHardware() {
        this.compositeDisposable.add(this.remoteRepository.getHardware().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                AddHardwareViewModel.this.lambda$updateHardware$19$AddHardwareViewModel((List) obj);
            }
        }).doAfterNext(new Consumer() {
            public final void accept(Object obj) {
                AddHardwareViewModel.this.lambda$updateHardware$20$AddHardwareViewModel((List) obj);
            }
        }).subscribe());
    }

    public /* synthetic */ void lambda$updateHardware$19$AddHardwareViewModel(List list) throws Exception {
        this.localRepository.saveDataAsList(list, Hardware.class, true);
    }

    public /* synthetic */ void lambda$updateHardware$20$AddHardwareViewModel(List list) throws Exception {
        getStage().setValue(7);
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        if (!this.compositeDisposable.isDisposed()) {
            this.compositeDisposable.dispose();
        }
        super.onCleared();
    }
}
