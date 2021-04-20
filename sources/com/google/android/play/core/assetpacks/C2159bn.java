package com.google.android.play.core.assetpacks;

import com.github.mikephil.charting.utils.Utils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.bn */
final class C2159bn {

    /* renamed from: a */
    private final Map<String, Double> f1668a = new HashMap();

    C2159bn() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo33696a(String str) {
        this.f1668a.put(str, Double.valueOf(Utils.DOUBLE_EPSILON));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized double mo33697b(String str) {
        Double d = this.f1668a.get(str);
        if (d == null) {
            return Utils.DOUBLE_EPSILON;
        }
        return d.doubleValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized double mo33698c(String str, C2174cb cbVar) {
        double d;
        d = (((double) ((C2153bh) cbVar).f1630e) + 1.0d) / ((double) ((C2153bh) cbVar).f1631f);
        this.f1668a.put(str, Double.valueOf(d));
        return d;
    }
}
