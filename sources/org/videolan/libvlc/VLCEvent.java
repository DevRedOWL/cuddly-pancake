package org.videolan.libvlc;

public abstract class VLCEvent {
    protected final long arg1;
    protected final long arg2;
    protected final float argf1;
    public final int type;

    public interface Listener<T extends VLCEvent> {
        void onEvent(T t);
    }

    /* access modifiers changed from: package-private */
    public void release() {
    }

    VLCEvent(int i) {
        this.type = i;
        this.arg2 = 0;
        this.arg1 = 0;
        this.argf1 = 0.0f;
    }

    VLCEvent(int i, long j) {
        this.type = i;
        this.arg1 = j;
        this.arg2 = 0;
        this.argf1 = 0.0f;
    }

    VLCEvent(int i, long j, long j2) {
        this.type = i;
        this.arg1 = j;
        this.arg2 = j2;
        this.argf1 = 0.0f;
    }

    VLCEvent(int i, float f) {
        this.type = i;
        this.arg2 = 0;
        this.arg1 = 0;
        this.argf1 = f;
    }
}
