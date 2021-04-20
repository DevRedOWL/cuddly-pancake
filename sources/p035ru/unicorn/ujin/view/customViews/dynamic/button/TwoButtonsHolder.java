package p035ru.unicorn.ujin.view.customViews.dynamic.button;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.TwoButtonsField;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/dynamic/button/TwoButtonsHolder;", "Lru/unicorn/ujin/view/customViews/dynamic/button/BaseButtonHolder;", "itemView", "Landroid/view/View;", "adapter", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "(Landroid/view/View;Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;)V", "bind", "", "item", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.button.TwoButtonsHolder */
/* compiled from: TwoButtonsHolder.kt */
public final class TwoButtonsHolder extends BaseButtonHolder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TwoButtonsHolder(View view, DataEntryAdapter dataEntryAdapter) {
        super(view, dataEntryAdapter);
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(dataEntryAdapter, "adapter");
    }

    public void bind(Field field) {
        Intrinsics.checkNotNullParameter(field, "item");
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) view.findViewById(C5619R.C5622id.leftButton);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "itemView.leftButton");
        TwoButtonsField twoButtonsField = (TwoButtonsField) field;
        bindButton(dynamicBackgroundButton, twoButtonsField.getLeftButton());
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        DynamicBackgroundButton dynamicBackgroundButton2 = (DynamicBackgroundButton) view2.findViewById(C5619R.C5622id.rightButton);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton2, "itemView.rightButton");
        bindButton(dynamicBackgroundButton2, twoButtonsField.getRightButton());
    }
}
