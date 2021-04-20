package p035ru.unicorn.ujin.view.customViews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.ujin.view.customViews.PieChartView */
public class PieChartView extends View {
    private static final float START_ANGLE = -90.0f;
    private float percent = 0.0f;
    private Paint piePaint;
    private Paint piePaintGray;

    public PieChartView(Context context) {
        super(context);
        init();
    }

    private void init() {
        this.piePaint = new Paint();
        this.piePaint.setAntiAlias(true);
        this.piePaint.setDither(true);
        this.piePaint.setStyle(Paint.Style.FILL);
        this.piePaint.setColor(getContext().getResources().getColor(R.color.colorAccent));
        this.piePaintGray = new Paint();
        this.piePaintGray.setAntiAlias(true);
        this.piePaintGray.setDither(true);
        this.piePaintGray.setStyle(Paint.Style.FILL);
        this.piePaintGray.setColor(getContext().getResources().getColor(R.color.backgroundSecondary));
    }

    public PieChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public PieChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public float getPercent() {
        return this.percent;
    }

    public void setPercent(float f) {
        this.percent = f;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float angleFromPercent = getAngleFromPercent();
        RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        canvas.drawArc(rectF, START_ANGLE, angleFromPercent, true, this.piePaint);
        canvas.drawArc(rectF, angleFromPercent + START_ANGLE, 360.0f - angleFromPercent, true, this.piePaintGray);
    }

    private float getAngleFromPercent() {
        return (this.percent * 360.0f) / 100.0f;
    }
}
