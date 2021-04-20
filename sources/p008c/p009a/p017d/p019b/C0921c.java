package p008c.p009a.p017d.p019b;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import kotlin.UShort;
import org.mobileid.Api;
import org.mobileid.access.key.Key;
import org.mobileid.access.key.KeyJavaBridge;
import p008c.p009a.p010a.p012e.C0844b;
import p008c.p009a.p014b.C0862c;
import p008c.p009a.p014b.C0863d;
import p008c.p009a.p014b.C0865e;
import p008c.p009a.p014b.C0878g;
import p008c.p009a.p014b.C0882h;
import p008c.p009a.p017d.p019b.C0911a;
import p008c.p009a.p017d.p019b.C0929d;
import p008c.p009a.p017d.p023e.C0956d;

/* renamed from: c.a.d.b.c */
public class C0921c {

    /* renamed from: a */
    public volatile C0926c f929a;

    /* renamed from: c.a.d.b.c$b */
    public static class C0925b {

        /* renamed from: a */
        public static final C0921c f941a = new C0921c();
    }

    /* renamed from: c.a.d.b.c$c */
    public static class C0926c extends Handler implements C0929d.C0932c {

        /* renamed from: a */
        public final Context f942a;

        /* renamed from: b */
        public final C0956d f943b;

        /* renamed from: c */
        public final C0844b f944c;

        /* renamed from: d */
        public final Runnable f945d;

        /* renamed from: e */
        public Runnable f946e;

        /* renamed from: f */
        public C0929d f947f;

        /* renamed from: c.a.d.b.c$c$a */
        public class C0927a implements Runnable {
            public C0927a() {
            }

            public void run() {
                C0926c cVar = C0926c.this;
                cVar.removeCallbacks(cVar.f945d);
                C0878g.m458a();
                C0926c cVar2 = C0926c.this;
                if (cVar2.f947f == null) {
                    cVar2.mo12995a(C0911a.C0912a.UNKNOWN);
                }
            }
        }

        /* renamed from: c.a.d.b.c$c$b */
        public class C0928b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0929d f949a;

            public C0928b(C0929d dVar) {
                this.f949a = dVar;
            }

            public void run() {
                C0926c cVar = C0926c.this;
                if (cVar.f947f != null) {
                    List<Key> a = cVar.f944c.mo12925a((C0911a) this.f949a);
                    C0926c cVar2 = C0926c.this;
                    if (cVar2 == null) {
                        throw null;
                    } else if (a.isEmpty()) {
                        cVar2.mo12995a(C0911a.C0912a.EMPTY);
                    } else {
                        new C0922a(cVar2.f942a, cVar2.f947f.f951e, new KeyJavaBridge(a.get(0)).getMobileId(), Integer.valueOf(cVar2.f947f.f902b));
                    }
                } else {
                    cVar.mo12995a(C0911a.C0912a.UNKNOWN);
                }
            }
        }

        public C0926c(Context context, boolean z, C0844b bVar, C0956d dVar) {
            this.f942a = context;
            this.f943b = dVar;
            this.f944c = bVar;
            C0878g.m460a((C0929d.C0932c) this, bVar.mo12926a(z));
            C0927a aVar = new C0927a();
            this.f945d = aVar;
            postDelayed(aVar, 2200);
            this.f943b.started();
        }

        /* renamed from: a */
        public final void mo12995a(C0911a.C0912a aVar) {
            Api.Firebase firebase;
            "Finishing... " + aVar.toString();
            removeCallbacks(this.f946e);
            removeCallbacks(this.f945d);
            C0878g.m458a();
            C0925b.f941a.f929a = null;
            this.f947f = null;
            this.f943b.result(aVar);
            if (aVar != C0911a.C0912a.UNKNOWN && (firebase = Api.INSTANCE.getFirebase()) != null) {
                firebase.logAndClearCurrentEventIfDefined(Bundle.EMPTY);
            }
        }

        /* renamed from: a */
        public void mo12987a(C0929d dVar) {
            this.f947f = dVar;
            this.f943b.found();
            removeCallbacks(this.f946e);
            removeCallbacks(this.f945d);
            C0878g.m458a();
            C0928b bVar = new C0928b(dVar);
            this.f946e = bVar;
            postDelayed(bVar, 30);
        }
    }

    /* renamed from: c.a.d.b.c$a */
    public static class C0922a extends C0863d {

        /* renamed from: d */
        public final Integer f930d;

        /* renamed from: e */
        public final String f931e;

        /* renamed from: f */
        public C0865e f932f;

        /* renamed from: g */
        public int f933g;

        /* renamed from: h */
        public C0924b f934h;

        /* renamed from: i */
        public int f935i;

        /* renamed from: c.a.d.b.c$a$a */
        public class C0923a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0926c f936a;

            /* renamed from: b */
            public final /* synthetic */ C0911a.C0912a f937b;

            public C0923a(C0922a aVar, C0926c cVar, C0911a.C0912a aVar2) {
                this.f936a = cVar;
                this.f937b = aVar2;
            }

            public void run() {
                this.f936a.mo12995a(this.f937b);
            }
        }

        /* renamed from: c.a.d.b.c$a$b */
        public enum C0924b {
            REQUEST_SESSION,
            REQUEST_ACCESS
        }

        public C0922a(Context context, BluetoothDevice bluetoothDevice, String str, Integer num) {
            super((C0863d.C0864a) null, 10000);
            this.f930d = num;
            this.f931e = str;
            try {
                C0865e eVar = new C0865e(C0862c.m421a(context, bluetoothDevice, new C0878g.C0879a()));
                this.f932f = eVar;
                eVar.mo12959a((C0865e.C0868c) this);
                this.f932f.mo12958a((C0863d) this);
                mo12993c();
            } catch (C0882h.C0885b unused) {
                mo12992a(C0911a.C0912a.UNKNOWN);
            }
        }

        /* renamed from: a */
        public void mo12954a() {
            this.f825c = false;
            this.f933g = 0;
            this.f935i = 0;
            this.f934h = C0924b.REQUEST_SESSION;
        }

        /* renamed from: a */
        public void mo12963a(C0882h.C0885b bVar) {
            mo12992a(C0911a.C0912a.UNKNOWN);
        }

        /* renamed from: b */
        public int mo12956b() {
            return this.f933g;
        }

        /* renamed from: c */
        public final void mo12993c() {
            Api.Firebase firebase = Api.INSTANCE.getFirebase();
            if (firebase != null) {
                firebase.logAndClearCurrentEventIfDefined(Bundle.EMPTY);
            }
        }

        /* renamed from: a */
        public final void mo12992a(C0911a.C0912a aVar) {
            this.f932f.mo12957a();
            this.f932f = null;
            C0926c cVar = C0925b.f941a.f929a;
            if (cVar != null) {
                cVar.post(new C0923a(this, cVar, aVar));
            }
        }

        /* renamed from: a */
        public byte[] mo12955a(C0882h.C0886c cVar) {
            int ordinal = this.f934h.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    return null;
                }
                return this.f930d.intValue() != 0 ? C0878g.m464a(this.f935i, this.f931e) : C0878g.m463a(this.f935i);
            } else if (this.f930d.intValue() == 0) {
                return C0878g.m465a(this.f931e);
            } else {
                return new byte[]{20};
            }
        }

        /* renamed from: a */
        public C0882h.C0885b mo12953a(byte[] bArr) {
            int i;
            C0911a.C0912a aVar;
            try {
                int ordinal = this.f934h.ordinal();
                if (ordinal == 0) {
                    this.f933g = 50;
                    if (this.f930d.intValue() != 0) {
                        if (!C0878g.m461a(bArr)) {
                            return new C0882h.C0885b(6, "Unexpected reply");
                        }
                        if ((ByteBuffer.wrap(bArr, 1, 2).order(ByteOrder.BIG_ENDIAN).asShortBuffer().get() & UShort.MAX_VALUE) != this.f930d.intValue()) {
                            return new C0882h.C0885b(6, "Unexpected companyId");
                        }
                        i = ByteBuffer.wrap(bArr, 3, 2).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get() & UShort.MAX_VALUE;
                    } else if (!C0878g.m467b(bArr)) {
                        return new C0882h.C0885b(6, "Unexpected reply");
                    } else {
                        i = C0878g.m455a(bArr, 1);
                    }
                    this.f935i = i;
                    this.f934h = C0924b.REQUEST_ACCESS;
                } else if (ordinal == 1) {
                    this.f933g = 100;
                    if (!C0878g.m473g(bArr)) {
                        if (!C0878g.m472f(bArr)) {
                            if (!C0878g.m470d(bArr)) {
                                if (!C0878g.m471e(bArr)) {
                                    aVar = C0911a.C0912a.DENIED;
                                    mo12992a(aVar);
                                }
                            }
                            aVar = C0911a.C0912a.ACCEPTED;
                            mo12992a(aVar);
                        }
                    }
                    aVar = C0911a.C0912a.GRANTED;
                    mo12992a(aVar);
                }
                super.mo12953a(bArr);
                return null;
            } catch (Exception e) {
                return new C0882h.C0885b(6, e.toString());
            }
        }
    }
}
