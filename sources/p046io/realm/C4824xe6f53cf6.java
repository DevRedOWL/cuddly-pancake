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
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Status;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_StatusRealmProxy */
public class C4824xe6f53cf6 extends Status implements RealmObjectProxy, C4825xa72884e3 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private StatusColumnInfo columnInfo;
    private ProxyState<Status> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_StatusRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Status";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_StatusRealmProxy$StatusColumnInfo */
    static final class StatusColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long slugIndex;
        long titleIndex;

        StatusColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.slugIndex = addColumnDetails("slug", "slug", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        StatusColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new StatusColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            StatusColumnInfo statusColumnInfo = (StatusColumnInfo) columnInfo;
            StatusColumnInfo statusColumnInfo2 = (StatusColumnInfo) columnInfo2;
            statusColumnInfo2.titleIndex = statusColumnInfo.titleIndex;
            statusColumnInfo2.slugIndex = statusColumnInfo.slugIndex;
            statusColumnInfo2.maxColumnIndexValue = statusColumnInfo.maxColumnIndexValue;
        }
    }

    C4824xe6f53cf6() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (StatusColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
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

    public String realmGet$slug() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.slugIndex);
    }

    public void realmSet$slug(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.slugIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.slugIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.slugIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.slugIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("slug", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static StatusColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new StatusColumnInfo(osSchemaInfo);
    }

    public static Status createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        Status status = (Status) realm.createObjectInternal(Status.class, true, Collections.emptyList());
        C4825xa72884e3 ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface = status;
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("slug")) {
            if (jSONObject.isNull("slug")) {
                ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface.realmSet$slug((String) null);
            } else {
                ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface.realmSet$slug(jSONObject.getString("slug"));
            }
        }
        return status;
    }

    public static Status createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Status status = new Status();
        C4825xa72884e3 ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface = status;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (!nextName.equals("slug")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface.realmSet$slug(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface.realmSet$slug((String) null);
            }
        }
        jsonReader.endObject();
        return (Status) realm.copyToRealm(status, new ImportFlag[0]);
    }

    private static C4824xe6f53cf6 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Status.class), false, Collections.emptyList());
        C4824xe6f53cf6 ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxy = new C4824xe6f53cf6();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxy;
    }

    public static Status copyOrUpdate(Realm realm, StatusColumnInfo statusColumnInfo, Status status, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (status instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) status;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return status;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(status);
        if (realmObjectProxy2 != null) {
            return (Status) realmObjectProxy2;
        }
        return copy(realm, statusColumnInfo, status, z, map, set);
    }

    public static Status copy(Realm realm, StatusColumnInfo statusColumnInfo, Status status, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(status);
        if (realmObjectProxy != null) {
            return (Status) realmObjectProxy;
        }
        C4825xa72884e3 ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface = status;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Status.class), statusColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(statusColumnInfo.titleIndex, ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(statusColumnInfo.slugIndex, ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface.realmGet$slug());
        C4824xe6f53cf6 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(status, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Status status, Map<RealmModel, Long> map) {
        if (status instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) status;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Status.class);
        long nativePtr = table.getNativePtr();
        StatusColumnInfo statusColumnInfo = (StatusColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Status.class);
        long createRow = OsObject.createRow(table);
        map.put(status, Long.valueOf(createRow));
        C4825xa72884e3 ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface = status;
        String realmGet$title = ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, statusColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        String realmGet$slug = ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface.realmGet$slug();
        if (realmGet$slug != null) {
            Table.nativeSetString(nativePtr, statusColumnInfo.slugIndex, createRow, realmGet$slug, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Status.class);
        long nativePtr = table.getNativePtr();
        StatusColumnInfo statusColumnInfo = (StatusColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Status.class);
        while (it.hasNext()) {
            Status status = (Status) it.next();
            if (!map2.containsKey(status)) {
                if (status instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) status;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(status, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(status, Long.valueOf(createRow));
                C4825xa72884e3 ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface = status;
                String realmGet$title = ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, statusColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
                String realmGet$slug = ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface.realmGet$slug();
                if (realmGet$slug != null) {
                    Table.nativeSetString(nativePtr, statusColumnInfo.slugIndex, createRow, realmGet$slug, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Status status, Map<RealmModel, Long> map) {
        if (status instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) status;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Status.class);
        long nativePtr = table.getNativePtr();
        StatusColumnInfo statusColumnInfo = (StatusColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Status.class);
        long createRow = OsObject.createRow(table);
        map.put(status, Long.valueOf(createRow));
        C4825xa72884e3 ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface = status;
        String realmGet$title = ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, statusColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, statusColumnInfo.titleIndex, createRow, false);
        }
        String realmGet$slug = ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface.realmGet$slug();
        if (realmGet$slug != null) {
            Table.nativeSetString(nativePtr, statusColumnInfo.slugIndex, createRow, realmGet$slug, false);
        } else {
            Table.nativeSetNull(nativePtr, statusColumnInfo.slugIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Status.class);
        long nativePtr = table.getNativePtr();
        StatusColumnInfo statusColumnInfo = (StatusColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Status.class);
        while (it.hasNext()) {
            Status status = (Status) it.next();
            if (!map2.containsKey(status)) {
                if (status instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) status;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(status, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(status, Long.valueOf(createRow));
                C4825xa72884e3 ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface = status;
                String realmGet$title = ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, statusColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, statusColumnInfo.titleIndex, createRow, false);
                }
                String realmGet$slug = ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface.realmGet$slug();
                if (realmGet$slug != null) {
                    Table.nativeSetString(nativePtr, statusColumnInfo.slugIndex, createRow, realmGet$slug, false);
                } else {
                    Table.nativeSetNull(nativePtr, statusColumnInfo.slugIndex, createRow, false);
                }
            }
        }
    }

    public static Status createDetachedCopy(Status status, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Status status2;
        if (i > i2 || status == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(status);
        if (cacheData == null) {
            status2 = new Status();
            map.put(status, new RealmObjectProxy.CacheData(i, status2));
        } else if (i >= cacheData.minDepth) {
            return (Status) cacheData.object;
        } else {
            cacheData.minDepth = i;
            status2 = (Status) cacheData.object;
        }
        C4825xa72884e3 ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface = status2;
        C4825xa72884e3 ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface2 = status;
        ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface.realmSet$slug(ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxyinterface2.realmGet$slug());
        return status2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Status = proxy[");
        sb.append("{title:");
        String str = "null";
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{slug:");
        if (realmGet$slug() != null) {
            str = realmGet$slug();
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
        C4824xe6f53cf6 ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxy = (C4824xe6f53cf6) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_fragments_makearecord_model_statusrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
