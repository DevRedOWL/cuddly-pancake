package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.databinding.FragmentAnotherPassBinding;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragment$onViewCreated$18 */
/* compiled from: AnotherPassNewFragment.kt */
final class AnotherPassNewFragment$onViewCreated$18 implements View.OnClickListener {
    final /* synthetic */ AnotherPassViewModel $viewModell;
    final /* synthetic */ AnotherPassNewFragment this$0;

    AnotherPassNewFragment$onViewCreated$18(AnotherPassNewFragment anotherPassNewFragment, AnotherPassViewModel anotherPassViewModel) {
        this.this$0 = anotherPassNewFragment;
        this.$viewModell = anotherPassViewModel;
    }

    public final void onClick(View view) {
        ObservableField<CreateAnotherPassRequestBody> createAnotherPassBodyObservable;
        CreateAnotherPassRequestBody createAnotherPassRequestBody;
        ObservableField<CreateAnotherPassRequestBody> createAnotherPassBodyObservable2;
        CreateAnotherPassRequestBody createAnotherPassRequestBody2;
        ObservableField<VehicleData> createAnotherPassBodyVehicleObservable;
        VehicleData vehicleData;
        ObservableField<VehicleData> createAnotherPassBodyVehicleObservable2;
        VehicleData vehicleData2;
        UIHelper.hideKeyboard(this.this$0.getBaseActivity(), this.this$0._$_findCachedViewById(C5619R.C5622id.data11));
        AnotherPassViewModel anotherPassViewModel = this.$viewModell;
        if (anotherPassViewModel != null) {
            anotherPassViewModel.setAutoShowing(false);
        }
        View _$_findCachedViewById = this.this$0._$_findCachedViewById(C5619R.C5622id.data18);
        TextView textView = (TextView) _$_findCachedViewById.findViewById(C5619R.C5622id.value);
        Intrinsics.checkNotNullExpressionValue(textView, "value");
        textView.setText("");
        _$_findCachedViewById.setVisibility(8);
        View _$_findCachedViewById2 = this.this$0._$_findCachedViewById(C5619R.C5622id.data19);
        TextView textView2 = (TextView) _$_findCachedViewById2.findViewById(C5619R.C5622id.value);
        Intrinsics.checkNotNullExpressionValue(textView2, "value");
        textView2.setText("");
        _$_findCachedViewById2.setVisibility(8);
        CheckBox checkBox = (CheckBox) this.this$0._$_findCachedViewById(C5619R.C5622id.checkboxDifferentVehicleType);
        Intrinsics.checkNotNullExpressionValue(checkBox, "checkboxDifferentVehicleType");
        checkBox.setVisibility(8);
        AnotherPassViewModel anotherPassViewModel2 = this.$viewModell;
        if (!(anotherPassViewModel2 == null || (createAnotherPassBodyVehicleObservable2 = anotherPassViewModel2.getCreateAnotherPassBodyVehicleObservable()) == null || (vehicleData2 = createAnotherPassBodyVehicleObservable2.get()) == null)) {
            vehicleData2.setBrand("");
        }
        AnotherPassViewModel anotherPassViewModel3 = this.$viewModell;
        if (!(anotherPassViewModel3 == null || (createAnotherPassBodyVehicleObservable = anotherPassViewModel3.getCreateAnotherPassBodyVehicleObservable()) == null || (vehicleData = createAnotherPassBodyVehicleObservable.get()) == null)) {
            vehicleData.setNumber("");
        }
        AnotherPassViewModel anotherPassViewModel4 = this.$viewModell;
        if (!(anotherPassViewModel4 == null || (createAnotherPassBodyObservable2 = anotherPassViewModel4.getCreateAnotherPassBodyObservable()) == null || (createAnotherPassRequestBody2 = createAnotherPassBodyObservable2.get()) == null)) {
            createAnotherPassRequestBody2.setSlotId("");
        }
        AnotherPassViewModel anotherPassViewModel5 = this.$viewModell;
        if (!(anotherPassViewModel5 == null || (createAnotherPassBodyObservable = anotherPassViewModel5.getCreateAnotherPassBodyObservable()) == null || (createAnotherPassRequestBody = createAnotherPassBodyObservable.get()) == null)) {
            createAnotherPassRequestBody.notifyChange();
        }
        LinearLayout linearLayout = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).title8.parent;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "viewDataBinding.title8.parent");
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).title9.parent;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "viewDataBinding.title9.parent");
        linearLayout2.setVisibility(8);
        ConstraintLayout constraintLayout = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).title10.parent;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "viewDataBinding.title10.parent");
        constraintLayout.setVisibility(8);
        LinearLayout linearLayout3 = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).llZoneSlots;
        linearLayout3.removeAllViews();
        linearLayout3.setVisibility(8);
        TextView textView3 = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).tvNoPlaces;
        Intrinsics.checkNotNullExpressionValue(textView3, "viewDataBinding.tvNoPlaces");
        textView3.setVisibility(8);
        DynamicBackgroundButton dynamicBackgroundButton = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).auto;
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "viewDataBinding.auto");
        dynamicBackgroundButton.setVisibility(0);
    }
}
