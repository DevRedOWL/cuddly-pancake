package com.yandex.metrica.impl.p039ob;

import android.content.pm.FeatureInfo;

/* renamed from: com.yandex.metrica.impl.ob.oa */
public abstract class C3764oa {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C3768ob mo40733a(FeatureInfo featureInfo);

    /* renamed from: b */
    public C3768ob mo40734b(FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return mo40733a(featureInfo);
        }
        if (featureInfo.reqGlEsVersion == 0) {
            return mo40733a(featureInfo);
        }
        return new C3768ob("openGlFeature", featureInfo.reqGlEsVersion, mo40735c(featureInfo));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo40735c(FeatureInfo featureInfo) {
        return (featureInfo.flags & 1) != 0;
    }

    /* renamed from: com.yandex.metrica.impl.ob.oa$a */
    public static class C3765a {
        /* renamed from: a */
        public static C3764oa m4315a() {
            if (C3306cx.m2857a(24)) {
                return new C3766b();
            }
            return new C3767c();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.oa$b */
    public static class C3766b extends C3764oa {
        /* renamed from: a */
        public C3768ob mo40733a(FeatureInfo featureInfo) {
            return new C3768ob(featureInfo.name, featureInfo.version, mo40735c(featureInfo));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.oa$c */
    public static class C3767c extends C3764oa {
        /* renamed from: a */
        public C3768ob mo40733a(FeatureInfo featureInfo) {
            return new C3768ob(featureInfo.name, mo40735c(featureInfo));
        }
    }
}
