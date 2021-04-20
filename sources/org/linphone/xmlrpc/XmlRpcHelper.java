package org.linphone.xmlrpc;

import org.linphone.LinphoneManager;
import org.linphone.LinphonePreferences;
import org.linphone.core.LinphoneXmlRpcRequest;
import org.linphone.core.LinphoneXmlRpcRequestImpl;
import org.linphone.core.LinphoneXmlRpcSession;
import org.linphone.core.LinphoneXmlRpcSessionImpl;
import org.linphone.mediastream.Log;

public class XmlRpcHelper {
    public static final String CLIENT_ERROR_INVALID_SERVER_URL = "INVALID_SERVER_URL";
    public static final String CLIENT_ERROR_SERVER_NOT_REACHABLE = "SERVER_NOT_REACHABLE";
    public static final String SERVER_ERROR_ACCOUNT_ALREADY_EXISTS = "ERROR_ACCOUNT_ALREADY_EXISTS";
    public static final String SERVER_ERROR_ACCOUNT_DOESNT_EXIST = "ERROR_ACCOUNT_DOESNT_EXIST";
    public static final String SERVER_ERROR_INCORRECT_PHONE_NUMBER = "ERROR_PHONE_ISNT_E164";
    public static final String SERVER_ERROR_INVALID_ACCOUNT = "ERROR_INVALID_ACCOUNT";
    public static final String SERVER_ERROR_PURCHASE_CANCELLED = "ERROR_PURCHASE_CANCELLED";
    public static final String SERVER_ERROR_RECEIPT_PARSING_FAILED = "ERROR_RECEIPT_PARSING_FAILED";
    public static final String SERVER_ERROR_SIGNATURE_VERIFICATION_FAILED = "ERROR_SIGNATURE_VERIFICATION_FAILED";
    public static final String SERVER_ERROR_UID_ALREADY_IN_USE = "ERROR_UID_ALREADY_IN_USE";
    public static final String SERVER_ERROR_UNKNOWN_ERROR = "ERROR_UNKNOWN_ERROR";
    public static final String SERVER_RESPONSE_OK = "OK";
    private LinphoneXmlRpcSession xmlRpcSession = new LinphoneXmlRpcSessionImpl(LinphoneManager.getLcIfManagerNotDestroyedOrNull(), LinphonePreferences.instance().getInAppPurchaseValidatingServerUrl());

    public void createAccountAsync(final XmlRpcListener xmlRpcListener, String str, String str2, String str3) {
        LinphoneXmlRpcRequestImpl linphoneXmlRpcRequestImpl = new LinphoneXmlRpcRequestImpl("create_account", LinphoneXmlRpcRequest.ArgType.String);
        linphoneXmlRpcRequestImpl.setListener(new LinphoneXmlRpcRequest.LinphoneXmlRpcRequestListener() {
            public void onXmlRpcRequestResponse(LinphoneXmlRpcRequest linphoneXmlRpcRequest) {
                String stringResponse = linphoneXmlRpcRequest.getStringResponse();
                if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.f6356Ok) {
                    if (stringResponse.startsWith("ERROR_")) {
                        Log.m6903e(stringResponse);
                        xmlRpcListener.onError(stringResponse);
                        return;
                    }
                    xmlRpcListener.onAccountCreated(stringResponse);
                } else if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.Failed) {
                    Log.m6903e(stringResponse);
                    xmlRpcListener.onError(stringResponse);
                }
            }
        });
        linphoneXmlRpcRequestImpl.addStringArg(str);
        linphoneXmlRpcRequestImpl.addStringArg(str2);
        if (str3 == null) {
            str3 = "";
        }
        linphoneXmlRpcRequestImpl.addStringArg(str3);
        this.xmlRpcSession.sendRequest(linphoneXmlRpcRequestImpl);
    }

    public void getAccountExpireAsync(final XmlRpcListener xmlRpcListener, String str, String str2) {
        LinphoneXmlRpcRequestImpl linphoneXmlRpcRequestImpl = new LinphoneXmlRpcRequestImpl("get_account_expiration", LinphoneXmlRpcRequest.ArgType.String);
        linphoneXmlRpcRequestImpl.setListener(new LinphoneXmlRpcRequest.LinphoneXmlRpcRequestListener() {
            public void onXmlRpcRequestResponse(LinphoneXmlRpcRequest linphoneXmlRpcRequest) {
                String stringResponse = linphoneXmlRpcRequest.getStringResponse();
                if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.f6356Ok) {
                    if (stringResponse.startsWith("ERROR_")) {
                        Log.m6903e(stringResponse);
                        xmlRpcListener.onError(stringResponse);
                        return;
                    }
                    xmlRpcListener.onAccountExpireFetched(stringResponse);
                } else if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.Failed) {
                    Log.m6903e(stringResponse);
                    xmlRpcListener.onError(stringResponse);
                }
            }
        });
        linphoneXmlRpcRequestImpl.addStringArg(str);
        linphoneXmlRpcRequestImpl.addStringArg(str2);
        this.xmlRpcSession.sendRequest(linphoneXmlRpcRequestImpl);
    }

    public void updateAccountExpireAsync(final XmlRpcListener xmlRpcListener, String str, String str2, String str3, String str4, String str5) {
        LinphoneXmlRpcRequestImpl linphoneXmlRpcRequestImpl = new LinphoneXmlRpcRequestImpl("update_expiration_date", LinphoneXmlRpcRequest.ArgType.String);
        linphoneXmlRpcRequestImpl.setListener(new LinphoneXmlRpcRequest.LinphoneXmlRpcRequestListener() {
            public void onXmlRpcRequestResponse(LinphoneXmlRpcRequest linphoneXmlRpcRequest) {
                String stringResponse = linphoneXmlRpcRequest.getStringResponse();
                if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.f6356Ok) {
                    if (stringResponse.startsWith("ERROR_")) {
                        Log.m6903e(stringResponse);
                        xmlRpcListener.onError(stringResponse);
                        return;
                    }
                    xmlRpcListener.onAccountExpireUpdated(stringResponse);
                } else if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.Failed) {
                    Log.m6903e(stringResponse);
                    xmlRpcListener.onError(stringResponse);
                }
            }
        });
        linphoneXmlRpcRequestImpl.addStringArg(str);
        linphoneXmlRpcRequestImpl.addStringArg(str2);
        linphoneXmlRpcRequestImpl.addStringArg(str3);
        linphoneXmlRpcRequestImpl.addStringArg(str4);
        linphoneXmlRpcRequestImpl.addStringArg(str5);
        this.xmlRpcSession.sendRequest(linphoneXmlRpcRequestImpl);
    }

    public void activateAccountAsync(final XmlRpcListener xmlRpcListener, String str, String str2) {
        LinphoneXmlRpcRequestImpl linphoneXmlRpcRequestImpl = new LinphoneXmlRpcRequestImpl("activate_account", LinphoneXmlRpcRequest.ArgType.String);
        linphoneXmlRpcRequestImpl.setListener(new LinphoneXmlRpcRequest.LinphoneXmlRpcRequestListener() {
            public void onXmlRpcRequestResponse(LinphoneXmlRpcRequest linphoneXmlRpcRequest) {
                String stringResponse = linphoneXmlRpcRequest.getStringResponse();
                if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.f6356Ok) {
                    if (stringResponse.startsWith("ERROR_")) {
                        Log.m6903e(stringResponse);
                        xmlRpcListener.onError(stringResponse);
                        return;
                    }
                    xmlRpcListener.onAccountActivated(stringResponse);
                } else if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.Failed) {
                    Log.m6903e(stringResponse);
                    xmlRpcListener.onError(stringResponse);
                }
            }
        });
        linphoneXmlRpcRequestImpl.addStringArg(str);
        linphoneXmlRpcRequestImpl.addStringArg(str2);
        this.xmlRpcSession.sendRequest(linphoneXmlRpcRequestImpl);
    }

    public void isAccountActivatedAsync(final XmlRpcListener xmlRpcListener, String str) {
        LinphoneXmlRpcRequestImpl linphoneXmlRpcRequestImpl = new LinphoneXmlRpcRequestImpl("check_account_activated", LinphoneXmlRpcRequest.ArgType.String);
        linphoneXmlRpcRequestImpl.setListener(new LinphoneXmlRpcRequest.LinphoneXmlRpcRequestListener() {
            public void onXmlRpcRequestResponse(LinphoneXmlRpcRequest linphoneXmlRpcRequest) {
                String stringResponse = linphoneXmlRpcRequest.getStringResponse();
                if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.f6356Ok) {
                    if (XmlRpcHelper.SERVER_RESPONSE_OK.equals(stringResponse)) {
                        xmlRpcListener.onAccountActivatedFetched(true);
                        return;
                    }
                    if (!"ERROR_ACCOUNT_NOT_ACTIVATED".equals(stringResponse)) {
                        Log.m6903e(stringResponse);
                        xmlRpcListener.onError(stringResponse);
                    }
                    xmlRpcListener.onAccountActivatedFetched(false);
                } else if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.Failed) {
                    Log.m6903e(stringResponse);
                    xmlRpcListener.onError(stringResponse);
                }
            }
        });
        linphoneXmlRpcRequestImpl.addStringArg(str);
        this.xmlRpcSession.sendRequest(linphoneXmlRpcRequestImpl);
    }

    public void isTrialAccountAsync(final XmlRpcListener xmlRpcListener, String str, String str2) {
        LinphoneXmlRpcRequestImpl linphoneXmlRpcRequestImpl = new LinphoneXmlRpcRequestImpl("is_account_trial", LinphoneXmlRpcRequest.ArgType.String);
        linphoneXmlRpcRequestImpl.setListener(new LinphoneXmlRpcRequest.LinphoneXmlRpcRequestListener() {
            public void onXmlRpcRequestResponse(LinphoneXmlRpcRequest linphoneXmlRpcRequest) {
                String stringResponse = linphoneXmlRpcRequest.getStringResponse();
                if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.f6356Ok) {
                    if (!"NOK".equals(stringResponse) && !XmlRpcHelper.SERVER_RESPONSE_OK.equals(stringResponse)) {
                        xmlRpcListener.onError(stringResponse);
                    }
                    xmlRpcListener.onTrialAccountFetched(XmlRpcHelper.SERVER_RESPONSE_OK.equals(stringResponse));
                } else if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.Failed) {
                    Log.m6903e(stringResponse);
                    xmlRpcListener.onError(stringResponse);
                }
            }
        });
        linphoneXmlRpcRequestImpl.addStringArg(str);
        linphoneXmlRpcRequestImpl.addStringArg(str2);
        this.xmlRpcSession.sendRequest(linphoneXmlRpcRequestImpl);
    }

    public void isAccountAsync(final XmlRpcListener xmlRpcListener, String str) {
        LinphoneXmlRpcRequestImpl linphoneXmlRpcRequestImpl = new LinphoneXmlRpcRequestImpl("check_account_activated", LinphoneXmlRpcRequest.ArgType.String);
        linphoneXmlRpcRequestImpl.setListener(new LinphoneXmlRpcRequest.LinphoneXmlRpcRequestListener() {
            public void onXmlRpcRequestResponse(LinphoneXmlRpcRequest linphoneXmlRpcRequest) {
                String stringResponse = linphoneXmlRpcRequest.getStringResponse();
                if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.f6356Ok) {
                    if (XmlRpcHelper.SERVER_RESPONSE_OK.equals(stringResponse)) {
                        xmlRpcListener.onAccountFetched(true);
                        return;
                    }
                    if (!XmlRpcHelper.SERVER_ERROR_ACCOUNT_DOESNT_EXIST.equals(stringResponse)) {
                        Log.m6903e(stringResponse);
                        xmlRpcListener.onError(stringResponse);
                    }
                    xmlRpcListener.onAccountFetched(false);
                } else if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.Failed) {
                    Log.m6903e(stringResponse);
                    xmlRpcListener.onError(stringResponse);
                }
            }
        });
        linphoneXmlRpcRequestImpl.addStringArg(str);
        this.xmlRpcSession.sendRequest(linphoneXmlRpcRequestImpl);
    }

    public void changeAccountEmailAsync(final XmlRpcListener xmlRpcListener, String str, String str2, String str3) {
        LinphoneXmlRpcRequestImpl linphoneXmlRpcRequestImpl = new LinphoneXmlRpcRequestImpl("change_email", LinphoneXmlRpcRequest.ArgType.String);
        linphoneXmlRpcRequestImpl.setListener(new LinphoneXmlRpcRequest.LinphoneXmlRpcRequestListener() {
            public void onXmlRpcRequestResponse(LinphoneXmlRpcRequest linphoneXmlRpcRequest) {
                String stringResponse = linphoneXmlRpcRequest.getStringResponse();
                if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.f6356Ok) {
                    if (stringResponse.startsWith("ERROR_")) {
                        Log.m6903e(stringResponse);
                        xmlRpcListener.onError(stringResponse);
                        return;
                    }
                    xmlRpcListener.onAccountEmailChanged(stringResponse);
                } else if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.Failed) {
                    Log.m6903e(stringResponse);
                    xmlRpcListener.onError(stringResponse);
                }
            }
        });
        linphoneXmlRpcRequestImpl.addStringArg(str);
        linphoneXmlRpcRequestImpl.addStringArg(str2);
        linphoneXmlRpcRequestImpl.addStringArg(str3);
        this.xmlRpcSession.sendRequest(linphoneXmlRpcRequestImpl);
    }

    public void changeAccountPasswordAsync(final XmlRpcListener xmlRpcListener, String str, String str2, String str3) {
        LinphoneXmlRpcRequestImpl linphoneXmlRpcRequestImpl = new LinphoneXmlRpcRequestImpl("change_password", LinphoneXmlRpcRequest.ArgType.String);
        linphoneXmlRpcRequestImpl.setListener(new LinphoneXmlRpcRequest.LinphoneXmlRpcRequestListener() {
            public void onXmlRpcRequestResponse(LinphoneXmlRpcRequest linphoneXmlRpcRequest) {
                String stringResponse = linphoneXmlRpcRequest.getStringResponse();
                if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.f6356Ok) {
                    if (stringResponse.startsWith("ERROR_")) {
                        Log.m6903e(stringResponse);
                        xmlRpcListener.onError(stringResponse);
                        return;
                    }
                    xmlRpcListener.onAccountPasswordChanged(stringResponse);
                } else if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.Failed) {
                    Log.m6903e(stringResponse);
                    xmlRpcListener.onError(stringResponse);
                }
            }
        });
        linphoneXmlRpcRequestImpl.addStringArg(str);
        linphoneXmlRpcRequestImpl.addStringArg(str2);
        linphoneXmlRpcRequestImpl.addStringArg(str3);
        this.xmlRpcSession.sendRequest(linphoneXmlRpcRequestImpl);
    }

    public void changeAccountHashPasswordAsync(final XmlRpcListener xmlRpcListener, String str, String str2, String str3) {
        LinphoneXmlRpcRequestImpl linphoneXmlRpcRequestImpl = new LinphoneXmlRpcRequestImpl("change_hash", LinphoneXmlRpcRequest.ArgType.String);
        linphoneXmlRpcRequestImpl.setListener(new LinphoneXmlRpcRequest.LinphoneXmlRpcRequestListener() {
            public void onXmlRpcRequestResponse(LinphoneXmlRpcRequest linphoneXmlRpcRequest) {
                String stringResponse = linphoneXmlRpcRequest.getStringResponse();
                if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.f6356Ok) {
                    if (stringResponse.startsWith("ERROR_")) {
                        Log.m6903e(stringResponse);
                        xmlRpcListener.onError(stringResponse);
                        return;
                    }
                    xmlRpcListener.onAccountPasswordChanged(stringResponse);
                } else if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.Failed) {
                    Log.m6903e(stringResponse);
                    xmlRpcListener.onError(stringResponse);
                }
            }
        });
        linphoneXmlRpcRequestImpl.addStringArg(str);
        linphoneXmlRpcRequestImpl.addStringArg(str2);
        linphoneXmlRpcRequestImpl.addStringArg(str3);
        this.xmlRpcSession.sendRequest(linphoneXmlRpcRequestImpl);
    }

    public void sendRecoverPasswordLinkByEmailAsync(final XmlRpcListener xmlRpcListener, String str) {
        LinphoneXmlRpcRequestImpl linphoneXmlRpcRequestImpl = new LinphoneXmlRpcRequestImpl("send_reset_account_password_email", LinphoneXmlRpcRequest.ArgType.String);
        linphoneXmlRpcRequestImpl.setListener(new LinphoneXmlRpcRequest.LinphoneXmlRpcRequestListener() {
            public void onXmlRpcRequestResponse(LinphoneXmlRpcRequest linphoneXmlRpcRequest) {
                String stringResponse = linphoneXmlRpcRequest.getStringResponse();
                if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.f6356Ok) {
                    if (stringResponse.startsWith("ERROR_")) {
                        Log.m6903e(stringResponse);
                        xmlRpcListener.onError(stringResponse);
                        return;
                    }
                    xmlRpcListener.onRecoverPasswordLinkSent(stringResponse);
                } else if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.Failed) {
                    Log.m6903e(stringResponse);
                    xmlRpcListener.onError(stringResponse);
                }
            }
        });
        linphoneXmlRpcRequestImpl.addStringArg(str);
        this.xmlRpcSession.sendRequest(linphoneXmlRpcRequestImpl);
    }

    public void sendActivateAccountLinkByEmailAsync(final XmlRpcListener xmlRpcListener, String str) {
        LinphoneXmlRpcRequestImpl linphoneXmlRpcRequestImpl = new LinphoneXmlRpcRequestImpl("resend_activation_email", LinphoneXmlRpcRequest.ArgType.String);
        linphoneXmlRpcRequestImpl.setListener(new LinphoneXmlRpcRequest.LinphoneXmlRpcRequestListener() {
            public void onXmlRpcRequestResponse(LinphoneXmlRpcRequest linphoneXmlRpcRequest) {
                String stringResponse = linphoneXmlRpcRequest.getStringResponse();
                if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.f6356Ok) {
                    if (stringResponse.startsWith("ERROR_")) {
                        Log.m6903e(stringResponse);
                        xmlRpcListener.onError(stringResponse);
                        return;
                    }
                    xmlRpcListener.onActivateAccountLinkSent(stringResponse);
                } else if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.Failed) {
                    Log.m6903e(stringResponse);
                    xmlRpcListener.onError(stringResponse);
                }
            }
        });
        linphoneXmlRpcRequestImpl.addStringArg(str);
        this.xmlRpcSession.sendRequest(linphoneXmlRpcRequestImpl);
    }

    public void sendUsernameByEmailAsync(final XmlRpcListener xmlRpcListener, String str) {
        LinphoneXmlRpcRequestImpl linphoneXmlRpcRequestImpl = new LinphoneXmlRpcRequestImpl("recover_username_from_email", LinphoneXmlRpcRequest.ArgType.String);
        linphoneXmlRpcRequestImpl.setListener(new LinphoneXmlRpcRequest.LinphoneXmlRpcRequestListener() {
            public void onXmlRpcRequestResponse(LinphoneXmlRpcRequest linphoneXmlRpcRequest) {
                String stringResponse = linphoneXmlRpcRequest.getStringResponse();
                if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.f6356Ok) {
                    if (stringResponse.startsWith("ERROR_")) {
                        Log.m6903e(stringResponse);
                        xmlRpcListener.onError(stringResponse);
                        return;
                    }
                    xmlRpcListener.onUsernameSent(stringResponse);
                } else if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.Failed) {
                    Log.m6903e(stringResponse);
                    xmlRpcListener.onError(stringResponse);
                }
            }
        });
        linphoneXmlRpcRequestImpl.addStringArg(str);
        this.xmlRpcSession.sendRequest(linphoneXmlRpcRequestImpl);
    }

    public void verifySignatureAsync(final XmlRpcListener xmlRpcListener, String str, String str2) {
        LinphoneXmlRpcRequestImpl linphoneXmlRpcRequestImpl = new LinphoneXmlRpcRequestImpl("check_payload_signature", LinphoneXmlRpcRequest.ArgType.String);
        linphoneXmlRpcRequestImpl.setListener(new LinphoneXmlRpcRequest.LinphoneXmlRpcRequestListener() {
            public void onXmlRpcRequestResponse(LinphoneXmlRpcRequest linphoneXmlRpcRequest) {
                String stringResponse = linphoneXmlRpcRequest.getStringResponse();
                if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.f6356Ok) {
                    Log.m6907w(stringResponse);
                    if (stringResponse.startsWith("ERROR_")) {
                        Log.m6903e(stringResponse);
                        xmlRpcListener.onError(stringResponse);
                        return;
                    }
                    xmlRpcListener.onSignatureVerified(XmlRpcHelper.SERVER_RESPONSE_OK.equals(stringResponse));
                } else if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.Failed) {
                    Log.m6903e(stringResponse);
                    xmlRpcListener.onError(stringResponse);
                }
            }
        });
        linphoneXmlRpcRequestImpl.addStringArg(str);
        linphoneXmlRpcRequestImpl.addStringArg(str2);
        this.xmlRpcSession.sendRequest(linphoneXmlRpcRequestImpl);
    }

    public void getRemoteProvisioningFilenameAsync(final XmlRpcListener xmlRpcListener, String str, String str2, String str3) {
        LinphoneXmlRpcRequestImpl linphoneXmlRpcRequestImpl = new LinphoneXmlRpcRequestImpl("get_remote_provisioning_filename", LinphoneXmlRpcRequest.ArgType.String);
        linphoneXmlRpcRequestImpl.setListener(new LinphoneXmlRpcRequest.LinphoneXmlRpcRequestListener() {
            public void onXmlRpcRequestResponse(LinphoneXmlRpcRequest linphoneXmlRpcRequest) {
                String stringResponse = linphoneXmlRpcRequest.getStringResponse();
                if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.f6356Ok) {
                    if (stringResponse.startsWith("ERROR_")) {
                        Log.m6903e(stringResponse);
                        xmlRpcListener.onError(stringResponse);
                        return;
                    }
                    xmlRpcListener.onRemoteProvisioningFilenameSent(stringResponse);
                } else if (linphoneXmlRpcRequest.getStatus() == LinphoneXmlRpcRequest.Status.Failed) {
                    Log.m6903e(stringResponse);
                    xmlRpcListener.onError(stringResponse);
                }
            }
        });
        linphoneXmlRpcRequestImpl.addStringArg(str);
        linphoneXmlRpcRequestImpl.addStringArg(str2);
        linphoneXmlRpcRequestImpl.addStringArg(str3);
        this.xmlRpcSession.sendRequest(linphoneXmlRpcRequestImpl);
    }
}
