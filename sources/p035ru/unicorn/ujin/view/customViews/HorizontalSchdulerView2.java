package p035ru.unicorn.ujin.view.customViews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.ujin.view.customViews.HorizontalSchdulerView2 */
public class HorizontalSchdulerView2 extends View {
    private static final int COUNT = 31;
    private int choosePosition;
    int colorActiveLine;
    int colorInActiveLine;
    int colorSubtitle;
    int colorTitle;
    private int cornerRadius;
    private Paint fakePaint;
    private int itemWidth;
    private long lastPosition;
    private OnDateChange onDateChange;
    private int paddingBottom;
    private int paddingLeft;
    private int paddingRight;
    private int paddingTop;
    private Paint paint;

    /* renamed from: r */
    Rect f6899r = new Rect();
    RectF rectF;
    private RectF rectFakeLeft;
    private RectF rectFakeRight;
    private int startOffset;
    private String subtitle;
    private String title;
    private List<DaysValue> values;
    private int widthScreen;

    /* renamed from: ru.unicorn.ujin.view.customViews.HorizontalSchdulerView2$OnDateChange */
    public interface OnDateChange {
        boolean onDataLoading();

        void onGetData(long j);
    }

    public HorizontalSchdulerView2(Context context) {
        super(context);
        init();
    }

    private void init() {
        this.choosePosition = -1;
        this.colorActiveLine = ContextCompat.getColor(getContext(), R.color.colorLine);
        this.colorInActiveLine = ContextCompat.getColor(getContext(), R.color.colorLineInActive);
        this.colorTitle = ContextCompat.getColor(getContext(), R.color.colorTitle);
        this.colorSubtitle = ContextCompat.getColor(getContext(), R.color.colorSubTitle);
        this.values = DaysValue.generateResult();
        this.paint = new Paint();
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setAntiAlias(true);
        this.paint.setStrokeWidth((float) dpToPx(2));
        this.paint.setTextSize((float) dpToPx(15));
        this.widthScreen = getResources().getDisplayMetrics().widthPixels;
        int dpToPx = dpToPx(30);
        this.paddingRight = dpToPx;
        this.paddingLeft = dpToPx;
        int dpToPx2 = dpToPx(24);
        this.paddingBottom = dpToPx2;
        this.paddingTop = dpToPx2;
        this.itemWidth = (this.widthScreen - this.paddingLeft) - this.paddingRight;
        this.startOffset = 0;
        this.rectF = new RectF();
        this.cornerRadius = dpToPx(22);
        this.rectFakeLeft = new RectF();
        this.rectFakeRight = new RectF();
        this.fakePaint = new Paint();
        this.fakePaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.fakePaint.setAntiAlias(true);
        this.fakePaint.setStrokeWidth((float) dpToPx(2));
        this.fakePaint.setColor(getResources().getColor(R.color.brandBackgroundSeven));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Log.d("TAG", "EVENT 2 " + motionEvent.getAction());
        return super.onTouchEvent(motionEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        motionEvent.getY();
        int i = this.itemWidth;
        float f = (x - ((float) ((i / 2) + (((int) ((x - ((float) (i / 2))) / ((float) i))) * this.paddingLeft)))) / ((float) i);
        if (f > 0.0f && f < 31.0f && motionEvent.getAction() == 1) {
            int i2 = (int) f;
            this.choosePosition = i2;
            DaysValue daysValue = this.values.get(i2);
            invalidate();
            if (!(this.onDateChange == null || this.lastPosition == daysValue.date)) {
                this.lastPosition = daysValue.date;
                this.onDateChange.onGetData(this.lastPosition / 1000);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.itemWidth + this.paddingLeft + this.paddingRight, dpToPx(120) + this.paddingTop + this.paddingBottom);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = 0;
        while (i < 1) {
            this.paint.setStrokeWidth((float) dpToPx(3));
            this.paint.setStyle(Paint.Style.STROKE);
            this.paint.setColor(this.choosePosition == i ? this.colorActiveLine : this.colorInActiveLine);
            this.rectF.set((float) this.paddingLeft, (float) this.paddingTop, (float) (this.itemWidth + this.paddingRight), (float) (getHeight() - this.paddingBottom));
            RectF rectF2 = this.rectF;
            int i2 = this.cornerRadius;
            canvas.drawRoundRect(rectF2, (float) i2, (float) i2, this.paint);
            this.paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.paint.setStrokeWidth((float) dpToPx(1));
            this.paint.setTextSize((float) spToPx(18.0f));
            this.paint.setColor(this.colorTitle);
            canvas.getClipBounds(this.f6899r);
            this.paint.getTextBounds(this.values.get(i).title, 0, this.values.get(i).title.length(), this.f6899r);
            canvas.drawText(this.values.get(i).title, this.rectF.centerX() - ((float) (this.f6899r.width() / 2)), this.rectF.centerY() - ((float) (this.f6899r.height() / 2)), this.paint);
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setStrokeWidth((float) dpToPx(1));
            this.paint.setTextSize((float) spToPx(17.0f));
            this.paint.setColor(this.colorSubtitle);
            this.paint.getTextBounds(this.values.get(i).subtitle, 0, this.values.get(i).subtitle.length(), this.f6899r);
            canvas.drawText(this.values.get(i).subtitle, this.rectF.centerX() - ((float) (this.f6899r.width() / 2)), this.rectF.centerY() + ((float) this.f6899r.height()), this.paint);
            i++;
        }
        drawKFakeFullDayLeft(canvas);
        drawKFakeFullDayRight(canvas);
        RectF rectF3 = this.rectFakeLeft;
        int i3 = this.cornerRadius;
        canvas.drawRoundRect(rectF3, (float) i3, (float) i3, this.fakePaint);
        RectF rectF4 = this.rectFakeRight;
        int i4 = this.cornerRadius;
        canvas.drawRoundRect(rectF4, (float) i4, (float) i4, this.fakePaint);
    }

    private int dpToPx(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    private int spToPx(float f) {
        return (int) TypedValue.applyDimension(2, f, getResources().getDisplayMetrics());
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.HorizontalSchdulerView2$DaysValue */
    private static class DaysValue {
        /* access modifiers changed from: private */
        public long date;
        /* access modifiers changed from: private */
        public String subtitle;
        /* access modifiers changed from: private */
        public String title;

        public DaysValue(String str, String str2, long j) {
            this.title = str;
            this.subtitle = str2;
            this.date = j;
        }

        public static List<DaysValue> generateResult() {
            Calendar instance = Calendar.getInstance();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 31; i++) {
                String displayName = instance.getDisplayName(7, 2, Locale.getDefault());
                String displayName2 = instance.getDisplayName(2, 2, Locale.getDefault());
                String upperCase = String.valueOf(instance.get(5)).toUpperCase();
                arrayList.add(new DaysValue(upperCase + " " + displayName2, upFirstChar(displayName), instance.getTimeInMillis()));
                instance.add(6, 1);
            }
            return arrayList;
        }

        private static String upFirstChar(String str) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
    }

    public void setOnDateChange(OnDateChange onDateChange2) {
        this.onDateChange = onDateChange2;
    }

    private void drawKFakeFullDayLeft(Canvas canvas) {
        this.rectFakeLeft.set(-100.0f, (float) this.paddingTop, (float) (this.paddingLeft / 2), (float) (getHeight() - this.paddingBottom));
    }

    private void drawKFakeFullDayRight(Canvas canvas) {
        this.rectFakeRight.set((float) (getWidth() - (this.paddingRight / 2)), (float) this.paddingTop, (float) (getWidth() + 100), (float) (getHeight() - this.paddingBottom));
    }
}
