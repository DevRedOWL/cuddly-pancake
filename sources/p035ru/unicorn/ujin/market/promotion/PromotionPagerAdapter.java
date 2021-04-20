package p035ru.unicorn.ujin.market.promotion;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.PagerAdapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.Promotion;
import p035ru.unicorn.ujin.util.DateUtils;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J \u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0016J\u0018\u0010 \u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0014\u0010%\u001a\u00020\u00132\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006'"}, mo51343d2 = {"Lru/unicorn/ujin/market/promotion/PromotionPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "data", "", "Lru/unicorn/ujin/data/realm/marketplace/Promotion;", "context", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "showPromotionFragment", "Lkotlin/Function1;", "", "", "getShowPromotionFragment", "()Lkotlin/jvm/functions/Function1;", "setShowPromotionFragment", "(Lkotlin/jvm/functions/Function1;)V", "destroyItem", "container", "Landroid/view/ViewGroup;", "position", "", "object", "", "getCount", "instantiateItem", "isViewFromObject", "", "view", "Landroid/view/View;", "setItems", "items", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.promotion.PromotionPagerAdapter */
/* compiled from: PromotionPagerAdapter.kt */
public final class PromotionPagerAdapter extends PagerAdapter {
    private Context context;
    private List<? extends Promotion> data;
    private Function1<? super String, Unit> showPromotionFragment = PromotionPagerAdapter$showPromotionFragment$1.INSTANCE;

    public boolean isViewFromObject(View view, Object obj) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(obj, "object");
        return view == obj;
    }

    public PromotionPagerAdapter(List<? extends Promotion> list, Context context2) {
        Intrinsics.checkNotNullParameter(list, "data");
        Intrinsics.checkNotNullParameter(context2, "context");
        this.data = list;
        this.context = context2;
    }

    public final Context getContext() {
        return this.context;
    }

    public final List<Promotion> getData() {
        return this.data;
    }

    public final void setContext(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        this.context = context2;
    }

    public final void setData(List<? extends Promotion> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final Function1<String, Unit> getShowPromotionFragment() {
        return this.showPromotionFragment;
    }

    public final void setShowPromotionFragment(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.showPromotionFragment = function1;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        View inflate = LayoutInflater.from(this.context).inflate(R.layout.item_pager_promotion, (ViewGroup) null);
        Promotion promotion = (Promotion) this.data.get(i);
        if (promotion.getText() != null) {
            Intrinsics.checkNotNullExpressionValue(inflate, "view");
            TextView textView = (TextView) inflate.findViewById(C5619R.C5622id.tvDescription);
            Intrinsics.checkNotNullExpressionValue(textView, "view.tvDescription");
            textView.setText(Html.fromHtml(promotion.getText()));
        }
        Intrinsics.checkNotNullExpressionValue(inflate, "view");
        TextView textView2 = (TextView) inflate.findViewById(C5619R.C5622id.tvDate);
        Intrinsics.checkNotNullExpressionValue(textView2, "view.tvDate");
        CharSequence finishedAt = promotion.getFinishedAt();
        if (finishedAt == null || StringsKt.isBlank(finishedAt)) {
            charSequence = inflate.getResources().getString(R.string.permanent_promotion);
        } else {
            charSequence = DateUtils.formatDateFromUnix(promotion.getFinishedAt());
        }
        textView2.setText(charSequence);
        ((CardView) inflate.findViewById(C5619R.C5622id.promotionLayout)).setOnClickListener(new PromotionPagerAdapter$instantiateItem$2(this, promotion));
        viewGroup.addView(inflate, 0);
        return inflate;
    }

    public int getCount() {
        return this.data.size();
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        Intrinsics.checkNotNullParameter(obj, "object");
        viewGroup.removeView((View) obj);
    }

    public final void setItems(List<? extends Promotion> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.data = list;
        notifyDataSetChanged();
    }
}
