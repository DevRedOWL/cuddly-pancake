package org.linphone.assistant;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
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
import com.google.android.gms.common.internal.AccountType;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.linphone.C5321R;
import org.linphone.LinphoneActivity;
import org.linphone.LinphoneManager;
import org.linphone.LinphonePreferences;
import org.linphone.LinphoneUtils;
import org.linphone.core.DialPlan;
import org.linphone.core.LinphoneAccountCreator;
import org.linphone.core.LinphoneCoreFactory;

public class CreateAccountFragment extends Fragment implements CompoundButton.OnCheckedChangeListener, View.OnClickListener, LinphoneAccountCreator.LinphoneAccountCreatorListener {
    /* access modifiers changed from: private */
    public final Pattern UPPER_CASE_REGEX = Pattern.compile("[A-Z]");
    /* access modifiers changed from: private */
    public LinphoneAccountCreator accountCreator;
    private String addressSip = "";
    private TextView assisstantTitle;
    /* access modifiers changed from: private */
    public boolean confirmPasswordOk = false;
    private int countryCode;
    private Button createAccount;
    /* access modifiers changed from: private */
    public EditText dialCode;
    private EditText emailEdit;
    /* access modifiers changed from: private */
    public TextView emailError;
    private LinearLayout emailLayout;
    /* access modifiers changed from: private */
    public boolean emailOk = false;
    private TextView instruction;
    private boolean linkAccount = false;
    private EditText passwordConfirmEdit;
    /* access modifiers changed from: private */
    public TextView passwordConfirmError;
    private LinearLayout passwordConfirmLayout;
    private EditText passwordEdit;
    /* access modifiers changed from: private */
    public TextView passwordError;
    private LinearLayout passwordLayout;
    /* access modifiers changed from: private */
    public boolean passwordOk = false;
    private EditText phoneNumberEdit;
    private TextView phoneNumberError;
    private ImageView phoneNumberInfo;
    private LinearLayout phoneNumberLayout;
    /* access modifiers changed from: private */
    public Button selectCountry;
    private TextView sipUri;
    private TextView skip;
    private CheckBox useEmail;
    private CheckBox useUsername;
    private EditText usernameEdit;
    private LinearLayout usernameLayout;

    public void onAccountCreatorAccountActivated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorIsAccountLinked(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorPasswordUpdated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        View inflate = layoutInflater.inflate(C5321R.layout.assistant_account_creation, viewGroup, false);
        this.accountCreator = LinphoneCoreFactory.instance().createAccountCreator(LinphoneManager.getLc(), LinphonePreferences.instance().getXmlrpcUrl());
        this.accountCreator.setListener(this);
        this.instruction = (TextView) inflate.findViewById(C5321R.C5324id.message_create_account);
        this.createAccount = (Button) inflate.findViewById(C5321R.C5324id.assistant_create);
        this.phoneNumberLayout = (LinearLayout) inflate.findViewById(C5321R.C5324id.phone_number_layout);
        this.usernameLayout = (LinearLayout) inflate.findViewById(C5321R.C5324id.username_layout);
        this.emailLayout = (LinearLayout) inflate.findViewById(C5321R.C5324id.email_layout);
        this.passwordLayout = (LinearLayout) inflate.findViewById(C5321R.C5324id.password_layout);
        this.passwordConfirmLayout = (LinearLayout) inflate.findViewById(C5321R.C5324id.password_confirm_layout);
        this.useUsername = (CheckBox) inflate.findViewById(C5321R.C5324id.use_username);
        this.useEmail = (CheckBox) inflate.findViewById(C5321R.C5324id.use_email);
        this.usernameEdit = (EditText) inflate.findViewById(C5321R.C5324id.username);
        this.phoneNumberError = (TextView) inflate.findViewById(C5321R.C5324id.phone_number_error);
        this.phoneNumberEdit = (EditText) inflate.findViewById(C5321R.C5324id.phone_number);
        this.sipUri = (TextView) inflate.findViewById(C5321R.C5324id.sip_uri);
        this.phoneNumberInfo = (ImageView) inflate.findViewById(C5321R.C5324id.info_phone_number);
        this.selectCountry = (Button) inflate.findViewById(C5321R.C5324id.select_country);
        this.dialCode = (EditText) inflate.findViewById(C5321R.C5324id.dial_code);
        this.assisstantTitle = (TextView) inflate.findViewById(C5321R.C5324id.assistant_title);
        this.passwordError = (TextView) inflate.findViewById(C5321R.C5324id.password_error);
        this.passwordEdit = (EditText) inflate.findViewById(C5321R.C5324id.password);
        this.passwordConfirmError = (TextView) inflate.findViewById(C5321R.C5324id.confirm_password_error);
        this.passwordConfirmEdit = (EditText) inflate.findViewById(C5321R.C5324id.confirm_password);
        this.emailError = (TextView) inflate.findViewById(C5321R.C5324id.email_error);
        this.emailEdit = (EditText) inflate.findViewById(C5321R.C5324id.email);
        this.skip = (TextView) inflate.findViewById(C5321R.C5324id.assistant_skip);
        if (getResources().getBoolean(C5321R.bool.use_phone_number_validation)) {
            getActivity().getApplicationContext();
            this.countryCode = LinphoneManager.getLc().createProxyConfig().lookupCCCFromIso(((TelephonyManager) getActivity().getApplicationContext().getSystemService("phone")).getNetworkCountryIso().toUpperCase());
            this.phoneNumberLayout.setVisibility(0);
            this.phoneNumberInfo.setOnClickListener(this);
            this.selectCountry.setOnClickListener(this);
            String str3 = AssistantActivity.instance().phone_number;
            if (str3 != null) {
                this.phoneNumberEdit.setText(str3);
            }
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
            if (getResources().getBoolean(C5321R.bool.assistant_allow_username)) {
                this.useUsername.setVisibility(0);
                this.useUsername.setOnCheckedChangeListener(this);
            }
            addPhoneNumberHandler(this.phoneNumberEdit, (ImageView) null);
            addPhoneNumberHandler(this.dialCode, (ImageView) null);
        }
        if (getResources().getBoolean(C5321R.bool.isTablet) || !getResources().getBoolean(C5321R.bool.use_phone_number_validation)) {
            this.useEmail.setVisibility(0);
            this.useEmail.setOnCheckedChangeListener(this);
            if (getResources().getBoolean(C5321R.bool.pre_fill_email_in_assistant)) {
                Account[] accountsByType = AccountManager.get(getActivity()).getAccountsByType(AccountType.GOOGLE);
                int length = accountsByType.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Account account = accountsByType[i];
                    if (isEmailCorrect(account.name)) {
                        String str4 = account.name;
                        this.emailEdit.setText(str4);
                        this.accountCreator.setEmail(str4);
                        this.emailOk = true;
                        break;
                    }
                    i++;
                }
            }
            addPasswordHandler(this.passwordEdit, (ImageView) null);
            addConfirmPasswordHandler(this.passwordEdit, this.passwordConfirmEdit, (ImageView) null);
            addEmailHandler(this.emailEdit, (ImageView) null);
        }
        if (!getResources().getBoolean(C5321R.bool.use_phone_number_validation)) {
            this.useEmail.setVisibility(8);
            this.useUsername.setVisibility(8);
            this.usernameLayout.setVisibility(0);
            this.passwordLayout.setVisibility(0);
            this.passwordConfirmLayout.setVisibility(0);
            this.emailLayout.setVisibility(0);
        }
        if (getArguments().getBoolean("LinkPhoneNumber")) {
            this.linkAccount = true;
            this.useEmail.setVisibility(8);
            this.useUsername.setVisibility(8);
            this.usernameLayout.setVisibility(8);
            this.passwordLayout.setVisibility(8);
            this.passwordConfirmLayout.setVisibility(8);
            this.emailLayout.setVisibility(8);
            this.skip.setVisibility(0);
            this.skip.setOnClickListener(this);
            this.createAccount.setText(getResources().getString(C5321R.string.link_account));
            this.assisstantTitle.setText(getResources().getString(C5321R.string.link_account));
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.accountCreator.setLanguage(Locale.getDefault().toLanguageTag());
        }
        addUsernameHandler(this.usernameEdit, (ImageView) null);
        this.createAccount.setEnabled(true);
        this.createAccount.setOnClickListener(this);
        return inflate;
    }

    public void onPause() {
        super.onPause();
        this.accountCreator.setListener((LinphoneAccountCreator.LinphoneAccountCreatorListener) null);
    }

    private String getUsername() {
        EditText editText = this.usernameEdit;
        if (editText != null) {
            return editText.getText().toString().toLowerCase(Locale.getDefault());
        }
        return null;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton.getId() == C5321R.C5324id.use_username) {
            if (z) {
                this.usernameLayout.setVisibility(0);
                onTextChanged2();
                return;
            }
            this.usernameLayout.setVisibility(8);
            this.accountCreator.setUsername((String) null);
            onTextChanged2();
        } else if (compoundButton.getId() != C5321R.C5324id.use_email) {
        } else {
            if (z) {
                this.dialCode.setBackgroundResource(C5321R.C5323drawable.resizable_textfield);
                this.phoneNumberEdit.setBackgroundResource(C5321R.C5323drawable.resizable_textfield);
                this.useUsername.setEnabled(false);
                this.dialCode.setEnabled(false);
                this.selectCountry.setEnabled(false);
                this.phoneNumberEdit.setEnabled(false);
                this.emailLayout.setVisibility(0);
                this.passwordLayout.setVisibility(0);
                this.passwordConfirmLayout.setVisibility(0);
                this.usernameLayout.setVisibility(0);
                this.useUsername.setVisibility(8);
                this.phoneNumberLayout.setVisibility(8);
                this.instruction.setText(getString(C5321R.string.assistant_create_account_part_email));
                return;
            }
            if (!this.useUsername.isChecked()) {
                this.usernameLayout.setVisibility(8);
            }
            this.useUsername.setEnabled(true);
            this.dialCode.setEnabled(true);
            this.selectCountry.setEnabled(true);
            this.phoneNumberEdit.setEnabled(true);
            this.emailLayout.setVisibility(8);
            this.passwordLayout.setVisibility(8);
            this.passwordConfirmLayout.setVisibility(8);
            this.useUsername.setVisibility(0);
            this.phoneNumberLayout.setVisibility(0);
            this.instruction.setText(getString(C5321R.string.assistant_create_account_part_1));
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C5321R.C5324id.select_country) {
            AssistantActivity.instance().displayCountryChooser();
        } else if (id == C5321R.C5324id.assistant_skip) {
            if (getArguments().getBoolean("LinkFromPref")) {
                startActivity(new Intent().setClass(AssistantActivity.instance(), LinphoneActivity.class));
                AssistantActivity.instance().finish();
                return;
            }
            AssistantActivity.instance().success();
        } else if (id == C5321R.C5324id.info_phone_number) {
            if (this.linkAccount) {
                AlertDialog.Builder title = new AlertDialog.Builder(getActivity()).setTitle(getString(C5321R.string.phone_number_info_title));
                title.setMessage(getString(C5321R.string.phone_number_link_info_content) + "\n" + getString(C5321R.string.phone_number_link_info_content_already_account)).show();
                return;
            }
            new AlertDialog.Builder(getActivity()).setTitle(getString(C5321R.string.phone_number_info_title)).setMessage(getString(C5321R.string.phone_number_info_content)).show();
        } else if (id == C5321R.C5324id.assistant_create) {
            this.createAccount.setEnabled(false);
            if (this.linkAccount) {
                addAlias();
                return;
            }
            if (this.useEmail.isChecked()) {
                this.accountCreator.setPhoneNumber((String) null, (String) null);
            }
            if (!getResources().getBoolean(C5321R.bool.isTablet) || getUsername().length() > 0) {
                LinphoneManager.getLc().getConfig().loadXmlFile(LinphoneManager.getInstance().getmDynamicConfigFile());
                this.accountCreator.isAccountUsed();
                return;
            }
            LinphoneUtils.displayErrorAlert(LinphoneUtils.errorForUsernameStatus(LinphoneAccountCreator.UsernameCheck.TooShort), AssistantActivity.instance());
            this.createAccount.setEnabled(true);
        }
    }

    private boolean isEmailCorrect(String str) {
        return Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    /* access modifiers changed from: private */
    public boolean isPasswordCorrect(String str) {
        return str.length() >= 1;
    }

    private void addAlias() {
        this.accountCreator.setUsername(LinphonePreferences.instance().getAccountUsername(LinphonePreferences.instance().getDefaultAccountIndex()));
        int phoneNumber = this.accountCreator.setPhoneNumber(this.phoneNumberEdit.getText().toString(), LinphoneUtils.getCountryCode(this.dialCode));
        boolean z = phoneNumber == LinphoneAccountCreator.PhoneNumberCheck.f6351Ok.value();
        if (z) {
            this.accountCreator.linkPhoneNumberWithAccount();
            return;
        }
        this.createAccount.setEnabled(true);
        LinphoneUtils.displayErrorAlert(LinphoneUtils.errorForPhoneNumberStatus(phoneNumber), AssistantActivity.instance());
        LinphoneUtils.displayError(z, this.phoneNumberError, LinphoneUtils.errorForPhoneNumberStatus(phoneNumber));
    }

    private void createAccount() {
        String str;
        boolean z = false;
        if ((getResources().getBoolean(C5321R.bool.isTablet) || !getResources().getBoolean(C5321R.bool.use_phone_number_validation)) && this.useEmail.isChecked()) {
            LinphoneAccountCreator.PasswordCheck password = this.accountCreator.setPassword(this.passwordEdit.getText().toString());
            LinphoneAccountCreator.EmailCheck email = this.accountCreator.setEmail(this.emailEdit.getText().toString());
            if (!this.emailOk) {
                LinphoneUtils.displayError(false, this.emailError, LinphoneUtils.errorForEmailStatus(email));
                LinphoneUtils.displayErrorAlert(LinphoneUtils.errorForEmailStatus(email), AssistantActivity.instance());
            } else if (!this.passwordOk) {
                LinphoneUtils.displayError(false, this.passwordError, LinphoneUtils.errorForPasswordStatus(password));
                LinphoneUtils.displayErrorAlert(LinphoneUtils.errorForPasswordStatus(password), AssistantActivity.instance());
            } else if (!this.confirmPasswordOk) {
                if (this.passwordConfirmEdit.getText().toString().equals(this.passwordEdit.getText().toString())) {
                    str = getString(C5321R.string.wizard_password_incorrect);
                } else {
                    str = getString(C5321R.string.wizard_passwords_unmatched);
                }
                LinphoneUtils.displayError(false, this.passwordError, str);
                LinphoneUtils.displayErrorAlert(str, AssistantActivity.instance());
            } else {
                this.accountCreator.createAccount();
            }
        } else if (this.phoneNumberEdit.length() > 0 || this.dialCode.length() > 1) {
            int phoneNumber = this.accountCreator.setPhoneNumber(this.phoneNumberEdit.getText().toString(), LinphoneUtils.getCountryCode(this.dialCode));
            if (phoneNumber == LinphoneAccountCreator.PhoneNumberCheck.f6351Ok.value()) {
                z = true;
            }
            if (this.useUsername.isChecked() || this.accountCreator.getUsername() != null) {
                this.accountCreator.setUsername(this.usernameEdit.getText().toString());
                this.accountCreator.setPhoneNumber(this.phoneNumberEdit.getText().toString(), this.dialCode.getText().toString());
            } else {
                LinphoneAccountCreator linphoneAccountCreator = this.accountCreator;
                linphoneAccountCreator.setUsername(linphoneAccountCreator.getPhoneNumber());
            }
            if (z) {
                this.accountCreator.createAccount();
            } else {
                LinphoneUtils.displayErrorAlert(LinphoneUtils.errorForPhoneNumberStatus(phoneNumber), AssistantActivity.instance());
                LinphoneUtils.displayError(z, this.phoneNumberError, LinphoneUtils.errorForPhoneNumberStatus(phoneNumber));
            }
        } else {
            LinphoneUtils.displayErrorAlert(getString(C5321R.string.assistant_create_account_part_1), AssistantActivity.instance());
        }
        this.createAccount.setEnabled(true);
    }

    private int getPhoneNumberStatus() {
        int phoneNumber = this.accountCreator.setPhoneNumber(this.phoneNumberEdit.getText().toString(), LinphoneUtils.getCountryCode(this.dialCode));
        this.addressSip = this.accountCreator.getPhoneNumber();
        return phoneNumber;
    }

    public void onTextChanged2() {
        this.accountCreator.setUsername(getUsername());
        String str = "";
        if (this.useEmail.isChecked() || !getResources().getBoolean(C5321R.bool.use_phone_number_validation)) {
            this.addressSip = getUsername();
            if (this.addressSip.length() > 0) {
                str = getResources().getString(C5321R.string.assistant_create_account_phone_number_address) + " <sip:" + this.addressSip + "@" + getResources().getString(C5321R.string.default_domain) + ">";
            }
        } else {
            int phoneNumberStatus = getPhoneNumberStatus();
            boolean z = phoneNumberStatus == LinphoneAccountCreator.PhoneNumberCheck.f6351Ok.value();
            LinphoneUtils.displayError(z, this.phoneNumberError, LinphoneUtils.errorForPhoneNumberStatus(phoneNumberStatus));
            if (getResources().getBoolean(C5321R.bool.assistant_allow_username) && this.useUsername.isChecked()) {
                this.addressSip = getUsername();
            }
            if (z) {
                this.dialCode.setBackgroundResource(C5321R.C5323drawable.resizable_textfield);
                this.phoneNumberEdit.setBackgroundResource(C5321R.C5323drawable.resizable_textfield);
                if (!this.linkAccount && this.addressSip.length() > 0) {
                    str = getResources().getString(C5321R.string.assistant_create_account_phone_number_address) + " <" + this.addressSip + "@" + getResources().getString(C5321R.string.default_domain) + ">";
                }
            } else if (phoneNumberStatus == LinphoneAccountCreator.PhoneNumberCheck.CountryCodeInvalid.value()) {
                this.dialCode.setBackgroundResource(C5321R.C5323drawable.resizable_textfield_error);
                this.phoneNumberEdit.setBackgroundResource(C5321R.C5323drawable.resizable_textfield);
            } else {
                this.dialCode.setBackgroundResource(C5321R.C5323drawable.resizable_textfield);
                this.phoneNumberEdit.setBackgroundResource(C5321R.C5323drawable.resizable_textfield_error);
            }
        }
        this.sipUri.setText(str);
    }

    private void addPhoneNumberHandler(final EditText editText, ImageView imageView) {
        editText.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                if (editText.equals(CreateAccountFragment.this.dialCode)) {
                    DialPlan countryFromCountryCode = AssistantActivity.instance().getCountryListAdapter().getCountryFromCountryCode(CreateAccountFragment.this.dialCode.getText().toString());
                    if (countryFromCountryCode != null) {
                        AssistantActivity.instance().country = countryFromCountryCode;
                        CreateAccountFragment.this.selectCountry.setText(countryFromCountryCode.getCountryName());
                        return;
                    }
                    CreateAccountFragment.this.selectCountry.setText(C5321R.string.select_your_country);
                }
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                CreateAccountFragment.this.onTextChanged2();
            }
        });
    }

    private void addUsernameHandler(EditText editText, ImageView imageView) {
        editText.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                Matcher matcher = CreateAccountFragment.this.UPPER_CASE_REGEX.matcher(editable);
                while (matcher.find()) {
                    editable.replace(matcher.start(), matcher.end(), editable.subSequence(matcher.start(), matcher.end()).toString().toLowerCase());
                }
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                CreateAccountFragment.this.onTextChanged2();
            }
        });
    }

    private void addEmailHandler(final EditText editText, ImageView imageView) {
        editText.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                boolean unused = CreateAccountFragment.this.emailOk = false;
                LinphoneAccountCreator.EmailCheck email = CreateAccountFragment.this.accountCreator.setEmail(editText.getText().toString());
                if (email.equals(LinphoneAccountCreator.EmailCheck.f6348Ok)) {
                    boolean unused2 = CreateAccountFragment.this.emailOk = true;
                    LinphoneUtils.displayError(CreateAccountFragment.this.emailOk, CreateAccountFragment.this.emailError, "");
                    return;
                }
                LinphoneUtils.displayError(CreateAccountFragment.this.emailOk, CreateAccountFragment.this.emailError, LinphoneUtils.errorForEmailStatus(email));
            }
        });
    }

    private void addPasswordHandler(final EditText editText, ImageView imageView) {
        editText.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                boolean unused = CreateAccountFragment.this.passwordOk = false;
                LinphoneAccountCreator.PasswordCheck password = CreateAccountFragment.this.accountCreator.setPassword(editText.getText().toString());
                if (CreateAccountFragment.this.isPasswordCorrect(editText.getText().toString())) {
                    boolean unused2 = CreateAccountFragment.this.passwordOk = true;
                    LinphoneUtils.displayError(CreateAccountFragment.this.passwordOk, CreateAccountFragment.this.passwordError, "");
                    return;
                }
                LinphoneUtils.displayError(CreateAccountFragment.this.passwordOk, CreateAccountFragment.this.passwordError, LinphoneUtils.errorForPasswordStatus(password));
            }
        });
    }

    private void addConfirmPasswordHandler(final EditText editText, final EditText editText2, ImageView imageView) {
        C54075 r3 = new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                boolean unused = CreateAccountFragment.this.confirmPasswordOk = false;
                if (editText.getText().toString().equals(editText2.getText().toString())) {
                    boolean unused2 = CreateAccountFragment.this.confirmPasswordOk = true;
                    if (!CreateAccountFragment.this.isPasswordCorrect(editText.getText().toString())) {
                        LinphoneUtils.displayError(CreateAccountFragment.this.passwordOk, CreateAccountFragment.this.passwordError, CreateAccountFragment.this.getString(C5321R.string.wizard_password_incorrect));
                    } else {
                        LinphoneUtils.displayError(CreateAccountFragment.this.confirmPasswordOk, CreateAccountFragment.this.passwordConfirmError, "");
                    }
                } else {
                    LinphoneUtils.displayError(CreateAccountFragment.this.confirmPasswordOk, CreateAccountFragment.this.passwordConfirmError, CreateAccountFragment.this.getString(C5321R.string.wizard_passwords_unmatched));
                }
            }
        };
        editText.addTextChangedListener(r3);
        editText2.addTextChangedListener(r3);
    }

    public void onAccountCreatorIsAccountUsed(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
        if (!requestStatus.equals(LinphoneAccountCreator.RequestStatus.AccountExist) && !requestStatus.equals(LinphoneAccountCreator.RequestStatus.AccountExistWithAlias)) {
            createAccount();
        } else if (this.useEmail.isChecked()) {
            this.createAccount.setEnabled(true);
            LinphoneUtils.displayErrorAlert(LinphoneUtils.errorForRequestStatus(requestStatus), AssistantActivity.instance());
        } else {
            LinphoneManager.getLc().getConfig().loadXmlFile(LinphoneManager.getInstance().getmDynamicConfigFile());
            linphoneAccountCreator.isPhoneNumberUsed();
        }
    }

    public void onAccountCreatorAccountCreated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
        if (!requestStatus.equals(LinphoneAccountCreator.RequestStatus.AccountCreated)) {
            this.createAccount.setEnabled(true);
            LinphoneUtils.displayErrorAlert(LinphoneUtils.errorForRequestStatus(requestStatus), AssistantActivity.instance());
        } else if (this.useEmail.isChecked() || !getResources().getBoolean(C5321R.bool.use_phone_number_validation)) {
            AssistantActivity.instance().displayAssistantConfirm(getUsername(), this.passwordEdit.getText().toString(), this.emailEdit.getText().toString());
        } else {
            AssistantActivity.instance().displayAssistantCodeConfirm(getUsername(), this.phoneNumberEdit.getText().toString(), LinphoneUtils.getCountryCode(this.dialCode), false);
        }
    }

    public void onAccountCreatorAccountLinkedWithPhoneNumber(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
        if (AssistantActivity.instance() != null && requestStatus.equals(LinphoneAccountCreator.RequestStatus.f6352Ok)) {
            AssistantActivity.instance().displayAssistantCodeConfirm(getUsername(), this.phoneNumberEdit.getText().toString(), LinphoneUtils.getCountryCode(this.dialCode), false);
        }
    }

    public void onAccountCreatorPhoneNumberLinkActivated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
        if (AssistantActivity.instance() != null && requestStatus.equals(LinphoneAccountCreator.RequestStatus.f6352Ok)) {
            AssistantActivity.instance().displayAssistantCodeConfirm(getUsername(), this.phoneNumberEdit.getText().toString(), LinphoneUtils.getCountryCode(this.dialCode), false);
        }
    }

    public void onAccountCreatorIsAccountActivated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
        if (AssistantActivity.instance() != null) {
            if (!requestStatus.equals(LinphoneAccountCreator.RequestStatus.AccountNotActivated)) {
                this.createAccount.setEnabled(true);
                LinphoneUtils.displayErrorAlert(LinphoneUtils.errorForRequestStatus(requestStatus), AssistantActivity.instance());
            } else if (!getResources().getBoolean(C5321R.bool.isTablet) && getResources().getBoolean(C5321R.bool.use_phone_number_validation)) {
                linphoneAccountCreator.recoverPhoneAccount();
            }
        }
    }

    public void onAccountCreatorPhoneAccountRecovered(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
        if (AssistantActivity.instance() != null) {
            if (requestStatus.equals(LinphoneAccountCreator.RequestStatus.f6352Ok)) {
                AssistantActivity.instance().displayAssistantCodeConfirm(getUsername(), this.phoneNumberEdit.getText().toString(), this.dialCode.getText().toString(), false);
                return;
            }
            this.createAccount.setEnabled(true);
            LinphoneUtils.displayErrorAlert(getString(C5321R.string.request_failed), AssistantActivity.instance());
        }
    }

    public void onAccountCreatorIsPhoneNumberUsed(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
        if (AssistantActivity.instance() != null) {
            if (!requestStatus.equals(LinphoneAccountCreator.RequestStatus.AliasIsAccount) && !requestStatus.equals(LinphoneAccountCreator.RequestStatus.AliasExist)) {
                this.accountCreator.isAccountActivated();
            } else if (this.accountCreator.getPhoneNumber() == null || this.accountCreator.getUsername() == null || this.accountCreator.getPhoneNumber().compareTo(this.accountCreator.getUsername()) != 0) {
                this.createAccount.setEnabled(true);
                LinphoneUtils.displayErrorAlert(LinphoneUtils.errorForRequestStatus(requestStatus), AssistantActivity.instance());
            } else {
                this.accountCreator.isAccountActivated();
            }
        }
    }
}
