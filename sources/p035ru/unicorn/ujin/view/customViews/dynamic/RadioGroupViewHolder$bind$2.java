package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.view.View;
import android.widget.RadioGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "group", "Landroid/widget/RadioGroup;", "kotlin.jvm.PlatformType", "checkedId", "", "onCheckedChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.RadioGroupViewHolder$bind$2 */
/* compiled from: RadioGroupViewHolder.kt */
final class RadioGroupViewHolder$bind$2 implements RadioGroup.OnCheckedChangeListener {
    final /* synthetic */ Field $item;
    final /* synthetic */ RadioGroupViewHolder this$0;

    RadioGroupViewHolder$bind$2(RadioGroupViewHolder radioGroupViewHolder, Field field) {
        this.this$0 = radioGroupViewHolder;
        this.$item = field;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        View findViewById = radioGroup.findViewById(i);
        Intrinsics.checkNotNullExpressionValue(findViewById, "group.findViewById<View>(checkedId)");
        String obj = findViewById.getTag().toString();
        this.this$0.getOnValueChanged().invoke(obj);
        this.this$0.getSetValidFlag().invoke(Boolean.valueOf(this.this$0.isValueValid(obj)), this.$item.getName());
    }
}
