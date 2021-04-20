package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/dynamic/RadioGroupViewHolder;", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "isRequired", "", "bind", "", "item", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "isValueValid", "value", "", "setTitle", "label", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.RadioGroupViewHolder */
/* compiled from: RadioGroupViewHolder.kt */
public final class RadioGroupViewHolder extends BaseViewHolder {
    private boolean isRequired;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadioGroupViewHolder(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bind(p035ru.unicorn.ujin.view.dialogs.dataEntry.Field r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "item"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            boolean r2 = r18.getRequired()
            r0.isRequired = r2
            r2 = r1
            ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField r2 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField) r2
            java.lang.String r3 = r2.getTitle()
            r4 = 1
            java.lang.String r5 = "itemView"
            r6 = 0
            if (r3 == 0) goto L_0x0041
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0026
            r3 = 1
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            if (r3 != r4) goto L_0x0041
            android.view.View r3 = r0.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
            int r7 = p035ru.unicorn.C5619R.C5622id.titleTextView
            android.view.View r3 = r3.findViewById(r7)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r7 = "itemView.titleTextView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
            r7 = 8
            r3.setVisibility(r7)
            goto L_0x0048
        L_0x0041:
            java.lang.String r3 = r2.getTitle()
            r0.setTitle(r3)
        L_0x0048:
            java.util.ArrayList r3 = r2.getSelectValues()
            r7 = 100
            android.view.View r8 = r0.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r5)
            int r9 = p035ru.unicorn.C5619R.C5622id.radioGroup
            android.view.View r8 = r8.findViewById(r9)
            android.widget.RadioGroup r8 = (android.widget.RadioGroup) r8
            r8.removeAllViews()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, r9)
            r8.<init>(r9)
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.Iterator r3 = r3.iterator()
        L_0x0071:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x01fb
            java.lang.Object r9 = r3.next()
            ru.unicorn.ujin.view.dialogs.dataEntry.SelectValue r9 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.SelectValue) r9
            android.view.View r10 = r0.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r5)
            android.content.Context r10 = r10.getContext()
            r11 = 2131558595(0x7f0d00c3, float:1.874251E38)
            r12 = 0
            android.view.View r10 = android.view.View.inflate(r10, r11, r12)
            if (r10 == 0) goto L_0x01f3
            androidx.appcompat.widget.AppCompatRadioButton r10 = (androidx.appcompat.widget.AppCompatRadioButton) r10
            java.lang.String r11 = r9.getValue()
            r10.setTag(r11)
            int r11 = r7 + 1
            r10.setId(r7)
            java.lang.String r7 = r9.getText()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r10.setText(r7)
            java.lang.String r7 = r2.getDefaultValue()
            java.lang.String r13 = r9.getValue()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r13)
            if (r7 == 0) goto L_0x00da
            r10.setChecked(r4)
            kotlin.jvm.functions.Function1 r7 = r17.getOnValueChanged()
            java.lang.String r13 = r9.getValue()
            r7.invoke(r13)
            kotlin.jvm.functions.Function2 r7 = r17.getSetValidFlag()
            java.lang.String r9 = r9.getValue()
            boolean r9 = r0.isValueValid(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            java.lang.String r13 = r18.getName()
            r7.invoke(r9, r13)
        L_0x00da:
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r9 = -1
            r13 = -2
            r7.<init>(r9, r13)
            java.lang.String r9 = r2.getType()
            ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField$Type r13 = p035ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField.Type.INSTANCE
            java.lang.String r13 = r13.getRtl()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r13)
            r13 = 2131165729(0x7f070221, float:1.7945683E38)
            java.lang.String r14 = "itemView.context"
            if (r9 == 0) goto L_0x0191
            android.view.View r9 = r0.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r5)
            android.content.Context r9 = r9.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r14)
            android.content.res.Resources r9 = r9.getResources()
            float r9 = r9.getDimension(r13)
            int r9 = (int) r9
            r7.setMargins(r9, r6, r6, r6)
            android.view.View r9 = r0.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r5)
            android.content.Context r9 = r9.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r14)
            android.content.res.Resources r9 = r9.getResources()
            float r9 = r9.getDimension(r13)
            int r9 = (int) r9
            r10.setPadding(r6, r6, r9, r6)
            android.view.View r9 = r0.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r5)
            android.content.Context r9 = r9.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r14)
            android.content.res.Resources r9 = r9.getResources()
            r15 = 2131099751(0x7f060067, float:1.7811864E38)
            int r9 = r9.getColor(r15)
            r10.setHighlightColor(r9)
            android.graphics.drawable.Drawable r12 = (android.graphics.drawable.Drawable) r12
            r10.setButtonDrawable((android.graphics.drawable.Drawable) r12)
            android.view.View r9 = r0.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r5)
            android.content.Context r9 = r9.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r14)
            android.content.res.Resources$Theme r9 = r9.getTheme()
            r12 = 2131951634(0x7f130012, float:1.9539688E38)
            int[] r15 = new int[r4]
            r13 = 0
        L_0x015b:
            if (r13 >= r4) goto L_0x0165
            r16 = 16843289(0x1010219, float:2.3695063E-38)
            r15[r13] = r16
            int r13 = r13 + 1
            goto L_0x015b
        L_0x0165:
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r12, r15)
            java.lang.String r12 = "itemView.context.theme.o…tChoiceIndicatorSingle })"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r12)
            int r9 = r9.getResourceId(r6, r6)
            r10.setCompoundDrawablesRelativeWithIntrinsicBounds(r6, r6, r9, r6)
            android.view.View r9 = r0.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r5)
            android.content.Context r9 = r9.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r14)
            android.content.res.Resources r9 = r9.getResources()
            r12 = 2131165729(0x7f070221, float:1.7945683E38)
            float r9 = r9.getDimension(r12)
            int r9 = (int) r9
            r10.setCompoundDrawablePadding(r9)
            goto L_0x01c1
        L_0x0191:
            r12 = 2131165729(0x7f070221, float:1.7945683E38)
            android.view.View r9 = r0.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r5)
            android.content.Context r9 = r9.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r14)
            android.content.res.Resources r9 = r9.getResources()
            float r9 = r9.getDimension(r12)
            int r9 = (int) r9
            android.view.View r13 = r0.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r5)
            android.content.Context r13 = r13.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r14)
            android.content.res.Resources r13 = r13.getResources()
            float r12 = r13.getDimension(r12)
            int r12 = (int) r12
            r7.setMargins(r9, r6, r12, r6)
        L_0x01c1:
            java.lang.String r9 = r2.getStyle()
            ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField$Style r12 = p035ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField.Style.INSTANCE
            java.lang.String r12 = r12.getUnderlined()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r12)
            if (r9 == 0) goto L_0x01d7
            r9 = 2131231635(0x7f080393, float:1.8079357E38)
            r10.setBackgroundResource(r9)
        L_0x01d7:
            android.view.View r9 = r0.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r5)
            int r12 = p035ru.unicorn.C5619R.C5622id.radioGroup
            android.view.View r9 = r9.findViewById(r12)
            android.widget.RadioGroup r9 = (android.widget.RadioGroup) r9
            android.view.View r10 = (android.view.View) r10
            android.view.ViewGroup$LayoutParams r7 = (android.view.ViewGroup.LayoutParams) r7
            r9.addView(r10, r7)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            r8.add(r7)
            r7 = r11
            goto L_0x0071
        L_0x01f3:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatRadioButton"
            r1.<init>(r2)
            throw r1
        L_0x01fb:
            java.util.List r8 = (java.util.List) r8
            android.view.View r2 = r0.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            int r3 = p035ru.unicorn.C5619R.C5622id.radioGroup
            android.view.View r2 = r2.findViewById(r3)
            android.widget.RadioGroup r2 = (android.widget.RadioGroup) r2
            ru.unicorn.ujin.view.customViews.dynamic.RadioGroupViewHolder$bind$2 r3 = new ru.unicorn.ujin.view.customViews.dynamic.RadioGroupViewHolder$bind$2
            r3.<init>(r0, r1)
            android.widget.RadioGroup$OnCheckedChangeListener r3 = (android.widget.RadioGroup.OnCheckedChangeListener) r3
            r2.setOnCheckedChangeListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.customViews.dynamic.RadioGroupViewHolder.bind(ru.unicorn.ujin.view.dialogs.dataEntry.Field):void");
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
        return !this.isRequired || (StringsKt.isBlank(str) ^ true);
    }
}
