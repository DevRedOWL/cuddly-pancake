package p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel;

import androidx.lifecycle.ViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import p035ru.unicorn.ujin.viewModel.SingleLiveEvent;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.disposables.CompositeDisposable;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0018"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/viewModel/chatViewModel/RozmarinViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "remoteRepository", "Lru/unicorn/ujin/view/fragments/chats/viewModel/chatViewModel/RozmarinRemoteRepository;", "getRemoteRepository", "()Lru/unicorn/ujin/view/fragments/chats/viewModel/chatViewModel/RozmarinRemoteRepository;", "remoteRepository$delegate", "Lkotlin/Lazy;", "requestLiveData", "Lru/unicorn/ujin/viewModel/SingleLiveEvent;", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "getRequestLiveData", "()Lru/unicorn/ujin/viewModel/SingleLiveEvent;", "showProgressLiveData", "", "getShowProgressLiveData", "onCleared", "", "requestBuy", "requestRent", "requestTashir", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.RozmarinViewModel */
/* compiled from: RozmarinViewModel.kt */
public final class RozmarinViewModel extends ViewModel {
    private final CompositeDisposable compositeDisposable = new CompositeDisposable();
    private final Lazy remoteRepository$delegate = LazyKt.lazy(RozmarinViewModel$remoteRepository$2.INSTANCE);
    private final SingleLiveEvent<UpdateEvent> requestLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<Boolean> showProgressLiveData = new SingleLiveEvent<>();

    private final RozmarinRemoteRepository getRemoteRepository() {
        return (RozmarinRemoteRepository) this.remoteRepository$delegate.getValue();
    }

    public RozmarinViewModel() {
        this.compositeDisposable.addAll(getRemoteRepository().getRequestSubject().subscribe(new Consumer<UpdateEvent>(this) {
            final /* synthetic */ RozmarinViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(UpdateEvent updateEvent) {
                RozmarinViewModel rozmarinViewModel = this.this$0;
                rozmarinViewModel.getShowProgressLiveData().setValue(false);
                rozmarinViewModel.getRequestLiveData().setValue(updateEvent);
            }
        }));
    }

    public final SingleLiveEvent<UpdateEvent> getRequestLiveData() {
        return this.requestLiveData;
    }

    public final SingleLiveEvent<Boolean> getShowProgressLiveData() {
        return this.showProgressLiveData;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        this.compositeDisposable.dispose();
        super.onCleared();
    }

    public final void requestTashir() {
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().requestTashir();
    }

    public final void requestBuy() {
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().requestBuy();
    }

    public final void requestRent() {
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().requestRent();
    }
}
