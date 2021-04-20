package org.linphone;

import android.app.Dialog;
import android.app.Fragment;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.linphone.mediastream.Log;
import org.linphone.mediastream.Version;

public class ContactEditorFragment extends Fragment {
    private static final int ADD_PHOTO = 1337;
    private static final int PHOTO_SIZE = 128;
    private ImageView addNumber;
    private ImageView addSipAddress;
    private ImageView cancel;
    /* access modifiers changed from: private */
    public LinphoneContact contact;
    private ImageView contactPicture;
    private ImageView deleteContact;
    /* access modifiers changed from: private */
    public EditText firstName;
    private int firstSipAddressIndex = -1;
    private LayoutInflater inflater;
    /* access modifiers changed from: private */
    public boolean isNewContact;
    /* access modifiers changed from: private */
    public EditText lastName;
    private String newDisplayName;
    private String newSipOrNumberToAdd;
    /* access modifiers changed from: private */
    public LinearLayout numbers;
    /* access modifiers changed from: private */
    public List<LinphoneNumberOrAddress> numbersAndAddresses;
    /* access modifiers changed from: private */

    /* renamed from: ok */
    public ImageView f6318ok;
    /* access modifiers changed from: private */
    public EditText organization;
    private LinearLayout phoneNumbersSection;
    /* access modifiers changed from: private */
    public byte[] photoToAdd;
    private Uri pickedPhotoForContactUri;
    /* access modifiers changed from: private */
    public LinearLayout sipAddresses;
    private LinearLayout sipAddressesSection;
    private View view;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.inflater = layoutInflater;
        this.contact = null;
        this.isNewContact = true;
        if (getArguments() != null) {
            Serializable serializable = getArguments().getSerializable("Contact");
            if (serializable != null) {
                this.contact = (LinphoneContact) serializable;
                this.isNewContact = false;
                if (getArguments().getString("NewSipAdress") != null) {
                    this.newSipOrNumberToAdd = getArguments().getString("NewSipAdress");
                }
                if (getArguments().getString("NewDisplayName") != null) {
                    this.newDisplayName = getArguments().getString("NewDisplayName");
                }
            } else if (getArguments().getString("NewSipAdress") != null) {
                this.newSipOrNumberToAdd = getArguments().getString("NewSipAdress");
                if (getArguments().getString("NewDisplayName") != null) {
                    this.newDisplayName = getArguments().getString("NewDisplayName");
                }
            }
        }
        this.view = layoutInflater.inflate(C5321R.layout.contact_edit, viewGroup, false);
        this.phoneNumbersSection = (LinearLayout) this.view.findViewById(C5321R.C5324id.phone_numbers);
        if (getResources().getBoolean(C5321R.bool.hide_phone_numbers_in_editor) || !ContactsManager.getInstance().hasContactsAccess()) {
            this.phoneNumbersSection.setVisibility(8);
        }
        this.sipAddressesSection = (LinearLayout) this.view.findViewById(C5321R.C5324id.sip_addresses);
        if (getResources().getBoolean(C5321R.bool.hide_sip_addresses_in_editor)) {
            this.sipAddressesSection.setVisibility(8);
        }
        this.deleteContact = (ImageView) this.view.findViewById(C5321R.C5324id.delete_contact);
        this.cancel = (ImageView) this.view.findViewById(C5321R.C5324id.cancel);
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ContactEditorFragment.this.getFragmentManager().popBackStackImmediate();
            }
        });
        this.f6318ok = (ImageView) this.view.findViewById(C5321R.C5324id.f6322ok);
        this.f6318ok.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContactEditorFragment.this.isNewContact) {
                    boolean z = true;
                    Iterator it = ContactEditorFragment.this.numbersAndAddresses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        LinphoneNumberOrAddress linphoneNumberOrAddress = (LinphoneNumberOrAddress) it.next();
                        if (linphoneNumberOrAddress.getValue() != null && !linphoneNumberOrAddress.getValue().equals("")) {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        ContactEditorFragment.this.getFragmentManager().popBackStackImmediate();
                        return;
                    }
                    LinphoneContact unused = ContactEditorFragment.this.contact = LinphoneContact.createContact();
                }
                ContactEditorFragment.this.contact.setFirstNameAndLastName(ContactEditorFragment.this.firstName.getText().toString(), ContactEditorFragment.this.lastName.getText().toString());
                if (ContactEditorFragment.this.photoToAdd != null) {
                    ContactEditorFragment.this.contact.setPhoto(ContactEditorFragment.this.photoToAdd);
                }
                for (LinphoneNumberOrAddress linphoneNumberOrAddress2 : ContactEditorFragment.this.numbersAndAddresses) {
                    if (linphoneNumberOrAddress2.isSIPAddress() && linphoneNumberOrAddress2.getValue() != null) {
                        linphoneNumberOrAddress2.setValue(LinphoneUtils.getFullAddressFromUsername(linphoneNumberOrAddress2.getValue()));
                    }
                    ContactEditorFragment.this.contact.addOrUpdateNumberOrAddress(linphoneNumberOrAddress2);
                }
                ContactEditorFragment.this.contact.setOrganization(ContactEditorFragment.this.organization.getText().toString());
                ContactEditorFragment.this.contact.save();
                ContactEditorFragment.this.getFragmentManager().popBackStackImmediate();
            }
        });
        this.lastName = (EditText) this.view.findViewById(C5321R.C5324id.contactLastName);
        if (Version.sdkStrictlyBelow(11)) {
            this.lastName.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ((InputMethodManager) LinphoneActivity.instance().getSystemService("input_method")).toggleSoftInput(2, 0);
                }
            });
        }
        this.lastName.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (ContactEditorFragment.this.lastName.getText().length() > 0 || ContactEditorFragment.this.firstName.getText().length() > 0) {
                    ContactEditorFragment.this.f6318ok.setEnabled(true);
                } else {
                    ContactEditorFragment.this.f6318ok.setEnabled(false);
                }
            }
        });
        this.firstName = (EditText) this.view.findViewById(C5321R.C5324id.contactFirstName);
        this.firstName.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (ContactEditorFragment.this.firstName.getText().length() > 0 || ContactEditorFragment.this.lastName.getText().length() > 0) {
                    ContactEditorFragment.this.f6318ok.setEnabled(true);
                } else {
                    ContactEditorFragment.this.f6318ok.setEnabled(false);
                }
            }
        });
        this.organization = (EditText) this.view.findViewById(C5321R.C5324id.contactOrganization);
        if (!getResources().getBoolean(C5321R.bool.display_contact_organization)) {
            this.organization.setVisibility(8);
            this.view.findViewById(C5321R.C5324id.contactOrganizationTitle).setVisibility(8);
        } else if (!this.isNewContact) {
            this.organization.setText(this.contact.getOrganization());
        }
        if (!this.isNewContact) {
            String firstName2 = this.contact.getFirstName();
            String lastName2 = this.contact.getLastName();
            if (firstName2 == null && lastName2 == null) {
                this.lastName.setText(this.contact.getFullName());
                this.firstName.setText("");
            } else {
                this.firstName.setText(firstName2);
                this.lastName.setText(lastName2);
            }
            this.deleteContact.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    final Dialog displayDialog = LinphoneActivity.instance().displayDialog(ContactEditorFragment.this.getString(C5321R.string.delete_text));
                    ((Button) displayDialog.findViewById(C5321R.C5324id.delete_button)).setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            ContactEditorFragment.this.contact.delete();
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
            });
        } else {
            this.deleteContact.setVisibility(4);
        }
        this.contactPicture = (ImageView) this.view.findViewById(C5321R.C5324id.contact_picture);
        if (this.contact != null) {
            LinphoneUtils.setImagePictureFromUri(getActivity(), this.contactPicture, this.contact.getPhotoUri(), this.contact.getThumbnailUri());
        } else {
            this.contactPicture.setImageBitmap(ContactsManager.getInstance().getDefaultAvatarBitmap());
        }
        this.contactPicture.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ContactEditorFragment.this.pickImage();
                LinphoneActivity.instance().checkAndRequestCameraPermission();
            }
        });
        this.numbersAndAddresses = new ArrayList();
        this.sipAddresses = initSipAddressFields(this.contact);
        this.numbers = initNumbersFields(this.contact);
        this.addSipAddress = (ImageView) this.view.findViewById(C5321R.C5324id.add_address_field);
        if (getResources().getBoolean(C5321R.bool.allow_only_one_sip_address)) {
            this.addSipAddress.setVisibility(8);
        }
        this.addSipAddress.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ContactEditorFragment contactEditorFragment = ContactEditorFragment.this;
                contactEditorFragment.addEmptyRowToAllowNewNumberOrAddress(contactEditorFragment.sipAddresses, true);
            }
        });
        this.addNumber = (ImageView) this.view.findViewById(C5321R.C5324id.add_number_field);
        if (getResources().getBoolean(C5321R.bool.allow_only_one_phone_number)) {
            this.addNumber.setVisibility(8);
        }
        this.addNumber.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ContactEditorFragment contactEditorFragment = ContactEditorFragment.this;
                contactEditorFragment.addEmptyRowToAllowNewNumberOrAddress(contactEditorFragment.numbers, false);
            }
        });
        this.lastName.requestFocus();
        return this.view;
    }

    public void onResume() {
        super.onResume();
        if (LinphoneActivity.isInstanciated()) {
            LinphoneActivity.instance().hideTabBar(false);
        }
        getActivity().getWindow().setSoftInputMode(35);
    }

    public void onPause() {
        InputMethodManager inputMethodManager = (InputMethodManager) getActivity().getSystemService("input_method");
        View currentFocus = getActivity().getCurrentFocus();
        if (!(inputMethodManager == null || currentFocus == null)) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
        super.onPause();
    }

    /* access modifiers changed from: private */
    public void pickImage() {
        this.pickedPhotoForContactUri = null;
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        this.pickedPhotoForContactUri = Uri.fromFile(new File(Environment.getExternalStorageDirectory(), getString(C5321R.string.temp_photo_name)));
        intent.putExtra("outputX", 128);
        intent.putExtra("outputY", 128);
        intent.putExtra("aspectX", 0);
        intent.putExtra("aspectY", 0);
        intent.putExtra("scale", true);
        intent.putExtra("return-data", false);
        intent.putExtra("output", this.pickedPhotoForContactUri);
        arrayList.add(intent);
        Intent intent2 = new Intent();
        intent2.setType("image/*");
        intent2.setAction("android.intent.action.GET_CONTENT");
        Intent createChooser = Intent.createChooser(intent2, getString(C5321R.string.image_picker_title));
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        startActivityForResult(createChooser, ADD_PHOTO);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != ADD_PHOTO || i2 != -1) {
            super.onActivityResult(i, i2, intent);
        } else if (intent != null && intent.getExtras() != null && intent.getExtras().get("data") != null) {
            editContactPicture((String) null, (Bitmap) intent.getExtras().get("data"));
        } else if (intent == null || intent.getData() == null) {
            Uri uri = this.pickedPhotoForContactUri;
            if (uri != null) {
                editContactPicture(uri.getPath(), (Bitmap) null);
                return;
            }
            File file = new File(Environment.getExternalStorageDirectory(), getString(C5321R.string.temp_photo_name));
            if (file.exists()) {
                this.pickedPhotoForContactUri = Uri.fromFile(file);
                editContactPicture(this.pickedPhotoForContactUri.getPath(), (Bitmap) null);
            }
        } else {
            try {
                editContactPicture((String) null, Bitmap.createScaledBitmap(MediaStore.Images.Media.getBitmap(LinphoneManager.getInstance().getContext().getContentResolver(), intent.getData()), 128, 128, false));
            } catch (IOException e) {
                Log.m6903e(e);
            }
        }
    }

    private void editContactPicture(String str, Bitmap bitmap) {
        Bitmap bitmap2;
        if (bitmap == null) {
            bitmap = BitmapFactory.decodeFile(str);
        }
        int thumbnailSize = getThumbnailSize();
        if (thumbnailSize > 0) {
            bitmap2 = Bitmap.createScaledBitmap(bitmap, thumbnailSize, thumbnailSize, false);
        } else {
            bitmap2 = Bitmap.createBitmap(bitmap);
        }
        bitmap.recycle();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap2.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        this.contactPicture.setImageBitmap(bitmap2);
        this.photoToAdd = byteArrayOutputStream.toByteArray();
    }

    private int getThumbnailSize() {
        Cursor query = LinphoneActivity.instance().getContentResolver().query(ContactsContract.DisplayPhoto.CONTENT_MAX_DIMENSIONS_URI, new String[]{"thumbnail_max_dim"}, (String) null, (String[]) null, (String) null);
        try {
            query.moveToFirst();
            return query.getInt(0);
        } catch (Exception e) {
            Log.m6903e(e);
            return -1;
        }
    }

    private LinearLayout initNumbersFields(LinphoneContact linphoneContact) {
        View displayNumberOrAddress;
        View displayNumberOrAddress2;
        LinearLayout linearLayout = (LinearLayout) this.view.findViewById(C5321R.C5324id.controls_numbers);
        linearLayout.removeAllViews();
        if (linphoneContact != null) {
            for (LinphoneNumberOrAddress next : linphoneContact.getNumbersOrAddresses()) {
                if (!next.isSIPAddress() && (displayNumberOrAddress2 = displayNumberOrAddress(linearLayout, next.getValue(), false)) != null) {
                    linearLayout.addView(displayNumberOrAddress2);
                }
            }
        }
        String str = this.newSipOrNumberToAdd;
        if (str != null) {
            if (!(LinphoneUtils.isStrictSipAddress(str) || !LinphoneUtils.isNumberAddress(this.newSipOrNumberToAdd)) && (displayNumberOrAddress = displayNumberOrAddress(linearLayout, this.newSipOrNumberToAdd, false)) != null) {
                linearLayout.addView(displayNumberOrAddress);
            }
        }
        if (this.newDisplayName != null) {
            EditText editText = (EditText) this.view.findViewById(C5321R.C5324id.contactLastName);
            if (this.view != null) {
                editText.setText(this.newDisplayName);
            }
        }
        if (linearLayout.getChildCount() == 0) {
            addEmptyRowToAllowNewNumberOrAddress(linearLayout, false);
        }
        return linearLayout;
    }

    private LinearLayout initSipAddressFields(LinphoneContact linphoneContact) {
        View displayNumberOrAddress;
        View displayNumberOrAddress2;
        LinearLayout linearLayout = (LinearLayout) this.view.findViewById(C5321R.C5324id.controls_sip_address);
        linearLayout.removeAllViews();
        if (linphoneContact != null) {
            for (LinphoneNumberOrAddress next : linphoneContact.getNumbersOrAddresses()) {
                if (next.isSIPAddress() && (displayNumberOrAddress2 = displayNumberOrAddress(linearLayout, next.getValue(), true)) != null) {
                    linearLayout.addView(displayNumberOrAddress2);
                }
            }
        }
        String str = this.newSipOrNumberToAdd;
        if (str != null) {
            if ((LinphoneUtils.isStrictSipAddress(str) || !LinphoneUtils.isNumberAddress(this.newSipOrNumberToAdd)) && (displayNumberOrAddress = displayNumberOrAddress(linearLayout, this.newSipOrNumberToAdd, true)) != null) {
                linearLayout.addView(displayNumberOrAddress);
            }
        }
        if (linearLayout.getChildCount() == 0) {
            addEmptyRowToAllowNewNumberOrAddress(linearLayout, true);
        }
        return linearLayout;
    }

    private View displayNumberOrAddress(LinearLayout linearLayout, String str, boolean z) {
        return displayNumberOrAddress(linearLayout, str, z, false);
    }

    private View displayNumberOrAddress(LinearLayout linearLayout, String str, boolean z, boolean z2) {
        String str2;
        final LinphoneNumberOrAddress linphoneNumberOrAddress;
        if (z) {
            if (this.firstSipAddressIndex == -1) {
                this.firstSipAddressIndex = linearLayout.getChildCount();
            }
            str2 = LinphoneUtils.getDisplayableUsernameFromAddress(str);
        } else {
            str2 = str;
        }
        if ((getResources().getBoolean(C5321R.bool.hide_phone_numbers_in_editor) && !z) || (getResources().getBoolean(C5321R.bool.hide_sip_addresses_in_editor) && z)) {
            if (!z2) {
                return null;
            }
            z = !z;
        }
        if (z2) {
            linphoneNumberOrAddress = new LinphoneNumberOrAddress((String) null, z);
        } else if (this.isNewContact || this.newSipOrNumberToAdd != null) {
            linphoneNumberOrAddress = new LinphoneNumberOrAddress(str, z);
        } else {
            linphoneNumberOrAddress = new LinphoneNumberOrAddress((String) null, z, str);
        }
        this.numbersAndAddresses.add(linphoneNumberOrAddress);
        final View inflate = this.inflater.inflate(C5321R.layout.contact_edit_row, (ViewGroup) null);
        final EditText editText = (EditText) inflate.findViewById(C5321R.C5324id.numoraddr);
        if (!z) {
            editText.setInputType(3);
        }
        editText.setText(str2);
        editText.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                linphoneNumberOrAddress.setValue(editText.getText().toString());
            }
        });
        if (z2) {
            linphoneNumberOrAddress.setValue(editText.getText().toString());
        }
        ImageView imageView = (ImageView) inflate.findViewById(C5321R.C5324id.delete_field);
        if ((getResources().getBoolean(C5321R.bool.allow_only_one_phone_number) && !z) || (getResources().getBoolean(C5321R.bool.allow_only_one_sip_address) && z)) {
            imageView.setVisibility(8);
        }
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContactEditorFragment.this.contact != null) {
                    ContactEditorFragment.this.contact.removeNumberOrAddress(linphoneNumberOrAddress);
                }
                ContactEditorFragment.this.numbersAndAddresses.remove(linphoneNumberOrAddress);
                inflate.setVisibility(8);
            }
        });
        return inflate;
    }

    /* access modifiers changed from: private */
    public void addEmptyRowToAllowNewNumberOrAddress(LinearLayout linearLayout, boolean z) {
        final View inflate = this.inflater.inflate(C5321R.layout.contact_edit_row, (ViewGroup) null);
        final LinphoneNumberOrAddress linphoneNumberOrAddress = new LinphoneNumberOrAddress((String) null, z);
        final EditText editText = (EditText) inflate.findViewById(C5321R.C5324id.numoraddr);
        this.numbersAndAddresses.add(linphoneNumberOrAddress);
        editText.setHint(getString(z ? C5321R.string.sip_address : C5321R.string.phone_number));
        if (!z) {
            editText.setInputType(3);
        }
        editText.requestFocus();
        editText.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                linphoneNumberOrAddress.setValue(editText.getText().toString());
            }
        });
        ImageView imageView = (ImageView) inflate.findViewById(C5321R.C5324id.delete_field);
        if ((getResources().getBoolean(C5321R.bool.allow_only_one_phone_number) && !z) || (getResources().getBoolean(C5321R.bool.allow_only_one_sip_address) && z)) {
            imageView.setVisibility(8);
        }
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ContactEditorFragment.this.numbersAndAddresses.remove(linphoneNumberOrAddress);
                inflate.setVisibility(8);
            }
        });
        linearLayout.addView(inflate);
    }
}
