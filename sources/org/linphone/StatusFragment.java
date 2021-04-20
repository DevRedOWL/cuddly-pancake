package org.linphone;

import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import org.linphone.assistant.AssistantActivity;
import org.linphone.core.CallDirection;
import org.linphone.core.LinphoneCall;
import org.linphone.core.LinphoneContent;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreListenerBase;
import org.linphone.core.LinphoneEvent;
import org.linphone.core.LinphoneProxyConfig;
import org.linphone.mediastream.Log;

public class StatusFragment extends Fragment {
    /* access modifiers changed from: private */
    public Dialog ZRTPdialog = null;
    private ImageView callQuality;
    /* access modifiers changed from: private */
    public ImageView encryption;
    /* access modifiers changed from: private */
    public boolean isAttached = false;
    /* access modifiers changed from: private */
    public boolean isInCall;
    /* access modifiers changed from: private */
    public boolean isZrtpAsk;
    /* access modifiers changed from: private */
    public Runnable mCallQualityUpdater;
    private int mDisplayedQuality = -1;
    private LinphoneCoreListenerBase mListener;
    private ImageView menu;
    /* access modifiers changed from: private */
    public Handler refreshHandler = new Handler();
    /* access modifiers changed from: private */
    public ImageView statusLed;
    /* access modifiers changed from: private */
    public TextView statusText;
    /* access modifiers changed from: private */
    public ImageView voicemail;
    /* access modifiers changed from: private */
    public TextView voicemailCount;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5321R.layout.status, viewGroup, false);
        this.statusText = (TextView) inflate.findViewById(C5321R.C5324id.status_text);
        this.statusLed = (ImageView) inflate.findViewById(C5321R.C5324id.status_led);
        this.callQuality = (ImageView) inflate.findViewById(C5321R.C5324id.call_quality);
        this.encryption = (ImageView) inflate.findViewById(C5321R.C5324id.encryption);
        this.menu = (ImageView) inflate.findViewById(C5321R.C5324id.side_menu_button);
        this.voicemail = (ImageView) inflate.findViewById(C5321R.C5324id.voicemail);
        this.voicemailCount = (TextView) inflate.findViewById(C5321R.C5324id.voicemail_count);
        populateSliderContent();
        this.mListener = new LinphoneCoreListenerBase() {
            public void registrationState(final LinphoneCore linphoneCore, LinphoneProxyConfig linphoneProxyConfig, LinphoneCore.RegistrationState registrationState, String str) {
                if (StatusFragment.this.isAttached && LinphoneService.isReady()) {
                    if (linphoneCore.getProxyConfigList() == null) {
                        StatusFragment.this.statusLed.setImageResource(C5321R.C5323drawable.led_disconnected);
                        StatusFragment.this.statusText.setText(StatusFragment.this.getString(C5321R.string.no_account));
                    } else {
                        StatusFragment.this.statusLed.setVisibility(0);
                    }
                    if (linphoneCore.getDefaultProxyConfig() != null && linphoneCore.getDefaultProxyConfig().equals(linphoneProxyConfig)) {
                        StatusFragment.this.statusLed.setImageResource(StatusFragment.this.getStatusIconResource(registrationState, true));
                        StatusFragment.this.statusText.setText(StatusFragment.this.getStatusIconText(registrationState));
                    } else if (linphoneCore.getDefaultProxyConfig() == null) {
                        StatusFragment.this.statusLed.setImageResource(StatusFragment.this.getStatusIconResource(registrationState, true));
                        StatusFragment.this.statusText.setText(StatusFragment.this.getStatusIconText(registrationState));
                    }
                    try {
                        StatusFragment.this.statusText.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View view) {
                                linphoneCore.refreshRegisters();
                            }
                        });
                    } catch (IllegalStateException unused) {
                    }
                }
            }

            public void notifyReceived(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, String str, LinphoneContent linphoneContent) {
                if (linphoneContent.getType().equals("application") && linphoneContent.getSubtype().equals("simple-message-summary") && linphoneContent.getData() != null) {
                    int parseInt = Integer.parseInt(linphoneContent.getDataAsString().split("voice-message: ")[1].split("/", 0)[0]);
                    if (parseInt > 0) {
                        StatusFragment.this.voicemailCount.setText(parseInt);
                        StatusFragment.this.voicemail.setVisibility(0);
                        StatusFragment.this.voicemailCount.setVisibility(0);
                        return;
                    }
                    StatusFragment.this.voicemail.setVisibility(8);
                    StatusFragment.this.voicemailCount.setVisibility(8);
                }
            }
        };
        this.isAttached = true;
        Activity activity = getActivity();
        if (activity instanceof LinphoneActivity) {
            ((LinphoneActivity) activity).updateStatusFragment(this);
            this.isInCall = false;
        } else if (activity instanceof CallActivity) {
            ((CallActivity) activity).updateStatusFragment(this);
            this.isInCall = true;
        } else if (activity instanceof AssistantActivity) {
            ((AssistantActivity) activity).updateStatusFragment(this);
            this.isInCall = false;
        }
        return inflate;
    }

    public void setLinphoneCoreListener() {
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.addListener(this.mListener);
            LinphoneProxyConfig defaultProxyConfig = lcIfManagerNotDestroyedOrNull.getDefaultProxyConfig();
            if (defaultProxyConfig != null) {
                this.mListener.registrationState(lcIfManagerNotDestroyedOrNull, defaultProxyConfig, defaultProxyConfig.getState(), (String) null);
            }
        }
    }

    public void onDetach() {
        super.onDetach();
        this.isAttached = false;
    }

    private void populateSliderContent() {
        if (LinphoneManager.isInstanciated() && LinphoneManager.getLc() != null) {
            this.voicemailCount.setVisibility(8);
            if ((!this.isInCall || !this.isAttached) && !this.isInCall) {
                this.voicemailCount.setVisibility(0);
            }
            if (LinphoneManager.getLc().getProxyConfigList().length == 0) {
                this.statusLed.setImageResource(C5321R.C5323drawable.led_disconnected);
                this.statusText.setText(getString(C5321R.string.no_account));
            }
        }
    }

    public void resetAccountStatus() {
        if (LinphoneManager.getLc().getProxyConfigList().length == 0) {
            this.statusLed.setImageResource(C5321R.C5323drawable.led_disconnected);
            this.statusText.setText(getString(C5321R.string.no_account));
        }
    }

    public void enableSideMenu(boolean z) {
        this.menu.setEnabled(z);
    }

    /* access modifiers changed from: private */
    public int getStatusIconResource(LinphoneCore.RegistrationState registrationState, boolean z) {
        try {
            LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
            boolean z2 = (z && lcIfManagerNotDestroyedOrNull != null && lcIfManagerNotDestroyedOrNull.getDefaultProxyConfig() != null && lcIfManagerNotDestroyedOrNull.getDefaultProxyConfig().isRegistered()) || !z;
            if (registrationState == LinphoneCore.RegistrationState.RegistrationOk && z2) {
                return C5321R.C5323drawable.led_connected;
            }
            if (registrationState == LinphoneCore.RegistrationState.RegistrationProgress) {
                return C5321R.C5323drawable.led_inprogress;
            }
            if (registrationState == LinphoneCore.RegistrationState.RegistrationFailed) {
                return C5321R.C5323drawable.led_error;
            }
            return C5321R.C5323drawable.led_disconnected;
        } catch (Exception e) {
            Log.m6903e(e);
            return C5321R.C5323drawable.led_disconnected;
        }
    }

    /* access modifiers changed from: private */
    public String getStatusIconText(LinphoneCore.RegistrationState registrationState) {
        Context activity = getActivity();
        if (!this.isAttached && LinphoneActivity.isInstanciated()) {
            activity = LinphoneActivity.instance();
        } else if (!this.isAttached && LinphoneService.isReady()) {
            activity = LinphoneService.instance();
        }
        try {
            if (registrationState == LinphoneCore.RegistrationState.RegistrationOk && LinphoneManager.getLcIfManagerNotDestroyedOrNull().getDefaultProxyConfig().isRegistered()) {
                return activity.getString(C5321R.string.status_connected);
            }
            if (registrationState == LinphoneCore.RegistrationState.RegistrationProgress) {
                return activity.getString(C5321R.string.status_in_progress);
            }
            if (registrationState == LinphoneCore.RegistrationState.RegistrationFailed) {
                return activity.getString(C5321R.string.status_error);
            }
            return activity.getString(C5321R.string.status_not_connected);
        } catch (Exception e) {
            Log.m6903e(e);
            return activity.getString(C5321R.string.status_not_connected);
        }
    }

    private void startCallQuality() {
        this.callQuality.setVisibility(0);
        Handler handler = this.refreshHandler;
        C53862 r1 = new Runnable() {
            LinphoneCall mCurrentCall = LinphoneManager.getLc().getCurrentCall();

            public void run() {
                LinphoneCall linphoneCall = this.mCurrentCall;
                if (linphoneCall == null) {
                    Runnable unused = StatusFragment.this.mCallQualityUpdater = null;
                    return;
                }
                StatusFragment.this.updateQualityOfSignalIcon(linphoneCall.getCurrentQuality());
                if (StatusFragment.this.isInCall) {
                    StatusFragment.this.refreshHandler.postDelayed(this, 1000);
                } else {
                    Runnable unused2 = StatusFragment.this.mCallQualityUpdater = null;
                }
            }
        };
        this.mCallQualityUpdater = r1;
        handler.postDelayed(r1, 1000);
    }

    /* access modifiers changed from: package-private */
    public void updateQualityOfSignalIcon(float f) {
        int i = (int) f;
        if (i != this.mDisplayedQuality) {
            if (f >= 4.0f) {
                this.callQuality.setImageResource(C5321R.C5323drawable.call_quality_indicator_4);
            } else if (f >= 3.0f) {
                this.callQuality.setImageResource(C5321R.C5323drawable.call_quality_indicator_3);
            } else if (f >= 2.0f) {
                this.callQuality.setImageResource(C5321R.C5323drawable.call_quality_indicator_2);
            } else if (f >= 1.0f) {
                this.callQuality.setImageResource(C5321R.C5323drawable.call_quality_indicator_1);
            } else {
                this.callQuality.setImageResource(C5321R.C5323drawable.call_quality_indicator_0);
            }
            this.mDisplayedQuality = i;
        }
    }

    public void onResume() {
        super.onResume();
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.addListener(this.mListener);
            LinphoneProxyConfig defaultProxyConfig = lcIfManagerNotDestroyedOrNull.getDefaultProxyConfig();
            if (defaultProxyConfig != null) {
                this.mListener.registrationState(lcIfManagerNotDestroyedOrNull, defaultProxyConfig, defaultProxyConfig.getState(), (String) null);
            }
            LinphoneCall currentCall = lcIfManagerNotDestroyedOrNull.getCurrentCall();
            if (!this.isInCall) {
                return;
            }
            if (currentCall != null || lcIfManagerNotDestroyedOrNull.getConferenceSize() > 1 || lcIfManagerNotDestroyedOrNull.getCallsNb() > 0) {
                if (currentCall != null) {
                    startCallQuality();
                    refreshStatusItems(currentCall, currentCall.getCurrentParams().getVideoEnabled());
                }
                this.menu.setVisibility(4);
                this.encryption.setVisibility(0);
                this.callQuality.setVisibility(0);
                if (lcIfManagerNotDestroyedOrNull.getDefaultProxyConfig() == null) {
                    this.statusLed.setImageResource(C5321R.C5323drawable.led_disconnected);
                    this.statusText.setText(getString(C5321R.string.no_account));
                    return;
                }
                this.statusLed.setImageResource(getStatusIconResource(lcIfManagerNotDestroyedOrNull.getDefaultProxyConfig().getState(), true));
                this.statusText.setText(getStatusIconText(lcIfManagerNotDestroyedOrNull.getDefaultProxyConfig().getState()));
                return;
            }
            return;
        }
        this.statusText.setVisibility(0);
        this.encryption.setVisibility(8);
    }

    public void onPause() {
        super.onPause();
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.removeListener(this.mListener);
        }
        Runnable runnable = this.mCallQualityUpdater;
        if (runnable != null) {
            this.refreshHandler.removeCallbacks(runnable);
            this.mCallQualityUpdater = null;
        }
    }

    public void refreshStatusItems(final LinphoneCall linphoneCall, boolean z) {
        if (linphoneCall != null) {
            this.voicemailCount.setVisibility(8);
            LinphoneCore.MediaEncryption mediaEncryption = linphoneCall.getCurrentParams().getMediaEncryption();
            if (mediaEncryption == LinphoneCore.MediaEncryption.SRTP || ((mediaEncryption == LinphoneCore.MediaEncryption.ZRTP && linphoneCall.isAuthenticationTokenVerified()) || mediaEncryption == LinphoneCore.MediaEncryption.DTLS)) {
                this.encryption.setImageResource(C5321R.C5323drawable.security_ok);
            } else if (mediaEncryption != LinphoneCore.MediaEncryption.ZRTP || linphoneCall.isAuthenticationTokenVerified()) {
                this.encryption.setImageResource(C5321R.C5323drawable.security_ko);
            } else {
                this.encryption.setImageResource(C5321R.C5323drawable.security_pending);
            }
            if (mediaEncryption == LinphoneCore.MediaEncryption.ZRTP) {
                this.encryption.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        StatusFragment.this.showZRTPDialog(linphoneCall);
                    }
                });
            } else {
                this.encryption.setOnClickListener((View.OnClickListener) null);
            }
        }
    }

    public void showZRTPDialog(final LinphoneCall linphoneCall) {
        String str;
        String str2;
        if (getActivity() == null) {
            Log.m6907w("Can't display ZRTP popup, no Activity");
            return;
        }
        Dialog dialog = this.ZRTPdialog;
        if (dialog == null || !dialog.isShowing()) {
            String authenticationToken = linphoneCall.getAuthenticationToken();
            if (authenticationToken == null) {
                Log.m6907w("Can't display ZRTP popup, no token !");
            } else if (authenticationToken.length() < 4) {
                Log.m6907w("Can't display ZRTP popup, token is invalid (" + authenticationToken + ")");
            } else {
                this.ZRTPdialog = new Dialog(getActivity());
                this.ZRTPdialog.requestWindowFeature(1);
                ColorDrawable colorDrawable = new ColorDrawable(ContextCompat.getColor(getActivity(), C5321R.C5322color.colorC));
                colorDrawable.setAlpha(200);
                this.ZRTPdialog.setContentView(C5321R.layout.dialog);
                this.ZRTPdialog.getWindow().setLayout(-1, -1);
                this.ZRTPdialog.getWindow().setBackgroundDrawable(colorDrawable);
                this.isZrtpAsk = true;
                if (linphoneCall.getDirection().equals(CallDirection.Incoming)) {
                    String substring = authenticationToken.substring(0, 2);
                    str = authenticationToken.substring(2);
                    str2 = substring;
                } else {
                    str = authenticationToken.substring(0, 2);
                    str2 = authenticationToken.substring(2);
                }
                ((KeyguardManager) getActivity().getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((TextView) this.ZRTPdialog.findViewById(C5321R.C5324id.customText)).setText(getString(C5321R.string.zrtp_dialog1).replace("%s", str2) + getString(C5321R.string.zrtp_dialog2).replace("%s", str));
                Button button = (Button) this.ZRTPdialog.findViewById(C5321R.C5324id.delete_button);
                button.setText(C5321R.string.accept);
                Button button2 = (Button) this.ZRTPdialog.findViewById(C5321R.C5324id.cancel);
                button2.setText(C5321R.string.deny);
                button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        linphoneCall.setAuthenticationTokenVerified(true);
                        if (StatusFragment.this.encryption != null) {
                            StatusFragment.this.encryption.setImageResource(C5321R.C5323drawable.security_ok);
                        }
                        boolean unused = StatusFragment.this.isZrtpAsk = false;
                        StatusFragment.this.ZRTPdialog.dismiss();
                    }
                });
                button2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        LinphoneCall linphoneCall = linphoneCall;
                        if (linphoneCall != null) {
                            linphoneCall.setAuthenticationTokenVerified(false);
                            if (StatusFragment.this.encryption != null) {
                                StatusFragment.this.encryption.setImageResource(C5321R.C5323drawable.security_ko);
                            }
                        }
                        boolean unused = StatusFragment.this.isZrtpAsk = false;
                        StatusFragment.this.ZRTPdialog.dismiss();
                    }
                });
                this.ZRTPdialog.show();
            }
        }
    }

    public boolean getisZrtpAsk() {
        return this.isZrtpAsk;
    }

    public void setisZrtpAsk(boolean z) {
        this.isZrtpAsk = z;
    }
}
