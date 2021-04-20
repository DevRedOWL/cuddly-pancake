package p035ru.unicorn.ujin.view.activity.bottomNavigationActivity;

import android.app.Dialog;
import kotlin.Metadata;
import p035ru.unicorn.ujin.util.MiuiHelper;
import p035ru.unicorn.ujin.view.fragments.CallAttentionDialog;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005¸\u0006\u0000"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/bottomNavigationActivity/StageActivity$showAlert$attentionDialog$1$1", "Lru/unicorn/ujin/view/fragments/CallAttentionDialog$DialogListener;", "onCancel", "", "onReady", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity$showAlert$$inlined$apply$lambda$1 */
/* compiled from: StageActivity.kt */
public final class StageActivity$showAlert$$inlined$apply$lambda$1 implements CallAttentionDialog.DialogListener {
    final /* synthetic */ CallAttentionDialog $this_apply;
    final /* synthetic */ StageActivity this$0;

    StageActivity$showAlert$$inlined$apply$lambda$1(CallAttentionDialog callAttentionDialog, StageActivity stageActivity) {
        this.$this_apply = callAttentionDialog;
        this.this$0 = stageActivity;
    }

    public void onCancel() {
        this.$this_apply.dismiss();
    }

    public void onReady() {
        Dialog dialog = this.$this_apply.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
        new MiuiHelper(this.this$0).displayPopupPermission();
    }
}
