package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, mo51343d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch", "ru/unicorn/ujin/view/customViews/dynamic/EditViewHolder$bind$2$2"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.EditViewHolder$bind$$inlined$also$lambda$2 */
/* compiled from: EditViewHolder.kt */
final class EditViewHolder$bind$$inlined$also$lambda$2 implements View.OnTouchListener {
    final /* synthetic */ Field $item$inlined;
    final /* synthetic */ EditViewHolder this$0;

    EditViewHolder$bind$$inlined$also$lambda$2(EditViewHolder editViewHolder, Field field) {
        this.this$0 = editViewHolder;
        this.$item$inlined = field;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.this$0.handleEyeClick(motionEvent);
    }
}
