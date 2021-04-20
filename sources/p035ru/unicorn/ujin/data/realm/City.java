package p035ru.unicorn.ujin.data.realm;

import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_CityRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.City */
public class City extends RealmObject implements ru_unicorn_ujin_data_realm_CityRealmProxyInterface {
    private Coordinates center;
    @PrimaryKey

    /* renamed from: id */
    private String f6640id;
    private String title;
    private Integer zoom;

    /* renamed from: ru.unicorn.ujin.data.realm.City$Fields */
    public static class Fields {

        /* renamed from: id */
        public static final String f6641id = "id";
    }

    public Coordinates realmGet$center() {
        return this.center;
    }

    public String realmGet$id() {
        return this.f6640id;
    }

    public String realmGet$title() {
        return this.title;
    }

    public Integer realmGet$zoom() {
        return this.zoom;
    }

    public void realmSet$center(Coordinates coordinates) {
        this.center = coordinates;
    }

    public void realmSet$id(String str) {
        this.f6640id = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$zoom(Integer num) {
        this.zoom = num;
    }

    public City() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public String getId() {
        return realmGet$id();
    }

    public void setId(String str) {
        realmSet$id(str);
    }

    public Integer getZoom() {
        return realmGet$zoom();
    }

    public void setZoom(Integer num) {
        realmSet$zoom(num);
    }

    public Coordinates getCenter() {
        return realmGet$center();
    }

    public void setCenter(Coordinates coordinates) {
        realmSet$center(coordinates);
    }
}
