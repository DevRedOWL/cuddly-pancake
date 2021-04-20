package org.linphone;

import android.app.Dialog;
import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
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
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import org.linphone.core.CallDirection;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneCallLog;

public class HistoryListFragment extends Fragment implements View.OnClickListener, AdapterView.OnItemClickListener, ContactsUpdatedListener {
    private ImageView allCalls;
    private View allCallsSelected;
    private ImageView cancel;
    private ImageView delete;
    /* access modifiers changed from: private */
    public ImageView deselectAll;
    private ImageView edit;
    private LinearLayout editList;
    /* access modifiers changed from: private */
    public ListView historyList;
    /* access modifiers changed from: private */
    public boolean isEditMode;
    /* access modifiers changed from: private */
    public LayoutInflater mInflater;
    /* access modifiers changed from: private */
    public List<LinphoneCallLog> mLogs;
    private ImageView missedCalls;
    private View missedCallsSelected;
    private TextView noCallHistory;
    private TextView noMissedCallHistory;
    private boolean onlyDisplayMissedCalls;
    /* access modifiers changed from: private */
    public ImageView selectAll;
    private LinearLayout topBar;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mInflater = layoutInflater;
        View inflate = layoutInflater.inflate(C5321R.layout.history, viewGroup, false);
        this.noCallHistory = (TextView) inflate.findViewById(C5321R.C5324id.no_call_history);
        this.noMissedCallHistory = (TextView) inflate.findViewById(C5321R.C5324id.no_missed_call_history);
        this.historyList = (ListView) inflate.findViewById(C5321R.C5324id.history_list);
        this.historyList.setOnItemClickListener(this);
        this.delete = (ImageView) inflate.findViewById(C5321R.C5324id.delete);
        this.delete.setOnClickListener(this);
        this.editList = (LinearLayout) inflate.findViewById(C5321R.C5324id.edit_list);
        this.topBar = (LinearLayout) inflate.findViewById(C5321R.C5324id.top_bar);
        this.cancel = (ImageView) inflate.findViewById(C5321R.C5324id.cancel);
        this.cancel.setOnClickListener(this);
        this.allCalls = (ImageView) inflate.findViewById(C5321R.C5324id.all_calls);
        this.allCalls.setOnClickListener(this);
        this.allCallsSelected = inflate.findViewById(C5321R.C5324id.all_calls_select);
        this.missedCalls = (ImageView) inflate.findViewById(C5321R.C5324id.missed_calls);
        this.missedCalls.setOnClickListener(this);
        this.missedCallsSelected = inflate.findViewById(C5321R.C5324id.missed_calls_select);
        this.selectAll = (ImageView) inflate.findViewById(C5321R.C5324id.select_all);
        this.selectAll.setOnClickListener(this);
        this.deselectAll = (ImageView) inflate.findViewById(C5321R.C5324id.deselect_all);
        this.deselectAll.setOnClickListener(this);
        this.allCalls.setEnabled(false);
        this.onlyDisplayMissedCalls = false;
        this.edit = (ImageView) inflate.findViewById(C5321R.C5324id.edit);
        this.edit.setOnClickListener(this);
        return inflate;
    }

    public void refresh() {
        this.mLogs = Arrays.asList(LinphoneManager.getLc().getCallLogs());
    }

    private void selectAllList(boolean z) {
        int count = this.historyList.getAdapter().getCount();
        for (int i = 0; i < count; i++) {
            this.historyList.setItemChecked(i, z);
        }
    }

    public void displayFirstLog() {
        List<LinphoneCallLog> list = this.mLogs;
        if (list == null || list.size() <= 0) {
            LinphoneActivity.instance().displayEmptyFragment();
        } else if (this.mLogs.get(0).getDirection() == CallDirection.Incoming) {
            LinphoneActivity.instance().displayHistoryDetail(this.mLogs.get(0).getFrom().toString(), this.mLogs.get(0));
        } else {
            LinphoneActivity.instance().displayHistoryDetail(this.mLogs.get(0).getTo().toString(), this.mLogs.get(0));
        }
    }

    /* access modifiers changed from: private */
    public void removeCallLogs() {
        int count = this.historyList.getAdapter().getCount();
        for (int i = 0; i < count; i++) {
            if (this.historyList.isItemChecked(i)) {
                LinphoneManager.getLc().removeCallLog(this.mLogs.get(i));
            }
        }
    }

    public int getNbItemsChecked() {
        int count = this.historyList.getAdapter().getCount();
        int i = 0;
        for (int i2 = 0; i2 < count; i2++) {
            if (this.historyList.isItemChecked(i2)) {
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

    private void removeNotMissedCallsFromLogs() {
        if (this.onlyDisplayMissedCalls) {
            ArrayList arrayList = new ArrayList();
            for (LinphoneCallLog next : this.mLogs) {
                if (next.getStatus() == LinphoneCallLog.CallStatus.Missed) {
                    arrayList.add(next);
                }
            }
            this.mLogs = arrayList;
        }
    }

    private boolean hideHistoryListAndDisplayMessageIfEmpty() {
        removeNotMissedCallsFromLogs();
        if (this.mLogs.isEmpty()) {
            if (this.onlyDisplayMissedCalls) {
                this.noMissedCallHistory.setVisibility(0);
            } else {
                this.noCallHistory.setVisibility(0);
            }
            this.historyList.setVisibility(8);
            this.edit.setEnabled(false);
            return true;
        }
        this.noCallHistory.setVisibility(8);
        this.noMissedCallHistory.setVisibility(8);
        this.historyList.setVisibility(0);
        this.edit.setEnabled(true);
        return false;
    }

    public void onResume() {
        super.onResume();
        ContactsManager.addContactsListener(this);
        if (LinphoneActivity.isInstanciated()) {
            LinphoneActivity.instance().selectMenu(FragmentsAvailable.HISTORY_LIST);
            LinphoneActivity.instance().hideTabBar(false);
            LinphoneActivity.instance().displayMissedCalls(0);
        }
        this.mLogs = Arrays.asList(LinphoneManager.getLc().getCallLogs());
        if (!hideHistoryListAndDisplayMessageIfEmpty()) {
            this.historyList.setChoiceMode(2);
            this.historyList.setAdapter(new CallHistoryAdapter(getActivity().getApplicationContext()));
        }
    }

    public void onPause() {
        ContactsManager.removeContactsListener(this);
        super.onPause();
    }

    public void onContactsUpdated() {
        CallHistoryAdapter callHistoryAdapter;
        if (LinphoneActivity.isInstanciated() && LinphoneActivity.instance().getCurrentFragment() == FragmentsAvailable.HISTORY_LIST && (callHistoryAdapter = (CallHistoryAdapter) this.historyList.getAdapter()) != null) {
            callHistoryAdapter.notifyDataSetChanged();
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
        } else if (id != C5321R.C5324id.delete) {
            if (id == C5321R.C5324id.all_calls) {
                this.allCalls.setEnabled(false);
                this.allCallsSelected.setVisibility(0);
                this.missedCallsSelected.setVisibility(4);
                this.missedCalls.setEnabled(true);
                this.onlyDisplayMissedCalls = false;
                refresh();
            }
            if (id == C5321R.C5324id.missed_calls) {
                this.allCalls.setEnabled(true);
                this.allCallsSelected.setVisibility(4);
                this.missedCallsSelected.setVisibility(0);
                this.missedCalls.setEnabled(false);
                this.onlyDisplayMissedCalls = true;
            }
            if (id == C5321R.C5324id.edit) {
                this.topBar.setVisibility(8);
                this.editList.setVisibility(0);
                enabledDeleteButton(false);
                this.isEditMode = true;
            }
            if (!hideHistoryListAndDisplayMessageIfEmpty()) {
                this.historyList.setChoiceMode(2);
                this.historyList.setAdapter(new CallHistoryAdapter(getActivity().getApplicationContext()));
            }
            if (this.isEditMode) {
                this.deselectAll.setVisibility(8);
                this.selectAll.setVisibility(0);
            }
        } else if (this.historyList.getCheckedItemCount() == 0) {
            quitEditMode();
        } else {
            final Dialog displayDialog = LinphoneActivity.instance().displayDialog(getString(C5321R.string.delete_text));
            ((Button) displayDialog.findViewById(C5321R.C5324id.delete_button)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    HistoryListFragment.this.removeCallLogs();
                    displayDialog.dismiss();
                    HistoryListFragment.this.quitEditMode();
                }
            });
            ((Button) displayDialog.findViewById(C5321R.C5324id.cancel)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    displayDialog.dismiss();
                    HistoryListFragment.this.quitEditMode();
                }
            });
            displayDialog.show();
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.isEditMode) {
            LinphoneManager.getLc().removeCallLog(this.mLogs.get(i));
            this.mLogs = Arrays.asList(LinphoneManager.getLc().getCallLogs());
        }
    }

    public void quitEditMode() {
        this.isEditMode = false;
        this.editList.setVisibility(8);
        this.topBar.setVisibility(0);
        refresh();
        if (!hideHistoryListAndDisplayMessageIfEmpty()) {
            this.historyList.setChoiceMode(2);
            this.historyList.setAdapter(new CallHistoryAdapter(getActivity().getApplicationContext()));
        }
        if (getResources().getBoolean(C5321R.bool.isTablet)) {
            displayFirstLog();
        }
    }

    class CallHistoryAdapter extends BaseAdapter {
        public long getItemId(int i) {
            return (long) i;
        }

        private class ViewHolder {
            public RelativeLayout CallContact;
            public ImageView callDirection;
            public TextView contact;
            public ImageView contactPicture;
            public ImageView detail;
            public CheckBox select;

            public ViewHolder(View view) {
                this.contact = (TextView) view.findViewById(C5321R.C5324id.sip_uri);
                this.detail = (ImageView) view.findViewById(C5321R.C5324id.detail);
                this.select = (CheckBox) view.findViewById(C5321R.C5324id.delete);
                this.callDirection = (ImageView) view.findViewById(C5321R.C5324id.icon);
                this.contactPicture = (ImageView) view.findViewById(C5321R.C5324id.contact_picture);
                this.CallContact = (RelativeLayout) view.findViewById(C5321R.C5324id.history_click);
            }
        }

        CallHistoryAdapter(Context context) {
        }

        public int getCount() {
            return HistoryListFragment.this.mLogs.size();
        }

        public Object getItem(int i) {
            return HistoryListFragment.this.mLogs.get(i);
        }

        private String timestampToHumanDate(Calendar calendar) {
            if (isToday(calendar)) {
                return HistoryListFragment.this.getString(C5321R.string.today);
            }
            if (isYesterday(calendar)) {
                return HistoryListFragment.this.getString(C5321R.string.yesterday);
            }
            return new SimpleDateFormat(HistoryListFragment.this.getResources().getString(C5321R.string.history_date_format)).format(calendar.getTime());
        }

        private boolean isSameDay(Calendar calendar, Calendar calendar2) {
            if (calendar != null && calendar2 != null && calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
                return true;
            }
            return false;
        }

        private boolean isToday(Calendar calendar) {
            return isSameDay(calendar, Calendar.getInstance());
        }

        private boolean isYesterday(Calendar calendar) {
            Calendar instance = Calendar.getInstance();
            instance.roll(5, -1);
            return isSameDay(calendar, instance);
        }

        public View getView(final int i, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder;
            LinphoneAddress linphoneAddress;
            String str;
            if (view != null) {
                viewHolder = (ViewHolder) view.getTag();
            } else {
                view = HistoryListFragment.this.mInflater.inflate(C5321R.layout.history_cell, viewGroup, false);
                viewHolder = new ViewHolder(view);
                view.setTag(viewHolder);
            }
            if (HistoryListFragment.this.mLogs != null && HistoryListFragment.this.mLogs.size() >= i) {
                final LinphoneCallLog linphoneCallLog = (LinphoneCallLog) HistoryListFragment.this.mLogs.get(i);
                long timestamp = linphoneCallLog.getTimestamp();
                viewHolder.contact.setSelected(true);
                LinearLayout linearLayout = (LinearLayout) view.findViewById(C5321R.C5324id.separator);
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(timestamp);
                ((TextView) view.findViewById(C5321R.C5324id.separator_text)).setText(timestampToHumanDate(instance));
                if (i > 0) {
                    long timestamp2 = ((LinphoneCallLog) HistoryListFragment.this.mLogs.get(i - 1)).getTimestamp();
                    Calendar instance2 = Calendar.getInstance();
                    instance2.setTimeInMillis(timestamp2);
                    if (isSameDay(instance2, instance)) {
                        linearLayout.setVisibility(8);
                    } else {
                        linearLayout.setVisibility(0);
                    }
                } else {
                    linearLayout.setVisibility(0);
                }
                if (linphoneCallLog.getDirection() == CallDirection.Incoming) {
                    linphoneAddress = linphoneCallLog.getFrom();
                    if (linphoneCallLog.getStatus() == LinphoneCallLog.CallStatus.Missed) {
                        viewHolder.callDirection.setImageResource(C5321R.C5323drawable.call_status_missed);
                    } else {
                        viewHolder.callDirection.setImageResource(C5321R.C5323drawable.call_status_incoming);
                    }
                } else {
                    linphoneAddress = linphoneCallLog.getTo();
                    viewHolder.callDirection.setImageResource(C5321R.C5323drawable.call_status_outgoing);
                }
                LinphoneContact findContactFromAddress = ContactsManager.getInstance().findContactFromAddress(linphoneAddress);
                if (findContactFromAddress == null) {
                    findContactFromAddress = ContactsManager.getInstance().findContactFromPhoneNumber(linphoneAddress.getUserName());
                }
                final String asString = linphoneAddress.asString();
                if (findContactFromAddress != null) {
                    str = findContactFromAddress.getFullName();
                    LinphoneUtils.setThumbnailPictureFromUri(LinphoneActivity.instance(), viewHolder.contactPicture, findContactFromAddress.getThumbnailUri());
                } else {
                    viewHolder.contactPicture.setImageBitmap(ContactsManager.getInstance().getDefaultAvatarBitmap());
                    str = null;
                }
                if (str == null) {
                    viewHolder.contact.setText(LinphoneUtils.getAddressDisplayName(asString));
                } else {
                    viewHolder.contact.setText(str);
                }
                if (HistoryListFragment.this.isEditMode) {
                    viewHolder.CallContact.setOnClickListener((View.OnClickListener) null);
                    viewHolder.select.setVisibility(0);
                    viewHolder.select.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                            HistoryListFragment.this.historyList.setItemChecked(i, z);
                            if (HistoryListFragment.this.getNbItemsChecked() == CallHistoryAdapter.this.getCount()) {
                                HistoryListFragment.this.deselectAll.setVisibility(0);
                                HistoryListFragment.this.selectAll.setVisibility(8);
                                HistoryListFragment.this.enabledDeleteButton(true);
                            } else if (HistoryListFragment.this.getNbItemsChecked() == 0) {
                                HistoryListFragment.this.deselectAll.setVisibility(8);
                                HistoryListFragment.this.selectAll.setVisibility(0);
                                HistoryListFragment.this.enabledDeleteButton(false);
                            } else {
                                HistoryListFragment.this.deselectAll.setVisibility(8);
                                HistoryListFragment.this.selectAll.setVisibility(0);
                                HistoryListFragment.this.enabledDeleteButton(true);
                            }
                        }
                    });
                    viewHolder.detail.setVisibility(4);
                    if (HistoryListFragment.this.historyList.isItemChecked(i)) {
                        viewHolder.select.setChecked(true);
                    } else {
                        viewHolder.select.setChecked(false);
                    }
                } else {
                    viewHolder.select.setVisibility(8);
                    viewHolder.detail.setVisibility(0);
                    viewHolder.detail.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            if (LinphoneActivity.isInstanciated()) {
                                LinphoneActivity.instance().displayHistoryDetail(asString, linphoneCallLog);
                            }
                        }
                    });
                    viewHolder.CallContact.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            LinphoneAddress linphoneAddress;
                            if (LinphoneActivity.isInstanciated()) {
                                LinphoneCallLog linphoneCallLog = (LinphoneCallLog) HistoryListFragment.this.mLogs.get(i);
                                if (linphoneCallLog.getDirection() == CallDirection.Incoming) {
                                    linphoneAddress = linphoneCallLog.getFrom();
                                } else {
                                    linphoneAddress = linphoneCallLog.getTo();
                                }
                                LinphoneActivity.instance().setAddresGoToDialerAndCall(linphoneAddress.asStringUriOnly(), linphoneAddress.getDisplayName(), (Uri) null);
                            }
                        }
                    });
                }
            }
            return view;
        }
    }
}
