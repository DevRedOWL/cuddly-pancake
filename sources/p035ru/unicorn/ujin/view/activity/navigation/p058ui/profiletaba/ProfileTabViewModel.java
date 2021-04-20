package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba;

import androidx.lifecycle.MutableLiveData;
import java.util.List;
import p035ru.unicorn.ujin.data.api.response.SimpleResponse;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CompanyRentaRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentaRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.response.CompanyApplicationsResponse;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.MyProfileLocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.MyProfileRemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileData;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.Flowable;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.functions.Predicate;
import p046io.reactivex.schedulers.Schedulers;
import p046io.realm.RealmList;
import p046io.realm.RealmModel;
import p046io.realm.RealmObject;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.ProfileTabViewModel */
public class ProfileTabViewModel extends BaseViewModel {
    private final SingleLiveEvent<Resource<CompanyApplicationsResponse>> companyApplicationsLiveData = new SingleLiveEvent<>();
    private final CompanyRentaRepository companyRentaRepository = new CompanyRentaRepository();
    private final SingleLiveEvent<ProfileData> getProfileData = new SingleLiveEvent<>();
    private final MutableLiveData<Boolean> hasFIO = new MutableLiveData<>();
    private final SingleLiveEvent<Resource<List<RentCompany>>> listCompanyMutableLiveData = new SingleLiveEvent<>();
    private final LocalRepository localRepository = LocalRepository.getInstance();
    private final MyProfileLocalRepository myProfileLocalRepository = new MyProfileLocalRepository();
    private final MyProfileRemoteRepository myProfileRemoteRepository = new MyProfileRemoteRepository();
    private final SingleLiveEvent<Resource<SimpleResponse>> readCompanyApplicationLiveData = new SingleLiveEvent<>();
    private final RemoteRepository remoteRepository = new RemoteRepository();
    private final SingleLiveEvent<RentType> rentInfoByName = new SingleLiveEvent<>();
    private final RentaRepository rentaRepository;
    private final MutableLiveData<List<Schema>> schemaMutableLiveData = new MutableLiveData<>();
    private final boolean show = true;

    static /* synthetic */ Iterable lambda$getTypeByName$13(List list) throws Exception {
        return list;
    }

    static /* synthetic */ Iterable lambda$getTypeByName$17(List list) throws Exception {
        return list;
    }

    static /* synthetic */ boolean lambda$getUserData$6(RealmModel realmModel) throws Exception {
        return realmModel != null;
    }

    static /* synthetic */ RealmModel lambda$getUserData$7(RealmModel realmModel) throws Exception {
        return realmModel;
    }

    public ProfileTabViewModel() {
        getHasFIO().setValue(true);
        this.rentaRepository = new RentaRepository();
        getHasFIO().setValue(false);
        getSchemaRemote();
        getTypes();
    }

    private void getTypes() {
        this.rentaRepository.getRentTypeList().filter($$Lambda$ProfileTabViewModel$6fNU9jI8ttJTdvpOp9sJF8c00A.INSTANCE).map($$Lambda$TYmyI4K1yNGNwZH9WLDfWQ1OnE0.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                ProfileTabViewModel.this.lambda$getTypes$1$ProfileTabViewModel((List) obj);
            }
        }).subscribeOn(Schedulers.m6765io()).cache().subscribe();
    }

    static /* synthetic */ boolean lambda$getTypes$0(Resource resource) throws Exception {
        return resource.getData() != null;
    }

    public /* synthetic */ void lambda$getTypes$1$ProfileTabViewModel(List list) throws Exception {
        this.localRepository.saveDataAsList(list, RentType.class, false);
    }

    public MutableLiveData<Boolean> getHasFIO() {
        return this.hasFIO;
    }

    public void getSchemas() {
        this.localRepository.getFistElement(Schemas.class).cast(Schemas.class).filter($$Lambda$ProfileTabViewModel$5Xi6aE5JQyAdTZrmCm4MstcvIg.INSTANCE).map($$Lambda$bF5QvgpEyHZK1akjIilS8V8j5r4.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).concatWith(getSchemaRemote()).firstElement().subscribe(new Consumer() {
            public final void accept(Object obj) {
                ProfileTabViewModel.this.lambda$getSchemas$3$ProfileTabViewModel((RealmList) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$getSchemas$2(Schemas schemas) throws Exception {
        return (schemas == null || schemas.getCabinet() == null || schemas.getCabinet().isEmpty()) ? false : true;
    }

    public /* synthetic */ void lambda$getSchemas$3$ProfileTabViewModel(RealmList realmList) throws Exception {
        this.schemaMutableLiveData.postValue(realmList);
    }

    private Flowable<RealmList<Schema>> getSchemaRemote() {
        return this.remoteRepository.getSchema(false).filter($$Lambda$ProfileTabViewModel$_Aq5tDA_uBomfHi2CVzEV4vhxGQ.INSTANCE).map($$Lambda$bF5QvgpEyHZK1akjIilS8V8j5r4.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                ProfileTabViewModel.this.lambda$getSchemaRemote$5$ProfileTabViewModel((RealmList) obj);
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).cache();
    }

    static /* synthetic */ boolean lambda$getSchemaRemote$4(Schemas schemas) throws Exception {
        return (schemas == null || schemas.getCabinet() == null || schemas.getCabinet().isEmpty()) ? false : true;
    }

    public /* synthetic */ void lambda$getSchemaRemote$5$ProfileTabViewModel(RealmList realmList) throws Exception {
        this.localRepository.saveDataOrUpdate((List<? extends RealmObject>) realmList);
    }

    public MutableLiveData<List<Schema>> getSchemaMutableLiveData() {
        return this.schemaMutableLiveData;
    }

    public void getUserData() {
        Flowable<U> cast = this.localRepository.getFistElement(ProfileData.class).filter($$Lambda$ProfileTabViewModel$Qcs6IgLXpn1eCI9tBiLuTn4JFV0.INSTANCE).map($$Lambda$ProfileTabViewModel$NOXXQiOnhVetanhCcr72xguPmU.INSTANCE).cast(ProfileData.class);
        this.myProfileRemoteRepository.getProfile().filter($$Lambda$ProfileTabViewModel$89xc0eQ3NS3glYM4SeqUprU2dk8.INSTANCE).map($$Lambda$ProfileTabViewModel$Z_YBcnsfTm18tN8pdmLIAz3NTk.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                ProfileTabViewModel.this.lambda$getUserData$10$ProfileTabViewModel((ProfileData) obj);
            }
        }).onErrorResumeNext(cast).startWith(cast).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                ProfileTabViewModel.this.lambda$getUserData$11$ProfileTabViewModel((ProfileData) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$getUserData$8(Resource resource) throws Exception {
        return resource != null && resource.getStatus().equals(Resource.Status.SUCCESS);
    }

    static /* synthetic */ ProfileData lambda$getUserData$9(Resource resource) throws Exception {
        return (ProfileData) resource.getData();
    }

    public /* synthetic */ void lambda$getUserData$10$ProfileTabViewModel(ProfileData profileData) throws Exception {
        this.localRepository.saveDataOrUpdate(profileData);
    }

    public /* synthetic */ void lambda$getUserData$11$ProfileTabViewModel(ProfileData profileData) throws Exception {
        this.getProfileData.postValue(profileData);
    }

    public void getTypeByName(String str) {
        this.compositeDisposable.add(Flowable.concat(this.localRepository.getData(RentType.class).filter($$Lambda$ProfileTabViewModel$4dmW3cXapZ92406KaqBGck3RQc.INSTANCE).flatMapIterable($$Lambda$ProfileTabViewModel$eNlrbZV1dVpkdEJR0EX5zseww0.INSTANCE).cast(RentType.class).filter(new Predicate(str) {
            private final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final boolean test(Object obj) {
                return ((RentType) obj).getName().toLowerCase().contains(this.f$0);
            }
        }).distinct(), this.rentaRepository.getRentTypeList().filter($$Lambda$ProfileTabViewModel$8_s3A5uQmFDT97IOe9xggA9ygbw.INSTANCE).map($$Lambda$TYmyI4K1yNGNwZH9WLDfWQ1OnE0.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                ProfileTabViewModel.this.lambda$getTypeByName$16$ProfileTabViewModel((List) obj);
            }
        }).flatMapIterable($$Lambda$ProfileTabViewModel$ylL6Phu6kzQ_FpMAFZB2H0iarCA.INSTANCE).cast(RentType.class).filter(new Predicate(str) {
            private final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final boolean test(Object obj) {
                return ((RentType) obj).getName().toLowerCase().contains(this.f$0);
            }
        }).distinct().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread())).firstElement().subscribe(new Consumer() {
            public final void accept(Object obj) {
                ProfileTabViewModel.this.lambda$getTypeByName$19$ProfileTabViewModel((RentType) obj);
            }
        }));
    }

    static /* synthetic */ boolean lambda$getTypeByName$12(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    static /* synthetic */ boolean lambda$getTypeByName$15(Resource resource) throws Exception {
        return resource.getData() != null;
    }

    public /* synthetic */ void lambda$getTypeByName$16$ProfileTabViewModel(List list) throws Exception {
        this.localRepository.saveDataAsList(list, RentType.class, true);
    }

    public /* synthetic */ void lambda$getTypeByName$19$ProfileTabViewModel(RentType rentType) throws Exception {
        getRentInfoByName().setValue(rentType);
    }

    public SingleLiveEvent<RentType> getRentInfoByName() {
        return this.rentInfoByName;
    }

    public SingleLiveEvent<ProfileData> getGetProfileData() {
        return this.getProfileData;
    }

    public void getCompanyList() {
        this.companyRentaRepository.getCompanyList().doOnNext(new Consumer() {
            public final void accept(Object obj) {
                ProfileTabViewModel.this.lambda$getCompanyList$20$ProfileTabViewModel((Resource) obj);
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                ProfileTabViewModel.this.lambda$getCompanyList$21$ProfileTabViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$getCompanyList$20$ProfileTabViewModel(Resource resource) throws Exception {
        if (resource.getData() != null) {
            this.localRepository.saveDataAsList((List) resource.getData(), RentCompany.class, true);
        }
    }

    public /* synthetic */ void lambda$getCompanyList$21$ProfileTabViewModel(Resource resource) throws Exception {
        this.listCompanyMutableLiveData.setValue(resource);
    }

    public SingleLiveEvent<Resource<List<RentCompany>>> getListCompanyMutableLiveData() {
        return this.listCompanyMutableLiveData;
    }

    public void getCompanyApplications() {
        this.companyRentaRepository.getCompanyApplications().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                ProfileTabViewModel.this.lambda$getCompanyApplications$22$ProfileTabViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$getCompanyApplications$22$ProfileTabViewModel(Resource resource) throws Exception {
        this.companyApplicationsLiveData.setValue(resource);
    }

    public SingleLiveEvent<Resource<CompanyApplicationsResponse>> getCompanyApplicationsLiveData() {
        return this.companyApplicationsLiveData;
    }

    public void readApplicationNotification(String str) {
        this.companyRentaRepository.readApplicationNotification(str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                ProfileTabViewModel.this.lambda$readApplicationNotification$23$ProfileTabViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$readApplicationNotification$23$ProfileTabViewModel(Resource resource) throws Exception {
        this.readCompanyApplicationLiveData.setValue(resource);
    }
}
