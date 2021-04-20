package org.linphone.p054ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import org.linphone.LinphoneActivity;
import org.linphone.LinphoneManager;
import org.linphone.LinphoneService;
import org.linphone.core.LinphoneCallParams;
import org.linphone.mediastream.video.AndroidVideoWindowImpl;
import org.linphone.mediastream.video.display.GL2JNIView;
import p035ru.unicorn.ujin.view.activity.BaseActivity;

/* renamed from: org.linphone.ui.LinphoneOverlay */
public class LinphoneOverlay extends GL2JNIView {
    private AndroidVideoWindowImpl androidVideoWindowImpl;
    /* access modifiers changed from: private */
    public boolean dragEnabled;
    private DisplayMetrics metrics;
    private WindowManager.LayoutParams params;
    private float touchX;
    private float touchY;

    /* renamed from: wm */
    private WindowManager f6363wm;

    /* renamed from: x */
    private float f6364x;

    /* renamed from: y */
    private float f6365y;

    public LinphoneOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f6363wm = (WindowManager) context.getSystemService("window");
        this.params = new WindowManager.LayoutParams(-2, -2, BaseActivity.LOGIN_RES, 8, -3);
        this.params.gravity = 51;
        this.metrics = new DisplayMetrics();
        this.f6363wm.getDefaultDisplay().getMetrics(this.metrics);
        this.androidVideoWindowImpl = new AndroidVideoWindowImpl(this, (SurfaceView) null, new AndroidVideoWindowImpl.VideoWindowListener() {
            public void onVideoPreviewSurfaceDestroyed(AndroidVideoWindowImpl androidVideoWindowImpl) {
            }

            public void onVideoPreviewSurfaceReady(AndroidVideoWindowImpl androidVideoWindowImpl, SurfaceView surfaceView) {
            }

            public void onVideoRenderingSurfaceDestroyed(AndroidVideoWindowImpl androidVideoWindowImpl) {
            }

            public void onVideoRenderingSurfaceReady(AndroidVideoWindowImpl androidVideoWindowImpl, SurfaceView surfaceView) {
                LinphoneManager.getLc().setVideoWindow(androidVideoWindowImpl);
            }
        });
        LinphoneCallParams currentParams = LinphoneManager.getLc().getCurrentCall().getCurrentParams();
        this.params.width = currentParams.getReceivedVideoSize().width;
        this.params.height = currentParams.getReceivedVideoSize().height;
        LinphoneManager.getLc().setVideoWindow(this.androidVideoWindowImpl);
        setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                LinphoneService instance = LinphoneService.instance();
                instance.startActivity(new Intent(instance, LinphoneActivity.class).addFlags(268435456));
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View view) {
                boolean unused = LinphoneOverlay.this.dragEnabled = true;
                return true;
            }
        });
    }

    public LinphoneOverlay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinphoneOverlay(Context context) {
        this(context, (AttributeSet) null);
    }

    public void destroy() {
        this.androidVideoWindowImpl.release();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r0 != 3) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r3) {
        /*
            r2 = this;
            float r0 = r3.getRawX()
            r2.f6364x = r0
            float r0 = r3.getRawY()
            r2.f6365y = r0
            int r0 = r3.getAction()
            if (r0 == 0) goto L_0x002d
            r1 = 1
            if (r0 == r1) goto L_0x0024
            r1 = 2
            if (r0 == r1) goto L_0x001c
            r1 = 3
            if (r0 == r1) goto L_0x0024
            goto L_0x0039
        L_0x001c:
            boolean r0 = r2.dragEnabled
            if (r0 == 0) goto L_0x0039
            r2.updateViewPostion()
            goto L_0x0039
        L_0x0024:
            r0 = 0
            r2.touchY = r0
            r2.touchX = r0
            r0 = 0
            r2.dragEnabled = r0
            goto L_0x0039
        L_0x002d:
            float r0 = r3.getX()
            r2.touchX = r0
            float r0 = r3.getY()
            r2.touchY = r0
        L_0x0039:
            boolean r3 = super.onTouchEvent(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.p054ui.LinphoneOverlay.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void updateViewPostion() {
        this.params.x = Math.min(Math.max(0, (int) (this.f6364x - this.touchX)), this.metrics.widthPixels - getMeasuredWidth());
        this.params.y = Math.min(Math.max(0, (int) (this.f6365y - this.touchY)), this.metrics.heightPixels - getMeasuredHeight());
        this.f6363wm.updateViewLayout(this, this.params);
    }

    public WindowManager.LayoutParams getWindowManagerLayoutParams() {
        return this.params;
    }
}
