package p035ru.unicorn.ujin.view.activity.navigation.viewmodel;

import android.util.Log;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import com.google.firebase.messaging.FirebaseMessaging;
import org.reactivestreams.Publisher;
import p035ru.unicorn.BuildConfig;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.SipParametrs;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.repository.base.UserResponse;
import p046io.reactivex.Flowable;
import p046io.reactivex.Notification;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.schedulers.Schedulers;
import p046io.realm.RealmObject;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.viewmodel.RegViewModel */
public class RegViewModel extends ViewModel {
    private LocalRepository localRepository = LocalRepository.getInstance();
    private RemoteRepository remoteRepository = new RemoteRepository();
    private SingleLiveEvent<Resource<Void>> restoreStepOne = new SingleLiveEvent<>();
    private SingleLiveEvent<Resource<UserResponse>> restoreStepTwo = new SingleLiveEvent<>();

    public LiveData<Resource<UserResponse>> getAutorise(String str, String str2) {
        return LiveDataReactiveStreams.fromPublisher(this.remoteRepository.autorize(str, str2));
    }

    public void saveUser(UserResponse userResponse) {
        this.localRepository.saveDataOrUpdate(userResponse.getUser());
    }

    public void saveSip(SipParametrs sipParametrs) {
        this.localRepository.saveDataOrUpdate(sipParametrs);
    }

    public LiveData<String> getToken() {
        return Transformations.switchMap(LiveDataReactiveStreams.fromPublisher(this.localRepository.hasAccount()), new Function() {
            public final Object apply(Object obj) {
                return RegViewModel.this.lambda$getToken$0$RegViewModel((Boolean) obj);
            }
        });
    }

    public /* synthetic */ LiveData lambda$getToken$0$RegViewModel(Boolean bool) {
        if (bool.booleanValue()) {
            return LiveDataReactiveStreams.fromPublisher(this.localRepository.getToken());
        }
        return LiveDataReactiveStreams.fromPublisher(Flowable.just("-1"));
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        this.localRepository.close();
        this.localRepository = null;
        this.remoteRepository = null;
    }

    public Flowable<Resource<SipParametrs>> getSipParams() {
        return this.localRepository.getToken().flatMap(new p046io.reactivex.functions.Function() {
            public final Object apply(Object obj) {
                return RegViewModel.this.lambda$getSipParams$1$RegViewModel((String) obj);
            }
        });
    }

    public /* synthetic */ Publisher lambda$getSipParams$1$RegViewModel(String str) throws Exception {
        return this.remoteRepository.getSipParams((String) null);
    }

    public LiveData<Boolean> logout() {
        return LiveDataReactiveStreams.fromPublisher(this.localRepository.clearUserData());
    }

    public void sendFCMToken(boolean z) {
        try {
            FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener(z) {
                private final /* synthetic */ boolean f$1;

                {
                    this.f$1 = r2;
                }

                public final void onComplete(Task task) {
                    RegViewModel.this.lambda$sendFCMToken$2$RegViewModel(this.f$1, task);
                }
            });
        } catch (Exception unused) {
        }
    }

    public /* synthetic */ void lambda$sendFCMToken$2$RegViewModel(boolean z, Task task) {
        try {
            if (task.getResult() != null && this.localRepository != null && this.remoteRepository != null) {
                String str = (String) task.getResult();
                String tokenString = this.localRepository.getTokenString();
                if (tokenString != null) {
                    if (z) {
                        deleteFromFCMServer();
                        this.remoteRepository.deleteToken(tokenString, str).subscribe();
                        return;
                    }
                    this.remoteRepository.sendToken(tokenString, str, AbstractSpiCall.ANDROID_CLIENT_TYPE, BuildConfig.VERSION_NAME).subscribe();
                    this.remoteRepository.getSipParams(str).subscribe();
                }
            }
        } catch (Exception unused) {
        }
    }

    private void deleteFromFCMServer() {
        new Thread($$Lambda$RegViewModel$4xp3BhCGgRJRWi7FdCbqBzc2g.INSTANCE).start();
    }

    static /* synthetic */ void lambda$deleteFromFCMServer$3() {
        try {
            FirebaseMessaging.getInstance().deleteToken();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public SingleLiveEvent<Resource<Void>> getRestoreStepOne() {
        return this.restoreStepOne;
    }

    public SingleLiveEvent<Resource<UserResponse>> getRestoreStepTwo() {
        return this.restoreStepTwo;
    }

    public void restoreStepOne(String str, Integer num) {
        this.remoteRepository.restorePasswordStepOne(str, num).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                RegViewModel.this.lambda$restoreStepOne$4$RegViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$restoreStepOne$4$RegViewModel(Resource resource) throws Exception {
        this.restoreStepOne.setValue(resource);
    }

    public void restoreStepTwo(String str, Integer num, Integer num2) {
        this.remoteRepository.restorePasswordStepTwo(str, num, num2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                RegViewModel.this.lambda$restoreStepTwo$5$RegViewModel((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$restoreStepTwo$5$RegViewModel(Resource resource) throws Exception {
        this.restoreStepTwo.setValue(resource);
    }

    public LiveData<Resource<User>> getUserInfo() {
        return LiveDataReactiveStreams.fromPublisher(this.remoteRepository.getUserInfo().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                RegViewModel.this.lambda$getUserInfo$6$RegViewModel((Resource) obj);
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).materialize().filter($$Lambda$RegViewModel$CrBreCg0lwDBEcCHnMImsFJUDd0.INSTANCE).dematerialize());
    }

    public /* synthetic */ void lambda$getUserInfo$6$RegViewModel(Resource resource) throws Exception {
        Log.d("TAG", "123 X user remote  1 ");
        if (resource.getStatus().equals(Resource.Status.SUCCESS)) {
            this.localRepository.saveDataOrUpdate((RealmObject) resource.getData());
        }
    }

    static /* synthetic */ boolean lambda$getUserInfo$7(Notification notification) throws Exception {
        return !notification.isOnError();
    }
}
