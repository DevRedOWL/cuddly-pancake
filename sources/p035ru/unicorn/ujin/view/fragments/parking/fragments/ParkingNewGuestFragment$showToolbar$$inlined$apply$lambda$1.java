package p035ru.unicorn.ujin.view.fragments.parking.fragments;

import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText;
import p035ru.unicorn.ujin.view.fragments.parking.ParkingViewModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/fragments/parking/fragments/ParkingNewGuestFragment$showToolbar$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingNewGuestFragment$showToolbar$$inlined$apply$lambda$1 */
/* compiled from: ParkingNewGuestFragment.kt */
final class ParkingNewGuestFragment$showToolbar$$inlined$apply$lambda$1 implements View.OnClickListener {
    final /* synthetic */ ParkingNewGuestFragment this$0;

    ParkingNewGuestFragment$showToolbar$$inlined$apply$lambda$1(ParkingNewGuestFragment parkingNewGuestFragment) {
        this.this$0 = parkingNewGuestFragment;
    }

    public final void onClick(View view) {
        TextInputEditText textInputEditText = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etName);
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "etName");
        if (!StringsKt.isBlank(String.valueOf(textInputEditText.getText()))) {
            TextInputEditText textInputEditText2 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etSurname);
            Intrinsics.checkNotNullExpressionValue(textInputEditText2, "etSurname");
            if (!StringsKt.isBlank(String.valueOf(textInputEditText2.getText()))) {
                TextInputEditText textInputEditText3 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPatronymic);
                Intrinsics.checkNotNullExpressionValue(textInputEditText3, "etPatronymic");
                if (!StringsKt.isBlank(String.valueOf(textInputEditText3.getText()))) {
                    TextInputEditText textInputEditText4 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etLicencePlate);
                    Intrinsics.checkNotNullExpressionValue(textInputEditText4, "etLicencePlate");
                    if (!StringsKt.isBlank(String.valueOf(textInputEditText4.getText()))) {
                        TextInputEditText textInputEditText5 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etBrand);
                        Intrinsics.checkNotNullExpressionValue(textInputEditText5, "etBrand");
                        if (!StringsKt.isBlank(String.valueOf(textInputEditText5.getText()))) {
                            PhoneMaskedEditText phoneMaskedEditText = (PhoneMaskedEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPhone);
                            Intrinsics.checkNotNullExpressionValue(phoneMaskedEditText, "etPhone");
                            if (!StringsKt.isBlank(String.valueOf(phoneMaskedEditText.getText()))) {
                                Integer id = this.this$0.getSlot().getId();
                                if (id != null) {
                                    int intValue = id.intValue();
                                    ParkingViewModel parkingViewModel = this.this$0.getParkingViewModel();
                                    String format = this.this$0.sdf.format(this.this$0.getCalendarStart().getTime());
                                    Intrinsics.checkNotNullExpressionValue(format, "sdf.format(calendarStart.time)");
                                    String format2 = this.this$0.sdf.format(this.this$0.getCalendarEnd().getTime());
                                    Intrinsics.checkNotNullExpressionValue(format2, "sdf.format(calendarEnd.time)");
                                    TextInputEditText textInputEditText6 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etSurname);
                                    Intrinsics.checkNotNullExpressionValue(textInputEditText6, "etSurname");
                                    String valueOf = String.valueOf(textInputEditText6.getText());
                                    TextInputEditText textInputEditText7 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etName);
                                    Intrinsics.checkNotNullExpressionValue(textInputEditText7, "etName");
                                    String valueOf2 = String.valueOf(textInputEditText7.getText());
                                    TextInputEditText textInputEditText8 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPatronymic);
                                    Intrinsics.checkNotNullExpressionValue(textInputEditText8, "etPatronymic");
                                    String valueOf3 = String.valueOf(textInputEditText8.getText());
                                    String value = ((PhoneMaskedEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPhone)).getValue();
                                    TextInputEditText textInputEditText9 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etLicencePlate);
                                    Intrinsics.checkNotNullExpressionValue(textInputEditText9, "etLicencePlate");
                                    String valueOf4 = String.valueOf(textInputEditText9.getText());
                                    TextInputEditText textInputEditText10 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etBrand);
                                    Intrinsics.checkNotNullExpressionValue(textInputEditText10, "etBrand");
                                    parkingViewModel.addGuest(intValue, format, format2, valueOf, valueOf2, valueOf3, value, valueOf4, String.valueOf(textInputEditText10.getText()));
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
        new AlertDialog.Builder(this.this$0.getBaseActivity()).setTitle((CharSequence) "Заполните все поля").setMessage((CharSequence) "Без этой информации мы не сможем пропустить вашего гостя.").setPositiveButton((int) R.string.ok, (DialogInterface.OnClickListener) ParkingNewGuestFragment$showToolbar$1$1$1.INSTANCE).show();
    }
}
