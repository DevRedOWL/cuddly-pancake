package org.videolan.libvlc;

import android.os.Handler;
import android.util.SparseArray;
import org.videolan.libvlc.VLCEvent;

public class MediaList extends VLCObject<Event> {
    private static final String TAG = "LibVLC/MediaList";
    private int mCount = 0;
    private boolean mLocked = false;
    private final SparseArray<Media> mMediaArray = new SparseArray<>();

    public interface EventListener extends VLCEvent.Listener<Event> {
    }

    private native int nativeGetCount();

    private native void nativeLock();

    private native void nativeNewFromLibVlc(LibVLC libVLC);

    private native void nativeNewFromMedia(Media media);

    private native void nativeNewFromMediaDiscoverer(MediaDiscoverer mediaDiscoverer);

    private native void nativeRelease();

    private native void nativeUnlock();

    public /* bridge */ /* synthetic */ boolean isReleased() {
        return super.isReleased();
    }

    public static class Event extends VLCEvent {
        public static final int EndReached = 516;
        public static final int ItemAdded = 512;
        public static final int ItemDeleted = 514;
        public final int index;
        public final Media media;
        private final boolean retain;

        protected Event(int i, Media media2, boolean z, int i2) {
            super(i);
            if (!z || (media2 != null && media2.retain())) {
                this.media = media2;
                this.retain = z;
                this.index = i2;
                return;
            }
            throw new IllegalStateException("invalid media reference");
        }

        /* access modifiers changed from: package-private */
        public void release() {
            if (this.retain) {
                this.media.release();
            }
        }
    }

    private void init() {
        lock();
        this.mCount = nativeGetCount();
        for (int i = 0; i < this.mCount; i++) {
            this.mMediaArray.put(i, new Media(this, i));
        }
        unlock();
    }

    public MediaList(LibVLC libVLC) {
        super(libVLC);
        nativeNewFromLibVlc(libVLC);
        init();
    }

    protected MediaList(MediaDiscoverer mediaDiscoverer) {
        super((VLCObject) mediaDiscoverer);
        nativeNewFromMediaDiscoverer(mediaDiscoverer);
        init();
    }

    protected MediaList(Media media) {
        super((VLCObject) media);
        nativeNewFromMedia(media);
        init();
    }

    private synchronized Media insertMediaFromEvent(int i) {
        Media media;
        for (int i2 = this.mCount - 1; i2 >= i; i2--) {
            this.mMediaArray.put(i2 + 1, this.mMediaArray.valueAt(i2));
        }
        this.mCount++;
        media = new Media(this, i);
        this.mMediaArray.put(i, media);
        return media;
    }

    private synchronized Media removeMediaFromEvent(int i) {
        Media media;
        this.mCount--;
        media = this.mMediaArray.get(i);
        if (media != null) {
            media.release();
        }
        while (i < this.mCount) {
            int i2 = i + 1;
            this.mMediaArray.put(i, this.mMediaArray.valueAt(i2));
            i = i2;
        }
        return media;
    }

    public void setEventListener(EventListener eventListener, Handler handler) {
        super.setEventListener(eventListener, handler);
    }

    /* access modifiers changed from: protected */
    public synchronized Event onEventNative(int i, long j, long j2, float f) {
        Event event;
        if (!this.mLocked) {
            this.mLocked = true;
            event = null;
            if (i == 512) {
                int i2 = (int) j;
                if (i2 != -1) {
                    event = new Event(i, insertMediaFromEvent(i2), true, i2);
                }
            } else if (i == 514) {
                int i3 = (int) j;
                if (i3 != -1) {
                    event = new Event(i, removeMediaFromEvent(i3), false, i3);
                }
            } else if (i == 516) {
                event = new Event(i, (Media) null, false, -1);
            }
            this.mLocked = false;
        } else {
            throw new IllegalStateException("already locked from event callback");
        }
        return event;
    }

    public synchronized int getCount() {
        return this.mCount;
    }

    public synchronized Media getMediaAt(int i) {
        Media media;
        if (i >= 0) {
            if (i < getCount()) {
                media = this.mMediaArray.get(i);
                media.retain();
            }
        }
        throw new IndexOutOfBoundsException();
        return media;
    }

    public void onReleaseNative() {
        for (int i = 0; i < this.mMediaArray.size(); i++) {
            Media media = this.mMediaArray.get(i);
            if (media != null) {
                media.release();
            }
        }
        nativeRelease();
    }

    private synchronized void lock() {
        if (!this.mLocked) {
            this.mLocked = true;
            nativeLock();
        } else {
            throw new IllegalStateException("already locked");
        }
    }

    private synchronized void unlock() {
        if (this.mLocked) {
            this.mLocked = false;
            nativeUnlock();
        } else {
            throw new IllegalStateException("not locked");
        }
    }

    /* access modifiers changed from: protected */
    public synchronized boolean isLocked() {
        return this.mLocked;
    }
}
