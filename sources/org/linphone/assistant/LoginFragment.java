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
import android.widget.RadioGroup;
import android.widget.Toast;
import org.linphone.C5321R;
import org.linphone.core.LinphoneAddress;

public class LoginFragment extends Fragment implements View.OnClickListener, TextWatcher {
    private Button apply;
    private EditText displayName;
    private EditText domain;
    private EditText login;
    private EditText password;
    private RadioGroup transports;
    private EditText userid;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5321R.layout.assistant_login, viewGroup, false);
        this.login = (EditText) inflate.findViewById(C5321R.C5324id.assistant_username);
        this.login.addTextChangedListener(this);
        this.displayName = (EditText) inflate.findViewById(C5321R.C5324id.assistant_display_name);
        this.displayName.addTextChangedListener(this);
        this.userid = (EditText) inflate.findViewById(C5321R.C5324id.assistant_userid);
        this.userid.addTextChangedListener(this);
        this.password = (EditText) inflate.findViewById(C5321R.C5324id.assistant_password);
        this.password.addTextChangedListener(this);
        this.domain = (EditText) inflate.findViewById(C5321R.C5324id.assistant_domain);
        this.domain.addTextChangedListener(this);
        this.transports = (RadioGroup) inflate.findViewById(C5321R.C5324id.assistant_transports);
        this.apply = (Button) inflate.findViewById(C5321R.C5324id.assistant_apply);
        this.apply.setEnabled(false);
        this.apply.setOnClickListener(this);
        return inflate;
    }

    public void onClick(View view) {
        LinphoneAddress.TransportType transportType;
        if (view.getId() != C5321R.C5324id.assistant_apply) {
            return;
        }
        if (this.login.getText() == null || this.login.length() == 0 || this.password.getText() == null || this.password.length() == 0 || this.domain.getText() == null || this.domain.length() == 0) {
            Toast.makeText(getActivity(), getString(C5321R.string.first_launch_no_login_password), 1).show();
            return;
        }
        if (this.transports.getCheckedRadioButtonId() == C5321R.C5324id.transport_udp) {
            transportType = LinphoneAddress.TransportType.LinphoneTransportUdp;
        } else if (this.transports.getCheckedRadioButtonId() == C5321R.C5324id.transport_tcp) {
            transportType = LinphoneAddress.TransportType.LinphoneTransportTcp;
        } else {
            transportType = LinphoneAddress.TransportType.LinphoneTransportTls;
        }
        LinphoneAddress.TransportType transportType2 = transportType;
        if (this.domain.getText().toString().compareTo(getString(C5321R.string.default_domain)) == 0) {
            AssistantActivity.instance().displayLoginLinphone(this.login.getText().toString(), this.password.getText().toString());
        } else {
            AssistantActivity.instance().genericLogIn(this.login.getText().toString(), this.userid.getText().toString(), this.password.getText().toString(), this.displayName.getText().toString(), (String) null, this.domain.getText().toString(), transportType2);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.apply.setEnabled(!this.login.getText().toString().isEmpty() && !this.password.getText().toString().isEmpty() && !this.domain.getText().toString().isEmpty());
    }
}
