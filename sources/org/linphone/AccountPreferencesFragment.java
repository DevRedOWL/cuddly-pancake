package org.linphone;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.List;
import org.linphone.LinphonePreferences;
import org.linphone.assistant.AssistantActivity;
import org.linphone.core.LinphoneAccountCreator;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.LinphoneCoreFactory;
import org.linphone.core.LinphoneNatPolicy;
import org.linphone.core.LinphoneProxyConfig;
import org.linphone.mediastream.Log;
import org.linphone.p054ui.PreferencesListFragment;

public class AccountPreferencesFragment extends PreferencesListFragment implements LinphoneAccountCreator.LinphoneAccountCreatorListener {
    /* access modifiers changed from: private */
    public LinphoneAccountCreator accountCreator;
    Preference.OnPreferenceChangeListener avpfChangedListener = new Preference.OnPreferenceChangeListener() {
        public boolean onPreferenceChange(Preference preference, Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (AccountPreferencesFragment.this.isNewAccount) {
                AccountPreferencesFragment.this.builder.setAvpfEnabled(booleanValue);
                return true;
            }
            AccountPreferencesFragment.this.mPrefs.enableAvpf(AccountPreferencesFragment.this.f6315n, booleanValue);
            return true;
        }
    };
    Preference.OnPreferenceChangeListener avpfRRIntervalChangedListener = new Preference.OnPreferenceChangeListener() {
        public boolean onPreferenceChange(Preference preference, Object obj) {
            String obj2 = obj.toString();
            try {
                int parseInt = Integer.parseInt(obj2);
                if (parseInt < 1 || parseInt > 5) {
                    return false;
                }
            } catch (NumberFormatException unused) {
            }
            if (!AccountPreferencesFragment.this.isNewAccount) {
                AccountPreferencesFragment.this.mPrefs.setAvpfRRInterval(AccountPreferencesFragment.this.f6315n, obj2);
            }
            preference.setSummary(obj2);
            return true;
        }
    };
    /* access modifiers changed from: private */
    public LinphonePreferences.AccountBuilder builder;
    Preference.OnPreferenceChangeListener disableChangedListener = new Preference.OnPreferenceChangeListener() {
        public boolean onPreferenceChange(Preference preference, Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (AccountPreferencesFragment.this.isNewAccount) {
                AccountPreferencesFragment.this.builder.setEnabled(!booleanValue);
            } else {
                AccountPreferencesFragment.this.mPrefs.setAccountEnabled(AccountPreferencesFragment.this.f6315n, !booleanValue);
            }
            return true;
        }
    };
    Preference.OnPreferenceChangeListener displayNameChangedListener = new Preference.OnPreferenceChangeListener() {
        public boolean onPreferenceChange(Preference preference, Object obj) {
            if (AccountPreferencesFragment.this.isNewAccount) {
                AccountPreferencesFragment.this.builder.setDisplayName(obj.toString());
            } else {
                AccountPreferencesFragment.this.mPrefs.setAccountDisplayName(AccountPreferencesFragment.this.f6315n, obj.toString());
            }
            preference.setSummary(obj.toString());
            return true;
        }
    };
    Preference.OnPreferenceChangeListener domainChangedListener = new Preference.OnPreferenceChangeListener() {
        public boolean onPreferenceChange(Preference preference, Object obj) {
            if (AccountPreferencesFragment.isEditTextEmpty(obj.toString())) {
                return false;
            }
            if (AccountPreferencesFragment.this.isNewAccount) {
                AccountPreferencesFragment.this.builder.setDomain(obj.toString());
            } else {
                AccountPreferencesFragment.this.mPrefs.setAccountDomain(AccountPreferencesFragment.this.f6315n, obj.toString());
            }
            preference.setSummary(obj.toString());
            return true;
        }
    };
    Preference.OnPreferenceChangeListener escapeChangedListener = new Preference.OnPreferenceChangeListener() {
        public boolean onPreferenceChange(Preference preference, Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (AccountPreferencesFragment.this.isNewAccount) {
                return true;
            }
            AccountPreferencesFragment.this.mPrefs.setReplacePlusByZeroZero(AccountPreferencesFragment.this.f6315n, booleanValue);
            return true;
        }
    };
    Preference.OnPreferenceChangeListener expiresChangedListener = new Preference.OnPreferenceChangeListener() {
        public boolean onPreferenceChange(Preference preference, Object obj) {
            if (AccountPreferencesFragment.this.isNewAccount) {
                AccountPreferencesFragment.this.builder.setExpires(obj.toString());
            } else {
                AccountPreferencesFragment.this.mPrefs.setExpires(AccountPreferencesFragment.this.f6315n, obj.toString());
            }
            preference.setSummary(obj.toString());
            return true;
        }
    };
    Preference.OnPreferenceChangeListener iceChangedListener = new Preference.OnPreferenceChangeListener() {
        public boolean onPreferenceChange(Preference preference, Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (AccountPreferencesFragment.this.isNewAccount) {
                return true;
            }
            AccountPreferencesFragment.this.mPrefs.setAccountIce(AccountPreferencesFragment.this.f6315n, booleanValue);
            ((CheckBoxPreference) preference).setChecked(AccountPreferencesFragment.this.mPrefs.getAccountIce(AccountPreferencesFragment.this.f6315n));
            return true;
        }
    };
    /* access modifiers changed from: private */
    public boolean isNewAccount = false;
    Preference.OnPreferenceClickListener linkAccountListener = new Preference.OnPreferenceClickListener() {
        public boolean onPreferenceClick(Preference preference) {
            Intent intent = new Intent();
            intent.setClass(LinphoneActivity.instance(), AssistantActivity.class);
            intent.putExtra("LinkPhoneNumber", true);
            intent.putExtra("FromPref", true);
            intent.putExtra("AccountNumber", AccountPreferencesFragment.this.f6315n);
            AccountPreferencesFragment.this.startActivity(intent);
            return true;
        }
    };
    /* access modifiers changed from: private */
    public LinphonePreferences mPrefs = LinphonePreferences.instance();
    /* access modifiers changed from: private */
    public EditTextPreference mProxyPreference;
    /* access modifiers changed from: private */
    public ListPreference mTransportPreference;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f6315n;
    Preference.OnPreferenceChangeListener outboundProxyChangedListener = new Preference.OnPreferenceChangeListener() {
        public boolean onPreferenceChange(Preference preference, Object obj) {
            if (AccountPreferencesFragment.this.isNewAccount) {
                AccountPreferencesFragment.this.builder.setOutboundProxyEnabled(((Boolean) obj).booleanValue());
                return true;
            }
            AccountPreferencesFragment.this.mPrefs.setAccountOutboundProxyEnabled(AccountPreferencesFragment.this.f6315n, ((Boolean) obj).booleanValue());
            return true;
        }
    };
    Preference.OnPreferenceChangeListener passwordChangedListener = new Preference.OnPreferenceChangeListener() {
        public boolean onPreferenceChange(Preference preference, Object obj) {
            if (AccountPreferencesFragment.isEditTextEmpty(obj.toString())) {
                return false;
            }
            if (AccountPreferencesFragment.this.isNewAccount) {
                AccountPreferencesFragment.this.builder.setPassword(obj.toString());
                return true;
            }
            AccountPreferencesFragment.this.mPrefs.setAccountPassword(AccountPreferencesFragment.this.f6315n, obj.toString());
            return true;
        }
    };
    Preference.OnPreferenceChangeListener prefixChangedListener = new Preference.OnPreferenceChangeListener() {
        public boolean onPreferenceChange(Preference preference, Object obj) {
            String obj2 = obj.toString();
            preference.setSummary(obj2);
            if (AccountPreferencesFragment.this.isNewAccount) {
                AccountPreferencesFragment.this.builder.setPrefix(obj2);
                return true;
            }
            AccountPreferencesFragment.this.mPrefs.setPrefix(AccountPreferencesFragment.this.f6315n, obj2);
            return true;
        }
    };
    /* access modifiers changed from: private */
    public ProgressDialog progress;
    Preference.OnPreferenceChangeListener proxyChangedListener = new Preference.OnPreferenceChangeListener() {
        public boolean onPreferenceChange(Preference preference, Object obj) {
            String obj2 = obj.toString();
            if (AccountPreferencesFragment.this.isNewAccount) {
                AccountPreferencesFragment.this.builder.setProxy(obj.toString());
                preference.setSummary(obj.toString());
                return true;
            }
            AccountPreferencesFragment.this.mPrefs.setAccountProxy(AccountPreferencesFragment.this.f6315n, obj2);
            preference.setSummary(AccountPreferencesFragment.this.mPrefs.getAccountProxy(AccountPreferencesFragment.this.f6315n));
            if (AccountPreferencesFragment.this.mTransportPreference == null) {
                return true;
            }
            AccountPreferencesFragment.this.mTransportPreference.setSummary(AccountPreferencesFragment.this.mPrefs.getAccountTransportString(AccountPreferencesFragment.this.f6315n));
            AccountPreferencesFragment.this.mTransportPreference.setValue(AccountPreferencesFragment.this.mPrefs.getAccountTransportKey(AccountPreferencesFragment.this.f6315n));
            return true;
        }
    };
    Preference.OnPreferenceChangeListener stunTurnChangedListener = new Preference.OnPreferenceChangeListener() {
        public boolean onPreferenceChange(Preference preference, Object obj) {
            String obj2 = obj.toString();
            if (AccountPreferencesFragment.this.isNewAccount) {
                return true;
            }
            AccountPreferencesFragment.this.mPrefs.setAccountStunServer(AccountPreferencesFragment.this.f6315n, obj2);
            preference.setSummary(obj2);
            return true;
        }
    };
    Preference.OnPreferenceChangeListener transportChangedListener = new Preference.OnPreferenceChangeListener() {
        public boolean onPreferenceChange(Preference preference, Object obj) {
            String obj2 = obj.toString();
            if (AccountPreferencesFragment.this.isNewAccount) {
                return true;
            }
            AccountPreferencesFragment.this.mPrefs.setAccountTransport(AccountPreferencesFragment.this.f6315n, obj2);
            preference.setSummary(AccountPreferencesFragment.this.mPrefs.getAccountTransportString(AccountPreferencesFragment.this.f6315n));
            preference.setDefaultValue(AccountPreferencesFragment.this.mPrefs.getAccountTransportKey(AccountPreferencesFragment.this.f6315n));
            if (AccountPreferencesFragment.this.mProxyPreference == null) {
                return true;
            }
            String accountProxy = AccountPreferencesFragment.this.mPrefs.getAccountProxy(AccountPreferencesFragment.this.f6315n);
            AccountPreferencesFragment.this.mProxyPreference.setSummary(accountProxy);
            AccountPreferencesFragment.this.mProxyPreference.setText(accountProxy);
            return true;
        }
    };
    Preference.OnPreferenceChangeListener useridChangedListener = new Preference.OnPreferenceChangeListener() {
        public boolean onPreferenceChange(Preference preference, Object obj) {
            if (AccountPreferencesFragment.this.isNewAccount) {
                AccountPreferencesFragment.this.builder.setUserId(obj.toString());
            } else {
                AccountPreferencesFragment.this.mPrefs.setAccountUserId(AccountPreferencesFragment.this.f6315n, obj.toString());
            }
            preference.setSummary(obj.toString());
            return true;
        }
    };
    Preference.OnPreferenceChangeListener usernameChangedListener = new Preference.OnPreferenceChangeListener() {
        public boolean onPreferenceChange(Preference preference, Object obj) {
            if (AccountPreferencesFragment.isEditTextEmpty(obj.toString())) {
                return false;
            }
            if (AccountPreferencesFragment.this.isNewAccount) {
                AccountPreferencesFragment.this.builder.setUsername(obj.toString());
            } else {
                AccountPreferencesFragment.this.mPrefs.setAccountUsername(AccountPreferencesFragment.this.f6315n, obj.toString());
            }
            preference.setSummary(obj.toString());
            return true;
        }
    };

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

    public void onAccountCreatorIsAccountUsed(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorIsPhoneNumberUsed(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorPhoneAccountRecovered(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public void onAccountCreatorPhoneNumberLinkActivated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
    }

    public AccountPreferencesFragment() {
        super(C5321R.xml.account_preferences);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        this.f6315n = getArguments().getInt("Account", 0);
        if (this.f6315n == this.mPrefs.getAccountCount()) {
            this.isNewAccount = true;
            this.builder = new LinphonePreferences.AccountBuilder(LinphoneManager.getLc());
        }
        initAccountPreferencesFields(preferenceScreen);
        getActivity().getWindow().setSoftInputMode(3);
    }

    public static boolean isEditTextEmpty(String str) {
        return str.equals("");
    }

    private void initAccountPreferencesFields(PreferenceScreen preferenceScreen) {
        LinphoneNatPolicy linphoneNatPolicy;
        boolean z = this.mPrefs.getDefaultAccountIndex() == this.f6315n;
        if (LinphoneManager.getLcIfManagerNotDestroyedOrNull() == null || LinphoneManager.getLc().getProxyConfigList() == null || LinphoneManager.getLc().getProxyConfigList().length <= this.f6315n) {
            linphoneNatPolicy = null;
        } else {
            LinphoneProxyConfig linphoneProxyConfig = LinphoneManager.getLc().getProxyConfigList()[this.f6315n];
            linphoneNatPolicy = linphoneProxyConfig.getNatPolicy();
            if (linphoneNatPolicy == null) {
                linphoneNatPolicy = LinphoneManager.getLc().createNatPolicy();
                linphoneProxyConfig.edit();
                linphoneProxyConfig.setNatPolicy(linphoneNatPolicy);
                linphoneProxyConfig.done();
            }
        }
        this.accountCreator = LinphoneCoreFactory.instance().createAccountCreator(LinphoneManager.getLc(), LinphonePreferences.instance().getXmlrpcUrl());
        this.accountCreator.setListener(this);
        PreferenceCategory preferenceCategory = (PreferenceCategory) getPreferenceScreen().findPreference(getString(C5321R.string.pref_sipaccount_key));
        EditTextPreference editTextPreference = (EditTextPreference) preferenceCategory.getPreference(0);
        editTextPreference.setOnPreferenceChangeListener(this.usernameChangedListener);
        if (!this.isNewAccount) {
            editTextPreference.setText(this.mPrefs.getAccountUsername(this.f6315n));
            editTextPreference.setSummary(editTextPreference.getText());
        }
        EditTextPreference editTextPreference2 = (EditTextPreference) preferenceCategory.getPreference(1);
        editTextPreference2.setOnPreferenceChangeListener(this.useridChangedListener);
        if (!this.isNewAccount) {
            editTextPreference2.setText(this.mPrefs.getAccountUserId(this.f6315n));
            editTextPreference2.setSummary(editTextPreference2.getText());
        }
        EditTextPreference editTextPreference3 = (EditTextPreference) preferenceCategory.getPreference(2);
        editTextPreference3.setOnPreferenceChangeListener(this.passwordChangedListener);
        if (!this.isNewAccount) {
            editTextPreference3.setText(this.mPrefs.getAccountPassword(this.f6315n));
        }
        EditTextPreference editTextPreference4 = (EditTextPreference) preferenceCategory.getPreference(3);
        editTextPreference4.setOnPreferenceChangeListener(this.domainChangedListener);
        if (!this.isNewAccount) {
            editTextPreference4.setText(this.mPrefs.getAccountDomain(this.f6315n));
            editTextPreference4.setSummary(editTextPreference4.getText());
        }
        EditTextPreference editTextPreference5 = (EditTextPreference) preferenceCategory.getPreference(4);
        editTextPreference5.setOnPreferenceChangeListener(this.displayNameChangedListener);
        if (!this.isNewAccount) {
            editTextPreference5.setText(this.mPrefs.getAccountDisplayName(this.f6315n));
            editTextPreference5.setSummary(editTextPreference5.getText());
        }
        PreferenceCategory preferenceCategory2 = (PreferenceCategory) getPreferenceScreen().findPreference(getString(C5321R.string.pref_advanced_key));
        this.mTransportPreference = (ListPreference) preferenceCategory2.getPreference(0);
        initializeTransportPreference(this.mTransportPreference);
        this.mTransportPreference.setOnPreferenceChangeListener(this.transportChangedListener);
        if (!this.isNewAccount) {
            this.mTransportPreference.setSummary(this.mPrefs.getAccountTransportString(this.f6315n));
        }
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preferenceCategory2.getPreference(1);
        checkBoxPreference.setOnPreferenceChangeListener(this.iceChangedListener);
        if (linphoneNatPolicy != null) {
            checkBoxPreference.setChecked(linphoneNatPolicy.iceEnabled());
        }
        EditTextPreference editTextPreference6 = (EditTextPreference) preferenceCategory2.getPreference(2);
        editTextPreference6.setOnPreferenceChangeListener(this.stunTurnChangedListener);
        if (linphoneNatPolicy != null) {
            editTextPreference6.setText(linphoneNatPolicy.getStunServer());
            editTextPreference6.setSummary(linphoneNatPolicy.getStunServer());
        }
        this.mProxyPreference = (EditTextPreference) preferenceCategory2.getPreference(3);
        this.mProxyPreference.setOnPreferenceChangeListener(this.proxyChangedListener);
        if (!this.isNewAccount) {
            this.mProxyPreference.setText(this.mPrefs.getAccountProxy(this.f6315n));
            EditTextPreference editTextPreference7 = this.mProxyPreference;
            editTextPreference7.setSummary(("".equals(editTextPreference7.getText()) || this.mProxyPreference.getText() == null) ? getString(C5321R.string.pref_help_proxy) : this.mProxyPreference.getText());
        }
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) preferenceCategory2.getPreference(4);
        checkBoxPreference2.setOnPreferenceChangeListener(this.outboundProxyChangedListener);
        if (!this.isNewAccount) {
            checkBoxPreference2.setChecked(this.mPrefs.isAccountOutboundProxySet(this.f6315n));
        }
        EditTextPreference editTextPreference8 = (EditTextPreference) preferenceCategory2.getPreference(5);
        editTextPreference8.setOnPreferenceChangeListener(this.expiresChangedListener);
        if (!this.isNewAccount) {
            editTextPreference8.setText(this.mPrefs.getExpires(this.f6315n));
            editTextPreference8.setSummary(this.mPrefs.getExpires(this.f6315n));
        }
        EditTextPreference editTextPreference9 = (EditTextPreference) preferenceCategory2.getPreference(6);
        editTextPreference9.setOnPreferenceChangeListener(this.prefixChangedListener);
        if (!this.isNewAccount) {
            String prefix = this.mPrefs.getPrefix(this.f6315n);
            editTextPreference9.setText(prefix);
            editTextPreference9.setSummary(prefix);
        }
        CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) preferenceCategory2.getPreference(7);
        checkBoxPreference3.setOnPreferenceChangeListener(this.avpfChangedListener);
        if (!this.isNewAccount) {
            checkBoxPreference3.setChecked(this.mPrefs.avpfEnabled(this.f6315n));
        }
        EditTextPreference editTextPreference10 = (EditTextPreference) preferenceCategory2.getPreference(8);
        editTextPreference10.setOnPreferenceChangeListener(this.avpfRRIntervalChangedListener);
        if (!this.isNewAccount) {
            editTextPreference10.setText(this.mPrefs.getAvpfRRInterval(this.f6315n));
            editTextPreference10.setSummary(this.mPrefs.getAvpfRRInterval(this.f6315n));
        }
        CheckBoxPreference checkBoxPreference4 = (CheckBoxPreference) preferenceCategory2.getPreference(9);
        checkBoxPreference4.setOnPreferenceChangeListener(this.escapeChangedListener);
        if (!this.isNewAccount) {
            checkBoxPreference4.setChecked(this.mPrefs.getReplacePlusByZeroZero(this.f6315n));
        }
        preferenceCategory2.getPreference(10).setOnPreferenceClickListener(this.linkAccountListener);
        PreferenceCategory preferenceCategory3 = (PreferenceCategory) getPreferenceScreen().findPreference(getString(C5321R.string.pref_manage_key));
        final CheckBoxPreference checkBoxPreference5 = (CheckBoxPreference) preferenceCategory3.getPreference(0);
        checkBoxPreference5.setEnabled(true);
        checkBoxPreference5.setOnPreferenceChangeListener(this.disableChangedListener);
        if (!this.isNewAccount) {
            checkBoxPreference5.setChecked(!this.mPrefs.isAccountEnabled(this.f6315n));
        }
        CheckBoxPreference checkBoxPreference6 = (CheckBoxPreference) preferenceCategory3.getPreference(1);
        checkBoxPreference6.setChecked(z);
        checkBoxPreference6.setEnabled(!checkBoxPreference6.isChecked());
        checkBoxPreference6.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            public boolean onPreferenceClick(Preference preference) {
                AccountPreferencesFragment.this.mPrefs.setDefaultAccount(AccountPreferencesFragment.this.f6315n);
                checkBoxPreference5.setEnabled(false);
                checkBoxPreference5.setChecked(false);
                preference.setEnabled(false);
                return true;
            }
        });
        if (!this.isNewAccount) {
            checkBoxPreference6.setEnabled(!checkBoxPreference6.isChecked());
        }
        Preference preference = preferenceCategory3.getPreference(2);
        if (this.mPrefs.getAccountDomain(this.f6315n).compareTo(getString(C5321R.string.default_domain)) == 0) {
            preference.setEnabled(!this.isNewAccount);
            preference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
                public boolean onPreferenceClick(Preference preference) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(LinphoneActivity.instance());
                    View inflate = LinphoneActivity.instance().getLayoutInflater().inflate(C5321R.layout.new_password, (ViewGroup) null);
                    final EditText editText = (EditText) inflate.findViewById(C5321R.C5324id.password1);
                    final EditText editText2 = (EditText) inflate.findViewById(C5321R.C5324id.password2);
                    builder.setNeutralButton(C5321R.string.cancel, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    builder.setPositiveButton(C5321R.string.f6327ok, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            LinphoneAccountCreator.PasswordCheck password = AccountPreferencesFragment.this.accountCreator.setPassword(editText.getText().toString());
                            if (!password.equals(LinphoneAccountCreator.PasswordCheck.f6350Ok)) {
                                LinphoneUtils.displayErrorAlert(LinphoneUtils.errorForPasswordStatus(password), LinphoneActivity.instance());
                            } else if (editText.getText().toString().compareTo(editText2.getText().toString()) == 0) {
                                AccountPreferencesFragment.this.accountCreator.setUsername(AccountPreferencesFragment.this.mPrefs.getAccountUsername(AccountPreferencesFragment.this.f6315n));
                                AccountPreferencesFragment.this.accountCreator.setHa1(AccountPreferencesFragment.this.mPrefs.getAccountHa1(AccountPreferencesFragment.this.f6315n));
                                LinphoneAccountCreator.RequestStatus updatePassword = AccountPreferencesFragment.this.accountCreator.updatePassword(editText.getText().toString());
                                if (!updatePassword.equals(LinphoneAccountCreator.RequestStatus.f6352Ok)) {
                                    LinphoneUtils.displayErrorAlert(LinphoneUtils.errorForRequestStatus(updatePassword), LinphoneActivity.instance());
                                    return;
                                }
                                ProgressDialog unused = AccountPreferencesFragment.this.progress = ProgressDialog.show(LinphoneActivity.instance(), (CharSequence) null, (CharSequence) null);
                                ColorDrawable colorDrawable = new ColorDrawable(ContextCompat.getColor(LinphoneActivity.instance(), C5321R.C5322color.colorE));
                                colorDrawable.setAlpha(200);
                                AccountPreferencesFragment.this.progress.getWindow().setLayout(-1, -1);
                                AccountPreferencesFragment.this.progress.getWindow().setBackgroundDrawable(colorDrawable);
                                AccountPreferencesFragment.this.progress.setContentView(C5321R.layout.progress_dialog);
                                AccountPreferencesFragment.this.progress.show();
                            } else {
                                LinphoneUtils.displayErrorAlert(AccountPreferencesFragment.this.getString(C5321R.string.wizard_passwords_unmatched), LinphoneActivity.instance());
                            }
                        }
                    });
                    builder.setView(inflate);
                    builder.show();
                    return true;
                }
            });
        } else {
            preference.setEnabled(false);
        }
        Preference preference2 = preferenceCategory3.getPreference(3);
        preference2.setEnabled(!this.isNewAccount);
        preference2.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            public boolean onPreferenceClick(Preference preference) {
                AccountPreferencesFragment.this.mPrefs.deleteAccount(AccountPreferencesFragment.this.f6315n);
                LinphoneActivity.instance().displaySettings();
                LinphoneActivity.instance().refreshAccounts();
                return true;
            }
        });
    }

    private void initializeTransportPreference(ListPreference listPreference) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(getString(C5321R.string.pref_transport_udp));
        arrayList2.add(getString(C5321R.string.pref_transport_udp_key));
        arrayList.add(getString(C5321R.string.pref_transport_tcp));
        arrayList2.add(getString(C5321R.string.pref_transport_tcp_key));
        if (!getResources().getBoolean(C5321R.bool.disable_all_security_features_for_markets)) {
            arrayList.add(getString(C5321R.string.pref_transport_tls));
            arrayList2.add(getString(C5321R.string.pref_transport_tls_key));
        }
        setListPreferenceValues(listPreference, arrayList, arrayList2);
        if (!this.isNewAccount) {
            listPreference.setSummary(this.mPrefs.getAccountTransportString(this.f6315n));
            listPreference.setDefaultValue(this.mPrefs.getAccountTransportKey(this.f6315n));
            listPreference.setValueIndex(arrayList.indexOf(this.mPrefs.getAccountTransportString(this.f6315n)));
            return;
        }
        listPreference.setSummary(getString(C5321R.string.pref_transport_udp));
        listPreference.setDefaultValue(getString(C5321R.string.pref_transport_udp));
        listPreference.setValueIndex(arrayList.indexOf(getString(C5321R.string.pref_transport_udp)));
    }

    private static void setListPreferenceValues(ListPreference listPreference, List<CharSequence> list, List<CharSequence> list2) {
        CharSequence[] charSequenceArr = new CharSequence[list.size()];
        list.toArray(charSequenceArr);
        listPreference.setEntries(charSequenceArr);
        CharSequence[] charSequenceArr2 = new CharSequence[list2.size()];
        list2.toArray(charSequenceArr2);
        listPreference.setEntryValues(charSequenceArr2);
    }

    public void onResume() {
        super.onResume();
        if (LinphoneActivity.isInstanciated()) {
            LinphoneActivity.instance().selectMenu(FragmentsAvailable.SETTINGS);
        }
    }

    public void onPause() {
        super.onPause();
        if (LinphoneActivity.isInstanciated()) {
            try {
                if (this.isNewAccount) {
                    this.builder.saveNewAccount();
                }
            } catch (LinphoneCoreException e) {
                Log.m6903e(e);
            }
            LinphoneActivity.instance().isNewProxyConfig();
            LinphoneManager.getLc().refreshRegisters();
            LinphoneActivity.instance().hideTopBar();
        }
    }

    public void onAccountCreatorPasswordUpdated(LinphoneAccountCreator linphoneAccountCreator, LinphoneAccountCreator.RequestStatus requestStatus) {
        ProgressDialog progressDialog = this.progress;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (requestStatus.equals(LinphoneAccountCreator.RequestStatus.f6352Ok)) {
            this.mPrefs.setAccountPassword(this.f6315n, linphoneAccountCreator.getPassword());
            ((EditTextPreference) ((PreferenceCategory) getPreferenceScreen().findPreference(getString(C5321R.string.pref_sipaccount_key))).getPreference(2)).setText(this.mPrefs.getAccountPassword(this.f6315n));
            LinphoneUtils.displayErrorAlert(getString(C5321R.string.pref_password_changed), LinphoneActivity.instance());
            return;
        }
        LinphoneUtils.displayErrorAlert(LinphoneUtils.errorForRequestStatus(requestStatus), LinphoneActivity.instance());
    }
}
