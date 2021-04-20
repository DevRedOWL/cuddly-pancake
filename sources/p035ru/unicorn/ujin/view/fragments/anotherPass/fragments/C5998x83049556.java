package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments;

import android.view.View;
import android.widget.ProgressBar;
import com.afollestad.materialdialogs.MaterialDialog;
import kotlin.Metadata;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassDetailFragment$showDialogOnCreatePass$1$2$1", "ru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassDetailFragment$$special$$inlined$apply$lambda$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragment$showDialogOnCreatePass$$inlined$let$lambda$1 */
/* compiled from: AnotherPassDetailFragment.kt */
final class C5998x83049556 implements View.OnClickListener {
    final /* synthetic */ MaterialDialog $dialog$inlined;
    final /* synthetic */ AnotherPassDetailFragment this$0;

    C5998x83049556(MaterialDialog materialDialog, AnotherPassDetailFragment anotherPassDetailFragment) {
        this.$dialog$inlined = materialDialog;
        this.this$0 = anotherPassDetailFragment;
    }

    public final void onClick(View view) {
        this.$dialog$inlined.dismiss();
        ProgressBar progressBar = (ProgressBar) this.this$0._$_findCachedViewById(C5619R.C5622id.pbLoading);
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.this$0.getPassInviteText();
    }
}
