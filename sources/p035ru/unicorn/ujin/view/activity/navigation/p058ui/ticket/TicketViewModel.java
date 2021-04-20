package p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MutableLiveData;
import java.math.BigDecimal;
import java.util.List;
import org.reactivestreams.Subscription;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.AccountPaymentLink;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.AccountTicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.OperationModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.Tickets;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.functions.Action;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.schedulers.Schedulers;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketViewModel */
public class TicketViewModel extends BaseViewModel {
    SingleLiveEvent<Resource<AccountPaymentLink>> accountPaymentLink = new SingleLiveEvent<>();
    private LocalRepository localRepository = LocalRepository.getInstance();
    SingleLiveEvent<List<OperationModel>> operationAsKeyValue = new SingleLiveEvent<>();
    private ProfileLocalRepository profileLocalRepository = ProfileLocalRepository.Companion.getInstance();
    private RemoteRepository remoteRepository = new RemoteRepository();
    SingleLiveEvent<Resource<AccountTicket>> ticket = new SingleLiveEvent<>();
    MutableLiveData<Resource<List<Tickets>>> ticketListDSingleLiveEvent = new SingleLiveEvent();

    public void getOperations(int i) {
        this.compositeDisposable.add(this.remoteRepository.getOperations(this.profileLocalRepository.getCurrentFlatid(), i).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                TicketViewModel.this.lambda$getOperations$0$TicketViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$getOperations$0$TicketViewModel(Resource resource) throws Exception {
        getTicket().setValue(resource);
    }

    public void getOperationDescription(String str, int i) {
        this.compositeDisposable.add(this.remoteRepository.getOperationDescription(this.profileLocalRepository.getCurrentFlatid(), i, str).filter($$Lambda$TicketViewModel$Pu3BrFm6zrybN8vOHJZ0cgcFH4I.INSTANCE).filter($$Lambda$TicketViewModel$oI7le_70DCPYq09W2mc_M3pWeq4.INSTANCE).map($$Lambda$xEPflHYilM9q1CDbyl752peC9J4.INSTANCE).map($$Lambda$sPCKKeLezF4fAjFQR54cVRu37Wg.INSTANCE).doOnSubscribe(new Consumer() {
            public final void accept(Object obj) {
                TicketViewModel.this.lambda$getOperationDescription$3$TicketViewModel((Subscription) obj);
            }
        }).doOnTerminate(new Action() {
            public final void run() {
                TicketViewModel.this.lambda$getOperationDescription$4$TicketViewModel();
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                TicketViewModel.this.lambda$getOperationDescription$5$TicketViewModel((List) obj);
            }
        }));
    }

    static /* synthetic */ boolean lambda$getOperationDescription$2(Resource resource) throws Exception {
        return resource.getData() != null;
    }

    public /* synthetic */ void lambda$getOperationDescription$3$TicketViewModel(Subscription subscription) throws Exception {
        getShowLoader().postValue(true);
    }

    public /* synthetic */ void lambda$getOperationDescription$4$TicketViewModel() throws Exception {
        getShowLoader().postValue(false);
    }

    public /* synthetic */ void lambda$getOperationDescription$5$TicketViewModel(List list) throws Exception {
        getOperationAsKeyValue().setValue(list);
    }

    public void getAccountPaymentLink(int i, BigDecimal bigDecimal) {
        this.compositeDisposable.add(this.remoteRepository.getAccountPaymentLink(this.profileLocalRepository.getCurrentFlatid(), i, bigDecimal).doOnSubscribe(new Consumer() {
            public final void accept(Object obj) {
                TicketViewModel.this.lambda$getAccountPaymentLink$6$TicketViewModel((Subscription) obj);
            }
        }).doOnTerminate(new Action() {
            public final void run() {
                TicketViewModel.this.lambda$getAccountPaymentLink$7$TicketViewModel();
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                TicketViewModel.this.lambda$getAccountPaymentLink$8$TicketViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$getAccountPaymentLink$6$TicketViewModel(Subscription subscription) throws Exception {
        getShowLoader().postValue(true);
    }

    public /* synthetic */ void lambda$getAccountPaymentLink$7$TicketViewModel() throws Exception {
        getShowLoader().postValue(false);
    }

    public /* synthetic */ void lambda$getAccountPaymentLink$8$TicketViewModel(Resource resource) throws Exception {
        getAccountPaymentLink().setValue(resource);
    }

    public LiveData<Resource<Void>> sendTicketToEmail() {
        return LiveDataReactiveStreams.fromPublisher(this.remoteRepository.sendTicketToMail());
    }

    public void getTicketList() {
        this.compositeDisposable.add(this.remoteRepository.getTickets(this.profileLocalRepository.getCurrentFlatid()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                TicketViewModel.this.lambda$getTicketList$9$TicketViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$getTicketList$9$TicketViewModel(Resource resource) throws Exception {
        getTicketListDSingleLiveEvent().postValue(resource);
    }

    public SingleLiveEvent<Resource<AccountTicket>> getTicket() {
        return this.ticket;
    }

    public SingleLiveEvent<List<OperationModel>> getOperationAsKeyValue() {
        return this.operationAsKeyValue;
    }

    public SingleLiveEvent<Resource<AccountPaymentLink>> getAccountPaymentLink() {
        return this.accountPaymentLink;
    }

    public MutableLiveData<Resource<List<Tickets>>> getTicketListDSingleLiveEvent() {
        return this.ticketListDSingleLiveEvent;
    }

    public String getCurrentFlatAddress() {
        return this.profileLocalRepository.getCurrentFlatAddress();
    }

    public Boolean isDemoUser() {
        return Boolean.valueOf(this.profileLocalRepository.isDemo());
    }
}
