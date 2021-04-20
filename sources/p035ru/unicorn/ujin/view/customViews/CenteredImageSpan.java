package p035ru.unicorn.ujin.view.customViews;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;
import java.lang.ref.WeakReference;

/* renamed from: ru.unicorn.ujin.view.customViews.CenteredImageSpan */
public class CenteredImageSpan extends DynamicDrawableSpan {
    private WeakReference<Drawable> mDrawableRef;

    public CenteredImageSpan(Drawable drawable) {
        this.mDrawableRef = new WeakReference<>(drawable);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Drawable cachedDrawable = getCachedDrawable();
        if (cachedDrawable == null) {
            return 0;
        }
        Rect bounds = cachedDrawable.getBounds();
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = -bounds.bottom;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return bounds.right;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable cachedDrawable = getCachedDrawable();
        canvas.save();
        if (cachedDrawable != null) {
            int i6 = i5 - (cachedDrawable.getBounds().bottom / 2);
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            canvas.translate(f, (float) (i6 - (fontMetricsInt.descent - (fontMetricsInt.ascent / 2))));
            cachedDrawable.draw(canvas);
            canvas.restore();
        }
    }

    public Drawable getDrawable() {
        return (Drawable) this.mDrawableRef.get();
    }

    private Drawable getCachedDrawable() {
        WeakReference<Drawable> weakReference = this.mDrawableRef;
        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = getDrawable();
        this.mDrawableRef = new WeakReference<>(drawable2);
        return drawable2;
    }
}
