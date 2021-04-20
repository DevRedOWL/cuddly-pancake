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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import org.linphone.C5321R;
import org.linphone.LinphoneManager;
import org.linphone.LinphonePreferences;
import org.linphone.core.LinphoneAccountCreator;
import org.linphone.core.LinphoneCoreFactory;

public class CreateAccountCodeActivationFragment extends Fragment implements LinphoneAccountCreator.LinphoneAccountCreatorListener {
    /* access modifiers changed from: private */
    public LinphoneAccountCreator accountCreator;
    private int accountNumber;
    private ImageView back;
    /* access modifiers changed from: private */
    public Button checkAccount;
    /* access modifiers changed from: private */
    public EditText code;
    /* access modifiers changed from: private */
    public int code_length;
    private String dialcode;
    /* access modifiers changed from: private */
    public boolean linkAccount = false;
    private String phone;
    private TextView phonenumber;
    private boolean recoverAccount = false;
    private TextView title;
    private String username;

    public void onAccountCreatorAccountCreated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorAccountLinkedWithPhoneNumber(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorIsAccountActivated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
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

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5321R.layout.assistant_account_creation_code_activation, viewGroup, false);
        this.username = getArguments().getString("Username");
        this.phone = getArguments().getString("Phone");
        this.dialcode = getArguments().getString("Dialcode");
        this.recoverAccount = getArguments().getBoolean("RecoverAccount");
        this.linkAccount = getArguments().getBoolean("LinkAccount");
        this.accountNumber = getArguments().getInt("AccountNumber");
        this.code_length = LinphonePreferences.instance().getCodeLength();
        this.accountCreator = LinphoneCoreFactory.instance().createAccountCreator(LinphoneManager.getLc(), LinphonePreferences.instance().getXmlrpcUrl());
        this.accountCreator.setListener(this);
        this.accountCreator.setUsername(this.username);
        this.accountCreator.setPhoneNumber(this.phone, this.dialcode);
        this.back = (ImageView) inflate.findViewById(C5321R.C5324id.back);
        ImageView imageView = this.back;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        this.title = (TextView) inflate.findViewById(C5321R.C5324id.title_account_activation);
        if (this.linkAccount) {
            this.title.setText(getString(C5321R.string.assistant_link_account));
        } else if (this.recoverAccount) {
            this.title.setText(getString(C5321R.string.assistant_linphone_account));
        }
        this.phonenumber = (TextView) inflate.findViewById(C5321R.C5324id.send_phone_number);
        this.phonenumber.setText(this.accountCreator.getPhoneNumber());
        this.code = (EditText) inflate.findViewById(C5321R.C5324id.assistant_code);
        this.code.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                if (editable.length() == CreateAccountCodeActivationFragment.this.code_length) {
                    CreateAccountCodeActivationFragment.this.checkAccount.setEnabled(true);
                } else {
                    CreateAccountCodeActivationFragment.this.checkAccount.setEnabled(false);
                }
            }
        });
        this.checkAccount = (Button) inflate.findViewById(C5321R.C5324id.assistant_check);
        this.checkAccount.setEnabled(false);
        this.checkAccount.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                CreateAccountCodeActivationFragment.this.checkAccount.setEnabled(false);
                CreateAccountCodeActivationFragment.this.accountCreator.setActivationCode(CreateAccountCodeActivationFragment.this.code.getText().toString());
                if (CreateAccountCodeActivationFragment.this.linkAccount) {
                    CreateAccountCodeActivationFragment.this.linkAccount();
                } else {
                    CreateAccountCodeActivationFragment.this.activateAccount();
                }
            }
        });
        return inflate;
    }

    /* access modifiers changed from: private */
    public void linkAccount() {
        this.accountCreator.setUsername(LinphonePreferences.instance().getAccountUsername(this.accountNumber));
        this.accountCreator.setHa1(LinphonePreferences.instance().getAccountHa1(this.accountNumber));
        this.accountCreator.activatePhoneNumberLink();
    }

    /* access modifiers changed from: private */
    public void activateAccount() {
        if (this.accountCreator.getUsername() == null) {
            LinphoneAccountCreator linphoneAccountCreator = this.accountCreator;
            linphoneAccountCreator.setUsername(linphoneAccountCreator.getPhoneNumber());
        }
        this.accountCreator.activateAccount();
    }

    public void onAccountCreatorAccountActivated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
        if (AssistantActivity.instance() != null) {
            if (requestStatus.equals(LinphoneAccountCreator.RequestStatus.AccountActivated)) {
                this.checkAccount.setEnabled(true);
                if (linphoneAccountCreator.getUsername() != null) {
                    AssistantActivity.instance().linphoneLogIn(linphoneAccountCreator);
                    if (!this.recoverAccount) {
                        AssistantActivity.instance().isAccountVerified(linphoneAccountCreator.getUsername());
                    } else {
                        AssistantActivity.instance().success();
                    }
                } else {
                    AssistantActivity.instance().linphoneLogIn(linphoneAccountCreator);
                    if (!this.recoverAccount) {
                        AssistantActivity.instance().isAccountVerified(linphoneAccountCreator.getPhoneNumber());
                    } else {
                        AssistantActivity.instance().success();
                    }
                }
            } else if (requestStatus.equals(LinphoneAccountCreator.RequestStatus.Failed)) {
                Toast.makeText(getActivity(), getString(C5321R.string.wizard_server_unavailable), 1).show();
            } else {
                Toast.makeText(getActivity(), getString(C5321R.string.assistant_error_confirmation_code), 1).show();
                AssistantActivity.instance().displayAssistantLinphoneLogin(this.phone, this.dialcode);
            }
        }
    }

    public void onAccountCreatorPhoneNumberLinkActivated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
        if (AssistantActivity.instance() != null && requestStatus.equals(LinphoneAccountCreator.RequestStatus.AccountActivated)) {
            LinphonePreferences.instance().setPrefix(this.accountNumber, linphoneAccountCreator.getPrefix(linphoneAccountCreator.getPhoneNumber()));
            LinphonePreferences.instance().setLinkPopupTime("");
            AssistantActivity.instance().hideKeyboard();
            AssistantActivity.instance().success();
        }
    }
}
