package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice;

import androidx.lifecycle.MutableLiveData;
import java.util.List;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.disposables.CompositeDisposable;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.functions.Predicate;
import p046io.reactivex.schedulers.Schedulers;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceViewModel */
public class DomServiceViewModel extends BaseViewModel {
    MutableLiveData<String> data = new MutableLiveData<>();
    MutableLiveData<Resource<List<DomServiceTariff>>> domServiceListMutableData = new MutableLiveData<>();
    private LocalRepository localRepository = LocalRepository.getInstance();
    private RemoteRepository remoteRepository = new RemoteRepository();
    MutableLiveData<DomServiceTariff> tariffMutableData = new MutableLiveData<>();

    public void sendTicketRequest() {
    }

    DomServiceViewModel() {
        this.compositeDisposable = new CompositeDisposable();
    }

    public void getServices(String str) {
        this.remoteRepository.getServicesList().filter($$Lambda$DomServiceViewModel$ZSZMIX840qmZKmVX1K1PWoZGMj4.INSTANCE).flatMapIterable($$Lambda$O6XizmHFvqYdGEH4KzC0T7oI2LY.INSTANCE).filter(new Predicate(str) {
            private final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final boolean test(Object obj) {
                return ((DomServicesList) obj).getDomServiceCategory().getName().equals(this.f$0);
            }
        }).map($$Lambda$DH50Mg857nRq2z45a2kgWfFXtMs.INSTANCE).map($$Lambda$DomServiceViewModel$YZbAPdUlDk4nWvtBdbdfoCvHDY.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).onErrorReturnItem(Resource.error("Ошибка загрузки")).subscribe(new Consumer() {
            public final void accept(Object obj) {
                DomServiceViewModel.this.lambda$getServices$3$DomServiceViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$getServices$3$DomServiceViewModel(Resource resource) throws Exception {
        this.domServiceListMutableData.setValue(resource);
    }

    public MutableLiveData<Resource<List<DomServiceTariff>>> getDomServiceListMutableData() {
        return this.domServiceListMutableData;
    }

    public MutableLiveData<DomServiceTariff> getTariffMutableData() {
        return this.tariffMutableData;
    }
}
