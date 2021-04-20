package p035ru.unicorn.ujin.market.offer;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.snackbar.Snackbar;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.api.response.marketplace.CartResponse;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.marketplace.Company;
import p035ru.unicorn.ujin.data.realm.marketplace.Offer;
import p035ru.unicorn.ujin.data.realm.marketplace.Tag;
import p035ru.unicorn.ujin.market.MarketBaseFragment;
import p035ru.unicorn.ujin.market.enums.OfferType;
import p035ru.unicorn.ujin.market.model.MarketViewModel;
import p035ru.unicorn.ujin.metrics.MetricsFacade;
import p035ru.unicorn.ujin.metrics.MetricsKeys;
import p035ru.unicorn.ujin.util.TextUtils;
import p035ru.unicorn.ujin.view.adapters.marketplace.ImagesPagerAdapter;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.viewModel.events.market.CompanyEvent;
import p035ru.unicorn.ujin.viewModel.events.market.OfferEvent;
import p046io.realm.RealmList;
import p051me.relex.circleindicator.CircleIndicator;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u00020\u000f2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\b\u0010\u001b\u001a\u00020\nH\u0014J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u000fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, mo51343d2 = {"Lru/unicorn/ujin/market/offer/OfferFragment;", "Lru/unicorn/ujin/market/MarketBaseFragment;", "()V", "clickCount", "", "company", "Lru/unicorn/ujin/data/realm/marketplace/Company;", "lastClickTime", "", "metricsEvent", "", "offer", "Lru/unicorn/ujin/data/realm/marketplace/Offer;", "offerId", "addToCart", "", "handleEvent", "event", "Lru/unicorn/ujin/viewModel/events/market/CompanyEvent;", "Lru/unicorn/ujin/viewModel/events/market/OfferEvent;", "handleSetCartEvent", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/marketplace/CartResponse;", "initCompanyData", "initProductPrice", "initServicePrice", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setVisibilityOfferLayout", "isVisible", "", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.offer.OfferFragment */
/* compiled from: OfferFragment.kt */
public final class OfferFragment extends MarketBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String EVENT = "event";
    public static final long MIN_DELAY_MS = 500;
    public static final String OFFER_ID = "offerId";
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public int clickCount;
    /* access modifiers changed from: private */
    public Company company;
    /* access modifiers changed from: private */
    public long lastClickTime;
    private String metricsEvent = "";
    /* access modifiers changed from: private */
    public Offer offer;
    /* access modifiers changed from: private */
    public String offerId;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.offer.OfferFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[OfferType.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[OfferType.PRODUCT.ordinal()] = 1;
            $EnumSwitchMapping$0[OfferType.SERVICE.ordinal()] = 2;
            $EnumSwitchMapping$1[Resource.Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$1[Resource.Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$1[Resource.Status.LOADING.ordinal()] = 3;
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
    public String metricsScreenName() {
        String string = getString(R.string.metricsOfferFragment);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.metricsOfferFragment)");
        return string;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        String str;
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        boolean z = true;
        getBaseActivity().setToolbarRight(initRightButtonList(true));
        Offer offer2 = this.offer;
        String str2 = null;
        CharSequence title = offer2 != null ? offer2.getTitle() : null;
        if (title != null && !StringsKt.isBlank(title)) {
            z = false;
        }
        if (!z) {
            Offer offer3 = this.offer;
            if (offer3 != null) {
                str2 = offer3.getTitle();
            }
            str = Html.fromHtml(str2).toString();
        } else {
            str = "";
        }
        getBaseActivity().setTextTitle(str);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Bundle arguments = getArguments();
        this.offerId = arguments != null ? arguments.getString("offerId") : null;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("event")) == null) {
            str = "";
        }
        this.metricsEvent = str;
        this.offer = getMarketViewModel().getOffer(this.offerId);
        return layoutInflater.inflate(R.layout.fragment_offer, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setVisibilityOfferLayout(false);
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility(0);
        Bundle arguments = getArguments();
        this.offerId = arguments != null ? arguments.getString("offerId") : null;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("event")) == null) {
            str = "";
        }
        this.metricsEvent = str;
        String str2 = this.offerId;
        if (str2 != null) {
            getMarketViewModel().loadOffer(CollectionsKt.listOf(str2));
            getMarketViewModel().getOfferLiveData().observe(getViewLifecycleOwner(), new OfferFragment$onViewCreated$$inlined$let$lambda$1(this));
            return;
        }
        showMessage("Не удалось загрузить информацию о товаре");
    }

    private final void setVisibilityOfferLayout(boolean z) {
        NestedScrollView nestedScrollView = (NestedScrollView) _$_findCachedViewById(C5619R.C5622id.offerScrollView);
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "offerScrollView");
        nestedScrollView.setVisibility(z ? 0 : 8);
    }

    public final void handleEvent(OfferEvent offerEvent) {
        RealmList<FileData> images;
        RealmList<Integer> tags;
        Object obj;
        String companyId;
        String str;
        Intrinsics.checkNotNullParameter(offerEvent, "event");
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility(8);
        boolean z = true;
        setVisibilityOfferLayout(true);
        this.offer = getMarketViewModel().getOffer(this.offerId);
        if (!offerEvent.getSuccess()) {
            Toast.makeText(getContext(), offerEvent.getMessage(), 1).show();
            return;
        }
        if (!StringsKt.isBlank(this.metricsEvent)) {
            MetricsFacade.Companion companion = MetricsFacade.Companion;
            String value = MetricsKeys.market.getValue();
            HashMap hashMap = new HashMap();
            String str2 = this.metricsEvent;
            Offer offer2 = this.offer;
            if (offer2 == null || (str = offer2.getTitle()) == null) {
                str = MetricsKeys.error.getValue();
            }
            hashMap.put(str2, str);
            Unit unit = Unit.INSTANCE;
            companion.reportEvent(value, (HashMap<String, ? extends Object>) hashMap);
        }
        OfferType.Companion companion2 = OfferType.Companion;
        Offer offer3 = this.offer;
        String str3 = null;
        int i = WhenMappings.$EnumSwitchMapping$0[companion2.getType(offer3 != null ? offer3.getType() : null).ordinal()];
        if (i == 1) {
            initProductPrice();
        } else if (i == 2) {
            initServicePrice();
        }
        Offer offer4 = this.offer;
        CharSequence importOfferLink = offer4 != null ? offer4.getImportOfferLink() : null;
        if (!(importOfferLink == null || importOfferLink.length() == 0)) {
            DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnOrder);
            dynamicBackgroundButton.setText(dynamicBackgroundButton.getResources().getString(R.string.to_shop));
            dynamicBackgroundButton.setOnClickListener(new OfferFragment$handleEvent$$inlined$apply$lambda$1(dynamicBackgroundButton, this));
        } else {
            OfferType.Companion companion3 = OfferType.Companion;
            Offer offer5 = this.offer;
            if (companion3.getType(offer5 != null ? offer5.getType() : null) != OfferType.SERVICE) {
                Offer offer6 = this.offer;
                if (!Intrinsics.areEqual((Object) offer6 != null ? offer6.isPaymentEnabled() : null, (Object) false)) {
                    DynamicBackgroundButton dynamicBackgroundButton2 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnOrder);
                    dynamicBackgroundButton2.setText(dynamicBackgroundButton2.getResources().getString(R.string.to_cart));
                    dynamicBackgroundButton2.setOnClickListener(new OfferFragment$handleEvent$$inlined$apply$lambda$3(this));
                }
            }
            DynamicBackgroundButton dynamicBackgroundButton3 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnOrder);
            dynamicBackgroundButton3.setText(dynamicBackgroundButton3.getResources().getString(R.string.order));
            dynamicBackgroundButton3.setOnClickListener(new OfferFragment$handleEvent$$inlined$apply$lambda$2(this));
        }
        Offer offer7 = this.offer;
        if (!(offer7 == null || (companyId = offer7.getCompanyId()) == null)) {
            this.company = getMarketViewModel().getCompany(companyId);
            if (this.company == null) {
                getMarketViewModel().loadCompanyDetails(CollectionsKt.listOf(companyId));
                getMarketViewModel().getCompanyLiveData().observe(getViewLifecycleOwner(), new OfferFragment$handleEvent$$inlined$let$lambda$1(this));
            } else {
                initCompanyData();
            }
        }
        Offer offer8 = this.offer;
        CharSequence title = offer8 != null ? offer8.getTitle() : null;
        if (!(title == null || StringsKt.isBlank(title))) {
            TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "tvTitle");
            Offer offer9 = this.offer;
            textView.setText(Html.fromHtml(offer9 != null ? offer9.getTitle() : null));
        }
        Offer offer10 = this.offer;
        if (!(offer10 == null || (tags = offer10.getTags()) == null)) {
            TagListLayout tagListLayout = (TagListLayout) _$_findCachedViewById(C5619R.C5622id.tagListLayout);
            Intrinsics.checkNotNullExpressionValue(tagListLayout, "tagListLayout");
            tagListLayout.setVisibility(0);
            if (!tags.isEmpty()) {
                List<Tag> tagList = getMarketViewModel().getTagList();
                Iterator<Integer> it = tags.iterator();
                while (it.hasNext()) {
                    Integer next = it.next();
                    Iterator it2 = tagList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (Intrinsics.areEqual((Object) ((Tag) obj).getId(), (Object) next)) {
                            break;
                        }
                    }
                    Tag tag = (Tag) obj;
                    if (tag != null) {
                        View inflate = getLayoutInflater().inflate(R.layout.offer_tag_layout, (ViewGroup) null, false);
                        Intrinsics.checkNotNullExpressionValue(inflate, "layoutInflater.inflate(R…_tag_layout, null, false)");
                        TextView textView2 = (TextView) inflate.findViewById(C5619R.C5622id.tvTagValue);
                        Intrinsics.checkNotNullExpressionValue(textView2, "tagView.tvTagValue");
                        textView2.setText(tag.getTitle());
                        ((CardView) inflate.findViewById(C5619R.C5622id.cvTagLayout)).setCardBackgroundColor(Color.parseColor(tag.getColor()));
                        ((TagListLayout) _$_findCachedViewById(C5619R.C5622id.tagListLayout)).addView(inflate);
                    }
                }
            }
        }
        Offer offer11 = this.offer;
        CharSequence units = offer11 != null ? offer11.getUnits() : null;
        if (!(units == null || StringsKt.isBlank(units))) {
            TextView textView3 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvUnits);
            Offer offer12 = this.offer;
            textView3.setText(offer12 != null ? offer12.getUnits() : null);
            textView3.setVisibility(0);
        } else {
            TextView textView4 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvUnits);
            Intrinsics.checkNotNullExpressionValue(textView4, "tvUnits");
            textView4.setVisibility(4);
        }
        TextView textView5 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvOldPrice);
        Intrinsics.checkNotNullExpressionValue(textView5, "tvOldPrice");
        if (textView5.getVisibility() == 4) {
            TextView textView6 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvUnits);
            Intrinsics.checkNotNullExpressionValue(textView6, "tvUnits");
            if (textView6.getVisibility() == 4) {
                TextView textView7 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvOldPrice);
                Intrinsics.checkNotNullExpressionValue(textView7, "tvOldPrice");
                textView7.setVisibility(8);
                TextView textView8 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvUnits);
                Intrinsics.checkNotNullExpressionValue(textView8, "tvUnits");
                textView8.setVisibility(8);
            }
        }
        Offer offer13 = this.offer;
        Collection images2 = offer13 != null ? offer13.getImages() : null;
        if (images2 == null || images2.isEmpty()) {
            ViewPager viewPager = (ViewPager) _$_findCachedViewById(C5619R.C5622id.imagesViewPager);
            Intrinsics.checkNotNullExpressionValue(viewPager, "imagesViewPager");
            viewPager.setVisibility(8);
            CircleIndicator circleIndicator = (CircleIndicator) _$_findCachedViewById(C5619R.C5622id.circleIndicator);
            Intrinsics.checkNotNullExpressionValue(circleIndicator, "circleIndicator");
            circleIndicator.setVisibility(8);
        } else {
            ViewPager viewPager2 = (ViewPager) _$_findCachedViewById(C5619R.C5622id.imagesViewPager);
            Intrinsics.checkNotNullExpressionValue(viewPager2, "imagesViewPager");
            Offer offer14 = this.offer;
            RealmList<FileData> images3 = offer14 != null ? offer14.getImages() : null;
            if (images3 != null) {
                viewPager2.setAdapter(new ImagesPagerAdapter(images3, getContext()));
                ((CircleIndicator) _$_findCachedViewById(C5619R.C5622id.circleIndicator)).setViewPager((ViewPager) _$_findCachedViewById(C5619R.C5622id.imagesViewPager));
                ViewPager viewPager3 = (ViewPager) _$_findCachedViewById(C5619R.C5622id.imagesViewPager);
                Intrinsics.checkNotNullExpressionValue(viewPager3, "imagesViewPager");
                viewPager3.setVisibility(0);
                CircleIndicator circleIndicator2 = (CircleIndicator) _$_findCachedViewById(C5619R.C5622id.circleIndicator);
                Intrinsics.checkNotNullExpressionValue(circleIndicator2, "circleIndicator");
                Offer offer15 = this.offer;
                circleIndicator2.setVisibility((offer15 == null || (images = offer15.getImages()) == null || images.size() != 1) ? 0 : 8);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<ru.unicorn.ujin.data.realm.FileData>");
            }
        }
        Offer offer16 = this.offer;
        CharSequence description = offer16 != null ? offer16.getDescription() : null;
        if (description != null && !StringsKt.isBlank(description)) {
            z = false;
        }
        if (z) {
            TextView textView9 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvExpand);
            Intrinsics.checkNotNullExpressionValue(textView9, "tvExpand");
            textView9.setVisibility(8);
            TextView textView10 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvDescriptionTitle);
            Intrinsics.checkNotNullExpressionValue(textView10, "tvDescriptionTitle");
            textView10.setVisibility(8);
            TextView textView11 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvDescription);
            Intrinsics.checkNotNullExpressionValue(textView11, "tvDescription");
            textView11.setVisibility(8);
            return;
        }
        TextView textView12 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvDescription);
        Intrinsics.checkNotNullExpressionValue(textView12, "tvDescription");
        Offer offer17 = this.offer;
        if (offer17 != null) {
            str3 = offer17.getDescription();
        }
        textView12.setText(Html.fromHtml(str3));
        ((TextView) _$_findCachedViewById(C5619R.C5622id.tvDescription)).post(new OfferFragment$handleEvent$8(this));
    }

    /* access modifiers changed from: private */
    public final void handleEvent(CompanyEvent companyEvent) {
        MarketViewModel marketViewModel = getMarketViewModel();
        Offer offer2 = this.offer;
        this.company = marketViewModel.getCompany(offer2 != null ? offer2.getCompanyId() : null);
        initCompanyData();
    }

    private final void initProductPrice() {
        String oldPrice;
        String price;
        CharSequence charSequence;
        Offer offer2 = this.offer;
        if (!(offer2 == null || (price = offer2.getPrice()) == null)) {
            BigDecimal scale = new BigDecimal(price).setScale(2, 4);
            if (scale.compareTo(BigDecimal.ZERO) > 0) {
                TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvPrice);
                Intrinsics.checkNotNullExpressionValue(textView, "tvPrice");
                Offer offer3 = this.offer;
                if (Intrinsics.areEqual((Object) offer3 != null ? offer3.isPriceRange() : null, (Object) true)) {
                    charSequence = TextUtils.formatAmount(getResources().getString(R.string.range_min_price, new Object[]{TextUtils.formatDecimal(scale)}), getContext());
                } else {
                    charSequence = TextUtils.formatAmount(scale, getContext());
                }
                textView.setText(charSequence);
            }
        }
        Offer offer4 = this.offer;
        if (offer4 != null && (oldPrice = offer4.getOldPrice()) != null) {
            BigDecimal scale2 = new BigDecimal(oldPrice).setScale(2, 4);
            if (scale2.compareTo(BigDecimal.ZERO) > 0) {
                TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvOldPrice);
                TextView textView3 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvOldPrice);
                Intrinsics.checkNotNullExpressionValue(textView3, "tvOldPrice");
                textView2.setPaintFlags(textView3.getPaintFlags() | 16);
                textView2.setText(TextUtils.formatAmount(scale2, textView2.getContext()));
                textView2.setVisibility(0);
                return;
            }
            TextView textView4 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvOldPrice);
            Intrinsics.checkNotNullExpressionValue(textView4, "tvOldPrice");
            textView4.setVisibility(4);
        }
    }

    private final void initServicePrice() {
        String price;
        CharSequence charSequence;
        Offer offer2 = this.offer;
        if (offer2 != null && (price = offer2.getPrice()) != null) {
            BigDecimal scale = new BigDecimal(price).setScale(2, 4);
            TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvPrice);
            Intrinsics.checkNotNullExpressionValue(textView, "tvPrice");
            Offer offer3 = this.offer;
            if (Intrinsics.areEqual((Object) offer3 != null ? offer3.isPriceRange() : null, (Object) true)) {
                charSequence = TextUtils.formatAmount(getResources().getString(R.string.range_min_price, new Object[]{TextUtils.formatDecimal(scale)}), getContext());
            } else {
                charSequence = TextUtils.formatAmount(scale, getContext());
            }
            textView.setText(charSequence);
        }
    }

    /* access modifiers changed from: private */
    public final void addToCart() {
        String str;
        MetricsFacade.Companion companion = MetricsFacade.Companion;
        String value = MetricsKeys.market.getValue();
        HashMap hashMap = new HashMap();
        String value2 = MetricsKeys.addToCart.getValue();
        Offer offer2 = this.offer;
        if (offer2 == null || (str = offer2.getTitle()) == null) {
            str = MetricsKeys.error.getValue();
        }
        hashMap.put(value2, str);
        Unit unit = Unit.INSTANCE;
        companion.reportEvent(value, (HashMap<String, ? extends Object>) hashMap);
        String str2 = this.offerId;
        if (str2 != null) {
            getMarketViewModel().getCartItemListLiveData().removeObserver(new OfferFragment$addToCart$$inlined$let$lambda$1(this));
            getMarketViewModel().setCart(str2, getMarketViewModel().getCurrentOfferQuantity(str2) + this.clickCount);
            getMarketViewModel().getCartItemListLiveData().observe(getViewLifecycleOwner(), new OfferFragment$addToCart$$inlined$let$lambda$2(this));
        }
    }

    /* access modifiers changed from: private */
    public final void handleSetCartEvent(Resource<CartResponse> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
            if (i == 1) {
                Snackbar.make((View) (RelativeLayout) _$_findCachedViewById(C5619R.C5622id.offerLayout), (CharSequence) getString(R.string.item_added_to_cart), -1).show();
                getBaseActivity().setToolbarRight(initRightButtonList(false, true));
            } else if (i == 2) {
                getBaseActivity().showMessage(getResources().getString(R.string.item_add_to_cart_error));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0017, code lost:
        r0 = r0.getLogo();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void initCompanyData() {
        /*
            r5 = this;
            int r0 = p035ru.unicorn.C5619R.C5622id.aboutCompanyLayout
            android.view.View r0 = r5._$_findCachedViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            ru.unicorn.ujin.market.offer.OfferFragment$initCompanyData$1 r1 = new ru.unicorn.ujin.market.offer.OfferFragment$initCompanyData$1
            r1.<init>(r5)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            ru.unicorn.ujin.data.realm.marketplace.Company r0 = r5.company
            r1 = 0
            if (r0 == 0) goto L_0x0022
            ru.unicorn.ujin.data.realm.FileData r0 = r0.getLogo()
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = r0.getUrl()
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0032
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r0 = 0
            goto L_0x0033
        L_0x0032:
            r0 = 1
        L_0x0033:
            if (r0 != 0) goto L_0x005e
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r5.getBaseActivity()
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            ru.unicorn.ujin.util.GlideRequests r0 = p035ru.unicorn.ujin.util.GlideApp.with((androidx.fragment.app.FragmentActivity) r0)
            ru.unicorn.ujin.data.realm.marketplace.Company r4 = r5.company
            if (r4 == 0) goto L_0x004e
            ru.unicorn.ujin.data.realm.FileData r4 = r4.getLogo()
            if (r4 == 0) goto L_0x004e
            java.lang.String r4 = r4.getUrl()
            goto L_0x004f
        L_0x004e:
            r4 = r1
        L_0x004f:
            ru.unicorn.ujin.util.GlideRequest r0 = r0.load((java.lang.String) r4)
            int r4 = p035ru.unicorn.C5619R.C5622id.ivCompanyLogo
            android.view.View r4 = r5._$_findCachedViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0.into((android.widget.ImageView) r4)
        L_0x005e:
            ru.unicorn.ujin.data.realm.marketplace.Company r0 = r5.company
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = r0.getTagline()
            goto L_0x0068
        L_0x0067:
            r0 = r1
        L_0x0068:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0072
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x0073
        L_0x0072:
            r2 = 1
        L_0x0073:
            if (r2 != 0) goto L_0x008f
            int r0 = p035ru.unicorn.C5619R.C5622id.tvCompanyTagLine
            android.view.View r0 = r5._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r2 = "tvCompanyTagLine"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            ru.unicorn.ujin.data.realm.marketplace.Company r2 = r5.company
            if (r2 == 0) goto L_0x008a
            java.lang.String r1 = r2.getTagline()
        L_0x008a:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.market.offer.OfferFragment.initCompanyData():void");
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/market/offer/OfferFragment$Companion;", "", "()V", "EVENT", "", "MIN_DELAY_MS", "", "OFFER_ID", "newInstance", "Lru/unicorn/ujin/market/offer/OfferFragment;", "id", "event", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.offer.OfferFragment$Companion */
    /* compiled from: OfferFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OfferFragment newInstance(String str, String str2) {
            Intrinsics.checkNotNullParameter(str2, "event");
            OfferFragment offerFragment = new OfferFragment();
            Bundle bundle = new Bundle();
            bundle.putString("offerId", str);
            bundle.putString("event", str2);
            Unit unit = Unit.INSTANCE;
            offerFragment.setArguments(bundle);
            return offerFragment;
        }
    }
}
