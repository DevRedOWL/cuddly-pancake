package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p035ru.unicorn.ujin.util.DateUtils;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.MyCustomFormatter */
class MyCustomFormatter extends ValueFormatter {
    private List<Entry> entries;
    private int type;

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.MyCustomFormatter$MONTH */
    enum MONTH {
        JAN(0, "Январь", "Янв"),
        FEB(1, "Февраль", "Фев"),
        MAR(2, "Март", "Мар"),
        APR(3, "Апрель", "Апр"),
        MAY(4, "Май", "Май"),
        JUN(5, "Июнь", "Июн"),
        JUL(6, "Июль", "Июл"),
        AUG(7, "Август", "Авг"),
        SEM(8, "Сентябрь", "Сен"),
        OCT(9, "Октябрь", "Окт"),
        NOV(10, "Ноябрь", "Ноя"),
        DEC(11, "Декабрь", "Дек");
        
        private static final Map<Integer, MONTH> MAP_MONTH = null;
        private final int key;
        private final String longName;
        private final String shortName;

        static {
            int i;
            MAP_MONTH = new HashMap();
            for (MONTH month : values()) {
                MAP_MONTH.put(Integer.valueOf(month.getKey()), month);
            }
        }

        public String getLongName() {
            return this.longName;
        }

        public String getShortName() {
            return this.shortName;
        }

        public int getKey() {
            return this.key;
        }

        private MONTH(int i, String str, String str2) {
            this.key = i;
            this.longName = str;
            this.shortName = str2;
        }

        public static MONTH getByValue(int i) {
            return MAP_MONTH.get(Integer.valueOf(i));
        }
    }

    MyCustomFormatter(int i, List<Entry> list) {
        this.type = i;
        this.entries = list;
    }

    public String getFormattedValue(float f) {
        long millis = TimeUnit.HOURS.toMillis((long) f);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(millis);
        int i = this.type;
        if (i == 1) {
            return DateUtils.formatDateShort(new Date(DateUtils.getLastDayOfMonthWeek(millis).getTimeInMillis()));
        }
        if (i == 2) {
            return MONTH.getByValue(instance.get(2)).getLongName();
        }
        if (i != 3) {
            return DateUtils.formatDateShort(new Date(millis));
        }
        return MONTH.getByValue(instance.get(2)).getShortName();
    }

    public String getAxisLabel(float f, AxisBase axisBase) {
        float f2 = f;
        for (int i = 0; i < axisBase.mEntries.length; i++) {
            if (axisBase.mEntries[i] == f && this.entries.size() > i) {
                f2 = this.entries.get(i).getX();
            }
        }
        return getFormattedValue(f2);
    }
}
