package org.linphone.tools;

import org.linphone.core.LpConfig;
import org.linphone.mediastream.Log;

public class Xml2Lpc {
    private static boolean mAvailable;
    private long internalPtr = 0;

    private enum LogLevel {
        DEBUG,
        MESSAGE,
        WARNING,
        ERROR
    }

    private native void destroy();

    private native void init();

    public native int convert(LpConfig lpConfig);

    public native int setXmlFile(String str);

    public native int setXmlString(String str);

    public native int setXsdFile(String str);

    public native int setXsdString(String str);

    public native int validate();

    public Xml2Lpc() {
        init();
    }

    public void finalize() {
        destroy();
    }

    /* renamed from: org.linphone.tools.Xml2Lpc$1 */
    static /* synthetic */ class C54471 {
        static final /* synthetic */ int[] $SwitchMap$org$linphone$tools$Xml2Lpc$LogLevel = new int[LogLevel.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                org.linphone.tools.Xml2Lpc$LogLevel[] r0 = org.linphone.tools.Xml2Lpc.LogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$linphone$tools$Xml2Lpc$LogLevel = r0
                int[] r0 = $SwitchMap$org$linphone$tools$Xml2Lpc$LogLevel     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.linphone.tools.Xml2Lpc$LogLevel r1 = org.linphone.tools.Xml2Lpc.LogLevel.DEBUG     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$org$linphone$tools$Xml2Lpc$LogLevel     // Catch:{ NoSuchFieldError -> 0x001f }
                org.linphone.tools.Xml2Lpc$LogLevel r1 = org.linphone.tools.Xml2Lpc.LogLevel.MESSAGE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$org$linphone$tools$Xml2Lpc$LogLevel     // Catch:{ NoSuchFieldError -> 0x002a }
                org.linphone.tools.Xml2Lpc$LogLevel r1 = org.linphone.tools.Xml2Lpc.LogLevel.WARNING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$org$linphone$tools$Xml2Lpc$LogLevel     // Catch:{ NoSuchFieldError -> 0x0035 }
                org.linphone.tools.Xml2Lpc$LogLevel r1 = org.linphone.tools.Xml2Lpc.LogLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.linphone.tools.Xml2Lpc.C54471.<clinit>():void");
        }
    }

    public void printLog(int i, String str) {
        if (i > 0 && i < LogLevel.values().length) {
            int i2 = C54471.$SwitchMap$org$linphone$tools$Xml2Lpc$LogLevel[LogLevel.values()[i].ordinal()];
            if (i2 == 1) {
                Log.m6901d(str);
            } else if (i2 == 2) {
                Log.m6905i(str);
            } else if (i2 == 3) {
                Log.m6907w(str);
            } else if (i2 == 4) {
                Log.m6903e(str);
            }
        }
    }

    public static boolean isAvailable() {
        return mAvailable;
    }

    static {
        try {
            new Xml2Lpc();
            mAvailable = true;
        } catch (Throwable unused) {
            mAvailable = false;
        }
    }
}
