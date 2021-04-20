package org.linphone.tutorials;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import org.linphone.C5321R;

public class TutorialLauncherActivity extends Activity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5321R.layout.tutorials);
    }

    public void startHelloWorldTutorial(View view) {
        startActivity(new Intent().setClass(this, TutorialHelloWorldActivity.class));
    }

    public void startRegistrationTutorial(View view) {
        startActivity(new Intent().setClass(this, TutorialRegistrationActivity.class));
    }

    public void startChatRoomTutorial(View view) {
        startActivity(new Intent().setClass(this, TutorialChatRoomActivity.class));
    }

    public void startBuddyStatusTutorial(View view) {
        startActivity(new Intent().setClass(this, TutorialBuddyStatusActivity.class));
    }

    public void startCardDavSyncTutorial(View view) {
        startActivity(new Intent().setClass(this, TutorialCardDavSync.class));
    }
}
