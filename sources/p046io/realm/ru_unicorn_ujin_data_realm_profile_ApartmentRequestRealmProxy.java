package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.realm.profile.ApartmentRequest;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy */
public class ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy extends ApartmentRequest implements RealmObjectProxy, C4629x56ee5624 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ApartmentRequestColumnInfo columnInfo;
    private ProxyState<ApartmentRequest> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ApartmentRequest";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy$ApartmentRequestColumnInfo */
    static final class ApartmentRequestColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long statusIndex;

        ApartmentRequestColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.statusIndex = addColumnDetails(NotificationCompat.CATEGORY_STATUS, NotificationCompat.CATEGORY_STATUS, objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ApartmentRequestColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ApartmentRequestColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ApartmentRequestColumnInfo apartmentRequestColumnInfo = (ApartmentRequestColumnInfo) columnInfo;
            ApartmentRequestColumnInfo apartmentRequestColumnInfo2 = (ApartmentRequestColumnInfo) columnInfo2;
            apartmentRequestColumnInfo2.statusIndex = apartmentRequestColumnInfo.statusIndex;
            apartmentRequestColumnInfo2.maxColumnIndexValue = apartmentRequestColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ApartmentRequestColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$status() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.statusIndex);
    }

    public void realmSet$status(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.statusIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.statusIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.statusIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.statusIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedProperty(NotificationCompat.CATEGORY_STATUS, RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ApartmentRequestColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ApartmentRequestColumnInfo(osSchemaInfo);
    }

    public static ApartmentRequest createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ApartmentRequest apartmentRequest = (ApartmentRequest) realm.createObjectInternal(ApartmentRequest.class, true, Collections.emptyList());
        C4629x56ee5624 ru_unicorn_ujin_data_realm_profile_apartmentrequestrealmproxyinterface = apartmentRequest;
        if (jSONObject.has(NotificationCompat.CATEGORY_STATUS)) {
            if (jSONObject.isNull(NotificationCompat.CATEGORY_STATUS)) {
                ru_unicorn_ujin_data_realm_profile_apartmentrequestrealmproxyinterface.realmSet$status((String) null);
            } else {
                ru_unicorn_ujin_data_realm_profile_apartmentrequestrealmproxyinterface.realmSet$status(jSONObject.getString(NotificationCompat.CATEGORY_STATUS));
            }
        }
        return apartmentRequest;
    }

    public static ApartmentRequest createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ApartmentRequest apartmentRequest = new ApartmentRequest();
        C4629x56ee5624 ru_unicorn_ujin_data_realm_profile_apartmentrequestrealmproxyinterface = apartmentRequest;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals(NotificationCompat.CATEGORY_STATUS)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_profile_apartmentrequestrealmproxyinterface.realmSet$status(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_profile_apartmentrequestrealmproxyinterface.realmSet$status((String) null);
            }
        }
        jsonReader.endObject();
        return (ApartmentRequest) realm.copyToRealm(apartmentRequest, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ApartmentRequest.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy ru_unicorn_ujin_data_realm_profile_apartmentrequestrealmproxy = new ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_profile_apartmentrequestrealmproxy;
    }

    public static ApartmentRequest copyOrUpdate(Realm realm, ApartmentRequestColumnInfo apartmentRequestColumnInfo, ApartmentRequest apartmentRequest, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (apartmentRequest instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) apartmentRequest;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return apartmentRequest;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(apartmentRequest);
        if (realmObjectProxy2 != null) {
            return (ApartmentRequest) realmObjectProxy2;
        }
        return copy(realm, apartmentRequestColumnInfo, apartmentRequest, z, map, set);
    }

    public static ApartmentRequest copy(Realm realm, ApartmentRequestColumnInfo apartmentRequestColumnInfo, ApartmentRequest apartmentRequest, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(apartmentRequest);
        if (realmObjectProxy != null) {
            return (ApartmentRequest) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ApartmentRequest.class), apartmentRequestColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(apartmentRequestColumnInfo.statusIndex, apartmentRequest.realmGet$status());
        ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(apartmentRequest, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, ApartmentRequest apartmentRequest, Map<RealmModel, Long> map) {
        if (apartmentRequest instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) apartmentRequest;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ApartmentRequest.class);
        long nativePtr = table.getNativePtr();
        ApartmentRequestColumnInfo apartmentRequestColumnInfo = (ApartmentRequestColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ApartmentRequest.class);
        long createRow = OsObject.createRow(table);
        map.put(apartmentRequest, Long.valueOf(createRow));
        String realmGet$status = apartmentRequest.realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(nativePtr, apartmentRequestColumnInfo.statusIndex, createRow, realmGet$status, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(ApartmentRequest.class);
        long nativePtr = table.getNativePtr();
        ApartmentRequestColumnInfo apartmentRequestColumnInfo = (ApartmentRequestColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ApartmentRequest.class);
        while (it.hasNext()) {
            ApartmentRequest apartmentRequest = (ApartmentRequest) it.next();
            if (!map.containsKey(apartmentRequest)) {
                if (apartmentRequest instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) apartmentRequest;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(apartmentRequest, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(apartmentRequest, Long.valueOf(createRow));
                String realmGet$status = apartmentRequest.realmGet$status();
                if (realmGet$status != null) {
                    Table.nativeSetString(nativePtr, apartmentRequestColumnInfo.statusIndex, createRow, realmGet$status, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ApartmentRequest apartmentRequest, Map<RealmModel, Long> map) {
        if (apartmentRequest instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) apartmentRequest;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ApartmentRequest.class);
        long nativePtr = table.getNativePtr();
        ApartmentRequestColumnInfo apartmentRequestColumnInfo = (ApartmentRequestColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ApartmentRequest.class);
        long createRow = OsObject.createRow(table);
        map.put(apartmentRequest, Long.valueOf(createRow));
        String realmGet$status = apartmentRequest.realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(nativePtr, apartmentRequestColumnInfo.statusIndex, createRow, realmGet$status, false);
        } else {
            Table.nativeSetNull(nativePtr, apartmentRequestColumnInfo.statusIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(ApartmentRequest.class);
        long nativePtr = table.getNativePtr();
        ApartmentRequestColumnInfo apartmentRequestColumnInfo = (ApartmentRequestColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ApartmentRequest.class);
        while (it.hasNext()) {
            ApartmentRequest apartmentRequest = (ApartmentRequest) it.next();
            if (!map.containsKey(apartmentRequest)) {
                if (apartmentRequest instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) apartmentRequest;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(apartmentRequest, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(apartmentRequest, Long.valueOf(createRow));
                String realmGet$status = apartmentRequest.realmGet$status();
                if (realmGet$status != null) {
                    Table.nativeSetString(nativePtr, apartmentRequestColumnInfo.statusIndex, createRow, realmGet$status, false);
                } else {
                    Table.nativeSetNull(nativePtr, apartmentRequestColumnInfo.statusIndex, createRow, false);
                }
            }
        }
    }

    public static ApartmentRequest createDetachedCopy(ApartmentRequest apartmentRequest, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ApartmentRequest apartmentRequest2;
        if (i > i2 || apartmentRequest == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(apartmentRequest);
        if (cacheData == null) {
            apartmentRequest2 = new ApartmentRequest();
            map.put(apartmentRequest, new RealmObjectProxy.CacheData(i, apartmentRequest2));
        } else if (i >= cacheData.minDepth) {
            return (ApartmentRequest) cacheData.object;
        } else {
            cacheData.minDepth = i;
            apartmentRequest2 = (ApartmentRequest) cacheData.object;
        }
        apartmentRequest2.realmSet$status(apartmentRequest.realmGet$status());
        return apartmentRequest2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ApartmentRequest = proxy[");
        sb.append("{status:");
        sb.append(realmGet$status() != null ? realmGet$status() : "null");
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
        ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy ru_unicorn_ujin_data_realm_profile_apartmentrequestrealmproxy = (ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_profile_apartmentrequestrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_profile_apartmentrequestrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_profile_apartmentrequestrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
