package p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.List;
import org.reactivestreams.Publisher;
import p035ru.unicorn.ujin.data.api.response.NewsListResponseData;
import p035ru.unicorn.ujin.data.realm.CardData;
import p035ru.unicorn.ujin.data.realm.Intercom;
import p035ru.unicorn.ujin.data.realm.News;
import p035ru.unicorn.ujin.data.realm.PassCard;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.data.Action;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.bms.BMSInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.FormFormat;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.Flowable;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.disposables.CompositeDisposable;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.functions.Function;
import p046io.reactivex.schedulers.Schedulers;
import p046io.realm.RealmObject;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.navigation.SimpleViewModel */
public class SimpleViewModel extends BaseViewModel {
    private final SingleLiveEvent<Resource<CardData>> appendDataLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<Resource<String>> carCardOrder = new SingleLiveEvent<>();
    private final MutableLiveData<String> cardTypeLiveData = new MutableLiveData<>();
    private final CompositeDisposable compositeDisposable = new CompositeDisposable();
    private final MutableLiveData<Schema> currentSchema = new SingleLiveEvent();
    private final SingleLiveEvent<Resource<FormFormat>> formFormatData = new SingleLiveEvent<>();
    private final MutableLiveData<Resource<Intercom>> intercomSingleLiveEvent = new MutableLiveData<>();
    private boolean isSchemaLoading = false;
    private final LocalRepository localRepository = LocalRepository.getInstance();
    private final SingleLiveEvent<Resource<News>> newsByIdEventSingleLiveEvent = new SingleLiveEvent<>();
    private final SingleLiveEvent<Resource<NewsListResponseData>> newsListEventSingleLiveEvent = new SingleLiveEvent<>();
    private final MutableLiveData<News> newsMutableLiveData = new MutableLiveData<>();
    private final SingleLiveEvent<Resource<Void>> openDoorEvent = new SingleLiveEvent<>();
    private final MutableLiveData<Resource<PassCard>> passCardEvent = new MutableLiveData<>();
    private final RemoteRepository remoteRepository = new RemoteRepository();
    private final MutableLiveData<Schemas> schemasMutableLiveData = new MutableLiveData<>();
    private final SingleLiveEvent<Schemas> schemasSingleEvent = new SingleLiveEvent<>();
    private final SingleLiveEvent<Resource<Void>> sendDynamiceRequest = new SingleLiveEvent<>();
    private final MutableLiveData<Integer> tabPosition = new MutableLiveData<>();

    public SimpleViewModel() {
        getSchema();
    }

    public void openDoor() {
        this.compositeDisposable.add(this.remoteRepository.openDoor().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                SimpleViewModel.this.lambda$openDoor$0$SimpleViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$openDoor$0$SimpleViewModel(Resource resource) throws Exception {
        getOpenDoorEvent().setValue(resource);
    }

    public LiveData<Resource<Action>> getSecurityNumber() {
        return LiveDataReactiveStreams.fromPublisher(this.remoteRepository.getConserjNumber());
    }

    public SingleLiveEvent<Resource<Void>> getOpenDoorEvent() {
        return this.openDoorEvent;
    }

    public void carCardOrder(String str, String str2, String str3, Long l, Long l2, String str4, Boolean bool) {
        this.compositeDisposable.add(this.remoteRepository.getCarCardOrder(str, str2, str3, l, l2, str4, bool).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                SimpleViewModel.this.lambda$carCardOrder$1$SimpleViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$carCardOrder$1$SimpleViewModel(Resource resource) throws Exception {
        getAppendDataLiveData().setValue(resource);
    }

    public void cardManOrder(String str, String str2, Long l, Long l2, String str3, Boolean bool) {
        this.compositeDisposable.add(this.remoteRepository.getGuestCardOrder(str, str2, l, l2, str3, bool).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                SimpleViewModel.this.lambda$cardManOrder$2$SimpleViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$cardManOrder$2$SimpleViewModel(Resource resource) throws Exception {
        getAppendDataLiveData().setValue(resource);
    }

    public void deleteSchema() {
        this.localRepository.delete(Schemas.class);
        this.localRepository.delete(Schema.class);
    }

    public void getSchema() {
        getSchema(true);
    }

    public void getSchema(boolean z) {
        Flowable<U> observeOn = this.localRepository.getFistElement(Schemas.class).cast(Schemas.class).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread());
        observeOn.mergeWith((Publisher<? extends U>) this.remoteRepository.getSchema(z).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                SimpleViewModel.this.lambda$getSchema$3$SimpleViewModel((Schemas) obj);
            }
        }).onErrorResumeNext(observeOn).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).startWith(observeOn).cache()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                SimpleViewModel.this.lambda$getSchema$4$SimpleViewModel((Schemas) obj);
            }
        });
    }

    public /* synthetic */ void lambda$getSchema$3$SimpleViewModel(Schemas schemas) throws Exception {
        this.localRepository.saveDataOrUpdate(schemas);
    }

    public /* synthetic */ void lambda$getSchema$4$SimpleViewModel(Schemas schemas) throws Exception {
        getSchemasMutableLiveData().postValue(schemas);
    }

    public void getSingleSchema(boolean z) {
        this.isSchemaLoading = true;
        Flowable<U> observeOn = this.localRepository.getFistElement(Schemas.class).cast(Schemas.class).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread());
        observeOn.mergeWith((Publisher<? extends U>) this.remoteRepository.getSchema(z).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                SimpleViewModel.this.lambda$getSingleSchema$5$SimpleViewModel((Schemas) obj);
            }
        }).onErrorResumeNext(observeOn).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).cache()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                SimpleViewModel.this.lambda$getSingleSchema$6$SimpleViewModel((Schemas) obj);
            }
        });
    }

    public /* synthetic */ void lambda$getSingleSchema$5$SimpleViewModel(Schemas schemas) throws Exception {
        this.localRepository.saveDataOrUpdate(schemas);
    }

    public /* synthetic */ void lambda$getSingleSchema$6$SimpleViewModel(Schemas schemas) throws Exception {
        getSchemasSingleEvent().postValue(schemas);
    }

    public void sendDynamicRequest(String str) {
        this.compositeDisposable.add(this.remoteRepository.senDynamicRequest(str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                SimpleViewModel.this.lambda$sendDynamicRequest$7$SimpleViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$sendDynamicRequest$7$SimpleViewModel(Resource resource) throws Exception {
        this.sendDynamiceRequest.setValue(resource);
    }

    public void sendDynamicRequestCustomUrl(String str, String str2) {
        this.compositeDisposable.add(this.remoteRepository.senDynamicRequestCustomUrl(str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                SimpleViewModel.this.lambda$sendDynamicRequestCustomUrl$8$SimpleViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$sendDynamicRequestCustomUrl$8$SimpleViewModel(Resource resource) throws Exception {
        this.sendDynamiceRequest.setValue(resource);
    }

    public SingleLiveEvent<Resource<Void>> getSendDynamiceRequest() {
        return this.sendDynamiceRequest;
    }

    public LiveData<Resource<BMSInfo>> getBmsInfo() {
        return LiveDataReactiveStreams.fromPublisher(this.localRepository.getData(BMSInfo.class).filter($$Lambda$SimpleViewModel$Yjjz_8vUFbFyeDxGfqP6yC5Rlw.INSTANCE).map($$Lambda$SimpleViewModel$r6H7J1fWOE9N2wajHgUZ7leA4vs.INSTANCE).mergeWith(this.remoteRepository.getBMSInfo().filter($$Lambda$SimpleViewModel$zQjw08p9GwmFk00mc5NoKL5vjY.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                SimpleViewModel.this.lambda$getBmsInfo$10$SimpleViewModel((Resource) obj);
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread())));
    }

    public /* synthetic */ void lambda$getBmsInfo$10$SimpleViewModel(Resource resource) throws Exception {
        this.localRepository.saveData((RealmObject) resource.getData(), BMSInfo.class, true);
    }

    static /* synthetic */ boolean lambda$getBmsInfo$11(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    public SingleLiveEvent<Resource<String>> getCarCardOrder() {
        return this.carCardOrder;
    }

    public MutableLiveData<Schemas> getSchemasMutableLiveData() {
        return this.schemasMutableLiveData;
    }

    public SingleLiveEvent<Schemas> getSchemasSingleEvent() {
        return this.schemasSingleEvent;
    }

    public MutableLiveData<Resource<Intercom>> getIntercomSingleLiveEvent() {
        return this.intercomSingleLiveEvent;
    }

    public MutableLiveData<Resource<PassCard>> getPassCardEvent() {
        return this.passCardEvent;
    }

    public MutableLiveData<String> getCardTypeLiveData() {
        return this.cardTypeLiveData;
    }

    public SingleLiveEvent<Resource<CardData>> getAppendDataLiveData() {
        return this.appendDataLiveData;
    }

    public void getDomofonVideo() {
        this.compositeDisposable.add(this.remoteRepository.getIntercom().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                SimpleViewModel.this.lambda$getDomofonVideo$13$SimpleViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$getDomofonVideo$13$SimpleViewModel(Resource resource) throws Exception {
        this.intercomSingleLiveEvent.setValue(resource);
    }

    public void getAllCard() {
        this.compositeDisposable.add(this.remoteRepository.getAllCard().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                SimpleViewModel.this.lambda$getAllCard$14$SimpleViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$getAllCard$14$SimpleViewModel(Resource resource) throws Exception {
        getPassCardEvent().setValue(resource);
    }

    public void deleteCard(String str) {
        this.compositeDisposable.add(this.remoteRepository.deleteCard(str).flatMap(new Function() {
            public final Object apply(Object obj) {
                return SimpleViewModel.this.lambda$deleteCard$15$SimpleViewModel((Resource) obj);
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                SimpleViewModel.this.lambda$deleteCard$16$SimpleViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ Publisher lambda$deleteCard$15$SimpleViewModel(Resource resource) throws Exception {
        return this.remoteRepository.getAllCard();
    }

    public /* synthetic */ void lambda$deleteCard$16$SimpleViewModel(Resource resource) throws Exception {
        getPassCardEvent().setValue(resource);
    }

    public MutableLiveData<Integer> getTabPosition() {
        return this.tabPosition;
    }

    public MutableLiveData<Schema> getCurrentSchema() {
        return this.currentSchema;
    }

    public void getNewsList() {
        this.remoteRepository.getNewsList().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                SimpleViewModel.this.lambda$getNewsList$17$SimpleViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$getNewsList$17$SimpleViewModel(Resource resource) throws Exception {
        getNewsListEventSingleLiveEvent().setValue(resource);
    }

    public void getNewsById() {
        getNewsById(getNewsMutableLiveData().getValue().getId());
    }

    public void getNewsById(String str) {
        this.remoteRepository.getNewsById(str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                SimpleViewModel.this.lambda$getNewsById$18$SimpleViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$getNewsById$18$SimpleViewModel(Resource resource) throws Exception {
        getNewsByIdEventSingleLiveEvent().setValue(resource);
    }

    public MutableLiveData<Resource<NewsListResponseData>> getNewsListEventSingleLiveEvent() {
        return this.newsListEventSingleLiveEvent;
    }

    public MutableLiveData<News> getNewsMutableLiveData() {
        return this.newsMutableLiveData;
    }

    public MutableLiveData<Resource<News>> getNewsByIdEventSingleLiveEvent() {
        return this.newsByIdEventSingleLiveEvent;
    }

    public void getFormaSettings() {
        this.remoteRepository.getFormaData().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                SimpleViewModel.this.lambda$getFormaSettings$19$SimpleViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$getFormaSettings$19$SimpleViewModel(Resource resource) throws Exception {
        getFormFormatData().setValue(resource);
    }

    public SingleLiveEvent<Resource<FormFormat>> getFormFormatData() {
        return this.formFormatData;
    }

    public boolean isSchemaLoading() {
        return this.isSchemaLoading;
    }

    public void setIsSchemaLoading(boolean z) {
        this.isSchemaLoading = z;
    }

    public List<Schema> getBottomNavigationSchema() {
        if (getSchemasMutableLiveData().getValue() == null || getSchemasMutableLiveData().getValue().getMeta() == null) {
            return new ArrayList();
        }
        return getSchemasMutableLiveData().getValue().getMeta();
    }
}
