package org.linphone;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import java.util.ArrayList;
import java.util.Iterator;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneCall;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreListenerBase;
import org.linphone.core.Reason;
import org.linphone.mediastream.Log;

public class CallOutgoingActivity extends LinphoneGenericActivity implements View.OnClickListener {
    private static CallOutgoingActivity instance;
    private ImageView contactPicture;
    private ImageView hangUp;
    private boolean isMicMuted;
    private boolean isSpeakerEnabled;
    /* access modifiers changed from: private */
    public LinphoneCall mCall;
    private LinphoneCoreListenerBase mListener;
    private ImageView micro;
    private TextView name;
    private TextView number;
    private ImageView speaker;

    public static CallOutgoingActivity instance() {
        return instance;
    }

    public static boolean isInstanciated() {
        return instance != null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getResources().getBoolean(C5321R.bool.orientation_portrait_only)) {
            setRequestedOrientation(1);
        }
        getWindow().addFlags(128);
        setContentView(C5321R.layout.call_outgoing);
        this.name = (TextView) findViewById(C5321R.C5324id.contact_name);
        this.number = (TextView) findViewById(C5321R.C5324id.contact_number);
        this.contactPicture = (ImageView) findViewById(C5321R.C5324id.contact_picture);
        this.isMicMuted = false;
        this.isSpeakerEnabled = false;
        this.micro = (ImageView) findViewById(C5321R.C5324id.micro);
        this.micro.setOnClickListener(this);
        this.speaker = (ImageView) findViewById(C5321R.C5324id.speaker);
        this.speaker.setOnClickListener(this);
        getWindow().addFlags(6815744);
        this.hangUp = (ImageView) findViewById(C5321R.C5324id.outgoing_hang_up);
        this.hangUp.setOnClickListener(this);
        this.mListener = new LinphoneCoreListenerBase() {
            public void callState(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneCall.State state, String str) {
                if (linphoneCall != CallOutgoingActivity.this.mCall || LinphoneCall.State.Connected != state) {
                    if (state == LinphoneCall.State.Error) {
                        if (linphoneCall.getErrorInfo().getReason() == Reason.Declined) {
                            CallOutgoingActivity callOutgoingActivity = CallOutgoingActivity.this;
                            callOutgoingActivity.displayCustomToast(callOutgoingActivity.getString(C5321R.string.error_call_declined), 0);
                            CallOutgoingActivity.this.decline();
                        } else if (linphoneCall.getErrorInfo().getReason() == Reason.NotFound) {
                            CallOutgoingActivity callOutgoingActivity2 = CallOutgoingActivity.this;
                            callOutgoingActivity2.displayCustomToast(callOutgoingActivity2.getString(C5321R.string.error_user_not_found), 0);
                            CallOutgoingActivity.this.decline();
                        } else if (linphoneCall.getErrorInfo().getReason() == Reason.Media) {
                            CallOutgoingActivity callOutgoingActivity3 = CallOutgoingActivity.this;
                            callOutgoingActivity3.displayCustomToast(callOutgoingActivity3.getString(C5321R.string.error_incompatible_media), 0);
                            CallOutgoingActivity.this.decline();
                        } else if (linphoneCall.getErrorInfo().getReason() == Reason.Busy) {
                            CallOutgoingActivity callOutgoingActivity4 = CallOutgoingActivity.this;
                            callOutgoingActivity4.displayCustomToast(callOutgoingActivity4.getString(C5321R.string.error_user_busy), 0);
                            CallOutgoingActivity.this.decline();
                        } else if (str != null) {
                            CallOutgoingActivity callOutgoingActivity5 = CallOutgoingActivity.this;
                            callOutgoingActivity5.displayCustomToast(CallOutgoingActivity.this.getString(C5321R.string.error_unknown) + " - " + str, 0);
                            CallOutgoingActivity.this.decline();
                        }
                    } else if (state == LinphoneCall.State.CallEnd && linphoneCall.getErrorInfo().getReason() == Reason.Declined) {
                        CallOutgoingActivity callOutgoingActivity6 = CallOutgoingActivity.this;
                        callOutgoingActivity6.displayCustomToast(callOutgoingActivity6.getString(C5321R.string.error_call_declined), 0);
                        CallOutgoingActivity.this.decline();
                    }
                    if (LinphoneManager.getLc().getCallsNb() == 0) {
                        CallOutgoingActivity.this.finish();
                    }
                } else if (LinphoneActivity.isInstanciated()) {
                    LinphoneActivity.instance().startIncallActivity(CallOutgoingActivity.this.mCall);
                    CallOutgoingActivity.this.finish();
                }
            }
        };
        instance = this;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        LinphoneCall.State state;
        super.onResume();
        instance = this;
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.addListener(this.mListener);
        }
        this.mCall = null;
        if (LinphoneManager.getLcIfManagerNotDestroyedOrNull() != null) {
            Iterator<LinphoneCall> it = LinphoneUtils.getLinphoneCalls(LinphoneManager.getLc()).iterator();
            do {
                if (it.hasNext()) {
                    LinphoneCall next = it.next();
                    state = next.getState();
                    if (LinphoneCall.State.OutgoingInit == state || LinphoneCall.State.OutgoingProgress == state || LinphoneCall.State.OutgoingRinging == state || LinphoneCall.State.OutgoingEarlyMedia == state) {
                        this.mCall = next;
                    }
                }
            } while (LinphoneCall.State.StreamsRunning != state);
            if (LinphoneActivity.isInstanciated()) {
                LinphoneActivity.instance().startIncallActivity(this.mCall);
                finish();
                return;
            }
            return;
        }
        LinphoneCall linphoneCall = this.mCall;
        if (linphoneCall == null) {
            Log.m6903e("Couldn't find outgoing call");
            finish();
            return;
        }
        LinphoneAddress remoteAddress = linphoneCall.getRemoteAddress();
        LinphoneContact findContactFromAddress = ContactsManager.getInstance().findContactFromAddress(remoteAddress);
        if (findContactFromAddress != null) {
            LinphoneUtils.setImagePictureFromUri(this, this.contactPicture, findContactFromAddress.getPhotoUri(), findContactFromAddress.getThumbnailUri());
            this.name.setText(findContactFromAddress.getFullName());
        } else {
            this.name.setText(LinphoneUtils.getAddressDisplayName(remoteAddress));
        }
        this.number.setText(remoteAddress.asStringUriOnly());
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        checkAndRequestCallPermissions();
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
    public void onDestroy() {
        super.onDestroy();
        instance = null;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C5321R.C5324id.micro) {
            this.isMicMuted = !this.isMicMuted;
            if (this.isMicMuted) {
                this.micro.setImageResource(C5321R.C5323drawable.micro_selected);
            } else {
                this.micro.setImageResource(C5321R.C5323drawable.micro_default);
            }
            LinphoneManager.getLc().muteMic(this.isMicMuted);
        }
        if (id == C5321R.C5324id.speaker) {
            this.isSpeakerEnabled = !this.isSpeakerEnabled;
            if (this.isSpeakerEnabled) {
                this.speaker.setImageResource(C5321R.C5323drawable.speaker_selected);
            } else {
                this.speaker.setImageResource(C5321R.C5323drawable.speaker_default);
            }
            LinphoneManager.getLc().enableSpeaker(this.isSpeakerEnabled);
        }
        if (id == C5321R.C5324id.outgoing_hang_up) {
            decline();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (LinphoneManager.isInstanciated() && (i == 4 || i == 3)) {
            LinphoneManager.getLc().terminateCall(this.mCall);
            finish();
        }
        return super.onKeyDown(i, keyEvent);
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
    public void decline() {
        LinphoneManager.getLc().terminateCall(this.mCall);
        finish();
    }

    private void checkAndRequestCallPermissions() {
        ArrayList arrayList = new ArrayList();
        int checkPermission = getPackageManager().checkPermission("android.permission.RECORD_AUDIO", getPackageName());
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("[Permission] Record audio permission is ");
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
        if (checkPermission != 0 && (LinphonePreferences.instance().firstTimeAskingForPermission("android.permission.RECORD_AUDIO") || ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.RECORD_AUDIO"))) {
            Log.m6905i("[Permission] Asking for record audio");
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if ((LinphonePreferences.instance().shouldInitiateVideoCall() || LinphonePreferences.instance().shouldAutomaticallyAcceptVideoRequests()) && checkPermission2 != 0 && (LinphonePreferences.instance().firstTimeAskingForPermission("android.permission.CAMERA") || ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.CAMERA"))) {
            Log.m6905i("[Permission] Asking for camera");
            arrayList.add("android.permission.CAMERA");
        }
        if (arrayList.size() > 0) {
            ActivityCompat.requestPermissions(this, (String[]) arrayList.toArray(new String[arrayList.size()]), 0);
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
    }
}
