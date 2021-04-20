package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.text.Html;
import android.text.util.Linkify;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.CheckboxField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/dynamic/CheckboxViewHolder;", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "isRequired", "", "bind", "", "item", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "isValueValid", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.CheckboxViewHolder */
/* compiled from: CheckboxViewHolder.kt */
public final class CheckboxViewHolder extends BaseViewHolder {
    private boolean isRequired;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxViewHolder(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
    }

    public void bind(Field field) {
        Intrinsics.checkNotNullParameter(field, "item");
        this.isRequired = field.getRequired();
        CheckboxField checkboxField = (CheckboxField) field;
        String str = this.isRequired ? "*" : "";
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvCheckboxText);
        Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvCheckboxText");
        textView.setText(Html.fromHtml(checkboxField.getText() + str));
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        ((CheckBox) view2.findViewById(C5619R.C5622id.cbCheckbox)).setOnCheckedChangeListener(new CheckboxViewHolder$bind$1(this, field));
        if (StringsKt.contains$default((CharSequence) checkboxField.getText(), (CharSequence) SVGParser.XML_STYLESHEET_ATTR_HREF, false, 2, (Object) null)) {
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            TextView textView2 = (TextView) view3.findViewById(C5619R.C5622id.tvCheckboxText);
            Intrinsics.checkNotNullExpressionValue(textView2, "itemView.tvCheckboxText");
            textView2.setClickable(true);
            View view4 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "itemView");
            Linkify.addLinks((TextView) view4.findViewById(C5619R.C5622id.tvCheckboxText), 15);
            View view5 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view5, "itemView");
            ((TextView) view5.findViewById(C5619R.C5622id.tvCheckboxText)).setOnClickListener(new CheckboxViewHolder$bind$2(this, checkboxField));
            return;
        }
        View view6 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view6, "itemView");
        ((TextView) view6.findViewById(C5619R.C5622id.tvCheckboxText)).setOnClickListener(new CheckboxViewHolder$bind$3(this));
    }

    /* access modifiers changed from: private */
    public final boolean isValueValid() {
        if (this.isRequired) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            CheckBox checkBox = (CheckBox) view.findViewById(C5619R.C5622id.cbCheckbox);
            Intrinsics.checkNotNullExpressionValue(checkBox, "itemView.cbCheckbox");
            return checkBox.isChecked();
        }
    }
}
