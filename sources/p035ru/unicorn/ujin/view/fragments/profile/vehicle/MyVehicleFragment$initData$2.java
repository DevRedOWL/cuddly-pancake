package p035ru.unicorn.ujin.view.fragments.profile.vehicle;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.fragments.parking.response.MyVehicle;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.vehicle.MyVehicleFragment$initData$2 */
/* compiled from: MyVehicleFragment.kt */
final class MyVehicleFragment$initData$2 implements View.OnClickListener {
    final /* synthetic */ MyVehicleFragment this$0;

    MyVehicleFragment$initData$2(MyVehicleFragment myVehicleFragment) {
        this.this$0 = myVehicleFragment;
    }

    public final void onClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.this$0.getBaseActivity());
        builder.setTitle((CharSequence) this.this$0.getResources().getString(R.string.profile_remove_auto_title)).setMessage((CharSequence) this.this$0.getResources().getString(R.string.profile_remove_auto_message)).setPositiveButton((CharSequence) this.this$0.getResources().getString(R.string.avatar_delete), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
            final /* synthetic */ MyVehicleFragment$initData$2 this$0;

            {
                this.this$0 = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                Integer id;
                Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
                MyVehicle access$getVehicle$p = this.this$0.this$0.vehicle;
                if (!(access$getVehicle$p == null || (id = access$getVehicle$p.getId()) == null)) {
                    int intValue = id.intValue();
                    ProgressBar progressBar = (ProgressBar) this.this$0.this$0._$_findCachedViewById(C5619R.C5622id.pbLoading);
                    Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
                    progressBar.setVisibility(0);
                    this.this$0.this$0.getParkingViewModel().removeVehicle(String.valueOf(intValue));
                    this.this$0.this$0.getParkingViewModel().getRemoveVehicleMutableLiveData().observe(this.this$0.this$0.getViewLifecycleOwner(), new MyVehicleFragment$initData$2$1$$special$$inlined$let$lambda$1(this));
                }
                dialogInterface.cancel();
            }
        }).setNegativeButton((CharSequence) this.this$0.getResources().getString(R.string.button_cancel), (DialogInterface.OnClickListener) C60662.INSTANCE);
        AlertDialog create = builder.create();
        Intrinsics.checkNotNullExpressionValue(create, "builder.create()");
        create.show();
    }
}
