package p035ru.unicorn.ujin.view.customViews.options;

import android.widget.CompoundButton;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.dialogs.dialogOptions.OptionsItem;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "checked", "", "onCheckedChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.options.SwitchViewHolder$bind$1 */
/* compiled from: SwitchViewHolder.kt */
final class SwitchViewHolder$bind$1 implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ OptionsItem $item;

    SwitchViewHolder$bind$1(OptionsItem optionsItem) {
        this.$item = optionsItem;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.$item.getClickListener().invoke(Boolean.valueOf(z));
    }
}
