package org.linphone;

import android.app.Dialog;
import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import java.util.List;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneChatMessage;
import org.linphone.core.LinphoneChatRoom;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.LinphoneCoreFactory;
import org.linphone.core.LinphoneCoreListenerBase;
import org.linphone.mediastream.Log;

public class ChatListFragment extends Fragment implements View.OnClickListener, AdapterView.OnItemClickListener, ContactsUpdatedListener, ChatUpdatedListener {
    private ImageView backInCall;
    private ImageView cancel;
    /* access modifiers changed from: private */
    public ListView chatList;
    private ImageView delete;
    /* access modifiers changed from: private */
    public ImageView deselectAll;
    private ImageView edit;
    private LinearLayout editList;
    /* access modifiers changed from: private */
    public boolean isEditMode = false;
    /* access modifiers changed from: private */
    public List<String> mConversations;
    /* access modifiers changed from: private */
    public LayoutInflater mInflater;
    private LinphoneCoreListenerBase mListener;
    private ImageView newDiscussion;
    private TextView noChatHistory;
    /* access modifiers changed from: private */
    public ImageView selectAll;
    private LinearLayout topbar;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mInflater = layoutInflater;
        View inflate = layoutInflater.inflate(C5321R.layout.chatlist, viewGroup, false);
        this.chatList = (ListView) inflate.findViewById(C5321R.C5324id.chatList);
        this.chatList.setOnItemClickListener(this);
        registerForContextMenu(this.chatList);
        this.noChatHistory = (TextView) inflate.findViewById(C5321R.C5324id.noChatHistory);
        this.editList = (LinearLayout) inflate.findViewById(C5321R.C5324id.edit_list);
        this.topbar = (LinearLayout) inflate.findViewById(C5321R.C5324id.top_bar);
        this.cancel = (ImageView) inflate.findViewById(C5321R.C5324id.cancel);
        this.cancel.setOnClickListener(this);
        this.edit = (ImageView) inflate.findViewById(C5321R.C5324id.edit);
        this.edit.setOnClickListener(this);
        this.newDiscussion = (ImageView) inflate.findViewById(C5321R.C5324id.new_discussion);
        this.newDiscussion.setOnClickListener(this);
        this.selectAll = (ImageView) inflate.findViewById(C5321R.C5324id.select_all);
        this.selectAll.setOnClickListener(this);
        this.deselectAll = (ImageView) inflate.findViewById(C5321R.C5324id.deselect_all);
        this.deselectAll.setOnClickListener(this);
        this.backInCall = (ImageView) inflate.findViewById(C5321R.C5324id.back_in_call);
        this.backInCall.setOnClickListener(this);
        this.delete = (ImageView) inflate.findViewById(C5321R.C5324id.delete);
        this.delete.setOnClickListener(this);
        this.mListener = new LinphoneCoreListenerBase() {
            public void messageReceived(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom, LinphoneChatMessage linphoneChatMessage) {
                ChatListFragment.this.refresh();
            }
        };
        ChatFragment.createIfNotExist();
        ChatFragment.addChatListener(this);
        return inflate;
    }

    private void selectAllList(boolean z) {
        int count = this.chatList.getAdapter().getCount();
        for (int i = 0; i < count; i++) {
            this.chatList.setItemChecked(i, z);
        }
    }

    /* access modifiers changed from: private */
    public void removeChatsConversation() {
        String obj;
        LinphoneChatRoom orCreateChatRoom;
        int count = this.chatList.getAdapter().getCount();
        for (int i = 0; i < count; i++) {
            if (!(!this.chatList.isItemChecked(i) || (obj = this.chatList.getAdapter().getItem(i).toString()) == null || (orCreateChatRoom = LinphoneManager.getLc().getOrCreateChatRoom(obj)) == null)) {
                orCreateChatRoom.deleteHistory();
            }
        }
        quitEditMode();
        LinphoneActivity.instance().updateMissedChatCount();
    }

    public void quitEditMode() {
        this.isEditMode = false;
        this.editList.setVisibility(8);
        this.topbar.setVisibility(0);
        refresh();
        if (getResources().getBoolean(C5321R.bool.isTablet)) {
            displayFirstChat();
        }
    }

    public int getNbItemsChecked() {
        int count = this.chatList.getAdapter().getCount();
        int i = 0;
        for (int i2 = 0; i2 < count; i2++) {
            if (this.chatList.isItemChecked(i2)) {
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

    private void hideAndDisplayMessageIfNoChat() {
        if (this.mConversations.size() == 0) {
            this.noChatHistory.setVisibility(0);
            this.chatList.setVisibility(8);
            this.edit.setEnabled(false);
            return;
        }
        this.noChatHistory.setVisibility(8);
        this.chatList.setVisibility(0);
        this.chatList.setChoiceMode(2);
        this.chatList.setAdapter(new ChatListAdapter());
        this.edit.setEnabled(true);
    }

    public void refresh() {
        this.mConversations = LinphoneActivity.instance().getChatList();
        hideAndDisplayMessageIfNoChat();
    }

    public void displayFirstChat() {
        List<String> list = this.mConversations;
        if (list == null || list.size() <= 0) {
            LinphoneActivity.instance().displayEmptyFragment();
        } else {
            LinphoneActivity.instance().displayChat(this.mConversations.get(0), (String) null, (String) null);
        }
    }

    public void onResume() {
        super.onResume();
        ContactsManager.addContactsListener(this);
        if (LinphoneManager.getLc().getCallsNb() > 0) {
            this.backInCall.setVisibility(0);
        } else {
            this.backInCall.setVisibility(4);
        }
        if (LinphoneActivity.isInstanciated()) {
            LinphoneActivity.instance().selectMenu(FragmentsAvailable.CHAT_LIST);
            LinphoneActivity.instance().hideTabBar(false);
        }
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.addListener(this.mListener);
        }
        refresh();
    }

    public void onPause() {
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.removeListener(this.mListener);
        }
        ContactsManager.removeContactsListener(this);
        super.onPause();
    }

    public void onContactsUpdated() {
        ChatListAdapter chatListAdapter;
        if (LinphoneActivity.isInstanciated() && LinphoneActivity.instance().getCurrentFragment() == FragmentsAvailable.CHAT_LIST && (chatListAdapter = (ChatListAdapter) this.chatList.getAdapter()) != null) {
            chatListAdapter.notifyDataSetChanged();
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, view.getId(), 0, getString(C5321R.string.delete));
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo();
        if (adapterContextMenuInfo == null || adapterContextMenuInfo.targetView == null) {
            return false;
        }
        LinphoneActivity.instance().removeFromChatList(this.chatList.getAdapter().getItem(adapterContextMenuInfo.position).toString());
        this.mConversations = LinphoneActivity.instance().getChatList();
        if (getResources().getBoolean(C5321R.bool.isTablet)) {
            quitEditMode();
        }
        hideAndDisplayMessageIfNoChat();
        return true;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C5321R.C5324id.back_in_call) {
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
                    ChatListFragment.this.removeChatsConversation();
                    displayDialog.dismiss();
                    ChatListFragment.this.quitEditMode();
                }
            });
            ((Button) displayDialog.findViewById(C5321R.C5324id.cancel)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    displayDialog.dismiss();
                    ChatListFragment.this.quitEditMode();
                }
            });
            displayDialog.show();
        } else if (id == C5321R.C5324id.edit) {
            this.topbar.setVisibility(8);
            this.editList.setVisibility(0);
            this.isEditMode = true;
            hideAndDisplayMessageIfNoChat();
            enabledDeleteButton(false);
        } else if (id == C5321R.C5324id.new_discussion) {
            LinphoneActivity.instance().displayChat((String) null, (String) null, (String) null);
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String obj = this.chatList.getAdapter().getItem(i).toString();
        if (LinphoneActivity.isInstanciated() && !this.isEditMode) {
            LinphoneActivity.instance().displayChat(obj, (String) null, (String) null);
        }
    }

    public void onChatUpdated() {
        refresh();
    }

    class ChatListAdapter extends BaseAdapter {
        public long getItemId(int i) {
            return (long) i;
        }

        private class ViewHolder {
            public ImageView contactPicture;
            public TextView date;
            public TextView displayName;
            public TextView lastMessageView;
            public CheckBox select;
            public TextView unreadMessages;

            public ViewHolder(View view) {
                this.lastMessageView = (TextView) view.findViewById(C5321R.C5324id.lastMessage);
                this.date = (TextView) view.findViewById(C5321R.C5324id.date);
                this.displayName = (TextView) view.findViewById(C5321R.C5324id.sipUri);
                this.unreadMessages = (TextView) view.findViewById(C5321R.C5324id.unreadMessages);
                this.select = (CheckBox) view.findViewById(C5321R.C5324id.delete_chatroom);
                this.contactPicture = (ImageView) view.findViewById(C5321R.C5324id.contact_picture);
            }
        }

        ChatListAdapter() {
        }

        public int getCount() {
            return ChatListFragment.this.mConversations.size();
        }

        public Object getItem(int i) {
            return ChatListFragment.this.mConversations.get(i);
        }

        public View getView(final int i, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder;
            String str = (String) ChatListFragment.this.mConversations.get(i);
            if (view != null) {
                viewHolder = (ViewHolder) view.getTag();
            } else {
                view = ChatListFragment.this.mInflater.inflate(C5321R.layout.chatlist_cell, viewGroup, false);
                viewHolder = new ViewHolder(view);
                view.setTag(viewHolder);
            }
            try {
                LinphoneAddress createLinphoneAddress = LinphoneCoreFactory.instance().createLinphoneAddress(str);
                LinphoneContact findContactFromAddress = ContactsManager.getInstance().findContactFromAddress(createLinphoneAddress);
                LinphoneChatRoom chatRoom = LinphoneManager.getLc().getChatRoom(createLinphoneAddress);
                int unreadMessagesCount = chatRoom.getUnreadMessagesCount();
                LinphoneChatMessage linphoneChatMessage = chatRoom.getHistory(1)[0];
                if (linphoneChatMessage.getFileTransferInformation() != null || linphoneChatMessage.getExternalBodyUrl() != null || linphoneChatMessage.getAppData() != null) {
                    viewHolder.lastMessageView.setBackgroundResource(C5321R.C5323drawable.chat_file_message);
                    viewHolder.date.setText(LinphoneUtils.timestampToHumanDate(ChatListFragment.this.getActivity(), Long.valueOf(linphoneChatMessage.getTime()).longValue(), ChatListFragment.this.getString(C5321R.string.messages_list_date_format)));
                    viewHolder.lastMessageView.setText("");
                } else if (linphoneChatMessage.getText() != null && linphoneChatMessage.getText().length() > 0) {
                    String text = linphoneChatMessage.getText();
                    viewHolder.lastMessageView.setBackgroundResource(0);
                    viewHolder.date.setText(LinphoneUtils.timestampToHumanDate(ChatListFragment.this.getActivity(), Long.valueOf(linphoneChatMessage.getTime()).longValue(), ChatListFragment.this.getString(C5321R.string.messages_list_date_format)));
                    viewHolder.lastMessageView.setText(text);
                }
                viewHolder.displayName.setSelected(true);
                viewHolder.displayName.setText(findContactFromAddress == null ? LinphoneUtils.getAddressDisplayName(createLinphoneAddress) : findContactFromAddress.getFullName());
                if (findContactFromAddress != null) {
                    LinphoneUtils.setThumbnailPictureFromUri(LinphoneActivity.instance(), viewHolder.contactPicture, findContactFromAddress.getThumbnailUri());
                } else {
                    viewHolder.contactPicture.setImageBitmap(ContactsManager.getInstance().getDefaultAvatarBitmap());
                }
                if (unreadMessagesCount > 0) {
                    viewHolder.unreadMessages.setVisibility(0);
                    viewHolder.unreadMessages.setText(String.valueOf(unreadMessagesCount));
                    if (unreadMessagesCount > 99) {
                        viewHolder.unreadMessages.setTextSize(12.0f);
                    }
                    viewHolder.displayName.setTypeface((Typeface) null, 1);
                } else {
                    viewHolder.unreadMessages.setVisibility(8);
                    viewHolder.displayName.setTypeface((Typeface) null, 0);
                }
                if (ChatListFragment.this.isEditMode) {
                    viewHolder.unreadMessages.setVisibility(8);
                    viewHolder.select.setVisibility(0);
                    viewHolder.select.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                            ChatListFragment.this.chatList.setItemChecked(i, z);
                            if (ChatListFragment.this.getNbItemsChecked() == ChatListAdapter.this.getCount()) {
                                ChatListFragment.this.deselectAll.setVisibility(0);
                                ChatListFragment.this.selectAll.setVisibility(8);
                                ChatListFragment.this.enabledDeleteButton(true);
                            } else if (ChatListFragment.this.getNbItemsChecked() == 0) {
                                ChatListFragment.this.deselectAll.setVisibility(8);
                                ChatListFragment.this.selectAll.setVisibility(0);
                                ChatListFragment.this.enabledDeleteButton(false);
                            } else {
                                ChatListFragment.this.deselectAll.setVisibility(8);
                                ChatListFragment.this.selectAll.setVisibility(0);
                                ChatListFragment.this.enabledDeleteButton(true);
                            }
                        }
                    });
                    if (ChatListFragment.this.chatList.isItemChecked(i)) {
                        viewHolder.select.setChecked(true);
                    } else {
                        viewHolder.select.setChecked(false);
                    }
                } else if (unreadMessagesCount > 0) {
                    viewHolder.unreadMessages.setVisibility(0);
                }
                return view;
            } catch (LinphoneCoreException e) {
                Log.m6903e("Chat view cannot parse address", e);
                return view;
            }
        }
    }
}
