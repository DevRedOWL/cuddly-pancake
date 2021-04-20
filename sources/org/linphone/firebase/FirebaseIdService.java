package org.linphone.firebase;

import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import org.linphone.LinphonePreferences;
import org.linphone.UIThreadDispatcher;

public class FirebaseIdService extends FirebaseInstanceIdService {
    public void onTokenRefresh() {
        final String token = FirebaseInstanceId.getInstance().getToken();
        Log.i("FirebaseIdService", "[Push Notification] Refreshed token: " + token);
        UIThreadDispatcher.dispatch(new Runnable() {
            public void run() {
                LinphonePreferences.instance().setPushNotificationRegistrationID(token);
            }
        });
    }
}
