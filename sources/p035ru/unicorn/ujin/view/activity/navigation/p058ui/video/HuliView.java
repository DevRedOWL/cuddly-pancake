package p035ru.unicorn.ujin.view.activity.navigation.p058ui.video;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.OverScroller;
import androidx.core.content.ContextCompat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.video.HuliView */
public class HuliView extends View implements ScaleGestureDetector.OnScaleGestureListener {
    public static final double MIN_DISTANCE = 50.0d;
    public int COUNT;
    public int EVENT_HEIGHT = dpToPx(10);
    public int LINE_WIDTH = dpToPx(1);
    public int LONG_LINE_HEIGHT = dpToPx(30);
    public int SHOT_LINE_HEIGHT = (this.LONG_LINE_HEIGHT / 2);
    SimpleDateFormat currentActiveFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
    public int dayCount = 0;
    private float delta;
    private long deltaScroolX;
    List<Data> events;
    private OverScroller mScroller;
    private int marginTop;
    private long msCurrentDelta = 0;
    public float msInPixel;
    int offset = 0;
    OnChangeDataListener onChangeDataListener;
    private int paddingEnd;
    private int paddingStart;
    private Paint paint;
    private Path path = new Path();
    private float radiusRectTimeRect = 10.0f;
    private Rect rect;
    private RectF rectTimeClick;
    private List<Long> result;
    private int scale = 1;
    ScaleGestureDetector scaleGestureDetector;
    private long scroolX;
    int startOffset = 50;
    private float startScale;
    private long startTime;
    private float startX;
    private float stopScale;
    String text;
    private Paint textPaint;
    private long time;
    SimpleDateFormat timeLineFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
    private boolean videoIsStreaming = false;
    private int widthScreen;

    /* renamed from: x */
    private float f6887x;

    /* renamed from: y */
    private float f6888y;

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.video.HuliView$OnChangeDataListener */
    public interface OnChangeDataListener {
        void onChangeDate(long j);
    }

    public void setDates(VideoDates videoDates) {
    }

    public void setEvents(List<VideoEvents> list) {
        if (list != null && !list.isEmpty()) {
            this.events = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                VideoEvents videoEvents = list.get(i);
                this.events.add(new Data(Long.valueOf(videoEvents.getTimestamp()).longValue(), Long.valueOf((long) videoEvents.getDuration().intValue()).longValue()));
            }
            invalidate();
        }
    }

    public void setCurrentDate(Long l) {
        requestLayout();
        invalidate();
        createTimeLineData(l.longValue());
    }

    public void setOnChangeDataListener(OnChangeDataListener onChangeDataListener2) {
        this.onChangeDataListener = onChangeDataListener2;
    }

    public HuliView(Context context) {
        super(context);
        init(context);
    }

    private void createTimeLineData(long j) {
        this.result = new ArrayList();
        Calendar instance = Calendar.getInstance();
        long j2 = j * 1000;
        instance.setTimeInMillis(j2);
        if (instance.get(6) != Calendar.getInstance().get(6)) {
            instance.set(11, 23);
            instance.set(12, 59);
            instance.set(13, 59);
        } else {
            instance = Calendar.getInstance();
        }
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j2);
        instance2.set(11, 0);
        instance2.set(12, 0);
        instance2.set(13, 0);
        Log.d("TAG", "XXX " + instance.getTime() + " " + instance2.getTime());
        this.delta = (float) (Math.abs(instance.getTimeInMillis() - instance2.getTimeInMillis()) / 1000);
        this.startTime = instance2.getTimeInMillis() / 1000;
        while (instance.get(6) >= instance2.get(6)) {
            this.result.add(Long.valueOf(instance2.getTimeInMillis()));
            instance2.add(12, 15);
            if (instance.get(6) == instance2.get(6) && instance.getTimeInMillis() < instance2.getTimeInMillis()) {
                break;
            }
        }
        this.COUNT = this.result.size();
    }

    private void init(Context context) {
        this.widthScreen = getResources().getDisplayMetrics().widthPixels;
        int i = this.widthScreen / 2;
        this.paddingStart = i;
        this.paddingEnd = i;
        this.events = new ArrayList();
        this.f6887x = (float) ((getWidth() - this.paddingEnd) - this.paddingStart);
        this.scaleGestureDetector = new ScaleGestureDetector(context, this);
        this.marginTop = dpToPx(65);
        this.paint = new Paint();
        this.paint.setColor(ContextCompat.getColor(getContext(), R.color.color_scale));
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setStrokeWidth((float) this.LINE_WIDTH);
        this.textPaint = new Paint();
        this.textPaint.setColor(ContextCompat.getColor(getContext(), R.color.color_text));
        this.rect = new Rect();
        this.rectTimeClick = new RectF();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.offset = this.paddingStart;
        canvas.drawColor(ContextCompat.getColor(getContext(), R.color.color_bg_top));
        this.paint.setColor(ContextCompat.getColor(getContext(), R.color.color_bg_bottom));
        canvas.drawRect(0.0f, (float) (this.marginTop + this.LONG_LINE_HEIGHT + this.EVENT_HEIGHT), (float) getWidth(), (float) getBottom(), this.paint);
        this.paint.setColor(ContextCompat.getColor(getContext(), R.color.color_bg_top_bottom_divider));
        canvas.drawLine(0.0f, (float) (this.marginTop + this.LONG_LINE_HEIGHT + this.EVENT_HEIGHT), (float) getWidth(), (float) (this.marginTop + this.LONG_LINE_HEIGHT + this.EVENT_HEIGHT + dpToPx(1)), this.paint);
        this.paint.setColor(ContextCompat.getColor(getContext(), R.color.color_scale));
        for (int i = 0; i < this.result.size(); i++) {
            this.text = String.valueOf(this.timeLineFormat.format(this.result.get(i)));
            if (i == 0 || i % 4 == 0) {
                int i2 = this.offset;
                int i3 = this.marginTop;
                canvas.drawLine((float) i2, (float) i3, (float) i2, (float) (i3 + this.LONG_LINE_HEIGHT), this.paint);
                Paint paint2 = this.textPaint;
                String str = this.text;
                paint2.getTextBounds(str, 0, str.length(), this.rect);
                this.textPaint.setTextSize((float) dpToPx(16));
                this.textPaint.setTextAlign(Paint.Align.CENTER);
                this.textPaint.setColor(ContextCompat.getColor(getContext(), R.color.color_text_scale_time));
                canvas.drawText(this.text, (float) this.offset, (float) (dpToPx(30) + this.marginTop + this.LONG_LINE_HEIGHT + this.EVENT_HEIGHT), this.textPaint);
            } else {
                int i4 = this.offset;
                int i5 = this.marginTop;
                int i6 = this.SHOT_LINE_HEIGHT;
                canvas.drawLine((float) i4, (float) (i5 + i6), (float) i4, (float) (i5 + (i6 * 2)), this.paint);
            }
            this.offset += 50;
        }
        float width = ((float) ((getWidth() - this.paddingEnd) - this.paddingStart)) / this.delta;
        List<Data> list = this.events;
        if (list != null && !list.isEmpty()) {
            for (int i7 = 0; i7 < this.events.size(); i7++) {
                float access$000 = ((float) (this.events.get(i7).data - this.startTime)) * width;
                float access$0002 = ((float) ((this.events.get(i7).data + this.events.get(i7).duration) - this.startTime)) * width;
                this.paint.setColor(ContextCompat.getColor(getContext(), R.color.color_event));
                canvas.drawRect(access$000, (float) (this.marginTop + this.LONG_LINE_HEIGHT + dpToPx(2)), access$0002, (float) (((this.marginTop + this.LONG_LINE_HEIGHT) + this.EVENT_HEIGHT) - dpToPx(2)), this.paint);
            }
        }
        this.paint.setColor(ContextCompat.getColor(getContext(), R.color.color_current_time));
        float scroolX2 = (float) (((long) this.paddingStart) + getScroolX());
        canvas.drawLine(scroolX2, (float) ((this.marginTop + this.SHOT_LINE_HEIGHT) - dpToPx(10)), scroolX2, (float) (this.marginTop + (this.SHOT_LINE_HEIGHT * 2)), this.paint);
        canvas.drawCircle(scroolX2, (float) ((this.marginTop + this.SHOT_LINE_HEIGHT) - dpToPx(10)), (float) dpToPx(7), this.paint);
        TimeUnit.MINUTES.toMillis(15);
        int width2 = (getWidth() - this.paddingEnd) - this.paddingStart;
        getScroolX();
        this.msInPixel = this.delta / ((float) width2);
        Calendar instance = Calendar.getInstance();
        if (this.videoIsStreaming) {
            instance.setTimeInMillis(((this.startTime + (((long) this.msInPixel) * getScroolX())) * 1000) + this.msCurrentDelta);
        } else {
            instance.setTimeInMillis((this.startTime + (((long) this.msInPixel) * getScroolX())) * 1000);
        }
        String format = this.currentActiveFormat.format(instance.getTime());
        this.time = instance.getTimeInMillis();
        if (!this.videoIsStreaming) {
            this.onChangeDataListener.onChangeDate(this.time / 1000);
        }
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(ContextCompat.getColor(getContext(), R.color.color_current_time));
        this.rectTimeClick.set(scroolX2 - ((float) dpToPx(40)), (float) ((this.marginTop / 2) - this.startOffset), scroolX2 + ((float) dpToPx(40)), (float) (this.marginTop - this.startOffset));
        this.paint.setColor(ContextCompat.getColor(getContext(), R.color.bg_color_current_time));
        RectF rectF = this.rectTimeClick;
        float f = this.radiusRectTimeRect;
        canvas.drawRoundRect(rectF, f, f, this.paint);
        this.textPaint.setColor(ContextCompat.getColor(getContext(), R.color.color_text_current_time));
        canvas.drawText(format, this.rectTimeClick.centerX(), this.rectTimeClick.centerY() + ((float) dpToPx(4)), this.textPaint);
    }

    public void setVideoIsStreaming(boolean z) {
        this.videoIsStreaming = z;
    }

    public boolean getVideoIsStreaming() {
        return this.videoIsStreaming;
    }

    public void setMsCurrentDelta(long j) {
        this.msCurrentDelta = j;
    }

    public long getMsCurrentDelta() {
        return this.msCurrentDelta;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension((this.COUNT * this.startOffset) + this.paddingStart + this.paddingEnd, dpToPx(250));
    }

    private int dpToPx(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector2) {
        this.startScale = scaleGestureDetector2.getFocusX();
        Log.d("TAG", "XXX onScale " + Math.abs(this.startScale - this.stopScale));
        if (Math.abs(this.startScale - this.stopScale) <= 70.0f) {
            return true;
        }
        invalidate();
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector2) {
        this.stopScale = scaleGestureDetector2.getFocusX();
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector2) {
        Log.d("TAG", "XXX onScale enf ");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.msCurrentDelta = 0;
        this.videoIsStreaming = false;
        this.scaleGestureDetector.onTouchEvent(motionEvent);
        this.f6887x = motionEvent.getX() + ((float) getScroolX());
        if (motionEvent.getX() + ((float) getScroolX()) > ((float) ((getWidth() - this.paddingEnd) - this.paddingStart))) {
            this.f6887x = (float) ((getWidth() - this.paddingEnd) - this.paddingStart);
        }
        this.f6888y = motionEvent.getY();
        int width = getWidth();
        int i = this.startOffset;
        Calendar.getInstance().setTimeInMillis((long) (((float) (this.startTime * 1000)) + ((((this.f6887x - ((float) (i * 2))) * ((float) this.COUNT)) / ((float) ((width - (i * 2)) - 200))) * ((float) TimeUnit.SECONDS.toMillis(900)))));
        return super.dispatchTouchEvent(motionEvent);
    }

    public long getScroolX() {
        return this.scroolX;
    }

    public void setScroolX(long j) {
        this.scroolX = j;
        this.deltaScroolX = j;
        invalidate();
    }

    public void setDeltaScroolX(long j) {
        this.deltaScroolX = j;
    }

    public long getDeltaScroolX() {
        return this.deltaScroolX;
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.video.HuliView$Data */
    public class Data {
        /* access modifiers changed from: private */
        public long data;
        /* access modifiers changed from: private */
        public long duration;

        public Data(long j, long j2) {
            this.data = j;
            this.duration = j2;
        }
    }
}
