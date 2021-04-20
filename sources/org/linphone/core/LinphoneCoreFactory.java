package org.linphone.core;

import android.content.Context;
import org.linphone.tools.OpenH264DownloadHelper;

public abstract class LinphoneCoreFactory {
    private static String factoryName = "org.linphone.core.LinphoneCoreFactoryImpl";
    static LinphoneCoreFactory theLinphoneCoreFactory;
    protected Context fcontext;

    public abstract LinphoneAccountCreator createAccountCreator(LinphoneCore linphoneCore, String str);

    public abstract LinphoneAuthInfo createAuthInfo(String str, String str2, String str3, String str4);

    public abstract LinphoneAuthInfo createAuthInfo(String str, String str2, String str3, String str4, String str5, String str6);

    public abstract ErrorInfo createErrorInfo();

    public abstract LinphoneAddress createLinphoneAddress(String str) throws LinphoneCoreException;

    public abstract LinphoneAddress createLinphoneAddress(String str, String str2, String str3);

    public abstract LinphoneContent createLinphoneContent(String str, String str2, String str3);

    public abstract LinphoneContent createLinphoneContent(String str, String str2, byte[] bArr, String str3);

    public abstract LinphoneCore createLinphoneCore(LinphoneCoreListener linphoneCoreListener, Object obj) throws LinphoneCoreException;

    public abstract LinphoneCore createLinphoneCore(LinphoneCoreListener linphoneCoreListener, String str, String str2, Object obj, Object obj2) throws LinphoneCoreException;

    public abstract LinphoneFriend createLinphoneFriend();

    public abstract LinphoneFriend createLinphoneFriend(String str);

    public abstract LpConfig createLpConfig(String str);

    public abstract LpConfig createLpConfigFromString(String str);

    public abstract OpenH264DownloadHelper createOpenH264DownloadHelper();

    public abstract PresenceActivity createPresenceActivity(PresenceActivityType presenceActivityType, String str);

    public abstract PresenceModel createPresenceModel();

    public abstract PresenceModel createPresenceModel(PresenceActivityType presenceActivityType, String str);

    public abstract PresenceModel createPresenceModel(PresenceActivityType presenceActivityType, String str, String str2, String str3);

    public abstract PresenceService createPresenceService(String str, PresenceBasicStatus presenceBasicStatus, String str2);

    public abstract TunnelConfig createTunnelConfig();

    public abstract void enableLogCollection(boolean z);

    public abstract DialPlan[] getAllDialPlan();

    public abstract void setDebugMode(boolean z, String str);

    public abstract void setLogCollectionPath(String str);

    public abstract void setLogHandler(LinphoneLogHandler linphoneLogHandler);

    public static void setFactoryClassName(String str) {
        factoryName = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r1 = java.lang.System.err;
        r1.println("Cannot instanciate factory [" + factoryName + "]");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized org.linphone.core.LinphoneCoreFactory instance() {
        /*
            java.lang.Class<org.linphone.core.LinphoneCoreFactory> r0 = org.linphone.core.LinphoneCoreFactory.class
            monitor-enter(r0)
            org.linphone.core.LinphoneCoreFactory r1 = theLinphoneCoreFactory     // Catch:{ Exception -> 0x0018 }
            if (r1 != 0) goto L_0x0035
            java.lang.String r1 = factoryName     // Catch:{ Exception -> 0x0018 }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0018 }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ Exception -> 0x0018 }
            org.linphone.core.LinphoneCoreFactory r1 = (org.linphone.core.LinphoneCoreFactory) r1     // Catch:{ Exception -> 0x0018 }
            theLinphoneCoreFactory = r1     // Catch:{ Exception -> 0x0018 }
            goto L_0x0035
        L_0x0016:
            r1 = move-exception
            goto L_0x0039
        L_0x0018:
            java.io.PrintStream r1 = java.lang.System.err     // Catch:{ all -> 0x0016 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0016 }
            r2.<init>()     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = "Cannot instanciate factory ["
            r2.append(r3)     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = factoryName     // Catch:{ all -> 0x0016 }
            r2.append(r3)     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = "]"
            r2.append(r3)     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0016 }
            r1.println(r2)     // Catch:{ all -> 0x0016 }
        L_0x0035:
            org.linphone.core.LinphoneCoreFactory r1 = theLinphoneCoreFactory     // Catch:{ all -> 0x0016 }
            monitor-exit(r0)
            return r1
        L_0x0039:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.core.LinphoneCoreFactory.instance():org.linphone.core.LinphoneCoreFactory");
    }
}
