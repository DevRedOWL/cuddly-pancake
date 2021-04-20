package org.linphone;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONException;
import org.json.JSONObject;
import org.linphone.core.LinphoneCall;
import org.linphone.core.LinphoneCallParams;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreListenerBase;
import org.linphone.p054ui.CircleLabelView;
import org.linphone.p054ui.LinphoneSliders;
import org.linphone.p054ui.MjpegView;
import p035ru.unicorn.ujin.data.realm.SipParametrs;
import p035ru.unicorn.ujin.data.service.FCM;
import p035ru.unicorn.ujin.util.CallMaker;

public class CallIncomingActivity extends LinphoneGenericActivity implements LinphoneSliders.LinphoneSliderTriggered, MjpegView.OnStartStream {
    private static int DEFAULT_UPDATE_TIME_IN_SEC = 2;
    private static CallIncomingActivity instance;
    private boolean alreadyAcceptedOrDeniedCall;
    private CircleLabelView answerView;
    private float answerX;
    private TextView appLabel;
    private boolean begin;
    private CardView cvImage;
    private CardView cvMjpeg;
    private float declineX;
    private CircleLabelView discardView;
    private String dtmf;
    Runnable finishRunnable = new Runnable() {
        public void run() {
            Log.d("TAG", "ZZZ 3 ");
            CallIncomingActivity.this.finish();
        }
    };
    /* access modifiers changed from: private */
    public long fps = TimeUnit.SECONDS.toMillis(2);
    private FrameLayout frame;
    /* access modifiers changed from: private */
    public Handler handler;
    /* access modifiers changed from: private */
    public Handler handlerRepeater = new Handler();
    /* access modifiers changed from: private */
    public ImageView image;
    private LinearLayout llMjpeg;
    /* access modifiers changed from: private */
    public LinphoneCall mCall;
    private LinphoneCoreListenerBase mListener;
    private String mjpeg;
    private float oldMove;
    private String openDoorUrl;
    private CircleLabelView openView;
    /* access modifiers changed from: private */
    public String prview;
    Runnable repeatRunnable = new Runnable() {
        public void run() {
            if (CallIncomingActivity.this.mCall == null) {
                CallIncomingActivity.this.lookupCurrentCall();
            }
            if (CallIncomingActivity.this.mCall == null) {
                Log.d("TAG", "ZZZ 4 ");
                CallIncomingActivity.this.finish();
            } else {
                CallIncomingActivity.this.startCall();
            }
            CallIncomingActivity.this.handlerRepeater.removeCallbacks(CallIncomingActivity.this.repeatRunnable);
        }
    };
    /* access modifiers changed from: private */
    public boolean stopRunnable = false;
    private MjpegView surfaceView;
    Runnable updatePreviewRunnable = new Runnable() {
        public void run() {
            if (!CallIncomingActivity.this.stopRunnable) {
                Picasso picasso = Picasso.get();
                picasso.load(CallIncomingActivity.this.prview + "&" + System.currentTimeMillis()).noFade().noPlaceholder().error(C5321R.C5323drawable.ic_svg_ring).into(CallIncomingActivity.this.image, new Callback() {
                    public void onSuccess() {
                        Log.d("TAG", "XXX preview s   " + CallIncomingActivity.this.fps + " " + CallIncomingActivity.this.prview);
                        CallIncomingActivity.this.handler.postDelayed(CallIncomingActivity.this.updatePreviewRunnable, CallIncomingActivity.this.fps);
                    }

                    public void onError(Exception exc) {
                        Log.d("TAG", "XXX preview e  " + exc.getMessage() + " " + CallIncomingActivity.this.fps + " " + CallIncomingActivity.this.prview);
                        CallIncomingActivity.this.handler.postDelayed(CallIncomingActivity.this.updatePreviewRunnable, CallIncomingActivity.this.fps);
                    }
                });
            }
        }
    };
    private CallVideoFragment videoCallFragment;

    /* access modifiers changed from: private */
    public void startCall() {
    }

    public void onLeftHandleTriggered() {
    }

    public void onRightHandleTriggered() {
    }

    public void onStreamNotStarting() {
    }

    public static CallIncomingActivity instance() {
        return instance;
    }

    public static boolean isInstanciated() {
        return instance != null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        LinphoneCall linphoneCall;
        super.onCreate(bundle);
        Log.d("TAG", "XX onResume CIA");
        if (getResources().getBoolean(C5321R.bool.orientation_portrait_only)) {
            setRequestedOrientation(1);
        }
        checkPermission();
        checkAndRequestCallPermissions();
        try {
            LinphonePreferences.instance().setIncTimeout(120);
            LinphonePreferences.instance().setInCallTimeout(120);
        } catch (Exception unused) {
        }
        getWindow().addFlags(128);
        setContentView(C5321R.layout.call_incoming_new);
        getWindow().addFlags(6815744);
        int i = getResources().getDisplayMetrics().widthPixels;
        lookupCurrentCall();
        if (!(LinphonePreferences.instance() == null || (linphoneCall = this.mCall) == null || linphoneCall.getRemoteParams() == null || !LinphonePreferences.instance().shouldAutomaticallyAcceptVideoRequests())) {
            this.mCall.getRemoteParams().getVideoEnabled();
        }
        this.frame = (FrameLayout) findViewById(C5321R.C5324id.frame);
        this.image = (ImageView) findViewById(C5321R.C5324id.image);
        this.answerView = (CircleLabelView) findViewById(C5321R.C5324id.answer);
        this.openView = (CircleLabelView) findViewById(C5321R.C5324id.open);
        this.discardView = (CircleLabelView) findViewById(C5321R.C5324id.discard);
        this.answerView.setArrowOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                CallIncomingActivity.this.lambda$onCreate$0$CallIncomingActivity(view);
            }
        });
        this.openView.setArrowOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                CallIncomingActivity.this.lambda$onCreate$1$CallIncomingActivity(view);
            }
        });
        this.discardView.setArrowOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                CallIncomingActivity.this.lambda$onCreate$2$CallIncomingActivity(view);
            }
        });
        this.appLabel = (TextView) findViewById(C5321R.C5324id.label_first);
        this.appLabel.setText(getApplicationName());
        this.surfaceView = (MjpegView) findViewById(C5321R.C5324id.mjpeg);
        this.surfaceView.setMode(1);
        this.surfaceView.setAdjustHeight(true);
        this.surfaceView.setOnStartStream(this);
        this.llMjpeg = (LinearLayout) findViewById(C5321R.C5324id.ll_mjpeg);
        this.mListener = new LinphoneCoreListenerBase() {
            public void callState(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneCall.State state, String str) {
                Log.d("TAG", "XXX xxx State.IncomingReceived " + state + " " + str);
                if (linphoneCall == CallIncomingActivity.this.mCall && LinphoneCall.State.CallEnd == state && CallIncomingActivity.this.handler != null) {
                    CallIncomingActivity.this.handler.postDelayed(CallIncomingActivity.this.finishRunnable, 4000);
                }
                if (state == LinphoneCall.State.StreamsRunning) {
                    org.linphone.mediastream.Log.m6903e("CallIncommingActivity - onCreate -  State.StreamsRunning - speaker = " + LinphoneManager.getLc().isSpeakerEnabled());
                    LinphoneManager.getLc().enableSpeaker(LinphoneManager.getLc().isSpeakerEnabled());
                }
                if (LinphoneCall.State.IncomingReceived == state) {
                    Log.d("TAG", "XXX xxx State.IncomingReceived 11 " + CallIncomingActivity.this.mCall);
                    if (CallIncomingActivity.this.mCall != null) {
                        CallIncomingActivity.this.lookupCurrentCall();
                    }
                    CallIncomingActivity.this.handler.removeCallbacks(CallIncomingActivity.this.finishRunnable);
                }
            }
        };
        instance = this;
    }

    public /* synthetic */ void lambda$onCreate$0$CallIncomingActivity(View view) {
        answer();
    }

    public /* synthetic */ void lambda$onCreate$1$CallIncomingActivity(View view) {
        openDoor();
    }

    public /* synthetic */ void lambda$onCreate$2$CallIncomingActivity(View view) {
        decline();
    }

    private void openDoor() {
        if (getDoorUrl() != null && !getDoorUrl().isEmpty()) {
            LinphoneManager.getInstance().stopRinging();
            new OpenDoorSignalSend().execute(new String[]{getDoorUrl(), getDtmf()});
        } else if (getDtmf() != null && !getDtmf().isEmpty()) {
            answerSilent();
        }
    }

    private void answerSilent() {
        if (this.alreadyAcceptedOrDeniedCall) {
            sendDtmf();
            return;
        }
        this.alreadyAcceptedOrDeniedCall = true;
        initCall();
        sendDtmf();
    }

    private void initCall() {
        LinphoneCallParams createCallParams = LinphoneManager.getLc().createCallParams(this.mCall);
        boolean z = !LinphoneUtils.isHighBandwidthConnection(LinphoneService.instance().getApplicationContext());
        if (createCallParams != null) {
            createCallParams.enableLowBandwidth(z);
        }
        boolean acceptCallWithParams = LinphoneManager.getInstance().acceptCallWithParams(this.mCall, createCallParams);
        if (createCallParams != null && acceptCallWithParams) {
            LinphoneManager.getInstance().enableCamera(this.mCall, false);
            if (LinphoneManager.getLcIfManagerNotDestroyedOrNull() != null) {
                LinphoneManager.getLc().muteMic(true);
                LinphoneManager.getLc().enableSpeaker(false);
            }
        }
    }

    private void sendDtmf() {
        openDoor(this.dtmf);
        delay(500);
        openDoor(this.dtmf);
    }

    private void openDoor(String str) {
        if (getDtmf() == null || getDtmf().isEmpty()) {
            LinphoneManager.getLc().sendDtmf('#');
            return;
        }
        String dtmf2 = getDtmf();
        for (int i = 0; i < getDtmf().length(); i++) {
            Log.d("TAG", "XXX CALL opndoor " + dtmf2.charAt(i));
            LinphoneManager.getLc().sendDtmf(dtmf2.charAt(i));
            delay(200);
        }
    }

    private void delay(int i) {
        try {
            Thread.sleep((long) i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        Log.d("TAG", " XXX onResume CallIncomingActivity");
        LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(CallMaker.PUSH_CALL_BROADCAST).putExtra("KEY_ACTION", 3));
        super.onResume();
        instance = this;
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.addListener(this.mListener);
        }
        this.alreadyAcceptedOrDeniedCall = false;
        this.mCall = null;
        lookupCurrentCall();
        if (this.mCall != null) {
            getIntent().getStringExtra("title");
            this.prview = getIntent().getStringExtra(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW);
            int intExtra = getIntent().getIntExtra(SipParametrs.FPS, DEFAULT_UPDATE_TIME_IN_SEC);
            this.fps = TimeUnit.SECONDS.toMillis((long) intExtra);
            this.dtmf = getIntent().getStringExtra(SipParametrs.DTMF);
            this.openDoorUrl = getIntent().getStringExtra("open_door");
            Log.d("TAG", "XXX preview " + this.prview + " " + intExtra);
            StringBuilder sb = new StringBuilder();
            sb.append("XXX MJPEG ");
            sb.append(getMjpeg());
            Log.d("TAG", sb.toString());
            String str = this.prview;
            if (getMjpeg() != null) {
                this.llMjpeg.setVisibility(0);
                this.surfaceView.setVisibility(0);
                this.surfaceView.setUrl(getMjpeg());
                this.surfaceView.startStream();
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            finishAndRemoveTask();
        } else {
            finish();
        }
    }

    private void tryAfterFewSeconds() {
        this.handlerRepeater.postDelayed(this.repeatRunnable, 2000);
    }

    private void loadPreview() {
        if (this.handler == null) {
            this.handler = new Handler();
        }
        this.handler.post(this.updatePreviewRunnable);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.removeListener(this.mListener);
        }
        super.onPause();
        if (this.surfaceView.getVisibility() == 0) {
            this.surfaceView.stopStream();
        }
        super.onPause();
        Log.d("TAG", "XX onPause");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        Runnable runnable;
        Log.d("TAG", " XXX onDestroy CallIncomingActivity");
        super.onDestroy();
        instance = null;
        this.stopRunnable = true;
        Handler handler2 = this.handler;
        if (handler2 != null && (runnable = this.updatePreviewRunnable) != null) {
            handler2.removeCallbacks(runnable);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (LinphoneManager.isInstanciated() && (i == 4 || i == 3)) {
            LinphoneManager.getLc().terminateCall(this.mCall);
            finish();
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void lookupCurrentCall() {
        /*
            r4 = this;
            org.linphone.core.LinphoneCore r0 = org.linphone.LinphoneManager.getLcIfManagerNotDestroyedOrNull()
            if (r0 == 0) goto L_0x0038
            org.linphone.core.LinphoneCore r0 = org.linphone.LinphoneManager.getLc()
            java.util.List r0 = org.linphone.LinphoneUtils.getLinphoneCalls(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0038
            java.lang.Object r1 = r0.next()
            org.linphone.core.LinphoneCall r1 = (org.linphone.core.LinphoneCall) r1
            org.linphone.core.LinphoneCall$State r2 = org.linphone.core.LinphoneCall.State.IncomingReceived
            org.linphone.core.LinphoneCall$State r3 = r1.getState()
            if (r2 == r3) goto L_0x0036
            org.linphone.core.LinphoneCall$State r2 = org.linphone.core.LinphoneCall.State.Connected
            org.linphone.core.LinphoneCall$State r3 = r1.getState()
            if (r2 == r3) goto L_0x0036
            org.linphone.core.LinphoneCall$State r2 = org.linphone.core.LinphoneCall.State.StreamsRunning
            org.linphone.core.LinphoneCall$State r3 = r1.getState()
            if (r2 != r3) goto L_0x0012
        L_0x0036:
            r4.mCall = r1
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.CallIncomingActivity.lookupCurrentCall():void");
    }

    private void decline() {
        if (this.alreadyAcceptedOrDeniedCall) {
            hangUp();
        } else {
            this.alreadyAcceptedOrDeniedCall = true;
            LinphoneManager.getLc().terminateCall(this.mCall);
        }
        finish();
    }

    private void hangUp() {
        LinphoneCore lc = LinphoneManager.getLc();
        LinphoneCall currentCall = lc.getCurrentCall();
        if (currentCall != null) {
            lc.terminateCall(currentCall);
        } else if (lc.isInConference()) {
            lc.terminateConference();
        } else {
            lc.terminateAllCalls();
        }
    }

    private void answer() {
        if (this.alreadyAcceptedOrDeniedCall) {
            boolean isMicMuted = LinphoneManager.getLc().isMicMuted();
            int i = isMicMuted ? C5321R.C5323drawable.ic_svg_mic_on : C5321R.C5323drawable.ic_svg_mic_off;
            String string = getString(isMicMuted ? C5321R.string.label_mic : C5321R.string.label_mic_out);
            LinphoneManager.getLc().muteMic(!isMicMuted);
            LinphoneManager.getLc().enableSpeaker(true);
            ((FloatingActionButton) this.answerView.findViewById(C5321R.C5324id.fab)).setImageDrawable(AppCompatResources.getDrawable(this, i));
            ((TextView) this.answerView.findViewById(C5321R.C5324id.label)).setText(string);
            return;
        }
        this.alreadyAcceptedOrDeniedCall = true;
        LinphoneCallParams createCallParams = LinphoneManager.getLc().createCallParams(this.mCall);
        boolean z = !LinphoneUtils.isHighBandwidthConnection(LinphoneService.instance().getApplicationContext());
        Log.d("TAG", "XXX x answer " + z);
        if (createCallParams != null) {
            createCallParams.enableLowBandwidth(z);
        } else {
            org.linphone.mediastream.Log.m6903e("Could not create call params for call");
        }
        if (createCallParams == null || !LinphoneManager.getInstance().acceptCallWithParams(this.mCall, createCallParams)) {
            Toast.makeText(this, C5321R.string.couldnt_accept_call, 1).show();
            return;
        }
        LinphoneManager.getLc().enableSpeaker(true);
        LinphoneManager.getInstance().routeAudioToSpeaker();
        Intent intent = new Intent(this, CallActivity.class);
        intent.putExtra(SipParametrs.MJPEG, getMjpeg());
        intent.putExtra(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, getUrlPreview());
        intent.putExtra(SipParametrs.FPS, getFps());
        intent.putExtra(SipParametrs.DTMF, getDtmf());
        intent.putExtra("open_door", getDoorUrl());
        intent.putExtra(SipParametrs.VIDEO_SOURCE, getVideoSource());
        if (getVideoSource().equals(FCM.SIP)) {
            this.llMjpeg.setVisibility(4);
            this.frame.setVisibility(0);
            this.image.setVisibility(4);
            showVideoView();
        } else {
            this.llMjpeg.setVisibility(0);
            this.frame.setVisibility(4);
        }
        ((FloatingActionButton) this.answerView.findViewById(C5321R.C5324id.fab)).setImageDrawable(AppCompatResources.getDrawable(this, C5321R.C5323drawable.ic_svg_mic_on));
        ((TextView) this.answerView.findViewById(C5321R.C5324id.label)).setText(getString(C5321R.string.label_mic));
    }

    private void checkAndRequestCallPermissions() {
        ArrayList arrayList = new ArrayList();
        int checkPermission = getPackageManager().checkPermission("android.permission.RECORD_AUDIO", getPackageName());
        int checkPermission2 = getPackageManager().checkPermission("android.permission.CAMERA", getPackageName());
        if (checkPermission != 0 && ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.RECORD_AUDIO")) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (checkPermission2 != 0 && ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.CAMERA")) {
            arrayList.add("android.permission.CAMERA");
        }
        if (arrayList.size() > 0) {
            ActivityCompat.requestPermissions(this, (String[]) arrayList.toArray(new String[arrayList.size()]), 0);
        }
    }

    @Subscribe
    public void handleSomethingElse(MessageEvent messageEvent) {
        Log.d("TAG", "XXX handleSomethingElse: CIA");
        finish();
    }

    public void onStop() {
        EventBus.getDefault().unregister(this);
        LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(CallMaker.PUSH_CALL_BROADCAST).putExtra("KEY_ACTION", 0));
        super.onStop();
    }

    private void checkPermission() {
        String[] strArr = {"android.permission.RECORD_AUDIO"};
        if (Build.VERSION.SDK_INT >= 23) {
            requestPermissions(strArr, 100);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (strArr.length > 0 && i == 100) {
            boolean z = false;
            if (strArr[0].compareTo("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                if (iArr[0] == 0) {
                    z = true;
                }
                try {
                    LinphonePreferences.instance().enableDeviceRingtone(z);
                    LinphoneManager.getInstance().enableDeviceRingtone(z);
                } catch (Exception unused) {
                }
            }
        }
    }

    public String getApplicationName() {
        ApplicationInfo applicationInfo = getApplicationInfo();
        int i = applicationInfo.labelRes;
        return i == 0 ? applicationInfo.nonLocalizedLabel.toString() : getString(i);
    }

    public void onStreamStarted(boolean z) {
        runOnUiThread(new Runnable(z) {
            private final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                CallIncomingActivity.this.lambda$onStreamStarted$3$CallIncomingActivity(this.f$1);
            }
        });
    }

    public /* synthetic */ void lambda$onStreamStarted$3$CallIncomingActivity(boolean z) {
        int i = 0;
        org.linphone.mediastream.Log.m6901d("TAG", "XXX onStreamStarted showLoading = " + z);
        this.surfaceView.setVisibility(z ? 8 : 0);
        this.llMjpeg.setVisibility(z ? 8 : 0);
        ImageView imageView = this.image;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public static class OpenDoorSignalSend extends AsyncTask<String, Void, String> {
        Response response = null;
        String results = "ERROR";

        /* access modifiers changed from: protected */
        public String doInBackground(String... strArr) {
            try {
                OkHttpClient okHttpClient = new OkHttpClient();
                if (strArr[0] != null) {
                    this.response = okHttpClient.newCall(new Request.Builder().url(strArr[0]).build()).execute();
                    Log.d("TAG", "XXX preview senr req  executesd");
                }
            } catch (IOException e) {
                Log.d("TAG", "XXX preview senr req  " + e.getMessage());
            }
            return this.response != null ? "SUCCESS" : "ERROR";
        }
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

    private void switchVideo(boolean z) {
        LinphoneCall currentCall = LinphoneManager.getLc().getCurrentCall();
        if (currentCall != null && currentCall.getState() != LinphoneCall.State.CallEnd && currentCall.getState() != LinphoneCall.State.CallReleased) {
            if (!z) {
                Log.d("TAG", "XXX x showAudioView(); " + currentCall.getRemoteParams().isLowBandwidthEnabled());
            } else if (!currentCall.getRemoteParams().isLowBandwidthEnabled()) {
                LinphoneManager.getInstance().addVideo();
                CallVideoFragment callVideoFragment = this.videoCallFragment;
                if (callVideoFragment == null || !callVideoFragment.isVisible()) {
                    showVideoView();
                }
            }
        }
    }

    private void showVideoView() {
        if (!BluetoothManager.getInstance().isBluetoothHeadsetAvailable()) {
            org.linphone.mediastream.Log.m6907w("Bluetooth not available, using speaker");
            LinphoneManager.getInstance().routeAudioToSpeaker();
        }
        LinphoneManager.getInstance().enableProximitySensing(false);
        replaceFragmentAudioByVideo();
    }

    private void replaceFragmentAudioByVideo() {
        this.videoCallFragment = new CallVideoFragment();
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(C5321R.C5324id.frame, this.videoCallFragment);
        try {
            beginTransaction.commitAllowingStateLoss();
        } catch (Exception unused) {
        }
    }

    public void bindVideoFragment(CallVideoFragment callVideoFragment) {
        this.videoCallFragment = callVideoFragment;
    }
}
