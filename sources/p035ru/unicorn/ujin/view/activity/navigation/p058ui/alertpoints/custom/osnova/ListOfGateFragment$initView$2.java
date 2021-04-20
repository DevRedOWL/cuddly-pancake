package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.custom.osnova;

import android.view.View;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.BeaconAction;
import p035ru.unicorn.ujin.data.realm.BeaconActionDescription;
import p035ru.unicorn.ujin.data.realm.Point;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.ListOfGateFragment$initView$2 */
/* compiled from: ListOfGateFragment.kt */
final class ListOfGateFragment$initView$2 implements View.OnClickListener {
    final /* synthetic */ ListOfGateFragment this$0;

    ListOfGateFragment$initView$2(ListOfGateFragment listOfGateFragment) {
        this.this$0 = listOfGateFragment;
    }

    public final void onClick(View view) {
        BeaconAction beaconAction;
        BeaconActionDescription beaconActionDescriptionOut;
        Integer id;
        Point point = this.this$0.getPoint();
        if (point != null && (beaconAction = point.getBeaconAction()) != null && (beaconActionDescriptionOut = beaconAction.getBeaconActionDescriptionOut()) != null && (id = beaconActionDescriptionOut.getId()) != null) {
            this.this$0.onOpenClick(id.intValue());
        }
    }
}
