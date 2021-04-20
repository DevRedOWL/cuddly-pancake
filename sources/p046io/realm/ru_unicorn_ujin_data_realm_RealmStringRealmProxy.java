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
import p035ru.unicorn.ujin.data.realm.RealmString;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_RealmStringRealmProxy */
public class ru_unicorn_ujin_data_realm_RealmStringRealmProxy extends RealmString implements RealmObjectProxy, ru_unicorn_ujin_data_realm_RealmStringRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmStringColumnInfo columnInfo;
    private ProxyState<RealmString> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_RealmStringRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmString";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_RealmStringRealmProxy$RealmStringColumnInfo */
    static final class RealmStringColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long valueIndex;

        RealmStringColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.valueIndex = addColumnDetails("value", "value", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RealmStringColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RealmStringColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RealmStringColumnInfo realmStringColumnInfo = (RealmStringColumnInfo) columnInfo;
            RealmStringColumnInfo realmStringColumnInfo2 = (RealmStringColumnInfo) columnInfo2;
            realmStringColumnInfo2.valueIndex = realmStringColumnInfo.valueIndex;
            realmStringColumnInfo2.maxColumnIndexValue = realmStringColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_RealmStringRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RealmStringColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$value() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.valueIndex);
    }

    public void realmSet$value(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.valueIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.valueIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.valueIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.valueIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedProperty("value", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmStringColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RealmStringColumnInfo(osSchemaInfo);
    }

    public static RealmString createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        RealmString realmString = (RealmString) realm.createObjectInternal(RealmString.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_RealmStringRealmProxyInterface ru_unicorn_ujin_data_realm_realmstringrealmproxyinterface = realmString;
        if (jSONObject.has("value")) {
            if (jSONObject.isNull("value")) {
                ru_unicorn_ujin_data_realm_realmstringrealmproxyinterface.realmSet$value((String) null);
            } else {
                ru_unicorn_ujin_data_realm_realmstringrealmproxyinterface.realmSet$value(jSONObject.getString("value"));
            }
        }
        return realmString;
    }

    public static RealmString createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        RealmString realmString = new RealmString();
        ru_unicorn_ujin_data_realm_RealmStringRealmProxyInterface ru_unicorn_ujin_data_realm_realmstringrealmproxyinterface = realmString;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("value")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_realmstringrealmproxyinterface.realmSet$value(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_realmstringrealmproxyinterface.realmSet$value((String) null);
            }
        }
        jsonReader.endObject();
        return (RealmString) realm.copyToRealm(realmString, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_RealmStringRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) RealmString.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_RealmStringRealmProxy ru_unicorn_ujin_data_realm_realmstringrealmproxy = new ru_unicorn_ujin_data_realm_RealmStringRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_realmstringrealmproxy;
    }

    public static RealmString copyOrUpdate(Realm realm, RealmStringColumnInfo realmStringColumnInfo, RealmString realmString, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (realmString instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) realmString;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return realmString;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(realmString);
        if (realmObjectProxy2 != null) {
            return (RealmString) realmObjectProxy2;
        }
        return copy(realm, realmStringColumnInfo, realmString, z, map, set);
    }

    public static RealmString copy(Realm realm, RealmStringColumnInfo realmStringColumnInfo, RealmString realmString, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(realmString);
        if (realmObjectProxy != null) {
            return (RealmString) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RealmString.class), realmStringColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(realmStringColumnInfo.valueIndex, realmString.realmGet$value());
        ru_unicorn_ujin_data_realm_RealmStringRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(realmString, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, RealmString realmString, Map<RealmModel, Long> map) {
        if (realmString instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) realmString;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(RealmString.class);
        long nativePtr = table.getNativePtr();
        RealmStringColumnInfo realmStringColumnInfo = (RealmStringColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RealmString.class);
        long createRow = OsObject.createRow(table);
        map.put(realmString, Long.valueOf(createRow));
        String realmGet$value = realmString.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, realmStringColumnInfo.valueIndex, createRow, realmGet$value, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(RealmString.class);
        long nativePtr = table.getNativePtr();
        RealmStringColumnInfo realmStringColumnInfo = (RealmStringColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RealmString.class);
        while (it.hasNext()) {
            RealmString realmString = (RealmString) it.next();
            if (!map.containsKey(realmString)) {
                if (realmString instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) realmString;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(realmString, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(realmString, Long.valueOf(createRow));
                String realmGet$value = realmString.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, realmStringColumnInfo.valueIndex, createRow, realmGet$value, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, RealmString realmString, Map<RealmModel, Long> map) {
        if (realmString instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) realmString;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(RealmString.class);
        long nativePtr = table.getNativePtr();
        RealmStringColumnInfo realmStringColumnInfo = (RealmStringColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RealmString.class);
        long createRow = OsObject.createRow(table);
        map.put(realmString, Long.valueOf(createRow));
        String realmGet$value = realmString.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, realmStringColumnInfo.valueIndex, createRow, realmGet$value, false);
        } else {
            Table.nativeSetNull(nativePtr, realmStringColumnInfo.valueIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(RealmString.class);
        long nativePtr = table.getNativePtr();
        RealmStringColumnInfo realmStringColumnInfo = (RealmStringColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RealmString.class);
        while (it.hasNext()) {
            RealmString realmString = (RealmString) it.next();
            if (!map.containsKey(realmString)) {
                if (realmString instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) realmString;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(realmString, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(realmString, Long.valueOf(createRow));
                String realmGet$value = realmString.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, realmStringColumnInfo.valueIndex, createRow, realmGet$value, false);
                } else {
                    Table.nativeSetNull(nativePtr, realmStringColumnInfo.valueIndex, createRow, false);
                }
            }
        }
    }

    public static RealmString createDetachedCopy(RealmString realmString, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        RealmString realmString2;
        if (i > i2 || realmString == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(realmString);
        if (cacheData == null) {
            realmString2 = new RealmString();
            map.put(realmString, new RealmObjectProxy.CacheData(i, realmString2));
        } else if (i >= cacheData.minDepth) {
            return (RealmString) cacheData.object;
        } else {
            cacheData.minDepth = i;
            realmString2 = (RealmString) cacheData.object;
        }
        realmString2.realmSet$value(realmString.realmGet$value());
        return realmString2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("RealmString = proxy[");
        sb.append("{value:");
        sb.append(realmGet$value() != null ? realmGet$value() : "null");
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
        ru_unicorn_ujin_data_realm_RealmStringRealmProxy ru_unicorn_ujin_data_realm_realmstringrealmproxy = (ru_unicorn_ujin_data_realm_RealmStringRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_realmstringrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_realmstringrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_realmstringrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
