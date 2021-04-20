package com.afollestad.date.data;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0002H\u0000¨\u0006\u0006"}, mo51343d2 = {"andTheRest", "", "Lcom/afollestad/date/data/DayOfWeek;", "asDayOfWeek", "", "nextDayOfWeek", "com.afollestad.date-picker"}, mo51344k = 2, mo51345mv = {1, 1, 15})
/* compiled from: DayOfWeek.kt */
public final class DayOfWeekKt {
    public static final DayOfWeek asDayOfWeek(int i) {
        DayOfWeek dayOfWeek = null;
        boolean z = false;
        for (DayOfWeek dayOfWeek2 : DayOfWeek.values()) {
            if (dayOfWeek2.getRawValue() == i) {
                if (!z) {
                    dayOfWeek = dayOfWeek2;
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            return dayOfWeek;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final List<DayOfWeek> andTheRest(DayOfWeek dayOfWeek) {
        Intrinsics.checkParameterIsNotNull(dayOfWeek, "$this$andTheRest");
        List<DayOfWeek> arrayList = new ArrayList<>();
        int rawValue = dayOfWeek.getRawValue();
        int rawValue2 = DayOfWeek.SATURDAY.getRawValue();
        if (rawValue <= rawValue2) {
            while (true) {
                arrayList.add(asDayOfWeek(rawValue));
                if (rawValue == rawValue2) {
                    break;
                }
                rawValue++;
            }
        }
        int rawValue3 = dayOfWeek.getRawValue();
        for (int rawValue4 = DayOfWeek.SUNDAY.getRawValue(); rawValue4 < rawValue3; rawValue4++) {
            arrayList.add(asDayOfWeek(rawValue4));
        }
        return arrayList;
    }

    public static final DayOfWeek nextDayOfWeek(DayOfWeek dayOfWeek) {
        Intrinsics.checkParameterIsNotNull(dayOfWeek, "$this$nextDayOfWeek");
        switch (dayOfWeek) {
            case SUNDAY:
                return DayOfWeek.MONDAY;
            case MONDAY:
                return DayOfWeek.TUESDAY;
            case TUESDAY:
                return DayOfWeek.WEDNESDAY;
            case WEDNESDAY:
                return DayOfWeek.THURSDAY;
            case THURSDAY:
                return DayOfWeek.FRIDAY;
            case FRIDAY:
                return DayOfWeek.SATURDAY;
            case SATURDAY:
                return DayOfWeek.SUNDAY;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
