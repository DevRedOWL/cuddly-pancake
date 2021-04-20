package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
final /* synthetic */ class zabt implements Runnable {
    private final NonGmsServiceBrokerClient zaa;

    zabt(NonGmsServiceBrokerClient nonGmsServiceBrokerClient) {
        this.zaa = nonGmsServiceBrokerClient;
    }

    public final void run() {
        this.zaa.zaa();
    }
}
