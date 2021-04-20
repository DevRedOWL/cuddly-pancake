package p035ru.unicorn.ujin.view.activity;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo51343d2 = {"<anonymous>", "", "run", "ru/unicorn/ujin/view/activity/MjpegVideoActivity$onVideoClick$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.MjpegVideoActivity$onVideoClick$$inlined$let$lambda$1 */
/* compiled from: MjpegVideoActivity.kt */
final class MjpegVideoActivity$onVideoClick$$inlined$let$lambda$1 implements Runnable {
    final /* synthetic */ MjpegVideoActivity this$0;

    MjpegVideoActivity$onVideoClick$$inlined$let$lambda$1(MjpegVideoActivity mjpegVideoActivity) {
        this.this$0 = mjpegVideoActivity;
    }

    public final void run() {
        this.this$0.showExitButton(false);
        this.this$0.hideSystemUI();
    }
}
