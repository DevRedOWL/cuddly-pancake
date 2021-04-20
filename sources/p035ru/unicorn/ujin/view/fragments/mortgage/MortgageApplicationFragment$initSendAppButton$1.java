package p035ru.unicorn.ujin.view.fragments.mortgage;

import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.mortgage.MortgageApplicationFragment$initSendAppButton$1 */
/* compiled from: MortgageApplicationFragment.kt */
final class MortgageApplicationFragment$initSendAppButton$1 implements View.OnClickListener {
    final /* synthetic */ MortgageApplicationFragment this$0;

    MortgageApplicationFragment$initSendAppButton$1(MortgageApplicationFragment mortgageApplicationFragment) {
        this.this$0 = mortgageApplicationFragment;
    }

    public final void onClick(View view) {
        UIHelper.hideKeyboard(this.this$0.getActivity(), view);
        MortgageApplicationFragment mortgageApplicationFragment = this.this$0;
        TextInputEditText textInputEditText = (TextInputEditText) mortgageApplicationFragment._$_findCachedViewById(C5619R.C5622id.etSurname);
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "etSurname");
        String valueOf = String.valueOf(textInputEditText.getHint());
        TextInputEditText textInputEditText2 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etSurname);
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "etSurname");
        mortgageApplicationFragment.addFormItem(valueOf, String.valueOf(textInputEditText2.getText()));
        MortgageApplicationFragment mortgageApplicationFragment2 = this.this$0;
        TextInputEditText textInputEditText3 = (TextInputEditText) mortgageApplicationFragment2._$_findCachedViewById(C5619R.C5622id.etName);
        Intrinsics.checkNotNullExpressionValue(textInputEditText3, "etName");
        String valueOf2 = String.valueOf(textInputEditText3.getHint());
        TextInputEditText textInputEditText4 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etName);
        Intrinsics.checkNotNullExpressionValue(textInputEditText4, "etName");
        mortgageApplicationFragment2.addFormItem(valueOf2, String.valueOf(textInputEditText4.getText()));
        MortgageApplicationFragment mortgageApplicationFragment3 = this.this$0;
        TextInputEditText textInputEditText5 = (TextInputEditText) mortgageApplicationFragment3._$_findCachedViewById(C5619R.C5622id.etPatronymic);
        Intrinsics.checkNotNullExpressionValue(textInputEditText5, "etPatronymic");
        String valueOf3 = String.valueOf(textInputEditText5.getHint());
        TextInputEditText textInputEditText6 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPatronymic);
        Intrinsics.checkNotNullExpressionValue(textInputEditText6, "etPatronymic");
        mortgageApplicationFragment3.addFormItem(valueOf3, String.valueOf(textInputEditText6.getText()));
        MortgageApplicationFragment mortgageApplicationFragment4 = this.this$0;
        TextInputEditText textInputEditText7 = (TextInputEditText) mortgageApplicationFragment4._$_findCachedViewById(C5619R.C5622id.etBirthday);
        Intrinsics.checkNotNullExpressionValue(textInputEditText7, "etBirthday");
        String valueOf4 = String.valueOf(textInputEditText7.getHint());
        TextInputEditText textInputEditText8 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etBirthday);
        Intrinsics.checkNotNullExpressionValue(textInputEditText8, "etBirthday");
        mortgageApplicationFragment4.addFormItem(valueOf4, String.valueOf(textInputEditText8.getText()));
        MortgageApplicationFragment mortgageApplicationFragment5 = this.this$0;
        PhoneMaskedEditText phoneMaskedEditText = (PhoneMaskedEditText) mortgageApplicationFragment5._$_findCachedViewById(C5619R.C5622id.etPhone);
        Intrinsics.checkNotNullExpressionValue(phoneMaskedEditText, "etPhone");
        String valueOf5 = String.valueOf(phoneMaskedEditText.getHint());
        PhoneMaskedEditText phoneMaskedEditText2 = (PhoneMaskedEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPhone);
        Intrinsics.checkNotNullExpressionValue(phoneMaskedEditText2, "etPhone");
        mortgageApplicationFragment5.addFormItem(valueOf5, String.valueOf(phoneMaskedEditText2.getText()));
        this.this$0.viewModel.applyForMortgage(this.this$0.complexId, this.this$0.mortgageId, this.this$0.formData);
    }
}
