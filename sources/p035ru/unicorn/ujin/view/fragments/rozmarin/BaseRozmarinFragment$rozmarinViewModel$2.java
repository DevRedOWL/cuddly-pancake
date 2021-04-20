package p035ru.unicorn.ujin.view.fragments.rozmarin;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.RozmarinViewModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/view/fragments/chats/viewModel/chatViewModel/RozmarinViewModel;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.rozmarin.BaseRozmarinFragment$rozmarinViewModel$2 */
/* compiled from: BaseRozmarinFragment.kt */
final class BaseRozmarinFragment$rozmarinViewModel$2 extends Lambda implements Function0<RozmarinViewModel> {
    final /* synthetic */ BaseRozmarinFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BaseRozmarinFragment$rozmarinViewModel$2(BaseRozmarinFragment baseRozmarinFragment) {
        super(0);
        this.this$0 = baseRozmarinFragment;
    }

    public final RozmarinViewModel invoke() {
        ViewModel viewModel = ViewModelProviders.m10of((Fragment) this.this$0).get(RozmarinViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…rinViewModel::class.java)");
        return (RozmarinViewModel) viewModel;
    }
}
