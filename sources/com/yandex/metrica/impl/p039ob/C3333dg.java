package com.yandex.metrica.impl.p039ob;

import android.app.PendingIntent;
import android.bluetooth.le.BluetoothLeScanner;
import android.content.Context;
import android.content.Intent;
import com.yandex.metrica.ConfigurationServiceReceiver;

/* renamed from: com.yandex.metrica.impl.ob.dg */
public class C3333dg implements C3336dh {

    /* renamed from: a */
    private final C3326dd f3052a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3339dk f3053b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3337di f3054c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final PendingIntent f3055d;

    public C3333dg(Context context) {
        this(new C3326dd(context), new C3339dk(), new C3337di(), PendingIntent.getBroadcast(context.getApplicationContext(), 7695436, new Intent("com.yandex.metrica.configuration.service.PLC").setClass(context, ConfigurationServiceReceiver.class), 134217728));
    }

    /* renamed from: a */
    public synchronized void mo39900a(final C4107tt ttVar) {
        BluetoothLeScanner a = this.f3052a.mo39895a();
        if (a != null) {
            mo39899a();
            Integer num = (Integer) C3306cx.m2841a(new C4236wo<BluetoothLeScanner, Integer>() {
                /* renamed from: a */
                public Integer mo39698a(BluetoothLeScanner bluetoothLeScanner) throws Exception {
                    return Integer.valueOf(bluetoothLeScanner.startScan(C3333dg.this.f3054c.mo39906a(ttVar.f4955b), C3333dg.this.f3053b.mo39909a(ttVar.f4954a), C3333dg.this.f3055d));
                }
            }, a, "startScan", "BluetoothLeScanner");
        }
    }

    /* renamed from: a */
    public synchronized void mo39899a() {
        BluetoothLeScanner a = this.f3052a.mo39895a();
        if (a != null) {
            C3306cx.m2854a(new C4235wn<BluetoothLeScanner>() {
                /* renamed from: a */
                public void mo39902a(BluetoothLeScanner bluetoothLeScanner) {
                    bluetoothLeScanner.stopScan(C3333dg.this.f3055d);
                }
            }, a, "stopScan", "BluetoothLeScanner");
        }
    }

    public C3333dg(C3326dd ddVar, C3339dk dkVar, C3337di diVar, PendingIntent pendingIntent) {
        this.f3052a = ddVar;
        this.f3053b = dkVar;
        this.f3054c = diVar;
        this.f3055d = pendingIntent;
    }
}
