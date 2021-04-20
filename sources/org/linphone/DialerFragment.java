package org.linphone;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.linphone.core.LinphoneCore;
import org.linphone.mediastream.Log;
import org.linphone.p054ui.AddressAware;
import org.linphone.p054ui.AddressText;
import org.linphone.p054ui.CallButton;
import org.linphone.p054ui.EraseButton;
import p035ru.unicorn.ujin.data.service.FCM;

public class DialerFragment extends Fragment {
    private static DialerFragment instance = null;
    /* access modifiers changed from: private */
    public static boolean isCallTransferOngoing = false;
    private View.OnClickListener addContactListener;
    private View.OnClickListener cancelListener;
    private ImageView mAddContact;
    /* access modifiers changed from: private */
    public AddressText mAddress;
    private CallButton mCall;
    private AddressAware numpad;
    private boolean shouldEmptyAddressField = true;
    private View.OnClickListener transferListener;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5321R.layout.dialer, viewGroup, false);
        this.mAddress = (AddressText) inflate.findViewById(C5321R.C5324id.address);
        this.mAddress.setDialerFragment(this);
        ((EraseButton) inflate.findViewById(C5321R.C5324id.erase)).setAddressWidget(this.mAddress);
        this.mCall = (CallButton) inflate.findViewById(C5321R.C5324id.call);
        this.mCall.setAddressWidget(this.mAddress);
        if (!LinphoneActivity.isInstanciated() || LinphoneManager.getLcIfManagerNotDestroyedOrNull() == null || LinphoneManager.getLcIfManagerNotDestroyedOrNull().getCallsNb() <= 0) {
            if (LinphoneManager.getLcIfManagerNotDestroyedOrNull() == null || !LinphoneManager.getLcIfManagerNotDestroyedOrNull().getVideoAutoInitiatePolicy()) {
                this.mCall.setImageResource(C5321R.C5323drawable.call_audio_start);
            } else {
                this.mCall.setImageResource(C5321R.C5323drawable.call_video_start);
            }
        } else if (isCallTransferOngoing) {
            this.mCall.setImageResource(C5321R.C5323drawable.call_transfer);
        } else {
            this.mCall.setImageResource(C5321R.C5323drawable.call_add);
        }
        this.numpad = (AddressAware) inflate.findViewById(C5321R.C5324id.numpad);
        AddressAware addressAware = this.numpad;
        if (addressAware != null) {
            addressAware.setAddressWidget(this.mAddress);
        }
        this.mAddContact = (ImageView) inflate.findViewById(C5321R.C5324id.add_contact);
        this.mAddContact.setEnabled(!LinphoneActivity.isInstanciated() || LinphoneManager.getLcIfManagerNotDestroyedOrNull() == null || LinphoneManager.getLc().getCallsNb() <= 0);
        this.addContactListener = new View.OnClickListener() {
            public void onClick(View view) {
                LinphoneActivity.instance().displayContactsForEdition(DialerFragment.this.mAddress.getText().toString());
            }
        };
        this.cancelListener = new View.OnClickListener() {
            public void onClick(View view) {
                LinphoneActivity.instance().resetClassicMenuLayoutAndGoBackToCallIfStillRunning();
            }
        };
        this.transferListener = new View.OnClickListener() {
            public void onClick(View view) {
                LinphoneCore lc = LinphoneManager.getLc();
                if (lc.getCurrentCall() != null) {
                    lc.transferCall(lc.getCurrentCall(), DialerFragment.this.mAddress.getText().toString());
                    boolean unused = DialerFragment.isCallTransferOngoing = false;
                    LinphoneActivity.instance().resetClassicMenuLayoutAndGoBackToCallIfStillRunning();
                }
            }
        };
        resetLayout(isCallTransferOngoing);
        if (getArguments() != null) {
            this.shouldEmptyAddressField = false;
            String string = getArguments().getString("SipUri");
            String string2 = getArguments().getString("DisplayName");
            String string3 = getArguments().getString("PhotoUri");
            this.mAddress.setText(string);
            if (string2 != null) {
                this.mAddress.setDisplayedName(string2);
            }
            if (string3 != null) {
                this.mAddress.setPictureUri(Uri.parse(string3));
            }
        }
        instance = this;
        return inflate;
    }

    public static DialerFragment instance() {
        return instance;
    }

    public void onPause() {
        instance = null;
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        instance = this;
        if (LinphoneActivity.isInstanciated()) {
            LinphoneActivity.instance().selectMenu(FragmentsAvailable.DIALER);
            LinphoneActivity.instance().updateDialerFragment(this);
            LinphoneActivity.instance().showStatusBar();
            LinphoneActivity.instance().hideTabBar(false);
        }
        if (!(getResources().getConfiguration().orientation == 2) || getResources().getBoolean(C5321R.bool.isTablet)) {
            ((LinearLayout) this.numpad).setVisibility(0);
        } else {
            ((LinearLayout) this.numpad).setVisibility(8);
        }
        if (this.shouldEmptyAddressField) {
            this.mAddress.setText("");
        } else {
            this.shouldEmptyAddressField = true;
        }
        resetLayout(isCallTransferOngoing);
        String str = LinphoneActivity.instance().mAddressWaitingToBeCalled;
        if (str != null) {
            this.mAddress.setText(str);
            if (getResources().getBoolean(C5321R.bool.automatically_start_intercepted_outgoing_gsm_call)) {
                newOutgoingCall(str);
            }
            LinphoneActivity.instance().mAddressWaitingToBeCalled = null;
        }
    }

    public void resetLayout(boolean z) {
        if (LinphoneActivity.isInstanciated()) {
            isCallTransferOngoing = LinphoneActivity.instance().isCallTransfer().booleanValue();
            LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
            if (lcIfManagerNotDestroyedOrNull != null) {
                if (lcIfManagerNotDestroyedOrNull.getCallsNb() > 0) {
                    if (isCallTransferOngoing) {
                        this.mCall.setImageResource(C5321R.C5323drawable.call_transfer);
                        this.mCall.setExternalClickListener(this.transferListener);
                    } else {
                        this.mCall.setImageResource(C5321R.C5323drawable.call_add);
                        this.mCall.resetClickListener();
                    }
                    this.mAddContact.setEnabled(true);
                    this.mAddContact.setImageResource(C5321R.C5323drawable.call_alt_back);
                    this.mAddContact.setOnClickListener(this.cancelListener);
                    return;
                }
                if (LinphoneManager.getLc().getVideoAutoInitiatePolicy()) {
                    this.mCall.setImageResource(C5321R.C5323drawable.call_video_start);
                } else {
                    this.mCall.setImageResource(C5321R.C5323drawable.call_audio_start);
                }
                this.mAddContact.setEnabled(false);
                this.mAddContact.setImageResource(C5321R.C5323drawable.contact_add_button);
                this.mAddContact.setOnClickListener(this.addContactListener);
                enableDisableAddContact();
            }
        }
    }

    public void enableDisableAddContact() {
        this.mAddContact.setEnabled((LinphoneManager.getLcIfManagerNotDestroyedOrNull() != null && LinphoneManager.getLc().getCallsNb() > 0) || !this.mAddress.getText().toString().equals(""));
    }

    public void displayTextInAddressBar(String str) {
        this.shouldEmptyAddressField = false;
        this.mAddress.setText(str);
    }

    public void newOutgoingCall(String str) {
        displayTextInAddressBar(str);
        LinphoneManager.getInstance().newOutgoingCall(this.mAddress);
    }

    public void newOutgoingCall(Intent intent) {
        if (intent != null && intent.getData() != null) {
            String scheme = intent.getData().getScheme();
            if (scheme.startsWith("imto")) {
                AddressText addressText = this.mAddress;
                addressText.setText("sip:" + intent.getData().getLastPathSegment());
            } else if (scheme.startsWith("call") || scheme.startsWith(FCM.SIP)) {
                this.mAddress.setText(intent.getData().getSchemeSpecificPart());
            } else {
                String addressOrNumberForAndroidContact = ContactsManager.getAddressOrNumberForAndroidContact(LinphoneService.instance().getContentResolver(), intent.getData());
                if (addressOrNumberForAndroidContact != null) {
                    this.mAddress.setText(addressOrNumberForAndroidContact);
                } else {
                    Log.m6903e("Unknown scheme: ", scheme);
                    this.mAddress.setText(intent.getData().getSchemeSpecificPart());
                }
            }
            this.mAddress.clearDisplayedName();
            intent.setData((Uri) null);
            LinphoneManager.getInstance().newOutgoingCall(this.mAddress);
        }
    }
}
