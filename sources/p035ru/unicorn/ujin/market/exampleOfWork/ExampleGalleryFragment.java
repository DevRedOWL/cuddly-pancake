package p035ru.unicorn.ujin.market.exampleOfWork;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.SampleWork;
import p035ru.unicorn.ujin.market.MarketBaseFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\u0004H\u0014J$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/market/exampleOfWork/ExampleGalleryFragment;", "Lru/unicorn/ujin/market/MarketBaseFragment;", "()V", "companyId", "", "currentPosition", "", "exampleGalleryAdapter", "Lru/unicorn/ujin/market/exampleOfWork/ExampleGalleryAdapter;", "exampleList", "", "Lru/unicorn/ujin/data/realm/marketplace/SampleWork;", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "setTitle", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.exampleOfWork.ExampleGalleryFragment */
/* compiled from: ExampleGalleryFragment.kt */
public final class ExampleGalleryFragment extends MarketBaseFragment {
    public static final String COMPANY_ID = "companyId";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String POSITION = "position";
    private HashMap _$_findViewCache;
    private String companyId;
    /* access modifiers changed from: private */
    public int currentPosition;
    private ExampleGalleryAdapter exampleGalleryAdapter;
    private List<? extends SampleWork> exampleList = CollectionsKt.emptyList();

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
        getBaseActivity().setToolbarRight(initCloseButtonList());
        if (!this.exampleList.isEmpty()) {
            setTitle();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Bundle arguments = getArguments();
        this.companyId = arguments != null ? arguments.getString("companyId") : null;
        Bundle arguments2 = getArguments();
        this.currentPosition = arguments2 != null ? arguments2.getInt("position") : 0;
        View inflate = layoutInflater.inflate(R.layout.fragment_example_of_work, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…f_work, container, false)");
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Collection collection = this.exampleList;
        if (!(collection == null || collection.isEmpty())) {
            List<? extends SampleWork> list = this.exampleList;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            this.exampleGalleryAdapter = new ExampleGalleryAdapter(list, context);
            ViewPager viewPager = (ViewPager) _$_findCachedViewById(C5619R.C5622id.exampleListViewPager);
            viewPager.setAdapter(this.exampleGalleryAdapter);
            viewPager.setPageMargin(viewPager.getResources().getDimensionPixelOffset(R.dimen.smallPadding));
            viewPager.setClipToPadding(false);
            ExampleGalleryAdapter exampleGalleryAdapter2 = this.exampleGalleryAdapter;
            if (exampleGalleryAdapter2 != null) {
                exampleGalleryAdapter2.notifyDataSetChanged();
            }
            ((ViewPager) _$_findCachedViewById(C5619R.C5622id.exampleListViewPager)).addOnPageChangeListener(new ExampleGalleryFragment$onViewCreated$2(this));
            ((ViewPager) _$_findCachedViewById(C5619R.C5622id.exampleListViewPager)).setCurrentItem(this.currentPosition, true);
            setTitle();
        }
    }

    /* access modifiers changed from: private */
    public final void setTitle() {
        getBaseActivity().setTextTitle(getResources().getString(R.string.example_gallery_title, new Object[]{String.valueOf(this.currentPosition + 1), String.valueOf(this.exampleList.size())}));
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/market/exampleOfWork/ExampleGalleryFragment$Companion;", "", "()V", "COMPANY_ID", "", "POSITION", "newInstance", "Lru/unicorn/ujin/market/exampleOfWork/ExampleGalleryFragment;", "companyId", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.exampleOfWork.ExampleGalleryFragment$Companion */
    /* compiled from: ExampleGalleryFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ExampleGalleryFragment newInstance(String str, int i) {
            ExampleGalleryFragment exampleGalleryFragment = new ExampleGalleryFragment();
            Bundle bundle = new Bundle();
            bundle.putString("companyId", str);
            bundle.putInt("position", i);
            Unit unit = Unit.INSTANCE;
            exampleGalleryFragment.setArguments(bundle);
            return exampleGalleryFragment;
        }
    }
}
