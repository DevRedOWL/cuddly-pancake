package org.linphone;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.greenrobot.eventbus.EventBus;
import org.linphone.LinphonePreferences;
import org.linphone.api.RemoteRepository;
import org.linphone.broadcast.ScreenOnOff;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneCall;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.LinphoneCoreFactory;
import org.linphone.core.LinphoneCoreListenerBase;
import org.linphone.core.LinphoneProxyConfig;
import org.linphone.p054ui.LinphoneOverlay;
import p035ru.unicorn.ujin.data.realm.SipParametrs;
import p035ru.unicorn.ujin.util.CallMaker;

public final class LinphoneService extends Service {
    /* access modifiers changed from: private */
    public static LinphoneService instance;
    private Application.ActivityLifecycleCallbacks activityCallbacks;
    private String dtmf;
    private String firebase;
    private Integer fps;
    String fromTitle;
    private IncallIconState mCurrentIncallIconState = IncallIconState.IDLE;
    public Handler mHandler = new Handler();
    private LinphoneCoreListenerBase mListener;
    private LinphoneOverlay mOverlay;
    private boolean mTestDelayElapsed = true;
    private String mjpegUrl;
    private String openDoorUrl;
    private String previewUrl;
    ScreenOnOff screenOnOffBroadcastBRec = new ScreenOnOff();
    Handler stopServiceHAndler;
    Runnable stopServiceRunnable = new Runnable() {
        public void run() {
            Log.d("TAG", "ZZZ 1");
            LinphoneService.this.stopSelf();
        }
    };
    private String token;
    private String videoSource;

    private enum IncallIconState {
        INCALL,
        PAUSE,
        VIDEO,
        IDLE
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        getTokenAndFirebase(intent);
        createAccount(intent);
        getPreviewUrl(intent);
        getOpenDoorParam(intent);
        if (intent.getAction() != null && intent.getAction().equals(getString(C5321R.string.action_stop_foreground_service))) {
            Log.d("TAG", "XXX stop Foreground: ");
            stopLinphone();
        }
        if (intent.getAction() == null || !intent.getAction().equals(getString(C5321R.string.action_driver_update))) {
            return 2;
        }
        Log.d("TAG", "XXX finish update driver");
        stopLinphone();
        finishAllActivity();
        return 2;
    }

    private void getTokenAndFirebase(Intent intent) {
        if (intent != null) {
            this.token = intent.getStringExtra("token");
            this.firebase = intent.getStringExtra("firebase");
        }
    }

    private void stopLinphone() {
        stopForeground(true);
        stopSelf();
    }

    public static boolean isReady() {
        LinphoneService linphoneService = instance;
        return linphoneService != null && linphoneService.mTestDelayElapsed;
    }

    public static LinphoneService instance() {
        if (isReady()) {
            return instance;
        }
        throw new RuntimeException("LinphoneService not instantiated yet");
    }

    public void onCreate() {
        super.onCreate();
        registerScreen();
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("app_oreo_channel", "Foreground Service", 4);
            notificationChannel.setLockscreenVisibility(0);
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(notificationChannel);
            startForeground(1, new Notification.Builder(this, "app_oreo_channel").setContentTitle(getString(C5321R.string.app_name)).setContentText("").setAutoCancel(true).build());
        }
        LinphonePreferences.instance().setContext(getBaseContext());
        LinphoneManager.createAndStart(this);
        instance = this;
        LinphoneCore lc = LinphoneManager.getLc();
        C53171 r1 = new LinphoneCoreListenerBase() {
            public void callState(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneCall.State state, String str) {
                Log.d("TAG", "ZZZ 2 " + state + " " + str);
                if (LinphoneService.instance == null) {
                    org.linphone.mediastream.Log.m6905i("Service not ready, discarding call state change to ", state.toString());
                    return;
                }
                if (LinphoneService.this.stopServiceHAndler != null) {
                    LinphoneService.this.stopServiceHAndler.removeCallbacks(LinphoneService.this.stopServiceRunnable);
                }
                LinphoneService linphoneService = LinphoneService.this;
                linphoneService.doHTTPRequest("State =  " + state);
                if (state == LinphoneCall.State.IncomingReceived) {
                    if (!LinphoneManager.getInstance().getCallGsmON()) {
                        LinphoneService.this.enableDedug();
                    }
                    LinphoneService.this.sendBroadcast(new Intent("action_incoming_receive"));
                    LocalBroadcastManager.getInstance(LinphoneService.this).sendBroadcast(new Intent(CallMaker.PUSH_CALL_BROADCAST).putExtra("KEY_ACTION", 10));
                }
                if (state == LinphoneCall.State.CallEnd || state == LinphoneCall.State.CallReleased || state == LinphoneCall.State.Error) {
                    if (LinphoneManager.isInstanciated() && LinphoneManager.getLc() != null && LinphoneManager.getLc().getCallsNb() == 0) {
                        if (LinphoneActivity.isInstanciated() && LinphoneActivity.instance().getStatusFragment() != null) {
                            LinphoneActivity.instance().getStatusFragment().setisZrtpAsk(false);
                        }
                        LinphoneService.this.sendBroadcast(new Intent("action_call_release"));
                        if (LinphoneService.this.stopServiceHAndler == null) {
                            LinphoneService.this.stopServiceHAndler = new Handler();
                        }
                        LocalBroadcastManager.getInstance(LinphoneService.this).sendBroadcast(new Intent(CallMaker.PUSH_CALL_BROADCAST).putExtra("KEY_ACTION", 4));
                        LinphoneService.this.stopServiceHAndler.postDelayed(LinphoneService.this.stopServiceRunnable, 4000);
                    }
                    LinphoneService.this.destroyOverlay();
                }
            }

            public void globalState(LinphoneCore linphoneCore, LinphoneCore.GlobalState globalState, String str) {
                LinphoneService linphoneService = LinphoneService.this;
                linphoneService.doHTTPRequest("Global State =  " + globalState.toString());
            }

            public void registrationState(LinphoneCore linphoneCore, LinphoneProxyConfig linphoneProxyConfig, LinphoneCore.RegistrationState registrationState, String str) {
                LinphoneService linphoneService = LinphoneService.this;
                linphoneService.doHTTPRequest("RegistrationState  =  " + registrationState.toString());
            }
        };
        this.mListener = r1;
        lc.addListener(r1);
    }

    /* access modifiers changed from: private */
    public void enableDedug() {
        try {
            LinphoneCoreFactory.instance().setDebugMode(true, "XXX TAGGG");
        } catch (Exception e) {
            org.linphone.mediastream.Log.m6901d("TAG", "XXX TAGGG error " + e.getMessage());
        }
    }

    private void registerScreen() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        registerReceiver(this.screenOnOffBroadcastBRec, intentFilter);
    }

    private void getOpenDoorParam(Intent intent) {
        if (intent != null) {
            this.dtmf = intent.getStringExtra(SipParametrs.DTMF);
            this.openDoorUrl = intent.getStringExtra("open_door");
        }
    }

    private void getPreviewUrl(Intent intent) {
        if (intent != null) {
            this.previewUrl = intent.getStringExtra("url");
            this.mjpegUrl = intent.getStringExtra(SipParametrs.MJPEG);
            this.videoSource = intent.getStringExtra(SipParametrs.VIDEO_SOURCE);
            this.fps = Integer.valueOf(intent.getIntExtra(SipParametrs.FPS, 100));
        }
    }

    private void createAccount(Intent intent) {
        LinphonePreferences.instance().setInitiateVideoCall(true);
        if (intent != null) {
            this.fromTitle = intent.getStringExtra(SipParametrs.WHO_CALL);
        }
        if (LinphonePreferences.instance().getAccountCount() > 0 && intent != null) {
            String stringExtra = intent.getStringExtra("id");
            LinphoneProxyConfig defaultProxyConfig = LinphoneManager.getLc().getDefaultProxyConfig();
            if (!(stringExtra == null || defaultProxyConfig == null || LinphoneUtils.getAddressDisplayName(defaultProxyConfig.getAddress()).equals(stringExtra))) {
                doHTTPRequest("DELETE ACCOUNT " + stringExtra);
                LinphonePreferences.instance().deleteAccount(0);
            }
        }
        if (LinphonePreferences.instance().getAccountCount() == 0 && intent != null) {
            String stringExtra2 = intent.getStringExtra("name");
            String stringExtra3 = intent.getStringExtra("domain");
            String stringExtra4 = intent.getStringExtra("id");
            String stringExtra5 = intent.getStringExtra("password");
            doHTTPRequest("ACCOUNT user name =  " + stringExtra2 + ", domain = " + stringExtra3 + ", userID = " + stringExtra4 + ", pass = " + stringExtra5);
            try {
                new LinphonePreferences.AccountBuilder(LinphoneManager.getLc()).setUsername(stringExtra4).setDomain(stringExtra3).setTransport(LinphoneAddress.TransportType.LinphoneTransportUdp).setDisplayName(stringExtra2).setPassword(stringExtra5).saveNewAccount();
            } catch (LinphoneCoreException e) {
                doHTTPRequest("ERROR  " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    private void finishAllActivity() {
        Intent intent = new Intent(this, RootTaskActivity.class);
        intent.putExtra("close", true);
        intent.addFlags(268435456).addFlags(32768).addFlags(65536);
        startActivity(intent);
    }

    public void destroyOverlay() {
        LinphoneOverlay linphoneOverlay = this.mOverlay;
        if (linphoneOverlay != null) {
            linphoneOverlay.destroy();
        }
        this.mOverlay = null;
    }

    public synchronized void onDestroy() {
        Log.d("TAG", "XXX onDestroy service: ");
        EventBus.getDefault().post(new MessageEvent("Hello everyone!"));
        unregisterReceiver(this.screenOnOffBroadcastBRec);
        if (this.activityCallbacks != null) {
            getApplication().unregisterActivityLifecycleCallbacks(this.activityCallbacks);
            this.activityCallbacks = null;
        }
        destroyOverlay();
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.removeListener(this.mListener);
        }
        instance = null;
        LinphoneManager.destroy();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onIncomingReceived() {
        Intent intent = new Intent(this, RootTaskActivity.class);
        intent.addFlags(268435456).putExtra("close", false).putExtra(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, this.previewUrl).putExtra(SipParametrs.FPS, this.fps).putExtra(SipParametrs.DTMF, this.dtmf).putExtra("open_door", this.openDoorUrl).putExtra(SipParametrs.MJPEG, this.mjpegUrl).putExtra(SipParametrs.VIDEO_SOURCE, this.videoSource).addFlags(65536);
        startActivity(intent);
    }

    public void doHTTPRequest(String str) {
        RemoteRepository.getInstance().sendLog(str, this.token, this.firebase);
    }

    public class DataAsyncSend extends AsyncTask<String, Void, String> {
        String data;
        ArrayList<NameValuePair> postParameters;
        String results = "ERROR";

        /* renamed from: sb */
        StringBuilder f6321sb;

        public DataAsyncSend(String str) {
            this.data = str;
        }

        /* access modifiers changed from: protected */
        public String doInBackground(String... strArr) {
            if (this.f6321sb == null) {
                this.f6321sb = new StringBuilder();
            }
            StringBuilder sb = this.f6321sb;
            sb.append(" \n  *** ");
            sb.append(this.data);
            try {
                DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
                HttpPost httpPost = new HttpPost("https://api-product.mysmartflat.ru/api/log/insert/");
                this.postParameters = new ArrayList<>();
                this.postParameters.add(new BasicNameValuePair("key", "8667734"));
                this.postParameters.add(new BasicNameValuePair("instance", "8667734"));
                this.postParameters.add(new BasicNameValuePair("user_id", "8667734"));
                this.postParameters.add(new BasicNameValuePair("data", this.f6321sb.toString()));
                httpPost.setEntity(new UrlEncodedFormEntity(this.postParameters, "UTF-8"));
                defaultHttpClient.execute(httpPost);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return this.results;
        }
    }
}
