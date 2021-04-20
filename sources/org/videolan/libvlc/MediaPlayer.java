package org.videolan.libvlc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetFileDescriptor;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.File;
import java.io.IOException;
import org.videolan.libvlc.AWindow;
import org.videolan.libvlc.Media;
import org.videolan.libvlc.VLCEvent;
import org.videolan.libvlc.util.AndroidUtil;
import org.videolan.libvlc.util.DisplayManager;
import org.videolan.libvlc.util.VLCUtil;
import org.videolan.libvlc.util.VLCVideoLayout;

public class MediaPlayer extends VLCObject<Event> {
    public static final int SURFACE_SCALES_COUNT = ScaleType.values().length;
    private AssetFileDescriptor mAfd = null;
    private final AudioDeviceCallback mAudioDeviceCallback;
    private boolean mAudioDigitalOutputEnabled = false;
    private String mAudioOutput = "android_audiotrack";
    private String mAudioOutputDevice = null;
    private String mAudioPlugOutputDevice = "stereo";
    private final BroadcastReceiver mAudioPlugReceiver;
    private boolean mAudioPlugRegistered = false;
    private boolean mAudioReset = false;
    private boolean mCanDoPassthrough;
    private boolean mListenAudioPlug = true;
    private Media mMedia = null;
    /* access modifiers changed from: private */
    public boolean mPlayRequested = false;
    /* access modifiers changed from: private */
    public boolean mPlaying = false;
    private RendererItem mRenderer = null;
    private VideoHelper mVideoHelper = null;
    /* access modifiers changed from: private */
    public int mVoutCount = 0;
    private final AWindow mWindow = new AWindow(new AWindow.SurfaceCallback() {
        public void onSurfacesCreated(AWindow aWindow) {
            boolean z;
            boolean z2;
            synchronized (MediaPlayer.this) {
                z = false;
                if (MediaPlayer.this.mPlaying || !MediaPlayer.this.mPlayRequested) {
                    z2 = MediaPlayer.this.mVoutCount == 0;
                } else {
                    z2 = false;
                    z = true;
                }
            }
            if (z) {
                MediaPlayer.this.play();
            } else if (z2) {
                MediaPlayer.this.setVideoTrackEnabled(true);
            }
        }

        public void onSurfacesDestroyed(AWindow aWindow) {
            boolean z;
            synchronized (MediaPlayer.this) {
                z = MediaPlayer.this.mVoutCount > 0;
            }
            if (z) {
                MediaPlayer.this.setVideoTrackEnabled(false);
            }
        }
    });

    public interface EventListener extends VLCEvent.Listener<Event> {
    }

    public static class Navigate {
        public static final int Activate = 0;
        public static final int Down = 2;
        public static final int Left = 3;
        public static final int Right = 4;

        /* renamed from: Up */
        public static final int f6491Up = 1;
    }

    public static class Position {
        public static final int Bottom = 6;
        public static final int BottomLeft = 7;
        public static final int BottomRight = 8;
        public static final int Center = 0;
        public static final int Disable = -1;
        public static final int Left = 1;
        public static final int Right = 2;
        public static final int Top = 3;
        public static final int TopLeft = 4;
        public static final int TopRight = 5;
    }

    public enum ScaleType {
        SURFACE_BEST_FIT,
        SURFACE_FIT_SCREEN,
        SURFACE_FILL,
        SURFACE_16_9,
        SURFACE_4_3,
        SURFACE_ORIGINAL
    }

    private boolean isEncoded(int i) {
        return i == 5 || i == 6 || i == 7 || i == 8 || i == 14;
    }

    private native boolean nativeAddSlave(int i, String str, boolean z);

    private native String nativeGetAspectRatio();

    private native long nativeGetAudioDelay();

    private native int nativeGetAudioTrack();

    private native TrackDescription[] nativeGetAudioTracks();

    private native int nativeGetAudioTracksCount();

    private native Chapter[] nativeGetChapters(int i);

    private native float nativeGetScale();

    private native long nativeGetSpuDelay();

    private native int nativeGetSpuTrack();

    private native TrackDescription[] nativeGetSpuTracks();

    private native int nativeGetSpuTracksCount();

    private native Title[] nativeGetTitles();

    private native int nativeGetVideoTrack();

    private native TrackDescription[] nativeGetVideoTracks();

    private native int nativeGetVideoTracksCount();

    private native void nativeNewFromLibVlc(LibVLC libVLC, AWindow aWindow);

    private native void nativeNewFromMedia(Media media, AWindow aWindow);

    private native void nativePlay();

    private native void nativeRelease();

    private native void nativeSetAspectRatio(String str);

    private native boolean nativeSetAudioDelay(long j);

    private native boolean nativeSetAudioOutput(String str);

    private native boolean nativeSetAudioOutputDevice(String str);

    private native boolean nativeSetAudioTrack(int i);

    private native boolean nativeSetEqualizer(Equalizer equalizer);

    private native void nativeSetMedia(Media media);

    private native int nativeSetRenderer(RendererItem rendererItem);

    private native void nativeSetScale(float f);

    private native boolean nativeSetSpuDelay(long j);

    private native boolean nativeSetSpuTrack(int i);

    private native void nativeSetVideoTitleDisplay(int i, int i2);

    private native boolean nativeSetVideoTrack(int i);

    private native void nativeStop();

    private native boolean nativeUpdateViewpoint(float f, float f2, float f3, float f4, boolean z);

    public native int getChapter();

    public native long getLength();

    public native int getPlayerState();

    public native float getPosition();

    public native float getRate();

    public native long getTime();

    public native int getTitle();

    public native int getVolume();

    public native boolean isPlaying();

    public native boolean isSeekable();

    public native void navigate(int i);

    public native int nextChapter();

    public native void pause();

    public native int previousChapter();

    public native void setChapter(int i);

    public native void setPosition(float f);

    public native void setRate(float f);

    public native long setTime(long j);

    public native void setTitle(int i);

    public native int setVolume(int i);

    public /* bridge */ /* synthetic */ boolean isReleased() {
        return super.isReleased();
    }

    public static class Event extends VLCEvent {
        public static final int Buffering = 259;
        public static final int ESAdded = 276;
        public static final int ESDeleted = 277;
        public static final int ESSelected = 278;
        public static final int EncounteredError = 266;
        public static final int EndReached = 265;
        public static final int LengthChanged = 273;
        public static final int MediaChanged = 256;
        public static final int Opening = 258;
        public static final int PausableChanged = 270;
        public static final int Paused = 261;
        public static final int Playing = 260;
        public static final int PositionChanged = 268;
        public static final int SeekableChanged = 269;
        public static final int Stopped = 262;
        public static final int TimeChanged = 267;
        public static final int Vout = 274;

        protected Event(int i) {
            super(i);
        }

        protected Event(int i, long j) {
            super(i, j);
        }

        protected Event(int i, long j, long j2) {
            super(i, j, j2);
        }

        protected Event(int i, float f) {
            super(i, f);
        }

        public long getTimeChanged() {
            return this.arg1;
        }

        public long getLengthChanged() {
            return this.arg1;
        }

        public float getPositionChanged() {
            return this.argf1;
        }

        public int getVoutCount() {
            return (int) this.arg1;
        }

        public int getEsChangedType() {
            return (int) this.arg1;
        }

        public int getEsChangedID() {
            return (int) this.arg2;
        }

        public boolean getPausable() {
            return this.arg1 != 0;
        }

        public boolean getSeekable() {
            return this.arg1 != 0;
        }

        public float getBuffering() {
            return this.argf1;
        }
    }

    public static class Title {
        public final long duration;
        private final int flags;
        public final String name;

        private static class Flags {
            public static final int INTERACTIVE = 2;
            public static final int MENU = 1;

            private Flags() {
            }
        }

        public Title(long j, String str, int i) {
            this.duration = j;
            this.name = str;
            this.flags = i;
        }

        public boolean isMenu() {
            return (this.flags & 1) != 0;
        }

        public boolean isInteractive() {
            return (this.flags & 2) != 0;
        }
    }

    private static Title createTitleFromNative(long j, String str, int i) {
        return new Title(j, str, i);
    }

    public static class Chapter {
        public final long duration;
        public final String name;
        public final long timeOffset;

        private Chapter(long j, long j2, String str) {
            this.timeOffset = j;
            this.duration = j2;
            this.name = str;
        }
    }

    private static Chapter createChapterFromNative(long j, long j2, String str) {
        return new Chapter(j, j2, str);
    }

    public static class TrackDescription {

        /* renamed from: id */
        public final int f6492id;
        public final String name;

        private TrackDescription(int i, String str) {
            this.f6492id = i;
            this.name = str;
        }
    }

    private static TrackDescription createTrackDescriptionFromNative(int i, String str) {
        return new TrackDescription(i, str);
    }

    public static class Equalizer {
        private long mInstance;

        private native float nativeGetAmp(int i);

        private static native int nativeGetBandCount();

        private static native float nativeGetBandFrequency(int i);

        private native float nativeGetPreAmp();

        private static native int nativeGetPresetCount();

        private static native String nativeGetPresetName(int i);

        private native void nativeNew();

        private native void nativeNewFromPreset(int i);

        private native void nativeRelease();

        private native boolean nativeSetAmp(int i, float f);

        private native boolean nativeSetPreAmp(float f);

        private Equalizer() {
            nativeNew();
        }

        private Equalizer(int i) {
            nativeNewFromPreset(i);
        }

        /* access modifiers changed from: protected */
        public void finalize() throws Throwable {
            try {
                nativeRelease();
            } finally {
                super.finalize();
            }
        }

        public static Equalizer create() {
            return new Equalizer();
        }

        public static Equalizer createFromPreset(int i) {
            return new Equalizer(i);
        }

        public static int getPresetCount() {
            return nativeGetPresetCount();
        }

        public static String getPresetName(int i) {
            return nativeGetPresetName(i);
        }

        public static int getBandCount() {
            return nativeGetBandCount();
        }

        public static float getBandFrequency(int i) {
            return nativeGetBandFrequency(i);
        }

        public float getPreAmp() {
            return nativeGetPreAmp();
        }

        public boolean setPreAmp(float f) {
            return nativeSetPreAmp(f);
        }

        public float getAmp(int i) {
            return nativeGetAmp(i);
        }

        public boolean setAmp(int i, float f) {
            return nativeSetAmp(i, f);
        }
    }

    /* access modifiers changed from: private */
    public synchronized void updateAudioOutputDevice(long j, String str) {
        this.mCanDoPassthrough = j != 0;
        if (this.mAudioDigitalOutputEnabled && this.mCanDoPassthrough) {
            str = "encoded:" + j;
        }
        if (!str.equals(this.mAudioPlugOutputDevice)) {
            this.mAudioPlugOutputDevice = str;
            setAudioOutputDeviceInternal(this.mAudioPlugOutputDevice, false);
        }
    }

    /* access modifiers changed from: private */
    public long getEncodingFlags(int[] iArr) {
        long j = 0;
        if (iArr == null) {
            return 0;
        }
        for (int i : iArr) {
            if (isEncoded(i)) {
                j |= (long) (1 << i);
            }
        }
        return j;
    }

    private BroadcastReceiver createAudioPlugReceiver() {
        return new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                long j;
                String action = intent.getAction();
                if (action != null && action.equalsIgnoreCase("android.media.action.HDMI_AUDIO_PLUG")) {
                    boolean z = false;
                    if (intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
                        z = true;
                    }
                    if (!z) {
                        j = 0;
                    } else {
                        j = MediaPlayer.this.getEncodingFlags(intent.getIntArrayExtra("android.media.extra.ENCODINGS"));
                    }
                    MediaPlayer.this.updateAudioOutputDevice(j, "stereo");
                }
            }
        };
    }

    private void registerAudioPlugV21(boolean z) {
        if (z) {
            Intent registerReceiver = this.mLibVLC.mAppContext.registerReceiver(this.mAudioPlugReceiver, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
            if (registerReceiver != null) {
                this.mAudioPlugReceiver.onReceive(this.mLibVLC.mAppContext, registerReceiver);
                return;
            }
            return;
        }
        this.mLibVLC.mAppContext.unregisterReceiver(this.mAudioPlugReceiver);
    }

    private AudioDeviceCallback createAudioDeviceCallback() {
        return new AudioDeviceCallback() {
            private SparseArray<Long> mEncodedDevices = new SparseArray<>();

            private void onAudioDevicesChanged() {
                long j = 0;
                for (int i = 0; i < this.mEncodedDevices.size(); i++) {
                    j |= this.mEncodedDevices.valueAt(i).longValue();
                }
                MediaPlayer.this.updateAudioOutputDevice(j, j == 0 ? "stereo" : "pcm");
            }

            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    if (audioDeviceInfo.isSink()) {
                        long access$500 = MediaPlayer.this.getEncodingFlags(audioDeviceInfo.getEncodings());
                        if (access$500 != 0) {
                            this.mEncodedDevices.put(audioDeviceInfo.getId(), Long.valueOf(access$500));
                        }
                    }
                }
                onAudioDevicesChanged();
            }

            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    if (audioDeviceInfo.isSink()) {
                        this.mEncodedDevices.remove(audioDeviceInfo.getId());
                    }
                }
                onAudioDevicesChanged();
            }
        };
    }

    private void registerAudioPlugV23(boolean z) {
        AudioManager audioManager = (AudioManager) this.mLibVLC.mAppContext.getSystemService("audio");
        if (z) {
            this.mAudioDeviceCallback.onAudioDevicesAdded(audioManager.getDevices(2));
            audioManager.registerAudioDeviceCallback(this.mAudioDeviceCallback, (Handler) null);
            return;
        }
        audioManager.unregisterAudioDeviceCallback(this.mAudioDeviceCallback);
    }

    private void registerAudioPlug(boolean z) {
        if (z != this.mAudioPlugRegistered) {
            if (this.mAudioDeviceCallback != null) {
                registerAudioPlugV23(z);
            } else if (this.mAudioPlugReceiver != null) {
                registerAudioPlugV21(z);
            }
            this.mAudioPlugRegistered = z;
        }
    }

    public MediaPlayer(LibVLC libVLC) {
        super(libVLC);
        BroadcastReceiver broadcastReceiver;
        AudioDeviceCallback audioDeviceCallback = null;
        if (!AndroidUtil.isLolliPopOrLater || AndroidUtil.isMarshMallowOrLater) {
            broadcastReceiver = null;
        } else {
            broadcastReceiver = createAudioPlugReceiver();
        }
        this.mAudioPlugReceiver = broadcastReceiver;
        this.mAudioDeviceCallback = AndroidUtil.isMarshMallowOrLater ? createAudioDeviceCallback() : audioDeviceCallback;
        nativeNewFromLibVlc(libVLC, this.mWindow);
    }

    public MediaPlayer(Media media) {
        super((VLCObject) media);
        BroadcastReceiver broadcastReceiver;
        AudioDeviceCallback audioDeviceCallback = null;
        if (!AndroidUtil.isLolliPopOrLater || AndroidUtil.isMarshMallowOrLater) {
            broadcastReceiver = null;
        } else {
            broadcastReceiver = createAudioPlugReceiver();
        }
        this.mAudioPlugReceiver = broadcastReceiver;
        this.mAudioDeviceCallback = AndroidUtil.isMarshMallowOrLater ? createAudioDeviceCallback() : audioDeviceCallback;
        if (media == null || media.isReleased()) {
            throw new IllegalArgumentException("Media is null or released");
        }
        this.mMedia = media;
        this.mMedia.retain();
        nativeNewFromMedia(this.mMedia, this.mWindow);
    }

    public IVLCVout getVLCVout() {
        return this.mWindow;
    }

    public void attachViews(VLCVideoLayout vLCVideoLayout, DisplayManager displayManager, boolean z, boolean z2) {
        this.mVideoHelper = new VideoHelper(this, vLCVideoLayout, displayManager, z, z2);
        this.mVideoHelper.attachViews();
    }

    public void detachViews() {
        VideoHelper videoHelper = this.mVideoHelper;
        if (videoHelper != null) {
            videoHelper.release();
            this.mVideoHelper = null;
        }
    }

    public void updateVideoSurfaces() {
        VideoHelper videoHelper = this.mVideoHelper;
        if (videoHelper != null) {
            videoHelper.updateVideoSurfaces();
        }
    }

    public void setVideoScale(ScaleType scaleType) {
        VideoHelper videoHelper = this.mVideoHelper;
        if (videoHelper != null) {
            videoHelper.setVideoScale(scaleType);
        }
    }

    public ScaleType getVideoScale() {
        VideoHelper videoHelper = this.mVideoHelper;
        return videoHelper != null ? videoHelper.getVideoScale() : ScaleType.SURFACE_BEST_FIT;
    }

    public void setMedia(Media media) {
        if (media != null) {
            if (!media.isReleased()) {
                media.setDefaultMediaPlayerOptions();
            } else {
                throw new IllegalArgumentException("Media is released");
            }
        }
        nativeSetMedia(media);
        synchronized (this) {
            if (this.mMedia != null) {
                this.mMedia.release();
            }
            if (media != null) {
                media.retain();
            }
            this.mMedia = media;
        }
    }

    public int setRenderer(RendererItem rendererItem) {
        RendererItem rendererItem2 = this.mRenderer;
        if (rendererItem2 != null) {
            rendererItem2.release();
        }
        if (rendererItem != null) {
            rendererItem.retain();
        }
        this.mRenderer = rendererItem;
        return nativeSetRenderer(rendererItem);
    }

    public synchronized boolean hasMedia() {
        return this.mMedia != null;
    }

    public synchronized Media getMedia() {
        if (this.mMedia != null) {
            this.mMedia.retain();
        }
        return this.mMedia;
    }

    public void play() {
        synchronized (this) {
            if (!this.mPlaying) {
                if (this.mAudioReset) {
                    if (this.mAudioOutput != null) {
                        nativeSetAudioOutput(this.mAudioOutput);
                    }
                    if (this.mAudioOutputDevice != null) {
                        nativeSetAudioOutputDevice(this.mAudioOutputDevice);
                    }
                    this.mAudioReset = false;
                }
                if (this.mListenAudioPlug) {
                    registerAudioPlug(true);
                }
                this.mPlayRequested = true;
                if (this.mWindow.areSurfacesWaiting()) {
                    return;
                }
            }
            this.mPlaying = true;
            nativePlay();
        }
    }

    public void playAsset(Context context, String str) throws IOException {
        this.mAfd = context.getAssets().openFd(str);
        play(this.mAfd);
    }

    public void play(AssetFileDescriptor assetFileDescriptor) {
        play(new Media(this.mLibVLC, assetFileDescriptor));
    }

    public void play(String str) {
        play(new Media(this.mLibVLC, str));
    }

    public void play(Uri uri) {
        play(new Media(this.mLibVLC, uri));
    }

    public void play(Media media) {
        setMedia(media);
        media.release();
        play();
    }

    public void stop() {
        synchronized (this) {
            this.mPlayRequested = false;
            this.mPlaying = false;
            this.mAudioReset = true;
        }
        nativeStop();
        AssetFileDescriptor assetFileDescriptor = this.mAfd;
        if (assetFileDescriptor != null) {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    public void setVideoTitleDisplay(int i, int i2) {
        nativeSetVideoTitleDisplay(i, i2);
    }

    public float getScale() {
        return nativeGetScale();
    }

    public void setScale(float f) {
        nativeSetScale(f);
    }

    public String getAspectRatio() {
        return nativeGetAspectRatio();
    }

    public void setAspectRatio(String str) {
        nativeSetAspectRatio(str);
    }

    private boolean isAudioTrack() {
        String str = this.mAudioOutput;
        return str != null && str.equals("android_audiotrack");
    }

    public boolean updateViewpoint(float f, float f2, float f3, float f4, boolean z) {
        return nativeUpdateViewpoint(f, f2, f3, f4, z);
    }

    public synchronized boolean setAudioOutput(String str) {
        boolean nativeSetAudioOutput;
        this.mAudioOutput = str;
        this.mListenAudioPlug = isAudioTrack();
        if (!this.mListenAudioPlug) {
            registerAudioPlug(false);
        }
        nativeSetAudioOutput = nativeSetAudioOutput(str);
        if (!nativeSetAudioOutput) {
            this.mAudioOutput = null;
            this.mListenAudioPlug = false;
        }
        if (this.mListenAudioPlug) {
            registerAudioPlug(true);
        }
        return nativeSetAudioOutput;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean setAudioDigitalOutputEnabled(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.mAudioDigitalOutputEnabled     // Catch:{ all -> 0x0020 }
            r1 = 1
            if (r4 != r0) goto L_0x0008
            monitor-exit(r3)
            return r1
        L_0x0008:
            boolean r0 = r3.mListenAudioPlug     // Catch:{ all -> 0x0020 }
            r2 = 0
            if (r0 == 0) goto L_0x001e
            boolean r0 = r3.isAudioTrack()     // Catch:{ all -> 0x0020 }
            if (r0 != 0) goto L_0x0014
            goto L_0x001e
        L_0x0014:
            r3.registerAudioPlug(r2)     // Catch:{ all -> 0x0020 }
            r3.mAudioDigitalOutputEnabled = r4     // Catch:{ all -> 0x0020 }
            r3.registerAudioPlug(r1)     // Catch:{ all -> 0x0020 }
            monitor-exit(r3)
            return r1
        L_0x001e:
            monitor-exit(r3)
            return r2
        L_0x0020:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.MediaPlayer.setAudioDigitalOutputEnabled(boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean forceAudioDigitalEncodings(int[] r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.isAudioTrack()     // Catch:{ all -> 0x0039 }
            if (r0 != 0) goto L_0x000a
            r5 = 0
            monitor-exit(r4)
            return r5
        L_0x000a:
            int r0 = r5.length     // Catch:{ all -> 0x0039 }
            r1 = 1
            if (r0 != 0) goto L_0x0013
            r5 = 0
            r4.setAudioOutputDeviceInternal(r5, r1)     // Catch:{ all -> 0x0039 }
            goto L_0x0037
        L_0x0013:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            r0.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r2 = "encoded:"
            r0.append(r2)     // Catch:{ all -> 0x0039 }
            long r2 = r4.getEncodingFlags(r5)     // Catch:{ all -> 0x0039 }
            r0.append(r2)     // Catch:{ all -> 0x0039 }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = r4.mAudioPlugOutputDevice     // Catch:{ all -> 0x0039 }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0039 }
            if (r0 != 0) goto L_0x0037
            r4.mAudioPlugOutputDevice = r5     // Catch:{ all -> 0x0039 }
            java.lang.String r5 = r4.mAudioPlugOutputDevice     // Catch:{ all -> 0x0039 }
            r4.setAudioOutputDeviceInternal(r5, r1)     // Catch:{ all -> 0x0039 }
        L_0x0037:
            monitor-exit(r4)
            return r1
        L_0x0039:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.MediaPlayer.forceAudioDigitalEncodings(int[]):boolean");
    }

    private synchronized boolean setAudioOutputDeviceInternal(String str, boolean z) {
        boolean nativeSetAudioOutputDevice;
        this.mAudioOutputDevice = str;
        if (z) {
            this.mListenAudioPlug = this.mAudioOutputDevice == null && isAudioTrack();
            if (!this.mListenAudioPlug) {
                registerAudioPlug(false);
            }
        }
        nativeSetAudioOutputDevice = nativeSetAudioOutputDevice(str);
        if (!nativeSetAudioOutputDevice) {
            this.mAudioOutputDevice = null;
            this.mListenAudioPlug = false;
        }
        if (this.mListenAudioPlug) {
            registerAudioPlug(true);
        }
        return nativeSetAudioOutputDevice;
    }

    public boolean setAudioOutputDevice(String str) {
        return setAudioOutputDeviceInternal(str, true);
    }

    public Title[] getTitles() {
        return nativeGetTitles();
    }

    public Chapter[] getChapters(int i) {
        return nativeGetChapters(i);
    }

    public int getVideoTracksCount() {
        return nativeGetVideoTracksCount();
    }

    public TrackDescription[] getVideoTracks() {
        return nativeGetVideoTracks();
    }

    public int getVideoTrack() {
        return nativeGetVideoTrack();
    }

    public boolean setVideoTrack(int i) {
        if (i == -1 || (this.mWindow.areViewsAttached() && !this.mWindow.areSurfacesWaiting())) {
            return nativeSetVideoTrack(i);
        }
        return false;
    }

    public void setVideoTrackEnabled(boolean z) {
        TrackDescription[] videoTracks;
        if (!z) {
            setVideoTrack(-1);
        } else if (!isReleased() && hasMedia() && getVideoTrack() == -1 && (videoTracks = getVideoTracks()) != null) {
            for (TrackDescription trackDescription : videoTracks) {
                if (trackDescription.f6492id != -1) {
                    setVideoTrack(trackDescription.f6492id);
                    return;
                }
            }
        }
    }

    public Media.VideoTrack getCurrentVideoTrack() {
        if (getVideoTrack() == -1) {
            return null;
        }
        int trackCount = this.mMedia.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            Media.Track track = this.mMedia.getTrack(i);
            if (track.type == 1) {
                return (Media.VideoTrack) track;
            }
        }
        return null;
    }

    public int getAudioTracksCount() {
        return nativeGetAudioTracksCount();
    }

    public TrackDescription[] getAudioTracks() {
        return nativeGetAudioTracks();
    }

    public int getAudioTrack() {
        return nativeGetAudioTrack();
    }

    public boolean setAudioTrack(int i) {
        return nativeSetAudioTrack(i);
    }

    public long getAudioDelay() {
        return nativeGetAudioDelay();
    }

    public boolean setAudioDelay(long j) {
        return nativeSetAudioDelay(j);
    }

    public int getSpuTracksCount() {
        return nativeGetSpuTracksCount();
    }

    public TrackDescription[] getSpuTracks() {
        return nativeGetSpuTracks();
    }

    public int getSpuTrack() {
        return nativeGetSpuTrack();
    }

    public boolean setSpuTrack(int i) {
        return nativeSetSpuTrack(i);
    }

    public long getSpuDelay() {
        return nativeGetSpuDelay();
    }

    public boolean setSpuDelay(long j) {
        return nativeSetSpuDelay(j);
    }

    public boolean setEqualizer(Equalizer equalizer) {
        return nativeSetEqualizer(equalizer);
    }

    public boolean addSlave(int i, Uri uri, boolean z) {
        return nativeAddSlave(i, VLCUtil.encodeVLCUri(uri), z);
    }

    public boolean addSlave(int i, String str, boolean z) {
        return addSlave(i, Uri.fromFile(new File(str)), z);
    }

    public synchronized void setEventListener(EventListener eventListener) {
        super.setEventListener(eventListener);
    }

    /* access modifiers changed from: protected */
    public synchronized Event onEventNative(int i, long j, long j2, float f) {
        switch (i) {
            case 256:
            case 262:
            case 265:
            case 266:
                this.mVoutCount = 0;
                notify();
                break;
            case 258:
            case 259:
                break;
            case 260:
            case 261:
                return new Event(i);
            case 267:
                return new Event(i, j);
            case 268:
                return new Event(i, f);
            case 269:
            case 270:
                return new Event(i, j);
            case 273:
                return new Event(i, j);
            case 274:
                this.mVoutCount = (int) j;
                notify();
                return new Event(i, j);
            case 276:
            case 277:
            case 278:
                return new Event(i, j, j2);
            default:
                return null;
        }
        return new Event(i, f);
    }

    /* access modifiers changed from: protected */
    public void onReleaseNative() {
        detachViews();
        this.mWindow.detachViews();
        registerAudioPlug(false);
        Media media = this.mMedia;
        if (media != null) {
            media.release();
        }
        RendererItem rendererItem = this.mRenderer;
        if (rendererItem != null) {
            rendererItem.release();
        }
        this.mVoutCount = 0;
        nativeRelease();
    }

    public boolean canDoPassthrough() {
        return this.mCanDoPassthrough;
    }
}
