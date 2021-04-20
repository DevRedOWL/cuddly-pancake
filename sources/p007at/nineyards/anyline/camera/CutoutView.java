package p007at.nineyards.anyline.camera;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import p007at.nineyards.anyline.util.DimensUtil;

/* renamed from: at.nineyards.anyline.camera.CutoutView */
public class CutoutView extends View {

    /* renamed from: a */
    private Paint f365a;

    /* renamed from: b */
    private RectF f366b;

    /* renamed from: c */
    private Paint f367c;

    /* renamed from: d */
    private int f368d;

    /* renamed from: e */
    private Drawable f369e;

    /* renamed from: f */
    private RoundRectShape f370f;

    public CutoutView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CutoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CutoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setBackgroundColor(0);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        RectF rectF;
        RoundRectShape roundRectShape;
        super.onDraw(canvas);
        Paint paint = this.f365a;
        if (!(paint == null || (roundRectShape = this.f370f) == null)) {
            roundRectShape.draw(canvas, paint);
        }
        if (this.f369e != null || (rectF = this.f366b) == null) {
            Drawable drawable = this.f369e;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        int i = this.f368d;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f367c);
    }

    public void setRect(RectF rectF, int i, int i2, int i3) {
        this.f366b = rectF;
        this.f369e = null;
        if (this.f367c == null) {
            this.f367c = new Paint();
        }
        this.f367c.setColor(i);
        this.f367c.setStyle(Paint.Style.STROKE);
        this.f367c.setStrokeWidth((float) DimensUtil.getPixFromDp(getContext(), i2));
        this.f367c.setAntiAlias(true);
        this.f368d = DimensUtil.getPixFromDp(getContext(), i3);
        int width = getWidth();
        int height = getHeight();
        int i4 = this.f368d;
        float f = (float) width;
        float f2 = (float) height;
        this.f370f = new RoundRectShape(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, new RectF(Math.max(rectF.left, 1.0f), Math.max(rectF.top, 1.0f), Math.max(f - rectF.right, 1.0f), Math.max(f2 - rectF.bottom, 1.0f)), new float[]{(float) i4, (float) i4, (float) i4, (float) i4, (float) i4, (float) i4, (float) i4, (float) i4});
        this.f370f.resize(f, f2);
    }

    public void setDrawable(int i, RectF rectF) {
        setDrawable(getContext().getResources().getDrawable(i), rectF);
    }

    public void setDrawable(Drawable drawable, RectF rectF) {
        this.f369e = drawable;
        this.f366b = null;
        this.f369e.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        int width = getWidth();
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        float f = (float) width;
        float height = (float) getHeight();
        this.f370f = new RoundRectShape(fArr, new RectF(Math.max(rectF.left, 1.0f), Math.max(rectF.top, 1.0f), Math.max(f - rectF.right, 1.0f), Math.max(height - rectF.bottom, 1.0f)), fArr);
        this.f370f.resize(f, height);
    }

    public void setBackgroundColor(int i) {
        if (i == 0) {
            this.f365a = null;
            return;
        }
        if (this.f365a == null) {
            this.f365a = new Paint();
        }
        this.f365a.setColor(i);
        this.f365a.setStyle(Paint.Style.FILL);
        this.f365a.setAntiAlias(true);
    }
}
