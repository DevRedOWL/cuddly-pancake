package p035ru.unicorn.ujin.view.activity.navigation.entity.scenario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString */
public class SomeString implements Diffable<SomeString> {
    String someString;
    private Map<String, Object> values = new HashMap();

    public SomeString(String str) {
        this.someString = str;
    }

    public static List<SomeString> create(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new SomeString(list.get(i)));
        }
        return arrayList;
    }

    public boolean areItemsTheSame(SomeString someString2) {
        return this.someString.equals(someString2.someString);
    }

    public boolean areContentsTheSame(SomeString someString2) {
        return this.someString.equals(someString2.someString);
    }

    public String getSomeString() {
        return this.someString;
    }

    public void setSomeString(String str) {
        this.someString = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SomeString)) {
            return false;
        }
        SomeString someString2 = (SomeString) obj;
        if (getSomeString() != null) {
            return getSomeString().equals(someString2.getSomeString());
        }
        if (someString2.getSomeString() == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (getSomeString() != null) {
            return getSomeString().hashCode();
        }
        return 0;
    }

    public Map<String, Object> getValues() {
        return this.values;
    }

    public void setValues(Map<String, Object> map) {
        this.values = map;
    }

    public static List<SomeString> createSomeStringList(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SomeString(str));
        arrayList.add(new SomeString(str + " " + str2));
        arrayList.add(new SomeString(str2));
        return arrayList;
    }
}
