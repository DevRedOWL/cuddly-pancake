package p033co.infinum.goldeneye.recorders;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p033co.infinum.goldeneye.PictureCallback;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.recorders.PictureRecorder$onShutter$1 */
/* compiled from: PictureRecorder.kt */
final class PictureRecorder$onShutter$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ PictureRecorder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PictureRecorder$onShutter$1(PictureRecorder pictureRecorder) {
        super(0);
        this.this$0 = pictureRecorder;
    }

    public final void invoke() {
        PictureCallback access$getPictureCallback$p = this.this$0.pictureCallback;
        if (access$getPictureCallback$p != null) {
            access$getPictureCallback$p.onShutter();
        }
    }
}
