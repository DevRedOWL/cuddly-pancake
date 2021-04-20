package org.linphone;

import android.app.Dialog;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import org.linphone.core.LinphoneProxyConfig;

public class ContactDetailsFragment extends Fragment implements View.OnClickListener {
    private ImageView back;
    private View.OnClickListener chatListener = new View.OnClickListener() {
        public void onClick(View view) {
            if (LinphoneActivity.isInstanciated()) {
                LinphoneActivity.instance().displayChat(view.getTag().toString(), (String) null, (String) null);
            }
        }
    };
    /* access modifiers changed from: private */
    public LinphoneContact contact;
    private ImageView deleteContact;
    private View.OnClickListener dialListener = new View.OnClickListener() {
        public void onClick(View view) {
            if (LinphoneActivity.isInstanciated()) {
                LinphoneActivity.instance().setAddresGoToDialerAndCall(view.getTag().toString(), ContactDetailsFragment.this.contact.getFullName(), ContactDetailsFragment.this.contact.getPhotoUri());
            }
        }
    };
    private boolean displayChatAddressOnly = false;
    private ImageView editContact;
    private LayoutInflater inflater;
    private TextView organization;
    private View view;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.contact = (LinphoneContact) getArguments().getSerializable("Contact");
        this.inflater = layoutInflater;
        this.view = layoutInflater.inflate(C5321R.layout.contact, viewGroup, false);
        if (getArguments() != null) {
            this.displayChatAddressOnly = getArguments().getBoolean("ChatAddressOnly");
        }
        this.editContact = (ImageView) this.view.findViewById(C5321R.C5324id.editContact);
        this.editContact.setOnClickListener(this);
        this.deleteContact = (ImageView) this.view.findViewById(C5321R.C5324id.deleteContact);
        this.deleteContact.setOnClickListener(this);
        this.organization = (TextView) this.view.findViewById(C5321R.C5324id.contactOrganization);
        boolean z = getResources().getBoolean(C5321R.bool.display_contact_organization);
        String organization2 = this.contact.getOrganization();
        if (organization2 == null || organization2.isEmpty() || !z) {
            this.organization.setVisibility(8);
        } else {
            this.organization.setText(organization2);
        }
        this.back = (ImageView) this.view.findViewById(C5321R.C5324id.back);
        if (getResources().getBoolean(C5321R.bool.isTablet)) {
            this.back.setVisibility(4);
        } else {
            this.back.setOnClickListener(this);
        }
        return this.view;
    }

    public void changeDisplayedContact(LinphoneContact linphoneContact) {
        this.contact = linphoneContact;
        displayContact(this.inflater, this.view);
    }

    private void displayContact(LayoutInflater layoutInflater, View view2) {
        boolean z;
        ImageView imageView = (ImageView) view2.findViewById(C5321R.C5324id.contact_picture);
        if (this.contact.hasPhoto()) {
            LinphoneUtils.setImagePictureFromUri(getActivity(), imageView, this.contact.getPhotoUri(), this.contact.getThumbnailUri());
        } else {
            imageView.setImageBitmap(ContactsManager.getInstance().getDefaultAvatarBitmap());
        }
        ((TextView) view2.findViewById(C5321R.C5324id.contact_name)).setText(this.contact.getFullName());
        this.organization.setText(this.contact.getOrganization() != null ? this.contact.getOrganization() : "");
        TableLayout tableLayout = (TableLayout) view2.findViewById(C5321R.C5324id.controls);
        tableLayout.removeAllViews();
        for (LinphoneNumberOrAddress next : this.contact.getNumbersOrAddresses()) {
            View inflate = layoutInflater.inflate(C5321R.layout.contact_control_row, (ViewGroup) null);
            String value = next.getValue();
            String displayableUsernameFromAddress = LinphoneUtils.getDisplayableUsernameFromAddress(value);
            TextView textView = (TextView) inflate.findViewById(C5321R.C5324id.address_label);
            if (next.isSIPAddress()) {
                textView.setText(C5321R.string.sip_address);
                z = getResources().getBoolean(C5321R.bool.hide_contact_sip_addresses);
            } else {
                textView.setText(C5321R.string.phone_number);
                z = getResources().getBoolean(C5321R.bool.hide_contact_phone_numbers);
            }
            boolean z2 = z | false;
            TextView textView2 = (TextView) inflate.findViewById(C5321R.C5324id.numeroOrAddress);
            textView2.setText(displayableUsernameFromAddress);
            textView2.setSelected(true);
            LinphoneProxyConfig defaultProxyConfig = LinphoneManager.getLc().getDefaultProxyConfig();
            if (defaultProxyConfig != null) {
                value = LinphoneUtils.getFullAddressFromUsername(defaultProxyConfig.normalizePhoneNumber(displayableUsernameFromAddress));
            }
            String presenceModelForUri = this.contact.getPresenceModelForUri(next.getValue());
            if (presenceModelForUri != null) {
                inflate.findViewById(C5321R.C5324id.friendLinphone).setVisibility(0);
            }
            if (!this.displayChatAddressOnly) {
                inflate.findViewById(C5321R.C5324id.contact_call).setOnClickListener(this.dialListener);
                if (presenceModelForUri != null) {
                    inflate.findViewById(C5321R.C5324id.contact_call).setTag(presenceModelForUri);
                } else {
                    inflate.findViewById(C5321R.C5324id.contact_call).setTag(value);
                }
            } else {
                inflate.findViewById(C5321R.C5324id.contact_call).setVisibility(8);
            }
            inflate.findViewById(C5321R.C5324id.contact_chat).setOnClickListener(this.chatListener);
            if (presenceModelForUri != null) {
                inflate.findViewById(C5321R.C5324id.contact_chat).setTag(presenceModelForUri);
            } else {
                inflate.findViewById(C5321R.C5324id.contact_chat).setTag(value);
            }
            if (getResources().getBoolean(C5321R.bool.disable_chat)) {
                inflate.findViewById(C5321R.C5324id.contact_chat).setVisibility(8);
            }
            if (!z2) {
                tableLayout.addView(inflate);
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (LinphoneActivity.isInstanciated()) {
            LinphoneActivity.instance().selectMenu(FragmentsAvailable.CONTACT_DETAIL);
            LinphoneActivity.instance().hideTabBar(false);
        }
        this.contact.refresh();
        displayContact(this.inflater, this.view);
    }

    public void onClick(View view2) {
        int id = view2.getId();
        if (id == C5321R.C5324id.editContact) {
            LinphoneActivity.instance().editContact(this.contact);
        }
        if (id == C5321R.C5324id.deleteContact) {
            final Dialog displayDialog = LinphoneActivity.instance().displayDialog(getString(C5321R.string.delete_text));
            ((Button) displayDialog.findViewById(C5321R.C5324id.delete_button)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ContactDetailsFragment.this.contact.delete();
                    LinphoneActivity.instance().displayContacts(false);
                    displayDialog.dismiss();
                }
            });
            ((Button) displayDialog.findViewById(C5321R.C5324id.cancel)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    displayDialog.dismiss();
                }
            });
            displayDialog.show();
        }
        if (id == C5321R.C5324id.back) {
            getFragmentManager().popBackStackImmediate();
        }
    }
}
