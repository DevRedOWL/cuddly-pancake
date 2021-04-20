package p035ru.unicorn.ujin.serviceticket.presentation;

import android.view.View;
import java.util.HashMap;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseSectionFragment;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\u0017\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u000e"}, mo51343d2 = {"Lru/unicorn/ujin/serviceticket/presentation/BaseServiceTicketFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseSectionFragment;", "Lru/unicorn/ujin/serviceticket/presentation/ServiceTicketViewModel;", "()V", "getMyToolbarTitle", "", "initSections", "", "onShowAddButton", "showAddButton", "", "(Ljava/lang/Boolean;)V", "onViewCreated", "vm", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.serviceticket.presentation.BaseServiceTicketFragment */
/* compiled from: BaseServiceTicketFragment.kt */
public final class BaseServiceTicketFragment extends BaseSectionFragment<ServiceTicketViewModel> {
    private HashMap _$_findViewCache;

    /* access modifiers changed from: private */
    public final void onShowAddButton(Boolean bool) {
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        return "";
    }

    /* access modifiers changed from: protected */
    public void initSections() {
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(ServiceTicketViewModel serviceTicketViewModel) {
        SingleLiveEvent<Boolean> mutableShowAddButton;
        if (serviceTicketViewModel != null && (mutableShowAddButton = serviceTicketViewModel.getMutableShowAddButton()) != null) {
            mutableShowAddButton.observe(getViewLifecycleOwner(), new BaseServiceTicketFragment$onViewCreated$1(this));
        }
    }
}
