package p035ru.unicorn.ujin.view.activity.navigation.p058ui.device;

import androidx.lifecycle.MutableLiveData;
import java.net.InetAddress;
import java.util.List;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device;
import p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.SomeData;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.disposables.CompositeDisposable;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.processors.PublishProcessor;
import p046io.reactivex.schedulers.Schedulers;
import p046io.realm.RealmModel;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.device.DeviceViewModel */
public class DeviceViewModel extends BaseViewModel {
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private DeviceRepository deviceRepository = new DeviceRepository();
    private SingleLiveEvent<Resource<Hardware>> getHardwareSingleEvent = new SingleLiveEvent<>();
    private MutableLiveData<Boolean> isActiveWifi = new MutableLiveData<>();
    private LocalRepository localRepository = LocalRepository.getInstance();
    public MutableLiveData<List<Device>> mutableScan = new MutableLiveData<>();
    private RemoteRepository remoteRepository = new RemoteRepository();
    private SingleLiveEvent<Resource<SomeData>> sendSignalSingleEvent = new SingleLiveEvent<>();
    private PublishProcessor<Resource<SomeData>> specialClicks = PublishProcessor.create();

    public PublishProcessor<Resource<SomeData>> specialClicks() {
        return this.specialClicks;
    }

    public MutableLiveData<Boolean> getIsActiveWifi() {
        return this.isActiveWifi;
    }

    public void getSerialList() {
        this.compositeDisposable.add(this.deviceRepository.getHardwareToken().filter($$Lambda$DeviceViewModel$OR8NfPuQAi3DzPIL1UZxFNKPn8.INSTANCE).filter($$Lambda$DeviceViewModel$ch6sGKHn8NyXpBzDPE5_cVf9D_M.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                DeviceViewModel.this.lambda$getSerialList$2$DeviceViewModel((Resource) obj);
            }
        }).subscribe());
    }

    static /* synthetic */ boolean lambda$getSerialList$1(Resource resource) throws Exception {
        return resource.getData() != null;
    }

    public /* synthetic */ void lambda$getSerialList$2$DeviceViewModel(Resource resource) throws Exception {
        if (resource.getStatus() == Resource.Status.SUCCESS) {
            this.localRepository.saveDataAsList(((DevicesList) resource.getData()).getDevicesList(), Devices.class, false);
        }
    }

    public void sendCommand(Device device, boolean z) {
        List<Devices> deviceTokenById = this.localRepository.getDeviceTokenById(device.getId());
        if (deviceTokenById != null) {
            device.setToken(deviceTokenById.get(0).getDeviceToken());
        } else {
            z = true;
        }
        this.compositeDisposable.add(this.deviceRepository.sendCommand(device, z).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe());
    }

    public void getHardware(String str, String str2) {
        this.compositeDisposable.add(this.deviceRepository.getHardwareById(str, str2).subscribeOn(AndroidSchedulers.mainThread()).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                DeviceViewModel.this.lambda$getHardware$3$DeviceViewModel((Resource) obj);
            }
        }).subscribe(new Consumer() {
            public final void accept(Object obj) {
                DeviceViewModel.this.lambda$getHardware$4$DeviceViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$getHardware$3$DeviceViewModel(Resource resource) throws Exception {
        if (resource.getStatus() == Resource.Status.SUCCESS) {
            this.localRepository.saveDataAsList(((Hardware) resource.getData()).getSignals(), (Class<? extends RealmModel>) null, false);
        }
    }

    public /* synthetic */ void lambda$getHardware$4$DeviceViewModel(Resource resource) throws Exception {
        this.getHardwareSingleEvent.setValue(resource);
    }

    public void scan(InetAddress inetAddress, boolean z) {
        this.compositeDisposable.add(this.deviceRepository.scan(inetAddress, z, this.localRepository).subscribe(new Consumer() {
            public final void accept(Object obj) {
                DeviceViewModel.this.lambda$scan$5$DeviceViewModel((List) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$scan$5$DeviceViewModel(List list) throws Exception {
        getMutableScan().postValue(list);
    }

    public SingleLiveEvent<Resource<Hardware>> getHardwareSingleEvent() {
        return this.getHardwareSingleEvent;
    }

    public SingleLiveEvent<Resource<SomeData>> getSendSignalSingleEvent() {
        return this.sendSignalSingleEvent;
    }

    public MutableLiveData<List<Device>> getMutableScan() {
        return this.mutableScan;
    }
}
