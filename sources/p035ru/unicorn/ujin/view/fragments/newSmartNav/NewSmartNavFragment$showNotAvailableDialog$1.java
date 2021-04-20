package p035ru.unicorn.ujin.view.fragments.newSmartNav;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.BaseActivity;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.newSmartNav.NewSmartNavFragment$showNotAvailableDialog$1 */
/* compiled from: NewSmartNavFragment.kt */
final class NewSmartNavFragment$showNotAvailableDialog$1 implements DialogInterface.OnClickListener {
    final /* synthetic */ NewSmartNavFragment this$0;

    NewSmartNavFragment$showNotAvailableDialog$1(NewSmartNavFragment newSmartNavFragment) {
        this.this$0 = newSmartNavFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BaseActivity access$getBaseActivity = this.this$0.getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(access$getBaseActivity, "baseActivity");
        String packageName = access$getBaseActivity.getPackageName();
        try {
            NewSmartNavFragment newSmartNavFragment = this.this$0;
            newSmartNavFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
        } catch (ActivityNotFoundException unused) {
            NewSmartNavFragment newSmartNavFragment2 = this.this$0;
            newSmartNavFragment2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
        }
    }
}
