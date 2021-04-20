package p035ru.unicorn.ujin.util;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.core.app.ActivityCompat;

/* renamed from: ru.unicorn.ujin.util.PermissionHelper */
public class PermissionHelper {
    Context context;

    /* renamed from: ru.unicorn.ujin.util.PermissionHelper$IPermissionCallback */
    public interface IPermissionCallback {
        void permissionDenied(RuntimePermissions runtimePermissions);

        void permissionGranted(RuntimePermissions runtimePermissions);
    }

    /* renamed from: ru.unicorn.ujin.util.PermissionHelper$RuntimePermissions */
    public enum RuntimePermissions {
        PERMISSION_REQUEST_FINE_LOCATION {
            public String showInformationMessage(Context context) {
                return "&&";
            }

            public String toStringValue() {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
        };
        
        public final int VALUE;

        public abstract String showInformationMessage(Context context);

        public abstract String toStringValue();
    }

    public PermissionHelper(Context context2) {
        this.context = context2;
    }

    public boolean isPermissionGranted(Context context2, RuntimePermissions runtimePermissions) {
        return Build.VERSION.SDK_INT < 23 || ActivityCompat.checkSelfPermission(context2, runtimePermissions.toStringValue()) == 0;
    }

    public void checkForPermissions(Activity activity, RuntimePermissions runtimePermissions, IPermissionCallback iPermissionCallback) {
        if (isPermissionGranted(this.context, runtimePermissions)) {
            iPermissionCallback.permissionGranted(runtimePermissions);
        } else if (ActivityCompat.shouldShowRequestPermissionRationale(activity, runtimePermissions.toStringValue())) {
            iPermissionCallback.permissionDenied(runtimePermissions);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{runtimePermissions.toStringValue()}, runtimePermissions.ordinal());
        }
    }
}
