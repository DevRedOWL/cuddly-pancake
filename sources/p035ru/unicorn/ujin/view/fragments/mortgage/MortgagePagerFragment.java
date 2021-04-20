package p035ru.unicorn.ujin.view.fragments.mortgage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.ContextBanner;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.fragments.mortgage.adapters.MortgagePagerAdapter;
import p035ru.unicorn.ujin.viewModel.RealmViewModel;
import p051me.relex.circleindicator.CircleIndicator;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0014J&\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J \u0010\u0012\u001a\u00020\u00102\u0016\u0010\u0013\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015\u0018\u00010\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/mortgage/MortgagePagerFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "mortgagePagerAdapter", "Lru/unicorn/ujin/view/fragments/mortgage/adapters/MortgagePagerAdapter;", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "showData", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "", "Lru/unicorn/ujin/data/realm/ContextBanner;", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.mortgage.MortgagePagerFragment */
/* compiled from: MortgagePagerFragment.kt */
public final class MortgagePagerFragment extends BaseFragment {
    public static final String COMPLEX_ID = "complexId";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String SHOW_TITLE = "showTitle";
    private HashMap _$_findViewCache;
    private MortgagePagerAdapter mortgagePagerAdapter;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.mortgage.MortgagePagerFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 3;
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

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_mortgage_pager, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setNeedResetToolbar(false);
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.mortgageLayout);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "mortgageLayout");
        int i = 8;
        linearLayout.setVisibility(8);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("complexId")) == null) {
            str = "";
        }
        Intrinsics.checkNotNullExpressionValue(str, "arguments?.getString(COMPLEX_ID) ?: \"\"");
        Bundle arguments2 = getArguments();
        boolean z = arguments2 != null ? arguments2.getBoolean(SHOW_TITLE, false) : false;
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvTitle);
        Intrinsics.checkNotNullExpressionValue(textView, "tvTitle");
        if (z) {
            i = 0;
        }
        textView.setVisibility(i);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        this.mortgagePagerAdapter = new MortgagePagerAdapter(new ArrayList(), context);
        MortgagePagerAdapter mortgagePagerAdapter2 = this.mortgagePagerAdapter;
        if (mortgagePagerAdapter2 != null) {
            mortgagePagerAdapter2.setShowMortgageFragment(new MortgagePagerFragment$onViewCreated$1(this, str));
        }
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(C5619R.C5622id.mortgageViewPager);
        viewPager.setAdapter(this.mortgagePagerAdapter);
        viewPager.setPageMargin(viewPager.getResources().getDimensionPixelOffset(R.dimen.padding));
        viewPager.setClipToPadding(false);
        if (!StringsKt.isBlank(str)) {
            RealmViewModel realmViewModel = this.viewModel;
            ArrayList arrayList = new ArrayList();
            arrayList.add("complex");
            Unit unit = Unit.INSTANCE;
            realmViewModel.getContextBannerList(arrayList);
            this.viewModel.getMortgageListLiveData().observe(this, new MortgagePagerFragment$onViewCreated$4(this));
        }
    }

    /* access modifiers changed from: private */
    public final void showData(Resource<List<ContextBanner>> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                Collection data = resource.getData();
                if (data == null || data.isEmpty()) {
                    LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.mortgageLayout);
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "mortgageLayout");
                    linearLayout.setVisibility(8);
                    return;
                }
                LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.mortgageLayout);
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "mortgageLayout");
                linearLayout2.setVisibility(0);
                MortgagePagerAdapter mortgagePagerAdapter2 = this.mortgagePagerAdapter;
                if (mortgagePagerAdapter2 != null) {
                    List<ContextBanner> data2 = resource.getData();
                    Intrinsics.checkNotNullExpressionValue(data2, "resource.data");
                    mortgagePagerAdapter2.setItems(data2);
                }
                ((CircleIndicator) _$_findCachedViewById(C5619R.C5622id.indicator)).setViewPager((ViewPager) _$_findCachedViewById(C5619R.C5622id.mortgageViewPager));
                if (resource.getData().size() > 1) {
                    CircleIndicator circleIndicator = (CircleIndicator) _$_findCachedViewById(C5619R.C5622id.indicator);
                    Intrinsics.checkNotNullExpressionValue(circleIndicator, "indicator");
                    circleIndicator.setVisibility(0);
                    return;
                }
                CircleIndicator circleIndicator2 = (CircleIndicator) _$_findCachedViewById(C5619R.C5622id.indicator);
                Intrinsics.checkNotNullExpressionValue(circleIndicator2, "indicator");
                circleIndicator2.setVisibility(8);
            } else if (i == 2) {
                LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.mortgageLayout);
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "mortgageLayout");
                linearLayout3.setVisibility(8);
            }
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/mortgage/MortgagePagerFragment$Companion;", "", "()V", "COMPLEX_ID", "", "SHOW_TITLE", "newInstance", "Lru/unicorn/ujin/view/fragments/mortgage/MortgagePagerFragment;", "complexId", "showTitle", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.mortgage.MortgagePagerFragment$Companion */
    /* compiled from: MortgagePagerFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MortgagePagerFragment newInstance(String str, boolean z) {
            MortgagePagerFragment mortgagePagerFragment = new MortgagePagerFragment();
            Bundle bundle = new Bundle();
            bundle.putString("complexId", str);
            bundle.putBoolean(MortgagePagerFragment.SHOW_TITLE, z);
            Unit unit = Unit.INSTANCE;
            mortgagePagerFragment.setArguments(bundle);
            return mortgagePagerFragment;
        }
    }
}
