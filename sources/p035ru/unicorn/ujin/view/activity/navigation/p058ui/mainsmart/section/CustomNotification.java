package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section;

import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.section.CustomNotification */
public class CustomNotification implements Diffable<CustomNotification> {
    private boolean isError;
    private String message;

    public CustomNotification(String str, boolean z) {
        this.message = str;
        this.isError = z;
    }

    public CustomNotification() {
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public boolean isError() {
        return this.isError;
    }

    public void setError(boolean z) {
        this.isError = z;
    }

    public boolean areItemsTheSame(CustomNotification customNotification) {
        return this.message.equals(customNotification.message);
    }

    public boolean areContentsTheSame(CustomNotification customNotification) {
        return this.message.equals(customNotification.message);
    }
}
