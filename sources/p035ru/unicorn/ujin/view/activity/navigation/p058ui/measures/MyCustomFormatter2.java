package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures.MyCustomFormatter;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.MyCustomFormatter2 */
public class MyCustomFormatter2 {
    private int type;

    MyCustomFormatter2(int i) {
        this.type = i;
    }

    public String getFormattedValue(long j) {
        long millis = TimeUnit.HOURS.toMillis(j);
        Calendar instance = Calendar.getInstance(Locale.getDefault());
        instance.setTimeInMillis(millis);
        int i = this.type;
        if (i == 1) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yy");
            return simpleDateFormat.format(new Date(millis)) + " - " + simpleDateFormat.format(new Date(DateUtils.getLastDayOfMonthWeek(millis).getTimeInMillis()));
        } else if (i == 2 || i == 3) {
            return MyCustomFormatter.MONTH.getByValue(instance.get(2)).getLongName() + " " + instance.get(1) + " г.";
        } else {
            return DateUtils.formatDate(new Date(millis)) + " г.";
        }
    }
}
