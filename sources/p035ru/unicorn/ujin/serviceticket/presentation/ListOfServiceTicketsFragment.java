package p035ru.unicorn.ujin.serviceticket.presentation;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseViewPagerFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0014J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016R\u001f\u0010\u0004\u001a\u00060\u0005R\u00020\u00008BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/serviceticket/presentation/ListOfServiceTicketsFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseViewPagerFragment;", "Lru/unicorn/ujin/serviceticket/presentation/ServiceTicketViewModel;", "()V", "vpAdapter", "Lru/unicorn/ujin/serviceticket/presentation/ListOfServiceTicketsFragment$ServiceTicketViewPagerAdapter;", "getVpAdapter", "()Lru/unicorn/ujin/serviceticket/presentation/ListOfServiceTicketsFragment$ServiceTicketViewPagerAdapter;", "vpAdapter$delegate", "Lkotlin/Lazy;", "getLayoutRes", "", "getMyToolbarTitle", "", "initViewPager", "", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "onViewCreated", "viewModell", "ServiceTicketViewPagerAdapter", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.serviceticket.presentation.ListOfServiceTicketsFragment */
/* compiled from: ListOfServiceTicketsFragment.kt */
public final class ListOfServiceTicketsFragment extends BaseViewPagerFragment<ServiceTicketViewModel> {
    private HashMap _$_findViewCache;
    private final Lazy vpAdapter$delegate = LazyKt.lazy(new ListOfServiceTicketsFragment$vpAdapter$2(this));

    private final ServiceTicketViewPagerAdapter getVpAdapter() {
        return (ServiceTicketViewPagerAdapter) this.vpAdapter$delegate.getValue();
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
    public int getLayoutRes() {
        return R.layout.fragment_ticket_list_with_viewpager;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(ServiceTicketViewModel serviceTicketViewModel) {
    }

    /* access modifiers changed from: protected */
    public void initViewPager(ViewPager viewPager) {
        if (viewPager != null) {
            viewPager.setAdapter(getVpAdapter());
        }
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_helpdesk_service);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_helpdesk_service)");
        return string;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/serviceticket/presentation/ListOfServiceTicketsFragment$ServiceTicketViewPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "(Lru/unicorn/ujin/serviceticket/presentation/ListOfServiceTicketsFragment;Landroidx/fragment/app/FragmentManager;)V", "getCount", "", "getItem", "Lru/unicorn/ujin/serviceticket/presentation/BaseServiceTicketFragment;", "position", "getPageTitle", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.serviceticket.presentation.ListOfServiceTicketsFragment$ServiceTicketViewPagerAdapter */
    /* compiled from: ListOfServiceTicketsFragment.kt */
    public final class ServiceTicketViewPagerAdapter extends FragmentPagerAdapter {
        final /* synthetic */ ListOfServiceTicketsFragment this$0;

        public int getCount() {
            return 2;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ServiceTicketViewPagerAdapter(ListOfServiceTicketsFragment listOfServiceTicketsFragment, FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            Intrinsics.checkNotNullParameter(fragmentManager, "fm");
            this.this$0 = listOfServiceTicketsFragment;
        }

        public BaseServiceTicketFragment getItem(int i) {
            return new BaseServiceTicketFragment();
        }

        public CharSequence getPageTitle(int i) {
            if (i == 0) {
                String string = this.this$0.getString(R.string.label_current_tickets);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_current_tickets)");
                return string;
            }
            String string2 = this.this$0.getString(R.string.label_archive_tickets);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.label_archive_tickets)");
            return string2;
        }
    }
}
