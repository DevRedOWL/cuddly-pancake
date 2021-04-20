package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.custom.osnova;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Camera;
import p035ru.unicorn.ujin.data.realm.Point;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.MjpegVideoActivity;
import p035ru.unicorn.ujin.view.activity.navigation.entity.video.VideoDataSaver;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.ListOfGateFragment$initView$3 */
/* compiled from: ListOfGateFragment.kt */
final class ListOfGateFragment$initView$3 implements View.OnClickListener {
    final /* synthetic */ ListOfGateFragment this$0;

    ListOfGateFragment$initView$3(ListOfGateFragment listOfGateFragment) {
        this.this$0 = listOfGateFragment;
    }

    public final void onClick(View view) {
        Camera camera;
        String videourl;
        Point point = this.this$0.getPoint();
        if (point != null && (camera = point.getCamera()) != null && (videourl = camera.getVideourl()) != null) {
            MjpegVideoActivity.Companion companion = MjpegVideoActivity.Companion;
            BaseActivity access$getBaseActivity = this.this$0.getBaseActivity();
            Intrinsics.checkNotNullExpressionValue(access$getBaseActivity, "baseActivity");
            this.this$0.getBaseActivity().startActivity(companion.start(access$getBaseActivity, videourl, "", VideoDataSaver.VideoDataType.FROM_GATE_PREVIEW));
        }
    }
}
