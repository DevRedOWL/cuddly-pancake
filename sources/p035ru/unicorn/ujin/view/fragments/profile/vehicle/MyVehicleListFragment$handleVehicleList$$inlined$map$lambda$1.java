package p035ru.unicorn.ujin.view.fragments.profile.vehicle;

import android.view.View;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.fragments.parking.response.MyVehicle;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/fragments/profile/vehicle/MyVehicleListFragment$handleVehicleList$1$1$2", "ru/unicorn/ujin/view/fragments/profile/vehicle/MyVehicleListFragment$$special$$inlined$apply$lambda$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.vehicle.MyVehicleListFragment$handleVehicleList$$inlined$map$lambda$1 */
/* compiled from: MyVehicleListFragment.kt */
final class MyVehicleListFragment$handleVehicleList$$inlined$map$lambda$1 implements View.OnClickListener {
    final /* synthetic */ MyVehicle $vehicle$inlined;
    final /* synthetic */ MyVehicleListFragment this$0;

    MyVehicleListFragment$handleVehicleList$$inlined$map$lambda$1(MyVehicle myVehicle, MyVehicleListFragment myVehicleListFragment) {
        this.$vehicle$inlined = myVehicle;
        this.this$0 = myVehicleListFragment;
    }

    public final void onClick(View view) {
        this.this$0.nextFragment(MyVehicleFragment.Companion.newInstance(this.$vehicle$inlined), false);
    }
}
