package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\u00020\u0001:\u0001+B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0010\u0010'\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0012\u0010(\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010*\u001a\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR5\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R5\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00100\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006,"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/dynamic/EditViewHolder;", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "isRequired", "", "isValid", "()Z", "setValid", "(Z)V", "onTextChangedListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "maskFilled", "", "getOnTextChangedListener", "()Lkotlin/jvm/functions/Function1;", "setOnTextChangedListener", "(Lkotlin/jvm/functions/Function1;)V", "onTextCompletedListener", "", "value", "getOnTextCompletedListener", "setOnTextCompletedListener", "passwordIsVisible", "getPasswordIsVisible", "setPasswordIsVisible", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "bind", "item", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "handleEyeClick", "event", "Landroid/view/MotionEvent;", "isValueValid", "setTitle", "label", "togglePasswordVisibility", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.EditViewHolder */
/* compiled from: EditViewHolder.kt */
public final class EditViewHolder extends BaseViewHolder {
    public static final String AFFINE_INPUT_PHONE_MASK = "8 ([000]) [000]-[00]-[00]";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String INPUT_PHONE_MASK = "+7 ([000]) [000]-[00]-[00]";
    private boolean isRequired;
    private boolean isValid;
    private Function1<? super Boolean, Unit> onTextChangedListener = EditViewHolder$onTextChangedListener$1.INSTANCE;
    private Function1<? super String, Unit> onTextCompletedListener = EditViewHolder$onTextCompletedListener$1.INSTANCE;
    private boolean passwordIsVisible;
    private String value = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditViewHolder(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }

    public final Function1<String, Unit> getOnTextCompletedListener() {
        return this.onTextCompletedListener;
    }

    public final void setOnTextCompletedListener(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onTextCompletedListener = function1;
    }

    public final Function1<Boolean, Unit> getOnTextChangedListener() {
        return this.onTextChangedListener;
    }

    public final void setOnTextChangedListener(Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onTextChangedListener = function1;
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public final void setValid(boolean z) {
        this.isValid = z;
    }

    public final boolean getPasswordIsVisible() {
        return this.passwordIsVisible;
    }

    public final void setPasswordIsVisible(boolean z) {
        this.passwordIsVisible = z;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bind(p035ru.unicorn.ujin.view.dialogs.dataEntry.Field r12) {
        /*
            r11 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            android.view.View r0 = r11.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r2 = p035ru.unicorn.C5619R.C5622id.editText
            android.view.View r0 = r0.findViewById(r2)
            com.google.android.material.textfield.TextInputEditText r0 = (com.google.android.material.textfield.TextInputEditText) r0
            ru.unicorn.ujin.view.customViews.dynamic.EditViewHolder$bind$1 r2 = new ru.unicorn.ujin.view.customViews.dynamic.EditViewHolder$bind$1
            r2.<init>(r11, r12)
            android.text.TextWatcher r2 = (android.text.TextWatcher) r2
            r0.addTextChangedListener(r2)
            boolean r0 = r12 instanceof p035ru.unicorn.ujin.view.dialogs.dataEntry.EditField
            if (r0 == 0) goto L_0x0398
            r0 = r12
            ru.unicorn.ujin.view.dialogs.dataEntry.EditField r0 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.EditField) r0
            boolean r2 = r12.getRequired()
            r11.isRequired = r2
            java.lang.String r2 = r0.getHint()
            r11.setTitle(r2)
            java.lang.String r2 = r0.getInputTypeString()
            r3 = 0
            java.lang.String r4 = "itemView.editText"
            if (r2 != 0) goto L_0x003d
            goto L_0x01b1
        L_0x003d:
            int r5 = r2.hashCode()
            switch(r5) {
                case -1206239059: goto L_0x0180;
                case 3373707: goto L_0x0162;
                case 3556653: goto L_0x0144;
                case 106642798: goto L_0x00f5;
                case 1015825813: goto L_0x0091;
                case 1216985755: goto L_0x0046;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x01b1
        L_0x0046:
            java.lang.String r5 = "password"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x01b1
            r11.passwordIsVisible = r3
            android.view.View r2 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            int r5 = p035ru.unicorn.C5619R.C5622id.editText
            android.view.View r2 = r2.findViewById(r5)
            com.google.android.material.textfield.TextInputEditText r2 = (com.google.android.material.textfield.TextInputEditText) r2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r5 = 129(0x81, float:1.81E-43)
            r2.setInputType(r5)
            android.view.View r2 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            int r5 = p035ru.unicorn.C5619R.C5622id.editText
            android.view.View r2 = r2.findViewById(r5)
            com.google.android.material.textfield.TextInputEditText r2 = (com.google.android.material.textfield.TextInputEditText) r2
            r5 = 2131231127(0x7f080197, float:1.8078326E38)
            r2.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r5, r3)
            android.view.View r2 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            int r5 = p035ru.unicorn.C5619R.C5622id.editText
            android.view.View r2 = r2.findViewById(r5)
            com.google.android.material.textfield.TextInputEditText r2 = (com.google.android.material.textfield.TextInputEditText) r2
            ru.unicorn.ujin.view.customViews.dynamic.EditViewHolder$bind$$inlined$also$lambda$2 r5 = new ru.unicorn.ujin.view.customViews.dynamic.EditViewHolder$bind$$inlined$also$lambda$2
            r5.<init>(r11, r12)
            android.view.View$OnTouchListener r5 = (android.view.View.OnTouchListener) r5
            r2.setOnTouchListener(r5)
            goto L_0x01c6
        L_0x0091:
            java.lang.String r5 = "vehicleNumber"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x01b1
            kotlin.jvm.functions.Function2 r2 = r0.getSetupVehicleKeyboard()
            if (r2 == 0) goto L_0x00c7
            android.view.View r5 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            int r6 = p035ru.unicorn.C5619R.C5622id.editText
            android.view.View r5 = r5.findViewById(r6)
            com.google.android.material.textfield.TextInputEditText r5 = (com.google.android.material.textfield.TextInputEditText) r5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            android.view.View r6 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            int r7 = p035ru.unicorn.C5619R.C5622id.hint
            android.view.View r6 = r6.findViewById(r7)
            android.widget.EditText r6 = (android.widget.EditText) r6
            java.lang.String r7 = "itemView.hint"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            java.lang.Object r2 = r2.invoke(r5, r6)
            kotlin.Unit r2 = (kotlin.Unit) r2
        L_0x00c7:
            android.view.View r2 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            int r5 = p035ru.unicorn.C5619R.C5622id.checkboxDifferentVehicleType
            android.view.View r2 = r2.findViewById(r5)
            android.widget.CheckBox r2 = (android.widget.CheckBox) r2
            java.lang.String r5 = "itemView.checkboxDifferentVehicleType"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            r2.setVisibility(r3)
            android.view.View r2 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            int r5 = p035ru.unicorn.C5619R.C5622id.checkboxDifferentVehicleType
            android.view.View r2 = r2.findViewById(r5)
            android.widget.CheckBox r2 = (android.widget.CheckBox) r2
            ru.unicorn.ujin.view.customViews.dynamic.EditViewHolder$bind$$inlined$also$lambda$3 r5 = new ru.unicorn.ujin.view.customViews.dynamic.EditViewHolder$bind$$inlined$also$lambda$3
            r5.<init>(r11, r12)
            android.widget.CompoundButton$OnCheckedChangeListener r5 = (android.widget.CompoundButton.OnCheckedChangeListener) r5
            r2.setOnCheckedChangeListener(r5)
            goto L_0x01c6
        L_0x00f5:
            java.lang.String r5 = "phone"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x01b1
            android.view.View r2 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            int r5 = p035ru.unicorn.C5619R.C5622id.editText
            android.view.View r2 = r2.findViewById(r5)
            com.google.android.material.textfield.TextInputEditText r2 = (com.google.android.material.textfield.TextInputEditText) r2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r5 = 3
            r2.setInputType(r5)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r8 = r2
            java.util.List r8 = (java.util.List) r8
            java.lang.String r2 = "8 ([000]) [000]-[00]-[00]"
            r8.add(r2)
            com.redmadrobot.inputmask.MaskedTextChangedListener$Companion r5 = com.redmadrobot.inputmask.MaskedTextChangedListener.Companion
            android.view.View r2 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            int r6 = p035ru.unicorn.C5619R.C5622id.editText
            android.view.View r2 = r2.findViewById(r6)
            com.google.android.material.textfield.TextInputEditText r2 = (com.google.android.material.textfield.TextInputEditText) r2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r6 = r2
            android.widget.EditText r6 = (android.widget.EditText) r6
            com.redmadrobot.inputmask.helper.AffinityCalculationStrategy r9 = com.redmadrobot.inputmask.helper.AffinityCalculationStrategy.PREFIX
            ru.unicorn.ujin.view.customViews.dynamic.EditViewHolder$bind$$inlined$also$lambda$1 r2 = new ru.unicorn.ujin.view.customViews.dynamic.EditViewHolder$bind$$inlined$also$lambda$1
            r2.<init>(r11, r12)
            r10 = r2
            com.redmadrobot.inputmask.MaskedTextChangedListener$ValueListener r10 = (com.redmadrobot.inputmask.MaskedTextChangedListener.ValueListener) r10
            java.lang.String r7 = "+7 ([000]) [000]-[00]-[00]"
            r5.installOn(r6, r7, r8, r9, r10)
            goto L_0x01c6
        L_0x0144:
            java.lang.String r5 = "text"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x01b1
            android.view.View r2 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            int r5 = p035ru.unicorn.C5619R.C5622id.editText
            android.view.View r2 = r2.findViewById(r5)
            com.google.android.material.textfield.TextInputEditText r2 = (com.google.android.material.textfield.TextInputEditText) r2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r5 = 16384(0x4000, float:2.2959E-41)
            r2.setInputType(r5)
            goto L_0x01c6
        L_0x0162:
            java.lang.String r5 = "name"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x01b1
            android.view.View r2 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            int r5 = p035ru.unicorn.C5619R.C5622id.editText
            android.view.View r2 = r2.findViewById(r5)
            com.google.android.material.textfield.TextInputEditText r2 = (com.google.android.material.textfield.TextInputEditText) r2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r5 = 8192(0x2000, float:1.14794E-41)
            r2.setInputType(r5)
            goto L_0x01c6
        L_0x0180:
            java.lang.String r5 = "multiline"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x01b1
            android.view.View r2 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            int r5 = p035ru.unicorn.C5619R.C5622id.editText
            android.view.View r2 = r2.findViewById(r5)
            com.google.android.material.textfield.TextInputEditText r2 = (com.google.android.material.textfield.TextInputEditText) r2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r2.setSingleLine(r3)
            android.view.View r2 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            int r5 = p035ru.unicorn.C5619R.C5622id.editText
            android.view.View r2 = r2.findViewById(r5)
            com.google.android.material.textfield.TextInputEditText r2 = (com.google.android.material.textfield.TextInputEditText) r2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r2.setImeOptions(r5)
            goto L_0x01c6
        L_0x01b1:
            android.view.View r2 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            int r5 = p035ru.unicorn.C5619R.C5622id.editText
            android.view.View r2 = r2.findViewById(r5)
            com.google.android.material.textfield.TextInputEditText r2 = (com.google.android.material.textfield.TextInputEditText) r2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r5 = 524288(0x80000, float:7.34684E-40)
            r2.setInputType(r5)
        L_0x01c6:
            java.lang.String r2 = r0.getValue()
            if (r2 != 0) goto L_0x01ce
            goto L_0x0338
        L_0x01ce:
            int r5 = r2.hashCode()
            switch(r5) {
                case -542721757: goto L_0x030f;
                case 784200674: goto L_0x02e6;
                case 807749953: goto L_0x02bd;
                case 1118474671: goto L_0x0293;
                case 1173703657: goto L_0x022b;
                case 1174587553: goto L_0x0201;
                case 2112232050: goto L_0x01d7;
                default: goto L_0x01d5;
            }
        L_0x01d5:
            goto L_0x0338
        L_0x01d7:
            java.lang.String r3 = "@{profile.name}"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0338
            android.view.View r0 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r2 = p035ru.unicorn.C5619R.C5622id.editText
            android.view.View r0 = r0.findViewById(r2)
            com.google.android.material.textfield.TextInputEditText r0 = (com.google.android.material.textfield.TextInputEditText) r0
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository$Companion r2 = p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository.Companion
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository r2 = r2.getInstance()
            ru.unicorn.ujin.data.realm.profile.User r2 = r2.getUser()
            java.lang.String r2 = r2.getName()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            goto L_0x034e
        L_0x0201:
            java.lang.String r3 = "@{profile.patronymic}"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0338
            android.view.View r0 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r2 = p035ru.unicorn.C5619R.C5622id.editText
            android.view.View r0 = r0.findViewById(r2)
            com.google.android.material.textfield.TextInputEditText r0 = (com.google.android.material.textfield.TextInputEditText) r0
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository$Companion r2 = p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository.Companion
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository r2 = r2.getInstance()
            ru.unicorn.ujin.data.realm.profile.User r2 = r2.getUser()
            java.lang.String r2 = r2.getPatronymic()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            goto L_0x034e
        L_0x022b:
            java.lang.String r5 = "@{profile.address}"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0338
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository$Companion r0 = p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository.Companion
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository r0 = r0.getInstance()
            ru.unicorn.ujin.data.realm.profile.User r0 = r0.getUser()
            android.view.View r2 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            int r5 = p035ru.unicorn.C5619R.C5622id.editText
            android.view.View r2 = r2.findViewById(r5)
            com.google.android.material.textfield.TextInputEditText r2 = (com.google.android.material.textfield.TextInputEditText) r2
            java.util.List r5 = r0.combineList()
            if (r5 == 0) goto L_0x028b
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r5 = r5.iterator()
        L_0x025d:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x027c
            java.lang.Object r7 = r5.next()
            r8 = r7
            ru.unicorn.ujin.data.realm.profile.Apartment r8 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r8
            java.lang.String r8 = r8.getUserToken()
            java.lang.String r9 = r0.getToken()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r8 == 0) goto L_0x025d
            r6.add(r7)
            goto L_0x025d
        L_0x027c:
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r0 = r6.get(r3)
            ru.unicorn.ujin.data.realm.profile.Apartment r0 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r0
            if (r0 == 0) goto L_0x028b
            java.lang.String r0 = r0.getTitle()
            goto L_0x028c
        L_0x028b:
            r0 = 0
        L_0x028c:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setText(r0)
            goto L_0x034e
        L_0x0293:
            java.lang.String r3 = "@{profile.phone}"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0338
            android.view.View r0 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r2 = p035ru.unicorn.C5619R.C5622id.editText
            android.view.View r0 = r0.findViewById(r2)
            com.google.android.material.textfield.TextInputEditText r0 = (com.google.android.material.textfield.TextInputEditText) r0
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository$Companion r2 = p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository.Companion
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository r2 = r2.getInstance()
            ru.unicorn.ujin.data.realm.profile.User r2 = r2.getUser()
            java.lang.String r2 = r2.getPhone()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            goto L_0x034e
        L_0x02bd:
            java.lang.String r3 = "@{profile.email}"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0338
            android.view.View r0 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r2 = p035ru.unicorn.C5619R.C5622id.editText
            android.view.View r0 = r0.findViewById(r2)
            com.google.android.material.textfield.TextInputEditText r0 = (com.google.android.material.textfield.TextInputEditText) r0
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository$Companion r2 = p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository.Companion
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository r2 = r2.getInstance()
            ru.unicorn.ujin.data.realm.profile.User r2 = r2.getUser()
            java.lang.String r2 = r2.getEmail()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            goto L_0x034e
        L_0x02e6:
            java.lang.String r3 = "@{profile.surname}"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0338
            android.view.View r0 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r2 = p035ru.unicorn.C5619R.C5622id.editText
            android.view.View r0 = r0.findViewById(r2)
            com.google.android.material.textfield.TextInputEditText r0 = (com.google.android.material.textfield.TextInputEditText) r0
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository$Companion r2 = p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository.Companion
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository r2 = r2.getInstance()
            ru.unicorn.ujin.data.realm.profile.User r2 = r2.getUser()
            java.lang.String r2 = r2.getSurname()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            goto L_0x034e
        L_0x030f:
            java.lang.String r3 = "@{profile.fullName}"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0338
            android.view.View r0 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r2 = p035ru.unicorn.C5619R.C5622id.editText
            android.view.View r0 = r0.findViewById(r2)
            com.google.android.material.textfield.TextInputEditText r0 = (com.google.android.material.textfield.TextInputEditText) r0
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository$Companion r2 = p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository.Companion
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository r2 = r2.getInstance()
            ru.unicorn.ujin.data.realm.profile.User r2 = r2.getUser()
            java.lang.String r2 = r2.getFullName()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            goto L_0x034e
        L_0x0338:
            android.view.View r2 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            int r3 = p035ru.unicorn.C5619R.C5622id.editText
            android.view.View r2 = r2.findViewById(r3)
            com.google.android.material.textfield.TextInputEditText r2 = (com.google.android.material.textfield.TextInputEditText) r2
            java.lang.String r0 = r0.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setText(r0)
        L_0x034e:
            kotlin.jvm.functions.Function1 r0 = r11.getOnValueChanged()
            android.view.View r2 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            int r3 = p035ru.unicorn.C5619R.C5622id.editText
            android.view.View r2 = r2.findViewById(r3)
            com.google.android.material.textfield.TextInputEditText r2 = (com.google.android.material.textfield.TextInputEditText) r2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.invoke(r2)
            kotlin.jvm.functions.Function2 r0 = r11.getSetValidFlag()
            android.view.View r2 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            int r1 = p035ru.unicorn.C5619R.C5622id.editText
            android.view.View r1 = r2.findViewById(r1)
            com.google.android.material.textfield.TextInputEditText r1 = (com.google.android.material.textfield.TextInputEditText) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r1 = r11.isValueValid(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r12 = r12.getName()
            r0.invoke(r1, r12)
        L_0x0398:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.customViews.dynamic.EditViewHolder.bind(ru.unicorn.ujin.view.dialogs.dataEntry.Field):void");
    }

    /* access modifiers changed from: private */
    public final boolean handleEyeClick(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getAction() != 1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(C5619R.C5622id.editText);
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "itemView.editText");
        int right = textInputEditText.getRight();
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        TextInputEditText textInputEditText2 = (TextInputEditText) view2.findViewById(C5619R.C5622id.editText);
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "itemView.editText");
        Drawable drawable = textInputEditText2.getCompoundDrawables()[2];
        Intrinsics.checkNotNullExpressionValue(drawable, "itemView.editText.compoundDrawables[2]");
        if (rawX < ((float) (right - drawable.getBounds().width()))) {
            return false;
        }
        togglePasswordVisibility();
        return true;
    }

    private final void togglePasswordVisibility() {
        if (this.passwordIsVisible) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(C5619R.C5622id.editText);
            Intrinsics.checkNotNullExpressionValue(textInputEditText, "itemView.editText");
            textInputEditText.setInputType(129);
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            ((TextInputEditText) view2.findViewById(C5619R.C5622id.editText)).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.eye_icon, 0);
        } else {
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            TextInputEditText textInputEditText2 = (TextInputEditText) view3.findViewById(C5619R.C5622id.editText);
            Intrinsics.checkNotNullExpressionValue(textInputEditText2, "itemView.editText");
            textInputEditText2.setInputType(524288);
            View view4 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "itemView");
            ((TextInputEditText) view4.findViewById(C5619R.C5622id.editText)).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.eye_active_icon, 0);
        }
        this.passwordIsVisible = !this.passwordIsVisible;
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

    /* access modifiers changed from: private */
    public final boolean isValueValid(String str) {
        return !this.isRequired || (StringsKt.isBlank(str) ^ true);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/dynamic/EditViewHolder$Companion;", "", "()V", "AFFINE_INPUT_PHONE_MASK", "", "INPUT_PHONE_MASK", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.customViews.dynamic.EditViewHolder$Companion */
    /* compiled from: EditViewHolder.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
