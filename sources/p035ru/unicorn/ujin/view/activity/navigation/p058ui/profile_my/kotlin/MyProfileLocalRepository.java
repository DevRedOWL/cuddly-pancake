package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create.BaseLocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.FullProfileMapper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.ContactDataList;
import p046io.realm.Realm;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001e\u0010\n\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/MyProfileLocalRepository;", "Lru/unicorn/ujin/view/activity/navigation/ui/addhardware/create/BaseLocalRepository;", "()V", "createUserProfile", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;", "mapperList", "", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/FullProfileMapper;", "getContactDataListLocal", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my_team/ContactDataList;", "getField", "", "field", "getProfileDataLocal", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/ProfileData;", "updateUserData", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.MyProfileLocalRepository */
/* compiled from: MyProfileLocalRepository.kt */
public final class MyProfileLocalRepository extends BaseLocalRepository {
    public MyProfileLocalRepository() {
        this.realm = Realm.getDefaultInstance();
    }

    public final ProfileData getProfileDataLocal() {
        ProfileData profileData = (ProfileData) this.realm.where(ProfileData.class).findFirst();
        if (profileData != null) {
            return (ProfileData) this.realm.copyFromRealm(profileData, 3);
        }
        return null;
    }

    public final ContactDataList getContactDataListLocal() {
        ContactDataList contactDataList = (ContactDataList) this.realm.where(ContactDataList.class).findFirst();
        if (contactDataList != null) {
            return (ContactDataList) this.realm.copyFromRealm(contactDataList, 3);
        }
        return null;
    }

    public final UserProfile createUserProfile(List<? extends FullProfileMapper> list) {
        UserData userData;
        List<? extends FullProfileMapper> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "mapperList");
        ProfileData profileDataLocal = getProfileDataLocal();
        UserProfile profile = profileDataLocal != null ? profileDataLocal.getProfile() : null;
        if (profile == null || (userData = profile.getUserdata()) == null) {
            userData = new UserData((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
        }
        String name = ProfileEditFieldLabel.NAME.name();
        if (name != null) {
            String lowerCase = name.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            userData.setName(getField(list2, lowerCase));
            String name2 = ProfileEditFieldLabel.SURNAME.name();
            if (name2 != null) {
                String lowerCase2 = name2.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
                userData.setSurname(getField(list2, lowerCase2));
                String name3 = ProfileEditFieldLabel.PATRONYMIC.name();
                if (name3 != null) {
                    String lowerCase3 = name3.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "(this as java.lang.String).toLowerCase()");
                    userData.setPatronymic(getField(list2, lowerCase3));
                    String name4 = ProfileEditFieldLabel.BIRTHDAY.name();
                    if (name4 != null) {
                        String lowerCase4 = name4.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(lowerCase4, "(this as java.lang.String).toLowerCase()");
                        userData.setBirthday(getField(list2, lowerCase4));
                        String name5 = ProfileEditFieldLabel.GENDER.name();
                        if (name5 != null) {
                            String lowerCase5 = name5.toLowerCase();
                            Intrinsics.checkNotNullExpressionValue(lowerCase5, "(this as java.lang.String).toLowerCase()");
                            userData.setGender(FullProfileMapper.GENDER.getName(getField(list2, lowerCase5)));
                            String name6 = ProfileEditFieldLabel.EMAIL.name();
                            if (name6 != null) {
                                String lowerCase6 = name6.toLowerCase();
                                Intrinsics.checkNotNullExpressionValue(lowerCase6, "(this as java.lang.String).toLowerCase()");
                                userData.setEmail(getField(list2, lowerCase6));
                                UserProfile userProfile = new UserProfile((UserData) null, (UserCompany) null, (RealmList) null, (RealmList) null, (Boolean) null, (Boolean) null, (Integer) null, 127, (DefaultConstructorMarker) null);
                                userProfile.setUserdata(userData);
                                return userProfile;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private final String getField(List<? extends FullProfileMapper> list, String str) {
        for (FullProfileMapper fullProfileMapper : list) {
            if (Intrinsics.areEqual((Object) fullProfileMapper.getField(), (Object) str)) {
                if (!Intrinsics.areEqual((Object) str, (Object) CardFragment.ARG_NUMBER) || fullProfileMapper.getExtractedValue() == null) {
                    String value = fullProfileMapper.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "mapper.value");
                    return value;
                }
                String extractedValue = fullProfileMapper.getExtractedValue();
                Intrinsics.checkNotNullExpressionValue(extractedValue, "mapper.extractedValue");
                return extractedValue;
            }
        }
        return "";
    }

    public final void updateUserData() {
        this.realm.executeTransaction(MyProfileLocalRepository$updateUserData$1.INSTANCE);
    }
}
