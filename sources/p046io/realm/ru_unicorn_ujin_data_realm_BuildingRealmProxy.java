package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.Address;
import p035ru.unicorn.ujin.data.realm.Building;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Contact;
import p046io.realm.BaseRealm;
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
import p046io.realm.ru_unicorn_ujin_data_realm_AddressRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy */
public class ru_unicorn_ujin_data_realm_BuildingRealmProxy extends Building implements RealmObjectProxy, ru_unicorn_ujin_data_realm_BuildingRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private BuildingColumnInfo columnInfo;
    private ProxyState<Building> proxyState;
    private RealmList<String> sellEmailsRealmList;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Building";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy$BuildingColumnInfo */
    static final class BuildingColumnInfo extends ColumnInfo {
        long addressIndex;
        long apartmentCountIndex;
        long endWorkTimeIndex;
        long entranceCountIndex;
        long fiasIndex;
        long floorIndex;
        long idIndex;
        long maxColumnIndexValue;
        long rentAvailableIndex;
        long securityNumberIndex;
        long sellEmailsIndex;
        long sellEnabledIndex;
        long startWorkTimeIndex;
        long titleIndex;

        BuildingColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(13);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.floorIndex = addColumnDetails("floor", "floor", objectSchemaInfo);
            this.startWorkTimeIndex = addColumnDetails("startWorkTime", "startWorkTime", objectSchemaInfo);
            this.endWorkTimeIndex = addColumnDetails("endWorkTime", "endWorkTime", objectSchemaInfo);
            this.fiasIndex = addColumnDetails("fias", "fias", objectSchemaInfo);
            this.apartmentCountIndex = addColumnDetails("apartmentCount", "apartmentCount", objectSchemaInfo);
            this.entranceCountIndex = addColumnDetails("entranceCount", "entranceCount", objectSchemaInfo);
            this.addressIndex = addColumnDetails(Contact.Type.address, Contact.Type.address, objectSchemaInfo);
            this.sellEnabledIndex = addColumnDetails("sellEnabled", "sellEnabled", objectSchemaInfo);
            this.sellEmailsIndex = addColumnDetails("sellEmails", "sellEmails", objectSchemaInfo);
            this.securityNumberIndex = addColumnDetails("securityNumber", "securityNumber", objectSchemaInfo);
            this.rentAvailableIndex = addColumnDetails("rentAvailable", "rentAvailable", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        BuildingColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new BuildingColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            BuildingColumnInfo buildingColumnInfo = (BuildingColumnInfo) columnInfo;
            BuildingColumnInfo buildingColumnInfo2 = (BuildingColumnInfo) columnInfo2;
            buildingColumnInfo2.idIndex = buildingColumnInfo.idIndex;
            buildingColumnInfo2.titleIndex = buildingColumnInfo.titleIndex;
            buildingColumnInfo2.floorIndex = buildingColumnInfo.floorIndex;
            buildingColumnInfo2.startWorkTimeIndex = buildingColumnInfo.startWorkTimeIndex;
            buildingColumnInfo2.endWorkTimeIndex = buildingColumnInfo.endWorkTimeIndex;
            buildingColumnInfo2.fiasIndex = buildingColumnInfo.fiasIndex;
            buildingColumnInfo2.apartmentCountIndex = buildingColumnInfo.apartmentCountIndex;
            buildingColumnInfo2.entranceCountIndex = buildingColumnInfo.entranceCountIndex;
            buildingColumnInfo2.addressIndex = buildingColumnInfo.addressIndex;
            buildingColumnInfo2.sellEnabledIndex = buildingColumnInfo.sellEnabledIndex;
            buildingColumnInfo2.sellEmailsIndex = buildingColumnInfo.sellEmailsIndex;
            buildingColumnInfo2.securityNumberIndex = buildingColumnInfo.securityNumberIndex;
            buildingColumnInfo2.rentAvailableIndex = buildingColumnInfo.rentAvailableIndex;
            buildingColumnInfo2.maxColumnIndexValue = buildingColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_BuildingRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (BuildingColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$floor() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.floorIndex);
    }

    public void realmSet$floor(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.floorIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.floorIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.floorIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.floorIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$startWorkTime() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.startWorkTimeIndex);
    }

    public void realmSet$startWorkTime(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.startWorkTimeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.startWorkTimeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.startWorkTimeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.startWorkTimeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$endWorkTime() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.endWorkTimeIndex);
    }

    public void realmSet$endWorkTime(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.endWorkTimeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.endWorkTimeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.endWorkTimeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.endWorkTimeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$fias() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.fiasIndex);
    }

    public void realmSet$fias(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.fiasIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.fiasIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.fiasIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.fiasIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$apartmentCount() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.apartmentCountIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.apartmentCountIndex));
    }

    public void realmSet$apartmentCount(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.apartmentCountIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.apartmentCountIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.apartmentCountIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.apartmentCountIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$entranceCount() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.entranceCountIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.entranceCountIndex));
    }

    public void realmSet$entranceCount(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.entranceCountIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.entranceCountIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.entranceCountIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.entranceCountIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Address realmGet$address() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.addressIndex)) {
            return null;
        }
        return (Address) this.proxyState.getRealm$realm().get(Address.class, this.proxyState.getRow$realm().getLink(this.columnInfo.addressIndex), false, Collections.emptyList());
    }

    public void realmSet$address(Address address) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (address == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.addressIndex);
                return;
            }
            this.proxyState.checkValidObject(address);
            this.proxyState.getRow$realm().setLink(this.columnInfo.addressIndex, ((RealmObjectProxy) address).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains(Contact.Type.address)) {
            if (address != null && !RealmObject.isManaged(address)) {
                address = (Address) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(address, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (address == null) {
                row$realm.nullifyLink(this.columnInfo.addressIndex);
                return;
            }
            this.proxyState.checkValidObject(address);
            row$realm.getTable().setLink(this.columnInfo.addressIndex, row$realm.getIndex(), ((RealmObjectProxy) address).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public Boolean realmGet$sellEnabled() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.sellEnabledIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.sellEnabledIndex));
    }

    public void realmSet$sellEnabled(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sellEnabledIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.sellEnabledIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.sellEnabledIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.sellEnabledIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    public RealmList<String> realmGet$sellEmails() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<String> realmList = this.sellEmailsRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.sellEmailsRealmList = new RealmList<>(String.class, this.proxyState.getRow$realm().getValueList(this.columnInfo.sellEmailsIndex, RealmFieldType.STRING_LIST), this.proxyState.getRealm$realm());
        return this.sellEmailsRealmList;
    }

    public void realmSet$sellEmails(RealmList<String> realmList) {
        if (!this.proxyState.isUnderConstruction() || (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("sellEmails"))) {
            this.proxyState.getRealm$realm().checkIfValid();
            OsList valueList = this.proxyState.getRow$realm().getValueList(this.columnInfo.sellEmailsIndex, RealmFieldType.STRING_LIST);
            valueList.removeAll();
            if (realmList != null) {
                Iterator<String> it = realmList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (next == null) {
                        valueList.addNull();
                    } else {
                        valueList.addString(next);
                    }
                }
            }
        }
    }

    public String realmGet$securityNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.securityNumberIndex);
    }

    public void realmSet$securityNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.securityNumberIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.securityNumberIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.securityNumberIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.securityNumberIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Boolean realmGet$rentAvailable() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.rentAvailableIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.rentAvailableIndex));
    }

    public void realmSet$rentAvailable(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.rentAvailableIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.rentAvailableIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.rentAvailableIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.rentAvailableIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 13, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("floor", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("startWorkTime", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("endWorkTime", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("fias", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("apartmentCount", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("entranceCount", RealmFieldType.INTEGER, false, false, false);
        builder.addPersistedLinkProperty(Contact.Type.address, RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_AddressRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedProperty("sellEnabled", RealmFieldType.BOOLEAN, false, false, false);
        builder.addPersistedValueListProperty("sellEmails", RealmFieldType.STRING_LIST, false);
        OsObjectSchemaInfo.Builder builder3 = builder;
        builder3.addPersistedProperty("securityNumber", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("rentAvailable", RealmFieldType.BOOLEAN, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static BuildingColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new BuildingColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.Building createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            java.lang.String r1 = "id"
            r2 = 0
            if (r15 == 0) goto L_0x0066
            java.lang.Class<ru.unicorn.ujin.data.realm.Building> r3 = p035ru.unicorn.ujin.data.realm.Building.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.Building> r5 = p035ru.unicorn.ujin.data.realm.Building.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy$BuildingColumnInfo r4 = (p046io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy.BuildingColumnInfo) r4
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
            java.lang.Class<ru.unicorn.ujin.data.realm.Building> r4 = p035ru.unicorn.ujin.data.realm.Building.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x0061 }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0061 }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0061 }
            io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy r3 = new io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy     // Catch:{ all -> 0x0061 }
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
            java.lang.String r4 = "sellEmails"
            java.lang.String r5 = "address"
            if (r3 != 0) goto L_0x00ac
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x0076
            r0.add(r5)
        L_0x0076:
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x007f
            r0.add(r4)
        L_0x007f:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00a4
            boolean r3 = r14.isNull(r1)
            r6 = 1
            if (r3 == 0) goto L_0x0096
            java.lang.Class<ru.unicorn.ujin.data.realm.Building> r1 = p035ru.unicorn.ujin.data.realm.Building.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r6, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy r3 = (p046io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy) r3
            goto L_0x00ac
        L_0x0096:
            java.lang.Class<ru.unicorn.ujin.data.realm.Building> r3 = p035ru.unicorn.ujin.data.realm.Building.class
            java.lang.String r1 = r14.getString(r1)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r6, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy r3 = (p046io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy) r3
            goto L_0x00ac
        L_0x00a4:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00ac:
            r0 = r3
            io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxyInterface r0 = (p046io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxyInterface) r0
            java.lang.String r1 = "title"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x00c8
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x00c1
            r0.realmSet$title(r2)
            goto L_0x00c8
        L_0x00c1:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$title(r1)
        L_0x00c8:
            java.lang.String r1 = "floor"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x00e1
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x00da
            r0.realmSet$floor(r2)
            goto L_0x00e1
        L_0x00da:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$floor(r1)
        L_0x00e1:
            java.lang.String r1 = "startWorkTime"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x00fa
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x00f3
            r0.realmSet$startWorkTime(r2)
            goto L_0x00fa
        L_0x00f3:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$startWorkTime(r1)
        L_0x00fa:
            java.lang.String r1 = "endWorkTime"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0113
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x010c
            r0.realmSet$endWorkTime(r2)
            goto L_0x0113
        L_0x010c:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$endWorkTime(r1)
        L_0x0113:
            java.lang.String r1 = "fias"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x012c
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x0125
            r0.realmSet$fias(r2)
            goto L_0x012c
        L_0x0125:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$fias(r1)
        L_0x012c:
            java.lang.String r1 = "apartmentCount"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0149
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x013e
            r0.realmSet$apartmentCount(r2)
            goto L_0x0149
        L_0x013e:
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$apartmentCount(r1)
        L_0x0149:
            java.lang.String r1 = "entranceCount"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0166
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x015b
            r0.realmSet$entranceCount(r2)
            goto L_0x0166
        L_0x015b:
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$entranceCount(r1)
        L_0x0166:
            boolean r1 = r14.has(r5)
            if (r1 == 0) goto L_0x0181
            boolean r1 = r14.isNull(r5)
            if (r1 == 0) goto L_0x0176
            r0.realmSet$address(r2)
            goto L_0x0181
        L_0x0176:
            org.json.JSONObject r1 = r14.getJSONObject(r5)
            ru.unicorn.ujin.data.realm.Address r13 = p046io.realm.ru_unicorn_ujin_data_realm_AddressRealmProxy.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$address(r13)
        L_0x0181:
            java.lang.String r13 = "sellEnabled"
            boolean r15 = r14.has(r13)
            if (r15 == 0) goto L_0x019e
            boolean r15 = r14.isNull(r13)
            if (r15 == 0) goto L_0x0193
            r0.realmSet$sellEnabled(r2)
            goto L_0x019e
        L_0x0193:
            boolean r13 = r14.getBoolean(r13)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r0.realmSet$sellEnabled(r13)
        L_0x019e:
            io.realm.RealmList r13 = r0.realmGet$sellEmails()
            p046io.realm.ProxyUtils.setRealmListWithJsonObject(r13, r14, r4)
            java.lang.String r13 = "securityNumber"
            boolean r15 = r14.has(r13)
            if (r15 == 0) goto L_0x01be
            boolean r15 = r14.isNull(r13)
            if (r15 == 0) goto L_0x01b7
            r0.realmSet$securityNumber(r2)
            goto L_0x01be
        L_0x01b7:
            java.lang.String r13 = r14.getString(r13)
            r0.realmSet$securityNumber(r13)
        L_0x01be:
            java.lang.String r13 = "rentAvailable"
            boolean r15 = r14.has(r13)
            if (r15 == 0) goto L_0x01db
            boolean r15 = r14.isNull(r13)
            if (r15 == 0) goto L_0x01d0
            r0.realmSet$rentAvailable(r2)
            goto L_0x01db
        L_0x01d0:
            boolean r13 = r14.getBoolean(r13)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r0.realmSet$rentAvailable(r13)
        L_0x01db:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.Building");
    }

    public static Building createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Building building = new Building();
        ru_unicorn_ujin_data_realm_BuildingRealmProxyInterface ru_unicorn_ujin_data_realm_buildingrealmproxyinterface = building;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("floor")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$floor(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$floor((String) null);
                }
            } else if (nextName.equals("startWorkTime")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$startWorkTime(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$startWorkTime((String) null);
                }
            } else if (nextName.equals("endWorkTime")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$endWorkTime(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$endWorkTime((String) null);
                }
            } else if (nextName.equals("fias")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$fias(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$fias((String) null);
                }
            } else if (nextName.equals("apartmentCount")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$apartmentCount(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$apartmentCount((Integer) null);
                }
            } else if (nextName.equals("entranceCount")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$entranceCount(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$entranceCount((Integer) null);
                }
            } else if (nextName.equals(Contact.Type.address)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$address((Address) null);
                } else {
                    ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$address(ru_unicorn_ujin_data_realm_AddressRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("sellEnabled")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$sellEnabled(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$sellEnabled((Boolean) null);
                }
            } else if (nextName.equals("sellEmails")) {
                ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$sellEmails(ProxyUtils.createRealmListWithJsonStream(String.class, jsonReader));
            } else if (nextName.equals("securityNumber")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$securityNumber(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$securityNumber((String) null);
                }
            } else if (!nextName.equals("rentAvailable")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$rentAvailable(Boolean.valueOf(jsonReader.nextBoolean()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$rentAvailable((Boolean) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Building) realm.copyToRealm(building, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_BuildingRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Building.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_BuildingRealmProxy ru_unicorn_ujin_data_realm_buildingrealmproxy = new ru_unicorn_ujin_data_realm_BuildingRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_buildingrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.Building copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy.BuildingColumnInfo r9, p035ru.unicorn.ujin.data.realm.Building r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.Building r1 = (p035ru.unicorn.ujin.data.realm.Building) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.Building> r2 = p035ru.unicorn.ujin.data.realm.Building.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxyInterface) r5
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
            io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.Building r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.Building r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy$BuildingColumnInfo, ru.unicorn.ujin.data.realm.Building, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.Building");
    }

    public static Building copy(Realm realm, BuildingColumnInfo buildingColumnInfo, Building building, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(building);
        if (realmObjectProxy != null) {
            return (Building) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_BuildingRealmProxyInterface ru_unicorn_ujin_data_realm_buildingrealmproxyinterface = building;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Building.class), buildingColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(buildingColumnInfo.idIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(buildingColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(buildingColumnInfo.floorIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$floor());
        osObjectBuilder.addString(buildingColumnInfo.startWorkTimeIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$startWorkTime());
        osObjectBuilder.addString(buildingColumnInfo.endWorkTimeIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$endWorkTime());
        osObjectBuilder.addString(buildingColumnInfo.fiasIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$fias());
        osObjectBuilder.addInteger(buildingColumnInfo.apartmentCountIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$apartmentCount());
        osObjectBuilder.addInteger(buildingColumnInfo.entranceCountIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$entranceCount());
        osObjectBuilder.addBoolean(buildingColumnInfo.sellEnabledIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$sellEnabled());
        osObjectBuilder.addStringList(buildingColumnInfo.sellEmailsIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$sellEmails());
        osObjectBuilder.addString(buildingColumnInfo.securityNumberIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$securityNumber());
        osObjectBuilder.addBoolean(buildingColumnInfo.rentAvailableIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$rentAvailable());
        ru_unicorn_ujin_data_realm_BuildingRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(building, newProxyInstance);
        Address realmGet$address = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$address();
        if (realmGet$address == null) {
            newProxyInstance.realmSet$address((Address) null);
        } else {
            Address address = (Address) map.get(realmGet$address);
            if (address != null) {
                newProxyInstance.realmSet$address(address);
            } else {
                newProxyInstance.realmSet$address(ru_unicorn_ujin_data_realm_AddressRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_AddressRealmProxy.AddressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Address.class), realmGet$address, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Building building, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Realm realm2 = realm;
        Building building2 = building;
        Map<RealmModel, Long> map2 = map;
        if (building2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) building2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Building.class);
        long nativePtr = table.getNativePtr();
        BuildingColumnInfo buildingColumnInfo = (BuildingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Building.class);
        long j6 = buildingColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_BuildingRealmProxyInterface ru_unicorn_ujin_data_realm_buildingrealmproxyinterface = building2;
        String realmGet$id = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j6);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j6, realmGet$id);
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j6, realmGet$id);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map2.put(building2, Long.valueOf(j2));
        String realmGet$title = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            j3 = j2;
            Table.nativeSetString(nativePtr, buildingColumnInfo.titleIndex, j2, realmGet$title, false);
        } else {
            j3 = j2;
        }
        String realmGet$floor = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$floor();
        if (realmGet$floor != null) {
            Table.nativeSetString(nativePtr, buildingColumnInfo.floorIndex, j3, realmGet$floor, false);
        }
        String realmGet$startWorkTime = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$startWorkTime();
        if (realmGet$startWorkTime != null) {
            Table.nativeSetString(nativePtr, buildingColumnInfo.startWorkTimeIndex, j3, realmGet$startWorkTime, false);
        }
        String realmGet$endWorkTime = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$endWorkTime();
        if (realmGet$endWorkTime != null) {
            Table.nativeSetString(nativePtr, buildingColumnInfo.endWorkTimeIndex, j3, realmGet$endWorkTime, false);
        }
        String realmGet$fias = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$fias();
        if (realmGet$fias != null) {
            Table.nativeSetString(nativePtr, buildingColumnInfo.fiasIndex, j3, realmGet$fias, false);
        }
        Integer realmGet$apartmentCount = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$apartmentCount();
        if (realmGet$apartmentCount != null) {
            Table.nativeSetLong(nativePtr, buildingColumnInfo.apartmentCountIndex, j3, realmGet$apartmentCount.longValue(), false);
        }
        Integer realmGet$entranceCount = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$entranceCount();
        if (realmGet$entranceCount != null) {
            Table.nativeSetLong(nativePtr, buildingColumnInfo.entranceCountIndex, j3, realmGet$entranceCount.longValue(), false);
        }
        Address realmGet$address = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$address();
        if (realmGet$address != null) {
            Long l = map2.get(realmGet$address);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_AddressRealmProxy.insert(realm2, realmGet$address, map2));
            }
            Table.nativeSetLink(nativePtr, buildingColumnInfo.addressIndex, j3, l.longValue(), false);
        }
        Boolean realmGet$sellEnabled = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$sellEnabled();
        if (realmGet$sellEnabled != null) {
            Table.nativeSetBoolean(nativePtr, buildingColumnInfo.sellEnabledIndex, j3, realmGet$sellEnabled.booleanValue(), false);
        }
        RealmList<String> realmGet$sellEmails = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$sellEmails();
        if (realmGet$sellEmails != null) {
            j4 = j3;
            OsList osList = new OsList(table.getUncheckedRow(j4), buildingColumnInfo.sellEmailsIndex);
            Iterator<String> it = realmGet$sellEmails.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.addNull();
                } else {
                    osList.addString(next);
                }
            }
        } else {
            j4 = j3;
        }
        String realmGet$securityNumber = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$securityNumber();
        if (realmGet$securityNumber != null) {
            j5 = j4;
            Table.nativeSetString(nativePtr, buildingColumnInfo.securityNumberIndex, j4, realmGet$securityNumber, false);
        } else {
            j5 = j4;
        }
        Boolean realmGet$rentAvailable = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$rentAvailable();
        if (realmGet$rentAvailable != null) {
            Table.nativeSetBoolean(nativePtr, buildingColumnInfo.rentAvailableIndex, j5, realmGet$rentAvailable.booleanValue(), false);
        }
        return j5;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Building.class);
        long nativePtr = table.getNativePtr();
        BuildingColumnInfo buildingColumnInfo = (BuildingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Building.class);
        long j7 = buildingColumnInfo.idIndex;
        while (it.hasNext()) {
            Building building = (Building) it.next();
            if (!map2.containsKey(building)) {
                if (building instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) building;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(building, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_BuildingRealmProxyInterface ru_unicorn_ujin_data_realm_buildingrealmproxyinterface = building;
                String realmGet$id = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j7);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j7, realmGet$id);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j7, realmGet$id);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                    j2 = j;
                }
                map2.put(building, Long.valueOf(j2));
                String realmGet$title = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j4 = j2;
                    j3 = j7;
                    Table.nativeSetString(nativePtr, buildingColumnInfo.titleIndex, j2, realmGet$title, false);
                } else {
                    j4 = j2;
                    j3 = j7;
                }
                String realmGet$floor = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$floor();
                if (realmGet$floor != null) {
                    Table.nativeSetString(nativePtr, buildingColumnInfo.floorIndex, j4, realmGet$floor, false);
                }
                String realmGet$startWorkTime = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$startWorkTime();
                if (realmGet$startWorkTime != null) {
                    Table.nativeSetString(nativePtr, buildingColumnInfo.startWorkTimeIndex, j4, realmGet$startWorkTime, false);
                }
                String realmGet$endWorkTime = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$endWorkTime();
                if (realmGet$endWorkTime != null) {
                    Table.nativeSetString(nativePtr, buildingColumnInfo.endWorkTimeIndex, j4, realmGet$endWorkTime, false);
                }
                String realmGet$fias = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$fias();
                if (realmGet$fias != null) {
                    Table.nativeSetString(nativePtr, buildingColumnInfo.fiasIndex, j4, realmGet$fias, false);
                }
                Integer realmGet$apartmentCount = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$apartmentCount();
                if (realmGet$apartmentCount != null) {
                    Table.nativeSetLong(nativePtr, buildingColumnInfo.apartmentCountIndex, j4, realmGet$apartmentCount.longValue(), false);
                }
                Integer realmGet$entranceCount = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$entranceCount();
                if (realmGet$entranceCount != null) {
                    Table.nativeSetLong(nativePtr, buildingColumnInfo.entranceCountIndex, j4, realmGet$entranceCount.longValue(), false);
                }
                Address realmGet$address = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$address();
                if (realmGet$address != null) {
                    Long l = map2.get(realmGet$address);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_AddressRealmProxy.insert(realm2, realmGet$address, map2));
                    }
                    table.setLink(buildingColumnInfo.addressIndex, j4, l.longValue(), false);
                }
                Boolean realmGet$sellEnabled = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$sellEnabled();
                if (realmGet$sellEnabled != null) {
                    Table.nativeSetBoolean(nativePtr, buildingColumnInfo.sellEnabledIndex, j4, realmGet$sellEnabled.booleanValue(), false);
                }
                RealmList<String> realmGet$sellEmails = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$sellEmails();
                if (realmGet$sellEmails != null) {
                    j5 = j4;
                    OsList osList = new OsList(table.getUncheckedRow(j5), buildingColumnInfo.sellEmailsIndex);
                    Iterator<String> it2 = realmGet$sellEmails.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (next == null) {
                            osList.addNull();
                        } else {
                            osList.addString(next);
                        }
                    }
                } else {
                    j5 = j4;
                }
                String realmGet$securityNumber = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$securityNumber();
                if (realmGet$securityNumber != null) {
                    j6 = j5;
                    Table.nativeSetString(nativePtr, buildingColumnInfo.securityNumberIndex, j5, realmGet$securityNumber, false);
                } else {
                    j6 = j5;
                }
                Boolean realmGet$rentAvailable = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$rentAvailable();
                if (realmGet$rentAvailable != null) {
                    Table.nativeSetBoolean(nativePtr, buildingColumnInfo.rentAvailableIndex, j6, realmGet$rentAvailable.booleanValue(), false);
                }
                j7 = j3;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Building building, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Building building2 = building;
        Map<RealmModel, Long> map2 = map;
        if (building2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) building2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Building.class);
        long nativePtr = table.getNativePtr();
        BuildingColumnInfo buildingColumnInfo = (BuildingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Building.class);
        long j3 = buildingColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_BuildingRealmProxyInterface ru_unicorn_ujin_data_realm_buildingrealmproxyinterface = building2;
        String realmGet$id = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j3, realmGet$id) : j;
        map2.put(building2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$title = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetString(nativePtr, buildingColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetNull(nativePtr, buildingColumnInfo.titleIndex, j2, false);
        }
        String realmGet$floor = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$floor();
        if (realmGet$floor != null) {
            Table.nativeSetString(nativePtr, buildingColumnInfo.floorIndex, j2, realmGet$floor, false);
        } else {
            Table.nativeSetNull(nativePtr, buildingColumnInfo.floorIndex, j2, false);
        }
        String realmGet$startWorkTime = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$startWorkTime();
        if (realmGet$startWorkTime != null) {
            Table.nativeSetString(nativePtr, buildingColumnInfo.startWorkTimeIndex, j2, realmGet$startWorkTime, false);
        } else {
            Table.nativeSetNull(nativePtr, buildingColumnInfo.startWorkTimeIndex, j2, false);
        }
        String realmGet$endWorkTime = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$endWorkTime();
        if (realmGet$endWorkTime != null) {
            Table.nativeSetString(nativePtr, buildingColumnInfo.endWorkTimeIndex, j2, realmGet$endWorkTime, false);
        } else {
            Table.nativeSetNull(nativePtr, buildingColumnInfo.endWorkTimeIndex, j2, false);
        }
        String realmGet$fias = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$fias();
        if (realmGet$fias != null) {
            Table.nativeSetString(nativePtr, buildingColumnInfo.fiasIndex, j2, realmGet$fias, false);
        } else {
            Table.nativeSetNull(nativePtr, buildingColumnInfo.fiasIndex, j2, false);
        }
        Integer realmGet$apartmentCount = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$apartmentCount();
        if (realmGet$apartmentCount != null) {
            Table.nativeSetLong(nativePtr, buildingColumnInfo.apartmentCountIndex, j2, realmGet$apartmentCount.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, buildingColumnInfo.apartmentCountIndex, j2, false);
        }
        Integer realmGet$entranceCount = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$entranceCount();
        if (realmGet$entranceCount != null) {
            Table.nativeSetLong(nativePtr, buildingColumnInfo.entranceCountIndex, j2, realmGet$entranceCount.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, buildingColumnInfo.entranceCountIndex, j2, false);
        }
        Address realmGet$address = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$address();
        if (realmGet$address != null) {
            Long l = map2.get(realmGet$address);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_AddressRealmProxy.insertOrUpdate(realm2, realmGet$address, map2));
            }
            Table.nativeSetLink(nativePtr, buildingColumnInfo.addressIndex, j2, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, buildingColumnInfo.addressIndex, j2);
        }
        Boolean realmGet$sellEnabled = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$sellEnabled();
        if (realmGet$sellEnabled != null) {
            Table.nativeSetBoolean(nativePtr, buildingColumnInfo.sellEnabledIndex, j2, realmGet$sellEnabled.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, buildingColumnInfo.sellEnabledIndex, j2, false);
        }
        long j4 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j4), buildingColumnInfo.sellEmailsIndex);
        osList.removeAll();
        RealmList<String> realmGet$sellEmails = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$sellEmails();
        if (realmGet$sellEmails != null) {
            Iterator<String> it = realmGet$sellEmails.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.addNull();
                } else {
                    osList.addString(next);
                }
            }
        }
        String realmGet$securityNumber = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$securityNumber();
        if (realmGet$securityNumber != null) {
            Table.nativeSetString(nativePtr, buildingColumnInfo.securityNumberIndex, j4, realmGet$securityNumber, false);
        } else {
            Table.nativeSetNull(nativePtr, buildingColumnInfo.securityNumberIndex, j4, false);
        }
        Boolean realmGet$rentAvailable = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$rentAvailable();
        if (realmGet$rentAvailable != null) {
            Table.nativeSetBoolean(nativePtr, buildingColumnInfo.rentAvailableIndex, j4, realmGet$rentAvailable.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, buildingColumnInfo.rentAvailableIndex, j4, false);
        }
        return j4;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Building.class);
        long nativePtr = table.getNativePtr();
        BuildingColumnInfo buildingColumnInfo = (BuildingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Building.class);
        long j5 = buildingColumnInfo.idIndex;
        while (it.hasNext()) {
            Building building = (Building) it.next();
            if (!map2.containsKey(building)) {
                if (building instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) building;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(building, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_BuildingRealmProxyInterface ru_unicorn_ujin_data_realm_buildingrealmproxyinterface = building;
                String realmGet$id = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j5);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j5, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j5, realmGet$id) : j;
                map2.put(building, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$title = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j3 = createRowWithPrimaryKey;
                    j2 = j5;
                    Table.nativeSetString(nativePtr, buildingColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
                } else {
                    j3 = createRowWithPrimaryKey;
                    j2 = j5;
                    Table.nativeSetNull(nativePtr, buildingColumnInfo.titleIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$floor = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$floor();
                if (realmGet$floor != null) {
                    Table.nativeSetString(nativePtr, buildingColumnInfo.floorIndex, j3, realmGet$floor, false);
                } else {
                    Table.nativeSetNull(nativePtr, buildingColumnInfo.floorIndex, j3, false);
                }
                String realmGet$startWorkTime = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$startWorkTime();
                if (realmGet$startWorkTime != null) {
                    Table.nativeSetString(nativePtr, buildingColumnInfo.startWorkTimeIndex, j3, realmGet$startWorkTime, false);
                } else {
                    Table.nativeSetNull(nativePtr, buildingColumnInfo.startWorkTimeIndex, j3, false);
                }
                String realmGet$endWorkTime = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$endWorkTime();
                if (realmGet$endWorkTime != null) {
                    Table.nativeSetString(nativePtr, buildingColumnInfo.endWorkTimeIndex, j3, realmGet$endWorkTime, false);
                } else {
                    Table.nativeSetNull(nativePtr, buildingColumnInfo.endWorkTimeIndex, j3, false);
                }
                String realmGet$fias = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$fias();
                if (realmGet$fias != null) {
                    Table.nativeSetString(nativePtr, buildingColumnInfo.fiasIndex, j3, realmGet$fias, false);
                } else {
                    Table.nativeSetNull(nativePtr, buildingColumnInfo.fiasIndex, j3, false);
                }
                Integer realmGet$apartmentCount = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$apartmentCount();
                if (realmGet$apartmentCount != null) {
                    Table.nativeSetLong(nativePtr, buildingColumnInfo.apartmentCountIndex, j3, realmGet$apartmentCount.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, buildingColumnInfo.apartmentCountIndex, j3, false);
                }
                Integer realmGet$entranceCount = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$entranceCount();
                if (realmGet$entranceCount != null) {
                    Table.nativeSetLong(nativePtr, buildingColumnInfo.entranceCountIndex, j3, realmGet$entranceCount.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, buildingColumnInfo.entranceCountIndex, j3, false);
                }
                Address realmGet$address = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$address();
                if (realmGet$address != null) {
                    Long l = map2.get(realmGet$address);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_AddressRealmProxy.insertOrUpdate(realm2, realmGet$address, map2));
                    }
                    Table.nativeSetLink(nativePtr, buildingColumnInfo.addressIndex, j3, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, buildingColumnInfo.addressIndex, j3);
                }
                Boolean realmGet$sellEnabled = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$sellEnabled();
                if (realmGet$sellEnabled != null) {
                    Table.nativeSetBoolean(nativePtr, buildingColumnInfo.sellEnabledIndex, j3, realmGet$sellEnabled.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, buildingColumnInfo.sellEnabledIndex, j3, false);
                }
                long j6 = j3;
                OsList osList = new OsList(table.getUncheckedRow(j6), buildingColumnInfo.sellEmailsIndex);
                osList.removeAll();
                RealmList<String> realmGet$sellEmails = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$sellEmails();
                if (realmGet$sellEmails != null) {
                    Iterator<String> it2 = realmGet$sellEmails.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (next == null) {
                            osList.addNull();
                        } else {
                            osList.addString(next);
                        }
                    }
                }
                String realmGet$securityNumber = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$securityNumber();
                if (realmGet$securityNumber != null) {
                    j4 = j6;
                    Table.nativeSetString(nativePtr, buildingColumnInfo.securityNumberIndex, j6, realmGet$securityNumber, false);
                } else {
                    j4 = j6;
                    Table.nativeSetNull(nativePtr, buildingColumnInfo.securityNumberIndex, j4, false);
                }
                Boolean realmGet$rentAvailable = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$rentAvailable();
                if (realmGet$rentAvailable != null) {
                    Table.nativeSetBoolean(nativePtr, buildingColumnInfo.rentAvailableIndex, j4, realmGet$rentAvailable.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, buildingColumnInfo.rentAvailableIndex, j4, false);
                }
                j5 = j2;
            }
        }
    }

    public static Building createDetachedCopy(Building building, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Building building2;
        if (i > i2 || building == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(building);
        if (cacheData == null) {
            building2 = new Building();
            map.put(building, new RealmObjectProxy.CacheData(i, building2));
        } else if (i >= cacheData.minDepth) {
            return (Building) cacheData.object;
        } else {
            cacheData.minDepth = i;
            building2 = (Building) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_BuildingRealmProxyInterface ru_unicorn_ujin_data_realm_buildingrealmproxyinterface = building2;
        ru_unicorn_ujin_data_realm_BuildingRealmProxyInterface ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2 = building;
        ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$floor(ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$floor());
        ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$startWorkTime(ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$startWorkTime());
        ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$endWorkTime(ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$endWorkTime());
        ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$fias(ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$fias());
        ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$apartmentCount(ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$apartmentCount());
        ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$entranceCount(ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$entranceCount());
        ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$address(ru_unicorn_ujin_data_realm_AddressRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$address(), i + 1, i2, map));
        ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$sellEnabled(ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$sellEnabled());
        ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$sellEmails(new RealmList());
        ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmGet$sellEmails().addAll(ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$sellEmails());
        ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$securityNumber(ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$securityNumber());
        ru_unicorn_ujin_data_realm_buildingrealmproxyinterface.realmSet$rentAvailable(ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$rentAvailable());
        return building2;
    }

    static Building update(Realm realm, BuildingColumnInfo buildingColumnInfo, Building building, Building building2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ru_unicorn_ujin_data_realm_BuildingRealmProxyInterface ru_unicorn_ujin_data_realm_buildingrealmproxyinterface = building;
        ru_unicorn_ujin_data_realm_BuildingRealmProxyInterface ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2 = building2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Building.class), buildingColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(buildingColumnInfo.idIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(buildingColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(buildingColumnInfo.floorIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$floor());
        osObjectBuilder.addString(buildingColumnInfo.startWorkTimeIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$startWorkTime());
        osObjectBuilder.addString(buildingColumnInfo.endWorkTimeIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$endWorkTime());
        osObjectBuilder.addString(buildingColumnInfo.fiasIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$fias());
        osObjectBuilder.addInteger(buildingColumnInfo.apartmentCountIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$apartmentCount());
        osObjectBuilder.addInteger(buildingColumnInfo.entranceCountIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$entranceCount());
        Address realmGet$address = ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$address();
        if (realmGet$address == null) {
            osObjectBuilder.addNull(buildingColumnInfo.addressIndex);
        } else {
            Address address = (Address) map.get(realmGet$address);
            if (address != null) {
                osObjectBuilder.addObject(buildingColumnInfo.addressIndex, address);
            } else {
                osObjectBuilder.addObject(buildingColumnInfo.addressIndex, ru_unicorn_ujin_data_realm_AddressRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_AddressRealmProxy.AddressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Address.class), realmGet$address, true, map, set));
            }
        }
        osObjectBuilder.addBoolean(buildingColumnInfo.sellEnabledIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$sellEnabled());
        osObjectBuilder.addStringList(buildingColumnInfo.sellEmailsIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$sellEmails());
        osObjectBuilder.addString(buildingColumnInfo.securityNumberIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$securityNumber());
        osObjectBuilder.addBoolean(buildingColumnInfo.rentAvailableIndex, ru_unicorn_ujin_data_realm_buildingrealmproxyinterface2.realmGet$rentAvailable());
        osObjectBuilder.updateExistingObject();
        return building;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v41, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v43, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v45, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v46, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v47, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v48, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v49, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v50, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r6 = this;
            boolean r0 = p046io.realm.RealmObject.isValid(r6)
            if (r0 != 0) goto L_0x0009
            java.lang.String r0 = "Invalid object"
            return r0
        L_0x0009:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Building = proxy["
            r0.<init>(r1)
            java.lang.String r1 = "{id:"
            r0.append(r1)
            java.lang.String r1 = r6.realmGet$id()
            java.lang.String r2 = "null"
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = r6.realmGet$id()
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r3 = ","
            r0.append(r3)
            java.lang.String r4 = "{title:"
            r0.append(r4)
            java.lang.String r4 = r6.realmGet$title()
            if (r4 == 0) goto L_0x0043
            java.lang.String r4 = r6.realmGet$title()
            goto L_0x0044
        L_0x0043:
            r4 = r2
        L_0x0044:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{floor:"
            r0.append(r4)
            java.lang.String r4 = r6.realmGet$floor()
            if (r4 == 0) goto L_0x005e
            java.lang.String r4 = r6.realmGet$floor()
            goto L_0x005f
        L_0x005e:
            r4 = r2
        L_0x005f:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{startWorkTime:"
            r0.append(r4)
            java.lang.String r4 = r6.realmGet$startWorkTime()
            if (r4 == 0) goto L_0x0079
            java.lang.String r4 = r6.realmGet$startWorkTime()
            goto L_0x007a
        L_0x0079:
            r4 = r2
        L_0x007a:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{endWorkTime:"
            r0.append(r4)
            java.lang.String r4 = r6.realmGet$endWorkTime()
            if (r4 == 0) goto L_0x0094
            java.lang.String r4 = r6.realmGet$endWorkTime()
            goto L_0x0095
        L_0x0094:
            r4 = r2
        L_0x0095:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{fias:"
            r0.append(r4)
            java.lang.String r4 = r6.realmGet$fias()
            if (r4 == 0) goto L_0x00af
            java.lang.String r4 = r6.realmGet$fias()
            goto L_0x00b0
        L_0x00af:
            r4 = r2
        L_0x00b0:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{apartmentCount:"
            r0.append(r4)
            java.lang.Integer r4 = r6.realmGet$apartmentCount()
            if (r4 == 0) goto L_0x00ca
            java.lang.Integer r4 = r6.realmGet$apartmentCount()
            goto L_0x00cb
        L_0x00ca:
            r4 = r2
        L_0x00cb:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{entranceCount:"
            r0.append(r4)
            java.lang.Integer r4 = r6.realmGet$entranceCount()
            if (r4 == 0) goto L_0x00e5
            java.lang.Integer r4 = r6.realmGet$entranceCount()
            goto L_0x00e6
        L_0x00e5:
            r4 = r2
        L_0x00e6:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{address:"
            r0.append(r4)
            ru.unicorn.ujin.data.realm.Address r4 = r6.realmGet$address()
            if (r4 == 0) goto L_0x00fe
            java.lang.String r4 = "Address"
            goto L_0x00ff
        L_0x00fe:
            r4 = r2
        L_0x00ff:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{sellEnabled:"
            r0.append(r4)
            java.lang.Boolean r4 = r6.realmGet$sellEnabled()
            if (r4 == 0) goto L_0x0119
            java.lang.Boolean r4 = r6.realmGet$sellEnabled()
            goto L_0x011a
        L_0x0119:
            r4 = r2
        L_0x011a:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{sellEmails:"
            r0.append(r4)
            java.lang.String r4 = "RealmList<String>["
            r0.append(r4)
            io.realm.RealmList r4 = r6.realmGet$sellEmails()
            int r4 = r4.size()
            r0.append(r4)
            java.lang.String r4 = "]"
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r5 = "{securityNumber:"
            r0.append(r5)
            java.lang.String r5 = r6.realmGet$securityNumber()
            if (r5 == 0) goto L_0x0155
            java.lang.String r5 = r6.realmGet$securityNumber()
            goto L_0x0156
        L_0x0155:
            r5 = r2
        L_0x0156:
            r0.append(r5)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "{rentAvailable:"
            r0.append(r3)
            java.lang.Boolean r3 = r6.realmGet$rentAvailable()
            if (r3 == 0) goto L_0x016f
            java.lang.Boolean r2 = r6.realmGet$rentAvailable()
        L_0x016f:
            r0.append(r2)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy.toString():java.lang.String");
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
        ru_unicorn_ujin_data_realm_BuildingRealmProxy ru_unicorn_ujin_data_realm_buildingrealmproxy = (ru_unicorn_ujin_data_realm_BuildingRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_buildingrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_buildingrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_buildingrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
