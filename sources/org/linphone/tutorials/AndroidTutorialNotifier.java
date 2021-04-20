package org.linphone.tutorials;

import android.os.Handler;
import android.widget.TextView;
import org.linphone.core.tutorials.TutorialNotifier;

class AndroidTutorialNotifier extends TutorialNotifier {
    private Handler mHandler;
    /* access modifiers changed from: private */
    public TextView outputTextView;

    public AndroidTutorialNotifier(Handler handler, TextView textView) {
        this.mHandler = handler;
        this.outputTextView = textView;
    }

    public void notify(final String str) {
        this.mHandler.post(new Runnable() {
            public void run() {
                TextView access$000 = AndroidTutorialNotifier.this.outputTextView;
                access$000.setText(str + "\n" + AndroidTutorialNotifier.this.outputTextView.getText());
            }
        });
    }
}
