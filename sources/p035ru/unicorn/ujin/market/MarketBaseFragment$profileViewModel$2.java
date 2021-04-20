package p035ru.unicorn.ujin.market;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/profile/ProfileViewModel;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.MarketBaseFragment$profileViewModel$2 */
/* compiled from: MarketBaseFragment.kt */
final class MarketBaseFragment$profileViewModel$2 extends Lambda implements Function0<ProfileViewModel> {
    final /* synthetic */ MarketBaseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MarketBaseFragment$profileViewModel$2(MarketBaseFragment marketBaseFragment) {
        super(0);
        this.this$0 = marketBaseFragment;
    }

    public final ProfileViewModel invoke() {
        return (ProfileViewModel) ViewModelProviders.m11of((Fragment) this.this$0, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(ProfileViewModel.class);
    }
}
