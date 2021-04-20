package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.ManagePermissions;
import p046io.realm.C4749xc305b318;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo */
public class RentInfo extends RealmObject implements Diffable<RentInfo>, Parcelable, C4749xc305b318 {
    public static final Parcelable.Creator<RentInfo> CREATOR = new Parcelable.Creator<RentInfo>() {
        public RentInfo createFromParcel(Parcel parcel) {
            return new RentInfo(parcel);
        }

        public RentInfo[] newArray(int i) {
            return new RentInfo[i];
        }
    };
    @SerializedName("finish_date")
    @Expose
    private Long finishDate;
    @SerializedName("human_finish_date")
    @Expose
    public String finishDateHuman;
    @SerializedName("id")
    @PrimaryKey
    @Expose

    /* renamed from: id */
    private Integer f6813id;
    @SerializedName("property")
    @Expose
    private PropertyRenta propRenta;
    @SerializedName("permissions")
    @Expose
    private ManagePermissions rentPermissions;
    @SerializedName("renters_count")
    @Expose
    private Integer rentersCount;
    @SerializedName("start_date")
    @Expose
    private Long startDate;
    @SerializedName("human_start_date")
    @Expose
    public String startDateHuman;
    @SerializedName("state_display_name")
    @Expose
    private String stateDisplayName;
    @SerializedName("state_name")
    @Expose
    private String stateName;
    @SerializedName("state")
    @Expose
    private StateRenta stateRenta;
    @SerializedName("human")
    @Expose
    public TimeSlotHuman timeSlotHuman;

    public boolean areContentsTheSame(RentInfo rentInfo) {
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public Long realmGet$finishDate() {
        return this.finishDate;
    }

    public String realmGet$finishDateHuman() {
        return this.finishDateHuman;
    }

    public Integer realmGet$id() {
        return this.f6813id;
    }

    public PropertyRenta realmGet$propRenta() {
        return this.propRenta;
    }

    public ManagePermissions realmGet$rentPermissions() {
        return this.rentPermissions;
    }

    public Integer realmGet$rentersCount() {
        return this.rentersCount;
    }

    public Long realmGet$startDate() {
        return this.startDate;
    }

    public String realmGet$startDateHuman() {
        return this.startDateHuman;
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

    public TimeSlotHuman realmGet$timeSlotHuman() {
        return this.timeSlotHuman;
    }

    public void realmSet$finishDate(Long l) {
        this.finishDate = l;
    }

    public void realmSet$finishDateHuman(String str) {
        this.finishDateHuman = str;
    }

    public void realmSet$id(Integer num) {
        this.f6813id = num;
    }

    public void realmSet$propRenta(PropertyRenta propertyRenta) {
        this.propRenta = propertyRenta;
    }

    public void realmSet$rentPermissions(ManagePermissions managePermissions) {
        this.rentPermissions = managePermissions;
    }

    public void realmSet$rentersCount(Integer num) {
        this.rentersCount = num;
    }

    public void realmSet$startDate(Long l) {
        this.startDate = l;
    }

    public void realmSet$startDateHuman(String str) {
        this.startDateHuman = str;
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

    public void realmSet$timeSlotHuman(TimeSlotHuman timeSlotHuman2) {
        this.timeSlotHuman = timeSlotHuman2;
    }

    public boolean areItemsTheSame(RentInfo rentInfo) {
        return realmGet$id().equals(rentInfo.realmGet$id());
    }

    public int getRentersCount() {
        return realmGet$rentersCount().intValue();
    }

    public void setRentersCount(int i) {
        realmSet$rentersCount(Integer.valueOf(i));
    }

    public ManagePermissions getRentPermissions() {
        return realmGet$rentPermissions();
    }

    public void setRentPermissions(ManagePermissions managePermissions) {
        realmSet$rentPermissions(managePermissions);
    }

    public Integer getId() {
        return realmGet$id();
    }

    public void setId(Integer num) {
        realmSet$id(num);
    }

    public Long getStartDate() {
        return realmGet$startDate();
    }

    public void setStartDate(Long l) {
        realmSet$startDate(l);
    }

    public Long getFinishDate() {
        return realmGet$finishDate();
    }

    public void setFinishDate(Long l) {
        realmSet$finishDate(l);
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

    public static ArrayList<RentObject> toKeyValueListForOnePeriod(RentInfo rentInfo, int i) {
        ArrayList<RentObject> arrayList = new ArrayList<>();
        if (rentInfo.realmGet$propRenta().getTitle() != null) {
            arrayList.add(new RentObject(RentFields.LABEL, rentInfo.realmGet$propRenta().getTitle()));
        }
        if (rentInfo.realmGet$propRenta().getTitle() != null) {
            arrayList.add(new RentObject(RentFields.LOCATIO, rentInfo.realmGet$propRenta().getTitle()));
        }
        if (rentInfo.realmGet$propRenta().getAttributes().getArea() != null) {
            arrayList.add(new RentObject(RentFields.AREA, rentInfo.realmGet$propRenta().getAttributes().getArea()));
        }
        if (rentInfo.realmGet$propRenta().getAttributes().getCapacity() != null) {
            arrayList.add(new RentObject(RentFields.CAPACITY, rentInfo.realmGet$propRenta().getAttributes().getCapacity()));
        }
        if (rentInfo.realmGet$propRenta().getAttributes().getFloor() != null) {
            arrayList.add(new RentObject(RentFields.FLOOR, rentInfo.realmGet$propRenta().getAttributes().getFloor()));
        }
        rentInfo.getPropRenta().getTypeRent().getName().toLowerCase().contains("meeting");
        return arrayList;
    }

    public static ArrayList<RentObject> toKeyValueListForeManyPeriod(RentInfo rentInfo, int i) {
        ArrayList<RentObject> arrayList = new ArrayList<>();
        HashMap hashMap = new HashMap();
        hashMap.put("arrow", "");
        hashMap.put("desc", "Периодов " + i);
        if (rentInfo.realmGet$propRenta().getTitle() != null) {
            arrayList.add(new RentObject(RentFields.LABEL, rentInfo.realmGet$propRenta().getTitle()));
        }
        if (rentInfo.realmGet$propRenta().getTitle() != null) {
            arrayList.add(new RentObject(RentFields.LOCATIO, rentInfo.realmGet$propRenta().getTitle()));
        }
        if (rentInfo.realmGet$propRenta().getAttributes().getArea() != null) {
            arrayList.add(new RentObject(RentFields.AREA, rentInfo.realmGet$propRenta().getAttributes().getArea()));
        }
        if (rentInfo.realmGet$propRenta().getAttributes().getCapacity() != null) {
            arrayList.add(new RentObject(RentFields.CAPACITY, rentInfo.realmGet$propRenta().getAttributes().getCapacity()));
        }
        if (rentInfo.realmGet$propRenta().getAttributes().getFloor() != null) {
            arrayList.add(new RentObject(RentFields.FLOOR, rentInfo.realmGet$propRenta().getAttributes().getFloor()));
        }
        return arrayList;
    }

    public RentInfo() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    protected RentInfo(Parcel parcel) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        if (parcel.readByte() == 0) {
            realmSet$id((Integer) null);
        } else {
            realmSet$id(Integer.valueOf(parcel.readInt()));
        }
        realmSet$startDate(Long.valueOf(parcel.readLong()));
        realmSet$finishDate(Long.valueOf(parcel.readLong()));
        realmSet$stateName(parcel.readString());
        realmSet$stateDisplayName(parcel.readString());
        realmSet$rentersCount(Integer.valueOf(parcel.readInt()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (realmGet$id() == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(realmGet$id().intValue());
        }
        parcel.writeLong(realmGet$startDate().longValue());
        parcel.writeLong(realmGet$finishDate().longValue());
        parcel.writeString(realmGet$stateName());
        parcel.writeString(realmGet$stateDisplayName());
        parcel.writeInt(realmGet$rentersCount().intValue());
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo$RentObject */
    static class RentObject implements Diffable<RentObject> {
        Map<String, Object> map;
        private String rentFields;
        private String val;

        RentObject(RentFields rentFields2, String str) {
            this.rentFields = rentFields2.getName();
            if (this.map == null) {
                this.map = new HashMap();
            }
            this.map.put("val", str);
        }

        RentObject(RentFields rentFields2, Map<String, Object> map2) {
            this.rentFields = rentFields2.getName();
            this.map = map2;
            if (!map2.containsKey("val")) {
                map2.put("val", "");
            }
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

        public Map<String, Object> getMap() {
            return this.map;
        }

        public void setMap(Map<String, Object> map2) {
            this.map = map2;
        }

        public boolean areItemsTheSame(RentObject rentObject) {
            return this.rentFields.equals(rentObject.rentFields);
        }

        public boolean areContentsTheSame(RentObject rentObject) {
            return getMap().get("val").equals(rentObject.getMap().get("val"));
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo$RentFields */
    public enum RentFields {
        LABEL("Наименование"),
        LOCATIO("Расположение"),
        AREA("Площадь кв.м."),
        CAPACITY("Вместимость, чел."),
        FLOOR("Этаж");
        
        private final String fieldName;

        private RentFields(String str) {
            this.fieldName = str;
        }

        public String getName() {
            return this.fieldName;
        }
    }

    public String toString() {
        return "RentInfo{id=" + realmGet$id() + ", startDate=" + realmGet$startDate() + ", finishDate=" + realmGet$finishDate() + ", stateName='" + realmGet$stateName() + '\'' + ", stateDisplayName='" + realmGet$stateDisplayName() + '\'' + ", stateRenta=" + realmGet$stateRenta() + ", propRenta=" + realmGet$propRenta() + '}';
    }
}
