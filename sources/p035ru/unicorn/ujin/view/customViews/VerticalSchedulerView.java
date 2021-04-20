package p035ru.unicorn.ujin.view.customViews;

import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.DatePicker;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.util.DateUtils;

/* renamed from: ru.unicorn.ujin.view.customViews.VerticalSchedulerView */
public class VerticalSchedulerView extends View implements DatePickerDialog.OnDateSetListener {
    /* access modifiers changed from: private */
    public static int COUNT = 1;
    private Calendar calendar = Calendar.getInstance();
    private Paint calendarPaint;
    int colorAvailableFree;
    int colorChoosen;
    int colorEmpty;
    int colorUnavailableFree;
    private int cornerRadius;
    private STATUS currentState;
    Map<String, List<Integer>> data;
    private Paint fakePaint;
    boolean fulldayIsAcrtivate = false;
    HourValue hourValue;
    HourValue.HourValueResult hourValueResult;
    IDateChoose iDateChoose;
    List<ISlots> iSlotsList;
    String iii = "";
    private int itemHeight;
    private int itemWidth;
    private int paddingBottom;
    private int paddingCenter;
    private int paddingLeft;
    private int paddingRight;
    private int paddingTop;
    private Paint paint;

    /* renamed from: r */
    private Rect f6904r = new Rect();

    /* renamed from: r2 */
    private Rect f6905r2 = new Rect();
    private RectF rectCalendar;
    private RectF rectF;
    private RectF rectFakeLeft;
    private RectF rectFakeRight;
    Set<Integer> reserveHour;
    private int startOffset;
    int textColorAvailable;
    int textColorChoosen;
    int textColorUnavailable;
    List<HourValue> values;
    private int widthScreen;

    /* renamed from: ru.unicorn.ujin.view.customViews.VerticalSchedulerView$IDateChoose */
    public interface IDateChoose {
        void onChangeFormCalendar(int i);

        void onDateChoose(Pair<Long, Long> pair);
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.VerticalSchedulerView$ISlots */
    public interface ISlots {
        boolean isSlotBusy();

        long slotFinish();

        long slotStart();
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.VerticalSchedulerView$STATUS */
    public enum STATUS {
        LOADING,
        ERROR,
        SUCCESS,
        FIRST_LAUNCH
    }

    public VerticalSchedulerView(Context context, long j) {
        super(context);
        this.calendar.setTimeInMillis(j);
        init();
    }

    public void setDate(long j, boolean z, List<ISlots> list) {
        this.currentState = STATUS.SUCCESS;
        this.iSlotsList = list;
        this.hourValueResult = HourValue.generateResult(j, z, list);
        this.values = this.hourValueResult.hourValueList;
        this.data = this.hourValueResult.data;
        requestLayout();
        invalidate();
    }

    public void setStatus(STATUS status) {
        this.currentState = status;
        invalidate();
    }

    public void clearResult() {
        init();
        requestLayout();
        invalidate();
    }

    private void init() {
        this.currentState = STATUS.FIRST_LAUNCH;
        this.fulldayIsAcrtivate = false;
        this.colorAvailableFree = ContextCompat.getColor(getContext(), R.color.colorAvailableFree);
        this.colorUnavailableFree = ContextCompat.getColor(getContext(), R.color.colorUnavailableFree);
        this.colorChoosen = ContextCompat.getColor(getContext(), R.color.colorChoosen);
        this.colorEmpty = ContextCompat.getColor(getContext(), R.color.colorEmpty);
        this.textColorChoosen = ContextCompat.getColor(getContext(), R.color.textColorChoosen);
        this.textColorAvailable = ContextCompat.getColor(getContext(), R.color.textColorAvailable);
        this.textColorUnavailable = ContextCompat.getColor(getContext(), R.color.textColorUnavailable);
        this.reserveHour = new HashSet();
        this.paint = new Paint();
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setAntiAlias(true);
        this.paint.setStrokeWidth((float) dpToPx(2));
        this.paint.setTextSize((float) dpToPx(20));
        this.fakePaint = new Paint();
        this.fakePaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.fakePaint.setAntiAlias(true);
        this.fakePaint.setStrokeWidth((float) dpToPx(2));
        this.fakePaint.setColor(getResources().getColor(R.color.brandBackgroundSeven));
        this.calendarPaint = new Paint();
        this.calendarPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.calendarPaint.setAntiAlias(true);
        this.calendarPaint.setColor(getResources().getColor(R.color.brandBackgroundSeven));
        this.widthScreen = getResources().getDisplayMetrics().widthPixels;
        int dpToPx = dpToPx(30);
        this.paddingRight = dpToPx;
        this.paddingLeft = dpToPx;
        int dpToPx2 = dpToPx(16);
        this.paddingBottom = dpToPx2;
        this.paddingTop = dpToPx2;
        this.paddingCenter = dpToPx(16);
        this.itemWidth = ((this.widthScreen / 2) - this.paddingRight) - (this.paddingCenter / 2);
        this.itemHeight = dpToPx(70);
        this.startOffset = this.paddingTop;
        this.rectF = new RectF();
        this.rectFakeLeft = new RectF();
        this.rectFakeRight = new RectF();
        this.rectCalendar = new RectF();
        this.cornerRadius = dpToPx(13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0172, code lost:
        if (r14.reserveHour.contains(java.lang.Integer.valueOf(r0 + 1)) != false) goto L_0x0174;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            float r0 = r15.getX()
            float r1 = r15.getY()
            r2 = 110(0x6e, float:1.54E-43)
            int r2 = r14.dpToPx(r2)
            int r3 = r14.paddingBottom
            int r2 = r2 + r3
            int r2 = r2 + r3
            float r2 = (float) r2
            int r3 = r14.paddingRight
            float r3 = (float) r3
            float r0 = r0 - r3
            int r3 = r14.paddingCenter
            r4 = 2
            int r3 = r3 / r4
            float r3 = (float) r3
            float r0 = r0 - r3
            int r3 = r14.getWidth()
            int r3 = r3 / r4
            int r5 = r14.paddingRight
            int r3 = r3 - r5
            int r5 = r14.paddingCenter
            int r5 = r5 / r4
            int r3 = r3 - r5
            float r3 = (float) r3
            r5 = 0
            r6 = 1
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0032
            r0 = 1
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            float r3 = r1 - r2
            int r7 = r14.itemHeight
            float r8 = (float) r7
            float r8 = r3 / r8
            int r8 = (int) r8
            int r9 = r14.paddingCenter
            int r8 = r8 * r9
            float r8 = (float) r8
            float r3 = r3 - r8
            int r3 = (int) r3
            int r3 = r3 / r7
            int r3 = r3 * 2
            int r3 = r3 + r0
            if (r3 != 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = r3
        L_0x004a:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00a0
            int r1 = r15.getAction()
            if (r1 != r6) goto L_0x00a0
            android.app.DatePickerDialog r0 = new android.app.DatePickerDialog
            android.content.Context r8 = r14.getContext()
            r9 = 2
            java.util.Calendar r1 = r14.calendar
            int r11 = r1.get(r6)
            java.util.Calendar r1 = r14.calendar
            int r12 = r1.get(r4)
            java.util.Calendar r1 = r14.calendar
            r2 = 5
            int r13 = r1.get(r2)
            r7 = r0
            r10 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            android.widget.DatePicker r1 = r0.getDatePicker()
            long r2 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MINUTES
            r5 = 1
            long r4 = r4.toMillis(r5)
            long r2 = r2 - r4
            r1.setMinDate(r2)
            android.widget.DatePicker r1 = r0.getDatePicker()
            long r2 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.DAYS
            r5 = 365(0x16d, double:1.803E-321)
            long r4 = r4.toMillis(r5)
            long r2 = r2 + r4
            r1.setMaxDate(r2)
            r0.show()
            goto L_0x0199
        L_0x00a0:
            ru.unicorn.ujin.view.customViews.VerticalSchedulerView$HourValue$HourValueResult r1 = r14.hourValueResult
            if (r1 == 0) goto L_0x00cf
            boolean r1 = r1.fullDayEmpty
            if (r1 == 0) goto L_0x00cf
            int r1 = r15.getAction()
            if (r1 != r6) goto L_0x00cf
            if (r0 == 0) goto L_0x00b2
            if (r0 != r6) goto L_0x00b7
        L_0x00b2:
            boolean r1 = r14.fulldayIsAcrtivate
            r1 = r1 ^ r6
            r14.fulldayIsAcrtivate = r1
        L_0x00b7:
            int r0 = r0 + -2
            ru.unicorn.ujin.view.customViews.VerticalSchedulerView$IDateChoose r1 = r14.iDateChoose
            if (r1 == 0) goto L_0x00cc
            ru.unicorn.ujin.view.customViews.VerticalSchedulerView$HourValue$HourValueResult r1 = r14.hourValueResult
            java.util.List<ru.unicorn.ujin.view.customViews.VerticalSchedulerView$HourValue> r1 = r1.hourValueList
            boolean r2 = r14.fulldayIsAcrtivate
            android.util.Pair r1 = r14.getChoosenPeriod(r1, r2)
            ru.unicorn.ujin.view.customViews.VerticalSchedulerView$IDateChoose r2 = r14.iDateChoose
            r2.onDateChoose(r1)
        L_0x00cc:
            r14.invalidate()
        L_0x00cf:
            int r1 = COUNT
            int r1 = r1 - r6
            if (r0 > r1) goto L_0x0199
            if (r0 < 0) goto L_0x0199
            boolean r1 = r14.fulldayIsAcrtivate
            if (r1 != 0) goto L_0x0199
            int r1 = r15.getAction()
            if (r1 != r6) goto L_0x0199
            java.util.List<ru.unicorn.ujin.view.customViews.VerticalSchedulerView$HourValue> r1 = r14.values
            if (r1 == 0) goto L_0x00f0
            java.lang.Object r1 = r1.get(r0)
            ru.unicorn.ujin.view.customViews.VerticalSchedulerView$HourValue r1 = (p035ru.unicorn.ujin.view.customViews.VerticalSchedulerView.HourValue) r1
            boolean r1 = r1.isEmpty
            if (r1 == 0) goto L_0x00f1
        L_0x00f0:
            r5 = 1
        L_0x00f1:
            if (r5 == 0) goto L_0x0199
            java.util.Set<java.lang.Integer> r1 = r14.reserveHour
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0134
            java.util.Set<java.lang.Integer> r1 = r14.reserveHour
            int r2 = r0 + -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x012a
            java.util.Set<java.lang.Integer> r1 = r14.reserveHour
            int r2 = r0 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x012a
            java.util.Set<java.lang.Integer> r1 = r14.reserveHour
            r1.clear()
            java.util.Set<java.lang.Integer> r1 = r14.reserveHour
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.add(r0)
            goto L_0x017d
        L_0x012a:
            java.util.Set<java.lang.Integer> r1 = r14.reserveHour
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.remove(r0)
            goto L_0x017d
        L_0x0134:
            java.util.Set<java.lang.Integer> r1 = r14.reserveHour
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0174
            java.lang.String r1 = r14.iii
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "*"
            r2.append(r3)
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x017d
            java.util.Set<java.lang.Integer> r1 = r14.reserveHour
            int r2 = r0 + -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x0174
            java.util.Set<java.lang.Integer> r1 = r14.reserveHour
            int r2 = r0 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x017d
        L_0x0174:
            java.util.Set<java.lang.Integer> r1 = r14.reserveHour
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.add(r0)
        L_0x017d:
            ru.unicorn.ujin.view.customViews.VerticalSchedulerView$IDateChoose r0 = r14.iDateChoose
            if (r0 == 0) goto L_0x0196
            ru.unicorn.ujin.view.customViews.VerticalSchedulerView$HourValue$HourValueResult r0 = r14.hourValueResult
            java.util.List<ru.unicorn.ujin.view.customViews.VerticalSchedulerView$HourValue> r0 = r0.hourValueList
            if (r0 == 0) goto L_0x0196
            ru.unicorn.ujin.view.customViews.VerticalSchedulerView$HourValue$HourValueResult r0 = r14.hourValueResult
            java.util.List<ru.unicorn.ujin.view.customViews.VerticalSchedulerView$HourValue> r0 = r0.hourValueList
            boolean r1 = r14.fulldayIsAcrtivate
            android.util.Pair r0 = r14.getChoosenPeriod(r0, r1)
            ru.unicorn.ujin.view.customViews.VerticalSchedulerView$IDateChoose r1 = r14.iDateChoose
            r1.onDateChoose(r0)
        L_0x0196:
            r14.invalidate()
        L_0x0199:
            ru.unicorn.ujin.view.customViews.VerticalSchedulerView$IDateChoose r0 = r14.iDateChoose
            if (r0 == 0) goto L_0x01bd
            java.util.Set<java.lang.Integer> r0 = r14.reserveHour
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01bd
            boolean r0 = r14.fulldayIsAcrtivate
            if (r0 != 0) goto L_0x01bd
            ru.unicorn.ujin.view.customViews.VerticalSchedulerView$IDateChoose r0 = r14.iDateChoose
            android.util.Pair r1 = new android.util.Pair
            r2 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.<init>(r4, r2)
            r0.onDateChoose(r1)
        L_0x01bd:
            boolean r15 = super.dispatchTouchEvent(r15)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.customViews.VerticalSchedulerView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    private Pair<Long, Long> getChoosenPeriod(List<HourValue> list, boolean z) {
        long j;
        List<ISlots> list2;
        int size = list.size();
        long j2 = 0;
        if (!z || (list2 = this.iSlotsList) == null || list2.isEmpty()) {
            Set<Integer> set = this.reserveHour;
            if (set == null || set.isEmpty()) {
                j = 0;
            } else {
                j2 = this.iSlotsList.get(((Integer) Collections.min(this.reserveHour)).intValue()).slotStart();
                j = this.iSlotsList.get(((Integer) Collections.max(this.reserveHour)).intValue()).slotStart();
                if (j2 == j) {
                    Calendar instance = Calendar.getInstance();
                    instance.setTimeInMillis(j * 1000);
                    instance.set(12, 59);
                    instance.set(13, 59);
                    j = instance.getTimeInMillis() / 1000;
                }
            }
        } else {
            j2 = this.iSlotsList.get(0).slotStart();
            j = this.iSlotsList.get(size - 1).slotStart();
        }
        return new Pair<>(Long.valueOf(j2), Long.valueOf(j));
    }

    private Pair<Long, Long> getChoosenPeriod(List<HourValue> list) {
        return getChoosenPeriod(list, this.fulldayIsAcrtivate);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = (this.itemHeight * 7) + this.paddingTop + this.paddingBottom + (COUNT * this.paddingCenter);
        HourValue.HourValueResult hourValueResult2 = this.hourValueResult;
        if (hourValueResult2 != null && hourValueResult2.fullDayEmpty) {
            i3 += this.itemHeight + this.paddingCenter;
        }
        setMeasuredDimension(this.widthScreen, dpToPx(110) + this.paddingTop + this.paddingBottom + i3);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        String str = "";
        drawCalendar(canvas, str, str);
        if (this.hourValueResult != null || this.currentState == STATUS.SUCCESS) {
            this.startOffset = this.paddingTop + dpToPx(120) + this.paddingBottom;
            if (this.hourValueResult.fullDayEmpty) {
                setRectSettings(this.fulldayIsAcrtivate ? this.colorChoosen : this.colorAvailableFree);
                drawFullDay(canvas);
                RectF rectF2 = this.rectF;
                int i = this.cornerRadius;
                canvas.drawRoundRect(rectF2, (float) i, (float) i, this.paint);
                RectF rectF3 = this.rectFakeLeft;
                int i2 = this.cornerRadius;
                canvas.drawRoundRect(rectF3, (float) i2, (float) i2, this.fakePaint);
                RectF rectF4 = this.rectFakeRight;
                int i3 = this.cornerRadius;
                canvas.drawRoundRect(rectF4, (float) i3, (float) i3, this.fakePaint);
                HourValue fullDateData = getFullDateData();
                setTitleSettings(this.fulldayIsAcrtivate ? this.textColorChoosen : this.textColorAvailable);
                drawTitle(canvas, fullDateData);
                setSubtitleSettings(this.fulldayIsAcrtivate ? this.textColorChoosen : this.textColorAvailable);
                drawSubTitle(canvas, fullDateData);
                this.startOffset += this.itemHeight + this.paddingCenter;
            }
            if (!this.reserveHour.isEmpty()) {
                Iterator<String> it = this.data.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    Set<Integer> set = this.reserveHour;
                    if (next.contains("*" + ((Integer[]) set.toArray(new Integer[set.size()]))[0] + "*")) {
                        this.iii = next;
                        break;
                    }
                }
            }
            for (int i4 = 0; i4 < this.values.size(); i4++) {
                int i5 = this.textColorAvailable;
                if (this.fulldayIsAcrtivate) {
                    setRectSettings(this.colorUnavailableFree);
                    this.reserveHour.clear();
                } else if (this.reserveHour.isEmpty() || !this.values.get(i4).isEmpty) {
                    setRectSettings(this.values.get(i4).isEmpty ? this.colorAvailableFree : this.colorEmpty);
                    i5 = this.textColorAvailable;
                } else if (this.reserveHour.contains(Integer.valueOf(i4))) {
                    i5 = this.textColorChoosen;
                    setRectSettings(this.colorChoosen);
                } else if (this.reserveHour.contains(Integer.valueOf(i4 + 1)) || this.reserveHour.contains(Integer.valueOf(i4 - 1))) {
                    setRectSettings(this.colorAvailableFree);
                } else if (this.iii.contains(cretarePattern(i4))) {
                    i5 = this.textColorUnavailable;
                    setRectSettings(this.colorUnavailableFree);
                } else {
                    i5 = this.textColorUnavailable;
                    setRectSettings(this.values.get(i4).isEmpty ? this.colorUnavailableFree : this.colorEmpty);
                }
                if (i4 % 2 == 0) {
                    RectF rectF5 = this.rectF;
                    int i6 = this.paddingLeft;
                    int i7 = this.startOffset;
                    rectF5.set((float) i6, (float) i7, (float) (i6 + this.itemWidth), (float) (i7 + this.itemHeight));
                } else {
                    this.rectF.set((float) ((getWidth() - this.itemWidth) - this.paddingRight), (float) this.startOffset, (float) (getWidth() - this.paddingRight), (float) (this.startOffset + this.itemHeight));
                    this.startOffset += this.itemHeight + this.paddingCenter;
                }
                RectF rectF6 = this.rectF;
                int i8 = this.cornerRadius;
                canvas.drawRoundRect(rectF6, (float) i8, (float) i8, this.paint);
                setTitleSettings(i5);
                drawTitle(canvas, this.values.get(i4));
                setSubtitleSettings(i5);
                drawSubTitle(canvas, this.values.get(i4));
                drawKFakeFullDayLeft(canvas);
                drawKFakeFullDayRight(canvas);
                RectF rectF7 = this.rectFakeLeft;
                int i9 = this.cornerRadius;
                canvas.drawRoundRect(rectF7, (float) i9, (float) i9, this.fakePaint);
                RectF rectF8 = this.rectFakeRight;
                int i10 = this.cornerRadius;
                canvas.drawRoundRect(rectF8, (float) i10, (float) i10, this.fakePaint);
            }
            return;
        }
        int i11 = C59681.f6906x7884fb5[this.currentState.ordinal()];
        if (i11 == 1) {
            str = "выберите дату";
        } else if (i11 == 2) {
            str = "Загрузка...";
        } else if (i11 == 3) {
            str = "Ошибка";
        }
        setTitleSettings(this.textColorChoosen);
        drawText(canvas, str);
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.VerticalSchedulerView$1 */
    static /* synthetic */ class C59681 {

        /* renamed from: $SwitchMap$ru$unicorn$ujin$view$customViews$VerticalSchedulerView$STATUS */
        static final /* synthetic */ int[] f6906x7884fb5 = new int[STATUS.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                ru.unicorn.ujin.view.customViews.VerticalSchedulerView$STATUS[] r0 = p035ru.unicorn.ujin.view.customViews.VerticalSchedulerView.STATUS.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6906x7884fb5 = r0
                int[] r0 = f6906x7884fb5     // Catch:{ NoSuchFieldError -> 0x0014 }
                ru.unicorn.ujin.view.customViews.VerticalSchedulerView$STATUS r1 = p035ru.unicorn.ujin.view.customViews.VerticalSchedulerView.STATUS.FIRST_LAUNCH     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f6906x7884fb5     // Catch:{ NoSuchFieldError -> 0x001f }
                ru.unicorn.ujin.view.customViews.VerticalSchedulerView$STATUS r1 = p035ru.unicorn.ujin.view.customViews.VerticalSchedulerView.STATUS.LOADING     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f6906x7884fb5     // Catch:{ NoSuchFieldError -> 0x002a }
                ru.unicorn.ujin.view.customViews.VerticalSchedulerView$STATUS r1 = p035ru.unicorn.ujin.view.customViews.VerticalSchedulerView.STATUS.ERROR     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.customViews.VerticalSchedulerView.C59681.<clinit>():void");
        }
    }

    private void drawCalendar(Canvas canvas, String str, String str2) {
        this.rectFakeLeft.set(-100.0f, (float) this.paddingTop, (float) dpToPx(20), (float) dpToPx(120));
        this.rectFakeRight.set((float) (getWidth() - dpToPx(20)), (float) this.paddingTop, (float) (getWidth() + 100), (float) dpToPx(120));
        RectF rectF2 = this.rectFakeLeft;
        int i = this.cornerRadius;
        canvas.drawRoundRect(rectF2, (float) i, (float) i, this.fakePaint);
        RectF rectF3 = this.rectFakeRight;
        int i2 = this.cornerRadius;
        canvas.drawRoundRect(rectF3, (float) i2, (float) i2, this.fakePaint);
        String formatDate = DateUtils.formatDate(Long.valueOf(this.calendar.getTimeInMillis()));
        String displayName = this.calendar.getDisplayName(7, 2, Locale.getDefault());
        this.calendarPaint.setColor(getResources().getColor(R.color.brandBackgroundSecondary));
        this.rectCalendar.set((float) this.paddingLeft, (float) this.paddingTop, (float) (getWidth() - this.paddingRight), (float) dpToPx(120));
        RectF rectF4 = this.rectCalendar;
        int i3 = this.cornerRadius;
        canvas.drawRoundRect(rectF4, (float) i3, (float) i3, this.calendarPaint);
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.ic_calendar);
        canvas.drawBitmap(decodeResource, this.rectCalendar.centerX() - ((float) (((long) decodeResource.getWidth()) / 2)), (this.rectCalendar.centerY() / 2.0f) - ((float) (((long) decodeResource.getHeight()) / 2)), this.calendarPaint);
        canvas.getClipBounds(this.f6905r2);
        this.calendarPaint.getTextBounds(formatDate, 0, formatDate.length(), this.f6905r2);
        this.calendarPaint.setColor(getResources().getColor(R.color.colorTitle));
        this.calendarPaint.setTextSize((float) spToPx(20.0f));
        canvas.drawText(formatDate, this.rectCalendar.centerX() - (this.calendarPaint.measureText(formatDate) / 2.0f), this.rectCalendar.centerY() + ((float) dpToPx(8)), this.calendarPaint);
        this.calendarPaint.getTextBounds(displayName, 0, displayName.length(), this.f6905r2);
        this.calendarPaint.setColor(getResources().getColor(R.color.brandTextSecondary));
        this.calendarPaint.setTextSize((float) spToPx(14.0f));
        canvas.drawText(displayName, this.rectCalendar.centerX() - (this.calendarPaint.measureText(displayName) / 2.0f), this.rectCalendar.centerY() + ((float) dpToPx(30)), this.calendarPaint);
    }

    private void drawText(Canvas canvas, String str) {
        canvas.getClipBounds(this.f6904r);
        this.paint.getTextBounds(str, 0, str.length(), this.f6904r);
        canvas.drawText(str, (float) (((this.widthScreen / 2) - (this.f6904r.centerX() / 2)) - this.paddingLeft), (float) (getHeight() / 3), this.paint);
    }

    private HourValue getFullDateData() {
        Pair<Long, Long> choosenPeriod = getChoosenPeriod(this.hourValueResult.hourValueList, true);
        String formatTime = DateUtils.formatTime(Long.valueOf(((Long) choosenPeriod.first).longValue() * 1000));
        String formatTime2 = DateUtils.formatTime(Long.valueOf(((Long) choosenPeriod.second).longValue() * 1000));
        return new HourValue(formatTime + " — " + formatTime2, true, "Свободно весь день");
    }

    private void drawFullDay(Canvas canvas) {
        this.rectF.set((float) this.paddingLeft, (float) this.startOffset, (float) (getWidth() - this.paddingRight), (float) (this.startOffset + this.itemHeight));
        drawKFakeFullDayLeft(canvas);
        drawKFakeFullDayRight(canvas);
    }

    private void drawKFakeFullDayLeft(Canvas canvas) {
        this.rectFakeLeft.set(-100.0f, (float) this.startOffset, (float) dpToPx(20), (float) (this.startOffset + this.itemHeight));
    }

    private void drawKFakeFullDayRight(Canvas canvas) {
        this.rectFakeRight.set((float) (getWidth() - dpToPx(20)), (float) this.startOffset, (float) (getWidth() + 100), (float) (this.startOffset + this.itemHeight));
    }

    private void setRectSettings(int i) {
        this.paint.setStrokeWidth((float) dpToPx(3));
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(i);
    }

    private void setTitleSettings(int i) {
        this.paint.setColor(i);
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setStrokeWidth((float) dpToPx(1));
        this.paint.setTextSize((float) spToPx(20.0f));
    }

    private void setSubtitleSettings(int i) {
        this.paint.setColor(i);
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setStrokeWidth((float) dpToPx(2));
        this.paint.setTextSize((float) spToPx(11.0f));
    }

    private void drawTitle(Canvas canvas, HourValue hourValue2) {
        canvas.getClipBounds(this.f6904r);
        this.paint.getTextBounds(hourValue2.title, 0, hourValue2.title.length(), this.f6904r);
        canvas.drawText(hourValue2.title, this.rectF.centerX() - ((float) (this.f6904r.width() / 2)), this.rectF.centerY(), this.paint);
    }

    private void drawSubTitle(Canvas canvas, HourValue hourValue2) {
        this.paint.getTextBounds(hourValue2.subtitle, 0, hourValue2.subtitle.length(), this.f6904r);
        canvas.drawText(hourValue2.subtitle, this.rectF.centerX() - ((float) (this.f6904r.width() / 2)), this.rectF.centerY() + ((float) (this.f6904r.height() * 2)), this.paint);
    }

    private int dpToPx(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    private int spToPx(float f) {
        return (int) TypedValue.applyDimension(2, f, getResources().getDisplayMetrics());
    }

    public void onDateChange(long j, boolean z, List<ISlots> list) {
        setDate(j, z, list);
        invalidate();
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.VerticalSchedulerView$HourValue */
    private static class HourValue {
        private boolean fullDayEmpty;
        /* access modifiers changed from: private */
        public boolean isEmpty;
        /* access modifiers changed from: private */
        public String subtitle;
        /* access modifiers changed from: private */
        public String title;

        HourValue(String str, boolean z, String str2) {
            this.title = str;
            this.isEmpty = z;
            this.subtitle = str2;
        }

        public static HourValueResult generateResult(long j, boolean z, List<ISlots> list) {
            int unused = VerticalSchedulerView.COUNT = list.size();
            Calendar instance = Calendar.getInstance();
            ArrayList arrayList = new ArrayList();
            Map hashMap = new HashMap();
            String str = "";
            int i = -1;
            boolean z2 = z;
            for (int i2 = 0; i2 < VerticalSchedulerView.COUNT; i2++) {
                boolean isSlotBusy = list.get(i2).isSlotBusy();
                instance.setTimeInMillis(list.get(i2).slotStart() * 1000);
                if (isSlotBusy) {
                    String access$400 = VerticalSchedulerView.cretarePattern(i2);
                    if (i == -1) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(i2));
                        hashMap.put(VerticalSchedulerView.cretarePattern(i2), arrayList2);
                        i = i2;
                    } else {
                        List list2 = (List) hashMap.get(str);
                        list2.add(Integer.valueOf(i2));
                        hashMap.remove(str);
                        access$400 = str + access$400;
                        hashMap.put(access$400, list2);
                    }
                    str = access$400;
                } else {
                    z2 = false;
                    i = -1;
                }
                String valueOf = String.valueOf(instance.get(11));
                if (valueOf.length() == 1) {
                    valueOf = "0" + valueOf;
                }
                instance.get(12);
                arrayList.add(new HourValue(valueOf + ":00", isSlotBusy, isSlotBusy ? "Свободно" : "Занято"));
                instance.add(11, 1);
            }
            if (z2) {
                hashMap = generateData();
            }
            return new HourValueResult(z2, arrayList, hashMap);
        }

        private static Map<String, List<Integer>> generateData() {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < VerticalSchedulerView.COUNT; i++) {
                arrayList.add(Integer.valueOf(i));
                sb.append("*");
                sb.append(i);
                sb.append("*");
            }
            hashMap.put(sb.toString(), arrayList);
            return hashMap;
        }

        /* renamed from: ru.unicorn.ujin.view.customViews.VerticalSchedulerView$HourValue$HourValueResult */
        private static class HourValueResult {
            Map<String, List<Integer>> data;
            boolean fullDayEmpty;
            List<HourValue> hourValueList;

            public HourValueResult(boolean z, List<HourValue> list, Map<String, List<Integer>> map) {
                this.fullDayEmpty = z;
                this.hourValueList = list;
                this.data = map;
            }
        }

        private static String upFirstChar(String str) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
    }

    /* access modifiers changed from: private */
    public static String cretarePattern(int i) {
        return "*" + i + "*";
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setiDateChoose(IDateChoose iDateChoose2) {
        this.iDateChoose = iDateChoose2;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.calendar.getTimeInMillis();
        System.currentTimeMillis();
        long days = TimeUnit.MILLISECONDS.toDays(toCalendar(i, i2, i3).getTimeInMillis() - toCalendar(System.currentTimeMillis()).getTimeInMillis());
        Log.d("TAG", "XXX PS " + days);
        this.iDateChoose.onChangeFormCalendar((int) days);
    }

    private Calendar toCalendar(int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2, i3);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance;
    }

    private Calendar toCalendar(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance;
    }
}
