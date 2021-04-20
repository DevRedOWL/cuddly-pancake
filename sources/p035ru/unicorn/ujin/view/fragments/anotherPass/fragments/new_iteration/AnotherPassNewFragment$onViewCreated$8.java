package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration;

import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.databinding.FragmentAnotherPassBinding;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragment$onViewCreated$8 */
/* compiled from: AnotherPassNewFragment.kt */
final class AnotherPassNewFragment$onViewCreated$8 implements View.OnClickListener {
    final /* synthetic */ AnotherPassViewModel $viewModell;
    final /* synthetic */ AnotherPassNewFragment this$0;

    AnotherPassNewFragment$onViewCreated$8(AnotherPassNewFragment anotherPassNewFragment, AnotherPassViewModel anotherPassViewModel) {
        this.this$0 = anotherPassNewFragment;
        this.$viewModell = anotherPassViewModel;
    }

    public final void onClick(View view) {
        View currentFocus;
        FragmentActivity activity = this.this$0.getActivity();
        if (!(activity == null || (currentFocus = activity.getCurrentFocus()) == null)) {
            currentFocus.clearFocus();
        }
        UIHelper.hideKeyboard(this.this$0.getBaseActivity(), this.this$0._$_findCachedViewById(C5619R.C5622id.data11));
        DynamicBackgroundButton dynamicBackgroundButton = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).auto;
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "viewDataBinding.auto");
        dynamicBackgroundButton.setVisibility(8);
        View _$_findCachedViewById = this.this$0._$_findCachedViewById(C5619R.C5622id.data18);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "data18");
        _$_findCachedViewById.setVisibility(0);
        View _$_findCachedViewById2 = this.this$0._$_findCachedViewById(C5619R.C5622id.data19);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "data19");
        _$_findCachedViewById2.setVisibility(0);
        CheckBox checkBox = (CheckBox) this.this$0._$_findCachedViewById(C5619R.C5622id.checkboxDifferentVehicleType);
        Intrinsics.checkNotNullExpressionValue(checkBox, "checkboxDifferentVehicleType");
        checkBox.setVisibility(0);
        LinearLayout linearLayout = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).title8.parent;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "viewDataBinding.title8.parent");
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).title9.parent;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "viewDataBinding.title9.parent");
        linearLayout2.setVisibility(0);
        ConstraintLayout constraintLayout = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).title10.parent;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "viewDataBinding.title10.parent");
        constraintLayout.setVisibility(0);
        LinearLayout linearLayout3 = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).llZoneSlots;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "viewDataBinding.llZoneSlots");
        linearLayout3.setVisibility(0);
        ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).data18.value.requestFocus();
        LinearLayout linearLayout4 = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).llAdditional;
        Intrinsics.checkNotNullExpressionValue(linearLayout4, "viewDataBinding.llAdditional");
        if (linearLayout4.getChildCount() == 0) {
            View _$_findCachedViewById3 = this.this$0._$_findCachedViewById(C5619R.C5622id.title6);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "title6");
            _$_findCachedViewById3.setVisibility(8);
        }
        AnotherPassViewModel anotherPassViewModel = this.$viewModell;
        boolean z = true;
        if (anotherPassViewModel != null) {
            anotherPassViewModel.setAutoShowing(true);
        }
        TextInputEditText textInputEditText = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).data11.value;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "viewDataBinding.data11.value");
        Editable text = textInputEditText.getText();
        String str = null;
        CharSequence obj = text != null ? text.toString() : null;
        if (!(obj == null || StringsKt.isBlank(obj))) {
            TextInputEditText textInputEditText2 = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).data12.value;
            Intrinsics.checkNotNullExpressionValue(textInputEditText2, "viewDataBinding.data12.value");
            Editable text2 = textInputEditText2.getText();
            if (text2 != null) {
                str = text2.toString();
            }
            CharSequence charSequence = str;
            if (charSequence != null && !StringsKt.isBlank(charSequence)) {
                z = false;
            }
            if (!z) {
                this.this$0.checkDatesAndLoadZoneList();
                return;
            }
        }
        TextView textView = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.tvNoPlaces);
        textView.setVisibility(0);
        textView.setText(this.this$0.getString(R.string.label_no_parking_places));
        this.this$0.showMessage("Укажите дату и время посещения для выбора парковочного места");
    }
}
