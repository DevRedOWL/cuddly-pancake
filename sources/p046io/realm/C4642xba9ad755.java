package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.HardwareSignal;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.ManagementType;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo;
import p046io.realm.BaseRealm;
import p046io.realm.C4644x8f0def9d;
import p046io.realm.C4646xa509baca;
import p046io.realm.C4648x51014856;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_HardwareRealmProxy */
public class C4642xba9ad755 extends Hardware implements RealmObjectProxy, C4643xf2712564 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private HardwareColumnInfo columnInfo;
    private ProxyState<Hardware> proxyState;
    private RealmList<HardwareSignal> signalsRealmList;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_HardwareRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Hardware";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_HardwareRealmProxy$HardwareColumnInfo */
    static final class HardwareColumnInfo extends ColumnInfo {
        long channelTypeIndex;
        long descriptionIndex;
        long deviceClassIdIndex;
        long deviceClassNameIndex;
        long deviceClassTitleIndex;
        long deviceModelIdIndex;
        long deviceModelNameIndex;
        long deviceModelTitleIndex;
        long deviceTitleIndex;
        long getSettingsWindowUrlIndex;
        long groupSignalIndex;
        long guidIndex;
        long hardwareIdIndex;
        long heightIndex;
        long idIndex;
        long imgAppIndex;
        long imgIndex;
        long istextIndex;
        long managementIndex;
        long managementTypeIndex;
        long manualIndex;
        long maxColumnIndexValue;
        long nameIndex;
        long onlineIndex;
        long roomInfoIndex;
        long scenAvailableIndex;
        long signalsIndex;
        long stateIndex;
        long stateTextIndex;
        long textsuffixIndex;
        long titleIndex;
        long tokenIndex;
        long typeNameIndex;
        long widthIndex;

        HardwareColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(33);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.groupSignalIndex = addColumnDetails("groupSignal", "groupSignal", objectSchemaInfo);
            this.onlineIndex = addColumnDetails("online", "online", objectSchemaInfo);
            this.roomInfoIndex = addColumnDetails("roomInfo", "roomInfo", objectSchemaInfo);
            this.deviceTitleIndex = addColumnDetails("deviceTitle", "deviceTitle", objectSchemaInfo);
            this.stateTextIndex = addColumnDetails("stateText", "stateText", objectSchemaInfo);
            this.stateIndex = addColumnDetails("state", "state", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.manualIndex = addColumnDetails("manual", "manual", objectSchemaInfo);
            this.deviceModelNameIndex = addColumnDetails("deviceModelName", "deviceModelName", objectSchemaInfo);
            this.deviceModelTitleIndex = addColumnDetails("deviceModelTitle", "deviceModelTitle", objectSchemaInfo);
            this.deviceModelIdIndex = addColumnDetails("deviceModelId", "deviceModelId", objectSchemaInfo);
            this.deviceClassNameIndex = addColumnDetails("deviceClassName", "deviceClassName", objectSchemaInfo);
            this.deviceClassIdIndex = addColumnDetails("deviceClassId", "deviceClassId", objectSchemaInfo);
            this.deviceClassTitleIndex = addColumnDetails("deviceClassTitle", "deviceClassTitle", objectSchemaInfo);
            this.descriptionIndex = addColumnDetails("description", "description", objectSchemaInfo);
            this.managementIndex = addColumnDetails("management", "management", objectSchemaInfo);
            this.istextIndex = addColumnDetails("istext", "istext", objectSchemaInfo);
            this.widthIndex = addColumnDetails("width", "width", objectSchemaInfo);
            this.heightIndex = addColumnDetails("height", "height", objectSchemaInfo);
            this.textsuffixIndex = addColumnDetails("textsuffix", "textsuffix", objectSchemaInfo);
            this.guidIndex = addColumnDetails("guid", "guid", objectSchemaInfo);
            this.hardwareIdIndex = addColumnDetails("hardwareId", "hardwareId", objectSchemaInfo);
            this.channelTypeIndex = addColumnDetails("channelType", "channelType", objectSchemaInfo);
            this.managementTypeIndex = addColumnDetails("managementType", "managementType", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.typeNameIndex = addColumnDetails("typeName", "typeName", objectSchemaInfo);
            this.getSettingsWindowUrlIndex = addColumnDetails("getSettingsWindowUrl", "getSettingsWindowUrl", objectSchemaInfo);
            this.imgIndex = addColumnDetails("img", "img", objectSchemaInfo);
            this.tokenIndex = addColumnDetails("token", "token", objectSchemaInfo);
            this.scenAvailableIndex = addColumnDetails("scenAvailable", "scenAvailable", objectSchemaInfo);
            this.imgAppIndex = addColumnDetails("imgApp", "imgApp", objectSchemaInfo);
            this.signalsIndex = addColumnDetails("signals", "signals", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        HardwareColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new HardwareColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            HardwareColumnInfo hardwareColumnInfo = (HardwareColumnInfo) columnInfo;
            HardwareColumnInfo hardwareColumnInfo2 = (HardwareColumnInfo) columnInfo2;
            hardwareColumnInfo2.idIndex = hardwareColumnInfo.idIndex;
            hardwareColumnInfo2.groupSignalIndex = hardwareColumnInfo.groupSignalIndex;
            hardwareColumnInfo2.onlineIndex = hardwareColumnInfo.onlineIndex;
            hardwareColumnInfo2.roomInfoIndex = hardwareColumnInfo.roomInfoIndex;
            hardwareColumnInfo2.deviceTitleIndex = hardwareColumnInfo.deviceTitleIndex;
            hardwareColumnInfo2.stateTextIndex = hardwareColumnInfo.stateTextIndex;
            hardwareColumnInfo2.stateIndex = hardwareColumnInfo.stateIndex;
            hardwareColumnInfo2.titleIndex = hardwareColumnInfo.titleIndex;
            hardwareColumnInfo2.manualIndex = hardwareColumnInfo.manualIndex;
            hardwareColumnInfo2.deviceModelNameIndex = hardwareColumnInfo.deviceModelNameIndex;
            hardwareColumnInfo2.deviceModelTitleIndex = hardwareColumnInfo.deviceModelTitleIndex;
            hardwareColumnInfo2.deviceModelIdIndex = hardwareColumnInfo.deviceModelIdIndex;
            hardwareColumnInfo2.deviceClassNameIndex = hardwareColumnInfo.deviceClassNameIndex;
            hardwareColumnInfo2.deviceClassIdIndex = hardwareColumnInfo.deviceClassIdIndex;
            hardwareColumnInfo2.deviceClassTitleIndex = hardwareColumnInfo.deviceClassTitleIndex;
            hardwareColumnInfo2.descriptionIndex = hardwareColumnInfo.descriptionIndex;
            hardwareColumnInfo2.managementIndex = hardwareColumnInfo.managementIndex;
            hardwareColumnInfo2.istextIndex = hardwareColumnInfo.istextIndex;
            hardwareColumnInfo2.widthIndex = hardwareColumnInfo.widthIndex;
            hardwareColumnInfo2.heightIndex = hardwareColumnInfo.heightIndex;
            hardwareColumnInfo2.textsuffixIndex = hardwareColumnInfo.textsuffixIndex;
            hardwareColumnInfo2.guidIndex = hardwareColumnInfo.guidIndex;
            hardwareColumnInfo2.hardwareIdIndex = hardwareColumnInfo.hardwareIdIndex;
            hardwareColumnInfo2.channelTypeIndex = hardwareColumnInfo.channelTypeIndex;
            hardwareColumnInfo2.managementTypeIndex = hardwareColumnInfo.managementTypeIndex;
            hardwareColumnInfo2.nameIndex = hardwareColumnInfo.nameIndex;
            hardwareColumnInfo2.typeNameIndex = hardwareColumnInfo.typeNameIndex;
            hardwareColumnInfo2.getSettingsWindowUrlIndex = hardwareColumnInfo.getSettingsWindowUrlIndex;
            hardwareColumnInfo2.imgIndex = hardwareColumnInfo.imgIndex;
            hardwareColumnInfo2.tokenIndex = hardwareColumnInfo.tokenIndex;
            hardwareColumnInfo2.scenAvailableIndex = hardwareColumnInfo.scenAvailableIndex;
            hardwareColumnInfo2.imgAppIndex = hardwareColumnInfo.imgAppIndex;
            hardwareColumnInfo2.signalsIndex = hardwareColumnInfo.signalsIndex;
            hardwareColumnInfo2.maxColumnIndexValue = hardwareColumnInfo.maxColumnIndexValue;
        }
    }

    C4642xba9ad755() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (HardwareColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.idIndex);
    }

    public void realmSet$id(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    public Integer realmGet$groupSignal() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.groupSignalIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.groupSignalIndex));
    }

    public void realmSet$groupSignal(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.groupSignalIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.groupSignalIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.groupSignalIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.groupSignalIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$online() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.onlineIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.onlineIndex));
    }

    public void realmSet$online(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.onlineIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.onlineIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.onlineIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.onlineIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public RoomInfo realmGet$roomInfo() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.roomInfoIndex)) {
            return null;
        }
        return (RoomInfo) this.proxyState.getRealm$realm().get(RoomInfo.class, this.proxyState.getRow$realm().getLink(this.columnInfo.roomInfoIndex), false, Collections.emptyList());
    }

    public void realmSet$roomInfo(RoomInfo roomInfo) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (roomInfo == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.roomInfoIndex);
                return;
            }
            this.proxyState.checkValidObject(roomInfo);
            this.proxyState.getRow$realm().setLink(this.columnInfo.roomInfoIndex, ((RealmObjectProxy) roomInfo).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("roomInfo")) {
            if (roomInfo != null && !RealmObject.isManaged(roomInfo)) {
                roomInfo = (RoomInfo) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(roomInfo, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (roomInfo == null) {
                row$realm.nullifyLink(this.columnInfo.roomInfoIndex);
                return;
            }
            this.proxyState.checkValidObject(roomInfo);
            row$realm.getTable().setLink(this.columnInfo.roomInfoIndex, row$realm.getIndex(), ((RealmObjectProxy) roomInfo).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public String realmGet$deviceTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.deviceTitleIndex);
    }

    public void realmSet$deviceTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.deviceTitleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.deviceTitleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.deviceTitleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.deviceTitleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$stateText() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.stateTextIndex);
    }

    public void realmSet$stateText(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.stateTextIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.stateTextIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.stateTextIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.stateTextIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$state() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.stateIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.stateIndex));
    }

    public void realmSet$state(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.stateIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.stateIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.stateIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.stateIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$title() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.titleIndex);
    }

    public void realmSet$title(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.titleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.titleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.titleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.titleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$manual() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.manualIndex);
    }

    public void realmSet$manual(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.manualIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.manualIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.manualIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.manualIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$deviceModelName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.deviceModelNameIndex);
    }

    public void realmSet$deviceModelName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.deviceModelNameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.deviceModelNameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.deviceModelNameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.deviceModelNameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$deviceModelTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.deviceModelTitleIndex);
    }

    public void realmSet$deviceModelTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.deviceModelTitleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.deviceModelTitleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.deviceModelTitleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.deviceModelTitleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$deviceModelId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.deviceModelIdIndex);
    }

    public void realmSet$deviceModelId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.deviceModelIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.deviceModelIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.deviceModelIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.deviceModelIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$deviceClassName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.deviceClassNameIndex);
    }

    public void realmSet$deviceClassName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.deviceClassNameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.deviceClassNameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.deviceClassNameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.deviceClassNameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$deviceClassId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.deviceClassIdIndex);
    }

    public void realmSet$deviceClassId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.deviceClassIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.deviceClassIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.deviceClassIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.deviceClassIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$deviceClassTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.deviceClassTitleIndex);
    }

    public void realmSet$deviceClassTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.deviceClassTitleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.deviceClassTitleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.deviceClassTitleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.deviceClassTitleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$description() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.descriptionIndex);
    }

    public void realmSet$description(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.descriptionIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.descriptionIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.descriptionIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.descriptionIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$management() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.managementIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.managementIndex));
    }

    public void realmSet$management(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.managementIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.managementIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.managementIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.managementIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$istext() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.istextIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.istextIndex));
    }

    public void realmSet$istext(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.istextIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.istextIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.istextIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.istextIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$width() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.widthIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.widthIndex));
    }

    public void realmSet$width(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.widthIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.widthIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.widthIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.widthIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$height() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.heightIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.heightIndex));
    }

    public void realmSet$height(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.heightIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.heightIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.heightIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.heightIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$textsuffix() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.textsuffixIndex);
    }

    public void realmSet$textsuffix(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.textsuffixIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.textsuffixIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.textsuffixIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.textsuffixIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$guid() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.guidIndex);
    }

    public void realmSet$guid(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.guidIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.guidIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.guidIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.guidIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$hardwareId() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.hardwareIdIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.hardwareIdIndex));
    }

    public void realmSet$hardwareId(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.hardwareIdIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.hardwareIdIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.hardwareIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.hardwareIdIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$channelType() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.channelTypeIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.channelTypeIndex));
    }

    public void realmSet$channelType(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.channelTypeIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.channelTypeIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.channelTypeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.channelTypeIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public ManagementType realmGet$managementType() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.managementTypeIndex)) {
            return null;
        }
        return (ManagementType) this.proxyState.getRealm$realm().get(ManagementType.class, this.proxyState.getRow$realm().getLink(this.columnInfo.managementTypeIndex), false, Collections.emptyList());
    }

    public void realmSet$managementType(ManagementType managementType) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (managementType == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.managementTypeIndex);
                return;
            }
            this.proxyState.checkValidObject(managementType);
            this.proxyState.getRow$realm().setLink(this.columnInfo.managementTypeIndex, ((RealmObjectProxy) managementType).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("managementType")) {
            if (managementType != null && !RealmObject.isManaged(managementType)) {
                managementType = (ManagementType) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(managementType, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (managementType == null) {
                row$realm.nullifyLink(this.columnInfo.managementTypeIndex);
                return;
            }
            this.proxyState.checkValidObject(managementType);
            row$realm.getTable().setLink(this.columnInfo.managementTypeIndex, row$realm.getIndex(), ((RealmObjectProxy) managementType).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public String realmGet$name() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nameIndex);
    }

    public void realmSet$name(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.nameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.nameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.nameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.nameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$typeName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.typeNameIndex);
    }

    public void realmSet$typeName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.typeNameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.typeNameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.typeNameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.typeNameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$getSettingsWindowUrl() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.getSettingsWindowUrlIndex);
    }

    public void realmSet$getSettingsWindowUrl(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.getSettingsWindowUrlIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.getSettingsWindowUrlIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.getSettingsWindowUrlIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.getSettingsWindowUrlIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$img() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.imgIndex);
    }

    public void realmSet$img(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.imgIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.imgIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.imgIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.imgIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$token() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.tokenIndex);
    }

    public void realmSet$token(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.tokenIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.tokenIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.tokenIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.tokenIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$scenAvailable() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.scenAvailableIndex);
    }

    public void realmSet$scenAvailable(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.scenAvailableIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.scenAvailableIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.scenAvailableIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.scenAvailableIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$imgApp() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.imgAppIndex);
    }

    public void realmSet$imgApp(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.imgAppIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.imgAppIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.imgAppIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.imgAppIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RealmList<HardwareSignal> realmGet$signals() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<HardwareSignal> realmList = this.signalsRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.signalsRealmList = new RealmList<>(HardwareSignal.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.signalsIndex), this.proxyState.getRealm$realm());
        return this.signalsRealmList;
    }

    public void realmSet$signals(RealmList<HardwareSignal> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("signals")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<HardwareSignal> realmList2 = new RealmList<>();
                Iterator<HardwareSignal> it = realmList.iterator();
                while (it.hasNext()) {
                    HardwareSignal next = it.next();
                    if (next == null || RealmObject.isManaged(next)) {
                        realmList2.add(next);
                    } else {
                        realmList2.add(realm.copyToRealm(next, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.signalsIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    HardwareSignal hardwareSignal = realmList.get(i);
                    this.proxyState.checkValidObject(hardwareSignal);
                    modelList.addRow(((RealmObjectProxy) hardwareSignal).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            HardwareSignal hardwareSignal2 = realmList.get(i);
            this.proxyState.checkValidObject(hardwareSignal2);
            modelList.setRow((long) i, ((RealmObjectProxy) hardwareSignal2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 33, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("groupSignal", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("online", RealmFieldType.INTEGER, false, false, false);
        builder.addPersistedLinkProperty("roomInfo", RealmFieldType.OBJECT, C4648x51014856.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder3 = builder;
        builder3.addPersistedProperty("deviceTitle", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("stateText", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("state", RealmFieldType.INTEGER, false, false, false);
        builder3.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("manual", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("deviceModelName", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("deviceModelTitle", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("deviceModelId", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("deviceClassName", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("deviceClassId", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("deviceClassTitle", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("description", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("management", RealmFieldType.INTEGER, false, false, false);
        builder3.addPersistedProperty("istext", RealmFieldType.INTEGER, false, false, false);
        builder3.addPersistedProperty("width", RealmFieldType.INTEGER, false, false, false);
        builder3.addPersistedProperty("height", RealmFieldType.INTEGER, false, false, false);
        builder3.addPersistedProperty("textsuffix", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("guid", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("hardwareId", RealmFieldType.INTEGER, false, false, false);
        builder3.addPersistedProperty("channelType", RealmFieldType.INTEGER, false, false, false);
        builder.addPersistedLinkProperty("managementType", RealmFieldType.OBJECT, C4646xa509baca.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder4 = builder;
        builder4.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder4.addPersistedProperty("typeName", RealmFieldType.STRING, false, false, false);
        builder4.addPersistedProperty("getSettingsWindowUrl", RealmFieldType.STRING, false, false, false);
        builder4.addPersistedProperty("img", RealmFieldType.STRING, false, false, false);
        builder4.addPersistedProperty("token", RealmFieldType.STRING, false, false, false);
        builder4.addPersistedProperty("scenAvailable", RealmFieldType.STRING, false, false, false);
        builder4.addPersistedProperty("imgApp", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("signals", RealmFieldType.LIST, C4644x8f0def9d.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static HardwareColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new HardwareColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 3
            r0.<init>(r1)
            java.lang.String r1 = "id"
            r2 = 0
            if (r15 == 0) goto L_0x0066
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware> r3 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware> r5 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_HardwareRealmProxy$HardwareColumnInfo r4 = (p046io.realm.C4642xba9ad755.HardwareColumnInfo) r4
            long r4 = r4.idIndex
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x002a
            long r4 = r3.findFirstNull(r4)
            goto L_0x0032
        L_0x002a:
            java.lang.String r6 = r14.getString(r1)
            long r4 = r3.findFirstString(r4, r6)
        L_0x0032:
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0066
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r6 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r6 = r6.get()
            io.realm.BaseRealm$RealmObjectContext r6 = (p046io.realm.BaseRealm.RealmObjectContext) r6
            io.realm.internal.UncheckedRow r9 = r3.getUncheckedRow(r4)     // Catch:{ all -> 0x0061 }
            io.realm.RealmSchema r3 = r13.getSchema()     // Catch:{ all -> 0x0061 }
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware> r4 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x0061 }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0061 }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0061 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_HardwareRealmProxy r3 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_HardwareRealmProxy     // Catch:{ all -> 0x0061 }
            r3.<init>()     // Catch:{ all -> 0x0061 }
            r6.clear()
            goto L_0x0067
        L_0x0061:
            r13 = move-exception
            r6.clear()
            throw r13
        L_0x0066:
            r3 = r2
        L_0x0067:
            java.lang.String r4 = "signals"
            java.lang.String r5 = "managementType"
            java.lang.String r6 = "roomInfo"
            if (r3 != 0) goto L_0x00b7
            boolean r3 = r14.has(r6)
            if (r3 == 0) goto L_0x0078
            r0.add(r6)
        L_0x0078:
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x0081
            r0.add(r5)
        L_0x0081:
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x008a
            r0.add(r4)
        L_0x008a:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00af
            boolean r3 = r14.isNull(r1)
            r7 = 1
            if (r3 == 0) goto L_0x00a1
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware> r1 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r7, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_HardwareRealmProxy r3 = (p046io.realm.C4642xba9ad755) r3
            goto L_0x00b7
        L_0x00a1:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware> r3 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware.class
            java.lang.String r1 = r14.getString(r1)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r7, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_HardwareRealmProxy r3 = (p046io.realm.C4642xba9ad755) r3
            goto L_0x00b7
        L_0x00af:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00b7:
            r0 = r3
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_HardwareRealmProxyInterface r0 = (p046io.realm.C4643xf2712564) r0
            java.lang.String r1 = "groupSignal"
            boolean r7 = r14.has(r1)
            if (r7 == 0) goto L_0x00d7
            boolean r7 = r14.isNull(r1)
            if (r7 == 0) goto L_0x00cc
            r0.realmSet$groupSignal(r2)
            goto L_0x00d7
        L_0x00cc:
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$groupSignal(r1)
        L_0x00d7:
            java.lang.String r1 = "online"
            boolean r7 = r14.has(r1)
            if (r7 == 0) goto L_0x00f4
            boolean r7 = r14.isNull(r1)
            if (r7 == 0) goto L_0x00e9
            r0.realmSet$online(r2)
            goto L_0x00f4
        L_0x00e9:
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$online(r1)
        L_0x00f4:
            boolean r1 = r14.has(r6)
            if (r1 == 0) goto L_0x010f
            boolean r1 = r14.isNull(r6)
            if (r1 == 0) goto L_0x0104
            r0.realmSet$roomInfo(r2)
            goto L_0x010f
        L_0x0104:
            org.json.JSONObject r1 = r14.getJSONObject(r6)
            ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo r1 = p046io.realm.C4648x51014856.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$roomInfo(r1)
        L_0x010f:
            java.lang.String r1 = "deviceTitle"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0128
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x0121
            r0.realmSet$deviceTitle(r2)
            goto L_0x0128
        L_0x0121:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$deviceTitle(r1)
        L_0x0128:
            java.lang.String r1 = "stateText"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0141
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x013a
            r0.realmSet$stateText(r2)
            goto L_0x0141
        L_0x013a:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$stateText(r1)
        L_0x0141:
            java.lang.String r1 = "state"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x015e
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x0153
            r0.realmSet$state(r2)
            goto L_0x015e
        L_0x0153:
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$state(r1)
        L_0x015e:
            java.lang.String r1 = "title"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0177
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x0170
            r0.realmSet$title(r2)
            goto L_0x0177
        L_0x0170:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$title(r1)
        L_0x0177:
            java.lang.String r1 = "manual"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0190
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x0189
            r0.realmSet$manual(r2)
            goto L_0x0190
        L_0x0189:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$manual(r1)
        L_0x0190:
            java.lang.String r1 = "deviceModelName"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x01a9
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x01a2
            r0.realmSet$deviceModelName(r2)
            goto L_0x01a9
        L_0x01a2:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$deviceModelName(r1)
        L_0x01a9:
            java.lang.String r1 = "deviceModelTitle"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x01c2
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x01bb
            r0.realmSet$deviceModelTitle(r2)
            goto L_0x01c2
        L_0x01bb:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$deviceModelTitle(r1)
        L_0x01c2:
            java.lang.String r1 = "deviceModelId"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x01df
            java.lang.String r1 = "deviceModelId"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x01d6
            r0.realmSet$deviceModelId(r2)
            goto L_0x01df
        L_0x01d6:
            java.lang.String r1 = "deviceModelId"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$deviceModelId(r1)
        L_0x01df:
            java.lang.String r1 = "deviceClassName"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x01fc
            java.lang.String r1 = "deviceClassName"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x01f3
            r0.realmSet$deviceClassName(r2)
            goto L_0x01fc
        L_0x01f3:
            java.lang.String r1 = "deviceClassName"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$deviceClassName(r1)
        L_0x01fc:
            java.lang.String r1 = "deviceClassId"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x0219
            java.lang.String r1 = "deviceClassId"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x0210
            r0.realmSet$deviceClassId(r2)
            goto L_0x0219
        L_0x0210:
            java.lang.String r1 = "deviceClassId"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$deviceClassId(r1)
        L_0x0219:
            java.lang.String r1 = "deviceClassTitle"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x0236
            java.lang.String r1 = "deviceClassTitle"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x022d
            r0.realmSet$deviceClassTitle(r2)
            goto L_0x0236
        L_0x022d:
            java.lang.String r1 = "deviceClassTitle"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$deviceClassTitle(r1)
        L_0x0236:
            java.lang.String r1 = "description"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x0253
            java.lang.String r1 = "description"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x024a
            r0.realmSet$description(r2)
            goto L_0x0253
        L_0x024a:
            java.lang.String r1 = "description"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$description(r1)
        L_0x0253:
            java.lang.String r1 = "management"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x0274
            java.lang.String r1 = "management"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x0267
            r0.realmSet$management(r2)
            goto L_0x0274
        L_0x0267:
            java.lang.String r1 = "management"
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$management(r1)
        L_0x0274:
            java.lang.String r1 = "istext"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x0295
            java.lang.String r1 = "istext"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x0288
            r0.realmSet$istext(r2)
            goto L_0x0295
        L_0x0288:
            java.lang.String r1 = "istext"
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$istext(r1)
        L_0x0295:
            java.lang.String r1 = "width"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x02b9
            java.lang.String r1 = "width"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x02ab
            r0.realmSet$width(r2)
            goto L_0x02b9
        L_0x02ab:
            java.lang.String r1 = "width"
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$width(r1)
        L_0x02b9:
            java.lang.String r1 = "height"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x02da
            java.lang.String r1 = "height"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x02cd
            r0.realmSet$height(r2)
            goto L_0x02da
        L_0x02cd:
            java.lang.String r1 = "height"
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$height(r1)
        L_0x02da:
            java.lang.String r1 = "textsuffix"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x02f7
            java.lang.String r1 = "textsuffix"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x02ee
            r0.realmSet$textsuffix(r2)
            goto L_0x02f7
        L_0x02ee:
            java.lang.String r1 = "textsuffix"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$textsuffix(r1)
        L_0x02f7:
            java.lang.String r1 = "guid"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x0314
            java.lang.String r1 = "guid"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x030b
            r0.realmSet$guid(r2)
            goto L_0x0314
        L_0x030b:
            java.lang.String r1 = "guid"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$guid(r1)
        L_0x0314:
            java.lang.String r1 = "hardwareId"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x0335
            java.lang.String r1 = "hardwareId"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x0328
            r0.realmSet$hardwareId(r2)
            goto L_0x0335
        L_0x0328:
            java.lang.String r1 = "hardwareId"
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$hardwareId(r1)
        L_0x0335:
            java.lang.String r1 = "channelType"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x0356
            java.lang.String r1 = "channelType"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x0349
            r0.realmSet$channelType(r2)
            goto L_0x0356
        L_0x0349:
            java.lang.String r1 = "channelType"
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$channelType(r1)
        L_0x0356:
            boolean r1 = r14.has(r5)
            if (r1 == 0) goto L_0x0371
            boolean r1 = r14.isNull(r5)
            if (r1 == 0) goto L_0x0366
            r0.realmSet$managementType(r2)
            goto L_0x0371
        L_0x0366:
            org.json.JSONObject r1 = r14.getJSONObject(r5)
            ru.unicorn.ujin.view.activity.navigation.entity.hardware.ManagementType r1 = p046io.realm.C4646xa509baca.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$managementType(r1)
        L_0x0371:
            java.lang.String r1 = "name"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x038e
            java.lang.String r1 = "name"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x0385
            r0.realmSet$name(r2)
            goto L_0x038e
        L_0x0385:
            java.lang.String r1 = "name"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$name(r1)
        L_0x038e:
            java.lang.String r1 = "typeName"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x03ae
            java.lang.String r1 = "typeName"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x03a4
            r0.realmSet$typeName(r2)
            goto L_0x03ae
        L_0x03a4:
            java.lang.String r1 = "typeName"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$typeName(r1)
        L_0x03ae:
            java.lang.String r1 = "getSettingsWindowUrl"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x03cb
            java.lang.String r1 = "getSettingsWindowUrl"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x03c2
            r0.realmSet$getSettingsWindowUrl(r2)
            goto L_0x03cb
        L_0x03c2:
            java.lang.String r1 = "getSettingsWindowUrl"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$getSettingsWindowUrl(r1)
        L_0x03cb:
            java.lang.String r1 = "img"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x03e8
            java.lang.String r1 = "img"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x03df
            r0.realmSet$img(r2)
            goto L_0x03e8
        L_0x03df:
            java.lang.String r1 = "img"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$img(r1)
        L_0x03e8:
            java.lang.String r1 = "token"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x0408
            java.lang.String r1 = "token"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x03fe
            r0.realmSet$token(r2)
            goto L_0x0408
        L_0x03fe:
            java.lang.String r1 = "token"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$token(r1)
        L_0x0408:
            java.lang.String r1 = "scenAvailable"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x0425
            java.lang.String r1 = "scenAvailable"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x041c
            r0.realmSet$scenAvailable(r2)
            goto L_0x0425
        L_0x041c:
            java.lang.String r1 = "scenAvailable"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$scenAvailable(r1)
        L_0x0425:
            java.lang.String r1 = "imgApp"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x0442
            java.lang.String r1 = "imgApp"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x0439
            r0.realmSet$imgApp(r2)
            goto L_0x0442
        L_0x0439:
            java.lang.String r1 = "imgApp"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$imgApp(r1)
        L_0x0442:
            boolean r1 = r14.has(r4)
            if (r1 == 0) goto L_0x0476
            boolean r1 = r14.isNull(r4)
            if (r1 == 0) goto L_0x0452
            r0.realmSet$signals(r2)
            goto L_0x0476
        L_0x0452:
            io.realm.RealmList r1 = r0.realmGet$signals()
            r1.clear()
            org.json.JSONArray r14 = r14.getJSONArray(r4)
            r1 = 0
        L_0x045e:
            int r2 = r14.length()
            if (r1 >= r2) goto L_0x0476
            org.json.JSONObject r2 = r14.getJSONObject(r1)
            ru.unicorn.ujin.view.activity.navigation.entity.hardware.HardwareSignal r2 = p046io.realm.C4644x8f0def9d.createOrUpdateUsingJsonObject(r13, r2, r15)
            io.realm.RealmList r4 = r0.realmGet$signals()
            r4.add(r2)
            int r1 = r1 + 1
            goto L_0x045e
        L_0x0476:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4642xba9ad755.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware");
    }

    public static Hardware createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Hardware hardware = new Hardware();
        C4643xf2712564 ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface = hardware;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("groupSignal")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$groupSignal(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$groupSignal((Integer) null);
                }
            } else if (nextName.equals("online")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$online(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$online((Integer) null);
                }
            } else if (nextName.equals("roomInfo")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$roomInfo((RoomInfo) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$roomInfo(C4648x51014856.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("deviceTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$deviceTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$deviceTitle((String) null);
                }
            } else if (nextName.equals("stateText")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$stateText(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$stateText((String) null);
                }
            } else if (nextName.equals("state")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$state(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$state((Integer) null);
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("manual")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$manual(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$manual((String) null);
                }
            } else if (nextName.equals("deviceModelName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$deviceModelName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$deviceModelName((String) null);
                }
            } else if (nextName.equals("deviceModelTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$deviceModelTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$deviceModelTitle((String) null);
                }
            } else if (nextName.equals("deviceModelId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$deviceModelId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$deviceModelId((String) null);
                }
            } else if (nextName.equals("deviceClassName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$deviceClassName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$deviceClassName((String) null);
                }
            } else if (nextName.equals("deviceClassId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$deviceClassId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$deviceClassId((String) null);
                }
            } else if (nextName.equals("deviceClassTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$deviceClassTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$deviceClassTitle((String) null);
                }
            } else if (nextName.equals("description")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$description(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$description((String) null);
                }
            } else if (nextName.equals("management")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$management(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$management((Integer) null);
                }
            } else if (nextName.equals("istext")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$istext(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$istext((Integer) null);
                }
            } else if (nextName.equals("width")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$width(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$width((Integer) null);
                }
            } else if (nextName.equals("height")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$height(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$height((Integer) null);
                }
            } else if (nextName.equals("textsuffix")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$textsuffix(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$textsuffix((String) null);
                }
            } else if (nextName.equals("guid")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$guid(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$guid((String) null);
                }
            } else if (nextName.equals("hardwareId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$hardwareId(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$hardwareId((Integer) null);
                }
            } else if (nextName.equals("channelType")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$channelType(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$channelType((Integer) null);
                }
            } else if (nextName.equals("managementType")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$managementType((ManagementType) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$managementType(C4646xa509baca.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals("typeName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$typeName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$typeName((String) null);
                }
            } else if (nextName.equals("getSettingsWindowUrl")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$getSettingsWindowUrl(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$getSettingsWindowUrl((String) null);
                }
            } else if (nextName.equals("img")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$img(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$img((String) null);
                }
            } else if (nextName.equals("token")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$token(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$token((String) null);
                }
            } else if (nextName.equals("scenAvailable")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$scenAvailable(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$scenAvailable((String) null);
                }
            } else if (nextName.equals("imgApp")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$imgApp(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$imgApp((String) null);
                }
            } else if (!nextName.equals("signals")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$signals((RealmList<HardwareSignal>) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$signals(new RealmList());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$signals().add(C4644x8f0def9d.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Hardware) realm.copyToRealm(hardware, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4642xba9ad755 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Hardware.class), false, Collections.emptyList());
        C4642xba9ad755 ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxy = new C4642xba9ad755();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4642xba9ad755.HardwareColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
        /*
            boolean r0 = r10 instanceof p046io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L_0x0038
            r0 = r10
            io.realm.internal.RealmObjectProxy r0 = (p046io.realm.internal.RealmObjectProxy) r0
            io.realm.ProxyState r1 = r0.realmGet$proxyState()
            io.realm.BaseRealm r1 = r1.getRealm$realm()
            if (r1 == 0) goto L_0x0038
            io.realm.ProxyState r0 = r0.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            long r1 = r0.threadId
            long r3 = r8.threadId
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0030
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = r8.getPath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            return r10
        L_0x0030:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Objects which belong to Realm instances in other threads cannot be copied into this Realm instance."
            r8.<init>(r9)
            throw r8
        L_0x0038:
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r0 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r0 = r0.get()
            io.realm.BaseRealm$RealmObjectContext r0 = (p046io.realm.BaseRealm.RealmObjectContext) r0
            java.lang.Object r1 = r12.get(r10)
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            if (r1 == 0) goto L_0x004b
            ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware r1 = (p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware> r2 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_HardwareRealmProxyInterface r5 = (p046io.realm.C4643xf2712564) r5
            java.lang.String r5 = r5.realmGet$id()
            if (r5 != 0) goto L_0x0064
            long r3 = r2.findFirstNull(r3)
            goto L_0x0068
        L_0x0064:
            long r3 = r2.findFirstString(r3, r5)
        L_0x0068:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0070
            r0 = 0
            goto L_0x0094
        L_0x0070:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x008e }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x008e }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x008e }
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_HardwareRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_HardwareRealmProxy     // Catch:{ all -> 0x008e }
            r1.<init>()     // Catch:{ all -> 0x008e }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x008e }
            r12.put(r10, r2)     // Catch:{ all -> 0x008e }
            r0.clear()
            goto L_0x0093
        L_0x008e:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x0093:
            r0 = r11
        L_0x0094:
            r3 = r1
            if (r0 == 0) goto L_0x00a1
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4642xba9ad755.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_HardwareRealmProxy$HardwareColumnInfo, ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware");
    }

    public static Hardware copy(Realm realm, HardwareColumnInfo hardwareColumnInfo, Hardware hardware, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(hardware);
        if (realmObjectProxy != null) {
            return (Hardware) realmObjectProxy;
        }
        C4643xf2712564 ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface = hardware;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Hardware.class), hardwareColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(hardwareColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$id());
        osObjectBuilder.addInteger(hardwareColumnInfo.groupSignalIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$groupSignal());
        osObjectBuilder.addInteger(hardwareColumnInfo.onlineIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$online());
        osObjectBuilder.addString(hardwareColumnInfo.deviceTitleIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceTitle());
        osObjectBuilder.addString(hardwareColumnInfo.stateTextIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$stateText());
        osObjectBuilder.addInteger(hardwareColumnInfo.stateIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$state());
        osObjectBuilder.addString(hardwareColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(hardwareColumnInfo.manualIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$manual());
        osObjectBuilder.addString(hardwareColumnInfo.deviceModelNameIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceModelName());
        osObjectBuilder.addString(hardwareColumnInfo.deviceModelTitleIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceModelTitle());
        osObjectBuilder.addString(hardwareColumnInfo.deviceModelIdIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceModelId());
        osObjectBuilder.addString(hardwareColumnInfo.deviceClassNameIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceClassName());
        osObjectBuilder.addString(hardwareColumnInfo.deviceClassIdIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceClassId());
        osObjectBuilder.addString(hardwareColumnInfo.deviceClassTitleIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceClassTitle());
        osObjectBuilder.addString(hardwareColumnInfo.descriptionIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$description());
        osObjectBuilder.addInteger(hardwareColumnInfo.managementIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$management());
        osObjectBuilder.addInteger(hardwareColumnInfo.istextIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$istext());
        osObjectBuilder.addInteger(hardwareColumnInfo.widthIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$width());
        osObjectBuilder.addInteger(hardwareColumnInfo.heightIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$height());
        osObjectBuilder.addString(hardwareColumnInfo.textsuffixIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$textsuffix());
        osObjectBuilder.addString(hardwareColumnInfo.guidIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$guid());
        osObjectBuilder.addInteger(hardwareColumnInfo.hardwareIdIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$hardwareId());
        osObjectBuilder.addInteger(hardwareColumnInfo.channelTypeIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$channelType());
        osObjectBuilder.addString(hardwareColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(hardwareColumnInfo.typeNameIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$typeName());
        osObjectBuilder.addString(hardwareColumnInfo.getSettingsWindowUrlIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$getSettingsWindowUrl());
        osObjectBuilder.addString(hardwareColumnInfo.imgIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$img());
        osObjectBuilder.addString(hardwareColumnInfo.tokenIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$token());
        osObjectBuilder.addString(hardwareColumnInfo.scenAvailableIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$scenAvailable());
        osObjectBuilder.addString(hardwareColumnInfo.imgAppIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$imgApp());
        C4642xba9ad755 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(hardware, newProxyInstance);
        RoomInfo realmGet$roomInfo = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$roomInfo();
        if (realmGet$roomInfo == null) {
            newProxyInstance.realmSet$roomInfo((RoomInfo) null);
        } else {
            RoomInfo roomInfo = (RoomInfo) map.get(realmGet$roomInfo);
            if (roomInfo != null) {
                newProxyInstance.realmSet$roomInfo(roomInfo);
            } else {
                newProxyInstance.realmSet$roomInfo(C4648x51014856.copyOrUpdate(realm, (C4648x51014856.RoomInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RoomInfo.class), realmGet$roomInfo, z, map, set));
            }
        }
        ManagementType realmGet$managementType = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$managementType();
        if (realmGet$managementType == null) {
            newProxyInstance.realmSet$managementType((ManagementType) null);
        } else {
            ManagementType managementType = (ManagementType) map.get(realmGet$managementType);
            if (managementType != null) {
                newProxyInstance.realmSet$managementType(managementType);
            } else {
                newProxyInstance.realmSet$managementType(C4646xa509baca.copyOrUpdate(realm, (C4646xa509baca.ManagementTypeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ManagementType.class), realmGet$managementType, z, map, set));
            }
        }
        RealmList<HardwareSignal> realmGet$signals = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$signals();
        if (realmGet$signals != null) {
            RealmList<HardwareSignal> realmGet$signals2 = newProxyInstance.realmGet$signals();
            realmGet$signals2.clear();
            for (int i = 0; i < realmGet$signals.size(); i++) {
                HardwareSignal hardwareSignal = realmGet$signals.get(i);
                HardwareSignal hardwareSignal2 = (HardwareSignal) map.get(hardwareSignal);
                if (hardwareSignal2 != null) {
                    realmGet$signals2.add(hardwareSignal2);
                } else {
                    realmGet$signals2.add(C4644x8f0def9d.copyOrUpdate(realm, (C4644x8f0def9d.HardwareSignalColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) HardwareSignal.class), hardwareSignal, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Hardware hardware, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Hardware hardware2 = hardware;
        Map<RealmModel, Long> map2 = map;
        if (hardware2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) hardware2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Hardware.class);
        long nativePtr = table.getNativePtr();
        HardwareColumnInfo hardwareColumnInfo = (HardwareColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Hardware.class);
        long j4 = hardwareColumnInfo.idIndex;
        C4643xf2712564 ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface = hardware2;
        String realmGet$id = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j4);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j4, realmGet$id);
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j4, realmGet$id);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map2.put(hardware2, Long.valueOf(j2));
        Integer realmGet$groupSignal = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$groupSignal();
        if (realmGet$groupSignal != null) {
            j3 = j2;
            Table.nativeSetLong(nativePtr, hardwareColumnInfo.groupSignalIndex, j2, realmGet$groupSignal.longValue(), false);
        } else {
            j3 = j2;
        }
        Integer realmGet$online = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$online();
        if (realmGet$online != null) {
            Table.nativeSetLong(nativePtr, hardwareColumnInfo.onlineIndex, j3, realmGet$online.longValue(), false);
        }
        RoomInfo realmGet$roomInfo = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$roomInfo();
        if (realmGet$roomInfo != null) {
            Long l = map2.get(realmGet$roomInfo);
            if (l == null) {
                l = Long.valueOf(C4648x51014856.insert(realm2, realmGet$roomInfo, map2));
            }
            Table.nativeSetLink(nativePtr, hardwareColumnInfo.roomInfoIndex, j3, l.longValue(), false);
        }
        String realmGet$deviceTitle = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceTitle();
        if (realmGet$deviceTitle != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceTitleIndex, j3, realmGet$deviceTitle, false);
        }
        String realmGet$stateText = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$stateText();
        if (realmGet$stateText != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.stateTextIndex, j3, realmGet$stateText, false);
        }
        Integer realmGet$state = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$state();
        if (realmGet$state != null) {
            Table.nativeSetLong(nativePtr, hardwareColumnInfo.stateIndex, j3, realmGet$state.longValue(), false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.titleIndex, j3, realmGet$title, false);
        }
        String realmGet$manual = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$manual();
        if (realmGet$manual != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.manualIndex, j3, realmGet$manual, false);
        }
        String realmGet$deviceModelName = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceModelName();
        if (realmGet$deviceModelName != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceModelNameIndex, j3, realmGet$deviceModelName, false);
        }
        String realmGet$deviceModelTitle = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceModelTitle();
        if (realmGet$deviceModelTitle != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceModelTitleIndex, j3, realmGet$deviceModelTitle, false);
        }
        String realmGet$deviceModelId = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceModelId();
        if (realmGet$deviceModelId != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceModelIdIndex, j3, realmGet$deviceModelId, false);
        }
        String realmGet$deviceClassName = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceClassName();
        if (realmGet$deviceClassName != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceClassNameIndex, j3, realmGet$deviceClassName, false);
        }
        String realmGet$deviceClassId = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceClassId();
        if (realmGet$deviceClassId != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceClassIdIndex, j3, realmGet$deviceClassId, false);
        }
        String realmGet$deviceClassTitle = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceClassTitle();
        if (realmGet$deviceClassTitle != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceClassTitleIndex, j3, realmGet$deviceClassTitle, false);
        }
        String realmGet$description = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.descriptionIndex, j3, realmGet$description, false);
        }
        Integer realmGet$management = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$management();
        if (realmGet$management != null) {
            Table.nativeSetLong(nativePtr, hardwareColumnInfo.managementIndex, j3, realmGet$management.longValue(), false);
        }
        Integer realmGet$istext = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$istext();
        if (realmGet$istext != null) {
            Table.nativeSetLong(nativePtr, hardwareColumnInfo.istextIndex, j3, realmGet$istext.longValue(), false);
        }
        Integer realmGet$width = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$width();
        if (realmGet$width != null) {
            Table.nativeSetLong(nativePtr, hardwareColumnInfo.widthIndex, j3, realmGet$width.longValue(), false);
        }
        Integer realmGet$height = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$height();
        if (realmGet$height != null) {
            Table.nativeSetLong(nativePtr, hardwareColumnInfo.heightIndex, j3, realmGet$height.longValue(), false);
        }
        String realmGet$textsuffix = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$textsuffix();
        if (realmGet$textsuffix != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.textsuffixIndex, j3, realmGet$textsuffix, false);
        }
        String realmGet$guid = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$guid();
        if (realmGet$guid != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.guidIndex, j3, realmGet$guid, false);
        }
        Integer realmGet$hardwareId = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$hardwareId();
        if (realmGet$hardwareId != null) {
            Table.nativeSetLong(nativePtr, hardwareColumnInfo.hardwareIdIndex, j3, realmGet$hardwareId.longValue(), false);
        }
        Integer realmGet$channelType = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$channelType();
        if (realmGet$channelType != null) {
            Table.nativeSetLong(nativePtr, hardwareColumnInfo.channelTypeIndex, j3, realmGet$channelType.longValue(), false);
        }
        ManagementType realmGet$managementType = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$managementType();
        if (realmGet$managementType != null) {
            Long l2 = map2.get(realmGet$managementType);
            if (l2 == null) {
                l2 = Long.valueOf(C4646xa509baca.insert(realm2, realmGet$managementType, map2));
            }
            Table.nativeSetLink(nativePtr, hardwareColumnInfo.managementTypeIndex, j3, l2.longValue(), false);
        }
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.nameIndex, j3, realmGet$name, false);
        }
        String realmGet$typeName = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$typeName();
        if (realmGet$typeName != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.typeNameIndex, j3, realmGet$typeName, false);
        }
        String realmGet$getSettingsWindowUrl = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$getSettingsWindowUrl();
        if (realmGet$getSettingsWindowUrl != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.getSettingsWindowUrlIndex, j3, realmGet$getSettingsWindowUrl, false);
        }
        String realmGet$img = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$img();
        if (realmGet$img != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.imgIndex, j3, realmGet$img, false);
        }
        String realmGet$token = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$token();
        if (realmGet$token != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.tokenIndex, j3, realmGet$token, false);
        }
        String realmGet$scenAvailable = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$scenAvailable();
        if (realmGet$scenAvailable != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.scenAvailableIndex, j3, realmGet$scenAvailable, false);
        }
        String realmGet$imgApp = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$imgApp();
        if (realmGet$imgApp != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.imgAppIndex, j3, realmGet$imgApp, false);
        }
        RealmList<HardwareSignal> realmGet$signals = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$signals();
        if (realmGet$signals == null) {
            return j3;
        }
        long j5 = j3;
        OsList osList = new OsList(table.getUncheckedRow(j5), hardwareColumnInfo.signalsIndex);
        Iterator<HardwareSignal> it = realmGet$signals.iterator();
        while (it.hasNext()) {
            HardwareSignal next = it.next();
            Long l3 = map2.get(next);
            if (l3 == null) {
                l3 = Long.valueOf(C4644x8f0def9d.insert(realm2, next, map2));
            }
            osList.addRow(l3.longValue());
        }
        return j5;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Hardware.class);
        long nativePtr = table.getNativePtr();
        HardwareColumnInfo hardwareColumnInfo = (HardwareColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Hardware.class);
        long j5 = hardwareColumnInfo.idIndex;
        while (it.hasNext()) {
            Hardware hardware = (Hardware) it.next();
            if (!map2.containsKey(hardware)) {
                if (hardware instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) hardware;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(hardware, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4643xf2712564 ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface = hardware;
                String realmGet$id = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j5);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j5, realmGet$id);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j5, realmGet$id);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                    j2 = j;
                }
                map2.put(hardware, Long.valueOf(j2));
                Integer realmGet$groupSignal = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$groupSignal();
                if (realmGet$groupSignal != null) {
                    j4 = j2;
                    j3 = j5;
                    Table.nativeSetLong(nativePtr, hardwareColumnInfo.groupSignalIndex, j2, realmGet$groupSignal.longValue(), false);
                } else {
                    j4 = j2;
                    j3 = j5;
                }
                Integer realmGet$online = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$online();
                if (realmGet$online != null) {
                    Table.nativeSetLong(nativePtr, hardwareColumnInfo.onlineIndex, j4, realmGet$online.longValue(), false);
                }
                RoomInfo realmGet$roomInfo = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$roomInfo();
                if (realmGet$roomInfo != null) {
                    Long l = map2.get(realmGet$roomInfo);
                    if (l == null) {
                        l = Long.valueOf(C4648x51014856.insert(realm2, realmGet$roomInfo, map2));
                    }
                    table.setLink(hardwareColumnInfo.roomInfoIndex, j4, l.longValue(), false);
                }
                String realmGet$deviceTitle = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceTitle();
                if (realmGet$deviceTitle != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceTitleIndex, j4, realmGet$deviceTitle, false);
                }
                String realmGet$stateText = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$stateText();
                if (realmGet$stateText != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.stateTextIndex, j4, realmGet$stateText, false);
                }
                Integer realmGet$state = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$state();
                if (realmGet$state != null) {
                    Table.nativeSetLong(nativePtr, hardwareColumnInfo.stateIndex, j4, realmGet$state.longValue(), false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.titleIndex, j4, realmGet$title, false);
                }
                String realmGet$manual = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$manual();
                if (realmGet$manual != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.manualIndex, j4, realmGet$manual, false);
                }
                String realmGet$deviceModelName = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceModelName();
                if (realmGet$deviceModelName != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceModelNameIndex, j4, realmGet$deviceModelName, false);
                }
                String realmGet$deviceModelTitle = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceModelTitle();
                if (realmGet$deviceModelTitle != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceModelTitleIndex, j4, realmGet$deviceModelTitle, false);
                }
                String realmGet$deviceModelId = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceModelId();
                if (realmGet$deviceModelId != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceModelIdIndex, j4, realmGet$deviceModelId, false);
                }
                String realmGet$deviceClassName = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceClassName();
                if (realmGet$deviceClassName != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceClassNameIndex, j4, realmGet$deviceClassName, false);
                }
                String realmGet$deviceClassId = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceClassId();
                if (realmGet$deviceClassId != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceClassIdIndex, j4, realmGet$deviceClassId, false);
                }
                String realmGet$deviceClassTitle = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceClassTitle();
                if (realmGet$deviceClassTitle != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceClassTitleIndex, j4, realmGet$deviceClassTitle, false);
                }
                String realmGet$description = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.descriptionIndex, j4, realmGet$description, false);
                }
                Integer realmGet$management = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$management();
                if (realmGet$management != null) {
                    Table.nativeSetLong(nativePtr, hardwareColumnInfo.managementIndex, j4, realmGet$management.longValue(), false);
                }
                Integer realmGet$istext = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$istext();
                if (realmGet$istext != null) {
                    Table.nativeSetLong(nativePtr, hardwareColumnInfo.istextIndex, j4, realmGet$istext.longValue(), false);
                }
                Integer realmGet$width = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$width();
                if (realmGet$width != null) {
                    Table.nativeSetLong(nativePtr, hardwareColumnInfo.widthIndex, j4, realmGet$width.longValue(), false);
                }
                Integer realmGet$height = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$height();
                if (realmGet$height != null) {
                    Table.nativeSetLong(nativePtr, hardwareColumnInfo.heightIndex, j4, realmGet$height.longValue(), false);
                }
                String realmGet$textsuffix = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$textsuffix();
                if (realmGet$textsuffix != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.textsuffixIndex, j4, realmGet$textsuffix, false);
                }
                String realmGet$guid = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$guid();
                if (realmGet$guid != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.guidIndex, j4, realmGet$guid, false);
                }
                Integer realmGet$hardwareId = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$hardwareId();
                if (realmGet$hardwareId != null) {
                    Table.nativeSetLong(nativePtr, hardwareColumnInfo.hardwareIdIndex, j4, realmGet$hardwareId.longValue(), false);
                }
                Integer realmGet$channelType = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$channelType();
                if (realmGet$channelType != null) {
                    Table.nativeSetLong(nativePtr, hardwareColumnInfo.channelTypeIndex, j4, realmGet$channelType.longValue(), false);
                }
                ManagementType realmGet$managementType = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$managementType();
                if (realmGet$managementType != null) {
                    Long l2 = map2.get(realmGet$managementType);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4646xa509baca.insert(realm2, realmGet$managementType, map2));
                    }
                    table.setLink(hardwareColumnInfo.managementTypeIndex, j4, l2.longValue(), false);
                }
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.nameIndex, j4, realmGet$name, false);
                }
                String realmGet$typeName = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$typeName();
                if (realmGet$typeName != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.typeNameIndex, j4, realmGet$typeName, false);
                }
                String realmGet$getSettingsWindowUrl = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$getSettingsWindowUrl();
                if (realmGet$getSettingsWindowUrl != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.getSettingsWindowUrlIndex, j4, realmGet$getSettingsWindowUrl, false);
                }
                String realmGet$img = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$img();
                if (realmGet$img != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.imgIndex, j4, realmGet$img, false);
                }
                String realmGet$token = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$token();
                if (realmGet$token != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.tokenIndex, j4, realmGet$token, false);
                }
                String realmGet$scenAvailable = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$scenAvailable();
                if (realmGet$scenAvailable != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.scenAvailableIndex, j4, realmGet$scenAvailable, false);
                }
                String realmGet$imgApp = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$imgApp();
                if (realmGet$imgApp != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.imgAppIndex, j4, realmGet$imgApp, false);
                }
                RealmList<HardwareSignal> realmGet$signals = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$signals();
                if (realmGet$signals != null) {
                    OsList osList = new OsList(table.getUncheckedRow(j4), hardwareColumnInfo.signalsIndex);
                    Iterator<HardwareSignal> it2 = realmGet$signals.iterator();
                    while (it2.hasNext()) {
                        HardwareSignal next = it2.next();
                        Long l3 = map2.get(next);
                        if (l3 == null) {
                            l3 = Long.valueOf(C4644x8f0def9d.insert(realm2, next, map2));
                        }
                        osList.addRow(l3.longValue());
                    }
                }
                j5 = j3;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Hardware hardware, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Hardware hardware2 = hardware;
        Map<RealmModel, Long> map2 = map;
        if (hardware2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) hardware2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Hardware.class);
        long nativePtr = table.getNativePtr();
        HardwareColumnInfo hardwareColumnInfo = (HardwareColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Hardware.class);
        long j3 = hardwareColumnInfo.idIndex;
        C4643xf2712564 ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface = hardware2;
        String realmGet$id = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j3, realmGet$id) : j;
        map2.put(hardware2, Long.valueOf(createRowWithPrimaryKey));
        Integer realmGet$groupSignal = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$groupSignal();
        if (realmGet$groupSignal != null) {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetLong(nativePtr, hardwareColumnInfo.groupSignalIndex, createRowWithPrimaryKey, realmGet$groupSignal.longValue(), false);
        } else {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.groupSignalIndex, j2, false);
        }
        Integer realmGet$online = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$online();
        if (realmGet$online != null) {
            Table.nativeSetLong(nativePtr, hardwareColumnInfo.onlineIndex, j2, realmGet$online.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.onlineIndex, j2, false);
        }
        RoomInfo realmGet$roomInfo = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$roomInfo();
        if (realmGet$roomInfo != null) {
            Long l = map2.get(realmGet$roomInfo);
            if (l == null) {
                l = Long.valueOf(C4648x51014856.insertOrUpdate(realm2, realmGet$roomInfo, map2));
            }
            Table.nativeSetLink(nativePtr, hardwareColumnInfo.roomInfoIndex, j2, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, hardwareColumnInfo.roomInfoIndex, j2);
        }
        String realmGet$deviceTitle = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceTitle();
        if (realmGet$deviceTitle != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceTitleIndex, j2, realmGet$deviceTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.deviceTitleIndex, j2, false);
        }
        String realmGet$stateText = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$stateText();
        if (realmGet$stateText != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.stateTextIndex, j2, realmGet$stateText, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.stateTextIndex, j2, false);
        }
        Integer realmGet$state = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$state();
        if (realmGet$state != null) {
            Table.nativeSetLong(nativePtr, hardwareColumnInfo.stateIndex, j2, realmGet$state.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.stateIndex, j2, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.titleIndex, j2, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.titleIndex, j2, false);
        }
        String realmGet$manual = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$manual();
        if (realmGet$manual != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.manualIndex, j2, realmGet$manual, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.manualIndex, j2, false);
        }
        String realmGet$deviceModelName = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceModelName();
        if (realmGet$deviceModelName != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceModelNameIndex, j2, realmGet$deviceModelName, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.deviceModelNameIndex, j2, false);
        }
        String realmGet$deviceModelTitle = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceModelTitle();
        if (realmGet$deviceModelTitle != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceModelTitleIndex, j2, realmGet$deviceModelTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.deviceModelTitleIndex, j2, false);
        }
        String realmGet$deviceModelId = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceModelId();
        if (realmGet$deviceModelId != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceModelIdIndex, j2, realmGet$deviceModelId, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.deviceModelIdIndex, j2, false);
        }
        String realmGet$deviceClassName = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceClassName();
        if (realmGet$deviceClassName != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceClassNameIndex, j2, realmGet$deviceClassName, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.deviceClassNameIndex, j2, false);
        }
        String realmGet$deviceClassId = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceClassId();
        if (realmGet$deviceClassId != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceClassIdIndex, j2, realmGet$deviceClassId, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.deviceClassIdIndex, j2, false);
        }
        String realmGet$deviceClassTitle = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceClassTitle();
        if (realmGet$deviceClassTitle != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceClassTitleIndex, j2, realmGet$deviceClassTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.deviceClassTitleIndex, j2, false);
        }
        String realmGet$description = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.descriptionIndex, j2, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.descriptionIndex, j2, false);
        }
        Integer realmGet$management = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$management();
        if (realmGet$management != null) {
            Table.nativeSetLong(nativePtr, hardwareColumnInfo.managementIndex, j2, realmGet$management.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.managementIndex, j2, false);
        }
        Integer realmGet$istext = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$istext();
        if (realmGet$istext != null) {
            Table.nativeSetLong(nativePtr, hardwareColumnInfo.istextIndex, j2, realmGet$istext.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.istextIndex, j2, false);
        }
        Integer realmGet$width = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$width();
        if (realmGet$width != null) {
            Table.nativeSetLong(nativePtr, hardwareColumnInfo.widthIndex, j2, realmGet$width.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.widthIndex, j2, false);
        }
        Integer realmGet$height = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$height();
        if (realmGet$height != null) {
            Table.nativeSetLong(nativePtr, hardwareColumnInfo.heightIndex, j2, realmGet$height.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.heightIndex, j2, false);
        }
        String realmGet$textsuffix = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$textsuffix();
        if (realmGet$textsuffix != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.textsuffixIndex, j2, realmGet$textsuffix, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.textsuffixIndex, j2, false);
        }
        String realmGet$guid = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$guid();
        if (realmGet$guid != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.guidIndex, j2, realmGet$guid, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.guidIndex, j2, false);
        }
        Integer realmGet$hardwareId = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$hardwareId();
        if (realmGet$hardwareId != null) {
            Table.nativeSetLong(nativePtr, hardwareColumnInfo.hardwareIdIndex, j2, realmGet$hardwareId.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.hardwareIdIndex, j2, false);
        }
        Integer realmGet$channelType = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$channelType();
        if (realmGet$channelType != null) {
            Table.nativeSetLong(nativePtr, hardwareColumnInfo.channelTypeIndex, j2, realmGet$channelType.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.channelTypeIndex, j2, false);
        }
        ManagementType realmGet$managementType = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$managementType();
        if (realmGet$managementType != null) {
            Long l2 = map2.get(realmGet$managementType);
            if (l2 == null) {
                l2 = Long.valueOf(C4646xa509baca.insertOrUpdate(realm2, realmGet$managementType, map2));
            }
            Table.nativeSetLink(nativePtr, hardwareColumnInfo.managementTypeIndex, j2, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, hardwareColumnInfo.managementTypeIndex, j2);
        }
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.nameIndex, j2, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.nameIndex, j2, false);
        }
        String realmGet$typeName = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$typeName();
        if (realmGet$typeName != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.typeNameIndex, j2, realmGet$typeName, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.typeNameIndex, j2, false);
        }
        String realmGet$getSettingsWindowUrl = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$getSettingsWindowUrl();
        if (realmGet$getSettingsWindowUrl != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.getSettingsWindowUrlIndex, j2, realmGet$getSettingsWindowUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.getSettingsWindowUrlIndex, j2, false);
        }
        String realmGet$img = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$img();
        if (realmGet$img != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.imgIndex, j2, realmGet$img, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.imgIndex, j2, false);
        }
        String realmGet$token = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$token();
        if (realmGet$token != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.tokenIndex, j2, realmGet$token, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.tokenIndex, j2, false);
        }
        String realmGet$scenAvailable = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$scenAvailable();
        if (realmGet$scenAvailable != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.scenAvailableIndex, j2, realmGet$scenAvailable, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.scenAvailableIndex, j2, false);
        }
        String realmGet$imgApp = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$imgApp();
        if (realmGet$imgApp != null) {
            Table.nativeSetString(nativePtr, hardwareColumnInfo.imgAppIndex, j2, realmGet$imgApp, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareColumnInfo.imgAppIndex, j2, false);
        }
        long j4 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j4), hardwareColumnInfo.signalsIndex);
        RealmList<HardwareSignal> realmGet$signals = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$signals();
        if (realmGet$signals == null || ((long) realmGet$signals.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$signals != null) {
                Iterator<HardwareSignal> it = realmGet$signals.iterator();
                while (it.hasNext()) {
                    HardwareSignal next = it.next();
                    Long l3 = map2.get(next);
                    if (l3 == null) {
                        l3 = Long.valueOf(C4644x8f0def9d.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l3.longValue());
                }
            }
        } else {
            int size = realmGet$signals.size();
            for (int i = 0; i < size; i++) {
                HardwareSignal hardwareSignal = realmGet$signals.get(i);
                Long l4 = map2.get(hardwareSignal);
                if (l4 == null) {
                    l4 = Long.valueOf(C4644x8f0def9d.insertOrUpdate(realm2, hardwareSignal, map2));
                }
                osList.setRow((long) i, l4.longValue());
            }
        }
        return j4;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Hardware.class);
        long nativePtr = table.getNativePtr();
        HardwareColumnInfo hardwareColumnInfo = (HardwareColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Hardware.class);
        long j4 = hardwareColumnInfo.idIndex;
        while (it.hasNext()) {
            Hardware hardware = (Hardware) it.next();
            if (!map2.containsKey(hardware)) {
                if (hardware instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) hardware;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(hardware, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4643xf2712564 ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface = hardware;
                String realmGet$id = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j4);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j4, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j4, realmGet$id) : j;
                map2.put(hardware, Long.valueOf(createRowWithPrimaryKey));
                Integer realmGet$groupSignal = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$groupSignal();
                if (realmGet$groupSignal != null) {
                    j3 = createRowWithPrimaryKey;
                    j2 = j4;
                    Table.nativeSetLong(nativePtr, hardwareColumnInfo.groupSignalIndex, createRowWithPrimaryKey, realmGet$groupSignal.longValue(), false);
                } else {
                    j3 = createRowWithPrimaryKey;
                    j2 = j4;
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.groupSignalIndex, createRowWithPrimaryKey, false);
                }
                Integer realmGet$online = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$online();
                if (realmGet$online != null) {
                    Table.nativeSetLong(nativePtr, hardwareColumnInfo.onlineIndex, j3, realmGet$online.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.onlineIndex, j3, false);
                }
                RoomInfo realmGet$roomInfo = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$roomInfo();
                if (realmGet$roomInfo != null) {
                    Long l = map2.get(realmGet$roomInfo);
                    if (l == null) {
                        l = Long.valueOf(C4648x51014856.insertOrUpdate(realm2, realmGet$roomInfo, map2));
                    }
                    Table.nativeSetLink(nativePtr, hardwareColumnInfo.roomInfoIndex, j3, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, hardwareColumnInfo.roomInfoIndex, j3);
                }
                String realmGet$deviceTitle = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceTitle();
                if (realmGet$deviceTitle != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceTitleIndex, j3, realmGet$deviceTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.deviceTitleIndex, j3, false);
                }
                String realmGet$stateText = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$stateText();
                if (realmGet$stateText != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.stateTextIndex, j3, realmGet$stateText, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.stateTextIndex, j3, false);
                }
                Integer realmGet$state = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$state();
                if (realmGet$state != null) {
                    Table.nativeSetLong(nativePtr, hardwareColumnInfo.stateIndex, j3, realmGet$state.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.stateIndex, j3, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.titleIndex, j3, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.titleIndex, j3, false);
                }
                String realmGet$manual = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$manual();
                if (realmGet$manual != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.manualIndex, j3, realmGet$manual, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.manualIndex, j3, false);
                }
                String realmGet$deviceModelName = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceModelName();
                if (realmGet$deviceModelName != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceModelNameIndex, j3, realmGet$deviceModelName, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.deviceModelNameIndex, j3, false);
                }
                String realmGet$deviceModelTitle = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceModelTitle();
                if (realmGet$deviceModelTitle != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceModelTitleIndex, j3, realmGet$deviceModelTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.deviceModelTitleIndex, j3, false);
                }
                String realmGet$deviceModelId = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceModelId();
                if (realmGet$deviceModelId != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceModelIdIndex, j3, realmGet$deviceModelId, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.deviceModelIdIndex, j3, false);
                }
                String realmGet$deviceClassName = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceClassName();
                if (realmGet$deviceClassName != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceClassNameIndex, j3, realmGet$deviceClassName, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.deviceClassNameIndex, j3, false);
                }
                String realmGet$deviceClassId = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceClassId();
                if (realmGet$deviceClassId != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceClassIdIndex, j3, realmGet$deviceClassId, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.deviceClassIdIndex, j3, false);
                }
                String realmGet$deviceClassTitle = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$deviceClassTitle();
                if (realmGet$deviceClassTitle != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.deviceClassTitleIndex, j3, realmGet$deviceClassTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.deviceClassTitleIndex, j3, false);
                }
                String realmGet$description = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.descriptionIndex, j3, realmGet$description, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.descriptionIndex, j3, false);
                }
                Integer realmGet$management = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$management();
                if (realmGet$management != null) {
                    Table.nativeSetLong(nativePtr, hardwareColumnInfo.managementIndex, j3, realmGet$management.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.managementIndex, j3, false);
                }
                Integer realmGet$istext = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$istext();
                if (realmGet$istext != null) {
                    Table.nativeSetLong(nativePtr, hardwareColumnInfo.istextIndex, j3, realmGet$istext.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.istextIndex, j3, false);
                }
                Integer realmGet$width = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$width();
                if (realmGet$width != null) {
                    Table.nativeSetLong(nativePtr, hardwareColumnInfo.widthIndex, j3, realmGet$width.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.widthIndex, j3, false);
                }
                Integer realmGet$height = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$height();
                if (realmGet$height != null) {
                    Table.nativeSetLong(nativePtr, hardwareColumnInfo.heightIndex, j3, realmGet$height.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.heightIndex, j3, false);
                }
                String realmGet$textsuffix = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$textsuffix();
                if (realmGet$textsuffix != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.textsuffixIndex, j3, realmGet$textsuffix, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.textsuffixIndex, j3, false);
                }
                String realmGet$guid = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$guid();
                if (realmGet$guid != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.guidIndex, j3, realmGet$guid, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.guidIndex, j3, false);
                }
                Integer realmGet$hardwareId = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$hardwareId();
                if (realmGet$hardwareId != null) {
                    Table.nativeSetLong(nativePtr, hardwareColumnInfo.hardwareIdIndex, j3, realmGet$hardwareId.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.hardwareIdIndex, j3, false);
                }
                Integer realmGet$channelType = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$channelType();
                if (realmGet$channelType != null) {
                    Table.nativeSetLong(nativePtr, hardwareColumnInfo.channelTypeIndex, j3, realmGet$channelType.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.channelTypeIndex, j3, false);
                }
                ManagementType realmGet$managementType = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$managementType();
                if (realmGet$managementType != null) {
                    Long l2 = map2.get(realmGet$managementType);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4646xa509baca.insertOrUpdate(realm2, realmGet$managementType, map2));
                    }
                    Table.nativeSetLink(nativePtr, hardwareColumnInfo.managementTypeIndex, j3, l2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, hardwareColumnInfo.managementTypeIndex, j3);
                }
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.nameIndex, j3, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.nameIndex, j3, false);
                }
                String realmGet$typeName = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$typeName();
                if (realmGet$typeName != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.typeNameIndex, j3, realmGet$typeName, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.typeNameIndex, j3, false);
                }
                String realmGet$getSettingsWindowUrl = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$getSettingsWindowUrl();
                if (realmGet$getSettingsWindowUrl != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.getSettingsWindowUrlIndex, j3, realmGet$getSettingsWindowUrl, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.getSettingsWindowUrlIndex, j3, false);
                }
                String realmGet$img = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$img();
                if (realmGet$img != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.imgIndex, j3, realmGet$img, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.imgIndex, j3, false);
                }
                String realmGet$token = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$token();
                if (realmGet$token != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.tokenIndex, j3, realmGet$token, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.tokenIndex, j3, false);
                }
                String realmGet$scenAvailable = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$scenAvailable();
                if (realmGet$scenAvailable != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.scenAvailableIndex, j3, realmGet$scenAvailable, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.scenAvailableIndex, j3, false);
                }
                String realmGet$imgApp = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$imgApp();
                if (realmGet$imgApp != null) {
                    Table.nativeSetString(nativePtr, hardwareColumnInfo.imgAppIndex, j3, realmGet$imgApp, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareColumnInfo.imgAppIndex, j3, false);
                }
                OsList osList = new OsList(table.getUncheckedRow(j3), hardwareColumnInfo.signalsIndex);
                RealmList<HardwareSignal> realmGet$signals = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmGet$signals();
                if (realmGet$signals == null || ((long) realmGet$signals.size()) != osList.size()) {
                    osList.removeAll();
                    if (realmGet$signals != null) {
                        Iterator<HardwareSignal> it2 = realmGet$signals.iterator();
                        while (it2.hasNext()) {
                            HardwareSignal next = it2.next();
                            Long l3 = map2.get(next);
                            if (l3 == null) {
                                l3 = Long.valueOf(C4644x8f0def9d.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l3.longValue());
                        }
                    }
                } else {
                    int size = realmGet$signals.size();
                    for (int i = 0; i < size; i++) {
                        HardwareSignal hardwareSignal = realmGet$signals.get(i);
                        Long l4 = map2.get(hardwareSignal);
                        if (l4 == null) {
                            l4 = Long.valueOf(C4644x8f0def9d.insertOrUpdate(realm2, hardwareSignal, map2));
                        }
                        osList.setRow((long) i, l4.longValue());
                    }
                }
                j4 = j2;
            }
        }
    }

    public static Hardware createDetachedCopy(Hardware hardware, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Hardware hardware2;
        if (i > i2 || hardware == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(hardware);
        if (cacheData == null) {
            hardware2 = new Hardware();
            map.put(hardware, new RealmObjectProxy.CacheData(i, hardware2));
        } else if (i >= cacheData.minDepth) {
            return (Hardware) cacheData.object;
        } else {
            cacheData.minDepth = i;
            hardware2 = (Hardware) cacheData.object;
        }
        C4643xf2712564 ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface = hardware2;
        C4643xf2712564 ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2 = hardware;
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$groupSignal(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$groupSignal());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$online(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$online());
        int i3 = i + 1;
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$roomInfo(C4648x51014856.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$roomInfo(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$deviceTitle(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$deviceTitle());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$stateText(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$stateText());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$state(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$state());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$manual(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$manual());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$deviceModelName(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$deviceModelName());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$deviceModelTitle(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$deviceModelTitle());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$deviceModelId(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$deviceModelId());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$deviceClassName(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$deviceClassName());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$deviceClassId(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$deviceClassId());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$deviceClassTitle(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$deviceClassTitle());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$description(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$description());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$management(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$management());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$istext(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$istext());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$width(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$width());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$height(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$height());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$textsuffix(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$textsuffix());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$guid(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$guid());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$hardwareId(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$hardwareId());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$channelType(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$channelType());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$managementType(C4646xa509baca.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$managementType(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$name(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$typeName(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$typeName());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$getSettingsWindowUrl(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$getSettingsWindowUrl());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$img(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$img());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$token(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$token());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$scenAvailable(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$scenAvailable());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$imgApp(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$imgApp());
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$signals((RealmList<HardwareSignal>) null);
        } else {
            RealmList<HardwareSignal> realmGet$signals = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$signals();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface.realmSet$signals(realmList);
            int size = realmGet$signals.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(C4644x8f0def9d.createDetachedCopy(realmGet$signals.get(i4), i3, i2, map));
            }
        }
        return hardware2;
    }

    static Hardware update(Realm realm, HardwareColumnInfo hardwareColumnInfo, Hardware hardware, Hardware hardware2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4643xf2712564 ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface = hardware;
        C4643xf2712564 ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2 = hardware2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Hardware.class), hardwareColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(hardwareColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$id());
        osObjectBuilder.addInteger(hardwareColumnInfo.groupSignalIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$groupSignal());
        osObjectBuilder.addInteger(hardwareColumnInfo.onlineIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$online());
        RoomInfo realmGet$roomInfo = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$roomInfo();
        if (realmGet$roomInfo == null) {
            osObjectBuilder.addNull(hardwareColumnInfo.roomInfoIndex);
        } else {
            RoomInfo roomInfo = (RoomInfo) map.get(realmGet$roomInfo);
            if (roomInfo != null) {
                osObjectBuilder.addObject(hardwareColumnInfo.roomInfoIndex, roomInfo);
            } else {
                osObjectBuilder.addObject(hardwareColumnInfo.roomInfoIndex, C4648x51014856.copyOrUpdate(realm, (C4648x51014856.RoomInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RoomInfo.class), realmGet$roomInfo, true, map, set));
            }
        }
        osObjectBuilder.addString(hardwareColumnInfo.deviceTitleIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$deviceTitle());
        osObjectBuilder.addString(hardwareColumnInfo.stateTextIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$stateText());
        osObjectBuilder.addInteger(hardwareColumnInfo.stateIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$state());
        osObjectBuilder.addString(hardwareColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(hardwareColumnInfo.manualIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$manual());
        osObjectBuilder.addString(hardwareColumnInfo.deviceModelNameIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$deviceModelName());
        osObjectBuilder.addString(hardwareColumnInfo.deviceModelTitleIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$deviceModelTitle());
        osObjectBuilder.addString(hardwareColumnInfo.deviceModelIdIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$deviceModelId());
        osObjectBuilder.addString(hardwareColumnInfo.deviceClassNameIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$deviceClassName());
        osObjectBuilder.addString(hardwareColumnInfo.deviceClassIdIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$deviceClassId());
        osObjectBuilder.addString(hardwareColumnInfo.deviceClassTitleIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$deviceClassTitle());
        osObjectBuilder.addString(hardwareColumnInfo.descriptionIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$description());
        osObjectBuilder.addInteger(hardwareColumnInfo.managementIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$management());
        osObjectBuilder.addInteger(hardwareColumnInfo.istextIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$istext());
        osObjectBuilder.addInteger(hardwareColumnInfo.widthIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$width());
        osObjectBuilder.addInteger(hardwareColumnInfo.heightIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$height());
        osObjectBuilder.addString(hardwareColumnInfo.textsuffixIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$textsuffix());
        osObjectBuilder.addString(hardwareColumnInfo.guidIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$guid());
        osObjectBuilder.addInteger(hardwareColumnInfo.hardwareIdIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$hardwareId());
        osObjectBuilder.addInteger(hardwareColumnInfo.channelTypeIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$channelType());
        ManagementType realmGet$managementType = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$managementType();
        if (realmGet$managementType == null) {
            osObjectBuilder.addNull(hardwareColumnInfo.managementTypeIndex);
        } else {
            ManagementType managementType = (ManagementType) map.get(realmGet$managementType);
            if (managementType != null) {
                osObjectBuilder.addObject(hardwareColumnInfo.managementTypeIndex, managementType);
            } else {
                osObjectBuilder.addObject(hardwareColumnInfo.managementTypeIndex, C4646xa509baca.copyOrUpdate(realm, (C4646xa509baca.ManagementTypeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ManagementType.class), realmGet$managementType, true, map, set));
            }
        }
        osObjectBuilder.addString(hardwareColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$name());
        osObjectBuilder.addString(hardwareColumnInfo.typeNameIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$typeName());
        osObjectBuilder.addString(hardwareColumnInfo.getSettingsWindowUrlIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$getSettingsWindowUrl());
        osObjectBuilder.addString(hardwareColumnInfo.imgIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$img());
        osObjectBuilder.addString(hardwareColumnInfo.tokenIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$token());
        osObjectBuilder.addString(hardwareColumnInfo.scenAvailableIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$scenAvailable());
        osObjectBuilder.addString(hardwareColumnInfo.imgAppIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$imgApp());
        RealmList<HardwareSignal> realmGet$signals = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwarerealmproxyinterface2.realmGet$signals();
        if (realmGet$signals != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$signals.size(); i++) {
                HardwareSignal hardwareSignal = realmGet$signals.get(i);
                HardwareSignal hardwareSignal2 = (HardwareSignal) map.get(hardwareSignal);
                if (hardwareSignal2 != null) {
                    realmList.add(hardwareSignal2);
                } else {
                    realmList.add(C4644x8f0def9d.copyOrUpdate(realm, (C4644x8f0def9d.HardwareSignalColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) HardwareSignal.class), hardwareSignal, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(hardwareColumnInfo.signalsIndex, realmList);
        } else {
            osObjectBuilder.addObjectList(hardwareColumnInfo.signalsIndex, new RealmList());
        }
        osObjectBuilder.updateExistingObject();
        return hardware;
    }

    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }
}
