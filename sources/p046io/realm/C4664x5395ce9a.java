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
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaCallback;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaCallbackRealmProxy */
public class C4664x5395ce9a extends SchemaCallback implements RealmObjectProxy, C4665x86a78bbf {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private SchemaCallbackColumnInfo columnInfo;
    private ProxyState<SchemaCallback> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaCallbackRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "SchemaCallback";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaCallbackRealmProxy$SchemaCallbackColumnInfo */
    static final class SchemaCallbackColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long urlIndex;

        SchemaCallbackColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.urlIndex = addColumnDetails("url", "url", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        SchemaCallbackColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new SchemaCallbackColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            SchemaCallbackColumnInfo schemaCallbackColumnInfo = (SchemaCallbackColumnInfo) columnInfo;
            SchemaCallbackColumnInfo schemaCallbackColumnInfo2 = (SchemaCallbackColumnInfo) columnInfo2;
            schemaCallbackColumnInfo2.urlIndex = schemaCallbackColumnInfo.urlIndex;
            schemaCallbackColumnInfo2.maxColumnIndexValue = schemaCallbackColumnInfo.maxColumnIndexValue;
        }
    }

    C4664x5395ce9a() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (SchemaCallbackColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedProperty("url", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SchemaCallbackColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new SchemaCallbackColumnInfo(osSchemaInfo);
    }

    public static SchemaCallback createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        SchemaCallback schemaCallback = (SchemaCallback) realm.createObjectInternal(SchemaCallback.class, true, Collections.emptyList());
        C4665x86a78bbf ru_unicorn_ujin_view_activity_navigation_entity_schema_schemacallbackrealmproxyinterface = schemaCallback;
        if (jSONObject.has("url")) {
            if (jSONObject.isNull("url")) {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_schemacallbackrealmproxyinterface.realmSet$url((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_schemacallbackrealmproxyinterface.realmSet$url(jSONObject.getString("url"));
            }
        }
        return schemaCallback;
    }

    public static SchemaCallback createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        SchemaCallback schemaCallback = new SchemaCallback();
        C4665x86a78bbf ru_unicorn_ujin_view_activity_navigation_entity_schema_schemacallbackrealmproxyinterface = schemaCallback;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("url")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_schemacallbackrealmproxyinterface.realmSet$url(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_entity_schema_schemacallbackrealmproxyinterface.realmSet$url((String) null);
            }
        }
        jsonReader.endObject();
        return (SchemaCallback) realm.copyToRealm(schemaCallback, new ImportFlag[0]);
    }

    private static C4664x5395ce9a newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaCallback.class), false, Collections.emptyList());
        C4664x5395ce9a ru_unicorn_ujin_view_activity_navigation_entity_schema_schemacallbackrealmproxy = new C4664x5395ce9a();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_entity_schema_schemacallbackrealmproxy;
    }

    public static SchemaCallback copyOrUpdate(Realm realm, SchemaCallbackColumnInfo schemaCallbackColumnInfo, SchemaCallback schemaCallback, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (schemaCallback instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) schemaCallback;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return schemaCallback;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(schemaCallback);
        if (realmObjectProxy2 != null) {
            return (SchemaCallback) realmObjectProxy2;
        }
        return copy(realm, schemaCallbackColumnInfo, schemaCallback, z, map, set);
    }

    public static SchemaCallback copy(Realm realm, SchemaCallbackColumnInfo schemaCallbackColumnInfo, SchemaCallback schemaCallback, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(schemaCallback);
        if (realmObjectProxy != null) {
            return (SchemaCallback) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(SchemaCallback.class), schemaCallbackColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(schemaCallbackColumnInfo.urlIndex, schemaCallback.realmGet$url());
        C4664x5395ce9a newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(schemaCallback, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, SchemaCallback schemaCallback, Map<RealmModel, Long> map) {
        if (schemaCallback instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) schemaCallback;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(SchemaCallback.class);
        long nativePtr = table.getNativePtr();
        SchemaCallbackColumnInfo schemaCallbackColumnInfo = (SchemaCallbackColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaCallback.class);
        long createRow = OsObject.createRow(table);
        map.put(schemaCallback, Long.valueOf(createRow));
        String realmGet$url = schemaCallback.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, schemaCallbackColumnInfo.urlIndex, createRow, realmGet$url, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(SchemaCallback.class);
        long nativePtr = table.getNativePtr();
        SchemaCallbackColumnInfo schemaCallbackColumnInfo = (SchemaCallbackColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaCallback.class);
        while (it.hasNext()) {
            SchemaCallback schemaCallback = (SchemaCallback) it.next();
            if (!map.containsKey(schemaCallback)) {
                if (schemaCallback instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) schemaCallback;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(schemaCallback, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(schemaCallback, Long.valueOf(createRow));
                String realmGet$url = schemaCallback.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, schemaCallbackColumnInfo.urlIndex, createRow, realmGet$url, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, SchemaCallback schemaCallback, Map<RealmModel, Long> map) {
        if (schemaCallback instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) schemaCallback;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(SchemaCallback.class);
        long nativePtr = table.getNativePtr();
        SchemaCallbackColumnInfo schemaCallbackColumnInfo = (SchemaCallbackColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaCallback.class);
        long createRow = OsObject.createRow(table);
        map.put(schemaCallback, Long.valueOf(createRow));
        String realmGet$url = schemaCallback.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, schemaCallbackColumnInfo.urlIndex, createRow, realmGet$url, false);
        } else {
            Table.nativeSetNull(nativePtr, schemaCallbackColumnInfo.urlIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(SchemaCallback.class);
        long nativePtr = table.getNativePtr();
        SchemaCallbackColumnInfo schemaCallbackColumnInfo = (SchemaCallbackColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaCallback.class);
        while (it.hasNext()) {
            SchemaCallback schemaCallback = (SchemaCallback) it.next();
            if (!map.containsKey(schemaCallback)) {
                if (schemaCallback instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) schemaCallback;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(schemaCallback, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(schemaCallback, Long.valueOf(createRow));
                String realmGet$url = schemaCallback.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, schemaCallbackColumnInfo.urlIndex, createRow, realmGet$url, false);
                } else {
                    Table.nativeSetNull(nativePtr, schemaCallbackColumnInfo.urlIndex, createRow, false);
                }
            }
        }
    }

    public static SchemaCallback createDetachedCopy(SchemaCallback schemaCallback, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        SchemaCallback schemaCallback2;
        if (i > i2 || schemaCallback == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(schemaCallback);
        if (cacheData == null) {
            schemaCallback2 = new SchemaCallback();
            map.put(schemaCallback, new RealmObjectProxy.CacheData(i, schemaCallback2));
        } else if (i >= cacheData.minDepth) {
            return (SchemaCallback) cacheData.object;
        } else {
            cacheData.minDepth = i;
            schemaCallback2 = (SchemaCallback) cacheData.object;
        }
        schemaCallback2.realmSet$url(schemaCallback.realmGet$url());
        return schemaCallback2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("SchemaCallback = proxy[");
        sb.append("{url:");
        sb.append(realmGet$url() != null ? realmGet$url() : "null");
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
        C4664x5395ce9a ru_unicorn_ujin_view_activity_navigation_entity_schema_schemacallbackrealmproxy = (C4664x5395ce9a) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemacallbackrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemacallbackrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_entity_schema_schemacallbackrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
