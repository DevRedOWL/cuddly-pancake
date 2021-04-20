package p035ru.unicorn.generated.callback;

import android.view.View;

/* renamed from: ru.unicorn.generated.callback.OnClickListener */
public final class OnClickListener implements View.OnClickListener {
    final Listener mListener;
    final int mSourceId;

    /* renamed from: ru.unicorn.generated.callback.OnClickListener$Listener */
    public interface Listener {
        void _internalCallbackOnClick(int i, View view);
    }

    public OnClickListener(Listener listener, int i) {
        this.mListener = listener;
        this.mSourceId = i;
    }

    public void onClick(View view) {
        this.mListener._internalCallbackOnClick(this.mSourceId, view);
    }
}
