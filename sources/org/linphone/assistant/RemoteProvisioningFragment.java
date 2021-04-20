package org.linphone.assistant;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import org.linphone.C5321R;
import org.linphone.LinphoneManager;
import org.linphone.LinphonePreferences;

public class RemoteProvisioningFragment extends Fragment implements View.OnClickListener, TextWatcher {
    private Button apply;
    private EditText remoteProvisioningUrl;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5321R.layout.assistant_remote_provisioning, viewGroup, false);
        this.remoteProvisioningUrl = (EditText) inflate.findViewById(C5321R.C5324id.assistant_remote_provisioning_url);
        this.remoteProvisioningUrl.addTextChangedListener(this);
        this.apply = (Button) inflate.findViewById(C5321R.C5324id.assistant_apply);
        this.apply.setEnabled(false);
        this.apply.setOnClickListener(this);
        return inflate;
    }

    public void onClick(View view) {
        if (view.getId() == C5321R.C5324id.assistant_apply) {
            String obj = this.remoteProvisioningUrl.getText().toString();
            AssistantActivity.instance().displayRemoteProvisioningInProgressDialog();
            LinphonePreferences.instance().setRemoteProvisioningUrl(obj);
            LinphoneManager.getInstance().restartLinphoneCore();
            AssistantActivity.instance().setLinphoneCoreListener();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.apply.setEnabled(!this.remoteProvisioningUrl.getText().toString().isEmpty());
    }
}
