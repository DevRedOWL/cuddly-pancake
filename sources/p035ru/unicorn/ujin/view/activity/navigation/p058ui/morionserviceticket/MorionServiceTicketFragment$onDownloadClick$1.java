package p035ru.unicorn.ujin.view.activity.navigation.p058ui.morionserviceticket;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceFile;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/navigation/ui/morionserviceticket/MorionServiceTicketFragment$onDownloadClick$1", "Lcom/karumi/dexter/listener/single/PermissionListener;", "onPermissionDenied", "", "response", "Lcom/karumi/dexter/listener/PermissionDeniedResponse;", "onPermissionGranted", "Lcom/karumi/dexter/listener/PermissionGrantedResponse;", "onPermissionRationaleShouldBeShown", "permission", "Lcom/karumi/dexter/listener/PermissionRequest;", "token", "Lcom/karumi/dexter/PermissionToken;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.MorionServiceTicketFragment$onDownloadClick$1 */
/* compiled from: MorionServiceTicketFragment.kt */
public final class MorionServiceTicketFragment$onDownloadClick$1 implements PermissionListener {
    final /* synthetic */ ServiceFile $serviceFile;
    final /* synthetic */ MorionServiceTicketFragment this$0;

    public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
        Intrinsics.checkNotNullParameter(permissionDeniedResponse, "response");
    }

    MorionServiceTicketFragment$onDownloadClick$1(MorionServiceTicketFragment morionServiceTicketFragment, ServiceFile serviceFile) {
        this.this$0 = morionServiceTicketFragment;
        this.$serviceFile = serviceFile;
    }

    public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
        Intrinsics.checkNotNullParameter(permissionGrantedResponse, "response");
        this.this$0.startDownload(this.$serviceFile);
    }

    public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
        Intrinsics.checkNotNullParameter(permissionRequest, "permission");
        Intrinsics.checkNotNullParameter(permissionToken, "token");
        FragmentActivity activity = this.this$0.getActivity();
        Intrinsics.checkNotNull(activity);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setMessage((CharSequence) this.this$0.getResources().getString(R.string.storagePermissionMessage)).setPositiveButton((CharSequence) this.this$0.getResources().getString(R.string.button_OK), (DialogInterface.OnClickListener) new C5859x36235e60(permissionToken)).setNegativeButton((CharSequence) this.this$0.getResources().getString(R.string.button_CANCEL), (DialogInterface.OnClickListener) new C5860x36235e61(permissionToken));
        builder.show().setCanceledOnTouchOutside(false);
    }
}
