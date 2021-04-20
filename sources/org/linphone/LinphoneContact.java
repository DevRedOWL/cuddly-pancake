package org.linphone;

import android.content.ContentProviderOperation;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.LinphoneFriend;
import org.linphone.core.LinphoneFriendImpl;
import org.linphone.core.PresenceBasicStatus;
import org.linphone.core.PresenceModel;
import org.linphone.mediastream.Log;

public class LinphoneContact implements Serializable, Comparable<LinphoneContact> {
    private static final long serialVersionUID = 9015568163905205244L;
    private List<LinphoneNumberOrAddress> addresses = new ArrayList();
    private String androidId = null;
    private String androidRawId;
    private String androidTagId;
    private transient ArrayList<ContentProviderOperation> changesToCommit = new ArrayList<>();
    private transient ArrayList<ContentProviderOperation> changesToCommit2 = new ArrayList<>();
    private String firstName;
    private transient LinphoneFriend friend;
    private String fullName;
    private boolean hasSipAddress = false;
    private String lastName;
    private String organization;
    private transient Uri photoUri = null;
    private transient Uri thumbnailUri = null;

    public int compareTo(LinphoneContact linphoneContact) {
        String str = "";
        String upperCase = getFullName() != null ? getFullName().toUpperCase(Locale.getDefault()) : str;
        if (linphoneContact.getFullName() != null) {
            str = linphoneContact.getFullName().toUpperCase(Locale.getDefault());
        }
        return upperCase.compareTo(str);
    }

    public void setFullName(String str) {
        this.fullName = str;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFirstNameAndLastName(String str, String str2) {
        if (str == null || str.length() != 0 || str2 == null || str2.length() != 0) {
            if (isAndroidContact()) {
                if (this.firstName == null && this.lastName == null) {
                    this.changesToCommit.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", str).withValue("data3", str2).build());
                } else {
                    this.changesToCommit.add(ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection("contact_id=? AND mimetype='vnd.android.cursor.item/name'", new String[]{getAndroidId()}).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", str).withValue("data3", str2).build());
                }
            }
            this.firstName = str;
            this.lastName = str2;
            String str3 = this.firstName;
            if (str3 == null || this.lastName == null || str3.length() <= 0 || this.lastName.length() <= 0) {
                String str4 = this.firstName;
                if (str4 == null || str4.length() <= 0) {
                    String str5 = this.lastName;
                    if (str5 != null && str5.length() > 0) {
                        this.fullName = this.lastName;
                        return;
                    }
                    return;
                }
                this.fullName = this.firstName;
                return;
            }
            this.fullName = this.firstName + " " + this.lastName;
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getOrganization() {
        return this.organization;
    }

    public void setOrganization(String str) {
        if (isAndroidContact()) {
            if (this.androidRawId != null) {
                String[] strArr = {getAndroidId()};
                if (this.organization != null) {
                    this.changesToCommit.add(ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection("contact_id=? AND mimetype='vnd.android.cursor.item/organization'", strArr).withValue("mimetype", "vnd.android.cursor.item/organization").withValue("data1", str).build());
                } else {
                    this.changesToCommit.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("raw_contact_id", this.androidRawId).withValue("mimetype", "vnd.android.cursor.item/organization").withValue("data1", str).build());
                }
            } else {
                this.changesToCommit.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/organization").withValue("data1", str).build());
            }
        }
        this.organization = str;
    }

    public boolean hasPhoto() {
        return this.photoUri != null;
    }

    public void setPhotoUri(Uri uri) {
        if (!uri.equals(this.photoUri)) {
            this.photoUri = uri;
        }
    }

    public Uri getPhotoUri() {
        return this.photoUri;
    }

    public void setThumbnailUri(Uri uri) {
        if (!uri.equals(this.thumbnailUri)) {
            this.thumbnailUri = uri;
        }
    }

    public Uri getThumbnailUri() {
        return this.thumbnailUri;
    }

    public void setPhoto(byte[] bArr) {
        if (bArr != null && isAndroidContact()) {
            if (this.androidRawId != null) {
                this.changesToCommit.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("raw_contact_id", this.androidRawId).withValue("mimetype", "vnd.android.cursor.item/photo").withValue("data15", bArr).withValue("is_primary", 1).withValue("is_super_primary", 1).build());
            } else {
                this.changesToCommit.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/photo").withValue("data15", bArr).build());
            }
        }
    }

    public void addNumberOrAddress(LinphoneNumberOrAddress linphoneNumberOrAddress) {
        if (linphoneNumberOrAddress != null) {
            if (linphoneNumberOrAddress.isSIPAddress()) {
                this.hasSipAddress = true;
            }
            this.addresses.add(linphoneNumberOrAddress);
        }
    }

    public List<LinphoneNumberOrAddress> getNumbersOrAddresses() {
        return this.addresses;
    }

    public boolean hasAddress(String str) {
        for (LinphoneNumberOrAddress next : getNumbersOrAddresses()) {
            if (next.isSIPAddress()) {
                String value = next.getValue();
                if (value.equals(str)) {
                    return true;
                }
                if (value.equals("sip:" + str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasAddress() {
        return this.hasSipAddress;
    }

    public void removeNumberOrAddress(LinphoneNumberOrAddress linphoneNumberOrAddress) {
        if (linphoneNumberOrAddress != null && linphoneNumberOrAddress.getOldValue() != null) {
            if (isAndroidContact()) {
                this.changesToCommit.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection(linphoneNumberOrAddress.isSIPAddress() ? "contact_id=? AND mimetype='vnd.android.cursor.item/sip_address' AND data1=?" : "contact_id=? AND mimetype='vnd.android.cursor.item/phone_v2' AND data1=?", new String[]{getAndroidId(), linphoneNumberOrAddress.getOldValue()}).build());
                if (this.androidTagId != null && linphoneNumberOrAddress.isSIPAddress()) {
                    this.changesToCommit.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("raw_contact_id=? AND data1=?", new String[]{this.androidTagId, linphoneNumberOrAddress.getOldValue()}).build());
                }
            }
            if (isLinphoneFriend()) {
                if (linphoneNumberOrAddress.isSIPAddress() && !linphoneNumberOrAddress.getOldValue().startsWith("sip:")) {
                    linphoneNumberOrAddress.setOldValue("sip:" + linphoneNumberOrAddress.getOldValue());
                }
                LinphoneNumberOrAddress linphoneNumberOrAddress2 = null;
                Iterator<LinphoneNumberOrAddress> it = this.addresses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    LinphoneNumberOrAddress next = it.next();
                    if (linphoneNumberOrAddress.getOldValue().equals(next.getValue()) && linphoneNumberOrAddress.isSIPAddress() == next.isSIPAddress()) {
                        linphoneNumberOrAddress2 = next;
                        break;
                    }
                }
                if (linphoneNumberOrAddress2 != null) {
                    this.addresses.remove(linphoneNumberOrAddress2);
                }
            }
        }
    }

    public void addOrUpdateNumberOrAddress(LinphoneNumberOrAddress linphoneNumberOrAddress) {
        String str;
        if (linphoneNumberOrAddress != null && linphoneNumberOrAddress.getValue() != null) {
            if (isAndroidContact()) {
                if (linphoneNumberOrAddress.getOldValue() == null) {
                    ContentValues contentValues = new ContentValues();
                    if (linphoneNumberOrAddress.isSIPAddress()) {
                        contentValues.put("mimetype", "vnd.android.cursor.item/sip_address");
                        contentValues.put("data1", linphoneNumberOrAddress.getValue());
                        contentValues.put("data2", 0);
                        contentValues.put("data3", ContactsManager.getInstance().getString(C5321R.string.addressbook_label));
                    } else {
                        contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
                        contentValues.put("data1", linphoneNumberOrAddress.getValue());
                        contentValues.put("data2", 0);
                        contentValues.put("data3", ContactsManager.getInstance().getString(C5321R.string.addressbook_label));
                    }
                    if (this.androidRawId != null) {
                        this.changesToCommit.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("raw_contact_id", this.androidRawId).withValues(contentValues).build());
                    } else {
                        this.changesToCommit.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValues(contentValues).build());
                    }
                    if (linphoneNumberOrAddress.isSIPAddress() && LinphoneManager.getInstance().getContext().getResources().getBoolean(C5321R.bool.use_linphone_tag)) {
                        if (this.androidTagId != null) {
                            this.changesToCommit.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("raw_contact_id", this.androidTagId).withValue("mimetype", ContactsManager.getInstance().getString(C5321R.string.sync_mimetype)).withValue("data1", linphoneNumberOrAddress.getValue()).withValue("data2", ContactsManager.getInstance().getString(C5321R.string.app_name)).withValue("data3", linphoneNumberOrAddress.getValue()).build());
                        } else {
                            this.changesToCommit2.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", ContactsManager.getInstance().getString(C5321R.string.sync_mimetype)).withValue("data1", linphoneNumberOrAddress.getValue()).withValue("data2", ContactsManager.getInstance().getString(C5321R.string.app_name)).withValue("data3", linphoneNumberOrAddress.getValue()).build());
                        }
                    }
                } else {
                    ContentValues contentValues2 = new ContentValues();
                    String[] strArr = {getAndroidId(), linphoneNumberOrAddress.getOldValue()};
                    if (linphoneNumberOrAddress.isSIPAddress()) {
                        contentValues2.put("mimetype", "vnd.android.cursor.item/sip_address");
                        contentValues2.put("data1", linphoneNumberOrAddress.getValue());
                        str = "contact_id=? AND mimetype='vnd.android.cursor.item/sip_address' AND data1=?";
                    } else {
                        contentValues2.put("mimetype", "vnd.android.cursor.item/phone_v2");
                        contentValues2.put("data1", linphoneNumberOrAddress.getValue());
                        str = "contact_id=? AND mimetype='vnd.android.cursor.item/phone_v2' AND data1=?";
                    }
                    this.changesToCommit.add(ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection(str, strArr).withValues(contentValues2).build());
                    if (linphoneNumberOrAddress.isSIPAddress() && LinphoneManager.getInstance().getContext().getResources().getBoolean(C5321R.bool.use_linphone_tag)) {
                        if (this.androidTagId != null) {
                            this.changesToCommit.add(ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection("raw_contact_id=? AND data1=? ", new String[]{this.androidTagId, linphoneNumberOrAddress.getOldValue()}).withValue("data1", linphoneNumberOrAddress.getValue()).withValue("data2", ContactsManager.getInstance().getString(C5321R.string.app_name)).withValue("data3", linphoneNumberOrAddress.getValue()).build());
                        } else {
                            this.changesToCommit2.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", ContactsManager.getInstance().getString(C5321R.string.sync_mimetype)).withValue("data1", linphoneNumberOrAddress.getValue()).withValue("data2", ContactsManager.getInstance().getString(C5321R.string.app_name)).withValue("data3", linphoneNumberOrAddress.getValue()).build());
                        }
                    }
                }
            }
            if (isLinphoneFriend()) {
                if (linphoneNumberOrAddress.isSIPAddress() && !linphoneNumberOrAddress.getValue().startsWith("sip:")) {
                    linphoneNumberOrAddress.setValue("sip:" + linphoneNumberOrAddress.getValue());
                }
                if (linphoneNumberOrAddress.getOldValue() != null) {
                    if (linphoneNumberOrAddress.isSIPAddress() && !linphoneNumberOrAddress.getOldValue().startsWith("sip:")) {
                        linphoneNumberOrAddress.setOldValue("sip:" + linphoneNumberOrAddress.getOldValue());
                    }
                    for (LinphoneNumberOrAddress next : this.addresses) {
                        if (linphoneNumberOrAddress.getOldValue().equals(next.getValue()) && linphoneNumberOrAddress.isSIPAddress() == next.isSIPAddress()) {
                            next.setValue(linphoneNumberOrAddress.getValue());
                            return;
                        }
                    }
                    return;
                }
                this.addresses.add(linphoneNumberOrAddress);
            }
        }
    }

    public void setAndroidId(String str) {
        this.androidId = str;
        setThumbnailUri(getContactThumbnailPictureUri());
        setPhotoUri(getContactPictureUri());
    }

    public String getAndroidId() {
        return this.androidId;
    }

    public LinphoneFriend getLinphoneFriend() {
        return this.friend;
    }

    private void createOrUpdateFriend() {
        boolean z;
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (!isLinphoneFriend()) {
            this.friend = LinphoneManager.getLc().createFriend();
            this.friend.enableSubscribes(false);
            this.friend.setIncSubscribePolicy(LinphoneFriend.SubscribePolicy.SPDeny);
            if (isAndroidContact()) {
                this.friend.setRefKey(getAndroidId());
            }
            ((LinphoneFriendImpl) this.friend).setUserData(this);
            z = true;
        } else {
            z = false;
        }
        if (isLinphoneFriend()) {
            this.friend.edit();
            this.friend.setName(this.fullName);
            this.friend.setFamilyName(this.lastName);
            this.friend.setGivenName(this.firstName);
            String str = this.organization;
            if (str != null) {
                this.friend.setOrganization(str);
            }
            if (!z) {
                for (LinphoneAddress removeAddress : this.friend.getAddresses()) {
                    this.friend.removeAddress(removeAddress);
                }
                for (String removePhoneNumber : this.friend.getPhoneNumbers()) {
                    this.friend.removePhoneNumber(removePhoneNumber);
                }
            }
            for (LinphoneNumberOrAddress next : this.addresses) {
                if (next.isSIPAddress()) {
                    try {
                        LinphoneAddress interpretUrl = lcIfManagerNotDestroyedOrNull.interpretUrl(next.getValue());
                        if (interpretUrl != null) {
                            this.friend.addAddress(interpretUrl);
                        }
                    } catch (LinphoneCoreException e) {
                        Log.m6903e(e);
                    }
                } else {
                    this.friend.addPhoneNumber(next.getValue());
                }
            }
            this.friend.done();
        }
        if (z) {
            try {
                lcIfManagerNotDestroyedOrNull.addFriend(this.friend);
            } catch (LinphoneCoreException e2) {
                Log.m6903e(e2);
            }
        }
        if (!ContactsManager.getInstance().hasContactsAccess()) {
            ContactsManager.getInstance().fetchContactsAsync();
        }
    }

    public void save() {
        ArrayList<ContentProviderOperation> arrayList;
        if (isAndroidContact() && ContactsManager.getInstance().hasContactsAccess() && this.changesToCommit.size() > 0) {
            try {
                ContactsManager.getInstance().getContentResolver().applyBatch("com.android.contacts", this.changesToCommit);
                createLinphoneTagIfNeeded();
                this.changesToCommit = new ArrayList<>();
                arrayList = new ArrayList<>();
            } catch (Exception e) {
                Log.m6903e(e);
                this.changesToCommit = new ArrayList<>();
                arrayList = new ArrayList<>();
            } catch (Throwable th) {
                this.changesToCommit = new ArrayList<>();
                this.changesToCommit2 = new ArrayList<>();
                throw th;
            }
            this.changesToCommit2 = arrayList;
        }
        createOrUpdateFriend();
    }

    public void delete() {
        if (isAndroidContact()) {
            this.changesToCommit.add(ContentProviderOperation.newDelete(ContactsContract.RawContacts.CONTENT_URI).withSelection("contact_id = ?", new String[]{getAndroidId()}).build());
            save();
            ContactsManager.getInstance().delete(getAndroidId());
        }
        if (isLinphoneFriend()) {
            deleteFriend();
        }
    }

    public void deleteFriend() {
        if (this.friend != null) {
            LinphoneManager.getLcIfManagerNotDestroyedOrNull().removeFriend(this.friend);
        }
    }

    public void clearAddresses() {
        this.addresses.clear();
    }

    public void refresh() {
        this.addresses = new ArrayList();
        if (isAndroidContact()) {
            getContactNames();
            getNativeContactOrganization();
            getAndroidIds();
            this.hasSipAddress = false;
            for (LinphoneNumberOrAddress addNumberOrAddress : getAddressesAndNumbersForAndroidContact()) {
                addNumberOrAddress(addNumberOrAddress);
            }
        } else if (isLinphoneFriend()) {
            this.fullName = this.friend.getName();
            this.lastName = this.friend.getFamilyName();
            this.firstName = this.friend.getGivenName();
            this.thumbnailUri = null;
            this.photoUri = null;
            this.hasSipAddress = this.friend.getAddress() != null;
            this.organization = this.friend.getOrganization();
            LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
            if (lcIfManagerNotDestroyedOrNull == null || !lcIfManagerNotDestroyedOrNull.isVCardSupported()) {
                addNumberOrAddress(new LinphoneNumberOrAddress(this.friend.getAddress().asStringUriOnly(), true));
                return;
            }
            for (LinphoneAddress linphoneAddress : this.friend.getAddresses()) {
                if (linphoneAddress != null) {
                    addNumberOrAddress(new LinphoneNumberOrAddress(linphoneAddress.asStringUriOnly(), true));
                }
            }
            for (String str : this.friend.getPhoneNumbers()) {
                if (str != null) {
                    addNumberOrAddress(new LinphoneNumberOrAddress(str, false));
                }
            }
        }
    }

    public void createOrUpdateLinphoneFriendFromNativeContact() {
        if (isAndroidContact()) {
            createOrUpdateFriend();
        }
    }

    public boolean isAndroidContact() {
        return this.androidId != null;
    }

    public boolean isLinphoneFriend() {
        return this.friend != null;
    }

    public boolean isInLinphoneFriendList() {
        if (this.friend == null) {
            return false;
        }
        for (LinphoneNumberOrAddress value : this.addresses) {
            PresenceModel presenceModelForUri = this.friend.getPresenceModelForUri(value.getValue());
            if (presenceModelForUri != null && presenceModelForUri.getBasicStatus().equals(PresenceBasicStatus.Open)) {
                return true;
            }
        }
        return false;
    }

    public String getPresenceModelForUri(String str) {
        LinphoneFriend linphoneFriend = this.friend;
        if (linphoneFriend == null || linphoneFriend.getPresenceModelForUri(str) == null) {
            return null;
        }
        return this.friend.getPresenceModelForUri(str).getContact();
    }

    public void setFriend(LinphoneFriend linphoneFriend) {
        this.friend = linphoneFriend;
        ((LinphoneFriendImpl) this.friend).setUserData(this);
    }

    public void getAndroidIds() {
        this.androidRawId = findRawContactID();
        if (LinphoneManager.getInstance().getContext().getResources().getBoolean(C5321R.bool.use_linphone_tag)) {
            this.androidTagId = findLinphoneRawContactId();
        }
    }

    public static LinphoneContact createContact() {
        if (ContactsManager.getInstance().hasContactsAccess()) {
            return createAndroidContact();
        }
        return createLinphoneFriend();
    }

    private Uri getContactThumbnailPictureUri() {
        return Uri.withAppendedPath(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.parseLong(getAndroidId())), "photo");
    }

    private Uri getContactPictureUri() {
        return Uri.withAppendedPath(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.parseLong(getAndroidId())), "display_photo");
    }

    private void getContactNames() {
        String[] strArr = {getAndroidId(), "vnd.android.cursor.item/name"};
        Cursor query = ContactsManager.getInstance().getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"data2", "data3"}, "contact_id=? AND mimetype=?", strArr, (String) null);
        if (query != null) {
            if (query.moveToFirst()) {
                this.firstName = query.getString(query.getColumnIndex("data2"));
                this.lastName = query.getString(query.getColumnIndex("data3"));
            }
            query.close();
        }
    }

    private void getNativeContactOrganization() {
        String[] strArr = {getAndroidId(), "vnd.android.cursor.item/organization"};
        Cursor query = ContactsManager.getInstance().getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"data1"}, "contact_id=? AND mimetype=?", strArr, (String) null);
        if (query != null) {
            if (query.moveToFirst()) {
                this.organization = query.getString(query.getColumnIndex("data1"));
            }
            query.close();
        }
    }

    private String findRawContactID() {
        Cursor query = ContactsManager.getInstance().getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"_id"}, "contact_id=?", new String[]{getAndroidId()}, (String) null);
        String str = null;
        if (query != null) {
            if (query.moveToFirst()) {
                str = query.getString(query.getColumnIndex("_id"));
            }
            query.close();
        }
        return str;
    }

    private List<LinphoneNumberOrAddress> getAddressesAndNumbersForAndroidContact() {
        boolean z;
        boolean z2;
        String string;
        ArrayList arrayList = new ArrayList();
        Cursor query = ContactsManager.getInstance().getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"data1", "mimetype"}, "contact_id =? AND (mimetype=? OR mimetype=?)", new String[]{getAndroidId(), "vnd.android.cursor.item/sip_address", "vnd.android.cursor.item/phone_v2"}, (String) null);
        if (query != null) {
            while (query.moveToNext()) {
                String string2 = query.getString(query.getColumnIndex("mimetype"));
                if (string2 != null && string2.length() > 0) {
                    if (string2.equals("vnd.android.cursor.item/sip_address")) {
                        z2 = true;
                        z = true;
                    } else {
                        z2 = string2.equals("vnd.android.cursor.item/phone_v2");
                        z = false;
                    }
                    if (z2 && (string = query.getString(query.getColumnIndex("data1"))) != null && string.length() > 0) {
                        if (z && !string.startsWith("sip:")) {
                            string = "sip:" + string;
                        }
                        if (z && !string.contains("@")) {
                            string = string + "@" + ContactsManager.getInstance().getString(C5321R.string.default_domain);
                        }
                        arrayList.add(new LinphoneNumberOrAddress(string, z));
                    }
                }
            }
            query.close();
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static LinphoneContact createAndroidContact() {
        LinphoneContact linphoneContact = new LinphoneContact();
        linphoneContact.changesToCommit.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", (Object) null).withValue("account_name", (Object) null).withValue("aggregation_mode", 0).build());
        linphoneContact.setAndroidId("0");
        return linphoneContact;
    }

    private static LinphoneContact createLinphoneFriend() {
        LinphoneContact linphoneContact = new LinphoneContact();
        LinphoneFriend createFriend = LinphoneManager.getLc().createFriend();
        createFriend.enableSubscribes(false);
        createFriend.setIncSubscribePolicy(LinphoneFriend.SubscribePolicy.SPDeny);
        linphoneContact.friend = createFriend;
        ((LinphoneFriendImpl) createFriend).setUserData(linphoneContact);
        return linphoneContact;
    }

    private String findLinphoneRawContactId() {
        Cursor query = ContactsManager.getInstance().getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"_id"}, "contact_id=? AND account_type=?", new String[]{getAndroidId(), ContactsManager.getInstance().getString(C5321R.string.sync_account_type)}, (String) null);
        String str = null;
        if (query != null) {
            if (query.moveToFirst()) {
                str = query.getString(query.getColumnIndex("_id"));
            }
            query.close();
        }
        return str;
    }

    private void createLinphoneTagIfNeeded() {
        if (LinphoneManager.getInstance().getContext().getResources().getBoolean(C5321R.bool.use_linphone_tag) && this.androidTagId == null && findLinphoneRawContactId() == null) {
            createLinphoneContactTag();
        }
    }

    private void createLinphoneContactTag() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", ContactsManager.getInstance().getString(C5321R.string.sync_account_type)).withValue("account_name", ContactsManager.getInstance().getString(C5321R.string.sync_account_name)).withValue("aggregation_mode", 0).build());
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data1", getFullName()).build());
        arrayList.add(ContentProviderOperation.newUpdate(ContactsContract.AggregationExceptions.CONTENT_URI).withValue("type", 1).withValue("raw_contact_id1", this.androidRawId).withValueBackReference("raw_contact_id2", 0).build());
        if (this.changesToCommit2.size() > 0) {
            Iterator<ContentProviderOperation> it = this.changesToCommit2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        try {
            ContactsManager.getInstance().getContentResolver().applyBatch("com.android.contacts", arrayList);
            this.androidTagId = findLinphoneRawContactId();
        } catch (Exception e) {
            Log.m6903e(e);
        }
    }
}
