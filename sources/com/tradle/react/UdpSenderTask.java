package com.tradle.react;

import android.os.AsyncTask;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;

public class UdpSenderTask extends AsyncTask<SenderPacket, Void, Void> {
    private static final String TAG = "UdpSenderTask";
    private WeakReference<OnDataSentListener> mListener;
    private DatagramSocket mSocket;

    public interface OnDataSentListener {
        void onDataSent(UdpSenderTask udpSenderTask);

        void onDataSentError(UdpSenderTask udpSenderTask, String str);

        void onDataSentRuntimeException(UdpSenderTask udpSenderTask, RuntimeException runtimeException);
    }

    public static class SenderPacket {
        byte[] data;
        SocketAddress socketAddress;
    }

    public UdpSenderTask(DatagramSocket datagramSocket, OnDataSentListener onDataSentListener) {
        this.mSocket = datagramSocket;
        this.mListener = new WeakReference<>(onDataSentListener);
    }

    /* access modifiers changed from: protected */
    public Void doInBackground(SenderPacket... senderPacketArr) {
        OnDataSentListener onDataSentListener = (OnDataSentListener) this.mListener.get();
        try {
            SenderPacket senderPacket = senderPacketArr[0];
            this.mSocket.send(new DatagramPacket(senderPacket.data, senderPacket.data.length, senderPacket.socketAddress));
            if (onDataSentListener == null) {
                return null;
            }
            onDataSentListener.onDataSent(this);
            return null;
        } catch (IOException e) {
            if (onDataSentListener == null) {
                return null;
            }
            onDataSentListener.onDataSentError(this, e.getMessage());
            return null;
        } catch (RuntimeException e2) {
            if (onDataSentListener == null) {
                return null;
            }
            onDataSentListener.onDataSentRuntimeException(this, e2);
            return null;
        }
    }
}
