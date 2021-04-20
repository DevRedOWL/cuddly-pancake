package org.linphone;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneFriend;
import org.linphone.core.LinphoneFriendImpl;
import org.linphone.core.LinphoneProxyConfig;
import org.linphone.mediastream.Log;

public class ContactsManager extends ContentObserver {
    private static ArrayList<ContactsUpdatedListener> contactsUpdatedListeners;
    private static ContactsManager instance;
    private HashMap<String, LinphoneContact> androidContactsCache;
    private List<LinphoneContact> contacts;
    private ContentResolver contentResolver;
    private Context context;
    private Bitmap defaultAvatar;
    private Handler handler;
    private boolean isContactPresenceDisabled = true;
    private boolean preferLinphoneContacts = false;
    private List<LinphoneContact> sipContacts;

    public static void addContactsListener(ContactsUpdatedListener contactsUpdatedListener) {
        contactsUpdatedListeners.add(contactsUpdatedListener);
    }

    public static void removeContactsListener(ContactsUpdatedListener contactsUpdatedListener) {
        contactsUpdatedListeners.remove(contactsUpdatedListener);
    }

    private ContactsManager(Handler handler2) {
        super(handler2);
        this.handler = handler2;
        this.defaultAvatar = BitmapFactory.decodeResource(LinphoneService.instance().getResources(), C5321R.C5323drawable.avatar);
        this.androidContactsCache = new HashMap<>();
        contactsUpdatedListeners = new ArrayList<>();
        this.contacts = new ArrayList();
        this.sipContacts = new ArrayList();
    }

    public void destroy() {
        this.defaultAvatar.recycle();
        instance = null;
    }

    public boolean contactsFetchedOnce() {
        return this.contacts.size() > 0;
    }

    public Bitmap getDefaultAvatarBitmap() {
        return this.defaultAvatar;
    }

    public void onChange(boolean z) {
        onChange(z, (Uri) null);
    }

    public void onChange(boolean z, Uri uri) {
        fetchContactsSync();
    }

    public ContentResolver getContentResolver() {
        return this.contentResolver;
    }

    public static final ContactsManager getInstance() {
        if (instance == null) {
            instance = new ContactsManager(LinphoneService.instance().mHandler);
        }
        return instance;
    }

    public synchronized boolean hasContacts() {
        return this.contacts.size() > 0;
    }

    public synchronized List<LinphoneContact> getContacts() {
        return this.contacts;
    }

    public synchronized List<LinphoneContact> getSIPContacts() {
        return this.sipContacts;
    }

    public synchronized List<LinphoneContact> getContacts(String str) {
        ArrayList arrayList;
        String lowerCase = str.toLowerCase(Locale.getDefault());
        arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (LinphoneContact next : this.contacts) {
            if (next.getFullName() != null) {
                if (next.getFullName().toLowerCase(Locale.getDefault()).startsWith(lowerCase)) {
                    arrayList.add(next);
                } else if (next.getFullName().toLowerCase(Locale.getDefault()).contains(lowerCase)) {
                    arrayList2.add(next);
                }
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public synchronized List<LinphoneContact> getSIPContacts(String str) {
        ArrayList arrayList;
        String lowerCase = str.toLowerCase(Locale.getDefault());
        arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (LinphoneContact next : this.sipContacts) {
            if (next.getFullName() != null) {
                if (next.getFullName().toLowerCase(Locale.getDefault()).startsWith(lowerCase)) {
                    arrayList.add(next);
                } else if (next.getFullName().toLowerCase(Locale.getDefault()).contains(lowerCase)) {
                    arrayList2.add(next);
                }
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public void enableContactsAccess() {
        LinphonePreferences.instance().disableFriendsStorage();
    }

    public boolean hasContactsAccess() {
        Context context2 = this.context;
        if (context2 == null) {
            return false;
        }
        boolean z = context2.getPackageManager().checkPermission("android.permission.READ_CONTACTS", this.context.getPackageName()) == 0;
        this.context.getPackageManager();
        if (!z || this.context.getResources().getBoolean(C5321R.bool.force_use_of_linphone_friends)) {
            return false;
        }
        return true;
    }

    public void setLinphoneContactsPrefered(boolean z) {
        this.preferLinphoneContacts = z;
    }

    public boolean isLinphoneContactsPrefered() {
        return this.preferLinphoneContacts;
    }

    public boolean isContactPresenceDisabled() {
        return this.isContactPresenceDisabled;
    }

    public void initializeContactManager(Context context2, ContentResolver contentResolver2) {
        this.context = context2;
        this.contentResolver = contentResolver2;
    }

    public void initializeSyncAccount(Context context2, ContentResolver contentResolver2) {
        initializeContactManager(context2, contentResolver2);
        AccountManager accountManager = (AccountManager) context2.getSystemService("account");
        Account[] accountsByType = accountManager.getAccountsByType(context2.getPackageName());
        if (accountsByType != null && accountsByType.length == 0) {
            try {
                accountManager.addAccountExplicitly(new Account(context2.getString(C5321R.string.sync_account_name), context2.getPackageName()), (String) null, (Bundle) null);
            } catch (Exception e) {
                Log.m6903e(e);
            }
        }
        initializeContactManager(context2, contentResolver2);
    }

    public synchronized LinphoneContact findContactFromAddress(LinphoneAddress linphoneAddress) {
        LinphoneFriend findFriendByAddress = LinphoneManager.getLcIfManagerNotDestroyedOrNull().findFriendByAddress(linphoneAddress.asStringUriOnly());
        if (findFriendByAddress == null) {
            return null;
        }
        return (LinphoneContact) ((LinphoneFriendImpl) findFriendByAddress).getUserData();
    }

    public synchronized LinphoneContact findContactFromPhoneNumber(String str) {
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        LinphoneProxyConfig defaultProxyConfig = lcIfManagerNotDestroyedOrNull != null ? lcIfManagerNotDestroyedOrNull.getDefaultProxyConfig() : null;
        if (defaultProxyConfig == null) {
            return null;
        }
        LinphoneAddress normalizeSipUri = defaultProxyConfig.normalizeSipUri(defaultProxyConfig.normalizePhoneNumber(str));
        LinphoneFriend findFriendByAddress = lcIfManagerNotDestroyedOrNull.findFriendByAddress(normalizeSipUri.asStringUriOnly() + ";user=phone");
        if (findFriendByAddress == null) {
            return null;
        }
        return (LinphoneContact) ((LinphoneFriendImpl) findFriendByAddress).getUserData();
    }

    public synchronized void setContacts(List<LinphoneContact> list) {
        this.contacts = list;
    }

    public synchronized void setSipContacts(List<LinphoneContact> list) {
        if (this.sipContacts.isEmpty()) {
            this.sipContacts = list;
        } else {
            for (LinphoneContact next : list) {
                if (!this.sipContacts.contains(next)) {
                    this.sipContacts.add(next);
                }
            }
        }
    }

    public synchronized void refreshSipContact(LinphoneFriend linphoneFriend) {
        LinphoneContact linphoneContact = (LinphoneContact) ((LinphoneFriendImpl) linphoneFriend).getUserData();
        if (linphoneContact != null && !this.sipContacts.contains(linphoneContact)) {
            this.sipContacts.add(linphoneContact);
            Collections.sort(this.sipContacts);
            Iterator<ContactsUpdatedListener> it = contactsUpdatedListeners.iterator();
            while (it.hasNext()) {
                it.next().onContactsUpdated();
            }
        }
    }

    public void fetchContactsAsync() {
        this.handler.post(new Runnable() {
            public void run() {
                ContactsManager.this.fetchContactsSync();
            }
        });
    }

    /* access modifiers changed from: private */
    public synchronized void fetchContactsSync() {
        Cursor organizationCursor;
        boolean z;
        ArrayList<LinphoneContact> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        Date date = new Date();
        this.androidContactsCache.clear();
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            for (LinphoneFriend linphoneFriend : lcIfManagerNotDestroyedOrNull.getFriendList()) {
                LinphoneContact linphoneContact = (LinphoneContact) ((LinphoneFriendImpl) linphoneFriend).getUserData();
                if (linphoneContact != null) {
                    linphoneContact.clearAddresses();
                    arrayList.add(linphoneContact);
                    if (linphoneContact.getAndroidId() != null) {
                        this.androidContactsCache.put(linphoneContact.getAndroidId(), linphoneContact);
                    }
                } else if (linphoneFriend.getRefKey() != null) {
                    lcIfManagerNotDestroyedOrNull.removeFriend(linphoneFriend);
                } else {
                    LinphoneContact linphoneContact2 = new LinphoneContact();
                    linphoneContact2.setFriend(linphoneFriend);
                    linphoneContact2.refresh();
                    if (linphoneContact2.hasAddress()) {
                        arrayList2.add(linphoneContact2);
                    }
                    arrayList.add(linphoneContact2);
                }
            }
        }
        long time = new Date().getTime() - date.getTime();
        Log.m6905i("[ContactsManager] Step 0 for " + arrayList.size() + " contacts: " + String.format("%02d:%02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(time)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(time) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(time)))}) + " elapsed since starting");
        if (hasContactsAccess()) {
            ArrayList arrayList3 = new ArrayList();
            Cursor contactsCursor = getContactsCursor(this.contentResolver);
            if (contactsCursor != null) {
                while (contactsCursor.moveToNext()) {
                    String string = contactsCursor.getString(contactsCursor.getColumnIndex("contact_id"));
                    String string2 = contactsCursor.getString(contactsCursor.getColumnIndex("display_name"));
                    arrayList3.add(string);
                    LinphoneContact linphoneContact3 = this.androidContactsCache.get(string);
                    if (linphoneContact3 == null) {
                        linphoneContact3 = new LinphoneContact();
                        linphoneContact3.setAndroidId(string);
                        z = true;
                    } else {
                        z = false;
                    }
                    linphoneContact3.setFullName(string2);
                    if (z) {
                        arrayList.add(linphoneContact3);
                        this.androidContactsCache.put(string, linphoneContact3);
                    }
                }
                contactsCursor.close();
            }
            if (LinphoneManager.getInstance().getContext().getResources().getBoolean(C5321R.bool.display_contact_organization) && (organizationCursor = getOrganizationCursor(this.contentResolver)) != null) {
                while (organizationCursor.moveToNext()) {
                    String string3 = organizationCursor.getString(organizationCursor.getColumnIndex("contact_id"));
                    String string4 = organizationCursor.getString(organizationCursor.getColumnIndex("data1"));
                    LinphoneContact linphoneContact4 = this.androidContactsCache.get(string3);
                    if (linphoneContact4 != null) {
                        linphoneContact4.setOrganization(string4);
                    }
                }
                organizationCursor.close();
            }
            for (LinphoneContact next : this.androidContactsCache.values()) {
                String androidId = next.getAndroidId();
                if (androidId != null && !arrayList3.contains(androidId)) {
                    lcIfManagerNotDestroyedOrNull.removeFriend(next.getLinphoneFriend());
                    arrayList.remove(next);
                }
            }
            arrayList3.clear();
            long time2 = new Date().getTime() - date.getTime();
            Log.m6905i("[ContactsManager] Step 1 for " + arrayList.size() + " contacts: " + String.format("%02d:%02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(time2)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(time2) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(time2)))}) + " elapsed since starting");
            Cursor phonesCursor = getPhonesCursor(this.contentResolver);
            if (phonesCursor != null) {
                while (phonesCursor.moveToNext()) {
                    String string5 = phonesCursor.getString(phonesCursor.getColumnIndex("contact_id"));
                    String string6 = phonesCursor.getString(phonesCursor.getColumnIndex("data1"));
                    LinphoneContact linphoneContact5 = this.androidContactsCache.get(string5);
                    if (linphoneContact5 != null) {
                        linphoneContact5.addNumberOrAddress(new LinphoneNumberOrAddress(string6, false));
                    }
                }
                phonesCursor.close();
            }
            Cursor sipCursor = getSipCursor(this.contentResolver);
            if (sipCursor != null) {
                while (sipCursor.moveToNext()) {
                    String string7 = sipCursor.getString(sipCursor.getColumnIndex("contact_id"));
                    String string8 = sipCursor.getString(sipCursor.getColumnIndex("data1"));
                    LinphoneContact linphoneContact6 = this.androidContactsCache.get(string7);
                    if (linphoneContact6 != null) {
                        linphoneContact6.addNumberOrAddress(new LinphoneNumberOrAddress(string8, true));
                        if (!arrayList2.contains(linphoneContact6)) {
                            arrayList2.add(linphoneContact6);
                        }
                    }
                }
                sipCursor.close();
            }
            long time3 = new Date().getTime() - date.getTime();
            Log.m6905i("[ContactsManager] Step 2 for " + arrayList.size() + " contacts: " + String.format("%02d:%02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(time3)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(time3) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(time3)))}) + " elapsed since starting");
            for (LinphoneContact createOrUpdateLinphoneFriendFromNativeContact : arrayList) {
                createOrUpdateLinphoneFriendFromNativeContact.createOrUpdateLinphoneFriendFromNativeContact();
            }
            long time4 = new Date().getTime() - date.getTime();
            Log.m6905i("[ContactsManager] Step 3 for " + arrayList.size() + " contacts: " + String.format("%02d:%02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(time4)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(time4) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(time4)))}) + " elapsed since starting");
            this.androidContactsCache.clear();
        } else {
            Log.m6907w("[Permission] Read contacts permission wasn't granted, only fetch LinphoneFriends");
        }
        Collections.sort(arrayList);
        Collections.sort(arrayList2);
        setContacts(arrayList);
        setSipContacts(arrayList2);
        if (LinphonePreferences.instance() != null && LinphonePreferences.instance().isFriendlistsubscriptionEnabled()) {
            if (getString(C5321R.string.rls_uri) != null) {
                LinphoneManager.getLc().getFriendLists()[0].setRLSUri(getString(C5321R.string.rls_uri));
            }
            LinphoneManager.getLc().getFriendLists()[0].updateSubscriptions();
        }
        Iterator<ContactsUpdatedListener> it = contactsUpdatedListeners.iterator();
        while (it.hasNext()) {
            it.next().onContactsUpdated();
        }
    }

    public static String getAddressOrNumberForAndroidContact(ContentResolver contentResolver2, Uri uri) {
        Cursor query = contentResolver2.query(uri, new String[]{"data1"}, (String) null, (String[]) null, (String) null);
        if (query == null || !query.moveToNext()) {
            Cursor query2 = contentResolver2.query(uri, new String[]{"data1"}, (String) null, (String[]) null, (String) null);
            if (query2 == null) {
                return null;
            }
            if (query2.moveToNext()) {
                String string = query2.getString(query2.getColumnIndex("data1"));
                query2.close();
                return string;
            }
            query2.close();
            return null;
        }
        String string2 = query.getString(query.getColumnIndex("data1"));
        query.close();
        return string2;
    }

    public void delete(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        deleteMultipleContactsAtOnce(arrayList);
    }

    public void deleteMultipleContactsAtOnce(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            arrayList.add(ContentProviderOperation.newDelete(ContactsContract.RawContacts.CONTENT_URI).withSelection("contact_id = ?", new String[]{str}).build());
        }
        try {
            getInstance().getContentResolver().applyBatch("com.android.contacts", arrayList);
        } catch (Exception e) {
            Log.m6903e(e);
        }
    }

    public String getString(int i) {
        Context context2 = this.context;
        if (context2 == null) {
            return null;
        }
        return context2.getString(i);
    }

    private Cursor getContactsCursor(ContentResolver contentResolver2) {
        ContentResolver contentResolver3 = contentResolver2;
        Cursor query = contentResolver3.query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "display_name"}, "display_name IS NOT NULL AND (" + "(mimetype = 'vnd.android.cursor.item/phone_v2' AND data1 IS NOT NULL  OR (mimetype = 'vnd.android.cursor.item/sip_address' AND data1 IS NOT NULL))" + ")", (String[]) null, " lower(display_name) COLLATE UNICODE ASC");
        if (query == null) {
            return query;
        }
        MatrixCursor matrixCursor = new MatrixCursor(query.getColumnNames());
        HashSet hashSet = new HashSet();
        while (query.moveToNext()) {
            String string = query.getString(query.getColumnIndex("display_name"));
            if (!hashSet.contains(string)) {
                hashSet.add(string);
                Object[] objArr = new Object[query.getColumnCount()];
                int columnIndex = query.getColumnIndex("contact_id");
                int columnIndex2 = query.getColumnIndex("display_name");
                objArr[columnIndex] = query.getString(columnIndex);
                objArr[columnIndex2] = query.getString(columnIndex2);
                matrixCursor.addRow(objArr);
            }
        }
        query.close();
        return matrixCursor;
    }

    private Cursor getPhonesCursor(ContentResolver contentResolver2) {
        return contentResolver2.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"data1", "contact_id"}, (String) null, (String[]) null, "contact_id ASC");
    }

    private Cursor getSipCursor(ContentResolver contentResolver2) {
        return contentResolver2.query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "data1"}, "mimetype=?", new String[]{"vnd.android.cursor.item/sip_address"}, (String) null);
    }

    private Cursor getOrganizationCursor(ContentResolver contentResolver2) {
        return contentResolver2.query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "data1"}, "mimetype=?", new String[]{"vnd.android.cursor.item/organization"}, (String) null);
    }
}
