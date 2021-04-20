package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.MinVersion;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_MinVersionRealmProxy */
public class C4662xc0a23e3a extends MinVersion implements RealmObjectProxy, C4663x8d0eb01f {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private MinVersionColumnInfo columnInfo;
    private ProxyState<MinVersion> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_MinVersionRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "MinVersion";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_MinVersionRealmProxy$MinVersionColumnInfo */
    static final class MinVersionColumnInfo extends ColumnInfo {
        long androidIndex;
        long maxColumnIndexValue;

        MinVersionColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.androidIndex = addColumnDetails(AbstractSpiCall.ANDROID_CLIENT_TYPE, AbstractSpiCall.ANDROID_CLIENT_TYPE, objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        MinVersionColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new MinVersionColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            MinVersionColumnInfo minVersionColumnInfo = (MinVersionColumnInfo) columnInfo;
            MinVersionColumnInfo minVersionColumnInfo2 = (MinVersionColumnInfo) columnInfo2;
            minVersionColumnInfo2.androidIndex = minVersionColumnInfo.androidIndex;
            minVersionColumnInfo2.maxColumnIndexValue = minVersionColumnInfo.maxColumnIndexValue;
        }
    }

    C4662xc0a23e3a() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (MinVersionColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Long realmGet$android() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.androidIndex)) {
            return null;
        }
        return Long.valueOf(this.proxyState.getRow$realm().getLong(this.columnInfo.androidIndex));
    }

    public void realmSet$android(Long l) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (l == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.androidIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.androidIndex, l.longValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (l == null) {
                row$realm.getTable().setNull(this.columnInfo.androidIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.androidIndex, row$realm.getIndex(), l.longValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedProperty(AbstractSpiCall.ANDROID_CLIENT_TYPE, RealmFieldType.INTEGER, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MinVersionColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new MinVersionColumnInfo(osSchemaInfo);
    }

    public static MinVersion createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        MinVersion minVersion = (MinVersion) realm.createObjectInternal(MinVersion.class, true, Collections.emptyList());
        C4663x8d0eb01f ru_unicorn_ujin_view_activity_navigation_entity_schema_minversionrealmproxyinterface = minVersion;
        if (jSONObject.has(AbstractSpiCall.ANDROID_CLIENT_TYPE)) {
            if (jSONObject.isNull(AbstractSpiCall.ANDROID_CLIENT_TYPE)) {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_minversionrealmproxyinterface.realmSet$android((Long) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_minversionrealmproxyinterface.realmSet$android(Long.valueOf(jSONObject.getLong(AbstractSpiCall.ANDROID_CLIENT_TYPE)));
            }
        }
        return minVersion;
    }

    public static MinVersion createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        MinVersion minVersion = new MinVersion();
        C4663x8d0eb01f ru_unicorn_ujin_view_activity_navigation_entity_schema_minversionrealmproxyinterface = minVersion;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals(AbstractSpiCall.ANDROID_CLIENT_TYPE)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_minversionrealmproxyinterface.realmSet$android(Long.valueOf(jsonReader.nextLong()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_entity_schema_minversionrealmproxyinterface.realmSet$android((Long) null);
            }
        }
        jsonReader.endObject();
        return (MinVersion) realm.copyToRealm(minVersion, new ImportFlag[0]);
    }

    private static C4662xc0a23e3a newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) MinVersion.class), false, Collections.emptyList());
        C4662xc0a23e3a ru_unicorn_ujin_view_activity_navigation_entity_schema_minversionrealmproxy = new C4662xc0a23e3a();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_entity_schema_minversionrealmproxy;
    }

    public static MinVersion copyOrUpdate(Realm realm, MinVersionColumnInfo minVersionColumnInfo, MinVersion minVersion, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (minVersion instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) minVersion;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return minVersion;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(minVersion);
        if (realmObjectProxy2 != null) {
            return (MinVersion) realmObjectProxy2;
        }
        return copy(realm, minVersionColumnInfo, minVersion, z, map, set);
    }

    public static MinVersion copy(Realm realm, MinVersionColumnInfo minVersionColumnInfo, MinVersion minVersion, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(minVersion);
        if (realmObjectProxy != null) {
            return (MinVersion) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(MinVersion.class), minVersionColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(minVersionColumnInfo.androidIndex, minVersion.realmGet$android());
        C4662xc0a23e3a newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(minVersion, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, MinVersion minVersion, Map<RealmModel, Long> map) {
        if (minVersion instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) minVersion;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(MinVersion.class);
        long nativePtr = table.getNativePtr();
        MinVersionColumnInfo minVersionColumnInfo = (MinVersionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) MinVersion.class);
        long createRow = OsObject.createRow(table);
        map.put(minVersion, Long.valueOf(createRow));
        Long realmGet$android = minVersion.realmGet$android();
        if (realmGet$android != null) {
            Table.nativeSetLong(nativePtr, minVersionColumnInfo.androidIndex, createRow, realmGet$android.longValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(MinVersion.class);
        long nativePtr = table.getNativePtr();
        MinVersionColumnInfo minVersionColumnInfo = (MinVersionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) MinVersion.class);
        while (it.hasNext()) {
            MinVersion minVersion = (MinVersion) it.next();
            if (!map.containsKey(minVersion)) {
                if (minVersion instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) minVersion;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(minVersion, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(minVersion, Long.valueOf(createRow));
                Long realmGet$android = minVersion.realmGet$android();
                if (realmGet$android != null) {
                    Table.nativeSetLong(nativePtr, minVersionColumnInfo.androidIndex, createRow, realmGet$android.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, MinVersion minVersion, Map<RealmModel, Long> map) {
        if (minVersion instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) minVersion;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(MinVersion.class);
        long nativePtr = table.getNativePtr();
        MinVersionColumnInfo minVersionColumnInfo = (MinVersionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) MinVersion.class);
        long createRow = OsObject.createRow(table);
        map.put(minVersion, Long.valueOf(createRow));
        Long realmGet$android = minVersion.realmGet$android();
        if (realmGet$android != null) {
            Table.nativeSetLong(nativePtr, minVersionColumnInfo.androidIndex, createRow, realmGet$android.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, minVersionColumnInfo.androidIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(MinVersion.class);
        long nativePtr = table.getNativePtr();
        MinVersionColumnInfo minVersionColumnInfo = (MinVersionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) MinVersion.class);
        while (it.hasNext()) {
            MinVersion minVersion = (MinVersion) it.next();
            if (!map.containsKey(minVersion)) {
                if (minVersion instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) minVersion;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(minVersion, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(minVersion, Long.valueOf(createRow));
                Long realmGet$android = minVersion.realmGet$android();
                if (realmGet$android != null) {
                    Table.nativeSetLong(nativePtr, minVersionColumnInfo.androidIndex, createRow, realmGet$android.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, minVersionColumnInfo.androidIndex, createRow, false);
                }
            }
        }
    }

    public static MinVersion createDetachedCopy(MinVersion minVersion, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        MinVersion minVersion2;
        if (i > i2 || minVersion == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(minVersion);
        if (cacheData == null) {
            minVersion2 = new MinVersion();
            map.put(minVersion, new RealmObjectProxy.CacheData(i, minVersion2));
        } else if (i >= cacheData.minDepth) {
            return (MinVersion) cacheData.object;
        } else {
            cacheData.minDepth = i;
            minVersion2 = (MinVersion) cacheData.object;
        }
        minVersion2.realmSet$android(minVersion.realmGet$android());
        return minVersion2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("MinVersion = proxy[");
        sb.append("{android:");
        sb.append(realmGet$android() != null ? realmGet$android() : "null");
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
        C4662xc0a23e3a ru_unicorn_ujin_view_activity_navigation_entity_schema_minversionrealmproxy = (C4662xc0a23e3a) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_entity_schema_minversionrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_entity_schema_minversionrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_entity_schema_minversionrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
