package org.opencv.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import org.linphone.xmlrpc.XmlRpcHelper;

public abstract class BaseLoaderCallback implements LoaderCallbackInterface {
    protected Context mAppContext;

    public BaseLoaderCallback(Context context) {
        this.mAppContext = context;
    }

    public void onManagerConnected(int i) {
        if (i == 0) {
            return;
        }
        if (i == 2) {
            Log.e("OpenCVLoader/BaseLoaderCallback", "Package installation failed!");
            AlertDialog create = new AlertDialog.Builder(this.mAppContext).create();
            create.setTitle("OpenCV Manager");
            create.setMessage("Package installation failed!");
            create.setCancelable(false);
            create.setButton(-1, XmlRpcHelper.SERVER_RESPONSE_OK, new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BaseLoaderCallback.this.mo60147a();
                }
            });
            create.show();
        } else if (i == 3) {
            Log.d("OpenCVLoader/BaseLoaderCallback", "OpenCV library instalation was canceled by user");
            mo60147a();
        } else if (i != 4) {
            Log.e("OpenCVLoader/BaseLoaderCallback", "OpenCV loading failed!");
            AlertDialog create2 = new AlertDialog.Builder(this.mAppContext).create();
            create2.setTitle("OpenCV error");
            create2.setMessage("OpenCV was not initialised correctly. Application will be shut down");
            create2.setCancelable(false);
            create2.setButton(-1, XmlRpcHelper.SERVER_RESPONSE_OK, new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BaseLoaderCallback.this.mo60147a();
                }
            });
            create2.show();
        } else {
            Log.d("OpenCVLoader/BaseLoaderCallback", "OpenCV Manager Service is uncompatible with this app!");
            AlertDialog create3 = new AlertDialog.Builder(this.mAppContext).create();
            create3.setTitle("OpenCV Manager");
            create3.setMessage("OpenCV Manager service is incompatible with this app. Try to update it via Google Play.");
            create3.setCancelable(false);
            create3.setButton(-1, XmlRpcHelper.SERVER_RESPONSE_OK, new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BaseLoaderCallback.this.mo60147a();
                }
            });
            create3.show();
        }
    }

    public void onPackageInstall(int i, final InstallCallbackInterface installCallbackInterface) {
        if (i == 0) {
            AlertDialog create = new AlertDialog.Builder(this.mAppContext).create();
            create.setTitle("Package not found");
            create.setMessage(installCallbackInterface.getPackageName() + " package was not found! Try to install it?");
            create.setCancelable(false);
            create.setButton(-1, "Yes", new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    installCallbackInterface.install();
                }
            });
            create.setButton(-2, "No", new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    installCallbackInterface.cancel();
                }
            });
            create.show();
        } else if (i == 1) {
            AlertDialog create2 = new AlertDialog.Builder(this.mAppContext).create();
            create2.setTitle("OpenCV is not ready");
            create2.setMessage("Installation is in progress. Wait or exit?");
            create2.setCancelable(false);
            create2.setButton(-1, "Wait", new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    installCallbackInterface.wait_install();
                }
            });
            create2.setButton(-2, "Exit", new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    installCallbackInterface.cancel();
                }
            });
            create2.show();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo60147a() {
        ((Activity) this.mAppContext).finish();
    }
}
