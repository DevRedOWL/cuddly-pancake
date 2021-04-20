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
import p035ru.unicorn.ujin.data.realm.marketplace.Property;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy extends Property implements RealmObjectProxy, C4619xb6e95a6e {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private PropertyColumnInfo columnInfo;
    private ProxyState<Property> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Property";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy$PropertyColumnInfo */
    static final class PropertyColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long nameIndex;
        long valueIndex;

        PropertyColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.valueIndex = addColumnDetails("value", "value", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        PropertyColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new PropertyColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            PropertyColumnInfo propertyColumnInfo = (PropertyColumnInfo) columnInfo;
            PropertyColumnInfo propertyColumnInfo2 = (PropertyColumnInfo) columnInfo2;
            propertyColumnInfo2.nameIndex = propertyColumnInfo.nameIndex;
            propertyColumnInfo2.valueIndex = propertyColumnInfo.valueIndex;
            propertyColumnInfo2.maxColumnIndexValue = propertyColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (PropertyColumnInfo) realmObjectContext.getColumnInfo();
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
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("value", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static PropertyColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new PropertyColumnInfo(osSchemaInfo);
    }

    public static Property createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        Property property = (Property) realm.createObjectInternal(Property.class, true, Collections.emptyList());
        C4619xb6e95a6e ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface = property;
        if (jSONObject.has("name")) {
            if (jSONObject.isNull("name")) {
                ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface.realmSet$name((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface.realmSet$name(jSONObject.getString("name"));
            }
        }
        if (jSONObject.has("value")) {
            if (jSONObject.isNull("value")) {
                ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface.realmSet$value((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface.realmSet$value(jSONObject.getString("value"));
            }
        }
        return property;
    }

    public static Property createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Property property = new Property();
        C4619xb6e95a6e ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface = property;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface.realmSet$name((String) null);
                }
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface.realmSet$value(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface.realmSet$value((String) null);
            }
        }
        jsonReader.endObject();
        return (Property) realm.copyToRealm(property, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Property.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxy;
    }

    public static Property copyOrUpdate(Realm realm, PropertyColumnInfo propertyColumnInfo, Property property, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (property instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) property;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return property;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(property);
        if (realmObjectProxy2 != null) {
            return (Property) realmObjectProxy2;
        }
        return copy(realm, propertyColumnInfo, property, z, map, set);
    }

    public static Property copy(Realm realm, PropertyColumnInfo propertyColumnInfo, Property property, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(property);
        if (realmObjectProxy != null) {
            return (Property) realmObjectProxy;
        }
        C4619xb6e95a6e ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface = property;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Property.class), propertyColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(propertyColumnInfo.nameIndex, ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(propertyColumnInfo.valueIndex, ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface.realmGet$value());
        ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(property, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Property property, Map<RealmModel, Long> map) {
        if (property instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) property;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Property.class);
        long nativePtr = table.getNativePtr();
        PropertyColumnInfo propertyColumnInfo = (PropertyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Property.class);
        long createRow = OsObject.createRow(table);
        map.put(property, Long.valueOf(createRow));
        C4619xb6e95a6e ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface = property;
        String realmGet$name = ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, propertyColumnInfo.nameIndex, createRow, realmGet$name, false);
        }
        String realmGet$value = ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, propertyColumnInfo.valueIndex, createRow, realmGet$value, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Property.class);
        long nativePtr = table.getNativePtr();
        PropertyColumnInfo propertyColumnInfo = (PropertyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Property.class);
        while (it.hasNext()) {
            Property property = (Property) it.next();
            if (!map2.containsKey(property)) {
                if (property instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) property;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(property, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(property, Long.valueOf(createRow));
                C4619xb6e95a6e ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface = property;
                String realmGet$name = ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, propertyColumnInfo.nameIndex, createRow, realmGet$name, false);
                }
                String realmGet$value = ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, propertyColumnInfo.valueIndex, createRow, realmGet$value, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Property property, Map<RealmModel, Long> map) {
        if (property instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) property;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Property.class);
        long nativePtr = table.getNativePtr();
        PropertyColumnInfo propertyColumnInfo = (PropertyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Property.class);
        long createRow = OsObject.createRow(table);
        map.put(property, Long.valueOf(createRow));
        C4619xb6e95a6e ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface = property;
        String realmGet$name = ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, propertyColumnInfo.nameIndex, createRow, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, propertyColumnInfo.nameIndex, createRow, false);
        }
        String realmGet$value = ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, propertyColumnInfo.valueIndex, createRow, realmGet$value, false);
        } else {
            Table.nativeSetNull(nativePtr, propertyColumnInfo.valueIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Property.class);
        long nativePtr = table.getNativePtr();
        PropertyColumnInfo propertyColumnInfo = (PropertyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Property.class);
        while (it.hasNext()) {
            Property property = (Property) it.next();
            if (!map2.containsKey(property)) {
                if (property instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) property;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(property, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(property, Long.valueOf(createRow));
                C4619xb6e95a6e ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface = property;
                String realmGet$name = ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, propertyColumnInfo.nameIndex, createRow, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, propertyColumnInfo.nameIndex, createRow, false);
                }
                String realmGet$value = ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, propertyColumnInfo.valueIndex, createRow, realmGet$value, false);
                } else {
                    Table.nativeSetNull(nativePtr, propertyColumnInfo.valueIndex, createRow, false);
                }
            }
        }
    }

    public static Property createDetachedCopy(Property property, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Property property2;
        if (i > i2 || property == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(property);
        if (cacheData == null) {
            property2 = new Property();
            map.put(property, new RealmObjectProxy.CacheData(i, property2));
        } else if (i >= cacheData.minDepth) {
            return (Property) cacheData.object;
        } else {
            cacheData.minDepth = i;
            property2 = (Property) cacheData.object;
        }
        C4619xb6e95a6e ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface = property2;
        C4619xb6e95a6e ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface2 = property;
        ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface.realmSet$name(ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface.realmSet$value(ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxyinterface2.realmGet$value());
        return property2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Property = proxy[");
        sb.append("{name:");
        String str = "null";
        sb.append(realmGet$name() != null ? realmGet$name() : str);
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
        ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_propertyrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
