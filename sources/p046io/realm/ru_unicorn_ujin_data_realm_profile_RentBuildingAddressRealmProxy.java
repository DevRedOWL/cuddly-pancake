package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.realm.profile.RentBuildingAddress;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy */
public class ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy extends RentBuildingAddress implements RealmObjectProxy, C4630x7e95d24c {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RentBuildingAddressColumnInfo columnInfo;
    private ProxyState<RentBuildingAddress> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RentBuildingAddress";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy$RentBuildingAddressColumnInfo */
    static final class RentBuildingAddressColumnInfo extends ColumnInfo {
        long cityIndex;
        long fullAddressIndex;
        long houseIndex;
        long houseNumberIndex;
        long maxColumnIndexValue;
        long placementNumberIndex;
        long streetIndex;

        RentBuildingAddressColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.cityIndex = addColumnDetails("city", "city", objectSchemaInfo);
            this.streetIndex = addColumnDetails("street", "street", objectSchemaInfo);
            this.houseIndex = addColumnDetails("house", "house", objectSchemaInfo);
            this.houseNumberIndex = addColumnDetails("houseNumber", "houseNumber", objectSchemaInfo);
            this.placementNumberIndex = addColumnDetails("placementNumber", "placementNumber", objectSchemaInfo);
            this.fullAddressIndex = addColumnDetails("fullAddress", "fullAddress", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RentBuildingAddressColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RentBuildingAddressColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RentBuildingAddressColumnInfo rentBuildingAddressColumnInfo = (RentBuildingAddressColumnInfo) columnInfo;
            RentBuildingAddressColumnInfo rentBuildingAddressColumnInfo2 = (RentBuildingAddressColumnInfo) columnInfo2;
            rentBuildingAddressColumnInfo2.cityIndex = rentBuildingAddressColumnInfo.cityIndex;
            rentBuildingAddressColumnInfo2.streetIndex = rentBuildingAddressColumnInfo.streetIndex;
            rentBuildingAddressColumnInfo2.houseIndex = rentBuildingAddressColumnInfo.houseIndex;
            rentBuildingAddressColumnInfo2.houseNumberIndex = rentBuildingAddressColumnInfo.houseNumberIndex;
            rentBuildingAddressColumnInfo2.placementNumberIndex = rentBuildingAddressColumnInfo.placementNumberIndex;
            rentBuildingAddressColumnInfo2.fullAddressIndex = rentBuildingAddressColumnInfo.fullAddressIndex;
            rentBuildingAddressColumnInfo2.maxColumnIndexValue = rentBuildingAddressColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RentBuildingAddressColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$city() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.cityIndex);
    }

    public void realmSet$city(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.cityIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.cityIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.cityIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.cityIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$street() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.streetIndex);
    }

    public void realmSet$street(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.streetIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.streetIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.streetIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.streetIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$house() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.houseIndex);
    }

    public void realmSet$house(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.houseIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.houseIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.houseIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.houseIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$houseNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.houseNumberIndex);
    }

    public void realmSet$houseNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.houseNumberIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.houseNumberIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.houseNumberIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.houseNumberIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$placementNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.placementNumberIndex);
    }

    public void realmSet$placementNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.placementNumberIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.placementNumberIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.placementNumberIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.placementNumberIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$fullAddress() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.fullAddressIndex);
    }

    public void realmSet$fullAddress(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.fullAddressIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.fullAddressIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.fullAddressIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.fullAddressIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 6, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("city", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("street", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("house", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("houseNumber", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("placementNumber", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("fullAddress", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RentBuildingAddressColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RentBuildingAddressColumnInfo(osSchemaInfo);
    }

    public static RentBuildingAddress createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        RentBuildingAddress rentBuildingAddress = (RentBuildingAddress) realm.createObjectInternal(RentBuildingAddress.class, true, Collections.emptyList());
        C4630x7e95d24c ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface = rentBuildingAddress;
        if (jSONObject.has("city")) {
            if (jSONObject.isNull("city")) {
                ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$city((String) null);
            } else {
                ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$city(jSONObject.getString("city"));
            }
        }
        if (jSONObject.has("street")) {
            if (jSONObject.isNull("street")) {
                ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$street((String) null);
            } else {
                ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$street(jSONObject.getString("street"));
            }
        }
        if (jSONObject.has("house")) {
            if (jSONObject.isNull("house")) {
                ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$house((String) null);
            } else {
                ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$house(jSONObject.getString("house"));
            }
        }
        if (jSONObject.has("houseNumber")) {
            if (jSONObject.isNull("houseNumber")) {
                ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$houseNumber((String) null);
            } else {
                ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$houseNumber(jSONObject.getString("houseNumber"));
            }
        }
        if (jSONObject.has("placementNumber")) {
            if (jSONObject.isNull("placementNumber")) {
                ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$placementNumber((String) null);
            } else {
                ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$placementNumber(jSONObject.getString("placementNumber"));
            }
        }
        if (jSONObject.has("fullAddress")) {
            if (jSONObject.isNull("fullAddress")) {
                ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$fullAddress((String) null);
            } else {
                ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$fullAddress(jSONObject.getString("fullAddress"));
            }
        }
        return rentBuildingAddress;
    }

    public static RentBuildingAddress createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        RentBuildingAddress rentBuildingAddress = new RentBuildingAddress();
        C4630x7e95d24c ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface = rentBuildingAddress;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("city")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$city(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$city((String) null);
                }
            } else if (nextName.equals("street")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$street(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$street((String) null);
                }
            } else if (nextName.equals("house")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$house(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$house((String) null);
                }
            } else if (nextName.equals("houseNumber")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$houseNumber(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$houseNumber((String) null);
                }
            } else if (nextName.equals("placementNumber")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$placementNumber(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$placementNumber((String) null);
                }
            } else if (!nextName.equals("fullAddress")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$fullAddress(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$fullAddress((String) null);
            }
        }
        jsonReader.endObject();
        return (RentBuildingAddress) realm.copyToRealm(rentBuildingAddress, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentBuildingAddress.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxy = new ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxy;
    }

    public static RentBuildingAddress copyOrUpdate(Realm realm, RentBuildingAddressColumnInfo rentBuildingAddressColumnInfo, RentBuildingAddress rentBuildingAddress, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (rentBuildingAddress instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentBuildingAddress;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return rentBuildingAddress;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(rentBuildingAddress);
        if (realmObjectProxy2 != null) {
            return (RentBuildingAddress) realmObjectProxy2;
        }
        return copy(realm, rentBuildingAddressColumnInfo, rentBuildingAddress, z, map, set);
    }

    public static RentBuildingAddress copy(Realm realm, RentBuildingAddressColumnInfo rentBuildingAddressColumnInfo, RentBuildingAddress rentBuildingAddress, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(rentBuildingAddress);
        if (realmObjectProxy != null) {
            return (RentBuildingAddress) realmObjectProxy;
        }
        C4630x7e95d24c ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface = rentBuildingAddress;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentBuildingAddress.class), rentBuildingAddressColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(rentBuildingAddressColumnInfo.cityIndex, ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$city());
        osObjectBuilder.addString(rentBuildingAddressColumnInfo.streetIndex, ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$street());
        osObjectBuilder.addString(rentBuildingAddressColumnInfo.houseIndex, ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$house());
        osObjectBuilder.addString(rentBuildingAddressColumnInfo.houseNumberIndex, ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$houseNumber());
        osObjectBuilder.addString(rentBuildingAddressColumnInfo.placementNumberIndex, ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$placementNumber());
        osObjectBuilder.addString(rentBuildingAddressColumnInfo.fullAddressIndex, ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$fullAddress());
        ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(rentBuildingAddress, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, RentBuildingAddress rentBuildingAddress, Map<RealmModel, Long> map) {
        if (rentBuildingAddress instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentBuildingAddress;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(RentBuildingAddress.class);
        long nativePtr = table.getNativePtr();
        RentBuildingAddressColumnInfo rentBuildingAddressColumnInfo = (RentBuildingAddressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentBuildingAddress.class);
        long createRow = OsObject.createRow(table);
        map.put(rentBuildingAddress, Long.valueOf(createRow));
        C4630x7e95d24c ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface = rentBuildingAddress;
        String realmGet$city = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$city();
        if (realmGet$city != null) {
            Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.cityIndex, createRow, realmGet$city, false);
        }
        String realmGet$street = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$street();
        if (realmGet$street != null) {
            Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.streetIndex, createRow, realmGet$street, false);
        }
        String realmGet$house = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$house();
        if (realmGet$house != null) {
            Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.houseIndex, createRow, realmGet$house, false);
        }
        String realmGet$houseNumber = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$houseNumber();
        if (realmGet$houseNumber != null) {
            Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.houseNumberIndex, createRow, realmGet$houseNumber, false);
        }
        String realmGet$placementNumber = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$placementNumber();
        if (realmGet$placementNumber != null) {
            Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.placementNumberIndex, createRow, realmGet$placementNumber, false);
        }
        String realmGet$fullAddress = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$fullAddress();
        if (realmGet$fullAddress != null) {
            Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.fullAddressIndex, createRow, realmGet$fullAddress, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(RentBuildingAddress.class);
        long nativePtr = table.getNativePtr();
        RentBuildingAddressColumnInfo rentBuildingAddressColumnInfo = (RentBuildingAddressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentBuildingAddress.class);
        while (it.hasNext()) {
            RentBuildingAddress rentBuildingAddress = (RentBuildingAddress) it.next();
            if (!map2.containsKey(rentBuildingAddress)) {
                if (rentBuildingAddress instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentBuildingAddress;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentBuildingAddress, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(rentBuildingAddress, Long.valueOf(createRow));
                C4630x7e95d24c ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface = rentBuildingAddress;
                String realmGet$city = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$city();
                if (realmGet$city != null) {
                    Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.cityIndex, createRow, realmGet$city, false);
                }
                String realmGet$street = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$street();
                if (realmGet$street != null) {
                    Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.streetIndex, createRow, realmGet$street, false);
                }
                String realmGet$house = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$house();
                if (realmGet$house != null) {
                    Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.houseIndex, createRow, realmGet$house, false);
                }
                String realmGet$houseNumber = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$houseNumber();
                if (realmGet$houseNumber != null) {
                    Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.houseNumberIndex, createRow, realmGet$houseNumber, false);
                }
                String realmGet$placementNumber = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$placementNumber();
                if (realmGet$placementNumber != null) {
                    Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.placementNumberIndex, createRow, realmGet$placementNumber, false);
                }
                String realmGet$fullAddress = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$fullAddress();
                if (realmGet$fullAddress != null) {
                    Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.fullAddressIndex, createRow, realmGet$fullAddress, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, RentBuildingAddress rentBuildingAddress, Map<RealmModel, Long> map) {
        if (rentBuildingAddress instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentBuildingAddress;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(RentBuildingAddress.class);
        long nativePtr = table.getNativePtr();
        RentBuildingAddressColumnInfo rentBuildingAddressColumnInfo = (RentBuildingAddressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentBuildingAddress.class);
        long createRow = OsObject.createRow(table);
        map.put(rentBuildingAddress, Long.valueOf(createRow));
        C4630x7e95d24c ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface = rentBuildingAddress;
        String realmGet$city = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$city();
        if (realmGet$city != null) {
            Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.cityIndex, createRow, realmGet$city, false);
        } else {
            Table.nativeSetNull(nativePtr, rentBuildingAddressColumnInfo.cityIndex, createRow, false);
        }
        String realmGet$street = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$street();
        if (realmGet$street != null) {
            Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.streetIndex, createRow, realmGet$street, false);
        } else {
            Table.nativeSetNull(nativePtr, rentBuildingAddressColumnInfo.streetIndex, createRow, false);
        }
        String realmGet$house = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$house();
        if (realmGet$house != null) {
            Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.houseIndex, createRow, realmGet$house, false);
        } else {
            Table.nativeSetNull(nativePtr, rentBuildingAddressColumnInfo.houseIndex, createRow, false);
        }
        String realmGet$houseNumber = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$houseNumber();
        if (realmGet$houseNumber != null) {
            Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.houseNumberIndex, createRow, realmGet$houseNumber, false);
        } else {
            Table.nativeSetNull(nativePtr, rentBuildingAddressColumnInfo.houseNumberIndex, createRow, false);
        }
        String realmGet$placementNumber = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$placementNumber();
        if (realmGet$placementNumber != null) {
            Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.placementNumberIndex, createRow, realmGet$placementNumber, false);
        } else {
            Table.nativeSetNull(nativePtr, rentBuildingAddressColumnInfo.placementNumberIndex, createRow, false);
        }
        String realmGet$fullAddress = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$fullAddress();
        if (realmGet$fullAddress != null) {
            Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.fullAddressIndex, createRow, realmGet$fullAddress, false);
        } else {
            Table.nativeSetNull(nativePtr, rentBuildingAddressColumnInfo.fullAddressIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(RentBuildingAddress.class);
        long nativePtr = table.getNativePtr();
        RentBuildingAddressColumnInfo rentBuildingAddressColumnInfo = (RentBuildingAddressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentBuildingAddress.class);
        while (it.hasNext()) {
            RentBuildingAddress rentBuildingAddress = (RentBuildingAddress) it.next();
            if (!map2.containsKey(rentBuildingAddress)) {
                if (rentBuildingAddress instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentBuildingAddress;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentBuildingAddress, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(rentBuildingAddress, Long.valueOf(createRow));
                C4630x7e95d24c ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface = rentBuildingAddress;
                String realmGet$city = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$city();
                if (realmGet$city != null) {
                    Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.cityIndex, createRow, realmGet$city, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentBuildingAddressColumnInfo.cityIndex, createRow, false);
                }
                String realmGet$street = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$street();
                if (realmGet$street != null) {
                    Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.streetIndex, createRow, realmGet$street, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentBuildingAddressColumnInfo.streetIndex, createRow, false);
                }
                String realmGet$house = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$house();
                if (realmGet$house != null) {
                    Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.houseIndex, createRow, realmGet$house, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentBuildingAddressColumnInfo.houseIndex, createRow, false);
                }
                String realmGet$houseNumber = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$houseNumber();
                if (realmGet$houseNumber != null) {
                    Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.houseNumberIndex, createRow, realmGet$houseNumber, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentBuildingAddressColumnInfo.houseNumberIndex, createRow, false);
                }
                String realmGet$placementNumber = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$placementNumber();
                if (realmGet$placementNumber != null) {
                    Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.placementNumberIndex, createRow, realmGet$placementNumber, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentBuildingAddressColumnInfo.placementNumberIndex, createRow, false);
                }
                String realmGet$fullAddress = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmGet$fullAddress();
                if (realmGet$fullAddress != null) {
                    Table.nativeSetString(nativePtr, rentBuildingAddressColumnInfo.fullAddressIndex, createRow, realmGet$fullAddress, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentBuildingAddressColumnInfo.fullAddressIndex, createRow, false);
                }
            }
        }
    }

    public static RentBuildingAddress createDetachedCopy(RentBuildingAddress rentBuildingAddress, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        RentBuildingAddress rentBuildingAddress2;
        if (i > i2 || rentBuildingAddress == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(rentBuildingAddress);
        if (cacheData == null) {
            rentBuildingAddress2 = new RentBuildingAddress();
            map.put(rentBuildingAddress, new RealmObjectProxy.CacheData(i, rentBuildingAddress2));
        } else if (i >= cacheData.minDepth) {
            return (RentBuildingAddress) cacheData.object;
        } else {
            cacheData.minDepth = i;
            rentBuildingAddress2 = (RentBuildingAddress) cacheData.object;
        }
        C4630x7e95d24c ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface = rentBuildingAddress2;
        C4630x7e95d24c ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface2 = rentBuildingAddress;
        ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$city(ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface2.realmGet$city());
        ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$street(ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface2.realmGet$street());
        ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$house(ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface2.realmGet$house());
        ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$houseNumber(ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface2.realmGet$houseNumber());
        ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$placementNumber(ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface2.realmGet$placementNumber());
        ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface.realmSet$fullAddress(ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxyinterface2.realmGet$fullAddress());
        return rentBuildingAddress2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("RentBuildingAddress = proxy[");
        sb.append("{city:");
        String str = "null";
        sb.append(realmGet$city() != null ? realmGet$city() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{street:");
        sb.append(realmGet$street() != null ? realmGet$street() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{house:");
        sb.append(realmGet$house() != null ? realmGet$house() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{houseNumber:");
        sb.append(realmGet$houseNumber() != null ? realmGet$houseNumber() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{placementNumber:");
        sb.append(realmGet$placementNumber() != null ? realmGet$placementNumber() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{fullAddress:");
        if (realmGet$fullAddress() != null) {
            str = realmGet$fullAddress();
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
        ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxy = (ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_profile_rentbuildingaddressrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
