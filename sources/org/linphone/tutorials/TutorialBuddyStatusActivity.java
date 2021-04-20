package org.linphone.tutorials;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.linphone.C5321R;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.tutorials.TutorialBuddyStatus;
import org.linphone.mediastream.Log;

public class TutorialBuddyStatusActivity extends Activity {
    private static final String defaultSipAddress = "sip:";
    /* access modifiers changed from: private */
    public Button buttonCall;
    /* access modifiers changed from: private */
    public Handler mHandler = new Handler();
    /* access modifiers changed from: private */
    public TextView mySipAddressWidget;
    /* access modifiers changed from: private */
    public TextView mySipPasswordWidget;
    /* access modifiers changed from: private */
    public TextView sipAddressWidget;
    /* access modifiers changed from: private */
    public TutorialBuddyStatus tutorial;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5321R.layout.hello_world);
        this.sipAddressWidget = (TextView) findViewById(C5321R.C5324id.AddressId);
        this.sipAddressWidget.setText(defaultSipAddress);
        this.mySipAddressWidget = (TextView) findViewById(C5321R.C5324id.MyAddressId);
        this.mySipAddressWidget.setVisibility(0);
        this.mySipPasswordWidget = (TextView) findViewById(C5321R.C5324id.Password);
        this.mySipPasswordWidget.setVisibility(0);
        this.tutorial = new TutorialBuddyStatus(new AndroidTutorialNotifier(this.mHandler, (TextView) findViewById(C5321R.C5324id.OutputText)));
        this.buttonCall = (Button) findViewById(C5321R.C5324id.CallButton);
        this.buttonCall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TutorialLaunchingThread tutorialLaunchingThread = new TutorialLaunchingThread();
                TutorialBuddyStatusActivity.this.buttonCall.setEnabled(false);
                tutorialLaunchingThread.start();
            }
        });
        ((Button) findViewById(C5321R.C5324id.ButtonStop)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TutorialBuddyStatusActivity.this.tutorial.stopMainLoop();
            }
        });
    }

    private class TutorialLaunchingThread extends Thread {
        private TutorialLaunchingThread() {
        }

        public void run() {
            super.run();
            try {
                String str = null;
                String charSequence = TutorialBuddyStatusActivity.this.mySipAddressWidget.getText().length() > 0 ? TutorialBuddyStatusActivity.this.mySipAddressWidget.getText().toString() : null;
                if (TutorialBuddyStatusActivity.this.mySipPasswordWidget.getText().length() > 0) {
                    str = TutorialBuddyStatusActivity.this.mySipPasswordWidget.getText().toString();
                }
                TutorialBuddyStatusActivity.this.tutorial.launchTutorial(TutorialBuddyStatusActivity.this.sipAddressWidget.getText().toString(), charSequence, str);
                TutorialBuddyStatusActivity.this.mHandler.post(new Runnable() {
                    public void run() {
                        TutorialBuddyStatusActivity.this.buttonCall.setEnabled(true);
                    }
                });
            } catch (LinphoneCoreException e) {
                Log.m6903e(e);
            }
        }
    }
}
