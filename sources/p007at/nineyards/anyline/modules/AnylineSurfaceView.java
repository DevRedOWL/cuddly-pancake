package p007at.nineyards.anyline.modules;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.opencv.core.Rect;
import p007at.nineyards.anyline.camera.VisualFeedbackConfig;
import p007at.nineyards.anyline.core.Vector_Contour;
import p007at.nineyards.anyline.core.Vector_SevenSegmentContour;
import p007at.nineyards.anyline.util.ColorUtil;
import p007at.nineyards.anyline.util.DimensUtil;

/* renamed from: at.nineyards.anyline.modules.AnylineSurfaceView */
public final class AnylineSurfaceView extends SurfaceView {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f522a = AnylineSurfaceView.class.getSimpleName();

    /* renamed from: A */
    private int f523A;

    /* renamed from: B */
    private int f524B;

    /* renamed from: b */
    private Vector_Contour f525b;

    /* renamed from: c */
    private Vector_Contour f526c;

    /* renamed from: d */
    private Vector_SevenSegmentContour f527d;

    /* renamed from: e */
    private Vector_SevenSegmentContour f528e;

    /* renamed from: f */
    private List<AnimatablePointF> f529f;

    /* renamed from: g */
    private List<AnimatablePointF> f530g;

    /* renamed from: h */
    private List<AnimatablePointF> f531h;

    /* renamed from: i */
    private List<PointF> f532i;

    /* renamed from: j */
    private Rect f533j = null;

    /* renamed from: k */
    private float f534k = 1.0f;

    /* renamed from: l */
    private List<AnimatableRectF> f535l;

    /* renamed from: m */
    private CornerPathEffect f536m;

    /* renamed from: n */
    private int f537n;

    /* renamed from: o */
    private final Path f538o = new Path();

    /* renamed from: p */
    private final Paint f539p = new Paint();

    /* renamed from: q */
    private final Paint f540q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public SurfaceHolder f541r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f542s = false;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public VisualFeedbackConfig f543t;

    /* renamed from: u */
    private long f544u;

    /* renamed from: v */
    private AnimatorSet f545v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C0777a f546w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f547x = false;

    /* renamed from: y */
    private android.graphics.Rect f548y;

    /* renamed from: z */
    private float f549z;

    public AnylineSurfaceView(Context context, VisualFeedbackConfig visualFeedbackConfig) {
        super(context);
        this.f539p.setAntiAlias(true);
        this.f540q = new Paint();
        this.f540q.setStyle(Paint.Style.STROKE);
        this.f540q.setAntiAlias(true);
        this.f543t = visualFeedbackConfig;
        this.f541r = getHolder();
        if (this.f543t == null) {
            this.f543t = new VisualFeedbackConfig();
            this.f543t.setFeedbackStyle(VisualFeedbackConfig.FeedbackStyle.RECT);
        }
        if (!(this.f543t.getFeedbackStyle() == VisualFeedbackConfig.FeedbackStyle.RECT || this.f543t.getAnimationStyle() == null)) {
            this.f541r.addCallback(new SurfaceHolder.Callback() {
                public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                }

                public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                    AnylineSurfaceView anylineSurfaceView = AnylineSurfaceView.this;
                    C0777a unused = anylineSurfaceView.f546w = new C0777a(anylineSurfaceView.f543t);
                    AnylineSurfaceView.this.f546w.mo12608a(true);
                    AnylineSurfaceView.this.f546w.start();
                }

                public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    if (AnylineSurfaceView.this.f546w != null) {
                        boolean z = true;
                        AnylineSurfaceView.this.f546w.mo12608a(false);
                        while (z) {
                            try {
                                AnylineSurfaceView.this.f546w.join();
                                z = false;
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            });
        }
        this.f529f = new ArrayList();
        this.f531h = new ArrayList();
        this.f530g = new ArrayList();
    }

    /* access modifiers changed from: package-private */
    public final void setVisualFeedbackConfig(VisualFeedbackConfig visualFeedbackConfig) {
        this.f543t = visualFeedbackConfig;
        C0777a aVar = this.f546w;
        if (aVar != null) {
            aVar.mo12606a(visualFeedbackConfig);
        }
    }

    public final void setCutoutInfo(android.graphics.Rect rect, float f, int i, int i2) {
        this.f548y = rect;
        this.f549z = f;
        this.f523A = i;
        this.f524B = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12581a(Vector_Contour vector_Contour, Rect rect, float f) {
        Vector_Contour vector_Contour2;
        if (this.f543t != null && System.currentTimeMillis() - this.f544u >= ((long) this.f543t.getRedrawTimeout()) && this.f543t.getFeedbackStyle() != VisualFeedbackConfig.FeedbackStyle.RECT) {
            if (!this.f542s && (vector_Contour2 = this.f525b) != null && !vector_Contour2.isEmpty() && vector_Contour == null) {
                mo12580a();
            } else if (!this.f542s) {
                Vector_Contour vector_Contour3 = this.f525b;
                int i = 0;
                if ((vector_Contour3 != null && !vector_Contour3.isEmpty()) || vector_Contour != null) {
                    ArrayList arrayList = new ArrayList((int) vector_Contour.size());
                    while (((long) i) < vector_Contour.size()) {
                        Rect boundingRect = vector_Contour.get(i).boundingRect();
                        AnimatableRectF animatableRectF = new AnimatableRectF();
                        m146a(animatableRectF, boundingRect);
                        arrayList.add(animatableRectF);
                        i++;
                    }
                    this.f535l = arrayList;
                    C0777a aVar = this.f546w;
                    if (aVar != null) {
                        aVar.mo12607a(this.f535l);
                    }
                    i = 1;
                }
                if (i != 0) {
                    this.f525b = this.f526c;
                    this.f526c = vector_Contour;
                    this.f533j = rect;
                    this.f534k = f;
                    m155e();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12582a(Vector_SevenSegmentContour vector_SevenSegmentContour, Rect rect, float f) {
        Vector_SevenSegmentContour vector_SevenSegmentContour2;
        if (this.f543t != null && System.currentTimeMillis() - this.f544u >= ((long) this.f543t.getRedrawTimeout()) && this.f543t.getFeedbackStyle() != VisualFeedbackConfig.FeedbackStyle.RECT) {
            if (!this.f542s && (vector_SevenSegmentContour2 = this.f527d) != null && !vector_SevenSegmentContour2.isEmpty() && vector_SevenSegmentContour == null) {
                mo12580a();
            } else if (!this.f542s) {
                Vector_Contour vector_Contour = this.f525b;
                int i = 0;
                if ((vector_Contour != null && !vector_Contour.isEmpty()) || vector_SevenSegmentContour != null) {
                    ArrayList arrayList = new ArrayList((int) vector_SevenSegmentContour.size());
                    while (((long) i) < vector_SevenSegmentContour.size()) {
                        Rect boundingRect = vector_SevenSegmentContour.get(i).boundingRect();
                        AnimatableRectF animatableRectF = new AnimatableRectF();
                        m146a(animatableRectF, boundingRect);
                        arrayList.add(animatableRectF);
                        i++;
                    }
                    this.f535l = arrayList;
                    C0777a aVar = this.f546w;
                    if (aVar != null) {
                        aVar.mo12607a(this.f535l);
                    }
                    i = 1;
                }
                if (i != 0) {
                    this.f527d = this.f528e;
                    this.f528e = vector_SevenSegmentContour;
                    this.f533j = rect;
                    this.f534k = f;
                    m155e();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12584a(java.util.List<android.graphics.PointF> r8, org.opencv.core.Rect r9, float r10) {
        /*
            r7 = this;
            at.nineyards.anyline.camera.VisualFeedbackConfig r0 = r7.f543t
            if (r0 == 0) goto L_0x008e
            at.nineyards.anyline.camera.VisualFeedbackConfig$FeedbackStyle r0 = r0.getFeedbackStyle()
            at.nineyards.anyline.camera.VisualFeedbackConfig$FeedbackStyle r1 = p007at.nineyards.anyline.camera.VisualFeedbackConfig.FeedbackStyle.RECT
            if (r0 == r1) goto L_0x000e
            goto L_0x008e
        L_0x000e:
            boolean r0 = r7.f542s
            if (r0 != 0) goto L_0x0022
            java.util.List<at.nineyards.anyline.modules.AnylineSurfaceView$AnimatablePointF> r0 = r7.f529f
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0022
            if (r8 != 0) goto L_0x0022
            r7.mo12580a()
            return
        L_0x0022:
            boolean r0 = r7.f542s
            if (r0 != 0) goto L_0x008e
            java.util.List<android.graphics.PointF> r0 = r7.f532i
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x002e
            if (r8 == 0) goto L_0x007d
        L_0x002e:
            if (r0 == 0) goto L_0x007e
            if (r8 != 0) goto L_0x0033
            goto L_0x007e
        L_0x0033:
            int r3 = r0.size()
            int r4 = r8.size()
            if (r3 == r4) goto L_0x003e
            goto L_0x007e
        L_0x003e:
            r3 = 0
        L_0x003f:
            int r4 = r0.size()
            if (r3 >= r4) goto L_0x007d
            java.lang.Object r4 = r0.get(r3)
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            float r4 = r4.x
            java.lang.Object r5 = r8.get(r3)
            android.graphics.PointF r5 = (android.graphics.PointF) r5
            float r5 = r5.x
            float r4 = r4 - r5
            float r4 = java.lang.Math.abs(r4)
            r5 = 1092616192(0x41200000, float:10.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007e
            java.lang.Object r4 = r0.get(r3)
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            float r4 = r4.y
            java.lang.Object r6 = r8.get(r3)
            android.graphics.PointF r6 = (android.graphics.PointF) r6
            float r6 = r6.y
            float r4 = r4 - r6
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x007a
            goto L_0x007e
        L_0x007a:
            int r3 = r3 + 1
            goto L_0x003f
        L_0x007d:
            r2 = 0
        L_0x007e:
            if (r2 == 0) goto L_0x008e
            r7.f532i = r8
            r7.f533j = r9
            r7.f534k = r10
            java.util.List<at.nineyards.anyline.modules.AnylineSurfaceView$AnimatablePointF> r9 = r7.f531h
            r7.m149a((java.util.List<p007at.nineyards.anyline.modules.AnylineSurfaceView.AnimatablePointF>) r9, (java.util.List<android.graphics.PointF>) r8)
            r7.m155e()
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.modules.AnylineSurfaceView.mo12584a(java.util.List, org.opencv.core.Rect, float):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12580a() {
        if (this.f543t != null) {
            if (C07764.f559a[this.f543t.getFeedbackStyle().ordinal()] != 1) {
                setDrawContoursAnimationActive(false);
                mo12586c();
                return;
            }
            this.f531h.clear();
            m158g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12585b() {
        if (this.f543t != null) {
            if (C07764.f559a[this.f543t.getFeedbackStyle().ordinal()] != 1) {
                setDrawContoursAnimationActive(false);
                mo12586c();
            } else if (this.f542s) {
                this.f545v.cancel();
            } else {
                mo12586c();
                m156f();
            }
        }
    }

    /* renamed from: e */
    private void m155e() {
        Canvas lockCanvas;
        if (this.f543t != null) {
            int i = C07764.f559a[this.f543t.getFeedbackStyle().ordinal()];
            if (i == 1) {
                m158g();
            } else if (i == 2 || i == 3 || i == 4) {
                if (this.f543t.getFeedbackStyle() == VisualFeedbackConfig.FeedbackStyle.CONTOUR_RECT || this.f543t.getAnimationStyle() == null || this.f543t.getAnimationDuration() <= 0) {
                    if (m159h() && (lockCanvas = this.f541r.lockCanvas()) != null) {
                        if (this.f547x) {
                            lockCanvas.scale(-1.0f, 1.0f, (float) (lockCanvas.getWidth() / 2), (float) (lockCanvas.getHeight() / 2));
                        }
                        lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        for (AnimatableRectF a : this.f535l) {
                            m144a(lockCanvas, a);
                        }
                        this.f541r.unlockCanvasAndPost(lockCanvas);
                    }
                } else if (m159h()) {
                    setDrawContoursAnimationActive(true);
                }
                List<AnimatableRectF> list = this.f535l;
                if (list == null || list.size() == 0) {
                    setDrawContoursAnimationActive(false);
                }
            }
        }
    }

    /* renamed from: a */
    private void m146a(AnimatableRectF animatableRectF, Rect rect) {
        animatableRectF.left = (float) rect.f6486x;
        animatableRectF.top = (float) rect.f6487y;
        animatableRectF.right = (float) (rect.f6486x + rect.width);
        animatableRectF.bottom = (float) (rect.f6487y + rect.height);
        if (this.f533j != null) {
            animatableRectF.left += (float) this.f533j.f6486x;
            animatableRectF.top += (float) this.f533j.f6487y;
            animatableRectF.right += (float) this.f533j.f6486x;
            animatableRectF.bottom += (float) this.f533j.f6487y;
        }
        animatableRectF.left *= this.f549z * this.f534k;
        animatableRectF.top *= this.f549z * this.f534k;
        animatableRectF.right *= this.f549z * this.f534k;
        animatableRectF.bottom *= this.f549z * this.f534k;
        if (this.f548y != null) {
            animatableRectF.left += (float) (this.f548y.left + this.f523A);
            animatableRectF.top += (float) (this.f548y.top + this.f524B);
            animatableRectF.right += (float) (this.f548y.left + this.f523A);
            animatableRectF.bottom += (float) (this.f548y.top + this.f524B);
        }
        animatableRectF.setMargin(1);
    }

    /* renamed from: a */
    private void m149a(List<AnimatablePointF> list, List<PointF> list2) {
        list.clear();
        for (int i = 0; i < list2.size(); i++) {
            list.add(new AnimatablePointF(list2.get(i)));
        }
        if (this.f533j != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                list.get(i2).setX(list.get(i2).x + ((float) this.f533j.f6486x));
                list.get(i2).setY(list.get(i2).y + ((float) this.f533j.f6487y));
            }
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            list.get(i3).setX(list.get(i3).x * this.f549z * this.f534k);
            list.get(i3).setY(list.get(i3).y * this.f549z * this.f534k);
        }
        if (this.f548y != null) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).setX(list.get(i4).x + ((float) this.f548y.left) + ((float) this.f523A));
                list.get(i4).setY(list.get(i4).y + ((float) this.f548y.top) + ((float) this.f524B));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List<PointF> mo12579a(List<PointF> list) {
        m149a(this.f530g, list);
        ArrayList arrayList = new ArrayList(this.f530g.size());
        for (int i = 0; i < this.f530g.size(); i++) {
            arrayList.add(new PointF(this.f530g.get(i).x, this.f530g.get(i).y));
        }
        return arrayList;
    }

    private void setRectToCutout(AnimatableRectF animatableRectF) {
        android.graphics.Rect rect = this.f548y;
        if (rect != null) {
            animatableRectF.left = (float) rect.left;
            animatableRectF.top = (float) this.f548y.top;
            animatableRectF.right = (float) this.f548y.right;
            animatableRectF.bottom = (float) this.f548y.bottom;
        }
    }

    private void setShapeToCutout(List<AnimatablePointF> list) {
        list.clear();
        android.graphics.Rect rect = this.f548y;
        if (rect != null) {
            list.add(new AnimatablePointF((float) rect.left, (float) this.f548y.top));
            list.add(new AnimatablePointF((float) this.f548y.right, (float) this.f548y.top));
            list.add(new AnimatablePointF((float) this.f548y.right, (float) this.f548y.bottom));
            list.add(new AnimatablePointF((float) this.f548y.left, (float) this.f548y.bottom));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12586c() {
        Canvas lockCanvas = this.f541r.lockCanvas();
        if (lockCanvas != null) {
            lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f541r.unlockCanvasAndPost(lockCanvas);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m156f() {
        this.f529f.clear();
        this.f532i = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m158g() {
        /*
            r15 = this;
            at.nineyards.anyline.camera.VisualFeedbackConfig r0 = r15.f543t
            at.nineyards.anyline.camera.VisualFeedbackConfig$FeedbackStyle r0 = r0.getFeedbackStyle()
            at.nineyards.anyline.camera.VisualFeedbackConfig$FeedbackStyle r1 = p007at.nineyards.anyline.camera.VisualFeedbackConfig.FeedbackStyle.RECT
            if (r0 != r1) goto L_0x001b
            java.util.List<at.nineyards.anyline.modules.AnylineSurfaceView$AnimatablePointF> r0 = r15.f529f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001b
            java.util.List<at.nineyards.anyline.modules.AnylineSurfaceView$AnimatablePointF> r0 = r15.f531h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001b
            return
        L_0x001b:
            java.util.List<at.nineyards.anyline.modules.AnylineSurfaceView$AnimatablePointF> r0 = r15.f529f
            boolean r0 = r0.isEmpty()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0049
            java.util.List<at.nineyards.anyline.modules.AnylineSurfaceView$AnimatablePointF> r0 = r15.f529f
            r15.setShapeToCutout(r0)
            java.util.List<at.nineyards.anyline.modules.AnylineSurfaceView$AnimatablePointF> r4 = r15.f529f
            at.nineyards.anyline.camera.VisualFeedbackConfig r0 = r15.f543t
            int r5 = r0.getStrokeColor()
            at.nineyards.anyline.camera.VisualFeedbackConfig r0 = r15.f543t
            int r6 = r0.getStrokeWidthInDp()
            at.nineyards.anyline.camera.VisualFeedbackConfig r0 = r15.f543t
            int r7 = r0.getFillColor()
            at.nineyards.anyline.camera.VisualFeedbackConfig r0 = r15.f543t
            int r8 = r0.getCornerRadiusInDp()
            r3 = r15
            r3.mo12583a((java.util.List<? extends android.graphics.PointF>) r4, (int) r5, (int) r6, (int) r7, (int) r8)
            goto L_0x0060
        L_0x0049:
            java.util.List<at.nineyards.anyline.modules.AnylineSurfaceView$AnimatablePointF> r0 = r15.f529f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0060
            java.util.List<at.nineyards.anyline.modules.AnylineSurfaceView$AnimatablePointF> r0 = r15.f531h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0060
            java.util.List<at.nineyards.anyline.modules.AnylineSurfaceView$AnimatablePointF> r0 = r15.f531h
            r15.setShapeToCutout(r0)
            r0 = 1
            goto L_0x0061
        L_0x0060:
            r0 = 0
        L_0x0061:
            at.nineyards.anyline.camera.VisualFeedbackConfig r3 = r15.f543t
            int r3 = r3.getAnimationDuration()
            if (r3 > 0) goto L_0x008e
            if (r0 == 0) goto L_0x006f
            r15.mo12586c()
            return
        L_0x006f:
            java.util.List<at.nineyards.anyline.modules.AnylineSurfaceView$AnimatablePointF> r5 = r15.f531h
            at.nineyards.anyline.camera.VisualFeedbackConfig r0 = r15.f543t
            int r6 = r0.getStrokeColor()
            at.nineyards.anyline.camera.VisualFeedbackConfig r0 = r15.f543t
            int r7 = r0.getStrokeWidthInDp()
            at.nineyards.anyline.camera.VisualFeedbackConfig r0 = r15.f543t
            int r8 = r0.getFillColor()
            at.nineyards.anyline.camera.VisualFeedbackConfig r0 = r15.f543t
            int r9 = r0.getCornerRadiusInDp()
            r4 = r15
            r4.mo12583a((java.util.List<? extends android.graphics.PointF>) r5, (int) r6, (int) r7, (int) r8, (int) r9)
            return
        L_0x008e:
            boolean r3 = r15.f542s
            if (r3 != 0) goto L_0x014a
            java.util.List<at.nineyards.anyline.modules.AnylineSurfaceView$AnimatablePointF> r6 = r15.f529f
            java.util.List<at.nineyards.anyline.modules.AnylineSurfaceView$AnimatablePointF> r3 = r15.f531h
            at.nineyards.anyline.camera.VisualFeedbackConfig r4 = r15.f543t
            int r7 = r4.getStrokeColor()
            at.nineyards.anyline.camera.VisualFeedbackConfig r4 = r15.f543t
            int r8 = r4.getStrokeWidthInDp()
            at.nineyards.anyline.camera.VisualFeedbackConfig r4 = r15.f543t
            int r9 = r4.getFillColor()
            at.nineyards.anyline.camera.VisualFeedbackConfig r4 = r15.f543t
            int r10 = r4.getCornerRadiusInDp()
            java.util.ArrayList r11 = new java.util.ArrayList
            int r4 = r6.size()
            r11.<init>(r4)
            r4 = 0
        L_0x00b8:
            int r5 = r6.size()
            if (r4 >= r5) goto L_0x0108
            java.lang.Object r5 = r6.get(r4)
            r12 = 2
            float[] r13 = new float[r12]
            java.lang.Object r14 = r6.get(r4)
            at.nineyards.anyline.modules.AnylineSurfaceView$AnimatablePointF r14 = (p007at.nineyards.anyline.modules.AnylineSurfaceView.AnimatablePointF) r14
            float r14 = r14.x
            r13[r1] = r14
            java.lang.Object r14 = r3.get(r4)
            at.nineyards.anyline.modules.AnylineSurfaceView$AnimatablePointF r14 = (p007at.nineyards.anyline.modules.AnylineSurfaceView.AnimatablePointF) r14
            float r14 = r14.x
            r13[r2] = r14
            java.lang.String r14 = "X"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r14, r13)
            r11.add(r5)
            java.lang.Object r5 = r6.get(r4)
            float[] r12 = new float[r12]
            java.lang.Object r13 = r6.get(r4)
            at.nineyards.anyline.modules.AnylineSurfaceView$AnimatablePointF r13 = (p007at.nineyards.anyline.modules.AnylineSurfaceView.AnimatablePointF) r13
            float r13 = r13.y
            r12[r1] = r13
            java.lang.Object r13 = r3.get(r4)
            at.nineyards.anyline.modules.AnylineSurfaceView$AnimatablePointF r13 = (p007at.nineyards.anyline.modules.AnylineSurfaceView.AnimatablePointF) r13
            float r13 = r13.y
            r12[r2] = r13
            java.lang.String r13 = "Y"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r13, r12)
            r11.add(r5)
            int r4 = r4 + 1
            goto L_0x00b8
        L_0x0108:
            int r1 = r11.size()
            if (r1 <= 0) goto L_0x0123
            int r1 = r11.size()
            int r1 = r1 - r2
            java.lang.Object r1 = r11.get(r1)
            android.animation.ObjectAnimator r1 = (android.animation.ObjectAnimator) r1
            at.nineyards.anyline.modules.AnylineSurfaceView$2 r3 = new at.nineyards.anyline.modules.AnylineSurfaceView$2
            r4 = r3
            r5 = r15
            r4.<init>(r6, r7, r8, r9, r10)
            r1.addUpdateListener(r3)
        L_0x0123:
            r15.f542s = r2
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            r15.f545v = r1
            android.animation.AnimatorSet r1 = r15.f545v
            r1.playTogether(r11)
            android.animation.AnimatorSet r1 = r15.f545v
            at.nineyards.anyline.modules.AnylineSurfaceView$3 r2 = new at.nineyards.anyline.modules.AnylineSurfaceView$3
            r2.<init>(r0)
            r1.addListener(r2)
            android.animation.AnimatorSet r0 = r15.f545v
            at.nineyards.anyline.camera.VisualFeedbackConfig r1 = r15.f543t
            int r1 = r1.getAnimationDuration()
            long r1 = (long) r1
            r0.setDuration(r1)
            r0.start()
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.modules.AnylineSurfaceView.m158g():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12583a(List<? extends PointF> list, int i, int i2, int i3, int i4) {
        if (list == null || list.size() < 2) {
            mo12586c();
            return;
        }
        this.f538o.reset();
        this.f538o.moveTo(((PointF) list.get(0)).x, ((PointF) list.get(0)).y);
        int size = list.size();
        for (int i5 = 1; i5 < size; i5++) {
            PointF pointF = (PointF) list.get(i5);
            this.f538o.lineTo(pointF.x, pointF.y);
        }
        this.f538o.close();
        Path path = this.f538o;
        SurfaceHolder surfaceHolder = this.f541r;
        if (surfaceHolder != null && surfaceHolder.getSurface().isValid()) {
            if (path == null) {
                mo12586c();
                return;
            }
            Canvas lockCanvas = this.f541r.lockCanvas();
            if (lockCanvas != null) {
                if (this.f547x) {
                    lockCanvas.scale(-1.0f, 1.0f, (float) (lockCanvas.getWidth() / 2), (float) (lockCanvas.getHeight() / 2));
                }
                lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                if (this.f536m == null || this.f537n != i4) {
                    this.f537n = i4;
                    if (i4 != 0) {
                        this.f536m = new CornerPathEffect((float) DimensUtil.getPixFromDp(getContext(), i4));
                    } else {
                        this.f536m = null;
                    }
                }
                if (i3 != 0) {
                    this.f539p.setColor(i3);
                    this.f539p.setPathEffect(this.f536m);
                    lockCanvas.drawPath(path, this.f539p);
                }
                if (i != 0) {
                    this.f540q.setColor(i);
                    this.f540q.setStrokeWidth((float) DimensUtil.getPixFromDp(getContext(), i2));
                    this.f540q.setPathEffect(this.f536m);
                    lockCanvas.drawPath(path, this.f540q);
                }
                this.f541r.unlockCanvasAndPost(lockCanvas);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m144a(Canvas canvas, AnimatableRectF animatableRectF) {
        m145a(canvas, animatableRectF, this.f543t.getStrokeWidthInPix(getContext()), this.f543t.getStrokeColor());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m145a(android.graphics.Canvas r10, p007at.nineyards.anyline.modules.AnylineSurfaceView.AnimatableRectF r11, int r12, int r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0080 }
            r9.f544u = r0     // Catch:{ all -> 0x0080 }
            int[] r0 = p007at.nineyards.anyline.modules.AnylineSurfaceView.C07764.f559a     // Catch:{ all -> 0x0080 }
            at.nineyards.anyline.camera.VisualFeedbackConfig r1 = r9.f543t     // Catch:{ all -> 0x0080 }
            at.nineyards.anyline.camera.VisualFeedbackConfig$FeedbackStyle r1 = r1.getFeedbackStyle()     // Catch:{ all -> 0x0080 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0080 }
            r0 = r0[r1]     // Catch:{ all -> 0x0080 }
            r1 = 2
            if (r0 == r1) goto L_0x0062
            r1 = 3
            r2 = 1084227584(0x40a00000, float:5.0)
            if (r0 == r1) goto L_0x0043
            r1 = 4
            if (r0 == r1) goto L_0x0021
            goto L_0x007e
        L_0x0021:
            android.graphics.Paint r0 = r9.f539p     // Catch:{ all -> 0x0080 }
            r0.setColor(r13)     // Catch:{ all -> 0x0080 }
            float r4 = r11.left     // Catch:{ all -> 0x0080 }
            float r13 = r11.bottom     // Catch:{ all -> 0x0080 }
            float r13 = r13 + r2
            int r0 = r12 / 2
            float r0 = (float) r0     // Catch:{ all -> 0x0080 }
            float r5 = r13 + r0
            float r6 = r11.right     // Catch:{ all -> 0x0080 }
            float r11 = r11.bottom     // Catch:{ all -> 0x0080 }
            float r11 = r11 + r2
            float r12 = (float) r12     // Catch:{ all -> 0x0080 }
            r13 = 1069547520(0x3fc00000, float:1.5)
            float r12 = r12 * r13
            float r7 = r11 + r12
            android.graphics.Paint r8 = r9.f539p     // Catch:{ all -> 0x0080 }
            r3 = r10
            r3.drawRect(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0080 }
            goto L_0x007e
        L_0x0043:
            android.graphics.Paint r0 = r9.f539p     // Catch:{ all -> 0x0080 }
            r0.setColor(r13)     // Catch:{ all -> 0x0080 }
            float r13 = r11.left     // Catch:{ all -> 0x0080 }
            float r0 = r11.right     // Catch:{ all -> 0x0080 }
            float r1 = r11.left     // Catch:{ all -> 0x0080 }
            float r0 = r0 - r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r13 = r13 + r0
            float r11 = r11.bottom     // Catch:{ all -> 0x0080 }
            float r11 = r11 + r2
            int r0 = r12 / 2
            float r0 = (float) r0     // Catch:{ all -> 0x0080 }
            float r11 = r11 + r0
            float r12 = (float) r12     // Catch:{ all -> 0x0080 }
            android.graphics.Paint r0 = r9.f539p     // Catch:{ all -> 0x0080 }
            r10.drawCircle(r13, r11, r12, r0)     // Catch:{ all -> 0x0080 }
            monitor-exit(r9)
            return
        L_0x0062:
            at.nineyards.anyline.camera.VisualFeedbackConfig r12 = r9.f543t     // Catch:{ all -> 0x0080 }
            int r12 = r12.getFillColor()     // Catch:{ all -> 0x0080 }
            if (r12 == 0) goto L_0x006f
            android.graphics.Paint r12 = r9.f539p     // Catch:{ all -> 0x0080 }
            r10.drawRect(r11, r12)     // Catch:{ all -> 0x0080 }
        L_0x006f:
            at.nineyards.anyline.camera.VisualFeedbackConfig r12 = r9.f543t     // Catch:{ all -> 0x0080 }
            int r12 = r12.getStrokeColor()     // Catch:{ all -> 0x0080 }
            if (r12 == 0) goto L_0x007e
            android.graphics.Paint r12 = r9.f540q     // Catch:{ all -> 0x0080 }
            r10.drawRect(r11, r12)     // Catch:{ all -> 0x0080 }
            monitor-exit(r9)
            return
        L_0x007e:
            monitor-exit(r9)
            return
        L_0x0080:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.modules.AnylineSurfaceView.m145a(android.graphics.Canvas, at.nineyards.anyline.modules.AnylineSurfaceView$AnimatableRectF, int, int):void");
    }

    /* renamed from: h */
    private boolean m159h() {
        List<AnimatableRectF> list = this.f535l;
        if (list == null || list.isEmpty()) {
            mo12586c();
            return false;
        }
        SurfaceHolder surfaceHolder = this.f541r;
        if (surfaceHolder == null || !surfaceHolder.getSurface().isValid()) {
            return false;
        }
        if ((this.f543t.getStrokeColor() == 0 && this.f543t.getFillColor() == 0) || ((this.f543t.getStrokeWidthInDp() <= 0 && this.f543t.getFillColor() == 0) || this.f543t.getStrokeColor() == 0)) {
            return false;
        }
        this.f539p.setColor(this.f543t.getFillColor());
        this.f540q.setColor(this.f543t.getStrokeColor());
        this.f540q.setStrokeWidth((float) this.f543t.getStrokeWidthInPix(getContext()));
        return true;
    }

    private void setDrawContoursAnimationActive(boolean z) {
        C0777a aVar = this.f546w;
        if (aVar != null) {
            aVar.mo12609b(z);
        }
    }

    public final void setIsFlipped(boolean z) {
        this.f547x = z;
    }

    public final boolean isFlipped() {
        return this.f547x;
    }

    /* renamed from: at.nineyards.anyline.modules.AnylineSurfaceView$a */
    private class C0777a extends Thread {

        /* renamed from: b */
        private volatile boolean f562b;

        /* renamed from: c */
        private volatile boolean f563c;

        /* renamed from: d */
        private int f564d = 10;

        /* renamed from: e */
        private int f565e;

        /* renamed from: f */
        private List<AnimatableRectF> f566f;

        /* renamed from: g */
        private VisualFeedbackConfig f567g;

        /* renamed from: h */
        private int f568h;

        C0777a(VisualFeedbackConfig visualFeedbackConfig) {
            this.f567g = visualFeedbackConfig;
            this.f568h = visualFeedbackConfig.getStrokeWidthInPix(AnylineSurfaceView.this.getContext());
        }

        /* renamed from: a */
        public final void mo12608a(boolean z) {
            this.f562b = z;
            if (!z) {
                this.f563c = false;
                AnylineSurfaceView.this.mo12586c();
            }
        }

        /* renamed from: b */
        public final void mo12609b(boolean z) {
            this.f563c = z;
            if (!z) {
                AnylineSurfaceView.this.mo12586c();
            }
        }

        /* renamed from: a */
        public final synchronized void mo12607a(List<AnimatableRectF> list) {
            this.f566f = list;
        }

        /* renamed from: a */
        public final synchronized void mo12606a(VisualFeedbackConfig visualFeedbackConfig) {
            this.f567g = visualFeedbackConfig;
            this.f568h = visualFeedbackConfig.getStrokeWidthInPix(AnylineSurfaceView.this.getContext());
        }

        public final void run() {
            List<AnimatableRectF> list;
            while (this.f562b) {
                if (this.f563c && (list = this.f566f) != null && list.size() > 0) {
                    int i = 1;
                    switch (this.f567g.getAnimationStyle()) {
                        case TRAVERSE_SINGLE:
                            m171c(false);
                            break;
                        case KITT:
                            m171c(true);
                            break;
                        case TRAVERSE_MULTI:
                            float alpha = ((float) Color.alpha(this.f567g.getStrokeColor())) / 255.0f;
                            if (this.f566f.size() >= 3) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 < this.f566f.size() && this.f563c) {
                                        Canvas lockCanvas = AnylineSurfaceView.this.f541r.lockCanvas();
                                        if (lockCanvas != null) {
                                            if (AnylineSurfaceView.this.f547x) {
                                                lockCanvas.scale(-1.0f, 1.0f, (float) (lockCanvas.getWidth() / 2), (float) (lockCanvas.getHeight() / 2));
                                            }
                                            lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                                            float f = alpha;
                                            int i3 = 0;
                                            while (i3 < 3 && i3 < this.f566f.size()) {
                                                if (!this.f563c) {
                                                    lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                                                    AnylineSurfaceView.this.f541r.unlockCanvasAndPost(lockCanvas);
                                                    break;
                                                } else {
                                                    int i4 = i2 - i3;
                                                    if (i4 >= 0 && i4 < this.f566f.size()) {
                                                        AnylineSurfaceView.this.m145a(lockCanvas, this.f566f.get(i4), this.f568h, ColorUtil.adjustAlpha(this.f567g.getStrokeColor(), f));
                                                        f -= alpha / 3.0f;
                                                    }
                                                    i3++;
                                                }
                                            }
                                            AnylineSurfaceView.this.f541r.unlockCanvasAndPost(lockCanvas);
                                        }
                                        this.f565e = Math.max(1, this.f566f.size());
                                        try {
                                            sleep((long) (this.f567g.getAnimationDuration() / this.f565e));
                                            i2++;
                                        } catch (InterruptedException unused) {
                                            String unused2 = AnylineSurfaceView.f522a;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                m168a(1);
                                break;
                            }
                            break;
                        case RESIZE:
                            if (this.f566f.size() >= 3) {
                                int i5 = 0;
                                while (true) {
                                    if (i5 <= this.f566f.size() - 3 && this.f563c) {
                                        Canvas lockCanvas2 = AnylineSurfaceView.this.f541r.lockCanvas();
                                        if (lockCanvas2 != null) {
                                            if (AnylineSurfaceView.this.f547x) {
                                                lockCanvas2.scale(-1.0f, 1.0f, (float) (lockCanvas2.getWidth() / 2), (float) (lockCanvas2.getHeight() / 2));
                                            }
                                            lockCanvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                                            int i6 = 0;
                                            while (i6 < this.f566f.size()) {
                                                if (!this.f563c) {
                                                    lockCanvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                                                    AnylineSurfaceView.this.f541r.unlockCanvasAndPost(lockCanvas2);
                                                    break;
                                                } else {
                                                    if (i6 == i5 + 1) {
                                                        AnylineSurfaceView.this.m145a(lockCanvas2, this.f566f.get(i6), this.f568h * 2, this.f567g.getStrokeColor());
                                                    } else if (i6 == i5 || i6 == i5 + 2) {
                                                        AnylineSurfaceView.this.m145a(lockCanvas2, this.f566f.get(i6), Math.round(((float) this.f568h) * 1.5f), ColorUtil.adjustAlpha(this.f567g.getStrokeColor(), 0.8f));
                                                    } else {
                                                        AnylineSurfaceView.this.m145a(lockCanvas2, this.f566f.get(i6), this.f568h, ColorUtil.adjustAlpha(this.f567g.getStrokeColor(), 0.5f));
                                                    }
                                                    i6++;
                                                }
                                            }
                                            AnylineSurfaceView.this.f541r.unlockCanvasAndPost(lockCanvas2);
                                        }
                                        this.f565e = Math.max(1, this.f566f.size());
                                        try {
                                            sleep((long) (this.f567g.getAnimationDuration() / this.f565e));
                                            i5++;
                                        } catch (InterruptedException unused3) {
                                            String unused4 = AnylineSurfaceView.f522a;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                m168a(1);
                                break;
                            }
                            break;
                        case BLINK:
                            float alpha2 = ((float) Color.alpha(this.f567g.getStrokeColor())) / 255.0f;
                            if (alpha2 == 0.0f) {
                                alpha2 = 1.0f;
                            }
                            float f2 = alpha2;
                            float f3 = 0.0f;
                            while (f3 < 3.0f && this.f563c) {
                                f2 -= alpha2 / 3.0f;
                                m169a(this.f568h, ColorUtil.adjustAlpha(this.f567g.getStrokeColor(), f2));
                                try {
                                    sleep((long) (this.f567g.getAnimationDuration() / 6));
                                    f3 += 1.0f;
                                } catch (InterruptedException unused5) {
                                    String unused6 = AnylineSurfaceView.f522a;
                                    break;
                                }
                            }
                            float f4 = 3.0f;
                            while (f4 > 0.0f) {
                                f2 += alpha2 / 3.0f;
                                m169a(this.f568h, ColorUtil.adjustAlpha(this.f567g.getStrokeColor(), f2));
                                try {
                                    sleep((long) (this.f567g.getAnimationDuration() / 6));
                                    f4 -= 1.0f;
                                } catch (InterruptedException unused7) {
                                    String unused8 = AnylineSurfaceView.f522a;
                                    break;
                                }
                            }
                            break;
                        case PULSE:
                            int i7 = this.f568h;
                            int strokeColor = this.f567g.getStrokeColor();
                            while (this.f563c) {
                                m169a(i7, strokeColor);
                                try {
                                    sleep((long) (this.f567g.getAnimationDuration() / this.f564d));
                                    if (i >= this.f564d) {
                                        break;
                                    } else {
                                        i++;
                                        i7 = Math.round(((float) i7) / 1.5f);
                                        strokeColor = ColorUtil.adjustAlpha(strokeColor, 0.6f);
                                    }
                                } catch (InterruptedException unused9) {
                                    String unused10 = AnylineSurfaceView.f522a;
                                    break;
                                }
                            }
                            break;
                        case PULSE_RANDOM:
                            m168a(3);
                            break;
                    }
                } else {
                    try {
                        sleep((long) this.f567g.getAnimationDuration());
                    } catch (InterruptedException unused11) {
                        String unused12 = AnylineSurfaceView.f522a;
                    }
                }
            }
        }

        /* renamed from: a */
        private void m169a(int i, int i2) {
            Canvas lockCanvas = AnylineSurfaceView.this.f541r.lockCanvas();
            if (lockCanvas != null) {
                if (AnylineSurfaceView.this.f547x) {
                    lockCanvas.scale(-1.0f, 1.0f, (float) (lockCanvas.getWidth() / 2), (float) (lockCanvas.getHeight() / 2));
                }
                lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                for (AnimatableRectF next : this.f566f) {
                    if (!this.f563c) {
                        lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        AnylineSurfaceView.this.f541r.unlockCanvasAndPost(lockCanvas);
                        return;
                    }
                    AnylineSurfaceView.this.m145a(lockCanvas, next, i, i2);
                }
                AnylineSurfaceView.this.f541r.unlockCanvasAndPost(lockCanvas);
            }
        }

        /* renamed from: c */
        private void m171c(boolean z) {
            for (AnimatableRectF next : this.f566f) {
                if (!this.f563c) {
                    break;
                }
                Canvas lockCanvas = AnylineSurfaceView.this.f541r.lockCanvas();
                if (lockCanvas != null) {
                    if (AnylineSurfaceView.this.f547x) {
                        lockCanvas.scale(-1.0f, 1.0f, (float) (lockCanvas.getWidth() / 2), (float) (lockCanvas.getHeight() / 2));
                    }
                    lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    AnylineSurfaceView.this.m144a(lockCanvas, next);
                    AnylineSurfaceView.this.f541r.unlockCanvasAndPost(lockCanvas);
                }
                int size = this.f566f.size();
                if (z) {
                    size *= 2;
                }
                this.f565e = Math.max(1, size);
                try {
                    sleep((long) (this.f567g.getAnimationDuration() / this.f565e));
                } catch (InterruptedException unused) {
                    String unused2 = AnylineSurfaceView.f522a;
                    return;
                }
            }
            if (z) {
                int size2 = this.f566f.size() - 2;
                while (size2 > 0 && this.f563c) {
                    Canvas lockCanvas2 = AnylineSurfaceView.this.f541r.lockCanvas();
                    if (lockCanvas2 != null) {
                        if (AnylineSurfaceView.this.f547x) {
                            lockCanvas2.scale(-1.0f, 1.0f, (float) (lockCanvas2.getWidth() / 2), (float) (lockCanvas2.getHeight() / 2));
                        }
                        lockCanvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                        if (size2 < this.f566f.size()) {
                            AnylineSurfaceView.this.m144a(lockCanvas2, this.f566f.get(size2));
                        } else {
                            size2 = this.f566f.size() - 1;
                        }
                        AnylineSurfaceView.this.f541r.unlockCanvasAndPost(lockCanvas2);
                    }
                    this.f565e = Math.max(1, this.f566f.size() * 2);
                    try {
                        sleep((long) (this.f567g.getAnimationDuration() / this.f565e));
                        size2--;
                    } catch (InterruptedException unused3) {
                        String unused4 = AnylineSurfaceView.f522a;
                        return;
                    }
                }
            }
        }

        /* renamed from: a */
        private void m168a(int i) {
            if (i <= this.f566f.size() || (i = this.f566f.size() - 1) > 0) {
                ArrayList arrayList = new ArrayList(i);
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    int nextInt = new Random().nextInt(this.f566f.size());
                    if (i2 != nextInt) {
                        arrayList.add(this.f566f.get(nextInt));
                        i2 = nextInt;
                    }
                }
                m170a(1, Math.round(((float) this.f568h) * 1.5f), this.f567g.getStrokeColor(), arrayList);
            }
        }

        /* renamed from: a */
        private void m170a(int i, int i2, int i3, List<AnimatableRectF> list) {
            while (this.f563c) {
                m169a(i2, ColorUtil.adjustAlpha(this.f567g.getStrokeColor(), 0.5f));
                Canvas lockCanvas = AnylineSurfaceView.this.f541r.lockCanvas();
                if (lockCanvas != null) {
                    if (AnylineSurfaceView.this.f547x) {
                        lockCanvas.scale(-1.0f, 1.0f, (float) (lockCanvas.getWidth() / 2), (float) (lockCanvas.getHeight() / 2));
                    }
                    for (AnimatableRectF next : list) {
                        if (!this.f563c) {
                            lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            AnylineSurfaceView.this.f541r.unlockCanvasAndPost(lockCanvas);
                            return;
                        }
                        AnylineSurfaceView.this.m145a(lockCanvas, next, i2, i3);
                    }
                    AnylineSurfaceView.this.f541r.unlockCanvasAndPost(lockCanvas);
                }
                try {
                    sleep((long) (this.f567g.getAnimationDuration() / this.f564d));
                    if (i < this.f564d) {
                        i++;
                        i2 = Math.round(((float) i2) / 1.5f);
                        i3 = ColorUtil.adjustAlpha(i3, 0.6f);
                    } else {
                        return;
                    }
                } catch (InterruptedException unused) {
                    String unused2 = AnylineSurfaceView.f522a;
                    return;
                }
            }
        }
    }

    /* renamed from: at.nineyards.anyline.modules.AnylineSurfaceView$4 */
    static /* synthetic */ class C07764 {

        /* renamed from: a */
        static final /* synthetic */ int[] f559a = new int[VisualFeedbackConfig.FeedbackStyle.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007d */
        static {
            /*
                at.nineyards.anyline.camera.VisualFeedbackConfig$AnimationStyle[] r0 = p007at.nineyards.anyline.camera.VisualFeedbackConfig.AnimationStyle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f560b = r0
                r0 = 1
                int[] r1 = f560b     // Catch:{ NoSuchFieldError -> 0x0014 }
                at.nineyards.anyline.camera.VisualFeedbackConfig$AnimationStyle r2 = p007at.nineyards.anyline.camera.VisualFeedbackConfig.AnimationStyle.TRAVERSE_SINGLE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f560b     // Catch:{ NoSuchFieldError -> 0x001f }
                at.nineyards.anyline.camera.VisualFeedbackConfig$AnimationStyle r3 = p007at.nineyards.anyline.camera.VisualFeedbackConfig.AnimationStyle.KITT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f560b     // Catch:{ NoSuchFieldError -> 0x002a }
                at.nineyards.anyline.camera.VisualFeedbackConfig$AnimationStyle r4 = p007at.nineyards.anyline.camera.VisualFeedbackConfig.AnimationStyle.TRAVERSE_MULTI     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f560b     // Catch:{ NoSuchFieldError -> 0x0035 }
                at.nineyards.anyline.camera.VisualFeedbackConfig$AnimationStyle r5 = p007at.nineyards.anyline.camera.VisualFeedbackConfig.AnimationStyle.RESIZE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r4 = f560b     // Catch:{ NoSuchFieldError -> 0x0040 }
                at.nineyards.anyline.camera.VisualFeedbackConfig$AnimationStyle r5 = p007at.nineyards.anyline.camera.VisualFeedbackConfig.AnimationStyle.BLINK     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r4 = f560b     // Catch:{ NoSuchFieldError -> 0x004b }
                at.nineyards.anyline.camera.VisualFeedbackConfig$AnimationStyle r5 = p007at.nineyards.anyline.camera.VisualFeedbackConfig.AnimationStyle.PULSE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r6 = 6
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r4 = f560b     // Catch:{ NoSuchFieldError -> 0x0056 }
                at.nineyards.anyline.camera.VisualFeedbackConfig$AnimationStyle r5 = p007at.nineyards.anyline.camera.VisualFeedbackConfig.AnimationStyle.PULSE_RANDOM     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r6 = 7
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                at.nineyards.anyline.camera.VisualFeedbackConfig$FeedbackStyle[] r4 = p007at.nineyards.anyline.camera.VisualFeedbackConfig.FeedbackStyle.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f559a = r4
                int[] r4 = f559a     // Catch:{ NoSuchFieldError -> 0x0069 }
                at.nineyards.anyline.camera.VisualFeedbackConfig$FeedbackStyle r5 = p007at.nineyards.anyline.camera.VisualFeedbackConfig.FeedbackStyle.RECT     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = f559a     // Catch:{ NoSuchFieldError -> 0x0073 }
                at.nineyards.anyline.camera.VisualFeedbackConfig$FeedbackStyle r4 = p007at.nineyards.anyline.camera.VisualFeedbackConfig.FeedbackStyle.CONTOUR_RECT     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f559a     // Catch:{ NoSuchFieldError -> 0x007d }
                at.nineyards.anyline.camera.VisualFeedbackConfig$FeedbackStyle r1 = p007at.nineyards.anyline.camera.VisualFeedbackConfig.FeedbackStyle.CONTOUR_POINT     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r0 = f559a     // Catch:{ NoSuchFieldError -> 0x0087 }
                at.nineyards.anyline.camera.VisualFeedbackConfig$FeedbackStyle r1 = p007at.nineyards.anyline.camera.VisualFeedbackConfig.FeedbackStyle.CONTOUR_UNDERLINE     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.modules.AnylineSurfaceView.C07764.<clinit>():void");
        }
    }

    /* renamed from: at.nineyards.anyline.modules.AnylineSurfaceView$AnimatableRectF */
    private class AnimatableRectF extends RectF {
        AnimatableRectF() {
        }

        AnimatableRectF(float f, float f2, float f3, float f4) {
            super(f, f2, f3, f4);
        }

        AnimatableRectF(RectF rectF) {
            super(rectF);
        }

        AnimatableRectF(android.graphics.Rect rect) {
            super(rect);
        }

        /* access modifiers changed from: package-private */
        public void setTop(float f) {
            this.top = f;
        }

        /* access modifiers changed from: package-private */
        public void setBottom(float f) {
            this.bottom = f;
        }

        /* access modifiers changed from: package-private */
        public void setRight(float f) {
            this.right = f;
        }

        /* access modifiers changed from: package-private */
        public void setLeft(float f) {
            this.left = f;
        }

        /* access modifiers changed from: package-private */
        public void setMargin(int i) {
            float f = (float) i;
            this.left -= f;
            this.top -= f;
            this.right += f;
            this.bottom += f;
        }
    }

    /* renamed from: at.nineyards.anyline.modules.AnylineSurfaceView$AnimatablePointF */
    private class AnimatablePointF extends PointF {
        AnimatablePointF() {
        }

        AnimatablePointF(float f, float f2) {
            super(f, f2);
        }

        AnimatablePointF(Point point) {
            super(point);
        }

        AnimatablePointF(PointF pointF) {
            this.x = pointF.x;
            this.y = pointF.y;
        }

        /* access modifiers changed from: package-private */
        public void setX(float f) {
            this.x = f;
        }

        /* access modifiers changed from: package-private */
        public void setY(float f) {
            this.y = f;
        }
    }
}
