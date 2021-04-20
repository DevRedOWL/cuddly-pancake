package p035ru.unicorn.ujin.market.order;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.request.RequestListener;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.data.realm.marketplace.CartOffer;
import p035ru.unicorn.ujin.data.realm.marketplace.Offer;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.market.MarketBaseFragment;
import p035ru.unicorn.ujin.market.enums.OfferType;
import p035ru.unicorn.ujin.metrics.MetricsFacade;
import p035ru.unicorn.ujin.metrics.MetricsKeys;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.util.TextUtils;
import p035ru.unicorn.ujin.util.Validator;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText;
import p035ru.unicorn.ujin.viewModel.events.market.CreateOrderEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\fH\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0014J\"\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0013H\u0002J\u0010\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u0004H\u0002J\b\u0010)\u001a\u00020\fH\u0014J\f\u0010*\u001a\u00020\f*\u00020+H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, mo51343d2 = {"Lru/unicorn/ujin/market/order/OrderFormFragment;", "Lru/unicorn/ujin/market/MarketBaseFragment;", "()V", "itemId", "", "itemType", "offer", "Lru/unicorn/ujin/data/realm/marketplace/Offer;", "orderItemList", "", "Lru/unicorn/ujin/data/realm/marketplace/CartOffer;", "handleEvent", "", "event", "Lru/unicorn/ujin/viewModel/events/market/CreateOrderEvent;", "initFinishButton", "initOfferLayout", "initOfferListLayout", "isUserDataValid", "", "metricsScreenName", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setVisibilityProgressView", "isVisible", "showSuccessMessage", "message", "showToolbar", "markRequired", "Lcom/google/android/material/textfield/TextInputLayout;", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.order.OrderFormFragment */
/* compiled from: OrderFormFragment.kt */
public final class OrderFormFragment extends MarketBaseFragment {
    public static final String COMPANY_TYPE = "company";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String ITEM_ID = "itemId";
    public static final String ITEM_TYPE = "itemType";
    public static final String OFFER_TYPE = "offer";
    private HashMap _$_findViewCache;
    private String itemId;
    /* access modifiers changed from: private */
    public String itemType;
    /* access modifiers changed from: private */
    public Offer offer;
    private List<CartOffer> orderItemList = new ArrayList();

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
        getBaseActivity().setTextTitle(getResources().getString(R.string.order_registration));
        getBaseActivity().setToolbarRight(initCloseButtonList());
        getBaseActivity().hideBottomNavigation();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_order_form, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str2 = null;
        this.itemId = arguments != null ? arguments.getString(ITEM_ID) : null;
        Bundle arguments2 = getArguments();
        this.itemType = arguments2 != null ? arguments2.getString(ITEM_TYPE) : null;
        String str3 = this.itemType;
        if (str3 != null && str3.hashCode() == 105650780 && str3.equals(OFFER_TYPE)) {
            this.offer = getMarketViewModel().getOffer(this.itemId);
            MetricsFacade.Companion companion = MetricsFacade.Companion;
            String value = MetricsKeys.market.getValue();
            HashMap hashMap = new HashMap();
            String value2 = MetricsKeys.orderForm.getValue();
            Offer offer2 = this.offer;
            if (offer2 == null || (str = offer2.getTitle()) == null) {
                str = MetricsKeys.error.getValue();
            }
            hashMap.put(value2, str);
            Unit unit = Unit.INSTANCE;
            companion.reportEvent(value, (HashMap<String, ? extends Object>) hashMap);
            OfferType.Companion companion2 = OfferType.Companion;
            Offer offer3 = this.offer;
            if (offer3 != null) {
                str2 = offer3.getType();
            }
            if (companion2.getType(str2) == OfferType.SERVICE) {
                TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvOrderInfoTitle);
                Intrinsics.checkNotNullExpressionValue(textView, "tvOrderInfoTitle");
                textView.setText(getResources().getString(R.string.service_order_info));
                TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvOrderAddInfoTitle);
                Intrinsics.checkNotNullExpressionValue(textView2, "tvOrderAddInfoTitle");
                textView2.setText(getResources().getString(R.string.service_order_additional_info));
            } else {
                TextView textView3 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvOrderInfoTitle);
                Intrinsics.checkNotNullExpressionValue(textView3, "tvOrderInfoTitle");
                textView3.setText(getResources().getString(R.string.offer_order_info));
                TextView textView4 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvOrderAddInfoTitle);
                Intrinsics.checkNotNullExpressionValue(textView4, "tvOrderAddInfoTitle");
                textView4.setText(getResources().getString(R.string.offer_order_additional_info));
            }
            initOfferLayout();
        } else {
            this.orderItemList = getMarketViewModel().getOrderedOfferList(this.itemId);
            for (CartOffer title : this.orderItemList) {
                MetricsFacade.Companion companion3 = MetricsFacade.Companion;
                String value3 = MetricsKeys.market.getValue();
                HashMap hashMap2 = new HashMap();
                String value4 = MetricsKeys.orderForm.getValue();
                String title2 = title.getTitle();
                if (title2 == null) {
                    title2 = MetricsKeys.error.getValue();
                }
                hashMap2.put(value4, title2);
                Unit unit2 = Unit.INSTANCE;
                companion3.reportEvent(value3, (HashMap<String, ? extends Object>) hashMap2);
            }
            TextView textView5 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvOrderInfoTitle);
            Intrinsics.checkNotNullExpressionValue(textView5, "tvOrderInfoTitle");
            textView5.setText(getResources().getString(R.string.consumer_info));
            TextView textView6 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvOrderAddInfoTitle);
            Intrinsics.checkNotNullExpressionValue(textView6, "tvOrderAddInfoTitle");
            textView6.setText(getResources().getString(R.string.consumer_additional_info));
            initOfferListLayout();
        }
        TextInputLayout textInputLayout = (TextInputLayout) _$_findCachedViewById(C5619R.C5622id.tilName);
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "tilName");
        markRequired(textInputLayout);
        TextInputLayout textInputLayout2 = (TextInputLayout) _$_findCachedViewById(C5619R.C5622id.tilPhone);
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "tilPhone");
        markRequired(textInputLayout2);
        TextInputLayout textInputLayout3 = (TextInputLayout) _$_findCachedViewById(C5619R.C5622id.tilAddress);
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "tilAddress");
        markRequired(textInputLayout3);
        User user = getProfileViewModel().getUser();
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etSurname)).setText(user.getSurname());
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etName)).setText(user.getName());
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPatronymic)).setText(user.getPatronymic());
        ((PhoneMaskedEditText) _$_findCachedViewById(C5619R.C5622id.etPhone)).setText(getProfileViewModel().getUserPhone());
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etEmail)).setText(user.getEmail());
        initFinishButton();
    }

    /* access modifiers changed from: private */
    public final boolean isUserDataValid() {
        TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etName);
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "etName");
        Editable text = textInputEditText.getText();
        if (text != null && (!StringsKt.isBlank(text))) {
            TextInputEditText textInputEditText2 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etAddress);
            Intrinsics.checkNotNullExpressionValue(textInputEditText2, "etAddress");
            Editable text2 = textInputEditText2.getText();
            if (text2 != null && (!StringsKt.isBlank(text2)) && ((PhoneMaskedEditText) _$_findCachedViewById(C5619R.C5622id.etPhone)).isValid()) {
                TextInputEditText textInputEditText3 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etEmail);
                Intrinsics.checkNotNullExpressionValue(textInputEditText3, "etEmail");
                Editable text3 = textInputEditText3.getText();
                if (text3 != null && !(!StringsKt.isBlank(text3))) {
                    return true;
                }
                TextInputEditText textInputEditText4 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etEmail);
                Intrinsics.checkNotNullExpressionValue(textInputEditText4, "etEmail");
                Editable text4 = textInputEditText4.getText();
                if (text4 != null && (!StringsKt.isBlank(text4))) {
                    return true;
                }
                TextInputEditText textInputEditText5 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etEmail);
                Intrinsics.checkNotNullExpressionValue(textInputEditText5, "etEmail");
                if (Validator.isEmailValid(String.valueOf(textInputEditText5.getText()))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void setVisibilityProgressView(boolean z) {
        ScrollView scrollView = (ScrollView) _$_findCachedViewById(C5619R.C5622id.orderLayout);
        Intrinsics.checkNotNullExpressionValue(scrollView, "orderLayout");
        int i = 8;
        scrollView.setVisibility(z ? 8 : 0);
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnFinish);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "btnFinish");
        dynamicBackgroundButton.setVisibility(z ? 8 : 0);
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        if (z) {
            i = 0;
        }
        progressBar.setVisibility(i);
    }

    private final void initFinishButton() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (List) new ArrayList();
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnFinish);
        String str = this.itemType;
        if (str != null && str.hashCode() == 105650780 && str.equals(OFFER_TYPE)) {
            dynamicBackgroundButton.setText(R.string.sendOrder);
            Offer offer2 = getMarketViewModel().getOffer(this.itemId);
            ((List) objectRef.element).add(new CartOffer(offer2 != null ? offer2.getId() : null, offer2 != null ? offer2.getTitle() : null, offer2 != null ? offer2.getPrice() : null, 1, offer2 != null ? offer2.getOldPrice() : null, offer2 != null ? offer2.getSummary() : null, offer2 != null ? offer2.getImage() : null));
        } else {
            objectRef.element = getMarketViewModel().getOrderedOfferList(this.itemId);
            dynamicBackgroundButton.setText(R.string.pay_order);
        }
        dynamicBackgroundButton.setOnClickListener(new OrderFormFragment$initFinishButton$$inlined$apply$lambda$1(dynamicBackgroundButton, this, objectRef));
    }

    private final void initOfferLayout() {
        FileData image;
        FileData image2;
        View _$_findCachedViewById = _$_findCachedViewById(C5619R.C5622id.serviceLayout);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "serviceLayout");
        _$_findCachedViewById.setVisibility(0);
        Offer offer2 = getMarketViewModel().getOffer(this.itemId);
        Boolean bool = null;
        CharSequence title = offer2 != null ? offer2.getTitle() : null;
        if (title == null || StringsKt.isBlank(title)) {
            TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvServiceTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "tvServiceTitle");
            textView.setVisibility(8);
        } else {
            TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvServiceTitle);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvServiceTitle");
            textView2.setText(Html.fromHtml(offer2 != null ? offer2.getTitle() : null));
        }
        CharSequence url = (offer2 == null || (image2 = offer2.getImage()) == null) ? null : image2.getUrl();
        if (!(url == null || StringsKt.isBlank(url))) {
            GlideApp.with((FragmentActivity) getBaseActivity()).load((offer2 == null || (image = offer2.getImage()) == null) ? null : image.getUrl()).listener((RequestListener) new OrderFormFragment$initOfferLayout$1()).into((ImageView) (AppCompatImageView) _$_findCachedViewById(C5619R.C5622id.serviceImage));
            if (Build.VERSION.SDK_INT >= 21) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(C5619R.C5622id.serviceImage);
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "serviceImage");
                appCompatImageView.setClipToOutline(true);
            }
        }
        BigDecimal scale = new BigDecimal(offer2 != null ? offer2.getPrice() : null).setScale(2, 4);
        if (scale.compareTo(BigDecimal.ZERO) > 0) {
            if (offer2 != null) {
                bool = offer2.isPriceRange();
            }
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                TextView textView3 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvServicePrice);
                Intrinsics.checkNotNullExpressionValue(textView3, "tvServicePrice");
                textView3.setText(TextUtils.formatAmount(getResources().getString(R.string.range_min_price, new Object[]{TextUtils.formatDecimal(scale)}), getContext()));
                return;
            }
            TextView textView4 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvServicePrice);
            Intrinsics.checkNotNullExpressionValue(textView4, "tvServicePrice");
            textView4.setText(TextUtils.formatAmount(scale, getContext()));
        }
    }

    private final void initOfferListLayout() {
        View _$_findCachedViewById = _$_findCachedViewById(C5619R.C5622id.offerListLayout);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "offerListLayout");
        _$_findCachedViewById.setVisibility(0);
        View _$_findCachedViewById2 = _$_findCachedViewById(C5619R.C5622id.offerListLayout);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "offerListLayout");
        _$_findCachedViewById2.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        FormOfferListAdapter formOfferListAdapter = new FormOfferListAdapter(this.orderItemList);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvOfferList);
        recyclerView.setAdapter(formOfferListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }

    private final void markRequired(TextInputLayout textInputLayout) {
        StringBuilder sb = new StringBuilder();
        sb.append(textInputLayout.getHint());
        sb.append(Html.fromHtml(textInputLayout.getResources().getString(R.string.required_asterisk)));
        textInputLayout.setHint((CharSequence) sb.toString());
    }

    /* access modifiers changed from: private */
    public final void handleEvent(CreateOrderEvent createOrderEvent) {
        if (!createOrderEvent.getSuccess()) {
            setVisibilityProgressView(false);
            if (StringsKt.isBlank(createOrderEvent.getMessage())) {
                showMessage(getResources().getString(R.string.internalError));
            } else {
                showMessage(createOrderEvent.getMessage());
            }
        } else if (Intrinsics.areEqual((Object) this.itemType, (Object) "company")) {
            String paymentForm = createOrderEvent.getPaymentForm();
            if (paymentForm == null || !(!StringsKt.isBlank(paymentForm))) {
                String string = getResources().getString(R.string.order_success_message);
                Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…ng.order_success_message)");
                showSuccessMessage(string);
                return;
            }
            startPaymentActivity(createOrderEvent.getPaymentForm());
        } else {
            String string2 = getResources().getString(R.string.order_success_message);
            Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.st…ng.order_success_message)");
            showSuccessMessage(string2);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if ((i == 1 && i2 == -1 && intent != null) ? intent.getBooleanExtra("success", false) : false) {
            String string = getResources().getString(R.string.order_payment_success_message);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…_payment_success_message)");
            showSuccessMessage(string);
            return;
        }
        setVisibilityProgressView(false);
        showMessage(getResources().getString(R.string.payment_fail_message));
    }

    private final void showSuccessMessage(String str) {
        setVisibilityProgressView(false);
        showMessage(str);
        if (Intrinsics.areEqual((Object) this.itemType, (Object) "company")) {
            showOrderListFragment(true);
        } else {
            getBaseActivity().onBackPressed();
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/market/order/OrderFormFragment$Companion;", "", "()V", "COMPANY_TYPE", "", "ITEM_ID", "ITEM_TYPE", "OFFER_TYPE", "newInstance", "Lru/unicorn/ujin/market/order/OrderFormFragment;", "id", "type", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.order.OrderFormFragment$Companion */
    /* compiled from: OrderFormFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OrderFormFragment newInstance(String str, String str2) {
            Intrinsics.checkNotNullParameter(str2, "type");
            OrderFormFragment orderFormFragment = new OrderFormFragment();
            Bundle bundle = new Bundle();
            bundle.putString(OrderFormFragment.ITEM_ID, str);
            bundle.putString(OrderFormFragment.ITEM_TYPE, str2);
            Unit unit = Unit.INSTANCE;
            orderFormFragment.setArguments(bundle);
            return orderFormFragment;
        }
    }
}
