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
import p035ru.unicorn.ujin.data.realm.CardAdress;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_CardAdressRealmProxy */
public class ru_unicorn_ujin_data_realm_CardAdressRealmProxy extends CardAdress implements RealmObjectProxy, ru_unicorn_ujin_data_realm_CardAdressRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private CardAdressColumnInfo columnInfo;
    private ProxyState<CardAdress> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_CardAdressRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CardAdress";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_CardAdressRealmProxy$CardAdressColumnInfo */
    static final class CardAdressColumnInfo extends ColumnInfo {
        long buildingIdIndex;
        long buildingIndex;
        long cityIndex;
        long fullAddressIndex;
        long idIndex;
        long maxColumnIndexValue;
        long streetIndex;

        CardAdressColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.cityIndex = addColumnDetails("city", "city", objectSchemaInfo);
            this.streetIndex = addColumnDetails("street", "street", objectSchemaInfo);
            this.buildingIndex = addColumnDetails("building", "building", objectSchemaInfo);
            this.fullAddressIndex = addColumnDetails("fullAddress", "fullAddress", objectSchemaInfo);
            this.buildingIdIndex = addColumnDetails("buildingId", "buildingId", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        CardAdressColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new CardAdressColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CardAdressColumnInfo cardAdressColumnInfo = (CardAdressColumnInfo) columnInfo;
            CardAdressColumnInfo cardAdressColumnInfo2 = (CardAdressColumnInfo) columnInfo2;
            cardAdressColumnInfo2.idIndex = cardAdressColumnInfo.idIndex;
            cardAdressColumnInfo2.cityIndex = cardAdressColumnInfo.cityIndex;
            cardAdressColumnInfo2.streetIndex = cardAdressColumnInfo.streetIndex;
            cardAdressColumnInfo2.buildingIndex = cardAdressColumnInfo.buildingIndex;
            cardAdressColumnInfo2.fullAddressIndex = cardAdressColumnInfo.fullAddressIndex;
            cardAdressColumnInfo2.buildingIdIndex = cardAdressColumnInfo.buildingIdIndex;
            cardAdressColumnInfo2.maxColumnIndexValue = cardAdressColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_CardAdressRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (CardAdressColumnInfo) realmObjectContext.getColumnInfo();
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
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.idIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.idIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.idIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.idIndex, row$realm.getIndex(), str, true);
            }
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

    public String realmGet$building() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.buildingIndex);
    }

    public void realmSet$building(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.buildingIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.buildingIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.buildingIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.buildingIndex, row$realm.getIndex(), str, true);
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

    public String realmGet$buildingId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.buildingIdIndex);
    }

    public void realmSet$buildingId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.buildingIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.buildingIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.buildingIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.buildingIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 6, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("city", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("street", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("building", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("fullAddress", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("buildingId", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CardAdressColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CardAdressColumnInfo(osSchemaInfo);
    }

    public static CardAdress createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        CardAdress cardAdress = (CardAdress) realm.createObjectInternal(CardAdress.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_CardAdressRealmProxyInterface ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface = cardAdress;
        if (jSONObject.has("id")) {
            if (jSONObject.isNull("id")) {
                ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$id((String) null);
            } else {
                ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$id(jSONObject.getString("id"));
            }
        }
        if (jSONObject.has("city")) {
            if (jSONObject.isNull("city")) {
                ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$city((String) null);
            } else {
                ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$city(jSONObject.getString("city"));
            }
        }
        if (jSONObject.has("street")) {
            if (jSONObject.isNull("street")) {
                ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$street((String) null);
            } else {
                ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$street(jSONObject.getString("street"));
            }
        }
        if (jSONObject.has("building")) {
            if (jSONObject.isNull("building")) {
                ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$building((String) null);
            } else {
                ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$building(jSONObject.getString("building"));
            }
        }
        if (jSONObject.has("fullAddress")) {
            if (jSONObject.isNull("fullAddress")) {
                ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$fullAddress((String) null);
            } else {
                ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$fullAddress(jSONObject.getString("fullAddress"));
            }
        }
        if (jSONObject.has("buildingId")) {
            if (jSONObject.isNull("buildingId")) {
                ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$buildingId((String) null);
            } else {
                ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$buildingId(jSONObject.getString("buildingId"));
            }
        }
        return cardAdress;
    }

    public static CardAdress createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        CardAdress cardAdress = new CardAdress();
        ru_unicorn_ujin_data_realm_CardAdressRealmProxyInterface ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface = cardAdress;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$id((String) null);
                }
            } else if (nextName.equals("city")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$city(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$city((String) null);
                }
            } else if (nextName.equals("street")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$street(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$street((String) null);
                }
            } else if (nextName.equals("building")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$building(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$building((String) null);
                }
            } else if (nextName.equals("fullAddress")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$fullAddress(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$fullAddress((String) null);
                }
            } else if (!nextName.equals("buildingId")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$buildingId(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$buildingId((String) null);
            }
        }
        jsonReader.endObject();
        return (CardAdress) realm.copyToRealm(cardAdress, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_CardAdressRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) CardAdress.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_CardAdressRealmProxy ru_unicorn_ujin_data_realm_cardadressrealmproxy = new ru_unicorn_ujin_data_realm_CardAdressRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_cardadressrealmproxy;
    }

    public static CardAdress copyOrUpdate(Realm realm, CardAdressColumnInfo cardAdressColumnInfo, CardAdress cardAdress, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (cardAdress instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cardAdress;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return cardAdress;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(cardAdress);
        if (realmObjectProxy2 != null) {
            return (CardAdress) realmObjectProxy2;
        }
        return copy(realm, cardAdressColumnInfo, cardAdress, z, map, set);
    }

    public static CardAdress copy(Realm realm, CardAdressColumnInfo cardAdressColumnInfo, CardAdress cardAdress, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(cardAdress);
        if (realmObjectProxy != null) {
            return (CardAdress) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_CardAdressRealmProxyInterface ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface = cardAdress;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(CardAdress.class), cardAdressColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(cardAdressColumnInfo.idIndex, ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(cardAdressColumnInfo.cityIndex, ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$city());
        osObjectBuilder.addString(cardAdressColumnInfo.streetIndex, ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$street());
        osObjectBuilder.addString(cardAdressColumnInfo.buildingIndex, ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$building());
        osObjectBuilder.addString(cardAdressColumnInfo.fullAddressIndex, ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$fullAddress());
        osObjectBuilder.addString(cardAdressColumnInfo.buildingIdIndex, ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$buildingId());
        ru_unicorn_ujin_data_realm_CardAdressRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(cardAdress, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, CardAdress cardAdress, Map<RealmModel, Long> map) {
        if (cardAdress instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cardAdress;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(CardAdress.class);
        long nativePtr = table.getNativePtr();
        CardAdressColumnInfo cardAdressColumnInfo = (CardAdressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CardAdress.class);
        long createRow = OsObject.createRow(table);
        map.put(cardAdress, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_CardAdressRealmProxyInterface ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface = cardAdress;
        String realmGet$id = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, cardAdressColumnInfo.idIndex, createRow, realmGet$id, false);
        }
        String realmGet$city = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$city();
        if (realmGet$city != null) {
            Table.nativeSetString(nativePtr, cardAdressColumnInfo.cityIndex, createRow, realmGet$city, false);
        }
        String realmGet$street = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$street();
        if (realmGet$street != null) {
            Table.nativeSetString(nativePtr, cardAdressColumnInfo.streetIndex, createRow, realmGet$street, false);
        }
        String realmGet$building = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$building();
        if (realmGet$building != null) {
            Table.nativeSetString(nativePtr, cardAdressColumnInfo.buildingIndex, createRow, realmGet$building, false);
        }
        String realmGet$fullAddress = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$fullAddress();
        if (realmGet$fullAddress != null) {
            Table.nativeSetString(nativePtr, cardAdressColumnInfo.fullAddressIndex, createRow, realmGet$fullAddress, false);
        }
        String realmGet$buildingId = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$buildingId();
        if (realmGet$buildingId != null) {
            Table.nativeSetString(nativePtr, cardAdressColumnInfo.buildingIdIndex, createRow, realmGet$buildingId, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(CardAdress.class);
        long nativePtr = table.getNativePtr();
        CardAdressColumnInfo cardAdressColumnInfo = (CardAdressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CardAdress.class);
        while (it.hasNext()) {
            CardAdress cardAdress = (CardAdress) it.next();
            if (!map2.containsKey(cardAdress)) {
                if (cardAdress instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cardAdress;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(cardAdress, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(cardAdress, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_CardAdressRealmProxyInterface ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface = cardAdress;
                String realmGet$id = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, cardAdressColumnInfo.idIndex, createRow, realmGet$id, false);
                }
                String realmGet$city = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$city();
                if (realmGet$city != null) {
                    Table.nativeSetString(nativePtr, cardAdressColumnInfo.cityIndex, createRow, realmGet$city, false);
                }
                String realmGet$street = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$street();
                if (realmGet$street != null) {
                    Table.nativeSetString(nativePtr, cardAdressColumnInfo.streetIndex, createRow, realmGet$street, false);
                }
                String realmGet$building = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$building();
                if (realmGet$building != null) {
                    Table.nativeSetString(nativePtr, cardAdressColumnInfo.buildingIndex, createRow, realmGet$building, false);
                }
                String realmGet$fullAddress = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$fullAddress();
                if (realmGet$fullAddress != null) {
                    Table.nativeSetString(nativePtr, cardAdressColumnInfo.fullAddressIndex, createRow, realmGet$fullAddress, false);
                }
                String realmGet$buildingId = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$buildingId();
                if (realmGet$buildingId != null) {
                    Table.nativeSetString(nativePtr, cardAdressColumnInfo.buildingIdIndex, createRow, realmGet$buildingId, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, CardAdress cardAdress, Map<RealmModel, Long> map) {
        if (cardAdress instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cardAdress;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(CardAdress.class);
        long nativePtr = table.getNativePtr();
        CardAdressColumnInfo cardAdressColumnInfo = (CardAdressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CardAdress.class);
        long createRow = OsObject.createRow(table);
        map.put(cardAdress, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_CardAdressRealmProxyInterface ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface = cardAdress;
        String realmGet$id = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, cardAdressColumnInfo.idIndex, createRow, realmGet$id, false);
        } else {
            Table.nativeSetNull(nativePtr, cardAdressColumnInfo.idIndex, createRow, false);
        }
        String realmGet$city = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$city();
        if (realmGet$city != null) {
            Table.nativeSetString(nativePtr, cardAdressColumnInfo.cityIndex, createRow, realmGet$city, false);
        } else {
            Table.nativeSetNull(nativePtr, cardAdressColumnInfo.cityIndex, createRow, false);
        }
        String realmGet$street = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$street();
        if (realmGet$street != null) {
            Table.nativeSetString(nativePtr, cardAdressColumnInfo.streetIndex, createRow, realmGet$street, false);
        } else {
            Table.nativeSetNull(nativePtr, cardAdressColumnInfo.streetIndex, createRow, false);
        }
        String realmGet$building = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$building();
        if (realmGet$building != null) {
            Table.nativeSetString(nativePtr, cardAdressColumnInfo.buildingIndex, createRow, realmGet$building, false);
        } else {
            Table.nativeSetNull(nativePtr, cardAdressColumnInfo.buildingIndex, createRow, false);
        }
        String realmGet$fullAddress = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$fullAddress();
        if (realmGet$fullAddress != null) {
            Table.nativeSetString(nativePtr, cardAdressColumnInfo.fullAddressIndex, createRow, realmGet$fullAddress, false);
        } else {
            Table.nativeSetNull(nativePtr, cardAdressColumnInfo.fullAddressIndex, createRow, false);
        }
        String realmGet$buildingId = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$buildingId();
        if (realmGet$buildingId != null) {
            Table.nativeSetString(nativePtr, cardAdressColumnInfo.buildingIdIndex, createRow, realmGet$buildingId, false);
        } else {
            Table.nativeSetNull(nativePtr, cardAdressColumnInfo.buildingIdIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(CardAdress.class);
        long nativePtr = table.getNativePtr();
        CardAdressColumnInfo cardAdressColumnInfo = (CardAdressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CardAdress.class);
        while (it.hasNext()) {
            CardAdress cardAdress = (CardAdress) it.next();
            if (!map2.containsKey(cardAdress)) {
                if (cardAdress instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cardAdress;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(cardAdress, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(cardAdress, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_CardAdressRealmProxyInterface ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface = cardAdress;
                String realmGet$id = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, cardAdressColumnInfo.idIndex, createRow, realmGet$id, false);
                } else {
                    Table.nativeSetNull(nativePtr, cardAdressColumnInfo.idIndex, createRow, false);
                }
                String realmGet$city = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$city();
                if (realmGet$city != null) {
                    Table.nativeSetString(nativePtr, cardAdressColumnInfo.cityIndex, createRow, realmGet$city, false);
                } else {
                    Table.nativeSetNull(nativePtr, cardAdressColumnInfo.cityIndex, createRow, false);
                }
                String realmGet$street = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$street();
                if (realmGet$street != null) {
                    Table.nativeSetString(nativePtr, cardAdressColumnInfo.streetIndex, createRow, realmGet$street, false);
                } else {
                    Table.nativeSetNull(nativePtr, cardAdressColumnInfo.streetIndex, createRow, false);
                }
                String realmGet$building = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$building();
                if (realmGet$building != null) {
                    Table.nativeSetString(nativePtr, cardAdressColumnInfo.buildingIndex, createRow, realmGet$building, false);
                } else {
                    Table.nativeSetNull(nativePtr, cardAdressColumnInfo.buildingIndex, createRow, false);
                }
                String realmGet$fullAddress = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$fullAddress();
                if (realmGet$fullAddress != null) {
                    Table.nativeSetString(nativePtr, cardAdressColumnInfo.fullAddressIndex, createRow, realmGet$fullAddress, false);
                } else {
                    Table.nativeSetNull(nativePtr, cardAdressColumnInfo.fullAddressIndex, createRow, false);
                }
                String realmGet$buildingId = ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmGet$buildingId();
                if (realmGet$buildingId != null) {
                    Table.nativeSetString(nativePtr, cardAdressColumnInfo.buildingIdIndex, createRow, realmGet$buildingId, false);
                } else {
                    Table.nativeSetNull(nativePtr, cardAdressColumnInfo.buildingIdIndex, createRow, false);
                }
            }
        }
    }

    public static CardAdress createDetachedCopy(CardAdress cardAdress, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        CardAdress cardAdress2;
        if (i > i2 || cardAdress == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(cardAdress);
        if (cacheData == null) {
            cardAdress2 = new CardAdress();
            map.put(cardAdress, new RealmObjectProxy.CacheData(i, cardAdress2));
        } else if (i >= cacheData.minDepth) {
            return (CardAdress) cacheData.object;
        } else {
            cacheData.minDepth = i;
            cardAdress2 = (CardAdress) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_CardAdressRealmProxyInterface ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface = cardAdress2;
        ru_unicorn_ujin_data_realm_CardAdressRealmProxyInterface ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface2 = cardAdress;
        ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$city(ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface2.realmGet$city());
        ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$street(ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface2.realmGet$street());
        ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$building(ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface2.realmGet$building());
        ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$fullAddress(ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface2.realmGet$fullAddress());
        ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface.realmSet$buildingId(ru_unicorn_ujin_data_realm_cardadressrealmproxyinterface2.realmGet$buildingId());
        return cardAdress2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CardAdress = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{city:");
        sb.append(realmGet$city() != null ? realmGet$city() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{street:");
        sb.append(realmGet$street() != null ? realmGet$street() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{building:");
        sb.append(realmGet$building() != null ? realmGet$building() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{fullAddress:");
        sb.append(realmGet$fullAddress() != null ? realmGet$fullAddress() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{buildingId:");
        if (realmGet$buildingId() != null) {
            str = realmGet$buildingId();
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
        ru_unicorn_ujin_data_realm_CardAdressRealmProxy ru_unicorn_ujin_data_realm_cardadressrealmproxy = (ru_unicorn_ujin_data_realm_CardAdressRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_cardadressrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_cardadressrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_cardadressrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
