package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.Field;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class DynamiteModule {
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzf();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzi();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzh();
    public static final VersionPolicy PREFER_LOCAL = new zzd();
    public static final VersionPolicy PREFER_REMOTE = new zze();
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzg();
    private static Boolean zza = null;
    private static zzl zzb = null;
    private static zzn zzc = null;
    private static String zzd = null;
    private static int zze = -1;
    private static final ThreadLocal<zza> zzf = new ThreadLocal<>();
    private static final ThreadLocal<Long> zzg = new zza();
    private static final VersionPolicy.zzb zzh = new zzb();
    private static final VersionPolicy zzi = new zzj();
    private final Context zzj;

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public interface VersionPolicy {

        /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
        public static class zza {
            public int zza = 0;
            public int zzb = 0;
            public int zzc = 0;
        }

        /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
        public interface zzb {
            int zza(Context context, String str);

            int zza(Context context, String str, boolean z) throws LoadingException;
        }

        zza zza(Context context, String str, zzb zzb2) throws LoadingException;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    private static class zza {
        public Cursor zza;

        private zza() {
        }

        /* synthetic */ zza(zza zza2) {
            this();
        }
    }

    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        VersionPolicy.zza zza2;
        Context context2 = context;
        VersionPolicy versionPolicy2 = versionPolicy;
        String str2 = str;
        zza zza3 = zzf.get();
        zza zza4 = new zza((zza) null);
        zzf.set(zza4);
        long longValue = zzg.get().longValue();
        try {
            zzg.set(Long.valueOf(SystemClock.elapsedRealtime()));
            zza2 = versionPolicy2.zza(context2, str2, zzh);
            int i = zza2.zza;
            int i2 = zza2.zzb;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str2);
            sb.append(":");
            sb.append(i);
            sb.append(" and remote module ");
            sb.append(str2);
            sb.append(":");
            sb.append(i2);
            Log.i("DynamiteModule", sb.toString());
            if (zza2.zzc == 0 || ((zza2.zzc == -1 && zza2.zza == 0) || (zza2.zzc == 1 && zza2.zzb == 0))) {
                int i3 = zza2.zza;
                int i4 = zza2.zzb;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i3);
                sb2.append(" and remote version is ");
                sb2.append(i4);
                sb2.append(".");
                throw new LoadingException(sb2.toString(), (zza) null);
            } else if (zza2.zzc == -1) {
                DynamiteModule zza5 = zza(context2, str2);
                if (longValue == 0) {
                    zzg.remove();
                } else {
                    zzg.set(Long.valueOf(longValue));
                }
                if (zza4.zza != null) {
                    zza4.zza.close();
                }
                zzf.set(zza3);
                return zza5;
            } else if (zza2.zzc == 1) {
                DynamiteModule zza6 = zza(context2, str2, zza2.zzb);
                if (longValue == 0) {
                    zzg.remove();
                } else {
                    zzg.set(Long.valueOf(longValue));
                }
                if (zza4.zza != null) {
                    zza4.zza.close();
                }
                zzf.set(zza3);
                return zza6;
            } else {
                int i5 = zza2.zzc;
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(i5);
                throw new LoadingException(sb3.toString(), (zza) null);
            }
        } catch (LoadingException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to load remote module: ".concat(valueOf) : new String("Failed to load remote module: "));
            if (zza2.zza == 0 || versionPolicy2.zza(context2, str2, new zzb(zza2.zza, 0)).zzc != -1) {
                throw new LoadingException("Remote load failed. No local fallback found.", e, (zza) null);
            }
            DynamiteModule zza7 = zza(context2, str2);
            if (longValue == 0) {
                zzg.remove();
            } else {
                zzg.set(Long.valueOf(longValue));
            }
            if (zza4.zza != null) {
                zza4.zza.close();
            }
            zzf.set(zza3);
            return zza7;
        } catch (Throwable th) {
            if (longValue == 0) {
                zzg.remove();
            } else {
                zzg.set(Long.valueOf(longValue));
            }
            if (zza4.zza != null) {
                zza4.zza.close();
            }
            zzf.set(zza3);
            throw th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public static class LoadingException extends Exception {
        private LoadingException(String str) {
            super(str);
        }

        private LoadingException(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ LoadingException(String str, zza zza) {
            this(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, zza zza) {
            this(str, th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    private static class zzb implements VersionPolicy.zzb {
        private final int zza;
        private final int zzb = 0;

        public zzb(int i, int i2) {
            this.zza = i;
        }

        public final int zza(Context context, String str, boolean z) {
            return 0;
        }

        public final int zza(Context context, String str) {
            return this.zza;
        }
    }

    public static int getLocalVersion(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0057=Splitter:B:23:0x0057, B:18:0x003a=Splitter:B:18:0x003a, B:39:0x009e=Splitter:B:39:0x009e} */
    public static int zza(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x0112 }
            java.lang.Boolean r1 = zza     // Catch:{ all -> 0x010f }
            if (r1 != 0) goto L_0x00dc
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00b3, IllegalAccessException -> 0x00b1, NoSuchFieldException -> 0x00af }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00b3, IllegalAccessException -> 0x00b1, NoSuchFieldException -> 0x00af }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x00b3, IllegalAccessException -> 0x00b1, NoSuchFieldException -> 0x00af }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x00b3, IllegalAccessException -> 0x00b1, NoSuchFieldException -> 0x00af }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException -> 0x00b3, IllegalAccessException -> 0x00b1, NoSuchFieldException -> 0x00af }
            java.lang.Class r2 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00b3, IllegalAccessException -> 0x00b1, NoSuchFieldException -> 0x00af }
            monitor-enter(r2)     // Catch:{ ClassNotFoundException -> 0x00b3, IllegalAccessException -> 0x00b1, NoSuchFieldException -> 0x00af }
            r3 = 0
            java.lang.Object r4 = r1.get(r3)     // Catch:{ all -> 0x00ac }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x00ac }
            if (r4 == 0) goto L_0x003d
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00ac }
            if (r4 != r1) goto L_0x0037
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00ac }
            goto L_0x00aa
        L_0x0037:
            zza((java.lang.ClassLoader) r4)     // Catch:{ LoadingException -> 0x003a }
        L_0x003a:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00ac }
            goto L_0x00aa
        L_0x003d:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x00ac }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x00ac }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ac }
            if (r4 == 0) goto L_0x0057
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00ac }
            r1.set(r3, r4)     // Catch:{ all -> 0x00ac }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00ac }
            goto L_0x00aa
        L_0x0057:
            int r4 = zzc(r8, r9, r10)     // Catch:{ LoadingException -> 0x00a1 }
            java.lang.String r5 = zzd     // Catch:{ LoadingException -> 0x00a1 }
            if (r5 == 0) goto L_0x009e
            java.lang.String r5 = zzd     // Catch:{ LoadingException -> 0x00a1 }
            boolean r5 = r5.isEmpty()     // Catch:{ LoadingException -> 0x00a1 }
            if (r5 == 0) goto L_0x0068
            goto L_0x009e
        L_0x0068:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ LoadingException -> 0x00a1 }
            r6 = 29
            if (r5 < r6) goto L_0x0080
            dalvik.system.DelegateLastClassLoader r5 = new dalvik.system.DelegateLastClassLoader     // Catch:{ LoadingException -> 0x00a1 }
            java.lang.String r6 = zzd     // Catch:{ LoadingException -> 0x00a1 }
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch:{ LoadingException -> 0x00a1 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ LoadingException -> 0x00a1 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x00a1 }
            r5.<init>(r6, r7)     // Catch:{ LoadingException -> 0x00a1 }
            goto L_0x0091
        L_0x0080:
            com.google.android.gms.dynamite.zzc r5 = new com.google.android.gms.dynamite.zzc     // Catch:{ LoadingException -> 0x00a1 }
            java.lang.String r6 = zzd     // Catch:{ LoadingException -> 0x00a1 }
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch:{ LoadingException -> 0x00a1 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ LoadingException -> 0x00a1 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x00a1 }
            r5.<init>(r6, r7)     // Catch:{ LoadingException -> 0x00a1 }
        L_0x0091:
            zza((java.lang.ClassLoader) r5)     // Catch:{ LoadingException -> 0x00a1 }
            r1.set(r3, r5)     // Catch:{ LoadingException -> 0x00a1 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ LoadingException -> 0x00a1 }
            zza = r5     // Catch:{ LoadingException -> 0x00a1 }
            monitor-exit(r2)     // Catch:{ all -> 0x00ac }
            monitor-exit(r0)     // Catch:{ all -> 0x010f }
            return r4
        L_0x009e:
            monitor-exit(r2)     // Catch:{ all -> 0x00ac }
            monitor-exit(r0)     // Catch:{ all -> 0x010f }
            return r4
        L_0x00a1:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00ac }
            r1.set(r3, r4)     // Catch:{ all -> 0x00ac }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00ac }
        L_0x00aa:
            monitor-exit(r2)     // Catch:{ all -> 0x00ac }
            goto L_0x00da
        L_0x00ac:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ac }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00b3, IllegalAccessException -> 0x00b1, NoSuchFieldException -> 0x00af }
        L_0x00af:
            r1 = move-exception
            goto L_0x00b4
        L_0x00b1:
            r1 = move-exception
            goto L_0x00b4
        L_0x00b3:
            r1 = move-exception
        L_0x00b4:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x010f }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x010f }
            int r3 = r3.length()     // Catch:{ all -> 0x010f }
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x010f }
            r4.<init>(r3)     // Catch:{ all -> 0x010f }
            java.lang.String r3 = "Failed to load module via V2: "
            r4.append(r3)     // Catch:{ all -> 0x010f }
            r4.append(r1)     // Catch:{ all -> 0x010f }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x010f }
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x010f }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x010f }
        L_0x00da:
            zza = r1     // Catch:{ all -> 0x010f }
        L_0x00dc:
            monitor-exit(r0)     // Catch:{ all -> 0x010f }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x010a
            int r8 = zzc(r8, r9, r10)     // Catch:{ LoadingException -> 0x00e8 }
            return r8
        L_0x00e8:
            r9 = move-exception
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x0112 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0112 }
            int r1 = r9.length()     // Catch:{ all -> 0x0112 }
            if (r1 == 0) goto L_0x0100
            java.lang.String r9 = r0.concat(r9)     // Catch:{ all -> 0x0112 }
            goto L_0x0105
        L_0x0100:
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x0112 }
            r9.<init>(r0)     // Catch:{ all -> 0x0112 }
        L_0x0105:
            android.util.Log.w(r10, r9)     // Catch:{ all -> 0x0112 }
            r8 = 0
            return r8
        L_0x010a:
            int r8 = zzb((android.content.Context) r8, (java.lang.String) r9, (boolean) r10)     // Catch:{ all -> 0x0112 }
            return r8
        L_0x010f:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x010f }
            throw r9     // Catch:{ all -> 0x0112 }
        L_0x0112:
            r9 = move-exception
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r8, r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d A[Catch:{ all -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092 A[Catch:{ all -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzb(android.content.Context r9, java.lang.String r10, boolean r11) {
        /*
            java.lang.String r0 = "DynamiteModule"
            com.google.android.gms.dynamite.zzl r1 = zza((android.content.Context) r9)
            r7 = 0
            if (r1 != 0) goto L_0x000a
            return r7
        L_0x000a:
            r8 = 0
            int r2 = r1.zzb()     // Catch:{ RemoteException -> 0x007c }
            r3 = 3
            if (r2 < r3) goto L_0x005b
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r9)     // Catch:{ RemoteException -> 0x007c }
            java.lang.ThreadLocal<java.lang.Long> r9 = zzg     // Catch:{ RemoteException -> 0x007c }
            java.lang.Object r9 = r9.get()     // Catch:{ RemoteException -> 0x007c }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ RemoteException -> 0x007c }
            long r5 = r9.longValue()     // Catch:{ RemoteException -> 0x007c }
            r3 = r10
            r4 = r11
            com.google.android.gms.dynamic.IObjectWrapper r9 = r1.zza((com.google.android.gms.dynamic.IObjectWrapper) r2, (java.lang.String) r3, (boolean) r4, (long) r5)     // Catch:{ RemoteException -> 0x007c }
            java.lang.Object r9 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r9)     // Catch:{ RemoteException -> 0x007c }
            android.database.Cursor r9 = (android.database.Cursor) r9     // Catch:{ RemoteException -> 0x007c }
            if (r9 == 0) goto L_0x0050
            boolean r10 = r9.moveToFirst()     // Catch:{ RemoteException -> 0x004d, all -> 0x004a }
            if (r10 != 0) goto L_0x0037
            goto L_0x0050
        L_0x0037:
            int r10 = r9.getInt(r7)     // Catch:{ RemoteException -> 0x004d, all -> 0x004a }
            if (r10 <= 0) goto L_0x0044
            boolean r11 = zza((android.database.Cursor) r9)     // Catch:{ RemoteException -> 0x004d, all -> 0x004a }
            if (r11 == 0) goto L_0x0044
            r9 = r8
        L_0x0044:
            if (r9 == 0) goto L_0x0049
            r9.close()
        L_0x0049:
            return r10
        L_0x004a:
            r10 = move-exception
            r8 = r9
            goto L_0x00a1
        L_0x004d:
            r10 = move-exception
            r8 = r9
            goto L_0x007d
        L_0x0050:
            java.lang.String r10 = "Failed to retrieve remote module version."
            android.util.Log.w(r0, r10)     // Catch:{ RemoteException -> 0x004d, all -> 0x004a }
            if (r9 == 0) goto L_0x005a
            r9.close()
        L_0x005a:
            return r7
        L_0x005b:
            r3 = 2
            if (r2 != r3) goto L_0x006c
            java.lang.String r2 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r2)     // Catch:{ RemoteException -> 0x007c }
            com.google.android.gms.dynamic.IObjectWrapper r9 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r9)     // Catch:{ RemoteException -> 0x007c }
            int r9 = r1.zzb((com.google.android.gms.dynamic.IObjectWrapper) r9, (java.lang.String) r10, (boolean) r11)     // Catch:{ RemoteException -> 0x007c }
            return r9
        L_0x006c:
            java.lang.String r2 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r0, r2)     // Catch:{ RemoteException -> 0x007c }
            com.google.android.gms.dynamic.IObjectWrapper r9 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r9)     // Catch:{ RemoteException -> 0x007c }
            int r9 = r1.zza((com.google.android.gms.dynamic.IObjectWrapper) r9, (java.lang.String) r10, (boolean) r11)     // Catch:{ RemoteException -> 0x007c }
            return r9
        L_0x007a:
            r10 = move-exception
            goto L_0x00a1
        L_0x007c:
            r10 = move-exception
        L_0x007d:
            java.lang.String r9 = "Failed to retrieve remote module version: "
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x007a }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x007a }
            int r11 = r10.length()     // Catch:{ all -> 0x007a }
            if (r11 == 0) goto L_0x0092
            java.lang.String r9 = r9.concat(r10)     // Catch:{ all -> 0x007a }
            goto L_0x0098
        L_0x0092:
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x007a }
            r10.<init>(r9)     // Catch:{ all -> 0x007a }
            r9 = r10
        L_0x0098:
            android.util.Log.w(r0, r9)     // Catch:{ all -> 0x007a }
            if (r8 == 0) goto L_0x00a0
            r8.close()
        L_0x00a0:
            return r7
        L_0x00a1:
            if (r8 == 0) goto L_0x00a6
            r8.close()
        L_0x00a6:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzc(android.content.Context r10, java.lang.String r11, boolean r12) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = zzg     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            if (r12 == 0) goto L_0x0016
            java.lang.String r10 = "api_force_staging"
            goto L_0x0018
        L_0x0016:
            java.lang.String r10 = "api"
        L_0x0018:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r12.<init>()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            if (r10 == 0) goto L_0x0080
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            if (r11 == 0) goto L_0x0080
            r11 = 0
            int r11 = r10.getInt(r11)     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            if (r11 <= 0) goto L_0x007a
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r12 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r12)     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            r1 = 2
            java.lang.String r1 = r10.getString(r1)     // Catch:{ all -> 0x0077 }
            zzd = r1     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = "loaderVersion"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ all -> 0x0077 }
            if (r1 < 0) goto L_0x006e
            int r1 = r10.getInt(r1)     // Catch:{ all -> 0x0077 }
            zze = r1     // Catch:{ all -> 0x0077 }
        L_0x006e:
            monitor-exit(r12)     // Catch:{ all -> 0x0077 }
            boolean r12 = zza((android.database.Cursor) r10)     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            if (r12 == 0) goto L_0x007a
            r10 = r0
            goto L_0x007a
        L_0x0077:
            r11 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0077 }
            throw r11     // Catch:{ Exception -> 0x0093, all -> 0x008f }
        L_0x007a:
            if (r10 == 0) goto L_0x007f
            r10.close()
        L_0x007f:
            return r11
        L_0x0080:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>((java.lang.String) r12, (com.google.android.gms.dynamite.zza) r0)     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            throw r11     // Catch:{ Exception -> 0x0093, all -> 0x008f }
        L_0x008f:
            r11 = move-exception
            r0 = r10
            r10 = r11
            goto L_0x00ab
        L_0x0093:
            r11 = move-exception
            r9 = r11
            r11 = r10
            r10 = r9
            goto L_0x009c
        L_0x0098:
            r10 = move-exception
            goto L_0x00ab
        L_0x009a:
            r10 = move-exception
            r11 = r0
        L_0x009c:
            boolean r12 = r10 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00a9 }
            if (r12 == 0) goto L_0x00a1
            throw r10     // Catch:{ all -> 0x00a9 }
        L_0x00a1:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = "V2 version check failed"
            r12.<init>(r1, r10, r0)     // Catch:{ all -> 0x00a9 }
            throw r12     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r10 = move-exception
            r0 = r11
        L_0x00ab:
            if (r0 == 0) goto L_0x00b0
            r0.close()
        L_0x00b0:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzc(android.content.Context, java.lang.String, boolean):int");
    }

    private static boolean zza(Cursor cursor) {
        zza zza2 = zzf.get();
        if (zza2 == null || zza2.zza != null) {
            return false;
        }
        zza2.zza = cursor;
        return true;
    }

    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    private static DynamiteModule zza(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static DynamiteModule zza(Context context, String str, int i) throws LoadingException {
        Boolean bool;
        IObjectWrapper iObjectWrapper;
        try {
            synchronized (DynamiteModule.class) {
                bool = zza;
            }
            if (bool == null) {
                throw new LoadingException("Failed to determine which loading route to use.", (zza) null);
            } else if (bool.booleanValue()) {
                return zzb(context, str, i);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i);
                Log.i("DynamiteModule", sb.toString());
                zzl zza2 = zza(context);
                if (zza2 != null) {
                    int zzb2 = zza2.zzb();
                    if (zzb2 >= 3) {
                        zza zza3 = zzf.get();
                        if (zza3 != null) {
                            iObjectWrapper = zza2.zza(ObjectWrapper.wrap(context), str, i, ObjectWrapper.wrap(zza3.zza));
                        } else {
                            throw new LoadingException("No cached result cursor holder", (zza) null);
                        }
                    } else if (zzb2 == 2) {
                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                        iObjectWrapper = zza2.zzb(ObjectWrapper.wrap(context), str, i);
                    } else {
                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                        iObjectWrapper = zza2.zza(ObjectWrapper.wrap(context), str, i);
                    }
                    if (ObjectWrapper.unwrap(iObjectWrapper) != null) {
                        return new DynamiteModule((Context) ObjectWrapper.unwrap(iObjectWrapper));
                    }
                    throw new LoadingException("Failed to load remote module.", (zza) null);
                }
                throw new LoadingException("Failed to create IDynamiteLoader.", (zza) null);
            }
        } catch (RemoteException e) {
            throw new LoadingException("Failed to load remote module.", e, (zza) null);
        } catch (LoadingException e2) {
            throw e2;
        } catch (Throwable th) {
            CrashUtils.addDynamiteErrorToDropBox(context, th);
            throw new LoadingException("Failed to load remote module.", th, (zza) null);
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.dynamite.zzl zza(android.content.Context r5) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)
            com.google.android.gms.dynamite.zzl r1 = zzb     // Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x000b
            com.google.android.gms.dynamite.zzl r5 = zzb     // Catch:{ all -> 0x0063 }
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            return r5
        L_0x000b:
            r1 = 0
            java.lang.String r2 = "com.google.android.gms"
            r3 = 3
            android.content.Context r5 = r5.createPackageContext(r2, r3)     // Catch:{ Exception -> 0x0041 }
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ Exception -> 0x0041 }
            java.lang.String r2 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r5 = r5.loadClass(r2)     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r5 = r5.newInstance()     // Catch:{ Exception -> 0x0041 }
            android.os.IBinder r5 = (android.os.IBinder) r5     // Catch:{ Exception -> 0x0041 }
            if (r5 != 0) goto L_0x0027
            r5 = r1
            goto L_0x003b
        L_0x0027:
            java.lang.String r2 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r2 = r5.queryLocalInterface(r2)     // Catch:{ Exception -> 0x0041 }
            boolean r3 = r2 instanceof com.google.android.gms.dynamite.zzl     // Catch:{ Exception -> 0x0041 }
            if (r3 == 0) goto L_0x0035
            r5 = r2
            com.google.android.gms.dynamite.zzl r5 = (com.google.android.gms.dynamite.zzl) r5     // Catch:{ Exception -> 0x0041 }
            goto L_0x003b
        L_0x0035:
            com.google.android.gms.dynamite.zzk r2 = new com.google.android.gms.dynamite.zzk     // Catch:{ Exception -> 0x0041 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0041 }
            r5 = r2
        L_0x003b:
            if (r5 == 0) goto L_0x0061
            zzb = r5     // Catch:{ Exception -> 0x0041 }
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            return r5
        L_0x0041:
            r5 = move-exception
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r3 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0063 }
            int r4 = r5.length()     // Catch:{ all -> 0x0063 }
            if (r4 == 0) goto L_0x0059
            java.lang.String r5 = r3.concat(r5)     // Catch:{ all -> 0x0063 }
            goto L_0x005e
        L_0x0059:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0063 }
            r5.<init>(r3)     // Catch:{ all -> 0x0063 }
        L_0x005e:
            android.util.Log.e(r2, r5)     // Catch:{ all -> 0x0063 }
        L_0x0061:
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            return r1
        L_0x0063:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context):com.google.android.gms.dynamite.zzl");
    }

    public final Context getModuleContext() {
        return this.zzj;
    }

    private static DynamiteModule zzb(Context context, String str, int i) throws LoadingException, RemoteException {
        zzn zzn;
        IObjectWrapper iObjectWrapper;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            zzn = zzc;
        }
        if (zzn != null) {
            zza zza2 = zzf.get();
            if (zza2 == null || zza2.zza == null) {
                throw new LoadingException("No result cursor", (zza) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = zza2.zza;
            ObjectWrapper.wrap(null);
            if (zza().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                iObjectWrapper = zzn.zzb(ObjectWrapper.wrap(applicationContext), str, i, ObjectWrapper.wrap(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                iObjectWrapper = zzn.zza(ObjectWrapper.wrap(applicationContext), str, i, ObjectWrapper.wrap(cursor));
            }
            Context context2 = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new LoadingException("Failed to get module context", (zza) null);
        }
        throw new LoadingException("DynamiteLoaderV2 was not cached.", (zza) null);
    }

    private static Boolean zza() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(zze >= 2);
        }
        return valueOf;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zza(java.lang.ClassLoader r3) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            java.lang.String r1 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r3 = r3.loadClass(r1)     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            java.lang.reflect.Constructor r3 = r3.getConstructor(r2)     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            java.lang.Object r3 = r3.newInstance(r1)     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            if (r3 != 0) goto L_0x001a
            r3 = r0
            goto L_0x002e
        L_0x001a:
            java.lang.String r1 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            android.os.IInterface r1 = r3.queryLocalInterface(r1)     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            boolean r2 = r1 instanceof com.google.android.gms.dynamite.zzn     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            if (r2 == 0) goto L_0x0028
            r3 = r1
            com.google.android.gms.dynamite.zzn r3 = (com.google.android.gms.dynamite.zzn) r3     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            goto L_0x002e
        L_0x0028:
            com.google.android.gms.dynamite.zzm r1 = new com.google.android.gms.dynamite.zzm     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            r1.<init>(r3)     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            r3 = r1
        L_0x002e:
            zzc = r3     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            return
        L_0x0031:
            r3 = move-exception
            goto L_0x003a
        L_0x0033:
            r3 = move-exception
            goto L_0x003a
        L_0x0035:
            r3 = move-exception
            goto L_0x003a
        L_0x0037:
            r3 = move-exception
            goto L_0x003a
        L_0x0039:
            r3 = move-exception
        L_0x003a:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r2 = "Failed to instantiate dynamite loader"
            r1.<init>(r2, r3, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(java.lang.ClassLoader):void");
    }

    public final IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            throw new LoadingException(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e, (zza) null);
        }
    }

    private DynamiteModule(Context context) {
        this.zzj = (Context) Preconditions.checkNotNull(context);
    }
}
