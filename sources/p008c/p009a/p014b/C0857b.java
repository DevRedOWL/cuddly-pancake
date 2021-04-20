package p008c.p009a.p014b;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import java.util.Arrays;
import java.util.UUID;
import p008c.p009a.p014b.C0882h;

/* renamed from: c.a.b.b */
public class C0857b extends BluetoothGattCallback {

    /* renamed from: b */
    public static final UUID f804b = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

    /* renamed from: a */
    public C0859b f805a;

    /* renamed from: c.a.b.b$b */
    public static final class C0859b extends Handler implements C0882h {

        /* renamed from: a */
        public final C0860c f806a;

        /* renamed from: b */
        public final byte[] f807b = new byte[20];

        /* renamed from: c */
        public BluetoothGatt f808c;

        /* renamed from: d */
        public C0882h.C0887d f809d;

        /* renamed from: e */
        public BluetoothGattCharacteristic f810e;

        /* renamed from: f */
        public volatile boolean f811f;

        /* renamed from: g */
        public long f812g = System.currentTimeMillis();

        public C0859b(Context context, BluetoothDevice bluetoothDevice, C0882h.C0887d dVar, int i) {
            mo12944d() + "ms | Opening...";
            if (C0861d.f817a.f805a != null) {
                C0861d.f817a.f805a.mo12939a();
            }
            C0859b unused = C0861d.f817a.f805a = this;
            this.f806a = new C0860c(Math.max(i, this.f807b.length));
            this.f809d = dVar;
            this.f808c = Build.VERSION.SDK_INT >= 23 ? bluetoothDevice.connectGatt(context, false, C0861d.f817a, 2) : bluetoothDevice.connectGatt(context, false, C0861d.f817a);
        }

        /* renamed from: a */
        public synchronized void mo12939a() {
            mo12940a((C0882h.C0885b) null);
        }

        /* renamed from: a */
        public final void mo12940a(C0882h.C0885b bVar) {
            if (C0861d.f817a.f805a == this) {
                StringBuilder sb = new StringBuilder();
                sb.append(mo12944d());
                sb.append("ms | ");
                BluetoothGatt bluetoothGatt = this.f808c;
                sb.append(bluetoothGatt == null ? "null" : Integer.valueOf(bluetoothGatt.hashCode()));
                sb.append(" | Closing...");
                sb.toString();
                removeMessages(1);
                removeMessages(2);
                this.f810e = null;
                C0861d.f817a.f805a = null;
                obtainMessage(3, -1, -1, bVar).sendToTarget();
            }
        }

        /* renamed from: b */
        public final void mo12941b() {
            C0882h.C0885b bVar;
            if (!this.f808c.setCharacteristicNotification(this.f810e, true)) {
                bVar = new C0882h.C0885b(1, "No access to characteristic");
            } else if (this.f808c.connect()) {
                this.f809d.mo12950b();
                return;
            } else {
                bVar = new C0882h.C0885b(1, "No connection with gatt");
            }
            mo12940a(bVar);
        }

        /* renamed from: b */
        public synchronized void mo12942b(byte[] bArr) {
            if (C0860c.m419a(this.f806a, bArr)) {
                mo12945e();
            } else {
                C0882h.C0887d dVar = this.f809d;
                if (dVar != null) {
                    dVar.mo12947a(new C0882h.C0885b(4, "Insufficient buffer"));
                }
            }
        }

        /* renamed from: c */
        public void mo12943c() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public final long mo12944d() {
            return System.currentTimeMillis() - this.f812g;
        }

        /* renamed from: e */
        public final void mo12945e() {
            int i;
            int i2;
            if (this.f810e != null) {
                C0860c cVar = this.f806a;
                byte[] bArr = this.f807b;
                int i3 = cVar.f815c;
                if (i3 > cVar.f814b) {
                    int i4 = cVar.f816d;
                    if (i3 < i4) {
                        i = Math.min(i4 - i3, bArr.length);
                        System.arraycopy(cVar.f813a, cVar.f815c, bArr, 0, i);
                        cVar.f815c += i;
                    } else {
                        i = 0;
                    }
                    if (cVar.f815c >= cVar.f816d) {
                        cVar.f815c = 0;
                    }
                } else {
                    i = 0;
                }
                if (i < bArr.length && (i2 = cVar.f814b - cVar.f815c) > 0) {
                    int min = Math.min(bArr.length - i, i2);
                    System.arraycopy(cVar.f813a, cVar.f815c, bArr, i, min);
                    cVar.f815c += min;
                    i += min;
                }
                if (i > 0) {
                    BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f810e;
                    byte[] bArr2 = this.f807b;
                    if (i != bArr2.length) {
                        bArr2 = Arrays.copyOfRange(bArr2, 0, i);
                    }
                    bluetoothGattCharacteristic.setValue(bArr2);
                    this.f808c.writeCharacteristic(this.f810e);
                }
            }
        }

        public void handleMessage(Message message) {
            C0882h.C0885b bVar;
            int i = message.what;
            if (i == 1) {
                mo12941b();
            } else if (i == 2) {
                BluetoothGattService service = this.f808c.getService(C0857b.f804b);
                if (service != null) {
                    if (!service.getCharacteristics().isEmpty()) {
                        this.f810e = service.getCharacteristics().get(0);
                    }
                    if (this.f810e != null) {
                        mo12941b();
                        return;
                    }
                    bVar = new C0882h.C0885b(1, "Characteristic not found");
                } else {
                    bVar = new C0882h.C0885b(1, "No SerialPort service found");
                }
                mo12940a(bVar);
            } else if (i != 3) {
                if (i == 4) {
                    this.f809d.mo12947a((C0882h.C0885b) message.obj);
                    this.f809d = null;
                } else if (i == 5 && this.f808c != null) {
                    mo12944d() + "ms | " + this.f808c.hashCode() + " | Closing Gatt...";
                    this.f808c.close();
                    this.f808c = null;
                    Object obj = message.obj;
                    if (obj != null) {
                        obtainMessage(4, -1, -1, obj).sendToTarget();
                    }
                }
            } else if (this.f808c != null) {
                mo12944d() + "ms | " + this.f808c.hashCode() + " | Disconnecting...";
                this.f808c.abortReliableWrite();
                if (message.obj != null) {
                    try {
                        mo12944d() + "ms | " + this.f808c.hashCode() + " | Refreshing Gatt...";
                        this.f808c.getClass().getMethod("refresh", new Class[0]).invoke(this.f808c, new Object[0]);
                    } catch (Exception e) {
                        mo12944d() + "ms | " + e.getMessage();
                    }
                }
                this.f808c.disconnect();
                sendMessageDelayed(obtainMessage(5, -1, -1, message.obj), 80);
            }
        }
    }

    /* renamed from: c.a.b.b$c */
    public static class C0860c {

        /* renamed from: a */
        public final byte[] f813a;

        /* renamed from: b */
        public int f814b;

        /* renamed from: c */
        public int f815c;

        /* renamed from: d */
        public int f816d;

        public C0860c(int i) {
            this.f813a = new byte[((i * 2) + 1)];
        }

        /* renamed from: a */
        public static boolean m419a(C0860c cVar, byte[] bArr) {
            int i = cVar.f814b;
            int i2 = cVar.f815c;
            if (i >= i2) {
                if (bArr.length >= cVar.f813a.length - i && bArr.length < i2) {
                    cVar.f814b = 0;
                }
                int length = bArr.length;
                byte[] bArr2 = cVar.f813a;
                int length2 = bArr2.length;
                int i3 = cVar.f814b;
                if (length < length2 - i3) {
                    System.arraycopy(bArr, 0, bArr2, i3, bArr.length);
                    int length3 = cVar.f814b + bArr.length;
                    cVar.f814b = length3;
                    cVar.f816d = length3;
                    return true;
                }
            } else if (bArr.length + 1 < i2 - i) {
                System.arraycopy(bArr, 0, cVar.f813a, i, bArr.length);
                cVar.f814b += bArr.length;
                return true;
            }
            return false;
        }
    }

    /* renamed from: c.a.b.b$d */
    public static class C0861d {

        /* renamed from: a */
        public static final C0857b f817a = new C0857b();
    }

    /* renamed from: a */
    public static C0882h m410a(Context context, BluetoothDevice bluetoothDevice, C0882h.C0887d dVar, int i) {
        C0859b bVar;
        synchronized (C0861d.f817a) {
            bVar = new C0859b(context, bluetoothDevice, dVar, i);
        }
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onCharacteristicChanged(android.bluetooth.BluetoothGatt r4, android.bluetooth.BluetoothGattCharacteristic r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 != 0) goto L_0x0005
            monitor-exit(r3)
            return
        L_0x0005:
            c.a.b.b$b r0 = r3.f805a     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x003e
            android.bluetooth.BluetoothGatt r0 = r0.f808c     // Catch:{ all -> 0x0057 }
            if (r0 != r4) goto L_0x003e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0057 }
            r0.<init>()     // Catch:{ all -> 0x0057 }
            c.a.b.b$b r1 = r3.f805a     // Catch:{ all -> 0x0057 }
            long r1 = r1.mo12944d()     // Catch:{ all -> 0x0057 }
            r0.append(r1)     // Catch:{ all -> 0x0057 }
            java.lang.String r1 = "ms | "
            r0.append(r1)     // Catch:{ all -> 0x0057 }
            int r4 = r4.hashCode()     // Catch:{ all -> 0x0057 }
            r0.append(r4)     // Catch:{ all -> 0x0057 }
            java.lang.String r4 = " | Notify"
            r0.append(r4)     // Catch:{ all -> 0x0057 }
            r0.toString()     // Catch:{ all -> 0x0057 }
            byte[] r4 = r5.getValue()     // Catch:{ all -> 0x0057 }
            int r5 = r4.length     // Catch:{ all -> 0x0057 }
            if (r5 <= 0) goto L_0x0055
            c.a.b.b$b r5 = r3.f805a     // Catch:{ all -> 0x0057 }
            c.a.b.h$d r5 = r5.f809d     // Catch:{ all -> 0x0057 }
            r5.mo12949a(r4)     // Catch:{ all -> 0x0057 }
            goto L_0x0055
        L_0x003e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0057 }
            r5.<init>()     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "Dead gatt found: "
            r5.append(r0)     // Catch:{ all -> 0x0057 }
            int r0 = r4.hashCode()     // Catch:{ all -> 0x0057 }
            r5.append(r0)     // Catch:{ all -> 0x0057 }
            r5.toString()     // Catch:{ all -> 0x0057 }
            r4.close()     // Catch:{ all -> 0x0057 }
        L_0x0055:
            monitor-exit(r3)
            return
        L_0x0057:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p008c.p009a.p014b.C0857b.onCharacteristicChanged(android.bluetooth.BluetoothGatt, android.bluetooth.BluetoothGattCharacteristic):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onCharacteristicWrite(android.bluetooth.BluetoothGatt r3, android.bluetooth.BluetoothGattCharacteristic r4, int r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L_0x0005
            monitor-exit(r2)
            return
        L_0x0005:
            c.a.b.b$b r4 = r2.f805a     // Catch:{ all -> 0x0060 }
            if (r4 == 0) goto L_0x005e
            android.bluetooth.BluetoothGatt r4 = r4.f808c     // Catch:{ all -> 0x0060 }
            if (r4 != r3) goto L_0x005e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r4.<init>()     // Catch:{ all -> 0x0060 }
            c.a.b.b$b r0 = r2.f805a     // Catch:{ all -> 0x0060 }
            long r0 = r0.mo12944d()     // Catch:{ all -> 0x0060 }
            r4.append(r0)     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = "ms | "
            r4.append(r0)     // Catch:{ all -> 0x0060 }
            int r3 = r3.hashCode()     // Catch:{ all -> 0x0060 }
            r4.append(r3)     // Catch:{ all -> 0x0060 }
            java.lang.String r3 = " | Written"
            r4.append(r3)     // Catch:{ all -> 0x0060 }
            r4.toString()     // Catch:{ all -> 0x0060 }
            if (r5 != 0) goto L_0x0037
            c.a.b.b$b r3 = r2.f805a     // Catch:{ all -> 0x0060 }
            r3.mo12945e()     // Catch:{ all -> 0x0060 }
            goto L_0x005e
        L_0x0037:
            c.a.b.b$b r3 = r2.f805a     // Catch:{ all -> 0x0060 }
            c.a.b.b$c r4 = r3.f806a     // Catch:{ all -> 0x0060 }
            r0 = 0
            r4.f815c = r0     // Catch:{ all -> 0x0060 }
            r4.f814b = r0     // Catch:{ all -> 0x0060 }
            r4.f816d = r0     // Catch:{ all -> 0x0060 }
            c.a.b.h$d r3 = r3.f809d     // Catch:{ all -> 0x0060 }
            c.a.b.h$b r4 = new c.a.b.h$b     // Catch:{ all -> 0x0060 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r0.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = "Write error "
            r0.append(r1)     // Catch:{ all -> 0x0060 }
            r0.append(r5)     // Catch:{ all -> 0x0060 }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x0060 }
            r0 = 3
            r4.<init>(r0, r5)     // Catch:{ all -> 0x0060 }
            r3.mo12947a(r4)     // Catch:{ all -> 0x0060 }
        L_0x005e:
            monitor-exit(r2)
            return
        L_0x0060:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p008c.p009a.p014b.C0857b.onCharacteristicWrite(android.bluetooth.BluetoothGatt, android.bluetooth.BluetoothGattCharacteristic, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onConnectionStateChange(android.bluetooth.BluetoothGatt r4, int r5, int r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 != 0) goto L_0x0005
            monitor-exit(r3)
            return
        L_0x0005:
            c.a.b.b$b r0 = r3.f805a     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0099
            android.bluetooth.BluetoothGatt r0 = r0.f808c     // Catch:{ all -> 0x009b }
            if (r0 != r4) goto L_0x0099
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
            r0.<init>()     // Catch:{ all -> 0x009b }
            c.a.b.b$b r1 = r3.f805a     // Catch:{ all -> 0x009b }
            long r1 = r1.mo12944d()     // Catch:{ all -> 0x009b }
            r0.append(r1)     // Catch:{ all -> 0x009b }
            java.lang.String r1 = "ms | "
            r0.append(r1)     // Catch:{ all -> 0x009b }
            int r4 = r4.hashCode()     // Catch:{ all -> 0x009b }
            r0.append(r4)     // Catch:{ all -> 0x009b }
            java.lang.String r4 = " | State="
            r0.append(r4)     // Catch:{ all -> 0x009b }
            r0.append(r6)     // Catch:{ all -> 0x009b }
            r0.toString()     // Catch:{ all -> 0x009b }
            r4 = 5
            if (r6 == 0) goto L_0x0079
            r0 = 2
            if (r6 == r0) goto L_0x0039
            goto L_0x0099
        L_0x0039:
            if (r5 != 0) goto L_0x005b
            c.a.b.b$b r4 = r3.f805a     // Catch:{ all -> 0x009b }
            boolean r4 = r4.f811f     // Catch:{ all -> 0x009b }
            if (r4 != 0) goto L_0x0099
            c.a.b.b$b r4 = r3.f805a     // Catch:{ all -> 0x009b }
            r5 = 1
            boolean unused = r4.f811f = r5     // Catch:{ all -> 0x009b }
            c.a.b.b$b r4 = r3.f805a     // Catch:{ all -> 0x009b }
            android.bluetooth.BluetoothGattCharacteristic r6 = r4.f810e     // Catch:{ all -> 0x009b }
            if (r6 != 0) goto L_0x0053
            android.bluetooth.BluetoothGatt r4 = r4.f808c     // Catch:{ all -> 0x009b }
            r4.discoverServices()     // Catch:{ all -> 0x009b }
            goto L_0x0099
        L_0x0053:
            android.os.Message r4 = r4.obtainMessage(r5)     // Catch:{ all -> 0x009b }
            r4.sendToTarget()     // Catch:{ all -> 0x009b }
            goto L_0x0099
        L_0x005b:
            c.a.b.b$b r6 = r3.f805a     // Catch:{ all -> 0x009b }
            c.a.b.h$b r0 = new c.a.b.h$b     // Catch:{ all -> 0x009b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
            r1.<init>()     // Catch:{ all -> 0x009b }
            java.lang.String r2 = "["
            r1.append(r2)     // Catch:{ all -> 0x009b }
            r1.append(r5)     // Catch:{ all -> 0x009b }
            java.lang.String r5 = "]"
            r1.append(r5)     // Catch:{ all -> 0x009b }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x009b }
            r0.<init>(r4, r5)     // Catch:{ all -> 0x009b }
            goto L_0x0096
        L_0x0079:
            c.a.b.b$b r6 = r3.f805a     // Catch:{ all -> 0x009b }
            c.a.b.h$b r0 = new c.a.b.h$b     // Catch:{ all -> 0x009b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
            r1.<init>()     // Catch:{ all -> 0x009b }
            java.lang.String r2 = "["
            r1.append(r2)     // Catch:{ all -> 0x009b }
            r1.append(r5)     // Catch:{ all -> 0x009b }
            java.lang.String r5 = "]"
            r1.append(r5)     // Catch:{ all -> 0x009b }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x009b }
            r0.<init>(r4, r5)     // Catch:{ all -> 0x009b }
        L_0x0096:
            r6.mo12940a(r0)     // Catch:{ all -> 0x009b }
        L_0x0099:
            monitor-exit(r3)
            return
        L_0x009b:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p008c.p009a.p014b.C0857b.onConnectionStateChange(android.bluetooth.BluetoothGatt, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onServicesDiscovered(android.bluetooth.BluetoothGatt r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 != 0) goto L_0x0005
            monitor-exit(r3)
            return
        L_0x0005:
            c.a.b.b$b r0 = r3.f805a     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x005d
            android.bluetooth.BluetoothGatt r0 = r0.f808c     // Catch:{ all -> 0x005f }
            if (r0 != r4) goto L_0x005d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x005f }
            r0.<init>()     // Catch:{ all -> 0x005f }
            c.a.b.b$b r1 = r3.f805a     // Catch:{ all -> 0x005f }
            long r1 = r1.mo12944d()     // Catch:{ all -> 0x005f }
            r0.append(r1)     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "ms | "
            r0.append(r1)     // Catch:{ all -> 0x005f }
            int r4 = r4.hashCode()     // Catch:{ all -> 0x005f }
            r0.append(r4)     // Catch:{ all -> 0x005f }
            java.lang.String r4 = " | ServicesDiscovered"
            r0.append(r4)     // Catch:{ all -> 0x005f }
            r0.toString()     // Catch:{ all -> 0x005f }
            if (r5 != 0) goto L_0x003c
            c.a.b.b$b r4 = r3.f805a     // Catch:{ all -> 0x005f }
            r5 = 2
            android.os.Message r4 = r4.obtainMessage(r5)     // Catch:{ all -> 0x005f }
            r4.sendToTarget()     // Catch:{ all -> 0x005f }
            goto L_0x005d
        L_0x003c:
            c.a.b.b$b r4 = r3.f805a     // Catch:{ all -> 0x005f }
            c.a.b.h$b r0 = new c.a.b.h$b     // Catch:{ all -> 0x005f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005f }
            r1.<init>()     // Catch:{ all -> 0x005f }
            java.lang.String r2 = "["
            r1.append(r2)     // Catch:{ all -> 0x005f }
            r1.append(r5)     // Catch:{ all -> 0x005f }
            java.lang.String r5 = "]"
            r1.append(r5)     // Catch:{ all -> 0x005f }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x005f }
            r1 = 5
            r0.<init>(r1, r5)     // Catch:{ all -> 0x005f }
            r4.mo12940a(r0)     // Catch:{ all -> 0x005f }
        L_0x005d:
            monitor-exit(r3)
            return
        L_0x005f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p008c.p009a.p014b.C0857b.onServicesDiscovered(android.bluetooth.BluetoothGatt, int):void");
    }
}
