package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.util.Timer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.util.AppUtils;
import p035ru.unicorn.ujin.view.adapters.ViewPagerBuilderAdapter;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/dynamic/KortrosViewPagerHolder;", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.KortrosViewPagerHolder */
/* compiled from: KortrosViewPagerHolder.kt */
public final class KortrosViewPagerHolder extends BaseViewHolder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KortrosViewPagerHolder(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
    }

    public void bind(Field field) {
        Intrinsics.checkNotNullParameter(field, "item");
        View view = this.itemView;
        if (view != null) {
            ViewPager viewPager = (ViewPager) view;
            viewPager.setClipToPadding(false);
            viewPager.setOffscreenPageLimit(2);
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            viewPager.setPageMargin(AppUtils.dpToPx(((ViewPager) view2).getContext(), 10));
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            viewPager.setAdapter(new ViewPagerBuilderAdapter(((ViewPager) view3).getContext()));
            View view4 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "itemView");
            ((ViewPager) view4).getViewTreeObserver().addOnGlobalLayoutListener(new KortrosViewPagerHolder$bind$2(this));
            new Timer().scheduleAtFixedRate(new KortrosViewPagerHolder$bind$TimerTask(this), 2000, 4000);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.viewpager.widget.ViewPager");
    }
}
