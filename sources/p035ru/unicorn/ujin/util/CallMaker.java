package p035ru.unicorn.ujin.util;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.realm.SipParametrs;
import p035ru.unicorn.ujin.data.service.CallPushBroadcastReciver;
import p035ru.unicorn.ujin.data.service.CallPushHandler;
import p035ru.unicorn.ujin.data.service.FCM;
import p035ru.unicorn.ujin.view.activity.navigation.helper.SharedHelper;

/* renamed from: ru.unicorn.ujin.util.CallMaker */
public class CallMaker {
    public static final String CALL_STARTED = "call_started";
    public static final String PUSH_CALL_BROADCAST = "push_call_broadcast";
    public static final int STATE_START_CALL = 0;
    public static final int STATE_STOP_CALL = 1;
    public static final String VIEW_SHOWN = "incoming_view_shown";
    public static CallMaker instance;
    private CallPushBroadcastReciver callPushBroadcastReciver;
    private CallPushHandler callPushHandler;
    private Context context;
    private int currentState = 0;
    private SipParametrs sipData;

    private CallMaker() {
    }

    public void init() {
        initStartAction(this.context);
        this.callPushHandler = CallPushHandler.getInstance();
        this.callPushHandler.setStartCall(true);
        this.callPushHandler.setContext(this.context);
        this.callPushHandler.setSipParametrs(this.sipData);
        saveToShared();
    }

    public static CallMaker getInstance() {
        if (instance == null) {
            synchronized (CallMaker.class) {
                instance = new CallMaker();
            }
        }
        return instance;
    }

    CallMaker(Context context2, SipParametrs sipParametrs) {
    }

    private void saveToShared() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.sipData.getPreviewParams().getUrl());
            jSONObject.put(SipParametrs.MJPEG, this.sipData.getPreviewParams().getMjpegUrl());
            jSONObject.put(SipParametrs.DTMF, this.sipData.getOpenDoorParam().getDtmf());
            jSONObject.put("open_door", this.sipData.getOpenDoorParam().getOpenDoorUrl());
            jSONObject.put(SipParametrs.VIDEO_SOURCE, this.sipData.getVideoSource());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Log.d("TAG", "XXX iii " + jSONObject);
        this.context.getSharedPreferences(FCM.SIP, 0).edit().putString(FCM.SIP, jSONObject.toString()).apply();
    }

    private void initStartAction(Context context2) {
        enableWakeLockForDoze(context2);
        this.callPushBroadcastReciver = new CallPushBroadcastReciver();
        registerCallBroadcatstReciver(context2);
        ServiceHelper.startLinphoneService(context2, this.sipData, "no title");
    }

    private void registerCallBroadcatstReciver(Context context2) {
        LocalBroadcastManager.getInstance(context2).registerReceiver(this.callPushBroadcastReciver, new IntentFilter(PUSH_CALL_BROADCAST));
        LocalBroadcastManager.getInstance(context2).sendBroadcast(new Intent(PUSH_CALL_BROADCAST).putExtra(CallPushBroadcastReciver.KEY_ACTION, CallPushBroadcastReciver.ACTION_SHOW_PUSH).putExtra(FCM.SIP, this.sipData).putExtra("sip_door", this.sipData.getOpenDoorParam()).putExtra("sip_video", this.sipData.getPreviewParams()));
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            public final void run() {
                CallMaker.this.unregisterBR();
            }
        }, TimeUnit.SECONDS.toMillis(30));
    }

    public void stopCallAction() {
        ServiceHelper.stopLinphoneService(this.context);
        unregisterBR();
        this.context = null;
    }

    /* access modifiers changed from: private */
    public void unregisterBR() {
        Context context2 = this.context;
        if (context2 != null) {
            LocalBroadcastManager.getInstance(context2).sendBroadcast(new Intent(PUSH_CALL_BROADCAST).putExtra(CallPushBroadcastReciver.KEY_ACTION, CallPushBroadcastReciver.ACTION_DISMISS));
            LocalBroadcastManager.getInstance(this.context).unregisterReceiver(this.callPushBroadcastReciver);
        }
    }

    private void enableWakeLockForDoze(Context context2) {
        PowerManager powerManager = (PowerManager) context2.getSystemService("power");
        if (powerManager != null) {
            powerManager.newWakeLock(268435482, "NAME").acquire(10000);
        }
    }

    public void setContext(Context context2) {
        this.context = context2;
    }

    public void setSip(SipParametrs sipParametrs) {
        this.sipData = sipParametrs;
    }

    public void setMarkAsCallStarted() {
        this.context.getSharedPreferences(SharedHelper.APP_PREFERENCES, 0).edit().putBoolean(CALL_STARTED, true).apply();
        this.context.getSharedPreferences(SharedHelper.APP_PREFERENCES, 0).edit().putBoolean(VIEW_SHOWN, false).apply();
    }
}
