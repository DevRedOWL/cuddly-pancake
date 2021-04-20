package p035ru.unicorn.ujin.view.activity.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import p035ru.unicorn.ujin.data.realm.UnreadBadge;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.schedulers.Schedulers;
import p046io.realm.RealmModel;

/* renamed from: ru.unicorn.ujin.view.activity.viewmodel.ThirdPhaseViewModel */
public class ThirdPhaseViewModel extends ViewModel {
    private LocalRepository localRepository = LocalRepository.getInstance();
    private MutableLiveData<Boolean> showBadge = new MutableLiveData<>();

    static /* synthetic */ boolean lambda$showBadge$0(RealmModel realmModel) throws Exception {
        return realmModel != null;
    }

    public void showBadge() {
        this.localRepository.getFistElementSimple(UnreadBadge.class).filter($$Lambda$ThirdPhaseViewModel$Db6gqEB8kG0n5vBdXRA3MT1JGY.INSTANCE).cast(UnreadBadge.class).observeOn(Schedulers.m6765io()).subscribeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                ThirdPhaseViewModel.this.lambda$showBadge$1$ThirdPhaseViewModel((UnreadBadge) obj);
            }
        });
    }

    public /* synthetic */ void lambda$showBadge$1$ThirdPhaseViewModel(UnreadBadge unreadBadge) throws Exception {
        getShowBadge().postValue(Boolean.valueOf(unreadBadge.isHasUnread()));
    }

    public MutableLiveData<Boolean> getShowBadge() {
        return this.showBadge;
    }
}
