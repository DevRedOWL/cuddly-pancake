package com.yandex.metrica.impl.p039ob;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.dl */
public class C3341dl extends ScanCallback {

    /* renamed from: a */
    private final C3342dm f3064a;

    public C3341dl(Context context, long j) {
        this(new C3342dm(context, j));
    }

    public void onScanResult(int i, ScanResult scanResult) {
        super.onScanResult(i, scanResult);
        this.f3064a.mo39914a(scanResult, Integer.valueOf(i));
    }

    public void onBatchScanResults(List<ScanResult> list) {
        super.onBatchScanResults(list);
        this.f3064a.mo39915a(list);
    }

    public void onScanFailed(int i) {
        super.onScanFailed(i);
        this.f3064a.mo39913a(i);
    }

    C3341dl(C3342dm dmVar) {
        this.f3064a = dmVar;
    }
}
