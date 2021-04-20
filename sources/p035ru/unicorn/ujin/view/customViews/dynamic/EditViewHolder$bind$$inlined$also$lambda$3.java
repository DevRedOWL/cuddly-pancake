package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.EditField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, mo51343d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged", "ru/unicorn/ujin/view/customViews/dynamic/EditViewHolder$bind$2$3"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.EditViewHolder$bind$$inlined$also$lambda$3 */
/* compiled from: EditViewHolder.kt */
final class EditViewHolder$bind$$inlined$also$lambda$3 implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ Field $item$inlined;
    final /* synthetic */ EditViewHolder this$0;

    EditViewHolder$bind$$inlined$also$lambda$3(EditViewHolder editViewHolder, Field field) {
        this.this$0 = editViewHolder;
        this.$item$inlined = field;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        View view = this.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        ((TextInputEditText) view.findViewById(C5619R.C5622id.editText)).setText("");
        if (z) {
            Function1<EditText, Unit> disableVehicleKeyboard = ((EditField) this.$item$inlined).getDisableVehicleKeyboard();
            if (disableVehicleKeyboard != null) {
                View view2 = this.this$0.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                TextInputEditText textInputEditText = (TextInputEditText) view2.findViewById(C5619R.C5622id.editText);
                Intrinsics.checkNotNullExpressionValue(textInputEditText, "itemView.editText");
                Unit invoke = disableVehicleKeyboard.invoke(textInputEditText);
                return;
            }
            return;
        }
        Function2<EditText, EditText, Unit> setupVehicleKeyboard = ((EditField) this.$item$inlined).getSetupVehicleKeyboard();
        if (setupVehicleKeyboard != null) {
            View view3 = this.this$0.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            TextInputEditText textInputEditText2 = (TextInputEditText) view3.findViewById(C5619R.C5622id.editText);
            Intrinsics.checkNotNullExpressionValue(textInputEditText2, "itemView.editText");
            View view4 = this.this$0.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "itemView");
            EditText editText = (EditText) view4.findViewById(C5619R.C5622id.hint);
            Intrinsics.checkNotNullExpressionValue(editText, "itemView.hint");
            Unit invoke2 = setupVehicleKeyboard.invoke(textInputEditText2, editText);
        }
    }
}
