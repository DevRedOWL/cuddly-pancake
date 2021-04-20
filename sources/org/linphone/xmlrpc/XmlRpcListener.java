package org.linphone.xmlrpc;

public interface XmlRpcListener {
    void onAccountActivated(String str);

    void onAccountActivatedFetched(boolean z);

    void onAccountCreated(String str);

    void onAccountEmailChanged(String str);

    void onAccountExpireFetched(String str);

    void onAccountExpireUpdated(String str);

    void onAccountFetched(boolean z);

    void onAccountPasswordChanged(String str);

    void onActivateAccountLinkSent(String str);

    void onError(String str);

    void onRecoverPasswordLinkSent(String str);

    void onRemoteProvisioningFilenameSent(String str);

    void onSignatureVerified(boolean z);

    void onTrialAccountFetched(boolean z);

    void onUsernameSent(String str);
}
