package org.linphone.assistant;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import org.linphone.C5321R;

public class WelcomeFragment extends Fragment implements View.OnClickListener {
    private Button createAccount;
    private Button logGenericAccount;
    private Button logLinphoneAccount;
    private Button remoteProvisioning;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5321R.layout.assistant_welcome, viewGroup, false);
        this.createAccount = (Button) inflate.findViewById(C5321R.C5324id.create_account);
        this.createAccount.setOnClickListener(this);
        this.logLinphoneAccount = (Button) inflate.findViewById(C5321R.C5324id.login_linphone);
        if (getResources().getBoolean(C5321R.bool.hide_linphone_accounts_in_assistant)) {
            this.logLinphoneAccount.setVisibility(8);
        } else {
            this.logLinphoneAccount.setOnClickListener(this);
        }
        this.logGenericAccount = (Button) inflate.findViewById(C5321R.C5324id.login_generic);
        if (getResources().getBoolean(C5321R.bool.hide_generic_accounts_in_assistant)) {
            this.logGenericAccount.setVisibility(8);
        } else {
            this.logGenericAccount.setOnClickListener(this);
        }
        this.remoteProvisioning = (Button) inflate.findViewById(C5321R.C5324id.remote_provisioning);
        if (getResources().getBoolean(C5321R.bool.hide_remote_provisioning_in_assistant)) {
            this.remoteProvisioning.setVisibility(8);
        } else {
            this.remoteProvisioning.setOnClickListener(this);
        }
        return inflate;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C5321R.C5324id.login_generic) {
            AssistantActivity.instance().displayLoginGeneric();
        } else if (id == C5321R.C5324id.login_linphone) {
            AssistantActivity.instance().displayLoginLinphone((String) null, (String) null);
        } else if (id == C5321R.C5324id.create_account) {
            AssistantActivity.instance().displayCreateAccount();
        } else if (id == C5321R.C5324id.remote_provisioning) {
            AssistantActivity.instance().displayRemoteProvisioning();
        }
    }
}
