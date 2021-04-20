package p035ru.unicorn.ujin.ble;

import com.afollestad.materialdialogs.MaterialDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.ble.TransparentActivity$startWork$1 */
/* compiled from: TransparentActivity.kt */
final class TransparentActivity$startWork$1 extends Lambda implements Function1<MaterialDialog, Unit> {
    final /* synthetic */ TransparentActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TransparentActivity$startWork$1(TransparentActivity transparentActivity) {
        super(1);
        this.this$0 = transparentActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MaterialDialog) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(MaterialDialog materialDialog) {
        Intrinsics.checkNotNullParameter(materialDialog, "dialog");
        materialDialog.dismiss();
        this.this$0.gotoBTSettings();
    }
}
