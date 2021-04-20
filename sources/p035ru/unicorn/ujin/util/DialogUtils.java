package p035ru.unicorn.ujin.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/util/DialogUtils;", "", "()V", "dialogShown", "", "progressDialog", "Landroidx/appcompat/app/AlertDialog;", "hideProgressDialog", "", "showError", "error", "", "context", "Landroid/content/Context;", "showMessage", "title", "message", "showProgressDialog", "activity", "Landroid/app/Activity;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.util.DialogUtils */
/* compiled from: DialogUtils.kt */
public final class DialogUtils {
    public static final DialogUtils INSTANCE = new DialogUtils();
    private static boolean dialogShown;
    private static AlertDialog progressDialog;

    private DialogUtils() {
    }

    public final void showError(String str, Context context) {
        Intrinsics.checkNotNullParameter(str, "error");
        Intrinsics.checkNotNullParameter(context, "context");
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage((CharSequence) str).setTitle((int) R.string.error).setCancelable(false).setPositiveButton((CharSequence) context.getResources().getString(R.string.close), (DialogInterface.OnClickListener) DialogUtils$showError$1.INSTANCE);
        AlertDialog create = builder.create();
        Intrinsics.checkNotNullExpressionValue(create, "builder.create()");
        create.show();
    }

    public final void showMessage(String str, String str2, Context context) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "message");
        Intrinsics.checkNotNullParameter(context, "context");
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage((CharSequence) str2).setTitle((CharSequence) str).setCancelable(false).setPositiveButton((CharSequence) context.getResources().getString(R.string.close), (DialogInterface.OnClickListener) DialogUtils$showMessage$1.INSTANCE);
        AlertDialog create = builder.create();
        Intrinsics.checkNotNullExpressionValue(create, "builder.create()");
        create.show();
    }

    public final void showProgressDialog(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!dialogShown) {
            progressDialog = new AlertDialog.Builder(activity).setView(activity.getLayoutInflater().inflate(R.layout.dialog_progress_bar, (ViewGroup) null)).setCancelable(false).create();
            AlertDialog alertDialog = progressDialog;
            if (alertDialog != null) {
                alertDialog.show();
            }
        }
    }

    public final void hideProgressDialog() {
        dialogShown = false;
        AlertDialog alertDialog = progressDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }
}
