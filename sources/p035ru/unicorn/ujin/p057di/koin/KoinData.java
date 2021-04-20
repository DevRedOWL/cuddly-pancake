package p035ru.unicorn.ujin.p057di.koin;

import android.app.Application;
import android.content.Context;
import com.google.android.gcm.GCMConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.context.GlobalContextKt;
import org.mobileid.Api;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.MainApplication;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, mo51343d2 = {"Lru/unicorn/ujin/di/koin/KoinData;", "", "()V", "isInit", "", "()Z", "setInit", "(Z)V", "init", "", "app", "Landroid/app/Application;", "startOnScreenOnService", "checked", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.di.koin.KoinData */
/* compiled from: KoinData.kt */
public final class KoinData {
    public static final KoinData INSTANCE = new KoinData();
    private static boolean isInit;

    private KoinData() {
    }

    public final boolean isInit() {
        return isInit;
    }

    public final void setInit(boolean z) {
        isInit = z;
    }

    public final void init(Application application) {
        Intrinsics.checkNotNullParameter(application, GCMConstants.EXTRA_APPLICATION_PENDING_INTENT);
        isInit = true;
        GlobalContextKt.startKoin(new KoinData$init$1(application));
        Context context = application;
        Api.INSTANCE.setPowerCorrection(context, 100);
        startOnScreenOnService(Api.INSTANCE.isRequestAccessByScreenOnEnabled(context));
    }

    public final void startOnScreenOnService(boolean z) {
        if (isInit) {
            Api api = Api.INSTANCE;
            Context context = MainApplication.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "MainApplication.getContext()");
            api.requestAccessByScreenOn(context, z, "Режим открытия по влючению экрана", "Режим не активен", R.mipmap.ic_launcher_app);
        }
    }
}
