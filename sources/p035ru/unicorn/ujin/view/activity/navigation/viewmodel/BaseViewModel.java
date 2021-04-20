package p035ru.unicorn.ujin.view.activity.navigation.viewmodel;

import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import p035ru.unicorn.ujin.data.repository.TestRemoteRepository;
import p046io.reactivex.disposables.CompositeDisposable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel */
public abstract class BaseViewModel extends ViewModel {
    public CompositeDisposable compositeDisposable = new CompositeDisposable();
    public SingleLiveEvent<String> showError = new SingleLiveEvent<>();
    public SingleLiveEvent<Boolean> showLoader = new SingleLiveEvent<>();
    public TestRemoteRepository testRemoteRepository;

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        Log.d("TAG", "XXX onCleared " + getClass().getName());
        if (!this.compositeDisposable.isDisposed()) {
            this.compositeDisposable.clear();
        }
    }

    public MutableLiveData<Boolean> getShowLoader() {
        return this.showLoader;
    }

    public void setShowLoader(SingleLiveEvent<Boolean> singleLiveEvent) {
        this.showLoader = singleLiveEvent;
    }

    public SingleLiveEvent<String> getShowError() {
        return this.showError;
    }
}
