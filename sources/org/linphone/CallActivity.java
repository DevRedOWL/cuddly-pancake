package org.linphone;

import android.app.Dialog;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.SystemClock;
import android.text.Html;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.apache.commons.lang3.time.DateUtils;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.anko.DimensionsKt;
import org.json.JSONException;
import org.json.JSONObject;
import org.linphone.CallIncomingActivity;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneCall;
import org.linphone.core.LinphoneCallParams;
import org.linphone.core.LinphoneCallStats;
import org.linphone.core.LinphoneChatMessage;
import org.linphone.core.LinphoneChatRoom;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.LinphoneCoreListenerBase;
import org.linphone.core.LinphonePlayer;
import org.linphone.core.PayloadType;
import org.linphone.mediastream.Log;
import org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration;
import org.linphone.p054ui.CircleLabelView;
import org.linphone.p054ui.Numpad;
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.data.realm.SipParametrs;
import p035ru.unicorn.ujin.data.service.FCM;
import p035ru.unicorn.ujin.util.CallMaker;

public class CallActivity extends LinphoneGenericActivity implements View.OnClickListener, ActivityCompat.OnRequestPermissionsResultCallback {
    private static final int PERMISSIONS_ENABLED_CAMERA = 203;
    private static final int PERMISSIONS_ENABLED_MIC = 204;
    private static final int PERMISSIONS_REQUEST_CAMERA = 202;
    private static final int SECONDS_BEFORE_DENYING_CALL_UPDATE = 60000;
    private static final int SECONDS_BEFORE_HIDING_CONTROLS = 4000;
    /* access modifiers changed from: private */
    public static long TimeRemind;
    private static CallActivity instance;
    /* access modifiers changed from: private */
    public ImageView addCall;
    private CallAudioFragment audioCallFragment;
    private ImageView audioRoute;
    private RelativeLayout avatar_layout;
    private LinearLayout callInfo;
    private LinearLayout callsList;
    private int cameraNumber;
    private ImageView chat;
    /* access modifiers changed from: private */
    public ImageView conference;
    private LinearLayout conferenceList;
    private ImageView conferenceStatus;
    private ImageView contactPicture;
    private ViewGroup container;
    private ImageView dialer;
    /* access modifiers changed from: private */
    public Dialog dialog = null;
    private CircleLabelView discardView;
    private ImageView hangUp;
    private HeadsetReceiver headsetReceiver;
    private LayoutInflater inflater;
    private boolean isConferenceRunning = false;
    private boolean isMicMuted = false;
    /* access modifiers changed from: private */
    public boolean isSpeakerEnabled = false;
    private boolean isTransferAllowed;
    /* access modifiers changed from: private */
    public boolean isVideoAsk;
    private boolean isVideoCallPaused = false;
    private RelativeLayout mActiveCallHeader;
    private LinearLayout mCallPaused;
    private Runnable mControls;
    private Handler mControlsHandler = new Handler();
    private LinearLayout mControlsLayout;
    private HashMap<String, String> mDecoderTexts;
    private HashMap<String, String> mEncoderTexts;
    /* access modifiers changed from: private */
    public Handler mHandler = new Handler();
    private LinphoneCoreListenerBase mListener;
    private LinearLayout mNoCurrentCall;
    private TimerTask mTask;
    /* access modifiers changed from: private */
    public Timer mTimer;
    private ImageView menu;
    private ImageView micro;
    private TextView missedChats;
    /* access modifiers changed from: private */
    public Numpad numpad;
    /* access modifiers changed from: private */
    public boolean oldIsSpeakerEnabled = false;
    private ImageView open;
    private CircleLabelView openView;
    /* access modifiers changed from: private */
    public ImageView options;
    private ImageView pause;
    private ImageView routeBluetooth;
    private ImageView routeEarpiece;
    private ImageView routeSpeaker;
    private DrawerLayout sideMenu;
    private RelativeLayout sideMenuContent;
    /* access modifiers changed from: private */
    public ImageView speaker;
    /* access modifiers changed from: private */
    public StatusFragment status;
    private ImageView switchCamera;
    private CountDownTimer timer;
    /* access modifiers changed from: private */
    public ImageView transfer;
    /* access modifiers changed from: private */
    public ImageView video;
    private CallVideoFragment videoCallFragment;
    /* access modifiers changed from: private */
    public ProgressBar videoProgress;

    public void showHomeActivity() {
    }

    public static CallActivity instance() {
        return instance;
    }

    public static boolean isInstanciated() {
        return instance != null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Fragment fragment;
        super.onCreate(bundle);
        instance = this;
        try {
            LinphonePreferences.instance().setIncTimeout(120);
            LinphonePreferences.instance().setInCallTimeout(120);
        } catch (Exception unused) {
        }
        if (getResources().getBoolean(C5321R.bool.orientation_portrait_only)) {
            setRequestedOrientation(1);
        }
        getWindow().addFlags(524416);
        setContentView(C5321R.layout.call_new);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        this.headsetReceiver = new HeadsetReceiver();
        registerReceiver(this.headsetReceiver, intentFilter);
        this.isTransferAllowed = getApplicationContext().getResources().getBoolean(C5321R.bool.allow_transfers);
        this.cameraNumber = AndroidCameraConfiguration.retrieveCameras().length;
        this.mEncoderTexts = new HashMap<>();
        this.mDecoderTexts = new HashMap<>();
        this.mListener = new LinphoneCoreListenerBase() {
            public void messageReceived(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom, LinphoneChatMessage linphoneChatMessage) {
                CallActivity.this.displayMissedChats();
            }

            public void callState(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneCall.State state, String str) {
                boolean z = false;
                if (LinphoneManager.getLc().getCallsNb() == 0) {
                    if (CallActivity.this.status != null) {
                        CallActivity.this.status.setisZrtpAsk(false);
                    }
                    CallActivity.this.finish();
                } else if (state == LinphoneCall.State.IncomingReceived) {
                    CallActivity.this.startIncomingCallActivity();
                } else {
                    if (state == LinphoneCall.State.Paused || state == LinphoneCall.State.PausedByRemote || state == LinphoneCall.State.Pausing) {
                        if (LinphoneManager.getLc().getCurrentCall() != null) {
                            CallActivity.this.enabledVideoButton(false);
                        }
                        if (CallActivity.this.isVideoEnabled(linphoneCall)) {
                            CallActivity.this.showAudioView();
                        }
                    } else if (state == LinphoneCall.State.Resuming) {
                        if (LinphonePreferences.instance().isVideoEnabled()) {
                            CallActivity.this.status.refreshStatusItems(linphoneCall, CallActivity.this.isVideoEnabled(linphoneCall));
                            if (linphoneCall.getCurrentParams().getVideoEnabled()) {
                                CallActivity.this.showVideoView();
                            }
                        }
                        if (LinphoneManager.getLc().getCurrentCall() != null) {
                            CallActivity.this.enabledVideoButton(true);
                        }
                    } else if (state == LinphoneCall.State.StreamsRunning) {
                        CallActivity callActivity = CallActivity.this;
                        callActivity.switchVideo(callActivity.isVideoEnabled(linphoneCall));
                        CallActivity.this.enableAndRefreshInCallActions();
                        if (CallActivity.this.status != null) {
                            CallActivity.this.videoProgress.setVisibility(8);
                            CallActivity.this.status.refreshStatusItems(linphoneCall, CallActivity.this.isVideoEnabled(linphoneCall));
                        }
                    } else if (state == LinphoneCall.State.CallUpdatedByRemote) {
                        if (!LinphonePreferences.instance().isVideoEnabled()) {
                            CallActivity.this.acceptCallUpdate(false);
                        }
                        boolean videoEnabled = linphoneCall.getRemoteParams().getVideoEnabled();
                        boolean videoEnabled2 = linphoneCall.getCurrentParams().getVideoEnabled();
                        boolean shouldAutomaticallyAcceptVideoRequests = LinphonePreferences.instance().shouldAutomaticallyAcceptVideoRequests();
                        if (videoEnabled && !videoEnabled2 && !shouldAutomaticallyAcceptVideoRequests && !LinphoneManager.getLc().isInConference()) {
                            CallActivity.this.showAcceptCallUpdateDialog();
                            CallActivity.this.createTimerForDialog(DateUtils.MILLIS_PER_MINUTE);
                        }
                    }
                    CallActivity.this.refreshIncallUi();
                    ImageView access$1100 = CallActivity.this.transfer;
                    if (LinphoneManager.getLc().getCurrentCall() != null) {
                        z = true;
                    }
                    access$1100.setEnabled(z);
                }
            }

            public void callEncryptionChanged(LinphoneCore linphoneCore, LinphoneCall linphoneCall, boolean z, String str) {
                if (CallActivity.this.status != null) {
                    if (linphoneCall.getCurrentParams().getMediaEncryption().equals(LinphoneCore.MediaEncryption.ZRTP) && !linphoneCall.isAuthenticationTokenVerified()) {
                        CallActivity.this.status.showZRTPDialog(linphoneCall);
                    }
                    CallActivity.this.status.refreshStatusItems(linphoneCall, linphoneCall.getCurrentParams().getVideoEnabled());
                }
            }
        };
        if (findViewById(C5321R.C5324id.fragmentContainer) != null) {
            initUI();
            if (LinphoneManager.getLc().getCallsNb() > 0 && LinphoneUtils.isCallEstablished(LinphoneManager.getLc().getCalls()[0])) {
                enableAndRefreshInCallActions();
            }
            if (bundle != null) {
                this.isSpeakerEnabled = bundle.getBoolean("Speaker");
                this.isMicMuted = bundle.getBoolean("Mic");
                this.isVideoCallPaused = bundle.getBoolean("VideoCallPaused");
                if (bundle.getBoolean("AskingVideo")) {
                    showAcceptCallUpdateDialog();
                    TimeRemind = bundle.getLong("TimeRemind");
                    createTimerForDialog(TimeRemind);
                }
                if (this.status != null && bundle.getBoolean("AskingZrtp")) {
                    this.status.setisZrtpAsk(bundle.getBoolean("AskingZrtp"));
                }
                refreshInCallActions();
                return;
            }
            this.isSpeakerEnabled = LinphoneManager.getLc().isSpeakerEnabled();
            this.isMicMuted = LinphoneManager.getLc().isMicMuted();
            if (isVideoEnabled(LinphoneManager.getLc().getCurrentCall())) {
                fragment = new CallVideoFragment();
                this.videoCallFragment = (CallVideoFragment) fragment;
                displayVideoCall(false);
                LinphoneManager.getInstance().routeAudioToSpeaker();
                this.isSpeakerEnabled = true;
            } else {
                fragment = new CallAudioFragment();
                this.audioCallFragment = (CallAudioFragment) fragment;
            }
            if (BluetoothManager.getInstance().isBluetoothHeadsetAvailable()) {
                BluetoothManager.getInstance().routeAudioToBluetooth();
            }
            fragment.setArguments(getIntent().getExtras());
            getFragmentManager().beginTransaction().add(C5321R.C5324id.fragmentContainer, fragment).commitAllowingStateLoss();
        }
    }

    public void createTimerForDialog(long j) {
        this.timer = new CountDownTimer(j, 1000) {
            public void onTick(long j) {
                long unused = CallActivity.TimeRemind = j;
            }

            public void onFinish() {
                if (CallActivity.this.dialog != null) {
                    CallActivity.this.dialog.dismiss();
                    Dialog unused = CallActivity.this.dialog = null;
                }
                CallActivity.this.acceptCallUpdate(false);
            }
        }.start();
    }

    /* access modifiers changed from: private */
    public boolean isVideoEnabled(LinphoneCall linphoneCall) {
        if (linphoneCall != null) {
            return linphoneCall.getCurrentParams().getVideoEnabled();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("Speaker", LinphoneManager.getLc().isSpeakerEnabled());
        bundle.putBoolean("Mic", LinphoneManager.getLc().isMicMuted());
        bundle.putBoolean("VideoCallPaused", this.isVideoCallPaused);
        bundle.putBoolean("AskingVideo", this.isVideoAsk);
        bundle.putLong("TimeRemind", TimeRemind);
        StatusFragment statusFragment = this.status;
        if (statusFragment != null) {
            bundle.putBoolean("AskingZrtp", statusFragment.getisZrtpAsk());
        }
        Dialog dialog2 = this.dialog;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
        super.onSaveInstanceState(bundle);
    }

    private boolean isTablet() {
        return getResources().getBoolean(C5321R.bool.isTablet);
    }

    private void initUI() {
        this.inflater = LayoutInflater.from(this);
        this.container = (ViewGroup) findViewById(C5321R.C5324id.topLayout);
        this.callsList = (LinearLayout) findViewById(C5321R.C5324id.calls_list);
        this.conferenceList = (LinearLayout) findViewById(C5321R.C5324id.conference_list);
        this.video = (ImageView) findViewById(C5321R.C5324id.video);
        this.video.setOnClickListener(this);
        enabledVideoButton(false);
        this.videoProgress = (ProgressBar) findViewById(C5321R.C5324id.video_in_progress);
        this.videoProgress.setVisibility(8);
        this.micro = (ImageView) findViewById(C5321R.C5324id.micro);
        this.micro.setOnClickListener(this);
        this.speaker = (ImageView) findViewById(C5321R.C5324id.speaker);
        this.speaker.setOnClickListener(this);
        this.options = (ImageView) findViewById(C5321R.C5324id.options);
        this.options.setOnClickListener(this);
        this.options.setEnabled(false);
        this.hangUp = (ImageView) findViewById(C5321R.C5324id.hang_up);
        this.hangUp.setOnClickListener(this);
        this.dialer = (ImageView) findViewById(C5321R.C5324id.dialer);
        this.dialer.setOnClickListener(this);
        this.open = (ImageView) findViewById(C5321R.C5324id.open);
        this.open.setOnClickListener(this);
        this.numpad = (Numpad) findViewById(C5321R.C5324id.numpad);
        this.numpad.getBackground().setAlpha(DimensionsKt.HDPI);
        this.chat = (ImageView) findViewById(C5321R.C5324id.chat);
        this.chat.setOnClickListener(this);
        this.missedChats = (TextView) findViewById(C5321R.C5324id.missed_chats);
        this.callInfo = (LinearLayout) findViewById(C5321R.C5324id.active_call_info);
        this.pause = (ImageView) findViewById(C5321R.C5324id.pause);
        this.pause.setOnClickListener(this);
        enabledPauseButton(false);
        this.mActiveCallHeader = (RelativeLayout) findViewById(C5321R.C5324id.active_call);
        this.mNoCurrentCall = (LinearLayout) findViewById(C5321R.C5324id.no_current_call);
        this.mCallPaused = (LinearLayout) findViewById(C5321R.C5324id.remote_pause);
        this.contactPicture = (ImageView) findViewById(C5321R.C5324id.contact_picture);
        this.avatar_layout = (RelativeLayout) findViewById(C5321R.C5324id.avatar_layout);
        this.addCall = (ImageView) findViewById(C5321R.C5324id.add_call);
        this.addCall.setOnClickListener(this);
        this.addCall.setEnabled(false);
        this.transfer = (ImageView) findViewById(C5321R.C5324id.transfer);
        this.transfer.setOnClickListener(this);
        this.transfer.setEnabled(false);
        this.conference = (ImageView) findViewById(C5321R.C5324id.conference);
        this.conference.setEnabled(false);
        this.conference.setOnClickListener(this);
        this.openView = (CircleLabelView) findViewById(C5321R.C5324id.open_door);
        this.discardView = (CircleLabelView) findViewById(C5321R.C5324id.discard);
        this.openView.setArrowOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                CallActivity.this.lambda$initUI$0$CallActivity(view);
            }
        });
        this.discardView.setArrowOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                CallActivity.this.lambda$initUI$1$CallActivity(view);
            }
        });
        try {
            this.audioRoute = (ImageView) findViewById(C5321R.C5324id.audio_route);
            this.audioRoute.setOnClickListener(this);
            this.routeSpeaker = (ImageView) findViewById(C5321R.C5324id.route_speaker);
            this.routeSpeaker.setOnClickListener(this);
            this.routeEarpiece = (ImageView) findViewById(C5321R.C5324id.route_earpiece);
            this.routeEarpiece.setOnClickListener(this);
            this.routeBluetooth = (ImageView) findViewById(C5321R.C5324id.route_bluetooth);
            this.routeBluetooth.setOnClickListener(this);
        } catch (NullPointerException unused) {
            Log.m6903e("Bluetooth: Audio routes menu disabled on tablets for now (1)");
        }
        this.switchCamera = (ImageView) findViewById(C5321R.C5324id.switchCamera);
        this.switchCamera.setOnClickListener(this);
        this.mControlsLayout = (LinearLayout) findViewById(C5321R.C5324id.menu);
        if (!this.isTransferAllowed) {
            this.addCall.setBackgroundResource(C5321R.C5323drawable.options_add_call);
        }
        if (BluetoothManager.getInstance().isBluetoothHeadsetAvailable()) {
            try {
                this.audioRoute.setVisibility(0);
                this.speaker.setVisibility(8);
            } catch (NullPointerException unused2) {
                Log.m6903e("Bluetooth: Audio routes menu disabled on tablets for now (2)");
            }
        } else {
            try {
                this.audioRoute.setVisibility(8);
                this.speaker.setVisibility(0);
            } catch (NullPointerException unused3) {
                Log.m6903e("Bluetooth: Audio routes menu disabled on tablets for now (3)");
            }
        }
        createInCallStats();
        LinphoneManager.getInstance().changeStatusToOnThePhone();
    }

    public /* synthetic */ void lambda$initUI$0$CallActivity(View view) {
        openDoor();
    }

    public /* synthetic */ void lambda$initUI$1$CallActivity(View view) {
        hangUp();
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

    public void onRequestPermissionsResult(int i, String[] strArr, final int[] iArr) {
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
        switch (i) {
            case 202:
                UIThreadDispatcher.dispatch(new Runnable() {
                    public void run() {
                        CallActivity callActivity = CallActivity.this;
                        boolean z = false;
                        if (iArr[0] == 0) {
                            z = true;
                        }
                        callActivity.acceptCallUpdate(z);
                    }
                });
                return;
            case 203:
                UIThreadDispatcher.dispatch(new Runnable() {
                    public void run() {
                        CallActivity callActivity = CallActivity.this;
                        boolean z = false;
                        if (iArr[0] != 0) {
                            z = true;
                        }
                        callActivity.disableVideo(z);
                    }
                });
                return;
            case 204:
                UIThreadDispatcher.dispatch(new Runnable() {
                    public void run() {
                        if (iArr[0] == 0) {
                            CallActivity.this.toggleMicro();
                        }
                    }
                });
                return;
            default:
                return;
        }
    }

    public void createInCallStats() {
        this.sideMenu = (DrawerLayout) findViewById(C5321R.C5324id.side_menu);
        this.menu = (ImageView) findViewById(C5321R.C5324id.call_quality);
        this.sideMenuContent = (RelativeLayout) findViewById(C5321R.C5324id.side_menu_content);
        initCallStatsRefresher(LinphoneManager.getLc().getCurrentCall(), findViewById(C5321R.C5324id.incall_stats));
    }

    /* access modifiers changed from: private */
    public void refreshIncallUi() {
        refreshInCallActions();
        refreshCallList(getResources());
        enableAndRefreshInCallActions();
        displayMissedChats();
    }

    /* access modifiers changed from: protected */
    public void setSpeakerEnabled(boolean z) {
        this.isSpeakerEnabled = z;
    }

    /* access modifiers changed from: protected */
    public void refreshInCallActions() {
        if (!LinphonePreferences.instance().isVideoEnabled() || this.isConferenceRunning) {
            enabledVideoButton(false);
        } else if (!this.video.isEnabled()) {
            this.video.setImageResource(C5321R.C5323drawable.camera_button);
        } else if (isVideoEnabled(LinphoneManager.getLc().getCurrentCall())) {
            this.video.setImageResource(C5321R.C5323drawable.camera_selected);
            this.videoProgress.setVisibility(4);
        } else {
            this.video.setImageResource(C5321R.C5323drawable.camera_button);
        }
        if (getPackageManager().checkPermission("android.permission.CAMERA", getPackageName()) != 0) {
            this.video.setImageResource(C5321R.C5323drawable.camera_button);
        }
        if (this.isSpeakerEnabled) {
            this.speaker.setImageResource(C5321R.C5323drawable.speaker_selected);
        } else {
            this.speaker.setImageResource(C5321R.C5323drawable.speaker_default);
        }
        if (getPackageManager().checkPermission("android.permission.RECORD_AUDIO", getPackageName()) != 0) {
            this.isMicMuted = true;
        }
        if (this.isMicMuted) {
            this.micro.setImageResource(C5321R.C5323drawable.micro_selected);
        } else {
            this.micro.setImageResource(C5321R.C5323drawable.micro_default);
        }
        try {
            this.routeSpeaker.setImageResource(C5321R.C5323drawable.route_speaker);
            if (BluetoothManager.getInstance().isUsingBluetoothAudioRoute()) {
                this.isSpeakerEnabled = false;
                this.routeEarpiece.setImageResource(C5321R.C5323drawable.route_earpiece);
                this.routeBluetooth.setImageResource(C5321R.C5323drawable.route_bluetooth_selected);
                return;
            }
            this.routeEarpiece.setImageResource(C5321R.C5323drawable.route_earpiece_selected);
            this.routeBluetooth.setImageResource(C5321R.C5323drawable.route_bluetooth);
            if (this.isSpeakerEnabled) {
                this.routeSpeaker.setImageResource(C5321R.C5323drawable.route_speaker_selected);
                this.routeEarpiece.setImageResource(C5321R.C5323drawable.route_earpiece);
                this.routeBluetooth.setImageResource(C5321R.C5323drawable.route_bluetooth);
            }
        } catch (NullPointerException unused) {
            Log.m6903e("Bluetooth: Audio routes menu disabled on tablets for now (4)");
        }
    }

    /* access modifiers changed from: private */
    public void enableAndRefreshInCallActions() {
        int conferenceSize = LinphoneManager.getLc().isInConference() ? LinphoneManager.getLc().getConferenceSize() - (LinphoneManager.getLc().isInConference() ? 1 : 0) : 0;
        if (this.isTransferAllowed && !LinphoneManager.getLc().soundResourcesLocked()) {
            enabledTransferButton(true);
        }
        if (LinphoneManager.getLc().getCallsNb() <= 1 || LinphoneManager.getLc().getCallsNb() <= conferenceSize || LinphoneManager.getLc().soundResourcesLocked()) {
            enabledConferenceButton(false);
        } else {
            enabledConferenceButton(true);
        }
        this.addCall.setEnabled(LinphoneManager.getLc().getCallsNb() < LinphoneManager.getLc().getMaxCalls() && !LinphoneManager.getLc().soundResourcesLocked());
        this.options.setEnabled(!getResources().getBoolean(C5321R.bool.disable_options_in_call) && (this.addCall.isEnabled() || this.transfer.isEnabled()));
        if (LinphoneManager.getLc().getCurrentCall() == null || !LinphonePreferences.instance().isVideoEnabled() || LinphoneManager.getLc().getCurrentCall().mediaInProgress()) {
            enabledVideoButton(false);
        } else {
            enabledVideoButton(true);
        }
        if (LinphoneManager.getLc().getCurrentCall() == null || LinphoneManager.getLc().getCurrentCall().mediaInProgress()) {
            enabledPauseButton(false);
        } else {
            enabledPauseButton(true);
        }
        this.micro.setEnabled(true);
        if (!isTablet()) {
            this.speaker.setEnabled(true);
        }
        this.transfer.setEnabled(true);
        this.pause.setEnabled(true);
        this.dialer.setEnabled(true);
    }

    public void updateStatusFragment(StatusFragment statusFragment) {
        this.status = statusFragment;
    }

    public void onClick(View view) {
        int id = view.getId();
        isVideoEnabled(LinphoneManager.getLc().getCurrentCall());
        String str = "granted";
        if (id == C5321R.C5324id.video) {
            int checkPermission = getPackageManager().checkPermission("android.permission.CAMERA", getPackageName());
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("[Permission] Camera permission is ");
            if (checkPermission != 0) {
                str = "denied";
            }
            sb.append(str);
            objArr[0] = sb.toString();
            Log.m6905i(objArr);
            if (checkPermission == 0) {
                disableVideo(isVideoEnabled(LinphoneManager.getLc().getCurrentCall()));
            } else {
                checkAndRequestPermission("android.permission.CAMERA", 203);
            }
        } else if (id == C5321R.C5324id.micro) {
            int checkPermission2 = getPackageManager().checkPermission("android.permission.RECORD_AUDIO", getPackageName());
            Object[] objArr2 = new Object[1];
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[Permission] Record audio permission is ");
            if (checkPermission2 != 0) {
                str = "denied";
            }
            sb2.append(str);
            objArr2[0] = sb2.toString();
            Log.m6905i(objArr2);
            if (checkPermission2 == 0) {
                toggleMicro();
            } else {
                checkAndRequestPermission("android.permission.RECORD_AUDIO", 204);
            }
        } else if (id == C5321R.C5324id.speaker) {
            toggleSpeaker();
        } else if (id == C5321R.C5324id.add_call) {
            goBackToDialer();
        } else if (id == C5321R.C5324id.pause) {
            pauseOrResumeCall(LinphoneManager.getLc().getCurrentCall());
        } else if (id == C5321R.C5324id.discard) {
            hangUp();
        } else if (id == C5321R.C5324id.dialer) {
            hideOrDisplayNumpad();
        } else if (id == C5321R.C5324id.chat) {
            goToChatList();
        } else if (id == C5321R.C5324id.conference) {
            enterConference();
            hideOrDisplayCallOptions();
        } else if (id == C5321R.C5324id.switchCamera) {
            CallVideoFragment callVideoFragment = this.videoCallFragment;
            if (callVideoFragment != null) {
                callVideoFragment.switchCamera();
            }
        } else if (id == C5321R.C5324id.transfer) {
            goBackToDialerAndDisplayTransferButton();
        } else if (id == C5321R.C5324id.options) {
            hideOrDisplayCallOptions();
        } else if (id == C5321R.C5324id.audio_route) {
            hideOrDisplayAudioRoutes();
        } else if (id == C5321R.C5324id.route_bluetooth) {
            if (BluetoothManager.getInstance().routeAudioToBluetooth()) {
                this.isSpeakerEnabled = false;
                this.routeBluetooth.setImageResource(C5321R.C5323drawable.route_bluetooth_selected);
                this.routeSpeaker.setImageResource(C5321R.C5323drawable.route_speaker);
                this.routeEarpiece.setImageResource(C5321R.C5323drawable.route_earpiece);
            }
            hideOrDisplayAudioRoutes();
        } else if (id == C5321R.C5324id.route_earpiece) {
            LinphoneManager.getInstance().routeAudioToReceiver();
            this.isSpeakerEnabled = false;
            this.routeBluetooth.setImageResource(C5321R.C5323drawable.route_bluetooth);
            this.routeSpeaker.setImageResource(C5321R.C5323drawable.route_speaker);
            this.routeEarpiece.setImageResource(C5321R.C5323drawable.route_earpiece_selected);
            hideOrDisplayAudioRoutes();
        } else if (id == C5321R.C5324id.route_speaker) {
            LinphoneManager.getInstance().routeAudioToSpeaker();
            this.isSpeakerEnabled = true;
            this.routeBluetooth.setImageResource(C5321R.C5323drawable.route_bluetooth);
            this.routeSpeaker.setImageResource(C5321R.C5323drawable.route_speaker_selected);
            this.routeEarpiece.setImageResource(C5321R.C5323drawable.route_earpiece);
            hideOrDisplayAudioRoutes();
        } else if (id == C5321R.C5324id.call_pause) {
            pauseOrResumeCall((LinphoneCall) view.getTag());
        } else if (id == C5321R.C5324id.conference_pause) {
            pauseOrResumeConference();
        } else if (id == C5321R.C5324id.open_door) {
            openDoor();
        }
    }

    private void openDoor() {
        if (LinphoneManager.getLc() != null && LinphoneManager.getLc().isIncall()) {
            if (getDoorUrl() != null && !getDoorUrl().isEmpty()) {
                new CallIncomingActivity.OpenDoorSignalSend().execute(new String[]{getDoorUrl(), getDtmf()});
            } else if (getDtmf() == null || getDtmf().isEmpty()) {
                LinphoneManager.getLc().sendDtmf('#');
            } else {
                String dtmf = getDtmf();
                for (int i = 0; i < getDtmf().length(); i++) {
                    LinphoneManager.getLc().sendDtmf(dtmf.charAt(i));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void enabledVideoButton(boolean z) {
        if (z) {
            this.video.setEnabled(true);
        } else {
            this.video.setEnabled(false);
        }
    }

    private void enabledPauseButton(boolean z) {
        if (z) {
            this.pause.setEnabled(true);
            this.pause.setImageResource(C5321R.C5323drawable.pause_big_default);
            return;
        }
        this.pause.setEnabled(false);
        this.pause.setImageResource(C5321R.C5323drawable.pause_big_disabled);
    }

    private void enabledTransferButton(boolean z) {
        if (z) {
            this.transfer.setEnabled(true);
        } else {
            this.transfer.setEnabled(false);
        }
    }

    private void enabledConferenceButton(boolean z) {
        if (z) {
            this.conference.setEnabled(true);
        } else {
            this.conference.setEnabled(false);
        }
    }

    /* access modifiers changed from: private */
    public void disableVideo(boolean z) {
        LinphoneCall currentCall = LinphoneManager.getLc().getCurrentCall();
        if (currentCall != null) {
            if (z) {
                LinphoneCallParams createCallParams = LinphoneManager.getLc().createCallParams(currentCall);
                createCallParams.setVideoEnabled(false);
                LinphoneManager.getLc().updateCall(currentCall, createCallParams);
                return;
            }
            this.videoProgress.setVisibility(0);
            if (currentCall.getRemoteParams() == null || currentCall.getRemoteParams().isLowBandwidthEnabled()) {
                displayCustomToast(getString(C5321R.string.error_low_bandwidth), 1);
            } else {
                LinphoneManager.getInstance().addVideo();
            }
        }
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

    /* access modifiers changed from: private */
    public void switchVideo(boolean z) {
        LinphoneCall currentCall = LinphoneManager.getLc().getCurrentCall();
        if (currentCall != null && currentCall.getState() != LinphoneCall.State.CallEnd && currentCall.getState() != LinphoneCall.State.CallReleased) {
            if (!z) {
                android.util.Log.d("TAG", "XXX x showAudioView(); " + currentCall.getRemoteParams().isLowBandwidthEnabled());
                showAudioView();
            } else if (!currentCall.getRemoteParams().isLowBandwidthEnabled()) {
                LinphoneManager.getInstance().addVideo();
                CallVideoFragment callVideoFragment = this.videoCallFragment;
                if (callVideoFragment == null || !callVideoFragment.isVisible()) {
                    android.util.Log.d("TAG", "XXX x showAudioView();");
                }
                showVideoView();
            } else {
                displayCustomToast(getString(C5321R.string.error_low_bandwidth), 1);
            }
        }
    }

    /* access modifiers changed from: private */
    public void showAudioView() {
        if (LinphoneManager.getLc().getCurrentCall() != null && !this.isSpeakerEnabled) {
            LinphoneManager.getInstance().enableProximitySensing(true);
        }
        replaceFragmentVideoByAudio();
        displayAudioCall();
        showStatusBar();
        removeCallbacks();
    }

    /* access modifiers changed from: private */
    public void showVideoView() {
        if (!BluetoothManager.getInstance().isBluetoothHeadsetAvailable()) {
            Log.m6907w("Bluetooth not available, using speaker");
            LinphoneManager.getInstance().routeAudioToSpeaker();
            this.isSpeakerEnabled = true;
        }
        refreshInCallActions();
        LinphoneManager.getInstance().enableProximitySensing(false);
        replaceFragmentAudioByVideo();
        hideStatusBar();
    }

    private void displayNoCurrentCall(boolean z) {
        if (!z) {
            this.mActiveCallHeader.setVisibility(0);
            this.mNoCurrentCall.setVisibility(8);
            return;
        }
        this.mActiveCallHeader.setVisibility(8);
        this.mNoCurrentCall.setVisibility(0);
    }

    private void displayCallPaused(boolean z) {
        if (z) {
            this.mCallPaused.setVisibility(0);
        } else {
            this.mCallPaused.setVisibility(8);
        }
    }

    private void displayAudioCall() {
        this.mControlsLayout.setVisibility(0);
        this.mActiveCallHeader.setVisibility(0);
        this.callInfo.setVisibility(0);
        this.avatar_layout.setVisibility(0);
        this.switchCamera.setVisibility(8);
    }

    private void replaceFragmentVideoByAudio() {
        this.audioCallFragment = new CallAudioFragment();
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(C5321R.C5324id.fragmentContainer, this.audioCallFragment);
        try {
            beginTransaction.commitAllowingStateLoss();
        } catch (Exception unused) {
        }
    }

    private void replaceFragmentAudioByVideo() {
        this.videoCallFragment = new CallVideoFragment();
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(C5321R.C5324id.fragmentContainer, this.videoCallFragment);
        try {
            beginTransaction.commitAllowingStateLoss();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public void toggleMicro() {
        LinphoneCore lc = LinphoneManager.getLc();
        this.isMicMuted = !this.isMicMuted;
        lc.muteMic(this.isMicMuted);
        if (this.isMicMuted) {
            this.micro.setImageResource(C5321R.C5323drawable.micro_selected);
        } else {
            this.micro.setImageResource(C5321R.C5323drawable.micro_default);
        }
    }

    /* access modifiers changed from: protected */
    public void toggleSpeaker() {
        this.isSpeakerEnabled = !this.isSpeakerEnabled;
        if (LinphoneManager.getLc().getCurrentCall() != null) {
            if (isVideoEnabled(LinphoneManager.getLc().getCurrentCall())) {
                LinphoneManager.getInstance().enableProximitySensing(false);
            } else {
                LinphoneManager.getInstance().enableProximitySensing(!this.isSpeakerEnabled);
            }
        }
        if (this.isSpeakerEnabled) {
            LinphoneManager.getInstance().routeAudioToSpeaker();
            this.speaker.setImageResource(C5321R.C5323drawable.speaker_selected);
            LinphoneManager.getLc().enableSpeaker(this.isSpeakerEnabled);
            return;
        }
        Log.m6901d("Toggle speaker off, routing back to earpiece");
        LinphoneManager.getInstance().routeAudioToReceiver();
        this.speaker.setImageResource(C5321R.C5323drawable.speaker_default);
    }

    public void pauseOrResumeCall(LinphoneCall linphoneCall) {
        LinphoneCore lc = LinphoneManager.getLc();
        if (linphoneCall != null && LinphoneManager.getLc().getCurrentCall() == linphoneCall) {
            lc.pauseCall(linphoneCall);
            if (isVideoEnabled(LinphoneManager.getLc().getCurrentCall())) {
                this.isVideoCallPaused = true;
            }
            this.pause.setImageResource(C5321R.C5323drawable.pause_big_over_selected);
        } else if (linphoneCall != null && linphoneCall.getState() == LinphoneCall.State.Paused) {
            lc.resumeCall(linphoneCall);
            if (this.isVideoCallPaused) {
                this.isVideoCallPaused = false;
            }
            this.pause.setImageResource(C5321R.C5323drawable.pause_big_default);
        }
    }

    private void hangUp() {
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            LinphoneCall currentCall = lcIfManagerNotDestroyedOrNull.getCurrentCall();
            if (currentCall != null) {
                lcIfManagerNotDestroyedOrNull.terminateCall(currentCall);
            } else if (lcIfManagerNotDestroyedOrNull.isInConference()) {
                lcIfManagerNotDestroyedOrNull.terminateConference();
            } else {
                lcIfManagerNotDestroyedOrNull.terminateAllCalls();
            }
            showHomeActivity();
        }
    }

    public void displayVideoCall(boolean z) {
        if (z) {
            showStatusBar();
            this.mControlsLayout.setVisibility(0);
            this.mActiveCallHeader.setVisibility(0);
            this.callInfo.setVisibility(0);
            this.avatar_layout.setVisibility(8);
            this.callsList.setVisibility(0);
            if (this.cameraNumber > 1) {
                this.switchCamera.setVisibility(0);
                return;
            }
            return;
        }
        hideStatusBar();
        this.mControlsLayout.setVisibility(8);
        this.mActiveCallHeader.setVisibility(8);
        this.switchCamera.setVisibility(8);
        this.callsList.setVisibility(8);
    }

    public void displayVideoCallControlsIfHidden() {
        LinearLayout linearLayout = this.mControlsLayout;
        if (linearLayout != null) {
            if (linearLayout.getVisibility() != 0) {
                displayVideoCall(true);
            }
            resetControlsHidingCallBack();
        }
    }

    public void resetControlsHidingCallBack() {
        Handler handler;
        Runnable runnable;
        Handler handler2 = this.mControlsHandler;
        if (!(handler2 == null || (runnable = this.mControls) == null)) {
            handler2.removeCallbacks(runnable);
        }
        this.mControls = null;
        if (isVideoEnabled(LinphoneManager.getLc().getCurrentCall()) && (handler = this.mControlsHandler) != null) {
            C52276 r1 = new Runnable() {
                public void run() {
                    CallActivity.this.hideNumpad();
                    CallActivity.this.video.setEnabled(true);
                    CallActivity.this.transfer.setVisibility(4);
                    CallActivity.this.addCall.setVisibility(4);
                    CallActivity.this.conference.setVisibility(4);
                    CallActivity.this.displayVideoCall(false);
                    CallActivity.this.numpad.setVisibility(8);
                    CallActivity.this.options.setImageResource(C5321R.C5323drawable.options_default);
                }
            };
            this.mControls = r1;
            handler.postDelayed(r1, 4000);
        }
    }

    public void removeCallbacks() {
        Runnable runnable;
        Handler handler = this.mControlsHandler;
        if (!(handler == null || (runnable = this.mControls) == null)) {
            handler.removeCallbacks(runnable);
        }
        this.mControls = null;
    }

    /* access modifiers changed from: private */
    public void hideNumpad() {
        Numpad numpad2 = this.numpad;
        if (numpad2 != null && numpad2.getVisibility() == 0) {
            this.dialer.setImageResource(C5321R.C5323drawable.footer_dialer);
            this.numpad.setVisibility(8);
        }
    }

    private void hideOrDisplayNumpad() {
        Numpad numpad2 = this.numpad;
        if (numpad2 != null) {
            if (numpad2.getVisibility() == 0) {
                hideNumpad();
                return;
            }
            this.dialer.setImageResource(C5321R.C5323drawable.dialer_alt_back);
            this.numpad.setVisibility(0);
        }
    }

    private void hideOrDisplayAudioRoutes() {
        if (this.routeSpeaker.getVisibility() == 0) {
            this.routeSpeaker.setVisibility(4);
            this.routeBluetooth.setVisibility(4);
            this.routeEarpiece.setVisibility(4);
            return;
        }
        this.routeSpeaker.setVisibility(0);
        this.routeBluetooth.setVisibility(0);
        this.routeEarpiece.setVisibility(0);
    }

    private void hideOrDisplayCallOptions() {
        if (this.addCall.getVisibility() == 0) {
            this.options.setImageResource(C5321R.C5323drawable.options_default);
            if (this.isTransferAllowed) {
                this.transfer.setVisibility(4);
            }
            this.addCall.setVisibility(4);
            this.conference.setVisibility(4);
            return;
        }
        boolean z = false;
        if (this.isTransferAllowed) {
            this.transfer.setVisibility(0);
        }
        this.addCall.setVisibility(0);
        this.conference.setVisibility(0);
        this.options.setImageResource(C5321R.C5323drawable.options_selected);
        ImageView imageView = this.transfer;
        if (LinphoneManager.getLc().getCurrentCall() != null) {
            z = true;
        }
        imageView.setEnabled(z);
    }

    public void goBackToDialer() {
        Intent intent = new Intent();
        intent.putExtra("Transfer", false);
        setResult(1, intent);
        finish();
    }

    private void goBackToDialerAndDisplayTransferButton() {
        Intent intent = new Intent();
        intent.putExtra("Transfer", true);
        setResult(1, intent);
        finish();
    }

    private void goToChatList() {
        Intent intent = new Intent();
        intent.putExtra(ReactConst.CHAT, true);
        setResult(1, intent);
        finish();
    }

    public void acceptCallUpdate(boolean z) {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        LinphoneCall currentCall = LinphoneManager.getLc().getCurrentCall();
        if (currentCall != null) {
            LinphoneCallParams createCallParams = LinphoneManager.getLc().createCallParams(currentCall);
            if (z) {
                createCallParams.setVideoEnabled(true);
                LinphoneManager.getLc().enableVideo(true, true);
            }
            try {
                LinphoneManager.getLc().acceptCallUpdate(currentCall, createCallParams);
            } catch (LinphoneCoreException e) {
                Log.m6903e(e);
            }
        }
    }

    public void startIncomingCallActivity() {
        startActivity(new Intent(this, CallIncomingActivity.class));
    }

    public void hideStatusBar() {
        if (!isTablet()) {
            findViewById(C5321R.C5324id.status).setVisibility(8);
            findViewById(C5321R.C5324id.fragmentContainer).setPadding(0, 0, 0, 0);
        }
    }

    public void showStatusBar() {
        if (!isTablet()) {
            StatusFragment statusFragment = this.status;
            if (statusFragment != null && !statusFragment.isVisible()) {
                this.status.getView().setVisibility(0);
            }
            findViewById(C5321R.C5324id.status).setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public void showAcceptCallUpdateDialog() {
        this.dialog = new Dialog(this);
        this.dialog.requestWindowFeature(1);
        ColorDrawable colorDrawable = new ColorDrawable(ContextCompat.getColor(this, C5321R.C5322color.colorC));
        colorDrawable.setAlpha(200);
        this.dialog.setContentView(C5321R.layout.dialog);
        this.dialog.getWindow().setLayout(-1, -1);
        this.dialog.getWindow().setBackgroundDrawable(colorDrawable);
        ((TextView) this.dialog.findViewById(C5321R.C5324id.customText)).setText(getResources().getString(C5321R.string.add_video_dialog));
        Button button = (Button) this.dialog.findViewById(C5321R.C5324id.delete_button);
        button.setText(C5321R.string.accept);
        Button button2 = (Button) this.dialog.findViewById(C5321R.C5324id.cancel);
        button2.setText(C5321R.string.decline);
        this.isVideoAsk = true;
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int checkPermission = CallActivity.this.getPackageManager().checkPermission("android.permission.CAMERA", CallActivity.this.getPackageName());
                Object[] objArr = new Object[1];
                StringBuilder sb = new StringBuilder();
                sb.append("[Permission] Camera permission is ");
                sb.append(checkPermission == 0 ? "granted" : "denied");
                objArr[0] = sb.toString();
                Log.m6905i(objArr);
                if (checkPermission == 0) {
                    CallActivity.instance().acceptCallUpdate(true);
                } else {
                    CallActivity.this.checkAndRequestPermission("android.permission.CAMERA", 202);
                }
                boolean unused = CallActivity.this.isVideoAsk = false;
                CallActivity.this.dialog.dismiss();
                Dialog unused2 = CallActivity.this.dialog = null;
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (CallActivity.isInstanciated()) {
                    CallActivity.instance().acceptCallUpdate(false);
                }
                boolean unused = CallActivity.this.isVideoAsk = false;
                CallActivity.this.dialog.dismiss();
                Dialog unused2 = CallActivity.this.dialog = null;
            }
        });
        this.dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        instance = this;
        LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(CallMaker.PUSH_CALL_BROADCAST).putExtra("KEY_ACTION", 5));
        super.onResume();
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.addListener(this.mListener);
        }
        this.isSpeakerEnabled = LinphoneManager.getLc().isSpeakerEnabled();
        refreshIncallUi();
        handleViewIntent();
        StatusFragment statusFragment = this.status;
        if (!(statusFragment == null || !statusFragment.getisZrtpAsk() || lcIfManagerNotDestroyedOrNull == null)) {
            this.status.showZRTPDialog(lcIfManagerNotDestroyedOrNull.getCurrentCall());
        }
        if (!isVideoEnabled(LinphoneManager.getLc().getCurrentCall()) && !this.isSpeakerEnabled) {
            LinphoneManager.getInstance().enableProximitySensing(true);
            removeCallbacks();
        }
    }

    private void handleViewIntent() {
        LinphoneCall currentCall;
        Intent intent = getIntent();
        if (intent != null && intent.getAction() == "android.intent.action.VIEW" && (currentCall = LinphoneManager.getLc().getCurrentCall()) != null && isVideoEnabled(currentCall)) {
            LinphonePlayer player = currentCall.getPlayer();
            String path = intent.getData().getPath();
            Log.m6905i("Openning " + path);
            if (player.open(path) == -1) {
                String str = "Could not open " + path;
                Log.m6903e(str);
                Toast.makeText(getApplicationContext(), str, 0).show();
                return;
            }
            Log.m6905i("Start playing");
            if (player.start() == -1) {
                player.close();
                String str2 = "Could not start playing " + path;
                Log.m6903e(str2);
                Toast.makeText(getApplicationContext(), str2, 0).show();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        Runnable runnable;
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.removeListener(this.mListener);
        }
        super.onPause();
        Handler handler = this.mControlsHandler;
        if (!(handler == null || (runnable = this.mControls) == null)) {
            handler.removeCallbacks(runnable);
        }
        this.mControls = null;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        Runnable runnable;
        android.util.Log.d("TAG", " XXX onDestroy CallActivity");
        unregisterReceiver(this.headsetReceiver);
        Handler handler = this.mControlsHandler;
        if (!(handler == null || (runnable = this.mControls) == null)) {
            handler.removeCallbacks(runnable);
        }
        this.mControls = null;
        this.mControlsHandler = null;
        unbindDrawables(findViewById(C5321R.C5324id.topLayout));
        Timer timer2 = this.mTimer;
        if (timer2 != null) {
            timer2.cancel();
        }
        instance = null;
        super.onDestroy();
        System.gc();
    }

    private void unbindDrawables(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback((Drawable.Callback) null);
        }
        if (view instanceof ImageView) {
            view.setOnClickListener((View.OnClickListener) null);
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

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!LinphoneUtils.onKeyVolumeAdjust(i) && !LinphoneUtils.onKeyBackGoHome(this, i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public void onBackPressed() {
        if (this.dialog != null) {
            acceptCallUpdate(false);
            this.dialog.dismiss();
            this.dialog = null;
        }
    }

    public void bindAudioFragment(CallAudioFragment callAudioFragment) {
        this.audioCallFragment = callAudioFragment;
    }

    public void bindVideoFragment(CallVideoFragment callVideoFragment) {
        this.videoCallFragment = callVideoFragment;
    }

    private void displayCurrentCall(LinphoneCall linphoneCall) {
        setContactInformation((TextView) findViewById(C5321R.C5324id.current_contact_name), this.contactPicture, linphoneCall.getRemoteAddress());
        registerCallDurationTimer((View) null, linphoneCall);
    }

    private void displayPausedCalls(Resources resources, LinphoneCall linphoneCall, int i) {
        LinearLayout linearLayout;
        if (linphoneCall == null) {
            linearLayout = (LinearLayout) this.inflater.inflate(C5321R.layout.conference_paused_row, this.container, false);
            linearLayout.setId(i + 1);
            linearLayout.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    CallActivity.this.pauseOrResumeConference();
                }
            });
        } else {
            linearLayout = (LinearLayout) this.inflater.inflate(C5321R.layout.call_inactive_row, this.container, false);
            linearLayout.setId(i + 1);
            setContactInformation((TextView) linearLayout.findViewById(C5321R.C5324id.contact_name), (ImageView) linearLayout.findViewById(C5321R.C5324id.contact_picture), linphoneCall.getRemoteAddress());
            displayCallStatusIconAndReturnCallPaused(linearLayout, linphoneCall);
            registerCallDurationTimer(linearLayout, linphoneCall);
        }
        this.callsList.addView(linearLayout);
    }

    private void setContactInformation(TextView textView, ImageView imageView, LinphoneAddress linphoneAddress) {
        LinphoneContact findContactFromAddress = ContactsManager.getInstance().findContactFromAddress(linphoneAddress);
        if (findContactFromAddress == null) {
            textView.setText(LinphoneUtils.getAddressDisplayName(linphoneAddress));
            imageView.setImageBitmap(ContactsManager.getInstance().getDefaultAvatarBitmap());
            return;
        }
        textView.setText(findContactFromAddress.getFullName());
        LinphoneUtils.setImagePictureFromUri(imageView.getContext(), imageView, findContactFromAddress.getPhotoUri(), findContactFromAddress.getThumbnailUri());
    }

    private boolean displayCallStatusIconAndReturnCallPaused(LinearLayout linearLayout, LinphoneCall linphoneCall) {
        boolean z;
        boolean z2;
        ImageView imageView = (ImageView) linearLayout.findViewById(C5321R.C5324id.call_pause);
        imageView.setTag(linphoneCall);
        imageView.setOnClickListener(this);
        if (linphoneCall.getState() == LinphoneCall.State.Paused || linphoneCall.getState() == LinphoneCall.State.PausedByRemote || linphoneCall.getState() == LinphoneCall.State.Pausing) {
            imageView.setImageResource(C5321R.C5323drawable.pause);
            z2 = true;
        } else if (linphoneCall.getState() == LinphoneCall.State.OutgoingInit || linphoneCall.getState() == LinphoneCall.State.OutgoingProgress || linphoneCall.getState() == LinphoneCall.State.OutgoingRinging) {
            z2 = false;
        } else {
            z = this.isConferenceRunning && linphoneCall.isInConference();
            z2 = false;
            if (z2 && !z) {
                return false;
            }
        }
        z = false;
        return z2 ? true : true;
    }

    private void registerCallDurationTimer(View view, LinphoneCall linphoneCall) {
        Chronometer chronometer;
        int duration = linphoneCall.getDuration();
        if (duration != 0 || linphoneCall.getState() == LinphoneCall.State.StreamsRunning) {
            if (view == null) {
                chronometer = (Chronometer) findViewById(C5321R.C5324id.current_call_timer);
            } else {
                chronometer = (Chronometer) view.findViewById(C5321R.C5324id.call_timer);
            }
            if (chronometer != null) {
                chronometer.setBase(SystemClock.elapsedRealtime() - ((long) (duration * 1000)));
                chronometer.start();
                return;
            }
            throw new IllegalArgumentException("no callee_duration view found");
        }
    }

    public void refreshCallList(Resources resources) {
        this.isConferenceRunning = LinphoneManager.getLc().isInConference();
        List<LinphoneCall> callsInState = LinphoneUtils.getCallsInState(LinphoneManager.getLc(), Arrays.asList(new LinphoneCall.State[]{LinphoneCall.State.PausedByRemote}));
        if (LinphoneManager.getLc().getCallsNb() > 1) {
            this.callsList.setVisibility(0);
        }
        if (LinphoneManager.getLc().getCurrentCall() != null) {
            displayNoCurrentCall(false);
            if (!isVideoEnabled(LinphoneManager.getLc().getCurrentCall()) || this.isConferenceRunning || callsInState.size() != 0) {
                displayAudioCall();
            } else {
                displayVideoCall(false);
            }
        } else {
            showAudioView();
            displayNoCurrentCall(true);
            if (LinphoneManager.getLc().getCallsNb() == 1) {
                this.callsList.setVisibility(0);
            }
        }
        if (this.isConferenceRunning) {
            displayConference(true);
        } else {
            displayConference(false);
        }
        LinearLayout linearLayout = this.callsList;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            if (LinphoneManager.getLc().getCallsNb() == 0) {
                goBackToDialer();
                hangUp();
                return;
            }
            boolean z = false;
            int i = 0;
            for (LinphoneCall linphoneCall : LinphoneManager.getLc().getCalls()) {
                if (linphoneCall.isInConference() && !this.isConferenceRunning) {
                    i++;
                    z = true;
                } else if (linphoneCall == LinphoneManager.getLc().getCurrentCall() || linphoneCall.isInConference()) {
                    displayCurrentCall(linphoneCall);
                } else {
                    displayPausedCalls(resources, linphoneCall, i);
                    i++;
                }
            }
            if (!this.isConferenceRunning && z) {
                this.callsList.setVisibility(0);
                displayPausedCalls(resources, (LinphoneCall) null, i);
            }
        }
        if (callsInState.size() == 1) {
            displayCallPaused(true);
        } else {
            displayCallPaused(false);
        }
    }

    /* access modifiers changed from: private */
    public void exitConference(LinphoneCall linphoneCall) {
        LinphoneCore lc = LinphoneManager.getLc();
        if (linphoneCall.isInConference()) {
            lc.removeFromConference(linphoneCall);
            if (lc.getConferenceSize() <= 1) {
                lc.leaveConference();
            }
        }
        refreshIncallUi();
    }

    private void enterConference() {
        LinphoneManager.getLc().addAllToConference();
    }

    public void pauseOrResumeConference() {
        LinphoneCore lc = LinphoneManager.getLc();
        this.conferenceStatus = (ImageView) findViewById(C5321R.C5324id.conference_pause);
        if (this.conferenceStatus != null) {
            if (lc.isInConference()) {
                this.conferenceStatus.setImageResource(C5321R.C5323drawable.pause_big_over_selected);
                lc.leaveConference();
            } else {
                this.conferenceStatus.setImageResource(C5321R.C5323drawable.pause_big_default);
                lc.enterConference();
            }
        }
        refreshCallList(getResources());
    }

    private void displayConferenceParticipant(int i, final LinphoneCall linphoneCall) {
        LinearLayout linearLayout = (LinearLayout) this.inflater.inflate(C5321R.layout.conf_call_control_row, this.container, false);
        this.conferenceList.setId(i + 1);
        TextView textView = (TextView) linearLayout.findViewById(C5321R.C5324id.contactNameOrNumber);
        LinphoneContact findContactFromAddress = ContactsManager.getInstance().findContactFromAddress(linphoneCall.getRemoteAddress());
        if (findContactFromAddress == null) {
            textView.setText(linphoneCall.getRemoteAddress().getUserName());
        } else {
            textView.setText(findContactFromAddress.getFullName());
        }
        registerCallDurationTimer(linearLayout, linphoneCall);
        ((ImageView) linearLayout.findViewById(C5321R.C5324id.quitConference)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                CallActivity.this.exitConference(linphoneCall);
            }
        });
        this.conferenceList.addView(linearLayout);
    }

    private void displayConferenceHeader() {
        this.conferenceList.setVisibility(0);
        RelativeLayout relativeLayout = (RelativeLayout) this.inflater.inflate(C5321R.layout.conference_header, this.container, false);
        this.conferenceStatus = (ImageView) relativeLayout.findViewById(C5321R.C5324id.conference_pause);
        this.conferenceStatus.setOnClickListener(this);
        this.conferenceList.addView(relativeLayout);
    }

    private void displayConference(boolean z) {
        if (z) {
            this.mControlsLayout.setVisibility(0);
            this.mActiveCallHeader.setVisibility(8);
            this.mNoCurrentCall.setVisibility(8);
            this.conferenceList.removeAllViews();
            displayConferenceHeader();
            int i = 1;
            for (LinphoneCall linphoneCall : LinphoneManager.getLc().getCalls()) {
                if (linphoneCall.isInConference()) {
                    displayConferenceParticipant(i, linphoneCall);
                    i++;
                }
            }
            this.conferenceList.setVisibility(0);
            return;
        }
        this.conferenceList.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public void displayMissedChats() {
        int i = 0;
        for (LinphoneChatRoom unreadMessagesCount : LinphoneManager.getLc().getChatRooms()) {
            i += unreadMessagesCount.getUnreadMessagesCount();
        }
        if (i > 0) {
            this.missedChats.setText(i + "");
            this.missedChats.setVisibility(0);
            return;
        }
        this.missedChats.clearAnimation();
        this.missedChats.setVisibility(8);
    }

    private void formatText(TextView textView, String str, String str2) {
        textView.setText(Html.fromHtml("<b>" + str + " </b>" + str2));
    }

    private String getEncoderText(String str) {
        String str2 = this.mEncoderTexts.get(str);
        if (str2 != null) {
            return str2;
        }
        String encoderText = LinphoneManager.getLc().getMSFactory().getEncoderText(str);
        this.mEncoderTexts.put(str, encoderText);
        return encoderText;
    }

    private String getDecoderText(String str) {
        String str2 = this.mDecoderTexts.get(str);
        if (str2 != null) {
            return str2;
        }
        String decoderText = LinphoneManager.getLc().getMSFactory().getDecoderText(str);
        this.mDecoderTexts.put(str, decoderText);
        return decoderText;
    }

    /* access modifiers changed from: private */
    public void displayMediaStats(LinphoneCallParams linphoneCallParams, LinphoneCallStats linphoneCallStats, PayloadType payloadType, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, boolean z, TextView textView16) {
        String str;
        View view2 = view;
        TextView textView17 = textView;
        if (linphoneCallStats != null) {
            String str2 = null;
            view.setVisibility(0);
            textView.setVisibility(0);
            if (payloadType != null) {
                str2 = payloadType.getMime();
                String string = getString(C5321R.string.call_stats_codec);
                TextView textView18 = textView2;
                formatText(textView2, string, str2 + " / " + (payloadType.getRate() / 1000) + "kHz");
            }
            if (str2 != null) {
                formatText(textView10, getString(C5321R.string.call_stats_encoder_name), getEncoderText(str2));
                formatText(textView11, getString(C5321R.string.call_stats_decoder_name), getDecoderText(str2));
            }
            String string2 = getString(C5321R.string.call_stats_download);
            TextView textView19 = textView3;
            formatText(textView3, string2, String.valueOf((int) linphoneCallStats.getDownloadBandwidth()) + " kbits/s");
            String string3 = getString(C5321R.string.call_stats_upload);
            formatText(textView4, string3, String.valueOf((int) linphoneCallStats.getUploadBandwidth()) + " kbits/s");
            if (z) {
                String string4 = getString(C5321R.string.call_stats_estimated_download);
                formatText(textView5, string4, String.valueOf((int) linphoneCallStats.getEstimatedDownloadBandwidth()) + " kbits/s");
            }
            formatText(textView6, getString(C5321R.string.call_stats_ice), linphoneCallStats.getIceState().toString());
            String string5 = getString(C5321R.string.call_stats_ip);
            if (linphoneCallStats.getIpFamilyOfRemote() == LinphoneCallStats.LinphoneAddressFamily.INET_6.getInt()) {
                str = "IpV6";
            } else {
                str = linphoneCallStats.getIpFamilyOfRemote() == LinphoneCallStats.LinphoneAddressFamily.INET.getInt() ? "IpV4" : "Unknown";
            }
            formatText(textView7, string5, str);
            String string6 = getString(C5321R.string.call_stats_sender_loss_rate);
            formatText(textView8, string6, new DecimalFormat("##.##").format((double) linphoneCallStats.getSenderLossRate()) + "%");
            String string7 = getString(C5321R.string.call_stats_receiver_loss_rate);
            formatText(textView9, string7, new DecimalFormat("##.##").format((double) linphoneCallStats.getReceiverLossRate()) + "%");
            if (z) {
                String string8 = getString(C5321R.string.call_stats_video_resolution_sent);
                formatText(textView12, string8, "↑ " + linphoneCallParams.getSentVideoSize().toDisplayableString());
                String string9 = getString(C5321R.string.call_stats_video_resolution_received);
                formatText(textView13, string9, "↓ " + linphoneCallParams.getReceivedVideoSize().toDisplayableString());
                String string10 = getString(C5321R.string.call_stats_video_fps_sent);
                formatText(textView14, string10, "↑ " + linphoneCallParams.getSentFramerate());
                String string11 = getString(C5321R.string.call_stats_video_fps_received);
                formatText(textView15, string11, "↓ " + linphoneCallParams.getReceivedFramerate());
                return;
            }
            String string12 = getString(C5321R.string.call_stats_jitter_buffer);
            formatText(textView16, string12, new DecimalFormat("##.##").format((double) linphoneCallStats.getJitterBufferSize()) + " ms");
            return;
        }
        view.setVisibility(8);
        textView.setVisibility(8);
    }

    public void initCallStatsRefresher(LinphoneCall linphoneCall, View view) {
        View view2 = view;
        if (this.mTimer == null || this.mTask == null) {
            final TextView textView = (TextView) view2.findViewById(C5321R.C5324id.call_stats_audio);
            final TextView textView2 = (TextView) view2.findViewById(C5321R.C5324id.call_stats_video);
            final TextView textView3 = (TextView) view2.findViewById(C5321R.C5324id.codec_audio);
            final TextView textView4 = (TextView) view2.findViewById(C5321R.C5324id.codec_video);
            final TextView textView5 = (TextView) view2.findViewById(C5321R.C5324id.encoder_audio);
            final TextView textView6 = (TextView) view2.findViewById(C5321R.C5324id.decoder_audio);
            final TextView textView7 = (TextView) view2.findViewById(C5321R.C5324id.encoder_video);
            final TextView textView8 = (TextView) view2.findViewById(C5321R.C5324id.decoder_video);
            final TextView textView9 = (TextView) view2.findViewById(C5321R.C5324id.downloadBandwith_audio);
            final TextView textView10 = (TextView) view2.findViewById(C5321R.C5324id.uploadBandwith_audio);
            final TextView textView11 = (TextView) view2.findViewById(C5321R.C5324id.downloadBandwith_video);
            final TextView textView12 = (TextView) view2.findViewById(C5321R.C5324id.uploadBandwith_video);
            final TextView textView13 = (TextView) view2.findViewById(C5321R.C5324id.estimatedDownloadBandwidth_video);
            final TextView textView14 = (TextView) view2.findViewById(C5321R.C5324id.ice_audio);
            final TextView textView15 = (TextView) view2.findViewById(C5321R.C5324id.ice_video);
            final TextView textView16 = (TextView) view2.findViewById(C5321R.C5324id.video_resolution_sent);
            final TextView textView17 = (TextView) view2.findViewById(C5321R.C5324id.video_resolution_received);
            final TextView textView18 = (TextView) view2.findViewById(C5321R.C5324id.video_fps_sent);
            final TextView textView19 = (TextView) view2.findViewById(C5321R.C5324id.video_fps_received);
            final TextView textView20 = (TextView) view2.findViewById(C5321R.C5324id.senderLossRateAudio);
            final TextView textView21 = (TextView) view2.findViewById(C5321R.C5324id.receiverLossRateAudio);
            final TextView textView22 = (TextView) view2.findViewById(C5321R.C5324id.senderLossRateVideo);
            final TextView textView23 = (TextView) view2.findViewById(C5321R.C5324id.receiverLossRateVideo);
            final TextView textView24 = (TextView) view2.findViewById(C5321R.C5324id.ip_audio);
            final TextView textView25 = (TextView) view2.findViewById(C5321R.C5324id.ip_video);
            final TextView textView26 = (TextView) view2.findViewById(C5321R.C5324id.jitterBufferAudio);
            final View findViewById = view2.findViewById(C5321R.C5324id.callStatsVideo);
            final View findViewById2 = view2.findViewById(C5321R.C5324id.callStatsAudio);
            this.mTimer = new Timer();
            C522111 r31 = r0;
            final LinphoneCall linphoneCall2 = linphoneCall;
            C522111 r0 = new TimerTask(this) {
                final /* synthetic */ CallActivity this$0;

                {
                    this.this$0 = r3;
                }

                public void run() {
                    if (linphoneCall2 == null) {
                        this.this$0.mTimer.cancel();
                    } else if (textView == null || textView3 == null || textView11 == null || textView13 == null || textView14 == null || textView16 == null || findViewById == null || textView2 == null || textView25 == null || textView24 == null || textView4 == null || textView9 == null || textView10 == null || textView12 == null || textView15 == null || textView17 == null) {
                        this.this$0.mTimer.cancel();
                    } else {
                        this.this$0.mHandler.post(new Runnable() {
                            public void run() {
                                LinphoneCallParams currentParams;
                                if (LinphoneManager.getLcIfManagerNotDestroyedOrNull() != null) {
                                    synchronized (LinphoneManager.getLc()) {
                                        if (LinphoneActivity.isInstanciated() && (currentParams = linphoneCall2.getCurrentParams()) != null) {
                                            LinphoneCallStats audioStats = linphoneCall2.getAudioStats();
                                            LinphoneCallStats linphoneCallStats = null;
                                            if (currentParams.getVideoEnabled()) {
                                                linphoneCallStats = linphoneCall2.getVideoStats();
                                            }
                                            LinphoneCallStats linphoneCallStats2 = linphoneCallStats;
                                            PayloadType usedAudioCodec = currentParams.getUsedAudioCodec();
                                            PayloadType usedVideoCodec = currentParams.getUsedVideoCodec();
                                            CallActivity callActivity = C522111.this.this$0;
                                            View view = findViewById2;
                                            TextView textView = textView;
                                            TextView textView2 = textView3;
                                            TextView textView3 = textView9;
                                            TextView textView4 = textView10;
                                            TextView textView5 = textView14;
                                            TextView textView6 = textView24;
                                            TextView textView7 = textView20;
                                            TextView textView8 = textView21;
                                            TextView textView9 = textView8;
                                            callActivity.displayMediaStats(currentParams, audioStats, usedAudioCodec, view, textView, textView2, textView3, textView4, (TextView) null, textView5, textView6, textView7, textView9, textView5, textView6, (TextView) null, (TextView) null, (TextView) null, (TextView) null, false, textView26);
                                            CallActivity callActivity2 = C522111.this.this$0;
                                            View view2 = findViewById;
                                            TextView textView10 = textView2;
                                            TextView textView11 = textView4;
                                            TextView textView12 = textView11;
                                            TextView textView13 = textView12;
                                            TextView textView14 = textView13;
                                            TextView textView15 = textView15;
                                            TextView textView16 = textView25;
                                            TextView textView17 = textView22;
                                            TextView textView18 = textView23;
                                            TextView textView19 = textView7;
                                            TextView textView20 = textView8;
                                            TextView textView21 = textView16;
                                            TextView textView22 = textView17;
                                            TextView textView23 = textView18;
                                            TextView textView24 = textView22;
                                            TextView textView25 = textView23;
                                            TextView textView26 = textView20;
                                            TextView textView27 = textView21;
                                            LinphoneCallParams linphoneCallParams = currentParams;
                                            TextView textView28 = textView19;
                                            TextView textView29 = textView18;
                                            callActivity2.displayMediaStats(linphoneCallParams, linphoneCallStats2, usedVideoCodec, view2, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView29, textView28, textView26, textView27, textView24, textView25, textView19, true, (TextView) null);
                                        }
                                    }
                                }
                            }
                        });
                    }
                }
            };
            this.mTask = r31;
            this.mTimer.scheduleAtFixedRate(this.mTask, 0, 1000);
        }
    }

    public class HeadsetReceiver extends BroadcastReceiver {
        public HeadsetReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if (!BluetoothManager.getInstance().isBluetoothHeadsetAvailable() && intent.hasExtra("state")) {
                int intExtra = intent.getIntExtra("state", 0);
                if (intExtra != 0) {
                    if (intExtra == 1) {
                        LinphoneManager.getInstance().routeAudioToReceiver();
                        CallActivity callActivity = CallActivity.this;
                        boolean unused = callActivity.oldIsSpeakerEnabled = callActivity.isSpeakerEnabled;
                        boolean unused2 = CallActivity.this.isSpeakerEnabled = false;
                        CallActivity.this.speaker.setEnabled(false);
                    }
                } else if (CallActivity.this.oldIsSpeakerEnabled) {
                    LinphoneManager.getInstance().routeAudioToSpeaker();
                    boolean unused3 = CallActivity.this.isSpeakerEnabled = true;
                    CallActivity.this.speaker.setEnabled(true);
                }
                CallActivity.this.refreshInCallActions();
            }
        }
    }

    @Subscribe
    public void handleSomethingElse(MessageEvent messageEvent) {
        android.util.Log.d("TAG", "XXX handleSomethingElse: CA");
        finish();
    }

    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    public void onStop() {
        EventBus.getDefault().unregister(this);
        LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(CallMaker.PUSH_CALL_BROADCAST).putExtra("KEY_ACTION", 6));
        super.onStop();
    }

    private String getDoorUrl() {
        return getFromSharedByKey("open_door", "");
    }

    private String getDtmf() {
        return getFromSharedByKey(SipParametrs.DTMF, "");
    }

    private String getUrlPreview() {
        return getFromSharedByKey(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, "");
    }

    private int getFps() {
        return Integer.parseInt(getFromSharedByKey(SipParametrs.FPS, "100"));
    }

    private String getMjpeg() {
        return getFromSharedByKey(SipParametrs.MJPEG, "");
    }

    private String getFromSharedPref() {
        return getSharedPreferences(FCM.SIP, 0).getString(FCM.SIP, "");
    }

    private String getFromSharedByKey(String str, String str2) {
        try {
            String string = new JSONObject(getFromSharedPref()).getString(str);
            if (string != null) {
                return string;
            }
            String stringExtra = getIntent().getStringExtra(str);
            return stringExtra == null ? str2 : stringExtra;
        } catch (JSONException unused) {
            return str2;
        }
    }

    private String getVideoSource() {
        return getFromSharedByKey(SipParametrs.VIDEO_SOURCE, FCM.SIP);
    }
}
