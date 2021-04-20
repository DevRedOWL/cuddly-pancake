package p035ru.unicorn.ujin.view.fragments.mortgage.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.ContextBanner;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J \u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0016J\u0018\u0010 \u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0016\u0010%\u001a\u00020\u00132\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006'"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/mortgage/adapters/MortgagePagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "data", "", "Lru/unicorn/ujin/data/realm/ContextBanner;", "context", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "showMortgageFragment", "Lkotlin/Function1;", "", "", "getShowMortgageFragment", "()Lkotlin/jvm/functions/Function1;", "setShowMortgageFragment", "(Lkotlin/jvm/functions/Function1;)V", "destroyItem", "container", "Landroid/view/ViewGroup;", "position", "", "object", "", "getCount", "instantiateItem", "isViewFromObject", "", "view", "Landroid/view/View;", "setItems", "items", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.mortgage.adapters.MortgagePagerAdapter */
/* compiled from: MortgagePagerAdapter.kt */
public final class MortgagePagerAdapter extends PagerAdapter {
    private Context context;
    private List<? extends ContextBanner> data;
    private Function1<? super String, Unit> showMortgageFragment = MortgagePagerAdapter$showMortgageFragment$1.INSTANCE;

    public boolean isViewFromObject(View view, Object obj) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(obj, "object");
        return view == obj;
    }

    public MortgagePagerAdapter(List<? extends ContextBanner> list, Context context2) {
        Intrinsics.checkNotNullParameter(list, "data");
        Intrinsics.checkNotNullParameter(context2, "context");
        this.data = list;
        this.context = context2;
    }

    public final Context getContext() {
        return this.context;
    }

    public final List<ContextBanner> getData() {
        return this.data;
    }

    public final void setContext(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        this.context = context2;
    }

    public final void setData(List<? extends ContextBanner> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final Function1<String, Unit> getShowMortgageFragment() {
        return this.showMortgageFragment;
    }

    public final void setShowMortgageFragment(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.showMortgageFragment = function1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001d, code lost:
        r2 = r13.getLayout();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object instantiateItem(android.view.ViewGroup r12, int r13) {
        /*
            r11 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            android.content.Context r0 = r11.context
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 0
            r2 = 2131558959(0x7f0d022f, float:1.8743249E38)
            android.view.View r0 = r0.inflate(r2, r1)
            java.util.List<? extends ru.unicorn.ujin.data.realm.ContextBanner> r2 = r11.data
            java.lang.Object r13 = r2.get(r13)
            ru.unicorn.ujin.data.realm.ContextBanner r13 = (p035ru.unicorn.ujin.data.realm.ContextBanner) r13
            if (r13 == 0) goto L_0x0028
            ru.unicorn.ujin.data.realm.Layout r2 = r13.getLayout()
            if (r2 == 0) goto L_0x0028
            java.lang.String r2 = r2.getBackground()
            goto L_0x0029
        L_0x0028:
            r2 = r1
        L_0x0029:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r9 = 0
            r3 = 1
            if (r2 == 0) goto L_0x0038
            boolean r2 = kotlin.text.StringsKt.isBlank(r2)
            if (r2 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r2 = 0
            goto L_0x0039
        L_0x0038:
            r2 = 1
        L_0x0039:
            java.lang.String r10 = "view"
            if (r2 != 0) goto L_0x0068
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r10)
            int r2 = p035ru.unicorn.C5619R.C5622id.mortgageLayout
            android.view.View r2 = r0.findViewById(r2)
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            com.bumptech.glide.RequestManager r2 = com.bumptech.glide.Glide.with((android.view.View) r2)
            if (r13 == 0) goto L_0x0059
            ru.unicorn.ujin.data.realm.Layout r4 = r13.getLayout()
            if (r4 == 0) goto L_0x0059
            java.lang.String r4 = r4.getBackground()
            goto L_0x005a
        L_0x0059:
            r4 = r1
        L_0x005a:
            com.bumptech.glide.RequestBuilder r2 = r2.load((java.lang.String) r4)
            ru.unicorn.ujin.view.fragments.mortgage.adapters.MortgagePagerAdapter$instantiateItem$1 r4 = new ru.unicorn.ujin.view.fragments.mortgage.adapters.MortgagePagerAdapter$instantiateItem$1
            r4.<init>(r0)
            com.bumptech.glide.request.target.Target r4 = (com.bumptech.glide.request.target.Target) r4
            r2.into(r4)
        L_0x0068:
            if (r13 == 0) goto L_0x00fb
            ru.unicorn.ujin.data.realm.Layout r2 = r13.getLayout()
            if (r2 == 0) goto L_0x00fb
            io.realm.RealmList r2 = r2.getFeatures()
            if (r2 == 0) goto L_0x00fb
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x00fb
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r10)
            int r4 = p035ru.unicorn.C5619R.C5622id.tvTitle
            android.view.View r4 = r0.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            ru.unicorn.ujin.data.realm.Layout r5 = r13.getLayout()
            if (r5 == 0) goto L_0x0095
            java.lang.String r1 = r5.getTitle()
        L_0x0095:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r4.setText(r1)
            ru.unicorn.ujin.data.realm.Layout r1 = r13.getLayout()
            if (r1 == 0) goto L_0x00c3
            ru.unicorn.ujin.data.realm.Bank r1 = r1.getBank()
            if (r1 == 0) goto L_0x00c3
            java.lang.String r5 = r1.getAccentColor()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L_0x00b6
            boolean r5 = kotlin.text.StringsKt.isBlank(r5)
            if (r5 == 0) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r3 = 0
        L_0x00b6:
            if (r3 != 0) goto L_0x00c3
            java.lang.String r1 = r1.getAccentColor()
            int r1 = android.graphics.Color.parseColor(r1)
            r4.setTextColor(r1)
        L_0x00c3:
            ru.unicorn.ujin.view.fragments.mortgage.adapters.FeatureListAdapter r1 = new ru.unicorn.ujin.view.fragments.mortgage.adapters.FeatureListAdapter
            java.util.List r2 = (java.util.List) r2
            r1.<init>(r2)
            int r2 = p035ru.unicorn.C5619R.C5622id.featureListView
            android.view.View r2 = r0.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r3 = r1
            androidx.recyclerview.widget.RecyclerView$Adapter r3 = (androidx.recyclerview.widget.RecyclerView.Adapter) r3
            r2.setAdapter(r3)
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r4 = r2.getContext()
            r3.<init>(r4)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = (androidx.recyclerview.widget.RecyclerView.LayoutManager) r3
            r2.setLayoutManager(r3)
            java.lang.String r4 = r13.getId()
            if (r4 == 0) goto L_0x00fb
            ru.unicorn.ujin.view.fragments.mortgage.adapters.MortgagePagerAdapter$instantiateItem$$inlined$let$lambda$1 r2 = new ru.unicorn.ujin.view.fragments.mortgage.adapters.MortgagePagerAdapter$instantiateItem$$inlined$let$lambda$1
            r3 = r2
            r5 = r1
            r6 = r11
            r7 = r0
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r1.setClickListener(r2)
        L_0x00fb:
            if (r13 == 0) goto L_0x013c
            java.lang.String r13 = r13.getId()
            if (r13 == 0) goto L_0x013c
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r10)
            int r1 = p035ru.unicorn.C5619R.C5622id.mortgageLayout
            android.view.View r1 = r0.findViewById(r1)
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            ru.unicorn.ujin.view.fragments.mortgage.adapters.MortgagePagerAdapter$instantiateItem$$inlined$let$lambda$2 r2 = new ru.unicorn.ujin.view.fragments.mortgage.adapters.MortgagePagerAdapter$instantiateItem$$inlined$let$lambda$2
            r2.<init>(r13, r11, r0)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            int r1 = p035ru.unicorn.C5619R.C5622id.tvTitle
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            ru.unicorn.ujin.view.fragments.mortgage.adapters.MortgagePagerAdapter$instantiateItem$$inlined$let$lambda$3 r2 = new ru.unicorn.ujin.view.fragments.mortgage.adapters.MortgagePagerAdapter$instantiateItem$$inlined$let$lambda$3
            r2.<init>(r13, r11, r0)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            int r1 = p035ru.unicorn.C5619R.C5622id.featureListView
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            ru.unicorn.ujin.view.fragments.mortgage.adapters.MortgagePagerAdapter$instantiateItem$$inlined$let$lambda$4 r2 = new ru.unicorn.ujin.view.fragments.mortgage.adapters.MortgagePagerAdapter$instantiateItem$$inlined$let$lambda$4
            r2.<init>(r13, r11, r0)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
        L_0x013c:
            r12.addView(r0, r9)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.mortgage.adapters.MortgagePagerAdapter.instantiateItem(android.view.ViewGroup, int):java.lang.Object");
    }

    public int getCount() {
        return this.data.size();
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        Intrinsics.checkNotNullParameter(obj, "object");
        viewGroup.removeView((View) obj);
    }

    public final void setItems(List<? extends ContextBanner> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.data = list;
        notifyDataSetChanged();
    }
}
