package p035ru.unicorn.ujin.view.fragments.development;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.fragments.development.DeveloperViewModel;
import p035ru.unicorn.ujin.data.realm.Complex;
import p035ru.unicorn.ujin.data.realm.DeveloperDayImageList;
import p035ru.unicorn.ujin.data.realm.ImageData;
import p035ru.unicorn.ujin.data.realm.StagePhotoItem;
import p035ru.unicorn.ujin.view.activity.UrlCarouselViewActivity;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 12\u00020\u0001:\u00011B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0014J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J$\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020\u001aH\u0016J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u0010H\u0002J\u001a\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020\u001aH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u00062"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/development/DeveloperBuildingStagesFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "cityId", "", "getCityId", "()Ljava/lang/String;", "setCityId", "(Ljava/lang/String;)V", "developmentViewModel", "Lru/unicorn/fragments/development/DeveloperViewModel;", "getDevelopmentViewModel", "()Lru/unicorn/fragments/development/DeveloperViewModel;", "developmentViewModel$delegate", "Lkotlin/Lazy;", "imagePosition", "", "nextGroup", "photolist", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/data/realm/DeveloperDayImageList;", "Lkotlin/collections/ArrayList;", "stagesAdapter", "Lru/unicorn/ujin/view/fragments/development/DevelopmentStagesPhotoAdapter;", "totalCount", "loadImageData", "", "item", "metricsScreenName", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "onItemClicked", "position", "onViewCreated", "view", "showData", "data", "Lru/unicorn/ujin/data/developerPage/DeveloperPageData;", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.development.DeveloperBuildingStagesFragment */
/* compiled from: DeveloperBuildingStagesFragment.kt */
public final class DeveloperBuildingStagesFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    public String cityId;
    private final Lazy developmentViewModel$delegate = LazyKt.lazy(new DeveloperBuildingStagesFragment$developmentViewModel$2(this));
    private int imagePosition;
    /* access modifiers changed from: private */
    public int nextGroup;
    /* access modifiers changed from: private */
    public ArrayList<DeveloperDayImageList> photolist;
    /* access modifiers changed from: private */
    public DevelopmentStagesPhotoAdapter stagesAdapter;
    /* access modifiers changed from: private */
    public int totalCount;

    /* access modifiers changed from: private */
    public final DeveloperViewModel getDevelopmentViewModel() {
        return (DeveloperViewModel) this.developmentViewModel$delegate.getValue();
    }

    @JvmStatic
    public static final DeveloperBuildingStagesFragment newInstance(ArrayList<DeveloperDayImageList> arrayList) {
        return Companion.newInstance(arrayList);
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
        return "Стройка";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ ArrayList access$getPhotolist$p(DeveloperBuildingStagesFragment developerBuildingStagesFragment) {
        ArrayList<DeveloperDayImageList> arrayList = developerBuildingStagesFragment.photolist;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("photolist");
        }
        return arrayList;
    }

    public static final /* synthetic */ DevelopmentStagesPhotoAdapter access$getStagesAdapter$p(DeveloperBuildingStagesFragment developerBuildingStagesFragment) {
        DevelopmentStagesPhotoAdapter developmentStagesPhotoAdapter = developerBuildingStagesFragment.stagesAdapter;
        if (developmentStagesPhotoAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stagesAdapter");
        }
        return developmentStagesPhotoAdapter;
    }

    public final String getCityId() {
        String str = this.cityId;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Complex.Fields.cityId);
        }
        return str;
    }

    public final void setCityId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cityId = str;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().showImageLogo();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_developer_building_stages, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…stages, container, false)");
        return inflate;
    }

    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        LifecycleOwner lifecycleOwner = this;
        getDevelopmentViewModel().getDevelopmentLiveData().observe(lifecycleOwner, new DeveloperBuildingStagesFragment$onAttach$1(this));
        getDevelopmentViewModel().showLoader.observe(lifecycleOwner, new DeveloperBuildingStagesFragment$onAttach$2(this));
    }

    public void onDetach() {
        LifecycleOwner lifecycleOwner = this;
        getDevelopmentViewModel().getDevelopmentLiveData().removeObservers(lifecycleOwner);
        getDevelopmentViewModel().showLoader.removeObservers(lifecycleOwner);
        super.onDetach();
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvComplex);
        Intrinsics.checkNotNullExpressionValue(textView, "tvComplex");
        textView.setText(getDevelopmentViewModel().getComplexName());
        ((TextView) _$_findCachedViewById(C5619R.C5622id.tvComplex)).setOnClickListener(new DeveloperBuildingStagesFragment$onViewCreated$1(this));
        getDevelopmentViewModel().getDevelopmentData(getBaseActivity().demoFlatId);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0147  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void showData(p035ru.unicorn.ujin.data.developerPage.DeveloperPageData r7) {
        /*
            r6 = this;
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r6.getBaseActivity()
            ru.unicorn.ujin.data.profile.ProfileViewModel r0 = r0.profileViewModel
            ru.unicorn.ujin.data.realm.profile.User r0 = r0.getUser()
            boolean r0 = r0.getUserLoggenIn()
            r1 = 2131230839(0x7f080077, float:1.8077742E38)
            r2 = 0
            if (r0 == 0) goto L_0x0074
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r6.getBaseActivity()
            ru.unicorn.ujin.data.profile.ProfileViewModel r0 = r0.profileViewModel
            ru.unicorn.ujin.data.realm.profile.User r0 = r0.getUser()
            int r0 = r0.getDemo()
            r3 = 1
            if (r0 == r3) goto L_0x0074
            ru.unicorn.fragments.development.DeveloperViewModel r0 = r6.getDevelopmentViewModel()
            ru.unicorn.ujin.data.realm.Complex r0 = r0.getComplex()
            r3 = 0
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = r0.getId()
            goto L_0x0036
        L_0x0035:
            r0 = r3
        L_0x0036:
            ru.unicorn.ujin.view.activity.BaseActivity r4 = r6.getBaseActivity()
            java.lang.String r5 = "baseActivity"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            ru.unicorn.ujin.data.realm.profile.Apartment r4 = r4.getCurrentApartment()
            if (r4 == 0) goto L_0x0049
            java.lang.String r3 = r4.getComplexId()
        L_0x0049:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r3)
            if (r0 == 0) goto L_0x0074
            int r0 = p035ru.unicorn.C5619R.C5622id.tvComplex
            android.view.View r0 = r6._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.res.Resources r3 = r6.getResources()
            r4 = 2131099729(0x7f060051, float:1.781182E38)
            int r3 = r3.getColor(r4)
            r0.setTextColor(r3)
            int r0 = p035ru.unicorn.C5619R.C5622id.tvComplex
            android.view.View r0 = r6._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3 = 2131231219(0x7f0801f3, float:1.8078513E38)
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r3, r2, r1, r2)
            goto L_0x0095
        L_0x0074:
            int r0 = p035ru.unicorn.C5619R.C5622id.tvComplex
            android.view.View r0 = r6._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.res.Resources r3 = r6.getResources()
            r4 = 2131099751(0x7f060067, float:1.7811864E38)
            int r3 = r3.getColor(r4)
            r0.setTextColor(r3)
            int r0 = p035ru.unicorn.C5619R.C5622id.tvComplex
            android.view.View r0 = r6._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r2, r2, r1, r2)
        L_0x0095:
            int r0 = p035ru.unicorn.C5619R.C5622id.textPercent
            android.view.View r0 = r6._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "textPercent"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            ru.unicorn.ujin.data.developerPage.DeveloperPageDataPercent r2 = r7.getProgress()
            java.lang.String r3 = "data.progress"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            float r2 = r2.getPercent()
            int r2 = (int) r2
            r1.append(r2)
            r2 = 2131887938(0x7f120742, float:1.9410497E38)
            java.lang.String r2 = r6.getString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            int r0 = p035ru.unicorn.C5619R.C5622id.textPercentMessage
            android.view.View r0 = r6._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "textPercentMessage"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            ru.unicorn.ujin.data.developerPage.DeveloperPageDataPercent r7 = r7.getProgress()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r3)
            java.lang.String r7 = r7.getText()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r0.setText(r7)
            ru.unicorn.fragments.development.DeveloperViewModel r7 = r6.getDevelopmentViewModel()
            java.util.ArrayList r7 = r7.getPhotolist()
            int r0 = r7.size()
            r6.totalCount = r0
            ru.unicorn.ujin.view.fragments.development.DevelopmentStagesPhotoAdapter r0 = new ru.unicorn.ujin.view.fragments.development.DevelopmentStagesPhotoAdapter
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
            ru.unicorn.ujin.view.fragments.development.DeveloperBuildingStagesFragment$showData$$inlined$let$lambda$1 r2 = new ru.unicorn.ujin.view.fragments.development.DeveloperBuildingStagesFragment$showData$$inlined$let$lambda$1
            r2.<init>(r6)
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r0.<init>(r1, r2)
            r6.stagesAdapter = r0
            int r0 = p035ru.unicorn.C5619R.C5622id.nestedScroll
            android.view.View r0 = r6._$_findCachedViewById(r0)
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            ru.unicorn.ujin.view.fragments.development.DeveloperBuildingStagesFragment$showData$$inlined$let$lambda$2 r1 = new ru.unicorn.ujin.view.fragments.development.DeveloperBuildingStagesFragment$showData$$inlined$let$lambda$2
            r1.<init>(r7, r6)
            androidx.core.widget.NestedScrollView$OnScrollChangeListener r1 = (androidx.core.widget.NestedScrollView.OnScrollChangeListener) r1
            r0.setOnScrollChangeListener(r1)
            androidx.recyclerview.widget.GridLayoutManager r0 = new androidx.recyclerview.widget.GridLayoutManager
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2
            r0.<init>(r1, r2)
            ru.unicorn.ujin.view.fragments.development.DeveloperBuildingStagesFragment$showData$$inlined$let$lambda$3 r1 = new ru.unicorn.ujin.view.fragments.development.DeveloperBuildingStagesFragment$showData$$inlined$let$lambda$3
            r1.<init>(r6)
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = (androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup) r1
            r0.setSpanSizeLookup(r1)
            int r1 = p035ru.unicorn.C5619R.C5622id.rvStageList
            android.view.View r1 = r6._$_findCachedViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = (androidx.recyclerview.widget.RecyclerView.LayoutManager) r0
            r1.setLayoutManager(r0)
            r1.setOverScrollMode(r2)
            ru.unicorn.ujin.view.fragments.development.DevelopmentStagesPhotoAdapter r0 = r6.stagesAdapter
            if (r0 != 0) goto L_0x014c
            java.lang.String r2 = "stagesAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x014c:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = (androidx.recyclerview.widget.RecyclerView.Adapter) r0
            r1.setAdapter(r0)
            int r0 = r6.nextGroup
            java.lang.Object r7 = r7.get(r0)
            java.lang.String r0 = "it[nextGroup]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            ru.unicorn.ujin.data.realm.DeveloperDayImageList r7 = (p035ru.unicorn.ujin.data.realm.DeveloperDayImageList) r7
            r6.loadImageData(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.development.DeveloperBuildingStagesFragment.showData(ru.unicorn.ujin.data.developerPage.DeveloperPageData):void");
    }

    /* access modifiers changed from: private */
    public final void loadImageData(DeveloperDayImageList developerDayImageList) {
        DevelopmentStagesPhotoAdapter developmentStagesPhotoAdapter = this.stagesAdapter;
        if (developmentStagesPhotoAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stagesAdapter");
        }
        developmentStagesPhotoAdapter.addItem(new StagePhotoItem(0, developerDayImageList.getGroup(), (ImageData) null, (Integer) null));
        Iterator<ImageData> it = developerDayImageList.getImageList().iterator();
        while (it.hasNext()) {
            ImageData next = it.next();
            DevelopmentStagesPhotoAdapter developmentStagesPhotoAdapter2 = this.stagesAdapter;
            if (developmentStagesPhotoAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stagesAdapter");
            }
            int i = this.imagePosition;
            this.imagePosition = i + 1;
            developmentStagesPhotoAdapter2.addItem(new StagePhotoItem(1, (String) null, next, Integer.valueOf(i)));
        }
    }

    /* access modifiers changed from: private */
    public final void onItemClicked(int i) {
        UrlCarouselViewActivity.start(getContext(), getDevelopmentViewModel().getPhotoListAsPageData(), (ArrayList<Integer>) null, getDevelopmentViewModel().getComplexName(), i, true);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0007¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/development/DeveloperBuildingStagesFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/development/DeveloperBuildingStagesFragment;", "photolist", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/data/realm/DeveloperDayImageList;", "Lkotlin/collections/ArrayList;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.development.DeveloperBuildingStagesFragment$Companion */
    /* compiled from: DeveloperBuildingStagesFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final DeveloperBuildingStagesFragment newInstance(ArrayList<DeveloperDayImageList> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "photolist");
            DeveloperBuildingStagesFragment developerBuildingStagesFragment = new DeveloperBuildingStagesFragment();
            developerBuildingStagesFragment.photolist = arrayList;
            return developerBuildingStagesFragment;
        }
    }
}
