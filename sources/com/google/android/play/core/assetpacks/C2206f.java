package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.OnSuccessListener;
import java.util.List;

/* renamed from: com.google.android.play.core.assetpacks.f */
final /* synthetic */ class C2206f implements OnSuccessListener {

    /* renamed from: a */
    private final C2138at f1829a;

    private C2206f(C2138at atVar) {
        this.f1829a = atVar;
    }

    /* renamed from: a */
    static OnSuccessListener m1072a(C2138at atVar) {
        return new C2206f(atVar);
    }

    public final void onSuccess(Object obj) {
        this.f1829a.mo33630A((List) obj);
    }
}
