package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import org.reactivestreams.Publisher;
import p035ru.unicorn.ujin.data.api.response.SimpleResponse;
import p035ru.unicorn.ujin.data.api.response.profile.GetBuildingResponse;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.entity.KolyaSuccesModel;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.CompanyObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.Employee;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.ObjectRentInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.StatusType;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentaRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.MyProfileRemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.Flowable;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.functions.BiFunction;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.functions.Function;
import p046io.reactivex.functions.Predicate;
import p046io.reactivex.schedulers.Schedulers;
import p046io.realm.RealmModel;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.MyRentaCompanyViewModel */
public class MyRentaCompanyViewModel extends BaseViewModel {
    public boolean afterChangingEmployeeProperty = false;
    private final SingleLiveEvent<GetBuildingResponse> buildingMutableLiveData = new SingleLiveEvent<>();
    public boolean companyLoaded = false;
    private final SingleLiveEvent<Resource<CompanyListUno>> companyMutableLiveData = new SingleLiveEvent<>();
    public boolean companyObjectsLoaded = false;
    private final SingleLiveEvent<List<CompanyObject>> companyObjectsMutableLiveData = new SingleLiveEvent<>();
    private final CompanyRentaRepository companyRepository = new CompanyRentaRepository();
    private final MutableLiveData<Integer> currentCompanyIdMutableLiveData = new MutableLiveData<>();
    private final SingleLiveEvent<RentCompany> currentCompanyMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<CompanyObject> currentCompanyObjectMutableLiveData = new SingleLiveEvent<>();
    private final MutableLiveData<UserProfile> currentProfile = new MutableLiveData<>();
    private final SingleLiveEvent<Resource<KolyaSuccesModel>> isSuccesDeleteCompany = new SingleLiveEvent<>();
    private final SingleLiveEvent<Resource<KolyaSuccesModel>> isSuccesDeletePerson = new SingleLiveEvent<>();
    private final SingleLiveEvent<Resource<EmployerListSingle>> isSuccessDeletePlace = new SingleLiveEvent<>();
    private final SingleLiveEvent<Resource<List<RentCompany>>> listCompanyMutableLiveData = new SingleLiveEvent<>();
    private final LocalRepository localRepository = LocalRepository.getInstance();
    private final MyProfileRemoteRepository myProfileRemoteRepository = new MyProfileRemoteRepository();
    private final ProfileRemoteRepository profileRemoteRepository = new ProfileRemoteRepository();
    private final RemoteRepository remoteRepository = new RemoteRepository();
    private final RentaRepository rentaRepository = new RentaRepository();
    private final SingleLiveEvent<Resource<SimpleResponse>> setPlaceLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<List<UserProfile>> userCompanyMutableLiveData = new SingleLiveEvent<>();

    static /* synthetic */ boolean lambda$getCompanyById$38(RealmModel realmModel) throws Exception {
        return realmModel != null;
    }

    static /* synthetic */ RealmModel lambda$getCompanyById$39(RealmModel realmModel) throws Exception {
        return realmModel;
    }

    static /* synthetic */ Iterable lambda$getCurrentCompany$13(List list) throws Exception {
        return list;
    }

    static /* synthetic */ CompanyObject lambda$getEnterpriseCompanyObjects$48(CompanyObject companyObject) throws Exception {
        return companyObject;
    }

    public void getCompanyList() {
        this.companyRepository.getCompanyList().map(new Function() {
            public final Object apply(Object obj) {
                return MyRentaCompanyViewModel.this.lambda$getCompanyList$0$MyRentaCompanyViewModel((Resource) obj);
            }
        }).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                MyRentaCompanyViewModel.this.lambda$getCompanyList$1$MyRentaCompanyViewModel((Resource) obj);
            }
        }).filter($$Lambda$MyRentaCompanyViewModel$UExCNz3YIwbZw3mCbCGm4lJ4FQ.INSTANCE).filter($$Lambda$MyRentaCompanyViewModel$I8JczenQd_OaLMBuu16JH0JzzKw.INSTANCE).flatMapIterable($$Lambda$MyRentaCompanyViewModel$hxVjt1aGBXj1s0lWc9SuFouforU.INSTANCE).cast(RentCompany.class).filter($$Lambda$MyRentaCompanyViewModel$p_6nmoy9zAlWYfxeVsuapcGoHg.INSTANCE).toList().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaCompanyViewModel.this.lambda$getCompanyList$6$MyRentaCompanyViewModel((List) obj);
            }
        });
    }

    public /* synthetic */ Resource lambda$getCompanyList$0$MyRentaCompanyViewModel(Resource resource) throws Exception {
        if (resource != null && resource.getStatus().equals(Resource.Status.ERROR)) {
            this.listCompanyMutableLiveData.postValue(Resource.success(1, resource.getMessage(), null));
        }
        return resource;
    }

    public /* synthetic */ void lambda$getCompanyList$1$MyRentaCompanyViewModel(Resource resource) throws Exception {
        if (resource.getData() != null) {
            this.localRepository.saveDataAsList((List) resource.getData(), RentCompany.class, true);
        }
    }

    static /* synthetic */ boolean lambda$getCompanyList$3(Resource resource) throws Exception {
        return (resource == null || resource.getData() == null || ((List) resource.getData()).isEmpty()) ? false : true;
    }

    static /* synthetic */ Iterable lambda$getCompanyList$4(Resource resource) throws Exception {
        return (List) resource.getData();
    }

    static /* synthetic */ boolean lambda$getCompanyList$5(RentCompany rentCompany) throws Exception {
        return rentCompany != null && rentCompany.isEmployeeVerified();
    }

    public /* synthetic */ void lambda$getCompanyList$6$MyRentaCompanyViewModel(List list) throws Exception {
        this.listCompanyMutableLiveData.setValue(Resource.success(0, "", list));
    }

    public void loadCurrentCompany() {
        this.companyRepository.getCompanyList().filter($$Lambda$MyRentaCompanyViewModel$O8plStI0X9Vt2K66Cp3YqvwNyQ.INSTANCE).filter($$Lambda$MyRentaCompanyViewModel$D76ArkKjTKLzEWowpu9KnoQc9I.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                MyRentaCompanyViewModel.this.lambda$loadCurrentCompany$9$MyRentaCompanyViewModel((Resource) obj);
            }
        }).flatMapIterable($$Lambda$MyRentaCompanyViewModel$qCJv6OwoVscTEAx2EXcAc0U4FI.INSTANCE).cast(RentCompany.class).filter(new Predicate(getCurrentCompanyIdMutableLiveData().getValue()) {
            private final /* synthetic */ Integer f$0;

            {
                this.f$0 = r1;
            }

            public final boolean test(Object obj) {
                return ((RentCompany) obj).getId().equals(this.f$0);
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaCompanyViewModel.this.lambda$loadCurrentCompany$12$MyRentaCompanyViewModel((RentCompany) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$loadCurrentCompany$8(Resource resource) throws Exception {
        return (resource == null || resource.getData() == null || ((List) resource.getData()).isEmpty()) ? false : true;
    }

    public /* synthetic */ void lambda$loadCurrentCompany$9$MyRentaCompanyViewModel(Resource resource) throws Exception {
        if (resource.getData() != null) {
            this.localRepository.saveDataAsList((List) resource.getData(), RentCompany.class, true);
        }
    }

    static /* synthetic */ Iterable lambda$loadCurrentCompany$10(Resource resource) throws Exception {
        return (List) resource.getData();
    }

    public /* synthetic */ void lambda$loadCurrentCompany$12$MyRentaCompanyViewModel(RentCompany rentCompany) throws Exception {
        getCurrentCompanyMutableLiveData().setValue(rentCompany);
    }

    /* access modifiers changed from: package-private */
    public void getCurrentCompany() {
        ProfileLocalRepository.Companion.getInstance().getUser().getId();
        this.localRepository.getData(RentCompany.class).flatMapIterable($$Lambda$MyRentaCompanyViewModel$QR4KFP9baxtXvQevsVVbAqZLto4.INSTANCE).cast(RentCompany.class).filter(new Predicate(getCurrentCompanyIdMutableLiveData().getValue()) {
            private final /* synthetic */ Integer f$0;

            {
                this.f$0 = r1;
            }

            public final boolean test(Object obj) {
                return ((RentCompany) obj).getId().equals(this.f$0);
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaCompanyViewModel.this.lambda$getCurrentCompany$15$MyRentaCompanyViewModel((RentCompany) obj);
            }
        });
    }

    public /* synthetic */ void lambda$getCurrentCompany$15$MyRentaCompanyViewModel(RentCompany rentCompany) throws Exception {
        getCurrentCompanyMutableLiveData().setValue(rentCompany);
    }

    public void getCurrentCompanyUsers() {
        this.companyRepository.getCompanuyEmployersList(getCurrentCompanyIdMutableLiveData().getValue()).filter($$Lambda$MyRentaCompanyViewModel$TDm0Hmo72DRUzb4w1fTR4Zv7HE.INSTANCE).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                MyRentaCompanyViewModel.this.lambda$getCurrentCompanyUsers$17$MyRentaCompanyViewModel((Resource) obj);
            }
        }).map($$Lambda$MyRentaCompanyViewModel$QfJF7r_Qp5HAnWDGPBHrzm5VsJA.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).first(Collections.emptyList()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaCompanyViewModel.this.lambda$getCurrentCompanyUsers$19$MyRentaCompanyViewModel((List) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$getCurrentCompanyUsers$16(Resource resource) throws Exception {
        return (resource == null || resource.getData() == null || ((EmployerList) resource.getData()).getUserProfiles() == null) ? false : true;
    }

    public /* synthetic */ void lambda$getCurrentCompanyUsers$17$MyRentaCompanyViewModel(Resource resource) throws Exception {
        if (resource.getData() != null) {
            this.localRepository.saveDataAsList(((EmployerList) resource.getData()).getUserProfiles(), UserProfile.class, true);
        }
    }

    public /* synthetic */ void lambda$getCurrentCompanyUsers$19$MyRentaCompanyViewModel(List list) throws Exception {
        getUsersCompanyMutableLiveData().setValue(list);
    }

    public SingleLiveEvent<Resource<List<RentCompany>>> getListCompanyMutableLiveData() {
        return this.listCompanyMutableLiveData;
    }

    public MutableLiveData<Integer> getCurrentCompanyIdMutableLiveData() {
        return this.currentCompanyIdMutableLiveData;
    }

    public SingleLiveEvent<RentCompany> getCurrentCompanyMutableLiveData() {
        return this.currentCompanyMutableLiveData;
    }

    public SingleLiveEvent<List<UserProfile>> getUsersCompanyMutableLiveData() {
        return this.userCompanyMutableLiveData;
    }

    public void createCompany(CreateCompanyModel createCompanyModel) {
        this.companyRepository.createCompany(createCompanyModel).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                MyRentaCompanyViewModel.this.lambda$createCompany$20$MyRentaCompanyViewModel((Resource) obj);
            }
        }).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaCompanyViewModel.this.lambda$createCompany$21$MyRentaCompanyViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$createCompany$20$MyRentaCompanyViewModel(Resource resource) throws Exception {
        if (resource.getStatus().equals(Resource.Status.SUCCESS)) {
            getCurrentCompanyMutableLiveData().setValue(((CompanyListUno) resource.getData()).getRentCompany());
            getCurrentCompanyIdMutableLiveData().setValue(Integer.valueOf(Integer.parseInt(((CompanyListUno) resource.getData()).getRentCompany().getId())));
        }
    }

    public /* synthetic */ void lambda$createCompany$21$MyRentaCompanyViewModel(Resource resource) throws Exception {
        this.companyMutableLiveData.setValue(resource);
    }

    public void updateCompany(CreateCompanyModel createCompanyModel) {
        createCompanyModel.setId(String.valueOf(getCurrentCompanyIdMutableLiveData().getValue()));
        this.companyRepository.updateCompany(createCompanyModel).flatMap(new Function() {
            public final Object apply(Object obj) {
                return MyRentaCompanyViewModel.this.lambda$updateCompany$22$MyRentaCompanyViewModel((Resource) obj);
            }
        }, new BiFunction() {
            public final Object apply(Object obj, Object obj2) {
                return MyRentaCompanyViewModel.this.lambda$updateCompany$23$MyRentaCompanyViewModel((Resource) obj, (Schemas) obj2);
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaCompanyViewModel.this.lambda$updateCompany$24$MyRentaCompanyViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ Publisher lambda$updateCompany$22$MyRentaCompanyViewModel(Resource resource) throws Exception {
        return this.remoteRepository.getSchema(false);
    }

    public /* synthetic */ Resource lambda$updateCompany$23$MyRentaCompanyViewModel(Resource resource, Schemas schemas) throws Exception {
        if (resource.getData() != null) {
            this.localRepository.saveDataOrUpdate(((CompanyListUno) resource.getData()).getRentCompany());
        }
        if (schemas != null) {
            this.localRepository.saveDataOrUpdate(schemas);
        }
        return resource;
    }

    public /* synthetic */ void lambda$updateCompany$24$MyRentaCompanyViewModel(Resource resource) throws Exception {
        this.companyMutableLiveData.setValue(resource);
    }

    public MutableLiveData<Resource<CompanyListUno>> getCompanyMutableLiveData() {
        return this.companyMutableLiveData;
    }

    public void deleteCompany() {
        this.companyRepository.deleteCompany(new CreateCompanyModel(String.valueOf(getCurrentCompanyIdMutableLiveData().getValue()))).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaCompanyViewModel.this.lambda$deleteCompany$25$MyRentaCompanyViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$deleteCompany$25$MyRentaCompanyViewModel(Resource resource) throws Exception {
        isSuccesDeleteCompany().setValue(resource);
    }

    public SingleLiveEvent<Resource<KolyaSuccesModel>> isSuccesDeleteCompany() {
        return this.isSuccesDeleteCompany;
    }

    public void getUserById(int i) {
        if (getCurrentProfile().getValue() != null) {
            getCurrentProfile().getValue().getUserdata().getId().intValue();
        }
        List value = getUsersCompanyMutableLiveData().getValue();
        for (int i2 = 0; i2 < value.size(); i2++) {
            if (((UserProfile) value.get(i2)).getUserdata().getId().equals(Integer.valueOf(i))) {
                this.currentProfile.setValue(value.get(i2));
            }
        }
    }

    public MutableLiveData<UserProfile> getCurrentProfile() {
        return this.currentProfile;
    }

    public void addPerson(String str, String str2, String str3, String str4, String str5) {
        this.myProfileRemoteRepository.inviteContact(str, str2, getCurrentCompanyIdMutableLiveData().getValue().intValue(), str3, str4, str5).filter($$Lambda$MyRentaCompanyViewModel$UINv0V3qxjTX2NGtnVvrmwptL9o.INSTANCE).filter($$Lambda$MyRentaCompanyViewModel$WCpbCZaeeIL7UN0FmsjduUlRUQc.INSTANCE).map($$Lambda$MyRentaCompanyViewModel$3PF5FBF0soboy51pDFGnnTDyxk.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaCompanyViewModel.this.lambda$addPerson$29$MyRentaCompanyViewModel((UserProfile) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$addPerson$27(Resource resource) throws Exception {
        return resource.getData() != null;
    }

    public /* synthetic */ void lambda$addPerson$29$MyRentaCompanyViewModel(UserProfile userProfile) throws Exception {
        updateList(userProfile, false);
    }

    private void updateList(UserProfile userProfile, Boolean bool) {
        List value = getUsersCompanyMutableLiveData().getValue();
        if (value != null && !bool.booleanValue()) {
            value.add(userProfile);
        } else if (value != null) {
            value.remove(userProfile);
        }
        getUsersCompanyMutableLiveData().setValue(value);
    }

    public void deletePerson() {
        UserProfile value = getCurrentProfile().getValue();
        this.myProfileRemoteRepository.removeUser(value.getUserdata().getId().intValue(), getCurrentCompanyIdMutableLiveData().getValue().intValue()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer(value) {
            private final /* synthetic */ UserProfile f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                MyRentaCompanyViewModel.this.lambda$deletePerson$30$MyRentaCompanyViewModel(this.f$1, (Resource) obj);
            }
        }).subscribe(new Consumer(value) {
            private final /* synthetic */ UserProfile f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                MyRentaCompanyViewModel.this.lambda$deletePerson$31$MyRentaCompanyViewModel(this.f$1, (Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$deletePerson$30$MyRentaCompanyViewModel(UserProfile userProfile, Resource resource) throws Exception {
        if (resource.getStatus().equals(Resource.Status.SUCCESS)) {
            Log.d("TAG", "XXX  deletePerson " + userProfile.getUserdata().getId());
            this.localRepository.deleteItemById(UserData.class, "id", userProfile.getUserdata().getId().intValue());
        }
    }

    public /* synthetic */ void lambda$deletePerson$31$MyRentaCompanyViewModel(UserProfile userProfile, Resource resource) throws Exception {
        updateList(userProfile, true);
        this.isSuccesDeletePerson.postValue(resource);
    }

    public void deletePlace(String str) {
        UserProfile value = getCurrentProfile().getValue();
        ArrayList arrayList = new ArrayList();
        arrayList.add(value.getUserdata().getId());
        this.rentaRepository.removeRent(str, arrayList).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer(value) {
            private final /* synthetic */ UserProfile f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                MyRentaCompanyViewModel.this.lambda$deletePlace$32$MyRentaCompanyViewModel(this.f$1, (Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$deletePlace$32$MyRentaCompanyViewModel(UserProfile userProfile, Resource resource) throws Exception {
        updateList(userProfile, true);
        this.isSuccessDeletePlace.postValue(resource);
    }

    public SingleLiveEvent<Resource<KolyaSuccesModel>> getIsSuccesDeletePerson() {
        return this.isSuccesDeletePerson;
    }

    public SingleLiveEvent<Resource<EmployerListSingle>> getIsSuccessDeletePlace() {
        return this.isSuccessDeletePlace;
    }

    public SingleLiveEvent<Resource<SimpleResponse>> getSetPlacePlace() {
        return this.setPlaceLiveData;
    }

    public void changePermissioms(List<String> list) {
        this.companyRepository.setPermissions(list, getCurrentProfile().getValue(), Integer.valueOf(Integer.parseInt(getCurrentCompanyMutableLiveData().getValue().getId()))).filter($$Lambda$MyRentaCompanyViewModel$uJ92SG7GlzmwGFpOPGXwb46_xXo.INSTANCE).filter($$Lambda$MyRentaCompanyViewModel$P2tDtO0gAzE33mO6ZufqgEnHKi0.INSTANCE).map($$Lambda$MyRentaCompanyViewModel$GlXOSHa_DTBLZrgsKulynKxcBe0.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaCompanyViewModel.this.lambda$changePermissioms$36$MyRentaCompanyViewModel((UserProfile) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$changePermissioms$33(Resource resource) throws Exception {
        return (resource == null || resource.getData() == null) ? false : true;
    }

    static /* synthetic */ boolean lambda$changePermissioms$34(Resource resource) throws Exception {
        return (resource.getData() == null || ((EmployerListSingle) resource.getData()).userProfiles == null) ? false : true;
    }

    public /* synthetic */ void lambda$changePermissioms$36$MyRentaCompanyViewModel(UserProfile userProfile) throws Exception {
        getCurrentProfile().setValue(userProfile);
    }

    public void setEmployeePlace(String str) {
        this.companyRepository.setEmployeePlace(str, getCurrentProfile().getValue().getUserdata().getId().toString()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyRentaCompanyViewModel.this.lambda$setEmployeePlace$37$MyRentaCompanyViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$setEmployeePlace$37$MyRentaCompanyViewModel(Resource resource) throws Exception {
        this.setPlaceLiveData.setValue(resource);
    }

    public void getCompanyById() {
        Integer value = getCurrentCompanyIdMutableLiveData().getValue();
        if (value != null) {
            this.companyLoaded = false;
            Flowable<U> filter = this.localRepository.getElementById((Class<? extends RealmModel>) RentCompany.class, value.toString(), "id").filter($$Lambda$MyRentaCompanyViewModel$tLtXbkaU10r8baF2hK19IIhvjU.INSTANCE).map($$Lambda$MyRentaCompanyViewModel$IN9JX7SprIhnkoJxLyKXi5y0xAM.INSTANCE).cast(RentCompany.class).filter($$Lambda$MyRentaCompanyViewModel$IdmrkvyKG4QM22VspYu2cN0be5g.INSTANCE);
            this.companyRepository.getCompanyById(value).map(new Function() {
                public final Object apply(Object obj) {
                    return MyRentaCompanyViewModel.this.lambda$getCompanyById$41$MyRentaCompanyViewModel((Resource) obj);
                }
            }).filter($$Lambda$MyRentaCompanyViewModel$D0EHIOQlIh1xfqxO91bpBZDYbNQ.INSTANCE).map($$Lambda$MyRentaCompanyViewModel$d4Jg3PcIeXaDOwh0EDYTtYoAcXs.INSTANCE).doOnNext(new Consumer() {
                public final void accept(Object obj) {
                    MyRentaCompanyViewModel.this.lambda$getCompanyById$44$MyRentaCompanyViewModel((RentCompany) obj);
                }
            }).onErrorResumeNext(filter).startWith(filter).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MyRentaCompanyViewModel.this.lambda$getCompanyById$45$MyRentaCompanyViewModel((RentCompany) obj);
                }
            });
        }
    }

    static /* synthetic */ boolean lambda$getCompanyById$40(RentCompany rentCompany) throws Exception {
        return rentCompany.getUserProfiles() != null;
    }

    public /* synthetic */ Resource lambda$getCompanyById$41$MyRentaCompanyViewModel(Resource resource) throws Exception {
        if (resource.getStatus().equals(Resource.Status.ERROR)) {
            this.companyLoaded = true;
            this.currentCompanyMutableLiveData.postValue(null);
        }
        return resource;
    }

    static /* synthetic */ boolean lambda$getCompanyById$42(Resource resource) throws Exception {
        return (resource == null || !resource.getStatus().equals(Resource.Status.SUCCESS) || resource.getData() == null || ((RentCompany) resource.getData()).getUserProfiles() == null) ? false : true;
    }

    static /* synthetic */ RentCompany lambda$getCompanyById$43(Resource resource) throws Exception {
        return (RentCompany) resource.getData();
    }

    public /* synthetic */ void lambda$getCompanyById$44$MyRentaCompanyViewModel(RentCompany rentCompany) throws Exception {
        this.localRepository.saveDataOrUpdate(rentCompany);
    }

    public /* synthetic */ void lambda$getCompanyById$45$MyRentaCompanyViewModel(RentCompany rentCompany) throws Exception {
        this.companyLoaded = true;
        this.currentCompanyMutableLiveData.postValue(rentCompany);
    }

    public void getEnterpriseCompanyObjects() {
        Integer value = getCurrentCompanyIdMutableLiveData().getValue();
        if (value != null) {
            this.companyObjectsLoaded = false;
            this.companyRepository.getEnterpriseCompanyObjects(value).map(new Function() {
                public final Object apply(Object obj) {
                    return MyRentaCompanyViewModel.this.lambda$getEnterpriseCompanyObjects$46$MyRentaCompanyViewModel((Resource) obj);
                }
            }).filter($$Lambda$MyRentaCompanyViewModel$CfEuYmdF1aAlKhYisuocIhThKos.INSTANCE).flatMapIterable($$Lambda$O6XizmHFvqYdGEH4KzC0T7oI2LY.INSTANCE).map($$Lambda$MyRentaCompanyViewModel$xgcepNyCo1Hg40m4Hgo9STBx_iI.INSTANCE).filter(new Predicate() {
                public final boolean test(Object obj) {
                    return MyRentaCompanyViewModel.this.lambda$getEnterpriseCompanyObjects$49$MyRentaCompanyViewModel((CompanyObject) obj);
                }
            }).toList().toFlowable().filter($$Lambda$MyRentaCompanyViewModel$U0xee2YlygUMUCDau8pig93OT64.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MyRentaCompanyViewModel.this.lambda$getEnterpriseCompanyObjects$51$MyRentaCompanyViewModel((List) obj);
                }
            });
        }
    }

    public /* synthetic */ Resource lambda$getEnterpriseCompanyObjects$46$MyRentaCompanyViewModel(Resource resource) throws Exception {
        if (resource.getStatus().equals(Resource.Status.ERROR)) {
            this.companyObjectsLoaded = true;
            this.companyObjectsMutableLiveData.postValue(null);
        }
        return resource;
    }

    static /* synthetic */ boolean lambda$getEnterpriseCompanyObjects$47(Resource resource) throws Exception {
        return (resource == null || !resource.getStatus().equals(Resource.Status.SUCCESS) || resource.getData() == null) ? false : true;
    }

    public /* synthetic */ boolean lambda$getEnterpriseCompanyObjects$49$MyRentaCompanyViewModel(CompanyObject companyObject) throws Exception {
        return (companyObject.getRents() != null && !companyObject.getRents().isEmpty() && hasActualRent(companyObject.getRents()).booleanValue()) || (companyObject.getStatus() != null && companyObject.getStatus().equals(StatusType.OWNER.getStatus()));
    }

    static /* synthetic */ boolean lambda$getEnterpriseCompanyObjects$50(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    public /* synthetic */ void lambda$getEnterpriseCompanyObjects$51$MyRentaCompanyViewModel(List list) throws Exception {
        this.companyObjectsLoaded = true;
        this.companyObjectsMutableLiveData.postValue(list);
    }

    private Boolean hasActualRent(List<ObjectRentInfo> list) {
        Calendar parseDate;
        boolean z = false;
        for (ObjectRentInfo next : list) {
            if (next.getFinishDate() != null && !next.getFinishDate().equals("") && (parseDate = DateUtils.parseDate(next.getFinishDate(), "yyyy-MM-dd HH:mm:ss")) != null && !DateUtils.isPastDate(parseDate)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public SingleLiveEvent<List<CompanyObject>> getCompanyObjectsMutableLiveData() {
        return this.companyObjectsMutableLiveData;
    }

    public SingleLiveEvent<CompanyObject> getCurrentCompanyObjectMutableLiveData() {
        return this.currentCompanyObjectMutableLiveData;
    }

    public SingleLiveEvent<GetBuildingResponse> getBuildingMutableLiveData() {
        return this.buildingMutableLiveData;
    }

    public ArrayList<UserProfile> getCompanyObjectEmployees() {
        ArrayList<UserProfile> arrayList = new ArrayList<>();
        if (!(this.currentCompanyObjectMutableLiveData.getValue() == null || this.currentCompanyObjectMutableLiveData.getValue().getRents() == null || this.currentCompanyObjectMutableLiveData.getValue().getRents().isEmpty())) {
            List<Employee> employees = this.currentCompanyObjectMutableLiveData.getValue().getRents().get(0).getEmployees();
            if (!(this.currentCompanyMutableLiveData.getValue() == null || this.currentCompanyMutableLiveData.getValue().getUserProfiles() == null || this.currentCompanyMutableLiveData.getValue().getUserProfiles().isEmpty())) {
                for (UserProfile next : this.currentCompanyMutableLiveData.getValue().getUserProfiles()) {
                    for (Employee next2 : employees) {
                        if (!(next.getUserdata() == null || next.getUserdata().getId() == null || !next.getUserdata().getId().equals(next2.getId()))) {
                            arrayList.add(next);
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
