package p035ru.unicorn.ujin.view.activity.bottomNavigationActivity;

import android.content.IntentSender;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.tasks.OnSuccessListener;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "appUpdateInfo", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "kotlin.jvm.PlatformType", "onSuccess"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity$checkVersionUpdates$1 */
/* compiled from: StageActivity.kt */
final class StageActivity$checkVersionUpdates$1<ResultT> implements OnSuccessListener<AppUpdateInfo> {
    final /* synthetic */ StageActivity this$0;

    StageActivity$checkVersionUpdates$1(StageActivity stageActivity) {
        this.this$0 = stageActivity;
    }

    public final void onSuccess(AppUpdateInfo appUpdateInfo) {
        if (appUpdateInfo.updateAvailability() != 2 || !appUpdateInfo.isUpdateTypeAllowed(0)) {
            Log.e(StageActivity.TAG, "checkForAppUpdateAvailability: not available");
            return;
        }
        try {
            SharedPreferences.Editor edit = StageActivity.access$getSharedPreferences$p(this.this$0).edit();
            Calendar instance = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(instance, "Calendar.getInstance()");
            edit.putLong(StageActivity.CHECKING_VERSION_TIME, instance.getTimeInMillis()).apply();
            this.this$0.showUpdatingAvailableDialog();
        } catch (IntentSender.SendIntentException e) {
            e.printStackTrace();
        }
    }
}
