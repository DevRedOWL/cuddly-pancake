package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zab;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
final class zaak extends zab {
    private final WeakReference<zaaf> zaa;

    zaak(zaaf zaaf) {
        this.zaa = new WeakReference<>(zaaf);
    }

    public final void zaa(zak zak) {
        zaaf zaaf = (zaaf) this.zaa.get();
        if (zaaf != null) {
            zaaf.zaa.zaa((zaay) new zaan(this, zaaf, zaaf, zak));
        }
    }
}
