package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import android.util.Log;
import androidx.databinding.ObservableField;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gcm.GCMConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.reactivestreams.Publisher;
import p035ru.unicorn.ujin.data.api.response.chats.FileUploadData;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.UnreadBadge;
import p035ru.unicorn.ujin.util.FileUtil;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueData;
import p035ru.unicorn.ujin.view.activity.navigation.entity.KolyaSuccesModel;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CompanyList;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentaRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentChildren;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.Flowable;
import p046io.reactivex.Single;
import p046io.reactivex.SingleSource;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.disposables.CompositeDisposable;
import p046io.reactivex.functions.Action;
import p046io.reactivex.functions.BiFunction;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.functions.Function;
import p046io.reactivex.functions.Predicate;
import p046io.reactivex.schedulers.Schedulers;
import p046io.realm.RealmList;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.HelpDeskViewModel */
public class HelpDeskViewModel extends BaseViewModel {
    public static final String ARCHIVE_STATE = "5";
    private SingleLiveEvent<List<ServiceTicket>> activeListMutableLiveData = new SingleLiveEvent<>();
    private MutableLiveData<Map<String, String>> additionalTicketInf0 = new MutableLiveData<>();
    private SingleLiveEvent<List<ServiceTicket>> archiveListMutableLiveData = new SingleLiveEvent<>();
    private MutableLiveData<Set<RentChildren>> choosenRentChildren = new MutableLiveData<>();
    public ObservableField<String> commentReasonObservable = new ObservableField<>();
    private SingleLiveEvent<Resource<CreateTicket>> createTicketSingleEventt = new SingleLiveEvent<>();
    private SingleLiveEvent<RentInfo> currentRentInfo = new SingleLiveEvent<>();
    private SingleLiveEvent<Integer> currentTab = new SingleLiveEvent<>();
    private MutableLiveData<TicketInfo> currentTicketInfoData = new MutableLiveData<>();
    private SingleLiveEvent<IKeyValueData> currentTicketProperty = new SingleLiveEvent<>();
    private SingleLiveEvent<Resource<CreateTicket>> evaluateTicketLiveData = new SingleLiveEvent<>();
    private Set<String> fileIdList = new HashSet();
    private MutableLiveData<Resource<CompanyList>> getCompanyAsDirector = new MutableLiveData<>();
    private SingleLiveEvent<Resource<CompanyList>> getCompanyListAsDirector = new SingleLiveEvent<>();
    private MutableLiveData<Resource<ServiceTicket>> getTicketMutableLiveData = new MutableLiveData<>();
    private SingleLiveEvent<List<ServiceTicket>> listMutableLiveData = new SingleLiveEvent<>();
    private MutableLiveData<HashSet<SomeString>> liveFileIdList = new MutableLiveData<>();
    private HelpDeskLocalRepository localRepository;
    private SingleLiveEvent<Resource<KolyaSuccesModel>> onMakeTicketActionLiveData = new SingleLiveEvent<>();
    private ProfileLocalRepository profileLocalRepository;
    private HelpdeskRemoteRepo remoteRepo;
    private MutableLiveData<List<Tickets>> rentTicketMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<List<RentType>> rentTypeMutableLiveData = new MutableLiveData<>();
    private RentaRepository rentaRepository;
    public ObservableField<String> returnReasonObservable = new ObservableField<>();
    private MutableLiveData<Boolean> showTabs = new MutableLiveData<>();
    private MutableLiveData<List<ServiceTicketType>> ticketTypeList = new MutableLiveData<>();
    private SingleLiveEvent<Resource<ServiceTicket>> updateTicketSingleLiveEvent = new SingleLiveEvent<>();
    private SingleLiveEvent<Resource<FileUploadData>> uploadFileSingleEvent = new SingleLiveEvent<>();

    static /* synthetic */ Iterable lambda$getAvailableTypes$22(List list) throws Exception {
        return list;
    }

    static /* synthetic */ RentInfo lambda$getMyRentaUniqe$68(RentInfo rentInfo) throws Exception {
        return rentInfo;
    }

    static /* synthetic */ Iterable lambda$getRentTickets$51(List list) throws Exception {
        return list;
    }

    static /* synthetic */ List lambda$getTickets$0(List list) throws Exception {
        return list;
    }

    static /* synthetic */ Resource lambda$null$12(Resource resource, List list) throws Exception {
        return resource;
    }

    static /* synthetic */ Resource lambda$null$44(Resource resource, List list) throws Exception {
        return resource;
    }

    static /* synthetic */ Publisher lambda$sendComment$29(Flowable flowable, String str) throws Exception {
        return flowable;
    }

    static /* synthetic */ Publisher lambda$sendComment$32(Flowable flowable) throws Exception {
        return flowable;
    }

    static /* synthetic */ SingleSource lambda$sendMorionTicket$46(Single single) throws Exception {
        return single;
    }

    static /* synthetic */ SingleSource lambda$updateTicket$14(Single single) throws Exception {
        return single;
    }

    public void setReturnReason(String str) {
        this.returnReasonObservable.set(str);
    }

    public HelpDeskViewModel() {
        this.compositeDisposable = new CompositeDisposable();
        this.remoteRepo = new HelpdeskRemoteRepo();
        this.rentaRepository = new RentaRepository();
        this.localRepository = HelpDeskLocalRepository.getInstance();
        this.profileLocalRepository = ProfileLocalRepository.Companion.getInstance();
        getLiveFileIdList().setValue(new HashSet());
        this.showTabs.setValue(true);
        getCurrentTab().setValue(0);
        TicketInfo ticketInfo = new TicketInfo();
        ticketInfo.setTitle("");
        ticketInfo.setText("");
        this.currentTicketInfoData.setValue(ticketInfo);
    }

    public void getTickets() {
        this.remoteRepo.getTickets().map(new Function() {
            public final Object apply(Object obj) {
                return HelpDeskViewModel.this.lambda$getTickets$1$HelpDeskViewModel((Resource) obj);
            }
        }).filter($$Lambda$HelpDeskViewModel$WWGy9SA5iJM9Oa0wHkie1qenSlY.INSTANCE).map($$Lambda$TYmyI4K1yNGNwZH9WLDfWQ1OnE0.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                HelpDeskViewModel.this.lambda$getTickets$3$HelpDeskViewModel((List) obj);
            }
        }).startWith(this.localRepository.getData(ServiceTicket.class).map($$Lambda$HelpDeskViewModel$erPUIGTcw_rY96cfKAHYqJ18E28.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread())).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                HelpDeskViewModel.this.lambda$getTickets$4$HelpDeskViewModel((List) obj);
            }
        });
    }

    public /* synthetic */ Resource lambda$getTickets$1$HelpDeskViewModel(Resource resource) throws Exception {
        if (resource.getStatus().equals(Resource.Status.ERROR)) {
            this.listMutableLiveData.postValue(null);
        }
        return resource;
    }

    static /* synthetic */ boolean lambda$getTickets$2(Resource resource) throws Exception {
        return resource.getStatus().equals(Resource.Status.SUCCESS) && resource.getData() != null;
    }

    public /* synthetic */ void lambda$getTickets$3$HelpDeskViewModel(List list) throws Exception {
        this.localRepository.saveDataAsList(list, ServiceTicket.class, true);
    }

    public /* synthetic */ void lambda$getTickets$4$HelpDeskViewModel(List list) throws Exception {
        this.listMutableLiveData.postValue(list);
    }

    public void filterTicketList() {
        this.activeListMutableLiveData.postValue(ServiceTicket.filterData(this.listMutableLiveData.getValue(), 0));
        this.archiveListMutableLiveData.postValue(ServiceTicket.filterData(this.listMutableLiveData.getValue(), 1));
    }

    public void updateTicket(String str, String str2) {
        updateTicket(str, str2, 0);
    }

    public void updateTicket(String str, String str2, int i) {
        getUpdateTicketSingleLiveEvent().setValue(Resource.loading());
        String ticketTypeSlug = getTicketTypeSlug(i);
        Flowable just = Flowable.just(this.profileLocalRepository.getCurrentFlatid());
        getArrayListFlowable();
        just.filter($$Lambda$HelpDeskViewModel$F9KpN9eR9LfytwhLGI6sY50CbBI.INSTANCE).flatMap(new Function(str, str2, ticketTypeSlug) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final Object apply(Object obj) {
                return HelpDeskViewModel.this.lambda$updateTicket$8$HelpDeskViewModel(this.f$1, this.f$2, this.f$3, (String) obj);
            }
        }).map(new Function() {
            public final Object apply(Object obj) {
                return HelpDeskViewModel.this.lambda$updateTicket$9$HelpDeskViewModel((Resource) obj);
            }
        }).filter($$Lambda$HelpDeskViewModel$WPi8od0mrurTyjlv_I5_FnrqKZE.INSTANCE).map(new Function() {
            public final Object apply(Object obj) {
                return HelpDeskViewModel.this.lambda$updateTicket$13$HelpDeskViewModel((Resource) obj);
            }
        }).flatMapSingle($$Lambda$HelpDeskViewModel$JWcvpHyyTv8uGhmF42VEMKrMc.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                HelpDeskViewModel.this.lambda$updateTicket$15$HelpDeskViewModel((Resource) obj);
            }
        }, new Consumer() {
            public final void accept(Object obj) {
                HelpDeskViewModel.this.lambda$updateTicket$16$HelpDeskViewModel((Throwable) obj);
            }
        });
    }

    private static /* synthetic */ boolean lambda$updateTicket$5(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    static /* synthetic */ boolean lambda$updateTicket$7(String str) throws Exception {
        return str != null && !str.equals("");
    }

    public /* synthetic */ Publisher lambda$updateTicket$8$HelpDeskViewModel(String str, String str2, String str3, String str4) throws Exception {
        return this.remoteRepo.updateTickets(str, str2, str4, str3);
    }

    public /* synthetic */ Resource lambda$updateTicket$9$HelpDeskViewModel(Resource resource) throws Exception {
        if (resource.getStatus().equals(Resource.Status.ERROR)) {
            getUpdateTicketSingleLiveEvent().postValue(Resource.error(resource.getMessage()));
        }
        return resource;
    }

    public /* synthetic */ Single lambda$updateTicket$13$HelpDeskViewModel(Resource resource) throws Exception {
        return Flowable.fromIterable(new ArrayList(this.fileIdList)).flatMapSingle(new Function(resource) {
            private final /* synthetic */ Resource f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return HelpDeskViewModel.this.lambda$null$11$HelpDeskViewModel(this.f$1, (String) obj);
            }
        }).toList().map(new Function() {
            public final Object apply(Object obj) {
                return HelpDeskViewModel.lambda$null$12(Resource.this, (List) obj);
            }
        });
    }

    public /* synthetic */ SingleSource lambda$null$11$HelpDeskViewModel(Resource resource, String str) throws Exception {
        return this.remoteRepo.uploadFileForServiceTickeSingle(FileUtil.getBase64(str), FileUtil.getFileName(str), ((ServiceTicket) resource.getData()).getTicketId());
    }

    public /* synthetic */ void lambda$updateTicket$15$HelpDeskViewModel(Resource resource) throws Exception {
        getUpdateTicketSingleLiveEvent().setValue(resource);
    }

    public /* synthetic */ void lambda$updateTicket$16$HelpDeskViewModel(Throwable th) throws Exception {
        getUploadFileSingleEvent().setValue(Resource.error(th.getMessage()));
    }

    private String getTicketTypeSlug(int i) {
        List value = getTicketTypeList().getValue();
        return (i == 0 || value == null) ? GCMConstants.EXTRA_APPLICATION_PENDING_INTENT : ((ServiceTicketType) value.get(i)).getSlug();
    }

    private Flowable<ArrayList<String>> getArrayListFlowable() {
        return Flowable.fromArray(new ArrayList(this.fileIdList)).filter($$Lambda$HelpDeskViewModel$AvdjH5f987eI9pHO0fS9mFXgkqM.INSTANCE);
    }

    static /* synthetic */ boolean lambda$getArrayListFlowable$17(ArrayList arrayList) throws Exception {
        return arrayList != null && arrayList.size() > 0;
    }

    public SingleLiveEvent<Resource<FileUploadData>> getUploadFileSingleEvent() {
        return this.uploadFileSingleEvent;
    }

    public SingleLiveEvent<Resource<ServiceTicket>> getUpdateTicketSingleLiveEvent() {
        return this.updateTicketSingleLiveEvent;
    }

    public void getAvailableTypes() {
        Flowable.concat(this.localRepository.getData(ServiceTicketType.class).flatMapIterable($$Lambda$HelpDeskViewModel$AXVeuCNFrKsnUKMGnvHeynPSHY.INSTANCE).cast(ServiceTicketType.class).toList().toFlowable().filter($$Lambda$HelpDeskViewModel$UiFauZemM_KEu_ODttMqb35oXCQ.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()), (Flowable<List<U>>) this.remoteRepo.getAvailableTypes().filter($$Lambda$HelpDeskViewModel$kNg_WYrIK2dQIYi2vpT8EmpLz68.INSTANCE).filter($$Lambda$HelpDeskViewModel$02tlv_ju_YgoTZ_oVx4fdHSs0wQ.INSTANCE).map($$Lambda$HelpDeskViewModel$sA2eMO9GagiS7o11HSQfjkYZCw.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                HelpDeskViewModel.this.lambda$getAvailableTypes$21$HelpDeskViewModel((RealmList) obj);
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread())).distinct().subscribe(new Consumer() {
            public final void accept(Object obj) {
                HelpDeskViewModel.this.lambda$getAvailableTypes$24$HelpDeskViewModel((List) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$getAvailableTypes$18(Resource resource) throws Exception {
        return resource != null && resource.getStatus().equals(Resource.Status.SUCCESS);
    }

    static /* synthetic */ boolean lambda$getAvailableTypes$19(Resource resource) throws Exception {
        return (resource.getData() == null || ((ServiceTicketTypeList) resource.getData()).getServiceTicketTypes() == null) ? false : true;
    }

    public /* synthetic */ void lambda$getAvailableTypes$21$HelpDeskViewModel(RealmList realmList) throws Exception {
        this.localRepository.saveDataAsList(realmList, ServiceTicketType.class, false);
    }

    static /* synthetic */ boolean lambda$getAvailableTypes$23(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    public /* synthetic */ void lambda$getAvailableTypes$24$HelpDeskViewModel(List list) throws Exception {
        getTicketTypeList().postValue(list);
    }

    public void addFileId(String str) {
        HashSet value = this.liveFileIdList.getValue();
        if (value != null) {
            value.add(new SomeString(str));
            getLiveFileIdList().setValue(value);
        }
        this.fileIdList.add(str);
    }

    public void removeFileById(SomeString someString) {
        Set<String> set = this.fileIdList;
        if (set != null) {
            set.remove(someString.getSomeString());
            HashSet value = this.liveFileIdList.getValue();
            if (value != null) {
                value.remove(someString);
                getLiveFileIdList().setValue(value);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        this.currentTicketInfoData = new MutableLiveData<>();
        if (!this.compositeDisposable.isDisposed()) {
            this.compositeDisposable.dispose();
        }
        super.onCleared();
    }

    public void resetFileList() {
        this.fileIdList.clear();
    }

    public MutableLiveData<HashSet<SomeString>> getLiveFileIdList() {
        return this.liveFileIdList;
    }

    public void getTicketsByTicketId(String str) {
        getTicketMutableLiveData().setValue(Resource.loading());
        this.remoteRepo.getTicketDescription(str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                HelpDeskViewModel.this.lambda$getTicketsByTicketId$25$HelpDeskViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$getTicketsByTicketId$25$HelpDeskViewModel(Resource resource) throws Exception {
        getTicketMutableLiveData().setValue(resource);
    }

    public MutableLiveData<Resource<ServiceTicket>> getTicketMutableLiveData() {
        return this.getTicketMutableLiveData;
    }

    public LiveData<Resource<ServiceTicket>> sendComment(String str, String str2) {
        return LiveDataReactiveStreams.fromPublisher(this.remoteRepo.sendComment(str, str2, (String) null).filter($$Lambda$HelpDeskViewModel$wgclrr5bx8bYKQ33dwHOb9WVss.INSTANCE).map($$Lambda$HelpDeskViewModel$bLoouFUAaEeZnQ6VmnCN3OdqavE.INSTANCE).flatMap(new Function() {
            public final Object apply(Object obj) {
                return HelpDeskViewModel.lambda$sendComment$29(Flowable.this, (String) obj);
            }
        }, new BiFunction(str2) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj, Object obj2) {
                return HelpDeskViewModel.this.lambda$sendComment$31$HelpDeskViewModel(this.f$1, (String) obj, (ArrayList) obj2);
            }
        }).flatMap($$Lambda$HelpDeskViewModel$QedNyqoIE3Bjc5ell38f7chQ_A.INSTANCE).flatMap(new Function(str2) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return HelpDeskViewModel.this.lambda$sendComment$33$HelpDeskViewModel(this.f$1, (List) obj);
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).startWith(Resource.loading()));
    }

    static /* synthetic */ boolean lambda$sendComment$26(ArrayList arrayList) throws Exception {
        return arrayList != null && arrayList.size() > 0;
    }

    public /* synthetic */ Flowable lambda$sendComment$31$HelpDeskViewModel(String str, String str2, ArrayList arrayList) throws Exception {
        return Flowable.fromIterable(arrayList).flatMap(new Function(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return HelpDeskViewModel.this.lambda$null$30$HelpDeskViewModel(this.f$1, (String) obj);
            }
        }).toList().toFlowable();
    }

    public /* synthetic */ Publisher lambda$null$30$HelpDeskViewModel(String str, String str2) throws Exception {
        return this.remoteRepo.uploadFileForServiceTicket(FileUtil.getBase64(str2), FileUtil.getFileName(str2), str);
    }

    public /* synthetic */ Publisher lambda$sendComment$33$HelpDeskViewModel(String str, List list) throws Exception {
        return this.remoteRepo.getTicketDescription(str);
    }

    public LiveData<Resource<ServiceTicket>> sendComment2(String str, String str2) {
        return LiveDataReactiveStreams.fromPublisher(Flowable.just(new ArrayList()).concatWith(Flowable.fromArray(new ArrayList(this.fileIdList)).flatMap(new Function() {
            public final Object apply(Object obj) {
                return HelpDeskViewModel.this.lambda$sendComment2$37$HelpDeskViewModel((ArrayList) obj);
            }
        })).flatMap(new Function(str, str2) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final Object apply(Object obj) {
                return HelpDeskViewModel.this.lambda$sendComment2$39$HelpDeskViewModel(this.f$1, this.f$2, (List) obj);
            }
        }).flatMap(new Function(str2) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return HelpDeskViewModel.this.lambda$sendComment2$40$HelpDeskViewModel(this.f$1, (Resource) obj);
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).startWith(Resource.loading()));
    }

    public /* synthetic */ Publisher lambda$sendComment2$37$HelpDeskViewModel(ArrayList arrayList) throws Exception {
        return Flowable.fromIterable(arrayList).flatMap(new Function() {
            public final Object apply(Object obj) {
                return HelpDeskViewModel.this.lambda$null$36$HelpDeskViewModel((String) obj);
            }
        }).toList().toFlowable();
    }

    public /* synthetic */ Publisher lambda$null$36$HelpDeskViewModel(String str) throws Exception {
        return this.remoteRepo.uploadFile(FileUtil.getBase64(str), str).filter($$Lambda$HelpDeskViewModel$NBVpCQlXjAys2Jd3CN1X4II8XwQ.INSTANCE).map($$Lambda$HelpDeskViewModel$Kj6jiwM1B2gKjeUfmP7nSkvqfC8.INSTANCE);
    }

    public /* synthetic */ Publisher lambda$sendComment2$39$HelpDeskViewModel(String str, String str2, List list) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append((String) list.get(i));
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        return this.remoteRepo.sendComment(str, str2, sb.toString()).filter($$Lambda$HelpDeskViewModel$Yjs19_XVHtl1hHYx3q_bGdvDhKo.INSTANCE);
    }

    public /* synthetic */ Publisher lambda$sendComment2$40$HelpDeskViewModel(String str, Resource resource) throws Exception {
        return this.remoteRepo.getTicketDescription(str);
    }

    public MutableLiveData<Boolean> getShowTabs() {
        return this.showTabs;
    }

    public MutableLiveData<Integer> getCurrentTab() {
        return this.currentTab;
    }

    public SingleLiveEvent<List<ServiceTicket>> getListMutableLiveData() {
        return this.listMutableLiveData;
    }

    public SingleLiveEvent<List<ServiceTicket>> getActiveListMutableLiveData() {
        return this.activeListMutableLiveData;
    }

    public SingleLiveEvent<List<ServiceTicket>> getArchiveListMutableLiveData() {
        return this.archiveListMutableLiveData;
    }

    public void sendMorionTicket(ITicket iTicket) {
        if (!iTicket.isCorrect()) {
            this.showError.setValue("Обязательные поля не заполнены");
            return;
        }
        getShowLoader().setValue(true);
        this.remoteRepo.sendMorionTicket(iTicket).map(new Function() {
            public final Object apply(Object obj) {
                return HelpDeskViewModel.this.lambda$sendMorionTicket$41$HelpDeskViewModel((Resource) obj);
            }
        }).filter($$Lambda$HelpDeskViewModel$40pMjxZjFAGts6lD37ZADv5JBHg.INSTANCE).map(new Function() {
            public final Object apply(Object obj) {
                return HelpDeskViewModel.this.lambda$sendMorionTicket$45$HelpDeskViewModel((Resource) obj);
            }
        }).flatMapSingle($$Lambda$HelpDeskViewModel$4BXePQBZ_GdNTQbnR1Qhry0S2FU.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                HelpDeskViewModel.this.lambda$sendMorionTicket$47$HelpDeskViewModel((Resource) obj);
            }
        }, new Consumer() {
            public final void accept(Object obj) {
                HelpDeskViewModel.this.lambda$sendMorionTicket$48$HelpDeskViewModel((Throwable) obj);
            }
        }, new Action() {
            public final void run() {
                HelpDeskViewModel.this.lambda$sendMorionTicket$49$HelpDeskViewModel();
            }
        });
    }

    public /* synthetic */ Resource lambda$sendMorionTicket$41$HelpDeskViewModel(Resource resource) throws Exception {
        if (resource.getStatus().equals(Resource.Status.ERROR)) {
            getCreateTicket().postValue(Resource.error(resource.getMessage()));
        }
        return resource;
    }

    static /* synthetic */ boolean lambda$sendMorionTicket$42(Resource resource) throws Exception {
        return (resource == null || resource.getData() == null || ((CreateTicket) resource.getData()).getTicket() == null) ? false : true;
    }

    public /* synthetic */ Single lambda$sendMorionTicket$45$HelpDeskViewModel(Resource resource) throws Exception {
        return Flowable.fromIterable(new ArrayList(this.fileIdList)).flatMapSingle(new Function(resource) {
            private final /* synthetic */ Resource f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return HelpDeskViewModel.this.lambda$null$43$HelpDeskViewModel(this.f$1, (String) obj);
            }
        }).toList().map(new Function() {
            public final Object apply(Object obj) {
                return HelpDeskViewModel.lambda$null$44(Resource.this, (List) obj);
            }
        });
    }

    public /* synthetic */ SingleSource lambda$null$43$HelpDeskViewModel(Resource resource, String str) throws Exception {
        return this.remoteRepo.uploadFileForServiceTickeSingle(FileUtil.getBase64(str), FileUtil.getFileName(str), String.valueOf(((CreateTicket) resource.getData()).getTicket().getTicket().realmGet$id()));
    }

    public /* synthetic */ void lambda$sendMorionTicket$47$HelpDeskViewModel(Resource resource) throws Exception {
        this.fileIdList.clear();
        this.liveFileIdList.setValue(new HashSet());
        getCreateTicket().setValue(resource);
    }

    public /* synthetic */ void lambda$sendMorionTicket$48$HelpDeskViewModel(Throwable th) throws Exception {
        getUploadFileSingleEvent().setValue(Resource.error(th.getMessage()));
    }

    public /* synthetic */ void lambda$sendMorionTicket$49$HelpDeskViewModel() throws Exception {
        getShowLoader().setValue(false);
        Log.d("TAG", "XXXX blyadstvo 2");
    }

    public void clearFiles() {
        this.fileIdList.clear();
        this.liveFileIdList.setValue(new HashSet());
    }

    public SingleLiveEvent<Resource<CreateTicket>> getCreateTicket() {
        return this.createTicketSingleEventt;
    }

    public void showBadge(boolean z) {
        UnreadBadge unreadBadge = new UnreadBadge();
        unreadBadge.setHasUnread(z);
        this.localRepository.saveData(unreadBadge, UnreadBadge.class, true);
    }

    public void getTicketByType(String str, boolean z, String str2) {
        getRentTickets(str, z, str2);
    }

    public void getRentTickets(String str, boolean z, String str2) {
        Flowable just = Flowable.just(Collections.emptyList());
        String[] strArr = str.equals("property_type") ? new String[]{str, "property"} : new String[]{str};
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        this.compositeDisposable.add(Flowable.merge(just, (Flowable) this.localRepository.getData(Tickets.class).filter($$Lambda$HelpDeskViewModel$4FmkLc1OchJgtTrUPKv1_vfkNJ4.INSTANCE).flatMapIterable($$Lambda$HelpDeskViewModel$qzjzdZbVY2oGVbStEZmDfrEwXI.INSTANCE).cast(Tickets.class).filter(new Predicate(hashSet) {
            private final /* synthetic */ Set f$0;

            {
                this.f$0 = r1;
            }

            public final boolean test(Object obj) {
                return this.f$0.contains(((Tickets) obj).getTicket().realmGet$ticketObject().realmGet$type());
            }
        }).filter(new Predicate(z, str2) {
            private final /* synthetic */ boolean f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final boolean test(Object obj) {
                return HelpDeskViewModel.this.lambda$getRentTickets$53$HelpDeskViewModel(this.f$1, this.f$2, (Tickets) obj);
            }
        }).toSortedList($$Lambda$HelpDeskViewModel$Z7rlhhDNpaaOYgRGRYka54hce0Y.INSTANCE).filter($$Lambda$HelpDeskViewModel$hM1fPF7EhNH9EE9EpFKT2WRCkU.INSTANCE).toFlowable(), (Flowable) this.remoteRepo.getRentTickets(strArr, str2).filter($$Lambda$HelpDeskViewModel$LXEVmVAZCsrgFlkf2p9jXXzag0U.INSTANCE).flatMapIterable($$Lambda$HelpDeskViewModel$6lWGNGn_Po1aHzGOpEmfm48Pgc.INSTANCE).cast(Tickets.class).filter(new Predicate(hashSet) {
            private final /* synthetic */ Set f$0;

            {
                this.f$0 = r1;
            }

            public final boolean test(Object obj) {
                return this.f$0.contains(((Tickets) obj).getTicket().realmGet$ticketObject().realmGet$type());
            }
        }).filter(new Predicate(z, str2) {
            private final /* synthetic */ boolean f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final boolean test(Object obj) {
                return HelpDeskViewModel.this.lambda$getRentTickets$59$HelpDeskViewModel(this.f$1, this.f$2, (Tickets) obj);
            }
        }).map($$Lambda$HelpDeskViewModel$wmGIlpCrboxMRUPZGDK7riLKApg.INSTANCE).toSortedList($$Lambda$HelpDeskViewModel$2GycUXzFxonsmXT460CTwCbiXJg.INSTANCE).toFlowable().doOnNext($$Lambda$HelpDeskViewModel$fbnVSm65hBPB8SovDBgvBZv5Kmw.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).filter($$Lambda$HelpDeskViewModel$d67rroKCBi9_MX3YB18aB4MUEO4.INSTANCE)).subscribe(new Consumer() {
            public final void accept(Object obj) {
                HelpDeskViewModel.this.lambda$getRentTickets$64$HelpDeskViewModel((List) obj);
            }
        }));
    }

    static /* synthetic */ boolean lambda$getRentTickets$50(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    static /* synthetic */ int lambda$getRentTickets$54(Tickets tickets, Tickets tickets2) {
        return tickets2.getId() - tickets.getId();
    }

    static /* synthetic */ boolean lambda$getRentTickets$55(List list) throws Exception {
        return !list.isEmpty();
    }

    static /* synthetic */ boolean lambda$getRentTickets$56(Resource resource) throws Exception {
        return (resource == null || resource.getData() == null || ((RentTicketList) resource.getData()).getTicketsList().isEmpty()) ? false : true;
    }

    static /* synthetic */ int lambda$getRentTickets$61(Tickets tickets, Tickets tickets2) {
        return tickets2.getId() - tickets.getId();
    }

    static /* synthetic */ boolean lambda$getRentTickets$63(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    public /* synthetic */ void lambda$getRentTickets$64$HelpDeskViewModel(List list) throws Exception {
        this.rentTicketMutableLiveData.setValue(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: filterData */
    public boolean lambda$getRentTickets$59$HelpDeskViewModel(Tickets tickets, boolean z, String str) {
        TicketType type = TicketType.getType(tickets.getTicket().getTicketState().getSlug());
        boolean z2 = type.equals(TicketType.DONE) || type.equals(TicketType.CLOSED) || type.equals(TicketType.CANCELED) || type.equals(TicketType.DENIED);
        boolean z3 = !type.equals(TicketType.DONE) && !type.equals(TicketType.CLOSED) && !type.equals(TicketType.CANCELED) && !type.equals(TicketType.DENIED);
        if (str == null || str.isEmpty()) {
            boolean z4 = tickets.getTicket().getSectionId() == null || tickets.getTicket().getSectionId().equals("0");
            if (z) {
                if (!z2) {
                    return false;
                }
            } else if (!z3) {
                return false;
            }
            if (z4) {
                return true;
            }
            return false;
        }
        if (z) {
            if (!z2) {
                return false;
            }
        } else if (!z3) {
            return false;
        }
        if (str.equals(tickets.getTicket().getSectionId())) {
            return true;
        }
        return false;
    }

    public MutableLiveData<List<Tickets>> getRentTicket() {
        return this.rentTicketMutableLiveData;
    }

    public void getAvailableMyRentUniqe() {
        this.rentaRepository.getRentTypeList().filter($$Lambda$HelpDeskViewModel$XljwQ51CXv3SlIOrFRfhnwBpHk.INSTANCE).map($$Lambda$TYmyI4K1yNGNwZH9WLDfWQ1OnE0.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                HelpDeskViewModel.this.lambda$getAvailableMyRentUniqe$66$HelpDeskViewModel((List) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$getAvailableMyRentUniqe$65(Resource resource) throws Exception {
        return resource.getData() != null;
    }

    public /* synthetic */ void lambda$getAvailableMyRentUniqe$66$HelpDeskViewModel(List list) throws Exception {
        getRentTypeMutableLiveData().setValue(list);
    }

    public MutableLiveData<List<RentType>> getRentTypeMutableLiveData() {
        return this.rentTypeMutableLiveData;
    }

    public void getMyRentaUniqe() {
        this.rentaRepository.getRentaList().filter($$Lambda$HelpDeskViewModel$fNWDNuzZ4dUsl3wUzRQUH9i7yrM.INSTANCE).flatMapIterable($$Lambda$O6XizmHFvqYdGEH4KzC0T7oI2LY.INSTANCE).map($$Lambda$HelpDeskViewModel$GE_7DveujztgWgK2FHE_spbTuiM.INSTANCE).distinct($$Lambda$HelpDeskViewModel$4_sXPYO_7dL7rSQVJONvUpCN48.INSTANCE).toList().toFlowable().map(new Function() {
            public final Object apply(Object obj) {
                return HelpDeskViewModel.this.lambda$getMyRentaUniqe$70$HelpDeskViewModel((List) obj);
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe();
    }

    static /* synthetic */ boolean lambda$getMyRentaUniqe$67(Resource resource) throws Exception {
        return resource.getData() != null;
    }

    public /* synthetic */ List lambda$getMyRentaUniqe$70$HelpDeskViewModel(List list) throws Exception {
        getCurrentRentInfo().postValue(list.get(0));
        return list;
    }

    public SingleLiveEvent<RentInfo> getCurrentRentInfo() {
        return this.currentRentInfo;
    }

    public SingleLiveEvent<IKeyValueData> getCurrentTicketProperty() {
        return this.currentTicketProperty;
    }

    public void saveTitleText(TicketInfo ticketInfo) {
        this.currentTicketInfoData.setValue(ticketInfo);
    }

    public MutableLiveData<TicketInfo> getCurrentTicketInfoData() {
        return this.currentTicketInfoData;
    }

    public MutableLiveData<Map<String, String>> setTicketAdditionInfo() {
        return this.additionalTicketInf0;
    }

    public void getAsImDirector() {
        this.rentaRepository.getAsImDirector(1).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                HelpDeskViewModel.this.lambda$getAsImDirector$71$HelpDeskViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$getAsImDirector$71$HelpDeskViewModel(Resource resource) throws Exception {
        this.getCompanyListAsDirector.setValue(resource);
    }

    public SingleLiveEvent<Resource<CompanyList>> getAsImDirectorSingleLiveEvent() {
        return this.getCompanyListAsDirector;
    }

    public MutableLiveData<Set<RentChildren>> getChoosenRentChildren() {
        return this.choosenRentChildren;
    }

    public /* synthetic */ void lambda$makeTicketAction$72$HelpDeskViewModel(Resource resource) throws Exception {
        getOnMakeTicketActionLiveData().postValue(resource);
    }

    public void makeTicketAction(int i, String str) {
        this.remoteRepo.changeTicketState(i, str).subscribe(new Consumer() {
            public final void accept(Object obj) {
                HelpDeskViewModel.this.lambda$makeTicketAction$72$HelpDeskViewModel((Resource) obj);
            }
        });
    }

    public SingleLiveEvent<Resource<KolyaSuccesModel>> getOnMakeTicketActionLiveData() {
        return this.onMakeTicketActionLiveData;
    }

    public MutableLiveData<List<ServiceTicketType>> getTicketTypeList() {
        return this.ticketTypeList;
    }

    public void evaluateTicket(String str, int i, String str2) {
        this.remoteRepo.evaluateTicket(str, i, str2).subscribe(new Consumer() {
            public final void accept(Object obj) {
                HelpDeskViewModel.this.lambda$evaluateTicket$73$HelpDeskViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$evaluateTicket$73$HelpDeskViewModel(Resource resource) throws Exception {
        getEvaluateTicketLiveData().postValue(resource);
    }

    public SingleLiveEvent<Resource<CreateTicket>> getEvaluateTicketLiveData() {
        return this.evaluateTicketLiveData;
    }
}
