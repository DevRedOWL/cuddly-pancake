package org.linphone.firebase;

import android.util.Log;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import org.linphone.LinphoneManager;
import org.linphone.LinphoneService;
import org.linphone.UIThreadDispatcher;

public class FirebaseMessaging extends FirebaseMessagingService {
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.i(Constants.TAG, "[Push Notification] Received");
        if (!LinphoneService.isReady()) {
            Log.i(Constants.TAG, "[Push Notification] Starting Service");
        } else if (LinphoneManager.isInstanciated() && LinphoneManager.getLc().getCallsNb() == 0) {
            UIThreadDispatcher.dispatch(new Runnable() {
                public void run() {
                    if (LinphoneManager.isInstanciated() && LinphoneManager.getLc().getCallsNb() == 0) {
                        LinphoneManager.getLc().setNetworkReachable(false);
                        LinphoneManager.getLc().setNetworkReachable(true);
                    }
                }
            });
        }
    }
}
