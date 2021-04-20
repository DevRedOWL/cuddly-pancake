package org.linphone;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.LinphoneCoreFactory;
import org.linphone.mediastream.Log;

public class HistoryDetailFragment extends Fragment implements View.OnClickListener {
    private ImageView addToContacts;
    private ImageView back;
    private ImageView callDirection;
    private ImageView chat;
    private LinphoneContact contact;
    private TextView contactAddress;
    private TextView contactName;
    private ImageView contactPicture;
    private TextView date;
    private ImageView dialBack;
    private String displayName;
    private ImageView goToContact;
    private String pictureUri;
    private String sipUri;
    private TextView time;
    private View view;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.sipUri = getArguments().getString("SipUri");
        this.displayName = getArguments().getString("DisplayName");
        this.pictureUri = getArguments().getString("PictureUri");
        String string = getArguments().getString("CallStatus");
        String string2 = getArguments().getString("CallTime");
        String string3 = getArguments().getString("CallDate");
        this.view = layoutInflater.inflate(C5321R.layout.history_detail, viewGroup, false);
        this.dialBack = (ImageView) this.view.findViewById(C5321R.C5324id.call);
        this.dialBack.setOnClickListener(this);
        this.back = (ImageView) this.view.findViewById(C5321R.C5324id.back);
        if (getResources().getBoolean(C5321R.bool.isTablet)) {
            this.back.setVisibility(4);
        } else {
            this.back.setOnClickListener(this);
        }
        this.chat = (ImageView) this.view.findViewById(C5321R.C5324id.chat);
        this.chat.setOnClickListener(this);
        if (getResources().getBoolean(C5321R.bool.disable_chat)) {
            this.view.findViewById(C5321R.C5324id.chat).setVisibility(8);
        }
        this.addToContacts = (ImageView) this.view.findViewById(C5321R.C5324id.add_contact);
        this.addToContacts.setOnClickListener(this);
        this.goToContact = (ImageView) this.view.findViewById(C5321R.C5324id.goto_contact);
        this.goToContact.setOnClickListener(this);
        this.contactPicture = (ImageView) this.view.findViewById(C5321R.C5324id.contact_picture);
        this.contactName = (TextView) this.view.findViewById(C5321R.C5324id.contact_name);
        this.contactAddress = (TextView) this.view.findViewById(C5321R.C5324id.contact_address);
        this.callDirection = (ImageView) this.view.findViewById(C5321R.C5324id.direction);
        this.time = (TextView) this.view.findViewById(C5321R.C5324id.time);
        this.date = (TextView) this.view.findViewById(C5321R.C5324id.date);
        displayHistory(string, string2, string3);
        return this.view;
    }

    private void displayHistory(String str, String str2, String str3) {
        if (str.equals(getResources().getString(C5321R.string.missed))) {
            this.callDirection.setImageResource(C5321R.C5323drawable.call_missed);
        } else if (str.equals(getResources().getString(C5321R.string.incoming))) {
            this.callDirection.setImageResource(C5321R.C5323drawable.call_incoming);
        } else if (str.equals(getResources().getString(C5321R.string.outgoing))) {
            this.callDirection.setImageResource(C5321R.C5323drawable.call_outgoing);
        }
        TextView textView = this.time;
        if (str2 == null) {
            str2 = "";
        }
        textView.setText(str2);
        this.date.setText(LinphoneUtils.timestampToHumanDate(getActivity(), Long.valueOf(Long.parseLong(str3)).longValue(), getString(C5321R.string.history_detail_date_format)));
        LinphoneAddress linphoneAddress = null;
        try {
            linphoneAddress = LinphoneCoreFactory.instance().createLinphoneAddress(this.sipUri);
        } catch (LinphoneCoreException e) {
            Log.m6903e(e);
        }
        if (linphoneAddress != null) {
            this.contactAddress.setText(linphoneAddress.asStringUriOnly());
            this.contact = ContactsManager.getInstance().findContactFromAddress(linphoneAddress);
            LinphoneContact linphoneContact = this.contact;
            if (linphoneContact != null) {
                this.contactName.setText(linphoneContact.getFullName());
                LinphoneUtils.setImagePictureFromUri(this.view.getContext(), this.contactPicture, this.contact.getPhotoUri(), this.contact.getThumbnailUri());
                this.addToContacts.setVisibility(8);
                this.goToContact.setVisibility(0);
                return;
            }
            TextView textView2 = this.contactName;
            String str4 = this.displayName;
            if (str4 == null) {
                str4 = LinphoneUtils.getAddressDisplayName(this.sipUri);
            }
            textView2.setText(str4);
            this.contactPicture.setImageBitmap(ContactsManager.getInstance().getDefaultAvatarBitmap());
            this.addToContacts.setVisibility(0);
            this.goToContact.setVisibility(8);
            return;
        }
        this.contactAddress.setText(this.sipUri);
        TextView textView3 = this.contactName;
        String str5 = this.displayName;
        if (str5 == null) {
            str5 = LinphoneUtils.getAddressDisplayName(this.sipUri);
        }
        textView3.setText(str5);
    }

    public void changeDisplayedHistory(String str, String str2, String str3, String str4, String str5, String str6) {
        if (str2 == null) {
            str2 = LinphoneUtils.getUsernameFromAddress(str);
        }
        this.sipUri = str;
        this.displayName = str2;
        this.pictureUri = str3;
        displayHistory(str4, str5, str6);
    }

    public void onResume() {
        super.onResume();
        if (LinphoneActivity.isInstanciated()) {
            LinphoneActivity.instance().selectMenu(FragmentsAvailable.HISTORY_DETAIL);
            LinphoneActivity.instance().hideTabBar(false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.net.Uri} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [org.linphone.core.LinphoneAddress] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r5) {
        /*
            r4 = this;
            int r5 = r5.getId()
            int r0 = org.linphone.C5321R.C5324id.back
            if (r5 != r0) goto L_0x000f
            android.app.FragmentManager r0 = r4.getFragmentManager()
            r0.popBackStackImmediate()
        L_0x000f:
            int r0 = org.linphone.C5321R.C5324id.call
            r1 = 0
            if (r5 != r0) goto L_0x0029
            org.linphone.LinphoneActivity r5 = org.linphone.LinphoneActivity.instance()
            java.lang.String r0 = r4.sipUri
            java.lang.String r2 = r4.displayName
            java.lang.String r3 = r4.pictureUri
            if (r3 != 0) goto L_0x0021
            goto L_0x0025
        L_0x0021:
            android.net.Uri r1 = android.net.Uri.parse(r3)
        L_0x0025:
            r5.setAddresGoToDialerAndCall(r0, r2, r1)
            goto L_0x0083
        L_0x0029:
            int r0 = org.linphone.C5321R.C5324id.chat
            if (r5 != r0) goto L_0x0037
            org.linphone.LinphoneActivity r5 = org.linphone.LinphoneActivity.instance()
            java.lang.String r0 = r4.sipUri
            r5.displayChat(r0, r1, r1)
            goto L_0x0083
        L_0x0037:
            int r0 = org.linphone.C5321R.C5324id.add_contact
            r2 = 0
            if (r5 != r0) goto L_0x0076
            java.lang.String r5 = r4.sipUri
            org.linphone.core.LinphoneCoreFactory r0 = org.linphone.core.LinphoneCoreFactory.instance()     // Catch:{ LinphoneCoreException -> 0x004d }
            java.lang.String r3 = r4.sipUri     // Catch:{ LinphoneCoreException -> 0x004d }
            org.linphone.core.LinphoneAddress r1 = r0.createLinphoneAddress(r3)     // Catch:{ LinphoneCoreException -> 0x004d }
            java.lang.String r5 = r1.asStringUriOnly()     // Catch:{ LinphoneCoreException -> 0x004d }
            goto L_0x0056
        L_0x004d:
            r0 = move-exception
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r3)
        L_0x0056:
            if (r1 == 0) goto L_0x006e
            java.lang.String r0 = r1.getDisplayName()
            if (r0 == 0) goto L_0x006e
            org.linphone.LinphoneActivity r5 = org.linphone.LinphoneActivity.instance()
            java.lang.String r0 = r1.asStringUriOnly()
            java.lang.String r1 = r1.getDisplayName()
            r5.displayContactsForEdition(r0, r1)
            goto L_0x0083
        L_0x006e:
            org.linphone.LinphoneActivity r0 = org.linphone.LinphoneActivity.instance()
            r0.displayContactsForEdition(r5)
            goto L_0x0083
        L_0x0076:
            int r0 = org.linphone.C5321R.C5324id.goto_contact
            if (r5 != r0) goto L_0x0083
            org.linphone.LinphoneActivity r5 = org.linphone.LinphoneActivity.instance()
            org.linphone.LinphoneContact r0 = r4.contact
            r5.displayContact(r0, r2)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.HistoryDetailFragment.onClick(android.view.View):void");
    }
}
