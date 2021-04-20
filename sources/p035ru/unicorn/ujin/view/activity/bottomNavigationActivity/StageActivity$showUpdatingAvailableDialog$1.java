package p035ru.unicorn.ujin.view.activity.bottomNavigationActivity;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity$showUpdatingAvailableDialog$1 */
/* compiled from: StageActivity.kt */
final class StageActivity$showUpdatingAvailableDialog$1 implements DialogInterface.OnClickListener {
    final /* synthetic */ StageActivity this$0;

    StageActivity$showUpdatingAvailableDialog$1(StageActivity stageActivity) {
        this.this$0 = stageActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String packageName = this.this$0.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, Constants.FirelogAnalytics.PARAM_PACKAGE_NAME);
        try {
            StageActivity stageActivity = this.this$0;
            stageActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
        } catch (ActivityNotFoundException unused) {
            StageActivity stageActivity2 = this.this$0;
            stageActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
        }
    }
}
