package com.yandex.metrica.impl.p039ob;

import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.content.Context;
import com.yandex.metrica.impl.p039ob.C3929rr;

/* renamed from: com.yandex.metrica.impl.ob.df */
public class C3330df implements C3336dh {

    /* renamed from: g */
    private static final long f3042g = new C3929rr.C3930a.C3933b().f4474d;

    /* renamed from: a */
    private final Context f3043a;

    /* renamed from: b */
    private final C3326dd f3044b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3339dk f3045c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3337di f3046d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ScanCallback f3047e;

    /* renamed from: f */
    private long f3048f;

    public C3330df(Context context) {
        this(context, new C3326dd(context), new C3339dk(), new C3337di(), new C3341dl(context, f3042g));
    }

    /* renamed from: a */
    public synchronized void mo39900a(final C4107tt ttVar) {
        BluetoothLeScanner a = this.f3044b.mo39895a();
        if (a != null) {
            mo39899a();
            long j = ttVar.f4956c;
            if (this.f3048f != j) {
                this.f3048f = j;
                this.f3047e = new C3341dl(this.f3043a, this.f3048f);
            }
            C3306cx.m2854a(new C4235wn<BluetoothLeScanner>() {
                /* renamed from: a */
                public void mo39902a(BluetoothLeScanner bluetoothLeScanner) {
                    bluetoothLeScanner.startScan(C3330df.this.f3046d.mo39906a(ttVar.f4955b), C3330df.this.f3045c.mo39909a(ttVar.f4954a), C3330df.this.f3047e);
                }
            }, a, "startScan", "BluetoothLeScanner");
        }
    }

    /* renamed from: a */
    public synchronized void mo39899a() {
        BluetoothLeScanner a = this.f3044b.mo39895a();
        if (a != null) {
            C3306cx.m2854a(new C4235wn<BluetoothLeScanner>() {
                /* renamed from: a */
                public void mo39902a(BluetoothLeScanner bluetoothLeScanner) {
                    bluetoothLeScanner.stopScan(C3330df.this.f3047e);
                }
            }, a, "stopScan", "BluetoothLeScanner");
        }
    }

    public C3330df(Context context, C3326dd ddVar, C3339dk dkVar, C3337di diVar, ScanCallback scanCallback) {
        this.f3048f = f3042g;
        this.f3043a = context;
        this.f3044b = ddVar;
        this.f3045c = dkVar;
        this.f3046d = diVar;
        this.f3047e = scanCallback;
    }
}
