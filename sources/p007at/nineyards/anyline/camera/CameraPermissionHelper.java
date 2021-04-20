package p007at.nineyards.anyline.camera;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import p007at.nineyards.anyline.C0718R;

/* renamed from: at.nineyards.anyline.camera.CameraPermissionHelper */
public class CameraPermissionHelper {
    public static final int REQUEST_CODE_CAMERA_PERMISSIONS = 404;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Activity f347a;

    /* renamed from: b */
    private String[] f348b = {"android.permission.CAMERA"};

    public CameraPermissionHelper(Activity activity) {
        this.f347a = activity;
    }

    public void requestPermissions() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f348b) {
            if (ContextCompat.checkSelfPermission(this.f347a, str) != 0) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            ActivityCompat.requestPermissions(this.f347a, this.f348b, 404);
        }
    }

    public boolean hasPermissions() {
        for (String checkSelfPermission : this.f348b) {
            if (ContextCompat.checkSelfPermission(this.f347a, checkSelfPermission) != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        return i == 404 && iArr.length > 0 && strArr.length == 1 && "android.permission.CAMERA".equals(strArr[0]) && iArr[0] == 0;
    }

    public void showPermissionMessage(String str) {
        if (str == null) {
            str = this.f347a.getString(C0718R.string.allow_camera_permission);
        }
        C07561 r0 = new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                CameraPermissionHelper.m109a(CameraPermissionHelper.this.f347a);
            }
        };
        Activity activity = this.f347a;
        new AlertDialog.Builder(activity).setMessage(str).setPositiveButton(activity.getString(17039370), (DialogInterface.OnClickListener) null).setNeutralButton(activity.getString(C0718R.string.open_permission_settings), r0).create().show();
    }

    /* renamed from: a */
    static /* synthetic */ void m109a(Activity activity) {
        if (activity != null) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + activity.getPackageName()));
            intent.addFlags(268435456);
            intent.addFlags(BasicMeasure.EXACTLY);
            intent.addFlags(8388608);
            activity.startActivity(intent);
        }
    }
}
