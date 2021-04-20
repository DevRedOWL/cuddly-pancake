package p035ru.unicorn.ujin.data.realm;

import com.google.android.gms.common.util.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4599xaf1d1de8;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.data.realm.GetFlatsResponseData */
public class GetFlatsResponseData extends RealmObject implements C4599xaf1d1de8 {
    private Integer count;
    private String ending;
    @SerializedName("flat")
    private RealmList<Flat> flatList;
    @PrimaryKey

    /* renamed from: id */
    private String f6656id;
    private String root;

    public Integer realmGet$count() {
        return this.count;
    }

    public String realmGet$ending() {
        return this.ending;
    }

    public RealmList realmGet$flatList() {
        return this.flatList;
    }

    public String realmGet$id() {
        return this.f6656id;
    }

    public String realmGet$root() {
        return this.root;
    }

    public void realmSet$count(Integer num) {
        this.count = num;
    }

    public void realmSet$ending(String str) {
        this.ending = str;
    }

    public void realmSet$flatList(RealmList realmList) {
        this.flatList = realmList;
    }

    public void realmSet$id(String str) {
        this.f6656id = str;
    }

    public void realmSet$root(String str) {
        this.root = str;
    }

    public GetFlatsResponseData() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    /* renamed from: ru.unicorn.ujin.data.realm.GetFlatsResponseData$Fields */
    public class Fields {
        public static final String filter = "filter";

        /* renamed from: id */
        public static final String f6657id = "id";

        public Fields() {
        }
    }

    public Integer getCount() {
        return realmGet$count();
    }

    public void setCount(Integer num) {
        realmSet$count(num);
    }

    public RealmList<Flat> getFlatList() {
        return CollectionUtils.isEmpty(realmGet$flatList()) ? new RealmList<>() : realmGet$flatList();
    }

    public void setFlatList(RealmList<Flat> realmList) {
        realmSet$flatList(realmList);
    }

    public String getEnding() {
        return realmGet$ending();
    }

    public void setEnding(String str) {
        realmSet$ending(str);
    }

    public String getRoot() {
        return realmGet$root();
    }

    public void setRoot(String str) {
        realmSet$root(str);
    }

    public String getId() {
        return realmGet$id();
    }

    public void setId(String str) {
        realmSet$id(str);
    }
}
