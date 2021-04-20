package p035ru.unicorn.ujin.view.fragments.development;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.fragments.development.DeveloperViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/fragments/development/DeveloperViewModel;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.development.DeveloperFragment$developmentViewModel$2 */
/* compiled from: DeveloperFragment.kt */
final class DeveloperFragment$developmentViewModel$2 extends Lambda implements Function0<DeveloperViewModel> {
    final /* synthetic */ DeveloperFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DeveloperFragment$developmentViewModel$2(DeveloperFragment developerFragment) {
        super(0);
        this.this$0 = developerFragment;
    }

    public final DeveloperViewModel invoke() {
        ViewModel viewModel = ViewModelProviders.m11of((Fragment) this.this$0, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(DeveloperViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(\n …perViewModel::class.java)");
        return (DeveloperViewModel) viewModel;
    }
}
