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
import p035ru.unicorn.ujin.view.fragments.makearecord.model.FromUser;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_FromUserRealmProxy */
public class C4822xab1ed299 extends FromUser implements RealmObjectProxy, C4823xcab996a0 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private FromUserColumnInfo columnInfo;
    private ProxyState<FromUser> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_FromUserRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "FromUser";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_FromUserRealmProxy$FromUserColumnInfo */
    static final class FromUserColumnInfo extends ColumnInfo {
        long fullnameIndex;
        long maxColumnIndexValue;

        FromUserColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.fullnameIndex = addColumnDetails(UserProfile.Fields.fullname, UserProfile.Fields.fullname, objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        FromUserColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new FromUserColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            FromUserColumnInfo fromUserColumnInfo = (FromUserColumnInfo) columnInfo;
            FromUserColumnInfo fromUserColumnInfo2 = (FromUserColumnInfo) columnInfo2;
            fromUserColumnInfo2.fullnameIndex = fromUserColumnInfo.fullnameIndex;
            fromUserColumnInfo2.maxColumnIndexValue = fromUserColumnInfo.maxColumnIndexValue;
        }
    }

    C4822xab1ed299() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (FromUserColumnInfo) realmObjectContext.getColumnInfo();
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

    public static FromUserColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new FromUserColumnInfo(osSchemaInfo);
    }

    public static FromUser createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        FromUser fromUser = (FromUser) realm.createObjectInternal(FromUser.class, true, Collections.emptyList());
        C4823xcab996a0 ru_unicorn_ujin_view_fragments_makearecord_model_fromuserrealmproxyinterface = fromUser;
        if (jSONObject.has(UserProfile.Fields.fullname)) {
            if (jSONObject.isNull(UserProfile.Fields.fullname)) {
                ru_unicorn_ujin_view_fragments_makearecord_model_fromuserrealmproxyinterface.realmSet$fullname((String) null);
            } else {
                ru_unicorn_ujin_view_fragments_makearecord_model_fromuserrealmproxyinterface.realmSet$fullname(jSONObject.getString(UserProfile.Fields.fullname));
            }
        }
        return fromUser;
    }

    public static FromUser createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        FromUser fromUser = new FromUser();
        C4823xcab996a0 ru_unicorn_ujin_view_fragments_makearecord_model_fromuserrealmproxyinterface = fromUser;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals(UserProfile.Fields.fullname)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_fragments_makearecord_model_fromuserrealmproxyinterface.realmSet$fullname(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_fragments_makearecord_model_fromuserrealmproxyinterface.realmSet$fullname((String) null);
            }
        }
        jsonReader.endObject();
        return (FromUser) realm.copyToRealm(fromUser, new ImportFlag[0]);
    }

    private static C4822xab1ed299 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) FromUser.class), false, Collections.emptyList());
        C4822xab1ed299 ru_unicorn_ujin_view_fragments_makearecord_model_fromuserrealmproxy = new C4822xab1ed299();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_fragments_makearecord_model_fromuserrealmproxy;
    }

    public static FromUser copyOrUpdate(Realm realm, FromUserColumnInfo fromUserColumnInfo, FromUser fromUser, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (fromUser instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) fromUser;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return fromUser;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(fromUser);
        if (realmObjectProxy2 != null) {
            return (FromUser) realmObjectProxy2;
        }
        return copy(realm, fromUserColumnInfo, fromUser, z, map, set);
    }

    public static FromUser copy(Realm realm, FromUserColumnInfo fromUserColumnInfo, FromUser fromUser, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(fromUser);
        if (realmObjectProxy != null) {
            return (FromUser) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(FromUser.class), fromUserColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(fromUserColumnInfo.fullnameIndex, fromUser.realmGet$fullname());
        C4822xab1ed299 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(fromUser, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, FromUser fromUser, Map<RealmModel, Long> map) {
        if (fromUser instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) fromUser;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(FromUser.class);
        long nativePtr = table.getNativePtr();
        FromUserColumnInfo fromUserColumnInfo = (FromUserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FromUser.class);
        long createRow = OsObject.createRow(table);
        map.put(fromUser, Long.valueOf(createRow));
        String realmGet$fullname = fromUser.realmGet$fullname();
        if (realmGet$fullname != null) {
            Table.nativeSetString(nativePtr, fromUserColumnInfo.fullnameIndex, createRow, realmGet$fullname, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(FromUser.class);
        long nativePtr = table.getNativePtr();
        FromUserColumnInfo fromUserColumnInfo = (FromUserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FromUser.class);
        while (it.hasNext()) {
            FromUser fromUser = (FromUser) it.next();
            if (!map.containsKey(fromUser)) {
                if (fromUser instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) fromUser;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(fromUser, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(fromUser, Long.valueOf(createRow));
                String realmGet$fullname = fromUser.realmGet$fullname();
                if (realmGet$fullname != null) {
                    Table.nativeSetString(nativePtr, fromUserColumnInfo.fullnameIndex, createRow, realmGet$fullname, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, FromUser fromUser, Map<RealmModel, Long> map) {
        if (fromUser instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) fromUser;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(FromUser.class);
        long nativePtr = table.getNativePtr();
        FromUserColumnInfo fromUserColumnInfo = (FromUserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FromUser.class);
        long createRow = OsObject.createRow(table);
        map.put(fromUser, Long.valueOf(createRow));
        String realmGet$fullname = fromUser.realmGet$fullname();
        if (realmGet$fullname != null) {
            Table.nativeSetString(nativePtr, fromUserColumnInfo.fullnameIndex, createRow, realmGet$fullname, false);
        } else {
            Table.nativeSetNull(nativePtr, fromUserColumnInfo.fullnameIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(FromUser.class);
        long nativePtr = table.getNativePtr();
        FromUserColumnInfo fromUserColumnInfo = (FromUserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FromUser.class);
        while (it.hasNext()) {
            FromUser fromUser = (FromUser) it.next();
            if (!map.containsKey(fromUser)) {
                if (fromUser instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) fromUser;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(fromUser, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(fromUser, Long.valueOf(createRow));
                String realmGet$fullname = fromUser.realmGet$fullname();
                if (realmGet$fullname != null) {
                    Table.nativeSetString(nativePtr, fromUserColumnInfo.fullnameIndex, createRow, realmGet$fullname, false);
                } else {
                    Table.nativeSetNull(nativePtr, fromUserColumnInfo.fullnameIndex, createRow, false);
                }
            }
        }
    }

    public static FromUser createDetachedCopy(FromUser fromUser, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        FromUser fromUser2;
        if (i > i2 || fromUser == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(fromUser);
        if (cacheData == null) {
            fromUser2 = new FromUser();
            map.put(fromUser, new RealmObjectProxy.CacheData(i, fromUser2));
        } else if (i >= cacheData.minDepth) {
            return (FromUser) cacheData.object;
        } else {
            cacheData.minDepth = i;
            fromUser2 = (FromUser) cacheData.object;
        }
        fromUser2.realmSet$fullname(fromUser.realmGet$fullname());
        return fromUser2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("FromUser = proxy[");
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
        C4822xab1ed299 ru_unicorn_ujin_view_fragments_makearecord_model_fromuserrealmproxy = (C4822xab1ed299) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_fragments_makearecord_model_fromuserrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_fragments_makearecord_model_fromuserrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_fragments_makearecord_model_fromuserrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
