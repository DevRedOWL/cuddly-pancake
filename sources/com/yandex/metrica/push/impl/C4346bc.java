package com.yandex.metrica.push.impl;

import com.yandex.metrica.push.impl.C4353bd;
import org.apache.commons.lang3.concurrent.AbstractCircuitBreaker;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.market.offer.OfferListFragment;

/* renamed from: com.yandex.metrica.push.impl.bc */
public class C4346bc extends C4353bd {

    /* renamed from: a */
    private final String f5445a;

    /* renamed from: b */
    private final C4347a f5446b;

    /* renamed from: com.yandex.metrica.push.impl.bc$b */
    public enum C4348b {
        RECEIVE("receive"),
        DISMISS("dismiss"),
        OPEN(AbstractCircuitBreaker.PROPERTY_NAME),
        f5451d("custom"),
        PROCESSED("processed"),
        SHOWN("shown"),
        IGNORED("ignored"),
        EXPIRED("expired"),
        REMOVED("removed");
        
        /* access modifiers changed from: private */

        /* renamed from: j */
        public final String f5458j;

        private C4348b(String str) {
            this.f5458j = str;
        }
    }

    C4346bc(String str, C4347a aVar) {
        super(C4353bd.C4354a.EVENT_NOTIFICATION);
        this.f5445a = str;
        this.f5446b = aVar;
    }

    /* renamed from: c */
    public String mo41979c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("notification_id", this.f5445a);
            jSONObject.put("action", this.f5446b.mo41981a());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: com.yandex.metrica.push.impl.bc$a */
    public static class C4347a {

        /* renamed from: a */
        private final C4348b f5447a;

        public C4347a(C4348b bVar) {
            this.f5447a = bVar;
        }

        /* renamed from: a */
        public JSONObject mo41981a() throws JSONException {
            return new JSONObject().put("type", this.f5447a.f5458j);
        }
    }

    /* renamed from: com.yandex.metrica.push.impl.bc$c */
    public static class C4349c extends C4347a {

        /* renamed from: a */
        private final String f5459a;

        public C4349c(String str) {
            super(C4348b.f5451d);
            this.f5459a = str;
        }

        /* renamed from: a */
        public JSONObject mo41981a() throws JSONException {
            return super.mo41981a().put("id", this.f5459a);
        }
    }

    /* renamed from: com.yandex.metrica.push.impl.bc$e */
    public static class C4351e extends C4347a {

        /* renamed from: a */
        private final String f5461a;

        /* renamed from: b */
        private final String f5462b;

        public C4351e(String str, String str2) {
            super(C4348b.IGNORED);
            this.f5461a = str;
            this.f5462b = str2;
        }

        /* renamed from: a */
        public JSONObject mo41981a() throws JSONException {
            return super.mo41981a().put(OfferListFragment.CATEGORY_TYPE, this.f5461a).put("details", this.f5462b);
        }
    }

    /* renamed from: com.yandex.metrica.push.impl.bc$f */
    public static class C4352f extends C4347a {

        /* renamed from: a */
        private final String f5463a;

        /* renamed from: b */
        private final String f5464b;

        public C4352f(String str, String str2) {
            super(C4348b.REMOVED);
            this.f5463a = str;
            this.f5464b = str2;
        }

        /* renamed from: a */
        public JSONObject mo41981a() throws JSONException {
            return super.mo41981a().put(OfferListFragment.CATEGORY_TYPE, this.f5463a).put("details", this.f5464b);
        }
    }

    /* renamed from: com.yandex.metrica.push.impl.bc$d */
    public static class C4350d extends C4347a {

        /* renamed from: a */
        private final String f5460a;

        public C4350d(String str) {
            super(C4348b.EXPIRED);
            this.f5460a = str;
        }

        /* renamed from: a */
        public JSONObject mo41981a() throws JSONException {
            return super.mo41981a().put(OfferListFragment.CATEGORY_TYPE, this.f5460a);
        }
    }
}
