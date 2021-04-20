package p035ru.unicorn.ujin.view.fragments.profile;

import android.content.DialogInterface;
import android.widget.ProgressBar;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkinkRentaObject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.RentObjectListFragment$showRentObjectConfirmation$1 */
/* compiled from: RentObjectListFragment.kt */
final class RentObjectListFragment$showRentObjectConfirmation$1 implements DialogInterface.OnClickListener {
    final /* synthetic */ int $propertyId;
    final /* synthetic */ RentObjectListFragment this$0;

    RentObjectListFragment$showRentObjectConfirmation$1(RentObjectListFragment rentObjectListFragment, int i) {
        this.this$0 = rentObjectListFragment;
        this.$propertyId = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ProgressBar progressBar = (ProgressBar) this.this$0._$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility(0);
        RentObjectListFragment.access$getRentaViewModel$p(this.this$0).createRent(this.$propertyId, Long.valueOf(RentObjectListFragment.access$getStartDateCal$p(this.this$0).getTimeInMillis()), Long.valueOf(RentObjectListFragment.access$getEndDateCal$p(this.this$0).getTimeInMillis()));
        RentObjectListFragment.access$getRentaViewModel$p(this.this$0).getTalkingRentaMake().observe(this.this$0.getViewLifecycleOwner(), new Observer<Resource<TalkinkRentaObject>>(this) {
            final /* synthetic */ RentObjectListFragment$showRentObjectConfirmation$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void onChanged(Resource<TalkinkRentaObject> resource) {
                this.this$0.this$0.handleCreateRent(resource);
            }
        });
        dialogInterface.dismiss();
    }
}
