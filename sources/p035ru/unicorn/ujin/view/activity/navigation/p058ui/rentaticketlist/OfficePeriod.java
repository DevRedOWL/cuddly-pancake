package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.OfficePeriod */
public class OfficePeriod {
    private int monthCount;
    private String name;

    public OfficePeriod(String str, int i) {
        this.name = str;
        this.monthCount = i;
    }

    public String toString() {
        return getName();
    }

    public static List<OfficePeriod> getData() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new OfficePeriod("6 месяцев", 6));
        arrayList.add(new OfficePeriod("7 месяцев", 7));
        arrayList.add(new OfficePeriod("8 месяцев", 8));
        arrayList.add(new OfficePeriod("9 месяцев", 9));
        arrayList.add(new OfficePeriod("10 месяцев", 10));
        arrayList.add(new OfficePeriod("11 месяцев", 11));
        arrayList.add(new OfficePeriod("1 год", 12));
        arrayList.add(new OfficePeriod("1 год 6 месяцев", 18));
        arrayList.add(new OfficePeriod("2 года", 24));
        arrayList.add(new OfficePeriod("3 года", 36));
        return arrayList;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public int getMonthCount() {
        return this.monthCount;
    }

    public void setMonthCount(int i) {
        this.monthCount = i;
    }
}
