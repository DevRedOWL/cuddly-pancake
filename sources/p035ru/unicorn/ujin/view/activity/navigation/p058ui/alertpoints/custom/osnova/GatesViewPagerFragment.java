package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.custom.osnova;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.MyBeacon;
import p035ru.unicorn.ujin.data.realm.Point;
import p035ru.unicorn.ujin.data.realm.Points;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.GatesViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseViewPager2Fragment;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapField;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;
import p035ru.unicorn.ujin.view.toolbar.ToolbarsHelper;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\b\u0018\u00010\u0005R\u00020\u0000X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/alertpoints/custom/osnova/GatesViewPagerFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseViewPager2Fragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/alertpoints/GatesViewModel;", "()V", "vpadapter", "Lru/unicorn/ujin/view/activity/navigation/ui/alertpoints/custom/osnova/GatesViewPagerFragment$GateViewPager;", "checkActiveBeacon", "", "points", "", "Lru/unicorn/ujin/data/realm/Point;", "drawSettingIcon", "", "getMyToolbarTitle", "", "initViewPager", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "onPause", "onViewCreated", "vm", "GateViewPager", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.GatesViewPagerFragment */
/* compiled from: GatesViewPagerFragment.kt */
public final class GatesViewPagerFragment extends BaseViewPager2Fragment<GatesViewModel> {
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public GateViewPager vpadapter;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.GatesViewPagerFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 2;
        }
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

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    public void initViewPager(ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "viewPager");
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        this.vpadapter = new GateViewPager(this, childFragmentManager);
        viewPager2.setAdapter(this.vpadapter);
    }

    public void onViewCreated(GatesViewModel gatesViewModel) {
        Intrinsics.checkNotNullParameter(gatesViewModel, "vm");
        setNeedResetToolbar(true);
        TabLayout tabLayout = this.tabLayout;
        Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
        tabLayout.setTabMode(0);
        MutableLiveData<Boolean> showLoader = gatesViewModel.getShowLoader();
        Intrinsics.checkNotNullExpressionValue(showLoader, "vm.getShowLoader()");
        ExtensionKt.observe((Fragment) this, showLoader, new GatesViewPagerFragment$onViewCreated$1(this));
        gatesViewModel.getActionList(false);
        MutableLiveData<Resource<Points>> mutableData = gatesViewModel.getMutableData();
        Intrinsics.checkNotNullExpressionValue(mutableData, "vm.mutableData");
        ExtensionKt.observe((Fragment) this, mutableData, new GatesViewPagerFragment$onViewCreated$2(this));
    }

    /* access modifiers changed from: private */
    public final boolean checkActiveBeacon(List<? extends Point> list) {
        for (Point beacons : list) {
            RealmList<MyBeacon> beacons2 = beacons.getBeacons();
            if (beacons2 != null && beacons2.size() > 0) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void drawSettingIcon() {
        ArrayList<View> createSingleButton = new ToolbarsHelper(getActivity()).createSingleButton(R.drawable.ic_svg_settings);
        createSingleButton.get(0).setOnClickListener(new GatesViewPagerFragment$drawSettingIcon$1(this));
        getBaseActivity().setToolbarRight(createSingleButton);
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_permisson);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_permisson)");
        return string;
    }

    public void onPause() {
        super.onPause();
        setNeedResetToolbar(false);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/alertpoints/custom/osnova/GatesViewPagerFragment$GateViewPager;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "(Lru/unicorn/ujin/view/activity/navigation/ui/alertpoints/custom/osnova/GatesViewPagerFragment;Landroidx/fragment/app/FragmentManager;)V", "listOfPoint", "", "Lru/unicorn/ujin/data/realm/Point;", "createFragment", "Lru/unicorn/ujin/view/activity/navigation/ui/alertpoints/custom/osnova/ListOfGateFragment;", "position", "", "getItemCount", "update", "", "points", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.GatesViewPagerFragment$GateViewPager */
    /* compiled from: GatesViewPagerFragment.kt */
    public final class GateViewPager extends FragmentStateAdapter {
        private List<? extends Point> listOfPoint = CollectionsKt.emptyList();
        final /* synthetic */ GatesViewPagerFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GateViewPager(GatesViewPagerFragment gatesViewPagerFragment, FragmentManager fragmentManager) {
            super(fragmentManager, gatesViewPagerFragment.getLifecycle());
            Intrinsics.checkNotNullParameter(fragmentManager, "fm");
            this.this$0 = gatesViewPagerFragment;
        }

        public final void update(List<? extends Point> list) {
            Intrinsics.checkNotNullParameter(list, MapField.JsonFields.pointList);
            if (!list.isEmpty()) {
                this.listOfPoint = list;
                notifyDataSetChanged();
            }
        }

        public int getItemCount() {
            return this.listOfPoint.size();
        }

        public ListOfGateFragment createFragment(int i) {
            String id = ((Point) this.listOfPoint.get(i)).getId();
            if (id == null) {
                id = "0";
            }
            return ListOfGateFragment.Companion.start(id);
        }
    }
}
