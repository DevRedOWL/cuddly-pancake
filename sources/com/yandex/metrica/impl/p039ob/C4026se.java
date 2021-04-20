package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.IReporter;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.se */
public class C4026se implements IReporter {

    /* renamed from: a */
    static final C4289yk<String> f4729a = new C4285yg(new C4283ye("Event name"));

    /* renamed from: b */
    static final C4289yk<String> f4730b = new C4285yg(new C4283ye("Error message"));

    /* renamed from: c */
    static final C4289yk<Throwable> f4731c = new C4285yg(new C4284yf("Unhandled exception"));

    /* renamed from: d */
    static final C4289yk<UserProfile> f4732d = new C4285yg(new C4284yf("User profile"));

    /* renamed from: e */
    static final C4289yk<Revenue> f4733e = new C4285yg(new C4284yf("Revenue"));

    public void pauseSession() {
    }

    public void resumeSession() {
    }

    public void sendEventsBuffer() {
    }

    public void setStatisticsSending(boolean z) {
    }

    public void setUserProfileID(String str) {
    }

    public void reportEvent(String str) throws C4286yh {
        f4729a.mo40671a(str);
    }

    public void reportEvent(String str, String str2) throws C4286yh {
        f4729a.mo40671a(str);
    }

    public void reportEvent(String str, Map<String, Object> map) throws C4286yh {
        f4729a.mo40671a(str);
    }

    public void reportError(String str, Throwable th) throws C4286yh {
        f4730b.mo40671a(str);
    }

    public void reportUnhandledException(Throwable th) throws C4286yh {
        f4731c.mo40671a(th);
    }

    public void reportUserProfile(UserProfile userProfile) throws C4286yh {
        f4732d.mo40671a(userProfile);
    }

    public void reportRevenue(Revenue revenue) throws C4286yh {
        f4733e.mo40671a(revenue);
    }
}
