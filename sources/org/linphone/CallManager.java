package org.linphone;

import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneCall;
import org.linphone.core.LinphoneCallParams;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreException;
import org.linphone.mediastream.Log;

public class CallManager {
    private static CallManager instance;

    private CallManager() {
    }

    public static final synchronized CallManager getInstance() {
        CallManager callManager;
        synchronized (CallManager.class) {
            if (instance == null) {
                instance = new CallManager();
            }
            callManager = instance;
        }
        return callManager;
    }

    /* renamed from: bm */
    private BandwidthManager m6899bm() {
        return BandwidthManager.getInstance();
    }

    public void inviteAddress(LinphoneAddress linphoneAddress, boolean z, boolean z2) throws LinphoneCoreException {
        LinphoneCore lc = LinphoneManager.getLc();
        LinphoneCallParams createCallParams = lc.createCallParams((LinphoneCall) null);
        m6899bm().updateWithProfileSettings(lc, createCallParams);
        if (!z || !createCallParams.getVideoEnabled()) {
            createCallParams.setVideoEnabled(false);
        } else {
            createCallParams.setVideoEnabled(true);
        }
        if (z2) {
            createCallParams.enableLowBandwidth(true);
            Log.m6901d("Low bandwidth enabled in call params");
        }
        lc.inviteAddressWithParams(linphoneAddress, createCallParams);
    }

    /* access modifiers changed from: package-private */
    public boolean reinviteWithVideo() {
        LinphoneCore lc = LinphoneManager.getLc();
        LinphoneCall currentCall = lc.getCurrentCall();
        if (currentCall == null) {
            Log.m6903e("Trying to reinviteWithVideo while not in call: doing nothing");
            return false;
        }
        LinphoneCallParams createCallParams = lc.createCallParams(currentCall);
        if (createCallParams.getVideoEnabled()) {
            return false;
        }
        m6899bm().updateWithProfileSettings(lc, createCallParams);
        if (!createCallParams.getVideoEnabled()) {
            return false;
        }
        lc.updateCall(currentCall, createCallParams);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void reinvite() {
        LinphoneCore lc = LinphoneManager.getLc();
        LinphoneCall currentCall = lc.getCurrentCall();
        if (currentCall == null) {
            Log.m6903e("Trying to reinvite while not in call: doing nothing");
            return;
        }
        LinphoneCallParams createCallParams = lc.createCallParams(currentCall);
        m6899bm().updateWithProfileSettings(lc, createCallParams);
        lc.updateCall(currentCall, createCallParams);
    }

    public void updateCall() {
        LinphoneCore lc = LinphoneManager.getLc();
        LinphoneCall currentCall = lc.getCurrentCall();
        if (currentCall == null) {
            Log.m6903e("Trying to updateCall while not in call: doing nothing");
            return;
        }
        m6899bm().updateWithProfileSettings(lc, lc.createCallParams(currentCall));
        lc.updateCall(currentCall, (LinphoneCallParams) null);
    }
}
