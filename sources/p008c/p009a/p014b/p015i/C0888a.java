package p008c.p009a.p014b.p015i;

import p008c.p009a.p014b.C0863d;
import p008c.p009a.p014b.C0878g;
import p008c.p009a.p014b.C0882h;
import p008c.p009a.p014b.p015i.C0890b;
import p008c.p009a.p031f.C0988c;

/* renamed from: c.a.b.i.a */
public class C0888a extends C0863d {

    /* renamed from: d */
    public final C0889a f870d;

    /* renamed from: e */
    public final String f871e;

    /* renamed from: f */
    public int f872f;

    /* renamed from: c.a.b.i.a$a */
    public interface C0889a extends C0863d.C0864a {
    }

    public C0888a(C0889a aVar, String str) {
        super(aVar);
        this.f870d = aVar;
        this.f871e = str;
    }

    /* renamed from: a */
    public void mo12954a() {
        this.f825c = false;
        this.f872f = 0;
    }

    /* renamed from: b */
    public int mo12956b() {
        return this.f872f;
    }

    /* renamed from: a */
    public byte[] mo12955a(C0882h.C0886c cVar) {
        String str = this.f871e;
        if (str == null) {
            return new byte[]{12};
        }
        byte[] a = C0988c.m584a(str);
        byte[] bArr = {12, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.arraycopy(a, 0, bArr, 1, Math.min(a.length, 9));
        return bArr;
    }

    /* renamed from: a */
    public C0882h.C0885b mo12953a(byte[] bArr) {
        boolean z = false;
        if (C0878g.m469c(bArr)) {
            String a = (!(C0878g.m469c(bArr) ^ true) && !(bArr[1] == 0 && bArr[2] == 0 && bArr[3] == 0 && bArr[4] == 0 && bArr[5] == 0 && bArr[6] == 0 && bArr[7] == 0 && bArr[8] == 0)) ? C0988c.m583a(bArr, 1, 8) : null;
            if (a != null) {
                C0889a aVar = this.f870d;
                C0890b.C0892b bVar = (C0890b.C0892b) aVar;
                bVar.obtainMessage(2, C0890b.C0892b.C0893a.ENCRYPTED.equals(bVar.f875a) ? 1 : 0, 0, a + C0988c.m583a(bArr, 9, 1)).sendToTarget();
            } else {
                ((C0890b.C0892b) this.f870d).obtainMessage(3).sendToTarget();
            }
            this.f872f = 100;
            super.mo12953a(bArr);
            return null;
        }
        if ((bArr.length == 2) && (bArr[0] == 13) && bArr[1] == 0) {
            return new C0882h.C0885b(9);
        }
        if (bArr.length == 2 && bArr[0] == 13 && bArr[1] == 3) {
            z = true;
        }
        return z ? new C0882h.C0885b(10) : new C0882h.C0885b(6);
    }
}
