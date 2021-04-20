package org.linphone;

import android.app.Dialog;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.webkit.MimeTypeMap;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import com.facebook.common.util.UriUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.linphone.compatibility.Compatibility;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneBuffer;
import org.linphone.core.LinphoneChatMessage;
import org.linphone.core.LinphoneChatRoom;
import org.linphone.core.LinphoneContent;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreFactory;
import org.linphone.core.LinphoneCoreListenerBase;
import org.linphone.core.LinphoneFriend;
import org.linphone.mediastream.Log;

public class ChatFragment extends Fragment implements View.OnClickListener, LinphoneChatMessage.LinphoneChatMessageListener, ContactsUpdatedListener {
    private static final int ADD_PHOTO = 1337;
    /* access modifiers changed from: private */
    public static ArrayList<ChatUpdatedListener> ChatUpdatedListeners = null;
    private static final int MENU_COPY_TEXT = 6;
    private static final int MENU_DELETE_MESSAGE = 0;
    private static final int MENU_PICTURE_LARGE = 4;
    private static final int MENU_PICTURE_MEDIUM = 3;
    private static final int MENU_PICTURE_REAL = 5;
    private static final int MENU_PICTURE_SMALL = 2;
    private static final int MENU_RESEND_MESSAGE = 7;
    private static final int SIZE_LARGE = 1500;
    private static final int SIZE_MAX = 2048;
    private static final int SIZE_MEDIUM = 1000;
    private static final int SIZE_SMALL = 500;
    /* access modifiers changed from: private */
    public ChatMessageAdapter adapter;
    private ImageView back;
    private ImageView backToCall;
    private ImageView cancel;
    /* access modifiers changed from: private */
    public LinphoneChatRoom chatRoom;
    /* access modifiers changed from: private */
    public LinphoneContact contact;
    private TextView contactName;
    /* access modifiers changed from: private */
    public Bitmap defaultBitmap;
    private ImageView delete;
    /* access modifiers changed from: private */
    public ImageView deselectAll;
    private ImageView edit;
    private LinearLayout editList;
    private String fileAlreadySharedUri;
    private String filePathToUpload;
    private String fileSharedUri;
    private Uri imageToUploadUri;
    /* access modifiers changed from: private */
    public LayoutInflater inflater;
    /* access modifiers changed from: private */
    public boolean isEditMode = false;
    private ViewTreeObserver.OnGlobalLayoutListener keyboardListener;
    private LinphoneCoreListenerBase mListener;
    /* access modifiers changed from: private */
    public EditText message;
    /* access modifiers changed from: private */
    public ListView messagesList;
    /* access modifiers changed from: private */
    public boolean newChatConversation = false;
    /* access modifiers changed from: private */
    public TextView remoteComposing;
    private ListView resultContactsSearch;
    private SearchContactsListAdapter searchAdapter;
    /* access modifiers changed from: private */
    public EditText searchContactField;
    /* access modifiers changed from: private */
    public ImageView selectAll;
    private ImageView sendImage;
    /* access modifiers changed from: private */
    public ImageView sendMessage;
    /* access modifiers changed from: private */
    public String sipUri;
    private ImageView startCall;
    private TextWatcher textWatcher;
    private LinearLayout topBar;

    public void onLinphoneChatMessageFileTransferProgressChanged(LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, int i, int i2) {
    }

    public void onLinphoneChatMessageFileTransferReceived(LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, LinphoneBuffer linphoneBuffer) {
    }

    public void onLinphoneChatMessageFileTransferSent(LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, int i, int i2, LinphoneBuffer linphoneBuffer) {
    }

    public static void createIfNotExist() {
        if (ChatUpdatedListeners == null) {
            ChatUpdatedListeners = new ArrayList<>();
        }
    }

    public static void addChatListener(ChatUpdatedListener chatUpdatedListener) {
        ChatUpdatedListeners.add(chatUpdatedListener);
    }

    public static void removeChatListener(ChatUpdatedListener chatUpdatedListener) {
        ChatUpdatedListeners.remove(chatUpdatedListener);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreate(bundle);
        View inflate = layoutInflater.inflate(C5321R.layout.chat, viewGroup, false);
        LinphoneManager.addListener(this);
        setRetainInstance(true);
        this.inflater = layoutInflater;
        if (getArguments() == null || getArguments().getString("SipUri") == null) {
            this.newChatConversation = true;
        } else {
            this.sipUri = getArguments().getString("SipUri");
            this.newChatConversation = false;
        }
        this.defaultBitmap = BitmapFactory.decodeResource(getActivity().getResources(), C5321R.C5323drawable.chat_picture_over);
        this.contactName = (TextView) inflate.findViewById(C5321R.C5324id.contact_name);
        this.messagesList = (ListView) inflate.findViewById(C5321R.C5324id.chat_message_list);
        this.searchContactField = (EditText) inflate.findViewById(C5321R.C5324id.search_contact_field);
        this.resultContactsSearch = (ListView) inflate.findViewById(C5321R.C5324id.result_contacts);
        this.editList = (LinearLayout) inflate.findViewById(C5321R.C5324id.edit_list);
        this.topBar = (LinearLayout) inflate.findViewById(C5321R.C5324id.top_bar);
        this.sendMessage = (ImageView) inflate.findViewById(C5321R.C5324id.send_message);
        this.sendMessage.setOnClickListener(this);
        this.remoteComposing = (TextView) inflate.findViewById(C5321R.C5324id.remote_composing);
        this.remoteComposing.setVisibility(8);
        this.cancel = (ImageView) inflate.findViewById(C5321R.C5324id.cancel);
        this.cancel.setOnClickListener(this);
        this.edit = (ImageView) inflate.findViewById(C5321R.C5324id.edit);
        this.edit.setOnClickListener(this);
        this.startCall = (ImageView) inflate.findViewById(C5321R.C5324id.start_call);
        this.startCall.setOnClickListener(this);
        this.backToCall = (ImageView) inflate.findViewById(C5321R.C5324id.back_to_call);
        this.backToCall.setOnClickListener(this);
        this.selectAll = (ImageView) inflate.findViewById(C5321R.C5324id.select_all);
        this.selectAll.setOnClickListener(this);
        this.deselectAll = (ImageView) inflate.findViewById(C5321R.C5324id.deselect_all);
        this.deselectAll.setOnClickListener(this);
        this.delete = (ImageView) inflate.findViewById(C5321R.C5324id.delete);
        this.delete.setOnClickListener(this);
        if (getArguments().getString("fileSharedUri") == null || getArguments().getString("fileSharedUri") == "") {
            this.fileSharedUri = null;
        } else {
            this.fileSharedUri = getArguments().getString("fileSharedUri");
        }
        if (this.newChatConversation) {
            initNewChatConversation();
        }
        this.message = (EditText) inflate.findViewById(C5321R.C5324id.message);
        if (getArguments().getString("messageDraft") != null) {
            this.message.setText(getArguments().getString("messageDraft"));
        }
        this.sendImage = (ImageView) inflate.findViewById(C5321R.C5324id.send_picture);
        if (!getResources().getBoolean(C5321R.bool.disable_chat_send_file)) {
            this.sendImage.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (LinphoneManager.getLc().getLimeEncryption() != LinphoneCore.LinphoneLimeState.Mandatory || (ChatFragment.this.chatRoom != null && ChatFragment.this.chatRoom.islimeAvailable())) {
                        ChatFragment.this.pickImage();
                        LinphoneActivity.instance().checkAndRequestPermissionsToSendImage();
                        return;
                    }
                    ChatFragment.this.askingForLimeCall();
                }
            });
        } else {
            this.sendImage.setEnabled(false);
        }
        this.back = (ImageView) inflate.findViewById(C5321R.C5324id.back);
        if (getResources().getBoolean(C5321R.bool.isTablet)) {
            this.back.setVisibility(4);
        } else {
            this.back.setOnClickListener(this);
        }
        this.mListener = new LinphoneCoreListenerBase() {
            public void messageReceived(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom, LinphoneChatMessage linphoneChatMessage) {
                if (linphoneChatRoom.getPeerAddress().asStringUriOnly().equals(ChatFragment.this.sipUri)) {
                    linphoneChatRoom.markAsRead();
                    LinphoneActivity.instance().updateMissedChatCount();
                    ChatFragment.this.adapter.addMessage(linphoneChatMessage);
                    String externalBodyUrl = linphoneChatMessage.getExternalBodyUrl();
                    LinphoneContent fileTransferInformation = linphoneChatMessage.getFileTransferInformation();
                    if (!(externalBodyUrl == null && fileTransferInformation == null)) {
                        LinphoneActivity.instance().checkAndRequestExternalStoragePermission();
                    }
                }
                if (ChatFragment.this.getResources().getBoolean(C5321R.bool.isTablet)) {
                    Iterator it = ChatFragment.ChatUpdatedListeners.iterator();
                    while (it.hasNext()) {
                        ((ChatUpdatedListener) it.next()).onChatUpdated();
                    }
                }
            }

            public void isComposingReceived(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom) {
                if (ChatFragment.this.chatRoom != null && linphoneChatRoom != null && ChatFragment.this.chatRoom.getPeerAddress().asStringUriOnly().equals(linphoneChatRoom.getPeerAddress().asStringUriOnly())) {
                    ChatFragment.this.remoteComposing.setVisibility(ChatFragment.this.chatRoom.isRemoteComposing() ? 0 : 8);
                }
            }
        };
        this.textWatcher = new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (ChatFragment.this.message.getText().toString().equals("")) {
                    ChatFragment.this.sendMessage.setEnabled(false);
                    return;
                }
                if (ChatFragment.this.chatRoom != null) {
                    ChatFragment.this.chatRoom.compose();
                }
                ChatFragment.this.sendMessage.setEnabled(true);
            }
        };
        return inflate;
    }

    public void onSaveInstanceState(Bundle bundle) {
        EditText editText = this.message;
        if (editText != null) {
            bundle.putString("messageDraft", editText.getText().toString());
        }
        LinphoneContact linphoneContact = this.contact;
        if (linphoneContact != null) {
            bundle.putSerializable("contactDraft", linphoneContact);
            bundle.putString("sipUriDraft", this.sipUri);
        }
        String str = this.sipUri;
        if (str != null) {
            bundle.putString("sipUriDraft", str);
            bundle.putString("SipUri", this.sipUri);
        }
        bundle.putString("fileSharedUri", "");
        super.onSaveInstanceState(bundle);
    }

    private void addVirtualKeyboardVisiblityListener() {
        this.keyboardListener = new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                Rect rect = new Rect();
                ChatFragment.this.getActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                if (ChatFragment.this.getActivity().getWindow().getDecorView().getRootView().getHeight() - (rect.bottom - rect.top) > 200) {
                    ChatFragment.this.showKeyboardVisibleMode();
                } else {
                    ChatFragment.this.hideKeyboardVisibleMode();
                }
            }
        };
        getActivity().getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this.keyboardListener);
    }

    private void removeVirtualKeyboardVisiblityListener() {
        Compatibility.removeGlobalLayoutListener(getActivity().getWindow().getDecorView().getViewTreeObserver(), this.keyboardListener);
    }

    public void showKeyboardVisibleMode() {
        if (getResources().getConfiguration().orientation == 2) {
            LinearLayout linearLayout = this.topBar;
        }
        LinphoneActivity.instance().hideTabBar(true);
    }

    public void hideKeyboardVisibleMode() {
        if (getResources().getConfiguration().orientation == 2) {
            LinearLayout linearLayout = this.topBar;
        }
        LinphoneActivity.instance().hideTabBar(false);
    }

    public int getNbItemsChecked() {
        int count = this.messagesList.getAdapter().getCount();
        int i = 0;
        for (int i2 = 0; i2 < count; i2++) {
            if (this.messagesList.isItemChecked(i2)) {
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

    public void initChatRoom(String str) {
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        LinphoneAddress linphoneAddress = null;
        if (str == null) {
            this.contact = null;
            initNewChatConversation();
            return;
        }
        try {
            linphoneAddress = lcIfManagerNotDestroyedOrNull.interpretUrl(str);
        } catch (Exception unused) {
            LinphoneActivity.instance().goToDialerFragment();
        }
        if (linphoneAddress != null) {
            this.chatRoom = lcIfManagerNotDestroyedOrNull.getChatRoom(linphoneAddress);
            this.chatRoom.markAsRead();
            LinphoneActivity.instance().updateMissedChatCount();
            this.contact = ContactsManager.getInstance().findContactFromAddress(linphoneAddress);
            if (this.chatRoom != null) {
                int i = 8;
                this.searchContactField.setVisibility(8);
                this.resultContactsSearch.setVisibility(8);
                displayChatHeader(linphoneAddress);
                displayMessageList();
                TextView textView = this.remoteComposing;
                if (this.chatRoom.isRemoteComposing()) {
                    i = 0;
                }
                textView.setVisibility(i);
            }
        }
    }

    private void redrawMessageList() {
        ChatMessageAdapter chatMessageAdapter = this.adapter;
        if (chatMessageAdapter != null) {
            chatMessageAdapter.notifyDataSetChanged();
        }
    }

    private void displayMessageList() {
        if (this.chatRoom != null) {
            ChatMessageAdapter chatMessageAdapter = this.adapter;
            if (chatMessageAdapter != null) {
                chatMessageAdapter.refreshHistory();
            } else {
                this.adapter = new ChatMessageAdapter(getActivity());
            }
        }
        this.messagesList.setAdapter(this.adapter);
        this.messagesList.setVisibility(0);
    }

    private void displayChatHeader(LinphoneAddress linphoneAddress) {
        if (this.contact != null || linphoneAddress != null) {
            LinphoneContact linphoneContact = this.contact;
            if (linphoneContact != null) {
                this.contactName.setText(linphoneContact.getFullName());
            } else {
                this.contactName.setText(LinphoneUtils.getAddressDisplayName(linphoneAddress));
            }
            this.topBar.setVisibility(0);
            this.edit.setVisibility(0);
            this.contactName.setVisibility(0);
        }
    }

    public void changeDisplayedChat(String str, String str2, String str3, String str4, String str5) {
        this.sipUri = str;
        if (str4 != null) {
            this.message.setText(str4);
        }
        if (str5 != null) {
            this.fileSharedUri = str5;
        }
        initChatRoom(this.sipUri);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (view.getId() == C5321R.C5324id.send_picture) {
            contextMenu.add(0, 2, 0, getString(C5321R.string.share_picture_size_small));
            contextMenu.add(0, 3, 0, getString(C5321R.string.share_picture_size_medium));
            contextMenu.add(0, 4, 0, getString(C5321R.string.share_picture_size_large));
            return;
        }
        contextMenu.add(view.getId(), 0, 0, getString(C5321R.string.delete));
        contextMenu.add(view.getId(), 6, 0, getString(C5321R.string.copy_text));
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        LinphoneChatMessage messageForId;
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId == 2) {
                sendImageMessage(this.filePathToUpload, 500);
                return true;
            } else if (itemId == 3) {
                sendImageMessage(this.filePathToUpload, 1000);
                return true;
            } else if (itemId == 4) {
                sendImageMessage(this.filePathToUpload, 1500);
                return true;
            } else if (itemId == 5) {
                sendImageMessage(this.filePathToUpload, 2048);
                return true;
            } else if (itemId != 6) {
                return true;
            } else {
                copyTextMessageToClipboard(menuItem.getGroupId());
                return true;
            }
        } else if (this.chatRoom == null || (messageForId = getMessageForId(menuItem.getGroupId())) == null) {
            return true;
        } else {
            this.chatRoom.deleteMessage(messageForId);
            if (getResources().getBoolean(C5321R.bool.isTablet) && this.chatRoom.getHistorySize() <= 0 && LinphoneActivity.isInstanciated()) {
                LinphoneActivity.instance().displayChat("", (String) null, (String) null);
                LinphoneActivity.instance().onMessageSent("", (String) null);
                initNewChatConversation();
            }
            invalidate();
            return true;
        }
    }

    public void onPause() {
        this.message.removeTextChangedListener(this.textWatcher);
        removeVirtualKeyboardVisiblityListener();
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.removeListener(this.mListener);
        }
        LinphoneManager.removeListener(this);
        onSaveInstanceState(getArguments());
        ((InputMethodManager) getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.message.getWindowToken(), 0);
        super.onPause();
    }

    public void onDestroy() {
        ChatMessageAdapter chatMessageAdapter = this.adapter;
        if (chatMessageAdapter != null) {
            chatMessageAdapter.destroy();
        }
        Bitmap bitmap = this.defaultBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.defaultBitmap = null;
        }
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        ContactsManager.addContactsListener(this);
        this.message.addTextChangedListener(this.textWatcher);
        addVirtualKeyboardVisiblityListener();
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.addListener(this.mListener);
        }
        if (LinphoneActivity.isInstanciated()) {
            LinphoneActivity.instance().selectMenu(FragmentsAvailable.CHAT);
        }
        LinphoneManager.addListener(this);
        getActivity().getWindow().setSoftInputMode(35);
        this.message.setText(getArguments().getString("messageDraft"));
        this.contact = (LinphoneContact) getArguments().getSerializable("contactDraft");
        LinphoneContact linphoneContact = this.contact;
        int i = 0;
        if (linphoneContact != null) {
            this.contactName.setText(linphoneContact.getFullName());
            this.sipUri = getArguments().getString("SipUri");
            this.newChatConversation = false;
            getArguments().clear();
        } else if (getArguments().getString("sipUriDraft") != null) {
            this.sipUri = getArguments().getString("sipUriDraft");
            this.newChatConversation = false;
        } else if (this.sipUri != null) {
            this.newChatConversation = false;
        } else {
            this.sipUri = null;
            this.newChatConversation = true;
        }
        if (LinphoneManager.getLc().isIncall()) {
            this.backToCall.setVisibility(0);
            this.startCall.setVisibility(8);
        } else if (!this.newChatConversation) {
            this.backToCall.setVisibility(8);
            this.startCall.setVisibility(0);
        }
        if (!this.newChatConversation || this.contact != null) {
            initChatRoom(this.sipUri);
            this.searchContactField.setVisibility(8);
            this.resultContactsSearch.setVisibility(8);
            TextView textView = this.remoteComposing;
            if (!this.chatRoom.isRemoteComposing()) {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    private void selectAllList(boolean z) {
        int count = this.messagesList.getAdapter().getCount();
        for (int i = 0; i < count; i++) {
            this.messagesList.setItemChecked(i, z);
        }
    }

    public void quitEditMode() {
        this.isEditMode = false;
        this.editList.setVisibility(8);
        this.topBar.setVisibility(0);
        redrawMessageList();
    }

    /* access modifiers changed from: private */
    public void removeChats() {
        int count = this.messagesList.getAdapter().getCount();
        for (int i = 0; i < count; i++) {
            if (this.messagesList.isItemChecked(i)) {
                this.chatRoom.deleteMessage((LinphoneChatMessage) this.messagesList.getAdapter().getItem(i));
            }
        }
        if (getResources().getBoolean(C5321R.bool.isTablet) && this.chatRoom.getHistorySize() <= 0 && LinphoneActivity.isInstanciated()) {
            LinphoneActivity.instance().displayChat("", (String) null, (String) null);
            LinphoneActivity.instance().onMessageSent("", (String) null);
            initNewChatConversation();
        }
        invalidate();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C5321R.C5324id.back_to_call) {
            LinphoneActivity.instance().resetClassicMenuLayoutAndGoBackToCallIfStillRunning();
        } else if (id == C5321R.C5324id.select_all) {
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
                    ChatFragment.this.removeChats();
                    displayDialog.dismiss();
                    ChatFragment.this.quitEditMode();
                }
            });
            ((Button) displayDialog.findViewById(C5321R.C5324id.cancel)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    displayDialog.dismiss();
                    ChatFragment.this.quitEditMode();
                }
            });
            displayDialog.show();
        } else {
            if (id == C5321R.C5324id.send_message) {
                sendTextMessage();
            }
            if (id == C5321R.C5324id.edit) {
                this.topBar.setVisibility(4);
                this.editList.setVisibility(0);
                this.isEditMode = true;
                redrawMessageList();
            }
            if (id == C5321R.C5324id.start_call) {
                LinphoneActivity instance = LinphoneActivity.instance();
                String str = this.sipUri;
                instance.setAddresGoToDialerAndCall(str, LinphoneUtils.getUsernameFromAddress(str), (Uri) null);
            }
            if (id == C5321R.C5324id.back) {
                cleanIntentAndFiles();
                getFragmentManager().popBackStackImmediate();
            }
        }
    }

    private void cleanIntentAndFiles() {
        if (getArguments().getString("fileSharedUri") != null) {
            getArguments().remove("fileSharedUri");
            this.fileSharedUri = null;
        }
        this.message.setText("");
        if (getArguments().getString("messageDraft") != null) {
            getArguments().remove("messageDraft");
        }
        getArguments().clear();
    }

    private void sendTextMessage() {
        LinphoneChatRoom linphoneChatRoom;
        if (LinphoneManager.isInstanciated() && LinphoneManager.getLc() != null) {
            if (this.searchContactField.getVisibility() != 0 || this.searchContactField.getText().toString().length() >= 1) {
                LinphoneCore.LinphoneLimeState limeEncryption = LinphoneManager.getLc().getLimeEncryption();
                if (limeEncryption == LinphoneCore.LinphoneLimeState.Disabled || limeEncryption == LinphoneCore.LinphoneLimeState.Preferred || (limeEncryption == LinphoneCore.LinphoneLimeState.Mandatory && (linphoneChatRoom = this.chatRoom) != null && linphoneChatRoom.islimeAvailable())) {
                    sendTextMessage(this.message.getText().toString());
                    this.message.setText("");
                    invalidate();
                    return;
                }
                askingForLimeCall();
            }
        }
    }

    private void sendTextMessage(String str) {
        boolean z;
        String lowerCase;
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull == null) {
            z = false;
        } else {
            z = lcIfManagerNotDestroyedOrNull.isNetworkReachable();
        }
        if (this.newChatConversation && this.chatRoom == null && (lowerCase = this.searchContactField.getText().toString().toLowerCase(Locale.getDefault())) != null && !lowerCase.equals("")) {
            initChatRoom(lowerCase);
        }
        if (this.chatRoom != null && str != null && str.length() > 0 && z) {
            LinphoneChatMessage createLinphoneChatMessage = this.chatRoom.createLinphoneChatMessage(str);
            this.chatRoom.sendChatMessage(createLinphoneChatMessage);
            LinphoneAddress peerAddress = this.chatRoom.getPeerAddress();
            if (LinphoneActivity.isInstanciated()) {
                LinphoneActivity.instance().onMessageSent(this.sipUri, str);
            }
            createLinphoneChatMessage.setListener(LinphoneManager.getInstance());
            if (this.newChatConversation) {
                exitNewConversationMode(peerAddress.asStringUriOnly());
            } else {
                this.adapter.addMessage(createLinphoneChatMessage);
            }
            Log.m6905i("Sent message current status: " + createLinphoneChatMessage.getStatus());
        } else if (!z && LinphoneActivity.isInstanciated()) {
            LinphoneActivity.instance().displayCustomToast(getString(C5321R.string.error_network_unreachable), 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c1 A[Catch:{ RuntimeException -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d2 A[Catch:{ RuntimeException -> 0x00eb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void sendImageMessage(java.lang.String r7, int r8) {
        /*
            r6 = this;
            java.lang.String r0 = "file://"
            boolean r0 = r7.contains(r0)
            r1 = 1
            if (r0 == 0) goto L_0x0013
            r0 = 2
            java.lang.String r2 = "file:///"
            java.lang.String[] r7 = r7.split(r2, r0)
            r7 = r7[r1]
            goto L_0x002b
        L_0x0013:
            java.lang.String r0 = "content://"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x002b
            android.app.Activity r0 = r6.getActivity()
            android.content.Context r0 = r0.getApplicationContext()
            android.net.Uri r7 = android.net.Uri.parse(r7)
            java.lang.String r7 = org.linphone.LinphoneUtils.getFilePath(r0, r7)
        L_0x002b:
            if (r7 == 0) goto L_0x003b
            java.lang.String r0 = "%20"
            boolean r2 = r7.contains(r0)
            if (r2 == 0) goto L_0x003b
            java.lang.String r2 = "-"
            java.lang.String r7 = r7.replace(r0, r2)
        L_0x003b:
            org.linphone.core.LinphoneCore r0 = org.linphone.LinphoneManager.getLcIfManagerNotDestroyedOrNull()
            r2 = 0
            if (r0 != 0) goto L_0x0044
            r0 = 0
            goto L_0x0048
        L_0x0044:
            boolean r0 = r0.isNetworkReachable()
        L_0x0048:
            boolean r3 = r6.newChatConversation
            if (r3 == 0) goto L_0x0067
            org.linphone.core.LinphoneChatRoom r3 = r6.chatRoom
            if (r3 != 0) goto L_0x0067
            android.widget.EditText r3 = r6.searchContactField
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L_0x0067
            java.lang.String r4 = ""
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0067
            r6.initChatRoom(r3)
        L_0x0067:
            org.linphone.core.LinphoneChatRoom r3 = r6.chatRoom
            if (r3 == 0) goto L_0x00f7
            if (r7 == 0) goto L_0x00f7
            int r3 = r7.length()
            if (r3 <= 0) goto L_0x00f7
            if (r0 == 0) goto L_0x00f7
            r0 = 0
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r7)     // Catch:{ RuntimeException -> 0x00eb }
            if (r3 != 0) goto L_0x00bf
            java.lang.String r4 = "NONE"
            boolean r4 = r7.contains(r4)     // Catch:{ RuntimeException -> 0x00eb }
            if (r4 == 0) goto L_0x00bf
            android.net.Uri r4 = android.net.Uri.parse(r7)     // Catch:{ RuntimeException -> 0x00eb }
            java.lang.String r5 = r4.getAuthority()     // Catch:{ RuntimeException -> 0x00eb }
            if (r5 == 0) goto L_0x00bf
            android.app.Activity r5 = r6.getActivity()     // Catch:{ FileNotFoundException -> 0x00ac, all -> 0x00a9 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ FileNotFoundException -> 0x00ac, all -> 0x00a9 }
            java.io.InputStream r4 = r5.openInputStream(r4)     // Catch:{ FileNotFoundException -> 0x00ac, all -> 0x00a9 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch:{ FileNotFoundException -> 0x00a7 }
            r4.close()     // Catch:{ IOException -> 0x00a2 }
            goto L_0x00bf
        L_0x00a2:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ RuntimeException -> 0x00eb }
            goto L_0x00bf
        L_0x00a7:
            r5 = move-exception
            goto L_0x00ae
        L_0x00a9:
            r7 = move-exception
            r4 = r0
            goto L_0x00b6
        L_0x00ac:
            r5 = move-exception
            r4 = r0
        L_0x00ae:
            r5.printStackTrace()     // Catch:{ all -> 0x00b5 }
            r4.close()     // Catch:{ IOException -> 0x00a2 }
            goto L_0x00bf
        L_0x00b5:
            r7 = move-exception
        L_0x00b6:
            r4.close()     // Catch:{ IOException -> 0x00ba }
            goto L_0x00be
        L_0x00ba:
            r8 = move-exception
            r8.printStackTrace()     // Catch:{ RuntimeException -> 0x00eb }
        L_0x00be:
            throw r7     // Catch:{ RuntimeException -> 0x00eb }
        L_0x00bf:
            if (r3 == 0) goto L_0x00d2
            org.linphone.ChatFragment$FileUploadPrepareTask r4 = new org.linphone.ChatFragment$FileUploadPrepareTask     // Catch:{ RuntimeException -> 0x00eb }
            android.app.Activity r5 = r6.getActivity()     // Catch:{ RuntimeException -> 0x00eb }
            r4.<init>(r5, r7, r8)     // Catch:{ RuntimeException -> 0x00eb }
            android.graphics.Bitmap[] r7 = new android.graphics.Bitmap[r1]     // Catch:{ RuntimeException -> 0x00eb }
            r7[r2] = r3     // Catch:{ RuntimeException -> 0x00eb }
            r4.execute(r7)     // Catch:{ RuntimeException -> 0x00eb }
            goto L_0x00f4
        L_0x00d2:
            java.lang.Object[] r8 = new java.lang.Object[r1]     // Catch:{ RuntimeException -> 0x00eb }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x00eb }
            r3.<init>()     // Catch:{ RuntimeException -> 0x00eb }
            java.lang.String r4 = "Error, bitmap factory can't read "
            r3.append(r4)     // Catch:{ RuntimeException -> 0x00eb }
            r3.append(r7)     // Catch:{ RuntimeException -> 0x00eb }
            java.lang.String r7 = r3.toString()     // Catch:{ RuntimeException -> 0x00eb }
            r8[r2] = r7     // Catch:{ RuntimeException -> 0x00eb }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r8)     // Catch:{ RuntimeException -> 0x00eb }
            goto L_0x00f4
        L_0x00eb:
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r8 = "Error, not enough memory to create the bitmap"
            r7[r2] = r8
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r7)
        L_0x00f4:
            r6.fileSharedUri = r0
            goto L_0x010c
        L_0x00f7:
            if (r0 != 0) goto L_0x010c
            boolean r7 = org.linphone.LinphoneActivity.isInstanciated()
            if (r7 == 0) goto L_0x010c
            org.linphone.LinphoneActivity r7 = org.linphone.LinphoneActivity.instance()
            int r8 = org.linphone.C5321R.string.error_network_unreachable
            java.lang.String r8 = r6.getString(r8)
            r7.displayCustomToast(r8, r1)
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.ChatFragment.sendImageMessage(java.lang.String, int):void");
    }

    private void sendFileSharingMessage(String str, int i) {
        boolean z;
        String obj;
        if (str.contains("file://")) {
            str = str.split("file:///", 2)[1];
        } else if (str.contains("com.android.contacts/contacts/")) {
            str = getCVSPathFromLookupUri(str).toString();
        } else if (str.contains("vcard") || str.contains("vcf")) {
            str = LinphoneUtils.createCvsFromString(LinphoneActivity.instance().getCVSPathFromOtherUri(str).toString()).toString();
        } else if (str.contains("content://")) {
            str = LinphoneUtils.getFilePath(getActivity().getApplicationContext(), Uri.parse(str));
        }
        if (str != null && str.contains("%20")) {
            str = str.replace("%20", "-");
        }
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull == null) {
            z = false;
        } else {
            z = lcIfManagerNotDestroyedOrNull.isNetworkReachable();
        }
        if (this.newChatConversation && this.chatRoom == null && (obj = this.searchContactField.getText().toString()) != null && !obj.equals("")) {
            initChatRoom(obj);
        }
        if (this.chatRoom != null && str != null && str.length() > 0 && z) {
            try {
                File file = new File(str);
                new FileSharingUploadPrepareTask(getActivity(), str, i).execute(new File[]{file});
            } catch (RuntimeException unused) {
                Log.m6903e("Error, not enough memory to create the fileShared");
            }
            this.fileSharedUri = null;
        } else if (!z && LinphoneActivity.isInstanciated()) {
            LinphoneActivity.instance().displayCustomToast(getString(C5321R.string.error_network_unreachable), 1);
        }
    }

    /* access modifiers changed from: private */
    public void askingForLimeCall() {
        final Dialog displayDialog = LinphoneActivity.instance().displayDialog(getString(C5321R.string.lime_not_verified));
        Button button = (Button) displayDialog.findViewById(C5321R.C5324id.delete_button);
        button.setText(getString(C5321R.string.call));
        Button button2 = (Button) displayDialog.findViewById(C5321R.C5324id.cancel);
        button2.setText(getString(C5321R.string.f6326no));
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String lowerCase;
                if (ChatFragment.this.newChatConversation && ChatFragment.this.chatRoom == null && (lowerCase = ChatFragment.this.searchContactField.getText().toString().toLowerCase(Locale.getDefault())) != null && !lowerCase.equals("")) {
                    ChatFragment.this.initChatRoom(lowerCase);
                }
                LinphoneManager.getInstance().newOutgoingCall(ChatFragment.this.chatRoom.getPeerAddress().asStringUriOnly(), ChatFragment.this.chatRoom.getPeerAddress().getDisplayName());
                displayDialog.dismiss();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                displayDialog.dismiss();
            }
        });
        if (LinphoneManager.getLc().getLimeEncryption() == LinphoneCore.LinphoneLimeState.Mandatory) {
            displayDialog.show();
        }
    }

    private LinphoneChatMessage getMessageForId(int i) {
        if (this.adapter == null) {
            return null;
        }
        for (int i2 = 0; i2 < this.adapter.getCount(); i2++) {
            LinphoneChatMessage item = this.adapter.getItem(i2);
            if (item.getStorageId() == i) {
                return item;
            }
        }
        return null;
    }

    private void invalidate() {
        this.adapter.refreshHistory();
        this.chatRoom.markAsRead();
        if (getResources().getBoolean(C5321R.bool.isTablet)) {
            Iterator<ChatUpdatedListener> it = ChatUpdatedListeners.iterator();
            while (it.hasNext()) {
                it.next().onChatUpdated();
            }
        }
    }

    /* access modifiers changed from: private */
    public void resendMessage(LinphoneChatMessage linphoneChatMessage) {
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (linphoneChatMessage != null && linphoneChatMessage.getStatus() == LinphoneChatMessage.State.NotDelivered && lcIfManagerNotDestroyedOrNull.isNetworkReachable()) {
            linphoneChatMessage.reSend();
            invalidate();
        }
    }

    private void resendMessage(int i) {
        LinphoneChatMessage messageForId = getMessageForId(i);
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (messageForId != null && messageForId.getStatus() == LinphoneChatMessage.State.NotDelivered && lcIfManagerNotDestroyedOrNull.isNetworkReachable()) {
            messageForId.reSend();
            invalidate();
        }
    }

    private void copyTextMessageToClipboard(int i) {
        String str;
        LinphoneChatMessage linphoneChatMessage;
        int i2 = 0;
        while (true) {
            str = null;
            if (i2 >= this.adapter.getCount()) {
                linphoneChatMessage = null;
                break;
            }
            linphoneChatMessage = this.adapter.getItem(i2);
            if (linphoneChatMessage.getStorageId() == i) {
                break;
            }
            i2++;
        }
        if (linphoneChatMessage != null) {
            str = linphoneChatMessage.getText();
        }
        if (str != null) {
            ((ClipboardManager) getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Message", str));
            LinphoneActivity.instance().displayCustomToast(getString(C5321R.string.text_copied_to_clipboard), 0);
        }
    }

    /* access modifiers changed from: private */
    public void pickImage() {
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        String string = getString(C5321R.string.temp_photo_name_with_date);
        this.imageToUploadUri = Uri.fromFile(new File(externalStorageDirectory, string.replace("%s", String.valueOf(System.currentTimeMillis()) + ".jpeg")));
        intent.putExtra("output", this.imageToUploadUri);
        arrayList.add(intent);
        Intent intent2 = new Intent();
        intent2.setType("image/*");
        intent2.setAction("android.intent.action.PICK");
        Intent intent3 = new Intent();
        intent3.setType("*/*");
        intent3.setAction("android.intent.action.GET_CONTENT");
        arrayList.add(intent3);
        Intent createChooser = Intent.createChooser(intent2, getString(C5321R.string.image_picker_title));
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        startActivityForResult(createChooser, ADD_PHOTO);
    }

    public String getRealPathFromURI(Uri uri) {
        Cursor loadInBackground = new CursorLoader(getActivity(), uri, new String[]{"_data"}, (String) null, (String[]) null, (String) null).loadInBackground();
        if (loadInBackground == null || !loadInBackground.moveToFirst()) {
            return null;
        }
        String string = loadInBackground.getString(loadInBackground.getColumnIndexOrThrow("_data"));
        loadInBackground.close();
        return string;
    }

    public Uri getCVSPathFromLookupUri(String str) {
        String nameFromFilePath = LinphoneUtils.getNameFromFilePath(str);
        for (LinphoneFriend linphoneFriend : LinphoneManager.getLc().getFriendList()) {
            if (linphoneFriend.getRefKey().toString().equals(nameFromFilePath)) {
                return LinphoneUtils.createCvsFromString(linphoneFriend.getVcardToString());
            }
        }
        return null;
    }

    public Uri getCVSPathFromLookupUri(Uri uri) {
        return getCVSPathFromLookupUri(uri.getPath());
    }

    public void onContactsUpdated() {
        if ((LinphoneActivity.isInstanciated() && LinphoneActivity.instance().getCurrentFragment() == FragmentsAvailable.CHAT && this.fileSharedUri != null) || this.message.getText() != null) {
            initNewChatConversation();
        }
    }

    class FileUploadPrepareTask extends AsyncTask<Bitmap, Void, byte[]> {
        private String path;
        private ProgressDialog progressDialog;

        public FileUploadPrepareTask(Context context, String str, int i) {
            this.path = str;
            this.progressDialog = new ProgressDialog(context);
            this.progressDialog.setIndeterminate(true);
            this.progressDialog.setMessage(ChatFragment.this.getString(C5321R.string.processing_image));
            this.progressDialog.show();
        }

        /* access modifiers changed from: protected */
        public byte[] doInBackground(Bitmap... bitmapArr) {
            Bitmap bitmap;
            Bitmap bitmap2 = bitmapArr[0];
            if (bitmap2.getWidth() < bitmap2.getHeight() || bitmap2.getWidth() <= 2048) {
                bitmap = (bitmap2.getHeight() < bitmap2.getWidth() || bitmap2.getHeight() <= 2048) ? null : Bitmap.createScaledBitmap(bitmap2, (bitmap2.getWidth() * 2048) / bitmap2.getHeight(), 2048, false);
            } else {
                bitmap = Bitmap.createScaledBitmap(bitmap2, 2048, (bitmap2.getHeight() * 2048) / bitmap2.getWidth(), false);
            }
            if (bitmap != null) {
                bitmap2.recycle();
                bitmap2 = bitmap;
            }
            try {
                if (this.path != null) {
                    int attributeInt = new ExifInterface(this.path).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 0);
                    Matrix matrix = new Matrix();
                    if (attributeInt == 6) {
                        matrix.postRotate(90.0f);
                    } else if (attributeInt == 3) {
                        matrix.postRotate(180.0f);
                    } else if (attributeInt == 8) {
                        matrix.postRotate(270.0f);
                    }
                    bitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
                }
            } catch (Exception e) {
                Log.m6903e(e);
            }
            if (bitmap != null) {
                if (bitmap != bitmap2) {
                    bitmap2.recycle();
                    bitmap2 = bitmap;
                } else {
                    bitmap = null;
                }
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            String extensionFromFileName = LinphoneUtils.getExtensionFromFileName(this.path);
            if (extensionFromFileName == null || !extensionFromFileName.toLowerCase(Locale.getDefault()).equals("png")) {
                bitmap2.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            } else {
                bitmap2.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            }
            if (bitmap != null) {
                bitmap.recycle();
            }
            bitmap2.recycle();
            return byteArrayOutputStream.toByteArray();
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(byte[] bArr) {
            ProgressDialog progressDialog2 = this.progressDialog;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                this.progressDialog.dismiss();
            }
            String str = this.path;
            String substring = str.substring(str.lastIndexOf("/") + 1);
            LinphoneContent createLinphoneContent = LinphoneCoreFactory.instance().createLinphoneContent("image", LinphoneUtils.getExtensionFromFileName(substring), bArr, (String) null);
            createLinphoneContent.setName(substring);
            LinphoneChatMessage createFileTransferMessage = ChatFragment.this.chatRoom.createFileTransferMessage(createLinphoneContent);
            createFileTransferMessage.setListener(LinphoneManager.getInstance());
            createFileTransferMessage.setAppData(this.path);
            LinphoneManager.getInstance().setUploadPendingFileMessage(createFileTransferMessage);
            LinphoneManager.getInstance().setUploadingImage(bArr);
            ChatFragment.this.chatRoom.sendChatMessage(createFileTransferMessage);
            ChatFragment.this.adapter.addMessage(createFileTransferMessage);
        }
    }

    class FileSharingUploadPrepareTask extends AsyncTask<File, Void, byte[]> {
        private String path;
        private ProgressDialog progressDialog;

        public FileSharingUploadPrepareTask(Context context, String str, int i) {
            this.path = str;
            this.progressDialog = new ProgressDialog(context);
            this.progressDialog.setIndeterminate(true);
            this.progressDialog.setMessage(ChatFragment.this.getString(C5321R.string.processing_image));
            this.progressDialog.show();
        }

        /* access modifiers changed from: protected */
        public byte[] doInBackground(File... fileArr) {
            File file = fileArr[0];
            byte[] bArr = new byte[((int) file.length())];
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                fileInputStream.read(bArr);
                fileInputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            return bArr;
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(byte[] bArr) {
            ProgressDialog progressDialog2 = this.progressDialog;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                this.progressDialog.dismiss();
            }
            String str = this.path;
            String substring = str.substring(str.lastIndexOf("/") + 1);
            LinphoneContent createLinphoneContent = LinphoneCoreFactory.instance().createLinphoneContent(UriUtil.LOCAL_FILE_SCHEME, LinphoneUtils.getExtensionFromFileName(substring), bArr, (String) null);
            createLinphoneContent.setName(substring);
            LinphoneChatMessage createFileTransferMessage = ChatFragment.this.chatRoom.createFileTransferMessage(createLinphoneContent);
            createFileTransferMessage.setListener(LinphoneManager.getInstance());
            createFileTransferMessage.setAppData(this.path);
            LinphoneManager.getInstance().setUploadPendingFileMessage(createFileTransferMessage);
            LinphoneManager.getInstance().setUploadingImage(bArr);
            ChatFragment.this.chatRoom.sendChatMessage(createFileTransferMessage);
            ChatFragment.this.adapter.addMessage(createFileTransferMessage);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (intent != null) {
            if (i == ADD_PHOTO && i2 == -1) {
                String str = null;
                if (intent == null || intent.getData() == null) {
                    Uri uri = this.imageToUploadUri;
                    if (uri != null) {
                        str = uri.getPath();
                    }
                } else {
                    if (!intent.getData().toString().contains("com.android.contacts/contacts/")) {
                        str = getRealPathFromURI(intent.getData());
                    } else if (getCVSPathFromLookupUri(intent.getData()) != null) {
                        str = getCVSPathFromLookupUri(intent.getData()).toString();
                    } else {
                        LinphoneActivity.instance().displayCustomToast("Something wrong happened", 1);
                        return;
                    }
                    if (str == null) {
                        str = intent.getData().toString();
                    }
                }
                if (LinphoneUtils.isExtensionImage(str).booleanValue()) {
                    sendImageMessage(str, 0);
                } else {
                    sendFileSharingMessage(str, 0);
                }
            } else {
                super.onActivityResult(i, i2, intent);
            }
        } else if (LinphoneUtils.isExtensionImage(this.imageToUploadUri.getPath()).booleanValue()) {
            sendImageMessage(this.imageToUploadUri.getPath(), 0);
        }
    }

    /* access modifiers changed from: private */
    public void exitNewConversationMode(String str) {
        this.sipUri = str;
        this.searchContactField.setVisibility(8);
        this.resultContactsSearch.setVisibility(8);
        this.messagesList.setVisibility(0);
        this.contactName.setVisibility(0);
        this.edit.setVisibility(0);
        this.startCall.setVisibility(0);
        if (getResources().getBoolean(C5321R.bool.isTablet)) {
            this.back.setVisibility(4);
        } else {
            this.back.setOnClickListener(this);
        }
        this.newChatConversation = false;
        initChatRoom(this.sipUri);
        if (this.fileSharedUri != null) {
            onSaveInstanceState(getArguments());
            if (LinphoneUtils.isExtensionImage(this.fileSharedUri).booleanValue()) {
                sendImageMessage(this.fileSharedUri, 0);
            } else {
                sendFileSharingMessage(this.fileSharedUri, 0);
            }
            this.fileSharedUri = null;
        }
    }

    private void initNewChatConversation() {
        this.newChatConversation = true;
        this.chatRoom = null;
        this.messagesList.setVisibility(8);
        this.edit.setVisibility(4);
        this.startCall.setVisibility(4);
        this.contactName.setVisibility(4);
        this.resultContactsSearch.setVisibility(0);
        this.searchAdapter = new SearchContactsListAdapter((List<ContactAddress>) null);
        this.resultContactsSearch.setAdapter(this.searchAdapter);
        this.searchContactField.setVisibility(0);
        this.searchContactField.setText("");
        this.searchContactField.requestFocus();
        this.searchContactField.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                ChatFragment chatFragment = ChatFragment.this;
                chatFragment.searchContacts(chatFragment.searchContactField.getText().toString());
            }
        });
    }

    private class ContactAddress {
        String address;
        LinphoneContact contact;

        private ContactAddress(LinphoneContact linphoneContact, String str) {
            this.contact = linphoneContact;
            this.address = str;
        }
    }

    /* access modifiers changed from: private */
    public void searchContacts(String str) {
        if (str == null || str.length() == 0) {
            this.resultContactsSearch.setAdapter(new SearchContactsListAdapter((List<ContactAddress>) null));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            for (ContactAddress contactAddress : this.searchAdapter.contacts) {
                String str2 = contactAddress.address;
                if (str2.startsWith("sip:")) {
                    str2 = str2.substring(4);
                }
                if ((contactAddress.contact.getFullName() != null && contactAddress.contact.getFullName().toLowerCase(Locale.getDefault()).startsWith(str.toLowerCase(Locale.getDefault()))) || str2.toLowerCase(Locale.getDefault()).startsWith(str.toLowerCase(Locale.getDefault()))) {
                    arrayList.add(contactAddress);
                }
            }
        }
        this.resultContactsSearch.setAdapter(new SearchContactsListAdapter(arrayList));
        this.searchAdapter.notifyDataSetChanged();
    }

    class ChatMessageAdapter extends BaseAdapter {
        Context context;
        ArrayList<LinphoneChatMessage> history = new ArrayList<>();

        public void refreshMessageCell(LinphoneChatMessage linphoneChatMessage) {
        }

        private class ViewHolder implements LinphoneChatMessage.LinphoneChatMessageListener {
            public LinearLayout background;
            public RelativeLayout bubbleLayout;
            public TextView contactName;
            public ImageView contactPicture;
            public ImageView contactPictureMask;
            public CheckBox delete;
            public TextView fileExtensionLabel;
            public TextView fileNameLabel;
            public Button fileTransferAction;
            public RelativeLayout fileTransferLayout;
            public ProgressBar fileTransferProgressBar;

            /* renamed from: id */
            public int f6317id;
            public ImageView imdmIcon;
            public TextView imdmLabel;
            public LinearLayout imdmLayout;
            public ImageView messageImage;
            public ProgressBar messageSendingInProgress;
            public ImageView messageStatus;
            public TextView messageText;

            public void onLinphoneChatMessageFileTransferReceived(LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, LinphoneBuffer linphoneBuffer) {
            }

            public void onLinphoneChatMessageFileTransferSent(LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, int i, int i2, LinphoneBuffer linphoneBuffer) {
            }

            public void onLinphoneChatMessageStateChanged(LinphoneChatMessage linphoneChatMessage, LinphoneChatMessage.State state) {
            }

            public ViewHolder(View view) {
                this.f6317id = view.getId();
                this.bubbleLayout = (RelativeLayout) view.findViewById(C5321R.C5324id.bubble);
                this.delete = (CheckBox) view.findViewById(C5321R.C5324id.delete_message);
                this.background = (LinearLayout) view.findViewById(C5321R.C5324id.background);
                this.contactPicture = (ImageView) view.findViewById(C5321R.C5324id.contact_picture);
                this.contactName = (TextView) view.findViewById(C5321R.C5324id.contact_header);
                this.messageText = (TextView) view.findViewById(C5321R.C5324id.message);
                this.messageImage = (ImageView) view.findViewById(C5321R.C5324id.image);
                this.fileTransferLayout = (RelativeLayout) view.findViewById(C5321R.C5324id.file_transfer_layout);
                this.fileTransferProgressBar = (ProgressBar) view.findViewById(C5321R.C5324id.progress_bar);
                this.fileTransferAction = (Button) view.findViewById(C5321R.C5324id.file_transfer_action);
                this.messageStatus = (ImageView) view.findViewById(C5321R.C5324id.status);
                this.messageSendingInProgress = (ProgressBar) view.findViewById(C5321R.C5324id.inprogress);
                this.contactPictureMask = (ImageView) view.findViewById(C5321R.C5324id.mask);
                this.imdmLayout = (LinearLayout) view.findViewById(C5321R.C5324id.imdmLayout);
                this.imdmIcon = (ImageView) view.findViewById(C5321R.C5324id.imdmIcon);
                this.imdmLabel = (TextView) view.findViewById(C5321R.C5324id.imdmText);
                this.fileExtensionLabel = (TextView) view.findViewById(C5321R.C5324id.file_extension);
                this.fileNameLabel = (TextView) view.findViewById(C5321R.C5324id.file_name);
            }

            public void onLinphoneChatMessageFileTransferProgressChanged(LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, int i, int i2) {
                if (linphoneChatMessage.getStorageId() == this.f6317id) {
                    this.fileTransferProgressBar.setProgress((i * 100) / i2);
                }
            }
        }

        public ChatMessageAdapter(Context context2) {
            this.context = context2;
            refreshHistory();
        }

        public void destroy() {
            ArrayList<LinphoneChatMessage> arrayList = this.history;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public void refreshHistory() {
            if (this.history != null && ChatFragment.this.chatRoom != null) {
                this.history.clear();
                this.history.addAll(Arrays.asList(ChatFragment.this.chatRoom.getHistory()));
                notifyDataSetChanged();
            }
        }

        public void addMessage(LinphoneChatMessage linphoneChatMessage) {
            this.history.add(linphoneChatMessage);
            notifyDataSetChanged();
            ChatFragment.this.messagesList.setSelection(getCount() - 1);
        }

        public int getCount() {
            return this.history.size();
        }

        public LinphoneChatMessage getItem(int i) {
            return this.history.get(i);
        }

        public long getItemId(int i) {
            return (long) this.history.get(i).getStorageId();
        }

        /* JADX WARNING: Removed duplicated region for block: B:104:0x034b  */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x036c  */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x03a4  */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x03da  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x0441  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x044e  */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x0499  */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x04ce  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x00d3  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00e1  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0143  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0177  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x01ae  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x01d4  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x023e  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0245 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0271 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x02db  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x02e1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r18, android.view.View r19, android.view.ViewGroup r20) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                java.util.ArrayList<org.linphone.core.LinphoneChatMessage> r2 = r0.history
                java.lang.Object r2 = r2.get(r1)
                org.linphone.core.LinphoneChatMessage r2 = (org.linphone.core.LinphoneChatMessage) r2
                r3 = 0
                if (r19 == 0) goto L_0x0018
                java.lang.Object r4 = r19.getTag()
                org.linphone.ChatFragment$ChatMessageAdapter$ViewHolder r4 = (org.linphone.ChatFragment.ChatMessageAdapter.ViewHolder) r4
                r5 = r19
                goto L_0x0031
            L_0x0018:
                android.content.Context r4 = r0.context
                android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
                int r5 = org.linphone.C5321R.layout.chat_bubble
                android.view.View r4 = r4.inflate(r5, r3)
                org.linphone.ChatFragment$ChatMessageAdapter$ViewHolder r5 = new org.linphone.ChatFragment$ChatMessageAdapter$ViewHolder
                r5.<init>(r4)
                r4.setTag(r5)
                r16 = r5
                r5 = r4
                r4 = r16
            L_0x0031:
                org.linphone.LinphoneManager.addListener(r4)
                int r6 = r4.f6317id
                int r7 = r2.getStorageId()
                r8 = 1
                r9 = 0
                if (r6 != r7) goto L_0x006f
                android.widget.ImageView r6 = r4.messageImage
                java.lang.Object r6 = r6.getTag()
                if (r6 == 0) goto L_0x0075
                android.widget.ImageView r6 = r4.messageImage
                java.lang.Object r6 = r6.getTag()
                java.lang.String r7 = r2.getAppData()
                boolean r6 = r6.equals(r7)
                if (r6 != 0) goto L_0x006d
                android.widget.ImageView r6 = r4.messageImage
                java.lang.Object r6 = r6.getTag()
                java.lang.String r6 = (java.lang.String) r6
                r7 = 7
                java.lang.String r6 = r6.substring(r7)
                java.lang.String r7 = r2.getAppData()
                boolean r6 = r6.equals(r7)
                if (r6 == 0) goto L_0x0075
            L_0x006d:
                r6 = 1
                goto L_0x0076
            L_0x006f:
                int r6 = r2.getStorageId()
                r4.f6317id = r6
            L_0x0075:
                r6 = 0
            L_0x0076:
                int r7 = r4.f6317id
                r5.setId(r7)
                org.linphone.ChatFragment r7 = org.linphone.ChatFragment.this
                r7.registerForContextMenu(r5)
                org.linphone.ChatFragment$ChatMessageAdapter$1 r7 = new org.linphone.ChatFragment$ChatMessageAdapter$1
                r7.<init>(r2)
                r5.setOnClickListener(r7)
                org.linphone.core.LinphoneChatMessage$State r7 = r2.getStatus()
                java.lang.String r10 = r2.getExternalBodyUrl()
                org.linphone.core.LinphoneContent r11 = r2.getFileTransferInformation()
                android.widget.CheckBox r12 = r4.delete
                r13 = 8
                r12.setVisibility(r13)
                android.widget.TextView r12 = r4.messageText
                r12.setVisibility(r13)
                android.widget.ImageView r12 = r4.messageImage
                r12.setVisibility(r13)
                android.widget.TextView r12 = r4.fileExtensionLabel
                r12.setVisibility(r13)
                android.widget.TextView r12 = r4.fileNameLabel
                r12.setVisibility(r13)
                android.widget.RelativeLayout r12 = r4.fileTransferLayout
                r12.setVisibility(r13)
                android.widget.ProgressBar r12 = r4.fileTransferProgressBar
                r12.setProgress(r9)
                android.widget.Button r12 = r4.fileTransferAction
                r12.setEnabled(r8)
                android.widget.ImageView r12 = r4.messageStatus
                r14 = 4
                r12.setVisibility(r14)
                android.widget.ProgressBar r12 = r4.messageSendingInProgress
                r12.setVisibility(r13)
                org.linphone.core.LinphoneAddress r12 = r2.getFrom()
                java.lang.String r12 = r12.getDisplayName()
                if (r12 != 0) goto L_0x00db
                org.linphone.core.LinphoneAddress r12 = r2.getFrom()
                java.lang.String r12 = r12.getUserName()
            L_0x00db:
                boolean r15 = r2.isOutgoing()
                if (r15 != 0) goto L_0x0143
                org.linphone.ChatFragment r15 = org.linphone.ChatFragment.this
                org.linphone.LinphoneContact r15 = r15.contact
                if (r15 == 0) goto L_0x0135
                org.linphone.ChatFragment r15 = org.linphone.ChatFragment.this
                org.linphone.LinphoneContact r15 = r15.contact
                if (r15 == 0) goto L_0x0107
                org.linphone.ChatFragment r15 = org.linphone.ChatFragment.this
                org.linphone.LinphoneContact r15 = r15.contact
                java.lang.String r15 = r15.getFullName()
                if (r15 == 0) goto L_0x0107
                org.linphone.ChatFragment r12 = org.linphone.ChatFragment.this
                org.linphone.LinphoneContact r12 = r12.contact
                java.lang.String r12 = r12.getFullName()
            L_0x0107:
                org.linphone.ChatFragment r15 = org.linphone.ChatFragment.this
                org.linphone.LinphoneContact r15 = r15.contact
                boolean r15 = r15.hasPhoto()
                if (r15 == 0) goto L_0x0127
                org.linphone.LinphoneActivity r15 = org.linphone.LinphoneActivity.instance()
                android.widget.ImageView r3 = r4.contactPicture
                org.linphone.ChatFragment r8 = org.linphone.ChatFragment.this
                org.linphone.LinphoneContact r8 = r8.contact
                android.net.Uri r8 = r8.getThumbnailUri()
                org.linphone.LinphoneUtils.setThumbnailPictureFromUri(r15, r3, r8)
                goto L_0x0150
            L_0x0127:
                android.widget.ImageView r3 = r4.contactPicture
                org.linphone.ContactsManager r8 = org.linphone.ContactsManager.getInstance()
                android.graphics.Bitmap r8 = r8.getDefaultAvatarBitmap()
                r3.setImageBitmap(r8)
                goto L_0x0150
            L_0x0135:
                android.widget.ImageView r3 = r4.contactPicture
                org.linphone.ContactsManager r8 = org.linphone.ContactsManager.getInstance()
                android.graphics.Bitmap r8 = r8.getDefaultAvatarBitmap()
                r3.setImageBitmap(r8)
                goto L_0x0150
            L_0x0143:
                android.widget.ImageView r3 = r4.contactPicture
                org.linphone.ContactsManager r8 = org.linphone.ContactsManager.getInstance()
                android.graphics.Bitmap r8 = r8.getDefaultAvatarBitmap()
                r3.setImageBitmap(r8)
            L_0x0150:
                android.widget.TextView r3 = r4.contactName
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                android.content.Context r15 = r0.context
                long r13 = r2.getTime()
                java.lang.String r13 = r0.timestampToHumanDate(r15, r13)
                r8.append(r13)
                java.lang.String r13 = " - "
                r8.append(r13)
                r8.append(r12)
                java.lang.String r8 = r8.toString()
                r3.setText(r8)
                org.linphone.core.LinphoneChatMessage$State r3 = org.linphone.core.LinphoneChatMessage.State.InProgress
                if (r7 != r3) goto L_0x017c
                android.widget.ProgressBar r3 = r4.messageSendingInProgress
                r3.setVisibility(r9)
            L_0x017c:
                boolean r3 = r2.isSecured()
                if (r3 != 0) goto L_0x01a4
                boolean r3 = r2.isOutgoing()
                if (r3 != 0) goto L_0x01a4
                org.linphone.core.LinphoneCore r3 = org.linphone.LinphoneManager.getLc()
                org.linphone.core.LinphoneCore$LinphoneLimeState r3 = r3.getLimeEncryption()
                org.linphone.core.LinphoneCore$LinphoneLimeState r8 = org.linphone.core.LinphoneCore.LinphoneLimeState.Mandatory
                if (r3 != r8) goto L_0x01a4
                org.linphone.core.LinphoneChatMessage$State r3 = org.linphone.core.LinphoneChatMessage.State.InProgress
                if (r7 == r3) goto L_0x01a4
                android.widget.ImageView r3 = r4.messageStatus
                r3.setVisibility(r9)
                android.widget.ImageView r3 = r4.messageStatus
                int r8 = org.linphone.C5321R.C5323drawable.chat_unsecure
                r3.setImageResource(r8)
            L_0x01a4:
                org.linphone.core.LinphoneChatMessage$State r3 = org.linphone.core.LinphoneChatMessage.State.DeliveredToUser
                if (r7 != r3) goto L_0x01d4
                boolean r3 = r2.isOutgoing()
                if (r3 == 0) goto L_0x01d4
                android.widget.LinearLayout r3 = r4.imdmLayout
                r3.setVisibility(r9)
                android.widget.ImageView r3 = r4.imdmIcon
                int r8 = org.linphone.C5321R.C5323drawable.chat_delivered
                r3.setImageResource(r8)
                android.widget.TextView r3 = r4.imdmLabel
                int r8 = org.linphone.C5321R.string.delivered
                r3.setText(r8)
                android.widget.TextView r3 = r4.imdmLabel
                org.linphone.ChatFragment r8 = org.linphone.ChatFragment.this
                android.content.res.Resources r8 = r8.getResources()
                int r12 = org.linphone.C5321R.C5322color.colorD
                int r8 = r8.getColor(r12)
                r3.setTextColor(r8)
            L_0x01d2:
                r8 = 4
                goto L_0x0238
            L_0x01d4:
                org.linphone.core.LinphoneChatMessage$State r3 = org.linphone.core.LinphoneChatMessage.State.Displayed
                if (r7 != r3) goto L_0x0203
                boolean r3 = r2.isOutgoing()
                if (r3 == 0) goto L_0x0203
                android.widget.LinearLayout r3 = r4.imdmLayout
                r3.setVisibility(r9)
                android.widget.ImageView r3 = r4.imdmIcon
                int r8 = org.linphone.C5321R.C5323drawable.chat_read
                r3.setImageResource(r8)
                android.widget.TextView r3 = r4.imdmLabel
                int r8 = org.linphone.C5321R.string.displayed
                r3.setText(r8)
                android.widget.TextView r3 = r4.imdmLabel
                org.linphone.ChatFragment r8 = org.linphone.ChatFragment.this
                android.content.res.Resources r8 = r8.getResources()
                int r12 = org.linphone.C5321R.C5322color.colorK
                int r8 = r8.getColor(r12)
                r3.setTextColor(r8)
                goto L_0x01d2
            L_0x0203:
                org.linphone.core.LinphoneChatMessage$State r3 = org.linphone.core.LinphoneChatMessage.State.NotDelivered
                if (r7 != r3) goto L_0x0232
                boolean r3 = r2.isOutgoing()
                if (r3 == 0) goto L_0x0232
                android.widget.LinearLayout r3 = r4.imdmLayout
                r3.setVisibility(r9)
                android.widget.ImageView r3 = r4.imdmIcon
                int r8 = org.linphone.C5321R.C5323drawable.chat_error
                r3.setImageResource(r8)
                android.widget.TextView r3 = r4.imdmLabel
                int r8 = org.linphone.C5321R.string.resend
                r3.setText(r8)
                android.widget.TextView r3 = r4.imdmLabel
                org.linphone.ChatFragment r8 = org.linphone.ChatFragment.this
                android.content.res.Resources r8 = r8.getResources()
                int r12 = org.linphone.C5321R.C5322color.colorI
                int r8 = r8.getColor(r12)
                r3.setTextColor(r8)
                goto L_0x01d2
            L_0x0232:
                android.widget.LinearLayout r3 = r4.imdmLayout
                r8 = 4
                r3.setVisibility(r8)
            L_0x0238:
                boolean r3 = r2.isOutgoing()
                if (r3 != 0) goto L_0x0243
                android.widget.LinearLayout r3 = r4.imdmLayout
                r3.setVisibility(r8)
            L_0x0243:
                if (r10 != 0) goto L_0x0267
                if (r11 == 0) goto L_0x0248
                goto L_0x0267
            L_0x0248:
                java.lang.String r3 = r2.getText()
                if (r3 == 0) goto L_0x0345
                android.text.Spanned r3 = r0.getTextWithHttpLinks(r3)
                android.widget.TextView r6 = r4.messageText
                r6.setText(r3)
                android.widget.TextView r3 = r4.messageText
                android.text.method.MovementMethod r6 = android.text.method.LinkMovementMethod.getInstance()
                r3.setMovementMethod(r6)
                android.widget.TextView r3 = r4.messageText
                r3.setVisibility(r9)
                goto L_0x0345
            L_0x0267:
                java.lang.String r3 = r2.getAppData()
                boolean r8 = r2.isOutgoing()
                if (r8 == 0) goto L_0x02b6
                if (r3 == 0) goto L_0x02b6
                android.widget.ImageView r3 = r4.messageImage
                r3.setVisibility(r9)
                if (r6 != 0) goto L_0x028c
                java.lang.String r3 = r2.getAppData()
                android.widget.ImageView r6 = r4.messageImage
                r0.loadBitmap(r3, r6)
                android.widget.ImageView r3 = r4.messageImage
                java.lang.String r6 = r2.getAppData()
                r3.setTag(r6)
            L_0x028c:
                org.linphone.LinphoneManager r3 = org.linphone.LinphoneManager.getInstance()
                org.linphone.core.LinphoneChatMessage r3 = r3.getMessageUploadPending()
                if (r3 == 0) goto L_0x0345
                org.linphone.LinphoneManager r3 = org.linphone.LinphoneManager.getInstance()
                org.linphone.core.LinphoneChatMessage r3 = r3.getMessageUploadPending()
                int r3 = r3.getStorageId()
                int r6 = r2.getStorageId()
                if (r3 != r6) goto L_0x0345
                android.widget.ProgressBar r3 = r4.messageSendingInProgress
                r6 = 8
                r3.setVisibility(r6)
                android.widget.RelativeLayout r3 = r4.fileTransferLayout
                r3.setVisibility(r9)
                goto L_0x0345
            L_0x02b6:
                if (r3 == 0) goto L_0x02d9
                org.linphone.LinphoneManager r8 = org.linphone.LinphoneManager.getInstance()
                boolean r8 = r8.isMessagePending(r2)
                if (r8 != 0) goto L_0x02d9
                android.content.Context r8 = r0.context
                int r10 = org.linphone.C5321R.string.temp_photo_name_with_date
                java.lang.String r8 = r8.getString(r10)
                java.lang.String r10 = "%s"
                java.lang.String[] r8 = r8.split(r10)
                r8 = r8[r9]
                boolean r8 = r3.contains(r8)
                if (r8 == 0) goto L_0x02d9
                r3 = 0
            L_0x02d9:
                if (r3 != 0) goto L_0x02e1
                android.widget.RelativeLayout r3 = r4.fileTransferLayout
                r3.setVisibility(r9)
                goto L_0x0345
            L_0x02e1:
                org.linphone.core.LinphoneChatMessage$State r8 = org.linphone.core.LinphoneChatMessage.State.NotDelivered
                if (r7 != r8) goto L_0x0315
                boolean r8 = r2.isOutgoing()
                if (r8 == 0) goto L_0x0315
                android.widget.RelativeLayout r3 = r4.fileTransferLayout
                r3.setVisibility(r9)
                android.widget.LinearLayout r3 = r4.imdmLayout
                r3.setVisibility(r9)
                android.widget.ImageView r3 = r4.imdmIcon
                int r6 = org.linphone.C5321R.C5323drawable.chat_error
                r3.setImageResource(r6)
                android.widget.TextView r3 = r4.imdmLabel
                int r6 = org.linphone.C5321R.string.resend
                r3.setText(r6)
                android.widget.TextView r3 = r4.imdmLabel
                org.linphone.ChatFragment r6 = org.linphone.ChatFragment.this
                android.content.res.Resources r6 = r6.getResources()
                int r7 = org.linphone.C5321R.C5322color.colorI
                int r6 = r6.getColor(r7)
                r3.setTextColor(r6)
                goto L_0x0345
            L_0x0315:
                org.linphone.LinphoneManager r8 = org.linphone.LinphoneManager.getInstance()
                boolean r8 = r8.isMessagePending(r2)
                if (r8 == 0) goto L_0x0329
                org.linphone.core.LinphoneChatMessage$State r8 = org.linphone.core.LinphoneChatMessage.State.FileTransferDone
                if (r7 == r8) goto L_0x0329
                android.widget.RelativeLayout r3 = r4.fileTransferLayout
                r3.setVisibility(r9)
                goto L_0x0345
            L_0x0329:
                android.widget.RelativeLayout r7 = r4.fileTransferLayout
                r8 = 8
                r7.setVisibility(r8)
                android.widget.ImageView r7 = r4.messageImage
                r7.setVisibility(r9)
                if (r6 != 0) goto L_0x0345
                android.widget.ImageView r6 = r4.messageImage
                r0.loadBitmap(r3, r6)
                android.widget.ImageView r3 = r4.messageImage
                java.lang.String r6 = r2.getAppData()
                r3.setTag(r6)
            L_0x0345:
                boolean r3 = r2.isOutgoing()
                if (r3 == 0) goto L_0x036c
                android.widget.Button r3 = r4.fileTransferAction
                org.linphone.ChatFragment r6 = org.linphone.ChatFragment.this
                int r7 = org.linphone.C5321R.string.cancel
                java.lang.String r6 = r6.getString(r7)
                r3.setText(r6)
                android.widget.Button r3 = r4.fileTransferAction
                org.linphone.ChatFragment$ChatMessageAdapter$2 r6 = new org.linphone.ChatFragment$ChatMessageAdapter$2
                r6.<init>(r4, r2)
                r3.setOnClickListener(r6)
                org.linphone.ChatFragment r3 = org.linphone.ChatFragment.this
                org.linphone.core.LinphoneChatRoom r3 = r3.chatRoom
                r3.markAsRead()
                goto L_0x0392
            L_0x036c:
                android.widget.LinearLayout r3 = r4.imdmLayout
                r6 = 4
                r3.setVisibility(r6)
                android.widget.Button r3 = r4.fileTransferAction
                org.linphone.ChatFragment r6 = org.linphone.ChatFragment.this
                int r7 = org.linphone.C5321R.string.accept
                java.lang.String r6 = r6.getString(r7)
                r3.setText(r6)
                android.widget.Button r3 = r4.fileTransferAction
                org.linphone.ChatFragment$ChatMessageAdapter$3 r6 = new org.linphone.ChatFragment$ChatMessageAdapter$3
                r6.<init>(r2)
                r3.setOnClickListener(r6)
                org.linphone.ChatFragment r3 = org.linphone.ChatFragment.this
                org.linphone.core.LinphoneChatRoom r3 = r3.chatRoom
                r3.markAsRead()
            L_0x0392:
                android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
                r6 = -2
                r3.<init>(r6, r6)
                boolean r6 = r2.isOutgoing()
                r7 = 11
                r8 = 100
                r10 = 10
                if (r6 == 0) goto L_0x03da
                r3.addRule(r7)
                r3.setMargins(r8, r10, r10, r10)
                android.widget.LinearLayout r6 = r4.background
                int r7 = org.linphone.C5321R.C5323drawable.resizable_chat_bubble_outgoing
                r6.setBackgroundResource(r7)
                android.widget.TextView r6 = r4.contactName
                org.linphone.ChatFragment r7 = org.linphone.ChatFragment.this
                android.app.Activity r7 = r7.getActivity()
                int r8 = org.linphone.C5321R.style.font3
                org.linphone.compatibility.Compatibility.setTextAppearance(r6, r7, r8)
                android.widget.Button r6 = r4.fileTransferAction
                org.linphone.ChatFragment r7 = org.linphone.ChatFragment.this
                android.app.Activity r7 = r7.getActivity()
                int r8 = org.linphone.C5321R.style.font15
                org.linphone.compatibility.Compatibility.setTextAppearance(r6, r7, r8)
                android.widget.Button r6 = r4.fileTransferAction
                int r7 = org.linphone.C5321R.C5323drawable.resizable_confirm_delete_button
                r6.setBackgroundResource(r7)
                android.widget.ImageView r6 = r4.contactPictureMask
                int r7 = org.linphone.C5321R.C5323drawable.avatar_chat_mask_outgoing
                r6.setImageResource(r7)
                goto L_0x0420
            L_0x03da:
                org.linphone.ChatFragment r6 = org.linphone.ChatFragment.this
                boolean r6 = r6.isEditMode
                if (r6 == 0) goto L_0x03e9
                r3.addRule(r7)
                r3.setMargins(r8, r10, r10, r10)
                goto L_0x03f1
            L_0x03e9:
                r6 = 9
                r3.addRule(r6)
                r3.setMargins(r10, r10, r8, r10)
            L_0x03f1:
                android.widget.LinearLayout r6 = r4.background
                int r7 = org.linphone.C5321R.C5323drawable.resizable_chat_bubble_incoming
                r6.setBackgroundResource(r7)
                android.widget.TextView r6 = r4.contactName
                org.linphone.ChatFragment r7 = org.linphone.ChatFragment.this
                android.app.Activity r7 = r7.getActivity()
                int r8 = org.linphone.C5321R.style.font9
                org.linphone.compatibility.Compatibility.setTextAppearance(r6, r7, r8)
                android.widget.Button r6 = r4.fileTransferAction
                org.linphone.ChatFragment r7 = org.linphone.ChatFragment.this
                android.app.Activity r7 = r7.getActivity()
                int r8 = org.linphone.C5321R.style.font8
                org.linphone.compatibility.Compatibility.setTextAppearance(r6, r7, r8)
                android.widget.Button r6 = r4.fileTransferAction
                int r7 = org.linphone.C5321R.C5323drawable.resizable_assistant_button
                r6.setBackgroundResource(r7)
                android.widget.ImageView r6 = r4.contactPictureMask
                int r7 = org.linphone.C5321R.C5323drawable.avatar_chat_mask
                r6.setImageResource(r7)
            L_0x0420:
                android.widget.RelativeLayout r6 = r4.bubbleLayout
                r6.setLayoutParams(r3)
                java.lang.String r3 = r2.getAppData()
                if (r3 == 0) goto L_0x0491
                android.widget.RelativeLayout r3 = r4.fileTransferLayout
                int r3 = r3.getVisibility()
                if (r3 == 0) goto L_0x0491
                java.lang.String r3 = r2.getAppData()
                java.lang.Boolean r3 = org.linphone.LinphoneUtils.isExtensionImage(r3)
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L_0x044e
                android.widget.TextView r2 = r4.fileExtensionLabel
                r3 = 8
                r2.setVisibility(r3)
                android.widget.TextView r2 = r4.fileNameLabel
                r2.setVisibility(r3)
                goto L_0x0491
            L_0x044e:
                java.lang.String r3 = r2.getAppData()
                java.lang.String r3 = org.linphone.LinphoneUtils.getExtensionFromFileName(r3)
                if (r3 == 0) goto L_0x045d
                java.lang.String r3 = r3.toUpperCase()
                goto L_0x045f
            L_0x045d:
                java.lang.String r3 = "FILE"
            L_0x045f:
                int r6 = r3.length()
                r7 = 4
                if (r6 <= r7) goto L_0x046b
                r6 = 3
                java.lang.String r3 = r3.substring(r9, r6)
            L_0x046b:
                android.widget.TextView r6 = r4.fileExtensionLabel
                r6.setText(r3)
                android.widget.TextView r3 = r4.fileExtensionLabel
                r3.setVisibility(r9)
                android.widget.TextView r3 = r4.fileNameLabel
                java.lang.String r2 = r2.getAppData()
                java.lang.String r2 = org.linphone.LinphoneUtils.getNameFromFilePath(r2)
                r3.setText(r2)
                android.widget.TextView r2 = r4.fileNameLabel
                r2.setVisibility(r9)
                android.widget.TextView r2 = r4.fileExtensionLabel
                org.linphone.ChatFragment$ChatMessageAdapter$4 r3 = new org.linphone.ChatFragment$ChatMessageAdapter$4
                r3.<init>(r4)
                r2.setOnClickListener(r3)
            L_0x0491:
                org.linphone.ChatFragment r2 = org.linphone.ChatFragment.this
                boolean r2 = r2.isEditMode
                if (r2 == 0) goto L_0x04c0
                android.widget.CheckBox r2 = r4.delete
                r2.setVisibility(r9)
                android.widget.CheckBox r2 = r4.delete
                org.linphone.ChatFragment$ChatMessageAdapter$5 r3 = new org.linphone.ChatFragment$ChatMessageAdapter$5
                r3.<init>(r1)
                r2.setOnCheckedChangeListener(r3)
                org.linphone.ChatFragment r2 = org.linphone.ChatFragment.this
                android.widget.ListView r2 = r2.messagesList
                boolean r1 = r2.isItemChecked(r1)
                if (r1 == 0) goto L_0x04bb
                android.widget.CheckBox r1 = r4.delete
                r2 = 1
                r1.setChecked(r2)
                goto L_0x04c0
            L_0x04bb:
                android.widget.CheckBox r1 = r4.delete
                r1.setChecked(r9)
            L_0x04c0:
                org.linphone.ChatFragment r1 = org.linphone.ChatFragment.this
                android.content.res.Resources r1 = r1.getResources()
                int r2 = org.linphone.C5321R.bool.isTablet
                boolean r1 = r1.getBoolean(r2)
                if (r1 == 0) goto L_0x04e6
                java.util.ArrayList r1 = org.linphone.ChatFragment.ChatUpdatedListeners
                java.util.Iterator r1 = r1.iterator()
            L_0x04d6:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x04e6
                java.lang.Object r2 = r1.next()
                org.linphone.ChatUpdatedListener r2 = (org.linphone.ChatUpdatedListener) r2
                r2.onChatUpdated()
                goto L_0x04d6
            L_0x04e6:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: org.linphone.ChatFragment.ChatMessageAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        private String timestampToHumanDate(Context context2, long j) {
            SimpleDateFormat simpleDateFormat;
            try {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(j);
                if (isToday(instance)) {
                    simpleDateFormat = new SimpleDateFormat(context2.getResources().getString(C5321R.string.today_date_format));
                } else {
                    simpleDateFormat = new SimpleDateFormat(context2.getResources().getString(C5321R.string.messages_date_format));
                }
                return simpleDateFormat.format(instance.getTime());
            } catch (NumberFormatException unused) {
                return String.valueOf(j);
            }
        }

        private boolean isToday(Calendar calendar) {
            return isSameDay(calendar, Calendar.getInstance());
        }

        private boolean isSameDay(Calendar calendar, Calendar calendar2) {
            if (calendar != null && calendar2 != null && calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
                return true;
            }
            return false;
        }

        private Spanned getTextWithHttpLinks(String str) {
            if (str.contains("<")) {
                str = str.replace("<", "&lt;");
            }
            if (str.contains(">")) {
                str = str.replace(">", "&gt;");
            }
            if (str.contains("\n")) {
                str = str.replace("\n", "<br>");
            }
            if (str.contains("http://")) {
                int indexOf = str.indexOf("http://");
                String substring = str.substring(indexOf, str.indexOf(" ", indexOf) == -1 ? str.length() : str.indexOf(" ", indexOf));
                String replace = substring.replace("http://", "");
                String quote = Pattern.quote(substring);
                str = str.replaceFirst(quote, "<a href=\"" + substring + "\">" + replace + "</a>");
            }
            if (str.contains("https://")) {
                int indexOf2 = str.indexOf("https://");
                String substring2 = str.substring(indexOf2, str.indexOf(" ", indexOf2) == -1 ? str.length() : str.indexOf(" ", indexOf2));
                String replace2 = substring2.replace("https://", "");
                String quote2 = Pattern.quote(substring2);
                str = str.replaceFirst(quote2, "<a href=\"" + substring2 + "\">" + replace2 + "</a>");
            }
            return Compatibility.fromHtml(str);
        }

        public void loadBitmap(String str, ImageView imageView) {
            if (cancelPotentialWork(str, imageView)) {
                if (LinphoneUtils.isExtensionImage(str).booleanValue()) {
                    ChatFragment chatFragment = ChatFragment.this;
                    Bitmap unused = chatFragment.defaultBitmap = BitmapFactory.decodeResource(chatFragment.getActivity().getResources(), C5321R.C5323drawable.chat_attachment_over);
                } else {
                    ChatFragment chatFragment2 = ChatFragment.this;
                    Bitmap unused2 = chatFragment2.defaultBitmap = BitmapFactory.decodeResource(chatFragment2.getActivity().getResources(), C5321R.C5323drawable.chat_attachment);
                }
                BitmapWorkerTask bitmapWorkerTask = new BitmapWorkerTask(imageView);
                imageView.setImageDrawable(new AsyncBitmap(this.context.getResources(), ChatFragment.this.defaultBitmap, bitmapWorkerTask));
                bitmapWorkerTask.execute(new String[]{str});
            }
        }

        private class BitmapWorkerTask extends AsyncTask<String, Void, Bitmap> {
            private final WeakReference<ImageView> imageViewReference;
            public String path = null;

            public BitmapWorkerTask(ImageView imageView) {
                this.imageViewReference = new WeakReference<>(imageView);
            }

            /* access modifiers changed from: protected */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x005e A[Catch:{ Exception -> 0x008d }] */
            /* JADX WARNING: Removed duplicated region for block: B:16:0x0064 A[Catch:{ Exception -> 0x008d }] */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x0088 A[Catch:{ Exception -> 0x008d }] */
            /* JADX WARNING: Removed duplicated region for block: B:29:0x0097  */
            /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.graphics.Bitmap doInBackground(java.lang.String... r11) {
                /*
                    r10 = this;
                    r0 = 0
                    r11 = r11[r0]
                    r10.path = r11
                    java.lang.String r11 = r10.path
                    java.lang.Boolean r11 = org.linphone.LinphoneUtils.isExtensionImage(r11)
                    boolean r11 = r11.booleanValue()
                    if (r11 == 0) goto L_0x00a1
                    java.lang.String r11 = r10.path
                    java.lang.String r1 = "content"
                    boolean r11 = r11.startsWith(r1)
                    r1 = 0
                    r2 = 1
                    if (r11 == 0) goto L_0x0043
                    org.linphone.ChatFragment$ChatMessageAdapter r11 = org.linphone.ChatFragment.ChatMessageAdapter.this     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0030 }
                    android.content.Context r11 = r11.context     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0030 }
                    android.content.ContentResolver r11 = r11.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0030 }
                    java.lang.String r3 = r10.path     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0030 }
                    android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0030 }
                    android.graphics.Bitmap r11 = android.provider.MediaStore.Images.Media.getBitmap(r11, r3)     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0030 }
                    goto L_0x0049
                L_0x0030:
                    r11 = move-exception
                    java.lang.Object[] r3 = new java.lang.Object[r2]
                    r3[r0] = r11
                    org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r3)
                    goto L_0x0041
                L_0x0039:
                    r11 = move-exception
                    java.lang.Object[] r3 = new java.lang.Object[r2]
                    r3[r0] = r11
                    org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r3)
                L_0x0041:
                    r11 = r1
                    goto L_0x0049
                L_0x0043:
                    java.lang.String r11 = r10.path
                    android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeFile(r11)
                L_0x0049:
                    android.media.ExifInterface r3 = new android.media.ExifInterface     // Catch:{ Exception -> 0x008d }
                    java.lang.String r4 = r10.path     // Catch:{ Exception -> 0x008d }
                    r3.<init>(r4)     // Catch:{ Exception -> 0x008d }
                    java.lang.String r4 = "Orientation"
                    int r3 = r3.getAttributeInt(r4, r0)     // Catch:{ Exception -> 0x008d }
                    android.graphics.Matrix r8 = new android.graphics.Matrix     // Catch:{ Exception -> 0x008d }
                    r8.<init>()     // Catch:{ Exception -> 0x008d }
                    r4 = 6
                    if (r3 != r4) goto L_0x0064
                    r3 = 1119092736(0x42b40000, float:90.0)
                    r8.postRotate(r3)     // Catch:{ Exception -> 0x008d }
                    goto L_0x0076
                L_0x0064:
                    r4 = 3
                    if (r3 != r4) goto L_0x006d
                    r3 = 1127481344(0x43340000, float:180.0)
                    r8.postRotate(r3)     // Catch:{ Exception -> 0x008d }
                    goto L_0x0076
                L_0x006d:
                    r4 = 8
                    if (r3 != r4) goto L_0x0076
                    r3 = 1132920832(0x43870000, float:270.0)
                    r8.postRotate(r3)     // Catch:{ Exception -> 0x008d }
                L_0x0076:
                    r4 = 0
                    r5 = 0
                    int r6 = r11.getWidth()     // Catch:{ Exception -> 0x008d }
                    int r7 = r11.getHeight()     // Catch:{ Exception -> 0x008d }
                    r9 = 1
                    r3 = r11
                    android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x008d }
                    if (r3 == r11) goto L_0x0095
                    r11.recycle()     // Catch:{ Exception -> 0x008d }
                    r11 = r3
                    goto L_0x0095
                L_0x008d:
                    r3 = move-exception
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r2[r0] = r3
                    org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r2)
                L_0x0095:
                    if (r11 == 0) goto L_0x00a0
                    r0 = 500(0x1f4, float:7.0E-43)
                    android.graphics.Bitmap r1 = android.media.ThumbnailUtils.extractThumbnail(r11, r0, r0)
                    r11.recycle()
                L_0x00a0:
                    return r1
                L_0x00a1:
                    org.linphone.ChatFragment$ChatMessageAdapter r11 = org.linphone.ChatFragment.ChatMessageAdapter.this
                    org.linphone.ChatFragment r11 = org.linphone.ChatFragment.this
                    android.graphics.Bitmap r11 = r11.defaultBitmap
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: org.linphone.ChatFragment.ChatMessageAdapter.BitmapWorkerTask.doInBackground(java.lang.String[]):android.graphics.Bitmap");
            }

            /* access modifiers changed from: protected */
            public void onPostExecute(Bitmap bitmap) {
                if (isCancelled()) {
                    bitmap = null;
                }
                WeakReference<ImageView> weakReference = this.imageViewReference;
                if (weakReference != null && bitmap != null) {
                    ImageView imageView = (ImageView) weakReference.get();
                    if (this == ChatMessageAdapter.this.getBitmapWorkerTask(imageView) && imageView != null) {
                        imageView.setImageBitmap(bitmap);
                        if (ChatFragment.this.messagesList.getLastVisiblePosition() >= ChatMessageAdapter.this.getCount() - 1 && ChatFragment.this.messagesList.getFirstVisiblePosition() <= ChatMessageAdapter.this.getCount() - 1) {
                            ChatFragment.this.messagesList.setSelection(ChatMessageAdapter.this.getCount() - 1);
                        }
                        imageView.setTag(this.path);
                        imageView.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View view) {
                                Uri uri;
                                Intent intent = new Intent("android.intent.action.VIEW");
                                String str = (String) view.getTag();
                                String str2 = null;
                                if (str.startsWith("file://")) {
                                    uri = FileProvider.getUriForFile(ChatFragment.this.getActivity(), "org.linphone.provider", new File(str.substring(7)));
                                } else if (str.startsWith("content://")) {
                                    uri = Uri.parse(str);
                                } else {
                                    try {
                                        uri = FileProvider.getUriForFile(ChatFragment.this.getActivity(), "org.linphone.provider", new File(str));
                                    } catch (IllegalArgumentException e) {
                                        Log.m6903e("Something wrong happend : " + e);
                                        uri = null;
                                    }
                                }
                                if (uri != null) {
                                    String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
                                    if (fileExtensionFromUrl != null) {
                                        str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                                    }
                                    if (str2 != null) {
                                        intent.setDataAndType(uri, str2);
                                    } else {
                                        intent.setDataAndType(uri, "*/*");
                                    }
                                    intent.addFlags(1);
                                    ChatMessageAdapter.this.context.startActivity(intent);
                                    return;
                                }
                                LinphoneActivity.instance().displayCustomToast(ChatFragment.this.getString(C5321R.string.error_opening_file), 1);
                            }
                        });
                    }
                }
            }
        }

        class AsyncBitmap extends BitmapDrawable {
            private final WeakReference<BitmapWorkerTask> bitmapWorkerTaskReference;

            public AsyncBitmap(Resources resources, Bitmap bitmap, BitmapWorkerTask bitmapWorkerTask) {
                super(resources, bitmap);
                this.bitmapWorkerTaskReference = new WeakReference<>(bitmapWorkerTask);
            }

            public BitmapWorkerTask getBitmapWorkerTask() {
                return (BitmapWorkerTask) this.bitmapWorkerTaskReference.get();
            }
        }

        private boolean cancelPotentialWork(String str, ImageView imageView) {
            BitmapWorkerTask bitmapWorkerTask = getBitmapWorkerTask(imageView);
            if (bitmapWorkerTask != null) {
                String str2 = bitmapWorkerTask.path;
                if (str2 != null && str2 == str) {
                    return false;
                }
                bitmapWorkerTask.cancel(true);
            }
            return true;
        }

        /* access modifiers changed from: private */
        public BitmapWorkerTask getBitmapWorkerTask(ImageView imageView) {
            if (imageView == null) {
                return null;
            }
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof AsyncBitmap) {
                return ((AsyncBitmap) drawable).getBitmapWorkerTask();
            }
            return null;
        }
    }

    class SearchContactsListAdapter extends BaseAdapter {
        /* access modifiers changed from: private */
        public List<ContactAddress> contacts;
        private LayoutInflater mInflater;

        public long getItemId(int i) {
            return (long) i;
        }

        private class ViewHolder {
            public TextView address;
            public TextView name;

            public ViewHolder(View view) {
                this.name = (TextView) view.findViewById(C5321R.C5324id.contact_name);
                this.address = (TextView) view.findViewById(C5321R.C5324id.contact_address);
            }
        }

        SearchContactsListAdapter(List<ContactAddress> list) {
            this.mInflater = ChatFragment.this.inflater;
            if (list == null) {
                this.contacts = getContactsList();
            } else {
                this.contacts = list;
            }
        }

        public List<ContactAddress> getContactsList() {
            ArrayList arrayList = new ArrayList();
            if (ContactsManager.getInstance().hasContacts()) {
                for (LinphoneContact next : ContactsManager.getInstance().getContacts()) {
                    for (LinphoneNumberOrAddress value : next.getNumbersOrAddresses()) {
                        String value2 = value.getValue();
                        if (value2.startsWith("sip:") && !value2.contains("@")) {
                            value2 = LinphoneUtils.getFullAddressFromUsername(value2.substring(4));
                        }
                        arrayList.add(new ContactAddress(next, value2));
                    }
                }
            }
            return arrayList;
        }

        public int getCount() {
            return this.contacts.size();
        }

        public ContactAddress getItem(int i) {
            List<ContactAddress> list = this.contacts;
            if (list != null && i < list.size()) {
                return this.contacts.get(i);
            }
            this.contacts = getContactsList();
            return this.contacts.get(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            ContactAddress item;
            ViewHolder viewHolder;
            do {
                item = getItem(i);
            } while (item == null);
            if (view != null) {
                viewHolder = (ViewHolder) view.getTag();
            } else {
                view = this.mInflater.inflate(C5321R.layout.search_contact_cell, viewGroup, false);
                viewHolder = new ViewHolder(view);
                view.setTag(viewHolder);
            }
            final String str = item.address;
            viewHolder.name.setText(item.contact.getFullName());
            viewHolder.address.setText(str);
            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ChatFragment.this.exitNewConversationMode(str);
                }
            });
            return view;
        }
    }

    public void onLinphoneChatMessageStateChanged(LinphoneChatMessage linphoneChatMessage, LinphoneChatMessage.State state) {
        redrawMessageList();
    }
}
