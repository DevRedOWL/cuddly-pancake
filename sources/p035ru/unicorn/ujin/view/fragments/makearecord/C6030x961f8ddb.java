package p035ru.unicorn.ujin.view.fragments.makearecord;

import android.content.DialogInterface;
import com.karumi.dexter.PermissionToken;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.ShowRecordFragment$onDownloadClick$1$onPermissionRationaleShouldBeShown$1 */
/* compiled from: ShowRecordFragment.kt */
final class C6030x961f8ddb implements DialogInterface.OnClickListener {
    final /* synthetic */ PermissionToken $token;

    C6030x961f8ddb(PermissionToken permissionToken) {
        this.$token = permissionToken;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.$token.continuePermissionRequest();
    }
}
