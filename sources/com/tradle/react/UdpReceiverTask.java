package com.tradle.react;

import android.os.AsyncTask;
import android.util.Base64;
import android.util.Pair;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiverTask extends AsyncTask<Pair<DatagramSocket, OnDataReceivedListener>, Void, Void> {
    private static final int MAX_UDP_DATAGRAM_LEN = 65535;
    private static final String TAG = "UdpReceiverTask";

    public interface OnDataReceivedListener {
        void didReceiveData(String str, String str2, int i);

        void didReceiveError(String str);

        void didReceiveRuntimeException(RuntimeException runtimeException);
    }

    /* access modifiers changed from: protected */
    public Void doInBackground(Pair<DatagramSocket, OnDataReceivedListener>... pairArr) {
        if (pairArr.length <= 1) {
            DatagramSocket datagramSocket = (DatagramSocket) pairArr[0].first;
            OnDataReceivedListener onDataReceivedListener = (OnDataReceivedListener) pairArr[0].second;
            byte[] bArr = new byte[65535];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
            while (!isCancelled()) {
                try {
                    datagramSocket.receive(datagramPacket);
                    onDataReceivedListener.didReceiveData(Base64.encodeToString(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength(), 2), datagramPacket.getAddress().getHostAddress(), datagramPacket.getPort());
                } catch (IOException e) {
                    if (onDataReceivedListener != null) {
                        onDataReceivedListener.didReceiveError(e.getMessage());
                    }
                    cancel(false);
                } catch (RuntimeException e2) {
                    if (onDataReceivedListener != null) {
                        onDataReceivedListener.didReceiveRuntimeException(e2);
                    }
                    cancel(false);
                }
            }
            return null;
        }
        throw new IllegalArgumentException("This task is only for a single socket/listener pair.");
    }
}
