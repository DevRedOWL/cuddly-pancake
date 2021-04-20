package p035ru.unicorn.ujin.market.offer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.Company;
import p035ru.unicorn.ujin.market.MarketBaseFragment;
import p035ru.unicorn.ujin.viewModel.events.market.CompanyEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\u0004H\u0014J&\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/market/offer/OfferSellerFragment;", "Lru/unicorn/ujin/market/MarketBaseFragment;", "()V", "companyId", "", "handleEvent", "", "event", "Lru/unicorn/ujin/viewModel/events/market/CompanyEvent;", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.offer.OfferSellerFragment */
/* compiled from: OfferSellerFragment.kt */
public final class OfferSellerFragment extends MarketBaseFragment {
    public static final String COMPANY_ID = "companyId";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private String companyId;

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
        return layoutInflater.inflate(R.layout.fragment_offer_seller, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setNeedResetToolbar(false);
        Bundle arguments = getArguments();
        this.companyId = arguments != null ? arguments.getString("companyId") : null;
        String str = this.companyId;
        if (str != null) {
            getMarketViewModel().loadCompanyDetails(CollectionsKt.listOf(str));
            getMarketViewModel().getCompanyLiveData().observe(this, new OfferSellerFragment$onViewCreated$$inlined$let$lambda$1(this));
        }
    }

    /* access modifiers changed from: private */
    public final void handleEvent(CompanyEvent companyEvent) {
        if (companyEvent.getSuccess()) {
            Company company = getMarketViewModel().getCompany(this.companyId);
            if (company != null) {
                TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvName);
                Intrinsics.checkNotNullExpressionValue(textView, "tvName");
                textView.setText(company.getTitle());
                return;
            }
            return;
        }
        TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvName);
        Intrinsics.checkNotNullExpressionValue(textView2, "tvName");
        textView2.setVisibility(8);
        TextView textView3 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvDescription);
        Intrinsics.checkNotNullExpressionValue(textView3, "tvDescription");
        textView3.setVisibility(8);
        TextView textView4 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoInfo);
        Intrinsics.checkNotNullExpressionValue(textView4, "tvNoInfo");
        textView4.setVisibility(0);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/market/offer/OfferSellerFragment$Companion;", "", "()V", "COMPANY_ID", "", "newInstance", "Lru/unicorn/ujin/market/offer/OfferSellerFragment;", "id", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.offer.OfferSellerFragment$Companion */
    /* compiled from: OfferSellerFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OfferSellerFragment newInstance(String str) {
            OfferSellerFragment offerSellerFragment = new OfferSellerFragment();
            Bundle bundle = new Bundle();
            bundle.putString("companyId", str);
            Unit unit = Unit.INSTANCE;
            offerSellerFragment.setArguments(bundle);
            return offerSellerFragment;
        }
    }
}
