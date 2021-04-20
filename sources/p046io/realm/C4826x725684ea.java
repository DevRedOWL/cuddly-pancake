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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ToUser;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_ToUserRealmProxy */
public class C4826x725684ea extends ToUser implements RealmObjectProxy, C4827x8d46ef6f {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ToUserColumnInfo columnInfo;
    private ProxyState<ToUser> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_ToUserRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ToUser";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_ToUserRealmProxy$ToUserColumnInfo */
    static final class ToUserColumnInfo extends ColumnInfo {
        long fullnameIndex;
        long maxColumnIndexValue;

        ToUserColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.fullnameIndex = addColumnDetails(UserProfile.Fields.fullname, UserProfile.Fields.fullname, objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ToUserColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ToUserColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ToUserColumnInfo toUserColumnInfo = (ToUserColumnInfo) columnInfo;
            ToUserColumnInfo toUserColumnInfo2 = (ToUserColumnInfo) columnInfo2;
            toUserColumnInfo2.fullnameIndex = toUserColumnInfo.fullnameIndex;
            toUserColumnInfo2.maxColumnIndexValue = toUserColumnInfo.maxColumnIndexValue;
        }
    }

    C4826x725684ea() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ToUserColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$fullname() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.fullnameIndex);
    }

    public void realmSet$fullname(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.fullnameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.fullnameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.fullnameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.fullnameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedProperty(UserProfile.Fields.fullname, RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ToUserColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ToUserColumnInfo(osSchemaInfo);
    }

    public static ToUser createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ToUser toUser = (ToUser) realm.createObjectInternal(ToUser.class, true, Collections.emptyList());
        C4827x8d46ef6f ru_unicorn_ujin_view_fragments_makearecord_model_touserrealmproxyinterface = toUser;
        if (jSONObject.has(UserProfile.Fields.fullname)) {
            if (jSONObject.isNull(UserProfile.Fields.fullname)) {
                ru_unicorn_ujin_view_fragments_makearecord_model_touserrealmproxyinterface.realmSet$fullname((String) null);
            } else {
                ru_unicorn_ujin_view_fragments_makearecord_model_touserrealmproxyinterface.realmSet$fullname(jSONObject.getString(UserProfile.Fields.fullname));
            }
        }
        return toUser;
    }

    public static ToUser createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ToUser toUser = new ToUser();
        C4827x8d46ef6f ru_unicorn_ujin_view_fragments_makearecord_model_touserrealmproxyinterface = toUser;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals(UserProfile.Fields.fullname)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_fragments_makearecord_model_touserrealmproxyinterface.realmSet$fullname(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_fragments_makearecord_model_touserrealmproxyinterface.realmSet$fullname((String) null);
            }
        }
        jsonReader.endObject();
        return (ToUser) realm.copyToRealm(toUser, new ImportFlag[0]);
    }

    private static C4826x725684ea newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ToUser.class), false, Collections.emptyList());
        C4826x725684ea ru_unicorn_ujin_view_fragments_makearecord_model_touserrealmproxy = new C4826x725684ea();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_fragments_makearecord_model_touserrealmproxy;
    }

    public static ToUser copyOrUpdate(Realm realm, ToUserColumnInfo toUserColumnInfo, ToUser toUser, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (toUser instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) toUser;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return toUser;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(toUser);
        if (realmObjectProxy2 != null) {
            return (ToUser) realmObjectProxy2;
        }
        return copy(realm, toUserColumnInfo, toUser, z, map, set);
    }

    public static ToUser copy(Realm realm, ToUserColumnInfo toUserColumnInfo, ToUser toUser, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(toUser);
        if (realmObjectProxy != null) {
            return (ToUser) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ToUser.class), toUserColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(toUserColumnInfo.fullnameIndex, toUser.realmGet$fullname());
        C4826x725684ea newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(toUser, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, ToUser toUser, Map<RealmModel, Long> map) {
        if (toUser instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) toUser;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ToUser.class);
        long nativePtr = table.getNativePtr();
        ToUserColumnInfo toUserColumnInfo = (ToUserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ToUser.class);
        long createRow = OsObject.createRow(table);
        map.put(toUser, Long.valueOf(createRow));
        String realmGet$fullname = toUser.realmGet$fullname();
        if (realmGet$fullname != null) {
            Table.nativeSetString(nativePtr, toUserColumnInfo.fullnameIndex, createRow, realmGet$fullname, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(ToUser.class);
        long nativePtr = table.getNativePtr();
        ToUserColumnInfo toUserColumnInfo = (ToUserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ToUser.class);
        while (it.hasNext()) {
            ToUser toUser = (ToUser) it.next();
            if (!map.containsKey(toUser)) {
                if (toUser instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) toUser;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(toUser, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(toUser, Long.valueOf(createRow));
                String realmGet$fullname = toUser.realmGet$fullname();
                if (realmGet$fullname != null) {
                    Table.nativeSetString(nativePtr, toUserColumnInfo.fullnameIndex, createRow, realmGet$fullname, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ToUser toUser, Map<RealmModel, Long> map) {
        if (toUser instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) toUser;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ToUser.class);
        long nativePtr = table.getNativePtr();
        ToUserColumnInfo toUserColumnInfo = (ToUserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ToUser.class);
        long createRow = OsObject.createRow(table);
        map.put(toUser, Long.valueOf(createRow));
        String realmGet$fullname = toUser.realmGet$fullname();
        if (realmGet$fullname != null) {
            Table.nativeSetString(nativePtr, toUserColumnInfo.fullnameIndex, createRow, realmGet$fullname, false);
        } else {
            Table.nativeSetNull(nativePtr, toUserColumnInfo.fullnameIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(ToUser.class);
        long nativePtr = table.getNativePtr();
        ToUserColumnInfo toUserColumnInfo = (ToUserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ToUser.class);
        while (it.hasNext()) {
            ToUser toUser = (ToUser) it.next();
            if (!map.containsKey(toUser)) {
                if (toUser instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) toUser;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(toUser, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(toUser, Long.valueOf(createRow));
                String realmGet$fullname = toUser.realmGet$fullname();
                if (realmGet$fullname != null) {
                    Table.nativeSetString(nativePtr, toUserColumnInfo.fullnameIndex, createRow, realmGet$fullname, false);
                } else {
                    Table.nativeSetNull(nativePtr, toUserColumnInfo.fullnameIndex, createRow, false);
                }
            }
        }
    }

    public static ToUser createDetachedCopy(ToUser toUser, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ToUser toUser2;
        if (i > i2 || toUser == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(toUser);
        if (cacheData == null) {
            toUser2 = new ToUser();
            map.put(toUser, new RealmObjectProxy.CacheData(i, toUser2));
        } else if (i >= cacheData.minDepth) {
            return (ToUser) cacheData.object;
        } else {
            cacheData.minDepth = i;
            toUser2 = (ToUser) cacheData.object;
        }
        toUser2.realmSet$fullname(toUser.realmGet$fullname());
        return toUser2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ToUser = proxy[");
        sb.append("{fullname:");
        sb.append(realmGet$fullname() != null ? realmGet$fullname() : "null");
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
        C4826x725684ea ru_unicorn_ujin_view_fragments_makearecord_model_touserrealmproxy = (C4826x725684ea) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_fragments_makearecord_model_touserrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_fragments_makearecord_model_touserrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_fragments_makearecord_model_touserrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
