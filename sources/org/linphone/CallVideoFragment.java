package org.linphone;

import android.app.Fragment;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import org.linphone.compatibility.Compatibility;
import org.linphone.compatibility.CompatibilityScaleGestureDetector;
import org.linphone.compatibility.CompatibilityScaleGestureListener;
import org.linphone.core.LinphoneCall;
import org.linphone.core.LinphoneCore;
import org.linphone.core.VideoSize;
import org.linphone.mediastream.video.AndroidVideoWindowImpl;
import org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint;

public class CallVideoFragment extends Fragment implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, CompatibilityScaleGestureListener {
    private AndroidVideoWindowImpl androidVideoWindowImpl;
    private CallIncomingActivity inCallActivity;
    /* access modifiers changed from: private */
    public SurfaceView mCaptureView;
    /* access modifiers changed from: private */
    public GestureDetector mGestureDetector;
    /* access modifiers changed from: private */
    public CompatibilityScaleGestureDetector mScaleDetector;
    /* access modifiers changed from: private */
    public SurfaceView mVideoView;
    private float mZoomCenterX;
    private float mZoomCenterY;
    private float mZoomFactor = 1.0f;
    /* access modifiers changed from: private */

    /* renamed from: pb */
    public ProgressBar f6316pb;
    /* access modifiers changed from: private */
    public int previewX;
    /* access modifiers changed from: private */
    public int previewY;

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        if (LinphoneManager.getLc().hasCrappyOpenGL()) {
            view = layoutInflater.inflate(C5321R.layout.video_no_opengl, viewGroup, false);
        } else {
            view = layoutInflater.inflate(C5321R.layout.video, viewGroup, false);
        }
        this.mVideoView = (SurfaceView) view.findViewById(C5321R.C5324id.videoSurface);
        this.mCaptureView = (SurfaceView) view.findViewById(C5321R.C5324id.videoCaptureSurface);
        this.mCaptureView.setVisibility(4);
        this.f6316pb = (ProgressBar) view.findViewById(C5321R.C5324id.f6324pb);
        this.mCaptureView.getHolder().setType(3);
        fixZOrder(this.mVideoView, this.mCaptureView);
        this.androidVideoWindowImpl = new AndroidVideoWindowImpl(this.mVideoView, this.mCaptureView, new AndroidVideoWindowImpl.VideoWindowListener() {
            public void onVideoRenderingSurfaceReady(AndroidVideoWindowImpl androidVideoWindowImpl, SurfaceView surfaceView) {
                CallVideoFragment.this.f6316pb.setVisibility(4);
                SurfaceView unused = CallVideoFragment.this.mVideoView = surfaceView;
                LinphoneManager.getLc().setVideoWindow(androidVideoWindowImpl);
            }

            public void onVideoRenderingSurfaceDestroyed(AndroidVideoWindowImpl androidVideoWindowImpl) {
                Log.d("TAG", "XXX VIDEO onVideoRenderingSurfaceDestroyed");
            }

            public void onVideoPreviewSurfaceReady(AndroidVideoWindowImpl androidVideoWindowImpl, SurfaceView surfaceView) {
                SurfaceView unused = CallVideoFragment.this.mCaptureView = surfaceView;
                CallVideoFragment.this.resizePreview();
            }

            public void onVideoPreviewSurfaceDestroyed(AndroidVideoWindowImpl androidVideoWindowImpl) {
                Log.d("TAG", "XXX VIDEO onVideoRenderingSurfaceDestroyed");
            }
        });
        this.mVideoView.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (CallVideoFragment.this.mScaleDetector != null) {
                    CallVideoFragment.this.mScaleDetector.onTouchEvent(motionEvent);
                }
                CallVideoFragment.this.mGestureDetector.onTouchEvent(motionEvent);
                return true;
            }
        });
        this.mCaptureView.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    int unused = CallVideoFragment.this.previewX = (int) motionEvent.getX();
                    int unused2 = CallVideoFragment.this.previewY = (int) motionEvent.getY();
                    return true;
                } else if (action != 2) {
                    return true;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) CallVideoFragment.this.mCaptureView.getLayoutParams();
                    layoutParams.addRule(12, 0);
                    layoutParams.addRule(11, 0);
                    layoutParams.leftMargin += ((int) motionEvent.getX()) - CallVideoFragment.this.previewX;
                    layoutParams.topMargin += ((int) motionEvent.getY()) - CallVideoFragment.this.previewY;
                    view.setLayoutParams(layoutParams);
                    return true;
                }
            }
        });
        return view;
    }

    public void onStart() {
        super.onStart();
        this.inCallActivity = (CallIncomingActivity) getActivity();
        CallIncomingActivity callIncomingActivity = this.inCallActivity;
        if (callIncomingActivity != null) {
            callIncomingActivity.bindVideoFragment(this);
        }
    }

    /* access modifiers changed from: private */
    public void resizePreview() {
        LinphoneCore lc = LinphoneManager.getLc();
        if (lc.getCallsNb() > 0) {
            LinphoneCall currentCall = lc.getCurrentCall();
            if (currentCall == null) {
                currentCall = lc.getCalls()[0];
            }
            if (currentCall != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int i = displayMetrics.heightPixels / 4;
                VideoSize sentVideoSize = currentCall.getCurrentParams().getSentVideoSize();
                int i2 = sentVideoSize.width;
                int i3 = sentVideoSize.height;
                org.linphone.mediastream.Log.m6901d("Video height is " + i3 + ", width is " + i2);
                int i4 = 150;
                if (i3 == 0 || i2 == 0) {
                    i = 150;
                } else {
                    i4 = (i2 * i) / i3;
                }
                this.mCaptureView.getHolder().setFixedSize(i4, i);
                org.linphone.mediastream.Log.m6901d("Video preview size set to " + i4 + MapPoint.JsonFields.f6911x + i);
            }
        }
    }

    private void fixZOrder(SurfaceView surfaceView, SurfaceView surfaceView2) {
        surfaceView.setZOrderOnTop(false);
        surfaceView2.setZOrderOnTop(true);
        surfaceView2.setZOrderMediaOverlay(true);
    }

    public void switchCamera() {
        try {
            LinphoneManager.getLc().setVideoDevice((LinphoneManager.getLc().getVideoDevice() + 1) % AndroidCameraConfiguration.retrieveCameras().length);
            CallManager.getInstance().updateCall();
            if (this.mCaptureView != null) {
                LinphoneManager.getLc().setPreviewWindow(this.mCaptureView);
            }
        } catch (ArithmeticException unused) {
            org.linphone.mediastream.Log.m6903e("Cannot swtich camera : no camera");
        }
    }

    public void onResume() {
        super.onResume();
        if (LinphonePreferences.instance().isOverlayEnabled()) {
            LinphoneService.instance().destroyOverlay();
        }
        AndroidVideoWindowImpl androidVideoWindowImpl2 = this.androidVideoWindowImpl;
        if (androidVideoWindowImpl2 != null) {
            synchronized (androidVideoWindowImpl2) {
                LinphoneManager.getLc().setVideoWindow(this.androidVideoWindowImpl);
            }
        }
        this.mGestureDetector = new GestureDetector(this.inCallActivity, this);
        this.mScaleDetector = Compatibility.getScaleGestureDetector(this.inCallActivity, this);
        resizePreview();
    }

    public void onPause() {
        AndroidVideoWindowImpl androidVideoWindowImpl2 = this.androidVideoWindowImpl;
        if (androidVideoWindowImpl2 != null) {
            synchronized (androidVideoWindowImpl2) {
                if (LinphoneManager.getLcIfManagerNotDestroyedOrNull() != null) {
                    LinphoneManager.getLc().setVideoWindow((Object) null);
                }
            }
        }
        super.onPause();
    }

    public boolean onScale(CompatibilityScaleGestureDetector compatibilityScaleGestureDetector) {
        this.mZoomFactor *= compatibilityScaleGestureDetector.getScaleFactor();
        this.mZoomFactor = Math.max(0.1f, Math.min(this.mZoomFactor, Math.max(((float) this.mVideoView.getHeight()) / ((float) ((this.mVideoView.getWidth() * 3) / 4)), ((float) this.mVideoView.getWidth()) / ((float) ((this.mVideoView.getHeight() * 3) / 4)))));
        LinphoneCall currentCall = LinphoneManager.getLc().getCurrentCall();
        if (currentCall == null) {
            return false;
        }
        currentCall.zoomVideo(this.mZoomFactor, this.mZoomCenterX, this.mZoomCenterY);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onScroll(android.view.MotionEvent r5, android.view.MotionEvent r6, float r7, float r8) {
        /*
            r4 = this;
            org.linphone.core.LinphoneCore r5 = org.linphone.LinphoneManager.getLc()
            org.linphone.core.LinphoneCall r5 = r5.getCurrentCall()
            boolean r5 = org.linphone.LinphoneUtils.isCallEstablished(r5)
            if (r5 == 0) goto L_0x008d
            float r5 = r4.mZoomFactor
            r6 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x008d
            r0 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            r5 = 0
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x002c
            float r2 = r4.mZoomCenterX
            int r3 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x002c
            double r2 = (double) r2
            double r2 = r2 + r0
            float r7 = (float) r2
            r4.mZoomCenterX = r7
            goto L_0x003b
        L_0x002c:
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x003b
            float r7 = r4.mZoomCenterX
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x003b
            double r2 = (double) r7
            double r2 = r2 - r0
            float r7 = (float) r2
            r4.mZoomCenterX = r7
        L_0x003b:
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x004b
            float r7 = r4.mZoomCenterY
            int r2 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x004b
            double r7 = (double) r7
            double r7 = r7 + r0
            float r7 = (float) r7
            r4.mZoomCenterY = r7
            goto L_0x005a
        L_0x004b:
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x005a
            float r7 = r4.mZoomCenterY
            int r8 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x005a
            double r7 = (double) r7
            double r7 = r7 - r0
            float r7 = (float) r7
            r4.mZoomCenterY = r7
        L_0x005a:
            float r7 = r4.mZoomCenterX
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x0062
            r4.mZoomCenterX = r6
        L_0x0062:
            float r7 = r4.mZoomCenterX
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x006a
            r4.mZoomCenterX = r5
        L_0x006a:
            float r7 = r4.mZoomCenterY
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x0072
            r4.mZoomCenterY = r6
        L_0x0072:
            float r6 = r4.mZoomCenterY
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x007a
            r4.mZoomCenterY = r5
        L_0x007a:
            org.linphone.core.LinphoneCore r5 = org.linphone.LinphoneManager.getLc()
            org.linphone.core.LinphoneCall r5 = r5.getCurrentCall()
            float r6 = r4.mZoomFactor
            float r7 = r4.mZoomCenterX
            float r8 = r4.mZoomCenterY
            r5.zoomVideo(r6, r7, r8)
            r5 = 1
            return r5
        L_0x008d:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.CallVideoFragment.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (!LinphoneUtils.isCallEstablished(LinphoneManager.getLc().getCurrentCall())) {
            return false;
        }
        if (this.mZoomFactor == 1.0f) {
            this.mZoomFactor = Math.max(((float) this.mVideoView.getHeight()) / ((float) ((this.mVideoView.getWidth() * 3) / 4)), ((float) this.mVideoView.getWidth()) / ((float) ((this.mVideoView.getHeight() * 3) / 4)));
            return true;
        }
        resetZoom();
        return true;
    }

    private void resetZoom() {
        this.mZoomFactor = 1.0f;
        this.mZoomCenterY = 0.5f;
        this.mZoomCenterX = 0.5f;
    }

    public void onDestroy() {
        this.inCallActivity = null;
        this.mCaptureView = null;
        SurfaceView surfaceView = this.mVideoView;
        if (surfaceView != null) {
            surfaceView.setOnTouchListener((View.OnTouchListener) null);
            this.mVideoView = null;
        }
        AndroidVideoWindowImpl androidVideoWindowImpl2 = this.androidVideoWindowImpl;
        if (androidVideoWindowImpl2 != null) {
            androidVideoWindowImpl2.release();
            this.androidVideoWindowImpl = null;
        }
        GestureDetector gestureDetector = this.mGestureDetector;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener((GestureDetector.OnDoubleTapListener) null);
            this.mGestureDetector = null;
        }
        CompatibilityScaleGestureDetector compatibilityScaleGestureDetector = this.mScaleDetector;
        if (compatibilityScaleGestureDetector != null) {
            compatibilityScaleGestureDetector.destroy();
            this.mScaleDetector = null;
        }
        super.onDestroy();
    }
}
