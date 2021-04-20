package p035ru.unicorn.ujin.view.activity.navigation.entity.hardware;

import android.util.SparseArray;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms.SomePair;
import p046io.realm.C4643xf2712564;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware */
public class Hardware extends RealmObject implements Diffable<Hardware>, C4643xf2712564 {
    public static final String ALL = "фильтры";
    public static final String LABEL_FILTER_ALL = "Все";
    @SerializedName("channelType")
    @Expose
    private Integer channelType;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("device_class_id")
    @Expose
    private String deviceClassId;
    @SerializedName("device_class_name")
    @Expose
    private String deviceClassName;
    @SerializedName("device_class_title")
    @Expose
    private String deviceClassTitle;
    @SerializedName("device_model_id")
    @Expose
    private String deviceModelId;
    @SerializedName("device_model_name")
    @Expose
    private String deviceModelName;
    @SerializedName("device_model_title")
    @Expose
    private String deviceModelTitle;
    @SerializedName("device_title")
    @Expose
    private String deviceTitle;
    @SerializedName("get_settings_window_url")
    @Expose
    private String getSettingsWindowUrl;
    @SerializedName("group_signal")
    @Expose
    private Integer groupSignal;
    @SerializedName("guid")
    @Expose
    private String guid;
    @SerializedName("hardware_id")
    @Expose
    private Integer hardwareId;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("id")
    @PrimaryKey
    @Expose

    /* renamed from: id */
    private String f6715id;
    @SerializedName("img")
    @Expose
    private String img;
    @SerializedName("img_app")
    @Expose
    private String imgApp;
    @SerializedName("istext")
    @Expose
    private Integer istext;
    @SerializedName("management")
    @Expose
    private Integer management;
    @SerializedName("management_type")
    @Expose
    private ManagementType managementType;
    @SerializedName("manual")
    @Expose
    private String manual;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("online")
    @Expose
    private Integer online;
    @SerializedName("room_info")
    @Expose
    private RoomInfo roomInfo;
    @SerializedName("scen_available")
    @Expose
    private String scenAvailable;
    @SerializedName("signals")
    @Expose
    private RealmList<HardwareSignal> signals;
    @SerializedName("state")
    @Expose
    private Integer state;
    @SerializedName("state_text")
    @Expose
    private String stateText;
    @SerializedName("textsuffix")
    @Expose
    private String textsuffix;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("typeName")
    @Expose
    private String typeName;
    @SerializedName("width")
    @Expose
    private Integer width;

    public Integer realmGet$channelType() {
        return this.channelType;
    }

    public String realmGet$description() {
        return this.description;
    }

    public String realmGet$deviceClassId() {
        return this.deviceClassId;
    }

    public String realmGet$deviceClassName() {
        return this.deviceClassName;
    }

    public String realmGet$deviceClassTitle() {
        return this.deviceClassTitle;
    }

    public String realmGet$deviceModelId() {
        return this.deviceModelId;
    }

    public String realmGet$deviceModelName() {
        return this.deviceModelName;
    }

    public String realmGet$deviceModelTitle() {
        return this.deviceModelTitle;
    }

    public String realmGet$deviceTitle() {
        return this.deviceTitle;
    }

    public String realmGet$getSettingsWindowUrl() {
        return this.getSettingsWindowUrl;
    }

    public Integer realmGet$groupSignal() {
        return this.groupSignal;
    }

    public String realmGet$guid() {
        return this.guid;
    }

    public Integer realmGet$hardwareId() {
        return this.hardwareId;
    }

    public Integer realmGet$height() {
        return this.height;
    }

    public String realmGet$id() {
        return this.f6715id;
    }

    public String realmGet$img() {
        return this.img;
    }

    public String realmGet$imgApp() {
        return this.imgApp;
    }

    public Integer realmGet$istext() {
        return this.istext;
    }

    public Integer realmGet$management() {
        return this.management;
    }

    public ManagementType realmGet$managementType() {
        return this.managementType;
    }

    public String realmGet$manual() {
        return this.manual;
    }

    public String realmGet$name() {
        return this.name;
    }

    public Integer realmGet$online() {
        return this.online;
    }

    public RoomInfo realmGet$roomInfo() {
        return this.roomInfo;
    }

    public String realmGet$scenAvailable() {
        return this.scenAvailable;
    }

    public RealmList realmGet$signals() {
        return this.signals;
    }

    public Integer realmGet$state() {
        return this.state;
    }

    public String realmGet$stateText() {
        return this.stateText;
    }

    public String realmGet$textsuffix() {
        return this.textsuffix;
    }

    public String realmGet$title() {
        return this.title;
    }

    public String realmGet$token() {
        return this.token;
    }

    public String realmGet$typeName() {
        return this.typeName;
    }

    public Integer realmGet$width() {
        return this.width;
    }

    public void realmSet$channelType(Integer num) {
        this.channelType = num;
    }

    public void realmSet$description(String str) {
        this.description = str;
    }

    public void realmSet$deviceClassId(String str) {
        this.deviceClassId = str;
    }

    public void realmSet$deviceClassName(String str) {
        this.deviceClassName = str;
    }

    public void realmSet$deviceClassTitle(String str) {
        this.deviceClassTitle = str;
    }

    public void realmSet$deviceModelId(String str) {
        this.deviceModelId = str;
    }

    public void realmSet$deviceModelName(String str) {
        this.deviceModelName = str;
    }

    public void realmSet$deviceModelTitle(String str) {
        this.deviceModelTitle = str;
    }

    public void realmSet$deviceTitle(String str) {
        this.deviceTitle = str;
    }

    public void realmSet$getSettingsWindowUrl(String str) {
        this.getSettingsWindowUrl = str;
    }

    public void realmSet$groupSignal(Integer num) {
        this.groupSignal = num;
    }

    public void realmSet$guid(String str) {
        this.guid = str;
    }

    public void realmSet$hardwareId(Integer num) {
        this.hardwareId = num;
    }

    public void realmSet$height(Integer num) {
        this.height = num;
    }

    public void realmSet$id(String str) {
        this.f6715id = str;
    }

    public void realmSet$img(String str) {
        this.img = str;
    }

    public void realmSet$imgApp(String str) {
        this.imgApp = str;
    }

    public void realmSet$istext(Integer num) {
        this.istext = num;
    }

    public void realmSet$management(Integer num) {
        this.management = num;
    }

    public void realmSet$managementType(ManagementType managementType2) {
        this.managementType = managementType2;
    }

    public void realmSet$manual(String str) {
        this.manual = str;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$online(Integer num) {
        this.online = num;
    }

    public void realmSet$roomInfo(RoomInfo roomInfo2) {
        this.roomInfo = roomInfo2;
    }

    public void realmSet$scenAvailable(String str) {
        this.scenAvailable = str;
    }

    public void realmSet$signals(RealmList realmList) {
        this.signals = realmList;
    }

    public void realmSet$state(Integer num) {
        this.state = num;
    }

    public void realmSet$stateText(String str) {
        this.stateText = str;
    }

    public void realmSet$textsuffix(String str) {
        this.textsuffix = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$token(String str) {
        this.token = str;
    }

    public void realmSet$typeName(String str) {
        this.typeName = str;
    }

    public void realmSet$width(Integer num) {
        this.width = num;
    }

    public Hardware() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$signals((RealmList) null);
    }

    public RealmList<HardwareSignal> getSignals() {
        return realmGet$signals();
    }

    public void setSignals(RealmList<HardwareSignal> realmList) {
        realmSet$signals(realmList);
    }

    public String getImgApp() {
        return realmGet$imgApp();
    }

    public void setImgApp(String str) {
        realmSet$imgApp(str);
    }

    public Integer getGroupSignal() {
        return realmGet$groupSignal();
    }

    public void setGroupSignal(Integer num) {
        realmSet$groupSignal(num);
    }

    public String getDeviceTitle() {
        return realmGet$deviceTitle();
    }

    public void setDeviceTitle(String str) {
        realmSet$deviceTitle(str);
    }

    public String getDeviceModelName() {
        return realmGet$deviceModelName();
    }

    public void setDeviceModelName(String str) {
        realmSet$deviceModelName(str);
    }

    public String getDeviceModelTitle() {
        return realmGet$deviceModelTitle();
    }

    public void setDeviceModelTitle(String str) {
        realmSet$deviceModelTitle(str);
    }

    public String getDeviceModelId() {
        return realmGet$deviceModelId();
    }

    public void setDeviceModelId(String str) {
        realmSet$deviceModelId(str);
    }

    public String getDeviceClassName() {
        return realmGet$deviceClassName();
    }

    public void setDeviceClassName(String str) {
        realmSet$deviceClassName(str);
    }

    public String getDeviceClassId() {
        return realmGet$deviceClassId();
    }

    public void setDeviceClassId(String str) {
        realmSet$deviceClassId(str);
    }

    public String getDeviceClassTitle() {
        return realmGet$deviceClassTitle();
    }

    public void setDeviceClassTitle(String str) {
        realmSet$deviceClassTitle(str);
    }

    public Integer getManagement() {
        return realmGet$management();
    }

    public void setManagement(Integer num) {
        realmSet$management(num);
    }

    public Integer getIstext() {
        return realmGet$istext();
    }

    public void setIstext(Integer num) {
        realmSet$istext(num);
    }

    public Integer getWidth() {
        return realmGet$width();
    }

    public void setWidth(Integer num) {
        realmSet$width(num);
    }

    public Integer getHeight() {
        return realmGet$height();
    }

    public void setHeight(Integer num) {
        realmSet$height(num);
    }

    public String getTextsuffix() {
        return realmGet$textsuffix();
    }

    public void setTextsuffix(String str) {
        realmSet$textsuffix(str);
    }

    public String getGuid() {
        return realmGet$guid();
    }

    public void setGuid(String str) {
        realmSet$guid(str);
    }

    public String getId() {
        return realmGet$id();
    }

    public void setId(String str) {
        realmSet$id(str);
    }

    public Integer getHardwareId() {
        return realmGet$hardwareId();
    }

    public void setHardwareId(Integer num) {
        realmSet$hardwareId(num);
    }

    public Integer getChannelType() {
        return realmGet$channelType();
    }

    public void setChannelType(Integer num) {
        realmSet$channelType(num);
    }

    public String getName() {
        return realmGet$name();
    }

    public void setName(String str) {
        realmSet$name(str);
    }

    public String getTypeName() {
        return realmGet$typeName();
    }

    public void setTypeName(String str) {
        realmSet$typeName(str);
    }

    public String getGetSettingsWindowUrl() {
        return realmGet$getSettingsWindowUrl();
    }

    public void setGetSettingsWindowUrl(String str) {
        realmSet$getSettingsWindowUrl(str);
    }

    public String getImg() {
        return realmGet$img();
    }

    public void setImg(String str) {
        realmSet$img(str);
    }

    public String getStateText() {
        return realmGet$stateText();
    }

    public void setStateText(String str) {
        realmSet$stateText(str);
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public RoomInfo getRoomInfo() {
        return realmGet$roomInfo();
    }

    public void setRoomInfo(RoomInfo roomInfo2) {
        realmSet$roomInfo(roomInfo2);
    }

    public Integer getState() {
        return realmGet$state();
    }

    public void setState(Integer num) {
        realmSet$state(num);
    }

    public Integer getOnline() {
        return realmGet$online();
    }

    public ManagementType getManagementType() {
        return realmGet$managementType();
    }

    public String getManual() {
        return realmGet$manual();
    }

    public void setManual(String str) {
        realmSet$manual(str);
    }

    public void setManagementType(ManagementType managementType2) {
        realmSet$managementType(managementType2);
    }

    public void setOnline(Integer num) {
        realmSet$online(num);
    }

    public static List<Hardware> getUniqeHardwareByDeviceClassId(List<Hardware> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getState().intValue() == 0) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }

    public static List<SomeString> getUniqeHardwareTitles(List<Hardware> list) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(new SomeString(list.get(i).getDeviceClassTitle()));
        }
        ArrayList arrayList = new ArrayList(hashSet);
        arrayList.add(0, new SomeString(ALL));
        return arrayList;
    }

    public static ArrayList<String> getUniqeHardwareTitlesString(List<Hardware> list) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(list.get(i).getDeviceClassTitle());
        }
        ArrayList<String> arrayList = new ArrayList<>(hashSet);
        arrayList.add(0, LABEL_FILTER_ALL);
        return arrayList;
    }

    public static List<Hardware> getDeviceByTitle(List<Hardware> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Hardware hardware = list.get(i);
            if (hardware.getDeviceClassTitle().equals(str)) {
                arrayList.add(hardware);
            }
        }
        return arrayList;
    }

    public static List<SomePair> getDeviceCountByRoom(List<Hardware> list, List<Rooms> list2) {
        TreeMap treeMap = new TreeMap();
        for (int i = 0; i < list.size(); i++) {
            String title2 = list.get(i).getRoomInfo().getTitle();
            if (treeMap.containsKey(title2)) {
                treeMap.put(title2, Integer.valueOf(((Integer) treeMap.get(title2)).intValue() + 1));
            } else if (!title2.equals(Rooms.NO_ROOM)) {
                treeMap.put(title2, 1);
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            for (int i2 = 0; i2 < list2.size(); i2++) {
                String title3 = list2.get(i2).getTitle();
                if (!treeMap.containsKey(title3)) {
                    treeMap.put(title3, 0);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        int i3 = -1;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (list2 != null) {
                Integer num = i3;
                for (int i4 = 0; i4 < list2.size(); i4++) {
                    if (((String) entry.getKey()).equals(list2.get(i4).getTitle())) {
                        num = list2.get(i4).getId();
                    }
                }
                i3 = num;
            }
            arrayList.add(new SomePair((String) entry.getKey(), ((Integer) entry.getValue()).intValue(), i3));
        }
        arrayList.add(0, new SomePair(LABEL_FILTER_ALL, list.size(), -2));
        return arrayList;
    }

    public String getDescription() {
        return realmGet$description();
    }

    public boolean areItemsTheSame(Hardware hardware) {
        return realmGet$id().equals(hardware.getId());
    }

    public boolean areContentsTheSame(Hardware hardware) {
        return realmGet$state().equals(hardware.getState()) && realmGet$online().equals(hardware.getOnline());
    }

    public static SparseArray<List<HardwareSignal>> getData(RealmList<HardwareSignal> realmList) {
        SparseArray<List<HardwareSignal>> sparseArray = new SparseArray<>();
        if (realmList == null || realmList.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < realmList.size(); i++) {
            HardwareSignal hardwareSignal = realmList.get(i);
            if (hardwareSignal.getTypeControl().equals("uniremote") || (hardwareSignal.getValue() != null && !hardwareSignal.getName().contains("ver"))) {
                if (hardwareSignal.getTypeControl().equals("uniremote")) {
                    arrayList2.add(hardwareSignal);
                } else if (hardwareSignal.getTypeControl().equals("toggle")) {
                    arrayList.add(hardwareSignal);
                }
            }
        }
        sparseArray.put(1, arrayList);
        sparseArray.put(2, arrayList2);
        return sparseArray;
    }

    public String getToken() {
        return realmGet$token();
    }

    public void setToken(String str) {
        realmSet$token(str);
    }

    public String getScenAvailable() {
        return realmGet$scenAvailable();
    }

    public void setScenAvailable(String str) {
        realmSet$scenAvailable(str);
    }

    public String toString() {
        return "Hardware{id='" + realmGet$id() + '\'' + ", groupSignal=" + realmGet$groupSignal() + ", online=" + realmGet$online() + ", roomInfo=" + realmGet$roomInfo() + ", deviceTitle='" + realmGet$deviceTitle() + '\'' + ", stateText='" + realmGet$stateText() + '\'' + ", state=" + realmGet$state() + ", title='" + realmGet$title() + '\'' + ", deviceModelName='" + realmGet$deviceModelName() + '\'' + ", deviceModelTitle='" + realmGet$deviceModelTitle() + '\'' + ", deviceModelId='" + realmGet$deviceModelId() + '\'' + ", deviceClassName='" + realmGet$deviceClassName() + '\'' + ", deviceClassId='" + realmGet$deviceClassId() + '\'' + ", deviceClassTitle='" + realmGet$deviceClassTitle() + '\'' + ", management=" + realmGet$management() + ", istext=" + realmGet$istext() + ", width=" + realmGet$width() + ", height=" + realmGet$height() + ", textsuffix='" + realmGet$textsuffix() + '\'' + ", guid='" + realmGet$guid() + '\'' + ", hardwareId=" + realmGet$hardwareId() + ", channelType=" + realmGet$channelType() + ", name='" + realmGet$name() + '\'' + ", typeName='" + realmGet$typeName() + '\'' + ", getSettingsWindowUrl='" + realmGet$getSettingsWindowUrl() + '\'' + ", img='" + realmGet$img() + '\'' + ", imgApp='" + realmGet$imgApp() + '\'' + ", signals=" + realmGet$signals() + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Hardware)) {
            return false;
        }
        Hardware hardware = (Hardware) obj;
        if (getId() == null ? hardware.getId() != null : !getId().equals(hardware.getId())) {
            return false;
        }
        if (getGroupSignal() == null ? hardware.getGroupSignal() != null : !getGroupSignal().equals(hardware.getGroupSignal())) {
            return false;
        }
        if (getOnline() == null ? hardware.getOnline() != null : !getOnline().equals(hardware.getOnline())) {
            return false;
        }
        if (getRoomInfo() == null ? hardware.getRoomInfo() != null : !getRoomInfo().equals(hardware.getRoomInfo())) {
            return false;
        }
        if (getDeviceTitle() == null ? hardware.getDeviceTitle() != null : !getDeviceTitle().equals(hardware.getDeviceTitle())) {
            return false;
        }
        if (getStateText() == null ? hardware.getStateText() != null : !getStateText().equals(hardware.getStateText())) {
            return false;
        }
        if (getState() == null ? hardware.getState() != null : !getState().equals(hardware.getState())) {
            return false;
        }
        if (getTitle() == null ? hardware.getTitle() != null : !getTitle().equals(hardware.getTitle())) {
            return false;
        }
        if (getDeviceModelName() == null ? hardware.getDeviceModelName() != null : !getDeviceModelName().equals(hardware.getDeviceModelName())) {
            return false;
        }
        if (getDeviceModelTitle() == null ? hardware.getDeviceModelTitle() != null : !getDeviceModelTitle().equals(hardware.getDeviceModelTitle())) {
            return false;
        }
        if (getDeviceModelId() == null ? hardware.getDeviceModelId() != null : !getDeviceModelId().equals(hardware.getDeviceModelId())) {
            return false;
        }
        if (getDeviceClassName() == null ? hardware.getDeviceClassName() != null : !getDeviceClassName().equals(hardware.getDeviceClassName())) {
            return false;
        }
        if (getDeviceClassId() == null ? hardware.getDeviceClassId() != null : !getDeviceClassId().equals(hardware.getDeviceClassId())) {
            return false;
        }
        if (getDeviceClassTitle() == null ? hardware.getDeviceClassTitle() != null : !getDeviceClassTitle().equals(hardware.getDeviceClassTitle())) {
            return false;
        }
        if (getManagement() == null ? hardware.getManagement() != null : !getManagement().equals(hardware.getManagement())) {
            return false;
        }
        if (getIstext() == null ? hardware.getIstext() != null : !getIstext().equals(hardware.getIstext())) {
            return false;
        }
        if (getWidth() == null ? hardware.getWidth() != null : !getWidth().equals(hardware.getWidth())) {
            return false;
        }
        if (getHeight() == null ? hardware.getHeight() != null : !getHeight().equals(hardware.getHeight())) {
            return false;
        }
        if (getTextsuffix() == null ? hardware.getTextsuffix() != null : !getTextsuffix().equals(hardware.getTextsuffix())) {
            return false;
        }
        if (getGuid() == null ? hardware.getGuid() != null : !getGuid().equals(hardware.getGuid())) {
            return false;
        }
        if (getHardwareId() == null ? hardware.getHardwareId() != null : !getHardwareId().equals(hardware.getHardwareId())) {
            return false;
        }
        if (getChannelType() == null ? hardware.getChannelType() != null : !getChannelType().equals(hardware.getChannelType())) {
            return false;
        }
        if (getManagementType() == null ? hardware.getManagementType() != null : !getManagementType().equals(hardware.getManagementType())) {
            return false;
        }
        if (getName() == null ? hardware.getName() != null : !getName().equals(hardware.getName())) {
            return false;
        }
        if (getTypeName() == null ? hardware.getTypeName() != null : !getTypeName().equals(hardware.getTypeName())) {
            return false;
        }
        if (getGetSettingsWindowUrl() == null ? hardware.getGetSettingsWindowUrl() != null : !getGetSettingsWindowUrl().equals(hardware.getGetSettingsWindowUrl())) {
            return false;
        }
        if (getImg() == null ? hardware.getImg() != null : !getImg().equals(hardware.getImg())) {
            return false;
        }
        if (getImgApp() == null ? hardware.getImgApp() != null : !getImgApp().equals(hardware.getImgApp())) {
            return false;
        }
        if (getSignals() != null) {
            return getSignals().equals(hardware.getSignals());
        }
        if (hardware.getSignals() == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((((((((((((((((((((((((((((((((((((((((((((getId() != null ? getId().hashCode() : 0) * 31) + (getGroupSignal() != null ? getGroupSignal().hashCode() : 0)) * 31) + (getOnline() != null ? getOnline().hashCode() : 0)) * 31) + (getRoomInfo() != null ? getRoomInfo().hashCode() : 0)) * 31) + (getDeviceTitle() != null ? getDeviceTitle().hashCode() : 0)) * 31) + (getStateText() != null ? getStateText().hashCode() : 0)) * 31) + (getState() != null ? getState().hashCode() : 0)) * 31) + (getTitle() != null ? getTitle().hashCode() : 0)) * 31) + (getDeviceModelName() != null ? getDeviceModelName().hashCode() : 0)) * 31) + (getDeviceModelTitle() != null ? getDeviceModelTitle().hashCode() : 0)) * 31) + (getDeviceModelId() != null ? getDeviceModelId().hashCode() : 0)) * 31) + (getDeviceClassName() != null ? getDeviceClassName().hashCode() : 0)) * 31) + (getDeviceClassId() != null ? getDeviceClassId().hashCode() : 0)) * 31) + (getDeviceClassTitle() != null ? getDeviceClassTitle().hashCode() : 0)) * 31) + (getManagement() != null ? getManagement().hashCode() : 0)) * 31) + (getIstext() != null ? getIstext().hashCode() : 0)) * 31) + (getWidth() != null ? getWidth().hashCode() : 0)) * 31) + (getHeight() != null ? getHeight().hashCode() : 0)) * 31) + (getTextsuffix() != null ? getTextsuffix().hashCode() : 0)) * 31) + (getGuid() != null ? getGuid().hashCode() : 0)) * 31) + (getHardwareId() != null ? getHardwareId().hashCode() : 0)) * 31) + (getChannelType() != null ? getChannelType().hashCode() : 0)) * 31) + (getManagementType() != null ? getManagementType().hashCode() : 0)) * 31) + (getName() != null ? getName().hashCode() : 0)) * 31) + (getTypeName() != null ? getTypeName().hashCode() : 0)) * 31) + (getGetSettingsWindowUrl() != null ? getGetSettingsWindowUrl().hashCode() : 0)) * 31) + (getImg() != null ? getImg().hashCode() : 0)) * 31) + (getImgApp() != null ? getImgApp().hashCode() : 0)) * 31;
        if (getSignals() != null) {
            i = getSignals().hashCode();
        }
        return hashCode + i;
    }
}
