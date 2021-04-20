package com.yandex.metrica.push.impl;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

/* renamed from: com.yandex.metrica.push.impl.bl */
class C4362bl extends C4360bj {
    C4362bl(Context context) {
        this(context, new C4361bk(context));
    }

    C4362bl(Context context, C4368br brVar) {
        super(context, brVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public FirebaseApp mo41985a(FirebaseOptions firebaseOptions) {
        try {
            return FirebaseApp.initializeApp(mo41988c(), firebaseOptions, "METRICA_PUSH");
        } catch (Throwable unused) {
            return FirebaseApp.getInstance("METRICA_PUSH");
        }
    }
}
