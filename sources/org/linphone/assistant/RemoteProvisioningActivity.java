package org.linphone.assistant;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.Toast;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import org.linphone.C5321R;
import org.linphone.LinphoneManager;
import org.linphone.LinphonePreferences;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreListenerBase;
import org.linphone.mediastream.Log;

public class RemoteProvisioningActivity extends Activity {
    /* access modifiers changed from: private */
    public String configUriParam = null;
    /* access modifiers changed from: private */
    public Handler mHandler = new Handler();
    private LinphoneCoreListenerBase mListener;
    /* access modifiers changed from: private */
    public ProgressBar spinner;

    /* access modifiers changed from: private */
    public void goToLinphoneActivity() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5321R.layout.remote_provisioning);
        this.spinner = (ProgressBar) findViewById(C5321R.C5324id.spinner);
        this.mListener = new LinphoneCoreListenerBase() {
            public void configuringStatus(LinphoneCore linphoneCore, LinphoneCore.RemoteProvisioningState remoteProvisioningState, String str) {
                if (RemoteProvisioningActivity.this.spinner != null) {
                    RemoteProvisioningActivity.this.spinner.setVisibility(8);
                }
                if (remoteProvisioningState == LinphoneCore.RemoteProvisioningState.ConfiguringSuccessful) {
                    RemoteProvisioningActivity.this.goToLinphoneActivity();
                } else if (remoteProvisioningState == LinphoneCore.RemoteProvisioningState.ConfiguringFailed) {
                    Toast.makeText(RemoteProvisioningActivity.this, C5321R.string.remote_provisioning_failure, 1).show();
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.addListener(this.mListener);
        }
        LinphonePreferences.instance().setContext(this);
        checkIntentForConfigUri(getIntent());
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.removeListener(this.mListener);
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        checkIntentForConfigUri(intent);
    }

    private void checkIntentForConfigUri(final Intent intent) {
        new Thread(new Runnable() {
            public void run() {
                Uri data = intent.getData();
                if (data != null) {
                    String unused = RemoteProvisioningActivity.this.configUriParam = data.getEncodedSchemeSpecificPart().substring(2);
                    try {
                        String unused2 = RemoteProvisioningActivity.this.configUriParam = URLDecoder.decode(RemoteProvisioningActivity.this.configUriParam, "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        Log.m6903e(e);
                    }
                    Log.m6901d("Using config uri: " + RemoteProvisioningActivity.this.configUriParam);
                }
                if (RemoteProvisioningActivity.this.configUriParam == null) {
                    if (!LinphonePreferences.instance().isFirstRemoteProvisioning()) {
                        RemoteProvisioningActivity.this.mHandler.post(new Runnable() {
                            public void run() {
                                RemoteProvisioningActivity.this.goToLinphoneActivity();
                            }
                        });
                    } else if (!RemoteProvisioningActivity.this.getResources().getBoolean(C5321R.bool.forbid_app_usage_until_remote_provisioning_completed)) {
                        RemoteProvisioningActivity.this.mHandler.postDelayed(new Runnable() {
                            public void run() {
                                RemoteProvisioningActivity.this.goToLinphoneActivity();
                            }
                        }, 1500);
                    }
                } else if (!RemoteProvisioningActivity.this.getResources().getBoolean(C5321R.bool.display_confirmation_popup_after_first_configuration) || LinphonePreferences.instance().isFirstRemoteProvisioning()) {
                    RemoteProvisioningActivity.this.mHandler.post(new Runnable() {
                        public void run() {
                            RemoteProvisioningActivity.this.setRemoteProvisioningAddressAndRestart(RemoteProvisioningActivity.this.configUriParam);
                        }
                    });
                } else {
                    RemoteProvisioningActivity.this.mHandler.post(new Runnable() {
                        public void run() {
                            RemoteProvisioningActivity.this.displayDialogConfirmation();
                        }
                    });
                }
            }
        }).start();
    }

    /* access modifiers changed from: private */
    public void displayDialogConfirmation() {
        new AlertDialog.Builder(this).setTitle(getString(C5321R.string.remote_provisioning_again_title)).setMessage(getString(C5321R.string.remote_provisioning_again_message)).setPositiveButton(C5321R.string.accept, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                RemoteProvisioningActivity remoteProvisioningActivity = RemoteProvisioningActivity.this;
                remoteProvisioningActivity.setRemoteProvisioningAddressAndRestart(remoteProvisioningActivity.configUriParam);
            }
        }).setNegativeButton(C5321R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                RemoteProvisioningActivity.this.goToLinphoneActivity();
            }
        }).show();
    }

    /* access modifiers changed from: private */
    public void setRemoteProvisioningAddressAndRestart(String str) {
        ProgressBar progressBar = this.spinner;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        LinphonePreferences.instance().setContext(this);
        LinphonePreferences.instance().setRemoteProvisioningUrl(str);
        this.mHandler.postDelayed(new Runnable() {
            public void run() {
                LinphoneManager.getInstance().restartLinphoneCore();
            }
        }, 1000);
    }
}
