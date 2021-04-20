package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.FragmentPassBleZeroBinding;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "reader", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassCreateBleZeroFragment$onViewCreated$2 */
/* compiled from: PassCreateBleZeroFragment.kt */
final class PassCreateBleZeroFragment$onViewCreated$2 implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ PassCreateBleZeroFragment this$0;

    PassCreateBleZeroFragment$onViewCreated$2(PassCreateBleZeroFragment passCreateBleZeroFragment) {
        this.this$0 = passCreateBleZeroFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        PassCreateBleZeroFragment passCreateBleZeroFragment = this.this$0;
        CheckBox checkBox = ((FragmentPassBleZeroBinding) passCreateBleZeroFragment.getViewDataBinding()).cbQr;
        Intrinsics.checkNotNullExpressionValue(checkBox, "viewDataBinding.cbQr");
        checkBox.setChecked(!z);
        DynamicBackgroundButton dynamicBackgroundButton = ((FragmentPassBleZeroBinding) passCreateBleZeroFragment.getViewDataBinding()).addBle;
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "viewDataBinding.addBle");
        dynamicBackgroundButton.setText(passCreateBleZeroFragment.getString(R.string.button_next));
        TextView textView = ((FragmentPassBleZeroBinding) passCreateBleZeroFragment.getViewDataBinding()).comment;
        Intrinsics.checkNotNullExpressionValue(textView, "viewDataBinding.comment");
        textView.setText(passCreateBleZeroFragment.getString(R.string.label_ble_reader_));
    }
}
