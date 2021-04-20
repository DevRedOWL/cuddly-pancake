package org.linphone;

import android.app.ActivityManager;
import android.app.Dialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.linphone.assistant.AssistantActivity;
import org.linphone.assistant.RemoteProvisioningLoginActivity;
import org.linphone.compatibility.Compatibility;
import org.linphone.core.CallDirection;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneAuthInfo;
import org.linphone.core.LinphoneCall;
import org.linphone.core.LinphoneCallLog;
import org.linphone.core.LinphoneCallParams;
import org.linphone.core.LinphoneChatMessage;
import org.linphone.core.LinphoneChatRoom;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.LinphoneCoreFactory;
import org.linphone.core.LinphoneCoreListenerBase;
import org.linphone.core.LinphoneProxyConfig;
import org.linphone.core.Reason;
import org.linphone.mediastream.Log;
import org.linphone.p054ui.AddressText;
import org.linphone.purchase.InAppPurchaseActivity;
import org.linphone.xmlrpc.XmlRpcHelper;
import org.linphone.xmlrpc.XmlRpcListenerBase;
import p035ru.unicorn.ujin.ReactConst;
import p046io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy;

public class LinphoneActivity extends LinphoneGenericActivity implements View.OnClickListener, ContactPicked, ActivityCompat.OnRequestPermissionsResultCallback {
    private static final int CALL_ACTIVITY = 19;
    private static final int PERMISSIONS_READ_EXTERNAL_STORAGE_DEVICE_RINGTONE = 210;
    private static final int PERMISSIONS_RECORD_AUDIO_ECHO_CANCELLER = 209;
    private static final int PERMISSIONS_RECORD_AUDIO_ECHO_TESTER = 211;
    private static final int PERMISSIONS_REQUEST_CONTACTS = 208;
    private static final int PERMISSIONS_REQUEST_OVERLAY = 206;
    private static final int PERMISSIONS_REQUEST_SYNC = 207;
    public static final String PREF_FIRST_LAUNCH = "pref_first_launch";
    private static final int SETTINGS_ACTIVITY = 123;
    private static LinphoneActivity instance;
    private ListView accountsList;
    private boolean callTransfer = false;
    private ImageView cancel;
    private RelativeLayout chat;
    private View chat_selected;
    private RelativeLayout contacts;
    private View contacts_selected;
    private FragmentsAvailable currentFragment;
    private RelativeLayout defaultAccount;
    private RelativeLayout dialer;
    private Fragment.SavedState dialerSavedState;
    private View dialer_selected;
    private boolean doNotGoToCallActivity = false;
    private boolean emptyFragment = false;
    private Fragment fragment;
    private List<FragmentsAvailable> fragmentsHistory;
    private RelativeLayout history;
    private View history_selected;
    private boolean isOnBackground = false;
    /* access modifiers changed from: private */
    public boolean isTrialAccount = false;
    public String mAddressWaitingToBeCalled;
    /* access modifiers changed from: private */
    public int mAlwaysChangingPhoneAngle = -1;
    private LinphoneCoreListenerBase mListener;
    private OrientationEventListener mOrientationHelper;
    private LinearLayout mTabBar;
    private RelativeLayout mTopBar;
    private ImageView menu;
    private TextView missedCalls;
    private TextView missedChats;
    /* access modifiers changed from: private */
    public boolean newProxyConfig;
    private FragmentsAvailable pendingFragmentTransaction;
    private RelativeLayout quitLayout;
    /* access modifiers changed from: private */
    public DrawerLayout sideMenu;
    /* access modifiers changed from: private */
    public RelativeLayout sideMenuContent;
    /* access modifiers changed from: private */
    public ListView sideMenuItemList;
    private List<String> sideMenuItems;
    private StatusFragment statusFragment;

    static final boolean isInstanciated() {
        return instance != null;
    }

    public static final LinphoneActivity instance() {
        LinphoneActivity linphoneActivity = instance;
        if (linphoneActivity != null) {
            return linphoneActivity;
        }
        throw new RuntimeException("LinphoneActivity not instantiated yet");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getResources().getBoolean(C5321R.bool.orientation_portrait_only)) {
            setRequestedOrientation(1);
        }
        boolean z = getResources().getBoolean(C5321R.bool.display_account_assistant_at_first_start);
        if (LinphonePreferences.instance().isProvisioningLoginViewEnabled()) {
            Intent intent = new Intent();
            intent.setClass(this, RemoteProvisioningLoginActivity.class);
            intent.putExtra("Domain", LinphoneManager.getInstance().wizardLoginViewDomain);
            startActivity(intent);
            finish();
            return;
        }
        if (bundle == null && z && LinphoneManager.getLcIfManagerNotDestroyedOrNull() != null && LinphonePreferences.instance().isFirstLaunch()) {
            if (LinphonePreferences.instance().getAccountCount() > 0) {
                LinphonePreferences.instance().firstLaunchSuccessful();
            } else {
                startActivity(new Intent().setClass(this, AssistantActivity.class));
                finish();
                return;
            }
        }
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            this.newProxyConfig = getIntent().getExtras().getBoolean("isNewProxyConfig");
        }
        if (getResources().getBoolean(C5321R.bool.use_linphone_tag)) {
            if (getPackageManager().checkPermission("android.permission.WRITE_SYNC_SETTINGS", getPackageName()) != 0) {
                checkSyncPermission();
            } else if (LinphoneService.isReady()) {
                ContactsManager.getInstance().initializeSyncAccount(getApplicationContext(), getContentResolver());
            }
        } else if (LinphoneService.isReady()) {
            ContactsManager.getInstance().initializeContactManager(getApplicationContext(), getContentResolver());
        }
        setContentView(C5321R.layout.main);
        instance = this;
        this.fragmentsHistory = new ArrayList();
        this.pendingFragmentTransaction = FragmentsAvailable.UNKNOW;
        initButtons();
        initSideMenu();
        this.currentFragment = FragmentsAvailable.EMPTY;
        if (bundle == null) {
            changeCurrentFragment(FragmentsAvailable.DIALER, getIntent().getExtras());
        } else {
            this.currentFragment = (FragmentsAvailable) bundle.getSerializable("currentFragment");
        }
        this.mListener = new LinphoneCoreListenerBase() {
            public void messageReceived(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom, LinphoneChatMessage linphoneChatMessage) {
                LinphoneActivity linphoneActivity = LinphoneActivity.this;
                linphoneActivity.displayMissedChats(linphoneActivity.getUnreadMessageCount());
            }

            public void registrationState(LinphoneCore linphoneCore, LinphoneProxyConfig linphoneProxyConfig, LinphoneCore.RegistrationState registrationState, String str) {
                LinphoneAuthInfo findAuthInfo = linphoneCore.findAuthInfo(linphoneProxyConfig.getIdentity(), linphoneProxyConfig.getRealm(), linphoneProxyConfig.getDomain());
                LinphoneActivity.this.refreshAccounts();
                if (LinphoneActivity.this.getResources().getBoolean(C5321R.bool.use_phone_number_validation) && findAuthInfo != null && findAuthInfo.getDomain().equals(LinphoneActivity.this.getString(C5321R.string.default_domain)) && registrationState.equals(LinphoneCore.RegistrationState.RegistrationOk)) {
                    LinphoneManager.getInstance().isAccountWithAlias();
                }
                if (registrationState.equals(LinphoneCore.RegistrationState.RegistrationFailed) && LinphoneActivity.this.newProxyConfig) {
                    boolean unused = LinphoneActivity.this.newProxyConfig = false;
                    linphoneProxyConfig.getError();
                    Reason reason = Reason.BadCredentials;
                    if (linphoneProxyConfig.getError() == Reason.Unauthorized) {
                        LinphoneActivity linphoneActivity = LinphoneActivity.this;
                        linphoneActivity.displayCustomToast(linphoneActivity.getString(C5321R.string.error_unauthorized), 1);
                    }
                    if (linphoneProxyConfig.getError() == Reason.IOError) {
                        LinphoneActivity linphoneActivity2 = LinphoneActivity.this;
                        linphoneActivity2.displayCustomToast(linphoneActivity2.getString(C5321R.string.error_io_error), 1);
                    }
                }
            }

            public void callState(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneCall.State state, String str) {
                if (state == LinphoneCall.State.IncomingReceived) {
                    LinphoneActivity.this.startActivity(new Intent(LinphoneActivity.instance(), CallIncomingActivity.class));
                } else if (state == LinphoneCall.State.OutgoingInit || state == LinphoneCall.State.OutgoingProgress) {
                    LinphoneActivity.this.startActivity(new Intent(LinphoneActivity.instance(), CallOutgoingActivity.class));
                } else if (state == LinphoneCall.State.CallEnd || state == LinphoneCall.State.Error || state == LinphoneCall.State.CallReleased) {
                    LinphoneActivity.this.resetClassicMenuLayoutAndGoBackToCallIfStillRunning();
                }
                LinphoneActivity.this.displayMissedCalls(LinphoneManager.getLc().getMissedCallsCount());
            }
        };
        int i = 0;
        displayMissedCalls(LinphoneManager.isInstanciated() ? LinphoneManager.getLc().getMissedCallsCount() : 0);
        int rotation = getWindowManager().getDefaultDisplay().getRotation();
        if (rotation != 0) {
            i = rotation != 1 ? rotation != 2 ? rotation != 3 ? rotation : 270 : 180 : 90;
        }
        if (LinphoneManager.isInstanciated()) {
            LinphoneManager.getLc().setDeviceRotation(i);
        }
        this.mAlwaysChangingPhoneAngle = i;
    }

    private void initButtons() {
        this.mTabBar = (LinearLayout) findViewById(C5321R.C5324id.footer);
        this.mTopBar = (RelativeLayout) findViewById(C5321R.C5324id.top_bar);
        this.cancel = (ImageView) findViewById(C5321R.C5324id.cancel);
        this.cancel.setOnClickListener(this);
        this.history = (RelativeLayout) findViewById(C5321R.C5324id.history);
        this.history.setOnClickListener(this);
        this.contacts = (RelativeLayout) findViewById(C5321R.C5324id.contacts);
        this.contacts.setOnClickListener(this);
        this.dialer = (RelativeLayout) findViewById(C5321R.C5324id.dialer);
        this.dialer.setOnClickListener(this);
        this.chat = (RelativeLayout) findViewById(C5321R.C5324id.chat);
        this.chat.setOnClickListener(this);
        this.history_selected = findViewById(C5321R.C5324id.history_select);
        this.contacts_selected = findViewById(C5321R.C5324id.contacts_select);
        this.dialer_selected = findViewById(C5321R.C5324id.dialer_select);
        this.chat_selected = findViewById(C5321R.C5324id.chat_select);
        this.missedCalls = (TextView) findViewById(C5321R.C5324id.missed_calls);
        this.missedChats = (TextView) findViewById(C5321R.C5324id.missed_chats);
    }

    private boolean isTablet() {
        return getResources().getBoolean(C5321R.bool.isTablet);
    }

    public void hideStatusBar() {
        if (!isTablet()) {
            findViewById(C5321R.C5324id.status).setVisibility(8);
        }
    }

    public void showStatusBar() {
        if (!isTablet()) {
            StatusFragment statusFragment2 = this.statusFragment;
            if (statusFragment2 != null && !statusFragment2.isVisible()) {
                this.statusFragment.getView().setVisibility(0);
            }
            findViewById(C5321R.C5324id.status).setVisibility(0);
        }
    }

    public void isNewProxyConfig() {
        this.newProxyConfig = true;
    }

    private void changeCurrentFragment(FragmentsAvailable fragmentsAvailable, Bundle bundle) {
        changeCurrentFragment(fragmentsAvailable, bundle, false);
    }

    private void changeCurrentFragment(FragmentsAvailable fragmentsAvailable, Bundle bundle, boolean z) {
        if (fragmentsAvailable != this.currentFragment || fragmentsAvailable == FragmentsAvailable.CHAT) {
            if (this.currentFragment == FragmentsAvailable.DIALER) {
                try {
                    this.dialerSavedState = getFragmentManager().saveFragmentInstanceState(DialerFragment.instance());
                } catch (Exception unused) {
                }
            }
            this.fragment = null;
            switch (fragmentsAvailable) {
                case HISTORY_LIST:
                    this.fragment = new HistoryListFragment();
                    break;
                case HISTORY_DETAIL:
                    this.fragment = new HistoryDetailFragment();
                    break;
                case CONTACTS_LIST:
                    checkAndRequestWriteContactsPermission();
                    this.fragment = new ContactsListFragment();
                    break;
                case CONTACT_DETAIL:
                    this.fragment = new ContactDetailsFragment();
                    break;
                case CONTACT_EDITOR:
                    this.fragment = new ContactEditorFragment();
                    break;
                case DIALER:
                    this.fragment = new DialerFragment();
                    if (bundle == null) {
                        this.fragment.setInitialSavedState(this.dialerSavedState);
                        break;
                    }
                    break;
                case SETTINGS:
                    this.fragment = new SettingsFragment();
                    break;
                case ACCOUNT_SETTINGS:
                    this.fragment = new AccountPreferencesFragment();
                    break;
                case ABOUT:
                    this.fragment = new AboutFragment();
                    break;
                case EMPTY:
                    this.fragment = new EmptyFragment();
                    break;
                case CHAT_LIST:
                    this.fragment = new ChatListFragment();
                    break;
                case CHAT:
                    this.fragment = new ChatFragment();
                    break;
            }
            Fragment fragment2 = this.fragment;
            if (fragment2 != null) {
                fragment2.setArguments(bundle);
                if (isTablet()) {
                    changeFragmentForTablets(this.fragment, fragmentsAvailable, z);
                    int i = C529612.$SwitchMap$org$linphone$FragmentsAvailable[fragmentsAvailable.ordinal()];
                    if (i == 1) {
                        ((HistoryListFragment) this.fragment).displayFirstLog();
                    } else if (i == 3) {
                        ((ContactsListFragment) this.fragment).displayFirstContact();
                    } else if (i == 11) {
                        ((ChatListFragment) this.fragment).displayFirstChat();
                    }
                } else {
                    changeFragment(this.fragment, fragmentsAvailable, z);
                }
            }
        }
    }

    private void changeFragment(Fragment fragment2, FragmentsAvailable fragmentsAvailable, boolean z) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        if (fragmentsAvailable == FragmentsAvailable.DIALER || fragmentsAvailable == FragmentsAvailable.CONTACTS_LIST || fragmentsAvailable == FragmentsAvailable.CHAT_LIST || fragmentsAvailable == FragmentsAvailable.HISTORY_LIST) {
            while (fragmentManager.getBackStackEntryCount() > 0) {
                fragmentManager.popBackStackImmediate((String) null, 1);
            }
        } else {
            beginTransaction.addToBackStack(fragmentsAvailable.toString());
        }
        beginTransaction.replace(C5321R.C5324id.fragmentContainer, fragment2, fragmentsAvailable.toString());
        beginTransaction.commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
        this.currentFragment = fragmentsAvailable;
    }

    private void changeFragmentForTablets(Fragment fragment2, FragmentsAvailable fragmentsAvailable, boolean z) {
        if (getResources().getBoolean(C5321R.bool.show_statusbar_only_on_dialer)) {
            if (fragmentsAvailable == FragmentsAvailable.DIALER) {
                showStatusBar();
            } else {
                hideStatusBar();
            }
        }
        this.emptyFragment = false;
        LinearLayout linearLayout = (LinearLayout) findViewById(C5321R.C5324id.fragmentContainer2);
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        if (fragmentsAvailable == FragmentsAvailable.EMPTY) {
            linearLayout.setVisibility(0);
            this.emptyFragment = true;
            beginTransaction.replace(C5321R.C5324id.fragmentContainer2, fragment2);
            beginTransaction.commitAllowingStateLoss();
            getFragmentManager().executePendingTransactions();
            return;
        }
        if (fragmentsAvailable.shouldAddItselfToTheRightOf(this.currentFragment)) {
            linearLayout.setVisibility(0);
            if (fragmentsAvailable == FragmentsAvailable.CONTACT_EDITOR) {
                beginTransaction.addToBackStack(fragmentsAvailable.toString());
            }
            beginTransaction.replace(C5321R.C5324id.fragmentContainer2, fragment2);
        } else {
            if (fragmentsAvailable == FragmentsAvailable.EMPTY) {
                linearLayout.setVisibility(0);
                beginTransaction.replace(C5321R.C5324id.fragmentContainer2, new EmptyFragment());
                this.emptyFragment = true;
            }
            if (fragmentsAvailable == FragmentsAvailable.DIALER || fragmentsAvailable == FragmentsAvailable.ABOUT || fragmentsAvailable == FragmentsAvailable.SETTINGS || fragmentsAvailable == FragmentsAvailable.ACCOUNT_SETTINGS) {
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setVisibility(0);
                beginTransaction.replace(C5321R.C5324id.fragmentContainer2, new EmptyFragment());
            }
            beginTransaction.replace(C5321R.C5324id.fragmentContainer, fragment2);
        }
        beginTransaction.commitAllowingStateLoss();
        getFragmentManager().executePendingTransactions();
        this.currentFragment = fragmentsAvailable;
        if (fragmentsAvailable == FragmentsAvailable.DIALER || fragmentsAvailable == FragmentsAvailable.SETTINGS || fragmentsAvailable == FragmentsAvailable.CONTACTS_LIST || fragmentsAvailable == FragmentsAvailable.CHAT_LIST || fragmentsAvailable == FragmentsAvailable.HISTORY_LIST) {
            try {
                getFragmentManager().popBackStackImmediate((String) null, 1);
            } catch (IllegalStateException unused) {
            }
        }
        this.fragmentsHistory.add(this.currentFragment);
    }

    public void displayHistoryDetail(String str, LinphoneCallLog linphoneCallLog) {
        String string;
        try {
            LinphoneAddress createLinphoneAddress = LinphoneCoreFactory.instance().createLinphoneAddress(str);
            LinphoneContact findContactFromAddress = ContactsManager.getInstance().findContactFromAddress(createLinphoneAddress);
            String fullName = findContactFromAddress != null ? findContactFromAddress.getFullName() : LinphoneUtils.getAddressDisplayName(str);
            String uri = (findContactFromAddress == null || findContactFromAddress.getPhotoUri() == null) ? null : findContactFromAddress.getPhotoUri().toString();
            if (linphoneCallLog.getDirection() == CallDirection.Outgoing) {
                string = getString(C5321R.string.outgoing);
            } else if (linphoneCallLog.getStatus() == LinphoneCallLog.CallStatus.Missed) {
                string = getString(C5321R.string.missed);
            } else {
                string = getString(C5321R.string.incoming);
            }
            String str2 = string;
            String secondsToDisplayableString = secondsToDisplayableString(linphoneCallLog.getCallDuration());
            String valueOf = String.valueOf(linphoneCallLog.getTimestamp());
            Fragment findFragmentById = getFragmentManager().findFragmentById(C5321R.C5324id.fragmentContainer2);
            if (findFragmentById == null || !findFragmentById.isVisible() || this.currentFragment != FragmentsAvailable.HISTORY_DETAIL) {
                Bundle bundle = new Bundle();
                bundle.putString("SipUri", createLinphoneAddress.asString());
                if (fullName != null) {
                    bundle.putString("DisplayName", fullName);
                    bundle.putString("PictureUri", uri);
                }
                bundle.putString("CallStatus", str2);
                bundle.putString("CallTime", secondsToDisplayableString);
                bundle.putString("CallDate", valueOf);
                changeCurrentFragment(FragmentsAvailable.HISTORY_DETAIL, bundle);
                return;
            }
            ((HistoryDetailFragment) findFragmentById).changeDisplayedHistory(createLinphoneAddress.asStringUriOnly(), fullName, uri, str2, secondsToDisplayableString, valueOf);
        } catch (LinphoneCoreException e) {
            Log.m6903e("Cannot display history details", e);
        }
    }

    public void displayEmptyFragment() {
        changeCurrentFragment(FragmentsAvailable.EMPTY, new Bundle());
    }

    private String secondsToDisplayableString(int i) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        Calendar instance2 = Calendar.getInstance();
        instance2.set(0, 0, 0, 0, 0, i);
        return simpleDateFormat.format(instance2.getTime());
    }

    public void displayContact(LinphoneContact linphoneContact, boolean z) {
        Fragment findFragmentById = getFragmentManager().findFragmentById(C5321R.C5324id.fragmentContainer2);
        if (findFragmentById == null || !findFragmentById.isVisible() || this.currentFragment != FragmentsAvailable.CONTACT_DETAIL) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("Contact", linphoneContact);
            bundle.putBoolean("ChatAddressOnly", z);
            changeCurrentFragment(FragmentsAvailable.CONTACT_DETAIL, bundle);
            return;
        }
        ((ContactDetailsFragment) findFragmentById).changeDisplayedContact(linphoneContact);
    }

    public void displayContacts(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("ChatAddressOnly", z);
        changeCurrentFragment(FragmentsAvailable.CONTACTS_LIST, bundle);
    }

    public void displayContactsForEdition(String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EditOnClick", true);
        bundle.putString("SipAddress", str);
        changeCurrentFragment(FragmentsAvailable.CONTACTS_LIST, bundle);
    }

    public void displayAbout() {
        changeCurrentFragment(FragmentsAvailable.ABOUT, (Bundle) null);
    }

    public void displayContactsForEdition(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EditOnClick", true);
        bundle.putString("SipAddress", str);
        bundle.putString("DisplayName", str2);
        changeCurrentFragment(FragmentsAvailable.CONTACTS_LIST, bundle);
    }

    public void displayAssistant() {
        startActivity(new Intent(this, AssistantActivity.class));
    }

    public void displayInapp() {
        startActivity(new Intent(this, InAppPurchaseActivity.class));
    }

    public int getUnreadMessageCount() {
        int i = 0;
        for (LinphoneChatRoom unreadMessagesCount : LinphoneManager.getLc().getChatRooms()) {
            i += unreadMessagesCount.getUnreadMessagesCount();
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void displayChat(java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r6 = r20
            r7 = r21
            android.content.res.Resources r2 = r18.getResources()
            int r3 = org.linphone.C5321R.bool.disable_chat
            boolean r2 = r2.getBoolean(r3)
            if (r2 == 0) goto L_0x0015
            return
        L_0x0015:
            if (r0 == 0) goto L_0x0060
            org.linphone.core.LinphoneCore r3 = org.linphone.LinphoneManager.getLc()     // Catch:{ LinphoneCoreException -> 0x0050 }
            org.linphone.core.LinphoneAddress r3 = r3.interpretUrl(r0)     // Catch:{ LinphoneCoreException -> 0x0050 }
            org.linphone.ContactsManager r4 = org.linphone.ContactsManager.getInstance()
            org.linphone.LinphoneContact r4 = r4.findContactFromAddress(r3)
            if (r4 == 0) goto L_0x002e
            java.lang.String r5 = r4.getFullName()
            goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            if (r4 == 0) goto L_0x004e
            android.net.Uri r8 = r4.getPhotoUri()
            if (r8 == 0) goto L_0x004e
            android.net.Uri r8 = r4.getPhotoUri()
            java.lang.String r8 = r8.toString()
            android.net.Uri r4 = r4.getThumbnailUri()
            java.lang.String r4 = r4.toString()
            r17 = r8
            r8 = r4
            r4 = r5
            r5 = r17
            goto L_0x0064
        L_0x004e:
            r4 = r5
            goto L_0x0062
        L_0x0050:
            r0 = move-exception
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = "Cannot display chat"
            r2[r3] = r4
            r3 = 1
            r2[r3] = r0
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r2)
            return
        L_0x0060:
            r3 = 0
            r4 = 0
        L_0x0062:
            r5 = 0
            r8 = 0
        L_0x0064:
            org.linphone.FragmentsAvailable r9 = r1.currentFragment
            org.linphone.FragmentsAvailable r10 = org.linphone.FragmentsAvailable.CHAT_LIST
            java.lang.String r11 = "ThumbnailUri"
            java.lang.String r12 = "PictureUri"
            java.lang.String r13 = "DisplayName"
            java.lang.String r14 = "fileSharedUri"
            java.lang.String r15 = "messageDraft"
            java.lang.String r2 = "SipUri"
            if (r9 == r10) goto L_0x00ba
            org.linphone.FragmentsAvailable r9 = r1.currentFragment
            org.linphone.FragmentsAvailable r10 = org.linphone.FragmentsAvailable.CHAT
            if (r9 != r10) goto L_0x007d
            goto L_0x00ba
        L_0x007d:
            boolean r9 = r18.isTablet()
            if (r9 == 0) goto L_0x008b
            org.linphone.FragmentsAvailable r0 = org.linphone.FragmentsAvailable.CHAT_LIST
            r2 = 0
            r1.changeCurrentFragment(r0, r2)
            goto L_0x0111
        L_0x008b:
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            if (r0 != 0) goto L_0x0096
            java.lang.String r10 = ""
            if (r0 == r10) goto L_0x0099
        L_0x0096:
            r9.putString(r2, r0)
        L_0x0099:
            if (r6 == 0) goto L_0x009e
            r9.putString(r15, r6)
        L_0x009e:
            if (r7 == 0) goto L_0x00a3
            r9.putString(r14, r7)
        L_0x00a3:
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = r3.getDisplayName()
            if (r0 == 0) goto L_0x00b4
            r9.putString(r13, r4)
            r9.putString(r12, r5)
            r9.putString(r11, r8)
        L_0x00b4:
            org.linphone.FragmentsAvailable r0 = org.linphone.FragmentsAvailable.CHAT
            r1.changeCurrentFragment(r0, r9)
            goto L_0x0111
        L_0x00ba:
            android.app.FragmentManager r9 = r18.getFragmentManager()
            int r10 = org.linphone.C5321R.C5324id.fragmentContainer2
            android.app.Fragment r9 = r9.findFragmentById(r10)
            if (r9 == 0) goto L_0x00e5
            boolean r10 = r9.isVisible()
            if (r10 == 0) goto L_0x00e5
            org.linphone.FragmentsAvailable r10 = r1.currentFragment
            r16 = r8
            org.linphone.FragmentsAvailable r8 = org.linphone.FragmentsAvailable.CHAT
            if (r10 != r8) goto L_0x00e7
            boolean r8 = r1.emptyFragment
            if (r8 != 0) goto L_0x00e7
            r2 = r9
            org.linphone.ChatFragment r2 = (org.linphone.ChatFragment) r2
            r3 = r19
            r6 = r20
            r7 = r21
            r2.changeDisplayedChat(r3, r4, r5, r6, r7)
            goto L_0x0111
        L_0x00e5:
            r16 = r8
        L_0x00e7:
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            r8.putString(r2, r0)
            if (r6 == 0) goto L_0x00f4
            r8.putString(r15, r6)
        L_0x00f4:
            if (r7 == 0) goto L_0x00f9
            r8.putString(r14, r7)
        L_0x00f9:
            if (r0 == 0) goto L_0x010c
            java.lang.String r0 = r3.getDisplayName()
            if (r0 == 0) goto L_0x010c
            r8.putString(r13, r4)
            r8.putString(r12, r5)
            r2 = r16
            r8.putString(r11, r2)
        L_0x010c:
            org.linphone.FragmentsAvailable r0 = org.linphone.FragmentsAvailable.CHAT
            r1.changeCurrentFragment(r0, r8)
        L_0x0111:
            int r0 = r18.getUnreadMessageCount()
            r1.displayMissedChats(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.LinphoneActivity.displayChat(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void onClick(View view) {
        int id = view.getId();
        resetSelection();
        if (id == C5321R.C5324id.history) {
            changeCurrentFragment(FragmentsAvailable.HISTORY_LIST, (Bundle) null);
            this.history_selected.setVisibility(0);
            LinphoneManager.getLc().resetMissedCallsCount();
            displayMissedCalls(0);
        } else if (id == C5321R.C5324id.contacts) {
            changeCurrentFragment(FragmentsAvailable.CONTACTS_LIST, (Bundle) null);
            this.contacts_selected.setVisibility(0);
        } else if (id == C5321R.C5324id.dialer) {
            changeCurrentFragment(FragmentsAvailable.DIALER, (Bundle) null);
            this.dialer_selected.setVisibility(0);
        } else if (id == C5321R.C5324id.chat) {
            changeCurrentFragment(FragmentsAvailable.CHAT_LIST, (Bundle) null);
            this.chat_selected.setVisibility(0);
        } else if (id == C5321R.C5324id.cancel) {
            hideTopBar();
            displayDialer();
        }
    }

    private void resetSelection() {
        this.history_selected.setVisibility(8);
        this.contacts_selected.setVisibility(8);
        this.dialer_selected.setVisibility(8);
        this.chat_selected.setVisibility(8);
    }

    public void hideTabBar(Boolean bool) {
        if (bool.booleanValue()) {
            this.mTabBar.setVisibility(8);
        } else {
            this.mTabBar.setVisibility(0);
        }
    }

    public void hideTopBar() {
        this.mTopBar.setVisibility(8);
    }

    public void selectMenu(FragmentsAvailable fragmentsAvailable) {
        this.currentFragment = fragmentsAvailable;
        resetSelection();
        switch (fragmentsAvailable) {
            case HISTORY_LIST:
            case HISTORY_DETAIL:
                this.history_selected.setVisibility(0);
                return;
            case CONTACTS_LIST:
            case CONTACT_DETAIL:
            case CONTACT_EDITOR:
                this.contacts_selected.setVisibility(0);
                return;
            case DIALER:
                this.dialer_selected.setVisibility(0);
                return;
            case SETTINGS:
            case ACCOUNT_SETTINGS:
                hideTabBar(true);
                this.mTopBar.setVisibility(0);
                return;
            case ABOUT:
                hideTabBar(true);
                return;
            case CHAT_LIST:
            case CHAT:
                this.chat_selected.setVisibility(0);
                return;
            default:
                return;
        }
    }

    public void updateDialerFragment(DialerFragment dialerFragment) {
        getWindow().setSoftInputMode(34);
    }

    public void goToDialerFragment() {
        changeCurrentFragment(FragmentsAvailable.DIALER, (Bundle) null);
        this.dialer_selected.setVisibility(0);
    }

    public void onMessageSent(String str, String str2) {
        Fragment findFragmentById = getFragmentManager().findFragmentById(C5321R.C5324id.fragmentContainer);
        if (findFragmentById.getClass() == ChatListFragment.class) {
            ((ChatListFragment) findFragmentById).refresh();
        }
    }

    public void updateStatusFragment(StatusFragment statusFragment2) {
        this.statusFragment = statusFragment2;
    }

    public void displaySettings() {
        changeCurrentFragment(FragmentsAvailable.SETTINGS, (Bundle) null);
    }

    public void displayDialer() {
        changeCurrentFragment(FragmentsAvailable.DIALER, (Bundle) null);
    }

    public void displayAccountSettings(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("Account", i);
        changeCurrentFragment(FragmentsAvailable.ACCOUNT_SETTINGS, bundle);
    }

    public StatusFragment getStatusFragment() {
        return this.statusFragment;
    }

    static class ChatRoomContainer {
        private LinphoneChatRoom mCr;
        long mTime;

        public static ChatRoomContainer createChatroomContainer(LinphoneChatRoom linphoneChatRoom) {
            if (linphoneChatRoom.getHistorySize() <= 0) {
                return null;
            }
            return new ChatRoomContainer(linphoneChatRoom);
        }

        public ChatRoomContainer(LinphoneChatRoom linphoneChatRoom) {
            this.mCr = linphoneChatRoom;
            LinphoneChatMessage[] history = linphoneChatRoom.getHistory(1);
            if (history == null || history.length <= 0 || history[0] == null) {
                this.mTime = 0;
            } else {
                this.mTime = history[0].getTime();
            }
        }

        /* access modifiers changed from: package-private */
        public LinphoneChatRoom getChatRoom() {
            return this.mCr;
        }

        /* access modifiers changed from: package-private */
        public long getTime() {
            return this.mTime;
        }
    }

    public List<String> getChatList() {
        ArrayList arrayList = new ArrayList();
        LinphoneChatRoom[] chatRooms = LinphoneManager.getLc().getChatRooms();
        ArrayList<ChatRoomContainer> arrayList2 = new ArrayList<>();
        for (LinphoneChatRoom createChatroomContainer : chatRooms) {
            ChatRoomContainer createChatroomContainer2 = ChatRoomContainer.createChatroomContainer(createChatroomContainer);
            if (createChatroomContainer2 != null) {
                arrayList2.add(createChatroomContainer2);
            }
        }
        if (arrayList2.size() > 1) {
            Collections.sort(arrayList2, new Comparator<ChatRoomContainer>() {
                public int compare(ChatRoomContainer chatRoomContainer, ChatRoomContainer chatRoomContainer2) {
                    long time = chatRoomContainer.getTime();
                    long time2 = chatRoomContainer2.getTime();
                    if (time > time2) {
                        return -1;
                    }
                    return time2 > time ? 1 : 0;
                }
            });
        }
        for (ChatRoomContainer chatRoom : arrayList2) {
            arrayList.add(chatRoom.getChatRoom().getPeerAddress().asStringUriOnly());
        }
        return arrayList;
    }

    public void removeFromChatList(String str) {
        LinphoneManager.getLc().getOrCreateChatRoom(str).deleteHistory();
    }

    public void updateMissedChatCount() {
        displayMissedChats(getUnreadMessageCount());
    }

    public void displayMissedCalls(int i) {
        if (i > 0) {
            TextView textView = this.missedCalls;
            textView.setText(i + "");
            this.missedCalls.setVisibility(0);
            return;
        }
        if (LinphoneManager.isInstanciated()) {
            LinphoneManager.getLc().resetMissedCallsCount();
        }
        this.missedCalls.clearAnimation();
        this.missedCalls.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public void displayMissedChats(int i) {
        if (i > 0) {
            TextView textView = this.missedChats;
            textView.setText(i + "");
            this.missedChats.setVisibility(0);
            return;
        }
        this.missedChats.clearAnimation();
        this.missedChats.setVisibility(8);
    }

    public void displayCustomToast(String str, int i) {
        View inflate = getLayoutInflater().inflate(C5321R.layout.toast, (ViewGroup) findViewById(C5321R.C5324id.toastRoot));
        ((TextView) inflate.findViewById(C5321R.C5324id.toastMessage)).setText(str);
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(17, 0, 0);
        toast.setDuration(i);
        toast.setView(inflate);
        toast.show();
    }

    public Dialog displayDialog(String str) {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        ColorDrawable colorDrawable = new ColorDrawable(ContextCompat.getColor(this, C5321R.C5322color.colorC));
        colorDrawable.setAlpha(200);
        dialog.setContentView(C5321R.layout.dialog);
        dialog.getWindow().setLayout(-1, -1);
        dialog.getWindow().setBackgroundDrawable(colorDrawable);
        ((TextView) dialog.findViewById(C5321R.C5324id.customText)).setText(str);
        return dialog;
    }

    public Dialog displayWrongPasswordDialog(String str, String str2, String str3) {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        ColorDrawable colorDrawable = new ColorDrawable(ContextCompat.getColor(this, C5321R.C5322color.colorC));
        colorDrawable.setAlpha(200);
        dialog.setContentView(C5321R.layout.input_dialog);
        dialog.getWindow().setLayout(-1, -1);
        dialog.getWindow().setBackgroundDrawable(colorDrawable);
        ((TextView) dialog.findViewById(C5321R.C5324id.customText)).setText(getString(C5321R.string.error_bad_credentials));
        final Dialog dialog2 = dialog;
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        ((Button) dialog.findViewById(C5321R.C5324id.retry)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                LinphoneManager.getLc().addAuthInfo(LinphoneCoreFactory.instance().createAuthInfo(str4, (String) null, ((EditText) dialog2.findViewById(C5321R.C5324id.password)).getText().toString(), (String) null, str5, str6));
                LinphoneManager.getLc().refreshRegisters();
                dialog2.dismiss();
            }
        });
        ((Button) dialog.findViewById(C5321R.C5324id.cancel)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        return dialog;
    }

    public void setAddresGoToDialerAndCall(String str, String str2, Uri uri) {
        AddressText addressText = new AddressText(this, (AttributeSet) null);
        addressText.setDisplayedName(str2);
        addressText.setText(str);
        LinphoneManager.getInstance().newOutgoingCall(addressText);
    }

    public void startIncallActivity(LinphoneCall linphoneCall) {
        Intent intent = new Intent(this, CallActivity.class);
        startOrientationSensor();
        startActivityForResult(intent, 19);
    }

    private synchronized void startOrientationSensor() {
        if (this.mOrientationHelper == null) {
            this.mOrientationHelper = new LocalOrientationEventListener(this);
        }
        this.mOrientationHelper.disable();
    }

    private class LocalOrientationEventListener extends OrientationEventListener {
        public LocalOrientationEventListener(Context context) {
            super(context);
        }

        public void onOrientationChanged(int i) {
            if (i != -1) {
                int i2 = 270;
                if (i < 45 || i > 315) {
                    i2 = 0;
                } else if (i < 135) {
                    i2 = 90;
                } else if (i < 225) {
                    i2 = 180;
                }
                if (LinphoneActivity.this.mAlwaysChangingPhoneAngle != i2) {
                    int unused = LinphoneActivity.this.mAlwaysChangingPhoneAngle = i2;
                    Log.m6901d("Phone orientation changed to ", Integer.valueOf(i2));
                    int i3 = (360 - i2) % 360;
                    LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
                    if (lcIfManagerNotDestroyedOrNull != null) {
                        lcIfManagerNotDestroyedOrNull.setDeviceRotation(i3);
                        LinphoneCall currentCall = lcIfManagerNotDestroyedOrNull.getCurrentCall();
                        if (currentCall != null && currentCall.cameraEnabled() && currentCall.getCurrentParams().getVideoEnabled()) {
                            lcIfManagerNotDestroyedOrNull.updateCall(currentCall, (LinphoneCallParams) null);
                        }
                    }
                }
            }
        }
    }

    public Boolean isCallTransfer() {
        return Boolean.valueOf(this.callTransfer);
    }

    private void initInCallMenuLayout(boolean z) {
        selectMenu(FragmentsAvailable.DIALER);
        DialerFragment instance2 = DialerFragment.instance();
        if (instance2 != null) {
            instance2.resetLayout(z);
        }
    }

    public void resetClassicMenuLayoutAndGoBackToCallIfStillRunning() {
        DialerFragment instance2 = DialerFragment.instance();
        if (instance2 != null) {
            instance2.resetLayout(true);
        }
        if (LinphoneManager.isInstanciated() && LinphoneManager.getLc().getCallsNb() > 0) {
            LinphoneCall linphoneCall = LinphoneManager.getLc().getCalls()[0];
            if (linphoneCall.getState() == LinphoneCall.State.IncomingReceived) {
                startActivity(new Intent(this, CallIncomingActivity.class));
            } else {
                startIncallActivity(linphoneCall);
            }
        }
    }

    public FragmentsAvailable getCurrentFragment() {
        return this.currentFragment;
    }

    public void addContact(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("NewSipAdress", str2);
        bundle.putSerializable("NewDisplayName", str);
        changeCurrentFragment(FragmentsAvailable.CONTACT_EDITOR, bundle);
    }

    public void editContact(LinphoneContact linphoneContact) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("Contact", linphoneContact);
        changeCurrentFragment(FragmentsAvailable.CONTACT_EDITOR, bundle);
    }

    public void editContact(LinphoneContact linphoneContact, String str) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("Contact", linphoneContact);
        bundle.putSerializable("NewSipAdress", str);
        changeCurrentFragment(FragmentsAvailable.CONTACT_EDITOR, bundle);
    }

    public void quit() {
        finish();
        stopService(new Intent("android.intent.action.MAIN").setClass(this, LinphoneService.class));
        ((ActivityManager) getSystemService("activity")).killBackgroundProcesses(getString(C5321R.string.sync_account_type));
        Process.killProcess(Process.myPid());
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        if (this.pendingFragmentTransaction != FragmentsAvailable.UNKNOW) {
            changeCurrentFragment(this.pendingFragmentTransaction, (Bundle) null, true);
            selectMenu(this.pendingFragmentTransaction);
            this.pendingFragmentTransaction = FragmentsAvailable.UNKNOW;
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 19) {
            quit();
        }
        boolean z = false;
        if (i2 == 1 && i == 123) {
            if (intent.getExtras().getBoolean("Exit", false)) {
                quit();
            } else {
                this.pendingFragmentTransaction = (FragmentsAvailable) intent.getExtras().getSerializable("FragmentToDisplay");
            }
        } else if (i2 == 1 && i == 19) {
            getIntent().putExtra("PreviousActivity", 19);
            this.callTransfer = intent != null && intent.getBooleanExtra("Transfer", false);
            if (intent != null && intent.getBooleanExtra(ReactConst.CHAT, false)) {
                z = true;
            }
            if (z) {
                this.pendingFragmentTransaction = FragmentsAvailable.CHAT_LIST;
            }
            if (LinphoneManager.getLc().getCallsNb() > 0) {
                initInCallMenuLayout(this.callTransfer);
            } else {
                resetClassicMenuLayoutAndGoBackToCallIfStillRunning();
            }
        } else if (i != 206) {
            super.onActivityResult(i, i2, intent);
        } else if (Compatibility.canDrawOverlays(this)) {
            LinphonePreferences.instance().enableOverlay(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        getIntent().putExtra("PreviousActivity", 0);
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.removeListener(this.mListener);
        }
        this.callTransfer = false;
        this.isOnBackground = true;
        super.onPause();
    }

    public boolean checkAndRequestOverlayPermission() {
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("[Permission] Draw overlays permission is ");
        sb.append(Compatibility.canDrawOverlays(this) ? "granted" : "denied");
        objArr[0] = sb.toString();
        Log.m6905i(objArr);
        if (Compatibility.canDrawOverlays(this)) {
            return true;
        }
        Log.m6905i("[Permission] Asking for overlay");
        startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + getPackageName())), 206);
        return false;
    }

    public void checkAndRequestReadPhoneStatePermission() {
        checkAndRequestPermission("android.permission.READ_PHONE_STATE", 0);
    }

    public void checkAndRequestReadExternalStoragePermission() {
        checkAndRequestPermission("android.permission.READ_EXTERNAL_STORAGE", 0);
    }

    public void checkAndRequestExternalStoragePermission() {
        checkAndRequestPermission("android.permission.WRITE_EXTERNAL_STORAGE", 0);
    }

    public void checkAndRequestCameraPermission() {
        checkAndRequestPermission("android.permission.CAMERA", 0);
    }

    public void checkAndRequestReadContactsPermission() {
        checkAndRequestPermission("android.permission.READ_CONTACTS", 208);
    }

    public void checkAndRequestInappPermission() {
        checkAndRequestPermission("android.permission.GET_ACCOUNTS", 208);
    }

    public void checkAndRequestWriteContactsPermission() {
        checkAndRequestPermission("android.permission.WRITE_CONTACTS", 0);
    }

    public void checkAndRequestRecordAudioPermissionForEchoCanceller() {
        checkAndRequestPermission("android.permission.RECORD_AUDIO", PERMISSIONS_RECORD_AUDIO_ECHO_CANCELLER);
    }

    public void checkAndRequestRecordAudioPermissionsForEchoTester() {
        checkAndRequestPermission("android.permission.RECORD_AUDIO", PERMISSIONS_RECORD_AUDIO_ECHO_TESTER);
    }

    public void checkAndRequestReadExternalStoragePermissionForDeviceRingtone() {
        checkAndRequestPermission("android.permission.READ_EXTERNAL_STORAGE", PERMISSIONS_READ_EXTERNAL_STORAGE_DEVICE_RINGTONE);
    }

    public void checkAndRequestPermissionsToSendImage() {
        ArrayList arrayList = new ArrayList();
        int checkPermission = getPackageManager().checkPermission("android.permission.READ_EXTERNAL_STORAGE", getPackageName());
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("[Permission] Read external storage permission is ");
        String str = "granted";
        sb.append(checkPermission == 0 ? str : "denied");
        objArr[0] = sb.toString();
        Log.m6905i(objArr);
        int checkPermission2 = getPackageManager().checkPermission("android.permission.CAMERA", getPackageName());
        Object[] objArr2 = new Object[1];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[Permission] Camera permission is ");
        if (checkPermission2 != 0) {
            str = "denied";
        }
        sb2.append(str);
        objArr2[0] = sb2.toString();
        Log.m6905i(objArr2);
        if (checkPermission != 0) {
            ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.READ_EXTERNAL_STORAGE");
            Log.m6905i("[Permission] Asking for read external storage");
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
        }
        if (checkPermission2 != 0) {
            ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.CAMERA");
            Log.m6905i("[Permission] Asking for camera");
            arrayList.add("android.permission.CAMERA");
        }
        if (arrayList.size() > 0) {
            ActivityCompat.requestPermissions(this, (String[]) arrayList.toArray(new String[arrayList.size()]), 0);
        }
    }

    private void checkSyncPermission() {
        checkAndRequestPermission("android.permission.WRITE_SYNC_SETTINGS", 207);
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
        if (checkPermission != 0) {
            ActivityCompat.shouldShowRequestPermissionRationale(this, str);
            Log.m6905i("[Permission] Asking for " + str);
            ActivityCompat.requestPermissions(this, new String[]{str}, i);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (strArr.length > 0) {
            boolean z = false;
            int i2 = -1;
            for (int i3 = 0; i3 < strArr.length; i3++) {
                Object[] objArr = new Object[1];
                StringBuilder sb = new StringBuilder();
                sb.append("[Permission] ");
                sb.append(strArr[i3]);
                sb.append(" is ");
                sb.append(iArr[i3] == 0 ? "granted" : "denied");
                objArr[0] = sb.toString();
                Log.m6905i(objArr);
                if (strArr[i3].compareTo("android.permission.READ_CONTACTS") == 0) {
                    i2 = i3;
                }
            }
            switch (i) {
                case 207:
                    if (iArr[0] != 0) {
                        ContactsManager.getInstance().initializeContactManager(getApplicationContext(), getContentResolver());
                        break;
                    } else {
                        ContactsManager.getInstance().initializeSyncAccount(getApplicationContext(), getContentResolver());
                        break;
                    }
                case PERMISSIONS_RECORD_AUDIO_ECHO_CANCELLER /*209*/:
                    if (iArr[0] != 0) {
                        ((SettingsFragment) this.fragment).echoCalibrationFail();
                        break;
                    } else {
                        ((SettingsFragment) this.fragment).startEchoCancellerCalibration();
                        break;
                    }
                case PERMISSIONS_READ_EXTERNAL_STORAGE_DEVICE_RINGTONE /*210*/:
                    if (strArr[0].compareTo("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                        if (iArr[0] == 0) {
                            z = true;
                        }
                        LinphonePreferences.instance().enableDeviceRingtone(z);
                        LinphoneManager.getInstance().enableDeviceRingtone(z);
                        break;
                    }
                    break;
                case PERMISSIONS_RECORD_AUDIO_ECHO_TESTER /*211*/:
                    if (iArr[0] == 0) {
                        ((SettingsFragment) this.fragment).startEchoTester();
                        break;
                    }
                    break;
            }
            if (i2 >= 0 && iArr[i2] == 0) {
                ContactsManager.getInstance().enableContactsAccess();
                if (!ContactsManager.getInstance().contactsFetchedOnce()) {
                    ContactsManager.getInstance().enableContactsAccess();
                    ContactsManager.getInstance().fetchContactsAsync();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        String str;
        super.onStart();
        android.util.Log.d("TAG", "onStart: " + LinphoneService.isReady());
        EventBus.getDefault().register(this);
        ArrayList arrayList = new ArrayList();
        int checkPermission = getPackageManager().checkPermission("android.permission.READ_CONTACTS", getPackageName());
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("[Permission] Contacts permission is ");
        String str2 = "granted";
        sb.append(checkPermission == 0 ? str2 : "denied");
        objArr[0] = sb.toString();
        Log.m6905i(objArr);
        int checkPermission2 = getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", getPackageName());
        Object[] objArr2 = new Object[1];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[Permission] Read phone state permission is ");
        if (checkPermission2 == 0) {
            str = str2;
        } else {
            str = "denied";
        }
        sb2.append(str);
        objArr2[0] = sb2.toString();
        Log.m6905i(objArr2);
        int checkPermission3 = getPackageManager().checkPermission("android.permission.READ_EXTERNAL_STORAGE", getPackageName());
        Object[] objArr3 = new Object[1];
        StringBuilder sb3 = new StringBuilder();
        sb3.append("[Permission] Read external storage for ring tone permission is ");
        if (checkPermission3 != 0) {
            str2 = "denied";
        }
        sb3.append(str2);
        objArr3[0] = sb3.toString();
        Log.m6905i(objArr3);
        if (checkPermission3 != 0 && (LinphonePreferences.instance().firstTimeAskingForPermission("android.permission.READ_EXTERNAL_STORAGE") || ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.READ_EXTERNAL_STORAGE"))) {
            Log.m6905i("[Permission] Asking for read external storage for ring tone");
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
        }
        if (checkPermission2 != 0 && (LinphonePreferences.instance().firstTimeAskingForPermission("android.permission.READ_PHONE_STATE") || ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.READ_PHONE_STATE"))) {
            Log.m6905i("[Permission] Asking for read phone state");
            arrayList.add("android.permission.READ_PHONE_STATE");
        }
        if (checkPermission != 0) {
            if (LinphonePreferences.instance().firstTimeAskingForPermission("android.permission.READ_CONTACTS") || ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.READ_CONTACTS")) {
                Log.m6905i("[Permission] Asking for contacts");
                arrayList.add("android.permission.READ_CONTACTS");
            }
        } else if (!ContactsManager.getInstance().contactsFetchedOnce()) {
            ContactsManager.getInstance().enableContactsAccess();
            ContactsManager.getInstance().fetchContactsAsync();
        }
        if (arrayList.size() > 0) {
            ActivityCompat.requestPermissions(this, (String[]) arrayList.toArray(new String[arrayList.size()]), PERMISSIONS_READ_EXTERNAL_STORAGE_DEVICE_RINGTONE);
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putSerializable("currentFragment", this.currentFragment);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        Bundle extras;
        android.util.Log.d("TAG", " XXX onResume LinphoneActivity");
        super.onResume();
        if (!LinphoneService.isReady()) {
            finishAffinity();
        }
        if (getIntent() != null) {
            int intExtra = getIntent().getIntExtra("PreviousActivity", 0);
            android.util.Log.d("TAG", "XXX PreviousActivity onResume: ");
            if (intExtra == 19) {
                finish();
            }
        }
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.addListener(this.mListener);
        }
        if (isTablet()) {
            LinearLayout linearLayout = (LinearLayout) findViewById(C5321R.C5324id.fragmentContainer2);
            if (this.currentFragment == FragmentsAvailable.DIALER || this.currentFragment == FragmentsAvailable.ABOUT || this.currentFragment == FragmentsAvailable.SETTINGS || this.currentFragment == FragmentsAvailable.ACCOUNT_SETTINGS) {
                linearLayout.setVisibility(8);
            }
        }
        refreshAccounts();
        if (getResources().getBoolean(C5321R.bool.enable_in_app_purchase)) {
            isTrialAccount();
        }
        updateMissedChatCount();
        displayMissedCalls(LinphoneManager.getLc().getMissedCallsCount());
        LinphoneManager.getInstance().changeStatusToOnline();
        if (getIntent().getIntExtra("PreviousActivity", 0) != 19 && !this.doNotGoToCallActivity && LinphoneManager.getLc().getCalls().length > 0) {
            LinphoneCall linphoneCall = LinphoneManager.getLc().getCalls()[0];
            LinphoneCall.State state = linphoneCall.getState();
            if (state == LinphoneCall.State.IncomingReceived) {
                startActivity(new Intent(this, CallIncomingActivity.class).putExtra("title", getIntent().getStringExtra("title")));
            } else if (state == LinphoneCall.State.OutgoingInit || state == LinphoneCall.State.OutgoingProgress || state == LinphoneCall.State.OutgoingRinging) {
                startActivity(new Intent(this, CallOutgoingActivity.class));
            } else {
                startIncallActivity(linphoneCall);
            }
        }
        Intent intent = getIntent();
        if (intent.getStringExtra("msgShared") != null) {
            displayChat((String) null, intent.getStringExtra("msgShared"), (String) null);
            intent.putExtra("msgShared", "");
        }
        if (!(intent.getStringExtra("fileShared") == null || intent.getStringExtra("fileShared") == "")) {
            displayChat((String) null, (String) null, intent.getStringExtra("fileShared"));
            intent.putExtra("fileShared", "");
        }
        this.doNotGoToCallActivity = false;
        this.isOnBackground = false;
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("SipUriOrNumber")) {
            this.mAddressWaitingToBeCalled = extras.getString("SipUriOrNumber");
            intent.removeExtra("SipUriOrNumber");
            goToDialerFragment();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        android.util.Log.d("TAG", " XXX onDestroy LinphoneActivity");
        OrientationEventListener orientationEventListener = this.mOrientationHelper;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.mOrientationHelper = null;
        }
        instance = null;
        super.onDestroy();
        unbindDrawables(findViewById(C5321R.C5324id.topLayout));
        System.gc();
    }

    private void unbindDrawables(View view) {
        if (!(view == null || view.getBackground() == null)) {
            view.getBackground().setCallback((Drawable.Callback) null);
        }
        if ((view instanceof ViewGroup) && !(view instanceof AdapterView)) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i < viewGroup.getChildCount()) {
                    unbindDrawables(viewGroup.getChildAt(i));
                    i++;
                } else {
                    viewGroup.removeAllViews();
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (getCurrentFragment() == FragmentsAvailable.SETTINGS) {
            Fragment fragment2 = this.fragment;
            if (fragment2 instanceof SettingsFragment) {
                ((SettingsFragment) fragment2).closePreferenceScreen();
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null && extras.getBoolean("GoToChat", false)) {
            String string = extras.getString("ChatContactSipUri");
            this.doNotGoToCallActivity = true;
            displayChat(string, (String) null, (String) null);
        } else if (extras != null && extras.getBoolean("GoToHistory", false)) {
            this.doNotGoToCallActivity = true;
            changeCurrentFragment(FragmentsAvailable.HISTORY_LIST, (Bundle) null);
        } else if (extras != null && extras.getBoolean("GoToInapp", false)) {
            this.doNotGoToCallActivity = true;
            displayInapp();
        } else if (extras == null || !extras.getBoolean(ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME, false)) {
            if (extras == null || !extras.getBoolean("StartCall", false)) {
                DialerFragment instance2 = DialerFragment.instance();
                if (instance2 != null) {
                    if (extras == null || !extras.containsKey("SipUriOrNumber")) {
                        instance2.newOutgoingCall(intent);
                    } else if (getResources().getBoolean(C5321R.bool.automatically_start_intercepted_outgoing_gsm_call)) {
                        instance2.newOutgoingCall(extras.getString("SipUriOrNumber"));
                    } else {
                        instance2.displayTextInAddressBar(extras.getString("SipUriOrNumber"));
                    }
                } else if (extras != null && extras.containsKey("SipUriOrNumber")) {
                    this.mAddressWaitingToBeCalled = extras.getString("SipUriOrNumber");
                    goToDialerFragment();
                }
                if (LinphoneManager.getLc().getCalls().length > 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(LinphoneCall.State.IncomingReceived);
                    if (LinphoneUtils.getCallsInState(LinphoneManager.getLc(), arrayList).size() <= 0) {
                        return;
                    }
                    if (CallActivity.isInstanciated()) {
                        CallActivity.instance().startIncomingCallActivity();
                    } else {
                        startActivity(new Intent(this, CallIncomingActivity.class));
                    }
                }
            } else {
                extras.getBoolean("StartCall", false);
                if (CallActivity.isInstanciated()) {
                    CallActivity.instance().startIncomingCallActivity();
                    return;
                }
                this.mAddressWaitingToBeCalled = extras.getString("NumberToCall");
                goToDialerFragment();
            }
        } else if (LinphoneManager.getLc().getCallsNb() > 0) {
            startIncallActivity(LinphoneManager.getLc().getCalls()[0]);
        }
    }

    public boolean isOnBackground() {
        return this.isOnBackground;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && (this.currentFragment == FragmentsAvailable.DIALER || this.currentFragment == FragmentsAvailable.CONTACTS_LIST || this.currentFragment == FragmentsAvailable.HISTORY_LIST || this.currentFragment == FragmentsAvailable.CHAT_LIST)) {
            if (!LinphonePreferences.instance().isBackgroundModeEnabled()) {
                stopService(new Intent("android.intent.action.MAIN").setClass(this, LinphoneService.class));
                finish();
            } else if (LinphoneUtils.onKeyBackGoHome(this, i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void openOrCloseSideMenu(boolean z) {
        if (z) {
            this.sideMenu.openDrawer((View) this.sideMenuContent);
        } else {
            this.sideMenu.closeDrawer((View) this.sideMenuContent);
        }
    }

    public void initSideMenu() {
        this.sideMenu = (DrawerLayout) findViewById(C5321R.C5324id.side_menu);
        this.sideMenuItems = new ArrayList();
        this.sideMenuItems.add(getResources().getString(C5321R.string.menu_assistant));
        this.sideMenuItems.add(getResources().getString(C5321R.string.menu_settings));
        if (getResources().getBoolean(C5321R.bool.enable_in_app_purchase)) {
            this.sideMenuItems.add(getResources().getString(C5321R.string.inapp));
        }
        this.sideMenuItems.add(getResources().getString(C5321R.string.menu_about));
        this.sideMenuContent = (RelativeLayout) findViewById(C5321R.C5324id.side_menu_content);
        this.sideMenuItemList = (ListView) findViewById(C5321R.C5324id.item_list);
        this.menu = (ImageView) findViewById(C5321R.C5324id.side_menu_button);
        this.sideMenuItemList.setAdapter(new ArrayAdapter(this, C5321R.layout.side_menu_item_cell, this.sideMenuItems));
        this.sideMenuItemList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (LinphoneActivity.this.sideMenuItemList.getAdapter().getItem(i).toString().equals(LinphoneActivity.this.getString(C5321R.string.menu_settings))) {
                    LinphoneActivity.instance().displaySettings();
                }
                if (LinphoneActivity.this.sideMenuItemList.getAdapter().getItem(i).toString().equals(LinphoneActivity.this.getString(C5321R.string.menu_about))) {
                    LinphoneActivity.instance().displayAbout();
                }
                if (LinphoneActivity.this.sideMenuItemList.getAdapter().getItem(i).toString().equals(LinphoneActivity.this.getString(C5321R.string.menu_assistant))) {
                    LinphoneActivity.instance().displayAssistant();
                }
                if (LinphoneActivity.this.getResources().getBoolean(C5321R.bool.enable_in_app_purchase) && LinphoneActivity.this.sideMenuItemList.getAdapter().getItem(i).toString().equals(LinphoneActivity.this.getString(C5321R.string.inapp))) {
                    LinphoneActivity.instance().displayInapp();
                }
                LinphoneActivity.this.openOrCloseSideMenu(false);
            }
        });
        initAccounts();
        this.menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (LinphoneActivity.this.sideMenu.isDrawerVisible(3)) {
                    LinphoneActivity.this.sideMenu.closeDrawer((View) LinphoneActivity.this.sideMenuContent);
                } else {
                    LinphoneActivity.this.sideMenu.openDrawer((View) LinphoneActivity.this.sideMenuContent);
                }
            }
        });
        this.quitLayout = (RelativeLayout) findViewById(C5321R.C5324id.side_menu_quit);
        this.quitLayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                LinphoneActivity.instance().quit();
            }
        });
    }

    /* access modifiers changed from: private */
    public int getStatusIconResource(LinphoneCore.RegistrationState registrationState) {
        try {
            if (registrationState == LinphoneCore.RegistrationState.RegistrationOk) {
                return C5321R.C5323drawable.led_connected;
            }
            if (registrationState == LinphoneCore.RegistrationState.RegistrationProgress) {
                return C5321R.C5323drawable.led_inprogress;
            }
            if (registrationState == LinphoneCore.RegistrationState.RegistrationFailed) {
                return C5321R.C5323drawable.led_error;
            }
            return C5321R.C5323drawable.led_disconnected;
        } catch (Exception e) {
            Log.m6903e(e);
            return C5321R.C5323drawable.led_disconnected;
        }
    }

    private void displayMainAccount() {
        this.defaultAccount.setVisibility(0);
        ImageView imageView = (ImageView) this.defaultAccount.findViewById(C5321R.C5324id.main_account_status);
        TextView textView = (TextView) this.defaultAccount.findViewById(C5321R.C5324id.main_account_address);
        TextView textView2 = (TextView) this.defaultAccount.findViewById(C5321R.C5324id.main_account_display_name);
        LinphoneProxyConfig defaultProxyConfig = LinphoneManager.getLc().getDefaultProxyConfig();
        if (defaultProxyConfig == null) {
            textView2.setText(getString(C5321R.string.no_account));
            imageView.setVisibility(8);
            textView.setText("");
            this.statusFragment.resetAccountStatus();
            LinphoneManager.getInstance().subscribeFriendList(false);
            this.defaultAccount.setOnClickListener((View.OnClickListener) null);
            return;
        }
        textView.setText(defaultProxyConfig.getAddress().asStringUriOnly());
        textView2.setText(LinphoneUtils.getAddressDisplayName(defaultProxyConfig.getAddress()));
        imageView.setImageResource(getStatusIconResource(defaultProxyConfig.getState()));
        imageView.setVisibility(0);
        this.defaultAccount.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                LinphoneActivity.instance().displayAccountSettings(LinphonePreferences.instance().getDefaultAccountIndex());
                LinphoneActivity.this.openOrCloseSideMenu(false);
            }
        });
    }

    public void refreshAccounts() {
        if (LinphoneManager.getLc().getProxyConfigList() == null || LinphoneManager.getLc().getProxyConfigList().length <= 1) {
            this.accountsList.setVisibility(8);
        } else {
            this.accountsList.setVisibility(0);
            this.accountsList.setAdapter(new AccountsListAdapter());
            this.accountsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    if (!(view == null || view.getTag() == null)) {
                        LinphoneActivity.instance().displayAccountSettings(Integer.parseInt(view.getTag().toString()));
                    }
                    LinphoneActivity.this.openOrCloseSideMenu(false);
                }
            });
        }
        displayMainAccount();
    }

    private void initAccounts() {
        this.accountsList = (ListView) findViewById(C5321R.C5324id.accounts_list);
        this.defaultAccount = (RelativeLayout) findViewById(C5321R.C5324id.default_account);
    }

    class AccountsListAdapter extends BaseAdapter {
        List<LinphoneProxyConfig> proxy_list = new ArrayList();

        public long getItemId(int i) {
            return (long) i;
        }

        AccountsListAdapter() {
            refresh();
        }

        public void refresh() {
            this.proxy_list = new ArrayList();
            for (LinphoneProxyConfig linphoneProxyConfig : LinphoneManager.getLc().getProxyConfigList()) {
                if (linphoneProxyConfig != LinphoneManager.getLc().getDefaultProxyConfig()) {
                    this.proxy_list.add(linphoneProxyConfig);
                }
            }
        }

        public int getCount() {
            List<LinphoneProxyConfig> list = this.proxy_list;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public Object getItem(int i) {
            return this.proxy_list.get(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            LinphoneProxyConfig linphoneProxyConfig = (LinphoneProxyConfig) getItem(i);
            int i2 = 0;
            if (view == null) {
                view = LinphoneActivity.this.getLayoutInflater().inflate(C5321R.layout.side_menu_account_cell, viewGroup, false);
            }
            ImageView imageView = (ImageView) view.findViewById(C5321R.C5324id.account_status);
            String asStringUriOnly = linphoneProxyConfig.getAddress().asStringUriOnly();
            ((TextView) view.findViewById(C5321R.C5324id.account_address)).setText(asStringUriOnly);
            int accountCount = LinphonePreferences.instance().getAccountCount();
            while (true) {
                if (i2 >= accountCount) {
                    break;
                }
                String accountUsername = LinphonePreferences.instance().getAccountUsername(i2);
                String accountDomain = LinphonePreferences.instance().getAccountDomain(i2);
                if (("sip:" + accountUsername + "@" + accountDomain).equals(asStringUriOnly)) {
                    view.setTag(Integer.valueOf(i2));
                    break;
                }
                i2++;
            }
            imageView.setImageResource(LinphoneActivity.this.getStatusIconResource(linphoneProxyConfig.getState()));
            return view;
        }
    }

    private void isTrialAccount() {
        if (LinphoneManager.getLc().getDefaultProxyConfig() != null && LinphonePreferences.instance().getInappPopupTime() != null) {
            new XmlRpcHelper().isTrialAccountAsync(new XmlRpcListenerBase() {
                public void onError(String str) {
                }

                public void onTrialAccountFetched(boolean z) {
                    boolean unused = LinphoneActivity.this.isTrialAccount = z;
                    LinphoneActivity.this.getExpirationAccount();
                }
            }, LinphonePreferences.instance().getAccountUsername(LinphonePreferences.instance().getDefaultAccountIndex()), LinphonePreferences.instance().getAccountHa1(LinphonePreferences.instance().getDefaultAccountIndex()));
        }
    }

    /* access modifiers changed from: private */
    public void getExpirationAccount() {
        if (LinphoneManager.getLc().getDefaultProxyConfig() != null && LinphonePreferences.instance().getInappPopupTime() != null) {
            new XmlRpcHelper().getAccountExpireAsync(new XmlRpcListenerBase() {
                public void onError(String str) {
                }

                public void onAccountExpireFetched(String str) {
                    if (str != null) {
                        long parseLong = Long.parseLong(str);
                        Calendar instance = Calendar.getInstance();
                        instance.setTimeInMillis(parseLong);
                        int access$900 = LinphoneActivity.this.getDiffDays(instance, Calendar.getInstance());
                        if (access$900 != -1 && access$900 <= LinphoneActivity.this.getResources().getInteger(C5321R.integer.days_notification_shown)) {
                            LinphoneActivity linphoneActivity = LinphoneActivity.this;
                            linphoneActivity.displayInappNotification(linphoneActivity.timestampToHumanDate(instance));
                        }
                    }
                }
            }, LinphonePreferences.instance().getAccountUsername(LinphonePreferences.instance().getDefaultAccountIndex()), LinphonePreferences.instance().getAccountHa1(LinphonePreferences.instance().getDefaultAccountIndex()));
        }
    }

    public void displayInappNotification(String str) {
        Timestamp timestamp = new Timestamp(new Date().getTime());
        if (LinphonePreferences.instance().getInappPopupTime() == null || Long.parseLong(LinphonePreferences.instance().getInappPopupTime()) <= timestamp.getTime()) {
            LinphonePreferences.instance().setInappPopupTime(String.valueOf(timestamp.getTime() + ((long) getResources().getInteger(C5321R.integer.time_between_inapp_notification))));
        }
    }

    /* access modifiers changed from: private */
    public String timestampToHumanDate(Calendar calendar) {
        return new SimpleDateFormat(getResources().getString(C5321R.string.inapp_popup_date_format)).format(calendar.getTime());
    }

    /* access modifiers changed from: private */
    public int getDiffDays(Calendar calendar, Calendar calendar2) {
        if (calendar == null || calendar2 == null || calendar.get(0) != calendar2.get(0) || calendar.get(1) != calendar2.get(1)) {
            return -1;
        }
        return calendar.get(6) - calendar2.get(6);
    }

    public String getCVSPathFromOtherUri(String str) {
        InputStream inputStream;
        try {
            inputStream = getContentResolver().openInputStream(Uri.parse(str));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            inputStream = null;
        }
        StringBuffer stringBuffer = new StringBuffer("");
        while (true) {
            try {
                int read = inputStream.read();
                if (read == -1) {
                    break;
                }
                stringBuffer.append((char) read);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return new String(stringBuffer);
    }

    @Subscribe
    public void handleSomethingElse(MessageEvent messageEvent) {
        android.util.Log.d("TAG", "XXX handleSomethingElse: LA");
        finish();
    }

    public void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }
}
