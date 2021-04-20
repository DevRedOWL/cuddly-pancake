package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4745xc9a42252;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentAttribute */
public class RentAttribute extends RealmObject implements Diffable<RentAttribute>, C4745xc9a42252 {
    private String key;
    private String title;
    private String value;

    public String realmGet$key() {
        return this.key;
    }

    public String realmGet$title() {
        return this.title;
    }

    public String realmGet$value() {
        return this.value;
    }

    public void realmSet$key(String str) {
        this.key = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$value(String str) {
        this.value = str;
    }

    public RentAttribute() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public RentAttribute(String str, String str2) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$key(str);
        realmSet$value(str2);
    }

    public String getKey() {
        return realmGet$key();
    }

    public void setKey(String str) {
        realmSet$key(str);
    }

    public String getValue() {
        return realmGet$value();
    }

    public void setValue(String str) {
        realmSet$value(str);
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public static List<RentAttribute> fromMapToList(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(new RentAttribute((String) next.getKey(), String.valueOf(next.getValue())));
        }
        return arrayList;
    }

    public static Map<String, String> fromListToMap(List<RentAttribute> list) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            hashMap.put(list.get(i).realmGet$title(), list.get(i).realmGet$value());
        }
        return hashMap;
    }

    public boolean areItemsTheSame(RentAttribute rentAttribute) {
        return realmGet$key().equals(rentAttribute.realmGet$key());
    }

    public boolean areContentsTheSame(RentAttribute rentAttribute) {
        return realmGet$value().equals(rentAttribute.realmGet$value());
    }
}
