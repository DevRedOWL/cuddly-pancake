package p035ru.unicorn.ujin.view.fragments.mortgage.adapters;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u00020\u00042\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0010\u0010\b\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\tH\u0016¨\u0006\n"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/mortgage/adapters/MortgagePagerAdapter$instantiateItem$1", "Lcom/bumptech/glide/request/target/CustomTarget;", "Landroid/graphics/drawable/Drawable;", "onLoadCleared", "", "placeholder", "onResourceReady", "resource", "transition", "Lcom/bumptech/glide/request/transition/Transition;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.mortgage.adapters.MortgagePagerAdapter$instantiateItem$1 */
/* compiled from: MortgagePagerAdapter.kt */
public final class MortgagePagerAdapter$instantiateItem$1 extends CustomTarget<Drawable> {
    final /* synthetic */ View $view;

    public void onLoadCleared(Drawable drawable) {
    }

    MortgagePagerAdapter$instantiateItem$1(View view) {
        this.$view = view;
    }

    public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
        Intrinsics.checkNotNullParameter(drawable, "resource");
        View view = this.$view;
        Intrinsics.checkNotNullExpressionValue(view, "view");
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(C5619R.C5622id.mortgageLayout);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "view.mortgageLayout");
        constraintLayout.setBackground(drawable);
    }
}
