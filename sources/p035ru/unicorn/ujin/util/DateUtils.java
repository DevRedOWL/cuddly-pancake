package p035ru.unicorn.ujin.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p035ru.unicorn.ujin.view.customViews.dynamic.DatePickerViewHolder;

/* renamed from: ru.unicorn.ujin.util.DateUtils */
public class DateUtils {
    private static final SimpleDateFormat DD_MM = new SimpleDateFormat("dd.MM", Locale.getDefault());
    private static final SimpleDateFormat DD_MM_YYYY = new SimpleDateFormat(DatePickerViewHolder.DATE_FORMAT, Locale.getDefault());
    private static final SimpleDateFormat HH_MM = new SimpleDateFormat("HH:mm", Locale.getDefault());
    private static final SimpleDateFormat YYYY_MM_DD = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    public static final SimpleDateFormat YYYY_MM_DD_HH_MM = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());

    public static Date formatDateFromString(String str) {
        try {
            return DD_MM_YYYY.parse(str);
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String formatDate(Date date) {
        return DD_MM_YYYY.format(date);
    }

    public static String formatDate(Long l) {
        return DD_MM_YYYY.format(new Date(l.longValue()));
    }

    public static String formatDateYYYYMMDD_HH_mm(long j) {
        return YYYY_MM_DD_HH_MM.format(new Date(j));
    }

    public static String formatDateYYYYMMDD(Date date) {
        return YYYY_MM_DD.format(date);
    }

    public static String formatDateShort(Date date) {
        return DD_MM.format(date);
    }

    public static String formatDateShort(long j) {
        return formatDateShort(new Date(j));
    }

    public static String formatTime(Long l) {
        return HH_MM.format(new Date(l.longValue()));
    }

    public static String formatTimeDate(long j) {
        return formatTime(Long.valueOf(j)) + " " + formatDate(Long.valueOf(j));
    }

    public static boolean isSameDate(Calendar calendar, Calendar calendar2) {
        return isSameMonth(calendar, calendar2) && calendar.get(5) == calendar2.get(5);
    }

    public static boolean isSameMonth(Calendar calendar, Calendar calendar2) {
        int i = calendar.get(2);
        if (calendar.get(1) == calendar2.get(1) && i == calendar2.get(2)) {
            return true;
        }
        return false;
    }

    public static boolean isSameDate(Calendar calendar, Long l) {
        if (l == null) {
            return true;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(l.longValue());
        return isSameDate(calendar, instance);
    }

    public static boolean isPastDate(Calendar calendar) {
        Calendar instance = Calendar.getInstance();
        int i = calendar.get(6);
        int i2 = calendar.get(1);
        if (i2 < instance.get(1)) {
            return true;
        }
        if (i2 != instance.get(1) || i >= instance.get(6)) {
            return false;
        }
        return true;
    }

    public static Calendar parseDate(String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.getDefault());
        Calendar instance = Calendar.getInstance();
        try {
            instance.setTime(simpleDateFormat.parse(str));
            return instance;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Calendar parseTime(String str) {
        Calendar instance = Calendar.getInstance();
        try {
            instance.setTime(HH_MM.parse(str));
            return instance;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getMonthPeriodByCurrentTime(Long l) {
        String str;
        Calendar instance = Calendar.getInstance(Locale.getDefault());
        instance.setTimeInMillis(l.longValue());
        String[] strArr = {"Января", "Февраля", "Марта", "Апреля", "Мая", "Июня", "Июля", "Августа", "Сентября", "Октября", "Ноября", "Декабря"};
        String str2 = strArr[instance.get(2)];
        if (Calendar.getInstance().get(2) == instance.get(2) && Calendar.getInstance().get(1) == Calendar.getInstance().get(1)) {
            instance = Calendar.getInstance();
            str = "" + instance.get(5) + " " + strArr[instance.get(2)] + " " + instance.get(1);
        } else {
            instance.set(5, instance.getActualMaximum(5));
            str = "" + instance.get(5) + " " + strArr[instance.get(2)] + " " + instance.get(1);
        }
        instance.set(5, 1);
        return (instance.get(5) + " " + strArr[instance.get(2)] + " - ") + str;
    }

    public static String getDecadePeriodByCurrentTime(Long l) {
        String str;
        Calendar instance = Calendar.getInstance(Locale.getDefault());
        instance.setTimeInMillis(l.longValue());
        String[] strArr = {"Января", "Февраля", "Марта", "Апреля", "Мая", "Июня", "Июля", "Августа", "Сентября", "Октября", "Ноября", "Декабря"};
        if (Math.abs(Calendar.getInstance().get(2) - instance.get(2)) >= 3 || Calendar.getInstance().get(1) != instance.get(1)) {
            if (instance.get(2) < 3) {
                instance.set(2, 2);
                instance.set(5, 31);
            } else if (instance.get(2) < 7) {
                instance.set(2, 5);
                instance.set(5, 30);
            } else if (instance.get(2) < 8) {
                instance.set(2, 8);
                instance.set(5, 30);
            } else {
                instance.set(2, 11);
                instance.set(5, 31);
            }
            str = " - " + instance.get(5) + " " + strArr[instance.get(2)] + " " + instance.get(1);
        } else {
            instance = Calendar.getInstance();
            str = " - " + instance.get(5) + " " + strArr[instance.get(2)] + " " + instance.get(1);
        }
        if (instance.get(2) < 3) {
            instance.set(2, 0);
            instance.set(5, 1);
        } else if (instance.get(2) < 6) {
            instance.set(2, 3);
            instance.set(5, 1);
        } else if (instance.get(2) < 9) {
            instance.set(2, 6);
            instance.set(5, 1);
        } else {
            instance.set(2, 9);
            instance.set(5, 1);
        }
        return ("" + instance.get(5) + " " + strArr[instance.get(2)]) + str;
    }

    public static String getWeekPeriodByCurrentTime(long j) {
        String str;
        Calendar instance = Calendar.getInstance(Locale.getDefault());
        instance.setTimeInMillis(j);
        String[] strArr = {"Января", "Февраля", "Марта", "Апреля", "Мая", "Июня", "Июля", "Августа", "Сентября", "Октября", "Ноября", "Декабря"};
        if (Calendar.getInstance().get(3) == instance.get(3) && Calendar.getInstance().get(1) == instance.get(1)) {
            Calendar instance2 = Calendar.getInstance();
            str = "" + instance2.get(5) + " " + strArr[instance2.get(2)] + " " + instance2.get(1);
        } else {
            instance.set(7, 1);
            str = "" + instance.get(5) + " " + strArr[instance.get(2)] + " " + instance.get(1);
        }
        instance.set(7, 2);
        return (instance.get(5) + " " + strArr[instance.get(2)] + " - ") + str;
    }

    public static long getRollWeekField(int i, boolean z, Long l, int i2, boolean z2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(l.longValue());
        if (Calendar.getInstance().get(3) == instance.get(3) && Calendar.getInstance().get(1) == instance.get(1)) {
            if (!z) {
                i2 = -i2;
            }
            instance.add(i, i2);
            if (z2) {
                instance.set(7, 2);
            } else {
                instance.set(7, 1);
            }
        } else {
            if (!z) {
                i2 = -i2;
            }
            instance.add(i, i2);
            if (z2) {
                instance.set(7, 2);
            } else {
                instance.set(7, 1);
                if (instance.getTimeInMillis() > Calendar.getInstance().getTimeInMillis()) {
                    instance = Calendar.getInstance();
                }
            }
        }
        return instance.getTimeInMillis();
    }

    public static long getRollYeahField(int i, boolean z, Long l, int i2, boolean z2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(l.longValue());
        if (!z) {
            i2 = -i2;
        }
        instance.add(i, i2);
        if (Calendar.getInstance().get(1) == instance.get(1)) {
            if (z2) {
                instance.set(instance.get(1), 0, 1, 0, 0, 0);
            } else {
                instance = Calendar.getInstance();
            }
        } else if (z2) {
            instance.set(instance.get(1), 0, 1, 0, 0, 0);
        } else {
            instance.set(instance.get(1), 11, 31, 0, 0, 0);
        }
        if (Calendar.getInstance().getTimeInMillis() < instance.getTimeInMillis()) {
            instance = Calendar.getInstance();
        }
        return instance.getTimeInMillis();
    }

    public static long getRollMonthField(int i, boolean z, Long l, int i2, boolean z2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(l.longValue());
        if (!z) {
            i2 = -i2;
        }
        instance.add(i, i2);
        if (Calendar.getInstance().get(2) == instance.get(2) && Calendar.getInstance().get(1) == Calendar.getInstance().get(1)) {
            if (z2) {
                instance.set(5, 1);
            } else {
                instance.set(5, instance.getActualMaximum(5));
                if (instance.getTimeInMillis() > Calendar.getInstance().getTimeInMillis()) {
                    instance = Calendar.getInstance();
                }
            }
        } else if (z2) {
            instance.set(5, 1);
        } else {
            instance.set(5, instance.getActualMaximum(5));
            if (instance.getTimeInMillis() > Calendar.getInstance().getTimeInMillis()) {
                instance = Calendar.getInstance();
            }
        }
        return instance.getTimeInMillis();
    }

    public static long getRollDecadeField(int i, boolean z, Long l, int i2, boolean z2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(l.longValue());
        if (!z) {
            i2 = -i2;
        }
        instance.add(i, i2);
        int i3 = 31;
        int i4 = 3;
        int i5 = 1;
        if (instance.get(2) < 3) {
            instance.set(2, z2 ? 0 : 2);
            if (z2) {
                i3 = 1;
            }
            instance.set(5, i3);
        } else {
            int i6 = 6;
            if (instance.get(2) < 6) {
                if (!z2) {
                    i4 = 5;
                }
                instance.set(2, i4);
                if (!z2) {
                    i5 = 30;
                }
                instance.set(5, i5);
            } else {
                int i7 = 9;
                if (instance.get(2) < 9) {
                    if (!z2) {
                        i6 = 8;
                    }
                    instance.set(2, i6);
                    if (!z2) {
                        i5 = 30;
                    }
                    instance.set(5, i5);
                } else {
                    if (!z2) {
                        i7 = 11;
                    }
                    instance.set(2, i7);
                    if (z2) {
                        i3 = 1;
                    }
                    instance.set(5, i3);
                }
            }
        }
        if (instance.getTimeInMillis() > Calendar.getInstance().getTimeInMillis() && !z2) {
            instance = Calendar.getInstance();
        }
        return instance.getTimeInMillis();
    }

    public static long getRollField(int i, boolean z, Long l, int i2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(l.longValue());
        if (!z) {
            i2 = -i2;
        }
        instance.add(i, i2);
        return instance.getTimeInMillis();
    }

    public static String getYearhPeriod(Long l) {
        String str;
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(l.longValue());
        String[] strArr = {"Января", "Февраля", "Марта", "Апреля", "Мая", "Июня", "Июля", "Августа", "Сентября", "Октября", "Ноября", "Декабря"};
        if (Calendar.getInstance().get(1) == instance.get(1)) {
            instance = Calendar.getInstance();
            str = " - " + instance.get(5) + " " + strArr[instance.get(2)] + " " + instance.get(1);
        } else {
            instance.set(instance.get(1), 11, 31);
            str = " - " + instance.get(5) + " " + strArr[instance.get(2)] + " " + instance.get(1);
        }
        instance.set(instance.get(1), 0, 1, 0, 0);
        return ("" + instance.get(5) + " " + strArr[instance.get(2)] + " " + instance.get(1)) + str;
    }

    public static Long getTimeByField(Long l, int i, int i2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(l.longValue());
        if (i2 == -1) {
            i2 = instance.getActualMaximum(i);
        }
        instance.set(i, i2);
        return Long.valueOf(instance.getTimeInMillis());
    }

    public static long getDecadePeriod(boolean z, Long l) {
        Calendar instance = Calendar.getInstance(Locale.getDefault());
        instance.setTimeInMillis(l.longValue());
        int i = 2;
        int i2 = instance.get(2);
        if (i2 <= 2) {
            int i3 = instance.get(1);
            if (z) {
                i = 0;
            }
            instance.set(i3, i, z ? 1 : 31, 12, 12);
        } else {
            int i4 = 30;
            int i5 = 6;
            if (i2 < 6) {
                int i6 = instance.get(1);
                int i7 = z ? 3 : 5;
                if (z) {
                    i4 = 1;
                }
                instance.set(i6, i7, i4, 12, 12);
            } else {
                int i8 = 9;
                if (i2 < 9) {
                    int i9 = instance.get(1);
                    if (!z) {
                        i5 = 8;
                    }
                    if (z) {
                        i4 = 1;
                    }
                    instance.set(i9, i5, i4, 12, 12);
                } else {
                    int i10 = instance.get(1);
                    if (!z) {
                        i8 = 11;
                    }
                    instance.set(i10, i8, z ? 1 : 31, 12, 12);
                }
            }
        }
        return instance.getTimeInMillis();
    }

    public static String formatDateFromUnix(String str) {
        Calendar instance = Calendar.getInstance(Locale.getDefault());
        instance.setTimeInMillis(Long.valueOf(str).longValue() * 1000);
        return instance.get(5) + " " + new String[]{"января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря"}[instance.get(2)] + " " + instance.get(1);
    }

    public static String formatDateShortFromUnix(long j) {
        Calendar instance = Calendar.getInstance(Locale.getDefault());
        instance.setTimeInMillis(j);
        return instance.get(5) + " " + new String[]{"января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря"}[instance.get(2)];
    }

    public static String formatDateFullFromUnix(long j) {
        Calendar instance = Calendar.getInstance(Locale.getDefault());
        instance.setTimeInMillis(j);
        return instance.get(5) + " " + new String[]{"января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря"}[instance.get(2)] + " " + instance.get(1);
    }

    public static String formatDateFromCalendar(Calendar calendar) {
        return calendar.get(5) + " " + new String[]{"января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря"}[calendar.get(2)] + " " + calendar.get(1);
    }

    public static String formatTimeFromCalendar(Calendar calendar) {
        return HH_MM.format(new Date(calendar.getTimeInMillis()));
    }

    public static String getDisplayNameFromTimeStamp(long j) {
        Calendar instance = Calendar.getInstance(Locale.getDefault());
        instance.setTimeInMillis(j);
        return instance.getDisplayName(7, 2, Locale.getDefault());
    }

    public static String formatDateFromCalendar(Calendar calendar, String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(calendar.getTime());
    }

    public static int monthsBetweenDates(Calendar calendar, Calendar calendar2) {
        int i;
        if (calendar2.get(5) - calendar.get(5) <= 0) {
            i = -1;
            if ((calendar2.get(5) + calendar2.getActualMaximum(5)) - calendar.get(5) > 0) {
                i = 0;
            }
        } else {
            i = 1;
        }
        return i + (calendar2.get(2) - calendar.get(2)) + ((calendar2.get(1) - calendar.get(1)) * 12);
    }

    public static String formatShortDayOfWeek(Calendar calendar) {
        return new String[]{"пн", "вт", "ср", "чт", "пт", "сб", "вс"}[calendar.get(7) - 1];
    }

    public static long getDateDiff(Date date, Date date2, TimeUnit timeUnit) {
        return timeUnit.convert(date2.getTime() - date.getTime(), TimeUnit.MILLISECONDS);
    }

    public static long getDateDiff(long j, long j2, TimeUnit timeUnit) {
        return getDateDiff(new Date(j), new Date(j2), timeUnit);
    }

    public static Calendar getLastDayOfMonthWeek(long j) {
        int i;
        Calendar instance = Calendar.getInstance(Locale.getDefault());
        Calendar instance2 = Calendar.getInstance(Locale.getDefault());
        instance2.setTimeInMillis(j);
        if (isSameMonth(instance2, instance)) {
            i = instance.get(5);
        } else {
            i = instance2.getActualMaximum(5);
        }
        int i2 = i - instance2.get(5);
        if (i2 < 7) {
            instance2.add(7, i2);
        } else if (instance2.get(7) == 1) {
            instance2.add(7, 0);
        } else {
            instance2.add(7, 8 - instance2.get(7));
        }
        return instance2;
    }
}
