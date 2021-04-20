package p035ru.unicorn.ujin.data.service;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import org.linphone.CallIncomingActivity;
import org.linphone.LinphoneService;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.SipOpenDoorParam;
import p035ru.unicorn.ujin.data.realm.SipParametrs;
import p035ru.unicorn.ujin.data.realm.SipPreviewParams;
import p035ru.unicorn.ujin.data.service.location.NotificationHelper;
import p035ru.unicorn.ujin.data.service.location.PushActions;
import p035ru.unicorn.ujin.util.CallMaker;
import p035ru.unicorn.ujin.util.ServiceHelper;

/* renamed from: ru.unicorn.ujin.data.service.CallPushHandler */
public class CallPushHandler {
    public static final int CALL_PUSH_ID = 99;
    private static final int CALL_REQUEST_CALL = 147;
    private static final int TIMEOUT_IN_SEC = 30;
    private static CallPushHandler instance;
    private String body;
    /* access modifiers changed from: private */
    public NotificationHelper.Builder builder;
    private Context context;
    /* access modifiers changed from: private */
    public int count;
    /* access modifiers changed from: private */
    public Handler handler;
    private Intent intentDecline;
    private Intent intentForAnswer;
    private Intent intentOpenDoor;
    private boolean isStartCall;
    private PendingIntent pendingIntentAnswer;
    private PendingIntent pendingIntentDecline;
    private PendingIntent pendingIntentOpenDoor;
    private PushActions[] pushActions;
    /* access modifiers changed from: private */
    public boolean showPush = true;
    Runnable showPushPeriodicallyRunnable = new Runnable() {
        public void run() {
            Log.d("TAG", "XXX STOP SHOW PUSH  showPushPeriodicallyRunnable showPush " + CallPushHandler.this.showPush + " " + hashCode());
            CallPushHandler callPushHandler = CallPushHandler.this;
            int unused = callPushHandler.count = callPushHandler.count + 1;
            if (CallPushHandler.this.count >= 30) {
                boolean unused2 = CallPushHandler.this.showPush = false;
            }
            if (CallPushHandler.this.builder != null && CallPushHandler.this.showPush) {
                CallPushHandler.this.builder.build();
                CallPushHandler.this.handler.postDelayed(CallPushHandler.this.showPushPeriodicallyRunnable, 1000);
            }
        }
    };
    private SipParametrs sipParametrs;
    private String title;

    private CallPushHandler() {
    }

    public CallPushHandler(Context context2, SipParametrs sipParametrs2) {
        this.context = context2;
        this.sipParametrs = sipParametrs2;
        this.title = context2.getString(R.string.label_calling);
        this.body = context2.getString(R.string.label_calling_body);
    }

    public static CallPushHandler getInstance() {
        if (instance == null) {
            instance = new CallPushHandler();
        }
        return instance;
    }

    public void init() {
        this.title = this.context.getString(R.string.label_calling);
        this.body = this.context.getString(R.string.label_calling_body);
        this.showPush = true;
        this.count = 0;
        this.handler = new Handler(Looper.getMainLooper());
        this.intentForAnswer = createIntentForPushClick();
        this.intentOpenDoor = createIntentForOpenDoor();
        this.intentDecline = createDeclineIntent();
        this.pendingIntentAnswer = PendingIntent.getActivity(this.context, 147, this.intentForAnswer, 134217728);
        this.pendingIntentOpenDoor = PendingIntent.getBroadcast(this.context, 147, this.intentOpenDoor, 134217728);
        this.pendingIntentDecline = PendingIntent.getBroadcast(this.context, 147, this.intentDecline, 134217728);
        this.pushActions = createButtonsForPush();
        showPush();
        tryShowView();
    }

    private void tryShowView() {
        Integer num;
        String str;
        String str2;
        String str3;
        Intent addFlags = new Intent(this.context, CallIncomingActivity.class).addFlags(65536);
        addFlags.addFlags(268435456);
        addFlags.addFlags(131072);
        String valueOf = String.valueOf(this.sipParametrs.getSipUser());
        String sipDomain = this.sipParametrs.getSipDomain();
        String sipPassword = this.sipParametrs.getSipPassword();
        String valueOf2 = String.valueOf(this.sipParametrs.getSipUser());
        String videoSource = this.sipParametrs.getVideoSource();
        String token = ProfileLocalRepository.Companion.getInstance().getUser().getToken();
        String fcmToken = ProfileLocalRepository.Companion.getInstance().getUser().getFcmToken();
        SipPreviewParams previewParams = this.sipParametrs.getPreviewParams();
        SipOpenDoorParam openDoorParam = this.sipParametrs.getOpenDoorParam();
        String str4 = null;
        if (previewParams != null) {
            str = previewParams.getUrl();
            num = previewParams.getFps();
            str2 = previewParams.getMjpegUrl();
        } else {
            str2 = null;
            str = null;
            num = null;
        }
        if (openDoorParam != null) {
            str4 = openDoorParam.getOpenDoorUrl();
            str3 = openDoorParam.getDtmf();
        } else {
            str3 = null;
        }
        Log.d("TAG", "XXX URL createIntentForPushClick " + this.sipParametrs.getPreviewParams().getMjpegUrl());
        Intent intent = new Intent(this.context, LinphoneService.class);
        intent.putExtra("id", valueOf);
        intent.putExtra("domain", sipDomain);
        intent.putExtra("name", valueOf2);
        intent.putExtra("password", sipPassword);
        intent.putExtra(SipParametrs.WHO_CALL, "");
        intent.putExtra(SipParametrs.FPS, num);
        intent.putExtra("url", str);
        Log.d("TAG", "XXX MJPEG 2 " + str2);
        intent.putExtra(SipParametrs.MJPEG, str2);
        intent.putExtra(SipParametrs.DTMF, str3);
        intent.putExtra("open_door", str4);
        intent.putExtra(SipParametrs.VIDEO_SOURCE, videoSource);
        intent.putExtra("token", token);
        intent.putExtra("firebase", fcmToken);
        this.context.startActivity(addFlags);
    }

    private void showPush() {
        this.builder = new NotificationHelper.Builder(this.context);
        this.builder.body(this.body);
        this.builder.title(this.title);
        this.builder.fullScrenIntent(this.pendingIntentAnswer);
        this.builder.actionsPendingIntent(this.pushActions);
        this.builder.contentPendingIntent(this.pendingIntentAnswer);
        this.builder.pushId(99);
        this.builder.isCallPush(false);
        this.builder.build();
        this.handler.postDelayed(this.showPushPeriodicallyRunnable, 1000);
    }

    private Intent createDeclineIntent() {
        Intent intent = new Intent(this.context, CallPushBroadcastReciver.class);
        intent.setAction(CallMaker.PUSH_CALL_BROADCAST);
        intent.putExtra(CallPushBroadcastReciver.KEY_ACTION, CallPushBroadcastReciver.ACTION_DISMISS);
        return intent;
    }

    private Intent createIntentForPushClick() {
        Integer num;
        String str;
        String str2;
        String str3;
        Intent addFlags = new Intent(this.context, CallIncomingActivity.class).addFlags(65536);
        String valueOf = String.valueOf(this.sipParametrs.getSipUser());
        String sipDomain = this.sipParametrs.getSipDomain();
        String sipPassword = this.sipParametrs.getSipPassword();
        String valueOf2 = String.valueOf(this.sipParametrs.getSipUser());
        String videoSource = this.sipParametrs.getVideoSource();
        String token = ProfileLocalRepository.Companion.getInstance().getUser().getToken();
        String fcmToken = ProfileLocalRepository.Companion.getInstance().getUser().getFcmToken();
        SipPreviewParams previewParams = this.sipParametrs.getPreviewParams();
        SipOpenDoorParam openDoorParam = this.sipParametrs.getOpenDoorParam();
        String str4 = null;
        if (previewParams != null) {
            str = previewParams.getUrl();
            num = previewParams.getFps();
            str2 = previewParams.getMjpegUrl();
        } else {
            str2 = null;
            str = null;
            num = null;
        }
        if (openDoorParam != null) {
            str4 = openDoorParam.getOpenDoorUrl();
            str3 = openDoorParam.getDtmf();
        } else {
            str3 = null;
        }
        Log.d("TAG", "XXX URL createIntentForPushClick " + this.sipParametrs.getPreviewParams().getMjpegUrl());
        Intent intent = addFlags;
        Intent intent2 = new Intent(this.context, LinphoneService.class);
        intent2.putExtra("id", valueOf);
        intent2.putExtra("domain", sipDomain);
        intent2.putExtra("name", valueOf2);
        intent2.putExtra("password", sipPassword);
        intent2.putExtra(SipParametrs.WHO_CALL, "");
        intent2.putExtra(SipParametrs.FPS, num);
        intent2.putExtra("url", str);
        Log.d("TAG", "XXX MJPEG 2 " + str2);
        intent2.putExtra(SipParametrs.MJPEG, str2);
        intent2.putExtra(SipParametrs.DTMF, str3);
        intent2.putExtra("open_door", str4);
        intent2.putExtra(SipParametrs.VIDEO_SOURCE, videoSource);
        intent2.putExtra("token", token);
        intent2.putExtra("firebase", fcmToken);
        return intent;
    }

    private Intent createIntentForOpenDoor() {
        SipOpenDoorParam openDoorParam = this.sipParametrs.getOpenDoorParam();
        Intent intent = new Intent(this.context, CallPushBroadcastReciver.class);
        intent.setAction("ACTION_OPEN_DOOR");
        intent.putExtra(CallPushBroadcastReciver.KEY_ACTION, CallPushBroadcastReciver.ACTION_OPEN_DOOR);
        intent.putExtra("open_door", openDoorParam.getOpenDoorUrl());
        return intent;
    }

    private PushActions[] createButtonsForPush() {
        this.pushActions = new PushActions[3];
        this.pushActions[0] = new PushActions(this.context.getString(R.string.label_answer), R.drawable.call_transfer, this.pendingIntentAnswer);
        if (!(this.sipParametrs.getOpenDoorParam() == null || this.sipParametrs.getOpenDoorParam().getOpenDoorUrl() == null || this.sipParametrs.getOpenDoorParam().getOpenDoorUrl().isEmpty())) {
            this.pushActions[1] = new PushActions(this.context.getString(R.string.label_open_domofon), R.drawable.ic_base_open_door, this.pendingIntentOpenDoor);
        }
        this.pushActions[2] = new PushActions(this.context.getString(R.string.label_answer_cancell), R.drawable.call_hangup, this.pendingIntentDecline);
        return this.pushActions;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void reinit(SipParametrs sipParametrs2) {
        this.sipParametrs = sipParametrs2;
        init();
    }

    public void stopShowPush() {
        Runnable runnable;
        this.showPush = false;
        Handler handler2 = this.handler;
        if (!(handler2 == null || (runnable = this.showPushPeriodicallyRunnable) == null)) {
            handler2.removeCallbacks(runnable);
        }
        Context context2 = this.context;
        if (context2 != null) {
            NotificationHelper.cancelNotificationById(context2, 99);
        }
    }

    public void stopService() {
        Log.d("TAG", "XXX ZZZ stopService");
        ServiceHelper.stopLinphoneService(this.context);
    }

    public void setContext(Context context2) {
        this.context = context2;
    }

    public void setSipParametrs(SipParametrs sipParametrs2) {
        this.sipParametrs = sipParametrs2;
    }

    public boolean isStartCall() {
        return this.isStartCall;
    }

    public void setStartCall(boolean z) {
        this.isStartCall = z;
    }
}
