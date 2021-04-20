package p035ru.unicorn.ujin.data.profile.repository;

import android.content.Context;
import androidx.work.WorkManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.SipParametrs;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.p057di.koin.KoinData;
import p035ru.unicorn.ujin.util.LinphoneHelper;
import p035ru.unicorn.ujin.util.ServiceHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.BleSettingsFragmentKt;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileData;
import p046io.realm.Realm;
import p046io.realm.RealmList;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "execute"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository$clearProfileForLogout$1 */
/* compiled from: ProfileLocalRepository.kt */
final class ProfileLocalRepository$clearProfileForLogout$1 implements Realm.Transaction {
    final /* synthetic */ Context $context;

    ProfileLocalRepository$clearProfileForLogout$1(Context context) {
        this.$context = context;
    }

    public final void execute(Realm realm) {
        Realm realm2 = realm;
        ServiceHelper.stopLinphoneService(this.$context);
        ServiceHelper.stopLocationService(this.$context);
        KoinData.INSTANCE.startOnScreenOnService(false);
        LinphoneHelper.deleteAccount();
        realm2.delete(SipParametrs.class);
        Context context = this.$context;
        context.getSharedPreferences(context.getString(R.string.app_name_app), 0).edit().putBoolean("alreadyShown", false).apply();
        WorkManager.getInstance().cancelAllWorkByTag(BleSettingsFragmentKt.USER_ENABLE_START_SERVICE_AUTO);
        Context context2 = this.$context;
        context2.getSharedPreferences(context2.getString(R.string.app_name), 0).edit().putBoolean(BleSettingsFragmentKt.USER_ENABLE_START_SERVICE_AUTO, false).apply();
        User user = (User) realm2.where(User.class).findFirst();
        if (user == null) {
            user = new User(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, 0, 0, (RealmList) null, (RealmList) null, (RealmList) null, (String) null, (String) null, false, false, (String) null, 134217727, (DefaultConstructorMarker) null);
        }
        Intrinsics.checkNotNullExpressionValue(user, "it.where(User::class.java).findFirst() ?: User()");
        LinphoneHelper.pushToken(this.$context, user.getToken(), false);
        ServiceHelper.stopLocationService(this.$context);
        realm2.delete(User.class);
        realm2.delete(ProfileData.class);
        realm.deleteAll();
        realm2.insert((RealmModel) new User(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, 0, 0, (RealmList) null, (RealmList) null, (RealmList) null, (String) null, (String) null, false, false, (String) null, 134217727, (DefaultConstructorMarker) null));
    }
}
