package org.linphone;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import com.google.android.gcm.GCMConstants;
import org.linphone.LinphonePreferences;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.LinphoneProxyConfig;
import org.linphone.core.LpConfig;
import org.linphone.mediastream.Log;

public class PreferencesMigrator {
    private LinphonePreferences mNewPrefs = LinphonePreferences.instance();
    private SharedPreferences mOldPrefs;
    private Resources mResources;

    public PreferencesMigrator(Context context) {
        this.mResources = context.getResources();
        this.mOldPrefs = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public boolean isEchoMigratioNeeded() {
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null && !this.mNewPrefs.isEchoConfigurationUpdated() && !lcIfManagerNotDestroyedOrNull.needsEchoCalibration() && this.mNewPrefs.isEchoCancellationEnabled()) {
            return true;
        }
        return false;
    }

    public boolean isMigrationNeeded() {
        return this.mOldPrefs.getInt(getString(C5321R.string.pref_extra_accounts), -1) != -1;
    }

    public void doMigration() {
        this.mNewPrefs.firstLaunchSuccessful();
        this.mNewPrefs.removePreviousVersionAuthInfoRemoval();
        this.mNewPrefs.setFrontCamAsDefault(getPrefBoolean(C5321R.string.pref_video_use_front_camera_key, true));
        this.mNewPrefs.setWifiOnlyEnabled(Boolean.valueOf(getPrefBoolean(C5321R.string.pref_wifi_only_key, false)));
        this.mNewPrefs.useRandomPort(getPrefBoolean(C5321R.string.pref_transport_use_random_ports_key, true), false);
        this.mNewPrefs.setPushNotificationEnabled(false);
        this.mNewPrefs.setDebugEnabled(getPrefBoolean(C5321R.string.pref_debug_key, false));
        this.mNewPrefs.setBackgroundModeEnabled(getPrefBoolean(C5321R.string.pref_background_mode_key, true));
        this.mNewPrefs.setAutoStart(getPrefBoolean(C5321R.string.pref_autostart_key, false));
        this.mNewPrefs.setSharingPictureServerUrl(getPrefString(C5321R.string.pref_image_sharing_server_key, (String) null));
        this.mNewPrefs.setRemoteProvisioningUrl(getPrefString(C5321R.string.pref_remote_provisioning_key, (String) null));
        doAccountsMigration();
        deleteAllOldPreferences();
    }

    public void migrateRemoteProvisioningUriIfNeeded() {
        String string = this.mNewPrefs.getConfig().getString(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "remote_provisioning", (String) null);
        String remoteProvisioningUrl = this.mNewPrefs.getRemoteProvisioningUrl();
        if (string != null && string.length() > 0 && remoteProvisioningUrl == null) {
            this.mNewPrefs.setRemoteProvisioningUrl(string);
            this.mNewPrefs.getConfig().setString(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "remote_provisioning", (String) null);
            this.mNewPrefs.getConfig().sync();
        }
    }

    public void migrateSharingServerUrlIfNeeded() {
        String string = this.mNewPrefs.getConfig().getString(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "sharing_server", (String) null);
        if (string == null || string.equals("https://www.linphone.org:444/upload.php")) {
            this.mNewPrefs.setSharingPictureServerUrl("https://www.linphone.org:444/lft.php");
            this.mNewPrefs.getConfig().sync();
        }
    }

    private void doAccountsMigration() {
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        lcIfManagerNotDestroyedOrNull.clearAuthInfos();
        lcIfManagerNotDestroyedOrNull.clearProxyConfigs();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < this.mOldPrefs.getInt(getString(C5321R.string.pref_extra_accounts), 1)) {
                if (i != getPrefInt(C5321R.string.pref_default_account_key, 0)) {
                    z = false;
                }
                doAccountMigration(i, z);
                i++;
            } else {
                return;
            }
        }
    }

    private void doAccountMigration(int i, boolean z) {
        String valueOf = i == 0 ? "" : String.valueOf(i);
        String prefString = getPrefString(getString(C5321R.string.pref_username_key) + valueOf, (String) null);
        String prefString2 = getPrefString(getString(C5321R.string.pref_auth_userid_key) + valueOf, (String) null);
        String prefString3 = getPrefString(getString(C5321R.string.pref_passwd_key) + valueOf, (String) null);
        String prefString4 = getPrefString(getString(C5321R.string.pref_domain_key) + valueOf, (String) null);
        if (prefString != null && prefString.length() > 0 && prefString3 != null) {
            LinphonePreferences.AccountBuilder expires = new LinphonePreferences.AccountBuilder(LinphoneManager.getLc()).setUsername(prefString).setUserId(prefString2).setDomain(prefString4).setPassword(prefString3).setProxy(getPrefString(getString(C5321R.string.pref_proxy_key) + valueOf, (String) null)).setExpires(getPrefString(C5321R.string.pref_expire_key, (String) null));
            if (getPrefBoolean(getString(C5321R.string.pref_enable_outbound_proxy_key) + valueOf, false)) {
                expires.setOutboundProxyEnabled(true);
            }
            if (this.mResources.getBoolean(C5321R.bool.enable_push_id)) {
                String pushNotificationRegistrationID = this.mNewPrefs.getPushNotificationRegistrationID();
                String string = getString(C5321R.string.push_sender_id);
                if (pushNotificationRegistrationID != null && this.mNewPrefs.isPushNotificationEnabled()) {
                    "app-id=" + string + ";pn-type=" + getString(C5321R.string.push_type) + ";pn-tok=" + pushNotificationRegistrationID;
                }
            }
            try {
                expires.saveNewAccount();
            } catch (LinphoneCoreException e) {
                Log.m6903e(e);
            }
            if (z) {
                this.mNewPrefs.setDefaultAccount(i);
            }
        }
    }

    public void doPresenceMigrationIfNeeded() {
        LinphoneProxyConfig defaultProxyConfig;
        String domain;
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        LpConfig config = lcIfManagerNotDestroyedOrNull.getConfig();
        if (config.getString(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "friendlist_subscription_enabled", (String) null) == null && (defaultProxyConfig = lcIfManagerNotDestroyedOrNull.getDefaultProxyConfig()) != null && (domain = defaultProxyConfig.getDomain()) != null && domain.equals(getString(C5321R.string.default_domain))) {
            config.setBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "friendlist_subscription_enabled", true);
        }
    }

    private void deleteAllOldPreferences() {
        SharedPreferences.Editor edit = this.mOldPrefs.edit();
        edit.clear();
        edit.apply();
    }

    private String getString(int i) {
        return this.mResources.getString(i);
    }

    private boolean getPrefBoolean(int i, boolean z) {
        return this.mOldPrefs.getBoolean(this.mResources.getString(i), z);
    }

    private boolean getPrefBoolean(String str, boolean z) {
        return this.mOldPrefs.getBoolean(str, z);
    }

    private String getPrefString(int i, String str) {
        return this.mOldPrefs.getString(this.mResources.getString(i), str);
    }

    private int getPrefInt(int i, int i2) {
        return this.mOldPrefs.getInt(this.mResources.getString(i), i2);
    }

    private String getPrefString(String str, String str2) {
        return this.mOldPrefs.getString(str, str2);
    }
}
