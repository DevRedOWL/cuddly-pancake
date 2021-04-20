package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints;

import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.List;
import org.reactivestreams.Subscription;
import p035ru.unicorn.ujin.data.realm.Point;
import p035ru.unicorn.ujin.data.realm.Points;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.service.location.LocationRepository;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.functions.Action;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.schedulers.Schedulers;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.GatesViewModel */
public class GatesViewModel extends BaseViewModel {
    private LocationRepository locationRepository = new LocationRepository();
    private MutableLiveData<Resource<Points>> mutableData = new MutableLiveData<>();
    private SingleLiveEvent<Resource<Void>> onSendCommand = new SingleLiveEvent<>();
    public MutableLiveData<List<Point>> points = new MutableLiveData<>();

    public void getActionList(boolean z) {
        this.locationRepository.loadPoint().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new Consumer(z) {
            private final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                GatesViewModel.this.lambda$getActionList$0$GatesViewModel(this.f$1, (Subscription) obj);
            }
        }).doOnTerminate(new Action() {
            public final void run() {
                GatesViewModel.this.lambda$getActionList$1$GatesViewModel();
            }
        }).subscribe(new Consumer() {
            public final void accept(Object obj) {
                GatesViewModel.this.lambda$getActionList$2$GatesViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$getActionList$0$GatesViewModel(boolean z, Subscription subscription) throws Exception {
        getShowLoader().postValue(Boolean.valueOf(z));
    }

    public /* synthetic */ void lambda$getActionList$1$GatesViewModel() throws Exception {
        getShowLoader().postValue(false);
    }

    public /* synthetic */ void lambda$getActionList$2$GatesViewModel(Resource resource) throws Exception {
        this.mutableData.setValue(resource);
        if (!resource.getStatus().equals(Resource.Status.SUCCESS)) {
            return;
        }
        if (resource.getData() == null || ((Points) resource.getData()).getPoints() == null || ((Points) resource.getData()).getPoints().isEmpty()) {
            this.points.setValue(new ArrayList());
        } else {
            this.points.setValue(((Points) resource.getData()).getPoints());
        }
    }

    public MutableLiveData<Resource<Points>> getMutableData() {
        return this.mutableData;
    }

    public void sendAction(int i) {
        this.compositeDisposable.add(this.locationRepository.sendActionWithId(Integer.valueOf(i)).map($$Lambda$GatesViewModel$KvrOI5JURGJ2CKWDuHAamfCy_1Y.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).startWith(Resource.loading()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                GatesViewModel.this.lambda$sendAction$4$GatesViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$sendAction$4$GatesViewModel(Resource resource) throws Exception {
        this.onSendCommand.setValue(resource);
    }

    public SingleLiveEvent<Resource<Void>> onSendCommand() {
        return this.onSendCommand;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        this.onSendCommand.setValue(null);
    }
}
