package p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings;

import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import java.util.Collections;
import java.util.List;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.Flowable;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.disposables.CompositeDisposable;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.schedulers.Schedulers;
import p046io.realm.RealmList;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.ScenarioViewModel */
public class ScenarioViewModel extends ViewModel {
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    LocalRepository localRepository = LocalRepository.getInstance();
    RemoteRepository remoteRepository = new RemoteRepository();
    SingleLiveEvent<Resource<Void>> singleLiveEvent = new SingleLiveEvent<>();

    public LiveData<RealmList<Options>> getOptions(int i) {
        Flowable<R> doOnNext = this.remoteRepository.getScenarioOptions(i).map($$Lambda$gnrk2PKDFtXNm90FMq1z2N2Oefs.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer(i) {
            private final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                ScenarioViewModel.this.lambda$getOptions$0$ScenarioViewModel(this.f$1, (RealmList) obj);
            }
        });
        Flowable.concatArrayEager(this.localRepository.getScenarioOptionsById(i).filter($$Lambda$ScenarioViewModel$8T8ds0l7qNyo2l0nQpC5rl_nk1A.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).doOnNext($$Lambda$ScenarioViewModel$Vb0ywXlcidxAe3jPbIK9vmXdek.INSTANCE), doOnNext);
        return LiveDataReactiveStreams.fromPublisher(doOnNext);
    }

    public /* synthetic */ void lambda$getOptions$0$ScenarioViewModel(int i, RealmList realmList) throws Exception {
        Log.d("TAG", "123 X optionsRemote 1 ");
        this.localRepository.saveDataAsList(Collections.singletonList(new OptionsList(Integer.valueOf(i), realmList)), OptionsList.class, false);
    }

    static /* synthetic */ boolean lambda$getOptions$1(List list) throws Exception {
        return list != null && list.size() > 0;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        if (!this.compositeDisposable.isDisposed()) {
            this.compositeDisposable.dispose();
        }
    }

    public void saveState(Options options) {
        this.compositeDisposable.add(this.remoteRepository.saveState(options).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                ScenarioViewModel.this.lambda$saveState$3$ScenarioViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$saveState$3$ScenarioViewModel(Resource resource) throws Exception {
        this.singleLiveEvent.setValue(resource);
    }

    public SingleLiveEvent<Resource<Void>> getSingleLiveEvent() {
        return this.singleLiveEvent;
    }
}
