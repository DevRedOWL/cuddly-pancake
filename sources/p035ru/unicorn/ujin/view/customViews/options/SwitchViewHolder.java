package p035ru.unicorn.ujin.view.customViews.options;

import android.view.View;
import android.widget.Switch;
import androidx.fragment.app.DialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.dialogs.dialogOptions.OptionsItem;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/options/SwitchViewHolder;", "Lru/unicorn/ujin/view/customViews/options/BaseOptionsViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "Lru/unicorn/ujin/view/dialogs/dialogOptions/OptionsItem;", "dialogFragment", "Landroidx/fragment/app/DialogFragment;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.options.SwitchViewHolder */
/* compiled from: SwitchViewHolder.kt */
public final class SwitchViewHolder extends BaseOptionsViewHolder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchViewHolder(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
    }

    public void bind(OptionsItem optionsItem, DialogFragment dialogFragment) {
        Intrinsics.checkNotNullParameter(optionsItem, "item");
        Intrinsics.checkNotNullParameter(dialogFragment, "dialogFragment");
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        Switch switchR = (Switch) view.findViewById(C5619R.C5622id.tvSwitch);
        Intrinsics.checkNotNullExpressionValue(switchR, "itemView.tvSwitch");
        switchR.setText(optionsItem.getLabel());
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        Switch switchR2 = (Switch) view2.findViewById(C5619R.C5622id.tvSwitch);
        Intrinsics.checkNotNullExpressionValue(switchR2, "itemView.tvSwitch");
        switchR2.setChecked(Boolean.parseBoolean(optionsItem.getDefaultValue()));
        View view3 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "itemView");
        ((Switch) view3.findViewById(C5619R.C5622id.tvSwitch)).setOnCheckedChangeListener(new SwitchViewHolder$bind$1(optionsItem));
    }
}
