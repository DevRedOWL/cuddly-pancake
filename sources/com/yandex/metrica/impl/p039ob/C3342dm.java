package com.yandex.metrica.impl.p039ob;

import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import com.yandex.metrica.C3091d;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.dm */
public class C3342dm {

    /* renamed from: a */
    private final Context f3065a;

    /* renamed from: b */
    private final C3338dj f3066b;

    /* renamed from: c */
    private final LruCache<String, Long> f3067c;

    /* renamed from: d */
    private final C4228wh f3068d;

    /* renamed from: e */
    private final long f3069e;

    public C3342dm(Context context, long j) {
        this(context, j, new C3338dj(), new C4227wg());
    }

    /* renamed from: a */
    public void mo39913a(int i) {
        try {
            C4085tl.m5459a(this.f3065a).reportEvent("beacon_scan_error", this.f3066b.mo39907a(i).toString());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo39915a(List<ScanResult> list) {
        boolean z;
        Iterator<ScanResult> it = list.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                } else if (m3025b(it.next(), (Integer) null) || z) {
                    z = true;
                }
            }
        }
        if (z) {
            m3023a().sendEventsBuffer();
        }
    }

    /* renamed from: a */
    public void mo39914a(ScanResult scanResult, Integer num) {
        if (m3025b(scanResult, num)) {
            m3023a().sendEventsBuffer();
        }
    }

    /* renamed from: b */
    private boolean m3025b(ScanResult scanResult, Integer num) {
        try {
            if (!m3024a(scanResult)) {
                return false;
            }
            m3023a().reportEvent("beacon_scan_result", this.f3066b.mo39908a(scanResult, num).toString());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private C3091d m3023a() {
        return C4085tl.m5459a(this.f3065a);
    }

    /* renamed from: a */
    private boolean m3024a(ScanResult scanResult) {
        boolean z = false;
        if (scanResult.getDevice() != null) {
            String address = scanResult.getDevice().getAddress();
            long a = this.f3068d.mo41768a();
            if (!TextUtils.isEmpty(address)) {
                Long l = this.f3067c.get(address);
                if (l == null || a - l.longValue() > this.f3069e) {
                    z = true;
                }
                if (z) {
                    this.f3067c.put(address, Long.valueOf(a));
                }
            }
        }
        return z;
    }

    C3342dm(Context context, long j, C3338dj djVar, C4228wh whVar) {
        this.f3065a = context;
        this.f3069e = j;
        this.f3066b = djVar;
        this.f3068d = whVar;
        this.f3067c = new LruCache<>(1000);
    }
}
