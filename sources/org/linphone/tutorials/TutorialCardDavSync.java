package org.linphone.tutorials;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.util.Timer;
import java.util.TimerTask;
import org.linphone.C5321R;
import org.linphone.UIThreadDispatcher;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneAuthInfo;
import org.linphone.core.LinphoneCall;
import org.linphone.core.LinphoneCallStats;
import org.linphone.core.LinphoneChatMessage;
import org.linphone.core.LinphoneChatRoom;
import org.linphone.core.LinphoneContent;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.LinphoneCoreFactory;
import org.linphone.core.LinphoneCoreListener;
import org.linphone.core.LinphoneEvent;
import org.linphone.core.LinphoneFriend;
import org.linphone.core.LinphoneFriendList;
import org.linphone.core.LinphoneInfoMessage;
import org.linphone.core.LinphoneProxyConfig;
import org.linphone.core.PublishState;
import org.linphone.core.SubscriptionState;
import org.linphone.mediastream.Log;

public class TutorialCardDavSync extends Activity implements View.OnClickListener, LinphoneCoreListener, LinphoneFriendList.LinphoneFriendListListener {
    private EditText ha1;
    /* access modifiers changed from: private */

    /* renamed from: lc */
    public LinphoneCore f6362lc;
    private LinphoneFriendList lfl;
    private TextView logs;
    private EditText password;
    private EditText server;
    private Button synchronize;
    private Timer timer;
    private EditText username;

    public void authInfoRequested(LinphoneCore linphoneCore, String str, String str2, String str3) {
    }

    public void authenticationRequested(LinphoneCore linphoneCore, LinphoneAuthInfo linphoneAuthInfo, LinphoneCore.AuthMethod authMethod) {
    }

    public void callEncryptionChanged(LinphoneCore linphoneCore, LinphoneCall linphoneCall, boolean z, String str) {
    }

    public void callState(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneCall.State state, String str) {
    }

    public void callStatsUpdated(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneCallStats linphoneCallStats) {
    }

    public void configuringStatus(LinphoneCore linphoneCore, LinphoneCore.RemoteProvisioningState remoteProvisioningState, String str) {
    }

    public void displayMessage(LinphoneCore linphoneCore, String str) {
    }

    public void displayStatus(LinphoneCore linphoneCore, String str) {
    }

    public void displayWarning(LinphoneCore linphoneCore, String str) {
    }

    public void dtmfReceived(LinphoneCore linphoneCore, LinphoneCall linphoneCall, int i) {
    }

    public void ecCalibrationStatus(LinphoneCore linphoneCore, LinphoneCore.EcCalibratorStatus ecCalibratorStatus, int i, Object obj) {
    }

    public void fileTransferProgressIndication(LinphoneCore linphoneCore, LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, int i) {
    }

    public void fileTransferRecv(LinphoneCore linphoneCore, LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, byte[] bArr, int i) {
    }

    public int fileTransferSend(LinphoneCore linphoneCore, LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, ByteBuffer byteBuffer, int i) {
        return 0;
    }

    public void globalState(LinphoneCore linphoneCore, LinphoneCore.GlobalState globalState, String str) {
    }

    public void infoReceived(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneInfoMessage linphoneInfoMessage) {
    }

    public void isComposingReceived(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom) {
    }

    public void messageReceived(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom, LinphoneChatMessage linphoneChatMessage) {
    }

    public void messageReceivedUnableToDecrypted(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom, LinphoneChatMessage linphoneChatMessage) {
    }

    public void networkReachableChanged(LinphoneCore linphoneCore, boolean z) {
    }

    public void newSubscriptionRequest(LinphoneCore linphoneCore, LinphoneFriend linphoneFriend, String str) {
    }

    public void notifyPresenceReceived(LinphoneCore linphoneCore, LinphoneFriend linphoneFriend) {
    }

    public void notifyReceived(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneAddress linphoneAddress, byte[] bArr) {
    }

    public void notifyReceived(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, String str, LinphoneContent linphoneContent) {
    }

    public void publishStateChanged(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, PublishState publishState) {
    }

    public void registrationState(LinphoneCore linphoneCore, LinphoneProxyConfig linphoneProxyConfig, LinphoneCore.RegistrationState registrationState, String str) {
    }

    public void show(LinphoneCore linphoneCore) {
    }

    public void subscriptionStateChanged(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, SubscriptionState subscriptionState) {
    }

    public void transferState(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneCall.State state) {
    }

    public void uploadProgressIndication(LinphoneCore linphoneCore, int i, int i2) {
    }

    public void uploadStateChanged(LinphoneCore linphoneCore, LinphoneCore.LogCollectionUploadState logCollectionUploadState, String str) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5321R.layout.tuto_carddav);
        this.username = (EditText) findViewById(C5321R.C5324id.carddav_username);
        this.password = (EditText) findViewById(C5321R.C5324id.carddav_pwd);
        this.ha1 = (EditText) findViewById(C5321R.C5324id.carddav_ha1);
        this.server = (EditText) findViewById(C5321R.C5324id.carddav_server);
        this.logs = (TextView) findViewById(C5321R.C5324id.carddav_events);
        this.synchronize = (Button) findViewById(C5321R.C5324id.carddav_synchronize);
        this.synchronize.setOnClickListener(this);
        LinphoneCoreFactory.instance().setDebugMode(true, "CardDAV sync tutorial");
        try {
            this.f6362lc = LinphoneCoreFactory.instance().createLinphoneCore(this, this);
            C54521 r2 = new TimerTask() {
                public void run() {
                    UIThreadDispatcher.dispatch(new Runnable() {
                        public void run() {
                            if (TutorialCardDavSync.this.f6362lc != null) {
                                TutorialCardDavSync.this.f6362lc.iterate();
                            }
                        }
                    });
                }
            };
            this.timer = new Timer("Linphone scheduler");
            this.timer.schedule(r2, 0, 20);
            this.lfl = this.f6362lc.createLinphoneFriendList();
            this.f6362lc.addFriendList(this.lfl);
            LinphoneFriend createFriendWithAddress = this.f6362lc.createFriendWithAddress("sip:ghislain@sip.linphone.org");
            createFriendWithAddress.setName("Ghislain");
            this.lfl.addLocalFriend(createFriendWithAddress);
        } catch (LinphoneCoreException e) {
            Log.m6903e(e);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            this.f6362lc.removeFriendList(this.lfl);
        } catch (LinphoneCoreException e) {
            Log.m6903e(e);
        }
        this.timer.cancel();
        this.f6362lc.destroy();
        super.onDestroy();
    }

    public void onClick(View view) {
        String obj = this.server.getText().toString();
        this.f6362lc.addAuthInfo(LinphoneCoreFactory.instance().createAuthInfo(this.username.getText().toString(), (String) null, this.password.getText().toString(), this.ha1.getText().toString(), "SabreDAV", obj.replace("http://", "").replace("https://", "").split("/")[0]));
        this.lfl.setUri(obj);
        this.lfl.setListener(this);
        this.synchronize.setEnabled(false);
        this.lfl.synchronizeFriendsFromServer();
    }

    private void myLog(String str) {
        Log.m6901d(str);
        TextView textView = this.logs;
        textView.setText(this.logs.getText().toString() + "\r\n" + str);
    }

    public void onLinphoneFriendCreated(LinphoneFriendList linphoneFriendList, LinphoneFriend linphoneFriend) {
        myLog("Friend created " + linphoneFriend.getAddress());
        LinphoneFriend[] friendList = linphoneFriendList.getFriendList();
        StringBuilder sb = new StringBuilder();
        sb.append("There are ");
        sb.append(friendList.length);
        sb.append(friendList.length > 1 ? " friends" : " friend");
        sb.append(" in the list");
        myLog(sb.toString());
    }

    public void onLinphoneFriendUpdated(LinphoneFriendList linphoneFriendList, LinphoneFriend linphoneFriend, LinphoneFriend linphoneFriend2) {
        myLog("Friend updated " + linphoneFriend.getAddress());
        LinphoneFriend[] friendList = linphoneFriendList.getFriendList();
        StringBuilder sb = new StringBuilder();
        sb.append("There are ");
        sb.append(friendList.length);
        sb.append(friendList.length > 1 ? " friends" : " friend");
        sb.append(" in the list");
        myLog(sb.toString());
    }

    public void onLinphoneFriendDeleted(LinphoneFriendList linphoneFriendList, LinphoneFriend linphoneFriend) {
        myLog("Friend removed " + linphoneFriend.getAddress());
        LinphoneFriend[] friendList = linphoneFriendList.getFriendList();
        StringBuilder sb = new StringBuilder();
        sb.append("There are ");
        sb.append(friendList.length);
        sb.append(friendList.length > 1 ? " friends" : " friend");
        sb.append(" in the list");
        myLog(sb.toString());
    }

    public void onLinphoneFriendSyncStatusChanged(LinphoneFriendList linphoneFriendList, LinphoneFriendList.State state, String str) {
        myLog("Sync status changed: " + state.toString() + " (" + str + ")");
        if (state != LinphoneFriendList.State.SyncStarted) {
            this.synchronize.setEnabled(true);
        }
    }

    public void friendListCreated(LinphoneCore linphoneCore, LinphoneFriendList linphoneFriendList) {
        myLog("Friend List added");
        LinphoneFriendList[] friendLists = linphoneCore.getFriendLists();
        StringBuilder sb = new StringBuilder();
        sb.append("There are ");
        sb.append(friendLists.length);
        sb.append(friendLists.length > 1 ? " lists" : " list");
        sb.append(" in the core");
        myLog(sb.toString());
    }

    public void friendListRemoved(LinphoneCore linphoneCore, LinphoneFriendList linphoneFriendList) {
        myLog("Friend List removed");
        LinphoneFriendList[] friendLists = linphoneCore.getFriendLists();
        StringBuilder sb = new StringBuilder();
        sb.append("There are ");
        sb.append(friendLists.length);
        sb.append(friendLists.length > 1 ? " lists" : " list");
        sb.append(" in the core");
        myLog(sb.toString());
    }
}
