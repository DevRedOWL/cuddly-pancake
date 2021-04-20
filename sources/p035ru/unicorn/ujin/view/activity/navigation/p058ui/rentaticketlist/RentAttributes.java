package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueData;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueDataImpl;
import p046io.realm.C4795x4c784b25;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.RentAttributes */
public class RentAttributes extends RealmObject implements IKeyValueData, C4795x4c784b25 {
    @SerializedName("title")
    private String title;
    @SerializedName("value")
    private String value;

    public Integer getDataId() {
        return null;
    }

    public Map<IKeyValueData.OPTIONS, Object> getOptions() {
        return null;
    }

    public String realmGet$title() {
        return this.title;
    }

    public String realmGet$value() {
        return this.value;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$value(String str) {
        this.value = str;
    }

    public RentAttributes() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public RentAttributes(String str, String str2) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$title(str);
        realmSet$value(str2);
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public String getKey() {
        return realmGet$title();
    }

    public Object getValue() {
        return realmGet$value();
    }

    public boolean areItemsTheSame(IKeyValueData iKeyValueData) {
        return realmGet$title().equals(iKeyValueData.getKey());
    }

    public boolean areContentsTheSame(IKeyValueData iKeyValueData) {
        return realmGet$value().equals(iKeyValueData.getValue());
    }

    /* renamed from: to */
    public static IKeyValueData m6931to(RentAttributes rentAttributes) {
        return new IKeyValueDataImpl(rentAttributes.realmGet$title(), rentAttributes.realmGet$value());
    }

    /* renamed from: to */
    public static List<IKeyValueData> m6930to(List<RentAttributes> list) {
        return new ArrayList(list);
    }

    public static Map<String, String> fromListToMap(List<RentAttributes> list) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            hashMap.put(list.get(i).realmGet$title(), list.get(i).realmGet$value());
        }
        return hashMap;
    }

    public static List<RentAttributes> fromMapToList(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(new RentAttributes((String) next.getKey(), String.valueOf(next.getValue())));
        }
        return arrayList;
    }
}
