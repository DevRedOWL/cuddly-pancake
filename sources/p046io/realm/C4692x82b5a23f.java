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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ServiceStatus;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_ServiceStatusRealmProxy */
public class C4692x82b5a23f extends ServiceStatus implements RealmObjectProxy, C4693xe5fb01ba {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ServiceStatusColumnInfo columnInfo;
    private ProxyState<ServiceStatus> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_ServiceStatusRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ServiceStatus";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_ServiceStatusRealmProxy$ServiceStatusColumnInfo */
    static final class ServiceStatusColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long messageIndex;
        long valueIndex;

        ServiceStatusColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.valueIndex = addColumnDetails("value", "value", objectSchemaInfo);
            this.messageIndex = addColumnDetails("message", "message", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ServiceStatusColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ServiceStatusColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ServiceStatusColumnInfo serviceStatusColumnInfo = (ServiceStatusColumnInfo) columnInfo;
            ServiceStatusColumnInfo serviceStatusColumnInfo2 = (ServiceStatusColumnInfo) columnInfo2;
            serviceStatusColumnInfo2.valueIndex = serviceStatusColumnInfo.valueIndex;
            serviceStatusColumnInfo2.messageIndex = serviceStatusColumnInfo.messageIndex;
            serviceStatusColumnInfo2.maxColumnIndexValue = serviceStatusColumnInfo.maxColumnIndexValue;
        }
    }

    C4692x82b5a23f() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ServiceStatusColumnInfo) realmObjectContext.getColumnInfo();
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
        builder2.addPersistedProperty("value", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("message", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ServiceStatusColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ServiceStatusColumnInfo(osSchemaInfo);
    }

    public static ServiceStatus createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ServiceStatus serviceStatus = (ServiceStatus) realm.createObjectInternal(ServiceStatus.class, true, Collections.emptyList());
        C4693xe5fb01ba ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface = serviceStatus;
        if (jSONObject.has("value")) {
            if (jSONObject.isNull("value")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface.realmSet$value((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface.realmSet$value(jSONObject.getString("value"));
            }
        }
        if (jSONObject.has("message")) {
            if (jSONObject.isNull("message")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface.realmSet$message((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface.realmSet$message(jSONObject.getString("message"));
            }
        }
        return serviceStatus;
    }

    public static ServiceStatus createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ServiceStatus serviceStatus = new ServiceStatus();
        C4693xe5fb01ba ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface = serviceStatus;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("value")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface.realmSet$value(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface.realmSet$value((String) null);
                }
            } else if (!nextName.equals("message")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface.realmSet$message(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface.realmSet$message((String) null);
            }
        }
        jsonReader.endObject();
        return (ServiceStatus) realm.copyToRealm(serviceStatus, new ImportFlag[0]);
    }

    private static C4692x82b5a23f newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceStatus.class), false, Collections.emptyList());
        C4692x82b5a23f ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxy = new C4692x82b5a23f();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxy;
    }

    public static ServiceStatus copyOrUpdate(Realm realm, ServiceStatusColumnInfo serviceStatusColumnInfo, ServiceStatus serviceStatus, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (serviceStatus instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceStatus;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return serviceStatus;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(serviceStatus);
        if (realmObjectProxy2 != null) {
            return (ServiceStatus) realmObjectProxy2;
        }
        return copy(realm, serviceStatusColumnInfo, serviceStatus, z, map, set);
    }

    public static ServiceStatus copy(Realm realm, ServiceStatusColumnInfo serviceStatusColumnInfo, ServiceStatus serviceStatus, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(serviceStatus);
        if (realmObjectProxy != null) {
            return (ServiceStatus) realmObjectProxy;
        }
        C4693xe5fb01ba ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface = serviceStatus;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ServiceStatus.class), serviceStatusColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(serviceStatusColumnInfo.valueIndex, ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface.realmGet$value());
        osObjectBuilder.addString(serviceStatusColumnInfo.messageIndex, ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface.realmGet$message());
        C4692x82b5a23f newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(serviceStatus, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, ServiceStatus serviceStatus, Map<RealmModel, Long> map) {
        if (serviceStatus instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceStatus;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ServiceStatus.class);
        long nativePtr = table.getNativePtr();
        ServiceStatusColumnInfo serviceStatusColumnInfo = (ServiceStatusColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceStatus.class);
        long createRow = OsObject.createRow(table);
        map.put(serviceStatus, Long.valueOf(createRow));
        C4693xe5fb01ba ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface = serviceStatus;
        String realmGet$value = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, serviceStatusColumnInfo.valueIndex, createRow, realmGet$value, false);
        }
        String realmGet$message = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface.realmGet$message();
        if (realmGet$message != null) {
            Table.nativeSetString(nativePtr, serviceStatusColumnInfo.messageIndex, createRow, realmGet$message, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ServiceStatus.class);
        long nativePtr = table.getNativePtr();
        ServiceStatusColumnInfo serviceStatusColumnInfo = (ServiceStatusColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceStatus.class);
        while (it.hasNext()) {
            ServiceStatus serviceStatus = (ServiceStatus) it.next();
            if (!map2.containsKey(serviceStatus)) {
                if (serviceStatus instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceStatus;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(serviceStatus, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(serviceStatus, Long.valueOf(createRow));
                C4693xe5fb01ba ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface = serviceStatus;
                String realmGet$value = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, serviceStatusColumnInfo.valueIndex, createRow, realmGet$value, false);
                }
                String realmGet$message = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface.realmGet$message();
                if (realmGet$message != null) {
                    Table.nativeSetString(nativePtr, serviceStatusColumnInfo.messageIndex, createRow, realmGet$message, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ServiceStatus serviceStatus, Map<RealmModel, Long> map) {
        if (serviceStatus instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceStatus;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ServiceStatus.class);
        long nativePtr = table.getNativePtr();
        ServiceStatusColumnInfo serviceStatusColumnInfo = (ServiceStatusColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceStatus.class);
        long createRow = OsObject.createRow(table);
        map.put(serviceStatus, Long.valueOf(createRow));
        C4693xe5fb01ba ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface = serviceStatus;
        String realmGet$value = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, serviceStatusColumnInfo.valueIndex, createRow, realmGet$value, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceStatusColumnInfo.valueIndex, createRow, false);
        }
        String realmGet$message = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface.realmGet$message();
        if (realmGet$message != null) {
            Table.nativeSetString(nativePtr, serviceStatusColumnInfo.messageIndex, createRow, realmGet$message, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceStatusColumnInfo.messageIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ServiceStatus.class);
        long nativePtr = table.getNativePtr();
        ServiceStatusColumnInfo serviceStatusColumnInfo = (ServiceStatusColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceStatus.class);
        while (it.hasNext()) {
            ServiceStatus serviceStatus = (ServiceStatus) it.next();
            if (!map2.containsKey(serviceStatus)) {
                if (serviceStatus instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceStatus;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(serviceStatus, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(serviceStatus, Long.valueOf(createRow));
                C4693xe5fb01ba ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface = serviceStatus;
                String realmGet$value = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, serviceStatusColumnInfo.valueIndex, createRow, realmGet$value, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceStatusColumnInfo.valueIndex, createRow, false);
                }
                String realmGet$message = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface.realmGet$message();
                if (realmGet$message != null) {
                    Table.nativeSetString(nativePtr, serviceStatusColumnInfo.messageIndex, createRow, realmGet$message, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceStatusColumnInfo.messageIndex, createRow, false);
                }
            }
        }
    }

    public static ServiceStatus createDetachedCopy(ServiceStatus serviceStatus, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ServiceStatus serviceStatus2;
        if (i > i2 || serviceStatus == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(serviceStatus);
        if (cacheData == null) {
            serviceStatus2 = new ServiceStatus();
            map.put(serviceStatus, new RealmObjectProxy.CacheData(i, serviceStatus2));
        } else if (i >= cacheData.minDepth) {
            return (ServiceStatus) cacheData.object;
        } else {
            cacheData.minDepth = i;
            serviceStatus2 = (ServiceStatus) cacheData.object;
        }
        C4693xe5fb01ba ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface = serviceStatus2;
        C4693xe5fb01ba ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface2 = serviceStatus;
        ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface.realmSet$value(ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface2.realmGet$value());
        ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface.realmSet$message(ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxyinterface2.realmGet$message());
        return serviceStatus2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ServiceStatus = proxy[");
        sb.append("{value:");
        String str = "null";
        sb.append(realmGet$value() != null ? realmGet$value() : str);
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
        C4692x82b5a23f ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxy = (C4692x82b5a23f) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicestatusrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
