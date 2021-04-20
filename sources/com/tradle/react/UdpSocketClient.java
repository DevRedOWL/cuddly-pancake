package com.tradle.react;

import android.os.AsyncTask;
import android.util.Base64;
import android.util.Pair;
import com.facebook.react.bridge.Callback;
import com.tradle.react.UdpReceiverTask;
import com.tradle.react.UdpSenderTask;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;

public final class UdpSocketClient implements UdpReceiverTask.OnDataReceivedListener, UdpSenderTask.OnDataSentListener {
    private final OnRuntimeExceptionListener mExceptionListener;
    private boolean mIsMulticastSocket;
    private final Map<UdpSenderTask, Callback> mPendingSends;
    private final OnDataReceivedListener mReceiverListener;
    private UdpReceiverTask mReceiverTask;
    private final boolean mReuseAddress;
    private DatagramSocket mSocket;

    public interface OnDataReceivedListener {
        void didReceiveData(UdpSocketClient udpSocketClient, String str, String str2, int i);

        void didReceiveError(UdpSocketClient udpSocketClient, String str);
    }

    public interface OnRuntimeExceptionListener {
        void didReceiveException(RuntimeException runtimeException);
    }

    private UdpSocketClient(Builder builder) {
        this.mIsMulticastSocket = false;
        this.mReceiverListener = builder.receiverListener;
        this.mExceptionListener = builder.exceptionListener;
        this.mReuseAddress = builder.reuse;
        this.mPendingSends = new ConcurrentHashMap();
    }

    public boolean isMulticast() {
        return this.mIsMulticastSocket;
    }

    public void bind(Integer num, @Nullable String str) throws IOException {
        InetSocketAddress inetSocketAddress;
        this.mSocket = new MulticastSocket((SocketAddress) null);
        this.mReceiverTask = new UdpReceiverTask();
        if (str != null) {
            inetSocketAddress = new InetSocketAddress(InetAddress.getByName(str), num.intValue());
        } else {
            inetSocketAddress = new InetSocketAddress(num.intValue());
        }
        this.mSocket.setReuseAddress(this.mReuseAddress);
        this.mSocket.bind(inetSocketAddress);
        this.mReceiverTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Pair[]{new Pair(this.mSocket, this)});
    }

    public void addMembership(String str) throws UnknownHostException, IOException, IllegalStateException {
        DatagramSocket datagramSocket = this.mSocket;
        if (datagramSocket == null || !datagramSocket.isBound()) {
            throw new IllegalStateException("Socket is not bound.");
        }
        ((MulticastSocket) this.mSocket).joinGroup(InetAddress.getByName(str));
        this.mIsMulticastSocket = true;
    }

    public void dropMembership(String str) throws UnknownHostException, IOException {
        ((MulticastSocket) this.mSocket).leaveGroup(InetAddress.getByName(str));
        this.mIsMulticastSocket = false;
    }

    public void send(String str, Integer num, String str2, @Nullable Callback callback) throws UnknownHostException, IllegalStateException, IOException {
        DatagramSocket datagramSocket = this.mSocket;
        if (datagramSocket == null || !datagramSocket.isBound()) {
            throw new IllegalStateException("Socket is not bound.");
        }
        byte[] decode = Base64.decode(str, 2);
        UdpSenderTask udpSenderTask = new UdpSenderTask(this.mSocket, this);
        UdpSenderTask.SenderPacket senderPacket = new UdpSenderTask.SenderPacket();
        senderPacket.data = decode;
        senderPacket.socketAddress = new InetSocketAddress(InetAddress.getByName(str2), num.intValue());
        if (callback != null) {
            synchronized (this.mPendingSends) {
                this.mPendingSends.put(udpSenderTask, callback);
            }
        }
        udpSenderTask.execute(new UdpSenderTask.SenderPacket[]{senderPacket});
    }

    public void setBroadcast(boolean z) throws SocketException {
        DatagramSocket datagramSocket = this.mSocket;
        if (datagramSocket != null) {
            datagramSocket.setBroadcast(z);
        }
    }

    public void close() throws IOException {
        UdpReceiverTask udpReceiverTask = this.mReceiverTask;
        if (udpReceiverTask != null && !udpReceiverTask.isCancelled()) {
            this.mReceiverTask.cancel(true);
        }
        DatagramSocket datagramSocket = this.mSocket;
        if (datagramSocket != null && !datagramSocket.isClosed()) {
            this.mSocket.close();
            this.mSocket = null;
        }
    }

    public void didReceiveData(String str, String str2, int i) {
        this.mReceiverListener.didReceiveData(this, str, str2, i);
    }

    public void didReceiveError(String str) {
        this.mReceiverListener.didReceiveError(this, str);
    }

    public void didReceiveRuntimeException(RuntimeException runtimeException) {
        this.mExceptionListener.didReceiveException(runtimeException);
    }

    public void onDataSent(UdpSenderTask udpSenderTask) {
        Callback callback;
        synchronized (this.mPendingSends) {
            callback = this.mPendingSends.get(udpSenderTask);
            this.mPendingSends.remove(udpSenderTask);
        }
        if (callback != null) {
            callback.invoke(new Object[0]);
        }
    }

    public void onDataSentError(UdpSenderTask udpSenderTask, String str) {
        Callback callback;
        synchronized (this.mPendingSends) {
            callback = this.mPendingSends.get(udpSenderTask);
            this.mPendingSends.remove(udpSenderTask);
        }
        if (callback != null) {
            callback.invoke(UdpErrorUtil.getError((String) null, str));
        }
    }

    public void onDataSentRuntimeException(UdpSenderTask udpSenderTask, RuntimeException runtimeException) {
        this.mExceptionListener.didReceiveException(runtimeException);
        synchronized (this.mPendingSends) {
            this.mPendingSends.remove(udpSenderTask);
        }
    }

    public static class Builder {
        /* access modifiers changed from: private */
        public OnRuntimeExceptionListener exceptionListener;
        /* access modifiers changed from: private */
        public OnDataReceivedListener receiverListener;
        /* access modifiers changed from: private */
        public boolean reuse = true;

        public Builder(OnDataReceivedListener onDataReceivedListener, OnRuntimeExceptionListener onRuntimeExceptionListener) {
            this.receiverListener = onDataReceivedListener;
            this.exceptionListener = onRuntimeExceptionListener;
        }

        public Builder reuseAddress(boolean z) {
            this.reuse = z;
            return this;
        }

        public UdpSocketClient build() {
            return new UdpSocketClient(this);
        }
    }
}
