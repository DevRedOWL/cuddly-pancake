package p035ru.unicorn.ujin.view.customViews.dynamic;

import com.redmadrobot.inputmask.MaskedTextChangedListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t¸\u0006\u0000"}, mo51343d2 = {"ru/unicorn/ujin/view/customViews/dynamic/EditViewHolder$bind$2$1", "Lcom/redmadrobot/inputmask/MaskedTextChangedListener$ValueListener;", "onTextChanged", "", "maskFilled", "", "extractedValue", "", "formattedValue", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.EditViewHolder$bind$$inlined$also$lambda$1 */
/* compiled from: EditViewHolder.kt */
public final class EditViewHolder$bind$$inlined$also$lambda$1 implements MaskedTextChangedListener.ValueListener {
    final /* synthetic */ Field $item$inlined;
    final /* synthetic */ EditViewHolder this$0;

    EditViewHolder$bind$$inlined$also$lambda$1(EditViewHolder editViewHolder, Field field) {
        this.this$0 = editViewHolder;
        this.$item$inlined = field;
    }

    public void onTextChanged(boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "extractedValue");
        Intrinsics.checkNotNullParameter(str2, "formattedValue");
        if (z) {
            EditViewHolder editViewHolder = this.this$0;
            editViewHolder.setValue('7' + str);
            this.this$0.getOnTextCompletedListener().invoke(str);
        } else {
            this.this$0.setValue("");
        }
        this.this$0.setValid(z);
        this.this$0.getOnTextChangedListener().invoke(Boolean.valueOf(z));
    }
}
