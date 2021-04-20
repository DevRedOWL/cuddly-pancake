package p035ru.unicorn.ujin.view.fragments.dynamic;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.viewModel.events.RegisterGhostEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/dynamic/DynamicFormViewModel;", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/BaseViewModel;", "()V", "dynamicFormLiveData", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "Lru/unicorn/ujin/view/fragments/dynamic/DynamicFormEvent;", "getDynamicFormLiveData", "()Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "profileLocalRepository", "Lru/unicorn/ujin/data/profile/repository/ProfileLocalRepository;", "getProfileLocalRepository", "()Lru/unicorn/ujin/data/profile/repository/ProfileLocalRepository;", "remoteRepository", "Lru/unicorn/ujin/view/fragments/dynamic/DynamicFormRemoteRepository;", "getRemoteRepository", "()Lru/unicorn/ujin/view/fragments/dynamic/DynamicFormRemoteRepository;", "getLayout", "", "id", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.dynamic.DynamicFormViewModel */
/* compiled from: DynamicFormViewModel.kt */
public final class DynamicFormViewModel extends BaseViewModel {
    private final SingleLiveEvent<DynamicFormEvent> dynamicFormLiveData = new SingleLiveEvent<>();
    private final ProfileLocalRepository profileLocalRepository = ProfileLocalRepository.Companion.getInstance();
    private final DynamicFormRemoteRepository remoteRepository = new DynamicFormRemoteRepository();

    public DynamicFormViewModel() {
        this.compositeDisposable.addAll(this.remoteRepository.getLayoutSubject().subscribe(new Consumer<DynamicFormEvent>(this) {
            final /* synthetic */ DynamicFormViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(DynamicFormEvent dynamicFormEvent) {
                DynamicFormViewModel dynamicFormViewModel = this.this$0;
                dynamicFormViewModel.showLoader.postValue(false);
                dynamicFormViewModel.getDynamicFormLiveData().postValue(dynamicFormEvent);
            }
        }), this.remoteRepository.getGhostRegisterSubject().subscribe(new Consumer<RegisterGhostEvent>(this) {
            final /* synthetic */ DynamicFormViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(RegisterGhostEvent registerGhostEvent) {
                this.this$0.getProfileLocalRepository().registerGhostUser(registerGhostEvent.getToken());
            }
        }));
    }

    public final SingleLiveEvent<DynamicFormEvent> getDynamicFormLiveData() {
        return this.dynamicFormLiveData;
    }

    public final DynamicFormRemoteRepository getRemoteRepository() {
        return this.remoteRepository;
    }

    public final ProfileLocalRepository getProfileLocalRepository() {
        return this.profileLocalRepository;
    }

    public final void getLayout(int i) {
        this.showLoader.postValue(true);
        this.remoteRepository.getLayout(i);
    }
}
