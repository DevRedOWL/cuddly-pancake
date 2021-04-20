package p008c.p009a.p014b.p015i;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.mobileid.access.key.Key;
import p008c.p009a.p014b.C0848a;
import p008c.p009a.p014b.C0865e;
import p008c.p009a.p014b.C0882h;
import p008c.p009a.p014b.p015i.C0888a;

/* renamed from: c.a.b.i.b */
public class C0890b {

    /* renamed from: a */
    public volatile C0892b f873a;

    /* renamed from: c.a.b.i.b$a */
    public interface C0891a {
        /* renamed from: a */
        void mo12976a();

        /* renamed from: a */
        void mo12977a(String str, String str2, C0882h.C0885b bVar);

        void found();
    }

    /* renamed from: c.a.b.i.b$c */
    public static class C0894c {

        /* renamed from: a */
        public static final C0890b f884a = new C0890b();
    }

    /* renamed from: c.a.b.i.b$b */
    public static class C0892b extends Handler implements C0848a.C0854e, C0865e.C0868c, C0888a.C0889a {

        /* renamed from: g */
        public static final UUID f874g = UUID.fromString("6DBA3E9E-F6E0-4B65-B6A8-1C259E306918");

        /* renamed from: a */
        public C0893a f875a;

        /* renamed from: b */
        public C0891a f876b;

        /* renamed from: c */
        public Context f877c;

        /* renamed from: d */
        public List<Key> f878d;

        /* renamed from: e */
        public C0848a.C0850b f879e;

        /* renamed from: f */
        public C0865e f880f;

        /* renamed from: c.a.b.i.b$b$a */
        public enum C0893a {
            NETWORK,
            ENCRYPTED
        }

        public C0892b(Context context, List<Key> list, C0891a aVar) {
            this.f877c = context;
            this.f876b = aVar;
            this.f878d = list;
            C0848a.m397a(C0848a.C0853d.ADAPTIVE_RESULTS, (C0848a.C0854e) this, 400);
            this.f876b.mo12976a();
        }

        /* renamed from: a */
        public C0882h.C0885b mo12953a(byte[] bArr) {
            return null;
        }

        /* renamed from: a */
        public void mo12979a(C0848a.C0850b bVar) {
            if (bVar.mo12932c() > 3.0d) {
                return;
            }
            if (this.f879e == null || bVar.mo12932c() < this.f879e.mo12932c()) {
                this.f879e = bVar;
            }
        }

        /* renamed from: a */
        public void mo12963a(C0882h.C0885b bVar) {
            obtainMessage(1, bVar).sendToTarget();
        }

        /* renamed from: a */
        public final void mo12981a(String str, boolean z, C0882h.C0885b bVar) {
            C0891a aVar = this.f876b;
            if (aVar != null) {
                aVar.mo12977a(z ? "E" : "N", str, bVar);
            }
            this.f876b = null;
            this.f879e = null;
            C0865e eVar = this.f880f;
            if (eVar != null) {
                ArrayList<C0865e.C0868c> arrayList = eVar.f826a;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (eVar.f826a.get(size) == this) {
                            eVar.f826a.remove(size);
                        }
                    }
                }
                this.f880f.mo12957a();
                this.f880f = null;
            }
            C0894c.f884a.f873a = null;
        }

        public void handleMessage(Message message) {
            int i = message.what;
            boolean z = false;
            if (i == 1) {
                mo12981a((String) null, false, (C0882h.C0885b) message.obj);
            } else if (i == 2) {
                String str = (String) message.obj;
                if (message.arg1 == 1) {
                    z = true;
                }
                mo12981a(str, z, (C0882h.C0885b) null);
            } else if (i == 3) {
                mo12981a((String) null, false, (C0882h.C0885b) null);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0052 A[SYNTHETIC, Splitter:B:18:0x0052] */
        /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo12980a(p008c.p009a.p014b.C0848a.C0856g r7) {
            /*
                r6 = this;
                c.a.b.a$g r0 = p008c.p009a.p014b.C0848a.C0856g.STOPPED
                if (r7 != r0) goto L_0x009d
                c.a.b.a$b r7 = r6.f879e
                r0 = 0
                r1 = 0
                if (r7 == 0) goto L_0x0094
                c.a.b.i.b$a r7 = r6.f876b
                if (r7 == 0) goto L_0x0094
                r7.found()
                c.a.b.a$b r7 = r6.f879e
                java.lang.String r7 = r7.mo12930a()
                int r7 = r7.length()
                r2 = 4
                if (r7 <= r2) goto L_0x004d
                c.a.b.a$b r7 = r6.f879e
                java.lang.String r7 = r7.mo12930a()
                char r7 = r7.charAt(r2)
                r2 = 101(0x65, float:1.42E-43)
                if (r7 == r2) goto L_0x003e
                r2 = 110(0x6e, float:1.54E-43)
                if (r7 == r2) goto L_0x0031
                goto L_0x004d
            L_0x0031:
                c.a.a.c$a r7 = p008c.p009a.p010a.C0837c.f761k
                java.util.List<org.mobileid.access.key.Key> r2 = r6.f878d
                java.lang.String r3 = "network"
                org.mobileid.access.key.Key r7 = r7.mo12910a((java.lang.String) r3, (java.util.List<? extends org.mobileid.access.key.Key>) r2)
                c.a.b.i.b$b$a r2 = p008c.p009a.p014b.p015i.C0890b.C0892b.C0893a.NETWORK
                goto L_0x004a
            L_0x003e:
                c.a.a.c$a r7 = p008c.p009a.p010a.C0837c.f761k
                java.util.List<org.mobileid.access.key.Key> r2 = r6.f878d
                java.lang.String r3 = "encrypted"
                org.mobileid.access.key.Key r7 = r7.mo12910a((java.lang.String) r3, (java.util.List<? extends org.mobileid.access.key.Key>) r2)
                c.a.b.i.b$b$a r2 = p008c.p009a.p014b.p015i.C0890b.C0892b.C0893a.ENCRYPTED
            L_0x004a:
                r6.f875a = r2
                goto L_0x004e
            L_0x004d:
                r7 = r1
            L_0x004e:
                c.a.b.e r2 = r6.f880f
                if (r2 != 0) goto L_0x009d
                c.a.b.e r2 = new c.a.b.e     // Catch:{ b -> 0x0092 }
                android.content.Context r3 = r6.f877c     // Catch:{ b -> 0x0092 }
                c.a.b.a$b r4 = r6.f879e     // Catch:{ b -> 0x0092 }
                android.bluetooth.BluetoothDevice r4 = r4.mo12931b()     // Catch:{ b -> 0x0092 }
                c.a.b.g$a r5 = new c.a.b.g$a     // Catch:{ b -> 0x0092 }
                r5.<init>()     // Catch:{ b -> 0x0092 }
                c.a.b.h$a r3 = p008c.p009a.p014b.C0862c.m421a(r3, r4, r5)     // Catch:{ b -> 0x0092 }
                r2.<init>(r3)     // Catch:{ b -> 0x0092 }
                r6.f880f = r2     // Catch:{ b -> 0x0092 }
                java.util.ArrayList<c.a.b.e$c> r3 = r2.f826a     // Catch:{ b -> 0x0092 }
                if (r3 != 0) goto L_0x0075
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ b -> 0x0092 }
                r3.<init>()     // Catch:{ b -> 0x0092 }
                r2.f826a = r3     // Catch:{ b -> 0x0092 }
            L_0x0075:
                java.util.ArrayList<c.a.b.e$c> r2 = r2.f826a     // Catch:{ b -> 0x0092 }
                r2.add(r6)     // Catch:{ b -> 0x0092 }
                if (r7 != 0) goto L_0x007e
                r7 = r1
                goto L_0x0087
            L_0x007e:
                org.mobileid.access.key.KeyJavaBridge r2 = new org.mobileid.access.key.KeyJavaBridge     // Catch:{ b -> 0x0092 }
                r2.<init>(r7)     // Catch:{ b -> 0x0092 }
                java.lang.String r7 = r2.getMobileId()     // Catch:{ b -> 0x0092 }
            L_0x0087:
                c.a.b.e r2 = r6.f880f     // Catch:{ b -> 0x0092 }
                c.a.b.i.a r3 = new c.a.b.i.a     // Catch:{ b -> 0x0092 }
                r3.<init>(r6, r7)     // Catch:{ b -> 0x0092 }
                r2.mo12958a((p008c.p009a.p014b.C0863d) r3)     // Catch:{ b -> 0x0092 }
                goto L_0x009d
            L_0x0092:
                r7 = move-exception
                goto L_0x009a
            L_0x0094:
                c.a.b.h$b r7 = new c.a.b.h$b
                r2 = 7
                r7.<init>(r2)
            L_0x009a:
                r6.mo12981a(r1, r0, r7)
            L_0x009d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p008c.p009a.p014b.p015i.C0890b.C0892b.mo12980a(c.a.b.a$g):void");
        }
    }
}
