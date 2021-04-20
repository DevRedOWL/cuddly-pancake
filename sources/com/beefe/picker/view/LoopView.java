package com.beefe.picker.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class LoopView extends View {
    private Context context;
    private int firstLineY;
    private GestureDetector gestureDetector;
    private int halfCircumference;
    Handler handler;
    int initPosition;
    boolean isLoop;
    List<String> items;
    private int itemsVisible;
    float lineSpacingMultiplier;
    private ScheduledExecutorService mExecutor = Executors.newSingleThreadScheduledExecutor();
    private ScheduledFuture<?> mFuture;
    private int mOffset = 0;
    int maxTextHeight;
    private int measuredHeight;
    OnItemSelectedListener onItemSelectedListener;
    private Paint paintCenterText;
    private Paint paintIndicator;
    private Paint paintOuterText;
    private int preCurrentIndex;
    private float previousY;
    private int radius;
    private float scaleX = 1.05f;
    private int secondLineY;
    private int selectedIndex;
    private String selectedItem;
    private long startTime = 0;
    private Rect tempRect = new Rect();
    private int textEllipsisLen = 7;
    private int textSize;
    int totalScrollY;

    enum ACTION {
        CLICK,
        FLING,
        DRAG
    }

    public LoopView(Context context2) {
        super(context2);
        initLoopView(context2);
    }

    public LoopView(Context context2, AttributeSet attributeSet) {
        super(context2, attributeSet);
        initLoopView(context2);
    }

    public LoopView(Context context2, AttributeSet attributeSet, int i) {
        super(context2, attributeSet, i);
        initLoopView(context2);
    }

    private void initLoopView(Context context2) {
        this.context = context2;
        this.handler = new MessageHandler(this);
        this.gestureDetector = new GestureDetector(context2, new LoopViewGestureListener(this));
        this.gestureDetector.setIsLongpressEnabled(false);
        this.lineSpacingMultiplier = 2.0f;
        this.isLoop = true;
        this.itemsVisible = 9;
        this.textSize = (int) (context2.getResources().getDisplayMetrics().density * 16.0f);
        this.totalScrollY = 0;
        this.initPosition = -1;
        initPaints();
    }

    private void initPaints() {
        this.paintOuterText = new Paint();
        this.paintOuterText.setColor(-5263441);
        this.paintOuterText.setAntiAlias(true);
        this.paintOuterText.setTypeface(Typeface.MONOSPACE);
        this.paintOuterText.setTextSize((float) this.textSize);
        this.paintCenterText = new Paint();
        this.paintCenterText.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.paintCenterText.setAntiAlias(true);
        this.paintCenterText.setTextScaleX(this.scaleX);
        this.paintCenterText.setTypeface(Typeface.MONOSPACE);
        this.paintCenterText.setTextSize((float) this.textSize);
        this.paintIndicator = new Paint();
        this.paintIndicator.setColor(-4670526);
        this.paintIndicator.setAntiAlias(true);
        if (Build.VERSION.SDK_INT >= 11) {
            setLayerType(1, (Paint) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        remeasure();
        setMeasuredDimension(i, this.measuredHeight);
    }

    private void remeasure() {
        List<String> list = this.items;
        if (list != null) {
            this.maxTextHeight = this.textSize;
            int i = this.maxTextHeight;
            float f = this.lineSpacingMultiplier;
            this.halfCircumference = (int) (((float) i) * f * ((float) (this.itemsVisible - 1)));
            int i2 = this.halfCircumference;
            this.measuredHeight = (int) (((double) (i2 * 2)) / 3.141592653589793d);
            this.radius = (int) (((double) i2) / 3.141592653589793d);
            int i3 = this.measuredHeight;
            this.firstLineY = (int) ((((float) i3) - (((float) i) * f)) / 2.0f);
            this.secondLineY = (int) ((((float) i3) + (f * ((float) i))) / 2.0f);
            if (this.initPosition == -1) {
                if (this.isLoop) {
                    this.initPosition = (list.size() + 1) / 2;
                } else {
                    this.initPosition = 0;
                }
            }
            this.preCurrentIndex = this.initPosition;
        }
    }

    /* access modifiers changed from: package-private */
    public void smoothScroll(ACTION action) {
        cancelFuture();
        if (action == ACTION.FLING || action == ACTION.DRAG) {
            float f = this.lineSpacingMultiplier * ((float) this.maxTextHeight);
            this.mOffset = (int) (((((float) this.totalScrollY) % f) + f) % f);
            int i = this.mOffset;
            if (((float) i) > f / 2.0f) {
                this.mOffset = (int) (f - ((float) i));
            } else {
                this.mOffset = -i;
            }
        }
        this.mFuture = this.mExecutor.scheduleWithFixedDelay(new SmoothScrollTimerTask(this, this.mOffset), 0, 10, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    public final void scrollBy(float f) {
        cancelFuture();
        this.mFuture = this.mExecutor.scheduleWithFixedDelay(new InertiaTimerTask(this, f), 0, (long) 10, TimeUnit.MILLISECONDS);
    }

    public void cancelFuture() {
        ScheduledFuture<?> scheduledFuture = this.mFuture;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.mFuture.cancel(true);
            this.mFuture = null;
        }
    }

    public void setTextColor(int i) {
        this.paintCenterText.setColor(i);
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        this.paintOuterText.setTypeface(typeface);
        this.paintCenterText.setTypeface(typeface);
        invalidate();
    }

    public final void setNotLoop() {
        this.isLoop = false;
    }

    public final void setTextSize(float f) {
        if (f > 0.0f) {
            this.textSize = (int) (this.context.getResources().getDisplayMetrics().density * f);
            this.paintOuterText.setTextSize((float) this.textSize);
            this.paintCenterText.setTextSize((float) this.textSize);
            remeasure();
            invalidate();
        }
    }

    public final void setTextEllipsisLen(int i) {
        this.textEllipsisLen = i;
    }

    public boolean hasItem(String str) {
        return this.items.indexOf(str) != -1;
    }

    public void setSelectedItem(String str) {
        setSelectedPosition(this.items.indexOf(str));
    }

    public int getItemPosition(String str) {
        return this.items.indexOf(str);
    }

    public int getViewHeight() {
        return this.measuredHeight;
    }

    public final void setSelectedPosition(int i) {
        if (i < 0) {
            this.initPosition = 0;
        } else {
            List<String> list = this.items;
            if (list != null && list.size() > i) {
                this.initPosition = i;
            }
        }
        this.selectedIndex = i;
        this.totalScrollY = 0;
        cancelFuture();
        invalidate();
    }

    public final void setListener(OnItemSelectedListener onItemSelectedListener2) {
        this.onItemSelectedListener = onItemSelectedListener2;
    }

    public final void setItems(List<String> list) {
        this.items = list;
        remeasure();
        invalidate();
    }

    public String getIndexItem(int i) {
        return this.items.get(i);
    }

    public String getSelectedItem() {
        return this.selectedItem;
    }

    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    /* access modifiers changed from: protected */
    public final void onItemSelected() {
        if (this.onItemSelectedListener != null) {
            postDelayed(new OnItemSelectedRunnable(this), 200);
        }
    }

    /* access modifiers changed from: protected */
    public final void drawText(Canvas canvas, String str, float f, float f2, Paint paint) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] charArray = str.toCharArray();
        int i = 0;
        for (int i2 = 0; i2 < charArray.length && i < this.textEllipsisLen * 2; i2++) {
            char c = charArray[i2];
            i = (c > 127 || c == '^') ? i + 2 : i + 1;
            stringBuffer.append(String.valueOf(c));
        }
        if (charArray.length != stringBuffer.toString().toCharArray().length) {
            str = stringBuffer.toString() + "...";
        }
        canvas.drawText(str, f, f2, paint);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        List<String> list = this.items;
        if (list != null) {
            String[] strArr = new String[this.itemsVisible];
            this.preCurrentIndex = this.initPosition + (((int) (((float) this.totalScrollY) / (this.lineSpacingMultiplier * ((float) this.maxTextHeight)))) % list.size());
            if (!this.isLoop) {
                if (this.preCurrentIndex < 0) {
                    this.preCurrentIndex = 0;
                }
                if (this.preCurrentIndex > this.items.size() - 1) {
                    this.preCurrentIndex = this.items.size() - 1;
                }
            } else {
                if (this.preCurrentIndex < 0) {
                    this.preCurrentIndex = this.items.size() + this.preCurrentIndex;
                }
                if (this.preCurrentIndex > this.items.size() - 1) {
                    this.preCurrentIndex -= this.items.size();
                }
            }
            int i = (int) (((float) this.totalScrollY) % (this.lineSpacingMultiplier * ((float) this.maxTextHeight)));
            int i2 = 0;
            while (true) {
                int i3 = this.itemsVisible;
                if (i2 >= i3) {
                    break;
                }
                int i4 = this.preCurrentIndex - ((i3 / 2) - i2);
                if (this.isLoop) {
                    while (i4 < 0) {
                        i4 += this.items.size();
                    }
                    while (i4 > this.items.size() - 1) {
                        i4 -= this.items.size();
                    }
                    strArr[i2] = this.items.get(i4);
                } else if (i4 < 0) {
                    strArr[i2] = "";
                } else if (i4 > this.items.size() - 1) {
                    strArr[i2] = "";
                } else {
                    strArr[i2] = this.items.get(i4);
                }
                i2++;
            }
            canvas.drawLine(0.0f, (float) this.firstLineY, (float) getWidth(), (float) this.firstLineY, this.paintIndicator);
            canvas.drawLine(0.0f, (float) this.secondLineY, (float) getWidth(), (float) this.secondLineY, this.paintIndicator);
            for (int i5 = 0; i5 < this.itemsVisible; i5++) {
                canvas.save();
                float f = ((float) this.maxTextHeight) * this.lineSpacingMultiplier;
                double d = (((double) ((((float) i5) * f) - ((float) i))) * 3.141592653589793d) / ((double) this.halfCircumference);
                float f2 = (float) (90.0d - ((d / 3.141592653589793d) * 180.0d));
                if (f2 >= 90.0f || f2 <= -90.0f) {
                    canvas.restore();
                } else {
                    int cos = (int) ((((double) this.radius) - (Math.cos(d) * ((double) this.radius))) - ((Math.sin(d) * ((double) this.maxTextHeight)) / 2.0d));
                    canvas2.translate(0.0f, (float) cos);
                    canvas2.scale(1.0f, (float) Math.sin(d));
                    String str = strArr[i5];
                    int i6 = this.firstLineY;
                    if (cos > i6 || this.maxTextHeight + cos < i6) {
                        int i7 = this.secondLineY;
                        if (cos <= i7 && this.maxTextHeight + cos >= i7) {
                            canvas.save();
                            canvas2.clipRect(0, 0, getWidth(), this.secondLineY - cos);
                            drawText(canvas, str, getX(str, this.paintCenterText), getY(this.paintCenterText), this.paintCenterText);
                            canvas.restore();
                            canvas.save();
                            canvas2.clipRect(0, this.secondLineY - cos, getWidth(), (int) f);
                            drawText(canvas, str, getX(str, this.paintOuterText), getY(this.paintOuterText), this.paintOuterText);
                            canvas.restore();
                        } else if (cos < this.firstLineY || this.maxTextHeight + cos > this.secondLineY) {
                            canvas2.clipRect(0, 0, getWidth(), (int) f);
                            drawText(canvas, str, getX(str, this.paintOuterText), getY(this.paintOuterText), this.paintOuterText);
                        } else {
                            canvas2.clipRect(0, 0, getWidth(), (int) f);
                            drawText(canvas, str, getX(str, this.paintCenterText), getY(this.paintCenterText), this.paintCenterText);
                            this.selectedItem = str;
                            this.selectedIndex = this.items.indexOf(str);
                        }
                    } else {
                        canvas.save();
                        canvas2.clipRect(0, 0, getWidth(), this.firstLineY - cos);
                        drawText(canvas, str, getX(str, this.paintOuterText), getY(this.paintOuterText), this.paintOuterText);
                        canvas.restore();
                        canvas.save();
                        canvas2.clipRect(0, this.firstLineY - cos, getWidth(), (int) f);
                        drawText(canvas, str, getX(str, this.paintCenterText), getY(this.paintCenterText), this.paintCenterText);
                        canvas.restore();
                    }
                    canvas.restore();
                }
            }
        }
    }

    private float getX(String str, Paint paint) {
        paint.getTextBounds(str, 0, str.length(), this.tempRect);
        if ((((float) getWidth()) - (((float) this.tempRect.width()) * this.scaleX)) / 2.0f > 0.0f) {
            return (((float) getWidth()) - (((float) this.tempRect.width()) * this.scaleX)) / 2.0f;
        }
        return 0.0f;
    }

    private float getY(Paint paint) {
        Rect rect = new Rect(0, 0, getWidth(), this.maxTextHeight);
        RectF rectF = new RectF(rect);
        rectF.bottom = paint.descent() - paint.ascent();
        rectF.top += (((float) rect.height()) - rectF.bottom) / 2.0f;
        return rectF.top - paint.ascent();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.gestureDetector.onTouchEvent(motionEvent);
        float f = this.lineSpacingMultiplier * ((float) this.maxTextHeight);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.startTime = System.currentTimeMillis();
            cancelFuture();
            this.previousY = motionEvent.getRawY();
        } else if (action == 2) {
            this.previousY = motionEvent.getRawY();
            this.totalScrollY = (int) (((float) this.totalScrollY) + (this.previousY - motionEvent.getRawY()));
            if (!this.isLoop) {
                float f2 = ((float) (-this.initPosition)) * f;
                float size = ((float) ((this.items.size() - 1) - this.initPosition)) * f;
                int i = this.totalScrollY;
                if (((float) i) < f2) {
                    this.totalScrollY = (int) f2;
                } else if (((float) i) > size) {
                    this.totalScrollY = (int) size;
                }
            }
        } else if (!onTouchEvent) {
            float y = motionEvent.getY();
            int i2 = this.radius;
            this.mOffset = (int) ((((float) (((int) (((Math.acos((double) ((((float) i2) - y) / ((float) i2))) * ((double) this.radius)) + ((double) (f / 2.0f))) / ((double) f))) - (this.itemsVisible / 2))) * f) - (((((float) this.totalScrollY) % f) + f) % f));
            if (System.currentTimeMillis() - this.startTime > 120) {
                smoothScroll(ACTION.DRAG);
            } else {
                smoothScroll(ACTION.CLICK);
            }
        }
        invalidate();
        return true;
    }
}
