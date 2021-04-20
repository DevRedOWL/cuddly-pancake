package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin;

import androidx.lifecycle.MutableLiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.FullProfileMapper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.ContactData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.ContactDataList;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.TeamMapper;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.Flowable;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.schedulers.Schedulers;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0007J\u0010\u00103\u001a\u0002002\u0006\u00101\u001a\u000202H\u0007J\u0006\u00104\u001a\u000200J\b\u00105\u001a\u000200H\u0003J\u0014\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001407H\u0002J\u0006\u00108\u001a\u000200J\u0010\u00109\u001a\u0002002\u0006\u0010:\u001a\u00020;H\u0007J\b\u0010<\u001a\u000200H\u0007J\b\u0010=\u001a\u000200H\u0007J\b\u0010>\u001a\u000200H\u0014J\u0016\u0010?\u001a\u0002002\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0007J\u0006\u0010A\u001a\u000200R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R#\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007R#\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R#\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00140\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0007R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0007R\u001d\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0012R#\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0012¨\u0006B"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/MyProfileViewModel;", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/BaseViewModel;", "()V", "contactListLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my_team/ContactDataList;", "getContactListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "currentChosen", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my_team/TeamMapper;", "getCurrentChosen", "setCurrentChosen", "(Landroidx/lifecycle/MutableLiveData;)V", "destroyContactLiveData", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "Lru/unicorn/ujin/data/realm/Resource;", "", "getDestroyContactLiveData", "()Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "editProfileMutableLiveData", "", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/FullProfileMapper;", "getEditProfileMutableLiveData", "getProfileLiveData", "getGetProfileLiveData", "hasFIO", "getHasFIO", "setHasFIO", "(Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;)V", "localRepository", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/MyProfileLocalRepository;", "myProfileRepository", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/MyProfileRemoteRepository;", "profileLiveDate", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/ProfileData;", "getProfileLiveDate", "profileMutableLiveData", "getProfileMutableLiveData", "teamContactListLiveData", "getTeamContactListLiveData", "teamContactLiveData", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my_team/ContactData;", "getTeamContactLiveData", "teamInviteContactLiveData", "getTeamInviteContactLiveData", "updateProfileLiveData", "getUpdateProfileLiveData", "destroyContact", "", "id", "", "getContact", "getContactFieldList", "getContactList", "getContactListLocal", "Lio/reactivex/Flowable;", "getProfileFieldList", "inviteContact", "phone", "", "loadContactList", "loadProfileData", "onCleared", "updateProfileData", "mapperList", "updateUserData", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.MyProfileViewModel */
/* compiled from: MyProfileViewModel.kt */
public final class MyProfileViewModel extends BaseViewModel {
    private final MutableLiveData<ContactDataList> contactListLiveData = new MutableLiveData<>();
    private MutableLiveData<TeamMapper> currentChosen = new MutableLiveData<>();
    private final SingleLiveEvent<Resource<Boolean>> destroyContactLiveData = new SingleLiveEvent<>();
    private final MutableLiveData<Resource<List<FullProfileMapper>>> editProfileMutableLiveData = new MutableLiveData<>();
    private final SingleLiveEvent<Resource<List<FullProfileMapper>>> getProfileLiveData = new SingleLiveEvent<>();
    private SingleLiveEvent<Boolean> hasFIO = new SingleLiveEvent<>();
    /* access modifiers changed from: private */
    public MyProfileLocalRepository localRepository = new MyProfileLocalRepository();
    private final MyProfileRemoteRepository myProfileRepository = new MyProfileRemoteRepository();
    private final MutableLiveData<ProfileData> profileLiveDate = new MutableLiveData<>();
    private final MutableLiveData<Resource<List<FullProfileMapper>>> profileMutableLiveData = new MutableLiveData<>();
    private final MutableLiveData<Resource<List<TeamMapper>>> teamContactListLiveData = new MutableLiveData<>();
    private final MutableLiveData<ContactData> teamContactLiveData = new MutableLiveData<>();
    private final SingleLiveEvent<Resource<TeamMapper>> teamInviteContactLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<Resource<List<FullProfileMapper>>> updateProfileLiveData = new SingleLiveEvent<>();

    public MyProfileViewModel() {
        this.hasFIO.setValue(false);
    }

    public final SingleLiveEvent<Resource<TeamMapper>> getTeamInviteContactLiveData() {
        return this.teamInviteContactLiveData;
    }

    public final SingleLiveEvent<Resource<Boolean>> getDestroyContactLiveData() {
        return this.destroyContactLiveData;
    }

    public final MutableLiveData<ContactData> getTeamContactLiveData() {
        return this.teamContactLiveData;
    }

    public final MutableLiveData<ContactDataList> getContactListLiveData() {
        return this.contactListLiveData;
    }

    public final MutableLiveData<Resource<List<TeamMapper>>> getTeamContactListLiveData() {
        return this.teamContactListLiveData;
    }

    public final SingleLiveEvent<Boolean> getHasFIO() {
        return this.hasFIO;
    }

    public final void setHasFIO(SingleLiveEvent<Boolean> singleLiveEvent) {
        Intrinsics.checkNotNullParameter(singleLiveEvent, "<set-?>");
        this.hasFIO = singleLiveEvent;
    }

    public final MutableLiveData<TeamMapper> getCurrentChosen() {
        return this.currentChosen;
    }

    public final void setCurrentChosen(MutableLiveData<TeamMapper> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.currentChosen = mutableLiveData;
    }

    public final SingleLiveEvent<Resource<List<FullProfileMapper>>> getGetProfileLiveData() {
        return this.getProfileLiveData;
    }

    public final SingleLiveEvent<Resource<List<FullProfileMapper>>> getUpdateProfileLiveData() {
        return this.updateProfileLiveData;
    }

    public final MutableLiveData<Resource<List<FullProfileMapper>>> getProfileMutableLiveData() {
        return this.profileMutableLiveData;
    }

    public final MutableLiveData<Resource<List<FullProfileMapper>>> getEditProfileMutableLiveData() {
        return this.editProfileMutableLiveData;
    }

    public final MutableLiveData<ProfileData> getProfileLiveDate() {
        return this.profileLiveDate;
    }

    private final void getContactList() {
        getContactListLocal().subscribe(new MyProfileViewModel$getContactList$1(this));
    }

    private final Flowable<List<TeamMapper>> getContactListLocal() {
        Flowable<List<R>> flowable = this.localRepository.getData(UserProfile.class).map(MyProfileViewModel$getContactListLocal$1.INSTANCE).flatMapIterable(MyProfileViewModel$getContactListLocal$2.INSTANCE).map(MyProfileViewModel$getContactListLocal$3.INSTANCE).toList().toFlowable();
        Intrinsics.checkNotNullExpressionValue(flowable, "localRepository.getData(…            .toFlowable()");
        return flowable;
    }

    public final void inviteContact(String str) {
        Intrinsics.checkNotNullParameter(str, "phone");
        this.myProfileRepository.inviteContact(str).map(new MyProfileViewModel$inviteContact$1(this)).filter(MyProfileViewModel$inviteContact$2.INSTANCE).ignoreElements().andThen(this.myProfileRepository.getContactList()).filter(MyProfileViewModel$inviteContact$3.INSTANCE).map(new MyProfileViewModel$inviteContact$4(this)).doOnNext(new MyProfileViewModel$inviteContact$5(this)).flatMapIterable(MyProfileViewModel$inviteContact$6.INSTANCE).map(MyProfileViewModel$inviteContact$7.INSTANCE).toList().toFlowable().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MyProfileViewModel$inviteContact$8(this));
    }

    public final void destroyContact(int i) {
        this.myProfileRepository.destroyContact(i).map(new MyProfileViewModel$destroyContact$1(this)).filter(MyProfileViewModel$destroyContact$2.INSTANCE).ignoreElements().andThen(this.myProfileRepository.getContactList()).filter(MyProfileViewModel$destroyContact$3.INSTANCE).map(new MyProfileViewModel$destroyContact$4(this)).doOnNext(new MyProfileViewModel$destroyContact$5(this)).flatMapIterable(MyProfileViewModel$destroyContact$6.INSTANCE).map(MyProfileViewModel$destroyContact$7.INSTANCE).toList().toFlowable().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MyProfileViewModel$destroyContact$8(this));
    }

    public final void getContact(int i) {
        this.myProfileRepository.getContact(i).filter(MyProfileViewModel$getContact$1.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MyProfileViewModel$getContact$2(this));
    }

    public final void loadContactList() {
        this.myProfileRepository.getContactList().map(new MyProfileViewModel$loadContactList$1(this, this.localRepository.getContactDataListLocal())).filter(MyProfileViewModel$loadContactList$2.INSTANCE).map(new MyProfileViewModel$loadContactList$3(this)).doOnNext(new MyProfileViewModel$loadContactList$4(this)).flatMapIterable(MyProfileViewModel$loadContactList$5.INSTANCE).map(MyProfileViewModel$loadContactList$6.INSTANCE).toList().toFlowable().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MyProfileViewModel$loadContactList$7(this));
    }

    public final void loadProfileData() {
        this.myProfileRepository.getProfile().map(new MyProfileViewModel$loadProfileData$1(this, this.localRepository.getProfileDataLocal())).filter(MyProfileViewModel$loadProfileData$2.INSTANCE).map(new MyProfileViewModel$loadProfileData$3(this)).doOnNext(MyProfileViewModel$loadProfileData$4.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MyProfileViewModel$loadProfileData$5(this));
    }

    public final void updateProfileData(List<? extends FullProfileMapper> list) {
        Intrinsics.checkNotNullParameter(list, "mapperList");
        this.myProfileRepository.updateProfile(this.localRepository.createUserProfile(list)).map(new MyProfileViewModel$updateProfileData$1(this)).filter(MyProfileViewModel$updateProfileData$2.INSTANCE).ignoreElements().andThen(this.myProfileRepository.getProfile()).filter(MyProfileViewModel$updateProfileData$3.INSTANCE).map(new MyProfileViewModel$updateProfileData$4(this)).doOnNext(MyProfileViewModel$updateProfileData$5.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MyProfileViewModel$updateProfileData$6(this));
    }

    public final void updateUserData() {
        this.localRepository.updateUserData();
    }

    public final void getProfileFieldList() {
        UserProfile profile;
        ProfileData value = this.profileLiveDate.getValue();
        if (value == null || (profile = value.getProfile()) == null) {
            this.editProfileMutableLiveData.setValue(Resource.success(1, "Ошибка загрузки данных", null));
            return;
        }
        this.editProfileMutableLiveData.setValue(Resource.success(0, "", FullProfileMapper.mapTo(profile, true)));
    }

    public final void getContactFieldList() {
        UserData userdata;
        TeamMapper value = this.currentChosen.getValue();
        ContactDataList value2 = this.contactListLiveData.getValue();
        RealmList<UserProfile> items = value2 != null ? value2.getItems() : null;
        if (items != null) {
            int size = items.size();
            for (int i = 0; i < size; i++) {
                UserProfile userProfile = items.get(i);
                if (Intrinsics.areEqual((Object) (userProfile == null || (userdata = userProfile.getUserdata()) == null) ? null : userdata.getPhone(), (Object) value != null ? value.getPhone() : null)) {
                    this.profileMutableLiveData.setValue(Resource.success(0, "", FullProfileMapper.mapTo(items.get(i), false)));
                    return;
                }
            }
        }
        this.profileMutableLiveData.setValue(Resource.success(1, "Ошибка загрузки данных", null));
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        this.localRepository.realm.close();
        super.onCleared();
    }
}
