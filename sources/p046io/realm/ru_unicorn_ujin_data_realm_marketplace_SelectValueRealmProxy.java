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
import p035ru.unicorn.ujin.data.realm.marketplace.SelectValue;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy extends SelectValue implements RealmObjectProxy, C4625x2d275a7c {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private SelectValueColumnInfo columnInfo;
    private ProxyState<SelectValue> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "SelectValue";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy$SelectValueColumnInfo */
    static final class SelectValueColumnInfo extends ColumnInfo {
        long idIndex;
        long maxColumnIndexValue;
        long valueIndex;

        SelectValueColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.valueIndex = addColumnDetails("value", "value", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        SelectValueColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new SelectValueColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            SelectValueColumnInfo selectValueColumnInfo = (SelectValueColumnInfo) columnInfo;
            SelectValueColumnInfo selectValueColumnInfo2 = (SelectValueColumnInfo) columnInfo2;
            selectValueColumnInfo2.idIndex = selectValueColumnInfo.idIndex;
            selectValueColumnInfo2.valueIndex = selectValueColumnInfo.valueIndex;
            selectValueColumnInfo2.maxColumnIndexValue = selectValueColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (SelectValueColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Integer realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.idIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex));
    }

    public void realmSet$id(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.idIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.idIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.idIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.idIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("value", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SelectValueColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new SelectValueColumnInfo(osSchemaInfo);
    }

    public static SelectValue createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        SelectValue selectValue = (SelectValue) realm.createObjectInternal(SelectValue.class, true, Collections.emptyList());
        C4625x2d275a7c ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface = selectValue;
        if (jSONObject.has("id")) {
            if (jSONObject.isNull("id")) {
                ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface.realmSet$id((Integer) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface.realmSet$id(Integer.valueOf(jSONObject.getInt("id")));
            }
        }
        if (jSONObject.has("value")) {
            if (jSONObject.isNull("value")) {
                ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface.realmSet$value((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface.realmSet$value(jSONObject.getString("value"));
            }
        }
        return selectValue;
    }

    public static SelectValue createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        SelectValue selectValue = new SelectValue();
        C4625x2d275a7c ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface = selectValue;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface.realmSet$id(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface.realmSet$id((Integer) null);
                }
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface.realmSet$value(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface.realmSet$value((String) null);
            }
        }
        jsonReader.endObject();
        return (SelectValue) realm.copyToRealm(selectValue, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) SelectValue.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxy = new ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxy;
    }

    public static SelectValue copyOrUpdate(Realm realm, SelectValueColumnInfo selectValueColumnInfo, SelectValue selectValue, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (selectValue instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) selectValue;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return selectValue;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(selectValue);
        if (realmObjectProxy2 != null) {
            return (SelectValue) realmObjectProxy2;
        }
        return copy(realm, selectValueColumnInfo, selectValue, z, map, set);
    }

    public static SelectValue copy(Realm realm, SelectValueColumnInfo selectValueColumnInfo, SelectValue selectValue, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(selectValue);
        if (realmObjectProxy != null) {
            return (SelectValue) realmObjectProxy;
        }
        C4625x2d275a7c ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface = selectValue;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(SelectValue.class), selectValueColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(selectValueColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(selectValueColumnInfo.valueIndex, ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface.realmGet$value());
        ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(selectValue, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, SelectValue selectValue, Map<RealmModel, Long> map) {
        SelectValue selectValue2 = selectValue;
        if (selectValue2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) selectValue2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(SelectValue.class);
        long nativePtr = table.getNativePtr();
        SelectValueColumnInfo selectValueColumnInfo = (SelectValueColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SelectValue.class);
        long createRow = OsObject.createRow(table);
        map.put(selectValue2, Long.valueOf(createRow));
        C4625x2d275a7c ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface = selectValue2;
        Integer realmGet$id = ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetLong(nativePtr, selectValueColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
        }
        String realmGet$value = ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, selectValueColumnInfo.valueIndex, createRow, realmGet$value, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(SelectValue.class);
        long nativePtr = table.getNativePtr();
        SelectValueColumnInfo selectValueColumnInfo = (SelectValueColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SelectValue.class);
        while (it.hasNext()) {
            SelectValue selectValue = (SelectValue) it.next();
            if (!map2.containsKey(selectValue)) {
                if (selectValue instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) selectValue;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(selectValue, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(selectValue, Long.valueOf(createRow));
                C4625x2d275a7c ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface = selectValue;
                Integer realmGet$id = ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetLong(nativePtr, selectValueColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
                }
                String realmGet$value = ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, selectValueColumnInfo.valueIndex, createRow, realmGet$value, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, SelectValue selectValue, Map<RealmModel, Long> map) {
        SelectValue selectValue2 = selectValue;
        if (selectValue2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) selectValue2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(SelectValue.class);
        long nativePtr = table.getNativePtr();
        SelectValueColumnInfo selectValueColumnInfo = (SelectValueColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SelectValue.class);
        long createRow = OsObject.createRow(table);
        map.put(selectValue2, Long.valueOf(createRow));
        C4625x2d275a7c ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface = selectValue2;
        Integer realmGet$id = ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetLong(nativePtr, selectValueColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, selectValueColumnInfo.idIndex, createRow, false);
        }
        String realmGet$value = ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, selectValueColumnInfo.valueIndex, createRow, realmGet$value, false);
        } else {
            Table.nativeSetNull(nativePtr, selectValueColumnInfo.valueIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(SelectValue.class);
        long nativePtr = table.getNativePtr();
        SelectValueColumnInfo selectValueColumnInfo = (SelectValueColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SelectValue.class);
        while (it.hasNext()) {
            SelectValue selectValue = (SelectValue) it.next();
            if (!map2.containsKey(selectValue)) {
                if (selectValue instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) selectValue;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(selectValue, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(selectValue, Long.valueOf(createRow));
                C4625x2d275a7c ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface = selectValue;
                Integer realmGet$id = ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetLong(nativePtr, selectValueColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, selectValueColumnInfo.idIndex, createRow, false);
                }
                String realmGet$value = ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, selectValueColumnInfo.valueIndex, createRow, realmGet$value, false);
                } else {
                    Table.nativeSetNull(nativePtr, selectValueColumnInfo.valueIndex, createRow, false);
                }
            }
        }
    }

    public static SelectValue createDetachedCopy(SelectValue selectValue, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        SelectValue selectValue2;
        if (i > i2 || selectValue == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(selectValue);
        if (cacheData == null) {
            selectValue2 = new SelectValue();
            map.put(selectValue, new RealmObjectProxy.CacheData(i, selectValue2));
        } else if (i >= cacheData.minDepth) {
            return (SelectValue) cacheData.object;
        } else {
            cacheData.minDepth = i;
            selectValue2 = (SelectValue) cacheData.object;
        }
        C4625x2d275a7c ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface = selectValue2;
        C4625x2d275a7c ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface2 = selectValue;
        ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface.realmSet$value(ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxyinterface2.realmGet$value());
        return selectValue2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("SelectValue = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{value:");
        if (realmGet$value() != null) {
            str = realmGet$value();
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
        ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxy = (ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_selectvaluerealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
