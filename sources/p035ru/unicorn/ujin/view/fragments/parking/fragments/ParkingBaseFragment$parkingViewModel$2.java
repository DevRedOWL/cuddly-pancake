package p035ru.unicorn.ujin.view.fragments.parking.fragments;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.fragments.parking.ParkingViewModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/view/fragments/parking/ParkingViewModel;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingBaseFragment$parkingViewModel$2 */
/* compiled from: ParkingBaseFragment.kt */
final class ParkingBaseFragment$parkingViewModel$2 extends Lambda implements Function0<ParkingViewModel> {
    final /* synthetic */ ParkingBaseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ParkingBaseFragment$parkingViewModel$2(ParkingBaseFragment parkingBaseFragment) {
        super(0);
        this.this$0 = parkingBaseFragment;
    }

    public final ParkingViewModel invoke() {
        ViewModel viewModel = ViewModelProviders.m10of((Fragment) this.this$0).get(ParkingViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…ingViewModel::class.java)");
        return (ParkingViewModel) viewModel;
    }
}
