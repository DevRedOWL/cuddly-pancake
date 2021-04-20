package p035ru.unicorn.ujin.view.fragments.newSmartNav;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/view/activity/navigation/ui/navigation/SimpleViewModel;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.newSmartNav.NewSmartNavFragment$simpleViewModel$2 */
/* compiled from: NewSmartNavFragment.kt */
final class NewSmartNavFragment$simpleViewModel$2 extends Lambda implements Function0<SimpleViewModel> {
    final /* synthetic */ NewSmartNavFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NewSmartNavFragment$simpleViewModel$2(NewSmartNavFragment newSmartNavFragment) {
        super(0);
        this.this$0 = newSmartNavFragment;
    }

    public final SimpleViewModel invoke() {
        ViewModel viewModel = ViewModelProviders.m11of((Fragment) this.this$0, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(SimpleViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…pleViewModel::class.java)");
        return (SimpleViewModel) viewModel;
    }
}
