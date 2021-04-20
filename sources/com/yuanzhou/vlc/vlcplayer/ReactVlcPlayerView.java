package com.yuanzhou.vlc.vlcplayer;

import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.zhihu.matisse.internal.loader.AlbumLoader;
import java.util.ArrayList;
import org.videolan.libvlc.IVLCVout;
import org.videolan.libvlc.LibVLC;
import org.videolan.libvlc.Media;
import org.videolan.libvlc.MediaPlayer;

class ReactVlcPlayerView extends TextureView implements LifecycleEventListener, TextureView.SurfaceTextureListener, AudioManager.OnAudioFocusChangeListener {
    private static final String TAG = "ReactVlcPlayerView";
    private final AudioManager audioManager;
    /* access modifiers changed from: private */
    public boolean autoAspectRatio = false;
    IVLCVout.Callback callback = new IVLCVout.Callback() {
        public void onSurfacesCreated(IVLCVout iVLCVout) {
            boolean unused = ReactVlcPlayerView.this.isSurfaceViewDestory = false;
        }

        public void onSurfacesDestroyed(IVLCVout iVLCVout) {
            boolean unused = ReactVlcPlayerView.this.isSurfaceViewDestory = true;
        }
    };
    /* access modifiers changed from: private */
    public final VideoEventEmitter eventEmitter;
    private boolean isHostPaused = false;
    /* access modifiers changed from: private */
    public boolean isPaused = true;
    /* access modifiers changed from: private */
    public boolean isSurfaceViewDestory;
    private LibVLC libvlc;
    private final Media.EventListener mMediaListener = new Media.EventListener() {
        public void onEvent(Media.Event event) {
            int i = event.type;
            if (i == 0) {
                Log.i(ReactVlcPlayerView.TAG, "Media.Event.MetaChanged:  =" + event.getMetaId());
            } else if (i == 3) {
                Log.i(ReactVlcPlayerView.TAG, "Media.Event.ParsedChanged  =" + event.getMetaId());
            } else if (i != 5) {
                Log.i(ReactVlcPlayerView.TAG, "Media.Event.type=" + event.type + "   eventgetParsedStatus=" + event.getParsedStatus());
            } else {
                Log.i(ReactVlcPlayerView.TAG, "StateChanged   =" + event.getMetaId());
            }
        }
    };
    /* access modifiers changed from: private */
    public MediaPlayer mMediaPlayer = null;
    private MediaPlayer.EventListener mPlayerListener = new MediaPlayer.EventListener() {
        long currentTime = 0;
        long totalLength = 0;

        public void onEvent(MediaPlayer.Event event) {
            boolean isPlaying = ReactVlcPlayerView.this.mMediaPlayer.isPlaying();
            this.currentTime = ReactVlcPlayerView.this.mMediaPlayer.getTime();
            float position = ReactVlcPlayerView.this.mMediaPlayer.getPosition();
            this.totalLength = ReactVlcPlayerView.this.mMediaPlayer.getLength();
            WritableMap createMap = Arguments.createMap();
            createMap.putBoolean("isPlaying", isPlaying);
            createMap.putDouble("position", (double) position);
            createMap.putDouble("currentTime", (double) this.currentTime);
            createMap.putDouble("duration", (double) this.totalLength);
            switch (event.type) {
                case 258:
                    createMap.putString("type", "Opening");
                    ReactVlcPlayerView.this.eventEmitter.sendEvent(createMap, VideoEventEmitter.EVENT_ON_OPEN);
                    return;
                case 259:
                    createMap.putDouble("bufferRate", (double) event.getBuffering());
                    createMap.putString("type", "Buffering");
                    ReactVlcPlayerView.this.eventEmitter.sendEvent(createMap, VideoEventEmitter.EVENT_ON_VIDEO_BUFFERING);
                    return;
                case 260:
                    createMap.putString("type", "Playing");
                    ReactVlcPlayerView.this.eventEmitter.sendEvent(createMap, VideoEventEmitter.EVENT_ON_IS_PLAYING);
                    return;
                case 261:
                    createMap.putString("type", "Paused");
                    ReactVlcPlayerView.this.eventEmitter.sendEvent(createMap, VideoEventEmitter.EVENT_ON_PAUSED);
                    return;
                case 262:
                    createMap.putString("type", "Stopped");
                    ReactVlcPlayerView.this.eventEmitter.sendEvent(createMap, VideoEventEmitter.EVENT_ON_VIDEO_STOPPED);
                    return;
                case 265:
                    createMap.putString("type", "Ended");
                    ReactVlcPlayerView.this.eventEmitter.sendEvent(createMap, VideoEventEmitter.EVENT_END);
                    return;
                case 266:
                    createMap.putString("type", "Error");
                    ReactVlcPlayerView.this.eventEmitter.sendEvent(createMap, VideoEventEmitter.EVENT_ON_ERROR);
                    return;
                case 267:
                    createMap.putString("type", "TimeChanged");
                    ReactVlcPlayerView.this.eventEmitter.sendEvent(createMap, VideoEventEmitter.EVENT_SEEK);
                    return;
                default:
                    createMap.putString("type", event.type + "");
                    ReactVlcPlayerView.this.eventEmitter.onVideoStateChange(createMap);
                    return;
            }
        }
    };
    /* access modifiers changed from: private */
    public Handler mProgressUpdateHandler = new Handler();
    /* access modifiers changed from: private */
    public float mProgressUpdateInterval = 250.0f;
    /* access modifiers changed from: private */
    public Runnable mProgressUpdateRunnable = null;
    /* access modifiers changed from: private */
    public int mSarDen = 0;
    /* access modifiers changed from: private */
    public int mSarNum = 0;
    /* access modifiers changed from: private */
    public int mVideoHeight = 0;
    /* access modifiers changed from: private */
    public int mVideoVisibleHeight = 0;
    /* access modifiers changed from: private */
    public int mVideoVisibleWidth = 0;
    /* access modifiers changed from: private */
    public int mVideoWidth = 0;
    private boolean netStrTag;
    private View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() {
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (view.getWidth() > 0 && view.getHeight() > 0) {
                int unused = ReactVlcPlayerView.this.mVideoWidth = view.getWidth();
                int unused2 = ReactVlcPlayerView.this.mVideoHeight = view.getHeight();
                if (ReactVlcPlayerView.this.mMediaPlayer != null) {
                    ReactVlcPlayerView.this.mMediaPlayer.getVLCVout().setWindowSize(ReactVlcPlayerView.this.mVideoWidth, ReactVlcPlayerView.this.mVideoHeight);
                    if (ReactVlcPlayerView.this.autoAspectRatio) {
                        MediaPlayer access$000 = ReactVlcPlayerView.this.mMediaPlayer;
                        access$000.setAspectRatio(ReactVlcPlayerView.this.mVideoWidth + ":" + ReactVlcPlayerView.this.mVideoHeight);
                    }
                }
            }
        }
    };
    private IVLCVout.OnNewVideoLayoutListener onNewVideoLayoutListener = new IVLCVout.OnNewVideoLayoutListener() {
        public void onNewVideoLayout(IVLCVout iVLCVout, int i, int i2, int i3, int i4, int i5, int i6) {
            if (i * i2 != 0) {
                int unused = ReactVlcPlayerView.this.mVideoWidth = i;
                int unused2 = ReactVlcPlayerView.this.mVideoHeight = i2;
                int unused3 = ReactVlcPlayerView.this.mVideoVisibleWidth = i3;
                int unused4 = ReactVlcPlayerView.this.mVideoVisibleHeight = i4;
                int unused5 = ReactVlcPlayerView.this.mSarNum = i5;
                int unused6 = ReactVlcPlayerView.this.mSarDen = i6;
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("mVideoWidth", ReactVlcPlayerView.this.mVideoWidth);
                createMap.putInt("mVideoHeight", ReactVlcPlayerView.this.mVideoHeight);
                createMap.putInt("mVideoVisibleWidth", ReactVlcPlayerView.this.mVideoVisibleWidth);
                createMap.putInt("mVideoVisibleHeight", ReactVlcPlayerView.this.mVideoVisibleHeight);
                createMap.putInt("mSarNum", ReactVlcPlayerView.this.mSarNum);
                createMap.putInt("mSarDen", ReactVlcPlayerView.this.mSarDen);
                createMap.putString("type", "onNewVideoLayout");
                ReactVlcPlayerView.this.eventEmitter.onVideoStateChange(createMap);
            }
        }
    };
    private int preVolume = 200;
    private int screenHeight = 0;
    private int screenWidth = 0;
    private String src;
    private ReadableMap srcMap;
    private Surface surfaceVideo;
    private TextureView surfaceView;
    private final String tag = TAG;
    private final ThemedReactContext themedReactContext;

    public void doSnapshot(String str) {
    }

    public void onAudioFocusChange(int i) {
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void setRepeatModifier(boolean z) {
    }

    public ReactVlcPlayerView(ThemedReactContext themedReactContext2) {
        super(themedReactContext2);
        this.eventEmitter = new VideoEventEmitter(themedReactContext2);
        this.themedReactContext = themedReactContext2;
        this.audioManager = (AudioManager) themedReactContext2.getSystemService("audio");
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.screenHeight = displayMetrics.heightPixels;
        this.screenWidth = displayMetrics.widthPixels;
        setSurfaceTextureListener(this);
        addOnLayoutChangeListener(this.onLayoutChangeListener);
    }

    public void setId(int i) {
        super.setId(i);
        this.eventEmitter.setViewId(i);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopPlayback();
    }

    public void onHostResume() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null && this.isSurfaceViewDestory && this.isHostPaused) {
            IVLCVout vLCVout = mediaPlayer.getVLCVout();
            if (!vLCVout.areViewsAttached()) {
                vLCVout.attachViews(this.onNewVideoLayoutListener);
                this.isSurfaceViewDestory = false;
                this.isPaused = false;
                this.mMediaPlayer.play();
            }
        }
    }

    public void onHostPause() {
        MediaPlayer mediaPlayer;
        if (!this.isPaused && (mediaPlayer = this.mMediaPlayer) != null) {
            this.isPaused = true;
            this.isHostPaused = true;
            mediaPlayer.pause();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("type", "Paused");
            this.eventEmitter.onVideoStateChange(createMap);
        }
        Log.i("onHostPause", "---------onHostPause------------>");
    }

    public void onHostDestroy() {
        stopPlayback();
    }

    private void setProgressUpdateRunnable() {
        if (this.mMediaPlayer != null) {
            this.mProgressUpdateRunnable = new Runnable() {
                public void run() {
                    if (ReactVlcPlayerView.this.mMediaPlayer != null && ReactVlcPlayerView.this.mMediaPlayer.isPlaying() && !ReactVlcPlayerView.this.isPaused) {
                        Arguments.createMap();
                        boolean isPlaying = ReactVlcPlayerView.this.mMediaPlayer.isPlaying();
                        long time = ReactVlcPlayerView.this.mMediaPlayer.getTime();
                        float position = ReactVlcPlayerView.this.mMediaPlayer.getPosition();
                        long length = ReactVlcPlayerView.this.mMediaPlayer.getLength();
                        WritableMap createMap = Arguments.createMap();
                        createMap.putBoolean("isPlaying", isPlaying);
                        createMap.putDouble("position", (double) position);
                        createMap.putDouble("currentTime", (double) time);
                        createMap.putDouble("duration", (double) length);
                        ReactVlcPlayerView.this.eventEmitter.sendEvent(createMap, VideoEventEmitter.EVENT_PROGRESS);
                        ReactVlcPlayerView.this.mProgressUpdateHandler.postDelayed(ReactVlcPlayerView.this.mProgressUpdateRunnable, (long) Math.round(ReactVlcPlayerView.this.mProgressUpdateInterval));
                    }
                }
            };
        }
    }

    private void stopPlayback() {
        onStopPlayback();
        releasePlayer();
    }

    private void onStopPlayback() {
        setKeepScreenOn(false);
        this.audioManager.abandonAudioFocus(this);
    }

    private void createPlayer(boolean z, boolean z2) {
        Media media;
        releasePlayer();
        if (getSurfaceTexture() != null) {
            try {
                ArrayList arrayList = new ArrayList();
                Integer num = null;
                String string = this.srcMap.hasKey(AlbumLoader.COLUMN_URI) ? this.srcMap.getString(AlbumLoader.COLUMN_URI) : null;
                boolean z3 = this.srcMap.hasKey("isNetwork") ? this.srcMap.getBoolean("isNetwork") : false;
                boolean z4 = this.srcMap.hasKey("autoplay") ? this.srcMap.getBoolean("autoplay") : true;
                int i = this.srcMap.hasKey("initType") ? this.srcMap.getInt("initType") : 1;
                ReadableArray array = this.srcMap.hasKey("mediaOptions") ? this.srcMap.getArray("mediaOptions") : null;
                ReadableArray array2 = this.srcMap.hasKey("initOptions") ? this.srcMap.getArray("initOptions") : null;
                Integer valueOf = this.srcMap.hasKey("hwDecoderEnabled") ? Integer.valueOf(this.srcMap.getInt("hwDecoderEnabled")) : null;
                if (this.srcMap.hasKey("hwDecoderForced")) {
                    num = Integer.valueOf(this.srcMap.getInt("hwDecoderForced"));
                }
                if (array2 != null) {
                    ArrayList<Object> arrayList2 = array2.toArrayList();
                    for (int i2 = 0; i2 < arrayList2.size() - 1; i2++) {
                        arrayList.add((String) arrayList2.get(i2));
                    }
                }
                if (i == 1) {
                    this.libvlc = new LibVLC(getContext());
                } else {
                    this.libvlc = new LibVLC(getContext(), arrayList);
                }
                this.mMediaPlayer = new MediaPlayer(this.libvlc);
                this.mMediaPlayer.setEventListener(this.mPlayerListener);
                IVLCVout vLCVout = this.mMediaPlayer.getVLCVout();
                if (this.mVideoWidth > 0 && this.mVideoHeight > 0) {
                    vLCVout.setWindowSize(this.mVideoWidth, this.mVideoHeight);
                    if (this.autoAspectRatio) {
                        MediaPlayer mediaPlayer = this.mMediaPlayer;
                        mediaPlayer.setAspectRatio(this.mVideoWidth + ":" + this.mVideoHeight);
                    }
                }
                getResources().getDisplayMetrics();
                if (z3) {
                    media = new Media(this.libvlc, Uri.parse(string));
                } else {
                    media = new Media(this.libvlc, string);
                }
                media.setEventListener(this.mMediaListener);
                if (!(valueOf == null || num == null)) {
                    media.setHWDecoderEnabled(valueOf.intValue() >= 1, num.intValue() >= 1);
                }
                if (array != null) {
                    ArrayList<Object> arrayList3 = array.toArrayList();
                    for (int i3 = 0; i3 < arrayList3.size() - 1; i3++) {
                        media.addOption((String) arrayList3.get(i3));
                    }
                }
                this.mMediaPlayer.setMedia(media);
                this.mMediaPlayer.setScale(0.0f);
                if (!vLCVout.areViewsAttached()) {
                    vLCVout.addCallback(this.callback);
                    vLCVout.setVideoSurface(getSurfaceTexture());
                    vLCVout.attachViews(this.onNewVideoLayoutListener);
                }
                if (z2) {
                    if (z) {
                        this.mMediaPlayer.play();
                    }
                } else if (z4) {
                    this.isPaused = false;
                    this.mMediaPlayer.play();
                }
                this.eventEmitter.loadStart();
                setProgressUpdateRunnable();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void releasePlayer() {
        if (this.libvlc != null) {
            this.mMediaPlayer.stop();
            IVLCVout vLCVout = this.mMediaPlayer.getVLCVout();
            vLCVout.removeCallback(this.callback);
            vLCVout.detachViews();
            this.libvlc.release();
            this.libvlc = null;
        }
    }

    public void seekTo(long j) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setTime(j);
        }
    }

    public void setPosition(float f) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null && f >= 0.0f && f <= 1.0f) {
            mediaPlayer.setPosition(f);
        }
    }

    public void setSrc(String str, boolean z, boolean z2) {
        this.src = str;
        this.netStrTag = z;
        createPlayer(z2, false);
    }

    public void setSrc(ReadableMap readableMap) {
        this.srcMap = readableMap;
        createPlayer(true, false);
    }

    public void setRateModifier(float f) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setRate(f);
        }
    }

    public void setmProgressUpdateInterval(float f) {
        this.mProgressUpdateInterval = f;
    }

    public void setVolumeModifier(int i) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(i);
        }
    }

    public void setMutedModifier(boolean z) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return;
        }
        if (z) {
            this.preVolume = mediaPlayer.getVolume();
            this.mMediaPlayer.setVolume(0);
            return;
        }
        mediaPlayer.setVolume(this.preVolume);
    }

    public void setPausedModifier(boolean z) {
        Log.i("paused:", "" + z + ":" + this.mMediaPlayer);
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            createPlayer(!z, false);
        } else if (z) {
            this.isPaused = true;
            mediaPlayer.pause();
        } else {
            this.isPaused = false;
            mediaPlayer.play();
            Log.i("do play:", "true");
        }
    }

    public void doResume(boolean z) {
        createPlayer(z, true);
    }

    public void setAspectRatio(String str) {
        MediaPlayer mediaPlayer;
        if (!this.autoAspectRatio && (mediaPlayer = this.mMediaPlayer) != null) {
            mediaPlayer.setAspectRatio(str);
        }
    }

    public void setAutoAspectRatio(boolean z) {
        this.autoAspectRatio = z;
    }

    public void cleanUpResources() {
        TextureView textureView = this.surfaceView;
        if (textureView != null) {
            textureView.removeOnLayoutChangeListener(this.onLayoutChangeListener);
        }
        stopPlayback();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.mVideoWidth = i;
        this.mVideoHeight = i2;
        this.surfaceVideo = new Surface(surfaceTexture);
        createPlayer(true, false);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Log.i("onSurfaceTextureUpdated", "onSurfaceTextureUpdated");
    }
}
