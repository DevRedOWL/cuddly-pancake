package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.profile.RentObject;
import p035ru.unicorn.ujin.data.realm.profile.RentObjectBuilding;
import p046io.realm.BaseRealm;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;
import p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy */
public class ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy extends RentObject implements RealmObjectProxy, ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RentObjectColumnInfo columnInfo;
    private ProxyState<RentObject> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RentObject";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy$RentObjectColumnInfo */
    static final class RentObjectColumnInfo extends ColumnInfo {
        long areaIndex;
        long buildingIndex;
        long floorIndex;
        long idIndex;
        long lastDateRentIndex;
        long maxColumnIndexValue;
        long rentAvailableIndex;
        long rentCostIndex;
        long titleIndex;

        RentObjectColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.rentCostIndex = addColumnDetails("rentCost", "rentCost", objectSchemaInfo);
            this.rentAvailableIndex = addColumnDetails("rentAvailable", "rentAvailable", objectSchemaInfo);
            this.lastDateRentIndex = addColumnDetails("lastDateRent", "lastDateRent", objectSchemaInfo);
            this.buildingIndex = addColumnDetails("building", "building", objectSchemaInfo);
            this.areaIndex = addColumnDetails("area", "area", objectSchemaInfo);
            this.floorIndex = addColumnDetails("floor", "floor", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RentObjectColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RentObjectColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RentObjectColumnInfo rentObjectColumnInfo = (RentObjectColumnInfo) columnInfo;
            RentObjectColumnInfo rentObjectColumnInfo2 = (RentObjectColumnInfo) columnInfo2;
            rentObjectColumnInfo2.idIndex = rentObjectColumnInfo.idIndex;
            rentObjectColumnInfo2.titleIndex = rentObjectColumnInfo.titleIndex;
            rentObjectColumnInfo2.rentCostIndex = rentObjectColumnInfo.rentCostIndex;
            rentObjectColumnInfo2.rentAvailableIndex = rentObjectColumnInfo.rentAvailableIndex;
            rentObjectColumnInfo2.lastDateRentIndex = rentObjectColumnInfo.lastDateRentIndex;
            rentObjectColumnInfo2.buildingIndex = rentObjectColumnInfo.buildingIndex;
            rentObjectColumnInfo2.areaIndex = rentObjectColumnInfo.areaIndex;
            rentObjectColumnInfo2.floorIndex = rentObjectColumnInfo.floorIndex;
            rentObjectColumnInfo2.maxColumnIndexValue = rentObjectColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RentObjectColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public long realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex);
    }

    public void realmSet$id(long j) {
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

    public String realmGet$rentCost() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.rentCostIndex);
    }

    public void realmSet$rentCost(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.rentCostIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.rentCostIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.rentCostIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.rentCostIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$rentAvailable() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.rentAvailableIndex);
    }

    public void realmSet$rentAvailable(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.rentAvailableIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.rentAvailableIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.rentAvailableIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.rentAvailableIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$lastDateRent() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.lastDateRentIndex);
    }

    public void realmSet$lastDateRent(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.lastDateRentIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.lastDateRentIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.lastDateRentIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.lastDateRentIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RentObjectBuilding realmGet$building() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.buildingIndex)) {
            return null;
        }
        return (RentObjectBuilding) this.proxyState.getRealm$realm().get(RentObjectBuilding.class, this.proxyState.getRow$realm().getLink(this.columnInfo.buildingIndex), false, Collections.emptyList());
    }

    public void realmSet$building(RentObjectBuilding rentObjectBuilding) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (rentObjectBuilding == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.buildingIndex);
                return;
            }
            this.proxyState.checkValidObject(rentObjectBuilding);
            this.proxyState.getRow$realm().setLink(this.columnInfo.buildingIndex, ((RealmObjectProxy) rentObjectBuilding).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("building")) {
            if (rentObjectBuilding != null && !RealmObject.isManaged(rentObjectBuilding)) {
                rentObjectBuilding = (RentObjectBuilding) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(rentObjectBuilding, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (rentObjectBuilding == null) {
                row$realm.nullifyLink(this.columnInfo.buildingIndex);
                return;
            }
            this.proxyState.checkValidObject(rentObjectBuilding);
            row$realm.getTable().setLink(this.columnInfo.buildingIndex, row$realm.getIndex(), ((RealmObjectProxy) rentObjectBuilding).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public String realmGet$area() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.areaIndex);
    }

    public void realmSet$area(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.areaIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.areaIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.areaIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.areaIndex, row$realm.getIndex(), str, true);
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 8, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, true);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("rentCost", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("rentAvailable", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("lastDateRent", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("building", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder3 = builder;
        builder3.addPersistedProperty("area", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("floor", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RentObjectColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RentObjectColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.profile.RentObject createOrUpdateUsingJsonObject(p046io.realm.Realm r15, org.json.JSONObject r16, boolean r17) throws org.json.JSONException {
        /*
            r0 = r15
            r7 = r16
            r8 = r17
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 1
            r9.<init>(r10)
            java.lang.String r11 = "id"
            r12 = 0
            if (r8 == 0) goto L_0x0069
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentObject> r1 = p035ru.unicorn.ujin.data.realm.profile.RentObject.class
            io.realm.internal.Table r1 = r15.getTable(r1)
            io.realm.RealmSchema r2 = r15.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentObject> r3 = p035ru.unicorn.ujin.data.realm.profile.RentObject.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy$RentObjectColumnInfo r2 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy.RentObjectColumnInfo) r2
            long r2 = r2.idIndex
            boolean r4 = r7.isNull(r11)
            r5 = -1
            if (r4 != 0) goto L_0x0035
            long r13 = r7.getLong(r11)
            long r2 = r1.findFirstLong(r2, r13)
            goto L_0x0036
        L_0x0035:
            r2 = r5
        L_0x0036:
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0069
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r4 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r4 = r4.get()
            r13 = r4
            io.realm.BaseRealm$RealmObjectContext r13 = (p046io.realm.BaseRealm.RealmObjectContext) r13
            io.realm.internal.UncheckedRow r3 = r1.getUncheckedRow(r2)     // Catch:{ all -> 0x0064 }
            io.realm.RealmSchema r1 = r15.getSchema()     // Catch:{ all -> 0x0064 }
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentObject> r2 = p035ru.unicorn.ujin.data.realm.profile.RentObject.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0064 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0064 }
            r1 = r13
            r2 = r15
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0064 }
            io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy     // Catch:{ all -> 0x0064 }
            r1.<init>()     // Catch:{ all -> 0x0064 }
            r13.clear()
            goto L_0x006a
        L_0x0064:
            r0 = move-exception
            r13.clear()
            throw r0
        L_0x0069:
            r1 = r12
        L_0x006a:
            java.lang.String r2 = "building"
            if (r1 != 0) goto L_0x00a5
            boolean r1 = r7.has(r2)
            if (r1 == 0) goto L_0x0077
            r9.add(r2)
        L_0x0077:
            boolean r1 = r7.has(r11)
            if (r1 == 0) goto L_0x009d
            boolean r1 = r7.isNull(r11)
            if (r1 == 0) goto L_0x008c
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentObject> r1 = p035ru.unicorn.ujin.data.realm.profile.RentObject.class
            io.realm.RealmModel r1 = r15.createObjectInternal(r1, r12, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy) r1
            goto L_0x00a5
        L_0x008c:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentObject> r1 = p035ru.unicorn.ujin.data.realm.profile.RentObject.class
            long r3 = r7.getLong(r11)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            io.realm.RealmModel r1 = r15.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy) r1
            goto L_0x00a5
        L_0x009d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'id'."
            r0.<init>(r1)
            throw r0
        L_0x00a5:
            r3 = r1
            io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxyInterface r3 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxyInterface) r3
            java.lang.String r4 = "title"
            boolean r5 = r7.has(r4)
            if (r5 == 0) goto L_0x00c1
            boolean r5 = r7.isNull(r4)
            if (r5 == 0) goto L_0x00ba
            r3.realmSet$title(r12)
            goto L_0x00c1
        L_0x00ba:
            java.lang.String r4 = r7.getString(r4)
            r3.realmSet$title(r4)
        L_0x00c1:
            java.lang.String r4 = "rentCost"
            boolean r5 = r7.has(r4)
            if (r5 == 0) goto L_0x00da
            boolean r5 = r7.isNull(r4)
            if (r5 == 0) goto L_0x00d3
            r3.realmSet$rentCost(r12)
            goto L_0x00da
        L_0x00d3:
            java.lang.String r4 = r7.getString(r4)
            r3.realmSet$rentCost(r4)
        L_0x00da:
            java.lang.String r4 = "rentAvailable"
            boolean r5 = r7.has(r4)
            if (r5 == 0) goto L_0x00f3
            boolean r5 = r7.isNull(r4)
            if (r5 == 0) goto L_0x00ec
            r3.realmSet$rentAvailable(r12)
            goto L_0x00f3
        L_0x00ec:
            java.lang.String r4 = r7.getString(r4)
            r3.realmSet$rentAvailable(r4)
        L_0x00f3:
            java.lang.String r4 = "lastDateRent"
            boolean r5 = r7.has(r4)
            if (r5 == 0) goto L_0x010c
            boolean r5 = r7.isNull(r4)
            if (r5 == 0) goto L_0x0105
            r3.realmSet$lastDateRent(r12)
            goto L_0x010c
        L_0x0105:
            java.lang.String r4 = r7.getString(r4)
            r3.realmSet$lastDateRent(r4)
        L_0x010c:
            boolean r4 = r7.has(r2)
            if (r4 == 0) goto L_0x0127
            boolean r4 = r7.isNull(r2)
            if (r4 == 0) goto L_0x011c
            r3.realmSet$building(r12)
            goto L_0x0127
        L_0x011c:
            org.json.JSONObject r2 = r7.getJSONObject(r2)
            ru.unicorn.ujin.data.realm.profile.RentObjectBuilding r0 = p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.createOrUpdateUsingJsonObject(r15, r2, r8)
            r3.realmSet$building(r0)
        L_0x0127:
            java.lang.String r0 = "area"
            boolean r2 = r7.has(r0)
            if (r2 == 0) goto L_0x0140
            boolean r2 = r7.isNull(r0)
            if (r2 == 0) goto L_0x0139
            r3.realmSet$area(r12)
            goto L_0x0140
        L_0x0139:
            java.lang.String r0 = r7.getString(r0)
            r3.realmSet$area(r0)
        L_0x0140:
            java.lang.String r0 = "floor"
            boolean r2 = r7.has(r0)
            if (r2 == 0) goto L_0x0159
            boolean r2 = r7.isNull(r0)
            if (r2 == 0) goto L_0x0152
            r3.realmSet$floor(r12)
            goto L_0x0159
        L_0x0152:
            java.lang.String r0 = r7.getString(r0)
            r3.realmSet$floor(r0)
        L_0x0159:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.profile.RentObject");
    }

    public static RentObject createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        RentObject rentObject = new RentObject();
        ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxyInterface ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface = rentObject;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$id(jsonReader.nextLong());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("rentCost")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$rentCost(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$rentCost((String) null);
                }
            } else if (nextName.equals("rentAvailable")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$rentAvailable(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$rentAvailable((String) null);
                }
            } else if (nextName.equals("lastDateRent")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$lastDateRent(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$lastDateRent((String) null);
                }
            } else if (nextName.equals("building")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$building((RentObjectBuilding) null);
                } else {
                    ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$building(ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("area")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$area(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$area((String) null);
                }
            } else if (!nextName.equals("floor")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$floor(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$floor((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (RentObject) realm.copyToRealm(rentObject, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentObject.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxy = new ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.profile.RentObject copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy.RentObjectColumnInfo r9, p035ru.unicorn.ujin.data.realm.profile.RentObject r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.profile.RentObject r1 = (p035ru.unicorn.ujin.data.realm.profile.RentObject) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008c
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentObject> r2 = p035ru.unicorn.ujin.data.realm.profile.RentObject.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxyInterface) r5
            long r5 = r5.realmGet$id()
            long r3 = r2.findFirstLong(r3, r5)
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0069
            r0 = 0
            goto L_0x008d
        L_0x0069:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x0087 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0087 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0087 }
            io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy     // Catch:{ all -> 0x0087 }
            r1.<init>()     // Catch:{ all -> 0x0087 }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x0087 }
            r12.put(r10, r2)     // Catch:{ all -> 0x0087 }
            r0.clear()
            goto L_0x008c
        L_0x0087:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x008c:
            r0 = r11
        L_0x008d:
            r3 = r1
            if (r0 == 0) goto L_0x009a
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.data.realm.profile.RentObject r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009e
        L_0x009a:
            ru.unicorn.ujin.data.realm.profile.RentObject r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy$RentObjectColumnInfo, ru.unicorn.ujin.data.realm.profile.RentObject, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.profile.RentObject");
    }

    public static RentObject copy(Realm realm, RentObjectColumnInfo rentObjectColumnInfo, RentObject rentObject, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(rentObject);
        if (realmObjectProxy != null) {
            return (RentObject) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxyInterface ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface = rentObject;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentObject.class), rentObjectColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(rentObjectColumnInfo.idIndex, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(rentObjectColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(rentObjectColumnInfo.rentCostIndex, ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$rentCost());
        osObjectBuilder.addString(rentObjectColumnInfo.rentAvailableIndex, ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$rentAvailable());
        osObjectBuilder.addString(rentObjectColumnInfo.lastDateRentIndex, ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$lastDateRent());
        osObjectBuilder.addString(rentObjectColumnInfo.areaIndex, ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$area());
        osObjectBuilder.addString(rentObjectColumnInfo.floorIndex, ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$floor());
        ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(rentObject, newProxyInstance);
        RentObjectBuilding realmGet$building = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$building();
        if (realmGet$building == null) {
            newProxyInstance.realmSet$building((RentObjectBuilding) null);
        } else {
            RentObjectBuilding rentObjectBuilding = (RentObjectBuilding) map.get(realmGet$building);
            if (rentObjectBuilding != null) {
                newProxyInstance.realmSet$building(rentObjectBuilding);
            } else {
                newProxyInstance.realmSet$building(ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.RentObjectBuildingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentObjectBuilding.class), realmGet$building, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, RentObject rentObject, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        RentObject rentObject2 = rentObject;
        Map<RealmModel, Long> map2 = map;
        if (rentObject2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentObject2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(RentObject.class);
        long nativePtr = table.getNativePtr();
        RentObjectColumnInfo rentObjectColumnInfo = (RentObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentObject.class);
        long j3 = rentObjectColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxyInterface ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface = rentObject2;
        Long valueOf = Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$id());
        if (valueOf != null) {
            j = Table.nativeFindFirstInt(nativePtr, j3, ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
            j2 = j;
        }
        map2.put(rentObject2, Long.valueOf(j2));
        String realmGet$title = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, rentObjectColumnInfo.titleIndex, j2, realmGet$title, false);
        }
        String realmGet$rentCost = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$rentCost();
        if (realmGet$rentCost != null) {
            Table.nativeSetString(nativePtr, rentObjectColumnInfo.rentCostIndex, j2, realmGet$rentCost, false);
        }
        String realmGet$rentAvailable = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$rentAvailable();
        if (realmGet$rentAvailable != null) {
            Table.nativeSetString(nativePtr, rentObjectColumnInfo.rentAvailableIndex, j2, realmGet$rentAvailable, false);
        }
        String realmGet$lastDateRent = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$lastDateRent();
        if (realmGet$lastDateRent != null) {
            Table.nativeSetString(nativePtr, rentObjectColumnInfo.lastDateRentIndex, j2, realmGet$lastDateRent, false);
        }
        RentObjectBuilding realmGet$building = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$building();
        if (realmGet$building != null) {
            Long l = map2.get(realmGet$building);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.insert(realm2, realmGet$building, map2));
            }
            Table.nativeSetLink(nativePtr, rentObjectColumnInfo.buildingIndex, j2, l.longValue(), false);
        }
        String realmGet$area = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$area();
        if (realmGet$area != null) {
            Table.nativeSetString(nativePtr, rentObjectColumnInfo.areaIndex, j2, realmGet$area, false);
        }
        String realmGet$floor = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$floor();
        if (realmGet$floor != null) {
            Table.nativeSetString(nativePtr, rentObjectColumnInfo.floorIndex, j2, realmGet$floor, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(RentObject.class);
        long nativePtr = table.getNativePtr();
        RentObjectColumnInfo rentObjectColumnInfo = (RentObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentObject.class);
        long j2 = rentObjectColumnInfo.idIndex;
        while (it.hasNext()) {
            RentObject rentObject = (RentObject) it.next();
            if (!map2.containsKey(rentObject)) {
                if (rentObject instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentObject;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentObject, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxyInterface ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface = rentObject;
                Long valueOf = Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$id());
                if (valueOf != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j2, ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                long j3 = j;
                map2.put(rentObject, Long.valueOf(j3));
                String realmGet$title = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, rentObjectColumnInfo.titleIndex, j3, realmGet$title, false);
                }
                String realmGet$rentCost = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$rentCost();
                if (realmGet$rentCost != null) {
                    Table.nativeSetString(nativePtr, rentObjectColumnInfo.rentCostIndex, j3, realmGet$rentCost, false);
                }
                String realmGet$rentAvailable = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$rentAvailable();
                if (realmGet$rentAvailable != null) {
                    Table.nativeSetString(nativePtr, rentObjectColumnInfo.rentAvailableIndex, j3, realmGet$rentAvailable, false);
                }
                String realmGet$lastDateRent = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$lastDateRent();
                if (realmGet$lastDateRent != null) {
                    Table.nativeSetString(nativePtr, rentObjectColumnInfo.lastDateRentIndex, j3, realmGet$lastDateRent, false);
                }
                RentObjectBuilding realmGet$building = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$building();
                if (realmGet$building != null) {
                    Long l = map2.get(realmGet$building);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.insert(realm2, realmGet$building, map2));
                    }
                    table.setLink(rentObjectColumnInfo.buildingIndex, j3, l.longValue(), false);
                }
                String realmGet$area = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$area();
                if (realmGet$area != null) {
                    Table.nativeSetString(nativePtr, rentObjectColumnInfo.areaIndex, j3, realmGet$area, false);
                }
                String realmGet$floor = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$floor();
                if (realmGet$floor != null) {
                    Table.nativeSetString(nativePtr, rentObjectColumnInfo.floorIndex, j3, realmGet$floor, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, RentObject rentObject, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        RentObject rentObject2 = rentObject;
        Map<RealmModel, Long> map2 = map;
        if (rentObject2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentObject2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(RentObject.class);
        long nativePtr = table.getNativePtr();
        RentObjectColumnInfo rentObjectColumnInfo = (RentObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentObject.class);
        long j = rentObjectColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxyInterface ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface = rentObject2;
        long nativeFindFirstInt = Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$id()) != null ? Table.nativeFindFirstInt(nativePtr, j, ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$id()) : -1;
        long createRowWithPrimaryKey = nativeFindFirstInt == -1 ? OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$id())) : nativeFindFirstInt;
        map2.put(rentObject2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$title = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, rentObjectColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, rentObjectColumnInfo.titleIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$rentCost = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$rentCost();
        if (realmGet$rentCost != null) {
            Table.nativeSetString(nativePtr, rentObjectColumnInfo.rentCostIndex, createRowWithPrimaryKey, realmGet$rentCost, false);
        } else {
            Table.nativeSetNull(nativePtr, rentObjectColumnInfo.rentCostIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$rentAvailable = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$rentAvailable();
        if (realmGet$rentAvailable != null) {
            Table.nativeSetString(nativePtr, rentObjectColumnInfo.rentAvailableIndex, createRowWithPrimaryKey, realmGet$rentAvailable, false);
        } else {
            Table.nativeSetNull(nativePtr, rentObjectColumnInfo.rentAvailableIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$lastDateRent = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$lastDateRent();
        if (realmGet$lastDateRent != null) {
            Table.nativeSetString(nativePtr, rentObjectColumnInfo.lastDateRentIndex, createRowWithPrimaryKey, realmGet$lastDateRent, false);
        } else {
            Table.nativeSetNull(nativePtr, rentObjectColumnInfo.lastDateRentIndex, createRowWithPrimaryKey, false);
        }
        RentObjectBuilding realmGet$building = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$building();
        if (realmGet$building != null) {
            Long l = map2.get(realmGet$building);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.insertOrUpdate(realm2, realmGet$building, map2));
            }
            Table.nativeSetLink(nativePtr, rentObjectColumnInfo.buildingIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, rentObjectColumnInfo.buildingIndex, createRowWithPrimaryKey);
        }
        String realmGet$area = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$area();
        if (realmGet$area != null) {
            Table.nativeSetString(nativePtr, rentObjectColumnInfo.areaIndex, createRowWithPrimaryKey, realmGet$area, false);
        } else {
            Table.nativeSetNull(nativePtr, rentObjectColumnInfo.areaIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$floor = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$floor();
        if (realmGet$floor != null) {
            Table.nativeSetString(nativePtr, rentObjectColumnInfo.floorIndex, createRowWithPrimaryKey, realmGet$floor, false);
        } else {
            Table.nativeSetNull(nativePtr, rentObjectColumnInfo.floorIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(RentObject.class);
        long nativePtr = table.getNativePtr();
        RentObjectColumnInfo rentObjectColumnInfo = (RentObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentObject.class);
        long j3 = rentObjectColumnInfo.idIndex;
        while (it.hasNext()) {
            RentObject rentObject = (RentObject) it.next();
            if (!map2.containsKey(rentObject)) {
                if (rentObject instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentObject;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentObject, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxyInterface ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface = rentObject;
                if (Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$id()) != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j3, ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$id()));
                }
                long j4 = j;
                map2.put(rentObject, Long.valueOf(j4));
                String realmGet$title = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, rentObjectColumnInfo.titleIndex, j4, realmGet$title, false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, rentObjectColumnInfo.titleIndex, j4, false);
                }
                String realmGet$rentCost = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$rentCost();
                if (realmGet$rentCost != null) {
                    Table.nativeSetString(nativePtr, rentObjectColumnInfo.rentCostIndex, j4, realmGet$rentCost, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentObjectColumnInfo.rentCostIndex, j4, false);
                }
                String realmGet$rentAvailable = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$rentAvailable();
                if (realmGet$rentAvailable != null) {
                    Table.nativeSetString(nativePtr, rentObjectColumnInfo.rentAvailableIndex, j4, realmGet$rentAvailable, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentObjectColumnInfo.rentAvailableIndex, j4, false);
                }
                String realmGet$lastDateRent = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$lastDateRent();
                if (realmGet$lastDateRent != null) {
                    Table.nativeSetString(nativePtr, rentObjectColumnInfo.lastDateRentIndex, j4, realmGet$lastDateRent, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentObjectColumnInfo.lastDateRentIndex, j4, false);
                }
                RentObjectBuilding realmGet$building = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$building();
                if (realmGet$building != null) {
                    Long l = map2.get(realmGet$building);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.insertOrUpdate(realm2, realmGet$building, map2));
                    }
                    Table.nativeSetLink(nativePtr, rentObjectColumnInfo.buildingIndex, j4, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, rentObjectColumnInfo.buildingIndex, j4);
                }
                String realmGet$area = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$area();
                if (realmGet$area != null) {
                    Table.nativeSetString(nativePtr, rentObjectColumnInfo.areaIndex, j4, realmGet$area, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentObjectColumnInfo.areaIndex, j4, false);
                }
                String realmGet$floor = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmGet$floor();
                if (realmGet$floor != null) {
                    Table.nativeSetString(nativePtr, rentObjectColumnInfo.floorIndex, j4, realmGet$floor, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentObjectColumnInfo.floorIndex, j4, false);
                }
                j3 = j2;
            }
        }
    }

    public static RentObject createDetachedCopy(RentObject rentObject, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        RentObject rentObject2;
        if (i > i2 || rentObject == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(rentObject);
        if (cacheData == null) {
            rentObject2 = new RentObject();
            map.put(rentObject, new RealmObjectProxy.CacheData(i, rentObject2));
        } else if (i >= cacheData.minDepth) {
            return (RentObject) cacheData.object;
        } else {
            cacheData.minDepth = i;
            rentObject2 = (RentObject) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxyInterface ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface = rentObject2;
        ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxyInterface ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface2 = rentObject;
        ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$rentCost(ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface2.realmGet$rentCost());
        ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$rentAvailable(ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface2.realmGet$rentAvailable());
        ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$lastDateRent(ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface2.realmGet$lastDateRent());
        ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$building(ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface2.realmGet$building(), i + 1, i2, map));
        ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$area(ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface2.realmGet$area());
        ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface.realmSet$floor(ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface2.realmGet$floor());
        return rentObject2;
    }

    static RentObject update(Realm realm, RentObjectColumnInfo rentObjectColumnInfo, RentObject rentObject, RentObject rentObject2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxyInterface ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface = rentObject;
        ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxyInterface ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface2 = rentObject2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentObject.class), rentObjectColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(rentObjectColumnInfo.idIndex, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface2.realmGet$id()));
        osObjectBuilder.addString(rentObjectColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(rentObjectColumnInfo.rentCostIndex, ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface2.realmGet$rentCost());
        osObjectBuilder.addString(rentObjectColumnInfo.rentAvailableIndex, ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface2.realmGet$rentAvailable());
        osObjectBuilder.addString(rentObjectColumnInfo.lastDateRentIndex, ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface2.realmGet$lastDateRent());
        RentObjectBuilding realmGet$building = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface2.realmGet$building();
        if (realmGet$building == null) {
            osObjectBuilder.addNull(rentObjectColumnInfo.buildingIndex);
        } else {
            RentObjectBuilding rentObjectBuilding = (RentObjectBuilding) map.get(realmGet$building);
            if (rentObjectBuilding != null) {
                osObjectBuilder.addObject(rentObjectColumnInfo.buildingIndex, rentObjectBuilding);
            } else {
                osObjectBuilder.addObject(rentObjectColumnInfo.buildingIndex, ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.RentObjectBuildingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentObjectBuilding.class), realmGet$building, true, map, set));
            }
        }
        osObjectBuilder.addString(rentObjectColumnInfo.areaIndex, ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface2.realmGet$area());
        osObjectBuilder.addString(rentObjectColumnInfo.floorIndex, ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxyinterface2.realmGet$floor());
        osObjectBuilder.updateExistingObject();
        return rentObject;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("RentObject = proxy[");
        sb.append("{id:");
        sb.append(realmGet$id());
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        String str = "null";
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{rentCost:");
        sb.append(realmGet$rentCost() != null ? realmGet$rentCost() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{rentAvailable:");
        sb.append(realmGet$rentAvailable() != null ? realmGet$rentAvailable() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{lastDateRent:");
        sb.append(realmGet$lastDateRent() != null ? realmGet$lastDateRent() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{building:");
        sb.append(realmGet$building() != null ? ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{area:");
        sb.append(realmGet$area() != null ? realmGet$area() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{floor:");
        if (realmGet$floor() != null) {
            str = realmGet$floor();
        }
        sb.append(str);
        sb.append("}");
        sb.append("]");
        return sb.toString();
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
        ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxy = (ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_profile_rentobjectrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
