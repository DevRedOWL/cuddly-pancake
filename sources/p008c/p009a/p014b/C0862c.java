package p008c.p009a.p014b;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import p008c.p009a.p014b.C0878g;
import p008c.p009a.p014b.C0882h;
import p008c.p009a.p031f.C0988c;

/* renamed from: c.a.b.c */
public class C0862c implements C0882h, C0882h.C0887d {

    /* renamed from: a */
    public final Context f818a;

    /* renamed from: b */
    public final BluetoothDevice f819b;

    /* renamed from: c */
    public C0882h.C0883a f820c;

    /* renamed from: d */
    public C0882h f821d;

    /* renamed from: e */
    public long f822e = System.currentTimeMillis();

    public C0862c(Context context, BluetoothDevice bluetoothDevice) {
        this.f818a = context;
        this.f819b = bluetoothDevice;
    }

    /* renamed from: a */
    public void mo12939a() {
        this.f820c = null;
        mo12948a(false);
    }

    /* renamed from: a */
    public void mo12947a(C0882h.C0885b bVar) {
        C0882h.C0887d dVar;
        mo12952e() + "ms | [" + this.f819b.getAddress() + "] Fault=" + bVar.toString();
        C0882h.C0883a aVar = this.f820c;
        if (aVar != null && (dVar = aVar.f864d) != null) {
            dVar.mo12947a(bVar);
        }
    }

    /* renamed from: a */
    public final void mo12948a(boolean z) {
        mo12952e() + "ms | [" + this.f819b.getAddress() + "] Disconnecting";
        C0882h hVar = this.f821d;
        if (hVar != null) {
            hVar.mo12939a();
            this.f821d = null;
        }
        if (z) {
            mo12951d();
        }
    }

    /* renamed from: b */
    public void mo12950b() {
        C0882h.C0887d dVar;
        mo12952e() + "ms | [" + this.f819b.getAddress() + "] Ready";
        C0882h.C0883a aVar = this.f820c;
        if (aVar != null && (dVar = aVar.f864d) != null) {
            dVar.mo12950b();
        }
    }

    /* renamed from: b */
    public void mo12942b(byte[] bArr) {
        C0882h hVar = this.f821d;
        if (hVar != null) {
            hVar.mo12942b(bArr);
            mo12952e() + "ms | [" + this.f819b.getAddress() + "] Sending [" + String.valueOf(bArr.length) + "]: " + C0988c.m582a(bArr);
        }
    }

    /* renamed from: c */
    public void mo12943c() {
        mo12948a(true);
    }

    /* renamed from: d */
    public final void mo12951d() {
        mo12952e() + "ms | [" + this.f819b.getAddress() + "] Connecting";
        C0882h.C0883a aVar = this.f820c;
        if (aVar != null) {
            this.f821d = C0857b.m410a(this.f818a, this.f819b, this, aVar.f863c.f868b);
        }
    }

    /* renamed from: e */
    public final long mo12952e() {
        return System.currentTimeMillis() - this.f822e;
    }

    /* renamed from: a */
    public static C0882h.C0883a m421a(Context context, BluetoothDevice bluetoothDevice, C0871f fVar) {
        C0862c cVar = new C0862c(context, bluetoothDevice);
        if (cVar.f820c == null) {
            C0878g.C0879a aVar = (C0878g.C0879a) fVar;
            cVar.f820c = new C0882h.C0883a(cVar, fVar, new C0882h.C0886c(0, 80));
            cVar.mo12951d();
            return cVar.f820c;
        }
        throw new C0882h.C0885b(4);
    }

    /* renamed from: a */
    public void mo12949a(byte[] bArr) {
        mo12952e() + "ms | [" + this.f819b.getAddress() + "] Read [" + String.valueOf(bArr.length) + "]: " + C0988c.m582a(bArr);
        C0882h.C0883a aVar = this.f820c;
        if (aVar != null) {
            ((C0878g.C0879a) aVar.f862b).mo12970a(bArr);
        }
    }
}
