package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.realm.ApartmentState;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy */
public class ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy extends ApartmentState implements RealmObjectProxy, ru_unicorn_ujin_data_realm_ApartmentStateRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ApartmentStateColumnInfo columnInfo;
    private ProxyState<ApartmentState> proxyState;
    private RealmList<String> windowListRealmList;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ApartmentState";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy$ApartmentStateColumnInfo */
    static final class ApartmentStateColumnInfo extends ColumnInfo {
        long acceptanceDateIndex;
        long acceptanceInfoIndex;
        long contactPersonNameIndex;
        long contactPersonPhoneIndex;
        long maxColumnIndexValue;
        long stateIndex;
        long stateTitleIndex;
        long windowIdIndex;
        long windowListIndex;

        ApartmentStateColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.stateIndex = addColumnDetails("state", "state", objectSchemaInfo);
            this.stateTitleIndex = addColumnDetails("stateTitle", "stateTitle", objectSchemaInfo);
            this.acceptanceDateIndex = addColumnDetails("acceptanceDate", "acceptanceDate", objectSchemaInfo);
            this.contactPersonPhoneIndex = addColumnDetails("contactPersonPhone", "contactPersonPhone", objectSchemaInfo);
            this.contactPersonNameIndex = addColumnDetails("contactPersonName", "contactPersonName", objectSchemaInfo);
            this.acceptanceInfoIndex = addColumnDetails("acceptanceInfo", "acceptanceInfo", objectSchemaInfo);
            this.windowIdIndex = addColumnDetails("windowId", "windowId", objectSchemaInfo);
            this.windowListIndex = addColumnDetails("windowList", "windowList", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ApartmentStateColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ApartmentStateColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ApartmentStateColumnInfo apartmentStateColumnInfo = (ApartmentStateColumnInfo) columnInfo;
            ApartmentStateColumnInfo apartmentStateColumnInfo2 = (ApartmentStateColumnInfo) columnInfo2;
            apartmentStateColumnInfo2.stateIndex = apartmentStateColumnInfo.stateIndex;
            apartmentStateColumnInfo2.stateTitleIndex = apartmentStateColumnInfo.stateTitleIndex;
            apartmentStateColumnInfo2.acceptanceDateIndex = apartmentStateColumnInfo.acceptanceDateIndex;
            apartmentStateColumnInfo2.contactPersonPhoneIndex = apartmentStateColumnInfo.contactPersonPhoneIndex;
            apartmentStateColumnInfo2.contactPersonNameIndex = apartmentStateColumnInfo.contactPersonNameIndex;
            apartmentStateColumnInfo2.acceptanceInfoIndex = apartmentStateColumnInfo.acceptanceInfoIndex;
            apartmentStateColumnInfo2.windowIdIndex = apartmentStateColumnInfo.windowIdIndex;
            apartmentStateColumnInfo2.windowListIndex = apartmentStateColumnInfo.windowListIndex;
            apartmentStateColumnInfo2.maxColumnIndexValue = apartmentStateColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ApartmentStateColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$state() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.stateIndex);
    }

    public void realmSet$state(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.stateIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.stateIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.stateIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.stateIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$stateTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.stateTitleIndex);
    }

    public void realmSet$stateTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.stateTitleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.stateTitleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.stateTitleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.stateTitleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$acceptanceDate() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.acceptanceDateIndex);
    }

    public void realmSet$acceptanceDate(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.acceptanceDateIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.acceptanceDateIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.acceptanceDateIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.acceptanceDateIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$contactPersonPhone() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.contactPersonPhoneIndex);
    }

    public void realmSet$contactPersonPhone(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.contactPersonPhoneIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.contactPersonPhoneIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.contactPersonPhoneIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.contactPersonPhoneIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$contactPersonName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.contactPersonNameIndex);
    }

    public void realmSet$contactPersonName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.contactPersonNameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.contactPersonNameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.contactPersonNameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.contactPersonNameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$acceptanceInfo() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.acceptanceInfoIndex);
    }

    public void realmSet$acceptanceInfo(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.acceptanceInfoIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.acceptanceInfoIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.acceptanceInfoIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.acceptanceInfoIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$windowId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.windowIdIndex);
    }

    public void realmSet$windowId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.windowIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.windowIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.windowIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.windowIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RealmList<String> realmGet$windowList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<String> realmList = this.windowListRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.windowListRealmList = new RealmList<>(String.class, this.proxyState.getRow$realm().getValueList(this.columnInfo.windowListIndex, RealmFieldType.STRING_LIST), this.proxyState.getRealm$realm());
        return this.windowListRealmList;
    }

    public void realmSet$windowList(RealmList<String> realmList) {
        if (!this.proxyState.isUnderConstruction() || (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("windowList"))) {
            this.proxyState.getRealm$realm().checkIfValid();
            OsList valueList = this.proxyState.getRow$realm().getValueList(this.columnInfo.windowListIndex, RealmFieldType.STRING_LIST);
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 8, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("state", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("stateTitle", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("acceptanceDate", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("contactPersonPhone", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("contactPersonName", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("acceptanceInfo", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("windowId", RealmFieldType.STRING, false, false, false);
        builder.addPersistedValueListProperty("windowList", RealmFieldType.STRING_LIST, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ApartmentStateColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ApartmentStateColumnInfo(osSchemaInfo);
    }

    public static ApartmentState createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has("windowList")) {
            arrayList.add("windowList");
        }
        ApartmentState apartmentState = (ApartmentState) realm.createObjectInternal(ApartmentState.class, true, arrayList);
        ru_unicorn_ujin_data_realm_ApartmentStateRealmProxyInterface ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface = apartmentState;
        if (jSONObject.has("state")) {
            if (jSONObject.isNull("state")) {
                ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$state((String) null);
            } else {
                ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$state(jSONObject.getString("state"));
            }
        }
        if (jSONObject.has("stateTitle")) {
            if (jSONObject.isNull("stateTitle")) {
                ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$stateTitle((String) null);
            } else {
                ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$stateTitle(jSONObject.getString("stateTitle"));
            }
        }
        if (jSONObject.has("acceptanceDate")) {
            if (jSONObject.isNull("acceptanceDate")) {
                ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$acceptanceDate((String) null);
            } else {
                ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$acceptanceDate(jSONObject.getString("acceptanceDate"));
            }
        }
        if (jSONObject.has("contactPersonPhone")) {
            if (jSONObject.isNull("contactPersonPhone")) {
                ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$contactPersonPhone((String) null);
            } else {
                ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$contactPersonPhone(jSONObject.getString("contactPersonPhone"));
            }
        }
        if (jSONObject.has("contactPersonName")) {
            if (jSONObject.isNull("contactPersonName")) {
                ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$contactPersonName((String) null);
            } else {
                ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$contactPersonName(jSONObject.getString("contactPersonName"));
            }
        }
        if (jSONObject.has("acceptanceInfo")) {
            if (jSONObject.isNull("acceptanceInfo")) {
                ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$acceptanceInfo((String) null);
            } else {
                ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$acceptanceInfo(jSONObject.getString("acceptanceInfo"));
            }
        }
        if (jSONObject.has("windowId")) {
            if (jSONObject.isNull("windowId")) {
                ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$windowId((String) null);
            } else {
                ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$windowId(jSONObject.getString("windowId"));
            }
        }
        ProxyUtils.setRealmListWithJsonObject(ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$windowList(), jSONObject, "windowList");
        return apartmentState;
    }

    public static ApartmentState createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ApartmentState apartmentState = new ApartmentState();
        ru_unicorn_ujin_data_realm_ApartmentStateRealmProxyInterface ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface = apartmentState;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("state")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$state(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$state((String) null);
                }
            } else if (nextName.equals("stateTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$stateTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$stateTitle((String) null);
                }
            } else if (nextName.equals("acceptanceDate")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$acceptanceDate(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$acceptanceDate((String) null);
                }
            } else if (nextName.equals("contactPersonPhone")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$contactPersonPhone(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$contactPersonPhone((String) null);
                }
            } else if (nextName.equals("contactPersonName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$contactPersonName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$contactPersonName((String) null);
                }
            } else if (nextName.equals("acceptanceInfo")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$acceptanceInfo(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$acceptanceInfo((String) null);
                }
            } else if (nextName.equals("windowId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$windowId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$windowId((String) null);
                }
            } else if (nextName.equals("windowList")) {
                ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$windowList(ProxyUtils.createRealmListWithJsonStream(String.class, jsonReader));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return (ApartmentState) realm.copyToRealm(apartmentState, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ApartmentState.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy ru_unicorn_ujin_data_realm_apartmentstaterealmproxy = new ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_apartmentstaterealmproxy;
    }

    public static ApartmentState copyOrUpdate(Realm realm, ApartmentStateColumnInfo apartmentStateColumnInfo, ApartmentState apartmentState, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (apartmentState instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) apartmentState;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return apartmentState;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(apartmentState);
        if (realmObjectProxy2 != null) {
            return (ApartmentState) realmObjectProxy2;
        }
        return copy(realm, apartmentStateColumnInfo, apartmentState, z, map, set);
    }

    public static ApartmentState copy(Realm realm, ApartmentStateColumnInfo apartmentStateColumnInfo, ApartmentState apartmentState, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(apartmentState);
        if (realmObjectProxy != null) {
            return (ApartmentState) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_ApartmentStateRealmProxyInterface ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface = apartmentState;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ApartmentState.class), apartmentStateColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(apartmentStateColumnInfo.stateIndex, ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$state());
        osObjectBuilder.addString(apartmentStateColumnInfo.stateTitleIndex, ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$stateTitle());
        osObjectBuilder.addString(apartmentStateColumnInfo.acceptanceDateIndex, ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$acceptanceDate());
        osObjectBuilder.addString(apartmentStateColumnInfo.contactPersonPhoneIndex, ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$contactPersonPhone());
        osObjectBuilder.addString(apartmentStateColumnInfo.contactPersonNameIndex, ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$contactPersonName());
        osObjectBuilder.addString(apartmentStateColumnInfo.acceptanceInfoIndex, ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$acceptanceInfo());
        osObjectBuilder.addString(apartmentStateColumnInfo.windowIdIndex, ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$windowId());
        osObjectBuilder.addStringList(apartmentStateColumnInfo.windowListIndex, ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$windowList());
        ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(apartmentState, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, ApartmentState apartmentState, Map<RealmModel, Long> map) {
        if (apartmentState instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) apartmentState;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ApartmentState.class);
        long nativePtr = table.getNativePtr();
        ApartmentStateColumnInfo apartmentStateColumnInfo = (ApartmentStateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ApartmentState.class);
        long createRow = OsObject.createRow(table);
        map.put(apartmentState, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_ApartmentStateRealmProxyInterface ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface = apartmentState;
        String realmGet$state = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$state();
        if (realmGet$state != null) {
            Table.nativeSetString(nativePtr, apartmentStateColumnInfo.stateIndex, createRow, realmGet$state, false);
        }
        String realmGet$stateTitle = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$stateTitle();
        if (realmGet$stateTitle != null) {
            Table.nativeSetString(nativePtr, apartmentStateColumnInfo.stateTitleIndex, createRow, realmGet$stateTitle, false);
        }
        String realmGet$acceptanceDate = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$acceptanceDate();
        if (realmGet$acceptanceDate != null) {
            Table.nativeSetString(nativePtr, apartmentStateColumnInfo.acceptanceDateIndex, createRow, realmGet$acceptanceDate, false);
        }
        String realmGet$contactPersonPhone = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$contactPersonPhone();
        if (realmGet$contactPersonPhone != null) {
            Table.nativeSetString(nativePtr, apartmentStateColumnInfo.contactPersonPhoneIndex, createRow, realmGet$contactPersonPhone, false);
        }
        String realmGet$contactPersonName = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$contactPersonName();
        if (realmGet$contactPersonName != null) {
            Table.nativeSetString(nativePtr, apartmentStateColumnInfo.contactPersonNameIndex, createRow, realmGet$contactPersonName, false);
        }
        String realmGet$acceptanceInfo = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$acceptanceInfo();
        if (realmGet$acceptanceInfo != null) {
            Table.nativeSetString(nativePtr, apartmentStateColumnInfo.acceptanceInfoIndex, createRow, realmGet$acceptanceInfo, false);
        }
        String realmGet$windowId = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$windowId();
        if (realmGet$windowId != null) {
            Table.nativeSetString(nativePtr, apartmentStateColumnInfo.windowIdIndex, createRow, realmGet$windowId, false);
        }
        RealmList<String> realmGet$windowList = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$windowList();
        if (realmGet$windowList != null) {
            OsList osList = new OsList(table.getUncheckedRow(createRow), apartmentStateColumnInfo.windowListIndex);
            Iterator<String> it = realmGet$windowList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.addNull();
                } else {
                    osList.addString(next);
                }
            }
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ApartmentState.class);
        long nativePtr = table.getNativePtr();
        ApartmentStateColumnInfo apartmentStateColumnInfo = (ApartmentStateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ApartmentState.class);
        while (it.hasNext()) {
            ApartmentState apartmentState = (ApartmentState) it.next();
            if (!map2.containsKey(apartmentState)) {
                if (apartmentState instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) apartmentState;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(apartmentState, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(apartmentState, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_ApartmentStateRealmProxyInterface ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface = apartmentState;
                String realmGet$state = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$state();
                if (realmGet$state != null) {
                    Table.nativeSetString(nativePtr, apartmentStateColumnInfo.stateIndex, createRow, realmGet$state, false);
                }
                String realmGet$stateTitle = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$stateTitle();
                if (realmGet$stateTitle != null) {
                    Table.nativeSetString(nativePtr, apartmentStateColumnInfo.stateTitleIndex, createRow, realmGet$stateTitle, false);
                }
                String realmGet$acceptanceDate = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$acceptanceDate();
                if (realmGet$acceptanceDate != null) {
                    Table.nativeSetString(nativePtr, apartmentStateColumnInfo.acceptanceDateIndex, createRow, realmGet$acceptanceDate, false);
                }
                String realmGet$contactPersonPhone = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$contactPersonPhone();
                if (realmGet$contactPersonPhone != null) {
                    Table.nativeSetString(nativePtr, apartmentStateColumnInfo.contactPersonPhoneIndex, createRow, realmGet$contactPersonPhone, false);
                }
                String realmGet$contactPersonName = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$contactPersonName();
                if (realmGet$contactPersonName != null) {
                    Table.nativeSetString(nativePtr, apartmentStateColumnInfo.contactPersonNameIndex, createRow, realmGet$contactPersonName, false);
                }
                String realmGet$acceptanceInfo = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$acceptanceInfo();
                if (realmGet$acceptanceInfo != null) {
                    Table.nativeSetString(nativePtr, apartmentStateColumnInfo.acceptanceInfoIndex, createRow, realmGet$acceptanceInfo, false);
                }
                String realmGet$windowId = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$windowId();
                if (realmGet$windowId != null) {
                    Table.nativeSetString(nativePtr, apartmentStateColumnInfo.windowIdIndex, createRow, realmGet$windowId, false);
                }
                RealmList<String> realmGet$windowList = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$windowList();
                if (realmGet$windowList != null) {
                    OsList osList = new OsList(table.getUncheckedRow(createRow), apartmentStateColumnInfo.windowListIndex);
                    Iterator<String> it2 = realmGet$windowList.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (next == null) {
                            osList.addNull();
                        } else {
                            osList.addString(next);
                        }
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ApartmentState apartmentState, Map<RealmModel, Long> map) {
        if (apartmentState instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) apartmentState;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ApartmentState.class);
        long nativePtr = table.getNativePtr();
        ApartmentStateColumnInfo apartmentStateColumnInfo = (ApartmentStateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ApartmentState.class);
        long createRow = OsObject.createRow(table);
        map.put(apartmentState, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_ApartmentStateRealmProxyInterface ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface = apartmentState;
        String realmGet$state = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$state();
        if (realmGet$state != null) {
            Table.nativeSetString(nativePtr, apartmentStateColumnInfo.stateIndex, createRow, realmGet$state, false);
        } else {
            Table.nativeSetNull(nativePtr, apartmentStateColumnInfo.stateIndex, createRow, false);
        }
        String realmGet$stateTitle = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$stateTitle();
        if (realmGet$stateTitle != null) {
            Table.nativeSetString(nativePtr, apartmentStateColumnInfo.stateTitleIndex, createRow, realmGet$stateTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, apartmentStateColumnInfo.stateTitleIndex, createRow, false);
        }
        String realmGet$acceptanceDate = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$acceptanceDate();
        if (realmGet$acceptanceDate != null) {
            Table.nativeSetString(nativePtr, apartmentStateColumnInfo.acceptanceDateIndex, createRow, realmGet$acceptanceDate, false);
        } else {
            Table.nativeSetNull(nativePtr, apartmentStateColumnInfo.acceptanceDateIndex, createRow, false);
        }
        String realmGet$contactPersonPhone = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$contactPersonPhone();
        if (realmGet$contactPersonPhone != null) {
            Table.nativeSetString(nativePtr, apartmentStateColumnInfo.contactPersonPhoneIndex, createRow, realmGet$contactPersonPhone, false);
        } else {
            Table.nativeSetNull(nativePtr, apartmentStateColumnInfo.contactPersonPhoneIndex, createRow, false);
        }
        String realmGet$contactPersonName = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$contactPersonName();
        if (realmGet$contactPersonName != null) {
            Table.nativeSetString(nativePtr, apartmentStateColumnInfo.contactPersonNameIndex, createRow, realmGet$contactPersonName, false);
        } else {
            Table.nativeSetNull(nativePtr, apartmentStateColumnInfo.contactPersonNameIndex, createRow, false);
        }
        String realmGet$acceptanceInfo = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$acceptanceInfo();
        if (realmGet$acceptanceInfo != null) {
            Table.nativeSetString(nativePtr, apartmentStateColumnInfo.acceptanceInfoIndex, createRow, realmGet$acceptanceInfo, false);
        } else {
            Table.nativeSetNull(nativePtr, apartmentStateColumnInfo.acceptanceInfoIndex, createRow, false);
        }
        String realmGet$windowId = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$windowId();
        if (realmGet$windowId != null) {
            Table.nativeSetString(nativePtr, apartmentStateColumnInfo.windowIdIndex, createRow, realmGet$windowId, false);
        } else {
            Table.nativeSetNull(nativePtr, apartmentStateColumnInfo.windowIdIndex, createRow, false);
        }
        OsList osList = new OsList(table.getUncheckedRow(createRow), apartmentStateColumnInfo.windowListIndex);
        osList.removeAll();
        RealmList<String> realmGet$windowList = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$windowList();
        if (realmGet$windowList != null) {
            Iterator<String> it = realmGet$windowList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.addNull();
                } else {
                    osList.addString(next);
                }
            }
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ApartmentState.class);
        long nativePtr = table.getNativePtr();
        ApartmentStateColumnInfo apartmentStateColumnInfo = (ApartmentStateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ApartmentState.class);
        while (it.hasNext()) {
            ApartmentState apartmentState = (ApartmentState) it.next();
            if (!map2.containsKey(apartmentState)) {
                if (apartmentState instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) apartmentState;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(apartmentState, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(apartmentState, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_ApartmentStateRealmProxyInterface ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface = apartmentState;
                String realmGet$state = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$state();
                if (realmGet$state != null) {
                    Table.nativeSetString(nativePtr, apartmentStateColumnInfo.stateIndex, createRow, realmGet$state, false);
                } else {
                    Table.nativeSetNull(nativePtr, apartmentStateColumnInfo.stateIndex, createRow, false);
                }
                String realmGet$stateTitle = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$stateTitle();
                if (realmGet$stateTitle != null) {
                    Table.nativeSetString(nativePtr, apartmentStateColumnInfo.stateTitleIndex, createRow, realmGet$stateTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, apartmentStateColumnInfo.stateTitleIndex, createRow, false);
                }
                String realmGet$acceptanceDate = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$acceptanceDate();
                if (realmGet$acceptanceDate != null) {
                    Table.nativeSetString(nativePtr, apartmentStateColumnInfo.acceptanceDateIndex, createRow, realmGet$acceptanceDate, false);
                } else {
                    Table.nativeSetNull(nativePtr, apartmentStateColumnInfo.acceptanceDateIndex, createRow, false);
                }
                String realmGet$contactPersonPhone = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$contactPersonPhone();
                if (realmGet$contactPersonPhone != null) {
                    Table.nativeSetString(nativePtr, apartmentStateColumnInfo.contactPersonPhoneIndex, createRow, realmGet$contactPersonPhone, false);
                } else {
                    Table.nativeSetNull(nativePtr, apartmentStateColumnInfo.contactPersonPhoneIndex, createRow, false);
                }
                String realmGet$contactPersonName = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$contactPersonName();
                if (realmGet$contactPersonName != null) {
                    Table.nativeSetString(nativePtr, apartmentStateColumnInfo.contactPersonNameIndex, createRow, realmGet$contactPersonName, false);
                } else {
                    Table.nativeSetNull(nativePtr, apartmentStateColumnInfo.contactPersonNameIndex, createRow, false);
                }
                String realmGet$acceptanceInfo = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$acceptanceInfo();
                if (realmGet$acceptanceInfo != null) {
                    Table.nativeSetString(nativePtr, apartmentStateColumnInfo.acceptanceInfoIndex, createRow, realmGet$acceptanceInfo, false);
                } else {
                    Table.nativeSetNull(nativePtr, apartmentStateColumnInfo.acceptanceInfoIndex, createRow, false);
                }
                String realmGet$windowId = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$windowId();
                if (realmGet$windowId != null) {
                    Table.nativeSetString(nativePtr, apartmentStateColumnInfo.windowIdIndex, createRow, realmGet$windowId, false);
                } else {
                    Table.nativeSetNull(nativePtr, apartmentStateColumnInfo.windowIdIndex, createRow, false);
                }
                OsList osList = new OsList(table.getUncheckedRow(createRow), apartmentStateColumnInfo.windowListIndex);
                osList.removeAll();
                RealmList<String> realmGet$windowList = ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$windowList();
                if (realmGet$windowList != null) {
                    Iterator<String> it2 = realmGet$windowList.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (next == null) {
                            osList.addNull();
                        } else {
                            osList.addString(next);
                        }
                    }
                }
            }
        }
    }

    public static ApartmentState createDetachedCopy(ApartmentState apartmentState, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ApartmentState apartmentState2;
        if (i > i2 || apartmentState == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(apartmentState);
        if (cacheData == null) {
            apartmentState2 = new ApartmentState();
            map.put(apartmentState, new RealmObjectProxy.CacheData(i, apartmentState2));
        } else if (i >= cacheData.minDepth) {
            return (ApartmentState) cacheData.object;
        } else {
            cacheData.minDepth = i;
            apartmentState2 = (ApartmentState) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_ApartmentStateRealmProxyInterface ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface = apartmentState2;
        ru_unicorn_ujin_data_realm_ApartmentStateRealmProxyInterface ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface2 = apartmentState;
        ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$state(ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface2.realmGet$state());
        ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$stateTitle(ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface2.realmGet$stateTitle());
        ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$acceptanceDate(ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface2.realmGet$acceptanceDate());
        ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$contactPersonPhone(ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface2.realmGet$contactPersonPhone());
        ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$contactPersonName(ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface2.realmGet$contactPersonName());
        ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$acceptanceInfo(ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface2.realmGet$acceptanceInfo());
        ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$windowId(ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface2.realmGet$windowId());
        ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmSet$windowList(new RealmList());
        ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface.realmGet$windowList().addAll(ru_unicorn_ujin_data_realm_apartmentstaterealmproxyinterface2.realmGet$windowList());
        return apartmentState2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ApartmentState = proxy[");
        sb.append("{state:");
        String str = "null";
        sb.append(realmGet$state() != null ? realmGet$state() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{stateTitle:");
        sb.append(realmGet$stateTitle() != null ? realmGet$stateTitle() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{acceptanceDate:");
        sb.append(realmGet$acceptanceDate() != null ? realmGet$acceptanceDate() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{contactPersonPhone:");
        sb.append(realmGet$contactPersonPhone() != null ? realmGet$contactPersonPhone() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{contactPersonName:");
        sb.append(realmGet$contactPersonName() != null ? realmGet$contactPersonName() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{acceptanceInfo:");
        sb.append(realmGet$acceptanceInfo() != null ? realmGet$acceptanceInfo() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{windowId:");
        if (realmGet$windowId() != null) {
            str = realmGet$windowId();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{windowList:");
        sb.append("RealmList<String>[");
        sb.append(realmGet$windowList().size());
        sb.append("]");
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
        ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy ru_unicorn_ujin_data_realm_apartmentstaterealmproxy = (ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_apartmentstaterealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_apartmentstaterealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_apartmentstaterealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
