package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TextChangedListener */
public abstract class TextChangedListener<T> implements TextWatcher {
    private T target;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public abstract void onTextChanged(T t, Editable editable);

    public TextChangedListener(T t) {
        this.target = t;
    }

    public void afterTextChanged(Editable editable) {
        onTextChanged(this.target, editable);
    }
}
