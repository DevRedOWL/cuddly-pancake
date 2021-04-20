package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.view.View;
import android.widget.CheckBox;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.CheckboxViewHolder$bind$3 */
/* compiled from: CheckboxViewHolder.kt */
final class CheckboxViewHolder$bind$3 implements View.OnClickListener {
    final /* synthetic */ CheckboxViewHolder this$0;

    CheckboxViewHolder$bind$3(CheckboxViewHolder checkboxViewHolder) {
        this.this$0 = checkboxViewHolder;
    }

    public final void onClick(View view) {
        View view2 = this.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        CheckBox checkBox = (CheckBox) view2.findViewById(C5619R.C5622id.cbCheckbox);
        Intrinsics.checkNotNullExpressionValue(checkBox, "itemView.cbCheckbox");
        View view3 = this.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "itemView");
        CheckBox checkBox2 = (CheckBox) view3.findViewById(C5619R.C5622id.cbCheckbox);
        Intrinsics.checkNotNullExpressionValue(checkBox2, "itemView.cbCheckbox");
        checkBox.setChecked(!checkBox2.isChecked());
    }
}
