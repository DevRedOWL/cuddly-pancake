package org.linphone.gcm;

import android.content.Context;
import android.content.Intent;
import com.google.android.gcm.GCMBaseIntentService;
import org.linphone.C5321R;
import org.linphone.LinphoneManager;
import org.linphone.LinphonePreferences;
import org.linphone.LinphoneService;
import org.linphone.UIThreadDispatcher;
import org.linphone.core.LinphoneCoreFactory;
import org.linphone.mediastream.Log;

public class GCMService extends GCMBaseIntentService {
    private void initLogger(Context context) {
        LinphonePreferences.instance().setContext(context);
        boolean isDebugEnabled = LinphonePreferences.instance().isDebugEnabled();
        LinphoneCoreFactory.instance().enableLogCollection(isDebugEnabled);
        LinphoneCoreFactory.instance().setDebugMode(isDebugEnabled, context.getString(C5321R.string.app_name));
    }

    /* access modifiers changed from: protected */
    public void onError(Context context, String str) {
        initLogger(context);
        Log.m6903e("[Push Notification] Error while registering: " + str);
    }

    /* access modifiers changed from: protected */
    public void onMessage(Context context, Intent intent) {
        initLogger(context);
        Log.m6901d("[Push Notification] Received");
        if (LinphoneService.isReady() && LinphoneManager.isInstanciated() && LinphoneManager.getLc().getCallsNb() == 0) {
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

    /* access modifiers changed from: protected */
    public void onRegistered(Context context, final String str) {
        initLogger(context);
        Log.m6901d("[Push Notification] Registered: " + str);
        UIThreadDispatcher.dispatch(new Runnable() {
            public void run() {
                LinphonePreferences.instance().setPushNotificationRegistrationID(str);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onUnregistered(Context context, String str) {
        initLogger(context);
        Log.m6907w("[Push Notification] Unregistered: " + str);
        UIThreadDispatcher.dispatch(new Runnable() {
            public void run() {
                LinphonePreferences.instance().setPushNotificationRegistrationID((String) null);
            }
        });
    }

    /* access modifiers changed from: protected */
    public String[] getSenderIds(Context context) {
        return new String[]{context.getString(C5321R.string.push_sender_id)};
    }
}
