package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments;

import android.view.View;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassThirdFragment$showToolbar$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassThirdFragment$showToolbar$$inlined$apply$lambda$1 */
/* compiled from: AnotherPassThirdFragment.kt */
final class AnotherPassThirdFragment$showToolbar$$inlined$apply$lambda$1 implements View.OnClickListener {
    final /* synthetic */ AnotherPassThirdFragment this$0;

    AnotherPassThirdFragment$showToolbar$$inlined$apply$lambda$1(AnotherPassThirdFragment anotherPassThirdFragment) {
        this.this$0 = anotherPassThirdFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x008b, code lost:
        if (kotlin.text.StringsKt.isBlank(java.lang.String.valueOf(r4.getText())) != false) goto L_0x00a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r4) {
        /*
            r3 = this;
            ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassThirdFragment r4 = r3.this$0
            int r0 = p035ru.unicorn.C5619R.C5622id.etName
            android.view.View r4 = r4._$_findCachedViewById(r0)
            com.google.android.material.textfield.TextInputEditText r4 = (com.google.android.material.textfield.TextInputEditText) r4
            java.lang.String r0 = "etName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = kotlin.text.StringsKt.isBlank(r4)
            if (r4 != 0) goto L_0x00a4
            ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassThirdFragment r4 = r3.this$0
            int r0 = p035ru.unicorn.C5619R.C5622id.etSurname
            android.view.View r4 = r4._$_findCachedViewById(r0)
            com.google.android.material.textfield.TextInputEditText r4 = (com.google.android.material.textfield.TextInputEditText) r4
            java.lang.String r0 = "etSurname"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = kotlin.text.StringsKt.isBlank(r4)
            if (r4 != 0) goto L_0x00a4
            ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassThirdFragment r4 = r3.this$0
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r4 = r4.getPassViewModel()
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r4 = r4.getCreateAnotherPassBody()
            int r4 = r4.getCategory()
            r0 = 1
            if (r4 != r0) goto L_0x008e
            ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassThirdFragment r4 = r3.this$0
            int r0 = p035ru.unicorn.C5619R.C5622id.etBrand
            android.view.View r4 = r4._$_findCachedViewById(r0)
            com.google.android.material.textfield.TextInputEditText r4 = (com.google.android.material.textfield.TextInputEditText) r4
            java.lang.String r0 = "etBrand"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = kotlin.text.StringsKt.isBlank(r4)
            if (r4 != 0) goto L_0x00a4
            ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassThirdFragment r4 = r3.this$0
            int r0 = p035ru.unicorn.C5619R.C5622id.etLicencePlate
            android.view.View r4 = r4._$_findCachedViewById(r0)
            com.google.android.material.textfield.TextInputEditText r4 = (com.google.android.material.textfield.TextInputEditText) r4
            java.lang.String r0 = "etLicencePlate"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = kotlin.text.StringsKt.isBlank(r4)
            if (r4 == 0) goto L_0x008e
            goto L_0x00a4
        L_0x008e:
            ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassThirdFragment r4 = r3.this$0
            r4.saveValues()
            ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassThirdFragment r4 = r3.this$0
            ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassFourthFragment$Companion r0 = p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassFourthFragment.Companion
            ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassFourthFragment r0 = r0.newInstance()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r1 = 0
            java.lang.String r2 = "fragmentAnotherPassFourth"
            r4.nextFragment(r0, r1, r2)
            goto L_0x00cf
        L_0x00a4:
            androidx.appcompat.app.AlertDialog$Builder r4 = new androidx.appcompat.app.AlertDialog$Builder
            ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassThirdFragment r0 = r3.this$0
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r0.getBaseActivity()
            android.content.Context r0 = (android.content.Context) r0
            r4.<init>(r0)
            java.lang.String r0 = "Заполните обязательные поля"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            androidx.appcompat.app.AlertDialog$Builder r4 = r4.setTitle((java.lang.CharSequence) r0)
            java.lang.String r0 = "Фамилия и имя.\nБез этой информации мы не сможем пропустить вашего гостя."
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            androidx.appcompat.app.AlertDialog$Builder r4 = r4.setMessage((java.lang.CharSequence) r0)
            r0 = 2131887489(0x7f120581, float:1.9409587E38)
            ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassThirdFragment$showToolbar$1$1$1 r1 = p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassThirdFragment$showToolbar$1$1$1.INSTANCE
            android.content.DialogInterface$OnClickListener r1 = (android.content.DialogInterface.OnClickListener) r1
            androidx.appcompat.app.AlertDialog$Builder r4 = r4.setPositiveButton((int) r0, (android.content.DialogInterface.OnClickListener) r1)
            r4.show()
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassThirdFragment$showToolbar$$inlined$apply$lambda$1.onClick(android.view.View):void");
    }
}
