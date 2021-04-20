package com.yandex.metrica.impl.p039ob;

import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.CasioType2MakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusCameraSettingsMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusFocusInfoMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusImageProcessingMakernoteDirectory;
import com.yandex.metrica.impl.p039ob.C3869r;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.concurrent.AbstractCircuitBreaker;

/* renamed from: com.yandex.metrica.impl.ob.af */
public final class C3125af {

    /* renamed from: a */
    public static final EnumSet<C3126a> f2495a = EnumSet.of(C3126a.EVENT_TYPE_INIT, new C3126a[]{C3126a.EVENT_TYPE_FIRST_ACTIVATION, C3126a.EVENT_TYPE_REFERRER_RECEIVED_FROM_BROADCAST, C3126a.EVENT_TYPE_SEND_REFERRER, C3126a.EVENT_TYPE_APP_UPDATE, C3126a.EVENT_TYPE_CLEANUP});

    /* renamed from: b */
    private static final EnumSet<C3126a> f2496b = EnumSet.of(C3126a.EVENT_TYPE_UNDEFINED, new C3126a[]{C3126a.EVENT_TYPE_PURGE_BUFFER, C3126a.EVENT_TYPE_REFERRER_RECEIVED_FROM_BROADCAST, C3126a.EVENT_TYPE_SEND_REFERRER, C3126a.EVENT_TYPE_APP_ENVIRONMENT_UPDATED, C3126a.EVENT_TYPE_APP_ENVIRONMENT_CLEARED, C3126a.EVENT_TYPE_ACTIVATION, C3126a.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH});

    /* renamed from: c */
    private static final EnumSet<C3126a> f2497c = EnumSet.of(C3126a.EVENT_TYPE_SET_USER_INFO, new C3126a[]{C3126a.EVENT_TYPE_REPORT_USER_INFO, C3126a.EVENT_TYPE_IDENTITY, C3126a.EVENT_TYPE_UNDEFINED, C3126a.EVENT_TYPE_INIT, C3126a.EVENT_TYPE_APP_UPDATE, C3126a.EVENT_TYPE_SEND_REFERRER, C3126a.EVENT_TYPE_ALIVE, C3126a.EVENT_TYPE_STARTUP, C3126a.EVENT_TYPE_APP_ENVIRONMENT_UPDATED, C3126a.EVENT_TYPE_APP_ENVIRONMENT_CLEARED, C3126a.EVENT_TYPE_ACTIVATION, C3126a.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH});

    /* renamed from: d */
    private static final EnumSet<C3126a> f2498d = EnumSet.of(C3126a.EVENT_TYPE_UPDATE_FOREGROUND_TIME, C3126a.EVENT_TYPE_SET_USER_INFO, C3126a.EVENT_TYPE_REPORT_USER_INFO, C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE);

    /* renamed from: e */
    private static final EnumSet<C3126a> f2499e = EnumSet.of(C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED, new C3126a[]{C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, C3126a.EVENT_TYPE_EXCEPTION_USER, C3126a.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, C3126a.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH, C3126a.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH, C3126a.EVENT_TYPE_REGULAR});

    /* renamed from: f */
    private static final EnumSet<C3126a> f2500f = EnumSet.of(C3126a.EVENT_TYPE_DIAGNOSTIC, C3126a.EVENT_TYPE_DIAGNOSTIC_STATBOX, C3126a.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING);

    /* renamed from: g */
    private static final EnumSet<C3126a> f2501g = EnumSet.of(C3126a.EVENT_TYPE_REGULAR);

    /* renamed from: h */
    private static final EnumSet<C3126a> f2502h = EnumSet.of(C3126a.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH);

    /* renamed from: com.yandex.metrica.impl.ob.af$a */
    public enum C3126a {
        EVENT_TYPE_UNDEFINED(-1, "Unrecognized action"),
        EVENT_TYPE_INIT(0, "First initialization event"),
        EVENT_TYPE_REGULAR(1, "Regular event"),
        EVENT_TYPE_UPDATE_FOREGROUND_TIME(3, "Update foreground time"),
        EVENT_TYPE_EXCEPTION_USER(5, "Error from developer"),
        EVENT_TYPE_ALIVE(7, "App is still alive"),
        EVENT_TYPE_SET_USER_INFO(9, "User info"),
        EVENT_TYPE_REPORT_USER_INFO(10, "Report user info"),
        EVENT_TYPE_SEND_USER_PROFILE(40961, "Send user profile"),
        EVENT_TYPE_SET_USER_PROFILE_ID(ExifDirectoryBase.TAG_EXIF_IMAGE_WIDTH, "Set user profile ID"),
        EVENT_TYPE_SEND_REVENUE_EVENT(40976, "Send revenue event"),
        EVENT_TYPE_PURGE_BUFFER(256, "Forcible buffer clearing"),
        EVENT_TYPE_PREV_SESSION_NATIVE_CRASH(768, "Native crash of app, read from file"),
        EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH(769, "Native crash of app, caught by FileObserver"),
        EVENT_TYPE_STARTUP(1536, "Sending the startup due to lack of data"),
        EVENT_TYPE_IDENTITY(1792, "System identification"),
        EVENT_TYPE_IDENTITY_LIGHT(1793, "Identity light"),
        EVENT_TYPE_DIAGNOSTIC(2048, "Diagnostic event"),
        EVENT_TYPE_DIAGNOSTIC_STATBOX(2049, "Diagnostic statbox event"),
        EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING(2050, "Disable stat send"),
        EVENT_TYPE_STATBOX(OlympusCameraSettingsMakernoteDirectory.TagManometerPressure, "Event with statistical data"),
        EVENT_TYPE_REFERRER_RECEIVED_FROM_BROADCAST(4096, "Referrer received"),
        EVENT_TYPE_SEND_REFERRER(4097, "Send referrer"),
        EVENT_TYPE_REFERRER_OBTAINED_FROM_SERVICES(4098, "Referrer obtained"),
        EVENT_TYPE_APP_ENVIRONMENT_UPDATED(OlympusFocusInfoMakernoteDirectory.TagSensorTemperature, "App Environment Updated"),
        EVENT_TYPE_APP_ENVIRONMENT_CLEARED(OlympusFocusInfoMakernoteDirectory.TagImageStabilization, "App Environment Cleared"),
        EVENT_TYPE_EXCEPTION_UNHANDLED(5888, "Crash of App"),
        EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE(5889, "Crash of App, read from file"),
        EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT(5890, "Crash of App, passed to server via intent"),
        EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF(5891, "Crash of App"),
        EVENT_TYPE_EXCEPTION_USER_PROTOBUF(5892, "Error from developer"),
        EVENT_TYPE_ANR(5968, "ANR"),
        EVENT_TYPE_ACTIVATION(6144, "Activation of metrica"),
        EVENT_TYPE_FIRST_ACTIVATION(6145, "First activation of metrica"),
        EVENT_TYPE_START(OlympusImageProcessingMakernoteDirectory.TagKeystoneCompensation, "Start of new session"),
        EVENT_TYPE_CUSTOM_EVENT(8192, "Custom event"),
        EVENT_TYPE_APP_OPEN(8208, "App open event"),
        EVENT_TYPE_APP_UPDATE(8224, "App update event"),
        EVENT_TYPE_PERMISSIONS(12288, "Permissions changed event"),
        EVENT_TYPE_APP_FEATURES(CasioType2MakernoteDirectory.TAG_SELF_TIMER, "Features, required by application"),
        EVENT_TYPE_UPDATE_PRE_ACTIVATION_CONFIG(16384, "Update pre-activation config"),
        EVENT_TYPE_CLEANUP(CasioType2MakernoteDirectory.TAG_QUALITY, "Cleanup database");
        

        /* renamed from: Q */
        static final HashMap<Integer, C3126a> f2519Q = null;

        /* renamed from: R */
        private final int f2547R;

        /* renamed from: S */
        private final String f2548S;

        static {
            int i;
            f2519Q = new HashMap<>();
            for (C3126a aVar : values()) {
                f2519Q.put(Integer.valueOf(aVar.mo39462a()), aVar);
            }
        }

        private C3126a(int i, String str) {
            this.f2547R = i;
            this.f2548S = str;
        }

        /* renamed from: a */
        public int mo39462a() {
            return this.f2547R;
        }

        /* renamed from: b */
        public String mo39463b() {
            return this.f2548S;
        }

        /* renamed from: a */
        public static C3126a m1967a(int i) {
            C3126a aVar = f2519Q.get(Integer.valueOf(i));
            return aVar == null ? EVENT_TYPE_UNDEFINED : aVar;
        }
    }

    /* renamed from: a */
    public static boolean m1950a(C3126a aVar) {
        return !f2496b.contains(aVar);
    }

    /* renamed from: b */
    public static boolean m1955b(C3126a aVar) {
        return !f2497c.contains(aVar);
    }

    /* renamed from: a */
    public static boolean m1949a(int i) {
        return f2498d.contains(C3126a.m1967a(i));
    }

    /* renamed from: b */
    public static boolean m1954b(int i) {
        return f2499e.contains(C3126a.m1967a(i));
    }

    /* renamed from: c */
    public static boolean m1958c(int i) {
        return f2501g.contains(C3126a.m1967a(i));
    }

    /* renamed from: d */
    public static boolean m1960d(int i) {
        return f2500f.contains(C3126a.m1967a(i));
    }

    /* renamed from: e */
    public static boolean m1962e(int i) {
        return !f2502h.contains(C3126a.m1967a(i));
    }

    /* renamed from: a */
    public static C4217w m1944a(String str, C4216vz vzVar) {
        return m1941a(C3126a.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH, str, vzVar);
    }

    /* renamed from: b */
    public static C4217w m1952b(String str, C4216vz vzVar) {
        return m1941a(C3126a.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH, str, vzVar);
    }

    /* renamed from: a */
    static C4217w m1941a(C3126a aVar, String str, C4216vz vzVar) {
        return new C3869r(str, "", aVar.mo39462a(), vzVar);
    }

    /* renamed from: a */
    public static C4217w m1940a(C3126a aVar, C4216vz vzVar) {
        return new C3869r("", aVar.mo39462a(), vzVar);
    }

    /* renamed from: c */
    public static C4217w m1956c(String str, C4216vz vzVar) {
        return new C3869r(str, C3126a.EVENT_TYPE_REGULAR.mo39462a(), vzVar);
    }

    /* renamed from: a */
    static C4217w m1945a(String str, String str2, C4216vz vzVar) {
        return new C3869r(str2, str, C3126a.EVENT_TYPE_REGULAR.mo39462a(), vzVar);
    }

    /* renamed from: b */
    static C4217w m1953b(String str, String str2, C4216vz vzVar) {
        return new C3869r(str2, str, C3126a.EVENT_TYPE_STATBOX.mo39462a(), vzVar);
    }

    /* renamed from: a */
    public static C4217w m1938a() {
        C4217w a = new C4217w().mo41723a(C3126a.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING.mo39462a());
        try {
            a.mo40970c(C4204vq.m5888a().toString());
        } catch (Throwable unused) {
        }
        return a;
    }

    /* renamed from: a */
    static C4217w m1948a(byte[] bArr, C4216vz vzVar) {
        return new C3869r(bArr, "", C3126a.EVENT_TYPE_ANR.mo39462a(), vzVar);
    }

    /* renamed from: a */
    static C4217w m1947a(String str, byte[] bArr, C4216vz vzVar) {
        return new C3869r(bArr, str, C3126a.EVENT_TYPE_EXCEPTION_USER_PROTOBUF.mo39462a(), vzVar);
    }

    /* renamed from: d */
    static C4217w m1959d(String str, C4216vz vzVar) {
        return new C3869r(str, C3126a.EVENT_TYPE_START.mo39462a(), vzVar);
    }

    /* renamed from: e */
    static C4217w m1961e(String str, C4216vz vzVar) {
        return new C3869r(str, C3126a.EVENT_TYPE_UPDATE_FOREGROUND_TIME.mo39462a(), vzVar);
    }

    /* renamed from: b */
    public static C3869r m1951b(String str, byte[] bArr, C4216vz vzVar) {
        return m1937a(bArr, str, C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, vzVar);
    }

    /* renamed from: a */
    public static C4217w m1946a(String str, byte[] bArr, int i, HashMap<C3869r.C3870a, Integer> hashMap, C4216vz vzVar) {
        return m1937a(bArr, str, C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, vzVar).mo40965a(hashMap).mo41730c(i);
    }

    /* renamed from: a */
    private static C3869r m1937a(byte[] bArr, String str, C3126a aVar, C4216vz vzVar) {
        return new C3869r(bArr, str, aVar.mo39462a(), vzVar);
    }

    /* renamed from: f */
    public static C4217w m1963f(String str, C4216vz vzVar) {
        return new C3869r("", str, C3126a.EVENT_TYPE_REFERRER_RECEIVED_FROM_BROADCAST.mo39462a(), vzVar);
    }

    /* renamed from: a */
    public static C4217w m1943a(C4034sj sjVar, C4216vz vzVar) {
        if (sjVar == null) {
            return new C3869r("", C3126a.EVENT_TYPE_REFERRER_OBTAINED_FROM_SERVICES.mo39462a(), vzVar);
        }
        return new C3869r(sjVar.f4752a, C3126a.EVENT_TYPE_REFERRER_OBTAINED_FROM_SERVICES.mo39462a(), vzVar).mo40967a(sjVar.mo41271a());
    }

    /* renamed from: g */
    static C4217w m1964g(String str, C4216vz vzVar) {
        return m1957c(AbstractCircuitBreaker.PROPERTY_NAME, str, vzVar);
    }

    @Deprecated
    /* renamed from: h */
    static C4217w m1965h(String str, C4216vz vzVar) {
        return m1957c("referral", str, vzVar);
    }

    /* renamed from: c */
    static C4217w m1957c(String str, String str2, C4216vz vzVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", str);
        hashMap.put("link", str2);
        return new C3869r(C4204vq.m5894b((Map) hashMap), "", C3126a.EVENT_TYPE_APP_OPEN.mo39462a(), vzVar);
    }

    /* renamed from: a */
    public static C4217w m1942a(C3222bu buVar, C4216vz vzVar) {
        return new C3869r(buVar == null ? "" : buVar.mo39701a(), "", C3126a.EVENT_TYPE_ACTIVATION.mo39462a(), vzVar);
    }

    /* renamed from: i */
    public static C4217w m1966i(String str, C4216vz vzVar) {
        return new C3869r(str, "", C3126a.EVENT_TYPE_CLEANUP.mo39462a(), vzVar);
    }

    /* renamed from: a */
    static C4217w m1939a(int i, String str, String str2, Map<String, Object> map, C4216vz vzVar) {
        return new C3869r(str2, str, C3126a.EVENT_TYPE_CUSTOM_EVENT.mo39462a(), i, vzVar).mo41733e(C4204vq.m5894b((Map) map));
    }
}
