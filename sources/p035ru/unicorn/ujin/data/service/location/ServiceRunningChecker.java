package p035ru.unicorn.ujin.data.service.location;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.ListenableWorker;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.util.ServiceHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.BleSettingsFragmentKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/data/service/location/ServiceRunningChecker;", "Landroidx/work/Worker;", "appContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "sPref", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "activateService", "", "activate", "", "doWork", "Landroidx/work/ListenableWorker$Result;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.service.location.ServiceRunningChecker */
/* compiled from: ServiceRunningChecker.kt */
public final class ServiceRunningChecker extends Worker {
    private final SharedPreferences sPref = getApplicationContext().getSharedPreferences(getApplicationContext().getString(R.string.app_name), 0);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceRunningChecker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
    }

    public ListenableWorker.Result doWork() {
        try {
            SharedPreferences sharedPreferences = this.sPref;
            if (sharedPreferences != null) {
                if (sharedPreferences.getBoolean(BleSettingsFragmentKt.USER_ENABLE_START_SERVICE_AUTO, false)) {
                    activateService(true);
                    ListenableWorker.Result success = ListenableWorker.Result.success();
                    Intrinsics.checkNotNullExpressionValue(success, "Result.success()");
                    return success;
                }
            }
            activateService(false);
            Intrinsics.checkNotNullExpressionValue(WorkManager.getInstance().cancelAllWorkByTag(BleSettingsFragmentKt.USER_ENABLE_START_SERVICE_AUTO), "WorkManager.getInstance(…NABLE_START_SERVICE_AUTO)");
        } catch (Exception unused) {
        }
        ListenableWorker.Result success2 = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(success2, "Result.success()");
        return success2;
    }

    private final void activateService(boolean z) {
        if (z) {
            if (!ServiceHelper.isMyServiceRunning(LocationService.class, getApplicationContext())) {
                ServiceHelper.startLocationService(getApplicationContext());
            }
        } else if (!ServiceHelper.isMyServiceRunning(LocationService.class, getApplicationContext())) {
            ServiceHelper.stopLocationService(getApplicationContext());
        }
    }
}
