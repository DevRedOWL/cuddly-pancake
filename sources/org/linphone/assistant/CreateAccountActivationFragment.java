package org.linphone.assistant;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import org.linphone.C5321R;
import org.linphone.LinphoneManager;
import org.linphone.LinphonePreferences;
import org.linphone.core.LinphoneAccountCreator;
import org.linphone.core.LinphoneCoreFactory;

public class CreateAccountActivationFragment extends Fragment implements View.OnClickListener, LinphoneAccountCreator.LinphoneAccountCreatorListener {
    private LinphoneAccountCreator accountCreator;
    private Button checkAccount;
    private TextView email;
    private String password;
    private String username;

    public void onAccountCreatorAccountActivated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorAccountCreated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorAccountLinkedWithPhoneNumber(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorIsAccountLinked(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorIsAccountUsed(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorIsPhoneNumberUsed(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorPasswordUpdated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorPhoneAccountRecovered(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorPhoneNumberLinkActivated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5321R.layout.assistant_account_creation_email_activation, viewGroup, false);
        this.accountCreator = LinphoneCoreFactory.instance().createAccountCreator(LinphoneManager.getLc(), LinphonePreferences.instance().getXmlrpcUrl());
        this.accountCreator.setListener(this);
        this.username = getArguments().getString("Username");
        this.password = getArguments().getString("Password");
        this.accountCreator.setUsername(this.username);
        this.accountCreator.setPassword(this.password);
        this.email = (TextView) inflate.findViewById(C5321R.C5324id.send_email);
        this.email.setText(getArguments().getString("Email"));
        this.checkAccount = (Button) inflate.findViewById(C5321R.C5324id.assistant_check);
        this.checkAccount.setOnClickListener(this);
        return inflate;
    }

    public void onClick(View view) {
        if (view.getId() == C5321R.C5324id.assistant_check) {
            this.checkAccount.setEnabled(false);
            this.accountCreator.isAccountActivated();
        }
    }

    public void onAccountCreatorIsAccountActivated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
        if (AssistantActivity.instance() != null) {
            if (requestStatus.equals(LinphoneAccountCreator.RequestStatus.AccountNotActivated)) {
                Toast.makeText(getActivity(), getString(C5321R.string.assistant_account_not_validated), 1).show();
            } else if (requestStatus.equals(LinphoneAccountCreator.RequestStatus.AccountActivated)) {
                AssistantActivity.instance().linphoneLogIn(linphoneAccountCreator);
                AssistantActivity.instance().isAccountVerified(this.username);
            } else {
                Toast.makeText(getActivity(), getString(C5321R.string.wizard_server_unavailable), 1).show();
            }
            this.checkAccount.setEnabled(true);
        }
    }
}
