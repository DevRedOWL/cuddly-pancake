package org.linphone;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import org.linphone.core.LinphoneCall;
import org.linphone.core.LinphoneCore;
import p035ru.unicorn.ujin.data.realm.SipParametrs;

public class SilentCallActivity extends AppCompatActivity {
    private LinphoneCall mCall;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5321R.layout.activity_silent_call);
        String stringExtra = getIntent().getStringExtra(SipParametrs.DTMF);
        if (stringExtra == null) {
            stringExtra = "#";
        }
        openDoor(stringExtra);
        delay(500);
        openDoor(stringExtra);
        delay(500);
        openDoor(stringExtra);
        decline();
    }

    private void decline() {
        LinphoneCall linphoneCall;
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            Log.d("TAG", "XXX CALL termine 1");
            linphoneCall = lcIfManagerNotDestroyedOrNull.getCurrentCall();
        } else {
            linphoneCall = null;
        }
        if (linphoneCall != null) {
            Log.d("TAG", "XXX CALL termine 2");
            lcIfManagerNotDestroyedOrNull.terminateCall(linphoneCall);
        } else if (lcIfManagerNotDestroyedOrNull != null) {
            Log.d("TAG", "XXX CALL termine 3");
            lcIfManagerNotDestroyedOrNull.terminateAllCalls();
        }
        finish();
    }

    private void delay(int i) {
        try {
            Thread.sleep((long) i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void openDoor(String str) {
        if (LinphoneManager.getLc() != null && LinphoneManager.getLc().isIncall()) {
            StringBuilder sb = new StringBuilder();
            sb.append("XXX CALL opndoor ");
            sb.append(str.charAt(0));
            Log.d("TAG", sb.toString());
            for (int i = 0; i < str.length(); i++) {
                LinphoneManager.getLc().sendDtmf(str.charAt(i));
                delay(200);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        Log.d("TAG", "XXX CALL opndoor 9");
        if (lcIfManagerNotDestroyedOrNull != null) {
            Log.d("TAG", "XXX CALL 8 ");
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        if (LinphoneManager.getLcIfManagerNotDestroyedOrNull() != null) {
            Log.d("TAG", "XXX CALL opndoor 10");
        }
        super.onPause();
    }

    private void lookupCurrentCall() {
        if (LinphoneManager.getLcIfManagerNotDestroyedOrNull() != null) {
            for (LinphoneCall next : LinphoneUtils.getLinphoneCalls(LinphoneManager.getLc())) {
                if (LinphoneCall.State.IncomingReceived == next.getState()) {
                    this.mCall = next;
                    return;
                }
            }
        }
    }
}
