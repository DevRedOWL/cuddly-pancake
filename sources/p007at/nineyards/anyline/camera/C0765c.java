package p007at.nineyards.anyline.camera;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import java.nio.ByteBuffer;
import p007at.nineyards.anyline.modules.barcode.NativeBarcodeResultListener;

/* renamed from: at.nineyards.anyline.camera.c */
final class C0765c extends Thread {

    /* renamed from: a */
    private final BarcodeDetector f426a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final NativeBarcodeResultListener f427b;

    /* renamed from: c */
    private ByteBuffer f428c;

    /* renamed from: d */
    private int f429d;

    /* renamed from: e */
    private int f430e;

    /* renamed from: f */
    private boolean f431f = true;

    /* renamed from: g */
    private final Object f432g = new Object();

    /* renamed from: h */
    private int f433h;

    C0765c(Context context, NativeBarcodeResultListener nativeBarcodeResultListener) {
        this.f426a = new BarcodeDetector.Builder(context).build();
        this.f427b = nativeBarcodeResultListener;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo12254a() {
        return this.f426a.isOperational();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12253a(byte[] bArr, int i, int i2, int i3) {
        if (this.f431f) {
            if (i <= 0 || i2 <= 0) {
                Log.d("NativeBarcodeDetectionThread", "invalid arguments for barcode detection");
                return;
            }
            synchronized (this.f432g) {
                this.f428c = ByteBuffer.wrap((byte[]) bArr.clone());
                this.f429d = i;
                this.f430e = i2;
                this.f433h = i3;
                this.f432g.notifyAll();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12255b() {
        synchronized (this.f432g) {
            this.f431f = false;
            this.f432g.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r2 = r8.f426a.detect(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        if (r2.size() <= 0) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (r8.f427b == null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        if (r8.f431f == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006f, code lost:
        r0.post(new p007at.nineyards.anyline.camera.C0765c.C07661(r8));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.google.android.gms.vision.barcode.BarcodeDetector r1 = r8.f426a
            boolean r1 = r1.isOperational()
            if (r1 == 0) goto L_0x00cc
        L_0x0011:
            r1 = 0
            boolean r2 = r8.isInterrupted()     // Catch:{ InterruptedException -> 0x009e, Exception -> 0x0080 }
            if (r2 != 0) goto L_0x002e
            java.lang.Object r2 = r8.f432g     // Catch:{ InterruptedException -> 0x009e, Exception -> 0x0080 }
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x009e, Exception -> 0x0080 }
        L_0x001b:
            boolean r3 = r8.f431f     // Catch:{ all -> 0x007b }
            if (r3 == 0) goto L_0x0029
            java.nio.ByteBuffer r3 = r8.f428c     // Catch:{ all -> 0x007b }
            if (r3 != 0) goto L_0x0029
            java.lang.Object r3 = r8.f432g     // Catch:{ all -> 0x007b }
            r3.wait()     // Catch:{ all -> 0x007b }
            goto L_0x001b
        L_0x0029:
            boolean r3 = r8.f431f     // Catch:{ all -> 0x007b }
            if (r3 != 0) goto L_0x003d
            monitor-exit(r2)     // Catch:{ all -> 0x007b }
        L_0x002e:
            r8.f431f = r1
            com.google.android.gms.vision.barcode.BarcodeDetector r0 = r8.f426a
            r0.release()
            java.lang.String r0 = "NativeBarcodeDetectionThread"
            java.lang.String r1 = "Barcode detection finishing"
            android.util.Log.d(r0, r1)
            return
        L_0x003d:
            com.google.android.gms.vision.Frame$Builder r3 = new com.google.android.gms.vision.Frame$Builder     // Catch:{ all -> 0x007b }
            r3.<init>()     // Catch:{ all -> 0x007b }
            java.nio.ByteBuffer r4 = r8.f428c     // Catch:{ all -> 0x007b }
            int r5 = r8.f429d     // Catch:{ all -> 0x007b }
            int r6 = r8.f430e     // Catch:{ all -> 0x007b }
            int r7 = r8.f433h     // Catch:{ all -> 0x007b }
            com.google.android.gms.vision.Frame$Builder r3 = r3.setImageData(r4, r5, r6, r7)     // Catch:{ all -> 0x007b }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x007b }
            com.google.android.gms.vision.Frame$Builder r3 = r3.setTimestampMillis(r4)     // Catch:{ all -> 0x007b }
            com.google.android.gms.vision.Frame r3 = r3.build()     // Catch:{ all -> 0x007b }
            monitor-exit(r2)     // Catch:{ all -> 0x007b }
            com.google.android.gms.vision.barcode.BarcodeDetector r2 = r8.f426a     // Catch:{ InterruptedException -> 0x009e, Exception -> 0x0080 }
            android.util.SparseArray r2 = r2.detect(r3)     // Catch:{ InterruptedException -> 0x009e, Exception -> 0x0080 }
            int r3 = r2.size()     // Catch:{ InterruptedException -> 0x009e, Exception -> 0x0080 }
            if (r3 <= 0) goto L_0x0077
            at.nineyards.anyline.modules.barcode.NativeBarcodeResultListener r3 = r8.f427b     // Catch:{ InterruptedException -> 0x009e, Exception -> 0x0080 }
            if (r3 == 0) goto L_0x0077
            boolean r3 = r8.f431f     // Catch:{ InterruptedException -> 0x009e, Exception -> 0x0080 }
            if (r3 == 0) goto L_0x0077
            at.nineyards.anyline.camera.c$1 r3 = new at.nineyards.anyline.camera.c$1     // Catch:{ InterruptedException -> 0x009e, Exception -> 0x0080 }
            r3.<init>(r2)     // Catch:{ InterruptedException -> 0x009e, Exception -> 0x0080 }
            r0.post(r3)     // Catch:{ InterruptedException -> 0x009e, Exception -> 0x0080 }
        L_0x0077:
            r2 = 0
            r8.f428c = r2     // Catch:{ InterruptedException -> 0x009e, Exception -> 0x0080 }
            goto L_0x0011
        L_0x007b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007b }
            throw r0     // Catch:{ InterruptedException -> 0x009e, Exception -> 0x0080 }
        L_0x007e:
            r0 = move-exception
            goto L_0x00bd
        L_0x0080:
            r0 = move-exception
            java.lang.String r2 = "NativeBarcodeDetectionThread"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            java.lang.String r4 = "Barcode detection exception: "
            r3.<init>(r4)     // Catch:{ all -> 0x007e }
            java.lang.String r4 = r0.getMessage()     // Catch:{ all -> 0x007e }
            r3.append(r4)     // Catch:{ all -> 0x007e }
            java.lang.String r4 = "\nTerminating barcode detection."
            r3.append(r4)     // Catch:{ all -> 0x007e }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x007e }
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x007e }
            goto L_0x002e
        L_0x009e:
            r0 = move-exception
            java.lang.String r2 = "NativeBarcodeDetectionThread"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            java.lang.String r4 = "Barcode detection interrupted: "
            r3.<init>(r4)     // Catch:{ all -> 0x007e }
            java.lang.String r4 = r0.getMessage()     // Catch:{ all -> 0x007e }
            r3.append(r4)     // Catch:{ all -> 0x007e }
            java.lang.String r4 = "\nTerminating barcode detection."
            r3.append(r4)     // Catch:{ all -> 0x007e }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x007e }
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x007e }
            goto L_0x002e
        L_0x00bd:
            r8.f431f = r1
            com.google.android.gms.vision.barcode.BarcodeDetector r1 = r8.f426a
            r1.release()
            java.lang.String r1 = "NativeBarcodeDetectionThread"
            java.lang.String r2 = "Barcode detection finishing"
            android.util.Log.d(r1, r2)
            throw r0
        L_0x00cc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Barcode detector is not operational. Check isOperational before starting it"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.camera.C0765c.run():void");
    }
}
