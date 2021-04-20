package org.linphone;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.LinphoneCoreListenerBase;
import org.linphone.core.LinphoneProxyConfig;
import org.linphone.core.PayloadType;
import org.linphone.mediastream.Log;
import org.linphone.mediastream.Version;
import org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration;
import org.linphone.p054ui.LedPreference;
import org.linphone.p054ui.PreferencesListFragment;
import org.linphone.tools.OpenH264DownloadHelper;

public class SettingsFragment extends PreferencesListFragment {
    /* access modifiers changed from: private */
    public PreferenceScreen currentPreferenceScreen;
    private Handler mHandler = new Handler();
    private LinphoneCoreListenerBase mListener;
    /* access modifiers changed from: private */
    public LinphonePreferences mPrefs;
    private Preference.OnPreferenceClickListener prefClickListener = new Preference.OnPreferenceClickListener() {
        public boolean onPreferenceClick(Preference preference) {
            PreferenceScreen unused = SettingsFragment.this.currentPreferenceScreen = (PreferenceScreen) preference;
            return false;
        }
    };

    public SettingsFragment() {
        super(C5321R.xml.preferences);
    }

    public void closePreferenceScreen() {
        PreferenceScreen preferenceScreen = this.currentPreferenceScreen;
        if (preferenceScreen != null && preferenceScreen.getDialog() != null) {
            this.currentPreferenceScreen.getDialog().dismiss();
            this.currentPreferenceScreen = null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mPrefs = LinphonePreferences.instance();
        removePreviousPreferencesFile();
        this.mListener = new LinphoneCoreListenerBase() {
            public void ecCalibrationStatus(LinphoneCore linphoneCore, LinphoneCore.EcCalibratorStatus ecCalibratorStatus, int i, Object obj) {
                LinphoneManager.getInstance().routeAudioToReceiver();
                SettingsFragment settingsFragment = SettingsFragment.this;
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) settingsFragment.findPreference(settingsFragment.getString(C5321R.string.pref_echo_cancellation_key));
                SettingsFragment settingsFragment2 = SettingsFragment.this;
                Preference findPreference = settingsFragment2.findPreference(settingsFragment2.getString(C5321R.string.pref_echo_canceller_calibration_key));
                if (ecCalibratorStatus == LinphoneCore.EcCalibratorStatus.DoneNoEcho) {
                    findPreference.setSummary(C5321R.string.no_echo);
                    checkBoxPreference.setChecked(false);
                    LinphonePreferences.instance().setEchoCancellation(false);
                    ((AudioManager) SettingsFragment.this.getActivity().getSystemService("audio")).setMode(0);
                    Log.m6905i("Set audio mode on 'Normal'");
                } else if (ecCalibratorStatus == LinphoneCore.EcCalibratorStatus.Done) {
                    findPreference.setSummary(String.format(SettingsFragment.this.getString(C5321R.string.ec_calibrated), new Object[]{Integer.valueOf(i)}));
                    checkBoxPreference.setChecked(true);
                    LinphonePreferences.instance().setEchoCancellation(true);
                    ((AudioManager) SettingsFragment.this.getActivity().getSystemService("audio")).setMode(0);
                    Log.m6905i("Set audio mode on 'Normal'");
                } else if (ecCalibratorStatus == LinphoneCore.EcCalibratorStatus.Failed) {
                    findPreference.setSummary(C5321R.string.failed);
                    checkBoxPreference.setChecked(true);
                    LinphonePreferences.instance().setEchoCancellation(true);
                    ((AudioManager) SettingsFragment.this.getActivity().getSystemService("audio")).setMode(0);
                    Log.m6905i("Set audio mode on 'Normal'");
                }
            }
        };
        initSettings();
        setListeners();
        hideSettings();
    }

    private void removePreviousPreferencesFile() {
        SharedPreferences.Editor edit = getPreferenceManager().getSharedPreferences().edit();
        edit.clear();
        edit.apply();
        LinphoneUtils.recursiveFileRemoval(new File(getActivity().getFilesDir().getAbsolutePath() + "shared_prefs"));
    }

    private void initSettings() {
        initTunnelSettings();
        initAudioSettings();
        initVideoSettings();
        initCallSettings();
        initChatSettings();
        initNetworkSettings();
        initAdvancedSettings();
        findPreference(getString(C5321R.string.pref_add_account_key)).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            public boolean onPreferenceClick(Preference preference) {
                LinphoneActivity.instance().displayAccountSettings(SettingsFragment.this.mPrefs.getAccountCount());
                return true;
            }
        });
    }

    private void setListeners() {
        findPreference(getString(C5321R.string.pref_tunnel_key)).setOnPreferenceClickListener(this.prefClickListener);
        findPreference(getString(C5321R.string.pref_audio_key)).setOnPreferenceClickListener(this.prefClickListener);
        findPreference(getString(C5321R.string.pref_video_key)).setOnPreferenceClickListener(this.prefClickListener);
        findPreference(getString(C5321R.string.pref_call_key)).setOnPreferenceClickListener(this.prefClickListener);
        findPreference(getString(C5321R.string.pref_chat_key)).setOnPreferenceClickListener(this.prefClickListener);
        findPreference(getString(C5321R.string.pref_network_key)).setOnPreferenceClickListener(this.prefClickListener);
        findPreference(getString(C5321R.string.pref_advanced_key)).setOnPreferenceClickListener(this.prefClickListener);
        setTunnelPreferencesListener();
        setAudioPreferencesListener();
        setVideoPreferencesListener();
        setCallPreferencesListener();
        setChatPreferencesListener();
        setNetworkPreferencesListener();
        setAdvancedPreferencesListener();
    }

    private void hideSettings() {
        if (getResources().getBoolean(C5321R.bool.hide_accounts)) {
            emptyAndHidePreference(C5321R.string.pref_sipaccounts_key);
        }
        if (!getResources().getBoolean(C5321R.bool.replace_assistant_with_old_interface)) {
            hidePreference(C5321R.string.pref_add_account_key);
        }
        if (getResources().getBoolean(C5321R.bool.disable_chat)) {
            findPreference(getString(C5321R.string.pref_image_sharing_server_key)).setLayoutResource(C5321R.layout.hidden);
        }
        getResources().getBoolean(C5321R.bool.enable_push_id);
        if (!Version.isVideoCapable() || !LinphoneManager.getLcIfManagerNotDestroyedOrNull().isVideoSupported()) {
            emptyAndHidePreference(C5321R.string.pref_video_key);
        } else if (!AndroidCameraConfiguration.hasFrontCamera()) {
            uncheckAndHidePreference(C5321R.string.pref_video_use_front_camera_key);
        }
        if (!LinphoneManager.getLc().isTunnelAvailable()) {
            emptyAndHidePreference(C5321R.string.pref_tunnel_key);
        }
        if (getResources().getBoolean(C5321R.bool.hide_camera_settings)) {
            emptyAndHidePreference(C5321R.string.pref_video_key);
        }
        if (getResources().getBoolean(C5321R.bool.disable_every_log)) {
            uncheckAndHidePreference(C5321R.string.pref_debug_key);
        }
        if (!LinphoneManager.getLc().upnpAvailable()) {
            uncheckAndHidePreference(C5321R.string.pref_upnp_enable_key);
        }
    }

    private void uncheckAndHidePreference(int i) {
        Preference findPreference = findPreference(getString(i));
        if (findPreference instanceof CheckBoxPreference) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference;
            checkBoxPreference.setChecked(false);
            hidePreference((Preference) checkBoxPreference);
        }
    }

    private void emptyAndHidePreference(int i) {
        Preference findPreference = findPreference(getString(i));
        if (findPreference instanceof PreferenceCategory) {
            emptyAndHidePreferenceCategory(i);
        } else if (findPreference instanceof PreferenceScreen) {
            emptyAndHidePreferenceScreen(i);
        }
    }

    private void emptyAndHidePreferenceCategory(int i) {
        Preference findPreference = findPreference(getString(i));
        if (findPreference instanceof PreferenceCategory) {
            PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference;
            preferenceCategory.removeAll();
            hidePreference((Preference) preferenceCategory);
        }
    }

    private void emptyAndHidePreferenceScreen(int i) {
        Preference findPreference = findPreference(getString(i));
        if (findPreference instanceof PreferenceScreen) {
            PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference;
            preferenceScreen.removeAll();
            hidePreference((Preference) preferenceScreen);
        }
    }

    private void hidePreference(int i) {
        hidePreference(findPreference(getString(i)));
    }

    private void hidePreference(Preference preference) {
        preference.setLayoutResource(C5321R.layout.hidden);
    }

    private void setPreferenceDefaultValueAndSummary(int i, String str) {
        EditTextPreference editTextPreference;
        if (str != null && (editTextPreference = (EditTextPreference) findPreference(getString(i))) != null) {
            editTextPreference.setText(str);
            editTextPreference.setSummary(str);
        }
    }

    private void initTunnelSettings() {
        if (LinphoneManager.isInstanciated() && LinphoneManager.getLc().isTunnelAvailable()) {
            setPreferenceDefaultValueAndSummary(C5321R.string.pref_tunnel_host_key, this.mPrefs.getTunnelHost());
            setPreferenceDefaultValueAndSummary(C5321R.string.pref_tunnel_port_key, String.valueOf(this.mPrefs.getTunnelPort()));
            ListPreference listPreference = (ListPreference) findPreference(getString(C5321R.string.pref_tunnel_mode_key));
            String tunnelMode = this.mPrefs.getTunnelMode();
            listPreference.setSummary(tunnelMode);
            listPreference.setValue(tunnelMode);
        }
    }

    private void setTunnelPreferencesListener() {
        findPreference(getString(C5321R.string.pref_tunnel_host_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                String obj2 = obj.toString();
                SettingsFragment.this.mPrefs.setTunnelHost(obj2);
                preference.setSummary(obj2);
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_tunnel_port_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                try {
                    int parseInt = Integer.parseInt(obj.toString());
                    SettingsFragment.this.mPrefs.setTunnelPort(parseInt);
                    preference.setSummary(String.valueOf(parseInt));
                    return true;
                } catch (NumberFormatException unused) {
                    return false;
                }
            }
        });
        findPreference(getString(C5321R.string.pref_tunnel_mode_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                String obj2 = obj.toString();
                SettingsFragment.this.mPrefs.setTunnelMode(obj2);
                preference.setSummary(obj2);
                return true;
            }
        });
    }

    private void initAccounts() {
        if (!getResources().getBoolean(C5321R.bool.hide_accounts)) {
            PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference(getString(C5321R.string.pref_sipaccounts_key));
            preferenceCategory.removeAll();
            int defaultAccountIndex = this.mPrefs.getDefaultAccountIndex();
            int accountCount = this.mPrefs.getAccountCount();
            for (final int i = 0; i < accountCount; i++) {
                String accountUsername = this.mPrefs.getAccountUsername(i);
                String accountDomain = this.mPrefs.getAccountDomain(i);
                LedPreference ledPreference = new LedPreference(getActivity());
                if (accountUsername == null) {
                    ledPreference.setTitle(getString(C5321R.string.pref_sipaccount));
                } else {
                    ledPreference.setTitle(accountUsername + "@" + accountDomain);
                }
                if (defaultAccountIndex == i) {
                    ledPreference.setSummary(C5321R.string.default_account_flag);
                }
                ledPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
                    public boolean onPreferenceClick(Preference preference) {
                        LinphoneActivity.instance().displayAccountSettings(i);
                        return false;
                    }
                });
                updateAccountLed(ledPreference, accountUsername, accountDomain, this.mPrefs.isAccountEnabled(i));
                preferenceCategory.addPreference(ledPreference);
            }
        }
    }

    /* access modifiers changed from: private */
    public void updateAccountLed(final LedPreference ledPreference, final String str, final String str2, boolean z) {
        if (!z) {
            ledPreference.setLed(C5321R.C5323drawable.led_disconnected);
        } else if (LinphoneManager.getLcIfManagerNotDestroyedOrNull() != null) {
            LinphoneProxyConfig[] proxyConfigList = LinphoneManager.getLc().getProxyConfigList();
            int length = proxyConfigList.length;
            int i = 0;
            while (i < length) {
                LinphoneProxyConfig linphoneProxyConfig = proxyConfigList[i];
                LinphoneAddress address = linphoneProxyConfig.getAddress();
                if (!address.getUserName().equals(str) || !address.getDomain().equals(str2)) {
                    i++;
                } else if (linphoneProxyConfig.getState() == LinphoneCore.RegistrationState.RegistrationOk) {
                    ledPreference.setLed(C5321R.C5323drawable.led_connected);
                    return;
                } else if (linphoneProxyConfig.getState() == LinphoneCore.RegistrationState.RegistrationFailed) {
                    ledPreference.setLed(C5321R.C5323drawable.led_error);
                    return;
                } else if (linphoneProxyConfig.getState() == LinphoneCore.RegistrationState.RegistrationProgress) {
                    ledPreference.setLed(C5321R.C5323drawable.led_inprogress);
                    this.mHandler.postDelayed(new Runnable() {
                        public void run() {
                            SettingsFragment.this.updateAccountLed(ledPreference, str, str2, true);
                        }
                    }, 500);
                    return;
                } else {
                    ledPreference.setLed(C5321R.C5323drawable.led_disconnected);
                    return;
                }
            }
        }
    }

    private void initMediaEncryptionPreference(ListPreference listPreference) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(getString(C5321R.string.pref_none));
        arrayList2.add(getString(C5321R.string.pref_media_encryption_key_none));
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull == null || getResources().getBoolean(C5321R.bool.disable_all_security_features_for_markets)) {
            setListPreferenceValues(listPreference, arrayList, arrayList2);
            return;
        }
        boolean mediaEncryptionSupported = lcIfManagerNotDestroyedOrNull.mediaEncryptionSupported(LinphoneCore.MediaEncryption.ZRTP);
        boolean mediaEncryptionSupported2 = lcIfManagerNotDestroyedOrNull.mediaEncryptionSupported(LinphoneCore.MediaEncryption.SRTP);
        boolean mediaEncryptionSupported3 = lcIfManagerNotDestroyedOrNull.mediaEncryptionSupported(LinphoneCore.MediaEncryption.DTLS);
        if (mediaEncryptionSupported2 || mediaEncryptionSupported || mediaEncryptionSupported3) {
            if (mediaEncryptionSupported2) {
                arrayList.add(getString(C5321R.string.media_encryption_srtp));
                arrayList2.add(getString(C5321R.string.pref_media_encryption_key_srtp));
            }
            if (mediaEncryptionSupported) {
                arrayList.add(getString(C5321R.string.media_encryption_zrtp));
                arrayList2.add(getString(C5321R.string.pref_media_encryption_key_zrtp));
            }
            if (mediaEncryptionSupported3) {
                arrayList.add(getString(C5321R.string.media_encryption_dtls));
                arrayList2.add(getString(C5321R.string.pref_media_encryption_key_dtls));
            }
            setListPreferenceValues(listPreference, arrayList, arrayList2);
        } else {
            listPreference.setEnabled(false);
        }
        LinphoneCore.MediaEncryption mediaEncryption = this.mPrefs.getMediaEncryption();
        listPreference.setSummary(mediaEncryption.toString());
        String string = getString(C5321R.string.pref_media_encryption_key_none);
        if (mediaEncryption.toString().equals(getString(C5321R.string.media_encryption_srtp))) {
            string = getString(C5321R.string.pref_media_encryption_key_srtp);
        } else if (mediaEncryption.toString().equals(getString(C5321R.string.media_encryption_zrtp))) {
            string = getString(C5321R.string.pref_media_encryption_key_zrtp);
        } else if (mediaEncryption.toString().equals(getString(C5321R.string.media_encryption_dtls))) {
            string = getString(C5321R.string.pref_media_encryption_key_dtls);
        }
        listPreference.setValue(string);
    }

    private void initializePreferredVideoSizePreferences(ListPreference listPreference) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str : LinphoneManager.getLc().getSupportedVideoSizes()) {
            arrayList.add(str);
            arrayList2.add(str);
        }
        setListPreferenceValues(listPreference, arrayList, arrayList2);
        String preferredVideoSize = this.mPrefs.getPreferredVideoSize();
        listPreference.setSummary(preferredVideoSize);
        listPreference.setValue(preferredVideoSize);
    }

    private void initializePreferredVideoFpsPreferences(ListPreference listPreference) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(getString(C5321R.string.pref_none));
        arrayList2.add("0");
        for (int i = 5; i <= 30; i += 5) {
            String num = Integer.toString(i);
            arrayList.add(num);
            arrayList2.add(num);
        }
        setListPreferenceValues(listPreference, arrayList, arrayList2);
        String num2 = Integer.toString(this.mPrefs.getPreferredVideoFps());
        if (num2.equals("0")) {
            num2 = getString(C5321R.string.pref_none);
        }
        listPreference.setSummary(num2);
        listPreference.setValue(num2);
    }

    private void initLimeEncryptionPreference(ListPreference listPreference) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(getString(C5321R.string.lime_encryption_entry_disabled));
        arrayList2.add(LinphoneCore.LinphoneLimeState.Disabled.toString());
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull == null || !lcIfManagerNotDestroyedOrNull.isLimeEncryptionAvailable()) {
            setListPreferenceValues(listPreference, arrayList, arrayList2);
            listPreference.setEnabled(false);
            return;
        }
        arrayList.add(getString(C5321R.string.lime_encryption_entry_mandatory));
        arrayList2.add(LinphoneCore.LinphoneLimeState.Mandatory.toString());
        arrayList.add(getString(C5321R.string.lime_encryption_entry_preferred));
        arrayList2.add(LinphoneCore.LinphoneLimeState.Preferred.toString());
        setListPreferenceValues(listPreference, arrayList, arrayList2);
        LinphoneCore.LinphoneLimeState limeEncryption = this.mPrefs.getLimeEncryption();
        if (limeEncryption == LinphoneCore.LinphoneLimeState.Disabled) {
            listPreference.setSummary(getString(C5321R.string.lime_encryption_entry_disabled));
        } else if (limeEncryption == LinphoneCore.LinphoneLimeState.Mandatory) {
            listPreference.setSummary(getString(C5321R.string.lime_encryption_entry_mandatory));
        } else if (limeEncryption == LinphoneCore.LinphoneLimeState.Preferred) {
            listPreference.setSummary(getString(C5321R.string.lime_encryption_entry_preferred));
        }
        listPreference.setValue(limeEncryption.toString());
    }

    private static void setListPreferenceValues(ListPreference listPreference, List<CharSequence> list, List<CharSequence> list2) {
        CharSequence[] charSequenceArr = new CharSequence[list.size()];
        list.toArray(charSequenceArr);
        listPreference.setEntries(charSequenceArr);
        CharSequence[] charSequenceArr2 = new CharSequence[list2.size()];
        list2.toArray(charSequenceArr2);
        listPreference.setEntryValues(charSequenceArr2);
    }

    private void initAudioSettings() {
        PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference(getString(C5321R.string.pref_codecs_key));
        preferenceCategory.removeAll();
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        for (final PayloadType payloadType : lcIfManagerNotDestroyedOrNull.getAudioCodecs()) {
            CheckBoxPreference checkBoxPreference = new CheckBoxPreference(getActivity());
            checkBoxPreference.setTitle(payloadType.getMime());
            if (payloadType.getMime().equals("mpeg4-generic")) {
                if (Build.VERSION.SDK_INT < 16) {
                    try {
                        lcIfManagerNotDestroyedOrNull.enablePayloadType(payloadType, false);
                    } catch (LinphoneCoreException e) {
                        Log.m6903e(e);
                    }
                } else {
                    checkBoxPreference.setTitle("AAC-ELD");
                }
            }
            checkBoxPreference.setSummary(payloadType.getRate() + " Hz");
            checkBoxPreference.setChecked(lcIfManagerNotDestroyedOrNull.isPayloadTypeEnabled(payloadType));
            checkBoxPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
                public boolean onPreferenceChange(Preference preference, Object obj) {
                    try {
                        LinphoneManager.getLcIfManagerNotDestroyedOrNull().enablePayloadType(payloadType, ((Boolean) obj).booleanValue());
                    } catch (LinphoneCoreException e) {
                        Log.m6903e(e);
                    }
                    return true;
                }
            });
            preferenceCategory.addPreference(checkBoxPreference);
        }
        ((CheckBoxPreference) findPreference(getString(C5321R.string.pref_echo_cancellation_key))).setChecked(this.mPrefs.isEchoCancellationEnabled());
        if (this.mPrefs.isEchoCancellationEnabled()) {
            findPreference(getString(C5321R.string.pref_echo_canceller_calibration_key)).setSummary(String.format(getString(C5321R.string.ec_calibrated), new Object[]{Integer.valueOf(this.mPrefs.getEchoCalibration())}));
        }
        ((CheckBoxPreference) findPreference(getString(C5321R.string.pref_adaptive_rate_control_key))).setChecked(this.mPrefs.isAdaptiveRateControlEnabled());
        ListPreference listPreference = (ListPreference) findPreference(getString(C5321R.string.pref_codec_bitrate_limit_key));
        listPreference.setSummary(String.valueOf(this.mPrefs.getCodecBitrateLimit()));
        listPreference.setValue(String.valueOf(this.mPrefs.getCodecBitrateLimit()));
    }

    private void setAudioPreferencesListener() {
        findPreference(getString(C5321R.string.pref_echo_cancellation_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.setEchoCancellation(((Boolean) obj).booleanValue());
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_adaptive_rate_control_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.enableAdaptiveRateControl(((Boolean) obj).booleanValue());
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_codec_bitrate_limit_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.setCodecBitrateLimit(Integer.parseInt(obj.toString()));
                LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
                int parseInt = Integer.parseInt(obj.toString());
                for (PayloadType payloadType : lcIfManagerNotDestroyedOrNull.getAudioCodecs()) {
                    if (lcIfManagerNotDestroyedOrNull.payloadTypeIsVbr(payloadType)) {
                        lcIfManagerNotDestroyedOrNull.setPayloadTypeBitrate(payloadType, parseInt);
                    }
                }
                preference.setSummary(String.valueOf(SettingsFragment.this.mPrefs.getCodecBitrateLimit()));
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_echo_canceller_calibration_key)).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            public boolean onPreferenceClick(Preference preference) {
                synchronized (SettingsFragment.this) {
                    preference.setSummary(C5321R.string.ec_calibrating);
                    if (SettingsFragment.this.getActivity().getPackageManager().checkPermission("android.permission.RECORD_AUDIO", SettingsFragment.this.getActivity().getPackageName()) == 0) {
                        SettingsFragment.this.startEchoCancellerCalibration();
                    } else {
                        LinphoneActivity.instance().checkAndRequestRecordAudioPermissionForEchoCanceller();
                    }
                }
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_echo_tester_key)).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            public boolean onPreferenceClick(Preference preference) {
                synchronized (SettingsFragment.this) {
                    if (SettingsFragment.this.getActivity().getPackageManager().checkPermission("android.permission.RECORD_AUDIO", SettingsFragment.this.getActivity().getPackageName()) != 0) {
                        LinphoneActivity.instance().checkAndRequestRecordAudioPermissionsForEchoTester();
                    } else if (LinphoneManager.getInstance().getEchoTesterStatus()) {
                        SettingsFragment.this.stopEchoTester();
                    } else {
                        SettingsFragment.this.startEchoTester();
                    }
                }
                return true;
            }
        });
    }

    public void startEchoTester() {
        Preference findPreference = findPreference(getString(C5321R.string.pref_echo_tester_key));
        try {
            if (LinphoneManager.getInstance().startEchoTester() > 0) {
                findPreference.setSummary("Is running");
            }
        } catch (LinphoneCoreException e) {
            e.printStackTrace();
        }
    }

    public void stopEchoTester() {
        Preference findPreference = findPreference(getString(C5321R.string.pref_echo_tester_key));
        try {
            if (LinphoneManager.getInstance().stopEchoTester() > 0) {
                findPreference.setSummary("Is stopped");
            }
        } catch (LinphoneCoreException e) {
            e.printStackTrace();
        }
    }

    public void startEchoCancellerCalibration() {
        try {
            if (LinphoneManager.getInstance().getEchoTesterStatus()) {
                stopEchoTester();
            }
            LinphoneManager.getInstance().startEcCalibration(this.mListener);
        } catch (LinphoneCoreException e) {
            Log.m6903e(e);
        }
    }

    public void echoCalibrationFail() {
        findPreference(getString(C5321R.string.pref_echo_canceller_calibration_key)).setSummary(C5321R.string.failed);
    }

    /* access modifiers changed from: private */
    public void initOpenH264AlertDialog(final OpenH264DownloadHelper openH264DownloadHelper, final CheckBoxPreference checkBoxPreference) {
        openH264DownloadHelper.setOpenH264HelperListener(LinphoneManager.getInstance().getOpenH264HelperListener());
        openH264DownloadHelper.setUserData(0, LinphoneManager.getInstance().getContext());
        openH264DownloadHelper.setUserData(1, checkBoxPreference);
        AlertDialog.Builder builder = new AlertDialog.Builder(LinphoneManager.getInstance().getContext());
        builder.setCancelable(false);
        builder.setMessage("Do you agree to download " + openH264DownloadHelper.getLicenseMessage()).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i == -1) {
                    openH264DownloadHelper.downloadCodec();
                }
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i == -2) {
                    checkBoxPreference.setChecked(false);
                }
            }
        }).show();
    }

    private void initVideoSettings() {
        boolean z;
        initializePreferredVideoSizePreferences((ListPreference) findPreference(getString(C5321R.string.pref_preferred_video_size_key)));
        initializePreferredVideoFpsPreferences((ListPreference) findPreference(getString(C5321R.string.pref_preferred_video_fps_key)));
        EditTextPreference editTextPreference = (EditTextPreference) findPreference(getString(C5321R.string.pref_bandwidth_limit_key));
        editTextPreference.setText(Integer.toString(this.mPrefs.getBandwidthLimit()));
        editTextPreference.setSummary(editTextPreference.getText());
        updateVideoPreferencesAccordingToPreset();
        ListPreference listPreference = (ListPreference) findPreference(getString(C5321R.string.pref_video_preset_key));
        listPreference.setSummary(this.mPrefs.getVideoPreset());
        listPreference.setValue(this.mPrefs.getVideoPreset());
        PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference(getString(C5321R.string.pref_video_codecs_key));
        preferenceCategory.removeAll();
        final LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        final OpenH264DownloadHelper openH264DownloadHelper = LinphoneManager.getInstance().getOpenH264DownloadHelper();
        PayloadType[] videoCodecs = lcIfManagerNotDestroyedOrNull.getVideoCodecs();
        int length = videoCodecs.length;
        char c = 0;
        boolean z2 = false;
        int i = 0;
        while (i < length) {
            final PayloadType payloadType = videoCodecs[i];
            CheckBoxPreference checkBoxPreference = new CheckBoxPreference(getActivity());
            checkBoxPreference.setTitle(payloadType.getMime());
            if (!payloadType.getMime().equals("VP8")) {
                if (!getResources().getBoolean(C5321R.bool.disable_all_patented_codecs_for_markets)) {
                    if (!Version.hasFastCpuWithAsmOptim() && payloadType.getMime().equals("H264")) {
                        Object[] objArr = new Object[1];
                        objArr[c] = "CPU does not have asm optimisations available, disabling H264";
                        Log.m6907w(objArr);
                    }
                }
                i++;
                c = 0;
            }
            if (!lcIfManagerNotDestroyedOrNull.downloadOpenH264Enabled() || !payloadType.getMime().equals("H264")) {
                z = z2;
            } else {
                checkBoxPreference.setTitle("OpenH264");
                z = true;
            }
            checkBoxPreference.setChecked(lcIfManagerNotDestroyedOrNull.isPayloadTypeEnabled(payloadType));
            final LinphoneCore linphoneCore = lcIfManagerNotDestroyedOrNull;
            final OpenH264DownloadHelper openH264DownloadHelper2 = openH264DownloadHelper;
            C533417 r12 = r0;
            final CheckBoxPreference checkBoxPreference2 = checkBoxPreference;
            C533417 r0 = new Preference.OnPreferenceChangeListener() {
                public boolean onPreferenceChange(Preference preference, Object obj) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    try {
                        if (linphoneCore.downloadOpenH264Enabled() && booleanValue && Version.getCpuAbis().contains("armeabi-v7a") && !Version.getCpuAbis().contains("x86") && payloadType.getMime().equals("H264")) {
                            SettingsFragment.this.initOpenH264AlertDialog(openH264DownloadHelper2, checkBoxPreference2);
                        }
                        LinphoneManager.getLcIfManagerNotDestroyedOrNull().enablePayloadType(payloadType, booleanValue);
                    } catch (LinphoneCoreException e) {
                        Log.m6903e(e);
                    }
                    return true;
                }
            };
            checkBoxPreference.setOnPreferenceChangeListener(r12);
            preferenceCategory.addPreference(checkBoxPreference);
            z2 = z;
            i++;
            c = 0;
        }
        if (lcIfManagerNotDestroyedOrNull.downloadOpenH264Enabled() && !z2) {
            final CheckBoxPreference checkBoxPreference3 = new CheckBoxPreference(getActivity());
            checkBoxPreference3.setTitle("OpenH264");
            checkBoxPreference3.setSummary(openH264DownloadHelper.getLicenseMessage());
            checkBoxPreference3.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
                public boolean onPreferenceChange(Preference preference, Object obj) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    if (!lcIfManagerNotDestroyedOrNull.downloadOpenH264Enabled() || !booleanValue || !Version.getCpuAbis().contains("armeabi-v7a") || Version.getCpuAbis().contains("x86") || openH264DownloadHelper.isCodecFound()) {
                        return true;
                    }
                    SettingsFragment.this.initOpenH264AlertDialog(openH264DownloadHelper, checkBoxPreference3);
                    return true;
                }
            });
            preferenceCategory.addPreference(checkBoxPreference3);
        }
        ((CheckBoxPreference) findPreference(getString(C5321R.string.pref_video_enable_key))).setChecked(this.mPrefs.isVideoEnabled());
        ((CheckBoxPreference) findPreference(getString(C5321R.string.pref_video_use_front_camera_key))).setChecked(this.mPrefs.useFrontCam());
        ((CheckBoxPreference) findPreference(getString(C5321R.string.pref_video_initiate_call_with_video_key))).setChecked(true);
        ((CheckBoxPreference) findPreference(getString(C5321R.string.pref_video_automatically_accept_video_key))).setChecked(true);
        ((CheckBoxPreference) findPreference(getString(C5321R.string.pref_overlay_key))).setChecked(this.mPrefs.isOverlayEnabled());
    }

    /* access modifiers changed from: private */
    public void updateVideoPreferencesAccordingToPreset() {
        if (this.mPrefs.getVideoPreset().equals("custom")) {
            findPreference(getString(C5321R.string.pref_preferred_video_fps_key)).setEnabled(true);
            findPreference(getString(C5321R.string.pref_bandwidth_limit_key)).setEnabled(true);
        } else {
            findPreference(getString(C5321R.string.pref_preferred_video_fps_key)).setEnabled(false);
            findPreference(getString(C5321R.string.pref_bandwidth_limit_key)).setEnabled(false);
        }
        findPreference(getString(C5321R.string.pref_video_preset_key)).setSummary(this.mPrefs.getVideoPreset());
        String num = Integer.toString(this.mPrefs.getPreferredVideoFps());
        if (num.equals("0")) {
            num = getString(C5321R.string.pref_none);
        }
        findPreference(getString(C5321R.string.pref_preferred_video_fps_key)).setSummary(num);
        findPreference(getString(C5321R.string.pref_bandwidth_limit_key)).setSummary(Integer.toString(this.mPrefs.getBandwidthLimit()));
    }

    private void setVideoPreferencesListener() {
        findPreference(getString(C5321R.string.pref_video_enable_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.enableVideo(((Boolean) obj).booleanValue());
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_video_use_front_camera_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.setFrontCamAsDefault(((Boolean) obj).booleanValue());
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_video_initiate_call_with_video_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.setInitiateVideoCall(((Boolean) obj).booleanValue());
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_video_automatically_accept_video_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.setAutomaticallyAcceptVideoRequests(((Boolean) obj).booleanValue());
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_video_preset_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.setVideoPreset(obj.toString());
                preference.setSummary(SettingsFragment.this.mPrefs.getVideoPreset());
                SettingsFragment.this.updateVideoPreferencesAccordingToPreset();
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_preferred_video_size_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.setPreferredVideoSize(obj.toString());
                preference.setSummary(SettingsFragment.this.mPrefs.getPreferredVideoSize());
                SettingsFragment.this.updateVideoPreferencesAccordingToPreset();
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_preferred_video_fps_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.setPreferredVideoFps(Integer.parseInt(obj.toString()));
                SettingsFragment.this.updateVideoPreferencesAccordingToPreset();
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_bandwidth_limit_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.setBandwidthLimit(Integer.parseInt(obj.toString()));
                preference.setSummary(obj.toString());
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_overlay_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    SettingsFragment.this.mPrefs.enableOverlay(false);
                } else if (LinphoneActivity.instance().checkAndRequestOverlayPermission()) {
                    SettingsFragment.this.mPrefs.enableOverlay(true);
                }
                return true;
            }
        });
    }

    private void initCallSettings() {
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference(getString(C5321R.string.pref_dialer_call_key));
        EditTextPreference editTextPreference = (EditTextPreference) findPreference(getString(C5321R.string.pref_incoming_call_timeout_key));
        EditTextPreference editTextPreference2 = (EditTextPreference) findPreference(getString(C5321R.string.pref_auto_answer_time_key));
        ((CheckBoxPreference) findPreference(getString(C5321R.string.pref_rfc2833_dtmf_key))).setChecked(this.mPrefs.useRfc2833Dtmfs());
        ((CheckBoxPreference) findPreference(getString(C5321R.string.pref_sipinfo_dtmf_key))).setChecked(this.mPrefs.useSipInfoDtmfs());
        ((CheckBoxPreference) findPreference(getString(C5321R.string.pref_device_ringtone_key))).setChecked(this.mPrefs.isDeviceRingtoneEnabled());
        ((CheckBoxPreference) findPreference(getString(C5321R.string.pref_auto_answer_key))).setChecked(this.mPrefs.isAutoAnswerEnabled());
        editTextPreference.setText(String.valueOf(this.mPrefs.getIncTimeout()));
        editTextPreference.setSummary(String.valueOf(this.mPrefs.getIncTimeout()));
        editTextPreference2.setText(String.valueOf(this.mPrefs.getAutoAnswerTime()));
        editTextPreference2.setSummary(String.valueOf(this.mPrefs.getAutoAnswerTime()));
        if (this.mPrefs.isAutoAnswerEnabled()) {
            editTextPreference2.setEnabled(true);
        } else {
            editTextPreference2.setEnabled(false);
        }
        setPreferenceDefaultValueAndSummary(C5321R.string.pref_voice_mail_key, this.mPrefs.getVoiceMailUri());
        checkBoxPreference.setChecked(this.mPrefs.getNativeDialerCall());
    }

    public void enableDeviceRingtone(boolean z) {
        LinphonePreferences.instance().enableDeviceRingtone(z);
        LinphoneManager.getInstance().enableDeviceRingtone(z);
        ((CheckBoxPreference) findPreference(getString(C5321R.string.pref_device_ringtone_key))).setChecked(z);
    }

    private void setCallPreferencesListener() {
        findPreference(getString(C5321R.string.pref_device_ringtone_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    SettingsFragment.this.mPrefs.enableDeviceRingtone(false);
                    LinphoneManager.getInstance().enableDeviceRingtone(false);
                } else if (SettingsFragment.this.getActivity().getPackageManager().checkPermission("android.permission.READ_EXTERNAL_STORAGE", SettingsFragment.this.getActivity().getPackageName()) == 0) {
                    SettingsFragment.this.mPrefs.enableDeviceRingtone(true);
                    LinphoneManager.getInstance().enableDeviceRingtone(true);
                } else {
                    LinphoneActivity.instance().checkAndRequestReadExternalStoragePermissionForDeviceRingtone();
                }
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_media_encryption_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                String obj2 = obj.toString();
                LinphoneCore.MediaEncryption mediaEncryption = LinphoneCore.MediaEncryption.None;
                if (obj2.equals(SettingsFragment.this.getString(C5321R.string.pref_media_encryption_key_srtp))) {
                    mediaEncryption = LinphoneCore.MediaEncryption.SRTP;
                } else if (obj2.equals(SettingsFragment.this.getString(C5321R.string.pref_media_encryption_key_zrtp))) {
                    mediaEncryption = LinphoneCore.MediaEncryption.ZRTP;
                } else if (obj2.equals(SettingsFragment.this.getString(C5321R.string.pref_media_encryption_key_dtls))) {
                    mediaEncryption = LinphoneCore.MediaEncryption.DTLS;
                }
                SettingsFragment.this.mPrefs.setMediaEncryption(mediaEncryption);
                preference.setSummary(SettingsFragment.this.mPrefs.getMediaEncryption().toString());
                return true;
            }
        });
        initMediaEncryptionPreference((ListPreference) findPreference(getString(C5321R.string.pref_media_encryption_key)));
        findPreference(getString(C5321R.string.pref_auto_answer_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SettingsFragment.this.mPrefs.enableAutoAnswer(booleanValue);
                if (booleanValue) {
                    SettingsFragment settingsFragment = SettingsFragment.this;
                    settingsFragment.findPreference(settingsFragment.getString(C5321R.string.pref_auto_answer_time_key)).setEnabled(true);
                } else {
                    SettingsFragment settingsFragment2 = SettingsFragment.this;
                    settingsFragment2.findPreference(settingsFragment2.getString(C5321R.string.pref_auto_answer_time_key)).setEnabled(false);
                }
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_rfc2833_dtmf_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.sendDtmfsAsRfc2833(((Boolean) obj).booleanValue());
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_voice_mail_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment settingsFragment = SettingsFragment.this;
                EditTextPreference editTextPreference = (EditTextPreference) settingsFragment.findPreference(settingsFragment.getString(C5321R.string.pref_voice_mail_key));
                editTextPreference.setSummary(obj.toString());
                editTextPreference.setText(obj.toString());
                SettingsFragment.this.mPrefs.setVoiceMailUri(obj.toString());
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_sipinfo_dtmf_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.sendDTMFsAsSipInfo(((Boolean) obj).booleanValue());
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_dialer_call_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.setNativeDialerCall(((Boolean) obj).booleanValue());
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_incoming_call_timeout_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                preference.setSummary((String) obj);
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_auto_answer_time_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                String str = (String) obj;
                SettingsFragment.this.mPrefs.setAutoAnswerTime(Integer.valueOf(str).intValue());
                preference.setSummary(str);
                return true;
            }
        });
    }

    /* access modifiers changed from: private */
    public void setEncryptionZrtp() {
        LinphoneUtils.displayErrorAlert(getString(C5321R.string.lime_encryption_enable_zrtp), LinphoneActivity.instance());
        this.mPrefs.setMediaEncryption(LinphoneCore.MediaEncryption.ZRTP);
        findPreference(getString(C5321R.string.pref_media_encryption_key)).setSummary(this.mPrefs.getMediaEncryption().toString());
    }

    private void initChatSettings() {
        setPreferenceDefaultValueAndSummary(C5321R.string.pref_image_sharing_server_key, this.mPrefs.getSharingPictureServerUrl());
        initLimeEncryptionPreference((ListPreference) findPreference(getString(C5321R.string.pref_use_lime_encryption_key)));
    }

    private void setChatPreferencesListener() {
        findPreference(getString(C5321R.string.pref_image_sharing_server_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                String str = (String) obj;
                SettingsFragment.this.mPrefs.setSharingPictureServerUrl(str);
                preference.setSummary(str);
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_use_lime_encryption_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                String obj2 = obj.toString();
                LinphoneCore.LinphoneLimeState linphoneLimeState = LinphoneCore.LinphoneLimeState.Disabled;
                if (obj2.equals(LinphoneCore.LinphoneLimeState.Mandatory.toString())) {
                    linphoneLimeState = LinphoneCore.LinphoneLimeState.Mandatory;
                } else if (obj2.equals(LinphoneCore.LinphoneLimeState.Preferred.toString())) {
                    linphoneLimeState = LinphoneCore.LinphoneLimeState.Preferred;
                }
                SettingsFragment.this.mPrefs.setLimeEncryption(linphoneLimeState);
                LinphoneCore.LinphoneLimeState limeEncryption = SettingsFragment.this.mPrefs.getLimeEncryption();
                if (limeEncryption == LinphoneCore.LinphoneLimeState.Disabled) {
                    preference.setSummary(SettingsFragment.this.getString(C5321R.string.lime_encryption_entry_disabled));
                    return true;
                } else if (limeEncryption == LinphoneCore.LinphoneLimeState.Mandatory) {
                    SettingsFragment.this.setEncryptionZrtp();
                    preference.setSummary(SettingsFragment.this.getString(C5321R.string.lime_encryption_entry_mandatory));
                    return true;
                } else if (limeEncryption != LinphoneCore.LinphoneLimeState.Preferred) {
                    return true;
                } else {
                    SettingsFragment.this.setEncryptionZrtp();
                    preference.setSummary(SettingsFragment.this.getString(C5321R.string.lime_encryption_entry_preferred));
                    return true;
                }
            }
        });
    }

    private void initNetworkSettings() {
        ((CheckBoxPreference) findPreference(getString(C5321R.string.pref_wifi_only_key))).setChecked(this.mPrefs.isWifiOnlyEnabled());
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference(getString(C5321R.string.pref_turn_enable_key));
        ((CheckBoxPreference) findPreference(getString(C5321R.string.pref_ice_enable_key))).setChecked(this.mPrefs.isIceEnabled());
        checkBoxPreference.setEnabled(this.mPrefs.getStunServer() != null);
        checkBoxPreference.setChecked(this.mPrefs.isTurnEnabled());
        EditTextPreference editTextPreference = (EditTextPreference) findPreference(getString(C5321R.string.pref_turn_username_key));
        editTextPreference.setEnabled(this.mPrefs.isTurnEnabled());
        editTextPreference.setSummary(this.mPrefs.getTurnUsername());
        editTextPreference.setText(this.mPrefs.getTurnUsername());
        ((EditTextPreference) findPreference(getString(C5321R.string.pref_turn_passwd_key))).setEnabled(this.mPrefs.isTurnEnabled());
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) findPreference(getString(C5321R.string.pref_transport_use_random_ports_key));
        checkBoxPreference2.setChecked(this.mPrefs.isUsingRandomPort());
        EditTextPreference editTextPreference2 = (EditTextPreference) findPreference(getString(C5321R.string.pref_sip_port_key));
        editTextPreference2.setEnabled(!checkBoxPreference2.isChecked());
        editTextPreference2.setSummary(this.mPrefs.getSipPort());
        editTextPreference2.setText(this.mPrefs.getSipPort());
        EditTextPreference editTextPreference3 = (EditTextPreference) findPreference(getString(C5321R.string.pref_stun_server_key));
        editTextPreference3.setSummary(this.mPrefs.getStunServer());
        editTextPreference3.setText(this.mPrefs.getStunServer());
        ((CheckBoxPreference) findPreference(getString(C5321R.string.pref_push_notification_key))).setChecked(false);
        ((CheckBoxPreference) findPreference(getString(C5321R.string.pref_ipv6_key))).setChecked(this.mPrefs.isUsingIpv6());
    }

    private void setNetworkPreferencesListener() {
        findPreference(getString(C5321R.string.pref_wifi_only_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.setWifiOnlyEnabled((Boolean) obj);
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_stun_server_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.setStunServer(obj.toString());
                preference.setSummary(obj.toString());
                SettingsFragment settingsFragment = SettingsFragment.this;
                ((CheckBoxPreference) settingsFragment.findPreference(settingsFragment.getString(C5321R.string.pref_turn_enable_key))).setEnabled(SettingsFragment.this.mPrefs.getStunServer() != null);
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_ice_enable_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.setIceEnabled(((Boolean) obj).booleanValue());
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_turn_enable_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.setTurnEnabled(((Boolean) obj).booleanValue());
                SettingsFragment settingsFragment = SettingsFragment.this;
                SettingsFragment settingsFragment2 = SettingsFragment.this;
                ((EditTextPreference) settingsFragment.findPreference(settingsFragment.getString(C5321R.string.pref_turn_username_key))).setEnabled(SettingsFragment.this.mPrefs.isTurnEnabled());
                ((EditTextPreference) settingsFragment2.findPreference(settingsFragment2.getString(C5321R.string.pref_turn_passwd_key))).setEnabled(SettingsFragment.this.mPrefs.isTurnEnabled());
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_turn_username_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.setTurnUsername((String) obj);
                preference.setSummary(SettingsFragment.this.mPrefs.getTurnUsername());
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_turn_passwd_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.setTurnPassword((String) obj);
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_upnp_enable_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.setUpnpEnabled(((Boolean) obj).booleanValue());
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_transport_use_random_ports_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                SettingsFragment.this.mPrefs.useRandomPort(bool.booleanValue());
                SettingsFragment settingsFragment = SettingsFragment.this;
                settingsFragment.findPreference(settingsFragment.getString(C5321R.string.pref_sip_port_key)).setEnabled(!booleanValue);
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_sip_port_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                int i;
                try {
                    i = Integer.parseInt(obj.toString());
                } catch (NumberFormatException unused) {
                    i = -1;
                }
                SettingsFragment.this.mPrefs.setSipPort(i);
                preference.setSummary(obj.toString());
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_push_notification_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_ipv6_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.useIpv6((Boolean) obj);
                return true;
            }
        });
    }

    private void initAdvancedSettings() {
        ((CheckBoxPreference) findPreference(getString(C5321R.string.pref_friendlist_subscribe_key))).setChecked(this.mPrefs.isFriendlistsubscriptionEnabled());
        ((CheckBoxPreference) findPreference(getString(C5321R.string.pref_debug_key))).setChecked(this.mPrefs.isDebugEnabled());
        ((CheckBoxPreference) findPreference(getString(C5321R.string.pref_background_mode_key))).setChecked(this.mPrefs.isBackgroundModeEnabled());
        ((CheckBoxPreference) findPreference(getString(C5321R.string.pref_service_notification_key))).setChecked(this.mPrefs.getServiceNotificationVisibility());
        ((CheckBoxPreference) findPreference(getString(C5321R.string.pref_autostart_key))).setChecked(this.mPrefs.isAutoStartEnabled());
        setPreferenceDefaultValueAndSummary(C5321R.string.pref_remote_provisioning_key, this.mPrefs.getRemoteProvisioningUrl());
        setPreferenceDefaultValueAndSummary(C5321R.string.pref_display_name_key, this.mPrefs.getDefaultDisplayName());
        setPreferenceDefaultValueAndSummary(C5321R.string.pref_user_name_key, this.mPrefs.getDefaultUsername());
    }

    private void setAdvancedPreferencesListener() {
        findPreference(getString(C5321R.string.pref_friendlist_subscribe_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SettingsFragment.this.mPrefs.enabledFriendlistSubscription(booleanValue);
                LinphoneManager.getInstance().subscribeFriendList(booleanValue);
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_debug_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.setDebugEnabled(((Boolean) obj).booleanValue());
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_background_mode_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.setBackgroundModeEnabled(((Boolean) obj).booleanValue());
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_service_notification_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.setServiceNotificationVisibility(((Boolean) obj).booleanValue());
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_autostart_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsFragment.this.mPrefs.setAutoStart(((Boolean) obj).booleanValue());
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_remote_provisioning_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                String str = (String) obj;
                SettingsFragment.this.mPrefs.setRemoteProvisioningUrl(str);
                preference.setSummary(str);
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_android_app_settings_key)).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            public boolean onPreferenceClick(Preference preference) {
                synchronized (SettingsFragment.this) {
                    Activity activity = SettingsFragment.this.getActivity();
                    Intent intent = new Intent();
                    intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.setData(Uri.parse("package:" + activity.getPackageName()));
                    intent.addFlags(268435456);
                    intent.addFlags(BasicMeasure.EXACTLY);
                    intent.addFlags(8388608);
                    activity.startActivity(intent);
                }
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_display_name_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                String str = (String) obj;
                SettingsFragment.this.mPrefs.setDefaultDisplayName(str);
                preference.setSummary(str);
                return true;
            }
        });
        findPreference(getString(C5321R.string.pref_user_name_key)).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                String str = (String) obj;
                if (str.equals("")) {
                    return false;
                }
                SettingsFragment.this.mPrefs.setDefaultUsername(str);
                preference.setSummary(str);
                return true;
            }
        });
    }

    public void onResume() {
        super.onResume();
        initAccounts();
        if (LinphoneActivity.isInstanciated()) {
            LinphoneActivity.instance().selectMenu(FragmentsAvailable.SETTINGS);
        }
    }

    public void onPause() {
        if (LinphoneActivity.isInstanciated() && LinphoneManager.isInstanciated()) {
            if (LinphoneManager.getInstance().getEchoTesterStatus()) {
                stopEchoTester();
            }
            LinphoneActivity.instance().hideTopBar();
        }
        super.onPause();
    }
}
