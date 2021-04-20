package p035ru.unicorn.ujin.view.fragments.development;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.fragments.development.DeveloperViewModel;
import p035ru.unicorn.ujin.data.realm.Complex;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0014J,\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00142\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u001dH\u0016J\u001a\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\b\u0010%\u001a\u00020\u001dH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006'"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/development/DeveloperFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "cityId", "", "getCityId", "()Ljava/lang/String;", "setCityId", "(Ljava/lang/String;)V", "developmentViewModel", "Lru/unicorn/fragments/development/DeveloperViewModel;", "getDevelopmentViewModel", "()Lru/unicorn/fragments/development/DeveloperViewModel;", "developmentViewModel$delegate", "Lkotlin/Lazy;", "initialComplexId", "getInitialComplexId", "setInitialComplexId", "metricsScreenName", "onCreateView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "", "onPause", "onResume", "onViewCreated", "view", "showData", "data", "Lru/unicorn/ujin/data/developerPage/DeveloperPageData;", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.development.DeveloperFragment */
/* compiled from: DeveloperFragment.kt */
public final class DeveloperFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    public String cityId;
    private final Lazy developmentViewModel$delegate = LazyKt.lazy(new DeveloperFragment$developmentViewModel$2(this));
    public String initialComplexId;

    /* access modifiers changed from: private */
    public final DeveloperViewModel getDevelopmentViewModel() {
        return (DeveloperViewModel) this.developmentViewModel$delegate.getValue();
    }

    @JvmStatic
    public static final DeveloperFragment newInstance(String str) {
        return Companion.newInstance(str);
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

    public final String getInitialComplexId() {
        String str = this.initialComplexId;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("initialComplexId");
        }
        return str;
    }

    public final void setInitialComplexId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.initialComplexId = str;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.PROFILE);
        getBaseActivity().showImageLogo();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/development/DeveloperFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/development/DeveloperFragment;", "initialComplexId", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.development.DeveloperFragment$Companion */
    /* compiled from: DeveloperFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final DeveloperFragment newInstance(String str) {
            Intrinsics.checkNotNullParameter(str, "initialComplexId");
            DeveloperFragment developerFragment = new DeveloperFragment();
            developerFragment.setInitialComplexId(str);
            return developerFragment;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_developer, viewGroup, false);
    }

    public void onResume() {
        LifecycleOwner lifecycleOwner = this;
        getDevelopmentViewModel().getDevelopmentLiveData().observe(lifecycleOwner, new DeveloperFragment$onResume$1(this));
        getDevelopmentViewModel().showLoader.observe(lifecycleOwner, new DeveloperFragment$onResume$2(this));
        super.onResume();
    }

    public void onPause() {
        LifecycleOwner lifecycleOwner = this;
        getDevelopmentViewModel().getDevelopmentLiveData().removeObservers(lifecycleOwner);
        getDevelopmentViewModel().showLoader.removeObservers(lifecycleOwner);
        super.onPause();
    }

    public void onDetach() {
        ViewmodelFactorys.getInstance().clear(DeveloperViewModel.class);
        super.onDetach();
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (getDevelopmentViewModel().getComplex() == null) {
            DeveloperViewModel developmentViewModel = getDevelopmentViewModel();
            String str = this.initialComplexId;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("initialComplexId");
            }
            developmentViewModel.setComplex(str);
        }
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvComplex);
        Intrinsics.checkNotNullExpressionValue(textView, "tvComplex");
        textView.setText(getDevelopmentViewModel().getComplexName());
        ((TextView) _$_findCachedViewById(C5619R.C5622id.tvComplex)).setOnClickListener(new DeveloperFragment$onViewCreated$1(this));
        getDevelopmentViewModel().getDevelopmentData(getBaseActivity().demoFlatId);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0255, code lost:
        if (p035ru.unicorn.ujin.util.GlideApp.with((android.view.View) (android.widget.ImageView) r5.findViewById(p035ru.unicorn.C5619R.C5622id.ivPlaceholder)).load(r6).into((android.widget.ImageView) r5.findViewById(p035ru.unicorn.C5619R.C5622id.ivPlaceholder)) != null) goto L_0x02a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void showData(p035ru.unicorn.ujin.data.developerPage.DeveloperPageData r12) {
        /*
            r11 = this;
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r11.getBaseActivity()
            ru.unicorn.ujin.data.profile.ProfileViewModel r0 = r0.profileViewModel
            ru.unicorn.ujin.data.realm.profile.User r0 = r0.getUser()
            boolean r0 = r0.getUserLoggenIn()
            r1 = 2131230839(0x7f080077, float:1.8077742E38)
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0076
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r11.getBaseActivity()
            ru.unicorn.ujin.data.profile.ProfileViewModel r0 = r0.profileViewModel
            ru.unicorn.ujin.data.realm.profile.User r0 = r0.getUser()
            int r0 = r0.getDemo()
            if (r0 == r3) goto L_0x0076
            ru.unicorn.fragments.development.DeveloperViewModel r0 = r11.getDevelopmentViewModel()
            ru.unicorn.ujin.data.realm.Complex r0 = r0.getComplex()
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = r0.getId()
            goto L_0x0036
        L_0x0035:
            r0 = r2
        L_0x0036:
            ru.unicorn.ujin.view.activity.BaseActivity r5 = r11.getBaseActivity()
            java.lang.String r6 = "baseActivity"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            ru.unicorn.ujin.data.realm.profile.Apartment r5 = r5.getCurrentApartment()
            if (r5 == 0) goto L_0x004a
            java.lang.String r5 = r5.getComplexId()
            goto L_0x004b
        L_0x004a:
            r5 = r2
        L_0x004b:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r5)
            if (r0 == 0) goto L_0x0076
            int r0 = p035ru.unicorn.C5619R.C5622id.tvComplex
            android.view.View r0 = r11._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.res.Resources r5 = r11.getResources()
            r6 = 2131099729(0x7f060051, float:1.781182E38)
            int r5 = r5.getColor(r6)
            r0.setTextColor(r5)
            int r0 = p035ru.unicorn.C5619R.C5622id.tvComplex
            android.view.View r0 = r11._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5 = 2131231219(0x7f0801f3, float:1.8078513E38)
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r5, r4, r1, r4)
            goto L_0x0097
        L_0x0076:
            int r0 = p035ru.unicorn.C5619R.C5622id.tvComplex
            android.view.View r0 = r11._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.res.Resources r5 = r11.getResources()
            r6 = 2131099751(0x7f060067, float:1.7811864E38)
            int r5 = r5.getColor(r6)
            r0.setTextColor(r5)
            int r0 = p035ru.unicorn.C5619R.C5622id.tvComplex
            android.view.View r0 = r11._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r4, r4, r1, r4)
        L_0x0097:
            if (r12 == 0) goto L_0x032e
            int r0 = p035ru.unicorn.C5619R.C5622id.llContent
            android.view.View r0 = r11._$_findCachedViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r1 = "llContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0.setVisibility(r4)
            int r0 = p035ru.unicorn.C5619R.C5622id.layoutContent2
            android.view.View r0 = r11._$_findCachedViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r1 = "layoutContent2"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0.setVisibility(r4)
            int r0 = p035ru.unicorn.C5619R.C5622id.layoutContentDivider
            android.view.View r0 = r11._$_findCachedViewById(r0)
            java.lang.String r1 = "layoutContentDivider"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0.setVisibility(r4)
            ru.unicorn.ujin.data.developerPage.DeveloperPageDataPercent r0 = r12.getProgress()
            java.lang.String r1 = "it.progress"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Boolean r0 = r0.getVisible()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r5)
            r0 = r0 ^ r3
            java.lang.String r5 = "textPercentMessage"
            java.lang.String r6 = "textPercent"
            if (r0 == 0) goto L_0x0131
            int r0 = p035ru.unicorn.C5619R.C5622id.textPercent
            android.view.View r0 = r11._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            ru.unicorn.ujin.data.developerPage.DeveloperPageDataPercent r7 = r12.getProgress()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)
            float r7 = r7.getPercent()
            int r7 = (int) r7
            r6.append(r7)
            r7 = 2131887938(0x7f120742, float:1.9410497E38)
            java.lang.String r7 = r11.getString(r7)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r0.setText(r6)
            int r0 = p035ru.unicorn.C5619R.C5622id.textPercentMessage
            android.view.View r0 = r11._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            ru.unicorn.ujin.data.developerPage.DeveloperPageDataPercent r5 = r12.getProgress()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            java.lang.String r1 = r5.getText()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            goto L_0x014e
        L_0x0131:
            int r0 = p035ru.unicorn.C5619R.C5622id.textPercent
            android.view.View r0 = r11._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
            r1 = 4
            r0.setVisibility(r1)
            int r0 = p035ru.unicorn.C5619R.C5622id.textPercentMessage
            android.view.View r0 = r11._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            r0.setVisibility(r1)
        L_0x014e:
            java.util.ArrayList r0 = r12.getDocuments()
            int r0 = r0.size()
            if (r0 != 0) goto L_0x016b
            int r0 = p035ru.unicorn.C5619R.C5622id.tvDocuments
            android.view.View r0 = r11._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "tvDocuments"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x01a1
        L_0x016b:
            int r0 = p035ru.unicorn.C5619R.C5622id.recyclerDocuments
            android.view.View r0 = r11._$_findCachedViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            java.lang.String r1 = "recyclerDocuments"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            androidx.recyclerview.widget.LinearLayoutManager r5 = new androidx.recyclerview.widget.LinearLayoutManager
            androidx.fragment.app.FragmentActivity r6 = r11.getActivity()
            android.content.Context r6 = (android.content.Context) r6
            r5.<init>(r6, r3, r4)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = (androidx.recyclerview.widget.RecyclerView.LayoutManager) r5
            r0.setLayoutManager(r5)
            int r0 = p035ru.unicorn.C5619R.C5622id.recyclerDocuments
            android.view.View r0 = r11._$_findCachedViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            ru.unicorn.ujin.view.adapters.DocumentAdapter r1 = new ru.unicorn.ujin.view.adapters.DocumentAdapter
            java.util.ArrayList r5 = r12.getDocuments()
            r1.<init>(r5)
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = (androidx.recyclerview.widget.RecyclerView.Adapter) r1
            r0.setAdapter(r1)
        L_0x01a1:
            int r0 = p035ru.unicorn.C5619R.C5622id.llContent
            android.view.View r0 = r11._$_findCachedViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.removeAllViews()
            java.lang.String r0 = r12.getText()
            if (r0 == 0) goto L_0x01ee
            int r1 = p035ru.unicorn.C5619R.C5622id.llContent
            android.view.View r1 = r11._$_findCachedViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            android.content.Context r5 = r11.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            r6 = 2131558879(0x7f0d01df, float:1.8743086E38)
            int r7 = p035ru.unicorn.C5619R.C5622id.llContent
            android.view.View r7 = r11._$_findCachedViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            android.view.View r5 = r5.inflate(r6, r7, r4)
            if (r5 == 0) goto L_0x01e6
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r5.setText(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            android.view.View r5 = (android.view.View) r5
            r1.addView(r5)
            goto L_0x01ee
        L_0x01e6:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            r12.<init>(r0)
            throw r12
        L_0x01ee:
            ru.unicorn.ujin.data.developerPage.DeveloperSchema r0 = r12.getSchema()
            if (r0 == 0) goto L_0x032b
            java.util.ArrayList r0 = r0.getButtons()
            java.util.Iterator r0 = r0.iterator()
        L_0x01fc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0329
            java.lang.Object r1 = r0.next()
            ru.unicorn.ujin.data.developerPage.DeveloperSchemaButton r1 = (p035ru.unicorn.ujin.data.developerPage.DeveloperSchemaButton) r1
            int r2 = p035ru.unicorn.C5619R.C5622id.llContent
            android.view.View r2 = r11._$_findCachedViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            android.content.Context r5 = r11.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            r6 = 2131558878(0x7f0d01de, float:1.8743084E38)
            int r7 = p035ru.unicorn.C5619R.C5622id.llContent
            android.view.View r7 = r11._$_findCachedViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            android.view.View r5 = r5.inflate(r6, r7, r4)
            java.lang.String r6 = "developerButton"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            java.lang.String r6 = r1.getImage()
            java.lang.String r7 = "developerButton.action"
            java.lang.String r8 = "this"
            if (r6 == 0) goto L_0x0258
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r8)
            int r9 = p035ru.unicorn.C5619R.C5622id.ivPlaceholder
            android.view.View r9 = r5.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            ru.unicorn.ujin.util.GlideRequests r9 = p035ru.unicorn.ujin.util.GlideApp.with((android.view.View) r9)
            ru.unicorn.ujin.util.GlideRequest r6 = r9.load((java.lang.String) r6)
            int r9 = p035ru.unicorn.C5619R.C5622id.ivPlaceholder
            android.view.View r9 = r5.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            com.bumptech.glide.request.target.ViewTarget r6 = r6.into((android.widget.ImageView) r9)
            if (r6 == 0) goto L_0x0258
            goto L_0x02a9
        L_0x0258:
            ru.unicorn.ujin.data.developerPage.DeveloperButtonAction r6 = r1.getAction()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            java.lang.String r6 = r6.getType()
            java.lang.String r9 = p035ru.unicorn.ujin.data.developerPage.DeveloperSchemaButton.STEPS
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x027a
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r8)
            int r6 = p035ru.unicorn.C5619R.C5622id.ivPlaceholder
            android.view.View r6 = r5.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r6.setImageResource(r4)
            goto L_0x02a7
        L_0x027a:
            java.lang.String r9 = p035ru.unicorn.ujin.data.developerPage.DeveloperSchemaButton.VIDEO
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x0291
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r8)
            int r6 = p035ru.unicorn.C5619R.C5622id.ivPlaceholder
            android.view.View r6 = r5.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r6.setImageResource(r4)
            goto L_0x02a7
        L_0x0291:
            java.lang.String r9 = p035ru.unicorn.ujin.data.developerPage.DeveloperSchemaButton.OPEN_URL
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r9)
            if (r6 == 0) goto L_0x02a7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r8)
            int r6 = p035ru.unicorn.C5619R.C5622id.ivPlaceholder
            android.view.View r6 = r5.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r6.setImageResource(r4)
        L_0x02a7:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
        L_0x02a9:
            java.lang.String r6 = r1.getTitle()
            if (r6 == 0) goto L_0x02c4
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r8)
            int r9 = p035ru.unicorn.C5619R.C5622id.tvTitle
            android.view.View r9 = r5.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.String r10 = "this.tvTitle"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r9.setText(r6)
        L_0x02c4:
            java.lang.String r6 = r1.getDescription()
            if (r6 == 0) goto L_0x02df
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r8)
            int r8 = p035ru.unicorn.C5619R.C5622id.tvDescription
            android.view.View r8 = r5.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.String r9 = "this.tvDescription"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r8.setText(r6)
        L_0x02df:
            ru.unicorn.ujin.data.developerPage.DeveloperButtonAction r6 = r1.getAction()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            java.lang.String r6 = r6.getType()
            java.lang.String r7 = p035ru.unicorn.ujin.data.developerPage.DeveloperSchemaButton.STEPS
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x02fd
            ru.unicorn.ujin.view.fragments.development.DeveloperFragment$showData$$inlined$let$lambda$1 r6 = new ru.unicorn.ujin.view.fragments.development.DeveloperFragment$showData$$inlined$let$lambda$1
            r6.<init>(r1, r11, r12)
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            r5.setOnClickListener(r6)
            goto L_0x0322
        L_0x02fd:
            java.lang.String r7 = p035ru.unicorn.ujin.data.developerPage.DeveloperSchemaButton.VIDEO
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x0310
            ru.unicorn.ujin.view.fragments.development.DeveloperFragment$showData$$inlined$let$lambda$2 r6 = new ru.unicorn.ujin.view.fragments.development.DeveloperFragment$showData$$inlined$let$lambda$2
            r6.<init>(r5, r1, r11, r12)
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            r5.setOnClickListener(r6)
            goto L_0x0322
        L_0x0310:
            java.lang.String r7 = p035ru.unicorn.ujin.data.developerPage.DeveloperSchemaButton.OPEN_URL
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x0322
            ru.unicorn.ujin.view.fragments.development.DeveloperFragment$showData$$inlined$let$lambda$3 r6 = new ru.unicorn.ujin.view.fragments.development.DeveloperFragment$showData$$inlined$let$lambda$3
            r6.<init>(r1, r11, r12)
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            r5.setOnClickListener(r6)
        L_0x0322:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            r2.addView(r5)
            goto L_0x01fc
        L_0x0329:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L_0x032b:
            if (r2 == 0) goto L_0x032e
            goto L_0x0342
        L_0x032e:
            r12 = r11
            ru.unicorn.ujin.view.fragments.development.DeveloperFragment r12 = (p035ru.unicorn.ujin.view.fragments.development.DeveloperFragment) r12
            android.content.Context r12 = r12.getContext()
            java.lang.String r0 = "Ошибка загрузки"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            android.widget.Toast r12 = android.widget.Toast.makeText(r12, r0, r3)
            r12.show()
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
        L_0x0342:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.development.DeveloperFragment.showData(ru.unicorn.ujin.data.developerPage.DeveloperPageData):void");
    }
}
