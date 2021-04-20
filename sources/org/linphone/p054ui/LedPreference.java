package org.linphone.p054ui;

import android.content.Context;
import android.preference.Preference;
import android.view.View;
import android.widget.ImageView;
import org.linphone.C5321R;

/* renamed from: org.linphone.ui.LedPreference */
public class LedPreference extends Preference {
    private int ledDrawable = C5321R.C5323drawable.led_disconnected;

    public LedPreference(Context context) {
        super(context);
        setWidgetLayoutResource(C5321R.layout.preference_led);
    }

    /* access modifiers changed from: protected */
    public void onBindView(View view) {
        super.onBindView(view);
        ImageView imageView = (ImageView) view.findViewById(C5321R.C5324id.led);
        if (imageView != null) {
            imageView.setImageResource(this.ledDrawable);
        }
    }

    public void setLed(int i) {
        this.ledDrawable = i;
        notifyChanged();
    }
}
