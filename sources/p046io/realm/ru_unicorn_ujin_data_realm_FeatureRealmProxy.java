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
import p035ru.unicorn.ujin.data.realm.Feature;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_FeatureRealmProxy */
public class ru_unicorn_ujin_data_realm_FeatureRealmProxy extends Feature implements RealmObjectProxy, ru_unicorn_ujin_data_realm_FeatureRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private FeatureColumnInfo columnInfo;
    private ProxyState<Feature> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_FeatureRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Feature";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_FeatureRealmProxy$FeatureColumnInfo */
    static final class FeatureColumnInfo extends ColumnInfo {
        long idIndex;
        long maxColumnIndexValue;
        long titleIndex;
        long valueIndex;

        FeatureColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.valueIndex = addColumnDetails("value", "value", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        FeatureColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new FeatureColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            FeatureColumnInfo featureColumnInfo = (FeatureColumnInfo) columnInfo;
            FeatureColumnInfo featureColumnInfo2 = (FeatureColumnInfo) columnInfo2;
            featureColumnInfo2.idIndex = featureColumnInfo.idIndex;
            featureColumnInfo2.titleIndex = featureColumnInfo.titleIndex;
            featureColumnInfo2.valueIndex = featureColumnInfo.valueIndex;
            featureColumnInfo2.maxColumnIndexValue = featureColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_FeatureRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (FeatureColumnInfo) realmObjectContext.getColumnInfo();
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
        builder2.addPersistedProperty("id", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("value", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static FeatureColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new FeatureColumnInfo(osSchemaInfo);
    }

    public static Feature createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        Feature feature = (Feature) realm.createObjectInternal(Feature.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_FeatureRealmProxyInterface ru_unicorn_ujin_data_realm_featurerealmproxyinterface = feature;
        if (jSONObject.has("id")) {
            if (jSONObject.isNull("id")) {
                ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmSet$id((String) null);
            } else {
                ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmSet$id(jSONObject.getString("id"));
            }
        }
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("value")) {
            if (jSONObject.isNull("value")) {
                ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmSet$value((String) null);
            } else {
                ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmSet$value(jSONObject.getString("value"));
            }
        }
        return feature;
    }

    public static Feature createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Feature feature = new Feature();
        ru_unicorn_ujin_data_realm_FeatureRealmProxyInterface ru_unicorn_ujin_data_realm_featurerealmproxyinterface = feature;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmSet$id((String) null);
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmSet$title((String) null);
                }
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmSet$value(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmSet$value((String) null);
            }
        }
        jsonReader.endObject();
        return (Feature) realm.copyToRealm(feature, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_FeatureRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Feature.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_FeatureRealmProxy ru_unicorn_ujin_data_realm_featurerealmproxy = new ru_unicorn_ujin_data_realm_FeatureRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_featurerealmproxy;
    }

    public static Feature copyOrUpdate(Realm realm, FeatureColumnInfo featureColumnInfo, Feature feature, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (feature instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) feature;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return feature;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(feature);
        if (realmObjectProxy2 != null) {
            return (Feature) realmObjectProxy2;
        }
        return copy(realm, featureColumnInfo, feature, z, map, set);
    }

    public static Feature copy(Realm realm, FeatureColumnInfo featureColumnInfo, Feature feature, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(feature);
        if (realmObjectProxy != null) {
            return (Feature) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_FeatureRealmProxyInterface ru_unicorn_ujin_data_realm_featurerealmproxyinterface = feature;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Feature.class), featureColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(featureColumnInfo.idIndex, ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(featureColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(featureColumnInfo.valueIndex, ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmGet$value());
        ru_unicorn_ujin_data_realm_FeatureRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(feature, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Feature feature, Map<RealmModel, Long> map) {
        if (feature instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) feature;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Feature.class);
        long nativePtr = table.getNativePtr();
        FeatureColumnInfo featureColumnInfo = (FeatureColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Feature.class);
        long createRow = OsObject.createRow(table);
        map.put(feature, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_FeatureRealmProxyInterface ru_unicorn_ujin_data_realm_featurerealmproxyinterface = feature;
        String realmGet$id = ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, featureColumnInfo.idIndex, createRow, realmGet$id, false);
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, featureColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        String realmGet$value = ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, featureColumnInfo.valueIndex, createRow, realmGet$value, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Feature.class);
        long nativePtr = table.getNativePtr();
        FeatureColumnInfo featureColumnInfo = (FeatureColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Feature.class);
        while (it.hasNext()) {
            Feature feature = (Feature) it.next();
            if (!map2.containsKey(feature)) {
                if (feature instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) feature;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(feature, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(feature, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_FeatureRealmProxyInterface ru_unicorn_ujin_data_realm_featurerealmproxyinterface = feature;
                String realmGet$id = ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, featureColumnInfo.idIndex, createRow, realmGet$id, false);
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, featureColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
                String realmGet$value = ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, featureColumnInfo.valueIndex, createRow, realmGet$value, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Feature feature, Map<RealmModel, Long> map) {
        if (feature instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) feature;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Feature.class);
        long nativePtr = table.getNativePtr();
        FeatureColumnInfo featureColumnInfo = (FeatureColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Feature.class);
        long createRow = OsObject.createRow(table);
        map.put(feature, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_FeatureRealmProxyInterface ru_unicorn_ujin_data_realm_featurerealmproxyinterface = feature;
        String realmGet$id = ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, featureColumnInfo.idIndex, createRow, realmGet$id, false);
        } else {
            Table.nativeSetNull(nativePtr, featureColumnInfo.idIndex, createRow, false);
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, featureColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, featureColumnInfo.titleIndex, createRow, false);
        }
        String realmGet$value = ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, featureColumnInfo.valueIndex, createRow, realmGet$value, false);
        } else {
            Table.nativeSetNull(nativePtr, featureColumnInfo.valueIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Feature.class);
        long nativePtr = table.getNativePtr();
        FeatureColumnInfo featureColumnInfo = (FeatureColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Feature.class);
        while (it.hasNext()) {
            Feature feature = (Feature) it.next();
            if (!map2.containsKey(feature)) {
                if (feature instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) feature;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(feature, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(feature, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_FeatureRealmProxyInterface ru_unicorn_ujin_data_realm_featurerealmproxyinterface = feature;
                String realmGet$id = ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, featureColumnInfo.idIndex, createRow, realmGet$id, false);
                } else {
                    Table.nativeSetNull(nativePtr, featureColumnInfo.idIndex, createRow, false);
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, featureColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, featureColumnInfo.titleIndex, createRow, false);
                }
                String realmGet$value = ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, featureColumnInfo.valueIndex, createRow, realmGet$value, false);
                } else {
                    Table.nativeSetNull(nativePtr, featureColumnInfo.valueIndex, createRow, false);
                }
            }
        }
    }

    public static Feature createDetachedCopy(Feature feature, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Feature feature2;
        if (i > i2 || feature == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(feature);
        if (cacheData == null) {
            feature2 = new Feature();
            map.put(feature, new RealmObjectProxy.CacheData(i, feature2));
        } else if (i >= cacheData.minDepth) {
            return (Feature) cacheData.object;
        } else {
            cacheData.minDepth = i;
            feature2 = (Feature) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_FeatureRealmProxyInterface ru_unicorn_ujin_data_realm_featurerealmproxyinterface = feature2;
        ru_unicorn_ujin_data_realm_FeatureRealmProxyInterface ru_unicorn_ujin_data_realm_featurerealmproxyinterface2 = feature;
        ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_featurerealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_featurerealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_featurerealmproxyinterface.realmSet$value(ru_unicorn_ujin_data_realm_featurerealmproxyinterface2.realmGet$value());
        return feature2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Feature = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : str);
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
        ru_unicorn_ujin_data_realm_FeatureRealmProxy ru_unicorn_ujin_data_realm_featurerealmproxy = (ru_unicorn_ujin_data_realm_FeatureRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_featurerealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_featurerealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_featurerealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
