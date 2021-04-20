package p035ru.unicorn.ujin.view.activity.navigation.helper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.helper.SwitchTrackTextDrawable */
public class SwitchTrackTextDrawable extends Drawable {
    private final Context mContext;
    private final String mLeftText;
    private final String mRightText;
    private final Paint mTextPaint = createTextPaint();

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public SwitchTrackTextDrawable(Context context, int i, int i2) {
        this.mContext = context;
        this.mLeftText = context.getString(i);
        this.mRightText = context.getString(i2);
    }

    private Paint createTextPaint() {
        Paint paint = new Paint();
        paint.setColor(this.mContext.getResources().getColor(17170443));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextAlign(Paint.Align.CENTER);
        return paint;
    }

    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        Paint paint = this.mTextPaint;
        String str = this.mRightText;
        paint.getTextBounds(str, 0, str.length(), rect);
        int height = (canvas.getClipBounds().height() / 2) + (rect.height() / 2);
        int width = canvas.getClipBounds().width() / 4;
        String str2 = this.mLeftText;
        float f = (float) height;
        canvas.drawText(str2, 0, str2.length(), (float) width, f, this.mTextPaint);
        String str3 = this.mRightText;
        canvas.drawText(str3, 0, str3.length(), (float) (width * 3), f, this.mTextPaint);
    }
}
