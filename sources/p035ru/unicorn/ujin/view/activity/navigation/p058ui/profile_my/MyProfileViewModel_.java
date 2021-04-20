package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my;

import androidx.lifecycle.MutableLiveData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.MyProfileRemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileData;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p046io.reactivex.Flowable;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.schedulers.Schedulers;
import p046io.realm.RealmModel;
import p046io.realm.RealmObject;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.MyProfileViewModel_ */
public class MyProfileViewModel_ extends BaseViewModel {
    private LocalRepository localRepository = LocalRepository.getInstance();
    private MutableLiveData<Resource<ProfileData>> myProfileDataMutableLiveData = new MutableLiveData<>();
    private MyProfileRemoteRepository myProfileRemoteRepository = new MyProfileRemoteRepository();

    static /* synthetic */ boolean lambda$getMyProfileLocal$2(RealmModel realmModel) throws Exception {
        return realmModel != null;
    }

    public void getMyProfile() {
        Flowable.merge(getMyProfileLocal(), getMyProfileRemote()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                MyProfileViewModel_.this.lambda$getMyProfile$0$MyProfileViewModel_((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$getMyProfile$0$MyProfileViewModel_(Resource resource) throws Exception {
        this.myProfileDataMutableLiveData.setValue(resource);
    }

    public Flowable<Resource<ProfileData>> getMyProfileRemote() {
        return this.myProfileRemoteRepository.getProfile().doOnNext(new Consumer() {
            public final void accept(Object obj) {
                MyProfileViewModel_.this.lambda$getMyProfileRemote$1$MyProfileViewModel_((Resource) obj);
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread());
    }

    public /* synthetic */ void lambda$getMyProfileRemote$1$MyProfileViewModel_(Resource resource) throws Exception {
        if (resource.getData() != null) {
            this.localRepository.saveDataOrUpdate((RealmObject) resource.getData());
        }
    }

    public Flowable<Resource<ProfileData>> getMyProfileLocal() {
        return this.localRepository.getFistElement(ProfileData.class).filter($$Lambda$MyProfileViewModel_$tD7cA4Yz3UIRbvXDX16cH2tsg.INSTANCE).cast(ProfileData.class).map($$Lambda$MyProfileViewModel_$OWKAbMojSr4l_7yeRoseGLkVz_g.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread());
    }

    public MutableLiveData<Resource<ProfileData>> getGetMyProfileDataMutableLiveData() {
        return this.myProfileDataMutableLiveData;
    }
}
