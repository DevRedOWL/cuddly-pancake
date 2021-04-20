package com.yandex.metrica.impl.p039ob;

import android.location.Location;
import android.os.ResultReceiver;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p039ob.C4056su;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.eg */
public class C3373eg {

    /* renamed from: a */
    public final C4056su.C4058a f3104a;

    /* renamed from: b */
    public final C3374a f3105b;

    /* renamed from: c */
    public final ResultReceiver f3106c;

    public C3373eg(C3369ed edVar) {
        this(new C4056su.C4058a(edVar), new C3374a(edVar.mo39947h(), edVar.mo39946g().mo39956c()), edVar.mo39946g().mo39963i());
    }

    public C3373eg(C4056su.C4058a aVar, C3374a aVar2, ResultReceiver resultReceiver) {
        this.f3104a = aVar;
        this.f3105b = aVar2;
        this.f3106c = resultReceiver;
    }

    /* renamed from: com.yandex.metrica.impl.ob.eg$a */
    public static class C3374a implements C4038sm<C3374a, C3374a> {

        /* renamed from: a */
        public final String f3107a;

        /* renamed from: b */
        public final String f3108b;

        /* renamed from: c */
        public final String f3109c;

        /* renamed from: d */
        public final String f3110d;

        /* renamed from: e */
        public final Boolean f3111e;

        /* renamed from: f */
        public final Location f3112f;

        /* renamed from: g */
        public final Boolean f3113g;

        /* renamed from: h */
        public final Boolean f3114h;

        /* renamed from: i */
        public final Integer f3115i;

        /* renamed from: j */
        public final Integer f3116j;

        /* renamed from: k */
        public final Integer f3117k;

        /* renamed from: l */
        public final Boolean f3118l;

        /* renamed from: m */
        public final Boolean f3119m;

        /* renamed from: n */
        public final Boolean f3120n;

        /* renamed from: o */
        public final Map<String, String> f3121o;

        /* renamed from: p */
        public final Integer f3122p;

        /* renamed from: q */
        public final Boolean f3123q;

        C3374a(String str, String str2, String str3, String str4, Boolean bool, Location location, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, Integer num3, Boolean bool5, Boolean bool6, Map<String, String> map, Integer num4, Boolean bool7) {
            this.f3107a = str;
            this.f3108b = str2;
            this.f3109c = str3;
            this.f3110d = str4;
            this.f3111e = bool;
            this.f3112f = location;
            this.f3113g = bool2;
            this.f3114h = bool3;
            this.f3120n = bool4;
            this.f3115i = num;
            this.f3116j = num2;
            this.f3117k = num3;
            this.f3118l = bool5;
            this.f3119m = bool6;
            this.f3121o = map;
            this.f3122p = num4;
            this.f3123q = bool7;
        }

        public C3374a(CounterConfiguration counterConfiguration, Map<String, String> map) {
            this(counterConfiguration.mo39237d(), counterConfiguration.mo39246g(), counterConfiguration.mo39248h(), counterConfiguration.mo39242e(), counterConfiguration.mo39244f(), counterConfiguration.mo39251k(), counterConfiguration.mo39254n(), counterConfiguration.mo39252l(), counterConfiguration.mo39249i(), counterConfiguration.mo39233c(), counterConfiguration.mo39228b(), counterConfiguration.mo39221a(), counterConfiguration.mo39250j(), counterConfiguration.mo39256p(), map, counterConfiguration.mo39255o(), counterConfiguration.mo39253m());
        }

        public C3374a() {
            this((String) null, (String) null, (String) null, (String) null, (Boolean) null, (Location) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Boolean) null, (Boolean) null, (Map<String, String>) null, (Integer) null, (Boolean) null);
        }

        /* renamed from: a */
        public C3374a mo39973b(C3374a aVar) {
            C3374a aVar2 = aVar;
            return new C3374a((String) C4232wk.m6038a(this.f3107a, aVar2.f3107a), (String) C4232wk.m6038a(this.f3108b, aVar2.f3108b), (String) C4232wk.m6038a(this.f3109c, aVar2.f3109c), (String) C4232wk.m6038a(this.f3110d, aVar2.f3110d), (Boolean) C4232wk.m6038a(this.f3111e, aVar2.f3111e), (Location) C4232wk.m6038a(this.f3112f, aVar2.f3112f), (Boolean) C4232wk.m6038a(this.f3113g, aVar2.f3113g), (Boolean) C4232wk.m6038a(this.f3114h, aVar2.f3114h), (Boolean) C4232wk.m6038a(this.f3120n, aVar2.f3120n), (Integer) C4232wk.m6038a(this.f3115i, aVar2.f3115i), (Integer) C4232wk.m6038a(this.f3116j, aVar2.f3116j), (Integer) C4232wk.m6038a(this.f3117k, aVar2.f3117k), (Boolean) C4232wk.m6038a(this.f3118l, aVar2.f3118l), (Boolean) C4232wk.m6038a(this.f3119m, aVar2.f3119m), (Map) C4232wk.m6038a(this.f3121o, aVar2.f3121o), (Integer) C4232wk.m6038a(this.f3122p, aVar2.f3122p), (Boolean) C4232wk.m6038a(this.f3123q, aVar2.f3123q));
        }

        /* renamed from: b */
        public boolean mo39972a(C3374a aVar) {
            return equals(aVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C3374a aVar = (C3374a) obj;
            String str = this.f3107a;
            if (str == null ? aVar.f3107a != null : !str.equals(aVar.f3107a)) {
                return false;
            }
            String str2 = this.f3108b;
            if (str2 == null ? aVar.f3108b != null : !str2.equals(aVar.f3108b)) {
                return false;
            }
            String str3 = this.f3109c;
            if (str3 == null ? aVar.f3109c != null : !str3.equals(aVar.f3109c)) {
                return false;
            }
            String str4 = this.f3110d;
            if (str4 == null ? aVar.f3110d != null : !str4.equals(aVar.f3110d)) {
                return false;
            }
            Boolean bool = this.f3111e;
            if (bool == null ? aVar.f3111e != null : !bool.equals(aVar.f3111e)) {
                return false;
            }
            Location location = this.f3112f;
            if (location == null ? aVar.f3112f != null : !location.equals(aVar.f3112f)) {
                return false;
            }
            Boolean bool2 = this.f3113g;
            if (bool2 == null ? aVar.f3113g != null : !bool2.equals(aVar.f3113g)) {
                return false;
            }
            Boolean bool3 = this.f3114h;
            if (bool3 == null ? aVar.f3114h != null : !bool3.equals(aVar.f3114h)) {
                return false;
            }
            Integer num = this.f3115i;
            if (num == null ? aVar.f3115i != null : !num.equals(aVar.f3115i)) {
                return false;
            }
            Integer num2 = this.f3116j;
            if (num2 == null ? aVar.f3116j != null : !num2.equals(aVar.f3116j)) {
                return false;
            }
            Integer num3 = this.f3117k;
            if (num3 == null ? aVar.f3117k != null : !num3.equals(aVar.f3117k)) {
                return false;
            }
            Boolean bool4 = this.f3118l;
            if (bool4 == null ? aVar.f3118l != null : !bool4.equals(aVar.f3118l)) {
                return false;
            }
            Boolean bool5 = this.f3119m;
            if (bool5 == null ? aVar.f3119m != null : !bool5.equals(aVar.f3119m)) {
                return false;
            }
            Boolean bool6 = this.f3120n;
            if (bool6 == null ? aVar.f3120n != null : !bool6.equals(aVar.f3120n)) {
                return false;
            }
            Map<String, String> map = this.f3121o;
            if (map == null ? aVar.f3121o != null : !map.equals(aVar.f3121o)) {
                return false;
            }
            Integer num4 = this.f3122p;
            if (num4 == null ? aVar.f3122p != null : !num4.equals(aVar.f3122p)) {
                return false;
            }
            Boolean bool7 = this.f3123q;
            Boolean bool8 = aVar.f3123q;
            if (bool7 != null) {
                return bool7.equals(bool8);
            }
            if (bool8 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f3107a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f3108b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f3109c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f3110d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            Boolean bool = this.f3111e;
            int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
            Location location = this.f3112f;
            int hashCode6 = (hashCode5 + (location != null ? location.hashCode() : 0)) * 31;
            Boolean bool2 = this.f3113g;
            int hashCode7 = (hashCode6 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            Boolean bool3 = this.f3114h;
            int hashCode8 = (hashCode7 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
            Integer num = this.f3115i;
            int hashCode9 = (hashCode8 + (num != null ? num.hashCode() : 0)) * 31;
            Integer num2 = this.f3116j;
            int hashCode10 = (hashCode9 + (num2 != null ? num2.hashCode() : 0)) * 31;
            Integer num3 = this.f3117k;
            int hashCode11 = (hashCode10 + (num3 != null ? num3.hashCode() : 0)) * 31;
            Boolean bool4 = this.f3118l;
            int hashCode12 = (hashCode11 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
            Boolean bool5 = this.f3119m;
            int hashCode13 = (hashCode12 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
            Boolean bool6 = this.f3120n;
            int hashCode14 = (hashCode13 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
            Map<String, String> map = this.f3121o;
            int hashCode15 = (hashCode14 + (map != null ? map.hashCode() : 0)) * 31;
            Integer num4 = this.f3122p;
            int hashCode16 = (hashCode15 + (num4 != null ? num4.hashCode() : 0)) * 31;
            Boolean bool7 = this.f3123q;
            if (bool7 != null) {
                i = bool7.hashCode();
            }
            return hashCode16 + i;
        }
    }
}
