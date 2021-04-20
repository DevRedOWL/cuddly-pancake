package org.linphone.p054ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import org.linphone.C5321R;
import org.linphone.CallActivity;
import org.linphone.LinphoneManager;
import org.linphone.LinphonePreferences;
import org.linphone.LinphoneService;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreFactory;
import org.linphone.mediastream.Log;

/* renamed from: org.linphone.ui.Digit */
public class Digit extends Button implements AddressAware {
    /* access modifiers changed from: private */
    public AddressText mAddress;
    /* access modifiers changed from: private */
    public boolean mPlayDtmf;

    public void setAddressWidget(AddressText addressText) {
        this.mAddress = addressText;
    }

    public void setPlayDtmf(boolean z) {
        this.mPlayDtmf = z;
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (charSequence != null && charSequence.length() >= 1) {
            DialKeyListener dialKeyListener = new DialKeyListener();
            setOnClickListener(dialKeyListener);
            setOnTouchListener(dialKeyListener);
            if ("0+".equals(charSequence)) {
                setOnLongClickListener(dialKeyListener);
            }
            if ("1".equals(charSequence)) {
                setOnLongClickListener(dialKeyListener);
            }
        }
    }

    public Digit(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLongClickable(true);
    }

    public Digit(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLongClickable(true);
    }

    public Digit(Context context) {
        super(context);
        setLongClickable(true);
    }

    /* renamed from: org.linphone.ui.Digit$DialKeyListener */
    private class DialKeyListener implements View.OnClickListener, View.OnTouchListener, View.OnLongClickListener {
        boolean mIsDtmfStarted;
        final char mKeyCode;

        DialKeyListener() {
            this.mKeyCode = Digit.this.getText().subSequence(0, 1).charAt(0);
        }

        private boolean linphoneServiceReady() {
            if (LinphoneService.isReady()) {
                return true;
            }
            Log.m6907w("Service is not ready while pressing digit");
            Toast.makeText(Digit.this.getContext(), Digit.this.getContext().getString(C5321R.string.skipable_error_service_not_ready), 0).show();
            return false;
        }

        public void onClick(View view) {
            if (Digit.this.mPlayDtmf) {
                if (linphoneServiceReady()) {
                    LinphoneCore lc = LinphoneManager.getLc();
                    lc.stopDtmf();
                    this.mIsDtmfStarted = false;
                    if (lc.isIncall()) {
                        lc.sendDtmf(this.mKeyCode);
                    }
                } else {
                    return;
                }
            }
            if (Digit.this.mAddress != null) {
                int selectionStart = Digit.this.mAddress.getSelectionStart();
                if (selectionStart == -1) {
                    selectionStart = Digit.this.mAddress.length();
                }
                if (selectionStart >= 0) {
                    Digit.this.mAddress.getEditableText().insert(selectionStart, String.valueOf(this.mKeyCode));
                }
                if (LinphonePreferences.instance().getDebugPopupAddress() != null && Digit.this.mAddress.getText().toString().equals(LinphonePreferences.instance().getDebugPopupAddress())) {
                    displayDebugPopup();
                }
            }
        }

        public void displayDebugPopup() {
            AlertDialog.Builder builder = new AlertDialog.Builder(Digit.this.getContext());
            builder.setTitle(Digit.this.getContext().getString(C5321R.string.debug_popup_title));
            if (LinphonePreferences.instance().isDebugEnabled()) {
                builder.setItems(Digit.this.getContext().getResources().getStringArray(C5321R.array.popup_send_log), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        LinphoneCore lcIfManagerNotDestroyedOrNull;
                        if (i == 0) {
                            LinphonePreferences.instance().setDebugEnabled(false);
                            LinphoneCoreFactory.instance().enableLogCollection(false);
                        }
                        if (i == 1 && (lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull()) != null) {
                            lcIfManagerNotDestroyedOrNull.uploadLogCollection();
                        }
                    }
                });
            } else {
                builder.setItems(Digit.this.getContext().getResources().getStringArray(C5321R.array.popup_enable_log), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (i == 0) {
                            LinphonePreferences.instance().setDebugEnabled(true);
                            LinphoneCoreFactory.instance().enableLogCollection(true);
                        }
                    }
                });
            }
            builder.show();
            Digit.this.mAddress.getEditableText().clear();
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!Digit.this.mPlayDtmf) {
                return false;
            }
            if (!linphoneServiceReady()) {
                return true;
            }
            if (CallActivity.isInstanciated()) {
                CallActivity.instance().resetControlsHidingCallBack();
            }
            LinphoneCore lc = LinphoneManager.getLc();
            if (motionEvent.getAction() == 0 && !this.mIsDtmfStarted) {
                LinphoneManager.getInstance().playDtmf(Digit.this.getContext().getContentResolver(), this.mKeyCode);
                this.mIsDtmfStarted = true;
            } else if (motionEvent.getAction() == 1) {
                lc.stopDtmf();
                this.mIsDtmfStarted = false;
            }
            return false;
        }

        public boolean onLongClick(View view) {
            int id = view.getId();
            LinphoneCore lc = LinphoneManager.getLc();
            if (Digit.this.mPlayDtmf) {
                if (!linphoneServiceReady()) {
                    return true;
                }
                lc.stopDtmf();
            }
            if (id == C5321R.C5324id.Digit1 && lc.getCalls().length == 0) {
                String voiceMailUri = LinphonePreferences.instance().getVoiceMailUri();
                Digit.this.mAddress.getEditableText().clear();
                if (voiceMailUri != null) {
                    Digit.this.mAddress.getEditableText().append(voiceMailUri);
                    LinphoneManager.getInstance().newOutgoingCall(Digit.this.mAddress);
                }
                return true;
            } else if (Digit.this.mAddress == null) {
                return true;
            } else {
                int selectionStart = Digit.this.mAddress.getSelectionStart();
                if (selectionStart == -1) {
                    selectionStart = Digit.this.mAddress.getEditableText().length();
                }
                if (selectionStart >= 0) {
                    Digit.this.mAddress.getEditableText().insert(selectionStart, "+");
                }
                return true;
            }
        }
    }
}
