package org.videolan.libvlc;

import android.os.Handler;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import org.videolan.C5570R;
import org.videolan.libvlc.IVLCVout;
import org.videolan.libvlc.Media;
import org.videolan.libvlc.MediaPlayer;
import org.videolan.libvlc.util.DisplayManager;
import org.videolan.libvlc.util.VLCVideoLayout;

class VideoHelper implements IVLCVout.OnNewVideoLayoutListener {
    private static final String TAG = "LibVLC/VideoHelper";
    private MediaPlayer.ScaleType mCurrentScaleType = MediaPlayer.ScaleType.SURFACE_BEST_FIT;
    private DisplayManager mDisplayManager;
    /* access modifiers changed from: private */
    public final Handler mHandler = new Handler();
    private MediaPlayer mMediaPlayer;
    /* access modifiers changed from: private */
    public View.OnLayoutChangeListener mOnLayoutChangeListener = null;
    private SurfaceView mSubtitlesSurface = null;
    private int mVideoHeight = 0;
    private int mVideoSarDen = 0;
    private int mVideoSarNum = 0;
    private SurfaceView mVideoSurface = null;
    /* access modifiers changed from: private */
    public FrameLayout mVideoSurfaceFrame;
    private TextureView mVideoTexture = null;
    private int mVideoVisibleHeight = 0;
    private int mVideoVisibleWidth = 0;
    private int mVideoWidth = 0;

    VideoHelper(MediaPlayer mediaPlayer, VLCVideoLayout vLCVideoLayout, DisplayManager displayManager, boolean z, boolean z2) {
        init(mediaPlayer, vLCVideoLayout, displayManager, z, !z2);
    }

    private void init(MediaPlayer mediaPlayer, VLCVideoLayout vLCVideoLayout, DisplayManager displayManager, boolean z, boolean z2) {
        this.mMediaPlayer = mediaPlayer;
        this.mDisplayManager = displayManager;
        DisplayManager displayManager2 = this.mDisplayManager;
        if (displayManager2 == null || displayManager2.isPrimary()) {
            this.mVideoSurfaceFrame = (FrameLayout) vLCVideoLayout.findViewById(C5570R.C5573id.player_surface_frame);
            if (z2) {
                ViewStub viewStub = (ViewStub) this.mVideoSurfaceFrame.findViewById(C5570R.C5573id.surface_stub);
                this.mVideoSurface = (SurfaceView) (viewStub != null ? viewStub.inflate() : this.mVideoSurfaceFrame.findViewById(C5570R.C5573id.surface_video));
                if (z) {
                    ViewStub viewStub2 = (ViewStub) this.mVideoSurfaceFrame.findViewById(C5570R.C5573id.subtitles_surface_stub);
                    this.mSubtitlesSurface = (SurfaceView) (viewStub2 != null ? viewStub2.inflate() : this.mVideoSurfaceFrame.findViewById(C5570R.C5573id.surface_subtitles));
                    this.mSubtitlesSurface.setZOrderMediaOverlay(true);
                    this.mSubtitlesSurface.getHolder().setFormat(-3);
                    return;
                }
                return;
            }
            ViewStub viewStub3 = (ViewStub) this.mVideoSurfaceFrame.findViewById(C5570R.C5573id.texture_stub);
            this.mVideoTexture = (TextureView) (viewStub3 != null ? viewStub3.inflate() : this.mVideoSurfaceFrame.findViewById(C5570R.C5573id.texture_video));
        } else if (this.mDisplayManager.getPresentation() != null) {
            this.mVideoSurfaceFrame = this.mDisplayManager.getPresentation().getSurfaceFrame();
            this.mVideoSurface = this.mDisplayManager.getPresentation().getSurfaceView();
            this.mSubtitlesSurface = this.mDisplayManager.getPresentation().getSubtitlesSurfaceView();
        }
    }

    /* access modifiers changed from: package-private */
    public void release() {
        if (this.mMediaPlayer.getVLCVout().areViewsAttached()) {
            detachViews();
        }
        this.mMediaPlayer = null;
        this.mVideoSurfaceFrame = null;
        this.mHandler.removeCallbacks((Runnable) null);
        this.mVideoSurface = null;
        this.mSubtitlesSurface = null;
        this.mVideoTexture = null;
    }

    /* access modifiers changed from: package-private */
    public void attachViews() {
        if (this.mVideoSurface != null || this.mVideoTexture != null) {
            IVLCVout vLCVout = this.mMediaPlayer.getVLCVout();
            SurfaceView surfaceView = this.mVideoSurface;
            if (surfaceView != null) {
                vLCVout.setVideoView(surfaceView);
                SurfaceView surfaceView2 = this.mSubtitlesSurface;
                if (surfaceView2 != null) {
                    vLCVout.setSubtitlesView(surfaceView2);
                }
            } else {
                TextureView textureView = this.mVideoTexture;
                if (textureView != null) {
                    vLCVout.setVideoView(textureView);
                } else {
                    return;
                }
            }
            vLCVout.attachViews(this);
            if (this.mOnLayoutChangeListener == null) {
                this.mOnLayoutChangeListener = new View.OnLayoutChangeListener() {
                    private final Runnable runnable = new Runnable() {
                        public void run() {
                            if (VideoHelper.this.mVideoSurfaceFrame != null && VideoHelper.this.mOnLayoutChangeListener != null) {
                                VideoHelper.this.updateVideoSurfaces();
                            }
                        }
                    };

                    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
                            VideoHelper.this.mHandler.removeCallbacks(this.runnable);
                            VideoHelper.this.mHandler.post(this.runnable);
                        }
                    }
                };
            }
            this.mVideoSurfaceFrame.addOnLayoutChangeListener(this.mOnLayoutChangeListener);
            this.mMediaPlayer.setVideoTrackEnabled(true);
        }
    }

    /* access modifiers changed from: package-private */
    public void detachViews() {
        FrameLayout frameLayout;
        View.OnLayoutChangeListener onLayoutChangeListener = this.mOnLayoutChangeListener;
        if (!(onLayoutChangeListener == null || (frameLayout = this.mVideoSurfaceFrame) == null)) {
            frameLayout.removeOnLayoutChangeListener(onLayoutChangeListener);
            this.mOnLayoutChangeListener = null;
        }
        this.mMediaPlayer.setVideoTrackEnabled(false);
        this.mMediaPlayer.getVLCVout().detachViews();
    }

    private void changeMediaPlayerLayout(int i, int i2) {
        StringBuilder sb;
        if (!this.mMediaPlayer.isReleased()) {
            switch (this.mCurrentScaleType) {
                case SURFACE_BEST_FIT:
                    this.mMediaPlayer.setAspectRatio((String) null);
                    this.mMediaPlayer.setScale(0.0f);
                    return;
                case SURFACE_FIT_SCREEN:
                case SURFACE_FILL:
                    Media.VideoTrack currentVideoTrack = this.mMediaPlayer.getCurrentVideoTrack();
                    if (currentVideoTrack != null) {
                        boolean z = currentVideoTrack.orientation == 5 || currentVideoTrack.orientation == 6;
                        if (this.mCurrentScaleType == MediaPlayer.ScaleType.SURFACE_FIT_SCREEN) {
                            int i3 = currentVideoTrack.width;
                            int i4 = currentVideoTrack.height;
                            if (z) {
                                int i5 = i4;
                                i4 = i3;
                                i3 = i5;
                            }
                            if (currentVideoTrack.sarNum != currentVideoTrack.sarDen) {
                                i3 = (i3 * currentVideoTrack.sarNum) / currentVideoTrack.sarDen;
                            }
                            float f = (float) i3;
                            float f2 = (float) i4;
                            float f3 = (float) i;
                            float f4 = (float) i2;
                            this.mMediaPlayer.setScale(f3 / f4 >= f / f2 ? f3 / f : f4 / f2);
                            this.mMediaPlayer.setAspectRatio((String) null);
                            return;
                        }
                        this.mMediaPlayer.setScale(0.0f);
                        MediaPlayer mediaPlayer = this.mMediaPlayer;
                        if (!z) {
                            sb = new StringBuilder();
                            sb.append("");
                            sb.append(i);
                            sb.append(":");
                            sb.append(i2);
                        } else {
                            sb = new StringBuilder();
                            sb.append("");
                            sb.append(i2);
                            sb.append(":");
                            sb.append(i);
                        }
                        mediaPlayer.setAspectRatio(sb.toString());
                        return;
                    }
                    return;
                case SURFACE_16_9:
                    this.mMediaPlayer.setAspectRatio("16:9");
                    this.mMediaPlayer.setScale(0.0f);
                    return;
                case SURFACE_4_3:
                    this.mMediaPlayer.setAspectRatio("4:3");
                    this.mMediaPlayer.setScale(0.0f);
                    return;
                case SURFACE_ORIGINAL:
                    this.mMediaPlayer.setAspectRatio((String) null);
                    this.mMediaPlayer.setScale(1.0f);
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0128, code lost:
        if (r10 < 1.3333333333333333d) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0132, code lost:
        if (r10 < 1.7777777777777777d) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0137, code lost:
        if (r10 >= r0) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013c, code lost:
        if (r10 < r0) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013e, code lost:
        r8 = r3 / r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0141, code lost:
        r3 = r8 * r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0143, code lost:
        r7.width = (int) java.lang.Math.ceil((((double) r15.mVideoWidth) * r3) / ((double) r15.mVideoVisibleWidth));
        r7.height = (int) java.lang.Math.ceil((((double) r15.mVideoHeight) * r8) / ((double) r15.mVideoVisibleHeight));
        r15.mVideoSurface.setLayoutParams(r7);
        r0 = r15.mSubtitlesSurface;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016a, code lost:
        if (r0 == null) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x016c, code lost:
        r0.setLayoutParams(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016f, code lost:
        r0 = r15.mVideoSurfaceFrame.getLayoutParams();
        r0.width = (int) java.lang.Math.floor(r3);
        r0.height = (int) java.lang.Math.floor(r8);
        r15.mVideoSurfaceFrame.setLayoutParams(r0);
        r15.mVideoSurface.invalidate();
        r0 = r15.mSubtitlesSurface;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018f, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0191, code lost:
        r0.invalidate();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateVideoSurfaces() {
        /*
            r15 = this;
            org.videolan.libvlc.MediaPlayer r0 = r15.mMediaPlayer
            if (r0 == 0) goto L_0x01bf
            boolean r0 = r0.isReleased()
            if (r0 == 0) goto L_0x000c
            goto L_0x01bf
        L_0x000c:
            org.videolan.libvlc.util.DisplayManager r0 = r15.mDisplayManager
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.isPrimary()
            if (r0 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            r3 = 0
            if (r0 == 0) goto L_0x0032
            android.widget.FrameLayout r4 = r15.mVideoSurfaceFrame
            android.content.Context r4 = r4.getContext()
            boolean r4 = r4 instanceof android.app.Activity
            if (r4 == 0) goto L_0x0032
            android.widget.FrameLayout r4 = r15.mVideoSurfaceFrame
            android.content.Context r4 = r4.getContext()
            android.app.Activity r4 = (android.app.Activity) r4
            goto L_0x0033
        L_0x0032:
            r4 = r3
        L_0x0033:
            if (r4 == 0) goto L_0x004e
            android.view.Window r5 = r4.getWindow()
            android.view.View r5 = r5.getDecorView()
            int r5 = r5.getWidth()
            android.view.Window r6 = r4.getWindow()
            android.view.View r6 = r6.getDecorView()
            int r6 = r6.getHeight()
            goto L_0x0088
        L_0x004e:
            org.videolan.libvlc.util.DisplayManager r5 = r15.mDisplayManager
            if (r5 == 0) goto L_0x01bf
            org.videolan.libvlc.util.DisplayManager$SecondaryDisplay r5 = r5.getPresentation()
            if (r5 == 0) goto L_0x01bf
            org.videolan.libvlc.util.DisplayManager r5 = r15.mDisplayManager
            org.videolan.libvlc.util.DisplayManager$SecondaryDisplay r5 = r5.getPresentation()
            android.view.Window r5 = r5.getWindow()
            if (r5 == 0) goto L_0x01bf
            org.videolan.libvlc.util.DisplayManager r5 = r15.mDisplayManager
            org.videolan.libvlc.util.DisplayManager$SecondaryDisplay r5 = r5.getPresentation()
            android.view.Window r5 = r5.getWindow()
            android.view.View r5 = r5.getDecorView()
            int r5 = r5.getWidth()
            org.videolan.libvlc.util.DisplayManager r6 = r15.mDisplayManager
            org.videolan.libvlc.util.DisplayManager$SecondaryDisplay r6 = r6.getPresentation()
            android.view.Window r6 = r6.getWindow()
            android.view.View r6 = r6.getDecorView()
            int r6 = r6.getHeight()
        L_0x0088:
            int r7 = r5 * r6
            if (r7 != 0) goto L_0x0094
            java.lang.String r0 = "LibVLC/VideoHelper"
            java.lang.String r1 = "Invalid surface size"
            android.util.Log.e(r0, r1)
            return
        L_0x0094:
            org.videolan.libvlc.MediaPlayer r7 = r15.mMediaPlayer
            org.videolan.libvlc.IVLCVout r7 = r7.getVLCVout()
            r7.setWindowSize(r5, r6)
            android.view.SurfaceView r7 = r15.mVideoSurface
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            int r8 = r15.mVideoWidth
            int r9 = r15.mVideoHeight
            int r8 = r8 * r9
            r9 = -1
            if (r8 == 0) goto L_0x0195
            boolean r8 = org.videolan.libvlc.util.AndroidUtil.isNougatOrLater
            if (r8 == 0) goto L_0x00ba
            if (r4 == 0) goto L_0x00ba
            boolean r4 = r4.isInPictureInPictureMode()
            if (r4 == 0) goto L_0x00ba
            goto L_0x0195
        L_0x00ba:
            int r4 = r7.width
            int r8 = r7.height
            if (r4 != r8) goto L_0x00cf
            int r4 = r7.width
            if (r4 != r9) goto L_0x00cf
            org.videolan.libvlc.MediaPlayer r4 = r15.mMediaPlayer
            r4.setAspectRatio(r3)
            org.videolan.libvlc.MediaPlayer r3 = r15.mMediaPlayer
            r4 = 0
            r3.setScale(r4)
        L_0x00cf:
            double r3 = (double) r5
            double r8 = (double) r6
            if (r0 == 0) goto L_0x00e2
            android.widget.FrameLayout r0 = r15.mVideoSurfaceFrame
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            if (r0 != r2) goto L_0x00e2
            r1 = 1
        L_0x00e2:
            if (r5 <= r6) goto L_0x00e6
            if (r1 != 0) goto L_0x00ea
        L_0x00e6:
            if (r5 >= r6) goto L_0x00ed
            if (r1 != 0) goto L_0x00ed
        L_0x00ea:
            r13 = r3
            r3 = r8
            r8 = r13
        L_0x00ed:
            int r0 = r15.mVideoSarDen
            int r1 = r15.mVideoSarNum
            if (r0 != r1) goto L_0x00ff
            int r0 = r15.mVideoVisibleWidth
            double r1 = (double) r0
            double r5 = (double) r0
            int r0 = r15.mVideoVisibleHeight
            double r10 = (double) r0
            double r5 = r5 / r10
            r13 = r1
            r0 = r5
            r5 = r13
            goto L_0x010c
        L_0x00ff:
            int r2 = r15.mVideoVisibleWidth
            double r5 = (double) r2
            double r1 = (double) r1
            double r5 = r5 * r1
            double r0 = (double) r0
            double r5 = r5 / r0
            int r0 = r15.mVideoVisibleHeight
            double r0 = (double) r0
            double r0 = r5 / r0
        L_0x010c:
            double r10 = r3 / r8
            int[] r2 = org.videolan.libvlc.VideoHelper.C55912.$SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType
            org.videolan.libvlc.MediaPlayer$ScaleType r12 = r15.mCurrentScaleType
            int r12 = r12.ordinal()
            r2 = r2[r12]
            switch(r2) {
                case 1: goto L_0x013a;
                case 2: goto L_0x0135;
                case 3: goto L_0x0143;
                case 4: goto L_0x012b;
                case 5: goto L_0x0121;
                case 6: goto L_0x011c;
                default: goto L_0x011b;
            }
        L_0x011b:
            goto L_0x0143
        L_0x011c:
            int r0 = r15.mVideoVisibleHeight
            double r8 = (double) r0
            r3 = r5
            goto L_0x0143
        L_0x0121:
            r0 = 4608683618675807573(0x3ff5555555555555, double:1.3333333333333333)
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0141
            goto L_0x013e
        L_0x012b:
            r0 = 4610685218510194460(0x3ffc71c71c71c71c, double:1.7777777777777777)
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0141
            goto L_0x013e
        L_0x0135:
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0141
            goto L_0x013e
        L_0x013a:
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0141
        L_0x013e:
            double r8 = r3 / r0
            goto L_0x0143
        L_0x0141:
            double r3 = r8 * r0
        L_0x0143:
            int r0 = r15.mVideoWidth
            double r0 = (double) r0
            double r0 = r0 * r3
            int r2 = r15.mVideoVisibleWidth
            double r5 = (double) r2
            double r0 = r0 / r5
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r7.width = r0
            int r0 = r15.mVideoHeight
            double r0 = (double) r0
            double r0 = r0 * r8
            int r2 = r15.mVideoVisibleHeight
            double r5 = (double) r2
            double r0 = r0 / r5
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r7.height = r0
            android.view.SurfaceView r0 = r15.mVideoSurface
            r0.setLayoutParams(r7)
            android.view.SurfaceView r0 = r15.mSubtitlesSurface
            if (r0 == 0) goto L_0x016f
            r0.setLayoutParams(r7)
        L_0x016f:
            android.widget.FrameLayout r0 = r15.mVideoSurfaceFrame
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            double r1 = java.lang.Math.floor(r3)
            int r1 = (int) r1
            r0.width = r1
            double r1 = java.lang.Math.floor(r8)
            int r1 = (int) r1
            r0.height = r1
            android.widget.FrameLayout r1 = r15.mVideoSurfaceFrame
            r1.setLayoutParams(r0)
            android.view.SurfaceView r0 = r15.mVideoSurface
            r0.invalidate()
            android.view.SurfaceView r0 = r15.mSubtitlesSurface
            if (r0 == 0) goto L_0x0194
            r0.invalidate()
        L_0x0194:
            return
        L_0x0195:
            r7.width = r9
            r7.height = r9
            android.view.SurfaceView r0 = r15.mVideoSurface
            r0.setLayoutParams(r7)
            android.view.SurfaceView r0 = r15.mSubtitlesSurface
            if (r0 == 0) goto L_0x01a5
            r0.setLayoutParams(r7)
        L_0x01a5:
            android.widget.FrameLayout r0 = r15.mVideoSurfaceFrame
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.width = r9
            r0.height = r9
            android.widget.FrameLayout r1 = r15.mVideoSurfaceFrame
            r1.setLayoutParams(r0)
            int r0 = r15.mVideoWidth
            int r1 = r15.mVideoHeight
            int r0 = r0 * r1
            if (r0 != 0) goto L_0x01bf
            r15.changeMediaPlayerLayout(r5, r6)
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.VideoHelper.updateVideoSurfaces():void");
    }

    public void onNewVideoLayout(IVLCVout iVLCVout, int i, int i2, int i3, int i4, int i5, int i6) {
        this.mVideoWidth = i;
        this.mVideoHeight = i2;
        this.mVideoVisibleWidth = i3;
        this.mVideoVisibleHeight = i4;
        this.mVideoSarNum = i5;
        this.mVideoSarDen = i6;
        updateVideoSurfaces();
    }

    /* access modifiers changed from: package-private */
    public void setVideoScale(MediaPlayer.ScaleType scaleType) {
        this.mCurrentScaleType = scaleType;
        updateVideoSurfaces();
    }

    /* access modifiers changed from: package-private */
    public MediaPlayer.ScaleType getVideoScale() {
        return this.mCurrentScaleType;
    }
}
