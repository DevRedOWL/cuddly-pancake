package p035ru.unicorn.ujin.serviceticket.presentation;

import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/serviceticket/presentation/ServiceTicketViewModel;", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/BaseViewModel;", "()V", "mutableShowAddButton", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "", "getMutableShowAddButton", "()Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.serviceticket.presentation.ServiceTicketViewModel */
/* compiled from: ServiceTicketViewModel.kt */
public final class ServiceTicketViewModel extends BaseViewModel {
    private final SingleLiveEvent<Boolean> mutableShowAddButton = new SingleLiveEvent<>();

    public final SingleLiveEvent<Boolean> getMutableShowAddButton() {
        return this.mutableShowAddButton;
    }
}
