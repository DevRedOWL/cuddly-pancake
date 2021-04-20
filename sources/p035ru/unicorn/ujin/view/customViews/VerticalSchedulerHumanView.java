package p035ru.unicorn.ujin.view.customViews;

import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.widget.DatePicker;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.TimeSlotHuman;

/* renamed from: ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView */
public class VerticalSchedulerHumanView extends View implements DatePickerDialog.OnDateSetListener {
    private static int COUNT = 1;
    private Calendar calendar;
    private Paint calendarPaint;
    int colorAvailableFree;
    int colorChoosen;
    int colorEmpty;
    int colorUnavailableFree;
    private int cornerRadius;
    private String currentDate;
    private STATUS currentState;
    private Map<String, List<Integer>> data;
    private Paint fakePaint;
    boolean fullDayIsActivate = false;
    private IDateChoose iDateChoose;
    private List<IHumanSlots> iHumanSlotsList;
    private List<IHumanSlots> iHumanSlotsListResult;
    private String iii = "";
    private boolean isAllDayFree;
    private int itemHeight;
    private int itemWidth;
    private int paddingBottom;
    private int paddingCenter;
    private int paddingLeft;
    private int paddingRight;
    private int paddingTop;
    private Paint paint;

    /* renamed from: r */
    private Rect f6901r = new Rect();

    /* renamed from: r2 */
    private Rect f6902r2 = new Rect();
    private RectF rectCalendar;
    private RectF rectF;
    private RectF rectFakeLeft;
    private RectF rectFakeRight;
    private Set<Integer> reserveHour;
    private int startOffset;
    int textColorAvailable;
    int textColorChoosen;
    int textColorUnavailable;
    private String weekDay;
    private int widthScreen;

    /* renamed from: ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView$IDateChoose */
    public interface IDateChoose {
        void onChangeFormCalendar(Calendar calendar);

        void onDateChoose(Pair<String, String> pair);
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView$IHumanSlots */
    public interface IHumanSlots {
        boolean isSlotBusy();

        TimeSlotHuman slotFinishHuman();

        TimeSlotHuman slotStartHuman();
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView$STATUS */
    public enum STATUS {
        LOADING,
        ERROR,
        SUCCESS,
        FIRST_LAUNCH
    }

    public void setiDateChoose(IDateChoose iDateChoose2) {
        this.iDateChoose = iDateChoose2;
    }

    public VerticalSchedulerHumanView(Context context, String str) {
        super(context);
        this.currentDate = str;
        this.calendar = Calendar.getInstance();
        this.weekDay = this.calendar.getDisplayName(7, 2, Locale.getDefault());
        init();
    }

    public void setHumanSlotsList(List<IHumanSlots> list, boolean z, String str) {
        this.iHumanSlotsList = list;
        this.isAllDayFree = z;
        this.currentDate = str;
        COUNT = list.size();
        this.data = initMagic();
        requestLayout();
        invalidate();
    }

    private Map<String, List<Integer>> initMagic() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < COUNT; i++) {
            arrayList.add(Integer.valueOf(i));
            sb.append("*");
            sb.append(i);
            sb.append("*");
        }
        hashMap.put(sb.toString(), arrayList);
        return hashMap;
    }

    public void setDate(long j, boolean z, List<IHumanSlots> list) {
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
        this.iHumanSlotsListResult = new ArrayList();
        this.reserveHour = new HashSet();
        this.currentState = STATUS.FIRST_LAUNCH;
        this.fullDayIsActivate = false;
        this.colorAvailableFree = ContextCompat.getColor(getContext(), R.color.colorAvailableFree);
        this.colorUnavailableFree = ContextCompat.getColor(getContext(), R.color.colorUnavailableFree);
        this.colorChoosen = ContextCompat.getColor(getContext(), R.color.colorChoosen);
        this.colorEmpty = ContextCompat.getColor(getContext(), R.color.colorEmpty);
        this.textColorChoosen = ContextCompat.getColor(getContext(), R.color.textColorChoosen);
        this.textColorAvailable = ContextCompat.getColor(getContext(), R.color.textColorAvailable);
        this.textColorUnavailable = ContextCompat.getColor(getContext(), R.color.textColorUnavailable);
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

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x016c, code lost:
        if (r14.reserveHour.contains(java.lang.Integer.valueOf(r0 + 1)) != false) goto L_0x016e;
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
            goto L_0x018b
        L_0x00a0:
            java.util.List<ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView$IHumanSlots> r1 = r14.iHumanSlotsList
            if (r1 == 0) goto L_0x00c9
            boolean r1 = r14.isAllDayFree
            if (r1 == 0) goto L_0x00c9
            int r1 = r15.getAction()
            if (r1 != r6) goto L_0x00c9
            if (r0 == 0) goto L_0x00b2
            if (r0 != r6) goto L_0x00b7
        L_0x00b2:
            boolean r1 = r14.fullDayIsActivate
            r1 = r1 ^ r6
            r14.fullDayIsActivate = r1
        L_0x00b7:
            int r0 = r0 + -2
            ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView$IDateChoose r1 = r14.iDateChoose
            if (r1 == 0) goto L_0x00c6
            android.util.Pair r1 = r14.getPeriod()
            ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView$IDateChoose r2 = r14.iDateChoose
            r2.onDateChoose(r1)
        L_0x00c6:
            r14.invalidate()
        L_0x00c9:
            int r1 = COUNT
            int r1 = r1 - r6
            if (r0 > r1) goto L_0x018b
            if (r0 < 0) goto L_0x018b
            boolean r1 = r14.fullDayIsActivate
            if (r1 != 0) goto L_0x018b
            int r1 = r15.getAction()
            if (r1 != r6) goto L_0x018b
            java.util.List<ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView$IHumanSlots> r1 = r14.iHumanSlotsList
            if (r1 == 0) goto L_0x00ea
            java.lang.Object r1 = r1.get(r0)
            ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView$IHumanSlots r1 = (p035ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView.IHumanSlots) r1
            boolean r1 = r1.isSlotBusy()
            if (r1 == 0) goto L_0x00eb
        L_0x00ea:
            r5 = 1
        L_0x00eb:
            if (r5 == 0) goto L_0x018b
            java.util.Set<java.lang.Integer> r1 = r14.reserveHour
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x012e
            java.util.Set<java.lang.Integer> r1 = r14.reserveHour
            int r2 = r0 + -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0124
            java.util.Set<java.lang.Integer> r1 = r14.reserveHour
            int r2 = r0 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0124
            java.util.Set<java.lang.Integer> r1 = r14.reserveHour
            r1.clear()
            java.util.Set<java.lang.Integer> r1 = r14.reserveHour
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.add(r0)
            goto L_0x0177
        L_0x0124:
            java.util.Set<java.lang.Integer> r1 = r14.reserveHour
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.remove(r0)
            goto L_0x0177
        L_0x012e:
            java.util.Set<java.lang.Integer> r1 = r14.reserveHour
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x016e
            java.lang.String r1 = r14.iii
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "*"
            r2.append(r3)
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0177
            java.util.Set<java.lang.Integer> r1 = r14.reserveHour
            int r2 = r0 + -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x016e
            java.util.Set<java.lang.Integer> r1 = r14.reserveHour
            int r2 = r0 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0177
        L_0x016e:
            java.util.Set<java.lang.Integer> r1 = r14.reserveHour
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.add(r0)
        L_0x0177:
            ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView$IDateChoose r0 = r14.iDateChoose
            if (r0 == 0) goto L_0x0188
            java.util.Set<java.lang.Integer> r0 = r14.reserveHour
            if (r0 == 0) goto L_0x0188
            android.util.Pair r0 = r14.getPeriod()
            ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView$IDateChoose r1 = r14.iDateChoose
            r1.onDateChoose(r0)
        L_0x0188:
            r14.invalidate()
        L_0x018b:
            boolean r15 = super.dispatchTouchEvent(r15)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    private Pair<String, String> getPeriod() {
        if (this.fullDayIsActivate) {
            int size = this.iHumanSlotsList.size();
            String realmGet$time = this.iHumanSlotsList.get(0).slotStartHuman().realmGet$startValue().realmGet$time();
            String str = this.iHumanSlotsList.get(0).slotStartHuman().realmGet$startValue().realmGet$date() + " " + realmGet$time;
            int i = size - 1;
            String realmGet$time2 = this.iHumanSlotsList.get(i).slotStartHuman().realmGet$finishValue().realmGet$time();
            return new Pair<>(str, this.iHumanSlotsList.get(i).slotStartHuman().realmGet$finishValue().realmGet$date() + " " + realmGet$time2);
        }
        List<IHumanSlots> list = this.iHumanSlotsList;
        if (list == null || list.isEmpty() || this.reserveHour.isEmpty()) {
            return new Pair<>("", "");
        }
        int intValue = ((Integer) Collections.min(this.reserveHour)).intValue();
        int intValue2 = ((Integer) Collections.max(this.reserveHour)).intValue();
        String realmGet$time3 = this.iHumanSlotsList.get(intValue).slotStartHuman().realmGet$startValue().realmGet$time();
        String str2 = this.iHumanSlotsList.get(intValue).slotStartHuman().realmGet$startValue().realmGet$date() + " " + realmGet$time3;
        String realmGet$time4 = this.iHumanSlotsList.get(intValue2).slotStartHuman().realmGet$finishValue().realmGet$time();
        return new Pair<>(str2, this.iHumanSlotsList.get(intValue2).slotStartHuman().realmGet$finishValue().realmGet$date() + " " + realmGet$time4);
    }

    private Pair<Long, Long> getChoosenPeriod(List<IHumanSlots> list, boolean z) {
        long j;
        Set<Integer> set;
        if (list.size() != 0) {
            list.size();
        }
        if ((!z || list == null || list.isEmpty()) && (set = this.reserveHour) != null && !set.isEmpty()) {
            Integer num = (Integer) Collections.min(this.reserveHour);
            Integer num2 = (Integer) Collections.max(this.reserveHour);
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(0);
            instance.set(12, 59);
            instance.set(13, 59);
            j = instance.getTimeInMillis() / 1000;
        } else {
            j = 0;
        }
        return new Pair<>(0L, Long.valueOf(j));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = (this.itemHeight * 7) + this.paddingTop + this.paddingBottom + (COUNT * this.paddingCenter);
        if (this.iHumanSlotsList != null && this.iHumanSlotsListResult.isEmpty()) {
            i3 += this.itemHeight + this.paddingCenter;
        }
        setMeasuredDimension(this.widthScreen, dpToPx(110) + this.paddingTop + this.paddingBottom + i3);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        List<IHumanSlots> list = this.iHumanSlotsList;
        if ((list == null || list.isEmpty()) && this.currentState != STATUS.SUCCESS) {
            int i = C59671.f6903xd54ced00[this.currentState.ordinal()];
            String str = (i == 1 || i == 2) ? "Загрузка..." : i != 3 ? "" : "Ошибка";
            setTitleSettings(this.textColorChoosen);
            drawText(canvas, str);
            return;
        }
        drawCalendar(canvas);
        this.startOffset = this.paddingTop + dpToPx(120) + this.paddingBottom;
        drawAllDayItem(canvas);
        initItemsLogic();
        drawHourItems(canvas);
        this.startOffset = this.paddingTop + dpToPx(120) + this.paddingBottom;
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView$1 */
    static /* synthetic */ class C59671 {

        /* renamed from: $SwitchMap$ru$unicorn$ujin$view$customViews$VerticalSchedulerHumanView$STATUS */
        static final /* synthetic */ int[] f6903xd54ced00 = new int[STATUS.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView$STATUS[] r0 = p035ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView.STATUS.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6903xd54ced00 = r0
                int[] r0 = f6903xd54ced00     // Catch:{ NoSuchFieldError -> 0x0014 }
                ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView$STATUS r1 = p035ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView.STATUS.FIRST_LAUNCH     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f6903xd54ced00     // Catch:{ NoSuchFieldError -> 0x001f }
                ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView$STATUS r1 = p035ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView.STATUS.LOADING     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f6903xd54ced00     // Catch:{ NoSuchFieldError -> 0x002a }
                ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView$STATUS r1 = p035ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView.STATUS.ERROR     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView.C59671.<clinit>():void");
        }
    }

    private void initItemsLogic() {
        if (!this.reserveHour.isEmpty()) {
            for (String next : this.data.keySet()) {
                Set<Integer> set = this.reserveHour;
                if (next.contains("*" + ((Integer[]) set.toArray(new Integer[set.size()]))[0] + "*")) {
                    this.iii = next;
                    return;
                }
            }
        }
    }

    private void drawHourItems(Canvas canvas) {
        List<IHumanSlots> list = this.iHumanSlotsList;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < this.iHumanSlotsList.size(); i++) {
                int i2 = this.textColorAvailable;
                if (this.fullDayIsActivate) {
                    setRectSettings(this.colorUnavailableFree);
                    this.reserveHour.clear();
                } else if (this.reserveHour.isEmpty() || !this.iHumanSlotsList.get(i).isSlotBusy()) {
                    setRectSettings(this.iHumanSlotsList.get(i).isSlotBusy() ? this.colorAvailableFree : this.colorEmpty);
                    i2 = this.textColorAvailable;
                } else if (this.reserveHour.contains(Integer.valueOf(i))) {
                    i2 = this.textColorChoosen;
                    setRectSettings(this.colorChoosen);
                } else if (this.reserveHour.contains(Integer.valueOf(i + 1)) || this.reserveHour.contains(Integer.valueOf(i - 1))) {
                    setRectSettings(this.colorAvailableFree);
                } else if (this.iii.contains(cretarePattern(i))) {
                    i2 = this.textColorUnavailable;
                    setRectSettings(this.colorUnavailableFree);
                } else {
                    i2 = this.textColorUnavailable;
                    setRectSettings(this.iHumanSlotsList.get(i).isSlotBusy() ? this.colorUnavailableFree : this.colorEmpty);
                }
                if (i % 2 == 0) {
                    RectF rectF2 = this.rectF;
                    int i3 = this.paddingLeft;
                    int i4 = this.startOffset;
                    rectF2.set((float) i3, (float) i4, (float) (i3 + this.itemWidth), (float) (i4 + this.itemHeight));
                } else {
                    this.rectF.set((float) ((getWidth() - this.itemWidth) - this.paddingRight), (float) this.startOffset, (float) (getWidth() - this.paddingRight), (float) (this.startOffset + this.itemHeight));
                    this.startOffset += this.itemHeight + this.paddingCenter;
                }
                RectF rectF3 = this.rectF;
                int i5 = this.cornerRadius;
                canvas.drawRoundRect(rectF3, (float) i5, (float) i5, this.paint);
                setTitleSettings(i2);
                drawTitle(canvas, this.iHumanSlotsList.get(i));
                setSubtitleSettings(i2);
                drawSubTitle(canvas, this.iHumanSlotsList.get(i));
                drawKFakeFullDayLeft(canvas);
                drawKFakeFullDayRight(canvas);
                RectF rectF4 = this.rectFakeLeft;
                int i6 = this.cornerRadius;
                canvas.drawRoundRect(rectF4, (float) i6, (float) i6, this.fakePaint);
                RectF rectF5 = this.rectFakeRight;
                int i7 = this.cornerRadius;
                canvas.drawRoundRect(rectF5, (float) i7, (float) i7, this.fakePaint);
            }
        }
    }

    private void drawSubTitle(Canvas canvas, IHumanSlots iHumanSlots) {
        String string = getContext().getString(iHumanSlots.isSlotBusy() ? R.string.label_free : R.string.label_not_free);
        this.paint.getTextBounds(string, 0, string.length(), this.f6901r);
        canvas.drawText(string, this.rectF.centerX() - ((float) (this.f6901r.width() / 2)), this.rectF.centerY() + ((float) (this.f6901r.height() * 2)), this.paint);
    }

    private void drawTitle(Canvas canvas, IHumanSlots iHumanSlots) {
        String str = iHumanSlots.slotStartHuman().realmGet$startValue().realmGet$time() + " - " + iHumanSlots.slotStartHuman().realmGet$finishValue().realmGet$time();
        canvas.getClipBounds(this.f6901r);
        this.paint.getTextBounds(str, 0, str.length(), this.f6901r);
        canvas.drawText(str, this.rectF.centerX() - ((float) (this.f6901r.width() / 2)), this.rectF.centerY(), this.paint);
    }

    private void drawAllDayItem(Canvas canvas) {
        if (this.isAllDayFree) {
            setRectSettings(this.fullDayIsActivate ? this.colorChoosen : this.colorAvailableFree);
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
            String fullDateData = getFullDateData();
            setTitleSettings(this.fullDayIsActivate ? this.textColorChoosen : this.textColorAvailable);
            drawTitle(canvas, fullDateData);
            setSubtitleSettings(this.fullDayIsActivate ? this.textColorChoosen : this.textColorAvailable);
            drawSubTitle(canvas, getContext().getString(R.string.label_all_day_free));
            this.startOffset += this.itemHeight + this.paddingCenter;
        }
    }

    private void drawCalendar(Canvas canvas) {
        this.rectFakeLeft.set(-100.0f, (float) this.paddingTop, (float) dpToPx(20), (float) dpToPx(120));
        this.rectFakeRight.set((float) (getWidth() - dpToPx(20)), (float) this.paddingTop, (float) (getWidth() + 100), (float) dpToPx(120));
        RectF rectF2 = this.rectFakeLeft;
        int i = this.cornerRadius;
        canvas.drawRoundRect(rectF2, (float) i, (float) i, this.fakePaint);
        RectF rectF3 = this.rectFakeRight;
        int i2 = this.cornerRadius;
        canvas.drawRoundRect(rectF3, (float) i2, (float) i2, this.fakePaint);
        String realmGet$date = this.iHumanSlotsList.get(0).slotStartHuman().realmGet$startValue().realmGet$date();
        String realmGet$weekDay = this.iHumanSlotsList.get(0).slotStartHuman().realmGet$startValue().realmGet$weekDay();
        this.calendarPaint.setColor(getResources().getColor(R.color.brandBackgroundSecondary));
        this.rectCalendar.set((float) this.paddingLeft, (float) this.paddingTop, (float) (getWidth() - this.paddingRight), (float) dpToPx(120));
        RectF rectF4 = this.rectCalendar;
        int i3 = this.cornerRadius;
        canvas.drawRoundRect(rectF4, (float) i3, (float) i3, this.calendarPaint);
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.ic_calendar);
        canvas.drawBitmap(decodeResource, this.rectCalendar.centerX() - ((float) (((long) decodeResource.getWidth()) / 2)), (this.rectCalendar.centerY() / 2.0f) - ((float) (((long) decodeResource.getHeight()) / 2)), this.calendarPaint);
        canvas.getClipBounds(this.f6902r2);
        this.calendarPaint.getTextBounds(realmGet$date, 0, realmGet$date.length(), this.f6902r2);
        this.calendarPaint.setColor(getResources().getColor(R.color.colorTitle));
        this.calendarPaint.setTextSize((float) spToPx(20.0f));
        canvas.drawText(realmGet$date, this.rectCalendar.centerX() - (this.calendarPaint.measureText(realmGet$date) / 2.0f), this.rectCalendar.centerY() + ((float) dpToPx(8)), this.calendarPaint);
        this.calendarPaint.getTextBounds(realmGet$weekDay, 0, realmGet$weekDay.length(), this.f6902r2);
        this.calendarPaint.setColor(getResources().getColor(R.color.brandTextSecondary));
        this.calendarPaint.setTextSize((float) spToPx(14.0f));
        canvas.drawText(realmGet$weekDay, this.rectCalendar.centerX() - (this.calendarPaint.measureText(realmGet$weekDay) / 2.0f), this.rectCalendar.centerY() + ((float) dpToPx(30)), this.calendarPaint);
    }

    private void drawText(Canvas canvas, String str) {
        canvas.getClipBounds(this.f6901r);
        this.paint.getTextBounds(str, 0, str.length(), this.f6901r);
        canvas.drawText(str, (float) (((this.widthScreen / 2) - (this.f6901r.centerX() / 2)) - this.paddingLeft), (float) (getHeight() / 3), this.paint);
    }

    private String getFullDateData() {
        List<IHumanSlots> list = this.iHumanSlotsList;
        if (list == null || list.isEmpty()) {
            return "";
        }
        int size = this.iHumanSlotsList.size();
        String realmGet$time = this.iHumanSlotsList.get(0).slotStartHuman().realmGet$startValue().realmGet$time();
        String realmGet$time2 = this.iHumanSlotsList.get(size - 1).slotStartHuman().realmGet$finishValue().realmGet$time();
        return realmGet$time + " — " + realmGet$time2;
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

    private void drawTitle(Canvas canvas, String str) {
        canvas.getClipBounds(this.f6901r);
        this.paint.getTextBounds(str, 0, str.length(), this.f6901r);
        canvas.drawText(str, this.rectF.centerX() - ((float) (this.f6901r.width() / 2)), this.rectF.centerY(), this.paint);
    }

    private void drawSubTitle(Canvas canvas, String str) {
        this.paint.getTextBounds(str, 0, str.length(), this.f6901r);
        canvas.drawText(str, this.rectF.centerX() - ((float) (this.f6901r.width() / 2)), this.rectF.centerY() + ((float) (this.f6901r.height() * 2)), this.paint);
    }

    private int dpToPx(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    private int spToPx(float f) {
        return (int) TypedValue.applyDimension(2, f, getResources().getDisplayMetrics());
    }

    public void onDateChange(String str, boolean z, List<IHumanSlots> list) {
        setHumanSlotsList(list, this.isAllDayFree, str);
        invalidate();
    }

    private static String cretarePattern(int i) {
        return "*" + i + "*";
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2, i3);
        this.reserveHour.clear();
        this.iDateChoose.onChangeFormCalendar(instance);
    }
}
