package com.yandex.metrica.impl.p039ob;

import android.telephony.SubscriptionInfo;

/* renamed from: com.yandex.metrica.impl.ob.vb */
public final class C4185vb {

    /* renamed from: a */
    private final Integer f5223a;

    /* renamed from: b */
    private final Integer f5224b;

    /* renamed from: c */
    private final boolean f5225c;

    /* renamed from: d */
    private final String f5226d;

    /* renamed from: e */
    private final String f5227e;

    public C4185vb(Integer num, Integer num2, boolean z, String str, String str2) {
        this.f5223a = num;
        this.f5224b = num2;
        this.f5225c = z;
        this.f5226d = str;
        this.f5227e = str2;
    }

    public C4185vb(SubscriptionInfo subscriptionInfo) {
        this.f5223a = Integer.valueOf(subscriptionInfo.getMcc());
        this.f5224b = Integer.valueOf(subscriptionInfo.getMnc());
        this.f5225c = subscriptionInfo.getDataRoaming() != 1 ? false : true;
        this.f5226d = subscriptionInfo.getCarrierName().toString();
        this.f5227e = subscriptionInfo.getIccId();
    }

    /* renamed from: a */
    public Integer mo41664a() {
        return this.f5223a;
    }

    /* renamed from: b */
    public Integer mo41665b() {
        return this.f5224b;
    }

    /* renamed from: c */
    public boolean mo41666c() {
        return this.f5225c;
    }

    /* renamed from: d */
    public String mo41667d() {
        return this.f5226d;
    }

    /* renamed from: e */
    public String mo41668e() {
        return this.f5227e;
    }
}
