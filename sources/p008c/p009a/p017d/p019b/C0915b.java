package p008c.p009a.p017d.p019b;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelUuid;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.mobileid.Api;
import org.mobileid.access.key.Key;
import org.mobileid.access.key.KeyJavaBridge;
import p008c.p009a.p010a.p012e.C0844b;
import p008c.p009a.p014b.C0878g;
import p008c.p009a.p017d.p019b.C0911a;
import p008c.p009a.p017d.p019b.C0929d;
import p008c.p009a.p017d.p023e.C0956d;
import p008c.p009a.p031f.C0985a;
import p008c.p009a.p031f.C0986b;
import p008c.p009a.p031f.C0988c;

/* renamed from: c.a.d.b.b */
public class C0915b {

    /* renamed from: a */
    public volatile C0917b f912a;

    /* renamed from: c.a.d.b.b$a */
    public static class C0916a {

        /* renamed from: a */
        public static final C0915b f913a = new C0915b();
    }

    /* renamed from: c.a.d.b.b$b */
    public static class C0917b extends Handler implements C0929d.C0932c {

        /* renamed from: k */
        public static final AdvertiseSettings f914k = new AdvertiseSettings.Builder().setAdvertiseMode(2).setTxPowerLevel(3).setConnectable(false).build();

        /* renamed from: l */
        public static final byte[] f915l = C0988c.m584a("0b6bf54eb044d62a9e1a40c4e7a2d699d9d25a300c91da8afc3fab47a456887a7dc1032f4f1d69cff35b48d4678c7db5ba1282e03e9f5258313d5b189e732aaa355eb154ec3f1a705b0d7c7e7fac28b0a9d2b18b7bb3bc24a71c8a8a081b90534ef46e443dc7700004796ff846b16f4960d5f0b12db36f71ae80fa26c90f26568238601c8c41be2b04745a1118b13a126725c63fba8753509dbd85afebdebb156dc3f2724623023b749da9c08a9838037a08b682b5a113b40d741602012287ac4cb5d12ad15e137a64c92c9370ddfc921f7fc6614784609595c0cebc039f3019ab81bfd79cb9312a24543f8b78ec4920016f5110a768bce0e490702c22dbf625");

        /* renamed from: a */
        public final C0956d f916a;

        /* renamed from: b */
        public final C0844b f917b;

        /* renamed from: c */
        public final long f918c = System.currentTimeMillis();

        /* renamed from: d */
        public Runnable f919d;

        /* renamed from: e */
        public C0929d f920e;

        /* renamed from: f */
        public BluetoothLeAdvertiser f921f;

        /* renamed from: g */
        public byte f922g;

        /* renamed from: h */
        public String f923h;

        /* renamed from: i */
        public String f924i;

        /* renamed from: j */
        public final AdvertiseCallback f925j = new C0919b();

        /* renamed from: c.a.d.b.b$b$a */
        public class C0918a implements Runnable {
            public C0918a() {
            }

            public void run() {
                C0917b.this.mo12984a() + "ms | Stopping Scanner by timeout...";
                C0917b bVar = C0917b.this;
                bVar.removeCallbacks(bVar.f919d);
                C0878g.m458a();
                C0917b bVar2 = C0917b.this;
                if (bVar2.f920e == null) {
                    bVar2.mo12986a(C0911a.C0912a.UNKNOWN);
                }
            }
        }

        /* renamed from: c.a.d.b.b$b$b */
        public class C0919b extends AdvertiseCallback {

            /* renamed from: c.a.d.b.b$b$b$a */
            public class C0920a implements Runnable {
                public C0920a() {
                }

                public void run() {
                    C0917b.this.mo12986a(C0911a.C0912a.UNKNOWN);
                }
            }

            public C0919b() {
            }

            public void onStartFailure(int i) {
                C0917b.this.mo12984a() + "ms | Advertiser Error: " + i;
                C0917b.this.mo12986a(C0911a.C0912a.UNKNOWN);
            }

            public void onStartSuccess(AdvertiseSettings advertiseSettings) {
                C0917b.this.mo12984a() + "ms | Advertiser started";
                C0917b bVar = C0917b.this;
                bVar.removeCallbacks(bVar.f919d);
                C0917b bVar2 = C0917b.this;
                C0920a aVar = new C0920a();
                bVar2.f919d = aVar;
                bVar2.postDelayed(aVar, 1000);
            }
        }

        public C0917b(boolean z, C0844b bVar, C0956d dVar) {
            this.f916a = dVar;
            this.f917b = bVar;
            mo12984a() + "ms | Starting...";
            C0878g.m460a((C0929d.C0932c) this, bVar.mo12926a(z));
            C0918a aVar = new C0918a();
            this.f919d = aVar;
            postDelayed(aVar, 2200);
            this.f916a.started();
        }

        /* renamed from: a */
        public final long mo12984a() {
            return System.currentTimeMillis() - this.f918c;
        }

        /* renamed from: a */
        public final ParcelUuid mo12985a(byte[] bArr, int i) {
            byte[] bArr2 = bArr;
            int i2 = i;
            if (bArr2.length >= 8) {
                byte[] bArr3 = new byte[16];
                bArr3[0] = (byte) (i2 & 255);
                bArr3[1] = (byte) ((i2 >> 8) & 255);
                bArr3[2] = (byte) ((i2 >> 16) & 255);
                bArr3[3] = (byte) ((i2 >> 24) & 255);
                bArr3[4] = bArr2[0];
                bArr3[5] = bArr2[1];
                bArr3[6] = bArr2[2];
                bArr3[7] = bArr2[3];
                bArr3[8] = bArr2[4];
                bArr3[9] = bArr2[5];
                bArr3[10] = bArr2[6];
                bArr3[11] = bArr2[7];
                bArr3[12] = bArr2.length > 8 ? bArr2[8] : C0985a.Dallas.mo13041a(bArr2, 0, 7);
                bArr3[13] = 0;
                bArr3[14] = 0;
                bArr3[15] = C0985a.Dallas.mo13041a(bArr3, 0, 14);
                C0986b.C0987a aVar = r0;
                C0986b.C0987a aVar2 = new C0986b.C0987a(i, 1620462276, -1490187195, 1124710742, -1374507497, -2067643655, -1440596042, -591548382);
                System.arraycopy(C0986b.m581b(aVar, Arrays.copyOfRange(bArr3, 2, 10)), 0, bArr3, 2, 8);
                byte b = bArr3[9];
                byte b2 = bArr3[10];
                byte[] bArr4 = f915l;
                int i3 = b + 1;
                bArr3[10] = (byte) (bArr4[b & 255] ^ b2);
                int i4 = i3 + 1;
                bArr3[11] = (byte) (bArr3[11] ^ bArr4[i3 & 255]);
                int i5 = i4 + 1;
                bArr3[12] = (byte) (bArr4[i4 & 255] ^ bArr3[12]);
                int i6 = i5 + 1;
                bArr3[13] = (byte) (bArr3[13] ^ bArr4[i5 & 255]);
                bArr3[14] = (byte) (bArr3[14] ^ bArr4[i6 & 255]);
                bArr3[15] = (byte) (bArr3[15] ^ bArr4[(i6 + 1) & 255]);
                this.f922g = bArr3[15];
                mo12984a() + "ms | Advertiser data=" + C0988c.m582a(bArr3);
                return new ParcelUuid(new UUID(C0878g.m466b(bArr3, 8), C0878g.m466b(bArr3, 0)));
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: a */
        public final void mo12986a(C0911a.C0912a aVar) {
            mo12984a() + "ms | Finishing... " + aVar.toString();
            removeCallbacks(this.f919d);
            C0878g.m458a();
            BluetoothLeAdvertiser bluetoothLeAdvertiser = this.f921f;
            if (bluetoothLeAdvertiser != null) {
                bluetoothLeAdvertiser.stopAdvertising(this.f925j);
            }
            if (this.f923h != null) {
                BluetoothAdapter.getDefaultAdapter().setName(this.f923h);
            }
            this.f916a.result(aVar);
            C0916a.f913a.f912a = null;
            this.f920e = null;
        }

        /* renamed from: a */
        public void mo12987a(C0929d dVar) {
            this.f920e = dVar;
            if (this.f921f != null) {
                mo12984a() + "ms | Checking, state=" + this.f920e.f903c + ", address=" + Integer.toString(this.f920e.f958l & 255, 16) + " (" + Integer.toString(this.f922g & 255, 16) + ")";
                C0929d dVar2 = this.f920e;
                C0911a.C0912a aVar = dVar2.f903c;
                if (aVar != C0911a.C0912a.UNKNOWN && dVar2.f958l == this.f922g) {
                    mo12986a(aVar);
                    return;
                }
                return;
            }
            try {
                mo12984a() + "ms | Advertiser starting..." + this.f920e.f951e.getName();
                List<Key> a = this.f917b.mo12925a((C0911a) dVar);
                if (a.isEmpty()) {
                    mo12986a(C0911a.C0912a.EMPTY);
                    return;
                }
                String mobileId = new KeyJavaBridge(a.get(0)).getMobileId();
                BluetoothLeAdvertiser bluetoothLeAdvertiser = BluetoothAdapter.getDefaultAdapter() == null ? null : BluetoothAdapter.getDefaultAdapter().getBluetoothLeAdvertiser();
                this.f921f = bluetoothLeAdvertiser;
                if (bluetoothLeAdvertiser == null) {
                    mo12986a(C0911a.C0912a.UNKNOWN);
                    return;
                }
                if (Build.VERSION.SDK_INT < 23) {
                    this.f923h = BluetoothAdapter.getDefaultAdapter().getName();
                    BluetoothAdapter.getDefaultAdapter().setName("A1");
                }
                this.f921f.startAdvertising(f914k, new AdvertiseData.Builder().addServiceUuid(mo12985a(C0988c.m584a(mobileId), this.f920e.f959m)).setIncludeDeviceName(false).setIncludeTxPowerLevel(false).build(), this.f925j);
                Api.Firebase firebase = Api.INSTANCE.getFirebase();
                if (firebase != null) {
                    firebase.logAndClearCurrentEventIfDefined(Bundle.EMPTY);
                }
                this.f924i = this.f920e.f951e.getAddress();
                mo12984a() + "ms | Monitor started: " + this.f924i;
                String str = this.f924i;
                C0929d.C0930a aVar2 = C0878g.f853a;
                if (aVar2 != null) {
                    aVar2.f966d = str;
                    this.f916a.found();
                    return;
                }
                throw new IllegalStateException();
            } catch (Exception unused) {
                mo12986a(C0911a.C0912a.UNKNOWN);
            }
        }
    }
}
