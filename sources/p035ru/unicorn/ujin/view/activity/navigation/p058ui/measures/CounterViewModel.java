package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import java.util.List;
import org.reactivestreams.Subscription;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.functions.Action;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.schedulers.Schedulers;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.CounterViewModel */
public class CounterViewModel extends BaseViewModel {
    private MutableLiveData<ActualCountersData> actualCountersData = new MutableLiveData<>();
    private MutableLiveData<Long> currentTime = new MutableLiveData<>();
    private MutableLiveData<String> initDate = new MutableLiveData<>();
    private LocalRepository localRepository = LocalRepository.getInstance();
    private SingleLiveEvent<Resource<Measures>> measureResSingleEvent = new SingleLiveEvent<>();
    private MutableLiveData<Measures> measures = new MutableLiveData<>();
    private SingleLiveEvent<Resource<List<MeasuresData>>> measuresListResourceSingleEvent = new SingleLiveEvent<>();
    private MutableLiveData<Integer> position = new MutableLiveData<>();
    private CounterRemoteRepo remoteRepo = new CounterRemoteRepo();
    private SingleLiveEvent<Resource<ServiceTicket>> resultOnSendMeasures = new SingleLiveEvent<>();
    private SingleLiveEvent<Resource<String>> resultOnSendMeasuresString = new SingleLiveEvent<>();

    /* renamed from: s */
    private Disposable f6796s;

    public CounterViewModel() {
        this.initDate.setValue("week=1");
    }

    public void getMeasure(Integer num, Integer num2, Long l, Long l2) {
        Disposable disposable = this.f6796s;
        if (disposable != null && !disposable.isDisposed()) {
            this.f6796s.dispose();
        }
        this.f6796s = this.remoteRepo.getMeasureByDate(num, num2, l, l2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                CounterViewModel.this.lambda$getMeasure$0$CounterViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$getMeasure$0$CounterViewModel(Resource resource) throws Exception {
        this.measureResSingleEvent.setValue(resource);
    }

    public void getMeasureV3(String str, Long l, Long l2) {
        Disposable disposable = this.f6796s;
        if (disposable != null && !disposable.isDisposed()) {
            this.f6796s.dispose();
        }
        Log.d("TAG", "123 X " + DateUtils.formatDate(Long.valueOf(l.longValue() * 1000)) + " " + DateUtils.formatDate(Long.valueOf(l2.longValue() * 1000)));
        this.f6796s = this.remoteRepo.getMeasureV3(str, l, l2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                CounterViewModel.this.lambda$getMeasureV3$1$CounterViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$getMeasureV3$1$CounterViewModel(Resource resource) throws Exception {
        this.measureResSingleEvent.setValue(resource);
    }

    public void getMeasureList() {
        this.compositeDisposable.add(this.remoteRepo.getMeasureList().doOnSubscribe(new Consumer() {
            public final void accept(Object obj) {
                CounterViewModel.this.lambda$getMeasureList$2$CounterViewModel((Subscription) obj);
            }
        }).doOnTerminate(new Action() {
            public final void run() {
                CounterViewModel.this.lambda$getMeasureList$3$CounterViewModel();
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                CounterViewModel.this.lambda$getMeasureList$4$CounterViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$getMeasureList$2$CounterViewModel(Subscription subscription) throws Exception {
        getShowLoader().postValue(true);
    }

    public /* synthetic */ void lambda$getMeasureList$3$CounterViewModel() throws Exception {
        getShowLoader().postValue(false);
    }

    public /* synthetic */ void lambda$getMeasureList$4$CounterViewModel(Resource resource) throws Exception {
        this.measuresListResourceSingleEvent.setValue(resource);
    }

    public SingleLiveEvent<Resource<Measures>> getMeasureResSingleEvent() {
        return this.measureResSingleEvent;
    }

    public SingleLiveEvent<Resource<List<MeasuresData>>> getMeasuresListResourceSingleEvent() {
        return this.measuresListResourceSingleEvent;
    }

    public MutableLiveData<String> getDate() {
        return this.initDate;
    }

    public MutableLiveData<String> getInitDate() {
        return this.initDate;
    }

    public MutableLiveData<Long> getTitle() {
        return this.currentTime;
    }

    public MutableLiveData<Measures> getMeasures() {
        return this.measures;
    }

    public MutableLiveData<Integer> getPosition() {
        return this.position;
    }

    public void getButtonParams() {
        this.compositeDisposable.add(this.remoteRepo.getButtonParams().filter($$Lambda$CounterViewModel$KBPj7Iz7po4j5OIIsUxCPoQZ7k.INSTANCE).map($$Lambda$bcej7HeyJXi35ZvB_VklIYBFoo.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                CounterViewModel.this.lambda$getButtonParams$6$CounterViewModel((ActualCountersData) obj);
            }
        }).doOnSubscribe(new Consumer() {
            public final void accept(Object obj) {
                CounterViewModel.this.lambda$getButtonParams$7$CounterViewModel((Subscription) obj);
            }
        }).doOnTerminate(new Action() {
            public final void run() {
                CounterViewModel.this.lambda$getButtonParams$8$CounterViewModel();
            }
        }).startWith(this.localRepository.getFistElement(ActualCountersData.class).cast(ActualCountersData.class)).subscribeOn(Schedulers.m6765io()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                CounterViewModel.this.lambda$getButtonParams$9$CounterViewModel((ActualCountersData) obj);
            }
        }));
    }

    static /* synthetic */ boolean lambda$getButtonParams$5(Resource resource) throws Exception {
        return resource != null && resource.getStatus().equals(Resource.Status.SUCCESS);
    }

    public /* synthetic */ void lambda$getButtonParams$6$CounterViewModel(ActualCountersData actualCountersData2) throws Exception {
        this.localRepository.saveData(actualCountersData2, ActualCountersData.class, true);
    }

    public /* synthetic */ void lambda$getButtonParams$7$CounterViewModel(Subscription subscription) throws Exception {
        getShowLoader().postValue(true);
    }

    public /* synthetic */ void lambda$getButtonParams$8$CounterViewModel() throws Exception {
        getShowLoader().postValue(false);
    }

    public /* synthetic */ void lambda$getButtonParams$9$CounterViewModel(ActualCountersData actualCountersData2) throws Exception {
        getActualCountersData().postValue(actualCountersData2);
    }

    public void sendMeasures(List<MeasuresData> list, boolean z, Integer num) {
        Disposable disposable;
        if (z) {
            disposable = this.remoteRepo.sendMeasureValue(list, num).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
                public final void accept(Object obj) {
                    CounterViewModel.this.lambda$sendMeasures$10$CounterViewModel((Resource) obj);
                }
            });
        } else {
            disposable = this.remoteRepo.sendMeasureValueString(list, num).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
                public final void accept(Object obj) {
                    CounterViewModel.this.lambda$sendMeasures$11$CounterViewModel((Resource) obj);
                }
            });
        }
        this.compositeDisposable.add(disposable);
    }

    public /* synthetic */ void lambda$sendMeasures$10$CounterViewModel(Resource resource) throws Exception {
        getResultOnSendMeasures().setValue(resource);
    }

    public /* synthetic */ void lambda$sendMeasures$11$CounterViewModel(Resource resource) throws Exception {
        getResultOnSendMeasuresString().setValue(resource);
    }

    public SingleLiveEvent<Resource<ServiceTicket>> getResultOnSendMeasures() {
        return this.resultOnSendMeasures;
    }

    public SingleLiveEvent<Resource<String>> getResultOnSendMeasuresString() {
        return this.resultOnSendMeasuresString;
    }

    public MutableLiveData<ActualCountersData> getActualCountersData() {
        return this.actualCountersData;
    }
}
