package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import kotlin.Metadata;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragment$onViewCreated$19 */
/* compiled from: AnotherPassNewFragment.kt */
final class AnotherPassNewFragment$onViewCreated$19 implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ AnotherPassNewFragment this$0;

    AnotherPassNewFragment$onViewCreated$19(AnotherPassNewFragment anotherPassNewFragment) {
        this.this$0 = anotherPassNewFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        View findViewById = this.this$0._$_findCachedViewById(C5619R.C5622id.data19).findViewById(R.id.value);
        if (findViewById != null) {
            ((EditText) findViewById).setText("");
            if (z) {
                this.this$0.getBaseActivity().removeEditTextFromVehicleMask((EditText) this.this$0._$_findCachedViewById(C5619R.C5622id.data19).findViewById(R.id.value));
            } else {
                this.this$0.getBaseActivity().addEditTextToVehicleMask((EditText) this.this$0._$_findCachedViewById(C5619R.C5622id.data19).findViewById(R.id.value), (EditText) this.this$0._$_findCachedViewById(C5619R.C5622id.data19).findViewById(R.id.hint));
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.EditText");
        }
    }
}
