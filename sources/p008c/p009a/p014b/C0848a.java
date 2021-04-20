package p008c.p009a.p014b;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.os.Handler;
import android.os.Message;
import android.support.p001v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import p008c.p009a.p014b.p015i.C0890b;

/* renamed from: c.a.b.a */
public class C0848a {

    /* renamed from: a */
    public final ScanSettings f782a = new ScanSettings.Builder().setScanMode(2).build();

    /* renamed from: b */
    public final HashMap<BluetoothDevice, C0849a> f783b = new HashMap<>();

    /* renamed from: c */
    public C0853d f784c;

    /* renamed from: d */
    public C0854e f785d;

    /* renamed from: e */
    public C0851c f786e;

    /* renamed from: f */
    public long f787f;

    /* renamed from: g */
    public int f788g;

    /* renamed from: c.a.b.a$a */
    public static class C0849a implements C0850b {

        /* renamed from: a */
        public final BluetoothDevice f789a;

        /* renamed from: b */
        public final String f790b;

        /* renamed from: c */
        public final int f791c;

        /* renamed from: d */
        public int[] f792d;

        /* renamed from: e */
        public int f793e;

        public C0849a(BluetoothDevice bluetoothDevice, String str, UUID uuid, UUID uuid2, int i, int i2, byte[] bArr, int i3) {
            this.f789a = bluetoothDevice;
            this.f790b = str;
            this.f791c = i;
            int[] iArr = new int[i3];
            this.f792d = iArr;
            int i4 = this.f793e;
            iArr[i4] = i2;
            this.f793e = i4 + 1;
        }

        /* renamed from: a */
        public static double m400a(double d, int i) {
            double pow;
            double d2;
            double d3;
            double abs = Math.abs(d / ((double) i));
            if (abs < 0.78d) {
                d3 = Math.pow(abs, 9.8d);
            } else {
                if (abs < 1.0d) {
                    pow = Math.pow(abs, 11.8d);
                    d2 = 0.87d;
                } else {
                    pow = Math.pow(abs, 9.7d);
                    d2 = 0.88d;
                }
                d3 = (pow * d2) + 0.101d;
            }
            return Math.abs(d3);
        }

        /* renamed from: a */
        public static boolean m401a(byte[] bArr, int i) {
            return bArr[i] == 76 && bArr[i + 1] == 0 && bArr[i + 2] == 2 && bArr[i + 3] >= 21;
        }

        /* renamed from: a */
        public String mo12930a() {
            return this.f790b;
        }

        /* renamed from: b */
        public BluetoothDevice mo12931b() {
            return this.f789a;
        }

        /* renamed from: c */
        public double mo12932c() {
            int[] copyOfRange = Arrays.copyOfRange(this.f792d, 0, this.f793e);
            Arrays.sort(copyOfRange);
            return m400a(copyOfRange.length % 2 == 0 ? (((double) copyOfRange[copyOfRange.length / 2]) + ((double) copyOfRange[(copyOfRange.length / 2) - 1])) / 2.0d : (double) copyOfRange[copyOfRange.length / 2], this.f791c);
        }
    }

    /* renamed from: c.a.b.a$b */
    public interface C0850b {
        /* renamed from: a */
        String mo12930a();

        /* renamed from: b */
        BluetoothDevice mo12931b();

        /* renamed from: c */
        double mo12932c();
    }

    /* renamed from: c.a.b.a$c */
    public static class C0851c extends Handler {

        /* renamed from: a */
        public ScanCallback f794a = new C0852a();

        /* renamed from: c.a.b.a$c$a */
        public class C0852a extends ScanCallback {
            public C0852a() {
            }

            public void onScanResult(int i, ScanResult scanResult) {
                C0851c.this.obtainMessage(3, -1, -1, scanResult).sendToTarget();
            }
        }

        public C0851c(int i) {
            sendEmptyMessageDelayed(2, (long) i);
        }

        public C0851c(int i, int i2) {
            sendEmptyMessageDelayed(1, (long) i);
            sendEmptyMessageDelayed(2, (long) i2);
        }

        public void handleMessage(Message message) {
            C0854e eVar;
            C0854e eVar2;
            Message message2 = message;
            int i = message2.what;
            int i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        ScanResult scanResult = (ScanResult) message2.obj;
                        if (scanResult.getScanRecord() != null) {
                            C0848a aVar = C0855f.f800a;
                            BluetoothDevice device = scanResult.getDevice();
                            byte[] bytes = scanResult.getScanRecord().getBytes();
                            int rssi = scanResult.getRssi();
                            if (aVar != null) {
                                UUID uuid = null;
                                UUID uuid2 = null;
                                byte[] bArr = null;
                                String address = device.getAddress();
                                int i3 = 0;
                                byte b = 0;
                                while (i3 < bytes.length) {
                                    int i4 = i3 + 1;
                                    byte b2 = bytes[i3] & 255;
                                    if (b2 == 0) {
                                        BluetoothDevice bluetoothDevice = device;
                                        eVar = aVar.f785d;
                                        if (eVar != null && uuid != null && uuid2 != null) {
                                            C0849a.m400a((double) rssi, (int) b);
                                            C0890b.C0892b bVar = (C0890b.C0892b) eVar;
                                            if (uuid2.equals(C0890b.C0892b.f874g) && address.startsWith("DSP")) {
                                                BluetoothDevice bluetoothDevice2 = bluetoothDevice;
                                                C0849a aVar2 = aVar.f783b.get(bluetoothDevice2);
                                                if (aVar2 == null) {
                                                    aVar2 = new C0849a(bluetoothDevice2, address, uuid, uuid2, b, rssi, bArr, aVar.f788g / 100);
                                                    aVar.f783b.put(bluetoothDevice2, aVar2);
                                                } else {
                                                    int i5 = aVar2.f793e;
                                                    int[] iArr = aVar2.f792d;
                                                    if (i5 < iArr.length) {
                                                        iArr[i5] = rssi;
                                                        aVar2.f793e = i5 + 1;
                                                    }
                                                }
                                                aVar.mo12929b() + String.format(Locale.US, "ms | Found: %s - %.2fm", new Object[]{aVar2.f790b, Double.valueOf(aVar2.mo12932c())});
                                                if (aVar.f784c == C0853d.IMMEDIATE_RESULTS && (eVar2 = aVar.f785d) != null) {
                                                    ((C0890b.C0892b) eVar2).mo12979a((C0850b) aVar2);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    int i6 = b2 - 1;
                                    int i7 = i4 + 1;
                                    byte b3 = bytes[i4] & 255;
                                    BluetoothDevice bluetoothDevice3 = device;
                                    if (b3 != 255) {
                                        switch (b3) {
                                            case 2:
                                            case 3:
                                                uuid = new UUID((((long) (bytes[i7] & 255)) << 32) + PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM + (((long) (bytes[i7 + 1] & 255)) << 40), -9223371485494954757L);
                                                break;
                                            case 4:
                                            case 5:
                                                uuid = new UUID((((long) (bytes[i7] & 255)) << 32) + PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM + (((long) (bytes[i7 + 1] & 255)) << 40) + (((long) (bytes[i7 + 2] & 255)) << 48) + (((long) (bytes[i7 + 3] & 255)) << 56), -9223371485494954757L);
                                                break;
                                            case 6:
                                            case 7:
                                                uuid = C0848a.m396a(bytes, i7, 16);
                                                break;
                                            case 8:
                                            case 9:
                                                int i8 = i6;
                                                while (bytes[(i7 + i8) - i2] == 0 && i8 > 0) {
                                                    i8--;
                                                }
                                                address = new String(bytes, i7, i8);
                                                break;
                                        }
                                    } else if (C0849a.m401a(bytes, i7)) {
                                        uuid2 = C0848a.m396a(bytes, i7 + 4, 16);
                                        b = bytes[i7 + 24];
                                        bArr = Arrays.copyOfRange(bytes, 25, 29);
                                    }
                                    i3 = i6 + i7;
                                    device = bluetoothDevice3;
                                    i2 = 1;
                                }
                                BluetoothDevice bluetoothDevice4 = device;
                                eVar = aVar.f785d;
                                if (eVar != null) {
                                    return;
                                }
                                return;
                            }
                            throw null;
                        }
                        return;
                    }
                    return;
                }
            } else if (C0855f.f800a.f783b.size() <= 0) {
                return;
            }
            C0855f.f800a.mo12928a();
        }
    }

    /* renamed from: c.a.b.a$d */
    public enum C0853d {
        IMMEDIATE_RESULTS,
        CUMULATIVE_RESULTS,
        ADAPTIVE_RESULTS
    }

    /* renamed from: c.a.b.a$e */
    public interface C0854e {
    }

    /* renamed from: c.a.b.a$f */
    public static class C0855f {

        /* renamed from: a */
        public static final C0848a f800a = new C0848a();
    }

    /* renamed from: c.a.b.a$g */
    public enum C0856g {
        STOPPED,
        SCANNING
    }

    /* renamed from: a */
    public static UUID m396a(byte[] bArr, int i, int i2) {
        if (i2 != 16 || bArr.length < i2 + i) {
            return null;
        }
        return new UUID(((long) (bArr[i + 7] & 255)) + (((long) (bArr[i + 6] & 255)) << 8) + (((long) (bArr[i + 5] & 255)) << 16) + (((long) (bArr[i + 4] & 255)) << 24) + (((long) (bArr[i + 3] & 255)) << 32) + (((long) (bArr[i + 2] & 255)) << 40) + (((long) (bArr[i + 1] & 255)) << 48) + (((long) (bArr[i] & 255)) << 56), ((long) (bArr[i + 15] & 255)) + (((long) (bArr[i + 14] & 255)) << 8) + (((long) (bArr[i + 13] & 255)) << 16) + (((long) (bArr[i + 12] & 255)) << 24) + (((long) (bArr[i + 11] & 255)) << 32) + (((long) (bArr[i + 10] & 255)) << 40) + (((long) (bArr[i + 9] & 255)) << 48) + (((long) (bArr[i + 8] & 255)) << 56));
    }

    /* renamed from: a */
    public final void mo12928a() {
        if (this.f786e != null) {
            mo12929b() + "ms | Stopping...";
            BluetoothLeScanner bluetoothLeScanner = BluetoothAdapter.getDefaultAdapter() == null ? null : BluetoothAdapter.getDefaultAdapter().getBluetoothLeScanner();
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.stopScan(this.f786e.f794a);
            }
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                defaultAdapter.cancelDiscovery();
            }
            if (this.f785d != null) {
                C0853d dVar = this.f784c;
                if (dVar == C0853d.CUMULATIVE_RESULTS || dVar == C0853d.ADAPTIVE_RESULTS) {
                    for (C0849a a : this.f783b.values()) {
                        ((C0890b.C0892b) this.f785d).mo12979a((C0850b) a);
                    }
                }
                ((C0890b.C0892b) this.f785d).mo12980a(C0856g.STOPPED);
            }
            C0851c cVar = this.f786e;
            cVar.removeMessages(1);
            cVar.removeMessages(2);
            cVar.removeMessages(3);
            this.f786e = null;
        }
        this.f785d = null;
    }

    /* renamed from: b */
    public final long mo12929b() {
        return System.currentTimeMillis() - this.f787f;
    }

    /* renamed from: a */
    public static void m397a(C0853d dVar, C0854e eVar, int i) {
        C0851c cVar;
        C0855f.f800a.mo12928a();
        C0848a aVar = C0855f.f800a;
        if (aVar != null) {
            aVar.f787f = System.currentTimeMillis();
            aVar.mo12929b() + "ms | Scanning...";
            BluetoothLeScanner bluetoothLeScanner = BluetoothAdapter.getDefaultAdapter() == null ? null : BluetoothAdapter.getDefaultAdapter().getBluetoothLeScanner();
            if (bluetoothLeScanner != null) {
                aVar.f784c = dVar;
                aVar.f783b.clear();
                aVar.f788g = i;
                aVar.f785d = eVar;
                if (dVar == C0853d.ADAPTIVE_RESULTS) {
                    int i2 = aVar.f788g;
                    cVar = new C0851c(i2, i2 * 4);
                } else {
                    cVar = new C0851c(aVar.f788g);
                }
                aVar.f786e = cVar;
                bluetoothLeScanner.startScan((List) null, C0855f.f800a.f782a, cVar.f794a);
                ((C0890b.C0892b) eVar).mo12980a(C0856g.SCANNING);
                aVar.mo12929b() + "ms | Started";
                return;
            }
            throw new IOException("Bluetooth scanner not ready");
        }
        throw null;
    }
}
