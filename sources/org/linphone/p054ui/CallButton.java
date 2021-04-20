package org.linphone.p054ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import org.linphone.C5321R;
import org.linphone.LinphoneManager;
import org.linphone.LinphonePreferences;
import org.linphone.core.CallDirection;
import org.linphone.core.LinphoneCallLog;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.LinphoneProxyConfig;

/* renamed from: org.linphone.ui.CallButton */
public class CallButton extends ImageView implements View.OnClickListener, AddressAware {
    private AddressText mAddress;

    public void setAddressWidget(AddressText addressText) {
        this.mAddress = addressText;
    }

    public void setExternalClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void resetClickListener() {
        setOnClickListener(this);
    }

    public CallButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnClickListener(this);
    }

    public void onClick(View view) {
        try {
            if (LinphoneManager.getInstance().acceptCallIfIncomingPending()) {
                return;
            }
            if (this.mAddress.getText().length() > 0) {
                LinphoneManager.getInstance().newOutgoingCall(this.mAddress);
            } else if (LinphonePreferences.instance().isBisFeatureEnabled()) {
                LinphoneCallLog[] callLogs = LinphoneManager.getLc().getCallLogs();
                LinphoneCallLog linphoneCallLog = null;
                int length = callLogs.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    LinphoneCallLog linphoneCallLog2 = callLogs[i];
                    if (linphoneCallLog2.getDirection() == CallDirection.Outgoing) {
                        linphoneCallLog = linphoneCallLog2;
                        break;
                    }
                    i++;
                }
                if (linphoneCallLog != null) {
                    LinphoneProxyConfig defaultProxyConfig = LinphoneManager.getLc().getDefaultProxyConfig();
                    if (defaultProxyConfig == null || !linphoneCallLog.getTo().getDomain().equals(defaultProxyConfig.getDomain())) {
                        this.mAddress.setText(linphoneCallLog.getTo().asStringUriOnly());
                    } else {
                        this.mAddress.setText(linphoneCallLog.getTo().getUserName());
                    }
                    this.mAddress.setSelection(this.mAddress.getText().toString().length());
                    this.mAddress.setDisplayedName(linphoneCallLog.getTo().getDisplayName());
                }
            }
        } catch (LinphoneCoreException unused) {
            LinphoneManager.getInstance().terminateCall();
            onWrongDestinationAddress();
        }
    }

    /* access modifiers changed from: protected */
    public void onWrongDestinationAddress() {
        Toast.makeText(getContext(), String.format(getResources().getString(C5321R.string.warning_wrong_destination_address), new Object[]{this.mAddress.getText().toString()}), 1).show();
    }
}
