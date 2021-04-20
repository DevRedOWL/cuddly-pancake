package org.linphone;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.io.File;
import org.linphone.assistant.RemoteProvisioningActivity;
import org.linphone.mediastream.Version;
import org.linphone.tutorials.TutorialLauncherActivity;

public class LinphoneLauncherActivity extends Activity {
    private final String ACTION_CALL_LINPHONE = "org.linphone.intent.action.CallLaunched";
    /* access modifiers changed from: private */
    public String addressToCall;
    /* access modifiers changed from: private */
    public Handler mHandler;
    /* access modifiers changed from: private */
    public ServiceWaitThread mServiceThread;
    /* access modifiers changed from: private */
    public Uri uriToResolve;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getResources().getBoolean(C5321R.bool.orientation_portrait_only)) {
            setRequestedOrientation(1);
        }
        setContentView(C5321R.layout.launch_screen);
        this.mHandler = new Handler();
        Intent intent = getIntent();
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.CALL".equals(action)) {
                if (intent.getData() != null) {
                    this.addressToCall = intent.getData().toString();
                    this.addressToCall = this.addressToCall.replace("%40", "@");
                    this.addressToCall = this.addressToCall.replace("%3A", ":");
                    if (this.addressToCall.startsWith("sip:")) {
                        this.addressToCall = this.addressToCall.substring(4);
                    }
                }
            } else if ("android.intent.action.VIEW".equals(action)) {
                if (LinphoneService.isReady()) {
                    ContactsManager.getInstance();
                    this.addressToCall = ContactsManager.getAddressOrNumberForAndroidContact(getContentResolver(), intent.getData());
                } else {
                    this.uriToResolve = intent.getData();
                }
            }
        }
        if (LinphoneService.isReady()) {
            onServiceReady();
            return;
        }
        Intent intent2 = new Intent("android.intent.action.MAIN");
        intent2.setClass(this, LinphoneService.class);
        startService(intent2);
        this.mServiceThread = new ServiceWaitThread();
        this.mServiceThread.start();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onServiceReady() {
        final Class cls;
        String file = getFilesDir().toString();
        File file2 = new File(file + "/" + "libopenh264.so");
        if (!file2.exists()) {
            startService(new Intent(this, MyIntentService.class));
            Log.d("TAG", "onServiceReady: exist " + file2.exists());
        } else {
            Log.d("TAG", "onServiceReady: exist " + file2.exists());
        }
        if (getResources().getBoolean(C5321R.bool.show_tutorials_instead_of_app)) {
            cls = TutorialLauncherActivity.class;
        } else if (!getResources().getBoolean(C5321R.bool.display_sms_remote_provisioning_activity) || !LinphonePreferences.instance().isFirstRemoteProvisioning()) {
            cls = LinphoneActivity.class;
        } else {
            cls = RemoteProvisioningActivity.class;
        }
        if (Version.sdkAboveOrEqual(11)) {
            BluetoothManager.getInstance().initBluetooth();
        }
        this.mHandler.postDelayed(new Runnable() {
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: android.net.Uri} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: java.lang.String} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x0114  */
            /* JADX WARNING: Removed duplicated region for block: B:47:0x0157  */
            /* JADX WARNING: Removed duplicated region for block: B:55:0x0198  */
            /* JADX WARNING: Removed duplicated region for block: B:56:0x01a0  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r9 = this;
                    android.content.Intent r0 = new android.content.Intent
                    org.linphone.LinphoneLauncherActivity r1 = org.linphone.LinphoneLauncherActivity.this
                    java.lang.Class r2 = r0
                    r0.<init>(r1, r2)
                    org.linphone.LinphoneLauncherActivity r1 = org.linphone.LinphoneLauncherActivity.this
                    android.content.Intent r1 = r1.getIntent()
                    r2 = 0
                    if (r1 == 0) goto L_0x0107
                    java.lang.String r3 = r1.getAction()
                    java.lang.String r4 = r1.getType()
                    android.net.Uri r5 = r1.getData()
                    r0.setData(r5)
                    java.lang.String r5 = "android.intent.action.SEND"
                    boolean r5 = r5.equals(r3)
                    if (r5 == 0) goto L_0x00cd
                    if (r4 == 0) goto L_0x00cd
                    java.lang.String r3 = "text/"
                    boolean r3 = r4.contains(r3)
                    java.lang.String r5 = "fileShared"
                    java.lang.String r6 = "android.intent.extra.STREAM"
                    if (r3 == 0) goto L_0x007f
                    java.lang.String r3 = "text/plain"
                    boolean r3 = r3.equals(r4)
                    if (r3 == 0) goto L_0x0051
                    java.lang.String r3 = "android.intent.extra.TEXT"
                    java.lang.String r4 = r1.getStringExtra(r3)
                    if (r4 == 0) goto L_0x0051
                    java.lang.String r1 = r1.getStringExtra(r3)
                    java.lang.String r3 = "msgShared"
                    r0.putExtra(r3, r1)
                    goto L_0x007c
                L_0x0051:
                    android.os.Bundle r3 = r1.getExtras()
                    java.lang.Object r3 = r3.get(r6)
                    android.net.Uri r3 = (android.net.Uri) r3
                    if (r3 == 0) goto L_0x0107
                    org.linphone.LinphoneLauncherActivity r3 = org.linphone.LinphoneLauncherActivity.this
                    android.content.Context r3 = r3.getApplicationContext()
                    android.os.Bundle r1 = r1.getExtras()
                    java.lang.Object r1 = r1.get(r6)
                    android.net.Uri r1 = (android.net.Uri) r1
                    java.lang.String r1 = org.linphone.LinphoneUtils.processContactUri(r3, r1)
                    android.net.Uri r1 = org.linphone.LinphoneUtils.createCvsFromString(r1)
                    java.lang.String r1 = r1.toString()
                    r0.putExtra(r5, r1)
                L_0x007c:
                    r3 = r2
                    goto L_0x0109
                L_0x007f:
                    java.lang.String r3 = r1.getStringExtra(r6)
                    if (r3 == 0) goto L_0x008c
                    java.lang.String r1 = r1.getStringExtra(r6)
                    r3 = r1
                    r1 = r2
                    goto L_0x00c6
                L_0x008c:
                    android.os.Parcelable r1 = r1.getParcelableExtra(r6)
                    android.net.Uri r1 = (android.net.Uri) r1
                    org.linphone.LinphoneLauncherActivity r3 = org.linphone.LinphoneLauncherActivity.this
                    android.content.Context r3 = r3.getBaseContext()
                    java.lang.String r3 = org.linphone.LinphoneUtils.getRealPathFromURI(r3, r1)
                    if (r3 != 0) goto L_0x00c6
                    java.lang.String r3 = r1.getPath()
                    java.lang.String r4 = "/0/1/mediakey:/local"
                    boolean r3 = r3.contains(r4)
                    if (r3 != 0) goto L_0x00bc
                    java.lang.String r3 = r1.getPath()
                    java.lang.String r4 = "/ORIGINAL/NONE/"
                    boolean r3 = r3.contains(r4)
                    if (r3 == 0) goto L_0x00b7
                    goto L_0x00bc
                L_0x00b7:
                    java.lang.String r3 = r1.getPath()
                    goto L_0x00c6
                L_0x00bc:
                    org.linphone.LinphoneLauncherActivity r3 = org.linphone.LinphoneLauncherActivity.this
                    android.content.Context r3 = r3.getBaseContext()
                    java.lang.String r3 = org.linphone.LinphoneUtils.getFilePath(r3, r1)
                L_0x00c6:
                    r0.putExtra(r5, r3)
                    r4 = r3
                    r3 = r1
                    r1 = r2
                    goto L_0x010a
                L_0x00cd:
                    java.lang.String r5 = "android.intent.action.SEND_MULTIPLE"
                    boolean r5 = r5.equals(r3)
                    if (r5 == 0) goto L_0x00de
                    if (r4 == 0) goto L_0x00de
                    java.lang.String r1 = "image/"
                    boolean r1 = r4.startsWith(r1)
                    goto L_0x0107
                L_0x00de:
                    java.lang.String r4 = "org.linphone.intent.action.CallLaunched"
                    boolean r3 = r4.equals(r3)
                    if (r3 == 0) goto L_0x0107
                    java.lang.String r3 = "NumberToCall"
                    java.lang.String r4 = r1.getStringExtra(r3)
                    if (r4 == 0) goto L_0x0107
                    java.lang.String r1 = r1.getStringExtra(r3)
                    boolean r3 = org.linphone.CallActivity.isInstanciated()
                    if (r3 == 0) goto L_0x0100
                    org.linphone.CallActivity r1 = org.linphone.CallActivity.instance()
                    r1.startIncomingCallActivity()
                    goto L_0x0107
                L_0x0100:
                    org.linphone.LinphoneManager r3 = org.linphone.LinphoneManager.getInstance()
                    r3.newOutgoingCall(r1, r2)
                L_0x0107:
                    r1 = r2
                    r3 = r1
                L_0x0109:
                    r4 = r3
                L_0x010a:
                    org.linphone.LinphoneLauncherActivity r5 = org.linphone.LinphoneLauncherActivity.this
                    android.net.Uri r5 = r5.uriToResolve
                    java.lang.String r6 = "LinphoneLauncher"
                    if (r5 == 0) goto L_0x014f
                    org.linphone.LinphoneLauncherActivity r5 = org.linphone.LinphoneLauncherActivity.this
                    org.linphone.ContactsManager.getInstance()
                    org.linphone.LinphoneLauncherActivity r7 = org.linphone.LinphoneLauncherActivity.this
                    android.content.ContentResolver r7 = r7.getContentResolver()
                    org.linphone.LinphoneLauncherActivity r8 = org.linphone.LinphoneLauncherActivity.this
                    android.net.Uri r8 = r8.uriToResolve
                    java.lang.String r7 = org.linphone.ContactsManager.getAddressOrNumberForAndroidContact(r7, r8)
                    java.lang.String unused = r5.addressToCall = r7
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    java.lang.String r7 = "Intent has uri to resolve : "
                    r5.append(r7)
                    org.linphone.LinphoneLauncherActivity r7 = org.linphone.LinphoneLauncherActivity.this
                    android.net.Uri r7 = r7.uriToResolve
                    java.lang.String r7 = r7.toString()
                    r5.append(r7)
                    java.lang.String r5 = r5.toString()
                    android.util.Log.i(r6, r5)
                    org.linphone.LinphoneLauncherActivity r5 = org.linphone.LinphoneLauncherActivity.this
                    android.net.Uri unused = r5.uriToResolve = r2
                L_0x014f:
                    org.linphone.LinphoneLauncherActivity r5 = org.linphone.LinphoneLauncherActivity.this
                    java.lang.String r5 = r5.addressToCall
                    if (r5 == 0) goto L_0x0181
                    org.linphone.LinphoneLauncherActivity r5 = org.linphone.LinphoneLauncherActivity.this
                    java.lang.String r5 = r5.addressToCall
                    java.lang.String r7 = "SipUriOrNumber"
                    r0.putExtra(r7, r5)
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    java.lang.String r7 = "Intent has address to call : "
                    r5.append(r7)
                    org.linphone.LinphoneLauncherActivity r7 = org.linphone.LinphoneLauncherActivity.this
                    java.lang.String r7 = r7.addressToCall
                    r5.append(r7)
                    java.lang.String r5 = r5.toString()
                    android.util.Log.i(r6, r5)
                    org.linphone.LinphoneLauncherActivity r5 = org.linphone.LinphoneLauncherActivity.this
                    java.lang.String unused = r5.addressToCall = r2
                L_0x0181:
                    org.linphone.LinphoneLauncherActivity r5 = org.linphone.LinphoneLauncherActivity.this
                    r5.startActivity(r0)
                    java.lang.Class r0 = r0
                    java.lang.Class<org.linphone.LinphoneActivity> r5 = org.linphone.LinphoneActivity.class
                    if (r0 != r5) goto L_0x01a9
                    boolean r0 = org.linphone.LinphoneActivity.isInstanciated()
                    if (r0 == 0) goto L_0x01a9
                    if (r1 != 0) goto L_0x0196
                    if (r3 == 0) goto L_0x01a9
                L_0x0196:
                    if (r1 == 0) goto L_0x01a0
                    org.linphone.LinphoneActivity r0 = org.linphone.LinphoneActivity.instance()
                    r0.displayChat(r2, r1, r2)
                    goto L_0x01a9
                L_0x01a0:
                    if (r3 == 0) goto L_0x01a9
                    org.linphone.LinphoneActivity r0 = org.linphone.LinphoneActivity.instance()
                    r0.displayChat(r2, r2, r4)
                L_0x01a9:
                    org.linphone.LinphoneLauncherActivity r0 = org.linphone.LinphoneLauncherActivity.this
                    r0.finish()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: org.linphone.LinphoneLauncherActivity.C53051.run():void");
            }
        }, 1000);
    }

    private class ServiceWaitThread extends Thread {
        private ServiceWaitThread() {
        }

        public void run() {
            while (!LinphoneService.isReady()) {
                try {
                    sleep(30);
                } catch (InterruptedException unused) {
                    throw new RuntimeException("waiting thread sleep() has been interrupted");
                }
            }
            LinphoneLauncherActivity.this.mHandler.post(new Runnable() {
                public void run() {
                    LinphoneLauncherActivity.this.onServiceReady();
                }
            });
            ServiceWaitThread unused2 = LinphoneLauncherActivity.this.mServiceThread = null;
        }
    }
}
