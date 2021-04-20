package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.customViews.dynamic.button.DynamicFormViewModel;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ApiValues;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.SelectField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.SelectValue;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\u0012\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8FX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/dynamic/SpinnerViewHolder;", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "defaultValueId", "", "isRequired", "", "viewModel", "Lru/unicorn/ujin/view/customViews/dynamic/button/DynamicFormViewModel;", "getViewModel", "()Lru/unicorn/ujin/view/customViews/dynamic/button/DynamicFormViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bind", "", "item", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "initValues", "field", "Lru/unicorn/ujin/view/dialogs/dataEntry/SelectField;", "isValueValid", "value", "setTitle", "label", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.SpinnerViewHolder */
/* compiled from: SpinnerViewHolder.kt */
public final class SpinnerViewHolder extends BaseViewHolder {
    private final String defaultValueId = "-100";
    private boolean isRequired;
    private final Lazy viewModel$delegate;

    public final DynamicFormViewModel getViewModel() {
        return (DynamicFormViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpinnerViewHolder(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
        this.viewModel$delegate = LazyKt.lazy(new SpinnerViewHolder$viewModel$2(view));
    }

    public void bind(Field field) {
        String url;
        Intrinsics.checkNotNullParameter(field, "item");
        this.isRequired = field.getRequired();
        SelectField selectField = (SelectField) field;
        setTitle(selectField.getTitle());
        ArrayList<SelectValue> selectValues = selectField.getSelectValues();
        String hint = selectField.getHint();
        if (hint != null) {
            if (hint.length() > 0) {
                String str = this.defaultValueId;
                String hint2 = selectField.getHint();
                Intrinsics.checkNotNull(hint2);
                selectValues.add(0, new SelectValue(str, hint2));
            }
        }
        if (selectValues.size() > 0) {
            initValues(selectField);
        } else {
            ApiValues apiValues = selectField.getApiValues();
            if (!(apiValues == null || (url = apiValues.getUrl()) == null || url.length() <= 0)) {
            }
        }
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        Spinner spinner = (Spinner) view.findViewById(C5619R.C5622id.spinner);
        Intrinsics.checkNotNullExpressionValue(spinner, "itemView.spinner");
        spinner.setOnItemSelectedListener(new SpinnerViewHolder$bind$$inlined$also$lambda$1(selectValues, this, field));
    }

    private final void initValues(SelectField selectField) {
        ArrayList arrayList = new ArrayList();
        SelectValue selectValue = null;
        int size = selectField.getSelectValues().size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            SelectValue selectValue2 = selectField.getSelectValues().get(i2);
            Intrinsics.checkNotNullExpressionValue(selectValue2, "field.selectValues[i]");
            SelectValue selectValue3 = selectValue2;
            arrayList.add(selectValue3.getText());
            if (Intrinsics.areEqual((Object) selectValue3.getValue(), (Object) selectField.getDefaultValue())) {
                i = i2;
                selectValue = selectValue3;
            }
        }
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        ArrayAdapter arrayAdapter = new ArrayAdapter(view.getContext(), R.layout.field_spinner_view, arrayList);
        arrayAdapter.setDropDownViewResource(17367058);
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        Spinner spinner = (Spinner) view2.findViewById(C5619R.C5622id.spinner);
        Intrinsics.checkNotNullExpressionValue(spinner, "itemView.spinner");
        spinner.setAdapter(arrayAdapter);
        if (selectValue != null) {
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            ((Spinner) view3.findViewById(C5619R.C5622id.spinner)).setSelection(i);
            getOnValueChanged().invoke(selectValue.getValue());
            getSetValidFlag().invoke(Boolean.valueOf(isValueValid(selectValue.getValue())), selectField.getName());
        }
    }

    private final void setTitle(String str) {
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        TextView textView = (TextView) view.findViewById(C5619R.C5622id.titleTextView);
        Intrinsics.checkNotNullExpressionValue(textView, "itemView.titleTextView");
        if (this.isRequired) {
            str = str + '*';
        }
        textView.setText(str);
    }

    /* access modifiers changed from: private */
    public final boolean isValueValid(String str) {
        if (this.isRequired) {
            CharSequence charSequence = str;
            if (!(charSequence.length() > 0)) {
                if (!this.isRequired) {
                    return false;
                }
                if (!(charSequence.length() > 0) || !(!Intrinsics.areEqual((Object) str, (Object) this.defaultValueId))) {
                    return false;
                }
            }
        }
        return true;
    }
}
