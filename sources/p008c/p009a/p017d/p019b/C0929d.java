package p008c.p009a.p017d.p019b;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.os.Build;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p008c.p009a.p017d.p019b.C0911a;
import p008c.p009a.p031f.C0988c;

/* renamed from: c.a.d.b.d */
public class C0929d extends C0911a {

    /* renamed from: e */
    public final BluetoothDevice f951e;

    /* renamed from: f */
    public final double f952f;

    /* renamed from: g */
    public final int f953g;

    /* renamed from: h */
    public int[] f954h = new int[10];

    /* renamed from: i */
    public int f955i = 0;

    /* renamed from: j */
    public int f956j = 0;

    /* renamed from: k */
    public double f957k;

    /* renamed from: l */
    public byte f958l;

    /* renamed from: m */
    public int f959m;

    /* renamed from: c.a.d.b.d$a */
    public static class C0930a extends ScanCallback {

        /* renamed from: g */
        public static final byte[] f960g = C0988c.m584a("6DBA3E9EF6E04B65B6A81C259E306918");

        /* renamed from: h */
        public static final byte[] f961h = C0988c.m584a("02156DBA3E9EF6E04B65B6A81C259E306918");

        /* renamed from: i */
        public static final ScanSettings f962i = new ScanSettings.Builder().setScanMode(2).build();

        /* renamed from: a */
        public final long f963a;

        /* renamed from: b */
        public final C0911a.C0914c f964b;

        /* renamed from: c */
        public final HashMap<BluetoothDevice, C0929d> f965c = new HashMap<>();

        /* renamed from: d */
        public String f966d;

        /* renamed from: e */
        public C0932c f967e;

        /* renamed from: f */
        public C0929d f968f;

        public C0930a(C0932c cVar, C0911a.C0914c cVar2) {
            this.f967e = cVar;
            this.f964b = cVar2;
            this.f963a = System.currentTimeMillis();
            List list = null;
            BluetoothLeScanner bluetoothLeScanner = BluetoothAdapter.getDefaultAdapter() == null ? null : BluetoothAdapter.getDefaultAdapter().getBluetoothLeScanner();
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.startScan(Build.VERSION.SDK_INT >= 27 ? Collections.singletonList(new ScanFilter.Builder().setManufacturerData(76, f961h).build()) : list, f962i, this);
                return;
            }
            throw new IllegalStateException("Bluetooth scanner not ready");
        }

        /* renamed from: a */
        public static void m514a(C0930a aVar) {
            aVar.mo12999b() + "ms | Closing...";
            if (aVar.f968f != null) {
                String.format(aVar.mo12999b() + "ms | Accepted On close: %s: %.2fm / %.2fm", new Object[]{aVar.f968f.f951e.getName(), Double.valueOf(aVar.f968f.f957k), Double.valueOf(aVar.f968f.f952f)});
                aVar.mo12998a();
            }
            aVar.f967e = null;
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                BluetoothLeScanner bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner();
                if (bluetoothLeScanner != null) {
                    bluetoothLeScanner.stopScan(aVar);
                }
                defaultAdapter.cancelDiscovery();
            }
        }

        /* renamed from: a */
        public final void mo12998a() {
            C0929d dVar;
            C0932c cVar = this.f967e;
            if (cVar != null && (dVar = this.f968f) != null) {
                this.f968f = null;
                cVar.mo12987a(dVar);
            }
        }

        /* renamed from: b */
        public final long mo12999b() {
            return System.currentTimeMillis() - this.f963a;
        }

        public void onBatchScanResults(List<ScanResult> list) {
            for (ScanResult onScanResult : list) {
                onScanResult(0, onScanResult);
            }
        }

        public void onScanFailed(int i) {
            mo12999b() + "ms | Scanning error " + i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:106:0x01b3  */
        /* JADX WARNING: Removed duplicated region for block: B:160:0x0118 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00a2  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00a9  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0169  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onScanResult(int r19, android.bluetooth.le.ScanResult r20) {
            /*
                r18 = this;
                r0 = r18
                android.bluetooth.le.ScanRecord r1 = r20.getScanRecord()
                if (r1 == 0) goto L_0x037e
                java.lang.String r1 = r0.f966d
                if (r1 == 0) goto L_0x001a
                android.bluetooth.BluetoothDevice r2 = r20.getDevice()
                java.lang.String r2 = r2.getAddress()
                boolean r1 = android.text.TextUtils.equals(r1, r2)
                if (r1 == 0) goto L_0x037e
            L_0x001a:
                android.bluetooth.BluetoothDevice r1 = r20.getDevice()
                android.bluetooth.le.ScanRecord r2 = r20.getScanRecord()
                byte[] r2 = r2.getBytes()
                int r9 = r20.getRssi()
                r3 = -128(0xffffffffffffff80, float:NaN)
                r4 = 5
                c.a.d.b.a$a r5 = p008c.p009a.p017d.p019b.C0911a.C0912a.UNKNOWN
                r12 = r5
                r3 = 0
                r6 = -128(0xffffffffffffff80, float:NaN)
                r7 = 0
                r11 = 0
                r13 = 0
            L_0x0036:
                int r5 = r2.length
                r15 = 4
                if (r3 >= r5) goto L_0x011e
                int r5 = r3 + 1
                byte r3 = r2[r3]
                r14 = 255(0xff, float:3.57E-43)
                r3 = r3 & r14
                if (r3 != 0) goto L_0x0045
                goto L_0x011e
            L_0x0045:
                int r3 = r3 + -1
                int r16 = r5 + 1
                byte r5 = r2[r5]
                r5 = r5 & r14
                r10 = 22
                if (r5 == r10) goto L_0x00ea
                if (r5 == r14) goto L_0x0056
                r17 = r9
                goto L_0x0118
            L_0x0056:
                if (r3 <= r15) goto L_0x00a4
                byte r5 = r2[r16]
                r10 = 76
                if (r5 != r10) goto L_0x00a4
                int r5 = r16 + 1
                byte r5 = r2[r5]
                if (r5 != 0) goto L_0x00a4
                int r5 = r16 + 2
                byte r5 = r2[r5]
                r10 = 2
                if (r5 != r10) goto L_0x00a4
                int r5 = r16 + 3
                byte r5 = r2[r5]
                r10 = 21
                if (r5 < r10) goto L_0x00a4
                int r5 = r16 + 4
                byte[] r10 = f960g
                int r15 = r5 + 16
                int r8 = r2.length
                if (r15 > r8) goto L_0x009d
                int r8 = r10.length
                r15 = 16
                if (r15 <= r8) goto L_0x0082
                goto L_0x009d
            L_0x0082:
                r8 = 0
            L_0x0083:
                if (r15 <= 0) goto L_0x0099
                byte r14 = r2[r5]
                r17 = r9
                byte r9 = r10[r8]
                if (r14 == r9) goto L_0x008e
                goto L_0x009f
            L_0x008e:
                int r15 = r15 + -1
                int r5 = r5 + 1
                int r8 = r8 + 1
                r9 = r17
                r14 = 255(0xff, float:3.57E-43)
                goto L_0x0083
            L_0x0099:
                r17 = r9
                r5 = 1
                goto L_0x00a0
            L_0x009d:
                r17 = r9
            L_0x009f:
                r5 = 0
            L_0x00a0:
                if (r5 == 0) goto L_0x00a6
                r5 = 1
                goto L_0x00a7
            L_0x00a4:
                r17 = r9
            L_0x00a6:
                r5 = 0
            L_0x00a7:
                if (r5 == 0) goto L_0x0118
                int r5 = r16 + 20
                int r6 = r2.length
                int r7 = r5 + 2
                if (r6 >= r7) goto L_0x00b2
                r7 = 0
                goto L_0x00c2
            L_0x00b2:
                byte r6 = r2[r5]
                r7 = 255(0xff, float:3.57E-43)
                r6 = r6 & r7
                r8 = 8
                int r6 = r6 << r8
                int r5 = r5 + 1
                byte r5 = r2[r5]
                r5 = r5 & r7
                r10 = r6 | r5
                r7 = r10
            L_0x00c2:
                int r5 = r16 + 22
                byte r5 = r2[r5]
                int r6 = r16 + 23
                byte r6 = r2[r6]
                r6 = r6 & 7
                r8 = 1
                if (r6 == r8) goto L_0x00e2
                r10 = 2
                if (r6 == r10) goto L_0x00df
                r8 = 3
                if (r6 == r8) goto L_0x00dc
                r8 = 4
                if (r6 == r8) goto L_0x00d9
                goto L_0x00e4
            L_0x00d9:
                c.a.d.b.a$a r12 = p008c.p009a.p017d.p019b.C0911a.C0912a.ACCEPTED
                goto L_0x00e4
            L_0x00dc:
                c.a.d.b.a$a r12 = p008c.p009a.p017d.p019b.C0911a.C0912a.UNIDENTIFIED
                goto L_0x00e4
            L_0x00df:
                c.a.d.b.a$a r12 = p008c.p009a.p017d.p019b.C0911a.C0912a.DENIED
                goto L_0x00e4
            L_0x00e2:
                c.a.d.b.a$a r12 = p008c.p009a.p017d.p019b.C0911a.C0912a.GRANTED
            L_0x00e4:
                int r6 = r16 + 24
                byte r6 = r2[r6]
                r13 = r5
                goto L_0x0118
            L_0x00ea:
                r17 = r9
                r5 = 8
                if (r3 < r5) goto L_0x0118
                int r5 = r2.length
                int r8 = r16 + 2
                if (r5 >= r8) goto L_0x00f9
                r8 = 255(0xff, float:3.57E-43)
                r10 = 0
                goto L_0x0108
            L_0x00f9:
                byte r5 = r2[r16]
                r8 = 255(0xff, float:3.57E-43)
                r5 = r5 & r8
                int r9 = r16 + 1
                byte r9 = r2[r9]
                r9 = r9 & r8
                r10 = 8
                int r9 = r9 << r10
                r10 = r5 | r9
            L_0x0108:
                r5 = 4353(0x1101, float:6.1E-42)
                if (r10 != r5) goto L_0x0118
                int r4 = r16 + 3
                byte r4 = r2[r4]
                r4 = r4 & r8
                int r5 = r16 + 4
                int r5 = p008c.p009a.p014b.C0878g.m455a((byte[]) r2, (int) r5)
                r11 = r5
            L_0x0118:
                int r3 = r16 + r3
                r9 = r17
                goto L_0x0036
            L_0x011e:
                r17 = r9
                r10 = 2
                if (r11 == 0) goto L_0x037e
                java.util.HashMap<android.bluetooth.BluetoothDevice, c.a.d.b.d> r2 = r0.f965c
                java.lang.Object r2 = r2.get(r1)
                c.a.d.b.d r2 = (p008c.p009a.p017d.p019b.C0929d) r2
                if (r2 != 0) goto L_0x01b0
                java.lang.String r3 = r1.getName()
                c.a.d.b.a$c r8 = new c.a.d.b.a$c
                r8.<init>()
                if (r3 == 0) goto L_0x016f
                int r5 = r3.length()
                r9 = 4
                if (r5 <= r9) goto L_0x016f
                char r5 = r3.charAt(r9)
                r9 = 99
                if (r5 == r9) goto L_0x015a
                r9 = 101(0x65, float:1.42E-43)
                if (r5 == r9) goto L_0x0158
                r9 = 110(0x6e, float:1.54E-43)
                if (r5 == r9) goto L_0x0156
                r9 = 112(0x70, float:1.57E-43)
                if (r5 == r9) goto L_0x0154
                goto L_0x0160
            L_0x0154:
                r5 = 0
                goto L_0x015b
            L_0x0156:
                r5 = 1
                goto L_0x015b
            L_0x0158:
                r5 = 2
                goto L_0x015b
            L_0x015a:
                r5 = 3
            L_0x015b:
                java.util.BitSet r9 = r8.f911a
                r9.set(r5)
            L_0x0160:
                r5 = 3
                char r3 = r3.charAt(r5)
                r5 = 98
                if (r3 != r5) goto L_0x016f
                java.util.BitSet r3 = r8.f911a
                r5 = 4
                r3.set(r5)
            L_0x016f:
                c.a.d.b.a$c r3 = r0.f964b
                java.lang.String r5 = "lookup"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r5)
                java.util.BitSet r5 = r8.f911a
                java.util.BitSet r9 = r3.f911a
                boolean r5 = r5.intersects(r9)
                if (r5 == 0) goto L_0x019b
                java.util.BitSet r5 = r8.f911a
                r9 = 4
                boolean r5 = r5.get(r9)
                if (r5 == 0) goto L_0x0199
                java.util.BitSet r5 = r8.f911a
                boolean r5 = r5.get(r9)
                if (r5 == 0) goto L_0x019b
                java.util.BitSet r3 = r3.f911a
                boolean r3 = r3.get(r9)
                if (r3 == 0) goto L_0x019b
            L_0x0199:
                r3 = 1
                goto L_0x019c
            L_0x019b:
                r3 = 0
            L_0x019c:
                if (r3 == 0) goto L_0x01b0
                java.util.HashMap<android.bluetooth.BluetoothDevice, c.a.d.b.d> r9 = r0.f965c
                c.a.d.b.d r14 = new c.a.d.b.d
                double r2 = (double) r4
                r4 = 4621819117588971520(0x4024000000000000, double:10.0)
                double r4 = r2 / r4
                r2 = r14
                r3 = r1
                r2.<init>(r3, r4, r6, r7, r8)
                r9.put(r1, r14)
                goto L_0x01b1
            L_0x01b0:
                r14 = r2
            L_0x01b1:
                if (r14 == 0) goto L_0x037e
                r14.f959m = r11
                java.lang.String r1 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
                r14.f903c = r12
                r14.f958l = r13
                int r1 = p008c.p009a.p017d.p019b.C0929d.C0931b.f969a
                int r9 = r17 + r1
                int r1 = r14.f956j
                int[] r2 = r14.f954h
                int r2 = r2.length
                if (r1 != r2) goto L_0x01cd
                r1 = 0
                r14.f956j = r1
                goto L_0x01ce
            L_0x01cd:
                r1 = 0
            L_0x01ce:
                int[] r2 = r14.f954h
                int r3 = r14.f956j
                r2[r3] = r9
                r4 = 1
                int r3 = r3 + r4
                r14.f956j = r3
                int r3 = r14.f955i
                int r3 = r3 + r4
                r14.f955i = r3
                int[] r2 = java.util.Arrays.copyOfRange(r2, r1, r3)
                java.util.Arrays.sort(r2)
                int r1 = r2.length
                int r1 = r1 % r10
                if (r1 != 0) goto L_0x01f9
                int r1 = r2.length
                int r1 = r1 / r10
                r1 = r2[r1]
                double r3 = (double) r1
                int r1 = r2.length
                int r1 = r1 / r10
                r5 = 1
                int r1 = r1 - r5
                r1 = r2[r1]
                double r1 = (double) r1
                double r3 = r3 + r1
                r1 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r3 = r3 / r1
                goto L_0x01fe
            L_0x01f9:
                int r1 = r2.length
                int r1 = r1 / r10
                r1 = r2[r1]
                double r3 = (double) r1
            L_0x01fe:
                int r1 = r14.f953g
                double r1 = (double) r1
                double r3 = r3 / r1
                double r1 = java.lang.Math.abs(r3)
                r3 = 4605200834963974390(0x3fe8f5c28f5c28f6, double:0.78)
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 >= 0) goto L_0x021d
                r3 = 4621706527598287258(0x402399999999999a, double:9.8)
                double r1 = java.lang.Math.pow(r1, r3)
            L_0x0218:
                double r1 = java.lang.Math.abs(r1)
                goto L_0x0249
            L_0x021d:
                r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                r5 = 4591942237660995650(0x3fb9db22d0e56042, double:0.101)
                int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r7 >= 0) goto L_0x0237
                r3 = 4622832427505129882(0x402799999999999a, double:11.8)
                double r1 = java.lang.Math.pow(r1, r3)
                r3 = 4606011482896901079(0x3febd70a3d70a3d7, double:0.87)
                goto L_0x0245
            L_0x0237:
                r3 = 4621650232602945126(0x4023666666666666, double:9.7)
                double r1 = java.lang.Math.pow(r1, r3)
                r3 = 4606101554889448489(0x3fec28f5c28f5c29, double:0.88)
            L_0x0245:
                double r1 = r1 * r3
                double r1 = r1 + r5
                goto L_0x0218
            L_0x0249:
                r14.f957k = r1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                long r2 = r18.mo12999b()
                r1.append(r2)
                java.lang.String r2 = "ms | Found %s: %.2fm (%d) | companyId = %d"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                android.bluetooth.BluetoothDevice r3 = r14.f951e
                java.lang.String r3 = r3.getName()
                r4 = 0
                r2[r4] = r3
                double r3 = r14.f957k
                java.lang.Double r3 = java.lang.Double.valueOf(r3)
                r4 = 1
                r2[r4] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
                r2[r10] = r3
                int r3 = r14.f902b
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 3
                r2[r4] = r3
                java.lang.String.format(r1, r2)
                c.a.d.b.d$c r1 = r0.f967e
                if (r1 == 0) goto L_0x0294
                java.lang.String r2 = r0.f966d
                if (r2 == 0) goto L_0x0294
                r1.mo12987a(r14)
                goto L_0x037e
            L_0x0294:
                r1 = 0
                r0.f968f = r1
                java.util.HashMap<android.bluetooth.BluetoothDevice, c.a.d.b.d> r1 = r0.f965c
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L_0x02a1:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x02da
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r2 = r2.getValue()
                c.a.d.b.d r2 = (p008c.p009a.p017d.p019b.C0929d) r2
                boolean r3 = p008c.p009a.p017d.p019b.C0929d.m513a(r2)
                if (r3 == 0) goto L_0x02bd
                c.a.d.b.d r3 = r0.f968f
                if (r3 == 0) goto L_0x02d7
            L_0x02bd:
                c.a.d.b.d r3 = r0.f968f
                if (r3 == 0) goto L_0x02a1
                boolean r3 = p008c.p009a.p017d.p019b.C0929d.m513a(r3)
                if (r3 == 0) goto L_0x02a1
                boolean r3 = p008c.p009a.p017d.p019b.C0929d.m513a(r2)
                if (r3 == 0) goto L_0x02a1
                double r3 = r2.f957k
                c.a.d.b.d r5 = r0.f968f
                double r5 = r5.f957k
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 >= 0) goto L_0x02a1
            L_0x02d7:
                r0.f968f = r2
                goto L_0x02a1
            L_0x02da:
                c.a.d.b.d$c r1 = r0.f967e
                if (r1 == 0) goto L_0x037e
                c.a.d.b.d r1 = r0.f968f
                if (r1 == 0) goto L_0x037e
                double r1 = r1.f952f
                r3 = 4603579539098121011(0x3fe3333333333333, double:0.6)
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 > 0) goto L_0x0336
                long r1 = r18.mo12999b()
                r3 = 310(0x136, double:1.53E-321)
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 < 0) goto L_0x0336
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                long r2 = r18.mo12999b()
                r1.append(r2)
                java.lang.String r2 = "ms | Accepted Near: %s: %.2fm / %.2fm"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                c.a.d.b.d r3 = r0.f968f
                android.bluetooth.BluetoothDevice r3 = r3.f951e
                java.lang.String r3 = r3.getName()
                r4 = 0
                r2[r4] = r3
                c.a.d.b.d r3 = r0.f968f
                double r3 = r3.f957k
                java.lang.Double r3 = java.lang.Double.valueOf(r3)
                r4 = 1
                r2[r4] = r3
                c.a.d.b.d r3 = r0.f968f
                double r3 = r3.f952f
                java.lang.Double r3 = java.lang.Double.valueOf(r3)
                r2[r10] = r3
                java.lang.String.format(r1, r2)
                r18.mo12998a()
                goto L_0x037e
            L_0x0336:
                long r1 = r18.mo12999b()
                r3 = 1000(0x3e8, double:4.94E-321)
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 < 0) goto L_0x037e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                long r2 = r18.mo12999b()
                r1.append(r2)
                java.lang.String r2 = "ms | Accepted Far: %s: %.2fm / %.2fm"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                c.a.d.b.d r3 = r0.f968f
                android.bluetooth.BluetoothDevice r3 = r3.f951e
                java.lang.String r3 = r3.getName()
                r4 = 0
                r2[r4] = r3
                c.a.d.b.d r3 = r0.f968f
                double r3 = r3.f957k
                java.lang.Double r3 = java.lang.Double.valueOf(r3)
                r4 = 1
                r2[r4] = r3
                c.a.d.b.d r3 = r0.f968f
                double r3 = r3.f952f
                java.lang.Double r3 = java.lang.Double.valueOf(r3)
                r2[r10] = r3
                java.lang.String.format(r1, r2)
                r18.mo12998a()
            L_0x037e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p008c.p009a.p017d.p019b.C0929d.C0930a.onScanResult(int, android.bluetooth.le.ScanResult):void");
        }
    }

    /* renamed from: c.a.d.b.d$b */
    public static class C0931b {

        /* renamed from: a */
        public static int f969a;

        /* renamed from: b */
        public static final int f970b;

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
        static {
            /*
                java.lang.String r0 = android.os.Build.MODEL
                int r1 = r0.hashCode()
                r2 = 0
                r3 = 2
                r4 = 1
                r5 = 291233728(0x115bdfc0, float:1.7345002E-28)
                if (r1 == r5) goto L_0x002d
                r5 = 915287685(0x368e2e85, float:4.2373454E-6)
                if (r1 == r5) goto L_0x0023
                r5 = 1654576974(0x629ed74e, float:1.46505E21)
                if (r1 == r5) goto L_0x0019
                goto L_0x0037
            L_0x0019:
                java.lang.String r1 = "Le X829"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0037
                r0 = 0
                goto L_0x0038
            L_0x0023:
                java.lang.String r1 = "EVA-DL00"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0037
                r0 = 2
                goto L_0x0038
            L_0x002d:
                java.lang.String r1 = "Xperia SP"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0037
                r0 = 1
                goto L_0x0038
            L_0x0037:
                r0 = -1
            L_0x0038:
                if (r0 == 0) goto L_0x0044
                if (r0 == r4) goto L_0x0041
                if (r0 == r3) goto L_0x0041
                f970b = r2
                goto L_0x0048
            L_0x0041:
                r0 = 10
                goto L_0x0046
            L_0x0044:
                r0 = -15
            L_0x0046:
                f970b = r0
            L_0x0048:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p008c.p009a.p017d.p019b.C0929d.C0931b.<clinit>():void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
            r0 = (android.location.LocationManager) r3.getSystemService(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m517a(android.content.Context r3, p008c.p009a.p010a.C0837c r4, p008c.p009a.p017d.p023e.C0956d r5, p008c.p009a.p010a.p012e.C0844b r6) {
            /*
                android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
                r1 = 0
                if (r0 == 0) goto L_0x002f
                android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
                boolean r0 = r0.isEnabled()
                if (r0 != 0) goto L_0x0012
                goto L_0x002f
            L_0x0012:
                android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
                android.bluetooth.le.BluetoothLeScanner r0 = r0.getBluetoothLeScanner()
                if (r0 != 0) goto L_0x001d
                goto L_0x002f
            L_0x001d:
                java.lang.String r0 = "location"
                java.lang.Object r0 = r3.getSystemService(r0)
                android.location.LocationManager r0 = (android.location.LocationManager) r0
                if (r0 != 0) goto L_0x0028
                goto L_0x002f
            L_0x0028:
                java.lang.String r2 = "gps"
                boolean r0 = r0.isProviderEnabled(r2)
                goto L_0x0030
            L_0x002f:
                r0 = 0
            L_0x0030:
                if (r0 == 0) goto L_0x0092
                boolean r0 = r4.f762a
                if (r0 == 0) goto L_0x0092
                int r0 = r4.f767f
                java.lang.String r2 = "power"
                java.lang.Object r2 = r3.getSystemService(r2)
                android.os.PowerManager r2 = (android.os.PowerManager) r2
                boolean r2 = r2.isInteractive()
                if (r2 != 0) goto L_0x0049
                int r0 = r0 + 5
            L_0x0049:
                int r2 = f970b
                int r2 = r2 + r0
                f969a = r2
                android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
                if (r0 == 0) goto L_0x005f
                android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
                android.bluetooth.le.BluetoothLeAdvertiser r0 = r0.getBluetoothLeAdvertiser()
                if (r0 == 0) goto L_0x005f
                r1 = 1
            L_0x005f:
                if (r1 == 0) goto L_0x0073
                c.a.d.b.b r3 = p008c.p009a.p017d.p019b.C0915b.C0916a.f913a
                c.a.d.b.b$b r3 = r3.f912a
                if (r3 != 0) goto L_0x0084
                c.a.d.b.b r3 = p008c.p009a.p017d.p019b.C0915b.C0916a.f913a
                c.a.d.b.b$b r0 = new c.a.d.b.b$b
                boolean r4 = r4.f766e
                r0.<init>(r4, r6, r5)
                r3.f912a = r0
                goto L_0x0084
            L_0x0073:
                c.a.d.b.c r0 = p008c.p009a.p017d.p019b.C0921c.C0925b.f941a
                c.a.d.b.c$c r0 = r0.f929a
                if (r0 != 0) goto L_0x0084
                c.a.d.b.c r0 = p008c.p009a.p017d.p019b.C0921c.C0925b.f941a
                c.a.d.b.c$c r1 = new c.a.d.b.c$c
                boolean r4 = r4.f766e
                r1.<init>(r3, r4, r6, r5)
                r0.f929a = r1
            L_0x0084:
                org.mobileid.Api r3 = org.mobileid.Api.INSTANCE
                org.mobileid.Api$Firebase r3 = r3.getFirebase()
                if (r3 != 0) goto L_0x008d
                goto L_0x0092
            L_0x008d:
                android.os.Bundle r4 = android.os.Bundle.EMPTY
                r3.logBluetoothScan(r4)
            L_0x0092:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p008c.p009a.p017d.p019b.C0929d.C0931b.m517a(android.content.Context, c.a.a.c, c.a.d.e.d, c.a.a.e.b):void");
        }
    }

    /* renamed from: c.a.d.b.d$c */
    public interface C0932c {
        /* renamed from: a */
        void mo12987a(C0929d dVar);
    }

    public C0929d(BluetoothDevice bluetoothDevice, double d, int i, int i2, C0911a.C0914c cVar) {
        super(cVar, i2, C0911a.C0912a.UNKNOWN);
        this.f951e = bluetoothDevice;
        this.f952f = d;
        this.f953g = i;
    }

    /* renamed from: a */
    public static boolean m513a(C0929d dVar) {
        return dVar.f957k <= dVar.f952f;
    }
}
