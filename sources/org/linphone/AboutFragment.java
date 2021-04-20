package org.linphone;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreListenerBase;
import org.linphone.mediastream.Log;

public class AboutFragment extends Fragment implements View.OnClickListener {
    ImageView cancel;
    LinphoneCoreListenerBase mListener;
    /* access modifiers changed from: private */
    public ProgressDialog progress;
    View resetLogButton = null;
    View sendLogButton = null;
    /* access modifiers changed from: private */
    public boolean uploadInProgress;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = layoutInflater.inflate(C5321R.layout.about, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C5321R.C5324id.about_android_version);
        ((TextView) inflate.findViewById(C5321R.C5324id.about_liblinphone_version)).setText(String.format(getString(C5321R.string.about_liblinphone_version), new Object[]{LinphoneManager.getLc().getVersion()}));
        try {
            textView.setText(String.format(getString(C5321R.string.about_version), new Object[]{getActivity().getPackageManager().getPackageInfo(getActivity().getPackageName(), 0).versionName}));
        } catch (PackageManager.NameNotFoundException e) {
            Log.m6903e(e, "cannot get version name");
        }
        this.cancel = (ImageView) inflate.findViewById(C5321R.C5324id.cancel);
        this.cancel.setOnClickListener(this);
        this.sendLogButton = inflate.findViewById(C5321R.C5324id.send_log);
        this.sendLogButton.setOnClickListener(this);
        this.sendLogButton.setVisibility(LinphonePreferences.instance().isDebugEnabled() ? 0 : 8);
        this.resetLogButton = inflate.findViewById(C5321R.C5324id.reset_log);
        this.resetLogButton.setOnClickListener(this);
        View view = this.resetLogButton;
        if (!LinphonePreferences.instance().isDebugEnabled()) {
            i = 8;
        }
        view.setVisibility(i);
        this.mListener = new LinphoneCoreListenerBase() {
            public void uploadProgressIndication(LinphoneCore linphoneCore, int i, int i2) {
            }

            public void uploadStateChanged(LinphoneCore linphoneCore, LinphoneCore.LogCollectionUploadState logCollectionUploadState, String str) {
                if (logCollectionUploadState == LinphoneCore.LogCollectionUploadState.LogCollectionUploadStateInProgress) {
                    AboutFragment.this.displayUploadLogsInProgress();
                } else if (logCollectionUploadState == LinphoneCore.LogCollectionUploadState.LogCollectionUploadStateDelivered || logCollectionUploadState == LinphoneCore.LogCollectionUploadState.LogCollectionUploadStateNotDelivered) {
                    boolean unused = AboutFragment.this.uploadInProgress = false;
                    if (AboutFragment.this.progress != null) {
                        AboutFragment.this.progress.dismiss();
                    }
                    if (logCollectionUploadState == LinphoneCore.LogCollectionUploadState.LogCollectionUploadStateDelivered) {
                        AboutFragment.this.sendLogs(LinphoneService.instance().getApplicationContext(), str);
                    }
                }
            }
        };
        return inflate;
    }

    /* access modifiers changed from: private */
    public void displayUploadLogsInProgress() {
        if (!this.uploadInProgress) {
            this.uploadInProgress = true;
            this.progress = ProgressDialog.show(LinphoneActivity.instance(), (CharSequence) null, (CharSequence) null);
            ColorDrawable colorDrawable = new ColorDrawable(ContextCompat.getColor(getActivity(), C5321R.C5322color.colorE));
            colorDrawable.setAlpha(200);
            this.progress.getWindow().setLayout(-1, -1);
            this.progress.getWindow().setBackgroundDrawable(colorDrawable);
            this.progress.setContentView(C5321R.layout.progress_dialog);
            this.progress.show();
        }
    }

    /* access modifiers changed from: private */
    public void sendLogs(Context context, String str) {
        String string = context.getString(C5321R.string.app_name);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{context.getString(C5321R.string.about_bugreport_email)});
        intent.putExtra("android.intent.extra.SUBJECT", string + " Logs");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("application/zip");
        try {
            startActivity(Intent.createChooser(intent, "Send mail..."));
        } catch (ActivityNotFoundException e) {
            Log.m6903e(e);
        }
    }

    public void onPause() {
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.removeListener(this.mListener);
        }
        super.onPause();
    }

    public void onResume() {
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull != null) {
            lcIfManagerNotDestroyedOrNull.addListener(this.mListener);
        }
        if (LinphoneActivity.isInstanciated()) {
            LinphoneActivity.instance().selectMenu(FragmentsAvailable.ABOUT);
        }
        super.onResume();
    }

    public void onClick(View view) {
        if (LinphoneActivity.isInstanciated()) {
            LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
            if (view == this.sendLogButton) {
                if (lcIfManagerNotDestroyedOrNull != null) {
                    lcIfManagerNotDestroyedOrNull.uploadLogCollection();
                }
            } else if (view == this.resetLogButton) {
                if (lcIfManagerNotDestroyedOrNull != null) {
                    lcIfManagerNotDestroyedOrNull.resetLogCollection();
                }
            } else if (view == this.cancel) {
                LinphoneActivity.instance().goToDialerFragment();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
