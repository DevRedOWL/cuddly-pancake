package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.customViews.dynamic.button.DynamicFormViewModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/view/customViews/dynamic/button/DynamicFormViewModel;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.SpinnerViewHolder$viewModel$2 */
/* compiled from: SpinnerViewHolder.kt */
final class SpinnerViewHolder$viewModel$2 extends Lambda implements Function0<DynamicFormViewModel> {
    final /* synthetic */ View $itemView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SpinnerViewHolder$viewModel$2(View view) {
        super(0);
        this.$itemView = view;
    }

    public final DynamicFormViewModel invoke() {
        Context context = this.$itemView.getContext();
        if (context != null) {
            ViewModel viewModel = ViewModelProviders.m12of((FragmentActivity) (BaseActivity) context).get(DynamicFormViewModel.class);
            Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(it…ormViewModel::class.java)");
            return (DynamicFormViewModel) viewModel;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.activity.BaseActivity");
    }
}
