package p035ru.unicorn.ujin.view.fragments.makearecord;

import android.content.Context;
import com.afollestad.materialdialogs.DialogBehavior;
import com.afollestad.materialdialogs.MaterialDialog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.mysmartflat.kortros.R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordSecondStage$dialog$2 */
/* compiled from: RecordSecondStage.kt */
final class RecordSecondStage$dialog$2 extends Lambda implements Function0<MaterialDialog> {
    final /* synthetic */ RecordSecondStage this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RecordSecondStage$dialog$2(RecordSecondStage recordSecondStage) {
        super(0);
        this.this$0 = recordSecondStage;
    }

    public final MaterialDialog invoke() {
        Context requireContext = this.this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        return MaterialDialog.positiveButton$default(MaterialDialog.message$default(new MaterialDialog(requireContext, (DialogBehavior) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(R.string.label_no_executors), (CharSequence) null, (Function1) null, 6, (Object) null), Integer.valueOf(R.string.button_OK), (CharSequence) null, C60291.INSTANCE, 2, (Object) null);
    }
}
