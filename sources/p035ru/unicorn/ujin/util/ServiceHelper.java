package p035ru.unicorn.ujin.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import org.linphone.LinphoneService;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.SipOpenDoorParam;
import p035ru.unicorn.ujin.data.realm.SipParametrs;
import p035ru.unicorn.ujin.data.realm.SipPreviewParams;
import p035ru.unicorn.ujin.data.service.location.LocationService;
import p046io.realm.Realm;

/* renamed from: ru.unicorn.ujin.util.ServiceHelper */
public class ServiceHelper {
    public static boolean isMyServiceRunning(Class<?> cls, Context context) {
        for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE)) {
            if (cls.getName().equals(runningServiceInfo.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    public static void startLinphoneService(Context context, SipParametrs sipParametrs, String str) {
        Intent createLinphoneIntent = createLinphoneIntent(context, sipParametrs, str);
        if (createLinphoneIntent != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(createLinphoneIntent);
            } else {
                context.startService(createLinphoneIntent);
            }
        }
        try {
            new Handler(Looper.getMainLooper()).post(new Runnable(context) {
                private final /* synthetic */ Context f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    LinphoneHelper.updateDriver(this.f$0);
                }
            });
        } catch (Exception unused) {
        }
    }

    public static void stopLinphoneService(Context context) {
        Intent intent = new Intent(context, LinphoneService.class);
        if (!isMyServiceRunning(LinphoneService.class, context)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction(context.getString(R.string.action_stop_foreground_service));
            context.startService(intent);
            return;
        }
        context.stopService(intent);
    }

    public static Intent createLinphoneIntent(Context context, SipParametrs sipParametrs, String str) {
        Integer num;
        String str2;
        String str3;
        String str4;
        String str5 = null;
        if (sipParametrs == null && ((sipParametrs = (SipParametrs) Realm.getDefaultInstance().where(SipParametrs.class).findFirst()) == null || sipParametrs.getSipUser().intValue() == 0)) {
            return null;
        }
        String valueOf = String.valueOf(sipParametrs.getSipUser());
        String sipDomain = sipParametrs.getSipDomain();
        String sipPassword = sipParametrs.getSipPassword();
        String valueOf2 = String.valueOf(sipParametrs.getSipUser());
        String videoSource = sipParametrs.getVideoSource();
        String token = ProfileLocalRepository.Companion.getInstance().getUser().getToken();
        String fcmToken = ProfileLocalRepository.Companion.getInstance().getUser().getFcmToken();
        SipPreviewParams previewParams = sipParametrs.getPreviewParams();
        SipOpenDoorParam openDoorParam = sipParametrs.getOpenDoorParam();
        if (previewParams != null) {
            str2 = previewParams.getUrl();
            num = previewParams.getFps();
            str3 = previewParams.getMjpegUrl();
        } else {
            str3 = null;
            str2 = null;
            num = null;
        }
        if (openDoorParam != null) {
            str5 = openDoorParam.getOpenDoorUrl();
            str4 = openDoorParam.getDtmf();
        } else {
            str4 = null;
        }
        Intent intent = new Intent(context, LinphoneService.class);
        intent.putExtra("id", valueOf);
        intent.putExtra("domain", sipDomain);
        intent.putExtra("name", valueOf2);
        intent.putExtra("password", sipPassword);
        intent.putExtra(SipParametrs.WHO_CALL, str);
        intent.putExtra(SipParametrs.FPS, num);
        intent.putExtra("url", str2);
        Log.d("TAG", "XXX MJPEG 1 " + str3);
        intent.putExtra(SipParametrs.MJPEG, str3);
        intent.putExtra(SipParametrs.DTMF, str4);
        intent.putExtra("open_door", str5);
        intent.putExtra(SipParametrs.VIDEO_SOURCE, videoSource);
        intent.putExtra("token", token);
        intent.putExtra("firebase", fcmToken);
        return intent;
    }

    public static void sendCommandToLocationServer(String str, Context context) {
        Intent intent = new Intent(context, LocationService.class);
        intent.setAction(str);
        context.startService(intent);
    }

    public static void stopLocationService(Context context) {
        Intent intent = new Intent(context, LocationService.class);
        if (isMyServiceRunning(LocationService.class, context)) {
            if (Build.VERSION.SDK_INT >= 26) {
                intent.setAction(context.getString(R.string.action_stop_foreground_service));
                context.startService(intent);
            } else {
                context.stopService(intent);
            }
        }
        if (isMyServiceRunning(LocationService.class, context)) {
            context.stopService(intent);
        }
    }

    public static void startLocationService(Context context) {
        if (!ProfileLocalRepository.Companion.getInstance().isDemo()) {
            startLocationServiceNow(context);
        }
    }

    private static void startLocationServiceNow(Context context) {
        Intent intent = new Intent(context, LocationService.class);
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }
}
