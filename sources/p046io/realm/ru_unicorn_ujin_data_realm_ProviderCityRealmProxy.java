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
import p035ru.unicorn.ujin.data.realm.ProviderCity;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_ProviderCityRealmProxy */
public class ru_unicorn_ujin_data_realm_ProviderCityRealmProxy extends ProviderCity implements RealmObjectProxy, ru_unicorn_ujin_data_realm_ProviderCityRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ProviderCityColumnInfo columnInfo;
    private ProxyState<ProviderCity> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_ProviderCityRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ProviderCity";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_ProviderCityRealmProxy$ProviderCityColumnInfo */
    static final class ProviderCityColumnInfo extends ColumnInfo {
        long accountPrefixIndex;
        long codeIndex;
        long latitudeIndex;
        long longitudeIndex;
        long maxColumnIndexValue;
        long prefixIndex;
        long regionIdIndex;
        long titleIndex;
        long urlIndex;

        ProviderCityColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.prefixIndex = addColumnDetails("prefix", "prefix", objectSchemaInfo);
            this.codeIndex = addColumnDetails("code", "code", objectSchemaInfo);
            this.latitudeIndex = addColumnDetails("latitude", "latitude", objectSchemaInfo);
            this.longitudeIndex = addColumnDetails("longitude", "longitude", objectSchemaInfo);
            this.urlIndex = addColumnDetails("url", "url", objectSchemaInfo);
            this.regionIdIndex = addColumnDetails("regionId", "regionId", objectSchemaInfo);
            this.accountPrefixIndex = addColumnDetails("accountPrefix", "accountPrefix", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ProviderCityColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ProviderCityColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ProviderCityColumnInfo providerCityColumnInfo = (ProviderCityColumnInfo) columnInfo;
            ProviderCityColumnInfo providerCityColumnInfo2 = (ProviderCityColumnInfo) columnInfo2;
            providerCityColumnInfo2.titleIndex = providerCityColumnInfo.titleIndex;
            providerCityColumnInfo2.prefixIndex = providerCityColumnInfo.prefixIndex;
            providerCityColumnInfo2.codeIndex = providerCityColumnInfo.codeIndex;
            providerCityColumnInfo2.latitudeIndex = providerCityColumnInfo.latitudeIndex;
            providerCityColumnInfo2.longitudeIndex = providerCityColumnInfo.longitudeIndex;
            providerCityColumnInfo2.urlIndex = providerCityColumnInfo.urlIndex;
            providerCityColumnInfo2.regionIdIndex = providerCityColumnInfo.regionIdIndex;
            providerCityColumnInfo2.accountPrefixIndex = providerCityColumnInfo.accountPrefixIndex;
            providerCityColumnInfo2.maxColumnIndexValue = providerCityColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_ProviderCityRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ProviderCityColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
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

    public String realmGet$prefix() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.prefixIndex);
    }

    public void realmSet$prefix(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.prefixIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.prefixIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.prefixIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.prefixIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$code() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.codeIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.codeIndex));
    }

    public void realmSet$code(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.codeIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.codeIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.codeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.codeIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Double realmGet$latitude() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.latitudeIndex)) {
            return null;
        }
        return Double.valueOf(this.proxyState.getRow$realm().getDouble(this.columnInfo.latitudeIndex));
    }

    public void realmSet$latitude(Double d) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (d == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.latitudeIndex);
            } else {
                this.proxyState.getRow$realm().setDouble(this.columnInfo.latitudeIndex, d.doubleValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (d == null) {
                row$realm.getTable().setNull(this.columnInfo.latitudeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setDouble(this.columnInfo.latitudeIndex, row$realm.getIndex(), d.doubleValue(), true);
            }
        }
    }

    public Double realmGet$longitude() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.longitudeIndex)) {
            return null;
        }
        return Double.valueOf(this.proxyState.getRow$realm().getDouble(this.columnInfo.longitudeIndex));
    }

    public void realmSet$longitude(Double d) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (d == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.longitudeIndex);
            } else {
                this.proxyState.getRow$realm().setDouble(this.columnInfo.longitudeIndex, d.doubleValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (d == null) {
                row$realm.getTable().setNull(this.columnInfo.longitudeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setDouble(this.columnInfo.longitudeIndex, row$realm.getIndex(), d.doubleValue(), true);
            }
        }
    }

    public String realmGet$url() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.urlIndex);
    }

    public void realmSet$url(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.urlIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.urlIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.urlIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.urlIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$regionId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.regionIdIndex);
    }

    public void realmSet$regionId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.regionIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.regionIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.regionIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.regionIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$accountPrefix() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.accountPrefixIndex);
    }

    public void realmSet$accountPrefix(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.accountPrefixIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.accountPrefixIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.accountPrefixIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.accountPrefixIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 8, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("prefix", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("code", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("latitude", RealmFieldType.DOUBLE, false, false, false);
        builder2.addPersistedProperty("longitude", RealmFieldType.DOUBLE, false, false, false);
        builder2.addPersistedProperty("url", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("regionId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("accountPrefix", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ProviderCityColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ProviderCityColumnInfo(osSchemaInfo);
    }

    public static ProviderCity createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ProviderCity providerCity = (ProviderCity) realm.createObjectInternal(ProviderCity.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_ProviderCityRealmProxyInterface ru_unicorn_ujin_data_realm_providercityrealmproxyinterface = providerCity;
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("prefix")) {
            if (jSONObject.isNull("prefix")) {
                ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$prefix((String) null);
            } else {
                ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$prefix(jSONObject.getString("prefix"));
            }
        }
        if (jSONObject.has("code")) {
            if (jSONObject.isNull("code")) {
                ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$code((Integer) null);
            } else {
                ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$code(Integer.valueOf(jSONObject.getInt("code")));
            }
        }
        if (jSONObject.has("latitude")) {
            if (jSONObject.isNull("latitude")) {
                ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$latitude((Double) null);
            } else {
                ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$latitude(Double.valueOf(jSONObject.getDouble("latitude")));
            }
        }
        if (jSONObject.has("longitude")) {
            if (jSONObject.isNull("longitude")) {
                ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$longitude((Double) null);
            } else {
                ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$longitude(Double.valueOf(jSONObject.getDouble("longitude")));
            }
        }
        if (jSONObject.has("url")) {
            if (jSONObject.isNull("url")) {
                ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$url((String) null);
            } else {
                ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$url(jSONObject.getString("url"));
            }
        }
        if (jSONObject.has("regionId")) {
            if (jSONObject.isNull("regionId")) {
                ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$regionId((String) null);
            } else {
                ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$regionId(jSONObject.getString("regionId"));
            }
        }
        if (jSONObject.has("accountPrefix")) {
            if (jSONObject.isNull("accountPrefix")) {
                ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$accountPrefix((String) null);
            } else {
                ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$accountPrefix(jSONObject.getString("accountPrefix"));
            }
        }
        return providerCity;
    }

    public static ProviderCity createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ProviderCity providerCity = new ProviderCity();
        ru_unicorn_ujin_data_realm_ProviderCityRealmProxyInterface ru_unicorn_ujin_data_realm_providercityrealmproxyinterface = providerCity;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("prefix")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$prefix(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$prefix((String) null);
                }
            } else if (nextName.equals("code")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$code(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$code((Integer) null);
                }
            } else if (nextName.equals("latitude")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$latitude(Double.valueOf(jsonReader.nextDouble()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$latitude((Double) null);
                }
            } else if (nextName.equals("longitude")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$longitude(Double.valueOf(jsonReader.nextDouble()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$longitude((Double) null);
                }
            } else if (nextName.equals("url")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$url(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$url((String) null);
                }
            } else if (nextName.equals("regionId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$regionId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$regionId((String) null);
                }
            } else if (!nextName.equals("accountPrefix")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$accountPrefix(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$accountPrefix((String) null);
            }
        }
        jsonReader.endObject();
        return (ProviderCity) realm.copyToRealm(providerCity, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_ProviderCityRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ProviderCity.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_ProviderCityRealmProxy ru_unicorn_ujin_data_realm_providercityrealmproxy = new ru_unicorn_ujin_data_realm_ProviderCityRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_providercityrealmproxy;
    }

    public static ProviderCity copyOrUpdate(Realm realm, ProviderCityColumnInfo providerCityColumnInfo, ProviderCity providerCity, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (providerCity instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) providerCity;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return providerCity;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(providerCity);
        if (realmObjectProxy2 != null) {
            return (ProviderCity) realmObjectProxy2;
        }
        return copy(realm, providerCityColumnInfo, providerCity, z, map, set);
    }

    public static ProviderCity copy(Realm realm, ProviderCityColumnInfo providerCityColumnInfo, ProviderCity providerCity, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(providerCity);
        if (realmObjectProxy != null) {
            return (ProviderCity) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_ProviderCityRealmProxyInterface ru_unicorn_ujin_data_realm_providercityrealmproxyinterface = providerCity;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ProviderCity.class), providerCityColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(providerCityColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(providerCityColumnInfo.prefixIndex, ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$prefix());
        osObjectBuilder.addInteger(providerCityColumnInfo.codeIndex, ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$code());
        osObjectBuilder.addDouble(providerCityColumnInfo.latitudeIndex, ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$latitude());
        osObjectBuilder.addDouble(providerCityColumnInfo.longitudeIndex, ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$longitude());
        osObjectBuilder.addString(providerCityColumnInfo.urlIndex, ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$url());
        osObjectBuilder.addString(providerCityColumnInfo.regionIdIndex, ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$regionId());
        osObjectBuilder.addString(providerCityColumnInfo.accountPrefixIndex, ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$accountPrefix());
        ru_unicorn_ujin_data_realm_ProviderCityRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(providerCity, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, ProviderCity providerCity, Map<RealmModel, Long> map) {
        ProviderCity providerCity2 = providerCity;
        if (providerCity2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) providerCity2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ProviderCity.class);
        long nativePtr = table.getNativePtr();
        ProviderCityColumnInfo providerCityColumnInfo = (ProviderCityColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ProviderCity.class);
        long createRow = OsObject.createRow(table);
        map.put(providerCity2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_ProviderCityRealmProxyInterface ru_unicorn_ujin_data_realm_providercityrealmproxyinterface = providerCity2;
        String realmGet$title = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, providerCityColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        String realmGet$prefix = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$prefix();
        if (realmGet$prefix != null) {
            Table.nativeSetString(nativePtr, providerCityColumnInfo.prefixIndex, createRow, realmGet$prefix, false);
        }
        Integer realmGet$code = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$code();
        if (realmGet$code != null) {
            Table.nativeSetLong(nativePtr, providerCityColumnInfo.codeIndex, createRow, realmGet$code.longValue(), false);
        }
        Double realmGet$latitude = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$latitude();
        if (realmGet$latitude != null) {
            Table.nativeSetDouble(nativePtr, providerCityColumnInfo.latitudeIndex, createRow, realmGet$latitude.doubleValue(), false);
        }
        Double realmGet$longitude = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$longitude();
        if (realmGet$longitude != null) {
            Table.nativeSetDouble(nativePtr, providerCityColumnInfo.longitudeIndex, createRow, realmGet$longitude.doubleValue(), false);
        }
        String realmGet$url = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, providerCityColumnInfo.urlIndex, createRow, realmGet$url, false);
        }
        String realmGet$regionId = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$regionId();
        if (realmGet$regionId != null) {
            Table.nativeSetString(nativePtr, providerCityColumnInfo.regionIdIndex, createRow, realmGet$regionId, false);
        }
        String realmGet$accountPrefix = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$accountPrefix();
        if (realmGet$accountPrefix != null) {
            Table.nativeSetString(nativePtr, providerCityColumnInfo.accountPrefixIndex, createRow, realmGet$accountPrefix, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ProviderCity.class);
        long nativePtr = table.getNativePtr();
        ProviderCityColumnInfo providerCityColumnInfo = (ProviderCityColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ProviderCity.class);
        while (it.hasNext()) {
            ProviderCity providerCity = (ProviderCity) it.next();
            if (!map2.containsKey(providerCity)) {
                if (providerCity instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) providerCity;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(providerCity, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(providerCity, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_ProviderCityRealmProxyInterface ru_unicorn_ujin_data_realm_providercityrealmproxyinterface = providerCity;
                String realmGet$title = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, providerCityColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
                String realmGet$prefix = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$prefix();
                if (realmGet$prefix != null) {
                    Table.nativeSetString(nativePtr, providerCityColumnInfo.prefixIndex, createRow, realmGet$prefix, false);
                }
                Integer realmGet$code = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$code();
                if (realmGet$code != null) {
                    Table.nativeSetLong(nativePtr, providerCityColumnInfo.codeIndex, createRow, realmGet$code.longValue(), false);
                }
                Double realmGet$latitude = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$latitude();
                if (realmGet$latitude != null) {
                    Table.nativeSetDouble(nativePtr, providerCityColumnInfo.latitudeIndex, createRow, realmGet$latitude.doubleValue(), false);
                }
                Double realmGet$longitude = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$longitude();
                if (realmGet$longitude != null) {
                    Table.nativeSetDouble(nativePtr, providerCityColumnInfo.longitudeIndex, createRow, realmGet$longitude.doubleValue(), false);
                }
                String realmGet$url = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, providerCityColumnInfo.urlIndex, createRow, realmGet$url, false);
                }
                String realmGet$regionId = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$regionId();
                if (realmGet$regionId != null) {
                    Table.nativeSetString(nativePtr, providerCityColumnInfo.regionIdIndex, createRow, realmGet$regionId, false);
                }
                String realmGet$accountPrefix = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$accountPrefix();
                if (realmGet$accountPrefix != null) {
                    Table.nativeSetString(nativePtr, providerCityColumnInfo.accountPrefixIndex, createRow, realmGet$accountPrefix, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ProviderCity providerCity, Map<RealmModel, Long> map) {
        ProviderCity providerCity2 = providerCity;
        if (providerCity2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) providerCity2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ProviderCity.class);
        long nativePtr = table.getNativePtr();
        ProviderCityColumnInfo providerCityColumnInfo = (ProviderCityColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ProviderCity.class);
        long createRow = OsObject.createRow(table);
        map.put(providerCity2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_ProviderCityRealmProxyInterface ru_unicorn_ujin_data_realm_providercityrealmproxyinterface = providerCity2;
        String realmGet$title = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, providerCityColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, providerCityColumnInfo.titleIndex, createRow, false);
        }
        String realmGet$prefix = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$prefix();
        if (realmGet$prefix != null) {
            Table.nativeSetString(nativePtr, providerCityColumnInfo.prefixIndex, createRow, realmGet$prefix, false);
        } else {
            Table.nativeSetNull(nativePtr, providerCityColumnInfo.prefixIndex, createRow, false);
        }
        Integer realmGet$code = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$code();
        if (realmGet$code != null) {
            Table.nativeSetLong(nativePtr, providerCityColumnInfo.codeIndex, createRow, realmGet$code.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, providerCityColumnInfo.codeIndex, createRow, false);
        }
        Double realmGet$latitude = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$latitude();
        if (realmGet$latitude != null) {
            Table.nativeSetDouble(nativePtr, providerCityColumnInfo.latitudeIndex, createRow, realmGet$latitude.doubleValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, providerCityColumnInfo.latitudeIndex, createRow, false);
        }
        Double realmGet$longitude = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$longitude();
        if (realmGet$longitude != null) {
            Table.nativeSetDouble(nativePtr, providerCityColumnInfo.longitudeIndex, createRow, realmGet$longitude.doubleValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, providerCityColumnInfo.longitudeIndex, createRow, false);
        }
        String realmGet$url = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, providerCityColumnInfo.urlIndex, createRow, realmGet$url, false);
        } else {
            Table.nativeSetNull(nativePtr, providerCityColumnInfo.urlIndex, createRow, false);
        }
        String realmGet$regionId = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$regionId();
        if (realmGet$regionId != null) {
            Table.nativeSetString(nativePtr, providerCityColumnInfo.regionIdIndex, createRow, realmGet$regionId, false);
        } else {
            Table.nativeSetNull(nativePtr, providerCityColumnInfo.regionIdIndex, createRow, false);
        }
        String realmGet$accountPrefix = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$accountPrefix();
        if (realmGet$accountPrefix != null) {
            Table.nativeSetString(nativePtr, providerCityColumnInfo.accountPrefixIndex, createRow, realmGet$accountPrefix, false);
        } else {
            Table.nativeSetNull(nativePtr, providerCityColumnInfo.accountPrefixIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ProviderCity.class);
        long nativePtr = table.getNativePtr();
        ProviderCityColumnInfo providerCityColumnInfo = (ProviderCityColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ProviderCity.class);
        while (it.hasNext()) {
            ProviderCity providerCity = (ProviderCity) it.next();
            if (!map2.containsKey(providerCity)) {
                if (providerCity instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) providerCity;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(providerCity, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(providerCity, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_ProviderCityRealmProxyInterface ru_unicorn_ujin_data_realm_providercityrealmproxyinterface = providerCity;
                String realmGet$title = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, providerCityColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, providerCityColumnInfo.titleIndex, createRow, false);
                }
                String realmGet$prefix = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$prefix();
                if (realmGet$prefix != null) {
                    Table.nativeSetString(nativePtr, providerCityColumnInfo.prefixIndex, createRow, realmGet$prefix, false);
                } else {
                    Table.nativeSetNull(nativePtr, providerCityColumnInfo.prefixIndex, createRow, false);
                }
                Integer realmGet$code = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$code();
                if (realmGet$code != null) {
                    Table.nativeSetLong(nativePtr, providerCityColumnInfo.codeIndex, createRow, realmGet$code.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, providerCityColumnInfo.codeIndex, createRow, false);
                }
                Double realmGet$latitude = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$latitude();
                if (realmGet$latitude != null) {
                    Table.nativeSetDouble(nativePtr, providerCityColumnInfo.latitudeIndex, createRow, realmGet$latitude.doubleValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, providerCityColumnInfo.latitudeIndex, createRow, false);
                }
                Double realmGet$longitude = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$longitude();
                if (realmGet$longitude != null) {
                    Table.nativeSetDouble(nativePtr, providerCityColumnInfo.longitudeIndex, createRow, realmGet$longitude.doubleValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, providerCityColumnInfo.longitudeIndex, createRow, false);
                }
                String realmGet$url = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, providerCityColumnInfo.urlIndex, createRow, realmGet$url, false);
                } else {
                    Table.nativeSetNull(nativePtr, providerCityColumnInfo.urlIndex, createRow, false);
                }
                String realmGet$regionId = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$regionId();
                if (realmGet$regionId != null) {
                    Table.nativeSetString(nativePtr, providerCityColumnInfo.regionIdIndex, createRow, realmGet$regionId, false);
                } else {
                    Table.nativeSetNull(nativePtr, providerCityColumnInfo.regionIdIndex, createRow, false);
                }
                String realmGet$accountPrefix = ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmGet$accountPrefix();
                if (realmGet$accountPrefix != null) {
                    Table.nativeSetString(nativePtr, providerCityColumnInfo.accountPrefixIndex, createRow, realmGet$accountPrefix, false);
                } else {
                    Table.nativeSetNull(nativePtr, providerCityColumnInfo.accountPrefixIndex, createRow, false);
                }
            }
        }
    }

    public static ProviderCity createDetachedCopy(ProviderCity providerCity, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ProviderCity providerCity2;
        if (i > i2 || providerCity == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(providerCity);
        if (cacheData == null) {
            providerCity2 = new ProviderCity();
            map.put(providerCity, new RealmObjectProxy.CacheData(i, providerCity2));
        } else if (i >= cacheData.minDepth) {
            return (ProviderCity) cacheData.object;
        } else {
            cacheData.minDepth = i;
            providerCity2 = (ProviderCity) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_ProviderCityRealmProxyInterface ru_unicorn_ujin_data_realm_providercityrealmproxyinterface = providerCity2;
        ru_unicorn_ujin_data_realm_ProviderCityRealmProxyInterface ru_unicorn_ujin_data_realm_providercityrealmproxyinterface2 = providerCity;
        ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_providercityrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$prefix(ru_unicorn_ujin_data_realm_providercityrealmproxyinterface2.realmGet$prefix());
        ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$code(ru_unicorn_ujin_data_realm_providercityrealmproxyinterface2.realmGet$code());
        ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$latitude(ru_unicorn_ujin_data_realm_providercityrealmproxyinterface2.realmGet$latitude());
        ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$longitude(ru_unicorn_ujin_data_realm_providercityrealmproxyinterface2.realmGet$longitude());
        ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$url(ru_unicorn_ujin_data_realm_providercityrealmproxyinterface2.realmGet$url());
        ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$regionId(ru_unicorn_ujin_data_realm_providercityrealmproxyinterface2.realmGet$regionId());
        ru_unicorn_ujin_data_realm_providercityrealmproxyinterface.realmSet$accountPrefix(ru_unicorn_ujin_data_realm_providercityrealmproxyinterface2.realmGet$accountPrefix());
        return providerCity2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ProviderCity = proxy[");
        sb.append("{title:");
        String str = "null";
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{prefix:");
        sb.append(realmGet$prefix() != null ? realmGet$prefix() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{code:");
        sb.append(realmGet$code() != null ? realmGet$code() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{latitude:");
        sb.append(realmGet$latitude() != null ? realmGet$latitude() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{longitude:");
        sb.append(realmGet$longitude() != null ? realmGet$longitude() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{url:");
        sb.append(realmGet$url() != null ? realmGet$url() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{regionId:");
        sb.append(realmGet$regionId() != null ? realmGet$regionId() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{accountPrefix:");
        if (realmGet$accountPrefix() != null) {
            str = realmGet$accountPrefix();
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
        ru_unicorn_ujin_data_realm_ProviderCityRealmProxy ru_unicorn_ujin_data_realm_providercityrealmproxy = (ru_unicorn_ujin_data_realm_ProviderCityRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_providercityrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_providercityrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_providercityrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
