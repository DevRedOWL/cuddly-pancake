package p035ru.unicorn.ujin.view.fragments.makearecord;

import com.afollestad.materialdialogs.MaterialDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.data.Constants;
import p035ru.unicorn.ujin.view.activity.BaseActivity;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo51343d2 = {"<anonymous>", "", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke", "ru/unicorn/ujin/view/fragments/makearecord/RecordFivethStage$onCreateDialogResult$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordFivethStage$onCreateDialogResult$$inlined$let$lambda$1 */
/* compiled from: RecordFivethStage.kt */
final class RecordFivethStage$onCreateDialogResult$$inlined$let$lambda$1 extends Lambda implements Function1<MaterialDialog, Unit> {
    final /* synthetic */ boolean $success$inlined;
    final /* synthetic */ int $title$inlined;
    final /* synthetic */ RecordFivethStage this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RecordFivethStage$onCreateDialogResult$$inlined$let$lambda$1(RecordFivethStage recordFivethStage, int i, boolean z) {
        super(1);
        this.this$0 = recordFivethStage;
        this.$title$inlined = i;
        this.$success$inlined = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MaterialDialog) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(MaterialDialog materialDialog) {
        Intrinsics.checkNotNullParameter(materialDialog, "dialog");
        if (this.$success$inlined) {
            this.this$0.clearData();
            BaseActivity access$getBaseActivity = this.this$0.getBaseActivity();
            Intrinsics.checkNotNullExpressionValue(access$getBaseActivity, "baseActivity");
            if (access$getBaseActivity.getSupportFragmentManager().findFragmentByTag(Constants.ALL_RECORDS_TAG) != null) {
                this.this$0.popTo(Constants.ALL_RECORDS_TAG);
            } else {
                this.this$0.nextFragment(new RecordsViewPagerFragment(), true, Constants.ALL_RECORDS_TAG);
            }
        }
        this.this$0.getVm().getRevokeResult().setValue(null);
        this.this$0.getVm().getCreateRecordResult().setValue(null);
        materialDialog.dismiss();
    }
}
