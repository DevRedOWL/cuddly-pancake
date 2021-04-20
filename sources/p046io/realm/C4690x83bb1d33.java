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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ServiceFieldItems;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_ServiceFieldItemsRealmProxy */
public class C4690x83bb1d33 extends ServiceFieldItems implements RealmObjectProxy, C4691x107e9946 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ServiceFieldItemsColumnInfo columnInfo;
    private ProxyState<ServiceFieldItems> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_ServiceFieldItemsRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ServiceFieldItems";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_ServiceFieldItemsRealmProxy$ServiceFieldItemsColumnInfo */
    static final class ServiceFieldItemsColumnInfo extends ColumnInfo {
        long idIndex;
        long maxColumnIndexValue;
        long valueIndex;

        ServiceFieldItemsColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.valueIndex = addColumnDetails("value", "value", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ServiceFieldItemsColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ServiceFieldItemsColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ServiceFieldItemsColumnInfo serviceFieldItemsColumnInfo = (ServiceFieldItemsColumnInfo) columnInfo;
            ServiceFieldItemsColumnInfo serviceFieldItemsColumnInfo2 = (ServiceFieldItemsColumnInfo) columnInfo2;
            serviceFieldItemsColumnInfo2.idIndex = serviceFieldItemsColumnInfo.idIndex;
            serviceFieldItemsColumnInfo2.valueIndex = serviceFieldItemsColumnInfo.valueIndex;
            serviceFieldItemsColumnInfo2.maxColumnIndexValue = serviceFieldItemsColumnInfo.maxColumnIndexValue;
        }
    }

    C4690x83bb1d33() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ServiceFieldItemsColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public int realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex);
    }

    public void realmSet$id(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.idIndex, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.idIndex, row$realm.getIndex(), (long) i, true);
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
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, false, false, true);
        builder2.addPersistedProperty("value", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ServiceFieldItemsColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ServiceFieldItemsColumnInfo(osSchemaInfo);
    }

    public static ServiceFieldItems createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ServiceFieldItems serviceFieldItems = (ServiceFieldItems) realm.createObjectInternal(ServiceFieldItems.class, true, Collections.emptyList());
        C4691x107e9946 ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface = serviceFieldItems;
        if (jSONObject.has("id")) {
            if (!jSONObject.isNull("id")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface.realmSet$id(jSONObject.getInt("id"));
            } else {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            }
        }
        if (jSONObject.has("value")) {
            if (jSONObject.isNull("value")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface.realmSet$value((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface.realmSet$value(jSONObject.getString("value"));
            }
        }
        return serviceFieldItems;
    }

    public static ServiceFieldItems createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ServiceFieldItems serviceFieldItems = new ServiceFieldItems();
        C4691x107e9946 ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface = serviceFieldItems;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface.realmSet$id(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface.realmSet$value(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface.realmSet$value((String) null);
            }
        }
        jsonReader.endObject();
        return (ServiceFieldItems) realm.copyToRealm(serviceFieldItems, new ImportFlag[0]);
    }

    private static C4690x83bb1d33 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceFieldItems.class), false, Collections.emptyList());
        C4690x83bb1d33 ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxy = new C4690x83bb1d33();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxy;
    }

    public static ServiceFieldItems copyOrUpdate(Realm realm, ServiceFieldItemsColumnInfo serviceFieldItemsColumnInfo, ServiceFieldItems serviceFieldItems, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (serviceFieldItems instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceFieldItems;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return serviceFieldItems;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(serviceFieldItems);
        if (realmObjectProxy2 != null) {
            return (ServiceFieldItems) realmObjectProxy2;
        }
        return copy(realm, serviceFieldItemsColumnInfo, serviceFieldItems, z, map, set);
    }

    public static ServiceFieldItems copy(Realm realm, ServiceFieldItemsColumnInfo serviceFieldItemsColumnInfo, ServiceFieldItems serviceFieldItems, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(serviceFieldItems);
        if (realmObjectProxy != null) {
            return (ServiceFieldItems) realmObjectProxy;
        }
        C4691x107e9946 ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface = serviceFieldItems;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ServiceFieldItems.class), serviceFieldItemsColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(serviceFieldItemsColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(serviceFieldItemsColumnInfo.valueIndex, ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface.realmGet$value());
        C4690x83bb1d33 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(serviceFieldItems, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, ServiceFieldItems serviceFieldItems, Map<RealmModel, Long> map) {
        ServiceFieldItems serviceFieldItems2 = serviceFieldItems;
        if (serviceFieldItems2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceFieldItems2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ServiceFieldItems.class);
        long nativePtr = table.getNativePtr();
        ServiceFieldItemsColumnInfo serviceFieldItemsColumnInfo = (ServiceFieldItemsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceFieldItems.class);
        long createRow = OsObject.createRow(table);
        map.put(serviceFieldItems2, Long.valueOf(createRow));
        C4691x107e9946 ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface = serviceFieldItems2;
        Table.nativeSetLong(nativePtr, serviceFieldItemsColumnInfo.idIndex, createRow, (long) ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface.realmGet$id(), false);
        String realmGet$value = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, serviceFieldItemsColumnInfo.valueIndex, createRow, realmGet$value, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ServiceFieldItems.class);
        long nativePtr = table.getNativePtr();
        ServiceFieldItemsColumnInfo serviceFieldItemsColumnInfo = (ServiceFieldItemsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceFieldItems.class);
        while (it.hasNext()) {
            ServiceFieldItems serviceFieldItems = (ServiceFieldItems) it.next();
            if (!map2.containsKey(serviceFieldItems)) {
                if (serviceFieldItems instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceFieldItems;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(serviceFieldItems, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(serviceFieldItems, Long.valueOf(createRow));
                C4691x107e9946 ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface = serviceFieldItems;
                Table.nativeSetLong(nativePtr, serviceFieldItemsColumnInfo.idIndex, createRow, (long) ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface.realmGet$id(), false);
                String realmGet$value = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, serviceFieldItemsColumnInfo.valueIndex, createRow, realmGet$value, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ServiceFieldItems serviceFieldItems, Map<RealmModel, Long> map) {
        ServiceFieldItems serviceFieldItems2 = serviceFieldItems;
        if (serviceFieldItems2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceFieldItems2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ServiceFieldItems.class);
        long nativePtr = table.getNativePtr();
        ServiceFieldItemsColumnInfo serviceFieldItemsColumnInfo = (ServiceFieldItemsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceFieldItems.class);
        long createRow = OsObject.createRow(table);
        map.put(serviceFieldItems2, Long.valueOf(createRow));
        C4691x107e9946 ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface = serviceFieldItems2;
        Table.nativeSetLong(nativePtr, serviceFieldItemsColumnInfo.idIndex, createRow, (long) ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface.realmGet$id(), false);
        String realmGet$value = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, serviceFieldItemsColumnInfo.valueIndex, createRow, realmGet$value, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceFieldItemsColumnInfo.valueIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ServiceFieldItems.class);
        long nativePtr = table.getNativePtr();
        ServiceFieldItemsColumnInfo serviceFieldItemsColumnInfo = (ServiceFieldItemsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceFieldItems.class);
        while (it.hasNext()) {
            ServiceFieldItems serviceFieldItems = (ServiceFieldItems) it.next();
            if (!map2.containsKey(serviceFieldItems)) {
                if (serviceFieldItems instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceFieldItems;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(serviceFieldItems, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(serviceFieldItems, Long.valueOf(createRow));
                C4691x107e9946 ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface = serviceFieldItems;
                Table.nativeSetLong(nativePtr, serviceFieldItemsColumnInfo.idIndex, createRow, (long) ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface.realmGet$id(), false);
                String realmGet$value = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, serviceFieldItemsColumnInfo.valueIndex, createRow, realmGet$value, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceFieldItemsColumnInfo.valueIndex, createRow, false);
                }
            }
        }
    }

    public static ServiceFieldItems createDetachedCopy(ServiceFieldItems serviceFieldItems, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ServiceFieldItems serviceFieldItems2;
        if (i > i2 || serviceFieldItems == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(serviceFieldItems);
        if (cacheData == null) {
            serviceFieldItems2 = new ServiceFieldItems();
            map.put(serviceFieldItems, new RealmObjectProxy.CacheData(i, serviceFieldItems2));
        } else if (i >= cacheData.minDepth) {
            return (ServiceFieldItems) cacheData.object;
        } else {
            cacheData.minDepth = i;
            serviceFieldItems2 = (ServiceFieldItems) cacheData.object;
        }
        C4691x107e9946 ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface = serviceFieldItems2;
        C4691x107e9946 ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface2 = serviceFieldItems;
        ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface.realmSet$value(ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxyinterface2.realmGet$value());
        return serviceFieldItems2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ServiceFieldItems = proxy[");
        sb.append("{id:");
        sb.append(realmGet$id());
        sb.append("}");
        sb.append(",");
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
        C4690x83bb1d33 ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxy = (C4690x83bb1d33) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicefielditemsrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
