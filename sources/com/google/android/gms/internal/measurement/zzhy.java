package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhy;
import com.google.android.gms.internal.measurement.zzhy.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
public abstract class zzhy<MessageType extends zzhy<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzgg<MessageType, BuilderType> {
    private static Map<Object, zzhy<?, ?>> zzd = new ConcurrentHashMap();
    protected zzks zzb = zzks.zza();
    private int zzc = -1;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    protected static class zza<T extends zzhy<T, ?>> extends zzgk<T> {
        private final T zza;

        public zza(T t) {
            this.zza = t;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    static final class zzc implements zzht<zzc> {
        public final int zza() {
            throw new NoSuchMethodError();
        }

        public final zzlg zzb() {
            throw new NoSuchMethodError();
        }

        public final zzln zzc() {
            throw new NoSuchMethodError();
        }

        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        public final zzji zza(zzji zzji, zzjj zzjj) {
            throw new NoSuchMethodError();
        }

        public final zzjo zza(zzjo zzjo, zzjo zzjo2) {
            throw new NoSuchMethodError();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    public static final class zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {zza, zzb, zzc, zzd, zze, zzf, zzg};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    public static class zzf<ContainingType extends zzjj, Type> extends zzhm<ContainingType, Type> {
    }

    /* access modifiers changed from: protected */
    public abstract Object zza(int i, Object obj, Object obj2);

    /* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzhy<MessageType, BuilderType> implements zzjl {
        protected zzhr<zzc> zzc = zzhr.zza();

        /* access modifiers changed from: package-private */
        public final zzhr<zzc> zza() {
            if (this.zzc.zzc()) {
                this.zzc = (zzhr) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public String toString() {
        return zzjk.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zza != 0) {
            return this.zza;
        }
        this.zza = zzjx.zza().zza(this).zza(this);
        return this.zza;
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    public static abstract class zzb<MessageType extends zzhy<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzgi<MessageType, BuilderType> {
        protected MessageType zza;
        protected boolean zzb = false;
        private final MessageType zzc;

        protected zzb(MessageType messagetype) {
            this.zzc = messagetype;
            this.zza = (zzhy) messagetype.zza(zze.zzd, (Object) null, (Object) null);
        }

        /* access modifiers changed from: protected */
        public void zzu() {
            MessageType messagetype = (zzhy) this.zza.zza(zze.zzd, (Object) null, (Object) null);
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        public final boolean zzbn() {
            return zzhy.zza(this.zza, false);
        }

        /* renamed from: zzv */
        public MessageType zzx() {
            if (this.zzb) {
                return this.zza;
            }
            MessageType messagetype = this.zza;
            zzjx.zza().zza(messagetype).zzc(messagetype);
            this.zzb = true;
            return this.zza;
        }

        /* renamed from: zzw */
        public final MessageType zzy() {
            MessageType messagetype = (zzhy) zzx();
            if (messagetype.zzbn()) {
                return messagetype;
            }
            throw new zzkq(messagetype);
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb) {
                zzu();
                this.zzb = false;
            }
            zza(this.zza, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            zzjx.zza().zza(messagetype).zzb(messagetype, messagetype2);
        }

        private final BuilderType zzb(byte[] bArr, int i, int i2, zzhl zzhl) throws zzij {
            if (this.zzb) {
                zzu();
                this.zzb = false;
            }
            try {
                zzjx.zza().zza(this.zza).zza(this.zza, bArr, 0, i2, new zzgo(zzhl));
                return this;
            } catch (zzij e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw zzij.zza();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: zzb */
        public final BuilderType zza(zzhb zzhb, zzhl zzhl) throws IOException {
            if (this.zzb) {
                zzu();
                this.zzb = false;
            }
            try {
                zzjx.zza().zza(this.zza).zza(this.zza, zzhg.zza(zzhb), zzhl);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        public final /* synthetic */ zzgi zza(byte[] bArr, int i, int i2, zzhl zzhl) throws zzij {
            return zzb(bArr, 0, i2, zzhl);
        }

        public final /* synthetic */ zzgi zza(byte[] bArr, int i, int i2) throws zzij {
            return zzb(bArr, 0, i2, zzhl.zza());
        }

        public final /* synthetic */ zzgi zzt() {
            return (zzb) clone();
        }

        public final /* synthetic */ zzjj zzbv() {
            return this.zzc;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zzb zzb2 = (zzb) ((zzhy) this.zzc).zza(zze.zze, (Object) null, (Object) null);
            zzb2.zza((zzhy) zzx());
            return zzb2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzjx.zza().zza(this).zza(this, (zzhy) obj);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends zzhy<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzbm() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    public final boolean zzbn() {
        return zza(this, Boolean.TRUE.booleanValue());
    }

    public final BuilderType zzbo() {
        BuilderType buildertype = (zzb) zza(zze.zze, (Object) null, (Object) null);
        buildertype.zza(this);
        return buildertype;
    }

    /* access modifiers changed from: package-private */
    public final int zzbl() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final void zzc(int i) {
        this.zzc = i;
    }

    public final void zza(zzhi zzhi) throws IOException {
        zzjx.zza().zza(this).zza(this, (zzlm) zzhk.zza(zzhi));
    }

    public final int zzbp() {
        if (this.zzc == -1) {
            this.zzc = zzjx.zza().zza(this).zzb(this);
        }
        return this.zzc;
    }

    static <T extends zzhy<?, ?>> T zza(Class<T> cls) {
        T t = (zzhy) zzd.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzhy) zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (zzhy) ((zzhy) zzkz.zza(cls)).zza(zze.zzf, (Object) null, (Object) null);
            if (t != null) {
                zzd.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static <T extends zzhy<?, ?>> void zza(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    protected static Object zza(zzjj zzjj, String str, Object[] objArr) {
        return new zzjz(zzjj, str, objArr);
    }

    static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static final <T extends zzhy<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zze.zza, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzd2 = zzjx.zza().zza(t).zzd(t);
        if (z) {
            t.zza(zze.zzb, (Object) zzd2 ? t : null, (Object) null);
        }
        return zzd2;
    }

    protected static zzie zzbq() {
        return zzib.zzd();
    }

    protected static zzih zzbr() {
        return zzix.zzd();
    }

    protected static zzih zza(zzih zzih) {
        int size = zzih.size();
        return zzih.zzc(size == 0 ? 10 : size << 1);
    }

    protected static <E> zzig<E> zzbs() {
        return zzjw.zzd();
    }

    protected static <E> zzig<E> zza(zzig<E> zzig) {
        int size = zzig.size();
        return zzig.zza(size == 0 ? 10 : size << 1);
    }

    public final /* synthetic */ zzji zzbt() {
        zzb zzb2 = (zzb) zza(zze.zze, (Object) null, (Object) null);
        zzb2.zza(this);
        return zzb2;
    }

    public final /* synthetic */ zzji zzbu() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzjj zzbv() {
        return (zzhy) zza(zze.zzf, (Object) null, (Object) null);
    }
}
