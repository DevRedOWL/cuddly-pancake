package p035ru.unicorn.ujin.view.fragments.providerService;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/providerService/ProviderServiceViewModel;", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/BaseViewModel;", "()V", "activeProviderInfoLiveData", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "Lru/unicorn/ujin/view/fragments/providerService/ActiveProviderInfoEvent;", "getActiveProviderInfoLiveData", "()Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "deleteActiveProviderInfoLiveData", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "getDeleteActiveProviderInfoLiveData", "providerInfoLiveData", "Lru/unicorn/ujin/view/fragments/providerService/ProviderInfoEvent;", "getProviderInfoLiveData", "remoteRepository", "Lru/unicorn/ujin/view/fragments/providerService/ProviderServiceRemoteRepository;", "getRemoteRepository", "()Lru/unicorn/ujin/view/fragments/providerService/ProviderServiceRemoteRepository;", "requestActiveProviderServiceInfo", "", "serviceId", "", "requestDeleteActiveProviderServiceInfo", "requestProviderServiceInfo", "provider", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.ProviderServiceViewModel */
/* compiled from: ProviderServiceViewModel.kt */
public final class ProviderServiceViewModel extends BaseViewModel {
    private final SingleLiveEvent<ActiveProviderInfoEvent> activeProviderInfoLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<UpdateEvent> deleteActiveProviderInfoLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<ProviderInfoEvent> providerInfoLiveData = new SingleLiveEvent<>();
    private final ProviderServiceRemoteRepository remoteRepository = new ProviderServiceRemoteRepository();

    public ProviderServiceViewModel() {
        this.compositeDisposable.addAll(this.remoteRepository.getProviderInfoSubject().subscribe(new Consumer<ProviderInfoEvent>(this) {
            final /* synthetic */ ProviderServiceViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(ProviderInfoEvent providerInfoEvent) {
                this.this$0.showLoader.postValue(false);
                this.this$0.getProviderInfoLiveData().postValue(providerInfoEvent);
            }
        }), this.remoteRepository.getActiveProviderInfoSubject().subscribe(new Consumer<ActiveProviderInfoEvent>(this) {
            final /* synthetic */ ProviderServiceViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(ActiveProviderInfoEvent activeProviderInfoEvent) {
                this.this$0.showLoader.postValue(false);
                this.this$0.getActiveProviderInfoLiveData().postValue(activeProviderInfoEvent);
            }
        }), this.remoteRepository.getDeleteActiveProviderInfoSubject().subscribe(new Consumer<UpdateEvent>(this) {
            final /* synthetic */ ProviderServiceViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(UpdateEvent updateEvent) {
                this.this$0.showLoader.postValue(false);
                this.this$0.getDeleteActiveProviderInfoLiveData().postValue(updateEvent);
            }
        }));
    }

    public final ProviderServiceRemoteRepository getRemoteRepository() {
        return this.remoteRepository;
    }

    public final SingleLiveEvent<ProviderInfoEvent> getProviderInfoLiveData() {
        return this.providerInfoLiveData;
    }

    public final SingleLiveEvent<ActiveProviderInfoEvent> getActiveProviderInfoLiveData() {
        return this.activeProviderInfoLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getDeleteActiveProviderInfoLiveData() {
        return this.deleteActiveProviderInfoLiveData;
    }

    public final void requestProviderServiceInfo(String str) {
        Intrinsics.checkNotNullParameter(str, "provider");
        this.showLoader.postValue(true);
        this.remoteRepository.getProviderInfo(str);
    }

    public final void requestActiveProviderServiceInfo(int i) {
        this.showLoader.postValue(true);
        this.remoteRepository.getActiveProviderInfo(i);
    }

    public final void requestDeleteActiveProviderServiceInfo(int i) {
        this.showLoader.postValue(true);
        this.remoteRepository.deleteActiveProviderInfo(i);
    }
}
