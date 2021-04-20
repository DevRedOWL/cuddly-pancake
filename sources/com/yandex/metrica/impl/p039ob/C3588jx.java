package com.yandex.metrica.impl.p039ob;

import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.jx */
public class C3588jx extends C3590jy {

    /* renamed from: a */
    private final C4257xh f3521a;

    /* renamed from: b */
    private C3343dn f3522b;

    /* renamed from: c */
    private C4123tw f3523c;

    public C3588jx(Context context, C4257xh xhVar) {
        this(context, xhVar, new C3343dn(), new C4123tw());
    }

    /* renamed from: a */
    public void mo40339a(Bundle bundle, C3587jw jwVar) {
        if (bundle == null || bundle.isEmpty()) {
            m3680a(jwVar);
            return;
        }
        int i = bundle.getInt("android.bluetooth.le.extra.ERROR_CODE", Integer.MIN_VALUE);
        int i2 = bundle.getInt("android.bluetooth.le.extra.CALLBACK_TYPE", Integer.MIN_VALUE);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("android.bluetooth.le.extra.LIST_SCAN_RESULT");
        C4107tt ttVar = this.f3523c.mo41523a(mo40341a()).f5086G;
        if (ttVar != null) {
            C3342dm a = this.f3522b.mo39916a(mo40341a(), ttVar.f4956c);
            if (i > 0) {
                m3677a(a, i);
            } else if (!C3306cx.m2861a((Collection) parcelableArrayList)) {
                if (parcelableArrayList.size() == 1) {
                    m3678a(a, (ScanResult) parcelableArrayList.get(0), i2);
                } else {
                    m3679a(a, (List<ScanResult>) parcelableArrayList);
                }
            }
            m3681b(jwVar);
            return;
        }
        m3680a(jwVar);
    }

    /* renamed from: a */
    private void m3679a(C3342dm dmVar, List<ScanResult> list) {
        dmVar.mo39915a(list);
    }

    /* renamed from: a */
    private void m3678a(C3342dm dmVar, ScanResult scanResult, int i) {
        dmVar.mo39914a(scanResult, i > 0 ? Integer.valueOf(i) : null);
    }

    /* renamed from: a */
    private void m3677a(C3342dm dmVar, int i) {
        dmVar.mo39913a(i);
    }

    /* renamed from: a */
    private void m3680a(C3587jw jwVar) {
        if (jwVar != null) {
            jwVar.mo39216a();
        }
    }

    /* renamed from: b */
    private void m3681b(final C3587jw jwVar) {
        if (jwVar != null) {
            this.f3521a.mo41809a(new Runnable() {
                public void run() {
                    jwVar.mo39216a();
                }
            }, TimeUnit.SECONDS.toMillis(5));
        }
    }

    public C3588jx(Context context, C4257xh xhVar, C3343dn dnVar, C4123tw twVar) {
        super(context);
        this.f3521a = xhVar;
        this.f3522b = dnVar;
        this.f3523c = twVar;
    }
}
