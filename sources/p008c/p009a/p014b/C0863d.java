package p008c.p009a.p014b;

import p008c.p009a.p014b.C0865e;
import p008c.p009a.p014b.C0882h;
import p008c.p009a.p014b.p015i.C0890b;

/* renamed from: c.a.b.d */
public abstract class C0863d extends C0865e.C0869d {

    /* renamed from: a */
    public final C0864a f823a;

    /* renamed from: b */
    public final int f824b;

    /* renamed from: c */
    public boolean f825c;

    /* renamed from: c.a.b.d$a */
    public interface C0864a {
    }

    public C0863d(C0864a aVar) {
        this(aVar, 6000);
    }

    public C0863d(C0864a aVar, int i) {
        this.f823a = aVar;
        this.f824b = i;
    }

    /* renamed from: a */
    public C0882h.C0885b mo12953a(byte[] bArr) {
        C0864a aVar = this.f823a;
        if (aVar != null) {
            mo12956b();
            if (((C0890b.C0892b) aVar) == null) {
                throw null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo12954a() {
        this.f825c = false;
    }

    /* renamed from: a */
    public byte[] mo12955a(C0882h.C0886c cVar) {
        return null;
    }

    /* renamed from: b */
    public abstract int mo12956b();
}
