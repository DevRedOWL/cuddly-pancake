package org.linphone;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Vibrator;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Button;
import androidx.room.RoomDatabase;
import com.facebook.react.uimanager.ViewProps;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.linphone.assistant.AssistantActivity;
import org.linphone.core.CallDirection;
import org.linphone.core.LinphoneAccountCreator;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneAuthInfo;
import org.linphone.core.LinphoneBuffer;
import org.linphone.core.LinphoneCall;
import org.linphone.core.LinphoneCallParams;
import org.linphone.core.LinphoneCallStats;
import org.linphone.core.LinphoneChatMessage;
import org.linphone.core.LinphoneChatRoom;
import org.linphone.core.LinphoneContent;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.LinphoneCoreFactory;
import org.linphone.core.LinphoneCoreListener;
import org.linphone.core.LinphoneEvent;
import org.linphone.core.LinphoneFriend;
import org.linphone.core.LinphoneFriendList;
import org.linphone.core.LinphoneInfoMessage;
import org.linphone.core.LinphoneProxyConfig;
import org.linphone.core.OpenH264DownloadHelperListener;
import org.linphone.core.PayloadType;
import org.linphone.core.PresenceActivityType;
import org.linphone.core.PresenceBasicStatus;
import org.linphone.core.PublishState;
import org.linphone.core.Reason;
import org.linphone.core.SubscriptionState;
import org.linphone.core.TunnelConfig;
import org.linphone.mediastream.Log;
import org.linphone.mediastream.Version;
import org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration;
import org.linphone.mediastream.video.capture.hwconf.Hacks;
import org.linphone.tools.H264Helper;
import org.linphone.tools.OpenH264DownloadHelper;
import p035ru.unicorn.ujin.view.fragments.providerService.ProviderServiceFragment;

public class LinphoneManager implements LinphoneCoreListener, LinphoneChatMessage.LinphoneChatMessageListener, SensorEventListener, LinphoneAccountCreator.LinphoneAccountCreatorListener {
    private static final int LINPHONE_VOLUME_STREAM = 0;
    private static final int dbStep = 4;
    private static LinphoneManager instance;
    private static List<LinphoneChatMessage> mPendingChatFileMessage;
    private static LinphoneChatMessage mUploadPendingFileMessage;
    private static boolean sExited;
    private static List<LinphoneChatMessage.LinphoneChatMessageListener> simpleListeners = new ArrayList();
    private LinphoneAccountCreator accountCreator;
    private String basePath;
    private boolean callGsmON;
    private boolean dozeModeEnabled;
    private boolean echoTesterIsRunning;
    private boolean handsetON = false;
    private boolean isRinging;
    private String lastLcStatusMessage;
    private boolean mAreDisplayAlertMessage = false;
    private boolean mAudioFocused;
    private AudioManager mAudioManager;
    private IntentFilter mCallIntentFilter;
    private final String mCallLogDatabaseFile;
    private BroadcastReceiver mCallReceiver;
    private final String mChatDatabaseFile;
    private OpenH264DownloadHelper mCodecDownloader;
    private OpenH264DownloadHelperListener mCodecListener;
    private ConnectivityManager mConnectivityManager;
    private IntentFilter mDozeIntentFilter;
    private BroadcastReceiver mDozeReceiver;
    private final String mDynamicConfigFile;
    private final String mErrorToneFile;
    private final String mFriendsDatabaseFile;
    /* access modifiers changed from: private */
    public Handler mHandler = new Handler();
    private IntentFilter mHookIntentFilter;
    private BroadcastReceiver mHookReceiver;
    private IntentFilter mKeepAliveIntentFilter;
    private BroadcastReceiver mKeepAliveReceiver;
    private final String mLPConfigXsd;
    private int mLastNetworkType = -1;
    /* access modifiers changed from: private */
    public LinphoneCore mLc;
    public final String mLinphoneConfigFile;
    private final String mLinphoneFactoryConfigFile;
    private final String mLinphoneRootCaFile;
    private IntentFilter mNetworkIntentFilter;
    private BroadcastReceiver mNetworkReceiver;
    private final String mPauseSoundFile;
    private PowerManager mPowerManager;
    private LinphonePreferences mPrefs;
    private Sensor mProximity;
    private boolean mProximitySensingEnabled;
    private PowerManager.WakeLock mProximityWakelock;

    /* renamed from: mR */
    private Resources f6319mR;
    private final String mRingSoundFile;
    private final String mRingbackSoundFile;
    private MediaPlayer mRingerPlayer;
    private SensorManager mSensorManager;
    /* access modifiers changed from: private */
    public Context mServiceContext;
    private Timer mTimer;
    private byte[] mUploadingImage;
    private final String mUserCertificatePath;
    private Vibrator mVibrator;
    private LinphoneCall ringingCall;
    public String wizardLoginViewDomain = null;

    public interface AddressType {
        String getDisplayedName();

        CharSequence getText();

        void setDisplayedName(String str);

        void setText(CharSequence charSequence);
    }

    public interface EcCalibrationListener {
        void onEcCalibrationStatus(LinphoneCore.EcCalibratorStatus ecCalibratorStatus, int i);
    }

    public interface NewOutgoingCallUiListener {
        void onAlreadyInCall();

        void onCannotGetCallParameters();

        void onWrongDestinationAddress();
    }

    public void authInfoRequested(LinphoneCore linphoneCore, String str, String str2, String str3) {
    }

    public void authenticationRequested(LinphoneCore linphoneCore, LinphoneAuthInfo linphoneAuthInfo, LinphoneCore.AuthMethod authMethod) {
    }

    public void callEncryptionChanged(LinphoneCore linphoneCore, LinphoneCall linphoneCall, boolean z, String str) {
    }

    public void callStatsUpdated(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneCallStats linphoneCallStats) {
    }

    public void displayMessage(LinphoneCore linphoneCore, String str) {
    }

    public void displayWarning(LinphoneCore linphoneCore, String str) {
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

    public void networkReachableChanged(LinphoneCore linphoneCore, boolean z) {
    }

    public void newSubscriptionRequest(LinphoneCore linphoneCore, LinphoneFriend linphoneFriend, String str) {
    }

    public void notifyReceived(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneAddress linphoneAddress, byte[] bArr) {
    }

    public void onAccountCreatorAccountActivated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorAccountCreated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorIsAccountActivated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorIsPhoneNumberUsed(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorPasswordUpdated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorPhoneAccountRecovered(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorPhoneNumberLinkActivated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onLinphoneChatMessageFileTransferReceived(LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, LinphoneBuffer linphoneBuffer) {
    }

    public void show(LinphoneCore linphoneCore) {
    }

    public void transferState(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneCall.State state) {
    }

    public static void addListener(LinphoneChatMessage.LinphoneChatMessageListener linphoneChatMessageListener) {
        if (!simpleListeners.contains(linphoneChatMessageListener)) {
            simpleListeners.add(linphoneChatMessageListener);
        }
    }

    public static void removeListener(LinphoneChatMessage.LinphoneChatMessageListener linphoneChatMessageListener) {
        simpleListeners.remove(linphoneChatMessageListener);
    }

    protected LinphoneManager(Context context) {
        sExited = false;
        this.echoTesterIsRunning = false;
        this.mServiceContext = context;
        this.basePath = context.getFilesDir().getAbsolutePath();
        this.mLPConfigXsd = this.basePath + "/lpconfig.xsd";
        this.mLinphoneFactoryConfigFile = this.basePath + "/linphonerc";
        this.mLinphoneConfigFile = this.basePath + "/.linphonerc";
        this.mLinphoneRootCaFile = this.basePath + "/rootca.pem";
        this.mDynamicConfigFile = this.basePath + "/assistant_create.rc";
        this.mRingSoundFile = this.basePath + "/ringtone.mkv";
        this.mRingbackSoundFile = this.basePath + "/ringback.wav";
        this.mPauseSoundFile = this.basePath + "/hold.mkv";
        this.mChatDatabaseFile = this.basePath + "/linphone-history.db";
        this.mCallLogDatabaseFile = this.basePath + "/linphone-log-history.db";
        this.mFriendsDatabaseFile = this.basePath + "/linphone-friends.db";
        this.mErrorToneFile = this.basePath + "/error.wav";
        this.mUserCertificatePath = this.basePath;
        this.mPrefs = LinphonePreferences.instance();
        this.mAudioManager = (AudioManager) context.getSystemService("audio");
        this.mVibrator = (Vibrator) context.getSystemService("vibrator");
        this.mPowerManager = (PowerManager) context.getSystemService("power");
        this.mConnectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.mSensorManager = (SensorManager) context.getSystemService("sensor");
        this.mProximity = this.mSensorManager.getDefaultSensor(8);
        this.f6319mR = context.getResources();
        mPendingChatFileMessage = new ArrayList();
    }

    private void routeAudioToSpeakerHelper(boolean z) {
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("Routing audio to ");
        sb.append(z ? "speaker" : "earpiece");
        sb.append(", disabling bluetooth audio route");
        objArr[0] = sb.toString();
        Log.m6907w(objArr);
        BluetoothManager.getInstance().disableBluetoothSCO();
        this.mLc.enableSpeaker(z);
    }

    public void initOpenH264DownloadHelper() {
        getLc().enableDownloadOpenH264(true);
        this.mCodecDownloader = LinphoneCoreFactory.instance().createOpenH264DownloadHelper();
        this.mCodecListener = new OpenH264DownloadHelperListener() {
            int box = 1;
            int ctxt = 0;
            ProgressDialog progress;

            public void OnProgress(final int i, final int i2) {
                LinphoneManager.this.mHandler.post(new Runnable() {
                    public void run() {
                        OpenH264DownloadHelper openH264DownloadHelper = LinphoneManager.getInstance().getOpenH264DownloadHelper();
                        if (C53071.this.progress == null) {
                            C53071 r1 = C53071.this;
                            r1.progress = new ProgressDialog((Context) openH264DownloadHelper.getUserData(r1.ctxt));
                            C53071.this.progress.setCanceledOnTouchOutside(false);
                            C53071.this.progress.setCancelable(false);
                            C53071.this.progress.setProgressStyle(1);
                        } else if (i <= i2) {
                            C53071.this.progress.setMessage(LinphoneManager.this.getString(C5321R.string.assistant_openh264_downloading));
                            C53071.this.progress.setMax(i2);
                            C53071.this.progress.setProgress(i);
                            C53071.this.progress.show();
                        } else {
                            C53071.this.progress.dismiss();
                            C53071.this.progress = null;
                            if (Build.VERSION.SDK_INT >= 22) {
                                LinphoneManager.getLc().reloadMsPlugins(AssistantActivity.instance().getApplicationInfo().nativeLibraryDir);
                                AssistantActivity.instance().endDownloadCodec();
                                return;
                            }
                            AssistantActivity.instance().restartApplication();
                        }
                    }
                });
            }

            public void OnError(String str) {
                LinphoneManager.this.mHandler.post(new Runnable() {
                    public void run() {
                        if (C53071.this.progress != null) {
                            C53071.this.progress.dismiss();
                        }
                        AlertDialog.Builder builder = new AlertDialog.Builder((Context) LinphoneManager.getInstance().getOpenH264DownloadHelper().getUserData(C53071.this.ctxt));
                        builder.setMessage(LinphoneManager.this.getString(C5321R.string.assistant_openh264_error));
                        builder.setCancelable(false);
                        builder.setNeutralButton(LinphoneManager.this.getString(C5321R.string.f6327ok), (DialogInterface.OnClickListener) null);
                        builder.show();
                    }
                });
            }
        };
        this.mCodecDownloader.setOpenH264HelperListener(this.mCodecListener);
    }

    public OpenH264DownloadHelperListener getOpenH264HelperListener() {
        return this.mCodecListener;
    }

    public OpenH264DownloadHelper getOpenH264DownloadHelper() {
        return this.mCodecDownloader;
    }

    public void routeAudioToSpeaker() {
        routeAudioToSpeakerHelper(true);
    }

    public String getUserAgent() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("LinphoneAndroid/" + this.mServiceContext.getPackageManager().getPackageInfo(this.mServiceContext.getPackageName(), 0).versionCode);
            sb.append(" (");
            sb.append("Linphone/" + getLc().getVersion() + "; ");
            sb.append(Build.DEVICE + " " + Build.MODEL + " Android/" + Build.VERSION.SDK_INT);
            sb.append(")");
            return sb.toString();
        } catch (PackageManager.NameNotFoundException e) {
            Log.m6903e(e);
            return null;
        }
    }

    public void routeAudioToReceiver() {
        routeAudioToSpeakerHelper(false);
    }

    public static final synchronized LinphoneManager createAndStart(Context context) {
        LinphoneManager linphoneManager;
        synchronized (LinphoneManager.class) {
            if (instance == null) {
                instance = new LinphoneManager(context);
                instance.startLibLinphone(context);
                instance.initOpenH264DownloadHelper();
                H264Helper.setH264Mode(H264Helper.MODE_AUTO, getLc());
                linphoneManager = instance;
            } else {
                throw new RuntimeException("Linphone Manager is already initialized");
            }
        }
        return linphoneManager;
    }

    public void addDownloadMessagePending(LinphoneChatMessage linphoneChatMessage) {
        synchronized (mPendingChatFileMessage) {
            mPendingChatFileMessage.add(linphoneChatMessage);
        }
    }

    public boolean isMessagePending(LinphoneChatMessage linphoneChatMessage) {
        boolean z;
        synchronized (mPendingChatFileMessage) {
            Iterator<LinphoneChatMessage> it = mPendingChatFileMessage.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getStorageId() == linphoneChatMessage.getStorageId()) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        }
        return z;
    }

    public void removePendingMessage(LinphoneChatMessage linphoneChatMessage) {
        synchronized (mPendingChatFileMessage) {
            Iterator<LinphoneChatMessage> it = mPendingChatFileMessage.iterator();
            if (it.hasNext()) {
                LinphoneChatMessage next = it.next();
                if (next.getStorageId() == linphoneChatMessage.getStorageId()) {
                    mPendingChatFileMessage.remove(next);
                }
            }
        }
    }

    public void setUploadPendingFileMessage(LinphoneChatMessage linphoneChatMessage) {
        mUploadPendingFileMessage = linphoneChatMessage;
    }

    public LinphoneChatMessage getMessageUploadPending() {
        return mUploadPendingFileMessage;
    }

    public void setUploadingImage(byte[] bArr) {
        this.mUploadingImage = bArr;
    }

    public void onLinphoneChatMessageStateChanged(LinphoneChatMessage linphoneChatMessage, LinphoneChatMessage.State state) {
        if (state == LinphoneChatMessage.State.FileTransferDone) {
            if (!linphoneChatMessage.isOutgoing() || this.mUploadingImage == null) {
                LinphoneUtils.storeImage(getContext(), linphoneChatMessage);
                removePendingMessage(linphoneChatMessage);
            } else {
                mUploadPendingFileMessage = null;
                this.mUploadingImage = null;
            }
        }
        if (state == LinphoneChatMessage.State.FileTransferError) {
            LinphoneUtils.displayErrorAlert(getString(C5321R.string.image_transfert_error), LinphoneActivity.instance());
        }
        for (LinphoneChatMessage.LinphoneChatMessageListener onLinphoneChatMessageStateChanged : simpleListeners) {
            onLinphoneChatMessageStateChanged.onLinphoneChatMessageStateChanged(linphoneChatMessage, state);
        }
    }

    public void onLinphoneChatMessageFileTransferSent(LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, int i, int i2, LinphoneBuffer linphoneBuffer) {
        byte[] bArr = this.mUploadingImage;
        if (bArr != null && i2 > 0) {
            byte[] bArr2 = new byte[i2];
            int i3 = i + i2;
            if (i3 <= bArr.length) {
                for (int i4 = 0; i4 < i2; i4++) {
                    bArr2[i4] = this.mUploadingImage[i4 + i];
                }
                linphoneBuffer.setContent(bArr2);
                linphoneBuffer.setSize(i2);
                return;
            }
            Log.m6903e("Error, upload task asking for more bytes( " + i3 + " ) than available (" + this.mUploadingImage.length + ")");
        }
    }

    public void onLinphoneChatMessageFileTransferProgressChanged(LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, int i, int i2) {
        for (LinphoneChatMessage.LinphoneChatMessageListener onLinphoneChatMessageFileTransferProgressChanged : simpleListeners) {
            onLinphoneChatMessageFileTransferProgressChanged.onLinphoneChatMessageFileTransferProgressChanged(linphoneChatMessage, linphoneContent, i, i2);
        }
    }

    private boolean isPresenceModelActivitySet() {
        LinphoneCore lcIfManagerNotDestroyedOrNull = getLcIfManagerNotDestroyedOrNull();
        if (!isInstanciated() || lcIfManagerNotDestroyedOrNull == null || lcIfManagerNotDestroyedOrNull.getPresenceModel() == null || lcIfManagerNotDestroyedOrNull.getPresenceModel().getActivity() == null) {
            return false;
        }
        return true;
    }

    public void changeStatusToOnline() {
        LinphoneCore lcIfManagerNotDestroyedOrNull = getLcIfManagerNotDestroyedOrNull();
        if (isInstanciated() && lcIfManagerNotDestroyedOrNull != null && isPresenceModelActivitySet() && lcIfManagerNotDestroyedOrNull.getPresenceModel().getActivity().getType() != PresenceActivityType.TV) {
            lcIfManagerNotDestroyedOrNull.getPresenceModel().getActivity().setType(PresenceActivityType.TV);
        } else if (isInstanciated() && lcIfManagerNotDestroyedOrNull != null && !isPresenceModelActivitySet()) {
            lcIfManagerNotDestroyedOrNull.setPresenceModel(LinphoneCoreFactory.instance().createPresenceModel(PresenceActivityType.TV, (String) null));
        }
    }

    public void changeStatusToOnThePhone() {
        LinphoneCore lcIfManagerNotDestroyedOrNull = getLcIfManagerNotDestroyedOrNull();
        if (isInstanciated() && isPresenceModelActivitySet() && lcIfManagerNotDestroyedOrNull.getPresenceModel().getActivity().getType() != PresenceActivityType.OnThePhone) {
            lcIfManagerNotDestroyedOrNull.getPresenceModel().getActivity().setType(PresenceActivityType.OnThePhone);
        } else if (isInstanciated() && !isPresenceModelActivitySet()) {
            lcIfManagerNotDestroyedOrNull.setPresenceModel(LinphoneCoreFactory.instance().createPresenceModel(PresenceActivityType.OnThePhone, (String) null));
        }
    }

    public void changeStatusToOffline() {
        LinphoneCore lcIfManagerNotDestroyedOrNull = getLcIfManagerNotDestroyedOrNull();
        if (isInstanciated() && lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.getPresenceModel().setBasicStatus(PresenceBasicStatus.Closed);
        }
    }

    public void subscribeFriendList(boolean z) {
        LinphoneCore lcIfManagerNotDestroyedOrNull = getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null && lcIfManagerNotDestroyedOrNull.getFriendList() != null && lcIfManagerNotDestroyedOrNull.getFriendList().length > 0) {
            LinphoneFriendList linphoneFriendList = lcIfManagerNotDestroyedOrNull.getFriendLists()[0];
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("Presence list subscription is ");
            sb.append(z ? ViewProps.ENABLED : ProviderServiceFragment.PRODUCT_STATE_DISABLED);
            objArr[0] = sb.toString();
            Log.m6905i(objArr);
            linphoneFriendList.enableSubscriptions(z);
        }
    }

    public static final synchronized LinphoneManager getInstance() {
        LinphoneManager linphoneManager;
        synchronized (LinphoneManager.class) {
            if (instance != null) {
                linphoneManager = instance;
            } else if (sExited) {
                throw new RuntimeException("Linphone Manager was already destroyed. Better use getLcIfManagerNotDestroyedOrNull and check returned value");
            } else {
                throw new RuntimeException("Linphone Manager should be created before accessed");
            }
        }
        return linphoneManager;
    }

    public static final synchronized LinphoneCore getLc() {
        LinphoneCore linphoneCore;
        synchronized (LinphoneManager.class) {
            linphoneCore = getInstance().mLc;
        }
        return linphoneCore;
    }

    public String getLPConfigXsdPath() {
        return this.mLPConfigXsd;
    }

    public void newOutgoingCall(AddressType addressType) {
        newOutgoingCall(addressType.getText().toString(), addressType.getDisplayedName());
    }

    public void newOutgoingCall(String str, String str2) {
        LinphoneContact findContactFromPhoneNumber;
        String presenceModelForUri;
        if (str != null) {
            if (!((str.startsWith("sip:") && str.contains("@")) || (findContactFromPhoneNumber = ContactsManager.getInstance().findContactFromPhoneNumber(str)) == null || (presenceModelForUri = findContactFromPhoneNumber.getPresenceModelForUri(str)) == null)) {
                str = presenceModelForUri;
            }
            LinphoneProxyConfig defaultProxyConfig = getLc().getDefaultProxyConfig();
            if (defaultProxyConfig != null) {
                str = defaultProxyConfig.normalizePhoneNumber(str);
            }
            boolean z = false;
            try {
                LinphoneAddress interpretUrl = this.mLc.interpretUrl(str);
                if (!this.f6319mR.getBoolean(C5321R.bool.forbid_self_call) || defaultProxyConfig == null || !interpretUrl.asStringUriOnly().equals(defaultProxyConfig.getIdentity())) {
                    interpretUrl.setDisplayName(str2);
                    boolean z2 = !LinphoneUtils.isHighBandwidthConnection(LinphoneService.instance().getApplicationContext());
                    if (this.mLc.isNetworkReachable()) {
                        try {
                            if (Version.isVideoCapable()) {
                                boolean isVideoEnabled = this.mPrefs.isVideoEnabled();
                                boolean shouldInitiateVideoCall = this.mPrefs.shouldInitiateVideoCall();
                                CallManager instance2 = CallManager.getInstance();
                                if (isVideoEnabled && shouldInitiateVideoCall) {
                                    z = true;
                                }
                                instance2.inviteAddress(interpretUrl, z, z2);
                                return;
                            }
                            CallManager.getInstance().inviteAddress(interpretUrl, false, z2);
                        } catch (LinphoneCoreException unused) {
                        }
                    } else if (LinphoneActivity.isInstanciated()) {
                        LinphoneActivity.instance().displayCustomToast(getString(C5321R.string.error_network_unreachable), 1);
                    } else {
                        Log.m6903e("Error: " + getString(C5321R.string.error_network_unreachable));
                    }
                }
            } catch (LinphoneCoreException e) {
                Log.m6903e(e);
            }
        }
    }

    private void resetCameraFromPreferences() {
        boolean useFrontCam = this.mPrefs.useFrontCam();
        int i = 0;
        for (AndroidCameraConfiguration.AndroidCamera androidCamera : AndroidCameraConfiguration.retrieveCameras()) {
            if (androidCamera.frontFacing == useFrontCam) {
                i = androidCamera.f6360id;
            }
        }
        getLc().setVideoDevice(i);
    }

    public boolean toggleEnableCamera() {
        if (!this.mLc.isIncall()) {
            return false;
        }
        boolean z = !this.mLc.getCurrentCall().cameraEnabled();
        enableCamera(this.mLc.getCurrentCall(), z);
        return z;
    }

    public void enableCamera(LinphoneCall linphoneCall, boolean z) {
        if (linphoneCall != null) {
            linphoneCall.enableCamera(z);
        }
    }

    public void sendStaticImage(boolean z) {
        if (this.mLc.isIncall()) {
            enableCamera(this.mLc.getCurrentCall(), !z);
        }
    }

    public void playDtmf(ContentResolver contentResolver, char c) {
        try {
            if (Settings.System.getInt(contentResolver, "dtmf_tone") == 0) {
                return;
            }
        } catch (Settings.SettingNotFoundException unused) {
        }
        getLc().playDtmf(c, -1);
    }

    public void terminateCall() {
        if (this.mLc.isIncall()) {
            LinphoneCore linphoneCore = this.mLc;
            linphoneCore.terminateCall(linphoneCore.getCurrentCall());
        }
    }

    public void initTunnelFromConf() {
        if (this.mLc.isTunnelAvailable()) {
            NetworkInfo activeNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo();
            this.mLc.tunnelCleanServers();
            TunnelConfig tunnelConfig = this.mPrefs.getTunnelConfig();
            if (tunnelConfig.getHost() != null) {
                this.mLc.tunnelAddServer(tunnelConfig);
                manageTunnelServer(activeNetworkInfo);
            }
        }
    }

    private boolean isTunnelNeeded(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            Log.m6905i("No connectivity: tunnel should be disabled");
            return false;
        }
        String tunnelMode = this.mPrefs.getTunnelMode();
        if (getString(C5321R.string.tunnel_mode_entry_value_always).equals(tunnelMode)) {
            return true;
        }
        if (networkInfo.getType() == 1 || !getString(C5321R.string.tunnel_mode_entry_value_3G_only).equals(tunnelMode)) {
            return false;
        }
        Log.m6905i("need tunnel: 'no wifi' connection");
        return true;
    }

    private void manageTunnelServer(NetworkInfo networkInfo) {
        LinphoneCore linphoneCore = this.mLc;
        if (linphoneCore != null && linphoneCore.isTunnelAvailable()) {
            Log.m6905i("Managing tunnel");
            if (isTunnelNeeded(networkInfo)) {
                Log.m6905i("Tunnel need to be activated");
                this.mLc.tunnelSetMode(LinphoneCore.TunnelMode.enable);
                return;
            }
            Log.m6905i("Tunnel should not be used");
            String tunnelMode = this.mPrefs.getTunnelMode();
            this.mLc.tunnelSetMode(LinphoneCore.TunnelMode.disable);
            if (getString(C5321R.string.tunnel_mode_entry_value_auto).equals(tunnelMode)) {
                this.mLc.tunnelSetMode(LinphoneCore.TunnelMode.auto);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x012c, code lost:
        org.linphone.mediastream.Log.m6903e(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0133, code lost:
        r6.mLc = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0135, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        org.linphone.mediastream.Log.m6903e(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0074, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00dc, code lost:
        if (android.os.Build.VERSION.SDK_INT > 23) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00de, code lost:
        r6.mServiceContext.unregisterReceiver(r6.mNetworkReceiver);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00e6, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        org.linphone.mediastream.Log.m6903e(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r6.mServiceContext.unregisterReceiver(r6.mHookReceiver);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00f6, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        org.linphone.mediastream.Log.m6903e(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r6.mServiceContext.unregisterReceiver(r6.mCallReceiver);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0106, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        org.linphone.mediastream.Log.m6903e(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r6.mServiceContext.unregisterReceiver(r6.mKeepAliveReceiver);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0116, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        org.linphone.mediastream.Log.m6903e(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        dozeManager(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0122, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        org.linphone.mediastream.Log.m6903e(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x012b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x0018, B:39:0x0077] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:63:0x00c2=Splitter:B:63:0x00c2, B:29:0x005c=Splitter:B:29:0x005c, B:94:0x011e=Splitter:B:94:0x011e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void destroyLinphoneCore() {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 1
            sExited = r0     // Catch:{ all -> 0x0136 }
            ContactsManagerDestroy()     // Catch:{ all -> 0x0136 }
            BluetoothManagerDestroy()     // Catch:{ all -> 0x0136 }
            r1 = 0
            r2 = 23
            r3 = 0
            java.util.Timer r4 = r6.mTimer     // Catch:{ RuntimeException -> 0x0076 }
            r4.cancel()     // Catch:{ RuntimeException -> 0x0076 }
            org.linphone.core.LinphoneCore r4 = r6.mLc     // Catch:{ RuntimeException -> 0x0076 }
            r4.destroy()     // Catch:{ RuntimeException -> 0x0076 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0024 }
            if (r4 <= r2) goto L_0x002c
            android.content.Context r2 = r6.mServiceContext     // Catch:{ Exception -> 0x0024 }
            android.content.BroadcastReceiver r4 = r6.mNetworkReceiver     // Catch:{ Exception -> 0x0024 }
            r2.unregisterReceiver(r4)     // Catch:{ Exception -> 0x0024 }
            goto L_0x002c
        L_0x0024:
            r2 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x0136 }
            r4[r3] = r2     // Catch:{ all -> 0x0136 }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r4)     // Catch:{ all -> 0x0136 }
        L_0x002c:
            android.content.Context r2 = r6.mServiceContext     // Catch:{ Exception -> 0x0034 }
            android.content.BroadcastReceiver r4 = r6.mHookReceiver     // Catch:{ Exception -> 0x0034 }
            r2.unregisterReceiver(r4)     // Catch:{ Exception -> 0x0034 }
            goto L_0x003c
        L_0x0034:
            r2 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x0136 }
            r4[r3] = r2     // Catch:{ all -> 0x0136 }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r4)     // Catch:{ all -> 0x0136 }
        L_0x003c:
            android.content.Context r2 = r6.mServiceContext     // Catch:{ Exception -> 0x0044 }
            android.content.BroadcastReceiver r4 = r6.mCallReceiver     // Catch:{ Exception -> 0x0044 }
            r2.unregisterReceiver(r4)     // Catch:{ Exception -> 0x0044 }
            goto L_0x004c
        L_0x0044:
            r2 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x0136 }
            r4[r3] = r2     // Catch:{ all -> 0x0136 }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r4)     // Catch:{ all -> 0x0136 }
        L_0x004c:
            android.content.Context r2 = r6.mServiceContext     // Catch:{ Exception -> 0x0054 }
            android.content.BroadcastReceiver r4 = r6.mKeepAliveReceiver     // Catch:{ Exception -> 0x0054 }
            r2.unregisterReceiver(r4)     // Catch:{ Exception -> 0x0054 }
            goto L_0x005c
        L_0x0054:
            r2 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x0136 }
            r4[r3] = r2     // Catch:{ all -> 0x0136 }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r4)     // Catch:{ all -> 0x0136 }
        L_0x005c:
            r6.dozeManager(r3)     // Catch:{ IllegalArgumentException -> 0x0069, Exception -> 0x0060 }
            goto L_0x0071
        L_0x0060:
            r2 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0136 }
            r0[r3] = r2     // Catch:{ all -> 0x0136 }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r0)     // Catch:{ all -> 0x0136 }
            goto L_0x0071
        L_0x0069:
            r2 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0136 }
            r0[r3] = r2     // Catch:{ all -> 0x0136 }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r0)     // Catch:{ all -> 0x0136 }
        L_0x0071:
            r6.mLc = r1     // Catch:{ all -> 0x0136 }
            goto L_0x00d8
        L_0x0074:
            r4 = move-exception
            goto L_0x00da
        L_0x0076:
            r4 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x0074 }
            r5[r3] = r4     // Catch:{ all -> 0x0074 }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r5)     // Catch:{ all -> 0x0074 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x008a }
            if (r4 <= r2) goto L_0x0092
            android.content.Context r2 = r6.mServiceContext     // Catch:{ Exception -> 0x008a }
            android.content.BroadcastReceiver r4 = r6.mNetworkReceiver     // Catch:{ Exception -> 0x008a }
            r2.unregisterReceiver(r4)     // Catch:{ Exception -> 0x008a }
            goto L_0x0092
        L_0x008a:
            r2 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x0136 }
            r4[r3] = r2     // Catch:{ all -> 0x0136 }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r4)     // Catch:{ all -> 0x0136 }
        L_0x0092:
            android.content.Context r2 = r6.mServiceContext     // Catch:{ Exception -> 0x009a }
            android.content.BroadcastReceiver r4 = r6.mHookReceiver     // Catch:{ Exception -> 0x009a }
            r2.unregisterReceiver(r4)     // Catch:{ Exception -> 0x009a }
            goto L_0x00a2
        L_0x009a:
            r2 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x0136 }
            r4[r3] = r2     // Catch:{ all -> 0x0136 }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r4)     // Catch:{ all -> 0x0136 }
        L_0x00a2:
            android.content.Context r2 = r6.mServiceContext     // Catch:{ Exception -> 0x00aa }
            android.content.BroadcastReceiver r4 = r6.mCallReceiver     // Catch:{ Exception -> 0x00aa }
            r2.unregisterReceiver(r4)     // Catch:{ Exception -> 0x00aa }
            goto L_0x00b2
        L_0x00aa:
            r2 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x0136 }
            r4[r3] = r2     // Catch:{ all -> 0x0136 }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r4)     // Catch:{ all -> 0x0136 }
        L_0x00b2:
            android.content.Context r2 = r6.mServiceContext     // Catch:{ Exception -> 0x00ba }
            android.content.BroadcastReceiver r4 = r6.mKeepAliveReceiver     // Catch:{ Exception -> 0x00ba }
            r2.unregisterReceiver(r4)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00c2
        L_0x00ba:
            r2 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x0136 }
            r4[r3] = r2     // Catch:{ all -> 0x0136 }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r4)     // Catch:{ all -> 0x0136 }
        L_0x00c2:
            r6.dozeManager(r3)     // Catch:{ IllegalArgumentException -> 0x00cf, Exception -> 0x00c6 }
            goto L_0x0071
        L_0x00c6:
            r2 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0136 }
            r0[r3] = r2     // Catch:{ all -> 0x0136 }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r0)     // Catch:{ all -> 0x0136 }
            goto L_0x0071
        L_0x00cf:
            r2 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0136 }
            r0[r3] = r2     // Catch:{ all -> 0x0136 }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r0)     // Catch:{ all -> 0x0136 }
            goto L_0x0071
        L_0x00d8:
            monitor-exit(r6)
            return
        L_0x00da:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00e6 }
            if (r5 <= r2) goto L_0x00ee
            android.content.Context r2 = r6.mServiceContext     // Catch:{ Exception -> 0x00e6 }
            android.content.BroadcastReceiver r5 = r6.mNetworkReceiver     // Catch:{ Exception -> 0x00e6 }
            r2.unregisterReceiver(r5)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x00ee
        L_0x00e6:
            r2 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x0136 }
            r5[r3] = r2     // Catch:{ all -> 0x0136 }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r5)     // Catch:{ all -> 0x0136 }
        L_0x00ee:
            android.content.Context r2 = r6.mServiceContext     // Catch:{ Exception -> 0x00f6 }
            android.content.BroadcastReceiver r5 = r6.mHookReceiver     // Catch:{ Exception -> 0x00f6 }
            r2.unregisterReceiver(r5)     // Catch:{ Exception -> 0x00f6 }
            goto L_0x00fe
        L_0x00f6:
            r2 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x0136 }
            r5[r3] = r2     // Catch:{ all -> 0x0136 }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r5)     // Catch:{ all -> 0x0136 }
        L_0x00fe:
            android.content.Context r2 = r6.mServiceContext     // Catch:{ Exception -> 0x0106 }
            android.content.BroadcastReceiver r5 = r6.mCallReceiver     // Catch:{ Exception -> 0x0106 }
            r2.unregisterReceiver(r5)     // Catch:{ Exception -> 0x0106 }
            goto L_0x010e
        L_0x0106:
            r2 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x0136 }
            r5[r3] = r2     // Catch:{ all -> 0x0136 }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r5)     // Catch:{ all -> 0x0136 }
        L_0x010e:
            android.content.Context r2 = r6.mServiceContext     // Catch:{ Exception -> 0x0116 }
            android.content.BroadcastReceiver r5 = r6.mKeepAliveReceiver     // Catch:{ Exception -> 0x0116 }
            r2.unregisterReceiver(r5)     // Catch:{ Exception -> 0x0116 }
            goto L_0x011e
        L_0x0116:
            r2 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x0136 }
            r5[r3] = r2     // Catch:{ all -> 0x0136 }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r5)     // Catch:{ all -> 0x0136 }
        L_0x011e:
            r6.dozeManager(r3)     // Catch:{ IllegalArgumentException -> 0x012b, Exception -> 0x0122 }
            goto L_0x0133
        L_0x0122:
            r2 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0136 }
            r0[r3] = r2     // Catch:{ all -> 0x0136 }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r0)     // Catch:{ all -> 0x0136 }
            goto L_0x0133
        L_0x012b:
            r2 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0136 }
            r0[r3] = r2     // Catch:{ all -> 0x0136 }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r0)     // Catch:{ all -> 0x0136 }
        L_0x0133:
            r6.mLc = r1     // Catch:{ all -> 0x0136 }
            throw r4     // Catch:{ all -> 0x0136 }
        L_0x0136:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.LinphoneManager.destroyLinphoneCore():void");
    }

    public void restartLinphoneCore() {
        destroyLinphoneCore();
        startLibLinphone(this.mServiceContext);
        sExited = false;
    }

    private synchronized void startLibLinphone(Context context) {
        try {
            copyAssetsFromPackage();
            this.mLc = LinphoneCoreFactory.instance().createLinphoneCore(this, this.mLinphoneConfigFile, this.mLinphoneFactoryConfigFile, (Object) null, context);
            C53102 r1 = new TimerTask() {
                public void run() {
                    UIThreadDispatcher.dispatch(new Runnable() {
                        public void run() {
                            if (LinphoneManager.this.mLc != null) {
                                LinphoneManager.this.mLc.iterate();
                            }
                        }
                    });
                }
            };
            this.mTimer = new Timer("Linphone scheduler");
            this.mTimer.schedule(r1, 0, 20);
        } catch (Exception e) {
            Log.m6903e(e, "Cannot start linphone");
        }
        return;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void initPushNotificationsService() {
        /*
            r9 = this;
            int r0 = org.linphone.C5321R.string.push_type
            java.lang.String r0 = r9.getString(r0)
            java.lang.String r1 = "google"
            boolean r0 = r0.equals(r1)
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "com.google.android.gcm.GCMRegistrar"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.String r4 = "checkDevice"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r3] = r6     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.reflect.Method r4 = r0.getMethod(r4, r5)     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            android.content.Context r6 = r9.mServiceContext     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            r5[r3] = r6     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            r4.invoke(r1, r5)     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            r4 = 2
            java.lang.String r5 = "checkManifest"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ IllegalStateException -> 0x0043 }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r3] = r7     // Catch:{ IllegalStateException -> 0x0043 }
            java.lang.reflect.Method r5 = r0.getMethod(r5, r6)     // Catch:{ IllegalStateException -> 0x0043 }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ IllegalStateException -> 0x0043 }
            android.content.Context r7 = r9.mServiceContext     // Catch:{ IllegalStateException -> 0x0043 }
            r6[r3] = r7     // Catch:{ IllegalStateException -> 0x0043 }
            r5.invoke(r1, r6)     // Catch:{ IllegalStateException -> 0x0043 }
            goto L_0x004f
        L_0x0043:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.String r7 = "[Push Notification] No receiver found"
            r6[r3] = r7     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            r6[r2] = r5     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r6)     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
        L_0x004f:
            java.lang.String r5 = "getRegistrationId"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r3] = r7     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.reflect.Method r5 = r0.getMethod(r5, r6)     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            android.content.Context r7 = r9.mServiceContext     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            r6[r3] = r7     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.Object r5 = r5.invoke(r1, r6)     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            android.content.Context r6 = r9.mServiceContext     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            int r7 = org.linphone.C5321R.string.push_sender_id     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.String r6 = r6.getString(r7)     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            org.linphone.LinphonePreferences r7 = org.linphone.LinphonePreferences.instance()     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.String r7 = r7.getPushNotificationRegistrationID()     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.String r8 = ""
            boolean r8 = r5.equals(r8)     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            if (r8 != 0) goto L_0x00a9
            if (r7 == 0) goto L_0x00a9
            boolean r7 = r7.equals(r6)     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            if (r7 != 0) goto L_0x0088
            goto L_0x00a9
        L_0x0088:
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            r1.<init>()     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.String r4 = "[Push Notification] Already registered with id = "
            r1.append(r4)     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            r1.append(r5)     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.String r1 = r1.toString()     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            r0[r3] = r1     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            org.linphone.mediastream.Log.m6905i((java.lang.Object[]) r0)     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            org.linphone.LinphonePreferences r0 = org.linphone.LinphonePreferences.instance()     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            r0.setPushNotificationRegistrationID(r5)     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            goto L_0x0152
        L_0x00a9:
            java.lang.String r5 = "register"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r7[r3] = r8     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.Class<java.lang.String[]> r8 = java.lang.String[].class
            r7[r2] = r8     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.reflect.Method r0 = r0.getMethod(r5, r7)     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            android.content.Context r5 = r9.mServiceContext     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            r4[r3] = r5     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            r5[r3] = r6     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            r4[r2] = r5     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            r0.invoke(r1, r4)     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            r1.<init>()     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.String r4 = "[Push Notification] Storing current sender id = "
            r1.append(r4)     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            r1.append(r6)     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            java.lang.String r1 = r1.toString()     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            r0[r3] = r1     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            org.linphone.mediastream.Log.m6905i((java.lang.Object[]) r0)     // Catch:{ UnsupportedOperationException -> 0x00eb, Exception -> 0x00e1 }
            goto L_0x0152
        L_0x00e1:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "[Push Notification] Assuming GCM jar is not provided."
            r0[r3] = r1
            org.linphone.mediastream.Log.m6905i((java.lang.Object[]) r0)
            goto L_0x0152
        L_0x00eb:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "[Push Notification] Not activated"
            r0[r3] = r1
            org.linphone.mediastream.Log.m6905i((java.lang.Object[]) r0)
            goto L_0x0152
        L_0x00f5:
            int r0 = org.linphone.C5321R.string.push_type
            java.lang.String r0 = r9.getString(r0)
            java.lang.String r4 = "firebase"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0152
            java.lang.String r0 = "com.google.firebase.iid.FirebaseInstanceId"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r4 = "getInstance"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0149 }
            java.lang.reflect.Method r4 = r0.getMethod(r4, r5)     // Catch:{ Exception -> 0x0149 }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0149 }
            java.lang.Object r1 = r4.invoke(r1, r5)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r4 = "getToken"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0149 }
            java.lang.reflect.Method r0 = r0.getMethod(r4, r5)     // Catch:{ Exception -> 0x0149 }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0149 }
            java.lang.Object r0 = r0.invoke(r1, r4)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0149 }
            if (r0 == 0) goto L_0x0152
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0149 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0149 }
            r4.<init>()     // Catch:{ Exception -> 0x0149 }
            java.lang.String r5 = "[Push Notification] current token is: "
            r4.append(r5)     // Catch:{ Exception -> 0x0149 }
            r4.append(r0)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0149 }
            r1[r3] = r4     // Catch:{ Exception -> 0x0149 }
            org.linphone.mediastream.Log.m6905i((java.lang.Object[]) r1)     // Catch:{ Exception -> 0x0149 }
            org.linphone.LinphonePreferences r1 = org.linphone.LinphonePreferences.instance()     // Catch:{ Exception -> 0x0149 }
            r1.setPushNotificationRegistrationID(r0)     // Catch:{ Exception -> 0x0149 }
            goto L_0x0152
        L_0x0149:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "[Push Notification] firebase not available."
            r0[r3] = r1
            org.linphone.mediastream.Log.m6905i((java.lang.Object[]) r0)
        L_0x0152:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.LinphoneManager.initPushNotificationsService():void");
    }

    private synchronized void initLiblinphone(LinphoneCore linphoneCore) throws LinphoneCoreException {
        this.mLc = linphoneCore;
        PreferencesMigrator preferencesMigrator = new PreferencesMigrator(this.mServiceContext);
        preferencesMigrator.migrateRemoteProvisioningUriIfNeeded();
        preferencesMigrator.migrateSharingServerUrlIfNeeded();
        preferencesMigrator.doPresenceMigrationIfNeeded();
        if (preferencesMigrator.isMigrationNeeded()) {
            preferencesMigrator.doMigration();
        }
        LinphoneCore linphoneCore2 = this.mLc;
        linphoneCore2.setZrtpSecretsCache(this.basePath + "/zrtp_secrets");
        try {
            String str = this.mServiceContext.getPackageManager().getPackageInfo(this.mServiceContext.getPackageName(), 0).versionName;
            if (str == null) {
                str = String.valueOf(this.mServiceContext.getPackageManager().getPackageInfo(this.mServiceContext.getPackageName(), 0).versionCode);
            }
            this.mLc.setUserAgent("LinphoneAndroid", str);
        } catch (PackageManager.NameNotFoundException e) {
            Log.m6903e(e, "cannot get version name");
        }
        this.mLc.setRingback(this.mRingbackSoundFile);
        this.mLc.setRootCA(this.mLinphoneRootCaFile);
        this.mLc.setPlayFile(this.mPauseSoundFile);
        this.mLc.setChatDatabasePath(this.mChatDatabaseFile);
        this.mLc.setCallLogsDatabasePath(this.mCallLogDatabaseFile);
        this.mLc.setFriendsDatabasePath(this.mFriendsDatabaseFile);
        this.mLc.setUserCertificatesPath(this.mUserCertificatePath);
        enableDeviceRingtone(this.mPrefs.isDeviceRingtoneEnabled());
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        Log.m6907w("MediaStreamer : " + availableProcessors + " cores detected and configured");
        this.mLc.setCpuCount(availableProcessors);
        this.mLc.migrateCallLogs();
        this.mServiceContext.getResources().getBoolean(C5321R.bool.enable_push_id);
        this.mKeepAliveIntentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
        this.mKeepAliveIntentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.mKeepAliveReceiver = new KeepAliveReceiver();
        this.mServiceContext.registerReceiver(this.mKeepAliveReceiver, this.mKeepAliveIntentFilter);
        this.mCallIntentFilter = new IntentFilter("android.intent.action.ACTION_NEW_OUTGOING_CALL");
        this.mCallIntentFilter.setPriority(99999999);
        this.mCallReceiver = new OutgoingCallReceiver();
        try {
            this.mServiceContext.registerReceiver(this.mCallReceiver, this.mCallIntentFilter);
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        }
        this.mProximityWakelock = this.mPowerManager.newWakeLock(32, "manager_proximity_sensor");
        if (Build.VERSION.SDK_INT >= 23) {
            this.mDozeIntentFilter = new IntentFilter();
            this.mDozeIntentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            this.mDozeReceiver = new DozeReceiver();
            this.dozeModeEnabled = ((PowerManager) this.mServiceContext.getSystemService("power")).isDeviceIdleMode();
            this.mServiceContext.registerReceiver(this.mDozeReceiver, this.mDozeIntentFilter);
        }
        this.mHookIntentFilter = new IntentFilter("com.base.module.phone.HOOKEVENT");
        this.mHookIntentFilter.setPriority(RoomDatabase.MAX_BIND_PARAMETER_CNT);
        this.mHookReceiver = new HookReceiver();
        this.mServiceContext.registerReceiver(this.mHookReceiver, this.mHookIntentFilter);
        if (Build.VERSION.SDK_INT > 23) {
            this.mNetworkReceiver = new NetworkManager();
            this.mNetworkIntentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            this.mServiceContext.registerReceiver(this.mNetworkReceiver, this.mNetworkIntentFilter);
        }
        updateNetworkReachability();
        resetCameraFromPreferences();
        this.accountCreator = LinphoneCoreFactory.instance().createAccountCreator(getLc(), LinphonePreferences.instance().getXmlrpcUrl());
        this.accountCreator.setListener(this);
        this.callGsmON = false;
    }

    /* access modifiers changed from: protected */
    public void setHandsetMode(Boolean bool) {
        if (this.mLc.isInComingInvitePending() && bool.booleanValue()) {
            this.handsetON = true;
            try {
                this.mLc.acceptCall(this.mLc.getCurrentCall());
                LinphoneActivity.instance().startIncallActivity(this.mLc.getCurrentCall());
            } catch (LinphoneCoreException unused) {
            }
        } else if (bool.booleanValue() && CallActivity.isInstanciated()) {
            this.handsetON = true;
            CallActivity.instance().setSpeakerEnabled(true);
            CallActivity.instance().refreshInCallActions();
        } else if (!bool.booleanValue()) {
            this.handsetON = false;
            getInstance().terminateCall();
        }
    }

    /* access modifiers changed from: protected */
    public boolean isHansetModeOn() {
        return this.handsetON;
    }

    private void copyAssetsFromPackage() throws IOException {
        copyIfNotExist(C5321R.raw.notes_of_the_optimistic, this.mRingSoundFile);
        copyIfNotExist(C5321R.raw.ringback, this.mRingbackSoundFile);
        copyIfNotExist(C5321R.raw.hold, this.mPauseSoundFile);
        copyIfNotExist(C5321R.raw.incoming_chat, this.mErrorToneFile);
        copyIfNotExist(C5321R.raw.linphonerc_default, this.mLinphoneConfigFile);
        copyFromPackage(C5321R.raw.linphonerc_factory, new File(this.mLinphoneFactoryConfigFile).getName());
        copyIfNotExist(C5321R.raw.lpconfig, this.mLPConfigXsd);
        copyFromPackage(C5321R.raw.rootca, new File(this.mLinphoneRootCaFile).getName());
        copyFromPackage(C5321R.raw.assistant_create, new File(this.mDynamicConfigFile).getName());
    }

    public void copyIfNotExist(int i, String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            copyFromPackage(i, file.getName());
        }
    }

    public void copyFromPackage(int i, String str) throws IOException {
        FileOutputStream openFileOutput = this.mServiceContext.openFileOutput(str, 0);
        InputStream openRawResource = this.f6319mR.openRawResource(i);
        byte[] bArr = new byte[8048];
        while (true) {
            int read = openRawResource.read(bArr);
            if (read != -1) {
                openFileOutput.write(bArr, 0, read);
            } else {
                openFileOutput.flush();
                openFileOutput.close();
                openRawResource.close();
                return;
            }
        }
    }

    public boolean detectVideoCodec(String str) {
        for (PayloadType mime : this.mLc.getVideoCodecs()) {
            if (str.equals(mime.getMime())) {
                return true;
            }
        }
        return false;
    }

    public boolean detectAudioCodec(String str) {
        for (PayloadType mime : this.mLc.getAudioCodecs()) {
            if (str.equals(mime.getMime())) {
                return true;
            }
        }
        return false;
    }

    public void updateNetworkReachability() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = this.mConnectivityManager;
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            if (activeNetworkInfo == null && Version.sdkAboveOrEqual(21)) {
                Network[] allNetworks = this.mConnectivityManager.getAllNetworks();
                int length = allNetworks.length;
                networkInfo = activeNetworkInfo;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Network network = allNetworks[i];
                        if (network != null && (networkInfo = this.mConnectivityManager.getNetworkInfo(network)) != null && networkInfo.isConnected()) {
                            z = true;
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            } else {
                networkInfo = activeNetworkInfo;
            }
            if (networkInfo == null || !z) {
                Log.m6905i("No connectivity: setting network unreachable");
                this.mLc.setNetworkReachable(false);
            } else if (this.dozeModeEnabled) {
                Log.m6905i("Doze Mode enabled: shutting down network");
                this.mLc.setNetworkReachable(false);
            } else if (z) {
                manageTunnelServer(networkInfo);
                if (!LinphonePreferences.instance().isWifiOnlyEnabled()) {
                    int type = networkInfo.getType();
                    if (type != this.mLastNetworkType) {
                        Log.m6905i("Connectivity has changed.");
                        this.mLc.setNetworkReachable(false);
                    }
                    this.mLc.setNetworkReachable(true);
                    this.mLastNetworkType = type;
                } else if (networkInfo.getType() == 1) {
                    this.mLc.setNetworkReachable(true);
                } else {
                    Log.m6905i("Wifi-only mode, setting network not reachable");
                    this.mLc.setNetworkReachable(false);
                }
            }
            if (this.mLc.isNetworkReachable()) {
                LinphonePreferences.instance().setPushNotificationEnabled(false);
            }
        }
    }

    private void doDestroy() {
        BluetoothManagerDestroy();
        try {
            this.mTimer.cancel();
            this.mLc.destroy();
            try {
                if (Build.VERSION.SDK_INT > 23) {
                    this.mServiceContext.unregisterReceiver(this.mNetworkReceiver);
                }
            } catch (Exception e) {
                Log.m6903e(e);
            }
            try {
                this.mServiceContext.unregisterReceiver(this.mHookReceiver);
            } catch (Exception e2) {
                Log.m6903e(e2);
            }
            try {
                this.mServiceContext.unregisterReceiver(this.mKeepAliveReceiver);
            } catch (Exception e3) {
                Log.m6903e(e3);
            }
            try {
                this.mServiceContext.unregisterReceiver(this.mCallReceiver);
            } catch (Exception e4) {
                Log.m6903e(e4);
            }
            try {
                dozeManager(false);
            } catch (IllegalArgumentException e5) {
                Log.m6903e(e5);
            } catch (Exception e6) {
                Log.m6903e(e6);
            }
        } catch (RuntimeException e7) {
            Log.m6903e(e7);
            try {
                if (Build.VERSION.SDK_INT > 23) {
                    this.mServiceContext.unregisterReceiver(this.mNetworkReceiver);
                }
            } catch (Exception e8) {
                Log.m6903e(e8);
            }
            try {
                this.mServiceContext.unregisterReceiver(this.mHookReceiver);
            } catch (Exception e9) {
                Log.m6903e(e9);
            }
            try {
                this.mServiceContext.unregisterReceiver(this.mKeepAliveReceiver);
            } catch (Exception e10) {
                Log.m6903e(e10);
            }
            try {
                this.mServiceContext.unregisterReceiver(this.mCallReceiver);
            } catch (Exception e11) {
                Log.m6903e(e11);
            }
            try {
                dozeManager(false);
            } catch (IllegalArgumentException e12) {
                Log.m6903e(e12);
            } catch (Exception e13) {
                Log.m6903e(e13);
            }
        } catch (Throwable th) {
            try {
                if (Build.VERSION.SDK_INT > 23) {
                    this.mServiceContext.unregisterReceiver(this.mNetworkReceiver);
                }
            } catch (Exception e14) {
                Log.m6903e(e14);
            }
            try {
                this.mServiceContext.unregisterReceiver(this.mHookReceiver);
            } catch (Exception e15) {
                Log.m6903e(e15);
            }
            try {
                this.mServiceContext.unregisterReceiver(this.mKeepAliveReceiver);
            } catch (Exception e16) {
                Log.m6903e(e16);
            }
            try {
                this.mServiceContext.unregisterReceiver(this.mCallReceiver);
            } catch (Exception e17) {
                Log.m6903e(e17);
            }
            try {
                dozeManager(false);
            } catch (IllegalArgumentException e18) {
                Log.m6903e(e18);
            } catch (Exception e19) {
                Log.m6903e(e19);
            }
            this.mLc = null;
            instance = null;
            throw th;
        }
        this.mLc = null;
        instance = null;
    }

    public void dozeManager(boolean z) {
        if (z) {
            Log.m6905i("[Doze Mode]: register");
            this.mServiceContext.registerReceiver(this.mDozeReceiver, this.mDozeIntentFilter);
            this.dozeModeEnabled = true;
            return;
        }
        Log.m6905i("[Doze Mode]: unregister");
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                this.mServiceContext.unregisterReceiver(this.mDozeReceiver);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        this.dozeModeEnabled = false;
    }

    public void enableProximitySensing(boolean z) {
        if (z) {
            if (!this.mProximitySensingEnabled) {
                this.mSensorManager.registerListener(this, this.mProximity, 3);
                this.mProximitySensingEnabled = true;
            }
        } else if (this.mProximitySensingEnabled) {
            this.mSensorManager.unregisterListener(this);
            this.mProximitySensingEnabled = false;
            if (this.mProximityWakelock.isHeld()) {
                this.mProximityWakelock.release();
            }
        }
    }

    public static Boolean isProximitySensorNearby(SensorEvent sensorEvent) {
        boolean z = false;
        float f = sensorEvent.values[0];
        float maximumRange = sensorEvent.sensor.getMaximumRange();
        Log.m6901d("Proximity sensor report [" + f + "] , for max range [" + maximumRange + "]");
        if (maximumRange > 4.001f) {
            maximumRange = 4.001f;
        }
        if (f < maximumRange) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.timestamp != 0) {
            if (isProximitySensorNearby(sensorEvent).booleanValue()) {
                if (!this.mProximityWakelock.isHeld()) {
                    this.mProximityWakelock.acquire();
                }
            } else if (this.mProximityWakelock.isHeld()) {
                this.mProximityWakelock.release();
            }
        }
    }

    public static void ContactsManagerDestroy() {
        LinphoneManager linphoneManager = instance;
        if (linphoneManager != null && linphoneManager.mServiceContext != null) {
            ContactsManager.getInstance().destroy();
        }
    }

    public static void BluetoothManagerDestroy() {
        BluetoothManager.getInstance().destroy();
    }

    public static synchronized void destroy() {
        synchronized (LinphoneManager.class) {
            if (instance != null) {
                getInstance().changeStatusToOffline();
                sExited = true;
                instance.doDestroy();
            }
        }
    }

    /* access modifiers changed from: private */
    public String getString(int i) {
        return this.f6319mR.getString(i);
    }

    public void connectivityChanged(ConnectivityManager connectivityManager, boolean z) {
        updateNetworkReachability();
    }

    public void notifyPresenceReceived(LinphoneCore linphoneCore, LinphoneFriend linphoneFriend) {
        ContactsManager.getInstance().refreshSipContact(linphoneFriend);
    }

    public void dtmfReceived(LinphoneCore linphoneCore, LinphoneCall linphoneCall, int i) {
        Log.m6901d("DTMF received: " + i);
    }

    public void messageReceived(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom, LinphoneChatMessage linphoneChatMessage) {
        if (!this.mServiceContext.getResources().getBoolean(C5321R.bool.disable_chat)) {
            LinphoneAddress from = linphoneChatMessage.getFrom();
            linphoneChatMessage.getTo().asString();
            if (linphoneChatMessage.getFileTransferInformation() != null) {
                getString(C5321R.string.content_description_incoming_file);
            } else {
                linphoneChatMessage.getText();
            }
            try {
                ContactsManager.getInstance().findContactFromAddress(from);
                this.mServiceContext.getResources().getBoolean(C5321R.bool.disable_chat_message_notification);
            } catch (Exception e) {
                Log.m6903e(e);
            }
        }
    }

    public void messageReceivedUnableToDecrypted(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom, LinphoneChatMessage linphoneChatMessage) {
        if (!this.mServiceContext.getResources().getBoolean(C5321R.bool.disable_chat)) {
            final LinphoneAddress from = linphoneChatMessage.getFrom();
            linphoneChatMessage.getTo().asString();
            try {
                final LinphoneContact findContactFromAddress = ContactsManager.getInstance().findContactFromAddress(from);
                if (LinphoneActivity.instance().isOnBackground()) {
                    boolean z = this.mServiceContext.getResources().getBoolean(C5321R.bool.disable_chat_message_notification);
                } else if (!this.mAreDisplayAlertMessage) {
                    this.mAreDisplayAlertMessage = true;
                    final Dialog displayDialog = LinphoneActivity.instance().displayDialog(getString(C5321R.string.message_cant_be_decrypted).replace("%s", findContactFromAddress != null ? findContactFromAddress.getFullName() : from.getUserName()));
                    Button button = (Button) displayDialog.findViewById(C5321R.C5324id.delete_button);
                    button.setText(getString(C5321R.string.call));
                    Button button2 = (Button) displayDialog.findViewById(C5321R.C5324id.cancel);
                    button2.setText(getString(C5321R.string.f6327ok));
                    button.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            LinphoneManager instance = LinphoneManager.getInstance();
                            String asStringUriOnly = from.asStringUriOnly();
                            LinphoneContact linphoneContact = findContactFromAddress;
                            instance.newOutgoingCall(asStringUriOnly, linphoneContact != null ? linphoneContact.getFullName() : from.getUserName());
                            displayDialog.dismiss();
                            LinphoneManager.getInstance().setAreDisplayAlertMessage(false);
                        }
                    });
                    button2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            displayDialog.dismiss();
                            LinphoneManager.getInstance().setAreDisplayAlertMessage(false);
                        }
                    });
                    if (getLc().getLimeEncryption() == LinphoneCore.LinphoneLimeState.Mandatory) {
                        displayDialog.show();
                    }
                }
            } catch (Exception e) {
                Log.m6903e(e);
            }
        }
    }

    public void setAreDisplayAlertMessage(boolean z) {
        this.mAreDisplayAlertMessage = z;
    }

    public String getLastLcStatusMessage() {
        return this.lastLcStatusMessage;
    }

    public void displayStatus(LinphoneCore linphoneCore, String str) {
        Log.m6905i(str);
        this.lastLcStatusMessage = str;
    }

    public void globalState(LinphoneCore linphoneCore, LinphoneCore.GlobalState globalState, String str) {
        Log.m6905i("New global state [", globalState, "]");
        if (globalState == LinphoneCore.GlobalState.GlobalOn) {
            try {
                Log.m6903e("LinphoneManager", " globalState ON");
                initLiblinphone(linphoneCore);
            } catch (IllegalArgumentException e) {
                Log.m6903e(e);
            } catch (LinphoneCoreException e2) {
                Log.m6903e(e2);
            }
        }
    }

    public void registrationState(LinphoneCore linphoneCore, LinphoneProxyConfig linphoneProxyConfig, LinphoneCore.RegistrationState registrationState, String str) {
        Log.m6905i("New registration state [" + registrationState + "]");
        if (getLc().getDefaultProxyConfig() == null) {
            subscribeFriendList(false);
        }
    }

    public Context getContext() {
        try {
            if (LinphoneActivity.isInstanciated()) {
                return LinphoneActivity.instance();
            }
            if (CallActivity.isInstanciated()) {
                return CallActivity.instance();
            }
            if (CallIncomingActivity.isInstanciated()) {
                return CallIncomingActivity.instance();
            }
            if (this.mServiceContext != null) {
                return this.mServiceContext;
            }
            if (LinphoneService.isReady()) {
                return LinphoneService.instance().getApplicationContext();
            }
            return null;
        } catch (Exception e) {
            Log.m6903e(e);
            return null;
        }
    }

    public void setAudioManagerInCallMode() {
        if (this.mAudioManager.getMode() == 3) {
            Log.m6907w("[AudioManager] already in MODE_IN_COMMUNICATION, skipping...");
            return;
        }
        Log.m6901d("[AudioManager] Mode: MODE_IN_COMMUNICATION");
        this.mAudioManager.setMode(3);
    }

    public void callState(LinphoneCore linphoneCore, final LinphoneCall linphoneCall, LinphoneCall.State state, String str) {
        Log.m6905i("New call state [", state, "]");
        if (state != LinphoneCall.State.IncomingReceived || linphoneCall.equals(linphoneCore.getCurrentCall()) || linphoneCall.getReplacedCall() == null) {
            if (state == LinphoneCall.State.IncomingReceived && getCallGsmON()) {
                LinphoneCore linphoneCore2 = this.mLc;
                if (linphoneCore2 != null) {
                    linphoneCore2.declineCall(linphoneCall, Reason.Busy);
                }
            } else if (state == LinphoneCall.State.IncomingReceived && LinphonePreferences.instance().isAutoAnswerEnabled() && !getCallGsmON()) {
                C53145 r6 = new TimerTask() {
                    public void run() {
                        if (LinphoneManager.this.mLc != null) {
                            try {
                                if (LinphoneManager.this.mLc.getCallsNb() > 0) {
                                    LinphoneManager.this.mLc.acceptCall(linphoneCall);
                                    if (LinphoneManager.getInstance() != null) {
                                        LinphoneManager.getInstance().routeAudioToReceiver();
                                        if (LinphoneActivity.instance() != null) {
                                            LinphoneActivity.instance().startIncallActivity(linphoneCall);
                                        }
                                    }
                                }
                            } catch (LinphoneCoreException e) {
                                Log.m6903e(e);
                            }
                        }
                    }
                };
                this.mTimer = new Timer("Auto answer");
                this.mTimer.schedule(r6, (long) this.mPrefs.getAutoAnswerTime());
            } else if (state == LinphoneCall.State.IncomingReceived || (state == LinphoneCall.State.CallIncomingEarlyMedia && this.f6319mR.getBoolean(C5321R.bool.allow_ringing_while_early_media))) {
                if (this.mLc.getCallsNb() == 1) {
                    requestAudioFocus(2);
                    this.ringingCall = linphoneCall;
                    startRinging();
                }
            } else if (linphoneCall == this.ringingCall && this.isRinging) {
                stopRinging();
            }
            if (state == LinphoneCall.State.Connected) {
                if (this.mLc.getCallsNb() == 1 && linphoneCall.getDirection() == CallDirection.Incoming) {
                    setAudioManagerInCallMode();
                    requestAudioFocus(0);
                }
                if (Hacks.needSoftvolume()) {
                    Log.m6907w("Using soft volume audio hack");
                    adjustVolume(0);
                }
            }
            if ((state == LinphoneCall.State.CallEnd || state == LinphoneCall.State.Error) && this.mLc.getCallsNb() == 0) {
                enableProximitySensing(false);
                Context context = getContext();
                if (this.mAudioFocused) {
                    int abandonAudioFocus = this.mAudioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
                    Object[] objArr = new Object[1];
                    StringBuilder sb = new StringBuilder();
                    sb.append("Audio focus released a bit later: ");
                    sb.append(abandonAudioFocus == 1 ? "Granted" : "Denied");
                    objArr[0] = sb.toString();
                    Log.m6901d(objArr);
                    this.mAudioFocused = false;
                }
                if (context != null && ((TelephonyManager) context.getSystemService("phone")).getCallState() == 0) {
                    Log.m6901d("---AudioManager: back to MODE_NORMAL");
                    this.mAudioManager.setMode(0);
                    Log.m6901d("All call terminated, routing back to earpiece");
                    routeAudioToReceiver();
                }
            }
            if (state == LinphoneCall.State.CallUpdatedByRemote) {
                boolean videoEnabled = linphoneCall.getRemoteParams().getVideoEnabled();
                boolean videoEnabled2 = linphoneCall.getCurrentParams().getVideoEnabled();
                boolean shouldAutomaticallyAcceptVideoRequests = LinphonePreferences.instance().shouldAutomaticallyAcceptVideoRequests();
                if (videoEnabled && !videoEnabled2 && !shouldAutomaticallyAcceptVideoRequests && !getLc().isInConference()) {
                    try {
                        getLc().deferCallUpdate(linphoneCall);
                    } catch (LinphoneCoreException e) {
                        Log.m6903e(e);
                    }
                }
            }
            if (state == LinphoneCall.State.OutgoingInit) {
                setAudioManagerInCallMode();
                requestAudioFocus(0);
                startBluetooth();
            }
            if (state == LinphoneCall.State.StreamsRunning) {
                startBluetooth();
                setAudioManagerInCallMode();
            }
        }
    }

    public void startBluetooth() {
        if (BluetoothManager.getInstance().isBluetoothHeadsetAvailable()) {
            BluetoothManager.getInstance().routeAudioToBluetooth();
        }
    }

    public void startEcCalibration(LinphoneCoreListener linphoneCoreListener) throws LinphoneCoreException {
        routeAudioToSpeaker();
        setAudioManagerInCallMode();
        Log.m6905i("Set audio mode on 'Voice Communication'");
        requestAudioFocus(0);
        int streamVolume = this.mAudioManager.getStreamVolume(0);
        this.mAudioManager.setStreamVolume(0, this.mAudioManager.getStreamMaxVolume(0), 0);
        this.mLc.startEchoCalibration(linphoneCoreListener);
        this.mAudioManager.setStreamVolume(0, streamVolume, 0);
    }

    public int startEchoTester() throws LinphoneCoreException {
        routeAudioToSpeaker();
        setAudioManagerInCallMode();
        Log.m6905i("Set audio mode on 'Voice Communication'");
        requestAudioFocus(0);
        int streamVolume = this.mAudioManager.getStreamVolume(0);
        this.mAudioManager.setStreamVolume(0, this.mAudioManager.getStreamMaxVolume(0), 0);
        int startEchoTester = this.mLc.startEchoTester(Build.VERSION.SDK_INT >= 19 ? Integer.parseInt(this.mAudioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE")) : 44100);
        if (startEchoTester > 0) {
            this.echoTesterIsRunning = true;
        } else {
            this.echoTesterIsRunning = false;
            routeAudioToReceiver();
            this.mAudioManager.setStreamVolume(0, streamVolume, 0);
            ((AudioManager) getContext().getSystemService("audio")).setMode(0);
            Log.m6905i("Set audio mode on 'Normal'");
        }
        return startEchoTester;
    }

    public int stopEchoTester() throws LinphoneCoreException {
        this.echoTesterIsRunning = false;
        int stopEchoTester = this.mLc.stopEchoTester();
        routeAudioToReceiver();
        ((AudioManager) getContext().getSystemService("audio")).setMode(0);
        Log.m6905i("Set audio mode on 'Normal'");
        return stopEchoTester;
    }

    public boolean getEchoTesterStatus() {
        return this.echoTesterIsRunning;
    }

    private void requestAudioFocus(int i) {
        if (!this.mAudioFocused) {
            int requestAudioFocus = this.mAudioManager.requestAudioFocus((AudioManager.OnAudioFocusChangeListener) null, i, 4);
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("Audio focus requested: ");
            sb.append(requestAudioFocus == 1 ? "Granted" : "Denied");
            objArr[0] = sb.toString();
            Log.m6901d(objArr);
            if (requestAudioFocus == 1) {
                this.mAudioFocused = true;
            }
        }
    }

    public void enableDeviceRingtone(boolean z) {
        if (z) {
            this.mLc.setRing((String) null);
        } else {
            this.mLc.setRing(this.mRingSoundFile);
        }
    }

    private synchronized void startRinging() {
        this.mAudioManager.setMode(1);
        try {
            if ((this.mAudioManager.getRingerMode() == 1 || this.mAudioManager.getRingerMode() == 2) && this.mVibrator != null) {
                this.mVibrator.vibrate(new long[]{0, 1000, 1000}, 1);
            }
            if (this.mRingerPlayer == null) {
                requestAudioFocus(2);
                this.mRingerPlayer = new MediaPlayer();
                this.mRingerPlayer.setAudioStreamType(2);
                String ringtone = LinphonePreferences.instance().getRingtone(Settings.System.DEFAULT_RINGTONE_URI.toString());
                try {
                    if (ringtone.startsWith("content://")) {
                        this.mRingerPlayer.setDataSource(this.mServiceContext, Uri.parse(ringtone));
                    } else {
                        this.mRingerPlayer = MediaPlayer.create(this.mServiceContext, C5321R.raw.ringtone);
                    }
                } catch (IOException e) {
                    android.util.Log.d("TAG", "XXX ring " + ringtone);
                    Log.m6903e(e, "Cannot set ringtone");
                }
                this.mRingerPlayer.prepare();
                this.mRingerPlayer.setLooping(true);
                this.mRingerPlayer.start();
            } else {
                Log.m6907w("already ringing");
            }
        } catch (Exception e2) {
            Log.m6903e(e2, "cannot handle incoming call");
        }
        this.isRinging = true;
    }

    public synchronized void stopRinging() {
        if (this.mRingerPlayer != null) {
            this.mRingerPlayer.stop();
            this.mRingerPlayer.release();
            this.mRingerPlayer = null;
        }
        if (this.mVibrator != null) {
            this.mVibrator.cancel();
        }
        if (Hacks.needGalaxySAudioHack()) {
            this.mAudioManager.setMode(0);
        }
        this.isRinging = false;
        if (!BluetoothManager.getInstance().isBluetoothHeadsetAvailable()) {
            if (this.mServiceContext.getResources().getBoolean(C5321R.bool.isTablet)) {
                Log.m6901d("Stopped ringing, routing back to speaker");
                routeAudioToSpeaker();
            } else {
                Log.m6901d("Stopped ringing, routing back to earpiece");
                routeAudioToReceiver();
            }
        }
    }

    public static String extractADisplayName(Resources resources, LinphoneAddress linphoneAddress) {
        if (linphoneAddress == null) {
            return resources.getString(C5321R.string.unknown_incoming_call_name);
        }
        String displayName = linphoneAddress.getDisplayName();
        if (displayName != null) {
            return displayName;
        }
        if (linphoneAddress.getUserName() != null) {
            return linphoneAddress.getUserName();
        }
        String linphoneAddress2 = linphoneAddress.toString();
        if (linphoneAddress2 == null || linphoneAddress2.length() <= 1) {
            return resources.getString(C5321R.string.unknown_incoming_call_name);
        }
        return linphoneAddress2;
    }

    public static boolean reinviteWithVideo() {
        return CallManager.getInstance().reinviteWithVideo();
    }

    public boolean addVideo() {
        enableCamera(this.mLc.getCurrentCall(), true);
        return reinviteWithVideo();
    }

    public boolean acceptCallIfIncomingPending() throws LinphoneCoreException {
        if (!this.mLc.isInComingInvitePending()) {
            return false;
        }
        LinphoneCore linphoneCore = this.mLc;
        linphoneCore.acceptCall(linphoneCore.getCurrentCall());
        return true;
    }

    public boolean acceptCall(LinphoneCall linphoneCall) {
        try {
            this.mLc.acceptCall(linphoneCall);
            return true;
        } catch (LinphoneCoreException e) {
            Log.m6905i(e, "Accept call failed");
            return false;
        }
    }

    public boolean acceptCallWithParams(LinphoneCall linphoneCall, LinphoneCallParams linphoneCallParams) {
        try {
            this.mLc.acceptCallWithParams(linphoneCall, linphoneCallParams);
            return true;
        } catch (LinphoneCoreException e) {
            Log.m6905i(e, "Accept call failed");
            return false;
        }
    }

    public static String extractIncomingRemoteName(Resources resources, LinphoneAddress linphoneAddress) {
        return extractADisplayName(resources, linphoneAddress);
    }

    public void adjustVolume(int i) {
        if (Build.VERSION.SDK_INT < 15) {
            int streamVolume = this.mAudioManager.getStreamVolume(0);
            int streamMaxVolume = this.mAudioManager.getStreamMaxVolume(0);
            int i2 = streamVolume + i;
            if (i2 > streamMaxVolume) {
                i2 = streamMaxVolume;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            this.mLc.setPlaybackGain((float) ((i2 - streamMaxVolume) * 4));
            return;
        }
        this.mAudioManager.adjustStreamVolume(0, i < 0 ? -1 : 1, 1);
    }

    public static synchronized LinphoneCore getLcIfManagerNotDestroyedOrNull() {
        synchronized (LinphoneManager.class) {
            if (!sExited) {
                if (instance != null) {
                    LinphoneCore lc = getLc();
                    return lc;
                }
            }
            return null;
        }
    }

    public static final boolean isInstanciated() {
        return instance != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized org.linphone.core.LinphoneCall getPendingIncomingCall() {
        /*
            r5 = this;
            monitor-enter(r5)
            org.linphone.core.LinphoneCore r0 = r5.mLc     // Catch:{ all -> 0x0029 }
            org.linphone.core.LinphoneCall r0 = r0.getCurrentCall()     // Catch:{ all -> 0x0029 }
            r1 = 0
            if (r0 != 0) goto L_0x000c
            monitor-exit(r5)
            return r1
        L_0x000c:
            org.linphone.core.LinphoneCall$State r2 = r0.getState()     // Catch:{ all -> 0x0029 }
            org.linphone.core.CallDirection r3 = r0.getDirection()     // Catch:{ all -> 0x0029 }
            org.linphone.core.CallDirection r4 = org.linphone.core.CallDirection.Incoming     // Catch:{ all -> 0x0029 }
            if (r3 != r4) goto L_0x0022
            org.linphone.core.LinphoneCall$State r3 = org.linphone.core.LinphoneCall.State.IncomingReceived     // Catch:{ all -> 0x0029 }
            if (r2 == r3) goto L_0x0020
            org.linphone.core.LinphoneCall$State r3 = org.linphone.core.LinphoneCall.State.CallIncomingEarlyMedia     // Catch:{ all -> 0x0029 }
            if (r2 != r3) goto L_0x0022
        L_0x0020:
            r2 = 1
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            if (r2 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r0 = r1
        L_0x0027:
            monitor-exit(r5)
            return r0
        L_0x0029:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.LinphoneManager.getPendingIncomingCall():org.linphone.core.LinphoneCall");
    }

    public void displayLinkPhoneNumber() {
        this.accountCreator.setUsername(LinphonePreferences.instance().getAccountUsername(LinphonePreferences.instance().getDefaultAccountIndex()));
        this.accountCreator.isAccountLinked();
    }

    public void isAccountWithAlias() {
        if (getLc().getDefaultProxyConfig() != null) {
            long time = new Timestamp(new Date().getTime()).getTime();
            if (LinphonePreferences.instance().getLinkPopupTime() == null || Long.parseLong(LinphonePreferences.instance().getLinkPopupTime()) < time) {
                this.accountCreator.setUsername(LinphonePreferences.instance().getAccountUsername(LinphonePreferences.instance().getDefaultAccountIndex()));
                this.accountCreator.isAccountUsed();
                return;
            }
            return;
        }
        LinphonePreferences.instance().setLinkPopupTime((String) null);
    }

    private void askLinkWithPhoneNumber() {
        long time = new Timestamp(new Date().getTime()).getTime() + new Timestamp((long) LinphoneActivity.instance().getResources().getInteger(C5321R.integer.popup_time_interval)).getTime();
        LinphonePreferences.instance().setLinkPopupTime(String.valueOf(time));
        final Dialog displayDialog = LinphoneActivity.instance().displayDialog(String.format(getString(C5321R.string.link_account_popup), new Object[]{getLc().getDefaultProxyConfig().getAddress().asStringUriOnly()}));
        Button button = (Button) displayDialog.findViewById(C5321R.C5324id.delete_button);
        button.setText(getString(C5321R.string.link));
        Button button2 = (Button) displayDialog.findViewById(C5321R.C5324id.cancel);
        button2.setText(getString(C5321R.string.maybe_later));
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(LinphoneActivity.instance(), AssistantActivity.class);
                intent.putExtra("LinkPhoneNumber", true);
                intent.putExtra("LinkPhoneNumberAsk", true);
                LinphoneManager.this.mServiceContext.startActivity(intent);
                displayDialog.dismiss();
            }
        });
        LinphonePreferences.instance().setLinkPopupTime(String.valueOf(time));
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                displayDialog.dismiss();
            }
        });
        displayDialog.show();
    }

    public void setDozeModeEnabled(boolean z) {
        this.dozeModeEnabled = z;
    }

    public String getmDynamicConfigFile() {
        return this.mDynamicConfigFile;
    }

    public boolean getCallGsmON() {
        return this.callGsmON;
    }

    public void setCallGsmON(boolean z) {
        this.callGsmON = z;
    }

    public static class LinphoneConfigException extends LinphoneException {
        public LinphoneConfigException() {
        }

        public LinphoneConfigException(String str, Throwable th) {
            super(str, th);
        }

        public LinphoneConfigException(String str) {
            super(str);
        }

        public LinphoneConfigException(Throwable th) {
            super(th);
        }
    }

    public void infoReceived(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneInfoMessage linphoneInfoMessage) {
        Log.m6901d("Info message received from " + linphoneCall.getRemoteAddress().asString());
        LinphoneContent content = linphoneInfoMessage.getContent();
        if (content != null) {
            Log.m6901d("Info received with body with mime type " + content.getType() + "/" + content.getSubtype() + " and data [" + content.getDataAsString() + "]");
        }
    }

    public void subscriptionStateChanged(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, SubscriptionState subscriptionState) {
        Log.m6901d("Subscription state changed to " + subscriptionState + " event name is " + linphoneEvent.getEventName());
    }

    public void notifyReceived(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, String str, LinphoneContent linphoneContent) {
        Log.m6901d("Notify received for event " + str);
        if (linphoneContent != null) {
            Log.m6901d("with content " + linphoneContent.getType() + "/" + linphoneContent.getSubtype() + " data:" + linphoneContent.getDataAsString());
        }
    }

    public void publishStateChanged(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, PublishState publishState) {
        Log.m6901d("Publish state changed to " + publishState + " for event name " + linphoneEvent.getEventName());
    }

    public void isComposingReceived(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom) {
        Log.m6901d("Composing received for chatroom " + linphoneChatRoom.getPeerAddress().asStringUriOnly());
    }

    public void configuringStatus(LinphoneCore linphoneCore, LinphoneCore.RemoteProvisioningState remoteProvisioningState, String str) {
        Log.m6901d("Remote provisioning status = " + remoteProvisioningState.toString() + " (" + str + ")");
        if (remoteProvisioningState == LinphoneCore.RemoteProvisioningState.ConfiguringSuccessful && LinphonePreferences.instance().isProvisioningLoginViewEnabled()) {
            try {
                this.wizardLoginViewDomain = LinphoneCoreFactory.instance().createLinphoneAddress(linphoneCore.createProxyConfig().getIdentity()).getDomain();
            } catch (LinphoneCoreException unused) {
                this.wizardLoginViewDomain = null;
            }
        }
    }

    public void uploadProgressIndication(LinphoneCore linphoneCore, int i, int i2) {
        if (i2 > 0) {
            Log.m6901d("Log upload progress: currently uploaded = " + i + " , total = " + i2 + ", % = " + String.valueOf((i * 100) / i2));
        }
    }

    public void uploadStateChanged(LinphoneCore linphoneCore, LinphoneCore.LogCollectionUploadState logCollectionUploadState, String str) {
        Log.m6901d("Log upload state: " + logCollectionUploadState.toString() + ", info = " + str);
    }

    public void ecCalibrationStatus(LinphoneCore linphoneCore, LinphoneCore.EcCalibratorStatus ecCalibratorStatus, int i, Object obj) {
        ((AudioManager) getContext().getSystemService("audio")).setMode(0);
        this.mAudioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
        Log.m6905i("Set audio mode on 'Normal'");
    }

    public void onAccountCreatorIsAccountUsed(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
        if (requestStatus.equals(LinphoneAccountCreator.RequestStatus.AccountExist)) {
            linphoneAccountCreator.isAccountLinked();
        }
    }

    public void onAccountCreatorAccountLinkedWithPhoneNumber(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
        if (requestStatus.equals(LinphoneAccountCreator.RequestStatus.AccountNotLinked)) {
            askLinkWithPhoneNumber();
        }
    }

    public void onAccountCreatorIsAccountLinked(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
        if (requestStatus.equals(LinphoneAccountCreator.RequestStatus.AccountNotLinked)) {
            askLinkWithPhoneNumber();
        }
    }
}
