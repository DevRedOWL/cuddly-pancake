package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class RootTelemetryConfigManager {
    private static RootTelemetryConfigManager zza;
    private static final RootTelemetryConfiguration zzb = new RootTelemetryConfiguration(0, false, false, 0, 0);
    private RootTelemetryConfiguration zzc;

    public static synchronized RootTelemetryConfigManager getInstance() {
        RootTelemetryConfigManager rootTelemetryConfigManager;
        synchronized (RootTelemetryConfigManager.class) {
            if (zza == null) {
                zza = new RootTelemetryConfigManager();
            }
            rootTelemetryConfigManager = zza;
        }
        return rootTelemetryConfigManager;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza(com.google.android.gms.common.internal.RootTelemetryConfiguration r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L_0x0009
            com.google.android.gms.common.internal.RootTelemetryConfiguration r3 = zzb     // Catch:{ all -> 0x001d }
            r2.zzc = r3     // Catch:{ all -> 0x001d }
            monitor-exit(r2)
            return
        L_0x0009:
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r2.zzc     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0019
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r2.zzc     // Catch:{ all -> 0x001d }
            int r0 = r0.getVersion()     // Catch:{ all -> 0x001d }
            int r1 = r3.getVersion()     // Catch:{ all -> 0x001d }
            if (r0 >= r1) goto L_0x001b
        L_0x0019:
            r2.zzc = r3     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r2)
            return
        L_0x001d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.RootTelemetryConfigManager.zza(com.google.android.gms.common.internal.RootTelemetryConfiguration):void");
    }

    public final RootTelemetryConfiguration getConfig() {
        return this.zzc;
    }

    private RootTelemetryConfigManager() {
    }
}
