package org.videolan.libvlc;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import org.videolan.libvlc.VLCEvent;

abstract class VLCObject<T extends VLCEvent> {
    private VLCEvent.Listener<T> mEventListener;
    private Handler mHandler;
    private long mInstance;
    final LibVLC mLibVLC;
    private int mNativeRefCount;

    private native void nativeDetachEvents();

    /* access modifiers changed from: protected */
    public abstract T onEventNative(int i, long j, long j2, float f);

    /* access modifiers changed from: protected */
    public abstract void onReleaseNative();

    protected VLCObject(LibVLC libVLC) {
        this.mEventListener = null;
        this.mHandler = null;
        this.mNativeRefCount = 1;
        this.mInstance = 0;
        this.mLibVLC = libVLC;
    }

    protected VLCObject(VLCObject vLCObject) {
        this.mEventListener = null;
        this.mHandler = null;
        this.mNativeRefCount = 1;
        this.mInstance = 0;
        this.mLibVLC = vLCObject.mLibVLC;
    }

    protected VLCObject() {
        this.mEventListener = null;
        this.mHandler = null;
        this.mNativeRefCount = 1;
        this.mInstance = 0;
        this.mLibVLC = null;
    }

    public synchronized boolean isReleased() {
        return this.mNativeRefCount == 0;
    }

    public final synchronized boolean retain() {
        if (this.mNativeRefCount <= 0) {
            return false;
        }
        this.mNativeRefCount++;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (r0 != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        nativeDetachEvents();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        onReleaseNative();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0023, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void release() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.mNativeRefCount     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            return
        L_0x0007:
            int r0 = r2.mNativeRefCount     // Catch:{ all -> 0x0029 }
            if (r0 <= 0) goto L_0x0012
            int r0 = r2.mNativeRefCount     // Catch:{ all -> 0x0029 }
            int r0 = r0 + -1
            r2.mNativeRefCount = r0     // Catch:{ all -> 0x0029 }
            goto L_0x0013
        L_0x0012:
            r0 = -1
        L_0x0013:
            if (r0 != 0) goto L_0x0019
            r1 = 0
            r2.setEventListener(r1)     // Catch:{ all -> 0x0029 }
        L_0x0019:
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0028
            r2.nativeDetachEvents()
            monitor-enter(r2)
            r2.onReleaseNative()     // Catch:{ all -> 0x0025 }
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            goto L_0x0028
        L_0x0025:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            throw r0
        L_0x0028:
            return
        L_0x0029:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.VLCObject.release():void");
    }

    /* access modifiers changed from: protected */
    public synchronized void finalize() {
        if (!isReleased()) {
            throw new AssertionError("VLCObject (" + getClass().getName() + ") finalized but not natively released (" + this.mNativeRefCount + " refs)");
        }
    }

    /* access modifiers changed from: protected */
    public synchronized void setEventListener(VLCEvent.Listener<T> listener) {
        setEventListener(listener, (Handler) null);
    }

    /* access modifiers changed from: protected */
    public synchronized void setEventListener(VLCEvent.Listener<T> listener, Handler handler) {
        if (this.mHandler != null) {
            this.mHandler.removeCallbacksAndMessages((Object) null);
        }
        this.mEventListener = listener;
        if (this.mEventListener == null) {
            this.mHandler = null;
        } else if (this.mHandler == null) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            this.mHandler = handler;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void dispatchEventFromNative(int r2, long r3, long r5, float r7) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isReleased()     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r1)
            return
        L_0x0009:
            org.videolan.libvlc.VLCEvent r2 = r1.onEventNative(r2, r3, r5, r7)     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0023
            org.videolan.libvlc.VLCEvent$Listener<T> r3 = r1.mEventListener     // Catch:{ all -> 0x0025 }
            if (r3 == 0) goto L_0x0023
            android.os.Handler r3 = r1.mHandler     // Catch:{ all -> 0x0025 }
            if (r3 == 0) goto L_0x0023
            android.os.Handler r3 = r1.mHandler     // Catch:{ all -> 0x0025 }
            org.videolan.libvlc.VLCObject$1EventRunnable r4 = new org.videolan.libvlc.VLCObject$1EventRunnable     // Catch:{ all -> 0x0025 }
            org.videolan.libvlc.VLCEvent$Listener<T> r5 = r1.mEventListener     // Catch:{ all -> 0x0025 }
            r4.<init>(r5, r2)     // Catch:{ all -> 0x0025 }
            r3.post(r4)     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r1)
            return
        L_0x0025:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.VLCObject.dispatchEventFromNative(int, long, long, float):void");
    }

    private Object getWeakReference() {
        return new WeakReference(this);
    }

    private static void dispatchEventFromWeakNative(Object obj, int i, long j, long j2, float f) {
        VLCObject vLCObject = (VLCObject) ((WeakReference) obj).get();
        if (vLCObject != null) {
            vLCObject.dispatchEventFromNative(i, j, j2, f);
        }
    }
}
