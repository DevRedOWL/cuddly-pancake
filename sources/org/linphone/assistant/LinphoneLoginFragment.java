package org.linphone.assistant;

import android.app.AlertDialog;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.linphone.C5321R;
import org.linphone.LinphoneManager;
import org.linphone.LinphonePreferences;
import org.linphone.LinphoneUtils;
import org.linphone.compatibility.Compatibility;
import org.linphone.core.DialPlan;
import org.linphone.core.LinphoneAccountCreator;
import org.linphone.core.LinphoneCoreFactory;

public class LinphoneLoginFragment extends Fragment implements CompoundButton.OnCheckedChangeListener, View.OnClickListener, TextWatcher, LinphoneAccountCreator.LinphoneAccountCreatorListener {
    private LinphoneAccountCreator accountCreator;
    private Button apply;
    private int countryCode;
    /* access modifiers changed from: private */
    public EditText dialCode;
    private String dialcode;
    private TextView forgotPassword;
    private EditText login;
    private TextView messagePhoneNumber;
    private EditText password;
    private LinearLayout passwordLayout;
    private String phone;
    private EditText phoneNumberEdit;
    private TextView phoneNumberError;
    private ImageView phoneNumberInfo;
    private LinearLayout phoneNumberLayout;
    private String pwd;
    private Boolean recoverAccount;
    /* access modifiers changed from: private */
    public Button selectCountry;
    private CheckBox useUsername;
    private String username;
    private LinearLayout usernameLayout;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onAccountCreatorAccountActivated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorAccountCreated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorAccountLinkedWithPhoneNumber(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorIsAccountActivated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorIsAccountLinked(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorPasswordUpdated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorPhoneNumberLinkActivated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        View inflate = layoutInflater.inflate(C5321R.layout.assistant_linphone_login, viewGroup, false);
        this.accountCreator = LinphoneCoreFactory.instance().createAccountCreator(LinphoneManager.getLc(), LinphonePreferences.instance().getXmlrpcUrl());
        this.accountCreator.setListener(this);
        this.login = (EditText) inflate.findViewById(C5321R.C5324id.assistant_username);
        this.login.addTextChangedListener(this);
        this.recoverAccount = true;
        this.dialCode = (EditText) inflate.findViewById(C5321R.C5324id.dial_code);
        this.phoneNumberEdit = (EditText) inflate.findViewById(C5321R.C5324id.phone_number);
        this.phoneNumberLayout = (LinearLayout) inflate.findViewById(C5321R.C5324id.phone_number_layout);
        this.phoneNumberError = (TextView) inflate.findViewById(C5321R.C5324id.phone_number_error_2);
        this.phoneNumberInfo = (ImageView) inflate.findViewById(C5321R.C5324id.info_phone_number);
        this.useUsername = (CheckBox) inflate.findViewById(C5321R.C5324id.use_username);
        this.usernameLayout = (LinearLayout) inflate.findViewById(C5321R.C5324id.username_layout);
        this.passwordLayout = (LinearLayout) inflate.findViewById(C5321R.C5324id.password_layout);
        this.password = (EditText) inflate.findViewById(C5321R.C5324id.assistant_password);
        this.messagePhoneNumber = (TextView) inflate.findViewById(C5321R.C5324id.message_phone_number);
        this.forgotPassword = (TextView) inflate.findViewById(C5321R.C5324id.forgot_password);
        this.selectCountry = (Button) inflate.findViewById(C5321R.C5324id.select_country);
        this.apply = (Button) inflate.findViewById(C5321R.C5324id.assistant_apply);
        this.apply.setEnabled(true);
        this.apply.setOnClickListener(this);
        if (getResources().getBoolean(C5321R.bool.use_phone_number_validation)) {
            this.messagePhoneNumber.setText(getString(C5321R.string.assistant_create_account_part_1));
            this.phone = getArguments().getString("Phone");
            this.dialcode = getArguments().getString("Dialcode");
            getActivity().getApplicationContext();
            this.countryCode = LinphoneManager.getLc().createProxyConfig().lookupCCCFromIso(((TelephonyManager) getActivity().getApplicationContext().getSystemService("phone")).getNetworkCountryIso().toUpperCase());
            DialPlan dialPlan = AssistantActivity.instance().country;
            if (dialPlan != null) {
                this.selectCountry.setText(dialPlan.getCountryName());
                EditText editText = this.dialCode;
                if (dialPlan.getCountryCallingCode().contains("+")) {
                    str2 = dialPlan.getCountryCallingCode();
                } else {
                    str2 = "+" + dialPlan.getCountryCallingCode();
                }
                editText.setText(str2);
            } else {
                DialPlan countryFromCountryCode = AssistantActivity.instance().getCountryListAdapter().getCountryFromCountryCode(String.valueOf(this.countryCode));
                if (countryFromCountryCode != null) {
                    this.selectCountry.setText(countryFromCountryCode.getCountryName());
                    EditText editText2 = this.dialCode;
                    if (countryFromCountryCode.getCountryCallingCode().contains("+")) {
                        str = countryFromCountryCode.getCountryCallingCode();
                    } else {
                        str = "+" + countryFromCountryCode.getCountryCallingCode();
                    }
                    editText2.setText(str);
                }
            }
            this.phoneNumberLayout.setVisibility(0);
            this.selectCountry.setOnClickListener(this);
            this.phoneNumberInfo.setOnClickListener(this);
            String str3 = AssistantActivity.instance().phone_number;
            if (str3 != null) {
                this.phoneNumberEdit.setText(str3);
            }
            if (getResources().getBoolean(C5321R.bool.assistant_allow_username)) {
                this.useUsername.setVisibility(0);
                this.useUsername.setOnCheckedChangeListener(this);
            }
            String str4 = this.phone;
            if (str4 != null) {
                this.phoneNumberEdit.setText(str4);
            }
            if (this.dialcode != null) {
                this.dialCode.setText("+" + this.dialcode);
            }
        }
        if (getResources().getBoolean(C5321R.bool.assistant_allow_username)) {
            this.useUsername.setVisibility(0);
            this.useUsername.setOnCheckedChangeListener(this);
            this.password.addTextChangedListener(this);
            this.forgotPassword.setText(Compatibility.fromHtml("<a href=\"" + "http://linphone.org/free-sip-service.html&action=recover" + "\"'>" + getString(C5321R.string.forgot_password) + "</a>"));
            this.forgotPassword.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (!getResources().getBoolean(C5321R.bool.use_phone_number_validation)) {
            this.phoneNumberLayout.setVisibility(8);
            this.useUsername.setVisibility(8);
            this.usernameLayout.setVisibility(0);
            this.passwordLayout.setVisibility(0);
        }
        this.username = getArguments().getString("Username");
        this.pwd = getArguments().getString("Password");
        if (!(this.username == null || this.pwd == null)) {
            this.useUsername.setChecked(true);
            onCheckedChanged(this.useUsername, true);
            this.login.setText(this.username);
            this.password.setText(this.pwd);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.accountCreator.setLanguage(Locale.getDefault().toLanguageTag());
        }
        addPhoneNumberHandler(this.dialCode, (ImageView) null);
        addPhoneNumberHandler(this.phoneNumberEdit, (ImageView) null);
        return inflate;
    }

    public void linphoneLogIn() {
        if (this.login.getText() == null || this.login.length() == 0 || this.password.getText() == null || this.password.length() == 0) {
            LinphoneUtils.displayErrorAlert(getString(C5321R.string.first_launch_no_login_password), AssistantActivity.instance());
            this.apply.setEnabled(true);
            return;
        }
        this.accountCreator.setUsername(this.login.getText().toString());
        this.accountCreator.setPassword(this.password.getText().toString());
        this.accountCreator.isAccountUsed();
    }

    private int getPhoneNumberStatus() {
        return this.accountCreator.setPhoneNumber(this.phoneNumberEdit.getText().toString(), LinphoneUtils.getCountryCode(this.dialCode));
    }

    private void addPhoneNumberHandler(final EditText editText, ImageView imageView) {
        editText.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                if (editText.equals(LinphoneLoginFragment.this.dialCode)) {
                    DialPlan countryFromCountryCode = AssistantActivity.instance().getCountryListAdapter().getCountryFromCountryCode(LinphoneLoginFragment.this.dialCode.getText().toString());
                    if (countryFromCountryCode != null) {
                        AssistantActivity.instance().country = countryFromCountryCode;
                        LinphoneLoginFragment.this.selectCountry.setText(countryFromCountryCode.getCountryName());
                        return;
                    }
                    LinphoneLoginFragment.this.selectCountry.setText(C5321R.string.select_your_country);
                }
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                LinphoneLoginFragment.this.onTextChanged2();
            }
        });
    }

    public void onResume() {
        super.onResume();
        CheckBox checkBox = this.useUsername;
        if (checkBox == null || !checkBox.isChecked()) {
            this.recoverAccount = true;
        } else {
            this.recoverAccount = false;
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C5321R.C5324id.assistant_apply) {
            this.apply.setEnabled(false);
            if (this.recoverAccount.booleanValue()) {
                recoverAccount();
            } else {
                linphoneLogIn();
            }
        } else if (id == C5321R.C5324id.info_phone_number) {
            new AlertDialog.Builder(getActivity()).setTitle(getString(C5321R.string.phone_number_info_title)).setMessage(getString(C5321R.string.phone_number_link_info_content)).show();
        } else if (id == C5321R.C5324id.select_country) {
            AssistantActivity.instance().displayCountryChooser();
        }
    }

    private void recoverAccount() {
        if (this.phoneNumberEdit.length() > 0 || this.dialCode.length() > 1) {
            int phoneNumberStatus = getPhoneNumberStatus();
            boolean z = phoneNumberStatus == LinphoneAccountCreator.PhoneNumberCheck.f6351Ok.value();
            if (z) {
                LinphoneManager.getLc().getConfig().loadXmlFile(LinphoneManager.getInstance().getmDynamicConfigFile());
                this.accountCreator.isPhoneNumberUsed();
                return;
            }
            this.apply.setEnabled(true);
            LinphoneUtils.displayErrorAlert(LinphoneUtils.errorForPhoneNumberStatus(phoneNumberStatus), AssistantActivity.instance());
            LinphoneUtils.displayError(z, this.phoneNumberError, LinphoneUtils.errorForPhoneNumberStatus(phoneNumberStatus));
            return;
        }
        this.apply.setEnabled(true);
        LinphoneUtils.displayErrorAlert(getString(C5321R.string.assistant_create_account_part_1), AssistantActivity.instance());
    }

    public void onTextChanged2() {
        int phoneNumberStatus = getPhoneNumberStatus();
        boolean z = phoneNumberStatus == LinphoneAccountCreator.PhoneNumberCheck.f6351Ok.value();
        LinphoneUtils.displayError(z, this.phoneNumberError, LinphoneUtils.errorForPhoneNumberStatus(phoneNumberStatus));
        if (z) {
            this.accountCreator.setPhoneNumber(this.phoneNumberEdit.getText().toString(), this.dialCode.getText().toString());
            this.dialCode.setBackgroundResource(C5321R.C5323drawable.resizable_textfield);
            this.phoneNumberEdit.setBackgroundResource(C5321R.C5323drawable.resizable_textfield);
        } else if (1 == (phoneNumberStatus & LinphoneAccountCreator.PhoneNumberCheck.CountryCodeInvalid.value())) {
            this.dialCode.setBackgroundResource(C5321R.C5323drawable.resizable_textfield_error);
            this.phoneNumberEdit.setBackgroundResource(C5321R.C5323drawable.resizable_textfield);
        } else {
            this.dialCode.setBackgroundResource(C5321R.C5323drawable.resizable_textfield);
            this.phoneNumberEdit.setBackgroundResource(C5321R.C5323drawable.resizable_textfield_error);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        onTextChanged2();
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton.getId() != C5321R.C5324id.use_username) {
            return;
        }
        if (z) {
            this.usernameLayout.setVisibility(0);
            this.passwordLayout.setVisibility(0);
            this.phoneNumberEdit.setVisibility(8);
            this.phoneNumberLayout.setVisibility(8);
            this.messagePhoneNumber.setText(getString(C5321R.string.assistant_linphone_login_desc));
            this.recoverAccount = false;
            return;
        }
        this.usernameLayout.setVisibility(8);
        this.passwordLayout.setVisibility(8);
        this.phoneNumberEdit.setVisibility(0);
        this.phoneNumberLayout.setVisibility(0);
        this.messagePhoneNumber.setText(getString(C5321R.string.assistant_create_account_part_1));
        this.recoverAccount = true;
    }

    public void onAccountCreatorIsAccountUsed(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
        if (AssistantActivity.instance() == null) {
            this.apply.setEnabled(true);
            return;
        }
        if (requestStatus.equals(LinphoneAccountCreator.RequestStatus.AccountExist) || requestStatus.equals(LinphoneAccountCreator.RequestStatus.AccountExistWithAlias)) {
            AssistantActivity.instance().linphoneLogIn(linphoneAccountCreator);
        } else {
            LinphoneUtils.displayErrorAlert(LinphoneUtils.errorForRequestStatus(requestStatus), AssistantActivity.instance());
        }
        this.apply.setEnabled(true);
    }

    public void onAccountCreatorPhoneAccountRecovered(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
        if (AssistantActivity.instance() == null) {
            this.apply.setEnabled(true);
        } else if (requestStatus.equals(LinphoneAccountCreator.RequestStatus.ErrorServer)) {
            LinphoneUtils.displayErrorAlert(LinphoneUtils.errorForRequestStatus(LinphoneAccountCreator.RequestStatus.Failed), AssistantActivity.instance());
            this.apply.setEnabled(true);
        } else {
            AssistantActivity.instance().displayAssistantCodeConfirm(linphoneAccountCreator.getUsername(), this.phoneNumberEdit.getText().toString(), LinphoneUtils.getCountryCode(this.dialCode), true);
        }
    }

    public void onAccountCreatorIsPhoneNumberUsed(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
        if (AssistantActivity.instance() == null) {
            this.apply.setEnabled(true);
        } else if (requestStatus.equals(LinphoneAccountCreator.RequestStatus.AliasIsAccount) || requestStatus.equals(LinphoneAccountCreator.RequestStatus.AliasExist)) {
            linphoneAccountCreator.recoverPhoneAccount();
        } else {
            this.apply.setEnabled(true);
            LinphoneUtils.displayErrorAlert(LinphoneUtils.errorForRequestStatus(requestStatus), AssistantActivity.instance());
        }
    }
}
