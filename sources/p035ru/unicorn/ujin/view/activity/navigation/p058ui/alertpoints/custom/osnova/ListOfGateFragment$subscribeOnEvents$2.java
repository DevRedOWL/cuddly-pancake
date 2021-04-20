package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.custom.osnova;

import android.content.Context;
import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.custom.osnova.ListOfGateFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Lru/unicorn/ujin/data/realm/Resource;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.ListOfGateFragment$subscribeOnEvents$2 */
/* compiled from: ListOfGateFragment.kt */
final class ListOfGateFragment$subscribeOnEvents$2 extends Lambda implements Function1<Resource<Void>, Unit> {
    final /* synthetic */ ListOfGateFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ListOfGateFragment$subscribeOnEvents$2(ListOfGateFragment listOfGateFragment) {
        super(1);
        this.this$0 = listOfGateFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Resource<Void>) (Resource) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Resource<Void> resource) {
        Resource.Status status;
        if (resource != null) {
            status = resource.getStatus();
        } else {
            status = null;
        }
        if (status != null) {
            int i = ListOfGateFragment.WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                ProgressBar progressBar = this.this$0.f6913pb;
                Intrinsics.checkNotNullExpressionValue(progressBar, "pb");
                progressBar.setVisibility(0);
            } else if (i == 2) {
                this.this$0.setSendRequest(false);
                ProgressBar progressBar2 = this.this$0.f6913pb;
                Intrinsics.checkNotNullExpressionValue(progressBar2, "pb");
                progressBar2.setVisibility(4);
                DialogHelper.showDialog((Context) this.this$0.getActivity(), resource.getMessage());
            } else if (i == 3) {
                this.this$0.setSendRequest(false);
                ProgressBar progressBar3 = this.this$0.f6913pb;
                Intrinsics.checkNotNullExpressionValue(progressBar3, "pb");
                progressBar3.setVisibility(4);
                DialogHelper.showDialogWithTimeout(this.this$0.getActivity(), this.this$0.getString(R.string.smartNavDynamicRequestSent));
            }
        }
    }
}
