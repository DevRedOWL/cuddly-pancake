package org.linphone.tutorials;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.linphone.C5321R;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.tutorials.TutorialChatRoom;
import org.linphone.mediastream.Log;

public class TutorialChatRoomActivity extends Activity {
    private static final String defaultSipAddress = "sip:";
    /* access modifiers changed from: private */
    public Button buttonCall;
    /* access modifiers changed from: private */
    public Handler mHandler = new Handler();
    /* access modifiers changed from: private */
    public TextView sipAddressWidget;
    /* access modifiers changed from: private */
    public TutorialChatRoom tutorial;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5321R.layout.hello_world);
        this.sipAddressWidget = (TextView) findViewById(C5321R.C5324id.AddressId);
        this.sipAddressWidget.setText(defaultSipAddress);
        this.tutorial = new TutorialChatRoom(new AndroidTutorialNotifier(this.mHandler, (TextView) findViewById(C5321R.C5324id.OutputText)));
        this.buttonCall = (Button) findViewById(C5321R.C5324id.CallButton);
        this.buttonCall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TutorialLaunchingThread tutorialLaunchingThread = new TutorialLaunchingThread();
                TutorialChatRoomActivity.this.buttonCall.setEnabled(false);
                tutorialLaunchingThread.start();
            }
        });
        ((Button) findViewById(C5321R.C5324id.ButtonStop)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TutorialChatRoomActivity.this.tutorial.stopMainLoop();
            }
        });
    }

    private class TutorialLaunchingThread extends Thread {
        private TutorialLaunchingThread() {
        }

        public void run() {
            super.run();
            try {
                TutorialChatRoomActivity.this.tutorial.launchTutorial(TutorialChatRoomActivity.this.sipAddressWidget.getText().toString());
                TutorialChatRoomActivity.this.mHandler.post(new Runnable() {
                    public void run() {
                        TutorialChatRoomActivity.this.buttonCall.setEnabled(true);
                    }
                });
            } catch (LinphoneCoreException e) {
                Log.m6903e(e);
            }
        }
    }
}
