package p035ru.unicorn.ujin.view.activity.navigation.p058ui.base;

import android.os.Bundle;
import javax.annotation.Nullable;
import p046io.reactivex.disposables.CompositeDisposable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.base.BaseActivity */
public class BaseActivity extends p035ru.unicorn.ujin.view.activity.BaseActivity {
    public final String TAG = getClass().getSimpleName();
    public CompositeDisposable disposable;

    /* access modifiers changed from: protected */
    public int getBottomNavigationMenuId() {
        return 0;
    }

    public boolean hasBottomSheet() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void showChatsFragment() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.disposable = new CompositeDisposable();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        CompositeDisposable compositeDisposable = this.disposable;
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            this.disposable.dispose();
        }
    }
}
