package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/dynamic/PhoneEditViewHolder;", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "isRequired", "", "bind", "", "item", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "isValueValid", "maskFilled", "setTitle", "label", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
@Deprecated(message = "", replaceWith = @ReplaceWith(expression = "EditField", imports = {}))
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.PhoneEditViewHolder */
/* compiled from: PhoneEditViewHolder.kt */
public final class PhoneEditViewHolder extends BaseViewHolder {
    private boolean isRequired;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoneEditViewHolder(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
    }

    public void bind(Field field) {
        Intrinsics.checkNotNullParameter(field, "item");
        this.isRequired = field.getRequired();
    }

    private final void setTitle(String str) {
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(C5619R.C5622id.editLayout);
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "itemView.editLayout");
        if (this.isRequired) {
            str = str + '*';
        }
        textInputLayout.setHint((CharSequence) str);
    }

    private final boolean isValueValid(boolean z) {
        return !this.isRequired || z;
    }
}
