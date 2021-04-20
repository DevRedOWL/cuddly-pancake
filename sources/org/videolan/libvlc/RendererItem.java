package org.videolan.libvlc;

public class RendererItem extends VLCObject<Event> {
    public static final int LIBVLC_RENDERER_CAN_AUDIO = 1;
    public static final int LIBVLC_RENDERER_CAN_VIDEO = 2;
    public final String displayName;
    final int flags;
    final String iconUrl;
    public final String name;
    private final long ref;
    final String type;

    private native void nativeReleaseItem();

    public /* bridge */ /* synthetic */ boolean isReleased() {
        return super.isReleased();
    }

    RendererItem(String str, String str2, String str3, int i, long j) {
        int lastIndexOf = str.lastIndexOf(45);
        this.name = str;
        this.displayName = lastIndexOf != -1 ? str.substring(0, lastIndexOf).replace('-', ' ') : str;
        this.type = str2;
        this.iconUrl = str3;
        this.flags = i;
        this.ref = j;
    }

    public boolean equals(Object obj) {
        return (obj instanceof RendererItem) && this.ref == ((RendererItem) obj).ref;
    }

    /* access modifiers changed from: protected */
    public Event onEventNative(int i, long j, long j2, float f) {
        return new Event(i);
    }

    /* access modifiers changed from: protected */
    public void onReleaseNative() {
        nativeReleaseItem();
    }

    public static class Event extends VLCEvent {
        protected Event(int i) {
            super(i);
        }
    }
}
