package p008c.p009a.p014b;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Queue;
import p008c.p009a.p014b.C0878g;
import p008c.p009a.p014b.C0882h;

/* renamed from: c.a.b.e */
public class C0865e {

    /* renamed from: a */
    public ArrayList<C0868c> f826a;

    /* renamed from: b */
    public C0867b f827b;

    /* renamed from: c */
    public volatile C0882h.C0883a f828c;

    /* renamed from: c.a.b.e$c */
    public interface C0868c {
        /* renamed from: a */
        C0882h.C0885b mo12953a(byte[] bArr);

        /* renamed from: a */
        void mo12963a(C0882h.C0885b bVar);
    }

    /* renamed from: c.a.b.e$d */
    public static class C0869d implements C0868c {
        /* renamed from: a */
        public void mo12963a(C0882h.C0885b bVar) {
        }
    }

    /* renamed from: c.a.b.e$e */
    public static class C0870e extends Handler {

        /* renamed from: a */
        public final WeakReference<C0867b> f839a;

        public C0870e(C0867b bVar) {
            this.f839a = new WeakReference<>(bVar);
        }

        /* renamed from: a */
        public static void m447a(C0870e eVar) {
            eVar.removeMessages(2);
            eVar.f839a.clear();
        }

        public void handleMessage(Message message) {
            C0867b bVar;
            if (message.what == 2 && (bVar = (C0867b) this.f839a.get()) != null) {
                C0863d dVar = (C0863d) message.obj;
                int i = message.arg1;
                if (bVar.mo12962a(dVar)) {
                    return;
                }
                if (dVar != bVar.f835g && !bVar.f831c.contains(dVar)) {
                    return;
                }
                if (dVar.mo12956b() > i) {
                    m448a(bVar.f833e, dVar, dVar.mo12956b());
                } else {
                    bVar.mo12947a(new C0882h.C0885b(7));
                }
            }
        }

        /* renamed from: a */
        public static void m448a(C0870e eVar, C0863d dVar, int i) {
            if (eVar == null) {
                throw null;
            } else if (dVar.f824b > 0) {
                eVar.sendMessageDelayed(eVar.obtainMessage(2, i, 0, dVar), (long) dVar.f824b);
            }
        }
    }

    public C0865e(C0882h.C0883a aVar) {
        if (!mo12960b()) {
            this.f827b = new C0867b(aVar.mo12974b(), aVar.mo12972a());
            this.f828c = aVar;
            this.f828c.mo12973a(this.f827b);
            return;
        }
        throw new C0882h.C0885b(4);
    }

    /* renamed from: a */
    public void mo12957a() {
        if (this.f828c != null) {
            C0867b bVar = this.f827b;
            C0870e.m447a(bVar.f833e);
            bVar.f831c.clear();
            bVar.f835g = null;
            bVar.f834f = 0;
            bVar.f836h = false;
            this.f828c.f864d = null;
            this.f828c.f861a.mo12939a();
            this.f828c = null;
            this.f827b = null;
            this.f826a = null;
        }
    }

    /* renamed from: a */
    public void mo12959a(C0868c cVar) {
        if (this.f826a == null) {
            this.f826a = new ArrayList<>();
        }
        this.f826a.add(cVar);
    }

    /* renamed from: b */
    public boolean mo12960b() {
        return this.f828c != null;
    }

    /* renamed from: a */
    public void mo12958a(C0863d dVar) {
        if (this.f828c != null) {
            C0867b bVar = this.f827b;
            bVar.f831c.add(dVar);
            C0870e.m448a(bVar.f833e, dVar, dVar.mo12956b());
            dVar.mo12954a();
            C0863d dVar2 = bVar.f835g;
            if (dVar2 == null || bVar.mo12962a(dVar2)) {
                bVar.mo12961a();
                return;
            }
            return;
        }
        throw new C0882h.C0885b(4);
    }

    /* renamed from: c.a.b.e$b */
    public class C0867b implements C0882h.C0887d {

        /* renamed from: a */
        public final C0882h.C0886c f829a;

        /* renamed from: b */
        public final C0871f f830b;

        /* renamed from: c */
        public final Queue<C0863d> f831c = new ArrayDeque();

        /* renamed from: d */
        public final byte[] f832d;

        /* renamed from: e */
        public final C0870e f833e;

        /* renamed from: f */
        public int f834f;

        /* renamed from: g */
        public C0863d f835g;

        /* renamed from: h */
        public boolean f836h;

        /* renamed from: i */
        public int f837i;

        public C0867b(C0871f fVar, C0882h.C0886c cVar) {
            this.f829a = cVar;
            this.f830b = fVar;
            this.f833e = new C0870e(this);
            ((C0878g.C0879a) this.f830b).mo12968a();
            this.f832d = new byte[80];
        }

        /* renamed from: a */
        public void mo12947a(C0882h.C0885b bVar) {
            boolean z = true;
            if (bVar.f866a != 5 || this.f837i >= this.f829a.f867a) {
                ArrayList<C0868c> arrayList = C0865e.this.f826a;
                if (arrayList != null) {
                    Iterator<C0868c> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().mo12963a(bVar);
                    }
                }
                if (bVar.f866a != 8) {
                    z = false;
                }
                if (!z) {
                    C0865e.this.mo12957a();
                    return;
                }
                return;
            }
            C0865e eVar = C0865e.this;
            if (eVar.f828c != null) {
                eVar.f828c.f861a.mo12943c();
                C0867b bVar2 = eVar.f827b;
                bVar2.f834f = 0;
                bVar2.f836h = false;
            }
            this.f837i++;
            mo12961a();
        }

        /* renamed from: b */
        public void mo12950b() {
            this.f836h = true;
            mo12961a();
        }

        /* renamed from: a */
        public final boolean mo12962a(C0863d dVar) {
            if ((dVar.mo12956b() >= 100) || dVar.f825c) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo12961a() {
            if (this.f836h) {
                C0863d dVar = this.f835g;
                if (dVar == null || mo12962a(dVar)) {
                    this.f829a.f869c = false;
                    this.f835g = this.f831c.poll();
                }
                if (this.f835g != null) {
                    if (C0865e.this.f828c == null) {
                        mo12947a(new C0882h.C0885b(4));
                        return;
                    }
                    C0863d dVar2 = this.f835g;
                    this.f834f = 0;
                    byte[] a = dVar2.mo12955a(this.f829a);
                    if (a != null) {
                        byte[] a2 = ((C0878g.C0879a) this.f830b).mo12971a(a, this.f829a);
                        int length = a2.length;
                        byte[] bArr = this.f832d;
                        int length2 = bArr.length;
                        int i = this.f834f;
                        if (length > length2 - i) {
                            mo12947a(new C0882h.C0885b(4, "Buffer is full"));
                        } else {
                            System.arraycopy(a2, 0, bArr, i, a2.length);
                            this.f834f += a2.length;
                        }
                    }
                    if (this.f834f > 0) {
                        C0865e.this.f828c.f861a.mo12942b(Arrays.copyOfRange(this.f832d, 0, this.f834f));
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo12949a(byte[] bArr) {
            C0863d dVar = this.f835g;
            if (dVar != null) {
                C0882h.C0885b a = dVar.mo12953a(bArr);
                if (a != null) {
                    mo12947a(a);
                }
            } else {
                ArrayList<C0868c> arrayList = C0865e.this.f826a;
                if (arrayList != null) {
                    Iterator<C0868c> it = arrayList.iterator();
                    while (it.hasNext()) {
                        C0882h.C0885b a2 = it.next().mo12953a(bArr);
                        if (a2 != null) {
                            mo12947a(a2);
                        }
                    }
                }
            }
            if (dVar == this.f835g) {
                mo12961a();
            }
        }
    }
}
