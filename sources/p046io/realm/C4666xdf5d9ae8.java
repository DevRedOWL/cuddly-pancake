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
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaItem;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaItemRealmProxy */
public class C4666xdf5d9ae8 extends SchemaItem implements RealmObjectProxy, C4667x3f45b731 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private SchemaItemColumnInfo columnInfo;
    private ProxyState<SchemaItem> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaItemRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "SchemaItem";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaItemRealmProxy$SchemaItemColumnInfo */
    static final class SchemaItemColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long messageIndex;
        long modeIndex;

        SchemaItemColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.modeIndex = addColumnDetails("mode", "mode", objectSchemaInfo);
            this.messageIndex = addColumnDetails("message", "message", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        SchemaItemColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new SchemaItemColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            SchemaItemColumnInfo schemaItemColumnInfo = (SchemaItemColumnInfo) columnInfo;
            SchemaItemColumnInfo schemaItemColumnInfo2 = (SchemaItemColumnInfo) columnInfo2;
            schemaItemColumnInfo2.modeIndex = schemaItemColumnInfo.modeIndex;
            schemaItemColumnInfo2.messageIndex = schemaItemColumnInfo.messageIndex;
            schemaItemColumnInfo2.maxColumnIndexValue = schemaItemColumnInfo.maxColumnIndexValue;
        }
    }

    C4666xdf5d9ae8() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (SchemaItemColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$mode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.modeIndex);
    }

    public void realmSet$mode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.modeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.modeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.modeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.modeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$message() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.messageIndex);
    }

    public void realmSet$message(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.messageIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.messageIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.messageIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.messageIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("mode", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("message", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SchemaItemColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new SchemaItemColumnInfo(osSchemaInfo);
    }

    public static SchemaItem createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        SchemaItem schemaItem = (SchemaItem) realm.createObjectInternal(SchemaItem.class, true, Collections.emptyList());
        C4667x3f45b731 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface = schemaItem;
        if (jSONObject.has("mode")) {
            if (jSONObject.isNull("mode")) {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface.realmSet$mode((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface.realmSet$mode(jSONObject.getString("mode"));
            }
        }
        if (jSONObject.has("message")) {
            if (jSONObject.isNull("message")) {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface.realmSet$message((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface.realmSet$message(jSONObject.getString("message"));
            }
        }
        return schemaItem;
    }

    public static SchemaItem createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        SchemaItem schemaItem = new SchemaItem();
        C4667x3f45b731 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface = schemaItem;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("mode")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface.realmSet$mode(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface.realmSet$mode((String) null);
                }
            } else if (!nextName.equals("message")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface.realmSet$message(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface.realmSet$message((String) null);
            }
        }
        jsonReader.endObject();
        return (SchemaItem) realm.copyToRealm(schemaItem, new ImportFlag[0]);
    }

    private static C4666xdf5d9ae8 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaItem.class), false, Collections.emptyList());
        C4666xdf5d9ae8 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxy = new C4666xdf5d9ae8();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxy;
    }

    public static SchemaItem copyOrUpdate(Realm realm, SchemaItemColumnInfo schemaItemColumnInfo, SchemaItem schemaItem, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (schemaItem instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) schemaItem;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return schemaItem;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(schemaItem);
        if (realmObjectProxy2 != null) {
            return (SchemaItem) realmObjectProxy2;
        }
        return copy(realm, schemaItemColumnInfo, schemaItem, z, map, set);
    }

    public static SchemaItem copy(Realm realm, SchemaItemColumnInfo schemaItemColumnInfo, SchemaItem schemaItem, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(schemaItem);
        if (realmObjectProxy != null) {
            return (SchemaItem) realmObjectProxy;
        }
        C4667x3f45b731 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface = schemaItem;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(SchemaItem.class), schemaItemColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(schemaItemColumnInfo.modeIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface.realmGet$mode());
        osObjectBuilder.addString(schemaItemColumnInfo.messageIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface.realmGet$message());
        C4666xdf5d9ae8 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(schemaItem, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, SchemaItem schemaItem, Map<RealmModel, Long> map) {
        if (schemaItem instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) schemaItem;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(SchemaItem.class);
        long nativePtr = table.getNativePtr();
        SchemaItemColumnInfo schemaItemColumnInfo = (SchemaItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaItem.class);
        long createRow = OsObject.createRow(table);
        map.put(schemaItem, Long.valueOf(createRow));
        C4667x3f45b731 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface = schemaItem;
        String realmGet$mode = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface.realmGet$mode();
        if (realmGet$mode != null) {
            Table.nativeSetString(nativePtr, schemaItemColumnInfo.modeIndex, createRow, realmGet$mode, false);
        }
        String realmGet$message = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface.realmGet$message();
        if (realmGet$message != null) {
            Table.nativeSetString(nativePtr, schemaItemColumnInfo.messageIndex, createRow, realmGet$message, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(SchemaItem.class);
        long nativePtr = table.getNativePtr();
        SchemaItemColumnInfo schemaItemColumnInfo = (SchemaItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaItem.class);
        while (it.hasNext()) {
            SchemaItem schemaItem = (SchemaItem) it.next();
            if (!map2.containsKey(schemaItem)) {
                if (schemaItem instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) schemaItem;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(schemaItem, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(schemaItem, Long.valueOf(createRow));
                C4667x3f45b731 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface = schemaItem;
                String realmGet$mode = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface.realmGet$mode();
                if (realmGet$mode != null) {
                    Table.nativeSetString(nativePtr, schemaItemColumnInfo.modeIndex, createRow, realmGet$mode, false);
                }
                String realmGet$message = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface.realmGet$message();
                if (realmGet$message != null) {
                    Table.nativeSetString(nativePtr, schemaItemColumnInfo.messageIndex, createRow, realmGet$message, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, SchemaItem schemaItem, Map<RealmModel, Long> map) {
        if (schemaItem instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) schemaItem;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(SchemaItem.class);
        long nativePtr = table.getNativePtr();
        SchemaItemColumnInfo schemaItemColumnInfo = (SchemaItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaItem.class);
        long createRow = OsObject.createRow(table);
        map.put(schemaItem, Long.valueOf(createRow));
        C4667x3f45b731 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface = schemaItem;
        String realmGet$mode = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface.realmGet$mode();
        if (realmGet$mode != null) {
            Table.nativeSetString(nativePtr, schemaItemColumnInfo.modeIndex, createRow, realmGet$mode, false);
        } else {
            Table.nativeSetNull(nativePtr, schemaItemColumnInfo.modeIndex, createRow, false);
        }
        String realmGet$message = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface.realmGet$message();
        if (realmGet$message != null) {
            Table.nativeSetString(nativePtr, schemaItemColumnInfo.messageIndex, createRow, realmGet$message, false);
        } else {
            Table.nativeSetNull(nativePtr, schemaItemColumnInfo.messageIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(SchemaItem.class);
        long nativePtr = table.getNativePtr();
        SchemaItemColumnInfo schemaItemColumnInfo = (SchemaItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaItem.class);
        while (it.hasNext()) {
            SchemaItem schemaItem = (SchemaItem) it.next();
            if (!map2.containsKey(schemaItem)) {
                if (schemaItem instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) schemaItem;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(schemaItem, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(schemaItem, Long.valueOf(createRow));
                C4667x3f45b731 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface = schemaItem;
                String realmGet$mode = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface.realmGet$mode();
                if (realmGet$mode != null) {
                    Table.nativeSetString(nativePtr, schemaItemColumnInfo.modeIndex, createRow, realmGet$mode, false);
                } else {
                    Table.nativeSetNull(nativePtr, schemaItemColumnInfo.modeIndex, createRow, false);
                }
                String realmGet$message = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface.realmGet$message();
                if (realmGet$message != null) {
                    Table.nativeSetString(nativePtr, schemaItemColumnInfo.messageIndex, createRow, realmGet$message, false);
                } else {
                    Table.nativeSetNull(nativePtr, schemaItemColumnInfo.messageIndex, createRow, false);
                }
            }
        }
    }

    public static SchemaItem createDetachedCopy(SchemaItem schemaItem, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        SchemaItem schemaItem2;
        if (i > i2 || schemaItem == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(schemaItem);
        if (cacheData == null) {
            schemaItem2 = new SchemaItem();
            map.put(schemaItem, new RealmObjectProxy.CacheData(i, schemaItem2));
        } else if (i >= cacheData.minDepth) {
            return (SchemaItem) cacheData.object;
        } else {
            cacheData.minDepth = i;
            schemaItem2 = (SchemaItem) cacheData.object;
        }
        C4667x3f45b731 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface = schemaItem2;
        C4667x3f45b731 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface2 = schemaItem;
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface.realmSet$mode(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface2.realmGet$mode());
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface.realmSet$message(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxyinterface2.realmGet$message());
        return schemaItem2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("SchemaItem = proxy[");
        sb.append("{mode:");
        String str = "null";
        sb.append(realmGet$mode() != null ? realmGet$mode() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{message:");
        if (realmGet$message() != null) {
            str = realmGet$message();
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
        C4666xdf5d9ae8 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxy = (C4666xdf5d9ae8) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_entity_schema_schemaitemrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
