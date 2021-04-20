package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.finger;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.finger.PassCreateFingerSecondFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.finger.PassCreateFingerFirstFragment$onViewCreated$1 */
/* compiled from: PassCreateFingerFirstFragment.kt */
final class PassCreateFingerFirstFragment$onViewCreated$1 implements View.OnClickListener {
    final /* synthetic */ PassCreateFingerFirstFragment this$0;

    PassCreateFingerFirstFragment$onViewCreated$1(PassCreateFingerFirstFragment passCreateFingerFirstFragment) {
        this.this$0 = passCreateFingerFirstFragment;
    }

    public final void onClick(View view) {
        BleReader selectedReader = this.this$0.bleReaderSection.getSelectedReader();
        if (selectedReader != null) {
            PassCreateFingerFirstFragment passCreateFingerFirstFragment = this.this$0;
            PassCreateFingerSecondFragment.Companion companion = PassCreateFingerSecondFragment.Companion;
            String valueOf = String.valueOf(selectedReader.getSerialNumber());
            String string = this.this$0.getString(R.string.label_id_fourth_stage_subtitle);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_id_fourth_stage_subtitle)");
            passCreateFingerFirstFragment.nextFragment(companion.start(1, valueOf, string), false);
        }
    }
}
