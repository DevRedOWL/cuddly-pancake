package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.refactor_1;

import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.EmptySection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.HelpDeskViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.RateTicketDialog;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketListSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseSectionFragment;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0014J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0016H\u0014J\u0012\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0018\u0010 \u001a\u00020\u00162\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\"H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/refactor_1/AppListFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseSectionFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/HelpDeskViewModel;", "()V", "currentPosition", "", "getCurrentPosition", "()I", "setCurrentPosition", "(I)V", "emptySection", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/EmptySection;", "getEmptySection", "()Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/EmptySection;", "emptySection$delegate", "Lkotlin/Lazy;", "ticketListSection", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/TicketListSection;", "getTicketListSection", "()Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/TicketListSection;", "ticketListSection$delegate", "createButtonSettings", "", "getLayoutRes", "getMyToolbarTitle", "", "initSections", "onViewCreated", "viewModell", "showRateTicketDialog", "serviceTicket", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/ServiceTicket;", "showServiceTickets", "tickets", "", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.refactor_1.AppListFragment */
/* compiled from: AppListFragment.kt */
public final class AppListFragment extends BaseSectionFragment<HelpDeskViewModel> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private int currentPosition;
    private final Lazy emptySection$delegate = LazyKt.lazy(new AppListFragment$emptySection$2(this));
    private final Lazy ticketListSection$delegate = LazyKt.lazy(new AppListFragment$ticketListSection$2(this));

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

    public final EmptySection getEmptySection() {
        return (EmptySection) this.emptySection$delegate.getValue();
    }

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_service_ticket_list;
    }

    public final TicketListSection getTicketListSection() {
        return (TicketListSection) this.ticketListSection$delegate.getValue();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ HelpDeskViewModel access$getViewModell$p(AppListFragment appListFragment) {
        return (HelpDeskViewModel) appListFragment.viewModell;
    }

    public final int getCurrentPosition() {
        return this.currentPosition;
    }

    public final void setCurrentPosition(int i) {
        this.currentPosition = i;
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        getEmptySection().show(false);
        this.sectionedAdapter.addSection(getTicketListSection());
        this.sectionedAdapter.addSection(getEmptySection());
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(HelpDeskViewModel helpDeskViewModel) {
        SingleLiveEvent<List<ServiceTicket>> archiveListMutableLiveData;
        SingleLiveEvent<List<ServiceTicket>> activeListMutableLiveData;
        ProgressBar progressBar = this.f6913pb;
        Intrinsics.checkNotNullExpressionValue(progressBar, "pb");
        progressBar.setVisibility(0);
        if (this.currentPosition != 1) {
            if (!(helpDeskViewModel == null || (activeListMutableLiveData = helpDeskViewModel.getActiveListMutableLiveData()) == null)) {
                ExtensionKt.observe((Fragment) this, activeListMutableLiveData, new AppListFragment$onViewCreated$$inlined$let$lambda$2(this));
            }
        } else if (!(helpDeskViewModel == null || (archiveListMutableLiveData = helpDeskViewModel.getArchiveListMutableLiveData()) == null)) {
            ExtensionKt.observe((Fragment) this, archiveListMutableLiveData, new AppListFragment$onViewCreated$$inlined$let$lambda$1(this));
        }
        createButtonSettings();
    }

    private final void createButtonSettings() {
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.create);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "create");
        ExtensionKt.setVisible(dynamicBackgroundButton, this.currentPosition == 0);
        DynamicBackgroundButton dynamicBackgroundButton2 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.create);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton2, "create");
        dynamicBackgroundButton2.setText(getString(R.string.button_new_ticket));
        DynamicBackgroundButton dynamicBackgroundButton3 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.create);
        if (dynamicBackgroundButton3 != null) {
            dynamicBackgroundButton3.setOnClickListener(new AppListFragment$createButtonSettings$1(this));
        }
    }

    /* access modifiers changed from: private */
    public final void showServiceTickets(List<? extends ServiceTicket> list) {
        ProgressBar progressBar = this.f6913pb;
        Intrinsics.checkNotNullExpressionValue(progressBar, "pb");
        progressBar.setVisibility(4);
        EmptySection emptySection = getEmptySection();
        boolean z = true;
        if (list == null || !list.isEmpty()) {
            z = false;
        }
        emptySection.show(z);
        getTicketListSection().setData(list);
        this.f6800rv.scrollToPosition(0);
    }

    /* access modifiers changed from: private */
    public final void showRateTicketDialog(ServiceTicket serviceTicket) {
        RateTicketDialog.Companion companion = RateTicketDialog.Companion;
        String ticketId = serviceTicket.getTicketId();
        Intrinsics.checkNotNullExpressionValue(ticketId, "serviceTicket.ticketId");
        RateTicketDialog newInstance = companion.newInstance(ticketId, new AppListFragment$showRateTicketDialog$1(this));
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        newInstance.show(baseActivity.getSupportFragmentManager(), "");
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_uk_zayavka);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_uk_zayavka)");
        return string;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/refactor_1/AppListFragment$Companion;", "", "()V", "start", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/refactor_1/AppListFragment;", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.refactor_1.AppListFragment$Companion */
    /* compiled from: AppListFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AppListFragment start(int i) {
            AppListFragment appListFragment = new AppListFragment();
            appListFragment.setCurrentPosition(i);
            return appListFragment;
        }
    }
}
