package org.linphone.purchase;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;
import org.linphone.C5321R;
import org.linphone.LinphoneManager;
import org.linphone.LinphonePreferences;

public class InAppPurchaseFragment extends Fragment implements View.OnClickListener {
    /* access modifiers changed from: private */
    public Button buyItemButton;
    private String defaultEmail;
    private String defaultUsername;
    private EditText email;
    private boolean emailOk = false;
    private TextView errorMessage;
    /* access modifiers changed from: private */
    public Button recoverAccountButton;
    private EditText username;
    private LinearLayout usernameLayout;
    /* access modifiers changed from: private */
    public boolean usernameOk = false;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreate(bundle);
        View inflate = layoutInflater.inflate(C5321R.layout.in_app_store, viewGroup, false);
        Purchasable purchasedItem = InAppPurchaseActivity.instance().getPurchasedItem(getArguments().getString(FirebaseAnalytics.Param.ITEM_ID));
        this.buyItemButton = (Button) inflate.findViewById(C5321R.C5324id.inapp_button);
        displayBuySubscriptionButton(purchasedItem);
        this.defaultEmail = InAppPurchaseActivity.instance().getGmailAccount();
        this.defaultUsername = LinphonePreferences.instance().getAccountUsername(LinphonePreferences.instance().getDefaultAccountIndex());
        this.usernameLayout = (LinearLayout) inflate.findViewById(C5321R.C5324id.username_layout);
        this.username = (EditText) inflate.findViewById(C5321R.C5324id.username);
        boolean z = true;
        if (!getResources().getBoolean(C5321R.bool.hide_username_in_inapp)) {
            this.usernameLayout.setVisibility(0);
            this.username.setText(LinphonePreferences.instance().getAccountUsername(LinphonePreferences.instance().getDefaultAccountIndex()));
            addUsernameHandler(this.username, this.errorMessage);
        } else if (this.defaultUsername != null) {
            this.usernameLayout.setVisibility(8);
            this.usernameOk = true;
        }
        this.email = (EditText) inflate.findViewById(C5321R.C5324id.email);
        String str = this.defaultEmail;
        if (str != null) {
            this.email.setText(str);
            this.emailOk = true;
        }
        Button button = this.buyItemButton;
        if (!this.emailOk || !this.usernameOk) {
            z = false;
        }
        button.setEnabled(z);
        this.errorMessage = (TextView) inflate.findViewById(C5321R.C5324id.username_error);
        return inflate;
    }

    private void addUsernameHandler(EditText editText, final TextView textView) {
        editText.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                boolean unused = InAppPurchaseFragment.this.usernameOk = false;
                if (InAppPurchaseFragment.this.isUsernameCorrect(charSequence.toString())) {
                    boolean unused2 = InAppPurchaseFragment.this.usernameOk = true;
                    textView.setText("");
                } else {
                    textView.setText(C5321R.string.wizard_username_incorrect);
                }
                if (InAppPurchaseFragment.this.buyItemButton != null) {
                    InAppPurchaseFragment.this.buyItemButton.setEnabled(InAppPurchaseFragment.this.usernameOk);
                }
                if (InAppPurchaseFragment.this.recoverAccountButton != null) {
                    InAppPurchaseFragment.this.recoverAccountButton.setEnabled(InAppPurchaseFragment.this.usernameOk);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public boolean isUsernameCorrect(String str) {
        return LinphoneManager.getLc().createProxyConfig().isPhoneNumber(str);
    }

    private void displayBuySubscriptionButton(Purchasable purchasable) {
        Button button = this.buyItemButton;
        button.setText("Buy account (" + purchasable.getPrice() + ")");
        this.buyItemButton.setTag(purchasable);
        this.buyItemButton.setOnClickListener(this);
        this.buyItemButton.setEnabled(this.usernameOk && this.emailOk);
    }

    public void onClick(View view) {
        Purchasable purchasable = (Purchasable) view.getTag();
        if (!view.equals(this.recoverAccountButton)) {
            InAppPurchaseActivity.instance().buyInapp(getUsername(), purchasable);
        }
    }

    private String getUsername() {
        return LinphoneManager.getLc().createProxyConfig().normalizePhoneNumber(this.username.getText().toString()).toLowerCase(Locale.getDefault());
    }
}
