package org.linphone;

import org.linphone.core.LinphoneCallParams;
import org.linphone.core.LinphoneCore;

public class BandwidthManager {
    public static final int HIGH_RESOLUTION = 0;
    public static final int LOW_BANDWIDTH = 2;
    public static final int LOW_RESOLUTION = 1;
    private static BandwidthManager instance;
    private int currentProfile = 0;

    public int getCurrentProfile() {
        return this.currentProfile;
    }

    public static final synchronized BandwidthManager getInstance() {
        BandwidthManager bandwidthManager;
        synchronized (BandwidthManager.class) {
            if (instance == null) {
                instance = new BandwidthManager();
            }
            bandwidthManager = instance;
        }
        return bandwidthManager;
    }

    private BandwidthManager() {
    }

    public void updateWithProfileSettings(LinphoneCore linphoneCore, LinphoneCallParams linphoneCallParams) {
        if (linphoneCallParams == null) {
            return;
        }
        if (!isVideoPossible()) {
            linphoneCallParams.setVideoEnabled(false);
            linphoneCallParams.setAudioBandwidth(40);
            return;
        }
        linphoneCallParams.setVideoEnabled(true);
        linphoneCallParams.setAudioBandwidth(0);
    }

    public boolean isVideoPossible() {
        return this.currentProfile != 2;
    }
}
