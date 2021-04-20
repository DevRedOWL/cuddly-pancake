package p035ru.unicorn.ujin.data.service;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.gson.Gson;
import java.util.Map;
import java.util.Random;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.SipParametrs;
import p035ru.unicorn.ujin.data.service.location.NotificationHelper;
import p035ru.unicorn.ujin.util.CallMaker;
import p035ru.unicorn.ujin.util.ServiceHelper;
import p035ru.unicorn.ujin.view.activity.TermsActivity;

/* renamed from: ru.unicorn.ujin.data.service.FCM */
public class FCM extends FirebaseMessagingService {
    public static String ACTION_COLLECT_DATA = "action_collect_data";
    public static String ACTION_OPEN_DOOR = "action_open_door";
    public static final String APARTMENT_ID = "apartmentid";
    public static final String BADGE = "badge";
    public static final int BASE_PUSH_ID = 0;
    public static final String BODY = "body";
    public static final String BOT = "bot";
    public static final String CALL_IN = "call_in";
    public static final String CHAT_ID = "chatid";
    public static final String CHAT_SOUND = "chat_sound";
    public static final String LIFITIME = "lifitime";
    public static final String LOCATION_DATA = "location_data";
    public static final String MARKET_ID = "market_id";
    public static final String MARKET_TYPE = "market_type";
    private static final int NO_BADGE = -1;
    public static int PUSH_WITH_ACTION_ID = 111;
    public static final String SIP = "sip";
    public static final String START_VIDEO_CALL = "startapp";
    public static final String STOP_VIDEO_CALL = "stopcall";
    public static final String TITLE = "title";
    public static final String chatid = "chatid";
    private int badgeCount = -1;
    private String body;
    private String bot;
    private CallMaker callMaker;
    private Boolean chatSound;
    private String lifeTime;
    private PendingIntent onPushClickIntent = null;
    private SipParametrs sipData = null;
    private String title;

    private void showPushInfo(RemoteMessage remoteMessage) {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        if (remoteMessage.getNotification() != null) {
            Log.d("TAG", "XXX ERROR NO NOTIFICATION NEED ");
        }
        if (remoteMessage.getData().size() > 0) {
            this.title = remoteMessage.getData().get("title");
            this.body = remoteMessage.getData().get(BODY);
            this.bot = remoteMessage.getData().get(BOT);
            this.lifeTime = remoteMessage.getData().get(LIFITIME);
            this.chatSound = Boolean.valueOf(remoteMessage.getData().get(CHAT_SOUND));
            if (remoteMessage.getData().get("title") == null) {
                getString(R.string.title_domofon);
            } else {
                String str = remoteMessage.getData().get("title");
            }
            String str2 = remoteMessage.getData().get(SIP);
            if (str2 != null && !str2.isEmpty()) {
                this.sipData = (SipParametrs) new Gson().fromJson(str2, SipParametrs.class);
            }
            this.badgeCount = remoteMessage.getData().get(BADGE) == null ? -1 : Integer.parseInt(remoteMessage.getData().get(BADGE));
            showPushInfo(remoteMessage);
            String str3 = this.bot;
            if (str3 == null) {
                Intent intent = new Intent(getApplicationContext(), TermsActivity.class);
                intent.addFlags(268435456);
                intent.addFlags(32768);
                for (Map.Entry next : remoteMessage.getData().entrySet()) {
                    intent.putExtra((String) next.getKey(), (String) next.getValue());
                    if (((String) next.getKey()).equals("chatid")) {
                        chatUpdate((String) next.getValue());
                    }
                }
                this.onPushClickIntent = PendingIntent.getActivity(this, new Random().nextInt(1000) + 5, intent, 134217728);
            } else if (str3.equals(START_VIDEO_CALL)) {
                this.callMaker = CallMaker.getInstance();
                this.callMaker.setContext(this);
                this.callMaker.setSip(this.sipData);
                this.callMaker.setMarkAsCallStarted();
                this.callMaker.init();
                return;
            } else if (this.bot.equals(STOP_VIDEO_CALL)) {
                this.callMaker = CallMaker.getInstance();
                this.callMaker.setContext(this);
                this.callMaker.stopCallAction();
                return;
            } else if (this.bot.equals(LOCATION_DATA)) {
                ServiceHelper.sendCommandToLocationServer(ACTION_COLLECT_DATA, this);
            }
            Intent intent2 = new Intent(getApplicationContext(), TermsActivity.class);
            for (Map.Entry next2 : remoteMessage.getData().entrySet()) {
                intent2.putExtra((String) next2.getKey(), (String) next2.getValue());
            }
            intent2.addFlags(268435456);
            intent2.addFlags(32768);
            intent2.putExtra(FirebaseMessaging.INSTANCE_ID_SCOPE, true);
            this.onPushClickIntent = PendingIntent.getActivity(this, new Random().nextInt(1000) + 5, intent2, 134217728);
            if ((StringUtils.isNotBlank(this.title) || StringUtils.isNotBlank(this.body)) && ((StringUtils.isNotEmpty(remoteMessage.getData().get(CHAT_SOUND)) && this.chatSound.booleanValue()) || !StringUtils.isNotEmpty(remoteMessage.getData().get(CHAT_SOUND)))) {
                new NotificationHelper.Builder(this).body(this.body).title(this.title).isCallPush(false).contentPendingIntent(this.onPushClickIntent).pushId(Integer.valueOf(new Random().nextInt(1000))).build();
            }
            NotificationHelper.showAppBadgeCount(this.badgeCount, this);
        }
    }

    private void chatUpdate(String str) {
        Intent intent = new Intent("chatUpdate");
        intent.putExtra("chatId", str);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }
}
