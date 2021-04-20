package p035ru.unicorn.ujin.view.fragments.makearecord;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseViewPagerFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0003J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0018\u00010\u0007R\u00020\u0000X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewPagerFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseViewPagerFragment;", "Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewModel;", "()V", "currentPosition", "", "vpadapter", "Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewPagerFragment$RecordViewPager;", "getMyToolbarTitle", "", "initViewPager", "", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "onResume", "onViewCreated", "vm", "setCurrentPosition", "position", "RecordViewPager", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordsViewPagerFragment */
/* compiled from: RecordsViewPagerFragment.kt */
public final class RecordsViewPagerFragment extends BaseViewPagerFragment<RecordsViewModel> {
    private HashMap _$_findViewCache;
    private int currentPosition;
    private RecordViewPager vpadapter;

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
        this.vpadapter = new RecordViewPager(this, childFragmentManager);
        viewPager.setAdapter(this.vpadapter);
    }

    public void onViewCreated(RecordsViewModel recordsViewModel) {
        if (recordsViewModel != null) {
            recordsViewModel.getAll();
        }
    }

    public void onResume() {
        TabLayout.Tab tabAt;
        super.onResume();
        TabLayout tabLayout = this.tabLayout;
        Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
        if (tabLayout.getTabCount() > this.currentPosition && (tabAt = this.tabLayout.getTabAt(this.currentPosition)) != null) {
            tabAt.select();
        }
    }

    public final void setCurrentPosition(int i) {
        this.currentPosition = i;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewPagerFragment$RecordViewPager;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "(Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewPagerFragment;Landroidx/fragment/app/FragmentManager;)V", "getCount", "", "getItem", "Lru/unicorn/ujin/view/fragments/makearecord/ListOfRecordFragment;", "position", "getPageTitle", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordsViewPagerFragment$RecordViewPager */
    /* compiled from: RecordsViewPagerFragment.kt */
    public final class RecordViewPager extends FragmentPagerAdapter {
        final /* synthetic */ RecordsViewPagerFragment this$0;

        public int getCount() {
            return 2;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RecordViewPager(RecordsViewPagerFragment recordsViewPagerFragment, FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            Intrinsics.checkNotNullParameter(fragmentManager, "fm");
            this.this$0 = recordsViewPagerFragment;
        }

        public ListOfRecordFragment getItem(int i) {
            return ListOfRecordFragment.Companion.start(i);
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
