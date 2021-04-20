package org.linphone.assistant;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import org.linphone.C5321R;
import org.linphone.LinphoneManager;
import org.linphone.LinphonePreferences;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreListenerBase;
import org.linphone.xmlrpc.XmlRpcHelper;
import org.linphone.xmlrpc.XmlRpcListenerBase;

public class RemoteProvisioningLoginActivity extends Activity implements View.OnClickListener {
    private Button connect;
    private EditText domain;
    private EditText login;
    private LinphoneCoreListenerBase mListener;
    private EditText password;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5321R.layout.assistant_remote_provisioning_login);
        this.login = (EditText) findViewById(C5321R.C5324id.assistant_username);
        this.password = (EditText) findViewById(C5321R.C5324id.assistant_password);
        this.domain = (EditText) findViewById(C5321R.C5324id.assistant_domain);
        this.connect = (Button) findViewById(C5321R.C5324id.assistant_connect);
        this.connect.setOnClickListener(this);
        String stringExtra = getIntent().getStringExtra("Domain");
        if (stringExtra != null) {
            this.domain.setText(stringExtra);
            this.domain.setEnabled(false);
        }
        this.mListener = new LinphoneCoreListenerBase() {
            public void configuringStatus(LinphoneCore linphoneCore, LinphoneCore.RemoteProvisioningState remoteProvisioningState, String str) {
                if (remoteProvisioningState != LinphoneCore.RemoteProvisioningState.ConfiguringSuccessful && remoteProvisioningState == LinphoneCore.RemoteProvisioningState.ConfiguringFailed) {
                    Toast.makeText(RemoteProvisioningLoginActivity.this, C5321R.string.remote_provisioning_failure, 1).show();
                }
            }
        };
    }

    private void cancelWizard(boolean z) {
        if (z || getResources().getBoolean(C5321R.bool.allow_cancel_remote_provisioning_login_activity)) {
            LinphonePreferences.instance().disableProvisioningLoginView();
            setResult(z ? -1 : 0);
            finish();
        }
    }

    private boolean storeAccount(String str, String str2, String str3) {
        new XmlRpcHelper().getRemoteProvisioningFilenameAsync(new XmlRpcListenerBase() {
            public void onRemoteProvisioningFilenameSent(String str) {
                LinphonePreferences.instance().setRemoteProvisioningUrl(str);
                LinphoneManager.getInstance().restartLinphoneCore();
            }
        }, str.toString(), str2.toString(), str3.toString());
        LinphonePreferences.instance().firstLaunchSuccessful();
        setResult(-1);
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.addListener(this.mListener);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.removeListener(this.mListener);
        }
        super.onPause();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C5321R.C5324id.cancel) {
            cancelWizard(false);
        }
        if (id == C5321R.C5324id.assistant_connect) {
            storeAccount(this.login.getText().toString(), this.password.getText().toString(), this.domain.getText().toString());
        }
    }

    public void onBackPressed() {
        cancelWizard(false);
    }
}
