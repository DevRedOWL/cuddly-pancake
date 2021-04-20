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
import p035ru.unicorn.ujin.data.realm.Address;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_AddressRealmProxy */
public class ru_unicorn_ujin_data_realm_AddressRealmProxy extends Address implements RealmObjectProxy, ru_unicorn_ujin_data_realm_AddressRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private AddressColumnInfo columnInfo;
    private ProxyState<Address> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_AddressRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Address";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_AddressRealmProxy$AddressColumnInfo */
    static final class AddressColumnInfo extends ColumnInfo {
        long cityIndex;
        long fullAddressIndex;
        long houseIndex;
        long houseNumberIndex;
        long maxColumnIndexValue;
        long placementNumberIndex;
        long streetIndex;

        AddressColumnInfo(OsSchemaInfo osSchemaInfo) {
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

        AddressColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new AddressColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            AddressColumnInfo addressColumnInfo = (AddressColumnInfo) columnInfo;
            AddressColumnInfo addressColumnInfo2 = (AddressColumnInfo) columnInfo2;
            addressColumnInfo2.cityIndex = addressColumnInfo.cityIndex;
            addressColumnInfo2.streetIndex = addressColumnInfo.streetIndex;
            addressColumnInfo2.houseIndex = addressColumnInfo.houseIndex;
            addressColumnInfo2.houseNumberIndex = addressColumnInfo.houseNumberIndex;
            addressColumnInfo2.placementNumberIndex = addressColumnInfo.placementNumberIndex;
            addressColumnInfo2.fullAddressIndex = addressColumnInfo.fullAddressIndex;
            addressColumnInfo2.maxColumnIndexValue = addressColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_AddressRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (AddressColumnInfo) realmObjectContext.getColumnInfo();
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

    public static AddressColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new AddressColumnInfo(osSchemaInfo);
    }

    public static Address createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        Address address = (Address) realm.createObjectInternal(Address.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_AddressRealmProxyInterface ru_unicorn_ujin_data_realm_addressrealmproxyinterface = address;
        if (jSONObject.has("city")) {
            if (jSONObject.isNull("city")) {
                ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$city((String) null);
            } else {
                ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$city(jSONObject.getString("city"));
            }
        }
        if (jSONObject.has("street")) {
            if (jSONObject.isNull("street")) {
                ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$street((String) null);
            } else {
                ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$street(jSONObject.getString("street"));
            }
        }
        if (jSONObject.has("house")) {
            if (jSONObject.isNull("house")) {
                ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$house((String) null);
            } else {
                ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$house(jSONObject.getString("house"));
            }
        }
        if (jSONObject.has("houseNumber")) {
            if (jSONObject.isNull("houseNumber")) {
                ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$houseNumber((String) null);
            } else {
                ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$houseNumber(jSONObject.getString("houseNumber"));
            }
        }
        if (jSONObject.has("placementNumber")) {
            if (jSONObject.isNull("placementNumber")) {
                ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$placementNumber((String) null);
            } else {
                ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$placementNumber(jSONObject.getString("placementNumber"));
            }
        }
        if (jSONObject.has("fullAddress")) {
            if (jSONObject.isNull("fullAddress")) {
                ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$fullAddress((String) null);
            } else {
                ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$fullAddress(jSONObject.getString("fullAddress"));
            }
        }
        return address;
    }

    public static Address createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Address address = new Address();
        ru_unicorn_ujin_data_realm_AddressRealmProxyInterface ru_unicorn_ujin_data_realm_addressrealmproxyinterface = address;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("city")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$city(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$city((String) null);
                }
            } else if (nextName.equals("street")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$street(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$street((String) null);
                }
            } else if (nextName.equals("house")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$house(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$house((String) null);
                }
            } else if (nextName.equals("houseNumber")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$houseNumber(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$houseNumber((String) null);
                }
            } else if (nextName.equals("placementNumber")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$placementNumber(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$placementNumber((String) null);
                }
            } else if (!nextName.equals("fullAddress")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$fullAddress(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$fullAddress((String) null);
            }
        }
        jsonReader.endObject();
        return (Address) realm.copyToRealm(address, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_AddressRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Address.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_AddressRealmProxy ru_unicorn_ujin_data_realm_addressrealmproxy = new ru_unicorn_ujin_data_realm_AddressRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_addressrealmproxy;
    }

    public static Address copyOrUpdate(Realm realm, AddressColumnInfo addressColumnInfo, Address address, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (address instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) address;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return address;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(address);
        if (realmObjectProxy2 != null) {
            return (Address) realmObjectProxy2;
        }
        return copy(realm, addressColumnInfo, address, z, map, set);
    }

    public static Address copy(Realm realm, AddressColumnInfo addressColumnInfo, Address address, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(address);
        if (realmObjectProxy != null) {
            return (Address) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_AddressRealmProxyInterface ru_unicorn_ujin_data_realm_addressrealmproxyinterface = address;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Address.class), addressColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(addressColumnInfo.cityIndex, ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$city());
        osObjectBuilder.addString(addressColumnInfo.streetIndex, ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$street());
        osObjectBuilder.addString(addressColumnInfo.houseIndex, ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$house());
        osObjectBuilder.addString(addressColumnInfo.houseNumberIndex, ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$houseNumber());
        osObjectBuilder.addString(addressColumnInfo.placementNumberIndex, ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$placementNumber());
        osObjectBuilder.addString(addressColumnInfo.fullAddressIndex, ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$fullAddress());
        ru_unicorn_ujin_data_realm_AddressRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(address, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Address address, Map<RealmModel, Long> map) {
        if (address instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) address;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Address.class);
        long nativePtr = table.getNativePtr();
        AddressColumnInfo addressColumnInfo = (AddressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Address.class);
        long createRow = OsObject.createRow(table);
        map.put(address, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_AddressRealmProxyInterface ru_unicorn_ujin_data_realm_addressrealmproxyinterface = address;
        String realmGet$city = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$city();
        if (realmGet$city != null) {
            Table.nativeSetString(nativePtr, addressColumnInfo.cityIndex, createRow, realmGet$city, false);
        }
        String realmGet$street = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$street();
        if (realmGet$street != null) {
            Table.nativeSetString(nativePtr, addressColumnInfo.streetIndex, createRow, realmGet$street, false);
        }
        String realmGet$house = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$house();
        if (realmGet$house != null) {
            Table.nativeSetString(nativePtr, addressColumnInfo.houseIndex, createRow, realmGet$house, false);
        }
        String realmGet$houseNumber = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$houseNumber();
        if (realmGet$houseNumber != null) {
            Table.nativeSetString(nativePtr, addressColumnInfo.houseNumberIndex, createRow, realmGet$houseNumber, false);
        }
        String realmGet$placementNumber = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$placementNumber();
        if (realmGet$placementNumber != null) {
            Table.nativeSetString(nativePtr, addressColumnInfo.placementNumberIndex, createRow, realmGet$placementNumber, false);
        }
        String realmGet$fullAddress = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$fullAddress();
        if (realmGet$fullAddress != null) {
            Table.nativeSetString(nativePtr, addressColumnInfo.fullAddressIndex, createRow, realmGet$fullAddress, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Address.class);
        long nativePtr = table.getNativePtr();
        AddressColumnInfo addressColumnInfo = (AddressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Address.class);
        while (it.hasNext()) {
            Address address = (Address) it.next();
            if (!map2.containsKey(address)) {
                if (address instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) address;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(address, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(address, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_AddressRealmProxyInterface ru_unicorn_ujin_data_realm_addressrealmproxyinterface = address;
                String realmGet$city = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$city();
                if (realmGet$city != null) {
                    Table.nativeSetString(nativePtr, addressColumnInfo.cityIndex, createRow, realmGet$city, false);
                }
                String realmGet$street = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$street();
                if (realmGet$street != null) {
                    Table.nativeSetString(nativePtr, addressColumnInfo.streetIndex, createRow, realmGet$street, false);
                }
                String realmGet$house = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$house();
                if (realmGet$house != null) {
                    Table.nativeSetString(nativePtr, addressColumnInfo.houseIndex, createRow, realmGet$house, false);
                }
                String realmGet$houseNumber = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$houseNumber();
                if (realmGet$houseNumber != null) {
                    Table.nativeSetString(nativePtr, addressColumnInfo.houseNumberIndex, createRow, realmGet$houseNumber, false);
                }
                String realmGet$placementNumber = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$placementNumber();
                if (realmGet$placementNumber != null) {
                    Table.nativeSetString(nativePtr, addressColumnInfo.placementNumberIndex, createRow, realmGet$placementNumber, false);
                }
                String realmGet$fullAddress = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$fullAddress();
                if (realmGet$fullAddress != null) {
                    Table.nativeSetString(nativePtr, addressColumnInfo.fullAddressIndex, createRow, realmGet$fullAddress, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Address address, Map<RealmModel, Long> map) {
        if (address instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) address;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Address.class);
        long nativePtr = table.getNativePtr();
        AddressColumnInfo addressColumnInfo = (AddressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Address.class);
        long createRow = OsObject.createRow(table);
        map.put(address, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_AddressRealmProxyInterface ru_unicorn_ujin_data_realm_addressrealmproxyinterface = address;
        String realmGet$city = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$city();
        if (realmGet$city != null) {
            Table.nativeSetString(nativePtr, addressColumnInfo.cityIndex, createRow, realmGet$city, false);
        } else {
            Table.nativeSetNull(nativePtr, addressColumnInfo.cityIndex, createRow, false);
        }
        String realmGet$street = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$street();
        if (realmGet$street != null) {
            Table.nativeSetString(nativePtr, addressColumnInfo.streetIndex, createRow, realmGet$street, false);
        } else {
            Table.nativeSetNull(nativePtr, addressColumnInfo.streetIndex, createRow, false);
        }
        String realmGet$house = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$house();
        if (realmGet$house != null) {
            Table.nativeSetString(nativePtr, addressColumnInfo.houseIndex, createRow, realmGet$house, false);
        } else {
            Table.nativeSetNull(nativePtr, addressColumnInfo.houseIndex, createRow, false);
        }
        String realmGet$houseNumber = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$houseNumber();
        if (realmGet$houseNumber != null) {
            Table.nativeSetString(nativePtr, addressColumnInfo.houseNumberIndex, createRow, realmGet$houseNumber, false);
        } else {
            Table.nativeSetNull(nativePtr, addressColumnInfo.houseNumberIndex, createRow, false);
        }
        String realmGet$placementNumber = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$placementNumber();
        if (realmGet$placementNumber != null) {
            Table.nativeSetString(nativePtr, addressColumnInfo.placementNumberIndex, createRow, realmGet$placementNumber, false);
        } else {
            Table.nativeSetNull(nativePtr, addressColumnInfo.placementNumberIndex, createRow, false);
        }
        String realmGet$fullAddress = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$fullAddress();
        if (realmGet$fullAddress != null) {
            Table.nativeSetString(nativePtr, addressColumnInfo.fullAddressIndex, createRow, realmGet$fullAddress, false);
        } else {
            Table.nativeSetNull(nativePtr, addressColumnInfo.fullAddressIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Address.class);
        long nativePtr = table.getNativePtr();
        AddressColumnInfo addressColumnInfo = (AddressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Address.class);
        while (it.hasNext()) {
            Address address = (Address) it.next();
            if (!map2.containsKey(address)) {
                if (address instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) address;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(address, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(address, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_AddressRealmProxyInterface ru_unicorn_ujin_data_realm_addressrealmproxyinterface = address;
                String realmGet$city = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$city();
                if (realmGet$city != null) {
                    Table.nativeSetString(nativePtr, addressColumnInfo.cityIndex, createRow, realmGet$city, false);
                } else {
                    Table.nativeSetNull(nativePtr, addressColumnInfo.cityIndex, createRow, false);
                }
                String realmGet$street = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$street();
                if (realmGet$street != null) {
                    Table.nativeSetString(nativePtr, addressColumnInfo.streetIndex, createRow, realmGet$street, false);
                } else {
                    Table.nativeSetNull(nativePtr, addressColumnInfo.streetIndex, createRow, false);
                }
                String realmGet$house = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$house();
                if (realmGet$house != null) {
                    Table.nativeSetString(nativePtr, addressColumnInfo.houseIndex, createRow, realmGet$house, false);
                } else {
                    Table.nativeSetNull(nativePtr, addressColumnInfo.houseIndex, createRow, false);
                }
                String realmGet$houseNumber = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$houseNumber();
                if (realmGet$houseNumber != null) {
                    Table.nativeSetString(nativePtr, addressColumnInfo.houseNumberIndex, createRow, realmGet$houseNumber, false);
                } else {
                    Table.nativeSetNull(nativePtr, addressColumnInfo.houseNumberIndex, createRow, false);
                }
                String realmGet$placementNumber = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$placementNumber();
                if (realmGet$placementNumber != null) {
                    Table.nativeSetString(nativePtr, addressColumnInfo.placementNumberIndex, createRow, realmGet$placementNumber, false);
                } else {
                    Table.nativeSetNull(nativePtr, addressColumnInfo.placementNumberIndex, createRow, false);
                }
                String realmGet$fullAddress = ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmGet$fullAddress();
                if (realmGet$fullAddress != null) {
                    Table.nativeSetString(nativePtr, addressColumnInfo.fullAddressIndex, createRow, realmGet$fullAddress, false);
                } else {
                    Table.nativeSetNull(nativePtr, addressColumnInfo.fullAddressIndex, createRow, false);
                }
            }
        }
    }

    public static Address createDetachedCopy(Address address, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Address address2;
        if (i > i2 || address == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(address);
        if (cacheData == null) {
            address2 = new Address();
            map.put(address, new RealmObjectProxy.CacheData(i, address2));
        } else if (i >= cacheData.minDepth) {
            return (Address) cacheData.object;
        } else {
            cacheData.minDepth = i;
            address2 = (Address) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_AddressRealmProxyInterface ru_unicorn_ujin_data_realm_addressrealmproxyinterface = address2;
        ru_unicorn_ujin_data_realm_AddressRealmProxyInterface ru_unicorn_ujin_data_realm_addressrealmproxyinterface2 = address;
        ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$city(ru_unicorn_ujin_data_realm_addressrealmproxyinterface2.realmGet$city());
        ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$street(ru_unicorn_ujin_data_realm_addressrealmproxyinterface2.realmGet$street());
        ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$house(ru_unicorn_ujin_data_realm_addressrealmproxyinterface2.realmGet$house());
        ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$houseNumber(ru_unicorn_ujin_data_realm_addressrealmproxyinterface2.realmGet$houseNumber());
        ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$placementNumber(ru_unicorn_ujin_data_realm_addressrealmproxyinterface2.realmGet$placementNumber());
        ru_unicorn_ujin_data_realm_addressrealmproxyinterface.realmSet$fullAddress(ru_unicorn_ujin_data_realm_addressrealmproxyinterface2.realmGet$fullAddress());
        return address2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Address = proxy[");
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
        ru_unicorn_ujin_data_realm_AddressRealmProxy ru_unicorn_ujin_data_realm_addressrealmproxy = (ru_unicorn_ujin_data_realm_AddressRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_addressrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_addressrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_addressrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
