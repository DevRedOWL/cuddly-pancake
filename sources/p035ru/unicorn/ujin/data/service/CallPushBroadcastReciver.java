package p035ru.unicorn.ujin.data.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p035ru.unicorn.ujin.data.realm.SipOpenDoorParam;
import p035ru.unicorn.ujin.data.realm.SipParametrs;
import p035ru.unicorn.ujin.data.realm.SipPreviewParams;
import p035ru.unicorn.ujin.data.service.location.NotificationHelper;
import p035ru.unicorn.ujin.util.CallMaker;
import p035ru.unicorn.ujin.view.activity.navigation.helper.SharedHelper;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.schedulers.Schedulers;

/* renamed from: ru.unicorn.ujin.data.service.CallPushBroadcastReciver */
public class CallPushBroadcastReciver extends BroadcastReceiver {
    public static int ACTION_ATS_LOGIN = 10;
    public static int ACTION_DISMISS = 4;
    public static int ACTION_HIDE_PUSH = 1;
    public static int ACTION_HIDE_PUSH_FROM_CALL_ACTIVITY = 3;
    public static int ACTION_OPEN_DOOR = 2;
    public static int ACTION_SHOW_PUSH = 0;
    public static String KEY_ACTION = "KEY_ACTION";
    private boolean alreadyDismiss = false;
    private CallPushHandler callPushHandler;
    private Context context;
    private RemoteRepository remoteRepository;
    private SipParametrs sip;

    public void onReceive(Context context2, Intent intent) {
        this.callPushHandler = CallPushHandler.getInstance();
        init(context2);
        handleIntent(intent);
    }

    private void handleIntent(Intent intent) {
        int intExtra;
        if (intent != null && intent.getExtras() != null && (intExtra = intent.getIntExtra(KEY_ACTION, -1)) != -1) {
            if (intExtra == ACTION_SHOW_PUSH && this.alreadyDismiss) {
                SipParametrs sipParametrs = (SipParametrs) intent.getParcelableExtra(FCM.SIP);
                SipOpenDoorParam sipOpenDoorParam = (SipOpenDoorParam) intent.getParcelableExtra("sip_door");
                SipPreviewParams sipPreviewParams = (SipPreviewParams) intent.getParcelableExtra("sip_video");
                if (sipParametrs != null) {
                    sipParametrs.setOpenDoorParam(sipOpenDoorParam);
                    sipParametrs.setPreviewParams(sipPreviewParams);
                    this.sip = sipParametrs;
                    return;
                }
                SipParametrs sipParametrs2 = this.sip;
                if (sipParametrs2 != null) {
                    this.callPushHandler.reinit(sipParametrs2);
                }
            } else if (intExtra == ACTION_HIDE_PUSH || intExtra == 5) {
                this.callPushHandler.stopShowPush();
                NotificationHelper.cancelNotificationById(this.context, 99);
            } else if (intExtra == ACTION_OPEN_DOOR) {
                if (intent.hasExtra("open_door")) {
                    this.remoteRepository.senDynamicRequest(intent.getStringExtra("open_door")).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe();
                }
            } else if (intExtra == ACTION_HIDE_PUSH_FROM_CALL_ACTIVITY) {
                setThatCallIncomingActivityIsShown();
                CallPushHandler callPushHandler2 = this.callPushHandler;
                if (callPushHandler2 != null) {
                    callPushHandler2.stopShowPush();
                }
                NotificationHelper.cancelNotificationById(this.context, 99);
            } else if (intExtra == ACTION_DISMISS) {
                this.callPushHandler.setStartCall(false);
                this.callPushHandler.stopShowPush();
                this.callPushHandler.stopService();
                NotificationHelper.cancelNotificationById(this.context, 99);
            } else if (intExtra == ACTION_ATS_LOGIN) {
                this.callPushHandler.init();
            }
        }
    }

    private void setThatCallIncomingActivityIsShown() {
        this.context.getSharedPreferences(SharedHelper.APP_PREFERENCES, 0).edit().putBoolean(CallMaker.VIEW_SHOWN, true).apply();
    }

    private void init(Context context2) {
        this.context = context2;
        this.remoteRepository = new RemoteRepository();
        this.alreadyDismiss = this.callPushHandler.isStartCall();
    }
}
