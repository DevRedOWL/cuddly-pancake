package com.yandex.metrica.push.impl;

import android.location.Location;
import com.yandex.metrica.push.impl.C4386e;
import com.yandex.metrica.push.impl.C4397m;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.push.impl.al */
class C4325al implements C4386e {

    /* renamed from: a */
    private static final long f5424a = TimeUnit.DAYS.toSeconds(1);

    /* renamed from: b */
    private static final Location f5425b = new Location("");

    /* renamed from: c */
    private final C4389f f5426c;

    public C4325al(C4389f fVar) {
        this.f5426c = fVar;
    }

    /* renamed from: a */
    public C4386e.C4387a mo41961a(C4402o oVar) {
        C4397m.C4398a aVar;
        List<Location> list;
        boolean z;
        boolean z2;
        Location next;
        C4397m g = oVar.mo42126g();
        if (g == null) {
            aVar = null;
        } else {
            aVar = g.mo42093e();
        }
        if (aVar == null) {
            list = null;
        } else {
            list = aVar.mo42102b();
        }
        if (list == null || list.isEmpty()) {
            return C4386e.C4387a.m6482a();
        }
        C4343b l = this.f5426c.mo42037l();
        if (l == null) {
            return C4386e.C4387a.m6483a("Not found location provider", (String) null);
        }
        Integer a = aVar.mo42101a();
        int intValue = a != null ? a.intValue() : MessageHandler.WHAT_SMOOTH_SCROLL;
        Long f = g.mo42094f();
        long longValue = f != null ? f.longValue() : f5424a;
        Integer g2 = g.mo42095g();
        int intValue2 = g2 != null ? g2.intValue() : 500;
        Boolean h = g.mo42096h();
        if (h != null) {
            z = h.booleanValue();
        } else {
            z = true;
        }
        Location a2 = m6307a(l, z, longValue);
        if (a2 == f5425b) {
            return C4386e.C4387a.m6483a("Unknown location", "Request for location expired by timeout");
        }
        if (a2 == null) {
            return C4386e.C4387a.m6483a("Unknown location", "Location provider returned null");
        }
        if (a2.getAccuracy() > ((float) intValue2)) {
            return C4386e.C4387a.m6483a("Non accurate location", String.format(Locale.ENGLISH, "Got accuracy [%f], max allowed [%d]", new Object[]{Float.valueOf(a2.getAccuracy()), Integer.valueOf(intValue2)}));
        }
        Iterator<Location> it = list.iterator();
        while (true) {
            if (it.hasNext() && (next = it.next()) != null) {
                if (a2.distanceTo(next) <= ((float) intValue)) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
            }
        }
        z2 = false;
        if (z2) {
            return C4386e.C4387a.m6482a();
        }
        return C4386e.C4387a.m6483a("Wrong location", String.format(Locale.ENGLISH, "Wrong location: device [%s], radius [%d]", new Object[]{a2, Integer.valueOf(intValue)}));
    }

    /* renamed from: a */
    private static Location m6307a(C4343b bVar, boolean z, long j) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Location[] locationArr = {f5425b};
        final C4343b bVar2 = bVar;
        final boolean z2 = z;
        final long j2 = j;
        final Location[] locationArr2 = locationArr;
        final CountDownLatch countDownLatch2 = countDownLatch;
        new Thread(new Runnable() {
            public void run() {
                new Object() {
                };
            }
        }).start();
        try {
            countDownLatch.await(30, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        return locationArr[0];
    }
}
