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
import p035ru.unicorn.ujin.data.realm.AcceptanceDate;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy */
public class ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy extends AcceptanceDate implements RealmObjectProxy, ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private AcceptanceDateColumnInfo columnInfo;
    private ProxyState<AcceptanceDate> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "AcceptanceDate";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy$AcceptanceDateColumnInfo */
    static final class AcceptanceDateColumnInfo extends ColumnInfo {
        long dateIndex;
        long maxColumnIndexValue;

        AcceptanceDateColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.dateIndex = addColumnDetails("date", "date", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        AcceptanceDateColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new AcceptanceDateColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            AcceptanceDateColumnInfo acceptanceDateColumnInfo = (AcceptanceDateColumnInfo) columnInfo;
            AcceptanceDateColumnInfo acceptanceDateColumnInfo2 = (AcceptanceDateColumnInfo) columnInfo2;
            acceptanceDateColumnInfo2.dateIndex = acceptanceDateColumnInfo.dateIndex;
            acceptanceDateColumnInfo2.maxColumnIndexValue = acceptanceDateColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (AcceptanceDateColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Long realmGet$date() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.dateIndex)) {
            return null;
        }
        return Long.valueOf(this.proxyState.getRow$realm().getLong(this.columnInfo.dateIndex));
    }

    public void realmSet$date(Long l) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (l == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.dateIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.dateIndex, l.longValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (l == null) {
                row$realm.getTable().setNull(this.columnInfo.dateIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.dateIndex, row$realm.getIndex(), l.longValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedProperty("date", RealmFieldType.INTEGER, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static AcceptanceDateColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new AcceptanceDateColumnInfo(osSchemaInfo);
    }

    public static AcceptanceDate createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        AcceptanceDate acceptanceDate = (AcceptanceDate) realm.createObjectInternal(AcceptanceDate.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxyInterface ru_unicorn_ujin_data_realm_acceptancedaterealmproxyinterface = acceptanceDate;
        if (jSONObject.has("date")) {
            if (jSONObject.isNull("date")) {
                ru_unicorn_ujin_data_realm_acceptancedaterealmproxyinterface.realmSet$date((Long) null);
            } else {
                ru_unicorn_ujin_data_realm_acceptancedaterealmproxyinterface.realmSet$date(Long.valueOf(jSONObject.getLong("date")));
            }
        }
        return acceptanceDate;
    }

    public static AcceptanceDate createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        AcceptanceDate acceptanceDate = new AcceptanceDate();
        ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxyInterface ru_unicorn_ujin_data_realm_acceptancedaterealmproxyinterface = acceptanceDate;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("date")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_acceptancedaterealmproxyinterface.realmSet$date(Long.valueOf(jsonReader.nextLong()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_acceptancedaterealmproxyinterface.realmSet$date((Long) null);
            }
        }
        jsonReader.endObject();
        return (AcceptanceDate) realm.copyToRealm(acceptanceDate, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) AcceptanceDate.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy ru_unicorn_ujin_data_realm_acceptancedaterealmproxy = new ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_acceptancedaterealmproxy;
    }

    public static AcceptanceDate copyOrUpdate(Realm realm, AcceptanceDateColumnInfo acceptanceDateColumnInfo, AcceptanceDate acceptanceDate, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (acceptanceDate instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) acceptanceDate;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return acceptanceDate;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(acceptanceDate);
        if (realmObjectProxy2 != null) {
            return (AcceptanceDate) realmObjectProxy2;
        }
        return copy(realm, acceptanceDateColumnInfo, acceptanceDate, z, map, set);
    }

    public static AcceptanceDate copy(Realm realm, AcceptanceDateColumnInfo acceptanceDateColumnInfo, AcceptanceDate acceptanceDate, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(acceptanceDate);
        if (realmObjectProxy != null) {
            return (AcceptanceDate) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(AcceptanceDate.class), acceptanceDateColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(acceptanceDateColumnInfo.dateIndex, acceptanceDate.realmGet$date());
        ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(acceptanceDate, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, AcceptanceDate acceptanceDate, Map<RealmModel, Long> map) {
        if (acceptanceDate instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) acceptanceDate;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(AcceptanceDate.class);
        long nativePtr = table.getNativePtr();
        AcceptanceDateColumnInfo acceptanceDateColumnInfo = (AcceptanceDateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AcceptanceDate.class);
        long createRow = OsObject.createRow(table);
        map.put(acceptanceDate, Long.valueOf(createRow));
        Long realmGet$date = acceptanceDate.realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetLong(nativePtr, acceptanceDateColumnInfo.dateIndex, createRow, realmGet$date.longValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(AcceptanceDate.class);
        long nativePtr = table.getNativePtr();
        AcceptanceDateColumnInfo acceptanceDateColumnInfo = (AcceptanceDateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AcceptanceDate.class);
        while (it.hasNext()) {
            AcceptanceDate acceptanceDate = (AcceptanceDate) it.next();
            if (!map.containsKey(acceptanceDate)) {
                if (acceptanceDate instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) acceptanceDate;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(acceptanceDate, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(acceptanceDate, Long.valueOf(createRow));
                Long realmGet$date = acceptanceDate.realmGet$date();
                if (realmGet$date != null) {
                    Table.nativeSetLong(nativePtr, acceptanceDateColumnInfo.dateIndex, createRow, realmGet$date.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, AcceptanceDate acceptanceDate, Map<RealmModel, Long> map) {
        if (acceptanceDate instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) acceptanceDate;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(AcceptanceDate.class);
        long nativePtr = table.getNativePtr();
        AcceptanceDateColumnInfo acceptanceDateColumnInfo = (AcceptanceDateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AcceptanceDate.class);
        long createRow = OsObject.createRow(table);
        map.put(acceptanceDate, Long.valueOf(createRow));
        Long realmGet$date = acceptanceDate.realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetLong(nativePtr, acceptanceDateColumnInfo.dateIndex, createRow, realmGet$date.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, acceptanceDateColumnInfo.dateIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(AcceptanceDate.class);
        long nativePtr = table.getNativePtr();
        AcceptanceDateColumnInfo acceptanceDateColumnInfo = (AcceptanceDateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AcceptanceDate.class);
        while (it.hasNext()) {
            AcceptanceDate acceptanceDate = (AcceptanceDate) it.next();
            if (!map.containsKey(acceptanceDate)) {
                if (acceptanceDate instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) acceptanceDate;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(acceptanceDate, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(acceptanceDate, Long.valueOf(createRow));
                Long realmGet$date = acceptanceDate.realmGet$date();
                if (realmGet$date != null) {
                    Table.nativeSetLong(nativePtr, acceptanceDateColumnInfo.dateIndex, createRow, realmGet$date.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, acceptanceDateColumnInfo.dateIndex, createRow, false);
                }
            }
        }
    }

    public static AcceptanceDate createDetachedCopy(AcceptanceDate acceptanceDate, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        AcceptanceDate acceptanceDate2;
        if (i > i2 || acceptanceDate == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(acceptanceDate);
        if (cacheData == null) {
            acceptanceDate2 = new AcceptanceDate();
            map.put(acceptanceDate, new RealmObjectProxy.CacheData(i, acceptanceDate2));
        } else if (i >= cacheData.minDepth) {
            return (AcceptanceDate) cacheData.object;
        } else {
            cacheData.minDepth = i;
            acceptanceDate2 = (AcceptanceDate) cacheData.object;
        }
        acceptanceDate2.realmSet$date(acceptanceDate.realmGet$date());
        return acceptanceDate2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("AcceptanceDate = proxy[");
        sb.append("{date:");
        sb.append(realmGet$date() != null ? realmGet$date() : "null");
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
        ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy ru_unicorn_ujin_data_realm_acceptancedaterealmproxy = (ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_acceptancedaterealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_acceptancedaterealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_acceptancedaterealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
