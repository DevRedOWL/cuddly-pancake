package com.tradle.react;

import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.tradle.react.UdpSocketClient;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;
import javax.annotation.Nullable;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Contact;
import p042cz.msebera.android.httpclient.cookie.ClientCookie;

public final class UdpSockets extends ReactContextBaseJavaModule implements UdpSocketClient.OnDataReceivedListener, UdpSocketClient.OnRuntimeExceptionListener {
    private static final String TAG = "UdpSockets";
    /* access modifiers changed from: private */
    public SparseArray<UdpSocketClient> mClients = new SparseArray<>();
    /* access modifiers changed from: private */
    public WifiManager.MulticastLock mMulticastLock;
    private boolean mShuttingDown = false;

    public String getName() {
        return TAG;
    }

    public UdpSockets(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void initialize() {
        this.mShuttingDown = false;
    }

    public void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
        try {
            new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
                /* access modifiers changed from: protected */
                public void doInBackgroundGuarded(Void... voidArr) {
                    for (int i = 0; i < UdpSockets.this.mClients.size(); i++) {
                        try {
                            ((UdpSocketClient) UdpSockets.this.mClients.valueAt(i)).close();
                        } catch (IOException e) {
                            FLog.m623e(UdpSockets.TAG, "exception when shutting down", (Throwable) e);
                        }
                    }
                    UdpSockets.this.mClients.clear();
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]).get();
        } catch (InterruptedException e) {
            FLog.m623e(TAG, "onCatalystInstanceDestroy", (Throwable) e);
        } catch (ExecutionException e2) {
            FLog.m623e(TAG, "onCatalystInstanceDestroy", (Throwable) e2);
        }
    }

    /* access modifiers changed from: private */
    public UdpSocketClient findClient(Integer num, Callback callback) {
        UdpSocketClient udpSocketClient = this.mClients.get(num.intValue());
        if (udpSocketClient == null) {
            if (callback == null) {
                FLog.m622e(TAG, "missing callback parameter.");
            } else {
                callback.invoke(UdpErrorUtil.getError((String) null, "no client found with id " + num), null);
            }
        }
        return udpSocketClient;
    }

    @ReactMethod
    public void createSocket(final Integer num, ReadableMap readableMap) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* access modifiers changed from: protected */
            public void doInBackgroundGuarded(Void... voidArr) {
                if (num == null) {
                    FLog.m622e(UdpSockets.TAG, "createSocket called with nil id parameter.");
                } else if (((UdpSocketClient) UdpSockets.this.mClients.get(num.intValue())) != null) {
                    FLog.m622e(UdpSockets.TAG, "createSocket called twice with the same id.");
                } else {
                    UdpSockets udpSockets = UdpSockets.this;
                    UdpSockets.this.mClients.put(num.intValue(), new UdpSocketClient.Builder(udpSockets, udpSockets).build());
                }
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void bind(Integer num, Integer num2, @Nullable String str, Callback callback) {
        final Integer num3 = num;
        final Callback callback2 = callback;
        final Integer num4 = num2;
        final String str2 = str;
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* access modifiers changed from: protected */
            public void doInBackgroundGuarded(Void... voidArr) {
                UdpSocketClient access$100 = UdpSockets.this.findClient(num3, callback2);
                if (access$100 != null) {
                    try {
                        access$100.bind(num4, str2);
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString(Contact.Type.address, str2);
                        createMap.putInt(ClientCookie.PORT_ATTR, num4.intValue());
                        callback2.invoke(null, createMap);
                    } catch (SocketException e) {
                        callback2.invoke(UdpErrorUtil.getError((String) null, e.getMessage()));
                    } catch (IllegalArgumentException e2) {
                        callback2.invoke(UdpErrorUtil.getError((String) null, e2.getMessage()));
                    } catch (IOException e3) {
                        callback2.invoke(UdpErrorUtil.getError((String) null, e3.getMessage()));
                    }
                }
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void addMembership(final Integer num, final String str) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* access modifiers changed from: protected */
            public void doInBackgroundGuarded(Void... voidArr) {
                UdpSocketClient access$100 = UdpSockets.this.findClient(num, (Callback) null);
                if (access$100 != null) {
                    if (UdpSockets.this.mMulticastLock == null) {
                        WifiManager.MulticastLock unused = UdpSockets.this.mMulticastLock = ((WifiManager) UdpSockets.this.getReactApplicationContext().getApplicationContext().getSystemService("wifi")).createMulticastLock("react-native-udp");
                        UdpSockets.this.mMulticastLock.setReferenceCounted(true);
                    }
                    try {
                        UdpSockets.this.mMulticastLock.acquire();
                        access$100.addMembership(str);
                    } catch (IllegalStateException e) {
                        if (UdpSockets.this.mMulticastLock != null && UdpSockets.this.mMulticastLock.isHeld()) {
                            UdpSockets.this.mMulticastLock.release();
                        }
                        FLog.m623e(UdpSockets.TAG, "addMembership", (Throwable) e);
                    } catch (UnknownHostException e2) {
                        if (UdpSockets.this.mMulticastLock != null && UdpSockets.this.mMulticastLock.isHeld()) {
                            UdpSockets.this.mMulticastLock.release();
                        }
                        FLog.m623e(UdpSockets.TAG, "addMembership", (Throwable) e2);
                    } catch (IOException e3) {
                        if (UdpSockets.this.mMulticastLock != null && UdpSockets.this.mMulticastLock.isHeld()) {
                            UdpSockets.this.mMulticastLock.release();
                        }
                        FLog.m623e(UdpSockets.TAG, "addMembership", (Throwable) e3);
                    }
                }
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void dropMembership(final Integer num, final String str) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* access modifiers changed from: protected */
            public void doInBackgroundGuarded(Void... voidArr) {
                UdpSocketClient access$100 = UdpSockets.this.findClient(num, (Callback) null);
                if (access$100 != null) {
                    try {
                        access$100.dropMembership(str);
                        if (UdpSockets.this.mMulticastLock == null || !UdpSockets.this.mMulticastLock.isHeld()) {
                            return;
                        }
                    } catch (IOException e) {
                        FLog.m623e(UdpSockets.TAG, "dropMembership", (Throwable) e);
                        if (UdpSockets.this.mMulticastLock == null || !UdpSockets.this.mMulticastLock.isHeld()) {
                            return;
                        }
                    } catch (Throwable th) {
                        if (UdpSockets.this.mMulticastLock != null && UdpSockets.this.mMulticastLock.isHeld()) {
                            UdpSockets.this.mMulticastLock.release();
                        }
                        throw th;
                    }
                    UdpSockets.this.mMulticastLock.release();
                }
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void send(Integer num, String str, Integer num2, String str2, Callback callback) {
        final Integer num3 = num;
        final Callback callback2 = callback;
        final String str3 = str;
        final Integer num4 = num2;
        final String str4 = str2;
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* access modifiers changed from: protected */
            public void doInBackgroundGuarded(Void... voidArr) {
                UdpSocketClient access$100 = UdpSockets.this.findClient(num3, callback2);
                if (access$100 != null) {
                    try {
                        access$100.send(str3, num4, str4, callback2);
                    } catch (IllegalStateException e) {
                        callback2.invoke(UdpErrorUtil.getError((String) null, e.getMessage()));
                    } catch (UnknownHostException e2) {
                        callback2.invoke(UdpErrorUtil.getError((String) null, e2.getMessage()));
                    } catch (IOException e3) {
                        callback2.invoke(UdpErrorUtil.getError((String) null, e3.getMessage()));
                    }
                }
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void close(final Integer num, final Callback callback) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* access modifiers changed from: protected */
            public void doInBackgroundGuarded(Void... voidArr) {
                UdpSocketClient access$100 = UdpSockets.this.findClient(num, callback);
                if (access$100 != null) {
                    if (UdpSockets.this.mMulticastLock != null && UdpSockets.this.mMulticastLock.isHeld() && access$100.isMulticast()) {
                        UdpSockets.this.mMulticastLock.release();
                    }
                    try {
                        access$100.close();
                        callback.invoke(new Object[0]);
                    } catch (IOException e) {
                        callback.invoke(UdpErrorUtil.getError((String) null, e.getMessage()));
                    }
                    UdpSockets.this.mClients.remove(num.intValue());
                }
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void setBroadcast(Integer num, Boolean bool, Callback callback) {
        final Integer num2 = num;
        final Callback callback2 = callback;
        final Boolean bool2 = bool;
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* access modifiers changed from: protected */
            public void doInBackgroundGuarded(Void... voidArr) {
                UdpSocketClient access$100 = UdpSockets.this.findClient(num2, callback2);
                if (access$100 != null) {
                    try {
                        access$100.setBroadcast(bool2.booleanValue());
                        callback2.invoke(new Object[0]);
                    } catch (SocketException e) {
                        callback2.invoke(UdpErrorUtil.getError((String) null, e.getMessage()));
                    }
                }
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void didReceiveData(UdpSocketClient udpSocketClient, String str, String str2, int i) {
        final UdpSocketClient udpSocketClient2 = udpSocketClient;
        final String str3 = str;
        final String str4 = str2;
        final int i2 = i;
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* access modifiers changed from: protected */
            public void doInBackgroundGuarded(Void... voidArr) {
                int i = -1;
                for (int i2 = 0; i2 < UdpSockets.this.mClients.size(); i2++) {
                    i = UdpSockets.this.mClients.keyAt(i2);
                    if (udpSocketClient2.equals(UdpSockets.this.mClients.get(i))) {
                        break;
                    }
                }
                if (i != -1) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("data", str3);
                    createMap.putString(Contact.Type.address, str4);
                    createMap.putInt(ClientCookie.PORT_ATTR, i2);
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) UdpSockets.this.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("udp-" + i + "-data", createMap);
                }
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void didReceiveError(UdpSocketClient udpSocketClient, String str) {
        FLog.m622e(TAG, str);
    }

    public void didReceiveException(RuntimeException runtimeException) {
        getReactApplicationContext().handleException(runtimeException);
    }
}
