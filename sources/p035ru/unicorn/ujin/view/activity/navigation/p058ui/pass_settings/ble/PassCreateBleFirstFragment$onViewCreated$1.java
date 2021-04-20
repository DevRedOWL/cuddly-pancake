package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import android.view.View;
import kotlin.Metadata;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p035ru.unicorn.ujin.data.service.location.LocationHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassCreateBleFirstFragment$onViewCreated$1 */
/* compiled from: PassCreateBleFirstFragment.kt */
final class PassCreateBleFirstFragment$onViewCreated$1 implements View.OnClickListener {
    final /* synthetic */ PassProfileVM $viewModell;
    final /* synthetic */ PassCreateBleFirstFragment this$0;

    PassCreateBleFirstFragment$onViewCreated$1(PassCreateBleFirstFragment passCreateBleFirstFragment, PassProfileVM passProfileVM) {
        this.this$0 = passCreateBleFirstFragment;
        this.$viewModell = passProfileVM;
    }

    public final void onClick(View view) {
        if (!this.this$0.permissionsGranted()) {
            PassCreateBleFirstFragment passCreateBleFirstFragment = this.this$0;
            passCreateBleFirstFragment.requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, passCreateBleFirstFragment.LOCATION_REQUEST_CODE);
        } else if (!LocationHelper.isLocationEnabled(this.this$0.getBaseActivity())) {
            this.this$0.enableLocation();
        } else if (!this.this$0.bleEnable()) {
            this.this$0.enableBT();
        } else {
            BleReader selectedReader = this.this$0.bleReaderSection.getSelectedReader();
            if (selectedReader != null) {
                this.$viewModell.getSelectedFingerReader().setValue(-1);
                this.this$0.nextFragment(PassCreateBleSecondFragment.Companion.start(String.valueOf(selectedReader.getSerialNumber()), selectedReader.getDeviceMac()), false);
            }
        }
    }
}
