package org.linphone.assistant;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.linphone.C5321R;
import org.linphone.ContactsManager;
import org.linphone.LinphoneActivity;
import org.linphone.LinphoneLauncherActivity;
import org.linphone.LinphoneManager;
import org.linphone.LinphonePreferences;
import org.linphone.LinphoneService;
import org.linphone.LinphoneUtils;
import org.linphone.StatusFragment;
import org.linphone.core.DialPlan;
import org.linphone.core.LinphoneAccountCreator;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneAuthInfo;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.LinphoneCoreFactory;
import org.linphone.core.LinphoneCoreListenerBase;
import org.linphone.core.LinphoneProxyConfig;
import org.linphone.mediastream.Log;
import org.linphone.mediastream.Version;
import org.linphone.tools.OpenH264DownloadHelper;

public class AssistantActivity extends Activity implements View.OnClickListener, ActivityCompat.OnRequestPermissionsResultCallback, LinphoneAccountCreator.LinphoneAccountCreatorListener {
    private static final int PERMISSIONS_REQUEST_RECORD_AUDIO = 201;
    private static AssistantActivity instance;
    /* access modifiers changed from: private */
    public boolean accountCreated = false;
    private LinphoneAccountCreator accountCreator;
    /* access modifiers changed from: private */
    public LinphoneAddress address;
    private ImageView back;
    private ImageView cancel;
    public DialPlan country;
    private CountryListAdapter countryListAdapter;
    private AssistantFragmentsEnum currentFragment;
    /* access modifiers changed from: private */
    public Dialog dialog;
    private boolean echoCancellerAlreadyDone;
    public String email;
    private AssistantFragmentsEnum firstFragment;
    private Fragment fragment;
    private boolean fromPref = false;
    private boolean isLink = false;
    private AssistantFragmentsEnum lastFragment;
    private LinphoneCoreListenerBase mListener;
    private LinphonePreferences mPrefs;
    /* access modifiers changed from: private */
    public boolean newAccount = false;
    public String phone_number;
    /* access modifiers changed from: private */
    public ProgressDialog progress;
    /* access modifiers changed from: private */
    public boolean remoteProvisioningInProgress;
    private StatusFragment status;

    public void isEchoCalibrationFinished() {
    }

    public void onAccountCreatorAccountActivated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorAccountCreated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorAccountLinkedWithPhoneNumber(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorIsAccountActivated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorIsAccountLinked(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorIsPhoneNumberUsed(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorPasswordUpdated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorPhoneAccountRecovered(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorPhoneNumberLinkActivated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getResources().getBoolean(C5321R.bool.orientation_portrait_only)) {
            setRequestedOrientation(1);
        }
        setContentView(C5321R.layout.assistant);
        initUI();
        if (getIntent().getBooleanExtra("LinkPhoneNumber", false)) {
            this.isLink = true;
            if (getIntent().getBooleanExtra("FromPref", false)) {
                this.fromPref = true;
            }
            displayCreateAccount();
        } else {
            this.firstFragment = getResources().getBoolean(C5321R.bool.assistant_use_linphone_login_as_first_fragment) ? AssistantFragmentsEnum.LINPHONE_LOGIN : AssistantFragmentsEnum.WELCOME;
            if (findViewById(C5321R.C5324id.fragment_container) != null) {
                if (bundle == null) {
                    display(this.firstFragment);
                } else {
                    this.currentFragment = (AssistantFragmentsEnum) bundle.getSerializable("CurrentFragment");
                }
            }
        }
        if (bundle == null || !bundle.containsKey("echoCanceller")) {
            this.echoCancellerAlreadyDone = false;
        } else {
            this.echoCancellerAlreadyDone = bundle.getBoolean("echoCanceller");
        }
        this.mPrefs = LinphonePreferences.instance();
        this.status.enableSideMenu(false);
        if (LinphoneManager.getLcIfManagerNotDestroyedOrNull() != null) {
            this.accountCreator = LinphoneCoreFactory.instance().createAccountCreator(LinphoneManager.getLc(), LinphonePreferences.instance().getXmlrpcUrl());
            this.accountCreator.setListener(this);
        }
        this.countryListAdapter = new CountryListAdapter(getApplicationContext());
        this.mListener = new LinphoneCoreListenerBase() {
            public void configuringStatus(LinphoneCore linphoneCore, LinphoneCore.RemoteProvisioningState remoteProvisioningState, String str) {
                if (AssistantActivity.this.progress != null) {
                    AssistantActivity.this.progress.dismiss();
                }
                if (remoteProvisioningState == LinphoneCore.RemoteProvisioningState.ConfiguringSuccessful) {
                    AssistantActivity.this.goToLinphoneActivity();
                } else if (remoteProvisioningState == LinphoneCore.RemoteProvisioningState.ConfiguringFailed) {
                    Toast.makeText(AssistantActivity.instance(), AssistantActivity.this.getString(C5321R.string.remote_provisioning_failure), 1).show();
                }
            }

            public void registrationState(LinphoneCore linphoneCore, LinphoneProxyConfig linphoneProxyConfig, LinphoneCore.RegistrationState registrationState, String str) {
                if (AssistantActivity.this.remoteProvisioningInProgress) {
                    if (AssistantActivity.this.progress != null) {
                        AssistantActivity.this.progress.dismiss();
                    }
                    if (registrationState == LinphoneCore.RegistrationState.RegistrationOk) {
                        boolean unused = AssistantActivity.this.remoteProvisioningInProgress = false;
                        AssistantActivity.this.success();
                    }
                } else if (AssistantActivity.this.accountCreated && !AssistantActivity.this.newAccount && AssistantActivity.this.address != null && AssistantActivity.this.address.asString().equals(linphoneProxyConfig.getAddress().asString())) {
                    if (registrationState == LinphoneCore.RegistrationState.RegistrationOk) {
                        if (AssistantActivity.this.progress != null) {
                            AssistantActivity.this.progress.dismiss();
                        }
                        if (!AssistantActivity.this.getResources().getBoolean(C5321R.bool.use_phone_number_validation) || !linphoneProxyConfig.getDomain().equals(AssistantActivity.this.getString(C5321R.string.default_domain)) || LinphoneManager.getLc().getDefaultProxyConfig() == null) {
                            AssistantActivity.this.success();
                        } else {
                            AssistantActivity.this.loadAccountCreator(linphoneProxyConfig).isAccountUsed();
                        }
                    } else if (registrationState == LinphoneCore.RegistrationState.RegistrationFailed) {
                        if (AssistantActivity.this.progress != null) {
                            AssistantActivity.this.progress.dismiss();
                        }
                        if (AssistantActivity.this.dialog == null || !AssistantActivity.this.dialog.isShowing()) {
                            AssistantActivity assistantActivity = AssistantActivity.this;
                            Dialog unused2 = assistantActivity.dialog = assistantActivity.createErrorDialog(linphoneProxyConfig, str);
                            AssistantActivity.this.dialog.setCancelable(false);
                            AssistantActivity.this.dialog.show();
                        }
                    } else if (registrationState != LinphoneCore.RegistrationState.RegistrationProgress && AssistantActivity.this.progress != null) {
                        AssistantActivity.this.progress.dismiss();
                    }
                }
            }
        };
        instance = this;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.addListener(this.mListener);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.removeListener(this.mListener);
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putSerializable("CurrentFragment", this.currentFragment);
        bundle.putBoolean("echoCanceller", this.echoCancellerAlreadyDone);
        super.onSaveInstanceState(bundle);
    }

    public static AssistantActivity instance() {
        return instance;
    }

    public void updateStatusFragment(StatusFragment statusFragment) {
        this.status = statusFragment;
    }

    /* access modifiers changed from: private */
    public LinphoneAccountCreator loadAccountCreator(LinphoneProxyConfig linphoneProxyConfig) {
        LinphoneAccountCreator createAccountCreator = LinphoneCoreFactory.instance().createAccountCreator(LinphoneManager.getLc(), LinphonePreferences.instance().getXmlrpcUrl());
        LinphoneProxyConfig[] proxyConfigList = LinphoneManager.getLc().getProxyConfigList();
        createAccountCreator.setListener(this);
        int i = 0;
        while (true) {
            if (i >= proxyConfigList.length) {
                i = -1;
                break;
            } else if (proxyConfigList[i].equals(linphoneProxyConfig)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            createAccountCreator.setDomain(this.mPrefs.getAccountDomain(i));
            createAccountCreator.setUsername(this.mPrefs.getAccountUsername(i));
        }
        return createAccountCreator;
    }

    private void initUI() {
        this.back = (ImageView) findViewById(C5321R.C5324id.back);
        this.back.setOnClickListener(this);
        this.cancel = (ImageView) findViewById(C5321R.C5324id.assistant_cancel);
        this.cancel.setOnClickListener(this);
    }

    private void changeFragment(Fragment fragment2) {
        hideKeyboard();
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(C5321R.C5324id.fragment_container, fragment2);
        beginTransaction.commitAllowingStateLoss();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C5321R.C5324id.assistant_cancel) {
            hideKeyboard();
            LinphonePreferences.instance().firstLaunchSuccessful();
            if (getResources().getBoolean(C5321R.bool.assistant_cancel_move_to_back)) {
                moveTaskToBack(true);
                return;
            }
            LinphonePreferences.instance().firstLaunchSuccessful();
            startActivity(new Intent().setClass(this, LinphoneActivity.class));
            finish();
        } else if (id == C5321R.C5324id.back) {
            hideKeyboard();
            onBackPressed();
        }
    }

    public void onBackPressed() {
        if (!this.isLink) {
            AssistantFragmentsEnum assistantFragmentsEnum = this.currentFragment;
            if (assistantFragmentsEnum == this.firstFragment) {
                LinphonePreferences.instance().firstLaunchSuccessful();
                if (getResources().getBoolean(C5321R.bool.assistant_cancel_move_to_back)) {
                    moveTaskToBack(true);
                    return;
                }
                LinphonePreferences.instance().firstLaunchSuccessful();
                startActivity(new Intent().setClass(this, LinphoneActivity.class));
                finish();
            } else if (assistantFragmentsEnum == AssistantFragmentsEnum.LOGIN || this.currentFragment == AssistantFragmentsEnum.LINPHONE_LOGIN || this.currentFragment == AssistantFragmentsEnum.CREATE_ACCOUNT || this.currentFragment == AssistantFragmentsEnum.REMOTE_PROVISIONING) {
                displayMenu();
            } else if (this.currentFragment == AssistantFragmentsEnum.WELCOME) {
                finish();
            } else if (this.currentFragment != AssistantFragmentsEnum.COUNTRY_CHOOSER) {
            } else {
                if (this.lastFragment.equals(AssistantFragmentsEnum.LINPHONE_LOGIN)) {
                    displayLoginLinphone((String) null, (String) null);
                } else {
                    displayCreateAccount();
                }
            }
        }
    }

    public void hideKeyboard() {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        View currentFocus = getCurrentFocus();
        if (inputMethodManager != null && currentFocus != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public void checkAndRequestAudioPermission() {
        checkAndRequestPermission("android.permission.RECORD_AUDIO", 0);
    }

    public void checkAndRequestPermission(String str, int i) {
        int checkPermission = getPackageManager().checkPermission(str, getPackageName());
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("[Permission] ");
        sb.append(str);
        sb.append(" is ");
        sb.append(checkPermission == 0 ? "granted" : "denied");
        objArr[0] = sb.toString();
        Log.m6905i(objArr);
        if (checkPermission == 0) {
            return;
        }
        if (LinphonePreferences.instance().firstTimeAskingForPermission(str) || ActivityCompat.shouldShowRequestPermissionRationale(this, str)) {
            Log.m6905i("[Permission] Asking for " + str);
            ActivityCompat.requestPermissions(this, new String[]{str}, i);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("[Permission] ");
            sb.append(strArr[i2]);
            sb.append(" is ");
            sb.append(iArr[i2] == 0 ? "granted" : "denied");
            objArr[0] = sb.toString();
            Log.m6905i(objArr);
        }
        if (i != 201) {
            return;
        }
        if (iArr[0] == 0) {
            launchEchoCancellerCalibration(true);
        } else {
            isEchoCalibrationFinished();
        }
    }

    private void launchEchoCancellerCalibration(boolean z) {
        int checkPermission = getPackageManager().checkPermission("android.permission.RECORD_AUDIO", getPackageName());
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("[Permission] Record audio permission is ");
        sb.append(checkPermission == 0 ? "granted" : "denied");
        objArr[0] = sb.toString();
        Log.m6905i(objArr);
        if (checkPermission == 0) {
            EchoCancellerCalibrationFragment echoCancellerCalibrationFragment = new EchoCancellerCalibrationFragment();
            echoCancellerCalibrationFragment.enableEcCalibrationResultSending(z);
            changeFragment(echoCancellerCalibrationFragment);
            this.currentFragment = AssistantFragmentsEnum.ECHO_CANCELLER_CALIBRATION;
            this.back.setVisibility(0);
            this.cancel.setEnabled(false);
            return;
        }
        checkAndRequestAudioPermission();
    }

    public void configureLinphoneProxyConfig(LinphoneAccountCreator linphoneAccountCreator) {
        LinphoneCore lc = LinphoneManager.getLc();
        LinphoneProxyConfig createProxyConfig = lc.createProxyConfig();
        try {
            String identity = createProxyConfig.getIdentity();
            if (identity != null) {
                if (linphoneAccountCreator.getUsername() != null) {
                    LinphoneAddress createLinphoneAddress = LinphoneCoreFactory.instance().createLinphoneAddress(identity.replace("?", linphoneAccountCreator.getUsername()));
                    createLinphoneAddress.setDisplayName(linphoneAccountCreator.getUsername());
                    this.address = createLinphoneAddress;
                    createProxyConfig.edit();
                    createProxyConfig.setIdentity(createLinphoneAddress.asString());
                    if (linphoneAccountCreator.getPhoneNumber() != null && linphoneAccountCreator.getPhoneNumber().length() > 0) {
                        createProxyConfig.setDialPrefix(linphoneAccountCreator.getPrefix(linphoneAccountCreator.getPhoneNumber()));
                    }
                    createProxyConfig.done();
                    LinphoneAuthInfo createAuthInfo = LinphoneCoreFactory.instance().createAuthInfo(linphoneAccountCreator.getUsername(), (String) null, linphoneAccountCreator.getPassword(), linphoneAccountCreator.getHa1(), createProxyConfig.getRealm(), createProxyConfig.getDomain());
                    lc.addProxyConfig(createProxyConfig);
                    lc.addAuthInfo(createAuthInfo);
                    lc.setDefaultProxyConfig(createProxyConfig);
                    if (!(LinphonePreferences.instance() == null || ContactsManager.getInstance() == null)) {
                        ContactsManager.getInstance().fetchContactsAsync();
                    }
                    if (LinphonePreferences.instance() != null) {
                        this.mPrefs.enabledFriendlistSubscription(getResources().getBoolean(C5321R.bool.use_friendlist_subscription));
                    }
                    LinphoneManager.getInstance().subscribeFriendList(getResources().getBoolean(C5321R.bool.use_friendlist_subscription));
                    if (!this.newAccount) {
                        displayRegistrationInProgressDialog();
                    }
                    this.accountCreated = true;
                    return;
                }
            }
            LinphoneUtils.displayErrorAlert(getString(C5321R.string.error), this);
        } catch (LinphoneCoreException e) {
            Log.m6903e("Can't configure proxy config ", e);
        }
    }

    public void linphoneLogIn(LinphoneAccountCreator linphoneAccountCreator) {
        LinphoneManager.getLc().getConfig().loadXmlFile(LinphoneManager.getInstance().getmDynamicConfigFile());
        configureLinphoneProxyConfig(linphoneAccountCreator);
    }

    public void genericLogIn(String str, String str2, String str3, String str4, String str5, String str6, LinphoneAddress.TransportType transportType) {
        saveCreatedAccount(str, str2, str3, str4, (String) null, str5, str6, transportType);
    }

    /* renamed from: org.linphone.assistant.AssistantActivity$4 */
    static /* synthetic */ class C53934 {
        static final /* synthetic */ int[] $SwitchMap$org$linphone$assistant$AssistantFragmentsEnum = new int[AssistantFragmentsEnum.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                org.linphone.assistant.AssistantFragmentsEnum[] r0 = org.linphone.assistant.AssistantFragmentsEnum.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$linphone$assistant$AssistantFragmentsEnum = r0
                int[] r0 = $SwitchMap$org$linphone$assistant$AssistantFragmentsEnum     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.linphone.assistant.AssistantFragmentsEnum r1 = org.linphone.assistant.AssistantFragmentsEnum.WELCOME     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$org$linphone$assistant$AssistantFragmentsEnum     // Catch:{ NoSuchFieldError -> 0x001f }
                org.linphone.assistant.AssistantFragmentsEnum r1 = org.linphone.assistant.AssistantFragmentsEnum.LINPHONE_LOGIN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.linphone.assistant.AssistantActivity.C53934.<clinit>():void");
        }
    }

    private void display(AssistantFragmentsEnum assistantFragmentsEnum) {
        int i = C53934.$SwitchMap$org$linphone$assistant$AssistantFragmentsEnum[assistantFragmentsEnum.ordinal()];
        if (i == 1) {
            displayMenu();
        } else if (i == 2) {
            displayLoginLinphone((String) null, (String) null);
        } else {
            throw new IllegalStateException("Can't handle " + assistantFragmentsEnum);
        }
    }

    public void displayMenu() {
        this.fragment = new WelcomeFragment();
        changeFragment(this.fragment);
        this.country = null;
        this.currentFragment = AssistantFragmentsEnum.WELCOME;
        this.back.setVisibility(4);
    }

    public void displayLoginGeneric() {
        this.fragment = new LoginFragment();
        changeFragment(this.fragment);
        this.currentFragment = AssistantFragmentsEnum.LOGIN;
        this.back.setVisibility(0);
    }

    public void displayLoginLinphone(String str, String str2) {
        this.fragment = new LinphoneLoginFragment();
        Bundle bundle = new Bundle();
        bundle.putString("Phone", (String) null);
        bundle.putString("Dialcode", (String) null);
        bundle.putString("Username", str);
        bundle.putString("Password", str2);
        this.fragment.setArguments(bundle);
        changeFragment(this.fragment);
        this.currentFragment = AssistantFragmentsEnum.LINPHONE_LOGIN;
        this.back.setVisibility(0);
    }

    public void displayCreateAccount() {
        this.fragment = new CreateAccountFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("LinkPhoneNumber", this.isLink);
        bundle.putBoolean("LinkFromPref", this.fromPref);
        this.fragment.setArguments(bundle);
        changeFragment(this.fragment);
        this.currentFragment = AssistantFragmentsEnum.CREATE_ACCOUNT;
        this.back.setVisibility(0);
    }

    public void displayRemoteProvisioning() {
        this.fragment = new RemoteProvisioningFragment();
        changeFragment(this.fragment);
        this.currentFragment = AssistantFragmentsEnum.REMOTE_PROVISIONING;
        this.back.setVisibility(0);
    }

    public void displayCountryChooser() {
        this.fragment = new CountryListFragment();
        changeFragment(this.fragment);
        this.lastFragment = this.currentFragment;
        this.currentFragment = AssistantFragmentsEnum.COUNTRY_CHOOSER;
        this.back.setVisibility(0);
    }

    private void launchDownloadCodec() {
        if (LinphoneManager.getLc().downloadOpenH264Enabled()) {
            OpenH264DownloadHelper createOpenH264DownloadHelper = LinphoneCoreFactory.instance().createOpenH264DownloadHelper();
            createOpenH264DownloadHelper.setUrlDownload("http://ciscobinary.openh264.org/libopenh264-1.8.0-android19.so.bz2");
            createOpenH264DownloadHelper.setNameFileDownload("libopenh264-1.8.0-android19.so.bz2");
            if (!Version.getCpuAbis().contains("armeabi-v7a") || Version.getCpuAbis().contains("x86") || createOpenH264DownloadHelper.isCodecFound()) {
                goToLinphoneActivity();
                return;
            }
            changeFragment(new CodecDownloaderFragment());
            this.currentFragment = AssistantFragmentsEnum.DOWNLOAD_CODEC;
            this.back.setVisibility(0);
            this.cancel.setEnabled(false);
            return;
        }
        goToLinphoneActivity();
    }

    public void endDownloadCodec() {
        goToLinphoneActivity();
    }

    public String getPhoneWithCountry() {
        if (this.country == null || this.phone_number == null) {
            return "";
        }
        return this.country.getCountryCode() + this.phone_number.replace("\\D", "");
    }

    public void saveCreatedAccount(String str, String str2, String str3, String str4, String str5, String str6, String str7, LinphoneAddress.TransportType transportType) {
        String displayableUsernameFromAddress = LinphoneUtils.getDisplayableUsernameFromAddress(str);
        String displayableUsernameFromAddress2 = LinphoneUtils.getDisplayableUsernameFromAddress(str7);
        try {
            this.address = LinphoneCoreFactory.instance().createLinphoneAddress("sip:" + displayableUsernameFromAddress + "@" + displayableUsernameFromAddress2);
        } catch (LinphoneCoreException e) {
            Log.m6903e(e);
        }
        LinphonePreferences.AccountBuilder password = new LinphonePreferences.AccountBuilder(LinphoneManager.getLc()).setUsername(displayableUsernameFromAddress).setDomain(displayableUsernameFromAddress2).setHa1(str5).setUserId(str2).setDisplayName(str4).setPassword(str3);
        if (str6 != null) {
            password.setPrefix(str6);
        }
        if (!TextUtils.isEmpty("")) {
            password.setProxy("").setOutboundProxyEnabled(true).setAvpfRRInterval(5);
        }
        if (transportType != null) {
            password.setTransport(transportType);
        }
        try {
            password.saveNewAccount();
            if (!this.newAccount) {
                displayRegistrationInProgressDialog();
            }
            this.accountCreated = true;
        } catch (LinphoneCoreException e2) {
            Log.m6903e(e2);
        }
    }

    public void displayRegistrationInProgressDialog() {
        if (LinphoneManager.getLc().isNetworkReachable()) {
            this.progress = ProgressDialog.show(this, (CharSequence) null, (CharSequence) null);
            ColorDrawable colorDrawable = new ColorDrawable(ContextCompat.getColor(this, C5321R.C5322color.colorE));
            colorDrawable.setAlpha(200);
            this.progress.getWindow().setLayout(-1, -1);
            this.progress.getWindow().setBackgroundDrawable(colorDrawable);
            this.progress.setContentView(C5321R.layout.progress_dialog);
            this.progress.show();
        }
    }

    public void displayRemoteProvisioningInProgressDialog() {
        this.remoteProvisioningInProgress = true;
        this.progress = ProgressDialog.show(this, (CharSequence) null, (CharSequence) null);
        ColorDrawable colorDrawable = new ColorDrawable(ContextCompat.getColor(this, C5321R.C5322color.colorE));
        colorDrawable.setAlpha(200);
        this.progress.getWindow().setLayout(-1, -1);
        this.progress.getWindow().setBackgroundDrawable(colorDrawable);
        this.progress.setContentView(C5321R.layout.progress_dialog);
        this.progress.show();
    }

    public void displayAssistantConfirm(String str, String str2, String str3) {
        CreateAccountActivationFragment createAccountActivationFragment = new CreateAccountActivationFragment();
        this.newAccount = true;
        Bundle bundle = new Bundle();
        bundle.putString("Username", str);
        bundle.putString("Password", str2);
        bundle.putString("Email", str3);
        createAccountActivationFragment.setArguments(bundle);
        changeFragment(createAccountActivationFragment);
        this.currentFragment = AssistantFragmentsEnum.CREATE_ACCOUNT_ACTIVATION;
        this.back.setVisibility(4);
    }

    public void displayAssistantCodeConfirm(String str, String str2, String str3, boolean z) {
        CreateAccountCodeActivationFragment createAccountCodeActivationFragment = new CreateAccountCodeActivationFragment();
        this.newAccount = true;
        Bundle bundle = new Bundle();
        bundle.putString("Username", str);
        bundle.putString("Phone", str2);
        bundle.putString("Dialcode", str3);
        bundle.putBoolean("RecoverAccount", z);
        bundle.putBoolean("LinkAccount", this.isLink);
        createAccountCodeActivationFragment.setArguments(bundle);
        changeFragment(createAccountCodeActivationFragment);
        this.currentFragment = AssistantFragmentsEnum.CREATE_ACCOUNT_CODE_ACTIVATION;
        this.back.setVisibility(4);
    }

    public void displayAssistantLinphoneLogin(String str, String str2) {
        LinphoneLoginFragment linphoneLoginFragment = new LinphoneLoginFragment();
        this.newAccount = true;
        Bundle bundle = new Bundle();
        bundle.putString("Phone", str);
        bundle.putString("Dialcode", str2);
        linphoneLoginFragment.setArguments(bundle);
        changeFragment(linphoneLoginFragment);
        this.currentFragment = AssistantFragmentsEnum.LINPHONE_LOGIN;
        this.back.setVisibility(0);
    }

    public void isAccountVerified(String str) {
        Toast.makeText(this, getString(C5321R.string.assistant_account_validated), 1).show();
        hideKeyboard();
        success();
    }

    public Dialog createErrorDialog(LinphoneProxyConfig linphoneProxyConfig, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if (str.equals("Forbidden")) {
            str = getString(C5321R.string.assistant_error_bad_credentials);
        }
        builder.setMessage(str).setTitle(linphoneProxyConfig.getState().toString()).setPositiveButton(getString(C5321R.string.continue_text), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AssistantActivity.this.success();
            }
        }).setNegativeButton(getString(C5321R.string.cancel), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                LinphoneManager.getLc().removeProxyConfig(LinphoneManager.getLc().getDefaultProxyConfig());
                LinphonePreferences.instance().resetDefaultProxyConfig();
                LinphoneManager.getLc().refreshRegisters();
                dialogInterface.dismiss();
            }
        });
        return builder.show();
    }

    public void success() {
        if (LinphoneManager.getLc().needsEchoCalibration() && this.mPrefs.isFirstLaunch()) {
            launchEchoCancellerCalibration(true);
        }
    }

    /* access modifiers changed from: private */
    public void goToLinphoneActivity() {
        this.mPrefs.firstLaunchSuccessful();
        startActivity(new Intent().setClass(this, LinphoneActivity.class).putExtra("isNewProxyConfig", true));
        finish();
    }

    public void setLinphoneCoreListener() {
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.addListener(this.mListener);
        }
        StatusFragment statusFragment = this.status;
        if (statusFragment != null) {
            statusFragment.setLinphoneCoreListener();
        }
    }

    public void restartApplication() {
        this.mPrefs.firstLaunchSuccessful();
        ((AlarmManager) getSystemService(NotificationCompat.CATEGORY_ALARM)).set(1, System.currentTimeMillis() + 500, PendingIntent.getActivity(this, (int) System.currentTimeMillis(), new Intent(this, LinphoneLauncherActivity.class), 268435456));
        finish();
        stopService(new Intent("android.intent.action.MAIN").setClass(this, LinphoneService.class));
        ((ActivityManager) getSystemService("activity")).killBackgroundProcesses(getString(C5321R.string.sync_account_type));
        Process.killProcess(Process.myPid());
    }

    public void onAccountCreatorIsAccountUsed(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
        if (requestStatus.equals(LinphoneAccountCreator.RequestStatus.AccountExistWithAlias)) {
            success();
            return;
        }
        this.isLink = true;
        displayCreateAccount();
    }

    public CountryListAdapter getCountryListAdapter() {
        return this.countryListAdapter;
    }

    public class CountryListAdapter extends BaseAdapter implements Filterable {
        /* access modifiers changed from: private */
        public DialPlan[] allCountries = LinphoneCoreFactory.instance().getAllDialPlan();
        private Context context;
        /* access modifiers changed from: private */
        public List<DialPlan> filteredCountries = new ArrayList(Arrays.asList(this.allCountries));
        private LayoutInflater mInflater;

        public long getItemId(int i) {
            return (long) i;
        }

        public CountryListAdapter(Context context2) {
            this.context = context2;
        }

        public void setInflater(LayoutInflater layoutInflater) {
            this.mInflater = layoutInflater;
        }

        public DialPlan getCountryFromCountryCode(String str) {
            if (str.startsWith("+")) {
                str = str.substring(1);
            }
            for (DialPlan dialPlan : this.allCountries) {
                if (dialPlan.getCountryCallingCode().compareTo(str) == 0) {
                    return dialPlan;
                }
            }
            return null;
        }

        public int getCount() {
            return this.filteredCountries.size();
        }

        public DialPlan getItem(int i) {
            return this.filteredCountries.get(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.mInflater.inflate(C5321R.layout.country_cell, viewGroup, false);
            }
            DialPlan dialPlan = this.filteredCountries.get(i);
            ((TextView) view.findViewById(C5321R.C5324id.country_name)).setText(dialPlan.getCountryName());
            TextView textView = (TextView) view.findViewById(C5321R.C5324id.country_prefix);
            Context context2 = this.context;
            if (context2 != null) {
                textView.setText(String.format(context2.getString(C5321R.string.country_code), new Object[]{dialPlan.getCountryCallingCode()}));
            }
            view.setTag(dialPlan);
            return view;
        }

        public Filter getFilter() {
            return new Filter() {
                /* access modifiers changed from: protected */
                public Filter.FilterResults performFiltering(CharSequence charSequence) {
                    ArrayList arrayList = new ArrayList();
                    for (DialPlan dialPlan : CountryListAdapter.this.allCountries) {
                        if (dialPlan.getCountryName().toLowerCase().contains(charSequence) || dialPlan.getCountryCallingCode().contains(charSequence)) {
                            arrayList.add(dialPlan);
                        }
                    }
                    Filter.FilterResults filterResults = new Filter.FilterResults();
                    filterResults.values = arrayList;
                    return filterResults;
                }

                /* access modifiers changed from: protected */
                public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                    List unused = CountryListAdapter.this.filteredCountries = (List) filterResults.values;
                    CountryListAdapter.this.notifyDataSetChanged();
                }
            };
        }
    }
}
