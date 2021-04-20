package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p046io.realm.C4733x54317689;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.Rooms */
public class Rooms extends RealmObject implements Diffable<Rooms>, C4733x54317689 {
    public static final String ADD_ROOM = "добавить";
    public static final String ALL_ROOM = "все помещения";
    public static final String NO_ROOM = "Без помещения";
    @SerializedName("id")
    @PrimaryKey
    @Expose

    /* renamed from: id */
    private Integer f6788id;
    @SerializedName("title")
    @Expose
    private String title;

    public Integer realmGet$id() {
        return this.f6788id;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$id(Integer num) {
        this.f6788id = num;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public Rooms(Integer num, String str) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(num);
        realmSet$title(str);
    }

    public Rooms() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public static ArrayList<String> getStringList(List<Rooms> list) {
        HashSet hashSet = new HashSet();
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                hashSet.add(list.get(i).getTitle());
            }
        }
        ArrayList<String> arrayList = new ArrayList<>(hashSet);
        arrayList.add(ADD_ROOM);
        arrayList.add(0, ALL_ROOM);
        return arrayList;
    }

    public Integer getId() {
        return realmGet$id();
    }

    public void setId(Integer num) {
        realmSet$id(num);
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public static List<SomeString> getTitleList(List<Rooms> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SomeString("Все комнаты"));
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new SomeString(list.get(i).getTitle()));
        }
        arrayList.add(new SomeString(ADD_ROOM));
        return arrayList;
    }

    public boolean areItemsTheSame(Rooms rooms) {
        return realmGet$id().equals(rooms.realmGet$id());
    }

    public boolean areContentsTheSame(Rooms rooms) {
        return realmGet$title().equals(rooms.realmGet$title());
    }
}
