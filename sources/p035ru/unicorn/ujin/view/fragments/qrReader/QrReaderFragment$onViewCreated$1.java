package p035ru.unicorn.ujin.view.fragments.qrReader;

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

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/qrReader/QrReaderFragment$onViewCreated$1", "Lcom/karumi/dexter/listener/single/PermissionListener;", "onPermissionDenied", "", "response", "Lcom/karumi/dexter/listener/PermissionDeniedResponse;", "onPermissionGranted", "Lcom/karumi/dexter/listener/PermissionGrantedResponse;", "onPermissionRationaleShouldBeShown", "permission", "Lcom/karumi/dexter/listener/PermissionRequest;", "token", "Lcom/karumi/dexter/PermissionToken;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.qrReader.QrReaderFragment$onViewCreated$1 */
/* compiled from: QrReaderFragment.kt */
public final class QrReaderFragment$onViewCreated$1 implements PermissionListener {
    final /* synthetic */ QrReaderFragment this$0;

    QrReaderFragment$onViewCreated$1(QrReaderFragment qrReaderFragment) {
        this.this$0 = qrReaderFragment;
    }

    public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
        Intrinsics.checkNotNullParameter(permissionGrantedResponse, "response");
        this.this$0.initScanner();
        QrReaderFragment.access$getCodeScanner$p(this.this$0).startPreview();
    }

    public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
        Intrinsics.checkNotNullParameter(permissionDeniedResponse, "response");
        FragmentActivity activity = this.this$0.getActivity();
        Intrinsics.checkNotNull(activity);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setMessage((CharSequence) this.this$0.getResources().getString(R.string.qrPermissionError)).setPositiveButton((CharSequence) this.this$0.getResources().getString(R.string.button_OK), (DialogInterface.OnClickListener) new QrReaderFragment$onViewCreated$1$onPermissionDenied$1(this)).setNegativeButton((CharSequence) this.this$0.getResources().getString(R.string.button_CANCEL), (DialogInterface.OnClickListener) QrReaderFragment$onViewCreated$1$onPermissionDenied$2.INSTANCE);
        builder.show().setCanceledOnTouchOutside(false);
    }

    public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
        Intrinsics.checkNotNullParameter(permissionRequest, "permission");
        Intrinsics.checkNotNullParameter(permissionToken, "token");
        FragmentActivity activity = this.this$0.getActivity();
        Intrinsics.checkNotNull(activity);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setMessage((CharSequence) this.this$0.getResources().getString(R.string.qrPermissionError)).setPositiveButton((CharSequence) this.this$0.getResources().getString(R.string.button_OK), (DialogInterface.OnClickListener) new C6084x46e01642(permissionToken)).setNegativeButton((CharSequence) this.this$0.getResources().getString(R.string.button_CANCEL), (DialogInterface.OnClickListener) new C6085x46e01643(permissionToken));
        builder.show().setCanceledOnTouchOutside(false);
    }
}
