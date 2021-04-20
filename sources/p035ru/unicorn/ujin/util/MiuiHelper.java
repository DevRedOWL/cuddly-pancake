package p035ru.unicorn.ujin.util;

import android.content.Context;

/* renamed from: ru.unicorn.ujin.util.MiuiHelper */
public class MiuiHelper {
    private Context context;

    public MiuiHelper(Context context2) {
        this.context = context2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x001f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void displayPopupPermission() {
        /*
            r5 = this;
            java.lang.String r0 = "extra_pkgname"
            java.lang.String r1 = "com.miui.securitycenter"
            java.lang.String r2 = "miui.intent.action.APP_PERM_EDITOR"
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x001f }
            r3.<init>(r2)     // Catch:{ Exception -> 0x001f }
            java.lang.String r4 = "com.miui.permcenter.permissions.PermissionsEditorActivity"
            r3.setClassName(r1, r4)     // Catch:{ Exception -> 0x001f }
            android.content.Context r4 = r5.context     // Catch:{ Exception -> 0x001f }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ Exception -> 0x001f }
            r3.putExtra(r0, r4)     // Catch:{ Exception -> 0x001f }
            android.content.Context r4 = r5.context     // Catch:{ Exception -> 0x001f }
            r4.startActivity(r3)     // Catch:{ Exception -> 0x001f }
            goto L_0x0054
        L_0x001f:
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x0038 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0038 }
            java.lang.String r2 = "com.miui.permcenter.permissions.AppPermissionsEditorActivity"
            r3.setClassName(r1, r2)     // Catch:{ Exception -> 0x0038 }
            android.content.Context r1 = r5.context     // Catch:{ Exception -> 0x0038 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Exception -> 0x0038 }
            r3.putExtra(r0, r1)     // Catch:{ Exception -> 0x0038 }
            android.content.Context r0 = r5.context     // Catch:{ Exception -> 0x0038 }
            r0.startActivity(r3)     // Catch:{ Exception -> 0x0038 }
            goto L_0x0054
        L_0x0038:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r0.<init>(r1)
            android.content.Context r1 = r5.context
            java.lang.String r1 = r1.getPackageName()
            r2 = 0
            java.lang.String r3 = "package"
            android.net.Uri r1 = android.net.Uri.fromParts(r3, r1, r2)
            r0.setData(r1)
            android.content.Context r1 = r5.context
            r1.startActivity(r0)
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.util.MiuiHelper.displayPopupPermission():void");
    }
}
