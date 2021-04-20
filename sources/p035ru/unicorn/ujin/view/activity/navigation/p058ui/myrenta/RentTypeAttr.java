package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4753x3e233a5b;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentTypeAttr */
public class RentTypeAttr extends RealmObject implements Diffable<RentTypeAttr>, C4753x3e233a5b {
    @SerializedName("finish_date")
    @Expose
    private Integer finishDate;
    @SerializedName("id")
    @PrimaryKey
    @Expose

    /* renamed from: id */
    private Integer f6816id;
    @SerializedName("property")
    @Expose
    private PropertyRenta propRenta;
    @SerializedName("start_date")
    @Expose
    private Integer startDate;
    @SerializedName("state_display_name")
    @Expose
    private String stateDisplayName;
    @SerializedName("state_name")
    @Expose
    private String stateName;
    @SerializedName("state")
    @Expose
    private StateRenta stateRenta;

    public Integer realmGet$finishDate() {
        return this.finishDate;
    }

    public Integer realmGet$id() {
        return this.f6816id;
    }

    public PropertyRenta realmGet$propRenta() {
        return this.propRenta;
    }

    public Integer realmGet$startDate() {
        return this.startDate;
    }

    public String realmGet$stateDisplayName() {
        return this.stateDisplayName;
    }

    public String realmGet$stateName() {
        return this.stateName;
    }

    public StateRenta realmGet$stateRenta() {
        return this.stateRenta;
    }

    public void realmSet$finishDate(Integer num) {
        this.finishDate = num;
    }

    public void realmSet$id(Integer num) {
        this.f6816id = num;
    }

    public void realmSet$propRenta(PropertyRenta propertyRenta) {
        this.propRenta = propertyRenta;
    }

    public void realmSet$startDate(Integer num) {
        this.startDate = num;
    }

    public void realmSet$stateDisplayName(String str) {
        this.stateDisplayName = str;
    }

    public void realmSet$stateName(String str) {
        this.stateName = str;
    }

    public void realmSet$stateRenta(StateRenta stateRenta2) {
        this.stateRenta = stateRenta2;
    }

    public RentTypeAttr() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public boolean areItemsTheSame(RentTypeAttr rentTypeAttr) {
        return realmGet$id().equals(rentTypeAttr.realmGet$id());
    }

    public boolean areContentsTheSame(RentTypeAttr rentTypeAttr) {
        return realmGet$propRenta().getTitle().equals(rentTypeAttr.realmGet$propRenta().getTitle());
    }

    public Integer getId() {
        return realmGet$id();
    }

    public void setId(Integer num) {
        realmSet$id(num);
    }

    public Integer getStartDate() {
        return realmGet$startDate();
    }

    public void setStartDate(Integer num) {
        realmSet$startDate(num);
    }

    public Integer getFinishDate() {
        return realmGet$finishDate();
    }

    public void setFinishDate(Integer num) {
        realmSet$finishDate(num);
    }

    public String getStateName() {
        return realmGet$stateName();
    }

    public void setStateName(String str) {
        realmSet$stateName(str);
    }

    public String getStateDisplayName() {
        return realmGet$stateDisplayName();
    }

    public void setStateDisplayName(String str) {
        realmSet$stateDisplayName(str);
    }

    public StateRenta getStateRenta() {
        return realmGet$stateRenta();
    }

    public void setStateRenta(StateRenta stateRenta2) {
        realmSet$stateRenta(stateRenta2);
    }

    public PropertyRenta getPropRenta() {
        return realmGet$propRenta();
    }

    public void setPropRenta(PropertyRenta propertyRenta) {
        realmSet$propRenta(propertyRenta);
    }

    public static ArrayList<RentObject> toKeyValueList(RentTypeAttr rentTypeAttr) {
        ArrayList<RentObject> arrayList = new ArrayList<>();
        arrayList.add(new RentObject(RentFields.LABEL, rentTypeAttr.realmGet$propRenta().getTitle()));
        arrayList.add(new RentObject(RentFields.LOCATIO, rentTypeAttr.realmGet$propRenta().getTitle()));
        return arrayList;
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentTypeAttr$RentObject */
    static class RentObject implements Diffable<RentObject> {
        private String rentFields;
        private String val;

        RentObject(RentFields rentFields2, String str) {
            this.rentFields = rentFields2.getName();
            this.val = str;
        }

        public String getRentFields() {
            return this.rentFields;
        }

        public void setRentFields(String str) {
            this.rentFields = str;
        }

        public String getVal() {
            return this.val;
        }

        public void setVal(String str) {
            this.val = str;
        }

        public boolean areItemsTheSame(RentObject rentObject) {
            return this.rentFields.equals(rentObject.rentFields);
        }

        public boolean areContentsTheSame(RentObject rentObject) {
            return this.val.equals(rentObject.val);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentTypeAttr$RentFields */
    public enum RentFields {
        LABEL("Наименование"),
        LOCATIO("Расположение");
        
        private final String fieldName;

        private RentFields(String str) {
            this.fieldName = str;
        }

        public String getName() {
            return this.fieldName;
        }
    }
}
