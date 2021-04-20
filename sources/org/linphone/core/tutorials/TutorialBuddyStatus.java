package org.linphone.core.tutorials;

import java.nio.ByteBuffer;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneAuthInfo;
import org.linphone.core.LinphoneCall;
import org.linphone.core.LinphoneCallStats;
import org.linphone.core.LinphoneChatMessage;
import org.linphone.core.LinphoneChatRoom;
import org.linphone.core.LinphoneContent;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.LinphoneCoreListener;
import org.linphone.core.LinphoneEvent;
import org.linphone.core.LinphoneFriend;
import org.linphone.core.LinphoneFriendList;
import org.linphone.core.LinphoneInfoMessage;
import org.linphone.core.LinphoneProxyConfig;
import org.linphone.core.PublishState;
import org.linphone.core.SubscriptionState;

public class TutorialBuddyStatus implements LinphoneCoreListener {
    private TutorialNotifier TutorialNotifier;
    private boolean running;

    public void authInfoRequested(LinphoneCore linphoneCore, String str, String str2, String str3) {
    }

    public void authenticationRequested(LinphoneCore linphoneCore, LinphoneAuthInfo linphoneAuthInfo, LinphoneCore.AuthMethod authMethod) {
    }

    public void byeReceived(LinphoneCore linphoneCore, String str) {
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

    public void friendListCreated(LinphoneCore linphoneCore, LinphoneFriendList linphoneFriendList) {
    }

    public void friendListRemoved(LinphoneCore linphoneCore, LinphoneFriendList linphoneFriendList) {
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

    public void notifyReceived(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneAddress linphoneAddress, byte[] bArr) {
    }

    public void notifyReceived(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, String str, LinphoneContent linphoneContent) {
    }

    public void publishStateChanged(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, PublishState publishState) {
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

    public TutorialBuddyStatus(TutorialNotifier tutorialNotifier) {
        this.TutorialNotifier = tutorialNotifier;
    }

    public TutorialBuddyStatus() {
        this.TutorialNotifier = new TutorialNotifier();
    }

    public void newSubscriptionRequest(LinphoneCore linphoneCore, LinphoneFriend linphoneFriend, String str) {
        write("[" + linphoneFriend.getAddress().getUserName() + "] wants to see your status, accepting");
        linphoneFriend.edit();
        linphoneFriend.setIncSubscribePolicy(LinphoneFriend.SubscribePolicy.SPAccept);
        linphoneFriend.done();
        try {
            linphoneCore.addFriend(linphoneFriend);
        } catch (LinphoneCoreException unused) {
            write("Error while adding friend [" + linphoneFriend.getAddress().getUserName() + "] to linphone in the callback");
        }
    }

    public void notifyPresenceReceived(LinphoneCore linphoneCore, LinphoneFriend linphoneFriend) {
        write("New state [" + linphoneFriend.getStatus() + "] for user id [" + linphoneFriend.getAddress().getUserName() + "]");
    }

    public void registrationState(LinphoneCore linphoneCore, LinphoneProxyConfig linphoneProxyConfig, LinphoneCore.RegistrationState registrationState, String str) {
        write(linphoneProxyConfig.getIdentity() + " : " + str + "\n");
    }

    public static void main(String[] strArr) {
        if (strArr.length < 1 || strArr.length > 3) {
            throw new IllegalArgumentException("Bad number of arguments [" + strArr.length + "] should be 1, 2 or 3");
        }
        TutorialBuddyStatus tutorialBuddyStatus = new TutorialBuddyStatus();
        try {
            String str = strArr[1];
            String str2 = null;
            String str3 = strArr.length > 1 ? strArr[1] : null;
            if (strArr.length > 2) {
                str2 = strArr[2];
            }
            tutorialBuddyStatus.launchTutorial(str, str3, str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:38|39) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:16|17|18|19|20|21|14) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:29|30|31|32|33|34|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        write("Error while adding friend " + r10.getAddress().getUserName() + " to linphone");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0058 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x009e */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0058=Splitter:B:20:0x0058, B:33:0x007c=Splitter:B:33:0x007c, B:38:0x009e=Splitter:B:38:0x009e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void launchTutorial(java.lang.String r10, java.lang.String r11, java.lang.String r12) throws org.linphone.core.LinphoneCoreException {
        /*
            r9 = this;
            java.lang.String r0 = "Exited"
            java.lang.String r1 = "Shutting down..."
            org.linphone.core.LinphoneCoreFactory r2 = org.linphone.core.LinphoneCoreFactory.instance()
            r3 = 0
            org.linphone.core.LinphoneCore r4 = r2.createLinphoneCore(r9, r3)
            org.linphone.core.LinphoneFriend r10 = r4.createFriendWithAddress(r10)     // Catch:{ all -> 0x00c1 }
            if (r10 != 0) goto L_0x0022
            java.lang.String r10 = "Could not create friend; weird SIP address?"
            r9.write(r10)     // Catch:{ all -> 0x00c1 }
        L_0x0018:
            r9.write(r1)
            r4.destroy()
            r9.write(r0)
            return
        L_0x0022:
            java.lang.String r5 = "Interrupted!\nAborting"
            r6 = 1
            if (r11 == 0) goto L_0x005c
            org.linphone.core.LinphoneAddress r7 = r2.createLinphoneAddress(r11)     // Catch:{ all -> 0x00c1 }
            java.lang.String r8 = r7.getUserName()     // Catch:{ all -> 0x00c1 }
            java.lang.String r7 = r7.getDomain()     // Catch:{ all -> 0x00c1 }
            if (r12 == 0) goto L_0x003c
            org.linphone.core.LinphoneAuthInfo r12 = r2.createAuthInfo(r8, r12, r3, r7)     // Catch:{ all -> 0x00c1 }
            r4.addAuthInfo(r12)     // Catch:{ all -> 0x00c1 }
        L_0x003c:
            org.linphone.core.LinphoneProxyConfig r11 = r4.createProxyConfig(r11, r7, r3, r6)     // Catch:{ all -> 0x00c1 }
            r11.enablePublish(r6)     // Catch:{ all -> 0x00c1 }
            r4.addProxyConfig(r11)     // Catch:{ all -> 0x00c1 }
            r4.setDefaultProxyConfig(r11)     // Catch:{ all -> 0x00c1 }
        L_0x0049:
            boolean r12 = r11.isRegistered()     // Catch:{ all -> 0x00c1 }
            if (r12 != 0) goto L_0x005c
            r4.iterate()     // Catch:{ all -> 0x00c1 }
            r7 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r7)     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x0049
        L_0x0058:
            r9.write(r5)     // Catch:{ all -> 0x00c1 }
            goto L_0x0018
        L_0x005c:
            r10.enableSubscribes(r6)     // Catch:{ all -> 0x00c1 }
            org.linphone.core.LinphoneFriend$SubscribePolicy r11 = org.linphone.core.LinphoneFriend.SubscribePolicy.SPAccept     // Catch:{ all -> 0x00c1 }
            r10.setIncSubscribePolicy(r11)     // Catch:{ all -> 0x00c1 }
            r4.addFriend(r10)     // Catch:{ LinphoneCoreException -> 0x009e }
            org.linphone.core.OnlineStatus r11 = org.linphone.core.OnlineStatus.Online     // Catch:{ all -> 0x00c1 }
            r12 = 0
            r4.setPresenceInfo(r12, r3, r11)     // Catch:{ all -> 0x00c1 }
            r9.running = r6     // Catch:{ all -> 0x00c1 }
        L_0x006f:
            boolean r11 = r9.running     // Catch:{ all -> 0x00c1 }
            if (r11 == 0) goto L_0x0080
            r4.iterate()     // Catch:{ all -> 0x00c1 }
            r6 = 50
            java.lang.Thread.sleep(r6)     // Catch:{ InterruptedException -> 0x007c }
            goto L_0x006f
        L_0x007c:
            r9.write(r5)     // Catch:{ all -> 0x00c1 }
            goto L_0x0018
        L_0x0080:
            org.linphone.core.OnlineStatus r11 = org.linphone.core.OnlineStatus.Offline     // Catch:{ all -> 0x00c1 }
            r4.setPresenceInfo(r12, r3, r11)     // Catch:{ all -> 0x00c1 }
            r4.iterate()     // Catch:{ all -> 0x00c1 }
            r10.edit()     // Catch:{ all -> 0x00c1 }
            r10.enableSubscribes(r12)     // Catch:{ all -> 0x00c1 }
            r10.done()     // Catch:{ all -> 0x00c1 }
            r4.iterate()     // Catch:{ all -> 0x00c1 }
            r9.write(r1)
            r4.destroy()
            r9.write(r0)
            return
        L_0x009e:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
            r11.<init>()     // Catch:{ all -> 0x00c1 }
            java.lang.String r12 = "Error while adding friend "
            r11.append(r12)     // Catch:{ all -> 0x00c1 }
            org.linphone.core.LinphoneAddress r10 = r10.getAddress()     // Catch:{ all -> 0x00c1 }
            java.lang.String r10 = r10.getUserName()     // Catch:{ all -> 0x00c1 }
            r11.append(r10)     // Catch:{ all -> 0x00c1 }
            java.lang.String r10 = " to linphone"
            r11.append(r10)     // Catch:{ all -> 0x00c1 }
            java.lang.String r10 = r11.toString()     // Catch:{ all -> 0x00c1 }
            r9.write(r10)     // Catch:{ all -> 0x00c1 }
            goto L_0x0018
        L_0x00c1:
            r10 = move-exception
            r9.write(r1)
            r4.destroy()
            r9.write(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.core.tutorials.TutorialBuddyStatus.launchTutorial(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void stopMainLoop() {
        this.running = false;
    }

    private void write(String str) {
        this.TutorialNotifier.notify(str);
    }
}
