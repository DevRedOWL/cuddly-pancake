package p035ru.unicorn.ujin.data.service.location;

import android.app.PendingIntent;

/* renamed from: ru.unicorn.ujin.data.service.location.PushActions */
public class PushActions {
    private PendingIntent actionButtonClickpendingIntent;
    private final int actionButtonDrawable;
    private final String actionButtonTitle;

    public PushActions(String str, int i, PendingIntent pendingIntent) {
        this.actionButtonTitle = str;
        this.actionButtonDrawable = i;
        this.actionButtonClickpendingIntent = pendingIntent;
    }

    public String getActionButtonTitle() {
        String str = this.actionButtonTitle;
        return str == null ? " " : str;
    }

    public int getActionButtonDrawable() {
        return this.actionButtonDrawable;
    }

    public PendingIntent getActionButtonClickpendingIntent() {
        return this.actionButtonClickpendingIntent;
    }
}
