package p035ru.unicorn.ujin.market.company;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.Company;
import p035ru.unicorn.ujin.market.MarketBaseFragment;
import p035ru.unicorn.ujin.metrics.MetricsFacade;
import p035ru.unicorn.ujin.metrics.MetricsKeys;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u0006H\u0014J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\nH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo51343d2 = {"Lru/unicorn/ujin/market/company/CompanyFragment;", "Lru/unicorn/ujin/market/MarketBaseFragment;", "()V", "company", "Lru/unicorn/ujin/data/realm/marketplace/Company;", "companyId", "", "companyTitle", "metricsEvent", "handleEvent", "", "event", "Lru/unicorn/ujin/viewModel/events/market/CompanyEvent;", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setVisibilityCompanyLayout", "isVisible", "", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.company.CompanyFragment */
/* compiled from: CompanyFragment.kt */
public final class CompanyFragment extends MarketBaseFragment {
    public static final String COMPANY_ID = "companyId";
    public static final String COMPANY_TITLE = "companyTitle";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String EVENT = "event";
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public Company company;
    private String companyId;
    private String companyTitle;
    private String metricsEvent = "";

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
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setToolbarRight(initRightButtonList(false));
        getBaseActivity().setTextTitle(this.companyTitle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Bundle arguments = getArguments();
        this.companyId = arguments != null ? arguments.getString("companyId") : null;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString(COMPANY_TITLE)) == null) {
            str = "";
        }
        this.companyTitle = str;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str2 = arguments3.getString("event")) == null) {
            str2 = "";
        }
        this.metricsEvent = str2;
        if (!StringsKt.isBlank(this.metricsEvent)) {
            MetricsFacade.Companion companion = MetricsFacade.Companion;
            String value = MetricsKeys.market.getValue();
            HashMap hashMap = new HashMap();
            String str3 = this.metricsEvent;
            String str4 = this.companyTitle;
            if (str4 == null) {
                str4 = MetricsKeys.error.getValue();
            }
            hashMap.put(str3, str4);
            Unit unit = Unit.INSTANCE;
            companion.reportEvent(value, (HashMap<String, ? extends Object>) hashMap);
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_market_company, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…ompany, container, false)");
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setVisibilityCompanyLayout(false);
        String str = this.companyId;
        if (str != null) {
            getMarketViewModel().loadCompanyDetails(CollectionsKt.listOf(str));
            getMarketViewModel().getCompanyLiveData().observe(getViewLifecycleOwner(), new CompanyFragment$onViewCreated$$inlined$let$lambda$1(this));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002d, code lost:
        r0 = r0.getLogo();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleEvent(p035ru.unicorn.ujin.viewModel.events.market.CompanyEvent r10) {
        /*
            r9 = this;
            int r0 = p035ru.unicorn.C5619R.C5622id.progressBar
            android.view.View r0 = r9._$_findCachedViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            java.lang.String r1 = "progressBar"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
            boolean r10 = r10.getSuccess()
            if (r10 == 0) goto L_0x02a3
            r10 = 1
            r9.setVisibilityCompanyLayout(r10)
            ru.unicorn.ujin.market.model.MarketViewModel r0 = r9.getMarketViewModel()
            java.lang.String r2 = r9.companyId
            ru.unicorn.ujin.data.realm.marketplace.Company r0 = r0.getCompany(r2)
            r9.company = r0
            ru.unicorn.ujin.data.realm.marketplace.Company r0 = r9.company
            r2 = 0
            if (r0 == 0) goto L_0x0038
            ru.unicorn.ujin.data.realm.FileData r0 = r0.getLogo()
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = r0.getUrl()
            goto L_0x0039
        L_0x0038:
            r0 = r2
        L_0x0039:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3 = 0
            if (r0 == 0) goto L_0x0047
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r0 = 0
            goto L_0x0048
        L_0x0047:
            r0 = 1
        L_0x0048:
            if (r0 != 0) goto L_0x0073
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r9.getBaseActivity()
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            ru.unicorn.ujin.util.GlideRequests r0 = p035ru.unicorn.ujin.util.GlideApp.with((androidx.fragment.app.FragmentActivity) r0)
            ru.unicorn.ujin.data.realm.marketplace.Company r4 = r9.company
            if (r4 == 0) goto L_0x0063
            ru.unicorn.ujin.data.realm.FileData r4 = r4.getLogo()
            if (r4 == 0) goto L_0x0063
            java.lang.String r4 = r4.getUrl()
            goto L_0x0064
        L_0x0063:
            r4 = r2
        L_0x0064:
            ru.unicorn.ujin.util.GlideRequest r0 = r0.load((java.lang.String) r4)
            int r4 = p035ru.unicorn.C5619R.C5622id.ivCompanyLogo
            android.view.View r4 = r9._$_findCachedViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0.into((android.widget.ImageView) r4)
        L_0x0073:
            ru.unicorn.ujin.data.realm.marketplace.Company r0 = r9.company
            if (r0 == 0) goto L_0x007c
            java.lang.String r0 = r0.getTagline()
            goto L_0x007d
        L_0x007c:
            r0 = r2
        L_0x007d:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x008a
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r0 = 0
            goto L_0x008b
        L_0x008a:
            r0 = 1
        L_0x008b:
            if (r0 != 0) goto L_0x00a9
            int r0 = p035ru.unicorn.C5619R.C5622id.tvCompanyTagLine
            android.view.View r0 = r9._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r4 = "tvCompanyTagLine"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            ru.unicorn.ujin.data.realm.marketplace.Company r4 = r9.company
            if (r4 == 0) goto L_0x00a3
            java.lang.String r4 = r4.getTagline()
            goto L_0x00a4
        L_0x00a3:
            r4 = r2
        L_0x00a4:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r0.setText(r4)
        L_0x00a9:
            ru.unicorn.ujin.data.realm.marketplace.Company r0 = r9.company
            if (r0 == 0) goto L_0x00b2
            io.realm.RealmList r0 = r0.getImages()
            goto L_0x00b3
        L_0x00b2:
            r0 = r2
        L_0x00b3:
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x00c0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00be
            goto L_0x00c0
        L_0x00be:
            r0 = 0
            goto L_0x00c1
        L_0x00c0:
            r0 = 1
        L_0x00c1:
            java.lang.String r4 = "circleIndicator"
            java.lang.String r5 = "imagesViewPager"
            if (r0 == 0) goto L_0x00e4
            int r0 = p035ru.unicorn.C5619R.C5622id.imagesViewPager
            android.view.View r0 = r9._$_findCachedViewById(r0)
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            r0.setVisibility(r1)
            int r0 = p035ru.unicorn.C5619R.C5622id.circleIndicator
            android.view.View r0 = r9._$_findCachedViewById(r0)
            me.relex.circleindicator.CircleIndicator r0 = (p051me.relex.circleindicator.CircleIndicator) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r0.setVisibility(r1)
            goto L_0x0150
        L_0x00e4:
            int r0 = p035ru.unicorn.C5619R.C5622id.imagesViewPager
            android.view.View r0 = r9._$_findCachedViewById(r0)
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            ru.unicorn.ujin.view.adapters.marketplace.ImagesPagerAdapter r6 = new ru.unicorn.ujin.view.adapters.marketplace.ImagesPagerAdapter
            ru.unicorn.ujin.data.realm.marketplace.Company r7 = r9.company
            if (r7 == 0) goto L_0x00fa
            io.realm.RealmList r7 = r7.getImages()
            goto L_0x00fb
        L_0x00fa:
            r7 = r2
        L_0x00fb:
            if (r7 == 0) goto L_0x029b
            java.util.List r7 = (java.util.List) r7
            android.content.Context r8 = r9.getContext()
            r6.<init>(r7, r8)
            androidx.viewpager.widget.PagerAdapter r6 = (androidx.viewpager.widget.PagerAdapter) r6
            r0.setAdapter(r6)
            int r0 = p035ru.unicorn.C5619R.C5622id.circleIndicator
            android.view.View r0 = r9._$_findCachedViewById(r0)
            me.relex.circleindicator.CircleIndicator r0 = (p051me.relex.circleindicator.CircleIndicator) r0
            int r6 = p035ru.unicorn.C5619R.C5622id.imagesViewPager
            android.view.View r6 = r9._$_findCachedViewById(r6)
            androidx.viewpager.widget.ViewPager r6 = (androidx.viewpager.widget.ViewPager) r6
            r0.setViewPager(r6)
            int r0 = p035ru.unicorn.C5619R.C5622id.imagesViewPager
            android.view.View r0 = r9._$_findCachedViewById(r0)
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            r0.setVisibility(r3)
            int r0 = p035ru.unicorn.C5619R.C5622id.circleIndicator
            android.view.View r0 = r9._$_findCachedViewById(r0)
            me.relex.circleindicator.CircleIndicator r0 = (p051me.relex.circleindicator.CircleIndicator) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            ru.unicorn.ujin.data.realm.marketplace.Company r4 = r9.company
            if (r4 == 0) goto L_0x014c
            io.realm.RealmList r4 = r4.getImages()
            if (r4 == 0) goto L_0x014c
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            if (r4 != r10) goto L_0x014c
            r4 = 8
            goto L_0x014d
        L_0x014c:
            r4 = 0
        L_0x014d:
            r0.setVisibility(r4)
        L_0x0150:
            ru.unicorn.ujin.data.realm.marketplace.Company r0 = r9.company
            if (r0 == 0) goto L_0x0159
            java.lang.String r0 = r0.getDescription()
            goto L_0x015a
        L_0x0159:
            r0 = r2
        L_0x015a:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0167
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x0165
            goto L_0x0167
        L_0x0165:
            r0 = 0
            goto L_0x0168
        L_0x0167:
            r0 = 1
        L_0x0168:
            java.lang.String r4 = "tvDescription"
            if (r0 == 0) goto L_0x019b
            int r0 = p035ru.unicorn.C5619R.C5622id.tvExpand
            android.view.View r0 = r9._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r5 = "tvExpand"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            r0.setVisibility(r1)
            int r0 = p035ru.unicorn.C5619R.C5622id.tvDescriptionTitle
            android.view.View r0 = r9._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r5 = "tvDescriptionTitle"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            r0.setVisibility(r1)
            int r0 = p035ru.unicorn.C5619R.C5622id.tvDescription
            android.view.View r0 = r9._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r0.setVisibility(r1)
            goto L_0x01c8
        L_0x019b:
            int r0 = p035ru.unicorn.C5619R.C5622id.tvDescription
            android.view.View r0 = r9._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            ru.unicorn.ujin.data.realm.marketplace.Company r4 = r9.company
            if (r4 == 0) goto L_0x01af
            java.lang.String r4 = r4.getDescription()
            goto L_0x01b0
        L_0x01af:
            r4 = r2
        L_0x01b0:
            android.text.Spanned r4 = android.text.Html.fromHtml(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r0.setText(r4)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            ru.unicorn.ujin.market.company.CompanyFragment$handleEvent$1 r4 = new ru.unicorn.ujin.market.company.CompanyFragment$handleEvent$1
            r4.<init>(r9)
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r0.post(r4)
        L_0x01c8:
            ru.unicorn.ujin.data.realm.marketplace.Company r0 = r9.company
            if (r0 == 0) goto L_0x01d1
            java.lang.String r0 = r0.getDelivery()
            goto L_0x01d2
        L_0x01d1:
            r0 = r2
        L_0x01d2:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x01df
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x01dd
            goto L_0x01df
        L_0x01dd:
            r0 = 0
            goto L_0x01e0
        L_0x01df:
            r0 = 1
        L_0x01e0:
            java.lang.String r4 = "tvDeliveryTitle"
            if (r0 == 0) goto L_0x0203
            int r0 = p035ru.unicorn.C5619R.C5622id.tvDeliveryTitle
            android.view.View r0 = r9._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r0.setVisibility(r1)
            int r0 = p035ru.unicorn.C5619R.C5622id.tvDelivery
            android.view.View r0 = r9._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r4 = "tvDelivery"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r0.setVisibility(r1)
            goto L_0x022f
        L_0x0203:
            int r0 = p035ru.unicorn.C5619R.C5622id.tvDeliveryTitle
            android.view.View r0 = r9._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r0.setVisibility(r3)
            int r0 = p035ru.unicorn.C5619R.C5622id.tvDelivery
            android.view.View r0 = r9._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setVisibility(r3)
            ru.unicorn.ujin.data.realm.marketplace.Company r4 = r9.company
            if (r4 == 0) goto L_0x0225
            java.lang.String r4 = r4.getDelivery()
            goto L_0x0226
        L_0x0225:
            r4 = r2
        L_0x0226:
            android.text.Spanned r4 = android.text.Html.fromHtml(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r0.setText(r4)
        L_0x022f:
            ru.unicorn.ujin.data.realm.marketplace.Company r0 = r9.company
            if (r0 == 0) goto L_0x0237
            io.realm.RealmList r2 = r0.getContacts()
        L_0x0237:
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L_0x0243
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0242
            goto L_0x0243
        L_0x0242:
            r10 = 0
        L_0x0243:
            if (r10 == 0) goto L_0x0266
            int r10 = p035ru.unicorn.C5619R.C5622id.tvContactsTitle
            android.view.View r10 = r9._$_findCachedViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            java.lang.String r0 = "tvContactsTitle"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r10.setVisibility(r1)
            int r10 = p035ru.unicorn.C5619R.C5622id.rvContactInfo
            android.view.View r10 = r9._$_findCachedViewById(r10)
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            java.lang.String r0 = "rvContactInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r10.setVisibility(r1)
            goto L_0x02a3
        L_0x0266:
            ru.unicorn.ujin.data.realm.marketplace.Company r10 = r9.company
            if (r10 == 0) goto L_0x02a3
            io.realm.RealmList r10 = r10.getContacts()
            if (r10 == 0) goto L_0x02a3
            int r0 = p035ru.unicorn.C5619R.C5622id.rvContactInfo
            android.view.View r0 = r9._$_findCachedViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            ru.unicorn.ujin.market.company.ContactListAdapter r1 = new ru.unicorn.ujin.market.company.ContactListAdapter
            r2 = r10
            java.util.List r2 = (java.util.List) r2
            ru.unicorn.ujin.market.company.CompanyFragment$handleEvent$$inlined$let$lambda$1 r3 = new ru.unicorn.ujin.market.company.CompanyFragment$handleEvent$$inlined$let$lambda$1
            r3.<init>(r10, r9)
            ru.unicorn.ujin.market.company.ContactListAdapter$OnContactClickedListener r3 = (p035ru.unicorn.ujin.market.company.ContactListAdapter.OnContactClickedListener) r3
            r1.<init>(r2, r3)
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = (androidx.recyclerview.widget.RecyclerView.Adapter) r1
            r0.setAdapter(r1)
            androidx.recyclerview.widget.LinearLayoutManager r10 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r1 = r0.getContext()
            r10.<init>(r1)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r10 = (androidx.recyclerview.widget.RecyclerView.LayoutManager) r10
            r0.setLayoutManager(r10)
            goto L_0x02a3
        L_0x029b:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<ru.unicorn.ujin.data.realm.FileData>"
            r10.<init>(r0)
            throw r10
        L_0x02a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.market.company.CompanyFragment.handleEvent(ru.unicorn.ujin.viewModel.events.market.CompanyEvent):void");
    }

    private final void setVisibilityCompanyLayout(boolean z) {
        NestedScrollView nestedScrollView = (NestedScrollView) _$_findCachedViewById(C5619R.C5622id.companyScrollView);
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "companyScrollView");
        nestedScrollView.setVisibility(z ? 0 : 8);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/market/company/CompanyFragment$Companion;", "", "()V", "COMPANY_ID", "", "COMPANY_TITLE", "EVENT", "newInstance", "Lru/unicorn/ujin/market/company/CompanyFragment;", "id", "title", "event", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.company.CompanyFragment$Companion */
    /* compiled from: CompanyFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CompanyFragment newInstance(String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(str3, "event");
            CompanyFragment companyFragment = new CompanyFragment();
            Bundle bundle = new Bundle();
            bundle.putString("companyId", str);
            bundle.putString(CompanyFragment.COMPANY_TITLE, str2);
            bundle.putString("event", str3);
            Unit unit = Unit.INSTANCE;
            companyFragment.setArguments(bundle);
            return companyFragment;
        }
    }
}
