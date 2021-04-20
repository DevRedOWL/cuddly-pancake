package com.stfalcon.chatkit.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

public class ShapeImageView extends AppCompatImageView {
    private Path path;

    public ShapeImageView(Context context) {
        super(context);
        setLayerType(1, (Paint) null);
    }

    public ShapeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayerType(1, (Paint) null);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.path = new Path();
        float f = (float) i;
        float f2 = f / 2.0f;
        float f3 = 0.1f * f;
        float f4 = 0.8875f * f;
        this.path.moveTo(f2, f);
        this.path.cubicTo(f3, f, 0.0f, f4, 0.0f, f2);
        this.path.cubicTo(0.0f, f3, f3, 0.0f, f2, 0.0f);
        this.path.cubicTo(f4, 0.0f, f, f3, f, f2);
        this.path.cubicTo(f, f4, f4, f, f2, f);
        this.path.close();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.path.isEmpty()) {
            super.onDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.path);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }
}
