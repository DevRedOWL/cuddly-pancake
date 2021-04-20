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
import p035ru.unicorn.ujin.data.realm.UnreadBadge;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy */
public class ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy extends UnreadBadge implements RealmObjectProxy, ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private UnreadBadgeColumnInfo columnInfo;
    private ProxyState<UnreadBadge> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "UnreadBadge";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy$UnreadBadgeColumnInfo */
    static final class UnreadBadgeColumnInfo extends ColumnInfo {
        long hasUnreadIndex;
        long maxColumnIndexValue;

        UnreadBadgeColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.hasUnreadIndex = addColumnDetails("hasUnread", "hasUnread", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        UnreadBadgeColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new UnreadBadgeColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            UnreadBadgeColumnInfo unreadBadgeColumnInfo = (UnreadBadgeColumnInfo) columnInfo;
            UnreadBadgeColumnInfo unreadBadgeColumnInfo2 = (UnreadBadgeColumnInfo) columnInfo2;
            unreadBadgeColumnInfo2.hasUnreadIndex = unreadBadgeColumnInfo.hasUnreadIndex;
            unreadBadgeColumnInfo2.maxColumnIndexValue = unreadBadgeColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (UnreadBadgeColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public boolean realmGet$hasUnread() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.hasUnreadIndex);
    }

    public void realmSet$hasUnread(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.hasUnreadIndex, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.hasUnreadIndex, row$realm.getIndex(), z, true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedProperty("hasUnread", RealmFieldType.BOOLEAN, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UnreadBadgeColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new UnreadBadgeColumnInfo(osSchemaInfo);
    }

    public static UnreadBadge createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        UnreadBadge unreadBadge = (UnreadBadge) realm.createObjectInternal(UnreadBadge.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxyInterface ru_unicorn_ujin_data_realm_unreadbadgerealmproxyinterface = unreadBadge;
        if (jSONObject.has("hasUnread")) {
            if (!jSONObject.isNull("hasUnread")) {
                ru_unicorn_ujin_data_realm_unreadbadgerealmproxyinterface.realmSet$hasUnread(jSONObject.getBoolean("hasUnread"));
            } else {
                throw new IllegalArgumentException("Trying to set non-nullable field 'hasUnread' to null.");
            }
        }
        return unreadBadge;
    }

    public static UnreadBadge createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        UnreadBadge unreadBadge = new UnreadBadge();
        ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxyInterface ru_unicorn_ujin_data_realm_unreadbadgerealmproxyinterface = unreadBadge;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("hasUnread")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_unreadbadgerealmproxyinterface.realmSet$hasUnread(jsonReader.nextBoolean());
            } else {
                jsonReader.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field 'hasUnread' to null.");
            }
        }
        jsonReader.endObject();
        return (UnreadBadge) realm.copyToRealm(unreadBadge, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) UnreadBadge.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy ru_unicorn_ujin_data_realm_unreadbadgerealmproxy = new ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_unreadbadgerealmproxy;
    }

    public static UnreadBadge copyOrUpdate(Realm realm, UnreadBadgeColumnInfo unreadBadgeColumnInfo, UnreadBadge unreadBadge, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (unreadBadge instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) unreadBadge;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return unreadBadge;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(unreadBadge);
        if (realmObjectProxy2 != null) {
            return (UnreadBadge) realmObjectProxy2;
        }
        return copy(realm, unreadBadgeColumnInfo, unreadBadge, z, map, set);
    }

    public static UnreadBadge copy(Realm realm, UnreadBadgeColumnInfo unreadBadgeColumnInfo, UnreadBadge unreadBadge, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(unreadBadge);
        if (realmObjectProxy != null) {
            return (UnreadBadge) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(UnreadBadge.class), unreadBadgeColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addBoolean(unreadBadgeColumnInfo.hasUnreadIndex, Boolean.valueOf(unreadBadge.realmGet$hasUnread()));
        ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(unreadBadge, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, UnreadBadge unreadBadge, Map<RealmModel, Long> map) {
        if (unreadBadge instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) unreadBadge;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(UnreadBadge.class);
        long nativePtr = table.getNativePtr();
        long createRow = OsObject.createRow(table);
        map.put(unreadBadge, Long.valueOf(createRow));
        Table.nativeSetBoolean(nativePtr, ((UnreadBadgeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UnreadBadge.class)).hasUnreadIndex, createRow, unreadBadge.realmGet$hasUnread(), false);
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(UnreadBadge.class);
        long nativePtr = table.getNativePtr();
        UnreadBadgeColumnInfo unreadBadgeColumnInfo = (UnreadBadgeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UnreadBadge.class);
        while (it.hasNext()) {
            UnreadBadge unreadBadge = (UnreadBadge) it.next();
            if (!map.containsKey(unreadBadge)) {
                if (unreadBadge instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) unreadBadge;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(unreadBadge, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(unreadBadge, Long.valueOf(createRow));
                Table.nativeSetBoolean(nativePtr, unreadBadgeColumnInfo.hasUnreadIndex, createRow, unreadBadge.realmGet$hasUnread(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, UnreadBadge unreadBadge, Map<RealmModel, Long> map) {
        if (unreadBadge instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) unreadBadge;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(UnreadBadge.class);
        long nativePtr = table.getNativePtr();
        long createRow = OsObject.createRow(table);
        map.put(unreadBadge, Long.valueOf(createRow));
        Table.nativeSetBoolean(nativePtr, ((UnreadBadgeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UnreadBadge.class)).hasUnreadIndex, createRow, unreadBadge.realmGet$hasUnread(), false);
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(UnreadBadge.class);
        long nativePtr = table.getNativePtr();
        UnreadBadgeColumnInfo unreadBadgeColumnInfo = (UnreadBadgeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UnreadBadge.class);
        while (it.hasNext()) {
            UnreadBadge unreadBadge = (UnreadBadge) it.next();
            if (!map.containsKey(unreadBadge)) {
                if (unreadBadge instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) unreadBadge;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(unreadBadge, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(unreadBadge, Long.valueOf(createRow));
                Table.nativeSetBoolean(nativePtr, unreadBadgeColumnInfo.hasUnreadIndex, createRow, unreadBadge.realmGet$hasUnread(), false);
            }
        }
    }

    public static UnreadBadge createDetachedCopy(UnreadBadge unreadBadge, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        UnreadBadge unreadBadge2;
        if (i > i2 || unreadBadge == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(unreadBadge);
        if (cacheData == null) {
            unreadBadge2 = new UnreadBadge();
            map.put(unreadBadge, new RealmObjectProxy.CacheData(i, unreadBadge2));
        } else if (i >= cacheData.minDepth) {
            return (UnreadBadge) cacheData.object;
        } else {
            cacheData.minDepth = i;
            unreadBadge2 = (UnreadBadge) cacheData.object;
        }
        unreadBadge2.realmSet$hasUnread(unreadBadge.realmGet$hasUnread());
        return unreadBadge2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "UnreadBadge = proxy[" + "{hasUnread:" + realmGet$hasUnread() + "}" + "]";
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
        ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy ru_unicorn_ujin_data_realm_unreadbadgerealmproxy = (ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_unreadbadgerealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_unreadbadgerealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_unreadbadgerealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
