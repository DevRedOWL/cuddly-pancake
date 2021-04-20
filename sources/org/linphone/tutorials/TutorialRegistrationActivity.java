package org.linphone.tutorials;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.linphone.C5321R;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.tutorials.TutorialRegistration;
import org.linphone.mediastream.Log;

public class TutorialRegistrationActivity extends TutorialHelloWorldActivity {
    private static final String defaultSipAddress = "sip:";
    private static final String defaultSipPassword = "";
    /* access modifiers changed from: private */
    public Button buttonCall;
    private Handler mHandler = new Handler();
    /* access modifiers changed from: private */
    public TextView outputText;
    /* access modifiers changed from: private */
    public TextView sipAddressWidget;
    /* access modifiers changed from: private */
    public TextView sipPasswordWidget;
    /* access modifiers changed from: private */
    public TutorialRegistration tutorial;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5321R.layout.hello_world);
        this.sipAddressWidget = (TextView) findViewById(C5321R.C5324id.AddressId);
        this.sipAddressWidget.setText(defaultSipAddress);
        this.sipPasswordWidget = (TextView) findViewById(C5321R.C5324id.Password);
        this.sipPasswordWidget.setVisibility(0);
        this.sipPasswordWidget.setText("");
        this.outputText = (TextView) findViewById(C5321R.C5324id.OutputText);
        this.tutorial = new TutorialRegistration(new AndroidTutorialNotifier(this.mHandler, this.outputText));
        this.buttonCall = (Button) findViewById(C5321R.C5324id.CallButton);
        this.buttonCall.setText("Register");
        this.buttonCall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TutorialLaunchingThread tutorialLaunchingThread = new TutorialLaunchingThread();
                TutorialRegistrationActivity.this.buttonCall.setEnabled(false);
                tutorialLaunchingThread.start();
            }
        });
        ((Button) findViewById(C5321R.C5324id.ButtonStop)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TutorialRegistrationActivity.this.tutorial.stopMainLoop();
            }
        });
    }

    private class TutorialLaunchingThread extends Thread {
        private TutorialLaunchingThread() {
        }

        public void run() {
            super.run();
            try {
                TutorialRegistrationActivity.this.tutorial.launchTutorial(TutorialRegistrationActivity.this.sipAddressWidget.getText().toString(), TutorialRegistrationActivity.this.sipPasswordWidget.getText().toString());
            } catch (LinphoneCoreException e) {
                Log.m6903e(e);
                TextView access$500 = TutorialRegistrationActivity.this.outputText;
                access$500.setText(e.getMessage() + "\n" + TutorialRegistrationActivity.this.outputText.getText());
            }
        }
    }
}
