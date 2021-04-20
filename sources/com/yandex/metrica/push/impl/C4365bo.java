package com.yandex.metrica.push.impl;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

/* renamed from: com.yandex.metrica.push.impl.bo */
class C4365bo extends C4360bj {
    C4365bo(Context context) {
        this(context, new C4363bm(context));
    }

    C4365bo(Context context, C4368br brVar) {
        super(context, brVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public FirebaseApp mo41985a(FirebaseOptions firebaseOptions) {
        try {
            return FirebaseApp.initializeApp(mo41988c(), firebaseOptions);
        } catch (Throwable unused) {
            return FirebaseApp.getInstance();
        }
    }
}
