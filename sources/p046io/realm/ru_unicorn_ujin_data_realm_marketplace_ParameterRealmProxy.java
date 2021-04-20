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
import p035ru.unicorn.ujin.data.realm.marketplace.Parameter;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy extends Parameter implements RealmObjectProxy, C4616x3c8a39e8 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ParameterColumnInfo columnInfo;
    private ProxyState<Parameter> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Parameter";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy$ParameterColumnInfo */
    static final class ParameterColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long nameIndex;
        long unitIndex;
        long valueIndex;

        ParameterColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.unitIndex = addColumnDetails("unit", "unit", objectSchemaInfo);
            this.valueIndex = addColumnDetails("value", "value", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ParameterColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ParameterColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ParameterColumnInfo parameterColumnInfo = (ParameterColumnInfo) columnInfo;
            ParameterColumnInfo parameterColumnInfo2 = (ParameterColumnInfo) columnInfo2;
            parameterColumnInfo2.nameIndex = parameterColumnInfo.nameIndex;
            parameterColumnInfo2.unitIndex = parameterColumnInfo.unitIndex;
            parameterColumnInfo2.valueIndex = parameterColumnInfo.valueIndex;
            parameterColumnInfo2.maxColumnIndexValue = parameterColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ParameterColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$name() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nameIndex);
    }

    public void realmSet$name(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.nameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.nameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.nameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.nameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$unit() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.unitIndex);
    }

    public void realmSet$unit(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.unitIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.unitIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.unitIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.unitIndex, row$realm.getIndex(), str, true);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("unit", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("value", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ParameterColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ParameterColumnInfo(osSchemaInfo);
    }

    public static Parameter createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        Parameter parameter = (Parameter) realm.createObjectInternal(Parameter.class, true, Collections.emptyList());
        C4616x3c8a39e8 ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface = parameter;
        if (jSONObject.has("name")) {
            if (jSONObject.isNull("name")) {
                ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmSet$name((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmSet$name(jSONObject.getString("name"));
            }
        }
        if (jSONObject.has("unit")) {
            if (jSONObject.isNull("unit")) {
                ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmSet$unit((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmSet$unit(jSONObject.getString("unit"));
            }
        }
        if (jSONObject.has("value")) {
            if (jSONObject.isNull("value")) {
                ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmSet$value((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmSet$value(jSONObject.getString("value"));
            }
        }
        return parameter;
    }

    public static Parameter createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Parameter parameter = new Parameter();
        C4616x3c8a39e8 ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface = parameter;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals("unit")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmSet$unit(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmSet$unit((String) null);
                }
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmSet$value(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmSet$value((String) null);
            }
        }
        jsonReader.endObject();
        return (Parameter) realm.copyToRealm(parameter, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Parameter.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxy;
    }

    public static Parameter copyOrUpdate(Realm realm, ParameterColumnInfo parameterColumnInfo, Parameter parameter, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (parameter instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) parameter;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return parameter;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(parameter);
        if (realmObjectProxy2 != null) {
            return (Parameter) realmObjectProxy2;
        }
        return copy(realm, parameterColumnInfo, parameter, z, map, set);
    }

    public static Parameter copy(Realm realm, ParameterColumnInfo parameterColumnInfo, Parameter parameter, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(parameter);
        if (realmObjectProxy != null) {
            return (Parameter) realmObjectProxy;
        }
        C4616x3c8a39e8 ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface = parameter;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Parameter.class), parameterColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(parameterColumnInfo.nameIndex, ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(parameterColumnInfo.unitIndex, ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmGet$unit());
        osObjectBuilder.addString(parameterColumnInfo.valueIndex, ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmGet$value());
        ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(parameter, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Parameter parameter, Map<RealmModel, Long> map) {
        if (parameter instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) parameter;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Parameter.class);
        long nativePtr = table.getNativePtr();
        ParameterColumnInfo parameterColumnInfo = (ParameterColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Parameter.class);
        long createRow = OsObject.createRow(table);
        map.put(parameter, Long.valueOf(createRow));
        C4616x3c8a39e8 ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface = parameter;
        String realmGet$name = ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, parameterColumnInfo.nameIndex, createRow, realmGet$name, false);
        }
        String realmGet$unit = ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmGet$unit();
        if (realmGet$unit != null) {
            Table.nativeSetString(nativePtr, parameterColumnInfo.unitIndex, createRow, realmGet$unit, false);
        }
        String realmGet$value = ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, parameterColumnInfo.valueIndex, createRow, realmGet$value, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Parameter.class);
        long nativePtr = table.getNativePtr();
        ParameterColumnInfo parameterColumnInfo = (ParameterColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Parameter.class);
        while (it.hasNext()) {
            Parameter parameter = (Parameter) it.next();
            if (!map2.containsKey(parameter)) {
                if (parameter instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) parameter;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(parameter, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(parameter, Long.valueOf(createRow));
                C4616x3c8a39e8 ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface = parameter;
                String realmGet$name = ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, parameterColumnInfo.nameIndex, createRow, realmGet$name, false);
                }
                String realmGet$unit = ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmGet$unit();
                if (realmGet$unit != null) {
                    Table.nativeSetString(nativePtr, parameterColumnInfo.unitIndex, createRow, realmGet$unit, false);
                }
                String realmGet$value = ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, parameterColumnInfo.valueIndex, createRow, realmGet$value, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Parameter parameter, Map<RealmModel, Long> map) {
        if (parameter instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) parameter;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Parameter.class);
        long nativePtr = table.getNativePtr();
        ParameterColumnInfo parameterColumnInfo = (ParameterColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Parameter.class);
        long createRow = OsObject.createRow(table);
        map.put(parameter, Long.valueOf(createRow));
        C4616x3c8a39e8 ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface = parameter;
        String realmGet$name = ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, parameterColumnInfo.nameIndex, createRow, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, parameterColumnInfo.nameIndex, createRow, false);
        }
        String realmGet$unit = ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmGet$unit();
        if (realmGet$unit != null) {
            Table.nativeSetString(nativePtr, parameterColumnInfo.unitIndex, createRow, realmGet$unit, false);
        } else {
            Table.nativeSetNull(nativePtr, parameterColumnInfo.unitIndex, createRow, false);
        }
        String realmGet$value = ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, parameterColumnInfo.valueIndex, createRow, realmGet$value, false);
        } else {
            Table.nativeSetNull(nativePtr, parameterColumnInfo.valueIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Parameter.class);
        long nativePtr = table.getNativePtr();
        ParameterColumnInfo parameterColumnInfo = (ParameterColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Parameter.class);
        while (it.hasNext()) {
            Parameter parameter = (Parameter) it.next();
            if (!map2.containsKey(parameter)) {
                if (parameter instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) parameter;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(parameter, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(parameter, Long.valueOf(createRow));
                C4616x3c8a39e8 ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface = parameter;
                String realmGet$name = ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, parameterColumnInfo.nameIndex, createRow, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, parameterColumnInfo.nameIndex, createRow, false);
                }
                String realmGet$unit = ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmGet$unit();
                if (realmGet$unit != null) {
                    Table.nativeSetString(nativePtr, parameterColumnInfo.unitIndex, createRow, realmGet$unit, false);
                } else {
                    Table.nativeSetNull(nativePtr, parameterColumnInfo.unitIndex, createRow, false);
                }
                String realmGet$value = ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, parameterColumnInfo.valueIndex, createRow, realmGet$value, false);
                } else {
                    Table.nativeSetNull(nativePtr, parameterColumnInfo.valueIndex, createRow, false);
                }
            }
        }
    }

    public static Parameter createDetachedCopy(Parameter parameter, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Parameter parameter2;
        if (i > i2 || parameter == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(parameter);
        if (cacheData == null) {
            parameter2 = new Parameter();
            map.put(parameter, new RealmObjectProxy.CacheData(i, parameter2));
        } else if (i >= cacheData.minDepth) {
            return (Parameter) cacheData.object;
        } else {
            cacheData.minDepth = i;
            parameter2 = (Parameter) cacheData.object;
        }
        C4616x3c8a39e8 ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface = parameter2;
        C4616x3c8a39e8 ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface2 = parameter;
        ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmSet$name(ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmSet$unit(ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface2.realmGet$unit());
        ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface.realmSet$value(ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxyinterface2.realmGet$value());
        return parameter2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Parameter = proxy[");
        sb.append("{name:");
        String str = "null";
        sb.append(realmGet$name() != null ? realmGet$name() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{unit:");
        sb.append(realmGet$unit() != null ? realmGet$unit() : str);
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
        ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_parameterrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
