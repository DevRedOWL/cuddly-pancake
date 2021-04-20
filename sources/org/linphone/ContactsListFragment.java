package org.linphone;

import android.app.Dialog;
import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SectionIndexer;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ContactsListFragment extends Fragment implements View.OnClickListener, AdapterView.OnItemClickListener, ContactsUpdatedListener {
    private ImageView allContacts;
    private View allContactsSelected;
    private ImageView cancel;
    private ImageView clearSearchField;
    private ProgressBar contactsFetchInProgress;
    /* access modifiers changed from: private */
    public ListView contactsList;
    private ImageView delete;
    /* access modifiers changed from: private */
    public ImageView deselectAll;
    private String displayName = null;
    private ImageView edit;
    private boolean editConsumed = false;
    private LinearLayout editList;
    private boolean editOnClick = false;
    /* access modifiers changed from: private */
    public boolean isEditMode;
    /* access modifiers changed from: private */
    public boolean isSearchMode;
    private int lastKnownPosition;
    private ImageView linphoneContacts;
    private View linphoneContactsSelected;
    /* access modifiers changed from: private */
    public LayoutInflater mInflater;
    private ImageView newContact;
    private TextView noContact;
    private TextView noSipContact;
    private boolean onlyDisplayChatAddress = false;
    private boolean onlyDisplayLinphoneContacts;
    /* access modifiers changed from: private */
    public EditText searchField;
    /* access modifiers changed from: private */
    public ImageView selectAll;
    private String sipAddressToAdd;
    private LinearLayout topbar;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mInflater = layoutInflater;
        View inflate = layoutInflater.inflate(C5321R.layout.contacts_list, viewGroup, false);
        if (getArguments() != null) {
            this.editOnClick = getArguments().getBoolean("EditOnClick");
            this.sipAddressToAdd = getArguments().getString("SipAddress");
            if (getArguments().getString("DisplayName") != null) {
                this.displayName = getArguments().getString("DisplayName");
            }
            this.onlyDisplayChatAddress = getArguments().getBoolean("ChatAddressOnly");
        }
        this.noSipContact = (TextView) inflate.findViewById(C5321R.C5324id.noSipContact);
        this.noContact = (TextView) inflate.findViewById(C5321R.C5324id.noContact);
        this.contactsList = (ListView) inflate.findViewById(C5321R.C5324id.contactsList);
        this.contactsList.setOnItemClickListener(this);
        this.allContacts = (ImageView) inflate.findViewById(C5321R.C5324id.all_contacts);
        this.allContacts.setOnClickListener(this);
        this.linphoneContacts = (ImageView) inflate.findViewById(C5321R.C5324id.linphone_contacts);
        this.linphoneContacts.setOnClickListener(this);
        this.allContactsSelected = inflate.findViewById(C5321R.C5324id.all_contacts_select);
        this.linphoneContactsSelected = inflate.findViewById(C5321R.C5324id.linphone_contacts_select);
        this.newContact = (ImageView) inflate.findViewById(C5321R.C5324id.newContact);
        this.newContact.setOnClickListener(this);
        this.newContact.setEnabled(LinphoneManager.getLc().getCallsNb() == 0);
        this.allContacts.setEnabled(this.onlyDisplayLinphoneContacts);
        this.linphoneContacts.setEnabled(!this.allContacts.isEnabled());
        this.selectAll = (ImageView) inflate.findViewById(C5321R.C5324id.select_all);
        this.selectAll.setOnClickListener(this);
        this.deselectAll = (ImageView) inflate.findViewById(C5321R.C5324id.deselect_all);
        this.deselectAll.setOnClickListener(this);
        this.delete = (ImageView) inflate.findViewById(C5321R.C5324id.delete);
        this.delete.setOnClickListener(this);
        this.editList = (LinearLayout) inflate.findViewById(C5321R.C5324id.edit_list);
        this.topbar = (LinearLayout) inflate.findViewById(C5321R.C5324id.top_bar);
        this.cancel = (ImageView) inflate.findViewById(C5321R.C5324id.cancel);
        this.cancel.setOnClickListener(this);
        this.edit = (ImageView) inflate.findViewById(C5321R.C5324id.edit);
        this.edit.setOnClickListener(this);
        this.clearSearchField = (ImageView) inflate.findViewById(C5321R.C5324id.clearSearchField);
        this.clearSearchField.setOnClickListener(this);
        this.searchField = (EditText) inflate.findViewById(C5321R.C5324id.searchField);
        this.searchField.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                ContactsListFragment contactsListFragment = ContactsListFragment.this;
                contactsListFragment.searchContacts(contactsListFragment.searchField.getText().toString());
            }
        });
        this.contactsFetchInProgress = (ProgressBar) inflate.findViewById(C5321R.C5324id.contactsFetchInProgress);
        this.contactsFetchInProgress.setVisibility(0);
        return inflate;
    }

    public int getNbItemsChecked() {
        int count = this.contactsList.getAdapter().getCount();
        int i = 0;
        for (int i2 = 0; i2 < count; i2++) {
            if (this.contactsList.isItemChecked(i2)) {
                i++;
            }
        }
        return i;
    }

    public void enabledDeleteButton(Boolean bool) {
        if (bool.booleanValue()) {
            this.delete.setEnabled(true);
        } else if (getNbItemsChecked() == 0) {
            this.delete.setEnabled(false);
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C5321R.C5324id.select_all) {
            this.deselectAll.setVisibility(0);
            this.selectAll.setVisibility(8);
            enabledDeleteButton(true);
            selectAllList(true);
        } else if (id == C5321R.C5324id.deselect_all) {
            this.deselectAll.setVisibility(8);
            this.selectAll.setVisibility(0);
            enabledDeleteButton(false);
            selectAllList(false);
        } else if (id == C5321R.C5324id.cancel) {
            quitEditMode();
        } else if (id == C5321R.C5324id.delete) {
            final Dialog displayDialog = LinphoneActivity.instance().displayDialog(getString(C5321R.string.delete_text));
            ((Button) displayDialog.findViewById(C5321R.C5324id.delete_button)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ContactsListFragment.this.removeContacts();
                    displayDialog.dismiss();
                    ContactsListFragment.this.quitEditMode();
                }
            });
            ((Button) displayDialog.findViewById(C5321R.C5324id.cancel)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    displayDialog.dismiss();
                    ContactsListFragment.this.quitEditMode();
                }
            });
            displayDialog.show();
        } else {
            if (id == C5321R.C5324id.edit) {
                this.editList.setVisibility(0);
                this.topbar.setVisibility(8);
                enabledDeleteButton(false);
                this.isEditMode = true;
            }
            if (id == C5321R.C5324id.all_contacts) {
                this.onlyDisplayLinphoneContacts = false;
                this.allContactsSelected.setVisibility(0);
                this.allContacts.setEnabled(false);
                this.linphoneContacts.setEnabled(true);
                this.linphoneContactsSelected.setVisibility(4);
            } else if (id == C5321R.C5324id.linphone_contacts) {
                this.allContactsSelected.setVisibility(4);
                this.linphoneContactsSelected.setVisibility(0);
                this.linphoneContacts.setEnabled(false);
                this.allContacts.setEnabled(true);
                this.onlyDisplayLinphoneContacts = true;
            }
            if (this.isEditMode) {
                this.deselectAll.setVisibility(8);
                this.selectAll.setVisibility(0);
            }
            if (this.searchField.getText().toString().length() > 0) {
                searchContacts();
            } else {
                changeContactsAdapter();
            }
            if (id == C5321R.C5324id.newContact) {
                this.editConsumed = true;
                if (this.displayName != null) {
                    LinphoneActivity.instance().addContact(this.displayName, this.sipAddressToAdd);
                } else {
                    LinphoneActivity.instance().addContact((String) null, this.sipAddressToAdd);
                }
            } else if (id == C5321R.C5324id.clearSearchField) {
                this.searchField.setText("");
            }
        }
    }

    private void selectAllList(boolean z) {
        int count = this.contactsList.getAdapter().getCount();
        for (int i = 0; i < count; i++) {
            this.contactsList.setItemChecked(i, z);
        }
    }

    /* access modifiers changed from: private */
    public void removeContacts() {
        ArrayList arrayList = new ArrayList();
        for (int count = this.contactsList.getAdapter().getCount() - 1; count >= 0; count--) {
            if (this.contactsList.isItemChecked(count)) {
                LinphoneContact linphoneContact = (LinphoneContact) this.contactsList.getAdapter().getItem(count);
                if (linphoneContact.isAndroidContact()) {
                    linphoneContact.deleteFriend();
                    arrayList.add(linphoneContact.getAndroidId());
                } else {
                    linphoneContact.delete();
                }
            }
        }
        ContactsManager.getInstance().deleteMultipleContactsAtOnce(arrayList);
    }

    public void quitEditMode() {
        this.isEditMode = false;
        this.editList.setVisibility(8);
        this.topbar.setVisibility(0);
        invalidate();
        if (getResources().getBoolean(C5321R.bool.isTablet)) {
            displayFirstContact();
        }
    }

    public void displayFirstContact() {
        ListView listView = this.contactsList;
        if (listView == null || listView.getAdapter() == null || this.contactsList.getAdapter().getCount() <= 0) {
            LinphoneActivity.instance().displayEmptyFragment();
        } else {
            LinphoneActivity.instance().displayContact((LinphoneContact) this.contactsList.getAdapter().getItem(0), false);
        }
    }

    private void searchContacts() {
        searchContacts(this.searchField.getText().toString());
    }

    /* access modifiers changed from: private */
    public void searchContacts(String str) {
        if (str == null || str.length() == 0) {
            changeContactsAdapter();
            return;
        }
        changeContactsToggle();
        this.isSearchMode = true;
        if (this.onlyDisplayLinphoneContacts) {
            this.contactsList.setChoiceMode(2);
            this.contactsList.setAdapter(new ContactsListAdapter(ContactsManager.getInstance().getSIPContacts(str)));
            return;
        }
        this.contactsList.setChoiceMode(2);
        this.contactsList.setAdapter(new ContactsListAdapter(ContactsManager.getInstance().getContacts(str)));
    }

    private void changeContactsAdapter() {
        ContactsListAdapter contactsListAdapter;
        changeContactsToggle();
        this.isSearchMode = false;
        this.noSipContact.setVisibility(8);
        this.noContact.setVisibility(8);
        this.contactsList.setVisibility(0);
        this.contactsList.setFastScrollEnabled(false);
        if (this.onlyDisplayLinphoneContacts) {
            this.contactsList.setChoiceMode(2);
            contactsListAdapter = new ContactsListAdapter(ContactsManager.getInstance().getSIPContacts());
            this.contactsList.setAdapter(contactsListAdapter);
            this.edit.setEnabled(true);
        } else {
            this.contactsList.setChoiceMode(2);
            contactsListAdapter = new ContactsListAdapter(ContactsManager.getInstance().getContacts());
            this.contactsList.setAdapter(contactsListAdapter);
            this.edit.setEnabled(true);
        }
        this.contactsList.setFastScrollEnabled(true);
        contactsListAdapter.notifyDataSetInvalidated();
        if (contactsListAdapter.getCount() > 0) {
            this.contactsFetchInProgress.setVisibility(8);
        }
        ContactsManager.getInstance().setLinphoneContactsPrefered(this.onlyDisplayLinphoneContacts);
    }

    private void changeContactsToggle() {
        if (this.onlyDisplayLinphoneContacts) {
            this.allContacts.setEnabled(true);
            this.allContactsSelected.setVisibility(4);
            this.linphoneContacts.setEnabled(false);
            this.linphoneContactsSelected.setVisibility(0);
            return;
        }
        this.allContacts.setEnabled(false);
        this.allContactsSelected.setVisibility(0);
        this.linphoneContacts.setEnabled(true);
        this.linphoneContactsSelected.setVisibility(4);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        LinphoneContact linphoneContact = (LinphoneContact) adapterView.getItemAtPosition(i);
        if (this.editOnClick) {
            this.editConsumed = true;
            LinphoneActivity.instance().editContact(linphoneContact, this.sipAddressToAdd);
            return;
        }
        this.lastKnownPosition = this.contactsList.getFirstVisiblePosition();
        LinphoneActivity.instance().displayContact(linphoneContact, this.onlyDisplayChatAddress);
    }

    public void onResume() {
        ProgressBar progressBar;
        ContactsManager.addContactsListener(this);
        super.onResume();
        if (this.editConsumed) {
            this.editOnClick = false;
            this.sipAddressToAdd = null;
        }
        EditText editText = this.searchField;
        if (!(editText == null || editText.getText().toString().length() <= 0 || (progressBar = this.contactsFetchInProgress) == null)) {
            progressBar.setVisibility(8);
        }
        if (LinphoneActivity.isInstanciated()) {
            LinphoneActivity.instance().selectMenu(FragmentsAvailable.CONTACTS_LIST);
            LinphoneActivity.instance().hideTabBar(false);
            this.onlyDisplayLinphoneContacts = ContactsManager.getInstance().isLinphoneContactsPrefered();
        }
        changeContactsToggle();
        invalidate();
    }

    public void onPause() {
        ContactsManager.removeContactsListener(this);
        super.onPause();
    }

    public void onContactsUpdated() {
        ContactsListAdapter contactsListAdapter;
        if (LinphoneActivity.isInstanciated() && LinphoneActivity.instance().getCurrentFragment() == FragmentsAvailable.CONTACTS_LIST && (contactsListAdapter = (ContactsListAdapter) this.contactsList.getAdapter()) != null) {
            this.contactsList.setFastScrollEnabled(false);
            if (this.onlyDisplayLinphoneContacts) {
                contactsListAdapter.updateDataSet(ContactsManager.getInstance().getSIPContacts());
            } else {
                contactsListAdapter.updateDataSet(ContactsManager.getInstance().getContacts());
            }
            this.contactsList.setFastScrollEnabled(true);
            this.contactsFetchInProgress.setVisibility(8);
        }
    }

    public void invalidate() {
        EditText editText = this.searchField;
        if (editText == null || editText.getText().toString().length() <= 0) {
            changeContactsAdapter();
        } else {
            searchContacts(this.searchField.getText().toString());
        }
        this.contactsList.setSelectionFromTop(this.lastKnownPosition, 0);
    }

    class ContactsListAdapter extends BaseAdapter implements SectionIndexer {
        private List<LinphoneContact> contacts;
        Map<String, Integer> map = new LinkedHashMap();
        String[] sections;
        ArrayList<String> sectionsList;

        public long getItemId(int i) {
            return (long) i;
        }

        private class ViewHolder {
            public ImageView contactPicture;
            public CheckBox delete;
            public ImageView linphoneFriend;
            public TextView name;
            public TextView organization;
            public LinearLayout separator;
            public TextView separatorText;

            public ViewHolder(View view) {
                this.delete = (CheckBox) view.findViewById(C5321R.C5324id.delete);
                this.linphoneFriend = (ImageView) view.findViewById(C5321R.C5324id.friendLinphone);
                this.name = (TextView) view.findViewById(C5321R.C5324id.name);
                this.separator = (LinearLayout) view.findViewById(C5321R.C5324id.separator);
                this.separatorText = (TextView) view.findViewById(C5321R.C5324id.separator_text);
                this.contactPicture = (ImageView) view.findViewById(C5321R.C5324id.contact_picture);
                this.organization = (TextView) view.findViewById(C5321R.C5324id.contactOrganization);
            }
        }

        ContactsListAdapter(List<LinphoneContact> list) {
            updateDataSet(list);
        }

        public void updateDataSet(List<LinphoneContact> list) {
            this.contacts = list;
            this.map = new LinkedHashMap();
            String str = null;
            for (int i = 0; i < this.contacts.size(); i++) {
                String fullName = this.contacts.get(i).getFullName();
                if (fullName != null && !fullName.isEmpty()) {
                    String upperCase = fullName.substring(0, 1).toUpperCase(Locale.getDefault());
                    if (!upperCase.equals(str)) {
                        this.map.put(upperCase, Integer.valueOf(i));
                        str = upperCase;
                    }
                }
            }
            this.sectionsList = new ArrayList<>(this.map.keySet());
            this.sections = new String[this.sectionsList.size()];
            this.sectionsList.toArray(this.sections);
            notifyDataSetChanged();
        }

        public int getCount() {
            return this.contacts.size();
        }

        public Object getItem(int i) {
            if (i >= getCount()) {
                return null;
            }
            return this.contacts.get(i);
        }

        public View getView(final int i, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder;
            LinphoneContact linphoneContact = (LinphoneContact) getItem(i);
            if (linphoneContact == null) {
                return null;
            }
            if (view != null) {
                viewHolder = (ViewHolder) view.getTag();
            } else {
                view = ContactsListFragment.this.mInflater.inflate(C5321R.layout.contact_cell, viewGroup, false);
                viewHolder = new ViewHolder(view);
                view.setTag(viewHolder);
            }
            viewHolder.name.setText(linphoneContact.getFullName());
            if (ContactsListFragment.this.isSearchMode) {
                viewHolder.separator.setVisibility(8);
            } else if (getPositionForSection(getSectionForPosition(i)) != i) {
                viewHolder.separator.setVisibility(8);
            } else {
                viewHolder.separator.setVisibility(0);
                String fullName = linphoneContact.getFullName();
                if (fullName != null && !fullName.isEmpty()) {
                    viewHolder.separatorText.setText(String.valueOf(fullName.charAt(0)));
                }
            }
            if (linphoneContact.isInLinphoneFriendList()) {
                viewHolder.linphoneFriend.setVisibility(0);
            } else {
                viewHolder.linphoneFriend.setVisibility(8);
            }
            viewHolder.contactPicture.setImageBitmap(ContactsManager.getInstance().getDefaultAvatarBitmap());
            if (linphoneContact.hasPhoto()) {
                LinphoneUtils.setThumbnailPictureFromUri(LinphoneActivity.instance(), viewHolder.contactPicture, linphoneContact.getThumbnailUri());
            }
            boolean z = ContactsListFragment.this.getResources().getBoolean(C5321R.bool.display_contact_organization);
            String organization = linphoneContact.getOrganization();
            if (organization == null || organization.isEmpty() || !z) {
                viewHolder.organization.setVisibility(8);
            } else {
                viewHolder.organization.setText(organization);
                viewHolder.organization.setVisibility(0);
            }
            if (ContactsListFragment.this.isEditMode) {
                viewHolder.delete.setVisibility(0);
                viewHolder.delete.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        ContactsListFragment.this.contactsList.setItemChecked(i, z);
                        if (ContactsListFragment.this.getNbItemsChecked() == ContactsListAdapter.this.getCount()) {
                            ContactsListFragment.this.deselectAll.setVisibility(0);
                            ContactsListFragment.this.selectAll.setVisibility(8);
                            ContactsListFragment.this.enabledDeleteButton(true);
                        } else if (ContactsListFragment.this.getNbItemsChecked() == 0) {
                            ContactsListFragment.this.deselectAll.setVisibility(8);
                            ContactsListFragment.this.selectAll.setVisibility(0);
                            ContactsListFragment.this.enabledDeleteButton(false);
                        } else {
                            ContactsListFragment.this.deselectAll.setVisibility(8);
                            ContactsListFragment.this.selectAll.setVisibility(0);
                            ContactsListFragment.this.enabledDeleteButton(true);
                        }
                    }
                });
                if (ContactsListFragment.this.contactsList.isItemChecked(i)) {
                    viewHolder.delete.setChecked(true);
                } else {
                    viewHolder.delete.setChecked(false);
                }
            } else {
                viewHolder.delete.setVisibility(4);
            }
            return view;
        }

        public Object[] getSections() {
            return this.sections;
        }

        public int getPositionForSection(int i) {
            String[] strArr = this.sections;
            if (i >= strArr.length || i < 0) {
                return 0;
            }
            return this.map.get(strArr[i]).intValue();
        }

        public int getSectionForPosition(int i) {
            String fullName;
            if (i >= this.contacts.size() || i < 0 || (fullName = this.contacts.get(i).getFullName()) == null || fullName.isEmpty()) {
                return 0;
            }
            return this.sectionsList.indexOf(fullName.substring(0, 1).toUpperCase(Locale.getDefault()));
        }
    }
}
