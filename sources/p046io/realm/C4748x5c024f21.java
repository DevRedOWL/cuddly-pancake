package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.PropertyRenta;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.StateRenta;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.TimeSlotHuman;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.ManagePermissions;
import p046io.realm.BaseRealm;
import p046io.realm.C4742xdc63beb7;
import p046io.realm.C4756x99acf311;
import p046io.realm.C4758xdaf4d606;
import p046io.realm.C4764xd43a5daf;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentInfoRealmProxy */
public class C4748x5c024f21 extends RentInfo implements RealmObjectProxy, C4749xc305b318 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RentInfoColumnInfo columnInfo;
    private ProxyState<RentInfo> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentInfoRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RentInfo";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentInfoRealmProxy$RentInfoColumnInfo */
    static final class RentInfoColumnInfo extends ColumnInfo {
        long finishDateHumanIndex;
        long finishDateIndex;
        long idIndex;
        long maxColumnIndexValue;
        long propRentaIndex;
        long rentPermissionsIndex;
        long rentersCountIndex;
        long startDateHumanIndex;
        long startDateIndex;
        long stateDisplayNameIndex;
        long stateNameIndex;
        long stateRentaIndex;
        long timeSlotHumanIndex;

        RentInfoColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(12);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.startDateIndex = addColumnDetails("startDate", "startDate", objectSchemaInfo);
            this.finishDateIndex = addColumnDetails("finishDate", "finishDate", objectSchemaInfo);
            this.startDateHumanIndex = addColumnDetails("startDateHuman", "startDateHuman", objectSchemaInfo);
            this.finishDateHumanIndex = addColumnDetails("finishDateHuman", "finishDateHuman", objectSchemaInfo);
            this.timeSlotHumanIndex = addColumnDetails("timeSlotHuman", "timeSlotHuman", objectSchemaInfo);
            this.stateNameIndex = addColumnDetails("stateName", "stateName", objectSchemaInfo);
            this.stateDisplayNameIndex = addColumnDetails("stateDisplayName", "stateDisplayName", objectSchemaInfo);
            this.rentersCountIndex = addColumnDetails("rentersCount", "rentersCount", objectSchemaInfo);
            this.stateRentaIndex = addColumnDetails("stateRenta", "stateRenta", objectSchemaInfo);
            this.propRentaIndex = addColumnDetails("propRenta", "propRenta", objectSchemaInfo);
            this.rentPermissionsIndex = addColumnDetails("rentPermissions", "rentPermissions", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RentInfoColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RentInfoColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RentInfoColumnInfo rentInfoColumnInfo = (RentInfoColumnInfo) columnInfo;
            RentInfoColumnInfo rentInfoColumnInfo2 = (RentInfoColumnInfo) columnInfo2;
            rentInfoColumnInfo2.idIndex = rentInfoColumnInfo.idIndex;
            rentInfoColumnInfo2.startDateIndex = rentInfoColumnInfo.startDateIndex;
            rentInfoColumnInfo2.finishDateIndex = rentInfoColumnInfo.finishDateIndex;
            rentInfoColumnInfo2.startDateHumanIndex = rentInfoColumnInfo.startDateHumanIndex;
            rentInfoColumnInfo2.finishDateHumanIndex = rentInfoColumnInfo.finishDateHumanIndex;
            rentInfoColumnInfo2.timeSlotHumanIndex = rentInfoColumnInfo.timeSlotHumanIndex;
            rentInfoColumnInfo2.stateNameIndex = rentInfoColumnInfo.stateNameIndex;
            rentInfoColumnInfo2.stateDisplayNameIndex = rentInfoColumnInfo.stateDisplayNameIndex;
            rentInfoColumnInfo2.rentersCountIndex = rentInfoColumnInfo.rentersCountIndex;
            rentInfoColumnInfo2.stateRentaIndex = rentInfoColumnInfo.stateRentaIndex;
            rentInfoColumnInfo2.propRentaIndex = rentInfoColumnInfo.propRentaIndex;
            rentInfoColumnInfo2.rentPermissionsIndex = rentInfoColumnInfo.rentPermissionsIndex;
            rentInfoColumnInfo2.maxColumnIndexValue = rentInfoColumnInfo.maxColumnIndexValue;
        }
    }

    C4748x5c024f21() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RentInfoColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Integer realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.idIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex));
    }

    public void realmSet$id(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    public Long realmGet$startDate() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.startDateIndex)) {
            return null;
        }
        return Long.valueOf(this.proxyState.getRow$realm().getLong(this.columnInfo.startDateIndex));
    }

    public void realmSet$startDate(Long l) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (l == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.startDateIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.startDateIndex, l.longValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (l == null) {
                row$realm.getTable().setNull(this.columnInfo.startDateIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.startDateIndex, row$realm.getIndex(), l.longValue(), true);
            }
        }
    }

    public Long realmGet$finishDate() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.finishDateIndex)) {
            return null;
        }
        return Long.valueOf(this.proxyState.getRow$realm().getLong(this.columnInfo.finishDateIndex));
    }

    public void realmSet$finishDate(Long l) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (l == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.finishDateIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.finishDateIndex, l.longValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (l == null) {
                row$realm.getTable().setNull(this.columnInfo.finishDateIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.finishDateIndex, row$realm.getIndex(), l.longValue(), true);
            }
        }
    }

    public String realmGet$startDateHuman() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.startDateHumanIndex);
    }

    public void realmSet$startDateHuman(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.startDateHumanIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.startDateHumanIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.startDateHumanIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.startDateHumanIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$finishDateHuman() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.finishDateHumanIndex);
    }

    public void realmSet$finishDateHuman(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.finishDateHumanIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.finishDateHumanIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.finishDateHumanIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.finishDateHumanIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public TimeSlotHuman realmGet$timeSlotHuman() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.timeSlotHumanIndex)) {
            return null;
        }
        return (TimeSlotHuman) this.proxyState.getRealm$realm().get(TimeSlotHuman.class, this.proxyState.getRow$realm().getLink(this.columnInfo.timeSlotHumanIndex), false, Collections.emptyList());
    }

    public void realmSet$timeSlotHuman(TimeSlotHuman timeSlotHuman) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (timeSlotHuman == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.timeSlotHumanIndex);
                return;
            }
            this.proxyState.checkValidObject(timeSlotHuman);
            this.proxyState.getRow$realm().setLink(this.columnInfo.timeSlotHumanIndex, ((RealmObjectProxy) timeSlotHuman).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("timeSlotHuman")) {
            if (timeSlotHuman != null && !RealmObject.isManaged(timeSlotHuman)) {
                timeSlotHuman = (TimeSlotHuman) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(timeSlotHuman, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (timeSlotHuman == null) {
                row$realm.nullifyLink(this.columnInfo.timeSlotHumanIndex);
                return;
            }
            this.proxyState.checkValidObject(timeSlotHuman);
            row$realm.getTable().setLink(this.columnInfo.timeSlotHumanIndex, row$realm.getIndex(), ((RealmObjectProxy) timeSlotHuman).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public String realmGet$stateName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.stateNameIndex);
    }

    public void realmSet$stateName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.stateNameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.stateNameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.stateNameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.stateNameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$stateDisplayName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.stateDisplayNameIndex);
    }

    public void realmSet$stateDisplayName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.stateDisplayNameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.stateDisplayNameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.stateDisplayNameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.stateDisplayNameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$rentersCount() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.rentersCountIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.rentersCountIndex));
    }

    public void realmSet$rentersCount(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.rentersCountIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.rentersCountIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.rentersCountIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.rentersCountIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public StateRenta realmGet$stateRenta() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.stateRentaIndex)) {
            return null;
        }
        return (StateRenta) this.proxyState.getRealm$realm().get(StateRenta.class, this.proxyState.getRow$realm().getLink(this.columnInfo.stateRentaIndex), false, Collections.emptyList());
    }

    public void realmSet$stateRenta(StateRenta stateRenta) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (stateRenta == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.stateRentaIndex);
                return;
            }
            this.proxyState.checkValidObject(stateRenta);
            this.proxyState.getRow$realm().setLink(this.columnInfo.stateRentaIndex, ((RealmObjectProxy) stateRenta).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("stateRenta")) {
            if (stateRenta != null && !RealmObject.isManaged(stateRenta)) {
                stateRenta = (StateRenta) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(stateRenta, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (stateRenta == null) {
                row$realm.nullifyLink(this.columnInfo.stateRentaIndex);
                return;
            }
            this.proxyState.checkValidObject(stateRenta);
            row$realm.getTable().setLink(this.columnInfo.stateRentaIndex, row$realm.getIndex(), ((RealmObjectProxy) stateRenta).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public PropertyRenta realmGet$propRenta() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.propRentaIndex)) {
            return null;
        }
        return (PropertyRenta) this.proxyState.getRealm$realm().get(PropertyRenta.class, this.proxyState.getRow$realm().getLink(this.columnInfo.propRentaIndex), false, Collections.emptyList());
    }

    public void realmSet$propRenta(PropertyRenta propertyRenta) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (propertyRenta == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.propRentaIndex);
                return;
            }
            this.proxyState.checkValidObject(propertyRenta);
            this.proxyState.getRow$realm().setLink(this.columnInfo.propRentaIndex, ((RealmObjectProxy) propertyRenta).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("propRenta")) {
            if (propertyRenta != null && !RealmObject.isManaged(propertyRenta)) {
                propertyRenta = (PropertyRenta) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(propertyRenta, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (propertyRenta == null) {
                row$realm.nullifyLink(this.columnInfo.propRentaIndex);
                return;
            }
            this.proxyState.checkValidObject(propertyRenta);
            row$realm.getTable().setLink(this.columnInfo.propRentaIndex, row$realm.getIndex(), ((RealmObjectProxy) propertyRenta).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public ManagePermissions realmGet$rentPermissions() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.rentPermissionsIndex)) {
            return null;
        }
        return (ManagePermissions) this.proxyState.getRealm$realm().get(ManagePermissions.class, this.proxyState.getRow$realm().getLink(this.columnInfo.rentPermissionsIndex), false, Collections.emptyList());
    }

    public void realmSet$rentPermissions(ManagePermissions managePermissions) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (managePermissions == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.rentPermissionsIndex);
                return;
            }
            this.proxyState.checkValidObject(managePermissions);
            this.proxyState.getRow$realm().setLink(this.columnInfo.rentPermissionsIndex, ((RealmObjectProxy) managePermissions).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("rentPermissions")) {
            if (managePermissions != null && !RealmObject.isManaged(managePermissions)) {
                managePermissions = (ManagePermissions) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(managePermissions, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (managePermissions == null) {
                row$realm.nullifyLink(this.columnInfo.rentPermissionsIndex);
                return;
            }
            this.proxyState.checkValidObject(managePermissions);
            row$realm.getTable().setLink(this.columnInfo.rentPermissionsIndex, row$realm.getIndex(), ((RealmObjectProxy) managePermissions).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 12, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, false);
        builder2.addPersistedProperty("startDate", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("finishDate", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("startDateHuman", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("finishDateHuman", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("timeSlotHuman", RealmFieldType.OBJECT, C4758xdaf4d606.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder3 = builder;
        builder3.addPersistedProperty("stateName", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("stateDisplayName", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("rentersCount", RealmFieldType.INTEGER, false, false, false);
        builder.addPersistedLinkProperty("stateRenta", RealmFieldType.OBJECT, C4756x99acf311.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("propRenta", RealmFieldType.OBJECT, C4742xdc63beb7.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("rentPermissions", RealmFieldType.OBJECT, C4764xd43a5daf.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RentInfoColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RentInfoColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            java.lang.String r1 = "id"
            r2 = 0
            if (r15 == 0) goto L_0x0066
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo> r5 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentInfoRealmProxy$RentInfoColumnInfo r4 = (p046io.realm.C4748x5c024f21.RentInfoColumnInfo) r4
            long r4 = r4.idIndex
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x002a
            long r4 = r3.findFirstNull(r4)
            goto L_0x0032
        L_0x002a:
            long r6 = r14.getLong(r1)
            long r4 = r3.findFirstLong(r4, r6)
        L_0x0032:
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0066
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r6 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r6 = r6.get()
            io.realm.BaseRealm$RealmObjectContext r6 = (p046io.realm.BaseRealm.RealmObjectContext) r6
            io.realm.internal.UncheckedRow r9 = r3.getUncheckedRow(r4)     // Catch:{ all -> 0x0061 }
            io.realm.RealmSchema r3 = r13.getSchema()     // Catch:{ all -> 0x0061 }
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo> r4 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x0061 }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0061 }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0061 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentInfoRealmProxy r3 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentInfoRealmProxy     // Catch:{ all -> 0x0061 }
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
            java.lang.String r4 = "rentPermissions"
            java.lang.String r5 = "propRenta"
            java.lang.String r6 = "stateRenta"
            java.lang.String r7 = "timeSlotHuman"
            if (r3 != 0) goto L_0x00c6
            boolean r3 = r14.has(r7)
            if (r3 == 0) goto L_0x007a
            r0.add(r7)
        L_0x007a:
            boolean r3 = r14.has(r6)
            if (r3 == 0) goto L_0x0083
            r0.add(r6)
        L_0x0083:
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x008c
            r0.add(r5)
        L_0x008c:
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x0095
            r0.add(r4)
        L_0x0095:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00be
            boolean r3 = r14.isNull(r1)
            r8 = 1
            if (r3 == 0) goto L_0x00ac
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r8, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentInfoRealmProxy r3 = (p046io.realm.C4748x5c024f21) r3
            goto L_0x00c6
        L_0x00ac:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo.class
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r8, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentInfoRealmProxy r3 = (p046io.realm.C4748x5c024f21) r3
            goto L_0x00c6
        L_0x00be:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00c6:
            r0 = r3
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentInfoRealmProxyInterface r0 = (p046io.realm.C4749xc305b318) r0
            java.lang.String r1 = "startDate"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x00e6
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x00db
            r0.realmSet$startDate(r2)
            goto L_0x00e6
        L_0x00db:
            long r8 = r14.getLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r0.realmSet$startDate(r1)
        L_0x00e6:
            java.lang.String r1 = "finishDate"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x0103
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x00f8
            r0.realmSet$finishDate(r2)
            goto L_0x0103
        L_0x00f8:
            long r8 = r14.getLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r0.realmSet$finishDate(r1)
        L_0x0103:
            java.lang.String r1 = "startDateHuman"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x011c
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x0115
            r0.realmSet$startDateHuman(r2)
            goto L_0x011c
        L_0x0115:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$startDateHuman(r1)
        L_0x011c:
            java.lang.String r1 = "finishDateHuman"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x0135
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x012e
            r0.realmSet$finishDateHuman(r2)
            goto L_0x0135
        L_0x012e:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$finishDateHuman(r1)
        L_0x0135:
            boolean r1 = r14.has(r7)
            if (r1 == 0) goto L_0x0150
            boolean r1 = r14.isNull(r7)
            if (r1 == 0) goto L_0x0145
            r0.realmSet$timeSlotHuman(r2)
            goto L_0x0150
        L_0x0145:
            org.json.JSONObject r1 = r14.getJSONObject(r7)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TimeSlotHuman r1 = p046io.realm.C4758xdaf4d606.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$timeSlotHuman(r1)
        L_0x0150:
            java.lang.String r1 = "stateName"
            boolean r7 = r14.has(r1)
            if (r7 == 0) goto L_0x0169
            boolean r7 = r14.isNull(r1)
            if (r7 == 0) goto L_0x0162
            r0.realmSet$stateName(r2)
            goto L_0x0169
        L_0x0162:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$stateName(r1)
        L_0x0169:
            java.lang.String r1 = "stateDisplayName"
            boolean r7 = r14.has(r1)
            if (r7 == 0) goto L_0x0182
            boolean r7 = r14.isNull(r1)
            if (r7 == 0) goto L_0x017b
            r0.realmSet$stateDisplayName(r2)
            goto L_0x0182
        L_0x017b:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$stateDisplayName(r1)
        L_0x0182:
            java.lang.String r1 = "rentersCount"
            boolean r7 = r14.has(r1)
            if (r7 == 0) goto L_0x019f
            boolean r7 = r14.isNull(r1)
            if (r7 == 0) goto L_0x0194
            r0.realmSet$rentersCount(r2)
            goto L_0x019f
        L_0x0194:
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$rentersCount(r1)
        L_0x019f:
            boolean r1 = r14.has(r6)
            if (r1 == 0) goto L_0x01ba
            boolean r1 = r14.isNull(r6)
            if (r1 == 0) goto L_0x01af
            r0.realmSet$stateRenta(r2)
            goto L_0x01ba
        L_0x01af:
            org.json.JSONObject r1 = r14.getJSONObject(r6)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta r1 = p046io.realm.C4756x99acf311.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$stateRenta(r1)
        L_0x01ba:
            boolean r1 = r14.has(r5)
            if (r1 == 0) goto L_0x01d5
            boolean r1 = r14.isNull(r5)
            if (r1 == 0) goto L_0x01ca
            r0.realmSet$propRenta(r2)
            goto L_0x01d5
        L_0x01ca:
            org.json.JSONObject r1 = r14.getJSONObject(r5)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta r1 = p046io.realm.C4742xdc63beb7.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$propRenta(r1)
        L_0x01d5:
            boolean r1 = r14.has(r4)
            if (r1 == 0) goto L_0x01f0
            boolean r1 = r14.isNull(r4)
            if (r1 == 0) goto L_0x01e5
            r0.realmSet$rentPermissions(r2)
            goto L_0x01f0
        L_0x01e5:
            org.json.JSONObject r14 = r14.getJSONObject(r4)
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.ManagePermissions r13 = p046io.realm.C4764xd43a5daf.createOrUpdateUsingJsonObject(r13, r14, r15)
            r0.realmSet$rentPermissions(r13)
        L_0x01f0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4748x5c024f21.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo");
    }

    public static RentInfo createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        RentInfo rentInfo = new RentInfo();
        C4749xc305b318 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface = rentInfo;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$id(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$id((Integer) null);
                }
                z = true;
            } else if (nextName.equals("startDate")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$startDate(Long.valueOf(jsonReader.nextLong()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$startDate((Long) null);
                }
            } else if (nextName.equals("finishDate")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$finishDate(Long.valueOf(jsonReader.nextLong()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$finishDate((Long) null);
                }
            } else if (nextName.equals("startDateHuman")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$startDateHuman(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$startDateHuman((String) null);
                }
            } else if (nextName.equals("finishDateHuman")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$finishDateHuman(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$finishDateHuman((String) null);
                }
            } else if (nextName.equals("timeSlotHuman")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$timeSlotHuman((TimeSlotHuman) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$timeSlotHuman(C4758xdaf4d606.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("stateName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$stateName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$stateName((String) null);
                }
            } else if (nextName.equals("stateDisplayName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$stateDisplayName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$stateDisplayName((String) null);
                }
            } else if (nextName.equals("rentersCount")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$rentersCount(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$rentersCount((Integer) null);
                }
            } else if (nextName.equals("stateRenta")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$stateRenta((StateRenta) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$stateRenta(C4756x99acf311.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("propRenta")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$propRenta((PropertyRenta) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$propRenta(C4742xdc63beb7.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("rentPermissions")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$rentPermissions((ManagePermissions) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$rentPermissions(C4764xd43a5daf.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        if (z) {
            return (RentInfo) realm.copyToRealm(rentInfo, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4748x5c024f21 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentInfo.class), false, Collections.emptyList());
        C4748x5c024f21 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxy = new C4748x5c024f21();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4748x5c024f21.RentInfoColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0097
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentInfoRealmProxyInterface r5 = (p046io.realm.C4749xc305b318) r5
            java.lang.Integer r5 = r5.realmGet$id()
            if (r5 != 0) goto L_0x0064
            long r3 = r2.findFirstNull(r3)
            goto L_0x006c
        L_0x0064:
            long r5 = r5.longValue()
            long r3 = r2.findFirstLong(r3, r5)
        L_0x006c:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0074
            r0 = 0
            goto L_0x0098
        L_0x0074:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x0092 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0092 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0092 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentInfoRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentInfoRealmProxy     // Catch:{ all -> 0x0092 }
            r1.<init>()     // Catch:{ all -> 0x0092 }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x0092 }
            r12.put(r10, r2)     // Catch:{ all -> 0x0092 }
            r0.clear()
            goto L_0x0097
        L_0x0092:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x0097:
            r0 = r11
        L_0x0098:
            r3 = r1
            if (r0 == 0) goto L_0x00a5
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a9
        L_0x00a5:
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4748x5c024f21.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentInfoRealmProxy$RentInfoColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo");
    }

    public static RentInfo copy(Realm realm, RentInfoColumnInfo rentInfoColumnInfo, RentInfo rentInfo, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(rentInfo);
        if (realmObjectProxy != null) {
            return (RentInfo) realmObjectProxy;
        }
        C4749xc305b318 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface = rentInfo;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentInfo.class), rentInfoColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(rentInfoColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$id());
        osObjectBuilder.addInteger(rentInfoColumnInfo.startDateIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$startDate());
        osObjectBuilder.addInteger(rentInfoColumnInfo.finishDateIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$finishDate());
        osObjectBuilder.addString(rentInfoColumnInfo.startDateHumanIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$startDateHuman());
        osObjectBuilder.addString(rentInfoColumnInfo.finishDateHumanIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$finishDateHuman());
        osObjectBuilder.addString(rentInfoColumnInfo.stateNameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$stateName());
        osObjectBuilder.addString(rentInfoColumnInfo.stateDisplayNameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$stateDisplayName());
        osObjectBuilder.addInteger(rentInfoColumnInfo.rentersCountIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$rentersCount());
        C4748x5c024f21 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(rentInfo, newProxyInstance);
        TimeSlotHuman realmGet$timeSlotHuman = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$timeSlotHuman();
        if (realmGet$timeSlotHuman == null) {
            newProxyInstance.realmSet$timeSlotHuman((TimeSlotHuman) null);
        } else {
            TimeSlotHuman timeSlotHuman = (TimeSlotHuman) map.get(realmGet$timeSlotHuman);
            if (timeSlotHuman != null) {
                newProxyInstance.realmSet$timeSlotHuman(timeSlotHuman);
            } else {
                newProxyInstance.realmSet$timeSlotHuman(C4758xdaf4d606.copyOrUpdate(realm, (C4758xdaf4d606.TimeSlotHumanColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TimeSlotHuman.class), realmGet$timeSlotHuman, z, map, set));
            }
        }
        StateRenta realmGet$stateRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$stateRenta();
        if (realmGet$stateRenta == null) {
            newProxyInstance.realmSet$stateRenta((StateRenta) null);
        } else {
            StateRenta stateRenta = (StateRenta) map.get(realmGet$stateRenta);
            if (stateRenta != null) {
                newProxyInstance.realmSet$stateRenta(stateRenta);
            } else {
                newProxyInstance.realmSet$stateRenta(C4756x99acf311.copyOrUpdate(realm, (C4756x99acf311.StateRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) StateRenta.class), realmGet$stateRenta, z, map, set));
            }
        }
        PropertyRenta realmGet$propRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$propRenta();
        if (realmGet$propRenta == null) {
            newProxyInstance.realmSet$propRenta((PropertyRenta) null);
        } else {
            PropertyRenta propertyRenta = (PropertyRenta) map.get(realmGet$propRenta);
            if (propertyRenta != null) {
                newProxyInstance.realmSet$propRenta(propertyRenta);
            } else {
                newProxyInstance.realmSet$propRenta(C4742xdc63beb7.copyOrUpdate(realm, (C4742xdc63beb7.PropertyRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PropertyRenta.class), realmGet$propRenta, z, map, set));
            }
        }
        ManagePermissions realmGet$rentPermissions = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$rentPermissions();
        if (realmGet$rentPermissions == null) {
            newProxyInstance.realmSet$rentPermissions((ManagePermissions) null);
        } else {
            ManagePermissions managePermissions = (ManagePermissions) map.get(realmGet$rentPermissions);
            if (managePermissions != null) {
                newProxyInstance.realmSet$rentPermissions(managePermissions);
            } else {
                newProxyInstance.realmSet$rentPermissions(C4764xd43a5daf.copyOrUpdate(realm, (C4764xd43a5daf.ManagePermissionsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ManagePermissions.class), realmGet$rentPermissions, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, RentInfo rentInfo, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        RentInfo rentInfo2 = rentInfo;
        Map<RealmModel, Long> map2 = map;
        if (rentInfo2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentInfo2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(RentInfo.class);
        long nativePtr = table.getNativePtr();
        RentInfoColumnInfo rentInfoColumnInfo = (RentInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentInfo.class);
        long j3 = rentInfoColumnInfo.idIndex;
        C4749xc305b318 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface = rentInfo2;
        Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$id().intValue());
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map2.put(rentInfo2, Long.valueOf(j2));
        Long realmGet$startDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$startDate();
        if (realmGet$startDate != null) {
            Table.nativeSetLong(nativePtr, rentInfoColumnInfo.startDateIndex, j2, realmGet$startDate.longValue(), false);
        }
        Long realmGet$finishDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$finishDate();
        if (realmGet$finishDate != null) {
            Table.nativeSetLong(nativePtr, rentInfoColumnInfo.finishDateIndex, j2, realmGet$finishDate.longValue(), false);
        }
        String realmGet$startDateHuman = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$startDateHuman();
        if (realmGet$startDateHuman != null) {
            Table.nativeSetString(nativePtr, rentInfoColumnInfo.startDateHumanIndex, j2, realmGet$startDateHuman, false);
        }
        String realmGet$finishDateHuman = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$finishDateHuman();
        if (realmGet$finishDateHuman != null) {
            Table.nativeSetString(nativePtr, rentInfoColumnInfo.finishDateHumanIndex, j2, realmGet$finishDateHuman, false);
        }
        TimeSlotHuman realmGet$timeSlotHuman = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$timeSlotHuman();
        if (realmGet$timeSlotHuman != null) {
            Long l = map2.get(realmGet$timeSlotHuman);
            if (l == null) {
                l = Long.valueOf(C4758xdaf4d606.insert(realm2, realmGet$timeSlotHuman, map2));
            }
            Table.nativeSetLink(nativePtr, rentInfoColumnInfo.timeSlotHumanIndex, j2, l.longValue(), false);
        }
        String realmGet$stateName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$stateName();
        if (realmGet$stateName != null) {
            Table.nativeSetString(nativePtr, rentInfoColumnInfo.stateNameIndex, j2, realmGet$stateName, false);
        }
        String realmGet$stateDisplayName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$stateDisplayName();
        if (realmGet$stateDisplayName != null) {
            Table.nativeSetString(nativePtr, rentInfoColumnInfo.stateDisplayNameIndex, j2, realmGet$stateDisplayName, false);
        }
        Integer realmGet$rentersCount = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$rentersCount();
        if (realmGet$rentersCount != null) {
            Table.nativeSetLong(nativePtr, rentInfoColumnInfo.rentersCountIndex, j2, realmGet$rentersCount.longValue(), false);
        }
        StateRenta realmGet$stateRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$stateRenta();
        if (realmGet$stateRenta != null) {
            Long l2 = map2.get(realmGet$stateRenta);
            if (l2 == null) {
                l2 = Long.valueOf(C4756x99acf311.insert(realm2, realmGet$stateRenta, map2));
            }
            Table.nativeSetLink(nativePtr, rentInfoColumnInfo.stateRentaIndex, j2, l2.longValue(), false);
        }
        PropertyRenta realmGet$propRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$propRenta();
        if (realmGet$propRenta != null) {
            Long l3 = map2.get(realmGet$propRenta);
            if (l3 == null) {
                l3 = Long.valueOf(C4742xdc63beb7.insert(realm2, realmGet$propRenta, map2));
            }
            Table.nativeSetLink(nativePtr, rentInfoColumnInfo.propRentaIndex, j2, l3.longValue(), false);
        }
        ManagePermissions realmGet$rentPermissions = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$rentPermissions();
        if (realmGet$rentPermissions != null) {
            Long l4 = map2.get(realmGet$rentPermissions);
            if (l4 == null) {
                l4 = Long.valueOf(C4764xd43a5daf.insert(realm2, realmGet$rentPermissions, map2));
            }
            Table.nativeSetLink(nativePtr, rentInfoColumnInfo.rentPermissionsIndex, j2, l4.longValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(RentInfo.class);
        long nativePtr = table.getNativePtr();
        RentInfoColumnInfo rentInfoColumnInfo = (RentInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentInfo.class);
        long j3 = rentInfoColumnInfo.idIndex;
        while (it.hasNext()) {
            RentInfo rentInfo = (RentInfo) it.next();
            if (!map2.containsKey(rentInfo)) {
                if (rentInfo instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentInfo;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentInfo, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4749xc305b318 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface = rentInfo;
                Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                }
                long j4 = j;
                map2.put(rentInfo, Long.valueOf(j4));
                Long realmGet$startDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$startDate();
                if (realmGet$startDate != null) {
                    j2 = j3;
                    Table.nativeSetLong(nativePtr, rentInfoColumnInfo.startDateIndex, j4, realmGet$startDate.longValue(), false);
                } else {
                    j2 = j3;
                }
                Long realmGet$finishDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$finishDate();
                if (realmGet$finishDate != null) {
                    Table.nativeSetLong(nativePtr, rentInfoColumnInfo.finishDateIndex, j4, realmGet$finishDate.longValue(), false);
                }
                String realmGet$startDateHuman = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$startDateHuman();
                if (realmGet$startDateHuman != null) {
                    Table.nativeSetString(nativePtr, rentInfoColumnInfo.startDateHumanIndex, j4, realmGet$startDateHuman, false);
                }
                String realmGet$finishDateHuman = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$finishDateHuman();
                if (realmGet$finishDateHuman != null) {
                    Table.nativeSetString(nativePtr, rentInfoColumnInfo.finishDateHumanIndex, j4, realmGet$finishDateHuman, false);
                }
                TimeSlotHuman realmGet$timeSlotHuman = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$timeSlotHuman();
                if (realmGet$timeSlotHuman != null) {
                    Long l = map2.get(realmGet$timeSlotHuman);
                    if (l == null) {
                        l = Long.valueOf(C4758xdaf4d606.insert(realm2, realmGet$timeSlotHuman, map2));
                    }
                    table.setLink(rentInfoColumnInfo.timeSlotHumanIndex, j4, l.longValue(), false);
                }
                String realmGet$stateName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$stateName();
                if (realmGet$stateName != null) {
                    Table.nativeSetString(nativePtr, rentInfoColumnInfo.stateNameIndex, j4, realmGet$stateName, false);
                }
                String realmGet$stateDisplayName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$stateDisplayName();
                if (realmGet$stateDisplayName != null) {
                    Table.nativeSetString(nativePtr, rentInfoColumnInfo.stateDisplayNameIndex, j4, realmGet$stateDisplayName, false);
                }
                Integer realmGet$rentersCount = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$rentersCount();
                if (realmGet$rentersCount != null) {
                    Table.nativeSetLong(nativePtr, rentInfoColumnInfo.rentersCountIndex, j4, realmGet$rentersCount.longValue(), false);
                }
                StateRenta realmGet$stateRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$stateRenta();
                if (realmGet$stateRenta != null) {
                    Long l2 = map2.get(realmGet$stateRenta);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4756x99acf311.insert(realm2, realmGet$stateRenta, map2));
                    }
                    table.setLink(rentInfoColumnInfo.stateRentaIndex, j4, l2.longValue(), false);
                }
                PropertyRenta realmGet$propRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$propRenta();
                if (realmGet$propRenta != null) {
                    Long l3 = map2.get(realmGet$propRenta);
                    if (l3 == null) {
                        l3 = Long.valueOf(C4742xdc63beb7.insert(realm2, realmGet$propRenta, map2));
                    }
                    table.setLink(rentInfoColumnInfo.propRentaIndex, j4, l3.longValue(), false);
                }
                ManagePermissions realmGet$rentPermissions = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$rentPermissions();
                if (realmGet$rentPermissions != null) {
                    Long l4 = map2.get(realmGet$rentPermissions);
                    if (l4 == null) {
                        l4 = Long.valueOf(C4764xd43a5daf.insert(realm2, realmGet$rentPermissions, map2));
                    }
                    table.setLink(rentInfoColumnInfo.rentPermissionsIndex, j4, l4.longValue(), false);
                }
                j3 = j2;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, RentInfo rentInfo, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        RentInfo rentInfo2 = rentInfo;
        Map<RealmModel, Long> map2 = map;
        if (rentInfo2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentInfo2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(RentInfo.class);
        long nativePtr = table.getNativePtr();
        RentInfoColumnInfo rentInfoColumnInfo = (RentInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentInfo.class);
        long j2 = rentInfoColumnInfo.idIndex;
        C4749xc305b318 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface = rentInfo2;
        if (ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$id() == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$id().intValue());
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$id()) : j;
        map2.put(rentInfo2, Long.valueOf(createRowWithPrimaryKey));
        Long realmGet$startDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$startDate();
        if (realmGet$startDate != null) {
            Table.nativeSetLong(nativePtr, rentInfoColumnInfo.startDateIndex, createRowWithPrimaryKey, realmGet$startDate.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, rentInfoColumnInfo.startDateIndex, createRowWithPrimaryKey, false);
        }
        Long realmGet$finishDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$finishDate();
        if (realmGet$finishDate != null) {
            Table.nativeSetLong(nativePtr, rentInfoColumnInfo.finishDateIndex, createRowWithPrimaryKey, realmGet$finishDate.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, rentInfoColumnInfo.finishDateIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$startDateHuman = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$startDateHuman();
        if (realmGet$startDateHuman != null) {
            Table.nativeSetString(nativePtr, rentInfoColumnInfo.startDateHumanIndex, createRowWithPrimaryKey, realmGet$startDateHuman, false);
        } else {
            Table.nativeSetNull(nativePtr, rentInfoColumnInfo.startDateHumanIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$finishDateHuman = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$finishDateHuman();
        if (realmGet$finishDateHuman != null) {
            Table.nativeSetString(nativePtr, rentInfoColumnInfo.finishDateHumanIndex, createRowWithPrimaryKey, realmGet$finishDateHuman, false);
        } else {
            Table.nativeSetNull(nativePtr, rentInfoColumnInfo.finishDateHumanIndex, createRowWithPrimaryKey, false);
        }
        TimeSlotHuman realmGet$timeSlotHuman = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$timeSlotHuman();
        if (realmGet$timeSlotHuman != null) {
            Long l = map2.get(realmGet$timeSlotHuman);
            if (l == null) {
                l = Long.valueOf(C4758xdaf4d606.insertOrUpdate(realm2, realmGet$timeSlotHuman, map2));
            }
            Table.nativeSetLink(nativePtr, rentInfoColumnInfo.timeSlotHumanIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, rentInfoColumnInfo.timeSlotHumanIndex, createRowWithPrimaryKey);
        }
        String realmGet$stateName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$stateName();
        if (realmGet$stateName != null) {
            Table.nativeSetString(nativePtr, rentInfoColumnInfo.stateNameIndex, createRowWithPrimaryKey, realmGet$stateName, false);
        } else {
            Table.nativeSetNull(nativePtr, rentInfoColumnInfo.stateNameIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$stateDisplayName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$stateDisplayName();
        if (realmGet$stateDisplayName != null) {
            Table.nativeSetString(nativePtr, rentInfoColumnInfo.stateDisplayNameIndex, createRowWithPrimaryKey, realmGet$stateDisplayName, false);
        } else {
            Table.nativeSetNull(nativePtr, rentInfoColumnInfo.stateDisplayNameIndex, createRowWithPrimaryKey, false);
        }
        Integer realmGet$rentersCount = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$rentersCount();
        if (realmGet$rentersCount != null) {
            Table.nativeSetLong(nativePtr, rentInfoColumnInfo.rentersCountIndex, createRowWithPrimaryKey, realmGet$rentersCount.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, rentInfoColumnInfo.rentersCountIndex, createRowWithPrimaryKey, false);
        }
        StateRenta realmGet$stateRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$stateRenta();
        if (realmGet$stateRenta != null) {
            Long l2 = map2.get(realmGet$stateRenta);
            if (l2 == null) {
                l2 = Long.valueOf(C4756x99acf311.insertOrUpdate(realm2, realmGet$stateRenta, map2));
            }
            Table.nativeSetLink(nativePtr, rentInfoColumnInfo.stateRentaIndex, createRowWithPrimaryKey, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, rentInfoColumnInfo.stateRentaIndex, createRowWithPrimaryKey);
        }
        PropertyRenta realmGet$propRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$propRenta();
        if (realmGet$propRenta != null) {
            Long l3 = map2.get(realmGet$propRenta);
            if (l3 == null) {
                l3 = Long.valueOf(C4742xdc63beb7.insertOrUpdate(realm2, realmGet$propRenta, map2));
            }
            Table.nativeSetLink(nativePtr, rentInfoColumnInfo.propRentaIndex, createRowWithPrimaryKey, l3.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, rentInfoColumnInfo.propRentaIndex, createRowWithPrimaryKey);
        }
        ManagePermissions realmGet$rentPermissions = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$rentPermissions();
        if (realmGet$rentPermissions != null) {
            Long l4 = map2.get(realmGet$rentPermissions);
            if (l4 == null) {
                l4 = Long.valueOf(C4764xd43a5daf.insertOrUpdate(realm2, realmGet$rentPermissions, map2));
            }
            Table.nativeSetLink(nativePtr, rentInfoColumnInfo.rentPermissionsIndex, createRowWithPrimaryKey, l4.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, rentInfoColumnInfo.rentPermissionsIndex, createRowWithPrimaryKey);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(RentInfo.class);
        long nativePtr = table.getNativePtr();
        RentInfoColumnInfo rentInfoColumnInfo = (RentInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentInfo.class);
        long j3 = rentInfoColumnInfo.idIndex;
        while (it.hasNext()) {
            RentInfo rentInfo = (RentInfo) it.next();
            if (!map2.containsKey(rentInfo)) {
                if (rentInfo instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentInfo;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentInfo, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4749xc305b318 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface = rentInfo;
                if (ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$id() == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$id());
                }
                long j4 = j;
                map2.put(rentInfo, Long.valueOf(j4));
                Long realmGet$startDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$startDate();
                if (realmGet$startDate != null) {
                    j2 = j3;
                    Table.nativeSetLong(nativePtr, rentInfoColumnInfo.startDateIndex, j4, realmGet$startDate.longValue(), false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, rentInfoColumnInfo.startDateIndex, j4, false);
                }
                Long realmGet$finishDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$finishDate();
                if (realmGet$finishDate != null) {
                    Table.nativeSetLong(nativePtr, rentInfoColumnInfo.finishDateIndex, j4, realmGet$finishDate.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, rentInfoColumnInfo.finishDateIndex, j4, false);
                }
                String realmGet$startDateHuman = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$startDateHuman();
                if (realmGet$startDateHuman != null) {
                    Table.nativeSetString(nativePtr, rentInfoColumnInfo.startDateHumanIndex, j4, realmGet$startDateHuman, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentInfoColumnInfo.startDateHumanIndex, j4, false);
                }
                String realmGet$finishDateHuman = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$finishDateHuman();
                if (realmGet$finishDateHuman != null) {
                    Table.nativeSetString(nativePtr, rentInfoColumnInfo.finishDateHumanIndex, j4, realmGet$finishDateHuman, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentInfoColumnInfo.finishDateHumanIndex, j4, false);
                }
                TimeSlotHuman realmGet$timeSlotHuman = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$timeSlotHuman();
                if (realmGet$timeSlotHuman != null) {
                    Long l = map2.get(realmGet$timeSlotHuman);
                    if (l == null) {
                        l = Long.valueOf(C4758xdaf4d606.insertOrUpdate(realm2, realmGet$timeSlotHuman, map2));
                    }
                    Table.nativeSetLink(nativePtr, rentInfoColumnInfo.timeSlotHumanIndex, j4, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, rentInfoColumnInfo.timeSlotHumanIndex, j4);
                }
                String realmGet$stateName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$stateName();
                if (realmGet$stateName != null) {
                    Table.nativeSetString(nativePtr, rentInfoColumnInfo.stateNameIndex, j4, realmGet$stateName, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentInfoColumnInfo.stateNameIndex, j4, false);
                }
                String realmGet$stateDisplayName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$stateDisplayName();
                if (realmGet$stateDisplayName != null) {
                    Table.nativeSetString(nativePtr, rentInfoColumnInfo.stateDisplayNameIndex, j4, realmGet$stateDisplayName, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentInfoColumnInfo.stateDisplayNameIndex, j4, false);
                }
                Integer realmGet$rentersCount = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$rentersCount();
                if (realmGet$rentersCount != null) {
                    Table.nativeSetLong(nativePtr, rentInfoColumnInfo.rentersCountIndex, j4, realmGet$rentersCount.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, rentInfoColumnInfo.rentersCountIndex, j4, false);
                }
                StateRenta realmGet$stateRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$stateRenta();
                if (realmGet$stateRenta != null) {
                    Long l2 = map2.get(realmGet$stateRenta);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4756x99acf311.insertOrUpdate(realm2, realmGet$stateRenta, map2));
                    }
                    Table.nativeSetLink(nativePtr, rentInfoColumnInfo.stateRentaIndex, j4, l2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, rentInfoColumnInfo.stateRentaIndex, j4);
                }
                PropertyRenta realmGet$propRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$propRenta();
                if (realmGet$propRenta != null) {
                    Long l3 = map2.get(realmGet$propRenta);
                    if (l3 == null) {
                        l3 = Long.valueOf(C4742xdc63beb7.insertOrUpdate(realm2, realmGet$propRenta, map2));
                    }
                    Table.nativeSetLink(nativePtr, rentInfoColumnInfo.propRentaIndex, j4, l3.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, rentInfoColumnInfo.propRentaIndex, j4);
                }
                ManagePermissions realmGet$rentPermissions = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmGet$rentPermissions();
                if (realmGet$rentPermissions != null) {
                    Long l4 = map2.get(realmGet$rentPermissions);
                    if (l4 == null) {
                        l4 = Long.valueOf(C4764xd43a5daf.insertOrUpdate(realm2, realmGet$rentPermissions, map2));
                    }
                    Table.nativeSetLink(nativePtr, rentInfoColumnInfo.rentPermissionsIndex, j4, l4.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, rentInfoColumnInfo.rentPermissionsIndex, j4);
                }
                j3 = j2;
            }
        }
    }

    public static RentInfo createDetachedCopy(RentInfo rentInfo, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        RentInfo rentInfo2;
        if (i > i2 || rentInfo == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(rentInfo);
        if (cacheData == null) {
            rentInfo2 = new RentInfo();
            map.put(rentInfo, new RealmObjectProxy.CacheData(i, rentInfo2));
        } else if (i >= cacheData.minDepth) {
            return (RentInfo) cacheData.object;
        } else {
            cacheData.minDepth = i;
            rentInfo2 = (RentInfo) cacheData.object;
        }
        C4749xc305b318 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface = rentInfo2;
        C4749xc305b318 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2 = rentInfo;
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$startDate(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$startDate());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$finishDate(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$finishDate());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$startDateHuman(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$startDateHuman());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$finishDateHuman(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$finishDateHuman());
        int i3 = i + 1;
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$timeSlotHuman(C4758xdaf4d606.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$timeSlotHuman(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$stateName(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$stateName());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$stateDisplayName(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$stateDisplayName());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$rentersCount(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$rentersCount());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$stateRenta(C4756x99acf311.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$stateRenta(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$propRenta(C4742xdc63beb7.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$propRenta(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface.realmSet$rentPermissions(C4764xd43a5daf.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$rentPermissions(), i3, i2, map));
        return rentInfo2;
    }

    static RentInfo update(Realm realm, RentInfoColumnInfo rentInfoColumnInfo, RentInfo rentInfo, RentInfo rentInfo2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4749xc305b318 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface = rentInfo;
        C4749xc305b318 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2 = rentInfo2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentInfo.class), rentInfoColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(rentInfoColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$id());
        osObjectBuilder.addInteger(rentInfoColumnInfo.startDateIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$startDate());
        osObjectBuilder.addInteger(rentInfoColumnInfo.finishDateIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$finishDate());
        osObjectBuilder.addString(rentInfoColumnInfo.startDateHumanIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$startDateHuman());
        osObjectBuilder.addString(rentInfoColumnInfo.finishDateHumanIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$finishDateHuman());
        TimeSlotHuman realmGet$timeSlotHuman = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$timeSlotHuman();
        if (realmGet$timeSlotHuman == null) {
            osObjectBuilder.addNull(rentInfoColumnInfo.timeSlotHumanIndex);
        } else {
            TimeSlotHuman timeSlotHuman = (TimeSlotHuman) map.get(realmGet$timeSlotHuman);
            if (timeSlotHuman != null) {
                osObjectBuilder.addObject(rentInfoColumnInfo.timeSlotHumanIndex, timeSlotHuman);
            } else {
                osObjectBuilder.addObject(rentInfoColumnInfo.timeSlotHumanIndex, C4758xdaf4d606.copyOrUpdate(realm, (C4758xdaf4d606.TimeSlotHumanColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TimeSlotHuman.class), realmGet$timeSlotHuman, true, map, set));
            }
        }
        osObjectBuilder.addString(rentInfoColumnInfo.stateNameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$stateName());
        osObjectBuilder.addString(rentInfoColumnInfo.stateDisplayNameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$stateDisplayName());
        osObjectBuilder.addInteger(rentInfoColumnInfo.rentersCountIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$rentersCount());
        StateRenta realmGet$stateRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$stateRenta();
        if (realmGet$stateRenta == null) {
            osObjectBuilder.addNull(rentInfoColumnInfo.stateRentaIndex);
        } else {
            StateRenta stateRenta = (StateRenta) map.get(realmGet$stateRenta);
            if (stateRenta != null) {
                osObjectBuilder.addObject(rentInfoColumnInfo.stateRentaIndex, stateRenta);
            } else {
                osObjectBuilder.addObject(rentInfoColumnInfo.stateRentaIndex, C4756x99acf311.copyOrUpdate(realm, (C4756x99acf311.StateRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) StateRenta.class), realmGet$stateRenta, true, map, set));
            }
        }
        PropertyRenta realmGet$propRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$propRenta();
        if (realmGet$propRenta == null) {
            osObjectBuilder.addNull(rentInfoColumnInfo.propRentaIndex);
        } else {
            PropertyRenta propertyRenta = (PropertyRenta) map.get(realmGet$propRenta);
            if (propertyRenta != null) {
                osObjectBuilder.addObject(rentInfoColumnInfo.propRentaIndex, propertyRenta);
            } else {
                osObjectBuilder.addObject(rentInfoColumnInfo.propRentaIndex, C4742xdc63beb7.copyOrUpdate(realm, (C4742xdc63beb7.PropertyRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PropertyRenta.class), realmGet$propRenta, true, map, set));
            }
        }
        ManagePermissions realmGet$rentPermissions = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxyinterface2.realmGet$rentPermissions();
        if (realmGet$rentPermissions == null) {
            osObjectBuilder.addNull(rentInfoColumnInfo.rentPermissionsIndex);
        } else {
            ManagePermissions managePermissions = (ManagePermissions) map.get(realmGet$rentPermissions);
            if (managePermissions != null) {
                osObjectBuilder.addObject(rentInfoColumnInfo.rentPermissionsIndex, managePermissions);
            } else {
                osObjectBuilder.addObject(rentInfoColumnInfo.rentPermissionsIndex, C4764xd43a5daf.copyOrUpdate(realm, (C4764xd43a5daf.ManagePermissionsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ManagePermissions.class), realmGet$rentPermissions, true, map, set));
            }
        }
        osObjectBuilder.updateExistingObject();
        return rentInfo;
    }

    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    public int hashCode() {
        String path = this.proxyState.getRealm$realm().getPath();
        String name = this.proxyState.getRow$realm().getTable().getName();
        long index = this.proxyState.getRow$realm().getIndex();
        int i = 0;
        int hashCode = (527 + (path != null ? path.hashCode() : 0)) * 31;
        if (name != null) {
            i = name.hashCode();
        }
        return ((hashCode + i) * 31) + ((int) ((index >>> 32) ^ index));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4748x5c024f21 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxy = (C4748x5c024f21) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinforealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
