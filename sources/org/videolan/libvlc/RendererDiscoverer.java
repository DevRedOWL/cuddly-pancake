package org.videolan.libvlc;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.List;
import org.videolan.libvlc.VLCEvent;

public class RendererDiscoverer extends VLCObject<Event> {
    private static final String TAG = "LibVLC/RendererDiscoverer";
    private final LongSparseArray<RendererItem> index = new LongSparseArray<>();
    final List<RendererItem> mRenderers = new ArrayList();

    public interface EventListener extends VLCEvent.Listener<Event> {
    }

    private static native Description[] nativeList(LibVLC libVLC);

    private native void nativeNew(LibVLC libVLC, String str);

    private native RendererItem nativeNewItem(long j);

    private native void nativeRelease();

    private native boolean nativeStart();

    private native void nativeStop();

    public /* bridge */ /* synthetic */ boolean isReleased() {
        return super.isReleased();
    }

    public static class Event extends VLCEvent {
        public static final int ItemAdded = 1282;
        public static final int ItemDeleted = 1283;
        private final RendererItem item;

        protected Event(int i, long j, RendererItem rendererItem) {
            super(i, j);
            this.item = rendererItem;
            rendererItem.retain();
        }

        public RendererItem getItem() {
            return this.item;
        }

        /* access modifiers changed from: package-private */
        public void release() {
            this.item.release();
            super.release();
        }
    }

    private static RendererItem createItemFromNative(String str, String str2, String str3, int i, long j) {
        return new RendererItem(str, str2, str3, i, j);
    }

    public RendererDiscoverer(LibVLC libVLC, String str) {
        super(libVLC);
        nativeNew(libVLC, str);
    }

    public boolean start() {
        if (!isReleased()) {
            return nativeStart();
        }
        throw new IllegalStateException("MediaDiscoverer is released");
    }

    public void stop() {
        if (!isReleased()) {
            setEventListener((EventListener) null);
            nativeStop();
            release();
            return;
        }
        throw new IllegalStateException("MediaDiscoverer is released");
    }

    public void setEventListener(EventListener eventListener) {
        super.setEventListener(eventListener);
    }

    public static Description[] list(LibVLC libVLC) {
        return nativeList(libVLC);
    }

    public static class Description {
        final String longName;
        public final String name;

        private Description(String str, String str2) {
            this.name = str;
            this.longName = str2;
        }
    }

    /* access modifiers changed from: protected */
    public Event onEventNative(int i, long j, long j2, float f) {
        if (i == 1282) {
            return new Event(i, j, insertItemFromEvent(j));
        }
        if (i != 1283) {
            return null;
        }
        return new Event(i, j, removeItemFromEvent(j));
    }

    private synchronized RendererItem insertItemFromEvent(long j) {
        RendererItem nativeNewItem;
        nativeNewItem = nativeNewItem(j);
        this.index.put(j, nativeNewItem);
        this.mRenderers.add(nativeNewItem);
        return nativeNewItem;
    }

    private synchronized RendererItem removeItemFromEvent(long j) {
        RendererItem rendererItem;
        rendererItem = this.index.get(j);
        if (rendererItem != null) {
            this.index.remove(j);
            this.mRenderers.remove(rendererItem);
            rendererItem.release();
        }
        return rendererItem;
    }

    /* access modifiers changed from: protected */
    public void onReleaseNative() {
        for (RendererItem release : this.mRenderers) {
            release.release();
        }
        this.mRenderers.clear();
        nativeRelease();
    }

    private static Description createDescriptionFromNative(String str, String str2) {
        return new Description(str, str2);
    }
}
