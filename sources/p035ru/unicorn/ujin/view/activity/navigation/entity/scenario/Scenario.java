package p035ru.unicorn.ujin.view.activity.navigation.entity.scenario;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4655x9a612864;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.annotations.Required;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario */
public class Scenario extends RealmObject implements Diffable<Scenario>, C4655x9a612864 {
    public static final String ADD = "add";
    public static String DEVICES = "devices";
    public static String ROOMS = "rooms";
    @SerializedName("audio")
    @Required
    @Expose
    private RealmList<String> audio;
    @SerializedName("child")
    @Expose
    private String child;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("fullimage")
    @Expose
    private String fullimage;
    @SerializedName("ico")
    @Expose
    private String ico;
    @SerializedName("id")
    @PrimaryKey
    @Expose

    /* renamed from: id */
    private Integer f6725id;
    @SerializedName("img")
    @Expose
    private String img;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("parentId")
    @Expose
    private Integer parentId;
    @SerializedName("state")
    @Expose
    private State state;

    public RealmList realmGet$audio() {
        return this.audio;
    }

    public String realmGet$child() {
        return this.child;
    }

    public String realmGet$description() {
        return this.description;
    }

    public String realmGet$fullimage() {
        return this.fullimage;
    }

    public String realmGet$ico() {
        return this.ico;
    }

    public Integer realmGet$id() {
        return this.f6725id;
    }

    public String realmGet$img() {
        return this.img;
    }

    public String realmGet$name() {
        return this.name;
    }

    public Integer realmGet$parentId() {
        return this.parentId;
    }

    public State realmGet$state() {
        return this.state;
    }

    public void realmSet$audio(RealmList realmList) {
        this.audio = realmList;
    }

    public void realmSet$child(String str) {
        this.child = str;
    }

    public void realmSet$description(String str) {
        this.description = str;
    }

    public void realmSet$fullimage(String str) {
        this.fullimage = str;
    }

    public void realmSet$ico(String str) {
        this.ico = str;
    }

    public void realmSet$id(Integer num) {
        this.f6725id = num;
    }

    public void realmSet$img(String str) {
        this.img = str;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$parentId(Integer num) {
        this.parentId = num;
    }

    public void realmSet$state(State state2) {
        this.state = state2;
    }

    public Scenario() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$audio(new RealmList());
    }

    public String getName() {
        return realmGet$name();
    }

    public void setName(String str) {
        realmSet$name(str);
    }

    public Integer getId() {
        return realmGet$id();
    }

    public void setId(Integer num) {
        realmSet$id(num);
    }

    public Integer getParentId() {
        return realmGet$parentId();
    }

    public void setParentId(Integer num) {
        realmSet$parentId(num);
    }

    public String getImg() {
        return realmGet$img();
    }

    public void setImg(String str) {
        realmSet$img(str);
    }

    public String getFullimage() {
        return realmGet$fullimage();
    }

    public void setFullimage(String str) {
        realmSet$fullimage(str);
    }

    public String getIco() {
        return realmGet$ico();
    }

    public void setIco(String str) {
        realmSet$ico(str);
    }

    public String getChild() {
        return realmGet$child();
    }

    public void setChild(String str) {
        realmSet$child(str);
    }

    public String getDescription() {
        return realmGet$description();
    }

    public void setDescription(String str) {
        realmSet$description(str);
    }

    public RealmList<String> getAudio() {
        return realmGet$audio();
    }

    public void setAudio(RealmList<String> realmList) {
        realmSet$audio(realmList);
    }

    public State getState() {
        return realmGet$state();
    }

    public void setState(State state2) {
        realmSet$state(state2);
    }

    public static List<Scenario> getData(List<Scenario> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).realmGet$child().equals(str)) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }

    public static List<Scenario> getDataByParent(List<Scenario> list, String str, int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).realmGet$child().equals(str) && list.get(i2).realmGet$parentId().intValue() == i) {
                arrayList.add(list.get(i2));
            }
        }
        return arrayList;
    }

    public static String findScenarioById(List<Scenario> list, int i, boolean z) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).getId().intValue() == i) {
                StringBuilder sb = new StringBuilder();
                sb.append("Сценарий ");
                sb.append(list.get(i2).getName());
                sb.append(z ? " активирован" : " дезактивирован");
                return sb.toString();
            }
        }
        return null;
    }

    public boolean areItemsTheSame(Scenario scenario) {
        return realmGet$id().equals(scenario.realmGet$id());
    }

    public boolean areContentsTheSame(Scenario scenario) {
        return realmGet$name().equals(scenario.realmGet$name());
    }
}
