package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.refactor_1;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.HelpDeskViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseViewPagerFragment;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0003J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\tH\u0016J\u0012\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000f\u001a\u00020\tH\u0002R\u0014\u0010\u0004\u001a\b\u0018\u00010\u0005R\u00020\u0000X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/refactor_1/AppViewPagerFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseViewPagerFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/HelpDeskViewModel;", "()V", "vpadapter", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/refactor_1/AppViewPagerFragment$AppViewPager;", "getMyToolbarTitle", "", "initViewPager", "", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "onResume", "onViewCreated", "vm", "showServiceTickets", "AppViewPager", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.refactor_1.AppViewPagerFragment */
/* compiled from: AppViewPagerFragment.kt */
public final class AppViewPagerFragment extends BaseViewPagerFragment<HelpDeskViewModel> {
    private HashMap _$_findViewCache;
    private AppViewPager vpadapter;

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
        return "123";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    public void initViewPager(ViewPager viewPager) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        this.vpadapter = new AppViewPager(this, childFragmentManager);
        viewPager.setAdapter(this.vpadapter);
    }

    public void onViewCreated(HelpDeskViewModel helpDeskViewModel) {
        SingleLiveEvent<List<ServiceTicket>> listMutableLiveData;
        if (helpDeskViewModel != null) {
            helpDeskViewModel.getTickets();
        }
        if (helpDeskViewModel != null && (listMutableLiveData = helpDeskViewModel.getListMutableLiveData()) != null) {
            ExtensionKt.observe((Fragment) this, listMutableLiveData, new AppViewPagerFragment$onViewCreated$$inlined$let$lambda$1(this));
        }
    }

    /* access modifiers changed from: private */
    public final void showServiceTickets() {
        HelpDeskViewModel helpDeskViewModel = (HelpDeskViewModel) getViewModell();
        if (helpDeskViewModel != null) {
            helpDeskViewModel.filterTicketList();
        }
    }

    public void onResume() {
        super.onResume();
        ViewPager viewPager = this.viewPager;
        Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
        viewPager.setCurrentItem(0);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/refactor_1/AppViewPagerFragment$AppViewPager;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "(Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/refactor_1/AppViewPagerFragment;Landroidx/fragment/app/FragmentManager;)V", "getCount", "", "getItem", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/refactor_1/AppListFragment;", "position", "getPageTitle", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.refactor_1.AppViewPagerFragment$AppViewPager */
    /* compiled from: AppViewPagerFragment.kt */
    public final class AppViewPager extends FragmentPagerAdapter {
        final /* synthetic */ AppViewPagerFragment this$0;

        public int getCount() {
            return 2;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AppViewPager(AppViewPagerFragment appViewPagerFragment, FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            Intrinsics.checkNotNullParameter(fragmentManager, "fm");
            this.this$0 = appViewPagerFragment;
        }

        public AppListFragment getItem(int i) {
            return AppListFragment.Companion.start(i);
        }

        public CharSequence getPageTitle(int i) {
            if (i == 0) {
                String string = this.this$0.getString(R.string.label_current_tickets);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_current_tickets)");
                return string;
            }
            String string2 = this.this$0.getString(R.string.label_record_archive);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.label_record_archive)");
            return string2;
        }
    }
}
