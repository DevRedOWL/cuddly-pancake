package p035ru.unicorn.ujin.view.customViews.dynamic.button;

import android.content.DialogInterface;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.button.BaseButtonHolder$bindButton$1$1$2$2 */
/* compiled from: BaseButtonHolder.kt */
final class BaseButtonHolder$bindButton$1$1$2$2 implements DialogInterface.OnClickListener {
    public static final BaseButtonHolder$bindButton$1$1$2$2 INSTANCE = new BaseButtonHolder$bindButton$1$1$2$2();

    BaseButtonHolder$bindButton$1$1$2$2() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
