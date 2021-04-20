package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;
import org.reactivestreams.Publisher;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.ScenarioList;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.DeviceRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Room;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.SomeRooms;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.Flowable;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.disposables.CompositeDisposable;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.functions.Function;
import p046io.reactivex.schedulers.Schedulers;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rooms.RoomsViewModel */
public class RoomsViewModel extends ViewModel {
    private SingleLiveEvent<Resource<ScenarioList>> activateSingleEvent = new SingleLiveEvent<>();
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private DeviceRepository deviceRepository = new DeviceRepository();
    private LocalRepository localRepository = LocalRepository.getInstance();
    private RemoteRepository remoteRepository = new RemoteRepository();
    private MutableLiveData<String> showErrorMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<SomeRooms> someRoomsMutableLiveData = new MutableLiveData<>();

    static /* synthetic */ List lambda$getHardwareLocal$3(List list) throws Exception {
        return list;
    }

    static /* synthetic */ List lambda$getRoomsLocal$1(List list) throws Exception {
        return list;
    }

    public RoomsViewModel() {
        getList();
    }

    private void getList() {
        getRoomsList().subscribe(new Consumer() {
            public final void accept(Object obj) {
                RoomsViewModel.this.lambda$getList$0$RoomsViewModel((SomeRooms) obj);
            }
        });
    }

    public /* synthetic */ void lambda$getList$0$RoomsViewModel(SomeRooms someRooms) throws Exception {
        getSomeRoomsMutableLiveData().postValue(someRooms);
    }

    private Flowable<SomeRooms> getRoomsList() {
        return getHardwareLocal().zipWith(getRoomsLocal(), $$Lambda$h1OpLLKDOPsEPmXxwHFe5dNiGNQ.INSTANCE).subscribeOn(AndroidSchedulers.mainThread()).observeOn(AndroidSchedulers.mainThread());
    }

    private Flowable<List<Rooms>> getRoomsLocal() {
        return this.localRepository.getData(Rooms.class).map($$Lambda$RoomsViewModel$jixPxGhkwPljSMFS5UbZ71WzOIE.INSTANCE);
    }

    private Flowable<List<Hardware>> getHardwareLocal() {
        return this.localRepository.getData(Hardware.class).filter($$Lambda$RoomsViewModel$c0l4VJlZeoVme_R9nYkNYBqO0Ts.INSTANCE).map($$Lambda$RoomsViewModel$fWpZiBYcfk7aqifqnlfaBizSQZ4.INSTANCE);
    }

    static /* synthetic */ boolean lambda$getHardwareLocal$2(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    public MutableLiveData<SomeRooms> getSomeRoomsMutableLiveData() {
        return this.someRoomsMutableLiveData;
    }

    public void addRoom_(String str) {
        this.remoteRepository.addRoom(str).map(new Function() {
            public final Object apply(Object obj) {
                return RoomsViewModel.this.lambda$addRoom_$4$RoomsViewModel((Resource) obj);
            }
        }).filter($$Lambda$RoomsViewModel$ypUcHJkZhopvSSrUq8OVdCu3HY.INSTANCE).ignoreElements().andThen(this.remoteRepository.getRooms()).filter($$Lambda$RoomsViewModel$LZgVsSsCB73u7RN_2EXIktYadDA.INSTANCE).map($$Lambda$RoomsViewModel$Vud7mj3C4q7mrNu0J4h9ocxiiXA.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                RoomsViewModel.this.lambda$addRoom_$8$RoomsViewModel((List) obj);
            }
        }).zipWith(getHardwareLocal(), $$Lambda$RoomsViewModel$eVK4w4ondvRZ4Nc5V8iqMlEUYpY.INSTANCE).subscribe(new Consumer() {
            public final void accept(Object obj) {
                RoomsViewModel.this.lambda$addRoom_$10$RoomsViewModel((SomeRooms) obj);
            }
        });
    }

    public /* synthetic */ Resource lambda$addRoom_$4$RoomsViewModel(Resource resource) throws Exception {
        if (resource.getStatus().equals(Resource.Status.ERROR)) {
            getShowErrorMutableLiveData().postValue(resource.getMessage());
        }
        return resource;
    }

    public /* synthetic */ void lambda$addRoom_$8$RoomsViewModel(List list) throws Exception {
        this.localRepository.saveDataAsList(list, Rooms.class, true);
    }

    static /* synthetic */ SomeRooms lambda$addRoom_$9(List list, List list2) throws Exception {
        return new SomeRooms(list2, list);
    }

    public /* synthetic */ void lambda$addRoom_$10$RoomsViewModel(SomeRooms someRooms) throws Exception {
        getSomeRoomsMutableLiveData().postValue(someRooms);
    }

    public MutableLiveData<String> getShowErrorMutableLiveData() {
        return this.showErrorMutableLiveData;
    }

    public void deleteRoom(Integer num) {
        this.remoteRepository.deleteRoom(num).map(new Function() {
            public final Object apply(Object obj) {
                return RoomsViewModel.this.lambda$deleteRoom$11$RoomsViewModel((Resource) obj);
            }
        }).filter($$Lambda$RoomsViewModel$40qUo6aiAGqUJReyMr3oGz_LEE.INSTANCE).ignoreElements().andThen(this.remoteRepository.getRooms()).filter($$Lambda$RoomsViewModel$EheQgHCm8BkTSlQIZrKzC_dcj8.INSTANCE).map($$Lambda$RoomsViewModel$K3o4ZG3UlN8LIXB5uQqFipgZ45U.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                RoomsViewModel.this.lambda$deleteRoom$15$RoomsViewModel((List) obj);
            }
        }).zipWith(getHardwareLocal(), $$Lambda$RoomsViewModel$tmVkqjLvZXKZQkooBzbVKW14vAM.INSTANCE).subscribe(new Consumer() {
            public final void accept(Object obj) {
                RoomsViewModel.this.lambda$deleteRoom$17$RoomsViewModel((SomeRooms) obj);
            }
        });
    }

    public /* synthetic */ Resource lambda$deleteRoom$11$RoomsViewModel(Resource resource) throws Exception {
        if (resource.getStatus().equals(Resource.Status.ERROR)) {
            getShowErrorMutableLiveData().postValue(resource.getMessage());
        }
        return resource;
    }

    static /* synthetic */ List lambda$deleteRoom$14(Resource resource) throws Exception {
        if (resource.getData() != null) {
            return ((Room) resource.getData()).getList();
        }
        return new ArrayList();
    }

    public /* synthetic */ void lambda$deleteRoom$15$RoomsViewModel(List list) throws Exception {
        this.localRepository.saveDataAsList(list, Rooms.class, true);
    }

    static /* synthetic */ SomeRooms lambda$deleteRoom$16(List list, List list2) throws Exception {
        return new SomeRooms(list2, list);
    }

    public /* synthetic */ void lambda$deleteRoom$17$RoomsViewModel(SomeRooms someRooms) throws Exception {
        getSomeRoomsMutableLiveData().postValue(someRooms);
    }

    public void addRoom(String str) {
        this.deviceRepository.getHardware().filter($$Lambda$RoomsViewModel$5TchGJiSwJ3nPN2zIYmWatI53aY.INSTANCE).map($$Lambda$TYmyI4K1yNGNwZH9WLDfWQ1OnE0.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread());
        this.remoteRepository.addRoom(str).flatMap(new Function() {
            public final Object apply(Object obj) {
                return RoomsViewModel.this.lambda$addRoom$19$RoomsViewModel((Resource) obj);
            }
        }).map($$Lambda$RoomsViewModel$RM3slXg45wwypF30tbjdZOFpSA8.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                RoomsViewModel.this.lambda$addRoom$21$RoomsViewModel((List) obj);
            }
        });
    }

    public /* synthetic */ Publisher lambda$addRoom$19$RoomsViewModel(Resource resource) throws Exception {
        return this.remoteRepository.getRooms();
    }

    public /* synthetic */ void lambda$addRoom$21$RoomsViewModel(List list) throws Exception {
        this.localRepository.saveDataAsList(list, Rooms.class, true);
    }
}
