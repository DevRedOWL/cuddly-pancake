package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.realm.marketplace.Component;
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

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy extends Component implements RealmObjectProxy, C4612xcc818814 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ComponentColumnInfo columnInfo;
    private RealmList<String> itemsRealmList;
    private ProxyState<Component> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Component";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy$ComponentColumnInfo */
    static final class ComponentColumnInfo extends ColumnInfo {
        long itemsIndex;
        long maxColumnIndexValue;
        long typeIndex;

        ComponentColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.typeIndex = addColumnDetails("type", "type", objectSchemaInfo);
            this.itemsIndex = addColumnDetails(FirebaseAnalytics.Param.ITEMS, FirebaseAnalytics.Param.ITEMS, objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ComponentColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ComponentColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ComponentColumnInfo componentColumnInfo = (ComponentColumnInfo) columnInfo;
            ComponentColumnInfo componentColumnInfo2 = (ComponentColumnInfo) columnInfo2;
            componentColumnInfo2.typeIndex = componentColumnInfo.typeIndex;
            componentColumnInfo2.itemsIndex = componentColumnInfo.itemsIndex;
            componentColumnInfo2.maxColumnIndexValue = componentColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ComponentColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$type() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.typeIndex);
    }

    public void realmSet$type(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.typeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.typeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.typeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.typeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RealmList<String> realmGet$items() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<String> realmList = this.itemsRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.itemsRealmList = new RealmList<>(String.class, this.proxyState.getRow$realm().getValueList(this.columnInfo.itemsIndex, RealmFieldType.STRING_LIST), this.proxyState.getRealm$realm());
        return this.itemsRealmList;
    }

    public void realmSet$items(RealmList<String> realmList) {
        if (!this.proxyState.isUnderConstruction() || (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains(FirebaseAnalytics.Param.ITEMS))) {
            this.proxyState.getRealm$realm().checkIfValid();
            OsList valueList = this.proxyState.getRow$realm().getValueList(this.columnInfo.itemsIndex, RealmFieldType.STRING_LIST);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        builder.addPersistedProperty("type", RealmFieldType.STRING, false, false, false);
        builder.addPersistedValueListProperty(FirebaseAnalytics.Param.ITEMS, RealmFieldType.STRING_LIST, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ComponentColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ComponentColumnInfo(osSchemaInfo);
    }

    public static Component createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has(FirebaseAnalytics.Param.ITEMS)) {
            arrayList.add(FirebaseAnalytics.Param.ITEMS);
        }
        Component component = (Component) realm.createObjectInternal(Component.class, true, arrayList);
        C4612xcc818814 ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface = component;
        if (jSONObject.has("type")) {
            if (jSONObject.isNull("type")) {
                ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface.realmSet$type((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface.realmSet$type(jSONObject.getString("type"));
            }
        }
        ProxyUtils.setRealmListWithJsonObject(ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface.realmGet$items(), jSONObject, FirebaseAnalytics.Param.ITEMS);
        return component;
    }

    public static Component createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Component component = new Component();
        C4612xcc818814 ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface = component;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("type")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface.realmSet$type(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface.realmSet$type((String) null);
                }
            } else if (nextName.equals(FirebaseAnalytics.Param.ITEMS)) {
                ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface.realmSet$items(ProxyUtils.createRealmListWithJsonStream(String.class, jsonReader));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return (Component) realm.copyToRealm(component, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Component.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy ru_unicorn_ujin_data_realm_marketplace_componentrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_componentrealmproxy;
    }

    public static Component copyOrUpdate(Realm realm, ComponentColumnInfo componentColumnInfo, Component component, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (component instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) component;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return component;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(component);
        if (realmObjectProxy2 != null) {
            return (Component) realmObjectProxy2;
        }
        return copy(realm, componentColumnInfo, component, z, map, set);
    }

    public static Component copy(Realm realm, ComponentColumnInfo componentColumnInfo, Component component, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(component);
        if (realmObjectProxy != null) {
            return (Component) realmObjectProxy;
        }
        C4612xcc818814 ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface = component;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Component.class), componentColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(componentColumnInfo.typeIndex, ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface.realmGet$type());
        osObjectBuilder.addStringList(componentColumnInfo.itemsIndex, ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface.realmGet$items());
        ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(component, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Component component, Map<RealmModel, Long> map) {
        if (component instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) component;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Component.class);
        long nativePtr = table.getNativePtr();
        ComponentColumnInfo componentColumnInfo = (ComponentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Component.class);
        long createRow = OsObject.createRow(table);
        map.put(component, Long.valueOf(createRow));
        C4612xcc818814 ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface = component;
        String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, componentColumnInfo.typeIndex, createRow, realmGet$type, false);
        }
        RealmList<String> realmGet$items = ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface.realmGet$items();
        if (realmGet$items != null) {
            OsList osList = new OsList(table.getUncheckedRow(createRow), componentColumnInfo.itemsIndex);
            Iterator<String> it = realmGet$items.iterator();
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
        Table table = realm.getTable(Component.class);
        long nativePtr = table.getNativePtr();
        ComponentColumnInfo componentColumnInfo = (ComponentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Component.class);
        while (it.hasNext()) {
            Component component = (Component) it.next();
            if (!map2.containsKey(component)) {
                if (component instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) component;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(component, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(component, Long.valueOf(createRow));
                C4612xcc818814 ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface = component;
                String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, componentColumnInfo.typeIndex, createRow, realmGet$type, false);
                }
                RealmList<String> realmGet$items = ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface.realmGet$items();
                if (realmGet$items != null) {
                    OsList osList = new OsList(table.getUncheckedRow(createRow), componentColumnInfo.itemsIndex);
                    Iterator<String> it2 = realmGet$items.iterator();
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

    public static long insertOrUpdate(Realm realm, Component component, Map<RealmModel, Long> map) {
        if (component instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) component;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Component.class);
        long nativePtr = table.getNativePtr();
        ComponentColumnInfo componentColumnInfo = (ComponentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Component.class);
        long createRow = OsObject.createRow(table);
        map.put(component, Long.valueOf(createRow));
        C4612xcc818814 ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface = component;
        String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, componentColumnInfo.typeIndex, createRow, realmGet$type, false);
        } else {
            Table.nativeSetNull(nativePtr, componentColumnInfo.typeIndex, createRow, false);
        }
        OsList osList = new OsList(table.getUncheckedRow(createRow), componentColumnInfo.itemsIndex);
        osList.removeAll();
        RealmList<String> realmGet$items = ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface.realmGet$items();
        if (realmGet$items != null) {
            Iterator<String> it = realmGet$items.iterator();
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
        Table table = realm.getTable(Component.class);
        long nativePtr = table.getNativePtr();
        ComponentColumnInfo componentColumnInfo = (ComponentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Component.class);
        while (it.hasNext()) {
            Component component = (Component) it.next();
            if (!map2.containsKey(component)) {
                if (component instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) component;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(component, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(component, Long.valueOf(createRow));
                C4612xcc818814 ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface = component;
                String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, componentColumnInfo.typeIndex, createRow, realmGet$type, false);
                } else {
                    Table.nativeSetNull(nativePtr, componentColumnInfo.typeIndex, createRow, false);
                }
                OsList osList = new OsList(table.getUncheckedRow(createRow), componentColumnInfo.itemsIndex);
                osList.removeAll();
                RealmList<String> realmGet$items = ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface.realmGet$items();
                if (realmGet$items != null) {
                    Iterator<String> it2 = realmGet$items.iterator();
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

    public static Component createDetachedCopy(Component component, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Component component2;
        if (i > i2 || component == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(component);
        if (cacheData == null) {
            component2 = new Component();
            map.put(component, new RealmObjectProxy.CacheData(i, component2));
        } else if (i >= cacheData.minDepth) {
            return (Component) cacheData.object;
        } else {
            cacheData.minDepth = i;
            component2 = (Component) cacheData.object;
        }
        C4612xcc818814 ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface = component2;
        C4612xcc818814 ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface2 = component;
        ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface.realmSet$type(ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface2.realmGet$type());
        ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface.realmSet$items(new RealmList());
        ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface.realmGet$items().addAll(ru_unicorn_ujin_data_realm_marketplace_componentrealmproxyinterface2.realmGet$items());
        return component2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Component = proxy[");
        sb.append("{type:");
        sb.append(realmGet$type() != null ? realmGet$type() : "null");
        sb.append("}");
        sb.append(",");
        sb.append("{items:");
        sb.append("RealmList<String>[");
        sb.append(realmGet$items().size());
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
        ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy ru_unicorn_ujin_data_realm_marketplace_componentrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_componentrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_componentrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_componentrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
