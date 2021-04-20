package org.linphone.assistant;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.linphone.C5321R;
import org.linphone.LinphoneManager;
import org.linphone.LinphonePreferences;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.LinphoneCoreListenerBase;
import org.linphone.core.LinphoneXmlRpcRequest;
import org.linphone.core.LinphoneXmlRpcRequestImpl;
import org.linphone.core.LinphoneXmlRpcSession;
import org.linphone.core.LinphoneXmlRpcSessionImpl;
import org.linphone.mediastream.Log;

public class EchoCancellerCalibrationFragment extends Fragment implements LinphoneXmlRpcRequest.LinphoneXmlRpcRequestListener {
    private Handler mHandler = new Handler();
    private LinphoneCoreListenerBase mListener;
    /* access modifiers changed from: private */
    public boolean mSendEcCalibrationResult = false;
    private Runnable runFinished;
    private LinphoneXmlRpcRequest xmlRpcRequest;
    private LinphoneXmlRpcSession xmlRpcSession;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5321R.layout.assistant_ec_calibration, viewGroup, false);
        this.mListener = new LinphoneCoreListenerBase() {
            public void ecCalibrationStatus(LinphoneCore linphoneCore, LinphoneCore.EcCalibratorStatus ecCalibratorStatus, int i, Object obj) {
                LinphoneManager.getInstance().routeAudioToReceiver();
                if (EchoCancellerCalibrationFragment.this.mSendEcCalibrationResult) {
                    EchoCancellerCalibrationFragment.this.sendEcCalibrationResult(ecCalibratorStatus, i);
                } else {
                    AssistantActivity.instance().isEchoCalibrationFinished();
                }
            }
        };
        this.runFinished = new Runnable() {
            public void run() {
                AssistantActivity.instance().isEchoCalibrationFinished();
            }
        };
        this.xmlRpcSession = new LinphoneXmlRpcSessionImpl(LinphoneManager.getLcIfManagerNotDestroyedOrNull(), LinphonePreferences.instance().getXmlrpcUrl());
        this.xmlRpcRequest = new LinphoneXmlRpcRequestImpl("add_ec_calibration_result", LinphoneXmlRpcRequest.ArgType.None);
        this.xmlRpcRequest.setListener(this);
        try {
            LinphoneManager.getInstance().startEcCalibration(this.mListener);
        } catch (LinphoneCoreException e) {
            Log.m6903e(e, "Unable to calibrate EC");
            AssistantActivity.instance().isEchoCalibrationFinished();
        }
        return inflate;
    }

    public void enableEcCalibrationResultSending(boolean z) {
        this.mSendEcCalibrationResult = z;
    }

    public void onXmlRpcRequestResponse(LinphoneXmlRpcRequest linphoneXmlRpcRequest) {
        this.mHandler.post(this.runFinished);
    }

    /* access modifiers changed from: private */
    public void sendEcCalibrationResult(LinphoneCore.EcCalibratorStatus ecCalibratorStatus, int i) {
        Boolean valueOf = Boolean.valueOf(LinphoneManager.getLc().hasBuiltInEchoCanceler());
        Log.m6905i("Add echo canceller calibration result: manufacturer=" + Build.MANUFACTURER + " model=" + Build.MODEL + " status=" + ecCalibratorStatus + " delay=" + i + "ms hasBuiltInEchoCanceler " + valueOf);
        this.xmlRpcRequest.addStringArg(Build.MANUFACTURER);
        this.xmlRpcRequest.addStringArg(Build.MODEL);
        this.xmlRpcRequest.addStringArg(ecCalibratorStatus.toString());
        this.xmlRpcRequest.addIntArg(i);
        this.xmlRpcRequest.addIntArg(valueOf.booleanValue() ? 1 : 0);
        this.xmlRpcSession.sendRequest(this.xmlRpcRequest);
    }
}
